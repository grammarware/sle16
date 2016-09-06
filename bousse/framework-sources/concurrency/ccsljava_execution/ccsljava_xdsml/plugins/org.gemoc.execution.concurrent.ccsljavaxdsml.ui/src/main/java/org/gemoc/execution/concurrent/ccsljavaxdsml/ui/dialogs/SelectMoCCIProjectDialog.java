package org.gemoc.execution.concurrent.ccsljavaxdsml.ui.dialogs;

import java.util.Arrays;

import org.eclipse.swt.widgets.Shell;
import org.gemoc.commons.eclipse.ui.dialogs.SelectPluginIProjectWithFileExtensionDialog;

public class SelectMoCCIProjectDialog extends SelectPluginIProjectWithFileExtensionDialog {

	public SelectMoCCIProjectDialog(Shell parentShell) {
		super(parentShell, Arrays.asList("mocc","ccslLib","moccml"));
	}

}
