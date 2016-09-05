package semantics

import domains._
import semantics.domains.SMem._
import syntax.ast.Statement.{NoMI, MI}
import syntax.ast._
import scalaz._, Scalaz._

object PrettyPrinter {

  def pretty(stack: SStackState): String = s"σ# = [${stack.map {case (vr, e) => s"$vr ↦ ${pretty(e)}"}.mkString(", ")}]"

  private val symbs = "abcdefghijklmnopqrstuvwxyz"

  private def prettySymb(ident : Int) : String = {
    val l = symbs.length
    val j = {
      val j = ident % l
      if (j < 0) j + l else j
    }
    val i = ident / l
    s"${symbs(j)}${if (ident >= 0) if (i == 0) "" else s"_$i?" else "_in?"}"
  }

  def pretty(minf: Statement.MetaInf): String = minf match {
    case MI(uid) => s"$uid: "
    case NoMI => ""
  }


  def pretty(s : Statement, short: Boolean): String = {
    def prettyHelper(s : Statement, indent: Int): String = {
      def indented(str: String): String = if(short) str else " " * indent + str
      s match {
        case StmtSeq(metaInf, ss) =>
          if (ss.isEmpty) indented("skip")
          else if (short) s"${prettyHelper(ss.head, indent)}; ..."
          else ss.map(s => prettyHelper(s, indent)).mkString(";")
        case AssignVar(metaInf, x, e) => indented(s"${pretty(metaInf)}$x := ${pretty(e)}")
        case LoadField(metaInf, x, e, f) => indented(s"${pretty(metaInf)}$x := ${pretty(e)}.$f")
        case New(metaInf, x, c) => indented(s"${pretty(metaInf)}$x := new ${c.name}")
        case AssignField(metaInf, e1, f, e2) => indented(s"${pretty(metaInf)}${pretty(e1)}.$f := ${pretty(e2)}")
        case If(metaInf, cond, ts, fs) =>
          val ifHead = indented(s"if ${pretty(cond)} then")
          if (short) s"${pretty(metaInf)}$ifHead ..."
          else
            s"""
               |${"  " * indent}${pretty(metaInf)}
               |$ifHead
               |${prettyHelper(ts, indent = indent + 1)}
               |${"  " * indent}else
               |${prettyHelper(fs, indent = indent + 1)}""".stripMargin
        case For(metaInf, x, m, sb) =>
          val forHead = indented(s"foreach $x ∈ ${pretty(m)} do")
          if (short) s"${pretty(metaInf)}$forHead ..."
          else
            s"""
               |${"  " * indent}${pretty(metaInf)}
               |$forHead
               |${prettyHelper(sb, indent = indent + 1)}""".stripMargin
        case Fix(metaInf, e, sb) =>
          val fixHead = indented(s"fix ${pretty(e)} do")
          if (short) s"${pretty(metaInf)}$fixHead ..."
          else
            s"""
               |${"  " * indent}${pretty(metaInf)}
               |$fixHead
               |${prettyHelper(sb, indent = indent + 1)}""".stripMargin
      }
    }
    prettyHelper(s, 0)
  }

  def pretty[T <: ASTType](e : BasicExpr[T]): String = {
    e match {
      case Symbol(ident) => prettySymb(ident)
    }
  }

  def pretty[T <: ASTType](e : SetExpr[T]): String = {
    e match {
      case SetSymbol(ident) => s"${prettySymb(ident).toUpperCase}"
      case Var(name) => name
      case SetLit(es) => if (es.length <= 0) "∅" else s"{${es.map(pretty[T]).mkString(", ")}}"
      case Union(e1, e2) => s"(${pretty[T](e1)} ∪ ${pretty[T](e2)})"
      case Diff(e1, e2) => s"(${pretty[T](e1)} ∖ ${pretty[T](e2)})"
      case ISect(e1, e2) => s"(${pretty[T](e1)} ∩ ${pretty[T](e2)})"
    }
  }

  def pretty(m : MatchExpr): String = m match {
    case MSet(e) => pretty(e)
    case Match(e, c) => s"${pretty(e)} match ${c.name}"
    case MatchStar(e, c) => s"${pretty(e)} match* ${c.name}"
  }

  def pretty[T <: ASTType](sp: BoolExpr[T]): String = sp match {
    case Eq(e1, e2) => s"(${pretty(e1)} = ${pretty(e2)})"
    case SetSubEq(e1, e2) => s"(${pretty(e1)} ⊆ ${pretty(e2)})"
    case True() => "true"
    case And(e1, e2) => s"(${pretty[T](e1)} ∧ ${pretty[T](e2)})"
    case BagSubEquiv(_, e1, e2) => s"(${pretty(e1)} ⫉ ${pretty(e2)})"
    case Not(p) => p match {
      case Eq(e1, e2) => s"(${pretty(e1)} ≠ ${pretty(e2)})"
      case SetSubEq(e1, e2) => s"(${pretty(e1)} ⊈ ${pretty(e2)})"
      case BagSubEquiv(_, e1, e2) => s"¬(${pretty(e1)} ⫉ ${pretty(e2)})"
      case True() => "false"
      case And(e1@Not(_), e2@Not(_))
         => s"(${pretty[T](e1)} ∨ ${pretty[T](e2)})"
      case And(e1, e2) => s"¬(${pretty[T](e1)} ∧ ${pretty[T](e2)})"
      case Not(be) => s"${pretty[T](be)}"
    }
  }

