package norswap.autumn.utils
import java.awt.event.KeyEvent

// -------------------------------------------------------------------------------------------------

/**
 * Is the character in the ASCII character set (unicode 0-127)?
 */
fun Char.isAscii()
    = this < 128.toChar()

// -------------------------------------------------------------------------------------------------

/**
 * Is the character in the extended ASCII character set (unicode 0-255)?
 */
fun Char.isExtendedAscii()
    = this < 256.toChar()

// -------------------------------------------------------------------------------------------------

/**
 * Encode the character to its hexadecimal representation (no prefix is included).
 */
fun Char.hexEncode()
    = String.format("%04x", this.toShort())

// -------------------------------------------------------------------------------------------------

/**
 * Is the character an octal digit?
 */
fun Char.isOctalDigit()
    = '0' <= this && this <= '7'

// -------------------------------------------------------------------------------------------------

/**
 * Is the character an hexadecimal digit?
 */
fun Char.isHexDigit()
    =  '0' <= this && this <= '9'
    || 'a' <= this && this <= 'f'
    || 'A' <= this && this <= 'F'

// -------------------------------------------------------------------------------------------------

/**
 * Can the character be printed using the ASCII character set?
 */
fun Char.isAsciiPrintable()
    = isAscii() && "\t\n\r".contains(this) || ' ' <= this && this <= '~'

// -------------------------------------------------------------------------------------------------

/**
 * Can the character be printed (i.e. is it not a control or otherwise special character)?
 */
fun Char.isPrintable(): Boolean
{
    val block = Character.UnicodeBlock.of(this)
    return !Character.isISOControl(this)
        && this != KeyEvent.CHAR_UNDEFINED
        && block != null
        && block !== Character.UnicodeBlock.SPECIALS
}

// -------------------------------------------------------------------------------------------------

/**
 * Escapes a character so that it may appear inside a Kotlin character literal.
 */
fun Char.kEscape(): String
    = when {
        this == '\t' -> "\\t"
        this == '\n' -> "\\n"
        this == '\r' -> "\\r"
        this == '\'' -> "\\\'"
        this == '\"' -> "\\\""
        this == '\\' -> "\\\\"
        this == '\b' -> "\\b"
        !this.isPrintable() -> "\\u" + this.hexEncode()
        else -> "$this"
    }

// -------------------------------------------------------------------------------------------------

/**
 * Unescape the content of a Kotlin character literal.
 */
fun String.kUnescapeChar(): Char
{
    val chars = toCharArray()
    return if (chars[0] == '\\') {
        val c = chars[1]
        when (c) {
            't'  -> '\t'
            'n'  -> '\n'
            'r'  -> '\r'
            '\'' -> '\''
            '"'  -> '\"'
            '\\' -> '\\'
            'b'  -> '\b'
            'u'  -> {
                var i = 1
                while (chars[i].isHexDigit()) ++i
                if (i != 4) throw IllegalArgumentException("Illegal escape in string.")
                Integer.parseInt(substring(0, i), 16).toChar()
            }
            else -> throw IllegalArgumentException("Illegal escape in string.")
        }
    } else chars[0]
}

// -------------------------------------------------------------------------------------------------

/**
 * Escape a string so that it may appear in a Kotlin string literal.
 * Non-printable Unicode chars ([isPrintable]) are also escaped.
 */
fun String.kEscape(): String
{
    val str = StringBuilder(length)
    forEach { str.append(it.kEscape()) }
    return str.toString()
}

// -------------------------------------------------------------------------------------------------

/**
 * Unescape the content of a Kotlin string literal.
 */
fun String.kUnescape(): String
{
    val str = StringBuilder(length)
    val chars = toCharArray()
    var i = 0
    while (i < chars.size) {
        val c =
            if (chars[i++] == '\\')
                if (chars[i++] == 'u') {
                    i += 4
                    substring(i - 2, i).kUnescapeChar()
                } else
                    substring(i - 2, i).kUnescapeChar()
            else
                chars[i - 1]
        str.append(c)
    }
    return str.toString()
}

// -------------------------------------------------------------------------------------------------