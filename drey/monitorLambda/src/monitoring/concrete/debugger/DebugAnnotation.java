package monitoring.concrete.debugger;

import java.util.List;

import monitoring.framework.specification.AbstractAnnotation;

public class DebugAnnotation extends AbstractAnnotation {

	public enum Label {
		LBreak, LDebug
	};

	public Label label;
	/* Only if label = LDebug */
	public String funName;
	public List<String> formalArgNames;
	public List<String> localVarNames;	
	
	public DebugAnnotation(String fN, List<String> la, List<String> lv) {
		label = Label.LDebug;
		funName = fN;
		formalArgNames = la;
		localVarNames = lv;
	}
	
	public DebugAnnotation() {
		label = Label.LBreak;
	}

	@Override
	public String toString() {
		if (label == Label.LBreak) return "LBreak";
		return "LDebug";
	}
	
}
