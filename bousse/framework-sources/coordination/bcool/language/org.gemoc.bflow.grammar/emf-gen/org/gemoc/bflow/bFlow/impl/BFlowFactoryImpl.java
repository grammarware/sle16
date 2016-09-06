/**
 */
package org.gemoc.bflow.bFlow.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.gemoc.bflow.bFlow.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class BFlowFactoryImpl extends EFactoryImpl implements BFlowFactory
{
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static BFlowFactory init()
	{
		try {
			BFlowFactory theBFlowFactory = (BFlowFactory)EPackage.Registry.INSTANCE.getEFactory(BFlowPackage.eNS_URI);
			if (theBFlowFactory != null) {
				return theBFlowFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new BFlowFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BFlowFactoryImpl()
	{
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass)
	{
		switch (eClass.getClassifierID()) {
			case BFlowPackage.MODEL: return createModel();
			case BFlowPackage.MODELINPUT: return createmodelinput();
			case BFlowPackage.FLOWS: return createFlows();
			case BFlowPackage.LAUNCHER: return createLauncher();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Model createModel()
	{
		ModelImpl model = new ModelImpl();
		return model;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public modelinput createmodelinput()
	{
		modelinputImpl modelinput = new modelinputImpl();
		return modelinput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Flows createFlows()
	{
		FlowsImpl flows = new FlowsImpl();
		return flows;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Launcher createLauncher()
	{
		LauncherImpl launcher = new LauncherImpl();
		return launcher;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BFlowPackage getBFlowPackage()
	{
		return (BFlowPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static BFlowPackage getPackage()
	{
		return BFlowPackage.eINSTANCE;
	}

} //BFlowFactoryImpl
