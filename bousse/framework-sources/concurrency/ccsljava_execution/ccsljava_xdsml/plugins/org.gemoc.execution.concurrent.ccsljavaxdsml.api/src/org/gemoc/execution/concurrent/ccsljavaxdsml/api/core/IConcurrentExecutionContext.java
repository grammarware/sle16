package org.gemoc.execution.concurrent.ccsljavaxdsml.api.core;

import org.gemoc.execution.concurrent.ccsljavaxdsml.api.extensions.languages.ConcurrentLanguageDefinitionExtension;
import org.gemoc.xdsmlframework.api.core.IExecutionContext;

import fr.inria.aoste.timesquare.ecl.feedback.feedback.ActionModel;

public interface IConcurrentExecutionContext extends IExecutionContext
{
	ConcurrentLanguageDefinitionExtension getConcurrentLanguageDefinitionExtension();
	IConcurrentExecutionPlatform getConcurrentExecutionPlatform();
	ILogicalStepDecider getLogicalStepDecider();

	ActionModel getFeedbackModel();
	 
}
