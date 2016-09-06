package org.modelexecution.xmof.gemoc.engine.internal;

import java.util.List;

import org.modelexecution.fumldebug.core.ActivityExecutionStatus;
import org.modelexecution.fumldebug.core.ActivityNodeChoice;
import org.modelexecution.fumldebug.core.ExecutionStatus;
import org.modelexecution.fumldebug.core.NodeSelectionStrategy;

import fUML.Syntax.Activities.IntermediateActivities.ActivityNode;

public class SequentialNodeSelectionStrategy implements NodeSelectionStrategy {

	@Override
	public ActivityNodeChoice chooseNextNode(int executionID,
			ExecutionStatus executionStatus) {
		ActivityNodeChoice nextNode = null;

		// look for enabled node in current execution
		nextNode = chooseNodeInActivity(executionID, executionStatus);

		// look for enabled node in called executions
		if (nextNode == null) {
			nextNode = chooseNodeInCalleeHierarchy(executionID, executionStatus);
		}

		// look for enabled node in caller execution
		if (nextNode == null) {
			nextNode = chooseNodeInCallerHierarchy(executionID, executionStatus);
		}

		return nextNode;
	}

	private ActivityNodeChoice chooseNodeInActivity(int executionID,
			ExecutionStatus executionStatus) {
		ActivityNodeChoice nextNode = null;
		List<ActivityNode> enabledNodes = null;

		ActivityExecutionStatus activityExecutionStatus = executionStatus
				.getActivityExecutionStatus(executionID);
		if (activityExecutionStatus != null) {
			enabledNodes = activityExecutionStatus.getEnabledNodes();
		}
		if (enabledNodes != null && enabledNodes.size() > 0) {
			nextNode = new ActivityNodeChoice(
					executionID,
					enabledNodes.get(chooseEnabledNodeIndex(enabledNodes.size())));
		}
		return nextNode;
	}

	protected int chooseEnabledNodeIndex(int numberEnabledNodes) {
		// TODO: this is the only difference to the original strategy
		return (numberEnabledNodes - 1);
	}

	private ActivityNodeChoice chooseNodeInCalleeHierarchy(int executionID,
			ExecutionStatus executionStatus) {
		ActivityNodeChoice nextNode = null;

		ActivityExecutionStatus activityExecutionStatus = executionStatus
				.getActivityExecutionStatus(executionID);
		if (activityExecutionStatus != null) {
			List<ActivityExecutionStatus> directCalleeExecutionStatuses = activityExecutionStatus
					.getDirectCalledExecutionStatuses();
			for (ActivityExecutionStatus directCalleeExecutionStatus : directCalleeExecutionStatuses) {
				int calleeExecutionID = directCalleeExecutionStatus
						.getExecutionID();
				nextNode = chooseNodeInActivity(calleeExecutionID,
						executionStatus);
				if (nextNode != null) {
					break;
				}
				nextNode = chooseNodeInCalleeHierarchy(calleeExecutionID,
						executionStatus);
				if (nextNode != null) {
					break;
				}
			}
		}
		return nextNode;
	}

	private ActivityNodeChoice chooseNodeInCallerHierarchy(int executionID,
			ExecutionStatus executionStatus) {
		ActivityNodeChoice nextNode = null;
		ActivityExecutionStatus activityExecutionStatus = executionStatus
				.getActivityExecutionStatus(executionID);
		if (activityExecutionStatus != null) {
			ActivityExecutionStatus callerExecutionStatus = activityExecutionStatus
					.getDirectCallerExecutionStatus();
			while (callerExecutionStatus != null) {
				int callerExecutionID = callerExecutionStatus.getExecutionID();
				nextNode = chooseNodeInActivity(callerExecutionID,
						executionStatus);
				if (nextNode != null) {
					break;
				}
				callerExecutionStatus = callerExecutionStatus
						.getDirectCallerExecutionStatus();
			}
		}
		return nextNode;
	}

}
