/**
 */
package org.gemoc.gel.microgel;

import fr.inria.aoste.timesquare.ccslkernel.model.TimeModel.Clock;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ccsl Clock</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.gemoc.gel.microgel.CcslClock#getReferencedClock <em>Referenced Clock</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.gemoc.gel.microgel.MicrogelPackage#getCcslClock()
 * @model
 * @generated
 */
public interface CcslClock extends MoccEventInstance {
	/**
	 * Returns the value of the '<em><b>Referenced Clock</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Referenced Clock</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Referenced Clock</em>' reference.
	 * @see #setReferencedClock(Clock)
	 * @see org.gemoc.gel.microgel.MicrogelPackage#getCcslClock_ReferencedClock()
	 * @model required="true"
	 * @generated
	 */
	Clock getReferencedClock();

	/**
	 * Sets the value of the '{@link org.gemoc.gel.microgel.CcslClock#getReferencedClock <em>Referenced Clock</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Referenced Clock</em>' reference.
	 * @see #getReferencedClock()
	 * @generated
	 */
	void setReferencedClock(Clock value);

} // CcslClock
