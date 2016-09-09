/**
 */
package arduinoTrace.Steps;

import fr.inria.diverse.trace.commons.model.trace.SequentialStep;

import org.gemoc.arduino.sequential.arduino.arduino.If;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Arduino If Execute</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see arduinoTrace.Steps.StepsPackage#getArduino_If_Execute()
 * @model
 * @generated
 */
public interface Arduino_If_Execute extends Arduino_Repeat_Execute_AbstractSubStep, SpecificStep, SequentialStep<Arduino_If_Execute_AbstractSubStep>, Arduino_If_Execute_AbstractSubStep {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return (org.gemoc.arduino.sequential.arduino.arduino.If) this.getMseoccurrence().getMse().getCaller();'"
	 * @generated
	 */
	If getCaller();

} // Arduino_If_Execute
