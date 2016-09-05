package norswap.autumn.result

/**
 * The result of a parser invocation ([Parser.parse]).
 * Either an instance of [Success] or [Failure].
 */
open class Result internal constructor ()
{
    // ---------------------------------------------------------------------------------------------

    override fun toString() = when (this) {
        is Failure -> "Failure" + msg().let { if (it.isEmpty()) "" else ": $it" }
        else -> "Success"
    }

    // ---------------------------------------------------------------------------------------------

    /**
     * Return the result of [other] if this is a [Failure], else [Success].
     */
    infix inline fun or(other: (Failure) -> Result) = when (this) {
        is Failure -> other(this)
        else -> this
    }

    // ---------------------------------------------------------------------------------------------

    /**
     * Return the result of [other] if this is a [Success], else [Failure].
     */
    infix inline fun and(other: () -> Result) = when (this) {
        is Success -> other()
        else -> this
    }

    // ---------------------------------------------------------------------------------------------

    /**
     * Run [body] if this is a [Failure].
     */
    infix inline fun orDo(body: (Failure) -> Unit): Result = when (this) {
        is Failure -> { body(this) ; Success }
        else -> this
    }

    // ---------------------------------------------------------------------------------------------

    /**
     * Run [body] if this is a [Success].
     */
    infix inline fun andDo(body: () -> Unit): Result = when (this) {
        is Success ->  { body() ; Success }
        else -> this
    }
}
