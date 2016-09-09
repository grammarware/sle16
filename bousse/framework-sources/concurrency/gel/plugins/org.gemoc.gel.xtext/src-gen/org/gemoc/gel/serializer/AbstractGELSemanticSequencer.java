package org.gemoc.gel.serializer;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import org.gemoc.gel.AtomicDomainSpecificEvent;
import org.gemoc.gel.CoincidencePattern;
import org.gemoc.gel.CompositeDomainSpecificEvent;
import org.gemoc.gel.DomainSpecificEventReference;
import org.gemoc.gel.DomainSpecificEventReferenceWithArguments;
import org.gemoc.gel.DomainSpecificEventsSpecification;
import org.gemoc.gel.EclEvent;
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
import org.gemoc.gel.LocalVariable;
import org.gemoc.gel.LogicalSequence;
import org.gemoc.gel.MultipleArguments;
import org.gemoc.gel.OrPattern;
import org.gemoc.gel.PlusPattern;
import org.gemoc.gel.SingleArgument;
import org.gemoc.gel.UnfoldingStrategy;
import org.gemoc.gel.XorPattern;
import org.gemoc.gel.services.GELGrammarAccess;
import org.gemoc.gexpressions.GAdditionExpression;
import org.gemoc.gexpressions.GAndExpression;
import org.gemoc.gexpressions.GBooleanExpression;
import org.gemoc.gexpressions.GBraceExpression;
import org.gemoc.gexpressions.GDoubleExpression;
import org.gemoc.gexpressions.GEnumLiteralExpression;
import org.gemoc.gexpressions.GEqualityExpression;
import org.gemoc.gexpressions.GIfExpression;
import org.gemoc.gexpressions.GImportStatement;
import org.gemoc.gexpressions.GIntegerExpression;
import org.gemoc.gexpressions.GMultiplicationExpression;
import org.gemoc.gexpressions.GNavigationExpression;
import org.gemoc.gexpressions.GNegationExpression;
import org.gemoc.gexpressions.GOrExpression;
import org.gemoc.gexpressions.GProgram;
import org.gemoc.gexpressions.GReferenceExpression;
import org.gemoc.gexpressions.GRelationExpression;
import org.gemoc.gexpressions.GStringExpression;
import org.gemoc.gexpressions.GXorExpression;
import org.gemoc.gexpressions.GexpressionsPackage;
import org.gemoc.gexpressions.xtext.serializer.GExpressionsSemanticSequencer;

import com.google.inject.Inject;

@SuppressWarnings("all")
public abstract class AbstractGELSemanticSequencer extends GExpressionsSemanticSequencer {

