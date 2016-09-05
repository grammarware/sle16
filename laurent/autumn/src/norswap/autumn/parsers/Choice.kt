package norswap.autumn.parsers
import norswap.autumn.Context
import norswap.autumn.Parser
import norswap.autumn.result.*

// Parsers designed to select a matching parser amongst multiple alternatives.

// -------------------------------------------------------------------------------------------------

/**
 * Matches the first successful parser in [children], else fails.
 */
class Choice (vararg children: Parser): Parser(*children)
{
    override fun _parse_(ctx: Context): Result
    {
        for (child in children) {
            val r = child.parse(ctx)
            if (r is Success) return Success
        }

        return ctx.failure.let {
            if (it is Failure) it
            else failure(ctx) { "empty choice" }
        }
    }
}

// -------------------------------------------------------------------------------------------------

/**
 * Matches the parser in [children] which successfully matches the most input, else fails.
 * If there is a tie (two parsers match the same amount of input), the first one wins.
 */
class Longest (vararg children: Parser): Parser(*children)
{
    override fun _parse_(ctx: Context): Result
    {
        val initial = ctx.snapshot()
        var bestSnapshot = initial
        var bestPos = -1

        for (child in children)
        {
            val r = child.parse(ctx)

            if (r is Success) {
                if (ctx.pos > bestPos) {
                    bestPos = ctx.pos
                    bestSnapshot = ctx.snapshot()
                }
                ctx.restore(initial)
            }
        }

        return if (bestPos > -1) {
            ctx.restore(bestSnapshot)
            Success
        }
        else ctx.failure.let {
            if (it is Failure) it
            else failure(ctx) { "empty longest-match choice" }
        }
    }
}

// -------------------------------------------------------------------------------------------------