package org.gemoc.execution.concurrent.ccsljavaxdsml.ui.dse;

import org.eclipse.core.resources.IResource;
import org.gemoc.execution.concurrent.ccsljavaxdsml.ui.Activator;

public interface IGemocDSEBuilderAddon {
	
	public static final String BUILDER_ID = Activator.PLUGIN_ID+".dse_builder";

	public static final String MARKER_TYPE = Activator.PLUGIN_ID+".dse_problem";

	public void processResourceAddon(IResource resource);
	
}
