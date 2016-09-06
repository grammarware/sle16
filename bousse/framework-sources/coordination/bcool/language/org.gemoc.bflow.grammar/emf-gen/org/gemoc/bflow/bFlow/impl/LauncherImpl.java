/**
 */
package org.gemoc.bflow.bFlow.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.gemoc.bflow.bFlow.BFlowPackage;
import org.gemoc.bflow.bFlow.Launcher;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Launcher</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.gemoc.bflow.bFlow.impl.LauncherImpl#getLauncherURI <em>Launcher URI</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LauncherImpl extends MinimalEObjectImpl.Container implements Launcher
{
	/**
	 * The default value of the '{@link #getLauncherURI() <em>Launcher URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLauncherURI()
	 * @generated
	 * @ordered
	 */
	protected static final String LAUNCHER_URI_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLauncherURI() <em>Launcher URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLauncherURI()
	 * @generated
	 * @ordered
	 */
	protected String launcherURI = LAUNCHER_URI_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LauncherImpl()
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
		return BFlowPackage.Literals.LAUNCHER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLauncherURI()
	{
		return launcherURI;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLauncherURI(String newLauncherURI)
	{
		String oldLauncherURI = launcherURI;
		launcherURI = newLauncherURI;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BFlowPackage.LAUNCHER__LAUNCHER_URI, oldLauncherURI, launcherURI));
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
			case BFlowPackage.LAUNCHER__LAUNCHER_URI:
				return getLauncherURI();
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
			case BFlowPackage.LAUNCHER__LAUNCHER_URI:
				setLauncherURI((String)newValue);
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
			case BFlowPackage.LAUNCHER__LAUNCHER_URI:
				setLauncherURI(LAUNCHER_URI_EDEFAULT);
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
			case BFlowPackage.LAUNCHER__LAUNCHER_URI:
				return LAUNCHER_URI_EDEFAULT == null ? launcherURI != null : !LAUNCHER_URI_EDEFAULT.equals(launcherURI);
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
		result.append(" (LauncherURI: ");
		result.append(launcherURI);
		result.append(')');
		return result.toString();
	}

} //LauncherImpl
