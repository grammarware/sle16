package semantics.domains

sealed trait ExecutionFailure
case class Error(explanation: String) extends ExecutionFailure
case class Unreachable(explanation: String) extends ExecutionFailure