package org.gemoc.execution.concurrent.ccsljavaengine.ui.launcher;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.function.BiPredicate;

import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.debug.core.ILaunch;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.ILaunchConfigurationWorkingCopy;
import org.eclipse.debug.core.ILaunchManager;
import org.eclipse.debug.ui.DebugUITools;
import org.eclipse.debug.ui.ILaunchGroup;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.PlatformUI;
import org.gemoc.commons.eclipse.ui.ViewHelper;
import org.gemoc.execution.concurrent.ccsljavaengine.commons.ConcurrentModelExecutionContext;
import org.gemoc.execution.concurrent.ccsljavaengine.dse.ConcurrentExecutionEngine;
import org.gemoc.execution.concurrent.ccsljavaengine.ui.Activator;
import org.gemoc.execution.concurrent.ccsljavaengine.ui.debug.GemocModelDebugger;
import org.gemoc.execution.concurrent.ccsljavaengine.ui.views.step.LogicalStepsView;
import org.gemoc.execution.concurrent.ccsljavaengine.ui.views.stimulimanager.StimuliManagerView;
import org.gemoc.execution.concurrent.ccsljavaxdsml.api.core.IConcurrentExecutionEngine;
import org.gemoc.execution.concurrent.ccsljavaxdsml.api.moc.ISolver;
import org.gemoc.executionframework.engine.commons.EngineContextException;
import org.gemoc.executionframework.engine.ui.commons.RunConfiguration;
import org.gemoc.executionframework.engine.ui.debug.AbstractGemocDebugger;
import org.gemoc.executionframework.engine.ui.debug.AnnotationMutableFieldExtractor;
import org.gemoc.executionframework.engine.ui.debug.IMutableFieldExtractor;
import org.gemoc.executionframework.engine.ui.launcher.AbstractGemocLauncher;
import org.gemoc.executionframework.extensions.sirius.services.AbstractGemocAnimatorServices;
import org.gemoc.executionframework.extensions.sirius.services.AbstractGemocDebuggerServices;
import org.gemoc.executionframework.ui.views.engine.EnginesStatusView;
import org.gemoc.xdsmlframework.api.core.EngineStatus.RunStatus;
import org.gemoc.xdsmlframework.api.core.ExecutionMode;
import org.gemoc.xdsmlframework.api.core.IExecutionEngine;
import org.gemoc.xdsmlframework.api.core.IExecutionEngine;
import org.gemoc.xdsmlframework.api.engine_addon.IEngineAddon;

import fr.inria.diverse.commons.messagingsystem.api.MessagingSystem;
import fr.inria.diverse.trace.commons.model.trace.MSEOccurrence;
import fr.obeo.dsl.debug.ide.IDSLDebugger;
import fr.obeo.dsl.debug.ide.adapter.IDSLCurrentInstructionListener;
import fr.obeo.dsl.debug.ide.event.DSLDebugEventDispatcher;

public class Launcher extends AbstractGemocLauncher {

	public final static String TYPE_ID = Activator.PLUGIN_ID+".launcher";

	private IExecutionEngine _executionEngine;

