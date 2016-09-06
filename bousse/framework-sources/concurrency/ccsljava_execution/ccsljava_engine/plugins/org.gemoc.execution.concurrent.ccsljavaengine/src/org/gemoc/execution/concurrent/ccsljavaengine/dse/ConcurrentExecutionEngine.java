package org.gemoc.execution.concurrent.ccsljavaengine.dse;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.function.Consumer;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.gemoc.execution.concurrent.ccsljavaengine.concurrentmse.FeedbackMSE;
import org.gemoc.execution.concurrent.ccsljavaxdsml.api.core.IConcurrentExecutionContext;
import org.gemoc.execution.concurrent.ccsljavaxdsml.api.core.IConcurrentExecutionEngine;
import org.gemoc.execution.concurrent.ccsljavaxdsml.api.core.IFutureAction;
import org.gemoc.execution.concurrent.ccsljavaxdsml.api.core.ILogicalStepDecider;
import org.gemoc.execution.concurrent.ccsljavaxdsml.api.dsa.executors.CodeExecutionException;
import org.gemoc.execution.concurrent.ccsljavaxdsml.api.dsa.executors.ICodeExecutor;
import org.gemoc.execution.concurrent.ccsljavaxdsml.api.dse.IMSEStateController;
import org.gemoc.execution.concurrent.ccsljavaxdsml.api.moc.ISolver;
import org.gemoc.executionframework.engine.Activator;
import org.gemoc.executionframework.engine.core.AbstractExecutionEngine;
import org.gemoc.executionframework.engine.core.CommandExecution;
import org.gemoc.executionframework.engine.core.EngineStoppedException;
import org.gemoc.xdsmlframework.api.core.EngineStatus;
import org.gemoc.xdsmlframework.api.core.IDisposable;
import org.gemoc.xdsmlframework.api.core.IExecutionContext;
import org.gemoc.xdsmlframework.api.core.IExecutionEngine;
import org.gemoc.xdsmlframework.api.engine_addon.IEngineAddon;

import fr.inria.aoste.timesquare.ecl.feedback.feedback.ActionModel;
import fr.inria.aoste.timesquare.ecl.feedback.feedback.When;
import fr.inria.diverse.trace.commons.model.trace.MSE;
import fr.inria.diverse.trace.commons.model.trace.ParallelStep;
import fr.inria.diverse.trace.commons.model.trace.SmallStep;
import fr.inria.diverse.trace.commons.model.trace.Step;

/**
 * Basic abstract implementation of the ExecutionEngine, independent from the technologies used for the solver, the
 * executor and the feedback protocol. It can display the runtime execution information to its registered observers.
 * 
 * There are two phases of initializations for this entity:
 * <ul>
 * <li>the constructor sets the language-specific elements such as DomainSpecificEvents, Solver, EventExecutor,
 * FeedbackPolicy</li>
 * <li>the initialize method sets the model-specific elements such as Model and ModelLoader.</li>
 * </ul>
 * From the Model, we can derive :
 * <ul>
 * <li>the Model of Execution (using the DomainSpecificEvents)</li>
 * <li>the Higher-order-transformation (TODO)) and the Solver Input (using the Model of Execution and the Solver Input
 * Builder provided by the Solver).</li>
 * </ul>
 * 
 * There are a few elements that could enter the ExecutionEngine, maybe after being reified as their own data
 * structures:
 * <ul>
 * <li>{@link #scheduledSteps} is the FIFO of LogicalSteps. We use a FIFO because sometimes we may want to memorize
 * steps in order to go back in the past and replay given steps. When the engine seeks to reach the next step of
 * execution, it will first check if there is something in this FIFO. If there is not, then a new step is requested from
 * the solver.</li>
 * <li>{@link #schedulingTrace} is a map recording the order in which the steps of the solver have been used.</li>
 * <li>{@link #scheduledEventsMap} records which step is linked to which list of MSEs. It is to be noticed that not all
 * the MSEs were executed. Indeed, some may have been illegal at the time (with regards to the MoC) and thus discarded
 * during the execution of this step.</li>
 * <li>{@link #executionTrace} records the steps and the actual MSEs that were actually executed.</li>
 * </ul>
 * 
 * @see IExecutionEngine
 * 
 * @author flatombe
 * @author didier.vojtisek@inria.fr
 * @author julien.deantoni@polytech.unice.fr
 * @param <T>
 * 
 */
