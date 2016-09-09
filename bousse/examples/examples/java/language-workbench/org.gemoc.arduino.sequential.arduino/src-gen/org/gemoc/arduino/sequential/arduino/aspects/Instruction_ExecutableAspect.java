package org.gemoc.arduino.sequential.arduino.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import org.gemoc.arduino.sequential.arduino.aspects.Instruction_ExecutableAspectInstructionAspectProperties;
import org.gemoc.arduino.sequential.arduino.aspects.Instruction_UtilitesAspect;
import org.gemoc.arduino.sequential.arduino.arduino.Instruction;

@Aspect(className = Instruction.class)
@SuppressWarnings("all")
public class Instruction_ExecutableAspect extends Instruction_UtilitesAspect {
  public static void execute(final Instruction _self) {
    final org.gemoc.arduino.sequential.arduino.aspects.Instruction_ExecutableAspectInstructionAspectProperties _self_ = org.gemoc.arduino.sequential.arduino.aspects.Instruction_ExecutableAspectInstructionAspectContext.getSelf(_self);
     if (_self instanceof org.gemoc.arduino.sequential.arduino.arduino.While){
    					org.gemoc.arduino.sequential.arduino.aspects.While_ExecutableAspect.execute((org.gemoc.arduino.sequential.arduino.arduino.While)_self);
    } else  if (_self instanceof org.gemoc.arduino.sequential.arduino.arduino.Delay){
    					org.gemoc.arduino.sequential.arduino.aspects.Delay_ExecutableAspect.execute((org.gemoc.arduino.sequential.arduino.arduino.Delay)_self);
    } else  if (_self instanceof org.gemoc.arduino.sequential.arduino.arduino.If){
    					org.gemoc.arduino.sequential.arduino.aspects.If_ExecutableAspect.execute((org.gemoc.arduino.sequential.arduino.arduino.If)_self);
    } else  if (_self instanceof org.gemoc.arduino.sequential.arduino.arduino.ModuleAssignment){
    					org.gemoc.arduino.sequential.arduino.aspects.ModuleAssignment_ExecutableAspect.execute((org.gemoc.arduino.sequential.arduino.arduino.ModuleAssignment)_self);
    } else  if (_self instanceof org.gemoc.arduino.sequential.arduino.arduino.Repeat){
    					org.gemoc.arduino.sequential.arduino.aspects.Repeat_ExecutableAspect.execute((org.gemoc.arduino.sequential.arduino.arduino.Repeat)_self);
    } else  if (_self instanceof org.gemoc.arduino.sequential.arduino.arduino.Control){
    					org.gemoc.arduino.sequential.arduino.aspects.Control_ExecutableAspect.execute((org.gemoc.arduino.sequential.arduino.arduino.Control)_self);
    } else  if (_self instanceof org.gemoc.arduino.sequential.arduino.arduino.VariableDeclaration){
    					org.gemoc.arduino.sequential.arduino.aspects.VariableDeclaration_ExecutableAspect.execute((org.gemoc.arduino.sequential.arduino.arduino.VariableDeclaration)_self);
    } else  if (_self instanceof org.gemoc.arduino.sequential.arduino.arduino.Utilities){
    					org.gemoc.arduino.sequential.arduino.aspects.Utilities_ExecutableAspect.execute((org.gemoc.arduino.sequential.arduino.arduino.Utilities)_self);
    } else  if (_self instanceof org.gemoc.arduino.sequential.arduino.arduino.VariableAssignment){
    					org.gemoc.arduino.sequential.arduino.aspects.VariableAssignment_ExecutableAspect.execute((org.gemoc.arduino.sequential.arduino.arduino.VariableAssignment)_self);
    } else  if (_self instanceof org.gemoc.arduino.sequential.arduino.arduino.ModuleInstruction){
    					org.gemoc.arduino.sequential.arduino.aspects.ModuleInstruction_ExecutableAspect.execute((org.gemoc.arduino.sequential.arduino.arduino.ModuleInstruction)_self);
    } else  if (_self instanceof org.gemoc.arduino.sequential.arduino.arduino.Instruction){
    					org.gemoc.arduino.sequential.arduino.aspects.Instruction_ExecutableAspect._privk3_execute(_self_, (org.gemoc.arduino.sequential.arduino.arduino.Instruction)_self);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
  }
  
  public static void finalize(final Instruction _self) {
    final org.gemoc.arduino.sequential.arduino.aspects.Instruction_ExecutableAspectInstructionAspectProperties _self_ = org.gemoc.arduino.sequential.arduino.aspects.Instruction_ExecutableAspectInstructionAspectContext.getSelf(_self);
     if (_self instanceof org.gemoc.arduino.sequential.arduino.arduino.Repeat){
    					org.gemoc.arduino.sequential.arduino.aspects.Repeat_EvaluableAspect.finalize((org.gemoc.arduino.sequential.arduino.arduino.Repeat)_self);
    } else  if (_self instanceof org.gemoc.arduino.sequential.arduino.arduino.Instruction){
    					org.gemoc.arduino.sequential.arduino.aspects.Instruction_ExecutableAspect._privk3_finalize(_self_, (org.gemoc.arduino.sequential.arduino.arduino.Instruction)_self);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
  }
  
  protected static void _privk3_execute(final Instruction_ExecutableAspectInstructionAspectProperties _self_, final Instruction _self) {
  }
  
  protected static void _privk3_finalize(final Instruction_ExecutableAspectInstructionAspectProperties _self_, final Instruction _self) {
  }
}