	@Inject
	private GELGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == GelPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case GelPackage.ATOMIC_DOMAIN_SPECIFIC_EVENT:
				if(context == grammarAccess.getAtomicDomainSpecificEventRule() ||
				   context == grammarAccess.getDomainSpecificEventRule()) {
					sequence_AtomicDomainSpecificEvent(context, (AtomicDomainSpecificEvent) semanticObject); 
					return; 
				}
				else break;
			case GelPackage.COINCIDENCE_PATTERN:
				if(context == grammarAccess.getCoincidencePatternRule() ||
				   context == grammarAccess.getCoincidencePatternAccess().getCoincidencePatternLeftOperandAction_1_0() ||
				   context == grammarAccess.getDomainSpecificEventReferenceOrPatternRule() ||
				   context == grammarAccess.getDomainSpecificEventsPatternRule() ||
				   context == grammarAccess.getIterationPatternRule() ||
				   context == grammarAccess.getIterationPatternAccess().getIterationPatternOperandAction_1_0() ||
				   context == grammarAccess.getLogicalSequenceRule() ||
				   context == grammarAccess.getLogicalSequenceAccess().getLogicalSequenceLeftOperandAction_1_0() ||
				   context == grammarAccess.getOrPatternRule() ||
				   context == grammarAccess.getOrPatternAccess().getOrPatternLeftOperandAction_1_0() ||
				   context == grammarAccess.getPlusPatternRule() ||
				   context == grammarAccess.getPlusPatternAccess().getPlusPatternOperandAction_1_0() ||
				   context == grammarAccess.getXorPatternRule() ||
				   context == grammarAccess.getXorPatternAccess().getXorPatternLeftOperandAction_1_0()) {
					sequence_CoincidencePattern(context, (CoincidencePattern) semanticObject); 
					return; 
				}
				else break;
			case GelPackage.COMPOSITE_DOMAIN_SPECIFIC_EVENT:
				if(context == grammarAccess.getCompositeDomainSpecificEventRule() ||
				   context == grammarAccess.getDomainSpecificEventRule()) {
					sequence_CompositeDomainSpecificEvent(context, (CompositeDomainSpecificEvent) semanticObject); 
					return; 
				}
				else break;
			case GelPackage.DOMAIN_SPECIFIC_EVENT_REFERENCE:
				if(context == grammarAccess.getCoincidencePatternRule() ||
				   context == grammarAccess.getCoincidencePatternAccess().getCoincidencePatternLeftOperandAction_1_0() ||
				   context == grammarAccess.getDomainSpecificEventReferenceRule() ||
				   context == grammarAccess.getDomainSpecificEventReferenceOrPatternRule() ||
				   context == grammarAccess.getDomainSpecificEventReferenceWithOrWithoutTargetRule() ||
				   context == grammarAccess.getDomainSpecificEventsPatternRule() ||
				   context == grammarAccess.getIterationPatternRule() ||
				   context == grammarAccess.getIterationPatternAccess().getIterationPatternOperandAction_1_0() ||
				   context == grammarAccess.getLogicalSequenceRule() ||
				   context == grammarAccess.getLogicalSequenceAccess().getLogicalSequenceLeftOperandAction_1_0() ||
				   context == grammarAccess.getOrPatternRule() ||
				   context == grammarAccess.getOrPatternAccess().getOrPatternLeftOperandAction_1_0() ||
				   context == grammarAccess.getPlusPatternRule() ||
				   context == grammarAccess.getPlusPatternAccess().getPlusPatternOperandAction_1_0() ||
				   context == grammarAccess.getXorPatternRule() ||
				   context == grammarAccess.getXorPatternAccess().getXorPatternLeftOperandAction_1_0()) {
					sequence_DomainSpecificEventReference(context, (DomainSpecificEventReference) semanticObject); 
					return; 
				}
				else break;
			case GelPackage.DOMAIN_SPECIFIC_EVENT_REFERENCE_WITH_ARGUMENTS:
				if(context == grammarAccess.getCoincidencePatternRule() ||
				   context == grammarAccess.getCoincidencePatternAccess().getCoincidencePatternLeftOperandAction_1_0() ||
				   context == grammarAccess.getDomainSpecificEventReferenceOrPatternRule() ||
				   context == grammarAccess.getDomainSpecificEventReferenceWithArgumentsRule() ||
				   context == grammarAccess.getDomainSpecificEventReferenceWithOrWithoutTargetRule() ||
				   context == grammarAccess.getDomainSpecificEventsPatternRule() ||
				   context == grammarAccess.getIterationPatternRule() ||
				   context == grammarAccess.getIterationPatternAccess().getIterationPatternOperandAction_1_0() ||
				   context == grammarAccess.getLogicalSequenceRule() ||
				   context == grammarAccess.getLogicalSequenceAccess().getLogicalSequenceLeftOperandAction_1_0() ||
				   context == grammarAccess.getOrPatternRule() ||
				   context == grammarAccess.getOrPatternAccess().getOrPatternLeftOperandAction_1_0() ||
				   context == grammarAccess.getPlusPatternRule() ||
				   context == grammarAccess.getPlusPatternAccess().getPlusPatternOperandAction_1_0() ||
				   context == grammarAccess.getXorPatternRule() ||
				   context == grammarAccess.getXorPatternAccess().getXorPatternLeftOperandAction_1_0()) {
					sequence_DomainSpecificEventReferenceWithArguments(context, (DomainSpecificEventReferenceWithArguments) semanticObject); 
					return; 
				}
				else break;
			case GelPackage.DOMAIN_SPECIFIC_EVENTS_SPECIFICATION:
				if(context == grammarAccess.getDomainSpecificEventsSpecificationRule()) {
					sequence_DomainSpecificEventsSpecification(context, (DomainSpecificEventsSpecification) semanticObject); 
					return; 
				}
				else break;
			case GelPackage.ECL_EVENT:
				if(context == grammarAccess.getEclEventRule() ||
				   context == grammarAccess.getMoccEventRule()) {
					sequence_EclEvent(context, (EclEvent) semanticObject); 
					return; 
				}
				else break;
			case GelPackage.EXECUTION_FUNCTION_RESULT:
				if(context == grammarAccess.getExecutionFunctionResultRule()) {
					sequence_ExecutionFunctionResult(context, (ExecutionFunctionResult) semanticObject); 
					return; 
				}
				else break;
			case GelPackage.FEEDBACK_CONSEQUENCE:
				if(context == grammarAccess.getFeedbackConsequenceRule()) {
					sequence_FeedbackConsequence(context, (FeedbackConsequence) semanticObject); 
					return; 
				}
				else break;
			case GelPackage.FEEDBACK_FILTER:
				if(context == grammarAccess.getFeedbackFilterRule()) {
					sequence_FeedbackFilter(context, (FeedbackFilter) semanticObject); 
					return; 
				}
				else break;
			case GelPackage.FEEDBACK_POLICY:
				if(context == grammarAccess.getFeedbackPolicyRule()) {
					sequence_FeedbackPolicy(context, (FeedbackPolicy) semanticObject); 
					return; 
				}
				else break;
			case GelPackage.FEEDBACK_RULE:
				if(context == grammarAccess.getDefaultFeedbackRuleRule()) {
					sequence_DefaultFeedbackRule(context, (FeedbackRule) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getFeedbackRuleRule()) {
					sequence_FeedbackRule(context, (FeedbackRule) semanticObject); 
					return; 
				}
				else break;
			case GelPackage.IMPORT_STATEMENT:
				if(context == grammarAccess.getImportStatementRule()) {
					sequence_ImportStatement(context, (ImportStatement) semanticObject); 
					return; 
				}
				else break;
			case GelPackage.INSTANTIATION_PREDICATE:
				if(context == grammarAccess.getInstantiationPredicateRule()) {
					sequence_InstantiationPredicate(context, (InstantiationPredicate) semanticObject); 
					return; 
				}
				else break;
			case GelPackage.ITERATION_PATTERN:
				if(context == grammarAccess.getCoincidencePatternRule() ||
				   context == grammarAccess.getCoincidencePatternAccess().getCoincidencePatternLeftOperandAction_1_0() ||
				   context == grammarAccess.getDomainSpecificEventReferenceOrPatternRule() ||
				   context == grammarAccess.getDomainSpecificEventsPatternRule() ||
				   context == grammarAccess.getIterationPatternRule() ||
				   context == grammarAccess.getIterationPatternAccess().getIterationPatternOperandAction_1_0() ||
				   context == grammarAccess.getLogicalSequenceRule() ||
				   context == grammarAccess.getLogicalSequenceAccess().getLogicalSequenceLeftOperandAction_1_0() ||
				   context == grammarAccess.getOrPatternRule() ||
				   context == grammarAccess.getOrPatternAccess().getOrPatternLeftOperandAction_1_0() ||
				   context == grammarAccess.getPlusPatternRule() ||
				   context == grammarAccess.getPlusPatternAccess().getPlusPatternOperandAction_1_0() ||
				   context == grammarAccess.getXorPatternRule() ||
				   context == grammarAccess.getXorPatternAccess().getXorPatternLeftOperandAction_1_0()) {
					sequence_IterationPattern(context, (IterationPattern) semanticObject); 
					return; 
				}
				else break;
			case GelPackage.KERMETA3_EXECUTION_FUNCTION:
				if(context == grammarAccess.getExecutionFunctionRule() ||
				   context == grammarAccess.getKermeta3ExecutionFunctionRule()) {
					sequence_Kermeta3ExecutionFunction(context, (Kermeta3ExecutionFunction) semanticObject); 
					return; 
				}
				else break;
			case GelPackage.LOCAL_VARIABLE:
				if(context == grammarAccess.getLocalVariableRule()) {
					sequence_LocalVariable(context, (LocalVariable) semanticObject); 
					return; 
				}
				else break;
			case GelPackage.LOGICAL_SEQUENCE:
				if(context == grammarAccess.getCoincidencePatternRule() ||
				   context == grammarAccess.getCoincidencePatternAccess().getCoincidencePatternLeftOperandAction_1_0() ||
				   context == grammarAccess.getDomainSpecificEventReferenceOrPatternRule() ||
				   context == grammarAccess.getDomainSpecificEventsPatternRule() ||
				   context == grammarAccess.getIterationPatternRule() ||
				   context == grammarAccess.getIterationPatternAccess().getIterationPatternOperandAction_1_0() ||
				   context == grammarAccess.getLogicalSequenceRule() ||
				   context == grammarAccess.getLogicalSequenceAccess().getLogicalSequenceLeftOperandAction_1_0() ||
				   context == grammarAccess.getOrPatternRule() ||
				   context == grammarAccess.getOrPatternAccess().getOrPatternLeftOperandAction_1_0() ||
				   context == grammarAccess.getPlusPatternRule() ||
				   context == grammarAccess.getPlusPatternAccess().getPlusPatternOperandAction_1_0() ||
				   context == grammarAccess.getXorPatternRule() ||
				   context == grammarAccess.getXorPatternAccess().getXorPatternLeftOperandAction_1_0()) {
					sequence_LogicalSequence(context, (LogicalSequence) semanticObject); 
					return; 
				}
				else break;
			case GelPackage.MULTIPLE_ARGUMENTS:
				if(context == grammarAccess.getListOfArgumentsRule() ||
				   context == grammarAccess.getMultipleArgumentsRule()) {
					sequence_MultipleArguments(context, (MultipleArguments) semanticObject); 
					return; 
				}
				else break;
			case GelPackage.OR_PATTERN:
				if(context == grammarAccess.getCoincidencePatternRule() ||
				   context == grammarAccess.getCoincidencePatternAccess().getCoincidencePatternLeftOperandAction_1_0() ||
				   context == grammarAccess.getDomainSpecificEventReferenceOrPatternRule() ||
				   context == grammarAccess.getDomainSpecificEventsPatternRule() ||
				   context == grammarAccess.getIterationPatternRule() ||
				   context == grammarAccess.getIterationPatternAccess().getIterationPatternOperandAction_1_0() ||
				   context == grammarAccess.getLogicalSequenceRule() ||
				   context == grammarAccess.getLogicalSequenceAccess().getLogicalSequenceLeftOperandAction_1_0() ||
				   context == grammarAccess.getOrPatternRule() ||
				   context == grammarAccess.getOrPatternAccess().getOrPatternLeftOperandAction_1_0() ||
				   context == grammarAccess.getPlusPatternRule() ||
				   context == grammarAccess.getPlusPatternAccess().getPlusPatternOperandAction_1_0() ||
				   context == grammarAccess.getXorPatternRule() ||
				   context == grammarAccess.getXorPatternAccess().getXorPatternLeftOperandAction_1_0()) {
					sequence_OrPattern(context, (OrPattern) semanticObject); 
					return; 
				}
				else break;
			case GelPackage.PLUS_PATTERN:
				if(context == grammarAccess.getCoincidencePatternRule() ||
				   context == grammarAccess.getCoincidencePatternAccess().getCoincidencePatternLeftOperandAction_1_0() ||
				   context == grammarAccess.getDomainSpecificEventReferenceOrPatternRule() ||
				   context == grammarAccess.getDomainSpecificEventsPatternRule() ||
				   context == grammarAccess.getIterationPatternRule() ||
				   context == grammarAccess.getIterationPatternAccess().getIterationPatternOperandAction_1_0() ||
				   context == grammarAccess.getLogicalSequenceRule() ||
				   context == grammarAccess.getLogicalSequenceAccess().getLogicalSequenceLeftOperandAction_1_0() ||
				   context == grammarAccess.getOrPatternRule() ||
				   context == grammarAccess.getOrPatternAccess().getOrPatternLeftOperandAction_1_0() ||
				   context == grammarAccess.getPlusPatternRule() ||
				   context == grammarAccess.getPlusPatternAccess().getPlusPatternOperandAction_1_0() ||
				   context == grammarAccess.getXorPatternRule() ||
				   context == grammarAccess.getXorPatternAccess().getXorPatternLeftOperandAction_1_0()) {
					sequence_PlusPattern(context, (PlusPattern) semanticObject); 
					return; 
				}
				else break;
			case GelPackage.SINGLE_ARGUMENT:
				if(context == grammarAccess.getListOfArgumentsRule() ||
				   context == grammarAccess.getSingleArgumentRule()) {
					sequence_SingleArgument(context, (SingleArgument) semanticObject); 
					return; 
				}
				else break;
			case GelPackage.UNFOLDING_STRATEGY:
				if(context == grammarAccess.getUnfoldingStrategyRule()) {
					sequence_UnfoldingStrategy(context, (UnfoldingStrategy) semanticObject); 
					return; 
				}
				else break;
			case GelPackage.XOR_PATTERN:
				if(context == grammarAccess.getCoincidencePatternRule() ||
				   context == grammarAccess.getCoincidencePatternAccess().getCoincidencePatternLeftOperandAction_1_0() ||
				   context == grammarAccess.getDomainSpecificEventReferenceOrPatternRule() ||
				   context == grammarAccess.getDomainSpecificEventsPatternRule() ||
				   context == grammarAccess.getIterationPatternRule() ||
				   context == grammarAccess.getIterationPatternAccess().getIterationPatternOperandAction_1_0() ||
				   context == grammarAccess.getLogicalSequenceRule() ||
				   context == grammarAccess.getLogicalSequenceAccess().getLogicalSequenceLeftOperandAction_1_0() ||
				   context == grammarAccess.getOrPatternRule() ||
				   context == grammarAccess.getOrPatternAccess().getOrPatternLeftOperandAction_1_0() ||
				   context == grammarAccess.getPlusPatternRule() ||
				   context == grammarAccess.getPlusPatternAccess().getPlusPatternOperandAction_1_0() ||
				   context == grammarAccess.getXorPatternRule() ||
				   context == grammarAccess.getXorPatternAccess().getXorPatternLeftOperandAction_1_0()) {
					sequence_XorPattern(context, (XorPattern) semanticObject); 
					return; 
				}
				else break;
			}
		else if(semanticObject.eClass().getEPackage() == GexpressionsPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case GexpressionsPackage.GADDITION_EXPRESSION:
				if(context == grammarAccess.getGAdditionExpressionRule() ||
				   context == grammarAccess.getGAdditionExpressionAccess().getGAdditionExpressionLeftOperandAction_1_0() ||
				   context == grammarAccess.getGAndExpressionRule() ||
				   context == grammarAccess.getGAndExpressionAccess().getGAndExpressionLeftOperandAction_1_0() ||
				   context == grammarAccess.getGEqualityExpressionRule() ||
				   context == grammarAccess.getGEqualityExpressionAccess().getGEqualityExpressionLeftOperandAction_1_0() ||
				   context == grammarAccess.getGExpressionRule() ||
				   context == grammarAccess.getGOrExpressionRule() ||
				   context == grammarAccess.getGOrExpressionAccess().getGOrExpressionLeftOperandAction_1_0() ||
				   context == grammarAccess.getGRelationExpressionRule() ||
				   context == grammarAccess.getGRelationExpressionAccess().getGRelationExpressionLeftOperandAction_1_0() ||
				   context == grammarAccess.getGXorExpressionRule() ||
				   context == grammarAccess.getGXorExpressionAccess().getGXorExpressionLeftOperandAction_1_0()) {
					sequence_GAdditionExpression(context, (GAdditionExpression) semanticObject); 
					return; 
				}
				else break;
			case GexpressionsPackage.GAND_EXPRESSION:
				if(context == grammarAccess.getGAndExpressionRule() ||
				   context == grammarAccess.getGAndExpressionAccess().getGAndExpressionLeftOperandAction_1_0() ||
				   context == grammarAccess.getGExpressionRule() ||
				   context == grammarAccess.getGOrExpressionRule() ||
				   context == grammarAccess.getGOrExpressionAccess().getGOrExpressionLeftOperandAction_1_0() ||
				   context == grammarAccess.getGXorExpressionRule() ||
				   context == grammarAccess.getGXorExpressionAccess().getGXorExpressionLeftOperandAction_1_0()) {
					sequence_GAndExpression(context, (GAndExpression) semanticObject); 
					return; 
				}
				else break;
			case GexpressionsPackage.GBOOLEAN_EXPRESSION:
				if(context == grammarAccess.getGAdditionExpressionRule() ||
				   context == grammarAccess.getGAdditionExpressionAccess().getGAdditionExpressionLeftOperandAction_1_0() ||
				   context == grammarAccess.getGAndExpressionRule() ||
				   context == grammarAccess.getGAndExpressionAccess().getGAndExpressionLeftOperandAction_1_0() ||
				   context == grammarAccess.getGBooleanExpressionRule() ||
				   context == grammarAccess.getGEqualityExpressionRule() ||
				   context == grammarAccess.getGEqualityExpressionAccess().getGEqualityExpressionLeftOperandAction_1_0() ||
				   context == grammarAccess.getGExpressionRule() ||
				   context == grammarAccess.getGMultiplicationExpressionRule() ||
				   context == grammarAccess.getGMultiplicationExpressionAccess().getGMultiplicationExpressionLeftOperandAction_1_0() ||
				   context == grammarAccess.getGNavigationExpressionRule() ||
				   context == grammarAccess.getGNavigationExpressionAccess().getGNavigationExpressionBodyAction_1_0() ||
				   context == grammarAccess.getGNegationExpressionRule() ||
				   context == grammarAccess.getGOrExpressionRule() ||
				   context == grammarAccess.getGOrExpressionAccess().getGOrExpressionLeftOperandAction_1_0() ||
				   context == grammarAccess.getGPrimaryExpressionRule() ||
				   context == grammarAccess.getGReferenceExpressionRule() ||
				   context == grammarAccess.getGRelationExpressionRule() ||
				   context == grammarAccess.getGRelationExpressionAccess().getGRelationExpressionLeftOperandAction_1_0() ||
				   context == grammarAccess.getGXorExpressionRule() ||
				   context == grammarAccess.getGXorExpressionAccess().getGXorExpressionLeftOperandAction_1_0()) {
					sequence_GBooleanExpression(context, (GBooleanExpression) semanticObject); 
					return; 
				}
				else break;
			case GexpressionsPackage.GBRACE_EXPRESSION:
				if(context == grammarAccess.getGAdditionExpressionRule() ||
				   context == grammarAccess.getGAdditionExpressionAccess().getGAdditionExpressionLeftOperandAction_1_0() ||
				   context == grammarAccess.getGAndExpressionRule() ||
				   context == grammarAccess.getGAndExpressionAccess().getGAndExpressionLeftOperandAction_1_0() ||
				   context == grammarAccess.getGBraceExpressionRule() ||
				   context == grammarAccess.getGEqualityExpressionRule() ||
				   context == grammarAccess.getGEqualityExpressionAccess().getGEqualityExpressionLeftOperandAction_1_0() ||
				   context == grammarAccess.getGExpressionRule() ||
				   context == grammarAccess.getGMultiplicationExpressionRule() ||
				   context == grammarAccess.getGMultiplicationExpressionAccess().getGMultiplicationExpressionLeftOperandAction_1_0() ||
				   context == grammarAccess.getGNavigationExpressionRule() ||
				   context == grammarAccess.getGNavigationExpressionAccess().getGNavigationExpressionBodyAction_1_0() ||
				   context == grammarAccess.getGNegationExpressionRule() ||
				   context == grammarAccess.getGOrExpressionRule() ||
				   context == grammarAccess.getGOrExpressionAccess().getGOrExpressionLeftOperandAction_1_0() ||
				   context == grammarAccess.getGPrimaryExpressionRule() ||
				   context == grammarAccess.getGReferenceExpressionRule() ||
				   context == grammarAccess.getGRelationExpressionRule() ||
				   context == grammarAccess.getGRelationExpressionAccess().getGRelationExpressionLeftOperandAction_1_0() ||
				   context == grammarAccess.getGXorExpressionRule() ||
				   context == grammarAccess.getGXorExpressionAccess().getGXorExpressionLeftOperandAction_1_0()) {
					sequence_GBraceExpression(context, (GBraceExpression) semanticObject); 
					return; 
				}
				else break;
			case GexpressionsPackage.GDOUBLE_EXPRESSION:
				if(context == grammarAccess.getGAdditionExpressionRule() ||
				   context == grammarAccess.getGAdditionExpressionAccess().getGAdditionExpressionLeftOperandAction_1_0() ||
				   context == grammarAccess.getGAndExpressionRule() ||
				   context == grammarAccess.getGAndExpressionAccess().getGAndExpressionLeftOperandAction_1_0() ||
				   context == grammarAccess.getGDoubleExpressionRule() ||
				   context == grammarAccess.getGEqualityExpressionRule() ||
				   context == grammarAccess.getGEqualityExpressionAccess().getGEqualityExpressionLeftOperandAction_1_0() ||
				   context == grammarAccess.getGExpressionRule() ||
				   context == grammarAccess.getGMultiplicationExpressionRule() ||
				   context == grammarAccess.getGMultiplicationExpressionAccess().getGMultiplicationExpressionLeftOperandAction_1_0() ||
				   context == grammarAccess.getGNavigationExpressionRule() ||
				   context == grammarAccess.getGNavigationExpressionAccess().getGNavigationExpressionBodyAction_1_0() ||
				   context == grammarAccess.getGNegationExpressionRule() ||
				   context == grammarAccess.getGNumericExpressionRule() ||
				   context == grammarAccess.getGOrExpressionRule() ||
				   context == grammarAccess.getGOrExpressionAccess().getGOrExpressionLeftOperandAction_1_0() ||
				   context == grammarAccess.getGPrimaryExpressionRule() ||
				   context == grammarAccess.getGReferenceExpressionRule() ||
				   context == grammarAccess.getGRelationExpressionRule() ||
				   context == grammarAccess.getGRelationExpressionAccess().getGRelationExpressionLeftOperandAction_1_0() ||
				   context == grammarAccess.getGXorExpressionRule() ||
				   context == grammarAccess.getGXorExpressionAccess().getGXorExpressionLeftOperandAction_1_0()) {
					sequence_GDoubleExpression(context, (GDoubleExpression) semanticObject); 
					return; 
				}
				else break;
			case GexpressionsPackage.GENUM_LITERAL_EXPRESSION:
				if(context == grammarAccess.getGAdditionExpressionRule() ||
				   context == grammarAccess.getGAdditionExpressionAccess().getGAdditionExpressionLeftOperandAction_1_0() ||
				   context == grammarAccess.getGAndExpressionRule() ||
				   context == grammarAccess.getGAndExpressionAccess().getGAndExpressionLeftOperandAction_1_0() ||
				   context == grammarAccess.getGEnumLiteralExpressionRule() ||
				   context == grammarAccess.getGEqualityExpressionRule() ||
				   context == grammarAccess.getGEqualityExpressionAccess().getGEqualityExpressionLeftOperandAction_1_0() ||
				   context == grammarAccess.getGExpressionRule() ||
				   context == grammarAccess.getGMultiplicationExpressionRule() ||
				   context == grammarAccess.getGMultiplicationExpressionAccess().getGMultiplicationExpressionLeftOperandAction_1_0() ||
				   context == grammarAccess.getGNavigationExpressionRule() ||
				   context == grammarAccess.getGNavigationExpressionAccess().getGNavigationExpressionBodyAction_1_0() ||
				   context == grammarAccess.getGNegationExpressionRule() ||
				   context == grammarAccess.getGOrExpressionRule() ||
				   context == grammarAccess.getGOrExpressionAccess().getGOrExpressionLeftOperandAction_1_0() ||
				   context == grammarAccess.getGPrimaryExpressionRule() ||
				   context == grammarAccess.getGReferenceExpressionRule() ||
				   context == grammarAccess.getGRelationExpressionRule() ||
				   context == grammarAccess.getGRelationExpressionAccess().getGRelationExpressionLeftOperandAction_1_0() ||
				   context == grammarAccess.getGXorExpressionRule() ||
				   context == grammarAccess.getGXorExpressionAccess().getGXorExpressionLeftOperandAction_1_0()) {
					sequence_GEnumLiteralExpression(context, (GEnumLiteralExpression) semanticObject); 
					return; 
				}
				else break;
			case GexpressionsPackage.GEQUALITY_EXPRESSION:
				if(context == grammarAccess.getGAndExpressionRule() ||
				   context == grammarAccess.getGAndExpressionAccess().getGAndExpressionLeftOperandAction_1_0() ||
				   context == grammarAccess.getGEqualityExpressionRule() ||
				   context == grammarAccess.getGEqualityExpressionAccess().getGEqualityExpressionLeftOperandAction_1_0() ||
				   context == grammarAccess.getGExpressionRule() ||
				   context == grammarAccess.getGOrExpressionRule() ||
				   context == grammarAccess.getGOrExpressionAccess().getGOrExpressionLeftOperandAction_1_0() ||
				   context == grammarAccess.getGXorExpressionRule() ||
				   context == grammarAccess.getGXorExpressionAccess().getGXorExpressionLeftOperandAction_1_0()) {
					sequence_GEqualityExpression(context, (GEqualityExpression) semanticObject); 
					return; 
				}
				else break;
			case GexpressionsPackage.GIF_EXPRESSION:
				if(context == grammarAccess.getGAdditionExpressionRule() ||
				   context == grammarAccess.getGAdditionExpressionAccess().getGAdditionExpressionLeftOperandAction_1_0() ||
				   context == grammarAccess.getGAndExpressionRule() ||
				   context == grammarAccess.getGAndExpressionAccess().getGAndExpressionLeftOperandAction_1_0() ||
				   context == grammarAccess.getGEqualityExpressionRule() ||
				   context == grammarAccess.getGEqualityExpressionAccess().getGEqualityExpressionLeftOperandAction_1_0() ||
				   context == grammarAccess.getGExpressionRule() ||
				   context == grammarAccess.getGIfExpressionRule() ||
				   context == grammarAccess.getGMultiplicationExpressionRule() ||
				   context == grammarAccess.getGMultiplicationExpressionAccess().getGMultiplicationExpressionLeftOperandAction_1_0() ||
				   context == grammarAccess.getGNavigationExpressionRule() ||
				   context == grammarAccess.getGNavigationExpressionAccess().getGNavigationExpressionBodyAction_1_0() ||
				   context == grammarAccess.getGNegationExpressionRule() ||
				   context == grammarAccess.getGOrExpressionRule() ||
				   context == grammarAccess.getGOrExpressionAccess().getGOrExpressionLeftOperandAction_1_0() ||
				   context == grammarAccess.getGPrimaryExpressionRule() ||
				   context == grammarAccess.getGReferenceExpressionRule() ||
				   context == grammarAccess.getGRelationExpressionRule() ||
				   context == grammarAccess.getGRelationExpressionAccess().getGRelationExpressionLeftOperandAction_1_0() ||
				   context == grammarAccess.getGXorExpressionRule() ||
				   context == grammarAccess.getGXorExpressionAccess().getGXorExpressionLeftOperandAction_1_0()) {
					sequence_GIfExpression(context, (GIfExpression) semanticObject); 
					return; 
				}
				else break;
			case GexpressionsPackage.GIMPORT_STATEMENT:
				if(context == grammarAccess.getGImportStatementRule()) {
					sequence_GImportStatement(context, (GImportStatement) semanticObject); 
					return; 
				}
				else break;
			case GexpressionsPackage.GINTEGER_EXPRESSION:
				if(context == grammarAccess.getGAdditionExpressionRule() ||
				   context == grammarAccess.getGAdditionExpressionAccess().getGAdditionExpressionLeftOperandAction_1_0() ||
				   context == grammarAccess.getGAndExpressionRule() ||
				   context == grammarAccess.getGAndExpressionAccess().getGAndExpressionLeftOperandAction_1_0() ||
				   context == grammarAccess.getGEqualityExpressionRule() ||
				   context == grammarAccess.getGEqualityExpressionAccess().getGEqualityExpressionLeftOperandAction_1_0() ||
				   context == grammarAccess.getGExpressionRule() ||
				   context == grammarAccess.getGIntegerExpressionRule() ||
				   context == grammarAccess.getGMultiplicationExpressionRule() ||
				   context == grammarAccess.getGMultiplicationExpressionAccess().getGMultiplicationExpressionLeftOperandAction_1_0() ||
				   context == grammarAccess.getGNavigationExpressionRule() ||
				   context == grammarAccess.getGNavigationExpressionAccess().getGNavigationExpressionBodyAction_1_0() ||
				   context == grammarAccess.getGNegationExpressionRule() ||
				   context == grammarAccess.getGNumericExpressionRule() ||
				   context == grammarAccess.getGOrExpressionRule() ||
				   context == grammarAccess.getGOrExpressionAccess().getGOrExpressionLeftOperandAction_1_0() ||
				   context == grammarAccess.getGPrimaryExpressionRule() ||
				   context == grammarAccess.getGReferenceExpressionRule() ||
				   context == grammarAccess.getGRelationExpressionRule() ||
				   context == grammarAccess.getGRelationExpressionAccess().getGRelationExpressionLeftOperandAction_1_0() ||
				   context == grammarAccess.getGXorExpressionRule() ||
				   context == grammarAccess.getGXorExpressionAccess().getGXorExpressionLeftOperandAction_1_0()) {
					sequence_GIntegerExpression(context, (GIntegerExpression) semanticObject); 
					return; 
				}
				else break;
			case GexpressionsPackage.GMULTIPLICATION_EXPRESSION:
				if(context == grammarAccess.getGAdditionExpressionRule() ||
				   context == grammarAccess.getGAdditionExpressionAccess().getGAdditionExpressionLeftOperandAction_1_0() ||
				   context == grammarAccess.getGAndExpressionRule() ||
				   context == grammarAccess.getGAndExpressionAccess().getGAndExpressionLeftOperandAction_1_0() ||
				   context == grammarAccess.getGEqualityExpressionRule() ||
				   context == grammarAccess.getGEqualityExpressionAccess().getGEqualityExpressionLeftOperandAction_1_0() ||
				   context == grammarAccess.getGExpressionRule() ||
				   context == grammarAccess.getGMultiplicationExpressionRule() ||
				   context == grammarAccess.getGMultiplicationExpressionAccess().getGMultiplicationExpressionLeftOperandAction_1_0() ||
				   context == grammarAccess.getGOrExpressionRule() ||
				   context == grammarAccess.getGOrExpressionAccess().getGOrExpressionLeftOperandAction_1_0() ||
				   context == grammarAccess.getGRelationExpressionRule() ||
				   context == grammarAccess.getGRelationExpressionAccess().getGRelationExpressionLeftOperandAction_1_0() ||
				   context == grammarAccess.getGXorExpressionRule() ||
				   context == grammarAccess.getGXorExpressionAccess().getGXorExpressionLeftOperandAction_1_0()) {
					sequence_GMultiplicationExpression(context, (GMultiplicationExpression) semanticObject); 
					return; 
				}
				else break;
			case GexpressionsPackage.GNAVIGATION_EXPRESSION:
				if(context == grammarAccess.getGAdditionExpressionRule() ||
				   context == grammarAccess.getGAdditionExpressionAccess().getGAdditionExpressionLeftOperandAction_1_0() ||
				   context == grammarAccess.getGAndExpressionRule() ||
				   context == grammarAccess.getGAndExpressionAccess().getGAndExpressionLeftOperandAction_1_0() ||
				   context == grammarAccess.getGEqualityExpressionRule() ||
				   context == grammarAccess.getGEqualityExpressionAccess().getGEqualityExpressionLeftOperandAction_1_0() ||
				   context == grammarAccess.getGExpressionRule() ||
				   context == grammarAccess.getGMultiplicationExpressionRule() ||
				   context == grammarAccess.getGMultiplicationExpressionAccess().getGMultiplicationExpressionLeftOperandAction_1_0() ||
				   context == grammarAccess.getGNavigationExpressionRule() ||
				   context == grammarAccess.getGNavigationExpressionAccess().getGNavigationExpressionBodyAction_1_0() ||
				   context == grammarAccess.getGNegationExpressionRule() ||
				   context == grammarAccess.getGOrExpressionRule() ||
				   context == grammarAccess.getGOrExpressionAccess().getGOrExpressionLeftOperandAction_1_0() ||
				   context == grammarAccess.getGRelationExpressionRule() ||
				   context == grammarAccess.getGRelationExpressionAccess().getGRelationExpressionLeftOperandAction_1_0() ||
				   context == grammarAccess.getGXorExpressionRule() ||
				   context == grammarAccess.getGXorExpressionAccess().getGXorExpressionLeftOperandAction_1_0()) {
					sequence_GNavigationExpression(context, (GNavigationExpression) semanticObject); 
					return; 
				}
				else break;
			case GexpressionsPackage.GNEGATION_EXPRESSION:
				if(context == grammarAccess.getGAdditionExpressionRule() ||
				   context == grammarAccess.getGAdditionExpressionAccess().getGAdditionExpressionLeftOperandAction_1_0() ||
				   context == grammarAccess.getGAndExpressionRule() ||
				   context == grammarAccess.getGAndExpressionAccess().getGAndExpressionLeftOperandAction_1_0() ||
				   context == grammarAccess.getGEqualityExpressionRule() ||
				   context == grammarAccess.getGEqualityExpressionAccess().getGEqualityExpressionLeftOperandAction_1_0() ||
				   context == grammarAccess.getGExpressionRule() ||
				   context == grammarAccess.getGMultiplicationExpressionRule() ||
				   context == grammarAccess.getGMultiplicationExpressionAccess().getGMultiplicationExpressionLeftOperandAction_1_0() ||
				   context == grammarAccess.getGNegationExpressionRule() ||
				   context == grammarAccess.getGOrExpressionRule() ||
				   context == grammarAccess.getGOrExpressionAccess().getGOrExpressionLeftOperandAction_1_0() ||
				   context == grammarAccess.getGRelationExpressionRule() ||
				   context == grammarAccess.getGRelationExpressionAccess().getGRelationExpressionLeftOperandAction_1_0() ||
				   context == grammarAccess.getGXorExpressionRule() ||
				   context == grammarAccess.getGXorExpressionAccess().getGXorExpressionLeftOperandAction_1_0()) {
					sequence_GNegationExpression(context, (GNegationExpression) semanticObject); 
					return; 
				}
				else break;
			case GexpressionsPackage.GOR_EXPRESSION:
				if(context == grammarAccess.getGExpressionRule() ||
				   context == grammarAccess.getGOrExpressionRule() ||
				   context == grammarAccess.getGOrExpressionAccess().getGOrExpressionLeftOperandAction_1_0()) {
					sequence_GOrExpression(context, (GOrExpression) semanticObject); 
					return; 
				}
				else break;
			case GexpressionsPackage.GPROGRAM:
				if(context == grammarAccess.getGProgramRule()) {
					sequence_GProgram(context, (GProgram) semanticObject); 
					return; 
				}
				else break;
			case GexpressionsPackage.GREFERENCE_EXPRESSION:
				if(context == grammarAccess.getGAdditionExpressionRule() ||
				   context == grammarAccess.getGAdditionExpressionAccess().getGAdditionExpressionLeftOperandAction_1_0() ||
				   context == grammarAccess.getGAndExpressionRule() ||
				   context == grammarAccess.getGAndExpressionAccess().getGAndExpressionLeftOperandAction_1_0() ||
				   context == grammarAccess.getGEqualityExpressionRule() ||
				   context == grammarAccess.getGEqualityExpressionAccess().getGEqualityExpressionLeftOperandAction_1_0() ||
				   context == grammarAccess.getGExpressionRule() ||
				   context == grammarAccess.getGMultiplicationExpressionRule() ||
				   context == grammarAccess.getGMultiplicationExpressionAccess().getGMultiplicationExpressionLeftOperandAction_1_0() ||
				   context == grammarAccess.getGNavigationExpressionRule() ||
				   context == grammarAccess.getGNavigationExpressionAccess().getGNavigationExpressionBodyAction_1_0() ||
				   context == grammarAccess.getGNegationExpressionRule() ||
				   context == grammarAccess.getGOrExpressionRule() ||
				   context == grammarAccess.getGOrExpressionAccess().getGOrExpressionLeftOperandAction_1_0() ||
				   context == grammarAccess.getGReferenceExpressionRule() ||
				   context == grammarAccess.getGRelationExpressionRule() ||
				   context == grammarAccess.getGRelationExpressionAccess().getGRelationExpressionLeftOperandAction_1_0() ||
				   context == grammarAccess.getGXorExpressionRule() ||
				   context == grammarAccess.getGXorExpressionAccess().getGXorExpressionLeftOperandAction_1_0()) {
					sequence_GReferenceExpression(context, (GReferenceExpression) semanticObject); 
					return; 
				}
				else break;
			case GexpressionsPackage.GRELATION_EXPRESSION:
				if(context == grammarAccess.getGAndExpressionRule() ||
				   context == grammarAccess.getGAndExpressionAccess().getGAndExpressionLeftOperandAction_1_0() ||
				   context == grammarAccess.getGEqualityExpressionRule() ||
				   context == grammarAccess.getGEqualityExpressionAccess().getGEqualityExpressionLeftOperandAction_1_0() ||
				   context == grammarAccess.getGExpressionRule() ||
				   context == grammarAccess.getGOrExpressionRule() ||
				   context == grammarAccess.getGOrExpressionAccess().getGOrExpressionLeftOperandAction_1_0() ||
				   context == grammarAccess.getGRelationExpressionRule() ||
				   context == grammarAccess.getGRelationExpressionAccess().getGRelationExpressionLeftOperandAction_1_0() ||
				   context == grammarAccess.getGXorExpressionRule() ||
				   context == grammarAccess.getGXorExpressionAccess().getGXorExpressionLeftOperandAction_1_0()) {
					sequence_GRelationExpression(context, (GRelationExpression) semanticObject); 
					return; 
				}
				else break;
			case GexpressionsPackage.GSTRING_EXPRESSION:
				if(context == grammarAccess.getGAdditionExpressionRule() ||
				   context == grammarAccess.getGAdditionExpressionAccess().getGAdditionExpressionLeftOperandAction_1_0() ||
				   context == grammarAccess.getGAndExpressionRule() ||
				   context == grammarAccess.getGAndExpressionAccess().getGAndExpressionLeftOperandAction_1_0() ||
				   context == grammarAccess.getGEqualityExpressionRule() ||
				   context == grammarAccess.getGEqualityExpressionAccess().getGEqualityExpressionLeftOperandAction_1_0() ||
				   context == grammarAccess.getGExpressionRule() ||
				   context == grammarAccess.getGMultiplicationExpressionRule() ||
				   context == grammarAccess.getGMultiplicationExpressionAccess().getGMultiplicationExpressionLeftOperandAction_1_0() ||
				   context == grammarAccess.getGNavigationExpressionRule() ||
				   context == grammarAccess.getGNavigationExpressionAccess().getGNavigationExpressionBodyAction_1_0() ||
				   context == grammarAccess.getGNegationExpressionRule() ||
				   context == grammarAccess.getGOrExpressionRule() ||
				   context == grammarAccess.getGOrExpressionAccess().getGOrExpressionLeftOperandAction_1_0() ||
				   context == grammarAccess.getGPrimaryExpressionRule() ||
				   context == grammarAccess.getGReferenceExpressionRule() ||
				   context == grammarAccess.getGRelationExpressionRule() ||
				   context == grammarAccess.getGRelationExpressionAccess().getGRelationExpressionLeftOperandAction_1_0() ||
				   context == grammarAccess.getGStringExpressionRule() ||
				   context == grammarAccess.getGXorExpressionRule() ||
				   context == grammarAccess.getGXorExpressionAccess().getGXorExpressionLeftOperandAction_1_0()) {
					sequence_GStringExpression(context, (GStringExpression) semanticObject); 
					return; 
				}
				else break;
			case GexpressionsPackage.GXOR_EXPRESSION:
				if(context == grammarAccess.getGExpressionRule() ||
				   context == grammarAccess.getGOrExpressionRule() ||
				   context == grammarAccess.getGOrExpressionAccess().getGOrExpressionLeftOperandAction_1_0() ||
				   context == grammarAccess.getGXorExpressionRule() ||
				   context == grammarAccess.getGXorExpressionAccess().getGXorExpressionLeftOperandAction_1_0()) {
					sequence_GXorExpression(context, (GXorExpression) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (
	 *         visibility=Visibility? 
	 *         name=ID 
	 *         uponMoccEvent=MoccEvent 
	 *         (executionKind=ExecutionKind executionFunction=ExecutionFunction feedbackPolicy=FeedbackPolicy?)? 
	 *         raisedMoccEvent=MoccEvent?
	 *     )
	 */
	protected void sequence_AtomicDomainSpecificEvent(EObject context, AtomicDomainSpecificEvent semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (leftOperand=CoincidencePattern_CoincidencePattern_1_0 rightOperand=OrPattern)
	 */
	protected void sequence_CoincidencePattern(EObject context, CoincidencePattern semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, GelPackage.Literals.BINARY_PATTERN__LEFT_OPERAND) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GelPackage.Literals.BINARY_PATTERN__LEFT_OPERAND));
			if(transientValues.isValueTransient(semanticObject, GelPackage.Literals.BINARY_PATTERN__RIGHT_OPERAND) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GelPackage.Literals.BINARY_PATTERN__RIGHT_OPERAND));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getCoincidencePatternAccess().getCoincidencePatternLeftOperandAction_1_0(), semanticObject.getLeftOperand());
		feeder.accept(grammarAccess.getCoincidencePatternAccess().getRightOperandOrPatternParserRuleCall_1_2_0(), semanticObject.getRightOperand());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (visibility=Visibility? name=ID unfoldingStrategy=UnfoldingStrategy? body=DomainSpecificEventsPattern)
	 */
	protected void sequence_CompositeDomainSpecificEvent(EObject context, CompositeDomainSpecificEvent semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     consequence=FeedbackConsequence
	 */
	protected void sequence_DefaultFeedbackRule(EObject context, FeedbackRule semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (referencedDse=[DomainSpecificEvent|ID] arguments=ListOfArguments)
	 */
	protected void sequence_DomainSpecificEventReferenceWithArguments(EObject context, DomainSpecificEventReferenceWithArguments semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, GelPackage.Literals.DOMAIN_SPECIFIC_EVENT_REFERENCE__REFERENCED_DSE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GelPackage.Literals.DOMAIN_SPECIFIC_EVENT_REFERENCE__REFERENCED_DSE));
			if(transientValues.isValueTransient(semanticObject, GelPackage.Literals.DOMAIN_SPECIFIC_EVENT_REFERENCE_WITH_ARGUMENTS__ARGUMENTS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GelPackage.Literals.DOMAIN_SPECIFIC_EVENT_REFERENCE_WITH_ARGUMENTS__ARGUMENTS));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getDomainSpecificEventReferenceWithArgumentsAccess().getReferencedDseDomainSpecificEventIDTerminalRuleCall_1_0_1(), semanticObject.getReferencedDse());
		feeder.accept(grammarAccess.getDomainSpecificEventReferenceWithArgumentsAccess().getArgumentsListOfArgumentsParserRuleCall_3_0(), semanticObject.getArguments());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     referencedDse=[DomainSpecificEvent|ID]
	 */
	protected void sequence_DomainSpecificEventReference(EObject context, DomainSpecificEventReference semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, GelPackage.Literals.DOMAIN_SPECIFIC_EVENT_REFERENCE__REFERENCED_DSE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GelPackage.Literals.DOMAIN_SPECIFIC_EVENT_REFERENCE__REFERENCED_DSE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getDomainSpecificEventReferenceAccess().getReferencedDseDomainSpecificEventIDTerminalRuleCall_1_0_1(), semanticObject.getReferencedDse());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (imports+=ImportStatement* events+=DomainSpecificEvent*)
	 */
	protected void sequence_DomainSpecificEventsSpecification(EObject context, DomainSpecificEventsSpecification semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     eventReference=[ECLDefCS|QualifiedName]
	 */
	protected void sequence_EclEvent(EObject context, EclEvent semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, GelPackage.Literals.ECL_EVENT__EVENT_REFERENCE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GelPackage.Literals.ECL_EVENT__EVENT_REFERENCE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getEclEventAccess().getEventReferenceECLDefCSQualifiedNameParserRuleCall_1_0_1(), semanticObject.getEventReference());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_ExecutionFunctionResult(EObject context, ExecutionFunctionResult semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, GelPackage.Literals.EXECUTION_FUNCTION_RESULT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GelPackage.Literals.EXECUTION_FUNCTION_RESULT__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getExecutionFunctionResultAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     navigationPathToMoccEvent=GExpression
	 */
	protected void sequence_FeedbackConsequence(EObject context, FeedbackConsequence semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, GelPackage.Literals.FEEDBACK_CONSEQUENCE__NAVIGATION_PATH_TO_MOCC_EVENT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GelPackage.Literals.FEEDBACK_CONSEQUENCE__NAVIGATION_PATH_TO_MOCC_EVENT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getFeedbackConsequenceAccess().getNavigationPathToMoccEventGExpressionParserRuleCall_2_0(), semanticObject.getNavigationPathToMoccEvent());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     body=GExpression
	 */
	protected void sequence_FeedbackFilter(EObject context, FeedbackFilter semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, GelPackage.Literals.FEEDBACK_FILTER__BODY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GelPackage.Literals.FEEDBACK_FILTER__BODY));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getFeedbackFilterAccess().getBodyGExpressionParserRuleCall_1_0(), semanticObject.getBody());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (rules+=FeedbackRule* defaultRule=DefaultFeedbackRule)
	 */
	protected void sequence_FeedbackPolicy(EObject context, FeedbackPolicy semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (filter=FeedbackFilter consequence=FeedbackConsequence)
	 */
	protected void sequence_FeedbackRule(EObject context, FeedbackRule semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, GelPackage.Literals.FEEDBACK_RULE__FILTER) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GelPackage.Literals.FEEDBACK_RULE__FILTER));
			if(transientValues.isValueTransient(semanticObject, GelPackage.Literals.FEEDBACK_RULE__CONSEQUENCE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GelPackage.Literals.FEEDBACK_RULE__CONSEQUENCE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getFeedbackRuleAccess().getFilterFeedbackFilterParserRuleCall_2_0(), semanticObject.getFilter());
		feeder.accept(grammarAccess.getFeedbackRuleAccess().getConsequenceFeedbackConsequenceParserRuleCall_5_0(), semanticObject.getConsequence());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     importURI=STRING
	 */
	protected void sequence_ImportStatement(EObject context, ImportStatement semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, GelPackage.Literals.IMPORT_STATEMENT__IMPORT_URI) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GelPackage.Literals.IMPORT_STATEMENT__IMPORT_URI));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getImportStatementAccess().getImportURISTRINGTerminalRuleCall_1_0(), semanticObject.getImportURI());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     body=GExpression
	 */
	protected void sequence_InstantiationPredicate(EObject context, InstantiationPredicate semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, GelPackage.Literals.INSTANTIATION_PREDICATE__BODY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GelPackage.Literals.INSTANTIATION_PREDICATE__BODY));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getInstantiationPredicateAccess().getBodyGExpressionParserRuleCall_1_0(), semanticObject.getBody());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (operand=IterationPattern_IterationPattern_1_0 numberOfIterations=INT)
	 */
	protected void sequence_IterationPattern(EObject context, IterationPattern semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, GelPackage.Literals.UNARY_PATTERN__OPERAND) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GelPackage.Literals.UNARY_PATTERN__OPERAND));
			if(transientValues.isValueTransient(semanticObject, GelPackage.Literals.ITERATION_PATTERN__NUMBER_OF_ITERATIONS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GelPackage.Literals.ITERATION_PATTERN__NUMBER_OF_ITERATIONS));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getIterationPatternAccess().getIterationPatternOperandAction_1_0(), semanticObject.getOperand());
		feeder.accept(grammarAccess.getIterationPatternAccess().getNumberOfIterationsINTTerminalRuleCall_1_2_0(), semanticObject.getNumberOfIterations());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (navigationPathToOperation=GExpression callKind=CallKind? result=ExecutionFunctionResult?)
	 */
	protected void sequence_Kermeta3ExecutionFunction(EObject context, Kermeta3ExecutionFunction semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID type=[EClassifier|QualifiedName])
	 */
	protected void sequence_LocalVariable(EObject context, LocalVariable semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, GelPackage.Literals.LOCAL_VARIABLE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GelPackage.Literals.LOCAL_VARIABLE__NAME));
			if(transientValues.isValueTransient(semanticObject, GelPackage.Literals.LOCAL_VARIABLE__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GelPackage.Literals.LOCAL_VARIABLE__TYPE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getLocalVariableAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getLocalVariableAccess().getTypeEClassifierQualifiedNameParserRuleCall_3_0_1(), semanticObject.getType());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (leftOperand=LogicalSequence_LogicalSequence_1_0 rightOperand=CoincidencePattern)
	 */
	protected void sequence_LogicalSequence(EObject context, LogicalSequence semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, GelPackage.Literals.BINARY_PATTERN__LEFT_OPERAND) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GelPackage.Literals.BINARY_PATTERN__LEFT_OPERAND));
			if(transientValues.isValueTransient(semanticObject, GelPackage.Literals.BINARY_PATTERN__RIGHT_OPERAND) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GelPackage.Literals.BINARY_PATTERN__RIGHT_OPERAND));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getLogicalSequenceAccess().getLogicalSequenceLeftOperandAction_1_0(), semanticObject.getLeftOperand());
		feeder.accept(grammarAccess.getLogicalSequenceAccess().getRightOperandCoincidencePatternParserRuleCall_1_2_0(), semanticObject.getRightOperand());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (head=[LocalVariable|ID] tail=ListOfArguments)
	 */
	protected void sequence_MultipleArguments(EObject context, MultipleArguments semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, GelPackage.Literals.MULTIPLE_ARGUMENTS__HEAD) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GelPackage.Literals.MULTIPLE_ARGUMENTS__HEAD));
			if(transientValues.isValueTransient(semanticObject, GelPackage.Literals.MULTIPLE_ARGUMENTS__TAIL) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GelPackage.Literals.MULTIPLE_ARGUMENTS__TAIL));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getMultipleArgumentsAccess().getHeadLocalVariableIDTerminalRuleCall_1_0_1(), semanticObject.getHead());
		feeder.accept(grammarAccess.getMultipleArgumentsAccess().getTailListOfArgumentsParserRuleCall_3_0(), semanticObject.getTail());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (leftOperand=OrPattern_OrPattern_1_0 rightOperand=XorPattern)
	 */
	protected void sequence_OrPattern(EObject context, OrPattern semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, GelPackage.Literals.BINARY_PATTERN__LEFT_OPERAND) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GelPackage.Literals.BINARY_PATTERN__LEFT_OPERAND));
			if(transientValues.isValueTransient(semanticObject, GelPackage.Literals.BINARY_PATTERN__RIGHT_OPERAND) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GelPackage.Literals.BINARY_PATTERN__RIGHT_OPERAND));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getOrPatternAccess().getOrPatternLeftOperandAction_1_0(), semanticObject.getLeftOperand());
		feeder.accept(grammarAccess.getOrPatternAccess().getRightOperandXorPatternParserRuleCall_1_2_0(), semanticObject.getRightOperand());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     operand=PlusPattern_PlusPattern_1_0
	 */
	protected void sequence_PlusPattern(EObject context, PlusPattern semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, GelPackage.Literals.UNARY_PATTERN__OPERAND) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GelPackage.Literals.UNARY_PATTERN__OPERAND));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getPlusPatternAccess().getPlusPatternOperandAction_1_0(), semanticObject.getOperand());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     argument=[LocalVariable|ID]
	 */
	protected void sequence_SingleArgument(EObject context, SingleArgument semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, GelPackage.Literals.SINGLE_ARGUMENT__ARGUMENT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GelPackage.Literals.SINGLE_ARGUMENT__ARGUMENT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getSingleArgumentAccess().getArgumentLocalVariableIDTerminalRuleCall_1_0_1(), semanticObject.getArgument());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (localVariables+=LocalVariable+ instantiationPredicates+=InstantiationPredicate+)
	 */
	protected void sequence_UnfoldingStrategy(EObject context, UnfoldingStrategy semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (leftOperand=XorPattern_XorPattern_1_0 rightOperand=PlusPattern)
	 */
	protected void sequence_XorPattern(EObject context, XorPattern semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, GelPackage.Literals.BINARY_PATTERN__LEFT_OPERAND) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GelPackage.Literals.BINARY_PATTERN__LEFT_OPERAND));
			if(transientValues.isValueTransient(semanticObject, GelPackage.Literals.BINARY_PATTERN__RIGHT_OPERAND) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GelPackage.Literals.BINARY_PATTERN__RIGHT_OPERAND));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getXorPatternAccess().getXorPatternLeftOperandAction_1_0(), semanticObject.getLeftOperand());
		feeder.accept(grammarAccess.getXorPatternAccess().getRightOperandPlusPatternParserRuleCall_1_2_0(), semanticObject.getRightOperand());
		feeder.finish();
	}
}
