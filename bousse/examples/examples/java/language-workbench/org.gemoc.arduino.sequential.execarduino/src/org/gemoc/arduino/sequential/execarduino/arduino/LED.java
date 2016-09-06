/**
 */
package org.gemoc.arduino.sequential.execarduino.arduino;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>LED</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.gemoc.arduino.sequential.execarduino.arduino.LED#getColor <em>Color</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.gemoc.arduino.sequential.execarduino.arduino.ArduinoPackage#getLED()
 * @model
 * @generated
 */
public interface LED extends ArduinoDigitalModule {
	/**
	 * Returns the value of the '<em><b>Color</b></em>' attribute.
	 * The default value is <code>"blue"</code>.
	 * The literals are from the enumeration {@link org.gemoc.arduino.sequential.execarduino.arduino.Color}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Color</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Color</em>' attribute.
	 * @see org.gemoc.arduino.sequential.execarduino.arduino.Color
	 * @see #setColor(Color)
	 * @see org.gemoc.arduino.sequential.execarduino.arduino.ArduinoPackage#getLED_Color()
	 * @model default="blue" required="true"
	 * @generated
	 */
	Color getColor();

	/**
	 * Sets the value of the '{@link org.gemoc.arduino.sequential.execarduino.arduino.LED#getColor <em>Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Color</em>' attribute.
	 * @see org.gemoc.arduino.sequential.execarduino.arduino.Color
	 * @see #getColor()
	 * @generated
	 */
	void setColor(Color value);

} // LED
