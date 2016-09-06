package org.gemoc.gel.utils;

import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.gemoc.gel.ExecutionFunctionResult;
import org.gemoc.gexpressions.GReferenceExpression;
import org.gemoc.gexpressions.utils.GExpressionsPredicateValidator;

public class GELPredicateValidator extends GExpressionsPredicateValidator {
	@Override
	public Boolean caseGReferenceExpression(GReferenceExpression object) {
		EObject eo = object.getReferencedEObject();
		if (eo instanceof ExecutionFunctionResult) {
			ExecutionFunctionResult result = (ExecutionFunctionResult) eo;
			EClassifier typeOfResult = GELHelper
					.getTypeOfExecutionFunctionResult(result);
			if (typeOfResult instanceof EDataType
					&& typeOfResult.getName().equals("EBoolean")) {
				return true;
			}
		}
		return false;
	}

}
