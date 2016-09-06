package org.gemoc.gel.utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.ocl.examples.xtext.completeocl.completeoclcs.ClassifierContextDeclCS;
import org.eclipse.ocl.examples.xtext.completeocl.completeoclcs.PackageDeclarationCS;
import org.eclipse.xtext.EcoreUtil2;
import org.gemoc.gel.AtomicDomainSpecificEvent;
import org.gemoc.gel.CompositeDomainSpecificEvent;
import org.gemoc.gel.DomainSpecificEvent;
import org.gemoc.gel.EclEvent;
import org.gemoc.gel.ExecutionFunction;
import org.gemoc.gel.ExecutionFunctionResult;
import org.gemoc.gel.GelFactory;
import org.gemoc.gel.Kermeta3ExecutionFunction;
import org.gemoc.gel.LocalVariable;
import org.gemoc.gel.MoccEvent;
import org.gemoc.gel.UnfoldingStrategy;
import org.gemoc.gexpressions.GExpression;
import org.gemoc.gexpressions.GReferenceExpression;
import org.gemoc.gexpressions.utils.EClassByEObjectReplacerAndEOperationRemover;
import org.gemoc.gexpressions.utils.GExpressionsInterpreter;
import org.gemoc.gexpressions.utils.GReferenceExpressionFinder;

import fr.inria.aoste.timesquare.ECL.ECLDefCS;

public class GELHelper {

	private static Map<org.gemoc.gel.Kermeta3ExecutionFunction, EOperation> mapExecutionFunctionToOperation = new HashMap<>();
	private static Map<org.gemoc.gel.FeedbackConsequence, MoccEvent> mapFeedbackConsequenceToMoccEvent = new HashMap<>();

	/**
	 * 
	 * @param executionFunction
	 * @return if the Execution Function is a Kermeta 3 Execution Function, the
	 *         owning EClass of the EOperation. Else, an
	 *         UnsupportedOperationException.
	 */
	public static EClassifier getContextOfExecutionFunction(
			org.gemoc.gel.ExecutionFunction executionFunction) {
		if (executionFunction instanceof org.gemoc.gel.Kermeta3ExecutionFunction) {
			EOperation operation = determineOperationOfExecutionFunction((org.gemoc.gel.Kermeta3ExecutionFunction) executionFunction);
			EClass dseContext = operation.getEContainingClass();
			return dseContext;
		} else {
			throw new UnsupportedOperationException(
					"Could not determine concrete type of Execution Function: "
							+ executionFunction.toString());
		}
	}

	/**
	 * Evaluates the expression to determine the EOperation referenced by the
	 * expression.
	 * 
	 * @param ef
	 * @return the EOperation referenced by the expression inside the
	 *         K3ExecutionFunction.
	 */
	public static EOperation determineOperationOfExecutionFunction(
			Kermeta3ExecutionFunction ef) {
		EOperation operation = mapExecutionFunctionToOperation.get(ef);
		if (operation != null) {
			return operation;
		} else {
			Object resultOfExpression = (new GExpressionsInterpreter())
					.doSwitch(ef.getNavigationPathToOperation());
			if (resultOfExpression instanceof EOperation) {
				mapExecutionFunctionToOperation.put(ef,
						(EOperation) resultOfExpression);
				return (EOperation) resultOfExpression;
			} else {
				throw new RuntimeException(
						"There was an error during the evaluation of the expression: "
								+ ef.getNavigationPathToOperation()
								+ ". Returned object was: "
								+ resultOfExpression);
			}
		}
	}

