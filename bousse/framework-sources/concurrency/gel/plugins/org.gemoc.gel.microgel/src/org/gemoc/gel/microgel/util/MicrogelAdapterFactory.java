/**
 */
package org.gemoc.gel.microgel.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;
import org.gemoc.gel.microgel.AtomicModelSpecificEvent;
import org.gemoc.gel.microgel.BinaryPattern;
import org.gemoc.gel.microgel.CcslClock;
import org.gemoc.gel.microgel.CoincidencePattern;
import org.gemoc.gel.microgel.CompositeModelSpecificEvent;
import org.gemoc.gel.microgel.ExecutionFunction;
import org.gemoc.gel.microgel.ExecutionFunctionResult;
import org.gemoc.gel.microgel.FeedbackConsequence;
import org.gemoc.gel.microgel.FeedbackFilter;
import org.gemoc.gel.microgel.FeedbackPolicy;
import org.gemoc.gel.microgel.FeedbackRule;
import org.gemoc.gel.microgel.ImportStatement;
import org.gemoc.gel.microgel.IterationPattern;
import org.gemoc.gel.microgel.Kermeta3ExecutionFunction;
import org.gemoc.gel.microgel.LogicalSequence;
import org.gemoc.gel.microgel.MicrogelPackage;
import org.gemoc.gel.microgel.MoccEventInstance;
import org.gemoc.gel.microgel.ModelSpecificEvent;
import org.gemoc.gel.microgel.ModelSpecificEventReference;
import org.gemoc.gel.microgel.ModelSpecificEventsPattern;
import org.gemoc.gel.microgel.ModelSpecificEventsSpecification;
import org.gemoc.gel.microgel.OrPattern;
import org.gemoc.gel.microgel.PlusPattern;
import org.gemoc.gel.microgel.UnaryPattern;
import org.gemoc.gel.microgel.XorPattern;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.gemoc.gel.microgel.MicrogelPackage
 * @generated
 */
