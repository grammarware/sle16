package monitoring.concrete.debugger;

import java.util.Collection;
import java.util.Scanner;

import lambda.ast.Expression;
import lambda.ast.Letrec;
import lambda.domains.Configuration;
import lambda.domains.DenotableValue;
import monitoring.concrete.debugger.DebugAnnotation.Label;
import monitoring.framework.composition.ExpressionDecorator;
import monitoring.framework.specification.AbstractAnnotation;
import monitoring.framework.specification.IConfiguration;
import monitoring.framework.specification.LeafMonitor;

public class LeafDebugger extends LeafMonitor {

	Scanner in;
	public Boolean resume;
	private DebugState debugState;
	
	public LeafDebugger() {
		state = new DebugState();
		in = new Scanner(System.in);
		in.useDelimiter( "\\s+");
	}
	
	@Override
	public void pre(Expression aNode, AbstractAnnotation annotation, IConfiguration context) {
		DebugAnnotation ann = (DebugAnnotation) annotation;
		DebugState state = (DebugState) getState();
		if (ann.label == Label.LBreak) {
			if (state.isSingleStep()) {
				state.setIsSingleStep(false); // Unbreak (until next time)
				getCmd(aNode, context);
			}
		}
		// The node is attached the label LDebug (one can stop there - body of a letrec.)
		else {
			Frame frame = new Frame(ann.funName, ann.formalArgNames, ann.localVarNames);
			// Store next function call 
			state.getFrameStack().push(frame);
			if (state.getStopAtSet().contains(ann.funName)) {
				// Print current state if in a stoppable program point
				writeTrace(context);
				state.setIsSingleStep(true);
			}
		}
	}

	@Override
	public void post(Expression aNode, AbstractAnnotation annotation, DenotableValue value, 
			IConfiguration context) {
		DebugAnnotation ann = (DebugAnnotation) annotation;
		if (ann.label == Label.LBreak) { 
		} // Nothing to do
		if (ann.label == Label.LDebug) {
			// We can pop the handled call which is finished.
			((DebugState)state).getFrameStack().pop();
			// getCmd needs to be called in post debug because it was not captured in a continuation
			// during the pre- call.
			//getCmd(aNode, context);
		}
	}

	/* -----------------------------------------------------------------------
	 * Operations for DebugState
	 * ----------------------------------------------------------------------- */

	public void setResume(Boolean status) {
		this.resume = status;
	}


	public void writeUsr(String usrMsg) {
		System.out.print(usrMsg);
	}

	/* TODO : split the command (or define a small debug query parser) */
	public String readUsr() {
		String input = in.next();
		//input = in.nextLine();
		/* TODO: use it later --
		     if(in.hasNext())
		          System. out.println(in.next());*/
		return input;
	}

	public void getCmd(Expression dNode, IConfiguration config) {
		writeUsr("Your command: ");
		String cmd = readUsr();
		// Changes state (the resume flag)
		getCmd_processCmd(cmd, (Expression)dNode, config);
		if (resume == false) {
			getCmd(dNode, config);
		}
		// Else, do not wait for another user input 

	}

	/* dstate parameter become DebugState, this. 
	 * inpXX : next scanned data in user's input 
	 * Principle : update current state with debug information
	 * step : return the current state with breakpoint set to true
	 * stop/unstop : add/remove the name of function to stop into the list of functions
	 * where to stop (stored into debug state)
	 * */
	public void getCmd_processCmd(String cmd, Expression dNode, IConfiguration config) {

		DebugState state = (DebugState) this.state; // To avoid cast. 
		if (cmd.compareTo("run") == 0) {
			setResume(true);
		}

		else if (cmd.compareTo("step") == 0) {
			writeUsr ("Node:" + dNode.toString());
			writeUsr("\n");
			setResume(true); // HACK should be true
			state.setIsSingleStep(true); // updBrk true dstate
		}

		else if (cmd.compareTo("showNext") == 0) { // "list"
			writeUsr (dNode.toString());
			setResume(false);
		}

		else if (cmd.compareTo("break") == 0) { // "stop"
			String fn = readUsr();
			setResume(false);
			state.getStopAtSet().add(fn);
		}

		else if (cmd.compareTo("unbreak") == 0) { // "unstop"
			String fn = readUsr();
			setResume(false);
			state.getStopAtSet().remove(fn);
		}

		else if (cmd.compareTo("showData") == 0) { // "show"
			// No change in debug state
			if (!state.getFrameStack().isEmpty()) {
				Frame frame = state.getFrameStack().peek();
				writeVars("Formal ", frame.getFormalArgs(), config);
				writeVars("Local ", frame.getLocalVars(), config);
				writeUsr("\n");
			}
			else
				writeUsr("Stack is empty\n");
			setResume(false);
		}

		else if (cmd.compareTo("showStack") == 0) { // "where" (am I)
			writeUsr("[");
			for (Frame frame : state.getFrameStack()) {
				writeUsr(frame.toString() + "\n");
			}
			writeUsr("]\n");
			setResume(false);
		}

		else { // TODO : eval (eval with current env, debug : debug with current env - recDebug
			writeUsr("Undefined command : " + cmd + "\n");
			writeUsr("Choose run, step, break <funName>, unbreak <funName>, showNext, showData, showStack\n");
			setResume(false);
		}
	}

	/* FIXME */
	public void writeVars(String prefix, Collection<String> varIds, IConfiguration config) {
		writeUsr(prefix);
		
		for (String i : varIds) {
			writeUsr(i + " = " );
			if (config.lookup(i) != null) 
				writeUsr(config.lookup(i).toString());
			else 
				writeUsr("<unknown> - check annotations");
			writeUsr(" ");
		}
	}

	public String getIdValue(String id, Configuration config) {
		return config.lookup(id).toString();
	}

	/* stack is this' debug state stack. */
	public void writeTrace(IConfiguration config) {
		Frame frame = ((DebugState)state).getFrameStack().peek();
		writeUsr("[writeTrace] Stop in " + frame.getFunName());
		writeVars("Formal args = ", frame.getFormalArgs(), config);
		writeUsr("\n");
	}

}