	@Override
	public void launch(final ILaunchConfiguration configuration, final String mode, final ILaunch launch,
			IProgressMonitor monitor) throws CoreException {
		try {
			debug("About to initialize and run the GEMOC Execution Engine...");

			// make sure to have the engine view when starting the engine
			PlatformUI.getWorkbench().getDisplay().syncExec(
					new Runnable()
					{
						@Override
						public void run() {
							ViewHelper.retrieveView(StimuliManagerView.ID);
							ViewHelper.retrieveView(EnginesStatusView.ID);
							ViewHelper.showView(LogicalStepsView.ID);
						}			
					});	
			
			// We parse the run configuration
			final ConcurrentRunConfiguration runConfiguration = new ConcurrentRunConfiguration(configuration);

			// We detect if we are running in debug mode or not
			ExecutionMode executionMode = null;
			if (ILaunchManager.DEBUG_MODE.equals(mode)) {
				executionMode = ExecutionMode.Animation;
			} else {
				executionMode = ExecutionMode.Run;
			}

			// We stop the launch if an engine is already running for this model
			if (isEngineAlreadyRunning(runConfiguration.getExecutedModelURI())) {
				return;
			}

			// Depending on the parsed launch conf and the mode, we create the
			// execution context
			// Then we see if we have a solver in the language def by trying to
			// create a concurrent context

			ISolver solver = null;
			ConcurrentModelExecutionContext concurrentexecutionContext = null;
			try {
				concurrentexecutionContext = new ConcurrentModelExecutionContext(runConfiguration, executionMode);
				solver = concurrentexecutionContext.getConcurrentLanguageDefinitionExtension().instanciateSolver();
			} catch (CoreException e) {
				throw new CoreException(new Status(Status.ERROR, Activator.PLUGIN_ID, "Cannot instanciate solver from language definition", e));
			} catch (EngineContextException e) {
				throw new CoreException(new Status(Status.ERROR, Activator.PLUGIN_ID, "Cannot instanciate solver from language definition", e));
			}

			// This allows us to decide which kind of engine to create
			// Eventually, this would either be decided in the launch conf... or
			// in the xDSML file? not clear
			// Or we would automatically find the appropriate engine...
			if (solver != null) {
				// do what we need before the model is loaded
					// prepare files for the solver 
				solver.prepareBeforeModelLoading(concurrentexecutionContext);
				// load the model
				concurrentexecutionContext.initializeResourceModel();
				// create and we initialize the engine
				_executionEngine = new ConcurrentExecutionEngine();
				_executionEngine.initialize(concurrentexecutionContext);
			} else {
				throw new CoreException(new Status(Status.ERROR, Activator.PLUGIN_ID, "Cannot instanciate solver from language definition", null));
			}

			openViewsRecommandedByAddons(runConfiguration);

			// And we start it within a dedicated job
			Job job = new Job(getDebugJobName(configuration, getFirstInstruction(configuration))) {
				@Override
				protected IStatus run(IProgressMonitor monitor) {
					// If we are debugging, we add the animator and we start
					// the execution using the super class
					// AbstractDSLLaunchConfigurationDelegateUI
					// This will start yet another job and eventually start
					// the engine
					if (ILaunchManager.DEBUG_MODE.equals(mode)) {
						IEngineAddon animator = AbstractGemocAnimatorServices.getAnimator();
						_executionEngine.getExecutionContext().getExecutionPlatform().addEngineAddon(animator);
						try {
							Launcher.super.launch(configuration, mode, launch, monitor);
							return new Status(IStatus.OK, getPluginID(), "Execution was launched successfully");
						} catch (CoreException e) {
							e.printStackTrace();
							return new Status(IStatus.ERROR, getPluginID(), "Could not start debugger.");
						}
					}

					// If we are not debugging, we simply start the engine
					// from the current job
					else {
						_executionEngine.start();
						debug("Execution finished.");
						return new Status(IStatus.OK, getPluginID(), "Execution was launched successfully");
					}
				}
			};
			debug("Initialization done, starting engine...");
			job.schedule();

		} catch (Exception e) {
			String message = "Error occured when starting execution engine: " + e.getMessage()
					+ " (see inner exception).";
			// error(message);
			Activator.error(message, e);
			throw new CoreException(new Status(Status.ERROR, Activator.PLUGIN_ID, message, e));
		}
	}

	private boolean isEngineAlreadyRunning(URI launchedModelURI) throws CoreException {
		// make sure there is no other running engine on this model
		Collection<IExecutionEngine> engines = org.gemoc.executionframework.engine.Activator.getDefault().gemocRunningEngineRegistry
				.getRunningEngines().values();
		for (IExecutionEngine engine : engines) {
			IExecutionEngine observable = (IExecutionEngine) engine;
			if (observable.getRunningStatus() != RunStatus.Stopped
					&& observable.getExecutionContext().getResourceModel().getURI().equals(launchedModelURI)) {
				String message = "An engine is already running on this model, please stop it first";
				warn(message);
				return true;
			}
		}
		return false;
	}

	protected void debug(String message) {
		getMessagingSystem().debug(message, getPluginID());
	}

	protected void info(String message) {
		getMessagingSystem().info(message, getPluginID());
	}

	protected void warn(final String message) {
		getMessagingSystem().warn(message, getPluginID());
		PlatformUI.getWorkbench().getDisplay().asyncExec(new Runnable() {
			public void run() {
				MessageDialog.openWarning(PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell(),
						"GEMOC Engine Launcher", message);
			}
		});
	}

	protected void error(final String message) {
		getMessagingSystem().error(message, getPluginID());
		PlatformUI.getWorkbench().getDisplay().asyncExec(new Runnable() {
			public void run() {
				MessageDialog.openError(PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell(),
						"GEMOC Engine Launcher", message);
			}
		});
	}

