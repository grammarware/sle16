package norswap.autumn.state
import norswap.autumn.Context
import norswap.autumn.State
import norswap.autumn.result.*

internal class FurthestFailure (val ctx: Context): State<Result, Result>
{
    override fun snapshot()
        = ctx.failure

    override fun diff(snap: Result)
        = ctx.failure

    override fun restore(snap: Result) {
        ctx.failure = Furthest.max(ctx.failure, snap)
    }

    override fun merge(delta: Result)  {
        ctx.failure = Furthest.max(ctx.failure, delta)
    }

    override fun equiv(pos: Int, snap: Result)
        = true

    override fun snapshotString(snap: Result, ctx: Context)
        = "$snap"
}