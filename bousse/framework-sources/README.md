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
- `moliz.gemoc` contains the xMOF engine.
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


## Provided engines

### Java engine

The Java engine source code can be found in `ModelDebugging/java_execution/java_engine/plugins/org.gemoc.execution.sequential.javaengine/src/org/gemoc/execution/sequential/javaengine`. It consists of one class `PlainK3ExecutionEngine.java` (its name is due to legacy), which inherits *AbstractSequentialExecutionEngine*.

To execute operational semantics defined in Java, this engine must first find the `main` operation by analyzing the code, which is done in `prepareEntryPoint`. Once this is done, `executeEntryPoint` only consists in invoking this methos.

This engine then provides facilities to receive "callbacks" from the interpreter in order to send notifications to addons. This is handled in `executeStep`, which is called from the Java code directly. More precisely, a `StepCommand` object is given to the Java engine to execute.

### Java+MoCCML engine

The Java+MoCCML engine source code can be found in `concurrency/ccsljava_execution/ccsljava_engine/plugins/org.gemoc.execution.concurrent.ccsljavaengine/src/org/gemoc/execution/concurrent/ccsljavaengine/dse`. It mainly consists of the class `ConcurrentExecutionEngine.java`.

Compared to the Java engine, this engine does not rely on Java for the control flow of the operational semantics, but on a separate MoCCML model. The execution of this MoCCML model is realized using a solver called [Timesquare](http://timesquare.inria.fr/). Depending on the events computed by the solver, corresponding Java methods are called individually. Therefore, there is no need for callbacks from the Java code to the engine in this case, and there is no need to find the main operation of the semantics. More concretely, the execution in `performStart` consists of a `while` loop that constantly looks for new steps and execute them using `performExecutionStep`.



### xMOF engine

The xMOF engine can be found in, `moliz.gemoc/plugins/org.modelexecution.xmof.gemoc.engine/src/org/modelexecution/xmof/gemoc/engine`, with the class `XMOFExecutionEngine.java`, which inherits *AbstractSequentialExecutionEngine*.

To notify addons, this engine relies on the observer mechanism provided by the xMOF interpreter, which makes possible to listen to the progress of the execution semantics. Thereby, the xMOF engine listens to the beginning and end of each xMOF activiy, and can call `beforeExecutionStep` and `afterExecutionStep`.


### BCOoL engine

The BCOoL engine source code can be found in `coordination/heterogeneousCoordinationEngine/plugins/org.gemoc.execution.engine.coordinator.commons/src/org/gemoc/execution/engine/coordinator/commons/`, with the class `HeterogeneousEngine.java`.

This engine is a rather complex as it contains a list of coordinated engines (stored in `_coordinatedEngines`), and each step of the coordination engine is a set of steps of the coordinated ones.


## Provided addons


### Graphical Animator

The graphical animator reacts to execution steps and is responsible for updating the view when the model changes, and highlighting the element that called the last execution step. It can be found in `ModelDebugging/framework/execution_framework/plugins/org.gemoc.executionframework.extensions.sirius/src/org/gemoc/executionframework/extensions/sirius/services`, with the class `AbstractGemocAnimatorServices.java`, which contains an inner class *GemocModelAnimator*.

### Execution Trace Addons

#### Generic trace addon

The generic trace addon makes it possible to capture an execution trace for any kind of execution. Such trace contains both the reached execution states (using generic snapshots/clones), the executed steps (possibly concurrent), and the choices made during the execution. Its class can be found in `concurrency/ccsljava_execution/ccsljava_engine/plugins/org.gemoc.execution.concurrent.ccsljavaengine/src/org/gemoc/execution/concurrent/ccsljavaengine/eventscheduling/trace` with `EventSchedulingModelExecutionTracingAddon.java`.

As an addon, it mostly reacts to execution steps in order to create a snapshot/clone of the model when a change is observed after a step, and in order to store the execution steps themselves. The generated traces conform to a generic trace metamodel available in `ModelDebugging/framework/framework_commons/plugins/org.gemoc.executionframework.reflectivetrace.model`.

#### Trace addons generator

The trace addon generator can create a trace addon specific to an xDSML, which includes a trace metamodel specific to the xDSML. It can be found in the projects:

- `ModelDebugging/trace/generator/plugins/fr.inria.diverse.trace.gemoc.generator` for the integration of the generator in the GEMOC Studio,
- `ModelDebugging/trace/generator/plugins/fr.inria.diverse.trace.plugin.generator` for the generic core part of the generator,
- `ModelDebugging/trace/generator/plugins/fr.inria.diverse.trace.metamodel.generator` for the trace metamodel generator.

Other projects also integrate this generator with engines (eg. Java or xmof).

Generated addons extend the class *AbstractTraceAddon*, which is found in `ModelDebugging/trace/generator/plugins/fr.inria.diverse.trace.gemoc/src/fr/inria/diverse/trace/gemoc/traceaddon/AbstractTraceAddon.xtend`, in which most of the code for reacting to notifications is found. Similarly to the generic trace addon, a trace is created by reacting to execution steps, but the trace will in this case conform to the generated trace metamodel.

### Omniscient Debuggers

#### Concurrent omniscient debugger

The concurrent omniscient debugger provides interactive omniscient debugging facilities to pause/unpause the execution, and to "go back in time" in order to make different decisions. It can be found in `concurrency/ccsljava_execution/ccsljava_engine/plugins/org.gemoc.execution.concurrent.ccsljavaengine/src/org/gemoc/execution/concurrent/ccsljavaengine/eventscheduling/trace` with `EventSchedulingModelExecutionTracingAddon.java` and in `concurrency/concurrent_addons/plugins/org.gemoc.concurrent_addons.eventscheduling.timeline/src/org/gemoc/concurrent_addons/eventscheduling/timeline/views/timeline/EventSchedulingTimeLineView.java`. It reacts to execution step and pause the thread if required (eg. end of a "step into" action, breakpoint, etc.). It relies on the generic trace addon for the omniscient debugging facilities (ie. going back).

#### Sequential multidimensional omniscient debugger

Similarly to the concurrent omniscient debugger, the sequential omniscient debugger provides interactive omniscient debugging facilities, but also provide multidimensional navigation facilities. It can be found in `ModelDebugging/java_execution/java_engine/plugins/org.gemoc.execution.sequential.javaengine.ui/src/org/gemoc/execution/sequential/javaengine/ui/debug/OmniscientGenericSequentialModelDebugger.xtend`. Likewise, it reacts to step notifications to pause the engine when needed, and reads the model to display current values. 

### Other addons

- The VCD addon can be found in `concurrency/concurrent_addons/plugins/fr.inria.aoste.timesquare.backend.vcdgenerator.gemocAdaptation/src/fr/inria/aoste/timesquare/backend/vcdgenerator/manager/VCDGeneratorManager.java`. It displays all the events that occured during the execution, and the relationships between them.
- The step manager addon can be found in `concurrency/ccsljava_execution/ccsljava_engine/plugins/org.gemoc.execution.concurrent.ccsljavaengine.ui/src/main/java/org/gemoc/execution/concurrent/ccsljavaengine/ui/views/stimulimanager/StimuliManagerView.java`. It allows the user to see all possible steps, and to enforce some of them (eg. to simulate the environment).
- The step decider addon can be found in `concurrency/ccsljava_execution/ccsljava_engine/plugins/org.gemoc.execution.concurrent.ccsljavaengine.ui/src/main/java/org/gemoc/execution/concurrent/ccsljavaengine/ui/views/step/LogicalStepsView.java`. It provides an UI to decide which next step should occur.

## Compiling the studio (optional)

### Obtaining a base studio without xMOF

Even if a compiled studio is available as the second part of our artifact submission, to compile the studio, run the following command using maven:

~~~
mvn package -Dmaven.repo.local=$PWD/localm2 -P 'ignore_CI_repositories,!use_CI_repositories'
~~~

We use these options:

- `-Dmaven.repo.local=$PWD/localm2`: use a folder called *localm2* to cache all the external dependencies of the studio, instead of using the user local maven repository. Since the GEMOC Studio has around 1GB of dependencies, this avoids using this much space in a hidden folder of the user home dir.
- `-P 'ignore_CI_repositories,!use_CI_repositories'`: enables the maven profile `ignore_CI_repositories` and disables the profile `use_CI_repositories`, to disable the use of the update sites provided by GEMOC and to make sure that only local content is used.

If you prefer to use your own local maven repository (ie. in `<HOME>/.m2/repository`), remove the use of `-Dmaven.repo.local`.

If you already compiled and resolved all dependencies at least once (ie. if you filled your local maven repository with everything needed for the build), add the option `-o` to perform an offline only build, which is signficantly faster since it skips checking all maven repositories online. 

In the end, the result can then be found in `gemoc_studio/releng/org.gemoc.gemoc_studio.product/target/products/`, with one studio zip per platform. Unzip the GEMOC Studio corresponding to your platform, and start it.

### Adding xMOF to the studio

In addition to the basic GEMOC studio, the compilation process also created an eclipse update site for the xMOF engine and components. The update site is created in `moliz.gemoc/releng/org.modelexecution.xmof.gemoc.updatesite/target/repository`.

To add the xMOF engine to the obtained studio:

1. Start the GEMOC studio that you compiled
2. Go to *Help*, *Install New Software...*
3. Click on *Add* to add an update site
4. Click on *Local* and select the folder `moliz.gemoc/releng/org.modelexecution.xmof.gemoc.updatesite/target/repository`
5. Select the xMOF GEMOC feature
6. Click on finish
