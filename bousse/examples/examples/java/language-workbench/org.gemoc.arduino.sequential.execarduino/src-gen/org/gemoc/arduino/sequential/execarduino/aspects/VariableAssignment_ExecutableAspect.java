package org.gemoc.arduino.sequential.execarduino.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import org.gemoc.arduino.sequential.execarduino.arduino.BooleanVariable;
import org.gemoc.arduino.sequential.execarduino.arduino.Expression;
import org.gemoc.arduino.sequential.execarduino.arduino.IntegerVariable;
import org.gemoc.arduino.sequential.execarduino.arduino.Variable;
import org.gemoc.arduino.sequential.execarduino.arduino.VariableAssignment;
import org.gemoc.arduino.sequential.execarduino.aspects.BooleanVariable_EvaluableAspect;
import org.gemoc.arduino.sequential.execarduino.aspects.Expression_EvaluableAspect;
import org.gemoc.arduino.sequential.execarduino.aspects.Instruction_ExecutableAspect;
import org.gemoc.arduino.sequential.execarduino.aspects.IntegerVariable_EvaluableAspect;
import org.gemoc.arduino.sequential.execarduino.aspects.VariableAssignment_ExecutableAspectVariableAssignmentAspectProperties;

@Aspect(className = VariableAssignment.class)
@SuppressWarnings("all")
public class VariableAssignment_ExecutableAspect extends Instruction_ExecutableAspect {
  @OverrideAspectMethod
  public static void execute(final VariableAssignment _self) {
    org.gemoc.arduino.sequential.execarduino.aspects.VariableAssignment_ExecutableAspectVariableAssignmentAspectProperties _self_ = org.gemoc.arduino.sequential.execarduino.aspects.VariableAssignment_ExecutableAspectVariableAssignmentAspectContext.getSelf(_self);
     if (_self instanceof org.gemoc.arduino.sequential.execarduino.arduino.VariableAssignment){
    					org.gemoc.arduino.sequential.execarduino.aspects.VariableAssignment_ExecutableAspect._privk3_execute(_self_, (org.gemoc.arduino.sequential.execarduino.arduino.VariableAssignment)_self);
    } else  if (_self instanceof org.gemoc.arduino.sequential.execarduino.arduino.Instruction){
    					org.gemoc.arduino.sequential.execarduino.aspects.Instruction_ExecutableAspect.execute((org.gemoc.arduino.sequential.execarduino.arduino.Instruction)_self);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
  }
  
  private static void super_execute(final VariableAssignment _self) {
    org.gemoc.arduino.sequential.execarduino.aspects.Instruction_ExecutableAspectInstructionAspectProperties _self_ = org.gemoc.arduino.sequential.execarduino.aspects.Instruction_ExecutableAspectInstructionAspectContext.getSelf(_self);
     org.gemoc.arduino.sequential.execarduino.aspects.Instruction_ExecutableAspect._privk3_execute(_self_, _self);
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
