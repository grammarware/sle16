package org.gemoc.execution.concurrent.ccsljavaengine.extensions.timesquare.moc.impl;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature.Setting;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.gemoc.execution.concurrent.ccsljavaengine.concurrentmse.FeedbackMSE;
import org.gemoc.execution.concurrent.ccsljavaengine.extensions.timesquare.Activator;
import org.gemoc.execution.concurrent.ccsljavaxdsml.api.core.IConcurrentExecutionContext;
import org.gemoc.execution.concurrent.ccsljavaxdsml.utils.ccsl.QvtoTransformationPerformer;
import org.gemoc.xdsmlframework.api.core.IExecutionContext;
import org.gemoc.xdsmlframework.api.core.IExecutionWorkspace;
import org.osgi.framework.Bundle;

import fr.inria.aoste.timesquare.ccslkernel.explorer.CCSLConstraintState;
import fr.inria.aoste.timesquare.ccslkernel.model.TimeModel.Event;
import fr.inria.aoste.timesquare.ccslkernel.modelunfolding.exception.UnfoldingException;
import fr.inria.aoste.timesquare.ccslkernel.runtime.exceptions.NoBooleanSolution;
import fr.inria.aoste.timesquare.ccslkernel.runtime.exceptions.SimulationException;
import fr.inria.aoste.timesquare.ccslkernel.solver.exception.SolverException;
import fr.inria.aoste.timesquare.ccslkernel.solver.launch.CCSLKernelSolverWrapper;
import fr.inria.aoste.timesquare.ecl.feedback.feedback.ActionModel;
import fr.inria.aoste.timesquare.ecl.feedback.feedback.ModelSpecificEvent;
import fr.inria.aoste.timesquare.simulationpolicy.maxcardpolicy.MaxCardSimulationPolicy;
import fr.inria.aoste.trace.EventOccurrence;
import fr.inria.aoste.trace.ModelElementReference;
import fr.inria.aoste.trace.Reference;
import fr.inria.diverse.trace.commons.model.trace.MSE;
import fr.inria.diverse.trace.commons.model.trace.MSEModel;
import fr.inria.diverse.trace.commons.model.trace.MSEOccurrence;
import fr.inria.diverse.trace.commons.model.trace.ParallelStep;
import fr.inria.diverse.trace.commons.model.trace.SmallStep;
import fr.inria.diverse.trace.commons.model.trace.Step;
import fr.inria.diverse.trace.commons.model.trace.TraceFactory;

/**
 * Implementation of the ISolver dedicated to CCSL.
 * 
 */
public class CcslSolver implements org.gemoc.execution.concurrent.ccsljavaxdsml.api.moc.ISolver {

	protected CCSLKernelSolverWrapper solverWrapper = null;
	protected URI solverInputURI = null;
	protected ArrayList<Step> _lastLogicalSteps = new ArrayList<Step>();
	protected ActionModel _feedbackModel;
	protected MSEModel _MSEModel;
	
	public CcslSolver() 
	{
	}

	public CCSLKernelSolverWrapper getSolverWrapper() {
		return solverWrapper;
	}
	
	@Override
	public ArrayList<ModelElementReference> getAllDiscreteClocks(){
		return solverWrapper.getClockList();
	}
	
	@Override
	public void forbidEventOccurrence(EventOccurrence eventOccurrence) {
		this.solverWrapper.forceClockAbsence(this
				.getModelElementReferenceFromEventOccurrence(eventOccurrence));
	}

	@Override
	public void forceEventOccurrence(EventOccurrence eventOccurrence) {
		this.solverWrapper.forceClockPresence(this
				.getModelElementReferenceFromEventOccurrence(eventOccurrence));

	}

	/**
	 * Returns the ModelElementReference refered by this eventOccurrence (as
	 * originally sent by the CCSL Solver).
	 * 
	 * @param eventOccurrence
	 * @return
	 */
	private ModelElementReference getModelElementReferenceFromEventOccurrence(
			EventOccurrence eventOccurrence) {
		Reference reference = eventOccurrence.getReferedElement();
		if (reference instanceof ModelElementReference) {
			ModelElementReference mer = (ModelElementReference) reference;
			return mer;
			//			ModelElementReference merToForce = this.mappingEventToOriginalMer
//					.get(mer.getElementRef().get(0));
//			return merToForce;
		} else {
			throw new RuntimeException(
					"Refered Element of eventOccurrence should be a ModelElementReference");
		}
	}

