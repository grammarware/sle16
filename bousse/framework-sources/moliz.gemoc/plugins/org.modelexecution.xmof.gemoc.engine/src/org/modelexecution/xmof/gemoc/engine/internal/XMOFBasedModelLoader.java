package org.modelexecution.xmof.gemoc.engine.internal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.eclipse.core.runtime.IPath;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.EcoreUtil.Copier;
import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.gemoc.commons.eclipse.emf.EMFResource;
import org.gemoc.xdsmlframework.api.core.IExecutionContext;
import org.modelexecution.xmof.Semantics.Classes.Kernel.ObjectValue;
import org.modelexecution.xmof.Semantics.Classes.Kernel.Value;
import org.modelexecution.xmof.Semantics.CommonBehaviors.BasicBehaviors.ParameterValue;
import org.modelexecution.xmof.Semantics.CommonBehaviors.BasicBehaviors.ParameterValueDefinition;
import org.modelexecution.xmof.configuration.ConfigurationObjectMap;
import org.modelexecution.xmof.gemoc.engine.GenericXMOFAnimationServices;
import org.modelexecution.xmof.gemoc.engine.ui.commons.IXMOFRunConfiguration;
import org.modelexecution.xmof.vm.XMOFBasedModel;

import fr.inria.diverse.melange.metamodel.melange.Element;
import fr.inria.diverse.melange.metamodel.melange.Language;
import fr.inria.diverse.melange.metamodel.melange.ModelTypingSpace;

public class XMOFBasedModelLoader {

	private IExecutionContext executionContext;

	private ConfigurationObjectMap configurationMap;

	private Set<EPackage> xmofConfigurationMetamodelPackages = new HashSet<EPackage>();

	public XMOFBasedModelLoader(IExecutionContext executionContext) {
		this.executionContext = executionContext;
	}

	public XMOFBasedModel loadXMOFBasedModel() {
		Collection<EObject> inputModelElements = loadInputModelElements();
		List<ParameterValue> inputParameterValues = loadInputParameterValueElements();
		Collection<EObject> inputParameterValueObjects = getParameterValueObjects(inputParameterValues);

		Collection<EObject> inputElements = new ArrayList<EObject>();
		inputElements.addAll(inputModelElements);
		inputElements.addAll(inputParameterValueObjects);

		Collection<EPackage> configurationPackages = loadConfigurationMetamodel();
		configurationMap = new ConfigurationObjectMap(inputElements,
				configurationPackages);
		createConfigurationModelResource();

		GenericXMOFAnimationServices
				.setConfigurationObjectMap(configurationMap);

		return new XMOFBasedModel(configurationMap.getConfigurationObjects(),
				getParameterValueConfiguration(inputParameterValues), getEditingDomain());
	}

	private Collection<EObject> loadInputModelElements() {
		EList<EObject> inputModelElements = new BasicEList<EObject>();
		for(Resource resource : getInputModelResources()) {
			inputModelElements.addAll(resource.getContents());
		}		
		return inputModelElements;
	}
	
	private Collection<Resource> getInputModelResources() {
		Set<Resource> inputModelResources = new HashSet<Resource>();
		Resource modelResource = getModelResource();
		inputModelResources.add(modelResource);
		inputModelResources.addAll(EMFResource.getRelatedResources(modelResource));
		return inputModelResources;
	}

	private Collection<EObject> getParameterValueObjects(
			Collection<ParameterValue> inputParameterValues) { 
		Collection<EObject> parameterValueObjects = new BasicEList<EObject>();
		for (ParameterValue parameterValue : inputParameterValues) {
			for (Value value : parameterValue.getValues()) {
				if (value instanceof ObjectValue) {
					ObjectValue objectValue = (ObjectValue) value;
					EObject referencedEObject = objectValue.getEObject();
					if (referencedEObject != null) {
						parameterValueObjects.add(referencedEObject);
					}
				}
			}
		}
		
		// add referenced objects that reside in different resources
		if(parameterValueObjects.size() > 0) {
			EObject parameterValueObject = parameterValueObjects.iterator().next();
			Resource parameterValueObjectResource = parameterValueObject.eResource();
			for (Resource relatedResource : EMFResource.getRelatedResources(parameterValueObjectResource)) {
				if (relatedResource != null && relatedResource != parameterValueObjectResource)
					parameterValueObjects.addAll(relatedResource.getContents());
			}
		}
		
		return parameterValueObjects;
	}

	private List<ParameterValue> getParameterValueConfiguration(
			List<ParameterValue> inputParameterValues) {
		List<ParameterValue> parameterValueConfiguration = new ArrayList<ParameterValue>();

		Copier copier = new EcoreUtil.Copier(true, false);
		copier.copyAll(inputParameterValues);
		copier.copyReferences();

		for (ParameterValue parameterValue : inputParameterValues) {
			ParameterValue parameterValueConf = (ParameterValue) copier
					.get(parameterValue);
			parameterValueConf.setParameter(parameterValue.getParameter());
			for (Value value : parameterValue.getValues()) {
				if (value instanceof ObjectValue) {
					ObjectValue objectValue = (ObjectValue) value;
					EObject referencedEObject = objectValue.getEObject();
					if (referencedEObject != null) {
						EObject referencedEObjectConf = getConfigurationMap()
								.getConfigurationObject(referencedEObject);
						ObjectValue objectValueConf = (ObjectValue) copier
								.get(value);
						objectValueConf.setEObject(referencedEObjectConf);
					}
				}
			}
			parameterValueConfiguration.add(parameterValueConf);
		}
		return parameterValueConfiguration;
	}

