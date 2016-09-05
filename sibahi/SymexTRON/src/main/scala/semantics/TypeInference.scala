package semantics

import semantics.domains.{UnknownLoc, Loced, SHeap}
import syntax.ast._
import scalaz.Scalaz.none
import scalaz.syntax.std.option._

/**
  * Created by asal on 24/01/2016.
  */
class TypeInference(defs: Map[Class, ClassDefinition]) {


  // TODO Calculate set of types instead and include notinstof to get complete bounds
  def inferSetType(ee : SetExpr[IsSymbolic.type], heap: SHeap): Option[Class] = ee match {
    case SetLit(es) => es match {
      case Seq() => none
      case (sym:Symbol) +: oes => inferSetLitType(sym, oes, heap).some
    }
    case Union(e1, e2) =>
      val t1opt = inferSetType(e1, heap)
      val t2opt = inferSetType(e2, heap)
      t1opt.cata(t1 =>
        t2opt.cata(t2 =>
          defs.lub(t1, t2).some,
          t1.some
        ), t2opt
      )
    case Diff(e1, e2) =>
      for {
        t1 <- inferSetType(e1, heap)
        t2 <- inferSetType(e2, heap)
        t <- defs.maxClass(t1, t2)
      } yield t
    case ISect(e1, e2) => inferSetType(e1, heap)
    case ssym@SetSymbol(id) => heap.ssvltion(ssym).cl.some
  }

  private
  def inferSetLitType(sym: Symbol, es: Seq[BasicExpr[IsSymbolic.type]], heap: SHeap): Class = {
    val t = inferSymbolType(sym, heap)
    es match {
      case Seq() => t
      case (sym2: Symbol) +: oes =>
        val t2 = inferSetLitType(sym2, oes, heap)
        defs.lub(t, t2)
    }
  }

  private
  def inferSymbolType(s: Symbol, heap: SHeap): Class = {
    heap.svltion(s) match {
      case Loced(l) => heap.currentSpatial(l).cl
      case UnknownLoc(cl, _) => cl //TODO Check whether this is safe to ignore notinstof
    }
  }
}
