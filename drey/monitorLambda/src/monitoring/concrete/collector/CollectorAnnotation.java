package monitoring.concrete.collector;

import monitoring.framework.specification.AbstractAnnotation;

public class CollectorAnnotation extends AbstractAnnotation {
	
	public String symbol;

	public CollectorAnnotation(String s) {
		symbol = s;
	}
	
	public String getSymbol() {
		return symbol;
	}
	
	@Override
	public String toString() {
		return symbol;
	}
}
