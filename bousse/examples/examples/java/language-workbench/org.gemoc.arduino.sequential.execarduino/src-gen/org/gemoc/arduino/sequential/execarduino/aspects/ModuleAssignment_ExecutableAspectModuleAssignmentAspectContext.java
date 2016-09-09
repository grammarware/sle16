package org.gemoc.arduino.sequential.execarduino.aspects;

import java.util.Map;
import org.gemoc.arduino.sequential.execarduino.arduino.ModuleAssignment;
import org.gemoc.arduino.sequential.execarduino.aspects.ModuleAssignment_ExecutableAspectModuleAssignmentAspectProperties;

@SuppressWarnings("all")
public class ModuleAssignment_ExecutableAspectModuleAssignmentAspectContext {
  public final static ModuleAssignment_ExecutableAspectModuleAssignmentAspectContext INSTANCE = new ModuleAssignment_ExecutableAspectModuleAssignmentAspectContext();
  
  public static ModuleAssignment_ExecutableAspectModuleAssignmentAspectProperties getSelf(final ModuleAssignment _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.gemoc.arduino.sequential.execarduino.aspects.ModuleAssignment_ExecutableAspectModuleAssignmentAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<ModuleAssignment, ModuleAssignment_ExecutableAspectModuleAssignmentAspectProperties> map = new java.util.WeakHashMap<org.gemoc.arduino.sequential.execarduino.arduino.ModuleAssignment, org.gemoc.arduino.sequential.execarduino.aspects.ModuleAssignment_ExecutableAspectModuleAssignmentAspectProperties>();
  
  public Map<ModuleAssignment, ModuleAssignment_ExecutableAspectModuleAssignmentAspectProperties> getMap() {
    return map;
  }
}
