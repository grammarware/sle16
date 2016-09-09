/**
 */
package org.gemoc.arduino.sequential.arduino.arduino;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Digital Pin</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.gemoc.arduino.sequential.arduino.arduino.DigitalPin#getModule <em>Module</em>}</li>
 * </ul>
 *
 * @see org.gemoc.arduino.sequential.arduino.arduino.ArduinoPackage#getDigitalPin()
 * @model
 * @generated
 */
public interface DigitalPin extends Pin {
	/**
	 * Returns the value of the '<em><b>Module</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Module</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Module</em>' containment reference.
	 * @see #setModule(ArduinoDigitalModule)
	 * @see org.gemoc.arduino.sequential.arduino.arduino.ArduinoPackage#getDigitalPin_Module()
	 * @model containment="true"
	 * @generated
	 */
	ArduinoDigitalModule getModule();

	/**
	 * Sets the value of the '{@link org.gemoc.arduino.sequential.arduino.arduino.DigitalPin#getModule <em>Module</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Module</em>' containment reference.
	 * @see #getModule()
	 * @generated
	 */
	void setModule(ArduinoDigitalModule value);

} // DigitalPin
