package org.gemoc.gel.utils;

import java.util.ArrayList;
import java.util.Collection;

import org.gemoc.gel.BinaryPattern;
import org.gemoc.gel.DomainSpecificEventReference;
import org.gemoc.gel.UnaryPattern;
import org.gemoc.gel.util.GelSwitch;

public class CompositeDseDseReferencesCollector extends
		GelSwitch<Collection<DomainSpecificEventReference>> {

	@Override
	public Collection<DomainSpecificEventReference> caseUnaryPattern(
			UnaryPattern object) {
		Collection<DomainSpecificEventReference> res = new ArrayList<>();
		res.addAll(this.doSwitch(object.getOperand()));
		return res;
	}

	@Override
	public Collection<DomainSpecificEventReference> caseBinaryPattern(
			BinaryPattern object) {
		Collection<DomainSpecificEventReference> res = new ArrayList<>();
		res.addAll(this.doSwitch(object.getLeftOperand()));
		res.addAll(this.doSwitch(object.getRightOperand()));
		return res;
	}

	@Override
	public Collection<DomainSpecificEventReference> caseDomainSpecificEventReference(
			DomainSpecificEventReference object) {
		Collection<DomainSpecificEventReference> res = new ArrayList<>();
		res.add(object);
		return res;
	}

}
