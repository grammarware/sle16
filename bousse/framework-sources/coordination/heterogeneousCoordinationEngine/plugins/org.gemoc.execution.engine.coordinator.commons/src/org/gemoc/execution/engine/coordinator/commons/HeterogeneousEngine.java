package org.gemoc.execution.engine.coordinator.commons;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.management.RuntimeErrorException;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.gemoc.execution.concurrent.ccsljavaengine.concurrentmse.FeedbackMSE;
import org.gemoc.execution.concurrent.ccsljavaengine.extensions.timesquare.moc.impl.CcslSolver;
import org.gemoc.execution.concurrent.ccsljavaxdsml.api.core.IConcurrentExecutionContext;
import org.gemoc.execution.concurrent.ccsljavaxdsml.api.core.IConcurrentExecutionEngine;
import org.gemoc.execution.concurrent.ccsljavaxdsml.api.core.IFutureAction;
import org.gemoc.execution.concurrent.ccsljavaxdsml.api.core.ILogicalStepDecider;
import org.gemoc.execution.concurrent.ccsljavaxdsml.api.dsa.executors.ICodeExecutor;
import org.gemoc.execution.concurrent.ccsljavaxdsml.api.moc.ISolver;
import org.gemoc.executionframework.engine.Activator;
import org.gemoc.executionframework.engine.commons.EngineContextException;
import org.gemoc.executionframework.engine.core.AbstractExecutionEngine;
import org.gemoc.xdsmlframework.api.core.EngineStatus;
import org.gemoc.xdsmlframework.api.core.EngineStatus.RunStatus;
import org.gemoc.xdsmlframework.api.core.ExecutionMode;
import org.gemoc.xdsmlframework.api.core.IExecutionContext;
import org.gemoc.xdsmlframework.api.core.IExecutionEngine;
import org.gemoc.xdsmlframework.api.engine_addon.IEngineAddon;

import com.google.common.collect.Sets;
import com.google.inject.Injector;

import fr.inria.aoste.timesquare.ccslkernel.model.TimeModel.Clock;
import fr.inria.aoste.timesquare.ccslkernel.model.TimeModel.NamedElement;
import fr.inria.aoste.timesquare.ccslkernel.model.utils.ResourceLoader;
import fr.inria.aoste.timesquare.ccslkernel.modelunfolding.exception.UnfoldingException;
import fr.inria.aoste.timesquare.ccslkernel.parser.xtext.ExtendedCCSLStandaloneSetup;
import fr.inria.aoste.timesquare.ccslkernel.runtime.elements.RuntimeClock;
import fr.inria.aoste.timesquare.ccslkernel.runtime.exceptions.SimulationException;
import fr.inria.aoste.timesquare.ccslkernel.solver.CCSLKernelSolver;
import fr.inria.aoste.timesquare.ccslkernel.solver.TimeModel.SolverClock;
import fr.inria.aoste.timesquare.ccslkernel.solver.launch.CCSLKernelSolverWrapper;
import fr.inria.diverse.trace.commons.model.helper.StepHelper;
import fr.inria.diverse.trace.commons.model.trace.BigStep;
import fr.inria.diverse.trace.commons.model.trace.MSE;
import fr.inria.diverse.trace.commons.model.trace.MSEOccurrence;
import fr.inria.diverse.trace.commons.model.trace.SmallStep;
import fr.inria.diverse.trace.commons.model.trace.Step;
import fr.inria.diverse.trace.commons.model.trace.TraceFactory;
import fr.inria.diverse.trace.commons.model.trace.impl.ParallelStepImpl;

