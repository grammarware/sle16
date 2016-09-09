package org.gemoc.arduino.sequential.execarduino.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Abstract;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import org.gemoc.arduino.sequential.execarduino.arduino.Variable;
import org.gemoc.arduino.sequential.execarduino.aspects.Variable_EvaluableAspectVariableAspectProperties;

@Aspect(className = Variable.class)
@SuppressWarnings("all")
public abstract class Variable_EvaluableAspect {
  @Abstract
  public static Object evaluate(final Variable _self) {
    org.gemoc.arduino.sequential.execarduino.aspects.Variable_EvaluableAspectVariableAspectProperties _self_ = org.gemoc.arduino.sequential.execarduino.aspects.Variable_EvaluableAspectVariableAspectContext.getSelf(_self);
    Object result = null;
     if (_self instanceof org.gemoc.arduino.sequential.execarduino.arduino.IntegerVariable){
    					result = org.gemoc.arduino.sequential.execarduino.aspects.IntegerVariable_EvaluableAspect.evaluate((org.gemoc.arduino.sequential.execarduino.arduino.IntegerVariable)_self);
    } else  if (_self instanceof org.gemoc.arduino.sequential.execarduino.arduino.BooleanVariable){
    					result = org.gemoc.arduino.sequential.execarduino.aspects.BooleanVariable_EvaluableAspect.evaluate((org.gemoc.arduino.sequential.execarduino.arduino.BooleanVariable)_self);
    } else  if (_self instanceof org.gemoc.arduino.sequential.execarduino.arduino.Variable){
    					result = org.gemoc.arduino.sequential.execarduino.aspects.Variable_EvaluableAspect._privk3_evaluate(_self_, (org.gemoc.arduino.sequential.execarduino.arduino.Variable)_self);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
    return (java.lang.Object)result;
  }
  
  protected static Object _privk3_evaluate(final Variable_EvaluableAspectVariableAspectProperties _self_, final Variable _self) {
    throw new java.lang.RuntimeException("Not implemented");
  }
}
