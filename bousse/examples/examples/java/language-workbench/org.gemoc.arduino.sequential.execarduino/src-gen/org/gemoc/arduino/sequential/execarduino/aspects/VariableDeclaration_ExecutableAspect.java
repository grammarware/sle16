package org.gemoc.arduino.sequential.execarduino.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import org.gemoc.arduino.sequential.execarduino.arduino.BooleanVariable;
import org.gemoc.arduino.sequential.execarduino.arduino.IntegerVariable;
import org.gemoc.arduino.sequential.execarduino.arduino.Variable;
import org.gemoc.arduino.sequential.execarduino.arduino.VariableDeclaration;
import org.gemoc.arduino.sequential.execarduino.aspects.BooleanVariable_EvaluableAspect;
import org.gemoc.arduino.sequential.execarduino.aspects.Instruction_ExecutableAspect;
import org.gemoc.arduino.sequential.execarduino.aspects.IntegerVariable_EvaluableAspect;
import org.gemoc.arduino.sequential.execarduino.aspects.VariableDeclaration_ExecutableAspectVariableDeclarationAspectProperties;

@Aspect(className = VariableDeclaration.class)
@SuppressWarnings("all")
public class VariableDeclaration_ExecutableAspect extends Instruction_ExecutableAspect {
  @OverrideAspectMethod
  public static void execute(final VariableDeclaration _self) {
    org.gemoc.arduino.sequential.execarduino.aspects.VariableDeclaration_ExecutableAspectVariableDeclarationAspectProperties _self_ = org.gemoc.arduino.sequential.execarduino.aspects.VariableDeclaration_ExecutableAspectVariableDeclarationAspectContext.getSelf(_self);
     if (_self instanceof org.gemoc.arduino.sequential.execarduino.arduino.VariableDeclaration){
    					org.gemoc.arduino.sequential.execarduino.aspects.VariableDeclaration_ExecutableAspect._privk3_execute(_self_, (org.gemoc.arduino.sequential.execarduino.arduino.VariableDeclaration)_self);
    } else  if (_self instanceof org.gemoc.arduino.sequential.execarduino.arduino.Instruction){
    					org.gemoc.arduino.sequential.execarduino.aspects.Instruction_ExecutableAspect.execute((org.gemoc.arduino.sequential.execarduino.arduino.Instruction)_self);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
  }
  
  private static void super_execute(final VariableDeclaration _self) {
    org.gemoc.arduino.sequential.execarduino.aspects.Instruction_ExecutableAspectInstructionAspectProperties _self_ = org.gemoc.arduino.sequential.execarduino.aspects.Instruction_ExecutableAspectInstructionAspectContext.getSelf(_self);
     org.gemoc.arduino.sequential.execarduino.aspects.Instruction_ExecutableAspect._privk3_execute(_self_, _self);
  }
  
  protected static void _privk3_execute(final VariableDeclaration_ExecutableAspectVariableDeclarationAspectProperties _self_, final VariableDeclaration _self) {
    Variable _variable = _self.getVariable();
    boolean _matched = false;
    if (!_matched) {
      if (_variable instanceof IntegerVariable) {
        _matched=true;
        Variable _variable_1 = _self.getVariable();
        Variable _variable_2 = _self.getVariable();
        int _initialValue = ((IntegerVariable) _variable_2).getInitialValue();
        IntegerVariable_EvaluableAspect.value(((IntegerVariable) _variable_1), Integer.valueOf(_initialValue));
      }
    }
    if (!_matched) {
      if (_variable instanceof BooleanVariable) {
        _matched=true;
        Variable _variable_1 = _self.getVariable();
        Variable _variable_2 = _self.getVariable();
        boolean _isInitialValue = ((BooleanVariable) _variable_2).isInitialValue();
        BooleanVariable_EvaluableAspect.value(((BooleanVariable) _variable_1), Boolean.valueOf(_isInitialValue));
      }
    }
  }
}
