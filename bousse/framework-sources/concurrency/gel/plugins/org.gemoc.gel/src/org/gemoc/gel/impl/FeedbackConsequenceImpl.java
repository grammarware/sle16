/**
 */
package org.gemoc.gel.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.gemoc.gel.FeedbackConsequence;
import org.gemoc.gel.GelPackage;
import org.gemoc.gexpressions.GExpression;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Feedback Consequence</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.gemoc.gel.impl.FeedbackConsequenceImpl#getNavigationPathToMoccEvent <em>Navigation Path To Mocc Event</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FeedbackConsequenceImpl extends MinimalEObjectImpl.Container implements FeedbackConsequence {
	/**
	 * The cached value of the '{@link #getNavigationPathToMoccEvent() <em>Navigation Path To Mocc Event</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNavigationPathToMoccEvent()
	 * @generated
	 * @ordered
	 */
	protected GExpression navigationPathToMoccEvent;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FeedbackConsequenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GelPackage.Literals.FEEDBACK_CONSEQUENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GExpression getNavigationPathToMoccEvent() {
		return navigationPathToMoccEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNavigationPathToMoccEvent(GExpression newNavigationPathToMoccEvent, NotificationChain msgs) {
		GExpression oldNavigationPathToMoccEvent = navigationPathToMoccEvent;
		navigationPathToMoccEvent = newNavigationPathToMoccEvent;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GelPackage.FEEDBACK_CONSEQUENCE__NAVIGATION_PATH_TO_MOCC_EVENT, oldNavigationPathToMoccEvent, newNavigationPathToMoccEvent);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNavigationPathToMoccEvent(GExpression newNavigationPathToMoccEvent) {
		if (newNavigationPathToMoccEvent != navigationPathToMoccEvent) {
			NotificationChain msgs = null;
			if (navigationPathToMoccEvent != null)
				msgs = ((InternalEObject)navigationPathToMoccEvent).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GelPackage.FEEDBACK_CONSEQUENCE__NAVIGATION_PATH_TO_MOCC_EVENT, null, msgs);
			if (newNavigationPathToMoccEvent != null)
				msgs = ((InternalEObject)newNavigationPathToMoccEvent).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GelPackage.FEEDBACK_CONSEQUENCE__NAVIGATION_PATH_TO_MOCC_EVENT, null, msgs);
			msgs = basicSetNavigationPathToMoccEvent(newNavigationPathToMoccEvent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GelPackage.FEEDBACK_CONSEQUENCE__NAVIGATION_PATH_TO_MOCC_EVENT, newNavigationPathToMoccEvent, newNavigationPathToMoccEvent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GelPackage.FEEDBACK_CONSEQUENCE__NAVIGATION_PATH_TO_MOCC_EVENT:
				return basicSetNavigationPathToMoccEvent(null, msgs);
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
			case GelPackage.FEEDBACK_CONSEQUENCE__NAVIGATION_PATH_TO_MOCC_EVENT:
				return getNavigationPathToMoccEvent();
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
			case GelPackage.FEEDBACK_CONSEQUENCE__NAVIGATION_PATH_TO_MOCC_EVENT:
				setNavigationPathToMoccEvent((GExpression)newValue);
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
			case GelPackage.FEEDBACK_CONSEQUENCE__NAVIGATION_PATH_TO_MOCC_EVENT:
				setNavigationPathToMoccEvent((GExpression)null);
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
			case GelPackage.FEEDBACK_CONSEQUENCE__NAVIGATION_PATH_TO_MOCC_EVENT:
				return navigationPathToMoccEvent != null;
		}
		return super.eIsSet(featureID);
	}

} //FeedbackConsequenceImpl
