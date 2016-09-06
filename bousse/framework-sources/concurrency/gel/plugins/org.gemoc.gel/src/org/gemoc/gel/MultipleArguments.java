/**
 */
package org.gemoc.gel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Multiple Arguments</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.gemoc.gel.MultipleArguments#getHead <em>Head</em>}</li>
 *   <li>{@link org.gemoc.gel.MultipleArguments#getTail <em>Tail</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.gemoc.gel.GelPackage#getMultipleArguments()
 * @model
 * @generated
 */
public interface MultipleArguments extends ListOfArguments {
	/**
	 * Returns the value of the '<em><b>Head</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Head</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Head</em>' reference.
	 * @see #setHead(LocalVariable)
	 * @see org.gemoc.gel.GelPackage#getMultipleArguments_Head()
	 * @model required="true"
	 * @generated
	 */
	LocalVariable getHead();

	/**
	 * Sets the value of the '{@link org.gemoc.gel.MultipleArguments#getHead <em>Head</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Head</em>' reference.
	 * @see #getHead()
	 * @generated
	 */
	void setHead(LocalVariable value);

	/**
	 * Returns the value of the '<em><b>Tail</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tail</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tail</em>' containment reference.
	 * @see #setTail(ListOfArguments)
	 * @see org.gemoc.gel.GelPackage#getMultipleArguments_Tail()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ListOfArguments getTail();

	/**
	 * Sets the value of the '{@link org.gemoc.gel.MultipleArguments#getTail <em>Tail</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tail</em>' containment reference.
	 * @see #getTail()
	 * @generated
	 */
	void setTail(ListOfArguments value);

} // MultipleArguments
