/**
 */
package arduinoTrace.Steps;

import arduinoTrace.States.arduino.TracedBluetoothTransceiver;

import fr.inria.diverse.trace.commons.model.trace.SmallStep;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Arduino Bluetooth Transceiver Push</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see arduinoTrace.Steps.StepsPackage#getArduino_BluetoothTransceiver_Push()
 * @model
 * @generated
 */
public interface Arduino_BluetoothTransceiver_Push extends SpecificStep, SmallStep, Arduino_ModuleAssignment_Execute_AbstractSubStep, Arduino_Repeat_Execute_AbstractSubStep, Arduino_If_Execute_AbstractSubStep {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return (arduinoTrace.States.arduino.TracedBluetoothTransceiver) this.getMseoccurrence().getMse().getCaller();'"
	 * @generated
	 */
	TracedBluetoothTransceiver getCaller();

} // Arduino_BluetoothTransceiver_Push
