package org.gemoc.arduino.sequential.arduino.aspects;

import java.util.Map;
import org.gemoc.arduino.sequential.arduino.aspects.Constant_EvaluableAspectConstantAspectProperties;
import org.gemoc.arduino.sequential.arduino.arduino.Constant;

@SuppressWarnings("all")
public class Constant_EvaluableAspectConstantAspectContext {
  public final static Constant_EvaluableAspectConstantAspectContext INSTANCE = new Constant_EvaluableAspectConstantAspectContext();
  
  public static Constant_EvaluableAspectConstantAspectProperties getSelf(final Constant _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.gemoc.arduino.sequential.arduino.aspects.Constant_EvaluableAspectConstantAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Constant, Constant_EvaluableAspectConstantAspectProperties> map = new java.util.WeakHashMap<org.gemoc.arduino.sequential.arduino.arduino.Constant, org.gemoc.arduino.sequential.arduino.aspects.Constant_EvaluableAspectConstantAspectProperties>();
  
  public Map<Constant, Constant_EvaluableAspectConstantAspectProperties> getMap() {
    return map;
  }
}
