package org.gemoc.arduino.sequential.execarduino.aspects;

import java.util.Map;
import org.gemoc.arduino.sequential.execarduino.arduino.Instruction;
import org.gemoc.arduino.sequential.execarduino.aspects.Instruction_UtilitesAspectInstructionAspectProperties;

@SuppressWarnings("all")
public class Instruction_UtilitesAspectInstructionAspectContext {
  public final static Instruction_UtilitesAspectInstructionAspectContext INSTANCE = new Instruction_UtilitesAspectInstructionAspectContext();
  
  public static Instruction_UtilitesAspectInstructionAspectProperties getSelf(final Instruction _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.gemoc.arduino.sequential.execarduino.aspects.Instruction_UtilitesAspectInstructionAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Instruction, Instruction_UtilitesAspectInstructionAspectProperties> map = new java.util.WeakHashMap<org.gemoc.arduino.sequential.execarduino.arduino.Instruction, org.gemoc.arduino.sequential.execarduino.aspects.Instruction_UtilitesAspectInstructionAspectProperties>();
  
  public Map<Instruction, Instruction_UtilitesAspectInstructionAspectProperties> getMap() {
    return map;
  }
}
