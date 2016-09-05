package examples.evaluation

import examples._
import semantics.{PrettyPrinter, MetaModelCoverageChecker, ConcreteExecutor}
import semantics.domains.SMem
import syntax.ast.Statement.BranchPoint
import syntax.ast._
import scala.concurrent.duration._
import testing.{BlackBoxTestGenerator, WhiteBoxTestGenerator, TestGenerator}

import scala.concurrent.duration.FiniteDuration
import scalaz.concurrent.Task
import scalaz.stream.Process


/**
  * Created by asal on 17/03/2016.
  */
object Evaluation {
  case class EvaluationReport(testname: String, time: FiniteDuration, metaModelCoverage: Double, codeCoverage: Double)

  val input: List[(String, Example)] = List (
    "Families to Persons" -> FamiliesToPersonsTransformation
    , "Class to Relational" -> ClassToRelationalTransformation
    , "Path expression to Petri net" -> PathExp2PetriNetTransformation
    , "Rename field refactoring" -> RenameFieldRefactoring
    , "Rename method refactoring" -> RenameMethodRefactoring
    , "Extract super-class refactoring" -> ExtractSuperclassRefactoring
    , "Replace delegation with inheritance refactoring" -> ReplaceDelegationWithInheritance
  )

  def runTestGenerator(tg: TestGenerator,
                       testname: String,
                       defs: Map[Class, ClassDefinition],
                       prog: Statement,
                       excludedBranches: Set[BranchPoint],
                       pres: Set[SMem]) = {
    val concExec = new ConcreteExecutor(defs, prog, excludedBranches)
    val mmCC = new MetaModelCoverageChecker(defs, pres.flatMap(SMem.allTypes))
    val (_, duration) = lapse.Stopwatch.tupled(tg.generateTests(pres)
      .map{ mem => tg.codeCoverage.fold{concExec.execute(mem);()}(_ => ()); mem }
      .map{ mem => mmCC.registerMem(mem); mem }.run.run)
    EvaluationReport(testname, duration, mmCC.coverage, tg.codeCoverage.fold(concExec.coverage)(identity))
  }

  def whiteBoxTestGenerator(input: List[(String, Example)]) = {
    Process.emitAll(input).map { case (testname, example) =>
        val defsWithKeys = example.classDefs.map(cd => Class(cd.name) -> cd).toMap
        import example._
        val tg = new WhiteBoxTestGenerator(defsWithKeys, prog, excludedBranches, beta, delta, kappa, wellRooted = wellRooted, timeout = 1L.hour, coverageTarget = 95.0)
        val res = runTestGenerator(tg, testname, defsWithKeys, prog, excludedBranches, pres)
        res
    }
  }

  def blackBoxTestGenerator(input: List[(String, Example)]) = {
    Process.emitAll(input).map { case (testname, example) =>
      val defsWithKeys = example.classDefs.map(cd => Class(cd.name) -> cd).toMap
      import example._
      val tg = new BlackBoxTestGenerator(defsWithKeys, delta, wellRooted = wellRooted)
      runTestGenerator(tg, testname, defsWithKeys, prog, excludedBranches, pres)
    }
  }

  def formatTime(duration: Duration): (String, String) = {
      (duration.toMillis.toString, "ms")
  }

  def main(args: Array[String]) {
    println("Blackbox test generator:")
    blackBoxTestGenerator(input).map { er =>
      import er._
      val (dur, un) = formatTime(time)
      f"| $testname%-70s | $dur%10s $un | $metaModelCoverage%10.2f%% | $codeCoverage%10.2f%% |"
    }.to (scalaz.stream.io.stdOutLines).run[Task].run
    println("Whitebox test generator:")
    whiteBoxTestGenerator(input).map { er =>
      import er._
      val (dur, un) = formatTime(time)
      f"| $testname%-70s | $dur%10s $un | $metaModelCoverage%10.2f%% | $codeCoverage%10.2f%% |"
    }.to (scalaz.stream.io.stdOutLines).run[Task].run
  }
}
