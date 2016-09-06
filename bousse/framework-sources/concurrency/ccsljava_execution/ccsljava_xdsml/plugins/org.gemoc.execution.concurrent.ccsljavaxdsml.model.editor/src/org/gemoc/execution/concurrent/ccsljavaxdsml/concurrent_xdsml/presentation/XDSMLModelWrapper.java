package org.gemoc.execution.concurrent.ccsljavaxdsml.concurrent_xdsml.presentation;

import org.gemoc.execution.concurrent.ccsljavaxdsml.concurrent_xdsml.ConcurrentLanguageDefinition;
import org.gemoc.execution.concurrent.ccsljavaxdsml.concurrent_xdsml.util.XDSMLConcurrentModelHelper;
import org.gemoc.executionframework.xdsml_base.AnimatorProject;
import org.gemoc.executionframework.xdsml_base.DomainModelProject;
import org.gemoc.executionframework.xdsml_base.EditorProject;
import org.gemoc.executionframework.xdsml_base.SiriusEditorProject;
import org.gemoc.executionframework.xdsml_base.XTextEditorProject;

/**
 * Wrapped version of the XDSML model dedicated to the GemoXDSMLForm view
 * 
 *
 */
public class XDSMLModelWrapper extends ViewModelWrapper {

	public ConcurrentLanguageDefinition languageDefinition;

	public XDSMLModelWrapper() {

	}

	public String getLanguageName() {
		if (languageDefinition != null && languageDefinition.getName() != null) {
			return languageDefinition.getName();
		} else
			return "";
	}

	public void setLanguageName(String languageName) {
		firePropertyChange("languageName", getLanguageName(), languageName);
		languageDefinition.setName(languageName);
	}

	public String getDomainModelProjectName() {
		if (languageDefinition != null && languageDefinition.getDomainModelProject() != null
				&& languageDefinition.getDomainModelProject().getProjectName() != null) {
			return languageDefinition.getDomainModelProject().getProjectName();
		} else
			return "";
	}

	public void setDomainModelProjectName(String domainModelProjectName) {
		String oldName = getDomainModelProjectName();
		firePropertyChange("domainModelProjectName", oldName, domainModelProjectName);
		XDSMLConcurrentModelHelper.getOrCreateDomainModelProject(languageDefinition).setProjectName(domainModelProjectName);
	}

	public void setGenmodelLocationURI(String genmodel) {
		String oldName = getGenmodelLocationURI();
		firePropertyChange("genmodelLocationURI", oldName, genmodel);
		XDSMLConcurrentModelHelper.getOrCreateDomainModelProject(languageDefinition).setGenmodeluri(genmodel);
	}

	public String getGenmodelLocationURI() {
		if (languageDefinition != null) {
			if (languageDefinition.getDomainModelProject() != null
					&& languageDefinition.getDomainModelProject().getGenmodeluri() != null) {
				return languageDefinition.getDomainModelProject().getGenmodeluri();
			}
		}
		return "";
	}

	public void setRootContainerModelElement(String root) {
		String oldName = getRootContainerModelElement();
		firePropertyChange("rootContainerModelElement", oldName, root);
		(XDSMLConcurrentModelHelper.getOrCreateDomainModelProject(languageDefinition)).setDefaultRootEObjectQualifiedName(root);
	}

	public String getRootContainerModelElement() {
		if (languageDefinition != null) {
			if (languageDefinition.getDomainModelProject() != null) {
				DomainModelProject ecoreProject = (DomainModelProject) languageDefinition.getDomainModelProject();
				return ecoreProject.getDefaultRootEObjectQualifiedName() != null ? ecoreProject
						.getDefaultRootEObjectQualifiedName() : "";
			}
		}
		return "";
	}

	public void setModelLoaderClass(String modelLoaderClass) {
		String oldName = getGenmodelLocationURI();
		firePropertyChange("modelLoaderClass", oldName, modelLoaderClass);
		XDSMLConcurrentModelHelper.getOrCreateDomainModelProject(languageDefinition).setModelLoaderClass(modelLoaderClass);
	}

	public String getModelLoaderClass() {
		if (languageDefinition != null) {
			if (languageDefinition.getDomainModelProject() != null
					&& languageDefinition.getDomainModelProject().getModelLoaderClass() != null) {
				return languageDefinition.getDomainModelProject().getModelLoaderClass();
			}
		}
		return "";
	}

	public String getSupportedFileExtension() {
		StringBuilder sb = new StringBuilder();
		sb.append("Supported file extensions: ");
		int i = 0;
		if (languageDefinition != null) {
			for (String s : languageDefinition.getFileExtensions()) {
	
				if (i > 0) {
					sb.append(", ");
				}
				sb.append(s);
				i++;
			}
		}
		return sb.toString();
	}

