package org.modelexecution.xmof.gemoc.codegen;

import java.io.IOException;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.jar.Manifest;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.codegen.ecore.generator.Generator;
import org.eclipse.emf.codegen.ecore.genmodel.GenJDKLevel;
import org.eclipse.emf.codegen.ecore.genmodel.GenModel;
import org.eclipse.emf.codegen.ecore.genmodel.GenModelFactory;
import org.eclipse.emf.codegen.ecore.genmodel.GenPackage;
import org.eclipse.emf.codegen.ecore.genmodel.GenParameter;
import org.eclipse.emf.codegen.ecore.genmodel.generator.GenBaseGeneratorAdapter;
import org.eclipse.emf.codegen.ecore.genmodel.util.GenModelUtil;
import org.eclipse.emf.codegen.util.CodeGenUtil;
import org.eclipse.emf.common.util.BasicMonitor;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.common.util.UniqueEList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EParameter;
import org.eclipse.emf.ecore.EStructuralFeature.Setting;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.EcoreUtil.Copier;
import org.modelexecution.xmof.Syntax.Actions.BasicActions.CallBehaviorAction;
import org.modelexecution.xmof.Syntax.Actions.CompleteActions.ReduceAction;
import org.modelexecution.xmof.Syntax.Activities.IntermediateActivities.DecisionNode;
import org.modelexecution.xmof.Syntax.Classes.Kernel.BehavioredEClass;
import org.modelexecution.xmof.Syntax.Classes.Kernel.BehavioredEOperation;

public class XMOFCodeGenerator {

	public static final String MODEL_GEN_FOLDER = "model-gen";

	protected IProgressMonitor progressMonitor;

	protected ResourceSet resourceSet;
	protected IProject xmofProject;

	protected URI modelGenFolderURI;
	protected String srcFolderPathString;

	public boolean generateCode(Resource xmofModelResource, IProgressMonitor progressMonitor) {
		this.progressMonitor = progressMonitor;
		this.resourceSet = xmofModelResource.getResourceSet();
		this.xmofProject = getXMOFProject(xmofModelResource);

		// setup model-gen folder for saving temporary models
		this.modelGenFolderURI = setupModelGenFolder();

		// setup src folder for model code generation
		this.srcFolderPathString = setupSrcFolder();

		// create temporary Ecore metamodel
		// final EPackage rootEPackage = generateEcoreModel(xmofModelResource);

		// check whether all referenced packages can be loaded
		checkReferencedPackages(xmofModelResource);

		// create temporary Genmodel, set initialize by load to true
		// final GenModel genModel = generateGenModel(rootEPackage,
		// modelGenFolderURI);
		final GenModel genModel = generateGenModel((EPackage) xmofModelResource.getContents().get(0),
				modelGenFolderURI);

		// generate code
		return generateCode(genModel, progressMonitor);
	}

	private IProject getXMOFProject(Resource xmofModelResource) {
		final URI xmofModelURI = xmofModelResource.getURI();
		final IPath xmofModelPath = new Path(xmofModelURI.toPlatformString(true));
		final IFile xmofModelFile = ResourcesPlugin.getWorkspace().getRoot().getFile(xmofModelPath);
		final IProject xmofProject = xmofModelFile.getProject();
		return xmofProject;
	}

	private URI setupModelGenFolder() {
		URI modelGenFolderURI = null;
		final IFolder modelGenFolder = xmofProject.getFolder(MODEL_GEN_FOLDER);
		if (!modelGenFolder.exists()) {
			try {
				modelGenFolder.create(true, true, null);
			} catch (CoreException e) {
				throw new RuntimeException("The folder \'model-gen\' could not be created.", e);
			}
		}
		modelGenFolderURI = URI.createPlatformResourceURI(modelGenFolder.getFullPath().toString(), true);
		return modelGenFolderURI;
	}

	private String setupSrcFolder() {
		String srcFolderPathString = null;
		final IFolder srcFolder = xmofProject.getFolder("src");
		if (!srcFolder.exists()) {
			try {
				srcFolder.create(true, true, null);
			} catch (CoreException e) {
				throw new RuntimeException("The source folder \'src\' could not be created.", e);
			}
		}
		srcFolderPathString = srcFolder.getFullPath().toString();
		return srcFolderPathString;
	}

	protected EPackage generateEcoreModel(Resource xmofModelResource) {
		final Resource ecoreModelResource = copyXMOFModel(xmofModelResource);
		final EPackage rootEPackage = (EPackage) ecoreModelResource.getContents().get(0);
		removeBehaviors(rootEPackage);
		save(ecoreModelResource);
		return rootEPackage;
	}

