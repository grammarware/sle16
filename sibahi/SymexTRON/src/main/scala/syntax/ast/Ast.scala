package syntax.ast

import helper.Counter
import monocle.Lens
import monocle.macros.{GenLens, GenPrism}

import scala.language.higherKinds
import scalaz.{Node => _}

case class Class(name: String)

sealed trait Cardinality { def isOptional: Boolean }
case object Req extends Cardinality { def isOptional = false }
case object ManyReq extends Cardinality { def isOptional = false}
case object Opt extends Cardinality { def isOptional = true }
case object ManyOpt extends Cardinality { def isOptional = true }

sealed trait FieldType
case object Ordinary extends FieldType
case object Tracking extends FieldType
case class Bidirectional(oppositeOf: Fields) extends FieldType

case class FieldDefinition(`class`: Class, card: Cardinality, fieldtype: FieldType)

// We only support single inheritance
case class ClassDefinition(name: String, children: Map[Fields, FieldDefinition],
                           refs: Map[Fields, FieldDefinition], superclass: Option[Class] = None, isStandalone: Boolean = false, isAbstract: Boolean = false)

sealed trait ASTType {
  type Elim[+S, +P]
}
case object IsSymbolic extends ASTType {
  type Elim[+S, +P] = S
}
case object IsProgram extends ASTType {
  type Elim[+S, +P] = P
}
object ASTType {
  implicit val isProgram: IsProgram.type = IsProgram
  implicit val isSymbolic: IsSymbolic.type = IsSymbolic

