package org.gemoc.execution.concurrent.ccsljavaxdsml.concurrent_xdsml.presentation;

import org.eclipse.emf.common.notify.Notification;
import org.gemoc.executionframework.xdsml_base.AnimatorProject;
import org.gemoc.executionframework.xdsml_base.DomainModelProject;
import org.gemoc.executionframework.xdsml_base.EditorProject;
import org.gemoc.executionframework.xdsml_base.SiriusAnimatorProject;
import org.gemoc.executionframework.xdsml_base.SiriusEditorProject;
import org.gemoc.executionframework.xdsml_base.XTextEditorProject;
import org.gemoc.execution.concurrent.ccsljavaxdsml.concurrent_xdsml.ConcurrentLanguageDefinition;
import org.gemoc.execution.concurrent.ccsljavaxdsml.concurrent_xdsml.DSAProject;
import org.gemoc.execution.concurrent.ccsljavaxdsml.concurrent_xdsml.DSEProject;
import org.gemoc.execution.concurrent.ccsljavaxdsml.concurrent_xdsml.MoCCProject;

/**
   * receive EMF notifications and call the appropriate firePropertyChange for the corresponding property
   * @author dvojtise
   *
   */
  class EMFEContent extends org.eclipse.emf.ecore.util.EContentAdapter{
	/**
	 * 
	 */
	private final XDSMLModelWrapper xdsmlModelWrapper;
	/**
	 * @param xdsmlModelWrapper
	 */
	EMFEContent(XDSMLModelWrapper xdsmlModelWrapper) {
		this.xdsmlModelWrapper = xdsmlModelWrapper;
	}

		//override the notifyChanged method
	    public void notifyChanged(Notification n){
	        
	        super.notifyChanged(n); // the superclass handles adding/removing this Adapter to new Books
	        
	        // find out the type of the notifier which could be either 'LanguageDefinition' or 'Library'
	        Object notifier = n.getNotifier();
	        if (notifier instanceof ConcurrentLanguageDefinition) {
	            handleLanguageDefinitionNotification(n);
	        } else if (notifier instanceof DomainModelProject) {
	            handleDomainModelProjectNotification(n);
	        } else if (notifier instanceof XTextEditorProject) {
	        	handleXTextProjectNotification(n);
	        } else if (notifier instanceof SiriusEditorProject) {
	        	handleSiriusEditorProjectNotification(n);
	        } else if (notifier instanceof SiriusAnimatorProject) {
	        	handleSiriusAnimatorProjectNotification(n);
	        } else if (notifier instanceof MoCCProject) {
	            handleMoCProjectNotification(n);
	        } else if (notifier instanceof DSAProject) {
	            handleDSAProjectNotification(n);
	        } else if (notifier instanceof DSEProject) {
	            handleDSEProjectNotification(n);
	        }
	        
	        
	    }

		private void handleLanguageDefinitionNotification(Notification n) {
			int featureID = n.getFeatureID(org.gemoc.execution.concurrent.ccsljavaxdsml.concurrent_xdsml.ConcurrentLanguageDefinition.class);
	        if (featureID == org.gemoc.execution.concurrent.ccsljavaxdsml.concurrent_xdsml.Concurrent_xdsmlPackage.CONCURRENT_LANGUAGE_DEFINITION__NAME){
	        		String oldLanguageName = n.getOldStringValue();
	        		String newLanguageName = n.getNewStringValue();
	                this.xdsmlModelWrapper.firePropertyChange("languageName", oldLanguageName, newLanguageName);
	        }
		}
		private void handleDomainModelProjectNotification(Notification n) {
			int featureID = n.getFeatureID(DomainModelProject.class);
	        if (featureID == org.gemoc.executionframework.xdsml_base.Xdsml_basePackage.DOMAIN_MODEL_PROJECT__PROJECT_NAME){
	        		String oldValue = n.getOldStringValue();
	        		String newValue = n.getNewStringValue();
	                this.xdsmlModelWrapper.firePropertyChange("domainModelProjectName", oldValue, newValue);
	        }
	        if (featureID == org.gemoc.executionframework.xdsml_base.Xdsml_basePackage.DOMAIN_MODEL_PROJECT__GENMODELURI){
        		String oldValue = n.getOldStringValue();
        		String newValue = n.getNewStringValue();
                this.xdsmlModelWrapper.firePropertyChange("genmodelLocationURI", oldValue, newValue);
	        }
	        if (featureID == org.gemoc.executionframework.xdsml_base.Xdsml_basePackage.DOMAIN_MODEL_PROJECT__DEFAULT_ROOT_EOBJECT_QUALIFIED_NAME){
        		String oldValue = n.getOldStringValue();
        		String newValue = n.getNewStringValue();
                this.xdsmlModelWrapper.firePropertyChange("rootContainerModelElement", oldValue, newValue);
	        }

	        if (featureID == org.gemoc.executionframework.xdsml_base.Xdsml_basePackage.DOMAIN_MODEL_PROJECT__MODEL_LOADER_CLASS){
        		String oldValue = n.getOldStringValue();
        		String newValue = n.getNewStringValue();
                this.xdsmlModelWrapper.firePropertyChange("modelLoaderClass", oldValue, newValue);
	        }
		}
		

		private void handleXTextProjectNotification(Notification n) {
			int featureID = n.getFeatureID(XTextEditorProject.class);
	        if (featureID == org.gemoc.executionframework.xdsml_base.Xdsml_basePackage.XTEXT_EDITOR_PROJECT__PROJECT_NAME){
	        		String oldValue = n.getOldStringValue();
	        		String newValue = n.getNewStringValue();
	                this.xdsmlModelWrapper.firePropertyChange("XTextEditorProjectName", oldValue, newValue);
	        }
		}
		private void handleSiriusEditorProjectNotification(Notification n) {
			int featureID = n.getFeatureID(EditorProject.class);
	        if (featureID == org.gemoc.executionframework.xdsml_base.Xdsml_basePackage.SIRIUS_EDITOR_PROJECT__PROJECT_NAME){
	        		String oldValue = n.getOldStringValue();
	        		String newValue = n.getNewStringValue();
	                this.xdsmlModelWrapper.firePropertyChange("siriusEditorProjectName", oldValue, newValue);
	        }
		}
		private void handleSiriusAnimatorProjectNotification(Notification n) {
			int featureID = n.getFeatureID(AnimatorProject.class);
	        if (featureID == org.gemoc.executionframework.xdsml_base.Xdsml_basePackage.SIRIUS_ANIMATOR_PROJECT__PROJECT_NAME){
	        		String oldValue = n.getOldStringValue();
	        		String newValue = n.getNewStringValue();
	                this.xdsmlModelWrapper.firePropertyChange("siriusAnimatorProjectName", oldValue, newValue);
	        }
		}
		private void handleMoCProjectNotification(Notification n) {
			int featureID = n.getFeatureID(org.gemoc.execution.concurrent.ccsljavaxdsml.concurrent_xdsml.MoCCProject.class);
	        if (featureID == org.gemoc.execution.concurrent.ccsljavaxdsml.concurrent_xdsml.Concurrent_xdsmlPackage.MO_CC_PROJECT__PROJECT_NAME){
	        		String oldValue = n.getOldStringValue();
	        		String newValue = n.getNewStringValue();
	                this.xdsmlModelWrapper.firePropertyChange("moCCProjectName", oldValue, newValue);
	        }
		}
		private void handleDSAProjectNotification(Notification n) {
			int featureID = n.getFeatureID(org.gemoc.execution.concurrent.ccsljavaxdsml.concurrent_xdsml.DSAProject.class);
	        if (featureID == org.gemoc.execution.concurrent.ccsljavaxdsml.concurrent_xdsml.Concurrent_xdsmlPackage.DSA_PROJECT__PROJECT_NAME){
	        		String oldValue = n.getOldStringValue();
	        		String newValue = n.getNewStringValue();
	                this.xdsmlModelWrapper.firePropertyChange("DSAProjectName", oldValue, newValue);
	        }
	        if (featureID == org.gemoc.execution.concurrent.ccsljavaxdsml.concurrent_xdsml.Concurrent_xdsmlPackage.DSA_PROJECT__CODE_EXECUTOR_CLASS){
        		String oldValue = n.getOldStringValue();
        		String newValue = n.getNewStringValue();
                this.xdsmlModelWrapper.firePropertyChange("codeExecutorClass", oldValue, newValue);
        }
		}
		private void handleDSEProjectNotification(Notification n) {
			int featureID = n.getFeatureID(org.gemoc.execution.concurrent.ccsljavaxdsml.concurrent_xdsml.DSEProject.class);
	        if (featureID == org.gemoc.execution.concurrent.ccsljavaxdsml.concurrent_xdsml.Concurrent_xdsmlPackage.DSE_PROJECT__PROJECT_NAME){
	        		String oldValue = n.getOldStringValue();
	        		String newValue = n.getNewStringValue();
	                this.xdsmlModelWrapper.firePropertyChange("DSEProjectName", oldValue, newValue);
	        }
	        if (featureID == org.gemoc.execution.concurrent.ccsljavaxdsml.concurrent_xdsml.Concurrent_xdsmlPackage.DSE_PROJECT__QVTO_URI){
        		String oldValue = n.getOldStringValue();
        		String newValue = n.getNewStringValue();
                this.xdsmlModelWrapper.firePropertyChange("qvtoURI", oldValue, newValue);
        }
		}
  }