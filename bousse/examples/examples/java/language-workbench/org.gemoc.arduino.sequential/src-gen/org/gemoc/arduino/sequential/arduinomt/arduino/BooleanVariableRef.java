/**
 */
package org.gemoc.arduino.sequential.arduinomt.arduino;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Boolean Variable Ref</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.gemoc.arduino.sequential.arduinomt.arduino.BooleanVariableRef#getVariable <em>Variable</em>}</li>
 * </ul>
 *
 * @see org.gemoc.arduino.sequential.arduinomt.arduino.ArduinoPackage#getBooleanVariableRef()
 * @model
 * @generated
 */
public interface BooleanVariableRef extends VariableRef, BooleanExpression {
	/**
	 * Returns the value of the '<em><b>Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Variable</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variable</em>' reference.
	 * @see #setVariable(BooleanVariable)
	 * @see org.gemoc.arduino.sequential.arduinomt.arduino.ArduinoPackage#getBooleanVariableRef_Variable()
	 * @model required="true"
	 * @generated
	 */
	BooleanVariable getVariable();

	/**
	 * Sets the value of the '{@link org.gemoc.arduino.sequential.arduinomt.arduino.BooleanVariableRef#getVariable <em>Variable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variable</em>' reference.
	 * @see #getVariable()
	 * @generated
	 */
	void setVariable(BooleanVariable value);

} // BooleanVariableRef
