package norswap.autumn.parsers
import norswap.autumn.Context
import norswap.autumn.Parser
import norswap.autumn.result.*
import norswap.autumn.result.Panic

// Parsers that deal with failures.

// -------------------------------------------------------------------------------------------------

/**
 * Always succeeds matching nothing.
 */
class Succeed (): Parser()
{
    override fun _parse_(ctx: Context)
        = Success
}

// -------------------------------------------------------------------------------------------------

/**
 * Always fails with the failure returned by [f] (default: `this.failure(ctx)`).
 */
class Fail (val f: Parser.(Context) -> Failure = { failure(it) }): Parser()
{
    override fun _parse_(ctx: Context)
        = f(ctx)
}

// -------------------------------------------------------------------------------------------------

/**
 * Throws a panic, using [f] to construct the failure.
 */
class Panic (val f: Parser.(Context) -> Failure): Parser()
{
    override fun _parse_(ctx: Context)
        = throw Panic(f(ctx))
}

// -------------------------------------------------------------------------------------------------

/**
 * Matches [child], else throws a panic with the failure it returned.
 */
class Paranoid (val child: Parser): Parser(child)
{
    override fun _parse_(ctx: Context)
        = child.parse(ctx) or { throw Panic(it) }
}

// -------------------------------------------------------------------------------------------------

/**
 * Matches [child], else fails. If [child] throws a panic whose failure matches [pred] (matches
 * everything by default), return the panic's failure.
 *
 * See also [chill].
 */
class Chill (val child: Parser, val pred: (Failure) -> Boolean = { true }): Parser(child)
{
    override fun _parse_(ctx: Context)
        = chill(pred) { child.parse(ctx) }
}

// -------------------------------------------------------------------------------------------------

/**
 * Matches [child], else raises the failure returned by [f].
 */
class OrFail (val child: Parser, val f: Parser.(Context) -> Failure):  Parser(child)
{
    override fun _parse_(ctx: Context)
        = child.parse(ctx) or { f(ctx) }
}

// -------------------------------------------------------------------------------------------------

/**
 * Matches this parser. If it throws an exception, which is not a panic and which satisfies [pred]
 * (matches everything by default), catch it and return a failure indicating this exception was
 * caught.
 */
class Catch (val child: Parser, val pred: (Throwable) -> Boolean = { true }): Parser(child)
{
    override fun _parse_(ctx: Context): Result
    {
        try {
            return child.parse(ctx)
        }
        catch (e: Throwable) {
            if (e !is Panic && pred(e)) return failure(ctx, e)
            else throw e
        }
    }
}

// -------------------------------------------------------------------------------------------------