package norswap.autumn.result
import norswap.autumn.Parser

/**
 * The parser invocation was unsuccessful: the parser didn't "match" the input.
 *
 * Failures are usually constructed through [Parser.failure].
 *
 * See also [DebugFailure].
 */
open class Failure (pos: Int, parser: Parser, msg: () -> String, cause: Throwable? = null): Result()
{
    // ---------------------------------------------------------------------------------------------

    /**
     * The position at which the failure occurred.
     */
    val pos = pos

    // ---------------------------------------------------------------------------------------------

    /**
     * The parser that failed.
     */
    val parser = parser

    // ---------------------------------------------------------------------------------------------

    /**
     * The message to display to the user for this failure. Since most failures are never
     * shown, making this a lazily-evaluated function is cheaper.
     */
    val msg = msg

    // ---------------------------------------------------------------------------------------------

    /**
     * If this failure was caused by an exception (but not a [Panic]), that exception.
     */
    val cause = cause
}
