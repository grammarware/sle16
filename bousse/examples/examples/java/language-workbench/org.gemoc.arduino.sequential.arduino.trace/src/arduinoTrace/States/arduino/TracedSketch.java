/**
 */
package arduinoTrace.States.arduino;

import org.gemoc.arduino.sequential.arduino.arduino.Sketch;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Traced Sketch</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link arduinoTrace.States.arduino.TracedSketch#getOriginalObject <em>Original Object</em>}</li>
 * </ul>
 *
 * @see arduinoTrace.States.arduino.ArduinoPackage#getTracedSketch()
 * @model
 * @generated
 */
public interface TracedSketch extends TracedNamedElement {
	/**
	 * Returns the value of the '<em><b>Original Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Original Object</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Original Object</em>' reference.
	 * @see #setOriginalObject(Sketch)
	 * @see arduinoTrace.States.arduino.ArduinoPackage#getTracedSketch_OriginalObject()
	 * @model
	 * @generated
	 */
	Sketch getOriginalObject();

	/**
	 * Sets the value of the '{@link arduinoTrace.States.arduino.TracedSketch#getOriginalObject <em>Original Object</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Original Object</em>' reference.
	 * @see #getOriginalObject()
	 * @generated
	 */
	void setOriginalObject(Sketch value);

} // TracedSketch
