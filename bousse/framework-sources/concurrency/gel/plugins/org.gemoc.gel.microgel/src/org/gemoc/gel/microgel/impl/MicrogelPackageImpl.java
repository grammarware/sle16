/**
 */
package org.gemoc.gel.microgel.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.gemoc.gel.microgel.AtomicModelSpecificEvent;
import org.gemoc.gel.microgel.BinaryPattern;
import org.gemoc.gel.microgel.CallKind;
import org.gemoc.gel.microgel.CcslClock;
import org.gemoc.gel.microgel.CoincidencePattern;
import org.gemoc.gel.microgel.CompositeModelSpecificEvent;
import org.gemoc.gel.microgel.ExecutionFunction;
import org.gemoc.gel.microgel.ExecutionFunctionResult;
import org.gemoc.gel.microgel.ExecutionKind;
import org.gemoc.gel.microgel.FeedbackConsequence;
import org.gemoc.gel.microgel.FeedbackFilter;
import org.gemoc.gel.microgel.FeedbackPolicy;
import org.gemoc.gel.microgel.FeedbackRule;
import org.gemoc.gel.microgel.ImportStatement;
import org.gemoc.gel.microgel.IterationPattern;
import org.gemoc.gel.microgel.Kermeta3ExecutionFunction;
import org.gemoc.gel.microgel.LogicalSequence;
import org.gemoc.gel.microgel.MicrogelFactory;
import org.gemoc.gel.microgel.MicrogelPackage;
import org.gemoc.gel.microgel.MoccEventInstance;
import org.gemoc.gel.microgel.ModelSpecificEvent;
import org.gemoc.gel.microgel.ModelSpecificEventReference;
import org.gemoc.gel.microgel.ModelSpecificEventsPattern;
import org.gemoc.gel.microgel.ModelSpecificEventsSpecification;
import org.gemoc.gel.microgel.OrPattern;
import org.gemoc.gel.microgel.PlusPattern;
import org.gemoc.gel.microgel.UnaryPattern;
import org.gemoc.gel.microgel.Visibility;
import org.gemoc.gel.microgel.XorPattern;
import org.gemoc.gexpressions.GexpressionsPackage;

