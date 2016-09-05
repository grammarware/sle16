import org.scalatest.{Matchers, FlatSpec}
import syntax.ast._
import semantics.domains._
import semantics._
import examples._
import scalaz._
import CMem._
import CHeap._
/**
  * Created by asal on 17/01/2016.
  */
class Class2TableExampleTests extends FlatSpec
                              with Matchers {
  def execFixture = new ConcreteExecutor(Class2TableDeepMatchingExample.classDefs.map(cd => Class(cd.name) -> cd).toMap,
                                                Class2TableDeepMatchingExample.prog)

  def retainedVars(mem: CMem) = GarbageCollection.gc(mem, retainvars = Some(Set("class", "table")))

  "The class-to-table transformation" should "transform a class with no attributes to a table with only an identity column" in {
    val exec = execFixture
    val pre = CMem(Map("class" -> Set(-1)), CHeap(Map(-1 -> Class("Class")), Map(-1 -> Map("attributes" -> Set())), Map(-1 -> Map())))
    val expected = (_cm_stack.modify(_ + ("table" -> Set(0))) andThen
      (_cm_heap ^|-> _ch_typeenv).modify(_ + (0 -> Class("Table")) + (1 -> Class("IdColumn"))) andThen
      (_cm_heap ^|-> _ch_childenv).modify(_ + (0 -> Map("columns" -> Set(1))) + (1 -> Map())) andThen
      (_cm_heap ^|-> _ch_refenv).modify(_ + (0 -> Map("id" -> Set(1))) + (1 -> Map()))) (pre)
    val actual = exec.execute(pre)
    actual.map(retainedVars) should equal (\/-(expected).map(retainedVars))
  }

  it should "transform a class with one attribute to a table with a corresponding data column, in addition to an identity column" in {
    val exec = execFixture
    val pre = CMem(Map("class" -> Set(-1)), CHeap(Map(-1 -> Class("Class"), -2 -> Class("Attribute"), -3 -> Class("String")),
                   Map(-1 -> Map("attributes" -> Set(-2)), -2 -> Map(), -3 -> Map()), Map(-1 -> Map(), -2 -> Map("type" -> Set(-3)), -3 -> Map())))
    val expected = (_cm_stack.modify(_ + ("table" -> Set(0))) andThen
      (_cm_heap ^|-> _ch_typeenv).modify(_ + (0 -> Class("Table")) + (1 -> Class("IdColumn")) + (2 -> Class("DataColumn"))) andThen
      (_cm_heap ^|-> _ch_childenv).modify(_ + (0 -> Map("columns" -> Set(1,2))) + (1 -> Map[Fields,Set[Instances]]()) + (2 -> Map[Fields,Set[Instances]]())) andThen
      (_cm_heap ^|-> _ch_refenv).modify(_ + (0 -> Map("id" -> Set(1))) + (1 -> Map[Fields,Set[Instances]]()) + (2 -> Map("type" -> Set(-3))))) (pre)
    val actual = exec.execute(pre)
    actual.map(retainedVars) should equal (\/-(expected).map(retainedVars))
  }


  it should "transform a class with two attributes to a table with two corresponding data columns, in addition to an identity column" in {
    val exec = execFixture
    val pre = CMem(Map("class" -> Set(-1)), CHeap(Map(-1 -> Class("Class"), -2 -> Class("Attribute"), -3 -> Class("String"), -4 -> Class("Attribute"), -5 -> Class("String")),
      Map(-1 -> Map("attributes" -> Set(-2, -4)), -2 -> Map(), -3 -> Map(), -4 -> Map(), -5 -> Map()), Map(-1 -> Map(), -2 -> Map("type" -> Set(-3)), -3 -> Map(), -4 -> Map("type" -> Set(-5)), -5 -> Map())))
    val expected = (_cm_stack.modify(_ + ("table" -> Set(0))) andThen
      (_cm_heap ^|-> _ch_typeenv).modify(_ + (0 -> Class("Table")) + (1 -> Class("IdColumn")) + (2 -> Class("DataColumn")) + (3 -> Class("DataColumn"))) andThen
      (_cm_heap ^|-> _ch_childenv).modify(_ + (0 -> Map("columns" -> Set(1,2,3))) + (1 -> Map[Fields,Set[Instances]]()) + (2 -> Map[Fields,Set[Instances]]()) + (3 -> Map[Fields, Set[Instances]]())) andThen
      (_cm_heap ^|-> _ch_refenv).modify(_ + (0 -> Map("id" -> Set(1))) + (1 -> Map[Fields,Set[Instances]]()) + (2 -> Map("type" -> Set(-3))) + (3 -> Map("type" -> Set(-5))))) (pre)
    val actual = exec.execute(pre)
    actual.map(retainedVars) should equal (\/-(expected).map(retainedVars))
  }
}
