# The Autumn Parsing Library

(The up-to-date home of Autumn is [github.com/norswap/autumn][u2d])

[u2d]: https://github.com/norswap/autumn

Autumn is a parsing library written in the [Kotlin] programming language.

One of its specificities is its ability to parse context-sensitive languages
through the introduction of *parse state*, which may be mutated during the parse.

[Kotlin]: https://kotlinlang.org/

Because Kotlin is fully [interoperable] with Java, it is in theory possible to use
Autumn with Java. However, this has never been tried, so the user experience is probably sucky.
We advise to stick with Kotlin for now.

[interoperable]: https://kotlinlang.org/docs/reference/java-to-kotlin-interop.html

## Table of Contents

- [Documentation](#documentation)
- [Download](#download)
- [Building](#building)
- [Getting Started](#getting-started)

## Documentation

Currently, the best source of documentation is the paper
[Taming Context-Sensitive Languages with Principled Stateful Parsing][paper].

[paper]:
http://conf.researchr.org/event/sle-2016/sle-2016-papers-taming-context-sensitive-languages-with-principled-stateful-parsing

The source includes plenty of comments. Here are a few key classes whose documentation
you might want to peruse:

- [Parser](/src/norswap/autumn/Parser.kt)
- [Context](/src/norswap/autumn/Context.kt)
- [Grammar](/src/norswap/autumn/Grammar.kt)

The package [norswap.autumn.parsers](/src/norswap/autumn/parsers)
contains the implementation of all built-in parsers, divided thematically.

The package [norswap.autumn.syntax](/src/norswap/autumn/syntax)
contains the definition of syntactic sugars for the aforementionned parsers.
The structure of this package mirrors that of `norswap.autumn.parsers`.

**All this documentation can be [consulted online as KDoc][kdoc] (Kotlin's Javadoc).**

[kdoc]: http://norswap.com/autumn/kotlin

If you make any change, you can re-generate the KDoc documentation with `make docs`.

## Download

A pre-built JAR file is [availble for download][jar], including all dependencies
excepted the Kotlin runtime.

[jar]: https://github.com/norswap/autumn/releases/download/0.1.0/autumn-0.1.0-fat.jar

## Building

### Command Line

Building requires a traditional Unix toolchain: `bash`, `make`, `curl`, `find` and `unzip`.
The build script also works fine on Windows with Cygwin/MSYS, provided you have installed the
required packages for the above commands.

    make build

This command will build the library, pulling dependencies if necessary, and
installing a repository-local copy of Kotlin 1.0.3 (~25MB) if required (i.e. if
`kotlin -version` fails or indicates another version).

The command only generates class files, usually you want to build a jar:

    make fatjar
    
This must be run after `make build`.

All outputs are put in the `out` directory. `.class` files are in
`out/production/autumn`, to be compatible with the IntelliJ IDEA default layout.

Explore the [makefile](makefile) for more useful commands.

### With IntellIJ IDEA

Just import the repository into IntelliJ IDEA, and IDEA should pickup how to build it, as
this repository includes the IDEA configuration.

If you run into any troubles, the setup is fairly straightforward:

- The `lib` directory needs to be in the classpath
- Compatibility: Java 1.8 and Kotlin 1.0.3

## Getting Started

In Autumn, grammars are defined using a Kotlin DSL. The only setup you need is to add the Autumn JAR
file to your classpath.

The best way to get started is to get a look at some examples:

- [Java](example/norswap/javag): A grammar for the language everybody loves to hate, complete
  with AST generation.
- [Examply](example/examply): The grammar for an imaginary language that features heavy use
  of parse state.
