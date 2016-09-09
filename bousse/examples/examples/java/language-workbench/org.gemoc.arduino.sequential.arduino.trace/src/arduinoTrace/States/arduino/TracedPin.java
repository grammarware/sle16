/**
 */
package arduinoTrace.States.arduino;

import arduinoTrace.States.Pin_level_Value;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Traced Pin</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link arduinoTrace.States.arduino.TracedPin#getLevelSequence <em>Level Sequence</em>}</li>
 * </ul>
 *
 * @see arduinoTrace.States.arduino.ArduinoPackage#getTracedPin()
 * @model abstract="true"
 * @generated
 */
public interface TracedPin extends TracedNamedElement {
	/**
	 * Returns the value of the '<em><b>Level Sequence</b></em>' containment reference list.
	 * The list contents are of type {@link arduinoTrace.States.Pin_level_Value}.
	 * It is bidirectional and its opposite is '{@link arduinoTrace.States.Pin_level_Value#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Level Sequence</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Level Sequence</em>' containment reference list.
	 * @see arduinoTrace.States.arduino.ArduinoPackage#getTracedPin_LevelSequence()
	 * @see arduinoTrace.States.Pin_level_Value#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	EList<Pin_level_Value> getLevelSequence();

} // TracedPin
