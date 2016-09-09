package org.gemoc.arduino.sequential.arduino.trace.tracemanager;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.gemoc.executionframework.engine.core.CommandExecution;

import fr.inria.diverse.trace.commons.model.trace.SequentialStep;
import fr.inria.diverse.trace.commons.model.trace.Step;
import fr.inria.diverse.trace.gemoc.api.ITraceExplorer;
import fr.inria.diverse.trace.gemoc.api.ITraceListener;

public class ArduinoTraceExplorer implements ITraceExplorer {

	private arduinoTrace.SpecificTrace traceRoot;
	private Resource modelResource;
	private final Map<EObject, EObject> tracedToExe;

	private int lastJumpIndex = -1;
	private arduinoTrace.States.State currentState = null;
	final private List<Step> callStack = new ArrayList<>();

	final private List<List<? extends arduinoTrace.States.Value>> valueTraces = new ArrayList<>();

	private List<arduinoTrace.States.State> statesTrace;

	private arduinoTrace.Steps.SpecificStep stepIntoResult;
	private arduinoTrace.Steps.SpecificStep stepOverResult;
	private arduinoTrace.Steps.SpecificStep stepReturnResult;

	private arduinoTrace.Steps.SpecificStep stepBackIntoResult;
	private arduinoTrace.Steps.SpecificStep stepBackOverResult;
	private arduinoTrace.Steps.SpecificStep stepBackOutResult;

	final private Map<arduinoTrace.Steps.SpecificStep, Integer> stepToStartingIndex = new HashMap<>();
	final private Map<arduinoTrace.Steps.SpecificStep, Integer> stepToEndingIndex = new HashMap<>();

	private final HashMap<Integer, Boolean> canBackValueCache = new HashMap<>();

	final private List<ITraceListener> listeners = new ArrayList<>();

	public ArduinoTraceExplorer(Map<EObject, EObject> tracedToExe) {
		this.tracedToExe = tracedToExe;
	}

	public ArduinoTraceExplorer() {
		this.tracedToExe = null;
	}

	private List<List<? extends arduinoTrace.States.Value>> getAllValueTraces() {
		final List<List<? extends arduinoTrace.States.Value>> result = new ArrayList<>();
		for (arduinoTrace.States.arduino.TracedAnalogPin tracedObject : traceRoot.getArduino_tracedAnalogPins()) {
			result.add(tracedObject.getLevelSequence());
		}
		for (arduinoTrace.States.arduino.TracedBluetoothTransceiver tracedObject : traceRoot
				.getArduino_tracedBluetoothTransceivers()) {
			result.add(tracedObject.getDataReceivedSequence());
			result.add(tracedObject.getDataToSendSequence());
		}
		for (arduinoTrace.States.arduino.TracedBooleanVariable tracedObject : traceRoot
				.getArduino_tracedBooleanVariables()) {
			result.add(tracedObject.getValueSequence());
		}
		for (arduinoTrace.States.arduino.TracedDigitalPin tracedObject : traceRoot.getArduino_tracedDigitalPins()) {
			result.add(tracedObject.getLevelSequence());
		}
		for (arduinoTrace.States.arduino.TracedIntegerVariable tracedObject : traceRoot
				.getArduino_tracedIntegerVariables()) {
			result.add(tracedObject.getValueSequence());
		}
		return result;
	}

	private arduinoTrace.States.Value getActiveValue(List<? extends arduinoTrace.States.Value> valueTrace,
			arduinoTrace.States.State state) {
		arduinoTrace.States.Value result = null;
		for (arduinoTrace.States.Value value : valueTrace) {
			if (value.getStatesNoOpposite().contains(state)) {
				result = value;
				break;
			}
		}
		return result;
	}

	private int getPreviousValueIndex(final List<? extends arduinoTrace.States.Value> valueTrace) {
		arduinoTrace.States.Value value = getActiveValue(valueTrace, currentState);
		if (value != null) {
			return valueTrace.indexOf(value) - 1;
		} else {
			int i = getCurrentStateIndex() - 1;
			while (i > -1 && value == null) {
				value = getActiveValue(valueTrace, statesTrace.get(i));
				i--;
			}
			if (value == null) {
				return -1;
			} else {
				return valueTrace.indexOf(value) - 1;
			}
		}
	}

