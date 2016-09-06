package org.modelexecution.xmof.gemoc.codegen.ui.commands;

import java.util.Iterator;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.handlers.HandlerUtil;
import org.modelexecution.xmof.gemoc.codegen.XMOFCodeGenerator;
import org.modelexecution.xmof.gemoc.codegen.ui.Activator;

public class XMOFCodeGenerationHandler extends AbstractHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		final IFile xmofFile = getXMOFFileFromSelection(event);
		final Resource xmofResource = loadXMOFResource(xmofFile);

		String xmofFileName = xmofResource.getURI().lastSegment();
		final Job job = new Job("Generating code for " + xmofFileName) {

			@Override
			protected IStatus run(IProgressMonitor monitor) {
				XMOFCodeGenerator xmofCodeGenerator = new XMOFCodeGenerator();
				boolean success = xmofCodeGenerator.generateCode(xmofResource, monitor);
				return new Status(success ? Status.OK : Status.ERROR, Activator.PLUGIN_ID,
						(success ? "Code generated for " : "Error during code generation for ") + xmofFileName);
			}
		};
		job.schedule();

		return null;
	}

	private Resource loadXMOFResource(final IFile xmofFile) {
		final ResourceSet resourceSet = new ResourceSetImpl();
		final URI uri = URI.createPlatformResourceURI(xmofFile.getFullPath().toString(), true);
		return resourceSet.getResource(uri, true);
	}

	private IFile getXMOFFileFromSelection(ExecutionEvent event) {
		ISelection selection = HandlerUtil.getActiveWorkbenchWindow(event).getActivePage().getSelection();
		if (selection != null && selection instanceof IStructuredSelection) {
			IStructuredSelection structuredSelection = (IStructuredSelection) selection;
			for (@SuppressWarnings("unchecked")
			Iterator<Object> selectionIterator = structuredSelection.iterator(); selectionIterator.hasNext();) {
				Object selectedElement = selectionIterator.next();
				if (selectedElement instanceof IFile) {
					return (IFile) selectedElement;
				}
			}

		}
		return null;
	}

}
