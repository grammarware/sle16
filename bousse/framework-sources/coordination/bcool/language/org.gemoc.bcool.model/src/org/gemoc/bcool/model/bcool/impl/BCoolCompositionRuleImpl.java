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
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.gemoc.bcool.model.bcool.BCoolCompositionRule;
import org.gemoc.bcool.model.bcool.BCoolOperatorArg;
import org.gemoc.bcool.model.bcool.BcoolPackage;
import org.gemoc.bcool.model.bcool.CoordinationRule;
import org.gemoc.bcool.model.bcool.MatchingRule;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>BCool Composition Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.gemoc.bcool.model.bcool.impl.BCoolCompositionRuleImpl#getBCoolOperatorArgs <em>BCool Operator Args</em>}</li>
 *   <li>{@link org.gemoc.bcool.model.bcool.impl.BCoolCompositionRuleImpl#getMatchingRule <em>Matching Rule</em>}</li>
 *   <li>{@link org.gemoc.bcool.model.bcool.impl.BCoolCompositionRuleImpl#getCoordinationRule <em>Coordination Rule</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BCoolCompositionRuleImpl extends NamedElementImpl implements BCoolCompositionRule {
	/**
	 * The cached value of the '{@link #getBCoolOperatorArgs() <em>BCool Operator Args</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBCoolOperatorArgs()
	 * @generated
	 * @ordered
	 */
	protected EList<BCoolOperatorArg> bCoolOperatorArgs;

	/**
	 * The cached value of the '{@link #getMatchingRule() <em>Matching Rule</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMatchingRule()
	 * @generated
	 * @ordered
	 */
	protected MatchingRule matchingRule;

	/**
	 * The cached value of the '{@link #getCoordinationRule() <em>Coordination Rule</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoordinationRule()
	 * @generated
	 * @ordered
	 */
	protected CoordinationRule coordinationRule;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BCoolCompositionRuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BcoolPackage.Literals.BCOOL_COMPOSITION_RULE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BCoolOperatorArg> getBCoolOperatorArgs() {
		if (bCoolOperatorArgs == null) {
			bCoolOperatorArgs = new EObjectContainmentEList<BCoolOperatorArg>(BCoolOperatorArg.class, this, BcoolPackage.BCOOL_COMPOSITION_RULE__BCOOL_OPERATOR_ARGS);
		}
		return bCoolOperatorArgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MatchingRule getMatchingRule() {
		return matchingRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMatchingRule(MatchingRule newMatchingRule, NotificationChain msgs) {
		MatchingRule oldMatchingRule = matchingRule;
		matchingRule = newMatchingRule;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BcoolPackage.BCOOL_COMPOSITION_RULE__MATCHING_RULE, oldMatchingRule, newMatchingRule);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMatchingRule(MatchingRule newMatchingRule) {
		if (newMatchingRule != matchingRule) {
			NotificationChain msgs = null;
			if (matchingRule != null)
				msgs = ((InternalEObject)matchingRule).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BcoolPackage.BCOOL_COMPOSITION_RULE__MATCHING_RULE, null, msgs);
			if (newMatchingRule != null)
				msgs = ((InternalEObject)newMatchingRule).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BcoolPackage.BCOOL_COMPOSITION_RULE__MATCHING_RULE, null, msgs);
			msgs = basicSetMatchingRule(newMatchingRule, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BcoolPackage.BCOOL_COMPOSITION_RULE__MATCHING_RULE, newMatchingRule, newMatchingRule));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoordinationRule getCoordinationRule() {
		return coordinationRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCoordinationRule(CoordinationRule newCoordinationRule, NotificationChain msgs) {
		CoordinationRule oldCoordinationRule = coordinationRule;
		coordinationRule = newCoordinationRule;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BcoolPackage.BCOOL_COMPOSITION_RULE__COORDINATION_RULE, oldCoordinationRule, newCoordinationRule);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCoordinationRule(CoordinationRule newCoordinationRule) {
		if (newCoordinationRule != coordinationRule) {
			NotificationChain msgs = null;
			if (coordinationRule != null)
				msgs = ((InternalEObject)coordinationRule).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BcoolPackage.BCOOL_COMPOSITION_RULE__COORDINATION_RULE, null, msgs);
			if (newCoordinationRule != null)
				msgs = ((InternalEObject)newCoordinationRule).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BcoolPackage.BCOOL_COMPOSITION_RULE__COORDINATION_RULE, null, msgs);
			msgs = basicSetCoordinationRule(newCoordinationRule, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BcoolPackage.BCOOL_COMPOSITION_RULE__COORDINATION_RULE, newCoordinationRule, newCoordinationRule));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BcoolPackage.BCOOL_COMPOSITION_RULE__BCOOL_OPERATOR_ARGS:
				return ((InternalEList<?>)getBCoolOperatorArgs()).basicRemove(otherEnd, msgs);
			case BcoolPackage.BCOOL_COMPOSITION_RULE__MATCHING_RULE:
				return basicSetMatchingRule(null, msgs);
			case BcoolPackage.BCOOL_COMPOSITION_RULE__COORDINATION_RULE:
				return basicSetCoordinationRule(null, msgs);
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
			case BcoolPackage.BCOOL_COMPOSITION_RULE__BCOOL_OPERATOR_ARGS:
				return getBCoolOperatorArgs();
			case BcoolPackage.BCOOL_COMPOSITION_RULE__MATCHING_RULE:
				return getMatchingRule();
			case BcoolPackage.BCOOL_COMPOSITION_RULE__COORDINATION_RULE:
				return getCoordinationRule();
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
			case BcoolPackage.BCOOL_COMPOSITION_RULE__BCOOL_OPERATOR_ARGS:
				getBCoolOperatorArgs().clear();
				getBCoolOperatorArgs().addAll((Collection<? extends BCoolOperatorArg>)newValue);
				return;
			case BcoolPackage.BCOOL_COMPOSITION_RULE__MATCHING_RULE:
				setMatchingRule((MatchingRule)newValue);
				return;
			case BcoolPackage.BCOOL_COMPOSITION_RULE__COORDINATION_RULE:
				setCoordinationRule((CoordinationRule)newValue);
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
			case BcoolPackage.BCOOL_COMPOSITION_RULE__BCOOL_OPERATOR_ARGS:
				getBCoolOperatorArgs().clear();
				return;
			case BcoolPackage.BCOOL_COMPOSITION_RULE__MATCHING_RULE:
				setMatchingRule((MatchingRule)null);
				return;
			case BcoolPackage.BCOOL_COMPOSITION_RULE__COORDINATION_RULE:
				setCoordinationRule((CoordinationRule)null);
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
			case BcoolPackage.BCOOL_COMPOSITION_RULE__BCOOL_OPERATOR_ARGS:
				return bCoolOperatorArgs != null && !bCoolOperatorArgs.isEmpty();
			case BcoolPackage.BCOOL_COMPOSITION_RULE__MATCHING_RULE:
				return matchingRule != null;
			case BcoolPackage.BCOOL_COMPOSITION_RULE__COORDINATION_RULE:
				return coordinationRule != null;
		}
		return super.eIsSet(featureID);
	}

} //BCoolCompositionRuleImpl
