package monitoring.concrete.collector;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

import monitoring.framework.specification.IMonitorState;

public class CollectorState<DenotableValue> implements IMonitorState {

	HashMap<String, List<DenotableValue>> map;
	
	public CollectorState() {
		map = new HashMap<String, List<DenotableValue>>();
	}
	
	public HashMap<String, List<DenotableValue>> getMap() {
		return map;
	}
	
	public void addValue(String symbol, DenotableValue value) {
		List<DenotableValue> set = map.get(symbol);
		if (set == null) {
			set = new ArrayList<DenotableValue>();
			map.put(symbol, set);
		}
		set.add(value);
			
	}
	
	public String toString() {
		String str = "[ ";
		for (Entry<String, List<DenotableValue>> e : map.entrySet()) {
			str += e.getKey() + " === " + e.getValue() + "; ";
		}
		str += "]";
		return str;
	}
	
}
