/*******************************************************************************

 *******************************************************************************/
package org.gemoc.mocc.transformations.instance2clocksystem.handler;

import java.io.File;
import java.io.FilenameFilter;
import java.io.FileNotFoundException;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.URI;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IActionDelegate;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.actions.ActionDelegate;
import org.gemoc.mocc.transformations.instance2clocksystem.Activator;
import org.gemoc.mocc.transformations.instance2clocksystem.CompileAndGenerate;

/**
 * Generating the Instance Files
 */
public class CompileAndGenerationFiacreAction extends ActionDelegate implements IActionDelegate {
	
	/**
	 * Input model file
	 */
	IFile model = null;
	
	/**
	 * Generation folder
	 */
	public static final String GEN_FOLDER="fiacre-files";
	public static final String MTL_FOLDER="mtl-gen";
	
	/**
	 * Selected model files.
	 */
	protected List<IFile> files;

	/**{@inheritDoc}
	 *
	 * @see org.eclipse.ui.actions.ActionDelegate#selectionChanged(org.eclipse.jface.action.IAction, org.eclipse.jface.viewers.ISelection)
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public void selectionChanged(IAction action, ISelection selection) {
		if (selection instanceof IStructuredSelection) {
			files = ((IStructuredSelection) selection).toList();
		}
	}
	

	/**{@inheritDoc}
	 *
	 * @see org.eclipse.ui.actions.ActionDelegate#run(org.eclipse.jface.action.IAction)
	 * @generated
	 */
	public void run(IAction action) {
		if (files != null) {
			
			IRunnableWithProgress operation = new IRunnableWithProgress() {
				public void run(IProgressMonitor monitor) {
					try {
						Iterator<IFile> filesIt = files.iterator();
						while (filesIt.hasNext()) {
							model = (IFile)filesIt.next();
							
							URI modelURI = URI.createPlatformResourceURI(model.getFullPath().toString(), true);
							try {
								
								IContainer fcrTransfoLoc = model.getProject().getFolder(MTL_FOLDER);
								
								// Get the toFiacre.mtl file in the mtl-gen repository
								File mtldir = new File(fcrTransfoLoc.getLocation().toString());
								File[] matches = mtldir.listFiles(new FilenameFilter()
								{
								  public boolean accept(File dir, String name)
								  {
								     return name.endsWith("toFiacre.mtl");
								  }
								});
								String mtlFilePath = matches[0].toString();
								
								// Create the storage folder of the generated Fiacre models if doesnt exist
								IContainer target = model.getProject().getFolder(GEN_FOLDER);
								if (!target.getLocation().toFile().exists()) {
									target.getLocation().toFile().mkdirs();
								}
									
								// path of the repository that will contain the generated Fiacre files
								String genrepo = model.getProject().getFolder(GEN_FOLDER).getLocation().toString();
							
								// Retrieve and put all the URI of allURI.txt in an Array of URI
								String uriFilePath = fcrTransfoLoc.getLocation().toString()+"/allURI.txt"; // File storing all the URI in the toFiacre.mtl
								ArrayList<String> listURI = new ArrayList<String>();
								File file = new File(uriFilePath);
							
				/**/			//XtendFileChooserBasic fl = new XtendFileChooserBasic("C:\\Workspaces\\runtime-v4LanguageModelingTest\\org.gemoc.sigpml.k3dsa");
								//System.out.println(fl.getFile().getName());
								
								Scanner input;
								try {
									input = new Scanner(file);
									while(input.hasNextLine()) 
									{
										final String lineFromFile = input.nextLine();
										String newuri = lineFromFile.toString().replace(",", "").replace("'", "").replaceAll("\\s+","");
								        listURI.add(newuri);
								    }
									input.close();
								} catch (FileNotFoundException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
								
								// Compile and Generate the Fiacre Models using the toFiacre.mtl
								CompileAndGenerate generator = new CompileAndGenerate(listURI,modelURI,mtlFilePath, genrepo);
							} catch (FileNotFoundException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							} finally {
								model.getProject().refreshLocal(IResource.DEPTH_INFINITE, monitor);
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