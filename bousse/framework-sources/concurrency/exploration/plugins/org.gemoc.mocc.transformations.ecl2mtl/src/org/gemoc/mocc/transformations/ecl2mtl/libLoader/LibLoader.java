/**
 * Copyright (c) 2012-2016 GEMOC consortium.
 * 
 * http://www.gemoc.org
 * 
 * Contributors:
 * *   
 *   P. Issa Diallo - ENSTA Bretagne [papa_issa.diallo@ensta-bretagne.fr]
 *   Stephen Creff - ENSTA Bretagne [stephen.creff@ensta-bretagne.fr] 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *   
 * $Id$
 */
package org.gemoc.mocc.transformations.ecl2mtl.libLoader;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtend.core.xtend.XtendFile;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.gemoc.mocc.ccslmoc.model.moccml.StateRelationBasedLibrary;
import org.gemoc.mocc.ccslmoc.model.moccml.impl.StateRelationBasedLibraryImpl;
import org.gemoc.mocc.ccslmocc.model.xtext.ui.internal.MoCDslActivator;

import com.google.inject.Injector;

import fr.inria.aoste.timesquare.ECL.ImportStatement;
import fr.inria.aoste.timesquare.ccslkernel.library.xtext.ui.internal.CCSLLibraryActivator;
import fr.inria.aoste.timesquare.ccslkernel.model.TimeModel.CCSLModel.ClockExpressionAndRelation.Library;
import fr.inria.aoste.timesquare.ccslkernel.model.TimeModel.CCSLModel.ClockExpressionAndRelation.impl.LibraryImpl;

/**
 * @author Stfun
 *
 */
@SuppressWarnings("restriction")
public class LibLoader {
	
	/**
	 * Load a MoCML lib from a timemodel ImportStatement
	 * @see ImportStatement
	 * @see StateRelationBasedLibrary
	 * @param arg0 the Import Statement
	 * @return the given MoCML state based library
	 */
	public static StateRelationBasedLibrary loadMoCMLLibrary(ImportStatement arg0){
		if (arg0.getImportURI().endsWith(".moccml")) {
			URI libURI;
			if (arg0.getImportURI().contains("platform:/resource/")) {
				String path = arg0.getImportURI().replace("platform:/resource/","");
				libURI = URI.createPlatformResourceURI(path,true);
			}else {
				if (arg0.getImportURI().contains("platform:/plugin/")) {
					String path = arg0.getImportURI().replace("platform:/plugin/","");
					libURI = URI.createPlatformPluginURI(path,true);
				} else {
					libURI = URI.createFileURI(arg0.getImportURI());
				}
			}		
					
			Injector xtextInjector = MoCDslActivator.getInstance().getInjector(MoCDslActivator.ORG_GEMOC_MOCC_CCSLMOCC_MODEL_XTEXT_MOCDSL);
			XtextResourceSet rs = xtextInjector.getInstance(XtextResourceSet.class);
			rs.setClasspathURIContext(LibLoader.class);
			XtextResource xtextResource = (XtextResource) rs.getResource(libURI, true);
			return (StateRelationBasedLibrary) xtextResource.getContents().get(0);
		}
		return null;
		
	}
	
	
	/**
	 * Load a Xtend File from a timemodel ImportStatement
	 * @see ImportStatement
	 * @see XtendFile
	 * @param arg0 the Import Statement
	 * @return the given XtendFile
	 */
	public static XtendFile loadXtendFile(ImportStatement arg0){
		XtendFile f = null;
		if (arg0.getImportURI().endsWith(".xtend")) 
		{
			URI libURI;
			if (arg0.getImportURI().contains("platform:/resource/")) {
				String path = arg0.getImportURI().replace("platform:/resource/","");
				libURI = URI.createPlatformResourceURI(path,true);
			}else {
				if (arg0.getImportURI().contains("platform:/plugin/")) {
					String path = arg0.getImportURI().replace("platform:/plugin/","");
					libURI = URI.createPlatformPluginURI(path,true);
				} else {
					libURI = URI.createFileURI(arg0.getImportURI());
				}
			}		
			
			XtextResourceSet rs = new XtextResourceSet();
			rs.setClasspathURIContext(LibLoader.class);
			XtextResource xtextResource = (XtextResource) rs.getResource(libURI, true);
			System.out.println("### -> " + xtextResource.getContents().get(0));
			f = (XtendFile) xtextResource.getContents().get(0);
		}
		return f;
	}
	
	/**
	 * Load a CCSL lib from a timemodel ImportStatement
	 * @see ImportStatement
	 * @see Library
	 * @param arg0 the Import Statement
	 * @return the given CCSL library
	 */
	public static Library loadCCSLLibrary(ImportStatement arg0){
		if ((arg0.getImportURI().endsWith(".ccslLib")) && (arg0.getImportURI().endsWith("CCSL.ccslLib")==false) && (arg0.getImportURI().endsWith("Kernel.ccslLib")==false)) {
			URI libURI;
			if (arg0.getImportURI().contains("platform:/resource/")) {
				String path = arg0.getImportURI().replace("platform:/resource/","");
				libURI = URI.createPlatformResourceURI(path,true);
			}else {
				if (arg0.getImportURI().contains("platform:/plugin/")) {
					String path = arg0.getImportURI().replace("platform:/plugin/","");
					libURI = URI.createPlatformPluginURI(path,true);
				} else {
					libURI = URI.createFileURI(arg0.getImportURI());
				}
			}		
					
			Injector xtextInjector = CCSLLibraryActivator.getInstance().getInjector(CCSLLibraryActivator.FR_INRIA_AOSTE_TIMESQUARE_CCSLKERNEL_LIBRARY_XTEXT_CCSLLIBRARY);
			XtextResourceSet rs = xtextInjector.getInstance(XtextResourceSet.class);
			rs.setClasspathURIContext(LibLoader.class);
			XtextResource xtextResource = (XtextResource) rs.getResource(libURI, true);
			return (LibraryImpl) xtextResource.getContents().get(0);
		}
		return null;
		
	}

}
