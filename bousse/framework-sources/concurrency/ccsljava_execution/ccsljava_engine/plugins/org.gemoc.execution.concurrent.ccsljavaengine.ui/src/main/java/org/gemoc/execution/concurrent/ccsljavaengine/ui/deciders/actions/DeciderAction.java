package org.gemoc.execution.concurrent.ccsljavaengine.ui.deciders.actions;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.resource.ImageDescriptor;
import org.gemoc.execution.concurrent.ccsljavaengine.ui.Activator;
import org.gemoc.execution.concurrent.ccsljavaxdsml.api.core.IConcurrentExecutionEngine;
import org.gemoc.execution.concurrent.ccsljavaxdsml.api.core.ILogicalStepDecider;
import org.gemoc.execution.concurrent.ccsljavaxdsml.api.extensions.deciders.DeciderSpecificationExtension;

public class DeciderAction extends Action 
{
	
	protected DeciderSpecificationExtension _specification;

	

	public DeciderAction(DeciderSpecificationExtension specification)
	{
		_specification = specification;
		setText(_specification.getName());
		setToolTipText(_specification.getDescription());
		ImageDescriptor id = ImageDescriptor.createFromURL(specification.getIconURL());
		setImageDescriptor(id);
	}
	
	@Override
	public void run() {
		ILogicalStepDecider newDecider;
		try {
			newDecider = _specification.instanciateDecider();
			_engine.changeLogicalStepDecider(newDecider);
		} catch (CoreException e) {
			Activator.error(e.getMessage(), e);
			e.printStackTrace();
		}
	}

	protected IConcurrentExecutionEngine _engine;
	public void setEngine(IConcurrentExecutionEngine engine) {
		_engine = engine;
	}
	
	public DeciderSpecificationExtension getSpecification() {
		return _specification;
	}
	
}