	private int getNextValueIndex(List<? extends arduinoTrace.States.Value> valueTrace) {
		arduinoTrace.States.Value value = getActiveValue(valueTrace, currentState);
		if (value != null) {
			final int idx = valueTrace.indexOf(value) + 1;
			if (idx < valueTrace.size()) {
				return idx;
			}
			return -1;
		} else {
			int i = getCurrentStateIndex() + 1;
			final int traceLength = valueTrace.size();
			while (i < traceLength && value == null) {
				value = getActiveValue(valueTrace, statesTrace.get(i));
				i++;
			}
			if (value == null) {
				return -1;
			} else {
				final int idx = valueTrace.indexOf(value) + 1;
				if (idx < valueTrace.size()) {
					return idx;
				}
				return -1;
			}
		}
	}

	private int getStartingIndex(arduinoTrace.Steps.SpecificStep step) {
		return stepToStartingIndex.computeIfAbsent(step, s -> {
			return statesTrace.indexOf(s.getStartingState());
		});
	}

	private int getEndingIndex(arduinoTrace.Steps.SpecificStep step) {
		if (step.getEndingState() != null) {
			return stepToEndingIndex.computeIfAbsent(step, s -> {
				return statesTrace.indexOf(s.getEndingState());
			});
		}
		return -1;
	}

	@SuppressWarnings("unchecked")
	private arduinoTrace.Steps.SpecificStep findNextStep(final List<arduinoTrace.Steps.SpecificStep> stepPath,
			final arduinoTrace.Steps.SpecificStep previousStep, final int start) {
		final List<arduinoTrace.Steps.SpecificStep> rootSteps = traceRoot.getRootStep().getSubSteps();
		arduinoTrace.Steps.SpecificStep result = null;
		int i = start;
		int depth = stepPath.size();
		arduinoTrace.Steps.SpecificStep previous = previousStep;
		while (result == null && i < depth) {
			final arduinoTrace.Steps.SpecificStep currentStep = stepPath.get(depth - i - 1);
			final List<arduinoTrace.Steps.SpecificStep> currentSubSteps = new ArrayList<>();
			if (currentStep instanceof SequentialStep<?>) {
				currentSubSteps.addAll(((SequentialStep<arduinoTrace.Steps.SpecificStep>) currentStep).getSubSteps());
			}
			if (currentSubSteps.isEmpty()) {
				// No substep to step into, we thus have to explore the substeps
				// of the parent step
				previous = currentStep;
			} else {
				if (previous == null) {
					// First time we step into
					result = currentSubSteps.get(0);
				} else {
					final int idx = currentSubSteps.indexOf(previous) + 1;
					if (idx < currentSubSteps.size()) {
						// We step into the next step
						result = currentSubSteps.get(idx);
					} else {
						previous = currentStep;
					}
				}
			}
			i++;
		}
		if (result == null) {
			final int idx = rootSteps.indexOf(previous) + 1;
			if (idx < rootSteps.size()) {
				result = rootSteps.get(idx);
			}
		}
		return result;
	}

