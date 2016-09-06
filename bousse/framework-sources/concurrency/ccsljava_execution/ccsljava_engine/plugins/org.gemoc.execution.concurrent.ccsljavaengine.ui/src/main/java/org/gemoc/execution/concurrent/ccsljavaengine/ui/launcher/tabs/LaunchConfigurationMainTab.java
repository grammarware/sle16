package org.gemoc.execution.concurrent.ccsljavaengine.ui.launcher.tabs;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.ILaunchConfigurationWorkingCopy;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.osgi.util.NLS;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.gemoc.commons.eclipse.emf.EMFResource;
import org.gemoc.commons.eclipse.emf.URIHelper;
import org.gemoc.commons.eclipse.ui.dialogs.SelectAnyIFileDialog;
import org.gemoc.execution.concurrent.ccsljavaengine.ui.Activator;
import org.gemoc.execution.concurrent.ccsljavaengine.ui.launcher.ConcurrentRunConfiguration;
import org.gemoc.execution.concurrent.ccsljavaengine.ui.launcher.LauncherMessages;
import org.gemoc.execution.concurrent.ccsljavaxdsml.api.dsa.executors.ICodeExecutor;
import org.gemoc.execution.concurrent.ccsljavaxdsml.api.extensions.deciders.DeciderSpecificationExtension;
import org.gemoc.execution.concurrent.ccsljavaxdsml.api.extensions.deciders.DeciderSpecificationExtensionPoint;
import org.gemoc.execution.concurrent.ccsljavaxdsml.api.extensions.languages.ConcurrentLanguageDefinitionExtension;
import org.gemoc.execution.concurrent.ccsljavaxdsml.api.extensions.languages.ConcurrentLanguageDefinitionExtensionPoint;
import org.gemoc.execution.concurrent.ccsljavaengine.ui.launcher.ConcurrentRunConfiguration;
import org.gemoc.execution.concurrent.ccsljavaengine.ui.Activator;
import org.gemoc.execution.concurrent.ccsljavaengine.ui.launcher.LauncherMessages;
import org.gemoc.executionframework.engine.commons.MelangeHelper;
import org.gemoc.executionframework.engine.ui.commons.RunConfiguration;
import org.gemoc.xdsmlframework.ui.utils.dialogs.SelectAIRDIFileDialog;
import org.osgi.framework.Bundle;

import fr.obeo.dsl.debug.ide.launch.AbstractDSLLaunchConfigurationDelegate;
import fr.obeo.dsl.debug.ide.sirius.ui.launch.AbstractDSLLaunchConfigurationDelegateUI;

public class LaunchConfigurationMainTab extends LaunchConfigurationTab {

	protected Composite _parent;

	protected Text _modelLocationText;
	protected Text _modelInitializationMethodText;
	protected Text _modelInitializationArgumentsText;
	protected Text _siriusRepresentationLocationText;
	protected Button _animateButton;
	protected Text _delayText;
	protected Combo _languageCombo;
	protected Combo _deciderCombo;
	protected Button _animationFirstBreak;


	protected Text modelofexecutionglml_LocationText;

	public int GRID_DEFAULT_WIDTH = 200;

	@Override
	public void createControl(Composite parent) {
		_parent = parent;
		Composite area = new Composite(parent, SWT.NULL);
		GridLayout gl = new GridLayout(1, false);
		gl.marginHeight = 0;
		area.setLayout(gl);
		area.layout();
		setControl(area);

		Group modelArea = createGroup(area, "Model:");
		createModelLayout(modelArea, null);

		Group languageArea = createGroup(area, "Language:");
		createLanguageLayout(languageArea, null);

		Group debugArea = createGroup(area, "Animation:");
		createAnimationLayout(debugArea, null);

	

	}

	@Override
	public void setDefaults(ILaunchConfigurationWorkingCopy configuration) {
		configuration.setAttribute(RunConfiguration.LAUNCH_DELAY, 1000);
		configuration.setAttribute(ConcurrentRunConfiguration.LAUNCH_SELECTED_DECIDER,
				ConcurrentRunConfiguration.DECIDER_ASKUSER_STEP_BY_STEP);
	}

