package org.modelexecution.xmof.gemoc.engine.ui.commons;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.debug.core.ILaunchConfiguration;

public class RunConfiguration extends
		org.gemoc.executionframework.engine.ui.commons.RunConfiguration
		implements IXMOFRunConfiguration {

	// main launch parameters
	public static final String LAUNCH_INITIALIZATION_MODEL = "GEMOC_LAUNCH_INITIALIZATION_MODEL";
	public static final String LAUNCH_NODEWISE_STEP = "GEMOC_LAUNCH_NODEWISE_STEP";
	public static final String LAUNCH_IGNORE_STEPS = "GEMOC_LAUNCH_IGNORE_STEPS";

	public RunConfiguration(ILaunchConfiguration launchConfiguration)
			throws CoreException {
		super(launchConfiguration);

	}

	@Override
	protected void extractInformation() throws CoreException {
		super.extractInformation();

		modelInitializationModel = getAttribute(LAUNCH_INITIALIZATION_MODEL, "");
		nodewiseStepping = getAttribute(LAUNCH_NODEWISE_STEP, false);
		ignoreSteps = getAttribute(LAUNCH_IGNORE_STEPS, true);
	}

	private String modelInitializationModel;

	@Override
	public String getModelInitializationModel() {
		return modelInitializationModel;
	}

	private boolean nodewiseStepping;

	@Override
	public boolean getNodewiseStepping() {
		return nodewiseStepping;
	}

	private boolean ignoreSteps;

	public boolean getIgnoreSteps() {
		return ignoreSteps;
	}

}
