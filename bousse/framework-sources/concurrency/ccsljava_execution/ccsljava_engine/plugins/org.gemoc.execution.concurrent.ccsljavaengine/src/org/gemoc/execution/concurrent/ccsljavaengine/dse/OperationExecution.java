package org.gemoc.execution.concurrent.ccsljavaengine.dse;

import java.util.function.Consumer;

import org.gemoc.execution.concurrent.ccsljavaxdsml.api.core.IConcurrentExecutionContext;
import org.gemoc.execution.concurrent.ccsljavaxdsml.api.core.IConcurrentExecutionEngine;

import fr.inria.diverse.trace.commons.model.trace.SmallStep;
import fr.inria.diverse.trace.commons.model.trace.Step;

public abstract class OperationExecution {

	private SmallStep smallStep;
	private IConcurrentExecutionEngine _engine;
	private Object _result;
	private Consumer<Step> beforeStepCallback;
	private Runnable afterStepCallback;

	protected OperationExecution(SmallStep smallStep, IConcurrentExecutionEngine engine,
			Consumer<Step> beforeStepCallback, Runnable afterStepCallback) {
		this.smallStep = smallStep;
		_engine = engine;
		this.beforeStepCallback = beforeStepCallback;
		this.afterStepCallback = afterStepCallback;
	}

	protected void beforeStepCallback(Step s) {
		beforeStepCallback.accept(s);
	}

	protected void afterStepCallback() {
		afterStepCallback.run();
	}

	abstract public void run();

	protected IConcurrentExecutionContext getExecutionContext() {
		return _engine.getConcurrentExecutionContext();
	}

	protected IConcurrentExecutionEngine getEngine() {
		return _engine;
	}

	protected SmallStep getSmallStep() {
		return smallStep;
	}

	protected void setResult(Object result) {
		_result = result;
	}

	protected Object getResult() {
		return _result;
	}
}
