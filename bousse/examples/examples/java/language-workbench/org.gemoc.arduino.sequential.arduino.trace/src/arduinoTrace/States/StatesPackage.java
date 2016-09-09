/**
 */
package arduinoTrace.States;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see arduinoTrace.States.StatesFactory
 * @model kind="package"
 * @generated
 */
public interface StatesPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "States";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "arduinoTrace_States";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "tracedclasses";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	StatesPackage eINSTANCE = arduinoTrace.States.impl.StatesPackageImpl.init();

	/**
	 * The meta object id for the '{@link arduinoTrace.States.Value <em>Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoTrace.States.Value
	 * @see arduinoTrace.States.impl.StatesPackageImpl#getValue()
	 * @generated
	 */
	int VALUE = 6;

	/**
	 * The feature id for the '<em><b>States No Opposite</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE__STATES_NO_OPPOSITE = 0;

	/**
	 * The number of structural features of the '<em>Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link arduinoTrace.States.impl.BluetoothTransceiver_dataReceived_ValueImpl <em>Bluetooth Transceiver data Received Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoTrace.States.impl.BluetoothTransceiver_dataReceived_ValueImpl
	 * @see arduinoTrace.States.impl.StatesPackageImpl#getBluetoothTransceiver_dataReceived_Value()
	 * @generated
	 */
	int BLUETOOTH_TRANSCEIVER_DATA_RECEIVED_VALUE = 0;

	/**
	 * The feature id for the '<em><b>States No Opposite</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLUETOOTH_TRANSCEIVER_DATA_RECEIVED_VALUE__STATES_NO_OPPOSITE = VALUE__STATES_NO_OPPOSITE;

	/**
	 * The feature id for the '<em><b>Data Received</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLUETOOTH_TRANSCEIVER_DATA_RECEIVED_VALUE__DATA_RECEIVED = VALUE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLUETOOTH_TRANSCEIVER_DATA_RECEIVED_VALUE__PARENT = VALUE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>States</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLUETOOTH_TRANSCEIVER_DATA_RECEIVED_VALUE__STATES = VALUE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Bluetooth Transceiver data Received Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLUETOOTH_TRANSCEIVER_DATA_RECEIVED_VALUE_FEATURE_COUNT = VALUE_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Get States No Opposite</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLUETOOTH_TRANSCEIVER_DATA_RECEIVED_VALUE___GET_STATES_NO_OPPOSITE = VALUE_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Bluetooth Transceiver data Received Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLUETOOTH_TRANSCEIVER_DATA_RECEIVED_VALUE_OPERATION_COUNT = VALUE_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link arduinoTrace.States.impl.BluetoothTransceiver_dataToSend_ValueImpl <em>Bluetooth Transceiver data To Send Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoTrace.States.impl.BluetoothTransceiver_dataToSend_ValueImpl
	 * @see arduinoTrace.States.impl.StatesPackageImpl#getBluetoothTransceiver_dataToSend_Value()
	 * @generated
	 */
	int BLUETOOTH_TRANSCEIVER_DATA_TO_SEND_VALUE = 1;

	/**
	 * The feature id for the '<em><b>States No Opposite</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLUETOOTH_TRANSCEIVER_DATA_TO_SEND_VALUE__STATES_NO_OPPOSITE = VALUE__STATES_NO_OPPOSITE;

	/**
	 * The feature id for the '<em><b>Data To Send</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLUETOOTH_TRANSCEIVER_DATA_TO_SEND_VALUE__DATA_TO_SEND = VALUE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLUETOOTH_TRANSCEIVER_DATA_TO_SEND_VALUE__PARENT = VALUE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>States</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLUETOOTH_TRANSCEIVER_DATA_TO_SEND_VALUE__STATES = VALUE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Bluetooth Transceiver data To Send Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLUETOOTH_TRANSCEIVER_DATA_TO_SEND_VALUE_FEATURE_COUNT = VALUE_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Get States No Opposite</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLUETOOTH_TRANSCEIVER_DATA_TO_SEND_VALUE___GET_STATES_NO_OPPOSITE = VALUE_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Bluetooth Transceiver data To Send Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLUETOOTH_TRANSCEIVER_DATA_TO_SEND_VALUE_OPERATION_COUNT = VALUE_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link arduinoTrace.States.impl.BooleanVariable_value_ValueImpl <em>Boolean Variable value Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoTrace.States.impl.BooleanVariable_value_ValueImpl
	 * @see arduinoTrace.States.impl.StatesPackageImpl#getBooleanVariable_value_Value()
	 * @generated
	 */
	int BOOLEAN_VARIABLE_VALUE_VALUE = 2;

	/**
	 * The feature id for the '<em><b>States No Opposite</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_VARIABLE_VALUE_VALUE__STATES_NO_OPPOSITE = VALUE__STATES_NO_OPPOSITE;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_VARIABLE_VALUE_VALUE__PARENT = VALUE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>States</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_VARIABLE_VALUE_VALUE__STATES = VALUE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_VARIABLE_VALUE_VALUE__VALUE = VALUE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Boolean Variable value Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_VARIABLE_VALUE_VALUE_FEATURE_COUNT = VALUE_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Get States No Opposite</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_VARIABLE_VALUE_VALUE___GET_STATES_NO_OPPOSITE = VALUE_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Boolean Variable value Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_VARIABLE_VALUE_VALUE_OPERATION_COUNT = VALUE_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link arduinoTrace.States.impl.IntegerVariable_value_ValueImpl <em>Integer Variable value Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoTrace.States.impl.IntegerVariable_value_ValueImpl
	 * @see arduinoTrace.States.impl.StatesPackageImpl#getIntegerVariable_value_Value()
	 * @generated
	 */
	int INTEGER_VARIABLE_VALUE_VALUE = 3;

	/**
	 * The feature id for the '<em><b>States No Opposite</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_VARIABLE_VALUE_VALUE__STATES_NO_OPPOSITE = VALUE__STATES_NO_OPPOSITE;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_VARIABLE_VALUE_VALUE__PARENT = VALUE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>States</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_VARIABLE_VALUE_VALUE__STATES = VALUE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_VARIABLE_VALUE_VALUE__VALUE = VALUE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Integer Variable value Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_VARIABLE_VALUE_VALUE_FEATURE_COUNT = VALUE_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Get States No Opposite</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_VARIABLE_VALUE_VALUE___GET_STATES_NO_OPPOSITE = VALUE_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Integer Variable value Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_VARIABLE_VALUE_VALUE_OPERATION_COUNT = VALUE_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link arduinoTrace.States.impl.Pin_level_ValueImpl <em>Pin level Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoTrace.States.impl.Pin_level_ValueImpl
	 * @see arduinoTrace.States.impl.StatesPackageImpl#getPin_level_Value()
	 * @generated
	 */
	int PIN_LEVEL_VALUE = 4;

	/**
	 * The feature id for the '<em><b>States No Opposite</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIN_LEVEL_VALUE__STATES_NO_OPPOSITE = VALUE__STATES_NO_OPPOSITE;

	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIN_LEVEL_VALUE__LEVEL = VALUE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIN_LEVEL_VALUE__PARENT = VALUE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>States</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIN_LEVEL_VALUE__STATES = VALUE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Pin level Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIN_LEVEL_VALUE_FEATURE_COUNT = VALUE_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Get States No Opposite</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIN_LEVEL_VALUE___GET_STATES_NO_OPPOSITE = VALUE_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Pin level Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIN_LEVEL_VALUE_OPERATION_COUNT = VALUE_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link arduinoTrace.States.impl.StateImpl <em>State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoTrace.States.impl.StateImpl
	 * @see arduinoTrace.States.impl.StatesPackageImpl#getState()
	 * @generated
	 */
	int STATE = 5;

	/**
	 * The feature id for the '<em><b>Bluetooth Transceiver data Received Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__BLUETOOTH_TRANSCEIVER_DATA_RECEIVED_VALUES = 0;

	/**
	 * The feature id for the '<em><b>Bluetooth Transceiver data To Send Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__BLUETOOTH_TRANSCEIVER_DATA_TO_SEND_VALUES = 1;

	/**
	 * The feature id for the '<em><b>Boolean Variable value Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__BOOLEAN_VARIABLE_VALUE_VALUES = 2;

	/**
	 * The feature id for the '<em><b>Ended Steps</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__ENDED_STEPS = 3;

	/**
	 * The feature id for the '<em><b>Integer Variable value Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__INTEGER_VARIABLE_VALUE_VALUES = 4;

	/**
	 * The feature id for the '<em><b>Pin level Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__PIN_LEVEL_VALUES = 5;

	/**
	 * The feature id for the '<em><b>Started Steps</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__STARTED_STEPS = 6;

	/**
	 * The number of structural features of the '<em>State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link arduinoTrace.States.BluetoothTransceiver_dataReceived_Value <em>Bluetooth Transceiver data Received Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bluetooth Transceiver data Received Value</em>'.
	 * @see arduinoTrace.States.BluetoothTransceiver_dataReceived_Value
	 * @generated
	 */
	EClass getBluetoothTransceiver_dataReceived_Value();

	/**
	 * Returns the meta object for the attribute list '{@link arduinoTrace.States.BluetoothTransceiver_dataReceived_Value#getDataReceived <em>Data Received</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Data Received</em>'.
	 * @see arduinoTrace.States.BluetoothTransceiver_dataReceived_Value#getDataReceived()
	 * @see #getBluetoothTransceiver_dataReceived_Value()
	 * @generated
	 */
	EAttribute getBluetoothTransceiver_dataReceived_Value_DataReceived();

	/**
	 * Returns the meta object for the container reference '{@link arduinoTrace.States.BluetoothTransceiver_dataReceived_Value#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see arduinoTrace.States.BluetoothTransceiver_dataReceived_Value#getParent()
	 * @see #getBluetoothTransceiver_dataReceived_Value()
	 * @generated
	 */
	EReference getBluetoothTransceiver_dataReceived_Value_Parent();

	/**
	 * Returns the meta object for the reference list '{@link arduinoTrace.States.BluetoothTransceiver_dataReceived_Value#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>States</em>'.
	 * @see arduinoTrace.States.BluetoothTransceiver_dataReceived_Value#getStates()
	 * @see #getBluetoothTransceiver_dataReceived_Value()
	 * @generated
	 */
	EReference getBluetoothTransceiver_dataReceived_Value_States();

	/**
	 * Returns the meta object for the '{@link arduinoTrace.States.BluetoothTransceiver_dataReceived_Value#getStatesNoOpposite() <em>Get States No Opposite</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get States No Opposite</em>' operation.
	 * @see arduinoTrace.States.BluetoothTransceiver_dataReceived_Value#getStatesNoOpposite()
	 * @generated
	 */
	EOperation getBluetoothTransceiver_dataReceived_Value__GetStatesNoOpposite();

	/**
	 * Returns the meta object for class '{@link arduinoTrace.States.BluetoothTransceiver_dataToSend_Value <em>Bluetooth Transceiver data To Send Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bluetooth Transceiver data To Send Value</em>'.
	 * @see arduinoTrace.States.BluetoothTransceiver_dataToSend_Value
	 * @generated
	 */
	EClass getBluetoothTransceiver_dataToSend_Value();

	/**
	 * Returns the meta object for the attribute list '{@link arduinoTrace.States.BluetoothTransceiver_dataToSend_Value#getDataToSend <em>Data To Send</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Data To Send</em>'.
	 * @see arduinoTrace.States.BluetoothTransceiver_dataToSend_Value#getDataToSend()
	 * @see #getBluetoothTransceiver_dataToSend_Value()
	 * @generated
	 */
	EAttribute getBluetoothTransceiver_dataToSend_Value_DataToSend();

	/**
	 * Returns the meta object for the container reference '{@link arduinoTrace.States.BluetoothTransceiver_dataToSend_Value#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see arduinoTrace.States.BluetoothTransceiver_dataToSend_Value#getParent()
	 * @see #getBluetoothTransceiver_dataToSend_Value()
	 * @generated
	 */
	EReference getBluetoothTransceiver_dataToSend_Value_Parent();

	/**
	 * Returns the meta object for the reference list '{@link arduinoTrace.States.BluetoothTransceiver_dataToSend_Value#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>States</em>'.
	 * @see arduinoTrace.States.BluetoothTransceiver_dataToSend_Value#getStates()
	 * @see #getBluetoothTransceiver_dataToSend_Value()
	 * @generated
	 */
	EReference getBluetoothTransceiver_dataToSend_Value_States();

	/**
	 * Returns the meta object for the '{@link arduinoTrace.States.BluetoothTransceiver_dataToSend_Value#getStatesNoOpposite() <em>Get States No Opposite</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get States No Opposite</em>' operation.
	 * @see arduinoTrace.States.BluetoothTransceiver_dataToSend_Value#getStatesNoOpposite()
	 * @generated
	 */
	EOperation getBluetoothTransceiver_dataToSend_Value__GetStatesNoOpposite();

	/**
	 * Returns the meta object for class '{@link arduinoTrace.States.BooleanVariable_value_Value <em>Boolean Variable value Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean Variable value Value</em>'.
	 * @see arduinoTrace.States.BooleanVariable_value_Value
	 * @generated
	 */
	EClass getBooleanVariable_value_Value();

	/**
	 * Returns the meta object for the container reference '{@link arduinoTrace.States.BooleanVariable_value_Value#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see arduinoTrace.States.BooleanVariable_value_Value#getParent()
	 * @see #getBooleanVariable_value_Value()
	 * @generated
	 */
	EReference getBooleanVariable_value_Value_Parent();

	/**
	 * Returns the meta object for the reference list '{@link arduinoTrace.States.BooleanVariable_value_Value#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>States</em>'.
	 * @see arduinoTrace.States.BooleanVariable_value_Value#getStates()
	 * @see #getBooleanVariable_value_Value()
	 * @generated
	 */
	EReference getBooleanVariable_value_Value_States();

	/**
	 * Returns the meta object for the attribute '{@link arduinoTrace.States.BooleanVariable_value_Value#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see arduinoTrace.States.BooleanVariable_value_Value#getValue()
	 * @see #getBooleanVariable_value_Value()
	 * @generated
	 */
	EAttribute getBooleanVariable_value_Value_Value();

	/**
	 * Returns the meta object for the '{@link arduinoTrace.States.BooleanVariable_value_Value#getStatesNoOpposite() <em>Get States No Opposite</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get States No Opposite</em>' operation.
	 * @see arduinoTrace.States.BooleanVariable_value_Value#getStatesNoOpposite()
	 * @generated
	 */
	EOperation getBooleanVariable_value_Value__GetStatesNoOpposite();

	/**
	 * Returns the meta object for class '{@link arduinoTrace.States.IntegerVariable_value_Value <em>Integer Variable value Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Integer Variable value Value</em>'.
	 * @see arduinoTrace.States.IntegerVariable_value_Value
	 * @generated
	 */
	EClass getIntegerVariable_value_Value();

	/**
	 * Returns the meta object for the container reference '{@link arduinoTrace.States.IntegerVariable_value_Value#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see arduinoTrace.States.IntegerVariable_value_Value#getParent()
	 * @see #getIntegerVariable_value_Value()
	 * @generated
	 */
	EReference getIntegerVariable_value_Value_Parent();

	/**
	 * Returns the meta object for the reference list '{@link arduinoTrace.States.IntegerVariable_value_Value#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>States</em>'.
	 * @see arduinoTrace.States.IntegerVariable_value_Value#getStates()
	 * @see #getIntegerVariable_value_Value()
	 * @generated
	 */
	EReference getIntegerVariable_value_Value_States();

	/**
	 * Returns the meta object for the attribute '{@link arduinoTrace.States.IntegerVariable_value_Value#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see arduinoTrace.States.IntegerVariable_value_Value#getValue()
	 * @see #getIntegerVariable_value_Value()
	 * @generated
	 */
	EAttribute getIntegerVariable_value_Value_Value();

	/**
	 * Returns the meta object for the '{@link arduinoTrace.States.IntegerVariable_value_Value#getStatesNoOpposite() <em>Get States No Opposite</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get States No Opposite</em>' operation.
	 * @see arduinoTrace.States.IntegerVariable_value_Value#getStatesNoOpposite()
	 * @generated
	 */
	EOperation getIntegerVariable_value_Value__GetStatesNoOpposite();

	/**
	 * Returns the meta object for class '{@link arduinoTrace.States.Pin_level_Value <em>Pin level Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pin level Value</em>'.
	 * @see arduinoTrace.States.Pin_level_Value
	 * @generated
	 */
	EClass getPin_level_Value();

	/**
	 * Returns the meta object for the attribute '{@link arduinoTrace.States.Pin_level_Value#getLevel <em>Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Level</em>'.
	 * @see arduinoTrace.States.Pin_level_Value#getLevel()
	 * @see #getPin_level_Value()
	 * @generated
	 */
	EAttribute getPin_level_Value_Level();

	/**
	 * Returns the meta object for the container reference '{@link arduinoTrace.States.Pin_level_Value#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see arduinoTrace.States.Pin_level_Value#getParent()
	 * @see #getPin_level_Value()
	 * @generated
	 */
	EReference getPin_level_Value_Parent();

	/**
	 * Returns the meta object for the reference list '{@link arduinoTrace.States.Pin_level_Value#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>States</em>'.
	 * @see arduinoTrace.States.Pin_level_Value#getStates()
	 * @see #getPin_level_Value()
	 * @generated
	 */
	EReference getPin_level_Value_States();

	/**
	 * Returns the meta object for the '{@link arduinoTrace.States.Pin_level_Value#getStatesNoOpposite() <em>Get States No Opposite</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get States No Opposite</em>' operation.
	 * @see arduinoTrace.States.Pin_level_Value#getStatesNoOpposite()
	 * @generated
	 */
	EOperation getPin_level_Value__GetStatesNoOpposite();

	/**
	 * Returns the meta object for class '{@link arduinoTrace.States.State <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>State</em>'.
	 * @see arduinoTrace.States.State
	 * @generated
	 */
	EClass getState();

	/**
	 * Returns the meta object for the reference list '{@link arduinoTrace.States.State#getBluetoothTransceiver_dataReceived_Values <em>Bluetooth Transceiver data Received Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Bluetooth Transceiver data Received Values</em>'.
	 * @see arduinoTrace.States.State#getBluetoothTransceiver_dataReceived_Values()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_BluetoothTransceiver_dataReceived_Values();

	/**
	 * Returns the meta object for the reference list '{@link arduinoTrace.States.State#getBluetoothTransceiver_dataToSend_Values <em>Bluetooth Transceiver data To Send Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Bluetooth Transceiver data To Send Values</em>'.
	 * @see arduinoTrace.States.State#getBluetoothTransceiver_dataToSend_Values()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_BluetoothTransceiver_dataToSend_Values();

	/**
	 * Returns the meta object for the reference list '{@link arduinoTrace.States.State#getBooleanVariable_value_Values <em>Boolean Variable value Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Boolean Variable value Values</em>'.
	 * @see arduinoTrace.States.State#getBooleanVariable_value_Values()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_BooleanVariable_value_Values();

	/**
	 * Returns the meta object for the reference list '{@link arduinoTrace.States.State#getEndedSteps <em>Ended Steps</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Ended Steps</em>'.
	 * @see arduinoTrace.States.State#getEndedSteps()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_EndedSteps();

	/**
	 * Returns the meta object for the reference list '{@link arduinoTrace.States.State#getIntegerVariable_value_Values <em>Integer Variable value Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Integer Variable value Values</em>'.
	 * @see arduinoTrace.States.State#getIntegerVariable_value_Values()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_IntegerVariable_value_Values();

	/**
	 * Returns the meta object for the reference list '{@link arduinoTrace.States.State#getPin_level_Values <em>Pin level Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Pin level Values</em>'.
	 * @see arduinoTrace.States.State#getPin_level_Values()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_Pin_level_Values();

	/**
	 * Returns the meta object for the reference list '{@link arduinoTrace.States.State#getStartedSteps <em>Started Steps</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Started Steps</em>'.
	 * @see arduinoTrace.States.State#getStartedSteps()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_StartedSteps();

	/**
	 * Returns the meta object for class '{@link arduinoTrace.States.Value <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Value</em>'.
	 * @see arduinoTrace.States.Value
	 * @generated
	 */
	EClass getValue();

	/**
	 * Returns the meta object for the reference list '{@link arduinoTrace.States.Value#getStatesNoOpposite <em>States No Opposite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>States No Opposite</em>'.
	 * @see arduinoTrace.States.Value#getStatesNoOpposite()
	 * @see #getValue()
	 * @generated
	 */
	EReference getValue_StatesNoOpposite();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	StatesFactory getStatesFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link arduinoTrace.States.impl.BluetoothTransceiver_dataReceived_ValueImpl <em>Bluetooth Transceiver data Received Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoTrace.States.impl.BluetoothTransceiver_dataReceived_ValueImpl
		 * @see arduinoTrace.States.impl.StatesPackageImpl#getBluetoothTransceiver_dataReceived_Value()
		 * @generated
		 */
		EClass BLUETOOTH_TRANSCEIVER_DATA_RECEIVED_VALUE = eINSTANCE.getBluetoothTransceiver_dataReceived_Value();

		/**
		 * The meta object literal for the '<em><b>Data Received</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BLUETOOTH_TRANSCEIVER_DATA_RECEIVED_VALUE__DATA_RECEIVED = eINSTANCE.getBluetoothTransceiver_dataReceived_Value_DataReceived();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BLUETOOTH_TRANSCEIVER_DATA_RECEIVED_VALUE__PARENT = eINSTANCE.getBluetoothTransceiver_dataReceived_Value_Parent();

		/**
		 * The meta object literal for the '<em><b>States</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BLUETOOTH_TRANSCEIVER_DATA_RECEIVED_VALUE__STATES = eINSTANCE.getBluetoothTransceiver_dataReceived_Value_States();

		/**
		 * The meta object literal for the '<em><b>Get States No Opposite</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BLUETOOTH_TRANSCEIVER_DATA_RECEIVED_VALUE___GET_STATES_NO_OPPOSITE = eINSTANCE.getBluetoothTransceiver_dataReceived_Value__GetStatesNoOpposite();

		/**
		 * The meta object literal for the '{@link arduinoTrace.States.impl.BluetoothTransceiver_dataToSend_ValueImpl <em>Bluetooth Transceiver data To Send Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoTrace.States.impl.BluetoothTransceiver_dataToSend_ValueImpl
		 * @see arduinoTrace.States.impl.StatesPackageImpl#getBluetoothTransceiver_dataToSend_Value()
		 * @generated
		 */
		EClass BLUETOOTH_TRANSCEIVER_DATA_TO_SEND_VALUE = eINSTANCE.getBluetoothTransceiver_dataToSend_Value();

		/**
		 * The meta object literal for the '<em><b>Data To Send</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BLUETOOTH_TRANSCEIVER_DATA_TO_SEND_VALUE__DATA_TO_SEND = eINSTANCE.getBluetoothTransceiver_dataToSend_Value_DataToSend();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BLUETOOTH_TRANSCEIVER_DATA_TO_SEND_VALUE__PARENT = eINSTANCE.getBluetoothTransceiver_dataToSend_Value_Parent();

		/**
		 * The meta object literal for the '<em><b>States</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BLUETOOTH_TRANSCEIVER_DATA_TO_SEND_VALUE__STATES = eINSTANCE.getBluetoothTransceiver_dataToSend_Value_States();

		/**
		 * The meta object literal for the '<em><b>Get States No Opposite</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BLUETOOTH_TRANSCEIVER_DATA_TO_SEND_VALUE___GET_STATES_NO_OPPOSITE = eINSTANCE.getBluetoothTransceiver_dataToSend_Value__GetStatesNoOpposite();

		/**
		 * The meta object literal for the '{@link arduinoTrace.States.impl.BooleanVariable_value_ValueImpl <em>Boolean Variable value Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoTrace.States.impl.BooleanVariable_value_ValueImpl
		 * @see arduinoTrace.States.impl.StatesPackageImpl#getBooleanVariable_value_Value()
		 * @generated
		 */
		EClass BOOLEAN_VARIABLE_VALUE_VALUE = eINSTANCE.getBooleanVariable_value_Value();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOOLEAN_VARIABLE_VALUE_VALUE__PARENT = eINSTANCE.getBooleanVariable_value_Value_Parent();

		/**
		 * The meta object literal for the '<em><b>States</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOOLEAN_VARIABLE_VALUE_VALUE__STATES = eINSTANCE.getBooleanVariable_value_Value_States();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOLEAN_VARIABLE_VALUE_VALUE__VALUE = eINSTANCE.getBooleanVariable_value_Value_Value();

		/**
		 * The meta object literal for the '<em><b>Get States No Opposite</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BOOLEAN_VARIABLE_VALUE_VALUE___GET_STATES_NO_OPPOSITE = eINSTANCE.getBooleanVariable_value_Value__GetStatesNoOpposite();

		/**
		 * The meta object literal for the '{@link arduinoTrace.States.impl.IntegerVariable_value_ValueImpl <em>Integer Variable value Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoTrace.States.impl.IntegerVariable_value_ValueImpl
		 * @see arduinoTrace.States.impl.StatesPackageImpl#getIntegerVariable_value_Value()
		 * @generated
		 */
		EClass INTEGER_VARIABLE_VALUE_VALUE = eINSTANCE.getIntegerVariable_value_Value();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTEGER_VARIABLE_VALUE_VALUE__PARENT = eINSTANCE.getIntegerVariable_value_Value_Parent();

		/**
		 * The meta object literal for the '<em><b>States</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTEGER_VARIABLE_VALUE_VALUE__STATES = eINSTANCE.getIntegerVariable_value_Value_States();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTEGER_VARIABLE_VALUE_VALUE__VALUE = eINSTANCE.getIntegerVariable_value_Value_Value();

		/**
		 * The meta object literal for the '<em><b>Get States No Opposite</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INTEGER_VARIABLE_VALUE_VALUE___GET_STATES_NO_OPPOSITE = eINSTANCE.getIntegerVariable_value_Value__GetStatesNoOpposite();

		/**
		 * The meta object literal for the '{@link arduinoTrace.States.impl.Pin_level_ValueImpl <em>Pin level Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoTrace.States.impl.Pin_level_ValueImpl
		 * @see arduinoTrace.States.impl.StatesPackageImpl#getPin_level_Value()
		 * @generated
		 */
		EClass PIN_LEVEL_VALUE = eINSTANCE.getPin_level_Value();

		/**
		 * The meta object literal for the '<em><b>Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PIN_LEVEL_VALUE__LEVEL = eINSTANCE.getPin_level_Value_Level();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PIN_LEVEL_VALUE__PARENT = eINSTANCE.getPin_level_Value_Parent();

		/**
		 * The meta object literal for the '<em><b>States</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PIN_LEVEL_VALUE__STATES = eINSTANCE.getPin_level_Value_States();

		/**
		 * The meta object literal for the '<em><b>Get States No Opposite</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PIN_LEVEL_VALUE___GET_STATES_NO_OPPOSITE = eINSTANCE.getPin_level_Value__GetStatesNoOpposite();

		/**
		 * The meta object literal for the '{@link arduinoTrace.States.impl.StateImpl <em>State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoTrace.States.impl.StateImpl
		 * @see arduinoTrace.States.impl.StatesPackageImpl#getState()
		 * @generated
		 */
		EClass STATE = eINSTANCE.getState();

		/**
		 * The meta object literal for the '<em><b>Bluetooth Transceiver data Received Values</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__BLUETOOTH_TRANSCEIVER_DATA_RECEIVED_VALUES = eINSTANCE.getState_BluetoothTransceiver_dataReceived_Values();

		/**
		 * The meta object literal for the '<em><b>Bluetooth Transceiver data To Send Values</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__BLUETOOTH_TRANSCEIVER_DATA_TO_SEND_VALUES = eINSTANCE.getState_BluetoothTransceiver_dataToSend_Values();

		/**
		 * The meta object literal for the '<em><b>Boolean Variable value Values</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__BOOLEAN_VARIABLE_VALUE_VALUES = eINSTANCE.getState_BooleanVariable_value_Values();

		/**
		 * The meta object literal for the '<em><b>Ended Steps</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__ENDED_STEPS = eINSTANCE.getState_EndedSteps();

		/**
		 * The meta object literal for the '<em><b>Integer Variable value Values</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__INTEGER_VARIABLE_VALUE_VALUES = eINSTANCE.getState_IntegerVariable_value_Values();

		/**
		 * The meta object literal for the '<em><b>Pin level Values</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__PIN_LEVEL_VALUES = eINSTANCE.getState_Pin_level_Values();

		/**
		 * The meta object literal for the '<em><b>Started Steps</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__STARTED_STEPS = eINSTANCE.getState_StartedSteps();

		/**
		 * The meta object literal for the '{@link arduinoTrace.States.Value <em>Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoTrace.States.Value
		 * @see arduinoTrace.States.impl.StatesPackageImpl#getValue()
		 * @generated
		 */
		EClass VALUE = eINSTANCE.getValue();

		/**
		 * The meta object literal for the '<em><b>States No Opposite</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VALUE__STATES_NO_OPPOSITE = eINSTANCE.getValue_StatesNoOpposite();

	}

} //StatesPackage
