package monitoring.framework.specification;

import java.util.ArrayList;
import java.util.List;

import lambda.ast.Expression;
import lambda.domains.DenotableValue;

public class CompositeMonitor extends AbstractMonitor {

	List<AbstractMonitor> monitors;
	
	/** IMonitorState <|- CompositeState */
	@Override
	public IMonitorState getState() {
		CompositeState cstate = new CompositeState();
		int i = 0;
		for (AbstractMonitor m : monitors) {
			cstate.addState(m.getState());
			System.out.println("ComponentState " + (i++) + " = " + m.getState());
		}
		return cstate;
	}
	
	public CompositeMonitor() {
		monitors = new ArrayList<AbstractMonitor>();
	}
	
	@SuppressWarnings("unchecked")
	public void addMonitor(@SuppressWarnings("rawtypes") AbstractMonitor m) {
		monitors.add(m);
	}
	
	public AbstractMonitor getMonitor(Integer index) {
		return monitors.get(index);
	}
	
	@Override
	public void pre(Expression aNode, AbstractAnnotation annotation, IConfiguration context) {
		for (AbstractMonitor m : monitors) {
			m.pre(aNode, annotation, context);
		}

	}

	@Override
	public void post(Expression aNode, AbstractAnnotation annotation, DenotableValue value,
			IConfiguration context) {
		for (AbstractMonitor m : monitors) {
			m.post(aNode, annotation, value, context);
		}
	}	
}
