/**
 */
package org.gemoc.bflow.bFlow.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.gemoc.bflow.bFlow.BFlowPackage;
import org.gemoc.bflow.bFlow.modelinput;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>modelinput</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.gemoc.bflow.bFlow.impl.modelinputImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.gemoc.bflow.bFlow.impl.modelinputImpl#getModeluri <em>Modeluri</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class modelinputImpl extends MinimalEObjectImpl.Container implements modelinput
{
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getModeluri() <em>Modeluri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModeluri()
	 * @generated
	 * @ordered
	 */
	protected static final String MODELURI_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getModeluri() <em>Modeluri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModeluri()
	 * @generated
	 * @ordered
	 */
	protected String modeluri = MODELURI_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected modelinputImpl()
	{
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass()
	{
		return BFlowPackage.Literals.MODELINPUT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName()
	{
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName)
	{
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BFlowPackage.MODELINPUT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getModeluri()
	{
		return modeluri;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModeluri(String newModeluri)
	{
		String oldModeluri = modeluri;
		modeluri = newModeluri;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BFlowPackage.MODELINPUT__MODELURI, oldModeluri, modeluri));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType)
	{
		switch (featureID) {
			case BFlowPackage.MODELINPUT__NAME:
				return getName();
			case BFlowPackage.MODELINPUT__MODELURI:
				return getModeluri();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue)
	{
		switch (featureID) {
			case BFlowPackage.MODELINPUT__NAME:
				setName((String)newValue);
				return;
			case BFlowPackage.MODELINPUT__MODELURI:
				setModeluri((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID)
	{
		switch (featureID) {
			case BFlowPackage.MODELINPUT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case BFlowPackage.MODELINPUT__MODELURI:
				setModeluri(MODELURI_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID)
	{
		switch (featureID) {
			case BFlowPackage.MODELINPUT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case BFlowPackage.MODELINPUT__MODELURI:
				return MODELURI_EDEFAULT == null ? modeluri != null : !MODELURI_EDEFAULT.equals(modeluri);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString()
	{
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", modeluri: ");
		result.append(modeluri);
		result.append(')');
		return result.toString();
	}

} //modelinputImpl
