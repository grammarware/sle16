package org.gemoc.arduino.sequential.arduino.aspects;

import java.util.Map;
import org.gemoc.arduino.sequential.arduino.aspects.Control_EvaluableAspectControlAspectProperties;
import org.gemoc.arduino.sequential.arduino.arduino.Control;

@SuppressWarnings("all")
public class Control_EvaluableAspectControlAspectContext {
  public final static Control_EvaluableAspectControlAspectContext INSTANCE = new Control_EvaluableAspectControlAspectContext();
  
  public static Control_EvaluableAspectControlAspectProperties getSelf(final Control _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.gemoc.arduino.sequential.arduino.aspects.Control_EvaluableAspectControlAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Control, Control_EvaluableAspectControlAspectProperties> map = new java.util.WeakHashMap<org.gemoc.arduino.sequential.arduino.arduino.Control, org.gemoc.arduino.sequential.arduino.aspects.Control_EvaluableAspectControlAspectProperties>();
  
  public Map<Control, Control_EvaluableAspectControlAspectProperties> getMap() {
    return map;
  }
}
