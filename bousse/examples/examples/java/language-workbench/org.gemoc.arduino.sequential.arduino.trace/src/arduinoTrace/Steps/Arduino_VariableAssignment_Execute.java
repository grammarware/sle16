/**
 */
package arduinoTrace.Steps;

import fr.inria.diverse.trace.commons.model.trace.SmallStep;

import org.gemoc.arduino.sequential.arduino.arduino.VariableAssignment;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Arduino Variable Assignment Execute</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see arduinoTrace.Steps.StepsPackage#getArduino_VariableAssignment_Execute()
 * @model
 * @generated
 */
public interface Arduino_VariableAssignment_Execute extends Arduino_Repeat_Execute_AbstractSubStep, SpecificStep, SmallStep, Arduino_If_Execute_AbstractSubStep {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return (org.gemoc.arduino.sequential.arduino.arduino.VariableAssignment) this.getMseoccurrence().getMse().getCaller();'"
	 * @generated
	 */
	VariableAssignment getCaller();

} // Arduino_VariableAssignment_Execute
