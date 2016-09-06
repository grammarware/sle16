/**
 */
package org.gemoc.bcool.model.bcool;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.gemoc.bcool.model.bcool.BcoolFactory
 * @model kind="package"
 * @generated
 */
public interface BcoolPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "bcool";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://org.gemoc.bcool.model/";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "bcool";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	BcoolPackage eINSTANCE = org.gemoc.bcool.model.bcool.impl.BcoolPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.gemoc.bcool.model.bcool.impl.NamedElementImpl <em>Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.bcool.model.bcool.impl.NamedElementImpl
	 * @see org.gemoc.bcool.model.bcool.impl.BcoolPackageImpl#getNamedElement()
	 * @generated
	 */
	int NAMED_ELEMENT = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__NAME = 0;

	/**
	 * The number of structural features of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.gemoc.bcool.model.bcool.impl.BCoolOperatorImpl <em>BCool Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.bcool.model.bcool.impl.BCoolOperatorImpl
	 * @see org.gemoc.bcool.model.bcool.impl.BcoolPackageImpl#getBCoolOperator()
	 * @generated
	 */
	int BCOOL_OPERATOR = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BCOOL_OPERATOR__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Bcool Composition Rules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BCOOL_OPERATOR__BCOOL_COMPOSITION_RULES = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Global Event Expressions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BCOOL_OPERATOR__GLOBAL_EVENT_EXPRESSIONS = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Global DS Es</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BCOOL_OPERATOR__GLOBAL_DS_ES = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>BCool Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BCOOL_OPERATOR_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>BCool Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BCOOL_OPERATOR_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gemoc.bcool.model.bcool.impl.BCoolCompositionRuleImpl <em>BCool Composition Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.bcool.model.bcool.impl.BCoolCompositionRuleImpl
	 * @see org.gemoc.bcool.model.bcool.impl.BcoolPackageImpl#getBCoolCompositionRule()
	 * @generated
	 */
	int BCOOL_COMPOSITION_RULE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BCOOL_COMPOSITION_RULE__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>BCool Operator Args</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BCOOL_COMPOSITION_RULE__BCOOL_OPERATOR_ARGS = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Matching Rule</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BCOOL_COMPOSITION_RULE__MATCHING_RULE = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Coordination Rule</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BCOOL_COMPOSITION_RULE__COORDINATION_RULE = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>BCool Composition Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BCOOL_COMPOSITION_RULE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>BCool Composition Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BCOOL_COMPOSITION_RULE_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gemoc.bcool.model.bcool.impl.BCoolSpecificationImpl <em>BCool Specification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.bcool.model.bcool.impl.BCoolSpecificationImpl
	 * @see org.gemoc.bcool.model.bcool.impl.BcoolPackageImpl#getBCoolSpecification()
	 * @generated
	 */
	int BCOOL_SPECIFICATION = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BCOOL_SPECIFICATION__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Bcool Operators</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BCOOL_SPECIFICATION__BCOOL_OPERATORS = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Imports Lib</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BCOOL_SPECIFICATION__IMPORTS_LIB = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Imports Behavioral Interface</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BCOOL_SPECIFICATION__IMPORTS_BEHAVIORAL_INTERFACE = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>BCool Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BCOOL_SPECIFICATION_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>BCool Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BCOOL_SPECIFICATION_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gemoc.bcool.model.bcool.impl.ImportLibStatementImpl <em>Import Lib Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.bcool.model.bcool.impl.ImportLibStatementImpl
	 * @see org.gemoc.bcool.model.bcool.impl.BcoolPackageImpl#getImportLibStatement()
	 * @generated
	 */
	int IMPORT_LIB_STATEMENT = 4;

	/**
	 * The feature id for the '<em><b>Import URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_LIB_STATEMENT__IMPORT_URI = 0;

	/**
	 * The number of structural features of the '<em>Import Lib Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_LIB_STATEMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Import Lib Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_LIB_STATEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.gemoc.bcool.model.bcool.impl.MatchingRuleImpl <em>Matching Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.bcool.model.bcool.impl.MatchingRuleImpl
	 * @see org.gemoc.bcool.model.bcool.impl.BcoolPackageImpl#getMatchingRule()
	 * @generated
	 */
	int MATCHING_RULE = 5;

	/**
	 * The feature id for the '<em><b>Filter Event Expressions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCHING_RULE__FILTER_EVENT_EXPRESSIONS = 0;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCHING_RULE__CONDITION = 1;

	/**
	 * The number of structural features of the '<em>Matching Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCHING_RULE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Matching Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCHING_RULE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.gemoc.bcool.model.bcool.impl.CoordinationRuleImpl <em>Coordination Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.bcool.model.bcool.impl.CoordinationRuleImpl
	 * @see org.gemoc.bcool.model.bcool.impl.BcoolPackageImpl#getCoordinationRule()
	 * @generated
	 */
	int COORDINATION_RULE = 6;

	/**
	 * The feature id for the '<em><b>Event Relations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATION_RULE__EVENT_RELATIONS = 0;

	/**
	 * The number of structural features of the '<em>Coordination Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATION_RULE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Coordination Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATION_RULE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.gemoc.bcool.model.bcool.impl.EventExpressionImpl <em>Event Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.bcool.model.bcool.impl.EventExpressionImpl
	 * @see org.gemoc.bcool.model.bcool.impl.BcoolPackageImpl#getEventExpression()
	 * @generated
	 */
	int EVENT_EXPRESSION = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_EXPRESSION__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Declaration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_EXPRESSION__DECLARATION = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Actual Parameters</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_EXPRESSION__ACTUAL_PARAMETERS = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Event Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_EXPRESSION_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Event Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_EXPRESSION_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gemoc.bcool.model.bcool.impl.ExpressionDefinitionImpl <em>Expression Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.bcool.model.bcool.impl.ExpressionDefinitionImpl
	 * @see org.gemoc.bcool.model.bcool.impl.BcoolPackageImpl#getExpressionDefinition()
	 * @generated
	 */
	int EXPRESSION_DEFINITION = 8;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_DEFINITION__DEFINITION = 0;

	/**
	 * The number of structural features of the '<em>Expression Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_DEFINITION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Expression Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_DEFINITION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.gemoc.bcool.model.bcool.impl.EventRelationImpl <em>Event Relation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.bcool.model.bcool.impl.EventRelationImpl
	 * @see org.gemoc.bcool.model.bcool.impl.BcoolPackageImpl#getEventRelation()
	 * @generated
	 */
	int EVENT_RELATION = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_RELATION__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Declaration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_RELATION__DECLARATION = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Actual Parameters</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_RELATION__ACTUAL_PARAMETERS = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Event Relation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_RELATION_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Event Relation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_RELATION_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gemoc.bcool.model.bcool.impl.RelationDefinitionImpl <em>Relation Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.bcool.model.bcool.impl.RelationDefinitionImpl
	 * @see org.gemoc.bcool.model.bcool.impl.BcoolPackageImpl#getRelationDefinition()
	 * @generated
	 */
	int RELATION_DEFINITION = 10;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_DEFINITION__DEFINITION = 0;

	/**
	 * The number of structural features of the '<em>Relation Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_DEFINITION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Relation Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_DEFINITION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.gemoc.bcool.model.bcool.impl.BCoolLibraryImpl <em>BCool Library</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.bcool.model.bcool.impl.BCoolLibraryImpl
	 * @see org.gemoc.bcool.model.bcool.impl.BcoolPackageImpl#getBCoolLibrary()
	 * @generated
	 */
	int BCOOL_LIBRARY = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BCOOL_LIBRARY__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Expression Definitions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BCOOL_LIBRARY__EXPRESSION_DEFINITIONS = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Relation Definitions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BCOOL_LIBRARY__RELATION_DEFINITIONS = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Relation Declarations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BCOOL_LIBRARY__RELATION_DECLARATIONS = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Expression Declarations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BCOOL_LIBRARY__EXPRESSION_DECLARATIONS = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>BCool Library</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BCOOL_LIBRARY_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>BCool Library</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BCOOL_LIBRARY_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gemoc.bcool.model.bcool.impl.ImportInterfaceStatementImpl <em>Import Interface Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.bcool.model.bcool.impl.ImportInterfaceStatementImpl
	 * @see org.gemoc.bcool.model.bcool.impl.BcoolPackageImpl#getImportInterfaceStatement()
	 * @generated
	 */
	int IMPORT_INTERFACE_STATEMENT = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_INTERFACE_STATEMENT__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Import URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_INTERFACE_STATEMENT__IMPORT_URI = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Import Interface Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_INTERFACE_STATEMENT_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Import Interface Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_INTERFACE_STATEMENT_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gemoc.bcool.model.bcool.impl.ExpressionDeclarationImpl <em>Expression Declaration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.bcool.model.bcool.impl.ExpressionDeclarationImpl
	 * @see org.gemoc.bcool.model.bcool.impl.BcoolPackageImpl#getExpressionDeclaration()
	 * @generated
	 */
	int EXPRESSION_DECLARATION = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_DECLARATION__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Formal Parameters</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_DECLARATION__FORMAL_PARAMETERS = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Expression Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_DECLARATION_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Expression Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_DECLARATION_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gemoc.bcool.model.bcool.impl.RelationDeclarationImpl <em>Relation Declaration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.bcool.model.bcool.impl.RelationDeclarationImpl
	 * @see org.gemoc.bcool.model.bcool.impl.BcoolPackageImpl#getRelationDeclaration()
	 * @generated
	 */
	int RELATION_DECLARATION = 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_DECLARATION__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Formal Parameters</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_DECLARATION__FORMAL_PARAMETERS = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Relation Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_DECLARATION_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Relation Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_DECLARATION_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;


	/**
	 * The meta object id for the '{@link org.gemoc.bcool.model.bcool.impl.BCoolOperatorArgImpl <em>BCool Operator Arg</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.bcool.model.bcool.impl.BCoolOperatorArgImpl
	 * @see org.gemoc.bcool.model.bcool.impl.BcoolPackageImpl#getBCoolOperatorArg()
	 * @generated
	 */
	int BCOOL_OPERATOR_ARG = 15;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BCOOL_OPERATOR_ARG__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>DSE</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BCOOL_OPERATOR_ARG__DSE = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Interface</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BCOOL_OPERATOR_ARG__INTERFACE = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Interface Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BCOOL_OPERATOR_ARG__INTERFACE_CLASS = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>BCool Operator Arg</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BCOOL_OPERATOR_ARG_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>BCool Operator Arg</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BCOOL_OPERATOR_ARG_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link org.gemoc.bcool.model.bcool.BCoolOperator <em>BCool Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BCool Operator</em>'.
	 * @see org.gemoc.bcool.model.bcool.BCoolOperator
	 * @generated
	 */
	EClass getBCoolOperator();

	/**
	 * Returns the meta object for the containment reference list '{@link org.gemoc.bcool.model.bcool.BCoolOperator#getBcoolCompositionRules <em>Bcool Composition Rules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Bcool Composition Rules</em>'.
	 * @see org.gemoc.bcool.model.bcool.BCoolOperator#getBcoolCompositionRules()
	 * @see #getBCoolOperator()
	 * @generated
	 */
	EReference getBCoolOperator_BcoolCompositionRules();

	/**
	 * Returns the meta object for the containment reference list '{@link org.gemoc.bcool.model.bcool.BCoolOperator#getGlobalEventExpressions <em>Global Event Expressions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Global Event Expressions</em>'.
	 * @see org.gemoc.bcool.model.bcool.BCoolOperator#getGlobalEventExpressions()
	 * @see #getBCoolOperator()
	 * @generated
	 */
	EReference getBCoolOperator_GlobalEventExpressions();

	/**
	 * Returns the meta object for the containment reference list '{@link org.gemoc.bcool.model.bcool.BCoolOperator#getGlobalDSEs <em>Global DS Es</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Global DS Es</em>'.
	 * @see org.gemoc.bcool.model.bcool.BCoolOperator#getGlobalDSEs()
	 * @see #getBCoolOperator()
	 * @generated
	 */
	EReference getBCoolOperator_GlobalDSEs();

	/**
	 * Returns the meta object for class '{@link org.gemoc.bcool.model.bcool.BCoolCompositionRule <em>BCool Composition Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BCool Composition Rule</em>'.
	 * @see org.gemoc.bcool.model.bcool.BCoolCompositionRule
	 * @generated
	 */
	EClass getBCoolCompositionRule();

	/**
	 * Returns the meta object for the containment reference list '{@link org.gemoc.bcool.model.bcool.BCoolCompositionRule#getBCoolOperatorArgs <em>BCool Operator Args</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>BCool Operator Args</em>'.
	 * @see org.gemoc.bcool.model.bcool.BCoolCompositionRule#getBCoolOperatorArgs()
	 * @see #getBCoolCompositionRule()
	 * @generated
	 */
	EReference getBCoolCompositionRule_BCoolOperatorArgs();

	/**
	 * Returns the meta object for the containment reference '{@link org.gemoc.bcool.model.bcool.BCoolCompositionRule#getMatchingRule <em>Matching Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Matching Rule</em>'.
	 * @see org.gemoc.bcool.model.bcool.BCoolCompositionRule#getMatchingRule()
	 * @see #getBCoolCompositionRule()
	 * @generated
	 */
	EReference getBCoolCompositionRule_MatchingRule();

	/**
	 * Returns the meta object for the containment reference '{@link org.gemoc.bcool.model.bcool.BCoolCompositionRule#getCoordinationRule <em>Coordination Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Coordination Rule</em>'.
	 * @see org.gemoc.bcool.model.bcool.BCoolCompositionRule#getCoordinationRule()
	 * @see #getBCoolCompositionRule()
	 * @generated
	 */
	EReference getBCoolCompositionRule_CoordinationRule();

	/**
	 * Returns the meta object for class '{@link org.gemoc.bcool.model.bcool.BCoolSpecification <em>BCool Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BCool Specification</em>'.
	 * @see org.gemoc.bcool.model.bcool.BCoolSpecification
	 * @generated
	 */
	EClass getBCoolSpecification();

	/**
	 * Returns the meta object for the containment reference list '{@link org.gemoc.bcool.model.bcool.BCoolSpecification#getBcoolOperators <em>Bcool Operators</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Bcool Operators</em>'.
	 * @see org.gemoc.bcool.model.bcool.BCoolSpecification#getBcoolOperators()
	 * @see #getBCoolSpecification()
	 * @generated
	 */
	EReference getBCoolSpecification_BcoolOperators();

	/**
	 * Returns the meta object for the containment reference list '{@link org.gemoc.bcool.model.bcool.BCoolSpecification#getImportsLib <em>Imports Lib</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Imports Lib</em>'.
	 * @see org.gemoc.bcool.model.bcool.BCoolSpecification#getImportsLib()
	 * @see #getBCoolSpecification()
	 * @generated
	 */
	EReference getBCoolSpecification_ImportsLib();

	/**
	 * Returns the meta object for the containment reference list '{@link org.gemoc.bcool.model.bcool.BCoolSpecification#getImportsBehavioralInterface <em>Imports Behavioral Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Imports Behavioral Interface</em>'.
	 * @see org.gemoc.bcool.model.bcool.BCoolSpecification#getImportsBehavioralInterface()
	 * @see #getBCoolSpecification()
	 * @generated
	 */
	EReference getBCoolSpecification_ImportsBehavioralInterface();

	/**
	 * Returns the meta object for class '{@link org.gemoc.bcool.model.bcool.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Element</em>'.
	 * @see org.gemoc.bcool.model.bcool.NamedElement
	 * @generated
	 */
	EClass getNamedElement();

	/**
	 * Returns the meta object for the attribute '{@link org.gemoc.bcool.model.bcool.NamedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.gemoc.bcool.model.bcool.NamedElement#getName()
	 * @see #getNamedElement()
	 * @generated
	 */
	EAttribute getNamedElement_Name();

	/**
	 * Returns the meta object for class '{@link org.gemoc.bcool.model.bcool.ImportLibStatement <em>Import Lib Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Import Lib Statement</em>'.
	 * @see org.gemoc.bcool.model.bcool.ImportLibStatement
	 * @generated
	 */
	EClass getImportLibStatement();

	/**
	 * Returns the meta object for the attribute '{@link org.gemoc.bcool.model.bcool.ImportLibStatement#getImportURI <em>Import URI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Import URI</em>'.
	 * @see org.gemoc.bcool.model.bcool.ImportLibStatement#getImportURI()
	 * @see #getImportLibStatement()
	 * @generated
	 */
	EAttribute getImportLibStatement_ImportURI();

	/**
	 * Returns the meta object for class '{@link org.gemoc.bcool.model.bcool.MatchingRule <em>Matching Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Matching Rule</em>'.
	 * @see org.gemoc.bcool.model.bcool.MatchingRule
	 * @generated
	 */
	EClass getMatchingRule();

	/**
	 * Returns the meta object for the containment reference list '{@link org.gemoc.bcool.model.bcool.MatchingRule#getFilterEventExpressions <em>Filter Event Expressions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Filter Event Expressions</em>'.
	 * @see org.gemoc.bcool.model.bcool.MatchingRule#getFilterEventExpressions()
	 * @see #getMatchingRule()
	 * @generated
	 */
	EReference getMatchingRule_FilterEventExpressions();

	/**
	 * Returns the meta object for the containment reference '{@link org.gemoc.bcool.model.bcool.MatchingRule#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Condition</em>'.
	 * @see org.gemoc.bcool.model.bcool.MatchingRule#getCondition()
	 * @see #getMatchingRule()
	 * @generated
	 */
	EReference getMatchingRule_Condition();

	/**
	 * Returns the meta object for class '{@link org.gemoc.bcool.model.bcool.CoordinationRule <em>Coordination Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Coordination Rule</em>'.
	 * @see org.gemoc.bcool.model.bcool.CoordinationRule
	 * @generated
	 */
	EClass getCoordinationRule();

	/**
	 * Returns the meta object for the containment reference '{@link org.gemoc.bcool.model.bcool.CoordinationRule#getEventRelations <em>Event Relations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Event Relations</em>'.
	 * @see org.gemoc.bcool.model.bcool.CoordinationRule#getEventRelations()
	 * @see #getCoordinationRule()
	 * @generated
	 */
	EReference getCoordinationRule_EventRelations();

	/**
	 * Returns the meta object for class '{@link org.gemoc.bcool.model.bcool.EventExpression <em>Event Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event Expression</em>'.
	 * @see org.gemoc.bcool.model.bcool.EventExpression
	 * @generated
	 */
	EClass getEventExpression();

	/**
	 * Returns the meta object for the reference '{@link org.gemoc.bcool.model.bcool.EventExpression#getDeclaration <em>Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Declaration</em>'.
	 * @see org.gemoc.bcool.model.bcool.EventExpression#getDeclaration()
	 * @see #getEventExpression()
	 * @generated
	 */
	EReference getEventExpression_Declaration();

	/**
	 * Returns the meta object for the reference list '{@link org.gemoc.bcool.model.bcool.EventExpression#getActualParameters <em>Actual Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Actual Parameters</em>'.
	 * @see org.gemoc.bcool.model.bcool.EventExpression#getActualParameters()
	 * @see #getEventExpression()
	 * @generated
	 */
	EReference getEventExpression_ActualParameters();

	/**
	 * Returns the meta object for class '{@link org.gemoc.bcool.model.bcool.ExpressionDefinition <em>Expression Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression Definition</em>'.
	 * @see org.gemoc.bcool.model.bcool.ExpressionDefinition
	 * @generated
	 */
	EClass getExpressionDefinition();

	/**
	 * Returns the meta object for the reference '{@link org.gemoc.bcool.model.bcool.ExpressionDefinition#getDefinition <em>Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Definition</em>'.
	 * @see org.gemoc.bcool.model.bcool.ExpressionDefinition#getDefinition()
	 * @see #getExpressionDefinition()
	 * @generated
	 */
	EReference getExpressionDefinition_Definition();

	/**
	 * Returns the meta object for class '{@link org.gemoc.bcool.model.bcool.EventRelation <em>Event Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event Relation</em>'.
	 * @see org.gemoc.bcool.model.bcool.EventRelation
	 * @generated
	 */
	EClass getEventRelation();

	/**
	 * Returns the meta object for the reference '{@link org.gemoc.bcool.model.bcool.EventRelation#getDeclaration <em>Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Declaration</em>'.
	 * @see org.gemoc.bcool.model.bcool.EventRelation#getDeclaration()
	 * @see #getEventRelation()
	 * @generated
	 */
	EReference getEventRelation_Declaration();

	/**
	 * Returns the meta object for the reference list '{@link org.gemoc.bcool.model.bcool.EventRelation#getActualParameters <em>Actual Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Actual Parameters</em>'.
	 * @see org.gemoc.bcool.model.bcool.EventRelation#getActualParameters()
	 * @see #getEventRelation()
	 * @generated
	 */
	EReference getEventRelation_ActualParameters();

	/**
	 * Returns the meta object for class '{@link org.gemoc.bcool.model.bcool.RelationDefinition <em>Relation Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relation Definition</em>'.
	 * @see org.gemoc.bcool.model.bcool.RelationDefinition
	 * @generated
	 */
	EClass getRelationDefinition();

	/**
	 * Returns the meta object for the reference '{@link org.gemoc.bcool.model.bcool.RelationDefinition#getDefinition <em>Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Definition</em>'.
	 * @see org.gemoc.bcool.model.bcool.RelationDefinition#getDefinition()
	 * @see #getRelationDefinition()
	 * @generated
	 */
	EReference getRelationDefinition_Definition();

	/**
	 * Returns the meta object for class '{@link org.gemoc.bcool.model.bcool.BCoolLibrary <em>BCool Library</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BCool Library</em>'.
	 * @see org.gemoc.bcool.model.bcool.BCoolLibrary
	 * @generated
	 */
	EClass getBCoolLibrary();

	/**
	 * Returns the meta object for the containment reference list '{@link org.gemoc.bcool.model.bcool.BCoolLibrary#getExpressionDefinitions <em>Expression Definitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Expression Definitions</em>'.
	 * @see org.gemoc.bcool.model.bcool.BCoolLibrary#getExpressionDefinitions()
	 * @see #getBCoolLibrary()
	 * @generated
	 */
	EReference getBCoolLibrary_ExpressionDefinitions();

	/**
	 * Returns the meta object for the containment reference list '{@link org.gemoc.bcool.model.bcool.BCoolLibrary#getRelationDefinitions <em>Relation Definitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Relation Definitions</em>'.
	 * @see org.gemoc.bcool.model.bcool.BCoolLibrary#getRelationDefinitions()
	 * @see #getBCoolLibrary()
	 * @generated
	 */
	EReference getBCoolLibrary_RelationDefinitions();

	/**
	 * Returns the meta object for the containment reference list '{@link org.gemoc.bcool.model.bcool.BCoolLibrary#getRelationDeclarations <em>Relation Declarations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Relation Declarations</em>'.
	 * @see org.gemoc.bcool.model.bcool.BCoolLibrary#getRelationDeclarations()
	 * @see #getBCoolLibrary()
	 * @generated
	 */
	EReference getBCoolLibrary_RelationDeclarations();

	/**
	 * Returns the meta object for the containment reference list '{@link org.gemoc.bcool.model.bcool.BCoolLibrary#getExpressionDeclarations <em>Expression Declarations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Expression Declarations</em>'.
	 * @see org.gemoc.bcool.model.bcool.BCoolLibrary#getExpressionDeclarations()
	 * @see #getBCoolLibrary()
	 * @generated
	 */
	EReference getBCoolLibrary_ExpressionDeclarations();

	/**
	 * Returns the meta object for class '{@link org.gemoc.bcool.model.bcool.ImportInterfaceStatement <em>Import Interface Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Import Interface Statement</em>'.
	 * @see org.gemoc.bcool.model.bcool.ImportInterfaceStatement
	 * @generated
	 */
	EClass getImportInterfaceStatement();

	/**
	 * Returns the meta object for the attribute '{@link org.gemoc.bcool.model.bcool.ImportInterfaceStatement#getImportURI <em>Import URI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Import URI</em>'.
	 * @see org.gemoc.bcool.model.bcool.ImportInterfaceStatement#getImportURI()
	 * @see #getImportInterfaceStatement()
	 * @generated
	 */
	EAttribute getImportInterfaceStatement_ImportURI();

	/**
	 * Returns the meta object for class '{@link org.gemoc.bcool.model.bcool.ExpressionDeclaration <em>Expression Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression Declaration</em>'.
	 * @see org.gemoc.bcool.model.bcool.ExpressionDeclaration
	 * @generated
	 */
	EClass getExpressionDeclaration();

	/**
	 * Returns the meta object for the reference list '{@link org.gemoc.bcool.model.bcool.ExpressionDeclaration#getFormalParameters <em>Formal Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Formal Parameters</em>'.
	 * @see org.gemoc.bcool.model.bcool.ExpressionDeclaration#getFormalParameters()
	 * @see #getExpressionDeclaration()
	 * @generated
	 */
	EReference getExpressionDeclaration_FormalParameters();

	/**
	 * Returns the meta object for class '{@link org.gemoc.bcool.model.bcool.RelationDeclaration <em>Relation Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relation Declaration</em>'.
	 * @see org.gemoc.bcool.model.bcool.RelationDeclaration
	 * @generated
	 */
	EClass getRelationDeclaration();

	/**
	 * Returns the meta object for the reference list '{@link org.gemoc.bcool.model.bcool.RelationDeclaration#getFormalParameters <em>Formal Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Formal Parameters</em>'.
	 * @see org.gemoc.bcool.model.bcool.RelationDeclaration#getFormalParameters()
	 * @see #getRelationDeclaration()
	 * @generated
	 */
	EReference getRelationDeclaration_FormalParameters();

	/**
	 * Returns the meta object for class '{@link org.gemoc.bcool.model.bcool.BCoolOperatorArg <em>BCool Operator Arg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BCool Operator Arg</em>'.
	 * @see org.gemoc.bcool.model.bcool.BCoolOperatorArg
	 * @generated
	 */
	EClass getBCoolOperatorArg();

	/**
	 * Returns the meta object for the reference '{@link org.gemoc.bcool.model.bcool.BCoolOperatorArg#getDSE <em>DSE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>DSE</em>'.
	 * @see org.gemoc.bcool.model.bcool.BCoolOperatorArg#getDSE()
	 * @see #getBCoolOperatorArg()
	 * @generated
	 */
	EReference getBCoolOperatorArg_DSE();

	/**
	 * Returns the meta object for the reference '{@link org.gemoc.bcool.model.bcool.BCoolOperatorArg#getInterface <em>Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Interface</em>'.
	 * @see org.gemoc.bcool.model.bcool.BCoolOperatorArg#getInterface()
	 * @see #getBCoolOperatorArg()
	 * @generated
	 */
	EReference getBCoolOperatorArg_Interface();

	/**
	 * Returns the meta object for the reference '{@link org.gemoc.bcool.model.bcool.BCoolOperatorArg#getInterfaceClass <em>Interface Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Interface Class</em>'.
	 * @see org.gemoc.bcool.model.bcool.BCoolOperatorArg#getInterfaceClass()
	 * @see #getBCoolOperatorArg()
	 * @generated
	 */
	EReference getBCoolOperatorArg_InterfaceClass();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	BcoolFactory getBcoolFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.gemoc.bcool.model.bcool.impl.BCoolOperatorImpl <em>BCool Operator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.bcool.model.bcool.impl.BCoolOperatorImpl
		 * @see org.gemoc.bcool.model.bcool.impl.BcoolPackageImpl#getBCoolOperator()
		 * @generated
		 */
		EClass BCOOL_OPERATOR = eINSTANCE.getBCoolOperator();

		/**
		 * The meta object literal for the '<em><b>Bcool Composition Rules</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BCOOL_OPERATOR__BCOOL_COMPOSITION_RULES = eINSTANCE.getBCoolOperator_BcoolCompositionRules();

		/**
		 * The meta object literal for the '<em><b>Global Event Expressions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BCOOL_OPERATOR__GLOBAL_EVENT_EXPRESSIONS = eINSTANCE.getBCoolOperator_GlobalEventExpressions();

		/**
		 * The meta object literal for the '<em><b>Global DS Es</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BCOOL_OPERATOR__GLOBAL_DS_ES = eINSTANCE.getBCoolOperator_GlobalDSEs();

		/**
		 * The meta object literal for the '{@link org.gemoc.bcool.model.bcool.impl.BCoolCompositionRuleImpl <em>BCool Composition Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.bcool.model.bcool.impl.BCoolCompositionRuleImpl
		 * @see org.gemoc.bcool.model.bcool.impl.BcoolPackageImpl#getBCoolCompositionRule()
		 * @generated
		 */
		EClass BCOOL_COMPOSITION_RULE = eINSTANCE.getBCoolCompositionRule();

		/**
		 * The meta object literal for the '<em><b>BCool Operator Args</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BCOOL_COMPOSITION_RULE__BCOOL_OPERATOR_ARGS = eINSTANCE.getBCoolCompositionRule_BCoolOperatorArgs();

		/**
		 * The meta object literal for the '<em><b>Matching Rule</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BCOOL_COMPOSITION_RULE__MATCHING_RULE = eINSTANCE.getBCoolCompositionRule_MatchingRule();

		/**
		 * The meta object literal for the '<em><b>Coordination Rule</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BCOOL_COMPOSITION_RULE__COORDINATION_RULE = eINSTANCE.getBCoolCompositionRule_CoordinationRule();

		/**
		 * The meta object literal for the '{@link org.gemoc.bcool.model.bcool.impl.BCoolSpecificationImpl <em>BCool Specification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.bcool.model.bcool.impl.BCoolSpecificationImpl
		 * @see org.gemoc.bcool.model.bcool.impl.BcoolPackageImpl#getBCoolSpecification()
		 * @generated
		 */
		EClass BCOOL_SPECIFICATION = eINSTANCE.getBCoolSpecification();

		/**
		 * The meta object literal for the '<em><b>Bcool Operators</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BCOOL_SPECIFICATION__BCOOL_OPERATORS = eINSTANCE.getBCoolSpecification_BcoolOperators();

		/**
		 * The meta object literal for the '<em><b>Imports Lib</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BCOOL_SPECIFICATION__IMPORTS_LIB = eINSTANCE.getBCoolSpecification_ImportsLib();

		/**
		 * The meta object literal for the '<em><b>Imports Behavioral Interface</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BCOOL_SPECIFICATION__IMPORTS_BEHAVIORAL_INTERFACE = eINSTANCE.getBCoolSpecification_ImportsBehavioralInterface();

		/**
		 * The meta object literal for the '{@link org.gemoc.bcool.model.bcool.impl.NamedElementImpl <em>Named Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.bcool.model.bcool.impl.NamedElementImpl
		 * @see org.gemoc.bcool.model.bcool.impl.BcoolPackageImpl#getNamedElement()
		 * @generated
		 */
		EClass NAMED_ELEMENT = eINSTANCE.getNamedElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_ELEMENT__NAME = eINSTANCE.getNamedElement_Name();

		/**
		 * The meta object literal for the '{@link org.gemoc.bcool.model.bcool.impl.ImportLibStatementImpl <em>Import Lib Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.bcool.model.bcool.impl.ImportLibStatementImpl
		 * @see org.gemoc.bcool.model.bcool.impl.BcoolPackageImpl#getImportLibStatement()
		 * @generated
		 */
		EClass IMPORT_LIB_STATEMENT = eINSTANCE.getImportLibStatement();

		/**
		 * The meta object literal for the '<em><b>Import URI</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMPORT_LIB_STATEMENT__IMPORT_URI = eINSTANCE.getImportLibStatement_ImportURI();

		/**
		 * The meta object literal for the '{@link org.gemoc.bcool.model.bcool.impl.MatchingRuleImpl <em>Matching Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.bcool.model.bcool.impl.MatchingRuleImpl
		 * @see org.gemoc.bcool.model.bcool.impl.BcoolPackageImpl#getMatchingRule()
		 * @generated
		 */
		EClass MATCHING_RULE = eINSTANCE.getMatchingRule();

		/**
		 * The meta object literal for the '<em><b>Filter Event Expressions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MATCHING_RULE__FILTER_EVENT_EXPRESSIONS = eINSTANCE.getMatchingRule_FilterEventExpressions();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MATCHING_RULE__CONDITION = eINSTANCE.getMatchingRule_Condition();

		/**
		 * The meta object literal for the '{@link org.gemoc.bcool.model.bcool.impl.CoordinationRuleImpl <em>Coordination Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.bcool.model.bcool.impl.CoordinationRuleImpl
		 * @see org.gemoc.bcool.model.bcool.impl.BcoolPackageImpl#getCoordinationRule()
		 * @generated
		 */
		EClass COORDINATION_RULE = eINSTANCE.getCoordinationRule();

		/**
		 * The meta object literal for the '<em><b>Event Relations</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COORDINATION_RULE__EVENT_RELATIONS = eINSTANCE.getCoordinationRule_EventRelations();

		/**
		 * The meta object literal for the '{@link org.gemoc.bcool.model.bcool.impl.EventExpressionImpl <em>Event Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.bcool.model.bcool.impl.EventExpressionImpl
		 * @see org.gemoc.bcool.model.bcool.impl.BcoolPackageImpl#getEventExpression()
		 * @generated
		 */
		EClass EVENT_EXPRESSION = eINSTANCE.getEventExpression();

		/**
		 * The meta object literal for the '<em><b>Declaration</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVENT_EXPRESSION__DECLARATION = eINSTANCE.getEventExpression_Declaration();

		/**
		 * The meta object literal for the '<em><b>Actual Parameters</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVENT_EXPRESSION__ACTUAL_PARAMETERS = eINSTANCE.getEventExpression_ActualParameters();

		/**
		 * The meta object literal for the '{@link org.gemoc.bcool.model.bcool.impl.ExpressionDefinitionImpl <em>Expression Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.bcool.model.bcool.impl.ExpressionDefinitionImpl
		 * @see org.gemoc.bcool.model.bcool.impl.BcoolPackageImpl#getExpressionDefinition()
		 * @generated
		 */
		EClass EXPRESSION_DEFINITION = eINSTANCE.getExpressionDefinition();

		/**
		 * The meta object literal for the '<em><b>Definition</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPRESSION_DEFINITION__DEFINITION = eINSTANCE.getExpressionDefinition_Definition();

		/**
		 * The meta object literal for the '{@link org.gemoc.bcool.model.bcool.impl.EventRelationImpl <em>Event Relation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.bcool.model.bcool.impl.EventRelationImpl
		 * @see org.gemoc.bcool.model.bcool.impl.BcoolPackageImpl#getEventRelation()
		 * @generated
		 */
		EClass EVENT_RELATION = eINSTANCE.getEventRelation();

		/**
		 * The meta object literal for the '<em><b>Declaration</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVENT_RELATION__DECLARATION = eINSTANCE.getEventRelation_Declaration();

		/**
		 * The meta object literal for the '<em><b>Actual Parameters</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVENT_RELATION__ACTUAL_PARAMETERS = eINSTANCE.getEventRelation_ActualParameters();

		/**
		 * The meta object literal for the '{@link org.gemoc.bcool.model.bcool.impl.RelationDefinitionImpl <em>Relation Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.bcool.model.bcool.impl.RelationDefinitionImpl
		 * @see org.gemoc.bcool.model.bcool.impl.BcoolPackageImpl#getRelationDefinition()
		 * @generated
		 */
		EClass RELATION_DEFINITION = eINSTANCE.getRelationDefinition();

		/**
		 * The meta object literal for the '<em><b>Definition</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATION_DEFINITION__DEFINITION = eINSTANCE.getRelationDefinition_Definition();

		/**
		 * The meta object literal for the '{@link org.gemoc.bcool.model.bcool.impl.BCoolLibraryImpl <em>BCool Library</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.bcool.model.bcool.impl.BCoolLibraryImpl
		 * @see org.gemoc.bcool.model.bcool.impl.BcoolPackageImpl#getBCoolLibrary()
		 * @generated
		 */
		EClass BCOOL_LIBRARY = eINSTANCE.getBCoolLibrary();

		/**
		 * The meta object literal for the '<em><b>Expression Definitions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BCOOL_LIBRARY__EXPRESSION_DEFINITIONS = eINSTANCE.getBCoolLibrary_ExpressionDefinitions();

		/**
		 * The meta object literal for the '<em><b>Relation Definitions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BCOOL_LIBRARY__RELATION_DEFINITIONS = eINSTANCE.getBCoolLibrary_RelationDefinitions();

		/**
		 * The meta object literal for the '<em><b>Relation Declarations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BCOOL_LIBRARY__RELATION_DECLARATIONS = eINSTANCE.getBCoolLibrary_RelationDeclarations();

		/**
		 * The meta object literal for the '<em><b>Expression Declarations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BCOOL_LIBRARY__EXPRESSION_DECLARATIONS = eINSTANCE.getBCoolLibrary_ExpressionDeclarations();

		/**
		 * The meta object literal for the '{@link org.gemoc.bcool.model.bcool.impl.ImportInterfaceStatementImpl <em>Import Interface Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.bcool.model.bcool.impl.ImportInterfaceStatementImpl
		 * @see org.gemoc.bcool.model.bcool.impl.BcoolPackageImpl#getImportInterfaceStatement()
		 * @generated
		 */
		EClass IMPORT_INTERFACE_STATEMENT = eINSTANCE.getImportInterfaceStatement();

		/**
		 * The meta object literal for the '<em><b>Import URI</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMPORT_INTERFACE_STATEMENT__IMPORT_URI = eINSTANCE.getImportInterfaceStatement_ImportURI();

		/**
		 * The meta object literal for the '{@link org.gemoc.bcool.model.bcool.impl.ExpressionDeclarationImpl <em>Expression Declaration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.bcool.model.bcool.impl.ExpressionDeclarationImpl
		 * @see org.gemoc.bcool.model.bcool.impl.BcoolPackageImpl#getExpressionDeclaration()
		 * @generated
		 */
		EClass EXPRESSION_DECLARATION = eINSTANCE.getExpressionDeclaration();

		/**
		 * The meta object literal for the '<em><b>Formal Parameters</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPRESSION_DECLARATION__FORMAL_PARAMETERS = eINSTANCE.getExpressionDeclaration_FormalParameters();

		/**
		 * The meta object literal for the '{@link org.gemoc.bcool.model.bcool.impl.RelationDeclarationImpl <em>Relation Declaration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.bcool.model.bcool.impl.RelationDeclarationImpl
		 * @see org.gemoc.bcool.model.bcool.impl.BcoolPackageImpl#getRelationDeclaration()
		 * @generated
		 */
		EClass RELATION_DECLARATION = eINSTANCE.getRelationDeclaration();

		/**
		 * The meta object literal for the '<em><b>Formal Parameters</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATION_DECLARATION__FORMAL_PARAMETERS = eINSTANCE.getRelationDeclaration_FormalParameters();

		/**
		 * The meta object literal for the '{@link org.gemoc.bcool.model.bcool.impl.BCoolOperatorArgImpl <em>BCool Operator Arg</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.bcool.model.bcool.impl.BCoolOperatorArgImpl
		 * @see org.gemoc.bcool.model.bcool.impl.BcoolPackageImpl#getBCoolOperatorArg()
		 * @generated
		 */
		EClass BCOOL_OPERATOR_ARG = eINSTANCE.getBCoolOperatorArg();

		/**
		 * The meta object literal for the '<em><b>DSE</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BCOOL_OPERATOR_ARG__DSE = eINSTANCE.getBCoolOperatorArg_DSE();

		/**
		 * The meta object literal for the '<em><b>Interface</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BCOOL_OPERATOR_ARG__INTERFACE = eINSTANCE.getBCoolOperatorArg_Interface();

		/**
		 * The meta object literal for the '<em><b>Interface Class</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BCOOL_OPERATOR_ARG__INTERFACE_CLASS = eINSTANCE.getBCoolOperatorArg_InterfaceClass();

	}

} //BcoolPackage
