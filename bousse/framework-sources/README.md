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

The Java+Moccml engine source code can be found in `concurrency/ccsljava_execution/ccsljava_engine/plugins/org.gemoc.execution.concurrent.ccsljavaengine/src/org/gemoc/execution/concurrent/ccsljavaengine/dse`. It mainly consists of the class `ConcurrentExecutionEngine.java`.

Compared to the Java engine, this engine does not rely on Java for the control flow of the operational semantics, but on a separate Moccml model. The execution of this Moccml model is realized using a solver called [Timesquare](http://timesquare.inria.fr/). Depending on the events computed by the solver, corresponding Java methods are called individually. Therefore, there is no need for callbacks from the Java code to the engine in this case, and there is no need to find the main operation of the semantics. More concretely, the execution in `performStart` consists of a `while` loop that constantly looks for new steps and execute them using `performExecutionStep`.



### Coordination

The coordination engine source code can be found in `coordination/heterogeneousCoordinationEngine/plugins/org.gemoc.execution.engine.coordinator.commons/src/org/gemoc/execution/engine/coordinator/commons/`, with the class `HeterogeneousEngine.java`.

This engine is a rather complex as it contains a list of coordinated engines (stored in `_coordinatedEngines`), and each step of the coordination engine is a set of steps of the coordinated ones.


### xmof

TODO

## The provided addons

### Generated trace addons

### Generic trace addon

### Concurrent omniscient debugger

### Sequential omniscient debugger

TODO

## Compiling the studio

To compile the studio, run the following command using maven:

~~~
mvn package -Dmaven.repo.local=$PWD/localm2 -P 'ignore_CI_repositories,!use_CI_repositories'
~~~

We use two options:

- `-Dmaven.repo.local=$PWD/localm2`: use a folder called *localm2* to cache all the external dependencies of the studio, instead of using the user local maven repository. Since the GEMOC Studio has around 1GB of dependencies, this avoids using this much space in a hidden folder of the user home dir.
- `-P 'ignore_CI_repositories,!use_CI_repositories'`: enables the maven profile `ignore_CI_repositories` and disables the profile `use_CI_repositories`, to disable the use of the update sites provided by GEMOC and to make sure that only local content is used.

If you prefer to use your own local maven repository (ie. in <HOME>/.m2/repository), use this command:

~~~
mvn package -P 'ignore_CI_repositories,!use_CI_repositories'
~~~

The resulting GEMOC Studio can be found in 

TODO

 
