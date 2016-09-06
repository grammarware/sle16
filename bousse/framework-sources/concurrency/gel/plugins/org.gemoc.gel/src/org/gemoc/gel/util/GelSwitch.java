/**
 */
package org.gemoc.gel.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;
import org.gemoc.gel.AtomicDomainSpecificEvent;
import org.gemoc.gel.BinaryPattern;
import org.gemoc.gel.CoincidencePattern;
import org.gemoc.gel.CompositeDomainSpecificEvent;
import org.gemoc.gel.DomainSpecificEvent;
import org.gemoc.gel.DomainSpecificEventReference;
import org.gemoc.gel.DomainSpecificEventReferenceWithArguments;
import org.gemoc.gel.DomainSpecificEventsPattern;
import org.gemoc.gel.DomainSpecificEventsSpecification;
import org.gemoc.gel.EclEvent;
import org.gemoc.gel.ExecutionFunction;
import org.gemoc.gel.ExecutionFunctionResult;
import org.gemoc.gel.FeedbackConsequence;
import org.gemoc.gel.FeedbackFilter;
import org.gemoc.gel.FeedbackPolicy;
import org.gemoc.gel.FeedbackRule;
import org.gemoc.gel.GelPackage;
import org.gemoc.gel.ImportStatement;
import org.gemoc.gel.InstantiationPredicate;
import org.gemoc.gel.IterationPattern;
import org.gemoc.gel.Kermeta3ExecutionFunction;
import org.gemoc.gel.ListOfArguments;
import org.gemoc.gel.LocalVariable;
import org.gemoc.gel.LogicalSequence;
import org.gemoc.gel.MoccEvent;
import org.gemoc.gel.MultipleArguments;
import org.gemoc.gel.OrPattern;
import org.gemoc.gel.PlusPattern;
import org.gemoc.gel.SingleArgument;
import org.gemoc.gel.UnaryPattern;
import org.gemoc.gel.UnfoldingStrategy;
import org.gemoc.gel.XorPattern;

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
 * @see org.gemoc.gel.GelPackage
 * @generated
 */
