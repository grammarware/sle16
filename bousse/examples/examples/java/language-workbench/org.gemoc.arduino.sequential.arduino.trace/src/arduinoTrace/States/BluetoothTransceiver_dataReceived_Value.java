/**
 */
package arduinoTrace.States;

import arduinoTrace.States.arduino.TracedBluetoothTransceiver;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bluetooth Transceiver data Received Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link arduinoTrace.States.BluetoothTransceiver_dataReceived_Value#getDataReceived <em>Data Received</em>}</li>
 *   <li>{@link arduinoTrace.States.BluetoothTransceiver_dataReceived_Value#getParent <em>Parent</em>}</li>
 *   <li>{@link arduinoTrace.States.BluetoothTransceiver_dataReceived_Value#getStates <em>States</em>}</li>
 * </ul>
 *
 * @see arduinoTrace.States.StatesPackage#getBluetoothTransceiver_dataReceived_Value()
 * @model annotation="http://www.modelexecution.org/trace/XMOF executionMetamodelElement='null'"
 * @generated
 */
public interface BluetoothTransceiver_dataReceived_Value extends Value {
	/**
	 * Returns the value of the '<em><b>Data Received</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Received</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Received</em>' attribute list.
	 * @see arduinoTrace.States.StatesPackage#getBluetoothTransceiver_dataReceived_Value_DataReceived()
	 * @model
	 * @generated
	 */
	EList<Integer> getDataReceived();

	/**
	 * Returns the value of the '<em><b>Parent</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link arduinoTrace.States.arduino.TracedBluetoothTransceiver#getDataReceivedSequence <em>Data Received Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' container reference.
	 * @see #setParent(TracedBluetoothTransceiver)
	 * @see arduinoTrace.States.StatesPackage#getBluetoothTransceiver_dataReceived_Value_Parent()
	 * @see arduinoTrace.States.arduino.TracedBluetoothTransceiver#getDataReceivedSequence
	 * @model opposite="dataReceivedSequence" required="true" transient="false"
	 * @generated
	 */
	TracedBluetoothTransceiver getParent();

	/**
	 * Sets the value of the '{@link arduinoTrace.States.BluetoothTransceiver_dataReceived_Value#getParent <em>Parent</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' container reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(TracedBluetoothTransceiver value);

	/**
	 * Returns the value of the '<em><b>States</b></em>' reference list.
	 * The list contents are of type {@link arduinoTrace.States.State}.
	 * It is bidirectional and its opposite is '{@link arduinoTrace.States.State#getBluetoothTransceiver_dataReceived_Values <em>Bluetooth Transceiver data Received Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>States</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>States</em>' reference list.
	 * @see arduinoTrace.States.StatesPackage#getBluetoothTransceiver_dataReceived_Value_States()
	 * @see arduinoTrace.States.State#getBluetoothTransceiver_dataReceived_Values
	 * @model opposite="bluetoothTransceiver_dataReceived_Values" required="true"
	 * @generated
	 */
	EList<State> getStates();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return this.getStates();'"
	 * @generated
	 */
	EList<State> getStatesNoOpposite();

} // BluetoothTransceiver_dataReceived_Value
