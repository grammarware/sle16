package testing

import _root_.syntax.ast.Statement.BranchPoint
import semantics.{SymbolicExecutor, ConcreteExecutor}
import semantics.domains._

import syntax.ast._
import scalaz._, Scalaz._
import scalaz.stream._, scalaz.stream.time._
import scala.concurrent.duration._
import scalaz.concurrent.Task
import java.util.concurrent.ScheduledExecutorService

class WhiteBoxTestGenerator(defs: Map[Class, ClassDefinition], prog: Statement, excludedBranches: Set[BranchPoint],
                            beta: Int, delta: Int, kappa: Int, wellRooted: Boolean,
                            timeout : FiniteDuration = WhiteBoxTestGenerator.defaultTimeout,
                            coverageTarget : Double = WhiteBoxTestGenerator.defaultCoverageTarget)
 extends TestGenerator {
  private
  val symbExec = new SymbolicExecutor(defs, kappa = kappa, delta = delta, beta = beta)

  private
  val concExec = new ConcreteExecutor(defs, prog, excludedBranches)

  private
  implicit val S: ScheduledExecutorService = DefaultScheduler

  def generateTests(pres : Set[SMem]): Process[Task, CMem] =
    generateTestsE(pres).map(_.toOption).filter(_.isDefined).map(_.get)

  def generateTestsE(pres : Set[SMem]): Process[Task, String \/ CMem] = {
      // TODO Rewrite using writer monad to be pure
      sleep(timeout).wye(
               symbExec.execute(pres, concExec.prog)
              .map(_.flatMap{ sm => symbExec.modelFinder.concretise(sm, wellRooted = wellRooted) })
              .takeWhile(_ => concExec.coverage <= coverageTarget)
              .map { mem => mem.fold(_ => (), m => { val res = concExec.execute(m); /*res.leftMap(println)*/ }); mem  }
              )(wye.interrupt)
  }

  def codeCoverage: Option[Double] = concExec.coverage.some
  def uncoveredBranches: List[BranchPoint] = concExec.uncoveredBranches.toList.sortWith((bp1, bp2) =>
    if (bp1.stmt_uid <= bp2.stmt_uid) true
    else if (bp1.stmt_uid >= bp2.stmt_uid) false
    else bp1.branch_number <= bp2.branch_number
  )
  def annotatedProg: Statement = concExec.prog
}

object WhiteBoxTestGenerator {
  val defaultTimeout = 10L.minutes

  val defaultCoverageTarget = 95.0
}
