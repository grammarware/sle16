package org.gemoc.execution.concurrent.ccsljavaxdsml.utils.ccsl;

import java.io.IOException;
import java.util.HashMap;

import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.m2m.qvt.oml.BasicModelExtent;
import org.eclipse.m2m.qvt.oml.ExecutionContextImpl;
import org.eclipse.m2m.qvt.oml.ExecutionDiagnostic;
import org.eclipse.m2m.qvt.oml.ModelExtent;
import org.eclipse.m2m.qvt.oml.TransformationExecutor;
import org.eclipse.xtext.resource.IResourceServiceProvider;
import org.eclipse.xtext.resource.SaveOptions;
import org.eclipse.xtext.resource.SaveOptions.Builder;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.gemoc.execution.concurrent.ccsljavaxdsml.utils.Activator;

import com.google.inject.Injector;

import fr.inria.aoste.timesquare.ccslkernel.model.TimeModel.ImportStatement;
import fr.inria.aoste.timesquare.ccslkernel.model.TimeModel.CCSLModel.ClockConstraintSystem;
import fr.inria.aoste.timesquare.ccslkernel.model.TimeModel.CCSLModel.impl.ClockConstraintSystemImpl;
import fr.inria.aoste.timesquare.ccslkernel.parser.xtext.ExtendedCCSLStandaloneSetup;
import fr.inria.diverse.commons.eclipse.messagingsystem.api.MessagingSystemManager;
import fr.inria.diverse.commons.messagingsystem.api.MessagingSystem;

public class QvtoTransformationPerformer {

	private XtextResourceSet aModelResourceSet=null;
	private XtextResourceSet outputResourceSet=null;

	protected static MessagingSystem messagingSystem = null;

	public static MessagingSystem getMessagingSystem() {
		if (messagingSystem == null) {
			MessagingSystemManager msm = new MessagingSystemManager();
			// use the baseMessageGroup of the engine in order to share consoles instead of duplicating them
			messagingSystem = msm.createBestPlatformMessagingSystem(org.gemoc.executionframework.engine.Activator.PLUGIN_ID, "Modeling Workbench Console");
		}
		return messagingSystem;
	}

	
	
	/**
	 * just initialization stuff from xtext for an ecl resource
	 */
	private void initializeXtext(){
		ExtendedCCSLStandaloneSetup ess= new ExtendedCCSLStandaloneSetup();
		Injector injector = ess.createInjector();
		// instanciate a resource set
		aModelResourceSet = injector.getInstance(XtextResourceSet.class);
		outputResourceSet = injector.getInstance(XtextResourceSet.class);
		//set.setClasspathURIContext(getClasspathURIContext());
		aModelResourceSet.addLoadOption(XtextResource.OPTION_RESOLVE_ALL, Boolean.TRUE);
		ExtendedCCSLStandaloneSetup.doSetup();
	}
	
	public void run(ResourceSet resourceSet, String transformationPath, String modelPath, String outputMoCPath, String outputFeedbackPath) 
	{		
		//initialize console
		getMessagingSystem();
		
	    URI transformationURI = URI.createURI(transformationPath, true);
	    URI modelURI = URI.createURI(modelPath, true);
		IResourceServiceProvider.Registry.INSTANCE.getResourceServiceProvider(modelURI);
		initializeXtext();
	    //model resource
		//Resource modelResource = aModelResourceSet.getResource(modelURI, true);
		Resource modelResource = resourceSet.getResource(modelURI, true);

	    //transformationURI is the URI of qvto file
		TransformationExecutor executor = new TransformationExecutor(transformationURI);
		//inResource have the vaule of inModel
		ModelExtent input = new BasicModelExtent(modelResource.getContents());
		ModelExtent outputMoC = new BasicModelExtent();
		ModelExtent outputFeedback = new BasicModelExtent();

		ExecutionContextImpl context = new ExecutionContextImpl();

		ExecutionDiagnostic diagnostic = executor.execute(context, input, outputMoC, outputFeedback);
		System.out.println(diagnostic);
		if(diagnostic.getSeverity() != ExecutionDiagnostic.OK){
			messagingSystem.error(diagnostic.getMessage(), Activator.PLUGIN_ID);
			throw new ExceptionInInitializerError("the QVTo file compiled from the ECL contains syntactic errors. Please double check your ECL:"+diagnostic.getMessage());
		}
		//output resource saving
	    
	    URI outputMoCUri = URI.createURI(outputMoCPath, true);
	    URI outputFeedbackUri = URI.createURI(outputFeedbackPath, true);
	    Resource outputMoCResource = null;
	    Resource outputFeedbackResource = null;
	    try
	    {
	    	outputMoCResource = outputResourceSet.createResource(outputMoCUri);
	    	outputFeedbackResource = outputResourceSet.createResource(outputFeedbackUri);
		    outputMoCResource.getContents().addAll(outputMoC.getContents());
		    outputFeedbackResource.getContents().addAll(outputFeedback.getContents());
		    hackImportStatements(modelURI, outputMoC);		    
			outputMoCResource.save(null);
			outputFeedbackResource.save(null);
	    }
	    catch (Exception e)
	    {
	    	e.printStackTrace();
	    };
	}

	private void hackImportStatements(URI modelURI, ModelExtent output) {
		if (output.getContents().size() > 0
	    	&& output.getContents().get(0) instanceof ClockConstraintSystem) {
	    	ClockConstraintSystem system = (ClockConstraintSystem)output.getContents().get(0);
	    	for(ImportStatement i : system.getImports()) {
	    		if (!i.getImportURI().equals(modelURI.toString())) {
	    			String pluginBasedURI = i.getImportURI().replace("platform:/resource", "platform:/plugin");
	    			i.setImportURI(pluginBasedURI);
	    		}
	    	}
	    }
	}
	
}
