package org.gemoc.execution.concurrent.ccsljavaxdsml.ui.commands;

import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IHandler;
import org.eclipse.core.resources.IProject;
import org.gemoc.execution.concurrent.ccsljavaxdsml.ui.wizards.CreateMOCCWizardContextAction;
import org.gemoc.xdsmlframework.ide.ui.commands.AbstractMelangeSelectHandler;

import fr.inria.diverse.melange.metamodel.melange.Language;

public class CreateMOCCProjectHandler extends AbstractMelangeSelectHandler implements IHandler {

	@Override
	public Object executeForSelectedLanguage(ExecutionEvent event, IProject updatedGemocLanguageProject,
			Language language) throws ExecutionException {

		CreateMOCCWizardContextAction action = new CreateMOCCWizardContextAction(
				updatedGemocLanguageProject,
				language);
		action.actionToExecute = CreateMOCCWizardContextAction.CreateMOCCAction.CREATE_NEW_MOCC_PROJECT;
		action.execute();
		return null;
	}

	@Override
	public String getSelectionMessage() {
		return "Select Language that is used to initialize the MOC creation wizard";
	}

}
