/**
 */
package org.gemoc.bcool.model.bcool.impl;

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
import org.gemoc.bcool.model.bcool.BcoolPackage;
import org.gemoc.bcool.model.bcool.EventExpression;
import org.gemoc.bcool.model.bcool.MatchingRule;
import org.gemoc.gexpressions.GExpression;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Matching Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.gemoc.bcool.model.bcool.impl.MatchingRuleImpl#getFilterEventExpressions <em>Filter Event Expressions</em>}</li>
 *   <li>{@link org.gemoc.bcool.model.bcool.impl.MatchingRuleImpl#getCondition <em>Condition</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MatchingRuleImpl extends MinimalEObjectImpl.Container implements MatchingRule {
	/**
	 * The cached value of the '{@link #getFilterEventExpressions() <em>Filter Event Expressions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFilterEventExpressions()
	 * @generated
	 * @ordered
	 */
	protected EList<EventExpression> filterEventExpressions;

	/**
	 * The cached value of the '{@link #getCondition() <em>Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCondition()
	 * @generated
	 * @ordered
	 */
	protected GExpression condition;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MatchingRuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BcoolPackage.Literals.MATCHING_RULE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EventExpression> getFilterEventExpressions() {
		if (filterEventExpressions == null) {
			filterEventExpressions = new EObjectContainmentEList<EventExpression>(EventExpression.class, this, BcoolPackage.MATCHING_RULE__FILTER_EVENT_EXPRESSIONS);
		}
		return filterEventExpressions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GExpression getCondition() {
		return condition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCondition(GExpression newCondition, NotificationChain msgs) {
		GExpression oldCondition = condition;
		condition = newCondition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BcoolPackage.MATCHING_RULE__CONDITION, oldCondition, newCondition);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCondition(GExpression newCondition) {
		if (newCondition != condition) {
			NotificationChain msgs = null;
			if (condition != null)
				msgs = ((InternalEObject)condition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BcoolPackage.MATCHING_RULE__CONDITION, null, msgs);
			if (newCondition != null)
				msgs = ((InternalEObject)newCondition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BcoolPackage.MATCHING_RULE__CONDITION, null, msgs);
			msgs = basicSetCondition(newCondition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BcoolPackage.MATCHING_RULE__CONDITION, newCondition, newCondition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BcoolPackage.MATCHING_RULE__FILTER_EVENT_EXPRESSIONS:
				return ((InternalEList<?>)getFilterEventExpressions()).basicRemove(otherEnd, msgs);
			case BcoolPackage.MATCHING_RULE__CONDITION:
				return basicSetCondition(null, msgs);
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
			case BcoolPackage.MATCHING_RULE__FILTER_EVENT_EXPRESSIONS:
				return getFilterEventExpressions();
			case BcoolPackage.MATCHING_RULE__CONDITION:
				return getCondition();
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
			case BcoolPackage.MATCHING_RULE__FILTER_EVENT_EXPRESSIONS:
				getFilterEventExpressions().clear();
				getFilterEventExpressions().addAll((Collection<? extends EventExpression>)newValue);
				return;
			case BcoolPackage.MATCHING_RULE__CONDITION:
				setCondition((GExpression)newValue);
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
			case BcoolPackage.MATCHING_RULE__FILTER_EVENT_EXPRESSIONS:
				getFilterEventExpressions().clear();
				return;
			case BcoolPackage.MATCHING_RULE__CONDITION:
				setCondition((GExpression)null);
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
			case BcoolPackage.MATCHING_RULE__FILTER_EVENT_EXPRESSIONS:
				return filterEventExpressions != null && !filterEventExpressions.isEmpty();
			case BcoolPackage.MATCHING_RULE__CONDITION:
				return condition != null;
		}
		return super.eIsSet(featureID);
	}

} //MatchingRuleImpl
