package org.gemoc.execution.concurrent.ccsljavaxdsml.api.core;

import fr.inria.aoste.timesquare.ecl.feedback.feedback.ModelSpecificEvent;

public interface IFutureAction {

	ModelSpecificEvent getTriggeringMSE();

	void perform();

}