	@SuppressWarnings("unchecked")
	private arduinoTrace.Steps.SpecificStep computeBackInto(List<arduinoTrace.Steps.SpecificStep> stepPath) {
		final List<arduinoTrace.Steps.SpecificStep> rootSteps = traceRoot.getRootStep().getSubSteps();
		final int depth = stepPath.size();
		arduinoTrace.Steps.SpecificStep result = null;
		if (depth > 1) {
			final arduinoTrace.Steps.SpecificStep currentStep = stepPath.get(depth - 1);
			final arduinoTrace.Steps.SpecificStep parentStep = stepPath.get(depth - 2);
			final SequentialStep<arduinoTrace.Steps.SpecificStep> parentStep_cast = (SequentialStep<arduinoTrace.Steps.SpecificStep>) parentStep;
			final List<? extends arduinoTrace.Steps.SpecificStep> parentSubSteps = parentStep_cast.getSubSteps();
			final int idx = parentSubSteps.indexOf(currentStep);
			if (idx == 0) {
				// If the current step is the first in its parents substeps,
				// return parent step
				result = parentStep;
			} else if (idx > 0) {
				// Otherwise, return the deepest substep in the previous sibling
				// step
				final arduinoTrace.Steps.SpecificStep previousSiblingStep = parentSubSteps.get(idx - 1);
				arduinoTrace.Steps.SpecificStep tmpStep = previousSiblingStep;
				final List<arduinoTrace.Steps.SpecificStep> tmpSubSteps = new ArrayList<>();
				tmpSubSteps.clear();
				if (tmpStep instanceof SequentialStep<?>) {
					SequentialStep<arduinoTrace.Steps.SpecificStep> tmpStep_cast = (SequentialStep<arduinoTrace.Steps.SpecificStep>) tmpStep;
					tmpSubSteps.addAll(tmpStep_cast.getSubSteps());
				}
				while (!tmpSubSteps.isEmpty()) {
					tmpStep = tmpSubSteps.get(tmpSubSteps.size() - 1);
					tmpSubSteps.clear();
					if (tmpStep instanceof SequentialStep<?>) {
						SequentialStep<arduinoTrace.Steps.SpecificStep> tmpStep_cast = (SequentialStep<arduinoTrace.Steps.SpecificStep>) tmpStep;
						tmpSubSteps.addAll(tmpStep_cast.getSubSteps());
					}
				}
				result = tmpStep;
			}
		} else if (depth == 1) {
			final arduinoTrace.Steps.SpecificStep currentStep = stepPath.get(0);
			final int idx = rootSteps.indexOf(currentStep);
			if (idx > 0) {
				arduinoTrace.Steps.SpecificStep tmpStep = rootSteps.get(idx - 1);
				final List<arduinoTrace.Steps.SpecificStep> tmpSubSteps = new ArrayList<>();
				tmpSubSteps.clear();
				if (tmpStep instanceof SequentialStep<?>) {
					SequentialStep<arduinoTrace.Steps.SpecificStep> tmpStep_cast = (SequentialStep<arduinoTrace.Steps.SpecificStep>) tmpStep;
					tmpSubSteps.addAll(tmpStep_cast.getSubSteps());
				}
				while (!tmpSubSteps.isEmpty()) {
					tmpStep = tmpSubSteps.get(tmpSubSteps.size() - 1);
					tmpSubSteps.clear();
					if (tmpStep instanceof SequentialStep<?>) {
						SequentialStep<arduinoTrace.Steps.SpecificStep> tmpStep_cast = (SequentialStep<arduinoTrace.Steps.SpecificStep>) tmpStep;
						tmpSubSteps.addAll(tmpStep_cast.getSubSteps());
					}
				}
				result = tmpStep;
			}
		}
		return result;
	}

	@SuppressWarnings("unchecked")
	private arduinoTrace.Steps.SpecificStep computeBackOver(List<arduinoTrace.Steps.SpecificStep> stepPath) {
		final List<arduinoTrace.Steps.SpecificStep> rootSteps = traceRoot.getRootStep().getSubSteps();
		final int depth = stepPath.size();
		arduinoTrace.Steps.SpecificStep result = null;
		if (depth > 1) {
			final arduinoTrace.Steps.SpecificStep currentStep = stepPath.get(depth - 1);
			final arduinoTrace.Steps.SpecificStep parentStep = stepPath.get(depth - 2);
			final SequentialStep<arduinoTrace.Steps.SpecificStep> parentStep_cast = (SequentialStep<arduinoTrace.Steps.SpecificStep>) parentStep;
			final List<arduinoTrace.Steps.SpecificStep> parentSubSteps = parentStep_cast.getSubSteps();
			final int idx = parentSubSteps.indexOf(currentStep);
			if (idx == 0) {
				// If the current step is the first in its parents substeps,
				// return parent step
				result = parentStep;
			} else {
				// Otherwise, return the previous sibling step
				result = parentSubSteps.get(idx - 1);
			}
		} else if (depth == 1) {
			final arduinoTrace.Steps.SpecificStep currentStep = stepPath.get(0);
			final int idx = rootSteps.indexOf(currentStep);
			if (idx > 0) {
				result = rootSteps.get(idx - 1);
			}
		}
		return result;
	}

