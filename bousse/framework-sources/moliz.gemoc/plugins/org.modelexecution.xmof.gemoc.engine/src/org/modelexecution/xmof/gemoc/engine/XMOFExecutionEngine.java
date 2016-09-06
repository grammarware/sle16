package org.modelexecution.xmof.gemoc.engine;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.uml2.common.util.CacheAdapter;
import org.gemoc.executionframework.engine.core.AbstractSequentialExecutionEngine;
import org.gemoc.xdsmlframework.api.core.ExecutionMode;
import org.gemoc.xdsmlframework.api.core.IExecutionContext;
import org.modelexecution.fumldebug.core.ExecutionEventListener;
import org.modelexecution.fumldebug.core.NodeSelectionStrategy;
import org.modelexecution.fumldebug.core.event.ActivityEntryEvent;
import org.modelexecution.fumldebug.core.event.ActivityEvent;
import org.modelexecution.fumldebug.core.event.ActivityExitEvent;
import org.modelexecution.fumldebug.core.event.ActivityNodeEntryEvent;
import org.modelexecution.fumldebug.core.event.ActivityNodeEvent;
import org.modelexecution.fumldebug.core.event.ActivityNodeExitEvent;
import org.modelexecution.fumldebug.core.event.Event;
import org.modelexecution.fumldebug.core.trace.tracemodel.ActivityExecution;
import org.modelexecution.fumldebug.core.trace.tracemodel.ValueSnapshot;
import org.modelexecution.xmof.Syntax.Activities.IntermediateActivities.Activity;
import org.modelexecution.xmof.Syntax.Activities.IntermediateActivities.ActivityNode;
import org.modelexecution.xmof.Syntax.Classes.Kernel.BehavioredEOperation;
import org.modelexecution.xmof.configuration.ConfigurationObjectMap;
import org.modelexecution.xmof.gemoc.engine.internal.GemocModelSynchronizer;
import org.modelexecution.xmof.gemoc.engine.internal.GemocXMOFVirtualMachine;
import org.modelexecution.xmof.gemoc.engine.internal.SequentialNodeSelectionStrategy;
import org.modelexecution.xmof.gemoc.engine.internal.XMOFBasedModelLoader;
import org.modelexecution.xmof.gemoc.engine.ui.commons.IXMOFRunConfiguration;
import org.modelexecution.xmof.vm.IXMOFVirtualMachineListener;
import org.modelexecution.xmof.vm.XMOFBasedModel;
import org.modelexecution.xmof.vm.XMOFBasedModelSynchronizer;
import org.modelexecution.xmof.vm.XMOFInstanceMap;
import org.modelexecution.xmof.vm.XMOFVirtualMachine;
import org.modelexecution.xmof.vm.XMOFVirtualMachineEvent;

import fUML.Semantics.Classes.Kernel.Object_;

