# Sources of the GEMOC Execution Framework

Since the paper is about a framework, it seemed important to provide the sources of this framework as part of the artifact submission. Thereby, we can show the concrete Java/Xtend interfaces and classes of the framework API that is described in the paper.

## Content summary

The source folders are the following:

- `ModelDebugging` contains:

	- the complete **execution framework** of the GEMOC Studio.
	- the Java engine, which is the main and reference implementation of the engine API.
	- a set of dedugging and generic execution trace addons that implement the addon API. 

Its content is directly taken from https://github.com/SiriusLab/ModelDebugging.
- `concurrency` contains the Java+Moccml execution engine, along with some addons that are only relevant for this engine. Its content is directly taken from https://github.com/gemoc/concurrency.
- `coordination` contains the coordination engine. Its content is directly taken from https://github.com/gemoc/coordination.
- `xmof`TODO
- `gemoc-studio` contains code common to the complete GEMOC Studio, and some examples. Its content is directly taken from https://github.com/gemoc/gemoc-studio.
- `gemoc-studio.wiki` contains the documentation of the GEMOC Studio. Its content is directly taken from  https://github.com/gemoc/gemoc-studio.wiki.git.

Note that the last two projects are only provided so that a complete GEMOC Studio can be compiled from this artifact submission (see last section of this README), and they are not mentionned thereafter.

## Decription of the execution framework

As explained in the paper, the execution framework provides facilities to define two sorts of components:

	- **addons**, which are components that implement runtime services (eg. debugging) that react to the progress of the execution of models.
	- **engines**, which are components responsible for starting and controlling the execution of interpreters of xDSMLs, and that must and notify addons of the progress of the execution of models.

All the content of the framework is found in the folder `ModelDebugging`, more precisely in the `framework` subfolder. We present both APIs in the following sections.

### Addon API

The addon API can be found in `ModelDebugging/tree/framework/framework_commons/plugins/org.gemoc.xdsmlframework.api/src/org/gemoc/xdsmlframework/api/engine_addon`.

It mostly consists of the Java interface `IEngineAddon.java`, which defines all the operations that are later used by the engine to notify of the progress of the execution of a model. For instance, `engineAboutToStart` is called when the execution starts, so that the addon can be initialized. Likewise, `aboutToExecuteStep` and `stepExecuted` are called by an engine before and after a step (respectively).

In addition to the interface, a class `DefaultEngineAddon` is provided with an empty default implementation of all operations of `IEngineAddon`. Thereby, addons do not have to implement operations for reacting to events they are not interested in.


### Engine API

The engine API can be found in two places:

- `ModelDebugging/framework/framework_commons/plugins/org.gemoc.xdsmlframework.api/src/org/gemoc/xdsmlframework/api/core` for the interfaces.
- `ModelDebugging/framework/execution_framework/plugins/org.gemoc.executionframework.engine/src/org/gemoc/executionframework/engine/core` for the partial abstract implementations.

The main interface is `IExecutionEngine.java`, which defines all the services that must be provided by an engine. This includes both operations to control the execution (eg. `start` and `stop`), and operations to retrieve information on the execution (eg. `getCurrentStack` or `getEngineStatus`).

Most importantly, the framework provides a generic partial implementation of this interface in the abstract class `AbstractExecutionEngine.java`. It implements all the operations of the interface, so that most of the interface state of an engine and all notifications to addons are already managed. For instance, the `start` operation is implemented to start the execution in a new thread, to notify addons, and to manage exceptions. In addition, operations are provided to help the implementation of concrete engines, such as `beforeExecutionStep` and `afterExecutionStep`, which manage transactions and notifications to addons.

In the *AbstractExecutionEngine*, an extensive usage is made of the [template method pattern](https://en.wikipedia.org/wiki/Template_method_pattern), using `final` and `abstract` keywords, to forbid concrete engines to override the APU, and so that developpers know directly which operations they must implement without any risk of error. For instance, using this abstract implementation, a concrete engine must implement `performStart` without having to deal with the notifications to engines, since it is already handled in `start`.

Lastly, a second abstract class `AbstractSequentialExecutionEngine.java` is provided, in which *AbstractExecutionEngine* is extended to provide helpers for execution engines that do not execute steps concurrently.


## The provided engines

### Java

The Java engine source code can be found in `ModelDebugging/java_execution/java_engine/plugins/org.gemoc.execution.sequential.javaengine/src/org/gemoc/execution/sequential/javaengine`. It consists of one class `PlainK3ExecutionEngine.java` (its name is due to legacy).

To execute operational semantics defined in Java, this engine must first find the `main` operation by analyzing the code, which is done in `prepareEntryPoint`. Once this is done, `executeEntryPoint` only consists in invoking this methos.

This engine then provides facilities to receive "callbacks" from the interpreter in order to send notifications to addons. This is handled in `executeStep`, which is called from the Java code directly. More precisely, a `StepCommand` object is given to the Java engine to execute.

### Java+Moccml

TODO

### xmof

TODO

### Coordination

TODO

## Compiling the studio

TODO

## The provided addons

TODO 
