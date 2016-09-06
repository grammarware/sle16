/**
 */
package org.gemoc.gel.microgel.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;
import org.gemoc.gel.microgel.AtomicModelSpecificEvent;
import org.gemoc.gel.microgel.BinaryPattern;
import org.gemoc.gel.microgel.CcslClock;
import org.gemoc.gel.microgel.CoincidencePattern;
import org.gemoc.gel.microgel.CompositeModelSpecificEvent;
import org.gemoc.gel.microgel.ExecutionFunction;
import org.gemoc.gel.microgel.ExecutionFunctionResult;
import org.gemoc.gel.microgel.FeedbackConsequence;
import org.gemoc.gel.microgel.FeedbackFilter;
import org.gemoc.gel.microgel.FeedbackPolicy;
import org.gemoc.gel.microgel.FeedbackRule;
import org.gemoc.gel.microgel.ImportStatement;
import org.gemoc.gel.microgel.IterationPattern;
import org.gemoc.gel.microgel.Kermeta3ExecutionFunction;
import org.gemoc.gel.microgel.LogicalSequence;
import org.gemoc.gel.microgel.MicrogelPackage;
import org.gemoc.gel.microgel.MoccEventInstance;
import org.gemoc.gel.microgel.ModelSpecificEvent;
import org.gemoc.gel.microgel.ModelSpecificEventReference;
import org.gemoc.gel.microgel.ModelSpecificEventsPattern;
import org.gemoc.gel.microgel.ModelSpecificEventsSpecification;
import org.gemoc.gel.microgel.OrPattern;
import org.gemoc.gel.microgel.PlusPattern;
import org.gemoc.gel.microgel.UnaryPattern;
import org.gemoc.gel.microgel.XorPattern;

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
 * @see org.gemoc.gel.microgel.MicrogelPackage
 * @generated
 */
