package norswap.autumn.syntax
import norswap.autumn.ParserBuilder
import norswap.autumn.parsers.Until

// -------------------------------------------------------------------------------------------------

/**
 * [Until]`(this, until, matchUntil = true, matchSome = false)`
 */
infix fun ParserBuilder.until (until: ParserBuilder)
    = Until(this.build(), until.build(), matchUntil = true, matchSome = false)

// -------------------------------------------------------------------------------------------------

/**
 * [Until]`(this, until, matchUntil = true, matchSome = true)`
 */
infix fun ParserBuilder.until1 (until: ParserBuilder)
    = Until(this.build(), until.build(), matchUntil = true, matchSome = true)

// -------------------------------------------------------------------------------------------------

/**
 * [Until]`(this, until, matchUntil = false, matchSome = false)`
 */
infix fun ParserBuilder.until_ (until: ParserBuilder)
    = Until(this.build(), until.build(), matchUntil = true, matchSome = false)

// -------------------------------------------------------------------------------------------------

/**
 * [Until]`(this, until, matchUntil = false, matchSome = true)`
 */
infix fun ParserBuilder.until1_ (until: ParserBuilder)
    = Until(this.build(), until.build(), matchUntil = true, matchSome = true)

// -------------------------------------------------------------------------------------------------