/**
 */
package arduinoTrace.Steps;

import fr.inria.diverse.trace.commons.model.trace.SequentialStep;

import org.gemoc.arduino.sequential.arduino.arduino.ModuleAssignment;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Arduino Module Assignment Execute</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see arduinoTrace.Steps.StepsPackage#getArduino_ModuleAssignment_Execute()
 * @model
 * @generated
 */
public interface Arduino_ModuleAssignment_Execute extends SpecificStep, SequentialStep<Arduino_ModuleAssignment_Execute_AbstractSubStep>, Arduino_Repeat_Execute_AbstractSubStep, Arduino_If_Execute_AbstractSubStep {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return (org.gemoc.arduino.sequential.arduino.arduino.ModuleAssignment) this.getMseoccurrence().getMse().getCaller();'"
	 * @generated
	 */
	ModuleAssignment getCaller();

} // Arduino_ModuleAssignment_Execute
