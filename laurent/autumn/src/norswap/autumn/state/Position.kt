package norswap.autumn.state
import norswap.autumn.Context
import norswap.autumn.State

internal class Position (val ctx: Context): State<Int, Int>
{
    override fun snapshot()
        = ctx.pos

    override fun diff(snap: Int)
        = ctx.pos

    override fun restore(snap: Int) {
        ctx.pos = snap
    }

    override fun merge(delta: Int) {
        ctx.pos = delta
    }

    override fun equiv(pos: Int, snap: Int)
        = ctx.pos == snap

    override fun snapshotString(snap: Int, ctx: Context)
        = "$snap (${ctx.posToString(snap)})"
}