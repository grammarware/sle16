package monitoring.framework.composition;

import lambda.ast.ILambdaVisitor;

public interface IExpressionDecoratorVisitor<T> extends ILambdaVisitor<T> {
	T visit(ExpressionDecorator aNode);
}
