package lambda.domains;

import java.util.HashMap;

public class Environment implements Cloneable {

	Environment parent;
	HashMap<String, DenotableValue> mapping;
	
	public Environment() {
		mapping = new HashMap<String, DenotableValue>();
		parent = null;
	}
	/** Create an environment with parent p. */
	public Environment(Environment p) {
		mapping = new HashMap<String, DenotableValue>();
		parent = p;
	}
	
	/** Create an environment with a mapping containing a unique
	 * name initially bound to null. */
	public Environment(String aName, Environment p) {
		this(p);
		update(aName, null);
	}
	
	public Environment(HashMap<String, DenotableValue> mapping, Environment parent) {
		this.mapping = mapping;
		this.parent = parent;
	}

	public DenotableValue lookup(String aName) {
		DenotableValue value = mapping.get(aName);
		if (value == null && parent != null)
			value = parent.lookup(aName);
		return value;
		
	}
	
	public void update(String aName, DenotableValue aValue) {
		mapping.put(aName, aValue);
	}
	
	public void setParent(Environment parent) {
		this.parent = parent;
	}
	
	public Environment getParent() {
		return parent;
	}

	@Override
	public Object clone() {
		Environment env = new Environment(parent);
	    env.mapping = (HashMap<String, DenotableValue>) mapping.clone();
	    return env;	
	}
	
	
}
