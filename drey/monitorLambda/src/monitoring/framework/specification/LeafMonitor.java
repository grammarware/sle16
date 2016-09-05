package monitoring.framework.specification;

import lambda.ast.Expression;
import lambda.domains.DenotableValue;

public abstract class LeafMonitor extends AbstractMonitor {

	@Override
	public void pre(Expression aNode, AbstractAnnotation annotation, IConfiguration configuration) {
	}

	@Override
	public void post(Expression aNode, AbstractAnnotation annotation, DenotableValue value, IConfiguration configuration) {
	}
}
