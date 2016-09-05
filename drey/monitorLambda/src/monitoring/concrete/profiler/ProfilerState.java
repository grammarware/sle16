package monitoring.concrete.profiler;

import java.util.HashMap;
import java.util.Map.Entry;

import monitoring.framework.specification.IMonitorState;

public class ProfilerState implements IMonitorState {

	HashMap<String, Integer> map;
	
	public ProfilerState() {
		map = new HashMap<String, Integer>();
	}
	
	public void increment(String symbol) {
		Integer value = map.get(symbol);
		if (value == null) 
			map.put(symbol, 0);
		else
			map.put(symbol, value+1);
	
	}
	
	public HashMap<String, Integer> getMap() {
		return map;
	}
	
	public String toString() {
		String str = "[ ";
		for (Entry<String, Integer> e : map.entrySet()) {
			str += e.getKey() + " = " + e.getValue() + "; ";
		}
		str += "]";
		return str;
	}
	
}
