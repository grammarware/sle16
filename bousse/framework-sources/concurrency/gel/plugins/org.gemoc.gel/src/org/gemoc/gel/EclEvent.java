/**
 */
package org.gemoc.gel;

import fr.inria.aoste.timesquare.ECL.ECLDefCS;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ecl Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.gemoc.gel.EclEvent#getEventReference <em>Event Reference</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.gemoc.gel.GelPackage#getEclEvent()
 * @model
 * @generated
 */
public interface EclEvent extends MoccEvent {
	/**
	 * Returns the value of the '<em><b>Event Reference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Event Reference</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Event Reference</em>' reference.
	 * @see #setEventReference(ECLDefCS)
	 * @see org.gemoc.gel.GelPackage#getEclEvent_EventReference()
	 * @model required="true"
	 * @generated
	 */
	ECLDefCS getEventReference();

	/**
	 * Sets the value of the '{@link org.gemoc.gel.EclEvent#getEventReference <em>Event Reference</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Event Reference</em>' reference.
	 * @see #getEventReference()
	 * @generated
	 */
	void setEventReference(ECLDefCS value);

} // EclEvent
