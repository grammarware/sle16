# Symbolic Execution of High-level Transformations
Ahmad Salim Al-Sibahi, Aleksandar S. Dimovski, Andrzej Wasowski

The development repository of this artifact is <https://github.com/models-team/SymexTRON>.

## SymexTRON

A tool for symbolically executing TRON programs and generate white-box tests.

### Prerequisites

* Scala 2.11 (tested with 2.11.8)
* SBT   0.13 (tested with 0.13.12)
* Internet access for SBT to download dependencies

To run the native Plingeling solver, you must have the `lib/solvers/‹platform›` folder on your `java.library.path` (where `‹platform›` should be replaced by either `darwin` (for OS X) or `linux`).
This can be achieved by changing the setting in the repository included `.sbtopts` file.
In case no native solver is available, it will fallback to the Java SAT4J solver which is compatible with more platforms but is slower.

### To build:

First go to the source directory by using `cd $HOME/Documents/SymexTRON` and then call `sbt compile`.

### To run tests:

Call `sbt test` in the SymexTRON directory.

### To run the evaluation:

Call `sbt run` in the SymexTRON directory.

The main evaluation source file is `src/main/scala/examples/evaluation/Evaluation.scala`, and it uses some of the example files
from the containing `examples` folder.

### To make an example program:

Make a new file with your example name e.g. `FooExample.scala` which contains an object `FooExample` that inherits from the `examples.Example` trait.
Then override the `classDefs` (containing the metamodel/type-definitions), `pres` (containing the initial memory) and `prog` (containing the TRON program) values to contain your desired program. Remember to add the following imports:

```
import semantics.domains._
import syntax.ast.Statement._
import syntax.ast._
```

For a simple example, see the `IdIterExample` in the `examples` package.

You can run an example by using `sbt 'run-main ‹example name›'`, e.g. `sbt 'run-main examples.IdIterExample'` for running the tool on the `IdIterExample`.
