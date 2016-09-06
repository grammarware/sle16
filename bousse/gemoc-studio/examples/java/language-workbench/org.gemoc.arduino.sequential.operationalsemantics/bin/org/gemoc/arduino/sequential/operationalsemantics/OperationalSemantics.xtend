package org.gemoc.arduino.sequential.operationalsemantics

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import fr.inria.diverse.k3.al.annotationprocessor.InitializeModel
import fr.inria.diverse.k3.al.annotationprocessor.Main
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod
import fr.inria.diverse.k3.al.annotationprocessor.Step
import java.util.List
import org.gemoc.arduino.sequential.model.arduino.BinaryBooleanExpression
import org.gemoc.arduino.sequential.model.arduino.BinaryIntegerExpression
import org.gemoc.arduino.sequential.model.arduino.Block
import org.gemoc.arduino.sequential.model.arduino.BooleanConstant
import org.gemoc.arduino.sequential.model.arduino.BooleanExpression
import org.gemoc.arduino.sequential.model.arduino.BooleanModuleGet
import org.gemoc.arduino.sequential.model.arduino.BooleanVariable
import org.gemoc.arduino.sequential.model.arduino.BooleanVariableRef
import org.gemoc.arduino.sequential.model.arduino.Constant
import org.gemoc.arduino.sequential.model.arduino.Control
import org.gemoc.arduino.sequential.model.arduino.Delay
import org.gemoc.arduino.sequential.model.arduino.Expression
import org.gemoc.arduino.sequential.model.arduino.If
import org.gemoc.arduino.sequential.model.arduino.Instruction
import org.gemoc.arduino.sequential.model.arduino.IntegerConstant
import org.gemoc.arduino.sequential.model.arduino.IntegerExpression
import org.gemoc.arduino.sequential.model.arduino.IntegerModuleGet
import org.gemoc.arduino.sequential.model.arduino.IntegerVariable
import org.gemoc.arduino.sequential.model.arduino.IntegerVariableRef
import org.gemoc.arduino.sequential.model.arduino.ModuleAssignment
import org.gemoc.arduino.sequential.model.arduino.ModuleInstruction
import org.gemoc.arduino.sequential.model.arduino.Pin
import org.gemoc.arduino.sequential.model.arduino.Project
import org.gemoc.arduino.sequential.model.arduino.Repeat
import org.gemoc.arduino.sequential.model.arduino.Utilities
import org.gemoc.arduino.sequential.model.arduino.Variable
import org.gemoc.arduino.sequential.model.arduino.VariableAssignment
import org.gemoc.arduino.sequential.model.arduino.VariableDeclaration
import org.gemoc.arduino.sequential.model.arduino.VariableRef
import org.gemoc.arduino.sequential.model.arduino.While
import org.gemoc.arduino.sequential.model.arduino.Module
import org.gemoc.arduino.sequential.model.arduino.ArduinoBoard
import org.gemoc.arduino.sequential.model.arduino.ArduinoCommunicationModule
import org.gemoc.arduino.sequential.model.arduino.BluetoothTransceiver

import static extension org.gemoc.arduino.sequential.operationalsemantics.Pin_EvaluableAspect.*
import static extension org.gemoc.arduino.sequential.operationalsemantics.Block_ExecutableAspect.*
import static extension org.gemoc.arduino.sequential.operationalsemantics.Instruction_ExecutableAspect.*
import static extension org.gemoc.arduino.sequential.operationalsemantics.If_EvaluableAspect.*
import static extension org.gemoc.arduino.sequential.operationalsemantics.IntegerVariable_EvaluableAspect.*
import static extension org.gemoc.arduino.sequential.operationalsemantics.BooleanVariable_EvaluableAspect.*
import static extension org.gemoc.arduino.sequential.operationalsemantics.Expression_EvaluableAspect.*
import static extension org.gemoc.arduino.sequential.operationalsemantics.BluetoothTransceiver_PushAspect.*

@Aspect(className=Instruction)
class Instruction_UtilitesAspect {
	private def Project getProject(Module module) {
		var Project project = null

		var current = _self.eContainer()
		while (current != null) {
			if (current instanceof Project) {
				project = current as Project
				return project
			}
			current = current.eContainer()
		}
		
		return project
	}
	
