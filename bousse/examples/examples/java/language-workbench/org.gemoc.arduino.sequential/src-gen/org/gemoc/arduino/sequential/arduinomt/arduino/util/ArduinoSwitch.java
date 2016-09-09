/**
 */
package org.gemoc.arduino.sequential.arduinomt.arduino.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.gemoc.arduino.sequential.arduinomt.arduino.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.gemoc.arduino.sequential.arduinomt.arduino.ArduinoPackage
 * @generated
 */
public class ArduinoSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ArduinoPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArduinoSwitch() {
		if (modelPackage == null) {
			modelPackage = ArduinoPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case ArduinoPackage.BOARD: {
				Board board = (Board)theEObject;
				T result = caseBoard(board);
				if (result == null) result = caseNamedElement(board);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArduinoPackage.MODULE: {
				Module module = (Module)theEObject;
				T result = caseModule(module);
				if (result == null) result = caseNamedElement(module);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArduinoPackage.DIGITAL_PIN: {
				DigitalPin digitalPin = (DigitalPin)theEObject;
				T result = caseDigitalPin(digitalPin);
				if (result == null) result = casePin(digitalPin);
				if (result == null) result = caseNamedElement(digitalPin);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArduinoPackage.PIN: {
				Pin pin = (Pin)theEObject;
				T result = casePin(pin);
				if (result == null) result = caseNamedElement(pin);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArduinoPackage.ANALOG_PIN: {
				AnalogPin analogPin = (AnalogPin)theEObject;
				T result = caseAnalogPin(analogPin);
				if (result == null) result = casePin(analogPin);
				if (result == null) result = caseNamedElement(analogPin);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArduinoPackage.SKETCH: {
				Sketch sketch = (Sketch)theEObject;
				T result = caseSketch(sketch);
				if (result == null) result = caseNamedElement(sketch);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArduinoPackage.PROJECT: {
				Project project = (Project)theEObject;
				T result = caseProject(project);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArduinoPackage.INSTRUCTION: {
				Instruction instruction = (Instruction)theEObject;
				T result = caseInstruction(instruction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArduinoPackage.MODULE_ASSIGNMENT: {
				ModuleAssignment moduleAssignment = (ModuleAssignment)theEObject;
				T result = caseModuleAssignment(moduleAssignment);
				if (result == null) result = caseModuleInstruction(moduleAssignment);
				if (result == null) result = caseAssignment(moduleAssignment);
				if (result == null) result = caseInstruction(moduleAssignment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArduinoPackage.MODULE_INSTRUCTION: {
				ModuleInstruction moduleInstruction = (ModuleInstruction)theEObject;
				T result = caseModuleInstruction(moduleInstruction);
				if (result == null) result = caseInstruction(moduleInstruction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArduinoPackage.CONTROL: {
				Control control = (Control)theEObject;
				T result = caseControl(control);
				if (result == null) result = caseInstruction(control);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArduinoPackage.UTILITIES: {
				Utilities utilities = (Utilities)theEObject;
				T result = caseUtilities(utilities);
				if (result == null) result = caseInstruction(utilities);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArduinoPackage.DELAY: {
				Delay delay = (Delay)theEObject;
				T result = caseDelay(delay);
				if (result == null) result = caseUtilities(delay);
				if (result == null) result = caseInstruction(delay);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArduinoPackage.NAMED_ELEMENT: {
				NamedElement namedElement = (NamedElement)theEObject;
				T result = caseNamedElement(namedElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArduinoPackage.REPEAT: {
				Repeat repeat = (Repeat)theEObject;
				T result = caseRepeat(repeat);
				if (result == null) result = caseControl(repeat);
				if (result == null) result = caseInstruction(repeat);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArduinoPackage.MODULE_GET: {
				ModuleGet moduleGet = (ModuleGet)theEObject;
				T result = caseModuleGet(moduleGet);
				if (result == null) result = caseExpression(moduleGet);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArduinoPackage.WHILE: {
				While while_ = (While)theEObject;
				T result = caseWhile(while_);
				if (result == null) result = caseControl(while_);
				if (result == null) result = caseInstruction(while_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArduinoPackage.BINARY_EXPRESSION: {
				BinaryExpression binaryExpression = (BinaryExpression)theEObject;
				T result = caseBinaryExpression(binaryExpression);
				if (result == null) result = caseExpression(binaryExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArduinoPackage.VARIABLE: {
				Variable variable = (Variable)theEObject;
				T result = caseVariable(variable);
				if (result == null) result = caseNamedElement(variable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArduinoPackage.VARIABLE_ASSIGNMENT: {
				VariableAssignment variableAssignment = (VariableAssignment)theEObject;
				T result = caseVariableAssignment(variableAssignment);
				if (result == null) result = caseAssignment(variableAssignment);
				if (result == null) result = caseInstruction(variableAssignment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArduinoPackage.BINARY_INTEGER_EXPRESSION: {
				BinaryIntegerExpression binaryIntegerExpression = (BinaryIntegerExpression)theEObject;
				T result = caseBinaryIntegerExpression(binaryIntegerExpression);
				if (result == null) result = caseBinaryExpression(binaryIntegerExpression);
				if (result == null) result = caseIntegerExpression(binaryIntegerExpression);
				if (result == null) result = caseExpression(binaryIntegerExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArduinoPackage.BINARY_BOOLEAN_EXPRESSION: {
				BinaryBooleanExpression binaryBooleanExpression = (BinaryBooleanExpression)theEObject;
				T result = caseBinaryBooleanExpression(binaryBooleanExpression);
				if (result == null) result = caseBinaryExpression(binaryBooleanExpression);
				if (result == null) result = caseBooleanExpression(binaryBooleanExpression);
				if (result == null) result = caseExpression(binaryBooleanExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArduinoPackage.EXPRESSION: {
				Expression expression = (Expression)theEObject;
				T result = caseExpression(expression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArduinoPackage.CONSTANT: {
				Constant constant = (Constant)theEObject;
				T result = caseConstant(constant);
				if (result == null) result = caseExpression(constant);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArduinoPackage.IF: {
				If if_ = (If)theEObject;
				T result = caseIf(if_);
				if (result == null) result = caseControl(if_);
				if (result == null) result = caseInstruction(if_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArduinoPackage.INTEGER_CONSTANT: {
				IntegerConstant integerConstant = (IntegerConstant)theEObject;
				T result = caseIntegerConstant(integerConstant);
				if (result == null) result = caseConstant(integerConstant);
				if (result == null) result = caseIntegerExpression(integerConstant);
				if (result == null) result = caseExpression(integerConstant);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArduinoPackage.BOOLEAN_CONSTANT: {
				BooleanConstant booleanConstant = (BooleanConstant)theEObject;
				T result = caseBooleanConstant(booleanConstant);
				if (result == null) result = caseConstant(booleanConstant);
				if (result == null) result = caseBooleanExpression(booleanConstant);
				if (result == null) result = caseExpression(booleanConstant);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArduinoPackage.BOOLEAN_EXPRESSION: {
				BooleanExpression booleanExpression = (BooleanExpression)theEObject;
				T result = caseBooleanExpression(booleanExpression);
				if (result == null) result = caseExpression(booleanExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArduinoPackage.INTEGER_EXPRESSION: {
				IntegerExpression integerExpression = (IntegerExpression)theEObject;
				T result = caseIntegerExpression(integerExpression);
				if (result == null) result = caseExpression(integerExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArduinoPackage.ASSIGNMENT: {
				Assignment assignment = (Assignment)theEObject;
				T result = caseAssignment(assignment);
				if (result == null) result = caseInstruction(assignment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArduinoPackage.INTEGER_VARIABLE: {
				IntegerVariable integerVariable = (IntegerVariable)theEObject;
				T result = caseIntegerVariable(integerVariable);
				if (result == null) result = caseVariable(integerVariable);
				if (result == null) result = caseNamedElement(integerVariable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArduinoPackage.BOOLEAN_VARIABLE: {
				BooleanVariable booleanVariable = (BooleanVariable)theEObject;
				T result = caseBooleanVariable(booleanVariable);
				if (result == null) result = caseVariable(booleanVariable);
				if (result == null) result = caseNamedElement(booleanVariable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArduinoPackage.BOOLEAN_MODULE_GET: {
				BooleanModuleGet booleanModuleGet = (BooleanModuleGet)theEObject;
				T result = caseBooleanModuleGet(booleanModuleGet);
				if (result == null) result = caseModuleGet(booleanModuleGet);
				if (result == null) result = caseBooleanExpression(booleanModuleGet);
				if (result == null) result = caseExpression(booleanModuleGet);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArduinoPackage.INTEGER_MODULE_GET: {
				IntegerModuleGet integerModuleGet = (IntegerModuleGet)theEObject;
				T result = caseIntegerModuleGet(integerModuleGet);
				if (result == null) result = caseModuleGet(integerModuleGet);
				if (result == null) result = caseIntegerExpression(integerModuleGet);
				if (result == null) result = caseExpression(integerModuleGet);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArduinoPackage.UNARY_EXPRESSION: {
				UnaryExpression unaryExpression = (UnaryExpression)theEObject;
				T result = caseUnaryExpression(unaryExpression);
				if (result == null) result = caseExpression(unaryExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArduinoPackage.UNARY_BOOLEAN_EXPRESSION: {
				UnaryBooleanExpression unaryBooleanExpression = (UnaryBooleanExpression)theEObject;
				T result = caseUnaryBooleanExpression(unaryBooleanExpression);
				if (result == null) result = caseUnaryExpression(unaryBooleanExpression);
				if (result == null) result = caseBooleanExpression(unaryBooleanExpression);
				if (result == null) result = caseExpression(unaryBooleanExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArduinoPackage.UNARY_INTEGER_EXPRESSION: {
				UnaryIntegerExpression unaryIntegerExpression = (UnaryIntegerExpression)theEObject;
				T result = caseUnaryIntegerExpression(unaryIntegerExpression);
				if (result == null) result = caseUnaryExpression(unaryIntegerExpression);
				if (result == null) result = caseIntegerExpression(unaryIntegerExpression);
				if (result == null) result = caseExpression(unaryIntegerExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArduinoPackage.VARIABLE_DECLARATION: {
				VariableDeclaration variableDeclaration = (VariableDeclaration)theEObject;
				T result = caseVariableDeclaration(variableDeclaration);
				if (result == null) result = caseInstruction(variableDeclaration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArduinoPackage.VARIABLE_REF: {
				VariableRef variableRef = (VariableRef)theEObject;
				T result = caseVariableRef(variableRef);
				if (result == null) result = caseExpression(variableRef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArduinoPackage.INTEGER_VARIABLE_REF: {
				IntegerVariableRef integerVariableRef = (IntegerVariableRef)theEObject;
				T result = caseIntegerVariableRef(integerVariableRef);
				if (result == null) result = caseVariableRef(integerVariableRef);
				if (result == null) result = caseIntegerExpression(integerVariableRef);
				if (result == null) result = caseExpression(integerVariableRef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArduinoPackage.LED: {
				LED led = (LED)theEObject;
				T result = caseLED(led);
				if (result == null) result = caseArduinoDigitalModule(led);
				if (result == null) result = caseArduinoModule(led);
				if (result == null) result = caseModule(led);
				if (result == null) result = caseNamedElement(led);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArduinoPackage.PUSH_BUTTON: {
				PushButton pushButton = (PushButton)theEObject;
				T result = casePushButton(pushButton);
				if (result == null) result = caseArduinoDigitalModule(pushButton);
				if (result == null) result = caseArduinoModule(pushButton);
				if (result == null) result = caseModule(pushButton);
				if (result == null) result = caseNamedElement(pushButton);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArduinoPackage.BUZZER: {
				Buzzer buzzer = (Buzzer)theEObject;
				T result = caseBuzzer(buzzer);
				if (result == null) result = caseArduinoDigitalModule(buzzer);
				if (result == null) result = caseArduinoModule(buzzer);
				if (result == null) result = caseModule(buzzer);
				if (result == null) result = caseNamedElement(buzzer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArduinoPackage.ROTATION_SENSOR: {
				RotationSensor rotationSensor = (RotationSensor)theEObject;
				T result = caseRotationSensor(rotationSensor);
				if (result == null) result = caseArduinoAnalogModule(rotationSensor);
				if (result == null) result = caseArduinoModule(rotationSensor);
				if (result == null) result = caseModule(rotationSensor);
				if (result == null) result = caseNamedElement(rotationSensor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArduinoPackage.MICRO_SERVO: {
				MicroServo microServo = (MicroServo)theEObject;
				T result = caseMicroServo(microServo);
				if (result == null) result = caseArduinoDigitalModule(microServo);
				if (result == null) result = caseArduinoModule(microServo);
				if (result == null) result = caseModule(microServo);
				if (result == null) result = caseNamedElement(microServo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArduinoPackage.INFRA_RED_SENSOR: {
				InfraRedSensor infraRedSensor = (InfraRedSensor)theEObject;
				T result = caseInfraRedSensor(infraRedSensor);
				if (result == null) result = caseArduinoDigitalModule(infraRedSensor);
				if (result == null) result = caseArduinoModule(infraRedSensor);
				if (result == null) result = caseModule(infraRedSensor);
				if (result == null) result = caseNamedElement(infraRedSensor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArduinoPackage.AMBIENT_LIGHT_SENSOR: {
				AmbientLightSensor ambientLightSensor = (AmbientLightSensor)theEObject;
				T result = caseAmbientLightSensor(ambientLightSensor);
				if (result == null) result = caseArduinoAnalogModule(ambientLightSensor);
				if (result == null) result = caseArduinoModule(ambientLightSensor);
				if (result == null) result = caseModule(ambientLightSensor);
				if (result == null) result = caseNamedElement(ambientLightSensor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArduinoPackage.SOUND_SENSOR: {
				SoundSensor soundSensor = (SoundSensor)theEObject;
				T result = caseSoundSensor(soundSensor);
				if (result == null) result = caseArduinoAnalogModule(soundSensor);
				if (result == null) result = caseArduinoModule(soundSensor);
				if (result == null) result = caseModule(soundSensor);
				if (result == null) result = caseNamedElement(soundSensor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArduinoPackage.FAN: {
				Fan fan = (Fan)theEObject;
				T result = caseFan(fan);
				if (result == null) result = caseArduinoDigitalModule(fan);
				if (result == null) result = caseArduinoModule(fan);
				if (result == null) result = caseModule(fan);
				if (result == null) result = caseNamedElement(fan);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArduinoPackage.MUSIC_PLAYER: {
				MusicPlayer musicPlayer = (MusicPlayer)theEObject;
				T result = caseMusicPlayer(musicPlayer);
				if (result == null) result = caseArduinoAnalogModule(musicPlayer);
				if (result == null) result = caseArduinoModule(musicPlayer);
				if (result == null) result = caseModule(musicPlayer);
				if (result == null) result = caseNamedElement(musicPlayer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArduinoPackage.ARDUINO_MODULE: {
				ArduinoModule arduinoModule = (ArduinoModule)theEObject;
				T result = caseArduinoModule(arduinoModule);
				if (result == null) result = caseModule(arduinoModule);
				if (result == null) result = caseNamedElement(arduinoModule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArduinoPackage.BLOCK: {
				Block block = (Block)theEObject;
				T result = caseBlock(block);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArduinoPackage.ARDUINO_BOARD: {
				ArduinoBoard arduinoBoard = (ArduinoBoard)theEObject;
				T result = caseArduinoBoard(arduinoBoard);
				if (result == null) result = caseBoard(arduinoBoard);
				if (result == null) result = caseNamedElement(arduinoBoard);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArduinoPackage.ARDUINO_DIGITAL_MODULE: {
				ArduinoDigitalModule arduinoDigitalModule = (ArduinoDigitalModule)theEObject;
				T result = caseArduinoDigitalModule(arduinoDigitalModule);
				if (result == null) result = caseArduinoModule(arduinoDigitalModule);
				if (result == null) result = caseModule(arduinoDigitalModule);
				if (result == null) result = caseNamedElement(arduinoDigitalModule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArduinoPackage.ARDUINO_ANALOG_MODULE: {
				ArduinoAnalogModule arduinoAnalogModule = (ArduinoAnalogModule)theEObject;
				T result = caseArduinoAnalogModule(arduinoAnalogModule);
				if (result == null) result = caseArduinoModule(arduinoAnalogModule);
				if (result == null) result = caseModule(arduinoAnalogModule);
				if (result == null) result = caseNamedElement(arduinoAnalogModule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArduinoPackage.BOOLEAN_VARIABLE_REF: {
				BooleanVariableRef booleanVariableRef = (BooleanVariableRef)theEObject;
				T result = caseBooleanVariableRef(booleanVariableRef);
				if (result == null) result = caseVariableRef(booleanVariableRef);
				if (result == null) result = caseBooleanExpression(booleanVariableRef);
				if (result == null) result = caseExpression(booleanVariableRef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArduinoPackage.ARDUINO_COMMUNICATION_MODULE: {
				ArduinoCommunicationModule arduinoCommunicationModule = (ArduinoCommunicationModule)theEObject;
				T result = caseArduinoCommunicationModule(arduinoCommunicationModule);
				if (result == null) result = caseArduinoDigitalModule(arduinoCommunicationModule);
				if (result == null) result = caseArduinoModule(arduinoCommunicationModule);
				if (result == null) result = caseModule(arduinoCommunicationModule);
				if (result == null) result = caseNamedElement(arduinoCommunicationModule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArduinoPackage.BLUETOOTH_TRANSCEIVER: {
				BluetoothTransceiver bluetoothTransceiver = (BluetoothTransceiver)theEObject;
				T result = caseBluetoothTransceiver(bluetoothTransceiver);
				if (result == null) result = caseArduinoAnalogModule(bluetoothTransceiver);
				if (result == null) result = caseArduinoModule(bluetoothTransceiver);
				if (result == null) result = caseModule(bluetoothTransceiver);
				if (result == null) result = caseNamedElement(bluetoothTransceiver);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Board</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Board</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBoard(Board object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Module</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Module</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModule(Module object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Digital Pin</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Digital Pin</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDigitalPin(DigitalPin object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pin</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pin</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePin(Pin object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Analog Pin</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Analog Pin</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnalogPin(AnalogPin object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sketch</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sketch</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSketch(Sketch object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Project</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Project</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProject(Project object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Instruction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Instruction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInstruction(Instruction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Module Assignment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Module Assignment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModuleAssignment(ModuleAssignment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Module Instruction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Module Instruction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModuleInstruction(ModuleInstruction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Control</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Control</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseControl(Control object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Utilities</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Utilities</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUtilities(Utilities object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Delay</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Delay</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDelay(Delay object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamedElement(NamedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Repeat</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Repeat</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRepeat(Repeat object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Module Get</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Module Get</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModuleGet(ModuleGet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>While</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>While</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWhile(While object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Binary Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Binary Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBinaryExpression(BinaryExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Variable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Variable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVariable(Variable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Variable Assignment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Variable Assignment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVariableAssignment(VariableAssignment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Binary Integer Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Binary Integer Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBinaryIntegerExpression(BinaryIntegerExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Binary Boolean Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Binary Boolean Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBinaryBooleanExpression(BinaryBooleanExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExpression(Expression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Constant</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Constant</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConstant(Constant object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>If</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>If</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIf(If object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Integer Constant</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Integer Constant</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIntegerConstant(IntegerConstant object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Boolean Constant</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Boolean Constant</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBooleanConstant(BooleanConstant object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Boolean Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Boolean Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBooleanExpression(BooleanExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Integer Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Integer Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIntegerExpression(IntegerExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Assignment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Assignment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssignment(Assignment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Integer Variable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Integer Variable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIntegerVariable(IntegerVariable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Boolean Variable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Boolean Variable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBooleanVariable(BooleanVariable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Boolean Module Get</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Boolean Module Get</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBooleanModuleGet(BooleanModuleGet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Integer Module Get</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Integer Module Get</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIntegerModuleGet(IntegerModuleGet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unary Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unary Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnaryExpression(UnaryExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unary Boolean Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unary Boolean Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnaryBooleanExpression(UnaryBooleanExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unary Integer Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unary Integer Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnaryIntegerExpression(UnaryIntegerExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Variable Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Variable Declaration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVariableDeclaration(VariableDeclaration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Variable Ref</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Variable Ref</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVariableRef(VariableRef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Integer Variable Ref</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Integer Variable Ref</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIntegerVariableRef(IntegerVariableRef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>LED</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>LED</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLED(LED object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Push Button</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Push Button</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePushButton(PushButton object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Buzzer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Buzzer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBuzzer(Buzzer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rotation Sensor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rotation Sensor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRotationSensor(RotationSensor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Micro Servo</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Micro Servo</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMicroServo(MicroServo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Infra Red Sensor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Infra Red Sensor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInfraRedSensor(InfraRedSensor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ambient Light Sensor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ambient Light Sensor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAmbientLightSensor(AmbientLightSensor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sound Sensor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sound Sensor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSoundSensor(SoundSensor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fan</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fan</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFan(Fan object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Music Player</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Music Player</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMusicPlayer(MusicPlayer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Module</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Module</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArduinoModule(ArduinoModule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Block</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Block</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBlock(Block object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Board</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Board</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArduinoBoard(ArduinoBoard object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Digital Module</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Digital Module</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArduinoDigitalModule(ArduinoDigitalModule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Analog Module</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Analog Module</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArduinoAnalogModule(ArduinoAnalogModule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Boolean Variable Ref</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Boolean Variable Ref</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBooleanVariableRef(BooleanVariableRef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Communication Module</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Communication Module</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArduinoCommunicationModule(ArduinoCommunicationModule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bluetooth Transceiver</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bluetooth Transceiver</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBluetoothTransceiver(BluetoothTransceiver object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //ArduinoSwitch
