package org.modelexecution.xmof.gemoc.engine.ui.launcher.tabs;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.ILaunchConfigurationWorkingCopy;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.gemoc.xdsmlframework.api.extensions.engine_addon.EngineAddonSpecificationExtension;
import org.gemoc.xdsmlframework.api.extensions.engine_addon.EngineAddonSpecificationExtensionPoint;
import org.gemoc.xdsmlframework.api.extensions.engine_addon_group.EngineAddonGroupSpecificationExtension;
import org.gemoc.xdsmlframework.api.extensions.engine_addon_group.EngineAddonGroupSpecificationExtensionPoint;

public class LaunchConfigurationBackendsTab extends LaunchConfigurationTab {

	private Map<String, Button> extensionControls;

	@Override
	public void createControl(Composite parent) {
		Composite mainControl = createMainControl(parent);
		Map<String, Group> extensionGroups = createExtensionGroups(mainControl);
		extensionControls = createExtensionControls(extensionGroups,
				mainControl);
	}

	private Composite createMainControl(Composite parent) {
		Composite content = new Composite(parent, SWT.NULL);
		GridLayout gl = new GridLayout(1, false);
		gl.marginHeight = 0;
		content.setLayout(gl);
		content.layout();
		setControl(content);
		return content;
	}

	private Map<String, Group> createExtensionGroups(Composite parent) {
		Collection<EngineAddonGroupSpecificationExtension> groupExtensionSpecifications = getGroupExtensionSpecifications();
		Map<String, Group> extensionGroups = new HashMap<String, Group>();
		for (EngineAddonGroupSpecificationExtension extension : groupExtensionSpecifications) {
			extensionGroups.put(extension.getId(),
					createGroup(parent, extension.getName()));
		}
		return extensionGroups;
	}

	private Map<String, Button> createExtensionControls(
			Map<String, Group> extensionGroups, Composite parent) {
		Group toplevelGroup = createGroup(parent, "");

		Map<String, Button> extensionControls = new HashMap<String, Button>();

		Collection<EngineAddonSpecificationExtension> extensionSpecifications = getExtensionSpecifications();
		for (EngineAddonSpecificationExtension extension : extensionSpecifications) {
			Group parentGroup = toplevelGroup;
			if (extension.getAddonGroupId() != null) {
				if (extensionGroups.containsKey(extension.getAddonGroupId())) {
					parentGroup = extensionGroups.get(extension
							.getAddonGroupId());
				}
			}

			Button checkbox = createCheckButton(parentGroup,
					extension.getName());
			if (extension.getShortDescription() != null) {
				checkbox.setToolTipText(extension.getShortDescription());
			}
			// checkbox.setSelection(extension.getDefaultActivationValue());
			checkbox.addSelectionListener(new SelectionListener() {

				@Override
				public void widgetSelected(SelectionEvent e) {
					updateLaunchConfigurationDialog();
				}

				@Override
				public void widgetDefaultSelected(SelectionEvent e) {
				}
			});
			extensionControls.put(extension.getName(), checkbox);
		}

		if (toplevelGroup.getChildren().length == 0) {
			toplevelGroup.dispose();
		}
		return extensionControls;
	}

	@Override
	public void setDefaults(ILaunchConfigurationWorkingCopy configuration) {
		// TODO Auto-generated method stub

	}

	@Override
	public void initializeFrom(ILaunchConfiguration configuration) {
		for (String extension : extensionControls.keySet())
		{
			try {
				boolean value = configuration.getAttribute(extension, true);
				Button checkbox = extensionControls.get(extension);
				checkbox.setSelection(value);
			} catch (CoreException e) {
				e.printStackTrace();
			}
		}

	}

	@Override
	public void performApply(ILaunchConfigurationWorkingCopy configuration) {
		for (Entry<String, Button> entry : extensionControls.entrySet()) {
			configuration.setAttribute(entry.getKey(), entry.getValue()
					.getSelection());
		}
	}

	@Override
	public String getName() {
		return "Addons";
	}

	protected Collection<EngineAddonSpecificationExtension> getExtensionSpecifications() {
		ArrayList<EngineAddonSpecificationExtension> result = new ArrayList<EngineAddonSpecificationExtension>();
		result.addAll(EngineAddonSpecificationExtensionPoint
				.getSpecifications());
		return result;
	}

	protected Collection<EngineAddonGroupSpecificationExtension> getGroupExtensionSpecifications() {
		HashMap<String, EngineAddonGroupSpecificationExtension> result = new HashMap<String, EngineAddonGroupSpecificationExtension>();
		// ensures to get only one group for a given id
		for (Iterator<EngineAddonGroupSpecificationExtension> iterator = EngineAddonGroupSpecificationExtensionPoint
				.getSpecifications().iterator(); iterator.hasNext();) {
			EngineAddonGroupSpecificationExtension engineAddonGroupSpecificationExtension = iterator
					.next();
			result.put(engineAddonGroupSpecificationExtension.getId(),
					engineAddonGroupSpecificationExtension);
		}
		return result.values();
	}

}
