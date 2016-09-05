package semantics.domains

import semantics.domains.SMem._
import syntax.ast._

import scalaz.Scalaz._
import scalaz._

trait Symbolic {
  val symbols: Set[SetSymbol \/ Symbol]
}

trait SymbolicOps {
  implicit class SymbolicSetExpr(e: SetExpr[IsSymbolic.type]) extends Symbolic {
    override val symbols = {
      def symbols(e: SetExpr[IsSymbolic.type]): Set[SetSymbol \/ Symbol] = e match {
        case SetLit(es) => es.collect{ case x: Symbol => x.right }.toSet
        case Union(e1, e2) => symbols(e1) ++ symbols(e2)
        case Diff(e1, e2) => symbols(e1) ++ symbols(e2)
        case ISect(e1, e2) => symbols(e1) ++ symbols(e2)
        case e@SetSymbol(id) => Set(e.left)
      }
      symbols(e)
    }
  }

  implicit class SymbolicBoolExpr(b : BoolExpr[IsSymbolic.type]) extends Symbolic {
    override val symbols = {
      def symbols(b: BoolExpr[IsSymbolic.type]): Set[SetSymbol \/ Symbol] = b match {
        case Eq(e1, e2) => e1.symbols ++ e2.symbols
        case SetSubEq(e1, e2) => e1.symbols ++ e2.symbols
        case True() => Set()
        case And(p1, p2) => symbols(p1) ++ symbols(p2)
        case Not(pp) => symbols(pp)
        case BagSubEquiv(_, e1, e2) => e1.symbols ++ e2.symbols
      }
      symbols(b)
    }
  }

  implicit class SymbolicProp(p : Prop)  extends Symbolic {
    override val symbols = p.flatMap(_.symbols)
  }

  implicit class SymbolicSpatialDesc(sd : SpatialDesc) extends Symbolic {
    override val symbols: Set[SetSymbol \/ Symbol] = sd match {
      case SpatialDesc(_, _, _, children, refs, descendantpool) =>
        children.values.flatMap(_.symbols).toSet ++
           refs.values.flatMap(_.symbols).toSet ++
        descendantpool.values.flatMap(_.symbols)
    }
  }

  implicit class SymbolicSetSymbolValuation(ssvaluation: SetSymbolValuation) extends Symbolic {
    override val symbols: Set[SetSymbol \/ Symbol] = ssvaluation.keySet.map(_.left)
  }

  implicit class SymbolicSymbolValuation(svaluation: SymbolValuation) extends Symbolic {
    override val symbols: Set[SetSymbol \/ Symbol] = svaluation.keySet.map(_.right)
  }

  implicit class SymbolicSpatial(sp : Spatial) extends Symbolic {
    override val symbols = sp.values.toSet[SpatialDesc].flatMap(_.symbols)
  }

  implicit class SymbolicSHeap(heap : SHeap) extends Symbolic {
    override val symbols = heap.ssvltion.symbols ++ heap.svltion.symbols ++ heap.currentSpatial.symbols ++ heap.pure.symbols
  }

  implicit class SymbolicSStack(stack : SStackState) extends Symbolic {
    override val symbols = stack.values.toSet.flatMap((e : SetExpr[IsSymbolic.type]) => e.symbols)
  }

  implicit class SymbolicSMem(mem : SMem) extends Symbolic {
    override val symbols = _sm_currentStack.get(mem).symbols ++ mem.heap.symbols
  }

  implicit class SymbolIds(s : Set[SetSymbol \/ Symbol]) {
    val ids = s.map(_.fold(_.id,_.id))
  }
}