	private Step createLogicalStep(fr.inria.aoste.trace.LogicalStep res) 
	{
		ParallelStep<SmallStep> parStep = TraceFactory.eINSTANCE.createParallelStep();
		for (Event e : LogicalStepHelper.getTickedEvents(res))
		{
			MSEOccurrence mseOccurrence = TraceFactory.eINSTANCE.createMSEOccurrence();
			for (MSE mse : _MSEModel.getOwnedMSEs())
			{
				if (mse.getName().replace("MSE_", "").equals(e.getName().replace("evt_", "")))
				{
					mseOccurrence.setMse(mse);
					break;
				}
			}
			
			SmallStep smallStep = TraceFactory.eINSTANCE.createGenericSmallStep();
			smallStep.setMseoccurrence(mseOccurrence);
			parStep.getSubSteps().add(smallStep);
		}
		return parStep;
	}

	@Override
	public String toString() {
		return this.getClass().getName() + "@[modelOfExecutionURI="
				+ this.solverInputURI + "]";
	}

	private void createSolver(IExecutionContext context) 
	{
		this.solverInputURI = URI.createPlatformResourceURI(context.getWorkspace().getMoCPath().toString(), true);
		URI feedbackURI = URI.createPlatformResourceURI(getFeedbackPathFromMSEModelPath(context.getWorkspace().getMSEModelPath()).toString(), true);
		URI mseModelURI = URI.createPlatformResourceURI(context.getWorkspace().getMSEModelPath().toString(), true);
		
		try 
		{
			ResourceSet resourceSet = context.getResourceModel().getResourceSet();		
			
			Resource ccslResource = resourceSet.getResource(this.solverInputURI, true);
			EcoreUtil.resolveAll(resourceSet);
			traceResources(resourceSet);
			traceUnresolvedProxies(resourceSet, solverInputURI);			
			
			this.solverWrapper = new CCSLKernelSolverWrapper();
			this.solverWrapper.getSolver().loadModel(ccslResource);
			this.solverWrapper.getSolver().initSimulation();
			this.solverWrapper.getSolver().setPolicy(new MaxCardSimulationPolicy());

			Resource feedbackResource = resourceSet.getResource(feedbackURI, true);
			_feedbackModel = (ActionModel)feedbackResource.getContents().get(0);
			Resource mseModelResource = resourceSet.getResource(mseModelURI, true);
			_MSEModel = (MSEModel)mseModelResource.getContents().get(0);
			
		} catch (IOException e) {
			String errorMessage = "IOException while instantiating the CcslSolver";
			Activator.getDefault().error(errorMessage);
			Activator.getDefault().error(errorMessage, e);
		} catch (UnfoldingException e) {
			String errorMessage = "UnfoldingException while instantiating the CcslSolver";
			Activator.getDefault().error(errorMessage);
			Activator.getDefault().error(errorMessage, e);
		} catch (SolverException e) {
			String errorMessage = "SolverException while instantiating the CcslSolver";
			Activator.getDefault().error(errorMessage);
			Activator.getDefault().error(errorMessage, e);
		} catch (SimulationException e) {
			String errorMessage = "SimulationException while instantiating the CcslSolver";
			Activator.getDefault().error(errorMessage);
			Activator.getDefault().error(errorMessage, e);
		}
	}

	private void traceUnresolvedProxies(ResourceSet resourceSet,
			URI solverInputURI) {
		Map<EObject, Collection<Setting>>  unresolvedProxies = EcoreUtil.UnresolvedProxyCrossReferencer.find(resourceSet);
		if(unresolvedProxies.size() != 0){
			Activator.getDefault().warn("There are unresolved proxies in "+solverInputURI+ ", the first is "+unresolvedProxies.entrySet().toArray()[0]);
			Activator.getDefault().warn("Please verify that you don't have the modeling nature for your project so that the aird indexed all the resources, (it must not contain resolve warning).");
		}
	}

	private void traceResources(ResourceSet resourceSet) {
		Activator.getDefault().info("Input resources:");
		for(Resource r : resourceSet.getResources()) 
		{
			Activator.getDefault().info(r.getURI().toString());
		}
	}

	@Override
	public List<Step> computeAndGetPossibleLogicalSteps() {
		
		try {
			List<fr.inria.aoste.trace.LogicalStep> intermediateResult = solverWrapper.computeAndGetPossibleLogicalSteps();			
			_lastLogicalSteps.clear();
			for (fr.inria.aoste.trace.LogicalStep lsFromTimesquare : intermediateResult)
			{
				Step lsFromTrace = createLogicalStep(lsFromTimesquare);
				_lastLogicalSteps.add(lsFromTrace);
			}
			return new ArrayList<Step>(_lastLogicalSteps);
		} catch (NoBooleanSolution e) {
			Activator.getDefault().error(e.getMessage(), e);
		} catch (SolverException e) {
			Activator.getDefault().error(e.getMessage(), e);
		} catch (SimulationException e) {
			Activator.getDefault().error(e.getMessage(), e);
		}
		return new ArrayList<Step>();
	}

