package norswap.autumn.syntax
import norswap.autumn.BuildEnv
import norswap.autumn.Grammar
import norswap.autumn.Parser
import norswap.autumn.ParserBuilder
import norswap.autumn.parsers.*

/*
This file contains syntactic facilities to define the syntax of expression,
especially regarding associativity.

TODO documentation
 */

// =================================================================================================

class Operator (val op: ParserBuilder)
{
    var builder: (BuildEnv.() -> Any)? = null

    fun build (body: BuildEnv.() -> Any): Operator {
        builder = body
        return this
    }

    operator fun div (right: Operator)
        = Operators(mutableListOf(this, right))
}

// =================================================================================================

class Operators (val list: MutableList<Operator>)
{
    operator fun div (right: Operator): Operators {
        list.add(right)
        return this
    }
}

// =================================================================================================

fun op (body: () -> ParserBuilder)
    = Operator(body())

// =================================================================================================

fun Grammar.right (self: String, lower: ParserBuilder, body: () -> Operators): Parser
{
    val list = body().list.map {
        val seq = Seq(it.op.build(), !self)
        if (it.builder != null)
            Build(seq, 1, it.builder!!)
        else
            seq
    }
    return Seq(lower.build(), Opt(Choice(*list.toTypedArray())))
}

// =================================================================================================

fun Grammar.left (lower: ParserBuilder, body: () -> Operators): Parser
{
    val list = body().list.map {
        val seq = Seq(it.op.build(), lower.build())
        if (it.builder != null)
            Build(seq, 1, it.builder!!)
        else
            seq
    }
    return Seq(lower.build(), ZeroMore(Choice(*list.toTypedArray())))
}

// =================================================================================================
