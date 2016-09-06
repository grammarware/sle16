package org.gemoc.mocc.transformations.instance2clocksystem.handler;

import org.eclipse.core.resources.IResource;
import org.eclipse.jface.dialogs.Dialog;
import org.gemoc.commons.eclipse.ui.dialogs.SelectAnyIFileDialog;

public class XtendFileChooserSelectAnyIFileDialog {

	protected String getSelectedFile()
	{
		SelectAnyIFileDialog dialog = new SelectAnyIFileDialog();
		dialog.setPattern("*.xtend");
		if (dialog.open() == Dialog.OK)
			return ((IResource) dialog.getResult()[0]).getFullPath().toString();
		return null;
	}
	public static void main(String[] args) 
	{
		XtendFileChooserSelectAnyIFileDialog xf = new XtendFileChooserSelectAnyIFileDialog();
		System.out.println(xf.getSelectedFile());
		

	}

}
