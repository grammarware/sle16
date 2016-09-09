package org.gemoc.arduino.sequential.execarduino.aspects;

import java.util.Map;
import org.gemoc.arduino.sequential.execarduino.arduino.VariableDeclaration;
import org.gemoc.arduino.sequential.execarduino.aspects.VariableDeclaration_ExecutableAspectVariableDeclarationAspectProperties;

@SuppressWarnings("all")
public class VariableDeclaration_ExecutableAspectVariableDeclarationAspectContext {
  public final static VariableDeclaration_ExecutableAspectVariableDeclarationAspectContext INSTANCE = new VariableDeclaration_ExecutableAspectVariableDeclarationAspectContext();
  
  public static VariableDeclaration_ExecutableAspectVariableDeclarationAspectProperties getSelf(final VariableDeclaration _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.gemoc.arduino.sequential.execarduino.aspects.VariableDeclaration_ExecutableAspectVariableDeclarationAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<VariableDeclaration, VariableDeclaration_ExecutableAspectVariableDeclarationAspectProperties> map = new java.util.WeakHashMap<org.gemoc.arduino.sequential.execarduino.arduino.VariableDeclaration, org.gemoc.arduino.sequential.execarduino.aspects.VariableDeclaration_ExecutableAspectVariableDeclarationAspectProperties>();
  
  public Map<VariableDeclaration, VariableDeclaration_ExecutableAspectVariableDeclarationAspectProperties> getMap() {
    return map;
  }
}
