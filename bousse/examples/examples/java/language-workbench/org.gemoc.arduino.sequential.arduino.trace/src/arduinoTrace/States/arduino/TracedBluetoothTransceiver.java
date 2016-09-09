/**
 */
package arduinoTrace.States.arduino;

import arduinoTrace.States.BluetoothTransceiver_dataReceived_Value;
import arduinoTrace.States.BluetoothTransceiver_dataToSend_Value;

import org.eclipse.emf.common.util.EList;

import org.gemoc.arduino.sequential.arduino.arduino.BluetoothTransceiver;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Traced Bluetooth Transceiver</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link arduinoTrace.States.arduino.TracedBluetoothTransceiver#getDataReceivedSequence <em>Data Received Sequence</em>}</li>
 *   <li>{@link arduinoTrace.States.arduino.TracedBluetoothTransceiver#getDataToSendSequence <em>Data To Send Sequence</em>}</li>
 *   <li>{@link arduinoTrace.States.arduino.TracedBluetoothTransceiver#getOriginalObject <em>Original Object</em>}</li>
 * </ul>
 *
 * @see arduinoTrace.States.arduino.ArduinoPackage#getTracedBluetoothTransceiver()
 * @model
 * @generated
 */
public interface TracedBluetoothTransceiver extends TracedArduinoAnalogModule {
	/**
	 * Returns the value of the '<em><b>Data Received Sequence</b></em>' containment reference list.
	 * The list contents are of type {@link arduinoTrace.States.BluetoothTransceiver_dataReceived_Value}.
	 * It is bidirectional and its opposite is '{@link arduinoTrace.States.BluetoothTransceiver_dataReceived_Value#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Received Sequence</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Received Sequence</em>' containment reference list.
	 * @see arduinoTrace.States.arduino.ArduinoPackage#getTracedBluetoothTransceiver_DataReceivedSequence()
	 * @see arduinoTrace.States.BluetoothTransceiver_dataReceived_Value#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	EList<BluetoothTransceiver_dataReceived_Value> getDataReceivedSequence();

	/**
	 * Returns the value of the '<em><b>Data To Send Sequence</b></em>' containment reference list.
	 * The list contents are of type {@link arduinoTrace.States.BluetoothTransceiver_dataToSend_Value}.
	 * It is bidirectional and its opposite is '{@link arduinoTrace.States.BluetoothTransceiver_dataToSend_Value#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data To Send Sequence</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data To Send Sequence</em>' containment reference list.
	 * @see arduinoTrace.States.arduino.ArduinoPackage#getTracedBluetoothTransceiver_DataToSendSequence()
	 * @see arduinoTrace.States.BluetoothTransceiver_dataToSend_Value#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	EList<BluetoothTransceiver_dataToSend_Value> getDataToSendSequence();

	/**
	 * Returns the value of the '<em><b>Original Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Original Object</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Original Object</em>' reference.
	 * @see #setOriginalObject(BluetoothTransceiver)
	 * @see arduinoTrace.States.arduino.ArduinoPackage#getTracedBluetoothTransceiver_OriginalObject()
	 * @model
	 * @generated
	 */
	BluetoothTransceiver getOriginalObject();

	/**
	 * Sets the value of the '{@link arduinoTrace.States.arduino.TracedBluetoothTransceiver#getOriginalObject <em>Original Object</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Original Object</em>' reference.
	 * @see #getOriginalObject()
	 * @generated
	 */
	void setOriginalObject(BluetoothTransceiver value);

} // TracedBluetoothTransceiver
