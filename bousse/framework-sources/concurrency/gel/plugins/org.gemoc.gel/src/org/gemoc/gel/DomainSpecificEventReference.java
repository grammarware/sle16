/**
 */
package org.gemoc.gel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Domain Specific Event Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.gemoc.gel.DomainSpecificEventReference#getReferencedDse <em>Referenced Dse</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.gemoc.gel.GelPackage#getDomainSpecificEventReference()
 * @model
 * @generated
 */
public interface DomainSpecificEventReference extends DomainSpecificEventsPattern {
	/**
	 * Returns the value of the '<em><b>Referenced Dse</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Referenced Dse</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Referenced Dse</em>' reference.
	 * @see #setReferencedDse(DomainSpecificEvent)
	 * @see org.gemoc.gel.GelPackage#getDomainSpecificEventReference_ReferencedDse()
	 * @model required="true"
	 * @generated
	 */
	DomainSpecificEvent getReferencedDse();

	/**
	 * Sets the value of the '{@link org.gemoc.gel.DomainSpecificEventReference#getReferencedDse <em>Referenced Dse</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Referenced Dse</em>' reference.
	 * @see #getReferencedDse()
	 * @generated
	 */
	void setReferencedDse(DomainSpecificEvent value);

} // DomainSpecificEventReference
