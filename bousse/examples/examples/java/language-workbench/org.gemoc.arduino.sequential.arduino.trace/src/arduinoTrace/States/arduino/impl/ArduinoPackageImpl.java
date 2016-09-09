/**
 */
package arduinoTrace.States.arduino.impl;

import arduinoTrace.ArduinoTracePackage;

import arduinoTrace.States.StatesPackage;

import arduinoTrace.States.arduino.ArduinoFactory;
import arduinoTrace.States.arduino.ArduinoPackage;
import arduinoTrace.States.arduino.TracedAmbientLightSensor;
import arduinoTrace.States.arduino.TracedAnalogPin;
import arduinoTrace.States.arduino.TracedArduinoAnalogModule;
import arduinoTrace.States.arduino.TracedArduinoBoard;
import arduinoTrace.States.arduino.TracedArduinoCommunicationModule;
import arduinoTrace.States.arduino.TracedArduinoDigitalModule;
import arduinoTrace.States.arduino.TracedArduinoModule;
import arduinoTrace.States.arduino.TracedBluetoothTransceiver;
import arduinoTrace.States.arduino.TracedBoard;
import arduinoTrace.States.arduino.TracedBooleanVariable;
import arduinoTrace.States.arduino.TracedBuzzer;
import arduinoTrace.States.arduino.TracedDigitalPin;
import arduinoTrace.States.arduino.TracedFan;
import arduinoTrace.States.arduino.TracedInfraRedSensor;
import arduinoTrace.States.arduino.TracedIntegerVariable;
import arduinoTrace.States.arduino.TracedLED;
import arduinoTrace.States.arduino.TracedMicroServo;
import arduinoTrace.States.arduino.TracedModule;
import arduinoTrace.States.arduino.TracedMusicPlayer;
import arduinoTrace.States.arduino.TracedNamedElement;
import arduinoTrace.States.arduino.TracedPin;
import arduinoTrace.States.arduino.TracedPushButton;
import arduinoTrace.States.arduino.TracedRotationSensor;
import arduinoTrace.States.arduino.TracedSketch;
import arduinoTrace.States.arduino.TracedSoundSensor;
import arduinoTrace.States.arduino.TracedVariable;

import arduinoTrace.States.impl.StatesPackageImpl;

import arduinoTrace.Steps.StepsPackage;

import arduinoTrace.Steps.impl.StepsPackageImpl;

import arduinoTrace.impl.ArduinoTracePackageImpl;

