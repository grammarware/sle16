package org.gemoc.bcool.transformation.qvto2ccsl.ui.popup.actions;

import java.awt.Component;
import java.awt.List;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.TreeSelection;
import org.eclipse.m2m.internal.qvt.oml.expressions.ModelParameter;
import org.eclipse.m2m.internal.qvt.oml.expressions.OperationalTransformation;
import org.eclipse.m2m.qvt.oml.BasicModelExtent;
import org.eclipse.m2m.qvt.oml.ExecutionContextImpl;
import org.eclipse.m2m.qvt.oml.ExecutionDiagnostic;
import org.eclipse.m2m.qvt.oml.ModelExtent;
import org.eclipse.m2m.qvt.oml.TransformationExecutor;
import org.eclipse.ui.IActionDelegate;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.xtext.resource.SaveOptions;
import org.eclipse.xtext.resource.SaveOptions.Builder;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceSet;

import com.google.inject.Injector;

import fr.inria.aoste.timesquare.ccslkernel.parser.xtext.ExtendedCCSLStandaloneSetup;


public class Qvto2CCSLTranslator implements IObjectActionDelegate {

	private IFile qvtoFile=null;
	private ArrayList<IFile> modelfiles = new ArrayList<IFile>();
	
	
	/**
	 * Constructor for Action1.
	 */
	public Qvto2CCSLTranslator() {
		super();
	}

	/**
	 * @see IObjectActionDelegate#setActivePart(IAction, IWorkbenchPart)
	 */
	public void setActivePart(IAction action, IWorkbenchPart targetPart) {
	}


	
	/**
	 * @see IActionDelegate#run(IAction)
	 */
	public void run(IAction action) {
		 String qvtUriString0 = qvtoFile.getProject().getName()+"/"+qvtoFile.getProjectRelativePath().toOSString();
		 URI transformationURI = URI.createFileURI(qvtoFile.getLocation().toOSString());
		 
		 int numberOfCharToRemove1 = qvtUriString0.length() - transformationURI.fileExtension().length() -1;
		 String outputPathStringtotal = qvtUriString0.substring(0, numberOfCharToRemove1)+"Coordinated.extendedCCSL";
		 URI outputUritotal = URI.createPlatformResourceURI(outputPathStringtotal,false);
		 
		applyQVTo(transformationURI,modelfiles,outputUritotal);
	}

