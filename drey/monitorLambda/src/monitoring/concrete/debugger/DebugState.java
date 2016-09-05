package monitoring.concrete.debugger;

import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

import monitoring.framework.specification.IMonitorState;

public class DebugState implements IMonitorState {
	
	Stack<Frame> frameStack;
	Set<String> stopAtSet;
	Boolean isSingleStep;
		
	public DebugState() {
		frameStack = new Stack<Frame>();
		stopAtSet = new HashSet<String>();
		isSingleStep = true;
	}
	
	/* -----------------------------------------------------------------------
	 * Getters and setters
	 * ----------------------------------------------------------------------- */
	
	public Stack<Frame> getFrameStack() {
		return frameStack;
	}
	public void setFrameStack(Stack<Frame> frameStack) {
		this.frameStack = frameStack;
	}
	public Set<String> getStopAtSet() {
		return stopAtSet;
	}
	
	public void setStopAtSet(Set<String> stopAtSet) {
		this.stopAtSet = stopAtSet;
	}
	
	public Boolean isSingleStep() {
		return isSingleStep;
	}
	public void setIsSingleStep(Boolean isSingleStep) {
		this.isSingleStep = isSingleStep;
	}
	
}