	def protected Pin getPin(Module module) {
		var Pin pin = null
		
		val project = _self.getProject(module)

		for (board : project.boards) {
			if (board != null && board instanceof ArduinoBoard) {
				var ArduinoBoard arduinoBoard = board as ArduinoBoard
				for (analogPin : arduinoBoard.analogPins) {
					if (analogPin.module == module) {
						return analogPin
					}
				}
				for (digitalPin : arduinoBoard.digitalPins) {
					if (digitalPin.module == module) {
						return digitalPin
					}
				}
			}
		}
		
		return pin
	}
}

@Aspect(className=Instruction)
class Instruction_ExecutableAspect extends Instruction_UtilitesAspect{
	
	@Step
	def void execute() {
	}
	
	def void finalize() {
	}
}

@Aspect(className=Project)
class Project_ExecutableAspect {
		
	def void execute() {
		val sketches = _self.sketches
		while(true) {
			sketches.forEach[s|s.block.execute]
		}
	}
	
	@Main
	def void main() {
		val start = System.nanoTime
		_self.execute
		val stop = System.nanoTime
		println("time to execute " + (stop - start))
	}
	
	@Step
	def void setup() {
		_self.eAllContents().forEach[o|{
			if (o instanceof IntegerVariable) {
				o.value = o.initialValue
			} else if (o instanceof BooleanVariable) {
				o.value = o.initialValue
			} else if (o instanceof Pin) {
				(o as Pin).level = 0
			}
		}]
	}
	
	@InitializeModel
	def public void initializeModel(List<String> args){
		_self.setup
	}
}

@Aspect(className=VariableAssignment)
class VariableAssignment_ExecutableAspect extends Instruction_ExecutableAspect {

	@OverrideAspectMethod
	def void execute() {
		val variable = _self.variable
		val value = _self.operand.evaluate
		if (variable instanceof IntegerVariable){
			variable.value = value as Integer
		}
		if (variable instanceof BooleanVariable){
			variable.value = value as Boolean
		}
	}
}

@Aspect(className=Block)
class Block_ExecutableAspect {
	def void execute() {
		_self.instructions.forEach[i|i.execute]
	}
}

@Aspect(className=ModuleInstruction)
class ModuleInstruction_ExecutableAspect extends Instruction_ExecutableAspect {	
	@OverrideAspectMethod
	def void execute() {
	}
}

@Aspect(className=ModuleAssignment)
class ModuleAssignment_ExecutableAspect extends ModuleInstruction_ExecutableAspect {

	@OverrideAspectMethod
	def void execute() {
		val pin = _self.getPin(_self.module)
		if (_self.operand instanceof IntegerExpression){
			pin.level = _self.operand.evaluate as Integer
		}
		if (_self.operand instanceof BooleanExpression){
			if (_self.operand.evaluate as Boolean){
				pin.level = HIGH
			} else {
				pin.level = LOW
			}
		}
		
		//FIXME Here it is dirty but I think we should 'transmit' the value in the module itself as the wire should do in true life
		if (_self.module instanceof BluetoothTransceiver){
			(_self.module as BluetoothTransceiver).dataToSend.add(pin.level)
			//FIXME temporary solution
			(_self.module as BluetoothTransceiver).push
		}
	}
}

@Aspect(className=ArduinoCommunicationModule)
abstract class ArduinoCommunicationModule_PushAspect {
	abstract def void push()
} 

@Aspect(className=BluetoothTransceiver)
abstract class BluetoothTransceiver_PushAspect extends ArduinoCommunicationModule_PushAspect {
	
	public List<Integer> dataToSend
	public List<Integer> dataReceived
	
	@Step
	@OverrideAspectMethod
	def void push(){
		_self.connectedTransceiver.forEach[t|
			val l = t.dataReceived
			_self.dataToSend.forEach[i|l.add(i)]
		]
		_self.dataToSend.clear
	}
} 

@Aspect(className=VariableDeclaration)
class VariableDeclaration_ExecutableAspect extends Instruction_ExecutableAspect {
	
	@OverrideAspectMethod
	def void execute() {
		switch (_self.variable){
			IntegerVariable : (_self.variable as IntegerVariable).value = (_self.variable as IntegerVariable).initialValue	
			BooleanVariable : (_self.variable as BooleanVariable).value = (_self.variable as BooleanVariable).initialValue
		}
	}
}

@Aspect(className=Control)
class Control_ExecutableAspect extends Instruction_ExecutableAspect {
	@OverrideAspectMethod
	def void execute() {
	}
}

@Aspect(className=Control)
class Control_EvaluableAspect extends Instruction_ExecutableAspect {
	def Boolean evaluate() {
	}
}

