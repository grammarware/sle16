/**
 */
package org.gemoc.gel.microgel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Binary Pattern</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.gemoc.gel.microgel.BinaryPattern#getLeftOperand <em>Left Operand</em>}</li>
 *   <li>{@link org.gemoc.gel.microgel.BinaryPattern#getRightOperand <em>Right Operand</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.gemoc.gel.microgel.MicrogelPackage#getBinaryPattern()
 * @model abstract="true"
 * @generated
 */
public interface BinaryPattern extends ModelSpecificEventsPattern {
	/**
	 * Returns the value of the '<em><b>Left Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Left Operand</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Left Operand</em>' containment reference.
	 * @see #setLeftOperand(ModelSpecificEventsPattern)
	 * @see org.gemoc.gel.microgel.MicrogelPackage#getBinaryPattern_LeftOperand()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ModelSpecificEventsPattern getLeftOperand();

	/**
	 * Sets the value of the '{@link org.gemoc.gel.microgel.BinaryPattern#getLeftOperand <em>Left Operand</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Left Operand</em>' containment reference.
	 * @see #getLeftOperand()
	 * @generated
	 */
	void setLeftOperand(ModelSpecificEventsPattern value);

	/**
	 * Returns the value of the '<em><b>Right Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Right Operand</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Right Operand</em>' containment reference.
	 * @see #setRightOperand(ModelSpecificEventsPattern)
	 * @see org.gemoc.gel.microgel.MicrogelPackage#getBinaryPattern_RightOperand()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ModelSpecificEventsPattern getRightOperand();

	/**
	 * Sets the value of the '{@link org.gemoc.gel.microgel.BinaryPattern#getRightOperand <em>Right Operand</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Right Operand</em>' containment reference.
	 * @see #getRightOperand()
	 * @generated
	 */
	void setRightOperand(ModelSpecificEventsPattern value);

} // BinaryPattern
