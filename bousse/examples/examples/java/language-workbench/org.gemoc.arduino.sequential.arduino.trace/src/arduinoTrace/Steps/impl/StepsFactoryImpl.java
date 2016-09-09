/**
 */
package arduinoTrace.Steps.impl;

import arduinoTrace.Steps.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class StepsFactoryImpl extends EFactoryImpl implements StepsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static StepsFactory init() {
		try {
			StepsFactory theStepsFactory = (StepsFactory)EPackage.Registry.INSTANCE.getEFactory(StepsPackage.eNS_URI);
			if (theStepsFactory != null) {
				return theStepsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new StepsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StepsFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case StepsPackage.ARDUINO_BLUETOOTH_TRANSCEIVER_PUSH: return createArduino_BluetoothTransceiver_Push();
			case StepsPackage.ARDUINO_DELAY_EXECUTE: return createArduino_Delay_Execute();
			case StepsPackage.ARDUINO_IF_EXECUTE: return createArduino_If_Execute();
			case StepsPackage.ARDUINO_IF_EXECUTE_IMPLICIT_STEP: return createArduino_If_Execute_ImplicitStep();
			case StepsPackage.ARDUINO_MODULE_ASSIGNMENT_EXECUTE: return createArduino_ModuleAssignment_Execute();
			case StepsPackage.ARDUINO_MODULE_ASSIGNMENT_EXECUTE_IMPLICIT_STEP: return createArduino_ModuleAssignment_Execute_ImplicitStep();
			case StepsPackage.ARDUINO_PROJECT_SETUP: return createArduino_Project_Setup();
			case StepsPackage.ARDUINO_REPEAT_EXECUTE: return createArduino_Repeat_Execute();
			case StepsPackage.ARDUINO_REPEAT_EXECUTE_IMPLICIT_STEP: return createArduino_Repeat_Execute_ImplicitStep();
			case StepsPackage.ARDUINO_VARIABLE_ASSIGNMENT_EXECUTE: return createArduino_VariableAssignment_Execute();
			case StepsPackage.ARDUINO_VARIABLE_DECLARATION_EXECUTE: return createArduino_VariableDeclaration_Execute();
			case StepsPackage.ROOT_IMPLICIT_STEP: return createRootImplicitStep();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Arduino_BluetoothTransceiver_Push createArduino_BluetoothTransceiver_Push() {
		Arduino_BluetoothTransceiver_PushImpl arduino_BluetoothTransceiver_Push = new Arduino_BluetoothTransceiver_PushImpl();
		return arduino_BluetoothTransceiver_Push;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Arduino_Delay_Execute createArduino_Delay_Execute() {
		Arduino_Delay_ExecuteImpl arduino_Delay_Execute = new Arduino_Delay_ExecuteImpl();
		return arduino_Delay_Execute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Arduino_If_Execute createArduino_If_Execute() {
		Arduino_If_ExecuteImpl arduino_If_Execute = new Arduino_If_ExecuteImpl();
		return arduino_If_Execute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Arduino_If_Execute_ImplicitStep createArduino_If_Execute_ImplicitStep() {
		Arduino_If_Execute_ImplicitStepImpl arduino_If_Execute_ImplicitStep = new Arduino_If_Execute_ImplicitStepImpl();
		return arduino_If_Execute_ImplicitStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Arduino_ModuleAssignment_Execute createArduino_ModuleAssignment_Execute() {
		Arduino_ModuleAssignment_ExecuteImpl arduino_ModuleAssignment_Execute = new Arduino_ModuleAssignment_ExecuteImpl();
		return arduino_ModuleAssignment_Execute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Arduino_ModuleAssignment_Execute_ImplicitStep createArduino_ModuleAssignment_Execute_ImplicitStep() {
		Arduino_ModuleAssignment_Execute_ImplicitStepImpl arduino_ModuleAssignment_Execute_ImplicitStep = new Arduino_ModuleAssignment_Execute_ImplicitStepImpl();
		return arduino_ModuleAssignment_Execute_ImplicitStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Arduino_Project_Setup createArduino_Project_Setup() {
		Arduino_Project_SetupImpl arduino_Project_Setup = new Arduino_Project_SetupImpl();
		return arduino_Project_Setup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Arduino_Repeat_Execute createArduino_Repeat_Execute() {
		Arduino_Repeat_ExecuteImpl arduino_Repeat_Execute = new Arduino_Repeat_ExecuteImpl();
		return arduino_Repeat_Execute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Arduino_Repeat_Execute_ImplicitStep createArduino_Repeat_Execute_ImplicitStep() {
		Arduino_Repeat_Execute_ImplicitStepImpl arduino_Repeat_Execute_ImplicitStep = new Arduino_Repeat_Execute_ImplicitStepImpl();
		return arduino_Repeat_Execute_ImplicitStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Arduino_VariableAssignment_Execute createArduino_VariableAssignment_Execute() {
		Arduino_VariableAssignment_ExecuteImpl arduino_VariableAssignment_Execute = new Arduino_VariableAssignment_ExecuteImpl();
		return arduino_VariableAssignment_Execute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Arduino_VariableDeclaration_Execute createArduino_VariableDeclaration_Execute() {
		Arduino_VariableDeclaration_ExecuteImpl arduino_VariableDeclaration_Execute = new Arduino_VariableDeclaration_ExecuteImpl();
		return arduino_VariableDeclaration_Execute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RootImplicitStep createRootImplicitStep() {
		RootImplicitStepImpl rootImplicitStep = new RootImplicitStepImpl();
		return rootImplicitStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StepsPackage getStepsPackage() {
		return (StepsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static StepsPackage getPackage() {
		return StepsPackage.eINSTANCE;
	}

} //StepsFactoryImpl
