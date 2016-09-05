package monitoring.framework.specification;

import lambda.ast.Expression;
import lambda.domains.DenotableValue;

public class MonitorLink {
	
	// FIXME
	AbstractAnnotation annotationAST;
	AbstractMonitor monitor;

	public MonitorLink(AbstractMonitor monitor) {
		this.monitor = monitor;
	}
	public MonitorLink(AbstractAnnotation a, AbstractMonitor m) {
		annotationAST = a;
		monitor = m;
	}
	
	public AbstractAnnotation getAnnotationAST() {
		return annotationAST;
	}
	
	public void setAnnotationAST(AbstractAnnotation annotationAST) {
		this.annotationAST = annotationAST;
	}
	

	public void pre(Expression aNode, IConfiguration context) {
		monitor.pre(aNode, annotationAST, context);
	}
	
	// monitor post: aNode annotation: self annotationAST value: aResult interpreter: context
	public void post(Expression aNode, DenotableValue aResult, IConfiguration context) {
		monitor.post(aNode, annotationAST, aResult, context);
	}
	
}
