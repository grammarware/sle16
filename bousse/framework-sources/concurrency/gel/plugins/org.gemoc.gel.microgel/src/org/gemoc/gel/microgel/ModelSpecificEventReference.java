/**
 */
package org.gemoc.gel.microgel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model Specific Event Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.gemoc.gel.microgel.ModelSpecificEventReference#getReferencedMse <em>Referenced Mse</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.gemoc.gel.microgel.MicrogelPackage#getModelSpecificEventReference()
 * @model
 * @generated
 */
public interface ModelSpecificEventReference extends ModelSpecificEventsPattern {
	/**
	 * Returns the value of the '<em><b>Referenced Mse</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Referenced Mse</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Referenced Mse</em>' reference.
	 * @see #setReferencedMse(ModelSpecificEvent)
	 * @see org.gemoc.gel.microgel.MicrogelPackage#getModelSpecificEventReference_ReferencedMse()
	 * @model required="true"
	 * @generated
	 */
	ModelSpecificEvent getReferencedMse();

	/**
	 * Sets the value of the '{@link org.gemoc.gel.microgel.ModelSpecificEventReference#getReferencedMse <em>Referenced Mse</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Referenced Mse</em>' reference.
	 * @see #getReferencedMse()
	 * @generated
	 */
	void setReferencedMse(ModelSpecificEvent value);

} // ModelSpecificEventReference