public class MicrogelSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static MicrogelPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MicrogelSwitch() {
		if (modelPackage == null) {
			modelPackage = MicrogelPackage.eINSTANCE;
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
			case MicrogelPackage.MODEL_SPECIFIC_EVENTS_SPECIFICATION: {
				ModelSpecificEventsSpecification modelSpecificEventsSpecification = (ModelSpecificEventsSpecification)theEObject;
				T result = caseModelSpecificEventsSpecification(modelSpecificEventsSpecification);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MicrogelPackage.IMPORT_STATEMENT: {
				ImportStatement importStatement = (ImportStatement)theEObject;
				T result = caseImportStatement(importStatement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MicrogelPackage.MODEL_SPECIFIC_EVENT: {
				ModelSpecificEvent modelSpecificEvent = (ModelSpecificEvent)theEObject;
				T result = caseModelSpecificEvent(modelSpecificEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MicrogelPackage.ATOMIC_MODEL_SPECIFIC_EVENT: {
				AtomicModelSpecificEvent atomicModelSpecificEvent = (AtomicModelSpecificEvent)theEObject;
				T result = caseAtomicModelSpecificEvent(atomicModelSpecificEvent);
				if (result == null) result = caseModelSpecificEvent(atomicModelSpecificEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MicrogelPackage.COMPOSITE_MODEL_SPECIFIC_EVENT: {
				CompositeModelSpecificEvent compositeModelSpecificEvent = (CompositeModelSpecificEvent)theEObject;
				T result = caseCompositeModelSpecificEvent(compositeModelSpecificEvent);
				if (result == null) result = caseModelSpecificEvent(compositeModelSpecificEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MicrogelPackage.MODEL_SPECIFIC_EVENTS_PATTERN: {
				ModelSpecificEventsPattern modelSpecificEventsPattern = (ModelSpecificEventsPattern)theEObject;
				T result = caseModelSpecificEventsPattern(modelSpecificEventsPattern);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MicrogelPackage.UNARY_PATTERN: {
				UnaryPattern unaryPattern = (UnaryPattern)theEObject;
				T result = caseUnaryPattern(unaryPattern);
				if (result == null) result = caseModelSpecificEventsPattern(unaryPattern);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MicrogelPackage.BINARY_PATTERN: {
				BinaryPattern binaryPattern = (BinaryPattern)theEObject;
				T result = caseBinaryPattern(binaryPattern);
				if (result == null) result = caseModelSpecificEventsPattern(binaryPattern);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MicrogelPackage.COINCIDENCE_PATTERN: {
				CoincidencePattern coincidencePattern = (CoincidencePattern)theEObject;
				T result = caseCoincidencePattern(coincidencePattern);
				if (result == null) result = caseBinaryPattern(coincidencePattern);
				if (result == null) result = caseModelSpecificEventsPattern(coincidencePattern);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MicrogelPackage.LOGICAL_SEQUENCE: {
				LogicalSequence logicalSequence = (LogicalSequence)theEObject;
				T result = caseLogicalSequence(logicalSequence);
				if (result == null) result = caseBinaryPattern(logicalSequence);
				if (result == null) result = caseModelSpecificEventsPattern(logicalSequence);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MicrogelPackage.OR_PATTERN: {
				OrPattern orPattern = (OrPattern)theEObject;
				T result = caseOrPattern(orPattern);
				if (result == null) result = caseBinaryPattern(orPattern);
				if (result == null) result = caseModelSpecificEventsPattern(orPattern);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MicrogelPackage.XOR_PATTERN: {
				XorPattern xorPattern = (XorPattern)theEObject;
				T result = caseXorPattern(xorPattern);
				if (result == null) result = caseBinaryPattern(xorPattern);
				if (result == null) result = caseModelSpecificEventsPattern(xorPattern);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MicrogelPackage.PLUS_PATTERN: {
				PlusPattern plusPattern = (PlusPattern)theEObject;
				T result = casePlusPattern(plusPattern);
				if (result == null) result = caseUnaryPattern(plusPattern);
				if (result == null) result = caseModelSpecificEventsPattern(plusPattern);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MicrogelPackage.ITERATION_PATTERN: {
				IterationPattern iterationPattern = (IterationPattern)theEObject;
				T result = caseIterationPattern(iterationPattern);
				if (result == null) result = caseUnaryPattern(iterationPattern);
				if (result == null) result = caseModelSpecificEventsPattern(iterationPattern);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MicrogelPackage.MODEL_SPECIFIC_EVENT_REFERENCE: {
				ModelSpecificEventReference modelSpecificEventReference = (ModelSpecificEventReference)theEObject;
				T result = caseModelSpecificEventReference(modelSpecificEventReference);
				if (result == null) result = caseModelSpecificEventsPattern(modelSpecificEventReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MicrogelPackage.FEEDBACK_POLICY: {
				FeedbackPolicy feedbackPolicy = (FeedbackPolicy)theEObject;
				T result = caseFeedbackPolicy(feedbackPolicy);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MicrogelPackage.FEEDBACK_RULE: {
				FeedbackRule feedbackRule = (FeedbackRule)theEObject;
				T result = caseFeedbackRule(feedbackRule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MicrogelPackage.FEEDBACK_FILTER: {
				FeedbackFilter feedbackFilter = (FeedbackFilter)theEObject;
				T result = caseFeedbackFilter(feedbackFilter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MicrogelPackage.FEEDBACK_CONSEQUENCE: {
				FeedbackConsequence feedbackConsequence = (FeedbackConsequence)theEObject;
				T result = caseFeedbackConsequence(feedbackConsequence);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MicrogelPackage.MOCC_EVENT_INSTANCE: {
				MoccEventInstance moccEventInstance = (MoccEventInstance)theEObject;
				T result = caseMoccEventInstance(moccEventInstance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MicrogelPackage.CCSL_CLOCK: {
				CcslClock ccslClock = (CcslClock)theEObject;
				T result = caseCcslClock(ccslClock);
				if (result == null) result = caseMoccEventInstance(ccslClock);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MicrogelPackage.EXECUTION_FUNCTION_RESULT: {
				ExecutionFunctionResult executionFunctionResult = (ExecutionFunctionResult)theEObject;
				T result = caseExecutionFunctionResult(executionFunctionResult);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MicrogelPackage.EXECUTION_FUNCTION: {
				ExecutionFunction executionFunction = (ExecutionFunction)theEObject;
				T result = caseExecutionFunction(executionFunction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MicrogelPackage.KERMETA3_EXECUTION_FUNCTION: {
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
	 * Returns the result of interpreting the object as an instance of '<em>Model Specific Events Specification</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Model Specific Events Specification</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModelSpecificEventsSpecification(ModelSpecificEventsSpecification object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Model Specific Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Model Specific Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModelSpecificEvent(ModelSpecificEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Atomic Model Specific Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Atomic Model Specific Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAtomicModelSpecificEvent(AtomicModelSpecificEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Composite Model Specific Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Composite Model Specific Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCompositeModelSpecificEvent(CompositeModelSpecificEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Model Specific Events Pattern</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Model Specific Events Pattern</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModelSpecificEventsPattern(ModelSpecificEventsPattern object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Model Specific Event Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Model Specific Event Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModelSpecificEventReference(ModelSpecificEventReference object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Mocc Event Instance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mocc Event Instance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMoccEventInstance(MoccEventInstance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ccsl Clock</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ccsl Clock</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCcslClock(CcslClock object) {
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

} //MicrogelSwitch
