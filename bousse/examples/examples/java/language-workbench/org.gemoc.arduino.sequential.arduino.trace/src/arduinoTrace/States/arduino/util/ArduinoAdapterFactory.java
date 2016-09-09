/**
 */
package arduinoTrace.States.arduino.util;

import arduinoTrace.States.arduino.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see arduinoTrace.States.arduino.ArduinoPackage
 * @generated
 */
public class ArduinoAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ArduinoPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArduinoAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ArduinoPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArduinoSwitch<Adapter> modelSwitch =
		new ArduinoSwitch<Adapter>() {
			@Override
			public Adapter caseTracedAmbientLightSensor(TracedAmbientLightSensor object) {
				return createTracedAmbientLightSensorAdapter();
			}
			@Override
			public Adapter caseTracedAnalogPin(TracedAnalogPin object) {
				return createTracedAnalogPinAdapter();
			}
			@Override
			public Adapter caseTracedArduinoAnalogModule(TracedArduinoAnalogModule object) {
				return createTracedArduinoAnalogModuleAdapter();
			}
			@Override
			public Adapter caseTracedArduinoBoard(TracedArduinoBoard object) {
				return createTracedArduinoBoardAdapter();
			}
			@Override
			public Adapter caseTracedArduinoCommunicationModule(TracedArduinoCommunicationModule object) {
				return createTracedArduinoCommunicationModuleAdapter();
			}
			@Override
			public Adapter caseTracedArduinoDigitalModule(TracedArduinoDigitalModule object) {
				return createTracedArduinoDigitalModuleAdapter();
			}
			@Override
			public Adapter caseTracedArduinoModule(TracedArduinoModule object) {
				return createTracedArduinoModuleAdapter();
			}
			@Override
			public Adapter caseTracedBluetoothTransceiver(TracedBluetoothTransceiver object) {
				return createTracedBluetoothTransceiverAdapter();
			}
			@Override
			public Adapter caseTracedBoard(TracedBoard object) {
				return createTracedBoardAdapter();
			}
			@Override
			public Adapter caseTracedBooleanVariable(TracedBooleanVariable object) {
				return createTracedBooleanVariableAdapter();
			}
			@Override
			public Adapter caseTracedBuzzer(TracedBuzzer object) {
				return createTracedBuzzerAdapter();
			}
			@Override
			public Adapter caseTracedDigitalPin(TracedDigitalPin object) {
				return createTracedDigitalPinAdapter();
			}
			@Override
			public Adapter caseTracedFan(TracedFan object) {
				return createTracedFanAdapter();
			}
			@Override
			public Adapter caseTracedInfraRedSensor(TracedInfraRedSensor object) {
				return createTracedInfraRedSensorAdapter();
			}
			@Override
			public Adapter caseTracedIntegerVariable(TracedIntegerVariable object) {
				return createTracedIntegerVariableAdapter();
			}
			@Override
			public Adapter caseTracedLED(TracedLED object) {
				return createTracedLEDAdapter();
			}
			@Override
			public Adapter caseTracedMicroServo(TracedMicroServo object) {
				return createTracedMicroServoAdapter();
			}
			@Override
			public Adapter caseTracedModule(TracedModule object) {
				return createTracedModuleAdapter();
			}
			@Override
			public Adapter caseTracedMusicPlayer(TracedMusicPlayer object) {
				return createTracedMusicPlayerAdapter();
			}
			@Override
			public Adapter caseTracedNamedElement(TracedNamedElement object) {
				return createTracedNamedElementAdapter();
			}
			@Override
			public Adapter caseTracedPin(TracedPin object) {
				return createTracedPinAdapter();
			}
			@Override
			public Adapter caseTracedPushButton(TracedPushButton object) {
				return createTracedPushButtonAdapter();
			}
			@Override
			public Adapter caseTracedRotationSensor(TracedRotationSensor object) {
				return createTracedRotationSensorAdapter();
			}
			@Override
			public Adapter caseTracedSketch(TracedSketch object) {
				return createTracedSketchAdapter();
			}
			@Override
			public Adapter caseTracedSoundSensor(TracedSoundSensor object) {
				return createTracedSoundSensorAdapter();
			}
			@Override
			public Adapter caseTracedVariable(TracedVariable object) {
				return createTracedVariableAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link arduinoTrace.States.arduino.TracedAmbientLightSensor <em>Traced Ambient Light Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arduinoTrace.States.arduino.TracedAmbientLightSensor
	 * @generated
	 */
	public Adapter createTracedAmbientLightSensorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arduinoTrace.States.arduino.TracedAnalogPin <em>Traced Analog Pin</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arduinoTrace.States.arduino.TracedAnalogPin
	 * @generated
	 */
	public Adapter createTracedAnalogPinAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arduinoTrace.States.arduino.TracedArduinoAnalogModule <em>Traced Arduino Analog Module</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arduinoTrace.States.arduino.TracedArduinoAnalogModule
	 * @generated
	 */
	public Adapter createTracedArduinoAnalogModuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arduinoTrace.States.arduino.TracedArduinoBoard <em>Traced Arduino Board</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arduinoTrace.States.arduino.TracedArduinoBoard
	 * @generated
	 */
	public Adapter createTracedArduinoBoardAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arduinoTrace.States.arduino.TracedArduinoCommunicationModule <em>Traced Arduino Communication Module</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arduinoTrace.States.arduino.TracedArduinoCommunicationModule
	 * @generated
	 */
	public Adapter createTracedArduinoCommunicationModuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arduinoTrace.States.arduino.TracedArduinoDigitalModule <em>Traced Arduino Digital Module</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arduinoTrace.States.arduino.TracedArduinoDigitalModule
	 * @generated
	 */
	public Adapter createTracedArduinoDigitalModuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arduinoTrace.States.arduino.TracedArduinoModule <em>Traced Arduino Module</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arduinoTrace.States.arduino.TracedArduinoModule
	 * @generated
	 */
	public Adapter createTracedArduinoModuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arduinoTrace.States.arduino.TracedBluetoothTransceiver <em>Traced Bluetooth Transceiver</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arduinoTrace.States.arduino.TracedBluetoothTransceiver
	 * @generated
	 */
	public Adapter createTracedBluetoothTransceiverAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arduinoTrace.States.arduino.TracedBoard <em>Traced Board</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arduinoTrace.States.arduino.TracedBoard
	 * @generated
	 */
	public Adapter createTracedBoardAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arduinoTrace.States.arduino.TracedBooleanVariable <em>Traced Boolean Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arduinoTrace.States.arduino.TracedBooleanVariable
	 * @generated
	 */
	public Adapter createTracedBooleanVariableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arduinoTrace.States.arduino.TracedBuzzer <em>Traced Buzzer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arduinoTrace.States.arduino.TracedBuzzer
	 * @generated
	 */
	public Adapter createTracedBuzzerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arduinoTrace.States.arduino.TracedDigitalPin <em>Traced Digital Pin</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arduinoTrace.States.arduino.TracedDigitalPin
	 * @generated
	 */
	public Adapter createTracedDigitalPinAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arduinoTrace.States.arduino.TracedFan <em>Traced Fan</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arduinoTrace.States.arduino.TracedFan
	 * @generated
	 */
	public Adapter createTracedFanAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arduinoTrace.States.arduino.TracedInfraRedSensor <em>Traced Infra Red Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arduinoTrace.States.arduino.TracedInfraRedSensor
	 * @generated
	 */
	public Adapter createTracedInfraRedSensorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arduinoTrace.States.arduino.TracedIntegerVariable <em>Traced Integer Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arduinoTrace.States.arduino.TracedIntegerVariable
	 * @generated
	 */
	public Adapter createTracedIntegerVariableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arduinoTrace.States.arduino.TracedLED <em>Traced LED</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arduinoTrace.States.arduino.TracedLED
	 * @generated
	 */
	public Adapter createTracedLEDAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arduinoTrace.States.arduino.TracedMicroServo <em>Traced Micro Servo</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arduinoTrace.States.arduino.TracedMicroServo
	 * @generated
	 */
	public Adapter createTracedMicroServoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arduinoTrace.States.arduino.TracedModule <em>Traced Module</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arduinoTrace.States.arduino.TracedModule
	 * @generated
	 */
	public Adapter createTracedModuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arduinoTrace.States.arduino.TracedMusicPlayer <em>Traced Music Player</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arduinoTrace.States.arduino.TracedMusicPlayer
	 * @generated
	 */
	public Adapter createTracedMusicPlayerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arduinoTrace.States.arduino.TracedNamedElement <em>Traced Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arduinoTrace.States.arduino.TracedNamedElement
	 * @generated
	 */
	public Adapter createTracedNamedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arduinoTrace.States.arduino.TracedPin <em>Traced Pin</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arduinoTrace.States.arduino.TracedPin
	 * @generated
	 */
	public Adapter createTracedPinAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arduinoTrace.States.arduino.TracedPushButton <em>Traced Push Button</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arduinoTrace.States.arduino.TracedPushButton
	 * @generated
	 */
	public Adapter createTracedPushButtonAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arduinoTrace.States.arduino.TracedRotationSensor <em>Traced Rotation Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arduinoTrace.States.arduino.TracedRotationSensor
	 * @generated
	 */
	public Adapter createTracedRotationSensorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arduinoTrace.States.arduino.TracedSketch <em>Traced Sketch</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arduinoTrace.States.arduino.TracedSketch
	 * @generated
	 */
	public Adapter createTracedSketchAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arduinoTrace.States.arduino.TracedSoundSensor <em>Traced Sound Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arduinoTrace.States.arduino.TracedSoundSensor
	 * @generated
	 */
	public Adapter createTracedSoundSensorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arduinoTrace.States.arduino.TracedVariable <em>Traced Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arduinoTrace.States.arduino.TracedVariable
	 * @generated
	 */
	public Adapter createTracedVariableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //ArduinoAdapterFactory
