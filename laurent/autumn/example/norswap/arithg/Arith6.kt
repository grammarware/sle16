package norswap.arithg
import norswap.autumn.Grammar
import norswap.autumn.parsers.*
import norswap.autumn.syntax.*

class Arith6 : Grammar()
{
    val num
        = Digit().repeat1
        .build { Num(Integer.parseInt(str)) }

    val variable
        = Alpha() .. AlphaNum().repeat
        .build { Var(str) }

    val atom
        = num / variable

    val exp_
        = (+"^" .. atom)
        .build(1) { Exp(get(), get()) }

    val exp
        = !(atom .. exp_.repeat)

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

    val assign
        = (variable .. +"=" .. !"expr")
        .build { Assign(get(), get()) }

    val expr
        = !(assign / sum)

    override val root = expr.alias
}
