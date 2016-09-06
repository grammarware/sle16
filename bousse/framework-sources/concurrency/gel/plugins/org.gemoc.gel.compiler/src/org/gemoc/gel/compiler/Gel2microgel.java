package org.gemoc.gel.compiler;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.gemoc.gel.AtomicDomainSpecificEvent;
import org.gemoc.gel.CompositeDomainSpecificEvent;
import org.gemoc.gel.DomainSpecificEvent;
import org.gemoc.gel.DomainSpecificEventsPattern;
import org.gemoc.gel.DomainSpecificEventsSpecification;
import org.gemoc.gel.EclEvent;
import org.gemoc.gel.MoccEvent;
import org.gemoc.gel.UnfoldingStrategy;
import org.gemoc.gel.microgel.AtomicModelSpecificEvent;
import org.gemoc.gel.microgel.CcslClock;
import org.gemoc.gel.microgel.CompositeModelSpecificEvent;
import org.gemoc.gel.microgel.MicrogelFactory;
import org.gemoc.gel.microgel.MoccEventInstance;
import org.gemoc.gel.microgel.ModelSpecificEvent;
import org.gemoc.gel.microgel.ModelSpecificEventsPattern;
import org.gemoc.gel.microgel.ModelSpecificEventsSpecification;
import org.gemoc.gel.utils.CompositeDseArgumentCollector;
import org.gemoc.gel.utils.GELHelper;
import org.gemoc.gel.utils.UnfoldingStrategyInterpreter;
import org.gemoc.gexpressions.GExpression;
import org.gemoc.gexpressions.GReferenceExpression;
import org.gemoc.gexpressions.utils.GExpressionsHelper;
import org.gemoc.gexpressions.utils.GReferenceExpressionFinder;

import fr.inria.aoste.timesquare.ccslkernel.model.TimeModel.Clock;

/**
 * Compiler for GEL. Creates a 'microgel' model. It unfolds the specification to
 * the model given. Requires a model, a DSE specification and the associated
 * extendedCCSL specification.
 * 
 * @author flatombe
 *
 */
public class Gel2microgel {

	protected MicrogelFactory microgelFactory = MicrogelFactory.eINSTANCE;
	protected GelCompilationTrace trace = new GelCompilationTrace();

	/**
	 * Entry point of the compiler
	 * 
	 * @param dseResource
	 *            : the DSE specification in GEL
	 * @param ccslResource
	 *            : the extendedCCSL resource
	 * @param modelResource
	 *            : the model
	 */
	public Resource compile(Resource dseResource, Resource ccslResource,
			Resource modelResource) {
		final URI modelResourceURI = modelResource.getURI();
		final URI outputURI = createOutputUriFromModelResourceUri(modelResourceURI);
		return this
				.compile(dseResource, ccslResource, modelResource, outputURI);
	}

	public Resource compile(Resource dseResource, Resource ccslResource,
			Resource modelResource, URI outputURI) {
		final DomainSpecificEventsSpecification dseSpecification = (DomainSpecificEventsSpecification) dseResource
				.getContents().get(0);
		final Collection<Clock> clocks = new ArrayList<>();
		Iterator<EObject> ccslIterator = ccslResource.getAllContents();
		while (ccslIterator.hasNext()) {
			EObject eo = ccslIterator.next();
			if (eo instanceof Clock) {
				clocks.add((Clock) eo);
			}
		}

		final Collection<EObject> modelElements = new ArrayList<>();
		Iterator<EObject> modelIterator = modelResource.getAllContents();
		while (modelIterator.hasNext()) {
			modelElements.add(modelIterator.next());
		}

		// final ResourceSet resSet = modelResource.getResourceSet();
		final ResourceSet resSet = new ResourceSetImpl();
		final Resource mseResource = resSet.createResource(outputURI);

		// Somehow need to go through transactions otherwise an exception is
		// // raised.
		// EditingDomain editingDomain =
		// TransactionalEditingDomain.Factory.INSTANCE
		// .createEditingDomain();
		// editingDomain.getCommandStack()
		// .execute(
		// new RecordingCommand(
		// (TransactionalEditingDomain) editingDomain) {
		// protected void doExecute() {
		// ModelSpecificEventsSpecification mseSpecification = compile(
		// dseSpecification, clocks, modelElements);
		// mseResource.getContents().add(mseSpecification);
		// }
		// });
		ModelSpecificEventsSpecification mseSpecification = compile(
				dseSpecification, clocks, modelElements);
		mseResource.getContents().add(mseSpecification);
		try {
			mseResource.save(Collections.EMPTY_MAP);
			return mseResource;
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}
	}

