package examples.lambda.concrete;

import lambda.ast.Abstraction;
import lambda.ast.Application;
import lambda.ast.Conditional;
import lambda.ast.Constant;
import lambda.ast.Expression;
import lambda.ast.Letrec;
import lambda.ast.Primitive;
import lambda.ast.Variable;
import lambda.domains.DenotableValue;
import monitoring.concrete.collector.CollectorAnnotation;
import monitoring.concrete.collector.CollectorState;
import monitoring.concrete.collector.LeafCollector;
import monitoring.concrete.composite.CompositeTracerCollector;
import monitoring.concrete.debugger.DebugAnnotator;
import monitoring.concrete.debugger.DebugState;
import monitoring.concrete.debugger.LeafDebugger;
import monitoring.concrete.debugger.ProgramPointElement;
import monitoring.concrete.profiler.LeafProfiler;
import monitoring.concrete.profiler.ProfilerAnnotation;
import monitoring.concrete.profiler.ProfilerState;
import monitoring.concrete.tracer.LeafTracer;
import monitoring.concrete.tracer.TracerAnnotation;
import monitoring.concrete.tracer.TracerState;
import monitoring.framework.composition.ExpressionDecorator;
import monitoring.framework.composition.LambdaMonitoringEvaluator;
import monitoring.framework.specification.CompositeState;
import monitoring.framework.specification.LeafMonitor;
import monitoring.framework.specification.MonitorLink;


/**
 * This class defines a collection of factorial examples in their AST form.
 * AST are manually annotated here. However, there is no technical difficulty 
 * to automatically annotate them (using a visitor and a generative API :-))
 */
public class MainTester {
	

	/**
	 * An example of annotated AST to be run by a basic profiler.
	 * @param profiler
	 * @return an AST of the following functional program : 
	 *    letrec fac x = if (= x 0) then 1 else (* x (fac (- x 1))) in (fac 5)
	 */
	private static Letrec buildFac5_for_profiler(LeafProfiler profiler) {
		Letrec ast = new Letrec();
		
		ast.setIdentifier(new Variable("fac"));
		Abstraction facdef = new Abstraction();

		// Original AST
		Conditional cond = new Conditional();
		Primitive exp1 = new Primitive("x", "=", 0);
		Constant exp2 = new Constant(1);
		Application app = new Application(new Variable("fac"), new Primitive("x", "+", -1));		
		Primitive exp3 = new Primitive("x", "*", app);
		cond.setExp2(exp2);
		cond.setExp3(exp3);

		// Annotation added to the test "x = 0"
		ExpressionDecorator decoratedNodeTest = new ExpressionDecorator();
		decoratedNodeTest.setLink(new MonitorLink(new ProfilerAnnotation("#test"), profiler));
		decoratedNodeTest.setOriginalElement(exp1);
		cond.setExp1(decoratedNodeTest);
		
		// Annotation added to the application app = "fac ( x - 1 )"
		ExpressionDecorator decoratedNodeApp = new ExpressionDecorator();
		decoratedNodeApp.setLink(new MonitorLink(new ProfilerAnnotation("#fac"), profiler));
		decoratedNodeApp.setOriginalElement(app);
		exp3.setRhs(decoratedNodeApp);
		
		facdef.setArg("x");
		facdef.setExp(cond);

		ast.setAbstraction(facdef);
		ast.setExp(new Application(new Variable("fac"), new Constant(5)));
		System.out.println("\n>>> Created AST for this program:  \n  " + ast.toString());
		return ast;
	}
	