  def elim[T <: ASTType, S, P](s : S, p : P)(implicit t: T): T#Elim[S, P] = t match {
    case IsProgram => p.asInstanceOf[T#Elim[S, P]] // Cast should be safe
    case IsSymbolic => s.asInstanceOf[T#Elim[S, P]]
  }

  def unelim[T <: ASTType, S, P, Q](e : T#Elim[S, P], f: S => Q, g: P => Q)(implicit t: T): Q = t match {
    case IsSymbolic => f(e.asInstanceOf[S])
    case IsProgram => g(e.asInstanceOf[P])
  }
}

sealed trait BasicExpr[T <: ASTType]
case class Symbol(id: Symbols) extends BasicExpr[IsSymbolic.type]

sealed trait SetExpr[T <: ASTType]
case class SetLit[T <: ASTType](es: Seq[BasicExpr[T]]) extends SetExpr[T]
case class Union[T <: ASTType](e1 : SetExpr[T], e2 : SetExpr[T]) extends SetExpr[T]
case class Diff[T <: ASTType](e1 : SetExpr[T], e2 : SetExpr[T]) extends SetExpr[T]
case class ISect[T <: ASTType](e1 : SetExpr[T], e2 : SetExpr[T]) extends SetExpr[T]
case class Var(name: Vars) extends SetExpr[IsProgram.type]
case class SetSymbol(id: Symbols) extends SetExpr[IsSymbolic.type]

sealed trait BoolExpr[T <: ASTType]
case class Eq[T <: ASTType](e1: SetExpr[T], e2: SetExpr[T]) extends BoolExpr[T]
case class SetSubEq[T <: ASTType](e1: SetExpr[T], e2: SetExpr[T]) extends BoolExpr[T]
case class And[T <: ASTType](b1: BoolExpr[T], b2: BoolExpr[T]) extends BoolExpr[T]
case class True[T <: ASTType]() extends BoolExpr[T]
case class Not[T <: ASTType](b: BoolExpr[T]) extends BoolExpr[T]
case class BagSubEquiv[+A, T <: ASTType](ctxt: T#Elim[Option[A], Unit], e1: SetExpr[T], e2: SetExpr[T]) extends BoolExpr[T]

sealed trait MatchExpr
case class MSet(e : SetExpr[IsProgram.type]) extends MatchExpr
case class Match(e : SetExpr[IsProgram.type], c : Class) extends MatchExpr
case class MatchStar(e : SetExpr[IsProgram.type], c : Class) extends MatchExpr

object MatchExpr {
  val _me_e = Lens[MatchExpr, SetExpr[IsProgram.type]]({
      case MSet(e) => e
      case Match(e, c) => e
      case MatchStar(e, c) => e
    })(newe => {
      case MSet(e) => MSet(newe)
      case Match(e, c) => Match(newe, c)
      case MatchStar(e, c) => MatchStar(newe, c)
    })
}

sealed trait Statement
case class StmtSeq(metaInf: Statement.MetaInf, ss : Seq[Statement])
  extends Statement
case class AssignVar(metaInf: Statement.MetaInf, x : Vars, e : SetExpr[IsProgram.type])
  extends Statement
case class LoadField(metaInf: Statement.MetaInf, x : Vars, e : SetExpr[IsProgram.type], f : Fields)
  extends Statement
case class New(metaInf: Statement.MetaInf, x : Vars, c : Class)
  extends Statement
case class AssignField(metaInf: Statement.MetaInf, e1 : SetExpr[IsProgram.type], f : Fields, e2 : SetExpr[IsProgram.type])
  extends Statement
case class If(metaInf: Statement.MetaInf, cond: BoolExpr[IsProgram.type], ts : Statement, fs : Statement)
  extends Statement
case class For(metaInf: Statement.MetaInf, x: Vars, m: MatchExpr, sb: Statement)
  extends Statement
case class Fix(metaInf: Statement.MetaInf, e : SetExpr[IsProgram.type], sb: Statement)
  extends Statement

object Statement {
  sealed trait MetaInf
  case class MI(uid: Integer) extends MetaInf
  case object NoMI extends MetaInf

  val _stmt_metaInf = Lens[Statement, MetaInf]({
        case s: StmtSeq => s.metaInf
        case s: AssignVar => s.metaInf
        case s: LoadField => s.metaInf
        case s: New => s.metaInf
        case s: AssignField => s.metaInf
        case s: If => s.metaInf
        case s: For => s.metaInf
        case s: Fix => s.metaInf
  })(nminf => {
        case s: StmtSeq => s.copy(metaInf = nminf)
        case s: AssignVar => s.copy(metaInf = nminf)
        case s: LoadField => s.copy(metaInf = nminf)
        case s: New => s.copy(metaInf = nminf)
        case s: AssignField => s.copy(metaInf = nminf)
        case s: If => s.copy(metaInf = nminf)
        case s: For => s.copy(metaInf = nminf)
        case s: Fix => s.copy(metaInf = nminf)
    })

  private val _stmt_mi = _stmt_metaInf composePrism GenPrism[MetaInf, MI]
  val _stmt_uid = _stmt_mi composeLens GenLens[MI](_.uid)

  def stmtSeq(ss : Statement*) : Statement = StmtSeq(NoMI, ss)
  def assignVar(x : Vars, e : SetExpr[IsProgram.type]) : Statement = AssignVar(NoMI, x, e)
  def loadField(x : Vars, e : SetExpr[IsProgram.type], f : Fields) : Statement = LoadField(NoMI, x, e, f)
  def `new`(x : Vars, c : Class) : Statement = New(NoMI, x, c)
  def assignField(e1 : SetExpr[IsProgram.type], f : Fields, e2 : SetExpr[IsProgram.type]) : Statement = AssignField(NoMI, e1, f, e2)
  def `if`(cond: BoolExpr[IsProgram.type], ts : Statement, fs : Statement) : Statement = If(NoMI, cond, ts, fs)
  def `for`(x : Vars, m : MatchExpr, s : Statement) : Statement = For(NoMI, x, m, s)
  def fix(e : SetExpr[IsProgram.type], s : Statement) : Statement = Fix(NoMI, e, s)

  def annotateUids(s : Statement) : Statement = {
    val counter = Counter(0)
    def annotateUidH(s : Statement) : Statement = {
      val sMInf = MI(counter.++)
      s match {
        case StmtSeq(_, ss) => StmtSeq(sMInf, ss.map(annotateUidH))
        case AssignVar(_, x, e) => AssignVar(sMInf, x, e)
        case LoadField(_, x, e, f) => LoadField(sMInf, x, e, f)
        case New(_, x, c) => New(sMInf, x, c)
        case AssignField(_, e1, f, e2) => AssignField(sMInf, e1, f, e2)
        case If(_, cond, ts, fs) => If(sMInf, cond, annotateUidH(ts), annotateUidH(fs))
        case For(_, x, m, sb) => For(sMInf, x, m, annotateUidH(sb))
        case Fix(_, e, sb) => Fix(sMInf, e, annotateUidH(sb))
      }
    }
    annotateUidH(s)
  }

  case class BranchPoint(stmt_uid: Integer, branch_number: Integer)

  def branches(s : Statement) : Map[Integer, List[BranchPoint]] = {
    val uid = _stmt_uid.getOption(s).get
    s match {
      case If(_, cond, ts, fs) => Map(uid -> (for (i <- 0 to 1) yield BranchPoint(uid, i)).toList) ++ branches(ts) ++ branches(fs)
      case For(_, _, _, sb) => Map(uid -> (for (i <- 0 to 2) yield BranchPoint(uid, i)).toList) ++
                                  branches(sb)
      case Fix(_, _, sb) => Map(uid -> (for (i <- 0 to 1) yield BranchPoint(uid, i)).toList) ++
                                  branches(sb)
      case StmtSeq(_, ss) => ss.map(branches).fold(Map.empty[Integer, List[BranchPoint]])(_ ++ _)
      case _ => Map(uid -> List())
    }
  }
}