	/**
	 * The output file (microgel model) is placed in the same folder as the
	 * model.
	 * 
	 * @param modelResourceURI
	 * @return
	 */
	protected URI createOutputUriFromModelResourceUri(URI modelResourceURI) {
		String modelStringURI = modelResourceURI.toPlatformString(true);
		String resString = modelStringURI.substring(0,
				modelStringURI.lastIndexOf("."));
		// TODO: change extension here when the problem with xText serialization
		// is fixed.
		resString = resString + "_ModelSpecificEvents.xmi";
		URI res = URI.createURI(resString, true);
		return res;
	}

	/**
	 * Creates an MSE specification and fills its import statements and its MSEs
	 * using the other methods of the compiler.
	 * 
	 * @param dseSpecification
	 * @param clocks
	 * @param modelElements
	 * @return
	 */
	protected ModelSpecificEventsSpecification compile(
			DomainSpecificEventsSpecification dseSpecification,
			Collection<Clock> clocks, Collection<EObject> modelElements) {
		ModelSpecificEventsSpecification res = microgelFactory
				.createModelSpecificEventsSpecification();
		res.getImports().addAll(
				adaptImportStatements(dseSpecification.getImports()));
		res.getEvents().addAll(
				unfoldDomainSpecificEvents(dseSpecification.getEvents(),
						clocks, modelElements));
		return res;
	}

	/**
	 * Adapting an ImportStatement is trivial.
	 * 
	 * @param imports
	 * @return
	 */
	protected Collection<org.gemoc.gel.microgel.ImportStatement> adaptImportStatements(
			Collection<org.gemoc.gel.ImportStatement> imports) {
		Collection<org.gemoc.gel.microgel.ImportStatement> res = new ArrayList<>();
		for (org.gemoc.gel.ImportStatement importStatement : imports) {
			org.gemoc.gel.microgel.ImportStatement newImportStatement = microgelFactory
					.createImportStatement();
			newImportStatement.setImportURI(importStatement.getImportURI());
			res.add(newImportStatement);
		}
		return res;
	}

	/**
	 * First we sort the DSEs in the order in which we want to treat them. That
	 * is: first the atomic DSEs, and then the composite DSEs. If a composite
	 * DSEs is based upon another composite DSE, then it is unfolded AFTER this
	 * other composite DSE. Cyclic definitions of composite DSEs should not be
	 * allowed by the GEL validation.
	 * 
	 * @param dses
	 * @param clocks
	 * @param modelElements
	 * @return
	 */
	protected Collection<ModelSpecificEvent> unfoldDomainSpecificEvents(
			Collection<DomainSpecificEvent> dses, Collection<Clock> clocks,
			Collection<EObject> modelElements) {
		Collection<ModelSpecificEvent> res = new ArrayList<>();

		List<DomainSpecificEvent> sortedDses = new ArrayList<>(dses);

		Collections.sort(sortedDses, new Comparator<DomainSpecificEvent>() {
			@Override
			public int compare(DomainSpecificEvent dse1,
					DomainSpecificEvent dse2) {
				// Determines in which order the DSEs should be unfolded.
				// Atomic first, then composite which use mostly atomics, etc...
				// We do not want a composite using another composite to be
				// unfolded before the composite it uses as arguments.
				if (dse1 instanceof AtomicDomainSpecificEvent
						&& dse2 instanceof AtomicDomainSpecificEvent) {
					return 0;
				} else if (dse1 instanceof AtomicDomainSpecificEvent
						&& dse2 instanceof CompositeDomainSpecificEvent) {
					return -1;
				} else if (dse1 instanceof CompositeDomainSpecificEvent
						&& dse2 instanceof AtomicDomainSpecificEvent) {
					return 1;
				} else {
					CompositeDomainSpecificEvent composite1 = (CompositeDomainSpecificEvent) dse1;
					CompositeDomainSpecificEvent composite2 = (CompositeDomainSpecificEvent) dse2;
					Collection<DomainSpecificEvent> argumentsOfComposite1 = new CompositeDseArgumentCollector()
							.doSwitch(composite1.getBody());
					Collection<DomainSpecificEvent> argumentsOfComposite2 = new CompositeDseArgumentCollector()
							.doSwitch(composite2.getBody());

					if (argumentsOfComposite2.contains(composite1)
							&& argumentsOfComposite1.contains(composite2)) {
						throw new RuntimeException(
								"Cyclic definition of Composite Domain-Specific Events detected: "
										+ dse1.toString() + " and "
										+ dse2.toString());
						// return 0;
						// Validation should prevent that !
					} else if (argumentsOfComposite2.contains(composite1)) {
						return -1;
					} else if (argumentsOfComposite1.contains(composite2)) {
						return 1;
					} else {
						return 0;
					}
				}

			}
		});

		for (DomainSpecificEvent dse : dses) {
			res.addAll(unfoldDomainSpecificEvent(dse, clocks, modelElements));
		}
		return res;
	}

