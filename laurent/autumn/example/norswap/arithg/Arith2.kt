package norswap.arithg
import norswap.autumn.Grammar
import norswap.autumn.parsers.*
import norswap.autumn.syntax.*

// FAILS
class Arith2 : Grammar()
{
    val num
        = Digit().repeat1
        .build { Num(Integer.parseInt(str)) }

    val exp
        = !(num .. (+"^" .. !"exp").opt)
        .build { Exp(get(), get()) }

    val prod
        = !(exp .. (+"*" .. !"mul").opt)
        .build { Mul(get(), get()) }

    val sum
        = !(prod .. (+"+" .. !"sum").opt)
        .build { Sum(get(), get()) }

    override val root = sum.alias
}
