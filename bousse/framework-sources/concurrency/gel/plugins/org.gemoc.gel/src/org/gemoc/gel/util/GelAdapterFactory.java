/**
 */
package org.gemoc.gel.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;
import org.gemoc.gel.AtomicDomainSpecificEvent;
import org.gemoc.gel.BinaryPattern;
import org.gemoc.gel.CoincidencePattern;
import org.gemoc.gel.CompositeDomainSpecificEvent;
import org.gemoc.gel.DomainSpecificEvent;
import org.gemoc.gel.DomainSpecificEventReference;
import org.gemoc.gel.DomainSpecificEventReferenceWithArguments;
import org.gemoc.gel.DomainSpecificEventsPattern;
import org.gemoc.gel.DomainSpecificEventsSpecification;
import org.gemoc.gel.EclEvent;
import org.gemoc.gel.ExecutionFunction;
import org.gemoc.gel.ExecutionFunctionResult;
import org.gemoc.gel.FeedbackConsequence;
import org.gemoc.gel.FeedbackFilter;
import org.gemoc.gel.FeedbackPolicy;
import org.gemoc.gel.FeedbackRule;
import org.gemoc.gel.GelPackage;
import org.gemoc.gel.ImportStatement;
import org.gemoc.gel.InstantiationPredicate;
import org.gemoc.gel.IterationPattern;
import org.gemoc.gel.Kermeta3ExecutionFunction;
import org.gemoc.gel.ListOfArguments;
import org.gemoc.gel.LocalVariable;
import org.gemoc.gel.LogicalSequence;
import org.gemoc.gel.MoccEvent;
import org.gemoc.gel.MultipleArguments;
import org.gemoc.gel.OrPattern;
import org.gemoc.gel.PlusPattern;
import org.gemoc.gel.SingleArgument;
import org.gemoc.gel.UnaryPattern;
import org.gemoc.gel.UnfoldingStrategy;
import org.gemoc.gel.XorPattern;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.gemoc.gel.GelPackage
 * @generated
 */
