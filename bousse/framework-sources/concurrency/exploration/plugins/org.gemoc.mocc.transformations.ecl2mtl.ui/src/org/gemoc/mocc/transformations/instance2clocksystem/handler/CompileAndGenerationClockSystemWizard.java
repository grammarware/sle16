package org.gemoc.mocc.transformations.instance2clocksystem.handler;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;

import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.gemoc.execution.concurrent.ccsljavaxdsml.api.extensions.languages.ConcurrentLanguageDefinitionExtension;
import org.gemoc.execution.concurrent.ccsljavaxdsml.api.extensions.languages.ConcurrentLanguageDefinitionExtensionPoint;
import org.gemoc.xdsmlframework.api.extensions.languages.LanguageDefinitionExtension;
import org.osgi.framework.Bundle;


public class CompileAndGenerationClockSystemWizard extends Wizard {

  protected Combo _languageCombo;
	
  protected File sourceFile;

  private SelectProjectPage selectProject;

  private boolean hasFinished = false;
  
  public CompileAndGenerationClockSystemWizard() {
    super();
    setNeedsProgressMonitor(true);
  }

  @Override
  public String getWindowTitle() {
    return "Select xdsml";
  }
  
  protected boolean sourceFileHasChanged = true;
  
  public File getSourceFile() { 
	if(sourceFile==null || sourceFileHasChanged){
		retrieveSourceFile();
	}
	return sourceFile;
  }

  public void setSourceFile(File sourceFile) {
	this.sourceFile = sourceFile;
  }

  @Override
  public void addPages() {
	selectProject = new SelectProjectPage();
    addPage(selectProject);
  }

  @Override
  public boolean performFinish() {
	  hasFinished = true;
	  return true;
  }

  public boolean isHasFinished() {
	return hasFinished;
}

@Override
  public boolean performCancel() {
	  hasFinished = false;
	  return true;
  }
  
  private File retrieveSourceFile(){
	  	File sourceFile = null;
	  	LanguageDefinitionExtension dfe = ConcurrentLanguageDefinitionExtensionPoint.findDefinition(selectProject.projectName);
	  	
		Bundle bundle = null;
		
		try{	
			if(bundle==null){
				//ModelTypingSpace ld = (ModelTypingSpace)o;
				ConcurrentLanguageDefinitionExtension extension =(ConcurrentLanguageDefinitionExtension)dfe;
				Path path = new Path(extension.getQVTOPath());
				bundle = Platform.getBundle((path.removeLastSegments(3).toString().replace("/", "")));
			}	
		}
		// HACK: Since melange, cannot do the same to retrieve the dse project.
		// Need to store in the extension the bundle ID and it should be Ok, or retrieve propertly the melange Object.
		catch (Exception e) {
			ConcurrentLanguageDefinitionExtension extension =(ConcurrentLanguageDefinitionExtension)dfe;
			Path path = new Path(extension.getQVTOPath());
			bundle = Platform.getBundle((path.removeLastSegments(3).toString().replace("/", "")));
		}
		
		
		if( bundle == null )
			throw new RuntimeException("Cannot fin any DSE project related to this XDSML");
		
		try {
			//System.out.println("@@@ " + FileLocator.getBundleFile(bundle) + "/mtl-gen/");
			setSourceFile(new File(FileLocator.getBundleFile(bundle) + "/mtl-gen/"));
			sourceFileHasChanged = false;
		} catch (IOException e) {
			//IStatus status = new Status(IStatus.ERROR, Activator.PLUGIN_ID, e.getMessage(), e);
			//Activator.getDefault().getLog().log(status);
		}
	
		
		
		return sourceFile;
  }
  
  
  @Override
  public boolean canFinish() {
	  if(selectProject.projectName!=null){
		//  System.out.println("@@@ " + selectProject.projectName);
		  if(getSourceFile()!=null){
			  return true;
		  }
	  }
	  return false;
	  
  };

public class SelectProjectPage extends WizardPage {
	  private Text selectProjectText;
	  private Composite container;
	  private String projectName;

	  public SelectProjectPage() {
	    super("Select the Xdsml");
	    //setTitle("Select xdsml");
	    setDescription("Select a xdsml to define the clocksystem execution semantics");
	    
	    try{
	    	URL url = FileLocator.find(
					Platform.getBundle("org.gemoc.mocc.transformations.ecl2mtl.ui"),
					new Path("icons/clocksystem_logo_64x64.png"), null);
	    	if(url!=null){
	    		setImageDescriptor(ImageDescriptor.createFromURL(url));
	    	}
	    }catch(Exception e){
	    	System.out.print("Not image found");
	    }
		
	    
	  }

	  public void createControl(Composite parent) {
	    container = new Composite(parent, SWT.NONE);
	    GridLayout layout = new GridLayout();
	    container.setLayout(layout);
	    layout.numColumns = 2;
	    createLanguageLayout(container);
	    setControl(container);
	    setPageComplete(false);
	  }
	  
	  
	  
	  /**
	   * 
	   * @param parent
	   *            the Parent
	   * @param labelString
	   *            the label of the input text to create
	   */
	  protected Label createTextLabelLayout(Composite parent, String labelString) {
	  	GridData gd = new GridData(GridData.FILL_HORIZONTAL);
	  	parent.setLayoutData(gd);
	  	Label inputLabel = new Label(parent, SWT.NONE);
	  	inputLabel.setText(labelString); //$NON-NLS-1$
	  	return inputLabel;
	  }

	  public Composite createLanguageLayout(Composite parent) {
		//createTextLabelLayout(parent, "xDSML");
	  	Label label = createTextLabelLayout(parent, "xDSML");
	  	
	  	try{
	    	URL url = FileLocator.find(
					Platform.getBundle("org.gemoc.mocc.transformations.ecl2mtl.ui"),
					new Path("icons/IconeGemocLanguage-16.png"), null);
	    	if(url!=null){
	    		Image image = ImageDescriptor.createFromURL(url).createImage();
	    	  	label.setImage(image);
	    	}
	    }catch(Exception e){
	    	System.out.print("Not image found");
	    }
	  	
	  	_languageCombo = new Combo(parent, SWT.NONE);

	  	ArrayList<String> xdsmlNames = new ArrayList<String>();
	  	IConfigurationElement[] confElements = Platform
	  			.getExtensionRegistry()
	  			.getConfigurationElementsFor(
	  					ConcurrentLanguageDefinitionExtensionPoint.GEMOC_CONCURRENT_LANGUAGE_EXTENSION_POINT);
	  	for (int i = 0; i < confElements.length; i++) {
	  		xdsmlNames.add(confElements[i].getAttribute("name"));
	  	}
	  	if (confElements.length == 0) {
	  		xdsmlNames.add("<No xdml available>");
	  	}
	  	String[] empty = {};
	  	_languageCombo.setItems(xdsmlNames.toArray(empty));
	  	
	  	
	  	_languageCombo.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				projectName = _languageCombo.getText();
				sourceFileHasChanged = true;
				if(projectName!=null){
					setPageComplete(true);
				}else{
					setPageComplete(false);
				}
			}
		});
	  	
	  	return parent;
	  }

	  public String getSelectProjectText() {
	    return selectProjectText.getText();
	  }
	}

	 
}
 