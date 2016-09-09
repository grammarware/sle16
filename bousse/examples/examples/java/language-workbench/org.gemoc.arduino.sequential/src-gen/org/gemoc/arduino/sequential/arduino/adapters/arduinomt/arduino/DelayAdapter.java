package org.gemoc.arduino.sequential.arduino.adapters.arduinomt.arduino;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.eclipse.emf.ecore.EClass;
import org.gemoc.arduino.sequential.arduino.arduino.Delay;

@SuppressWarnings("all")
public class DelayAdapter extends EObjectAdapter<Delay> implements org.gemoc.arduino.sequential.arduinomt.arduino.Delay {
  private org.gemoc.arduino.sequential.arduino.adapters.arduinomt.ArduinoMTAdaptersFactory adaptersFactory;
  
  public DelayAdapter() {
    super(org.gemoc.arduino.sequential.arduino.adapters.arduinomt.ArduinoMTAdaptersFactory.getInstance());
    adaptersFactory = org.gemoc.arduino.sequential.arduino.adapters.arduinomt.ArduinoMTAdaptersFactory.getInstance();
  }
  
  @Override
  public org.gemoc.arduino.sequential.arduinomt.arduino.Time getUnit() {
    return org.gemoc.arduino.sequential.arduinomt.arduino.Time.get(adaptee.getUnit().getValue());
  }
  
  @Override
  public void setUnit(final org.gemoc.arduino.sequential.arduinomt.arduino.Time o) {
    adaptee.setUnit(org.gemoc.arduino.sequential.arduino.arduino.Time.get(o.getValue()));
  }
  
  @Override
  public int getValue() {
    return adaptee.getValue();
  }
  
  @Override
  public void setValue(final int o) {
    adaptee.setValue(o);
  }
  
  @Override
  public void execute() {
    org.gemoc.arduino.sequential.arduino.aspects.Delay_ExecutableAspect.execute(adaptee);
  }
  
  @Override
  public void finalize() {
    org.gemoc.arduino.sequential.arduino.aspects.Instruction_ExecutableAspect.finalize(adaptee);
  }
  
  protected final static org.gemoc.arduino.sequential.arduinomt.arduino.Time UNIT_EDEFAULT = org.gemoc.arduino.sequential.arduinomt.arduino.Time.MILLI_SECOND;
  
  protected final static int VALUE_EDEFAULT = 0;
  
  @Override
  public EClass eClass() {
    return org.gemoc.arduino.sequential.arduinomt.arduino.ArduinoPackage.eINSTANCE.getDelay();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.gemoc.arduino.sequential.arduinomt.arduino.ArduinoPackage.DELAY__UNIT:
    		return getUnit();
    	case org.gemoc.arduino.sequential.arduinomt.arduino.ArduinoPackage.DELAY__VALUE:
    		return new java.lang.Integer(getValue());
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.gemoc.arduino.sequential.arduinomt.arduino.ArduinoPackage.DELAY__UNIT:
    		return getUnit() != UNIT_EDEFAULT;
    	case org.gemoc.arduino.sequential.arduinomt.arduino.ArduinoPackage.DELAY__VALUE:
    		return getValue() != VALUE_EDEFAULT;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.gemoc.arduino.sequential.arduinomt.arduino.ArduinoPackage.DELAY__UNIT:
    		setUnit(
    		(org.gemoc.arduino.sequential.arduinomt.arduino.Time)
    		 newValue);
    		return;
    	case org.gemoc.arduino.sequential.arduinomt.arduino.ArduinoPackage.DELAY__VALUE:
    		setValue(((java.lang.Integer) newValue).intValue());
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