	private MessagingSystem getMessagingSystem() {
		return Activator.getDefault().getMessaggingSystem();
	}

	@Override
	protected String getLaunchConfigurationTypeID() {
		return TYPE_ID;
	}

	@Override
	protected EObject getFirstInstruction(ISelection selection) {
		return EcorePackage.eINSTANCE;
	}

	@Override
	protected EObject getFirstInstruction(IEditorPart editor) {
		return EcorePackage.eINSTANCE;
	}

	@Override
	protected EObject getFirstInstruction(ILaunchConfiguration configuration) {
		return EcorePackage.eINSTANCE;
	}

	@Override
	protected IDSLDebugger getDebugger(ILaunchConfiguration configuration, DSLDebugEventDispatcher dispatcher,
			EObject firstInstruction, IProgressMonitor monitor) {

		AbstractGemocDebugger res = null;

		if (_executionEngine instanceof IConcurrentExecutionEngine) {

			res = new GemocModelDebugger(dispatcher, _executionEngine);
			
			List<IMutableFieldExtractor> extractors = new ArrayList<IMutableFieldExtractor>();
			extractors.add(new AnnotationMutableFieldExtractor());
			
			res.setMutableFieldExtractors(extractors);
		}

		// If in the launch configuration it is asked to pause at the start,
		// we add this dummy break
		try {
			if (configuration.getAttribute(RunConfiguration.LAUNCH_BREAK_START, false)) {
				res.addPredicateBreak(new BiPredicate<IExecutionEngine, MSEOccurrence>() {
					@Override
					public boolean test(IExecutionEngine t, MSEOccurrence u) {
						return true;
					}
				});
			}
		} catch (CoreException e) {
			e.printStackTrace();
		}

		_executionEngine.getExecutionContext().getExecutionPlatform().addEngineAddon(res);
		return res;
	}

	@Override
	protected String getDebugTargetName(ILaunchConfiguration configuration, EObject firstInstruction) {
		return "Gemoc debug target";
	}

	@Override
	protected List<IDSLCurrentInstructionListener> getCurrentInstructionListeners() {
		List<IDSLCurrentInstructionListener> result = super.getCurrentInstructionListeners();
		result.add(AbstractGemocDebuggerServices.LISTENER);
		return result;
	}

	@Override
	protected String getDebugJobName(ILaunchConfiguration configuration, EObject firstInstruction) {
		return "Gemoc Concurrent debug job";
	}

	@Override
	protected String getPluginID() {
		return Activator.PLUGIN_ID;
	}

	@Override
	protected String getModelIdentifier() {
		if (_executionEngine instanceof ConcurrentExecutionEngine)
			return Activator.PLUGIN_ID+".debugModel";
		else
			return MODEL_ID;
	}

	@Override
	protected ILaunchConfiguration[] createLaunchConfiguration(IResource file, EObject firstInstruction, String mode)
			throws CoreException {
		ILaunchConfiguration[] launchConfigs = super.createLaunchConfiguration(file, firstInstruction, mode);

		if (launchConfigs.length == 1) {
			// open configuration for further editing
			if (launchConfigs[0] instanceof ILaunchConfigurationWorkingCopy) {
				ILaunchConfigurationWorkingCopy configuration = (ILaunchConfigurationWorkingCopy) launchConfigs[0];

				String selectedLanguage = configuration.getAttribute(RunConfiguration.LAUNCH_SELECTED_LANGUAGE, "");
				if (selectedLanguage.equals("")) {

					// TODO try to infer possible language and other attribute
					// from project content and environment
					configuration.setAttribute(ConcurrentRunConfiguration.LAUNCH_SELECTED_DECIDER,
							ConcurrentRunConfiguration.DECIDER_ASKUSER_STEP_BY_STEP);
					final ILaunchGroup group = DebugUITools.getLaunchGroup(configuration, mode);
					if (group != null) {
						ILaunchConfiguration savedLaunchConfig = configuration.doSave();
						// open configuration for user validation and inputs
						DebugUITools.openLaunchConfigurationDialogOnGroup(PlatformUI.getWorkbench()
								.getActiveWorkbenchWindow().getShell(), new StructuredSelection(savedLaunchConfig),
								group.getIdentifier(), null);
						// DebugUITools.openLaunchConfigurationDialog(PlatformUI.getWorkbench()
						// .getActiveWorkbenchWindow().getShell(),
						// savedLaunchConfig, group.getIdentifier(), null);
					}
				}
			}
		}
		return launchConfigs;

	}

}
