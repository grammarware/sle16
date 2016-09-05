package norswap.autumn.parsers
import norswap.autumn.Context
import norswap.autumn.Parser
import norswap.autumn.result.Result
import norswap.violin.utils.after

// Parsers to be used during debugging.

// -------------------------------------------------------------------------------------------------

/**
 * Acts like [child], but logs the parsing state beforehand.
 */
class AfterPrintingState (val child: Parser): Parser(child)
{
    override fun _parse_(ctx: Context): Result {
        ctx.log(ctx.stateString())
        return child.parse(ctx)
    }
}

// -------------------------------------------------------------------------------------------------

/**
 * Acts like [child], but logs the parsing state afterwards.
 */
class BeforePrintingState (val child: Parser): Parser(child)
{
    override fun _parse_(ctx: Context)
        = child.parse(ctx).after { ctx.log(ctx.stateString()) }
}

// -------------------------------------------------------------------------------------------------

/**
 * Acts like [child], but logs the parse trace beforehand.
 */
class AfterPrintingTrace (val child: Parser): Parser(child)
{
    override fun _parse_(ctx: Context): Result {
        ctx.logTrace()
        return child.parse(ctx)
    }
}

// -------------------------------------------------------------------------------------------------

/**
 * Acts like [child], but logs the parse trace afterwards.
 */
class BeforePrintingTrace (val child: Parser): Parser(child)
{
    override fun _parse_(ctx: Context)
        = child.parse(ctx).after { ctx.logTrace() }
}

// -------------------------------------------------------------------------------------------------

/**
 * Acts like [child], but prints its result afterwards.
 */
class ThenPrintResult (val child: Parser): Parser(child)
{
    override fun _parse_(ctx: Context)
        = child.parse(ctx).after { ctx.log("$child: $it") }
}

// -------------------------------------------------------------------------------------------------

/**
 * Acts like [child], but calls [f] beforehand.
 */
class After (val child: Parser, val f: Parser.(Context) -> Unit): Parser(child)
{
    override fun _parse_(ctx: Context): Result {
        f(ctx)
        return child.parse(ctx)
    }
}

// -------------------------------------------------------------------------------------------------

/**
 * Acts like [child], but calls [f] afterwards.
 */
class Before (val child: Parser, val f: Parser.(Context) -> Unit): Parser()
{
    override fun _parse_(ctx: Context)
        = child.parse(ctx).after { f(ctx) }
}

// -------------------------------------------------------------------------------------------------