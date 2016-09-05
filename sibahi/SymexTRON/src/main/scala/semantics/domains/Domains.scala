package semantics
package domains

import scala.language.higherKinds

import monocle.macros.{GenLens, GenPrism}
import syntax.ast._

case class Loc(id: Int)

sealed trait DescType
case object ExactDesc extends DescType
case object AbstractDesc extends DescType
case class PartialDesc(hasExact: Boolean, possible: Set[Class]) extends DescType

sealed trait Ownership
case object NewlyCreated extends Ownership
case object Unfolded extends Ownership

object DescType {
  val _dt_partial = GenPrism[DescType, PartialDesc]
}

case class SpatialDesc(cl : Class, notinstof : Set[Class], desctype : DescType, children : Map[Fields, SetExpr[IsSymbolic.type]], refs : Map[Fields, SetExpr[IsSymbolic.type]], descendantpools: DescendantPools)

object SpatialDesc {
  val _sd_c = GenLens[SpatialDesc](_.cl)
  val _sd_notinstof = GenLens[SpatialDesc](_.notinstof)
  val _sd_desctype = GenLens[SpatialDesc](_.desctype)
  val _sd_children = GenLens[SpatialDesc](_.children)
  val _sd_refs = GenLens[SpatialDesc](_.refs)
  val _sd_descendantpools = GenLens[SpatialDesc](_.descendantpools)
}

case class SSymbolDesc(cl : Class, notinstof: Set[Class], crd : Cardinality)

sealed trait SymbolDesc
case class Loced(l : Loc) extends SymbolDesc
case class UnknownLoc(cl : Class, notinstof: Set[Class]) extends SymbolDesc

case class SHeap(ssvltion : SetSymbolValuation, svltion : SymbolValuation, locOwnership: LocOwnership, initSpatial: Spatial, currentSpatial: Spatial, pure : Prop)

object SHeap {
  val _sh_ssvltion       = GenLens[SHeap](_.ssvltion)
  val _sh_svltion        = GenLens[SHeap](_.svltion)
  val _sh_locOwnership   = GenLens[SHeap](_.locOwnership)
  val _sh_initSpatial    = GenLens[SHeap](_.initSpatial)
  val _sh_currentSpatial = GenLens[SHeap](_.currentSpatial)
  val _sh_pure           = GenLens[SHeap](_.pure)

  def initial(ssvltion : SetSymbolValuation, svltion : SymbolValuation, locOwnership: LocOwnership, spatial : Spatial, pure: Prop) =
    SHeap(ssvltion, svltion, locOwnership, spatial, spatial, pure)
}

case class SStack(init: SStackState, roots: Set[Vars], current: SStackState)

object SStack {
  val _ss_init = GenLens[SStack](_.init)
  val _ss_current = GenLens[SStack](_.current)
  val _ss_roots = GenLens[SStack](_.roots)
  def initial(roots: Set[Vars], sstackstate: SStackState) = SStack(sstackstate, roots, sstackstate)
}

case class SMem(stack: SStack, heap: SHeap)

object SMem {
  val _sm_initStack = GenLens[SMem](_.stack.init)
  val _sm_currentStack = GenLens[SMem](_.stack.current)
  val _sm_roots = GenLens[SMem](_.stack.roots)
  val _sm_heap = GenLens[SMem](_.heap)

  def allTypes(mem: SMem): Set[Class] = {
    mem.heap.svltion.values.collect { case UnknownLoc(cl, _) => cl } ++
      mem.heap.ssvltion.values.map(_.cl) ++
      mem.heap.currentSpatial.values.map(_.cl) ++
      mem.heap.initSpatial.values.map(_.cl)
  }.toSet
}


case class CHeap(typeenv: Map[Instances, Class],
                 childenv: Map[Instances, Map[Fields, Set[Instances]]],
                 refenv: Map[Instances, Map[Fields, Set[Instances]]])

object CHeap {
  val _ch_typeenv  = GenLens[CHeap](_.typeenv)
  val _ch_childenv = GenLens[CHeap](_.childenv)
  val _ch_refenv   = GenLens[CHeap](_.refenv)
}

case class CMem(stack: CStack, heap: CHeap)

object CMem {
  val _cm_stack = GenLens[CMem](_.stack)
  val _cm_heap  = GenLens[CMem](_.heap)
}

sealed trait ForState
case object NormalForState extends ForState
case class MatchForState(c : Class) extends ForState
case class MatchStarForState(c : Class, contMatch : Boolean /* TODO Replace with notinstof bounds */, prevMatched : Int, prevLocs: Set[Loc], descendants: Seq[SetSymbol]) extends ForState// last dp count should be added as well for symmetry breaking
