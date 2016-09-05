import examples.{IntListHeadTailEqExample, Class2TableSimpleExample}
import kodkod.ast.{IntConstant, Relation, Variable, Formula}
import kodkod.instance.{Bounds, Instance}
import org.scalatest.{FlatSpec, Matchers, PrivateMethodTester}
import semantics.ModelFinder
import semantics.domains._
import syntax.ast._

import scala.collection.JavaConversions._

import scalaz.{\/, \/-}

/**
  * Created by asal on 11/03/2016.
  */
class ModelFinderTests extends FlatSpec
  with Matchers
  with PrivateMethodTester {

  val concretisationConstraints = PrivateMethod[String \/ (List[Formula], Bounds)]('concretisationConstraints)
  val classPresenceConstraint = PrivateMethod[Formula]('classPresenceConstraint)
  val findSolution = PrivateMethod[String \/ Instance]('findSolution)

  "The model finder" should "find an instance with an attribute for the class-to-table transformation" in {
    val modelFinder = new ModelFinder(Class2TableSimpleExample.classDefs.map(cd => Class(cd.name) -> cd).toMap, 3)
    val ccr = modelFinder invokePrivate concretisationConstraints(Class2TableSimpleExample.pres.head, false, false)
    ccr should be a 'right
    ccr match {
      case \/-((constraints, bounds)) =>
        val attrPresent = modelFinder invokePrivate classPresenceConstraint(Class("Attribute"))
        val solr = modelFinder invokePrivate findSolution(attrPresent :: constraints, bounds)
        solr should be a 'right
      case _ =>
    }
  }

  it should "find an instance with three lists in the head-tail equal transformation program" in {
    val stack: SStackState = Map("list" -> SetLit(Seq(Symbol(1))))
    val heap = SHeap(
      Map(SetSymbol(3) -> SSymbolDesc(Class("Int"), Set(), Req),
          SetSymbol(11) -> SSymbolDesc(Class("Int"), Set(), Req),
          SetSymbol(19) -> SSymbolDesc(Class("IntList"), Set(), Opt),
          SetSymbol(20) -> SSymbolDesc(Class("Int"), Set(), Req)),
      Map(Symbol(1) -> Loced(Loc(1)),
          Symbol(9) -> Loced(Loc(5)),
          Symbol(18) -> Loced(Loc(10))),
      Map(Loc(1) -> Unfolded,
          Loc(5) -> Unfolded,
          Loc(10) -> Unfolded),
      Map(Loc(1) -> SpatialDesc(Class("IntList"), Set(), PartialDesc(true,Set()),Map("next" -> SetLit(List(Symbol(9)))),Map("data" -> SetSymbol(3)),Map()),
          Loc(5) -> SpatialDesc(Class("IntList"), Set(), PartialDesc(true,Set()),Map("next" -> SetLit(List(Symbol(18)))),Map("data" -> SetSymbol(11)),Map()),
          Loc(10) -> SpatialDesc(Class("IntList"), Set(), PartialDesc(true,Set()),Map("next" -> SetSymbol(19)), Map("data" -> SetSymbol(20)),Map())),
      Map(Loc(1) -> SpatialDesc(Class("IntList"), Set(), PartialDesc(true,Set()), Map("next" -> SetLit(List(Symbol(9)))),Map("data" -> SetSymbol(3)),Map()),
          Loc(5) -> SpatialDesc(Class("IntList"), Set(), PartialDesc(true,Set()),Map("next" -> SetLit(List(Symbol(18)))),Map("data" -> SetSymbol(11)),Map()),
          Loc(10) -> SpatialDesc(Class("IntList"), Set(), PartialDesc(true,Set()),Map("next" -> SetSymbol(19)),Map("data" -> SetSymbol(20)),Map())),
      Set(Not(Eq(SetLit(List(Symbol(1))),SetLit(List()))), Not(Eq(SetLit(List(Symbol(9))),SetLit(List()))), Not(Eq(SetLit(List(Symbol(18))),SetLit(List())))))
    val pre = SMem(SStack.initial(Set(), stack), heap)
    val modelFinder = new ModelFinder(IntListHeadTailEqExample.classDefs.map(cd => Class(cd.name) -> cd).toMap, 6)
    val ccr = modelFinder invokePrivate concretisationConstraints(pre, false, false)
    ccr should be a 'right
    ccr match {
      case \/-((constraints, bounds)) =>
        val fac = bounds.universe.factory
        val fieldBounds = fac noneOf 3
        fieldBounds.add((fac tuple "loc'1") product (fac tuple "field'next") product (fac tuple "loc'5"))
        fieldBounds.add((fac tuple "loc'5") product (fac tuple "field'next") product (fac tuple "loc'10"))
        fieldBounds.add((fac tuple "loc'1") product (fac tuple "field'data") product (fac tuple "loc'11"))
        fieldBounds.add((fac tuple "loc'5") product (fac tuple "field'data") product (fac tuple "loc'12"))
        fieldBounds.add((fac tuple "loc'10") product (fac tuple "field'data") product (fac tuple "loc'13"))
        bounds.boundExactly(modelFinder.LocsRel.fields, fieldBounds)
        val ss = Variable.unary("ss")
        val solr = modelFinder invokePrivate findSolution(constraints, bounds)
        solr should be a 'right
      case _ =>
    }
  }
}