public class MicrogelAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static MicrogelPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MicrogelAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = MicrogelPackage.eINSTANCE;
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
	protected MicrogelSwitch<Adapter> modelSwitch =
		new MicrogelSwitch<Adapter>() {
			@Override
			public Adapter caseModelSpecificEventsSpecification(ModelSpecificEventsSpecification object) {
				return createModelSpecificEventsSpecificationAdapter();
			}
			@Override
			public Adapter caseImportStatement(ImportStatement object) {
				return createImportStatementAdapter();
			}
			@Override
			public Adapter caseModelSpecificEvent(ModelSpecificEvent object) {
				return createModelSpecificEventAdapter();
			}
			@Override
			public Adapter caseAtomicModelSpecificEvent(AtomicModelSpecificEvent object) {
				return createAtomicModelSpecificEventAdapter();
			}
			@Override
			public Adapter caseCompositeModelSpecificEvent(CompositeModelSpecificEvent object) {
				return createCompositeModelSpecificEventAdapter();
			}
			@Override
			public Adapter caseModelSpecificEventsPattern(ModelSpecificEventsPattern object) {
				return createModelSpecificEventsPatternAdapter();
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
			public Adapter caseModelSpecificEventReference(ModelSpecificEventReference object) {
				return createModelSpecificEventReferenceAdapter();
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
			public Adapter caseMoccEventInstance(MoccEventInstance object) {
				return createMoccEventInstanceAdapter();
			}
			@Override
			public Adapter caseCcslClock(CcslClock object) {
				return createCcslClockAdapter();
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
	 * Creates a new adapter for an object of class '{@link org.gemoc.gel.microgel.ModelSpecificEventsSpecification <em>Model Specific Events Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.gel.microgel.ModelSpecificEventsSpecification
	 * @generated
	 */
	public Adapter createModelSpecificEventsSpecificationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.gel.microgel.ImportStatement <em>Import Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.gel.microgel.ImportStatement
	 * @generated
	 */
	public Adapter createImportStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.gel.microgel.ModelSpecificEvent <em>Model Specific Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.gel.microgel.ModelSpecificEvent
	 * @generated
	 */
	public Adapter createModelSpecificEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.gel.microgel.AtomicModelSpecificEvent <em>Atomic Model Specific Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.gel.microgel.AtomicModelSpecificEvent
	 * @generated
	 */
	public Adapter createAtomicModelSpecificEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.gel.microgel.CompositeModelSpecificEvent <em>Composite Model Specific Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.gel.microgel.CompositeModelSpecificEvent
	 * @generated
	 */
	public Adapter createCompositeModelSpecificEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.gel.microgel.ModelSpecificEventsPattern <em>Model Specific Events Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.gel.microgel.ModelSpecificEventsPattern
	 * @generated
	 */
	public Adapter createModelSpecificEventsPatternAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.gel.microgel.UnaryPattern <em>Unary Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.gel.microgel.UnaryPattern
	 * @generated
	 */
	public Adapter createUnaryPatternAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.gel.microgel.BinaryPattern <em>Binary Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.gel.microgel.BinaryPattern
	 * @generated
	 */
	public Adapter createBinaryPatternAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.gel.microgel.CoincidencePattern <em>Coincidence Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.gel.microgel.CoincidencePattern
	 * @generated
	 */
	public Adapter createCoincidencePatternAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.gel.microgel.LogicalSequence <em>Logical Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.gel.microgel.LogicalSequence
	 * @generated
	 */
	public Adapter createLogicalSequenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.gel.microgel.OrPattern <em>Or Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.gel.microgel.OrPattern
	 * @generated
	 */
	public Adapter createOrPatternAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.gel.microgel.XorPattern <em>Xor Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.gel.microgel.XorPattern
	 * @generated
	 */
	public Adapter createXorPatternAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.gel.microgel.PlusPattern <em>Plus Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.gel.microgel.PlusPattern
	 * @generated
	 */
	public Adapter createPlusPatternAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.gel.microgel.IterationPattern <em>Iteration Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.gel.microgel.IterationPattern
	 * @generated
	 */
	public Adapter createIterationPatternAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.gel.microgel.ModelSpecificEventReference <em>Model Specific Event Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.gel.microgel.ModelSpecificEventReference
	 * @generated
	 */
	public Adapter createModelSpecificEventReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.gel.microgel.FeedbackPolicy <em>Feedback Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.gel.microgel.FeedbackPolicy
	 * @generated
	 */
	public Adapter createFeedbackPolicyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.gel.microgel.FeedbackRule <em>Feedback Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.gel.microgel.FeedbackRule
	 * @generated
	 */
	public Adapter createFeedbackRuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.gel.microgel.FeedbackFilter <em>Feedback Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.gel.microgel.FeedbackFilter
	 * @generated
	 */
	public Adapter createFeedbackFilterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.gel.microgel.FeedbackConsequence <em>Feedback Consequence</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.gel.microgel.FeedbackConsequence
	 * @generated
	 */
	public Adapter createFeedbackConsequenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.gel.microgel.MoccEventInstance <em>Mocc Event Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.gel.microgel.MoccEventInstance
	 * @generated
	 */
	public Adapter createMoccEventInstanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.gel.microgel.CcslClock <em>Ccsl Clock</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.gel.microgel.CcslClock
	 * @generated
	 */
	public Adapter createCcslClockAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.gel.microgel.ExecutionFunctionResult <em>Execution Function Result</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.gel.microgel.ExecutionFunctionResult
	 * @generated
	 */
	public Adapter createExecutionFunctionResultAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.gel.microgel.ExecutionFunction <em>Execution Function</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.gel.microgel.ExecutionFunction
	 * @generated
	 */
	public Adapter createExecutionFunctionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.gel.microgel.Kermeta3ExecutionFunction <em>Kermeta3 Execution Function</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.gel.microgel.Kermeta3ExecutionFunction
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

} //MicrogelAdapterFactory