	@Override
	public List<Step> updatePossibleLogicalSteps() {
		
		try {
			List<fr.inria.aoste.trace.LogicalStep> intermediateResult = solverWrapper.updatePossibleLogicalSteps();			
			_lastLogicalSteps.clear();
			for (fr.inria.aoste.trace.LogicalStep lsFromTimesquare : intermediateResult)
			{
				Step lsFromTrace = createLogicalStep(lsFromTimesquare);
				_lastLogicalSteps.add(lsFromTrace);
			}
			return new ArrayList<Step>(_lastLogicalSteps);
		} catch (NoBooleanSolution e) {
			Activator.getDefault().error(e.getMessage(), e);
		} catch (SolverException e) {
			Activator.getDefault().error(e.getMessage(), e);
		} catch (SimulationException e) {
			Activator.getDefault().error(e.getMessage(), e);
		}
		return new ArrayList<Step>();
	}

	@Override
	public Step proposeLogicalStep() {
		int index = solverWrapper.proposeLogicalStepByIndex();
		Step result = null;
		if (_lastLogicalSteps.size() > index)
		{
			result = _lastLogicalSteps.get(index);			
		}
		return result;
	}

	@Override
	public void applyLogicalStep(Step logicalStep) {
		try {
			int index = _lastLogicalSteps.indexOf(logicalStep);
			solverWrapper.applyLogicalStepByIndex(index);
		} catch (SolverException e) {
			Activator.getDefault().error(e.getMessage(), e);
		} catch (SimulationException e) {
			Activator.getDefault().error(e.getMessage(), e);
		}
	}

