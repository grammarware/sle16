package org.gemoc.execution.concurrent.ccsljavaengine.ui;

import org.eclipse.core.runtime.CoreException;
import org.gemoc.execution.concurrent.ccsljavaxdsml.api.core.ILogicalStepDecider;
import org.gemoc.execution.concurrent.ccsljavaxdsml.api.extensions.deciders.DeciderSpecificationExtension;
import org.gemoc.execution.concurrent.ccsljavaxdsml.api.extensions.deciders.DeciderSpecificationExtensionPoint;
import org.gemoc.xdsmlframework.api.core.ExecutionMode;

public class LogicalStepDeciderFactory {


	public static final String DECIDER_SOLVER = "Solver decider";
	public static ILogicalStepDecider createDecider(String deciderKind, ExecutionMode executionMode) throws CoreException 
	{
		ILogicalStepDecider decider = null;
		if (executionMode.equals(ExecutionMode.Run))
		{
			DeciderSpecificationExtension extension = DeciderSpecificationExtensionPoint.findDefinition(DECIDER_SOLVER);
			decider = extension.instanciateDecider();
		}
		else 
		{
			DeciderSpecificationExtension extension = DeciderSpecificationExtensionPoint.findDefinition(deciderKind);
			decider = extension.instanciateDecider();
		}		
		return decider;
	}
	
}
