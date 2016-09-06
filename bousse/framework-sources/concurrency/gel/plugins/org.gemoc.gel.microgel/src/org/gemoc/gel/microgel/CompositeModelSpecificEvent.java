/**
 */
package org.gemoc.gel.microgel;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Composite Model Specific Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.gemoc.gel.microgel.CompositeModelSpecificEvent#getBody <em>Body</em>}</li>
 *   <li>{@link org.gemoc.gel.microgel.CompositeModelSpecificEvent#getTargets <em>Targets</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.gemoc.gel.microgel.MicrogelPackage#getCompositeModelSpecificEvent()
 * @model
 * @generated
 */
public interface CompositeModelSpecificEvent extends ModelSpecificEvent {
	/**
	 * Returns the value of the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Body</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Body</em>' containment reference.
	 * @see #setBody(ModelSpecificEventsPattern)
	 * @see org.gemoc.gel.microgel.MicrogelPackage#getCompositeModelSpecificEvent_Body()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ModelSpecificEventsPattern getBody();

	/**
	 * Sets the value of the '{@link org.gemoc.gel.microgel.CompositeModelSpecificEvent#getBody <em>Body</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Body</em>' containment reference.
	 * @see #getBody()
	 * @generated
	 */
	void setBody(ModelSpecificEventsPattern value);

	/**
	 * Returns the value of the '<em><b>Targets</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Targets</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Targets</em>' reference list.
	 * @see org.gemoc.gel.microgel.MicrogelPackage#getCompositeModelSpecificEvent_Targets()
	 * @model required="true"
	 * @generated
	 */
	EList<EObject> getTargets();

} // CompositeModelSpecificEvent
