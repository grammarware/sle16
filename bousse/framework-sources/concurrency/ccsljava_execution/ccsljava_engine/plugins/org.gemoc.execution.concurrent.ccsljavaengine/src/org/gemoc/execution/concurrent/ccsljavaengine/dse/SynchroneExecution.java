package org.gemoc.execution.concurrent.ccsljavaengine.dse;

import java.util.function.Consumer;

import org.gemoc.execution.concurrent.ccsljavaxdsml.api.core.IConcurrentExecutionEngine;
import org.gemoc.execution.concurrent.ccsljavaxdsml.api.dsa.executors.CodeExecutionException;
import org.gemoc.executionframework.engine.Activator;

import fr.inria.diverse.trace.commons.model.trace.SmallStep;
import fr.inria.diverse.trace.commons.model.trace.Step;

public class SynchroneExecution extends OperationExecution {

	protected SynchroneExecution(SmallStep smallStep, IConcurrentExecutionEngine engine, Consumer<Step> beforeStep,
			Runnable afterStep) {
		super(smallStep, engine, beforeStep, afterStep);
	}

	@Override
	public void run() {

		beforeStepCallback(getSmallStep());
		Object res = callExecutor();
		setResult(res);
		try {
			applyAnimationTime();
		} catch (InterruptedException e) {
			Activator.getDefault().error("Exception received " + e.getMessage(), e);
		}
		afterStepCallback();
	}

	/**
	 * Calls the {@link EventExecutor} for the given
	 * {@link EngineEventOccurence}.
	 * 
	 * @param mse
	 *            the {@link EngineEventOccurence} to execute
	 * @return the {@link FeedbackData} if any, <code>null</code> other wise
	 */
	private Object callExecutor() {
		Object res = null;

		try {
			res = getExecutionContext().getConcurrentExecutionPlatform().getCodeExecutor().execute(getSmallStep().getMseoccurrence());
		} catch (CodeExecutionException e) {
			Activator.getDefault().error("Exception received " + e.getMessage(), e);
		}

		return res;
	}

	private void applyAnimationTime() throws InterruptedException {
		int animationDelay = getEngine().getExecutionContext().getRunConfiguration().getAnimationDelay();
		if (animationDelay != 0) {
			Thread.sleep(animationDelay);
		}
	}

}
