package org.gemoc.gel.compiler;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.gemoc.gel.DomainSpecificEvent;
import org.gemoc.gel.microgel.ModelSpecificEvent;

/**
 * A small utility trace for the compilation of GEL into microgel.
 * 
 * @author flatombe
 *
 */
public class GelCompilationTrace {
	Map<DomainSpecificEvent, Collection<ModelSpecificEvent>> dseToMses = new HashMap<>();
	Map<ModelSpecificEvent, DomainSpecificEvent> mseToDse = new HashMap<>();

	public void add(DomainSpecificEvent dse, Collection<ModelSpecificEvent> mses) {
		Collection<ModelSpecificEvent> collection = new ArrayList<>();
		if (dseToMses.containsKey(dse)) {
			collection.addAll(mses);
		} else {
			dseToMses.put(dse, mses);
		}
	}

	public void add(ModelSpecificEvent mse, DomainSpecificEvent dse) {
		mseToDse.put(mse, dse);
	}

	public Collection<ModelSpecificEvent> get(DomainSpecificEvent dse) {
		return dseToMses.get(dse);
	}

	public DomainSpecificEvent get(ModelSpecificEvent mse) {
		return mseToDse.get(mse);
	}

}
