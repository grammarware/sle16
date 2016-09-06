/**
 */
package org.gemoc.bflow.bFlow;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.gemoc.bflow.bFlow.BFlowFactory
 * @model kind="package"
 * @generated
 */
public interface BFlowPackage extends EPackage
{
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "bFlow";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.gemoc.org/bflow/BFlow";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "bFlow";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	BFlowPackage eINSTANCE = org.gemoc.bflow.bFlow.impl.BFlowPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.gemoc.bflow.bFlow.impl.ModelImpl <em>Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.bflow.bFlow.impl.ModelImpl
	 * @see org.gemoc.bflow.bFlow.impl.BFlowPackageImpl#getModel()
	 * @generated
	 */
	int MODEL = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__NAME = 0;

	/**
	 * The feature id for the '<em><b>Import URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__IMPORT_URI = 1;

	/**
	 * The feature id for the '<em><b>Outputtimemodel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__OUTPUTTIMEMODEL = 2;

	/**
	 * The feature id for the '<em><b>Models</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__MODELS = 3;

	/**
	 * The feature id for the '<em><b>Bcoolflow</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__BCOOLFLOW = 4;

	/**
	 * The feature id for the '<em><b>Launchers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__LAUNCHERS = 5;

	/**
	 * The number of structural features of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link org.gemoc.bflow.bFlow.impl.modelinputImpl <em>modelinput</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.bflow.bFlow.impl.modelinputImpl
	 * @see org.gemoc.bflow.bFlow.impl.BFlowPackageImpl#getmodelinput()
	 * @generated
	 */
	int MODELINPUT = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELINPUT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Modeluri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELINPUT__MODELURI = 1;

	/**
	 * The number of structural features of the '<em>modelinput</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELINPUT_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.gemoc.bflow.bFlow.impl.FlowsImpl <em>Flows</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.bflow.bFlow.impl.FlowsImpl
	 * @see org.gemoc.bflow.bFlow.impl.BFlowPackageImpl#getFlows()
	 * @generated
	 */
	int FLOWS = 2;

	/**
	 * The feature id for the '<em><b>Oper</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOWS__OPER = 0;

	/**
	 * The feature id for the '<em><b>Params</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOWS__PARAMS = 1;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOWS__OPERATOR = 2;

	/**
	 * The number of structural features of the '<em>Flows</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOWS_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.gemoc.bflow.bFlow.impl.LauncherImpl <em>Launcher</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.bflow.bFlow.impl.LauncherImpl
	 * @see org.gemoc.bflow.bFlow.impl.BFlowPackageImpl#getLauncher()
	 * @generated
	 */
	int LAUNCHER = 3;

	/**
	 * The feature id for the '<em><b>Launcher URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAUNCHER__LAUNCHER_URI = 0;

	/**
	 * The number of structural features of the '<em>Launcher</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAUNCHER_FEATURE_COUNT = 1;


	/**
	 * Returns the meta object for class '{@link org.gemoc.bflow.bFlow.Model <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model</em>'.
	 * @see org.gemoc.bflow.bFlow.Model
	 * @generated
	 */
	EClass getModel();

	/**
	 * Returns the meta object for the attribute '{@link org.gemoc.bflow.bFlow.Model#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.gemoc.bflow.bFlow.Model#getName()
	 * @see #getModel()
	 * @generated
	 */
	EAttribute getModel_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.gemoc.bflow.bFlow.Model#getImportURI <em>Import URI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Import URI</em>'.
	 * @see org.gemoc.bflow.bFlow.Model#getImportURI()
	 * @see #getModel()
	 * @generated
	 */
	EAttribute getModel_ImportURI();

	/**
	 * Returns the meta object for the attribute '{@link org.gemoc.bflow.bFlow.Model#getOutputtimemodel <em>Outputtimemodel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Outputtimemodel</em>'.
	 * @see org.gemoc.bflow.bFlow.Model#getOutputtimemodel()
	 * @see #getModel()
	 * @generated
	 */
	EAttribute getModel_Outputtimemodel();

	/**
	 * Returns the meta object for the containment reference list '{@link org.gemoc.bflow.bFlow.Model#getModels <em>Models</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Models</em>'.
	 * @see org.gemoc.bflow.bFlow.Model#getModels()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_Models();

	/**
	 * Returns the meta object for the containment reference list '{@link org.gemoc.bflow.bFlow.Model#getBcoolflow <em>Bcoolflow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Bcoolflow</em>'.
	 * @see org.gemoc.bflow.bFlow.Model#getBcoolflow()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_Bcoolflow();

	/**
	 * Returns the meta object for the containment reference list '{@link org.gemoc.bflow.bFlow.Model#getLaunchers <em>Launchers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Launchers</em>'.
	 * @see org.gemoc.bflow.bFlow.Model#getLaunchers()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_Launchers();

	/**
	 * Returns the meta object for class '{@link org.gemoc.bflow.bFlow.modelinput <em>modelinput</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>modelinput</em>'.
	 * @see org.gemoc.bflow.bFlow.modelinput
	 * @generated
	 */
	EClass getmodelinput();

