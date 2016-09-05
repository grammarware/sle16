# What is Autumn?

Autumn is a parsing library written in the [Kotlin] programming language.

One of its specificities is its ability to parse context-sensitive languages
through the introduction of *parse state*, which may be mutated during the parse.

[Kotlin]: https://kotlinlang.org/

Because Kotlin is fully [interoperable] with Java, it is in theory possible to use
Autumn with Java. However, this has never been tried, so the user experience is probably sucky.
We advise to stick with Kotlin for now.

[interoperable]: https://kotlinlang.org/docs/reference/java-to-kotlin-interop.html

# Basic Concepts

## Parsers

In Autumn, a language is defined through a collection of parsers.
A parser is an object that implements the `Parser` interface, which
defines the abstract method:

    abstract fun _parse_(ctx: Context): Result
    
A parser operates over a context, which encapsulates the input text,
as well as any state modified during the parse, for instance
the input position.

A parser tries to match a chunk of input, given the input position and other state held within
the context. The parser returns a `Result`, which is either an instance of `Success` or `Failure`.
In case of success, the parser advances the input position past the matched input.
In case of failure, diagnostic informations are included within the result, and the parser
**must** reset the context to the state it had when the parser was invoked.

<!-- TODO mov enote somewhere else -->

Note the underscores around the method name. Those are required because parsers are invoked by
calling `parser.parse(ctx)`, and `parse` wraps `_parse_` with some additional code.

Parsers may invoke other parsers, and so a language is actually defined by a (potentially cyclic)
graph of parsers.

Autumn supplies a number of pre-defined parsers and parser combinators. A parser combinator is a
function over parsers that returns a new parser combining the supplied parsers.
The user can also define its own custom parsers.

## Grammars

To define a language, we aggregate its parsers into a grammar.

A grammar is not strictly required to perform parsing, but it serves as a layer that supplies
many helpers to construct parsers.

A grammar is created by subclassing the `Grammar` class. Each parser-valued property
(`val` declaration) inside the new class will be indexed by the property name. This enables
forward references to parsers that haven't been defined yet (e.g. `!"expr"` is a forward reference
to a parser named `expr`). Such forward reference are essential in order to create recursive parsers.

## Context

The context of a parse encapsulates the input text, as well as any parse state. The most basic
state is the input position. Parsers know which part of the input they are supposed to match by
looking up the input position. Parsers can also modify the parse state, but only when they
succeed. .If it fails, a parser must keep the state unchanged, undoing any changes it
(or the parsers it invoked) already performed.
