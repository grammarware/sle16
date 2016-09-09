package org.gemoc.arduino.sequential.execarduino.aspects;

import java.util.Map;
import org.gemoc.arduino.sequential.execarduino.arduino.IntegerModuleGet;
import org.gemoc.arduino.sequential.execarduino.aspects.IntegerModuleGet_ExecutableAspectIntegerModuleGetAspectProperties;

@SuppressWarnings("all")
public class IntegerModuleGet_ExecutableAspectIntegerModuleGetAspectContext {
  public final static IntegerModuleGet_ExecutableAspectIntegerModuleGetAspectContext INSTANCE = new IntegerModuleGet_ExecutableAspectIntegerModuleGetAspectContext();
  
  public static IntegerModuleGet_ExecutableAspectIntegerModuleGetAspectProperties getSelf(final IntegerModuleGet _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.gemoc.arduino.sequential.execarduino.aspects.IntegerModuleGet_ExecutableAspectIntegerModuleGetAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<IntegerModuleGet, IntegerModuleGet_ExecutableAspectIntegerModuleGetAspectProperties> map = new java.util.WeakHashMap<org.gemoc.arduino.sequential.execarduino.arduino.IntegerModuleGet, org.gemoc.arduino.sequential.execarduino.aspects.IntegerModuleGet_ExecutableAspectIntegerModuleGetAspectProperties>();
  
  public Map<IntegerModuleGet, IntegerModuleGet_ExecutableAspectIntegerModuleGetAspectProperties> getMap() {
    return map;
  }
}
