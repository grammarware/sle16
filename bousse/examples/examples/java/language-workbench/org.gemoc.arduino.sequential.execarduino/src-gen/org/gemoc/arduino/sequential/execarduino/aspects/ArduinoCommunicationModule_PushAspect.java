package org.gemoc.arduino.sequential.execarduino.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Abstract;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import org.gemoc.arduino.sequential.execarduino.arduino.ArduinoCommunicationModule;
import org.gemoc.arduino.sequential.execarduino.aspects.ArduinoCommunicationModule_PushAspectArduinoCommunicationModuleAspectProperties;

@Aspect(className = ArduinoCommunicationModule.class)
@SuppressWarnings("all")
public abstract class ArduinoCommunicationModule_PushAspect {
  @Abstract
  public static void push(final ArduinoCommunicationModule _self) {
    org.gemoc.arduino.sequential.execarduino.aspects.ArduinoCommunicationModule_PushAspectArduinoCommunicationModuleAspectProperties _self_ = org.gemoc.arduino.sequential.execarduino.aspects.ArduinoCommunicationModule_PushAspectArduinoCommunicationModuleAspectContext.getSelf(_self);
     if (_self instanceof org.gemoc.arduino.sequential.execarduino.arduino.BluetoothTransceiver){
    					org.gemoc.arduino.sequential.execarduino.aspects.BluetoothTransceiver_PushAspect.push((org.gemoc.arduino.sequential.execarduino.arduino.BluetoothTransceiver)_self);
    } else  if (_self instanceof org.gemoc.arduino.sequential.execarduino.arduino.ArduinoCommunicationModule){
    					org.gemoc.arduino.sequential.execarduino.aspects.ArduinoCommunicationModule_PushAspect._privk3_push(_self_, (org.gemoc.arduino.sequential.execarduino.arduino.ArduinoCommunicationModule)_self);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
  }
  
  protected static void _privk3_push(final ArduinoCommunicationModule_PushAspectArduinoCommunicationModuleAspectProperties _self_, final ArduinoCommunicationModule _self) {
    throw new java.lang.RuntimeException("Not implemented");
  }
}
