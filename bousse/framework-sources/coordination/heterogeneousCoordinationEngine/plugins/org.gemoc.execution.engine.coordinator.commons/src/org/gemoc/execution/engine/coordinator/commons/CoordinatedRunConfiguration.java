package org.gemoc.execution.engine.coordinator.commons;

import java.util.ArrayList;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.emf.common.util.URI;
import org.gemoc.execution.concurrent.ccsljavaengine.ui.launcher.ConcurrentRunConfiguration;
import org.gemoc.executionframework.engine.ui.commons.RunConfiguration;

import fr.obeo.dsl.debug.ide.launch.AbstractDSLLaunchConfigurationDelegate;

public class CoordinatedRunConfiguration extends ConcurrentRunConfiguration
{
	
	// main launch parameters
	public static final String LAUNCH_BCOOL_PATH = "GEMOC_LAUNCH_MODEL_PATH";
		
	private URI _bcoolURI;
	private String _bflowPath;
	private URI _bflowURI;
	
	private String _bcoolFileName;
	private ArrayList<URI> _configurationURIs = new ArrayList<URI>();
	private int nb_config = 0;

	
	public String getBcoolFileName() 
	{
		return _bcoolFileName;
	}
	public URI getBcoolModelURI() 
	{
		return _bcoolURI;
	}
	
	public String getBFloWModelPath (){
		return _bflowPath;
	}
	
	public URI getBFloWModelURI (){
		return _bflowURI;
	}
	
	public ArrayList<URI> getConfigurationURIs() 
	{
		return _configurationURIs;
	}
	
	public CoordinatedRunConfiguration(ILaunchConfiguration launchConfiguration) throws CoreException
	{
		super(launchConfiguration);
		extractInformation();
	}

	protected void extractInformation() throws CoreException 
	{
		super.extractInformation();
		_configurationURIs = new ArrayList<URI>();
		_bcoolURI = URI.createPlatformResourceURI(
				getAttribute(AbstractDSLLaunchConfigurationDelegate.RESOURCE_URI, ""),
				true);
		_bflowURI = URI.createPlatformResourceURI(
				getAttribute("bflow", ""),
				true);
		_bflowPath = getAttribute("bflow", "");
		nb_config = getAttribute("nb_logicalSteps", 0);
		for(int i=0; i < nb_config; i++){
		_configurationURIs.add(URI.createPlatformResourceURI(
				getAttribute("Configuration"+i, "")
				,true));
		}
	}

	protected String getAttribute(String attributeName, String defaultValue) throws CoreException
	{
		return _launchConfiguration.getAttribute(attributeName, defaultValue);
	}

	protected Integer getAttribute(String attributeName, Integer defaultValue) throws CoreException
	{
		return _launchConfiguration.getAttribute(attributeName, defaultValue);
	}

	protected Boolean getAttribute(String attributeName, Boolean defaultValue) throws CoreException
	{
		return _launchConfiguration.getAttribute(attributeName, defaultValue);
	}

	
	



	@Override
	public String getLanguageName() {
		return "BCOoL";
	}


	@Override
	public URI getExecutedModelURI() {
		return getBcoolModelURI();
	}


	@Override
	public URI getExecutedModelAsMelangeURI() {
		return null;
	}


	@Override
	public String getMelangeQuery() {
		return null;
	}


	@Override
	public URI getAnimatorURI() {
		return null;
	}


	@Override
	public int getAnimationDelay() {
		return 0;
	}


	@Override
	public int getDeadlockDetectionDepth() {
		return -1;
	}


//	@Override
//	public Collection<EngineAddonSpecificationExtension> getEngineAddonExtensions() {
//		// TODO Auto-generated method stub
//		return null;
//	}





	@Override
	public String getExecutionEntryPoint() {
		return null;
	}



}
