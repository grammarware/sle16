package org.gemoc.arduino.sequential.arduino.trace.tracemanager;

import java.util.Collection;
import java.util.Deque;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;

import fr.inria.diverse.trace.commons.model.trace.LaunchConfiguration;
import fr.inria.diverse.trace.commons.model.trace.MSEModel;
import fr.inria.diverse.trace.commons.model.trace.SequentialStep;
import fr.inria.diverse.trace.gemoc.api.ITraceConstructor;

public class ArduinoTraceConstructor implements ITraceConstructor {
	private arduinoTrace.SpecificTrace traceRoot;
	private MSEModel mseModel;
	private Resource executedModel;
	private final Map<EObject, EObject> exeToTraced;

	private arduinoTrace.States.State lastState;

	private Resource traceResource;
	private final Deque<arduinoTrace.Steps.SpecificStep> context = new LinkedList<arduinoTrace.Steps.SpecificStep>();

	public ArduinoTraceConstructor(Resource exeModel, Resource traceResource, Map<EObject, EObject> exeToTraced) {
		this.traceResource = traceResource;
		this.executedModel = exeModel;
		this.exeToTraced = exeToTraced;
	}

	private void addInitialState() {
		if (lastState == null) {
			// Creation of the initial state
			Set<Resource> allResources = getAllExecutedModelResources();
			lastState = arduinoTrace.States.StatesFactory.eINSTANCE.createState();
			for (Resource r : allResources) {
				for (TreeIterator<EObject> i = r.getAllContents(); i.hasNext();) {
					EObject o = i.next();

					if (o instanceof org.gemoc.arduino.sequential.arduino.arduino.NamedElement) {
						org.gemoc.arduino.sequential.arduino.arduino.NamedElement o_cast = (org.gemoc.arduino.sequential.arduino.arduino.NamedElement) o;
						addNewObjectToState(o_cast, lastState);
					}
				}
			}
			this.traceRoot.getStatesTrace().add(lastState);
		}
	}

	private boolean addNewObjectToState(org.gemoc.arduino.sequential.arduino.arduino.AmbientLightSensor o_cast,
			arduinoTrace.States.State newState) {
		boolean added = false;

		if (!added && !exeToTraced.containsKey(o_cast)) {
			arduinoTrace.States.arduino.TracedAmbientLightSensor tracedObject = arduinoTrace.States.arduino.ArduinoFactory.eINSTANCE
					.createTracedAmbientLightSensor();
			tracedObject.setOriginalObject((org.gemoc.arduino.sequential.arduino.arduino.AmbientLightSensor) o_cast);
			exeToTraced.put(o_cast, tracedObject);
			traceRoot.getArduino_tracedAmbientLightSensors().add(tracedObject);

		} // end if (!exeToTraced.containsKey
		return added;
	}// end addNewObjectToState

	private boolean addNewObjectToState(org.gemoc.arduino.sequential.arduino.arduino.AnalogPin o_cast,
			arduinoTrace.States.State newState) {
		boolean added = false;

		if (!added && !exeToTraced.containsKey(o_cast)) {
			arduinoTrace.States.arduino.TracedAnalogPin tracedObject = arduinoTrace.States.arduino.ArduinoFactory.eINSTANCE
					.createTracedAnalogPin();
			tracedObject.setOriginalObject((org.gemoc.arduino.sequential.arduino.arduino.AnalogPin) o_cast);
			exeToTraced.put(o_cast, tracedObject);
			traceRoot.getArduino_tracedAnalogPins().add(tracedObject);

			// Creation of the first value of the field level
			arduinoTrace.States.Pin_level_Value firstValue_level = arduinoTrace.States.StatesFactory.eINSTANCE
					.createPin_level_Value();

			firstValue_level.setLevel((java.lang.Integer) o_cast.getLevel());
			tracedObject.getLevelSequence().add(firstValue_level);
			newState.getPin_level_Values().add(firstValue_level);

		} // end if (!exeToTraced.containsKey
		return added;
	}// end addNewObjectToState

	private boolean addNewObjectToState(org.gemoc.arduino.sequential.arduino.arduino.ArduinoAnalogModule o_cast,
			arduinoTrace.States.State newState) {
		boolean added = false;
		if (o_cast instanceof org.gemoc.arduino.sequential.arduino.arduino.SoundSensor) {
			added = addNewObjectToState((org.gemoc.arduino.sequential.arduino.arduino.SoundSensor) o_cast, newState);
		} else if (o_cast instanceof org.gemoc.arduino.sequential.arduino.arduino.BluetoothTransceiver) {
			added = addNewObjectToState((org.gemoc.arduino.sequential.arduino.arduino.BluetoothTransceiver) o_cast,
					newState);
		} else if (o_cast instanceof org.gemoc.arduino.sequential.arduino.arduino.RotationSensor) {
			added = addNewObjectToState((org.gemoc.arduino.sequential.arduino.arduino.RotationSensor) o_cast, newState);
		} else if (o_cast instanceof org.gemoc.arduino.sequential.arduino.arduino.MusicPlayer) {
			added = addNewObjectToState((org.gemoc.arduino.sequential.arduino.arduino.MusicPlayer) o_cast, newState);
		} else if (o_cast instanceof org.gemoc.arduino.sequential.arduino.arduino.AmbientLightSensor) {
			added = addNewObjectToState((org.gemoc.arduino.sequential.arduino.arduino.AmbientLightSensor) o_cast,
					newState);
		}

		return added;
	}// end addNewObjectToState