	private arduinoTrace.Steps.SpecificStep computeBackOut(List<arduinoTrace.Steps.SpecificStep> stepPath) {
		if (stepPath.size() > 1) {
			return stepPath.get(stepPath.size() - 2);
		}
		return null;
	}

	private arduinoTrace.Steps.SpecificStep computeStepInto(List<arduinoTrace.Steps.SpecificStep> stepPath,
			List<arduinoTrace.Steps.SpecificStep> rootSteps) {
		return findNextStep(stepPath, null, 0);
	}

	private arduinoTrace.Steps.SpecificStep computeStepOver(List<arduinoTrace.Steps.SpecificStep> stepPath,
			List<arduinoTrace.Steps.SpecificStep> rootSteps) {
		if (!stepPath.isEmpty()) {
			return findNextStep(stepPath, stepPath.get(stepPath.size() - 1), 1);
		}
		return null;
	}

	private arduinoTrace.Steps.SpecificStep computeStepReturn(List<arduinoTrace.Steps.SpecificStep> stepPath,
			List<arduinoTrace.Steps.SpecificStep> rootSteps) {
		if (stepPath.size() > 1) {
			return findNextStep(stepPath, stepPath.get(stepPath.size() - 2), 2);
		}
		return null;
	}

	private void computeExplorerState(List<arduinoTrace.Steps.SpecificStep> stepPath) {
		final List<arduinoTrace.Steps.SpecificStep> rootSteps = getStepsForStates(0, statesTrace.size());

		final List<arduinoTrace.Steps.SpecificStep> stepPathUnmodifiable = Collections.unmodifiableList(stepPath);

		stepIntoResult = computeStepInto(stepPathUnmodifiable, rootSteps);
		stepOverResult = computeStepOver(stepPathUnmodifiable, rootSteps);
		stepReturnResult = computeStepReturn(stepPathUnmodifiable, rootSteps);

		stepBackIntoResult = computeBackInto(stepPathUnmodifiable);
		stepBackOverResult = computeBackOver(stepPathUnmodifiable);
		stepBackOutResult = computeBackOut(stepPathUnmodifiable);

		callStack.clear();
		callStack.addAll(stepPathUnmodifiable.stream().map(s -> (Step) s).collect(Collectors.toList()));
	}

