package examples.lambda.generated;

import lambda.ast.Expression;
import lambda.domains.DenotableValue;
import monitoring.framework.specification.MonitorLink;

public class GenMonitoring {

	public static class ExpressionDecorator extends lambda.ast.Expression {
		private lambda.ast.Expression originalElement;
		private MonitorLink link;
		public ExpressionDecorator() {}
		public ExpressionDecorator(lambda.ast.Expression element, MonitorLink link) {
			this.originalElement = element;
			this.link = link;
		}
		public MonitorLink getLink() { return link; }
		public void setLink(MonitorLink link) { this.link = link; }
		public lambda.ast.Expression getOriginalElement() { return originalElement; }
		public void setOriginalElement(lambda.ast.Expression originalElement) { this.originalElement = originalElement; }
		@Override
		public <T> T accept(lambda.ast.ILambdaVisitor<T> visitor) {
			if (visitor instanceof IExpressionDecoratorVisitor) {
				return ((IExpressionDecoratorVisitor<T>)visitor).visit(this); 
			}
			else
				return getOriginalElement().accept(visitor);	
		}
		@Override
		public String toString() { return originalElement.toString(); }
	}
	public static interface IExpressionDecoratorVisitor<T> extends lambda.ast.ILambdaVisitor<T> {
		T visit(ExpressionDecorator aNode);
	}
	public static class AbstractionDecorator extends lambda.ast.Abstraction {
		private lambda.ast.Abstraction originalElement;
		private MonitorLink link;
		public AbstractionDecorator() {}
		public AbstractionDecorator(lambda.ast.Abstraction element, MonitorLink link) {
			this.originalElement = element;
			this.link = link;
		}
		public MonitorLink getLink() { return link; }
		public void setLink(MonitorLink link) { this.link = link; }
		public lambda.ast.Abstraction getOriginalElement() { return originalElement; }
		public void setOriginalElement(lambda.ast.Abstraction originalElement) { this.originalElement = originalElement; }
		@Override
		public <T> T accept(lambda.ast.ILambdaVisitor<T> visitor) {
			if (visitor instanceof IAbstractionDecoratorVisitor) {
				return ((IAbstractionDecoratorVisitor<T>)visitor).visit(this); 
			}
			else
				return getOriginalElement().accept(visitor);	
		}
		@Override
		public String toString() { return originalElement.toString(); }
	}
	public static interface IAbstractionDecoratorVisitor<T> extends lambda.ast.ILambdaVisitor<T> {
		T visit(AbstractionDecorator aNode);
	}
	public static class LambdaValuationMonitoring 
		 extends lambda.valuation.LambdaEvaluator
		 implements IAbstractionDecoratorVisitor<lambda.domains.DenotableValue>
			, IExpressionDecoratorVisitor<lambda.domains.DenotableValue> {
	
		public lambda.domains.DenotableValue visit(AbstractionDecorator dNode) {
			MonitorLink link = dNode.getLink();
			link.pre(dNode.getOriginalElement(), configuration);
			lambda.domains.DenotableValue result = dNode.getOriginalElement().accept(this);
			link.post(dNode.getOriginalElement(), result, configuration);
			return result;
		}
		public lambda.domains.DenotableValue visit(ExpressionDecorator dNode) {
			MonitorLink link = dNode.getLink();
			link.pre(dNode.getOriginalElement(), configuration);
			lambda.domains.DenotableValue result = dNode.getOriginalElement().accept(this);
			link.post(dNode.getOriginalElement(), result, configuration);
			return result;
		}
	}
}