	private boolean addNewObjectToState(org.gemoc.arduino.sequential.arduino.arduino.ArduinoBoard o_cast,
			arduinoTrace.States.State newState) {
		boolean added = false;

		if (!added && !exeToTraced.containsKey(o_cast)) {
			arduinoTrace.States.arduino.TracedArduinoBoard tracedObject = arduinoTrace.States.arduino.ArduinoFactory.eINSTANCE
					.createTracedArduinoBoard();
			tracedObject.setOriginalObject((org.gemoc.arduino.sequential.arduino.arduino.ArduinoBoard) o_cast);
			exeToTraced.put(o_cast, tracedObject);
			traceRoot.getArduino_tracedArduinoBoards().add(tracedObject);

		} // end if (!exeToTraced.containsKey
		return added;
	}// end addNewObjectToState

	private boolean addNewObjectToState(org.gemoc.arduino.sequential.arduino.arduino.ArduinoDigitalModule o_cast,
			arduinoTrace.States.State newState) {
		boolean added = false;
		if (o_cast instanceof org.gemoc.arduino.sequential.arduino.arduino.MicroServo) {
			added = addNewObjectToState((org.gemoc.arduino.sequential.arduino.arduino.MicroServo) o_cast, newState);
		} else if (o_cast instanceof org.gemoc.arduino.sequential.arduino.arduino.LED) {
			added = addNewObjectToState((org.gemoc.arduino.sequential.arduino.arduino.LED) o_cast, newState);
		} else if (o_cast instanceof org.gemoc.arduino.sequential.arduino.arduino.Fan) {
			added = addNewObjectToState((org.gemoc.arduino.sequential.arduino.arduino.Fan) o_cast, newState);
		} else if (o_cast instanceof org.gemoc.arduino.sequential.arduino.arduino.PushButton) {
			added = addNewObjectToState((org.gemoc.arduino.sequential.arduino.arduino.PushButton) o_cast, newState);
		} else if (o_cast instanceof org.gemoc.arduino.sequential.arduino.arduino.Buzzer) {
			added = addNewObjectToState((org.gemoc.arduino.sequential.arduino.arduino.Buzzer) o_cast, newState);
		} else if (o_cast instanceof org.gemoc.arduino.sequential.arduino.arduino.InfraRedSensor) {
			added = addNewObjectToState((org.gemoc.arduino.sequential.arduino.arduino.InfraRedSensor) o_cast, newState);
		}

		return added;
	}// end addNewObjectToState

	private boolean addNewObjectToState(org.gemoc.arduino.sequential.arduino.arduino.ArduinoModule o_cast,
			arduinoTrace.States.State newState) {
		boolean added = false;
		if (o_cast instanceof org.gemoc.arduino.sequential.arduino.arduino.ArduinoAnalogModule) {
			added = addNewObjectToState((org.gemoc.arduino.sequential.arduino.arduino.ArduinoAnalogModule) o_cast,
					newState);
		} else if (o_cast instanceof org.gemoc.arduino.sequential.arduino.arduino.ArduinoDigitalModule) {
			added = addNewObjectToState((org.gemoc.arduino.sequential.arduino.arduino.ArduinoDigitalModule) o_cast,
					newState);
		}

		return added;
	}// end addNewObjectToState

	private boolean addNewObjectToState(org.gemoc.arduino.sequential.arduino.arduino.BluetoothTransceiver o_cast,
			arduinoTrace.States.State newState) {
		boolean added = false;

		if (!added && !exeToTraced.containsKey(o_cast)) {
			arduinoTrace.States.arduino.TracedBluetoothTransceiver tracedObject = arduinoTrace.States.arduino.ArduinoFactory.eINSTANCE
					.createTracedBluetoothTransceiver();
			tracedObject.setOriginalObject((org.gemoc.arduino.sequential.arduino.arduino.BluetoothTransceiver) o_cast);
			exeToTraced.put(o_cast, tracedObject);
			traceRoot.getArduino_tracedBluetoothTransceivers().add(tracedObject);

			// Creation of the first value of the field dataReceived
			arduinoTrace.States.BluetoothTransceiver_dataReceived_Value firstValue_dataReceived = arduinoTrace.States.StatesFactory.eINSTANCE
					.createBluetoothTransceiver_dataReceived_Value();

			firstValue_dataReceived.getDataReceived()
					.addAll((Collection<? extends java.lang.Integer>) o_cast.getDataReceived());

			tracedObject.getDataReceivedSequence().add(firstValue_dataReceived);
			newState.getBluetoothTransceiver_dataReceived_Values().add(firstValue_dataReceived);

			// Creation of the first value of the field dataToSend
			arduinoTrace.States.BluetoothTransceiver_dataToSend_Value firstValue_dataToSend = arduinoTrace.States.StatesFactory.eINSTANCE
					.createBluetoothTransceiver_dataToSend_Value();

			firstValue_dataToSend.getDataToSend()
					.addAll((Collection<? extends java.lang.Integer>) o_cast.getDataToSend());

			tracedObject.getDataToSendSequence().add(firstValue_dataToSend);
			newState.getBluetoothTransceiver_dataToSend_Values().add(firstValue_dataToSend);

		} // end if (!exeToTraced.containsKey
		return added;
	}// end addNewObjectToState

	private boolean addNewObjectToState(org.gemoc.arduino.sequential.arduino.arduino.Board o_cast,
			arduinoTrace.States.State newState) {
		boolean added = false;
		if (o_cast instanceof org.gemoc.arduino.sequential.arduino.arduino.ArduinoBoard) {
			added = addNewObjectToState((org.gemoc.arduino.sequential.arduino.arduino.ArduinoBoard) o_cast, newState);
		}

		return added;
	}// end addNewObjectToState

