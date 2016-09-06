package org.gemoc.execution.concurrent.ccsljavaengine.commons;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.gemoc.execution.concurrent.ccsljavaengine.ui.LogicalStepDeciderFactory;
import org.gemoc.execution.concurrent.ccsljavaxdsml.api.core.IConcurrentExecutionContext;
import org.gemoc.execution.concurrent.ccsljavaxdsml.api.core.IConcurrentExecutionPlatform;
import org.gemoc.execution.concurrent.ccsljavaxdsml.api.core.IConcurrentRunConfiguration;
import org.gemoc.execution.concurrent.ccsljavaxdsml.api.core.ILogicalStepDecider;
import org.gemoc.execution.concurrent.ccsljavaxdsml.api.extensions.languages.ConcurrentLanguageDefinitionExtension;
import org.gemoc.execution.concurrent.ccsljavaxdsml.api.extensions.languages.ConcurrentLanguageDefinitionExtensionPoint;
import org.gemoc.executionframework.engine.commons.EngineContextException;
import org.gemoc.executionframework.engine.commons.ModelExecutionContext;
import org.gemoc.xdsmlframework.api.core.ExecutionMode;
import org.gemoc.xdsmlframework.api.core.IExecutionPlatform;
import org.gemoc.xdsmlframework.api.extensions.languages.LanguageDefinitionExtension;

import fr.inria.aoste.timesquare.ecl.feedback.feedback.ActionModel;
import fr.inria.diverse.trace.commons.model.trace.MSEModel;

public class ConcurrentModelExecutionContext extends ModelExecutionContext implements IConcurrentExecutionContext
{

	
	public ConcurrentModelExecutionContext(IConcurrentRunConfiguration runConfiguration, ExecutionMode executionMode)
			throws EngineContextException
	{
		super(runConfiguration, executionMode);
		try
		{
			_logicalStepDecider = LogicalStepDeciderFactory.createDecider(runConfiguration.getDeciderName(),
					executionMode);
			
		} catch (CoreException e)
		{
			EngineContextException exception = new EngineContextException(
					"Cannot initialize the execution context, see inner exception.", e);
			throw exception;
		}
	}

	
	
	protected IExecutionPlatform createExecutionPlatform() throws CoreException{
		if(_languageDefinition instanceof  ConcurrentLanguageDefinitionExtension ){
			return new DefaultConcurrentExecutionPlatform((ConcurrentLanguageDefinitionExtension)_languageDefinition, _runConfiguration);
		} else {
			return super.createExecutionPlatform();
		}
	}
	
	@Override
	protected LanguageDefinitionExtension getLanguageDefinition(String languageName) throws EngineContextException
	{
		ConcurrentLanguageDefinitionExtension languageDefinition = ConcurrentLanguageDefinitionExtensionPoint
				.findDefinition(_runConfiguration.getLanguageName());
		if (languageDefinition == null)
		{
			String message = "Cannot find concurrent xdsml definition for the language " + _runConfiguration.getLanguageName()
					+ ", please verify that is is correctly deployed.";
			EngineContextException exception = new EngineContextException(message);
			throw exception;
		}
		return languageDefinition;
	}

	private void setUpMSEModel()
	{
		URI msemodelPlatformURI = URI.createPlatformResourceURI(getWorkspace().getMSEModelPath().removeFileExtension().addFileExtension("msemodel").toString(),
				true);
		try
		{
			Resource resource = this.getResourceModel().getResourceSet().getResource(msemodelPlatformURI, true);
			_mseModel = (MSEModel) resource.getContents().get(0);
		} catch (Exception e)
		{
			// file will be created later
		}
	}
	private void setUpFeedbackModel()
	{
		URI feedbackPlatformURI = URI.createPlatformResourceURI(getWorkspace().getMSEModelPath().removeFileExtension().addFileExtension("feedback").toString(),
				true);
		try
		{
			Resource resource = this.getResourceModel().getResourceSet().getResource(feedbackPlatformURI, true);
			_feedbackModel = (ActionModel) resource.getContents().get(0);
		} catch (Exception e)
		{
			// file will be created later
		}
	}
	
	@Override
	public void dispose()
	{
		super.dispose();
		_logicalStepDecider.dispose();
	}

	
	protected ActionModel _feedbackModel;

	@Override
	public ActionModel getFeedbackModel()
	{
		if(_feedbackModel == null){
			setUpFeedbackModel();
		}
		return _feedbackModel;
	}
	

	protected ILogicalStepDecider _logicalStepDecider;

	@Override
	public ILogicalStepDecider getLogicalStepDecider() {
		return _logicalStepDecider;
	}

	@Override
	public IConcurrentExecutionPlatform getConcurrentExecutionPlatform() {
		if(getExecutionPlatform() instanceof IConcurrentExecutionPlatform) return (IConcurrentExecutionPlatform) getExecutionPlatform();
		else return null;
	}

	@Override
	public ConcurrentLanguageDefinitionExtension getConcurrentLanguageDefinitionExtension() {
		if(getLanguageDefinitionExtension() instanceof ConcurrentLanguageDefinitionExtension) return (ConcurrentLanguageDefinitionExtension) getLanguageDefinitionExtension();
		return null;
	}


	protected MSEModel _mseModel;
	
	@Override
	public MSEModel getMSEModel() {
		if(_mseModel == null){
			setUpMSEModel();
		}
		return _mseModel;
	}

	




}
