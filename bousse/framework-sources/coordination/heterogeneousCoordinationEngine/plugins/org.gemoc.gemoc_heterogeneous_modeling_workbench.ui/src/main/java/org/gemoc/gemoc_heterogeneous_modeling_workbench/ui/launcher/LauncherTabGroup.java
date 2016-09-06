package org.gemoc.gemoc_heterogeneous_modeling_workbench.ui.launcher;

import org.eclipse.debug.ui.AbstractLaunchConfigurationTabGroup;
import org.eclipse.debug.ui.CommonTab;
import org.eclipse.debug.ui.ILaunchConfigurationDialog;
import org.eclipse.debug.ui.ILaunchConfigurationTab;
import org.gemoc.gemoc_heterogeneous_modeling_workbench.ui.launcher.tabs.CoordinatedLaunchConfigurationMainTab;

public class LauncherTabGroup extends
		AbstractLaunchConfigurationTabGroup {

	public LauncherTabGroup() 
	{
	}

	@Override
	public void createTabs(ILaunchConfigurationDialog dialog, String mode) {
		ILaunchConfigurationTab[] tabs = new ILaunchConfigurationTab[] { 
				new CoordinatedLaunchConfigurationMainTab(),
//                new LaunchConfigurationConfigurationTab(),
//                new LaunchConfigurationBackendsTab(),
                new CommonTab()
		};
		setTabs(tabs);
	}

}