	private boolean addNewObjectToState(org.gemoc.arduino.sequential.arduino.arduino.BooleanVariable o_cast,
			arduinoTrace.States.State newState) {
		boolean added = false;

		if (!added && !exeToTraced.containsKey(o_cast)) {
			arduinoTrace.States.arduino.TracedBooleanVariable tracedObject = arduinoTrace.States.arduino.ArduinoFactory.eINSTANCE
					.createTracedBooleanVariable();
			tracedObject.setOriginalObject((org.gemoc.arduino.sequential.arduino.arduino.BooleanVariable) o_cast);
			exeToTraced.put(o_cast, tracedObject);
			traceRoot.getArduino_tracedBooleanVariables().add(tracedObject);

			// Creation of the first value of the field value
			arduinoTrace.States.BooleanVariable_value_Value firstValue_value = arduinoTrace.States.StatesFactory.eINSTANCE
					.createBooleanVariable_value_Value();

			firstValue_value.setValue((java.lang.Boolean) o_cast.getValue());
			tracedObject.getValueSequence().add(firstValue_value);
			newState.getBooleanVariable_value_Values().add(firstValue_value);

		} // end if (!exeToTraced.containsKey
		return added;
	}// end addNewObjectToState

	private boolean addNewObjectToState(org.gemoc.arduino.sequential.arduino.arduino.Buzzer o_cast,
			arduinoTrace.States.State newState) {
		boolean added = false;

		if (!added && !exeToTraced.containsKey(o_cast)) {
			arduinoTrace.States.arduino.TracedBuzzer tracedObject = arduinoTrace.States.arduino.ArduinoFactory.eINSTANCE
					.createTracedBuzzer();
			tracedObject.setOriginalObject((org.gemoc.arduino.sequential.arduino.arduino.Buzzer) o_cast);
			exeToTraced.put(o_cast, tracedObject);
			traceRoot.getArduino_tracedBuzzers().add(tracedObject);

		} // end if (!exeToTraced.containsKey
		return added;
	}// end addNewObjectToState

	private boolean addNewObjectToState(org.gemoc.arduino.sequential.arduino.arduino.DigitalPin o_cast,
			arduinoTrace.States.State newState) {
		boolean added = false;

		if (!added && !exeToTraced.containsKey(o_cast)) {
			arduinoTrace.States.arduino.TracedDigitalPin tracedObject = arduinoTrace.States.arduino.ArduinoFactory.eINSTANCE
					.createTracedDigitalPin();
			tracedObject.setOriginalObject((org.gemoc.arduino.sequential.arduino.arduino.DigitalPin) o_cast);
			exeToTraced.put(o_cast, tracedObject);
			traceRoot.getArduino_tracedDigitalPins().add(tracedObject);

			// Creation of the first value of the field level
			arduinoTrace.States.Pin_level_Value firstValue_level = arduinoTrace.States.StatesFactory.eINSTANCE
					.createPin_level_Value();

			firstValue_level.setLevel((java.lang.Integer) o_cast.getLevel());
			tracedObject.getLevelSequence().add(firstValue_level);
			newState.getPin_level_Values().add(firstValue_level);

		} // end if (!exeToTraced.containsKey
		return added;
	}// end addNewObjectToState

	private boolean addNewObjectToState(org.gemoc.arduino.sequential.arduino.arduino.Fan o_cast,
			arduinoTrace.States.State newState) {
		boolean added = false;

		if (!added && !exeToTraced.containsKey(o_cast)) {
			arduinoTrace.States.arduino.TracedFan tracedObject = arduinoTrace.States.arduino.ArduinoFactory.eINSTANCE
					.createTracedFan();
			tracedObject.setOriginalObject((org.gemoc.arduino.sequential.arduino.arduino.Fan) o_cast);
			exeToTraced.put(o_cast, tracedObject);
			traceRoot.getArduino_tracedFans().add(tracedObject);

		} // end if (!exeToTraced.containsKey
		return added;
	}// end addNewObjectToState

	private boolean addNewObjectToState(org.gemoc.arduino.sequential.arduino.arduino.InfraRedSensor o_cast,
			arduinoTrace.States.State newState) {
		boolean added = false;

		if (!added && !exeToTraced.containsKey(o_cast)) {
			arduinoTrace.States.arduino.TracedInfraRedSensor tracedObject = arduinoTrace.States.arduino.ArduinoFactory.eINSTANCE
					.createTracedInfraRedSensor();
			tracedObject.setOriginalObject((org.gemoc.arduino.sequential.arduino.arduino.InfraRedSensor) o_cast);
			exeToTraced.put(o_cast, tracedObject);
			traceRoot.getArduino_tracedInfraRedSensors().add(tracedObject);

		} // end if (!exeToTraced.containsKey
		return added;
	}// end addNewObjectToState

	private boolean addNewObjectToState(org.gemoc.arduino.sequential.arduino.arduino.IntegerVariable o_cast,
			arduinoTrace.States.State newState) {
		boolean added = false;

		if (!added && !exeToTraced.containsKey(o_cast)) {
			arduinoTrace.States.arduino.TracedIntegerVariable tracedObject = arduinoTrace.States.arduino.ArduinoFactory.eINSTANCE
					.createTracedIntegerVariable();
			tracedObject.setOriginalObject((org.gemoc.arduino.sequential.arduino.arduino.IntegerVariable) o_cast);
			exeToTraced.put(o_cast, tracedObject);
			traceRoot.getArduino_tracedIntegerVariables().add(tracedObject);

			// Creation of the first value of the field value
			arduinoTrace.States.IntegerVariable_value_Value firstValue_value = arduinoTrace.States.StatesFactory.eINSTANCE
					.createIntegerVariable_value_Value();

			firstValue_value.setValue((java.lang.Integer) o_cast.getValue());
			tracedObject.getValueSequence().add(firstValue_value);
			newState.getIntegerVariable_value_Values().add(firstValue_value);

		} // end if (!exeToTraced.containsKey
		return added;
	}// end addNewObjectToState