	/**
	 * Evaluates the expression to determine the MoccEvent referenced by the
	 * expression.
	 * 
	 * @param feedbackConsequence
	 * @return
	 */
	public static MoccEvent determineMoccEventOfFeedbackConsequence(
			org.gemoc.gel.FeedbackConsequence feedbackConsequence) {
		MoccEvent moccEvent = mapFeedbackConsequenceToMoccEvent
				.get(feedbackConsequence);
		if (moccEvent != null) {
			return moccEvent;
		} else {
			Object resultOfExpression = (new GExpressionsInterpreter())
					.doSwitch(feedbackConsequence
							.getNavigationPathToMoccEvent());
			if (resultOfExpression instanceof ECLDefCS) {
				EclEvent eclEvent = GelFactory.eINSTANCE.createEclEvent();
				eclEvent.setEventReference((ECLDefCS) resultOfExpression);
				moccEvent = eclEvent;
				mapFeedbackConsequenceToMoccEvent.put(feedbackConsequence,
						moccEvent);
				return moccEvent;
			} else {
				throw new RuntimeException(
						"There was an error during the evaluation of the expression: "
								+ feedbackConsequence
										.getNavigationPathToMoccEvent()
								+ ". Returned object was: "
								+ resultOfExpression);
			}
		}
	}

	public static EObject determineTargetOfExecutionFunction(
			ExecutionFunction ef, EObject eo) {
		if (!(ef instanceof Kermeta3ExecutionFunction)) {
			throw new UnsupportedOperationException(
					"Could not determine concrete type of Execution Function: "
							+ ef);
		} else {
			Kermeta3ExecutionFunction k3ef = (Kermeta3ExecutionFunction) ef;
			return partialEvaluationOfExpression(
					k3ef.getNavigationPathToOperation(), eo);
		}
	}

	public static EObject determineEObjectInFeedbackConsequenceExpression(
			org.gemoc.gel.FeedbackConsequence feedbackConsequence, EObject eo) {
		return partialEvaluationOfExpression(
				feedbackConsequence.getNavigationPathToMoccEvent(), eo);
	}

	public static EObject partialEvaluationOfExpression(GExpression expression,
			EObject eo) {
		GExpression exp = EcoreUtil.copy(expression);
		GExpression instantiatedExp = (new EClassByEObjectReplacerAndEOperationRemover(
				eo)).doSwitch(exp);
		Object result = (new GExpressionsInterpreter())
				.doSwitch(instantiatedExp);
		if (result == null) {
			return (EObject) result;
		} else {
			if (!(result instanceof EObject)) {
				throw new RuntimeException(
						"There was a problem with the partial evaluation of the instantiated expression.");
			} else {
				return (EObject) result;
			}
		}
	}

	/**
	 * @param dse
	 * @return if the DSE is atomic, it returns the MoccEvent's owning EClass
	 *         (through some hack :-/). Else, it is a composite DSE. In that
	 *         case, if it has an unfolding strategy then the context is the
	 *         (ordered) list of EClasses used a local variables to define the
	 *         instantation rules (there may be duplicates !). Else, it looks up
	 *         all the arguments of the pattern of DSEs and if all the contexts
	 *         are the same EClass, then it returns it. If not, then a
	 *         RuntimeException is thrown as it should not be possible to
	 *         specify such a DSE in the first place.
	 */
	public static List<EClassifier> determineContextOfDomainSpecificEvent(
			DomainSpecificEvent dse) throws IllegalArgumentException {
		if (dse instanceof AtomicDomainSpecificEvent) {
			AtomicDomainSpecificEvent atomicDse = (AtomicDomainSpecificEvent) dse;
			if (atomicDse.getExecutionFunction() != null) {
				return Collections
						.singletonList(determineContextEClassOfExecutionFunction((atomicDse)
								.getExecutionFunction()));
			} else {
				return Collections
						.singletonList(determineContextEClassOfMoccEvent((atomicDse
								.getUponMoccEvent())));
			}
		} else {
			CompositeDomainSpecificEvent composite = (CompositeDomainSpecificEvent) dse;

			if (composite.getUnfoldingStrategy() != null) {
				List<EClassifier> res = new ArrayList<>();
				UnfoldingStrategy strategy = composite.getUnfoldingStrategy();
				for (LocalVariable localVariable : strategy.getLocalVariables()) {
					res.add(localVariable.getType());
				}
				return res;
			} else {
				Collection<DomainSpecificEvent> patternArguments = (new CompositeDseArgumentCollector())
						.doSwitch(composite.getBody());
				if (patternArguments.contains(dse)) {
					throw new IllegalArgumentException(
							"Cyclic definition of Composite DSE");
				}
				Collection<List<EClassifier>> contextOfArguments = new ArrayList<>();
				for (DomainSpecificEvent argument : patternArguments) {
					if (argument instanceof CompositeDomainSpecificEvent) {
						Collection<DomainSpecificEvent> argumentArguments = (new CompositeDseArgumentCollector())
								.doSwitch(((CompositeDomainSpecificEvent) argument)
										.getBody());
						if (argumentArguments.contains(dse)) {
							throw new IllegalArgumentException(
									"Cyclic Definition of Composite DSE");
						}
					}

					contextOfArguments
							.add(determineContextOfDomainSpecificEvent(argument));
				}
				List<EClassifier> firstContext = contextOfArguments.iterator()
						.next();
				Boolean contextsAreAllTheSame = true;
				for (List<EClassifier> context : contextOfArguments) {
					for (EClassifier clazz : context) {
						contextsAreAllTheSame = contextsAreAllTheSame
								&& (clazz.equals(firstContext.get(context
										.indexOf(clazz))) || clazz.getName()
										.equals(firstContext.get(
												context.indexOf(clazz))
												.getName()));
					}
				}
				if (contextsAreAllTheSame) {
					return firstContext;
				} else {
					throw new RuntimeException(
							"The arguments of the Composite DSE are not all within the same context: this should be caught by GEL validation beforehand. "
									+ composite.toString());
				}
			}
		}
	}

