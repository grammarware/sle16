package org.gemoc.execution.engine.coordinator.commons;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.emf.common.util.URI;
import org.eclipse.m2m.qvt.oml.ExecutionContextImpl;
import org.gemoc.bcool.transformation.qvto2ccsl.ui.popup.actions.Qvto2CCSLTranslator;

public class GemocQvto2CCSLTranslator extends Qvto2CCSLTranslator {

	public GemocQvto2CCSLTranslator() {
		super();
	}
	
	@Override
	public org.eclipse.emf.ecore.resource.Resource applyQVTo(URI transformationURI, java.util.ArrayList<IFile> inputModelfiles, URI outputmodelURI) {
		return super.applyQVTo(transformationURI, inputModelfiles, outputmodelURI);
	}
	
	@Override
	protected ExecutionContextImpl createExecutionContext(URI model1Uri,
			URI model2Uri) {
		ExecutionContextImpl context = new ExecutionContextImpl();
		
		context.setConfigProperty("inM1MoCCPath", getAssociatedTimemodelPath(model1Uri));
		
		context.setConfigProperty("inM2MoCCPath", getAssociatedTimemodelPath(model2Uri));
		
		context.setConfigProperty("ApplyAll", "true");
		
		return context;
	}

	protected String getAssociatedTimemodelPath(URI modelUri) {
		String modelPathName = modelUri.toPlatformString(true);
		String tmpModelProjectName = modelPathName.substring(1, modelPathName.length());
		String modelprojectName = tmpModelProjectName.substring(0, tmpModelProjectName.indexOf('/'));
		IProject modelProject = ResourcesPlugin.getWorkspace().getRoot().getProject(modelprojectName);
		String modelName = modelPathName.substring(modelPathName.lastIndexOf('/'));
		String modelNameWithoutExtension = modelName.substring(0, modelName.lastIndexOf('.'));
		IFile modelTimemodelFile = modelProject.getFile("gemoc-gen"+ modelNameWithoutExtension+".timemodel");
		return "platform:/resource"+modelTimemodelFile.getFullPath().toOSString();
	}

}
