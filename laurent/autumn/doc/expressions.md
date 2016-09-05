# Expressions

This is a short tutorial on how to express the syntax of expression in Autumn, including precedence
and associativity.

## Running Example: Arithmetics

We will consider a simple arithmetic language with addition (+), multiplication (*) and
exponentiation (^). Later we'll add subtraction (-), division (/) and assignment (=).
We will look at how to express this language and generate a corresponding abstract syntax tree
(AST).

A first approximation of the language grammar in pseudo-code could be

````
E = E `+` E
  / E `*` E
  / E `^` E
  / N
  
N = [0-9]+
````

## Precedence

Since our aim is ultimately to produce an AST, the first attempt is ambiguous:
does `(1 + 2 * 3)` mean `(1 + (2 * 3))` or `((1 + 2) * 3)`?

To disambiguate this, we'll introduce precedence. Like in usual arithmetic, exponentiation
has more precedence than multication, which has more precedence than addition. Hence
`(1 + 2 * 3)` really means `(1 + (2 * 3))`.

Here is a first attempt to express this:

````
E = M `+` E
  / M
  
M = X `*` M
  / X
  
X = N `^` X
  / N
````

> NOTE: Precedence is ultimately determined by the generated AST. However, AST generation
  follows the structure of the grammar pretty closely.

## Efficient Precedence

The last grammar is correct, but inefficient. Imagine we want to parse the string "42".

- N will match "42" easily enough.
- X will invoke N twice: first in the `N * X` clause then in `N`.
- X will invoke M twice (same idea).
- E will invoke M twice (same idea).

Hence by invoking E on "42", we will call N eight times (2 * 2 * 2), when really once would have
been sufficient.

As you add more operator at each level of precedence, and more levels of precedence the number
of invocations grows fast: it's an exponential after all.

Here is a better way to do it:

````
E = M (`+` E)?
M = X (`*` M)?
X = N (`^` X)?
````

We have proceeded to left-factor the grammar and now N will only be invoked once when parsing "42".

## Using Autumn's Kotlin DSL

Let's now abandon our pseudo-code and switch to the Autumn DSL. We'll proceed to rename
our rules in order to gain some clarity.

````
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
````

Notice the grammar is right-recursive: E appears in the right side of E's definition.

You'll need the following imports to make all the code in this tutorial compile:

````
import norswap.autumn.Grammar
import norswap.autumn.parsers.*
import norswap.autumn.syntax.*
````

Here are the classes for the AST we want to generate (`Diff` and `Div` will be used later):

````
interface Expr
data class Assign   (val l: Var,  var R: Expr): Expr
data class Sum      (val l: Expr, val r: Expr): Expr
data class Sub      (val l: Expr, val r: Expr): Expr
data class Mul      (val l: Expr, val r: Expr): Expr
data class Div      (val l: Expr, val r: Expr): Expr
data class Exp      (val l: Expr, val r: Expr): Expr
data class Num      (val v: Int)
data class Var      (val v: String)
````

## Building an AST

Let's try adding AST builders to our grammar:

````
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
````

This is incorrect: when parsing "42" the builders will fail because they can't find the second
item to include in `Exp`, `Mul` and `Sum`.

To correct this, we'll introduce rules to designate the optional suffixes. Their name will
end with an underscore.

````
class Arith3 : Grammar()
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

    val prod
        = !(exp .. mul_.opt)

    val add_
        = (+"+" .. !"sum")
        .build(1) { Sum(get(), get()) }

    val sum
        = !(prod .. add_.opt)

    override val root = sum.alias
}
````

Notice the `(1)` parameter to `build`. This means that the build block takes one "back argument",
i.e. that the block has access to one item pushed on the stack before the corresponding
parser was invoked.

Let's take `exp` invoked on "1 ^ 2": first, `num` is invoked and will match "1", resulting into a `Num`
instance being pushed on the stack. Then, `exp_` is invoked, and `exp` invoked recursively. We omit
the details of this invocation and just note it matches "2" and also pushes a `Num` on the stack.
Finally, the build block pops the two instances from the stack (despite only the second instance
having been pushed by the `build` parser) and pushes an `Exp` instance.

## Multiple operators with the same precedence

This may seem a bit complex, but consider that most often, a single level of precedence has multiple
operators. For instance, let's add operators for subtraction and division:

````
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
````

In this situation, it's important to have separated suffixes: if M appeared in both `sum` and
`diff`, we'd be back in our exponential scenario!

## Associativity

So far, all our operators are right-associative, meaning that `(1 + 2 + 3)` is interpreted
as `(1 + (2 + 3))`, not `((1 + 2) + 3)` (left-associative).

What if we want to make them left-associative,  as is usually the case for arithmetic operators?
This is especially important for exponentiation, which is not associative.

Here is how we'd do it for exponentiation:

````
val exp_
    = (+"^" .. atom)
    .build(1) { Exp(get(), get()) }

val exp
    = !(atom .. exp_.repeat)
````

Instead of recursively referencing `exp`, `exp_` now refers to `atom`. Additionally, `exp` now
contains `exp_.repeat` instead of `exp_.opt`.

The result is that `exp` start by building an atom, then, for each exponentiation operator ("^"), it
constructs a new `Exp` instance with the previously constructed expression on the left side.

Here is the new grammar, where all operators are left-associative:

````
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
````

Right and left-associative operators can mix, as long as they do not appear at the same precedence
level.

Sometimes, operators are more complex than simply accepting an expression to the left and to
the right.

To illustrate these two points, let's introduce an assignment operator:

````
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
````

First, we added `variable`, a new kind of primitive expression (or "atom") besides `number`.

Second we added `assign`, an assignment operator with the lowest precedence.

Despite the low precedence, only variables are valid on the left of the equal sign, not arbitrary
expressions. Consequently, in this case using an optional suffix does not work: an alternative
for other expressions (`sum`) is required.
