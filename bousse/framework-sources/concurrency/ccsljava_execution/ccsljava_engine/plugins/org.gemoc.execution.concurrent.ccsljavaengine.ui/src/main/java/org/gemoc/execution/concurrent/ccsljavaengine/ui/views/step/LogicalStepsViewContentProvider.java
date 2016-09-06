package org.gemoc.execution.concurrent.ccsljavaengine.ui.views.step;

import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.Viewer;
import org.gemoc.execution.concurrent.ccsljavaxdsml.api.core.IConcurrentExecutionEngine;
import org.gemoc.xdsmlframework.api.core.EngineStatus.RunStatus;

import fr.inria.diverse.trace.commons.model.helper.StepHelper;
import fr.inria.diverse.trace.commons.model.trace.Step;

public class LogicalStepsViewContentProvider implements ITreeContentProvider {

	@Override
	public void dispose() 
	{
	}

	@Override
	public void inputChanged(Viewer viewer, Object oldInput, Object newInput) 
	{
	}

	@Override
	public Object[] getElements(Object inputElement) {
		if (inputElement instanceof IConcurrentExecutionEngine)
		{
			IConcurrentExecutionEngine engine = (IConcurrentExecutionEngine)inputElement;
			if (engine.getRunningStatus().equals(RunStatus.Stopped))
			{
				String message = "Engine is not running";
				return new Object[] {
					message
				};				
			}
			else
			{
				if (engine.getPossibleLogicalSteps() != null)
				{
					return engine.getPossibleLogicalSteps().toArray();				
				}
				else
				{
					return new Object[] {};
				}
			}
		}
		else if (inputElement instanceof Step)
		{
			Step ls = (Step)inputElement;
			return StepHelper.collectAllMSEOccurrences(ls).toArray();
		}
		return new Object[0];
	}

	@Override
	public Object[] getChildren(Object parentElement) {
		if (parentElement instanceof IConcurrentExecutionEngine)
		{
			IConcurrentExecutionEngine engine = (IConcurrentExecutionEngine)parentElement;
			return engine.getPossibleLogicalSteps().toArray();
		}
		else if (parentElement instanceof Step)
		{
			Step ls = (Step)parentElement;
			return StepHelper.collectAllMSEOccurrences(ls).toArray();
		}
		return new Object[0];	
	}

	@Override
	public Object getParent(Object element) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean hasChildren(Object element) 
	{
		if (element instanceof IConcurrentExecutionEngine)
		{
			IConcurrentExecutionEngine engine = (IConcurrentExecutionEngine)element;
			return engine.getPossibleLogicalSteps().size() > 0;
		}
		else if (element instanceof Step)
		{
			Step ls = (Step)element;
			return StepHelper.collectAllMSEOccurrences(ls).size() > 0;
		}
		return false;	
	}



}
