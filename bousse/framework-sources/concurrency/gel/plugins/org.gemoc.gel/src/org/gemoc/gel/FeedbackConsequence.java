/**
 */
package org.gemoc.gel;

import org.eclipse.emf.ecore.EObject;
import org.gemoc.gexpressions.GExpression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Feedback Consequence</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.gemoc.gel.FeedbackConsequence#getNavigationPathToMoccEvent <em>Navigation Path To Mocc Event</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.gemoc.gel.GelPackage#getFeedbackConsequence()
 * @model
 * @generated
 */
public interface FeedbackConsequence extends EObject {
	/**
	 * Returns the value of the '<em><b>Navigation Path To Mocc Event</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Navigation Path To Mocc Event</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Navigation Path To Mocc Event</em>' containment reference.
	 * @see #setNavigationPathToMoccEvent(GExpression)
	 * @see org.gemoc.gel.GelPackage#getFeedbackConsequence_NavigationPathToMoccEvent()
	 * @model containment="true" required="true"
	 * @generated
	 */
	GExpression getNavigationPathToMoccEvent();

	/**
	 * Sets the value of the '{@link org.gemoc.gel.FeedbackConsequence#getNavigationPathToMoccEvent <em>Navigation Path To Mocc Event</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Navigation Path To Mocc Event</em>' containment reference.
	 * @see #getNavigationPathToMoccEvent()
	 * @generated
	 */
	void setNavigationPathToMoccEvent(GExpression value);

} // FeedbackConsequence
