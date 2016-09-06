package org.gemoc.execution.concurrent.ccsljavaengine.commons;

import java.util.Collection;

import org.eclipse.core.runtime.CoreException;
import org.gemoc.execution.concurrent.ccsljavaxdsml.api.core.IConcurrentExecutionPlatform;
import org.gemoc.execution.concurrent.ccsljavaxdsml.api.dsa.executors.ICodeExecutor;
import org.gemoc.execution.concurrent.ccsljavaxdsml.api.dse.IMSEStateController;
import org.gemoc.execution.concurrent.ccsljavaxdsml.api.extensions.languages.ConcurrentLanguageDefinitionExtension;
import org.gemoc.executionframework.engine.commons.DefaultExecutionPlatform;
import org.gemoc.xdsmlframework.api.core.IRunConfiguration;
import org.gemoc.xdsmlframework.api.engine_addon.IEngineAddon;
import org.gemoc.xdsmlframework.api.extensions.engine_addon.EngineAddonSpecificationExtension;

public class DefaultConcurrentExecutionPlatform extends DefaultExecutionPlatform implements IConcurrentExecutionPlatform  {
	
	private ICodeExecutor _codeExecutor;
	//private Collection<IEngineAddon> _addons;
	private Collection<IMSEStateController> _clockControllers;
	
	public DefaultConcurrentExecutionPlatform(ConcurrentLanguageDefinitionExtension _languageDefinition, IRunConfiguration runConfiguration) throws CoreException 
	{
		super(_languageDefinition, runConfiguration);	
//		for (EngineAddonSpecificationExtension extension : runConfiguration.getEngineAddonExtensions())
//		{
//			addEngineAddon(extension.instanciateComponent());
//		}
//		for (IEngineAddon addon : _languageDefinition.instanciateEngineAddons())
//		{
//			addEngineAddon(addon);			
//		}
		_codeExecutor = _languageDefinition.instanciateCodeExecutor();
		_clockControllers = _languageDefinition.instanciateMSEStateControllers();
		
	}


	@Override
	public ICodeExecutor getCodeExecutor() 
	{
		return _codeExecutor;
	}

//	@Override
//	public Iterable<IEngineAddon> getEngineAddons() 
//	{
//		synchronized(_addonLock)
//		{
//			return Collections.unmodifiableCollection(new ArrayList<IEngineAddon>(_addons));
//		}
//	}

	@Override
	public Collection<IMSEStateController> getMSEStateControllers() 
	{
		return _clockControllers;
	}

	@Override
	public void dispose() 
	{
		super.dispose();
		_clockControllers.clear();
	}

	@Override
	public IConcurrentExecutionPlatform asConcurrentExecutionPlatform() {
		if( this instanceof IConcurrentExecutionPlatform) return this;
		else return null;
	}

//	private Object _addonLock = new Object();
//	
//	@Override
//	public void addEngineAddon(IEngineAddon addon) 
//	{
//		synchronized (_addonLock) 
//		{
//			_addons.add(addon);
//		}
//	}
//
//	@Override
//	public void removeEngineAddon(IEngineAddon addon) 
//	{
//		synchronized (_addonLock) 
//		{
//			_addons.remove(addon);
//		}
//	}
	
}
