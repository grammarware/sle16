package org.gemoc.arduino.sequential.execarduino.aspects;

import java.util.Map;
import org.gemoc.arduino.sequential.execarduino.arduino.BooleanVariable;
import org.gemoc.arduino.sequential.execarduino.aspects.BooleanVariable_EvaluableAspectBooleanVariableAspectProperties;

@SuppressWarnings("all")
public class BooleanVariable_EvaluableAspectBooleanVariableAspectContext {
  public final static BooleanVariable_EvaluableAspectBooleanVariableAspectContext INSTANCE = new BooleanVariable_EvaluableAspectBooleanVariableAspectContext();
  
  public static BooleanVariable_EvaluableAspectBooleanVariableAspectProperties getSelf(final BooleanVariable _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.gemoc.arduino.sequential.execarduino.aspects.BooleanVariable_EvaluableAspectBooleanVariableAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<BooleanVariable, BooleanVariable_EvaluableAspectBooleanVariableAspectProperties> map = new java.util.WeakHashMap<org.gemoc.arduino.sequential.execarduino.arduino.BooleanVariable, org.gemoc.arduino.sequential.execarduino.aspects.BooleanVariable_EvaluableAspectBooleanVariableAspectProperties>();
  
  public Map<BooleanVariable, BooleanVariable_EvaluableAspectBooleanVariableAspectProperties> getMap() {
    return map;
  }
}
