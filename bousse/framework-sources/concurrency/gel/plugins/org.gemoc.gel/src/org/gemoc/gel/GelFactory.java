/**
 */
package org.gemoc.gel;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.gemoc.gel.GelPackage
 * @generated
 */
public interface GelFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	GelFactory eINSTANCE = org.gemoc.gel.impl.GelFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Domain Specific Events Specification</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Domain Specific Events Specification</em>'.
	 * @generated
	 */
	DomainSpecificEventsSpecification createDomainSpecificEventsSpecification();

	/**
	 * Returns a new object of class '<em>Import Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Import Statement</em>'.
	 * @generated
	 */
	ImportStatement createImportStatement();

	/**
	 * Returns a new object of class '<em>Atomic Domain Specific Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Atomic Domain Specific Event</em>'.
	 * @generated
	 */
	AtomicDomainSpecificEvent createAtomicDomainSpecificEvent();

	/**
	 * Returns a new object of class '<em>Composite Domain Specific Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Composite Domain Specific Event</em>'.
	 * @generated
	 */
	CompositeDomainSpecificEvent createCompositeDomainSpecificEvent();

	/**
	 * Returns a new object of class '<em>Unfolding Strategy</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Unfolding Strategy</em>'.
	 * @generated
	 */
	UnfoldingStrategy createUnfoldingStrategy();

	/**
	 * Returns a new object of class '<em>Local Variable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Local Variable</em>'.
	 * @generated
	 */
	LocalVariable createLocalVariable();

	/**
	 * Returns a new object of class '<em>Instantiation Predicate</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Instantiation Predicate</em>'.
	 * @generated
	 */
	InstantiationPredicate createInstantiationPredicate();

	/**
	 * Returns a new object of class '<em>Coincidence Pattern</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Coincidence Pattern</em>'.
	 * @generated
	 */
	CoincidencePattern createCoincidencePattern();

	/**
	 * Returns a new object of class '<em>Logical Sequence</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Logical Sequence</em>'.
	 * @generated
	 */
	LogicalSequence createLogicalSequence();

	/**
	 * Returns a new object of class '<em>Or Pattern</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Or Pattern</em>'.
	 * @generated
	 */
	OrPattern createOrPattern();

	/**
	 * Returns a new object of class '<em>Xor Pattern</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Xor Pattern</em>'.
	 * @generated
	 */
	XorPattern createXorPattern();

	/**
	 * Returns a new object of class '<em>Plus Pattern</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Plus Pattern</em>'.
	 * @generated
	 */
	PlusPattern createPlusPattern();

	/**
	 * Returns a new object of class '<em>Iteration Pattern</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Iteration Pattern</em>'.
	 * @generated
	 */
	IterationPattern createIterationPattern();

	/**
	 * Returns a new object of class '<em>Domain Specific Event Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Domain Specific Event Reference</em>'.
	 * @generated
	 */
	DomainSpecificEventReference createDomainSpecificEventReference();

	/**
	 * Returns a new object of class '<em>Domain Specific Event Reference With Arguments</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Domain Specific Event Reference With Arguments</em>'.
	 * @generated
	 */
	DomainSpecificEventReferenceWithArguments createDomainSpecificEventReferenceWithArguments();

	/**
	 * Returns a new object of class '<em>Single Argument</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Single Argument</em>'.
	 * @generated
	 */
	SingleArgument createSingleArgument();

	/**
	 * Returns a new object of class '<em>Multiple Arguments</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Multiple Arguments</em>'.
	 * @generated
	 */
	MultipleArguments createMultipleArguments();

	/**
	 * Returns a new object of class '<em>Feedback Policy</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Feedback Policy</em>'.
	 * @generated
	 */
	FeedbackPolicy createFeedbackPolicy();

	/**
	 * Returns a new object of class '<em>Feedback Rule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Feedback Rule</em>'.
	 * @generated
	 */
	FeedbackRule createFeedbackRule();

	/**
	 * Returns a new object of class '<em>Feedback Filter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Feedback Filter</em>'.
	 * @generated
	 */
	FeedbackFilter createFeedbackFilter();

	/**
	 * Returns a new object of class '<em>Feedback Consequence</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Feedback Consequence</em>'.
	 * @generated
	 */
	FeedbackConsequence createFeedbackConsequence();

	/**
	 * Returns a new object of class '<em>Ecl Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ecl Event</em>'.
	 * @generated
	 */
	EclEvent createEclEvent();

	/**
	 * Returns a new object of class '<em>Execution Function Result</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Execution Function Result</em>'.
	 * @generated
	 */
	ExecutionFunctionResult createExecutionFunctionResult();

	/**
	 * Returns a new object of class '<em>Kermeta3 Execution Function</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Kermeta3 Execution Function</em>'.
	 * @generated
	 */
	Kermeta3ExecutionFunction createKermeta3ExecutionFunction();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	GelPackage getGelPackage();

} //GelFactory
