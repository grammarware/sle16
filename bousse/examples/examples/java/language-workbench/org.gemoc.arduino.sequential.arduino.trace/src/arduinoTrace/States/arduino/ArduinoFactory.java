/**
 */
package arduinoTrace.States.arduino;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see arduinoTrace.States.arduino.ArduinoPackage
 * @generated
 */
public interface ArduinoFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ArduinoFactory eINSTANCE = arduinoTrace.States.arduino.impl.ArduinoFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Traced Ambient Light Sensor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Traced Ambient Light Sensor</em>'.
	 * @generated
	 */
	TracedAmbientLightSensor createTracedAmbientLightSensor();

	/**
	 * Returns a new object of class '<em>Traced Analog Pin</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Traced Analog Pin</em>'.
	 * @generated
	 */
	TracedAnalogPin createTracedAnalogPin();

	/**
	 * Returns a new object of class '<em>Traced Arduino Board</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Traced Arduino Board</em>'.
	 * @generated
	 */
	TracedArduinoBoard createTracedArduinoBoard();

	/**
	 * Returns a new object of class '<em>Traced Bluetooth Transceiver</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Traced Bluetooth Transceiver</em>'.
	 * @generated
	 */
	TracedBluetoothTransceiver createTracedBluetoothTransceiver();

	/**
	 * Returns a new object of class '<em>Traced Boolean Variable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Traced Boolean Variable</em>'.
	 * @generated
	 */
	TracedBooleanVariable createTracedBooleanVariable();

	/**
	 * Returns a new object of class '<em>Traced Buzzer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Traced Buzzer</em>'.
	 * @generated
	 */
	TracedBuzzer createTracedBuzzer();

	/**
	 * Returns a new object of class '<em>Traced Digital Pin</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Traced Digital Pin</em>'.
	 * @generated
	 */
	TracedDigitalPin createTracedDigitalPin();

	/**
	 * Returns a new object of class '<em>Traced Fan</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Traced Fan</em>'.
	 * @generated
	 */
	TracedFan createTracedFan();

	/**
	 * Returns a new object of class '<em>Traced Infra Red Sensor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Traced Infra Red Sensor</em>'.
	 * @generated
	 */
	TracedInfraRedSensor createTracedInfraRedSensor();

	/**
	 * Returns a new object of class '<em>Traced Integer Variable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Traced Integer Variable</em>'.
	 * @generated
	 */
	TracedIntegerVariable createTracedIntegerVariable();

	/**
	 * Returns a new object of class '<em>Traced LED</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Traced LED</em>'.
	 * @generated
	 */
	TracedLED createTracedLED();

	/**
	 * Returns a new object of class '<em>Traced Micro Servo</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Traced Micro Servo</em>'.
	 * @generated
	 */
	TracedMicroServo createTracedMicroServo();

	/**
	 * Returns a new object of class '<em>Traced Music Player</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Traced Music Player</em>'.
	 * @generated
	 */
	TracedMusicPlayer createTracedMusicPlayer();

	/**
	 * Returns a new object of class '<em>Traced Push Button</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Traced Push Button</em>'.
	 * @generated
	 */
	TracedPushButton createTracedPushButton();

	/**
	 * Returns a new object of class '<em>Traced Rotation Sensor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Traced Rotation Sensor</em>'.
	 * @generated
	 */
	TracedRotationSensor createTracedRotationSensor();

	/**
	 * Returns a new object of class '<em>Traced Sketch</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Traced Sketch</em>'.
	 * @generated
	 */
	TracedSketch createTracedSketch();

	/**
	 * Returns a new object of class '<em>Traced Sound Sensor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Traced Sound Sensor</em>'.
	 * @generated
	 */
	TracedSoundSensor createTracedSoundSensor();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ArduinoPackage getArduinoPackage();

} //ArduinoFactory
