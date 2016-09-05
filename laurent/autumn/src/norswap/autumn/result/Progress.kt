package norswap.autumn.result
import java.util.Comparator

/**
 * Compares two results. The greater is the one that succeeds if both don't succeed, or the one
 * whose failure position is furthest.
 */
object Progress : Comparator<Result>
{
    // ---------------------------------------------------------------------------------------------

    override fun compare(a: Result, b: Result): Int =
        if (a is Success) { if (b is Success) 0 else 1 }
        else if (b is Success) -1
        else (a as Failure).pos - (b as Failure).pos

    // ---------------------------------------------------------------------------------------------

    /**
     * Returns the result with the furthest failure position. If both result are successful
     * or have the same failure position, returns [a].
     */
    fun <T: Result> max(a: T, b: T): T
        = if (compare(a, b) >= 0) a else b
}