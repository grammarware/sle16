package monitoring.framework.specification;

import lambda.ast.Expression;
import lambda.domains.DenotableValue;

public abstract class AbstractMonitor {
	
	protected IMonitorState state;
	
	public IMonitorState getState() {
		return state;
	}
	
	public void setState(IMonitorState state) {
		this.state = state;
	}

	public abstract void pre(Expression aNode, AbstractAnnotation annotation, IConfiguration context);
	
	public abstract void post(Expression aNode, AbstractAnnotation annotation, DenotableValue value, IConfiguration context);

}
