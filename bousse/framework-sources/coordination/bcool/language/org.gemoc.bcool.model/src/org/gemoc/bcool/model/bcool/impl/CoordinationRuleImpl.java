/**
 */
package org.gemoc.bcool.model.bcool.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.gemoc.bcool.model.bcool.BcoolPackage;
import org.gemoc.bcool.model.bcool.CoordinationRule;
import org.gemoc.bcool.model.bcool.EventRelation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Coordination Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.gemoc.bcool.model.bcool.impl.CoordinationRuleImpl#getEventRelations <em>Event Relations</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CoordinationRuleImpl extends MinimalEObjectImpl.Container implements CoordinationRule {
	/**
	 * The cached value of the '{@link #getEventRelations() <em>Event Relations</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEventRelations()
	 * @generated
	 * @ordered
	 */
	protected EventRelation eventRelations;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CoordinationRuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BcoolPackage.Literals.COORDINATION_RULE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventRelation getEventRelations() {
		return eventRelations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEventRelations(EventRelation newEventRelations, NotificationChain msgs) {
		EventRelation oldEventRelations = eventRelations;
		eventRelations = newEventRelations;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BcoolPackage.COORDINATION_RULE__EVENT_RELATIONS, oldEventRelations, newEventRelations);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEventRelations(EventRelation newEventRelations) {
		if (newEventRelations != eventRelations) {
			NotificationChain msgs = null;
			if (eventRelations != null)
				msgs = ((InternalEObject)eventRelations).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BcoolPackage.COORDINATION_RULE__EVENT_RELATIONS, null, msgs);
			if (newEventRelations != null)
				msgs = ((InternalEObject)newEventRelations).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BcoolPackage.COORDINATION_RULE__EVENT_RELATIONS, null, msgs);
			msgs = basicSetEventRelations(newEventRelations, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BcoolPackage.COORDINATION_RULE__EVENT_RELATIONS, newEventRelations, newEventRelations));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BcoolPackage.COORDINATION_RULE__EVENT_RELATIONS:
				return basicSetEventRelations(null, msgs);
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
			case BcoolPackage.COORDINATION_RULE__EVENT_RELATIONS:
				return getEventRelations();
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
			case BcoolPackage.COORDINATION_RULE__EVENT_RELATIONS:
				setEventRelations((EventRelation)newValue);
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
			case BcoolPackage.COORDINATION_RULE__EVENT_RELATIONS:
				setEventRelations((EventRelation)null);
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
			case BcoolPackage.COORDINATION_RULE__EVENT_RELATIONS:
				return eventRelations != null;
		}
		return super.eIsSet(featureID);
	}

} //CoordinationRuleImpl
