/*******************************************************************************
 *  Copyright (c) 2000, 2012 IBM Corporation and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 * 
 *  Contributors:
 *  IBM - Initial API and implementation
 *  BEA - Daniel R Somerfield - Bug 88939
 *  Remy Chi Jian Suen - Bug 221973
 *******************************************************************************/
package org.gemoc.execution.concurrent.ccsljavaengine.ui.launcher;

import org.eclipse.osgi.util.NLS;
import org.gemoc.execution.concurrent.ccsljavaengine.ui.Activator;

public class LauncherMessages extends NLS {
	private static final String BUNDLE_NAME = Activator.PLUGIN_ID+".launcher.LauncherMessages";//$NON-NLS-1$

	

	public static String ConcurrentMainTab_Model_not_specified;
	public static String ConcurrentMainTab_invalid_model_file;
	public static String ConcurrentMainTab_model_doesnt_exist;
	

	public static String ConcurrentMainTab_Language_not_specified;
	public static String ConcurrentMainTab_incompatible_model_extension_for_language;
	public static String ConcurrentMainTab_missing_language;
	public static String ConcurrentMainTab_Invalid_Language_missing_xdsml;
	public static String ConcurrentMainTab_Invalid_Language_missing_xdsml_with_error;



	static {
		// load message values from bundle file
		NLS.initializeMessages(BUNDLE_NAME, LauncherMessages.class);
	}


}
