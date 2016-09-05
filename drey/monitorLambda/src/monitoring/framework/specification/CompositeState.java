package monitoring.framework.specification;

import java.util.ArrayList;
import java.util.List;

public class CompositeState implements IMonitorState {

	List<Object> states;
	
	public CompositeState() {
		states = new ArrayList<Object>();
	}
	
	public void addState(Object s) {
		states.add(s);
	}
	
	@Override
	public String toString() {
		String r = "";
		for (Object s : states) {
			r += s.toString();
		}
		return r;
	}
}
