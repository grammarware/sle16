package org.gemoc.arduino.sequential.arduino.aspects;

import java.util.Map;
import org.gemoc.arduino.sequential.arduino.aspects.While_EvaluableAspectWhileAspectProperties;
import org.gemoc.arduino.sequential.arduino.arduino.While;

@SuppressWarnings("all")
public class While_EvaluableAspectWhileAspectContext {
  public final static While_EvaluableAspectWhileAspectContext INSTANCE = new While_EvaluableAspectWhileAspectContext();
  
  public static While_EvaluableAspectWhileAspectProperties getSelf(final While _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.gemoc.arduino.sequential.arduino.aspects.While_EvaluableAspectWhileAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<While, While_EvaluableAspectWhileAspectProperties> map = new java.util.WeakHashMap<org.gemoc.arduino.sequential.arduino.arduino.While, org.gemoc.arduino.sequential.arduino.aspects.While_EvaluableAspectWhileAspectProperties>();
  
  public Map<While, While_EvaluableAspectWhileAspectProperties> getMap() {
    return map;
  }
}
