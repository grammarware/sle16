/**
 */
package org.gemoc.arduino.sequential.arduino.arduino;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Binary Boolean Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.gemoc.arduino.sequential.arduino.arduino.BinaryBooleanExpression#getOperator <em>Operator</em>}</li>
 * </ul>
 *
 * @see org.gemoc.arduino.sequential.arduino.arduino.ArduinoPackage#getBinaryBooleanExpression()
 * @model
 * @generated
 */
public interface BinaryBooleanExpression extends BinaryExpression, BooleanExpression {
	/**
	 * Returns the value of the '<em><b>Operator</b></em>' attribute.
	 * The literals are from the enumeration {@link org.gemoc.arduino.sequential.arduino.arduino.BinaryBooleanOperatorKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operator</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operator</em>' attribute.
	 * @see org.gemoc.arduino.sequential.arduino.arduino.BinaryBooleanOperatorKind
	 * @see #setOperator(BinaryBooleanOperatorKind)
	 * @see org.gemoc.arduino.sequential.arduino.arduino.ArduinoPackage#getBinaryBooleanExpression_Operator()
	 * @model
	 * @generated
	 */
	BinaryBooleanOperatorKind getOperator();

	/**
	 * Sets the value of the '{@link org.gemoc.arduino.sequential.arduino.arduino.BinaryBooleanExpression#getOperator <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operator</em>' attribute.
	 * @see org.gemoc.arduino.sequential.arduino.arduino.BinaryBooleanOperatorKind
	 * @see #getOperator()
	 * @generated
	 */
	void setOperator(BinaryBooleanOperatorKind value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="org.gemoc.arduino.sequential.arduino.arduino.Object"
	 * @generated
	 */
	Object evaluate();

} // BinaryBooleanExpression
