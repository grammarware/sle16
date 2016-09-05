package norswap.arithg
import norswap.autumn.Grammar
import norswap.autumn.parsers.Digit
import norswap.autumn.syntax.*

class Arith4 : Grammar()
{
    val num
        = Digit().repeat1
        .build { Num(Integer.parseInt(str)) }

    val exp_
        = (+"^" .. !"exp")
        .build(1) { Exp(get(), get()) }

    val exp
        = !(num .. exp_.opt)

    val mul_
        = (+"*" .. !"mul")
        .build(1) { Mul(get(), get()) }

    val div_
        = (+"/" .. !"mul")
        .build(1) { Div(get(), get()) }

    val prod
        = !(exp .. (mul_ / div_).opt)

    val add_
        = (+"+" .. !"sum")
        .build(1) { Sum(get(), get()) }

    val sub_
        = (+"-" .. !"sum")
        .build(1) { Sub(get(), get()) }

    val sum
        = !(prod.. (add_ / sub_).opt)

    override val root = sum.alias
}
