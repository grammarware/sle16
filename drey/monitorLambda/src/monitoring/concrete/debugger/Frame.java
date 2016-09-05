package monitoring.concrete.debugger;

import java.util.ArrayList;
import java.util.List;

/**
 * This frame is not exactly the lambda frame : it contains information for an
 * "uncurryfied" debugged version of a lambda expression. It is defined here on
 * purpose, although the language Frame can be used to rebuilt this one. It is
 * interesting to let this, since it shows a monitor-specific level of
 * abstraction.
 */
public class Frame {
	
	String funName;
	List<String> formalArgs;
	List<String> localVars;
	
	
	public String getFunName() {
		return funName;
	}

	public Frame() {
		funName = "";
		formalArgs = new ArrayList<String>();
		localVars = new ArrayList<String>();
	}
	
	public Frame(String fName, List<String> fArgs, List<String> lVars) {
		funName = fName;
		formalArgs = fArgs;
		localVars = lVars;
	}
	
	/* -----------------------------------------------------------------------
	 * Getters/Setters
	 * ----------------------------------------------------------------------- */

	public void setFunName(String funName) {
		this.funName = funName;
	}
	public List<String> getFormalArgs() {
		return formalArgs;
	}
	public void setFormalArgs(List<String> formalArgs) {
		this.formalArgs = formalArgs;
	}
	public List<String> getLocalVars() {
		return localVars;
	}
	public void setLocalVars(List<String> localVars) {
		this.localVars = localVars;
	}
	
	public String toString() {
		String str = funName + ": ";
		for (String arg : formalArgs) {
			str += arg;
			if (formalArgs.indexOf(arg) == formalArgs.size() - 1) str += ", ";
		}
		for (String var : localVars) {
			str += var;
			if (localVars.indexOf(var) == localVars.size() - 1) str += ", ";
		}
		str += " ; ";
		return str;
	}
	
}
