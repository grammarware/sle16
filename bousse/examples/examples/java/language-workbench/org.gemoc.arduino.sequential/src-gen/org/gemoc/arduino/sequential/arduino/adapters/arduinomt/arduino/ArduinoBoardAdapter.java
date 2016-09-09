package org.gemoc.arduino.sequential.arduino.adapters.arduinomt.arduino;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.gemoc.arduino.sequential.arduino.arduino.ArduinoBoard;

@SuppressWarnings("all")
public class ArduinoBoardAdapter extends EObjectAdapter<ArduinoBoard> implements org.gemoc.arduino.sequential.arduinomt.arduino.ArduinoBoard {
  private org.gemoc.arduino.sequential.arduino.adapters.arduinomt.ArduinoMTAdaptersFactory adaptersFactory;
  
  public ArduinoBoardAdapter() {
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
  public org.gemoc.arduino.sequential.arduinomt.arduino.Project getProject() {
    return () adaptersFactory.createAdapter(adaptee.getProject(), eResource);
  }
  
  @Override
  public void setProject(final org.gemoc.arduino.sequential.arduinomt.arduino.Project o) {
    if (o != null)
    	adaptee.setProject(((org.gemoc.arduino.sequential.arduino.adapters.arduinomt.arduino.ProjectAdapter) o).getAdaptee());
    else adaptee.setProject(null);
  }
  
  private /* EList<org.gemoc.arduino.sequential.arduinomt.arduino.DigitalPin> */Object digitalPins_;
  
  @Override
  public /* EList<org.gemoc.arduino.sequential.arduinomt.arduino.DigitalPin> */Object getDigitalPins() {
    if (digitalPins_ == null)
    	digitalPins_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getDigitalPins(), adaptersFactory, eResource);
    return digitalPins_;
  }
  
  private /* EList<org.gemoc.arduino.sequential.arduinomt.arduino.AnalogPin> */Object analogPins_;
  
  @Override
  public /* EList<org.gemoc.arduino.sequential.arduinomt.arduino.AnalogPin> */Object getAnalogPins() {
    if (analogPins_ == null)
    	analogPins_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getAnalogPins(), adaptersFactory, eResource);
    return analogPins_;
  }
  
  protected final static String NAME_EDEFAULT = null;
  
  @Override
  public EClass eClass() {
    return org.gemoc.arduino.sequential.arduinomt.arduino.ArduinoPackage.eINSTANCE.getArduinoBoard();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.gemoc.arduino.sequential.arduinomt.arduino.ArduinoPackage.ARDUINO_BOARD__NAME:
    		return getName();
    	case org.gemoc.arduino.sequential.arduinomt.arduino.ArduinoPackage.ARDUINO_BOARD__PROJECT:
    		return getProject();
    	case org.gemoc.arduino.sequential.arduinomt.arduino.ArduinoPackage.ARDUINO_BOARD__DIGITAL_PINS:
    		return getDigitalPins();
    	case org.gemoc.arduino.sequential.arduinomt.arduino.ArduinoPackage.ARDUINO_BOARD__ANALOG_PINS:
    		return getAnalogPins();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.gemoc.arduino.sequential.arduinomt.arduino.ArduinoPackage.ARDUINO_BOARD__NAME:
    		return getName() != NAME_EDEFAULT;
    	case org.gemoc.arduino.sequential.arduinomt.arduino.ArduinoPackage.ARDUINO_BOARD__PROJECT:
    		return getProject() != null;
    	case org.gemoc.arduino.sequential.arduinomt.arduino.ArduinoPackage.ARDUINO_BOARD__DIGITAL_PINS:
    		return getDigitalPins() != null && !getDigitalPins().isEmpty();
    	case org.gemoc.arduino.sequential.arduinomt.arduino.ArduinoPackage.ARDUINO_BOARD__ANALOG_PINS:
    		return getAnalogPins() != null && !getAnalogPins().isEmpty();
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.gemoc.arduino.sequential.arduinomt.arduino.ArduinoPackage.ARDUINO_BOARD__NAME:
    		setName(
    		(java.lang.String)
    		 newValue);
    		return;
    	case org.gemoc.arduino.sequential.arduinomt.arduino.ArduinoPackage.ARDUINO_BOARD__PROJECT:
    		setProject(
    		(org.gemoc.arduino.sequential.arduinomt.arduino.Project)
    		 newValue);
    		return;
    	case org.gemoc.arduino.sequential.arduinomt.arduino.ArduinoPackage.ARDUINO_BOARD__DIGITAL_PINS:
    		getDigitalPins().clear();
    		getDigitalPins().addAll((Collection) newValue);
    		return;
    	case org.gemoc.arduino.sequential.arduinomt.arduino.ArduinoPackage.ARDUINO_BOARD__ANALOG_PINS:
    		getAnalogPins().clear();
    		getAnalogPins().addAll((Collection) newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