	@Override
	public byte[] getState() {
		ByteArrayOutputStream out = new ByteArrayOutputStream();
        ObjectOutputStream objOut;
		try {
			objOut = new ObjectOutputStream(out);
	        objOut.writeObject(solverWrapper.getSolver().getCurrentState());
			return out.toByteArray();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	@Override
	public void setState(byte[] serializableModel) {
		ByteArrayInputStream out = new ByteArrayInputStream(serializableModel);
        ObjectInputStream objOut;
		try {
			objOut = new ObjectInputStream(out);
	        Object o = objOut.readObject();
	        solverWrapper.getSolver().setCurrentState((CCSLConstraintState) o);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Override
	public void revertForceClockEffect() {
		try {
			solverWrapper.revertForceClockEffect();
		} catch (SimulationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	@Override
	public void initialize(IConcurrentExecutionContext context) 
	{
		createSolver(context);
	}
	
	@Override
	public void prepareBeforeModelLoading(IConcurrentExecutionContext context) 
	{
		generateMoC(context);
	}
	private void generateMoC(IConcurrentExecutionContext context) 
	{
		IExecutionWorkspace workspace = context.getWorkspace();
		boolean mustGenerate = false;
		IFile mocFile = ResourcesPlugin.getWorkspace().getRoot().getFile(workspace.getMoCPath());		
		if (!mocFile.exists()
			|| 	ResourcesPlugin.getWorkspace().getRoot().getFile(workspace.getModelPath()).getLocalTimeStamp() > 
				ResourcesPlugin.getWorkspace().getRoot().getFile(workspace.getMoCPath()).getLocalTimeStamp()) 
		{
			mustGenerate = true;
		}
		IFile feedbackFile = ResourcesPlugin.getWorkspace().getRoot().getFile(getFeedbackPathFromMSEModelPath(workspace.getMSEModelPath()));
		if (!feedbackFile.exists()
				|| 	ResourcesPlugin.getWorkspace().getRoot().getFile(workspace.getModelPath()).getLocalTimeStamp() > 
					ResourcesPlugin.getWorkspace().getRoot().getFile(getFeedbackPathFromMSEModelPath(workspace.getMSEModelPath())).getLocalTimeStamp()) 
		{
			mustGenerate = true;
		}
		String transformationPath = context.getConcurrentLanguageDefinitionExtension().getQVTOPath();
		if(transformationPath != null && transformationPath.length()!=0){
			final int bundleNameEnd=transformationPath.indexOf('/', 1);
		    final String bundleName=transformationPath.substring(1,bundleNameEnd);
		    Bundle bundle=Platform.getBundle(bundleName);
		    if (bundle != null) {
			    final URL bundleFileURL=bundle.getEntry(transformationPath.substring(bundleNameEnd));
				try {
					URL fileURL = FileLocator.toFileURL(bundleFileURL);
				    File transformationFile =new File(fileURL.getFile());
				    if (	feedbackFile.exists() &&
				    		transformationFile.lastModified() > 
							ResourcesPlugin.getWorkspace().getRoot().getFile(getFeedbackPathFromMSEModelPath(workspace.getMSEModelPath())).getLocalTimeStamp()) 
					{
						mustGenerate = true;
					}
				} catch (IOException e) {
					Activator.getDefault().error("QVTo file "+transformationPath+" not found, please verify your language specification", e);
				}
		      
		    }
		} else {
			Activator.getDefault().error("QVTo file  not correctly specified in plugin.xml, please verify your language specification");
			mustGenerate = false;
		}
		
		
		if (mustGenerate)
		{
//			Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
//			Map<String, Object> m = reg.getExtensionToFactoryMap();
//			m.put("timemodel", new XMIResourceFactoryImpl());
//
//			ResourceSet ccslResourceSet = new ResourceSetImpl();
//			this.solverInputURI = URI.createPlatformResourceURI(context.getWorkspace().getMoCPath().toString(), true);
//			Resource ccslResource = ccslResourceSet.getResource(this.solverInputURI, true);
//			
//			EcoreUtil.resolveAll(ccslResourceSet);
//			traceResources(ccslResourceSet);
//			traceUnresolvedProxies(ccslResourceSet, solverInputURI);			

			QvtoTransformationPerformer performer = new QvtoTransformationPerformer();
			performer.run(
						new ResourceSetImpl(),
						"platform:/plugin" + transformationPath, 
						context.getRunConfiguration().getExecutedModelAsMelangeURI().toString(), 
						"platform:/resource" + workspace.getMoCPath().toString(),
						"platform:/resource" + getFeedbackPathFromMSEModelPath(workspace.getMSEModelPath()).toString());	
			// TODO must now generate the MSEModel based on this feedbackmodel, that'll wrap the ModelSpecificEvent from Timesquare to MSE for our internal trace
			generateMSEModel(context);
			// TODO must reload the model resourceSet since some element may have changed
		}		
	}

	/**
	 * generates a MSEModel that wraps the FeedbackModel used by Timesquare
	 */
	private void generateMSEModel(final IConcurrentExecutionContext context){
		final URI feedbackURI = URI.createPlatformResourceURI(getFeedbackPathFromMSEModelPath(context.getWorkspace().getMSEModelPath()).toString(), true);
		final URI mseModelURI = URI.createPlatformResourceURI(context.getWorkspace().getMSEModelPath().toString(), true);
		
//		ResourceSet rs = context.getResourceModel().getResourceSet();
//		TransactionalEditingDomain edomain = org.eclipse.emf.transaction.TransactionalEditingDomain.Factory.INSTANCE.getEditingDomain(rs);
//		
//		edomain.getCommandStack().execute(new RecordingCommand(edomain) {
//			public void doExecute() {
		ResourceSet rs = new ResourceSetImpl();
				Resource feedBackRes = rs.getResource(feedbackURI, true);
				Resource mseRes = rs.createResource(mseModelURI);
				mseRes.getContents().clear();
				MSEModel mseModel = TraceFactory.eINSTANCE.createMSEModel();		
				mseRes.getContents().add(mseModel);
				ActionModel feedbackModel = (ActionModel)feedBackRes.getContents().get(0);
				if(feedbackModel!= null){
					for(ModelSpecificEvent feedbackModelSpecificEvent : feedbackModel.getEvents()){
						FeedbackMSE feedbackMSE = org.gemoc.execution.concurrent.ccsljavaengine.concurrentmse.Concurrent_mseFactory.eINSTANCE.createFeedbackMSE();
						feedbackMSE.setFeedbackModelSpecificEvent(feedbackModelSpecificEvent);
						feedbackMSE.setName(feedbackModelSpecificEvent.getName());
						mseModel.getOwnedMSEs().add(feedbackMSE);
					}
				}
				try {
					mseRes.save(null);
				} catch (IOException e) {
					Activator.getDefault().error("Problem creating MSEModel from feedback model", e);
				}
//			}
//		});
		
		
		
		
	}
	
	@Override
	public void dispose() {
		this.solverWrapper=null;
	}
	
	public IPath getFeedbackPathFromMSEModelPath(IPath mseModelPath) 
	{
		IPath msePath= mseModelPath.removeFileExtension().addFileExtension("feedback");
		return msePath;
	}

	
}
