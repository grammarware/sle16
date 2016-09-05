package lambda.ast;

public interface ILambdaVisitor<T> {
	T visit(Expression aNode);
	T visit(Abstraction aNode);
	T visit(Application aNode);
	T visit(Conditional aNode);
	T visit(Constant aNode);
	T visit(Variable aNode);
	T visit(Letrec aNode);
	T visit(Primitive aNode);
}
