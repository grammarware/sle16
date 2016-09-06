package org.gemoc.bcool.model.xtext.builder;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IMarker;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceDelta;
import org.eclipse.core.resources.IResourceDeltaVisitor;
import org.eclipse.core.resources.IResourceVisitor;
import org.eclipse.core.resources.IncrementalProjectBuilder;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.xml.sax.SAXException;
import org.xml.sax.SAXParseException;
import org.xml.sax.helpers.DefaultHandler;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtext.resource.SaveOptions;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.eclipse.xtext.resource.SaveOptions.Builder;
import org.gemoc.bcool.model.bcool.BCoolSpecification;
import org.gemoc.bcool.model.xtext.BCOoLStandaloneSetup;
import org.gemoc.bcool.transformation.bcool2qvto.ui.common.GenerateAll;
import org.gemoc.commons.eclipse.core.resources.Project;

import com.google.inject.Injector;

import toools.io.file.RegularFile;



public class GemocBCOoLBuilder extends IncrementalProjectBuilder {

	class GemocBCOoLBuilderDeltaVisitor implements IResourceDeltaVisitor {
		/*
		 * (non-Javadoc)
		 * 
		 * @see org.eclipse.core.resources.IResourceDeltaVisitor#visit(org.eclipse.core.resources.IResourceDelta)
		 */
		public boolean visit(IResourceDelta delta) throws CoreException {
			IResource resource = delta.getResource();
			switch (delta.getKind()) {
			case IResourceDelta.ADDED:
				// handle added resource
				//checkXML(resource);
				processResource(resource);
				break;
			case IResourceDelta.REMOVED:
				// handle removed resource
				break;
			case IResourceDelta.CHANGED:
				// handle changed resource
				//checkXML(resource);
				processResource(resource);
				break;
			}
			//return true to continue visiting children.
			return true;
		}
	}
	
	
	protected void processResource(IResource resource){
		if(resource instanceof IFile && resource.getName().endsWith(".bcool")){
			updateQVTOFromBCOoL(resource);
		}
	}

