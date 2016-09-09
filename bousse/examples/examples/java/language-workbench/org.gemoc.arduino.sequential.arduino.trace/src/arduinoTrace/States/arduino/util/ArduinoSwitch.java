/**
 */
package arduinoTrace.States.arduino.util;

import arduinoTrace.States.arduino.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see arduinoTrace.States.arduino.ArduinoPackage
 * @generated
 */
public class ArduinoSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ArduinoPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArduinoSwitch() {
		if (modelPackage == null) {
			modelPackage = ArduinoPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case ArduinoPackage.TRACED_AMBIENT_LIGHT_SENSOR: {
				TracedAmbientLightSensor tracedAmbientLightSensor = (TracedAmbientLightSensor)theEObject;
				T result = caseTracedAmbientLightSensor(tracedAmbientLightSensor);
				if (result == null) result = caseTracedArduinoAnalogModule(tracedAmbientLightSensor);
				if (result == null) result = caseTracedArduinoModule(tracedAmbientLightSensor);
				if (result == null) result = caseTracedModule(tracedAmbientLightSensor);
				if (result == null) result = caseTracedNamedElement(tracedAmbientLightSensor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArduinoPackage.TRACED_ANALOG_PIN: {
				TracedAnalogPin tracedAnalogPin = (TracedAnalogPin)theEObject;
				T result = caseTracedAnalogPin(tracedAnalogPin);
				if (result == null) result = caseTracedPin(tracedAnalogPin);
				if (result == null) result = caseTracedNamedElement(tracedAnalogPin);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArduinoPackage.TRACED_ARDUINO_ANALOG_MODULE: {
				TracedArduinoAnalogModule tracedArduinoAnalogModule = (TracedArduinoAnalogModule)theEObject;
				T result = caseTracedArduinoAnalogModule(tracedArduinoAnalogModule);
				if (result == null) result = caseTracedArduinoModule(tracedArduinoAnalogModule);
				if (result == null) result = caseTracedModule(tracedArduinoAnalogModule);
				if (result == null) result = caseTracedNamedElement(tracedArduinoAnalogModule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArduinoPackage.TRACED_ARDUINO_BOARD: {
				TracedArduinoBoard tracedArduinoBoard = (TracedArduinoBoard)theEObject;
				T result = caseTracedArduinoBoard(tracedArduinoBoard);
				if (result == null) result = caseTracedBoard(tracedArduinoBoard);
				if (result == null) result = caseTracedNamedElement(tracedArduinoBoard);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArduinoPackage.TRACED_ARDUINO_COMMUNICATION_MODULE: {
				TracedArduinoCommunicationModule tracedArduinoCommunicationModule = (TracedArduinoCommunicationModule)theEObject;
				T result = caseTracedArduinoCommunicationModule(tracedArduinoCommunicationModule);
				if (result == null) result = caseTracedArduinoDigitalModule(tracedArduinoCommunicationModule);
				if (result == null) result = caseTracedArduinoModule(tracedArduinoCommunicationModule);
				if (result == null) result = caseTracedModule(tracedArduinoCommunicationModule);
				if (result == null) result = caseTracedNamedElement(tracedArduinoCommunicationModule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArduinoPackage.TRACED_ARDUINO_DIGITAL_MODULE: {
				TracedArduinoDigitalModule tracedArduinoDigitalModule = (TracedArduinoDigitalModule)theEObject;
				T result = caseTracedArduinoDigitalModule(tracedArduinoDigitalModule);
				if (result == null) result = caseTracedArduinoModule(tracedArduinoDigitalModule);
				if (result == null) result = caseTracedModule(tracedArduinoDigitalModule);
				if (result == null) result = caseTracedNamedElement(tracedArduinoDigitalModule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArduinoPackage.TRACED_ARDUINO_MODULE: {
				TracedArduinoModule tracedArduinoModule = (TracedArduinoModule)theEObject;
				T result = caseTracedArduinoModule(tracedArduinoModule);
				if (result == null) result = caseTracedModule(tracedArduinoModule);
				if (result == null) result = caseTracedNamedElement(tracedArduinoModule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArduinoPackage.TRACED_BLUETOOTH_TRANSCEIVER: {
				TracedBluetoothTransceiver tracedBluetoothTransceiver = (TracedBluetoothTransceiver)theEObject;
				T result = caseTracedBluetoothTransceiver(tracedBluetoothTransceiver);
				if (result == null) result = caseTracedArduinoAnalogModule(tracedBluetoothTransceiver);
				if (result == null) result = caseTracedArduinoModule(tracedBluetoothTransceiver);
				if (result == null) result = caseTracedModule(tracedBluetoothTransceiver);
				if (result == null) result = caseTracedNamedElement(tracedBluetoothTransceiver);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArduinoPackage.TRACED_BOARD: {
				TracedBoard tracedBoard = (TracedBoard)theEObject;
				T result = caseTracedBoard(tracedBoard);
				if (result == null) result = caseTracedNamedElement(tracedBoard);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArduinoPackage.TRACED_BOOLEAN_VARIABLE: {
				TracedBooleanVariable tracedBooleanVariable = (TracedBooleanVariable)theEObject;
				T result = caseTracedBooleanVariable(tracedBooleanVariable);
				if (result == null) result = caseTracedVariable(tracedBooleanVariable);
				if (result == null) result = caseTracedNamedElement(tracedBooleanVariable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArduinoPackage.TRACED_BUZZER: {
				TracedBuzzer tracedBuzzer = (TracedBuzzer)theEObject;
				T result = caseTracedBuzzer(tracedBuzzer);
				if (result == null) result = caseTracedArduinoDigitalModule(tracedBuzzer);
				if (result == null) result = caseTracedArduinoModule(tracedBuzzer);
				if (result == null) result = caseTracedModule(tracedBuzzer);
				if (result == null) result = caseTracedNamedElement(tracedBuzzer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArduinoPackage.TRACED_DIGITAL_PIN: {
				TracedDigitalPin tracedDigitalPin = (TracedDigitalPin)theEObject;
				T result = caseTracedDigitalPin(tracedDigitalPin);
				if (result == null) result = caseTracedPin(tracedDigitalPin);
				if (result == null) result = caseTracedNamedElement(tracedDigitalPin);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArduinoPackage.TRACED_FAN: {
				TracedFan tracedFan = (TracedFan)theEObject;
				T result = caseTracedFan(tracedFan);
				if (result == null) result = caseTracedArduinoDigitalModule(tracedFan);
				if (result == null) result = caseTracedArduinoModule(tracedFan);
				if (result == null) result = caseTracedModule(tracedFan);
				if (result == null) result = caseTracedNamedElement(tracedFan);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArduinoPackage.TRACED_INFRA_RED_SENSOR: {
				TracedInfraRedSensor tracedInfraRedSensor = (TracedInfraRedSensor)theEObject;
				T result = caseTracedInfraRedSensor(tracedInfraRedSensor);
				if (result == null) result = caseTracedArduinoDigitalModule(tracedInfraRedSensor);
				if (result == null) result = caseTracedArduinoModule(tracedInfraRedSensor);
				if (result == null) result = caseTracedModule(tracedInfraRedSensor);
				if (result == null) result = caseTracedNamedElement(tracedInfraRedSensor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArduinoPackage.TRACED_INTEGER_VARIABLE: {
				TracedIntegerVariable tracedIntegerVariable = (TracedIntegerVariable)theEObject;
				T result = caseTracedIntegerVariable(tracedIntegerVariable);
				if (result == null) result = caseTracedVariable(tracedIntegerVariable);
				if (result == null) result = caseTracedNamedElement(tracedIntegerVariable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArduinoPackage.TRACED_LED: {
				TracedLED tracedLED = (TracedLED)theEObject;
				T result = caseTracedLED(tracedLED);
				if (result == null) result = caseTracedArduinoDigitalModule(tracedLED);
				if (result == null) result = caseTracedArduinoModule(tracedLED);
				if (result == null) result = caseTracedModule(tracedLED);
				if (result == null) result = caseTracedNamedElement(tracedLED);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArduinoPackage.TRACED_MICRO_SERVO: {
				TracedMicroServo tracedMicroServo = (TracedMicroServo)theEObject;
				T result = caseTracedMicroServo(tracedMicroServo);
				if (result == null) result = caseTracedArduinoDigitalModule(tracedMicroServo);
				if (result == null) result = caseTracedArduinoModule(tracedMicroServo);
				if (result == null) result = caseTracedModule(tracedMicroServo);
				if (result == null) result = caseTracedNamedElement(tracedMicroServo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArduinoPackage.TRACED_MODULE: {
				TracedModule tracedModule = (TracedModule)theEObject;
				T result = caseTracedModule(tracedModule);
				if (result == null) result = caseTracedNamedElement(tracedModule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArduinoPackage.TRACED_MUSIC_PLAYER: {
				TracedMusicPlayer tracedMusicPlayer = (TracedMusicPlayer)theEObject;
				T result = caseTracedMusicPlayer(tracedMusicPlayer);
				if (result == null) result = caseTracedArduinoAnalogModule(tracedMusicPlayer);
				if (result == null) result = caseTracedArduinoModule(tracedMusicPlayer);
				if (result == null) result = caseTracedModule(tracedMusicPlayer);
				if (result == null) result = caseTracedNamedElement(tracedMusicPlayer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArduinoPackage.TRACED_NAMED_ELEMENT: {
				TracedNamedElement tracedNamedElement = (TracedNamedElement)theEObject;
				T result = caseTracedNamedElement(tracedNamedElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArduinoPackage.TRACED_PIN: {
				TracedPin tracedPin = (TracedPin)theEObject;
				T result = caseTracedPin(tracedPin);
				if (result == null) result = caseTracedNamedElement(tracedPin);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArduinoPackage.TRACED_PUSH_BUTTON: {
				TracedPushButton tracedPushButton = (TracedPushButton)theEObject;
				T result = caseTracedPushButton(tracedPushButton);
				if (result == null) result = caseTracedArduinoDigitalModule(tracedPushButton);
				if (result == null) result = caseTracedArduinoModule(tracedPushButton);
				if (result == null) result = caseTracedModule(tracedPushButton);
				if (result == null) result = caseTracedNamedElement(tracedPushButton);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArduinoPackage.TRACED_ROTATION_SENSOR: {
				TracedRotationSensor tracedRotationSensor = (TracedRotationSensor)theEObject;
				T result = caseTracedRotationSensor(tracedRotationSensor);
				if (result == null) result = caseTracedArduinoAnalogModule(tracedRotationSensor);
				if (result == null) result = caseTracedArduinoModule(tracedRotationSensor);
				if (result == null) result = caseTracedModule(tracedRotationSensor);
				if (result == null) result = caseTracedNamedElement(tracedRotationSensor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArduinoPackage.TRACED_SKETCH: {
				TracedSketch tracedSketch = (TracedSketch)theEObject;
				T result = caseTracedSketch(tracedSketch);
				if (result == null) result = caseTracedNamedElement(tracedSketch);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArduinoPackage.TRACED_SOUND_SENSOR: {
				TracedSoundSensor tracedSoundSensor = (TracedSoundSensor)theEObject;
				T result = caseTracedSoundSensor(tracedSoundSensor);
				if (result == null) result = caseTracedArduinoAnalogModule(tracedSoundSensor);
				if (result == null) result = caseTracedArduinoModule(tracedSoundSensor);
				if (result == null) result = caseTracedModule(tracedSoundSensor);
				if (result == null) result = caseTracedNamedElement(tracedSoundSensor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArduinoPackage.TRACED_VARIABLE: {
				TracedVariable tracedVariable = (TracedVariable)theEObject;
				T result = caseTracedVariable(tracedVariable);
				if (result == null) result = caseTracedNamedElement(tracedVariable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traced Ambient Light Sensor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traced Ambient Light Sensor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracedAmbientLightSensor(TracedAmbientLightSensor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traced Analog Pin</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traced Analog Pin</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracedAnalogPin(TracedAnalogPin object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traced Arduino Analog Module</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traced Arduino Analog Module</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracedArduinoAnalogModule(TracedArduinoAnalogModule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traced Arduino Board</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traced Arduino Board</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracedArduinoBoard(TracedArduinoBoard object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traced Arduino Communication Module</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traced Arduino Communication Module</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracedArduinoCommunicationModule(TracedArduinoCommunicationModule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traced Arduino Digital Module</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traced Arduino Digital Module</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracedArduinoDigitalModule(TracedArduinoDigitalModule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traced Arduino Module</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traced Arduino Module</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracedArduinoModule(TracedArduinoModule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traced Bluetooth Transceiver</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traced Bluetooth Transceiver</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracedBluetoothTransceiver(TracedBluetoothTransceiver object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traced Board</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traced Board</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracedBoard(TracedBoard object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traced Boolean Variable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traced Boolean Variable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracedBooleanVariable(TracedBooleanVariable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traced Buzzer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traced Buzzer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracedBuzzer(TracedBuzzer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traced Digital Pin</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traced Digital Pin</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracedDigitalPin(TracedDigitalPin object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traced Fan</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traced Fan</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracedFan(TracedFan object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traced Infra Red Sensor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traced Infra Red Sensor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracedInfraRedSensor(TracedInfraRedSensor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traced Integer Variable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traced Integer Variable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracedIntegerVariable(TracedIntegerVariable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traced LED</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traced LED</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracedLED(TracedLED object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traced Micro Servo</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traced Micro Servo</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracedMicroServo(TracedMicroServo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traced Module</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traced Module</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracedModule(TracedModule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traced Music Player</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traced Music Player</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracedMusicPlayer(TracedMusicPlayer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traced Named Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traced Named Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracedNamedElement(TracedNamedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traced Pin</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traced Pin</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracedPin(TracedPin object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traced Push Button</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traced Push Button</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracedPushButton(TracedPushButton object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traced Rotation Sensor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traced Rotation Sensor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracedRotationSensor(TracedRotationSensor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traced Sketch</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traced Sketch</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracedSketch(TracedSketch object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traced Sound Sensor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traced Sound Sensor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracedSoundSensor(TracedSoundSensor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traced Variable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traced Variable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracedVariable(TracedVariable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //ArduinoSwitch
