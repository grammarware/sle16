package org.gemoc.gel.compiler.ui.popup.actions;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IActionDelegate;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.gemoc.gel.GelFactory;
import org.gemoc.gel.GelPackage;
import org.gemoc.gel.compiler.Gel2microgel;
import org.gemoc.gel.ui.internal.GELActivator;

import com.google.inject.Injector;

public class GenerateModelSpecificEventsSpecification implements
		IObjectActionDelegate {

	private Shell shell;

	private IFile modelFile;
	private IFile dseFile;
	private IFile ccslFile;

	/**
	 * Constructor for Action1.
	 */
	public GenerateModelSpecificEventsSpecification() {
		super();
	}

	/**
	 * @see IObjectActionDelegate#setActivePart(IAction, IWorkbenchPart)
	 */
	public void setActivePart(IAction action, IWorkbenchPart targetPart) {
		shell = targetPart.getSite().getShell();
	}

	/**
	 * @see IActionDelegate#run(IAction)
	 */
	public void run(IAction action) {
		if (modelFile == null || dseFile == null || ccslFile == null
				|| !ccslFile.exists() || !modelFile.exists()
				|| !dseFile.exists()) {
			return;
		}
		URI modelURI = URI.createPlatformResourceURI(modelFile.getFullPath()
				.toString(), true);
		URI dseURI = URI.createPlatformResourceURI(dseFile.getFullPath()
				.toString(), true);
		URI ccslURI = URI.createPlatformResourceURI(ccslFile.getFullPath()
				.toString(), true);

		GelPackage.eINSTANCE.eClass();
		GelFactory gelFactory = GelFactory.eINSTANCE;

		// Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		// Map<String, Object> m = reg.getExtensionToFactoryMap();
		// m.put("GEL", new );
		// m.put("extendedCCSL", new XMIResourceFactoryImpl());

		// ResourceSet resSet = new ResourceSetImpl();

		// Load the model with xText
		GELActivator activator = new GELActivator();
		Injector injector = activator
				.getInjector(GELActivator.ORG_GEMOC_GEL_GEL);

		XtextResourceSet resSet = injector.getInstance(XtextResourceSet.class);

		resSet.addLoadOption(XtextResource.OPTION_RESOLVE_ALL, Boolean.TRUE);
		Resource dseResource = resSet.getResource(dseURI, true);
		EcoreUtil.resolveAll(dseResource);
		Resource modelResource = resSet.getResource(modelURI, true);
		EcoreUtil.resolveAll(modelResource);
		Resource ccslResource = resSet.getResource(ccslURI, true);
		EcoreUtil.resolveAll(ccslResource);

		Gel2microgel compiler = new Gel2microgel();
		Resource newResource = compiler.compile(dseResource, ccslResource,
				modelResource);
		Diagnostic diagnostic = Diagnostician.INSTANCE.validate(newResource
				.getContents().get(0));
		int diagnosticCode = diagnostic.getSeverity();
		switch (diagnosticCode) {
		case Diagnostic.OK:
			MessageDialog.openInformation(shell, "Gel2microgel",
					"GEL Compilation was executed successfully.");
			break;
		case Diagnostic.INFO:
			MessageDialog.openInformation(shell, "Gel2microgel",
					"GEL Compilation was executed: " + diagnostic.getMessage());
			break;
		case Diagnostic.ERROR:
			MessageDialog.openError(shell, "Gel2microgel",
					"GEL Compilation failed: " + diagnostic.getMessage());
			break;
		case Diagnostic.CANCEL:
			MessageDialog
					.openError(
							shell,
							"Gel2microgel",
							"GEL Compilation was cancelled: "
									+ diagnostic.getMessage());
			break;
		case Diagnostic.WARNING:
			MessageDialog
					.openWarning(
							shell,
							"Gel2microgel",
							"GEL Compilation had a warning: "
									+ diagnostic.getMessage());
			break;
		}

	}

	/**
	 * @see IActionDelegate#selectionChanged(IAction, ISelection)
	 */
	public void selectionChanged(IAction action, ISelection selection) {
		dseFile = null;
		modelFile = null;
		ccslFile = null;
		StructuredSelection structuredSelection = (StructuredSelection) selection;
		List<Object> selectedFiles = structuredSelection.toList();
		List<IFile> files = new ArrayList<IFile>();
		for (Object o : selectedFiles) {
			if (o instanceof IFile) {
				files.add((IFile) o);
			}
		}
		if (files.size() != 3) {
			throw new IllegalArgumentException(
					"You need to select three resources : the DSE specification of the language, a model and the corresponding extendedCCSL file.");
		}

		for (IFile f : files) {
			if (f.getFileExtension().equals("GEL")
					|| f.getFileExtension().equals("gel")) {
				dseFile = f;
			} else if (f.getFileExtension().equals("extendedCCSL")
					|| f.getFileExtension().equals("timemodel")) {
				ccslFile = f;
			} else {
				modelFile = f;
			}
		}
	}
}
