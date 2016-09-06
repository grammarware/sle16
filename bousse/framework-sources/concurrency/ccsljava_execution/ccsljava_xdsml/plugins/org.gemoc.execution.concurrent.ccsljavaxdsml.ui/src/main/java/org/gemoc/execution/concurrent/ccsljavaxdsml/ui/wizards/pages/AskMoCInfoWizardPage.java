package org.gemoc.execution.concurrent.ccsljavaxdsml.ui.wizards.pages;

import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.util.BidiUtils;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Text;

public class AskMoCInfoWizardPage extends WizardPage {

	// initial value stores
    public String initialTemplateMoCFileFieldValue = "my";
    
	// widgets
    Text templateMoCFileField;

    // constants
    protected static final int SIZING_TEXT_FIELD_WIDTH = 250;
    
    private Listener genericModifyListener = new Listener() {
        public void handleEvent(Event e) {
        	//setLocationForSelection();
            boolean valid = validatePage();
            setPageComplete(valid);
                
        }
    };
	
	public AskMoCInfoWizardPage(String pageName) {
		super(pageName);
	}

	
	/** (non-Javadoc)
     * Method declared on IDialogPage.
     */
    public void createControl(Composite parent) {
    	
    	Composite composite = new Composite(parent, SWT.NULL);
    	composite.setLayout(new GridLayout());
    	composite.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
    
    	createTemplateMoCFileGroup(composite);
    	
	
 //       setPageComplete(validatePage());
        // Show description on opening
//        setErrorMessage(null);
//        setMessage(null);
        setControl(composite);
        Dialog.applyDialogFont(composite);
    }
    
    /**
     * @param parent the parent composite
     */
    private final void createTemplateMoCFileGroup(Composite parent) {
        // project specification group
        Composite templateMoCFileGroup = new Composite(parent, SWT.NONE);
        GridLayout layout = new GridLayout();
        layout.numColumns = 2;
        templateMoCFileGroup.setLayout(layout);
        templateMoCFileGroup.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));

        // root container label
        Label label = new Label(templateMoCFileGroup, SWT.NONE);
        label.setText("new MoCC file base name");
        label.setFont(parent.getFont());

        // new project name entry field
        templateMoCFileField = new Text(templateMoCFileGroup, SWT.BORDER);
        GridData data = new GridData(GridData.FILL_HORIZONTAL);
        data.widthHint = SIZING_TEXT_FIELD_WIDTH;
        templateMoCFileField.setLayoutData(data);
        templateMoCFileField.setFont(parent.getFont());

        // Set the initial value first before listener
        // to avoid handling an event during the creation.
        if (initialTemplateMoCFileFieldValue != null) {
        	templateMoCFileField.setText(initialTemplateMoCFileFieldValue);
		}
        templateMoCFileField.addListener(SWT.Modify, genericModifyListener);
        BidiUtils.applyBidiProcessing(templateMoCFileField, BidiUtils.BTD_DEFAULT);
                
    }
    
   
    public String getTemplateMoCFileNameFile(){
    	return templateMoCFileField.getText();
    }
    
    protected boolean validatePage() {
    	boolean result = true;//
    	if(result){
    		// TODO check that the rootModelelement exists in the ecore file
    	}
    	return result;
    }
}
