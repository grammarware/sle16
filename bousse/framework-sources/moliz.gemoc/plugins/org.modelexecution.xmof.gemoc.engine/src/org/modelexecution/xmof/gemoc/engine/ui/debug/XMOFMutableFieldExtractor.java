package org.modelexecution.xmof.gemoc.engine.ui.debug;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Supplier;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.gemoc.executionframework.engine.ui.debug.IMutableFieldExtractor;
import org.gemoc.executionframework.engine.ui.debug.MutableField;
import org.modelexecution.xmof.configuration.ConfigurationObjectMap;

public class XMOFMutableFieldExtractor implements IMutableFieldExtractor {

	private ConfigurationObjectMap configurationObjectMap;

	private Map<EClass, Integer> counters = new HashMap<EClass, Integer>();

	public XMOFMutableFieldExtractor(
			ConfigurationObjectMap configurationObjectMap) {
		this.configurationObjectMap = configurationObjectMap;
	}

	@Override
	public List<MutableField> extractMutableField(EObject eObject) {
		List<MutableField> mutableFields = new ArrayList<MutableField>();
		EObject configurationObject = configurationObjectMap
				.getConfigurationObject(eObject);
		for (EStructuralFeature feature : configurationObject.eClass()
				.getEAllStructuralFeatures()) {
			EStructuralFeature originalFeature = eObject.eClass()
					.getEStructuralFeature(feature.getName());
			if (originalFeature == null) {
				// We have found a mutable feature
				String objectName = getObjectName(eObject);
				String className = eObject.eClass().getName();
				String fieldName = feature.getName() + " (" + objectName + " :"
						+ className + ")";
				Supplier<Object> getter = () -> {
					return configurationObject.eGet(feature);
				};
				Consumer<Object> setter = (Object t) -> {
				};
				mutableFields.add(new MutableField(fieldName, eObject, feature,
						getter, setter));
			}
		}
		return mutableFields;
	}

	private String getObjectName(EObject eObject) {
		String objectName = "";
		String objectID = getObjectID(eObject);
		if (objectID != null) {
			objectName = objectID;
		} else {
			String objectNameValue = getObjectNameValue(eObject);
			if (objectNameValue != null) {
				objectName = objectNameValue;
			} else {
				objectName = createObjectName(eObject);
			}
		}
		return objectName;
	}

	private String getObjectID(EObject eObject) {
		String objectId = null;
		EAttribute idAttribute = eObject.eClass().getEIDAttribute();
		if (idAttribute != null) {
			Object id = eObject.eGet(idAttribute);
			if (id != null) {
				objectId = id.toString();
			}
		}
		return objectId;
	}

	private String getObjectNameValue(EObject eObject) {
		String objectNameValue = null;
		EStructuralFeature nameFeature = eObject.eClass().getEStructuralFeature("name");
		if (nameFeature != null) {
			Object nameValue = eObject.eGet(nameFeature);
			if (nameValue instanceof String) {
				objectNameValue = (String) nameValue;
			}
		}
		return objectNameValue;
	}

	private String createObjectName(EObject eObject) {
		String className = eObject.eClass().getName();
		int objectCounter = getObjectCounter(eObject);
		return className + "_" + objectCounter;
	}

	private int getObjectCounter(EObject eObject) {
		EClass eClass = eObject.eClass();
		if (!counters.containsKey(eClass)) {
			counters.put(eClass, 0);
		}
		int counter = counters.get(eClass);
		counters.put(eClass, counter + 1);
		return counter;
	}
}