public class ConcurrentExecutionEngine extends AbstractExecutionEngine
		implements IDisposable, IConcurrentExecutionEngine {

	private IMSEStateController _mseStateController;

	private void switchDeciderIfNecessary() {
		if (getLogicalStepDecider() != null && getLogicalStepDecider() != _logicalStepDecider) {
			_logicalStepDecider = getLogicalStepDecider();
		}
	}

	protected ILogicalStepDecider _logicalStepDecider;

	@Override
	public ILogicalStepDecider getLogicalStepDecider() {
		return _logicalStepDecider;
	}

	@Override
	public void changeLogicalStepDecider(ILogicalStepDecider newDecider) {
		_logicalStepDecider = newDecider;
	}

	public void computePossibleLogicalSteps() {
		_possibleLogicalSteps = getSolver().computeAndGetPossibleLogicalSteps();
	}

	public void updatePossibleLogicalSteps() {
		for (IMSEStateController c : getConcurrentExecutionContext().getConcurrentExecutionPlatform()
				.getMSEStateControllers()) {
			c.applyMSEFutureStates(getSolver());
		}
		synchronized (this) {
			_possibleLogicalSteps = getSolver().updatePossibleLogicalSteps();
		}
	}

	@Override
	public void recomputePossibleLogicalSteps() {
		getSolver().revertForceClockEffect();
		updatePossibleLogicalSteps();
		notifyProposedLogicalStepsChanged();
	}

	protected List<Step> _possibleLogicalSteps = new ArrayList<>();

	@Override
	public List<Step> getPossibleLogicalSteps() {
		synchronized (this) {
			return new ArrayList<Step>(_possibleLogicalSteps);
		}
	}

	@Override
	protected final void performStop() {
		setSelectedLogicalStep(null);
		if (getLogicalStepDecider() != null) {
			// unlock decider if this is a user decider
			getLogicalStepDecider().preempt();
		}

	}

	public void notifyLogicalStepSelected() {
		for (IEngineAddon addon : getExecutionContext().getExecutionPlatform().getEngineAddons()) {
			try {
				addon.stepSelected(this, getSelectedLogicalStep());
			} catch (Exception e) {
				Activator.getDefault().error("Exception in Addon " + addon + ", " + e.getMessage(), e);
			}
		}
	}

	public void notifyAboutToSelectLogicalStep() {
		for (IEngineAddon addon : getExecutionContext().getExecutionPlatform().getEngineAddons()) {
			try {
				addon.aboutToSelectStep(this, getPossibleLogicalSteps());
			} catch (Exception e) {
				Activator.getDefault().error("Exception in Addon " + addon + ", " + e.getMessage(), e);
			}
		}
	}

	protected Step _selectedLogicalStep;

	@Override
	public Step getSelectedLogicalStep() {
		synchronized (this) {
			return _selectedLogicalStep;
		}
	}

	@Override
	public void setSelectedLogicalStep(Step ls) {
		synchronized (this) {
			_selectedLogicalStep = ls;
		}
	}

	/**
	 * 
	 * @return the IConcurrenExecutionContext or null if no such context is available
	 */
	@Override
	public IConcurrentExecutionContext getConcurrentExecutionContext() {

		IExecutionContext context = getExecutionContext();
		if (context instanceof IConcurrentExecutionContext) {
			return (IConcurrentExecutionContext) context;
		} else
			return null;
	}

	private ISolver _solver;

	@Override
	public ISolver getSolver() {
		return _solver;
	}

	public void notifyProposedLogicalStepsChanged() {
		for (IEngineAddon addon : getExecutionContext().getExecutionPlatform().getEngineAddons()) {
			try {
				addon.proposedStepsChanged(this, getPossibleLogicalSteps());
			} catch (Exception e) {
				Activator.getDefault().error("Exception in Addon " + addon + ", " + e.getMessage(), e);
			}
		}
	}

	@Override
	public String toString() {
		return this.getClass().getName() + "@[Executor=" + getCodeExecutor() + " ; Solver=" + getSolver()
				+ " ; ModelResource=" + _executionContext.getResourceModel() + "]";
	}

	public void performExecutionStep() throws InterruptedException {
		switchDeciderIfNecessary();
		computePossibleLogicalSteps();
		updatePossibleLogicalSteps();
		// 2- select one solution from available logical step /
		// select interactive vs batch
		if (_possibleLogicalSteps.size() == 0) {
			Activator.getDefault().debug("No more LogicalStep to run");
			stop();
		} else {
			// Activator.getDefault().debug("\t\t ---------------- LogicalStep "
			// + count);
			Step selectedLogicalStep = selectAndExecuteLogicalStep();
			// 3 - run the selected logical step
			// inform the solver that we will run this step
			if (selectedLogicalStep != null) {
				getSolver().applyLogicalStep(selectedLogicalStep);
				engineStatus.incrementNbLogicalStepRun();
			} else {
				// no logical step was selected, this is most probably due to a
				// preempt on the LogicalStepDecider and a change of Decider,
				// notify Addons that we'll rerun this ExecutionStep
				// recomputePossibleLogicalSteps();
			}
		}
	}

	private Step selectAndExecuteLogicalStep() throws InterruptedException {
		setEngineStatus(EngineStatus.RunStatus.WaitingLogicalStepSelection);
		notifyAboutToSelectLogicalStep();
		Step selectedLogicalStep = getLogicalStepDecider().decide(this, getPossibleLogicalSteps());
		if (selectedLogicalStep != null) {
			setSelectedLogicalStep(selectedLogicalStep);
			setEngineStatus(EngineStatus.RunStatus.Running);
			notifyLogicalStepSelected();
			// run all the event occurrences of this logical
			// step
			executeSelectedLogicalStep();
		}
		return selectedLogicalStep;
	}

	/**
	 * run all the event occurrences of this logical step
	 * 
	 * @param logicalStepToApply
	 */
	@SuppressWarnings("unchecked")
	public void executeSelectedLogicalStep() {
		// = step in debug mode, goes to next logical step
		// -> run all event occurrences of the logical step
		// step into / open internal thread and pause them
		// each concurrent event occurrence is presented as a separate
		// thread in the debugger
		// execution feedback is sent to the solver so it can take internal
		// event into account
		if (!_isStopped) { // execute while stopped may occur when we push the
							// stop button when paused in the debugger
			beforeExecutionStep(_selectedLogicalStep);
			for (final Step step : ((ParallelStep<Step>) _selectedLogicalStep).getSubSteps()) {
				SmallStep sstep = (SmallStep) step;
				executeAssociatedActions(sstep.getMseoccurrence().getMse());
				executeSmallStep(sstep);
			}
			afterExecutionStep();
		}
	}

	private void executeAssociatedActions(MSE mse) {
		synchronized (_futureActionsLock) {
			ArrayList<IFutureAction> actionsToRemove = new ArrayList<IFutureAction>();
			for (IFutureAction action : _futureActions) {
				if (action.getTriggeringMSE() == mse) {
					actionsToRemove.add(action);
					action.perform();
				}
			}
			_futureActions.removeAll(actionsToRemove);
		}
	}

	private void executeSmallStep(SmallStep smallStep) {
		MSE mse = smallStep.getMseoccurrence().getMse();
		if (mse.getAction() != null) {
			ArrayList<When> whenStatements = new ArrayList<When>();
			// we are in a concurrent engine, the MSE should be a FeedbackMSE
			if (mse instanceof FeedbackMSE) {
				ActionModel feedbackModel = ((IConcurrentExecutionContext) _executionContext).getFeedbackModel();
				for (When w : feedbackModel.getWhenStatements()) {
					if (w.getSource() == ((FeedbackMSE) mse).getFeedbackModelSpecificEvent()) {
						whenStatements.add(w);
					}
				}
			}
			OperationExecution execution = null;
			Consumer<Step> beforeStep = s -> {
				beforeExecutionStep(s);
			};
			Runnable afterStep = () -> {
				afterExecutionStep();
			};
			if (whenStatements.size() == 0) {
				execution = new SynchroneExecution(smallStep, this, beforeStep, afterStep);
			}
			// if there is a future, execute async.
			else {
				execution = new ASynchroneExecution(smallStep, whenStatements, _mseStateController, this, beforeStep,
						afterStep);
			}
			execution.run();
		}
	}

	private ArrayList<IFutureAction> _futureActions = new ArrayList<>();
	private Object _futureActionsLock = new Object();

	@Override
	public void addFutureAction(IFutureAction action) {
		synchronized (_futureActionsLock) {
			_futureActions.add(action);
		}
	}

	@Override
	protected void performStart() {
		engineStatus.setNbLogicalStepRun(0);
		try {
			while (!_isStopped) {
				performExecutionStep();
			}
		} catch (EngineStoppedException ese) {
			throw ese; // forward the stop exception
		} catch (Throwable e) {
			throw new RuntimeException(e);
		}
	}

	@Override
	public void setSolver(ISolver solver) {
		_solver = solver;

	}

	@Override
	public ICodeExecutor getCodeExecutor() {
		return getConcurrentExecutionContext().getConcurrentExecutionPlatform().getCodeExecutor();
	}

	@Override
	protected final void finishDispose() {
		_solver.dispose();
	}

	@Override
	public final void performInitialize(IExecutionContext executionContext) {

		if (!(executionContext instanceof IConcurrentExecutionContext))
			throw new IllegalArgumentException(
					"executionContext must be an IConcurrentExecutionContext when used in ConcurrentExecutionEngine");

		IConcurrentExecutionContext concurrentExecutionContext = getConcurrentExecutionContext();

		ISolver solver;
		// TODO very ugly
		try {
			solver = concurrentExecutionContext.getConcurrentLanguageDefinitionExtension().instanciateSolver();
		} catch (CoreException e) {
			throw new RuntimeException(e.getMessage());
		}
		solver.initialize(concurrentExecutionContext);
		this.setSolver(solver);
		this.changeLogicalStepDecider(concurrentExecutionContext.getLogicalStepDecider());

		_mseStateController = new DefaultMSEStateController();
		concurrentExecutionContext.getConcurrentExecutionPlatform().getMSEStateControllers().add(_mseStateController);

		executeInitializeModelMethod(executionContext);
		Activator.getDefault().debug("*** Engine initialization done. ***");
	}

	protected void executeInitializeModelMethod(IExecutionContext executionContext) {

		String modelInitializationMethodQName = executionContext.getRunConfiguration().getModelInitializationMethod();
		if (!modelInitializationMethodQName.isEmpty()) {
			Object target = executionContext.getResourceModel().getContents().get(0);
			String modelInitializationMethodName = modelInitializationMethodQName
					.substring(modelInitializationMethodQName.lastIndexOf(".") + 1);
			Activator.getDefault()
					.debug("*** Calling Model initialization method " + modelInitializationMethodName + "(). ***");
			final ArrayList<Object> modelInitializationParameters = new ArrayList<>();
			ArrayList<String> modelInitializationArgs = new ArrayList<>();
			for (String s : executionContext.getRunConfiguration().getModelInitializationArguments().split("\\r?\\n")) {
				modelInitializationArgs.add(s);
			}
			modelInitializationParameters.add(modelInitializationArgs);

			final TransactionalEditingDomain editingDomain = TransactionalEditingDomain.Factory.INSTANCE
					.getEditingDomain(getExecutionContext().getResourceModel().getResourceSet());
			if (editingDomain != null) {
				final RecordingCommand command = new RecordingCommand(editingDomain,
						"execute  " + modelInitializationMethodQName) {
					private List<Object> result = new ArrayList<Object>();

					@Override
					protected void doExecute() {
						try {
							result.add(getConcurrentExecutionContext().getConcurrentExecutionPlatform()
									.getCodeExecutor()
									.execute(target, modelInitializationMethodName, modelInitializationParameters));
							Activator.getDefault().debug("*** Model initialization done. ***");
						} catch (CodeExecutionException e) {
							Activator.getDefault().error("Exception while initializing model " + e.getMessage(), e);
						}
					}

					@Override
					public Collection<?> getResult() {
						return result;
					}
				};
				CommandExecution.execute(editingDomain, command);
			} else {
				try {
					getConcurrentExecutionContext().getConcurrentExecutionPlatform().getCodeExecutor().execute(target,
							modelInitializationMethodName, modelInitializationParameters);
					Activator.getDefault().debug("*** Model initialization done. ***");
				} catch (CodeExecutionException e) {
					Activator.getDefault().error("Exception while initializing model " + e.getMessage(), e);
				}
			}
		} else {
			Activator.getDefault().debug(
					"*** Model initialization done. (no modelInitialization method defined for the language) ***");
		}

	}

	@Override
	public String engineKindName() {
		return "GEMOC Concurrent Engine";
	}

	@Override
	protected void beforeStart() {
		// TODO Auto-generated method stub

	}

}