import fr.inria.aoste.timesquare.ccslkernel.model.TimeModel.TimeModelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MicrogelPackageImpl extends EPackageImpl implements MicrogelPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modelSpecificEventsSpecificationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass importStatementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modelSpecificEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass atomicModelSpecificEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass compositeModelSpecificEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modelSpecificEventsPatternEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unaryPatternEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass binaryPatternEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass coincidencePatternEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass logicalSequenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass orPatternEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xorPatternEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass plusPatternEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iterationPatternEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modelSpecificEventReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass feedbackPolicyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass feedbackRuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass feedbackFilterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass feedbackConsequenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass moccEventInstanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ccslClockEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass executionFunctionResultEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass executionFunctionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass kermeta3ExecutionFunctionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum visibilityEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum executionKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum callKindEEnum = null;

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
	 * @see org.gemoc.gel.microgel.MicrogelPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private MicrogelPackageImpl() {
		super(eNS_URI, MicrogelFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link MicrogelPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static MicrogelPackage init() {
		if (isInited) return (MicrogelPackage)EPackage.Registry.INSTANCE.getEPackage(MicrogelPackage.eNS_URI);

		// Obtain or create and register package
		MicrogelPackageImpl theMicrogelPackage = (MicrogelPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof MicrogelPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new MicrogelPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		GexpressionsPackage.eINSTANCE.eClass();
		TimeModelPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theMicrogelPackage.createPackageContents();

		// Initialize created meta-data
		theMicrogelPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theMicrogelPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(MicrogelPackage.eNS_URI, theMicrogelPackage);
		return theMicrogelPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModelSpecificEventsSpecification() {
		return modelSpecificEventsSpecificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModelSpecificEventsSpecification_Events() {
		return (EReference)modelSpecificEventsSpecificationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModelSpecificEventsSpecification_Imports() {
		return (EReference)modelSpecificEventsSpecificationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImportStatement() {
		return importStatementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImportStatement_ImportURI() {
		return (EAttribute)importStatementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModelSpecificEvent() {
		return modelSpecificEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModelSpecificEvent_Name() {
		return (EAttribute)modelSpecificEventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModelSpecificEvent_Visibility() {
		return (EAttribute)modelSpecificEventEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAtomicModelSpecificEvent() {
		return atomicModelSpecificEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAtomicModelSpecificEvent_UponMoccEventInstance() {
		return (EReference)atomicModelSpecificEventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAtomicModelSpecificEvent_ExecutionFunction() {
		return (EReference)atomicModelSpecificEventEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAtomicModelSpecificEvent_FeedbackPolicy() {
		return (EReference)atomicModelSpecificEventEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAtomicModelSpecificEvent_Target() {
		return (EReference)atomicModelSpecificEventEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAtomicModelSpecificEvent_RaisedMoccEventInstance() {
		return (EReference)atomicModelSpecificEventEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAtomicModelSpecificEvent_ExecutionKind() {
		return (EAttribute)atomicModelSpecificEventEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCompositeModelSpecificEvent() {
		return compositeModelSpecificEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompositeModelSpecificEvent_Body() {
		return (EReference)compositeModelSpecificEventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompositeModelSpecificEvent_Targets() {
		return (EReference)compositeModelSpecificEventEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModelSpecificEventsPattern() {
		return modelSpecificEventsPatternEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUnaryPattern() {
		return unaryPatternEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUnaryPattern_Operand() {
		return (EReference)unaryPatternEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBinaryPattern() {
		return binaryPatternEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBinaryPattern_LeftOperand() {
		return (EReference)binaryPatternEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBinaryPattern_RightOperand() {
		return (EReference)binaryPatternEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCoincidencePattern() {
		return coincidencePatternEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLogicalSequence() {
		return logicalSequenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOrPattern() {
		return orPatternEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getXorPattern() {
		return xorPatternEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPlusPattern() {
		return plusPatternEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIterationPattern() {
		return iterationPatternEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIterationPattern_NumberOfIterations() {
		return (EAttribute)iterationPatternEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModelSpecificEventReference() {
		return modelSpecificEventReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModelSpecificEventReference_ReferencedMse() {
		return (EReference)modelSpecificEventReferenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFeedbackPolicy() {
		return feedbackPolicyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFeedbackPolicy_Rules() {
		return (EReference)feedbackPolicyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFeedbackPolicy_DefaultRule() {
		return (EReference)feedbackPolicyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFeedbackRule() {
		return feedbackRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFeedbackRule_Filter() {
		return (EReference)feedbackRuleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFeedbackRule_Consequence() {
		return (EReference)feedbackRuleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFeedbackFilter() {
		return feedbackFilterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFeedbackFilter_Body() {
		return (EReference)feedbackFilterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFeedbackConsequence() {
		return feedbackConsequenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFeedbackConsequence_Target() {
		return (EReference)feedbackConsequenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMoccEventInstance() {
		return moccEventInstanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCcslClock() {
		return ccslClockEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCcslClock_ReferencedClock() {
		return (EReference)ccslClockEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExecutionFunctionResult() {
		return executionFunctionResultEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExecutionFunctionResult_Name() {
		return (EAttribute)executionFunctionResultEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExecutionFunction() {
		return executionFunctionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExecutionFunction_Result() {
		return (EReference)executionFunctionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExecutionFunction_CallKind() {
		return (EAttribute)executionFunctionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getKermeta3ExecutionFunction() {
		return kermeta3ExecutionFunctionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getKermeta3ExecutionFunction_Operation() {
		return (EReference)kermeta3ExecutionFunctionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getKermeta3ExecutionFunction_Target() {
		return (EReference)kermeta3ExecutionFunctionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getVisibility() {
		return visibilityEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getExecutionKind() {
		return executionKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getCallKind() {
		return callKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MicrogelFactory getMicrogelFactory() {
		return (MicrogelFactory)getEFactoryInstance();
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
		modelSpecificEventsSpecificationEClass = createEClass(MODEL_SPECIFIC_EVENTS_SPECIFICATION);
		createEReference(modelSpecificEventsSpecificationEClass, MODEL_SPECIFIC_EVENTS_SPECIFICATION__EVENTS);
		createEReference(modelSpecificEventsSpecificationEClass, MODEL_SPECIFIC_EVENTS_SPECIFICATION__IMPORTS);

		importStatementEClass = createEClass(IMPORT_STATEMENT);
		createEAttribute(importStatementEClass, IMPORT_STATEMENT__IMPORT_URI);

		modelSpecificEventEClass = createEClass(MODEL_SPECIFIC_EVENT);
		createEAttribute(modelSpecificEventEClass, MODEL_SPECIFIC_EVENT__NAME);
		createEAttribute(modelSpecificEventEClass, MODEL_SPECIFIC_EVENT__VISIBILITY);

		atomicModelSpecificEventEClass = createEClass(ATOMIC_MODEL_SPECIFIC_EVENT);
		createEReference(atomicModelSpecificEventEClass, ATOMIC_MODEL_SPECIFIC_EVENT__UPON_MOCC_EVENT_INSTANCE);
		createEReference(atomicModelSpecificEventEClass, ATOMIC_MODEL_SPECIFIC_EVENT__EXECUTION_FUNCTION);
		createEReference(atomicModelSpecificEventEClass, ATOMIC_MODEL_SPECIFIC_EVENT__FEEDBACK_POLICY);
		createEReference(atomicModelSpecificEventEClass, ATOMIC_MODEL_SPECIFIC_EVENT__TARGET);
		createEReference(atomicModelSpecificEventEClass, ATOMIC_MODEL_SPECIFIC_EVENT__RAISED_MOCC_EVENT_INSTANCE);
		createEAttribute(atomicModelSpecificEventEClass, ATOMIC_MODEL_SPECIFIC_EVENT__EXECUTION_KIND);

		compositeModelSpecificEventEClass = createEClass(COMPOSITE_MODEL_SPECIFIC_EVENT);
		createEReference(compositeModelSpecificEventEClass, COMPOSITE_MODEL_SPECIFIC_EVENT__BODY);
		createEReference(compositeModelSpecificEventEClass, COMPOSITE_MODEL_SPECIFIC_EVENT__TARGETS);

		modelSpecificEventsPatternEClass = createEClass(MODEL_SPECIFIC_EVENTS_PATTERN);

		unaryPatternEClass = createEClass(UNARY_PATTERN);
		createEReference(unaryPatternEClass, UNARY_PATTERN__OPERAND);

		binaryPatternEClass = createEClass(BINARY_PATTERN);
		createEReference(binaryPatternEClass, BINARY_PATTERN__LEFT_OPERAND);
		createEReference(binaryPatternEClass, BINARY_PATTERN__RIGHT_OPERAND);

		coincidencePatternEClass = createEClass(COINCIDENCE_PATTERN);

		logicalSequenceEClass = createEClass(LOGICAL_SEQUENCE);

		orPatternEClass = createEClass(OR_PATTERN);

		xorPatternEClass = createEClass(XOR_PATTERN);

		plusPatternEClass = createEClass(PLUS_PATTERN);

		iterationPatternEClass = createEClass(ITERATION_PATTERN);
		createEAttribute(iterationPatternEClass, ITERATION_PATTERN__NUMBER_OF_ITERATIONS);

		modelSpecificEventReferenceEClass = createEClass(MODEL_SPECIFIC_EVENT_REFERENCE);
		createEReference(modelSpecificEventReferenceEClass, MODEL_SPECIFIC_EVENT_REFERENCE__REFERENCED_MSE);

		feedbackPolicyEClass = createEClass(FEEDBACK_POLICY);
		createEReference(feedbackPolicyEClass, FEEDBACK_POLICY__RULES);
		createEReference(feedbackPolicyEClass, FEEDBACK_POLICY__DEFAULT_RULE);

		feedbackRuleEClass = createEClass(FEEDBACK_RULE);
		createEReference(feedbackRuleEClass, FEEDBACK_RULE__FILTER);
		createEReference(feedbackRuleEClass, FEEDBACK_RULE__CONSEQUENCE);

		feedbackFilterEClass = createEClass(FEEDBACK_FILTER);
		createEReference(feedbackFilterEClass, FEEDBACK_FILTER__BODY);

		feedbackConsequenceEClass = createEClass(FEEDBACK_CONSEQUENCE);
		createEReference(feedbackConsequenceEClass, FEEDBACK_CONSEQUENCE__TARGET);

		moccEventInstanceEClass = createEClass(MOCC_EVENT_INSTANCE);

		ccslClockEClass = createEClass(CCSL_CLOCK);
		createEReference(ccslClockEClass, CCSL_CLOCK__REFERENCED_CLOCK);

		executionFunctionResultEClass = createEClass(EXECUTION_FUNCTION_RESULT);
		createEAttribute(executionFunctionResultEClass, EXECUTION_FUNCTION_RESULT__NAME);

		executionFunctionEClass = createEClass(EXECUTION_FUNCTION);
		createEReference(executionFunctionEClass, EXECUTION_FUNCTION__RESULT);
		createEAttribute(executionFunctionEClass, EXECUTION_FUNCTION__CALL_KIND);

		kermeta3ExecutionFunctionEClass = createEClass(KERMETA3_EXECUTION_FUNCTION);
		createEReference(kermeta3ExecutionFunctionEClass, KERMETA3_EXECUTION_FUNCTION__OPERATION);
		createEReference(kermeta3ExecutionFunctionEClass, KERMETA3_EXECUTION_FUNCTION__TARGET);

		// Create enums
		visibilityEEnum = createEEnum(VISIBILITY);
		executionKindEEnum = createEEnum(EXECUTION_KIND);
		callKindEEnum = createEEnum(CALL_KIND);
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
		GexpressionsPackage theGexpressionsPackage = (GexpressionsPackage)EPackage.Registry.INSTANCE.getEPackage(GexpressionsPackage.eNS_URI);
		TimeModelPackage theTimeModelPackage = (TimeModelPackage)EPackage.Registry.INSTANCE.getEPackage(TimeModelPackage.eNS_URI);
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		atomicModelSpecificEventEClass.getESuperTypes().add(this.getModelSpecificEvent());
		compositeModelSpecificEventEClass.getESuperTypes().add(this.getModelSpecificEvent());
		unaryPatternEClass.getESuperTypes().add(this.getModelSpecificEventsPattern());
		binaryPatternEClass.getESuperTypes().add(this.getModelSpecificEventsPattern());
		coincidencePatternEClass.getESuperTypes().add(this.getBinaryPattern());
		logicalSequenceEClass.getESuperTypes().add(this.getBinaryPattern());
		orPatternEClass.getESuperTypes().add(this.getBinaryPattern());
		xorPatternEClass.getESuperTypes().add(this.getBinaryPattern());
		plusPatternEClass.getESuperTypes().add(this.getUnaryPattern());
		iterationPatternEClass.getESuperTypes().add(this.getUnaryPattern());
		modelSpecificEventReferenceEClass.getESuperTypes().add(this.getModelSpecificEventsPattern());
		ccslClockEClass.getESuperTypes().add(this.getMoccEventInstance());
		kermeta3ExecutionFunctionEClass.getESuperTypes().add(this.getExecutionFunction());

		// Initialize classes, features, and operations; add parameters
		initEClass(modelSpecificEventsSpecificationEClass, ModelSpecificEventsSpecification.class, "ModelSpecificEventsSpecification", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getModelSpecificEventsSpecification_Events(), this.getModelSpecificEvent(), null, "events", null, 0, -1, ModelSpecificEventsSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModelSpecificEventsSpecification_Imports(), this.getImportStatement(), null, "imports", null, 0, -1, ModelSpecificEventsSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(importStatementEClass, ImportStatement.class, "ImportStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getImportStatement_ImportURI(), ecorePackage.getEString(), "importURI", null, 1, 1, ImportStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(modelSpecificEventEClass, ModelSpecificEvent.class, "ModelSpecificEvent", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getModelSpecificEvent_Name(), ecorePackage.getEString(), "name", null, 1, 1, ModelSpecificEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModelSpecificEvent_Visibility(), this.getVisibility(), "visibility", null, 1, 1, ModelSpecificEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(atomicModelSpecificEventEClass, AtomicModelSpecificEvent.class, "AtomicModelSpecificEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAtomicModelSpecificEvent_UponMoccEventInstance(), this.getMoccEventInstance(), null, "uponMoccEventInstance", null, 1, 1, AtomicModelSpecificEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAtomicModelSpecificEvent_ExecutionFunction(), this.getExecutionFunction(), null, "executionFunction", null, 0, 1, AtomicModelSpecificEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAtomicModelSpecificEvent_FeedbackPolicy(), this.getFeedbackPolicy(), null, "feedbackPolicy", null, 0, 1, AtomicModelSpecificEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAtomicModelSpecificEvent_Target(), ecorePackage.getEObject(), null, "target", null, 1, 1, AtomicModelSpecificEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAtomicModelSpecificEvent_RaisedMoccEventInstance(), this.getMoccEventInstance(), null, "raisedMoccEventInstance", null, 0, 1, AtomicModelSpecificEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAtomicModelSpecificEvent_ExecutionKind(), this.getExecutionKind(), "executionKind", null, 0, 1, AtomicModelSpecificEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(compositeModelSpecificEventEClass, CompositeModelSpecificEvent.class, "CompositeModelSpecificEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCompositeModelSpecificEvent_Body(), this.getModelSpecificEventsPattern(), null, "body", null, 1, 1, CompositeModelSpecificEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCompositeModelSpecificEvent_Targets(), ecorePackage.getEObject(), null, "targets", null, 1, -1, CompositeModelSpecificEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(modelSpecificEventsPatternEClass, ModelSpecificEventsPattern.class, "ModelSpecificEventsPattern", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(unaryPatternEClass, UnaryPattern.class, "UnaryPattern", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUnaryPattern_Operand(), this.getModelSpecificEventsPattern(), null, "operand", null, 1, 1, UnaryPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(binaryPatternEClass, BinaryPattern.class, "BinaryPattern", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBinaryPattern_LeftOperand(), this.getModelSpecificEventsPattern(), null, "leftOperand", null, 1, 1, BinaryPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBinaryPattern_RightOperand(), this.getModelSpecificEventsPattern(), null, "rightOperand", null, 1, 1, BinaryPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(coincidencePatternEClass, CoincidencePattern.class, "CoincidencePattern", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(logicalSequenceEClass, LogicalSequence.class, "LogicalSequence", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(orPatternEClass, OrPattern.class, "OrPattern", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(xorPatternEClass, XorPattern.class, "XorPattern", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(plusPatternEClass, PlusPattern.class, "PlusPattern", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(iterationPatternEClass, IterationPattern.class, "IterationPattern", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIterationPattern_NumberOfIterations(), ecorePackage.getEIntegerObject(), "numberOfIterations", null, 1, 1, IterationPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(modelSpecificEventReferenceEClass, ModelSpecificEventReference.class, "ModelSpecificEventReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getModelSpecificEventReference_ReferencedMse(), this.getModelSpecificEvent(), null, "referencedMse", null, 1, 1, ModelSpecificEventReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(feedbackPolicyEClass, FeedbackPolicy.class, "FeedbackPolicy", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFeedbackPolicy_Rules(), this.getFeedbackRule(), null, "rules", null, 0, -1, FeedbackPolicy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFeedbackPolicy_DefaultRule(), this.getFeedbackRule(), null, "defaultRule", null, 1, 1, FeedbackPolicy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(feedbackRuleEClass, FeedbackRule.class, "FeedbackRule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFeedbackRule_Filter(), this.getFeedbackFilter(), null, "filter", null, 0, 1, FeedbackRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFeedbackRule_Consequence(), this.getFeedbackConsequence(), null, "consequence", null, 1, 1, FeedbackRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(feedbackFilterEClass, FeedbackFilter.class, "FeedbackFilter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFeedbackFilter_Body(), theGexpressionsPackage.getGExpression(), null, "body", null, 1, 1, FeedbackFilter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(feedbackConsequenceEClass, FeedbackConsequence.class, "FeedbackConsequence", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFeedbackConsequence_Target(), this.getMoccEventInstance(), null, "target", null, 0, 1, FeedbackConsequence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(moccEventInstanceEClass, MoccEventInstance.class, "MoccEventInstance", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(ccslClockEClass, CcslClock.class, "CcslClock", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCcslClock_ReferencedClock(), theTimeModelPackage.getClock(), null, "referencedClock", null, 1, 1, CcslClock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(executionFunctionResultEClass, ExecutionFunctionResult.class, "ExecutionFunctionResult", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getExecutionFunctionResult_Name(), ecorePackage.getEString(), "name", null, 1, 1, ExecutionFunctionResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(executionFunctionEClass, ExecutionFunction.class, "ExecutionFunction", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExecutionFunction_Result(), this.getExecutionFunctionResult(), null, "result", null, 0, 1, ExecutionFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExecutionFunction_CallKind(), this.getCallKind(), "callKind", null, 1, 1, ExecutionFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(kermeta3ExecutionFunctionEClass, Kermeta3ExecutionFunction.class, "Kermeta3ExecutionFunction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getKermeta3ExecutionFunction_Operation(), theEcorePackage.getEOperation(), null, "operation", null, 1, 1, Kermeta3ExecutionFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getKermeta3ExecutionFunction_Target(), theEcorePackage.getEObject(), null, "target", null, 1, 1, Kermeta3ExecutionFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(visibilityEEnum, Visibility.class, "Visibility");
		addEEnumLiteral(visibilityEEnum, Visibility.PUBLIC);
		addEEnumLiteral(visibilityEEnum, Visibility.PRIVATE);

		initEEnum(executionKindEEnum, ExecutionKind.class, "ExecutionKind");
		addEEnumLiteral(executionKindEEnum, ExecutionKind.SUBMISSION);
		addEEnumLiteral(executionKindEEnum, ExecutionKind.INTERRUPTION);

		initEEnum(callKindEEnum, CallKind.class, "CallKind");
		addEEnumLiteral(callKindEEnum, CallKind.BLOCKING);
		addEEnumLiteral(callKindEEnum, CallKind.NON_BLOCKING);

		// Create resource
		createResource(eNS_URI);
	}

} //MicrogelPackageImpl
