package monitoring.concrete.tracer;

import monitoring.framework.specification.IMonitorState;

public class TracerState implements IMonitorState {

	String trace;
	String indent;
	String oneIndent = "|  ";
	
	public TracerState() {
		trace = "";
		indent = "";
	}
	
	public void add(String t) {
		trace += t;
	}
	
	public void addReceive(String fName, String aList) {
		trace += indent + "[" + fName + " receives (" + aList + ")]";
	}
	
	public void addReturn(String fName, String result) {
		trace += indent + "[" + fName + " returns " + result + "]\n";
	}
	
	public String toString() {
		return trace;
	}
	
	public void increaseIndent() {
		indent += oneIndent;
	}
	public void decreaseIndent() {
		indent = indent.substring(0, indent.length() - oneIndent.length());
	}
	
	public void indent() {
		trace = indent + trace;
	}
}
