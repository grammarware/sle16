package org.gemoc.arduino.sequential.execarduino.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import org.gemoc.arduino.sequential.execarduino.arduino.Control;
import org.gemoc.arduino.sequential.execarduino.aspects.Control_EvaluableAspectControlAspectProperties;
import org.gemoc.arduino.sequential.execarduino.aspects.Instruction_ExecutableAspect;

@Aspect(className = Control.class)
@SuppressWarnings("all")
public class Control_EvaluableAspect extends Instruction_ExecutableAspect {
  public static Boolean evaluate(final Control _self) {
    org.gemoc.arduino.sequential.execarduino.aspects.Control_EvaluableAspectControlAspectProperties _self_ = org.gemoc.arduino.sequential.execarduino.aspects.Control_EvaluableAspectControlAspectContext.getSelf(_self);
    Object result = null;
     if (_self instanceof org.gemoc.arduino.sequential.execarduino.arduino.If){
    					result = org.gemoc.arduino.sequential.execarduino.aspects.If_EvaluableAspect.evaluate((org.gemoc.arduino.sequential.execarduino.arduino.If)_self);
    } else  if (_self instanceof org.gemoc.arduino.sequential.execarduino.arduino.Repeat){
    					result = org.gemoc.arduino.sequential.execarduino.aspects.Repeat_EvaluableAspect.evaluate((org.gemoc.arduino.sequential.execarduino.arduino.Repeat)_self);
    } else  if (_self instanceof org.gemoc.arduino.sequential.execarduino.arduino.While){
    					result = org.gemoc.arduino.sequential.execarduino.aspects.While_EvaluableAspect.evaluate((org.gemoc.arduino.sequential.execarduino.arduino.While)_self);
    } else  if (_self instanceof org.gemoc.arduino.sequential.execarduino.arduino.Control){
    					result = org.gemoc.arduino.sequential.execarduino.aspects.Control_EvaluableAspect._privk3_evaluate(_self_, (org.gemoc.arduino.sequential.execarduino.arduino.Control)_self);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
    return (java.lang.Boolean)result;
  }
  
  protected static Boolean _privk3_evaluate(final Control_EvaluableAspectControlAspectProperties _self_, final Control _self) {
    return null;
  }
}
