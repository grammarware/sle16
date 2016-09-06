package org.modelexecution.xmof.gemoc.engine.ui.commons;

import org.gemoc.xdsmlframework.api.core.IRunConfiguration;

public interface IXMOFRunConfiguration extends IRunConfiguration {
	public String getModelInitializationModel();

	public boolean getNodewiseStepping();

	public boolean getIgnoreSteps();
}
