/**
 */
package org.gemoc.arduino.sequential.model.arduino;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Integer Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.gemoc.arduino.sequential.model.arduino.IntegerVariable#getInitialValue <em>Initial Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.gemoc.arduino.sequential.model.arduino.ArduinoPackage#getIntegerVariable()
 * @model
 * @generated
 */
public interface IntegerVariable extends Variable {
	/**
	 * Returns the value of the '<em><b>Initial Value</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Initial Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initial Value</em>' attribute.
	 * @see #setInitialValue(int)
	 * @see org.gemoc.arduino.sequential.model.arduino.ArduinoPackage#getIntegerVariable_InitialValue()
	 * @model default="0"
	 * @generated
	 */
	int getInitialValue();

	/**
	 * Sets the value of the '{@link org.gemoc.arduino.sequential.model.arduino.IntegerVariable#getInitialValue <em>Initial Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initial Value</em>' attribute.
	 * @see #getInitialValue()
	 * @generated
	 */
	void setInitialValue(int value);

} // IntegerVariable
