package org.gemoc.execution.concurrent.ccsljavaengine.ui.views.stimulimanager.filters;

import java.util.Collection;

import org.gemoc.execution.concurrent.ccsljavaengine.ui.views.stimulimanager.ModelSpecificEventWrapper;

public class NoFilter extends Filter {

	@Override
	public Collection<ModelSpecificEventWrapper> applyFilter() {
		addFutureTickingClocks();
		return wrapperList;
	}
}