	private Resource copyXMOFModel(Resource xmofModelResource) {
		final String ecoreModelFileName = xmofModelResource.getURI().trimFileExtension().appendFileExtension("ecore")
				.lastSegment().toString();
		final URI ecoreModelURI = this.modelGenFolderURI.appendSegment(ecoreModelFileName);
		final Resource ecoreModelResource = resourceSet.createResource(ecoreModelURI);

		final Copier copier = new Copier();
		ecoreModelResource.getContents().addAll((copier.copyAll(xmofModelResource.getContents())));
		copier.copyReferences();
		return ecoreModelResource;
	}

	private void removeBehaviors(EPackage ePackage) {
		for (TreeIterator<EObject> eAllContents = ePackage.eAllContents(); eAllContents.hasNext();) {
			EObject eObject = eAllContents.next();
			if (eObject instanceof BehavioredEClass) {
				BehavioredEClass behavioredEClass = (BehavioredEClass) eObject;
				behavioredEClass.getOwnedBehavior().clear();
			} else if (eObject instanceof BehavioredEOperation) {
				BehavioredEOperation behavioredEOperation = (BehavioredEOperation) eObject;
				behavioredEOperation.getMethod().clear();
				behavioredEOperation.getEContainingClass().getEOperations().remove(behavioredEOperation);
			} else if (eObject instanceof CallBehaviorAction) {
				CallBehaviorAction callBehaviorAction = (CallBehaviorAction) eObject;
				callBehaviorAction.setBehavior(null);
			} else if (eObject instanceof DecisionNode) {
				DecisionNode decisionNode = (DecisionNode) eObject;
				decisionNode.setDecisionInput(null);
			} else if (eObject instanceof ReduceAction) {
				ReduceAction reduceAction = (ReduceAction) eObject;
				reduceAction.setReducer(null);
			}
		}
	}

	private void checkReferencedPackages(Resource xmofModelResource) {
		Set<URI> missingPackages = new HashSet<URI>();
		Map<EObject, Collection<Setting>> externalCrossReferences = EcoreUtil.ExternalCrossReferencer
				.find(xmofModelResource);
		for (EObject eObject : externalCrossReferences.keySet()) {
			if (eObject.eIsProxy()) {
				missingPackages.add(EcoreUtil.getURI(eObject).trimFragment());
			}
		}

		if (missingPackages.size() > 0) {
			throw new RuntimeException("Unable to load the following referenced resource"
					+ (missingPackages.size() == 1 ? "" : "s") + ": " + missingPackages.toString());
		}
	}

	protected GenModel generateGenModel(EPackage rootEPackage, URI modelGenFolderURI) {
		final Resource genModelResource = createGenModel(rootEPackage);
		GenModel genModel = (GenModel) genModelResource.getContents().get(0);
		setInitializeByLoad(genModel);
		save(genModelResource);
		return genModel;
	}

	protected Resource createGenModel(EPackage rootEPackage) {
		final Resource ecoreModelResource = rootEPackage.eResource();
		final String genModelFileName = ecoreModelResource.getURI().trimFileExtension().appendFileExtension("genmodel")
				.lastSegment().toString();
		final URI genModelURI = this.modelGenFolderURI.appendSegment(genModelFileName);

		final Resource genModelResource = resourceSet.createResource(genModelURI);
		GenModel genModel = GenModelFactory.eINSTANCE.createGenModel();
		genModelResource.getContents().add(genModel);

		final IFolder srcFolder = xmofProject.getFolder("src");
		genModel.setModelDirectory(srcFolder.getFullPath().toString());
		genModel.getForeignModel().add(ecoreModelResource.getURI().toString());
		genModel.setModelName(getModelName(genModelURI));
		genModel.setModelPluginID(getPluginID(genModelURI));

		// genModel.setOperationReflection(true);
		// genModel.setMinimalReflectiveMethods(true);
		genModel.setRootExtendsClass("org.eclipse.emf.ecore.impl.MinimalEObjectImpl$Container");
		genModel.setComplianceLevel(getComplicanceLevel());
		genModel.setImportOrganizing(true);

		genModel.initialize(Collections.singleton(rootEPackage));
		setMissingParameterTypes(genModel);

		final List<GenPackage> missingGenPackages = computeMissingGenPackages(genModel);
		genModel.getUsedGenPackages().addAll(missingGenPackages);

		return genModelResource;
	}

	protected String getModelName(URI genModelURI) {
		final String genModelFileName = genModelURI.trimFileExtension().lastSegment();
		final String modelName = genModelFileName.substring(0, 1).toUpperCase() + genModelFileName.substring(1);
		return modelName;
	}

	protected final String getPluginID(URI uri) {
		String pluginID = "";
		final IFile manifestFile = xmofProject.getFolder("META-INF").getFile("MANIFEST.MF");
		try {
			final Manifest manifest = new Manifest(manifestFile.getContents());
			String symbolicName = manifest.getMainAttributes().getValue("Bundle-SymbolicName");
			if (symbolicName != null) {
				int index = symbolicName.indexOf(";");
				if (index > 0) {
					symbolicName = symbolicName.substring(0, index);
				}
				pluginID = symbolicName.trim();
			}
		} catch (Exception e) {
			throw new RuntimeException(
					"Could not find manifest file \'" + manifestFile.getFullPath().toString() + "\'.", e);
		}
		return pluginID;
	}