	private void goTo(EObject eObject) {
		if (eObject instanceof arduinoTrace.States.State) {
			arduinoTrace.States.State stateToGo = (arduinoTrace.States.State) eObject;
			for (arduinoTrace.States.BluetoothTransceiver_dataReceived_Value value : stateToGo
					.getBluetoothTransceiver_dataReceived_Values()) {
				if (value.getParent() instanceof arduinoTrace.States.arduino.TracedBluetoothTransceiver) {
					arduinoTrace.States.arduino.TracedBluetoothTransceiver parent_cast = (arduinoTrace.States.arduino.TracedBluetoothTransceiver) value
							.getParent();
					org.gemoc.arduino.sequential.arduino.arduino.BluetoothTransceiver originalObject = (org.gemoc.arduino.sequential.arduino.arduino.BluetoothTransceiver) parent_cast
							.getOriginalObject();
					originalObject.getDataReceived().clear();
					originalObject.getDataReceived().addAll(value.getDataReceived());
				}
			}
			for (arduinoTrace.States.BluetoothTransceiver_dataToSend_Value value : stateToGo
					.getBluetoothTransceiver_dataToSend_Values()) {
				if (value.getParent() instanceof arduinoTrace.States.arduino.TracedBluetoothTransceiver) {
					arduinoTrace.States.arduino.TracedBluetoothTransceiver parent_cast = (arduinoTrace.States.arduino.TracedBluetoothTransceiver) value
							.getParent();
					org.gemoc.arduino.sequential.arduino.arduino.BluetoothTransceiver originalObject = (org.gemoc.arduino.sequential.arduino.arduino.BluetoothTransceiver) parent_cast
							.getOriginalObject();
					originalObject.getDataToSend().clear();
					originalObject.getDataToSend().addAll(value.getDataToSend());
				}
			}
			for (arduinoTrace.States.Pin_level_Value value : stateToGo.getPin_level_Values()) {
				if (value.getParent() instanceof arduinoTrace.States.arduino.TracedAnalogPin) {
					arduinoTrace.States.arduino.TracedAnalogPin parent_cast = (arduinoTrace.States.arduino.TracedAnalogPin) value
							.getParent();
					java.lang.Integer toset = value.getLevel();
					java.lang.Integer current = ((org.gemoc.arduino.sequential.arduino.arduino.Pin) parent_cast
							.getOriginalObject()).getLevel();
					if (current != toset) {
						((org.gemoc.arduino.sequential.arduino.arduino.Pin) parent_cast.getOriginalObject())
								.setLevel((java.lang.Integer) toset);
					}
				}
				if (value.getParent() instanceof arduinoTrace.States.arduino.TracedDigitalPin) {
					arduinoTrace.States.arduino.TracedDigitalPin parent_cast = (arduinoTrace.States.arduino.TracedDigitalPin) value
							.getParent();
					java.lang.Integer toset = value.getLevel();
					java.lang.Integer current = ((org.gemoc.arduino.sequential.arduino.arduino.Pin) parent_cast
							.getOriginalObject()).getLevel();
					if (current != toset) {
						((org.gemoc.arduino.sequential.arduino.arduino.Pin) parent_cast.getOriginalObject())
								.setLevel((java.lang.Integer) toset);
					}
				}
			}
			for (arduinoTrace.States.BooleanVariable_value_Value value : stateToGo.getBooleanVariable_value_Values()) {
				if (value.getParent() instanceof arduinoTrace.States.arduino.TracedBooleanVariable) {
					arduinoTrace.States.arduino.TracedBooleanVariable parent_cast = (arduinoTrace.States.arduino.TracedBooleanVariable) value
							.getParent();
					java.lang.Boolean toset = value.getValue();
					java.lang.Boolean current = ((org.gemoc.arduino.sequential.arduino.arduino.BooleanVariable) parent_cast
							.getOriginalObject()).getValue();
					if (current != toset) {
						((org.gemoc.arduino.sequential.arduino.arduino.BooleanVariable) parent_cast.getOriginalObject())
								.setValue((java.lang.Boolean) toset);
					}
				}
			}
			for (arduinoTrace.States.IntegerVariable_value_Value value : stateToGo.getIntegerVariable_value_Values()) {
				if (value.getParent() instanceof arduinoTrace.States.arduino.TracedIntegerVariable) {
					arduinoTrace.States.arduino.TracedIntegerVariable parent_cast = (arduinoTrace.States.arduino.TracedIntegerVariable) value
							.getParent();
					java.lang.Integer toset = value.getValue();
					java.lang.Integer current = ((org.gemoc.arduino.sequential.arduino.arduino.IntegerVariable) parent_cast
							.getOriginalObject()).getValue();
					if (current != toset) {
						((org.gemoc.arduino.sequential.arduino.arduino.IntegerVariable) parent_cast.getOriginalObject())
								.setValue((java.lang.Integer) toset);
					}
				}
			}
		} else if (eObject instanceof arduinoTrace.States.Value) {
			goTo(((arduinoTrace.States.Value) eObject).getStatesNoOpposite().get(0));
		}
	}

	private void goTo(int stateNumber) {
		if (modelResource != null) {
			try {
				final TransactionalEditingDomain ed = TransactionUtil.getEditingDomain(modelResource);
				if (ed != null) {
					final RecordingCommand command = new RecordingCommand(ed, "") {
						protected void doExecute() {
							goTo(statesTrace.get(stateNumber));
						}
					};
					CommandExecution.execute(ed, command);
				}
			} catch (Exception e) {
				throw e;
			}
		}
	}

