/**
 */
package org.gemoc.gel.microgel;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Feedback Policy</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.gemoc.gel.microgel.FeedbackPolicy#getRules <em>Rules</em>}</li>
 *   <li>{@link org.gemoc.gel.microgel.FeedbackPolicy#getDefaultRule <em>Default Rule</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.gemoc.gel.microgel.MicrogelPackage#getFeedbackPolicy()
 * @model
 * @generated
 */
public interface FeedbackPolicy extends EObject {
	/**
	 * Returns the value of the '<em><b>Rules</b></em>' containment reference list.
	 * The list contents are of type {@link org.gemoc.gel.microgel.FeedbackRule}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rules</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rules</em>' containment reference list.
	 * @see org.gemoc.gel.microgel.MicrogelPackage#getFeedbackPolicy_Rules()
	 * @model containment="true"
	 * @generated
	 */
	EList<FeedbackRule> getRules();

	/**
	 * Returns the value of the '<em><b>Default Rule</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default Rule</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Rule</em>' containment reference.
	 * @see #setDefaultRule(FeedbackRule)
	 * @see org.gemoc.gel.microgel.MicrogelPackage#getFeedbackPolicy_DefaultRule()
	 * @model containment="true" required="true"
	 * @generated
	 */
	FeedbackRule getDefaultRule();

	/**
	 * Sets the value of the '{@link org.gemoc.gel.microgel.FeedbackPolicy#getDefaultRule <em>Default Rule</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Rule</em>' containment reference.
	 * @see #getDefaultRule()
	 * @generated
	 */
	void setDefaultRule(FeedbackRule value);

} // FeedbackPolicy