	private boolean addNewObjectToState(org.gemoc.arduino.sequential.arduino.arduino.LED o_cast,
			arduinoTrace.States.State newState) {
		boolean added = false;

		if (!added && !exeToTraced.containsKey(o_cast)) {
			arduinoTrace.States.arduino.TracedLED tracedObject = arduinoTrace.States.arduino.ArduinoFactory.eINSTANCE
					.createTracedLED();
			tracedObject.setOriginalObject((org.gemoc.arduino.sequential.arduino.arduino.LED) o_cast);
			exeToTraced.put(o_cast, tracedObject);
			traceRoot.getArduino_tracedLEDs().add(tracedObject);

		} // end if (!exeToTraced.containsKey
		return added;
	}// end addNewObjectToState

	private boolean addNewObjectToState(org.gemoc.arduino.sequential.arduino.arduino.MicroServo o_cast,
			arduinoTrace.States.State newState) {
		boolean added = false;

		if (!added && !exeToTraced.containsKey(o_cast)) {
			arduinoTrace.States.arduino.TracedMicroServo tracedObject = arduinoTrace.States.arduino.ArduinoFactory.eINSTANCE
					.createTracedMicroServo();
			tracedObject.setOriginalObject((org.gemoc.arduino.sequential.arduino.arduino.MicroServo) o_cast);
			exeToTraced.put(o_cast, tracedObject);
			traceRoot.getArduino_tracedMicroServos().add(tracedObject);

		} // end if (!exeToTraced.containsKey
		return added;
	}// end addNewObjectToState

	private boolean addNewObjectToState(org.gemoc.arduino.sequential.arduino.arduino.Module o_cast,
			arduinoTrace.States.State newState) {
		boolean added = false;
		if (o_cast instanceof org.gemoc.arduino.sequential.arduino.arduino.ArduinoModule) {
			added = addNewObjectToState((org.gemoc.arduino.sequential.arduino.arduino.ArduinoModule) o_cast, newState);
		}

		return added;
	}// end addNewObjectToState

	private boolean addNewObjectToState(org.gemoc.arduino.sequential.arduino.arduino.MusicPlayer o_cast,
			arduinoTrace.States.State newState) {
		boolean added = false;

		if (!added && !exeToTraced.containsKey(o_cast)) {
			arduinoTrace.States.arduino.TracedMusicPlayer tracedObject = arduinoTrace.States.arduino.ArduinoFactory.eINSTANCE
					.createTracedMusicPlayer();
			tracedObject.setOriginalObject((org.gemoc.arduino.sequential.arduino.arduino.MusicPlayer) o_cast);
			exeToTraced.put(o_cast, tracedObject);
			traceRoot.getArduino_tracedMusicPlayers().add(tracedObject);

		} // end if (!exeToTraced.containsKey
		return added;
	}// end addNewObjectToState

	private boolean addNewObjectToState(org.gemoc.arduino.sequential.arduino.arduino.NamedElement o_cast,
			arduinoTrace.States.State newState) {
		boolean added = false;
		if (o_cast instanceof org.gemoc.arduino.sequential.arduino.arduino.Module) {
			added = addNewObjectToState((org.gemoc.arduino.sequential.arduino.arduino.Module) o_cast, newState);
		} else if (o_cast instanceof org.gemoc.arduino.sequential.arduino.arduino.Board) {
			added = addNewObjectToState((org.gemoc.arduino.sequential.arduino.arduino.Board) o_cast, newState);
		} else if (o_cast instanceof org.gemoc.arduino.sequential.arduino.arduino.Sketch) {
			added = addNewObjectToState((org.gemoc.arduino.sequential.arduino.arduino.Sketch) o_cast, newState);
		} else if (o_cast instanceof org.gemoc.arduino.sequential.arduino.arduino.Variable) {
			added = addNewObjectToState((org.gemoc.arduino.sequential.arduino.arduino.Variable) o_cast, newState);
		} else if (o_cast instanceof org.gemoc.arduino.sequential.arduino.arduino.Pin) {
			added = addNewObjectToState((org.gemoc.arduino.sequential.arduino.arduino.Pin) o_cast, newState);
		}

		return added;
	}// end addNewObjectToState

	private boolean addNewObjectToState(org.gemoc.arduino.sequential.arduino.arduino.Pin o_cast,
			arduinoTrace.States.State newState) {
		boolean added = false;
		if (o_cast instanceof org.gemoc.arduino.sequential.arduino.arduino.DigitalPin) {
			added = addNewObjectToState((org.gemoc.arduino.sequential.arduino.arduino.DigitalPin) o_cast, newState);
		} else if (o_cast instanceof org.gemoc.arduino.sequential.arduino.arduino.AnalogPin) {
			added = addNewObjectToState((org.gemoc.arduino.sequential.arduino.arduino.AnalogPin) o_cast, newState);
		}

		return added;
	}// end addNewObjectToState

	private boolean addNewObjectToState(org.gemoc.arduino.sequential.arduino.arduino.PushButton o_cast,
			arduinoTrace.States.State newState) {
		boolean added = false;

		if (!added && !exeToTraced.containsKey(o_cast)) {
			arduinoTrace.States.arduino.TracedPushButton tracedObject = arduinoTrace.States.arduino.ArduinoFactory.eINSTANCE
					.createTracedPushButton();
			tracedObject.setOriginalObject((org.gemoc.arduino.sequential.arduino.arduino.PushButton) o_cast);
			exeToTraced.put(o_cast, tracedObject);
			traceRoot.getArduino_tracedPushButtons().add(tracedObject);

		} // end if (!exeToTraced.containsKey
		return added;
	}// end addNewObjectToState

