package org.gemoc.arduino.sequential.execarduino.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import org.gemoc.arduino.sequential.execarduino.arduino.Instruction;
import org.gemoc.arduino.sequential.execarduino.aspects.Instruction_ExecutableAspectInstructionAspectProperties;
import org.gemoc.arduino.sequential.execarduino.aspects.Instruction_UtilitesAspect;

@Aspect(className = Instruction.class)
@SuppressWarnings("all")
public class Instruction_ExecutableAspect extends Instruction_UtilitesAspect {
  @Step
  public static void execute(final Instruction _self) {
    org.gemoc.arduino.sequential.execarduino.aspects.Instruction_ExecutableAspectInstructionAspectProperties _self_ = org.gemoc.arduino.sequential.execarduino.aspects.Instruction_ExecutableAspectInstructionAspectContext.getSelf(_self);
     if (_self instanceof org.gemoc.arduino.sequential.execarduino.arduino.ModuleAssignment){
    					org.gemoc.arduino.sequential.execarduino.aspects.ModuleAssignment_ExecutableAspect.execute((org.gemoc.arduino.sequential.execarduino.arduino.ModuleAssignment)_self);
    } else  if (_self instanceof org.gemoc.arduino.sequential.execarduino.arduino.If){
    					org.gemoc.arduino.sequential.execarduino.aspects.If_ExecutableAspect.execute((org.gemoc.arduino.sequential.execarduino.arduino.If)_self);
    } else  if (_self instanceof org.gemoc.arduino.sequential.execarduino.arduino.ModuleInstruction){
    					org.gemoc.arduino.sequential.execarduino.aspects.ModuleInstruction_ExecutableAspect.execute((org.gemoc.arduino.sequential.execarduino.arduino.ModuleInstruction)_self);
    } else  if (_self instanceof org.gemoc.arduino.sequential.execarduino.arduino.Repeat){
    					org.gemoc.arduino.sequential.execarduino.aspects.Repeat_ExecutableAspect.execute((org.gemoc.arduino.sequential.execarduino.arduino.Repeat)_self);
    } else  if (_self instanceof org.gemoc.arduino.sequential.execarduino.arduino.VariableDeclaration){
    					org.gemoc.arduino.sequential.execarduino.aspects.VariableDeclaration_ExecutableAspect.execute((org.gemoc.arduino.sequential.execarduino.arduino.VariableDeclaration)_self);
    } else  if (_self instanceof org.gemoc.arduino.sequential.execarduino.arduino.VariableAssignment){
    					org.gemoc.arduino.sequential.execarduino.aspects.VariableAssignment_ExecutableAspect.execute((org.gemoc.arduino.sequential.execarduino.arduino.VariableAssignment)_self);
    } else  if (_self instanceof org.gemoc.arduino.sequential.execarduino.arduino.While){
    					org.gemoc.arduino.sequential.execarduino.aspects.While_ExecutableAspect.execute((org.gemoc.arduino.sequential.execarduino.arduino.While)_self);
    } else  if (_self instanceof org.gemoc.arduino.sequential.execarduino.arduino.Delay){
    					org.gemoc.arduino.sequential.execarduino.aspects.Delay_ExecutableAspect.execute((org.gemoc.arduino.sequential.execarduino.arduino.Delay)_self);
    } else  if (_self instanceof org.gemoc.arduino.sequential.execarduino.arduino.Utilities){
    					org.gemoc.arduino.sequential.execarduino.aspects.Utilities_ExecutableAspect.execute((org.gemoc.arduino.sequential.execarduino.arduino.Utilities)_self);
    } else  if (_self instanceof org.gemoc.arduino.sequential.execarduino.arduino.Control){
    					org.gemoc.arduino.sequential.execarduino.aspects.Control_ExecutableAspect.execute((org.gemoc.arduino.sequential.execarduino.arduino.Control)_self);
    } else  if (_self instanceof org.gemoc.arduino.sequential.execarduino.arduino.Instruction){
    					fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
    						@Override
    						public void execute() {
    							org.gemoc.arduino.sequential.execarduino.aspects.Instruction_ExecutableAspect._privk3_execute(_self_, (org.gemoc.arduino.sequential.execarduino.arduino.Instruction)_self);
    						}
    					};
    					fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager manager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry.getInstance().findStepManager(_self);
    					if (manager != null) {
    						manager.executeStep(_self,command,"Instruction","execute");
    					} else {
    						command.execute();
    					}
    					;
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
  }
  
  public static void finalize(final Instruction _self) {
    org.gemoc.arduino.sequential.execarduino.aspects.Instruction_ExecutableAspectInstructionAspectProperties _self_ = org.gemoc.arduino.sequential.execarduino.aspects.Instruction_ExecutableAspectInstructionAspectContext.getSelf(_self);
     if (_self instanceof org.gemoc.arduino.sequential.execarduino.arduino.Repeat){
    					org.gemoc.arduino.sequential.execarduino.aspects.Repeat_EvaluableAspect.finalize((org.gemoc.arduino.sequential.execarduino.arduino.Repeat)_self);
    } else  if (_self instanceof org.gemoc.arduino.sequential.execarduino.arduino.Instruction){
    					org.gemoc.arduino.sequential.execarduino.aspects.Instruction_ExecutableAspect._privk3_finalize(_self_, (org.gemoc.arduino.sequential.execarduino.arduino.Instruction)_self);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
  }
  
  protected static void _privk3_execute(final Instruction_ExecutableAspectInstructionAspectProperties _self_, final Instruction _self) {
  }
  
  protected static void _privk3_finalize(final Instruction_ExecutableAspectInstructionAspectProperties _self_, final Instruction _self) {
  }
}
