package org.gemoc.execution.engine.coordinator.commons;

import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.gemoc.commons.eclipse.logging.backends.DefaultLoggingBackend;
import org.gemoc.commons.eclipse.pde.GemocPlugin;
import org.osgi.framework.BundleContext;

import fr.inria.diverse.commons.eclipse.messagingsystem.api.MessagingSystemManager;
import fr.inria.diverse.commons.messagingsystem.api.MessagingSystem;

/**
 * The activator class controls the plug-in life cycle
 */
public class Activator extends GemocPlugin {

	// The plug-in ID
	public static final String PLUGIN_ID = "org.gemoc.execution.engine.coordinator.commons"; //$NON-NLS-1$

	
	/**
	 * The constructor
	 */
	public Activator() {
		super();
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#start(org.osgi.framework.BundleContext)
	 */
	public void start(BundleContext context) throws Exception {
		super.start(context);
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(BundleContext context) throws Exception {
		super.stop(context);
	}

	@Override
	public String getId() {
		return PLUGIN_ID;
	}


	private DefaultLoggingBackend _loggingBackend;
	@Override
	public DefaultLoggingBackend resolveLoggingBackend() {
		if (_loggingBackend == null)
		{
			_loggingBackend = new DefaultLoggingBackend(this);
			MessagingSystemManager msm = new MessagingSystemManager();
			MessagingSystem ms = msm.createBestPlatformMessagingSystem(PLUGIN_ID, "Execution Engine");
			_loggingBackend.setMessagingSystem(ms);
		}
		return _loggingBackend;
	}



}