	public  Resource applyQVTo(URI transformationURI, ArrayList<IFile> inputModelfiles, URI outputmodelURI) {
		XtextResourceSet aModelResourceSet=null;
		XtextResourceSet outputResourceSet=null;
		ExtendedCCSLStandaloneSetup ess= new ExtendedCCSLStandaloneSetup();
		Injector injector = ess.createInjector();
		// instanciate a resource set
		aModelResourceSet = injector.getInstance(XtextResourceSet.class);
		outputResourceSet = injector.getInstance(XtextResourceSet.class);
		//set.setClasspathURIContext(getClasspathURIContext());
		aModelResourceSet.addLoadOption(XtextResource.OPTION_RESOLVE_ALL, Boolean.TRUE);
		ExtendedCCSLStandaloneSetup.doSetup();
	    
	    // output file
	   
	    Resource outputResourcetotal=null;
		try{
	    	outputResourcetotal = outputResourceSet.createResource(outputmodelURI);
	    }catch( Exception e){
	    	System.out.println(e);
	    	outputResourcetotal = outputResourceSet.createResource(outputmodelURI);
	    };
	    
	    //executor and context
	    TransformationExecutor executor = new TransformationExecutor(transformationURI);
	    ModelExtent output = new BasicModelExtent();
	    // trace of the applicacion of the operators
	    HashMap<IFile,Boolean> tracemodels = new HashMap<IFile, Boolean>();
	    // ugly since it should be check the parameters
		for (IFile model1 : inputModelfiles) {
		    //model1 resource
		    String model1UriString = model1.getProject().getName()+"/"+model1.getProjectRelativePath().toOSString();
		    URI model1Uri = URI.createPlatformResourceURI(model1UriString,false);
		    Resource model1Resource = aModelResourceSet.getResource(model1Uri, true);
		   
		    loadResource(model1Resource);
		    ModelExtent input1 = new BasicModelExtent(model1Resource.getContents());
		    
			for (IFile model2 : inputModelfiles)	{
				
				//model2 resource
			    String model2UriString = model2.getProject().getName()+"/"+model2.getProjectRelativePath().toOSString();
			    URI model2Uri = URI.createPlatformResourceURI(model2UriString,false);
			    Resource model2Resource = aModelResourceSet.getResource(model2Uri, true);
				
				if ((model1.getFullPath().toString().compareTo((model2.getFullPath().toString()))) != 0)  
				{
				
				    // models conforming to same language, the transfo is applicable only one time
				    if  ((model2Uri.fileExtension().equals(model1Uri.fileExtension())) && (tracemodels.get(model2) == null)) {  
				  
				    	tracemodels.put(model1,true);
				    	
				    	loadResource(model2Resource);
				    
				    	ModelExtent input2 = new BasicModelExtent(model2Resource.getContents());
				    	ExecutionContextImpl context = createExecutionContext(model1Uri, model2Uri);
				    	ExecutionDiagnostic diagnostic = executor.execute(context, input1, input2 , output);
				    	System.out.println(diagnostic);
				    // models conforming different languages
				    } else if  (!(model2Uri.fileExtension().equals(model1Uri.fileExtension()))) {
				    	
				    	loadResource(model2Resource);
				    	ExecutionContextImpl context = createExecutionContext(model1Uri, model2Uri);
				    	
				    	ModelExtent input2 = new BasicModelExtent(model2Resource.getContents());
				    	ExecutionDiagnostic diagnostic = executor.execute(context, input1, input2 , output);
				    	System.out.println(diagnostic);
				    }
					
				}
			}
		}
		
		outputResourcetotal.getContents().addAll(output.getContents());
		
		try {
			outputResourcetotal.save(null);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return outputResourcetotal;
		
	}

	protected void loadResource(Resource model2Resource) {
		HashMap<Object, Object> saveOptions2 = new HashMap<Object, Object>();
		Builder aBuilder2 = SaveOptions.newBuilder();
		SaveOptions anOption2 = aBuilder2.getOptions();
		anOption2.addTo(saveOptions2);
		try {
			model2Resource.load(saveOptions2);
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}

	protected ExecutionContextImpl createExecutionContext(URI model1Uri,
			URI model2Uri) {
		ExecutionContextImpl context = new ExecutionContextImpl();
		String model1Path = "platform:"+model1Uri.devicePath();
		String model1MoCCPath = model1Path.substring(0,model1Path.lastIndexOf('.'))+"_MoCC.extendedCCSL";
		String model2Path = "platform:"+model2Uri.devicePath();
		String model2MoCCPath = model2Path.substring(0,model2Path.lastIndexOf('.'))+"_MoCC.extendedCCSL";
		context.setConfigProperty("inM1MoCCPath", model1MoCCPath);
		context.setConfigProperty("inM2MoCCPath", model2MoCCPath);
		
		context.setConfigProperty("ApplyAll", "true");
		return context;
	}

	/**path
	 * @see IActionDelegate#selectionChanged(IAction, ISelection)
	 */
	// Here models are loaded from the parameters 
	// I should split it into two groups here
	public void selectionChanged(IAction action, ISelection selection) {
		qvtoFile=null;
		modelfiles.removeAll(modelfiles);
		
		if (selection instanceof StructuredSelection) {
			StructuredSelection ts = (StructuredSelection) selection;
			Iterator it = ts.iterator();
			while(it.hasNext()){
				Object o = it.next();
				if (o instanceof IFile) {
					IFile f = (IFile)o;
					if (f.getFileExtension().compareTo("qvto")==0){
						qvtoFile = (IFile) o;
					}else{
						modelfiles.add((IFile) o);
					}
					
					
				}
			}
			
		}
	}

}
