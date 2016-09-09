/**
 */
package arduinoTrace;

import arduinoTrace.States.State;

import arduinoTrace.States.arduino.TracedAmbientLightSensor;
import arduinoTrace.States.arduino.TracedAnalogPin;
import arduinoTrace.States.arduino.TracedArduinoBoard;
import arduinoTrace.States.arduino.TracedBluetoothTransceiver;
import arduinoTrace.States.arduino.TracedBooleanVariable;
import arduinoTrace.States.arduino.TracedBuzzer;
import arduinoTrace.States.arduino.TracedDigitalPin;
import arduinoTrace.States.arduino.TracedFan;
import arduinoTrace.States.arduino.TracedInfraRedSensor;
import arduinoTrace.States.arduino.TracedIntegerVariable;
import arduinoTrace.States.arduino.TracedLED;
import arduinoTrace.States.arduino.TracedMicroServo;
import arduinoTrace.States.arduino.TracedMusicPlayer;
import arduinoTrace.States.arduino.TracedPushButton;
import arduinoTrace.States.arduino.TracedRotationSensor;
import arduinoTrace.States.arduino.TracedSketch;
import arduinoTrace.States.arduino.TracedSoundSensor;

import arduinoTrace.Steps.Arduino_BluetoothTransceiver_Push;
import arduinoTrace.Steps.Arduino_Delay_Execute;
import arduinoTrace.Steps.Arduino_If_Execute;
import arduinoTrace.Steps.Arduino_ModuleAssignment_Execute;
import arduinoTrace.Steps.Arduino_Project_Setup;
import arduinoTrace.Steps.Arduino_Repeat_Execute;
import arduinoTrace.Steps.Arduino_VariableAssignment_Execute;
import arduinoTrace.Steps.Arduino_VariableDeclaration_Execute;
import arduinoTrace.Steps.SpecificStep;

