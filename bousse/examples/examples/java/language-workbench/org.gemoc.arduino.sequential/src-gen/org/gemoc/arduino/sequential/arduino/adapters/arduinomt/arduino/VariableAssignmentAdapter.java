package org.gemoc.arduino.sequential.arduino.adapters.arduinomt.arduino;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.eclipse.emf.ecore.EClass;
import org.gemoc.arduino.sequential.arduino.arduino.VariableAssignment;

@SuppressWarnings("all")
public class VariableAssignmentAdapter extends EObjectAdapter<VariableAssignment> implements org.gemoc.arduino.sequential.arduinomt.arduino.VariableAssignment {
  private org.gemoc.arduino.sequential.arduino.adapters.arduinomt.ArduinoMTAdaptersFactory adaptersFactory;
  
  public VariableAssignmentAdapter() {
    super(org.gemoc.arduino.sequential.arduino.adapters.arduinomt.ArduinoMTAdaptersFactory.getInstance());
    adaptersFactory = org.gemoc.arduino.sequential.arduino.adapters.arduinomt.ArduinoMTAdaptersFactory.getInstance();
  }
  
  @Override
  public org.gemoc.arduino.sequential.arduinomt.arduino.Expression getOperand() {
    return () adaptersFactory.createAdapter(adaptee.getOperand(), eResource);
  }
  
  @Override
  public void setOperand(final org.gemoc.arduino.sequential.arduinomt.arduino.Expression o) {
    if (o != null)
    	adaptee.setOperand(((org.gemoc.arduino.sequential.arduino.adapters.arduinomt.arduino.ExpressionAdapter) o).getAdaptee());
    else adaptee.setOperand(null);
  }
  
  @Override
  public org.gemoc.arduino.sequential.arduinomt.arduino.Variable getVariable() {
    return () adaptersFactory.createAdapter(adaptee.getVariable(), eResource);
  }
  
  @Override
  public void setVariable(final org.gemoc.arduino.sequential.arduinomt.arduino.Variable o) {
    if (o != null)
    	adaptee.setVariable(((org.gemoc.arduino.sequential.arduino.adapters.arduinomt.arduino.VariableAdapter) o).getAdaptee());
    else adaptee.setVariable(null);
  }
  
  @Override
  public void execute() {
    org.gemoc.arduino.sequential.arduino.aspects.VariableAssignment_ExecutableAspect.execute(adaptee);
  }
  
  @Override
  public void finalize() {
    org.gemoc.arduino.sequential.arduino.aspects.Instruction_ExecutableAspect.finalize(adaptee);
  }
  
  @Override
  public EClass eClass() {
    return org.gemoc.arduino.sequential.arduinomt.arduino.ArduinoPackage.eINSTANCE.getVariableAssignment();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.gemoc.arduino.sequential.arduinomt.arduino.ArduinoPackage.VARIABLE_ASSIGNMENT__OPERAND:
    		return getOperand();
    	case org.gemoc.arduino.sequential.arduinomt.arduino.ArduinoPackage.VARIABLE_ASSIGNMENT__VARIABLE:
    		return getVariable();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.gemoc.arduino.sequential.arduinomt.arduino.ArduinoPackage.VARIABLE_ASSIGNMENT__OPERAND:
    		return getOperand() != null;
    	case org.gemoc.arduino.sequential.arduinomt.arduino.ArduinoPackage.VARIABLE_ASSIGNMENT__VARIABLE:
    		return getVariable() != null;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.gemoc.arduino.sequential.arduinomt.arduino.ArduinoPackage.VARIABLE_ASSIGNMENT__OPERAND:
    		setOperand(
    		(org.gemoc.arduino.sequential.arduinomt.arduino.Expression)
    		 newValue);
    		return;
    	case org.gemoc.arduino.sequential.arduinomt.arduino.ArduinoPackage.VARIABLE_ASSIGNMENT__VARIABLE:
    		setVariable(
    		(org.gemoc.arduino.sequential.arduinomt.arduino.Variable)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
  
  @Override
  public int eBaseStructuralFeatureID(final int derivedFeatureID, final Class<?> baseClass) {
    if (baseClass == org.gemoc.arduino.sequential.arduinomt.arduino.Assignment.class) {
    	switch (derivedFeatureID) {
    		case org.gemoc.arduino.sequential.arduinomt.arduino.ArduinoPackage.VARIABLE_ASSIGNMENT__OPERAND:
    			return org.gemoc.arduino.sequential.arduinomt.arduino.ArduinoPackage.ASSIGNMENT__OPERAND;
    		default: return -1;
    	}
    }
    
    return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
  }
  
  @Override
  public int eDerivedStructuralFeatureID(final int baseFeatureID, final Class<?> baseClass) {
    if (baseClass == org.gemoc.arduino.sequential.arduinomt.arduino.Assignment.class) {
    	switch (baseFeatureID) {
    		case org.gemoc.arduino.sequential.arduinomt.arduino.ArduinoPackage.ASSIGNMENT__OPERAND:
    			return org.gemoc.arduino.sequential.arduinomt.arduino.ArduinoPackage.VARIABLE_ASSIGNMENT__OPERAND;
    		default: return -1;
    	}
    }
    
    
    return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
  }
}
