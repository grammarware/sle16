package org.gemoc.arduino.sequential.arduino.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import org.gemoc.arduino.sequential.arduino.aspects.Control_ExecutableAspectControlAspectProperties;
import org.gemoc.arduino.sequential.arduino.aspects.Instruction_ExecutableAspect;
import org.gemoc.arduino.sequential.arduino.arduino.Control;

@Aspect(className = Control.class)
@SuppressWarnings("all")
public class Control_ExecutableAspect extends Instruction_ExecutableAspect {
  @OverrideAspectMethod
  public static void execute(final Control _self) {
    final org.gemoc.arduino.sequential.arduino.aspects.Control_ExecutableAspectControlAspectProperties _self_ = org.gemoc.arduino.sequential.arduino.aspects.Control_ExecutableAspectControlAspectContext.getSelf(_self);
     if (_self instanceof org.gemoc.arduino.sequential.arduino.arduino.While){
    					org.gemoc.arduino.sequential.arduino.aspects.While_ExecutableAspect.execute((org.gemoc.arduino.sequential.arduino.arduino.While)_self);
    } else  if (_self instanceof org.gemoc.arduino.sequential.arduino.arduino.If){
    					org.gemoc.arduino.sequential.arduino.aspects.If_ExecutableAspect.execute((org.gemoc.arduino.sequential.arduino.arduino.If)_self);
    } else  if (_self instanceof org.gemoc.arduino.sequential.arduino.arduino.Repeat){
    					org.gemoc.arduino.sequential.arduino.aspects.Repeat_ExecutableAspect.execute((org.gemoc.arduino.sequential.arduino.arduino.Repeat)_self);
    } else  if (_self instanceof org.gemoc.arduino.sequential.arduino.arduino.Control){
    					org.gemoc.arduino.sequential.arduino.aspects.Control_ExecutableAspect._privk3_execute(_self_, (org.gemoc.arduino.sequential.arduino.arduino.Control)_self);
    } else  if (_self instanceof org.gemoc.arduino.sequential.arduino.arduino.Instruction){
    					org.gemoc.arduino.sequential.arduino.aspects.Instruction_ExecutableAspect.execute((org.gemoc.arduino.sequential.arduino.arduino.Instruction)_self);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
  }
  
  private static void super_execute(final Control _self) {
    final org.gemoc.arduino.sequential.arduino.aspects.Instruction_ExecutableAspectInstructionAspectProperties _self_ = org.gemoc.arduino.sequential.arduino.aspects.Instruction_ExecutableAspectInstructionAspectContext.getSelf(_self);
     org.gemoc.arduino.sequential.arduino.aspects.Instruction_ExecutableAspect._privk3_execute(_self_, _self);
  }
  
  protected static void _privk3_execute(final Control_ExecutableAspectControlAspectProperties _self_, final Control _self) {
  }
}
