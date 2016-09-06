package org.gemoc.gel.utils;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.gemoc.gel.InstantiationPredicate;
import org.gemoc.gel.LocalVariable;
import org.gemoc.gel.UnfoldingStrategy;
import org.gemoc.gel.util.GelSwitch;
import org.gemoc.gexpressions.GExpression;
import org.gemoc.gexpressions.utils.GExpressionsInterpreter;

/**
 * Interprets the UnfoldingStrategy of a CompositeDSE. Given a list of EObjects,
 * it replaces all the InstantiationRule's occurrences of LocalVariables with
 * the equivalent EObject from the list, and calls the interpreter for this
 * rule. If the result is false, the list of EObjects is discarded as the
 * InstantiationRules were not respected.
 * 
 * @author flatombe
 *
 */
public class UnfoldingStrategyInterpreter extends GelSwitch<Boolean> {

	private List<EObject> parameters;
	private Map<LocalVariable, EObject> mapArgumentToParameter;

	public UnfoldingStrategyInterpreter(List<EObject> parameters) {
		this.parameters = parameters;
		this.mapArgumentToParameter = new HashMap<>();
	}

	@Override
	public Boolean caseUnfoldingStrategy(UnfoldingStrategy object) {
		// We need a copy of the strategy since we're going to replace the
		// occurrences of LocalVariables with the underlying EObject.
		UnfoldingStrategy strategy = EcoreUtil.copy(object);

		// Remembering which local variable is mapped to which EObject.
		for (LocalVariable variable : strategy.getLocalVariables()) {
			mapArgumentToParameter.put(
					variable,
					parameters.get(strategy.getLocalVariables().indexOf(
							variable)));
		}
		Boolean res = true;
		for (InstantiationPredicate predicate : strategy.getInstantiationPredicates()) {
			res = res && this.doSwitch(predicate);
		}
		return res;
	}

	@Override
	public Boolean caseInstantiationPredicate(InstantiationPredicate object) {
		// Replace the "LocalVariable" by their corresponding EObject and then
		// send it to GExpression's interpreter.
		GExpression originalExpression = object.getBody();
		GExpression newExpression = (new LocalVariableToEObjectReplacer(
				mapArgumentToParameter)).doSwitch(originalExpression);
		Boolean res = (Boolean) (new GExpressionsInterpreter())
				.doSwitch(newExpression);
		return res;
	}

}
