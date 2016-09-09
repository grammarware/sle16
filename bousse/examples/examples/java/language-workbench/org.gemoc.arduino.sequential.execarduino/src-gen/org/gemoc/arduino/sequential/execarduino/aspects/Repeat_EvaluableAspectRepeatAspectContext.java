package org.gemoc.arduino.sequential.execarduino.aspects;

import java.util.Map;
import org.gemoc.arduino.sequential.execarduino.arduino.Repeat;
import org.gemoc.arduino.sequential.execarduino.aspects.Repeat_EvaluableAspectRepeatAspectProperties;

@SuppressWarnings("all")
public class Repeat_EvaluableAspectRepeatAspectContext {
  public final static Repeat_EvaluableAspectRepeatAspectContext INSTANCE = new Repeat_EvaluableAspectRepeatAspectContext();
  
  public static Repeat_EvaluableAspectRepeatAspectProperties getSelf(final Repeat _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.gemoc.arduino.sequential.execarduino.aspects.Repeat_EvaluableAspectRepeatAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Repeat, Repeat_EvaluableAspectRepeatAspectProperties> map = new java.util.WeakHashMap<org.gemoc.arduino.sequential.execarduino.arduino.Repeat, org.gemoc.arduino.sequential.execarduino.aspects.Repeat_EvaluableAspectRepeatAspectProperties>();
  
  public Map<Repeat, Repeat_EvaluableAspectRepeatAspectProperties> getMap() {
    return map;
  }
}
