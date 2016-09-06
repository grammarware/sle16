/**
 */
package org.gemoc.gel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Single Argument</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.gemoc.gel.SingleArgument#getArgument <em>Argument</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.gemoc.gel.GelPackage#getSingleArgument()
 * @model
 * @generated
 */
public interface SingleArgument extends ListOfArguments {
	/**
	 * Returns the value of the '<em><b>Argument</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Argument</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Argument</em>' reference.
	 * @see #setArgument(LocalVariable)
	 * @see org.gemoc.gel.GelPackage#getSingleArgument_Argument()
	 * @model required="true"
	 * @generated
	 */
	LocalVariable getArgument();

	/**
	 * Sets the value of the '{@link org.gemoc.gel.SingleArgument#getArgument <em>Argument</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Argument</em>' reference.
	 * @see #getArgument()
	 * @generated
	 */
	void setArgument(LocalVariable value);

} // SingleArgument
