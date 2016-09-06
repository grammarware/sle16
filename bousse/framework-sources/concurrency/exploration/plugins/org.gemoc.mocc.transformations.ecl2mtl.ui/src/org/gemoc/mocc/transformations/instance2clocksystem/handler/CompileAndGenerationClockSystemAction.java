package org.gemoc.mocc.transformations.instance2clocksystem.handler;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FilenameFilter;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.nio.file.FileVisitResult;
import java.nio.file.FileVisitor;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
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
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IActionDelegate;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.actions.ActionDelegate;
import org.gemoc.mocc.transformations.ecl2mtl.ui.Activator;
import org.gemoc.mocc.transformations.instance2clocksystem.CompileAndGenerate;


/**
 * Generating the Instance Files
 */
public class CompileAndGenerationClockSystemAction extends ActionDelegate implements IActionDelegate {
	
	/**
	 * Input model file
	 */
	IFile model = null;
	
	protected String filetab[] = new String[2]; // file path for all OS
	protected String dirtab[] = new String[2]; // dir path for all OS
	
	/**
	 * Generation folder
	 */
	public static final String GEN_FOLDER="clocksystem-files";
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

	/*protected final Shell getShell() {
		return null;//PlatformUI.getWorkbench().getModalDialogShellProvider().getActiveWorkbenchWindow().getShell();
	}*/
	
