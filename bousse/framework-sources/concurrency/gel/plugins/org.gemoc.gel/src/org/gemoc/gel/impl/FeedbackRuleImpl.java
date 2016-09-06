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
import org.gemoc.gel.FeedbackFilter;
import org.gemoc.gel.FeedbackRule;
import org.gemoc.gel.GelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Feedback Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.gemoc.gel.impl.FeedbackRuleImpl#getFilter <em>Filter</em>}</li>
 *   <li>{@link org.gemoc.gel.impl.FeedbackRuleImpl#getConsequence <em>Consequence</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FeedbackRuleImpl extends MinimalEObjectImpl.Container implements FeedbackRule {
	/**
	 * The cached value of the '{@link #getFilter() <em>Filter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFilter()
	 * @generated
	 * @ordered
	 */
	protected FeedbackFilter filter;

	/**
	 * The cached value of the '{@link #getConsequence() <em>Consequence</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsequence()
	 * @generated
	 * @ordered
	 */
	protected FeedbackConsequence consequence;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FeedbackRuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GelPackage.Literals.FEEDBACK_RULE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeedbackFilter getFilter() {
		return filter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFilter(FeedbackFilter newFilter, NotificationChain msgs) {
		FeedbackFilter oldFilter = filter;
		filter = newFilter;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GelPackage.FEEDBACK_RULE__FILTER, oldFilter, newFilter);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFilter(FeedbackFilter newFilter) {
		if (newFilter != filter) {
			NotificationChain msgs = null;
			if (filter != null)
				msgs = ((InternalEObject)filter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GelPackage.FEEDBACK_RULE__FILTER, null, msgs);
			if (newFilter != null)
				msgs = ((InternalEObject)newFilter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GelPackage.FEEDBACK_RULE__FILTER, null, msgs);
			msgs = basicSetFilter(newFilter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GelPackage.FEEDBACK_RULE__FILTER, newFilter, newFilter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeedbackConsequence getConsequence() {
		return consequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConsequence(FeedbackConsequence newConsequence, NotificationChain msgs) {
		FeedbackConsequence oldConsequence = consequence;
		consequence = newConsequence;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GelPackage.FEEDBACK_RULE__CONSEQUENCE, oldConsequence, newConsequence);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConsequence(FeedbackConsequence newConsequence) {
		if (newConsequence != consequence) {
			NotificationChain msgs = null;
			if (consequence != null)
				msgs = ((InternalEObject)consequence).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GelPackage.FEEDBACK_RULE__CONSEQUENCE, null, msgs);
			if (newConsequence != null)
				msgs = ((InternalEObject)newConsequence).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GelPackage.FEEDBACK_RULE__CONSEQUENCE, null, msgs);
			msgs = basicSetConsequence(newConsequence, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GelPackage.FEEDBACK_RULE__CONSEQUENCE, newConsequence, newConsequence));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GelPackage.FEEDBACK_RULE__FILTER:
				return basicSetFilter(null, msgs);
			case GelPackage.FEEDBACK_RULE__CONSEQUENCE:
				return basicSetConsequence(null, msgs);
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
			case GelPackage.FEEDBACK_RULE__FILTER:
				return getFilter();
			case GelPackage.FEEDBACK_RULE__CONSEQUENCE:
				return getConsequence();
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
			case GelPackage.FEEDBACK_RULE__FILTER:
				setFilter((FeedbackFilter)newValue);
				return;
			case GelPackage.FEEDBACK_RULE__CONSEQUENCE:
				setConsequence((FeedbackConsequence)newValue);
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
			case GelPackage.FEEDBACK_RULE__FILTER:
				setFilter((FeedbackFilter)null);
				return;
			case GelPackage.FEEDBACK_RULE__CONSEQUENCE:
				setConsequence((FeedbackConsequence)null);
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
			case GelPackage.FEEDBACK_RULE__FILTER:
				return filter != null;
			case GelPackage.FEEDBACK_RULE__CONSEQUENCE:
				return consequence != null;
		}
		return super.eIsSet(featureID);
	}

} //FeedbackRuleImpl
