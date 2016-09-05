package testing

import helper.Counter
import kodkod.ast.Formula
import kodkod.instance.Bounds
import semantics.{PrettyPrinter, FieldMultiplicity, MetaModelCoverageChecker, ModelFinder}
import semantics.domains.{UnknownLoc, CMem, SMem}
import _root_.syntax.ast.{Vars, Fields, ClassDefinition, Class}

import scalaz._, Scalaz._
import scalaz.concurrent.Task
import scalaz.stream.{Process0, Process}

/**
  * Created by asal on 02/03/2016.
  */
class BlackBoxTestGenerator(defs: Map[Class, ClassDefinition], delta: Int, wellRooted: Boolean)
  extends TestGenerator {
  val modelFinder = new ModelFinder(defs, delta)

  override def codeCoverage: Option[Double] = none

  private
  def generateCoveringTests(consideredTypes: Set[Class], pre: SMem, mems: Set[CMem]): Process0[CMem] = {
    val metamodelcoverage = new MetaModelCoverageChecker(defs, consideredTypes)
    mems.foreach(metamodelcoverage.registerMem)
    def gctHelper(classesUncoverable: Set[Class], fieldsUncoverable: Set[(Class, Fields, FieldMultiplicity)]): Process0[CMem] = {
      val additionalClassesToCover = metamodelcoverage.relevantClasses diff (metamodelcoverage.coveredClasses union classesUncoverable)
      val additionalFieldsToCover = metamodelcoverage.relevantFields diff (metamodelcoverage.coveredFields union fieldsUncoverable)
      if (additionalClassesToCover.isEmpty)
        if (additionalFieldsToCover.isEmpty) Process()
        else {
          val fieldToCover = additionalFieldsToCover.head
          modelFinder.concretise(pre, fieldsPresent = Set(fieldToCover), wellRooted = wellRooted).fold(_ =>
            gctHelper(classesUncoverable, fieldsUncoverable + fieldToCover),
            nmem => {
              metamodelcoverage.registerMem(nmem)
              Process(nmem) ++ gctHelper(classesUncoverable, fieldsUncoverable)
            }
          )
        }
      else {
        val classToCover = additionalClassesToCover.head
        modelFinder.concretise(pre, classesPresent = Set(classToCover), wellRooted = wellRooted).fold(_ =>
          gctHelper(classesUncoverable + classToCover, fieldsUncoverable),
          nmem => {
            metamodelcoverage.registerMem(nmem)
            Process(nmem) ++ gctHelper(classesUncoverable, fieldsUncoverable)
          }
        )
      }
    }
    mems.foreach(metamodelcoverage.registerMem)
    Process.emitAll(mems.toSeq) ++ gctHelper(Set(), Set())
  }

  def generateTests(pres: Set[SMem]): Process[Task, CMem] = Process.emitAll(pres.toSeq).flatMap[Task, CMem] { pre =>
    (for {
       startMem <- modelFinder.concretise(pre, wellRooted = wellRooted)
       mems = generateCoveringTests(SMem.allTypes(pre), pre, Set(startMem))
     } yield mems).fold(_ => Process.empty, identity)
  }
}