public class GelSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static GelPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GelSwitch() {
		if (modelPackage == null) {
			modelPackage = GelPackage.eINSTANCE;
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
			case GelPackage.DOMAIN_SPECIFIC_EVENTS_SPECIFICATION: {
				DomainSpecificEventsSpecification domainSpecificEventsSpecification = (DomainSpecificEventsSpecification)theEObject;
				T result = caseDomainSpecificEventsSpecification(domainSpecificEventsSpecification);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GelPackage.IMPORT_STATEMENT: {
				ImportStatement importStatement = (ImportStatement)theEObject;
				T result = caseImportStatement(importStatement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GelPackage.DOMAIN_SPECIFIC_EVENT: {
				DomainSpecificEvent domainSpecificEvent = (DomainSpecificEvent)theEObject;
				T result = caseDomainSpecificEvent(domainSpecificEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GelPackage.ATOMIC_DOMAIN_SPECIFIC_EVENT: {
				AtomicDomainSpecificEvent atomicDomainSpecificEvent = (AtomicDomainSpecificEvent)theEObject;
				T result = caseAtomicDomainSpecificEvent(atomicDomainSpecificEvent);
				if (result == null) result = caseDomainSpecificEvent(atomicDomainSpecificEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GelPackage.COMPOSITE_DOMAIN_SPECIFIC_EVENT: {
				CompositeDomainSpecificEvent compositeDomainSpecificEvent = (CompositeDomainSpecificEvent)theEObject;
				T result = caseCompositeDomainSpecificEvent(compositeDomainSpecificEvent);
				if (result == null) result = caseDomainSpecificEvent(compositeDomainSpecificEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GelPackage.UNFOLDING_STRATEGY: {
				UnfoldingStrategy unfoldingStrategy = (UnfoldingStrategy)theEObject;
				T result = caseUnfoldingStrategy(unfoldingStrategy);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GelPackage.LOCAL_VARIABLE: {
				LocalVariable localVariable = (LocalVariable)theEObject;
				T result = caseLocalVariable(localVariable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GelPackage.INSTANTIATION_PREDICATE: {
				InstantiationPredicate instantiationPredicate = (InstantiationPredicate)theEObject;
				T result = caseInstantiationPredicate(instantiationPredicate);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GelPackage.DOMAIN_SPECIFIC_EVENTS_PATTERN: {
				DomainSpecificEventsPattern domainSpecificEventsPattern = (DomainSpecificEventsPattern)theEObject;
				T result = caseDomainSpecificEventsPattern(domainSpecificEventsPattern);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GelPackage.UNARY_PATTERN: {
				UnaryPattern unaryPattern = (UnaryPattern)theEObject;
				T result = caseUnaryPattern(unaryPattern);
				if (result == null) result = caseDomainSpecificEventsPattern(unaryPattern);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GelPackage.BINARY_PATTERN: {
				BinaryPattern binaryPattern = (BinaryPattern)theEObject;
				T result = caseBinaryPattern(binaryPattern);
				if (result == null) result = caseDomainSpecificEventsPattern(binaryPattern);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GelPackage.COINCIDENCE_PATTERN: {
				CoincidencePattern coincidencePattern = (CoincidencePattern)theEObject;
				T result = caseCoincidencePattern(coincidencePattern);
				if (result == null) result = caseBinaryPattern(coincidencePattern);
				if (result == null) result = caseDomainSpecificEventsPattern(coincidencePattern);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GelPackage.LOGICAL_SEQUENCE: {
				LogicalSequence logicalSequence = (LogicalSequence)theEObject;
				T result = caseLogicalSequence(logicalSequence);
				if (result == null) result = caseBinaryPattern(logicalSequence);
				if (result == null) result = caseDomainSpecificEventsPattern(logicalSequence);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GelPackage.OR_PATTERN: {
				OrPattern orPattern = (OrPattern)theEObject;
				T result = caseOrPattern(orPattern);
				if (result == null) result = caseBinaryPattern(orPattern);
				if (result == null) result = caseDomainSpecificEventsPattern(orPattern);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GelPackage.XOR_PATTERN: {
				XorPattern xorPattern = (XorPattern)theEObject;
				T result = caseXorPattern(xorPattern);
				if (result == null) result = caseBinaryPattern(xorPattern);
				if (result == null) result = caseDomainSpecificEventsPattern(xorPattern);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GelPackage.PLUS_PATTERN: {
				PlusPattern plusPattern = (PlusPattern)theEObject;
				T result = casePlusPattern(plusPattern);
				if (result == null) result = caseUnaryPattern(plusPattern);
				if (result == null) result = caseDomainSpecificEventsPattern(plusPattern);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GelPackage.ITERATION_PATTERN: {
				IterationPattern iterationPattern = (IterationPattern)theEObject;
				T result = caseIterationPattern(iterationPattern);
				if (result == null) result = caseUnaryPattern(iterationPattern);
				if (result == null) result = caseDomainSpecificEventsPattern(iterationPattern);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GelPackage.DOMAIN_SPECIFIC_EVENT_REFERENCE: {
				DomainSpecificEventReference domainSpecificEventReference = (DomainSpecificEventReference)theEObject;
				T result = caseDomainSpecificEventReference(domainSpecificEventReference);
				if (result == null) result = caseDomainSpecificEventsPattern(domainSpecificEventReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GelPackage.DOMAIN_SPECIFIC_EVENT_REFERENCE_WITH_ARGUMENTS: {
				DomainSpecificEventReferenceWithArguments domainSpecificEventReferenceWithArguments = (DomainSpecificEventReferenceWithArguments)theEObject;
				T result = caseDomainSpecificEventReferenceWithArguments(domainSpecificEventReferenceWithArguments);
				if (result == null) result = caseDomainSpecificEventReference(domainSpecificEventReferenceWithArguments);
				if (result == null) result = caseDomainSpecificEventsPattern(domainSpecificEventReferenceWithArguments);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GelPackage.LIST_OF_ARGUMENTS: {
				ListOfArguments listOfArguments = (ListOfArguments)theEObject;
				T result = caseListOfArguments(listOfArguments);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GelPackage.SINGLE_ARGUMENT: {
				SingleArgument singleArgument = (SingleArgument)theEObject;
				T result = caseSingleArgument(singleArgument);
				if (result == null) result = caseListOfArguments(singleArgument);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GelPackage.MULTIPLE_ARGUMENTS: {
				MultipleArguments multipleArguments = (MultipleArguments)theEObject;
				T result = caseMultipleArguments(multipleArguments);
				if (result == null) result = caseListOfArguments(multipleArguments);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GelPackage.FEEDBACK_POLICY: {
				FeedbackPolicy feedbackPolicy = (FeedbackPolicy)theEObject;
				T result = caseFeedbackPolicy(feedbackPolicy);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GelPackage.FEEDBACK_RULE: {
				FeedbackRule feedbackRule = (FeedbackRule)theEObject;
				T result = caseFeedbackRule(feedbackRule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GelPackage.FEEDBACK_FILTER: {
				FeedbackFilter feedbackFilter = (FeedbackFilter)theEObject;
				T result = caseFeedbackFilter(feedbackFilter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GelPackage.FEEDBACK_CONSEQUENCE: {
				FeedbackConsequence feedbackConsequence = (FeedbackConsequence)theEObject;
				T result = caseFeedbackConsequence(feedbackConsequence);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GelPackage.MOCC_EVENT: {
				MoccEvent moccEvent = (MoccEvent)theEObject;
				T result = caseMoccEvent(moccEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GelPackage.ECL_EVENT: {
				EclEvent eclEvent = (EclEvent)theEObject;
				T result = caseEclEvent(eclEvent);
				if (result == null) result = caseMoccEvent(eclEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GelPackage.EXECUTION_FUNCTION_RESULT: {
				ExecutionFunctionResult executionFunctionResult = (ExecutionFunctionResult)theEObject;
				T result = caseExecutionFunctionResult(executionFunctionResult);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GelPackage.EXECUTION_FUNCTION: {
				ExecutionFunction executionFunction = (ExecutionFunction)theEObject;
				T result = caseExecutionFunction(executionFunction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GelPackage.KERMETA3_EXECUTION_FUNCTION: {
				Kermeta3ExecutionFunction kermeta3ExecutionFunction = (Kermeta3ExecutionFunction)theEObject;
				T result = caseKermeta3ExecutionFunction(kermeta3ExecutionFunction);
				if (result == null) result = caseExecutionFunction(kermeta3ExecutionFunction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Domain Specific Events Specification</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Domain Specific Events Specification</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDomainSpecificEventsSpecification(DomainSpecificEventsSpecification object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Import Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Import Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImportStatement(ImportStatement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Domain Specific Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Domain Specific Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDomainSpecificEvent(DomainSpecificEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Atomic Domain Specific Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Atomic Domain Specific Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAtomicDomainSpecificEvent(AtomicDomainSpecificEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Composite Domain Specific Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Composite Domain Specific Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCompositeDomainSpecificEvent(CompositeDomainSpecificEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unfolding Strategy</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unfolding Strategy</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnfoldingStrategy(UnfoldingStrategy object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Local Variable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Local Variable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLocalVariable(LocalVariable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Instantiation Predicate</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Instantiation Predicate</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInstantiationPredicate(InstantiationPredicate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Domain Specific Events Pattern</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Domain Specific Events Pattern</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDomainSpecificEventsPattern(DomainSpecificEventsPattern object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unary Pattern</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unary Pattern</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnaryPattern(UnaryPattern object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Binary Pattern</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Binary Pattern</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBinaryPattern(BinaryPattern object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Coincidence Pattern</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Coincidence Pattern</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCoincidencePattern(CoincidencePattern object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Logical Sequence</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Logical Sequence</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLogicalSequence(LogicalSequence object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Or Pattern</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Or Pattern</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOrPattern(OrPattern object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Xor Pattern</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Xor Pattern</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseXorPattern(XorPattern object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Plus Pattern</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Plus Pattern</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePlusPattern(PlusPattern object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Iteration Pattern</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Iteration Pattern</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIterationPattern(IterationPattern object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Domain Specific Event Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Domain Specific Event Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDomainSpecificEventReference(DomainSpecificEventReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Domain Specific Event Reference With Arguments</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Domain Specific Event Reference With Arguments</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDomainSpecificEventReferenceWithArguments(DomainSpecificEventReferenceWithArguments object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>List Of Arguments</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>List Of Arguments</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseListOfArguments(ListOfArguments object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Single Argument</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Single Argument</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSingleArgument(SingleArgument object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Multiple Arguments</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Multiple Arguments</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMultipleArguments(MultipleArguments object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Feedback Policy</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Feedback Policy</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFeedbackPolicy(FeedbackPolicy object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Feedback Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Feedback Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFeedbackRule(FeedbackRule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Feedback Filter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Feedback Filter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFeedbackFilter(FeedbackFilter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Feedback Consequence</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Feedback Consequence</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFeedbackConsequence(FeedbackConsequence object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mocc Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mocc Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMoccEvent(MoccEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ecl Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ecl Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEclEvent(EclEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Execution Function Result</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Execution Function Result</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExecutionFunctionResult(ExecutionFunctionResult object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Execution Function</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Execution Function</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExecutionFunction(ExecutionFunction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Kermeta3 Execution Function</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Kermeta3 Execution Function</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseKermeta3ExecutionFunction(Kermeta3ExecutionFunction object) {
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

} //GelSwitch
