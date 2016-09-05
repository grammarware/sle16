package monitoring.concrete.composite;

import monitoring.concrete.collector.LeafCollector;
import monitoring.concrete.tracer.LeafTracer;
import monitoring.framework.specification.CompositeMonitor;

public class CompositeTracerCollector extends CompositeMonitor {
	private LeafTracer tracer;
	private LeafCollector collector;
	
	public CompositeTracerCollector() {
		tracer = new LeafTracer();
		collector = new LeafCollector();
		addMonitor(tracer);
		addMonitor(collector);
	}

}
