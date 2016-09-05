package norswap.arithg
import norswap.autumn.Grammar
import norswap.autumn.parsers.*
import norswap.autumn.syntax.*

class Arith5 : Grammar()
{
    val num
        = Digit().repeat1
        .build { Num(Integer.parseInt(str)) }

    val exp_
        = (+"^" .. num)
        .build(1) { Exp(get(), get()) }

    val exp
        = !(num .. exp_.repeat)

    val mul_
        = (+"*" .. exp)
        .build(1) { Mul(get(), get()) }

    val div_
        = (+"/" .. exp)
        .build(1) { Div(get(), get()) }

    val prod
        = !(exp .. (mul_ / div_).repeat)

    val add_
        = (+"+" .. prod)
        .build(1) { Sum(get(), get()) }

    val diff_
        = (+"-" .. prod)
        .build(1) { Sub(get(), get()) }

    val sum
        = !(prod .. (add_ / diff_).repeat)

    override val root = sum.alias
}
