package monitoring.concrete.collector;

import lambda.ast.Expression;
import lambda.domains.DenotableValue;
import monitoring.framework.specification.AbstractAnnotation;
import monitoring.framework.specification.IConfiguration;
import monitoring.framework.specification.LeafMonitor;

public class LeafCollector extends LeafMonitor {

	public LeafCollector() {
		this.state = new CollectorState<DenotableValue>();
	}

	@Override
	public void post(Expression aNode, AbstractAnnotation a, DenotableValue result, IConfiguration context) {
		CollectorState<DenotableValue> state = (CollectorState<DenotableValue>) getState();
		String symbol = ((CollectorAnnotation)a).getSymbol();
		state.addValue(symbol, result);
	}
	

}
