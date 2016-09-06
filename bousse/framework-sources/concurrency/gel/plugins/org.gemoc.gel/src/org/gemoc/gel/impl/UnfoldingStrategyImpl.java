/**
 */
package org.gemoc.gel.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.gemoc.gel.GelPackage;
import org.gemoc.gel.InstantiationPredicate;
import org.gemoc.gel.LocalVariable;
import org.gemoc.gel.UnfoldingStrategy;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Unfolding Strategy</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.gemoc.gel.impl.UnfoldingStrategyImpl#getLocalVariables <em>Local Variables</em>}</li>
 *   <li>{@link org.gemoc.gel.impl.UnfoldingStrategyImpl#getInstantiationPredicates <em>Instantiation Predicates</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UnfoldingStrategyImpl extends MinimalEObjectImpl.Container implements UnfoldingStrategy {
	/**
	 * The cached value of the '{@link #getLocalVariables() <em>Local Variables</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocalVariables()
	 * @generated
	 * @ordered
	 */
	protected EList<LocalVariable> localVariables;

	/**
	 * The cached value of the '{@link #getInstantiationPredicates() <em>Instantiation Predicates</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstantiationPredicates()
	 * @generated
	 * @ordered
	 */
	protected EList<InstantiationPredicate> instantiationPredicates;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UnfoldingStrategyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GelPackage.Literals.UNFOLDING_STRATEGY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LocalVariable> getLocalVariables() {
		if (localVariables == null) {
			localVariables = new EObjectContainmentEList<LocalVariable>(LocalVariable.class, this, GelPackage.UNFOLDING_STRATEGY__LOCAL_VARIABLES);
		}
		return localVariables;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InstantiationPredicate> getInstantiationPredicates() {
		if (instantiationPredicates == null) {
			instantiationPredicates = new EObjectContainmentEList<InstantiationPredicate>(InstantiationPredicate.class, this, GelPackage.UNFOLDING_STRATEGY__INSTANTIATION_PREDICATES);
		}
		return instantiationPredicates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GelPackage.UNFOLDING_STRATEGY__LOCAL_VARIABLES:
				return ((InternalEList<?>)getLocalVariables()).basicRemove(otherEnd, msgs);
			case GelPackage.UNFOLDING_STRATEGY__INSTANTIATION_PREDICATES:
				return ((InternalEList<?>)getInstantiationPredicates()).basicRemove(otherEnd, msgs);
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
			case GelPackage.UNFOLDING_STRATEGY__LOCAL_VARIABLES:
				return getLocalVariables();
			case GelPackage.UNFOLDING_STRATEGY__INSTANTIATION_PREDICATES:
				return getInstantiationPredicates();
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
			case GelPackage.UNFOLDING_STRATEGY__LOCAL_VARIABLES:
				getLocalVariables().clear();
				getLocalVariables().addAll((Collection<? extends LocalVariable>)newValue);
				return;
			case GelPackage.UNFOLDING_STRATEGY__INSTANTIATION_PREDICATES:
				getInstantiationPredicates().clear();
				getInstantiationPredicates().addAll((Collection<? extends InstantiationPredicate>)newValue);
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
			case GelPackage.UNFOLDING_STRATEGY__LOCAL_VARIABLES:
				getLocalVariables().clear();
				return;
			case GelPackage.UNFOLDING_STRATEGY__INSTANTIATION_PREDICATES:
				getInstantiationPredicates().clear();
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
			case GelPackage.UNFOLDING_STRATEGY__LOCAL_VARIABLES:
				return localVariables != null && !localVariables.isEmpty();
			case GelPackage.UNFOLDING_STRATEGY__INSTANTIATION_PREDICATES:
				return instantiationPredicates != null && !instantiationPredicates.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //UnfoldingStrategyImpl
