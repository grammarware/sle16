package examples.lambda.concrete;

import lambda.ast.Abstraction;
import lambda.ast.Application;
import lambda.ast.Conditional;
import lambda.ast.Constant;
import lambda.ast.Letrec;
import lambda.ast.Primitive;
import lambda.ast.Variable;
import lambda.domains.DenotableValue;
import monitoring.concrete.debugger.DebugAnnotator;
import monitoring.concrete.debugger.DebugState;
import monitoring.concrete.debugger.LeafDebugger;
import monitoring.concrete.debugger.ProgramPointElement;
import monitoring.framework.composition.LambdaMonitoringEvaluator;

/**
 * Main class to test a basic debugger following Kishon and Hudak debugger
 * specification.
 * The debugger is run on two functions : a basic definition of the factorial function and a tail recursive one.
 * To test the first one, run this class runtime, and you can type the following commands step by step: 
 * help         - get the list of available commands
 * break fact   - put a breakpoint on fact's body.
 * run          - run the program until the break point
 * showData     - show the value of the formal argument
 * showStack    - get the remaining call stack
 * step         - step once in the program (note that in this prototype, even variables are stepped in...)
 * unbreak fact - remove the breakpoint on fact's body.
 * run          - run through the program (until the end, after the breakpoint is removed).
 */
public class MainDebuggerTester {

	/**
	 * Builds the AST for the program: letrec fact=\x.if (= x 1) then 1 else (*
	 * x (fact (+ x -1))) in (fact n)
	 * 
	 * @param n
	 *            parameter to which the factorial function applies
	 * @return an AST of the factorial function applied to n.
	 */
	public static Letrec buildNotTailRecursiveFactorial(int n) {

		Letrec ast = new Letrec(new Variable("fact"),
				new Abstraction(new Variable("x"),
						new Conditional(
								new Primitive(new Variable("="), new Variable("x"), new Constant(1)),
								new Constant(1), 
								new Primitive("x", "*", 
									new Application(
										new Variable("fact"),
										new Primitive(new Variable("+"), new Variable("x"), new Constant(-1)))
								))),
				new Application(new Variable("fact"), new Constant(n)));
		System.out.println("\n>>> Created AST for this program:\n" + ast);
		return ast;
	}

	/**
	 * Builds the AST for the program: letrec mult=\x.\y.(* x y) in letrec
	 * fact=\x.\acc.if (= x 1) then acc else ((fact (+ x -1)) ((mult x) acc)) in
	 * ((fact n) 1)
	 * 
	 * @param n
	 *            parameter to which the factorial function applies
	 * @return an AST of the factorial function applied to n.
	 */
	public static Letrec buildTailRecursiveFactorial(int n) {

		Letrec ast = new Letrec(new Variable("fact"),
				new Abstraction(new Variable("x"),
						new Abstraction(new Variable("acc"),
								new Conditional(new Primitive(new Variable("="), new Variable("x"), new Constant(1)),
										new Variable("acc"),
										new Application(
												new Application(new Variable("fact"),
														new Primitive(new Variable("+"), new Variable("x"),
																new Constant(-1))),
												new Application(
														new Application(new Variable("mult"), new Variable("x")),
														new Variable("acc")))))),
				new Application(new Application(new Variable("fact"), new Constant(n)), new Constant(1)));

		Letrec mult_ast = new Letrec(new Variable("mult"),
				new Abstraction(new Variable("x"), new Abstraction(new Variable("y"),
						new Primitive(new Variable("*"), new Variable("x"), new Variable("y")))),
				ast);
		System.out.println("\n>>> Created AST for this program:\n" + mult_ast);
		return mult_ast;
	}

	/**
	 * A proof-of-concept test of the debugger on the factorial definition
	 * applied to 5 build by the method buildNotTailRecursiveFactorial
	 * @param debugger
	 * @return the final debug state
	 */
	private static DebugState evalDebuggerExample1(LeafDebugger debugger) {
		debugger.setState(new DebugState());
		Letrec ast = buildNotTailRecursiveFactorial(5);
		// Annotate all the elements as program point elements
		// This is only for dirty-early-proof-of-concept-prototyping
		DebugAnnotator dAnnotator = new DebugAnnotator(debugger);
		ProgramPointElement dAst = dAnnotator.visit(ast);
		
		System.out.println("\n -------------- DEBUG-TEST1: STARTING BASIC DEBUGGING --------------");
		System.out.println("Debug on factorial 5:" + dAst.toString_withAnn());
		System.out.println("Suggestion of input sequences : "
				+ "break fact | run | showData | showStack | step | step | unbreak fact | run \n");
		DenotableValue result = dAst.accept(new LambdaMonitoringEvaluator());
		System.out.println("RESULT = " + result);
		System.out.println("\n -------------- DEBUG-TEST1: END BASIC DEBUGGING --------------");
		return (DebugState) debugger.getState();
	}

	/**
	 * A proof-of-concept test of the debugger on the factorial definition
	 * applied to 3 built by the method buildTailRecursiveFactorial
	 * @param debugger
	 * @return the final debug state
	 */
	private static DebugState evalDebuggerExample2(LeafDebugger debugger) {

		debugger.setState(new DebugState());
		Letrec ast = buildTailRecursiveFactorial(3);
		DebugAnnotator dAnnotator = new DebugAnnotator(debugger);
		ProgramPointElement dAst = dAnnotator.visit(ast);
		System.out.println("\n -------------- DEBUG-TEST2: STARTING BASIC DEBUGGING --------------");
		System.out.println("Debug on (tail-rec) factorial 3:" + dAst.toString_withAnn());
		DenotableValue result = dAst.accept(new LambdaMonitoringEvaluator());
		System.out.println("RESULT = " + result);
		System.out.println("\n -------------- DEBUG-TEST2: STARTING BASIC DEBUGGING --------------");
		return (DebugState) debugger.getState();

	}

	public static void main(String[] args) {
		System.out.println("\n -------------- DEBUGGER-TEST1 --------------");
		LeafDebugger debugger = new LeafDebugger();
		DebugState debugState;
		debugState = evalDebuggerExample1((LeafDebugger) debugger);
		System.out.println("Final state = " + debugState);

		System.out.println("\n -------------- DEBUGGER-TEST2 --------------");
		debugState = evalDebuggerExample2((LeafDebugger) debugger);
		System.out.println("Final state = " + debugState);
	}

}
