import org.scalatest._
import syntax.ast._
import semantics.domains._
import semantics._
import examples._
import scalaz._, Scalaz._, scalaz.stream._
import CMem._
import CHeap._

class IntListContainsElementExampleTests extends FlatSpec
                                         with Matchers {

  def execFixture = new ConcreteExecutor(IntListContainsElementExample.classDefs.map(cd => Class(cd.name) -> cd).toMap,
                                         IntListContainsElementExample.prog)

  def retainedVars(mem: CMem) = GarbageCollection.gc(mem, retainvars = Some(Set("list", "elem", "containselem")))

  "The int list containment query" should "not find the element in the empty list" in {
    val exec = execFixture
    val pre = CMem(Map("list" -> Set(), "elem" -> Set(-2)), CHeap(Map(-2 -> Class("Int")), Map(-2 -> Map()), Map(-2 -> Map())))
    val expected = _cm_stack.modify(_ + ("containselem" -> Set()))(pre)
    val actual = exec.execute(pre)
    actual.map(retainedVars) should equal (\/-(expected).map(retainedVars))
  }

  it should "find the element in a singleton list containing only that element" in {
    val exec = execFixture
    val pre = CMem(Map("list" -> Set(-1), "elem" -> Set(-2)),
                   CHeap(Map(-1 -> Class("IntList"),
                             -2 -> Class("Int")),
                         Map(-1 -> Map("next" -> Set()),
                             -2 -> Map()), Map(-1 -> Map("data" -> Set(-2)), -2 -> Map())))
    val expected = (_cm_stack.modify(_ + ("containselem" -> Set(0))) andThen
                    (_cm_heap ^|-> _ch_typeenv).modify(_ + (0 -> Class("Any"))) andThen
                      (_cm_heap ^|-> _ch_childenv).modify(_ + (0 -> Map())) andThen
                      (_cm_heap ^|-> _ch_refenv).modify(_ + (0 -> Map())))(pre)
    val actual = exec.execute(pre)
    actual.map(retainedVars) should equal (\/-(expected).map(retainedVars))
  }

  it should "not find the element in a singleton list containing only another element" in {
    val exec = execFixture
    val pre = CMem(Map("list" -> Set(-1), "elem" -> Set(-2)),
      CHeap(Map(-1 -> Class("IntList"),
        -2 -> Class("Int"),
        -3 -> Class("Int")),
        Map(-1 -> Map("next" -> Set()),
            -2 -> Map(),
            -3 -> Map()), Map(-1 -> Map("data" -> Set(-3)), -2 -> Map(), -3 -> Map())))
    val expected = _cm_stack.modify(_ + ("containselem" -> Set()))(pre)
    val actual = exec.execute(pre)
    actual.map(retainedVars) should equal (\/-(expected).map(retainedVars))
  }

  it should "find the element in a two-element list containing the element searched for in the end" in {
    val exec = execFixture
    val pre = CMem(Map("list" -> Set(-1), "elem" -> Set(-2)),
      CHeap(Map(-1 -> Class("IntList"),
                -2 -> Class("Int"),
                -3 -> Class("Int"),
                -4 -> Class("IntList")),
        Map(-1 -> Map("next" -> Set(-4)),
          -2 -> Map(), -3 -> Map(), -4 -> Map("next" -> Set())),
          Map(-1 -> Map("data" -> Set(-3)), -2 -> Map(), -3 -> Map(), -4 -> Map("data" -> Set(-2)))))
    val expected = (_cm_stack.modify(_ + ("containselem" -> Set(0))) andThen
      (_cm_heap ^|-> _ch_typeenv).modify(_ + (0 -> Class("Any"))) andThen
      (_cm_heap ^|-> _ch_childenv).modify(_ + (0 -> Map())) andThen
      (_cm_heap ^|-> _ch_refenv).modify(_ + (0 -> Map())))(pre)
    val actual = exec.execute(pre)
    actual.map(retainedVars) should equal (\/-(expected).map(retainedVars))
  }

  it should "find the element in a two-element list where both cells contain the element searched for" in {
    val exec = execFixture
    val pre = CMem(Map("list" -> Set(-1), "elem" -> Set(-2)),
      CHeap(Map(-1 -> Class("IntList"),
        -2 -> Class("Int"),
        -4 -> Class("IntList")),
        Map(-1 -> Map("next" -> Set(-4)),
          -2 -> Map(), -4 -> Map("next" -> Set())),
        Map(-1 -> Map("data" -> Set(-2)), -2 -> Map(), -4 -> Map("data" -> Set(-2)))))
    val expected = (_cm_stack.modify(_ + ("containselem" -> Set(1))) andThen
      (_cm_heap ^|-> _ch_typeenv).modify(_ + (1 -> Class("Any"))) andThen
      (_cm_heap ^|-> _ch_childenv).modify(_ + (1 -> Map())) andThen
      (_cm_heap ^|-> _ch_refenv).modify(_ + (1 -> Map())))(pre)
    val actual = exec.execute(pre)
    actual.map(retainedVars) should equal (\/-(expected).map(retainedVars))
  }

  it should "not find the element in a two-element list where none of the cells contain the element searched for" in {
    val exec = execFixture
    val pre = CMem(Map("list" -> Set(-1), "elem" -> Set(-2)),
      CHeap(Map(-1 -> Class("IntList"),
        -2 -> Class("Int"),
        -3 -> Class("Int"),
        -4 -> Class("IntList"),
        -5 -> Class("Int")),
        Map(-1 -> Map("next" -> Set(-4)),
          -2 -> Map(), -3 -> Map(), -4 -> Map("next" -> Set()), -5 -> Map()),
        Map(-1 -> Map("data" -> Set(-3)), -3 -> Map(),
            -2 -> Map(), -4 -> Map("data" -> Set(-5)), -5 -> Map())))
    val expected = _cm_stack.modify(_ + ("containselem" -> Set()))(pre)
    val actual = exec.execute(pre)
    actual.map(retainedVars) should equal (\/-(expected).map(retainedVars))
  }
}
