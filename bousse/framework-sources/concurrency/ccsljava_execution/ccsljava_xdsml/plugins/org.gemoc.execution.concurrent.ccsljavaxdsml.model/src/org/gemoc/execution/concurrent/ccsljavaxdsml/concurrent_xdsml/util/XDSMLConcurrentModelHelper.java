package org.gemoc.execution.concurrent.ccsljavaxdsml.concurrent_xdsml.util;

import org.gemoc.execution.concurrent.ccsljavaxdsml.concurrent_xdsml.ConcurrentLanguageDefinition;
import org.gemoc.execution.concurrent.ccsljavaxdsml.concurrent_xdsml.Concurrent_xdsmlFactory;
import org.gemoc.execution.concurrent.ccsljavaxdsml.concurrent_xdsml.DSAProject;
import org.gemoc.execution.concurrent.ccsljavaxdsml.concurrent_xdsml.DSEProject;
import org.gemoc.execution.concurrent.ccsljavaxdsml.concurrent_xdsml.MoCCProject;
import org.gemoc.executionframework.xdsml_base.util.XDSMLBaseModelHelper;

public class XDSMLConcurrentModelHelper extends XDSMLBaseModelHelper{
	
	public static DSAProject getOrCreateDSAProject(
			ConcurrentLanguageDefinition languageDefinition) {
		if (languageDefinition.getDsaProject() == null) {
			languageDefinition.setDsaProject(Concurrent_xdsmlFactory.eINSTANCE
					.createDSAProject());
		}
		return languageDefinition.getDsaProject();
	}

	public static DSEProject getOrCreateDSEProject(
			ConcurrentLanguageDefinition languageDefinition) {
		if (languageDefinition.getDSEProject() == null) {
			languageDefinition.setDSEProject(Concurrent_xdsmlFactory.eINSTANCE
					.createDSEProject());
		}
		return languageDefinition.getDSEProject();
	}

	public static MoCCProject getOrCreateMoCCProject(
			ConcurrentLanguageDefinition languageDefinition) {
		if (languageDefinition.getMoCCProject() == null) {
			languageDefinition.setMoCCProject(Concurrent_xdsmlFactory.eINSTANCE
					.createMoCCProject());
		}
		return languageDefinition.getMoCCProject();
	}
}
