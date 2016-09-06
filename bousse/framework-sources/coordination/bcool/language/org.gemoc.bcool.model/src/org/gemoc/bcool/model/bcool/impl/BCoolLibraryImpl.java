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

import org.gemoc.bcool.model.bcool.BCoolLibrary;
import org.gemoc.bcool.model.bcool.BcoolPackage;
import org.gemoc.bcool.model.bcool.ExpressionDeclaration;
import org.gemoc.bcool.model.bcool.ExpressionDefinition;
import org.gemoc.bcool.model.bcool.RelationDeclaration;
import org.gemoc.bcool.model.bcool.RelationDefinition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>BCool Library</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.gemoc.bcool.model.bcool.impl.BCoolLibraryImpl#getExpressionDefinitions <em>Expression Definitions</em>}</li>
 *   <li>{@link org.gemoc.bcool.model.bcool.impl.BCoolLibraryImpl#getRelationDefinitions <em>Relation Definitions</em>}</li>
 *   <li>{@link org.gemoc.bcool.model.bcool.impl.BCoolLibraryImpl#getRelationDeclarations <em>Relation Declarations</em>}</li>
 *   <li>{@link org.gemoc.bcool.model.bcool.impl.BCoolLibraryImpl#getExpressionDeclarations <em>Expression Declarations</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BCoolLibraryImpl extends NamedElementImpl implements BCoolLibrary {
	/**
	 * The cached value of the '{@link #getExpressionDefinitions() <em>Expression Definitions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpressionDefinitions()
	 * @generated
	 * @ordered
	 */
	protected EList<ExpressionDefinition> expressionDefinitions;

	/**
	 * The cached value of the '{@link #getRelationDefinitions() <em>Relation Definitions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelationDefinitions()
	 * @generated
	 * @ordered
	 */
	protected EList<RelationDefinition> relationDefinitions;

	/**
	 * The cached value of the '{@link #getRelationDeclarations() <em>Relation Declarations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelationDeclarations()
	 * @generated
	 * @ordered
	 */
	protected EList<RelationDeclaration> relationDeclarations;

	/**
	 * The cached value of the '{@link #getExpressionDeclarations() <em>Expression Declarations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpressionDeclarations()
	 * @generated
	 * @ordered
	 */
	protected EList<ExpressionDeclaration> expressionDeclarations;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BCoolLibraryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BcoolPackage.Literals.BCOOL_LIBRARY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ExpressionDefinition> getExpressionDefinitions() {
		if (expressionDefinitions == null) {
			expressionDefinitions = new EObjectContainmentEList<ExpressionDefinition>(ExpressionDefinition.class, this, BcoolPackage.BCOOL_LIBRARY__EXPRESSION_DEFINITIONS);
		}
		return expressionDefinitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RelationDefinition> getRelationDefinitions() {
		if (relationDefinitions == null) {
			relationDefinitions = new EObjectContainmentEList<RelationDefinition>(RelationDefinition.class, this, BcoolPackage.BCOOL_LIBRARY__RELATION_DEFINITIONS);
		}
		return relationDefinitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RelationDeclaration> getRelationDeclarations() {
		if (relationDeclarations == null) {
			relationDeclarations = new EObjectContainmentEList<RelationDeclaration>(RelationDeclaration.class, this, BcoolPackage.BCOOL_LIBRARY__RELATION_DECLARATIONS);
		}
		return relationDeclarations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ExpressionDeclaration> getExpressionDeclarations() {
		if (expressionDeclarations == null) {
			expressionDeclarations = new EObjectContainmentEList<ExpressionDeclaration>(ExpressionDeclaration.class, this, BcoolPackage.BCOOL_LIBRARY__EXPRESSION_DECLARATIONS);
		}
		return expressionDeclarations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BcoolPackage.BCOOL_LIBRARY__EXPRESSION_DEFINITIONS:
				return ((InternalEList<?>)getExpressionDefinitions()).basicRemove(otherEnd, msgs);
			case BcoolPackage.BCOOL_LIBRARY__RELATION_DEFINITIONS:
				return ((InternalEList<?>)getRelationDefinitions()).basicRemove(otherEnd, msgs);
			case BcoolPackage.BCOOL_LIBRARY__RELATION_DECLARATIONS:
				return ((InternalEList<?>)getRelationDeclarations()).basicRemove(otherEnd, msgs);
			case BcoolPackage.BCOOL_LIBRARY__EXPRESSION_DECLARATIONS:
				return ((InternalEList<?>)getExpressionDeclarations()).basicRemove(otherEnd, msgs);
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
			case BcoolPackage.BCOOL_LIBRARY__EXPRESSION_DEFINITIONS:
				return getExpressionDefinitions();
			case BcoolPackage.BCOOL_LIBRARY__RELATION_DEFINITIONS:
				return getRelationDefinitions();
			case BcoolPackage.BCOOL_LIBRARY__RELATION_DECLARATIONS:
				return getRelationDeclarations();
			case BcoolPackage.BCOOL_LIBRARY__EXPRESSION_DECLARATIONS:
				return getExpressionDeclarations();
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
			case BcoolPackage.BCOOL_LIBRARY__EXPRESSION_DEFINITIONS:
				getExpressionDefinitions().clear();
				getExpressionDefinitions().addAll((Collection<? extends ExpressionDefinition>)newValue);
				return;
			case BcoolPackage.BCOOL_LIBRARY__RELATION_DEFINITIONS:
				getRelationDefinitions().clear();
				getRelationDefinitions().addAll((Collection<? extends RelationDefinition>)newValue);
				return;
			case BcoolPackage.BCOOL_LIBRARY__RELATION_DECLARATIONS:
				getRelationDeclarations().clear();
				getRelationDeclarations().addAll((Collection<? extends RelationDeclaration>)newValue);
				return;
			case BcoolPackage.BCOOL_LIBRARY__EXPRESSION_DECLARATIONS:
				getExpressionDeclarations().clear();
				getExpressionDeclarations().addAll((Collection<? extends ExpressionDeclaration>)newValue);
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
			case BcoolPackage.BCOOL_LIBRARY__EXPRESSION_DEFINITIONS:
				getExpressionDefinitions().clear();
				return;
			case BcoolPackage.BCOOL_LIBRARY__RELATION_DEFINITIONS:
				getRelationDefinitions().clear();
				return;
			case BcoolPackage.BCOOL_LIBRARY__RELATION_DECLARATIONS:
				getRelationDeclarations().clear();
				return;
			case BcoolPackage.BCOOL_LIBRARY__EXPRESSION_DECLARATIONS:
				getExpressionDeclarations().clear();
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
			case BcoolPackage.BCOOL_LIBRARY__EXPRESSION_DEFINITIONS:
				return expressionDefinitions != null && !expressionDefinitions.isEmpty();
			case BcoolPackage.BCOOL_LIBRARY__RELATION_DEFINITIONS:
				return relationDefinitions != null && !relationDefinitions.isEmpty();
			case BcoolPackage.BCOOL_LIBRARY__RELATION_DECLARATIONS:
				return relationDeclarations != null && !relationDeclarations.isEmpty();
			case BcoolPackage.BCOOL_LIBRARY__EXPRESSION_DECLARATIONS:
				return expressionDeclarations != null && !expressionDeclarations.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //BCoolLibraryImpl
