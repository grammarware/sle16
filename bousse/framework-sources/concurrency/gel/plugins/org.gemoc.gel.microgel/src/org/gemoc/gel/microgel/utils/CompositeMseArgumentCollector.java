package org.gemoc.gel.microgel.utils;

import java.util.ArrayList;
import java.util.Collection;

import org.gemoc.gel.microgel.BinaryPattern;
import org.gemoc.gel.microgel.ModelSpecificEvent;
import org.gemoc.gel.microgel.ModelSpecificEventReference;
import org.gemoc.gel.microgel.UnaryPattern;
import org.gemoc.gel.microgel.util.MicrogelSwitch;

public class CompositeMseArgumentCollector extends
		MicrogelSwitch<Collection<ModelSpecificEvent>> {
	@Override
	public Collection<ModelSpecificEvent> caseBinaryPattern(BinaryPattern object) {
		Collection<ModelSpecificEvent> res = new ArrayList<>();
		res.addAll(this.doSwitch(object.getLeftOperand()));
		res.addAll(this.doSwitch(object.getRightOperand()));
		return res;
	}

	@Override
	public Collection<ModelSpecificEvent> caseUnaryPattern(UnaryPattern object) {
		Collection<ModelSpecificEvent> res = new ArrayList<>();
		res.addAll(this.doSwitch(object.getOperand()));
		return res;
	}

	@Override
	public Collection<ModelSpecificEvent> caseModelSpecificEventReference(
			ModelSpecificEventReference object) {
		Collection<ModelSpecificEvent> res = new ArrayList<>();
		res.add(object.getReferencedMse());
		return res;
	}
}
