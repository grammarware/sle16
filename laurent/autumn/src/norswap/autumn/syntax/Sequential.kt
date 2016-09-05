package norswap.autumn.syntax
import norswap.autumn.Parser
import norswap.autumn.ParserBuilder
import norswap.autumn.parsers.*

// -------------------------------------------------------------------------------------------------

/**
 * [Opt]`(this)`
 */
val ParserBuilder.opt: Parser
    get() = Opt(this.build())

// -------------------------------------------------------------------------------------------------

/**
 * [ZeroMore]`(this)`
 */
val ParserBuilder.repeat: Parser
    get() = ZeroMore(this.build())

// -------------------------------------------------------------------------------------------------

/**
 * [OneMore]`(this)`
 */
val ParserBuilder.repeat1: Parser
    get() = OneMore(this.build())

// -------------------------------------------------------------------------------------------------

/**
 * [Repeat]`(n, this)`
 */
fun ParserBuilder.repeat (n: Int)
    = Repeat(n, this.build())

// -------------------------------------------------------------------------------------------------

/**
 * [Around]`(this, inside)`
 */
infix fun ParserBuilder.around (inside: ParserBuilder)
    = Around(this.build(), inside.build())

// -------------------------------------------------------------------------------------------------

/**
 * [Around1]`(this, inside)`
 */
infix fun ParserBuilder.around1 (inside: ParserBuilder)
    = Around1(this.build(), inside.build())

// -------------------------------------------------------------------------------------------------