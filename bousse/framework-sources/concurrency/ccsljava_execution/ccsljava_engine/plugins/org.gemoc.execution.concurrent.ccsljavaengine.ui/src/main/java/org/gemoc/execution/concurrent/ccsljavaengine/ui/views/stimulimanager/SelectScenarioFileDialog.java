package org.gemoc.execution.concurrent.ccsljavaengine.ui.views.stimulimanager;

import org.gemoc.commons.eclipse.core.resources.FileFinderVisitor;
import org.gemoc.commons.eclipse.ui.dialogs.SelectSpecificFileDialog;


public class SelectScenarioFileDialog extends SelectSpecificFileDialog {

	@Override
	protected FileFinderVisitor instanciateFinder() {
		return new FileFinderVisitor("scenario");
	}
}
