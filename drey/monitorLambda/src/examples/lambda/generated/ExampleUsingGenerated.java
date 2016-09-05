package examples.lambda.generated;

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
import monitoring.concrete.dsprofiler.DSProfiler;
import monitoring.framework.specification.MonitorLink;

/**
 * Created by ciprian on 23/05/16.
 */
public class ExampleUsingGenerated {
    public static void main(String args[]) {
        System.err.println("== Simple recursive factorial\n");
        JavaProfiler.profile(() -> run(annotateFactorial(buildFactorial(200), new DSProfiler())), "time");
    }

    static void run(Expression annotatedAST) {
        DenotableValue result = annotatedAST.accept(new GenMonitoring.LambdaValuationMonitoring());
        System.out.println("RESULT = " + result);
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
        MonitorLink link = new MonitorLink(profiler);
        //decorate the letrec
        Expression outAST = new GenMonitoring.ExpressionDecorator(inAST, link);

        //decorate the x variable in the (* x (fact (+ x -1)))
        Primitive prim = (Primitive)((Conditional)((Letrec)inAST).getAbstraction().getExp()).getExp3();
        prim.setLhs(new GenMonitoring.ExpressionDecorator(prim.getLhs(), link));

        //decorate the condition (= x 0)
        Conditional cond = ((Conditional)((Letrec)inAST).getAbstraction().getExp());
        cond.setExp1(new GenMonitoring.ExpressionDecorator(cond.getExp1(), link));

        //decorate the conditional if (= x 0) then 1 else (* x (fact (+ x -1)))
        Abstraction abs = ((Letrec)inAST).getAbstraction();
        abs.setExp(new GenMonitoring.ExpressionDecorator(abs.getExp(), link));

        //decorate the (+ x -1)
        Application add = ((Application)((Primitive)cond.getExp3()).getRhs());
        add.setExp2(new GenMonitoring.ExpressionDecorator(add.getExp2(), link));

        //decorate the (fact (+ x -1)
        Primitive app = ((Primitive)cond.getExp3());
        app.setRhs(new GenMonitoring.ExpressionDecorator(app.getRhs(), link));

        //decorate the (* x (fact (+ x -1)))
        cond.setExp3(new GenMonitoring.ExpressionDecorator(cond.getExp3(), link));

        //decorate the letrec abstraction
        //WE cannot use the ExpressionDecorator since the setAbstraction needs a more refined type
        Letrec let = (Letrec)inAST;
        let.setAbstraction(new GenMonitoring.AbstractionDecorator(let.getAbstraction(),link));

        return outAST;
    }
}
