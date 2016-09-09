package org.gemoc.arduino.sequential.arduino.aspects;

import java.util.Map;
import org.gemoc.arduino.sequential.arduino.aspects.IntegerConstant_ExecutableAspectIntegerConstantAspectProperties;
import org.gemoc.arduino.sequential.arduino.arduino.IntegerConstant;

@SuppressWarnings("all")
public class IntegerConstant_ExecutableAspectIntegerConstantAspectContext {
  public final static IntegerConstant_ExecutableAspectIntegerConstantAspectContext INSTANCE = new IntegerConstant_ExecutableAspectIntegerConstantAspectContext();
  
  public static IntegerConstant_ExecutableAspectIntegerConstantAspectProperties getSelf(final IntegerConstant _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.gemoc.arduino.sequential.arduino.aspects.IntegerConstant_ExecutableAspectIntegerConstantAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<IntegerConstant, IntegerConstant_ExecutableAspectIntegerConstantAspectProperties> map = new java.util.WeakHashMap<org.gemoc.arduino.sequential.arduino.arduino.IntegerConstant, org.gemoc.arduino.sequential.arduino.aspects.IntegerConstant_ExecutableAspectIntegerConstantAspectProperties>();
  
  public Map<IntegerConstant, IntegerConstant_ExecutableAspectIntegerConstantAspectProperties> getMap() {
    return map;
  }
}