	/**
	 * The hack is basically this: the MoccEvent of the DSE is defined with the
	 * context of an EClass which we are able to parse and so get its name. In
	 * order to have access to the EClass thanks to its name but without having
	 * to load the model (poses problems during scoping), we abuse the fact that
	 * the proposal provider (xtext.ui project) helps us make this
	 * String->EClass mapping. We then just have to lookup what is the first
	 * term of the expression
	 * 
	 * @param ef
	 * @return
	 */
	public static EClassifier determineContextEClassOfExecutionFunction(
			ExecutionFunction ef) {
		if (!(ef instanceof Kermeta3ExecutionFunction)) {
			throw new UnsupportedOperationException(
					"Could not determine concrete type of Execution Function: "
							+ ef);
		} else {
			Kermeta3ExecutionFunction k3ef = (Kermeta3ExecutionFunction) ef;
			GExpression exp = k3ef.getNavigationPathToOperation();
			List<GReferenceExpression> allReferenceExpressions = (new GReferenceExpressionFinder())
					.doSwitch(exp);
			if (allReferenceExpressions.isEmpty()) {
				throw new RuntimeException(
						"There was no GReferenceExpression in the expression navigating to the EOperation. Validation should catch this earlier. "
								+ EcoreUtil2.getContainerOfType(ef,
										DomainSpecificEvent.class).getName());
			}
			GReferenceExpression firstReferenceExpression = allReferenceExpressions
					.get(0);
			EObject referencedEObject = firstReferenceExpression
					.getReferencedEObject();
			if (!(referencedEObject instanceof EClassifier)) {
				throw new RuntimeException(
						"First term of the expression to navigate to an EOperation should be an EClassifier. Found: "
								+ referencedEObject);
			} else {
				return (EClassifier) referencedEObject;
			}
		}
	}

	/**
	 * Returns the context classifier of a MoccEvent.
	 * 
	 * @param moccEvent
	 * @return
	 */
	public static EClassifier determineContextEClassOfMoccEvent(
			org.gemoc.gel.MoccEvent moccEvent) {
		if (moccEvent instanceof EclEvent) {
			EclEvent eclEvent = (EclEvent) moccEvent;
			return determineContextEClassOfEclEvent(eclEvent);
		} else {
			throw new UnsupportedOperationException(
					"Could not determine concrete type of MoccEvent: "
							+ moccEvent.toString());
		}
	}

