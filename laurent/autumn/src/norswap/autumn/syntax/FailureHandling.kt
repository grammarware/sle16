package norswap.autumn.syntax
import norswap.autumn.Context
import norswap.autumn.Parser
import norswap.autumn.ParserBuilder
import norswap.autumn.parsers.OrFail
import norswap.autumn.result.Failure

/**
 * See [OrFail].
 */
infix fun ParserBuilder.orFail(e: Parser.(Context) -> Failure)
    = OrFail(this.build(), e)