/**
 */
package arduinoTrace.Steps;

import fr.inria.diverse.trace.commons.model.trace.SmallStep;

import org.gemoc.arduino.sequential.arduino.arduino.VariableDeclaration;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Arduino Variable Declaration Execute</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see arduinoTrace.Steps.StepsPackage#getArduino_VariableDeclaration_Execute()
 * @model
 * @generated
 */
public interface Arduino_VariableDeclaration_Execute extends Arduino_Repeat_Execute_AbstractSubStep, SpecificStep, SmallStep, Arduino_If_Execute_AbstractSubStep {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return (org.gemoc.arduino.sequential.arduino.arduino.VariableDeclaration) this.getMseoccurrence().getMse().getCaller();'"
	 * @generated
	 */
	VariableDeclaration getCaller();

} // Arduino_VariableDeclaration_Execute