	private List<ParameterValue> loadInputParameterValueElements() {
		EList<ParameterValue> parameterValues = new BasicEList<ParameterValue>();
		String initializationModelPath = getInitializationModelPath();
		if (!(initializationModelPath == null || initializationModelPath == "")) {
			Resource resource = loadPlatformResource(initializationModelPath);
			EList<EObject> parameterValueDefinitions = resource.getContents();
			for (EObject eObject : parameterValueDefinitions) {
				if (eObject instanceof ParameterValueDefinition) {
					ParameterValueDefinition parameterValueDefinition = (ParameterValueDefinition) eObject;
					parameterValues.addAll(parameterValueDefinition
							.getParameterValues());
				}
			}
		}
		return parameterValues;
	}

	private String getXMOFModelFilePath() {
		String xmofModelFilePath = "";
		String xdsmlModelPath = getXDSMLModelPath();
		Resource xdsmlFileResource = loadPluginResource(xdsmlModelPath);
		ModelTypingSpace modelTypingSpace = (ModelTypingSpace) xdsmlFileResource
				.getContents().get(0);
		String languageFQN = executionContext.getLanguageDefinitionExtension().getName();
		for (Element element : modelTypingSpace.getElements()) {
			if (element instanceof Language) {
				Language language = (Language) element;
				if (languageFQN.endsWith(language.getName())) {
					xmofModelFilePath = language.getXmof();
					break;
				}
			}
		}
		return xmofModelFilePath.replace("platform:/resource/", "");
	}

	private Collection<EPackage> loadConfigurationMetamodel() {
		String confMetamodelPath = getXMOFModelFilePath();
		Resource confMetamodelResource = loadPluginResource(confMetamodelPath);

		Collection<EPackage> confMMPackages = new HashSet<EPackage>();
		for (EObject eObject : confMetamodelResource.getContents()) {
			if (eObject instanceof EPackage) {
				EPackage ePackage = (EPackage) eObject;
				if (EPackage.Registry.INSTANCE.containsKey(ePackage.getNsURI())) {
					EPackage registeredPackage = EPackage.Registry.INSTANCE
							.getEPackage(ePackage.getNsURI());
					confMMPackages.add(registeredPackage);
				} else {
					confMMPackages.add(ePackage);
				}
				xmofConfigurationMetamodelPackages.add(ePackage);
			}
		}
		return confMMPackages;
	}

	private void createConfigurationModelResource() {
		URI configurationModelURI = computeConfigurationModelURI();
		Resource configurationResource = getResourceSet().createResource(
				configurationModelURI);
		for (EObject configurationObject : configurationMap
				.getConfigurationObjects()) {
			if (configurationObject.eContainer() == null) {
				Command cmd = new AddCommand(getEditingDomain(),
						configurationResource.getContents(),
						configurationObject);
				getEditingDomain().getCommandStack().execute(cmd);
			}
		}
	}

	private URI computeConfigurationModelURI() {
		IPath executionPath = getExecutionPath();
		String modelFileName = getModelResource().getURI().lastSegment();
		String modelFileExtension = getModelResource().getURI().fileExtension();
		String configurationModelFileName = modelFileName.replace("."
				+ modelFileExtension, "-configuration.xmi");
		IPath configurationModelPath = executionPath
				.append(configurationModelFileName);
		URI uri = URI.createPlatformResourceURI(
				configurationModelPath.toString(), true);
		return uri;
	}

	private Resource loadPlatformResource(String path) {
		return getResourceSet().getResource(
				URI.createPlatformResourceURI(path, true), true);
	}

	private Resource loadPluginResource(String path) {
		return getResourceSet().getResource(
				URI.createPlatformPluginURI(path, true), true);
	}

	public ConfigurationObjectMap getConfigurationMap() {
		return configurationMap;
	}

	private ResourceSet getResourceSet() {
		return executionContext.getResourceModel().getResourceSet();
	}

	private Resource getModelResource() {
		return executionContext.getResourceModel();
	}

	private String getInitializationModelPath() {
		return ((IXMOFRunConfiguration) executionContext.getRunConfiguration())
				.getModelInitializationModel();
	}

	private String getXDSMLModelPath() {
		return executionContext.getLanguageDefinitionExtension()
				.getXDSMLFilePath();
	}

	private IPath getExecutionPath() {
		return executionContext.getWorkspace().getExecutionPath();
	}

	private EditingDomain getEditingDomain() {
		ResourceSet resourceSet = getResourceSet();
		return TransactionUtil.getEditingDomain(resourceSet);
	}

}
