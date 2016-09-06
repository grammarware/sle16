package org.gemoc.execution.engine.coordinator.commons;

import java.util.ArrayList;

import org.eclipse.emf.common.util.URI;
import org.gemoc.execution.concurrent.ccsljavaengine.extensions.timesquare.moc.impl.CcslSolver;

import fr.inria.aoste.timesquare.ccslkernel.solver.CCSLKernelSolver;
import fr.inria.aoste.timesquare.ccslkernel.solver.launch.CCSLKernelSolverWrapper;
import fr.inria.diverse.trace.commons.model.trace.Step;

public class CoordinationSolver extends CcslSolver {

	public ArrayList<HeterogeneousLogicalStep> _lastLogicalSteps = new ArrayList<HeterogeneousLogicalStep>();
	
	public CoordinationSolver(CCSLKernelSolver realSolver, URI modelURI) {
		this.solverWrapper = new CCSLKernelSolverWrapper(realSolver);
		this.solverInputURI = modelURI;
		this._feedbackModel = null;
	}
	
	@Override
	public Step proposeLogicalStep() {
		int index = solverWrapper.proposeLogicalStepByIndex();
		Step result = null;
		if (_lastLogicalSteps.size() > index)
		{
			result = _lastLogicalSteps.get(index);			
		}
		return result;
	}
	
}

