package semantics

import scala.language.postfixOps
import scala.language.higherKinds

import semantics.domains._
import semantics.domains.CMem._
import semantics.domains.CHeap._

import syntax.ast._
import syntax.ast.Statement.BranchPoint

import scalaz._, Scalaz._
import scalaz.stream._, scalaz.concurrent.Task
import scala.concurrent.stm._
import helper._

class ConcreteExecutor(defs: Map[Class, ClassDefinition], _prog: Statement, excludedBranches: Set[BranchPoint] = Set()) {
  val prog = Statement.annotateUids(_prog)

  val progBranches = Statement.branches(prog)

  private val _stmtCoverageMap = TMap.empty[Integer, Boolean]
  private val _branchCoverageMap = TMap(progBranches.flatMap(_._2).map(_ -> false).toSeq : _*)

  def stmtCoverageMap = Map(_stmtCoverageMap.single.toSeq: _*)
  def branchCoverageMap = Map(_branchCoverageMap.single.toSeq: _*)

  def coverage: Double = {
    val coveredBranches = branchCoverageMap.filter(_._2).keySet
    val allBranches     = progBranches.values.flatMap(_.toSet).toSet diff excludedBranches
    val coveredStatements = stmtCoverageMap.filterKeys(stmtCoverageMap).keySet
    if (allBranches.nonEmpty) coveredBranches.size * 100.0 / allBranches.size else
      if (coveredStatements.nonEmpty) 100.0 else 0.0
  }

  def uncoveredBranches = {
    val coveredBranches = branchCoverageMap.filter(_._2).keySet
    val allBranches     = progBranches.values.flatMap(_.toSet).toSet diff excludedBranches
    allBranches diff coveredBranches
  }

  def execute(mem: CMem): String \/ CMem = executeStmt(mem, prog)

  //TODO Check for type and ownership constraints
  private def executeStmt(mem: CMem, s: Statement): String \/ CMem = {
    val uid = Statement._stmt_uid.getOption(s).get
    atomic { implicit txn =>
      _stmtCoverageMap.put(uid, true)
    }
    s match {
      case StmtSeq(_, ss) =>
        ss.toList.foldLeft[String \/ CMem](mem.right) {
          (memr, s) => memr flatMap { mem => executeStmt(mem, s) }
        }
      case AssignVar(_, x, e) =>
        for {
          os <- evalExpr(e, mem.stack)
        } yield _cm_stack.modify(_.updated(x, os))(mem)
      case LoadField(_, x, e, f) => for {
        os <- evalExpr(e, mem.stack)
        o <- os.single.cata(_.right, s"Not a single object $os".left)
        os2 <- access(o, f, mem.heap)
      } yield _cm_stack.modify(_.updated(x, os2))(mem)
      case New(_, x, c) => for {
        defc <- defs.get(c).cata(_.right, s"Unknown class $c".left)
        o = freshInstance
        ocs = defs.childrenOf(defs.supertypes(c) + c).mapValues(_ => Set[Instances]())
        ors = defs.refsOf(defs.supertypes(c) + c).mapValues(_ => Set[Instances]())
      } yield (_cm_stack.modify(_.updated(x, Set(o))) `andThen`
                _cm_heap.modify(
                  _ch_typeenv.modify(_.updated(o, c)) `andThen`
                    _ch_childenv.modify(_.updated(o, ocs)) `andThen`
                    _ch_refenv.modify(_.updated(o, ors))))(mem)
      case AssignField(_, e1, f, e2) => for {
        os <- evalExpr(e1, mem.stack)
        o <- os.single.cata(_.right, s"Not a single object $os".left)
        os2 <- evalExpr(e2, mem.stack)
        h2 <- update(o, f, os2, mem.heap)
      } yield mem |> _cm_heap.set(h2)
      case If(_, cond, ts, fs) =>
        for {
          econd <- evalBoolExpr(cond, mem)
          res <- if (econd) {
            _branchCoverageMap.updateValue(BranchPoint(uid, 0), _ => true)
            executeStmt(mem, ts)
          } else {
            _branchCoverageMap.updateValue(BranchPoint(uid, 1), _ => true)
            executeStmt(mem, fs)
          }
        } yield res
      case For(_, x, m, sb) => for {
        os <- evalMatchExpr(m, mem.stack, mem.heap)
        res <- {
          os.size match {
            case 0 => _branchCoverageMap.updateValue(BranchPoint(uid, 0), _ => true)
            case 1 => _branchCoverageMap.updateValue(BranchPoint(uid, 1), _ => true)
            case _ => _branchCoverageMap.updateValue(BranchPoint(uid, 2), _ => true)
          }
          os.foldLeft[String \/ CMem](mem.right) { (memr, o) =>
            memr flatMap { mem =>
              val newmem = mem |> _cm_stack.modify(_.updated(x, Set(o)))
              executeStmt(newmem, sb)
            }
          }
        }
      } yield res
      case Fix(_, e, sb) =>
        def fix(prev: Set[Instances], mem: CMem, iteration: Int = 0): String \/ CMem =  {
          for {
            nmem <- executeStmt(mem, sb)
            ee <- evalExpr(e, nmem.stack)
            fixed <- bagEquivalent(mem, nmem, prev, ee)
            res <- if (fixed) {
              iteration match {
                case 0 => _branchCoverageMap.updateValue(BranchPoint(uid, 0), _ => true)
                case _ => _branchCoverageMap.updateValue(BranchPoint(uid, 1), _ => true)
              }
              nmem.right
            } else {
              fix(ee, nmem, iteration = iteration + 1)
            }
          } yield res
        }
        for {
          ee <- evalExpr(e, mem.stack)
          res <- fix(ee, mem)
        } yield res
    }
  }

