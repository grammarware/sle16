/**
 */
package org.gemoc.arduino.sequential.execarduino.arduino;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.gemoc.arduino.sequential.execarduino.arduino.ArduinoFactory
 * @model kind="package"
 * @generated
 */
public interface ArduinoPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "arduino";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://execarduino/";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "arduino";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ArduinoPackage eINSTANCE = org.gemoc.arduino.sequential.execarduino.arduino.impl.ArduinoPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.gemoc.arduino.sequential.execarduino.arduino.impl.NamedElementImpl <em>Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.arduino.sequential.execarduino.arduino.impl.NamedElementImpl
	 * @see org.gemoc.arduino.sequential.execarduino.arduino.impl.ArduinoPackageImpl#getNamedElement()
	 * @generated
	 */
	int NAMED_ELEMENT = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__NAME = 0;

	/**
	 * The number of structural features of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.gemoc.arduino.sequential.execarduino.arduino.impl.BoardImpl <em>Board</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.arduino.sequential.execarduino.arduino.impl.BoardImpl
	 * @see org.gemoc.arduino.sequential.execarduino.arduino.impl.ArduinoPackageImpl#getBoard()
	 * @generated
	 */
	int BOARD = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOARD__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Project</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOARD__PROJECT = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Board</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOARD_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.gemoc.arduino.sequential.execarduino.arduino.Module <em>Module</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.arduino.sequential.execarduino.arduino.Module
	 * @see org.gemoc.arduino.sequential.execarduino.arduino.impl.ArduinoPackageImpl#getModule()
	 * @generated
	 */
	int MODULE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The number of structural features of the '<em>Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gemoc.arduino.sequential.execarduino.arduino.impl.PinImpl <em>Pin</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.arduino.sequential.execarduino.arduino.impl.PinImpl
	 * @see org.gemoc.arduino.sequential.execarduino.arduino.impl.ArduinoPackageImpl#getPin()
	 * @generated
	 */
	int PIN = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIN__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIN__LEVEL = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Pin</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIN_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.gemoc.arduino.sequential.execarduino.arduino.impl.DigitalPinImpl <em>Digital Pin</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.arduino.sequential.execarduino.arduino.impl.DigitalPinImpl
	 * @see org.gemoc.arduino.sequential.execarduino.arduino.impl.ArduinoPackageImpl#getDigitalPin()
	 * @generated
	 */
	int DIGITAL_PIN = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIGITAL_PIN__NAME = PIN__NAME;

	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIGITAL_PIN__LEVEL = PIN__LEVEL;

	/**
	 * The feature id for the '<em><b>Module</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIGITAL_PIN__MODULE = PIN_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Digital Pin</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIGITAL_PIN_FEATURE_COUNT = PIN_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.gemoc.arduino.sequential.execarduino.arduino.impl.AnalogPinImpl <em>Analog Pin</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.arduino.sequential.execarduino.arduino.impl.AnalogPinImpl
	 * @see org.gemoc.arduino.sequential.execarduino.arduino.impl.ArduinoPackageImpl#getAnalogPin()
	 * @generated
	 */
	int ANALOG_PIN = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALOG_PIN__NAME = PIN__NAME;

	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALOG_PIN__LEVEL = PIN__LEVEL;

	/**
	 * The feature id for the '<em><b>Module</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALOG_PIN__MODULE = PIN_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Analog Pin</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALOG_PIN_FEATURE_COUNT = PIN_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.gemoc.arduino.sequential.execarduino.arduino.impl.SketchImpl <em>Sketch</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.arduino.sequential.execarduino.arduino.impl.SketchImpl
	 * @see org.gemoc.arduino.sequential.execarduino.arduino.impl.ArduinoPackageImpl#getSketch()
	 * @generated
	 */
	int SKETCH = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKETCH__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Project</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKETCH__PROJECT = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Block</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKETCH__BLOCK = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Board</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKETCH__BOARD = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Sketch</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKETCH_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.gemoc.arduino.sequential.execarduino.arduino.impl.ProjectImpl <em>Project</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.arduino.sequential.execarduino.arduino.impl.ProjectImpl
	 * @see org.gemoc.arduino.sequential.execarduino.arduino.impl.ArduinoPackageImpl#getProject()
	 * @generated
	 */
	int PROJECT = 6;

	/**
	 * The feature id for the '<em><b>Boards</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__BOARDS = 0;

	/**
	 * The feature id for the '<em><b>Sketches</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__SKETCHES = 1;

	/**
	 * The number of structural features of the '<em>Project</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.gemoc.arduino.sequential.execarduino.arduino.impl.InstructionImpl <em>Instruction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.arduino.sequential.execarduino.arduino.impl.InstructionImpl
	 * @see org.gemoc.arduino.sequential.execarduino.arduino.impl.ArduinoPackageImpl#getInstruction()
	 * @generated
	 */
	int INSTRUCTION = 7;

	/**
	 * The number of structural features of the '<em>Instruction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTION_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.gemoc.arduino.sequential.execarduino.arduino.impl.ModuleInstructionImpl <em>Module Instruction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.arduino.sequential.execarduino.arduino.impl.ModuleInstructionImpl
	 * @see org.gemoc.arduino.sequential.execarduino.arduino.impl.ArduinoPackageImpl#getModuleInstruction()
	 * @generated
	 */
	int MODULE_INSTRUCTION = 9;

	/**
	 * The feature id for the '<em><b>Module</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_INSTRUCTION__MODULE = INSTRUCTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Module Instruction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_INSTRUCTION_FEATURE_COUNT = INSTRUCTION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.gemoc.arduino.sequential.execarduino.arduino.impl.ModuleAssignmentImpl <em>Module Assignment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.arduino.sequential.execarduino.arduino.impl.ModuleAssignmentImpl
	 * @see org.gemoc.arduino.sequential.execarduino.arduino.impl.ArduinoPackageImpl#getModuleAssignment()
	 * @generated
	 */
	int MODULE_ASSIGNMENT = 8;

	/**
	 * The feature id for the '<em><b>Module</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_ASSIGNMENT__MODULE = MODULE_INSTRUCTION__MODULE;

	/**
	 * The feature id for the '<em><b>Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_ASSIGNMENT__OPERAND = MODULE_INSTRUCTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Module Assignment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_ASSIGNMENT_FEATURE_COUNT = MODULE_INSTRUCTION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.gemoc.arduino.sequential.execarduino.arduino.impl.ControlImpl <em>Control</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.arduino.sequential.execarduino.arduino.impl.ControlImpl
	 * @see org.gemoc.arduino.sequential.execarduino.arduino.impl.ArduinoPackageImpl#getControl()
	 * @generated
	 */
	int CONTROL = 10;

	/**
	 * The feature id for the '<em><b>Block</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL__BLOCK = INSTRUCTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Control</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_FEATURE_COUNT = INSTRUCTION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.gemoc.arduino.sequential.execarduino.arduino.impl.UtilitiesImpl <em>Utilities</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.arduino.sequential.execarduino.arduino.impl.UtilitiesImpl
	 * @see org.gemoc.arduino.sequential.execarduino.arduino.impl.ArduinoPackageImpl#getUtilities()
	 * @generated
	 */
	int UTILITIES = 11;

	/**
	 * The number of structural features of the '<em>Utilities</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UTILITIES_FEATURE_COUNT = INSTRUCTION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gemoc.arduino.sequential.execarduino.arduino.impl.DelayImpl <em>Delay</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.arduino.sequential.execarduino.arduino.impl.DelayImpl
	 * @see org.gemoc.arduino.sequential.execarduino.arduino.impl.ArduinoPackageImpl#getDelay()
	 * @generated
	 */
	int DELAY = 12;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELAY__UNIT = UTILITIES_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELAY__VALUE = UTILITIES_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Delay</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELAY_FEATURE_COUNT = UTILITIES_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.gemoc.arduino.sequential.execarduino.arduino.impl.RepeatImpl <em>Repeat</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.arduino.sequential.execarduino.arduino.impl.RepeatImpl
	 * @see org.gemoc.arduino.sequential.execarduino.arduino.impl.ArduinoPackageImpl#getRepeat()
	 * @generated
	 */
	int REPEAT = 14;

	/**
	 * The feature id for the '<em><b>Block</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPEAT__BLOCK = CONTROL__BLOCK;

	/**
	 * The feature id for the '<em><b>Iteration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPEAT__ITERATION = CONTROL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Repeat</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPEAT_FEATURE_COUNT = CONTROL_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.gemoc.arduino.sequential.execarduino.arduino.impl.ExpressionImpl <em>Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.arduino.sequential.execarduino.arduino.impl.ExpressionImpl
	 * @see org.gemoc.arduino.sequential.execarduino.arduino.impl.ArduinoPackageImpl#getExpression()
	 * @generated
	 */
	int EXPRESSION = 22;

	/**
	 * The number of structural features of the '<em>Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.gemoc.arduino.sequential.execarduino.arduino.impl.ModuleGetImpl <em>Module Get</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.arduino.sequential.execarduino.arduino.impl.ModuleGetImpl
	 * @see org.gemoc.arduino.sequential.execarduino.arduino.impl.ArduinoPackageImpl#getModuleGet()
	 * @generated
	 */
	int MODULE_GET = 15;

	/**
	 * The feature id for the '<em><b>Module</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_GET__MODULE = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Module Get</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_GET_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.gemoc.arduino.sequential.execarduino.arduino.impl.WhileImpl <em>While</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.arduino.sequential.execarduino.arduino.impl.WhileImpl
	 * @see org.gemoc.arduino.sequential.execarduino.arduino.impl.ArduinoPackageImpl#getWhile()
	 * @generated
	 */
	int WHILE = 16;

	/**
	 * The feature id for the '<em><b>Block</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE__BLOCK = CONTROL__BLOCK;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE__CONDITION = CONTROL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>While</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE_FEATURE_COUNT = CONTROL_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.gemoc.arduino.sequential.execarduino.arduino.impl.BinaryExpressionImpl <em>Binary Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.arduino.sequential.execarduino.arduino.impl.BinaryExpressionImpl
	 * @see org.gemoc.arduino.sequential.execarduino.arduino.impl.ArduinoPackageImpl#getBinaryExpression()
	 * @generated
	 */
	int BINARY_EXPRESSION = 17;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_EXPRESSION__LEFT = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_EXPRESSION__RIGHT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Binary Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.gemoc.arduino.sequential.execarduino.arduino.impl.VariableImpl <em>Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.arduino.sequential.execarduino.arduino.impl.VariableImpl
	 * @see org.gemoc.arduino.sequential.execarduino.arduino.impl.ArduinoPackageImpl#getVariable()
	 * @generated
	 */
	int VARIABLE = 18;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The number of structural features of the '<em>Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gemoc.arduino.sequential.execarduino.arduino.impl.VariableAssignmentImpl <em>Variable Assignment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.arduino.sequential.execarduino.arduino.impl.VariableAssignmentImpl
	 * @see org.gemoc.arduino.sequential.execarduino.arduino.impl.ArduinoPackageImpl#getVariableAssignment()
	 * @generated
	 */
	int VARIABLE_ASSIGNMENT = 19;

	/**
	 * The feature id for the '<em><b>Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_ASSIGNMENT__OPERAND = INSTRUCTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_ASSIGNMENT__VARIABLE = INSTRUCTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Variable Assignment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_ASSIGNMENT_FEATURE_COUNT = INSTRUCTION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.gemoc.arduino.sequential.execarduino.arduino.impl.BinaryIntegerExpressionImpl <em>Binary Integer Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.arduino.sequential.execarduino.arduino.impl.BinaryIntegerExpressionImpl
	 * @see org.gemoc.arduino.sequential.execarduino.arduino.impl.ArduinoPackageImpl#getBinaryIntegerExpression()
	 * @generated
	 */
	int BINARY_INTEGER_EXPRESSION = 20;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_INTEGER_EXPRESSION__LEFT = BINARY_EXPRESSION__LEFT;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_INTEGER_EXPRESSION__RIGHT = BINARY_EXPRESSION__RIGHT;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_INTEGER_EXPRESSION__OPERATOR = BINARY_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Binary Integer Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_INTEGER_EXPRESSION_FEATURE_COUNT = BINARY_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.gemoc.arduino.sequential.execarduino.arduino.impl.BinaryBooleanExpressionImpl <em>Binary Boolean Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.arduino.sequential.execarduino.arduino.impl.BinaryBooleanExpressionImpl
	 * @see org.gemoc.arduino.sequential.execarduino.arduino.impl.ArduinoPackageImpl#getBinaryBooleanExpression()
	 * @generated
	 */
	int BINARY_BOOLEAN_EXPRESSION = 21;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_BOOLEAN_EXPRESSION__LEFT = BINARY_EXPRESSION__LEFT;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_BOOLEAN_EXPRESSION__RIGHT = BINARY_EXPRESSION__RIGHT;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_BOOLEAN_EXPRESSION__OPERATOR = BINARY_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Binary Boolean Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_BOOLEAN_EXPRESSION_FEATURE_COUNT = BINARY_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.gemoc.arduino.sequential.execarduino.arduino.impl.ConstantImpl <em>Constant</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.arduino.sequential.execarduino.arduino.impl.ConstantImpl
	 * @see org.gemoc.arduino.sequential.execarduino.arduino.impl.ArduinoPackageImpl#getConstant()
	 * @generated
	 */
	int CONSTANT = 23;

	/**
	 * The number of structural features of the '<em>Constant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gemoc.arduino.sequential.execarduino.arduino.impl.IfImpl <em>If</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.arduino.sequential.execarduino.arduino.impl.IfImpl
	 * @see org.gemoc.arduino.sequential.execarduino.arduino.impl.ArduinoPackageImpl#getIf()
	 * @generated
	 */
	int IF = 24;

	/**
	 * The feature id for the '<em><b>Block</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF__BLOCK = CONTROL__BLOCK;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF__CONDITION = CONTROL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Else Block</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF__ELSE_BLOCK = CONTROL_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>If</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_FEATURE_COUNT = CONTROL_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.gemoc.arduino.sequential.execarduino.arduino.impl.IntegerConstantImpl <em>Integer Constant</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.arduino.sequential.execarduino.arduino.impl.IntegerConstantImpl
	 * @see org.gemoc.arduino.sequential.execarduino.arduino.impl.ArduinoPackageImpl#getIntegerConstant()
	 * @generated
	 */
	int INTEGER_CONSTANT = 25;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_CONSTANT__VALUE = CONSTANT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Integer Constant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_CONSTANT_FEATURE_COUNT = CONSTANT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.gemoc.arduino.sequential.execarduino.arduino.impl.BooleanConstantImpl <em>Boolean Constant</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.arduino.sequential.execarduino.arduino.impl.BooleanConstantImpl
	 * @see org.gemoc.arduino.sequential.execarduino.arduino.impl.ArduinoPackageImpl#getBooleanConstant()
	 * @generated
	 */
	int BOOLEAN_CONSTANT = 26;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_CONSTANT__VALUE = CONSTANT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Boolean Constant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_CONSTANT_FEATURE_COUNT = CONSTANT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.gemoc.arduino.sequential.execarduino.arduino.impl.BooleanExpressionImpl <em>Boolean Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.arduino.sequential.execarduino.arduino.impl.BooleanExpressionImpl
	 * @see org.gemoc.arduino.sequential.execarduino.arduino.impl.ArduinoPackageImpl#getBooleanExpression()
	 * @generated
	 */
	int BOOLEAN_EXPRESSION = 27;

	/**
	 * The number of structural features of the '<em>Boolean Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gemoc.arduino.sequential.execarduino.arduino.impl.IntegerExpressionImpl <em>Integer Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.arduino.sequential.execarduino.arduino.impl.IntegerExpressionImpl
	 * @see org.gemoc.arduino.sequential.execarduino.arduino.impl.ArduinoPackageImpl#getIntegerExpression()
	 * @generated
	 */
	int INTEGER_EXPRESSION = 28;

	/**
	 * The number of structural features of the '<em>Integer Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gemoc.arduino.sequential.execarduino.arduino.impl.AssignmentImpl <em>Assignment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.arduino.sequential.execarduino.arduino.impl.AssignmentImpl
	 * @see org.gemoc.arduino.sequential.execarduino.arduino.impl.ArduinoPackageImpl#getAssignment()
	 * @generated
	 */
	int ASSIGNMENT = 29;

	/**
	 * The feature id for the '<em><b>Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT__OPERAND = INSTRUCTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Assignment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_FEATURE_COUNT = INSTRUCTION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.gemoc.arduino.sequential.execarduino.arduino.impl.IntegerVariableImpl <em>Integer Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.arduino.sequential.execarduino.arduino.impl.IntegerVariableImpl
	 * @see org.gemoc.arduino.sequential.execarduino.arduino.impl.ArduinoPackageImpl#getIntegerVariable()
	 * @generated
	 */
	int INTEGER_VARIABLE = 30;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_VARIABLE__NAME = VARIABLE__NAME;

	/**
	 * The feature id for the '<em><b>Initial Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_VARIABLE__INITIAL_VALUE = VARIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_VARIABLE__VALUE = VARIABLE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Integer Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_VARIABLE_FEATURE_COUNT = VARIABLE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.gemoc.arduino.sequential.execarduino.arduino.impl.BooleanVariableImpl <em>Boolean Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.arduino.sequential.execarduino.arduino.impl.BooleanVariableImpl
	 * @see org.gemoc.arduino.sequential.execarduino.arduino.impl.ArduinoPackageImpl#getBooleanVariable()
	 * @generated
	 */
	int BOOLEAN_VARIABLE = 31;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_VARIABLE__NAME = VARIABLE__NAME;

	/**
	 * The feature id for the '<em><b>Initial Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_VARIABLE__INITIAL_VALUE = VARIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_VARIABLE__VALUE = VARIABLE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Boolean Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_VARIABLE_FEATURE_COUNT = VARIABLE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.gemoc.arduino.sequential.execarduino.arduino.impl.BooleanModuleGetImpl <em>Boolean Module Get</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.arduino.sequential.execarduino.arduino.impl.BooleanModuleGetImpl
	 * @see org.gemoc.arduino.sequential.execarduino.arduino.impl.ArduinoPackageImpl#getBooleanModuleGet()
	 * @generated
	 */
	int BOOLEAN_MODULE_GET = 32;

	/**
	 * The feature id for the '<em><b>Module</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_MODULE_GET__MODULE = MODULE_GET__MODULE;

	/**
	 * The number of structural features of the '<em>Boolean Module Get</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_MODULE_GET_FEATURE_COUNT = MODULE_GET_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gemoc.arduino.sequential.execarduino.arduino.impl.IntegerModuleGetImpl <em>Integer Module Get</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.arduino.sequential.execarduino.arduino.impl.IntegerModuleGetImpl
	 * @see org.gemoc.arduino.sequential.execarduino.arduino.impl.ArduinoPackageImpl#getIntegerModuleGet()
	 * @generated
	 */
	int INTEGER_MODULE_GET = 33;

	/**
	 * The feature id for the '<em><b>Module</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_MODULE_GET__MODULE = MODULE_GET__MODULE;

	/**
	 * The number of structural features of the '<em>Integer Module Get</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_MODULE_GET_FEATURE_COUNT = MODULE_GET_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gemoc.arduino.sequential.execarduino.arduino.impl.UnaryExpressionImpl <em>Unary Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.arduino.sequential.execarduino.arduino.impl.UnaryExpressionImpl
	 * @see org.gemoc.arduino.sequential.execarduino.arduino.impl.ArduinoPackageImpl#getUnaryExpression()
	 * @generated
	 */
	int UNARY_EXPRESSION = 34;

	/**
	 * The feature id for the '<em><b>Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_EXPRESSION__OPERAND = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Unary Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.gemoc.arduino.sequential.execarduino.arduino.impl.UnaryBooleanExpressionImpl <em>Unary Boolean Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.arduino.sequential.execarduino.arduino.impl.UnaryBooleanExpressionImpl
	 * @see org.gemoc.arduino.sequential.execarduino.arduino.impl.ArduinoPackageImpl#getUnaryBooleanExpression()
	 * @generated
	 */
	int UNARY_BOOLEAN_EXPRESSION = 35;

	/**
	 * The feature id for the '<em><b>Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_BOOLEAN_EXPRESSION__OPERAND = UNARY_EXPRESSION__OPERAND;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_BOOLEAN_EXPRESSION__OPERATOR = UNARY_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Unary Boolean Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_BOOLEAN_EXPRESSION_FEATURE_COUNT = UNARY_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.gemoc.arduino.sequential.execarduino.arduino.impl.UnaryIntegerExpressionImpl <em>Unary Integer Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.arduino.sequential.execarduino.arduino.impl.UnaryIntegerExpressionImpl
	 * @see org.gemoc.arduino.sequential.execarduino.arduino.impl.ArduinoPackageImpl#getUnaryIntegerExpression()
	 * @generated
	 */
	int UNARY_INTEGER_EXPRESSION = 36;

	/**
	 * The feature id for the '<em><b>Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_INTEGER_EXPRESSION__OPERAND = UNARY_EXPRESSION__OPERAND;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_INTEGER_EXPRESSION__OPERATOR = UNARY_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Unary Integer Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_INTEGER_EXPRESSION_FEATURE_COUNT = UNARY_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.gemoc.arduino.sequential.execarduino.arduino.impl.VariableDeclarationImpl <em>Variable Declaration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.arduino.sequential.execarduino.arduino.impl.VariableDeclarationImpl
	 * @see org.gemoc.arduino.sequential.execarduino.arduino.impl.ArduinoPackageImpl#getVariableDeclaration()
	 * @generated
	 */
	int VARIABLE_DECLARATION = 37;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DECLARATION__VARIABLE = INSTRUCTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Variable Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DECLARATION_FEATURE_COUNT = INSTRUCTION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.gemoc.arduino.sequential.execarduino.arduino.impl.VariableRefImpl <em>Variable Ref</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.arduino.sequential.execarduino.arduino.impl.VariableRefImpl
	 * @see org.gemoc.arduino.sequential.execarduino.arduino.impl.ArduinoPackageImpl#getVariableRef()
	 * @generated
	 */
	int VARIABLE_REF = 38;

	/**
	 * The number of structural features of the '<em>Variable Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_REF_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gemoc.arduino.sequential.execarduino.arduino.impl.IntegerVariableRefImpl <em>Integer Variable Ref</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.arduino.sequential.execarduino.arduino.impl.IntegerVariableRefImpl
	 * @see org.gemoc.arduino.sequential.execarduino.arduino.impl.ArduinoPackageImpl#getIntegerVariableRef()
	 * @generated
	 */
	int INTEGER_VARIABLE_REF = 39;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_VARIABLE_REF__VARIABLE = VARIABLE_REF_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Integer Variable Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_VARIABLE_REF_FEATURE_COUNT = VARIABLE_REF_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.gemoc.arduino.sequential.execarduino.arduino.impl.ArduinoModuleImpl <em>Module</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.arduino.sequential.execarduino.arduino.impl.ArduinoModuleImpl
	 * @see org.gemoc.arduino.sequential.execarduino.arduino.impl.ArduinoPackageImpl#getArduinoModule()
	 * @generated
	 */
	int ARDUINO_MODULE = 50;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_MODULE__NAME = MODULE__NAME;

	/**
	 * The number of structural features of the '<em>Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_MODULE_FEATURE_COUNT = MODULE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gemoc.arduino.sequential.execarduino.arduino.impl.ArduinoDigitalModuleImpl <em>Digital Module</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.arduino.sequential.execarduino.arduino.impl.ArduinoDigitalModuleImpl
	 * @see org.gemoc.arduino.sequential.execarduino.arduino.impl.ArduinoPackageImpl#getArduinoDigitalModule()
	 * @generated
	 */
	int ARDUINO_DIGITAL_MODULE = 53;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_DIGITAL_MODULE__NAME = ARDUINO_MODULE__NAME;

	/**
	 * The number of structural features of the '<em>Digital Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_DIGITAL_MODULE_FEATURE_COUNT = ARDUINO_MODULE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gemoc.arduino.sequential.execarduino.arduino.impl.LEDImpl <em>LED</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.arduino.sequential.execarduino.arduino.impl.LEDImpl
	 * @see org.gemoc.arduino.sequential.execarduino.arduino.impl.ArduinoPackageImpl#getLED()
	 * @generated
	 */
	int LED = 40;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LED__NAME = ARDUINO_DIGITAL_MODULE__NAME;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LED__COLOR = ARDUINO_DIGITAL_MODULE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>LED</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LED_FEATURE_COUNT = ARDUINO_DIGITAL_MODULE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.gemoc.arduino.sequential.execarduino.arduino.impl.PushButtonImpl <em>Push Button</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.arduino.sequential.execarduino.arduino.impl.PushButtonImpl
	 * @see org.gemoc.arduino.sequential.execarduino.arduino.impl.ArduinoPackageImpl#getPushButton()
	 * @generated
	 */
	int PUSH_BUTTON = 41;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUSH_BUTTON__NAME = ARDUINO_DIGITAL_MODULE__NAME;

	/**
	 * The number of structural features of the '<em>Push Button</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUSH_BUTTON_FEATURE_COUNT = ARDUINO_DIGITAL_MODULE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gemoc.arduino.sequential.execarduino.arduino.impl.BuzzerImpl <em>Buzzer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.arduino.sequential.execarduino.arduino.impl.BuzzerImpl
	 * @see org.gemoc.arduino.sequential.execarduino.arduino.impl.ArduinoPackageImpl#getBuzzer()
	 * @generated
	 */
	int BUZZER = 42;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUZZER__NAME = ARDUINO_DIGITAL_MODULE__NAME;

	/**
	 * The number of structural features of the '<em>Buzzer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUZZER_FEATURE_COUNT = ARDUINO_DIGITAL_MODULE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gemoc.arduino.sequential.execarduino.arduino.impl.ArduinoAnalogModuleImpl <em>Analog Module</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.arduino.sequential.execarduino.arduino.impl.ArduinoAnalogModuleImpl
	 * @see org.gemoc.arduino.sequential.execarduino.arduino.impl.ArduinoPackageImpl#getArduinoAnalogModule()
	 * @generated
	 */
	int ARDUINO_ANALOG_MODULE = 54;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_ANALOG_MODULE__NAME = ARDUINO_MODULE__NAME;

	/**
	 * The number of structural features of the '<em>Analog Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_ANALOG_MODULE_FEATURE_COUNT = ARDUINO_MODULE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gemoc.arduino.sequential.execarduino.arduino.impl.RotationSensorImpl <em>Rotation Sensor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.arduino.sequential.execarduino.arduino.impl.RotationSensorImpl
	 * @see org.gemoc.arduino.sequential.execarduino.arduino.impl.ArduinoPackageImpl#getRotationSensor()
	 * @generated
	 */
	int ROTATION_SENSOR = 43;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROTATION_SENSOR__NAME = ARDUINO_ANALOG_MODULE__NAME;

	/**
	 * The number of structural features of the '<em>Rotation Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROTATION_SENSOR_FEATURE_COUNT = ARDUINO_ANALOG_MODULE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gemoc.arduino.sequential.execarduino.arduino.impl.MicroServoImpl <em>Micro Servo</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.arduino.sequential.execarduino.arduino.impl.MicroServoImpl
	 * @see org.gemoc.arduino.sequential.execarduino.arduino.impl.ArduinoPackageImpl#getMicroServo()
	 * @generated
	 */
	int MICRO_SERVO = 44;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICRO_SERVO__NAME = ARDUINO_DIGITAL_MODULE__NAME;

	/**
	 * The number of structural features of the '<em>Micro Servo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICRO_SERVO_FEATURE_COUNT = ARDUINO_DIGITAL_MODULE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gemoc.arduino.sequential.execarduino.arduino.impl.InfraRedSensorImpl <em>Infra Red Sensor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.arduino.sequential.execarduino.arduino.impl.InfraRedSensorImpl
	 * @see org.gemoc.arduino.sequential.execarduino.arduino.impl.ArduinoPackageImpl#getInfraRedSensor()
	 * @generated
	 */
	int INFRA_RED_SENSOR = 45;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFRA_RED_SENSOR__NAME = ARDUINO_DIGITAL_MODULE__NAME;

	/**
	 * The number of structural features of the '<em>Infra Red Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFRA_RED_SENSOR_FEATURE_COUNT = ARDUINO_DIGITAL_MODULE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gemoc.arduino.sequential.execarduino.arduino.impl.AmbientLightSensorImpl <em>Ambient Light Sensor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.arduino.sequential.execarduino.arduino.impl.AmbientLightSensorImpl
	 * @see org.gemoc.arduino.sequential.execarduino.arduino.impl.ArduinoPackageImpl#getAmbientLightSensor()
	 * @generated
	 */
	int AMBIENT_LIGHT_SENSOR = 46;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMBIENT_LIGHT_SENSOR__NAME = ARDUINO_ANALOG_MODULE__NAME;

	/**
	 * The number of structural features of the '<em>Ambient Light Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMBIENT_LIGHT_SENSOR_FEATURE_COUNT = ARDUINO_ANALOG_MODULE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gemoc.arduino.sequential.execarduino.arduino.impl.SoundSensorImpl <em>Sound Sensor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.arduino.sequential.execarduino.arduino.impl.SoundSensorImpl
	 * @see org.gemoc.arduino.sequential.execarduino.arduino.impl.ArduinoPackageImpl#getSoundSensor()
	 * @generated
	 */
	int SOUND_SENSOR = 47;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOUND_SENSOR__NAME = ARDUINO_ANALOG_MODULE__NAME;

	/**
	 * The number of structural features of the '<em>Sound Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOUND_SENSOR_FEATURE_COUNT = ARDUINO_ANALOG_MODULE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gemoc.arduino.sequential.execarduino.arduino.impl.FanImpl <em>Fan</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.arduino.sequential.execarduino.arduino.impl.FanImpl
	 * @see org.gemoc.arduino.sequential.execarduino.arduino.impl.ArduinoPackageImpl#getFan()
	 * @generated
	 */
	int FAN = 48;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAN__NAME = ARDUINO_DIGITAL_MODULE__NAME;

	/**
	 * The number of structural features of the '<em>Fan</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAN_FEATURE_COUNT = ARDUINO_DIGITAL_MODULE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gemoc.arduino.sequential.execarduino.arduino.impl.MusicPlayerImpl <em>Music Player</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.arduino.sequential.execarduino.arduino.impl.MusicPlayerImpl
	 * @see org.gemoc.arduino.sequential.execarduino.arduino.impl.ArduinoPackageImpl#getMusicPlayer()
	 * @generated
	 */
	int MUSIC_PLAYER = 49;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUSIC_PLAYER__NAME = ARDUINO_ANALOG_MODULE__NAME;

	/**
	 * The number of structural features of the '<em>Music Player</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUSIC_PLAYER_FEATURE_COUNT = ARDUINO_ANALOG_MODULE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gemoc.arduino.sequential.execarduino.arduino.impl.BlockImpl <em>Block</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.arduino.sequential.execarduino.arduino.impl.BlockImpl
	 * @see org.gemoc.arduino.sequential.execarduino.arduino.impl.ArduinoPackageImpl#getBlock()
	 * @generated
	 */
	int BLOCK = 51;

	/**
	 * The feature id for the '<em><b>Instructions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__INSTRUCTIONS = 0;

	/**
	 * The number of structural features of the '<em>Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.gemoc.arduino.sequential.execarduino.arduino.impl.ArduinoBoardImpl <em>Board</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.arduino.sequential.execarduino.arduino.impl.ArduinoBoardImpl
	 * @see org.gemoc.arduino.sequential.execarduino.arduino.impl.ArduinoPackageImpl#getArduinoBoard()
	 * @generated
	 */
	int ARDUINO_BOARD = 52;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_BOARD__NAME = BOARD__NAME;

	/**
	 * The feature id for the '<em><b>Project</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_BOARD__PROJECT = BOARD__PROJECT;

	/**
	 * The feature id for the '<em><b>Digital Pins</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_BOARD__DIGITAL_PINS = BOARD_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Analog Pins</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_BOARD__ANALOG_PINS = BOARD_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Board</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_BOARD_FEATURE_COUNT = BOARD_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.gemoc.arduino.sequential.execarduino.arduino.impl.BooleanVariableRefImpl <em>Boolean Variable Ref</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.arduino.sequential.execarduino.arduino.impl.BooleanVariableRefImpl
	 * @see org.gemoc.arduino.sequential.execarduino.arduino.impl.ArduinoPackageImpl#getBooleanVariableRef()
	 * @generated
	 */
	int BOOLEAN_VARIABLE_REF = 55;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_VARIABLE_REF__VARIABLE = VARIABLE_REF_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Boolean Variable Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_VARIABLE_REF_FEATURE_COUNT = VARIABLE_REF_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.gemoc.arduino.sequential.execarduino.arduino.impl.ArduinoCommunicationModuleImpl <em>Communication Module</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.arduino.sequential.execarduino.arduino.impl.ArduinoCommunicationModuleImpl
	 * @see org.gemoc.arduino.sequential.execarduino.arduino.impl.ArduinoPackageImpl#getArduinoCommunicationModule()
	 * @generated
	 */
	int ARDUINO_COMMUNICATION_MODULE = 56;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_COMMUNICATION_MODULE__NAME = ARDUINO_DIGITAL_MODULE__NAME;

	/**
	 * The number of structural features of the '<em>Communication Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_COMMUNICATION_MODULE_FEATURE_COUNT = ARDUINO_DIGITAL_MODULE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gemoc.arduino.sequential.execarduino.arduino.impl.BluetoothTransceiverImpl <em>Bluetooth Transceiver</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.arduino.sequential.execarduino.arduino.impl.BluetoothTransceiverImpl
	 * @see org.gemoc.arduino.sequential.execarduino.arduino.impl.ArduinoPackageImpl#getBluetoothTransceiver()
	 * @generated
	 */
	int BLUETOOTH_TRANSCEIVER = 57;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLUETOOTH_TRANSCEIVER__NAME = ARDUINO_ANALOG_MODULE__NAME;

	/**
	 * The feature id for the '<em><b>Connected Transceiver</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLUETOOTH_TRANSCEIVER__CONNECTED_TRANSCEIVER = ARDUINO_ANALOG_MODULE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Data To Send</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLUETOOTH_TRANSCEIVER__DATA_TO_SEND = ARDUINO_ANALOG_MODULE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Data Received</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLUETOOTH_TRANSCEIVER__DATA_RECEIVED = ARDUINO_ANALOG_MODULE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Bluetooth Transceiver</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLUETOOTH_TRANSCEIVER_FEATURE_COUNT = ARDUINO_ANALOG_MODULE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.gemoc.arduino.sequential.execarduino.arduino.Time <em>Time</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.arduino.sequential.execarduino.arduino.Time
	 * @see org.gemoc.arduino.sequential.execarduino.arduino.impl.ArduinoPackageImpl#getTime()
	 * @generated
	 */
	int TIME = 58;

	/**
	 * The meta object id for the '{@link org.gemoc.arduino.sequential.execarduino.arduino.BinaryIntegerOperatorKind <em>Binary Integer Operator Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.arduino.sequential.execarduino.arduino.BinaryIntegerOperatorKind
	 * @see org.gemoc.arduino.sequential.execarduino.arduino.impl.ArduinoPackageImpl#getBinaryIntegerOperatorKind()
	 * @generated
	 */
	int BINARY_INTEGER_OPERATOR_KIND = 59;

	/**
	 * The meta object id for the '{@link org.gemoc.arduino.sequential.execarduino.arduino.BinaryBooleanOperatorKind <em>Binary Boolean Operator Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.arduino.sequential.execarduino.arduino.BinaryBooleanOperatorKind
	 * @see org.gemoc.arduino.sequential.execarduino.arduino.impl.ArduinoPackageImpl#getBinaryBooleanOperatorKind()
	 * @generated
	 */
	int BINARY_BOOLEAN_OPERATOR_KIND = 60;

	/**
	 * The meta object id for the '{@link org.gemoc.arduino.sequential.execarduino.arduino.UnaryIntegerOperatorKind <em>Unary Integer Operator Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.arduino.sequential.execarduino.arduino.UnaryIntegerOperatorKind
	 * @see org.gemoc.arduino.sequential.execarduino.arduino.impl.ArduinoPackageImpl#getUnaryIntegerOperatorKind()
	 * @generated
	 */
	int UNARY_INTEGER_OPERATOR_KIND = 61;

	/**
	 * The meta object id for the '{@link org.gemoc.arduino.sequential.execarduino.arduino.UnaryBooleanOperatorKind <em>Unary Boolean Operator Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.arduino.sequential.execarduino.arduino.UnaryBooleanOperatorKind
	 * @see org.gemoc.arduino.sequential.execarduino.arduino.impl.ArduinoPackageImpl#getUnaryBooleanOperatorKind()
	 * @generated
	 */
	int UNARY_BOOLEAN_OPERATOR_KIND = 62;

	/**
	 * The meta object id for the '{@link org.gemoc.arduino.sequential.execarduino.arduino.Color <em>Color</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.arduino.sequential.execarduino.arduino.Color
	 * @see org.gemoc.arduino.sequential.execarduino.arduino.impl.ArduinoPackageImpl#getColor()
	 * @generated
	 */
	int COLOR = 63;

	/**
	 * The meta object id for the '<em>Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Object
	 * @see org.gemoc.arduino.sequential.execarduino.arduino.impl.ArduinoPackageImpl#getObject()
	 * @generated
	 */
	int OBJECT = 64;


	/**
	 * Returns the meta object for class '{@link org.gemoc.arduino.sequential.execarduino.arduino.Board <em>Board</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Board</em>'.
	 * @see org.gemoc.arduino.sequential.execarduino.arduino.Board
	 * @generated
	 */
	EClass getBoard();

	/**
	 * Returns the meta object for the container reference '{@link org.gemoc.arduino.sequential.execarduino.arduino.Board#getProject <em>Project</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Project</em>'.
	 * @see org.gemoc.arduino.sequential.execarduino.arduino.Board#getProject()
	 * @see #getBoard()
	 * @generated
	 */
	EReference getBoard_Project();

	/**
	 * Returns the meta object for class '{@link org.gemoc.arduino.sequential.execarduino.arduino.Module <em>Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Module</em>'.
	 * @see org.gemoc.arduino.sequential.execarduino.arduino.Module
	 * @generated
	 */
	EClass getModule();

	/**
	 * Returns the meta object for class '{@link org.gemoc.arduino.sequential.execarduino.arduino.DigitalPin <em>Digital Pin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Digital Pin</em>'.
	 * @see org.gemoc.arduino.sequential.execarduino.arduino.DigitalPin
	 * @generated
	 */
	EClass getDigitalPin();

	/**
	 * Returns the meta object for the containment reference '{@link org.gemoc.arduino.sequential.execarduino.arduino.DigitalPin#getModule <em>Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Module</em>'.
	 * @see org.gemoc.arduino.sequential.execarduino.arduino.DigitalPin#getModule()
	 * @see #getDigitalPin()
	 * @generated
	 */
	EReference getDigitalPin_Module();

	/**
	 * Returns the meta object for class '{@link org.gemoc.arduino.sequential.execarduino.arduino.Pin <em>Pin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pin</em>'.
	 * @see org.gemoc.arduino.sequential.execarduino.arduino.Pin
	 * @generated
	 */
	EClass getPin();

	/**
	 * Returns the meta object for the attribute '{@link org.gemoc.arduino.sequential.execarduino.arduino.Pin#getLevel <em>Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Level</em>'.
	 * @see org.gemoc.arduino.sequential.execarduino.arduino.Pin#getLevel()
	 * @see #getPin()
	 * @generated
	 */
	EAttribute getPin_Level();

	/**
	 * Returns the meta object for class '{@link org.gemoc.arduino.sequential.execarduino.arduino.AnalogPin <em>Analog Pin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Analog Pin</em>'.
	 * @see org.gemoc.arduino.sequential.execarduino.arduino.AnalogPin
	 * @generated
	 */
	EClass getAnalogPin();

	/**
	 * Returns the meta object for the containment reference '{@link org.gemoc.arduino.sequential.execarduino.arduino.AnalogPin#getModule <em>Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Module</em>'.
	 * @see org.gemoc.arduino.sequential.execarduino.arduino.AnalogPin#getModule()
	 * @see #getAnalogPin()
	 * @generated
	 */
	EReference getAnalogPin_Module();

	/**
	 * Returns the meta object for class '{@link org.gemoc.arduino.sequential.execarduino.arduino.Sketch <em>Sketch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sketch</em>'.
	 * @see org.gemoc.arduino.sequential.execarduino.arduino.Sketch
	 * @generated
	 */
	EClass getSketch();

	/**
	 * Returns the meta object for the container reference '{@link org.gemoc.arduino.sequential.execarduino.arduino.Sketch#getProject <em>Project</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Project</em>'.
	 * @see org.gemoc.arduino.sequential.execarduino.arduino.Sketch#getProject()
	 * @see #getSketch()
	 * @generated
	 */
	EReference getSketch_Project();

	/**
	 * Returns the meta object for the containment reference '{@link org.gemoc.arduino.sequential.execarduino.arduino.Sketch#getBlock <em>Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Block</em>'.
	 * @see org.gemoc.arduino.sequential.execarduino.arduino.Sketch#getBlock()
	 * @see #getSketch()
	 * @generated
	 */
	EReference getSketch_Block();

	/**
	 * Returns the meta object for the reference '{@link org.gemoc.arduino.sequential.execarduino.arduino.Sketch#getBoard <em>Board</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Board</em>'.
	 * @see org.gemoc.arduino.sequential.execarduino.arduino.Sketch#getBoard()
	 * @see #getSketch()
	 * @generated
	 */
	EReference getSketch_Board();

	/**
	 * Returns the meta object for class '{@link org.gemoc.arduino.sequential.execarduino.arduino.Project <em>Project</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Project</em>'.
	 * @see org.gemoc.arduino.sequential.execarduino.arduino.Project
	 * @generated
	 */
	EClass getProject();

	/**
	 * Returns the meta object for the containment reference list '{@link org.gemoc.arduino.sequential.execarduino.arduino.Project#getBoards <em>Boards</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Boards</em>'.
	 * @see org.gemoc.arduino.sequential.execarduino.arduino.Project#getBoards()
	 * @see #getProject()
	 * @generated
	 */
	EReference getProject_Boards();

	/**
	 * Returns the meta object for the containment reference list '{@link org.gemoc.arduino.sequential.execarduino.arduino.Project#getSketches <em>Sketches</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sketches</em>'.
	 * @see org.gemoc.arduino.sequential.execarduino.arduino.Project#getSketches()
	 * @see #getProject()
	 * @generated
	 */
	EReference getProject_Sketches();

	/**
	 * Returns the meta object for class '{@link org.gemoc.arduino.sequential.execarduino.arduino.Instruction <em>Instruction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Instruction</em>'.
	 * @see org.gemoc.arduino.sequential.execarduino.arduino.Instruction
	 * @generated
	 */
	EClass getInstruction();

	/**
	 * Returns the meta object for class '{@link org.gemoc.arduino.sequential.execarduino.arduino.ModuleAssignment <em>Module Assignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Module Assignment</em>'.
	 * @see org.gemoc.arduino.sequential.execarduino.arduino.ModuleAssignment
	 * @generated
	 */
	EClass getModuleAssignment();

	/**
	 * Returns the meta object for class '{@link org.gemoc.arduino.sequential.execarduino.arduino.ModuleInstruction <em>Module Instruction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Module Instruction</em>'.
	 * @see org.gemoc.arduino.sequential.execarduino.arduino.ModuleInstruction
	 * @generated
	 */
	EClass getModuleInstruction();

	/**
	 * Returns the meta object for the reference '{@link org.gemoc.arduino.sequential.execarduino.arduino.ModuleInstruction#getModule <em>Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Module</em>'.
	 * @see org.gemoc.arduino.sequential.execarduino.arduino.ModuleInstruction#getModule()
	 * @see #getModuleInstruction()
	 * @generated
	 */
	EReference getModuleInstruction_Module();

	/**
	 * Returns the meta object for class '{@link org.gemoc.arduino.sequential.execarduino.arduino.Control <em>Control</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Control</em>'.
	 * @see org.gemoc.arduino.sequential.execarduino.arduino.Control
	 * @generated
	 */
	EClass getControl();

	/**
	 * Returns the meta object for the containment reference '{@link org.gemoc.arduino.sequential.execarduino.arduino.Control#getBlock <em>Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Block</em>'.
	 * @see org.gemoc.arduino.sequential.execarduino.arduino.Control#getBlock()
	 * @see #getControl()
	 * @generated
	 */
	EReference getControl_Block();

	/**
	 * Returns the meta object for class '{@link org.gemoc.arduino.sequential.execarduino.arduino.Utilities <em>Utilities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Utilities</em>'.
	 * @see org.gemoc.arduino.sequential.execarduino.arduino.Utilities
	 * @generated
	 */
	EClass getUtilities();

	/**
	 * Returns the meta object for class '{@link org.gemoc.arduino.sequential.execarduino.arduino.Delay <em>Delay</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Delay</em>'.
	 * @see org.gemoc.arduino.sequential.execarduino.arduino.Delay
	 * @generated
	 */
	EClass getDelay();

	/**
	 * Returns the meta object for the attribute '{@link org.gemoc.arduino.sequential.execarduino.arduino.Delay#getUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unit</em>'.
	 * @see org.gemoc.arduino.sequential.execarduino.arduino.Delay#getUnit()
	 * @see #getDelay()
	 * @generated
	 */
	EAttribute getDelay_Unit();

	/**
	 * Returns the meta object for the attribute '{@link org.gemoc.arduino.sequential.execarduino.arduino.Delay#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.gemoc.arduino.sequential.execarduino.arduino.Delay#getValue()
	 * @see #getDelay()
	 * @generated
	 */
	EAttribute getDelay_Value();

	/**
	 * Returns the meta object for class '{@link org.gemoc.arduino.sequential.execarduino.arduino.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Element</em>'.
	 * @see org.gemoc.arduino.sequential.execarduino.arduino.NamedElement
	 * @generated
	 */
	EClass getNamedElement();

	/**
	 * Returns the meta object for the attribute '{@link org.gemoc.arduino.sequential.execarduino.arduino.NamedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.gemoc.arduino.sequential.execarduino.arduino.NamedElement#getName()
	 * @see #getNamedElement()
	 * @generated
	 */
	EAttribute getNamedElement_Name();

	/**
	 * Returns the meta object for class '{@link org.gemoc.arduino.sequential.execarduino.arduino.Repeat <em>Repeat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Repeat</em>'.
	 * @see org.gemoc.arduino.sequential.execarduino.arduino.Repeat
	 * @generated
	 */
	EClass getRepeat();

	/**
	 * Returns the meta object for the attribute '{@link org.gemoc.arduino.sequential.execarduino.arduino.Repeat#getIteration <em>Iteration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Iteration</em>'.
	 * @see org.gemoc.arduino.sequential.execarduino.arduino.Repeat#getIteration()
	 * @see #getRepeat()
	 * @generated
	 */
	EAttribute getRepeat_Iteration();

	/**
	 * Returns the meta object for class '{@link org.gemoc.arduino.sequential.execarduino.arduino.ModuleGet <em>Module Get</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Module Get</em>'.
	 * @see org.gemoc.arduino.sequential.execarduino.arduino.ModuleGet
	 * @generated
	 */
	EClass getModuleGet();

	/**
	 * Returns the meta object for the reference '{@link org.gemoc.arduino.sequential.execarduino.arduino.ModuleGet#getModule <em>Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Module</em>'.
	 * @see org.gemoc.arduino.sequential.execarduino.arduino.ModuleGet#getModule()
	 * @see #getModuleGet()
	 * @generated
	 */
	EReference getModuleGet_Module();

	/**
	 * Returns the meta object for class '{@link org.gemoc.arduino.sequential.execarduino.arduino.While <em>While</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>While</em>'.
	 * @see org.gemoc.arduino.sequential.execarduino.arduino.While
	 * @generated
	 */
	EClass getWhile();

	/**
	 * Returns the meta object for the containment reference '{@link org.gemoc.arduino.sequential.execarduino.arduino.While#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Condition</em>'.
	 * @see org.gemoc.arduino.sequential.execarduino.arduino.While#getCondition()
	 * @see #getWhile()
	 * @generated
	 */
	EReference getWhile_Condition();

	/**
	 * Returns the meta object for class '{@link org.gemoc.arduino.sequential.execarduino.arduino.BinaryExpression <em>Binary Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Binary Expression</em>'.
	 * @see org.gemoc.arduino.sequential.execarduino.arduino.BinaryExpression
	 * @generated
	 */
	EClass getBinaryExpression();

	/**
	 * Returns the meta object for the containment reference '{@link org.gemoc.arduino.sequential.execarduino.arduino.BinaryExpression#getLeft <em>Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Left</em>'.
	 * @see org.gemoc.arduino.sequential.execarduino.arduino.BinaryExpression#getLeft()
	 * @see #getBinaryExpression()
	 * @generated
	 */
	EReference getBinaryExpression_Left();

	/**
	 * Returns the meta object for the containment reference '{@link org.gemoc.arduino.sequential.execarduino.arduino.BinaryExpression#getRight <em>Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Right</em>'.
	 * @see org.gemoc.arduino.sequential.execarduino.arduino.BinaryExpression#getRight()
	 * @see #getBinaryExpression()
	 * @generated
	 */
	EReference getBinaryExpression_Right();

	/**
	 * Returns the meta object for class '{@link org.gemoc.arduino.sequential.execarduino.arduino.Variable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable</em>'.
	 * @see org.gemoc.arduino.sequential.execarduino.arduino.Variable
	 * @generated
	 */
	EClass getVariable();

	/**
	 * Returns the meta object for class '{@link org.gemoc.arduino.sequential.execarduino.arduino.VariableAssignment <em>Variable Assignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable Assignment</em>'.
	 * @see org.gemoc.arduino.sequential.execarduino.arduino.VariableAssignment
	 * @generated
	 */
	EClass getVariableAssignment();

	/**
	 * Returns the meta object for the reference '{@link org.gemoc.arduino.sequential.execarduino.arduino.VariableAssignment#getVariable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Variable</em>'.
	 * @see org.gemoc.arduino.sequential.execarduino.arduino.VariableAssignment#getVariable()
	 * @see #getVariableAssignment()
	 * @generated
	 */
	EReference getVariableAssignment_Variable();

	/**
	 * Returns the meta object for class '{@link org.gemoc.arduino.sequential.execarduino.arduino.BinaryIntegerExpression <em>Binary Integer Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Binary Integer Expression</em>'.
	 * @see org.gemoc.arduino.sequential.execarduino.arduino.BinaryIntegerExpression
	 * @generated
	 */
	EClass getBinaryIntegerExpression();

	/**
	 * Returns the meta object for the attribute '{@link org.gemoc.arduino.sequential.execarduino.arduino.BinaryIntegerExpression#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operator</em>'.
	 * @see org.gemoc.arduino.sequential.execarduino.arduino.BinaryIntegerExpression#getOperator()
	 * @see #getBinaryIntegerExpression()
	 * @generated
	 */
	EAttribute getBinaryIntegerExpression_Operator();

	/**
	 * Returns the meta object for class '{@link org.gemoc.arduino.sequential.execarduino.arduino.BinaryBooleanExpression <em>Binary Boolean Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Binary Boolean Expression</em>'.
	 * @see org.gemoc.arduino.sequential.execarduino.arduino.BinaryBooleanExpression
	 * @generated
	 */
	EClass getBinaryBooleanExpression();

	/**
	 * Returns the meta object for the attribute '{@link org.gemoc.arduino.sequential.execarduino.arduino.BinaryBooleanExpression#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operator</em>'.
	 * @see org.gemoc.arduino.sequential.execarduino.arduino.BinaryBooleanExpression#getOperator()
	 * @see #getBinaryBooleanExpression()
	 * @generated
	 */
	EAttribute getBinaryBooleanExpression_Operator();

	/**
	 * Returns the meta object for class '{@link org.gemoc.arduino.sequential.execarduino.arduino.Expression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression</em>'.
	 * @see org.gemoc.arduino.sequential.execarduino.arduino.Expression
	 * @generated
	 */
	EClass getExpression();

	/**
	 * Returns the meta object for class '{@link org.gemoc.arduino.sequential.execarduino.arduino.Constant <em>Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constant</em>'.
	 * @see org.gemoc.arduino.sequential.execarduino.arduino.Constant
	 * @generated
	 */
	EClass getConstant();

	/**
	 * Returns the meta object for class '{@link org.gemoc.arduino.sequential.execarduino.arduino.If <em>If</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>If</em>'.
	 * @see org.gemoc.arduino.sequential.execarduino.arduino.If
	 * @generated
	 */
	EClass getIf();

	/**
	 * Returns the meta object for the containment reference '{@link org.gemoc.arduino.sequential.execarduino.arduino.If#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Condition</em>'.
	 * @see org.gemoc.arduino.sequential.execarduino.arduino.If#getCondition()
	 * @see #getIf()
	 * @generated
	 */
	EReference getIf_Condition();

	/**
	 * Returns the meta object for the containment reference '{@link org.gemoc.arduino.sequential.execarduino.arduino.If#getElseBlock <em>Else Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Else Block</em>'.
	 * @see org.gemoc.arduino.sequential.execarduino.arduino.If#getElseBlock()
	 * @see #getIf()
	 * @generated
	 */
	EReference getIf_ElseBlock();

	/**
	 * Returns the meta object for class '{@link org.gemoc.arduino.sequential.execarduino.arduino.IntegerConstant <em>Integer Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Integer Constant</em>'.
	 * @see org.gemoc.arduino.sequential.execarduino.arduino.IntegerConstant
	 * @generated
	 */
	EClass getIntegerConstant();

	/**
	 * Returns the meta object for the attribute '{@link org.gemoc.arduino.sequential.execarduino.arduino.IntegerConstant#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.gemoc.arduino.sequential.execarduino.arduino.IntegerConstant#getValue()
	 * @see #getIntegerConstant()
	 * @generated
	 */
	EAttribute getIntegerConstant_Value();

	/**
	 * Returns the meta object for class '{@link org.gemoc.arduino.sequential.execarduino.arduino.BooleanConstant <em>Boolean Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean Constant</em>'.
	 * @see org.gemoc.arduino.sequential.execarduino.arduino.BooleanConstant
	 * @generated
	 */
	EClass getBooleanConstant();

	/**
	 * Returns the meta object for the attribute '{@link org.gemoc.arduino.sequential.execarduino.arduino.BooleanConstant#isValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.gemoc.arduino.sequential.execarduino.arduino.BooleanConstant#isValue()
	 * @see #getBooleanConstant()
	 * @generated
	 */
	EAttribute getBooleanConstant_Value();

	/**
	 * Returns the meta object for class '{@link org.gemoc.arduino.sequential.execarduino.arduino.BooleanExpression <em>Boolean Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean Expression</em>'.
	 * @see org.gemoc.arduino.sequential.execarduino.arduino.BooleanExpression
	 * @generated
	 */
	EClass getBooleanExpression();

	/**
	 * Returns the meta object for class '{@link org.gemoc.arduino.sequential.execarduino.arduino.IntegerExpression <em>Integer Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Integer Expression</em>'.
	 * @see org.gemoc.arduino.sequential.execarduino.arduino.IntegerExpression
	 * @generated
	 */
	EClass getIntegerExpression();

	/**
	 * Returns the meta object for class '{@link org.gemoc.arduino.sequential.execarduino.arduino.Assignment <em>Assignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Assignment</em>'.
	 * @see org.gemoc.arduino.sequential.execarduino.arduino.Assignment
	 * @generated
	 */
	EClass getAssignment();

	/**
	 * Returns the meta object for the containment reference '{@link org.gemoc.arduino.sequential.execarduino.arduino.Assignment#getOperand <em>Operand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Operand</em>'.
	 * @see org.gemoc.arduino.sequential.execarduino.arduino.Assignment#getOperand()
	 * @see #getAssignment()
	 * @generated
	 */
	EReference getAssignment_Operand();

	/**
	 * Returns the meta object for class '{@link org.gemoc.arduino.sequential.execarduino.arduino.IntegerVariable <em>Integer Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Integer Variable</em>'.
	 * @see org.gemoc.arduino.sequential.execarduino.arduino.IntegerVariable
	 * @generated
	 */
	EClass getIntegerVariable();

	/**
	 * Returns the meta object for the attribute '{@link org.gemoc.arduino.sequential.execarduino.arduino.IntegerVariable#getInitialValue <em>Initial Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Initial Value</em>'.
	 * @see org.gemoc.arduino.sequential.execarduino.arduino.IntegerVariable#getInitialValue()
	 * @see #getIntegerVariable()
	 * @generated
	 */
	EAttribute getIntegerVariable_InitialValue();

	/**
	 * Returns the meta object for the attribute '{@link org.gemoc.arduino.sequential.execarduino.arduino.IntegerVariable#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.gemoc.arduino.sequential.execarduino.arduino.IntegerVariable#getValue()
	 * @see #getIntegerVariable()
	 * @generated
	 */
	EAttribute getIntegerVariable_Value();

	/**
	 * Returns the meta object for class '{@link org.gemoc.arduino.sequential.execarduino.arduino.BooleanVariable <em>Boolean Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean Variable</em>'.
	 * @see org.gemoc.arduino.sequential.execarduino.arduino.BooleanVariable
	 * @generated
	 */
	EClass getBooleanVariable();

	/**
	 * Returns the meta object for the attribute '{@link org.gemoc.arduino.sequential.execarduino.arduino.BooleanVariable#isInitialValue <em>Initial Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Initial Value</em>'.
	 * @see org.gemoc.arduino.sequential.execarduino.arduino.BooleanVariable#isInitialValue()
	 * @see #getBooleanVariable()
	 * @generated
	 */
	EAttribute getBooleanVariable_InitialValue();

	/**
	 * Returns the meta object for the attribute '{@link org.gemoc.arduino.sequential.execarduino.arduino.BooleanVariable#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.gemoc.arduino.sequential.execarduino.arduino.BooleanVariable#getValue()
	 * @see #getBooleanVariable()
	 * @generated
	 */
	EAttribute getBooleanVariable_Value();

	/**
	 * Returns the meta object for class '{@link org.gemoc.arduino.sequential.execarduino.arduino.BooleanModuleGet <em>Boolean Module Get</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean Module Get</em>'.
	 * @see org.gemoc.arduino.sequential.execarduino.arduino.BooleanModuleGet
	 * @generated
	 */
	EClass getBooleanModuleGet();

	/**
	 * Returns the meta object for class '{@link org.gemoc.arduino.sequential.execarduino.arduino.IntegerModuleGet <em>Integer Module Get</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Integer Module Get</em>'.
	 * @see org.gemoc.arduino.sequential.execarduino.arduino.IntegerModuleGet
	 * @generated
	 */
	EClass getIntegerModuleGet();

	/**
	 * Returns the meta object for class '{@link org.gemoc.arduino.sequential.execarduino.arduino.UnaryExpression <em>Unary Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unary Expression</em>'.
	 * @see org.gemoc.arduino.sequential.execarduino.arduino.UnaryExpression
	 * @generated
	 */
	EClass getUnaryExpression();

	/**
	 * Returns the meta object for the containment reference '{@link org.gemoc.arduino.sequential.execarduino.arduino.UnaryExpression#getOperand <em>Operand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Operand</em>'.
	 * @see org.gemoc.arduino.sequential.execarduino.arduino.UnaryExpression#getOperand()
	 * @see #getUnaryExpression()
	 * @generated
	 */
	EReference getUnaryExpression_Operand();

	/**
	 * Returns the meta object for class '{@link org.gemoc.arduino.sequential.execarduino.arduino.UnaryBooleanExpression <em>Unary Boolean Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unary Boolean Expression</em>'.
	 * @see org.gemoc.arduino.sequential.execarduino.arduino.UnaryBooleanExpression
	 * @generated
	 */
	EClass getUnaryBooleanExpression();

	/**
	 * Returns the meta object for the attribute '{@link org.gemoc.arduino.sequential.execarduino.arduino.UnaryBooleanExpression#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operator</em>'.
	 * @see org.gemoc.arduino.sequential.execarduino.arduino.UnaryBooleanExpression#getOperator()
	 * @see #getUnaryBooleanExpression()
	 * @generated
	 */
	EAttribute getUnaryBooleanExpression_Operator();

	/**
	 * Returns the meta object for class '{@link org.gemoc.arduino.sequential.execarduino.arduino.UnaryIntegerExpression <em>Unary Integer Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unary Integer Expression</em>'.
	 * @see org.gemoc.arduino.sequential.execarduino.arduino.UnaryIntegerExpression
	 * @generated
	 */
	EClass getUnaryIntegerExpression();

	/**
	 * Returns the meta object for the attribute '{@link org.gemoc.arduino.sequential.execarduino.arduino.UnaryIntegerExpression#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operator</em>'.
	 * @see org.gemoc.arduino.sequential.execarduino.arduino.UnaryIntegerExpression#getOperator()
	 * @see #getUnaryIntegerExpression()
	 * @generated
	 */
	EAttribute getUnaryIntegerExpression_Operator();

	/**
	 * Returns the meta object for class '{@link org.gemoc.arduino.sequential.execarduino.arduino.VariableDeclaration <em>Variable Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable Declaration</em>'.
	 * @see org.gemoc.arduino.sequential.execarduino.arduino.VariableDeclaration
	 * @generated
	 */
	EClass getVariableDeclaration();

	/**
	 * Returns the meta object for the containment reference '{@link org.gemoc.arduino.sequential.execarduino.arduino.VariableDeclaration#getVariable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Variable</em>'.
	 * @see org.gemoc.arduino.sequential.execarduino.arduino.VariableDeclaration#getVariable()
	 * @see #getVariableDeclaration()
	 * @generated
	 */
	EReference getVariableDeclaration_Variable();

	/**
	 * Returns the meta object for class '{@link org.gemoc.arduino.sequential.execarduino.arduino.VariableRef <em>Variable Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable Ref</em>'.
	 * @see org.gemoc.arduino.sequential.execarduino.arduino.VariableRef
	 * @generated
	 */
	EClass getVariableRef();

	/**
	 * Returns the meta object for class '{@link org.gemoc.arduino.sequential.execarduino.arduino.IntegerVariableRef <em>Integer Variable Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Integer Variable Ref</em>'.
	 * @see org.gemoc.arduino.sequential.execarduino.arduino.IntegerVariableRef
	 * @generated
	 */
	EClass getIntegerVariableRef();

	/**
	 * Returns the meta object for the reference '{@link org.gemoc.arduino.sequential.execarduino.arduino.IntegerVariableRef#getVariable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Variable</em>'.
	 * @see org.gemoc.arduino.sequential.execarduino.arduino.IntegerVariableRef#getVariable()
	 * @see #getIntegerVariableRef()
	 * @generated
	 */
	EReference getIntegerVariableRef_Variable();

	/**
	 * Returns the meta object for class '{@link org.gemoc.arduino.sequential.execarduino.arduino.LED <em>LED</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>LED</em>'.
	 * @see org.gemoc.arduino.sequential.execarduino.arduino.LED
	 * @generated
	 */
	EClass getLED();

	/**
	 * Returns the meta object for the attribute '{@link org.gemoc.arduino.sequential.execarduino.arduino.LED#getColor <em>Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Color</em>'.
	 * @see org.gemoc.arduino.sequential.execarduino.arduino.LED#getColor()
	 * @see #getLED()
	 * @generated
	 */
	EAttribute getLED_Color();

	/**
	 * Returns the meta object for class '{@link org.gemoc.arduino.sequential.execarduino.arduino.PushButton <em>Push Button</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Push Button</em>'.
	 * @see org.gemoc.arduino.sequential.execarduino.arduino.PushButton
	 * @generated
	 */
	EClass getPushButton();

	/**
	 * Returns the meta object for class '{@link org.gemoc.arduino.sequential.execarduino.arduino.Buzzer <em>Buzzer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Buzzer</em>'.
	 * @see org.gemoc.arduino.sequential.execarduino.arduino.Buzzer
	 * @generated
	 */
	EClass getBuzzer();

	/**
	 * Returns the meta object for class '{@link org.gemoc.arduino.sequential.execarduino.arduino.RotationSensor <em>Rotation Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rotation Sensor</em>'.
	 * @see org.gemoc.arduino.sequential.execarduino.arduino.RotationSensor
	 * @generated
	 */
	EClass getRotationSensor();

	/**
	 * Returns the meta object for class '{@link org.gemoc.arduino.sequential.execarduino.arduino.MicroServo <em>Micro Servo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Micro Servo</em>'.
	 * @see org.gemoc.arduino.sequential.execarduino.arduino.MicroServo
	 * @generated
	 */
	EClass getMicroServo();

	/**
	 * Returns the meta object for class '{@link org.gemoc.arduino.sequential.execarduino.arduino.InfraRedSensor <em>Infra Red Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Infra Red Sensor</em>'.
	 * @see org.gemoc.arduino.sequential.execarduino.arduino.InfraRedSensor
	 * @generated
	 */
	EClass getInfraRedSensor();

	/**
	 * Returns the meta object for class '{@link org.gemoc.arduino.sequential.execarduino.arduino.AmbientLightSensor <em>Ambient Light Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ambient Light Sensor</em>'.
	 * @see org.gemoc.arduino.sequential.execarduino.arduino.AmbientLightSensor
	 * @generated
	 */
	EClass getAmbientLightSensor();

	/**
	 * Returns the meta object for class '{@link org.gemoc.arduino.sequential.execarduino.arduino.SoundSensor <em>Sound Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sound Sensor</em>'.
	 * @see org.gemoc.arduino.sequential.execarduino.arduino.SoundSensor
	 * @generated
	 */
	EClass getSoundSensor();

	/**
	 * Returns the meta object for class '{@link org.gemoc.arduino.sequential.execarduino.arduino.Fan <em>Fan</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fan</em>'.
	 * @see org.gemoc.arduino.sequential.execarduino.arduino.Fan
	 * @generated
	 */
	EClass getFan();

	/**
	 * Returns the meta object for class '{@link org.gemoc.arduino.sequential.execarduino.arduino.MusicPlayer <em>Music Player</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Music Player</em>'.
	 * @see org.gemoc.arduino.sequential.execarduino.arduino.MusicPlayer
	 * @generated
	 */
	EClass getMusicPlayer();

	/**
	 * Returns the meta object for class '{@link org.gemoc.arduino.sequential.execarduino.arduino.ArduinoModule <em>Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Module</em>'.
	 * @see org.gemoc.arduino.sequential.execarduino.arduino.ArduinoModule
	 * @generated
	 */
	EClass getArduinoModule();

	/**
	 * Returns the meta object for class '{@link org.gemoc.arduino.sequential.execarduino.arduino.Block <em>Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Block</em>'.
	 * @see org.gemoc.arduino.sequential.execarduino.arduino.Block
	 * @generated
	 */
	EClass getBlock();

	/**
	 * Returns the meta object for the containment reference list '{@link org.gemoc.arduino.sequential.execarduino.arduino.Block#getInstructions <em>Instructions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Instructions</em>'.
	 * @see org.gemoc.arduino.sequential.execarduino.arduino.Block#getInstructions()
	 * @see #getBlock()
	 * @generated
	 */
	EReference getBlock_Instructions();

	/**
	 * Returns the meta object for class '{@link org.gemoc.arduino.sequential.execarduino.arduino.ArduinoBoard <em>Board</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Board</em>'.
	 * @see org.gemoc.arduino.sequential.execarduino.arduino.ArduinoBoard
	 * @generated
	 */
	EClass getArduinoBoard();

	/**
	 * Returns the meta object for the containment reference list '{@link org.gemoc.arduino.sequential.execarduino.arduino.ArduinoBoard#getDigitalPins <em>Digital Pins</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Digital Pins</em>'.
	 * @see org.gemoc.arduino.sequential.execarduino.arduino.ArduinoBoard#getDigitalPins()
	 * @see #getArduinoBoard()
	 * @generated
	 */
	EReference getArduinoBoard_DigitalPins();

	/**
	 * Returns the meta object for the containment reference list '{@link org.gemoc.arduino.sequential.execarduino.arduino.ArduinoBoard#getAnalogPins <em>Analog Pins</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Analog Pins</em>'.
	 * @see org.gemoc.arduino.sequential.execarduino.arduino.ArduinoBoard#getAnalogPins()
	 * @see #getArduinoBoard()
	 * @generated
	 */
	EReference getArduinoBoard_AnalogPins();

	/**
	 * Returns the meta object for class '{@link org.gemoc.arduino.sequential.execarduino.arduino.ArduinoDigitalModule <em>Digital Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Digital Module</em>'.
	 * @see org.gemoc.arduino.sequential.execarduino.arduino.ArduinoDigitalModule
	 * @generated
	 */
	EClass getArduinoDigitalModule();

	/**
	 * Returns the meta object for class '{@link org.gemoc.arduino.sequential.execarduino.arduino.ArduinoAnalogModule <em>Analog Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Analog Module</em>'.
	 * @see org.gemoc.arduino.sequential.execarduino.arduino.ArduinoAnalogModule
	 * @generated
	 */
	EClass getArduinoAnalogModule();

	/**
	 * Returns the meta object for class '{@link org.gemoc.arduino.sequential.execarduino.arduino.BooleanVariableRef <em>Boolean Variable Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean Variable Ref</em>'.
	 * @see org.gemoc.arduino.sequential.execarduino.arduino.BooleanVariableRef
	 * @generated
	 */
	EClass getBooleanVariableRef();

	/**
	 * Returns the meta object for the reference '{@link org.gemoc.arduino.sequential.execarduino.arduino.BooleanVariableRef#getVariable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Variable</em>'.
	 * @see org.gemoc.arduino.sequential.execarduino.arduino.BooleanVariableRef#getVariable()
	 * @see #getBooleanVariableRef()
	 * @generated
	 */
	EReference getBooleanVariableRef_Variable();

	/**
	 * Returns the meta object for class '{@link org.gemoc.arduino.sequential.execarduino.arduino.ArduinoCommunicationModule <em>Communication Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Communication Module</em>'.
	 * @see org.gemoc.arduino.sequential.execarduino.arduino.ArduinoCommunicationModule
	 * @generated
	 */
	EClass getArduinoCommunicationModule();

	/**
	 * Returns the meta object for class '{@link org.gemoc.arduino.sequential.execarduino.arduino.BluetoothTransceiver <em>Bluetooth Transceiver</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bluetooth Transceiver</em>'.
	 * @see org.gemoc.arduino.sequential.execarduino.arduino.BluetoothTransceiver
	 * @generated
	 */
	EClass getBluetoothTransceiver();

	/**
	 * Returns the meta object for the reference list '{@link org.gemoc.arduino.sequential.execarduino.arduino.BluetoothTransceiver#getConnectedTransceiver <em>Connected Transceiver</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Connected Transceiver</em>'.
	 * @see org.gemoc.arduino.sequential.execarduino.arduino.BluetoothTransceiver#getConnectedTransceiver()
	 * @see #getBluetoothTransceiver()
	 * @generated
	 */
	EReference getBluetoothTransceiver_ConnectedTransceiver();

	/**
	 * Returns the meta object for the attribute list '{@link org.gemoc.arduino.sequential.execarduino.arduino.BluetoothTransceiver#getDataToSend <em>Data To Send</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Data To Send</em>'.
	 * @see org.gemoc.arduino.sequential.execarduino.arduino.BluetoothTransceiver#getDataToSend()
	 * @see #getBluetoothTransceiver()
	 * @generated
	 */
	EAttribute getBluetoothTransceiver_DataToSend();

	/**
	 * Returns the meta object for the attribute list '{@link org.gemoc.arduino.sequential.execarduino.arduino.BluetoothTransceiver#getDataReceived <em>Data Received</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Data Received</em>'.
	 * @see org.gemoc.arduino.sequential.execarduino.arduino.BluetoothTransceiver#getDataReceived()
	 * @see #getBluetoothTransceiver()
	 * @generated
	 */
	EAttribute getBluetoothTransceiver_DataReceived();

	/**
	 * Returns the meta object for enum '{@link org.gemoc.arduino.sequential.execarduino.arduino.Time <em>Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Time</em>'.
	 * @see org.gemoc.arduino.sequential.execarduino.arduino.Time
	 * @generated
	 */
	EEnum getTime();

	/**
	 * Returns the meta object for enum '{@link org.gemoc.arduino.sequential.execarduino.arduino.BinaryIntegerOperatorKind <em>Binary Integer Operator Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Binary Integer Operator Kind</em>'.
	 * @see org.gemoc.arduino.sequential.execarduino.arduino.BinaryIntegerOperatorKind
	 * @generated
	 */
	EEnum getBinaryIntegerOperatorKind();

	/**
	 * Returns the meta object for enum '{@link org.gemoc.arduino.sequential.execarduino.arduino.BinaryBooleanOperatorKind <em>Binary Boolean Operator Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Binary Boolean Operator Kind</em>'.
	 * @see org.gemoc.arduino.sequential.execarduino.arduino.BinaryBooleanOperatorKind
	 * @generated
	 */
	EEnum getBinaryBooleanOperatorKind();

	/**
	 * Returns the meta object for enum '{@link org.gemoc.arduino.sequential.execarduino.arduino.UnaryIntegerOperatorKind <em>Unary Integer Operator Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Unary Integer Operator Kind</em>'.
	 * @see org.gemoc.arduino.sequential.execarduino.arduino.UnaryIntegerOperatorKind
	 * @generated
	 */
	EEnum getUnaryIntegerOperatorKind();

	/**
	 * Returns the meta object for enum '{@link org.gemoc.arduino.sequential.execarduino.arduino.UnaryBooleanOperatorKind <em>Unary Boolean Operator Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Unary Boolean Operator Kind</em>'.
	 * @see org.gemoc.arduino.sequential.execarduino.arduino.UnaryBooleanOperatorKind
	 * @generated
	 */
	EEnum getUnaryBooleanOperatorKind();

	/**
	 * Returns the meta object for enum '{@link org.gemoc.arduino.sequential.execarduino.arduino.Color <em>Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Color</em>'.
	 * @see org.gemoc.arduino.sequential.execarduino.arduino.Color
	 * @generated
	 */
	EEnum getColor();

	/**
	 * Returns the meta object for data type '{@link java.lang.Object <em>Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Object</em>'.
	 * @see java.lang.Object
	 * @model instanceClass="java.lang.Object"
	 * @generated
	 */
	EDataType getObject();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ArduinoFactory getArduinoFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.gemoc.arduino.sequential.execarduino.arduino.impl.BoardImpl <em>Board</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.arduino.sequential.execarduino.arduino.impl.BoardImpl
		 * @see org.gemoc.arduino.sequential.execarduino.arduino.impl.ArduinoPackageImpl#getBoard()
		 * @generated
		 */
		EClass BOARD = eINSTANCE.getBoard();

		/**
		 * The meta object literal for the '<em><b>Project</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOARD__PROJECT = eINSTANCE.getBoard_Project();

		/**
		 * The meta object literal for the '{@link org.gemoc.arduino.sequential.execarduino.arduino.Module <em>Module</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.arduino.sequential.execarduino.arduino.Module
		 * @see org.gemoc.arduino.sequential.execarduino.arduino.impl.ArduinoPackageImpl#getModule()
		 * @generated
		 */
		EClass MODULE = eINSTANCE.getModule();

		/**
		 * The meta object literal for the '{@link org.gemoc.arduino.sequential.execarduino.arduino.impl.DigitalPinImpl <em>Digital Pin</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.arduino.sequential.execarduino.arduino.impl.DigitalPinImpl
		 * @see org.gemoc.arduino.sequential.execarduino.arduino.impl.ArduinoPackageImpl#getDigitalPin()
		 * @generated
		 */
		EClass DIGITAL_PIN = eINSTANCE.getDigitalPin();

		/**
		 * The meta object literal for the '<em><b>Module</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIGITAL_PIN__MODULE = eINSTANCE.getDigitalPin_Module();

		/**
		 * The meta object literal for the '{@link org.gemoc.arduino.sequential.execarduino.arduino.impl.PinImpl <em>Pin</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.arduino.sequential.execarduino.arduino.impl.PinImpl
		 * @see org.gemoc.arduino.sequential.execarduino.arduino.impl.ArduinoPackageImpl#getPin()
		 * @generated
		 */
		EClass PIN = eINSTANCE.getPin();

		/**
		 * The meta object literal for the '<em><b>Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PIN__LEVEL = eINSTANCE.getPin_Level();

		/**
		 * The meta object literal for the '{@link org.gemoc.arduino.sequential.execarduino.arduino.impl.AnalogPinImpl <em>Analog Pin</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.arduino.sequential.execarduino.arduino.impl.AnalogPinImpl
		 * @see org.gemoc.arduino.sequential.execarduino.arduino.impl.ArduinoPackageImpl#getAnalogPin()
		 * @generated
		 */
		EClass ANALOG_PIN = eINSTANCE.getAnalogPin();

		/**
		 * The meta object literal for the '<em><b>Module</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANALOG_PIN__MODULE = eINSTANCE.getAnalogPin_Module();

		/**
		 * The meta object literal for the '{@link org.gemoc.arduino.sequential.execarduino.arduino.impl.SketchImpl <em>Sketch</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.arduino.sequential.execarduino.arduino.impl.SketchImpl
		 * @see org.gemoc.arduino.sequential.execarduino.arduino.impl.ArduinoPackageImpl#getSketch()
		 * @generated
		 */
		EClass SKETCH = eINSTANCE.getSketch();

		/**
		 * The meta object literal for the '<em><b>Project</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SKETCH__PROJECT = eINSTANCE.getSketch_Project();

		/**
		 * The meta object literal for the '<em><b>Block</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SKETCH__BLOCK = eINSTANCE.getSketch_Block();

		/**
		 * The meta object literal for the '<em><b>Board</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SKETCH__BOARD = eINSTANCE.getSketch_Board();

		/**
		 * The meta object literal for the '{@link org.gemoc.arduino.sequential.execarduino.arduino.impl.ProjectImpl <em>Project</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.arduino.sequential.execarduino.arduino.impl.ProjectImpl
		 * @see org.gemoc.arduino.sequential.execarduino.arduino.impl.ArduinoPackageImpl#getProject()
		 * @generated
		 */
		EClass PROJECT = eINSTANCE.getProject();

		/**
		 * The meta object literal for the '<em><b>Boards</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROJECT__BOARDS = eINSTANCE.getProject_Boards();

		/**
		 * The meta object literal for the '<em><b>Sketches</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROJECT__SKETCHES = eINSTANCE.getProject_Sketches();

		/**
		 * The meta object literal for the '{@link org.gemoc.arduino.sequential.execarduino.arduino.impl.InstructionImpl <em>Instruction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.arduino.sequential.execarduino.arduino.impl.InstructionImpl
		 * @see org.gemoc.arduino.sequential.execarduino.arduino.impl.ArduinoPackageImpl#getInstruction()
		 * @generated
		 */
		EClass INSTRUCTION = eINSTANCE.getInstruction();

		/**
		 * The meta object literal for the '{@link org.gemoc.arduino.sequential.execarduino.arduino.impl.ModuleAssignmentImpl <em>Module Assignment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.arduino.sequential.execarduino.arduino.impl.ModuleAssignmentImpl
		 * @see org.gemoc.arduino.sequential.execarduino.arduino.impl.ArduinoPackageImpl#getModuleAssignment()
		 * @generated
		 */
		EClass MODULE_ASSIGNMENT = eINSTANCE.getModuleAssignment();

		/**
		 * The meta object literal for the '{@link org.gemoc.arduino.sequential.execarduino.arduino.impl.ModuleInstructionImpl <em>Module Instruction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.arduino.sequential.execarduino.arduino.impl.ModuleInstructionImpl
		 * @see org.gemoc.arduino.sequential.execarduino.arduino.impl.ArduinoPackageImpl#getModuleInstruction()
		 * @generated
		 */
		EClass MODULE_INSTRUCTION = eINSTANCE.getModuleInstruction();

		/**
		 * The meta object literal for the '<em><b>Module</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODULE_INSTRUCTION__MODULE = eINSTANCE.getModuleInstruction_Module();

		/**
		 * The meta object literal for the '{@link org.gemoc.arduino.sequential.execarduino.arduino.impl.ControlImpl <em>Control</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.arduino.sequential.execarduino.arduino.impl.ControlImpl
		 * @see org.gemoc.arduino.sequential.execarduino.arduino.impl.ArduinoPackageImpl#getControl()
		 * @generated
		 */
		EClass CONTROL = eINSTANCE.getControl();

		/**
		 * The meta object literal for the '<em><b>Block</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROL__BLOCK = eINSTANCE.getControl_Block();

		/**
		 * The meta object literal for the '{@link org.gemoc.arduino.sequential.execarduino.arduino.impl.UtilitiesImpl <em>Utilities</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.arduino.sequential.execarduino.arduino.impl.UtilitiesImpl
		 * @see org.gemoc.arduino.sequential.execarduino.arduino.impl.ArduinoPackageImpl#getUtilities()
		 * @generated
		 */
		EClass UTILITIES = eINSTANCE.getUtilities();

		/**
		 * The meta object literal for the '{@link org.gemoc.arduino.sequential.execarduino.arduino.impl.DelayImpl <em>Delay</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.arduino.sequential.execarduino.arduino.impl.DelayImpl
		 * @see org.gemoc.arduino.sequential.execarduino.arduino.impl.ArduinoPackageImpl#getDelay()
		 * @generated
		 */
		EClass DELAY = eINSTANCE.getDelay();

		/**
		 * The meta object literal for the '<em><b>Unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DELAY__UNIT = eINSTANCE.getDelay_Unit();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DELAY__VALUE = eINSTANCE.getDelay_Value();

		/**
		 * The meta object literal for the '{@link org.gemoc.arduino.sequential.execarduino.arduino.impl.NamedElementImpl <em>Named Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.arduino.sequential.execarduino.arduino.impl.NamedElementImpl
		 * @see org.gemoc.arduino.sequential.execarduino.arduino.impl.ArduinoPackageImpl#getNamedElement()
		 * @generated
		 */
		EClass NAMED_ELEMENT = eINSTANCE.getNamedElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_ELEMENT__NAME = eINSTANCE.getNamedElement_Name();

		/**
		 * The meta object literal for the '{@link org.gemoc.arduino.sequential.execarduino.arduino.impl.RepeatImpl <em>Repeat</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.arduino.sequential.execarduino.arduino.impl.RepeatImpl
		 * @see org.gemoc.arduino.sequential.execarduino.arduino.impl.ArduinoPackageImpl#getRepeat()
		 * @generated
		 */
		EClass REPEAT = eINSTANCE.getRepeat();

		/**
		 * The meta object literal for the '<em><b>Iteration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPEAT__ITERATION = eINSTANCE.getRepeat_Iteration();

		/**
		 * The meta object literal for the '{@link org.gemoc.arduino.sequential.execarduino.arduino.impl.ModuleGetImpl <em>Module Get</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.arduino.sequential.execarduino.arduino.impl.ModuleGetImpl
		 * @see org.gemoc.arduino.sequential.execarduino.arduino.impl.ArduinoPackageImpl#getModuleGet()
		 * @generated
		 */
		EClass MODULE_GET = eINSTANCE.getModuleGet();

		/**
		 * The meta object literal for the '<em><b>Module</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODULE_GET__MODULE = eINSTANCE.getModuleGet_Module();

		/**
		 * The meta object literal for the '{@link org.gemoc.arduino.sequential.execarduino.arduino.impl.WhileImpl <em>While</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.arduino.sequential.execarduino.arduino.impl.WhileImpl
		 * @see org.gemoc.arduino.sequential.execarduino.arduino.impl.ArduinoPackageImpl#getWhile()
		 * @generated
		 */
		EClass WHILE = eINSTANCE.getWhile();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WHILE__CONDITION = eINSTANCE.getWhile_Condition();

		/**
		 * The meta object literal for the '{@link org.gemoc.arduino.sequential.execarduino.arduino.impl.BinaryExpressionImpl <em>Binary Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.arduino.sequential.execarduino.arduino.impl.BinaryExpressionImpl
		 * @see org.gemoc.arduino.sequential.execarduino.arduino.impl.ArduinoPackageImpl#getBinaryExpression()
		 * @generated
		 */
		EClass BINARY_EXPRESSION = eINSTANCE.getBinaryExpression();

		/**
		 * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINARY_EXPRESSION__LEFT = eINSTANCE.getBinaryExpression_Left();

		/**
		 * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINARY_EXPRESSION__RIGHT = eINSTANCE.getBinaryExpression_Right();

		/**
		 * The meta object literal for the '{@link org.gemoc.arduino.sequential.execarduino.arduino.impl.VariableImpl <em>Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.arduino.sequential.execarduino.arduino.impl.VariableImpl
		 * @see org.gemoc.arduino.sequential.execarduino.arduino.impl.ArduinoPackageImpl#getVariable()
		 * @generated
		 */
		EClass VARIABLE = eINSTANCE.getVariable();

		/**
		 * The meta object literal for the '{@link org.gemoc.arduino.sequential.execarduino.arduino.impl.VariableAssignmentImpl <em>Variable Assignment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.arduino.sequential.execarduino.arduino.impl.VariableAssignmentImpl
		 * @see org.gemoc.arduino.sequential.execarduino.arduino.impl.ArduinoPackageImpl#getVariableAssignment()
		 * @generated
		 */
		EClass VARIABLE_ASSIGNMENT = eINSTANCE.getVariableAssignment();

		/**
		 * The meta object literal for the '<em><b>Variable</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIABLE_ASSIGNMENT__VARIABLE = eINSTANCE.getVariableAssignment_Variable();

		/**
		 * The meta object literal for the '{@link org.gemoc.arduino.sequential.execarduino.arduino.impl.BinaryIntegerExpressionImpl <em>Binary Integer Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.arduino.sequential.execarduino.arduino.impl.BinaryIntegerExpressionImpl
		 * @see org.gemoc.arduino.sequential.execarduino.arduino.impl.ArduinoPackageImpl#getBinaryIntegerExpression()
		 * @generated
		 */
		EClass BINARY_INTEGER_EXPRESSION = eINSTANCE.getBinaryIntegerExpression();

		/**
		 * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BINARY_INTEGER_EXPRESSION__OPERATOR = eINSTANCE.getBinaryIntegerExpression_Operator();

		/**
		 * The meta object literal for the '{@link org.gemoc.arduino.sequential.execarduino.arduino.impl.BinaryBooleanExpressionImpl <em>Binary Boolean Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.arduino.sequential.execarduino.arduino.impl.BinaryBooleanExpressionImpl
		 * @see org.gemoc.arduino.sequential.execarduino.arduino.impl.ArduinoPackageImpl#getBinaryBooleanExpression()
		 * @generated
		 */
		EClass BINARY_BOOLEAN_EXPRESSION = eINSTANCE.getBinaryBooleanExpression();

		/**
		 * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BINARY_BOOLEAN_EXPRESSION__OPERATOR = eINSTANCE.getBinaryBooleanExpression_Operator();

		/**
		 * The meta object literal for the '{@link org.gemoc.arduino.sequential.execarduino.arduino.impl.ExpressionImpl <em>Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.arduino.sequential.execarduino.arduino.impl.ExpressionImpl
		 * @see org.gemoc.arduino.sequential.execarduino.arduino.impl.ArduinoPackageImpl#getExpression()
		 * @generated
		 */
		EClass EXPRESSION = eINSTANCE.getExpression();

		/**
		 * The meta object literal for the '{@link org.gemoc.arduino.sequential.execarduino.arduino.impl.ConstantImpl <em>Constant</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.arduino.sequential.execarduino.arduino.impl.ConstantImpl
		 * @see org.gemoc.arduino.sequential.execarduino.arduino.impl.ArduinoPackageImpl#getConstant()
		 * @generated
		 */
		EClass CONSTANT = eINSTANCE.getConstant();

		/**
		 * The meta object literal for the '{@link org.gemoc.arduino.sequential.execarduino.arduino.impl.IfImpl <em>If</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.arduino.sequential.execarduino.arduino.impl.IfImpl
		 * @see org.gemoc.arduino.sequential.execarduino.arduino.impl.ArduinoPackageImpl#getIf()
		 * @generated
		 */
		EClass IF = eINSTANCE.getIf();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IF__CONDITION = eINSTANCE.getIf_Condition();

		/**
		 * The meta object literal for the '<em><b>Else Block</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IF__ELSE_BLOCK = eINSTANCE.getIf_ElseBlock();

		/**
		 * The meta object literal for the '{@link org.gemoc.arduino.sequential.execarduino.arduino.impl.IntegerConstantImpl <em>Integer Constant</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.arduino.sequential.execarduino.arduino.impl.IntegerConstantImpl
		 * @see org.gemoc.arduino.sequential.execarduino.arduino.impl.ArduinoPackageImpl#getIntegerConstant()
		 * @generated
		 */
		EClass INTEGER_CONSTANT = eINSTANCE.getIntegerConstant();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTEGER_CONSTANT__VALUE = eINSTANCE.getIntegerConstant_Value();

		/**
		 * The meta object literal for the '{@link org.gemoc.arduino.sequential.execarduino.arduino.impl.BooleanConstantImpl <em>Boolean Constant</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.arduino.sequential.execarduino.arduino.impl.BooleanConstantImpl
		 * @see org.gemoc.arduino.sequential.execarduino.arduino.impl.ArduinoPackageImpl#getBooleanConstant()
		 * @generated
		 */
		EClass BOOLEAN_CONSTANT = eINSTANCE.getBooleanConstant();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOLEAN_CONSTANT__VALUE = eINSTANCE.getBooleanConstant_Value();

		/**
		 * The meta object literal for the '{@link org.gemoc.arduino.sequential.execarduino.arduino.impl.BooleanExpressionImpl <em>Boolean Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.arduino.sequential.execarduino.arduino.impl.BooleanExpressionImpl
		 * @see org.gemoc.arduino.sequential.execarduino.arduino.impl.ArduinoPackageImpl#getBooleanExpression()
		 * @generated
		 */
		EClass BOOLEAN_EXPRESSION = eINSTANCE.getBooleanExpression();

		/**
		 * The meta object literal for the '{@link org.gemoc.arduino.sequential.execarduino.arduino.impl.IntegerExpressionImpl <em>Integer Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.arduino.sequential.execarduino.arduino.impl.IntegerExpressionImpl
		 * @see org.gemoc.arduino.sequential.execarduino.arduino.impl.ArduinoPackageImpl#getIntegerExpression()
		 * @generated
		 */
		EClass INTEGER_EXPRESSION = eINSTANCE.getIntegerExpression();

		/**
		 * The meta object literal for the '{@link org.gemoc.arduino.sequential.execarduino.arduino.impl.AssignmentImpl <em>Assignment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.arduino.sequential.execarduino.arduino.impl.AssignmentImpl
		 * @see org.gemoc.arduino.sequential.execarduino.arduino.impl.ArduinoPackageImpl#getAssignment()
		 * @generated
		 */
		EClass ASSIGNMENT = eINSTANCE.getAssignment();

		/**
		 * The meta object literal for the '<em><b>Operand</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSIGNMENT__OPERAND = eINSTANCE.getAssignment_Operand();

		/**
		 * The meta object literal for the '{@link org.gemoc.arduino.sequential.execarduino.arduino.impl.IntegerVariableImpl <em>Integer Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.arduino.sequential.execarduino.arduino.impl.IntegerVariableImpl
		 * @see org.gemoc.arduino.sequential.execarduino.arduino.impl.ArduinoPackageImpl#getIntegerVariable()
		 * @generated
		 */
		EClass INTEGER_VARIABLE = eINSTANCE.getIntegerVariable();

		/**
		 * The meta object literal for the '<em><b>Initial Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTEGER_VARIABLE__INITIAL_VALUE = eINSTANCE.getIntegerVariable_InitialValue();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTEGER_VARIABLE__VALUE = eINSTANCE.getIntegerVariable_Value();

		/**
		 * The meta object literal for the '{@link org.gemoc.arduino.sequential.execarduino.arduino.impl.BooleanVariableImpl <em>Boolean Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.arduino.sequential.execarduino.arduino.impl.BooleanVariableImpl
		 * @see org.gemoc.arduino.sequential.execarduino.arduino.impl.ArduinoPackageImpl#getBooleanVariable()
		 * @generated
		 */
		EClass BOOLEAN_VARIABLE = eINSTANCE.getBooleanVariable();

		/**
		 * The meta object literal for the '<em><b>Initial Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOLEAN_VARIABLE__INITIAL_VALUE = eINSTANCE.getBooleanVariable_InitialValue();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOLEAN_VARIABLE__VALUE = eINSTANCE.getBooleanVariable_Value();

		/**
		 * The meta object literal for the '{@link org.gemoc.arduino.sequential.execarduino.arduino.impl.BooleanModuleGetImpl <em>Boolean Module Get</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.arduino.sequential.execarduino.arduino.impl.BooleanModuleGetImpl
		 * @see org.gemoc.arduino.sequential.execarduino.arduino.impl.ArduinoPackageImpl#getBooleanModuleGet()
		 * @generated
		 */
		EClass BOOLEAN_MODULE_GET = eINSTANCE.getBooleanModuleGet();

		/**
		 * The meta object literal for the '{@link org.gemoc.arduino.sequential.execarduino.arduino.impl.IntegerModuleGetImpl <em>Integer Module Get</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.arduino.sequential.execarduino.arduino.impl.IntegerModuleGetImpl
		 * @see org.gemoc.arduino.sequential.execarduino.arduino.impl.ArduinoPackageImpl#getIntegerModuleGet()
		 * @generated
		 */
		EClass INTEGER_MODULE_GET = eINSTANCE.getIntegerModuleGet();

		/**
		 * The meta object literal for the '{@link org.gemoc.arduino.sequential.execarduino.arduino.impl.UnaryExpressionImpl <em>Unary Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.arduino.sequential.execarduino.arduino.impl.UnaryExpressionImpl
		 * @see org.gemoc.arduino.sequential.execarduino.arduino.impl.ArduinoPackageImpl#getUnaryExpression()
		 * @generated
		 */
		EClass UNARY_EXPRESSION = eINSTANCE.getUnaryExpression();

		/**
		 * The meta object literal for the '<em><b>Operand</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNARY_EXPRESSION__OPERAND = eINSTANCE.getUnaryExpression_Operand();

		/**
		 * The meta object literal for the '{@link org.gemoc.arduino.sequential.execarduino.arduino.impl.UnaryBooleanExpressionImpl <em>Unary Boolean Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.arduino.sequential.execarduino.arduino.impl.UnaryBooleanExpressionImpl
		 * @see org.gemoc.arduino.sequential.execarduino.arduino.impl.ArduinoPackageImpl#getUnaryBooleanExpression()
		 * @generated
		 */
		EClass UNARY_BOOLEAN_EXPRESSION = eINSTANCE.getUnaryBooleanExpression();

		/**
		 * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNARY_BOOLEAN_EXPRESSION__OPERATOR = eINSTANCE.getUnaryBooleanExpression_Operator();

		/**
		 * The meta object literal for the '{@link org.gemoc.arduino.sequential.execarduino.arduino.impl.UnaryIntegerExpressionImpl <em>Unary Integer Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.arduino.sequential.execarduino.arduino.impl.UnaryIntegerExpressionImpl
		 * @see org.gemoc.arduino.sequential.execarduino.arduino.impl.ArduinoPackageImpl#getUnaryIntegerExpression()
		 * @generated
		 */
		EClass UNARY_INTEGER_EXPRESSION = eINSTANCE.getUnaryIntegerExpression();

		/**
		 * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNARY_INTEGER_EXPRESSION__OPERATOR = eINSTANCE.getUnaryIntegerExpression_Operator();

		/**
		 * The meta object literal for the '{@link org.gemoc.arduino.sequential.execarduino.arduino.impl.VariableDeclarationImpl <em>Variable Declaration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.arduino.sequential.execarduino.arduino.impl.VariableDeclarationImpl
		 * @see org.gemoc.arduino.sequential.execarduino.arduino.impl.ArduinoPackageImpl#getVariableDeclaration()
		 * @generated
		 */
		EClass VARIABLE_DECLARATION = eINSTANCE.getVariableDeclaration();

		/**
		 * The meta object literal for the '<em><b>Variable</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIABLE_DECLARATION__VARIABLE = eINSTANCE.getVariableDeclaration_Variable();

		/**
		 * The meta object literal for the '{@link org.gemoc.arduino.sequential.execarduino.arduino.impl.VariableRefImpl <em>Variable Ref</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.arduino.sequential.execarduino.arduino.impl.VariableRefImpl
		 * @see org.gemoc.arduino.sequential.execarduino.arduino.impl.ArduinoPackageImpl#getVariableRef()
		 * @generated
		 */
		EClass VARIABLE_REF = eINSTANCE.getVariableRef();

		/**
		 * The meta object literal for the '{@link org.gemoc.arduino.sequential.execarduino.arduino.impl.IntegerVariableRefImpl <em>Integer Variable Ref</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.arduino.sequential.execarduino.arduino.impl.IntegerVariableRefImpl
		 * @see org.gemoc.arduino.sequential.execarduino.arduino.impl.ArduinoPackageImpl#getIntegerVariableRef()
		 * @generated
		 */
		EClass INTEGER_VARIABLE_REF = eINSTANCE.getIntegerVariableRef();

		/**
		 * The meta object literal for the '<em><b>Variable</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTEGER_VARIABLE_REF__VARIABLE = eINSTANCE.getIntegerVariableRef_Variable();

		/**
		 * The meta object literal for the '{@link org.gemoc.arduino.sequential.execarduino.arduino.impl.LEDImpl <em>LED</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.arduino.sequential.execarduino.arduino.impl.LEDImpl
		 * @see org.gemoc.arduino.sequential.execarduino.arduino.impl.ArduinoPackageImpl#getLED()
		 * @generated
		 */
		EClass LED = eINSTANCE.getLED();

		/**
		 * The meta object literal for the '<em><b>Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LED__COLOR = eINSTANCE.getLED_Color();

		/**
		 * The meta object literal for the '{@link org.gemoc.arduino.sequential.execarduino.arduino.impl.PushButtonImpl <em>Push Button</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.arduino.sequential.execarduino.arduino.impl.PushButtonImpl
		 * @see org.gemoc.arduino.sequential.execarduino.arduino.impl.ArduinoPackageImpl#getPushButton()
		 * @generated
		 */
		EClass PUSH_BUTTON = eINSTANCE.getPushButton();

		/**
		 * The meta object literal for the '{@link org.gemoc.arduino.sequential.execarduino.arduino.impl.BuzzerImpl <em>Buzzer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.arduino.sequential.execarduino.arduino.impl.BuzzerImpl
		 * @see org.gemoc.arduino.sequential.execarduino.arduino.impl.ArduinoPackageImpl#getBuzzer()
		 * @generated
		 */
		EClass BUZZER = eINSTANCE.getBuzzer();

		/**
		 * The meta object literal for the '{@link org.gemoc.arduino.sequential.execarduino.arduino.impl.RotationSensorImpl <em>Rotation Sensor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.arduino.sequential.execarduino.arduino.impl.RotationSensorImpl
		 * @see org.gemoc.arduino.sequential.execarduino.arduino.impl.ArduinoPackageImpl#getRotationSensor()
		 * @generated
		 */
		EClass ROTATION_SENSOR = eINSTANCE.getRotationSensor();

		/**
		 * The meta object literal for the '{@link org.gemoc.arduino.sequential.execarduino.arduino.impl.MicroServoImpl <em>Micro Servo</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.arduino.sequential.execarduino.arduino.impl.MicroServoImpl
		 * @see org.gemoc.arduino.sequential.execarduino.arduino.impl.ArduinoPackageImpl#getMicroServo()
		 * @generated
		 */
		EClass MICRO_SERVO = eINSTANCE.getMicroServo();

		/**
		 * The meta object literal for the '{@link org.gemoc.arduino.sequential.execarduino.arduino.impl.InfraRedSensorImpl <em>Infra Red Sensor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.arduino.sequential.execarduino.arduino.impl.InfraRedSensorImpl
		 * @see org.gemoc.arduino.sequential.execarduino.arduino.impl.ArduinoPackageImpl#getInfraRedSensor()
		 * @generated
		 */
		EClass INFRA_RED_SENSOR = eINSTANCE.getInfraRedSensor();

		/**
		 * The meta object literal for the '{@link org.gemoc.arduino.sequential.execarduino.arduino.impl.AmbientLightSensorImpl <em>Ambient Light Sensor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.arduino.sequential.execarduino.arduino.impl.AmbientLightSensorImpl
		 * @see org.gemoc.arduino.sequential.execarduino.arduino.impl.ArduinoPackageImpl#getAmbientLightSensor()
		 * @generated
		 */
		EClass AMBIENT_LIGHT_SENSOR = eINSTANCE.getAmbientLightSensor();

		/**
		 * The meta object literal for the '{@link org.gemoc.arduino.sequential.execarduino.arduino.impl.SoundSensorImpl <em>Sound Sensor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.arduino.sequential.execarduino.arduino.impl.SoundSensorImpl
		 * @see org.gemoc.arduino.sequential.execarduino.arduino.impl.ArduinoPackageImpl#getSoundSensor()
		 * @generated
		 */
		EClass SOUND_SENSOR = eINSTANCE.getSoundSensor();

		/**
		 * The meta object literal for the '{@link org.gemoc.arduino.sequential.execarduino.arduino.impl.FanImpl <em>Fan</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.arduino.sequential.execarduino.arduino.impl.FanImpl
		 * @see org.gemoc.arduino.sequential.execarduino.arduino.impl.ArduinoPackageImpl#getFan()
		 * @generated
		 */
		EClass FAN = eINSTANCE.getFan();

		/**
		 * The meta object literal for the '{@link org.gemoc.arduino.sequential.execarduino.arduino.impl.MusicPlayerImpl <em>Music Player</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.arduino.sequential.execarduino.arduino.impl.MusicPlayerImpl
		 * @see org.gemoc.arduino.sequential.execarduino.arduino.impl.ArduinoPackageImpl#getMusicPlayer()
		 * @generated
		 */
		EClass MUSIC_PLAYER = eINSTANCE.getMusicPlayer();

		/**
		 * The meta object literal for the '{@link org.gemoc.arduino.sequential.execarduino.arduino.impl.ArduinoModuleImpl <em>Module</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.arduino.sequential.execarduino.arduino.impl.ArduinoModuleImpl
		 * @see org.gemoc.arduino.sequential.execarduino.arduino.impl.ArduinoPackageImpl#getArduinoModule()
		 * @generated
		 */
		EClass ARDUINO_MODULE = eINSTANCE.getArduinoModule();

		/**
		 * The meta object literal for the '{@link org.gemoc.arduino.sequential.execarduino.arduino.impl.BlockImpl <em>Block</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.arduino.sequential.execarduino.arduino.impl.BlockImpl
		 * @see org.gemoc.arduino.sequential.execarduino.arduino.impl.ArduinoPackageImpl#getBlock()
		 * @generated
		 */
		EClass BLOCK = eINSTANCE.getBlock();

		/**
		 * The meta object literal for the '<em><b>Instructions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BLOCK__INSTRUCTIONS = eINSTANCE.getBlock_Instructions();

		/**
		 * The meta object literal for the '{@link org.gemoc.arduino.sequential.execarduino.arduino.impl.ArduinoBoardImpl <em>Board</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.arduino.sequential.execarduino.arduino.impl.ArduinoBoardImpl
		 * @see org.gemoc.arduino.sequential.execarduino.arduino.impl.ArduinoPackageImpl#getArduinoBoard()
		 * @generated
		 */
		EClass ARDUINO_BOARD = eINSTANCE.getArduinoBoard();

		/**
		 * The meta object literal for the '<em><b>Digital Pins</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARDUINO_BOARD__DIGITAL_PINS = eINSTANCE.getArduinoBoard_DigitalPins();

		/**
		 * The meta object literal for the '<em><b>Analog Pins</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARDUINO_BOARD__ANALOG_PINS = eINSTANCE.getArduinoBoard_AnalogPins();

		/**
		 * The meta object literal for the '{@link org.gemoc.arduino.sequential.execarduino.arduino.impl.ArduinoDigitalModuleImpl <em>Digital Module</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.arduino.sequential.execarduino.arduino.impl.ArduinoDigitalModuleImpl
		 * @see org.gemoc.arduino.sequential.execarduino.arduino.impl.ArduinoPackageImpl#getArduinoDigitalModule()
		 * @generated
		 */
		EClass ARDUINO_DIGITAL_MODULE = eINSTANCE.getArduinoDigitalModule();

		/**
		 * The meta object literal for the '{@link org.gemoc.arduino.sequential.execarduino.arduino.impl.ArduinoAnalogModuleImpl <em>Analog Module</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.arduino.sequential.execarduino.arduino.impl.ArduinoAnalogModuleImpl
		 * @see org.gemoc.arduino.sequential.execarduino.arduino.impl.ArduinoPackageImpl#getArduinoAnalogModule()
		 * @generated
		 */
		EClass ARDUINO_ANALOG_MODULE = eINSTANCE.getArduinoAnalogModule();

		/**
		 * The meta object literal for the '{@link org.gemoc.arduino.sequential.execarduino.arduino.impl.BooleanVariableRefImpl <em>Boolean Variable Ref</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.arduino.sequential.execarduino.arduino.impl.BooleanVariableRefImpl
		 * @see org.gemoc.arduino.sequential.execarduino.arduino.impl.ArduinoPackageImpl#getBooleanVariableRef()
		 * @generated
		 */
		EClass BOOLEAN_VARIABLE_REF = eINSTANCE.getBooleanVariableRef();

		/**
		 * The meta object literal for the '<em><b>Variable</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOOLEAN_VARIABLE_REF__VARIABLE = eINSTANCE.getBooleanVariableRef_Variable();

		/**
		 * The meta object literal for the '{@link org.gemoc.arduino.sequential.execarduino.arduino.impl.ArduinoCommunicationModuleImpl <em>Communication Module</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.arduino.sequential.execarduino.arduino.impl.ArduinoCommunicationModuleImpl
		 * @see org.gemoc.arduino.sequential.execarduino.arduino.impl.ArduinoPackageImpl#getArduinoCommunicationModule()
		 * @generated
		 */
		EClass ARDUINO_COMMUNICATION_MODULE = eINSTANCE.getArduinoCommunicationModule();

		/**
		 * The meta object literal for the '{@link org.gemoc.arduino.sequential.execarduino.arduino.impl.BluetoothTransceiverImpl <em>Bluetooth Transceiver</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.arduino.sequential.execarduino.arduino.impl.BluetoothTransceiverImpl
		 * @see org.gemoc.arduino.sequential.execarduino.arduino.impl.ArduinoPackageImpl#getBluetoothTransceiver()
		 * @generated
		 */
		EClass BLUETOOTH_TRANSCEIVER = eINSTANCE.getBluetoothTransceiver();

		/**
		 * The meta object literal for the '<em><b>Connected Transceiver</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BLUETOOTH_TRANSCEIVER__CONNECTED_TRANSCEIVER = eINSTANCE.getBluetoothTransceiver_ConnectedTransceiver();

		/**
		 * The meta object literal for the '<em><b>Data To Send</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BLUETOOTH_TRANSCEIVER__DATA_TO_SEND = eINSTANCE.getBluetoothTransceiver_DataToSend();

		/**
		 * The meta object literal for the '<em><b>Data Received</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BLUETOOTH_TRANSCEIVER__DATA_RECEIVED = eINSTANCE.getBluetoothTransceiver_DataReceived();

		/**
		 * The meta object literal for the '{@link org.gemoc.arduino.sequential.execarduino.arduino.Time <em>Time</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.arduino.sequential.execarduino.arduino.Time
		 * @see org.gemoc.arduino.sequential.execarduino.arduino.impl.ArduinoPackageImpl#getTime()
		 * @generated
		 */
		EEnum TIME = eINSTANCE.getTime();

		/**
		 * The meta object literal for the '{@link org.gemoc.arduino.sequential.execarduino.arduino.BinaryIntegerOperatorKind <em>Binary Integer Operator Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.arduino.sequential.execarduino.arduino.BinaryIntegerOperatorKind
		 * @see org.gemoc.arduino.sequential.execarduino.arduino.impl.ArduinoPackageImpl#getBinaryIntegerOperatorKind()
		 * @generated
		 */
		EEnum BINARY_INTEGER_OPERATOR_KIND = eINSTANCE.getBinaryIntegerOperatorKind();

		/**
		 * The meta object literal for the '{@link org.gemoc.arduino.sequential.execarduino.arduino.BinaryBooleanOperatorKind <em>Binary Boolean Operator Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.arduino.sequential.execarduino.arduino.BinaryBooleanOperatorKind
		 * @see org.gemoc.arduino.sequential.execarduino.arduino.impl.ArduinoPackageImpl#getBinaryBooleanOperatorKind()
		 * @generated
		 */
		EEnum BINARY_BOOLEAN_OPERATOR_KIND = eINSTANCE.getBinaryBooleanOperatorKind();

		/**
		 * The meta object literal for the '{@link org.gemoc.arduino.sequential.execarduino.arduino.UnaryIntegerOperatorKind <em>Unary Integer Operator Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.arduino.sequential.execarduino.arduino.UnaryIntegerOperatorKind
		 * @see org.gemoc.arduino.sequential.execarduino.arduino.impl.ArduinoPackageImpl#getUnaryIntegerOperatorKind()
		 * @generated
		 */
		EEnum UNARY_INTEGER_OPERATOR_KIND = eINSTANCE.getUnaryIntegerOperatorKind();

		/**
		 * The meta object literal for the '{@link org.gemoc.arduino.sequential.execarduino.arduino.UnaryBooleanOperatorKind <em>Unary Boolean Operator Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.arduino.sequential.execarduino.arduino.UnaryBooleanOperatorKind
		 * @see org.gemoc.arduino.sequential.execarduino.arduino.impl.ArduinoPackageImpl#getUnaryBooleanOperatorKind()
		 * @generated
		 */
		EEnum UNARY_BOOLEAN_OPERATOR_KIND = eINSTANCE.getUnaryBooleanOperatorKind();

		/**
		 * The meta object literal for the '{@link org.gemoc.arduino.sequential.execarduino.arduino.Color <em>Color</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.arduino.sequential.execarduino.arduino.Color
		 * @see org.gemoc.arduino.sequential.execarduino.arduino.impl.ArduinoPackageImpl#getColor()
		 * @generated
		 */
		EEnum COLOR = eINSTANCE.getColor();

		/**
		 * The meta object literal for the '<em>Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Object
		 * @see org.gemoc.arduino.sequential.execarduino.arduino.impl.ArduinoPackageImpl#getObject()
		 * @generated
		 */
		EDataType OBJECT = eINSTANCE.getObject();

	}

} //ArduinoPackage
