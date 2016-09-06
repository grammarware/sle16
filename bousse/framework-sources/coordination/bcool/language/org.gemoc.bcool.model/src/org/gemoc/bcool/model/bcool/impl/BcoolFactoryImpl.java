/**
 */
package org.gemoc.bcool.model.bcool.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.gemoc.bcool.model.bcool.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class BcoolFactoryImpl extends EFactoryImpl implements BcoolFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static BcoolFactory init() {
		try {
			BcoolFactory theBcoolFactory = (BcoolFactory)EPackage.Registry.INSTANCE.getEFactory(BcoolPackage.eNS_URI);
			if (theBcoolFactory != null) {
				return theBcoolFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new BcoolFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BcoolFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case BcoolPackage.BCOOL_OPERATOR: return createBCoolOperator();
			case BcoolPackage.BCOOL_COMPOSITION_RULE: return createBCoolCompositionRule();
			case BcoolPackage.BCOOL_SPECIFICATION: return createBCoolSpecification();
			case BcoolPackage.IMPORT_LIB_STATEMENT: return createImportLibStatement();
			case BcoolPackage.MATCHING_RULE: return createMatchingRule();
			case BcoolPackage.COORDINATION_RULE: return createCoordinationRule();
			case BcoolPackage.EVENT_EXPRESSION: return createEventExpression();
			case BcoolPackage.EXPRESSION_DEFINITION: return createExpressionDefinition();
			case BcoolPackage.EVENT_RELATION: return createEventRelation();
			case BcoolPackage.RELATION_DEFINITION: return createRelationDefinition();
			case BcoolPackage.BCOOL_LIBRARY: return createBCoolLibrary();
			case BcoolPackage.IMPORT_INTERFACE_STATEMENT: return createImportInterfaceStatement();
			case BcoolPackage.EXPRESSION_DECLARATION: return createExpressionDeclaration();
			case BcoolPackage.RELATION_DECLARATION: return createRelationDeclaration();
			case BcoolPackage.BCOOL_OPERATOR_ARG: return createBCoolOperatorArg();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BCoolOperator createBCoolOperator() {
		BCoolOperatorImpl bCoolOperator = new BCoolOperatorImpl();
		return bCoolOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BCoolCompositionRule createBCoolCompositionRule() {
		BCoolCompositionRuleImpl bCoolCompositionRule = new BCoolCompositionRuleImpl();
		return bCoolCompositionRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BCoolSpecification createBCoolSpecification() {
		BCoolSpecificationImpl bCoolSpecification = new BCoolSpecificationImpl();
		return bCoolSpecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImportLibStatement createImportLibStatement() {
		ImportLibStatementImpl importLibStatement = new ImportLibStatementImpl();
		return importLibStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MatchingRule createMatchingRule() {
		MatchingRuleImpl matchingRule = new MatchingRuleImpl();
		return matchingRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoordinationRule createCoordinationRule() {
		CoordinationRuleImpl coordinationRule = new CoordinationRuleImpl();
		return coordinationRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventExpression createEventExpression() {
		EventExpressionImpl eventExpression = new EventExpressionImpl();
		return eventExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpressionDefinition createExpressionDefinition() {
		ExpressionDefinitionImpl expressionDefinition = new ExpressionDefinitionImpl();
		return expressionDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventRelation createEventRelation() {
		EventRelationImpl eventRelation = new EventRelationImpl();
		return eventRelation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationDefinition createRelationDefinition() {
		RelationDefinitionImpl relationDefinition = new RelationDefinitionImpl();
		return relationDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BCoolLibrary createBCoolLibrary() {
		BCoolLibraryImpl bCoolLibrary = new BCoolLibraryImpl();
		return bCoolLibrary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImportInterfaceStatement createImportInterfaceStatement() {
		ImportInterfaceStatementImpl importInterfaceStatement = new ImportInterfaceStatementImpl();
		return importInterfaceStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpressionDeclaration createExpressionDeclaration() {
		ExpressionDeclarationImpl expressionDeclaration = new ExpressionDeclarationImpl();
		return expressionDeclaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationDeclaration createRelationDeclaration() {
		RelationDeclarationImpl relationDeclaration = new RelationDeclarationImpl();
		return relationDeclaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BCoolOperatorArg createBCoolOperatorArg() {
		BCoolOperatorArgImpl bCoolOperatorArg = new BCoolOperatorArgImpl();
		return bCoolOperatorArg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BcoolPackage getBcoolPackage() {
		return (BcoolPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static BcoolPackage getPackage() {
		return BcoolPackage.eINSTANCE;
	}

} //BcoolFactoryImpl