	private void jumpBeforeStep(arduinoTrace.Steps.SpecificStep step) {
		if (step != null) {
			final int i = getStartingIndex(step);
			if (i == statesTrace.size() - 1) {
				lastJumpIndex = -1;
				currentState = statesTrace.get(statesTrace.size() - 1);
			} else {
				lastJumpIndex = i;
				currentState = statesTrace.get(i);
			}
			if (tracedToExe != null) {
				goTo(i);
			}
			updateCallStack(step);
		}
	}

	public void loadTrace(arduinoTrace.SpecificTrace root) {
		traceRoot = root;
		statesTrace = traceRoot.getStatesTrace();
		if (!statesTrace.isEmpty()) {
			currentState = statesTrace.get(0);
		}
		valueTraces.addAll(getAllValueTraces());
	}

	public void loadTrace(Resource modelResource, arduinoTrace.SpecificTrace root) {
		loadTrace(root);
		this.modelResource = modelResource;
	}

	@Override
	public boolean canBackValue(int traceIndex) {
		if (traceIndex > -1 && traceIndex < valueTraces.size()) {
			return canBackValueCache.computeIfAbsent(traceIndex, i -> {
				final List<? extends arduinoTrace.States.Value> valueTrace = valueTraces.get(traceIndex);
				final int previousValueIndex = getPreviousValueIndex(valueTrace);
				return previousValueIndex > -1;
			});
		}
		return false;
	}

	@Override
	public boolean canStepValue(int traceIndex) {
		return true;
	}

	@Override
	public void backValue(int traceIndex) {
		if (traceIndex > -1 && traceIndex < valueTraces.size()) {
			final List<? extends arduinoTrace.States.Value> valueTrace = valueTraces.get(traceIndex);
			final int previousValueIndex = getPreviousValueIndex(valueTrace);
			if (previousValueIndex > -1) {
				jump(valueTrace.get(previousValueIndex));
			}
		}
	}

