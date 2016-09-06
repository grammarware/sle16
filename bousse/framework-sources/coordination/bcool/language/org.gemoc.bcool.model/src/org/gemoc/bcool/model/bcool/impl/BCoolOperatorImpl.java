/**
 */
package org.gemoc.bcool.model.bcool.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.ocl.examples.xtext.completeocl.completeoclcs.DefPropertyCS;

import org.gemoc.bcool.model.bcool.BCoolCompositionRule;
import org.gemoc.bcool.model.bcool.BCoolOperator;
import org.gemoc.bcool.model.bcool.BcoolPackage;
import org.gemoc.bcool.model.bcool.EventExpression;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>BCool Operator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.gemoc.bcool.model.bcool.impl.BCoolOperatorImpl#getBcoolCompositionRules <em>Bcool Composition Rules</em>}</li>
 *   <li>{@link org.gemoc.bcool.model.bcool.impl.BCoolOperatorImpl#getGlobalEventExpressions <em>Global Event Expressions</em>}</li>
 *   <li>{@link org.gemoc.bcool.model.bcool.impl.BCoolOperatorImpl#getGlobalDSEs <em>Global DS Es</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BCoolOperatorImpl extends NamedElementImpl implements BCoolOperator {
	/**
	 * The cached value of the '{@link #getBcoolCompositionRules() <em>Bcool Composition Rules</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBcoolCompositionRules()
	 * @generated
	 * @ordered
	 */
	protected EList<BCoolCompositionRule> bcoolCompositionRules;

	/**
	 * The cached value of the '{@link #getGlobalEventExpressions() <em>Global Event Expressions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGlobalEventExpressions()
	 * @generated
	 * @ordered
	 */
	protected EList<EventExpression> globalEventExpressions;

	/**
	 * The cached value of the '{@link #getGlobalDSEs() <em>Global DS Es</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGlobalDSEs()
	 * @generated
	 * @ordered
	 */
	protected EList<DefPropertyCS> globalDSEs;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BCoolOperatorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BcoolPackage.Literals.BCOOL_OPERATOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BCoolCompositionRule> getBcoolCompositionRules() {
		if (bcoolCompositionRules == null) {
			bcoolCompositionRules = new EObjectContainmentEList<BCoolCompositionRule>(BCoolCompositionRule.class, this, BcoolPackage.BCOOL_OPERATOR__BCOOL_COMPOSITION_RULES);
		}
		return bcoolCompositionRules;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EventExpression> getGlobalEventExpressions() {
		if (globalEventExpressions == null) {
			globalEventExpressions = new EObjectContainmentEList<EventExpression>(EventExpression.class, this, BcoolPackage.BCOOL_OPERATOR__GLOBAL_EVENT_EXPRESSIONS);
		}
		return globalEventExpressions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DefPropertyCS> getGlobalDSEs() {
		if (globalDSEs == null) {
			globalDSEs = new EObjectContainmentEList<DefPropertyCS>(DefPropertyCS.class, this, BcoolPackage.BCOOL_OPERATOR__GLOBAL_DS_ES);
		}
		return globalDSEs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BcoolPackage.BCOOL_OPERATOR__BCOOL_COMPOSITION_RULES:
				return ((InternalEList<?>)getBcoolCompositionRules()).basicRemove(otherEnd, msgs);
			case BcoolPackage.BCOOL_OPERATOR__GLOBAL_EVENT_EXPRESSIONS:
				return ((InternalEList<?>)getGlobalEventExpressions()).basicRemove(otherEnd, msgs);
			case BcoolPackage.BCOOL_OPERATOR__GLOBAL_DS_ES:
				return ((InternalEList<?>)getGlobalDSEs()).basicRemove(otherEnd, msgs);
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
			case BcoolPackage.BCOOL_OPERATOR__BCOOL_COMPOSITION_RULES:
				return getBcoolCompositionRules();
			case BcoolPackage.BCOOL_OPERATOR__GLOBAL_EVENT_EXPRESSIONS:
				return getGlobalEventExpressions();
			case BcoolPackage.BCOOL_OPERATOR__GLOBAL_DS_ES:
				return getGlobalDSEs();
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
			case BcoolPackage.BCOOL_OPERATOR__BCOOL_COMPOSITION_RULES:
				getBcoolCompositionRules().clear();
				getBcoolCompositionRules().addAll((Collection<? extends BCoolCompositionRule>)newValue);
				return;
			case BcoolPackage.BCOOL_OPERATOR__GLOBAL_EVENT_EXPRESSIONS:
				getGlobalEventExpressions().clear();
				getGlobalEventExpressions().addAll((Collection<? extends EventExpression>)newValue);
				return;
			case BcoolPackage.BCOOL_OPERATOR__GLOBAL_DS_ES:
				getGlobalDSEs().clear();
				getGlobalDSEs().addAll((Collection<? extends DefPropertyCS>)newValue);
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
			case BcoolPackage.BCOOL_OPERATOR__BCOOL_COMPOSITION_RULES:
				getBcoolCompositionRules().clear();
				return;
			case BcoolPackage.BCOOL_OPERATOR__GLOBAL_EVENT_EXPRESSIONS:
				getGlobalEventExpressions().clear();
				return;
			case BcoolPackage.BCOOL_OPERATOR__GLOBAL_DS_ES:
				getGlobalDSEs().clear();
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
			case BcoolPackage.BCOOL_OPERATOR__BCOOL_COMPOSITION_RULES:
				return bcoolCompositionRules != null && !bcoolCompositionRules.isEmpty();
			case BcoolPackage.BCOOL_OPERATOR__GLOBAL_EVENT_EXPRESSIONS:
				return globalEventExpressions != null && !globalEventExpressions.isEmpty();
			case BcoolPackage.BCOOL_OPERATOR__GLOBAL_DS_ES:
				return globalDSEs != null && !globalDSEs.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //BCoolOperatorImpl
