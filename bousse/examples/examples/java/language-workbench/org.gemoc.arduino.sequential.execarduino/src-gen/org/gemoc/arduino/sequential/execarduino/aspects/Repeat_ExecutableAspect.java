package org.gemoc.arduino.sequential.execarduino.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import org.gemoc.arduino.sequential.execarduino.arduino.Block;
import org.gemoc.arduino.sequential.execarduino.arduino.Repeat;
import org.gemoc.arduino.sequential.execarduino.aspects.Block_ExecutableAspect;
import org.gemoc.arduino.sequential.execarduino.aspects.Control_EvaluableAspect;
import org.gemoc.arduino.sequential.execarduino.aspects.Control_ExecutableAspect;
import org.gemoc.arduino.sequential.execarduino.aspects.Instruction_ExecutableAspect;
import org.gemoc.arduino.sequential.execarduino.aspects.Repeat_ExecutableAspectRepeatAspectProperties;

@Aspect(className = Repeat.class)
@SuppressWarnings("all")
public class Repeat_ExecutableAspect extends Control_ExecutableAspect {
  @OverrideAspectMethod
  public static void execute(final Repeat _self) {
    org.gemoc.arduino.sequential.execarduino.aspects.Repeat_ExecutableAspectRepeatAspectProperties _self_ = org.gemoc.arduino.sequential.execarduino.aspects.Repeat_ExecutableAspectRepeatAspectContext.getSelf(_self);
     if (_self instanceof org.gemoc.arduino.sequential.execarduino.arduino.Repeat){
    					org.gemoc.arduino.sequential.execarduino.aspects.Repeat_ExecutableAspect._privk3_execute(_self_, (org.gemoc.arduino.sequential.execarduino.arduino.Repeat)_self);
    } else  if (_self instanceof org.gemoc.arduino.sequential.execarduino.arduino.Control){
    					org.gemoc.arduino.sequential.execarduino.aspects.Control_ExecutableAspect.execute((org.gemoc.arduino.sequential.execarduino.arduino.Control)_self);
    } else  if (_self instanceof org.gemoc.arduino.sequential.execarduino.arduino.Instruction){
    					org.gemoc.arduino.sequential.execarduino.aspects.Instruction_ExecutableAspect.execute((org.gemoc.arduino.sequential.execarduino.arduino.Instruction)_self);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
  }
  
  private static void super_execute(final Repeat _self) {
    org.gemoc.arduino.sequential.execarduino.aspects.Control_ExecutableAspectControlAspectProperties _self_ = org.gemoc.arduino.sequential.execarduino.aspects.Control_ExecutableAspectControlAspectContext.getSelf(_self);
     org.gemoc.arduino.sequential.execarduino.aspects.Control_ExecutableAspect._privk3_execute(_self_, _self);
  }
  
  protected static void _privk3_execute(final Repeat_ExecutableAspectRepeatAspectProperties _self_, final Repeat _self) {
    while ((Control_EvaluableAspect.evaluate(_self)).booleanValue()) {
      Block _block = _self.getBlock();
      Block_ExecutableAspect.execute(_block);
    }
    Instruction_ExecutableAspect.finalize(_self);
  }
}
