@file:Suppress("UNCHECKED_CAST")
package norswap.autumn
import norswap.triemap.ImmutableMap
import norswap.triemap.TrieMap
import norswap.violin.Copyable
import norswap.violin.stream.*
import norswap.violin.link.*
import norswap.violin.Stack
import norswap.violin.utils.plusAssign

////////////////////////////////////////////////////////////////////////////////////////////////////

/**
 * For states that never change, whose changes do not impact parsing, or where backtracking
 * over state changes never has adverse consequences.
 *
 * !! Carefully check that you're within the above parameter before using this kind of state.
 */
interface InertState<Self: InertState<Self>>: State<Self, InertState.SameState> {
    object SameState
    override fun snapshot() = this as Self
    override fun restore(snap: Self) {}
    override fun diff(snap: Self) = SameState
    override fun merge(delta: SameState) {}
    override fun equiv(pos: Int, snap: Self) = this === snap
    override fun snapshotString(snap: Self, ctx: Context) = "$this"
}

////////////////////////////////////////////////////////////////////////////////////////////////////

/**
 * The actual state is held in the container [C], which is copied wholesale when snapshot,
 * diffing, restoring and merging. This works well for states that just comprise a few fixed fields.
 *
 * Two copy states are equivalent only if their content are identical,
 * hence [snapshot] == [diff] and [restore] == [merge].
 */
open class CopyState<C: Copyable>(var get: C): State<C, C> {
    override fun snapshot(): C = get.copycast()
    override fun restore(snap: C) { get = snap.copycast() }
    override fun diff(snap: C): C = get.copycast()
    override fun merge(delta: C) { get = delta.copycast() }
    override fun equiv(pos: Int, snap: C) = this == snap
    override fun snapshotString(snap: C, ctx: Context) = "$get"
    override fun toString() = "$get"
}

////////////////////////////////////////////////////////////////////////////////////////////////////

/**
 * Pass value between parsers by pushing and popping them on the stack.
 *
 * Two stacks are equivalent only if they are identical,
 * hence [snapshot] == [diff] and [restore] == [merge].
 */
open class StackState<T: Any> (private var stack: LinkList<T> = LinkList())
: State<LinkList<T>, LinkList<T>>, Stack<T>
{
    // Delegate
    override fun stream() = stack.stream()
    override val size: Int /**/ get() = stack.size
    override fun push(item: T) = stack.push(item)
    override fun peek() = stack.peek()
    override fun pop() = stack.pop()
    override fun at(depth: Int) = stack.at(depth)

    override fun snapshot() = stack.clone()
    override fun restore(snap: LinkList<T>) { stack = snap.clone() }
    override fun diff(snap: LinkList<T>): LinkList<T> = stack.clone()
    override fun merge(delta: LinkList<T>) { stack = delta.clone() }
    override fun equiv(pos: Int, snap: LinkList<T>) = stack == snap
    override fun snapshotString(snap: LinkList<T>, ctx: Context) = "[$snap]-|"
    override fun toString() = "[$stack]-|"
}

////////////////////////////////////////////////////////////////////////////////////////////////////

/**
 * A stack with a special restriction: its [diff] operation assumes that the snapshot is a prefix
 * of the current stack (items were pushed, but none were popped).
 *
 * The prefix checking uses identity checks, so you can't pop an item, push it back and pretend
 * it's alright. Use [peek] or [at] instead.
 *
 * The restriction is naturally respected when using the stack to build a syntax tree in the
 * usual fashion: each parser only pops items that were pushed by its descendants.
 * In that case, a snapshot taken before a parser invocation is always a prefix of the stack after
 * invocation.
 */
open class MonotonicStack<T: Any>(private var stack: LinkList<T> = LinkList())
: State<LinkList<T>, LinkList<T>>, Stack<T>
{
    // Delegate
    override fun stream() = stack.stream()
    override val size: Int /**/ get() = stack.size
    override fun push(item: T) = stack.push(item)
    override fun peek() = stack.peek()
    override fun pop() = stack.pop()
    override fun at(depth: Int) = stack.at(depth)

    override fun snapshot() = stack.clone()
    override fun restore(snap: LinkList<T>) { stack = snap.clone() }

    override fun diff(snap: LinkList<T>): LinkList<T> {
        if (snap.size > stack.size) illegalState()
        val stream = stack.linkStream()
        val diff = stream.limit(stack.size - snap.size).map { it.item }.linkList()
        if (stream.next() !== snap.link) illegalState()
        return diff
    }

    private fun illegalState() =
        IllegalStateException("Supplied snapshot could not be a prefix of current stack.")

    override fun merge(delta: LinkList<T>)
        = delta.stream().each { stack.push(it) }

    override fun equiv(pos: Int, snap: LinkList<T>) = true
    override fun snapshotString(snap: LinkList<T>, ctx: Context) = "[$snap]-|"
    override fun toString() = "[$stack]-|"
}

////////////////////////////////////////////////////////////////////////////////////////////////////

open class MapState<K: Any, V: Any>(private var map: TrieMap<K, V> = TrieMap())
: State<TrieMap<K, V>, TrieMap<K, V>>, ImmutableMap<K, V>
{
    override fun get(k: K) = map.get(k)

    override fun put(k: K, v: V): MapState<K, V> {
        map = map.put(k, v)
        return this
    }

    override fun remove(k: K): MapState<K, V> {
        map = map.remove(k)
        return this
    }

    override val size = map.size

    override fun snapshot() = map

    override fun restore(snap: TrieMap<K, V>) { map = snap }

    override fun diff(snap: TrieMap<K, V>) = map

    override fun merge(delta: TrieMap<K, V>) { map = delta }

    override fun equiv(pos: Int, snap: TrieMap<K, V>) = map === snap

    override fun snapshotString(snap: TrieMap<K, V>, ctx: Context): String {
        val b = StringBuilder()
        b += "{"
        for ((k, v) in map)
            b += "\n    $k = $v"
        if (!map.empty) b += "\n"
        b += "}"
        return b.toString()
    }
}

////////////////////////////////////////////////////////////////////////////////////////////////////