	/**
	 * Returns the meta object for the attribute '{@link org.gemoc.bflow.bFlow.modelinput#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.gemoc.bflow.bFlow.modelinput#getName()
	 * @see #getmodelinput()
	 * @generated
	 */
	EAttribute getmodelinput_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.gemoc.bflow.bFlow.modelinput#getModeluri <em>Modeluri</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Modeluri</em>'.
	 * @see org.gemoc.bflow.bFlow.modelinput#getModeluri()
	 * @see #getmodelinput()
	 * @generated
	 */
	EAttribute getmodelinput_Modeluri();

	/**
	 * Returns the meta object for class '{@link org.gemoc.bflow.bFlow.Flows <em>Flows</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Flows</em>'.
	 * @see org.gemoc.bflow.bFlow.Flows
	 * @generated
	 */
	EClass getFlows();

	/**
	 * Returns the meta object for the attribute '{@link org.gemoc.bflow.bFlow.Flows#getOper <em>Oper</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Oper</em>'.
	 * @see org.gemoc.bflow.bFlow.Flows#getOper()
	 * @see #getFlows()
	 * @generated
	 */
	EAttribute getFlows_Oper();

	/**
	 * Returns the meta object for the reference list '{@link org.gemoc.bflow.bFlow.Flows#getParams <em>Params</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Params</em>'.
	 * @see org.gemoc.bflow.bFlow.Flows#getParams()
	 * @see #getFlows()
	 * @generated
	 */
	EReference getFlows_Params();

	/**
	 * Returns the meta object for the reference '{@link org.gemoc.bflow.bFlow.Flows#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Operator</em>'.
	 * @see org.gemoc.bflow.bFlow.Flows#getOperator()
	 * @see #getFlows()
	 * @generated
	 */
	EReference getFlows_Operator();

	/**
	 * Returns the meta object for class '{@link org.gemoc.bflow.bFlow.Launcher <em>Launcher</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Launcher</em>'.
	 * @see org.gemoc.bflow.bFlow.Launcher
	 * @generated
	 */
	EClass getLauncher();

	/**
	 * Returns the meta object for the attribute '{@link org.gemoc.bflow.bFlow.Launcher#getLauncherURI <em>Launcher URI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Launcher URI</em>'.
	 * @see org.gemoc.bflow.bFlow.Launcher#getLauncherURI()
	 * @see #getLauncher()
	 * @generated
	 */
	EAttribute getLauncher_LauncherURI();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	BFlowFactory getBFlowFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals
	{
		/**
		 * The meta object literal for the '{@link org.gemoc.bflow.bFlow.impl.ModelImpl <em>Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.bflow.bFlow.impl.ModelImpl
		 * @see org.gemoc.bflow.bFlow.impl.BFlowPackageImpl#getModel()
		 * @generated
		 */
		EClass MODEL = eINSTANCE.getModel();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL__NAME = eINSTANCE.getModel_Name();

		/**
		 * The meta object literal for the '<em><b>Import URI</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL__IMPORT_URI = eINSTANCE.getModel_ImportURI();

		/**
		 * The meta object literal for the '<em><b>Outputtimemodel</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL__OUTPUTTIMEMODEL = eINSTANCE.getModel_Outputtimemodel();

		/**
		 * The meta object literal for the '<em><b>Models</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__MODELS = eINSTANCE.getModel_Models();

		/**
		 * The meta object literal for the '<em><b>Bcoolflow</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__BCOOLFLOW = eINSTANCE.getModel_Bcoolflow();

		/**
		 * The meta object literal for the '<em><b>Launchers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__LAUNCHERS = eINSTANCE.getModel_Launchers();

		/**
		 * The meta object literal for the '{@link org.gemoc.bflow.bFlow.impl.modelinputImpl <em>modelinput</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.bflow.bFlow.impl.modelinputImpl
		 * @see org.gemoc.bflow.bFlow.impl.BFlowPackageImpl#getmodelinput()
		 * @generated
		 */
		EClass MODELINPUT = eINSTANCE.getmodelinput();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODELINPUT__NAME = eINSTANCE.getmodelinput_Name();

		/**
		 * The meta object literal for the '<em><b>Modeluri</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODELINPUT__MODELURI = eINSTANCE.getmodelinput_Modeluri();

		/**
		 * The meta object literal for the '{@link org.gemoc.bflow.bFlow.impl.FlowsImpl <em>Flows</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.bflow.bFlow.impl.FlowsImpl
		 * @see org.gemoc.bflow.bFlow.impl.BFlowPackageImpl#getFlows()
		 * @generated
		 */
		EClass FLOWS = eINSTANCE.getFlows();

		/**
		 * The meta object literal for the '<em><b>Oper</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FLOWS__OPER = eINSTANCE.getFlows_Oper();

		/**
		 * The meta object literal for the '<em><b>Params</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLOWS__PARAMS = eINSTANCE.getFlows_Params();

		/**
		 * The meta object literal for the '<em><b>Operator</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLOWS__OPERATOR = eINSTANCE.getFlows_Operator();

		/**
		 * The meta object literal for the '{@link org.gemoc.bflow.bFlow.impl.LauncherImpl <em>Launcher</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.bflow.bFlow.impl.LauncherImpl
		 * @see org.gemoc.bflow.bFlow.impl.BFlowPackageImpl#getLauncher()
		 * @generated
		 */
		EClass LAUNCHER = eINSTANCE.getLauncher();

		/**
		 * The meta object literal for the '<em><b>Launcher URI</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LAUNCHER__LAUNCHER_URI = eINSTANCE.getLauncher_LauncherURI();

	}

} //BFlowPackage
