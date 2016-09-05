package norswap.autumn.utils
import norswap.violin.stream.*
import norswap.violin.stream.stream
import norswap.violin.utils.plusAssign
import java.io.PrintWriter
import java.io.StringWriter
import kotlin.reflect.KClass

// Miscellaneous utilities.

// -------------------------------------------------------------------------------------------------

/**
 * Returns a version of this string where all tabs have been fully expanded, so that each tab
 * brings the column (counted from 0 starting at each newline) to a multiple of [tabSize].
 */
// Courtesy of http://stackoverflow.com/a/34933524/298664
fun String.expandTabsToBuilder(tabSize: Int): StringBuilder
{
    val b = StringBuilder()
    var col = 0
    for (c in this) when (c) {
        '\n' -> {
            b += c
            col = 0
        }
        '\t' -> {
            val spaces = tabSize - col % tabSize
            repeat(spaces) { b += " " }
            col += spaces
        }
        else -> {
            b += c
            ++col
    }   }
    return b
}

// -------------------------------------------------------------------------------------------------

/**
 * Returns a version of this string where all tabs have been fully expanded, so that each tab
 * brings the column (counted from 0 starting at each newline) to a multiple of [tabSize].
 */
fun String.expandTabs(tabSize: Int): String
    = expandTabsToBuilder(tabSize).toString()

// -------------------------------------------------------------------------------------------------

/**
 * Expands tabs (like [expandTabs]) and add a null character at the end.
 */
fun String.expandTabsAndNullTerminate(tabSize: Int): String {
    val b = expandTabsToBuilder(tabSize)
    b += '\u0000'
    return b.toString()
}

// -------------------------------------------------------------------------------------------------

/**
 * Indicates if the element indicates a call within the given class and method.
 */
fun StackTraceElement.isMethod(klass: Class<*>, method: String)
    =  klass.isAssignableFrom(Class.forName(this.className))
    && method == this.methodName

// -------------------------------------------------------------------------------------------------

/**
 * Indicates if the element indicates a call within the given class and method.
 */
fun StackTraceElement.isMethod(klass: KClass<*>, method: String)
    = isMethod(klass.java, method)


// -------------------------------------------------------------------------------------------------

/**
 * A string that describes this stack trace element, in a format recognized by IntelliJ,
 * for which it generates *correct* clickable links (important when inlining is involved).
 */
fun StackTraceElement.clickableString()
    = "at " + this

// -------------------------------------------------------------------------------------------------

/**
 * Return a string describing the source code location of the stack trace element.
 * Extracted from [StackTraceElement.toString].
 */
fun StackTraceElement.location(): String = run {
    if (fileName == null) "(Unknown Source)"
    else if (lineNumber >= 0) "($fileName:$lineNumber)"
    else "($fileName)"
}

// -------------------------------------------------------------------------------------------------

// TODO move to Violin
/**
 * Enables the ternary operator: <boolean expr> .. <if-expr> ?: <else-expr>
 */
@Suppress("NOTHING_TO_INLINE")
operator inline fun <T: Any> Boolean.rangeTo(e: T): T?
    = if (this) e else null

// -------------------------------------------------------------------------------------------------

// TODO move to Violin
fun <T: Any> List<T>?.stream(): Stream<T>
    = if (this == null) Stream<T>() else this.stream()

// -------------------------------------------------------------------------------------------------

// TODO move to Violin
/**
 * Returns a string representation of the stack trace.
 */
fun Throwable.stackTraceString(): String {
    val sw = StringWriter()
    printStackTrace(PrintWriter(sw))
    return sw.toString()
}

// -------------------------------------------------------------------------------------------------

/**
 * Casts [list] to mutable if it can be, otherwise make a copy.
 */
fun <T> mutable (list: List<T>): MutableList<T>
{
    return if (list is MutableList)
        list
    else
        list.toMutableList()
}

// -------------------------------------------------------------------------------------------------