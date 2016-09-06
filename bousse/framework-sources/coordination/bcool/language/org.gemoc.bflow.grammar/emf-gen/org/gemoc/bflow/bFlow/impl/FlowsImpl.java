/**
 */
package org.gemoc.bflow.bFlow.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.gemoc.bcool.model.bcool.BCoolCompositionRule;
import org.gemoc.bflow.bFlow.BFlowPackage;
import org.gemoc.bflow.bFlow.Flows;
import org.gemoc.bflow.bFlow.modelinput;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Flows</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.gemoc.bflow.bFlow.impl.FlowsImpl#getOper <em>Oper</em>}</li>
 *   <li>{@link org.gemoc.bflow.bFlow.impl.FlowsImpl#getParams <em>Params</em>}</li>
 *   <li>{@link org.gemoc.bflow.bFlow.impl.FlowsImpl#getOperator <em>Operator</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FlowsImpl extends MinimalEObjectImpl.Container implements Flows
{
	/**
	 * The default value of the '{@link #getOper() <em>Oper</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOper()
	 * @generated
	 * @ordered
	 */
	protected static final String OPER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOper() <em>Oper</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOper()
	 * @generated
	 * @ordered
	 */
	protected String oper = OPER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getParams() <em>Params</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParams()
	 * @generated
	 * @ordered
	 */
	protected EList<modelinput> params;

	/**
	 * The cached value of the '{@link #getOperator() <em>Operator</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperator()
	 * @generated
	 * @ordered
	 */
	protected BCoolCompositionRule operator;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FlowsImpl()
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
		return BFlowPackage.Literals.FLOWS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOper()
	{
		return oper;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOper(String newOper)
	{
		String oldOper = oper;
		oper = newOper;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BFlowPackage.FLOWS__OPER, oldOper, oper));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<modelinput> getParams()
	{
		if (params == null) {
			params = new EObjectResolvingEList<modelinput>(modelinput.class, this, BFlowPackage.FLOWS__PARAMS);
		}
		return params;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BCoolCompositionRule getOperator() {
		if (operator != null && operator.eIsProxy()) {
			InternalEObject oldOperator = (InternalEObject)operator;
			operator = (BCoolCompositionRule)eResolveProxy(oldOperator);
			if (operator != oldOperator) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BFlowPackage.FLOWS__OPERATOR, oldOperator, operator));
			}
		}
		return operator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BCoolCompositionRule basicGetOperator() {
		return operator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperator(BCoolCompositionRule newOperator) {
		BCoolCompositionRule oldOperator = operator;
		operator = newOperator;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BFlowPackage.FLOWS__OPERATOR, oldOperator, operator));
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
			case BFlowPackage.FLOWS__OPER:
				return getOper();
			case BFlowPackage.FLOWS__PARAMS:
				return getParams();
			case BFlowPackage.FLOWS__OPERATOR:
				if (resolve) return getOperator();
				return basicGetOperator();
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
			case BFlowPackage.FLOWS__OPER:
				setOper((String)newValue);
				return;
			case BFlowPackage.FLOWS__PARAMS:
				getParams().clear();
				getParams().addAll((Collection<? extends modelinput>)newValue);
				return;
			case BFlowPackage.FLOWS__OPERATOR:
				setOperator((BCoolCompositionRule)newValue);
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
			case BFlowPackage.FLOWS__OPER:
				setOper(OPER_EDEFAULT);
				return;
			case BFlowPackage.FLOWS__PARAMS:
				getParams().clear();
				return;
			case BFlowPackage.FLOWS__OPERATOR:
				setOperator((BCoolCompositionRule)null);
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
			case BFlowPackage.FLOWS__OPER:
				return OPER_EDEFAULT == null ? oper != null : !OPER_EDEFAULT.equals(oper);
			case BFlowPackage.FLOWS__PARAMS:
				return params != null && !params.isEmpty();
			case BFlowPackage.FLOWS__OPERATOR:
				return operator != null;
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
		result.append(" (oper: ");
		result.append(oper);
		result.append(')');
		return result.toString();
	}

} //FlowsImpl
