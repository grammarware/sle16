/**
 */
package arduinoTrace.Steps;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see arduinoTrace.Steps.StepsPackage
 * @generated
 */
public interface StepsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	StepsFactory eINSTANCE = arduinoTrace.Steps.impl.StepsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Arduino Bluetooth Transceiver Push</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Arduino Bluetooth Transceiver Push</em>'.
	 * @generated
	 */
	Arduino_BluetoothTransceiver_Push createArduino_BluetoothTransceiver_Push();

	/**
	 * Returns a new object of class '<em>Arduino Delay Execute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Arduino Delay Execute</em>'.
	 * @generated
	 */
	Arduino_Delay_Execute createArduino_Delay_Execute();

	/**
	 * Returns a new object of class '<em>Arduino If Execute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Arduino If Execute</em>'.
	 * @generated
	 */
	Arduino_If_Execute createArduino_If_Execute();

	/**
	 * Returns a new object of class '<em>Arduino If Execute Implicit Step</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Arduino If Execute Implicit Step</em>'.
	 * @generated
	 */
	Arduino_If_Execute_ImplicitStep createArduino_If_Execute_ImplicitStep();

	/**
	 * Returns a new object of class '<em>Arduino Module Assignment Execute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Arduino Module Assignment Execute</em>'.
	 * @generated
	 */
	Arduino_ModuleAssignment_Execute createArduino_ModuleAssignment_Execute();

	/**
	 * Returns a new object of class '<em>Arduino Module Assignment Execute Implicit Step</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Arduino Module Assignment Execute Implicit Step</em>'.
	 * @generated
	 */
	Arduino_ModuleAssignment_Execute_ImplicitStep createArduino_ModuleAssignment_Execute_ImplicitStep();

	/**
	 * Returns a new object of class '<em>Arduino Project Setup</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Arduino Project Setup</em>'.
	 * @generated
	 */
	Arduino_Project_Setup createArduino_Project_Setup();

	/**
	 * Returns a new object of class '<em>Arduino Repeat Execute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Arduino Repeat Execute</em>'.
	 * @generated
	 */
	Arduino_Repeat_Execute createArduino_Repeat_Execute();

	/**
	 * Returns a new object of class '<em>Arduino Repeat Execute Implicit Step</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Arduino Repeat Execute Implicit Step</em>'.
	 * @generated
	 */
	Arduino_Repeat_Execute_ImplicitStep createArduino_Repeat_Execute_ImplicitStep();

	/**
	 * Returns a new object of class '<em>Arduino Variable Assignment Execute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Arduino Variable Assignment Execute</em>'.
	 * @generated
	 */
	Arduino_VariableAssignment_Execute createArduino_VariableAssignment_Execute();

	/**
	 * Returns a new object of class '<em>Arduino Variable Declaration Execute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Arduino Variable Declaration Execute</em>'.
	 * @generated
	 */
	Arduino_VariableDeclaration_Execute createArduino_VariableDeclaration_Execute();

	/**
	 * Returns a new object of class '<em>Root Implicit Step</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Root Implicit Step</em>'.
	 * @generated
	 */
	RootImplicitStep createRootImplicitStep();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	StepsPackage getStepsPackage();

} //StepsFactory
