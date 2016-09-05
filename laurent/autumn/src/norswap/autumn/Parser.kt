package norswap.autumn
import norswap.autumn.result.*
import norswap.autumn.utils.isMethod
import norswap.autumn.utils.clickableString
import norswap.autumn.utils.rangeTo
import norswap.autumn.utils.stream
import norswap.violin.stream.filter

/**
 * The parent of all parser classes.
 *
 * # Instantiation
 *
 * There are two ways to define a parser. You can use [invoke]:
 *
 * ```
 * fun MyParser (vararg children: Parser) = Parser(*children) { ctx ->
 *     ...
 *     Success
 * }
 * ```
 *
 * or override the [_parse_] method:
 *
 * ```
 * fun MyParser (vararg children: Parser) = object: Parser(*children) {
 *     override fun _parse_(ctx: Context): Result {
 *          ...
 *          return Success
 *     }
 * }
 * ```
 *
 * The first method is terser, but the second allows adding new fields and methods to the parser.
 *
 * Note that additional public fields are usually not necessary, and if you follow the style
 * guidelines (use named parsers liberally, no parser definition longer than one line in your
 * grammar), overriding the string methods is little help.
 *
 * TODO write and link said guidelines
 *
 * See `com/norswap/autumn/parsers` for examples.
 *
 * # Contract
 *
 * Either [parse] succeeds returning [Success] or fails returning a [Failure], in which case it must
 * revert all changes it and its descendants made to the state. This can be achieved using
 * [Context.snapshot] and [Context.restore] or the [transact] shorthand.
 *
 * A parser must not be stateful: maintain your state within in a [State] registered with [Context].
 *
 * ## Panics
 *
 * A parser can exit through a [Panic], which is a throwable, so you shouldn't
 * rely on the code after any [Parser.invoke] invocation being executed. If it is nevertheless
 * necessary, use a `finally` block or [chill]. It is however not necessary to use those
 * mechanisms to restore the state, as it must be restored to an earlier snapshot when/if the panic
 * is caught.
 *
 * # Name
 *
 * A parser can optionally have a [name], which will be used when printing the parser. This name
 * is also significant as the target of recursive references ([Ref]). As such, parser names should
 * be unique.
 *
 * # Definer
 *
 * Since some parsers are created through [Parser.invoke] their actual class name is something ugly
 * like `Seq##inlined##invoke#1`. To clean this up we introduce the notion of *definer*, which
 * is either the class name if subclassing directly, or the name of the function that holds the
 * [Parser.invoke] call.
 */
abstract class Parser (vararg val children: Parser): ParserBuilder
{
    companion object {
        private val inlinedSuffix = Regex("\\\$\\\$inlined\\\$invoke\\\$\\d+\$")

        /**
         * Use this builder to create subclasses of [Parser]. e.g.:
         *
         * ```
         * fun MyParser (vararg children: Parser) = Parser(*children) { ctx ->
         *     ...
         * }
         * ```
         *
         * If you are defining a singleton parser, you can also supply its [name] directly.
         */
        inline operator fun invoke(
            vararg children: Parser,
            name: String? = null,
            crossinline body: Parser.(Context) -> Result
        ): Parser
            = object : Parser(*children) {
                init { this.name = name }
                override fun _parse_(ctx: Context) = body(ctx)
    }       }

    /**
     * The name of this class, or the name of the function containing the [Parser.invoke]
     * call that created this parser.
     *
     * You can set this explicitly in order to more precisely define the nature of the
     * parser (e.g. if a parser class has important parameters, or for syntactic sugars).
     */
    var definer: String
        = javaClass.simpleName.replace(inlinedSuffix, "")

    /**
     * If [Autumn.DEBUG], the stack trace leading to the construction of this parser.
     * In particular, the top of the stack trace is the constructor of [Parser].
     */
    val lineage: List<StackTraceElement>?
        = (DEBUG) .. Throwable().stackTrace.toList()

    /**
     * See [Parser]
     */
    var name: String? = null

    /**
     * If true, don't trace the children of this parser when [Context.logTrace] is set.
     * Default: false.
     */
    var noTrace = false

    private var traceSuppressedAt = -1

    /// Parse --------------------------------------------------------------------------------------

    /**
     * Implementation of [parse]. Never call this directly, call [parse] instead.
     */
    abstract fun _parse_(ctx: Context): Result
    // NOTE: _parse_ is not protected, because this would generate an extra method call indirection

    internal class LogState {
        var lastResMsg: String = ""
        var depth = 1
    }

    /**
     * Called by [parse] before [_parse_].
     * @suppress
     */
    fun beforeParse(ctx: Context) {
        if (DEBUG) {
            ctx.trace.push(this to ctx.pos)
            ctx.debugTraceBeforeHook(ctx, this)
        }

        if (ctx.logTrace) {
            ctx.dbg.lastResMsg = ""
            ctx.logStream.println("${"-|".repeat(ctx.dbg.depth)} $this ($ctx.posStr)")
            ++ctx.dbg.depth
            if (noTrace) {
                traceSuppressedAt = ctx.dbg.depth
                ctx.logTrace = false
                ++ ctx.dbg.depth
            }
        }
        else if (noTrace && traceSuppressedAt != -1) {
            ++ ctx.dbg.depth
        }
    }

