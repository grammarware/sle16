package monitoring.framework.composition;

import lambda.ast.Expression;
import lambda.ast.Letrec;
import lambda.domains.DenotableValue;
import lambda.valuation.LambdaEvaluator;
import monitoring.framework.specification.MonitorLink;

public class LambdaMonitoringEvaluator extends LambdaEvaluator implements IExpressionDecoratorVisitor<DenotableValue> {
		
	public DenotableValue visit(ExpressionDecorator dNode) {
		MonitorLink link = dNode.getLink();
		link.pre(dNode.getOriginalElement(), configuration);
		DenotableValue result = dNode.getOriginalElement().accept(this);
		link.post(dNode.getOriginalElement(), result, configuration);
		return result;
	}


}
