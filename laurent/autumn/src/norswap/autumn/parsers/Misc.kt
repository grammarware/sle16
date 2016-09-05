package norswap.autumn.parsers
import norswap.autumn.*
import norswap.autumn.result.*
import norswap.autumn.utils.dontRecordFailures

// Miscellaneous but useful parsers.

// -------------------------------------------------------------------------------------------------

/**
 * Matches [child], but don't track its internal failures to determine [Context.failure].
 */
class DontRecordFailures (val child: Parser): Parser(child)
{
    override fun _parse_(ctx: Context)
        = ctx.dontRecordFailures { child.parse(ctx) }
}

// -------------------------------------------------------------------------------------------------

/**
 * Delegates the parsing to [child]. Use to create an alias of [child] with a different name.
 */
class Alias (val child: Parser): Parser(child)
{
    override fun _parse_(ctx: Context)
        = child.parse(ctx)
}

// -------------------------------------------------------------------------------------------------

/**
 * A parser that always succeeds, after executing [f].
 */
class Perform (val f: Parser.(Context) -> Unit): Parser()
{
    override fun _parse_(ctx: Context): Result {
        f(ctx)
        return Success
    }
}

// -------------------------------------------------------------------------------------------------

/**
 * Returns a parser that uses [generator] to generate a parser at parse-time, run it and returns
 * and its result.
 */
class Dynamic (val generator: Parser.(Context) -> Parser): Parser()
{
    override fun _parse_(ctx: Context)
        = generator(ctx).parse(ctx)
}

// -------------------------------------------------------------------------------------------------

/**
 * Succeeds if [pred] holds, or fails.
 */
class Predicate (val pred: Parser.(Context) -> Boolean): Parser()
{
    override fun _parse_(ctx: Context)
        = if (pred(ctx)) Success else failure(ctx)
}

// -------------------------------------------------------------------------------------------------