package org.gemoc.arduino.sequential.arduino.adapters.arduinomt.arduino;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.eclipse.emf.ecore.EClass;
import org.gemoc.arduino.sequential.arduino.arduino.While;

@SuppressWarnings("all")
public class WhileAdapter extends EObjectAdapter<While> implements org.gemoc.arduino.sequential.arduinomt.arduino.While {
  private org.gemoc.arduino.sequential.arduino.adapters.arduinomt.ArduinoMTAdaptersFactory adaptersFactory;
  
  public WhileAdapter() {
    super(org.gemoc.arduino.sequential.arduino.adapters.arduinomt.ArduinoMTAdaptersFactory.getInstance());
    adaptersFactory = org.gemoc.arduino.sequential.arduino.adapters.arduinomt.ArduinoMTAdaptersFactory.getInstance();
  }
  
  @Override
  public org.gemoc.arduino.sequential.arduinomt.arduino.Block getBlock() {
    return () adaptersFactory.createAdapter(adaptee.getBlock(), eResource);
  }
  
  @Override
  public void setBlock(final org.gemoc.arduino.sequential.arduinomt.arduino.Block o) {
    if (o != null)
    	adaptee.setBlock(((org.gemoc.arduino.sequential.arduino.adapters.arduinomt.arduino.BlockAdapter) o).getAdaptee());
    else adaptee.setBlock(null);
  }
  
  @Override
  public org.gemoc.arduino.sequential.arduinomt.arduino.BooleanExpression getCondition() {
    return () adaptersFactory.createAdapter(adaptee.getCondition(), eResource);
  }
  
  @Override
  public void setCondition(final org.gemoc.arduino.sequential.arduinomt.arduino.BooleanExpression o) {
    if (o != null)
    	adaptee.setCondition(((org.gemoc.arduino.sequential.arduino.adapters.arduinomt.arduino.BooleanExpressionAdapter) o).getAdaptee());
    else adaptee.setCondition(null);
  }
  
  @Override
  public Boolean evaluate() {
    return org.gemoc.arduino.sequential.arduino.aspects.While_EvaluableAspect.evaluate(adaptee);
  }
  
  @Override
  public void execute() {
    org.gemoc.arduino.sequential.arduino.aspects.While_ExecutableAspect.execute(adaptee);
  }
  
  @Override
  public void finalize() {
    org.gemoc.arduino.sequential.arduino.aspects.Instruction_ExecutableAspect.finalize(adaptee);
  }
  
  @Override
  public EClass eClass() {
    return org.gemoc.arduino.sequential.arduinomt.arduino.ArduinoPackage.eINSTANCE.getWhile();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.gemoc.arduino.sequential.arduinomt.arduino.ArduinoPackage.WHILE__BLOCK:
    		return getBlock();
    	case org.gemoc.arduino.sequential.arduinomt.arduino.ArduinoPackage.WHILE__CONDITION:
    		return getCondition();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.gemoc.arduino.sequential.arduinomt.arduino.ArduinoPackage.WHILE__BLOCK:
    		return getBlock() != null;
    	case org.gemoc.arduino.sequential.arduinomt.arduino.ArduinoPackage.WHILE__CONDITION:
    		return getCondition() != null;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.gemoc.arduino.sequential.arduinomt.arduino.ArduinoPackage.WHILE__BLOCK:
    		setBlock(
    		(org.gemoc.arduino.sequential.arduinomt.arduino.Block)
    		 newValue);
    		return;
    	case org.gemoc.arduino.sequential.arduinomt.arduino.ArduinoPackage.WHILE__CONDITION:
    		setCondition(
    		(org.gemoc.arduino.sequential.arduinomt.arduino.BooleanExpression)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
