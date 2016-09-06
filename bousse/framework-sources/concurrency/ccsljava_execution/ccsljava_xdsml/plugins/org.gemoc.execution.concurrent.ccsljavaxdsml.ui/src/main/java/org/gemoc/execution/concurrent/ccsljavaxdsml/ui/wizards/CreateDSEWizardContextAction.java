package org.gemoc.execution.concurrent.ccsljavaxdsml.ui.wizards;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchWizard;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.wizards.IWizardDescriptor;
import org.gemoc.commons.eclipse.core.resources.NewProjectWorkspaceListener;
import org.gemoc.commons.eclipse.ui.WizardFinder;
import org.gemoc.execution.concurrent.ccsljavaxdsml.ui.Activator;
import org.gemoc.execution.concurrent.ccsljavaxdsml.ui.dialogs.SelectECLIFileDialog;
import org.gemoc.xdsmlframework.ide.ui.xdsml.wizards.MelangeXDSMLProjectHelper;

import fr.inria.diverse.melange.metamodel.melange.Language;

public class CreateDSEWizardContextAction {

	public enum CreateDSEAction {
		CREATE_NEW_DSE_PROJECT, SELECT_EXISTING_DSE_PROJECT
	};

	public CreateDSEAction actionToExecute = CreateDSEAction.CREATE_NEW_DSE_PROJECT;

	// one of these must be set, depending on it it will work on the file or
	// directly in the model
	protected IProject gemocLanguageIProject = null;
	
	protected Language gemocMelangeLanguage = null;
	
	private String eclPath = null;

	public CreateDSEWizardContextAction(IProject updatedGemocLanguageProject) {
		gemocLanguageIProject = updatedGemocLanguageProject;
	}
	
	public CreateDSEWizardContextAction(IProject updatedGemocLanguageProject, Language melangeLanguage) {
		gemocLanguageIProject = updatedGemocLanguageProject;
		gemocMelangeLanguage = melangeLanguage;
	}
	

	public void execute() {
		switch (actionToExecute) {
		case CREATE_NEW_DSE_PROJECT:
			createNewDSEProject();
			break;
		case SELECT_EXISTING_DSE_PROJECT:
			selectExistingDSEProject();
			break;

		default:
			break;
		}
	}
	
	public void createNewDSEProject() {
		final IWizardDescriptor descriptor = WizardFinder.findNewWizardDescriptor(Activator.PLUGIN_ID+".wizards.CreateNewDSEProject");
		// Then if we have a wizard, open it.
		if (descriptor != null) {				
			NewProjectWorkspaceListener workspaceListener = new NewProjectWorkspaceListener();
			ResourcesPlugin.getWorkspace().addResourceChangeListener(workspaceListener);
			try {
				IWorkbenchWizard wizard;
				wizard = descriptor.createWizard();
				IWorkbench workbench = PlatformUI.getWorkbench();
				CreateNewDSEProject createNewDSEProjectWizard = (CreateNewDSEProject)wizard;
				// fine initialization
				Language mLanguage = getMelangeLanguage();
				if(mLanguage != null){
					initWizardFromMelangeLanguage(createNewDSEProjectWizard, mLanguage);				
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
						
						eclPath = "/"+createNewDSEProjectWizard.createdProjectName+"/ecl/"+createNewDSEProjectWizard.createdTemplateECLFile+".ecl";
						addECLFileToConf(createNewDSEProjectWizard.createdProjectName, 
								eclPath, 
								this.gemocLanguageIProject);
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
			Activator.error("wizard with id="+Activator.PLUGIN_ID+".ui.wizards.CreateNewDSEProject not found", null);
		}
	}

	protected void initWizardFromMelangeLanguage(CreateNewDSEProject createNewDSEProjectWizard, Language language){
		createNewDSEProjectWizard._askProjectNamePage.setInitialProjectName(MelangeXDSMLProjectHelper.baseProjectName(gemocLanguageIProject)+".dse");
		createNewDSEProjectWizard._askDSEInfoPage.initialTemplateECLFileFieldValue = language.getName();
		MelangeXDSMLProjectHelper.getFirstEcorePath(language);
		createNewDSEProjectWizard._askDSEInfoPage.initialEcoreFileFieldValue =  "platform:/resource"+MelangeXDSMLProjectHelper.getFirstEcorePath(language);
		// FIXME currently we do not know how to store the DefaultRootContainer in a melangeXDSML project 
		//createNewDSEProjectWizard._askDSEInfoPage.initialRootContainerFieldValue = languageDefinition.getDomainModelProject().getDefaultRootEObjectQualifiedName();
		
	}
	protected void selectExistingDSEProject() {
		/*
		 * MessageDialog.openWarning(
		 * PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell(),
		 * "Gemoc Language Workbench UI",
		 * "selectExistingDSEProject. Action not implemented yet");
		 */
		SelectECLIFileDialog dialog = new SelectECLIFileDialog();
		int res = dialog.open();
		if (res == WizardDialog.OK) {
			// update the project model
			addECLFileToConf(((IResource) dialog.getResult()[0]).getProject().getName(), 
					((IResource) dialog.getResult()[0]).getFullPath().toString(), 
					this.gemocLanguageIProject);
		}
	}
	protected void addECLFileToConf(String projectName, String eclFileURI, IProject gemocLanguageIProject) {
//		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
//		Map<String, Object> m = reg.getExtensionToFactoryMap();
//		m.put(Activator.GEMOC_PROJECT_CONFIGURATION_FILE_EXTENSION,
//				new XMIResourceFactoryImpl());
//		ResourceSet resSet = new ResourceSetImpl();
//		// get the resource
//		IFile configFile = gemocLanguageIProject.getFile(new Path(Activator.GEMOC_PROJECT_CONFIGURATION_FILE));
//		Resource resource = resSet
//				.getResource(URI.createURI(configFile.getLocationURI()
//						.toString()), true);
//		ConcurrentLanguageDefinition gemocLanguageWorkbenchConfiguration = (ConcurrentLanguageDefinition) resource
//				.getContents().get(0);
//		
//		addECLFileToConf(projectName, eclFileURI, gemocLanguageWorkbenchConfiguration);
//		
//		try {
//			resource.save(null);
//		} catch (IOException e) {
//			Activator.error(e.getMessage(), e);
//		}
//		if (configFile != null) {
//			try {
//				configFile.refreshLocal(IResource.DEPTH_ZERO,
//						new NullProgressMonitor());
//			} catch (CoreException e) {
//				Activator.error(e.getMessage(), e);
//			}
//		}
	}
	

	
	protected Language getMelangeLanguage(){

		if(this.gemocMelangeLanguage != null){
			return this.gemocMelangeLanguage;
		}
		else return null;
	}
	
	public String getEclPath(){
		return eclPath;
	}
}
