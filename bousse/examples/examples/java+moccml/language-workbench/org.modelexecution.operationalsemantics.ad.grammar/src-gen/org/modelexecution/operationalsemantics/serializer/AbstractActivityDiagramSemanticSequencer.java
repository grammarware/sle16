package org.modelexecution.operationalsemantics.serializer;

import activitydiagram.Activity;
import activitydiagram.ActivityFinalNode;
import activitydiagram.ActivitydiagramPackage;
import activitydiagram.BooleanBinaryExpression;
import activitydiagram.BooleanUnaryExpression;
import activitydiagram.BooleanValue;
import activitydiagram.BooleanVariable;
import activitydiagram.ControlFlow;
import activitydiagram.DecisionNode;
import activitydiagram.ForkNode;
import activitydiagram.InitialNode;
import activitydiagram.IntegerCalculationExpression;
import activitydiagram.IntegerComparisonExpression;
import activitydiagram.IntegerValue;
import activitydiagram.IntegerVariable;
import activitydiagram.JoinNode;
import activitydiagram.MergeNode;
import activitydiagram.OpaqueAction;
import com.google.inject.Inject;
import com.google.inject.Provider;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import org.modelexecution.operationalsemantics.services.ActivityDiagramGrammarAccess;

@SuppressWarnings("all")
public abstract class AbstractActivityDiagramSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private ActivityDiagramGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == ActivitydiagramPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case ActivitydiagramPackage.ACTIVITY:
				if(context == grammarAccess.getActivityRule()) {
					sequence_Activity(context, (Activity) semanticObject); 
					return; 
				}
				else break;
			case ActivitydiagramPackage.ACTIVITY_FINAL_NODE:
				if(context == grammarAccess.getActivityFinalNodeRule() ||
				   context == grammarAccess.getActivityNodeRule()) {
					sequence_ActivityFinalNode(context, (ActivityFinalNode) semanticObject); 
					return; 
				}
				else break;
			case ActivitydiagramPackage.BOOLEAN_BINARY_EXPRESSION:
				if(context == grammarAccess.getBooleanBinaryExpressionRule() ||
				   context == grammarAccess.getExpressionRule()) {
					sequence_BooleanBinaryExpression(context, (BooleanBinaryExpression) semanticObject); 
					return; 
				}
				else break;
			case ActivitydiagramPackage.BOOLEAN_UNARY_EXPRESSION:
				if(context == grammarAccess.getBooleanUnaryExpressionRule() ||
				   context == grammarAccess.getExpressionRule()) {
					sequence_BooleanUnaryExpression(context, (BooleanUnaryExpression) semanticObject); 
					return; 
				}
				else break;
			case ActivitydiagramPackage.BOOLEAN_VALUE:
				if(context == grammarAccess.getBooleanValueRule() ||
				   context == grammarAccess.getValueRule()) {
					sequence_BooleanValue(context, (BooleanValue) semanticObject); 
					return; 
				}
				else break;
			case ActivitydiagramPackage.BOOLEAN_VARIABLE:
				if(context == grammarAccess.getBooleanVariableRule() ||
				   context == grammarAccess.getVariableRule()) {
					sequence_BooleanVariable(context, (BooleanVariable) semanticObject); 
					return; 
				}
				else break;
			case ActivitydiagramPackage.CONTROL_FLOW:
				if(context == grammarAccess.getActivityEdgeRule() ||
				   context == grammarAccess.getControlFlowRule()) {
					sequence_ControlFlow(context, (ControlFlow) semanticObject); 
					return; 
				}
				else break;
			case ActivitydiagramPackage.DECISION_NODE:
				if(context == grammarAccess.getActivityNodeRule() ||
				   context == grammarAccess.getDecisionNodeRule()) {
					sequence_DecisionNode(context, (DecisionNode) semanticObject); 
					return; 
				}
				else break;
			case ActivitydiagramPackage.FORK_NODE:
				if(context == grammarAccess.getActivityNodeRule() ||
				   context == grammarAccess.getForkNodeRule()) {
					sequence_ForkNode(context, (ForkNode) semanticObject); 
					return; 
				}
				else break;
			case ActivitydiagramPackage.INITIAL_NODE:
				if(context == grammarAccess.getActivityNodeRule() ||
				   context == grammarAccess.getInitialNodeRule()) {
					sequence_InitialNode(context, (InitialNode) semanticObject); 
					return; 
				}
				else break;
			case ActivitydiagramPackage.INTEGER_CALCULATION_EXPRESSION:
				if(context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getIntegerCalculationExpressionRule()) {
					sequence_IntegerCalculationExpression(context, (IntegerCalculationExpression) semanticObject); 
					return; 
				}
				else break;
			case ActivitydiagramPackage.INTEGER_COMPARISON_EXPRESSION:
				if(context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getIntegerComparisonExpressionRule()) {
					sequence_IntegerComparisonExpression(context, (IntegerComparisonExpression) semanticObject); 
					return; 
				}
				else break;
			case ActivitydiagramPackage.INTEGER_VALUE:
				if(context == grammarAccess.getIntegerValueRule() ||
				   context == grammarAccess.getValueRule()) {
					sequence_IntegerValue(context, (IntegerValue) semanticObject); 
					return; 
				}
				else break;
			case ActivitydiagramPackage.INTEGER_VARIABLE:
				if(context == grammarAccess.getIntegerVariableRule() ||
				   context == grammarAccess.getVariableRule()) {
					sequence_IntegerVariable(context, (IntegerVariable) semanticObject); 
					return; 
				}
				else break;
			case ActivitydiagramPackage.JOIN_NODE:
				if(context == grammarAccess.getActivityNodeRule() ||
				   context == grammarAccess.getJoinNodeRule()) {
					sequence_JoinNode(context, (JoinNode) semanticObject); 
					return; 
				}
				else break;
			case ActivitydiagramPackage.MERGE_NODE:
				if(context == grammarAccess.getActivityNodeRule() ||
				   context == grammarAccess.getMergeNodeRule()) {
					sequence_MergeNode(context, (MergeNode) semanticObject); 
					return; 
				}
				else break;
			case ActivitydiagramPackage.OPAQUE_ACTION:
				if(context == grammarAccess.getActivityNodeRule() ||
				   context == grammarAccess.getOpaqueActionRule()) {
					sequence_OpaqueAction(context, (OpaqueAction) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (name=EString incoming+=[ActivityEdge|ID] incoming+=[ActivityEdge|ID]*)
	 */
	protected void sequence_ActivityFinalNode(EObject context, ActivityFinalNode semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=EString 
	 *         (inputs+=Variable inputs+=Variable*)? 
	 *         (locals+=Variable locals+=Variable*)? 
	 *         (nodes+=ActivityNode nodes+=ActivityNode*)? 
	 *         (edges+=ActivityEdge edges+=ActivityEdge*)?
	 *     )
	 */
	protected void sequence_Activity(EObject context, Activity semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (assignee=[BooleanVariable|ID] operand1=[BooleanVariable|ID] operator=BooleanBinaryOperator operand2=[BooleanVariable|ID])
	 */
	protected void sequence_BooleanBinaryExpression(EObject context, BooleanBinaryExpression semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ActivitydiagramPackage.Literals.BOOLEAN_EXPRESSION__ASSIGNEE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ActivitydiagramPackage.Literals.BOOLEAN_EXPRESSION__ASSIGNEE));
			if(transientValues.isValueTransient(semanticObject, ActivitydiagramPackage.Literals.BOOLEAN_BINARY_EXPRESSION__OPERAND1) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ActivitydiagramPackage.Literals.BOOLEAN_BINARY_EXPRESSION__OPERAND1));
			if(transientValues.isValueTransient(semanticObject, ActivitydiagramPackage.Literals.BOOLEAN_BINARY_EXPRESSION__OPERAND2) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ActivitydiagramPackage.Literals.BOOLEAN_BINARY_EXPRESSION__OPERAND2));
			if(transientValues.isValueTransient(semanticObject, ActivitydiagramPackage.Literals.BOOLEAN_BINARY_EXPRESSION__OPERATOR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ActivitydiagramPackage.Literals.BOOLEAN_BINARY_EXPRESSION__OPERATOR));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getBooleanBinaryExpressionAccess().getAssigneeBooleanVariableIDTerminalRuleCall_0_0_1(), semanticObject.getAssignee());
		feeder.accept(grammarAccess.getBooleanBinaryExpressionAccess().getOperand1BooleanVariableIDTerminalRuleCall_2_0_1(), semanticObject.getOperand1());
		feeder.accept(grammarAccess.getBooleanBinaryExpressionAccess().getOperatorBooleanBinaryOperatorEnumRuleCall_3_0(), semanticObject.getOperator());
		feeder.accept(grammarAccess.getBooleanBinaryExpressionAccess().getOperand2BooleanVariableIDTerminalRuleCall_4_0_1(), semanticObject.getOperand2());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (assignee=[BooleanVariable|ID] operator=BooleanUnaryOperator operand=[BooleanVariable|ID])
	 */
	protected void sequence_BooleanUnaryExpression(EObject context, BooleanUnaryExpression semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ActivitydiagramPackage.Literals.BOOLEAN_EXPRESSION__ASSIGNEE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ActivitydiagramPackage.Literals.BOOLEAN_EXPRESSION__ASSIGNEE));
			if(transientValues.isValueTransient(semanticObject, ActivitydiagramPackage.Literals.BOOLEAN_UNARY_EXPRESSION__OPERAND) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ActivitydiagramPackage.Literals.BOOLEAN_UNARY_EXPRESSION__OPERAND));
			if(transientValues.isValueTransient(semanticObject, ActivitydiagramPackage.Literals.BOOLEAN_UNARY_EXPRESSION__OPERATOR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ActivitydiagramPackage.Literals.BOOLEAN_UNARY_EXPRESSION__OPERATOR));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getBooleanUnaryExpressionAccess().getAssigneeBooleanVariableIDTerminalRuleCall_0_0_1(), semanticObject.getAssignee());
		feeder.accept(grammarAccess.getBooleanUnaryExpressionAccess().getOperatorBooleanUnaryOperatorEnumRuleCall_2_0(), semanticObject.getOperator());
		feeder.accept(grammarAccess.getBooleanUnaryExpressionAccess().getOperandBooleanVariableIDTerminalRuleCall_3_0_1(), semanticObject.getOperand());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     value=EBoolean
	 */
	protected void sequence_BooleanValue(EObject context, BooleanValue semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ActivitydiagramPackage.Literals.BOOLEAN_VALUE__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ActivitydiagramPackage.Literals.BOOLEAN_VALUE__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getBooleanValueAccess().getValueEBooleanParserRuleCall_0(), semanticObject.isValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=EString initialValue=Value?)
	 */
	protected void sequence_BooleanVariable(EObject context, BooleanVariable semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=EString source=[ActivityNode|ID] target=[ActivityNode|ID] guard=[BooleanVariable|ID]?)
	 */
	protected void sequence_ControlFlow(EObject context, ControlFlow semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=EString incoming+=[ActivityEdge|ID] (outgoing+=[ActivityEdge|ID] outgoing+=[ActivityEdge|ID]*)?)
	 */
	protected void sequence_DecisionNode(EObject context, DecisionNode semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=EString incoming+=[ActivityEdge|ID] (outgoing+=[ActivityEdge|ID] outgoing+=[ActivityEdge|ID]*)?)
	 */
	protected void sequence_ForkNode(EObject context, ForkNode semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=EString outgoing+=[ActivityEdge|ID] outgoing+=[ActivityEdge|ID]*)
	 */
	protected void sequence_InitialNode(EObject context, InitialNode semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (assignee=[IntegerVariable|ID] operand1=[IntegerVariable|ID] operator=IntegerCalculationOperator operand2=[IntegerVariable|ID])
	 */
	protected void sequence_IntegerCalculationExpression(EObject context, IntegerCalculationExpression semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ActivitydiagramPackage.Literals.INTEGER_EXPRESSION__OPERAND2) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ActivitydiagramPackage.Literals.INTEGER_EXPRESSION__OPERAND2));
			if(transientValues.isValueTransient(semanticObject, ActivitydiagramPackage.Literals.INTEGER_EXPRESSION__OPERAND1) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ActivitydiagramPackage.Literals.INTEGER_EXPRESSION__OPERAND1));
			if(transientValues.isValueTransient(semanticObject, ActivitydiagramPackage.Literals.INTEGER_CALCULATION_EXPRESSION__ASSIGNEE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ActivitydiagramPackage.Literals.INTEGER_CALCULATION_EXPRESSION__ASSIGNEE));
			if(transientValues.isValueTransient(semanticObject, ActivitydiagramPackage.Literals.INTEGER_CALCULATION_EXPRESSION__OPERATOR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ActivitydiagramPackage.Literals.INTEGER_CALCULATION_EXPRESSION__OPERATOR));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getIntegerCalculationExpressionAccess().getAssigneeIntegerVariableIDTerminalRuleCall_0_0_1(), semanticObject.getAssignee());
		feeder.accept(grammarAccess.getIntegerCalculationExpressionAccess().getOperand1IntegerVariableIDTerminalRuleCall_2_0_1(), semanticObject.getOperand1());
		feeder.accept(grammarAccess.getIntegerCalculationExpressionAccess().getOperatorIntegerCalculationOperatorEnumRuleCall_3_0(), semanticObject.getOperator());
		feeder.accept(grammarAccess.getIntegerCalculationExpressionAccess().getOperand2IntegerVariableIDTerminalRuleCall_4_0_1(), semanticObject.getOperand2());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (assignee=[BooleanVariable|ID] operand1=[IntegerVariable|ID] operator=IntegerComparisonOperator operand2=[IntegerVariable|ID])
	 */
	protected void sequence_IntegerComparisonExpression(EObject context, IntegerComparisonExpression semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ActivitydiagramPackage.Literals.INTEGER_EXPRESSION__OPERAND2) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ActivitydiagramPackage.Literals.INTEGER_EXPRESSION__OPERAND2));
			if(transientValues.isValueTransient(semanticObject, ActivitydiagramPackage.Literals.INTEGER_EXPRESSION__OPERAND1) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ActivitydiagramPackage.Literals.INTEGER_EXPRESSION__OPERAND1));
			if(transientValues.isValueTransient(semanticObject, ActivitydiagramPackage.Literals.INTEGER_COMPARISON_EXPRESSION__ASSIGNEE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ActivitydiagramPackage.Literals.INTEGER_COMPARISON_EXPRESSION__ASSIGNEE));
			if(transientValues.isValueTransient(semanticObject, ActivitydiagramPackage.Literals.INTEGER_COMPARISON_EXPRESSION__OPERATOR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ActivitydiagramPackage.Literals.INTEGER_COMPARISON_EXPRESSION__OPERATOR));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getIntegerComparisonExpressionAccess().getAssigneeBooleanVariableIDTerminalRuleCall_0_0_1(), semanticObject.getAssignee());
		feeder.accept(grammarAccess.getIntegerComparisonExpressionAccess().getOperand1IntegerVariableIDTerminalRuleCall_2_0_1(), semanticObject.getOperand1());
		feeder.accept(grammarAccess.getIntegerComparisonExpressionAccess().getOperatorIntegerComparisonOperatorEnumRuleCall_3_0(), semanticObject.getOperator());
		feeder.accept(grammarAccess.getIntegerComparisonExpressionAccess().getOperand2IntegerVariableIDTerminalRuleCall_4_0_1(), semanticObject.getOperand2());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     value=EInt
	 */
	protected void sequence_IntegerValue(EObject context, IntegerValue semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ActivitydiagramPackage.Literals.INTEGER_VALUE__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ActivitydiagramPackage.Literals.INTEGER_VALUE__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getIntegerValueAccess().getValueEIntParserRuleCall_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=EString initialValue=Value?)
	 */
	protected void sequence_IntegerVariable(EObject context, IntegerVariable semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=EString (incoming+=[ActivityEdge|ID] incoming+=[ActivityEdge|ID]*)? outgoing+=[ActivityEdge|ID])
	 */
	protected void sequence_JoinNode(EObject context, JoinNode semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=EString (incoming+=[ActivityEdge|ID] incoming+=[ActivityEdge|ID]*)? outgoing+=[ActivityEdge|ID])
	 */
	protected void sequence_MergeNode(EObject context, MergeNode semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=EString 
	 *         (expressions+=Expression expressions+=Expression*)? 
	 *         (incoming+=[ActivityEdge|ID] incoming+=[ActivityEdge|ID]*)? 
	 *         (outgoing+=[ActivityEdge|ID] outgoing+=[ActivityEdge|ID]*)?
	 *     )
	 */
	protected void sequence_OpaqueAction(EObject context, OpaqueAction semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
