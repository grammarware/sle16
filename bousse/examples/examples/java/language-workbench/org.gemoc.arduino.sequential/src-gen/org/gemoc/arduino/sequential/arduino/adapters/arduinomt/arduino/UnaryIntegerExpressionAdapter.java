package org.gemoc.arduino.sequential.arduino.adapters.arduinomt.arduino;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.eclipse.emf.ecore.EClass;
import org.gemoc.arduino.sequential.arduino.arduino.UnaryIntegerExpression;

@SuppressWarnings("all")
public class UnaryIntegerExpressionAdapter extends EObjectAdapter<UnaryIntegerExpression> implements org.gemoc.arduino.sequential.arduinomt.arduino.UnaryIntegerExpression {
  private org.gemoc.arduino.sequential.arduino.adapters.arduinomt.ArduinoMTAdaptersFactory adaptersFactory;
  
  public UnaryIntegerExpressionAdapter() {
    super(org.gemoc.arduino.sequential.arduino.adapters.arduinomt.ArduinoMTAdaptersFactory.getInstance());
    adaptersFactory = org.gemoc.arduino.sequential.arduino.adapters.arduinomt.ArduinoMTAdaptersFactory.getInstance();
  }
  
  @Override
  public org.gemoc.arduino.sequential.arduinomt.arduino.UnaryIntegerOperatorKind getOperator() {
    return org.gemoc.arduino.sequential.arduinomt.arduino.UnaryIntegerOperatorKind.get(adaptee.getOperator().getValue());
  }
  
  @Override
  public void setOperator(final org.gemoc.arduino.sequential.arduinomt.arduino.UnaryIntegerOperatorKind o) {
    adaptee.setOperator(org.gemoc.arduino.sequential.arduino.arduino.UnaryIntegerOperatorKind.get(o.getValue()));
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
  public Object evaluate() {
    return org.gemoc.arduino.sequential.arduino.aspects.Expression_EvaluableAspect.evaluate(adaptee);
  }
  
  protected final static org.gemoc.arduino.sequential.arduinomt.arduino.UnaryIntegerOperatorKind OPERATOR_EDEFAULT = org.gemoc.arduino.sequential.arduinomt.arduino.UnaryIntegerOperatorKind.MINUS;
  
  @Override
  public EClass eClass() {
    return org.gemoc.arduino.sequential.arduinomt.arduino.ArduinoPackage.eINSTANCE.getUnaryIntegerExpression();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.gemoc.arduino.sequential.arduinomt.arduino.ArduinoPackage.UNARY_INTEGER_EXPRESSION__OPERAND:
    		return getOperand();
    	case org.gemoc.arduino.sequential.arduinomt.arduino.ArduinoPackage.UNARY_INTEGER_EXPRESSION__OPERATOR:
    		return getOperator();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.gemoc.arduino.sequential.arduinomt.arduino.ArduinoPackage.UNARY_INTEGER_EXPRESSION__OPERAND:
    		return getOperand() != null;
    	case org.gemoc.arduino.sequential.arduinomt.arduino.ArduinoPackage.UNARY_INTEGER_EXPRESSION__OPERATOR:
    		return getOperator() != OPERATOR_EDEFAULT;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.gemoc.arduino.sequential.arduinomt.arduino.ArduinoPackage.UNARY_INTEGER_EXPRESSION__OPERAND:
    		setOperand(
    		(org.gemoc.arduino.sequential.arduinomt.arduino.Expression)
    		 newValue);
    		return;
    	case org.gemoc.arduino.sequential.arduinomt.arduino.ArduinoPackage.UNARY_INTEGER_EXPRESSION__OPERATOR:
    		setOperator(
    		(org.gemoc.arduino.sequential.arduinomt.arduino.UnaryIntegerOperatorKind)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