  private def access(o: Instances, f: Fields, h: CHeap): String \/ Set[Instances] = {
    if (defs.childfields.contains(f))
      h.childenv.get(o).flatMap(_.get(f))
        .cata(_.right, s"Child $f of object $o is not allocated".left)
    else if (defs.reffields.contains(f))
      h.refenv.get(o).flatMap(_.get(f))
        .cata(_.right, s"Reference $f of object $o is not allocated".left)
    else s"$f neither a child nor reference".left
  }

  private def disown(h: CHeap, os2: Set[Instances]): CHeap = {
    h |> _ch_childenv.modify(_.mapValues(_.mapValues(os => os diff os2)))
  }

  private def update(o: Instances, f: Fields, os2: Set[Instances], h: CHeap): String \/ CHeap = {
    if (defs.childfields.contains(f))
      for {
        cs <- h.childenv.get(o).cata(_.right, s"Unknown object $o".left)
        _ <- cs.get(f).cata(_.right, s"Unknown child $f of object o ${h.typeenv(o).name}".left)
      } yield h |>
        (nh => disown(nh, os2)) |>
        _ch_childenv.modify(_.updated(o, cs.updated(f, os2)))
    else if (defs.reffields.contains(f))
      for {
        rs <- h.refenv.get(o).cata(_.right, s"Unknown object $o".left)
        _ <- rs.get(f).cata(_.right, s"Unknown reference $f of object $o of type ${h.typeenv(o).name}".left)
      } yield h |> _ch_refenv.modify(_.updated(o, rs.updated(f, os2)))
    else s"$f neither a child nor reference".left
  }

  private def evalExpr(e: SetExpr[IsProgram.type], stack: CStack): String \/ Set[Instances] = e match {
    case SetLit(es) =>
      assert(es.isEmpty)
      Set[Instances]().right[String]
    case Union(e1, e2) => for {
      os1 <- evalExpr(e1, stack)
      os2 <- evalExpr(e2, stack)
    } yield os1 union os2
    case Diff(e1, e2) => for {
      os1 <- evalExpr(e1, stack)
      os2 <- evalExpr(e2, stack)
    } yield os1 diff os2
    case ISect(e1, e2) => for {
      os1 <- evalExpr(e1, stack)
      os2 <- evalExpr(e2, stack)
    } yield os1 intersect os2
    case Var(name) => stack.get(name).cata(_.right, s"Unknown variable $name".left)
  }

