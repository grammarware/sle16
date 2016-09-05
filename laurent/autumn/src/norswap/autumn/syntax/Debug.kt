package norswap.autumn.syntax
import norswap.autumn.Context
import norswap.autumn.Parser
import norswap.autumn.ParserBuilder
import norswap.autumn.parsers.*

// -------------------------------------------------------------------------------------------------

/**
 * See [AfterPrintingState].
 */
val ParserBuilder.afterPrintingState: Parser
    get() = AfterPrintingState(this.build())

// -------------------------------------------------------------------------------------------------

/**
 * See [BeforePrintingState].
 */
val ParserBuilder.beforePrintingState: Parser
    get() = BeforePrintingState(this.build())

// -------------------------------------------------------------------------------------------------

/**
 * Sugar for `BeforePrintingState(AfterPrintingState(this))`.
 */
val ParserBuilder.printStateAround: Parser
    get() = BeforePrintingState(AfterPrintingState(this.build()))

// -------------------------------------------------------------------------------------------------

/**
 * See [AfterPrintingTrace].
 */
val ParserBuilder.afterPrintingTrace: Parser
    get() = AfterPrintingTrace(this.build())

// -------------------------------------------------------------------------------------------------

/**
 * See [BeforePrintingTrace].
 */
val ParserBuilder.beforePrintingTrace: Parser
    get() = BeforePrintingTrace(this.build())

// -------------------------------------------------------------------------------------------------

/**
 * See [ThenPrintResult].
 */
val ParserBuilder.thenPrintResult: Parser
    get() = ThenPrintResult(this.build())

// -------------------------------------------------------------------------------------------------

/**
 * See [After].
 */
fun ParserBuilder.after(f: Parser.(Context) -> Unit)
    = After(this.build(), f)

// -------------------------------------------------------------------------------------------------

/**
 * See [Before].
 */
fun ParserBuilder.then(f: Parser.(Context) -> Unit)
    = Before(this.build(), f)

// -------------------------------------------------------------------------------------------------