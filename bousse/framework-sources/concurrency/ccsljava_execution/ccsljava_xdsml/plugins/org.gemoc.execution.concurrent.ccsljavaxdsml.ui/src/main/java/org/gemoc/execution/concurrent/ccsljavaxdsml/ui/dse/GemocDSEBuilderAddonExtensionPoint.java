package org.gemoc.execution.concurrent.ccsljavaxdsml.ui.dse;

import java.util.ArrayList;

import org.gemoc.xdsmlframework.api.extensions.ExtensionPoint;

public class GemocDSEBuilderAddonExtensionPoint extends ExtensionPoint<GemocDSEBuilderAddonExtension>
{

	public static final String GEMOC_DSE_BUILDER_ADDON_EXTENSION_POINT = "org.gemoc.execution.concurrent.ccsljavaxdsml.ui.dse.builder_addon";
	public static final String GEMOC_DSE_BUILDER_ADDON_EXTENSION_POINT_ID = "id";
	public static final String GEMOC_DSE_BUILDER_ADDON_EXTENSION_POINT_NAME = "Name";
	public static final String GEMOC_DSE_BUILDER_ADDON_EXTENSION_POINT_SHORTDESCRIPTION = "ShortDescription";
	public static final String GEMOC_DSE_BUILDER_ADDON_EXTENSION_POINT_CLASS = "Class";
	public static final String GEMOC_DSE_BUILDER_ADDON_EXTENSION_POINT_DEFAULT = "Default";

	protected GemocDSEBuilderAddonExtensionPoint() 
	{
		super(GemocDSEBuilderAddonExtension.class);
	}

	private static GemocDSEBuilderAddonExtensionPoint _singleton;
	
	private static GemocDSEBuilderAddonExtensionPoint getExtensionPoint()
	{
		if (_singleton == null)
		{
			_singleton = new GemocDSEBuilderAddonExtensionPoint();
		}
		return _singleton;
	}
		
	static public ArrayList<GemocDSEBuilderAddonExtension> getSpecifications()
	{
		return (ArrayList<GemocDSEBuilderAddonExtension>) getExtensionPoint().internal_getSpecifications();
	}
	
	@Override
	protected String getExtensionPointName() 
	{
		return GEMOC_DSE_BUILDER_ADDON_EXTENSION_POINT;
	}
	

	
}
