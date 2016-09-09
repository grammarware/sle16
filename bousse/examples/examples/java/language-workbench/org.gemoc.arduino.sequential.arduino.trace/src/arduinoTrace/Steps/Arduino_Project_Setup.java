/**
 */
package arduinoTrace.Steps;

import fr.inria.diverse.trace.commons.model.trace.SmallStep;

import org.gemoc.arduino.sequential.arduino.arduino.Project;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Arduino Project Setup</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see arduinoTrace.Steps.StepsPackage#getArduino_Project_Setup()
 * @model
 * @generated
 */
public interface Arduino_Project_Setup extends SpecificStep, SmallStep {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return (org.gemoc.arduino.sequential.arduino.arduino.Project) this.getMseoccurrence().getMse().getCaller();'"
	 * @generated
	 */
	Project getCaller();

} // Arduino_Project_Setup
