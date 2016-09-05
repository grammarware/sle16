package monitoring.concrete.dsprofiler;

import org.bitbucket.inkytonik.dsprofile.Action;
import org.bitbucket.inkytonik.dsprofile.JavaProfiler;

import lambda.ast.Abstraction;
import lambda.ast.Application;
import lambda.ast.Conditional;
import lambda.ast.Constant;
import lambda.ast.Expression;
import lambda.ast.Letrec;
import lambda.ast.Primitive;
import lambda.ast.Variable;
import lambda.domains.DenotableValue;
import monitoring.framework.composition.ExpressionDecorator;
import monitoring.framework.composition.LambdaMonitoringEvaluator;
import monitoring.framework.specification.MonitorLink;

public class DSExample {

	public static void main(String[] args) {
		Action action = () -> runFactorial0(200);
		JavaProfiler.profile (action, "time");

		System.err.println("== Simple recursive factorial\n");
		JavaProfiler.profile(() -> run(annotateFactorial(buildFactorial(200), new DSProfiler())), "time");

		System.err.println("== Tail recursive factorial\n");
		JavaProfiler.profile(() -> run(annotateTRF(buildTailRecursiveFactorial(200), new DSProfiler())), "time");
	}

	static void run(Expression annotatedAST) {
		DenotableValue result = annotatedAST.accept(new LambdaMonitoringEvaluator());
		System.out.println("RESULT = " + result);
	}

	public static Expression buildTailRecursiveFactorial(int n) {
		Letrec ast = new Letrec(
				new Variable("fact"),
				new Abstraction(
						new Variable("x"),
						new Abstraction(
								new Variable("y"),
								new Conditional(
										new Primitive(
												new Variable("="),
												new Variable("x"),
												new Constant(0)),
										new Variable("y"),
										new Application(
												new Application(
														new Variable("fact"),
														new Primitive(
																new Variable("+"),
																new Variable("x"),
																new Constant(-1))),
												new Primitive(
														new Variable("*"),
														new Variable("x"),
														new Variable("y")))))),
				new Application(
						new Application(
								new Variable("fact"),
								new Constant(n)),
						new Constant(1)));
		return ast;
	}

	public static Expression annotateTRF(Expression inAST, DSProfiler profiler) {
		MonitorLink link = new MonitorLink(profiler);
		//decorate the letrec
		Expression outAST = new ExpressionDecorator(inAST, link);

		//decorate the condition
		Conditional cond = ((Conditional)((Abstraction)((Letrec)inAST).getAbstraction().getExp()).getExp());
		cond.setExp1(new ExpressionDecorator(cond.getExp1(), link));

		//decorate the recursive call
		cond.setExp3(new ExpressionDecorator(cond.getExp3(), link));

		return outAST;
	}

	public static Expression buildFactorial(int n) {
		Letrec ast = new Letrec(
				new Variable("fact"),
				new Abstraction(
						new Variable("x"),
						new Conditional(
								new Primitive(
										new Variable("="),
										new Variable("x"),
										new Constant(0)),
								new Constant(1),
								new Primitive(
										new Variable("*"),
										new Variable("x"),
										new Application(
												new Variable("fact"),
												new Primitive(
														new Variable("+"),
														new Variable("x"),
														new Constant(-1)
												)
										)
								)
						)
				),
				new Application(new Variable("fact"), new Constant(n))
		);
		return ast;
	}

	public static Expression annotateFactorial(Expression inAST, DSProfiler profiler) {
		MonitorLink  link = new MonitorLink(profiler);
		//decorate the letrec
		Expression outAST = new ExpressionDecorator(inAST, link);

		//decorate the condition (= x 0)
		Conditional cond = ((Conditional)((Letrec)inAST).getAbstraction().getExp());
		cond.setExp1(new ExpressionDecorator(cond.getExp1(), link));

		//decorate the conditional if (= x 0) then 1 else (* x (fact (+ x -1)))
		Abstraction abs = ((Letrec)inAST).getAbstraction();
		abs.setExp(new ExpressionDecorator(abs.getExp(), link));

		//decorate the (+ x -1)
		Application add = ((Application)((Primitive)cond.getExp3()).getRhs());
		add.setExp2(new ExpressionDecorator(add.getExp2(), link));

		//decorate the (fact (+ x -1)
		Primitive app = ((Primitive)cond.getExp3());
		app.setRhs(new ExpressionDecorator(app.getRhs(), link));

		//decorate the (* x (fact (+ x -1)))
		cond.setExp3(new ExpressionDecorator(cond.getExp3(), link));

		return outAST;
	}


	static void runFactorial0 (int num) {
		Expression fact = buildFactorial0(num);
		LambdaMonitoringEvaluator eval = new LambdaMonitoringEvaluator();
		DenotableValue result = fact.accept(eval);
		System.out.println("RESULT = " + result);
	}

	public static Expression buildFactorial0(int n) {
		Letrec ast = new Letrec();
		ast.setIdentifier(new Variable("fac"));
		
		Abstraction facdef = new Abstraction();
		
		Primitive exp1 = new Primitive("x", "=", 0);
		Constant exp2 = new Constant(1);
		Application app = new Application(new Variable("fac"), new Primitive("x", "+", -1));
		
		DSProfiler profiler = new DSProfiler();
		
		// Quick-and-dirty
		MonitorLink  link = new MonitorLink(null, profiler);
		ExpressionDecorator decoratedNode = new ExpressionDecorator();
		decoratedNode.setLink(link);
		decoratedNode.setOriginalElement(app);
		//exp3.setRhs(decoratedNode);
		Primitive exp3 = new Primitive("x", "*", decoratedNode);
		// End of quick-and-dirty
		
		
		decoratedNode = new ExpressionDecorator();
		link = new MonitorLink(null, profiler);
		decoratedNode.setLink(link);
		decoratedNode.setOriginalElement(exp1);
		
		Conditional cond = new Conditional(decoratedNode, exp2, exp3);
		
		facdef.setArg("x"); // CAREFUL: cannot do facdef.setArg(new MonDecoratedElement(new MonVariable("x")));
		facdef.setExp(cond);

		ast.setAbstraction(facdef);
		ast.setExp(new Application(
				new Variable("fac"), new Constant(n)));


		decoratedNode = new ExpressionDecorator();
		link = new MonitorLink(null, profiler);
		decoratedNode.setLink(link);
		decoratedNode.setOriginalElement(ast);
		return decoratedNode;
	}
}
