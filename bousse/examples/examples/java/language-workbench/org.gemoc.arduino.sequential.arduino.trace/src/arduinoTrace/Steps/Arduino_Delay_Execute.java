/**
 */
package arduinoTrace.Steps;

import fr.inria.diverse.trace.commons.model.trace.SmallStep;

import org.gemoc.arduino.sequential.arduino.arduino.Delay;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Arduino Delay Execute</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see arduinoTrace.Steps.StepsPackage#getArduino_Delay_Execute()
 * @model
 * @generated
 */
public interface Arduino_Delay_Execute extends Arduino_Repeat_Execute_AbstractSubStep, SpecificStep, SmallStep, Arduino_If_Execute_AbstractSubStep {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return (org.gemoc.arduino.sequential.arduino.arduino.Delay) this.getMseoccurrence().getMse().getCaller();'"
	 * @generated
	 */
	Delay getCaller();

} // Arduino_Delay_Execute
