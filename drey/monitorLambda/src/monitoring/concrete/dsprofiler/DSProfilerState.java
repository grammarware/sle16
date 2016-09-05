package monitoring.concrete.dsprofiler;

import java.util.Stack;

import monitoring.framework.specification.IMonitorState;

public class DSProfilerState implements IMonitorState {
	
	private Stack<Long> stack;
	
	public DSProfilerState() {
		stack = new Stack<Long>();
	}
	
	public Stack<Long> getStack() {
		return stack;
	}

}
