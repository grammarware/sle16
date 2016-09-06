/**
 */
package org.gemoc.bcool.model.bcool;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Coordination Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.gemoc.bcool.model.bcool.CoordinationRule#getEventRelations <em>Event Relations</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.gemoc.bcool.model.bcool.BcoolPackage#getCoordinationRule()
 * @model
 * @generated
 */
public interface CoordinationRule extends EObject {
	/**
	 * Returns the value of the '<em><b>Event Relations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Event Relations</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Event Relations</em>' containment reference.
	 * @see #setEventRelations(EventRelation)
	 * @see org.gemoc.bcool.model.bcool.BcoolPackage#getCoordinationRule_EventRelations()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EventRelation getEventRelations();

	/**
	 * Sets the value of the '{@link org.gemoc.bcool.model.bcool.CoordinationRule#getEventRelations <em>Event Relations</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Event Relations</em>' containment reference.
	 * @see #getEventRelations()
	 * @generated
	 */
	void setEventRelations(EventRelation value);

} // CoordinationRule
