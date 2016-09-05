package norswap.autumn.syntax
import norswap.autumn.Parser
import norswap.autumn.ParserBuilder
import norswap.autumn.parsers.Choice
import norswap.autumn.parsers.Longest
import norswap.autumn.utils.mutable

// =================================================================================================

/**
 * Enables syntactic sugar to represent choices.
 *
 * e.g. you can write `(x / y / z).build()` for `Choice(x, y, z)`
 *
 * The `.build()` part is usually not necessary, as Autumn is setup to accept [ParserBuilder]
 * in most places.
 *
 * This can also be used to build a [Longest], through [longest].
 */
data class ChoiceBuilder (val list: MutableList<Parser>): ParserBuilder
{
    // ---------------------------------------------------------------------------------------------

    var built: Choice? = null

    // ---------------------------------------------------------------------------------------------

    /**
     * Convert this build into a [Choice].
     */
    override fun build (): Choice
    {
        if (built == null) {
            built = Choice(*list.toTypedArray())
        }
        return built!!
    }

    // ---------------------------------------------------------------------------------------------

    /**
     * Returns a builder that includes [right] in addition to the items in the current builder
     * (may mutate the current builder and return that it [build] hasn't been called yet).
     */
    operator fun div (right: ParserBuilder): ChoiceBuilder
    {
        if (built != null)
            return ChoiceBuilder(mutable(list + right.build()))

        list.add(right.build())
        return this
    }
}

// =================================================================================================

/**
 * Constructs a new [ChoiceBuilder] initially containing
 * a parser built from the received and [right].
 */
operator fun ParserBuilder.div (right: ParserBuilder)
    = ChoiceBuilder(mutableListOf(this.build(), right.build()))

// =================================================================================================

/**
 * Used in [choice] to enables syntactic sugar of the form:
 *
 *  ````
 *  choice {
 *      or { x }
 *      or { y }
 *  }
 *  ````
 */
class ChoiceBuilderEnv
{
    var builder = ChoiceBuilder(mutableListOf())

    inline fun or (clause: () -> ParserBuilder): Unit {
        builder = builder / clause()
    }
}

// =================================================================================================

/**
 * Builds a [Choice] using [ChoiceBuilderEnv].
 */
inline fun choice (body: ChoiceBuilderEnv.() -> Unit): Parser
{
    val env = ChoiceBuilderEnv()
    env.body()
    return env.builder.build()
}

// =================================================================================================

/**
 * Builds a [Longest] using [ChoiceBuilderEnv].
 */
inline fun longest (body: ChoiceBuilderEnv.() -> Unit): Longest
{
    val env = ChoiceBuilderEnv()
    env.body()
    return Longest(*env.builder.list.toTypedArray())
}

// -------------------------------------------------------------------------------------------------

/**
 * Builds a [Longest] from the supplied [ChoiceBuilder].
 */
inline fun longest (body: () -> ChoiceBuilder): Longest
{
    val builder = body()
    return Longest(*builder.list.toTypedArray())
}

// =================================================================================================