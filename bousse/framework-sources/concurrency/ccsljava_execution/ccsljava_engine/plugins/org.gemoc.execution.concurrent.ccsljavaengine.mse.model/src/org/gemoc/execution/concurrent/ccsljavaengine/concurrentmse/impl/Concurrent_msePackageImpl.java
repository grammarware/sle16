/**
 */
package org.gemoc.execution.concurrent.ccsljavaengine.concurrentmse.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.gemoc.execution.concurrent.ccsljavaengine.concurrentmse.Concurrent_mseFactory;
import org.gemoc.execution.concurrent.ccsljavaengine.concurrentmse.Concurrent_msePackage;
import org.gemoc.execution.concurrent.ccsljavaengine.concurrentmse.FeedbackMSE;

import fr.inria.aoste.timesquare.ecl.feedback.feedback.FeedbackPackage;
import fr.inria.diverse.trace.commons.model.trace.TracePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Concurrent_msePackageImpl extends EPackageImpl implements Concurrent_msePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass feedbackMSEEClass = null;

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
	 * @see org.gemoc.execution.concurrent.ccsljavaengine.concurrentmse.Concurrent_msePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private Concurrent_msePackageImpl() {
		super(eNS_URI, Concurrent_mseFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link Concurrent_msePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static Concurrent_msePackage init() {
		if (isInited) return (Concurrent_msePackage)EPackage.Registry.INSTANCE.getEPackage(Concurrent_msePackage.eNS_URI);

		// Obtain or create and register package
		Concurrent_msePackageImpl theConcurrent_msePackage = (Concurrent_msePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof Concurrent_msePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new Concurrent_msePackageImpl());

		isInited = true;

		// Initialize simple dependencies
		FeedbackPackage.eINSTANCE.eClass();
		TracePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theConcurrent_msePackage.createPackageContents();

		// Initialize created meta-data
		theConcurrent_msePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theConcurrent_msePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(Concurrent_msePackage.eNS_URI, theConcurrent_msePackage);
		return theConcurrent_msePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFeedbackMSE() {
		return feedbackMSEEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFeedbackMSE_FeedbackModelSpecificEvent() {
		return (EReference)feedbackMSEEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFeedbackMSE__GetCaller() {
		return feedbackMSEEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFeedbackMSE__GetAction() {
		return feedbackMSEEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Concurrent_mseFactory getConcurrent_mseFactory() {
		return (Concurrent_mseFactory)getEFactoryInstance();
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
		feedbackMSEEClass = createEClass(FEEDBACK_MSE);
		createEReference(feedbackMSEEClass, FEEDBACK_MSE__FEEDBACK_MODEL_SPECIFIC_EVENT);
		createEOperation(feedbackMSEEClass, FEEDBACK_MSE___GET_CALLER);
		createEOperation(feedbackMSEEClass, FEEDBACK_MSE___GET_ACTION);
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
		TracePackage theMsePackage = (TracePackage)EPackage.Registry.INSTANCE.getEPackage(TracePackage.eNS_URI);
		FeedbackPackage theFeedbackPackage = (FeedbackPackage)EPackage.Registry.INSTANCE.getEPackage(FeedbackPackage.eNS_URI);
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		feedbackMSEEClass.getESuperTypes().add(theMsePackage.getMSE());

		// Initialize classes, features, and operations; add parameters
		initEClass(feedbackMSEEClass, FeedbackMSE.class, "FeedbackMSE", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFeedbackMSE_FeedbackModelSpecificEvent(), theFeedbackPackage.getModelSpecificEvent(), null, "feedbackModelSpecificEvent", null, 1, 1, FeedbackMSE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getFeedbackMSE__GetCaller(), theEcorePackage.getEObject(), "getCaller", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getFeedbackMSE__GetAction(), theEcorePackage.getEOperation(), "getAction", 0, 1, IS_UNIQUE, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //Concurrent_msePackageImpl
