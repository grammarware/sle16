package org.modelexecution.xmof.gemoc.engine.ui.launcher.tabs;

import java.util.List;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.ILaunchConfigurationWorkingCopy;
import org.eclipse.jface.dialogs.Dialog;
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
import org.gemoc.commons.eclipse.emf.URIHelper;
import org.gemoc.commons.eclipse.ui.dialogs.SelectAnyIFileDialog;
import org.gemoc.executionframework.engine.commons.MelangeHelper;
import org.gemoc.xdsmlframework.ui.utils.dialogs.SelectAIRDIFileDialog;
import org.modelexecution.xmof.gemoc.engine.ui.Activator;
import org.modelexecution.xmof.gemoc.engine.ui.commons.RunConfiguration;

import fr.obeo.dsl.debug.ide.launch.AbstractDSLLaunchConfigurationDelegate;
import fr.obeo.dsl.debug.ide.sirius.ui.launch.AbstractDSLLaunchConfigurationDelegateUI;

public class LaunchConfigurationMainTab extends LaunchConfigurationTab {

	protected Composite parent;

	protected Text modelLocationText;
	protected Text modelInitializationModelText;
	protected Text siriusRepresentationLocationText;
	protected Button animateButton;
	protected Text delayText;
	protected Button animationFirstBreak;

	protected Button nodewiseStepping;
	protected Button ignoreSteps;

	protected Combo languageCombo;

	protected Text modelofexecutionglml_LocationText;

	public int GRID_DEFAULT_WIDTH = 200;

	protected IProject modelProject;

	@Override
	public void createControl(Composite parent) {
		this.parent = parent;
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
		configuration.setAttribute(RunConfiguration.LAUNCH_MODEL_ENTRY_POINT,
				"");
		configuration.setAttribute(RunConfiguration.LAUNCH_METHOD_ENTRY_POINT,
				"");
		configuration.setAttribute(RunConfiguration.LAUNCH_SELECTED_LANGUAGE,
				"");

	}

	@Override
	public void initializeFrom(ILaunchConfiguration configuration) {
		try {
			RunConfiguration runConfiguration = new RunConfiguration(
					configuration);
			modelLocationText.setText(URIHelper
					.removePlatformScheme(runConfiguration
							.getExecutedModelURI()));

			if (runConfiguration.getAnimatorURI() != null)
				siriusRepresentationLocationText
						.setText(URIHelper
								.removePlatformScheme(runConfiguration
										.getAnimatorURI()));
			else
				siriusRepresentationLocationText.setText("");

			delayText.setText(Integer.toString(runConfiguration
					.getAnimationDelay()));
			animationFirstBreak.setSelection(runConfiguration.getBreakStart());

			nodewiseStepping.setSelection(runConfiguration
					.getNodewiseStepping());

			ignoreSteps.setSelection(runConfiguration.getIgnoreSteps());

			languageCombo.setText(runConfiguration.getLanguageName());

			modelInitializationModelText.setText(runConfiguration
					.getModelInitializationModel());

		} catch (CoreException e) {
			Activator.error(e.getMessage(), e);
		}

	}

	@Override
	public void performApply(ILaunchConfigurationWorkingCopy configuration) {
		configuration.setAttribute(
				AbstractDSLLaunchConfigurationDelegate.RESOURCE_URI,
				this.modelLocationText.getText());
		configuration.setAttribute(
				AbstractDSLLaunchConfigurationDelegateUI.SIRIUS_RESOURCE_URI,
				this.siriusRepresentationLocationText.getText());
		configuration.setAttribute(RunConfiguration.LAUNCH_DELAY,
				Integer.parseInt(delayText.getText()));
		configuration.setAttribute(RunConfiguration.LAUNCH_SELECTED_LANGUAGE,
				languageCombo.getText());
		configuration.setAttribute(
				RunConfiguration.LAUNCH_INITIALIZATION_MODEL,
				modelInitializationModelText.getText());

		configuration.setAttribute(RunConfiguration.LAUNCH_BREAK_START,
				animationFirstBreak.getSelection());

		configuration.setAttribute(RunConfiguration.LAUNCH_NODEWISE_STEP,
				nodewiseStepping.getSelection());

		configuration.setAttribute(RunConfiguration.LAUNCH_IGNORE_STEPS,
				ignoreSteps.getSelection());
	}

	@Override
	public String getName() {
		return "Main";
	}

	private ModifyListener fBasicModifyListener = new ModifyListener() {
		@Override
		public void modifyText(ModifyEvent arg0) {
			updateLaunchConfigurationDialog();
		}
	};