	@Override
	public void initializeFrom(ILaunchConfiguration configuration) {
		try {
			ConcurrentRunConfiguration runConfiguration = new ConcurrentRunConfiguration(configuration);
			_modelLocationText.setText(URIHelper.removePlatformScheme(runConfiguration.getExecutedModelURI()));

			if (runConfiguration.getAnimatorURI() != null)
				_siriusRepresentationLocationText.setText(URIHelper.removePlatformScheme(runConfiguration
						.getAnimatorURI()));
			else
				_siriusRepresentationLocationText.setText("");
			_delayText.setText(Integer.toString(runConfiguration.getAnimationDelay()));
			_languageCombo.setText(runConfiguration.getLanguageName());
			_deciderCombo.setText(runConfiguration.getDeciderName());
			_animationFirstBreak.setSelection(runConfiguration.getBreakStart());

			_modelInitializationArgumentsText.setText(runConfiguration.getModelInitializationArguments());

		} catch (CoreException e) {
			Activator.error(e.getMessage(), e);
		}
	}

	@Override
	public void performApply(ILaunchConfigurationWorkingCopy configuration) {
		configuration.setAttribute(AbstractDSLLaunchConfigurationDelegate.RESOURCE_URI,
				this._modelLocationText.getText());
		configuration.setAttribute(AbstractDSLLaunchConfigurationDelegateUI.SIRIUS_RESOURCE_URI,
				this._siriusRepresentationLocationText.getText());
		configuration.setAttribute(RunConfiguration.LAUNCH_DELAY, Integer.parseInt(_delayText.getText()));
		configuration.setAttribute(RunConfiguration.LAUNCH_SELECTED_LANGUAGE, this._languageCombo.getText());
		configuration.setAttribute(ConcurrentRunConfiguration.LAUNCH_SELECTED_DECIDER, this._deciderCombo.getText());
		configuration.setAttribute(RunConfiguration.LAUNCH_INITIALIZATION_METHOD,
				_modelInitializationMethodText.getText());
		configuration.setAttribute(RunConfiguration.LAUNCH_INITIALIZATION_ARGUMENTS,
				_modelInitializationArgumentsText.getText());
		configuration.setAttribute(RunConfiguration.LAUNCH_BREAK_START, _animationFirstBreak.getSelection());
	}

	@Override
	public String getName() {
		return "Main";
	}

	// -----------------------------------

	/**
	 * Basic modify listener that can be reused if there is no more precise need
	 */
	private ModifyListener fBasicModifyListener = new ModifyListener() {
		@Override
		public void modifyText(ModifyEvent arg0) {
			updateLaunchConfigurationDialog();
		}
	};

	// -----------------------------------

