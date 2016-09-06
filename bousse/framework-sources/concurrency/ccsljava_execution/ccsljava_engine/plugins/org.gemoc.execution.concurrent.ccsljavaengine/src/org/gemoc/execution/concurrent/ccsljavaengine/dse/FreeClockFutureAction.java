package org.gemoc.execution.concurrent.ccsljavaengine.dse;

import org.gemoc.execution.concurrent.ccsljavaxdsml.api.core.IFutureAction;
import org.gemoc.execution.concurrent.ccsljavaxdsml.api.dse.IMSEStateController;

import fr.inria.aoste.timesquare.ecl.feedback.feedback.ModelSpecificEvent;

public class FreeClockFutureAction implements IFutureAction
{

	private ModelSpecificEvent _mseToBeForced;
	private ModelSpecificEvent _triggeringMSE;
	private IMSEStateController _clockController;
	
	public FreeClockFutureAction(ModelSpecificEvent mseToBeForced, ModelSpecificEvent triggeringMSE, IMSEStateController clockController) 
	{
		_mseToBeForced = mseToBeForced;
		_triggeringMSE = triggeringMSE;
		_clockController = clockController;
	}

	@Override
	public ModelSpecificEvent getTriggeringMSE() 
	{
		return _triggeringMSE;
	}

	@Override
	public void perform() 
	{
		_clockController.freeInTheFuture(_mseToBeForced);
	}

}