	/**
	 * Unfolding a DSE consists in: identifying which EObjects are concerned
	 * (the context for the different newly-created MSEs), and then adapting the
	 * Execution Function / Feedback Policy / DSE Pattern to each MSE instance.
	 * 
	 * @param dse
	 * @param clocks
	 * @param modelElements
	 * @return
	 */
	protected Collection<ModelSpecificEvent> unfoldDomainSpecificEvent(
			DomainSpecificEvent dse, Collection<Clock> clocks,
			Collection<EObject> modelElements) {
		Collection<ModelSpecificEvent> res = new ArrayList<>();

		if (dse instanceof AtomicDomainSpecificEvent) {
			AtomicDomainSpecificEvent atomicDse = (AtomicDomainSpecificEvent) dse;
			Collection<EObject> concernedEObjects = new ArrayList<EObject>();
			List<EClassifier> dseContext = GELHelper
					.determineContextOfDomainSpecificEvent(atomicDse);
			concernedEObjects.addAll(getAllInstancesInTheModel(
					dseContext.get(0), modelElements));

			res.addAll(unfoldAtomicDomainSpecificEvent(atomicDse, clocks,
					concernedEObjects));
		} else if (dse instanceof CompositeDomainSpecificEvent) {
			res.addAll(unfoldCompositeDomainSpecificEvent(
					(CompositeDomainSpecificEvent) dse, modelElements));
		} else {
			throw new RuntimeException("Impossible case.");
		}
		trace.add(dse, res);
		return res;
	}

	/**
	 * Retrieves all the instances from the model whose types conform to the
	 * context (list of EClassifiers given) and for which the predicates from
	 * the unfolding strategy are true.
	 * 
	 * @param classifiers
	 * @param modelElements
	 * @param strategy
	 * @return
	 */
	protected Collection<List<EObject>> getAllInstancesInTheModel(
			List<EClassifier> classifiers, Collection<EObject> modelElements,
			UnfoldingStrategy strategy) {
		Collection<List<EObject>> res = new ArrayList<>();
		// Get all permutations possible of the right types
		Collection<List<EObject>> allListsWithTypeConformance = getAllInstancesInTheModel(
				classifiers, modelElements);

		// Now filter according to the instantiation rules.
		for (List<EObject> listWithTypeConformance : allListsWithTypeConformance) {

			UnfoldingStrategyInterpreter interpreter = new UnfoldingStrategyInterpreter(
					listWithTypeConformance);
			if (interpreter.doSwitch(strategy)) {
				res.add(listWithTypeConformance);
			}
		}

		return res;
	}