	/***
	 * Create the Field where user enters model to execute
	 * 
	 * @param parent
	 * @param font
	 * @return
	 */
	public Composite createModelLayout(Composite parent, Font font) {
		createTextLabelLayout(parent, "Model to execute");
		// Model location text
		_modelLocationText = new Text(parent, SWT.SINGLE | SWT.BORDER);
		_modelLocationText.setLayoutData(createStandardLayout());
		_modelLocationText.setFont(font);
		_modelLocationText.addModifyListener(fBasicModifyListener);
		Button modelLocationButton = createPushButton(parent, "Browse", null);
		modelLocationButton.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent evt) {
				// handleModelLocationButtonSelected();
				// TODO launch the appropriate selector

				SelectAnyIFileDialog dialog = new SelectAnyIFileDialog();
				if (dialog.open() == Dialog.OK) {
					String modelPath = ((IResource) dialog.getResult()[0]).getFullPath().toPortableString();
					_modelLocationText.setText(modelPath);
					updateLaunchConfigurationDialog();
				}
			}
		});
		createTextLabelLayout(parent, "Model initialization method");
		_modelInitializationMethodText = new Text(parent, SWT.SINGLE | SWT.BORDER);
		_modelInitializationMethodText.setLayoutData(createStandardLayout());
		_modelInitializationMethodText.setFont(font);
		_modelInitializationMethodText.setEditable(false);
		createTextLabelLayout(parent, "");
		createTextLabelLayout(parent, "Model initialization arguments");
		_modelInitializationArgumentsText = new Text(parent, SWT.MULTI | SWT.BORDER |  SWT.WRAP | SWT.V_SCROLL);
		GridData gridData = new GridData(GridData.FILL_BOTH);
		gridData.heightHint = 40;
		_modelInitializationArgumentsText.setLayoutData(gridData);
		//_modelInitializationArgumentsText.setLayoutData(createStandardLayout());
		_modelInitializationArgumentsText.setFont(font);
		_modelInitializationArgumentsText.setEditable(true);
		_modelInitializationArgumentsText.addModifyListener(new ModifyListener() {

			@Override
			public void modifyText(ModifyEvent e) {
				updateLaunchConfigurationDialog();
			}
		});
		createTextLabelLayout(parent, "");
		return parent;
	}

	private Composite createAnimationLayout(Composite parent, Font font) {
		createTextLabelLayout(parent, "Animator");

		_siriusRepresentationLocationText = new Text(parent, SWT.SINGLE | SWT.BORDER);
		_siriusRepresentationLocationText.setLayoutData(createStandardLayout());
		_siriusRepresentationLocationText.setFont(font);
		_siriusRepresentationLocationText.addModifyListener(fBasicModifyListener);
		Button siriusRepresentationLocationButton = createPushButton(parent, "Browse", null);
		siriusRepresentationLocationButton.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent evt) {
				// handleModelLocationButtonSelected();
				// TODO launch the appropriate selector

				SelectAIRDIFileDialog dialog = new SelectAIRDIFileDialog();
				if (dialog.open() == Dialog.OK) {
					String modelPath = ((IResource) dialog.getResult()[0]).getFullPath().toPortableString();
					_siriusRepresentationLocationText.setText(modelPath);
					updateLaunchConfigurationDialog();
				}
			}
		});

		createTextLabelLayout(parent, "Delay");
		_delayText = new Text(parent, SWT.SINGLE | SWT.BORDER);
		_delayText.setLayoutData(createStandardLayout());
		_delayText.addModifyListener(new ModifyListener() {

			@Override
			public void modifyText(ModifyEvent e) {
				updateLaunchConfigurationDialog();
			}
		});
		createTextLabelLayout(parent, "(in milliseconds)");

		createTextLabelLayout(parent, "Decider");
		_deciderCombo = new Combo(parent, SWT.BORDER);
		_deciderCombo.setLayoutData(createStandardLayout());

		ArrayList<String> deciders = new ArrayList<>();
		for (DeciderSpecificationExtension definition : DeciderSpecificationExtensionPoint.getSpecifications()) {
			deciders.add(definition.getName());
		}
		// String[] deciderChoice = {
		// RunConfiguration.DECIDER_SOLVER_PROPOSITION,
		// RunConfiguration.DECIDER_RANDOM,
		// RunConfiguration.DECIDER_ASKUSER,
		// RunConfiguration.DECIDER_ASKUSER_STEP_BY_STEP };
		String[] a = new String[deciders.size()];
		_deciderCombo.setItems(deciders.toArray(a));
		_deciderCombo.select(0);
		_deciderCombo.addModifyListener(fBasicModifyListener);

		new Label(parent, SWT.NONE).setText("");
		_animationFirstBreak = new Button(parent, SWT.CHECK);
		_animationFirstBreak.setText("Break at start");
		_animationFirstBreak.addSelectionListener(new SelectionAdapter() {

			@Override
			public void widgetSelected(SelectionEvent event) {
				updateLaunchConfigurationDialog();
			}
		}

		);

		return parent;
	}

	private GridData createStandardLayout() {
		return new GridData(SWT.FILL, SWT.CENTER, true, false);
	}

	/***
	 * Create the Field where user enters the language used to execute
	 * 
	 * @param parent
	 * @param font
	 * @return
	 */
	public Composite createLanguageLayout(Composite parent, Font font) {
		// Language
				createTextLabelLayout(parent, "Melange languages");
				_languageCombo = new Combo(parent, SWT.NONE);
				_languageCombo.setLayoutData(createStandardLayout());

				List<String> languagesNames = MelangeHelper.getAllLanguages();
				String[] empty = {};
				_languageCombo.setItems(languagesNames.toArray(empty));
				_languageCombo.addSelectionListener(new SelectionAdapter() {
					@Override
					public void widgetSelected(SelectionEvent e) {
						updateLaunchConfigurationDialog();
					}
				});
				createTextLabelLayout(parent, "");

				return parent;
	}

	

	@Override
	protected void updateLaunchConfigurationDialog() {
		super.updateLaunchConfigurationDialog();
		// modelInitializationMethod must come from the xdsml, maybe later we would allows an "expert mode" where we will allow to change it there
		ConcurrentLanguageDefinitionExtension languageDefinitionExtPoint = ConcurrentLanguageDefinitionExtensionPoint
						.findDefinition(_languageCombo.getText());
		if(languageDefinitionExtPoint != null ){
			_modelInitializationMethodText.setText(getModelInitializationMethodName(languageDefinitionExtPoint));
		}
		else {
			_modelInitializationMethodText.setText("");	
		}
		_modelInitializationArgumentsText.setEnabled(!_modelInitializationMethodText.getText().isEmpty());
		
	}
	
	protected String getModelInitializationMethodName(ConcurrentLanguageDefinitionExtension languageDefinitionExtension){
		
		ICodeExecutor codeExecutor;
		try {
			codeExecutor = languageDefinitionExtension.instanciateCodeExecutor();
		
			URI uri = URI.createPlatformResourceURI(_modelLocationText.getText(), true);
			Object caller = EMFResource.getFirstContent(uri);
			ArrayList<Object> parameters = new ArrayList<Object>();
			// try with String[] agrs
			parameters.add(new String[1]);
			List<Method> methods = codeExecutor.findCompatibleMethodsWithAnnotation(caller, parameters, fr.inria.diverse.k3.al.annotationprocessor.InitializeModel.class);
			// try with List<String>
			parameters.clear();
			parameters.add(new ArrayList<String>());
			methods.addAll(codeExecutor.findCompatibleMethodsWithAnnotation(caller, parameters, fr.inria.diverse.k3.al.annotationprocessor.InitializeModel.class));
			
			if(!methods.isEmpty()){
			
				Method selectedMethod = methods.get(0);
				return selectedMethod.getDeclaringClass().getCanonicalName()+"."+selectedMethod.getName();
				
			}
		} catch (CoreException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "";
	}
	
	/* (non-Javadoc)
	 * @see org.eclipse.debug.ui.AbstractLaunchConfigurationTab#isValid(org.eclipse.debug.core.ILaunchConfiguration)
	 */
	@Override
	public boolean isValid(ILaunchConfiguration config) {
		setErrorMessage(null);
		setMessage(null);
		IWorkspace workspace = ResourcesPlugin.getWorkspace();
		String modelName = _modelLocationText.getText().trim();
		if (modelName.length() > 0) {
			
			IResource modelIResource = workspace.getRoot().findMember(modelName);
			if (modelIResource == null || !modelIResource.exists()) {
				setErrorMessage(NLS.bind(LauncherMessages.ConcurrentMainTab_model_doesnt_exist, new String[] {modelName})); 
				return false;
			}
			if (modelName.equals("/")) {
				setErrorMessage(LauncherMessages.ConcurrentMainTab_Model_not_specified); 
				return false;
			}
			if (! (modelIResource instanceof IFile)) {
				setErrorMessage(NLS.bind(LauncherMessages.ConcurrentMainTab_invalid_model_file, new String[] {modelName})); 
				return false;
			}
		}
		if (modelName.length() == 0) {
			setErrorMessage(LauncherMessages.ConcurrentMainTab_Model_not_specified); 
			return false;
		}
		
		String languageName = _languageCombo.getText().trim();
		if (languageName.length() == 0) {
			setErrorMessage(LauncherMessages.ConcurrentMainTab_Language_not_specified); 
			return false;
		}
//		ConcurrentLanguageDefinitionExtension languageDefinitionExtPoint = ConcurrentLanguageDefinitionExtensionPoint
//				.findDefinition(languageName);
//		if(languageDefinitionExtPoint != null ){
//			try{
//				URI uri = URI.createPlatformPluginURI(languageDefinitionExtPoint.getXDSMLFilePath(), true);
//				Object o = EMFResource.getFirstContent(uri);
//				ConcurrentLanguageDefinition langDef = null;
//				if(o != null && o instanceof ConcurrentLanguageDefinition){
//					langDef = (ConcurrentLanguageDefinition)o;
//					IResource modelIResource = workspace.getRoot().findMember(modelName);
//					EList<String> recognizedFileExtensions = langDef.getFileExtensions();
//					if(recognizedFileExtensions != null && !recognizedFileExtensions.isEmpty() && !recognizedFileExtensions.contains(modelIResource.getFileExtension())){
//						String extensionListStr = String.join(", ", recognizedFileExtensions);
//						setErrorMessage(NLS.bind(LauncherMessages.ConcurrentMainTab_incompatible_model_extension_for_language, new String[] {modelIResource.getFileExtension(), languageName, extensionListStr})); 
//						return false;
//					}
//				}
//				else {
//					setErrorMessage(NLS.bind(LauncherMessages.ConcurrentMainTab_Invalid_Language_missing_xdsml, new String[] {languageName}) ); 
//					return false;
//				}
//			}
//			catch(Exception e){
//				setErrorMessage(NLS.bind(LauncherMessages.ConcurrentMainTab_Invalid_Language_missing_xdsml_with_error, new String[] {languageName, e.getMessage()}) );
//			}
//		}
//		else {
//			setErrorMessage(NLS.bind(LauncherMessages.ConcurrentMainTab_missing_language, new String[] {languageName})); 
//			return false;
//		}
		return true;
	}
}
