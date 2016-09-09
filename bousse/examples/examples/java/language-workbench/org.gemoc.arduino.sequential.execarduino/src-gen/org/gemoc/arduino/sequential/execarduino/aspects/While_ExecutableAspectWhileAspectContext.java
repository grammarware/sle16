package org.gemoc.arduino.sequential.execarduino.aspects;

import java.util.Map;
import org.gemoc.arduino.sequential.execarduino.arduino.While;
import org.gemoc.arduino.sequential.execarduino.aspects.While_ExecutableAspectWhileAspectProperties;

@SuppressWarnings("all")
public class While_ExecutableAspectWhileAspectContext {
  public final static While_ExecutableAspectWhileAspectContext INSTANCE = new While_ExecutableAspectWhileAspectContext();
  
  public static While_ExecutableAspectWhileAspectProperties getSelf(final While _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.gemoc.arduino.sequential.execarduino.aspects.While_ExecutableAspectWhileAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<While, While_ExecutableAspectWhileAspectProperties> map = new java.util.WeakHashMap<org.gemoc.arduino.sequential.execarduino.arduino.While, org.gemoc.arduino.sequential.execarduino.aspects.While_ExecutableAspectWhileAspectProperties>();
  
  public Map<While, While_ExecutableAspectWhileAspectProperties> getMap() {
    return map;
  }
}
