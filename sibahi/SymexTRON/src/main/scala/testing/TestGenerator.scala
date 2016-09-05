package testing

import semantics.domains.{SMem, CMem}

import scalaz.concurrent.Task
import scalaz.stream.Process

/**
  * Created by asal on 17/03/2016.
  */
trait TestGenerator {
  def codeCoverage: Option[Double]

  def generateTests(pres: Set[SMem]): Process[Task, CMem]
}
