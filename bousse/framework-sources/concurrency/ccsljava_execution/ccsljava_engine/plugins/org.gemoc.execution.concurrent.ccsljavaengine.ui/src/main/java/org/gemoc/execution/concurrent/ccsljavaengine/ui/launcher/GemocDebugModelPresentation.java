package org.gemoc.execution.concurrent.ccsljavaengine.ui.launcher;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.eclipse.debug.core.model.IStackFrame;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.sirius.ui.business.api.dialect.DialectEditor;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;
import org.gemoc.execution.concurrent.ccsljavaengine.ui.SharedIcons;
import org.gemoc.executionframework.ui.IMSEPresenter;

import fr.inria.diverse.trace.commons.model.helper.StepHelper;
import fr.inria.diverse.trace.commons.model.trace.MSE;
import fr.inria.diverse.trace.commons.model.trace.MSEOccurrence;
import fr.inria.diverse.trace.commons.model.trace.Step;
import fr.obeo.dsl.debug.DebugTarget;
import fr.obeo.dsl.debug.StackFrame;
import fr.obeo.dsl.debug.ide.adapter.DSLStackFrameAdapter;
import fr.obeo.dsl.debug.ide.sirius.ui.DSLDebugModelPresentation;
import fr.obeo.dsl.debug.ide.sirius.ui.SiriusEditorUtils;

public class GemocDebugModelPresentation extends DSLDebugModelPresentation {

	@Override
	public IEditorInput getEditorInput(Object element) {
		final IEditorInput res;

		if (element instanceof MSE
				&& ((MSE) element).getCaller() != null) {
			res = super.getEditorInput(((MSE) element).getCaller());
		} else if (element instanceof MSEOccurrence
				&& ((MSEOccurrence) element).getMse().getCaller() != null) {
			res = super.getEditorInput(((MSEOccurrence) element).getMse().getCaller());
		} else {
			res = super.getEditorInput(element);
		}

		return res;
	}

	@Override
	public String getEditorId(IEditorInput input, Object element) {
		final String res;

		if (element instanceof MSE
				&& ((MSE) element).getCaller() != null) {
			res = super.getEditorId(input, ((MSE) element).getCaller());
		} else {
			res = super.getEditorId(input, element);
		}


		return res;
	}

	@Override
	public boolean addAnnotations(IEditorPart editorPart, IStackFrame frame) {
		if (frame instanceof DSLStackFrameAdapter) {
			changeCurrentStackFrame(frame);
			if (editorPart instanceof DialectEditor) {
				EObject instruction = ((DSLStackFrameAdapter) frame)
						.getCurrentInstruction();
				if (instruction instanceof Step) {
					final List<MSE> tickedEvents = StepHelper.collectAllMSEs((Step)instruction);
					showEvents(tickedEvents);
					final Set<EObject> callers = new LinkedHashSet<EObject>();
					for (MSE event : tickedEvents) {
						if (event.getCaller() != null) {
							callers.add(event.getCaller());
						}
					}
					try{
						SiriusEditorUtils.showInstructions((DialectEditor) editorPart, new ArrayList<EObject>(callers));
					} catch (Exception e){}
				} else {
					try{
						SiriusEditorUtils.showInstruction((DialectEditor) editorPart, instruction);
					} catch (Exception e){}
				}
			} else {
				super.addAnnotations(editorPart, frame);
			}
		}

		return true;
	}

	private void showEvents(List<MSE> events) {
		final List<URI> uris = new ArrayList<URI>();
		for (MSE event : events) {
			uris.add(EcoreUtil.getURI(event));
		}
		for (IMSEPresenter presenter : org.gemoc.executionframework.ui.Activator
				.getDefault().getEventPresenters()) {
			presenter.present(uris);
		}
	}
	
	@Override
	public String getText(Object element) {
		
		if(element instanceof Adapter) {
			Object target = ((Adapter)element).getTarget();
		
			if(target instanceof DebugTarget) {
				return ((DebugTarget)target).getName();
				
			} else if(target instanceof fr.obeo.dsl.debug.Thread) {
				return ((fr.obeo.dsl.debug.Thread)target).getName();
				
			} else if(target instanceof StackFrame) {
				return ((StackFrame) target).getName();
			}
			
		}
		return super.getText(element);
	}
	
	@Override
	public Image getImage(Object element) {
		if(element instanceof Adapter) {
			final Object target = ((Adapter)element).getTarget();
			if(target instanceof StackFrame) {
				final StackFrame stackFrame = (StackFrame) target;
				if(stackFrame.getCurrentInstruction() instanceof Step && stackFrame.getContext() instanceof Step){
					return SharedIcons.getSharedImage(SharedIcons.LOGICALSTEP_ICON);
				} else if(stackFrame.getCurrentInstruction() instanceof MSEOccurrence){
					// MSEOccurrence mseOcc = (MSEOccurrence) stackFrame.getCurrentInstruction();
					// if(mseOcc.getMse() != null && mseOcc.getMse().getCaller() != null) {
					//	return super.getImage(mseOcc.getMse().getCaller());
					//} else {
						return SharedIcons.getSharedImage(SharedIcons.VISIBLE_EVENT_ICON);
					//}
				}
			}
		}
		return super.getImage(element);
	}

}