/**
 * Naive implementation of the heterogeneous ExecutionEngine, where so called coordinated execution engines are
 * coordinated. It can display the runtime execution information to its registered observers.
 * 
 * The heterogeneous engine is initialized from the result of the bcool specification application to specific models.
 * For now it works only with IConcurrentExecutionEngine since hey are the only ones to provide a language and model
 * interfaces based on explicit events
 * 
 * this code should be improved in some ways but the major limitaion comes from the coordination of only two engines...
 * To improve that, the product of the logical steps must be done to test their validity
 * 
 * The heterogeneous engine is providing {@link #HeterogeneousLogicalStep}, which are an aggregation of
 * {@link #LogicalStep}s. The heterogeneous engine does not provide any traces by itself but the traces of the
 * coordinated engines are existing.
 * 
 * @see IConcurrentExecutionEngine
 * 
 * @author julien.deantoni@polytech.unice.frs
 * @param <T>
 * 
 */
public class HeterogeneousEngine extends AbstractExecutionEngine implements IConcurrentExecutionEngine {// extends
																										// ConcurrentExecutionEngine{

	protected ArrayList<IConcurrentExecutionEngine> _coordinatedEngines = new ArrayList<IConcurrentExecutionEngine>();

	public ArrayList<IConcurrentExecutionEngine> get_coordinatedEngines() {
		return _coordinatedEngines;
	}

	protected CoordinationSolver _coordinationSolver;
	protected ArrayList<CCSLKernelSolver> _t2Solvers;

	public HeterogeneousEngine(CoordinatedModelExecutionContext executionContext, ExecutionMode executionMode)
			throws EngineContextException {
		ArrayList<IExecutionEngine> coordinatedEngines = executionContext.getCoordinatedEngines();
		for (IExecutionEngine e : coordinatedEngines) {
			if (!(e instanceof IConcurrentExecutionEngine)) {
				throw new RuntimeErrorException(new Error(
						"sorry, for now, only concurrent execution engines are supported, please donate for more :p"));
			}
			_coordinatedEngines.add((IConcurrentExecutionEngine) e);
		}
		_coordinationSolver = new CoordinationSolver(new CCSLKernelSolver(),
				executionContext.getCoordinationModelURI());
		ExtendedCCSLStandaloneSetup ess = new ExtendedCCSLStandaloneSetup();
		Injector injector = ess.createInjector();
		// instanciate a resource set
		XtextResourceSet ccslResourceSet = injector.getInstance(XtextResourceSet.class);
		// set.setClasspathURIContext(getClasspathURIContext());
		ccslResourceSet.addLoadOption(XtextResource.OPTION_RESOLVE_ALL, Boolean.TRUE);
		ExtendedCCSLStandaloneSetup.doSetup();
		Resource coordinationResource = null;
		coordinationResource = ccslResourceSet.createResource(executionContext.getCoordinationModelURI());
		try {
			coordinationResource.load(null);
		} catch (IOException e1) {
			e1.printStackTrace();
		}

		try {
			String coordinationPathName = executionContext.getCoordinationModelURI().toString();
			String tmpProjectName = coordinationPathName.substring(1, coordinationPathName.length());
			String projectName = tmpProjectName.substring(0, tmpProjectName.indexOf('/'));
			IProject coordinationProject = ResourcesPlugin.getWorkspace().getRoot().getProject(projectName);
			IFile ccslFile = coordinationProject
					.getFile(coordinationPathName.replaceFirst("/" + projectName + "/", ""));
			_coordinationSolver.getSolverWrapper().getSolver()
					.loadCoordinationModel(ResourceLoader.INSTANCE.loadResource(ccslFile.getFullPath()));
			_coordinationSolver.getSolverWrapper().getSolver().initSimulation();
		} catch (IOException | UnfoldingException | SimulationException e) {
			e.printStackTrace();
		}

		_t2Solvers = new ArrayList<CCSLKernelSolver>();
		for (IConcurrentExecutionEngine eng : _coordinatedEngines) {
			CcslSolver gemocSolver = (CcslSolver) ((IConcurrentExecutionEngine) eng).getSolver();
			CCSLKernelSolverWrapper t2solverWrapper = gemocSolver.getSolverWrapper();
			_t2Solvers.add(t2solverWrapper.getSolver());
		}
	}

