package monitoring.concrete.tracer;

import lambda.ast.Expression;
import lambda.domains.Configuration;
import lambda.domains.DenotableValue;
import lambda.domains.FunctionEnvironment;
import monitoring.framework.specification.AbstractAnnotation;
import monitoring.framework.specification.IConfiguration;
import monitoring.framework.specification.LeafMonitor;

public class LeafTracer extends LeafMonitor {
	
	public LeafTracer() {
		setState(new TracerState());
	}

	@Override
	public void pre(Expression aNode, AbstractAnnotation annotation, IConfiguration context) {	
		TracerAnnotation ann = (TracerAnnotation) annotation;
		TracerState state = (TracerState) getState();
		String argstr = "";
		for (String arg : ann.getArgs()) {
			argstr += arg + ":" + context.lookup(arg).toString() + " ";
		}
		state.addReceive(ann.getName(), argstr);
		state.increaseIndent();
		state.add("\n");
	}

	@Override
	public void post(Expression aNode, AbstractAnnotation annotation, DenotableValue value, IConfiguration context) {
		TracerAnnotation ann = (TracerAnnotation) annotation;
		TracerState state = (TracerState) getState();
		state.decreaseIndent();
		state.addReturn(ann.getName(), value.toString());
	}
	

}
