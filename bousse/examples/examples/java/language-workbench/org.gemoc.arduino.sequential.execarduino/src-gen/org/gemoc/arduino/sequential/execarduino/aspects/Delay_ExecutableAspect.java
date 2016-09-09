package org.gemoc.arduino.sequential.execarduino.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.gemoc.arduino.sequential.execarduino.arduino.Delay;
import org.gemoc.arduino.sequential.execarduino.aspects.Delay_ExecutableAspectDelayAspectProperties;
import org.gemoc.arduino.sequential.execarduino.aspects.Utilities_ExecutableAspect;

@Aspect(className = Delay.class)
@SuppressWarnings("all")
public class Delay_ExecutableAspect extends Utilities_ExecutableAspect {
  @OverrideAspectMethod
  public static void execute(final Delay _self) {
    org.gemoc.arduino.sequential.execarduino.aspects.Delay_ExecutableAspectDelayAspectProperties _self_ = org.gemoc.arduino.sequential.execarduino.aspects.Delay_ExecutableAspectDelayAspectContext.getSelf(_self);
     if (_self instanceof org.gemoc.arduino.sequential.execarduino.arduino.Delay){
    					org.gemoc.arduino.sequential.execarduino.aspects.Delay_ExecutableAspect._privk3_execute(_self_, (org.gemoc.arduino.sequential.execarduino.arduino.Delay)_self);
    } else  if (_self instanceof org.gemoc.arduino.sequential.execarduino.arduino.Utilities){
    					org.gemoc.arduino.sequential.execarduino.aspects.Utilities_ExecutableAspect.execute((org.gemoc.arduino.sequential.execarduino.arduino.Utilities)_self);
    } else  if (_self instanceof org.gemoc.arduino.sequential.execarduino.arduino.Instruction){
    					org.gemoc.arduino.sequential.execarduino.aspects.Instruction_ExecutableAspect.execute((org.gemoc.arduino.sequential.execarduino.arduino.Instruction)_self);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
  }
  
  private static void super_execute(final Delay _self) {
    org.gemoc.arduino.sequential.execarduino.aspects.Utilities_ExecutableAspectUtilitiesAspectProperties _self_ = org.gemoc.arduino.sequential.execarduino.aspects.Utilities_ExecutableAspectUtilitiesAspectContext.getSelf(_self);
     org.gemoc.arduino.sequential.execarduino.aspects.Utilities_ExecutableAspect._privk3_execute(_self_, _self);
  }
  
  protected static void _privk3_execute(final Delay_ExecutableAspectDelayAspectProperties _self_, final Delay _self) {
    try {
      int _value = _self.getValue();
      Thread.sleep(_value);
    } catch (final Throwable _t) {
      if (_t instanceof InterruptedException) {
        final InterruptedException e = (InterruptedException)_t;
        e.printStackTrace();
      } else {
        throw Exceptions.sneakyThrow(_t);
      }
    }
  }
}
