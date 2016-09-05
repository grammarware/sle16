package lambda.domains;

import java.util.Stack;

import monitoring.framework.specification.IConfiguration;

public class Configuration implements IConfiguration {

	Stack<Environment> environmentStack = new Stack<Environment>();
	
	public void push(Environment env) {
		environmentStack.push(env);
	}
	
	public Environment pop() {
		return environmentStack.pop();
	}
	
    public Environment currentEnvironment() {
    	return environmentStack.peek();
    }
	
	@Override
	public DenotableValue lookup(String name) {
		return environmentStack.peek().lookup(name);
	}

	public Stack<Environment> getEnvironmentStack() {
		return environmentStack;
	}
	
}