@Aspect(className=If)
class If_EvaluableAspect extends Control_EvaluableAspect {
	@OverrideAspectMethod
	def Boolean evaluate() {
		var Boolean resCond = false
		if (_self.condition instanceof BooleanExpression){
			resCond = _self.condition.evaluate as Boolean
		}
		return resCond
	}
}

@Aspect(className=If)
class If_ExecutableAspect extends Control_ExecutableAspect {
	
	@OverrideAspectMethod
	def void execute() {
		if (_self.evaluate) {
			_self.block.execute
		} else {
			if (_self.elseBlock != null) {
				_self.elseBlock.execute
			}
		}
	}
}

@Aspect(className=Repeat)
class Repeat_EvaluableAspect extends Control_EvaluableAspect {
	var Integer i = 0

	@OverrideAspectMethod
	def Boolean evaluate() {
		var Boolean resCond = false
		resCond = (_self.i  < _self.iteration)
		_self.i = _self.i+1
		return resCond
	}

	@OverrideAspectMethod
	def void finalize() {
		_self.i = 0
		return
	}
}

@Aspect(className=Repeat)
class Repeat_ExecutableAspect extends Control_ExecutableAspect  {
	
	@OverrideAspectMethod
	def void execute() {
		while (_self.evaluate) {
			_self.block.execute
		}
		_self.finalize
	}
}

@Aspect(className=While)
class While_EvaluableAspect extends Control_EvaluableAspect {
	@OverrideAspectMethod
	def Boolean evaluate() {
		var Boolean resCond = _self.condition.evaluate as Boolean
		return resCond
	}
}

@Aspect(className=While)
class While_ExecutableAspect extends Control_ExecutableAspect {
	@OverrideAspectMethod
	def void execute() {
		while (_self.evaluate) {
			_self.block.execute
		}
	}
}

@Aspect(className=Utilities)
class Utilities_ExecutableAspect extends Instruction_ExecutableAspect {
	@OverrideAspectMethod
	def void execute() {
	}
}

@Aspect(className=Delay)
class Delay_ExecutableAspect extends Utilities_ExecutableAspect {
	
	@OverrideAspectMethod
	def void execute() {
		try {
			Thread.sleep(_self.value)
		} catch (InterruptedException e) {
			e.printStackTrace()
		}
	}
}

@Aspect(className=BinaryIntegerExpression)
class BinaryIntegerExpression_EvaluableAspect extends Expression_EvaluableAspect {
	@OverrideAspectMethod
	def Object evaluate() {
		var Integer res
		var bLeft = false
		var iLeft = 0
		switch (_self.left){
			BooleanExpression: bLeft = _self.left.evaluate as Boolean
			IntegerExpression: iLeft = _self.left.evaluate as Integer
		}
		var bRight = false
		var iRight = 0
		switch (_self.right){
			BooleanExpression: bRight = _self.right.evaluate as Boolean
			IntegerExpression: iRight = _self.right.evaluate as Integer
		}
		switch (_self.operator) {
			case DIV: {
				res = iLeft / iRight
			}
			case MAX: {
				res = Math.max(iLeft, iRight)
			}
			case MIN: {
				res = Math.min(iLeft, iRight)
			}
			case MINUS: {
				res = iLeft - iRight
			}
			case MUL: {
				res = iLeft * iRight
			}
			case PLUS: {
				res = iLeft + iRight
			}
			case POURCENT: {
				res = iLeft % iRight
			}
			default: {
				throw new IllegalStateException("Operator "
					+ _self.operator + " not simulated yet.")
			}
		}
		return res
	}
}

@Aspect(className=BooleanModuleGet) 
class BooleanModuleGet_ExecutableAspect extends Expression_EvaluableAspect{
	@OverrideAspectMethod
	def Object evaluate() {
		
		val pin = _self.instruction.getPin(_self.module)
		if (pin.level == 0){
			return false
		}
		return true
	}
}

@Aspect(className=BooleanConstant) 
class BooleanConstant_ExecutableAspect extends Expression_EvaluableAspect{
	@OverrideAspectMethod
	def Object evaluate() {
		return _self.value
	}
}

@Aspect(className=IntegerConstant) 
class IntegerConstant_ExecutableAspect extends Expression_EvaluableAspect{
	@OverrideAspectMethod
	def Object evaluate() {
		return _self.value
	}
}	

