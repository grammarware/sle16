package semantics

import helper._
import semantics.domains.SHeap._
import semantics.domains.SMem._
import semantics.domains.SpatialDesc._
import semantics.domains._
import syntax.ast._

import scala.language.higherKinds
import scalaz.Scalaz._
import scalaz._
import scalaz.concurrent.Task
import scalaz.stream._
import MatchExpr._

class SymbolicExecutor(defs: Map[Class, ClassDefinition],
                       kappa: Int = 3, delta: Int = 3, beta: Int = 5) {

  //TODO Implement clean up function of heap, that removes unneeded constraints

  def access(sym: Symbol, f: Fields, heap: SHeap):
    EitherT[Process[Task, ?], String, (SetExpr[IsSymbolic.type], SHeap)] =
    {
      for {
        (Seq(loc), nheap) <- EitherT[Process[Task, ?], String, (Seq[Loc], SHeap)](lazyInitializer.findLocs(Seq(sym), Set(), heap))
        (sdesc, nnheap) <- EitherT[Process[Task, ?], String, (SpatialDesc, SHeap)](lazyInitializer.unfold(loc, f, nheap))
        res <- EitherT[Process[Task, ?], String, (SetExpr[IsSymbolic.type], SHeap)](if (defs.childfields.contains(f))
          (sdesc.children(f), nnheap).right.point[Process[Task, ?]]
        else if (defs.reffields.contains(f))
          (sdesc.refs(f), nnheap).right.point[Process[Task, ?]]
        else s"No value for field $f".left.point[Process[Task, ?]])
      } yield res
    }

  // TODO Handle descendant constraints as well
  def disown(ee: SetExpr[IsSymbolic.type], loc: Loc, f: Fields, heap: SHeap) : SHeap =
    _sh_currentSpatial.modify(_ mapValuesWithKeys { case (loc2, sdesc) =>
        _sd_children.modify(_ mapValuesWithKeys { case (f2, ee2) =>
            if (loc2 == loc && f2 == f) ee2
            else {
              val t1opt = typeInference.inferSetType(ee, heap)
              val t2opt = typeInference.inferSetType(ee2, heap)
              t1opt.cata(t1 =>
                t2opt.cata(t2 =>
                  defs.maxClass(t1, t2).cata(_ => Diff(ee2, ee), ee2)
                , ee2)
              , ee2)
            }
        })(sdesc)
    })(heap)

  def update(sym: Symbol, f: Fields, ee: SetExpr[IsSymbolic.type], heap: SHeap): EitherT[Process[Task, ?], String, SHeap] = for {
      (Seq(loc), nheap) <- EitherT[Process[Task, ?], String, (Seq[Loc], SHeap)](lazyInitializer.findLocs(Seq(sym), Set(), heap))
      (sdesc, nnheap) <- EitherT[Process[Task, ?], String, (SpatialDesc, SHeap)](lazyInitializer.unfold(loc, f, nheap))
      res <- EitherT[Process[Task, ?], String, SHeap](if (defs.childfields.contains(f)) {
          val nnnheap = disown(ee, loc, f, nnheap)
          _sh_currentSpatial.modify(_.updated(loc, _sd_children.modify(_.updated(f, ee))(sdesc)))(nnnheap).right.point[Process0]
        }
        else if (defs.reffields.contains(f))
          _sh_currentSpatial.modify(_.updated(loc, _sd_refs.modify(_.updated(f, ee))(sdesc)))(nnheap).right.point[Process0]
        else s"No value for field $f".left.point[Process0])
    } yield res

  def execute(pres : Set[SMem], c : Statement): Process[Task, String \/ SMem] = {
    for {
      pre <- Process.emitAll(pres.toSeq)
      _ <- checkMemoryConsistency(pre).run
      res <- executeHelper(pre, c).run
    } yield res
  }


  def checkMemoryConsistency(pre: SMem): EitherT[Process[Task, ?], String, CMem] = {
    val concretised = modelFinder.concretise(pre)
    EitherT[Process[Task, ?], String, CMem](
      concretised.point[Process[Task,?]].map(_.leftMap(err => { s"Inconsistent memory: ${PrettyPrinter.pretty(pre, initial = true)}" }))
    )
  }

  def addDescendantsForLoc(loc: Loc, c: Class, mem: SMem): String \/ (SetSymbol, SMem) = {
    def addDescendantPool(descendantpools: DescendantPools, c: Class) = {
      if (descendantpools.contains(c)) (descendantpools(c), descendantpools, Map[SetSymbol, SSymbolDesc](), Set[BoolExpr[IsSymbolic.type]]())
      else {
        // TODO optimize if can't contain things of that type
        val ssym = SetSymbol(freshSym)
        val superdps = defs.supertypes(c).map(descendantpools.get).filter(_.isDefined).map(_.get)
        val subdps = defs.subtypes(c).map(descendantpools.get).filter(_.isDefined).map(_.get)
        val constraints = superdps.map(superssym => SetSubEq(ssym, superssym)).toSet[BoolExpr[IsSymbolic.type]] ++
                             subdps.map(subssym => SetSubEq(subssym, ssym)).toSet[BoolExpr[IsSymbolic.type]]
        (ssym, descendantpools + (c -> ssym), Map(ssym -> SSymbolDesc(c, Set(), ManyOpt)), constraints)
      }
    }
    for {
      sdesc <- mem.heap.currentSpatial.get(loc).cata(_.right, s"Unknown loc ${PrettyPrinter.pretty(loc)}".left)
      (ssym, newdp, newsslvtion, newpure) = addDescendantPool(sdesc.descendantpools, c)
    } yield (ssym, ((_sm_heap ^|-> _sh_ssvltion).modify(_ ++ newsslvtion) andThen
                   (_sm_heap ^|-> _sh_initSpatial).modify(_ + (loc -> _sd_descendantpools.set(newdp)(sdesc))) andThen
                   (_sm_heap ^|-> _sh_currentSpatial).modify(_ + (loc -> _sd_descendantpools.set(newdp)(sdesc))) andThen
                   (_sm_heap ^|-> _sh_pure).modify(_ ++ newpure))(mem))
  }



  private def executeHelper(pre : SMem, stmt : Statement) : EitherT[Process[Task, ?], String, SMem] = {
    // TODO parallelise using mergeN
    stmt match {
      case StmtSeq(_,ss) => ss.toList.foldLeft(EitherT[Process[Task, ?], String, SMem](pre.right.point[Process[Task, ?]])) { (memr, s) =>
        memr.flatMap { mem => executeHelper(mem, s) }
      }
      case AssignVar(_,x, e) => for {
          ee <- evalSetExpr[Process[Task, ?]](_sm_currentStack.get(pre), e)
        } yield _sm_currentStack.modify(_ + (x -> ee))(pre)
      case New(_, x, c) =>
        val post = for {
          cdef <- defs.get(c).cata(_.right, s"Unknown class: $c".left)
          xsym = freshSym
          loc = freshLoc
          alloced =
              loc -> SpatialDesc(c, Set(), ExactDesc, defs.childrenOf(defs.supertypes(c) + c).mapValues(_ => SetLit(Seq())), defs.refsOf(defs.supertypes(c) + c).mapValues(_ => SetLit(Seq())), Map())
          updated =
            (_sm_currentStack.modify(_ + (x -> SetLit(Seq(Symbol(xsym))))) andThen
            (_sm_heap ^|-> _sh_svltion).modify(_ + (Symbol(xsym) -> Loced(loc))) andThen
            (_sm_heap ^|-> _sh_locOwnership).modify(_ + (loc -> NewlyCreated)) andThen
            (_sm_heap ^|-> _sh_currentSpatial).modify(_ + alloced))(pre)
        } yield updated
        EitherT[Process[Task, ?], String, SMem](post.point[Process[Task, ?]])
      case LoadField(_, x, e, f) => for {
        eres <- evalSetExpr[Process[Task, ?]](_sm_currentStack.get(pre), e)
        (Seq(sym), _, mem) <- EitherT[Process[Task, ?], String, (Seq[Symbol], SetExpr[IsSymbolic.type], SMem)](findSyms(1, pre, eres).point[Process[Task, ?]])
        (e, nheap) <- access(sym, f, mem.heap)
      } yield (_sm_currentStack.modify(_ + (x -> e)) andThen _sm_heap.set(nheap))(mem)
      case AssignField(_, e1, f, e2) => for {
          e1res <- evalSetExpr[Process[Task, ?]](_sm_currentStack.get(pre), e1)
          (Seq(sym), _, mem) <- EitherT[Process[Task, ?], String, (Seq[Symbol], SetExpr[IsSymbolic.type], SMem)](findSyms(1, pre, e1res).point[Process[Task, ?]])
          ee2 <- evalSetExpr[Process[Task, ?]](_sm_currentStack.get(mem), e2)
          nheap <- update(sym, f, ee2, mem.heap)
        } yield _sm_heap.set(nheap)(mem)
      case If(_, cond, ts, fs) => for {
        econd <- evalBoolExpr[Process[Task, ?]](_sm_currentStack.get(pre), cond)
        newtmem = (_sm_heap ^|-> _sh_pure).modify(_ + econd)(pre)
        newfmem = (_sm_heap ^|-> _sh_pure).modify(_ + not(econd))(pre)
        execTrue =
          for {
            _ <- checkMemoryConsistency(newtmem)
            res <- executeHelper(newtmem, ts)
          } yield res
        execFalse =
          for {
            _ <- checkMemoryConsistency(newfmem)
            res <- executeHelper(newfmem, fs)
          } yield res
        res <-  EitherT[Process[Task, ?], String, SMem](execTrue.run.tee(execFalse.run)(teePlus.interleaveAll))
      } yield res
      case For(_, x, m, sb) =>
        def foreach(iteration: Int, e : SetExpr[IsSymbolic.type], state: ForState, sMem: SMem): EitherT[Process[Task, ?], String, (ForState, SMem)] = {
          EitherT[Process[Task, ?], String, (ForState, SMem)](
            (for {
              fmem <- EitherT[Process[Task, ?], String, SMem]((_sm_heap ^|-> _sh_pure).modify(_ + Eq(e, SetLit(Seq())))(sMem).right.point[Process[Task, ?]])
              _ <- checkMemoryConsistency(fmem)
            } yield (state, fmem)).run ++ (
                 if (iteration < beta) {
                   partition1(sMem, e).fold[Process[Task, String \/ (ForState, SMem)]](err => err.left.point[Process[Task, ?]], { case (sym, rest, sMem2) =>
                     state match {
                       case NormalForState =>
                         (for {
                           _ <- checkMemoryConsistency(sMem2)
                           sMem3 <- executeHelper(_sm_currentStack.modify(_.updated(x, SetLit(Seq(sym))))(sMem2), sb)
                           forres <- foreach(iteration = iteration + 1, rest.fold(SetLit(_),identity), NormalForState, sMem3)
                         } yield forres).run
                       case MatchForState(c) =>
                         (for {
                           (cont, sMem3) <- matchSym(sym, rest, c, sMem2)
                           _ <- checkMemoryConsistency(sMem3)
                           forres <- if (cont) for {
                                                 sMem4 <- executeHelper(_sm_currentStack.modify(_.updated(x, SetLit(Seq(sym))))(sMem3), sb)
                                                 forres <- foreach(iteration = iteration + 1, rest.fold(SetLit(_), identity), MatchForState(c), sMem4)
                                              } yield forres
                                    else EitherT.right[Process[Task, ?], String, (ForState, SMem)]((state, sMem3).point[Process[Task, ?]])
                         } yield forres).run
                       case MatchStarForState(c, contMatch, prevMatched, prevLocs, descendants) =>
                         (for {
                           (cont, sMem3) <- if (contMatch) matchSym(sym, rest, c, sMem2)
                                            else EitherT.right[Process[Task, ?], String, (Boolean, SMem)]((false, sMem2).point[Process[Task, ?]])
                           (Seq(loc), nheap) <- EitherT[Process[Task, ?], String, (Seq[Loc], SHeap)](
                             lazyInitializer.findLocs(Seq(sym), prevLocs, sMem3.heap) : Process[Task, String \/ (Seq[Loc], SHeap)])
                           sMem4 = _sm_heap.set(nheap)(sMem3)
                           (ssym, sMem5) <- EitherT[Process[Task, ?], String, (SetSymbol, SMem)](addDescendantsForLoc(loc, c, sMem4).point[Process[Task, ?]])
                           _ <- checkMemoryConsistency(sMem5)
                           forres <- if (cont) for {
                                       sMem6 <- executeHelper(_sm_currentStack.modify(_.updated(x, SetLit(Seq(sym))))(sMem5), sb)
                                       forres <- foreach(iteration = iteration + 1, rest.fold(SetLit(_), identity), MatchStarForState(c, cont, prevMatched + 1, prevLocs + loc, descendants :+ ssym), sMem6)
                                     } yield forres
                                     else foreach(iteration = iteration + 1, rest.fold(SetLit(_), identity), MatchStarForState(c, cont, prevMatched, prevLocs + loc, descendants :+ ssym), sMem5)
                         } yield forres).run
                     }
                 })
               } else Process.halt: Process[Task, String \/ (ForState, SMem)]
              ))
        }
        for {
          ee <- evalSetExpr[Process[Task, ?]](_sm_currentStack.get(pre), _me_e.get(m))
          (resForState, imem) <- foreach(0, ee, m match {
            case MSet(e) => NormalForState
            case Match(e, c) => MatchForState(c)
            case MatchStar(e, c) => MatchStarForState(c, true, 0, Set(), Seq())
          }, pre)
          resMem <- resForState match {
            case NormalForState => EitherT.right[Process[Task,?], String, SMem](imem.point[Process[Task, ?]])
            case MatchForState(c) => EitherT.right[Process[Task,?], String, SMem](imem.point[Process[Task, ?]])
            case MatchStarForState(c, contMatch, prevMatched, prevLocs, descendants) =>
              foreach(prevMatched, descendants.fold[SetExpr[IsSymbolic.type]](SetLit(Seq()))(Union(_,_)), NormalForState, imem).map(_._2)
          }
        } yield resMem
      case Fix(_, e, sb) =>
        def fixEqCase(bmem: SMem): EitherT[Process[Task, ?], String, SMem] = for {
            _ <- checkMemoryConsistency(bmem)
            amem <- executeHelper(bmem, sb)
            eeb <- evalSetExpr[Process[Task, ?]](_sm_currentStack.get(bmem), e)
            eea <- evalSetExpr[Process[Task, ?]](_sm_currentStack.get(amem), e)
            updatedMem = (_sm_heap ^|-> _sh_pure).modify(_ + Eq(eeb, eea))(amem)
          } yield updatedMem
        def fixNeqCase(bmem: SMem, k: Int): EitherT[Process[Task, ?], String, SMem] = for {
            _ <- checkMemoryConsistency(bmem)
            imem <- executeHelper(bmem, sb)
            eeb <- evalSetExpr[Process[Task, ?]](_sm_currentStack.get(bmem), e)
            eei <- evalSetExpr[Process[Task, ?]](_sm_currentStack.get(imem), e)
            updatedMem = (_sm_heap ^|-> _sh_pure).modify(_ + Not(Eq(eeb, eei)))(imem)
            fixmore <- if (k <= 0) fixEqCase(imem) else EitherT[Process[Task, ?],String,SMem](fixEqCase(imem).run ++ fixNeqCase(imem, k - 1).run)
          } yield fixmore
        EitherT[Process[Task, ?],String,SMem](fixEqCase(pre).run ++ fixNeqCase(pre, kappa).run)
    }
  }

  def matchSym(sym: Symbol, rest: Seq[Symbol] \/ SetSymbol, c: Class, mem: SMem): EitherT[Process[Task, ?], String, (Boolean, SMem)] = {
    for {
      symdesc <- EitherT[Process[Task, ?], String, SymbolDesc](mem.heap.svltion.get(sym).cata(_.right, s"Unknown symbol $sym".left).point[Process[Task, ?]])
      (symtype, symtn) <- symdesc match {
        case Loced(l) =>
          for {
            sdesc <- EitherT[Process[Task, ?], String, SpatialDesc](mem.heap.currentSpatial.get(l).cata(_.right, s"Unknow loc ${PrettyPrinter.pretty(l)}".left).point[Process[Task, ?]])
          } yield (sdesc.cl, sdesc.notinstof)
        case UnknownLoc(cl, notinstof) => EitherT.right[Process[Task, ?], String, (Class, Set[Class])]((cl, notinstof).point[Process[Task, ?]])
      }
      res <- if (symtn.exists(oc => defs.subtypesOrSelf(oc).contains(c))) EitherT.right[Process[Task, ?], String, (Boolean, SMem)]((false, mem).point[Process[Task, ?]])
              else if (defs.subtypesOrSelf(c).contains(symtype)) EitherT.right[Process[Task, ?], String, (Boolean, SMem)]((true, mem).point[Process[Task, ?]])
              else if (defs.maxClass(c, symtype).isDefined) {
                val truemem = (_sm_heap ^|-> _sh_svltion).modify(_.updated(sym, symdesc match {
                  case Loced(l) => symdesc // TODO Refine loc wity type?
                  case symdesc:UnknownLoc => symdesc.copy(cl = c, notinstof = symdesc.notinstof.intersect(defs.subtypesOrSelf(c)))
                }))(mem)
                val falsemem = {
                  def exludeC(sym : Symbol, symdesc : SymbolDesc, mem: SMem) = symdesc match {
                    case Loced(l) =>
                      val sdesc = mem.heap.currentSpatial(l)
                      ((_sm_heap ^|-> _sh_initSpatial).modify(_.updated(l, sdesc.copy(notinstof = sdesc.notinstof + c))) `andThen`
                        (_sm_heap ^|-> _sh_currentSpatial).modify(_.updated(l, sdesc.copy(notinstof = sdesc.notinstof + c))))(mem)
                    case symdesc:UnknownLoc =>(_sm_heap ^|-> _sh_svltion).modify(_.updated(sym, symdesc.copy(notinstof = symdesc.notinstof + c)))(mem)
                  }
                  val imem = rest.fold(syms => {
                    syms.foldLeft(mem) { (imem, sym) =>
                      val symdesc = mem.heap.svltion(sym) // TODO get safely
                      exludeC(sym, symdesc, imem)
                    }
                  }, ssym => {
                    val ssymdesc = mem.heap.ssvltion(ssym)
                    (_sm_heap ^|-> _sh_ssvltion).modify(_.updated(ssym, ssymdesc.copy(notinstof = ssymdesc.notinstof + c)))(mem)
                    }
                  )
                  exludeC(sym, symdesc, imem)
                }
                EitherT.right[Process[Task, ?], String, (Boolean, SMem)](Process((false, falsemem), (true, truemem)))
              }
              else EitherT.right[Process[Task, ?], String, (Boolean, SMem)]((false, mem).point[Process[Task, ?]])
    } yield res
  }

  private def partition1(mem: SMem, eres: SetExpr[IsSymbolic.type]): String \/ (Symbol, Seq[Symbol] \/ SetSymbol, SMem) = eres match {
    case SetLit(es) =>
      es match {
        case Seq() => s"Empty set: $eres".left
        case (x@Symbol(_)) +: xs => (x, xs.map {case x:Symbol => x}.left, mem).right[String]
      }
    case _ =>
      val nsym = Symbol(freshSym)
      val nssym = SetSymbol(freshSym)
      for {
        nsymtype <- typeInference.inferSetType(eres, mem.heap).cata(_.right, s"Empty set: $eres".left) // TODO Infer notinstof bounds as well
        nmem = ((_sm_heap ^|-> _sh_svltion).modify(_.updated(nsym, UnknownLoc(nsymtype, Set()))) andThen
                (_sm_heap ^|-> _sh_ssvltion).modify(_.updated(nssym, SSymbolDesc(nsymtype, Set(), ManyOpt))) andThen
                (_sm_heap ^|-> _sh_pure).modify(_ + Eq(ISect(SetLit(Seq(nsym)), nssym), SetLit(Seq())) + Eq(Union(SetLit(Seq(nsym)), nssym), eres)))(mem)
      } yield (nsym, nssym.right, nmem)
  }

  private def findSyms(count: Int, mem: SMem, eres: SetExpr[IsSymbolic.type]): String \/ (Seq[Symbol], SetExpr[IsSymbolic.type], SMem) = {
    def cardMatches(crd: Cardinality, count: Symbols) = crd match {
      case ManyReq => 1 <= count
      case Req => count == 1
      case ManyOpt => true
      case Opt => count <= 1
    }
    eres match {
      case SetLit(syms) =>
        if (syms.length == count) (syms.map {case s:Symbol => s}, eres, mem).right[String]
        else s"Mismatch between count of ${PrettyPrinter.pretty(eres)} and needed count $count".left
      case ee =>
        val nsyms = Seq.fill(count)(Symbol(freshSym))
        for {
          nsymtype <- typeInference.inferSetType(ee, mem.heap).cata(_.right, s"Empty set $eres".left)
          nmem = ((_sm_heap ^|-> _sh_svltion).modify(_ ++ nsyms.map(_ -> UnknownLoc(nsymtype, Set()))) andThen
                      (_sm_heap ^|-> _sh_pure).modify(_ + Eq(SetLit(nsyms), ee)))(mem)
          concretise <- modelFinder.concretise(nmem)
        } yield (nsyms, eres, nmem)
    }
  }

  def evalSetExpr[M[_] : Monad](s : SStackState, e : SetExpr[IsProgram.type]) : EitherT[M, String, SetExpr[IsSymbolic.type]] = {
      e match {
        case SetLit(es) =>
          assert (es.isEmpty)
          EitherT.right[M, String, SetExpr[IsSymbolic.type]]((SetLit(Seq()) : SetExpr[IsSymbolic.type]).point[M])
        case Var(name) =>
          EitherT(s.get(name).cata(_.right, s"Error while evaluating expression $e".left).point[M])
        case Diff(e1, e2) => for {
          ee1 <- evalSetExpr[M](s, e1)
          ee2 <- evalSetExpr[M](s, e2)
        } yield Diff(ee1, ee2)
        case Union(e1, e2) => for {
          ee1 <- evalSetExpr[M](s, e1)
          ee2 <- evalSetExpr[M](s, e2)
        } yield Union(ee1, ee2)
        case ISect(e1, e2) => for {
          ee1 <- evalSetExpr[M](s, e1)
          ee2 <- evalSetExpr[M](s, e2)
        } yield ISect(ee1, ee2)
      }
    }

  def evalBoolExpr[M[_] : Monad](st : SStackState, sp : BoolExpr[IsProgram.type]) : EitherT[M, String, BoolExpr[IsSymbolic.type]] = sp match {
    case Eq(e1, e2) =>
      for {
        ee1 <- evalSetExpr[M](st, e1)
        ee2 <- evalSetExpr[M](st, e2)
      } yield Eq(ee1, ee2)
    case Not(p) =>
      for {
        ep <- evalBoolExpr[M](st, p)
      } yield Not(ep)
    case True() => EitherT((True() : BoolExpr[IsSymbolic.type]).right[String].point[M])
    case And(p1, p2) =>
      for {
        ep1 <- evalBoolExpr[M](st, p1)
        ep2 <- evalBoolExpr[M](st, p2)
      } yield And(ep1, ep2)
    case SetSubEq(e1, e2) =>
      for {
        ee1 <- evalSetExpr[M](st, e1)
        ee2 <- evalSetExpr[M](st, e2)
      } yield SetSubEq(ee1, ee2)
    case BagSubEquiv(_, e1, e2) =>
      for {
        ee1 <- evalSetExpr[M](st, e1)
        ee2 <- evalSetExpr[M](st, e2)
      } yield BagSubEquiv[Option[Any], IsSymbolic.type](None, ee1, ee2)
  }


  private val locCounter = Counter(0)

  private def freshLoc = Loc(locCounter.++)

  private val symCounter = Counter(0)

  private def freshSym: Symbols = symCounter.++

  val lazyInitializer = new LazyInitializer(symCounter, locCounter, defs, optimistic = false)

  val modelFinder = new ModelFinder(defs, delta)

  val typeInference = modelFinder.typeInference
}
