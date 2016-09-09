package org.gemoc.arduino.sequential.arduino.trace.tracemanager;

import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;

import fr.inria.diverse.trace.gemoc.api.IStepFactory;
import fr.inria.diverse.trace.gemoc.api.ITraceConstructor;
import fr.inria.diverse.trace.gemoc.api.ITraceExplorer;
import fr.inria.diverse.trace.gemoc.api.ITraceExtractor;
import fr.inria.diverse.trace.gemoc.traceaddon.AbstractTraceAddon;

public class ArduinoTraceEngineAddon extends AbstractTraceAddon {

	private ArduinoTraceStepFactory factory = null;

	@Override
	public ITraceConstructor constructTraceConstructor(Resource modelResource, Resource traceResource,
			Map<EObject, EObject> exeToTraced) {
		return new ArduinoTraceConstructor(modelResource, traceResource, exeToTraced);
	}

	@Override
	public ITraceExplorer constructTraceExplorer(Resource traceResource) {
		ArduinoTraceExplorer explorer = new ArduinoTraceExplorer();
		EObject root = traceResource.getContents().get(0);
		if (root instanceof arduinoTrace.SpecificTrace) {
			explorer.loadTrace((arduinoTrace.SpecificTrace) root);
			return explorer;
		}
		return null;
	}

	@Override
	public ITraceExplorer constructTraceExplorer(Resource modelResource, Resource traceResource,
			Map<EObject, EObject> tracedToExe) {
		ArduinoTraceExplorer explorer = new ArduinoTraceExplorer(tracedToExe);
		EObject root = traceResource.getContents().get(0);
		if (root instanceof arduinoTrace.SpecificTrace) {
			explorer.loadTrace(modelResource, (arduinoTrace.SpecificTrace) root);
			return explorer;
		}
		return null;
	}

	@Override
	public ITraceExtractor constructTraceExtractor(Resource traceResource) {
		ArduinoTraceExtractor extractor = new ArduinoTraceExtractor();
		EObject root = traceResource.getContents().get(0);
		if (root instanceof arduinoTrace.SpecificTrace) {
			extractor.loadTrace((arduinoTrace.SpecificTrace) root);
			return extractor;
		}
		return null;
	}

	@Override
	public IStepFactory getFactory() {
		if (factory == null)
			factory = new ArduinoTraceStepFactory();
		return factory;
	}

	@Override
	public boolean isAddonForTrace(EObject root) {
		return root instanceof arduinoTrace.SpecificTrace;
	}

}