	@Override
	public void stepValue(int traceIndex) {
		if (traceIndex > -1 && traceIndex < valueTraces.size()) {
			final List<? extends arduinoTrace.States.Value> valueTrace = valueTraces.get(traceIndex);
			final int nextValueIndex = getNextValueIndex(valueTrace);
			if (nextValueIndex > -1) {
				jump(valueTrace.get(nextValueIndex));
			}
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public void jump(int i) {
		final List<arduinoTrace.States.State> states = statesTrace;
		if (i < states.size()) {
			final List<arduinoTrace.Steps.SpecificStep> rootSteps = getStepsForStates(i, i);
			final List<arduinoTrace.Steps.SpecificStep> searchPath = new ArrayList<>();
			arduinoTrace.Steps.SpecificStep firstStepOfState = null;
			if (!rootSteps.isEmpty()) {
				final Predicate<arduinoTrace.Steps.SpecificStep> p = s -> {
					final int stepStartingState = getStartingIndex(s);
					final int stepEndingState = getEndingIndex(s);
					return (stepEndingState == -1 || stepEndingState >= i) && stepStartingState <= i;
				};
				arduinoTrace.Steps.SpecificStep currentStep = rootSteps.get(0);
				final List<arduinoTrace.Steps.SpecificStep> siblingSteps = new ArrayList<>(rootSteps);
				final List<arduinoTrace.Steps.SpecificStep> currentSubSteps = new ArrayList<>();
				if (currentStep instanceof SequentialStep<?>) {
					final SequentialStep<arduinoTrace.Steps.SpecificStep> currentStep_cast = (SequentialStep<arduinoTrace.Steps.SpecificStep>) currentStep;
					currentSubSteps
							.addAll(currentStep_cast.getSubSteps().stream().filter(p).collect(Collectors.toList()));
				}
				while (firstStepOfState == null) {
					final int startingIndex = getStartingIndex(currentStep);
					final int endingIndex = getEndingIndex(currentStep);
					if (startingIndex < i && (endingIndex > i || endingIndex == -1)) {
						if (currentSubSteps.isEmpty()) {
							throw new IllegalStateException("Unreachable state");
						} else {
							searchPath.add(0, currentStep);
							siblingSteps.clear();
							siblingSteps.addAll(currentSubSteps);
							currentStep = siblingSteps.get(0);
							currentSubSteps.clear();
							if (currentStep instanceof SequentialStep<?>) {
								final SequentialStep<arduinoTrace.Steps.SpecificStep> currentStep_cast = (SequentialStep<arduinoTrace.Steps.SpecificStep>) currentStep;
								currentSubSteps.addAll(
										currentStep_cast.getSubSteps().stream().filter(p).collect(Collectors.toList()));
							}
						}
					} else if (endingIndex == i && startingIndex != i) {
						if (currentSubSteps.isEmpty()) {
							// We need to explore the next sibling step
							arduinoTrace.Steps.SpecificStep tmp = currentStep;
							currentStep = null;
							while (currentStep == null) {
								final int idx = siblingSteps.indexOf(tmp) + 1;
								if (idx < siblingSteps.size()) {
									currentStep = siblingSteps.get(idx);
									if (currentStep instanceof SequentialStep<?>) {
										final SequentialStep<arduinoTrace.Steps.SpecificStep> currentStep_cast = (SequentialStep<arduinoTrace.Steps.SpecificStep>) currentStep;
										currentSubSteps.addAll(currentStep_cast.getSubSteps().stream().filter(p)
												.collect(Collectors.toList()));
									}
								} else {
									if (searchPath.isEmpty()) {
										throw new IllegalStateException("Unreachable state");
									} else {
										tmp = searchPath.remove(0);
										siblingSteps.clear();
										if (searchPath.isEmpty()) {
											siblingSteps.addAll(rootSteps);
										} else {
											final arduinoTrace.Steps.SpecificStep s = searchPath.get(0);
											if (s instanceof SequentialStep<?>) {
												final SequentialStep<arduinoTrace.Steps.SpecificStep> s_cast = (SequentialStep<arduinoTrace.Steps.SpecificStep>) s;
												siblingSteps.addAll((s_cast).getSubSteps().stream().filter(p)
														.collect(Collectors.toList()));
											}
										}
									}
								}
							}
						} else {
							// We need to explore the substeps in case one of them starts on i
							searchPath.add(0, currentStep);
							siblingSteps.clear();
							siblingSteps.addAll(currentSubSteps);
							currentStep = siblingSteps.get(0);
							currentSubSteps.clear();
							if (currentStep instanceof SequentialStep<?>) {
								final SequentialStep<arduinoTrace.Steps.SpecificStep> currentStep_cast = (SequentialStep<arduinoTrace.Steps.SpecificStep>) currentStep;
								currentSubSteps.addAll(
										currentStep_cast.getSubSteps().stream().filter(p).collect(Collectors.toList()));
							}
						}
					} else if (startingIndex == i) {
						firstStepOfState = currentStep;
					}
				}
			}
			jumpBeforeStep(firstStepOfState);
		}
	}

	@Override
	public boolean canStepBackInto() {
		return stepBackIntoResult != null;
	}

	@Override
	public boolean canStepBackOver() {
		return stepBackOverResult != null;
	}

	@Override
	public boolean canStepBackOut() {
		return stepBackOutResult != null;
	}

	@Override
	public int getCurrentStateIndex() {
		if (lastJumpIndex != -1) {
			return lastJumpIndex;
		}
		return statesTrace.size() - 1;
	}

	@Override
	public List<Step> getCallStack() {
		return callStack;
	}

	private List<arduinoTrace.Steps.SpecificStep> getStepsForStates(int startingState, int endingState) {
		Predicate<arduinoTrace.Steps.SpecificStep> predicate = s -> {
			final int stepStartingState = getStartingIndex(s);
			final int stepEndingState = getEndingIndex(s);
			return (stepEndingState == -1 || stepEndingState >= startingState) && stepStartingState <= endingState;
		};
		return traceRoot.getRootStep().getSubSteps().stream().filter(predicate).collect(Collectors.toList());
	}

	@Override
	public void notifyListeners() {
		for (ITraceListener listener : listeners) {
			listener.update();
		}
	}

	@Override
	public void addListener(ITraceListener listener) {
		if (listener != null) {
			listeners.add(listener);
		}
	}

	@Override
	public void removeListener(ITraceListener listener) {
		if (listener != null) {
			listeners.remove(listener);
		}
	}

	@Override
	public void update() {
		valueTraces.clear();
		valueTraces.addAll(getAllValueTraces());
		canBackValueCache.clear();
		notifyListeners();
	}

	@Override
	public Step getCurrentForwardStep() {
		if (!callStack.isEmpty()) {
			return callStack.get(callStack.size() - 1);
		}
		return null;
	}

	@Override
	public Step getCurrentBackwardStep() {
		return stepBackOverResult;
	}

	@Override
	public Step getCurrentBigStep() {
		return stepBackOutResult;
	}

	@Override
	public void jump(EObject o) {
		int idx = -1;
		if (o instanceof arduinoTrace.States.State) {
			idx = statesTrace.indexOf(o);
		} else if (o instanceof arduinoTrace.States.Value) {
			final arduinoTrace.States.State state = ((arduinoTrace.States.Value) o).getStatesNoOpposite().get(0);
			idx = statesTrace.indexOf(state);
		}
		if (idx != -1) {
			jump(idx);
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public void loadLastState() {
		final int idx = statesTrace.size() - 1;
		final List<arduinoTrace.Steps.SpecificStep> steps = getStepsForStates(idx, idx);
		arduinoTrace.Steps.SpecificStep lastStep = null;
		while (!steps.isEmpty()) {
			lastStep = steps.get(steps.size() - 1);
			steps.clear();
			if (lastStep instanceof SequentialStep<?>) {
				steps.addAll(((SequentialStep<arduinoTrace.Steps.SpecificStep>) lastStep).getSubSteps());
			}
		}
		final int endingIndex = getEndingIndex(lastStep);
		if (endingIndex == -1 || endingIndex == idx) {
			jumpBeforeStep(lastStep);
		}
	}

	@Override
	public boolean stepInto() {
		if (stepIntoResult != null) {
			jumpBeforeStep(stepIntoResult);
			return true;
		}
		return false;
	}

	@Override
	public boolean stepOver() {
		if (stepOverResult != null) {
			jumpBeforeStep(stepOverResult);
			return true;
		}
		return false;
	}

	@Override
	public boolean stepReturn() {
		if (stepReturnResult != null) {
			jumpBeforeStep(stepReturnResult);
			return true;
		}
		return false;
	}

	@Override
	public boolean stepBackInto() {
		if (stepBackIntoResult != null) {
			jumpBeforeStep(stepBackIntoResult);
			return true;
		}
		return false;
	}

	@Override
	public boolean stepBackOver() {
		if (stepBackOverResult != null) {
			jumpBeforeStep(stepBackOverResult);
			return true;
		}
		return false;
	}

	@Override
	public boolean stepBackOut() {
		if (stepBackOutResult != null) {
			jumpBeforeStep(stepBackOutResult);
			return true;
		}
		return false;
	}

	@Override
	public boolean isInReplayMode() {
		return stepIntoResult != null;
	}

	@Override
	public void updateCallStack(Step step) {
		if (step instanceof arduinoTrace.Steps.SpecificStep) {
			arduinoTrace.Steps.SpecificStep step_cast = (arduinoTrace.Steps.SpecificStep) step;
			final List<arduinoTrace.Steps.SpecificStep> newPath = new ArrayList<>();
			newPath.add(step_cast);
			EObject container = step.eContainer();
			while (container != null && container instanceof arduinoTrace.Steps.SpecificStep) {
				newPath.add(0, (arduinoTrace.Steps.SpecificStep) container);
				container = container.eContainer();
			}
			computeExplorerState(newPath);
			update();
		} else {
			throw new IllegalArgumentException(
					"ArduinoTraceExplorer expects specific steps and cannot handle this: " + step);
		}
	}
}