	public Composite createModelLayout(Composite parent, Font font) {
		createTextLabelLayout(parent, "Model to execute");
		// Model location text
		modelLocationText = new Text(parent, SWT.SINGLE | SWT.BORDER);
		modelLocationText.setLayoutData(createStandardLayout());
		modelLocationText.setFont(font);
		modelLocationText.addModifyListener(fBasicModifyListener);
		Button modelLocationButton = createPushButton(parent, "Browse", null);
		modelLocationButton.addSelectionListener(new SelectionAdapter() {

			public void widgetSelected(SelectionEvent evt) {
				// handleModelLocationButtonSelected();
				// TODO launch the appropriate selector

				SelectAnyIFileDialog dialog = new SelectAnyIFileDialog();
				if (dialog.open() == Dialog.OK) {
					String modelPath = ((IResource) dialog.getResult()[0])
							.getFullPath().toPortableString();
					modelLocationText.setText(modelPath);
					updateLaunchConfigurationDialog();
					modelProject = ((IResource) dialog.getResult()[0])
							.getProject();
				}
			}
		});
		createTextLabelLayout(parent, "Initialization model");
		modelInitializationModelText = new Text(parent, SWT.SINGLE | SWT.BORDER);
		modelInitializationModelText.setLayoutData(createStandardLayout());
		modelInitializationModelText.setFont(font);
		modelInitializationModelText.addModifyListener(fBasicModifyListener);
		Button initmodelLocationButton = createPushButton(parent, "Browse",
				null);
		initmodelLocationButton.addSelectionListener(new SelectionAdapter() {

			public void widgetSelected(SelectionEvent evt) {
				// handleModelLocationButtonSelected();
				// TODO launch the appropriate selector

				SelectAnyIFileDialog dialog = new SelectAnyIFileDialog();
				if (dialog.open() == Dialog.OK) {
					String modelPath = ((IResource) dialog.getResult()[0])
							.getFullPath().toPortableString();
					modelInitializationModelText.setText(modelPath);
					updateLaunchConfigurationDialog();
					// modelProject = ((IResource)
					// dialog.getResult()[0]).getProject();
				}
			}
		});
		createTextLabelLayout(parent, "");

		nodewiseStepping = new Button(parent, SWT.CHECK);
		nodewiseStepping.setText("Node-wise execution steps");
		nodewiseStepping.addSelectionListener(new SelectionAdapter() {

			@Override
			public void widgetSelected(SelectionEvent event) {
				updateLaunchConfigurationDialog();
			}
		}

		);

		createTextLabelLayout(parent, "");
		createTextLabelLayout(parent, "");
		ignoreSteps = new Button(parent, SWT.CHECK);
		ignoreSteps.setText("Ignore step annotations");
		ignoreSteps.addSelectionListener(new SelectionAdapter() {

			@Override
			public void widgetSelected(SelectionEvent event) {
				updateLaunchConfigurationDialog();
			}
		}

		);

		return parent;
	}

	private Composite createAnimationLayout(Composite parent, Font font) {
		createTextLabelLayout(parent, "Animator");

		siriusRepresentationLocationText = new Text(parent, SWT.SINGLE
				| SWT.BORDER);
		siriusRepresentationLocationText.setLayoutData(createStandardLayout());
		siriusRepresentationLocationText.setFont(font);
		siriusRepresentationLocationText
				.addModifyListener(fBasicModifyListener);
		Button siriusRepresentationLocationButton = createPushButton(parent,
				"Browse", null);
		siriusRepresentationLocationButton
				.addSelectionListener(new SelectionAdapter() {
					public void widgetSelected(SelectionEvent evt) {
						// handleModelLocationButtonSelected();
						// TODO launch the appropriate selector

						SelectAIRDIFileDialog dialog = new SelectAIRDIFileDialog();
						if (dialog.open() == Dialog.OK) {
							String modelPath = ((IResource) dialog.getResult()[0])
									.getFullPath().toPortableString();
							siriusRepresentationLocationText.setText(modelPath);
							updateLaunchConfigurationDialog();
						}
					}
				});

		createTextLabelLayout(parent, "Delay");
		delayText = new Text(parent, SWT.SINGLE | SWT.BORDER);
		delayText.setLayoutData(createStandardLayout());
		delayText.addModifyListener(new ModifyListener() {

			@Override
			public void modifyText(ModifyEvent e) {
				updateLaunchConfigurationDialog();
			}
		});
		createTextLabelLayout(parent, "(in milliseconds)");

		new Label(parent, SWT.NONE).setText("");
		animationFirstBreak = new Button(parent, SWT.CHECK);
		animationFirstBreak.setText("Break at start");
		animationFirstBreak.addSelectionListener(new SelectionAdapter() {

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
		languageCombo = new Combo(parent, SWT.NONE);
		languageCombo.setLayoutData(createStandardLayout());

		List<String> languagesNames = MelangeHelper.getAllLanguages();
		String[] empty = {};
		languageCombo.setItems(languagesNames.toArray(empty));
		languageCombo.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				// String selection = _languageCombo.getText();
				// List<String> modelTypeNames =
				// MelangeHelper.getModelTypes(selection);
				updateLaunchConfigurationDialog();
			}
		});
		createTextLabelLayout(parent, "");
		return parent;
	}

}
