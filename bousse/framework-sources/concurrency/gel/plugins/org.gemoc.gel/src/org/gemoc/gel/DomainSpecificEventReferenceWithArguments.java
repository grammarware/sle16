/**
 */
package org.gemoc.gel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Domain Specific Event Reference With Arguments</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.gemoc.gel.DomainSpecificEventReferenceWithArguments#getArguments <em>Arguments</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.gemoc.gel.GelPackage#getDomainSpecificEventReferenceWithArguments()
 * @model
 * @generated
 */
public interface DomainSpecificEventReferenceWithArguments extends DomainSpecificEventReference {
	/**
	 * Returns the value of the '<em><b>Arguments</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Arguments</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arguments</em>' containment reference.
	 * @see #setArguments(ListOfArguments)
	 * @see org.gemoc.gel.GelPackage#getDomainSpecificEventReferenceWithArguments_Arguments()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ListOfArguments getArguments();

	/**
	 * Sets the value of the '{@link org.gemoc.gel.DomainSpecificEventReferenceWithArguments#getArguments <em>Arguments</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Arguments</em>' containment reference.
	 * @see #getArguments()
	 * @generated
	 */
	void setArguments(ListOfArguments value);

} // DomainSpecificEventReferenceWithArguments