@Aspect(className=IntegerModuleGet) 
class IntegerModuleGet_ExecutableAspect extends Expression_EvaluableAspect{
	@OverrideAspectMethod
	def Object evaluate() {
		
		//FIXME Here it is dirty but I think we should 'transmit' the value in the module itself as the wire should do in true life
		if (_self.module instanceof BluetoothTransceiver){
			val l = (_self.module as BluetoothTransceiver).dataReceived
			val res = l.head
			if (res != null) {
				l.remove(0)
				return res
			} else {
				return 0
			}
		}
		
		val pin = _self.instruction.getPin(_self.module)
		return pin.level
	}
}

@Aspect(className=BinaryBooleanExpression)
class BinaryBooleanExpression_EvaluableAspect extends Expression_EvaluableAspect {
	@OverrideAspectMethod
	def Object evaluate() {
		var leftIsBoolean = false
		var rightIsBoolean = false
		var Boolean res
		var bLeft = false
		var iLeft = 0
		switch (_self.left){
			BooleanExpression: {
				bLeft = _self.left.evaluate as Boolean
				leftIsBoolean = true
			}
			IntegerExpression: iLeft = _self.left.evaluate as Integer
		}
		var bRight = false
		var iRight = 0
		switch (_self.right){
			BooleanExpression: {
				bRight = _self.right.evaluate as Boolean 
				rightIsBoolean = true
			}
			IntegerExpression: iRight = _self.right.evaluate as Integer
		}
		if (leftIsBoolean != rightIsBoolean) {
			throw new IllegalArgumentException("left operand type does not match right operand type.")
		}
		switch (_self.operator) {
			case AND: {
				if (bLeft) {
					res = bRight
				} else {
					res = Boolean.FALSE
				}
			}
			case OR: {
				if(bLeft) {
					res = Boolean.TRUE
				}
				else {
					res = bRight
				}
			}
			case DIFFERENT: {
				res = !(bLeft.equals(bRight))
			}
			case EQUAL: {
				if (leftIsBoolean) {
					res = (bLeft.equals(bRight))
				} else {
					res = (iLeft.equals(iRight))
				}				
			}
			case INF: {
				res = iLeft < iRight
			}
			case INF_OR_EQUAL: {
				res = iLeft <= iRight
			}
			case SUP: {
				res = iLeft > iRight
			}
			case SUP_OR_EQUAL: {
				res = iLeft >= iRight
			}
			default: {
				throw new IllegalStateException("Operator "
					+ _self.operator + " not simulated yet.")
			}
		}
		return res
	}
}

@Aspect(className=Constant)
class Constant_EvaluableAspect extends Expression_EvaluableAspect {
	@OverrideAspectMethod
	def Object evaluate() {
		switch _self{
			BooleanConstant: return (_self as BooleanConstant).value
			IntegerConstant: return (_self as IntegerConstant).value
			default: throw new ClassCastException("type not expected: "+_self.eClass.name)
		}
	}
}

@Aspect(className=Pin)
class Pin_EvaluableAspect {
	public Integer level = LOW
	
	public static final Integer LOW = 0
	public static final Integer HIGH = 1023
}

@Aspect(className=Variable)
abstract class Variable_EvaluableAspect {
	def abstract Object evaluate()
}

@Aspect(className=IntegerVariable)
class IntegerVariable_EvaluableAspect extends Variable_EvaluableAspect {
	public Integer value
	
	@OverrideAspectMethod
	def Object evaluate(){
		return _self.value
	}
}

@Aspect(className=BooleanVariable)
class BooleanVariable_EvaluableAspect extends Variable_EvaluableAspect  {	
	public Boolean value
	
	@OverrideAspectMethod
	def Object evaluate(){
		return _self.value
	}
}

@Aspect(className=VariableRef)
class VariableRef_EvaluableAspect extends Expression_EvaluableAspect{
	@OverrideAspectMethod
	def Object evaluate(){
		switch _self{
			BooleanVariableRef: return (_self as BooleanVariableRef).variable.evaluate
			IntegerVariableRef: return (_self as IntegerVariableRef).variable.evaluate
			default: throw new ClassCastException("type not expected: "+_self.eClass.name)
		}
	}
}

@Aspect(className=Expression)
abstract class Expression_EvaluableAspect {
	
	def protected Instruction getInstruction() {
		var Instruction instruction = null

		var current = _self.eContainer()
		while (current != null) {
			if (current instanceof Instruction) {
				instruction = current as Instruction
				return instruction
			}
			current = current.eContainer()
		}
		
		return instruction
	}
	
	def abstract Object evaluate()
}
