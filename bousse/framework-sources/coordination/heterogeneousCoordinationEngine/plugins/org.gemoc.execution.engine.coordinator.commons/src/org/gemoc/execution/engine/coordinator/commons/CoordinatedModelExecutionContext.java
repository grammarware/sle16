package org.gemoc.execution.engine.coordinator.commons;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

import javax.management.RuntimeErrorException;

import org.eclipse.ant.core.AntRunner;
import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Status;
import org.eclipse.debug.core.DebugPlugin;
import org.eclipse.debug.core.ILaunch;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.ILaunchManager;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtext.resource.SaveOptions;
import org.eclipse.xtext.resource.SaveOptions.Builder;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.gemoc.bcool.model.bcool.BCoolSpecification;
import org.gemoc.bcool.transformation.bcool2qvto.ui.common.GenerateAll;
import org.gemoc.bflow.BFlowStandaloneSetup;
import org.gemoc.bflow.bFlow.Model;
import org.gemoc.execution.concurrent.ccsljavaengine.ui.LogicalStepDeciderFactory;
import org.gemoc.execution.concurrent.ccsljavaxdsml.api.core.ILogicalStepDecider;
import org.gemoc.executionframework.engine.commons.EngineContextException;
import org.gemoc.executionframework.engine.core.ExecutionWorkspace;
import org.gemoc.xdsmlframework.api.core.EngineStatus.RunStatus;
import org.gemoc.xdsmlframework.api.core.ExecutionMode;
import org.gemoc.xdsmlframework.api.core.IExecutionEngine;
import org.gemoc.xdsmlframework.api.core.IExecutionContext;
import org.gemoc.xdsmlframework.api.core.IExecutionEngine;
import org.gemoc.xdsmlframework.api.core.IExecutionPlatform;
import org.gemoc.xdsmlframework.api.core.IExecutionWorkspace;
import org.gemoc.xdsmlframework.api.extensions.languages.LanguageDefinitionExtension;
import org.osgi.framework.Bundle;

import com.google.inject.Injector;

import fr.inria.aoste.timesquare.ccslkernel.parser.xtext.ExtendedCCSLStandaloneSetup;
import fr.inria.diverse.trace.commons.model.trace.MSEModel;

public class CoordinatedModelExecutionContext implements IExecutionContext
{

	private CoordinatedRunConfiguration _runConfiguration;
	
private XtextResourceSet coordinationModelResourceSet;

private URI coordinationModelURI = null;

private ArrayList<IExecutionEngine> coordinatedEngines = null;

private ExecutionMode _executionMode;

private ILogicalStepDecider _logicalStepDecider;

public void set_logicalStepDecider(ILogicalStepDecider _logicalStepDecider) {
	this._logicalStepDecider = _logicalStepDecider;
}


public ILogicalStepDecider get_logicalStepDecider() {
	return _logicalStepDecider;
}


private HeterogeneousExecutionPlatform _executionPlatform = new HeterogeneousExecutionPlatform();

private Resource _resourceBCOoL;

public ArrayList<IExecutionEngine> getCoordinatedEngines() {
	return coordinatedEngines;
}


	public URI getCoordinationModelURI() {
		return coordinationModelURI;
	}

