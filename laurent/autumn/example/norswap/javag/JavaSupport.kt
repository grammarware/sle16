package norswap.javag
import norswap.violin.utils.get
import norswap.autumn.utils.*

fun parseInt(str: String): Number {
    return if (str.length == 1 || str[0] != '0')
        parseInt(str, 10)
    else when (str[1]) {
        'b', 'B' -> parseInt(str[2, -1], 2)
        'x' -> parseInt(str[2, -1], 16)
        else -> parseInt(str[1, -1], 8)
    }
}

fun parseInt(str: String, base: Int): Number {
    var out = 0L
    var i = 0
    for (c in str) {
        if (c == '_') continue
        if (c == 'l' || c == 'L') break
        out *= base
        out += c - '0'
        ++i
    }
    if (i != str.length)
        return out // long
    else
        return out.toInt()
}

fun parseFloat(str: String): Number {
    val v  = str.replace("_", "").toDouble()
    val last = str.last()
    if (last == 'f' || last == 'F')
        return v.toFloat()
    else
        return v
    // TODO needs an error to indicate that a literal is to long for a float
}

fun parseChar(str: String): Char {
    val inner = str[1, -2]
    return if (inner.length == 1) inner[0] else inner.unescape()[0]
}

fun parseString(str: String)
    =  str[1, -2].unescape()

fun String.escape(): String {
    val str = StringBuilder(length)
    str.forEach {
        when {
            it == '\t' -> str.append("\\t")
            it == '\n' -> str.append("\\n")
            it == '\r' -> str.append("\\r")
            it == '\'' -> str.append("\\\'")
            it == '\"' -> str.append("\\\"")
            it == '\\' -> str.append("\\\\")
            it == '\b' -> str.append("\\b")
            it == '\u000c' -> str.append("\\f")
            else -> str.append(it)
        }
    }
    return str.toString()
}

// TODO adapt from kEscape / kUnescape

fun String.asciiEscape(): String {
    val str = StringBuilder(length)
    str.forEach {
        when {
            it == '\t' -> str.append("\\t")
            it == '\n' -> str.append("\\n")
            it == '\r' -> str.append("\\r")
            it == '\'' -> str.append("\\\'")
            it == '\"' -> str.append("\\\"")
            it == '\\' -> str.append("\\\\")
            it == '\b' -> str.append("\\b")
            it == '\u000c' -> str.append("\\f")
            !it.isAsciiPrintable() -> str.append("\\u" + it.hexEncode()) // !
            else -> str.append(it)
        }
    }
    return str.toString()
}

// TODO exceptions
fun String.unescape(): String
{
    val str = StringBuilder(length)
    val chars = toCharArray()
    var i = 0
    while (i < chars.size) {
        if (chars[i] == '\\') {
            val c = chars[++i]
            when {
                c == 't'  -> str.append("\t")
                c == 'n'  -> str.append("\n")
                c == 'r'  -> str.append("\r")
                c == '\'' -> str.append("\'")
                c == '"'  -> str.append("\"")
                c == '\\' -> str.append("\\")
                c == 'b' -> str.append("\b")
                c == 'f' -> str.append("\u000c")
                c == 'u' -> {
                    var j = ++i
                    while( j < chars.size
                        && j < i + 4
                        && chars[j].isHexDigit())
                            ++j
                    if (j != i + 4)
                        throw IllegalArgumentException("Illegal escape in string.")
                    str.append(Integer.parseInt(substring(i, j), 16).toChar())
                    i = j - 1
                }
                c.isOctalDigit() -> {
                    var j = i + 1
                    while( j <chars.size
                        && j < i + 3
                        && chars[j].isOctalDigit())
                            ++j
                    if (j == i + 3 && chars[i] > '3')
                        -- j
                    str.append(Integer.parseInt(substring(i, j), 8).toChar())
                    i = j - 1
                }
                else -> throw IllegalArgumentException("Illegal escape in string.")
            }
        } else str.append(chars[i])
        ++i
    }
    return str.toString()
}