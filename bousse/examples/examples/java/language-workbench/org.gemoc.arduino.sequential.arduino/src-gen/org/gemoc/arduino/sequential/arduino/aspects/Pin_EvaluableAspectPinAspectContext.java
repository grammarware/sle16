package org.gemoc.arduino.sequential.arduino.aspects;

import java.util.Map;
import org.gemoc.arduino.sequential.arduino.aspects.Pin_EvaluableAspectPinAspectProperties;
import org.gemoc.arduino.sequential.arduino.arduino.Pin;

@SuppressWarnings("all")
public class Pin_EvaluableAspectPinAspectContext {
  public final static Pin_EvaluableAspectPinAspectContext INSTANCE = new Pin_EvaluableAspectPinAspectContext();
  
  public static Pin_EvaluableAspectPinAspectProperties getSelf(final Pin _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.gemoc.arduino.sequential.arduino.aspects.Pin_EvaluableAspectPinAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Pin, Pin_EvaluableAspectPinAspectProperties> map = new java.util.WeakHashMap<org.gemoc.arduino.sequential.arduino.arduino.Pin, org.gemoc.arduino.sequential.arduino.aspects.Pin_EvaluableAspectPinAspectProperties>();
  
  public Map<Pin, Pin_EvaluableAspectPinAspectProperties> getMap() {
    return map;
  }
}
