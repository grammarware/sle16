import org.scalatest.{Matchers, FlatSpec}
import semantics.PrettyPrinter
import semantics.domains.SMem
import syntax.ast.Statement.BranchPoint
import syntax.ast.{Class, ClassDefinition, Statement}
import testing.WhiteBoxTestGenerator
import examples._

import scalaz.concurrent.Task
import scalaz.stream.Process

/**
  * Created by asal on 15/03/2016.
  */
class WhiteBoxTestGeneratorTests
  extends FlatSpec
  with Matchers {

  def testGenerator(defs: Set[ClassDefinition], prog: Statement, excludedBranches: Set[BranchPoint], wellRooted: Boolean = false) = new WhiteBoxTestGenerator(defs.map(cd => Class(cd.name) -> cd).toMap, prog, excludedBranches, beta = 2, delta = 8, kappa = 2, wellRooted = wellRooted)

  def coverageTarget(tg: WhiteBoxTestGenerator, pres: Set[SMem], target: Double): Unit = {
    tg.generateTests(pres).run[Task].run
    tg.codeCoverage.get should equal(target)
  }

  def run(example: Example, target: Double) = {
    import example._
    val tg = testGenerator(classDefs, prog, excludedBranches)
    withClue(s"Uncovered branches: ${tg.uncoveredBranches} --- ") {
      coverageTarget(tg, pres, target)
    }
  }

  "The whitebox test generator" should "generate 100% covering tests for simple sequential program" in {
    run(SimpleBoxSequentialLoadingExample, 100.0)
  }

  it should "generate 100% covering tests for simple branching-loading program" in {
    run(SimpleBoxBranchingLoadingExample, 100.0)
  }

  it should "generate 100% covering tests for simple loading-branching program" in {
    run(SimpleBoxLoadingBranchingExample, 100.0)
  }

  it should "generate 100% covering tests for simple iteration program" in {
    run(IdIterExample, 100.0)
  }

  it should "generate 100% covering tests for int list containment query program" in {
    run(IntListContainsElementExample, 100.0)
  }

  it should "generate 100% covering tests for int list head-tail equivalence program" in {
    run(IntListHeadTailEqExample, 100.0)
  }

  it should "generate 100% covering tests for class-to-table transformation with simple for-loop" in {
    run(Class2TableSimpleExample, 100.0)
  }

  it should "generate 100% covering tests for class-to-table transformation with deep matching for-loop" in {
    run(Class2TableDeepMatchingExample, 100.0)
  }

  it should "generate 100% covering tests for blog post timestamp query program" in {
    run(BlogPostFeedTimestampsExample, 100.0)
  }

  it should "generate 100% covering tests for blog post capitalize title transformation" in {
    run(BlogPostFeedCapitaliseTitlesExample, 100.0)
  }

  // Inner for-loop only can run 0 or 1 time (not more)
  it should "generate 100% covering tests for contact book transformation" in {
    run(ContactBookExample, 100.0)
  }
}
