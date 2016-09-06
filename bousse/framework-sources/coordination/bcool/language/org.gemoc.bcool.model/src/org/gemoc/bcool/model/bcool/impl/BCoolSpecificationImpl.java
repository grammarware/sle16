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

import org.gemoc.bcool.model.bcool.BCoolOperator;
import org.gemoc.bcool.model.bcool.BCoolSpecification;
import org.gemoc.bcool.model.bcool.BcoolPackage;
import org.gemoc.bcool.model.bcool.ImportInterfaceStatement;
import org.gemoc.bcool.model.bcool.ImportLibStatement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>BCool Specification</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.gemoc.bcool.model.bcool.impl.BCoolSpecificationImpl#getBcoolOperators <em>Bcool Operators</em>}</li>
 *   <li>{@link org.gemoc.bcool.model.bcool.impl.BCoolSpecificationImpl#getImportsLib <em>Imports Lib</em>}</li>
 *   <li>{@link org.gemoc.bcool.model.bcool.impl.BCoolSpecificationImpl#getImportsBehavioralInterface <em>Imports Behavioral Interface</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BCoolSpecificationImpl extends NamedElementImpl implements BCoolSpecification {
	/**
	 * The cached value of the '{@link #getBcoolOperators() <em>Bcool Operators</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBcoolOperators()
	 * @generated
	 * @ordered
	 */
	protected EList<BCoolOperator> bcoolOperators;

	/**
	 * The cached value of the '{@link #getImportsLib() <em>Imports Lib</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImportsLib()
	 * @generated
	 * @ordered
	 */
	protected EList<ImportLibStatement> importsLib;

	/**
	 * The cached value of the '{@link #getImportsBehavioralInterface() <em>Imports Behavioral Interface</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImportsBehavioralInterface()
	 * @generated
	 * @ordered
	 */
	protected EList<ImportInterfaceStatement> importsBehavioralInterface;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BCoolSpecificationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BcoolPackage.Literals.BCOOL_SPECIFICATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BCoolOperator> getBcoolOperators() {
		if (bcoolOperators == null) {
			bcoolOperators = new EObjectContainmentEList<BCoolOperator>(BCoolOperator.class, this, BcoolPackage.BCOOL_SPECIFICATION__BCOOL_OPERATORS);
		}
		return bcoolOperators;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ImportLibStatement> getImportsLib() {
		if (importsLib == null) {
			importsLib = new EObjectContainmentEList<ImportLibStatement>(ImportLibStatement.class, this, BcoolPackage.BCOOL_SPECIFICATION__IMPORTS_LIB);
		}
		return importsLib;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ImportInterfaceStatement> getImportsBehavioralInterface() {
		if (importsBehavioralInterface == null) {
			importsBehavioralInterface = new EObjectContainmentEList<ImportInterfaceStatement>(ImportInterfaceStatement.class, this, BcoolPackage.BCOOL_SPECIFICATION__IMPORTS_BEHAVIORAL_INTERFACE);
		}
		return importsBehavioralInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BcoolPackage.BCOOL_SPECIFICATION__BCOOL_OPERATORS:
				return ((InternalEList<?>)getBcoolOperators()).basicRemove(otherEnd, msgs);
			case BcoolPackage.BCOOL_SPECIFICATION__IMPORTS_LIB:
				return ((InternalEList<?>)getImportsLib()).basicRemove(otherEnd, msgs);
			case BcoolPackage.BCOOL_SPECIFICATION__IMPORTS_BEHAVIORAL_INTERFACE:
				return ((InternalEList<?>)getImportsBehavioralInterface()).basicRemove(otherEnd, msgs);
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
			case BcoolPackage.BCOOL_SPECIFICATION__BCOOL_OPERATORS:
				return getBcoolOperators();
			case BcoolPackage.BCOOL_SPECIFICATION__IMPORTS_LIB:
				return getImportsLib();
			case BcoolPackage.BCOOL_SPECIFICATION__IMPORTS_BEHAVIORAL_INTERFACE:
				return getImportsBehavioralInterface();
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
			case BcoolPackage.BCOOL_SPECIFICATION__BCOOL_OPERATORS:
				getBcoolOperators().clear();
				getBcoolOperators().addAll((Collection<? extends BCoolOperator>)newValue);
				return;
			case BcoolPackage.BCOOL_SPECIFICATION__IMPORTS_LIB:
				getImportsLib().clear();
				getImportsLib().addAll((Collection<? extends ImportLibStatement>)newValue);
				return;
			case BcoolPackage.BCOOL_SPECIFICATION__IMPORTS_BEHAVIORAL_INTERFACE:
				getImportsBehavioralInterface().clear();
				getImportsBehavioralInterface().addAll((Collection<? extends ImportInterfaceStatement>)newValue);
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
			case BcoolPackage.BCOOL_SPECIFICATION__BCOOL_OPERATORS:
				getBcoolOperators().clear();
				return;
			case BcoolPackage.BCOOL_SPECIFICATION__IMPORTS_LIB:
				getImportsLib().clear();
				return;
			case BcoolPackage.BCOOL_SPECIFICATION__IMPORTS_BEHAVIORAL_INTERFACE:
				getImportsBehavioralInterface().clear();
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
			case BcoolPackage.BCOOL_SPECIFICATION__BCOOL_OPERATORS:
				return bcoolOperators != null && !bcoolOperators.isEmpty();
			case BcoolPackage.BCOOL_SPECIFICATION__IMPORTS_LIB:
				return importsLib != null && !importsLib.isEmpty();
			case BcoolPackage.BCOOL_SPECIFICATION__IMPORTS_BEHAVIORAL_INTERFACE:
				return importsBehavioralInterface != null && !importsBehavioralInterface.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //BCoolSpecificationImpl
