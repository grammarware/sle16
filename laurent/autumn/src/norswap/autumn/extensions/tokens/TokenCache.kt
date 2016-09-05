package norswap.autumn.extensions.tokens
import norswap.autumn.Context
import norswap.autumn.InertState
import norswap.violin.stream.*
import norswap.violin.utils.plusAssign

/**
 * Memoizes matched tokens by input position.
 * This is optional and must be added to the [Context] to be used.
 *
 * This is an [InertState], as the fact a token is cached or not never influences the parse.
 */
class TokenCache(val map: MutableMap<Int, Token<*>> = mutableMapOf())
: InertState<TokenCache>, MutableMap<Int, Token<*>> by map
{
    override fun snapshotString(snap: TokenCache, ctx: Context): String
    {
        val b = StringBuilder()
        b += "{"
        map.entries
            .stream().array()
            .apply { sortBy { it.key } }
            .stream()
            .each {
                val (pos, tok) = it
                if (tok !== NO_RESULT)
                    b += "\n  from ${ctx.rangeToString(pos, tok.end)}: $tok"
                else
                    b += "\n  at ${ctx.posToString(pos)}: no token"
            }
        if (!map.isEmpty()) b += "\n"
        b += "}"
        return b.toString()
    }
}