    /**
     * Called by [parse] after [_parse_].
     * @suppress
     */
    fun afterParse(ctx: Context, res: Result) {

        if (noTrace && traceSuppressedAt != -1) {
            -- ctx.dbg.depth
            if (traceSuppressedAt == ctx.dbg.depth) {
                traceSuppressedAt = -1
                ctx.logTrace = true
            }
        }

        if (ctx.logTrace) {
            --ctx.dbg.depth
            val resMsg = res.toString()
            if (resMsg != ctx.dbg.lastResMsg) {
                ctx.dbg.lastResMsg = resMsg
                ctx.logStream.println("${"-|".repeat(ctx.dbg.depth)}-> $resMsg")
            }
        }

        if (DEBUG) {
            ctx.trace.pop()
            ctx.debugTraceAfterHook(ctx, this)
        }
    }

    /**
     * See [Parser]. Implement through [invoke] preferably, or through [_parse_].
     */
    @Suppress("NOTHING_TO_INLINE")
    inline fun parse(ctx: Context): Result
    {
        val fail = ctx.failure
        ctx.failure = Success
        beforeParse(ctx)
        val r = _parse_(ctx)
        ctx.failure = Furthest.max(ctx.failure, r, fail)!!
        afterParse(ctx, r)
        return r
    }

    /// Strings ------------------------------------------------------------------------------------

    /**
     * Return the parser's [name] if set, or its definer and children.
     */
    fun fullString(): String
        = name ?: "${definer}(${children.map(Parser::fullString).joinToString()})"

    /**
     * Return the parser's [name] if set, or its definer.
     */
    override fun toString(): String
        = name ?: definer

    /// Failures -----------------------------------------------------------------------------------

    private val emptyString = {""}

    // ---------------------------------------------------------------------------------------------

    /**
     * Builds a failure whose message will be generated by [msg] (default: empty string).
     */
    fun failure(ctx: Context, msg: () -> String = emptyString): Failure
    {
        return if (!DEBUG) Failure(ctx.pos, this, msg)
        else DebugFailure(ctx.pos, this, msg, ctx.trace.link, ctx.snapshot())
    }

    // ---------------------------------------------------------------------------------------------

    /**
     * Builds a failure with cause [e], using `e.toString()` as message.
     */
    fun failure(ctx: Context, e: Throwable): Failure
    {
        val msg = { "$e" }
        return if (!DEBUG)
            Failure(ctx.pos, this, msg, e)
        else
            DebugFailure(ctx.pos, ctx.trace.peek()!!.first, msg, ctx.trace.link, ctx.snapshot(), e)
    }

    /// Utilities ----------------------------------------------------------------------------------

    /**
     * Calls [f] after making a snapshot.
     * If the result is [Failure], restores the snapshot.
     * Returns the result of [f].
     */
    inline fun transact(ctx: Context, f: () -> Result): Result
    {
        val snapshot = ctx.snapshot()
        return f().apply { if (this is Failure) ctx.restore(snapshot) }
    }

    /**
     * Shorthand for `if (cond()) Success else failure()` (see [failure]).
     */
    inline fun succeed(ctx: Context, cond: () -> Boolean): Result
        = if (cond()) Success else failure(ctx)

    /**
     * Shorthand for `if (cond) Success else failure(msg)` (see [failure]).
     */
    fun succeed(ctx: Context, cond: Boolean, msg: () -> String): Result
        = if (cond) Success else failure(ctx, msg)

    /// Debug Info ---------------------------------------------------------------------------------

    /**
     * If [Autumn.DEBUG], the [clickableString] of the first call **within a grammar field initializer**
     * that causes the parser to be constructed. Possibly null if the parser was non constructed
     * in an initializer.
     */
    fun useLocation(): String?
        = lineage.stream()
            .filter { it.isMethod(Grammar::class, "<init>") }
            .next()
            .let { it?.clickableString() }

    /**
     * If [Autumn.DEBUG], the [clickableString] where the parser is defined (i.e. the class declaration or
     * the call to [invoke]).
     */
    fun definitionLocation(): String? {
        if (lineage == null) return null
        val inlined = inlinedSuffix.find(lineage[1].className) != null
        return "at " + lineage[inlined .. 2 ?: 1]
    }

    /**
     * If [Autumn.DEBUG], the [clickableString] where the parser is constructed (i.e. the call to the
     * constructor or the call to the function calling [invoke]).
     */
    fun constructionLocation(): String? {
        if (lineage == null) return null
        val inlined = inlinedSuffix.find(lineage[1].className) != null
        return "at " + lineage[inlined .. 3 ?: 2]
    }

    // ---------------------------------------------------------------------------------------------

    override fun build() = this
}