public class GelAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static GelPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GelAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = GelPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GelSwitch<Adapter> modelSwitch =
		new GelSwitch<Adapter>() {
			@Override
			public Adapter caseDomainSpecificEventsSpecification(DomainSpecificEventsSpecification object) {
				return createDomainSpecificEventsSpecificationAdapter();
			}
			@Override
			public Adapter caseImportStatement(ImportStatement object) {
				return createImportStatementAdapter();
			}
			@Override
			public Adapter caseDomainSpecificEvent(DomainSpecificEvent object) {
				return createDomainSpecificEventAdapter();
			}
			@Override
			public Adapter caseAtomicDomainSpecificEvent(AtomicDomainSpecificEvent object) {
				return createAtomicDomainSpecificEventAdapter();
			}
			@Override
			public Adapter caseCompositeDomainSpecificEvent(CompositeDomainSpecificEvent object) {
				return createCompositeDomainSpecificEventAdapter();
			}
			@Override
			public Adapter caseUnfoldingStrategy(UnfoldingStrategy object) {
				return createUnfoldingStrategyAdapter();
			}
			@Override
			public Adapter caseLocalVariable(LocalVariable object) {
				return createLocalVariableAdapter();
			}
			@Override
			public Adapter caseInstantiationPredicate(InstantiationPredicate object) {
				return createInstantiationPredicateAdapter();
			}
			@Override
			public Adapter caseDomainSpecificEventsPattern(DomainSpecificEventsPattern object) {
				return createDomainSpecificEventsPatternAdapter();
			}
			@Override
			public Adapter caseUnaryPattern(UnaryPattern object) {
				return createUnaryPatternAdapter();
			}
			@Override
			public Adapter caseBinaryPattern(BinaryPattern object) {
				return createBinaryPatternAdapter();
			}
			@Override
			public Adapter caseCoincidencePattern(CoincidencePattern object) {
				return createCoincidencePatternAdapter();
			}
			@Override
			public Adapter caseLogicalSequence(LogicalSequence object) {
				return createLogicalSequenceAdapter();
			}
			@Override
			public Adapter caseOrPattern(OrPattern object) {
				return createOrPatternAdapter();
			}
			@Override
			public Adapter caseXorPattern(XorPattern object) {
				return createXorPatternAdapter();
			}
			@Override
			public Adapter casePlusPattern(PlusPattern object) {
				return createPlusPatternAdapter();
			}
			@Override
			public Adapter caseIterationPattern(IterationPattern object) {
				return createIterationPatternAdapter();
			}
			@Override
			public Adapter caseDomainSpecificEventReference(DomainSpecificEventReference object) {
				return createDomainSpecificEventReferenceAdapter();
			}
			@Override
			public Adapter caseDomainSpecificEventReferenceWithArguments(DomainSpecificEventReferenceWithArguments object) {
				return createDomainSpecificEventReferenceWithArgumentsAdapter();
			}
			@Override
			public Adapter caseListOfArguments(ListOfArguments object) {
				return createListOfArgumentsAdapter();
			}
			@Override
			public Adapter caseSingleArgument(SingleArgument object) {
				return createSingleArgumentAdapter();
			}
			@Override
			public Adapter caseMultipleArguments(MultipleArguments object) {
				return createMultipleArgumentsAdapter();
			}
			@Override
			public Adapter caseFeedbackPolicy(FeedbackPolicy object) {
				return createFeedbackPolicyAdapter();
			}
			@Override
			public Adapter caseFeedbackRule(FeedbackRule object) {
				return createFeedbackRuleAdapter();
			}
			@Override
			public Adapter caseFeedbackFilter(FeedbackFilter object) {
				return createFeedbackFilterAdapter();
			}
			@Override
			public Adapter caseFeedbackConsequence(FeedbackConsequence object) {
				return createFeedbackConsequenceAdapter();
			}
			@Override
			public Adapter caseMoccEvent(MoccEvent object) {
				return createMoccEventAdapter();
			}
			@Override
			public Adapter caseEclEvent(EclEvent object) {
				return createEclEventAdapter();
			}
			@Override
			public Adapter caseExecutionFunctionResult(ExecutionFunctionResult object) {
				return createExecutionFunctionResultAdapter();
			}
			@Override
			public Adapter caseExecutionFunction(ExecutionFunction object) {
				return createExecutionFunctionAdapter();
			}
			@Override
			public Adapter caseKermeta3ExecutionFunction(Kermeta3ExecutionFunction object) {
				return createKermeta3ExecutionFunctionAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.gel.DomainSpecificEventsSpecification <em>Domain Specific Events Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.gel.DomainSpecificEventsSpecification
	 * @generated
	 */
	public Adapter createDomainSpecificEventsSpecificationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.gel.ImportStatement <em>Import Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.gel.ImportStatement
	 * @generated
	 */
	public Adapter createImportStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.gel.DomainSpecificEvent <em>Domain Specific Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.gel.DomainSpecificEvent
	 * @generated
	 */
	public Adapter createDomainSpecificEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.gel.AtomicDomainSpecificEvent <em>Atomic Domain Specific Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.gel.AtomicDomainSpecificEvent
	 * @generated
	 */
	public Adapter createAtomicDomainSpecificEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.gel.CompositeDomainSpecificEvent <em>Composite Domain Specific Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.gel.CompositeDomainSpecificEvent
	 * @generated
	 */
	public Adapter createCompositeDomainSpecificEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.gel.UnfoldingStrategy <em>Unfolding Strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.gel.UnfoldingStrategy
	 * @generated
	 */
	public Adapter createUnfoldingStrategyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.gel.LocalVariable <em>Local Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.gel.LocalVariable
	 * @generated
	 */
	public Adapter createLocalVariableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.gel.InstantiationPredicate <em>Instantiation Predicate</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.gel.InstantiationPredicate
	 * @generated
	 */
	public Adapter createInstantiationPredicateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.gel.DomainSpecificEventsPattern <em>Domain Specific Events Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.gel.DomainSpecificEventsPattern
	 * @generated
	 */
	public Adapter createDomainSpecificEventsPatternAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.gel.UnaryPattern <em>Unary Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.gel.UnaryPattern
	 * @generated
	 */
	public Adapter createUnaryPatternAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.gel.BinaryPattern <em>Binary Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.gel.BinaryPattern
	 * @generated
	 */
	public Adapter createBinaryPatternAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.gel.CoincidencePattern <em>Coincidence Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.gel.CoincidencePattern
	 * @generated
	 */
	public Adapter createCoincidencePatternAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.gel.LogicalSequence <em>Logical Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.gel.LogicalSequence
	 * @generated
	 */
	public Adapter createLogicalSequenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.gel.OrPattern <em>Or Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.gel.OrPattern
	 * @generated
	 */
	public Adapter createOrPatternAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.gel.XorPattern <em>Xor Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.gel.XorPattern
	 * @generated
	 */
	public Adapter createXorPatternAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.gel.PlusPattern <em>Plus Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.gel.PlusPattern
	 * @generated
	 */
	public Adapter createPlusPatternAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.gel.IterationPattern <em>Iteration Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.gel.IterationPattern
	 * @generated
	 */
	public Adapter createIterationPatternAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.gel.DomainSpecificEventReference <em>Domain Specific Event Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.gel.DomainSpecificEventReference
	 * @generated
	 */
	public Adapter createDomainSpecificEventReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.gel.DomainSpecificEventReferenceWithArguments <em>Domain Specific Event Reference With Arguments</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.gel.DomainSpecificEventReferenceWithArguments
	 * @generated
	 */
	public Adapter createDomainSpecificEventReferenceWithArgumentsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.gel.ListOfArguments <em>List Of Arguments</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.gel.ListOfArguments
	 * @generated
	 */
	public Adapter createListOfArgumentsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.gel.SingleArgument <em>Single Argument</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.gel.SingleArgument
	 * @generated
	 */
	public Adapter createSingleArgumentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.gel.MultipleArguments <em>Multiple Arguments</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.gel.MultipleArguments
	 * @generated
	 */
	public Adapter createMultipleArgumentsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.gel.FeedbackPolicy <em>Feedback Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.gel.FeedbackPolicy
	 * @generated
	 */
	public Adapter createFeedbackPolicyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.gel.FeedbackRule <em>Feedback Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.gel.FeedbackRule
	 * @generated
	 */
	public Adapter createFeedbackRuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.gel.FeedbackFilter <em>Feedback Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.gel.FeedbackFilter
	 * @generated
	 */
	public Adapter createFeedbackFilterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.gel.FeedbackConsequence <em>Feedback Consequence</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.gel.FeedbackConsequence
	 * @generated
	 */
	public Adapter createFeedbackConsequenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.gel.MoccEvent <em>Mocc Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.gel.MoccEvent
	 * @generated
	 */
	public Adapter createMoccEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.gel.EclEvent <em>Ecl Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.gel.EclEvent
	 * @generated
	 */
	public Adapter createEclEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.gel.ExecutionFunctionResult <em>Execution Function Result</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.gel.ExecutionFunctionResult
	 * @generated
	 */
	public Adapter createExecutionFunctionResultAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.gel.ExecutionFunction <em>Execution Function</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.gel.ExecutionFunction
	 * @generated
	 */
	public Adapter createExecutionFunctionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.gel.Kermeta3ExecutionFunction <em>Kermeta3 Execution Function</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.gel.Kermeta3ExecutionFunction
	 * @generated
	 */
	public Adapter createKermeta3ExecutionFunctionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //GelAdapterFactory
