package norswap.autumn.syntax
import norswap.autumn.Parser
import norswap.autumn.parsers.*

// -------------------------------------------------------------------------------------------------

/**
 * The end-of-file (null) character.
 */
val eofChar = '\u0000'

// -------------------------------------------------------------------------------------------------

/**
 * [CharInRange]`(this, c)`
 */
infix fun Char.upto(c: Char)
    = CharInRange(this, c)

// -------------------------------------------------------------------------------------------------

/**
 * [Str]`(this)`
 */
val String.lit: Parser
    get() = Str(this)

// -------------------------------------------------------------------------------------------------

/**
 * [CharInSet]`(*this.toCharArray()`
 */
val String.set: Parser
    get() = CharInSet(*toCharArray())

// -------------------------------------------------------------------------------------------------