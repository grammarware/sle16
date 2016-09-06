package org.gemoc.execution.concurrent.ccsljavaxdsml.api.moc;

import java.util.ArrayList;
import java.util.List;

import org.gemoc.execution.concurrent.ccsljavaxdsml.api.core.IConcurrentExecutionContext;
import org.gemoc.xdsmlframework.api.core.IDisposable;

import fr.inria.aoste.trace.EventOccurrence;
import fr.inria.aoste.trace.ModelElementReference;
import fr.inria.diverse.trace.commons.model.trace.Step;

/**
 * A Solver is the visible interface of any constraint solver system that runs
 * on its corresponding input based on a Model of Execution, returns Steps upon
 * requests and provides an API to influence the constraint-solving.
 * 
 * The steps it returns are based on the trace metamodel fr.inria.aoste.trace.
 * 
 * @author flatombe
 */
public interface ISolver extends IDisposable {
	/**
	 * Forces the underlying MoC structure to forbid the given EventOccurrence
	 * from ticking in the next step.
	 */
	public void forbidEventOccurrence(EventOccurrence eventOccurrence);

	/**
	 * Forces the underlying MoC structure to force the given EventOccurrence to
	 * tick in the next step.
	 */
	public void forceEventOccurrence(EventOccurrence eventOccurrence);

	/**
	 * Returns the currently possible LogicalSteps
	 * @return a list of LogicalSteps
	 */
	public List<Step> computeAndGetPossibleLogicalSteps();
	
	/**
	 * Returns the currently possible LogicalSteps
	 * @return a list of LogicalSteps
	 */
	public List<Step> updatePossibleLogicalSteps();
	
	/**
	 * among the currently possible LogicalStep (see {@link getPossibleLogicalSteps} ), asks the solver to choose one
	 * @return the logical step proposed from possible LogicalSteps 
	 */
	public Step proposeLogicalStep();
	
	/**
	 * ask the solver to apply the given LogicalStep and thus compute next step
	 * @param the LogicalStep to apply
	 */
	public void applyLogicalStep(Step logicalStep);


	public ArrayList<ModelElementReference> getAllDiscreteClocks();
	
	/**
	 * Gets the state of the solver at a given execution step.
	 * @return
	 */
	public byte[] getState();

	/**
	 * Sets the state of the solver as it was at a given step.
	 * @param serializableModel
	 */
	public void setState(byte[] serializableModel);

	public void revertForceClockEffect();

	/**
	 * Actions that could be done to prepare the workspace before any model is loaded
	 * Ie. in the context the model is not loaded yet
	 * @param context
	 */
	public void prepareBeforeModelLoading(IConcurrentExecutionContext context);
	
	/**
	 * Initialize the solver 
	 * The Executioncontext is supposed to be complete : uie. the model is loaded
	 * @param context
	 */
	public void initialize(IConcurrentExecutionContext context);
	
}
