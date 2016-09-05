package lambda.valuation;

import java.math.BigInteger;
import java.util.Hashtable;

import lambda.ast.Abstraction;
import lambda.ast.Application;
import lambda.ast.Conditional;
import lambda.ast.Constant;
import lambda.ast.Expression;
import lambda.ast.ILambdaVisitor;
import lambda.ast.Letrec;
import lambda.ast.Primitive;
import lambda.ast.Variable;
import lambda.domains.BooleanValue;
import lambda.domains.Configuration;
import lambda.domains.DenotableValue;
import lambda.domains.EmptyEnvironment;
import lambda.domains.Environment;
import lambda.domains.FunctionEnvironment;
import lambda.domains.FunctionValue;
import lambda.domains.NumberValue;

public class LambdaEvaluator implements ILambdaVisitor<DenotableValue> {

	
	Hashtable<String, IntegerMath> primitives;
	protected Configuration configuration;

	public void setConfiguration(Configuration configuration) {
		this.configuration = configuration;
	}
	
	public Configuration getConfiguration() {
		return configuration;
	}

	interface IntegerMath {
        DenotableValue operation(DenotableValue a, DenotableValue b);   
    }
  
    public DenotableValue doOperation(DenotableValue a, DenotableValue b, IntegerMath op) {
        return op.operation(a, b);
    }
    
    public LambdaEvaluator() {
    	configuration = new Configuration();
    	configuration.push(new EmptyEnvironment());
		primitives = new Hashtable<String, IntegerMath>();
		primitives.put("+", (a, b) -> ((NumberValue)a).plus((NumberValue)b));	
		primitives.put("*", (a, b) -> ((NumberValue)a).mult((NumberValue)b));
		primitives.put("=", (a, b) -> ((NumberValue)a).equals((NumberValue)b));
		primitives.put("<", (a, b) -> ((NumberValue)a).lt((NumberValue)b));
	}
 
	@Override
	public DenotableValue visit(Abstraction aNode) {
		FunctionEnvironment funEnv;
		funEnv = new FunctionEnvironment(configuration.currentEnvironment());
		funEnv.update(aNode.getArg().getIname(), null);
		FunctionValue funval = new FunctionValue();
		funval.setEnvironment(funEnv);
		funval.setCode(aNode.getExp());
		return funval;	
	}
	
	@Override
	public DenotableValue visit(Application aNode) {
		DenotableValue argument = aNode.getExp2().accept(this);
		FunctionValue funValue = (FunctionValue) aNode.getExp1().accept(this);
		FunctionEnvironment frame = 
				(FunctionEnvironment) funValue.getEnvironment().clone();
		frame.updateArg(argument);
		configuration.push(frame);
		DenotableValue result = funValue.getCode().accept(this);
		configuration.pop();
		return result;
	}

	@Override
	public DenotableValue visit(Conditional aNode) {
		DenotableValue conditionValue = aNode.getExp1().accept(this);
		DenotableValue result = null;
		if (((BooleanValue) conditionValue).getValue()) {
			result = aNode.getExp2().accept(this);
		} else {
			result = aNode.getExp3().accept(this);
		}
		return result;
	}

	@Override
	public DenotableValue visit(Constant aNode) {
		try {
			return new NumberValue(new BigInteger(aNode.getValue()));
		} catch (NumberFormatException e) {
			if (aNode.getValue().equalsIgnoreCase("true")) return BooleanValue.TRUE;
			else if (aNode.getValue().equalsIgnoreCase("false")) return BooleanValue.FALSE;
			else throw new NumberFormatException("(lambda) Invalid constant literal");
		}	
	}

	@Override
	public DenotableValue visit(Variable aNode) {
		DenotableValue result = configuration.lookup(aNode.getIname());
		if (result == null) 
			throw new RuntimeException("Unbound variable : " + aNode.getIname());
		return result;
	}

	@Override
	public DenotableValue visit(Letrec aNode) {
		
		String funName = aNode.getIdentifier().getIname();
		Environment binding = new Environment(configuration.currentEnvironment());
		configuration.push(binding);
		DenotableValue funValue = aNode.getAbstraction().accept(this);
		binding.update(funName, funValue);
		DenotableValue result = aNode.getExp().accept(this);
		configuration.pop();
		
		return result;
	}

	@Override
	public DenotableValue visit(Primitive aNode) {
		DenotableValue lhs = aNode.getLhs().accept(this);
		DenotableValue rhs = aNode.getRhs().accept(this);
		return doOperation(lhs, rhs, primitives.get(aNode.getOperator().getIname()));
	}

	@Override
	public DenotableValue visit(Expression aNode) { return null; }
	
}