public class XMOFExecutionEngine extends AbstractSequentialExecutionEngine
		implements ExecutionEventListener, IXMOFVirtualMachineListener {

	private static String STEP_ANNOTATION_SOURCE = "http://www.modelexecution.org/xmof";
	private static String STEP_ANNOTATION_KEY = "Step";

	private ConfigurationObjectMap configurationMap;
	private XMOFVirtualMachine vm;
	private XMOFBasedModelLoader loader;

	private boolean suspendForNodes = false;
	private boolean ignoreSteps = false;

	public XMOFExecutionEngine() {
		super();
	}

	@Override
	public String engineKindName() {
		return "XMOF Engine";
	}

	@Override
	protected void prepareEntryPoint(IExecutionContext executionContext) {
		suspendForNodes = ((IXMOFRunConfiguration) executionContext.getRunConfiguration()).getNodewiseStepping();
		ignoreSteps = ((IXMOFRunConfiguration) executionContext.getRunConfiguration()).getIgnoreSteps()
				|| suspendForNodes;

		loader = new XMOFBasedModelLoader(executionContext);
		XMOFBasedModel model = loader.loadXMOFBasedModel();

		// If we are in basic run mode, we replace the static objects of the
		// context model by dynamic configuration objects.
		// This works because we don't need an aird in this case.
		// Thereby, execution addons (e.g. trace addon) are correctly notified.
		if (executionContext.getExecutionMode().equals(ExecutionMode.Run)) {
			TransactionalEditingDomain editingDomain = TransactionUtil
					.getEditingDomain(executionContext.getResourceModel());
			Command cmd = new RecordingCommand(editingDomain) {
				@Override
				protected void doExecute() {
					executionContext.getResourceModel().getContents().clear();
					executionContext.getResourceModel().getContents().addAll(model.getModelResource().getContents());
				}
			};
			editingDomain.getCommandStack().execute(cmd);
		}

		configurationMap = loader.getConfigurationMap();

		vm = setupVirtualMachine(model);
	}

	private XMOFVirtualMachine setupVirtualMachine(XMOFBasedModel model) {
		XMOFVirtualMachine vm = new GemocXMOFVirtualMachine(model);

		XMOFBasedModelSynchronizer modelSynchronizer = createModelSynchronizer(vm.getInstanceMap(), model);
		vm.setSynchronizeModel(modelSynchronizer);

		NodeSelectionStrategy nodeSelectionStrategy = new SequentialNodeSelectionStrategy();
		vm.getRawExecutionContext().setNextNodeStrategy(nodeSelectionStrategy);

		vm.addRawExecutionEventListener(this);
		vm.addVirtualMachineListener(this);

		return vm;
	}

	private XMOFBasedModelSynchronizer createModelSynchronizer(XMOFInstanceMap instanceMap, XMOFBasedModel model) {
		XMOFBasedModelSynchronizer modelSynchronizer = new GemocModelSynchronizer(instanceMap,
				model.getEditingDomain());
		modelSynchronizer.setModelResource(model.getModelResource());
		return modelSynchronizer;
	}

	@Override
	protected void prepareInitializeModel(IExecutionContext executionContext) {

	}

	@Override
	public void notify(Event event) {
		if (event instanceof ActivityEvent) {
			processActivityEvent((ActivityEvent) event);
		} else if (event instanceof ActivityNodeEvent && suspendForNodes) {
			processActivityNodeEvent((ActivityNodeEvent) event);
		}
	}

	@Override
	public void notify(XMOFVirtualMachineEvent event) {
	}

	private void processActivityEvent(ActivityEvent event) {
		if (ignoreSteps || isStep(event.getActivity())) {
			if (event instanceof ActivityEntryEvent) {
				processActivityEntry((ActivityEntryEvent) event);
			} else if (event instanceof ActivityExitEvent) {
				processActivityExit((ActivityExitEvent) event);
			}
		}
	}

	private void processActivityNodeEvent(ActivityNodeEvent event) {
		if (event instanceof ActivityNodeEntryEvent) {
			processActivityNodeEntry((ActivityNodeEntryEvent) event);
		} else if (event instanceof ActivityNodeExitEvent) {
			processActivityNodeExit((ActivityNodeExitEvent) event);
		}
	}

	private boolean isStep(fUML.Syntax.Activities.IntermediateActivities.Activity activityFUML) {
		boolean isStep = false;
		Activity activity = (Activity) vm.getxMOFConversionResult().getInputObject(activityFUML);
		BehavioredEOperation operation = activity.getSpecification();
		EAnnotation stepAnnotation = operation.getEAnnotation(STEP_ANNOTATION_SOURCE);
		if (stepAnnotation != null) {
			isStep = stepAnnotation.getDetails().containsKey(STEP_ANNOTATION_KEY);
		}
		return isStep;
	}

	private void processActivityEntry(ActivityEntryEvent event) {
		ActivityExecution activityExecution = vm.getExecutionTrace()
				.getActivityExecutionByID(event.getActivityExecutionID());
		Activity activity = (Activity) vm.getxMOFConversionResult().getInputObject(event.getActivity());
		EObject caller = getActivityContextObject(activityExecution);
		String className = caller.eClass().getName();
		String methodName = activity.getName();
		beforeExecutionStep(caller, className, methodName);
	}

	private void processActivityNodeEntry(ActivityNodeEntryEvent event) {
		ActivityExecution activityExecution = vm.getExecutionTrace()
				.getActivityExecutionByID(event.getActivityExecutionID());
		ActivityNode activityNode = (ActivityNode) vm.getxMOFConversionResult().getInputObject(event.getNode());
		EObject caller = getActivityContextObject(activityExecution);
		String className = caller.eClass().getName();
		String methodName = "";
		if (activityNode.getName() != null) {
			methodName = activityNode.getName() + " :" + activityNode.eClass().getName();
		} else {
			methodName = ":" + activityNode.eClass().getName();
		}
		beforeExecutionStep(caller, className, methodName);
	}

	private EObject getActivityContextObject(ActivityExecution activityExecution) {
		EObject activityContextObject = null;
		ValueSnapshot context = activityExecution.getContextValueSnapshot();
		if (context != null) {
			fUML.Semantics.Classes.Kernel.Value contextRuntimeValue = context.getRuntimeValue();
			if (contextRuntimeValue instanceof Object_) {
				activityContextObject = vm.getInstanceMap().getEObject((Object_) contextRuntimeValue);
			}
		}
		return activityContextObject;
	}

	private void processActivityExit(ActivityExitEvent event) {
		afterExecutionStep();
	}

	private void processActivityNodeExit(ActivityNodeExitEvent event) {
		afterExecutionStep();
	}

	@Override
	protected void executeEntryPoint() {
		vm.run();
	}

	@Override
	protected void initializeModel() {
		// there is nothing to do for xMOF
	}

	public ConfigurationObjectMap getConfigurationMap() {
		return configurationMap;
	}

	public XMOFBasedModel getXMOFBasedModel() {
		return vm.getModel();
	}

	public XMOFVirtualMachine getRawVirtualMachine() {
		return vm;
	}

	public void cleanUp() {
		for (EObject o : this.configurationMap.getConfigurationObjects()) {
			o.eAdapters().clear();
		}
		for (EObject o : this.configurationMap.getOriginalObjects()) {
			o.eAdapters().clear();
		}
		if (CacheAdapter.getInstance() != null) {
			if (CacheAdapter.getInstance().getTarget() != null) {
				CacheAdapter.getInstance().getTarget().eAdapters().clear();
				CacheAdapter.getInstance().setTarget(null);
			}
			CacheAdapter.getInstance().clear();
		}
		configurationMap = null;
	}
	
	@Override
	public void finishDispose() {
		this.configurationMap = null;
		this.vm = null;
	}

	public XMOFBasedModelLoader getModelLoader() {
		return loader;
	}
}