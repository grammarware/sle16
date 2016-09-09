/**
 */
package arduinoTrace.impl;

import arduinoTrace.ArduinoTracePackage;
import arduinoTrace.SpecificTrace;

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

import fr.inria.diverse.trace.commons.model.trace.impl.TraceImpl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Specific Trace</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link arduinoTrace.impl.SpecificTraceImpl#getArduino_BluetoothTransceiver_Push_Sequence <em>Arduino Bluetooth Transceiver Push Sequence</em>}</li>
 *   <li>{@link arduinoTrace.impl.SpecificTraceImpl#getArduino_Delay_Execute_Sequence <em>Arduino Delay Execute Sequence</em>}</li>
 *   <li>{@link arduinoTrace.impl.SpecificTraceImpl#getArduino_If_Execute_Sequence <em>Arduino If Execute Sequence</em>}</li>
 *   <li>{@link arduinoTrace.impl.SpecificTraceImpl#getArduino_ModuleAssignment_Execute_Sequence <em>Arduino Module Assignment Execute Sequence</em>}</li>
 *   <li>{@link arduinoTrace.impl.SpecificTraceImpl#getArduino_Project_Setup_Sequence <em>Arduino Project Setup Sequence</em>}</li>
 *   <li>{@link arduinoTrace.impl.SpecificTraceImpl#getArduino_Repeat_Execute_Sequence <em>Arduino Repeat Execute Sequence</em>}</li>
 *   <li>{@link arduinoTrace.impl.SpecificTraceImpl#getArduino_VariableAssignment_Execute_Sequence <em>Arduino Variable Assignment Execute Sequence</em>}</li>
 *   <li>{@link arduinoTrace.impl.SpecificTraceImpl#getArduino_VariableDeclaration_Execute_Sequence <em>Arduino Variable Declaration Execute Sequence</em>}</li>
 *   <li>{@link arduinoTrace.impl.SpecificTraceImpl#getArduino_tracedAmbientLightSensors <em>Arduino traced Ambient Light Sensors</em>}</li>
 *   <li>{@link arduinoTrace.impl.SpecificTraceImpl#getArduino_tracedAnalogPins <em>Arduino traced Analog Pins</em>}</li>
 *   <li>{@link arduinoTrace.impl.SpecificTraceImpl#getArduino_tracedArduinoBoards <em>Arduino traced Arduino Boards</em>}</li>
 *   <li>{@link arduinoTrace.impl.SpecificTraceImpl#getArduino_tracedBluetoothTransceivers <em>Arduino traced Bluetooth Transceivers</em>}</li>
 *   <li>{@link arduinoTrace.impl.SpecificTraceImpl#getArduino_tracedBooleanVariables <em>Arduino traced Boolean Variables</em>}</li>
 *   <li>{@link arduinoTrace.impl.SpecificTraceImpl#getArduino_tracedBuzzers <em>Arduino traced Buzzers</em>}</li>
 *   <li>{@link arduinoTrace.impl.SpecificTraceImpl#getArduino_tracedDigitalPins <em>Arduino traced Digital Pins</em>}</li>
 *   <li>{@link arduinoTrace.impl.SpecificTraceImpl#getArduino_tracedFans <em>Arduino traced Fans</em>}</li>
 *   <li>{@link arduinoTrace.impl.SpecificTraceImpl#getArduino_tracedInfraRedSensors <em>Arduino traced Infra Red Sensors</em>}</li>
 *   <li>{@link arduinoTrace.impl.SpecificTraceImpl#getArduino_tracedIntegerVariables <em>Arduino traced Integer Variables</em>}</li>
 *   <li>{@link arduinoTrace.impl.SpecificTraceImpl#getArduino_tracedLEDs <em>Arduino traced LE Ds</em>}</li>
 *   <li>{@link arduinoTrace.impl.SpecificTraceImpl#getArduino_tracedMicroServos <em>Arduino traced Micro Servos</em>}</li>
 *   <li>{@link arduinoTrace.impl.SpecificTraceImpl#getArduino_tracedMusicPlayers <em>Arduino traced Music Players</em>}</li>
 *   <li>{@link arduinoTrace.impl.SpecificTraceImpl#getArduino_tracedPushButtons <em>Arduino traced Push Buttons</em>}</li>
 *   <li>{@link arduinoTrace.impl.SpecificTraceImpl#getArduino_tracedRotationSensors <em>Arduino traced Rotation Sensors</em>}</li>
 *   <li>{@link arduinoTrace.impl.SpecificTraceImpl#getArduino_tracedSketchs <em>Arduino traced Sketchs</em>}</li>
 *   <li>{@link arduinoTrace.impl.SpecificTraceImpl#getArduino_tracedSoundSensors <em>Arduino traced Sound Sensors</em>}</li>
 *   <li>{@link arduinoTrace.impl.SpecificTraceImpl#getStatesTrace <em>States Trace</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SpecificTraceImpl extends TraceImpl<SequentialStep<SpecificStep>> implements SpecificTrace {
	/**
	 * The cached value of the '{@link #getArduino_BluetoothTransceiver_Push_Sequence() <em>Arduino Bluetooth Transceiver Push Sequence</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArduino_BluetoothTransceiver_Push_Sequence()
	 * @generated
	 * @ordered
	 */
	protected EList<Arduino_BluetoothTransceiver_Push> arduino_BluetoothTransceiver_Push_Sequence;

	/**
	 * The cached value of the '{@link #getArduino_Delay_Execute_Sequence() <em>Arduino Delay Execute Sequence</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArduino_Delay_Execute_Sequence()
	 * @generated
	 * @ordered
	 */
	protected EList<Arduino_Delay_Execute> arduino_Delay_Execute_Sequence;

	/**
	 * The cached value of the '{@link #getArduino_If_Execute_Sequence() <em>Arduino If Execute Sequence</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArduino_If_Execute_Sequence()
	 * @generated
	 * @ordered
	 */
	protected EList<Arduino_If_Execute> arduino_If_Execute_Sequence;

	/**
	 * The cached value of the '{@link #getArduino_ModuleAssignment_Execute_Sequence() <em>Arduino Module Assignment Execute Sequence</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArduino_ModuleAssignment_Execute_Sequence()
	 * @generated
	 * @ordered
	 */
	protected EList<Arduino_ModuleAssignment_Execute> arduino_ModuleAssignment_Execute_Sequence;

	/**
	 * The cached value of the '{@link #getArduino_Project_Setup_Sequence() <em>Arduino Project Setup Sequence</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArduino_Project_Setup_Sequence()
	 * @generated
	 * @ordered
	 */
	protected EList<Arduino_Project_Setup> arduino_Project_Setup_Sequence;

	/**
	 * The cached value of the '{@link #getArduino_Repeat_Execute_Sequence() <em>Arduino Repeat Execute Sequence</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArduino_Repeat_Execute_Sequence()
	 * @generated
	 * @ordered
	 */
	protected EList<Arduino_Repeat_Execute> arduino_Repeat_Execute_Sequence;

	/**
	 * The cached value of the '{@link #getArduino_VariableAssignment_Execute_Sequence() <em>Arduino Variable Assignment Execute Sequence</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArduino_VariableAssignment_Execute_Sequence()
	 * @generated
	 * @ordered
	 */
	protected EList<Arduino_VariableAssignment_Execute> arduino_VariableAssignment_Execute_Sequence;

	/**
	 * The cached value of the '{@link #getArduino_VariableDeclaration_Execute_Sequence() <em>Arduino Variable Declaration Execute Sequence</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArduino_VariableDeclaration_Execute_Sequence()
	 * @generated
	 * @ordered
	 */
	protected EList<Arduino_VariableDeclaration_Execute> arduino_VariableDeclaration_Execute_Sequence;

	/**
	 * The cached value of the '{@link #getArduino_tracedAmbientLightSensors() <em>Arduino traced Ambient Light Sensors</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArduino_tracedAmbientLightSensors()
	 * @generated
	 * @ordered
	 */
	protected EList<TracedAmbientLightSensor> arduino_tracedAmbientLightSensors;

	/**
	 * The cached value of the '{@link #getArduino_tracedAnalogPins() <em>Arduino traced Analog Pins</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArduino_tracedAnalogPins()
	 * @generated
	 * @ordered
	 */
	protected EList<TracedAnalogPin> arduino_tracedAnalogPins;

	/**
	 * The cached value of the '{@link #getArduino_tracedArduinoBoards() <em>Arduino traced Arduino Boards</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArduino_tracedArduinoBoards()
	 * @generated
	 * @ordered
	 */
	protected EList<TracedArduinoBoard> arduino_tracedArduinoBoards;

	/**
	 * The cached value of the '{@link #getArduino_tracedBluetoothTransceivers() <em>Arduino traced Bluetooth Transceivers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArduino_tracedBluetoothTransceivers()
	 * @generated
	 * @ordered
	 */
	protected EList<TracedBluetoothTransceiver> arduino_tracedBluetoothTransceivers;

	/**
	 * The cached value of the '{@link #getArduino_tracedBooleanVariables() <em>Arduino traced Boolean Variables</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArduino_tracedBooleanVariables()
	 * @generated
	 * @ordered
	 */
	protected EList<TracedBooleanVariable> arduino_tracedBooleanVariables;

	/**
	 * The cached value of the '{@link #getArduino_tracedBuzzers() <em>Arduino traced Buzzers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArduino_tracedBuzzers()
	 * @generated
	 * @ordered
	 */
	protected EList<TracedBuzzer> arduino_tracedBuzzers;

	/**
	 * The cached value of the '{@link #getArduino_tracedDigitalPins() <em>Arduino traced Digital Pins</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArduino_tracedDigitalPins()
	 * @generated
	 * @ordered
	 */
	protected EList<TracedDigitalPin> arduino_tracedDigitalPins;

	/**
	 * The cached value of the '{@link #getArduino_tracedFans() <em>Arduino traced Fans</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArduino_tracedFans()
	 * @generated
	 * @ordered
	 */
	protected EList<TracedFan> arduino_tracedFans;

	/**
	 * The cached value of the '{@link #getArduino_tracedInfraRedSensors() <em>Arduino traced Infra Red Sensors</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArduino_tracedInfraRedSensors()
	 * @generated
	 * @ordered
	 */
	protected EList<TracedInfraRedSensor> arduino_tracedInfraRedSensors;

	/**
	 * The cached value of the '{@link #getArduino_tracedIntegerVariables() <em>Arduino traced Integer Variables</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArduino_tracedIntegerVariables()
	 * @generated
	 * @ordered
	 */
	protected EList<TracedIntegerVariable> arduino_tracedIntegerVariables;

	/**
	 * The cached value of the '{@link #getArduino_tracedLEDs() <em>Arduino traced LE Ds</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArduino_tracedLEDs()
	 * @generated
	 * @ordered
	 */
	protected EList<TracedLED> arduino_tracedLEDs;

	/**
	 * The cached value of the '{@link #getArduino_tracedMicroServos() <em>Arduino traced Micro Servos</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArduino_tracedMicroServos()
	 * @generated
	 * @ordered
	 */
	protected EList<TracedMicroServo> arduino_tracedMicroServos;

	/**
	 * The cached value of the '{@link #getArduino_tracedMusicPlayers() <em>Arduino traced Music Players</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArduino_tracedMusicPlayers()
	 * @generated
	 * @ordered
	 */
	protected EList<TracedMusicPlayer> arduino_tracedMusicPlayers;

	/**
	 * The cached value of the '{@link #getArduino_tracedPushButtons() <em>Arduino traced Push Buttons</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArduino_tracedPushButtons()
	 * @generated
	 * @ordered
	 */
	protected EList<TracedPushButton> arduino_tracedPushButtons;

	/**
	 * The cached value of the '{@link #getArduino_tracedRotationSensors() <em>Arduino traced Rotation Sensors</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArduino_tracedRotationSensors()
	 * @generated
	 * @ordered
	 */
	protected EList<TracedRotationSensor> arduino_tracedRotationSensors;

	/**
	 * The cached value of the '{@link #getArduino_tracedSketchs() <em>Arduino traced Sketchs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArduino_tracedSketchs()
	 * @generated
	 * @ordered
	 */
	protected EList<TracedSketch> arduino_tracedSketchs;

	/**
	 * The cached value of the '{@link #getArduino_tracedSoundSensors() <em>Arduino traced Sound Sensors</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArduino_tracedSoundSensors()
	 * @generated
	 * @ordered
	 */
	protected EList<TracedSoundSensor> arduino_tracedSoundSensors;

	/**
	 * The cached value of the '{@link #getStatesTrace() <em>States Trace</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatesTrace()
	 * @generated
	 * @ordered
	 */
	protected EList<State> statesTrace;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SpecificTraceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArduinoTracePackage.Literals.SPECIFIC_TRACE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * This is specialized for the more specific type known in this context.
	 * @generated
	 */
	@Override
	public NotificationChain basicSetRootStep(SequentialStep<SpecificStep> newRootStep, NotificationChain msgs) {
		return super.basicSetRootStep(newRootStep, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Arduino_BluetoothTransceiver_Push> getArduino_BluetoothTransceiver_Push_Sequence() {
		if (arduino_BluetoothTransceiver_Push_Sequence == null) {
			arduino_BluetoothTransceiver_Push_Sequence = new EObjectResolvingEList<Arduino_BluetoothTransceiver_Push>(Arduino_BluetoothTransceiver_Push.class, this, ArduinoTracePackage.SPECIFIC_TRACE__ARDUINO_BLUETOOTH_TRANSCEIVER_PUSH_SEQUENCE);
		}
		return arduino_BluetoothTransceiver_Push_Sequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Arduino_Delay_Execute> getArduino_Delay_Execute_Sequence() {
		if (arduino_Delay_Execute_Sequence == null) {
			arduino_Delay_Execute_Sequence = new EObjectResolvingEList<Arduino_Delay_Execute>(Arduino_Delay_Execute.class, this, ArduinoTracePackage.SPECIFIC_TRACE__ARDUINO_DELAY_EXECUTE_SEQUENCE);
		}
		return arduino_Delay_Execute_Sequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Arduino_If_Execute> getArduino_If_Execute_Sequence() {
		if (arduino_If_Execute_Sequence == null) {
			arduino_If_Execute_Sequence = new EObjectResolvingEList<Arduino_If_Execute>(Arduino_If_Execute.class, this, ArduinoTracePackage.SPECIFIC_TRACE__ARDUINO_IF_EXECUTE_SEQUENCE);
		}
		return arduino_If_Execute_Sequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Arduino_ModuleAssignment_Execute> getArduino_ModuleAssignment_Execute_Sequence() {
		if (arduino_ModuleAssignment_Execute_Sequence == null) {
			arduino_ModuleAssignment_Execute_Sequence = new EObjectResolvingEList<Arduino_ModuleAssignment_Execute>(Arduino_ModuleAssignment_Execute.class, this, ArduinoTracePackage.SPECIFIC_TRACE__ARDUINO_MODULE_ASSIGNMENT_EXECUTE_SEQUENCE);
		}
		return arduino_ModuleAssignment_Execute_Sequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Arduino_Project_Setup> getArduino_Project_Setup_Sequence() {
		if (arduino_Project_Setup_Sequence == null) {
			arduino_Project_Setup_Sequence = new EObjectResolvingEList<Arduino_Project_Setup>(Arduino_Project_Setup.class, this, ArduinoTracePackage.SPECIFIC_TRACE__ARDUINO_PROJECT_SETUP_SEQUENCE);
		}
		return arduino_Project_Setup_Sequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Arduino_Repeat_Execute> getArduino_Repeat_Execute_Sequence() {
		if (arduino_Repeat_Execute_Sequence == null) {
			arduino_Repeat_Execute_Sequence = new EObjectResolvingEList<Arduino_Repeat_Execute>(Arduino_Repeat_Execute.class, this, ArduinoTracePackage.SPECIFIC_TRACE__ARDUINO_REPEAT_EXECUTE_SEQUENCE);
		}
		return arduino_Repeat_Execute_Sequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Arduino_VariableAssignment_Execute> getArduino_VariableAssignment_Execute_Sequence() {
		if (arduino_VariableAssignment_Execute_Sequence == null) {
			arduino_VariableAssignment_Execute_Sequence = new EObjectResolvingEList<Arduino_VariableAssignment_Execute>(Arduino_VariableAssignment_Execute.class, this, ArduinoTracePackage.SPECIFIC_TRACE__ARDUINO_VARIABLE_ASSIGNMENT_EXECUTE_SEQUENCE);
		}
		return arduino_VariableAssignment_Execute_Sequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Arduino_VariableDeclaration_Execute> getArduino_VariableDeclaration_Execute_Sequence() {
		if (arduino_VariableDeclaration_Execute_Sequence == null) {
			arduino_VariableDeclaration_Execute_Sequence = new EObjectResolvingEList<Arduino_VariableDeclaration_Execute>(Arduino_VariableDeclaration_Execute.class, this, ArduinoTracePackage.SPECIFIC_TRACE__ARDUINO_VARIABLE_DECLARATION_EXECUTE_SEQUENCE);
		}
		return arduino_VariableDeclaration_Execute_Sequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TracedAmbientLightSensor> getArduino_tracedAmbientLightSensors() {
		if (arduino_tracedAmbientLightSensors == null) {
			arduino_tracedAmbientLightSensors = new EObjectContainmentEList<TracedAmbientLightSensor>(TracedAmbientLightSensor.class, this, ArduinoTracePackage.SPECIFIC_TRACE__ARDUINO_TRACED_AMBIENT_LIGHT_SENSORS);
		}
		return arduino_tracedAmbientLightSensors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TracedAnalogPin> getArduino_tracedAnalogPins() {
		if (arduino_tracedAnalogPins == null) {
			arduino_tracedAnalogPins = new EObjectContainmentEList<TracedAnalogPin>(TracedAnalogPin.class, this, ArduinoTracePackage.SPECIFIC_TRACE__ARDUINO_TRACED_ANALOG_PINS);
		}
		return arduino_tracedAnalogPins;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TracedArduinoBoard> getArduino_tracedArduinoBoards() {
		if (arduino_tracedArduinoBoards == null) {
			arduino_tracedArduinoBoards = new EObjectContainmentEList<TracedArduinoBoard>(TracedArduinoBoard.class, this, ArduinoTracePackage.SPECIFIC_TRACE__ARDUINO_TRACED_ARDUINO_BOARDS);
		}
		return arduino_tracedArduinoBoards;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TracedBluetoothTransceiver> getArduino_tracedBluetoothTransceivers() {
		if (arduino_tracedBluetoothTransceivers == null) {
			arduino_tracedBluetoothTransceivers = new EObjectContainmentEList<TracedBluetoothTransceiver>(TracedBluetoothTransceiver.class, this, ArduinoTracePackage.SPECIFIC_TRACE__ARDUINO_TRACED_BLUETOOTH_TRANSCEIVERS);
		}
		return arduino_tracedBluetoothTransceivers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TracedBooleanVariable> getArduino_tracedBooleanVariables() {
		if (arduino_tracedBooleanVariables == null) {
			arduino_tracedBooleanVariables = new EObjectContainmentEList<TracedBooleanVariable>(TracedBooleanVariable.class, this, ArduinoTracePackage.SPECIFIC_TRACE__ARDUINO_TRACED_BOOLEAN_VARIABLES);
		}
		return arduino_tracedBooleanVariables;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TracedBuzzer> getArduino_tracedBuzzers() {
		if (arduino_tracedBuzzers == null) {
			arduino_tracedBuzzers = new EObjectContainmentEList<TracedBuzzer>(TracedBuzzer.class, this, ArduinoTracePackage.SPECIFIC_TRACE__ARDUINO_TRACED_BUZZERS);
		}
		return arduino_tracedBuzzers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TracedDigitalPin> getArduino_tracedDigitalPins() {
		if (arduino_tracedDigitalPins == null) {
			arduino_tracedDigitalPins = new EObjectContainmentEList<TracedDigitalPin>(TracedDigitalPin.class, this, ArduinoTracePackage.SPECIFIC_TRACE__ARDUINO_TRACED_DIGITAL_PINS);
		}
		return arduino_tracedDigitalPins;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TracedFan> getArduino_tracedFans() {
		if (arduino_tracedFans == null) {
			arduino_tracedFans = new EObjectContainmentEList<TracedFan>(TracedFan.class, this, ArduinoTracePackage.SPECIFIC_TRACE__ARDUINO_TRACED_FANS);
		}
		return arduino_tracedFans;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TracedInfraRedSensor> getArduino_tracedInfraRedSensors() {
		if (arduino_tracedInfraRedSensors == null) {
			arduino_tracedInfraRedSensors = new EObjectContainmentEList<TracedInfraRedSensor>(TracedInfraRedSensor.class, this, ArduinoTracePackage.SPECIFIC_TRACE__ARDUINO_TRACED_INFRA_RED_SENSORS);
		}
		return arduino_tracedInfraRedSensors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TracedIntegerVariable> getArduino_tracedIntegerVariables() {
		if (arduino_tracedIntegerVariables == null) {
			arduino_tracedIntegerVariables = new EObjectContainmentEList<TracedIntegerVariable>(TracedIntegerVariable.class, this, ArduinoTracePackage.SPECIFIC_TRACE__ARDUINO_TRACED_INTEGER_VARIABLES);
		}
		return arduino_tracedIntegerVariables;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TracedLED> getArduino_tracedLEDs() {
		if (arduino_tracedLEDs == null) {
			arduino_tracedLEDs = new EObjectContainmentEList<TracedLED>(TracedLED.class, this, ArduinoTracePackage.SPECIFIC_TRACE__ARDUINO_TRACED_LE_DS);
		}
		return arduino_tracedLEDs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TracedMicroServo> getArduino_tracedMicroServos() {
		if (arduino_tracedMicroServos == null) {
			arduino_tracedMicroServos = new EObjectContainmentEList<TracedMicroServo>(TracedMicroServo.class, this, ArduinoTracePackage.SPECIFIC_TRACE__ARDUINO_TRACED_MICRO_SERVOS);
		}
		return arduino_tracedMicroServos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TracedMusicPlayer> getArduino_tracedMusicPlayers() {
		if (arduino_tracedMusicPlayers == null) {
			arduino_tracedMusicPlayers = new EObjectContainmentEList<TracedMusicPlayer>(TracedMusicPlayer.class, this, ArduinoTracePackage.SPECIFIC_TRACE__ARDUINO_TRACED_MUSIC_PLAYERS);
		}
		return arduino_tracedMusicPlayers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TracedPushButton> getArduino_tracedPushButtons() {
		if (arduino_tracedPushButtons == null) {
			arduino_tracedPushButtons = new EObjectContainmentEList<TracedPushButton>(TracedPushButton.class, this, ArduinoTracePackage.SPECIFIC_TRACE__ARDUINO_TRACED_PUSH_BUTTONS);
		}
		return arduino_tracedPushButtons;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TracedRotationSensor> getArduino_tracedRotationSensors() {
		if (arduino_tracedRotationSensors == null) {
			arduino_tracedRotationSensors = new EObjectContainmentEList<TracedRotationSensor>(TracedRotationSensor.class, this, ArduinoTracePackage.SPECIFIC_TRACE__ARDUINO_TRACED_ROTATION_SENSORS);
		}
		return arduino_tracedRotationSensors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TracedSketch> getArduino_tracedSketchs() {
		if (arduino_tracedSketchs == null) {
			arduino_tracedSketchs = new EObjectContainmentEList<TracedSketch>(TracedSketch.class, this, ArduinoTracePackage.SPECIFIC_TRACE__ARDUINO_TRACED_SKETCHS);
		}
		return arduino_tracedSketchs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TracedSoundSensor> getArduino_tracedSoundSensors() {
		if (arduino_tracedSoundSensors == null) {
			arduino_tracedSoundSensors = new EObjectContainmentEList<TracedSoundSensor>(TracedSoundSensor.class, this, ArduinoTracePackage.SPECIFIC_TRACE__ARDUINO_TRACED_SOUND_SENSORS);
		}
		return arduino_tracedSoundSensors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<State> getStatesTrace() {
		if (statesTrace == null) {
			statesTrace = new EObjectContainmentEList<State>(State.class, this, ArduinoTracePackage.SPECIFIC_TRACE__STATES_TRACE);
		}
		return statesTrace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ArduinoTracePackage.SPECIFIC_TRACE__ARDUINO_TRACED_AMBIENT_LIGHT_SENSORS:
				return ((InternalEList<?>)getArduino_tracedAmbientLightSensors()).basicRemove(otherEnd, msgs);
			case ArduinoTracePackage.SPECIFIC_TRACE__ARDUINO_TRACED_ANALOG_PINS:
				return ((InternalEList<?>)getArduino_tracedAnalogPins()).basicRemove(otherEnd, msgs);
			case ArduinoTracePackage.SPECIFIC_TRACE__ARDUINO_TRACED_ARDUINO_BOARDS:
				return ((InternalEList<?>)getArduino_tracedArduinoBoards()).basicRemove(otherEnd, msgs);
			case ArduinoTracePackage.SPECIFIC_TRACE__ARDUINO_TRACED_BLUETOOTH_TRANSCEIVERS:
				return ((InternalEList<?>)getArduino_tracedBluetoothTransceivers()).basicRemove(otherEnd, msgs);
			case ArduinoTracePackage.SPECIFIC_TRACE__ARDUINO_TRACED_BOOLEAN_VARIABLES:
				return ((InternalEList<?>)getArduino_tracedBooleanVariables()).basicRemove(otherEnd, msgs);
			case ArduinoTracePackage.SPECIFIC_TRACE__ARDUINO_TRACED_BUZZERS:
				return ((InternalEList<?>)getArduino_tracedBuzzers()).basicRemove(otherEnd, msgs);
			case ArduinoTracePackage.SPECIFIC_TRACE__ARDUINO_TRACED_DIGITAL_PINS:
				return ((InternalEList<?>)getArduino_tracedDigitalPins()).basicRemove(otherEnd, msgs);
			case ArduinoTracePackage.SPECIFIC_TRACE__ARDUINO_TRACED_FANS:
				return ((InternalEList<?>)getArduino_tracedFans()).basicRemove(otherEnd, msgs);
			case ArduinoTracePackage.SPECIFIC_TRACE__ARDUINO_TRACED_INFRA_RED_SENSORS:
				return ((InternalEList<?>)getArduino_tracedInfraRedSensors()).basicRemove(otherEnd, msgs);
			case ArduinoTracePackage.SPECIFIC_TRACE__ARDUINO_TRACED_INTEGER_VARIABLES:
				return ((InternalEList<?>)getArduino_tracedIntegerVariables()).basicRemove(otherEnd, msgs);
			case ArduinoTracePackage.SPECIFIC_TRACE__ARDUINO_TRACED_LE_DS:
				return ((InternalEList<?>)getArduino_tracedLEDs()).basicRemove(otherEnd, msgs);
			case ArduinoTracePackage.SPECIFIC_TRACE__ARDUINO_TRACED_MICRO_SERVOS:
				return ((InternalEList<?>)getArduino_tracedMicroServos()).basicRemove(otherEnd, msgs);
			case ArduinoTracePackage.SPECIFIC_TRACE__ARDUINO_TRACED_MUSIC_PLAYERS:
				return ((InternalEList<?>)getArduino_tracedMusicPlayers()).basicRemove(otherEnd, msgs);
			case ArduinoTracePackage.SPECIFIC_TRACE__ARDUINO_TRACED_PUSH_BUTTONS:
				return ((InternalEList<?>)getArduino_tracedPushButtons()).basicRemove(otherEnd, msgs);
			case ArduinoTracePackage.SPECIFIC_TRACE__ARDUINO_TRACED_ROTATION_SENSORS:
				return ((InternalEList<?>)getArduino_tracedRotationSensors()).basicRemove(otherEnd, msgs);
			case ArduinoTracePackage.SPECIFIC_TRACE__ARDUINO_TRACED_SKETCHS:
				return ((InternalEList<?>)getArduino_tracedSketchs()).basicRemove(otherEnd, msgs);
			case ArduinoTracePackage.SPECIFIC_TRACE__ARDUINO_TRACED_SOUND_SENSORS:
				return ((InternalEList<?>)getArduino_tracedSoundSensors()).basicRemove(otherEnd, msgs);
			case ArduinoTracePackage.SPECIFIC_TRACE__STATES_TRACE:
				return ((InternalEList<?>)getStatesTrace()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ArduinoTracePackage.SPECIFIC_TRACE__ARDUINO_BLUETOOTH_TRANSCEIVER_PUSH_SEQUENCE:
				return getArduino_BluetoothTransceiver_Push_Sequence();
			case ArduinoTracePackage.SPECIFIC_TRACE__ARDUINO_DELAY_EXECUTE_SEQUENCE:
				return getArduino_Delay_Execute_Sequence();
			case ArduinoTracePackage.SPECIFIC_TRACE__ARDUINO_IF_EXECUTE_SEQUENCE:
				return getArduino_If_Execute_Sequence();
			case ArduinoTracePackage.SPECIFIC_TRACE__ARDUINO_MODULE_ASSIGNMENT_EXECUTE_SEQUENCE:
				return getArduino_ModuleAssignment_Execute_Sequence();
			case ArduinoTracePackage.SPECIFIC_TRACE__ARDUINO_PROJECT_SETUP_SEQUENCE:
				return getArduino_Project_Setup_Sequence();
			case ArduinoTracePackage.SPECIFIC_TRACE__ARDUINO_REPEAT_EXECUTE_SEQUENCE:
				return getArduino_Repeat_Execute_Sequence();
			case ArduinoTracePackage.SPECIFIC_TRACE__ARDUINO_VARIABLE_ASSIGNMENT_EXECUTE_SEQUENCE:
				return getArduino_VariableAssignment_Execute_Sequence();
			case ArduinoTracePackage.SPECIFIC_TRACE__ARDUINO_VARIABLE_DECLARATION_EXECUTE_SEQUENCE:
				return getArduino_VariableDeclaration_Execute_Sequence();
			case ArduinoTracePackage.SPECIFIC_TRACE__ARDUINO_TRACED_AMBIENT_LIGHT_SENSORS:
				return getArduino_tracedAmbientLightSensors();
			case ArduinoTracePackage.SPECIFIC_TRACE__ARDUINO_TRACED_ANALOG_PINS:
				return getArduino_tracedAnalogPins();
			case ArduinoTracePackage.SPECIFIC_TRACE__ARDUINO_TRACED_ARDUINO_BOARDS:
				return getArduino_tracedArduinoBoards();
			case ArduinoTracePackage.SPECIFIC_TRACE__ARDUINO_TRACED_BLUETOOTH_TRANSCEIVERS:
				return getArduino_tracedBluetoothTransceivers();
			case ArduinoTracePackage.SPECIFIC_TRACE__ARDUINO_TRACED_BOOLEAN_VARIABLES:
				return getArduino_tracedBooleanVariables();
			case ArduinoTracePackage.SPECIFIC_TRACE__ARDUINO_TRACED_BUZZERS:
				return getArduino_tracedBuzzers();
			case ArduinoTracePackage.SPECIFIC_TRACE__ARDUINO_TRACED_DIGITAL_PINS:
				return getArduino_tracedDigitalPins();
			case ArduinoTracePackage.SPECIFIC_TRACE__ARDUINO_TRACED_FANS:
				return getArduino_tracedFans();
			case ArduinoTracePackage.SPECIFIC_TRACE__ARDUINO_TRACED_INFRA_RED_SENSORS:
				return getArduino_tracedInfraRedSensors();
			case ArduinoTracePackage.SPECIFIC_TRACE__ARDUINO_TRACED_INTEGER_VARIABLES:
				return getArduino_tracedIntegerVariables();
			case ArduinoTracePackage.SPECIFIC_TRACE__ARDUINO_TRACED_LE_DS:
				return getArduino_tracedLEDs();
			case ArduinoTracePackage.SPECIFIC_TRACE__ARDUINO_TRACED_MICRO_SERVOS:
				return getArduino_tracedMicroServos();
			case ArduinoTracePackage.SPECIFIC_TRACE__ARDUINO_TRACED_MUSIC_PLAYERS:
				return getArduino_tracedMusicPlayers();
			case ArduinoTracePackage.SPECIFIC_TRACE__ARDUINO_TRACED_PUSH_BUTTONS:
				return getArduino_tracedPushButtons();
			case ArduinoTracePackage.SPECIFIC_TRACE__ARDUINO_TRACED_ROTATION_SENSORS:
				return getArduino_tracedRotationSensors();
			case ArduinoTracePackage.SPECIFIC_TRACE__ARDUINO_TRACED_SKETCHS:
				return getArduino_tracedSketchs();
			case ArduinoTracePackage.SPECIFIC_TRACE__ARDUINO_TRACED_SOUND_SENSORS:
				return getArduino_tracedSoundSensors();
			case ArduinoTracePackage.SPECIFIC_TRACE__STATES_TRACE:
				return getStatesTrace();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ArduinoTracePackage.SPECIFIC_TRACE__ARDUINO_BLUETOOTH_TRANSCEIVER_PUSH_SEQUENCE:
				getArduino_BluetoothTransceiver_Push_Sequence().clear();
				getArduino_BluetoothTransceiver_Push_Sequence().addAll((Collection<? extends Arduino_BluetoothTransceiver_Push>)newValue);
				return;
			case ArduinoTracePackage.SPECIFIC_TRACE__ARDUINO_DELAY_EXECUTE_SEQUENCE:
				getArduino_Delay_Execute_Sequence().clear();
				getArduino_Delay_Execute_Sequence().addAll((Collection<? extends Arduino_Delay_Execute>)newValue);
				return;
			case ArduinoTracePackage.SPECIFIC_TRACE__ARDUINO_IF_EXECUTE_SEQUENCE:
				getArduino_If_Execute_Sequence().clear();
				getArduino_If_Execute_Sequence().addAll((Collection<? extends Arduino_If_Execute>)newValue);
				return;
			case ArduinoTracePackage.SPECIFIC_TRACE__ARDUINO_MODULE_ASSIGNMENT_EXECUTE_SEQUENCE:
				getArduino_ModuleAssignment_Execute_Sequence().clear();
				getArduino_ModuleAssignment_Execute_Sequence().addAll((Collection<? extends Arduino_ModuleAssignment_Execute>)newValue);
				return;
			case ArduinoTracePackage.SPECIFIC_TRACE__ARDUINO_PROJECT_SETUP_SEQUENCE:
				getArduino_Project_Setup_Sequence().clear();
				getArduino_Project_Setup_Sequence().addAll((Collection<? extends Arduino_Project_Setup>)newValue);
				return;
			case ArduinoTracePackage.SPECIFIC_TRACE__ARDUINO_REPEAT_EXECUTE_SEQUENCE:
				getArduino_Repeat_Execute_Sequence().clear();
				getArduino_Repeat_Execute_Sequence().addAll((Collection<? extends Arduino_Repeat_Execute>)newValue);
				return;
			case ArduinoTracePackage.SPECIFIC_TRACE__ARDUINO_VARIABLE_ASSIGNMENT_EXECUTE_SEQUENCE:
				getArduino_VariableAssignment_Execute_Sequence().clear();
				getArduino_VariableAssignment_Execute_Sequence().addAll((Collection<? extends Arduino_VariableAssignment_Execute>)newValue);
				return;
			case ArduinoTracePackage.SPECIFIC_TRACE__ARDUINO_VARIABLE_DECLARATION_EXECUTE_SEQUENCE:
				getArduino_VariableDeclaration_Execute_Sequence().clear();
				getArduino_VariableDeclaration_Execute_Sequence().addAll((Collection<? extends Arduino_VariableDeclaration_Execute>)newValue);
				return;
			case ArduinoTracePackage.SPECIFIC_TRACE__ARDUINO_TRACED_AMBIENT_LIGHT_SENSORS:
				getArduino_tracedAmbientLightSensors().clear();
				getArduino_tracedAmbientLightSensors().addAll((Collection<? extends TracedAmbientLightSensor>)newValue);
				return;
			case ArduinoTracePackage.SPECIFIC_TRACE__ARDUINO_TRACED_ANALOG_PINS:
				getArduino_tracedAnalogPins().clear();
				getArduino_tracedAnalogPins().addAll((Collection<? extends TracedAnalogPin>)newValue);
				return;
			case ArduinoTracePackage.SPECIFIC_TRACE__ARDUINO_TRACED_ARDUINO_BOARDS:
				getArduino_tracedArduinoBoards().clear();
				getArduino_tracedArduinoBoards().addAll((Collection<? extends TracedArduinoBoard>)newValue);
				return;
			case ArduinoTracePackage.SPECIFIC_TRACE__ARDUINO_TRACED_BLUETOOTH_TRANSCEIVERS:
				getArduino_tracedBluetoothTransceivers().clear();
				getArduino_tracedBluetoothTransceivers().addAll((Collection<? extends TracedBluetoothTransceiver>)newValue);
				return;
			case ArduinoTracePackage.SPECIFIC_TRACE__ARDUINO_TRACED_BOOLEAN_VARIABLES:
				getArduino_tracedBooleanVariables().clear();
				getArduino_tracedBooleanVariables().addAll((Collection<? extends TracedBooleanVariable>)newValue);
				return;
			case ArduinoTracePackage.SPECIFIC_TRACE__ARDUINO_TRACED_BUZZERS:
				getArduino_tracedBuzzers().clear();
				getArduino_tracedBuzzers().addAll((Collection<? extends TracedBuzzer>)newValue);
				return;
			case ArduinoTracePackage.SPECIFIC_TRACE__ARDUINO_TRACED_DIGITAL_PINS:
				getArduino_tracedDigitalPins().clear();
				getArduino_tracedDigitalPins().addAll((Collection<? extends TracedDigitalPin>)newValue);
				return;
			case ArduinoTracePackage.SPECIFIC_TRACE__ARDUINO_TRACED_FANS:
				getArduino_tracedFans().clear();
				getArduino_tracedFans().addAll((Collection<? extends TracedFan>)newValue);
				return;
			case ArduinoTracePackage.SPECIFIC_TRACE__ARDUINO_TRACED_INFRA_RED_SENSORS:
				getArduino_tracedInfraRedSensors().clear();
				getArduino_tracedInfraRedSensors().addAll((Collection<? extends TracedInfraRedSensor>)newValue);
				return;
			case ArduinoTracePackage.SPECIFIC_TRACE__ARDUINO_TRACED_INTEGER_VARIABLES:
				getArduino_tracedIntegerVariables().clear();
				getArduino_tracedIntegerVariables().addAll((Collection<? extends TracedIntegerVariable>)newValue);
				return;
			case ArduinoTracePackage.SPECIFIC_TRACE__ARDUINO_TRACED_LE_DS:
				getArduino_tracedLEDs().clear();
				getArduino_tracedLEDs().addAll((Collection<? extends TracedLED>)newValue);
				return;
			case ArduinoTracePackage.SPECIFIC_TRACE__ARDUINO_TRACED_MICRO_SERVOS:
				getArduino_tracedMicroServos().clear();
				getArduino_tracedMicroServos().addAll((Collection<? extends TracedMicroServo>)newValue);
				return;
			case ArduinoTracePackage.SPECIFIC_TRACE__ARDUINO_TRACED_MUSIC_PLAYERS:
				getArduino_tracedMusicPlayers().clear();
				getArduino_tracedMusicPlayers().addAll((Collection<? extends TracedMusicPlayer>)newValue);
				return;
			case ArduinoTracePackage.SPECIFIC_TRACE__ARDUINO_TRACED_PUSH_BUTTONS:
				getArduino_tracedPushButtons().clear();
				getArduino_tracedPushButtons().addAll((Collection<? extends TracedPushButton>)newValue);
				return;
			case ArduinoTracePackage.SPECIFIC_TRACE__ARDUINO_TRACED_ROTATION_SENSORS:
				getArduino_tracedRotationSensors().clear();
				getArduino_tracedRotationSensors().addAll((Collection<? extends TracedRotationSensor>)newValue);
				return;
			case ArduinoTracePackage.SPECIFIC_TRACE__ARDUINO_TRACED_SKETCHS:
				getArduino_tracedSketchs().clear();
				getArduino_tracedSketchs().addAll((Collection<? extends TracedSketch>)newValue);
				return;
			case ArduinoTracePackage.SPECIFIC_TRACE__ARDUINO_TRACED_SOUND_SENSORS:
				getArduino_tracedSoundSensors().clear();
				getArduino_tracedSoundSensors().addAll((Collection<? extends TracedSoundSensor>)newValue);
				return;
			case ArduinoTracePackage.SPECIFIC_TRACE__STATES_TRACE:
				getStatesTrace().clear();
				getStatesTrace().addAll((Collection<? extends State>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ArduinoTracePackage.SPECIFIC_TRACE__ARDUINO_BLUETOOTH_TRANSCEIVER_PUSH_SEQUENCE:
				getArduino_BluetoothTransceiver_Push_Sequence().clear();
				return;
			case ArduinoTracePackage.SPECIFIC_TRACE__ARDUINO_DELAY_EXECUTE_SEQUENCE:
				getArduino_Delay_Execute_Sequence().clear();
				return;
			case ArduinoTracePackage.SPECIFIC_TRACE__ARDUINO_IF_EXECUTE_SEQUENCE:
				getArduino_If_Execute_Sequence().clear();
				return;
			case ArduinoTracePackage.SPECIFIC_TRACE__ARDUINO_MODULE_ASSIGNMENT_EXECUTE_SEQUENCE:
				getArduino_ModuleAssignment_Execute_Sequence().clear();
				return;
			case ArduinoTracePackage.SPECIFIC_TRACE__ARDUINO_PROJECT_SETUP_SEQUENCE:
				getArduino_Project_Setup_Sequence().clear();
				return;
			case ArduinoTracePackage.SPECIFIC_TRACE__ARDUINO_REPEAT_EXECUTE_SEQUENCE:
				getArduino_Repeat_Execute_Sequence().clear();
				return;
			case ArduinoTracePackage.SPECIFIC_TRACE__ARDUINO_VARIABLE_ASSIGNMENT_EXECUTE_SEQUENCE:
				getArduino_VariableAssignment_Execute_Sequence().clear();
				return;
			case ArduinoTracePackage.SPECIFIC_TRACE__ARDUINO_VARIABLE_DECLARATION_EXECUTE_SEQUENCE:
				getArduino_VariableDeclaration_Execute_Sequence().clear();
				return;
			case ArduinoTracePackage.SPECIFIC_TRACE__ARDUINO_TRACED_AMBIENT_LIGHT_SENSORS:
				getArduino_tracedAmbientLightSensors().clear();
				return;
			case ArduinoTracePackage.SPECIFIC_TRACE__ARDUINO_TRACED_ANALOG_PINS:
				getArduino_tracedAnalogPins().clear();
				return;
			case ArduinoTracePackage.SPECIFIC_TRACE__ARDUINO_TRACED_ARDUINO_BOARDS:
				getArduino_tracedArduinoBoards().clear();
				return;
			case ArduinoTracePackage.SPECIFIC_TRACE__ARDUINO_TRACED_BLUETOOTH_TRANSCEIVERS:
				getArduino_tracedBluetoothTransceivers().clear();
				return;
			case ArduinoTracePackage.SPECIFIC_TRACE__ARDUINO_TRACED_BOOLEAN_VARIABLES:
				getArduino_tracedBooleanVariables().clear();
				return;
			case ArduinoTracePackage.SPECIFIC_TRACE__ARDUINO_TRACED_BUZZERS:
				getArduino_tracedBuzzers().clear();
				return;
			case ArduinoTracePackage.SPECIFIC_TRACE__ARDUINO_TRACED_DIGITAL_PINS:
				getArduino_tracedDigitalPins().clear();
				return;
			case ArduinoTracePackage.SPECIFIC_TRACE__ARDUINO_TRACED_FANS:
				getArduino_tracedFans().clear();
				return;
			case ArduinoTracePackage.SPECIFIC_TRACE__ARDUINO_TRACED_INFRA_RED_SENSORS:
				getArduino_tracedInfraRedSensors().clear();
				return;
			case ArduinoTracePackage.SPECIFIC_TRACE__ARDUINO_TRACED_INTEGER_VARIABLES:
				getArduino_tracedIntegerVariables().clear();
				return;
			case ArduinoTracePackage.SPECIFIC_TRACE__ARDUINO_TRACED_LE_DS:
				getArduino_tracedLEDs().clear();
				return;
			case ArduinoTracePackage.SPECIFIC_TRACE__ARDUINO_TRACED_MICRO_SERVOS:
				getArduino_tracedMicroServos().clear();
				return;
			case ArduinoTracePackage.SPECIFIC_TRACE__ARDUINO_TRACED_MUSIC_PLAYERS:
				getArduino_tracedMusicPlayers().clear();
				return;
			case ArduinoTracePackage.SPECIFIC_TRACE__ARDUINO_TRACED_PUSH_BUTTONS:
				getArduino_tracedPushButtons().clear();
				return;
			case ArduinoTracePackage.SPECIFIC_TRACE__ARDUINO_TRACED_ROTATION_SENSORS:
				getArduino_tracedRotationSensors().clear();
				return;
			case ArduinoTracePackage.SPECIFIC_TRACE__ARDUINO_TRACED_SKETCHS:
				getArduino_tracedSketchs().clear();
				return;
			case ArduinoTracePackage.SPECIFIC_TRACE__ARDUINO_TRACED_SOUND_SENSORS:
				getArduino_tracedSoundSensors().clear();
				return;
			case ArduinoTracePackage.SPECIFIC_TRACE__STATES_TRACE:
				getStatesTrace().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ArduinoTracePackage.SPECIFIC_TRACE__ARDUINO_BLUETOOTH_TRANSCEIVER_PUSH_SEQUENCE:
				return arduino_BluetoothTransceiver_Push_Sequence != null && !arduino_BluetoothTransceiver_Push_Sequence.isEmpty();
			case ArduinoTracePackage.SPECIFIC_TRACE__ARDUINO_DELAY_EXECUTE_SEQUENCE:
				return arduino_Delay_Execute_Sequence != null && !arduino_Delay_Execute_Sequence.isEmpty();
			case ArduinoTracePackage.SPECIFIC_TRACE__ARDUINO_IF_EXECUTE_SEQUENCE:
				return arduino_If_Execute_Sequence != null && !arduino_If_Execute_Sequence.isEmpty();
			case ArduinoTracePackage.SPECIFIC_TRACE__ARDUINO_MODULE_ASSIGNMENT_EXECUTE_SEQUENCE:
				return arduino_ModuleAssignment_Execute_Sequence != null && !arduino_ModuleAssignment_Execute_Sequence.isEmpty();
			case ArduinoTracePackage.SPECIFIC_TRACE__ARDUINO_PROJECT_SETUP_SEQUENCE:
				return arduino_Project_Setup_Sequence != null && !arduino_Project_Setup_Sequence.isEmpty();
			case ArduinoTracePackage.SPECIFIC_TRACE__ARDUINO_REPEAT_EXECUTE_SEQUENCE:
				return arduino_Repeat_Execute_Sequence != null && !arduino_Repeat_Execute_Sequence.isEmpty();
			case ArduinoTracePackage.SPECIFIC_TRACE__ARDUINO_VARIABLE_ASSIGNMENT_EXECUTE_SEQUENCE:
				return arduino_VariableAssignment_Execute_Sequence != null && !arduino_VariableAssignment_Execute_Sequence.isEmpty();
			case ArduinoTracePackage.SPECIFIC_TRACE__ARDUINO_VARIABLE_DECLARATION_EXECUTE_SEQUENCE:
				return arduino_VariableDeclaration_Execute_Sequence != null && !arduino_VariableDeclaration_Execute_Sequence.isEmpty();
			case ArduinoTracePackage.SPECIFIC_TRACE__ARDUINO_TRACED_AMBIENT_LIGHT_SENSORS:
				return arduino_tracedAmbientLightSensors != null && !arduino_tracedAmbientLightSensors.isEmpty();
			case ArduinoTracePackage.SPECIFIC_TRACE__ARDUINO_TRACED_ANALOG_PINS:
				return arduino_tracedAnalogPins != null && !arduino_tracedAnalogPins.isEmpty();
			case ArduinoTracePackage.SPECIFIC_TRACE__ARDUINO_TRACED_ARDUINO_BOARDS:
				return arduino_tracedArduinoBoards != null && !arduino_tracedArduinoBoards.isEmpty();
			case ArduinoTracePackage.SPECIFIC_TRACE__ARDUINO_TRACED_BLUETOOTH_TRANSCEIVERS:
				return arduino_tracedBluetoothTransceivers != null && !arduino_tracedBluetoothTransceivers.isEmpty();
			case ArduinoTracePackage.SPECIFIC_TRACE__ARDUINO_TRACED_BOOLEAN_VARIABLES:
				return arduino_tracedBooleanVariables != null && !arduino_tracedBooleanVariables.isEmpty();
			case ArduinoTracePackage.SPECIFIC_TRACE__ARDUINO_TRACED_BUZZERS:
				return arduino_tracedBuzzers != null && !arduino_tracedBuzzers.isEmpty();
			case ArduinoTracePackage.SPECIFIC_TRACE__ARDUINO_TRACED_DIGITAL_PINS:
				return arduino_tracedDigitalPins != null && !arduino_tracedDigitalPins.isEmpty();
			case ArduinoTracePackage.SPECIFIC_TRACE__ARDUINO_TRACED_FANS:
				return arduino_tracedFans != null && !arduino_tracedFans.isEmpty();
			case ArduinoTracePackage.SPECIFIC_TRACE__ARDUINO_TRACED_INFRA_RED_SENSORS:
				return arduino_tracedInfraRedSensors != null && !arduino_tracedInfraRedSensors.isEmpty();
			case ArduinoTracePackage.SPECIFIC_TRACE__ARDUINO_TRACED_INTEGER_VARIABLES:
				return arduino_tracedIntegerVariables != null && !arduino_tracedIntegerVariables.isEmpty();
			case ArduinoTracePackage.SPECIFIC_TRACE__ARDUINO_TRACED_LE_DS:
				return arduino_tracedLEDs != null && !arduino_tracedLEDs.isEmpty();
			case ArduinoTracePackage.SPECIFIC_TRACE__ARDUINO_TRACED_MICRO_SERVOS:
				return arduino_tracedMicroServos != null && !arduino_tracedMicroServos.isEmpty();
			case ArduinoTracePackage.SPECIFIC_TRACE__ARDUINO_TRACED_MUSIC_PLAYERS:
				return arduino_tracedMusicPlayers != null && !arduino_tracedMusicPlayers.isEmpty();
			case ArduinoTracePackage.SPECIFIC_TRACE__ARDUINO_TRACED_PUSH_BUTTONS:
				return arduino_tracedPushButtons != null && !arduino_tracedPushButtons.isEmpty();
			case ArduinoTracePackage.SPECIFIC_TRACE__ARDUINO_TRACED_ROTATION_SENSORS:
				return arduino_tracedRotationSensors != null && !arduino_tracedRotationSensors.isEmpty();
			case ArduinoTracePackage.SPECIFIC_TRACE__ARDUINO_TRACED_SKETCHS:
				return arduino_tracedSketchs != null && !arduino_tracedSketchs.isEmpty();
			case ArduinoTracePackage.SPECIFIC_TRACE__ARDUINO_TRACED_SOUND_SENSORS:
				return arduino_tracedSoundSensors != null && !arduino_tracedSoundSensors.isEmpty();
			case ArduinoTracePackage.SPECIFIC_TRACE__STATES_TRACE:
				return statesTrace != null && !statesTrace.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SpecificTraceImpl
