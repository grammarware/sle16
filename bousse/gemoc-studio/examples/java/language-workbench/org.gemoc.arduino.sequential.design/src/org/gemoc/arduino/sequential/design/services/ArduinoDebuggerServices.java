package org.gemoc.arduino.sequential.design.services;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.gemoc.arduino.sequential.design.ArduinoDesignerUtils;
import org.gemoc.arduino.sequential.execarduino.arduino.Board;
import org.gemoc.arduino.sequential.execarduino.arduino.Module;
import org.gemoc.arduino.sequential.execarduino.arduino.Pin;
import org.gemoc.arduino.sequential.execarduino.arduino.Project;
import org.gemoc.executionframework.engine.ui.launcher.AbstractGemocLauncher;
import org.gemoc.executionframework.extensions.sirius.services.AbstractGemocDebuggerServices;


public class ArduinoDebuggerServices extends AbstractGemocDebuggerServices{

	@Override
	protected List<StringCouple> getRepresentationRefreshList() {
		final List<StringCouple> res = new ArrayList<StringCouple>();

		res.add(new StringCouple("Hardware", "Simulator"));
		res.add(new StringCouple("Sketch", "Simulator"));
		res.add(new StringCouple("Function", "Simulator"));

		return res;
	}

	public Integer getLevel(Pin pin) {
		return pin.getLevel();
	}

	public Integer getLevel(Module module) {
		return ArduinoDesignerUtils.getPin(module).getLevel();
	}

	protected Project getUserRootProject(EObject obj){
		// not very nice, we suppose that the first loaded resource will contain the root project
		for (Resource res : obj.eResource().getResourceSet().getResources()){
			if(res.getContents().size() > 0 &&  res.getContents().get(0) instanceof Project){
				return (Project)res.getContents().get(0);
			}
		}
		return null;
	}
	
	public Integer getLevel(Board platform) {
		return 0;
	}
	
	public boolean isModuleOn(Module module) {
		return ArduinoDesignerUtils.getPin(module).getLevel() > 0;
	}
	
	public String getModelIdentifier() {
		return org.gemoc.execution.sequential.javaengine.ui.Activator.PLUGIN_ID+".debugModel";
	}
}