	private boolean addNewObjectToState(org.gemoc.arduino.sequential.arduino.arduino.RotationSensor o_cast,
			arduinoTrace.States.State newState) {
		boolean added = false;

		if (!added && !exeToTraced.containsKey(o_cast)) {
			arduinoTrace.States.arduino.TracedRotationSensor tracedObject = arduinoTrace.States.arduino.ArduinoFactory.eINSTANCE
					.createTracedRotationSensor();
			tracedObject.setOriginalObject((org.gemoc.arduino.sequential.arduino.arduino.RotationSensor) o_cast);
			exeToTraced.put(o_cast, tracedObject);
			traceRoot.getArduino_tracedRotationSensors().add(tracedObject);

		} // end if (!exeToTraced.containsKey
		return added;
	}// end addNewObjectToState

	private boolean addNewObjectToState(org.gemoc.arduino.sequential.arduino.arduino.Sketch o_cast,
			arduinoTrace.States.State newState) {
		boolean added = false;

		if (!added && !exeToTraced.containsKey(o_cast)) {
			arduinoTrace.States.arduino.TracedSketch tracedObject = arduinoTrace.States.arduino.ArduinoFactory.eINSTANCE
					.createTracedSketch();
			tracedObject.setOriginalObject((org.gemoc.arduino.sequential.arduino.arduino.Sketch) o_cast);
			exeToTraced.put(o_cast, tracedObject);
			traceRoot.getArduino_tracedSketchs().add(tracedObject);

		} // end if (!exeToTraced.containsKey
		return added;
	}// end addNewObjectToState

	private boolean addNewObjectToState(org.gemoc.arduino.sequential.arduino.arduino.SoundSensor o_cast,
			arduinoTrace.States.State newState) {
		boolean added = false;

		if (!added && !exeToTraced.containsKey(o_cast)) {
			arduinoTrace.States.arduino.TracedSoundSensor tracedObject = arduinoTrace.States.arduino.ArduinoFactory.eINSTANCE
					.createTracedSoundSensor();
			tracedObject.setOriginalObject((org.gemoc.arduino.sequential.arduino.arduino.SoundSensor) o_cast);
			exeToTraced.put(o_cast, tracedObject);
			traceRoot.getArduino_tracedSoundSensors().add(tracedObject);

		} // end if (!exeToTraced.containsKey
		return added;
	}// end addNewObjectToState

	private boolean addNewObjectToState(org.gemoc.arduino.sequential.arduino.arduino.Variable o_cast,
			arduinoTrace.States.State newState) {
		boolean added = false;
		if (o_cast instanceof org.gemoc.arduino.sequential.arduino.arduino.IntegerVariable) {
			added = addNewObjectToState((org.gemoc.arduino.sequential.arduino.arduino.IntegerVariable) o_cast,
					newState);
		} else if (o_cast instanceof org.gemoc.arduino.sequential.arduino.arduino.BooleanVariable) {
			added = addNewObjectToState((org.gemoc.arduino.sequential.arduino.arduino.BooleanVariable) o_cast,
					newState);
		}

		return added;
	}// end addNewObjectToState

	private boolean copiedState = false;

	private arduinoTrace.States.State copyState(arduinoTrace.States.State oldState) {
		arduinoTrace.States.State newState = arduinoTrace.States.StatesFactory.eINSTANCE.createState();
		newState.getBluetoothTransceiver_dataReceived_Values()
				.addAll(oldState.getBluetoothTransceiver_dataReceived_Values());
		newState.getBluetoothTransceiver_dataToSend_Values()
				.addAll(oldState.getBluetoothTransceiver_dataToSend_Values());
		newState.getPin_level_Values().addAll(oldState.getPin_level_Values());
		newState.getIntegerVariable_value_Values().addAll(oldState.getIntegerVariable_value_Values());
		newState.getBooleanVariable_value_Values().addAll(oldState.getBooleanVariable_value_Values());
		copiedState = true;
		return newState;
	}

