/**
 */
package org.gemoc.execution.concurrent.ccsljavaxdsml.concurrent_xdsml.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.gemoc.execution.concurrent.ccsljavaxdsml.concurrent_xdsml.ConcurrentLanguageDefinition;
import org.gemoc.execution.concurrent.ccsljavaxdsml.concurrent_xdsml.Concurrent_xdsmlFactory;
import org.gemoc.execution.concurrent.ccsljavaxdsml.concurrent_xdsml.Concurrent_xdsmlPackage;
import org.gemoc.execution.concurrent.ccsljavaxdsml.concurrent_xdsml.DSAProject;
import org.gemoc.execution.concurrent.ccsljavaxdsml.concurrent_xdsml.DSEProject;
import org.gemoc.execution.concurrent.ccsljavaxdsml.concurrent_xdsml.MoCCProject;
import org.gemoc.executionframework.xdsml_base.Xdsml_basePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Concurrent_xdsmlPackageImpl extends EPackageImpl implements Concurrent_xdsmlPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass concurrentLanguageDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dsaProjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass moCCProjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dseProjectEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.gemoc.execution.concurrent.ccsljavaxdsml.concurrent_xdsml.Concurrent_xdsmlPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private Concurrent_xdsmlPackageImpl() {
		super(eNS_URI, Concurrent_xdsmlFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link Concurrent_xdsmlPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static Concurrent_xdsmlPackage init() {
		if (isInited) return (Concurrent_xdsmlPackage)EPackage.Registry.INSTANCE.getEPackage(Concurrent_xdsmlPackage.eNS_URI);

		// Obtain or create and register package
		Concurrent_xdsmlPackageImpl theConcurrent_xdsmlPackage = (Concurrent_xdsmlPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof Concurrent_xdsmlPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new Concurrent_xdsmlPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		Xdsml_basePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theConcurrent_xdsmlPackage.createPackageContents();

		// Initialize created meta-data
		theConcurrent_xdsmlPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theConcurrent_xdsmlPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(Concurrent_xdsmlPackage.eNS_URI, theConcurrent_xdsmlPackage);
		return theConcurrent_xdsmlPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConcurrentLanguageDefinition() {
		return concurrentLanguageDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConcurrentLanguageDefinition_DsaProject() {
		return (EReference)concurrentLanguageDefinitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConcurrentLanguageDefinition_MoCCProject() {
		return (EReference)concurrentLanguageDefinitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConcurrentLanguageDefinition_DSEProject() {
		return (EReference)concurrentLanguageDefinitionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDSAProject() {
		return dsaProjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDSAProject_CodeExecutorClass() {
		return (EAttribute)dsaProjectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDSAProject_EntryPoint() {
		return (EAttribute)dsaProjectEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMoCCProject() {
		return moCCProjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDSEProject() {
		return dseProjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDSEProject_QvtoURI() {
		return (EAttribute)dseProjectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDSEProject_SolverClass() {
		return (EAttribute)dseProjectEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Concurrent_xdsmlFactory getConcurrent_xdsmlFactory() {
		return (Concurrent_xdsmlFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		concurrentLanguageDefinitionEClass = createEClass(CONCURRENT_LANGUAGE_DEFINITION);
		createEReference(concurrentLanguageDefinitionEClass, CONCURRENT_LANGUAGE_DEFINITION__DSA_PROJECT);
		createEReference(concurrentLanguageDefinitionEClass, CONCURRENT_LANGUAGE_DEFINITION__MO_CC_PROJECT);
		createEReference(concurrentLanguageDefinitionEClass, CONCURRENT_LANGUAGE_DEFINITION__DSE_PROJECT);

		dsaProjectEClass = createEClass(DSA_PROJECT);
		createEAttribute(dsaProjectEClass, DSA_PROJECT__CODE_EXECUTOR_CLASS);
		createEAttribute(dsaProjectEClass, DSA_PROJECT__ENTRY_POINT);

		moCCProjectEClass = createEClass(MO_CC_PROJECT);

		dseProjectEClass = createEClass(DSE_PROJECT);
		createEAttribute(dseProjectEClass, DSE_PROJECT__QVTO_URI);
		createEAttribute(dseProjectEClass, DSE_PROJECT__SOLVER_CLASS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		Xdsml_basePackage theXdsml_basePackage = (Xdsml_basePackage)EPackage.Registry.INSTANCE.getEPackage(Xdsml_basePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		concurrentLanguageDefinitionEClass.getESuperTypes().add(theXdsml_basePackage.getLanguageDefinition());
		dsaProjectEClass.getESuperTypes().add(theXdsml_basePackage.getProjectResource());
		moCCProjectEClass.getESuperTypes().add(theXdsml_basePackage.getProjectResource());
		dseProjectEClass.getESuperTypes().add(theXdsml_basePackage.getProjectResource());

		// Initialize classes, features, and operations; add parameters
		initEClass(concurrentLanguageDefinitionEClass, ConcurrentLanguageDefinition.class, "ConcurrentLanguageDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConcurrentLanguageDefinition_DsaProject(), this.getDSAProject(), null, "dsaProject", null, 0, 1, ConcurrentLanguageDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConcurrentLanguageDefinition_MoCCProject(), this.getMoCCProject(), null, "moCCProject", null, 0, 1, ConcurrentLanguageDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConcurrentLanguageDefinition_DSEProject(), this.getDSEProject(), null, "dSEProject", null, 0, 1, ConcurrentLanguageDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dsaProjectEClass, DSAProject.class, "DSAProject", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDSAProject_CodeExecutorClass(), ecorePackage.getEString(), "codeExecutorClass", null, 0, 1, DSAProject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDSAProject_EntryPoint(), ecorePackage.getEString(), "entryPoint", null, 0, 1, DSAProject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(moCCProjectEClass, MoCCProject.class, "MoCCProject", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(dseProjectEClass, DSEProject.class, "DSEProject", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDSEProject_QvtoURI(), ecorePackage.getEString(), "qvtoURI", null, 0, 1, DSEProject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDSEProject_SolverClass(), ecorePackage.getEString(), "solverClass", null, 0, 1, DSEProject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //Concurrent_xdsmlPackageImpl
