/**
 */
package org.gemoc.arduino.sequential.execarduino.arduino;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Integer Variable Ref</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.gemoc.arduino.sequential.execarduino.arduino.IntegerVariableRef#getVariable <em>Variable</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.gemoc.arduino.sequential.execarduino.arduino.ArduinoPackage#getIntegerVariableRef()
 * @model
 * @generated
 */
public interface IntegerVariableRef extends VariableRef, IntegerExpression {
	/**
	 * Returns the value of the '<em><b>Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Variable</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variable</em>' reference.
	 * @see #setVariable(IntegerVariable)
	 * @see org.gemoc.arduino.sequential.execarduino.arduino.ArduinoPackage#getIntegerVariableRef_Variable()
	 * @model required="true"
	 * @generated
	 */
	IntegerVariable getVariable();

	/**
	 * Sets the value of the '{@link org.gemoc.arduino.sequential.execarduino.arduino.IntegerVariableRef#getVariable <em>Variable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variable</em>' reference.
	 * @see #getVariable()
	 * @generated
	 */
	void setVariable(IntegerVariable value);

} // IntegerVariableRef