	/**
	 * An example of annotated AST to be run by a basic collector.
	 * @param collector a basic collecting monitor
	 * @return an annotated AST of the following functional program : 
	 *    letrec fac x = if (= x 0) then 1 else (* x (fac (- x 1))) in (fac 6)
	 */
	private static Letrec buildFac6_for_collector(LeafCollector collector) {

		Letrec ast = new Letrec();
		// Original AST
		ast.setIdentifier(new Variable("fac"));
		Abstraction facdef = new Abstraction();
		ast.setAbstraction(facdef);
		
		Primitive exp1 = new Primitive("x", "=", 0);
		Constant exp2 = new Constant(1);
		Application app = new Application(new Variable("fac"), new Primitive("x", "+", -1));		
		Primitive exp3 = new Primitive("x", "*", app);
		
		// Annotation added to the test "x = 0"
		ExpressionDecorator decoratedExp1 = new ExpressionDecorator();
		decoratedExp1.setLink(new MonitorLink(new CollectorAnnotation("#test"), collector));
		decoratedExp1.setOriginalElement(exp1);
		
		// Annotation added to the application app = "fac ( x - 1 )"
		ExpressionDecorator decoratedNodeApp = new ExpressionDecorator();
		decoratedNodeApp.setLink(new MonitorLink(new CollectorAnnotation("#fac"), collector));
		decoratedNodeApp.setOriginalElement(app);
		exp3.setRhs(decoratedNodeApp);
		
		Conditional cond = new Conditional(decoratedExp1, exp2, exp3);
		
		facdef.setArg("x");
		facdef.setExp(cond);

		ast.setExp(new Application(new Variable("fac"), new Constant(6)));
		System.out.println("\n>>> Created AST for this program:\n" + ast);
		return ast;
	}
	


	
	public static Letrec buildNotTailRecursiveFactorial(int n) {

		Letrec ast = new Letrec(
				new Variable("fact"),
				new Abstraction(
						new Variable("x"),
						new Conditional(
								new Primitive(
										new Variable("="),
										new Variable("x"),
										new Constant(1)),
								new Constant(1),
								new Application(
										new Application(
												new Variable("mult"),
												new Variable("x")),
										new Application(
												new Variable("fact"),
												new Primitive(
														new Variable("+"),
														new Variable("x"),
														new Constant(-1)))

										))),

				new Application(
						new Variable("fact"),
						new Constant(n))
				);

		Letrec mult_ast = new Letrec(
				new Variable("mult"),
				new Abstraction(
						new Variable("x"),
						new Abstraction(
								new Variable("y"),
								new Primitive(
										new Variable("*"),
										new Variable("x"),
										new Variable("y")))
						),
				ast
				);
		System.out.println("\n>>> Created AST for this program:  \n  " + mult_ast.toString());
		return mult_ast;
	}
	
	public static Letrec buildTailRecursiveFactorial(int n) {

		Letrec ast = new Letrec(
				new Variable("fact"),
				new Abstraction(
						new Variable("x"),
						new Abstraction(
								new Variable("acc"),
								new Conditional(
										new Primitive(
												new Variable("="),
												new Variable("x"),
												new Constant(1)),
										new Variable("acc"),
										new Application(
												new Application(
														new Variable("fact"),
														new Primitive(
																new Variable("+"),
																new Variable("x"),
																new Constant(-1))),
												new Application(
														new Application(
																new Variable("mult"),
																new Variable("x")),
														new Variable("acc")))))),
				new Application(
						new Application(
								new Variable("fact"),
								new Constant(n)),
						new Constant(1)));

		Letrec mult_ast = new Letrec(
				new Variable("mult"),
				new Abstraction(
						new Variable("x"),
						new Abstraction(
								new Variable("y"),
								new Primitive(
										new Variable("*"),
										new Variable("x"),
										new Variable("y")))
						),
				ast
				);
		System.out.println("\n>>> Created AST for this program:\n" + mult_ast);
		return mult_ast;
	}
	 
	
	/**
	 * Run profiling on the factorial function defined by the method buildFac5_for_profiler
	 * @param profiler a basic profiling monitor
	 * @return the profiler monitoring state after evaluation.
	 */
	private static ProfilerState evalFac5_with_profiler(LeafProfiler profiler) {
		Letrec ast = buildFac5_for_profiler(profiler); 
		DenotableValue result = ast.accept(new LambdaMonitoringEvaluator());
		System.out.println(">>> RESULT = " + result);
		return (ProfilerState) profiler.getState();
	}
	
	 
	/**
	 * Run collector on the factorial function defined by the method buildFac6_for_collector
	 * @param collector a basic collecting monitor
	 * @return the collector monitoring state after evaluation
	 */
	private static CollectorState<DenotableValue> evalFac6_for_collector(LeafCollector collector) {
		
		Letrec ast = buildFac6_for_collector(collector); 
		DenotableValue result = ast.accept(new LambdaMonitoringEvaluator());
		System.out.println(">>> RESULT = " + result);
		return (CollectorState<DenotableValue>) collector.getState();
	}
	