import fr.inria.diverse.trace.commons.model.trace.TracePackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ArduinoPackageImpl extends EPackageImpl implements ArduinoPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedAmbientLightSensorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedAnalogPinEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedArduinoAnalogModuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedArduinoBoardEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedArduinoCommunicationModuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedArduinoDigitalModuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedArduinoModuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedBluetoothTransceiverEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedBoardEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedBooleanVariableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedBuzzerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedDigitalPinEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedFanEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedInfraRedSensorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedIntegerVariableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedLEDEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedMicroServoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedModuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedMusicPlayerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedNamedElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedPinEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedPushButtonEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedRotationSensorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedSketchEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedSoundSensorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedVariableEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see arduinoTrace.States.arduino.ArduinoPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ArduinoPackageImpl() {
		super(eNS_URI, ArduinoFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link ArduinoPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ArduinoPackage init() {
		if (isInited) return (ArduinoPackage)EPackage.Registry.INSTANCE.getEPackage(ArduinoPackage.eNS_URI);

		// Obtain or create and register package
		ArduinoPackageImpl theArduinoPackage = (ArduinoPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ArduinoPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ArduinoPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		org.gemoc.arduino.sequential.arduino.arduino.ArduinoPackage.eINSTANCE.eClass();
		TracePackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		ArduinoTracePackageImpl theArduinoTracePackage = (ArduinoTracePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ArduinoTracePackage.eNS_URI) instanceof ArduinoTracePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ArduinoTracePackage.eNS_URI) : ArduinoTracePackage.eINSTANCE);
		StepsPackageImpl theStepsPackage = (StepsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI) instanceof StepsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI) : StepsPackage.eINSTANCE);
		StatesPackageImpl theStatesPackage = (StatesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(StatesPackage.eNS_URI) instanceof StatesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(StatesPackage.eNS_URI) : StatesPackage.eINSTANCE);

		// Create package meta-data objects
		theArduinoPackage.createPackageContents();
		theArduinoTracePackage.createPackageContents();
		theStepsPackage.createPackageContents();
		theStatesPackage.createPackageContents();

		// Initialize created meta-data
		theArduinoPackage.initializePackageContents();
		theArduinoTracePackage.initializePackageContents();
		theStepsPackage.initializePackageContents();
		theStatesPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theArduinoPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ArduinoPackage.eNS_URI, theArduinoPackage);
		return theArduinoPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedAmbientLightSensor() {
		return tracedAmbientLightSensorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTracedAmbientLightSensor_OriginalObject() {
		return (EReference)tracedAmbientLightSensorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedAnalogPin() {
		return tracedAnalogPinEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTracedAnalogPin_OriginalObject() {
		return (EReference)tracedAnalogPinEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedArduinoAnalogModule() {
		return tracedArduinoAnalogModuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedArduinoBoard() {
		return tracedArduinoBoardEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTracedArduinoBoard_OriginalObject() {
		return (EReference)tracedArduinoBoardEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedArduinoCommunicationModule() {
		return tracedArduinoCommunicationModuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedArduinoDigitalModule() {
		return tracedArduinoDigitalModuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedArduinoModule() {
		return tracedArduinoModuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedBluetoothTransceiver() {
		return tracedBluetoothTransceiverEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTracedBluetoothTransceiver_DataReceivedSequence() {
		return (EReference)tracedBluetoothTransceiverEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTracedBluetoothTransceiver_DataToSendSequence() {
		return (EReference)tracedBluetoothTransceiverEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTracedBluetoothTransceiver_OriginalObject() {
		return (EReference)tracedBluetoothTransceiverEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedBoard() {
		return tracedBoardEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedBooleanVariable() {
		return tracedBooleanVariableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTracedBooleanVariable_OriginalObject() {
		return (EReference)tracedBooleanVariableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTracedBooleanVariable_ValueSequence() {
		return (EReference)tracedBooleanVariableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedBuzzer() {
		return tracedBuzzerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTracedBuzzer_OriginalObject() {
		return (EReference)tracedBuzzerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedDigitalPin() {
		return tracedDigitalPinEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTracedDigitalPin_OriginalObject() {
		return (EReference)tracedDigitalPinEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedFan() {
		return tracedFanEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTracedFan_OriginalObject() {
		return (EReference)tracedFanEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedInfraRedSensor() {
		return tracedInfraRedSensorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTracedInfraRedSensor_OriginalObject() {
		return (EReference)tracedInfraRedSensorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedIntegerVariable() {
		return tracedIntegerVariableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTracedIntegerVariable_OriginalObject() {
		return (EReference)tracedIntegerVariableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTracedIntegerVariable_ValueSequence() {
		return (EReference)tracedIntegerVariableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedLED() {
		return tracedLEDEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTracedLED_OriginalObject() {
		return (EReference)tracedLEDEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedMicroServo() {
		return tracedMicroServoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTracedMicroServo_OriginalObject() {
		return (EReference)tracedMicroServoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedModule() {
		return tracedModuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedMusicPlayer() {
		return tracedMusicPlayerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTracedMusicPlayer_OriginalObject() {
		return (EReference)tracedMusicPlayerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedNamedElement() {
		return tracedNamedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedPin() {
		return tracedPinEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTracedPin_LevelSequence() {
		return (EReference)tracedPinEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedPushButton() {
		return tracedPushButtonEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTracedPushButton_OriginalObject() {
		return (EReference)tracedPushButtonEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedRotationSensor() {
		return tracedRotationSensorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTracedRotationSensor_OriginalObject() {
		return (EReference)tracedRotationSensorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedSketch() {
		return tracedSketchEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTracedSketch_OriginalObject() {
		return (EReference)tracedSketchEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedSoundSensor() {
		return tracedSoundSensorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTracedSoundSensor_OriginalObject() {
		return (EReference)tracedSoundSensorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedVariable() {
		return tracedVariableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArduinoFactory getArduinoFactory() {
		return (ArduinoFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		tracedAmbientLightSensorEClass = createEClass(TRACED_AMBIENT_LIGHT_SENSOR);
		createEReference(tracedAmbientLightSensorEClass, TRACED_AMBIENT_LIGHT_SENSOR__ORIGINAL_OBJECT);

		tracedAnalogPinEClass = createEClass(TRACED_ANALOG_PIN);
		createEReference(tracedAnalogPinEClass, TRACED_ANALOG_PIN__ORIGINAL_OBJECT);

		tracedArduinoAnalogModuleEClass = createEClass(TRACED_ARDUINO_ANALOG_MODULE);

		tracedArduinoBoardEClass = createEClass(TRACED_ARDUINO_BOARD);
		createEReference(tracedArduinoBoardEClass, TRACED_ARDUINO_BOARD__ORIGINAL_OBJECT);

		tracedArduinoCommunicationModuleEClass = createEClass(TRACED_ARDUINO_COMMUNICATION_MODULE);

		tracedArduinoDigitalModuleEClass = createEClass(TRACED_ARDUINO_DIGITAL_MODULE);

		tracedArduinoModuleEClass = createEClass(TRACED_ARDUINO_MODULE);

		tracedBluetoothTransceiverEClass = createEClass(TRACED_BLUETOOTH_TRANSCEIVER);
		createEReference(tracedBluetoothTransceiverEClass, TRACED_BLUETOOTH_TRANSCEIVER__DATA_RECEIVED_SEQUENCE);
		createEReference(tracedBluetoothTransceiverEClass, TRACED_BLUETOOTH_TRANSCEIVER__DATA_TO_SEND_SEQUENCE);
		createEReference(tracedBluetoothTransceiverEClass, TRACED_BLUETOOTH_TRANSCEIVER__ORIGINAL_OBJECT);

		tracedBoardEClass = createEClass(TRACED_BOARD);

		tracedBooleanVariableEClass = createEClass(TRACED_BOOLEAN_VARIABLE);
		createEReference(tracedBooleanVariableEClass, TRACED_BOOLEAN_VARIABLE__ORIGINAL_OBJECT);
		createEReference(tracedBooleanVariableEClass, TRACED_BOOLEAN_VARIABLE__VALUE_SEQUENCE);

		tracedBuzzerEClass = createEClass(TRACED_BUZZER);
		createEReference(tracedBuzzerEClass, TRACED_BUZZER__ORIGINAL_OBJECT);

		tracedDigitalPinEClass = createEClass(TRACED_DIGITAL_PIN);
		createEReference(tracedDigitalPinEClass, TRACED_DIGITAL_PIN__ORIGINAL_OBJECT);

		tracedFanEClass = createEClass(TRACED_FAN);
		createEReference(tracedFanEClass, TRACED_FAN__ORIGINAL_OBJECT);

		tracedInfraRedSensorEClass = createEClass(TRACED_INFRA_RED_SENSOR);
		createEReference(tracedInfraRedSensorEClass, TRACED_INFRA_RED_SENSOR__ORIGINAL_OBJECT);

		tracedIntegerVariableEClass = createEClass(TRACED_INTEGER_VARIABLE);
		createEReference(tracedIntegerVariableEClass, TRACED_INTEGER_VARIABLE__ORIGINAL_OBJECT);
		createEReference(tracedIntegerVariableEClass, TRACED_INTEGER_VARIABLE__VALUE_SEQUENCE);

		tracedLEDEClass = createEClass(TRACED_LED);
		createEReference(tracedLEDEClass, TRACED_LED__ORIGINAL_OBJECT);

		tracedMicroServoEClass = createEClass(TRACED_MICRO_SERVO);
		createEReference(tracedMicroServoEClass, TRACED_MICRO_SERVO__ORIGINAL_OBJECT);

		tracedModuleEClass = createEClass(TRACED_MODULE);

		tracedMusicPlayerEClass = createEClass(TRACED_MUSIC_PLAYER);
		createEReference(tracedMusicPlayerEClass, TRACED_MUSIC_PLAYER__ORIGINAL_OBJECT);

		tracedNamedElementEClass = createEClass(TRACED_NAMED_ELEMENT);

		tracedPinEClass = createEClass(TRACED_PIN);
		createEReference(tracedPinEClass, TRACED_PIN__LEVEL_SEQUENCE);

		tracedPushButtonEClass = createEClass(TRACED_PUSH_BUTTON);
		createEReference(tracedPushButtonEClass, TRACED_PUSH_BUTTON__ORIGINAL_OBJECT);

		tracedRotationSensorEClass = createEClass(TRACED_ROTATION_SENSOR);
		createEReference(tracedRotationSensorEClass, TRACED_ROTATION_SENSOR__ORIGINAL_OBJECT);

		tracedSketchEClass = createEClass(TRACED_SKETCH);
		createEReference(tracedSketchEClass, TRACED_SKETCH__ORIGINAL_OBJECT);

		tracedSoundSensorEClass = createEClass(TRACED_SOUND_SENSOR);
		createEReference(tracedSoundSensorEClass, TRACED_SOUND_SENSOR__ORIGINAL_OBJECT);

		tracedVariableEClass = createEClass(TRACED_VARIABLE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		org.gemoc.arduino.sequential.arduino.arduino.ArduinoPackage theArduinoPackage_1 = (org.gemoc.arduino.sequential.arduino.arduino.ArduinoPackage)EPackage.Registry.INSTANCE.getEPackage(org.gemoc.arduino.sequential.arduino.arduino.ArduinoPackage.eNS_URI);
		StatesPackage theStatesPackage = (StatesPackage)EPackage.Registry.INSTANCE.getEPackage(StatesPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		tracedAmbientLightSensorEClass.getESuperTypes().add(this.getTracedArduinoAnalogModule());
		tracedAnalogPinEClass.getESuperTypes().add(this.getTracedPin());
		tracedArduinoAnalogModuleEClass.getESuperTypes().add(this.getTracedArduinoModule());
		tracedArduinoBoardEClass.getESuperTypes().add(this.getTracedBoard());
		tracedArduinoCommunicationModuleEClass.getESuperTypes().add(this.getTracedArduinoDigitalModule());
		tracedArduinoDigitalModuleEClass.getESuperTypes().add(this.getTracedArduinoModule());
		tracedArduinoModuleEClass.getESuperTypes().add(this.getTracedModule());
		tracedBluetoothTransceiverEClass.getESuperTypes().add(this.getTracedArduinoAnalogModule());
		tracedBoardEClass.getESuperTypes().add(this.getTracedNamedElement());
		tracedBooleanVariableEClass.getESuperTypes().add(this.getTracedVariable());
		tracedBuzzerEClass.getESuperTypes().add(this.getTracedArduinoDigitalModule());
		tracedDigitalPinEClass.getESuperTypes().add(this.getTracedPin());
		tracedFanEClass.getESuperTypes().add(this.getTracedArduinoDigitalModule());
		tracedInfraRedSensorEClass.getESuperTypes().add(this.getTracedArduinoDigitalModule());
		tracedIntegerVariableEClass.getESuperTypes().add(this.getTracedVariable());
		tracedLEDEClass.getESuperTypes().add(this.getTracedArduinoDigitalModule());
		tracedMicroServoEClass.getESuperTypes().add(this.getTracedArduinoDigitalModule());
		tracedModuleEClass.getESuperTypes().add(this.getTracedNamedElement());
		tracedMusicPlayerEClass.getESuperTypes().add(this.getTracedArduinoAnalogModule());
		tracedPinEClass.getESuperTypes().add(this.getTracedNamedElement());
		tracedPushButtonEClass.getESuperTypes().add(this.getTracedArduinoDigitalModule());
		tracedRotationSensorEClass.getESuperTypes().add(this.getTracedArduinoAnalogModule());
		tracedSketchEClass.getESuperTypes().add(this.getTracedNamedElement());
		tracedSoundSensorEClass.getESuperTypes().add(this.getTracedArduinoAnalogModule());
		tracedVariableEClass.getESuperTypes().add(this.getTracedNamedElement());

		// Initialize classes, features, and operations; add parameters
		initEClass(tracedAmbientLightSensorEClass, TracedAmbientLightSensor.class, "TracedAmbientLightSensor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTracedAmbientLightSensor_OriginalObject(), theArduinoPackage_1.getAmbientLightSensor(), null, "originalObject", null, 0, 1, TracedAmbientLightSensor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tracedAnalogPinEClass, TracedAnalogPin.class, "TracedAnalogPin", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTracedAnalogPin_OriginalObject(), theArduinoPackage_1.getAnalogPin(), null, "originalObject", null, 0, 1, TracedAnalogPin.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tracedArduinoAnalogModuleEClass, TracedArduinoAnalogModule.class, "TracedArduinoAnalogModule", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(tracedArduinoBoardEClass, TracedArduinoBoard.class, "TracedArduinoBoard", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTracedArduinoBoard_OriginalObject(), theArduinoPackage_1.getArduinoBoard(), null, "originalObject", null, 0, 1, TracedArduinoBoard.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tracedArduinoCommunicationModuleEClass, TracedArduinoCommunicationModule.class, "TracedArduinoCommunicationModule", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(tracedArduinoDigitalModuleEClass, TracedArduinoDigitalModule.class, "TracedArduinoDigitalModule", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(tracedArduinoModuleEClass, TracedArduinoModule.class, "TracedArduinoModule", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(tracedBluetoothTransceiverEClass, TracedBluetoothTransceiver.class, "TracedBluetoothTransceiver", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTracedBluetoothTransceiver_DataReceivedSequence(), theStatesPackage.getBluetoothTransceiver_dataReceived_Value(), theStatesPackage.getBluetoothTransceiver_dataReceived_Value_Parent(), "dataReceivedSequence", null, 0, -1, TracedBluetoothTransceiver.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTracedBluetoothTransceiver_DataToSendSequence(), theStatesPackage.getBluetoothTransceiver_dataToSend_Value(), theStatesPackage.getBluetoothTransceiver_dataToSend_Value_Parent(), "dataToSendSequence", null, 0, -1, TracedBluetoothTransceiver.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTracedBluetoothTransceiver_OriginalObject(), theArduinoPackage_1.getBluetoothTransceiver(), null, "originalObject", null, 0, 1, TracedBluetoothTransceiver.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tracedBoardEClass, TracedBoard.class, "TracedBoard", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(tracedBooleanVariableEClass, TracedBooleanVariable.class, "TracedBooleanVariable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTracedBooleanVariable_OriginalObject(), theArduinoPackage_1.getBooleanVariable(), null, "originalObject", null, 0, 1, TracedBooleanVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTracedBooleanVariable_ValueSequence(), theStatesPackage.getBooleanVariable_value_Value(), theStatesPackage.getBooleanVariable_value_Value_Parent(), "valueSequence", null, 0, -1, TracedBooleanVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tracedBuzzerEClass, TracedBuzzer.class, "TracedBuzzer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTracedBuzzer_OriginalObject(), theArduinoPackage_1.getBuzzer(), null, "originalObject", null, 0, 1, TracedBuzzer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tracedDigitalPinEClass, TracedDigitalPin.class, "TracedDigitalPin", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTracedDigitalPin_OriginalObject(), theArduinoPackage_1.getDigitalPin(), null, "originalObject", null, 0, 1, TracedDigitalPin.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tracedFanEClass, TracedFan.class, "TracedFan", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTracedFan_OriginalObject(), theArduinoPackage_1.getFan(), null, "originalObject", null, 0, 1, TracedFan.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tracedInfraRedSensorEClass, TracedInfraRedSensor.class, "TracedInfraRedSensor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTracedInfraRedSensor_OriginalObject(), theArduinoPackage_1.getInfraRedSensor(), null, "originalObject", null, 0, 1, TracedInfraRedSensor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tracedIntegerVariableEClass, TracedIntegerVariable.class, "TracedIntegerVariable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTracedIntegerVariable_OriginalObject(), theArduinoPackage_1.getIntegerVariable(), null, "originalObject", null, 0, 1, TracedIntegerVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTracedIntegerVariable_ValueSequence(), theStatesPackage.getIntegerVariable_value_Value(), theStatesPackage.getIntegerVariable_value_Value_Parent(), "valueSequence", null, 0, -1, TracedIntegerVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tracedLEDEClass, TracedLED.class, "TracedLED", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTracedLED_OriginalObject(), theArduinoPackage_1.getLED(), null, "originalObject", null, 0, 1, TracedLED.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tracedMicroServoEClass, TracedMicroServo.class, "TracedMicroServo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTracedMicroServo_OriginalObject(), theArduinoPackage_1.getMicroServo(), null, "originalObject", null, 0, 1, TracedMicroServo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tracedModuleEClass, TracedModule.class, "TracedModule", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(tracedMusicPlayerEClass, TracedMusicPlayer.class, "TracedMusicPlayer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTracedMusicPlayer_OriginalObject(), theArduinoPackage_1.getMusicPlayer(), null, "originalObject", null, 0, 1, TracedMusicPlayer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tracedNamedElementEClass, TracedNamedElement.class, "TracedNamedElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(tracedPinEClass, TracedPin.class, "TracedPin", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTracedPin_LevelSequence(), theStatesPackage.getPin_level_Value(), theStatesPackage.getPin_level_Value_Parent(), "levelSequence", null, 0, -1, TracedPin.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tracedPushButtonEClass, TracedPushButton.class, "TracedPushButton", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTracedPushButton_OriginalObject(), theArduinoPackage_1.getPushButton(), null, "originalObject", null, 0, 1, TracedPushButton.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tracedRotationSensorEClass, TracedRotationSensor.class, "TracedRotationSensor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTracedRotationSensor_OriginalObject(), theArduinoPackage_1.getRotationSensor(), null, "originalObject", null, 0, 1, TracedRotationSensor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tracedSketchEClass, TracedSketch.class, "TracedSketch", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTracedSketch_OriginalObject(), theArduinoPackage_1.getSketch(), null, "originalObject", null, 0, 1, TracedSketch.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tracedSoundSensorEClass, TracedSoundSensor.class, "TracedSoundSensor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTracedSoundSensor_OriginalObject(), theArduinoPackage_1.getSoundSensor(), null, "originalObject", null, 0, 1, TracedSoundSensor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tracedVariableEClass, TracedVariable.class, "TracedVariable", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
	}

} //ArduinoPackageImpl
