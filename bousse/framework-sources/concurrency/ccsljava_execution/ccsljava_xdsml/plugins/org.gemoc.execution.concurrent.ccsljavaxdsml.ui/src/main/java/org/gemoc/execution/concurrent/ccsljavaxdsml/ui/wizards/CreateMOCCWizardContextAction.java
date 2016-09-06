package org.gemoc.execution.concurrent.ccsljavaxdsml.ui.wizards;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchWizard;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.wizards.IWizardDescriptor;
import org.gemoc.commons.eclipse.core.resources.NewProjectWorkspaceListener;
import org.gemoc.commons.eclipse.ui.WizardFinder;
import org.gemoc.execution.concurrent.ccsljavaxdsml.ui.Activator;
import org.gemoc.xdsmlframework.ide.ui.xdsml.wizards.MelangeXDSMLProjectHelper;

import fr.inria.diverse.melange.metamodel.melange.Language;

public class CreateMOCCWizardContextAction {

	public static final String MOCCWIZARD_ID = Activator.PLUGIN_ID+".wizards.CreateNewMoCProject";
	
	public enum CreateMOCCAction {CREATE_NEW_MOCC_PROJECT, SELECT_EXISTING_MOCC_PROJECT};
	
	public CreateMOCCAction actionToExecute = CreateMOCCAction.CREATE_NEW_MOCC_PROJECT;
	
	// one of these must be set, depending on it it will work on the file or directly in the model 
	protected IProject gemocLanguageIProject = null;
	protected Language gemocMelangeLanguage = null;
	
	public CreateMOCCWizardContextAction(IProject updatedGemocLanguageProject) {
		gemocLanguageIProject = updatedGemocLanguageProject;
	}
	public CreateMOCCWizardContextAction(IProject updatedGemocLanguageProject, Language melangeLanguage) {
		gemocLanguageIProject = updatedGemocLanguageProject;
		gemocMelangeLanguage = melangeLanguage;
	}

	public void execute() {
		switch (actionToExecute) {
		case CREATE_NEW_MOCC_PROJECT:
			createNewMOCCProject();
			break;
		case SELECT_EXISTING_MOCC_PROJECT:
			selectExistingMOCCProject();
			break;

		default:
			break;
		}
	}

	protected void createNewMOCCProject(){
		final IWizardDescriptor descriptor = WizardFinder.findNewWizardDescriptor(MOCCWIZARD_ID);
		// Then if we have a wizard, open it.
		if (descriptor != null) {				
			NewProjectWorkspaceListener workspaceListener = new NewProjectWorkspaceListener();
			ResourcesPlugin.getWorkspace().addResourceChangeListener(workspaceListener);
			try {
				IWorkbenchWizard wizard;
				wizard = descriptor.createWizard();
				IWorkbench workbench = PlatformUI.getWorkbench();
				CreateNewMoCProject createNewMoCCProjectWizard = (CreateNewMoCProject)wizard;
				// fine initialization
				Language mLanguage = getMelangeLanguage();
				if(mLanguage != null){
					initWizardFromMelangeLanguage(createNewMoCCProjectWizard, mLanguage);
				}
				wizard.init(workbench, null);
				WizardDialog wd = new WizardDialog(workbench.getActiveWorkbenchWindow().getShell(), wizard);
				wd.create();
				wd.setTitle(wizard.getWindowTitle());
				
				int res = wd.open();
				if(res == WizardDialog.OK){
					ResourcesPlugin.getWorkspace().removeResourceChangeListener(workspaceListener);
					IProject createdProject = workspaceListener.getLastCreatedProject();
					// update the project configuration model					
					if(createdProject != null){
						
						
						addMOCCProjectToConf(createNewMoCCProjectWizard.createdProjectName);
					}
					else{
						Activator.error("not able to detect which project was created by wizard", null);
					}
				}						
			} catch (CoreException e) {
				Activator.error(e.getMessage(), e);
			} finally {
				ResourcesPlugin.getWorkspace().removeResourceChangeListener(workspaceListener);						
			}
		}
		else{
			Activator.error("wizard with id="+MOCCWIZARD_ID+" not found", null);
		}
	}
	
	protected void initWizardFromMelangeLanguage(CreateNewMoCProject createNewMOCProjectWizard, Language language){
		createNewMOCProjectWizard._askProjectNamePage.setInitialProjectName(MelangeXDSMLProjectHelper.baseProjectName(gemocLanguageIProject)+".mocc");
		createNewMOCProjectWizard._askMoCInfoPage.initialTemplateMoCFileFieldValue = language.getName().replaceAll(" ", "_");
	}
	
	protected void selectExistingMOCCProject(){
		MessageDialog.openWarning(
				PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell(),
				"Gemoc Language Workbench UI",
				"selectExistingMOCCProject. Action not implemented yet");
	}
	
	protected void addMOCCProjectToConf(String projectName){
		MessageDialog.openWarning(
				PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell(),
				"Gemoc Language Workbench UI",
				"addMOCCProjectToConf. Action not implemented yet");
	}
	
	
	protected Language getMelangeLanguage(){

		if(this.gemocMelangeLanguage != null){
			return this.gemocMelangeLanguage;
		}
		else return null;
	}

}
