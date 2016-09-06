/**
 */
package org.gemoc.gel.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.gemoc.gel.AtomicDomainSpecificEvent;
import org.gemoc.gel.CallKind;
import org.gemoc.gel.CoincidencePattern;
import org.gemoc.gel.CompositeDomainSpecificEvent;
import org.gemoc.gel.DomainSpecificEventReference;
import org.gemoc.gel.DomainSpecificEventReferenceWithArguments;
import org.gemoc.gel.DomainSpecificEventsSpecification;
import org.gemoc.gel.EclEvent;
import org.gemoc.gel.ExecutionFunctionResult;
import org.gemoc.gel.ExecutionKind;
import org.gemoc.gel.FeedbackConsequence;
import org.gemoc.gel.FeedbackFilter;
import org.gemoc.gel.FeedbackPolicy;
import org.gemoc.gel.FeedbackRule;
import org.gemoc.gel.GelFactory;
import org.gemoc.gel.GelPackage;
import org.gemoc.gel.ImportStatement;
import org.gemoc.gel.InstantiationPredicate;
import org.gemoc.gel.IterationPattern;
import org.gemoc.gel.Kermeta3ExecutionFunction;
import org.gemoc.gel.LocalVariable;
import org.gemoc.gel.LogicalSequence;
import org.gemoc.gel.MultipleArguments;
import org.gemoc.gel.OrPattern;
import org.gemoc.gel.PlusPattern;
import org.gemoc.gel.SingleArgument;
import org.gemoc.gel.UnfoldingStrategy;
import org.gemoc.gel.Visibility;
import org.gemoc.gel.XorPattern;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class GelFactoryImpl extends EFactoryImpl implements GelFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static GelFactory init() {
		try {
			GelFactory theGelFactory = (GelFactory)EPackage.Registry.INSTANCE.getEFactory(GelPackage.eNS_URI);
			if (theGelFactory != null) {
				return theGelFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new GelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GelFactoryImpl() {
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
			case GelPackage.DOMAIN_SPECIFIC_EVENTS_SPECIFICATION: return createDomainSpecificEventsSpecification();
			case GelPackage.IMPORT_STATEMENT: return createImportStatement();
			case GelPackage.ATOMIC_DOMAIN_SPECIFIC_EVENT: return createAtomicDomainSpecificEvent();
			case GelPackage.COMPOSITE_DOMAIN_SPECIFIC_EVENT: return createCompositeDomainSpecificEvent();
			case GelPackage.UNFOLDING_STRATEGY: return createUnfoldingStrategy();
			case GelPackage.LOCAL_VARIABLE: return createLocalVariable();
			case GelPackage.INSTANTIATION_PREDICATE: return createInstantiationPredicate();
			case GelPackage.COINCIDENCE_PATTERN: return createCoincidencePattern();
			case GelPackage.LOGICAL_SEQUENCE: return createLogicalSequence();
			case GelPackage.OR_PATTERN: return createOrPattern();
			case GelPackage.XOR_PATTERN: return createXorPattern();
			case GelPackage.PLUS_PATTERN: return createPlusPattern();
			case GelPackage.ITERATION_PATTERN: return createIterationPattern();
			case GelPackage.DOMAIN_SPECIFIC_EVENT_REFERENCE: return createDomainSpecificEventReference();
			case GelPackage.DOMAIN_SPECIFIC_EVENT_REFERENCE_WITH_ARGUMENTS: return createDomainSpecificEventReferenceWithArguments();
			case GelPackage.SINGLE_ARGUMENT: return createSingleArgument();
			case GelPackage.MULTIPLE_ARGUMENTS: return createMultipleArguments();
			case GelPackage.FEEDBACK_POLICY: return createFeedbackPolicy();
			case GelPackage.FEEDBACK_RULE: return createFeedbackRule();
			case GelPackage.FEEDBACK_FILTER: return createFeedbackFilter();
			case GelPackage.FEEDBACK_CONSEQUENCE: return createFeedbackConsequence();
			case GelPackage.ECL_EVENT: return createEclEvent();
			case GelPackage.EXECUTION_FUNCTION_RESULT: return createExecutionFunctionResult();
			case GelPackage.KERMETA3_EXECUTION_FUNCTION: return createKermeta3ExecutionFunction();
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
			case GelPackage.VISIBILITY:
				return createVisibilityFromString(eDataType, initialValue);
			case GelPackage.EXECUTION_KIND:
				return createExecutionKindFromString(eDataType, initialValue);
			case GelPackage.CALL_KIND:
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
			case GelPackage.VISIBILITY:
				return convertVisibilityToString(eDataType, instanceValue);
			case GelPackage.EXECUTION_KIND:
				return convertExecutionKindToString(eDataType, instanceValue);
			case GelPackage.CALL_KIND:
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
	public DomainSpecificEventsSpecification createDomainSpecificEventsSpecification() {
		DomainSpecificEventsSpecificationImpl domainSpecificEventsSpecification = new DomainSpecificEventsSpecificationImpl();
		return domainSpecificEventsSpecification;
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
	public AtomicDomainSpecificEvent createAtomicDomainSpecificEvent() {
		AtomicDomainSpecificEventImpl atomicDomainSpecificEvent = new AtomicDomainSpecificEventImpl();
		return atomicDomainSpecificEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositeDomainSpecificEvent createCompositeDomainSpecificEvent() {
		CompositeDomainSpecificEventImpl compositeDomainSpecificEvent = new CompositeDomainSpecificEventImpl();
		return compositeDomainSpecificEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnfoldingStrategy createUnfoldingStrategy() {
		UnfoldingStrategyImpl unfoldingStrategy = new UnfoldingStrategyImpl();
		return unfoldingStrategy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocalVariable createLocalVariable() {
		LocalVariableImpl localVariable = new LocalVariableImpl();
		return localVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InstantiationPredicate createInstantiationPredicate() {
		InstantiationPredicateImpl instantiationPredicate = new InstantiationPredicateImpl();
		return instantiationPredicate;
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
	public DomainSpecificEventReference createDomainSpecificEventReference() {
		DomainSpecificEventReferenceImpl domainSpecificEventReference = new DomainSpecificEventReferenceImpl();
		return domainSpecificEventReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DomainSpecificEventReferenceWithArguments createDomainSpecificEventReferenceWithArguments() {
		DomainSpecificEventReferenceWithArgumentsImpl domainSpecificEventReferenceWithArguments = new DomainSpecificEventReferenceWithArgumentsImpl();
		return domainSpecificEventReferenceWithArguments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SingleArgument createSingleArgument() {
		SingleArgumentImpl singleArgument = new SingleArgumentImpl();
		return singleArgument;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MultipleArguments createMultipleArguments() {
		MultipleArgumentsImpl multipleArguments = new MultipleArgumentsImpl();
		return multipleArguments;
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
	public EclEvent createEclEvent() {
		EclEventImpl eclEvent = new EclEventImpl();
		return eclEvent;
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
	public GelPackage getGelPackage() {
		return (GelPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static GelPackage getPackage() {
		return GelPackage.eINSTANCE;
	}

} //GelFactoryImpl
