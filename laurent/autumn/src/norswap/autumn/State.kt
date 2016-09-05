package norswap.autumn
import norswap.violin.utils.*
import norswap.violin.stream.*

////////////////////////////////////////////////////////////////////////////////////////////////////

/**
 * The correct implementation of this interface, coupled with the correct use of the corresponding
 * operations in [Context], ensures that the state changes made by failed parser invocations
 * (whenever [Parser.invoke] returns [Failure]) are discarded and not visible to subsequent parser
 * invocations. This makes state straightforward to use with PEG parsing.
 *
 * Each implementation of this interface represents some state that some parsers need to manipulate.
 * The idea is that it is possible to define new states (alongside new parsers). Instances of
 * [State] must be passed to [Context]'s constructor in order to be usable.
 *
 * Additionally, [Context] creates a few states automatically: one to handle input positions,
 * [Seeds] (left-recursion handling) and [MonotonicStack] (building a result, such as an AST).
 *
 * If you require per-parse global data that never changes, or per-parser mutable state that does
 * not impact parsing, use [InertState].
 */
interface State<Snapshot: Any, Delta: Any>
{
    // ---------------------------------------------------------------------------------------------

    /**
     * Make a snapshot of this state, which can be passed to [restore] to come back to this state.
     */
    fun snapshot(): Snapshot

    // ---------------------------------------------------------------------------------------------

    /**
     * Passed a value returned by [snapshot] to restore the state it captured.
     */
    fun restore(snap: Snapshot)

    // ---------------------------------------------------------------------------------------------

    /**
     * Returns a delta describing the difference between the current state and that captured by
     * [snap] (a value returned by [snapshot]).
     *
     * Since [snap] was taken, [restore] must not have been called with a snapshot that was taken
     * before [snap]. In other words, the current state is a *consequence* of [snap].
     */
    fun diff(snap: Snapshot): Delta

    // ---------------------------------------------------------------------------------------------

    /**
     * Applies the supplied [delta] (a value returned by [diff]) on top of the current state.
     */
    fun merge(delta: Delta)

    // ---------------------------------------------------------------------------------------------

    /**
     * Indicates if the current state has the same *consequences* as the state captured by
     * [snap] at position [pos].
     *
     * Two states have the same consequences at a position if calling
     * the same parser at that position with either of those states yields the same delta;
     * i.e. after calling the parser, [diff] yields the same result in both scenarios.
     */
    fun equiv(pos: Int, snap: Snapshot): Boolean

    // ---------------------------------------------------------------------------------------------

    /**
     * Returns a string representation of this state.
     *
     * Default implementation: `snapshotString(snapshot(), ctx)`
     */
    fun toString(ctx: Context)
        = snapshotString(snapshot(), ctx)

    // ---------------------------------------------------------------------------------------------

    /**
     * Returns a string representation of [snap].
     *
     * Please implement this properly in order to make debugging easier.
     */
    fun snapshotString(snap: Snapshot, ctx: Context): String
}

////////////////////////////////////////////////////////////////////////////////////////////////////
/*

The methods that follow are similar to those declared in [State], but allow an item of type [Any]
to be passed, automatically casting it to the correct type.

 */
// -------------------------------------------------------------------------------------------------

/**
 * Like [State.restore] but coerces [snap] to the proper type.
 */
fun <Snapshot: Any> State<Snapshot, *>.restore(snap: Any) {
    restore(snap.cast())
}

// -------------------------------------------------------------------------------------------------

/**
 * Like [State.diff] but coerces [snap] to the proper type.
 */
fun <Snapshot: Any, Delta: Any> State<Snapshot, Delta>.diff(snap: Any): Delta =
    diff(snap.cast())

// -------------------------------------------------------------------------------------------------

/**
 * Like [State.merge] but coerces [delta] to the proper type.
 */
fun <Delta: Any> State<*, Delta>.merge(delta: Any) {
    merge(delta.cast())
}

// -------------------------------------------------------------------------------------------------

/**
 * Like [State.equiv] but coerces [snap] to the proper type.
 */
fun <Snapshot: Any> State<Snapshot, *>.equiv(pos: Int, snap: Any) =
    equiv(pos, snap.cast())

// -------------------------------------------------------------------------------------------------

/**
 * Like [State.snapshotString] but coerces [snap] to the proper type.
 */
fun <Snapshot: Any> State<Snapshot, *>.snapshotString(snap: Any, ctx: Context) =
    snapshotString(snap.cast(), ctx)

////////////////////////////////////////////////////////////////////////////////////////////////////

/**
 * A snapshot of the parse state at a given point in the parse.
 *
 * This global snapshot is the aggregation of snapshot for each [State].
 */
class Snapshot (val elems: List<Any>)
{
    fun toString(ctx: Context): String
    {
        val b = StringBuilder()
        b += "snapshot {"
        ctx.states.stream().zip(elems.stream()).each {
            val (state, snap) = it
            b += "\n  ${state.javaClass.simpleName} = "
            b += state.snapshotString(snap, ctx).prependIndent("  ").trim()
        }
        if (!ctx.states.isEmpty()) b += "\n"
        b += "}"
        return b.toString()
    }

    // ---------------------------------------------------------------------------------------------

    override fun toString() = ">> use Snapshot.toString(Context) instead <<"
}

////////////////////////////////////////////////////////////////////////////////////////////////////

/**
 * The difference between two parse states (the current state at the time the delta was
 * created and a snapshot state).
 *
 * This global delta is the aggregation of the deltas for each [State].
 */
class Delta (val elems: List<Any>)

////////////////////////////////////////////////////////////////////////////////////////////////////

/*

NOTE(norswap)

Could this be made more efficient? Yes.

We could have a global "dirty" flag that would be set whenever any of the state changes.

We could have a "current" snapshot variable, which is set when creating or restoring a snapshot
(if "dirty" is false, we can reuse the last snapshot).

Whenever restoring, we can identity-compare the snapshot to restore with "current". If they are
the same, no work is required.

The exact same optimization ("dirty" + "current") could be performed at the level of individual
states.

*/
