package norswap.autumn.syntax
import norswap.autumn.Parser
import norswap.autumn.ParserBuilder
import norswap.autumn.BuildEnv
import norswap.autumn.parsers.*
import norswap.autumn.result.Result
import norswap.autumn.result.Success

// -------------------------------------------------------------------------------------------------

/**
 * See [WithStack].
 */
fun ParserBuilder.withStack (backargs: Int = 0, pop: Boolean = true, node: BuildEnv.() -> Result)
    = WithStack(this.build(), backargs, pop, node)

// -------------------------------------------------------------------------------------------------

/**
 * Like [withStack], except that it always succeeds if the receiver succeeds.
 */
inline fun ParserBuilder.doWithStack (backargs: Int = 0, pop: Boolean = true, crossinline f: BuildEnv.() -> Unit)
    = WithStack(this.build(), backargs, pop) { f() ; Success }

// -------------------------------------------------------------------------------------------------

/**
 * See [Build].
 */
fun ParserBuilder.build (backargs: Int = 0, node: BuildEnv.() -> Any)
    = Build(this.build(), backargs, node)

// -------------------------------------------------------------------------------------------------

/**
 * See [BuildMaybe].
 */
val ParserBuilder.maybe: Parser
    get() = BuildMaybe(this.build())

// -------------------------------------------------------------------------------------------------

/**
 * See [AsBool].
 */
val ParserBuilder.asBool: Parser
    get() = AsBool(this.build())

// -------------------------------------------------------------------------------------------------

/**
 * See [Collect].
 */
fun <T: Any> ParserBuilder.collect (backargs: Int = 0)
    = Collect<T>(this.build(), backargs)

// -------------------------------------------------------------------------------------------------

/**
 * See [Collect].
 *
 * In Collect, T = Any, but as this type is erased, the list that is pushed on stack can be cast
 * to the proper type without hurdle.
 */
val ParserBuilder.collect: Parser
    get() = Collect<Any>(this.build())

// -------------------------------------------------------------------------------------------------

/**
 * See [BuildPair].
 */
val ParserBuilder.pair: Parser
    get() = BuildPair(this.build())

// -------------------------------------------------------------------------------------------------