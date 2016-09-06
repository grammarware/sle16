package org.gemoc.execution.concurrent.ccsljavaxdsml.api.core;

import java.util.Collection;

import org.gemoc.execution.concurrent.ccsljavaxdsml.api.dsa.executors.ICodeExecutor;
import org.gemoc.execution.concurrent.ccsljavaxdsml.api.dse.IMSEStateController;
import org.gemoc.xdsmlframework.api.core.IExecutionPlatform;

public interface IConcurrentExecutionPlatform extends IExecutionPlatform
{

	/**
	 * @return The code executor to use for the model execution.
	 */
	ICodeExecutor getCodeExecutor();
	
	/**
	 * return this if this is an IConcurrentExecutionPlatform, null otherwise 
	 * @return
	 */
	IConcurrentExecutionPlatform asConcurrentExecutionPlatform();
	
	Collection<IMSEStateController> getMSEStateControllers();

}