	/**
	 * 
	 * @param classifiers
	 * @param modelElements
	 * @return the collection of all the lists of EObjects possible,
	 *         respectively instances of the corresponding given EClassifier.
	 */
	protected Collection<List<EObject>> getAllInstancesInTheModel(
			List<EClassifier> classifiers, Collection<EObject> modelElements) {
		List<Collection<EObject>> listOfAllInstances = new ArrayList<>();
		for (EClassifier classifier : classifiers) {
			listOfAllInstances.add(getAllInstancesInTheModel(classifier,
					modelElements));
		}
		return doAllPermutationsPossible(listOfAllInstances);
	}

	protected Collection<List<EObject>> doAllPermutationsPossible(
			List<Collection<EObject>> listOfCollectionsOfEObjects) {
		Collection<List<EObject>> res = new ArrayList<>();

		res = recursiveDoAllPermutationsPossible(res,
				listOfCollectionsOfEObjects);

		// We check all the lists returned have the right size (size of the
		// given list in argument). Else, if we are missing some EObjects we
		// don't want to half-instantiate some MSEs.
		Boolean allListsHaveTheRightSize = true;
		for (List<EObject> listOfEObjects : res) {
			allListsHaveTheRightSize = allListsHaveTheRightSize
					&& listOfEObjects.size() == listOfCollectionsOfEObjects
							.size();
		}
		if (allListsHaveTheRightSize) {
			return res;
		} else {
			return new ArrayList<>();
		}

	}

	/**
	 * Given a list of collection of EObjects, for instance [(a1, a2, a3), (b2,
	 * b3, b1)], it creates the collection of all the possible permutations
	 * possible, e.g. ([a1, b2], [a1, b3], [a1, b1], [a2, b2], [a2, b3], [a2,
	 * b1], [a3, b2], [a3, b3], [a3, b1]). First parameter is there to do it
	 * recursively.
	 * <ul>
	 * <li>Step 1: () + [(a1, a2, a3), (b2, b3, b1)]</li>
	 * <li>Step 2: ([a1], [a2], [a3]) + [(b2, b3, b1)]</li>
	 * <li>Step 3: ([a1, b2], [a1, b3], [a1, b1], [a2, b2], [a2, b3], [a2, b1],
	 * [a3, b2], [a3, b3], [a3, b1])</li>
	 * </ul>
	 * 
	 * 
	 * @param res
	 * @param listOfCollectionsOfEObjects
	 * @return
	 */
	protected Collection<List<EObject>> recursiveDoAllPermutationsPossible(
			Collection<List<EObject>> res,
			List<Collection<EObject>> listOfCollectionsOfEObjects) {

		// Either there are no objects / no more objects so we just return what
		// we got there.
		if (listOfCollectionsOfEObjects.isEmpty()) {
			return res;
		}
		// There are some objects, but first we must check if its the first
		// round or the last round.
		if (res.isEmpty()) {
			Collection<EObject> firstCollection = listOfCollectionsOfEObjects
					.get(0);
			for (EObject eo : firstCollection) {
				List<EObject> newList = new ArrayList<>();
				newList.add(eo);
				res.add(newList);
			}
			if (listOfCollectionsOfEObjects.size() != 1) {
				return recursiveDoAllPermutationsPossible(res,
						listOfCollectionsOfEObjects.subList(1,
								listOfCollectionsOfEObjects.size()));
			} else {
				return res;
			}
		}
		// General case : there are objects and it's not the first round.
		Collection<EObject> firstCollection = listOfCollectionsOfEObjects
				.get(0);
		Collection<List<EObject>> newlyCreatedLists = new ArrayList<List<EObject>>();
		Set<List<EObject>> listsToRemove = new HashSet<>();
		for (EObject eo : firstCollection) {
			for (List<EObject> list : res) {
				List<EObject> newList = new ArrayList<>(list);
				newList.add(eo);
				newlyCreatedLists.add(newList);
				listsToRemove.add(list);
			}
		}
		res.removeAll(listsToRemove);
		res.addAll(newlyCreatedLists);

		return recursiveDoAllPermutationsPossible(res,
				listOfCollectionsOfEObjects.subList(1,
						listOfCollectionsOfEObjects.size()));
	}

