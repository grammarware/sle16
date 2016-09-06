/**
 */
package org.gemoc.bcool.model.bcool;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>BCool Library</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.gemoc.bcool.model.bcool.BCoolLibrary#getExpressionDefinitions <em>Expression Definitions</em>}</li>
 *   <li>{@link org.gemoc.bcool.model.bcool.BCoolLibrary#getRelationDefinitions <em>Relation Definitions</em>}</li>
 *   <li>{@link org.gemoc.bcool.model.bcool.BCoolLibrary#getRelationDeclarations <em>Relation Declarations</em>}</li>
 *   <li>{@link org.gemoc.bcool.model.bcool.BCoolLibrary#getExpressionDeclarations <em>Expression Declarations</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.gemoc.bcool.model.bcool.BcoolPackage#getBCoolLibrary()
 * @model
 * @generated
 */
public interface BCoolLibrary extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Expression Definitions</b></em>' containment reference list.
	 * The list contents are of type {@link org.gemoc.bcool.model.bcool.ExpressionDefinition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expression Definitions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expression Definitions</em>' containment reference list.
	 * @see org.gemoc.bcool.model.bcool.BcoolPackage#getBCoolLibrary_ExpressionDefinitions()
	 * @model containment="true"
	 * @generated
	 */
	EList<ExpressionDefinition> getExpressionDefinitions();

	/**
	 * Returns the value of the '<em><b>Relation Definitions</b></em>' containment reference list.
	 * The list contents are of type {@link org.gemoc.bcool.model.bcool.RelationDefinition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relation Definitions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relation Definitions</em>' containment reference list.
	 * @see org.gemoc.bcool.model.bcool.BcoolPackage#getBCoolLibrary_RelationDefinitions()
	 * @model containment="true"
	 * @generated
	 */
	EList<RelationDefinition> getRelationDefinitions();

	/**
	 * Returns the value of the '<em><b>Relation Declarations</b></em>' containment reference list.
	 * The list contents are of type {@link org.gemoc.bcool.model.bcool.RelationDeclaration}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relation Declarations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relation Declarations</em>' containment reference list.
	 * @see org.gemoc.bcool.model.bcool.BcoolPackage#getBCoolLibrary_RelationDeclarations()
	 * @model containment="true"
	 * @generated
	 */
	EList<RelationDeclaration> getRelationDeclarations();

	/**
	 * Returns the value of the '<em><b>Expression Declarations</b></em>' containment reference list.
	 * The list contents are of type {@link org.gemoc.bcool.model.bcool.ExpressionDeclaration}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expression Declarations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expression Declarations</em>' containment reference list.
	 * @see org.gemoc.bcool.model.bcool.BcoolPackage#getBCoolLibrary_ExpressionDeclarations()
	 * @model containment="true"
	 * @generated
	 */
	EList<ExpressionDeclaration> getExpressionDeclarations();

} // BCoolLibrary