	private GenJDKLevel getComplicanceLevel() {
		String complianceLevel = CodeGenUtil.EclipseUtil.getJavaComplianceLevel(xmofProject);
		if ("1.4".equals(complianceLevel)) {
			return GenJDKLevel.JDK14_LITERAL;
		} else if ("1.5".equals(complianceLevel)) {
			return GenJDKLevel.JDK50_LITERAL;
		} else if ("1.6".equals(complianceLevel)) {
			return GenJDKLevel.JDK60_LITERAL;
		} else if ("1.7".equals(complianceLevel)) {
			return GenJDKLevel.JDK70_LITERAL;
		} else {
			return GenJDKLevel.JDK80_LITERAL;
		}
	}

	/**
	 * In case of missing parameter types, the types are temporarily set to
	 * EObject
	 * 
	 * @param genModel
	 */
	private void setMissingParameterTypes(GenModel genModel) {
		for (TreeIterator<EObject> genModelContents = genModel.eAllContents(); genModelContents.hasNext();) {
			EObject genModelElement = genModelContents.next();
			if (genModelElement instanceof GenParameter) {
				GenParameter genParameter = (GenParameter) genModelElement;
				EParameter ecoreParameter = genParameter.getEcoreParameter();
				if (ecoreParameter.getEType() == null) {
					ecoreParameter.setEType(EcorePackage.eINSTANCE.getEObject());
				}
			}
		}
	}

	protected List<GenPackage> computeMissingGenPackages(GenModel genModel) {
		final List<GenPackage> missingGenPackages = new UniqueEList<GenPackage>();
		final Map<String, URI> genModelLocationMapTargetEnvironment = EcorePlugin
				.getEPackageNsURIToGenModelLocationMap(true);
		final Map<String, URI> genModelLocationMapEnvironment = EcorePlugin
				.getEPackageNsURIToGenModelLocationMap(false);
		for (EPackage ePackage : genModel.getMissingPackages()) {
			if (ePackage != null) { // happens for activities
				URI missingGenModelURI = genModelLocationMapEnvironment.get(ePackage.getNsURI());
				if (missingGenModelURI == null) {
					missingGenModelURI = genModelLocationMapTargetEnvironment.get(ePackage.getNsURI());
				}
				if (missingGenModelURI == null) {
					throw new RuntimeException(
							"Unable to load generator model of required package \'" + ePackage.getNsURI() + "\'.");
				}
				Resource missingGenModelResource = null;
				try {
					missingGenModelResource = resourceSet.getResource(missingGenModelURI, true);
				} catch (RuntimeException e) {
					throw new RuntimeException(
							"Unable to load generator model of required package \'" + ePackage.getNsURI() + "\'.");
				}
				final GenModel missingGenModel = (GenModel) missingGenModelResource.getContents().get(0);
				missingGenPackages.addAll(missingGenModel.getGenPackages());
			}
		}
		return missingGenPackages;
	}

	protected void setInitializeByLoad(GenModel genModel) {
		for (GenPackage genPackage : genModel.getGenPackages()) {
			setInitializeByLoad(genPackage);
		}
	}

	private void setInitializeByLoad(GenPackage genPackage) {
		genPackage.setLoadInitialization(true);
		for (GenPackage subGenPackage : genPackage.getSubGenPackages()) {
			setInitializeByLoad(subGenPackage);
		}
	}

	protected boolean generateCode(GenModel genModel, IProgressMonitor progressMonitor) {
		boolean success = false;
		prepareGenModelForCodeGeneration(genModel);
		final Generator generator = GenModelUtil.createGenerator(genModel);
		final boolean canGenerate = generator.canGenerate(genModel, GenBaseGeneratorAdapter.MODEL_PROJECT_TYPE);
		if (canGenerate) {
			Diagnostic diagnostic = generator.generate(genModel, GenBaseGeneratorAdapter.MODEL_PROJECT_TYPE,
					BasicMonitor.toMonitor(progressMonitor));
			if (diagnostic.getSeverity() == Diagnostic.OK) {
				success = true;
			}
		}
		return success;
	}

	protected void prepareGenModelForCodeGeneration(GenModel genModel) {
		genModel.reconcile();
		genModel.setCanGenerate(true);
	}

	private final void save(Resource resource) {
		try {
			resource.save(Collections.EMPTY_MAP);
		} catch (IOException e) {
			throw new RuntimeException("Could not save resource \'" + resource.getURI() + "\'.", e);
		}
	}
}
