package org.gemoc.arduino.sequential;

import fr.inria.diverse.melange.lib.IMetamodel;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

@SuppressWarnings("all")
public class Arduino implements IMetamodel {
  private Resource resource;
  
  public Resource getResource() {
    return this.resource;
  }
  
  public void setResource(final Resource resource) {
    this.resource = resource;
  }
  
  public static org.gemoc.arduino.sequential.Arduino load(final String uri) {
    ResourceSet rs = new ResourceSetImpl();
    Resource res = rs.getResource(URI.createURI(uri), true);
    Arduino mm = new Arduino();
    mm.setResource(res);
    return mm ;
  }
  
  public org.gemoc.arduino.sequential.ArduinoMT toArduinoMT() {
    org.gemoc.arduino.sequential.arduino.adapters.arduinomt.ArduinoAdapter adaptee = new org.gemoc.arduino.sequential.arduino.adapters.arduinomt.ArduinoAdapter() ;
    adaptee.setAdaptee(resource);
    return adaptee;
  }
}
