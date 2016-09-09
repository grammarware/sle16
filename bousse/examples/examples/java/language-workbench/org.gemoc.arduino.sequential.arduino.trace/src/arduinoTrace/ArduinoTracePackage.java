/**
 */
package arduinoTrace;

import fr.inria.diverse.trace.commons.model.trace.TracePackage;

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
 * @see arduinoTrace.ArduinoTraceFactory
 * @model kind="package"
 * @generated
 */
public interface ArduinoTracePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "arduinoTrace";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "arduinoTrace";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "arduinoTrace";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ArduinoTracePackage eINSTANCE = arduinoTrace.impl.ArduinoTracePackageImpl.init();

	/**
	 * The meta object id for the '{@link arduinoTrace.impl.SpecificTraceImpl <em>Specific Trace</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoTrace.impl.SpecificTraceImpl
	 * @see arduinoTrace.impl.ArduinoTracePackageImpl#getSpecificTrace()
	 * @generated
	 */
	int SPECIFIC_TRACE = 0;

	/**
	 * The feature id for the '<em><b>Root Step</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__ROOT_STEP = TracePackage.TRACE__ROOT_STEP;

	/**
	 * The feature id for the '<em><b>Launchconfiguration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__LAUNCHCONFIGURATION = TracePackage.TRACE__LAUNCHCONFIGURATION;

	/**
	 * The feature id for the '<em><b>Arduino Bluetooth Transceiver Push Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__ARDUINO_BLUETOOTH_TRANSCEIVER_PUSH_SEQUENCE = TracePackage.TRACE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Arduino Delay Execute Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__ARDUINO_DELAY_EXECUTE_SEQUENCE = TracePackage.TRACE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Arduino If Execute Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__ARDUINO_IF_EXECUTE_SEQUENCE = TracePackage.TRACE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Arduino Module Assignment Execute Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__ARDUINO_MODULE_ASSIGNMENT_EXECUTE_SEQUENCE = TracePackage.TRACE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Arduino Project Setup Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__ARDUINO_PROJECT_SETUP_SEQUENCE = TracePackage.TRACE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Arduino Repeat Execute Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__ARDUINO_REPEAT_EXECUTE_SEQUENCE = TracePackage.TRACE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Arduino Variable Assignment Execute Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__ARDUINO_VARIABLE_ASSIGNMENT_EXECUTE_SEQUENCE = TracePackage.TRACE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Arduino Variable Declaration Execute Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__ARDUINO_VARIABLE_DECLARATION_EXECUTE_SEQUENCE = TracePackage.TRACE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Arduino traced Ambient Light Sensors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__ARDUINO_TRACED_AMBIENT_LIGHT_SENSORS = TracePackage.TRACE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Arduino traced Analog Pins</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__ARDUINO_TRACED_ANALOG_PINS = TracePackage.TRACE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Arduino traced Arduino Boards</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__ARDUINO_TRACED_ARDUINO_BOARDS = TracePackage.TRACE_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Arduino traced Bluetooth Transceivers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__ARDUINO_TRACED_BLUETOOTH_TRANSCEIVERS = TracePackage.TRACE_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Arduino traced Boolean Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__ARDUINO_TRACED_BOOLEAN_VARIABLES = TracePackage.TRACE_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Arduino traced Buzzers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__ARDUINO_TRACED_BUZZERS = TracePackage.TRACE_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Arduino traced Digital Pins</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__ARDUINO_TRACED_DIGITAL_PINS = TracePackage.TRACE_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Arduino traced Fans</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__ARDUINO_TRACED_FANS = TracePackage.TRACE_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Arduino traced Infra Red Sensors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__ARDUINO_TRACED_INFRA_RED_SENSORS = TracePackage.TRACE_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Arduino traced Integer Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__ARDUINO_TRACED_INTEGER_VARIABLES = TracePackage.TRACE_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Arduino traced LE Ds</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__ARDUINO_TRACED_LE_DS = TracePackage.TRACE_FEATURE_COUNT + 18;

	/**
	 * The feature id for the '<em><b>Arduino traced Micro Servos</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__ARDUINO_TRACED_MICRO_SERVOS = TracePackage.TRACE_FEATURE_COUNT + 19;

	/**
	 * The feature id for the '<em><b>Arduino traced Music Players</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__ARDUINO_TRACED_MUSIC_PLAYERS = TracePackage.TRACE_FEATURE_COUNT + 20;

	/**
	 * The feature id for the '<em><b>Arduino traced Push Buttons</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__ARDUINO_TRACED_PUSH_BUTTONS = TracePackage.TRACE_FEATURE_COUNT + 21;

	/**
	 * The feature id for the '<em><b>Arduino traced Rotation Sensors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__ARDUINO_TRACED_ROTATION_SENSORS = TracePackage.TRACE_FEATURE_COUNT + 22;

	/**
	 * The feature id for the '<em><b>Arduino traced Sketchs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__ARDUINO_TRACED_SKETCHS = TracePackage.TRACE_FEATURE_COUNT + 23;

	/**
	 * The feature id for the '<em><b>Arduino traced Sound Sensors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__ARDUINO_TRACED_SOUND_SENSORS = TracePackage.TRACE_FEATURE_COUNT + 24;

	/**
	 * The feature id for the '<em><b>States Trace</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__STATES_TRACE = TracePackage.TRACE_FEATURE_COUNT + 25;

	/**
	 * The number of structural features of the '<em>Specific Trace</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE_FEATURE_COUNT = TracePackage.TRACE_FEATURE_COUNT + 26;

	/**
	 * The number of operations of the '<em>Specific Trace</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE_OPERATION_COUNT = TracePackage.TRACE_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link arduinoTrace.SpecificTrace <em>Specific Trace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Specific Trace</em>'.
	 * @see arduinoTrace.SpecificTrace
	 * @generated
	 */
	EClass getSpecificTrace();

	/**
	 * Returns the meta object for the reference list '{@link arduinoTrace.SpecificTrace#getArduino_BluetoothTransceiver_Push_Sequence <em>Arduino Bluetooth Transceiver Push Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Arduino Bluetooth Transceiver Push Sequence</em>'.
	 * @see arduinoTrace.SpecificTrace#getArduino_BluetoothTransceiver_Push_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_Arduino_BluetoothTransceiver_Push_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link arduinoTrace.SpecificTrace#getArduino_Delay_Execute_Sequence <em>Arduino Delay Execute Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Arduino Delay Execute Sequence</em>'.
	 * @see arduinoTrace.SpecificTrace#getArduino_Delay_Execute_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_Arduino_Delay_Execute_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link arduinoTrace.SpecificTrace#getArduino_If_Execute_Sequence <em>Arduino If Execute Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Arduino If Execute Sequence</em>'.
	 * @see arduinoTrace.SpecificTrace#getArduino_If_Execute_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_Arduino_If_Execute_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link arduinoTrace.SpecificTrace#getArduino_ModuleAssignment_Execute_Sequence <em>Arduino Module Assignment Execute Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Arduino Module Assignment Execute Sequence</em>'.
	 * @see arduinoTrace.SpecificTrace#getArduino_ModuleAssignment_Execute_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_Arduino_ModuleAssignment_Execute_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link arduinoTrace.SpecificTrace#getArduino_Project_Setup_Sequence <em>Arduino Project Setup Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Arduino Project Setup Sequence</em>'.
	 * @see arduinoTrace.SpecificTrace#getArduino_Project_Setup_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_Arduino_Project_Setup_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link arduinoTrace.SpecificTrace#getArduino_Repeat_Execute_Sequence <em>Arduino Repeat Execute Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Arduino Repeat Execute Sequence</em>'.
	 * @see arduinoTrace.SpecificTrace#getArduino_Repeat_Execute_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_Arduino_Repeat_Execute_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link arduinoTrace.SpecificTrace#getArduino_VariableAssignment_Execute_Sequence <em>Arduino Variable Assignment Execute Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Arduino Variable Assignment Execute Sequence</em>'.
	 * @see arduinoTrace.SpecificTrace#getArduino_VariableAssignment_Execute_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_Arduino_VariableAssignment_Execute_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link arduinoTrace.SpecificTrace#getArduino_VariableDeclaration_Execute_Sequence <em>Arduino Variable Declaration Execute Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Arduino Variable Declaration Execute Sequence</em>'.
	 * @see arduinoTrace.SpecificTrace#getArduino_VariableDeclaration_Execute_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_Arduino_VariableDeclaration_Execute_Sequence();

	/**
	 * Returns the meta object for the containment reference list '{@link arduinoTrace.SpecificTrace#getArduino_tracedAmbientLightSensors <em>Arduino traced Ambient Light Sensors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Arduino traced Ambient Light Sensors</em>'.
	 * @see arduinoTrace.SpecificTrace#getArduino_tracedAmbientLightSensors()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_Arduino_tracedAmbientLightSensors();

	/**
	 * Returns the meta object for the containment reference list '{@link arduinoTrace.SpecificTrace#getArduino_tracedAnalogPins <em>Arduino traced Analog Pins</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Arduino traced Analog Pins</em>'.
	 * @see arduinoTrace.SpecificTrace#getArduino_tracedAnalogPins()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_Arduino_tracedAnalogPins();

	/**
	 * Returns the meta object for the containment reference list '{@link arduinoTrace.SpecificTrace#getArduino_tracedArduinoBoards <em>Arduino traced Arduino Boards</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Arduino traced Arduino Boards</em>'.
	 * @see arduinoTrace.SpecificTrace#getArduino_tracedArduinoBoards()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_Arduino_tracedArduinoBoards();

	/**
	 * Returns the meta object for the containment reference list '{@link arduinoTrace.SpecificTrace#getArduino_tracedBluetoothTransceivers <em>Arduino traced Bluetooth Transceivers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Arduino traced Bluetooth Transceivers</em>'.
	 * @see arduinoTrace.SpecificTrace#getArduino_tracedBluetoothTransceivers()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_Arduino_tracedBluetoothTransceivers();

	/**
	 * Returns the meta object for the containment reference list '{@link arduinoTrace.SpecificTrace#getArduino_tracedBooleanVariables <em>Arduino traced Boolean Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Arduino traced Boolean Variables</em>'.
	 * @see arduinoTrace.SpecificTrace#getArduino_tracedBooleanVariables()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_Arduino_tracedBooleanVariables();

	/**
	 * Returns the meta object for the containment reference list '{@link arduinoTrace.SpecificTrace#getArduino_tracedBuzzers <em>Arduino traced Buzzers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Arduino traced Buzzers</em>'.
	 * @see arduinoTrace.SpecificTrace#getArduino_tracedBuzzers()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_Arduino_tracedBuzzers();

	/**
	 * Returns the meta object for the containment reference list '{@link arduinoTrace.SpecificTrace#getArduino_tracedDigitalPins <em>Arduino traced Digital Pins</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Arduino traced Digital Pins</em>'.
	 * @see arduinoTrace.SpecificTrace#getArduino_tracedDigitalPins()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_Arduino_tracedDigitalPins();

	/**
	 * Returns the meta object for the containment reference list '{@link arduinoTrace.SpecificTrace#getArduino_tracedFans <em>Arduino traced Fans</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Arduino traced Fans</em>'.
	 * @see arduinoTrace.SpecificTrace#getArduino_tracedFans()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_Arduino_tracedFans();

	/**
	 * Returns the meta object for the containment reference list '{@link arduinoTrace.SpecificTrace#getArduino_tracedInfraRedSensors <em>Arduino traced Infra Red Sensors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Arduino traced Infra Red Sensors</em>'.
	 * @see arduinoTrace.SpecificTrace#getArduino_tracedInfraRedSensors()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_Arduino_tracedInfraRedSensors();

	/**
	 * Returns the meta object for the containment reference list '{@link arduinoTrace.SpecificTrace#getArduino_tracedIntegerVariables <em>Arduino traced Integer Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Arduino traced Integer Variables</em>'.
	 * @see arduinoTrace.SpecificTrace#getArduino_tracedIntegerVariables()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_Arduino_tracedIntegerVariables();

	/**
	 * Returns the meta object for the containment reference list '{@link arduinoTrace.SpecificTrace#getArduino_tracedLEDs <em>Arduino traced LE Ds</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Arduino traced LE Ds</em>'.
	 * @see arduinoTrace.SpecificTrace#getArduino_tracedLEDs()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_Arduino_tracedLEDs();

	/**
	 * Returns the meta object for the containment reference list '{@link arduinoTrace.SpecificTrace#getArduino_tracedMicroServos <em>Arduino traced Micro Servos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Arduino traced Micro Servos</em>'.
	 * @see arduinoTrace.SpecificTrace#getArduino_tracedMicroServos()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_Arduino_tracedMicroServos();

	/**
	 * Returns the meta object for the containment reference list '{@link arduinoTrace.SpecificTrace#getArduino_tracedMusicPlayers <em>Arduino traced Music Players</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Arduino traced Music Players</em>'.
	 * @see arduinoTrace.SpecificTrace#getArduino_tracedMusicPlayers()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_Arduino_tracedMusicPlayers();

	/**
	 * Returns the meta object for the containment reference list '{@link arduinoTrace.SpecificTrace#getArduino_tracedPushButtons <em>Arduino traced Push Buttons</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Arduino traced Push Buttons</em>'.
	 * @see arduinoTrace.SpecificTrace#getArduino_tracedPushButtons()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_Arduino_tracedPushButtons();

	/**
	 * Returns the meta object for the containment reference list '{@link arduinoTrace.SpecificTrace#getArduino_tracedRotationSensors <em>Arduino traced Rotation Sensors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Arduino traced Rotation Sensors</em>'.
	 * @see arduinoTrace.SpecificTrace#getArduino_tracedRotationSensors()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_Arduino_tracedRotationSensors();

	/**
	 * Returns the meta object for the containment reference list '{@link arduinoTrace.SpecificTrace#getArduino_tracedSketchs <em>Arduino traced Sketchs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Arduino traced Sketchs</em>'.
	 * @see arduinoTrace.SpecificTrace#getArduino_tracedSketchs()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_Arduino_tracedSketchs();

	/**
	 * Returns the meta object for the containment reference list '{@link arduinoTrace.SpecificTrace#getArduino_tracedSoundSensors <em>Arduino traced Sound Sensors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Arduino traced Sound Sensors</em>'.
	 * @see arduinoTrace.SpecificTrace#getArduino_tracedSoundSensors()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_Arduino_tracedSoundSensors();

	/**
	 * Returns the meta object for the containment reference list '{@link arduinoTrace.SpecificTrace#getStatesTrace <em>States Trace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>States Trace</em>'.
	 * @see arduinoTrace.SpecificTrace#getStatesTrace()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_StatesTrace();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ArduinoTraceFactory getArduinoTraceFactory();

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
		 * The meta object literal for the '{@link arduinoTrace.impl.SpecificTraceImpl <em>Specific Trace</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoTrace.impl.SpecificTraceImpl
		 * @see arduinoTrace.impl.ArduinoTracePackageImpl#getSpecificTrace()
		 * @generated
		 */
		EClass SPECIFIC_TRACE = eINSTANCE.getSpecificTrace();

		/**
		 * The meta object literal for the '<em><b>Arduino Bluetooth Transceiver Push Sequence</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__ARDUINO_BLUETOOTH_TRANSCEIVER_PUSH_SEQUENCE = eINSTANCE.getSpecificTrace_Arduino_BluetoothTransceiver_Push_Sequence();

		/**
		 * The meta object literal for the '<em><b>Arduino Delay Execute Sequence</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__ARDUINO_DELAY_EXECUTE_SEQUENCE = eINSTANCE.getSpecificTrace_Arduino_Delay_Execute_Sequence();

		/**
		 * The meta object literal for the '<em><b>Arduino If Execute Sequence</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__ARDUINO_IF_EXECUTE_SEQUENCE = eINSTANCE.getSpecificTrace_Arduino_If_Execute_Sequence();

		/**
		 * The meta object literal for the '<em><b>Arduino Module Assignment Execute Sequence</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__ARDUINO_MODULE_ASSIGNMENT_EXECUTE_SEQUENCE = eINSTANCE.getSpecificTrace_Arduino_ModuleAssignment_Execute_Sequence();

		/**
		 * The meta object literal for the '<em><b>Arduino Project Setup Sequence</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__ARDUINO_PROJECT_SETUP_SEQUENCE = eINSTANCE.getSpecificTrace_Arduino_Project_Setup_Sequence();

		/**
		 * The meta object literal for the '<em><b>Arduino Repeat Execute Sequence</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__ARDUINO_REPEAT_EXECUTE_SEQUENCE = eINSTANCE.getSpecificTrace_Arduino_Repeat_Execute_Sequence();

		/**
		 * The meta object literal for the '<em><b>Arduino Variable Assignment Execute Sequence</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__ARDUINO_VARIABLE_ASSIGNMENT_EXECUTE_SEQUENCE = eINSTANCE.getSpecificTrace_Arduino_VariableAssignment_Execute_Sequence();

		/**
		 * The meta object literal for the '<em><b>Arduino Variable Declaration Execute Sequence</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__ARDUINO_VARIABLE_DECLARATION_EXECUTE_SEQUENCE = eINSTANCE.getSpecificTrace_Arduino_VariableDeclaration_Execute_Sequence();

		/**
		 * The meta object literal for the '<em><b>Arduino traced Ambient Light Sensors</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__ARDUINO_TRACED_AMBIENT_LIGHT_SENSORS = eINSTANCE.getSpecificTrace_Arduino_tracedAmbientLightSensors();

		/**
		 * The meta object literal for the '<em><b>Arduino traced Analog Pins</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__ARDUINO_TRACED_ANALOG_PINS = eINSTANCE.getSpecificTrace_Arduino_tracedAnalogPins();

		/**
		 * The meta object literal for the '<em><b>Arduino traced Arduino Boards</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__ARDUINO_TRACED_ARDUINO_BOARDS = eINSTANCE.getSpecificTrace_Arduino_tracedArduinoBoards();

		/**
		 * The meta object literal for the '<em><b>Arduino traced Bluetooth Transceivers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__ARDUINO_TRACED_BLUETOOTH_TRANSCEIVERS = eINSTANCE.getSpecificTrace_Arduino_tracedBluetoothTransceivers();

		/**
		 * The meta object literal for the '<em><b>Arduino traced Boolean Variables</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__ARDUINO_TRACED_BOOLEAN_VARIABLES = eINSTANCE.getSpecificTrace_Arduino_tracedBooleanVariables();

		/**
		 * The meta object literal for the '<em><b>Arduino traced Buzzers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__ARDUINO_TRACED_BUZZERS = eINSTANCE.getSpecificTrace_Arduino_tracedBuzzers();

		/**
		 * The meta object literal for the '<em><b>Arduino traced Digital Pins</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__ARDUINO_TRACED_DIGITAL_PINS = eINSTANCE.getSpecificTrace_Arduino_tracedDigitalPins();

		/**
		 * The meta object literal for the '<em><b>Arduino traced Fans</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__ARDUINO_TRACED_FANS = eINSTANCE.getSpecificTrace_Arduino_tracedFans();

		/**
		 * The meta object literal for the '<em><b>Arduino traced Infra Red Sensors</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__ARDUINO_TRACED_INFRA_RED_SENSORS = eINSTANCE.getSpecificTrace_Arduino_tracedInfraRedSensors();

		/**
		 * The meta object literal for the '<em><b>Arduino traced Integer Variables</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__ARDUINO_TRACED_INTEGER_VARIABLES = eINSTANCE.getSpecificTrace_Arduino_tracedIntegerVariables();

		/**
		 * The meta object literal for the '<em><b>Arduino traced LE Ds</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__ARDUINO_TRACED_LE_DS = eINSTANCE.getSpecificTrace_Arduino_tracedLEDs();

		/**
		 * The meta object literal for the '<em><b>Arduino traced Micro Servos</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__ARDUINO_TRACED_MICRO_SERVOS = eINSTANCE.getSpecificTrace_Arduino_tracedMicroServos();

		/**
		 * The meta object literal for the '<em><b>Arduino traced Music Players</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__ARDUINO_TRACED_MUSIC_PLAYERS = eINSTANCE.getSpecificTrace_Arduino_tracedMusicPlayers();

		/**
		 * The meta object literal for the '<em><b>Arduino traced Push Buttons</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__ARDUINO_TRACED_PUSH_BUTTONS = eINSTANCE.getSpecificTrace_Arduino_tracedPushButtons();

		/**
		 * The meta object literal for the '<em><b>Arduino traced Rotation Sensors</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__ARDUINO_TRACED_ROTATION_SENSORS = eINSTANCE.getSpecificTrace_Arduino_tracedRotationSensors();

		/**
		 * The meta object literal for the '<em><b>Arduino traced Sketchs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__ARDUINO_TRACED_SKETCHS = eINSTANCE.getSpecificTrace_Arduino_tracedSketchs();

		/**
		 * The meta object literal for the '<em><b>Arduino traced Sound Sensors</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__ARDUINO_TRACED_SOUND_SENSORS = eINSTANCE.getSpecificTrace_Arduino_tracedSoundSensors();

		/**
		 * The meta object literal for the '<em><b>States Trace</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__STATES_TRACE = eINSTANCE.getSpecificTrace_StatesTrace();

	}

} //ArduinoTracePackage
