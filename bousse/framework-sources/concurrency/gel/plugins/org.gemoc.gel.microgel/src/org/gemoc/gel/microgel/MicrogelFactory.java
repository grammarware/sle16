/**
 */
package org.gemoc.gel.microgel;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.gemoc.gel.microgel.MicrogelPackage
 * @generated
 */
public interface MicrogelFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MicrogelFactory eINSTANCE = org.gemoc.gel.microgel.impl.MicrogelFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Model Specific Events Specification</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Model Specific Events Specification</em>'.
	 * @generated
	 */
	ModelSpecificEventsSpecification createModelSpecificEventsSpecification();

	/**
	 * Returns a new object of class '<em>Import Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Import Statement</em>'.
	 * @generated
	 */
	ImportStatement createImportStatement();

	/**
	 * Returns a new object of class '<em>Atomic Model Specific Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Atomic Model Specific Event</em>'.
	 * @generated
	 */
	AtomicModelSpecificEvent createAtomicModelSpecificEvent();

	/**
	 * Returns a new object of class '<em>Composite Model Specific Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Composite Model Specific Event</em>'.
	 * @generated
	 */
	CompositeModelSpecificEvent createCompositeModelSpecificEvent();

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
	 * Returns a new object of class '<em>Model Specific Event Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Model Specific Event Reference</em>'.
	 * @generated
	 */
	ModelSpecificEventReference createModelSpecificEventReference();

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
	 * Returns a new object of class '<em>Ccsl Clock</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ccsl Clock</em>'.
	 * @generated
	 */
	CcslClock createCcslClock();

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
	MicrogelPackage getMicrogelPackage();

} //MicrogelFactory