  def pretty(pure: Prop): String = pure.map(pretty[IsSymbolic.type]).mkString(" ∧ ")

  def pretty(loc: Loc): String = s"⟪${loc.id}⟫"

  def pretty(spatial : Spatial)(implicit d : DummyImplicit) : String = {
    val (types, links, descendantpools) = spatial.map { case (loc, sdesc) =>
        val typeinfo = sdesc.desctype match {
          case ExactDesc => s"${pretty(loc)} : ${sdesc.cl.name}"
          case AbstractDesc => s"${pretty(loc)} <: ({${sdesc.cl.name}}, ${sdesc.notinstof.map(_.name).mkString("{", ",", "}")})"
          case PartialDesc(hasExact, possible) =>
            val all = possible ++ (if (hasExact) Set(sdesc.cl) else Set())
            s"${pretty(loc)} <: (${all.map(_.name).mkString("{", ",", "}")}, ${sdesc.notinstof.map(_.name).mkString("{", ",", "}")})"
        }
        val refs = sdesc.refs.map { case (f, e) => s"${pretty(loc)}.$f ↝ ${pretty(e)}" }
        val children = sdesc.children.map { case (f, e) => s"${pretty(loc)}.$f ⤞ ${pretty(e)}" }
        val dps = sdesc.descendantpools.map { case (c, e) => s"${pretty(loc)}∇${c.name} = ${pretty(e)}" }
        (typeinfo, refs ++ children, dps)
    }.unzip3
    s"Γ# = ${types.mkString("[", ",", "]")}; " +
      s"ℓ# = ${links.flatten.mkString("[", ",", "]")}; " +
        s"∂# = ${descendantpools.flatten.mkString("[", ",", "]")}"
  }

  def pretty[T <: ASTType](loc : Loc, f : Fields, sep : String, e : SetExpr[T]): String =
    s"${pretty(loc)}.$f $sep ${pretty(e)}"

  def pretty(crd: Cardinality): String = crd match {
    case ManyReq => "+"
    case Req => ""
    case ManyOpt => "*"
    case Opt => "?"
  }

  def pretty(ssymdesc: SSymbolDesc): String = s"${ssymdesc.cl.name}${pretty(ssymdesc.crd)}"

  def pretty(ssvltion: SetSymbolValuation)(implicit d: DummyImplicit, d2: DummyImplicit): String =
    s"[${ssvltion.map {case (ssym, ssymdesc) => s"${pretty(ssym)} ↦ ${pretty(ssymdesc)}"}.mkString(", ")}]"

  def pretty(ownership: Ownership): String = ownership match {
    case NewlyCreated => "new"
    case Unfolded => "-"
  }

  def pretty(symdesc: SymbolDesc): String = symdesc match {
    case Loced(l) => pretty(l)
    case UnknownLoc(cl, notinstof) => s"(${cl.name}, ${notinstof.map(_.name).mkString("{", ",", "}")})"
  }

  def pretty(ssvltion: SymbolValuation)(implicit d: DummyImplicit, d2: DummyImplicit, d3: DummyImplicit): String =
    s"[${ssvltion.map {case (sym, symdesc) => s"${pretty(sym)} ↦ ${pretty(symdesc)}"}.mkString(", ")}]"

  def pretty(locOwnership: LocOwnership)(implicit d: DummyImplicit, d2: DummyImplicit, d3: DummyImplicit, d4:DummyImplicit): String =
    s"[${locOwnership.map {case (loc, ownership) => s"${pretty(loc)} ↦ ${pretty(ownership)}"}.mkString(", ")}]"

  def pretty(heap : SHeap, initial: Boolean): String =
    sep(sep(sep(sep(pretty(heap.ssvltion) , ";", pretty(heap.svltion)), ";", pretty(heap.locOwnership)), ";", s"${pretty(if (initial) heap.initSpatial else heap.currentSpatial)}"), "∧", s"(${pretty(heap.pure)})")

  def pretty(mem : SMem, initial: Boolean): String =
    sep(s"${pretty(if (initial) _sm_initStack.get(mem) else _sm_currentStack.get(mem))}", ";", s"${pretty(mem.heap, initial)}")

  def sep(s1 : String, ss : String, s2 : String) =
    if (s2.trim.isEmpty) s1
    else if (s1.trim.isEmpty) s2
    else s"$s1 $ss $s2"

  def default(s : String, sd : String) =
    if (s.trim.isEmpty) sd else s
}
