/**
 */
package arduinoTrace.States.arduino;

import org.gemoc.arduino.sequential.arduino.arduino.AnalogPin;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Traced Analog Pin</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link arduinoTrace.States.arduino.TracedAnalogPin#getOriginalObject <em>Original Object</em>}</li>
 * </ul>
 *
 * @see arduinoTrace.States.arduino.ArduinoPackage#getTracedAnalogPin()
 * @model
 * @generated
 */
public interface TracedAnalogPin extends TracedPin {
	/**
	 * Returns the value of the '<em><b>Original Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Original Object</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Original Object</em>' reference.
	 * @see #setOriginalObject(AnalogPin)
	 * @see arduinoTrace.States.arduino.ArduinoPackage#getTracedAnalogPin_OriginalObject()
	 * @model
	 * @generated
	 */
	AnalogPin getOriginalObject();

	/**
	 * Sets the value of the '{@link arduinoTrace.States.arduino.TracedAnalogPin#getOriginalObject <em>Original Object</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Original Object</em>' reference.
	 * @see #getOriginalObject()
	 * @generated
	 */
	void setOriginalObject(AnalogPin value);

} // TracedAnalogPin
