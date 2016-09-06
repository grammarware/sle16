package org.gemoc.mocc.transformations.instance2clocksystem;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

import org.eclipse.acceleo.common.internal.utils.AcceleoPackageRegistry;
import org.eclipse.acceleo.common.utils.ModelUtils;
import org.eclipse.acceleo.engine.generation.AcceleoEngine;
import org.eclipse.acceleo.engine.generation.IAcceleoEngine2;
import org.eclipse.acceleo.engine.generation.strategy.PreviewStrategy;
import org.eclipse.acceleo.engine.internal.debug.IDebugAST;
import org.eclipse.acceleo.engine.internal.evaluation.AcceleoEvaluationVisitor;
import org.eclipse.acceleo.internal.parser.compiler.AcceleoParserUtils;
import org.eclipse.acceleo.model.mtl.Module;
import org.eclipse.acceleo.model.mtl.ModuleElement;
import org.eclipse.acceleo.model.mtl.Query;
import org.eclipse.acceleo.model.mtl.Template;
import org.eclipse.acceleo.parser.AcceleoParser;
import org.eclipse.acceleo.parser.AcceleoSourceBuffer;
import org.eclipse.emf.common.util.BasicMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

public class CompileAndGenerate {

	public CompileAndGenerate(ArrayList<String> uriList, URI modelURI,String mtlpth, String fileoutputpath) throws FileNotFoundException
	{
		
		String mtl;
		
		File file = new File(mtlpth); // The file containing an mtl Transformation
		final Scanner scanner = new Scanner(file);
		Scanner s = scanner.useDelimiter("\\A");
		mtl = s.next();
		scanner.close();
		
		
		System.out.println("Registering EPackages");
				
		final ResourceSet resourceSet = new ResourceSetImpl();
		
		// Registering the EPackages within the mtl File
		for(String uri : uriList)
	    {
			Resource res = resourceSet.getResource(URI
		        .createURI(uri), true);
		    EObject eObject = res.getContents().get(0);
		    if(eObject instanceof EPackage)
		    {
		    	EPackage pkg = (EPackage)eObject;
		    	AcceleoPackageRegistry.INSTANCE.put(pkg.getNsURI(), pkg);
		    }
	    }
		
		resourceSet.setPackageRegistry(AcceleoPackageRegistry.INSTANCE);
		AcceleoParserUtils.registerResourceFactories(resourceSet);
		AcceleoParserUtils.registerPackages(resourceSet);
		// TODO load libraries from jar files...ie ?
		AcceleoParserUtils.registerLibraries(resourceSet);

		final Resource resource = ModelUtils.createResource(
				URI.createURI("http://acceleo.eclipse.org/default.emtl"),
				resourceSet);
		
		final AcceleoSourceBuffer source = new AcceleoSourceBuffer(
				new StringBuffer(mtl));

		final AcceleoParser parser = new AcceleoParser();
		parser.parse(source, resource, new ArrayList<URI>());

		// TODO check source.getProblems();
		// TODO check source.getWarnings();
		// TODO check source.getInfos();

		final Template mainTemplate = (Template) ((Module) resource
				.getContents().get(0)).getOwnedModuleElement().get(0);
		
		final List<EObject> eObjects = new ArrayList<EObject>();
		
		// Getting the model that will be used as target by the mainTemplate
		Resource modelres = resourceSet.getResource(modelURI, true);
		EObject modelObject = modelres.getContents().get(0);
		
		
		eObjects.add(modelObject);
		
		Map<String, String> filesContent = evaluateModuleElement(mainTemplate, eObjects);

		// Creating output files with the results of the Transformation from mtl
		for (Entry<String, String> entry : filesContent.entrySet()) {
			
			String gen = fileoutputpath+"/"+entry.getKey();
			PrintWriter writer;
			try {
				writer = new PrintWriter(gen, "UTF-8");
				writer.println(entry.getValue());
				//writer.println(entry);
				writer.close();
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (UnsupportedEncodingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	/**
	 * Evaluates the given module element with the current context and returns
	 * the result.
	 * 
	 * @param moduleElement
	 *            The module element we are to evaluate.
	 * @param target
	 *            The list of selected EObjects. Will be used as the
	 *            evaluation's target (i.e : the "self" element).
	 * @return The result of this evaluation.
	 */
	
	private static Map<String, String> evaluateModuleElement(
			ModuleElement moduleElement, List<EObject> target) {
		// Prepare arguments
		List<Object> arguments = new ArrayList<Object>();
		Iterator<EObject> targetItr = target.iterator();

		List<org.eclipse.ocl.ecore.Variable> parameters = Collections
				.emptyList();
		if (moduleElement instanceof Template) {
			parameters = ((Template) moduleElement).getParameter();
		} else if (moduleElement instanceof Query) {
			parameters = ((Query) moduleElement).getParameter();
		}
		for (org.eclipse.ocl.ecore.Variable param : parameters) {
			boolean found = false;
			if (!found && targetItr.hasNext()) {
				arguments.add(targetItr.next());
				found = true;
			}
			if (!found) {
				// Is it our "root" dummy template's parameter?
				if ("currentModel".equals(param.getName()) && target.size() > 0) { //$NON-NLS-1$
					arguments.add(EcoreUtil.getRootContainer(target.get(0)));
				} else {
					// FIXME throw exception from here
				}
			}
		}

		Object result = null;
		IAcceleoEngine2 engine = new AcceleoEngine();
		PreviewStrategy strategy = new InMemoryPreviewStrategy();
		final IDebugAST debugger = AcceleoEvaluationVisitor.getDebug();
		AcceleoEvaluationVisitor.setDebug(null);
		System.out.println("##################################################################");
		System.out.println("moduleELement: "+ moduleElement);
		System.out.println("args: "+arguments);
		System.out.println("##################################################################");
	
		try {
			if (moduleElement instanceof Template) {
				result = engine.evaluate((Template) moduleElement, arguments,
						strategy, new BasicMonitor());
			} else if (moduleElement instanceof Query) {
				result = engine.evaluate((Query) moduleElement, arguments,
						strategy, new BasicMonitor());
			}
		} 
		
		finally {
			try {
				strategy.awaitCompletion();
			} catch (InterruptedException e) {
				// LostFileWriters cannot throw exceptions
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		AcceleoEvaluationVisitor.setDebug(debugger);

		return strategy.preparePreview(null);
	}
}
