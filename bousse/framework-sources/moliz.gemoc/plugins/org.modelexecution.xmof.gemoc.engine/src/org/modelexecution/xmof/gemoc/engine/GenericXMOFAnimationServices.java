package org.modelexecution.xmof.gemoc.engine;

import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.modelexecution.xmof.configuration.ConfigurationObjectMap;

public class GenericXMOFAnimationServices {

	private static ConfigurationObjectMap configurationMap;

	public static void setConfigurationObjectMap(
			ConfigurationObjectMap configurationMap) {
		GenericXMOFAnimationServices.configurationMap = configurationMap;
	}

	private static Object getByString(EObject o, String prop) {
		Object value = null;
		if (o != null) {
			EStructuralFeature f = o.eClass().getEStructuralFeature(prop);
			value = o.eGet(f);
		}
		return value;
	}

	public static Integer getConfObjectInteger(EObject o, String property) {
		Integer value = -1;
		EObject confObject = getConfObject(o);
		Object propertyValue = getByString(confObject, property);
		if (propertyValue != null) {
			value = (Integer) propertyValue ;
		}
		return value;
	}
	
	public static EList<?> getConfObjectReferencedObjects(EObject o, String property) {
		EList<?> referencedObjects = null;
		EObject confObject = getConfObject(o);
		Object value = getByString(confObject, property);
		if (value instanceof EList) {
			referencedObjects = ECollections.unmodifiableEList((EList<?>)value);
		}
		return referencedObjects;
	}
	
	public static EObject getConfObject(EObject o) {
		EObject confObject = null;
		if (configurationMap != null) {
			confObject = configurationMap.getConfigurationObject(o);
		}
		return confObject;
	}
}