	@SuppressWarnings("unchecked")
	@Override
	public void addState(List<org.gemoc.xdsmlframework.api.engine_addon.modelchangelistener.ModelChange> changes) {
		if (lastState == null) {
			addInitialState();
		}
		if (!changes.isEmpty()) {
			boolean stateChanged = false;
			// We start by a (shallow) copy of the last state
			// But we will have to rollback a little by replacing values that changed
			arduinoTrace.States.State newState = copyState(lastState);
			for (org.gemoc.xdsmlframework.api.engine_addon.modelchangelistener.ModelChange modelChange : changes) {
				EObject o = modelChange.getChangedObject();
				// Here we must look at non-collection mutable fields
				// We must rollback the last values from the copied state, and add new values as well
				// ie. mix of remove and new
				if (modelChange instanceof org.gemoc.xdsmlframework.api.engine_addon.modelchangelistener.NonCollectionFieldModelChange) {
					stateChanged = true;

					org.gemoc.xdsmlframework.api.engine_addon.modelchangelistener.NonCollectionFieldModelChange modelChange_cast = (org.gemoc.xdsmlframework.api.engine_addon.modelchangelistener.NonCollectionFieldModelChange) modelChange;
					org.eclipse.emf.ecore.EStructuralFeature p = modelChange_cast.getChangedField();

					if (o instanceof org.gemoc.arduino.sequential.arduino.arduino.IntegerVariable) {
						org.gemoc.arduino.sequential.arduino.arduino.IntegerVariable o_cast = (org.gemoc.arduino.sequential.arduino.arduino.IntegerVariable) o;

						if (p.getFeatureID() == org.gemoc.arduino.sequential.arduino.arduino.ArduinoPackage.eINSTANCE
								.getIntegerVariable_Value().getFeatureID()) {

							// Rollback: we remove the last value of this field from the new state
							arduinoTrace.States.arduino.TracedIntegerVariable traced = (arduinoTrace.States.arduino.TracedIntegerVariable) exeToTraced
									.get(o);
							arduinoTrace.States.IntegerVariable_value_Value lastValue = traced.getValueSequence()
									.get(traced.getValueSequence().size() - 1);
							newState.getIntegerVariable_value_Values().remove(lastValue);

							// And we create a proper new value
							arduinoTrace.States.IntegerVariable_value_Value newValue = arduinoTrace.States.StatesFactory.eINSTANCE
									.createIntegerVariable_value_Value();

							java.lang.Integer value = o_cast.getValue();

							newValue.setValue((java.lang.Integer) value);

							traced.getValueSequence().add(newValue);
							newState.getIntegerVariable_value_Values().add(newValue);
						}
					}

					if (o instanceof org.gemoc.arduino.sequential.arduino.arduino.BooleanVariable) {
						org.gemoc.arduino.sequential.arduino.arduino.BooleanVariable o_cast = (org.gemoc.arduino.sequential.arduino.arduino.BooleanVariable) o;

						if (p.getFeatureID() == org.gemoc.arduino.sequential.arduino.arduino.ArduinoPackage.eINSTANCE
								.getBooleanVariable_Value().getFeatureID()) {

							// Rollback: we remove the last value of this field from the new state
							arduinoTrace.States.arduino.TracedBooleanVariable traced = (arduinoTrace.States.arduino.TracedBooleanVariable) exeToTraced
									.get(o);
							arduinoTrace.States.BooleanVariable_value_Value lastValue = traced.getValueSequence()
									.get(traced.getValueSequence().size() - 1);
							newState.getBooleanVariable_value_Values().remove(lastValue);

							// And we create a proper new value
							arduinoTrace.States.BooleanVariable_value_Value newValue = arduinoTrace.States.StatesFactory.eINSTANCE
									.createBooleanVariable_value_Value();

							java.lang.Boolean value = o_cast.getValue();

							newValue.setValue((java.lang.Boolean) value);

							traced.getValueSequence().add(newValue);
							newState.getBooleanVariable_value_Values().add(newValue);
						}
					}

					if (o instanceof org.gemoc.arduino.sequential.arduino.arduino.Pin) {
						org.gemoc.arduino.sequential.arduino.arduino.Pin o_cast = (org.gemoc.arduino.sequential.arduino.arduino.Pin) o;

						if (p.getFeatureID() == org.gemoc.arduino.sequential.arduino.arduino.ArduinoPackage.eINSTANCE
								.getPin_Level().getFeatureID()) {

							// Rollback: we remove the last value of this field from the new state
							arduinoTrace.States.arduino.TracedPin traced = (arduinoTrace.States.arduino.TracedPin) exeToTraced
									.get(o);
							arduinoTrace.States.Pin_level_Value lastValue = traced.getLevelSequence()
									.get(traced.getLevelSequence().size() - 1);
							newState.getPin_level_Values().remove(lastValue);

							// And we create a proper new value
							arduinoTrace.States.Pin_level_Value newValue = arduinoTrace.States.StatesFactory.eINSTANCE
									.createPin_level_Value();

							java.lang.Integer value = o_cast.getLevel();

							newValue.setLevel((java.lang.Integer) value);

							traced.getLevelSequence().add(newValue);
							newState.getPin_level_Values().add(newValue);
						}
					}
				}
				// Here we look at collection mutable fields
				// We must first manually find out if the collection changed...
				// If it changed we must rollback the last values from the copied state, and add new values as well
				else if (modelChange instanceof org.gemoc.xdsmlframework.api.engine_addon.modelchangelistener.PotentialCollectionFieldModelChange) {
					org.gemoc.xdsmlframework.api.engine_addon.modelchangelistener.PotentialCollectionFieldModelChange modelChange_cast = (org.gemoc.xdsmlframework.api.engine_addon.modelchangelistener.PotentialCollectionFieldModelChange) modelChange;
					org.eclipse.emf.ecore.EStructuralFeature p = modelChange_cast.getChangedField();
					if (o instanceof org.gemoc.arduino.sequential.arduino.arduino.BluetoothTransceiver) {
						org.gemoc.arduino.sequential.arduino.arduino.BluetoothTransceiver o_cast = (org.gemoc.arduino.sequential.arduino.arduino.BluetoothTransceiver) o;
						arduinoTrace.States.arduino.TracedBluetoothTransceiver tracedObject = (arduinoTrace.States.arduino.TracedBluetoothTransceiver) exeToTraced
								.get(o_cast);
						if (p.getFeatureID() == org.gemoc.arduino.sequential.arduino.arduino.ArduinoPackage.eINSTANCE
								.getBluetoothTransceiver_DataToSend().getFeatureID()) {
							// We compare the last collection in the value sequence, and the current one in the potentially changed object
							List<arduinoTrace.States.BluetoothTransceiver_dataToSend_Value> valueSequence = tracedObject
									.getDataToSendSequence();
							arduinoTrace.States.BluetoothTransceiver_dataToSend_Value previousValue = null;
							if (!valueSequence.isEmpty()) {
								previousValue = valueSequence.get(valueSequence.size() - 1);
							}
							boolean change = false;
							if (previousValue != null) {
								if (previousValue.getDataToSend().size() == o_cast.getDataToSend().size()) {
									java.util.Iterator<java.lang.Integer> it = o_cast.getDataToSend().iterator();
									for (java.lang.Integer aPreviousValue : previousValue.getDataToSend()) {
										java.lang.Integer aCurrentValue = it.next();
										if (!aPreviousValue.equals(aCurrentValue)) {
											change = true;
											break;
										}
									}
								} else {
									change = true;
								}
							} else {
								change = true;
							}
							if (change) {
								stateChanged = true;
								// Rollback: we remove the last value of this field from the new state
								arduinoTrace.States.BluetoothTransceiver_dataToSend_Value lastValue = tracedObject
										.getDataToSendSequence().get(tracedObject.getDataToSendSequence().size() - 1);
								newState.getBluetoothTransceiver_dataToSend_Values().remove(lastValue);
								// And we create a proper new value							
								arduinoTrace.States.BluetoothTransceiver_dataToSend_Value newValue = arduinoTrace.States.StatesFactory.eINSTANCE
										.createBluetoothTransceiver_dataToSend_Value();
								newValue.getDataToSend()
										.addAll((Collection<? extends java.lang.Integer>) o_cast.getDataToSend());
								tracedObject.getDataToSendSequence().add(newValue);
								newState.getBluetoothTransceiver_dataToSend_Values().add(newValue);
							}
						} else
							if (p.getFeatureID() == org.gemoc.arduino.sequential.arduino.arduino.ArduinoPackage.eINSTANCE
									.getBluetoothTransceiver_DataReceived().getFeatureID()) {
							// We compare the last collection in the value sequence, and the current one in the potentially changed object
							List<arduinoTrace.States.BluetoothTransceiver_dataReceived_Value> valueSequence = tracedObject
									.getDataReceivedSequence();
							arduinoTrace.States.BluetoothTransceiver_dataReceived_Value previousValue = null;
							if (!valueSequence.isEmpty()) {
								previousValue = valueSequence.get(valueSequence.size() - 1);
							}
							boolean change = false;
							if (previousValue != null) {
								if (previousValue.getDataReceived().size() == o_cast.getDataReceived().size()) {
									java.util.Iterator<java.lang.Integer> it = o_cast.getDataReceived().iterator();
									for (java.lang.Integer aPreviousValue : previousValue.getDataReceived()) {
										java.lang.Integer aCurrentValue = it.next();
										if (!aPreviousValue.equals(aCurrentValue)) {
											change = true;
											break;
										}
									}
								} else {
									change = true;
								}
							} else {
								change = true;
							}
							if (change) {
								stateChanged = true;
								// Rollback: we remove the last value of this field from the new state
								arduinoTrace.States.BluetoothTransceiver_dataReceived_Value lastValue = tracedObject
										.getDataReceivedSequence()
										.get(tracedObject.getDataReceivedSequence().size() - 1);
								newState.getBluetoothTransceiver_dataReceived_Values().remove(lastValue);
								// And we create a proper new value							
								arduinoTrace.States.BluetoothTransceiver_dataReceived_Value newValue = arduinoTrace.States.StatesFactory.eINSTANCE
										.createBluetoothTransceiver_dataReceived_Value();
								newValue.getDataReceived()
										.addAll((Collection<? extends java.lang.Integer>) o_cast.getDataReceived());
								tracedObject.getDataReceivedSequence().add(newValue);
								newState.getBluetoothTransceiver_dataReceived_Values().add(newValue);
							}
						}
					}
				}
			}
			if (stateChanged) {
				final arduinoTrace.Steps.SpecificStep currentStep = context.peekFirst();
				if (currentStep != null && currentStep instanceof fr.inria.diverse.trace.commons.model.trace.BigStep) {
					final arduinoTrace.States.State startingState = lastState;
					final arduinoTrace.States.State endingState = newState;
					addImplicitStep(currentStep, startingState, endingState);
				}
				lastState = newState;
				traceRoot.getStatesTrace().add(lastState);
			} else if (copiedState) {
				newState.getBluetoothTransceiver_dataReceived_Values().clear();
				newState.getBluetoothTransceiver_dataToSend_Values().clear();
				newState.getPin_level_Values().clear();
				newState.getIntegerVariable_value_Values().clear();
				newState.getBooleanVariable_value_Values().clear();
			}
			copiedState = false;
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public void addStep(fr.inria.diverse.trace.commons.model.trace.Step step) {
		arduinoTrace.Steps.SpecificStep step_cast = null;
		if (step != null && step instanceof arduinoTrace.Steps.SpecificStep) {
			step_cast = (arduinoTrace.Steps.SpecificStep) step;
			if (mseModel == null) {
				mseModel = fr.inria.diverse.trace.commons.model.trace.TraceFactory.eINSTANCE.createMSEModel();
				traceResource.getContents().add(mseModel);
			}
			mseModel.getOwnedMSEs().add(step_cast.getMseoccurrence().getMse());

			// Creating generic (or almost generic) links
			arduinoTrace.States.State state = traceRoot.getStatesTrace().get(traceRoot.getStatesTrace().size() - 1);
			step_cast.setStartingState(state);
			if (!context.isEmpty() && context.getFirst() != null) {
				((SequentialStep<arduinoTrace.Steps.SpecificStep>) context.getFirst()).getSubSteps().add(step_cast);
			} else {
				traceRoot.getRootStep().getSubSteps().add(step_cast);
			}

			// Adding step in its dedicated sequence/dimension
			if (step_cast instanceof arduinoTrace.Steps.Arduino_BluetoothTransceiver_Push) {
				arduinoTrace.Steps.Arduino_BluetoothTransceiver_Push arduino_BluetoothTransceiver_PushInstance = (arduinoTrace.Steps.Arduino_BluetoothTransceiver_Push) step_cast;
				traceRoot.getArduino_BluetoothTransceiver_Push_Sequence()
						.add(arduino_BluetoothTransceiver_PushInstance);
			} else if (step_cast instanceof arduinoTrace.Steps.Arduino_Delay_Execute) {
				arduinoTrace.Steps.Arduino_Delay_Execute arduino_Delay_ExecuteInstance = (arduinoTrace.Steps.Arduino_Delay_Execute) step_cast;
				traceRoot.getArduino_Delay_Execute_Sequence().add(arduino_Delay_ExecuteInstance);
			} else if (step_cast instanceof arduinoTrace.Steps.Arduino_If_Execute) {
				arduinoTrace.Steps.Arduino_If_Execute arduino_If_ExecuteInstance = (arduinoTrace.Steps.Arduino_If_Execute) step_cast;
				traceRoot.getArduino_If_Execute_Sequence().add(arduino_If_ExecuteInstance);
			} else if (step_cast instanceof arduinoTrace.Steps.Arduino_ModuleAssignment_Execute) {
				arduinoTrace.Steps.Arduino_ModuleAssignment_Execute arduino_ModuleAssignment_ExecuteInstance = (arduinoTrace.Steps.Arduino_ModuleAssignment_Execute) step_cast;
				traceRoot.getArduino_ModuleAssignment_Execute_Sequence().add(arduino_ModuleAssignment_ExecuteInstance);
			} else if (step_cast instanceof arduinoTrace.Steps.Arduino_Project_Setup) {
				arduinoTrace.Steps.Arduino_Project_Setup arduino_Project_SetupInstance = (arduinoTrace.Steps.Arduino_Project_Setup) step_cast;
				traceRoot.getArduino_Project_Setup_Sequence().add(arduino_Project_SetupInstance);
			} else if (step_cast instanceof arduinoTrace.Steps.Arduino_Repeat_Execute) {
				arduinoTrace.Steps.Arduino_Repeat_Execute arduino_Repeat_ExecuteInstance = (arduinoTrace.Steps.Arduino_Repeat_Execute) step_cast;
				traceRoot.getArduino_Repeat_Execute_Sequence().add(arduino_Repeat_ExecuteInstance);
			} else if (step_cast instanceof arduinoTrace.Steps.Arduino_VariableAssignment_Execute) {
				arduinoTrace.Steps.Arduino_VariableAssignment_Execute arduino_VariableAssignment_ExecuteInstance = (arduinoTrace.Steps.Arduino_VariableAssignment_Execute) step_cast;
				traceRoot.getArduino_VariableAssignment_Execute_Sequence()
						.add(arduino_VariableAssignment_ExecuteInstance);
			} else if (step_cast instanceof arduinoTrace.Steps.Arduino_VariableDeclaration_Execute) {
				arduinoTrace.Steps.Arduino_VariableDeclaration_Execute arduino_VariableDeclaration_ExecuteInstance = (arduinoTrace.Steps.Arduino_VariableDeclaration_Execute) step_cast;
				traceRoot.getArduino_VariableDeclaration_Execute_Sequence()
						.add(arduino_VariableDeclaration_ExecuteInstance);
			}
		}
		context.push(step_cast);
	}

	@SuppressWarnings("unchecked")
	private void addImplicitStep(arduinoTrace.Steps.SpecificStep currentStep, arduinoTrace.States.State startingState,
			arduinoTrace.States.State endingState) {

		arduinoTrace.Steps.SpecificStep implicitStep = null;
		if (currentStep instanceof arduinoTrace.Steps.Arduino_If_Execute) {
			implicitStep = arduinoTrace.Steps.StepsFactory.eINSTANCE.createArduino_If_Execute_ImplicitStep();
		} else if (currentStep instanceof arduinoTrace.Steps.Arduino_ModuleAssignment_Execute) {
			implicitStep = arduinoTrace.Steps.StepsFactory.eINSTANCE
					.createArduino_ModuleAssignment_Execute_ImplicitStep();
		} else if (currentStep instanceof arduinoTrace.Steps.Arduino_Repeat_Execute) {
			implicitStep = arduinoTrace.Steps.StepsFactory.eINSTANCE.createArduino_Repeat_Execute_ImplicitStep();
		}
		if (implicitStep != null) {
			implicitStep.setStartingState(startingState);
			implicitStep.setEndingState(endingState);
			((SequentialStep<arduinoTrace.Steps.SpecificStep>) currentStep).getSubSteps().add(implicitStep);

		}
	}

	@Override
	public void endStep(fr.inria.diverse.trace.commons.model.trace.Step step) {
		arduinoTrace.Steps.SpecificStep popped = context.pop();
		if (popped != null)
			popped.setEndingState(lastState);
	}

	@Override
	public EObject initTrace(LaunchConfiguration launchConfiguration) {
		// Create root
		traceRoot = arduinoTrace.ArduinoTraceFactory.eINSTANCE.createSpecificTrace();
		traceRoot.setLaunchconfiguration(launchConfiguration);

		// Create root sequential step
		fr.inria.diverse.trace.commons.model.trace.SequentialStep<arduinoTrace.Steps.SpecificStep> rootStep = fr.inria.diverse.trace.commons.model.trace.TraceFactory.eINSTANCE
				.createSequentialStep();
		traceRoot.setRootStep(rootStep);

		// Put in the resource
		traceResource.getContents().add(traceRoot);

		return traceRoot;
	}

	@Override
	public void save() {
		try {
			traceResource.save(null);
		} catch (java.io.IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void save(URI uri) {
		try {
			traceResource.setURI(uri);
			traceResource.save(null);
		} catch (java.io.IOException e) {
			e.printStackTrace();
		}
	}

	private Set<Resource> getAllExecutedModelResources() {
		Set<Resource> allResources = new HashSet<>();
		allResources.add(executedModel);
		allResources.addAll(org.gemoc.commons.eclipse.emf.EMFResource.getRelatedResources(executedModel));
		return allResources;
	}

	@Override
	public boolean isPartialTraceConstructor() {
		return false;
	}
}
