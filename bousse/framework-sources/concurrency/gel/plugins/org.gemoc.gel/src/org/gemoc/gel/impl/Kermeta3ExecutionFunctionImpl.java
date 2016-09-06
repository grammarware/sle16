/**
 */
package org.gemoc.gel.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.gemoc.gel.GelPackage;
import org.gemoc.gel.Kermeta3ExecutionFunction;
import org.gemoc.gexpressions.GExpression;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Kermeta3 Execution Function</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.gemoc.gel.impl.Kermeta3ExecutionFunctionImpl#getNavigationPathToOperation <em>Navigation Path To Operation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Kermeta3ExecutionFunctionImpl extends ExecutionFunctionImpl implements Kermeta3ExecutionFunction {
	/**
	 * The cached value of the '{@link #getNavigationPathToOperation() <em>Navigation Path To Operation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNavigationPathToOperation()
	 * @generated
	 * @ordered
	 */
	protected GExpression navigationPathToOperation;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Kermeta3ExecutionFunctionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GelPackage.Literals.KERMETA3_EXECUTION_FUNCTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GExpression getNavigationPathToOperation() {
		return navigationPathToOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNavigationPathToOperation(GExpression newNavigationPathToOperation, NotificationChain msgs) {
		GExpression oldNavigationPathToOperation = navigationPathToOperation;
		navigationPathToOperation = newNavigationPathToOperation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GelPackage.KERMETA3_EXECUTION_FUNCTION__NAVIGATION_PATH_TO_OPERATION, oldNavigationPathToOperation, newNavigationPathToOperation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNavigationPathToOperation(GExpression newNavigationPathToOperation) {
		if (newNavigationPathToOperation != navigationPathToOperation) {
			NotificationChain msgs = null;
			if (navigationPathToOperation != null)
				msgs = ((InternalEObject)navigationPathToOperation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GelPackage.KERMETA3_EXECUTION_FUNCTION__NAVIGATION_PATH_TO_OPERATION, null, msgs);
			if (newNavigationPathToOperation != null)
				msgs = ((InternalEObject)newNavigationPathToOperation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GelPackage.KERMETA3_EXECUTION_FUNCTION__NAVIGATION_PATH_TO_OPERATION, null, msgs);
			msgs = basicSetNavigationPathToOperation(newNavigationPathToOperation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GelPackage.KERMETA3_EXECUTION_FUNCTION__NAVIGATION_PATH_TO_OPERATION, newNavigationPathToOperation, newNavigationPathToOperation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GelPackage.KERMETA3_EXECUTION_FUNCTION__NAVIGATION_PATH_TO_OPERATION:
				return basicSetNavigationPathToOperation(null, msgs);
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
			case GelPackage.KERMETA3_EXECUTION_FUNCTION__NAVIGATION_PATH_TO_OPERATION:
				return getNavigationPathToOperation();
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
			case GelPackage.KERMETA3_EXECUTION_FUNCTION__NAVIGATION_PATH_TO_OPERATION:
				setNavigationPathToOperation((GExpression)newValue);
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
			case GelPackage.KERMETA3_EXECUTION_FUNCTION__NAVIGATION_PATH_TO_OPERATION:
				setNavigationPathToOperation((GExpression)null);
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
			case GelPackage.KERMETA3_EXECUTION_FUNCTION__NAVIGATION_PATH_TO_OPERATION:
				return navigationPathToOperation != null;
		}
		return super.eIsSet(featureID);
	}

} //Kermeta3ExecutionFunctionImpl
