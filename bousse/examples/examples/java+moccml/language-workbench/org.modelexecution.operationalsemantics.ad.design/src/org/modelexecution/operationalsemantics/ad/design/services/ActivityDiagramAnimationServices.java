package org.modelexecution.operationalsemantics.ad.design.services;

import java.util.ArrayList;
import java.util.List;

import org.gemoc.executionframework.extensions.sirius.services.AbstractGemocAnimatorServices;

public class ActivityDiagramAnimationServices extends AbstractGemocAnimatorServices{

	@Override
	protected List<StringCouple> getRepresentationRefreshList() {
		final List<StringCouple> res = new ArrayList<StringCouple>();

		res.add(new StringCouple("Activity Diagram", "Animation"));

		return res;
	}

}
