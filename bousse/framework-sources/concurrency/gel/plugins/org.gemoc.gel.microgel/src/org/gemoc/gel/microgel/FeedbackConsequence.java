/**
 */
package org.gemoc.gel.microgel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Feedback Consequence</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.gemoc.gel.microgel.FeedbackConsequence#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.gemoc.gel.microgel.MicrogelPackage#getFeedbackConsequence()
 * @model
 * @generated
 */
public interface FeedbackConsequence extends EObject {
	/**
	 * Returns the value of the '<em><b>Target</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' containment reference.
	 * @see #setTarget(MoccEventInstance)
	 * @see org.gemoc.gel.microgel.MicrogelPackage#getFeedbackConsequence_Target()
	 * @model containment="true"
	 * @generated
	 */
	MoccEventInstance getTarget();

	/**
	 * Sets the value of the '{@link org.gemoc.gel.microgel.FeedbackConsequence#getTarget <em>Target</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' containment reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(MoccEventInstance value);

} // FeedbackConsequence
