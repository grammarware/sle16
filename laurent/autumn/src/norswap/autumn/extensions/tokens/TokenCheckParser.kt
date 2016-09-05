package norswap.autumn.extensions.tokens
import norswap.autumn.Context
import norswap.autumn.Parser
import norswap.autumn.result.*

/**
 * Attempts to match a token, succeeding if the matched token is of type [type]. If successful,
 * pushes the [Token] onto [Context.stack] if [info], else pushes only its value (if any).
 */
class TokenCheckParser (val type: Int, val info: Boolean, val grammar: TokenGrammar): Parser()
{
    // ---------------------------------------------------------------------------------------------

    fun result(pos: Int, ctx: Context, token: Token<*>): Result
    {
        if (token === NO_RESULT) {
            ctx.pos = pos
            return failure(ctx) { "Could not match any token" }
        }

        if (token.type != type) {
            ctx.pos = pos
            return failure(ctx) {
                val expected = grammar.parserName(type)
                val actual   = grammar.parserName(token.type)

                "Expected token type [$expected] but got [$actual] instead"
            }
        }

        if (info)
            ctx.stack.push(token)
        else if (token.value != null)
            ctx.stack.push(token.value)

        ctx.pos = token.wEnd
        return Success
    }

    // ---------------------------------------------------------------------------------------------

    override fun _parse_(ctx: Context): Result
    {
        val pos = ctx.pos
        val cache: TokenCache? = ctx.state_()

        // use cached result if possible
        cache?.get(pos)?.let {
            return result(pos, ctx, it)
        }

        val result = grammar.tokenParser.parse(ctx)
        val token =
            if (result is Success) ctx.stack.pop() as Token<*>
            else NO_RESULT

        cache?.put(pos, token)
        return result(pos, ctx, token)
    }

    // -------------------------------------------------------------------------------------------------
}
