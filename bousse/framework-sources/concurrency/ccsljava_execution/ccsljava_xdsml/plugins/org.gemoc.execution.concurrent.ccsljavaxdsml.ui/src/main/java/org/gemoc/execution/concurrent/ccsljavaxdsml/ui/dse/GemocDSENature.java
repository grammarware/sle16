package org.gemoc.execution.concurrent.ccsljavaxdsml.ui.dse;

import org.eclipse.core.runtime.CoreException;
import org.gemoc.commons.eclipse.core.resources.AbstractProjectNature;
import org.gemoc.execution.concurrent.ccsljavaxdsml.ui.Activator;

public class GemocDSENature extends AbstractProjectNature {

	/**
	 * ID of this project nature
	 */
	public static final String NATURE_ID = Activator.PLUGIN_ID+".dse_nature";

	@Override
	public void configure() throws CoreException {
		addBuilder(GemocDSEBuilder.BUILDER_ID);
	}

	@Override
	public void deconfigure() throws CoreException {
		removeBuilder(GemocDSEBuilder.BUILDER_ID);
	}

}