import fr.inria.diverse.trace.commons.model.trace.SequentialStep;
import fr.inria.diverse.trace.commons.model.trace.Trace;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Specific Trace</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link arduinoTrace.SpecificTrace#getArduino_BluetoothTransceiver_Push_Sequence <em>Arduino Bluetooth Transceiver Push Sequence</em>}</li>
 *   <li>{@link arduinoTrace.SpecificTrace#getArduino_Delay_Execute_Sequence <em>Arduino Delay Execute Sequence</em>}</li>
 *   <li>{@link arduinoTrace.SpecificTrace#getArduino_If_Execute_Sequence <em>Arduino If Execute Sequence</em>}</li>
 *   <li>{@link arduinoTrace.SpecificTrace#getArduino_ModuleAssignment_Execute_Sequence <em>Arduino Module Assignment Execute Sequence</em>}</li>
 *   <li>{@link arduinoTrace.SpecificTrace#getArduino_Project_Setup_Sequence <em>Arduino Project Setup Sequence</em>}</li>
 *   <li>{@link arduinoTrace.SpecificTrace#getArduino_Repeat_Execute_Sequence <em>Arduino Repeat Execute Sequence</em>}</li>
 *   <li>{@link arduinoTrace.SpecificTrace#getArduino_VariableAssignment_Execute_Sequence <em>Arduino Variable Assignment Execute Sequence</em>}</li>
 *   <li>{@link arduinoTrace.SpecificTrace#getArduino_VariableDeclaration_Execute_Sequence <em>Arduino Variable Declaration Execute Sequence</em>}</li>
 *   <li>{@link arduinoTrace.SpecificTrace#getArduino_tracedAmbientLightSensors <em>Arduino traced Ambient Light Sensors</em>}</li>
 *   <li>{@link arduinoTrace.SpecificTrace#getArduino_tracedAnalogPins <em>Arduino traced Analog Pins</em>}</li>
 *   <li>{@link arduinoTrace.SpecificTrace#getArduino_tracedArduinoBoards <em>Arduino traced Arduino Boards</em>}</li>
 *   <li>{@link arduinoTrace.SpecificTrace#getArduino_tracedBluetoothTransceivers <em>Arduino traced Bluetooth Transceivers</em>}</li>
 *   <li>{@link arduinoTrace.SpecificTrace#getArduino_tracedBooleanVariables <em>Arduino traced Boolean Variables</em>}</li>
 *   <li>{@link arduinoTrace.SpecificTrace#getArduino_tracedBuzzers <em>Arduino traced Buzzers</em>}</li>
 *   <li>{@link arduinoTrace.SpecificTrace#getArduino_tracedDigitalPins <em>Arduino traced Digital Pins</em>}</li>
 *   <li>{@link arduinoTrace.SpecificTrace#getArduino_tracedFans <em>Arduino traced Fans</em>}</li>
 *   <li>{@link arduinoTrace.SpecificTrace#getArduino_tracedInfraRedSensors <em>Arduino traced Infra Red Sensors</em>}</li>
 *   <li>{@link arduinoTrace.SpecificTrace#getArduino_tracedIntegerVariables <em>Arduino traced Integer Variables</em>}</li>
 *   <li>{@link arduinoTrace.SpecificTrace#getArduino_tracedLEDs <em>Arduino traced LE Ds</em>}</li>
 *   <li>{@link arduinoTrace.SpecificTrace#getArduino_tracedMicroServos <em>Arduino traced Micro Servos</em>}</li>
 *   <li>{@link arduinoTrace.SpecificTrace#getArduino_tracedMusicPlayers <em>Arduino traced Music Players</em>}</li>
 *   <li>{@link arduinoTrace.SpecificTrace#getArduino_tracedPushButtons <em>Arduino traced Push Buttons</em>}</li>
 *   <li>{@link arduinoTrace.SpecificTrace#getArduino_tracedRotationSensors <em>Arduino traced Rotation Sensors</em>}</li>
 *   <li>{@link arduinoTrace.SpecificTrace#getArduino_tracedSketchs <em>Arduino traced Sketchs</em>}</li>
 *   <li>{@link arduinoTrace.SpecificTrace#getArduino_tracedSoundSensors <em>Arduino traced Sound Sensors</em>}</li>
 *   <li>{@link arduinoTrace.SpecificTrace#getStatesTrace <em>States Trace</em>}</li>
 * </ul>
 *
 * @see arduinoTrace.ArduinoTracePackage#getSpecificTrace()
 * @model
 * @generated
 */
public interface SpecificTrace extends Trace<SequentialStep<SpecificStep>> {
	/**
	 * Returns the value of the '<em><b>Arduino Bluetooth Transceiver Push Sequence</b></em>' reference list.
	 * The list contents are of type {@link arduinoTrace.Steps.Arduino_BluetoothTransceiver_Push}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Arduino Bluetooth Transceiver Push Sequence</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arduino Bluetooth Transceiver Push Sequence</em>' reference list.
	 * @see arduinoTrace.ArduinoTracePackage#getSpecificTrace_Arduino_BluetoothTransceiver_Push_Sequence()
	 * @model
	 * @generated
	 */
	EList<Arduino_BluetoothTransceiver_Push> getArduino_BluetoothTransceiver_Push_Sequence();

	/**
	 * Returns the value of the '<em><b>Arduino Delay Execute Sequence</b></em>' reference list.
	 * The list contents are of type {@link arduinoTrace.Steps.Arduino_Delay_Execute}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Arduino Delay Execute Sequence</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arduino Delay Execute Sequence</em>' reference list.
	 * @see arduinoTrace.ArduinoTracePackage#getSpecificTrace_Arduino_Delay_Execute_Sequence()
	 * @model
	 * @generated
	 */
	EList<Arduino_Delay_Execute> getArduino_Delay_Execute_Sequence();

	/**
	 * Returns the value of the '<em><b>Arduino If Execute Sequence</b></em>' reference list.
	 * The list contents are of type {@link arduinoTrace.Steps.Arduino_If_Execute}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Arduino If Execute Sequence</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arduino If Execute Sequence</em>' reference list.
	 * @see arduinoTrace.ArduinoTracePackage#getSpecificTrace_Arduino_If_Execute_Sequence()
	 * @model
	 * @generated
	 */
	EList<Arduino_If_Execute> getArduino_If_Execute_Sequence();

	/**
	 * Returns the value of the '<em><b>Arduino Module Assignment Execute Sequence</b></em>' reference list.
	 * The list contents are of type {@link arduinoTrace.Steps.Arduino_ModuleAssignment_Execute}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Arduino Module Assignment Execute Sequence</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arduino Module Assignment Execute Sequence</em>' reference list.
	 * @see arduinoTrace.ArduinoTracePackage#getSpecificTrace_Arduino_ModuleAssignment_Execute_Sequence()
	 * @model
	 * @generated
	 */
	EList<Arduino_ModuleAssignment_Execute> getArduino_ModuleAssignment_Execute_Sequence();

	/**
	 * Returns the value of the '<em><b>Arduino Project Setup Sequence</b></em>' reference list.
	 * The list contents are of type {@link arduinoTrace.Steps.Arduino_Project_Setup}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Arduino Project Setup Sequence</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arduino Project Setup Sequence</em>' reference list.
	 * @see arduinoTrace.ArduinoTracePackage#getSpecificTrace_Arduino_Project_Setup_Sequence()
	 * @model
	 * @generated
	 */
	EList<Arduino_Project_Setup> getArduino_Project_Setup_Sequence();

	/**
	 * Returns the value of the '<em><b>Arduino Repeat Execute Sequence</b></em>' reference list.
	 * The list contents are of type {@link arduinoTrace.Steps.Arduino_Repeat_Execute}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Arduino Repeat Execute Sequence</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arduino Repeat Execute Sequence</em>' reference list.
	 * @see arduinoTrace.ArduinoTracePackage#getSpecificTrace_Arduino_Repeat_Execute_Sequence()
	 * @model
	 * @generated
	 */
	EList<Arduino_Repeat_Execute> getArduino_Repeat_Execute_Sequence();

	/**
	 * Returns the value of the '<em><b>Arduino Variable Assignment Execute Sequence</b></em>' reference list.
	 * The list contents are of type {@link arduinoTrace.Steps.Arduino_VariableAssignment_Execute}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Arduino Variable Assignment Execute Sequence</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arduino Variable Assignment Execute Sequence</em>' reference list.
	 * @see arduinoTrace.ArduinoTracePackage#getSpecificTrace_Arduino_VariableAssignment_Execute_Sequence()
	 * @model
	 * @generated
	 */
	EList<Arduino_VariableAssignment_Execute> getArduino_VariableAssignment_Execute_Sequence();

	/**
	 * Returns the value of the '<em><b>Arduino Variable Declaration Execute Sequence</b></em>' reference list.
	 * The list contents are of type {@link arduinoTrace.Steps.Arduino_VariableDeclaration_Execute}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Arduino Variable Declaration Execute Sequence</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arduino Variable Declaration Execute Sequence</em>' reference list.
	 * @see arduinoTrace.ArduinoTracePackage#getSpecificTrace_Arduino_VariableDeclaration_Execute_Sequence()
	 * @model
	 * @generated
	 */
	EList<Arduino_VariableDeclaration_Execute> getArduino_VariableDeclaration_Execute_Sequence();

	/**
	 * Returns the value of the '<em><b>Arduino traced Ambient Light Sensors</b></em>' containment reference list.
	 * The list contents are of type {@link arduinoTrace.States.arduino.TracedAmbientLightSensor}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Arduino traced Ambient Light Sensors</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arduino traced Ambient Light Sensors</em>' containment reference list.
	 * @see arduinoTrace.ArduinoTracePackage#getSpecificTrace_Arduino_tracedAmbientLightSensors()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<TracedAmbientLightSensor> getArduino_tracedAmbientLightSensors();

	/**
	 * Returns the value of the '<em><b>Arduino traced Analog Pins</b></em>' containment reference list.
	 * The list contents are of type {@link arduinoTrace.States.arduino.TracedAnalogPin}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Arduino traced Analog Pins</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arduino traced Analog Pins</em>' containment reference list.
	 * @see arduinoTrace.ArduinoTracePackage#getSpecificTrace_Arduino_tracedAnalogPins()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<TracedAnalogPin> getArduino_tracedAnalogPins();

	/**
	 * Returns the value of the '<em><b>Arduino traced Arduino Boards</b></em>' containment reference list.
	 * The list contents are of type {@link arduinoTrace.States.arduino.TracedArduinoBoard}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Arduino traced Arduino Boards</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arduino traced Arduino Boards</em>' containment reference list.
	 * @see arduinoTrace.ArduinoTracePackage#getSpecificTrace_Arduino_tracedArduinoBoards()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<TracedArduinoBoard> getArduino_tracedArduinoBoards();

	/**
	 * Returns the value of the '<em><b>Arduino traced Bluetooth Transceivers</b></em>' containment reference list.
	 * The list contents are of type {@link arduinoTrace.States.arduino.TracedBluetoothTransceiver}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Arduino traced Bluetooth Transceivers</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arduino traced Bluetooth Transceivers</em>' containment reference list.
	 * @see arduinoTrace.ArduinoTracePackage#getSpecificTrace_Arduino_tracedBluetoothTransceivers()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<TracedBluetoothTransceiver> getArduino_tracedBluetoothTransceivers();

	/**
	 * Returns the value of the '<em><b>Arduino traced Boolean Variables</b></em>' containment reference list.
	 * The list contents are of type {@link arduinoTrace.States.arduino.TracedBooleanVariable}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Arduino traced Boolean Variables</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arduino traced Boolean Variables</em>' containment reference list.
	 * @see arduinoTrace.ArduinoTracePackage#getSpecificTrace_Arduino_tracedBooleanVariables()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<TracedBooleanVariable> getArduino_tracedBooleanVariables();

	/**
	 * Returns the value of the '<em><b>Arduino traced Buzzers</b></em>' containment reference list.
	 * The list contents are of type {@link arduinoTrace.States.arduino.TracedBuzzer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Arduino traced Buzzers</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arduino traced Buzzers</em>' containment reference list.
	 * @see arduinoTrace.ArduinoTracePackage#getSpecificTrace_Arduino_tracedBuzzers()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<TracedBuzzer> getArduino_tracedBuzzers();

	/**
	 * Returns the value of the '<em><b>Arduino traced Digital Pins</b></em>' containment reference list.
	 * The list contents are of type {@link arduinoTrace.States.arduino.TracedDigitalPin}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Arduino traced Digital Pins</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arduino traced Digital Pins</em>' containment reference list.
	 * @see arduinoTrace.ArduinoTracePackage#getSpecificTrace_Arduino_tracedDigitalPins()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<TracedDigitalPin> getArduino_tracedDigitalPins();

	/**
	 * Returns the value of the '<em><b>Arduino traced Fans</b></em>' containment reference list.
	 * The list contents are of type {@link arduinoTrace.States.arduino.TracedFan}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Arduino traced Fans</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arduino traced Fans</em>' containment reference list.
	 * @see arduinoTrace.ArduinoTracePackage#getSpecificTrace_Arduino_tracedFans()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<TracedFan> getArduino_tracedFans();

	/**
	 * Returns the value of the '<em><b>Arduino traced Infra Red Sensors</b></em>' containment reference list.
	 * The list contents are of type {@link arduinoTrace.States.arduino.TracedInfraRedSensor}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Arduino traced Infra Red Sensors</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arduino traced Infra Red Sensors</em>' containment reference list.
	 * @see arduinoTrace.ArduinoTracePackage#getSpecificTrace_Arduino_tracedInfraRedSensors()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<TracedInfraRedSensor> getArduino_tracedInfraRedSensors();

	/**
	 * Returns the value of the '<em><b>Arduino traced Integer Variables</b></em>' containment reference list.
	 * The list contents are of type {@link arduinoTrace.States.arduino.TracedIntegerVariable}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Arduino traced Integer Variables</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arduino traced Integer Variables</em>' containment reference list.
	 * @see arduinoTrace.ArduinoTracePackage#getSpecificTrace_Arduino_tracedIntegerVariables()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<TracedIntegerVariable> getArduino_tracedIntegerVariables();

	/**
	 * Returns the value of the '<em><b>Arduino traced LE Ds</b></em>' containment reference list.
	 * The list contents are of type {@link arduinoTrace.States.arduino.TracedLED}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Arduino traced LE Ds</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arduino traced LE Ds</em>' containment reference list.
	 * @see arduinoTrace.ArduinoTracePackage#getSpecificTrace_Arduino_tracedLEDs()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<TracedLED> getArduino_tracedLEDs();

	/**
	 * Returns the value of the '<em><b>Arduino traced Micro Servos</b></em>' containment reference list.
	 * The list contents are of type {@link arduinoTrace.States.arduino.TracedMicroServo}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Arduino traced Micro Servos</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arduino traced Micro Servos</em>' containment reference list.
	 * @see arduinoTrace.ArduinoTracePackage#getSpecificTrace_Arduino_tracedMicroServos()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<TracedMicroServo> getArduino_tracedMicroServos();

	/**
	 * Returns the value of the '<em><b>Arduino traced Music Players</b></em>' containment reference list.
	 * The list contents are of type {@link arduinoTrace.States.arduino.TracedMusicPlayer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Arduino traced Music Players</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arduino traced Music Players</em>' containment reference list.
	 * @see arduinoTrace.ArduinoTracePackage#getSpecificTrace_Arduino_tracedMusicPlayers()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<TracedMusicPlayer> getArduino_tracedMusicPlayers();

	/**
	 * Returns the value of the '<em><b>Arduino traced Push Buttons</b></em>' containment reference list.
	 * The list contents are of type {@link arduinoTrace.States.arduino.TracedPushButton}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Arduino traced Push Buttons</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arduino traced Push Buttons</em>' containment reference list.
	 * @see arduinoTrace.ArduinoTracePackage#getSpecificTrace_Arduino_tracedPushButtons()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<TracedPushButton> getArduino_tracedPushButtons();

	/**
	 * Returns the value of the '<em><b>Arduino traced Rotation Sensors</b></em>' containment reference list.
	 * The list contents are of type {@link arduinoTrace.States.arduino.TracedRotationSensor}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Arduino traced Rotation Sensors</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arduino traced Rotation Sensors</em>' containment reference list.
	 * @see arduinoTrace.ArduinoTracePackage#getSpecificTrace_Arduino_tracedRotationSensors()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<TracedRotationSensor> getArduino_tracedRotationSensors();

	/**
	 * Returns the value of the '<em><b>Arduino traced Sketchs</b></em>' containment reference list.
	 * The list contents are of type {@link arduinoTrace.States.arduino.TracedSketch}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Arduino traced Sketchs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arduino traced Sketchs</em>' containment reference list.
	 * @see arduinoTrace.ArduinoTracePackage#getSpecificTrace_Arduino_tracedSketchs()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<TracedSketch> getArduino_tracedSketchs();

	/**
	 * Returns the value of the '<em><b>Arduino traced Sound Sensors</b></em>' containment reference list.
	 * The list contents are of type {@link arduinoTrace.States.arduino.TracedSoundSensor}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Arduino traced Sound Sensors</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arduino traced Sound Sensors</em>' containment reference list.
	 * @see arduinoTrace.ArduinoTracePackage#getSpecificTrace_Arduino_tracedSoundSensors()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<TracedSoundSensor> getArduino_tracedSoundSensors();

	/**
	 * Returns the value of the '<em><b>States Trace</b></em>' containment reference list.
	 * The list contents are of type {@link arduinoTrace.States.State}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>States Trace</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>States Trace</em>' containment reference list.
	 * @see arduinoTrace.ArduinoTracePackage#getSpecificTrace_StatesTrace()
	 * @model containment="true"
	 * @generated
	 */
	EList<State> getStatesTrace();

} // SpecificTrace