	/**
	 * 
	 * @param classifier
	 * @param modelElements
	 * @return the collection of EObjects among the modelElements which are
	 *         instances of the EClassifier classifier.
	 */
	protected Collection<EObject> getAllInstancesInTheModel(
			EClassifier classifier, Collection<EObject> modelElements) {
		Collection<EObject> res = new ArrayList<>();

		for (EObject eo : modelElements) {
			if (manuallyCheckEObjectIsInstanceOfEClassifier(eo, classifier)) {
				res.add(eo);
			}
		}

		return res;
	}

	/**
	 * Equality between EObjects can be weird if they are loaded from different
	 * resources for instance.
	 * 
	 * @param eo
	 * @param eClass
	 * @return
	 */
	protected Boolean manuallyCheckEObjectIsInstanceOfEClassifier(EObject eo,
			EClassifier classifier) {
		if (eo.eClass().getName().equals(classifier.getName())) {
			return true;
		} else {
			if (classifier instanceof EClass) {
				EClass eClass = (EClass) classifier;

				if (GExpressionsHelper.eClassIsSuperTypeOf(eClass, eo.eClass())) {
					return true;
				}
			} else {
				return false;
			}
		}
		return false;
	}

	protected Collection<AtomicModelSpecificEvent> unfoldAtomicDomainSpecificEvent(
			AtomicDomainSpecificEvent dse, Collection<Clock> clocks,
			Collection<EObject> concernedEObjects) {
		Collection<AtomicModelSpecificEvent> res = new ArrayList<>();

		for (EObject context : concernedEObjects) {
			try {
				AtomicModelSpecificEvent mse = microgelFactory
						.createAtomicModelSpecificEvent();
				// First, give a name to the freshly created MSE
				mse.setName(getNameForMse(dse,
						Collections.singletonList(context)));
				mse.setVisibility(adaptVisibility(dse));
				mse.setExecutionKind(adaptExecutionKind(dse));
				mse.setTarget(context);

				// Then, fill-in the part concerning the Execution Function.
				// For now, they are similar in microgel and GEL, so it is just
				// an
				// adaptation
				if (dse.getExecutionFunction() != null) {
					mse.setExecutionFunction(getExecutionFunctionForMse(dse,
							context));
				}

				// Then, fill-in the part concerning the MoccEvent instances.
				mse.setUponMoccEventInstance(getMoccEventInstanceForMse(
						dse.getUponMoccEvent(), clocks, context));
				if (dse.getRaisedMoccEvent() != null) {
					mse.setRaisedMoccEventInstance(getMoccEventInstanceForMse(
							dse.getRaisedMoccEvent(), clocks, context));
				}

				// Finally, if there is a feedback policy for the DSE then there
				// is
				// one for the MSE.
				if (dse.getFeedbackPolicy() != null) {
					mse.setFeedbackPolicy(createNewFeedbackPolicy(
							dse.getFeedbackPolicy(), clocks, context, mse, dse));

				}
				res.add(mse);
			} catch (GELUnfoldingException e) {
				// Skip instantiating this DSE for this context because it
				// failed.
			}
		}

		return res;
	}

	protected org.gemoc.gel.microgel.Visibility adaptVisibility(
			DomainSpecificEvent dse) {
		if (dse.getVisibility().equals(org.gemoc.gel.Visibility.PUBLIC)) {
			return org.gemoc.gel.microgel.Visibility.PUBLIC;
		} else if (dse.getVisibility().equals(org.gemoc.gel.Visibility.PRIVATE)) {
			return org.gemoc.gel.microgel.Visibility.PRIVATE;
		} else {
			throw new RuntimeException(
					"There is a problem with the adaptation of a DSE's Visibility from GEL to microgel");
		}
	}

