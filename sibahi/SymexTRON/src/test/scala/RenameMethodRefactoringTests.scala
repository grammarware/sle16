import examples.Class2TableDeepMatchingExample
import org.scalatest.{FlatSpec, Matchers}
import semantics.domains.CHeap.{_ch_childenv, _ch_typeenv}
import semantics.domains.CMem.{_cm_stack, _cm_heap}
import semantics.domains.{CHeap, CMem}
import semantics.{ConcreteExecutor, GarbageCollection}
import syntax.ast.Class
import monocle.Monocle._

import scalaz.\/-

/**
  * Created by asal on 29/04/2016.
  */
class RenameMethodRefactoringTests
    extends FlatSpec
      with Matchers {
      import examples.RenameMethodRefactoring._
      def execFixture = new ConcreteExecutor(classDefs.map(cd => Class(cd.name) -> cd).toMap, prog)

      def retainedVars(mem: CMem) = GarbageCollection.gc(mem, retainvars = Some(Set("package", "class", "old_method", "new_method")))

      "The rename method refactoring" should
        "rename a method with no parameters correctly, when there are no expressions that refer to it" in {
        val exec = execFixture
        val packageId = -1
        val classId = -2
        val oldMethodId = -3
        val newMethodId = -4
        val statementId = -5
        // Instance omits unused fields and objects for ease of writing/reading (although they might be required normally)
        val pre = CMem(Map("package" -> Set(packageId), "class" -> Set(classId), "old_method" -> Set(oldMethodId), "new_method" -> Set(newMethodId)),
          CHeap(Map(packageId -> Class("Package"), classId -> Class("Class"), oldMethodId -> Class("Method"), newMethodId -> Class("Method"), statementId -> Class("Statement")),
                Map(packageId -> Map("classes" -> Set(classId)), classId -> Map("methods" -> Set(oldMethodId)),
                  oldMethodId -> Map("params" -> Set(), "body" -> Set(statementId)), newMethodId -> Map("params" -> Set(), "body" -> Set(statementId)),
                  statementId -> Map()
                ),
                Map(packageId -> Map(), classId -> Map(), oldMethodId -> Map(), newMethodId -> Map(), statementId -> Map())))
        val actual = exec.execute(pre)
        val expected = _cm_heap.modify(_ch_childenv.modify(cenv => cenv.applyLens(at(classId)).modify(_.map(_.updated("methods", Set(newMethodId))))))(pre)
        actual.map(retainedVars) should equal (\/-(expected).map(retainedVars))
      }
}
