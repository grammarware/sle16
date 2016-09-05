package monitoring.concrete.tracer;

import monitoring.framework.specification.AbstractAnnotation;

/** aka smalltalk's MonFunctionHeaderAnnotation */
public class TracerAnnotation extends AbstractAnnotation {
	
	public String name;
	public String[] args;

	public TracerAnnotation(String n, String[] a) {
		name = n;
		args = a;
	}
	
	public String getName() {
		return name;
	}
	
	public String[] getArgs() {
		return args;
	}
	
	@Override
	public String toString() {
		String argsStr = "";
		for (String a : args) { argsStr += a + "; "; }
		return name + ":" + argsStr;
	}
}
