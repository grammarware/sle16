package norswap.autumn
import norswap.autumn.extensions.tokens.TokenCheckParser
import norswap.autumn.result.*
import norswap.autumn.utils.isMethod
import norswap.violin.stream.*
import norswap.violin.link.stream
import norswap.violin.utils.expr
import norswap.violin.utils.plusAssign

// -------------------------------------------------------------------------------------------------

/**
 * Returns a string describing the chain of parser invocations described by [parsers].
 */
fun parseTrace(ctx: Context, parsers: Stream<Pair<Parser, Int>>): String
{
    val b = StringBuilder()

    parsers.each {

        val (parser, pos) = it

        if (HIDE_TOKENS_IN_TRACE && parser is TokenCheckParser)
            b.delete(0, b.length)

        b += "at $parser (${ctx.posToString(pos)})"

        if (DEBUG) {
            if (SHOW_EXTRA_LOCATIONS) {
                b += "\n  defined\n      "
                b += parser.definitionLocation()
                b += "\n  constructed\n      "
                b +=  parser.constructionLocation()
                parser.useLocation()
                    ?.let { b += "\n  used\n      $it" }
            }
            else {
                parser.useLocation()
                    ?. let  { b += "\n  $it" }
                    ?: expr { b += "\n  ${parser.constructionLocation()}" }
            }

        }

        b += "\n"
    }

    return b.toString()
}

// -------------------------------------------------------------------------------------------------

/**
 * Returns a string describing the failure as well as the chain of parser invocations
 * (and in the case of exceptions, function calls) leading to it.
 */
fun trace(ctx: Context, f: DebugFailure): String
{
    val b = StringBuilder()

    if (f.cause != null)
        // usually: "$className: $message"
        b += f.cause
    else
        // usually: "Failure: $msg"
        b += f

    b += "\n"

    // NOTE:
    // I wanted to handle stack overflows specially, but isolating the loop is not easy.
    // The best approach is to implement an algorithm that finds the longest sub-sequence that
    // repeats itself OR an algorithm that finds the sub-sequence that repeats itself the most
    // **sequentially**. A suffix tree is probably the way to go.

    if (f.cause != null) {
        // Prints the part of the stacktrace occuring underneath a leaf parser.
        f.cause.stackTrace.stream()
            .upTo { it.isMethod(Parser::class, "_parse_") }
            .each { b += "  at $it\n" }
    }

    b += parseTrace(ctx, f.trace.stream()).prependIndent("  ")

    return b.toString()
}

// -------------------------------------------------------------------------------------------------

/**
 * Returns a complete diagnostic of the result of a parse.
 *
 * To be called after the parse is complete, with the same context that was used to create it.
 *
 * This will include the reached input position in case of success, and the message in case
 * of failure. If the result is a [DebugFailure], a trace will be included.
 */
fun diagnostic(ctx: Context, result: Result): String
{
    val b = StringBuilder()

    if (result is DebugFailure) {
        b += trace(ctx, result)
        b += "\n"
        b += result.snapshot.toString(ctx)
    }

    else if (result is Failure)
        b += result

    else if (ctx.pos >= ctx.text.length - 1)
        b += "Success (full match)"

    else
        b += "Success up to ${ctx.posStr} (EOF at ${ctx.posToString(ctx.text.length - 1)})"

    return b.toString()
}

// -------------------------------------------------------------------------------------------------