	private void updateQVTOFromBCOoL(IResource resource) {
		IProgressMonitor monitor = new NullProgressMonitor();
		IProject project = resource.getProject();
		final IFile bcoolfile = (IFile) resource;
		String uristring = bcoolfile.getLocation().toOSString();
		final URI bcoolURI = URI.createFileURI(uristring);
		
		String genFolder = "gemoc-gen";		    	
	    try {
	    	
		// this creates the folder where it will be the qvto
	    final IFolder qvtoFolder = Project.createFolder(project, genFolder);
		
	    // ----------------------------------------------
		// We load the bcool model to get the name of the specification, and then, use it that string for the name of the generated qvto
	    //
		BCOoLStandaloneSetup  ess= new BCOoLStandaloneSetup();
		Injector injector = ess.createInjector();
	    XtextResourceSet aSet = injector.getInstance(XtextResourceSet.class);
		aSet.addLoadOption(XtextResource.OPTION_RESOLVE_ALL, Boolean.FALSE);
		EcoreUtil.resolveAll(aSet);
		BCOoLStandaloneSetup.doSetup();
		
	    Resource bcoolResource = aSet.getResource(bcoolURI, true);
	    
	    HashMap<Object, Object> saveOptions = new HashMap<Object, Object>();
	    Builder aBuilder = SaveOptions.newBuilder();
	    SaveOptions anOption = aBuilder.getOptions();
	    anOption.addTo(saveOptions);
	    try {
	    	bcoolResource.load(saveOptions);
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		BCoolSpecification bcoolmodel = (BCoolSpecification)bcoolResource.getContents().get(0);
	    
	    
		// we create the qvto file
	    final String qvtoFileName = bcoolmodel.getName() + ".qvto";
	    
	    
	
	    IContainer target = qvtoFolder;
	    GenerateAll generator = new GenerateAll(bcoolURI, target,new ArrayList<String>());
		generator.doGenerate(monitor );
		
	    // target contains the qvto 
		IFile qvtoFileForLanguage = qvtoFolder.getFile(qvtoFileName);
	    
		qvtoFileForLanguage.refreshLocal(IResource.DEPTH_INFINITE, new NullProgressMonitor());
		
		RegularFile reg_qvtoFileForLanguage = new RegularFile(qvtoFileForLanguage.getLocation().toOSString());
		
		
		String tmp = new String(reg_qvtoFileForLanguage.getContent());
		
		String qvtoLanguageContent = tmp.replaceAll("platform:/resource", "platform:/plugin");
		reg_qvtoFileForLanguage.setContent(qvtoLanguageContent.getBytes());
		
		qvtoFileForLanguage.refreshLocal(IResource.DEPTH_INFINITE, new NullProgressMonitor());
		
	    } catch (CoreException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}			    	
	}

	class SampleResourceVisitor implements IResourceVisitor {
		public boolean visit(IResource resource) {
			//checkXML(resource);
			processResource(resource);
			//return true to continue visiting children.
			return true;
		}
	}

	class XMLErrorHandler extends DefaultHandler {
		
		private IFile file;

		public XMLErrorHandler(IFile file) {
			this.file = file;
		}

		private void addMarker(SAXParseException e, int severity) {
			GemocBCOoLBuilder.this.addMarker(file, e.getMessage(), e
					.getLineNumber(), severity);
		}

		public void error(SAXParseException exception) throws SAXException {
			addMarker(exception, IMarker.SEVERITY_ERROR);
		}

		public void fatalError(SAXParseException exception) throws SAXException {
			addMarker(exception, IMarker.SEVERITY_ERROR);
		}

		public void warning(SAXParseException exception) throws SAXException {
			addMarker(exception, IMarker.SEVERITY_WARNING);
		}
	}

	public static final String BUILDER_ID = "org.gemoc.bcool.model.xtext.bcoolbuilder";

	private static final String MARKER_TYPE = "org.gemoc.bcool.model.xtext.xmlProblem";

	private SAXParserFactory parserFactory;

	private void addMarker(IFile file, String message, int lineNumber,
			int severity) {
		try {
			IMarker marker = file.createMarker(MARKER_TYPE);
			marker.setAttribute(IMarker.MESSAGE, message);
			marker.setAttribute(IMarker.SEVERITY, severity);
			if (lineNumber == -1) {
				lineNumber = 1;
			}
			marker.setAttribute(IMarker.LINE_NUMBER, lineNumber);
		} catch (CoreException e) {
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.core.internal.events.InternalBuilder#build(int,
	 *      java.util.Map, org.eclipse.core.runtime.IProgressMonitor)
	 */
	protected IProject[] build(int kind, Map args, IProgressMonitor monitor)
			throws CoreException {
		if (kind == FULL_BUILD) {
			fullBuild(monitor);
		} else {
			IResourceDelta delta = getDelta(getProject());
			if (delta == null) {
				fullBuild(monitor);
			} else {
				incrementalBuild(delta, monitor);
			}
		}
		return null;
	}

	protected void clean(IProgressMonitor monitor) throws CoreException {
		// delete markers set and files created
		getProject().deleteMarkers(MARKER_TYPE, true, IResource.DEPTH_INFINITE);
	}

	void checkXML(IResource resource) {
		if (resource instanceof IFile && resource.getName().endsWith(".xml")) {
			IFile file = (IFile) resource;
			deleteMarkers(file);
			XMLErrorHandler reporter = new XMLErrorHandler(file);
			try {
				getParser().parse(file.getContents(), reporter);
			} catch (Exception e1) {
			}
		}
	}

	private void deleteMarkers(IFile file) {
		try {
			file.deleteMarkers(MARKER_TYPE, false, IResource.DEPTH_ZERO);
		} catch (CoreException ce) {
		}
	}

	protected void fullBuild(final IProgressMonitor monitor)
			throws CoreException {
		try {
			getProject().accept(new SampleResourceVisitor());
		} catch (CoreException e) {
		}
	}

	private SAXParser getParser() throws ParserConfigurationException,
			SAXException {
		if (parserFactory == null) {
			parserFactory = SAXParserFactory.newInstance();
		}
		return parserFactory.newSAXParser();
	}

	protected void incrementalBuild(IResourceDelta delta,
			IProgressMonitor monitor) throws CoreException {
		// the visitor does the work.
		delta.accept(new GemocBCOoLBuilderDeltaVisitor());
	}
}
