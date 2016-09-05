package monitoring.concrete.debugger;

import lambda.ast.Expression;
import lambda.domains.DenotableValue;
import monitoring.framework.composition.ExpressionDecorator;
import monitoring.framework.specification.AbstractMonitor;
import monitoring.framework.specification.MonitorLink;

/** Decorated element. Solely encapsulates a default link creation */
public class ProgramPointElement extends ExpressionDecorator {
	
	public ProgramPointElement() {}
	
	public ProgramPointElement(Expression element, AbstractMonitor debugger) {
		this.originalElement = element;
		this.link = new MonitorLink(new DebugAnnotation(), debugger);
	}
		
}
