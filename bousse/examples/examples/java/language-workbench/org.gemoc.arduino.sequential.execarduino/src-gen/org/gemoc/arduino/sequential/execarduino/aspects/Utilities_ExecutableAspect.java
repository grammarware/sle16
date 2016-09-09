package org.gemoc.arduino.sequential.execarduino.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import org.gemoc.arduino.sequential.execarduino.arduino.Utilities;
import org.gemoc.arduino.sequential.execarduino.aspects.Instruction_ExecutableAspect;
import org.gemoc.arduino.sequential.execarduino.aspects.Utilities_ExecutableAspectUtilitiesAspectProperties;

@Aspect(className = Utilities.class)
@SuppressWarnings("all")
public class Utilities_ExecutableAspect extends Instruction_ExecutableAspect {
  @OverrideAspectMethod
  public static void execute(final Utilities _self) {
    org.gemoc.arduino.sequential.execarduino.aspects.Utilities_ExecutableAspectUtilitiesAspectProperties _self_ = org.gemoc.arduino.sequential.execarduino.aspects.Utilities_ExecutableAspectUtilitiesAspectContext.getSelf(_self);
     if (_self instanceof org.gemoc.arduino.sequential.execarduino.arduino.Delay){
    					org.gemoc.arduino.sequential.execarduino.aspects.Delay_ExecutableAspect.execute((org.gemoc.arduino.sequential.execarduino.arduino.Delay)_self);
    } else  if (_self instanceof org.gemoc.arduino.sequential.execarduino.arduino.Utilities){
    					org.gemoc.arduino.sequential.execarduino.aspects.Utilities_ExecutableAspect._privk3_execute(_self_, (org.gemoc.arduino.sequential.execarduino.arduino.Utilities)_self);
    } else  if (_self instanceof org.gemoc.arduino.sequential.execarduino.arduino.Instruction){
    					org.gemoc.arduino.sequential.execarduino.aspects.Instruction_ExecutableAspect.execute((org.gemoc.arduino.sequential.execarduino.arduino.Instruction)_self);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
  }
  
  private static void super_execute(final Utilities _self) {
    org.gemoc.arduino.sequential.execarduino.aspects.Instruction_ExecutableAspectInstructionAspectProperties _self_ = org.gemoc.arduino.sequential.execarduino.aspects.Instruction_ExecutableAspectInstructionAspectContext.getSelf(_self);
     org.gemoc.arduino.sequential.execarduino.aspects.Instruction_ExecutableAspect._privk3_execute(_self_, _self);
  }
  
  protected static void _privk3_execute(final Utilities_ExecutableAspectUtilitiesAspectProperties _self_, final Utilities _self) {
  }
}
