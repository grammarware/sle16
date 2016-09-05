package semantics

import language.higherKinds
import syntax.ast._

import scalaz._, Scalaz._

/**
  * Created by asal on 19/01/2016.
  */
package object domains extends SymbolicOps {
  type SymbolValuation = Map[Symbol, SymbolDesc]
  type SetSymbolValuation = Map[SetSymbol, SSymbolDesc]
  type LocOwnership = Map[Loc, Ownership]
  type Spatial = Map[Loc, SpatialDesc]
  type Prop = Set[BoolExpr[IsSymbolic.type]]
  type SStackState = Map[Vars, SetExpr[IsSymbolic.type]]
  type DescendantPools = Map[Class, SetSymbol]
  type Instances = Int
  type CStack = Map[Vars, Set[Instances]]
}
