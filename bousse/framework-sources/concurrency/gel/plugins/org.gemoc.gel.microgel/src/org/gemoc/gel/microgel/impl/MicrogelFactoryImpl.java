/**
 */
package org.gemoc.gel.microgel.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.gemoc.gel.microgel.AtomicModelSpecificEvent;
import org.gemoc.gel.microgel.CallKind;
import org.gemoc.gel.microgel.CcslClock;
import org.gemoc.gel.microgel.CoincidencePattern;
import org.gemoc.gel.microgel.CompositeModelSpecificEvent;
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
import org.gemoc.gel.microgel.ModelSpecificEventReference;
import org.gemoc.gel.microgel.ModelSpecificEventsSpecification;
import org.gemoc.gel.microgel.OrPattern;
import org.gemoc.gel.microgel.PlusPattern;
import org.gemoc.gel.microgel.Visibility;
import org.gemoc.gel.microgel.XorPattern;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MicrogelFactoryImpl extends EFactoryImpl implements MicrogelFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MicrogelFactory init() {
		try {
			MicrogelFactory theMicrogelFactory = (MicrogelFactory)EPackage.Registry.INSTANCE.getEFactory(MicrogelPackage.eNS_URI);
			if (theMicrogelFactory != null) {
				return theMicrogelFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new MicrogelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MicrogelFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case MicrogelPackage.MODEL_SPECIFIC_EVENTS_SPECIFICATION: return createModelSpecificEventsSpecification();
			case MicrogelPackage.IMPORT_STATEMENT: return createImportStatement();
			case MicrogelPackage.ATOMIC_MODEL_SPECIFIC_EVENT: return createAtomicModelSpecificEvent();
			case MicrogelPackage.COMPOSITE_MODEL_SPECIFIC_EVENT: return createCompositeModelSpecificEvent();
			case MicrogelPackage.COINCIDENCE_PATTERN: return createCoincidencePattern();
			case MicrogelPackage.LOGICAL_SEQUENCE: return createLogicalSequence();
			case MicrogelPackage.OR_PATTERN: return createOrPattern();
			case MicrogelPackage.XOR_PATTERN: return createXorPattern();
			case MicrogelPackage.PLUS_PATTERN: return createPlusPattern();
			case MicrogelPackage.ITERATION_PATTERN: return createIterationPattern();
			case MicrogelPackage.MODEL_SPECIFIC_EVENT_REFERENCE: return createModelSpecificEventReference();
			case MicrogelPackage.FEEDBACK_POLICY: return createFeedbackPolicy();
			case MicrogelPackage.FEEDBACK_RULE: return createFeedbackRule();
			case MicrogelPackage.FEEDBACK_FILTER: return createFeedbackFilter();
			case MicrogelPackage.FEEDBACK_CONSEQUENCE: return createFeedbackConsequence();
			case MicrogelPackage.CCSL_CLOCK: return createCcslClock();
			case MicrogelPackage.EXECUTION_FUNCTION_RESULT: return createExecutionFunctionResult();
			case MicrogelPackage.KERMETA3_EXECUTION_FUNCTION: return createKermeta3ExecutionFunction();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case MicrogelPackage.VISIBILITY:
				return createVisibilityFromString(eDataType, initialValue);
			case MicrogelPackage.EXECUTION_KIND:
				return createExecutionKindFromString(eDataType, initialValue);
			case MicrogelPackage.CALL_KIND:
				return createCallKindFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case MicrogelPackage.VISIBILITY:
				return convertVisibilityToString(eDataType, instanceValue);
			case MicrogelPackage.EXECUTION_KIND:
				return convertExecutionKindToString(eDataType, instanceValue);
			case MicrogelPackage.CALL_KIND:
				return convertCallKindToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelSpecificEventsSpecification createModelSpecificEventsSpecification() {
		ModelSpecificEventsSpecificationImpl modelSpecificEventsSpecification = new ModelSpecificEventsSpecificationImpl();
		return modelSpecificEventsSpecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImportStatement createImportStatement() {
		ImportStatementImpl importStatement = new ImportStatementImpl();
		return importStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AtomicModelSpecificEvent createAtomicModelSpecificEvent() {
		AtomicModelSpecificEventImpl atomicModelSpecificEvent = new AtomicModelSpecificEventImpl();
		return atomicModelSpecificEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositeModelSpecificEvent createCompositeModelSpecificEvent() {
		CompositeModelSpecificEventImpl compositeModelSpecificEvent = new CompositeModelSpecificEventImpl();
		return compositeModelSpecificEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoincidencePattern createCoincidencePattern() {
		CoincidencePatternImpl coincidencePattern = new CoincidencePatternImpl();
		return coincidencePattern;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogicalSequence createLogicalSequence() {
		LogicalSequenceImpl logicalSequence = new LogicalSequenceImpl();
		return logicalSequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrPattern createOrPattern() {
		OrPatternImpl orPattern = new OrPatternImpl();
		return orPattern;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XorPattern createXorPattern() {
		XorPatternImpl xorPattern = new XorPatternImpl();
		return xorPattern;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlusPattern createPlusPattern() {
		PlusPatternImpl plusPattern = new PlusPatternImpl();
		return plusPattern;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IterationPattern createIterationPattern() {
		IterationPatternImpl iterationPattern = new IterationPatternImpl();
		return iterationPattern;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelSpecificEventReference createModelSpecificEventReference() {
		ModelSpecificEventReferenceImpl modelSpecificEventReference = new ModelSpecificEventReferenceImpl();
		return modelSpecificEventReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeedbackPolicy createFeedbackPolicy() {
		FeedbackPolicyImpl feedbackPolicy = new FeedbackPolicyImpl();
		return feedbackPolicy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeedbackRule createFeedbackRule() {
		FeedbackRuleImpl feedbackRule = new FeedbackRuleImpl();
		return feedbackRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeedbackFilter createFeedbackFilter() {
		FeedbackFilterImpl feedbackFilter = new FeedbackFilterImpl();
		return feedbackFilter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeedbackConsequence createFeedbackConsequence() {
		FeedbackConsequenceImpl feedbackConsequence = new FeedbackConsequenceImpl();
		return feedbackConsequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CcslClock createCcslClock() {
		CcslClockImpl ccslClock = new CcslClockImpl();
		return ccslClock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExecutionFunctionResult createExecutionFunctionResult() {
		ExecutionFunctionResultImpl executionFunctionResult = new ExecutionFunctionResultImpl();
		return executionFunctionResult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Kermeta3ExecutionFunction createKermeta3ExecutionFunction() {
		Kermeta3ExecutionFunctionImpl kermeta3ExecutionFunction = new Kermeta3ExecutionFunctionImpl();
		return kermeta3ExecutionFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Visibility createVisibilityFromString(EDataType eDataType, String initialValue) {
		Visibility result = Visibility.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertVisibilityToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExecutionKind createExecutionKindFromString(EDataType eDataType, String initialValue) {
		ExecutionKind result = ExecutionKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertExecutionKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CallKind createCallKindFromString(EDataType eDataType, String initialValue) {
		CallKind result = CallKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCallKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MicrogelPackage getMicrogelPackage() {
		return (MicrogelPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static MicrogelPackage getPackage() {
		return MicrogelPackage.eINSTANCE;
	}

} //MicrogelFactoryImpl
