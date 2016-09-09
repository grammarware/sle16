package org.gemoc.arduino.sequential.execarduino.aspects;

import java.util.Map;
import org.gemoc.arduino.sequential.execarduino.arduino.ArduinoCommunicationModule;
import org.gemoc.arduino.sequential.execarduino.aspects.ArduinoCommunicationModule_PushAspectArduinoCommunicationModuleAspectProperties;

@SuppressWarnings("all")
public class ArduinoCommunicationModule_PushAspectArduinoCommunicationModuleAspectContext {
  public final static ArduinoCommunicationModule_PushAspectArduinoCommunicationModuleAspectContext INSTANCE = new ArduinoCommunicationModule_PushAspectArduinoCommunicationModuleAspectContext();
  
  public static ArduinoCommunicationModule_PushAspectArduinoCommunicationModuleAspectProperties getSelf(final ArduinoCommunicationModule _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.gemoc.arduino.sequential.execarduino.aspects.ArduinoCommunicationModule_PushAspectArduinoCommunicationModuleAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<ArduinoCommunicationModule, ArduinoCommunicationModule_PushAspectArduinoCommunicationModuleAspectProperties> map = new java.util.WeakHashMap<org.gemoc.arduino.sequential.execarduino.arduino.ArduinoCommunicationModule, org.gemoc.arduino.sequential.execarduino.aspects.ArduinoCommunicationModule_PushAspectArduinoCommunicationModuleAspectProperties>();
  
  public Map<ArduinoCommunicationModule, ArduinoCommunicationModule_PushAspectArduinoCommunicationModuleAspectProperties> getMap() {
    return map;
  }
}
