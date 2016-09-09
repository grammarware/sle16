package org.gemoc.arduino.sequential.arduino.adapters.arduinomt.arduino;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.eclipse.emf.ecore.EClass;
import org.gemoc.arduino.sequential.arduino.arduino.LED;

@SuppressWarnings("all")
public class LEDAdapter extends EObjectAdapter<LED> implements org.gemoc.arduino.sequential.arduinomt.arduino.LED {
  private org.gemoc.arduino.sequential.arduino.adapters.arduinomt.ArduinoMTAdaptersFactory adaptersFactory;
  
  public LEDAdapter() {
    super(org.gemoc.arduino.sequential.arduino.adapters.arduinomt.ArduinoMTAdaptersFactory.getInstance());
    adaptersFactory = org.gemoc.arduino.sequential.arduino.adapters.arduinomt.ArduinoMTAdaptersFactory.getInstance();
  }
  
  @Override
  public String getName() {
    return adaptee.getName();
  }
  
  @Override
  public void setName(final String o) {
    adaptee.setName(o);
  }
  
  @Override
  public org.gemoc.arduino.sequential.arduinomt.arduino.Color getColor() {
    return org.gemoc.arduino.sequential.arduinomt.arduino.Color.get(adaptee.getColor().getValue());
  }
  
  @Override
  public void setColor(final org.gemoc.arduino.sequential.arduinomt.arduino.Color o) {
    adaptee.setColor(org.gemoc.arduino.sequential.arduino.arduino.Color.get(o.getValue()));
  }
  
  protected final static String NAME_EDEFAULT = null;
  
  protected final static org.gemoc.arduino.sequential.arduinomt.arduino.Color COLOR_EDEFAULT = org.gemoc.arduino.sequential.arduinomt.arduino.Color.BLUE;
  
  @Override
  public EClass eClass() {
    return org.gemoc.arduino.sequential.arduinomt.arduino.ArduinoPackage.eINSTANCE.getLED();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.gemoc.arduino.sequential.arduinomt.arduino.ArduinoPackage.LED__NAME:
    		return getName();
    	case org.gemoc.arduino.sequential.arduinomt.arduino.ArduinoPackage.LED__COLOR:
    		return getColor();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.gemoc.arduino.sequential.arduinomt.arduino.ArduinoPackage.LED__NAME:
    		return getName() != NAME_EDEFAULT;
    	case org.gemoc.arduino.sequential.arduinomt.arduino.ArduinoPackage.LED__COLOR:
    		return getColor() != COLOR_EDEFAULT;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.gemoc.arduino.sequential.arduinomt.arduino.ArduinoPackage.LED__NAME:
    		setName(
    		(java.lang.String)
    		 newValue);
    		return;
    	case org.gemoc.arduino.sequential.arduinomt.arduino.ArduinoPackage.LED__COLOR:
    		setColor(
    		(org.gemoc.arduino.sequential.arduinomt.arduino.Color)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