	protected org.gemoc.gel.microgel.ExecutionKind adaptExecutionKind(
			AtomicDomainSpecificEvent dse) {
		if (dse.getExecutionKind().equals(
				org.gemoc.gel.ExecutionKind.SUBMISSION)) {
			return org.gemoc.gel.microgel.ExecutionKind.SUBMISSION;
		} else if (dse.getExecutionKind().equals(
				org.gemoc.gel.ExecutionKind.INTERRUPTION)) {
			return org.gemoc.gel.microgel.ExecutionKind.INTERRUPTION;
		} else {
			throw new RuntimeException(
					"There is a problem with the adaptation of a DSE's ExecutionKind from GEL to microgel");
		}
	}

	protected org.gemoc.gel.microgel.CallKind adaptCallKind(
			org.gemoc.gel.ExecutionFunction executionFunction) {
		if (executionFunction.getCallKind().equals(
				org.gemoc.gel.CallKind.BLOCKING)) {
			return org.gemoc.gel.microgel.CallKind.BLOCKING;
		} else if (executionFunction.getCallKind().equals(
				org.gemoc.gel.CallKind.NON_BLOCKING)) {
			return org.gemoc.gel.microgel.CallKind.NON_BLOCKING;
		} else {
			throw new RuntimeException(
					"There is a problem with the adaptation of an Execution Function's CallKind from GEL to microgel");
		}
	}

	/**
	 * The name of an MSE is the concatenation of the name of the DSE it is an
	 * instance of, an underscore character, and a string representation
	 * available for any EObject.
	 * 
	 * @param dse
	 * @param context
	 * @return
	 */
	protected String getNameForMse(DomainSpecificEvent dse,
			List<EObject> context) {
		String res = dse.getName();
		for (EObject eo : context) {
			res += "_" + GELHelper.getStringRepresentationOfEObject(eo);
		}
		return res;
	}

	/**
	 * Creates the proper ExecutionFunction for the MSE.
	 * 
	 * @param dse
	 * @param context
	 * @return
	 */
	protected org.gemoc.gel.microgel.ExecutionFunction getExecutionFunctionForMse(
			AtomicDomainSpecificEvent dse, EObject context)
			throws GELUnfoldingException {
		org.gemoc.gel.ExecutionFunction functionTriggeredByDse = dse
				.getExecutionFunction();
		org.gemoc.gel.microgel.ExecutionFunction newExecutionFunction = null;
		if (functionTriggeredByDse instanceof org.gemoc.gel.Kermeta3ExecutionFunction) {
			newExecutionFunction = microgelFactory
					.createKermeta3ExecutionFunction();
			((org.gemoc.gel.microgel.Kermeta3ExecutionFunction) newExecutionFunction)
					.setOperation(GELHelper
							.determineOperationOfExecutionFunction((org.gemoc.gel.Kermeta3ExecutionFunction) functionTriggeredByDse));
			EObject target = GELHelper
					.determineTargetOfExecutionFunction(
							(org.gemoc.gel.Kermeta3ExecutionFunction) functionTriggeredByDse,
							context);
			if (target != null) {
				((org.gemoc.gel.microgel.Kermeta3ExecutionFunction) newExecutionFunction)
						.setTarget(target);
			} else {
				// Expression path could not be instantiated for the model, e.g.
				// the path C.a.b.f() fails for a particular bit of this object,
				// typically because C.a is null.
				// Cancel the MSE.
				throw new GELUnfoldingException(
						context,
						(org.gemoc.gel.Kermeta3ExecutionFunction) functionTriggeredByDse);
			}
		}

		newExecutionFunction.setCallKind(adaptCallKind(functionTriggeredByDse));

		// If it has a result then we need to adapt it to microgel
		if (functionTriggeredByDse.getResult() != null) {
			org.gemoc.gel.microgel.ExecutionFunctionResult newResult = microgelFactory
					.createExecutionFunctionResult();
			newResult.setName(functionTriggeredByDse.getResult().getName());
			newExecutionFunction.setResult(newResult);
		}

		return newExecutionFunction;
	}

	/**
	 * Looking up which CCSL Clock corresponds to the given MoccEvent and the
	 * given context.
	 * 
	 * @param moccEvent
	 * @param clocks
	 * @param context
	 * @return
	 */
	protected MoccEventInstance getMoccEventInstanceForMse(MoccEvent moccEvent,
			Collection<Clock> clocks, EObject context) {
		return getMoccEventInstanceCorrespondingTo(moccEvent, clocks, context);
	}

