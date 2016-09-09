package org.gemoc.arduino.sequential.execarduino.aspects;

import com.google.common.base.Objects;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import java.util.List;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.gemoc.arduino.sequential.execarduino.arduino.BluetoothTransceiver;
import org.gemoc.arduino.sequential.execarduino.arduino.Instruction;
import org.gemoc.arduino.sequential.execarduino.arduino.IntegerModuleGet;
import org.gemoc.arduino.sequential.execarduino.arduino.Module;
import org.gemoc.arduino.sequential.execarduino.arduino.Pin;
import org.gemoc.arduino.sequential.execarduino.aspects.BluetoothTransceiver_PushAspect;
import org.gemoc.arduino.sequential.execarduino.aspects.Expression_EvaluableAspect;
import org.gemoc.arduino.sequential.execarduino.aspects.Instruction_UtilitesAspect;
import org.gemoc.arduino.sequential.execarduino.aspects.IntegerModuleGet_ExecutableAspectIntegerModuleGetAspectProperties;
import org.gemoc.arduino.sequential.execarduino.aspects.Pin_EvaluableAspect;

@Aspect(className = IntegerModuleGet.class)
@SuppressWarnings("all")
public class IntegerModuleGet_ExecutableAspect extends Expression_EvaluableAspect {
  @OverrideAspectMethod
  public static Object evaluate(final IntegerModuleGet _self) {
    org.gemoc.arduino.sequential.execarduino.aspects.IntegerModuleGet_ExecutableAspectIntegerModuleGetAspectProperties _self_ = org.gemoc.arduino.sequential.execarduino.aspects.IntegerModuleGet_ExecutableAspectIntegerModuleGetAspectContext.getSelf(_self);
    Object result = null;
     if (_self instanceof org.gemoc.arduino.sequential.execarduino.arduino.IntegerModuleGet){
    					result = org.gemoc.arduino.sequential.execarduino.aspects.IntegerModuleGet_ExecutableAspect._privk3_evaluate(_self_, (org.gemoc.arduino.sequential.execarduino.arduino.IntegerModuleGet)_self);
    } else  if (_self instanceof org.gemoc.arduino.sequential.execarduino.arduino.Expression){
    					result = org.gemoc.arduino.sequential.execarduino.aspects.Expression_EvaluableAspect.evaluate((org.gemoc.arduino.sequential.execarduino.arduino.Expression)_self);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
    return (java.lang.Object)result;
  }
  
  private static Object super_evaluate(final IntegerModuleGet _self) {
    org.gemoc.arduino.sequential.execarduino.aspects.Expression_EvaluableAspectExpressionAspectProperties _self_ = org.gemoc.arduino.sequential.execarduino.aspects.Expression_EvaluableAspectExpressionAspectContext.getSelf(_self);
    return  org.gemoc.arduino.sequential.execarduino.aspects.Expression_EvaluableAspect._privk3_evaluate(_self_, _self);
  }
  
  protected static Object _privk3_evaluate(final IntegerModuleGet_ExecutableAspectIntegerModuleGetAspectProperties _self_, final IntegerModuleGet _self) {
    Module _module = _self.getModule();
    if ((_module instanceof BluetoothTransceiver)) {
      Module _module_1 = _self.getModule();
      final List<Integer> l = BluetoothTransceiver_PushAspect.dataReceived(((BluetoothTransceiver) _module_1));
      final Integer res = IterableExtensions.<Integer>head(l);
      boolean _notEquals = (!Objects.equal(res, null));
      if (_notEquals) {
        l.remove(0);
        return res;
      } else {
        return Integer.valueOf(0);
      }
    }
    Instruction _instruction = Expression_EvaluableAspect.getInstruction(_self);
    Module _module_2 = _self.getModule();
    final Pin pin = Instruction_UtilitesAspect.getPin(_instruction, _module_2);
    return Pin_EvaluableAspect.level(pin);
  }
}