	/**
	 * Run tracer on the factorial function defined by the method buildNotTailRecursiveFactorial
	 * @param tracer a basic tracing monitor
	 * @return the tracer monitoring state after evaluation
	 */
	private static TracerState evalNotTailRecursiveFactorial_for_tracer(LeafTracer tracer) {
		tracer.setState(new TracerState());
		Letrec ast = buildNotTailRecursiveFactorial(4); 
		
		ExpressionDecorator multDecoratedNode = new ExpressionDecorator();
		ExpressionDecorator facDecoratedNode = new ExpressionDecorator();
		
		/* Annotate application of mult to x and y*/
		multDecoratedNode.setLink(new MonitorLink(new TracerAnnotation("#mult", new String[] { "x", "y" }), tracer));
		Abstraction multParentNode = ((Abstraction)((Abstraction)(ast.getAbstraction())).getExp());
		Expression multNode  = multParentNode.getExp();
		// ast binding abstraction exp exp1: decoratedNode.
		multDecoratedNode.setOriginalElement(multNode);
		multParentNode.setExp((Expression)multDecoratedNode);
			
		/* Annotate application of fac to x*/	
		Abstraction facParentNode = ((Letrec)ast.getExp()).getAbstraction();
		Expression facNode = facParentNode.getExp();
		
		facDecoratedNode.setLink(new MonitorLink(new TracerAnnotation("#fac", new String[] { "x" }), tracer));
		facDecoratedNode.setOriginalElement(facNode);
		facParentNode.setExp(facDecoratedNode);		
		DenotableValue result = ast.accept(new LambdaMonitoringEvaluator());
		System.out.println(">>> RESULT = " + result);
		return (TracerState) tracer.getState();
	}
		
	/**
	 * Run tracer on the factorial function defined by the method buildTailRecursiveFactorial
	 * @param tracer a basic tracing monitor
	 * @return the tracer monitoring state after evaluation
	 */
	private static TracerState evalTailRecursiveFactorial_for_tracer(LeafTracer tracer) {
		tracer.setState(new TracerState());
		Letrec ast = buildTailRecursiveFactorial(5); 
		
		ExpressionDecorator multDecoratedNode = new ExpressionDecorator();
		ExpressionDecorator facDecoratedNode = new ExpressionDecorator();
		
		/* Annotate application of mult to x and y*/
		MonitorLink link = new MonitorLink(new TracerAnnotation("#mult", new String[] { "x", "y" }), tracer);
		multDecoratedNode.setLink(link);
		Abstraction multParentNode = ((Abstraction)((Abstraction)(ast.getAbstraction())).getExp());
		Expression multNode  = multParentNode.getExp();
		// ast binding abstraction exp exp1: decoratedNode.
		multDecoratedNode.setOriginalElement(multNode);
		multParentNode.setExp((Expression)multDecoratedNode);
			
		/* Annotate application of fac to x and y*/		
		Abstraction facParentNode = ((Abstraction)((Letrec)ast.getExp()).getAbstraction().getExp());
		Expression facNode = facParentNode.getExp();
		
		facDecoratedNode.setLink(new MonitorLink(new TracerAnnotation("#fac", new String[] { "x","acc" }), tracer));
		facDecoratedNode.setOriginalElement(facNode);
		facParentNode.setExp(facDecoratedNode);		
		
		DenotableValue result = ast.accept(new LambdaMonitoringEvaluator());
		System.out.println(">>> RESULT = " + result);
		return (TracerState) tracer.getState();
	}
	
