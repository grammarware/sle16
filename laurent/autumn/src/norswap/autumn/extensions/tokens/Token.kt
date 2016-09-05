package norswap.autumn.extensions.tokens
import norswap.autumn.Context

////////////////////////////////////////////////////////////////////////////////////////////////////

/**
 * Holds a type identifier for the token, its location within the input, as well as its derived
 * value (as determined by [Grammar.token]).
 */
data class Token<out T: Any> (
    /**
     * Token type, this is used to distinguish between the tokens used in the grammar.
     */
    val type: Int,

    /**
     * Token start position.
     */
    val start: Int,

    /**
     * Position past the token, whitespace excluded.
     */
    val end: Int,

    /**
     * Position past the token, whitespace included.
     */
    val wEnd: Int,

    /**
     * Derived token value.
     */
    val value: T?)
{
    /**
     * Prints out "Token<T>" or "Token<Nothing>" if `value == null`.
     */
    override fun toString()
        = "Token<${value?.javaClass?.simpleName ?: "Nothing"}>"

    /**
     * Like [toString] but adds pretty-printed position information.
     */
    fun toStringWithPos (ctx: Context)
        = "$this (${ctx.rangeToString(start, end)} (+ ${wEnd - end}): $value"
}

////////////////////////////////////////////////////////////////////////////////////////////////////

/**
 * Indicates that no tokens could be matched.
 */
val NO_RESULT = Token<Nothing>(-1, -1, -1, -1, null)

////////////////////////////////////////////////////////////////////////////////////////////////////
