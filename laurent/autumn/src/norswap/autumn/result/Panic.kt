package norswap.autumn.result
import norswap.autumn.utils.JUtils

// -------------------------------------------------------------------------------------------------

class Panic(val failure: Failure): JUtils.NoStackTrace(null)

// -------------------------------------------------------------------------------------------------

/**
 * Runs [body] and returns its result. If it panics (throws [Panic]), return the failure if matched
 * by [pred], else propagates the panic.
 */
inline fun chill(noinline pred: (Failure) -> Boolean = { true }, body: () -> Result): Result
    = try { body() }
      catch (p: Panic) {
          if (pred(p.failure)) p.failure
          else throw p
      }

// -------------------------------------------------------------------------------------------------
