package examply
import norswap.autumn.Context
import norswap.autumn.DEBUG
import norswap.autumn.diagnostic
import norswap.violin.utils.readFile

fun main(args: Array<String>) {
    DEBUG = true
    val input = readFile("example/examply/example2.ply")
    val context = Context(input, Examply)
    val result = context.parse()
    println(diagnostic(context, result))
    println(context.stack.toString(context))
}
