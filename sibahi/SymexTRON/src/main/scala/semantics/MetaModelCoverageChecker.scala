package semantics

import semantics.domains.{CMem, Instances}
import _root_.syntax.ast._

import scala.concurrent.stm._
import scalaz.Scalaz._
import scalaz._

sealed trait FieldMultiplicity
case object ZeroMultiplicity extends FieldMultiplicity
case object OneMultiplicity extends FieldMultiplicity
case object SomeMultiplicity extends FieldMultiplicity

/**
  * Created by asal on 01/03/2016.
  */
class MetaModelCoverageChecker(defs: Map[Class, ClassDefinition], inputTypes: Set[Class]) {

  def relevantFeatures(todoClasses: Set[Class],
                       visitedClasses: Set[Class],
                       relevantFields: Set[(Class, Fields, FieldMultiplicity)]): (Set[Class], Set[(Class, Fields, FieldMultiplicity)])  = {
    if (todoClasses.isEmpty) (visitedClasses, relevantFields)
    else {
      val clazz = todoClasses.head
      val classDef = defs(clazz)
      val fields = (classDef.children ++ classDef.refs.filterNot {case (f, fd) => fd.fieldtype == Tracking}).toSet
      val reachedByOwnership = classDef.children.values.map(_.`class`).toSet
      val reachedByRequiredRef = classDef.refs.values.filterNot(_.card.isOptional).map(_.`class`).toSet
      val reachedBySubtyping = defs.subtypes(clazz)
      val classesRelevant = visitedClasses + clazz
      val newTodoClasses: Set[Class] = (todoClasses.tail ++ reachedByOwnership ++ reachedByRequiredRef ++ reachedBySubtyping) diff classesRelevant
      val newFields = fields.flatMap { case (field, fielddef) =>
        val mults : Set[FieldMultiplicity] = fielddef.card match {
            case Req => Set(OneMultiplicity)
            case ManyReq => Set(OneMultiplicity, SomeMultiplicity)
            case Opt => Set(ZeroMultiplicity, OneMultiplicity)
            case ManyOpt => Set(ZeroMultiplicity, OneMultiplicity, SomeMultiplicity)
        }
        mults.map(mult => (defs.definingClass(clazz, field), field, mult))
      }
      relevantFeatures(newTodoClasses, classesRelevant, relevantFields ++ newFields)
    }
  }
  val (relevantClasses, relevantFields) = {
    val (rc, rf) = relevantFeatures(inputTypes, Set(), Set())
    (rc.filterNot(c => defs(c).isAbstract), rf)
  }
  private val _coveredClasses: TMap[Class, Boolean] = TMap.empty[Class, Boolean]
  private val _coveredFields: TMap[(Class, Fields, FieldMultiplicity), Boolean] = TMap.empty

  def coveredClasses: Set[Class] = _coveredClasses.snapshot.keySet
  def coveredFields: Set[(Class, Fields, FieldMultiplicity)] = _coveredFields.snapshot.keySet

  def coverage: Double = {
    ((relevantClasses intersect coveredClasses).size + (relevantFields intersect coveredFields).size) * 100.0 / (relevantClasses.size + relevantFields.size)
  }

  def registerMem(mem: CMem): Unit = {
    val mem_ = GarbageCollection.gc(mem)
    val coveredClasses = mem_.heap.typeenv.values.toSet
    val coveredFields =
      mem_.heap.typeenv.foldLeft(Set[(Class, Fields, FieldMultiplicity)]()) { (st, instinfo) =>
        val (inst, clazz) = instinfo
        def covered(env: Map[Instances, Map[Fields, Set[Instances]]]) : Set[(Class, Fields, FieldMultiplicity)] = {
          env.get(inst).toSet.flatMap(_.toSet[(Fields, Set[Instances])].map {
            case (f, os) =>
              val defclazz = defs.definingClass(clazz, f)
              if (os.isEmpty) (defclazz, f, ZeroMultiplicity)
              else if (os.size == 1) (defclazz, f, OneMultiplicity)
              else /* os.size > 1 */ (defclazz, f, SomeMultiplicity)
          })
        }
        st ++ covered(mem_.heap.childenv) ++ covered(mem_.heap.refenv)
      }
    coveredClasses.foreach { c => atomic { implicit txn => _coveredClasses.update(c, true) } }
    coveredFields.foreach { case (c,f,m) => atomic { implicit txn => _coveredFields.update((c,f,m), true) } }
  }

}
