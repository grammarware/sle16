/**
 */
package org.gemoc.bcool.model.bcool;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.gemoc.bcool.model.bcool.BcoolPackage
 * @generated
 */
public interface BcoolFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	BcoolFactory eINSTANCE = org.gemoc.bcool.model.bcool.impl.BcoolFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>BCool Operator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>BCool Operator</em>'.
	 * @generated
	 */
	BCoolOperator createBCoolOperator();

	/**
	 * Returns a new object of class '<em>BCool Composition Rule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>BCool Composition Rule</em>'.
	 * @generated
	 */
	BCoolCompositionRule createBCoolCompositionRule();

	/**
	 * Returns a new object of class '<em>BCool Specification</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>BCool Specification</em>'.
	 * @generated
	 */
	BCoolSpecification createBCoolSpecification();

	/**
	 * Returns a new object of class '<em>Import Lib Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Import Lib Statement</em>'.
	 * @generated
	 */
	ImportLibStatement createImportLibStatement();

	/**
	 * Returns a new object of class '<em>Matching Rule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Matching Rule</em>'.
	 * @generated
	 */
	MatchingRule createMatchingRule();

	/**
	 * Returns a new object of class '<em>Coordination Rule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Coordination Rule</em>'.
	 * @generated
	 */
	CoordinationRule createCoordinationRule();

	/**
	 * Returns a new object of class '<em>Event Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Event Expression</em>'.
	 * @generated
	 */
	EventExpression createEventExpression();

	/**
	 * Returns a new object of class '<em>Expression Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Expression Definition</em>'.
	 * @generated
	 */
	ExpressionDefinition createExpressionDefinition();

	/**
	 * Returns a new object of class '<em>Event Relation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Event Relation</em>'.
	 * @generated
	 */
	EventRelation createEventRelation();

	/**
	 * Returns a new object of class '<em>Relation Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Relation Definition</em>'.
	 * @generated
	 */
	RelationDefinition createRelationDefinition();

	/**
	 * Returns a new object of class '<em>BCool Library</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>BCool Library</em>'.
	 * @generated
	 */
	BCoolLibrary createBCoolLibrary();

	/**
	 * Returns a new object of class '<em>Import Interface Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Import Interface Statement</em>'.
	 * @generated
	 */
	ImportInterfaceStatement createImportInterfaceStatement();

	/**
	 * Returns a new object of class '<em>Expression Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Expression Declaration</em>'.
	 * @generated
	 */
	ExpressionDeclaration createExpressionDeclaration();

	/**
	 * Returns a new object of class '<em>Relation Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Relation Declaration</em>'.
	 * @generated
	 */
	RelationDeclaration createRelationDeclaration();

	/**
	 * Returns a new object of class '<em>BCool Operator Arg</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>BCool Operator Arg</em>'.
	 * @generated
	 */
	BCoolOperatorArg createBCoolOperatorArg();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	BcoolPackage getBcoolPackage();

} //BcoolFactory
