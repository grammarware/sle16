package lambda.domains;

import java.util.HashMap;
import java.util.Set;

public class FunctionEnvironment extends Environment {


	public FunctionEnvironment(Environment p) {
		super(p);
	}

	/** update the value of the function argument (assuming a function has 
	 * a unique argument) */
	public void updateArg(DenotableValue value) {
		Set<String> set = mapping.keySet();
		String theKey = (String) (set.toArray())[0];
		mapping.put(theKey, value);
	}
	
	public String getArgName() {
		Set<String> set = mapping.keySet();
		return (String) (set.toArray())[0];
	}
	
	@Override
	public Object clone() {
		FunctionEnvironment fEnv = new FunctionEnvironment(parent);
		fEnv.mapping = (HashMap<String, DenotableValue>) mapping.clone();
		return fEnv;
	}
}
