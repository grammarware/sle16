package norswap.arithg
import norswap.autumn.Grammar
import norswap.autumn.parsers.*
import norswap.autumn.syntax.*

class Arith1: Grammar()
{
    val num
        = Digit().repeat1

    val exp
        = !(num .. (+"^" .. !"exp").opt)

    val prod
        = !(exp .. (+"*" .. !"mul").opt)

    val sum
        = !(prod .. (+"+" .. !"sum").opt)

    override val root = sum.alias
}
