package org.gemoc.arduino.sequential.arduino.adapters.arduinomt.arduino;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.gemoc.arduino.sequential.arduino.arduino.Block;

@SuppressWarnings("all")
public class BlockAdapter extends EObjectAdapter<Block> implements org.gemoc.arduino.sequential.arduinomt.arduino.Block {
  private org.gemoc.arduino.sequential.arduino.adapters.arduinomt.ArduinoMTAdaptersFactory adaptersFactory;
  
  public BlockAdapter() {
    super(org.gemoc.arduino.sequential.arduino.adapters.arduinomt.ArduinoMTAdaptersFactory.getInstance());
    adaptersFactory = org.gemoc.arduino.sequential.arduino.adapters.arduinomt.ArduinoMTAdaptersFactory.getInstance();
  }
  
  private /* EList<org.gemoc.arduino.sequential.arduinomt.arduino.Instruction> */Object instructions_;
  
  @Override
  public /* EList<org.gemoc.arduino.sequential.arduinomt.arduino.Instruction> */Object getInstructions() {
    if (instructions_ == null)
    	instructions_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getInstructions(), adaptersFactory, eResource);
    return instructions_;
  }
  
  @Override
  public void execute() {
    org.gemoc.arduino.sequential.arduino.aspects.Block_ExecutableAspect.execute(adaptee);
  }
  
  @Override
  public EClass eClass() {
    return org.gemoc.arduino.sequential.arduinomt.arduino.ArduinoPackage.eINSTANCE.getBlock();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.gemoc.arduino.sequential.arduinomt.arduino.ArduinoPackage.BLOCK__INSTRUCTIONS:
    		return getInstructions();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.gemoc.arduino.sequential.arduinomt.arduino.ArduinoPackage.BLOCK__INSTRUCTIONS:
    		return getInstructions() != null && !getInstructions().isEmpty();
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.gemoc.arduino.sequential.arduinomt.arduino.ArduinoPackage.BLOCK__INSTRUCTIONS:
    		getInstructions().clear();
    		getInstructions().addAll((Collection) newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
