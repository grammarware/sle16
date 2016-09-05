# Sources of the GEMOC Execution Framework

Since the paper is about a framework, it seemed important to provide the sources of this framework as part of the artifact submission. Thereby, we can show the concrete Java/Xtend interfaces and classes of the framework API that is described in the paper.

## Content summary

The source folders are the following:

- `ModelDebugging` contains the complete **execution framework** of the GEMOC Studio. In addition, it contains the Java engine, which is the main and reference implementation of the engine API, and a set of dedugging and generic execution trace addons that implement the addon API. Its content is directly taken from https://github.com/SiriusLab/ModelDebugging.
- `concurrency` contains the Java+Moccml execution engine, along with some addons that are only relevant for this engine. Its content is directly taken from https://github.com/gemoc/concurrency.
- `coordination` contains the coordination engine. Its content is directly taken from https://github.com/gemoc/coordination.
- `xmof`TODO
- `gemoc-studio` contains code common to the complete GEMOC Studio, and some examples. Its content is directly taken from https://github.com/gemoc/gemoc-studio.
- `gemoc-studio.wiki` contains the documentation of the GEMOC Studio. Its content is directly taken from  https://github.com/gemoc/gemoc-studio.wiki.git.

Note that the last two projects are only provided so that a complete GEMOC Studio can be compiled from this artifact submission (see last section of this README), and they are not mentionned thereafter.

## Decription of the execution framework

TODO

## The different engines

### Java

TODO

### Java+Moccml

TODO

### xmof

TODO

### Coordination

TODO

## Compiling the studio

TODO