	/**
	 * (Version 1 of composite pattern application)
	 * Run a composite monitor (tracer+collector) on the factorial function defined by the method buildNotTailRecursiveFactorial
	 * @param composite a composite monitor (tracer+collector)
	 * @return the composite monitoring state after evaluation
	 */
	private static CompositeState evalTailRecursiveFactorial_for_composite(CompositeTracerCollector composite) {
		
		Letrec ast = buildNotTailRecursiveFactorial(5); 
		LambdaMonitoringEvaluator eval = new LambdaMonitoringEvaluator();
		
		ExpressionDecorator decoratedNode = new ExpressionDecorator();
		
		String[] facargs = { "x" };
 		MonitorLink link = new MonitorLink(new TracerAnnotation("#fac", facargs), composite.getMonitor(0));
		decoratedNode.setLink(link);
		MonitorLink linkC = new MonitorLink(new CollectorAnnotation("#fac"), composite.getMonitor(1));
		ExpressionDecorator decoratedNode2 = new ExpressionDecorator();
		decoratedNode2.setLink(linkC);
		decoratedNode2.setOriginalElement(decoratedNode);
		
		/* Annotate application of fac to x and y*/		
		Abstraction facParentNode = ((Letrec)ast.getExp()).getAbstraction();
		Expression facNode = facParentNode.getExp();
		
		decoratedNode.setOriginalElement(facNode);
		facParentNode.setExp((Expression)decoratedNode2);
		DenotableValue result = ast.accept(eval);
		System.out.println(">>> RESULT = " + result);
		return (CompositeState) composite.getState();
	}
	
	
	/** Run all the tests. Documentation in output strings... */
	public static void main(String[] args) {
		
		System.out.println("\n -------------- START TEST1: BASIC PROFILING ----------------------");
		LeafProfiler profiler = new LeafProfiler();
		ProfilerState ps = evalFac5_with_profiler(profiler);
		System.out.println(">>> State from profiling fac 5 (number of calls) = " + ps);
		System.out.println(  " -------------- END TEST1 -----------------------------------------");
	
		
		System.out.println("\n -------------- START TEST2: BASIC COLLECTING ---------------------");	
		LeafCollector collector = new LeafCollector();
		CollectorState<DenotableValue> cs = evalFac6_for_collector(collector);
		System.out.println(">>> State from collecting fac 5 (values computed by fac and conditional test) =\n" + cs);
		System.out.println(  " -------------- END TEST2 -----------------------------------------");

		
		System.out.println("\n -------------- START TEST3: BASIC TRACING (TAIL FAC) -------------");
		LeafTracer tracer = new LeafTracer();
		TracerState ts;
		ts = evalTailRecursiveFactorial_for_tracer(tracer);
		System.out.println(">>> State from tracing tailfac 5 = \n" + ts);
		System.out.println(  " -------------- END TEST3 -----------------------------------------");

		System.out.println("\n -------------- START TEST4: BASIC TRACING (NOT TAIL FAC) ---------");
		ts = evalNotTailRecursiveFactorial_for_tracer(tracer);
		System.out.println(">>> State from tracing not tailfac 5 with mult = \n" + ts); 
		System.out.println(  " -------------- END TEST4 -----------------------------------------");
			
		System.out.println("\n -------------- START TEST5: COMPOSITE MONITOR --------------------");
		CompositeTracerCollector composite = new CompositeTracerCollector();
		CompositeState ds = evalTailRecursiveFactorial_for_composite(composite);
		System.out.println("State from collecting and tracing fac 5 = \n" + ds);	
		System.out.println("\n -------------- END TEST5 -----------------------------------------");
	}

}
