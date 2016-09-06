package org.gemoc.execution.concurrent.ccsljavaengine.ui.deciders.actions;

import org.gemoc.execution.concurrent.ccsljavaengine.ui.SharedIcons;
import org.gemoc.execution.concurrent.ccsljavaengine.ui.deciders.AbstractUserDecider;
import org.gemoc.execution.concurrent.ccsljavaxdsml.api.core.IConcurrentExecutionEngine;
import org.gemoc.execution.concurrent.ccsljavaxdsml.api.core.ILogicalStepDecider;
import org.gemoc.executionframework.ui.views.engine.actions.AbstractEngineAction;
import org.gemoc.xdsmlframework.api.core.EngineStatus.RunStatus;
import org.gemoc.xdsmlframework.api.core.IExecutionEngine;

import fr.inria.diverse.trace.commons.model.trace.Step;

public class PauseResumeEngineDeciderAction extends AbstractEngineAction
{
	
	
	private DeciderAction _currentAction;
	
	private DeciderAction _stepByStepDeciderAction;
	
	public PauseResumeEngineDeciderAction()
	{
		super();
	}
	
	protected void init(){
		_stepByStepDeciderAction = DeciderManager.getStepByStepDeciderAction();
		_currentAction = _stepByStepDeciderAction;		
		updateButton();
	}
	
	protected void updateButton() {
		if (_currentAction != null)
		{
			// base text from Decider
			setText(_currentAction.getText());
			setToolTipText(_currentAction.getToolTipText());
			//setImageDescriptor(_currentAction.getImageDescriptor());
			if (getCurrentSelectedEngine() == null || getCurrentSelectedEngine().getRunningStatus().equals(RunStatus.Stopped))
			{
				setEnabled(false);
				setImageDescriptor(SharedIcons.SUSPEND_ENGINE_DECIDER_ICON);
			}
			else
			{
				setEnabled(	true);
				
				// find the decider opposed to the one currently used by the engine
				if (getCurrentSelectedEngine() instanceof IConcurrentExecutionEngine) {
					IConcurrentExecutionEngine engine_cast = (IConcurrentExecutionEngine) getCurrentSelectedEngine();
				_currentAction = DeciderManager.getSwitchDeciderAction(engine_cast.getLogicalStepDecider());
				if(_currentAction.equals(_stepByStepDeciderAction)){
					setToolTipText("Suspend associated engine using "+ _currentAction.getText());
					setImageDescriptor(SharedIcons.SUSPEND_ENGINE_DECIDER_ICON);
				} else {
					setToolTipText("Resume associated engine using "+ _currentAction.getText());
					setImageDescriptor(SharedIcons.RESUME_ENGINE_DECIDER_ICON);
				}
				}
			}
			
			
		}
	}

	@Override
	public void run()
	{
		if (getCurrentSelectedEngine() != null
			&& _currentAction != null && getCurrentSelectedEngine() instanceof IConcurrentExecutionEngine)
		{
			IConcurrentExecutionEngine engine_cast = (IConcurrentExecutionEngine) getCurrentSelectedEngine();
			ILogicalStepDecider savedDecider = engine_cast.getLogicalStepDecider();
			// apply the decider change
			_currentAction.run();			
			// now switch UI to the alternative Action by  refreshing UI
			updateButton();
			// relaunch the engine Ie. unlock possibly locked StepByStepDecider, for non "StepByStepDecider, simply let them run one more time
			if(savedDecider instanceof AbstractUserDecider){
				// get the equivalent decision from the new Decider
				Step selectedlogicalStep;
				try {

					selectedlogicalStep = engine_cast.getLogicalStepDecider().decide(engine_cast, engine_cast.getPossibleLogicalSteps());
					((AbstractUserDecider) savedDecider).decideFromTimeLine(selectedlogicalStep);
				} catch (InterruptedException e) {
				}
			}
		}
	}

	@Override
	public void engineSelectionChanged(IExecutionEngine engine) {
		super.engineSelectionChanged(engine);
		if(engine != null){
			if (engine instanceof IConcurrentExecutionEngine)
				_currentAction.setEngine((IConcurrentExecutionEngine)engine);
			updateButton();
		}
	}

	
	

	

}
