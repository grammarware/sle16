package org.gemoc.execution.concurrent.ccsljavaxdsml.ui.editor;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.dialogs.Dialog;
import org.gemoc.commons.eclipse.core.resources.FileFinderVisitor;
import org.gemoc.commons.eclipse.ui.dialogs.SelectSpecificFileDialog;

import fr.inria.diverse.melange.ui.contentassist.IProposal;

public class SelectEclProposal implements IProposal{
	
	class SelectEclIFileDialog extends SelectSpecificFileDialog {
		public FileFinderVisitor instanciateFinder() {
			return new FileFinderVisitor("ecl");
		}
	}

	@Override
	public String getDisplayText() {
		return "-- Select an existing ECL file --";
	}

	@Override
	public String getReplacementText() {
		SelectEclIFileDialog dialog = new SelectEclIFileDialog();
		if (dialog.open() == Dialog.OK) {
			Object[] selections = dialog.getResult();
			if(selections != null 
				&& selections.length != 0
				&& selections[0] instanceof IResource 
			){
				IResource eclFile = (IResource) selections[0];
				String replacementText = "\"/"+eclFile.getProject().getName() +"/"+eclFile.getProjectRelativePath()+"\"";
				return replacementText;
			}
		}
		return "";
	}

	@Override
	public void configureProject(IProject project) {
		// TODO Auto-generated method stub
	}

	@Override
	public void configureProposal(EObject context) {
		// TODO Auto-generated method stub
	}

}
