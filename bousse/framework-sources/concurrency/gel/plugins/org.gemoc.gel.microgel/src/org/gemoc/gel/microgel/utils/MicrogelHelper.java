package org.gemoc.gel.microgel.utils;

import java.util.Collections;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.gemoc.gel.microgel.AtomicModelSpecificEvent;
import org.gemoc.gel.microgel.CcslClock;
import org.gemoc.gel.microgel.CompositeModelSpecificEvent;
import org.gemoc.gel.microgel.MicrogelFactory;
import org.gemoc.gel.microgel.MoccEventInstance;
import org.gemoc.gel.microgel.ModelSpecificEvent;
import org.gemoc.gel.microgel.ModelSpecificEventsSpecification;

import fr.inria.aoste.timesquare.ccslkernel.model.TimeModel.Clock;

public class MicrogelHelper {
	private static MicrogelFactory factory = MicrogelFactory.eINSTANCE;

	public static MoccEventInstance createCorrespondingMoccEventInstance(
			Object o) {
		final MoccEventInstance res;
		if (o instanceof Clock) {
			res = factory.createCcslClock();
			((CcslClock) res).setReferencedClock((Clock) o);
		} else {
			throw new UnsupportedOperationException(
					"Could not determine concrete type of " + o.toString());
		}
		return res;
	}

	/**
	 * 
	 * @param mse
	 * @return if the MSE is atomical, it returns the MSE's target EObject ;
	 *         else it looks up all the arguments of the pattern of MSEs and if
	 *         all the contexts are the same EObject, then it returns it. If
	 *         not, then a RuntimeException is thrown as it should not be
	 *         possible to specify such an MSE in the first place.
	 */
	public static List<EObject> determineContextOfModelSpecificEvent(
			ModelSpecificEvent mse) {
		if (mse instanceof AtomicModelSpecificEvent) {
			return Collections.singletonList(((AtomicModelSpecificEvent) mse)
					.getTarget());
		} else {
			CompositeModelSpecificEvent composite = (CompositeModelSpecificEvent) mse;
			return composite.getTargets();

			// Collection<ModelSpecificEvent> arguments = (new
			// CompositeMseArgumentCollector())
			// .doSwitch(composite.getBody());
			// if (arguments.contains(mse)) {
			// throw new IllegalArgumentException(
			// "Cyclic definition of Composite MSE");
			// }
			// Collection<List<EObject>> contextOfArguments = new ArrayList<>();
			// for (ModelSpecificEvent argument : arguments) {
			// if (argument instanceof CompositeModelSpecificEvent) {
			// Collection<ModelSpecificEvent> argumentArguments = (new
			// CompositeMseArgumentCollector())
			// .doSwitch(((CompositeModelSpecificEvent) argument)
			// .getBody());
			// if (argumentArguments.contains(mse)) {
			// throw new IllegalArgumentException(
			// "Cyclic Definition of Composite MSE");
			// }
			// }
			//
			// contextOfArguments
			// .add(determineContextOfModelSpecificEvent(argument));
			// }
			// List<EObject> firstContext =
			// contextOfArguments.iterator().next();
			// Boolean contextsAreAllTheSame = true;
			// for (List<EObject> context : contextOfArguments) {
			// for (EObject eo : context) {
			// contextsAreAllTheSame = contextsAreAllTheSame
			// && (eo.equals(firstContext.get(context.indexOf(eo))) ||
			// getStringRepresentationOfEObject(
			// eo)
			// .equals(getStringRepresentationOfEObject(firstContext
			// .get(context.indexOf(eo)))));
			// }
			// }
			// if (contextsAreAllTheSame) {
			// return firstContext;
			// } else {
			// throw new RuntimeException(
			// "The arguments of the Composite MSE are not all within the same context: this should be caught by (micro)GEL validation beforehand. "
			// + composite.toString());
			//
			// }
		}
	}

	public static boolean hasEventsRaisingMoccEventInstances(
			ModelSpecificEventsSpecification specification) {
		for (ModelSpecificEvent mse : specification.getEvents()) {
			if (mse instanceof AtomicModelSpecificEvent) {
				if (((AtomicModelSpecificEvent) mse)
						.getRaisedMoccEventInstance() != null) {
					return true;
				}
			}
		}
		return false;
	}
}
