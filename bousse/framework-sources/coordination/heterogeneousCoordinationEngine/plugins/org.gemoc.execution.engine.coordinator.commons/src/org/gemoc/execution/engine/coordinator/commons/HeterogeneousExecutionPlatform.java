package org.gemoc.execution.engine.coordinator.commons;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

import org.gemoc.xdsmlframework.api.core.IExecutionPlatform;
import org.gemoc.xdsmlframework.api.core.IModelLoader;
import org.gemoc.xdsmlframework.api.engine_addon.IEngineAddon;

public class HeterogeneousExecutionPlatform implements IExecutionPlatform {

	protected Collection<IEngineAddon> _addons = new ArrayList<IEngineAddon>();
	
	public HeterogeneousExecutionPlatform() {
		// TODO Auto-generated constructor stub
	}



	@Override
	public IModelLoader getModelLoader() {
		return null;
	}

	@Override
	public Iterable<IEngineAddon> getEngineAddons() 
	{
		synchronized(_addonLock)
		{
			return Collections.unmodifiableCollection(new ArrayList<IEngineAddon>(_addons));
		}
	}

	@Override
	public void dispose() 
	{
		_addons.clear();
	}

	private Object _addonLock = new Object();
	
	@Override
	public void addEngineAddon(IEngineAddon addon) 
	{
		synchronized (_addonLock) 
		{
			_addons.add(addon);
		}
	}

	@Override
	public void removeEngineAddon(IEngineAddon addon) 
	{
		synchronized (_addonLock) 
		{
			_addons.remove(addon);
		}
	}
}