	@Override
	public final void performInitialize(IExecutionContext executionContext) {
		if (!(executionContext instanceof CoordinatedModelExecutionContext))
			throw new IllegalArgumentException(
					"executionContext must be a CoordinatedModelExecutionContext when used in an HeterogeneousExecutionEngine");
		_executionContext = executionContext;
		CoordinatedModelExecutionContext coordinatedExecutionContext = (CoordinatedModelExecutionContext) _executionContext;
		this.changeLogicalStepDecider(coordinatedExecutionContext.getLogicalStepDecider());
		setEngineStatus(EngineStatus.RunStatus.Running);
		Activator.getDefault().info("*** Heterogeneous Coordination Engine initialization done. ***");
	}

	@Override
	public void notifyEngineStatusChanged(RunStatus newStatus) {
		if (_coordinatedEngines.size() == 0) {
			return;
		}
		for (IEngineAddon addon : _coordinatedEngines.get(0).getExecutionContext().getExecutionPlatform()
				.getEngineAddons()) {
			try {
				addon.engineStatusChanged(this, newStatus);
			} catch (Exception e) {
				Activator.getDefault().error("Exception in Addon " + addon + ", " + e.getMessage(), e);
			}
		}
	}

	@Override
	public void notifyEngineAboutToStart() {
		if (_coordinatedEngines.size() == 0) {
			return;
		}
		for (IEngineAddon addon : _coordinatedEngines.get(0).getExecutionContext().getExecutionPlatform()
				.getEngineAddons()) {
			try {
				addon.engineAboutToStart(this);
			} catch (Exception e) {
				Activator.getDefault().error("Exception in Addon " + addon + ", " + e.getMessage(), e);
			}
		}
	}

