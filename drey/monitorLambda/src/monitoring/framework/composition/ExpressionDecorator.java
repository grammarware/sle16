package monitoring.framework.composition;

import lambda.ast.Expression;
import lambda.ast.ILambdaVisitor;
import lambda.domains.DenotableValue;
import monitoring.framework.specification.MonitorLink;

/** Corresponds to: MonDecorator
 *  Decorated element */
public class ExpressionDecorator extends Expression {
	
	protected Expression originalElement;
	protected MonitorLink link;

	public ExpressionDecorator() {}
	public ExpressionDecorator(Expression element, MonitorLink link) {
		this.originalElement = element;
		this.link = link;
	}

	public Expression getOriginalElement() {
		return originalElement;
	}
	
	public MonitorLink getLink() {
		return link;
	}

	public void setOriginalElement(Expression originalElement) {
		this.originalElement = originalElement;
	}

	public void setLink(MonitorLink link) {
		this.link = link;
	}

	@Override
	public <T> T accept(ILambdaVisitor<T> visitor) {
		if (visitor instanceof IExpressionDecoratorVisitor) {
			return ((IExpressionDecoratorVisitor<T>)visitor).visit(this); 
		}
		else {
			return getOriginalElement().accept(visitor);
		}
	}

	public String toString() {
		return "Ann [" + getLink().getAnnotationAST() + "]:" + originalElement.toString();
	}
	
	public String toString_withAnn() {
		return originalElement.toString();
	}
}
