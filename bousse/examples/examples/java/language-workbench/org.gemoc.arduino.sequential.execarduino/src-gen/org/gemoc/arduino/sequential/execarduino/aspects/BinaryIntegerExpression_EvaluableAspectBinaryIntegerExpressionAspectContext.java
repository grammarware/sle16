package org.gemoc.arduino.sequential.execarduino.aspects;

import java.util.Map;
import org.gemoc.arduino.sequential.execarduino.arduino.BinaryIntegerExpression;
import org.gemoc.arduino.sequential.execarduino.aspects.BinaryIntegerExpression_EvaluableAspectBinaryIntegerExpressionAspectProperties;

@SuppressWarnings("all")
public class BinaryIntegerExpression_EvaluableAspectBinaryIntegerExpressionAspectContext {
  public final static BinaryIntegerExpression_EvaluableAspectBinaryIntegerExpressionAspectContext INSTANCE = new BinaryIntegerExpression_EvaluableAspectBinaryIntegerExpressionAspectContext();
  
  public static BinaryIntegerExpression_EvaluableAspectBinaryIntegerExpressionAspectProperties getSelf(final BinaryIntegerExpression _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.gemoc.arduino.sequential.execarduino.aspects.BinaryIntegerExpression_EvaluableAspectBinaryIntegerExpressionAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<BinaryIntegerExpression, BinaryIntegerExpression_EvaluableAspectBinaryIntegerExpressionAspectProperties> map = new java.util.WeakHashMap<org.gemoc.arduino.sequential.execarduino.arduino.BinaryIntegerExpression, org.gemoc.arduino.sequential.execarduino.aspects.BinaryIntegerExpression_EvaluableAspectBinaryIntegerExpressionAspectProperties>();
  
  public Map<BinaryIntegerExpression, BinaryIntegerExpression_EvaluableAspectBinaryIntegerExpressionAspectProperties> getMap() {
    return map;
  }
}
