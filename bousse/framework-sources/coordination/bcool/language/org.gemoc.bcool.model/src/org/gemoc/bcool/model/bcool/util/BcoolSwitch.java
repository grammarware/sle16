/**
 */
package org.gemoc.bcool.model.bcool.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.gemoc.bcool.model.bcool.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.gemoc.bcool.model.bcool.BcoolPackage
 * @generated
 */
public class BcoolSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static BcoolPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BcoolSwitch() {
		if (modelPackage == null) {
			modelPackage = BcoolPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case BcoolPackage.BCOOL_OPERATOR: {
				BCoolOperator bCoolOperator = (BCoolOperator)theEObject;
				T result = caseBCoolOperator(bCoolOperator);
				if (result == null) result = caseNamedElement(bCoolOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BcoolPackage.BCOOL_COMPOSITION_RULE: {
				BCoolCompositionRule bCoolCompositionRule = (BCoolCompositionRule)theEObject;
				T result = caseBCoolCompositionRule(bCoolCompositionRule);
				if (result == null) result = caseNamedElement(bCoolCompositionRule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BcoolPackage.BCOOL_SPECIFICATION: {
				BCoolSpecification bCoolSpecification = (BCoolSpecification)theEObject;
				T result = caseBCoolSpecification(bCoolSpecification);
				if (result == null) result = caseNamedElement(bCoolSpecification);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BcoolPackage.NAMED_ELEMENT: {
				NamedElement namedElement = (NamedElement)theEObject;
				T result = caseNamedElement(namedElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BcoolPackage.IMPORT_LIB_STATEMENT: {
				ImportLibStatement importLibStatement = (ImportLibStatement)theEObject;
				T result = caseImportLibStatement(importLibStatement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BcoolPackage.MATCHING_RULE: {
				MatchingRule matchingRule = (MatchingRule)theEObject;
				T result = caseMatchingRule(matchingRule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BcoolPackage.COORDINATION_RULE: {
				CoordinationRule coordinationRule = (CoordinationRule)theEObject;
				T result = caseCoordinationRule(coordinationRule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BcoolPackage.EVENT_EXPRESSION: {
				EventExpression eventExpression = (EventExpression)theEObject;
				T result = caseEventExpression(eventExpression);
				if (result == null) result = caseNamedElement(eventExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BcoolPackage.EXPRESSION_DEFINITION: {
				ExpressionDefinition expressionDefinition = (ExpressionDefinition)theEObject;
				T result = caseExpressionDefinition(expressionDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BcoolPackage.EVENT_RELATION: {
				EventRelation eventRelation = (EventRelation)theEObject;
				T result = caseEventRelation(eventRelation);
				if (result == null) result = caseNamedElement(eventRelation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BcoolPackage.RELATION_DEFINITION: {
				RelationDefinition relationDefinition = (RelationDefinition)theEObject;
				T result = caseRelationDefinition(relationDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BcoolPackage.BCOOL_LIBRARY: {
				BCoolLibrary bCoolLibrary = (BCoolLibrary)theEObject;
				T result = caseBCoolLibrary(bCoolLibrary);
				if (result == null) result = caseNamedElement(bCoolLibrary);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BcoolPackage.IMPORT_INTERFACE_STATEMENT: {
				ImportInterfaceStatement importInterfaceStatement = (ImportInterfaceStatement)theEObject;
				T result = caseImportInterfaceStatement(importInterfaceStatement);
				if (result == null) result = caseNamedElement(importInterfaceStatement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BcoolPackage.EXPRESSION_DECLARATION: {
				ExpressionDeclaration expressionDeclaration = (ExpressionDeclaration)theEObject;
				T result = caseExpressionDeclaration(expressionDeclaration);
				if (result == null) result = caseNamedElement(expressionDeclaration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BcoolPackage.RELATION_DECLARATION: {
				RelationDeclaration relationDeclaration = (RelationDeclaration)theEObject;
				T result = caseRelationDeclaration(relationDeclaration);
				if (result == null) result = caseNamedElement(relationDeclaration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BcoolPackage.BCOOL_OPERATOR_ARG: {
				BCoolOperatorArg bCoolOperatorArg = (BCoolOperatorArg)theEObject;
				T result = caseBCoolOperatorArg(bCoolOperatorArg);
				if (result == null) result = caseNamedElement(bCoolOperatorArg);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BCool Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BCool Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBCoolOperator(BCoolOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BCool Composition Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BCool Composition Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBCoolCompositionRule(BCoolCompositionRule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BCool Specification</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BCool Specification</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBCoolSpecification(BCoolSpecification object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamedElement(NamedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Import Lib Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Import Lib Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImportLibStatement(ImportLibStatement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Matching Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Matching Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMatchingRule(MatchingRule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Coordination Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Coordination Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCoordinationRule(CoordinationRule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Event Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Event Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEventExpression(EventExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Expression Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Expression Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExpressionDefinition(ExpressionDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Event Relation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Event Relation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEventRelation(EventRelation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Relation Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Relation Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRelationDefinition(RelationDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BCool Library</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BCool Library</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBCoolLibrary(BCoolLibrary object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Import Interface Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Import Interface Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImportInterfaceStatement(ImportInterfaceStatement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Expression Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Expression Declaration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExpressionDeclaration(ExpressionDeclaration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Relation Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Relation Declaration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRelationDeclaration(RelationDeclaration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BCool Operator Arg</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BCool Operator Arg</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBCoolOperatorArg(BCoolOperatorArg object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //BcoolSwitch
