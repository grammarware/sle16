package org.gemoc.gel.microgel.utils;

import org.eclipse.emf.ecore.EObject;
import org.gemoc.gel.microgel.ExecutionFunctionResult;
import org.gemoc.gexpressions.GExpression;
import org.gemoc.gexpressions.GReferenceExpression;
import org.gemoc.gexpressions.util.GexpressionsSwitch;

public class ExecutionFunctionResultReplacer extends
		GexpressionsSwitch<GExpression> {

	private Object feedbackValue;

	public ExecutionFunctionResultReplacer(Object feedbackValue) {
		this.feedbackValue = feedbackValue;
	}

	// TODO: for every encounter in the expression of an Execution Function
	// Result (most likely in GReferenceExpression), replace it by the feedback
	// value.
	@Override
	public GExpression caseGReferenceExpression(GReferenceExpression object) {
		EObject referencedEObject = object.getReferencedEObject();
		if (referencedEObject instanceof ExecutionFunctionResult) {
			object.setReferencedObject(this.feedbackValue);
		}
		return object;
	}
	
	@Override
	public GExpression caseGExpression(GExpression object) {
		return object;
	}

}
