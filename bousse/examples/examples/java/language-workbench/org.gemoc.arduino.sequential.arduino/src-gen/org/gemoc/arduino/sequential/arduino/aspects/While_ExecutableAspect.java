package org.gemoc.arduino.sequential.arduino.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import org.gemoc.arduino.sequential.arduino.aspects.Block_ExecutableAspect;
import org.gemoc.arduino.sequential.arduino.aspects.Control_EvaluableAspect;
import org.gemoc.arduino.sequential.arduino.aspects.Control_ExecutableAspect;
import org.gemoc.arduino.sequential.arduino.aspects.While_ExecutableAspectWhileAspectProperties;
import org.gemoc.arduino.sequential.arduino.arduino.Block;
import org.gemoc.arduino.sequential.arduino.arduino.While;

@Aspect(className = While.class)
@SuppressWarnings("all")
public class While_ExecutableAspect extends Control_ExecutableAspect {
  @OverrideAspectMethod
  public static void execute(final While _self) {
    final org.gemoc.arduino.sequential.arduino.aspects.While_ExecutableAspectWhileAspectProperties _self_ = org.gemoc.arduino.sequential.arduino.aspects.While_ExecutableAspectWhileAspectContext.getSelf(_self);
     if (_self instanceof org.gemoc.arduino.sequential.arduino.arduino.While){
    					org.gemoc.arduino.sequential.arduino.aspects.While_ExecutableAspect._privk3_execute(_self_, (org.gemoc.arduino.sequential.arduino.arduino.While)_self);
    } else  if (_self instanceof org.gemoc.arduino.sequential.arduino.arduino.Control){
    					org.gemoc.arduino.sequential.arduino.aspects.Control_ExecutableAspect.execute((org.gemoc.arduino.sequential.arduino.arduino.Control)_self);
    } else  if (_self instanceof org.gemoc.arduino.sequential.arduino.arduino.Instruction){
    					org.gemoc.arduino.sequential.arduino.aspects.Instruction_ExecutableAspect.execute((org.gemoc.arduino.sequential.arduino.arduino.Instruction)_self);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
  }
  
  private static void super_execute(final While _self) {
    final org.gemoc.arduino.sequential.arduino.aspects.Control_ExecutableAspectControlAspectProperties _self_ = org.gemoc.arduino.sequential.arduino.aspects.Control_ExecutableAspectControlAspectContext.getSelf(_self);
     org.gemoc.arduino.sequential.arduino.aspects.Control_ExecutableAspect._privk3_execute(_self_, _self);
  }
  
  protected static void _privk3_execute(final While_ExecutableAspectWhileAspectProperties _self_, final While _self) {
    while ((Control_EvaluableAspect.evaluate(_self)).booleanValue()) {
      Block _block = _self.getBlock();
      Block_ExecutableAspect.execute(_block);
    }
  }
}