	public void setSupportedFileExtension(String supportedFileExtensions) {

	}

	public String getXTextEditorProjectName() {
		if (languageDefinition != null) {
			for (EditorProject editor : languageDefinition.getEditorProjects()) {
				if (editor instanceof XTextEditorProject && editor.getProjectName() != null) {
					return editor.getProjectName();
				}
			}
		}
		return "";
	}

	public void setXTextEditorProjectName(String name) {
		String oldName = getXTextEditorProjectName();
		firePropertyChange("xTextEditorProjectName", oldName, name);
		XDSMLConcurrentModelHelper.getOrCreateXTextEditorProject(languageDefinition).setProjectName(name);

	}

	public String getSiriusEditorProjectName() {
		if (languageDefinition != null) {
			for (EditorProject editor : languageDefinition.getEditorProjects()) {
				if (editor instanceof SiriusEditorProject && editor.getProjectName() != null) {
					return editor.getProjectName();
				}
			}
		}
		return "";
	}

	public void setSiriusEditorProjectName(String name) {
		String oldName = getSiriusEditorProjectName();
		firePropertyChange("xSiriusEditorProjectName", oldName, name);
		XDSMLConcurrentModelHelper.getOrCreateSiriusEditorProject(languageDefinition).setProjectName(name);
	}

	public String getSiriusAnimatorProjectName() {
		if (languageDefinition != null) {
			for (AnimatorProject editor : languageDefinition.getAnimatorProjects()) {
				return editor.getProjectName();
			}
		}
		return "";
	}

	public void setSiriusAnimatorProjectName(String name) {
		String oldName = getSiriusAnimatorProjectName();
		firePropertyChange("xSiriusAnimatorProjectName", oldName, name);
		XDSMLConcurrentModelHelper.getOrCreateSiriusAnimatorProject(languageDefinition).setProjectName(name);
	}

	public String getDSAProjectName() {
		if (languageDefinition != null && languageDefinition.getDsaProject() != null
				&& languageDefinition.getDsaProject().getProjectName() != null) {
			return languageDefinition.getDsaProject().getProjectName();
		} else
			return "";
	}

	public void setDSAProjectName(String projectName) {
		String oldName = getDSAProjectName();
		firePropertyChange("dSAProjectName", oldName, projectName);
		XDSMLConcurrentModelHelper.getOrCreateDSAProject(languageDefinition).setProjectName(projectName);
	}

	public String getCodeExecutorClass() {
		if (languageDefinition != null) {
			if (languageDefinition.getDsaProject() != null
					&& languageDefinition.getDsaProject().getCodeExecutorClass() != null) {
				return languageDefinition.getDsaProject().getCodeExecutorClass();
			}
		}
		return "";
	}

	public void setCodeExecutorClass(String codeExecutorClass) {
		String oldName = getCodeExecutorClass();
		firePropertyChange("codeExecutorClass", oldName, codeExecutorClass);
		XDSMLConcurrentModelHelper.getOrCreateDSAProject(languageDefinition).setCodeExecutorClass(codeExecutorClass);
	}

	public String getDSEProjectName() {
		if (languageDefinition != null && languageDefinition.getDSEProject() != null
				&& languageDefinition.getDSEProject().getProjectName() != null) {
			return languageDefinition.getDSEProject().getProjectName();
		} else
			return "";
	}

	public void setDSEProjectName(String projectName) {
		String oldName = getDSEProjectName();
		firePropertyChange("dSEProjectName", oldName, projectName);
		XDSMLConcurrentModelHelper.getOrCreateDSEProject(languageDefinition).setProjectName(projectName);
	}

	public String getQvtoURI() {
		if (languageDefinition != null) {
			if (languageDefinition.getDSEProject() != null && languageDefinition.getDSEProject().getQvtoURI() != null) {
				return languageDefinition.getDSEProject().getQvtoURI();
			}
		}
		return "";
	}

	public void setQvtoURI(String qvtoURI) {
		String oldName = getQvtoURI();
		firePropertyChange("qvtoURI", oldName, qvtoURI);
		XDSMLConcurrentModelHelper.getOrCreateDSEProject(languageDefinition).setQvtoURI(qvtoURI);
	}

	public String getMoCCProjectName() {
		if (languageDefinition != null && languageDefinition.getMoCCProject() != null
				&& languageDefinition.getMoCCProject().getProjectName() != null) {
			return languageDefinition.getMoCCProject().getProjectName();
		} else
			return "";
	}

	public void setMoCCProjectName(String projectName) {
		String oldName = getMoCCProjectName();
		firePropertyChange("moCCProjectName", oldName, projectName);
		XDSMLConcurrentModelHelper.getOrCreateMoCCProject(languageDefinition).setProjectName(projectName);
	}


}
