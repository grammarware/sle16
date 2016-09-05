package norswap.autumn.extensions.tokens
import norswap.autumn.Context
import norswap.autumn.Grammar
import norswap.autumn.Parser
import norswap.autumn.result.*

/**
 * Calls [target], and if successful, uses [value] to generate a value from the matched string,
 * wraps it into a [Token], and pushes this token onto [Context.stack].
 *
 * These parsers are aggregated inside a [TokenGrammar].
 * They are never invoked directly, instead, all invocations go through a [TokenCheckParser],
 * which will find the correct token at the input position, and will succeed if it matches the
 * requested token.
 */
class TokenTypeParser (
    val type: Int,
    val target: Parser,
    val value: (String) -> Any?,
    val grammar: Grammar)
: Parser(target)
{
    override fun _parse_(ctx: Context): Result
    {
        val pos = ctx.pos
        val result = target.parse(ctx)
        if (result is Success) {
            val end = ctx.pos
            val v = value(ctx.textFrom(pos))
            grammar.whitespace.parse(ctx)
            val token = Token(type, pos, end, ctx.pos, v)
            ctx.stack.push(token)
        }
        return result
    }
}
