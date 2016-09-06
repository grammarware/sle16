package org.gemoc.execution.concurrent.ccsljavaxdsml.api.core;

import java.util.List;

import org.gemoc.xdsmlframework.api.core.IDisposable;

import fr.inria.diverse.trace.commons.model.trace.Step;


/**
 * allows to choose a LogicalStep among possible ones  
 * @author dvojtise
 *
 */
public interface ILogicalStepDecider extends IDisposable
{
	/**
	 * 
	 * @param possibleLogicalSteps
	 * @return The index of the selected logical step, -1 if no logical step selected.
	 */
	Step decide(IConcurrentExecutionEngine engine, List<Step> possibleLogicalSteps)  throws InterruptedException;
	
	/**
	 * Stop the decision making in progress.
	 * This should result in no chosen logical step.
	 * Has no effect if no decision making is in progress.
	 */
	void preempt();
	
}
