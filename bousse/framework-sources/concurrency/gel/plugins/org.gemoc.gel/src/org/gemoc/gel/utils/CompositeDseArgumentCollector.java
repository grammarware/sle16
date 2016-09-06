package org.gemoc.gel.utils;

import java.util.ArrayList;
import java.util.Collection;

import org.gemoc.gel.BinaryPattern;
import org.gemoc.gel.DomainSpecificEvent;
import org.gemoc.gel.DomainSpecificEventReference;
import org.gemoc.gel.UnaryPattern;
import org.gemoc.gel.util.GelSwitch;

/**
 * Given a DomainSpecificEventsPattern, this class collects the DSEs which are
 * the arguments (or 'leaves' if you consider a pattern to be a tree) of this
 * pattern.
 * 
 * @author flatombe
 *
 */
public class CompositeDseArgumentCollector extends
		GelSwitch<Collection<DomainSpecificEvent>> {

	@Override
	public Collection<DomainSpecificEvent> caseBinaryPattern(
			BinaryPattern object) {
		Collection<DomainSpecificEvent> res = new ArrayList<>();
		res.addAll(this.doSwitch(object.getLeftOperand()));
		res.addAll(this.doSwitch(object.getRightOperand()));
		return res;
	}

	@Override
	public Collection<DomainSpecificEvent> caseUnaryPattern(UnaryPattern object) {
		Collection<DomainSpecificEvent> res = new ArrayList<>();
		res.addAll(this.doSwitch(object.getOperand()));
		return res;
	}

	@Override
	public Collection<DomainSpecificEvent> caseDomainSpecificEventReference(
			DomainSpecificEventReference object) {
		Collection<DomainSpecificEvent> res = new ArrayList<>();
		res.add(object.getReferencedDse());
		return res;
	}

}
