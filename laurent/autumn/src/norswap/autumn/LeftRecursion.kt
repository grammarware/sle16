package norswap.autumn
import norswap.autumn.result.Result
import norswap.violin.link.*
import norswap.violin.stream.*
import norswap.violin.utils.plusAssign

data class Seed (
    val pos: Int,
    val parser: Parser,
    val res: Result,
    val delta: Delta?,
    var used: Boolean = false)
{
    fun toString(ctx: Context): String {
        val b = StringBuilder()
        b += "seed for ${parser.fullString()} at ${ctx.posToString(pos)} "
        b += "(${if (used) "used" else "unused"})\n"
        b += "  res: $res\n"
        b += "  delta: $delta"
        return b.toString()
    }
}

class Seeds: StackState<Seed>() {
    /**
     * The state and the snapshot must have the same entries for all positions higher than the
     * current position. Currently, there should only be entries for the current position.
     */
    override fun equiv(pos: Int, snap: LinkList<Seed>)
        = snap.stream().takeWhile { it.pos >= pos }.set() ==
               stream().takeWhile { it.pos >= pos }.set()

    fun get(pos: Int, parser: Parser): Seed?
        = stream()  .takeWhile { it.pos >= pos }
                    .filter { it.parser == parser }
                    .next()

    override fun snapshotString(snap: LinkList<Seed>, ctx: Context): String {
        val b = StringBuilder()
        b += "{"
        stream().each { seed ->
            b += "\n"
            b += seed.toString(ctx).prependIndent("  ")
        }
        if (!empty) b += "\n"
        b += "}"
        return b.toString()
    }
}

/**
 * In order to handle left-recursion correctly, each invocation of a left-recursive parser
 * much go through this parser.
 *
 * The idea is as follows: start by running the left-recursive parser while ignoring all
 * left-recursive invocation, then re-run it, using the result of the initial parse as the result
 * of all left-recursive invocations. Repeat until as much input as possible has been matched.
 *
 * In order to initially ignore left-recursive invocation, then to reuse the result of a parse,
 * we use the [Seeds] state.
 *
 * Within a [Grammar], these parsers will be referenced by instances of [Ref].
 *
 * While this logic is only required for left-recursive parsers, we cannot automatically
 * distinguish between left-recursive and other recursive parsers, hence [Grammar] will require
 * this to be wrapped around all recursive parsers.
 */
open class Rec (val child: Parser): Parser(child)
{
    override fun _parse_(ctx: Context): Result {
        // recursive Ref#parse call
        ctx.seeds.get(ctx.pos, child)?.let {
            it.used = true
            if (it.delta != null) ctx.merge(it.delta)
            return it.res
        }

        val snapshot = ctx.snapshot()
        // initial seed is failure
        var seed = Seed(ctx.pos, child, failure(ctx), null)
        ctx.seeds.push(seed)

        // iterate until the seed stops growing
        while (true) {
            val res = child.parse(ctx)
            ctx.seeds.pop()
            if (!seed.used) { // triggers on first iteration or never
                return res
            } else if (ctx.pos <= seed.pos) {
                ctx.restore(snapshot)
                if (seed.delta != null) ctx.merge(seed.delta!!)
                return seed.res
            } else {
                seed = Seed(ctx.pos, child, res, ctx.diff(snapshot))
                ctx.restore(snapshot)
                ctx.seeds.push(seed)
}   }   }   }

/**
 * Creates a reference to the parser named by the string, to be resolved by the [Grammar] to which
 * this parser belongs, before starting a parse (hence these reference are **not** dynamic).
 */
class Ref (val ref: String, grammar: Grammar): Parser() {
    init { definer = "ref($ref)"}
    val child by lazy { grammar.recs[ref] ?: throw Exception("Unresolved reference: $ref") }
    override fun _parse_(ctx: Context) = child.parse(ctx)
}
