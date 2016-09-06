package org.gemoc.mocc.clocksystem.common.ui.actions;

/**
 * Copyright (c) 2012-2016 GEMOC consortium.
 * 
 * http://www.gemoc.org
 * 
 * Contributors:
 *   Papa Issa Diallo - ENSTA Bretagne [papa_issa.diallo@ensta-bretagne.fr]
 *   
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *   
 * $Id$
 */

//import java.io.IOException;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.net.URISyntaxException;
import java.util.Iterator;
import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IActionDelegate;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.actions.ActionDelegate;
import org.gemoc.mocc.clocksystem.common.ui.Activator;
import org.gemoc.mocc.clocksystem.pharo.ClockSystemFileGen;


public class ClockSystemFileGenHandler extends ActionDelegate implements IActionDelegate {
	  
	/**
	 * Input model file
	 */
	IFile clocksystem_file = null;
	
	/**
	 * Selected model files.
	 */
	protected List<IFile> files;
	
	protected String filetab[] = new String[2]; // file path for all OS
	protected String dirtab[] = new String[2]; // dir path for all OS
	
	@SuppressWarnings("unchecked")
	public void selectionChanged(IAction action, ISelection selection) {
		if (selection instanceof IStructuredSelection) {
			files = ((IStructuredSelection) selection).toList();
		}
	}
	
	@Override
	public void run(IAction action) {
		if (files != null) {
			System.out.println("Run");
			IRunnableWithProgress operation = new IRunnableWithProgress() {
				public void run(IProgressMonitor monitor) {
					try {
						Iterator<IFile> filesIt = files.iterator();
						//System.out.println("files :" + files);
						while (filesIt.hasNext()) {
							clocksystem_file = (IFile)filesIt.next();
							System.out.println("clocksystem file :" + clocksystem_file.getFullPath().toString());
							try {
								
								String clksysFileLoC = clocksystem_file.getLocation().toString();
								String clksysFileDir = clocksystem_file.getLocation().removeLastSegments(1).toString();
								
								String winFileLoC = clksysFileLoC.replace("/", "\\\\");
								String winFileDir = clksysFileDir.replace("/", "\\\\")+"\\\\";
								String otherFileLoC = clksysFileLoC;
								String otherFileDir = clksysFileDir + "/";
						
								filetab[0] = winFileLoC;
								filetab[1] = otherFileLoC;
								
								dirtab[0] = winFileDir;
								dirtab[1] = otherFileDir;
							/*	System.out.println("filetab[0] :" + filetab[0]);
								System.out.println("filetab[1] :" + filetab[1]);
								System.out.println("dirtab[0] :" + dirtab[0]);
								System.out.println("dirtab[1] :" + dirtab[1]);*/
								
								ClockSystemFileGen theFile = new ClockSystemFileGen();
								//System.out.println("unzipFromJar");
								if(!theFile.getVmFile().isDirectory()){
									theFile.unzipClockSystemfromJar();
								}
								System.out.println("Generated exploration ...");
								theFile.GenerateExploration(filetab, dirtab);

							} catch (URISyntaxException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							} catch (IOException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							} finally {
								clocksystem_file.getProject().refreshLocal(IResource.DEPTH_INFINITE, monitor);
							}
						}
					} catch (CoreException e) {
						IStatus status = new Status(IStatus.ERROR, Activator.PLUGIN_ID, e.getMessage(), e);
						Activator.getDefault().getLog().log(status);
					}
				}
			};
			try {
				PlatformUI.getWorkbench().getProgressService().run(true, true, operation);
			} catch (InvocationTargetException e) {
				IStatus status = new Status(IStatus.ERROR, Activator.PLUGIN_ID, e.getMessage(), e);
				Activator.getDefault().getLog().log(status);
			} catch (InterruptedException e) {
				IStatus status = new Status(IStatus.ERROR, Activator.PLUGIN_ID, e.getMessage(), e);
				Activator.getDefault().getLog().log(status);
			}
		}
	}
}