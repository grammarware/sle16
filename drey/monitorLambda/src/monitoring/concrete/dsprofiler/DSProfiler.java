package monitoring.concrete.dsprofiler;

import java.util.Stack;

import org.bitbucket.inkytonik.dsprofile.JavaProfiler;

import lambda.ast.Expression;
import lambda.domains.DenotableValue;
import monitoring.framework.specification.AbstractAnnotation;
import monitoring.framework.specification.IConfiguration;
import monitoring.framework.specification.LeafMonitor;

public class DSProfiler extends LeafMonitor {
	
	public DSProfiler() {
		this.state = new DSProfilerState();
	}
	
	@Override
	public void pre(Expression aNode, AbstractAnnotation annotation, IConfiguration context) {
		long sID = JavaProfiler.start(JavaProfiler.tuple("time", aNode));
		((DSProfilerState)state).getStack().push(sID);
	}

	@Override
	public void post(Expression aNode, AbstractAnnotation annotation, DenotableValue value, IConfiguration context) {
		JavaProfiler.finish(((DSProfilerState)state).getStack().pop(), JavaProfiler.tuple("time", aNode));
	}
}