	/**
	 * Hack based on comparing the name of the context of the ECL Event (and
	 * also the package name) with the names of the classifiers contained in the
	 * resource set of the GEL specification.
	 * 
	 * @param eclEvent
	 * @return
	 */
	private static EClassifier determineContextEClassOfEclEvent(
			EclEvent eclEvent) {
		String contextName = parseContextName(eclEvent.getEventReference()
				.getClassifierContextDecl());

		// Get all classifiers of all the resources of the resource set
		// containing the GEL Specification
		Collection<EClassifier> allClassifiers = new ArrayList<>();
		for (Resource resource : eclEvent.eResource().getResourceSet()
				.getResources()) {
			for (EObject eo : resource.getContents()) {
				allClassifiers.addAll(EcoreUtil2.getAllContentsOfType(eo,
						EClassifier.class));
			}
		}
		// Filter out by name
		Set<EClassifier> candidateClassifiers = new HashSet<>();
		for (EClassifier classifier : allClassifiers) {
			if (classifier.getName().equals(contextName)) {
				candidateClassifiers.add(classifier);
			}
		}
		// And by package
		String packageName = EcoreUtil2
				.getContainerOfType(eclEvent.getEventReference(),
						PackageDeclarationCS.class).getPackage().getName();
		Collection<EClassifier> possibleClassifiers = new ArrayList<>();
		for (EClassifier classifier : candidateClassifiers) {
			if (packageName.equals(classifier.getEPackage().getName())) {
				possibleClassifiers.add(classifier);
			}
		}

		if (possibleClassifiers.size() == 1) {
			return possibleClassifiers.iterator().next();
		} else {
			return null;
		}
	}

	/**
	 * Strategy : look-up an attribute of type String named "name". Else, build
	 * a concatenation of all the attributes of type "EString" and add the
	 * hashCode of the EObject.
	 * 
	 * @param eo
	 * @return
	 */
	public static String getStringRepresentationOfEObject(EObject eo) {
		EClass eClass = eo.eClass();
		if (eClass.getEStructuralFeature("name") != null) {
			return (String) eo.eGet(eClass.getEStructuralFeature("name"));
		} else {
			StringBuilder sb = new StringBuilder();
			sb.append(eClass.getName());
			for (EAttribute attribute : eClass.getEAllAttributes()) {
				if (attribute.getEType().getName().equals("EString")) {
					sb.append((String) eo.eGet(attribute));
				}
			}
			sb.append(eo.hashCode());
			return sb.toString();
		}
	}

	/**
	 * Retrieves the type of an ExecutionFunctionResult by looking if the
	 * associated ExecutionFunction is a Kermeta 3 Execution Function, in which
	 * case it returns the EOperation's return type. Else, it throws
	 * UnsupportedOperationException.
	 * 
	 * @param result
	 * @return
	 */
	public static EClassifier getTypeOfExecutionFunctionResult(
			ExecutionFunctionResult result) {
		ExecutionFunction owningExecutionFunction = (ExecutionFunction) result
				.eContainer();
		if (owningExecutionFunction instanceof Kermeta3ExecutionFunction) {
			EOperation k3EOperation = determineOperationOfExecutionFunction((Kermeta3ExecutionFunction) owningExecutionFunction);
			return k3EOperation.getEType();
		} else {
			throw new UnsupportedOperationException(
					"Could not determine concrete type of the Execution Function "
							+ owningExecutionFunction);
		}
	}

	/**
	 * Parses some context from the CS of ECL to deduce the context EClass of an
	 * ECL Event.
	 * 
	 * @param string
	 * @return
	 */
	public static String parseContextName(ClassifierContextDeclCS string) {
		String stringRepresentation = string.toString();
		String stringWithoutTheComments = stringRepresentation.replaceAll(
				"(?m)^--.*", "");
		List<String> arrayOfWords = Arrays.asList(stringWithoutTheComments
				.split("\\s+"));
		return arrayOfWords.get(arrayOfWords.indexOf("context") + 1);
	}

}