	/**
	 * Looks up the CCSL Clock corresponding to the given MoccEvent (ECL event)
	 * and the given context.
	 * 
	 * @param moccEvent
	 * @param clocks
	 * @param context
	 * @return
	 */
	protected MoccEventInstance getMoccEventInstanceCorrespondingTo(
			MoccEvent moccEvent, Collection<Clock> clocks, EObject context) {
		CcslClock res = microgelFactory.createCcslClock();

		if (moccEvent instanceof EclEvent) {
			EclEvent eclEvent = (EclEvent) moccEvent;
			// TODO: EObjects from the model should have a name feature. If
			// they don't, the ECL compilation will go wrong. Therefore we
			// are sure there is a feature called name.
			String nameOfObject = (String) context.eGet(context.eClass()
					.getEStructuralFeature("name"));
			Clock clockCorrespondingToContext = null;
			for (Clock clock : clocks) {
				String nameOfClock = clock.getName();
				if (nameOfClock
						.contains(eclEvent.getEventReference().getName())
						&& nameOfClock.contains(nameOfObject)) {
					clockCorrespondingToContext = clock;
					break;
				}
			}

			res.setReferencedClock(clockCorrespondingToContext);
		} else {
			throw new RuntimeException(
					"Could not determine concrete type of the MoccEvent: "
							+ moccEvent.toString());
		}

		return (MoccEventInstance) res;
	}

	/**
	 * Adapt the FeedbackPolicy of the DSE for the MSE with the given context.
	 * 
	 * @param oldFeedbackPolicy
	 * @param clocks
	 * @param context
	 * @return
	 * @throws GELUnfoldingException
	 */
	protected org.gemoc.gel.microgel.FeedbackPolicy createNewFeedbackPolicy(
			org.gemoc.gel.FeedbackPolicy oldFeedbackPolicy,
			Collection<Clock> clocks, EObject context,
			AtomicModelSpecificEvent mse, AtomicDomainSpecificEvent dse)
			throws GELUnfoldingException {
		org.gemoc.gel.microgel.FeedbackPolicy res = microgelFactory
				.createFeedbackPolicy();

		org.gemoc.gel.FeedbackRule oldDefaultRule = oldFeedbackPolicy
				.getDefaultRule();
		org.gemoc.gel.microgel.FeedbackRule newDefaultRule = adaptFeedbackRule(
				oldDefaultRule, clocks, context, mse, dse);
		res.setDefaultRule(newDefaultRule);
		for (org.gemoc.gel.FeedbackRule oldRule : oldFeedbackPolicy.getRules()) {
			org.gemoc.gel.microgel.FeedbackRule newRule = adaptFeedbackRule(
					oldRule, clocks, context, mse, dse);
			res.getRules().add(newRule);
		}

		return res;
	}

	/**
	 * Adapts the FeedbackRule for the given context.
	 * 
	 * @param rule
	 * @param clocks
	 * @param context
	 * @return
	 */
	protected org.gemoc.gel.microgel.FeedbackRule adaptFeedbackRule(
			org.gemoc.gel.FeedbackRule rule, Collection<Clock> clocks,
			EObject context, AtomicModelSpecificEvent mse,
			AtomicDomainSpecificEvent dse) throws GELUnfoldingException {
		org.gemoc.gel.microgel.FeedbackRule res = microgelFactory
				.createFeedbackRule();

		if (rule.getFilter() != null) {
			org.gemoc.gel.microgel.FeedbackFilter newFilter = microgelFactory
					.createFeedbackFilter();
			newFilter.setBody(adaptGExpression(rule.getFilter().getBody(), mse,
					dse));
			res.setFilter(newFilter);
		}

		org.gemoc.gel.microgel.FeedbackConsequence newConsequence = microgelFactory
				.createFeedbackConsequence();
		MoccEvent moccEventConsequence = GELHelper
				.determineMoccEventOfFeedbackConsequence(rule.getConsequence());
		// Retrieve the EObject hosting the MoccEvent
		// e.g. expression Transition.source§onEnter becomes the value of
		// "Transition.source" where Transition is "eo".
		EObject contextOwningMoccEvent = GELHelper
				.determineEObjectInFeedbackConsequenceExpression(
						rule.getConsequence(), context);
		if (moccEventConsequence != null) {
			MoccEventInstance ccslClock = getMoccEventInstanceCorrespondingTo(
					moccEventConsequence, clocks, contextOwningMoccEvent);
			newConsequence.setTarget(ccslClock);
		} else {
			throw new GELUnfoldingException(context, rule.getConsequence());
		}
		res.setConsequence(newConsequence);

		return res;
	}

