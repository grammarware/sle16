package org.gemoc.arduino.sequential.arduino.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import org.gemoc.arduino.sequential.arduino.aspects.BooleanConstant_ExecutableAspectBooleanConstantAspectProperties;
import org.gemoc.arduino.sequential.arduino.aspects.Expression_EvaluableAspect;
import org.gemoc.arduino.sequential.arduino.arduino.BooleanConstant;

@Aspect(className = BooleanConstant.class)
@SuppressWarnings("all")
public class BooleanConstant_ExecutableAspect extends Expression_EvaluableAspect {
  @OverrideAspectMethod
  public static Object evaluate(final BooleanConstant _self) {
    final org.gemoc.arduino.sequential.arduino.aspects.BooleanConstant_ExecutableAspectBooleanConstantAspectProperties _self_ = org.gemoc.arduino.sequential.arduino.aspects.BooleanConstant_ExecutableAspectBooleanConstantAspectContext.getSelf(_self);
    Object result = null;
     if (_self instanceof org.gemoc.arduino.sequential.arduino.arduino.BooleanConstant){
    					result = org.gemoc.arduino.sequential.arduino.aspects.BooleanConstant_ExecutableAspect._privk3_evaluate(_self_, (org.gemoc.arduino.sequential.arduino.arduino.BooleanConstant)_self);
    } else  if (_self instanceof org.gemoc.arduino.sequential.arduino.arduino.Expression){
    					result = org.gemoc.arduino.sequential.arduino.aspects.Expression_EvaluableAspect.evaluate((org.gemoc.arduino.sequential.arduino.arduino.Expression)_self);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
    return (java.lang.Object)result;
  }
  
  private static Object super_evaluate(final BooleanConstant _self) {
    final org.gemoc.arduino.sequential.arduino.aspects.Expression_EvaluableAspectExpressionAspectProperties _self_ = org.gemoc.arduino.sequential.arduino.aspects.Expression_EvaluableAspectExpressionAspectContext.getSelf(_self);
    return  org.gemoc.arduino.sequential.arduino.aspects.Expression_EvaluableAspect._privk3_evaluate(_self_, _self);
  }
  
  protected static Object _privk3_evaluate(final BooleanConstant_ExecutableAspectBooleanConstantAspectProperties _self_, final BooleanConstant _self) {
    return Boolean.valueOf(_self.isValue());
  }
}
