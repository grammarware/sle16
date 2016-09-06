/**
 */
package org.gemoc.bflow.bFlow.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.gemoc.bflow.bFlow.BFlowPackage;
import org.gemoc.bflow.bFlow.Flows;
import org.gemoc.bflow.bFlow.Launcher;
import org.gemoc.bflow.bFlow.Model;
import org.gemoc.bflow.bFlow.modelinput;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.gemoc.bflow.bFlow.impl.ModelImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.gemoc.bflow.bFlow.impl.ModelImpl#getImportURI <em>Import URI</em>}</li>
 *   <li>{@link org.gemoc.bflow.bFlow.impl.ModelImpl#getOutputtimemodel <em>Outputtimemodel</em>}</li>
 *   <li>{@link org.gemoc.bflow.bFlow.impl.ModelImpl#getModels <em>Models</em>}</li>
 *   <li>{@link org.gemoc.bflow.bFlow.impl.ModelImpl#getBcoolflow <em>Bcoolflow</em>}</li>
 *   <li>{@link org.gemoc.bflow.bFlow.impl.ModelImpl#getLaunchers <em>Launchers</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ModelImpl extends MinimalEObjectImpl.Container implements Model
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
	 * The default value of the '{@link #getImportURI() <em>Import URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImportURI()
	 * @generated
	 * @ordered
	 */
	protected static final String IMPORT_URI_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getImportURI() <em>Import URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImportURI()
	 * @generated
	 * @ordered
	 */
	protected String importURI = IMPORT_URI_EDEFAULT;

	/**
	 * The default value of the '{@link #getOutputtimemodel() <em>Outputtimemodel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputtimemodel()
	 * @generated
	 * @ordered
	 */
	protected static final String OUTPUTTIMEMODEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOutputtimemodel() <em>Outputtimemodel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputtimemodel()
	 * @generated
	 * @ordered
	 */
	protected String outputtimemodel = OUTPUTTIMEMODEL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getModels() <em>Models</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModels()
	 * @generated
	 * @ordered
	 */
	protected EList<modelinput> models;

	/**
	 * The cached value of the '{@link #getBcoolflow() <em>Bcoolflow</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBcoolflow()
	 * @generated
	 * @ordered
	 */
	protected EList<Flows> bcoolflow;

	/**
	 * The cached value of the '{@link #getLaunchers() <em>Launchers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLaunchers()
	 * @generated
	 * @ordered
	 */
	protected EList<Launcher> launchers;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModelImpl()
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
		return BFlowPackage.Literals.MODEL;
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
			eNotify(new ENotificationImpl(this, Notification.SET, BFlowPackage.MODEL__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getImportURI()
	{
		return importURI;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImportURI(String newImportURI)
	{
		String oldImportURI = importURI;
		importURI = newImportURI;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BFlowPackage.MODEL__IMPORT_URI, oldImportURI, importURI));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOutputtimemodel()
	{
		return outputtimemodel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutputtimemodel(String newOutputtimemodel)
	{
		String oldOutputtimemodel = outputtimemodel;
		outputtimemodel = newOutputtimemodel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BFlowPackage.MODEL__OUTPUTTIMEMODEL, oldOutputtimemodel, outputtimemodel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<modelinput> getModels()
	{
		if (models == null) {
			models = new EObjectContainmentEList<modelinput>(modelinput.class, this, BFlowPackage.MODEL__MODELS);
		}
		return models;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Flows> getBcoolflow()
	{
		if (bcoolflow == null) {
			bcoolflow = new EObjectContainmentEList<Flows>(Flows.class, this, BFlowPackage.MODEL__BCOOLFLOW);
		}
		return bcoolflow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Launcher> getLaunchers()
	{
		if (launchers == null) {
			launchers = new EObjectContainmentEList<Launcher>(Launcher.class, this, BFlowPackage.MODEL__LAUNCHERS);
		}
		return launchers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
	{
		switch (featureID) {
			case BFlowPackage.MODEL__MODELS:
				return ((InternalEList<?>)getModels()).basicRemove(otherEnd, msgs);
			case BFlowPackage.MODEL__BCOOLFLOW:
				return ((InternalEList<?>)getBcoolflow()).basicRemove(otherEnd, msgs);
			case BFlowPackage.MODEL__LAUNCHERS:
				return ((InternalEList<?>)getLaunchers()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
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
			case BFlowPackage.MODEL__NAME:
				return getName();
			case BFlowPackage.MODEL__IMPORT_URI:
				return getImportURI();
			case BFlowPackage.MODEL__OUTPUTTIMEMODEL:
				return getOutputtimemodel();
			case BFlowPackage.MODEL__MODELS:
				return getModels();
			case BFlowPackage.MODEL__BCOOLFLOW:
				return getBcoolflow();
			case BFlowPackage.MODEL__LAUNCHERS:
				return getLaunchers();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue)
	{
		switch (featureID) {
			case BFlowPackage.MODEL__NAME:
				setName((String)newValue);
				return;
			case BFlowPackage.MODEL__IMPORT_URI:
				setImportURI((String)newValue);
				return;
			case BFlowPackage.MODEL__OUTPUTTIMEMODEL:
				setOutputtimemodel((String)newValue);
				return;
			case BFlowPackage.MODEL__MODELS:
				getModels().clear();
				getModels().addAll((Collection<? extends modelinput>)newValue);
				return;
			case BFlowPackage.MODEL__BCOOLFLOW:
				getBcoolflow().clear();
				getBcoolflow().addAll((Collection<? extends Flows>)newValue);
				return;
			case BFlowPackage.MODEL__LAUNCHERS:
				getLaunchers().clear();
				getLaunchers().addAll((Collection<? extends Launcher>)newValue);
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
			case BFlowPackage.MODEL__NAME:
				setName(NAME_EDEFAULT);
				return;
			case BFlowPackage.MODEL__IMPORT_URI:
				setImportURI(IMPORT_URI_EDEFAULT);
				return;
			case BFlowPackage.MODEL__OUTPUTTIMEMODEL:
				setOutputtimemodel(OUTPUTTIMEMODEL_EDEFAULT);
				return;
			case BFlowPackage.MODEL__MODELS:
				getModels().clear();
				return;
			case BFlowPackage.MODEL__BCOOLFLOW:
				getBcoolflow().clear();
				return;
			case BFlowPackage.MODEL__LAUNCHERS:
				getLaunchers().clear();
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
			case BFlowPackage.MODEL__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case BFlowPackage.MODEL__IMPORT_URI:
				return IMPORT_URI_EDEFAULT == null ? importURI != null : !IMPORT_URI_EDEFAULT.equals(importURI);
			case BFlowPackage.MODEL__OUTPUTTIMEMODEL:
				return OUTPUTTIMEMODEL_EDEFAULT == null ? outputtimemodel != null : !OUTPUTTIMEMODEL_EDEFAULT.equals(outputtimemodel);
			case BFlowPackage.MODEL__MODELS:
				return models != null && !models.isEmpty();
			case BFlowPackage.MODEL__BCOOLFLOW:
				return bcoolflow != null && !bcoolflow.isEmpty();
			case BFlowPackage.MODEL__LAUNCHERS:
				return launchers != null && !launchers.isEmpty();
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
		result.append(", importURI: ");
		result.append(importURI);
		result.append(", outputtimemodel: ");
		result.append(outputtimemodel);
		result.append(')');
		return result.toString();
	}

} //ModelImpl
