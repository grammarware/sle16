package org.gemoc.execution.concurrent.ccsljavaxdsml.ui.wizards.contextDSA;

import org.eclipse.core.resources.IProject;

import fr.inria.diverse.commons.eclipse.pde.manifest.ManifestChanger;

public class CreateDSAWizardContextBase {

	protected IProject _gemocLanguageIProject;
	
	public CreateDSAWizardContextBase(IProject gemocLanguageIProject) {
		_gemocLanguageIProject = gemocLanguageIProject;
	}

	protected void addDSAProjectToConf(String projectName) {
		addDSAProjectToConf(projectName, _gemocLanguageIProject);		
	}
	protected void addDSAProjectToConf(String projectName,IProject gemocLanguageIProject) {
		ManifestChanger manifestChanger = new ManifestChanger(gemocLanguageIProject);
		try {
			manifestChanger.addPluginDependency(projectName);
			manifestChanger.commit();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	

}