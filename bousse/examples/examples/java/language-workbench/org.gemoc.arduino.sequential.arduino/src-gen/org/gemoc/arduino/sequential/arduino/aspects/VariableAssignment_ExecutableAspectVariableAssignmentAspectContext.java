package org.gemoc.arduino.sequential.arduino.aspects;

import java.util.Map;
import org.gemoc.arduino.sequential.arduino.aspects.VariableAssignment_ExecutableAspectVariableAssignmentAspectProperties;
import org.gemoc.arduino.sequential.arduino.arduino.VariableAssignment;

@SuppressWarnings("all")
public class VariableAssignment_ExecutableAspectVariableAssignmentAspectContext {
  public final static VariableAssignment_ExecutableAspectVariableAssignmentAspectContext INSTANCE = new VariableAssignment_ExecutableAspectVariableAssignmentAspectContext();
  
  public static VariableAssignment_ExecutableAspectVariableAssignmentAspectProperties getSelf(final VariableAssignment _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.gemoc.arduino.sequential.arduino.aspects.VariableAssignment_ExecutableAspectVariableAssignmentAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<VariableAssignment, VariableAssignment_ExecutableAspectVariableAssignmentAspectProperties> map = new java.util.WeakHashMap<org.gemoc.arduino.sequential.arduino.arduino.VariableAssignment, org.gemoc.arduino.sequential.arduino.aspects.VariableAssignment_ExecutableAspectVariableAssignmentAspectProperties>();
  
  public Map<VariableAssignment, VariableAssignment_ExecutableAspectVariableAssignmentAspectProperties> getMap() {
    return map;
  }
}
