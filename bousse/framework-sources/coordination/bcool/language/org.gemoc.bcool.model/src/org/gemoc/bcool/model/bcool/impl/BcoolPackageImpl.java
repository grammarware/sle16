/**
 */
package org.gemoc.bcool.model.bcool.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.ocl.examples.xtext.completeocl.completeoclcs.CompleteOCLCSPackage;
import org.gemoc.bcool.model.bcool.BCoolCompositionRule;
import org.gemoc.bcool.model.bcool.BCoolLibrary;
import org.gemoc.bcool.model.bcool.BCoolOperator;
import org.gemoc.bcool.model.bcool.BCoolOperatorArg;
import org.gemoc.bcool.model.bcool.BCoolSpecification;
import org.gemoc.bcool.model.bcool.BcoolFactory;
import org.gemoc.bcool.model.bcool.BcoolPackage;
import org.gemoc.bcool.model.bcool.CoordinationRule;
import org.gemoc.bcool.model.bcool.EventExpression;
import org.gemoc.bcool.model.bcool.EventRelation;
import org.gemoc.bcool.model.bcool.ExpressionDeclaration;
import org.gemoc.bcool.model.bcool.ExpressionDefinition;
import org.gemoc.bcool.model.bcool.ImportInterfaceStatement;
import org.gemoc.bcool.model.bcool.ImportLibStatement;
import org.gemoc.bcool.model.bcool.MatchingRule;
import org.gemoc.bcool.model.bcool.NamedElement;
import org.gemoc.bcool.model.bcool.RelationDeclaration;
import org.gemoc.bcool.model.bcool.RelationDefinition;
import org.gemoc.gexpressions.GexpressionsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class BcoolPackageImpl extends EPackageImpl implements BcoolPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bCoolOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bCoolCompositionRuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bCoolSpecificationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass namedElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass importLibStatementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass matchingRuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass coordinationRuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eventExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass expressionDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eventRelationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relationDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bCoolLibraryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass importInterfaceStatementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass expressionDeclarationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relationDeclarationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bCoolOperatorArgEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.gemoc.bcool.model.bcool.BcoolPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private BcoolPackageImpl() {
		super(eNS_URI, BcoolFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link BcoolPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static BcoolPackage init() {
		if (isInited) return (BcoolPackage)EPackage.Registry.INSTANCE.getEPackage(BcoolPackage.eNS_URI);

		// Obtain or create and register package
		BcoolPackageImpl theBcoolPackage = (BcoolPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof BcoolPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new BcoolPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		CompleteOCLCSPackage.eINSTANCE.eClass();
		GexpressionsPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theBcoolPackage.createPackageContents();

		// Initialize created meta-data
		theBcoolPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theBcoolPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(BcoolPackage.eNS_URI, theBcoolPackage);
		return theBcoolPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBCoolOperator() {
		return bCoolOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBCoolOperator_BcoolCompositionRules() {
		return (EReference)bCoolOperatorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBCoolOperator_GlobalEventExpressions() {
		return (EReference)bCoolOperatorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBCoolOperator_GlobalDSEs() {
		return (EReference)bCoolOperatorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBCoolCompositionRule() {
		return bCoolCompositionRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBCoolCompositionRule_BCoolOperatorArgs() {
		return (EReference)bCoolCompositionRuleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBCoolCompositionRule_MatchingRule() {
		return (EReference)bCoolCompositionRuleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBCoolCompositionRule_CoordinationRule() {
		return (EReference)bCoolCompositionRuleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBCoolSpecification() {
		return bCoolSpecificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBCoolSpecification_BcoolOperators() {
		return (EReference)bCoolSpecificationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBCoolSpecification_ImportsLib() {
		return (EReference)bCoolSpecificationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBCoolSpecification_ImportsBehavioralInterface() {
		return (EReference)bCoolSpecificationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNamedElement() {
		return namedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNamedElement_Name() {
		return (EAttribute)namedElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImportLibStatement() {
		return importLibStatementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImportLibStatement_ImportURI() {
		return (EAttribute)importLibStatementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMatchingRule() {
		return matchingRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMatchingRule_FilterEventExpressions() {
		return (EReference)matchingRuleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMatchingRule_Condition() {
		return (EReference)matchingRuleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCoordinationRule() {
		return coordinationRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCoordinationRule_EventRelations() {
		return (EReference)coordinationRuleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEventExpression() {
		return eventExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEventExpression_Declaration() {
		return (EReference)eventExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEventExpression_ActualParameters() {
		return (EReference)eventExpressionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExpressionDefinition() {
		return expressionDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExpressionDefinition_Definition() {
		return (EReference)expressionDefinitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEventRelation() {
		return eventRelationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEventRelation_Declaration() {
		return (EReference)eventRelationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEventRelation_ActualParameters() {
		return (EReference)eventRelationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRelationDefinition() {
		return relationDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelationDefinition_Definition() {
		return (EReference)relationDefinitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBCoolLibrary() {
		return bCoolLibraryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBCoolLibrary_ExpressionDefinitions() {
		return (EReference)bCoolLibraryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBCoolLibrary_RelationDefinitions() {
		return (EReference)bCoolLibraryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBCoolLibrary_RelationDeclarations() {
		return (EReference)bCoolLibraryEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBCoolLibrary_ExpressionDeclarations() {
		return (EReference)bCoolLibraryEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImportInterfaceStatement() {
		return importInterfaceStatementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImportInterfaceStatement_ImportURI() {
		return (EAttribute)importInterfaceStatementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExpressionDeclaration() {
		return expressionDeclarationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExpressionDeclaration_FormalParameters() {
		return (EReference)expressionDeclarationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRelationDeclaration() {
		return relationDeclarationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelationDeclaration_FormalParameters() {
		return (EReference)relationDeclarationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBCoolOperatorArg() {
		return bCoolOperatorArgEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBCoolOperatorArg_DSE() {
		return (EReference)bCoolOperatorArgEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBCoolOperatorArg_Interface() {
		return (EReference)bCoolOperatorArgEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBCoolOperatorArg_InterfaceClass() {
		return (EReference)bCoolOperatorArgEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BcoolFactory getBcoolFactory() {
		return (BcoolFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		bCoolOperatorEClass = createEClass(BCOOL_OPERATOR);
		createEReference(bCoolOperatorEClass, BCOOL_OPERATOR__BCOOL_COMPOSITION_RULES);
		createEReference(bCoolOperatorEClass, BCOOL_OPERATOR__GLOBAL_EVENT_EXPRESSIONS);
		createEReference(bCoolOperatorEClass, BCOOL_OPERATOR__GLOBAL_DS_ES);

		bCoolCompositionRuleEClass = createEClass(BCOOL_COMPOSITION_RULE);
		createEReference(bCoolCompositionRuleEClass, BCOOL_COMPOSITION_RULE__BCOOL_OPERATOR_ARGS);
		createEReference(bCoolCompositionRuleEClass, BCOOL_COMPOSITION_RULE__MATCHING_RULE);
		createEReference(bCoolCompositionRuleEClass, BCOOL_COMPOSITION_RULE__COORDINATION_RULE);

		bCoolSpecificationEClass = createEClass(BCOOL_SPECIFICATION);
		createEReference(bCoolSpecificationEClass, BCOOL_SPECIFICATION__BCOOL_OPERATORS);
		createEReference(bCoolSpecificationEClass, BCOOL_SPECIFICATION__IMPORTS_LIB);
		createEReference(bCoolSpecificationEClass, BCOOL_SPECIFICATION__IMPORTS_BEHAVIORAL_INTERFACE);

		namedElementEClass = createEClass(NAMED_ELEMENT);
		createEAttribute(namedElementEClass, NAMED_ELEMENT__NAME);

		importLibStatementEClass = createEClass(IMPORT_LIB_STATEMENT);
		createEAttribute(importLibStatementEClass, IMPORT_LIB_STATEMENT__IMPORT_URI);

		matchingRuleEClass = createEClass(MATCHING_RULE);
		createEReference(matchingRuleEClass, MATCHING_RULE__FILTER_EVENT_EXPRESSIONS);
		createEReference(matchingRuleEClass, MATCHING_RULE__CONDITION);

		coordinationRuleEClass = createEClass(COORDINATION_RULE);
		createEReference(coordinationRuleEClass, COORDINATION_RULE__EVENT_RELATIONS);

		eventExpressionEClass = createEClass(EVENT_EXPRESSION);
		createEReference(eventExpressionEClass, EVENT_EXPRESSION__DECLARATION);
		createEReference(eventExpressionEClass, EVENT_EXPRESSION__ACTUAL_PARAMETERS);

		expressionDefinitionEClass = createEClass(EXPRESSION_DEFINITION);
		createEReference(expressionDefinitionEClass, EXPRESSION_DEFINITION__DEFINITION);

		eventRelationEClass = createEClass(EVENT_RELATION);
		createEReference(eventRelationEClass, EVENT_RELATION__DECLARATION);
		createEReference(eventRelationEClass, EVENT_RELATION__ACTUAL_PARAMETERS);

		relationDefinitionEClass = createEClass(RELATION_DEFINITION);
		createEReference(relationDefinitionEClass, RELATION_DEFINITION__DEFINITION);

		bCoolLibraryEClass = createEClass(BCOOL_LIBRARY);
		createEReference(bCoolLibraryEClass, BCOOL_LIBRARY__EXPRESSION_DEFINITIONS);
		createEReference(bCoolLibraryEClass, BCOOL_LIBRARY__RELATION_DEFINITIONS);
		createEReference(bCoolLibraryEClass, BCOOL_LIBRARY__RELATION_DECLARATIONS);
		createEReference(bCoolLibraryEClass, BCOOL_LIBRARY__EXPRESSION_DECLARATIONS);

		importInterfaceStatementEClass = createEClass(IMPORT_INTERFACE_STATEMENT);
		createEAttribute(importInterfaceStatementEClass, IMPORT_INTERFACE_STATEMENT__IMPORT_URI);

		expressionDeclarationEClass = createEClass(EXPRESSION_DECLARATION);
		createEReference(expressionDeclarationEClass, EXPRESSION_DECLARATION__FORMAL_PARAMETERS);

		relationDeclarationEClass = createEClass(RELATION_DECLARATION);
		createEReference(relationDeclarationEClass, RELATION_DECLARATION__FORMAL_PARAMETERS);

		bCoolOperatorArgEClass = createEClass(BCOOL_OPERATOR_ARG);
		createEReference(bCoolOperatorArgEClass, BCOOL_OPERATOR_ARG__DSE);
		createEReference(bCoolOperatorArgEClass, BCOOL_OPERATOR_ARG__INTERFACE);
		createEReference(bCoolOperatorArgEClass, BCOOL_OPERATOR_ARG__INTERFACE_CLASS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		CompleteOCLCSPackage theCompleteOCLCSPackage = (CompleteOCLCSPackage)EPackage.Registry.INSTANCE.getEPackage(CompleteOCLCSPackage.eNS_URI);
		GexpressionsPackage theGexpressionsPackage = (GexpressionsPackage)EPackage.Registry.INSTANCE.getEPackage(GexpressionsPackage.eNS_URI);
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		bCoolOperatorEClass.getESuperTypes().add(this.getNamedElement());
		bCoolCompositionRuleEClass.getESuperTypes().add(this.getNamedElement());
		bCoolSpecificationEClass.getESuperTypes().add(this.getNamedElement());
		eventExpressionEClass.getESuperTypes().add(this.getNamedElement());
		eventRelationEClass.getESuperTypes().add(this.getNamedElement());
		bCoolLibraryEClass.getESuperTypes().add(this.getNamedElement());
		importInterfaceStatementEClass.getESuperTypes().add(this.getNamedElement());
		expressionDeclarationEClass.getESuperTypes().add(this.getNamedElement());
		relationDeclarationEClass.getESuperTypes().add(this.getNamedElement());
		bCoolOperatorArgEClass.getESuperTypes().add(this.getNamedElement());

		// Initialize classes, features, and operations; add parameters
		initEClass(bCoolOperatorEClass, BCoolOperator.class, "BCoolOperator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBCoolOperator_BcoolCompositionRules(), this.getBCoolCompositionRule(), null, "bcoolCompositionRules", null, 0, -1, BCoolOperator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBCoolOperator_GlobalEventExpressions(), this.getEventExpression(), null, "globalEventExpressions", null, 0, -1, BCoolOperator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBCoolOperator_GlobalDSEs(), theCompleteOCLCSPackage.getDefPropertyCS(), null, "globalDSEs", null, 0, -1, BCoolOperator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bCoolCompositionRuleEClass, BCoolCompositionRule.class, "BCoolCompositionRule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBCoolCompositionRule_BCoolOperatorArgs(), this.getBCoolOperatorArg(), null, "BCoolOperatorArgs", null, 0, -1, BCoolCompositionRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBCoolCompositionRule_MatchingRule(), this.getMatchingRule(), null, "matchingRule", null, 1, 1, BCoolCompositionRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBCoolCompositionRule_CoordinationRule(), this.getCoordinationRule(), null, "coordinationRule", null, 1, 1, BCoolCompositionRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bCoolSpecificationEClass, BCoolSpecification.class, "BCoolSpecification", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBCoolSpecification_BcoolOperators(), this.getBCoolOperator(), null, "bcoolOperators", null, 0, -1, BCoolSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBCoolSpecification_ImportsLib(), this.getImportLibStatement(), null, "importsLib", null, 0, -1, BCoolSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBCoolSpecification_ImportsBehavioralInterface(), this.getImportInterfaceStatement(), null, "importsBehavioralInterface", null, 1, -1, BCoolSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(namedElementEClass, NamedElement.class, "NamedElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNamedElement_Name(), ecorePackage.getEString(), "name", null, 0, 1, NamedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(importLibStatementEClass, ImportLibStatement.class, "ImportLibStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getImportLibStatement_ImportURI(), ecorePackage.getEString(), "importURI", null, 1, 1, ImportLibStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(matchingRuleEClass, MatchingRule.class, "MatchingRule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMatchingRule_FilterEventExpressions(), this.getEventExpression(), null, "filterEventExpressions", null, 0, -1, MatchingRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMatchingRule_Condition(), theGexpressionsPackage.getGExpression(), null, "condition", null, 1, 1, MatchingRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(coordinationRuleEClass, CoordinationRule.class, "CoordinationRule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCoordinationRule_EventRelations(), this.getEventRelation(), null, "eventRelations", null, 1, 1, CoordinationRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eventExpressionEClass, EventExpression.class, "EventExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEventExpression_Declaration(), this.getExpressionDeclaration(), null, "declaration", null, 1, 1, EventExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEventExpression_ActualParameters(), ecorePackage.getEObject(), null, "actualParameters", null, 0, -1, EventExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(expressionDefinitionEClass, ExpressionDefinition.class, "ExpressionDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExpressionDefinition_Definition(), this.getExpressionDeclaration(), null, "definition", null, 1, 1, ExpressionDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eventRelationEClass, EventRelation.class, "EventRelation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEventRelation_Declaration(), this.getRelationDeclaration(), null, "declaration", null, 1, 1, EventRelation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEventRelation_ActualParameters(), ecorePackage.getEObject(), null, "actualParameters", null, 0, -1, EventRelation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(relationDefinitionEClass, RelationDefinition.class, "RelationDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRelationDefinition_Definition(), this.getRelationDeclaration(), null, "definition", null, 1, 1, RelationDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bCoolLibraryEClass, BCoolLibrary.class, "BCoolLibrary", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBCoolLibrary_ExpressionDefinitions(), this.getExpressionDefinition(), null, "expressionDefinitions", null, 0, -1, BCoolLibrary.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBCoolLibrary_RelationDefinitions(), this.getRelationDefinition(), null, "relationDefinitions", null, 0, -1, BCoolLibrary.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBCoolLibrary_RelationDeclarations(), this.getRelationDeclaration(), null, "relationDeclarations", null, 0, -1, BCoolLibrary.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBCoolLibrary_ExpressionDeclarations(), this.getExpressionDeclaration(), null, "expressionDeclarations", null, 0, -1, BCoolLibrary.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(importInterfaceStatementEClass, ImportInterfaceStatement.class, "ImportInterfaceStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getImportInterfaceStatement_ImportURI(), ecorePackage.getEString(), "importURI", null, 1, 1, ImportInterfaceStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(expressionDeclarationEClass, ExpressionDeclaration.class, "ExpressionDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExpressionDeclaration_FormalParameters(), ecorePackage.getEObject(), null, "formalParameters", null, 0, -1, ExpressionDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(relationDeclarationEClass, RelationDeclaration.class, "RelationDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRelationDeclaration_FormalParameters(), ecorePackage.getEObject(), null, "formalParameters", null, 0, -1, RelationDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bCoolOperatorArgEClass, BCoolOperatorArg.class, "BCoolOperatorArg", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBCoolOperatorArg_DSE(), theCompleteOCLCSPackage.getDefPropertyCS(), null, "DSE", null, 0, 1, BCoolOperatorArg.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBCoolOperatorArg_Interface(), this.getImportInterfaceStatement(), null, "Interface", null, 1, 1, BCoolOperatorArg.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBCoolOperatorArg_InterfaceClass(), theEcorePackage.getEClass(), null, "InterfaceClass", null, 0, 1, BCoolOperatorArg.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //BcoolPackageImpl
