package org.gemoc.arduino.sequential.arduino.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import org.gemoc.arduino.sequential.arduino.aspects.BooleanModuleGet_ExecutableAspectBooleanModuleGetAspectProperties;
import org.gemoc.arduino.sequential.arduino.aspects.Expression_EvaluableAspect;
import org.gemoc.arduino.sequential.arduino.aspects.Instruction_UtilitesAspect;
import org.gemoc.arduino.sequential.arduino.aspects.Pin_EvaluableAspect;
import org.gemoc.arduino.sequential.arduino.arduino.BooleanModuleGet;
import org.gemoc.arduino.sequential.arduino.arduino.Instruction;
import org.gemoc.arduino.sequential.arduino.arduino.Module;
import org.gemoc.arduino.sequential.arduino.arduino.Pin;

@Aspect(className = BooleanModuleGet.class)
@SuppressWarnings("all")
public class BooleanModuleGet_ExecutableAspect extends Expression_EvaluableAspect {
  @OverrideAspectMethod
  public static Object evaluate(final BooleanModuleGet _self) {
    final org.gemoc.arduino.sequential.arduino.aspects.BooleanModuleGet_ExecutableAspectBooleanModuleGetAspectProperties _self_ = org.gemoc.arduino.sequential.arduino.aspects.BooleanModuleGet_ExecutableAspectBooleanModuleGetAspectContext.getSelf(_self);
    Object result = null;
     if (_self instanceof org.gemoc.arduino.sequential.arduino.arduino.BooleanModuleGet){
    					result = org.gemoc.arduino.sequential.arduino.aspects.BooleanModuleGet_ExecutableAspect._privk3_evaluate(_self_, (org.gemoc.arduino.sequential.arduino.arduino.BooleanModuleGet)_self);
    } else  if (_self instanceof org.gemoc.arduino.sequential.arduino.arduino.Expression){
    					result = org.gemoc.arduino.sequential.arduino.aspects.Expression_EvaluableAspect.evaluate((org.gemoc.arduino.sequential.arduino.arduino.Expression)_self);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
    return (java.lang.Object)result;
  }
  
  private static Object super_evaluate(final BooleanModuleGet _self) {
    final org.gemoc.arduino.sequential.arduino.aspects.Expression_EvaluableAspectExpressionAspectProperties _self_ = org.gemoc.arduino.sequential.arduino.aspects.Expression_EvaluableAspectExpressionAspectContext.getSelf(_self);
    return  org.gemoc.arduino.sequential.arduino.aspects.Expression_EvaluableAspect._privk3_evaluate(_self_, _self);
  }
  
  protected static Object _privk3_evaluate(final BooleanModuleGet_ExecutableAspectBooleanModuleGetAspectProperties _self_, final BooleanModuleGet _self) {
    Instruction _instruction = Expression_EvaluableAspect.getInstruction(_self);
    Module _module = _self.getModule();
    final Pin pin = Instruction_UtilitesAspect.getPin(_instruction, _module);
    Integer _level = Pin_EvaluableAspect.level(pin);
    boolean _equals = ((_level).intValue() == 0);
    if (_equals) {
      return Boolean.valueOf(false);
    }
    return Boolean.valueOf(true);
  }
}