	@Override
	public void notifyEngineStarted() {
		if (_coordinatedEngines.size() == 0) {
			return;
		}
		for (IEngineAddon addon : _coordinatedEngines.get(0).getExecutionContext().getExecutionPlatform()
				.getEngineAddons()) {
			try {
				if (_coordinatedEngines.size() == 0) {
					return;
				}
				addon.engineStarted(this);
			} catch (Exception e) {
				Activator.getDefault().error("Exception in Addon " + addon + ", " + e.getMessage(), e);
			}
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.gemoc.executionframework.engine.core.IExecutionEngine#notifyLogicalStepExecuted(org.gemoc.executionframework.
	 * engine.trace.gemoc_execution_trace.LogicalStep)
	 */
	@Override
	public void notifyLogicalStepExecuted(Step l) {
		if (_coordinatedEngines.size() == 0) {
			return;
		}
		for (IEngineAddon addon : _coordinatedEngines.get(0).getExecutionContext().getExecutionPlatform()
				.getEngineAddons()) {
			try {
				addon.stepExecuted(this, l);
			} catch (Exception e) {
				Activator.getDefault().error("Exception in Addon " + addon + ", " + e.getMessage(), e);
			}
		}
	}

	public CoordinatedModelExecutionContext getCoordinatedModelExecutionContext() {

		IExecutionContext context = getExecutionContext();
		if (context instanceof CoordinatedModelExecutionContext) {
			return (CoordinatedModelExecutionContext) context;
		} else
			return null;
	}

	public SolverClock getCoordinatedSolverClockFromCoordinationSolverClock(Clock in, int engineNumber) {
		return _t2Solvers.get(engineNumber).findClockByPath(getQualifiedName(in));
	}

	public SolverClock getCoordinatedSolverClockFromCoordinationSolverClock(RuntimeClock in, int engineNumber) {
		return _t2Solvers.get(engineNumber).findClock(in.getQualifiedName().toString());
	}

	public SolverClock getCoordinationSolverClockFromMSE(MSE inMSE, CCSLKernelSolver aSolver) {
		if (inMSE instanceof FeedbackMSE) {
			return _coordinationSolver.getSolverWrapper().getSolver().findClockByPath(
					getQualifiedName((Clock) ((FeedbackMSE) inMSE).getFeedbackModelSpecificEvent().getSolverEvent()));
		} else {
			Activator.getDefault().error("Failed to find a solverClock for MSE " + inMSE);
			return null;
		}
	}

	class ExtendedLogicalStep extends ParallelStepImpl<SmallStep> {

		public ExtendedLogicalStep(BigStep<SmallStep> step) {
			this.subSteps = new BasicEList<SmallStep>(step.getSubSteps().size());
			this.subSteps.addAll(((BigStep<SmallStep>) step).getSubSteps());
		}

		int indexInSolution = 0;
		int solverIndex = 0;

	}

	/**
	 * TODO: this only work for two coordinated engines... not sure how to generalize that
	 * 
	 * @return
	 * @throws SimulationException
	 */
	public ArrayList<HeterogeneousLogicalStep> computeHeterogeneousLogicalStep() throws SimulationException {
		ArrayList<HeterogeneousLogicalStep> res = new ArrayList<HeterogeneousLogicalStep>();
		//
		// IConcurrentExecutionEngine engine0 = _coordinatedEngines.get(0);
		// IConcurrentExecutionEngine engine1 = _coordinatedEngines.get(1);
		//

		ArrayList<Set<ExtendedLogicalStep>> allLogicalSteps = new ArrayList<Set<ExtendedLogicalStep>>(
				_coordinatedEngines.size());
		for (int i = 0; i < _coordinatedEngines.size(); i++) {
			IConcurrentExecutionEngine engine = _coordinatedEngines.get(i);
			List<ExtendedLogicalStep> possibleSteps = extendLogicalSteps(engine.getPossibleLogicalSteps(), i);
			Set<ExtendedLogicalStep> engineLogicalSteps = new HashSet<ExtendedLogicalStep>(possibleSteps);
			allLogicalSteps.add(engineLogicalSteps);
		}

		Set<List<ExtendedLogicalStep>> cartesianProductOfLogicalSteps = Sets.cartesianProduct(allLogicalSteps);

		for (List<ExtendedLogicalStep> steps : cartesianProductOfLogicalSteps) {
			for (int i = 0; i < steps.size(); i++) {
				ExtendedLogicalStep stepToAdd = steps.get(i);
				addConstraintsFromOneStepOfOneEngine(stepToAdd.solverIndex, stepToAdd);
			}

			if (_coordinationSolver.getSolverWrapper().getSolver().hasSolution()) {
				HeterogeneousLogicalStep theStepsUsed = new HeterogeneousLogicalStep();
				theStepsUsed.logicalSteps.addAll(steps);
				res.add(theStepsUsed);
			} else {
				// System.out.println("incompatible couple of LS: "+logicalStepNumberIn0+" ; "+logicalStepNumberIn1);
			}
			_coordinationSolver.revertForceClockEffect();

		}

		//
		//
		// List<LogicalStep> logicalStepsOf0 = engine0.getPossibleLogicalSteps();
		// logicalStepsOf0.add(emptyLogicalStep); //to allow stalling/stuttering an engine
		// List<LogicalStep> logicalStepsOf1 = engine1.getPossibleLogicalSteps();
		// logicalStepsOf1.add(emptyLogicalStep); //to allow stalling/stuttering an engine
		//
		// for(int logicalStepNumberIn0 = 0; logicalStepNumberIn0 < logicalStepsOf0.size(); logicalStepNumberIn0++ ){
		// for(int logicalStepNumberIn1 = 0; logicalStepNumberIn1 < logicalStepsOf1.size(); logicalStepNumberIn1++ ){
		// addConstraintsFromOneStepOfOneEngine(0, logicalStepsOf0.get(logicalStepNumberIn0));
		// addConstraintsFromOneStepOfOneEngine(1, logicalStepsOf1.get(logicalStepNumberIn1));
		//
		// if (_coordinationSolver.hasSolution()){
		// HeterogeneousLogicalStep theStepsUsed = new HeterogeneousLogicalStep();
		// theStepsUsed.logicalSteps.add(logicalStepsOf0.get(logicalStepNumberIn0));
		// theStepsUsed.stepPositions.add(logicalStepNumberIn0);
		// theStepsUsed.logicalSteps.add(logicalStepsOf1.get(logicalStepNumberIn1));
		// theStepsUsed.stepPositions.add(logicalStepNumberIn1);
		// res.add(theStepsUsed);
		// }else{
		//// System.out.println("incompatible couple of LS: "+logicalStepNumberIn0+" ; "+logicalStepNumberIn1);
		// }
		// _coordinationSolver.revertForceClockEffect();
		// }
		// }

		return res;
	}

	@SuppressWarnings("unchecked")
	private List<ExtendedLogicalStep> extendLogicalSteps(List<Step> possibleLogicalSteps, int iSolver) {
		List<ExtendedLogicalStep> res = new ArrayList<ExtendedLogicalStep>(possibleLogicalSteps.size());
		for (int i = 0; i < possibleLogicalSteps.size(); i++) {
			ExtendedLogicalStep eStep = new ExtendedLogicalStep((BigStep<SmallStep>) possibleLogicalSteps.get(i));
			eStep.indexInSolution = i;
			eStep.solverIndex = iSolver;
			res.add(eStep);
		}
		ExtendedLogicalStep emptyLogicalStep = new ExtendedLogicalStep(
				(BigStep<SmallStep>) TraceFactory.eINSTANCE.createGenericSmallStep());
		emptyLogicalStep.indexInSolution = possibleLogicalSteps.size();
		emptyLogicalStep.solverIndex = iSolver;
		res.add(emptyLogicalStep);
		return res;
	}

	public void addConstraintsFromOneStepOfOneEngine(int engineNumber, Step aStep) throws SimulationException {

		CCSLKernelSolver oneSolver = _t2Solvers.get(engineNumber);
		ArrayList<SolverClock> trueClocks = new ArrayList<SolverClock>();
		for (MSEOccurrence mseOcc : StepHelper.collectAllMSEOccurrences(aStep)) {
			MSE mse = mseOcc.getMse();
			SolverClock coordinationClock = getCoordinationSolverClockFromMSE(mse, oneSolver);
			trueClocks.add(coordinationClock);
			_coordinationSolver.getSolverWrapper().getSolver().forceClockPresence(coordinationClock);
		}
		// here we are to force absence of the other clocks managed by the engine
		List<RuntimeClock> allRuntimeClocks = _coordinationSolver.getSolverWrapper().getSolver().getAllDiscreteClocks();
		// should keep only clock managed by the engine engineNumber
		for (RuntimeClock rc : allRuntimeClocks) {
			String QNrc = "";
			if (rc instanceof SolverClock) {
				QNrc = ((SolverClock) rc).getInstantiationPath().getQualifiedName();
			} else {
				QNrc = rc.getQualifiedName().toString();
			}
			if (oneSolver.findClockByPath(QNrc) == null) {
				continue;
			}
			if (rc instanceof SolverClock) {
				if (!trueClocks.contains(rc)) {
					_coordinationSolver.getSolverWrapper().getSolver().forceClockAbscence((SolverClock) rc);
				} else {
					// System.out.println("already forced to true"+rc);
				}
			}
		}
		// here, the logicalStep aStep is forced in the coordinationSolver.
	}

	@Override
	public void performExecutionStep() {

		if (_heterogeneousLogicalSteps.size() == 0) {
			Activator.getDefault().debug("No more LogicalStep to run");
			stop();
		} else {
			// Activator.getDefault().debug("\t\t ---------------- LogicalStep " + count);
			Step selectedLogicalStep = selectAndExecuteLogicalStep();
			// 3 - run the selected logical step
			// inform the solver that we will run this step
			if (selectedLogicalStep != null) {
				try {
					// here we must have forced selected clocks from the other engine before to ask for all solution
					// otherwise it is a computational nightmare
					for (int i = 0; i < ((HeterogeneousLogicalStep) selectedLogicalStep).logicalSteps.size(); i++) {
						ExtendedLogicalStep stepToAdd = ((HeterogeneousLogicalStep) selectedLogicalStep).logicalSteps
								.get(i);
						addConstraintsFromOneStepOfOneEngine(stepToAdd.solverIndex, stepToAdd);
					}
					List<fr.inria.aoste.trace.LogicalStep> allPossibleSteps = _coordinationSolver.getSolverWrapper()
							.getAllPossibleSteps();
					_coordinationSolver.getSolverWrapper()
							.applyLogicalStepByIndex((int) (Math.random() % (allPossibleSteps.size())));
				} catch (SimulationException e) {
					e.printStackTrace();
				}
				engineStatus.setNbLogicalStepRun(engineStatus.getNbLogicalStepRun() + 1);
				computePossibleLogicalSteps();
			} else {
				// no logical step was selected, this is most probably due to a preempt on the LogicalStepDecider and a
				// change of Decider,
				// notify Addons that we'll rerun this ExecutionStep
				// recomputePossibleLogicalSteps();
			}
		}
	}

	private Step selectAndExecuteLogicalStep() {
		setEngineStatus(EngineStatus.RunStatus.WaitingLogicalStepSelection);
		notifyAboutToSelectLogicalStep();
		Step selectedLogicalStep = null;
		try {

			for (IConcurrentExecutionEngine eng : get_coordinatedEngines()) {
				eng.getLogicalStepDecider().preempt();
			}
			selectedLogicalStep = // _selectedCompliantStep;
			getLogicalStepDecider().decide(this, getPossibleLogicalSteps());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		if (selectedLogicalStep != null) {
			setSelectedLogicalStep(selectedLogicalStep);
			setEngineStatus(EngineStatus.RunStatus.Running);
			notifyLogicalStepSelected();
			// run all the event occurrences of this logical
			// step
			beforeExecutionStep(selectedLogicalStep);
			executeSelectedLogicalStep();
			afterExecutionStep();

		}
		return selectedLogicalStep;
	}

	private boolean oneEngineStopped() {
		for (IExecutionEngine anEngine : _coordinatedEngines) {
			if (((AbstractExecutionEngine) anEngine).getRunningStatus() == RunStatus.Stopped) {
				return true;
			}
		}
		return false;
	}

	/**
	 * Returns a textual representation of the Clock as a string built from the name of all elements in the path,
	 * separated by the separator string.
	 */
	public String getQualifiedName(Clock c) {
		StringBuilder sb = new StringBuilder(c.getName());
		NamedElement ne = (NamedElement) c.eContainer();
		while (ne != null) {
			sb.insert(0, ne.getName() + "::");
			ne = (NamedElement) ne.eContainer();
		}
		return sb.toString();
	}

	protected ArrayList<HeterogeneousLogicalStep> _heterogeneousLogicalSteps = new ArrayList<HeterogeneousLogicalStep>();

	public void computePossibleLogicalSteps() {
		try {
			_coordinationSolver.getSolverWrapper().getSolver().constructBDD();
		} catch (SimulationException e1) {
			e1.printStackTrace();
		}

		for (IConcurrentExecutionEngine engine : _coordinatedEngines) {
			engine.computePossibleLogicalSteps();
			engine.updatePossibleLogicalSteps();
		}

		_heterogeneousLogicalSteps = null;
		try {
			_heterogeneousLogicalSteps = computeHeterogeneousLogicalStep();
			this._coordinationSolver._lastLogicalSteps = _heterogeneousLogicalSteps;
		} catch (SimulationException e) {
			e.printStackTrace();
		}

		_selectedCompliantStep = _heterogeneousLogicalSteps.get(0);
		// System.out.println(_heterogeneousLogicalSteps);
		// System.out.println(_heterogeneousLogicalSteps.size());
		// here, in _HeterogeneousLogicalStep, we have a list of "compliant step". A compliant step
		// is an ordered set of integer corresponding to the step number
	}

	protected HeterogeneousLogicalStep _selectedCompliantStep = null;

	@Override
	public Step getSelectedLogicalStep() {
		synchronized (this) {
			return (Step) _selectedCompliantStep;
		}
	}

	@Override
	public void setSelectedLogicalStep(Step selectedStep) {
		if (!(selectedStep instanceof HeterogeneousLogicalStep)) {
			throw new RuntimeErrorException(new Error(
					"you try to set a step to a coordinator engine, it should be instance of HeterogeneousLogicalStep and not of"
							+ selectedStep.getClass().getCanonicalName()));
		}
		synchronized (this) {
			_selectedCompliantStep = (HeterogeneousLogicalStep) selectedStep;
		}
	}

	@Override
	public List<Step> getPossibleLogicalSteps() {
		synchronized (this) {
			return new ArrayList<Step>(_heterogeneousLogicalSteps);
		}
	}

	@Override
	protected void performStop() {
		if (getLogicalStepDecider() != null) {
			// unlock decider if this is a user decider
			getLogicalStepDecider().preempt();
		}
		for (IExecutionEngine engine : _coordinatedEngines) {
			engine.stop();
		}
	}

	@Override
	public void recomputePossibleLogicalSteps() {
		for (IConcurrentExecutionEngine engine : _coordinatedEngines) {
			engine.getSolver().revertForceClockEffect();
			engine.updatePossibleLogicalSteps();
			engine.notifyProposedLogicalStepsChanged();
		}
		computePossibleLogicalSteps();
	}

	public void executeSelectedLogicalStep() {
		for (int i = 0; i < _coordinatedEngines.size(); i++) {
			IConcurrentExecutionEngine oneEngine = _coordinatedEngines.get(i);
			int theLogicalStepToSelect = -1;
			for (ExtendedLogicalStep eStep : _selectedCompliantStep.logicalSteps) {
				if (eStep.solverIndex == i) {
					theLogicalStepToSelect = eStep.indexInSolution;
				}
			}
			// if we chose the empty step, do nothing
			if (theLogicalStepToSelect == (oneEngine.getPossibleLogicalSteps().size())) {
				continue;
			}
			Step selectedLogicalStep = oneEngine.getPossibleLogicalSteps().get(theLogicalStepToSelect);
			oneEngine.setEngineStatus(EngineStatus.RunStatus.WaitingLogicalStepSelection);
			oneEngine.notifyAboutToSelectLogicalStep();
			oneEngine.setSelectedLogicalStep(selectedLogicalStep);
			oneEngine.setEngineStatus(EngineStatus.RunStatus.Running);
			oneEngine.notifyLogicalStepSelected();
			// run all the event occurrences of this logical
			// step

			oneEngine.executeSelectedLogicalStep();

			// 3 - run the selected logical step
			// inform the solver that we will run this step
			// force the clocks in the BDD of the coordinated engine
			if (selectedLogicalStep != null) {
				oneEngine.getSolver().applyLogicalStep(selectedLogicalStep);

				try {
					addConstraintsFromOneStepOfOneEngine(_coordinatedEngines.indexOf(oneEngine), selectedLogicalStep);
				} catch (SimulationException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				oneEngine.getEngineStatus().incrementNbLogicalStepRun();
			}
		}

		return;// new Status(IStatus.OK, Activator.PLUGIN_ID, "Execution step was successfull");
	}

	public String getName() {
		return "Gemoc engine " + _executionContext.getRunConfiguration().getExecutedModelURI();
	}

	@Override
	protected void beforeStart() {
		computePossibleLogicalSteps();
	}

	////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

	@Override
	public String engineKindName() {
		return "GEMOC heterogeneous Coordination Engine";
	}

	@Override
	public IConcurrentExecutionContext getConcurrentExecutionContext() {
		return (IConcurrentExecutionContext) ((CoordinatedModelExecutionContext) _executionContext)
				.getCoordinatedEngines().get(0).getExecutionContext();
	}

	@Override
	public void updatePossibleLogicalSteps() {
		// TODO Auto-generated method stub
	}

	@Override
	public void addFutureAction(IFutureAction action) {
	}

	@Override
	public ILogicalStepDecider getLogicalStepDecider() {
		return ((CoordinatedModelExecutionContext) _executionContext).get_logicalStepDecider();
	}

	@Override
	public void changeLogicalStepDecider(ILogicalStepDecider newDecider) {
		((CoordinatedModelExecutionContext) _executionContext).set_logicalStepDecider(newDecider);
	}

	@Override
	public ISolver getSolver() {
		return _coordinationSolver;
	}

	@Override
	public void setSolver(ISolver solver) {

	}

	@Override
	public ICodeExecutor getCodeExecutor() {
		return null;
	}

	@Override
	public void notifyLogicalStepSelected() {
		if (_coordinatedEngines.size() == 0) {
			return;
		}
		for (IEngineAddon addon : _coordinatedEngines.get(0).getExecutionContext().getExecutionPlatform()
				.getEngineAddons()) {
			try {
				addon.stepSelected(this, getSelectedLogicalStep());
			} catch (Exception e) {
				Activator.getDefault().error("Exception in Addon " + addon + ", " + e.getMessage(), e);
			}
		}
	}

	@Override
	public void notifyAboutToSelectLogicalStep() {
		if (_coordinatedEngines.size() == 0) {
			return;
		}
		for (IEngineAddon addon : _coordinatedEngines.get(0).getExecutionContext().getExecutionPlatform()
				.getEngineAddons()) {
			try {
				addon.aboutToSelectStep(this, getPossibleLogicalSteps());
			} catch (Exception e) {
				Activator.getDefault().error("Exception in Addon " + addon + ", " + e.getMessage(), e);
			}
		}

	}

	@Override
	public void notifyAboutToExecuteLogicalStep(Step l) {
		if (_coordinatedEngines.size() == 0) {
			return;
		}
		for (IEngineAddon addon : _coordinatedEngines.get(0).getExecutionContext().getExecutionPlatform()
				.getEngineAddons()) {
			try {
				addon.aboutToExecuteStep(this, l);
			} catch (Exception e) {
				Activator.getDefault().error("Exception in Addon " + addon + ", " + e.getMessage(), e);
			}
		}
	}

	@Override
	public void notifyProposedLogicalStepsChanged() {
		if (_coordinatedEngines.size() == 0) {
			return;
		}
		for (IEngineAddon addon : _coordinatedEngines.get(0).getExecutionContext().getExecutionPlatform()
				.getEngineAddons()) {
			try {
				addon.proposedStepsChanged(this, getPossibleLogicalSteps());
			} catch (Exception e) {
				Activator.getDefault().error("Exception in Addon " + addon + ", " + e.getMessage(), e);
			}
		}
	}

	////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	@Override
	protected void performStart() {
		engineStatus.setNbLogicalStepRun(0);
		try {
			while (!_isStopped || !oneEngineStopped()) {
				performExecutionStep();
			}
		} catch (Throwable e) {
			throw new RuntimeException(e);
		}
	}

	@Override
	protected void finishDispose() {
		// TODO Auto-generated method stub

	}

}
