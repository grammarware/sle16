package org.gemoc.execution.concurrent.ccsljavaxdsml.ui.dse;

import org.eclipse.acceleo.common.preference.AcceleoPreferences;
import org.eclipse.core.runtime.CoreException;
import org.gemoc.xdsmlframework.api.extensions.Extension;

public class GemocDSEBuilderAddonExtension extends Extension
{

	public String getId()
	{
		return getAttribute(GemocDSEBuilderAddonExtensionPoint.GEMOC_DSE_BUILDER_ADDON_EXTENSION_POINT_ID);
	}

	public String getName()
	{
		return getAttribute(GemocDSEBuilderAddonExtensionPoint.GEMOC_DSE_BUILDER_ADDON_EXTENSION_POINT_NAME);
	}
	
	public String getShortDescription()
	{
		return getAttribute(GemocDSEBuilderAddonExtensionPoint.GEMOC_DSE_BUILDER_ADDON_EXTENSION_POINT_SHORTDESCRIPTION);
	}
	
	
	public IGemocDSEBuilderAddon instanciateComponent() throws CoreException
	{
		//remove acceleo notifications
		AcceleoPreferences.switchForceDeactivationNotifications(true);
		Object instance = instanciate(GemocDSEBuilderAddonExtensionPoint.GEMOC_DSE_BUILDER_ADDON_EXTENSION_POINT_CLASS);
		try
		{
			@SuppressWarnings("unchecked")
			IGemocDSEBuilderAddon castedInstance = (IGemocDSEBuilderAddon)instance;			
			return castedInstance;
		}
		catch(Exception e)
		{
			throwInstanciationCoreException();			
		}
		return null;
	}
	
	public Boolean getDefaultActivationValue() 
	{
		return Boolean.parseBoolean(getAttribute(GemocDSEBuilderAddonExtensionPoint.GEMOC_DSE_BUILDER_ADDON_EXTENSION_POINT_DEFAULT));
	}
	
}
