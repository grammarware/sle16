package org.gemoc.arduino.sequential.design;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.sirius.ui.business.api.session.IEditingSession;
import org.eclipse.sirius.ui.business.api.session.SessionUIManager;
import org.gemoc.arduino.sequential.arduino.arduino.AnalogPin;
import org.gemoc.arduino.sequential.arduino.arduino.ArduinoBoard;
import org.gemoc.arduino.sequential.arduino.arduino.Board;
import org.gemoc.arduino.sequential.arduino.arduino.DigitalPin;
import org.gemoc.arduino.sequential.arduino.arduino.Module;
import org.gemoc.arduino.sequential.arduino.arduino.Pin;
import org.gemoc.arduino.sequential.arduino.arduino.Project;

/**
 * Utility for arduino designer.
 * 
 * @author <a href="mailto:yvan.lussaud@obeo.fr">Yvan Lussaud</a>
 *
 */
public final class ArduinoDesignerUtils {

	/**
	 * Constructor.
	 */
	private ArduinoDesignerUtils() {
		// nothing to do here
	}

	/**
	 * Gets the opened {@link Project}.
	 * 
	 * @return the opened {@link Project} if nay, <code>null</code> otherwise
	 */
	public static Project getOpenedProject() {
		Project res = null;

		for (IEditingSession session : SessionUIManager.INSTANCE
				.getUISessions()) {
			for (Resource resource : session.getSession()
					.getSemanticResources()) {
				for (EObject eObj : resource.getContents()) {
					if (eObj instanceof Project
							&& eObj.eResource().getURI().isPlatformResource()) {
						res = (Project) eObj;
						break;
					}
				}
			}
		}

		return res;
	}
	
	public static Pin getPin(Module module) {
		Pin res = null;
		
		Project project = getContainingProject(module);
		
		if (project != null) {
			for (Board board : project.getBoards()) {
				if (board != null && board instanceof ArduinoBoard) {
					ArduinoBoard arduinoBoard = (ArduinoBoard) board;
					for (AnalogPin pin : arduinoBoard.getAnalogPins()) {
						if (pin.getModule() == module) {
							res = pin;
							break;
						}
					}
					if (res == null) {
						for (DigitalPin pin : arduinoBoard.getDigitalPins()) {
							if (pin.getModule() == module) {
								res = pin;
								break;
							}
						}
					}
				}
				if (res != null) {
					break;
				}
			}
		}

		return res;
	}
	
	public static Module getModule(Pin pin) {
		Module res = null;
		if (pin instanceof AnalogPin) {
			res = ((AnalogPin) pin).getModule();
		} else if (pin instanceof DigitalPin) {
			res = ((DigitalPin) pin).getModule();
		}
		return res;
	}
	
	public static Project getContainingProject(EObject eObj) {
		Project res = null;

		EObject current = eObj.eContainer();
		while (current != null) {
			if (current instanceof Project) {
				res = (Project) current;
				break;
			}
			current = current.eContainer();
		}

		return res;
	}

}
