package org.gemoc.execution.engine.coordinator.commons;

import java.util.ArrayList;

import org.gemoc.execution.engine.coordinator.commons.HeterogeneousEngine.ExtendedLogicalStep;

import fr.inria.diverse.trace.commons.model.trace.impl.StepImpl;


/**
 * this is a list of integer where each integer is index of the logical step of its solver. 
 * The index of the integer itself represents the associated solver index in the _coordinatedEngines list 
 */
public class HeterogeneousLogicalStep extends StepImpl {

	public HeterogeneousLogicalStep() {
		// TODO Auto-generated constructor stub
	}

	private static final long serialVersionUID = 7306227694056928033L;
	
	public ArrayList<ExtendedLogicalStep> logicalSteps = new ArrayList<ExtendedLogicalStep>();
	
	
	/*@Override
	public EList<MSEOccurrence> getMseOccurrences(){
		EList<MSEOccurrence> res = new BasicEList<MSEOccurrence>(); 
		for (LogicalStep l : logicalSteps){
			res.addAll(l.getMseOccurrences());
		}
		return res;
	}*/

}
