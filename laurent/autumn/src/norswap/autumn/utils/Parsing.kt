package norswap.autumn.utils

import norswap.autumn.Context
import norswap.autumn.result.Result
import norswap.autumn.result.Success

// Utilities to be used inside parsers.

// -------------------------------------------------------------------------------------------------

/**
 * Returns the result of [f], after discarding [Context.failure].
 */
inline fun Context.dontRecordFailures(f: () -> Result): Result
{
    val r = f()
    failure = Success
    return r
}

// -------------------------------------------------------------------------------------------------
