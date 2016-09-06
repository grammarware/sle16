/**
 */
package org.gemoc.gel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Feedback Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.gemoc.gel.FeedbackRule#getFilter <em>Filter</em>}</li>
 *   <li>{@link org.gemoc.gel.FeedbackRule#getConsequence <em>Consequence</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.gemoc.gel.GelPackage#getFeedbackRule()
 * @model
 * @generated
 */
public interface FeedbackRule extends EObject {
	/**
	 * Returns the value of the '<em><b>Filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Filter</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Filter</em>' containment reference.
	 * @see #setFilter(FeedbackFilter)
	 * @see org.gemoc.gel.GelPackage#getFeedbackRule_Filter()
	 * @model containment="true"
	 * @generated
	 */
	FeedbackFilter getFilter();

	/**
	 * Sets the value of the '{@link org.gemoc.gel.FeedbackRule#getFilter <em>Filter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Filter</em>' containment reference.
	 * @see #getFilter()
	 * @generated
	 */
	void setFilter(FeedbackFilter value);

	/**
	 * Returns the value of the '<em><b>Consequence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Consequence</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Consequence</em>' containment reference.
	 * @see #setConsequence(FeedbackConsequence)
	 * @see org.gemoc.gel.GelPackage#getFeedbackRule_Consequence()
	 * @model containment="true" required="true"
	 * @generated
	 */
	FeedbackConsequence getConsequence();

	/**
	 * Sets the value of the '{@link org.gemoc.gel.FeedbackRule#getConsequence <em>Consequence</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Consequence</em>' containment reference.
	 * @see #getConsequence()
	 * @generated
	 */
	void setConsequence(FeedbackConsequence value);

} // FeedbackRule
