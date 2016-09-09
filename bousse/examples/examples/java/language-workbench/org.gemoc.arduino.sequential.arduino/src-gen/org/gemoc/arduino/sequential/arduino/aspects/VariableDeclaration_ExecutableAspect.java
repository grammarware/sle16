package org.gemoc.arduino.sequential.arduino.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import org.gemoc.arduino.sequential.arduino.aspects.BooleanVariable_EvaluableAspect;
import org.gemoc.arduino.sequential.arduino.aspects.Instruction_ExecutableAspect;
import org.gemoc.arduino.sequential.arduino.aspects.IntegerVariable_EvaluableAspect;
import org.gemoc.arduino.sequential.arduino.aspects.VariableDeclaration_ExecutableAspectVariableDeclarationAspectProperties;
import org.gemoc.arduino.sequential.arduino.arduino.BooleanVariable;
import org.gemoc.arduino.sequential.arduino.arduino.IntegerVariable;
import org.gemoc.arduino.sequential.arduino.arduino.Variable;
import org.gemoc.arduino.sequential.arduino.arduino.VariableDeclaration;

@Aspect(className = VariableDeclaration.class)
@SuppressWarnings("all")
public class VariableDeclaration_ExecutableAspect extends Instruction_ExecutableAspect {
  @Step
  @OverrideAspectMethod
  public static void execute(final VariableDeclaration _self) {
    final org.gemoc.arduino.sequential.arduino.aspects.VariableDeclaration_ExecutableAspectVariableDeclarationAspectProperties _self_ = org.gemoc.arduino.sequential.arduino.aspects.VariableDeclaration_ExecutableAspectVariableDeclarationAspectContext.getSelf(_self);
     if (_self instanceof org.gemoc.arduino.sequential.arduino.arduino.VariableDeclaration){
    					fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
    						@Override
    						public void execute() {
    							org.gemoc.arduino.sequential.arduino.aspects.VariableDeclaration_ExecutableAspect._privk3_execute(_self_, (org.gemoc.arduino.sequential.arduino.arduino.VariableDeclaration)_self);
    						}
    					};
    					fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager manager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry.getInstance().findStepManager(_self);
    					if (manager != null) {
    						manager.executeStep(_self,command,"VariableDeclaration","execute");
    					} else {
    						command.execute();
    					}
    					;
    } else  if (_self instanceof org.gemoc.arduino.sequential.arduino.arduino.Instruction){
    					org.gemoc.arduino.sequential.arduino.aspects.Instruction_ExecutableAspect.execute((org.gemoc.arduino.sequential.arduino.arduino.Instruction)_self);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
  }
  
  private static void super_execute(final VariableDeclaration _self) {
    final org.gemoc.arduino.sequential.arduino.aspects.Instruction_ExecutableAspectInstructionAspectProperties _self_ = org.gemoc.arduino.sequential.arduino.aspects.Instruction_ExecutableAspectInstructionAspectContext.getSelf(_self);
     org.gemoc.arduino.sequential.arduino.aspects.Instruction_ExecutableAspect._privk3_execute(_self_, _self);
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
