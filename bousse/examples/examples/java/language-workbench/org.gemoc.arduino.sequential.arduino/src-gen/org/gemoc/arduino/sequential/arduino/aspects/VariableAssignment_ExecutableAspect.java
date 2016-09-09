package org.gemoc.arduino.sequential.arduino.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import org.gemoc.arduino.sequential.arduino.aspects.BooleanVariable_EvaluableAspect;
import org.gemoc.arduino.sequential.arduino.aspects.Expression_EvaluableAspect;
import org.gemoc.arduino.sequential.arduino.aspects.Instruction_ExecutableAspect;
import org.gemoc.arduino.sequential.arduino.aspects.IntegerVariable_EvaluableAspect;
import org.gemoc.arduino.sequential.arduino.aspects.VariableAssignment_ExecutableAspectVariableAssignmentAspectProperties;
import org.gemoc.arduino.sequential.arduino.arduino.BooleanVariable;
import org.gemoc.arduino.sequential.arduino.arduino.Expression;
import org.gemoc.arduino.sequential.arduino.arduino.IntegerVariable;
import org.gemoc.arduino.sequential.arduino.arduino.Variable;
import org.gemoc.arduino.sequential.arduino.arduino.VariableAssignment;

@Aspect(className = VariableAssignment.class)
@SuppressWarnings("all")
public class VariableAssignment_ExecutableAspect extends Instruction_ExecutableAspect {
  @Step
  @OverrideAspectMethod
  public static void execute(final VariableAssignment _self) {
    final org.gemoc.arduino.sequential.arduino.aspects.VariableAssignment_ExecutableAspectVariableAssignmentAspectProperties _self_ = org.gemoc.arduino.sequential.arduino.aspects.VariableAssignment_ExecutableAspectVariableAssignmentAspectContext.getSelf(_self);
     if (_self instanceof org.gemoc.arduino.sequential.arduino.arduino.VariableAssignment){
    					fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
    						@Override
    						public void execute() {
    							org.gemoc.arduino.sequential.arduino.aspects.VariableAssignment_ExecutableAspect._privk3_execute(_self_, (org.gemoc.arduino.sequential.arduino.arduino.VariableAssignment)_self);
    						}
    					};
    					fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager manager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry.getInstance().findStepManager(_self);
    					if (manager != null) {
    						manager.executeStep(_self,command,"VariableAssignment","execute");
    					} else {
    						command.execute();
    					}
    					;
    } else  if (_self instanceof org.gemoc.arduino.sequential.arduino.arduino.Instruction){
    					org.gemoc.arduino.sequential.arduino.aspects.Instruction_ExecutableAspect.execute((org.gemoc.arduino.sequential.arduino.arduino.Instruction)_self);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
  }
  
  private static void super_execute(final VariableAssignment _self) {
    final org.gemoc.arduino.sequential.arduino.aspects.Instruction_ExecutableAspectInstructionAspectProperties _self_ = org.gemoc.arduino.sequential.arduino.aspects.Instruction_ExecutableAspectInstructionAspectContext.getSelf(_self);
     org.gemoc.arduino.sequential.arduino.aspects.Instruction_ExecutableAspect._privk3_execute(_self_, _self);
  }
  
  protected static void _privk3_execute(final VariableAssignment_ExecutableAspectVariableAssignmentAspectProperties _self_, final VariableAssignment _self) {
    final Variable variable = _self.getVariable();
    Expression _operand = _self.getOperand();
    final Object value = Expression_EvaluableAspect.evaluate(_operand);
    if ((variable instanceof IntegerVariable)) {
      IntegerVariable_EvaluableAspect.value(((IntegerVariable)variable), ((Integer) value));
    }
    if ((variable instanceof BooleanVariable)) {
      BooleanVariable_EvaluableAspect.value(((BooleanVariable)variable), ((Boolean) value));
    }
  }
}
