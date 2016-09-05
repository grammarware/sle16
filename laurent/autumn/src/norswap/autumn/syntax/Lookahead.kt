package norswap.autumn.syntax
import norswap.autumn.Parser
import norswap.autumn.ParserBuilder
import norswap.autumn.parsers.Ahead
import norswap.autumn.parsers.Not

// -------------------------------------------------------------------------------------------------

/**
 * [Ahead]`(this)`
 */
val ParserBuilder.ahead: Parser
    get() = Ahead(this.build())

// -------------------------------------------------------------------------------------------------

/**
 * [Not]`(this)`
 */
val ParserBuilder.not: Parser
    get() = Not(this.build())

// -------------------------------------------------------------------------------------------------