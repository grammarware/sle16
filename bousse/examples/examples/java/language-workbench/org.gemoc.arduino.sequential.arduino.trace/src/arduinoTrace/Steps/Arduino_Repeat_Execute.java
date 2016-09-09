/**
 */
package arduinoTrace.Steps;

import fr.inria.diverse.trace.commons.model.trace.SequentialStep;

import org.gemoc.arduino.sequential.arduino.arduino.Repeat;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Arduino Repeat Execute</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see arduinoTrace.Steps.StepsPackage#getArduino_Repeat_Execute()
 * @model
 * @generated
 */
public interface Arduino_Repeat_Execute extends SpecificStep, SequentialStep<Arduino_Repeat_Execute_AbstractSubStep>, Arduino_Repeat_Execute_AbstractSubStep, Arduino_If_Execute_AbstractSubStep {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return (org.gemoc.arduino.sequential.arduino.arduino.Repeat) this.getMseoccurrence().getMse().getCaller();'"
	 * @generated
	 */
	Repeat getCaller();

} // Arduino_Repeat_Execute
