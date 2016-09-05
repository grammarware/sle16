package norswap.autumn.syntax
import norswap.autumn.Parser
import norswap.autumn.ParserBuilder
import norswap.autumn.parsers.Seq
import norswap.autumn.utils.mutable

// =================================================================================================

/**
 * Enables syntactic sugar to represent choices.
 *
 * e.g. you can write `(x .. y .. z).build()` for `Seq(x, y, z)`
 *
 * The `.build()` part is usually not necessary, as Autumn is setup to accept [ParserBuilder]
 * in most places.
 */
data class SeqBuilder (val list: MutableList<Parser>): ParserBuilder
{
    // ---------------------------------------------------------------------------------------------

    var built: Seq? = null

    // ---------------------------------------------------------------------------------------------

    /**
     * Convert this build into a [Seq].
     */
    override fun build (): Seq
    {
        if (built == null) {
            built = Seq(*list.toTypedArray())
        }
        return built!!
    }

    // ---------------------------------------------------------------------------------------------

    /**
     * Returns a builder that includes [right] in addition to the items in the current builder
     * (may mutate the current builder and return that it [build] hasn't been called yet).
     */
    operator fun rangeTo (right: ParserBuilder): SeqBuilder
    {
        if (built != null)
            return SeqBuilder(mutable(list + right.build()))

        list.add(right.build())
        return this
    }
}

// =================================================================================================

/**
 * Constructs a new [SeqBuilder] initially containing
 * a parser built from the received and [right].
 */
operator fun ParserBuilder.rangeTo (right: ParserBuilder)
    = SeqBuilder(mutableListOf(this.build(), right.build()))

// =================================================================================================