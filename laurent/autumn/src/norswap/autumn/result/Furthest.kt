package norswap.autumn.result
import java.util.Comparator

/**
 * Compares two results. The greater is the one the one that fails if both don't fail, or the one
 * with the furthest failure position.
 */
object Furthest: Comparator<Result>
{
    // ---------------------------------------------------------------------------------------------

    override fun compare(a: Result, b: Result): Int =
        if (a is Success) { if (b is Success) 0 else -1 }
        else if (b is Success) 1
        else (a as Failure).pos - (b as Failure).pos

    // ---------------------------------------------------------------------------------------------

    /**
     * Returns the result with the furthest failure position. If both result are successful
     * or have the same failure position, returns [a].
     */
    fun <T: Result> max(a: T, b: T): T
        = if (compare(a, b) >= 0) a else b

    // ---------------------------------------------------------------------------------------------

    /**
     * Returns the result with the furthest failure position.
     * See the binary overload for tie-breaking.
     */
    fun <T: Result> max (vararg res: T): T?
        = res.maxWith(this)
}