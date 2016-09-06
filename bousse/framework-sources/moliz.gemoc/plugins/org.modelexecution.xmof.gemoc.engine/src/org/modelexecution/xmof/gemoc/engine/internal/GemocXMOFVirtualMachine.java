package org.modelexecution.xmof.gemoc.engine.internal;

import java.util.Collection;

import org.modelexecution.fumldebug.core.event.ActivityEntryEvent;
import org.modelexecution.fumldebug.core.event.Event;
import org.modelexecution.xmof.vm.XMOFBasedModel;
import org.modelexecution.xmof.vm.XMOFVirtualMachine;
import org.modelexecution.xmof.vm.XMOFVirtualMachineEvent;

public class GemocXMOFVirtualMachine extends XMOFVirtualMachine {

	public GemocXMOFVirtualMachine(XMOFBasedModel modelToBeExecuted) {
		super(modelToBeExecuted);
	}

	@Override
	protected Collection<XMOFVirtualMachineEvent> processRawEvent(Event event) {
		Collection<XMOFVirtualMachineEvent> eventsToDeliver = super
				.processRawEvent(event);
		if (event instanceof ActivityEntryEvent) {
			ActivityEntryEvent activityEntryEvent = (ActivityEntryEvent) event;
			int activityExecutionID = activityEntryEvent.getActivityExecutionID();
			setActivityExecutionID(activityExecutionID);
		}
		return eventsToDeliver;
	}

	@Override
	protected void resumeExecution() {
		getRawExecutionContext().nextStep(getActivityExecutionID());
	}

}
