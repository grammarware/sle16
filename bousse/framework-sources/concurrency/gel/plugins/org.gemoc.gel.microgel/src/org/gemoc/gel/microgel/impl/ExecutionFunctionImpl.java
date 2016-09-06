/**
 */
package org.gemoc.gel.microgel.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.gemoc.gel.microgel.CallKind;
import org.gemoc.gel.microgel.ExecutionFunction;
import org.gemoc.gel.microgel.ExecutionFunctionResult;
import org.gemoc.gel.microgel.MicrogelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Execution Function</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.gemoc.gel.microgel.impl.ExecutionFunctionImpl#getResult <em>Result</em>}</li>
 *   <li>{@link org.gemoc.gel.microgel.impl.ExecutionFunctionImpl#getCallKind <em>Call Kind</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ExecutionFunctionImpl extends MinimalEObjectImpl.Container implements ExecutionFunction {
	/**
	 * The cached value of the '{@link #getResult() <em>Result</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResult()
	 * @generated
	 * @ordered
	 */
	protected ExecutionFunctionResult result;

	/**
	 * The default value of the '{@link #getCallKind() <em>Call Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCallKind()
	 * @generated
	 * @ordered
	 */
	protected static final CallKind CALL_KIND_EDEFAULT = CallKind.BLOCKING;
	/**
	 * The cached value of the '{@link #getCallKind() <em>Call Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCallKind()
	 * @generated
	 * @ordered
	 */
	protected CallKind callKind = CALL_KIND_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExecutionFunctionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MicrogelPackage.Literals.EXECUTION_FUNCTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExecutionFunctionResult getResult() {
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetResult(ExecutionFunctionResult newResult, NotificationChain msgs) {
		ExecutionFunctionResult oldResult = result;
		result = newResult;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MicrogelPackage.EXECUTION_FUNCTION__RESULT, oldResult, newResult);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResult(ExecutionFunctionResult newResult) {
		if (newResult != result) {
			NotificationChain msgs = null;
			if (result != null)
				msgs = ((InternalEObject)result).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MicrogelPackage.EXECUTION_FUNCTION__RESULT, null, msgs);
			if (newResult != null)
				msgs = ((InternalEObject)newResult).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MicrogelPackage.EXECUTION_FUNCTION__RESULT, null, msgs);
			msgs = basicSetResult(newResult, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MicrogelPackage.EXECUTION_FUNCTION__RESULT, newResult, newResult));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CallKind getCallKind() {
		return callKind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCallKind(CallKind newCallKind) {
		CallKind oldCallKind = callKind;
		callKind = newCallKind == null ? CALL_KIND_EDEFAULT : newCallKind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MicrogelPackage.EXECUTION_FUNCTION__CALL_KIND, oldCallKind, callKind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MicrogelPackage.EXECUTION_FUNCTION__RESULT:
				return basicSetResult(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MicrogelPackage.EXECUTION_FUNCTION__RESULT:
				return getResult();
			case MicrogelPackage.EXECUTION_FUNCTION__CALL_KIND:
				return getCallKind();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case MicrogelPackage.EXECUTION_FUNCTION__RESULT:
				setResult((ExecutionFunctionResult)newValue);
				return;
			case MicrogelPackage.EXECUTION_FUNCTION__CALL_KIND:
				setCallKind((CallKind)newValue);
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
	public void eUnset(int featureID) {
		switch (featureID) {
			case MicrogelPackage.EXECUTION_FUNCTION__RESULT:
				setResult((ExecutionFunctionResult)null);
				return;
			case MicrogelPackage.EXECUTION_FUNCTION__CALL_KIND:
				setCallKind(CALL_KIND_EDEFAULT);
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case MicrogelPackage.EXECUTION_FUNCTION__RESULT:
				return result != null;
			case MicrogelPackage.EXECUTION_FUNCTION__CALL_KIND:
				return callKind != CALL_KIND_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (callKind: ");
		result.append(callKind);
		result.append(')');
		return result.toString();
	}

} //ExecutionFunctionImpl
