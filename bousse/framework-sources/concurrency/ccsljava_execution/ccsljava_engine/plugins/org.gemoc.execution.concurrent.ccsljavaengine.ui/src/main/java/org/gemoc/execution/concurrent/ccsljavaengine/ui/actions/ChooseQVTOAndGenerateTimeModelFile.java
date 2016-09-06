package org.gemoc.execution.concurrent.ccsljavaengine.ui.actions;


public class ChooseQVTOAndGenerateTimeModelFile extends ChooseQVTOAndGenerateExtendedCCSLFile {

	/**
	 * Constructor for Action1.
	 */
	public ChooseQVTOAndGenerateTimeModelFile() {
		super();
	}

	@Override
	protected String getMoCFileExtension() {
		return "timemodel";
	}
	
}
