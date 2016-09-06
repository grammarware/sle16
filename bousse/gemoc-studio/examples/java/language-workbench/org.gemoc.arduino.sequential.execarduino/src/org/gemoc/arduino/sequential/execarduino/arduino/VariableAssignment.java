/**
 */
package org.gemoc.arduino.sequential.execarduino.arduino;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variable Assignment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.gemoc.arduino.sequential.execarduino.arduino.VariableAssignment#getVariable <em>Variable</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.gemoc.arduino.sequential.execarduino.arduino.ArduinoPackage#getVariableAssignment()
 * @model
 * @generated
 */
public interface VariableAssignment extends Instruction, Assignment {
	/**
	 * Returns the value of the '<em><b>Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Variable</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variable</em>' reference.
	 * @see #setVariable(Variable)
	 * @see org.gemoc.arduino.sequential.execarduino.arduino.ArduinoPackage#getVariableAssignment_Variable()
	 * @model required="true"
	 * @generated
	 */
	Variable getVariable();

	/**
	 * Sets the value of the '{@link org.gemoc.arduino.sequential.execarduino.arduino.VariableAssignment#getVariable <em>Variable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variable</em>' reference.
	 * @see #getVariable()
	 * @generated
	 */
	void setVariable(Variable value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	int youpla(boolean b);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void execute();

} // VariableAssignment