	protected GExpression adaptGExpression(GExpression exp,
			AtomicModelSpecificEvent mse, AtomicDomainSpecificEvent dse) {
		GExpression res = EcoreUtil.copy(exp);

		// Locate the GReferenceExpression referencing an
		// ExecutionFunctionResult
		Collection<GReferenceExpression> referenceExpressions = (new GReferenceExpressionFinder())
				.doSwitch(res);

		// Change the GEL ExecutionFunctionResult for a microgel
		// ExecutionFunctionResult.
		for (GReferenceExpression refExp : referenceExpressions) {
			if (refExp.getReferencedEObject().equals(
					dse.getExecutionFunction().getResult())) {
				refExp.setReferencedEObject(((AtomicModelSpecificEvent) mse)
						.getExecutionFunction().getResult());
			}
		}

		return res;
	}

	/**
	 * Unfolding a composite DSE. Either it has no unfolding strategy and thus
	 * is linear, DSE D : A -> B gives two instances D1 : A1 -> B1 and D2 : A2
	 * -> B2 and A and B are defined within the same context. Or it has an
	 * unfolding strategy, in which case the context of the composite DSE is the
	 * list of classes declared a local variables and instantiation obeys the
	 * predicates of the strategy.
	 * 
	 * @param dse
	 * @param modelElements
	 * @return
	 */
	protected Collection<CompositeModelSpecificEvent> unfoldCompositeDomainSpecificEvent(
			CompositeDomainSpecificEvent dse, Collection<EObject> modelElements) {
		Collection<CompositeModelSpecificEvent> res = new ArrayList<>();

		// First we determine the context of this DSE, that is, either the
		// EClassifier context of the pattern's arguments, or the set of
		// EClassifiers used for local variables in the unfolding strategy.
		List<EClassifier> dseContext = GELHelper
				.determineContextOfDomainSpecificEvent(dse);

		// Then we retrieve all the EObjects which are instances of the context
		// and respect the instantiation rules of the unfolding strategy of the
		// composite DSE.
		Collection<List<EObject>> concernedEObjects = null;
		if (dse.getUnfoldingStrategy() != null) {
			concernedEObjects = getAllInstancesInTheModel(dseContext,
					modelElements, dse.getUnfoldingStrategy());
		} else {
			concernedEObjects = getAllInstancesInTheModel(dseContext,
					modelElements);
		}

		// For each list of EObject, a new Composite MSE is created. Its pattern
		// is
		// similar to the DSE's, but the arguments will be the MSEs
		// corresponding to each EObject.
		for (List<EObject> listOfParameters : concernedEObjects) {
			CompositeModelSpecificEvent mse = microgelFactory
					.createCompositeModelSpecificEvent();
			mse.setName(getNameForMse(dse, listOfParameters));
			mse.setVisibility(adaptVisibility(dse));
			mse.getTargets().addAll(listOfParameters);
			mse.setBody(adaptAndUnfoldPattern(dse.getBody(), listOfParameters));
			res.add(mse);
		}

		return res;
	}

	protected ModelSpecificEventsPattern adaptAndUnfoldPattern(
			DomainSpecificEventsPattern pattern, List<EObject> context) {
		return (new CompositePatternAdapterAndUnfolder(context, trace))
				.doSwitch(pattern);
	}

}
