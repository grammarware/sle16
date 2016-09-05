package norswap.autumn.parsers
import norswap.autumn.Context
import norswap.autumn.Parser
import norswap.autumn.result.*

/**
 * Matches zero or more repetition of [repeat] (that do not match [until]), followed by [until].
 *
 * [matchUntil] (true by default) determines whether [until] is part of the final match.
 *
 * [matchSome] (false by default) determines whether at [repeat] should be matched at least once.
 *
 * Here are some equivalent parser, depending on the value of parameters:
 * - matchUntil, matchSome: `Seq(OneMore(Seq(Not(until), repeat)), until)`
 * - matchUntil, !matchSome: `Seq(ZeroMore(Seq(Not(until), repeat)), until)`
 * - !matchUntil, matchSome: `OneMore(Seq(Not(until), repeat))`
 * - !matchUntil, !matchSome: `ZeroMore(Seq(Not(until), repeat))`
 */
class Until (
    val repeat: Parser,
    val until: Parser,
    val matchUntil: Boolean = true,
    val matchSome: Boolean = false
)
: Parser(repeat, until)
{
    init {
        val some  = (if (matchUntil) "" else "!") + "matchUntil"
        val until = (if (matchSome)  "" else "!") + "matchSome"
        definer = "Until($some, $until)"
    }

    override fun _parse_(ctx: Context): Result
    {
        val initial = ctx.snapshot()
        var snapshot = initial
        var cnt = 0

        while (true)
        {
            val r1 = until.parse(ctx)
            if (r1 is Success) {
                if (matchSome && cnt == 0) {
                    ctx.restore(initial)
                    ctx.failure =
                        failure(ctx) { "Until with matchSome did not match any repeatable item" }
                    return ctx.failure
                } else {
                    if (!matchUntil) ctx.restore(snapshot)
                    return Success
                }
            }

            val r2 = repeat.parse(ctx)
            if (r2 is Failure) {
                ctx.restore(initial)
                return ctx.failure
            }

            if (!matchUntil) snapshot = ctx.snapshot()
            ++cnt
        }
    }
}