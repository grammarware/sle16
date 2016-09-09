package org.gemoc.arduino.sequential.arduino.adapters.arduinomt;

import fr.inria.diverse.melange.adapters.ResourceAdapter;
import java.io.IOException;
import java.util.Set;
import org.eclipse.emf.common.util.URI;

@SuppressWarnings("all")
public class ArduinoAdapter extends ResourceAdapter implements org.gemoc.arduino.sequential.ArduinoMT {
  public ArduinoAdapter() {
    super(org.gemoc.arduino.sequential.arduino.adapters.arduinomt.ArduinoMTAdaptersFactory.getInstance());
  }
  
  @Override
  public org.gemoc.arduino.sequential.arduinomt.arduino.ArduinoFactory getArduinoFactory() {
    return new org.gemoc.arduino.sequential.arduino.adapters.arduinomt.arduino.ArduinoFactoryAdapter();
  }
  
  @Override
  public Set getFactories() {
    java.util.Set<org.eclipse.emf.ecore.EFactory> res = new java.util.HashSet<org.eclipse.emf.ecore.EFactory>();
    res.add(getArduinoFactory());
    return res;
  }
  
  @Override
  public void save(final String uri) throws IOException {
    this.adaptee.setURI(URI.createURI(uri));
    this.adaptee.save(null);
  }
}
