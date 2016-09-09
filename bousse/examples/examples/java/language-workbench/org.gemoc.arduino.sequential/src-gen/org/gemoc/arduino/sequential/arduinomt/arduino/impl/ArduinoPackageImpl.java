/**
 */
package org.gemoc.arduino.sequential.arduinomt.arduino.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.gemoc.arduino.sequential.arduinomt.arduino.AmbientLightSensor;
import org.gemoc.arduino.sequential.arduinomt.arduino.AnalogPin;
import org.gemoc.arduino.sequential.arduinomt.arduino.ArduinoAnalogModule;
import org.gemoc.arduino.sequential.arduinomt.arduino.ArduinoBoard;
import org.gemoc.arduino.sequential.arduinomt.arduino.ArduinoCommunicationModule;
import org.gemoc.arduino.sequential.arduinomt.arduino.ArduinoDigitalModule;
import org.gemoc.arduino.sequential.arduinomt.arduino.ArduinoFactory;
import org.gemoc.arduino.sequential.arduinomt.arduino.ArduinoModule;
import org.gemoc.arduino.sequential.arduinomt.arduino.ArduinoPackage;
import org.gemoc.arduino.sequential.arduinomt.arduino.Assignment;
import org.gemoc.arduino.sequential.arduinomt.arduino.BinaryBooleanExpression;
import org.gemoc.arduino.sequential.arduinomt.arduino.BinaryBooleanOperatorKind;
import org.gemoc.arduino.sequential.arduinomt.arduino.BinaryExpression;
import org.gemoc.arduino.sequential.arduinomt.arduino.BinaryIntegerExpression;
import org.gemoc.arduino.sequential.arduinomt.arduino.BinaryIntegerOperatorKind;
import org.gemoc.arduino.sequential.arduinomt.arduino.Block;
import org.gemoc.arduino.sequential.arduinomt.arduino.BluetoothTransceiver;
import org.gemoc.arduino.sequential.arduinomt.arduino.Board;
import org.gemoc.arduino.sequential.arduinomt.arduino.BooleanConstant;
import org.gemoc.arduino.sequential.arduinomt.arduino.BooleanExpression;
import org.gemoc.arduino.sequential.arduinomt.arduino.BooleanModuleGet;
import org.gemoc.arduino.sequential.arduinomt.arduino.BooleanVariable;
import org.gemoc.arduino.sequential.arduinomt.arduino.BooleanVariableRef;
import org.gemoc.arduino.sequential.arduinomt.arduino.Buzzer;
import org.gemoc.arduino.sequential.arduinomt.arduino.Color;
import org.gemoc.arduino.sequential.arduinomt.arduino.Constant;
import org.gemoc.arduino.sequential.arduinomt.arduino.Control;
import org.gemoc.arduino.sequential.arduinomt.arduino.Delay;
import org.gemoc.arduino.sequential.arduinomt.arduino.DigitalPin;
import org.gemoc.arduino.sequential.arduinomt.arduino.Expression;
import org.gemoc.arduino.sequential.arduinomt.arduino.Fan;
import org.gemoc.arduino.sequential.arduinomt.arduino.If;
import org.gemoc.arduino.sequential.arduinomt.arduino.InfraRedSensor;
import org.gemoc.arduino.sequential.arduinomt.arduino.Instruction;
import org.gemoc.arduino.sequential.arduinomt.arduino.IntegerConstant;
import org.gemoc.arduino.sequential.arduinomt.arduino.IntegerExpression;
import org.gemoc.arduino.sequential.arduinomt.arduino.IntegerModuleGet;
import org.gemoc.arduino.sequential.arduinomt.arduino.IntegerVariable;
import org.gemoc.arduino.sequential.arduinomt.arduino.IntegerVariableRef;
import org.gemoc.arduino.sequential.arduinomt.arduino.MicroServo;
import org.gemoc.arduino.sequential.arduinomt.arduino.Module;
import org.gemoc.arduino.sequential.arduinomt.arduino.ModuleAssignment;
import org.gemoc.arduino.sequential.arduinomt.arduino.ModuleGet;
import org.gemoc.arduino.sequential.arduinomt.arduino.ModuleInstruction;
import org.gemoc.arduino.sequential.arduinomt.arduino.MusicPlayer;
import org.gemoc.arduino.sequential.arduinomt.arduino.NamedElement;
import org.gemoc.arduino.sequential.arduinomt.arduino.Pin;
import org.gemoc.arduino.sequential.arduinomt.arduino.Project;
import org.gemoc.arduino.sequential.arduinomt.arduino.PushButton;
import org.gemoc.arduino.sequential.arduinomt.arduino.Repeat;
import org.gemoc.arduino.sequential.arduinomt.arduino.RotationSensor;
import org.gemoc.arduino.sequential.arduinomt.arduino.Sketch;
import org.gemoc.arduino.sequential.arduinomt.arduino.SoundSensor;
import org.gemoc.arduino.sequential.arduinomt.arduino.Time;
import org.gemoc.arduino.sequential.arduinomt.arduino.UnaryBooleanExpression;
import org.gemoc.arduino.sequential.arduinomt.arduino.UnaryBooleanOperatorKind;
import org.gemoc.arduino.sequential.arduinomt.arduino.UnaryExpression;
import org.gemoc.arduino.sequential.arduinomt.arduino.UnaryIntegerExpression;
import org.gemoc.arduino.sequential.arduinomt.arduino.UnaryIntegerOperatorKind;
import org.gemoc.arduino.sequential.arduinomt.arduino.Utilities;
import org.gemoc.arduino.sequential.arduinomt.arduino.Variable;
import org.gemoc.arduino.sequential.arduinomt.arduino.VariableAssignment;
import org.gemoc.arduino.sequential.arduinomt.arduino.VariableDeclaration;
import org.gemoc.arduino.sequential.arduinomt.arduino.VariableRef;
import org.gemoc.arduino.sequential.arduinomt.arduino.While;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ArduinoPackageImpl extends EPackageImpl implements ArduinoPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass boardEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass moduleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass digitalPinEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pinEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass analogPinEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sketchEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass projectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass instructionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass moduleAssignmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass moduleInstructionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass controlEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass utilitiesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass delayEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass namedElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass repeatEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass moduleGetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass whileEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass binaryExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass variableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass variableAssignmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass binaryIntegerExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass binaryBooleanExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass expressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass constantEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ifEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass integerConstantEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass booleanConstantEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass booleanExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass integerExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass assignmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass integerVariableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass booleanVariableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass booleanModuleGetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass integerModuleGetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unaryExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unaryBooleanExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unaryIntegerExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass variableDeclarationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass variableRefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass integerVariableRefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ledEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pushButtonEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass buzzerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rotationSensorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass microServoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass infraRedSensorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ambientLightSensorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass soundSensorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fanEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass musicPlayerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arduinoModuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass blockEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arduinoBoardEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arduinoDigitalModuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arduinoAnalogModuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass booleanVariableRefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arduinoCommunicationModuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bluetoothTransceiverEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum timeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum binaryIntegerOperatorKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum binaryBooleanOperatorKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum unaryIntegerOperatorKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum unaryBooleanOperatorKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum colorEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType objectEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.gemoc.arduino.sequential.arduinomt.arduino.ArduinoPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ArduinoPackageImpl() {
		super(eNS_URI, ArduinoFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link ArduinoPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ArduinoPackage init() {
		if (isInited) return (ArduinoPackage)EPackage.Registry.INSTANCE.getEPackage(ArduinoPackage.eNS_URI);

		// Obtain or create and register package
		ArduinoPackageImpl theArduinoPackage = (ArduinoPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ArduinoPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ArduinoPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		EcorePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theArduinoPackage.createPackageContents();

		// Initialize created meta-data
		theArduinoPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theArduinoPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ArduinoPackage.eNS_URI, theArduinoPackage);
		return theArduinoPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBoard() {
		return boardEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBoard_Project() {
		return (EReference)boardEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModule() {
		return moduleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDigitalPin() {
		return digitalPinEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDigitalPin_Module() {
		return (EReference)digitalPinEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPin() {
		return pinEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPin_Level() {
		return (EAttribute)pinEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAnalogPin() {
		return analogPinEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAnalogPin_Module() {
		return (EReference)analogPinEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSketch() {
		return sketchEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSketch_Project() {
		return (EReference)sketchEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSketch_Block() {
		return (EReference)sketchEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSketch_Board() {
		return (EReference)sketchEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProject() {
		return projectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProject_Boards() {
		return (EReference)projectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProject_Sketches() {
		return (EReference)projectEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInstruction() {
		return instructionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModuleAssignment() {
		return moduleAssignmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModuleInstruction() {
		return moduleInstructionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModuleInstruction_Module() {
		return (EReference)moduleInstructionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getControl() {
		return controlEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getControl_Block() {
		return (EReference)controlEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUtilities() {
		return utilitiesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDelay() {
		return delayEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDelay_Unit() {
		return (EAttribute)delayEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDelay_Value() {
		return (EAttribute)delayEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNamedElement() {
		return namedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNamedElement_Name() {
		return (EAttribute)namedElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRepeat() {
		return repeatEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRepeat_Iteration() {
		return (EAttribute)repeatEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModuleGet() {
		return moduleGetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModuleGet_Module() {
		return (EReference)moduleGetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWhile() {
		return whileEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWhile_Condition() {
		return (EReference)whileEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBinaryExpression() {
		return binaryExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBinaryExpression_Left() {
		return (EReference)binaryExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBinaryExpression_Right() {
		return (EReference)binaryExpressionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVariable() {
		return variableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVariableAssignment() {
		return variableAssignmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVariableAssignment_Variable() {
		return (EReference)variableAssignmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBinaryIntegerExpression() {
		return binaryIntegerExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBinaryIntegerExpression_Operator() {
		return (EAttribute)binaryIntegerExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBinaryBooleanExpression() {
		return binaryBooleanExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBinaryBooleanExpression_Operator() {
		return (EAttribute)binaryBooleanExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExpression() {
		return expressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConstant() {
		return constantEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIf() {
		return ifEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIf_Condition() {
		return (EReference)ifEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIf_ElseBlock() {
		return (EReference)ifEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIntegerConstant() {
		return integerConstantEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIntegerConstant_Value() {
		return (EAttribute)integerConstantEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBooleanConstant() {
		return booleanConstantEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBooleanConstant_Value() {
		return (EAttribute)booleanConstantEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBooleanExpression() {
		return booleanExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIntegerExpression() {
		return integerExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAssignment() {
		return assignmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssignment_Operand() {
		return (EReference)assignmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIntegerVariable() {
		return integerVariableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIntegerVariable_InitialValue() {
		return (EAttribute)integerVariableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIntegerVariable_Value() {
		return (EAttribute)integerVariableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBooleanVariable() {
		return booleanVariableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBooleanVariable_InitialValue() {
		return (EAttribute)booleanVariableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBooleanVariable_Value() {
		return (EAttribute)booleanVariableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBooleanModuleGet() {
		return booleanModuleGetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIntegerModuleGet() {
		return integerModuleGetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUnaryExpression() {
		return unaryExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUnaryExpression_Operand() {
		return (EReference)unaryExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUnaryBooleanExpression() {
		return unaryBooleanExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUnaryBooleanExpression_Operator() {
		return (EAttribute)unaryBooleanExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUnaryIntegerExpression() {
		return unaryIntegerExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUnaryIntegerExpression_Operator() {
		return (EAttribute)unaryIntegerExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVariableDeclaration() {
		return variableDeclarationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVariableDeclaration_Variable() {
		return (EReference)variableDeclarationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVariableRef() {
		return variableRefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIntegerVariableRef() {
		return integerVariableRefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIntegerVariableRef_Variable() {
		return (EReference)integerVariableRefEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLED() {
		return ledEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLED_Color() {
		return (EAttribute)ledEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPushButton() {
		return pushButtonEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBuzzer() {
		return buzzerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRotationSensor() {
		return rotationSensorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMicroServo() {
		return microServoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInfraRedSensor() {
		return infraRedSensorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAmbientLightSensor() {
		return ambientLightSensorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSoundSensor() {
		return soundSensorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFan() {
		return fanEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMusicPlayer() {
		return musicPlayerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArduinoModule() {
		return arduinoModuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBlock() {
		return blockEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBlock_Instructions() {
		return (EReference)blockEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArduinoBoard() {
		return arduinoBoardEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArduinoBoard_DigitalPins() {
		return (EReference)arduinoBoardEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArduinoBoard_AnalogPins() {
		return (EReference)arduinoBoardEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArduinoDigitalModule() {
		return arduinoDigitalModuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArduinoAnalogModule() {
		return arduinoAnalogModuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBooleanVariableRef() {
		return booleanVariableRefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBooleanVariableRef_Variable() {
		return (EReference)booleanVariableRefEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArduinoCommunicationModule() {
		return arduinoCommunicationModuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBluetoothTransceiver() {
		return bluetoothTransceiverEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBluetoothTransceiver_ConnectedTransceiver() {
		return (EReference)bluetoothTransceiverEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBluetoothTransceiver_DataToSend() {
		return (EAttribute)bluetoothTransceiverEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBluetoothTransceiver_DataReceived() {
		return (EAttribute)bluetoothTransceiverEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTime() {
		return timeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getBinaryIntegerOperatorKind() {
		return binaryIntegerOperatorKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getBinaryBooleanOperatorKind() {
		return binaryBooleanOperatorKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getUnaryIntegerOperatorKind() {
		return unaryIntegerOperatorKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getUnaryBooleanOperatorKind() {
		return unaryBooleanOperatorKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getColor() {
		return colorEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getObject() {
		return objectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArduinoFactory getArduinoFactory() {
		return (ArduinoFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		boardEClass = createEClass(BOARD);
		createEReference(boardEClass, BOARD__PROJECT);

		moduleEClass = createEClass(MODULE);

		digitalPinEClass = createEClass(DIGITAL_PIN);
		createEReference(digitalPinEClass, DIGITAL_PIN__MODULE);

		pinEClass = createEClass(PIN);
		createEAttribute(pinEClass, PIN__LEVEL);

		analogPinEClass = createEClass(ANALOG_PIN);
		createEReference(analogPinEClass, ANALOG_PIN__MODULE);

		sketchEClass = createEClass(SKETCH);
		createEReference(sketchEClass, SKETCH__PROJECT);
		createEReference(sketchEClass, SKETCH__BLOCK);
		createEReference(sketchEClass, SKETCH__BOARD);

		projectEClass = createEClass(PROJECT);
		createEReference(projectEClass, PROJECT__BOARDS);
		createEReference(projectEClass, PROJECT__SKETCHES);

		instructionEClass = createEClass(INSTRUCTION);

		moduleAssignmentEClass = createEClass(MODULE_ASSIGNMENT);

		moduleInstructionEClass = createEClass(MODULE_INSTRUCTION);
		createEReference(moduleInstructionEClass, MODULE_INSTRUCTION__MODULE);

		controlEClass = createEClass(CONTROL);
		createEReference(controlEClass, CONTROL__BLOCK);

		utilitiesEClass = createEClass(UTILITIES);

		delayEClass = createEClass(DELAY);
		createEAttribute(delayEClass, DELAY__UNIT);
		createEAttribute(delayEClass, DELAY__VALUE);

		namedElementEClass = createEClass(NAMED_ELEMENT);
		createEAttribute(namedElementEClass, NAMED_ELEMENT__NAME);

		repeatEClass = createEClass(REPEAT);
		createEAttribute(repeatEClass, REPEAT__ITERATION);

		moduleGetEClass = createEClass(MODULE_GET);
		createEReference(moduleGetEClass, MODULE_GET__MODULE);

		whileEClass = createEClass(WHILE);
		createEReference(whileEClass, WHILE__CONDITION);

		binaryExpressionEClass = createEClass(BINARY_EXPRESSION);
		createEReference(binaryExpressionEClass, BINARY_EXPRESSION__LEFT);
		createEReference(binaryExpressionEClass, BINARY_EXPRESSION__RIGHT);

		variableEClass = createEClass(VARIABLE);

		variableAssignmentEClass = createEClass(VARIABLE_ASSIGNMENT);
		createEReference(variableAssignmentEClass, VARIABLE_ASSIGNMENT__VARIABLE);

		binaryIntegerExpressionEClass = createEClass(BINARY_INTEGER_EXPRESSION);
		createEAttribute(binaryIntegerExpressionEClass, BINARY_INTEGER_EXPRESSION__OPERATOR);

		binaryBooleanExpressionEClass = createEClass(BINARY_BOOLEAN_EXPRESSION);
		createEAttribute(binaryBooleanExpressionEClass, BINARY_BOOLEAN_EXPRESSION__OPERATOR);

		expressionEClass = createEClass(EXPRESSION);

		constantEClass = createEClass(CONSTANT);

		ifEClass = createEClass(IF);
		createEReference(ifEClass, IF__CONDITION);
		createEReference(ifEClass, IF__ELSE_BLOCK);

		integerConstantEClass = createEClass(INTEGER_CONSTANT);
		createEAttribute(integerConstantEClass, INTEGER_CONSTANT__VALUE);

		booleanConstantEClass = createEClass(BOOLEAN_CONSTANT);
		createEAttribute(booleanConstantEClass, BOOLEAN_CONSTANT__VALUE);

		booleanExpressionEClass = createEClass(BOOLEAN_EXPRESSION);

		integerExpressionEClass = createEClass(INTEGER_EXPRESSION);

		assignmentEClass = createEClass(ASSIGNMENT);
		createEReference(assignmentEClass, ASSIGNMENT__OPERAND);

		integerVariableEClass = createEClass(INTEGER_VARIABLE);
		createEAttribute(integerVariableEClass, INTEGER_VARIABLE__INITIAL_VALUE);
		createEAttribute(integerVariableEClass, INTEGER_VARIABLE__VALUE);

		booleanVariableEClass = createEClass(BOOLEAN_VARIABLE);
		createEAttribute(booleanVariableEClass, BOOLEAN_VARIABLE__INITIAL_VALUE);
		createEAttribute(booleanVariableEClass, BOOLEAN_VARIABLE__VALUE);

		booleanModuleGetEClass = createEClass(BOOLEAN_MODULE_GET);

		integerModuleGetEClass = createEClass(INTEGER_MODULE_GET);

		unaryExpressionEClass = createEClass(UNARY_EXPRESSION);
		createEReference(unaryExpressionEClass, UNARY_EXPRESSION__OPERAND);

		unaryBooleanExpressionEClass = createEClass(UNARY_BOOLEAN_EXPRESSION);
		createEAttribute(unaryBooleanExpressionEClass, UNARY_BOOLEAN_EXPRESSION__OPERATOR);

		unaryIntegerExpressionEClass = createEClass(UNARY_INTEGER_EXPRESSION);
		createEAttribute(unaryIntegerExpressionEClass, UNARY_INTEGER_EXPRESSION__OPERATOR);

		variableDeclarationEClass = createEClass(VARIABLE_DECLARATION);
		createEReference(variableDeclarationEClass, VARIABLE_DECLARATION__VARIABLE);

		variableRefEClass = createEClass(VARIABLE_REF);

		integerVariableRefEClass = createEClass(INTEGER_VARIABLE_REF);
		createEReference(integerVariableRefEClass, INTEGER_VARIABLE_REF__VARIABLE);

		ledEClass = createEClass(LED);
		createEAttribute(ledEClass, LED__COLOR);

		pushButtonEClass = createEClass(PUSH_BUTTON);

		buzzerEClass = createEClass(BUZZER);

		rotationSensorEClass = createEClass(ROTATION_SENSOR);

		microServoEClass = createEClass(MICRO_SERVO);

		infraRedSensorEClass = createEClass(INFRA_RED_SENSOR);

		ambientLightSensorEClass = createEClass(AMBIENT_LIGHT_SENSOR);

		soundSensorEClass = createEClass(SOUND_SENSOR);

		fanEClass = createEClass(FAN);

		musicPlayerEClass = createEClass(MUSIC_PLAYER);

		arduinoModuleEClass = createEClass(ARDUINO_MODULE);

		blockEClass = createEClass(BLOCK);
		createEReference(blockEClass, BLOCK__INSTRUCTIONS);

		arduinoBoardEClass = createEClass(ARDUINO_BOARD);
		createEReference(arduinoBoardEClass, ARDUINO_BOARD__DIGITAL_PINS);
		createEReference(arduinoBoardEClass, ARDUINO_BOARD__ANALOG_PINS);

		arduinoDigitalModuleEClass = createEClass(ARDUINO_DIGITAL_MODULE);

		arduinoAnalogModuleEClass = createEClass(ARDUINO_ANALOG_MODULE);

		booleanVariableRefEClass = createEClass(BOOLEAN_VARIABLE_REF);
		createEReference(booleanVariableRefEClass, BOOLEAN_VARIABLE_REF__VARIABLE);

		arduinoCommunicationModuleEClass = createEClass(ARDUINO_COMMUNICATION_MODULE);

		bluetoothTransceiverEClass = createEClass(BLUETOOTH_TRANSCEIVER);
		createEReference(bluetoothTransceiverEClass, BLUETOOTH_TRANSCEIVER__CONNECTED_TRANSCEIVER);
		createEAttribute(bluetoothTransceiverEClass, BLUETOOTH_TRANSCEIVER__DATA_TO_SEND);
		createEAttribute(bluetoothTransceiverEClass, BLUETOOTH_TRANSCEIVER__DATA_RECEIVED);

		// Create enums
		timeEEnum = createEEnum(TIME);
		binaryIntegerOperatorKindEEnum = createEEnum(BINARY_INTEGER_OPERATOR_KIND);
		binaryBooleanOperatorKindEEnum = createEEnum(BINARY_BOOLEAN_OPERATOR_KIND);
		unaryIntegerOperatorKindEEnum = createEEnum(UNARY_INTEGER_OPERATOR_KIND);
		unaryBooleanOperatorKindEEnum = createEEnum(UNARY_BOOLEAN_OPERATOR_KIND);
		colorEEnum = createEEnum(COLOR);

		// Create data types
		objectEDataType = createEDataType(OBJECT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		boardEClass.getESuperTypes().add(this.getNamedElement());
		moduleEClass.getESuperTypes().add(this.getNamedElement());
		digitalPinEClass.getESuperTypes().add(this.getPin());
		pinEClass.getESuperTypes().add(this.getNamedElement());
		analogPinEClass.getESuperTypes().add(this.getPin());
		sketchEClass.getESuperTypes().add(this.getNamedElement());
		moduleAssignmentEClass.getESuperTypes().add(this.getModuleInstruction());
		moduleAssignmentEClass.getESuperTypes().add(this.getAssignment());
		moduleInstructionEClass.getESuperTypes().add(this.getInstruction());
		controlEClass.getESuperTypes().add(this.getInstruction());
		utilitiesEClass.getESuperTypes().add(this.getInstruction());
		delayEClass.getESuperTypes().add(this.getUtilities());
		repeatEClass.getESuperTypes().add(this.getControl());
		moduleGetEClass.getESuperTypes().add(this.getExpression());
		whileEClass.getESuperTypes().add(this.getControl());
		binaryExpressionEClass.getESuperTypes().add(this.getExpression());
		variableEClass.getESuperTypes().add(this.getNamedElement());
		variableAssignmentEClass.getESuperTypes().add(this.getInstruction());
		variableAssignmentEClass.getESuperTypes().add(this.getAssignment());
		binaryIntegerExpressionEClass.getESuperTypes().add(this.getBinaryExpression());
		binaryIntegerExpressionEClass.getESuperTypes().add(this.getIntegerExpression());
		binaryBooleanExpressionEClass.getESuperTypes().add(this.getBinaryExpression());
		binaryBooleanExpressionEClass.getESuperTypes().add(this.getBooleanExpression());
		constantEClass.getESuperTypes().add(this.getExpression());
		ifEClass.getESuperTypes().add(this.getControl());
		integerConstantEClass.getESuperTypes().add(this.getConstant());
		integerConstantEClass.getESuperTypes().add(this.getIntegerExpression());
		booleanConstantEClass.getESuperTypes().add(this.getConstant());
		booleanConstantEClass.getESuperTypes().add(this.getBooleanExpression());
		booleanExpressionEClass.getESuperTypes().add(this.getExpression());
		integerExpressionEClass.getESuperTypes().add(this.getExpression());
		assignmentEClass.getESuperTypes().add(this.getInstruction());
		integerVariableEClass.getESuperTypes().add(this.getVariable());
		booleanVariableEClass.getESuperTypes().add(this.getVariable());
		booleanModuleGetEClass.getESuperTypes().add(this.getModuleGet());
		booleanModuleGetEClass.getESuperTypes().add(this.getBooleanExpression());
		integerModuleGetEClass.getESuperTypes().add(this.getModuleGet());
		integerModuleGetEClass.getESuperTypes().add(this.getIntegerExpression());
		unaryExpressionEClass.getESuperTypes().add(this.getExpression());
		unaryBooleanExpressionEClass.getESuperTypes().add(this.getUnaryExpression());
		unaryBooleanExpressionEClass.getESuperTypes().add(this.getBooleanExpression());
		unaryIntegerExpressionEClass.getESuperTypes().add(this.getUnaryExpression());
		unaryIntegerExpressionEClass.getESuperTypes().add(this.getIntegerExpression());
		variableDeclarationEClass.getESuperTypes().add(this.getInstruction());
		variableRefEClass.getESuperTypes().add(this.getExpression());
		integerVariableRefEClass.getESuperTypes().add(this.getVariableRef());
		integerVariableRefEClass.getESuperTypes().add(this.getIntegerExpression());
		ledEClass.getESuperTypes().add(this.getArduinoDigitalModule());
		pushButtonEClass.getESuperTypes().add(this.getArduinoDigitalModule());
		buzzerEClass.getESuperTypes().add(this.getArduinoDigitalModule());
		rotationSensorEClass.getESuperTypes().add(this.getArduinoAnalogModule());
		microServoEClass.getESuperTypes().add(this.getArduinoDigitalModule());
		infraRedSensorEClass.getESuperTypes().add(this.getArduinoDigitalModule());
		ambientLightSensorEClass.getESuperTypes().add(this.getArduinoAnalogModule());
		soundSensorEClass.getESuperTypes().add(this.getArduinoAnalogModule());
		fanEClass.getESuperTypes().add(this.getArduinoDigitalModule());
		musicPlayerEClass.getESuperTypes().add(this.getArduinoAnalogModule());
		arduinoModuleEClass.getESuperTypes().add(this.getModule());
		arduinoBoardEClass.getESuperTypes().add(this.getBoard());
		arduinoDigitalModuleEClass.getESuperTypes().add(this.getArduinoModule());
		arduinoAnalogModuleEClass.getESuperTypes().add(this.getArduinoModule());
		booleanVariableRefEClass.getESuperTypes().add(this.getVariableRef());
		booleanVariableRefEClass.getESuperTypes().add(this.getBooleanExpression());
		arduinoCommunicationModuleEClass.getESuperTypes().add(this.getArduinoDigitalModule());
		bluetoothTransceiverEClass.getESuperTypes().add(this.getArduinoAnalogModule());

		// Initialize classes and features; add operations and parameters
		initEClass(boardEClass, Board.class, "Board", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBoard_Project(), this.getProject(), this.getProject_Boards(), "project", null, 1, 1, Board.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(moduleEClass, Module.class, "Module", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(digitalPinEClass, DigitalPin.class, "DigitalPin", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDigitalPin_Module(), this.getArduinoDigitalModule(), null, "module", null, 0, 1, DigitalPin.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pinEClass, Pin.class, "Pin", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPin_Level(), ecorePackage.getEIntegerObject(), "level", null, 0, 1, Pin.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(analogPinEClass, AnalogPin.class, "AnalogPin", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAnalogPin_Module(), this.getArduinoAnalogModule(), null, "module", null, 0, 1, AnalogPin.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sketchEClass, Sketch.class, "Sketch", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSketch_Project(), this.getProject(), this.getProject_Sketches(), "project", null, 1, 1, Sketch.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSketch_Block(), this.getBlock(), null, "block", null, 0, 1, Sketch.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSketch_Board(), this.getBoard(), null, "board", null, 0, 1, Sketch.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(projectEClass, Project.class, "Project", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProject_Boards(), this.getBoard(), this.getBoard_Project(), "boards", null, 0, -1, Project.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProject_Sketches(), this.getSketch(), this.getSketch_Project(), "sketches", null, 0, -1, Project.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(projectEClass, null, "execute", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(projectEClass, null, "main", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(projectEClass, null, "setup", 0, 1, IS_UNIQUE, IS_ORDERED);

		EOperation op = addEOperation(projectEClass, null, "initializeModel", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "args", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEClass(instructionEClass, Instruction.class, "Instruction", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(instructionEClass, null, "execute", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(instructionEClass, null, "finalize", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(moduleAssignmentEClass, ModuleAssignment.class, "ModuleAssignment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(moduleAssignmentEClass, null, "execute", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(moduleInstructionEClass, ModuleInstruction.class, "ModuleInstruction", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getModuleInstruction_Module(), this.getModule(), null, "module", null, 1, 1, ModuleInstruction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(moduleInstructionEClass, null, "execute", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(controlEClass, Control.class, "Control", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getControl_Block(), this.getBlock(), null, "block", null, 1, 1, Control.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(controlEClass, ecorePackage.getEBooleanObject(), "evaluate", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(controlEClass, null, "execute", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(utilitiesEClass, Utilities.class, "Utilities", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(utilitiesEClass, null, "execute", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(delayEClass, Delay.class, "Delay", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDelay_Unit(), this.getTime(), "unit", null, 0, 1, Delay.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDelay_Value(), ecorePackage.getEInt(), "value", null, 0, 1, Delay.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(delayEClass, null, "execute", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(namedElementEClass, NamedElement.class, "NamedElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNamedElement_Name(), ecorePackage.getEString(), "name", null, 0, 1, NamedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(repeatEClass, Repeat.class, "Repeat", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRepeat_Iteration(), ecorePackage.getEInt(), "iteration", "5", 0, 1, Repeat.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(repeatEClass, null, "execute", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(repeatEClass, ecorePackage.getEBooleanObject(), "evaluate", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(repeatEClass, null, "finalize", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(moduleGetEClass, ModuleGet.class, "ModuleGet", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getModuleGet_Module(), this.getModule(), null, "module", null, 1, 1, ModuleGet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(whileEClass, While.class, "While", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getWhile_Condition(), this.getBooleanExpression(), null, "condition", null, 1, 1, While.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(whileEClass, ecorePackage.getEBooleanObject(), "evaluate", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(whileEClass, null, "execute", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(binaryExpressionEClass, BinaryExpression.class, "BinaryExpression", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBinaryExpression_Left(), this.getExpression(), null, "left", null, 1, 1, BinaryExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBinaryExpression_Right(), this.getExpression(), null, "right", null, 0, 1, BinaryExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(variableEClass, Variable.class, "Variable", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(variableEClass, this.getObject(), "evaluate", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(variableAssignmentEClass, VariableAssignment.class, "VariableAssignment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVariableAssignment_Variable(), this.getVariable(), null, "variable", null, 1, 1, VariableAssignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(variableAssignmentEClass, null, "execute", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(binaryIntegerExpressionEClass, BinaryIntegerExpression.class, "BinaryIntegerExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBinaryIntegerExpression_Operator(), this.getBinaryIntegerOperatorKind(), "operator", null, 0, 1, BinaryIntegerExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(binaryIntegerExpressionEClass, this.getObject(), "evaluate", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(binaryBooleanExpressionEClass, BinaryBooleanExpression.class, "BinaryBooleanExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBinaryBooleanExpression_Operator(), this.getBinaryBooleanOperatorKind(), "operator", null, 0, 1, BinaryBooleanExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(binaryBooleanExpressionEClass, this.getObject(), "evaluate", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(expressionEClass, Expression.class, "Expression", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(expressionEClass, this.getObject(), "evaluate", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(constantEClass, Constant.class, "Constant", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(constantEClass, this.getObject(), "evaluate", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(ifEClass, If.class, "If", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIf_Condition(), this.getBooleanExpression(), null, "condition", null, 1, 1, If.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIf_ElseBlock(), this.getBlock(), null, "elseBlock", null, 0, 1, If.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(ifEClass, ecorePackage.getEBooleanObject(), "evaluate", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(ifEClass, null, "execute", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(integerConstantEClass, IntegerConstant.class, "IntegerConstant", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIntegerConstant_Value(), ecorePackage.getEInt(), "value", "0", 0, 1, IntegerConstant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(integerConstantEClass, this.getObject(), "evaluate", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(booleanConstantEClass, BooleanConstant.class, "BooleanConstant", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBooleanConstant_Value(), ecorePackage.getEBoolean(), "value", "false", 0, 1, BooleanConstant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(booleanConstantEClass, this.getObject(), "evaluate", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(booleanExpressionEClass, BooleanExpression.class, "BooleanExpression", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(integerExpressionEClass, IntegerExpression.class, "IntegerExpression", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(assignmentEClass, Assignment.class, "Assignment", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAssignment_Operand(), this.getExpression(), null, "operand", null, 1, 1, Assignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(integerVariableEClass, IntegerVariable.class, "IntegerVariable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIntegerVariable_InitialValue(), ecorePackage.getEInt(), "initialValue", "0", 0, 1, IntegerVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIntegerVariable_Value(), ecorePackage.getEIntegerObject(), "value", null, 0, 1, IntegerVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(integerVariableEClass, this.getObject(), "evaluate", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(booleanVariableEClass, BooleanVariable.class, "BooleanVariable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBooleanVariable_InitialValue(), ecorePackage.getEBoolean(), "initialValue", "false", 0, 1, BooleanVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBooleanVariable_Value(), ecorePackage.getEBooleanObject(), "value", null, 0, 1, BooleanVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(booleanVariableEClass, this.getObject(), "evaluate", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(booleanModuleGetEClass, BooleanModuleGet.class, "BooleanModuleGet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(booleanModuleGetEClass, this.getObject(), "evaluate", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(integerModuleGetEClass, IntegerModuleGet.class, "IntegerModuleGet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(integerModuleGetEClass, this.getObject(), "evaluate", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(unaryExpressionEClass, UnaryExpression.class, "UnaryExpression", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUnaryExpression_Operand(), this.getExpression(), null, "operand", null, 1, 1, UnaryExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(unaryBooleanExpressionEClass, UnaryBooleanExpression.class, "UnaryBooleanExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUnaryBooleanExpression_Operator(), this.getUnaryBooleanOperatorKind(), "operator", null, 0, 1, UnaryBooleanExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(unaryIntegerExpressionEClass, UnaryIntegerExpression.class, "UnaryIntegerExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUnaryIntegerExpression_Operator(), this.getUnaryIntegerOperatorKind(), "operator", null, 0, 1, UnaryIntegerExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(variableDeclarationEClass, VariableDeclaration.class, "VariableDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVariableDeclaration_Variable(), this.getVariable(), null, "variable", null, 1, 1, VariableDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(variableDeclarationEClass, null, "execute", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(variableRefEClass, VariableRef.class, "VariableRef", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(variableRefEClass, this.getObject(), "evaluate", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(integerVariableRefEClass, IntegerVariableRef.class, "IntegerVariableRef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIntegerVariableRef_Variable(), this.getIntegerVariable(), null, "variable", null, 1, 1, IntegerVariableRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ledEClass, org.gemoc.arduino.sequential.arduinomt.arduino.LED.class, "LED", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLED_Color(), this.getColor(), "color", "blue", 1, 1, org.gemoc.arduino.sequential.arduinomt.arduino.LED.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pushButtonEClass, PushButton.class, "PushButton", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(buzzerEClass, Buzzer.class, "Buzzer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(rotationSensorEClass, RotationSensor.class, "RotationSensor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(microServoEClass, MicroServo.class, "MicroServo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(infraRedSensorEClass, InfraRedSensor.class, "InfraRedSensor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(ambientLightSensorEClass, AmbientLightSensor.class, "AmbientLightSensor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(soundSensorEClass, SoundSensor.class, "SoundSensor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(fanEClass, Fan.class, "Fan", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(musicPlayerEClass, MusicPlayer.class, "MusicPlayer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(arduinoModuleEClass, ArduinoModule.class, "ArduinoModule", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(blockEClass, Block.class, "Block", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBlock_Instructions(), this.getInstruction(), null, "instructions", null, 0, -1, Block.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(blockEClass, null, "execute", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(arduinoBoardEClass, ArduinoBoard.class, "ArduinoBoard", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getArduinoBoard_DigitalPins(), this.getDigitalPin(), null, "digitalPins", null, 0, -1, ArduinoBoard.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getArduinoBoard_AnalogPins(), this.getAnalogPin(), null, "analogPins", null, 0, -1, ArduinoBoard.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(arduinoDigitalModuleEClass, ArduinoDigitalModule.class, "ArduinoDigitalModule", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(arduinoAnalogModuleEClass, ArduinoAnalogModule.class, "ArduinoAnalogModule", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(booleanVariableRefEClass, BooleanVariableRef.class, "BooleanVariableRef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBooleanVariableRef_Variable(), this.getBooleanVariable(), null, "variable", null, 1, 1, BooleanVariableRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(arduinoCommunicationModuleEClass, ArduinoCommunicationModule.class, "ArduinoCommunicationModule", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(arduinoCommunicationModuleEClass, null, "push", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(bluetoothTransceiverEClass, BluetoothTransceiver.class, "BluetoothTransceiver", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBluetoothTransceiver_ConnectedTransceiver(), this.getBluetoothTransceiver(), null, "connectedTransceiver", null, 0, -1, BluetoothTransceiver.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBluetoothTransceiver_DataToSend(), ecorePackage.getEIntegerObject(), "dataToSend", null, 0, -1, BluetoothTransceiver.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBluetoothTransceiver_DataReceived(), ecorePackage.getEIntegerObject(), "dataReceived", null, 0, -1, BluetoothTransceiver.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(bluetoothTransceiverEClass, null, "push", 0, 1, IS_UNIQUE, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(timeEEnum, Time.class, "Time");
		addEEnumLiteral(timeEEnum, Time.MILLI_SECOND);
		addEEnumLiteral(timeEEnum, Time.MICRO_SECOND);

		initEEnum(binaryIntegerOperatorKindEEnum, BinaryIntegerOperatorKind.class, "BinaryIntegerOperatorKind");
		addEEnumLiteral(binaryIntegerOperatorKindEEnum, BinaryIntegerOperatorKind.MINUS);
		addEEnumLiteral(binaryIntegerOperatorKindEEnum, BinaryIntegerOperatorKind.PLUS);
		addEEnumLiteral(binaryIntegerOperatorKindEEnum, BinaryIntegerOperatorKind.MUL);
		addEEnumLiteral(binaryIntegerOperatorKindEEnum, BinaryIntegerOperatorKind.DIV);
		addEEnumLiteral(binaryIntegerOperatorKindEEnum, BinaryIntegerOperatorKind.MIN);
		addEEnumLiteral(binaryIntegerOperatorKindEEnum, BinaryIntegerOperatorKind.MAX);
		addEEnumLiteral(binaryIntegerOperatorKindEEnum, BinaryIntegerOperatorKind.POURCENT);

		initEEnum(binaryBooleanOperatorKindEEnum, BinaryBooleanOperatorKind.class, "BinaryBooleanOperatorKind");
		addEEnumLiteral(binaryBooleanOperatorKindEEnum, BinaryBooleanOperatorKind.INF);
		addEEnumLiteral(binaryBooleanOperatorKindEEnum, BinaryBooleanOperatorKind.SUP);
		addEEnumLiteral(binaryBooleanOperatorKindEEnum, BinaryBooleanOperatorKind.INF_OR_EQUAL);
		addEEnumLiteral(binaryBooleanOperatorKindEEnum, BinaryBooleanOperatorKind.SUP_OR_EQUAL);
		addEEnumLiteral(binaryBooleanOperatorKindEEnum, BinaryBooleanOperatorKind.EQUAL);
		addEEnumLiteral(binaryBooleanOperatorKindEEnum, BinaryBooleanOperatorKind.AND);
		addEEnumLiteral(binaryBooleanOperatorKindEEnum, BinaryBooleanOperatorKind.OR);
		addEEnumLiteral(binaryBooleanOperatorKindEEnum, BinaryBooleanOperatorKind.DIFFERENT);

		initEEnum(unaryIntegerOperatorKindEEnum, UnaryIntegerOperatorKind.class, "UnaryIntegerOperatorKind");
		addEEnumLiteral(unaryIntegerOperatorKindEEnum, UnaryIntegerOperatorKind.MINUS);
		addEEnumLiteral(unaryIntegerOperatorKindEEnum, UnaryIntegerOperatorKind.SQUARE_ROOT);

		initEEnum(unaryBooleanOperatorKindEEnum, UnaryBooleanOperatorKind.class, "UnaryBooleanOperatorKind");
		addEEnumLiteral(unaryBooleanOperatorKindEEnum, UnaryBooleanOperatorKind.NOT);

		initEEnum(colorEEnum, Color.class, "Color");
		addEEnumLiteral(colorEEnum, Color.BLUE);
		addEEnumLiteral(colorEEnum, Color.RED);
		addEEnumLiteral(colorEEnum, Color.WHITE);

		// Initialize data types
		initEDataType(objectEDataType, Object.class, "Object", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// aspect
		createAspectAnnotations();
	}

	/**
	 * Initializes the annotations for <b>aspect</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createAspectAnnotations() {
		String source = "aspect";	
		addAnnotation
		  (getPin_Level(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (projectEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (projectEClass.getEOperations().get(1), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (projectEClass.getEOperations().get(2), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (projectEClass.getEOperations().get(3), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (instructionEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (instructionEClass.getEOperations().get(1), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (moduleAssignmentEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (moduleInstructionEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (controlEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (controlEClass.getEOperations().get(1), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (utilitiesEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (delayEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (repeatEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (repeatEClass.getEOperations().get(1), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (repeatEClass.getEOperations().get(2), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (whileEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (whileEClass.getEOperations().get(1), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (variableEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (variableAssignmentEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (binaryIntegerExpressionEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (binaryBooleanExpressionEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (expressionEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (constantEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (ifEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (ifEClass.getEOperations().get(1), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (integerConstantEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (booleanConstantEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (integerVariableEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getIntegerVariable_Value(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (booleanVariableEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getBooleanVariable_Value(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (booleanModuleGetEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (integerModuleGetEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (variableDeclarationEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (variableRefEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (blockEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (arduinoCommunicationModuleEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (bluetoothTransceiverEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getBluetoothTransceiver_DataToSend(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getBluetoothTransceiver_DataReceived(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (objectEDataType, 
		   source, 
		   new String[] {
		   });
	}

} //ArduinoPackageImpl
