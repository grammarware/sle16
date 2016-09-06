package org.gemoc.gel.utils;

import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.gemoc.gel.LocalVariable;
import org.gemoc.gexpressions.GBinaryOperatorExpression;
import org.gemoc.gexpressions.GBraceExpression;
import org.gemoc.gexpressions.GExpression;
import org.gemoc.gexpressions.GIfExpression;
import org.gemoc.gexpressions.GNavigationExpression;
import org.gemoc.gexpressions.GReferenceExpression;
import org.gemoc.gexpressions.GUnaryOperatorExpression;
import org.gemoc.gexpressions.util.GexpressionsSwitch;

/**
 * Navigates a GExpression to replace LocalVariable with the corresponding
 * EObject from the given map.
 * 
 * @author flatombe
 *
 */
public class LocalVariableToEObjectReplacer extends
		GexpressionsSwitch<GExpression> {

	private Map<LocalVariable, EObject> map;

	public LocalVariableToEObjectReplacer(Map<LocalVariable, EObject> map) {
		this.map = map;
	}

	@Override
	public GExpression caseGReferenceExpression(GReferenceExpression object) {
		if (object.getReferencedEObject() instanceof LocalVariable) {
			LocalVariable var = (LocalVariable) object.getReferencedEObject();
			object.setReferencedObject(map.get(var));
			return object;
		} else if (object.getReferencedEObject() instanceof EObject) {
			EObject eo = (EObject) object.getReferencedEObject();
			if (map.values().contains(eo)) {
				return object;
			} else {
				throw new RuntimeException(
						"There was a problem earlier on: this EObject should not be in the body of this GExpression."
								+ eo.toString()
								+ " was found in "
								+ object.toString());
			}
		} else {
			throw new UnsupportedOperationException(
					"There should only be LocalVariables there.");
		}
	}

	@Override
	public GExpression caseGNavigationExpression(GNavigationExpression object) {
		object.setBody(this.doSwitch(object.getBody()));
		return object;
	}

	@Override
	public GExpression caseGIfExpression(GIfExpression object) {
		object.setCondition(this.doSwitch(object.getCondition()));
		object.setThenExpression(this.doSwitch(object.getThenExpression()));
		object.setElseExpression(this.doSwitch(object.getElseExpression()));
		return object;
	}

	@Override
	public GExpression caseGBraceExpression(GBraceExpression object) {
		object.setInnerExpression(this.doSwitch(object.getInnerExpression()));
		return object;
	}

	@Override
	public GExpression caseGBinaryOperatorExpression(
			GBinaryOperatorExpression object) {
		object.setLeftOperand(this.doSwitch(object.getLeftOperand()));
		object.setRightOperand(this.doSwitch(object.getRightOperand()));
		return object;
	}

	@Override
	public GExpression caseGUnaryOperatorExpression(
			GUnaryOperatorExpression object) {
		object.setOperand(this.doSwitch(object.getOperand()));
		return object;
	}

	@Override
	public GExpression caseGExpression(GExpression object) {
		return object;
	}
}
