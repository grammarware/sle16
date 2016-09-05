package monitoring.generator;

import lambda.ast.Abstraction;
import lambda.ast.Expression;
import lambda.ast.ILambdaVisitor;
import lambda.valuation.LambdaEvaluator;

import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.*;

/**
 * Created by ciprian on 23/05/16.
 */
public class MonitoringSupportGenerator {

    public static void main(String args[]) {
        List<Class> targets = new ArrayList<>();
        targets.add(Expression.class);
        targets.add(Abstraction.class);
        generateFor(targets, ILambdaVisitor.class, LambdaEvaluator.class);
    }

    public static <T> void generateFor(List<Class> classes, Class baseVisitor, Class<T> valuation) {
        MonitoringSupportGenerator generator = new MonitoringSupportGenerator();
        generator.emitMonitoringFor(classes, baseVisitor, valuation);
    }

    String currentDecoratorName;
    String currentVisitorName;

    PrintStream out = null;

    void emitMonitoringFor(List<Class> classes, Class baseVisitor, Class valuation) {

        try {
            out = new PrintStream(new File("src/examples/lambda/generated/GenMonitoring.java"));

            out.println("package examples.lambda.generated;\n");
            out.println("/* This file was automatically generated on by MonitoringSupportGenerator */");
            out.println("import monitoring.framework.Link;\n");
            out.println("public class GenMonitoring {\n");

            Map<String, String> visitors = new HashMap<>();
            for (Class clazz : classes) {
                currentDecoratorName = clazz.getSimpleName() + "Decorator";
                currentVisitorName = "I" + currentDecoratorName + "Visitor";

                emitDecorator(clazz, baseVisitor);
                emitVisitorInterface(baseVisitor);
                visitors.put(currentVisitorName, currentDecoratorName);
            }
            emitMonitoringValuation(visitors, baseVisitor, valuation);

            out.println("}");
        }catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (out != null) out.close();
        }
    }

    void emitDecorator(Class clazz, Class baseVisitor) {
        out.println("public static class " + currentDecoratorName + " extends " + clazz.getName() + " {");
        out.println("\tprivate " + clazz.getName() + " originalElement;");
        out.println("\tprivate Link link;");

        out.println("\tpublic "+currentDecoratorName+"() {}\n" +
                "\tpublic "+currentDecoratorName+"("+clazz.getName()+" element, Link link) {\n" +
                "\t\tthis.originalElement = element;\n" +
                "\t\tthis.link = link;\n" +
                "\t}");

        out.println("\tpublic Link getLink() { return link; }\n" +
                "\tpublic void setLink(Link link) { this.link = link; }");

        out.println("\tpublic "+clazz.getName()+" getOriginalElement() { return originalElement; }\n" +
                "\tpublic void setOriginalElement("+clazz.getName()+" originalElement) { this.originalElement = originalElement; }");

        out.println("\t@Override\n" +
                "\tpublic <T> T accept("+baseVisitor.getName()+"<T> visitor) {\n" +
                "\t\tif (visitor instanceof "+ currentVisitorName +") {\n" +
                "\t\t\treturn (("+currentVisitorName+"<T>)visitor).visit(this); \n" +
                "\t\t}\n" +
                "\t\telse\n" +
                "\t\t\treturn getOriginalElement().accept(visitor);\t\n" +
                "\t}");

        out.println("\t@Override\n" +
                "\tpublic String toString() { return originalElement.toString(); }");
        out.println("}");
    }

    void emitVisitorInterface(Class interpreter) {
        out.println("public static interface "+currentVisitorName+"<T> extends "+interpreter.getName()+"<T> {\n" +
                "\tT visit("+currentDecoratorName+" aNode);\n" +
                "}");
    }

    void emitMonitoringValuation( Map<String, String> visitors, Class interpreter, Class valuation) {
        out.print("public static class " + valuation.getSimpleName() + "Monitoring " +
                "\n\t extends " + valuation.getName() +
                "\n\t implements ");
        boolean isFirst = true;
        Type type =null;
        for (String visitorInterface : visitors.keySet()) {
            if (isFirst) isFirst = false;
            else out.print("\n\t\t, ");
            out.print(visitorInterface);

            Object[] result = (Arrays.stream(valuation.getGenericInterfaces())
                    .filter((x) -> x.getTypeName().startsWith(interpreter.getTypeName())))
                    .toArray();
            if (result.length == 0)
                throw new RuntimeException("valuation class does not implement base visitor");
            if (((ParameterizedType)result[0]).getActualTypeArguments().length > 1)
                throw  new RuntimeException("Only one template argument supported for now");
            out.print("<"+((ParameterizedType)result[0]).getActualTypeArguments()[0].getTypeName() + ">");
            if (type != null && type != ((ParameterizedType)result[0]).getActualTypeArguments()[0])
                throw new RuntimeException("multiple return types not supported yet");
            if (type == null)
                type = ((ParameterizedType)result[0]).getActualTypeArguments()[0];
        }
        out.print(" {\n\n");

        for (String decorator : visitors.values()) {
            out.println("\tpublic " + type.getTypeName() + " visit("+decorator+" dNode) {\n" +
                    "\t\tLink link = dNode.getLink();\n" +
                    "\t\tlink.pre(dNode.getOriginalElement(), this);\n" +
                    "\t\t" + type.getTypeName() + " result = dNode.getOriginalElement().accept(this);\n" +
                    "\t\tlink.post(dNode.getOriginalElement(), result, this);\n" +
                    "\t\treturn result;\n" +
                    "\t}");
        }


        out.print("}\n");
    }
}
