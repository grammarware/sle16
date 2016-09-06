package org.gemoc.execution.concurrent.ccsljavaengine;

import org.osgi.framework.BundleContext;
import org.gemoc.commons.eclipse.logging.backends.DefaultLoggingBackend;
import org.gemoc.commons.eclipse.pde.GemocPlugin;

import fr.inria.diverse.commons.eclipse.messagingsystem.api.MessagingSystemManager;
import fr.inria.diverse.commons.messagingsystem.api.MessagingSystem;

public class Activator extends GemocPlugin {

	// The plug-in ID
		public static final String PLUGIN_ID = "org.gemoc.execution.concurrent.ccsljavaengine"; //$NON-NLS-1$
		
		// The shared instance
		private static Activator plugin;

		/**
		 * The constructor
		 */
		public Activator() {
		}

		/*
		 * (non-Javadoc)
		 * 
		 * @see
		 * org.eclipse.ui.plugin.AbstractUIPlugin#start(org.osgi.framework.BundleContext
		 * )
		 */
		public void start(BundleContext context) throws Exception {
			super.start(context);
			plugin = this;
		}

		/*
		 * (non-Javadoc)
		 * 
		 * @see
		 * org.eclipse.ui.plugin.AbstractUIPlugin#stop(org.osgi.framework.BundleContext
		 * )
		 */
		public void stop(BundleContext context) throws Exception {
			plugin = null;
			super.stop(context);
		}

		/**
		 * Returns the shared instance
		 * 
		 * @return the shared instance
		 */
		public static Activator getDefault() {
			return plugin;
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
				MessagingSystem ms = msm.createBestPlatformMessagingSystem(org.gemoc.executionframework.engine.Activator.PLUGIN_ID, "Execution Engine");
				_loggingBackend.setMessagingSystem(ms);
			}
			return _loggingBackend;
		}

}
