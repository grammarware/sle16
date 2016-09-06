package org.gemoc.gel.utils;

import java.util.ArrayList;
import java.util.List;

import org.gemoc.gel.LocalVariable;
import org.gemoc.gel.MultipleArguments;
import org.gemoc.gel.SingleArgument;
import org.gemoc.gel.util.GelSwitch;

public class LocalVariableArgumentsCollector extends
		GelSwitch<List<LocalVariable>> {

	@Override
	public List<LocalVariable> caseSingleArgument(SingleArgument object) {
		List<LocalVariable> res = new ArrayList<>();
		res.add(object.getArgument());
		return res;
	}

	@Override
	public List<LocalVariable> caseMultipleArguments(MultipleArguments object) {
		List<LocalVariable> res = new ArrayList<>();
		res.add(object.getHead());
		res.addAll(this.doSwitch(object.getTail()));
		return res;
	}

}
