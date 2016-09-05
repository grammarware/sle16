package norswap.autumn.syntax
import norswap.autumn.Parser
import norswap.autumn.ParserBuilder
import norswap.autumn.parsers.Alias

/**
 * [Alias]`(this)`
 */
val ParserBuilder.alias: Parser
    get() = Alias(this.build())
