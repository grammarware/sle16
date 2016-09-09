package org.gemoc.arduino.sequential.arduino.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import java.util.List;
import org.gemoc.arduino.sequential.arduino.aspects.BluetoothTransceiver_PushAspect;
import org.gemoc.arduino.sequential.arduino.aspects.Expression_EvaluableAspect;
import org.gemoc.arduino.sequential.arduino.aspects.Instruction_UtilitesAspect;
import org.gemoc.arduino.sequential.arduino.aspects.ModuleAssignment_ExecutableAspectModuleAssignmentAspectProperties;
import org.gemoc.arduino.sequential.arduino.aspects.ModuleInstruction_ExecutableAspect;
import org.gemoc.arduino.sequential.arduino.aspects.Pin_EvaluableAspect;
import org.gemoc.arduino.sequential.arduino.arduino.BluetoothTransceiver;
import org.gemoc.arduino.sequential.arduino.arduino.BooleanExpression;
import org.gemoc.arduino.sequential.arduino.arduino.Expression;
import org.gemoc.arduino.sequential.arduino.arduino.IntegerExpression;
import org.gemoc.arduino.sequential.arduino.arduino.Module;
import org.gemoc.arduino.sequential.arduino.arduino.ModuleAssignment;
import org.gemoc.arduino.sequential.arduino.arduino.Pin;

@Aspect(className = ModuleAssignment.class)
@SuppressWarnings("all")
public class ModuleAssignment_ExecutableAspect extends ModuleInstruction_ExecutableAspect {
  @Step
  @OverrideAspectMethod
  public static void execute(final ModuleAssignment _self) {
    final org.gemoc.arduino.sequential.arduino.aspects.ModuleAssignment_ExecutableAspectModuleAssignmentAspectProperties _self_ = org.gemoc.arduino.sequential.arduino.aspects.ModuleAssignment_ExecutableAspectModuleAssignmentAspectContext.getSelf(_self);
     if (_self instanceof org.gemoc.arduino.sequential.arduino.arduino.ModuleAssignment){
    					fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
    						@Override
    						public void execute() {
    							org.gemoc.arduino.sequential.arduino.aspects.ModuleAssignment_ExecutableAspect._privk3_execute(_self_, (org.gemoc.arduino.sequential.arduino.arduino.ModuleAssignment)_self);
    						}
    					};
    					fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager manager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry.getInstance().findStepManager(_self);
    					if (manager != null) {
    						manager.executeStep(_self,command,"ModuleAssignment","execute");
    					} else {
    						command.execute();
    					}
    					;
    } else  if (_self instanceof org.gemoc.arduino.sequential.arduino.arduino.ModuleInstruction){
    					org.gemoc.arduino.sequential.arduino.aspects.ModuleInstruction_ExecutableAspect.execute((org.gemoc.arduino.sequential.arduino.arduino.ModuleInstruction)_self);
    } else  if (_self instanceof org.gemoc.arduino.sequential.arduino.arduino.Instruction){
    					org.gemoc.arduino.sequential.arduino.aspects.Instruction_ExecutableAspect.execute((org.gemoc.arduino.sequential.arduino.arduino.Instruction)_self);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
  }
  
  private static void super_execute(final ModuleAssignment _self) {
    final org.gemoc.arduino.sequential.arduino.aspects.ModuleInstruction_ExecutableAspectModuleInstructionAspectProperties _self_ = org.gemoc.arduino.sequential.arduino.aspects.ModuleInstruction_ExecutableAspectModuleInstructionAspectContext.getSelf(_self);
     org.gemoc.arduino.sequential.arduino.aspects.ModuleInstruction_ExecutableAspect._privk3_execute(_self_, _self);
  }
  
  protected static void _privk3_execute(final ModuleAssignment_ExecutableAspectModuleAssignmentAspectProperties _self_, final ModuleAssignment _self) {
    Module _module = _self.getModule();
    final Pin pin = Instruction_UtilitesAspect.getPin(_self, _module);
    Expression _operand = _self.getOperand();
    if ((_operand instanceof IntegerExpression)) {
      Expression _operand_1 = _self.getOperand();
      Object _evaluate = Expression_EvaluableAspect.evaluate(_operand_1);
      Pin_EvaluableAspect.level(pin, ((Integer) _evaluate));
    }
    Expression _operand_2 = _self.getOperand();
    if ((_operand_2 instanceof BooleanExpression)) {
      Expression _operand_3 = _self.getOperand();
      Object _evaluate_1 = Expression_EvaluableAspect.evaluate(_operand_3);
      if ((((Boolean) _evaluate_1)).booleanValue()) {
        Pin_EvaluableAspect.level(pin, Pin_EvaluableAspect.HIGH);
      } else {
        Pin_EvaluableAspect.level(pin, Pin_EvaluableAspect.LOW);
      }
    }
    Module _module_1 = _self.getModule();
    if ((_module_1 instanceof BluetoothTransceiver)) {
      Module _module_2 = _self.getModule();
      List<Integer> _dataToSend = BluetoothTransceiver_PushAspect.dataToSend(((BluetoothTransceiver) _module_2));
      Integer _level = Pin_EvaluableAspect.level(pin);
      _dataToSend.add(_level);
      Module _module_3 = _self.getModule();
      BluetoothTransceiver_PushAspect.push(((BluetoothTransceiver) _module_3));
    }
  }
}
