package org.gemoc.gemoc_heterogeneous_modeling_workbench.ui.launcher;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.debug.core.ILaunch;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.ILaunchManager;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.jdt.core.IType;
import org.eclipse.jdt.core.search.SearchMatch;
import org.eclipse.jdt.core.search.SearchRequestor;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.PlatformUI;
import org.gemoc.commons.eclipse.ui.ViewHelper;
import org.gemoc.execution.concurrent.ccsljavaengine.ui.debug.GemocModelDebugger;
import org.gemoc.execution.concurrent.ccsljavaxdsml.api.core.IConcurrentExecutionEngine;
import org.gemoc.execution.engine.coordinator.commons.CoordinatedModelExecutionContext;
import org.gemoc.execution.engine.coordinator.commons.CoordinatedRunConfiguration;
import org.gemoc.execution.engine.coordinator.commons.HeterogeneousEngine;
import org.gemoc.executionframework.engine.ui.debug.AbstractGemocDebugger;
import org.gemoc.executionframework.extensions.sirius.services.AbstractGemocDebuggerServices;
import org.gemoc.executionframework.ui.views.engine.EnginesStatusView;
import org.gemoc.gemoc_heterogeneous_modeling_workbench.ui.Activator;
import org.gemoc.xdsmlframework.api.core.ExecutionMode;
import org.gemoc.xdsmlframework.api.core.IExecutionContext;

import fr.inria.diverse.commons.messagingsystem.api.MessagingSystem;
import fr.obeo.dsl.debug.ide.IDSLDebugger;
import fr.obeo.dsl.debug.ide.adapter.IDSLCurrentInstructionListener;
import fr.obeo.dsl.debug.ide.event.DSLDebugEventDispatcher;

public class Launcher
		extends
		fr.obeo.dsl.debug.ide.sirius.ui.launch.AbstractDSLLaunchConfigurationDelegateUI 
{
	
	
	public final static String TYPE_ID = "org.gemoc.gemoc_heterogeneous_modeling_workbench.ui.GemocReflectiveModelLauncherID";

	public final static String MODEL_ID = "org.gemoc.gemoc_heterogeneous_modeling_workbench.ui.debugModel";

	private ArrayList<IConcurrentExecutionEngine> _executionEngines;

	private HeterogeneousEngine heterogeneousEngine;

	private CoordinatedModelExecutionContext executionContext;

	@Override
	public void launch(final ILaunchConfiguration configuration, final String mode, final ILaunch launch, IProgressMonitor monitor)
			throws CoreException {	
		try 
		{
			final CoordinatedRunConfiguration runConfiguration = new CoordinatedRunConfiguration(configuration);
			debug("About to initialize and run the GEMOC Coordinated Execution Engine...");			

			// make sure to have the engine view when starting the engine
			PlatformUI.getWorkbench().getDisplay().syncExec(
					new Runnable()
					{
						@Override
						public void run() {
							ViewHelper.retrieveView(EnginesStatusView.ID);
						}			
					});	
						
			ExecutionMode executionMode = null;
			if (ILaunchManager.DEBUG_MODE.equals(mode))
				//&& runConfiguration.getAnimatorURI() != null) 
			{
				executionMode = ExecutionMode.Animation;			
			}
			else
			{
				executionMode = ExecutionMode.Run;
			}
			executionContext = new CoordinatedModelExecutionContext(runConfiguration, executionMode);			
			executionContext.initializeResourceModel();
			heterogeneousEngine = new HeterogeneousEngine(executionContext, executionMode);
			heterogeneousEngine.initialize((IExecutionContext) executionContext);
			_executionEngines = heterogeneousEngine.get_coordinatedEngines();

//			 And we start it within a dedicated job
						Job job = new Job(getDebugJobName(configuration, getFirstInstruction(configuration))) {
							@Override
							protected IStatus run(IProgressMonitor monitor) {
								// If we are debugging, we start
								// the execution using the super class
								// AbstractDSLLaunchConfigurationDelegateUI
								// This will start yet another job and eventually start
								// the engine
								if (ILaunchManager.DEBUG_MODE.equals(mode)) {
//									heterogeneousEngine.getExecutionContext().getExecutionPlatform().addEngineAddon(animator);
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
									heterogeneousEngine.start();
									debug("Execution finished.");
									return new Status(IStatus.OK, getPluginID(), "Execution was launched successfully");
								}
							}
						};
						debug("Initialization done, starting engine...");
						job.schedule();

		} 
		catch (Exception e)
		{
			String message = "Error occured when starting the coordinated execution engine: " + e.getMessage() +  " (see inner exception).";
		  	//error(message);
			e.printStackTrace();
		  	throw new CoreException(new Status(Status.ERROR, Activator.PLUGIN_ID, message, e));
		}
	}


	private void debug(String message) {
		getMessagingSystem().debug(message, getPluginID());
	}

	private void info(String message) {
		getMessagingSystem().info(message, getPluginID());
	}

	private void warn(String message) {
		getMessagingSystem().warn(message, getPluginID());
	}

	private void error(String message) {
		getMessagingSystem().error(message, getPluginID());
	}

	private MessagingSystem getMessagingSystem() {
		return Activator
				.getDefault()
				.getMessaggingSystem();	
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
	protected IDSLDebugger getDebugger(ILaunchConfiguration configuration,
			DSLDebugEventDispatcher dispatcher, EObject firstInstruction,
			IProgressMonitor monitor) {
		AbstractGemocDebugger res = null;

		if (heterogeneousEngine instanceof HeterogeneousEngine) {

			res = new GemocModelDebugger(dispatcher, heterogeneousEngine);

		} 

		heterogeneousEngine.getExecutionContext().getExecutionPlatform().addEngineAddon(res);
		return res;
	}

	@Override
	protected String getDebugTargetName(ILaunchConfiguration configuration, EObject firstInstruction) 
	{
		return "Gemoc heterogeneous debug target";
	}

	@Override
	protected List<IDSLCurrentInstructionListener> getCurrentInstructionListeners() 
	{
		List<IDSLCurrentInstructionListener> result = super.getCurrentInstructionListeners();
		result.add(AbstractGemocDebuggerServices.LISTENER);
		return result;
	}

	@Override
	protected String getDebugJobName(ILaunchConfiguration configuration, EObject firstInstruction) 
	{
		return "Gemoc heterogeneous execution debug job";
	}

	@Override
	protected String getPluginID() 
	{
		return Activator.PLUGIN_ID;
	}

	@Override
	protected String getModelIdentifier() 
	{
		return MODEL_ID;
	}
	
	class DefaultSearchRequestor extends SearchRequestor
	{
		
		public IType _binaryType;

		@Override
		public void acceptSearchMatch(SearchMatch match) throws CoreException {
			_binaryType = (IType)match.getElement();
			System.out.println(match.getElement());
		}
		
	}
}