	/**{@inheritDoc}
	 *
	 * @see org.eclipse.ui.actions.ActionDelegate#run(org.eclipse.jface.action.IAction)
	 * @generated
	 */
	public void run(IAction action) {
		//URI modelURI = null;
		//IContainer clksysTransfoLoc = null;
		final CompileAndGenerationClockSystemWizard wizard= new CompileAndGenerationClockSystemWizard();
		// Find the model from the selected file
		if (files != null) {
	
			Iterator<IFile> filesIt = files.iterator();
			while (filesIt.hasNext()) {
				model = (IFile)filesIt.next();
				//modelURI = URI.createPlatformResourceURI(model.getFullPath().toString(), true);
				//clksysTransfoLoc = model.getProject().getFolder(MTL_FOLDER);
			}
		}
		// Call a wizard to select a xdsml project with corresponding transfos
		Display.getDefault().syncExec(new Runnable() {
			public void run() {
			    // Create the wizard dialog
				WizardDialog dialog = new WizardDialog
				     ( new Shell(),wizard);
				// Open the wizard dialog
				dialog.open();
			}
		});
		
		// Run the transfo
		IRunnableWithProgress operation = new IRunnableWithProgress() {
			public void run(IProgressMonitor monitor) {	
				try {			
					IContainer clksysTransfoLoc = model.getProject().getFolder(MTL_FOLDER);	
					// Retrieve the transfo folder
					//System.out.println("@@@ target "+ clksysTransfoLoc.getLocation().toOSString());
					Files.walkFileTree(wizard.getSourceFile().toPath(), 
							new CopyFile(wizard.getSourceFile().toPath(),new File(clksysTransfoLoc.getLocation().toOSString()).toPath()) );
					try {
						model.getProject().refreshLocal(IResource.DEPTH_INFINITE, monitor);
					} catch (CoreException e1) {
						IStatus status = new Status(IStatus.ERROR, Activator.PLUGIN_ID, e1.getMessage(), e1);
						Activator.getDefault().getLog().log(status);
					}
					
					// Get the toClockSystem.mtl file in the mtl-gen repository
					File mtldir = new File(clksysTransfoLoc.getLocation().toString());			
					File[] matches = mtldir.listFiles(new FilenameFilter()
						{
							public boolean accept(File dir, String name){
								  return name.endsWith("toClockSystem.mtl");
							}
						}
					);
					
					String mtlFilePath = matches[0].toString();
					// Create the storage folder of the generated ClockSystem models if doesnt exist
					IContainer target = model.getProject().getFolder(GEN_FOLDER);
					if (!target.getLocation().toFile().exists()) {
						target.getLocation().toFile().mkdirs();
					}
									
					// path of the repository that will contain the generated ClockSystem files
					String genrepo = model.getProject().getFolder(GEN_FOLDER).getLocation().toString();
							
					// Retrieve and put all the URI of allURI.txt in an Array of URI
					String uriFilePath = clksysTransfoLoc.getLocation().toString()+"/allURI.txt"; // File storing all the URI in the toClockSystem.mtl
					ArrayList<String> listURI = new ArrayList<String>();
					File file = new File(uriFilePath);
					Scanner input;
					try {
						input = new Scanner(file);
						while(input.hasNextLine()) {
							final String lineFromFile = input.nextLine();
							String newuri = lineFromFile.toString().replace(",", "").replace("'", "").replaceAll("\\s+","");
							listURI.add(newuri);
						}
						input.close();
					} catch (FileNotFoundException e) {
						IStatus status = new Status(IStatus.ERROR, Activator.PLUGIN_ID, e.getMessage(), e);
						Activator.getDefault().getLog().log(status);
					}
								
					URI modelURI = URI.createPlatformResourceURI(model.getFullPath().toString(), true);
					
					// Compile and Generate the ClockSystem Models using the toClockSystem.mtl
					/*System.out.println("=====================================================================");
					System.out.println("listURI: "+ listURI);
					System.out.println("modelURI: "+modelURI);
					System.out.println("mtlFilePath: "+mtlFilePath);
					System.out.println("GenRepo: "+genrepo);
					System.out.println("=====================================================================");*/
								
					CompileAndGenerate generator = new CompileAndGenerate(listURI,modelURI,mtlFilePath, genrepo);
							
				} catch (FileNotFoundException e) {
					IStatus status = new Status(IStatus.ERROR, Activator.PLUGIN_ID, e.getMessage(), e);
					Activator.getDefault().getLog().log(status);
				} catch (IOException e) {
					IStatus status = new Status(IStatus.ERROR, Activator.PLUGIN_ID, e.getMessage(), e);
					Activator.getDefault().getLog().log(status);
				} finally {
					try {
						model.getProject().refreshLocal(IResource.DEPTH_INFINITE, monitor);
					} catch (CoreException e) {
						IStatus status = new Status(IStatus.ERROR, Activator.PLUGIN_ID, e.getMessage(), e);
						Activator.getDefault().getLog().log(status);
					}
				}
			}
		};
			/*		} catch (CoreException e) {
						IStatus status = new Status(IStatus.ERROR, Activator.PLUGIN_ID, e.getMessage(), e);
						Activator.getDefault().getLog().log(status);
					}
				}
			};*/
		try {
			if(wizard.isHasFinished()){
				PlatformUI.getWorkbench().getProgressService().run(true, true, operation);
			}
		} catch (InvocationTargetException e) {
			IStatus status = new Status(IStatus.ERROR, Activator.PLUGIN_ID, e.getMessage(), e);
			Activator.getDefault().getLog().log(status);
		} catch (InterruptedException e) {
			IStatus status = new Status(IStatus.ERROR, Activator.PLUGIN_ID, e.getMessage(), e);
				Activator.getDefault().getLog().log(status);
			}
		}
	
	public class CopyFile implements FileVisitor<Path> {
        private final Path source;
        private final Path target;
 
        CopyFile(Path source, Path target) {
            this.source = source;
            this.target = target;
        }
 
        public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) {
            Path newdir = target.resolve(source.relativize(dir));
            try {
				Files.copy(dir, newdir, StandardCopyOption.REPLACE_EXISTING);
			} catch (IOException e) {
				return FileVisitResult.CONTINUE;
			}
            return FileVisitResult.CONTINUE;
        }
 
        public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) {
        	try {
				Files.copy(file, target.resolve(source.relativize(file)),StandardCopyOption.REPLACE_EXISTING);
			} catch (IOException e) {
				return FileVisitResult.CONTINUE;
			}
            return FileVisitResult.CONTINUE;
        }

		public FileVisitResult postVisitDirectory(Path dir, IOException exc)
				throws IOException {
			return FileVisitResult.CONTINUE;
		}

		public FileVisitResult visitFileFailed(Path file, IOException exc)
				throws IOException {
			return FileVisitResult.CONTINUE;
		}
 
    }
}