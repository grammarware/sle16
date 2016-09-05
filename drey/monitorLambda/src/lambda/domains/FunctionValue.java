package lambda.domains;

import lambda.ast.Expression;

public class FunctionValue extends DenotableValue {
	
	Environment environment;
	Expression code;
	
	public void setCode(Expression code) {
		this.code = code;
	}
	
	public void setEnvironment(Environment environment) {
		this.environment = environment;
	}

	public Expression getCode() {
		return code;
	}
	
	public Environment getEnvironment() {
		return environment;
	}
	
}
