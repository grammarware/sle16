/**
 */
package org.gemoc.gel.impl;

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
import org.gemoc.gel.FeedbackPolicy;
import org.gemoc.gel.FeedbackRule;
import org.gemoc.gel.GelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Feedback Policy</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.gemoc.gel.impl.FeedbackPolicyImpl#getRules <em>Rules</em>}</li>
 *   <li>{@link org.gemoc.gel.impl.FeedbackPolicyImpl#getDefaultRule <em>Default Rule</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FeedbackPolicyImpl extends MinimalEObjectImpl.Container implements FeedbackPolicy {
	/**
	 * The cached value of the '{@link #getRules() <em>Rules</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRules()
	 * @generated
	 * @ordered
	 */
	protected EList<FeedbackRule> rules;

	/**
	 * The cached value of the '{@link #getDefaultRule() <em>Default Rule</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultRule()
	 * @generated
	 * @ordered
	 */
	protected FeedbackRule defaultRule;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FeedbackPolicyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GelPackage.Literals.FEEDBACK_POLICY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FeedbackRule> getRules() {
		if (rules == null) {
			rules = new EObjectContainmentEList<FeedbackRule>(FeedbackRule.class, this, GelPackage.FEEDBACK_POLICY__RULES);
		}
		return rules;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeedbackRule getDefaultRule() {
		return defaultRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDefaultRule(FeedbackRule newDefaultRule, NotificationChain msgs) {
		FeedbackRule oldDefaultRule = defaultRule;
		defaultRule = newDefaultRule;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GelPackage.FEEDBACK_POLICY__DEFAULT_RULE, oldDefaultRule, newDefaultRule);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefaultRule(FeedbackRule newDefaultRule) {
		if (newDefaultRule != defaultRule) {
			NotificationChain msgs = null;
			if (defaultRule != null)
				msgs = ((InternalEObject)defaultRule).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GelPackage.FEEDBACK_POLICY__DEFAULT_RULE, null, msgs);
			if (newDefaultRule != null)
				msgs = ((InternalEObject)newDefaultRule).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GelPackage.FEEDBACK_POLICY__DEFAULT_RULE, null, msgs);
			msgs = basicSetDefaultRule(newDefaultRule, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GelPackage.FEEDBACK_POLICY__DEFAULT_RULE, newDefaultRule, newDefaultRule));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GelPackage.FEEDBACK_POLICY__RULES:
				return ((InternalEList<?>)getRules()).basicRemove(otherEnd, msgs);
			case GelPackage.FEEDBACK_POLICY__DEFAULT_RULE:
				return basicSetDefaultRule(null, msgs);
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
			case GelPackage.FEEDBACK_POLICY__RULES:
				return getRules();
			case GelPackage.FEEDBACK_POLICY__DEFAULT_RULE:
				return getDefaultRule();
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
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case GelPackage.FEEDBACK_POLICY__RULES:
				getRules().clear();
				getRules().addAll((Collection<? extends FeedbackRule>)newValue);
				return;
			case GelPackage.FEEDBACK_POLICY__DEFAULT_RULE:
				setDefaultRule((FeedbackRule)newValue);
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
			case GelPackage.FEEDBACK_POLICY__RULES:
				getRules().clear();
				return;
			case GelPackage.FEEDBACK_POLICY__DEFAULT_RULE:
				setDefaultRule((FeedbackRule)null);
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
			case GelPackage.FEEDBACK_POLICY__RULES:
				return rules != null && !rules.isEmpty();
			case GelPackage.FEEDBACK_POLICY__DEFAULT_RULE:
				return defaultRule != null;
		}
		return super.eIsSet(featureID);
	}

} //FeedbackPolicyImpl
