package org.gemoc.gel.compiler;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.EcoreUtil2;
import org.gemoc.gel.DomainSpecificEvent;
import org.gemoc.gel.DomainSpecificEventReference;
import org.gemoc.gel.DomainSpecificEventReferenceWithArguments;
import org.gemoc.gel.DomainSpecificEventsPattern;
import org.gemoc.gel.IterationPattern;
import org.gemoc.gel.LocalVariable;
import org.gemoc.gel.LogicalSequence;
import org.gemoc.gel.OrPattern;
import org.gemoc.gel.PlusPattern;
import org.gemoc.gel.UnfoldingStrategy;
import org.gemoc.gel.XorPattern;
import org.gemoc.gel.microgel.MicrogelFactory;
import org.gemoc.gel.microgel.ModelSpecificEvent;
import org.gemoc.gel.microgel.ModelSpecificEventReference;
import org.gemoc.gel.microgel.ModelSpecificEventsPattern;
import org.gemoc.gel.microgel.utils.MicrogelHelper;
import org.gemoc.gel.util.GelSwitch;
import org.gemoc.gel.utils.LocalVariableArgumentsCollector;

/**
 * Given a DSE pattern, this class creates and returns the appropriate MSE
 * pattern, depending on the EObject given as context in the constructor.
 * 
 * For instance, DSE C : 'A -> B' where A and B are atomic DSEs, will create the
 * MSEs C1 : A1 -> B1 and C2 : A2 -> B2 if there are two objects o1 and o2 which
 * are instance of the context of A/B/C
 * 
 * 
 * @author flatombe
 *
 */
public class CompositePatternAdapterAndUnfolder extends
		GelSwitch<ModelSpecificEventsPattern> {

	private List<EObject> context;
	private GelCompilationTrace trace;

	public CompositePatternAdapterAndUnfolder(List<EObject> context,
			GelCompilationTrace trace) {
		this.context = context;
		this.trace = trace;
	}

	@Override
	public ModelSpecificEventsPattern caseDomainSpecificEventReference(
			DomainSpecificEventReference object) {
		ModelSpecificEventReference res = MicrogelFactory.eINSTANCE
				.createModelSpecificEventReference();
		DomainSpecificEvent dse = object.getReferencedDse();
		Collection<ModelSpecificEvent> mses = trace.get(dse);
		for (ModelSpecificEvent mse : mses) {
			// Looking upon all the MSEs created by the referenced DSE, we are
			// looking for the MSEs with the right context.

			List<EObject> mseContext = MicrogelHelper
					.determineContextOfModelSpecificEvent(mse);

			List<EObject> objectsFromTheContextWithTheRightIndexes = new ArrayList<>();
			if (object instanceof DomainSpecificEventReferenceWithArguments) {
				// If the pattern is DSE(x, y, z, ...) we get the local
				// variables used [x, y, z, ...]
				List<LocalVariable> listOfLocalVariablesUsed = (new LocalVariableArgumentsCollector())
						.doSwitch(((DomainSpecificEventReferenceWithArguments) object)
								.getArguments());
				// Now we know that [x, y, z, ...] are taken from a longer list
				// like [a, b, c, ..., x, y, z, ...]
				// And that context is a list of instances of [a, b, c, ...]
				// So we lookup the index of [x, y, z, ...] in all the local
				// variables of the strategy and get the EObjects from the
				// context with the same indexes.
				List<Integer> indexesOfLocalVariablesUsed = new ArrayList<>();
				for (LocalVariable localVariable : listOfLocalVariablesUsed) {
					UnfoldingStrategy owningStrategy = EcoreUtil2
							.getContainerOfType(localVariable,
									UnfoldingStrategy.class);
					indexesOfLocalVariablesUsed.add(owningStrategy
							.getLocalVariables().indexOf(localVariable));
				}
				for (Integer index : indexesOfLocalVariablesUsed) {
					objectsFromTheContextWithTheRightIndexes.add(context
							.get(index));
				}
			} else if (object instanceof DomainSpecificEventReference) {
				// By default the context for the Composite MSE is the same as
				// the context of each MSE reference argument from its pattern.
				objectsFromTheContextWithTheRightIndexes.addAll(context);

			} else {
				throw new RuntimeException(
						"Could not determine concrete type of : " + object);
			}
			Boolean contextAreEquals = mseContext.size() == objectsFromTheContextWithTheRightIndexes
					.size();
			for (int i = 0; i < objectsFromTheContextWithTheRightIndexes.size(); i++) {
				contextAreEquals = contextAreEquals
						&& mseContext.get(i) == objectsFromTheContextWithTheRightIndexes
								.get(i);
			}

			if (contextAreEquals) {
				res.setReferencedMse(mse);
				break;
			}

		}
		return res;
	}

	@Override
	public ModelSpecificEventsPattern caseCoincidencePattern(
			org.gemoc.gel.CoincidencePattern object) {
		org.gemoc.gel.microgel.CoincidencePattern res = MicrogelFactory.eINSTANCE
				.createCoincidencePattern();
		this.setOperands(res, object.getLeftOperand(), object.getRightOperand());
		return res;
	}

	@Override
	public ModelSpecificEventsPattern caseIterationPattern(
			IterationPattern object) {
		org.gemoc.gel.microgel.IterationPattern res = MicrogelFactory.eINSTANCE
				.createIterationPattern();
		res.setNumberOfIterations(object.getNumberOfIterations());
		this.setOperand(res, object.getOperand());
		return res;
	}

	@Override
	public ModelSpecificEventsPattern caseLogicalSequence(LogicalSequence object) {
		org.gemoc.gel.microgel.LogicalSequence res = MicrogelFactory.eINSTANCE
				.createLogicalSequence();
		this.setOperands(res, object.getLeftOperand(), object.getRightOperand());
		return res;
	}

	@Override
	public ModelSpecificEventsPattern caseOrPattern(OrPattern object) {
		org.gemoc.gel.microgel.OrPattern res = MicrogelFactory.eINSTANCE
				.createOrPattern();
		this.setOperands(res, object.getLeftOperand(), object.getRightOperand());
		return res;
	}

	@Override
	public ModelSpecificEventsPattern casePlusPattern(PlusPattern object) {
		org.gemoc.gel.microgel.PlusPattern res = MicrogelFactory.eINSTANCE
				.createPlusPattern();
		this.setOperand(res, object.getOperand());
		return res;
	}

	@Override
	public ModelSpecificEventsPattern caseXorPattern(XorPattern object) {
		org.gemoc.gel.microgel.XorPattern res = MicrogelFactory.eINSTANCE
				.createXorPattern();
		this.setOperands(res, object.getLeftOperand(), object.getRightOperand());
		return res;
	}

	private void setOperands(org.gemoc.gel.microgel.BinaryPattern pattern,
			DomainSpecificEventsPattern leftOperand,
			DomainSpecificEventsPattern rightOperand) {
		pattern.setLeftOperand(this.doSwitch(leftOperand));
		pattern.setRightOperand(this.doSwitch(rightOperand));
	}

	private void setOperand(org.gemoc.gel.microgel.UnaryPattern pattern,
			DomainSpecificEventsPattern operand) {
		pattern.setOperand(this.doSwitch(operand));
	}
}
