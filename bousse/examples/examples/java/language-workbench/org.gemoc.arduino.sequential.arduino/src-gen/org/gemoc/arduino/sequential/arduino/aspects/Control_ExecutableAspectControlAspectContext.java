package org.gemoc.arduino.sequential.arduino.aspects;

import java.util.Map;
import org.gemoc.arduino.sequential.arduino.aspects.Control_ExecutableAspectControlAspectProperties;
import org.gemoc.arduino.sequential.arduino.arduino.Control;

@SuppressWarnings("all")
public class Control_ExecutableAspectControlAspectContext {
  public final static Control_ExecutableAspectControlAspectContext INSTANCE = new Control_ExecutableAspectControlAspectContext();
  
  public static Control_ExecutableAspectControlAspectProperties getSelf(final Control _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.gemoc.arduino.sequential.arduino.aspects.Control_ExecutableAspectControlAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Control, Control_ExecutableAspectControlAspectProperties> map = new java.util.WeakHashMap<org.gemoc.arduino.sequential.arduino.arduino.Control, org.gemoc.arduino.sequential.arduino.aspects.Control_ExecutableAspectControlAspectProperties>();
  
  public Map<Control, Control_ExecutableAspectControlAspectProperties> getMap() {
    return map;
  }
}
