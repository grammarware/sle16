/**
 */
package arduinoTrace.States.arduino;

import org.eclipse.emf.ecore.EClass;
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
 * @see arduinoTrace.States.arduino.ArduinoFactory
 * @model kind="package"
 * @generated
 */
public interface ArduinoPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "arduino";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "arduinoTrace_arduino";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ArduinoPackage eINSTANCE = arduinoTrace.States.arduino.impl.ArduinoPackageImpl.init();

	/**
	 * The meta object id for the '{@link arduinoTrace.States.arduino.impl.TracedNamedElementImpl <em>Traced Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoTrace.States.arduino.impl.TracedNamedElementImpl
	 * @see arduinoTrace.States.arduino.impl.ArduinoPackageImpl#getTracedNamedElement()
	 * @generated
	 */
	int TRACED_NAMED_ELEMENT = 19;

	/**
	 * The number of structural features of the '<em>Traced Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_NAMED_ELEMENT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Traced Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_NAMED_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link arduinoTrace.States.arduino.impl.TracedModuleImpl <em>Traced Module</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoTrace.States.arduino.impl.TracedModuleImpl
	 * @see arduinoTrace.States.arduino.impl.ArduinoPackageImpl#getTracedModule()
	 * @generated
	 */
	int TRACED_MODULE = 17;

	/**
	 * The number of structural features of the '<em>Traced Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_MODULE_FEATURE_COUNT = TRACED_NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Traced Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_MODULE_OPERATION_COUNT = TRACED_NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link arduinoTrace.States.arduino.impl.TracedArduinoModuleImpl <em>Traced Arduino Module</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoTrace.States.arduino.impl.TracedArduinoModuleImpl
	 * @see arduinoTrace.States.arduino.impl.ArduinoPackageImpl#getTracedArduinoModule()
	 * @generated
	 */
	int TRACED_ARDUINO_MODULE = 6;

	/**
	 * The number of structural features of the '<em>Traced Arduino Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_ARDUINO_MODULE_FEATURE_COUNT = TRACED_MODULE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Traced Arduino Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_ARDUINO_MODULE_OPERATION_COUNT = TRACED_MODULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link arduinoTrace.States.arduino.impl.TracedArduinoAnalogModuleImpl <em>Traced Arduino Analog Module</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoTrace.States.arduino.impl.TracedArduinoAnalogModuleImpl
	 * @see arduinoTrace.States.arduino.impl.ArduinoPackageImpl#getTracedArduinoAnalogModule()
	 * @generated
	 */
	int TRACED_ARDUINO_ANALOG_MODULE = 2;

	/**
	 * The number of structural features of the '<em>Traced Arduino Analog Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_ARDUINO_ANALOG_MODULE_FEATURE_COUNT = TRACED_ARDUINO_MODULE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Traced Arduino Analog Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_ARDUINO_ANALOG_MODULE_OPERATION_COUNT = TRACED_ARDUINO_MODULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link arduinoTrace.States.arduino.impl.TracedAmbientLightSensorImpl <em>Traced Ambient Light Sensor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoTrace.States.arduino.impl.TracedAmbientLightSensorImpl
	 * @see arduinoTrace.States.arduino.impl.ArduinoPackageImpl#getTracedAmbientLightSensor()
	 * @generated
	 */
	int TRACED_AMBIENT_LIGHT_SENSOR = 0;

	/**
	 * The feature id for the '<em><b>Original Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_AMBIENT_LIGHT_SENSOR__ORIGINAL_OBJECT = TRACED_ARDUINO_ANALOG_MODULE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Traced Ambient Light Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_AMBIENT_LIGHT_SENSOR_FEATURE_COUNT = TRACED_ARDUINO_ANALOG_MODULE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Traced Ambient Light Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_AMBIENT_LIGHT_SENSOR_OPERATION_COUNT = TRACED_ARDUINO_ANALOG_MODULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link arduinoTrace.States.arduino.impl.TracedPinImpl <em>Traced Pin</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoTrace.States.arduino.impl.TracedPinImpl
	 * @see arduinoTrace.States.arduino.impl.ArduinoPackageImpl#getTracedPin()
	 * @generated
	 */
	int TRACED_PIN = 20;

	/**
	 * The feature id for the '<em><b>Level Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_PIN__LEVEL_SEQUENCE = TRACED_NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Traced Pin</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_PIN_FEATURE_COUNT = TRACED_NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Traced Pin</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_PIN_OPERATION_COUNT = TRACED_NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link arduinoTrace.States.arduino.impl.TracedAnalogPinImpl <em>Traced Analog Pin</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoTrace.States.arduino.impl.TracedAnalogPinImpl
	 * @see arduinoTrace.States.arduino.impl.ArduinoPackageImpl#getTracedAnalogPin()
	 * @generated
	 */
	int TRACED_ANALOG_PIN = 1;

	/**
	 * The feature id for the '<em><b>Level Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_ANALOG_PIN__LEVEL_SEQUENCE = TRACED_PIN__LEVEL_SEQUENCE;

	/**
	 * The feature id for the '<em><b>Original Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_ANALOG_PIN__ORIGINAL_OBJECT = TRACED_PIN_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Traced Analog Pin</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_ANALOG_PIN_FEATURE_COUNT = TRACED_PIN_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Traced Analog Pin</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_ANALOG_PIN_OPERATION_COUNT = TRACED_PIN_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link arduinoTrace.States.arduino.impl.TracedBoardImpl <em>Traced Board</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoTrace.States.arduino.impl.TracedBoardImpl
	 * @see arduinoTrace.States.arduino.impl.ArduinoPackageImpl#getTracedBoard()
	 * @generated
	 */
	int TRACED_BOARD = 8;

	/**
	 * The number of structural features of the '<em>Traced Board</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_BOARD_FEATURE_COUNT = TRACED_NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Traced Board</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_BOARD_OPERATION_COUNT = TRACED_NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link arduinoTrace.States.arduino.impl.TracedArduinoBoardImpl <em>Traced Arduino Board</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoTrace.States.arduino.impl.TracedArduinoBoardImpl
	 * @see arduinoTrace.States.arduino.impl.ArduinoPackageImpl#getTracedArduinoBoard()
	 * @generated
	 */
	int TRACED_ARDUINO_BOARD = 3;

	/**
	 * The feature id for the '<em><b>Original Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_ARDUINO_BOARD__ORIGINAL_OBJECT = TRACED_BOARD_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Traced Arduino Board</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_ARDUINO_BOARD_FEATURE_COUNT = TRACED_BOARD_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Traced Arduino Board</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_ARDUINO_BOARD_OPERATION_COUNT = TRACED_BOARD_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link arduinoTrace.States.arduino.impl.TracedArduinoDigitalModuleImpl <em>Traced Arduino Digital Module</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoTrace.States.arduino.impl.TracedArduinoDigitalModuleImpl
	 * @see arduinoTrace.States.arduino.impl.ArduinoPackageImpl#getTracedArduinoDigitalModule()
	 * @generated
	 */
	int TRACED_ARDUINO_DIGITAL_MODULE = 5;

	/**
	 * The number of structural features of the '<em>Traced Arduino Digital Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_ARDUINO_DIGITAL_MODULE_FEATURE_COUNT = TRACED_ARDUINO_MODULE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Traced Arduino Digital Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_ARDUINO_DIGITAL_MODULE_OPERATION_COUNT = TRACED_ARDUINO_MODULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link arduinoTrace.States.arduino.impl.TracedArduinoCommunicationModuleImpl <em>Traced Arduino Communication Module</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoTrace.States.arduino.impl.TracedArduinoCommunicationModuleImpl
	 * @see arduinoTrace.States.arduino.impl.ArduinoPackageImpl#getTracedArduinoCommunicationModule()
	 * @generated
	 */
	int TRACED_ARDUINO_COMMUNICATION_MODULE = 4;

	/**
	 * The number of structural features of the '<em>Traced Arduino Communication Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_ARDUINO_COMMUNICATION_MODULE_FEATURE_COUNT = TRACED_ARDUINO_DIGITAL_MODULE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Traced Arduino Communication Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_ARDUINO_COMMUNICATION_MODULE_OPERATION_COUNT = TRACED_ARDUINO_DIGITAL_MODULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link arduinoTrace.States.arduino.impl.TracedBluetoothTransceiverImpl <em>Traced Bluetooth Transceiver</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoTrace.States.arduino.impl.TracedBluetoothTransceiverImpl
	 * @see arduinoTrace.States.arduino.impl.ArduinoPackageImpl#getTracedBluetoothTransceiver()
	 * @generated
	 */
	int TRACED_BLUETOOTH_TRANSCEIVER = 7;

	/**
	 * The feature id for the '<em><b>Data Received Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_BLUETOOTH_TRANSCEIVER__DATA_RECEIVED_SEQUENCE = TRACED_ARDUINO_ANALOG_MODULE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Data To Send Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_BLUETOOTH_TRANSCEIVER__DATA_TO_SEND_SEQUENCE = TRACED_ARDUINO_ANALOG_MODULE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Original Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_BLUETOOTH_TRANSCEIVER__ORIGINAL_OBJECT = TRACED_ARDUINO_ANALOG_MODULE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Traced Bluetooth Transceiver</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_BLUETOOTH_TRANSCEIVER_FEATURE_COUNT = TRACED_ARDUINO_ANALOG_MODULE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Traced Bluetooth Transceiver</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_BLUETOOTH_TRANSCEIVER_OPERATION_COUNT = TRACED_ARDUINO_ANALOG_MODULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link arduinoTrace.States.arduino.impl.TracedVariableImpl <em>Traced Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoTrace.States.arduino.impl.TracedVariableImpl
	 * @see arduinoTrace.States.arduino.impl.ArduinoPackageImpl#getTracedVariable()
	 * @generated
	 */
	int TRACED_VARIABLE = 25;

	/**
	 * The number of structural features of the '<em>Traced Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_VARIABLE_FEATURE_COUNT = TRACED_NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Traced Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_VARIABLE_OPERATION_COUNT = TRACED_NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link arduinoTrace.States.arduino.impl.TracedBooleanVariableImpl <em>Traced Boolean Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoTrace.States.arduino.impl.TracedBooleanVariableImpl
	 * @see arduinoTrace.States.arduino.impl.ArduinoPackageImpl#getTracedBooleanVariable()
	 * @generated
	 */
	int TRACED_BOOLEAN_VARIABLE = 9;

	/**
	 * The feature id for the '<em><b>Original Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_BOOLEAN_VARIABLE__ORIGINAL_OBJECT = TRACED_VARIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_BOOLEAN_VARIABLE__VALUE_SEQUENCE = TRACED_VARIABLE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Traced Boolean Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_BOOLEAN_VARIABLE_FEATURE_COUNT = TRACED_VARIABLE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Traced Boolean Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_BOOLEAN_VARIABLE_OPERATION_COUNT = TRACED_VARIABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link arduinoTrace.States.arduino.impl.TracedBuzzerImpl <em>Traced Buzzer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoTrace.States.arduino.impl.TracedBuzzerImpl
	 * @see arduinoTrace.States.arduino.impl.ArduinoPackageImpl#getTracedBuzzer()
	 * @generated
	 */
	int TRACED_BUZZER = 10;

	/**
	 * The feature id for the '<em><b>Original Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_BUZZER__ORIGINAL_OBJECT = TRACED_ARDUINO_DIGITAL_MODULE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Traced Buzzer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_BUZZER_FEATURE_COUNT = TRACED_ARDUINO_DIGITAL_MODULE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Traced Buzzer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_BUZZER_OPERATION_COUNT = TRACED_ARDUINO_DIGITAL_MODULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link arduinoTrace.States.arduino.impl.TracedDigitalPinImpl <em>Traced Digital Pin</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoTrace.States.arduino.impl.TracedDigitalPinImpl
	 * @see arduinoTrace.States.arduino.impl.ArduinoPackageImpl#getTracedDigitalPin()
	 * @generated
	 */
	int TRACED_DIGITAL_PIN = 11;

	/**
	 * The feature id for the '<em><b>Level Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_DIGITAL_PIN__LEVEL_SEQUENCE = TRACED_PIN__LEVEL_SEQUENCE;

	/**
	 * The feature id for the '<em><b>Original Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_DIGITAL_PIN__ORIGINAL_OBJECT = TRACED_PIN_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Traced Digital Pin</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_DIGITAL_PIN_FEATURE_COUNT = TRACED_PIN_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Traced Digital Pin</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_DIGITAL_PIN_OPERATION_COUNT = TRACED_PIN_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link arduinoTrace.States.arduino.impl.TracedFanImpl <em>Traced Fan</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoTrace.States.arduino.impl.TracedFanImpl
	 * @see arduinoTrace.States.arduino.impl.ArduinoPackageImpl#getTracedFan()
	 * @generated
	 */
	int TRACED_FAN = 12;

	/**
	 * The feature id for the '<em><b>Original Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_FAN__ORIGINAL_OBJECT = TRACED_ARDUINO_DIGITAL_MODULE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Traced Fan</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_FAN_FEATURE_COUNT = TRACED_ARDUINO_DIGITAL_MODULE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Traced Fan</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_FAN_OPERATION_COUNT = TRACED_ARDUINO_DIGITAL_MODULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link arduinoTrace.States.arduino.impl.TracedInfraRedSensorImpl <em>Traced Infra Red Sensor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoTrace.States.arduino.impl.TracedInfraRedSensorImpl
	 * @see arduinoTrace.States.arduino.impl.ArduinoPackageImpl#getTracedInfraRedSensor()
	 * @generated
	 */
	int TRACED_INFRA_RED_SENSOR = 13;

	/**
	 * The feature id for the '<em><b>Original Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_INFRA_RED_SENSOR__ORIGINAL_OBJECT = TRACED_ARDUINO_DIGITAL_MODULE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Traced Infra Red Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_INFRA_RED_SENSOR_FEATURE_COUNT = TRACED_ARDUINO_DIGITAL_MODULE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Traced Infra Red Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_INFRA_RED_SENSOR_OPERATION_COUNT = TRACED_ARDUINO_DIGITAL_MODULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link arduinoTrace.States.arduino.impl.TracedIntegerVariableImpl <em>Traced Integer Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoTrace.States.arduino.impl.TracedIntegerVariableImpl
	 * @see arduinoTrace.States.arduino.impl.ArduinoPackageImpl#getTracedIntegerVariable()
	 * @generated
	 */
	int TRACED_INTEGER_VARIABLE = 14;

	/**
	 * The feature id for the '<em><b>Original Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_INTEGER_VARIABLE__ORIGINAL_OBJECT = TRACED_VARIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_INTEGER_VARIABLE__VALUE_SEQUENCE = TRACED_VARIABLE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Traced Integer Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_INTEGER_VARIABLE_FEATURE_COUNT = TRACED_VARIABLE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Traced Integer Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_INTEGER_VARIABLE_OPERATION_COUNT = TRACED_VARIABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link arduinoTrace.States.arduino.impl.TracedLEDImpl <em>Traced LED</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoTrace.States.arduino.impl.TracedLEDImpl
	 * @see arduinoTrace.States.arduino.impl.ArduinoPackageImpl#getTracedLED()
	 * @generated
	 */
	int TRACED_LED = 15;

	/**
	 * The feature id for the '<em><b>Original Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_LED__ORIGINAL_OBJECT = TRACED_ARDUINO_DIGITAL_MODULE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Traced LED</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_LED_FEATURE_COUNT = TRACED_ARDUINO_DIGITAL_MODULE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Traced LED</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_LED_OPERATION_COUNT = TRACED_ARDUINO_DIGITAL_MODULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link arduinoTrace.States.arduino.impl.TracedMicroServoImpl <em>Traced Micro Servo</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoTrace.States.arduino.impl.TracedMicroServoImpl
	 * @see arduinoTrace.States.arduino.impl.ArduinoPackageImpl#getTracedMicroServo()
	 * @generated
	 */
	int TRACED_MICRO_SERVO = 16;

	/**
	 * The feature id for the '<em><b>Original Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_MICRO_SERVO__ORIGINAL_OBJECT = TRACED_ARDUINO_DIGITAL_MODULE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Traced Micro Servo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_MICRO_SERVO_FEATURE_COUNT = TRACED_ARDUINO_DIGITAL_MODULE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Traced Micro Servo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_MICRO_SERVO_OPERATION_COUNT = TRACED_ARDUINO_DIGITAL_MODULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link arduinoTrace.States.arduino.impl.TracedMusicPlayerImpl <em>Traced Music Player</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoTrace.States.arduino.impl.TracedMusicPlayerImpl
	 * @see arduinoTrace.States.arduino.impl.ArduinoPackageImpl#getTracedMusicPlayer()
	 * @generated
	 */
	int TRACED_MUSIC_PLAYER = 18;

	/**
	 * The feature id for the '<em><b>Original Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_MUSIC_PLAYER__ORIGINAL_OBJECT = TRACED_ARDUINO_ANALOG_MODULE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Traced Music Player</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_MUSIC_PLAYER_FEATURE_COUNT = TRACED_ARDUINO_ANALOG_MODULE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Traced Music Player</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_MUSIC_PLAYER_OPERATION_COUNT = TRACED_ARDUINO_ANALOG_MODULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link arduinoTrace.States.arduino.impl.TracedPushButtonImpl <em>Traced Push Button</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoTrace.States.arduino.impl.TracedPushButtonImpl
	 * @see arduinoTrace.States.arduino.impl.ArduinoPackageImpl#getTracedPushButton()
	 * @generated
	 */
	int TRACED_PUSH_BUTTON = 21;

	/**
	 * The feature id for the '<em><b>Original Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_PUSH_BUTTON__ORIGINAL_OBJECT = TRACED_ARDUINO_DIGITAL_MODULE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Traced Push Button</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_PUSH_BUTTON_FEATURE_COUNT = TRACED_ARDUINO_DIGITAL_MODULE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Traced Push Button</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_PUSH_BUTTON_OPERATION_COUNT = TRACED_ARDUINO_DIGITAL_MODULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link arduinoTrace.States.arduino.impl.TracedRotationSensorImpl <em>Traced Rotation Sensor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoTrace.States.arduino.impl.TracedRotationSensorImpl
	 * @see arduinoTrace.States.arduino.impl.ArduinoPackageImpl#getTracedRotationSensor()
	 * @generated
	 */
	int TRACED_ROTATION_SENSOR = 22;

	/**
	 * The feature id for the '<em><b>Original Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_ROTATION_SENSOR__ORIGINAL_OBJECT = TRACED_ARDUINO_ANALOG_MODULE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Traced Rotation Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_ROTATION_SENSOR_FEATURE_COUNT = TRACED_ARDUINO_ANALOG_MODULE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Traced Rotation Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_ROTATION_SENSOR_OPERATION_COUNT = TRACED_ARDUINO_ANALOG_MODULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link arduinoTrace.States.arduino.impl.TracedSketchImpl <em>Traced Sketch</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoTrace.States.arduino.impl.TracedSketchImpl
	 * @see arduinoTrace.States.arduino.impl.ArduinoPackageImpl#getTracedSketch()
	 * @generated
	 */
	int TRACED_SKETCH = 23;

	/**
	 * The feature id for the '<em><b>Original Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_SKETCH__ORIGINAL_OBJECT = TRACED_NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Traced Sketch</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_SKETCH_FEATURE_COUNT = TRACED_NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Traced Sketch</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_SKETCH_OPERATION_COUNT = TRACED_NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link arduinoTrace.States.arduino.impl.TracedSoundSensorImpl <em>Traced Sound Sensor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoTrace.States.arduino.impl.TracedSoundSensorImpl
	 * @see arduinoTrace.States.arduino.impl.ArduinoPackageImpl#getTracedSoundSensor()
	 * @generated
	 */
	int TRACED_SOUND_SENSOR = 24;

	/**
	 * The feature id for the '<em><b>Original Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_SOUND_SENSOR__ORIGINAL_OBJECT = TRACED_ARDUINO_ANALOG_MODULE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Traced Sound Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_SOUND_SENSOR_FEATURE_COUNT = TRACED_ARDUINO_ANALOG_MODULE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Traced Sound Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_SOUND_SENSOR_OPERATION_COUNT = TRACED_ARDUINO_ANALOG_MODULE_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link arduinoTrace.States.arduino.TracedAmbientLightSensor <em>Traced Ambient Light Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Ambient Light Sensor</em>'.
	 * @see arduinoTrace.States.arduino.TracedAmbientLightSensor
	 * @generated
	 */
	EClass getTracedAmbientLightSensor();

	/**
	 * Returns the meta object for the reference '{@link arduinoTrace.States.arduino.TracedAmbientLightSensor#getOriginalObject <em>Original Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Original Object</em>'.
	 * @see arduinoTrace.States.arduino.TracedAmbientLightSensor#getOriginalObject()
	 * @see #getTracedAmbientLightSensor()
	 * @generated
	 */
	EReference getTracedAmbientLightSensor_OriginalObject();

	/**
	 * Returns the meta object for class '{@link arduinoTrace.States.arduino.TracedAnalogPin <em>Traced Analog Pin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Analog Pin</em>'.
	 * @see arduinoTrace.States.arduino.TracedAnalogPin
	 * @generated
	 */
	EClass getTracedAnalogPin();

	/**
	 * Returns the meta object for the reference '{@link arduinoTrace.States.arduino.TracedAnalogPin#getOriginalObject <em>Original Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Original Object</em>'.
	 * @see arduinoTrace.States.arduino.TracedAnalogPin#getOriginalObject()
	 * @see #getTracedAnalogPin()
	 * @generated
	 */
	EReference getTracedAnalogPin_OriginalObject();

	/**
	 * Returns the meta object for class '{@link arduinoTrace.States.arduino.TracedArduinoAnalogModule <em>Traced Arduino Analog Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Arduino Analog Module</em>'.
	 * @see arduinoTrace.States.arduino.TracedArduinoAnalogModule
	 * @generated
	 */
	EClass getTracedArduinoAnalogModule();

	/**
	 * Returns the meta object for class '{@link arduinoTrace.States.arduino.TracedArduinoBoard <em>Traced Arduino Board</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Arduino Board</em>'.
	 * @see arduinoTrace.States.arduino.TracedArduinoBoard
	 * @generated
	 */
	EClass getTracedArduinoBoard();

	/**
	 * Returns the meta object for the reference '{@link arduinoTrace.States.arduino.TracedArduinoBoard#getOriginalObject <em>Original Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Original Object</em>'.
	 * @see arduinoTrace.States.arduino.TracedArduinoBoard#getOriginalObject()
	 * @see #getTracedArduinoBoard()
	 * @generated
	 */
	EReference getTracedArduinoBoard_OriginalObject();

	/**
	 * Returns the meta object for class '{@link arduinoTrace.States.arduino.TracedArduinoCommunicationModule <em>Traced Arduino Communication Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Arduino Communication Module</em>'.
	 * @see arduinoTrace.States.arduino.TracedArduinoCommunicationModule
	 * @generated
	 */
	EClass getTracedArduinoCommunicationModule();

	/**
	 * Returns the meta object for class '{@link arduinoTrace.States.arduino.TracedArduinoDigitalModule <em>Traced Arduino Digital Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Arduino Digital Module</em>'.
	 * @see arduinoTrace.States.arduino.TracedArduinoDigitalModule
	 * @generated
	 */
	EClass getTracedArduinoDigitalModule();

	/**
	 * Returns the meta object for class '{@link arduinoTrace.States.arduino.TracedArduinoModule <em>Traced Arduino Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Arduino Module</em>'.
	 * @see arduinoTrace.States.arduino.TracedArduinoModule
	 * @generated
	 */
	EClass getTracedArduinoModule();

	/**
	 * Returns the meta object for class '{@link arduinoTrace.States.arduino.TracedBluetoothTransceiver <em>Traced Bluetooth Transceiver</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Bluetooth Transceiver</em>'.
	 * @see arduinoTrace.States.arduino.TracedBluetoothTransceiver
	 * @generated
	 */
	EClass getTracedBluetoothTransceiver();

	/**
	 * Returns the meta object for the containment reference list '{@link arduinoTrace.States.arduino.TracedBluetoothTransceiver#getDataReceivedSequence <em>Data Received Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Data Received Sequence</em>'.
	 * @see arduinoTrace.States.arduino.TracedBluetoothTransceiver#getDataReceivedSequence()
	 * @see #getTracedBluetoothTransceiver()
	 * @generated
	 */
	EReference getTracedBluetoothTransceiver_DataReceivedSequence();

	/**
	 * Returns the meta object for the containment reference list '{@link arduinoTrace.States.arduino.TracedBluetoothTransceiver#getDataToSendSequence <em>Data To Send Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Data To Send Sequence</em>'.
	 * @see arduinoTrace.States.arduino.TracedBluetoothTransceiver#getDataToSendSequence()
	 * @see #getTracedBluetoothTransceiver()
	 * @generated
	 */
	EReference getTracedBluetoothTransceiver_DataToSendSequence();

	/**
	 * Returns the meta object for the reference '{@link arduinoTrace.States.arduino.TracedBluetoothTransceiver#getOriginalObject <em>Original Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Original Object</em>'.
	 * @see arduinoTrace.States.arduino.TracedBluetoothTransceiver#getOriginalObject()
	 * @see #getTracedBluetoothTransceiver()
	 * @generated
	 */
	EReference getTracedBluetoothTransceiver_OriginalObject();

	/**
	 * Returns the meta object for class '{@link arduinoTrace.States.arduino.TracedBoard <em>Traced Board</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Board</em>'.
	 * @see arduinoTrace.States.arduino.TracedBoard
	 * @generated
	 */
	EClass getTracedBoard();

	/**
	 * Returns the meta object for class '{@link arduinoTrace.States.arduino.TracedBooleanVariable <em>Traced Boolean Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Boolean Variable</em>'.
	 * @see arduinoTrace.States.arduino.TracedBooleanVariable
	 * @generated
	 */
	EClass getTracedBooleanVariable();

	/**
	 * Returns the meta object for the reference '{@link arduinoTrace.States.arduino.TracedBooleanVariable#getOriginalObject <em>Original Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Original Object</em>'.
	 * @see arduinoTrace.States.arduino.TracedBooleanVariable#getOriginalObject()
	 * @see #getTracedBooleanVariable()
	 * @generated
	 */
	EReference getTracedBooleanVariable_OriginalObject();

	/**
	 * Returns the meta object for the containment reference list '{@link arduinoTrace.States.arduino.TracedBooleanVariable#getValueSequence <em>Value Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Value Sequence</em>'.
	 * @see arduinoTrace.States.arduino.TracedBooleanVariable#getValueSequence()
	 * @see #getTracedBooleanVariable()
	 * @generated
	 */
	EReference getTracedBooleanVariable_ValueSequence();

	/**
	 * Returns the meta object for class '{@link arduinoTrace.States.arduino.TracedBuzzer <em>Traced Buzzer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Buzzer</em>'.
	 * @see arduinoTrace.States.arduino.TracedBuzzer
	 * @generated
	 */
	EClass getTracedBuzzer();

	/**
	 * Returns the meta object for the reference '{@link arduinoTrace.States.arduino.TracedBuzzer#getOriginalObject <em>Original Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Original Object</em>'.
	 * @see arduinoTrace.States.arduino.TracedBuzzer#getOriginalObject()
	 * @see #getTracedBuzzer()
	 * @generated
	 */
	EReference getTracedBuzzer_OriginalObject();

	/**
	 * Returns the meta object for class '{@link arduinoTrace.States.arduino.TracedDigitalPin <em>Traced Digital Pin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Digital Pin</em>'.
	 * @see arduinoTrace.States.arduino.TracedDigitalPin
	 * @generated
	 */
	EClass getTracedDigitalPin();

	/**
	 * Returns the meta object for the reference '{@link arduinoTrace.States.arduino.TracedDigitalPin#getOriginalObject <em>Original Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Original Object</em>'.
	 * @see arduinoTrace.States.arduino.TracedDigitalPin#getOriginalObject()
	 * @see #getTracedDigitalPin()
	 * @generated
	 */
	EReference getTracedDigitalPin_OriginalObject();

	/**
	 * Returns the meta object for class '{@link arduinoTrace.States.arduino.TracedFan <em>Traced Fan</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Fan</em>'.
	 * @see arduinoTrace.States.arduino.TracedFan
	 * @generated
	 */
	EClass getTracedFan();

	/**
	 * Returns the meta object for the reference '{@link arduinoTrace.States.arduino.TracedFan#getOriginalObject <em>Original Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Original Object</em>'.
	 * @see arduinoTrace.States.arduino.TracedFan#getOriginalObject()
	 * @see #getTracedFan()
	 * @generated
	 */
	EReference getTracedFan_OriginalObject();

	/**
	 * Returns the meta object for class '{@link arduinoTrace.States.arduino.TracedInfraRedSensor <em>Traced Infra Red Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Infra Red Sensor</em>'.
	 * @see arduinoTrace.States.arduino.TracedInfraRedSensor
	 * @generated
	 */
	EClass getTracedInfraRedSensor();

	/**
	 * Returns the meta object for the reference '{@link arduinoTrace.States.arduino.TracedInfraRedSensor#getOriginalObject <em>Original Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Original Object</em>'.
	 * @see arduinoTrace.States.arduino.TracedInfraRedSensor#getOriginalObject()
	 * @see #getTracedInfraRedSensor()
	 * @generated
	 */
	EReference getTracedInfraRedSensor_OriginalObject();

	/**
	 * Returns the meta object for class '{@link arduinoTrace.States.arduino.TracedIntegerVariable <em>Traced Integer Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Integer Variable</em>'.
	 * @see arduinoTrace.States.arduino.TracedIntegerVariable
	 * @generated
	 */
	EClass getTracedIntegerVariable();

	/**
	 * Returns the meta object for the reference '{@link arduinoTrace.States.arduino.TracedIntegerVariable#getOriginalObject <em>Original Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Original Object</em>'.
	 * @see arduinoTrace.States.arduino.TracedIntegerVariable#getOriginalObject()
	 * @see #getTracedIntegerVariable()
	 * @generated
	 */
	EReference getTracedIntegerVariable_OriginalObject();

	/**
	 * Returns the meta object for the containment reference list '{@link arduinoTrace.States.arduino.TracedIntegerVariable#getValueSequence <em>Value Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Value Sequence</em>'.
	 * @see arduinoTrace.States.arduino.TracedIntegerVariable#getValueSequence()
	 * @see #getTracedIntegerVariable()
	 * @generated
	 */
	EReference getTracedIntegerVariable_ValueSequence();

	/**
	 * Returns the meta object for class '{@link arduinoTrace.States.arduino.TracedLED <em>Traced LED</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced LED</em>'.
	 * @see arduinoTrace.States.arduino.TracedLED
	 * @generated
	 */
	EClass getTracedLED();

	/**
	 * Returns the meta object for the reference '{@link arduinoTrace.States.arduino.TracedLED#getOriginalObject <em>Original Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Original Object</em>'.
	 * @see arduinoTrace.States.arduino.TracedLED#getOriginalObject()
	 * @see #getTracedLED()
	 * @generated
	 */
	EReference getTracedLED_OriginalObject();

	/**
	 * Returns the meta object for class '{@link arduinoTrace.States.arduino.TracedMicroServo <em>Traced Micro Servo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Micro Servo</em>'.
	 * @see arduinoTrace.States.arduino.TracedMicroServo
	 * @generated
	 */
	EClass getTracedMicroServo();

	/**
	 * Returns the meta object for the reference '{@link arduinoTrace.States.arduino.TracedMicroServo#getOriginalObject <em>Original Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Original Object</em>'.
	 * @see arduinoTrace.States.arduino.TracedMicroServo#getOriginalObject()
	 * @see #getTracedMicroServo()
	 * @generated
	 */
	EReference getTracedMicroServo_OriginalObject();

	/**
	 * Returns the meta object for class '{@link arduinoTrace.States.arduino.TracedModule <em>Traced Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Module</em>'.
	 * @see arduinoTrace.States.arduino.TracedModule
	 * @generated
	 */
	EClass getTracedModule();

	/**
	 * Returns the meta object for class '{@link arduinoTrace.States.arduino.TracedMusicPlayer <em>Traced Music Player</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Music Player</em>'.
	 * @see arduinoTrace.States.arduino.TracedMusicPlayer
	 * @generated
	 */
	EClass getTracedMusicPlayer();

	/**
	 * Returns the meta object for the reference '{@link arduinoTrace.States.arduino.TracedMusicPlayer#getOriginalObject <em>Original Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Original Object</em>'.
	 * @see arduinoTrace.States.arduino.TracedMusicPlayer#getOriginalObject()
	 * @see #getTracedMusicPlayer()
	 * @generated
	 */
	EReference getTracedMusicPlayer_OriginalObject();

	/**
	 * Returns the meta object for class '{@link arduinoTrace.States.arduino.TracedNamedElement <em>Traced Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Named Element</em>'.
	 * @see arduinoTrace.States.arduino.TracedNamedElement
	 * @generated
	 */
	EClass getTracedNamedElement();

	/**
	 * Returns the meta object for class '{@link arduinoTrace.States.arduino.TracedPin <em>Traced Pin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Pin</em>'.
	 * @see arduinoTrace.States.arduino.TracedPin
	 * @generated
	 */
	EClass getTracedPin();

	/**
	 * Returns the meta object for the containment reference list '{@link arduinoTrace.States.arduino.TracedPin#getLevelSequence <em>Level Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Level Sequence</em>'.
	 * @see arduinoTrace.States.arduino.TracedPin#getLevelSequence()
	 * @see #getTracedPin()
	 * @generated
	 */
	EReference getTracedPin_LevelSequence();

	/**
	 * Returns the meta object for class '{@link arduinoTrace.States.arduino.TracedPushButton <em>Traced Push Button</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Push Button</em>'.
	 * @see arduinoTrace.States.arduino.TracedPushButton
	 * @generated
	 */
	EClass getTracedPushButton();

	/**
	 * Returns the meta object for the reference '{@link arduinoTrace.States.arduino.TracedPushButton#getOriginalObject <em>Original Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Original Object</em>'.
	 * @see arduinoTrace.States.arduino.TracedPushButton#getOriginalObject()
	 * @see #getTracedPushButton()
	 * @generated
	 */
	EReference getTracedPushButton_OriginalObject();

	/**
	 * Returns the meta object for class '{@link arduinoTrace.States.arduino.TracedRotationSensor <em>Traced Rotation Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Rotation Sensor</em>'.
	 * @see arduinoTrace.States.arduino.TracedRotationSensor
	 * @generated
	 */
	EClass getTracedRotationSensor();

	/**
	 * Returns the meta object for the reference '{@link arduinoTrace.States.arduino.TracedRotationSensor#getOriginalObject <em>Original Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Original Object</em>'.
	 * @see arduinoTrace.States.arduino.TracedRotationSensor#getOriginalObject()
	 * @see #getTracedRotationSensor()
	 * @generated
	 */
	EReference getTracedRotationSensor_OriginalObject();

	/**
	 * Returns the meta object for class '{@link arduinoTrace.States.arduino.TracedSketch <em>Traced Sketch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Sketch</em>'.
	 * @see arduinoTrace.States.arduino.TracedSketch
	 * @generated
	 */
	EClass getTracedSketch();

	/**
	 * Returns the meta object for the reference '{@link arduinoTrace.States.arduino.TracedSketch#getOriginalObject <em>Original Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Original Object</em>'.
	 * @see arduinoTrace.States.arduino.TracedSketch#getOriginalObject()
	 * @see #getTracedSketch()
	 * @generated
	 */
	EReference getTracedSketch_OriginalObject();

	/**
	 * Returns the meta object for class '{@link arduinoTrace.States.arduino.TracedSoundSensor <em>Traced Sound Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Sound Sensor</em>'.
	 * @see arduinoTrace.States.arduino.TracedSoundSensor
	 * @generated
	 */
	EClass getTracedSoundSensor();

	/**
	 * Returns the meta object for the reference '{@link arduinoTrace.States.arduino.TracedSoundSensor#getOriginalObject <em>Original Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Original Object</em>'.
	 * @see arduinoTrace.States.arduino.TracedSoundSensor#getOriginalObject()
	 * @see #getTracedSoundSensor()
	 * @generated
	 */
	EReference getTracedSoundSensor_OriginalObject();

	/**
	 * Returns the meta object for class '{@link arduinoTrace.States.arduino.TracedVariable <em>Traced Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Variable</em>'.
	 * @see arduinoTrace.States.arduino.TracedVariable
	 * @generated
	 */
	EClass getTracedVariable();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ArduinoFactory getArduinoFactory();

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
		 * The meta object literal for the '{@link arduinoTrace.States.arduino.impl.TracedAmbientLightSensorImpl <em>Traced Ambient Light Sensor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoTrace.States.arduino.impl.TracedAmbientLightSensorImpl
		 * @see arduinoTrace.States.arduino.impl.ArduinoPackageImpl#getTracedAmbientLightSensor()
		 * @generated
		 */
		EClass TRACED_AMBIENT_LIGHT_SENSOR = eINSTANCE.getTracedAmbientLightSensor();

		/**
		 * The meta object literal for the '<em><b>Original Object</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACED_AMBIENT_LIGHT_SENSOR__ORIGINAL_OBJECT = eINSTANCE.getTracedAmbientLightSensor_OriginalObject();

		/**
		 * The meta object literal for the '{@link arduinoTrace.States.arduino.impl.TracedAnalogPinImpl <em>Traced Analog Pin</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoTrace.States.arduino.impl.TracedAnalogPinImpl
		 * @see arduinoTrace.States.arduino.impl.ArduinoPackageImpl#getTracedAnalogPin()
		 * @generated
		 */
		EClass TRACED_ANALOG_PIN = eINSTANCE.getTracedAnalogPin();

		/**
		 * The meta object literal for the '<em><b>Original Object</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACED_ANALOG_PIN__ORIGINAL_OBJECT = eINSTANCE.getTracedAnalogPin_OriginalObject();

		/**
		 * The meta object literal for the '{@link arduinoTrace.States.arduino.impl.TracedArduinoAnalogModuleImpl <em>Traced Arduino Analog Module</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoTrace.States.arduino.impl.TracedArduinoAnalogModuleImpl
		 * @see arduinoTrace.States.arduino.impl.ArduinoPackageImpl#getTracedArduinoAnalogModule()
		 * @generated
		 */
		EClass TRACED_ARDUINO_ANALOG_MODULE = eINSTANCE.getTracedArduinoAnalogModule();

		/**
		 * The meta object literal for the '{@link arduinoTrace.States.arduino.impl.TracedArduinoBoardImpl <em>Traced Arduino Board</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoTrace.States.arduino.impl.TracedArduinoBoardImpl
		 * @see arduinoTrace.States.arduino.impl.ArduinoPackageImpl#getTracedArduinoBoard()
		 * @generated
		 */
		EClass TRACED_ARDUINO_BOARD = eINSTANCE.getTracedArduinoBoard();

		/**
		 * The meta object literal for the '<em><b>Original Object</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACED_ARDUINO_BOARD__ORIGINAL_OBJECT = eINSTANCE.getTracedArduinoBoard_OriginalObject();

		/**
		 * The meta object literal for the '{@link arduinoTrace.States.arduino.impl.TracedArduinoCommunicationModuleImpl <em>Traced Arduino Communication Module</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoTrace.States.arduino.impl.TracedArduinoCommunicationModuleImpl
		 * @see arduinoTrace.States.arduino.impl.ArduinoPackageImpl#getTracedArduinoCommunicationModule()
		 * @generated
		 */
		EClass TRACED_ARDUINO_COMMUNICATION_MODULE = eINSTANCE.getTracedArduinoCommunicationModule();

		/**
		 * The meta object literal for the '{@link arduinoTrace.States.arduino.impl.TracedArduinoDigitalModuleImpl <em>Traced Arduino Digital Module</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoTrace.States.arduino.impl.TracedArduinoDigitalModuleImpl
		 * @see arduinoTrace.States.arduino.impl.ArduinoPackageImpl#getTracedArduinoDigitalModule()
		 * @generated
		 */
		EClass TRACED_ARDUINO_DIGITAL_MODULE = eINSTANCE.getTracedArduinoDigitalModule();

		/**
		 * The meta object literal for the '{@link arduinoTrace.States.arduino.impl.TracedArduinoModuleImpl <em>Traced Arduino Module</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoTrace.States.arduino.impl.TracedArduinoModuleImpl
		 * @see arduinoTrace.States.arduino.impl.ArduinoPackageImpl#getTracedArduinoModule()
		 * @generated
		 */
		EClass TRACED_ARDUINO_MODULE = eINSTANCE.getTracedArduinoModule();

		/**
		 * The meta object literal for the '{@link arduinoTrace.States.arduino.impl.TracedBluetoothTransceiverImpl <em>Traced Bluetooth Transceiver</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoTrace.States.arduino.impl.TracedBluetoothTransceiverImpl
		 * @see arduinoTrace.States.arduino.impl.ArduinoPackageImpl#getTracedBluetoothTransceiver()
		 * @generated
		 */
		EClass TRACED_BLUETOOTH_TRANSCEIVER = eINSTANCE.getTracedBluetoothTransceiver();

		/**
		 * The meta object literal for the '<em><b>Data Received Sequence</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACED_BLUETOOTH_TRANSCEIVER__DATA_RECEIVED_SEQUENCE = eINSTANCE.getTracedBluetoothTransceiver_DataReceivedSequence();

		/**
		 * The meta object literal for the '<em><b>Data To Send Sequence</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACED_BLUETOOTH_TRANSCEIVER__DATA_TO_SEND_SEQUENCE = eINSTANCE.getTracedBluetoothTransceiver_DataToSendSequence();

		/**
		 * The meta object literal for the '<em><b>Original Object</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACED_BLUETOOTH_TRANSCEIVER__ORIGINAL_OBJECT = eINSTANCE.getTracedBluetoothTransceiver_OriginalObject();

		/**
		 * The meta object literal for the '{@link arduinoTrace.States.arduino.impl.TracedBoardImpl <em>Traced Board</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoTrace.States.arduino.impl.TracedBoardImpl
		 * @see arduinoTrace.States.arduino.impl.ArduinoPackageImpl#getTracedBoard()
		 * @generated
		 */
		EClass TRACED_BOARD = eINSTANCE.getTracedBoard();

		/**
		 * The meta object literal for the '{@link arduinoTrace.States.arduino.impl.TracedBooleanVariableImpl <em>Traced Boolean Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoTrace.States.arduino.impl.TracedBooleanVariableImpl
		 * @see arduinoTrace.States.arduino.impl.ArduinoPackageImpl#getTracedBooleanVariable()
		 * @generated
		 */
		EClass TRACED_BOOLEAN_VARIABLE = eINSTANCE.getTracedBooleanVariable();

		/**
		 * The meta object literal for the '<em><b>Original Object</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACED_BOOLEAN_VARIABLE__ORIGINAL_OBJECT = eINSTANCE.getTracedBooleanVariable_OriginalObject();

		/**
		 * The meta object literal for the '<em><b>Value Sequence</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACED_BOOLEAN_VARIABLE__VALUE_SEQUENCE = eINSTANCE.getTracedBooleanVariable_ValueSequence();

		/**
		 * The meta object literal for the '{@link arduinoTrace.States.arduino.impl.TracedBuzzerImpl <em>Traced Buzzer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoTrace.States.arduino.impl.TracedBuzzerImpl
		 * @see arduinoTrace.States.arduino.impl.ArduinoPackageImpl#getTracedBuzzer()
		 * @generated
		 */
		EClass TRACED_BUZZER = eINSTANCE.getTracedBuzzer();

		/**
		 * The meta object literal for the '<em><b>Original Object</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACED_BUZZER__ORIGINAL_OBJECT = eINSTANCE.getTracedBuzzer_OriginalObject();

		/**
		 * The meta object literal for the '{@link arduinoTrace.States.arduino.impl.TracedDigitalPinImpl <em>Traced Digital Pin</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoTrace.States.arduino.impl.TracedDigitalPinImpl
		 * @see arduinoTrace.States.arduino.impl.ArduinoPackageImpl#getTracedDigitalPin()
		 * @generated
		 */
		EClass TRACED_DIGITAL_PIN = eINSTANCE.getTracedDigitalPin();

		/**
		 * The meta object literal for the '<em><b>Original Object</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACED_DIGITAL_PIN__ORIGINAL_OBJECT = eINSTANCE.getTracedDigitalPin_OriginalObject();

		/**
		 * The meta object literal for the '{@link arduinoTrace.States.arduino.impl.TracedFanImpl <em>Traced Fan</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoTrace.States.arduino.impl.TracedFanImpl
		 * @see arduinoTrace.States.arduino.impl.ArduinoPackageImpl#getTracedFan()
		 * @generated
		 */
		EClass TRACED_FAN = eINSTANCE.getTracedFan();

		/**
		 * The meta object literal for the '<em><b>Original Object</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACED_FAN__ORIGINAL_OBJECT = eINSTANCE.getTracedFan_OriginalObject();

		/**
		 * The meta object literal for the '{@link arduinoTrace.States.arduino.impl.TracedInfraRedSensorImpl <em>Traced Infra Red Sensor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoTrace.States.arduino.impl.TracedInfraRedSensorImpl
		 * @see arduinoTrace.States.arduino.impl.ArduinoPackageImpl#getTracedInfraRedSensor()
		 * @generated
		 */
		EClass TRACED_INFRA_RED_SENSOR = eINSTANCE.getTracedInfraRedSensor();

		/**
		 * The meta object literal for the '<em><b>Original Object</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACED_INFRA_RED_SENSOR__ORIGINAL_OBJECT = eINSTANCE.getTracedInfraRedSensor_OriginalObject();

		/**
		 * The meta object literal for the '{@link arduinoTrace.States.arduino.impl.TracedIntegerVariableImpl <em>Traced Integer Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoTrace.States.arduino.impl.TracedIntegerVariableImpl
		 * @see arduinoTrace.States.arduino.impl.ArduinoPackageImpl#getTracedIntegerVariable()
		 * @generated
		 */
		EClass TRACED_INTEGER_VARIABLE = eINSTANCE.getTracedIntegerVariable();

		/**
		 * The meta object literal for the '<em><b>Original Object</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACED_INTEGER_VARIABLE__ORIGINAL_OBJECT = eINSTANCE.getTracedIntegerVariable_OriginalObject();

		/**
		 * The meta object literal for the '<em><b>Value Sequence</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACED_INTEGER_VARIABLE__VALUE_SEQUENCE = eINSTANCE.getTracedIntegerVariable_ValueSequence();

		/**
		 * The meta object literal for the '{@link arduinoTrace.States.arduino.impl.TracedLEDImpl <em>Traced LED</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoTrace.States.arduino.impl.TracedLEDImpl
		 * @see arduinoTrace.States.arduino.impl.ArduinoPackageImpl#getTracedLED()
		 * @generated
		 */
		EClass TRACED_LED = eINSTANCE.getTracedLED();

		/**
		 * The meta object literal for the '<em><b>Original Object</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACED_LED__ORIGINAL_OBJECT = eINSTANCE.getTracedLED_OriginalObject();

		/**
		 * The meta object literal for the '{@link arduinoTrace.States.arduino.impl.TracedMicroServoImpl <em>Traced Micro Servo</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoTrace.States.arduino.impl.TracedMicroServoImpl
		 * @see arduinoTrace.States.arduino.impl.ArduinoPackageImpl#getTracedMicroServo()
		 * @generated
		 */
		EClass TRACED_MICRO_SERVO = eINSTANCE.getTracedMicroServo();

		/**
		 * The meta object literal for the '<em><b>Original Object</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACED_MICRO_SERVO__ORIGINAL_OBJECT = eINSTANCE.getTracedMicroServo_OriginalObject();

		/**
		 * The meta object literal for the '{@link arduinoTrace.States.arduino.impl.TracedModuleImpl <em>Traced Module</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoTrace.States.arduino.impl.TracedModuleImpl
		 * @see arduinoTrace.States.arduino.impl.ArduinoPackageImpl#getTracedModule()
		 * @generated
		 */
		EClass TRACED_MODULE = eINSTANCE.getTracedModule();

		/**
		 * The meta object literal for the '{@link arduinoTrace.States.arduino.impl.TracedMusicPlayerImpl <em>Traced Music Player</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoTrace.States.arduino.impl.TracedMusicPlayerImpl
		 * @see arduinoTrace.States.arduino.impl.ArduinoPackageImpl#getTracedMusicPlayer()
		 * @generated
		 */
		EClass TRACED_MUSIC_PLAYER = eINSTANCE.getTracedMusicPlayer();

		/**
		 * The meta object literal for the '<em><b>Original Object</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACED_MUSIC_PLAYER__ORIGINAL_OBJECT = eINSTANCE.getTracedMusicPlayer_OriginalObject();

		/**
		 * The meta object literal for the '{@link arduinoTrace.States.arduino.impl.TracedNamedElementImpl <em>Traced Named Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoTrace.States.arduino.impl.TracedNamedElementImpl
		 * @see arduinoTrace.States.arduino.impl.ArduinoPackageImpl#getTracedNamedElement()
		 * @generated
		 */
		EClass TRACED_NAMED_ELEMENT = eINSTANCE.getTracedNamedElement();

		/**
		 * The meta object literal for the '{@link arduinoTrace.States.arduino.impl.TracedPinImpl <em>Traced Pin</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoTrace.States.arduino.impl.TracedPinImpl
		 * @see arduinoTrace.States.arduino.impl.ArduinoPackageImpl#getTracedPin()
		 * @generated
		 */
		EClass TRACED_PIN = eINSTANCE.getTracedPin();

		/**
		 * The meta object literal for the '<em><b>Level Sequence</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACED_PIN__LEVEL_SEQUENCE = eINSTANCE.getTracedPin_LevelSequence();

		/**
		 * The meta object literal for the '{@link arduinoTrace.States.arduino.impl.TracedPushButtonImpl <em>Traced Push Button</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoTrace.States.arduino.impl.TracedPushButtonImpl
		 * @see arduinoTrace.States.arduino.impl.ArduinoPackageImpl#getTracedPushButton()
		 * @generated
		 */
		EClass TRACED_PUSH_BUTTON = eINSTANCE.getTracedPushButton();

		/**
		 * The meta object literal for the '<em><b>Original Object</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACED_PUSH_BUTTON__ORIGINAL_OBJECT = eINSTANCE.getTracedPushButton_OriginalObject();

		/**
		 * The meta object literal for the '{@link arduinoTrace.States.arduino.impl.TracedRotationSensorImpl <em>Traced Rotation Sensor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoTrace.States.arduino.impl.TracedRotationSensorImpl
		 * @see arduinoTrace.States.arduino.impl.ArduinoPackageImpl#getTracedRotationSensor()
		 * @generated
		 */
		EClass TRACED_ROTATION_SENSOR = eINSTANCE.getTracedRotationSensor();

		/**
		 * The meta object literal for the '<em><b>Original Object</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACED_ROTATION_SENSOR__ORIGINAL_OBJECT = eINSTANCE.getTracedRotationSensor_OriginalObject();

		/**
		 * The meta object literal for the '{@link arduinoTrace.States.arduino.impl.TracedSketchImpl <em>Traced Sketch</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoTrace.States.arduino.impl.TracedSketchImpl
		 * @see arduinoTrace.States.arduino.impl.ArduinoPackageImpl#getTracedSketch()
		 * @generated
		 */
		EClass TRACED_SKETCH = eINSTANCE.getTracedSketch();

		/**
		 * The meta object literal for the '<em><b>Original Object</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACED_SKETCH__ORIGINAL_OBJECT = eINSTANCE.getTracedSketch_OriginalObject();

		/**
		 * The meta object literal for the '{@link arduinoTrace.States.arduino.impl.TracedSoundSensorImpl <em>Traced Sound Sensor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoTrace.States.arduino.impl.TracedSoundSensorImpl
		 * @see arduinoTrace.States.arduino.impl.ArduinoPackageImpl#getTracedSoundSensor()
		 * @generated
		 */
		EClass TRACED_SOUND_SENSOR = eINSTANCE.getTracedSoundSensor();

		/**
		 * The meta object literal for the '<em><b>Original Object</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACED_SOUND_SENSOR__ORIGINAL_OBJECT = eINSTANCE.getTracedSoundSensor_OriginalObject();

		/**
		 * The meta object literal for the '{@link arduinoTrace.States.arduino.impl.TracedVariableImpl <em>Traced Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoTrace.States.arduino.impl.TracedVariableImpl
		 * @see arduinoTrace.States.arduino.impl.ArduinoPackageImpl#getTracedVariable()
		 * @generated
		 */
		EClass TRACED_VARIABLE = eINSTANCE.getTracedVariable();

	}

} //ArduinoPackage