	public CoordinatedModelExecutionContext(CoordinatedRunConfiguration runConfiguration, ExecutionMode executionMode) throws EngineContextException
	{

		_runConfiguration = runConfiguration;
		_executionMode = executionMode;
		
		try
		{
				_logicalStepDecider = LogicalStepDeciderFactory.createDecider(runConfiguration.getDeciderName(),
						executionMode);
				// Either we use the bcool or the bflow to get the workspace
				if (_runConfiguration.getBFloWModelPath() != "") 
					{ _executionWorkspace = new ExecutionWorkspace(_runConfiguration.getBFloWModelURI()); }
				else
					{_executionWorkspace = new ExecutionWorkspace(_runConfiguration.getExecutedModelURI());}
			
		} catch (CoreException e)
		{
			EngineContextException exception = new EngineContextException(
					"Cannot initialize the execution context, see inner exception.", e);
			throw exception;
		}
		
		IProgressMonitor monitor = new NullProgressMonitor();
		
		// If we use a bflow and the user has not specified the launchers, we get them from the bflow 
		// instead, when a bcool is used, the user HAS TO specify the launchers manually
		if ((runConfiguration.getBFloWModelPath() != "") & (runConfiguration.getConfigurationURIs().size() == 0)) {
			
			// First, I load the bflow model to get the launcher
			BFlowStandaloneSetup  ess= new BFlowStandaloneSetup();
			Injector injector = ess.createInjector();
		    XtextResourceSet aSet = injector.getInstance(XtextResourceSet.class);
			aSet.addLoadOption(XtextResource.OPTION_RESOLVE_ALL, Boolean.FALSE);
			EcoreUtil.resolveAll(aSet);
			BFlowStandaloneSetup.doSetup();
			
			URI BFloWuri =null;

			// the bflow is got it by a platform resource path
			BFloWuri = runConfiguration.getBFloWModelURI();
			
			// load the corresponding resource
		    Resource bflowResource = aSet.getResource(BFloWuri, true);
		    
		    HashMap<Object, Object> saveOptions = new HashMap<Object, Object>();
		    Builder aBuilder = SaveOptions.newBuilder();
		    SaveOptions anOption = aBuilder.getOptions();
		    anOption.addTo(saveOptions);
		    try {
		    	bflowResource.load(saveOptions);
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
			Model bflowmodel = (Model)bflowResource.getContents().get(0);
			
			// Second, I get the launchers from the bflow
			// and then, I launch them 
			//
			for (int i = 0; i < bflowmodel.getLaunchers().size(); i++){
				URI launchURI = URI.createPlatformResourceURI(bflowmodel.getLaunchers().get(i).getLauncherURI(), true);
				createAndLaunchConfiguration(executionMode, monitor, launchURI);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			
			
		} else {
		
		// launch the configurations and get the associated engine		
		for (int i = 0; i < runConfiguration.getConfigurationURIs().size(); i++){
			URI launchURI = runConfiguration.getConfigurationURIs().get(i);
			createAndLaunchConfiguration(executionMode, monitor, launchURI);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		}
		
//		URI launch2URI = runConfiguration.getConfigurationURI2();
//		ILaunch startedLaunch2 = createAndLaunchConfiguration(executionMode, monitor, launch2URI);
//		
//		try {
//			Thread.sleep(500);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
		
		//		TODO: need a synchro to wait for the engine to start (otherwise it is not yet in the list)
		
		
		
		
		
		return;
	}

	@Override
	public void initializeResourceModel() {
		IProgressMonitor monitor = new NullProgressMonitor();
		/*
		 * warning, here we consider that the only started engines are the one that need to be coordinated...
		 */
		ArrayList<IFile> inputModelfiles = new ArrayList<IFile>();
		ArrayList<IFile> timodelFiles = new ArrayList<IFile>();
		coordinatedEngines  = new ArrayList<IExecutionEngine>();
		Collection<IExecutionEngine> engines = org.gemoc.executionframework.engine.Activator.getDefault().gemocRunningEngineRegistry.getRunningEngines().values();
		for (IExecutionEngine engine : engines)
		{
			if (engine.getRunningStatus() == RunStatus.Stopped){
				continue;
			}
			if (! (engine instanceof IExecutionEngine)){
				throw new RuntimeErrorException(new Error("for now, basic execution engines are not candidates for coordination"), "for now, basic execution engines are not candidates for coordination");
			}
			
			coordinatedEngines.add((IExecutionEngine)engine);
			timodelFiles.add(getTimemodelFile((IExecutionEngine)engine));			
			
			URI modelURI = engine.getExecutionContext().getRunConfiguration().getExecutedModelURI();
			String modelPathName = modelURI.toPlatformString(true);
			String tmpProjectName = modelPathName.substring(1, modelPathName.length());
			String projectName = tmpProjectName.substring(0, tmpProjectName.indexOf('/'));
			IProject modelProject = ResourcesPlugin.getWorkspace().getRoot().getProject(projectName);
			IFile modelFile = modelProject.getFile(modelPathName.replaceFirst("/"+projectName+"/", ""));
			inputModelfiles.add(modelFile);
		}
		
		
		// I get the path of the bflow
		String bflowPath = _runConfiguration.getBFloWModelPath();
		
		// Simple check, if is not "" I follow the procedure by default
		if (bflowPath != "") {
			BFlowStandaloneSetup  ess= new BFlowStandaloneSetup();
			Injector injector = ess.createInjector();
		    XtextResourceSet aSet = injector.getInstance(XtextResourceSet.class);
			aSet.addLoadOption(XtextResource.OPTION_RESOLVE_ALL, Boolean.FALSE);
			EcoreUtil.resolveAll(aSet);
			BFlowStandaloneSetup.doSetup();
			
			URI BFloWuri =null;

			// the bflow is got it by a platform resource path
			BFloWuri = URI.createPlatformResourceURI(bflowPath,false);
			
			// load the corresponding resource
		    Resource bflowResource = aSet.getResource(BFloWuri, true);
		    
		    HashMap<Object, Object> saveOptions = new HashMap<Object, Object>();
		    Builder aBuilder = SaveOptions.newBuilder();
		    SaveOptions anOption = aBuilder.getOptions();
		    anOption.addTo(saveOptions);
		    try {
		    	bflowResource.load(saveOptions);
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
		    // I load the bflow model
			Model bflowmodel = (Model)bflowResource.getContents().get(0);
			
			String bflowtmpProjectName = bflowPath.substring(1, bflowPath.length());
			String bflowprojectName = bflowtmpProjectName.substring(0, bflowtmpProjectName.indexOf('/'));
			
			IWorkspaceRoot myWorkspaceRoot = ResourcesPlugin.getWorkspace().getRoot();
		    IProject myWebProject = myWorkspaceRoot.getProject(bflowprojectName);
		    IPath S = myWebProject.getLocation();
		    String xmlgenerated = S.toString()+ "/gemoc-gen/"+bflowmodel.getName().toString()+".xml";
		    
		    // I invoke the ant 
			AntRunner runner = new AntRunner();
		  	runner.setBuildFileLocation(xmlgenerated);
			runner.setArguments("-Dmessage=Building -verbose");
			try {
				runner.run(monitor);
			} catch (CoreException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				System.out.println("Error when invoking "+xmlgenerated);
			}
			
			String coordinationModelPath = "";
			
			// If the output model is not configured, we create an output timemodel by using the name of the launchers
			if (bflowmodel.getOutputtimemodel() == null ) {
				String launchNames = "";
				for(int i = 0; i < bflowmodel.getLaunchers().size(); i++){
					launchNames += bflowmodel.getLaunchers().get(i).getLauncherURI().substring(bflowmodel.getLaunchers().get(i).getLauncherURI().lastIndexOf("/")+1);
				}
				coordinationModelPath = BFloWuri.toString().substring(0, BFloWuri.toString().indexOf("/", ("platform:/resource/").length()))+"/gemoc-gen/"+launchNames+".timemodel";
				coordinationModelPath = coordinationModelPath.substring(("platform:/resource").length());
			// If the output timemodel is used, the URI must start with "/"
			} else { coordinationModelPath = bflowmodel.getOutputtimemodel(); }
			
			// we load the coordination model
			 coordinationModelURI = URI.createURI(coordinationModelPath);
			_resourceBCOoL = createCoordinationResourceAndSaveIt(coordinationModelURI);
			  
		}else{
			// When we don't use a bflow, we get the information from the launcher
			// create qvto and then apply it
			URI bcoolURI = _runConfiguration.getBcoolModelURI();
			IContainer gemocGenFolder = createQVToFromBCOoL(bcoolURI, monitor);
			URI qvtoURI = getGeneratedQvtoURI(bcoolURI, gemocGenFolder);
			
			String launchNames = "";
			for(int i = 0; i < _runConfiguration.getConfigurationURIs().size(); i++){
				launchNames += _runConfiguration.getConfigurationURIs().get(i).lastSegment();
			}
			String coordinationModelPath = qvtoURI.toString().substring(0, qvtoURI.toString().lastIndexOf('/')+1)
					+launchNames
					+".timemodel"
					;
			
			coordinationModelURI = URI.createURI(coordinationModelPath);
			_resourceBCOoL = createCoordinationResourceAndSaveIt(coordinationModelURI);
			
			
			GemocQvto2CCSLTranslator qvto2ccslTranslator = new GemocQvto2CCSLTranslator(); 
			qvto2ccslTranslator.applyQVTo(qvtoURI, inputModelfiles, coordinationModelURI);
		}
		return;

	}


	protected Resource createCoordinationResourceAndSaveIt(URI ccslModelURI) {
		ExtendedCCSLStandaloneSetup ess= new ExtendedCCSLStandaloneSetup();
		Injector injector = ess.createInjector();
		// instanciate a resource set
		XtextResourceSet ccslResourceSet = injector.getInstance(XtextResourceSet.class);
		//set.setClasspathURIContext(getClasspathURIContext());
		ccslResourceSet.addLoadOption(XtextResource.OPTION_RESOLVE_ALL, Boolean.TRUE);
		ExtendedCCSLStandaloneSetup.doSetup();
		Resource ccslResource=null;
		try{
			// It is only necessary to open the resource. The transfo creates the timemodel from scratch
			ccslResource = ccslResourceSet.createResource(ccslModelURI);
			//ccslResourceSet.get
		//	ccslResource.load(null);
	//		if (ccslResource.getContents().size() == 0){
	//			ccslResource.getContents().add(CCSLModelFactory.eINSTANCE.createClockConstraintSystem());
		//	}
		//	ccslResource.save(null);
	    }catch( Exception e){
	    	System.out.println(e);
	    };
	    return ccslResource;
	}


	protected URI getGeneratedQvtoURI(URI bcoolURI, IContainer gemocGenFolder) {
		ExtendedCCSLStandaloneSetup ess= new ExtendedCCSLStandaloneSetup();
		Injector injector = ess.createInjector();
		// instanciate a resource set
		XtextResourceSet bcoolResourceSet = injector.getInstance(XtextResourceSet.class);
		//set.setClasspathURIContext(getClasspathURIContext());
		bcoolResourceSet.addLoadOption(XtextResource.OPTION_RESOLVE_ALL, Boolean.TRUE);
		ExtendedCCSLStandaloneSetup.doSetup();
		Resource bcoolResource=null;
		try{
			bcoolResource = bcoolResourceSet.createResource(bcoolURI);
			bcoolResource.load(null);
	    }catch( Exception e){
	    	System.out.println(e);
	    };
	    
	    String qvtoFileName = ((BCoolSpecification) bcoolResource.getContents().get(0)).getName()+".qvto";
	    IFile qvtoFile = gemocGenFolder.getFile(new Path(qvtoFileName));
	    URI qvtoURI = URI.createURI(qvtoFile.getFullPath().toString());
		return qvtoURI;
	}


	protected IFile getTimemodelFile(IExecutionEngine engine) {
		URI modelURI = engine.getExecutionContext().getResourceModel().getURI();
		String modelPathName = modelURI.toPlatformString(true);
		String tmpModelProjectName = modelPathName.substring(1, modelPathName.length());
		String modelprojectName = tmpModelProjectName.substring(0, tmpModelProjectName.indexOf('/'));
		IProject modelProject = ResourcesPlugin.getWorkspace().getRoot().getProject(modelprojectName);
		String modelName = modelPathName.substring(modelPathName.lastIndexOf('/'));
		String modelNameWithoutExtension = modelName.substring(0, modelName.lastIndexOf('.'));
		IFile modelTimemodelFile = modelProject.getFile("gemoc-gen"+ modelNameWithoutExtension+".timemodel");
		return modelTimemodelFile;
	}


	private ILaunch createAndLaunchConfiguration(ExecutionMode executionMode,
			IProgressMonitor monitor, URI launchURI) {
		ILaunchManager manager = DebugPlugin.getDefault().getLaunchManager();
		String launchPathName = launchURI.toPlatformString(true);
		String tmpProjectName = launchPathName.substring(1, launchPathName.length());
		String projectName = tmpProjectName.substring(0, tmpProjectName.indexOf('/'));
		IProject launchProject = ResourcesPlugin.getWorkspace().getRoot().getProject(projectName);
		IFile launchFile = launchProject.getFile(launchPathName.replaceFirst("/"+projectName+"/", ""));
		ILaunchConfiguration launch = manager.getLaunchConfiguration(launchFile);
		try {
			ILaunch startedLaunch = launch.launch(ILaunchManager.DEBUG_MODE, monitor);
			return startedLaunch;
		} catch (CoreException e) {
			e.printStackTrace();
		}
		return null;
	}


	private IContainer createQVToFromBCOoL(URI bcoolURI, 	IProgressMonitor monitor) {
		String bcoolPathName = bcoolURI.toPlatformString(true);
		String tmpProjectName = bcoolPathName.substring(1, bcoolPathName.length());
		String projectName = tmpProjectName.substring(0, tmpProjectName.indexOf('/'));
		IProject BcoolProject = ResourcesPlugin.getWorkspace().getRoot().getProject(projectName);
		IFile bcoolFile = BcoolProject.getFile(bcoolPathName.replaceFirst("/"+projectName+"/", ""));
		IContainer target = BcoolProject.getFolder("gemoc-gen");
		
		try {
			GenerateAll generator = new GenerateAll(bcoolURI, target,new ArrayList<String>());
			generator.doGenerate(monitor );
		} catch (IOException e) {
			IStatus status = new Status(IStatus.ERROR, Activator.PLUGIN_ID, e.getMessage(), e);
			org.gemoc.execution.concurrent.ccsljavaengine.Activator.getDefault().getLog().log(status);
		} finally {
			try {
				bcoolFile.getProject().refreshLocal(IResource.DEPTH_INFINITE, monitor);
			} catch (CoreException e) {
				e.printStackTrace();
			}
		}
		return target;
	}

	
	public CoordinatedRunConfiguration getRunConfiguration()
	{
		return _runConfiguration;
	}
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	//copy from ModelExecutioContext
	
	
	private ResourceSet getResourceSet()
	{
		return null;
	}

	

	@Override
	public Resource getResourceModel()
	{
		return _resourceBCOoL;
	}

	@Override
	public void dispose()
	{
		_logicalStepDecider.dispose();
	}

	public ILogicalStepDecider getLogicalStepDecider() {
		return _logicalStepDecider;
	}

	
	private IExecutionWorkspace _executionWorkspace;

	@Override
	public IExecutionWorkspace getWorkspace()
	{
		return _executionWorkspace;
	}

	@Override
	public ExecutionMode getExecutionMode()
	{
		return _executionMode;
	}


	@Override
	public MSEModel getMSEModel()
	{
		return null;
	}

	@Override
	public IExecutionPlatform getExecutionPlatform()
	{
		return _executionPlatform;
	}

	@Override
	public LanguageDefinitionExtension getLanguageDefinitionExtension()
	{
		return null;
	}


	@Override
	public Bundle getMelangeBundle() {
		// TODO Auto-generated method stub
		return null;
	}





}