  def instanceEquivalent(meml: CMem, memr: CMem, ol: Instances, or: Instances): String \/ Boolean = {
    for {
      tl <- meml.heap.typeenv.get(ol).cata(_.right, s"${meml.heap} does not have object $ol".left)
      tr <- memr.heap.typeenv.get(or).cata(_.right, s"${memr.heap} does not have object $ol".left)
      res <-
      if (tl != tr) false.right
      else {
        val cs = defs.childrenOf(defs.supertypes(tl) + tl).keySet
        val rs = defs.refsOf(defs.supertypes(tl) + tl).keySet
        for {
          cequiv <-
          cs.allM[String \/ ?](f => for {
            olf <- meml.heap.childenv.get(ol).flatMap(_.get(f)).cata(_.right, s"${meml.heap} does not have child $f of $ol".left)
            orf <- memr.heap.childenv.get(or).flatMap(_.get(f)).cata(_.right, s"${memr.heap} does not have child $f of $or".left)
            fequiv <- bagEquivalent(meml, memr, olf, orf)
          } yield fequiv)
          req <-
          rs.allM[String \/ ?](f => for {
            olf <- meml.heap.refenv.get(ol).flatMap(_.get(f)).cata(_.right, s"${meml.heap} does not have reference $f of $ol".left)
            orf <- memr.heap.refenv.get(or).flatMap(_.get(f)).cata(_.right, s"${memr.heap} does not have reference $f of $or".left)
          } yield olf == orf)
        } yield cequiv && req
      }
    } yield res
  }

  def subBagEquivalent(meml: CMem, memr: CMem, osl: Set[Instances], osr: Set[Instances]): String \/ Boolean = {
    if (osl.isEmpty) true.right
    else {
      val ol = osl.head
      osr.findMapM[String \/ ?, Instances] { or =>
        for {
          equiv <- instanceEquivalent(meml, memr, ol, or)
        } yield if (equiv) or.some else none
      }.flatMap(_.cata(or => subBagEquivalent(meml, memr, osl.tail, osr - or), false.right[String]))
    }
  }

  def bagEquivalent(meml: CMem, memr: CMem, osl: Set[Instances], osr: Set[Instances]): String \/ Boolean = {
    for {
      sbequivl <- subBagEquivalent(meml, memr, osl, osr)
      sbequivr <- subBagEquivalent(memr, meml, osr, osl)
    } yield sbequivl && sbequivr
  }

  private def evalBoolExpr(b: BoolExpr[IsProgram.type], mem: CMem): String \/ Boolean = {
    b match {
      case Eq(e1, e2) => for {
        os1 <- evalExpr(e1, mem.stack)
        os2 <- evalExpr(e2, mem.stack)
      } yield os1 == os2
      case SetSubEq(e1, e2) => for {
        os1 <- evalExpr(e1, mem.stack)
        os2 <- evalExpr(e2, mem.stack)
      } yield os1 subsetOf os2
      case BagSubEquiv(_, e1, e2) => for {
        os1 <- evalExpr(e1, mem.stack)
        os2 <- evalExpr(e2, mem.stack)
        res <- subBagEquivalent(mem, mem, os1, os2)
      } yield res
      case True() => true.right
      case And(b1, b2) => for {
        bb1 <- evalBoolExpr(b1, mem)
        bb2 <- evalBoolExpr(b2, mem)
      } yield bb1 && bb2
      case Not(b) => for {
        bb <- evalBoolExpr(b, mem)
      } yield !bb
    }
  }

  // TODO Convert use of set to use of Process (making it lazy)
  private def evalMatchExpr(m: MatchExpr, stack: CStack, heap: CHeap): String \/ Set[Instances] = {
    def match_it(os_types: Set[(Instances, Class)], c: Class): Set[Instances] = {
      os_types.filter(oc => defs.subtypesOrSelf(c).contains(oc._2)).map(_._1)
    }
    def descendants_or_selves(os: Set[Instances]): String \/ Set[Instances] = {
      if (os.isEmpty) os.right
      else for {
        cos <- os.traverseU(o =>
          heap.childenv.get(o).cata(
            _.values.toSet.flatten.right,
            s"Unknown instance $o".left
          )).map(_.flatten)
        dos <- descendants_or_selves(cos)
      } yield os ++ dos
    }
    m match {
      case MSet(e) => evalExpr(e, stack)
      case Match(e, c) => for {
        defc <- defs.get(c).cata(_.right, s"Unknown class $c".left)
        os <- evalExpr(e, stack)
        os_types <- os.traverseU(o => heap.typeenv.get(o).cata(t => (o, t).right, s"Unknown instance $o".left))
      } yield match_it(os_types, c)
      case MatchStar(e, c) => for {
        defc <- defs.get(c).cata(_.right, s"Unknown class $c".left)
        os <- evalExpr(e, stack)
        dos <- descendants_or_selves(os)
        dos_types <- dos.traverseU(o => heap.typeenv.get(o).cata(t => (o, t).right, s"Unknown instance $o".left))
      } yield match_it(dos_types, c)
    }
  }

  private val symCounter = Counter(0)

  private def freshInstance: Instances = symCounter.++
}
