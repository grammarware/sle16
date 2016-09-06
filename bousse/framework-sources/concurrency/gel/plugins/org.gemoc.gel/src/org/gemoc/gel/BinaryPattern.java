/**
 */
package org.gemoc.gel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Binary Pattern</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.gemoc.gel.BinaryPattern#getLeftOperand <em>Left Operand</em>}</li>
 *   <li>{@link org.gemoc.gel.BinaryPattern#getRightOperand <em>Right Operand</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.gemoc.gel.GelPackage#getBinaryPattern()
 * @model abstract="true"
 * @generated
 */
public interface BinaryPattern extends DomainSpecificEventsPattern {
	/**
	 * Returns the value of the '<em><b>Left Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Left Operand</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Left Operand</em>' containment reference.
	 * @see #setLeftOperand(DomainSpecificEventsPattern)
	 * @see org.gemoc.gel.GelPackage#getBinaryPattern_LeftOperand()
	 * @model containment="true" required="true"
	 * @generated
	 */
	DomainSpecificEventsPattern getLeftOperand();

	/**
	 * Sets the value of the '{@link org.gemoc.gel.BinaryPattern#getLeftOperand <em>Left Operand</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Left Operand</em>' containment reference.
	 * @see #getLeftOperand()
	 * @generated
	 */
	void setLeftOperand(DomainSpecificEventsPattern value);

	/**
	 * Returns the value of the '<em><b>Right Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Right Operand</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Right Operand</em>' containment reference.
	 * @see #setRightOperand(DomainSpecificEventsPattern)
	 * @see org.gemoc.gel.GelPackage#getBinaryPattern_RightOperand()
	 * @model containment="true" required="true"
	 * @generated
	 */
	DomainSpecificEventsPattern getRightOperand();

	/**
	 * Sets the value of the '{@link org.gemoc.gel.BinaryPattern#getRightOperand <em>Right Operand</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Right Operand</em>' containment reference.
	 * @see #getRightOperand()
	 * @generated
	 */
	void setRightOperand(DomainSpecificEventsPattern value);

} // BinaryPattern
