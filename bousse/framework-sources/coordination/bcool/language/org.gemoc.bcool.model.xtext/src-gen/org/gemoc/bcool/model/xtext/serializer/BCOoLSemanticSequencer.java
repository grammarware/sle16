package org.gemoc.bcool.model.xtext.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import fr.inria.aoste.timesquare.ECL.ECLDefCS;
import fr.inria.aoste.timesquare.ECL.ECLPackage;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import org.gemoc.bcool.model.bcool.BCoolCompositionRule;
import org.gemoc.bcool.model.bcool.BCoolOperator;
import org.gemoc.bcool.model.bcool.BCoolOperatorArg;
import org.gemoc.bcool.model.bcool.BCoolSpecification;
import org.gemoc.bcool.model.bcool.BcoolPackage;
import org.gemoc.bcool.model.bcool.CoordinationRule;
import org.gemoc.bcool.model.bcool.EventExpression;
import org.gemoc.bcool.model.bcool.EventRelation;
import org.gemoc.bcool.model.bcool.ImportInterfaceStatement;
import org.gemoc.bcool.model.bcool.ImportLibStatement;
import org.gemoc.bcool.model.bcool.MatchingRule;
import org.gemoc.bcool.model.xtext.services.BCOoLGrammarAccess;
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

@SuppressWarnings("all")
public class BCOoLSemanticSequencer extends GExpressionsSemanticSequencer {

	@Inject
	private BCOoLGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == ECLPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case ECLPackage.ECL_DEF_CS:
				if(context == grammarAccess.getGlobalDSEsRuleRule()) {
					sequence_globalDSEsRule(context, (ECLDefCS) semanticObject); 
					return; 
				}
				else break;
			}
		else if(semanticObject.eClass().getEPackage() == BcoolPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case BcoolPackage.BCOOL_COMPOSITION_RULE:
				if(context == grammarAccess.getBCoolCompositionRuleRule()) {
					sequence_BCoolCompositionRule(context, (BCoolCompositionRule) semanticObject); 
					return; 
				}
				else break;
			case BcoolPackage.BCOOL_OPERATOR:
				if(context == grammarAccess.getBCoolOperatorSpecRule()) {
					sequence_BCoolOperatorSpec(context, (BCoolOperator) semanticObject); 
					return; 
				}
				else break;
			case BcoolPackage.BCOOL_OPERATOR_ARG:
				if(context == grammarAccess.getBCoolOperatorArgRule()) {
					sequence_BCoolOperatorArg(context, (BCoolOperatorArg) semanticObject); 
					return; 
				}
				else break;
			case BcoolPackage.BCOOL_SPECIFICATION:
				if(context == grammarAccess.getBCoolSpecRule()) {
					sequence_BCoolSpec(context, (BCoolSpecification) semanticObject); 
					return; 
				}
				else break;
			case BcoolPackage.COORDINATION_RULE:
				if(context == grammarAccess.getCoordinationRuleRule()) {
					sequence_CoordinationRule(context, (CoordinationRule) semanticObject); 
					return; 
				}
				else break;
			case BcoolPackage.EVENT_EXPRESSION:
				if(context == grammarAccess.getEventExpressionRule() ||
				   context == grammarAccess.getGlobalEventExpressionRuleRule()) {
					sequence_EventExpression(context, (EventExpression) semanticObject); 
					return; 
				}
				else break;
			case BcoolPackage.EVENT_RELATION:
				if(context == grammarAccess.getEventRelationRule()) {
					sequence_EventRelation(context, (EventRelation) semanticObject); 
					return; 
				}
				else break;
			case BcoolPackage.IMPORT_INTERFACE_STATEMENT:
				if(context == grammarAccess.getImportInterfaceRuleRule()) {
					sequence_ImportInterfaceRule(context, (ImportInterfaceStatement) semanticObject); 
					return; 
				}
				else break;
			case BcoolPackage.IMPORT_LIB_STATEMENT:
				if(context == grammarAccess.getImportLibRuleRule()) {
					sequence_ImportLibRule(context, (ImportLibStatement) semanticObject); 
					return; 
				}
				else break;
			case BcoolPackage.MATCHING_RULE:
				if(context == grammarAccess.getMatchingRuleRule()) {
					sequence_MatchingRule(context, (MatchingRule) semanticObject); 
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
	 *     (name=ID BCoolOperatorArgs+=BCoolOperatorArg BCoolOperatorArgs+=BCoolOperatorArg* matchingRule=MatchingRule coordinationRule=CoordinationRule)
	 */
	protected void sequence_BCoolCompositionRule(EObject context, BCoolCompositionRule semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID Interface=[ImportInterfaceStatement|ID] DSE=[ECLDefCS|ID])
	 */
	protected void sequence_BCoolOperatorArg(EObject context, BCoolOperatorArg semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, BcoolPackage.Literals.NAMED_ELEMENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BcoolPackage.Literals.NAMED_ELEMENT__NAME));
			if(transientValues.isValueTransient(semanticObject, BcoolPackage.Literals.BCOOL_OPERATOR_ARG__DSE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BcoolPackage.Literals.BCOOL_OPERATOR_ARG__DSE));
			if(transientValues.isValueTransient(semanticObject, BcoolPackage.Literals.BCOOL_OPERATOR_ARG__INTERFACE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BcoolPackage.Literals.BCOOL_OPERATOR_ARG__INTERFACE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getBCoolOperatorArgAccess().getNameIDTerminalRuleCall_0_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getBCoolOperatorArgAccess().getInterfaceImportInterfaceStatementIDTerminalRuleCall_2_0_1(), semanticObject.getInterface());
		feeder.accept(grammarAccess.getBCoolOperatorArgAccess().getDSEECLDefCSIDTerminalRuleCall_4_0_1(), semanticObject.getDSE());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID globalEventExpressions+=globalEventExpressionRule? globalDSEs+=globalDSEsRule? bcoolCompositionRules+=BCoolCompositionRule+)
	 */
	protected void sequence_BCoolOperatorSpec(EObject context, BCoolOperator semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID? importsLib+=ImportLibRule+ importsBehavioralInterface+=ImportInterfaceRule+ bcoolOperators+=BCoolOperatorSpec+)
	 */
	protected void sequence_BCoolSpec(EObject context, BCoolSpecification semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     eventRelations=EventRelation
	 */
	protected void sequence_CoordinationRule(EObject context, CoordinationRule semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, BcoolPackage.Literals.COORDINATION_RULE__EVENT_RELATIONS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BcoolPackage.Literals.COORDINATION_RULE__EVENT_RELATIONS));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getCoordinationRuleAccess().getEventRelationsEventRelationParserRuleCall_0(), semanticObject.getEventRelations());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID declaration=[ExpressionDeclaration|QualifiedName] (actualParameters+=[EObject|ID] actualParameters+=[EObject|ID]*)?)
	 */
	protected void sequence_EventExpression(EObject context, EventExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (declaration=[RelationDeclaration|QualifiedName] (actualParameters+=[ECLDefCS|ID] actualParameters+=[ECLDefCS|ID]*)?)
	 */
	protected void sequence_EventRelation(EObject context, EventRelation semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (importURI=STRING name=ID)
	 */
	protected void sequence_ImportInterfaceRule(EObject context, ImportInterfaceStatement semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, BcoolPackage.Literals.NAMED_ELEMENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BcoolPackage.Literals.NAMED_ELEMENT__NAME));
			if(transientValues.isValueTransient(semanticObject, BcoolPackage.Literals.IMPORT_INTERFACE_STATEMENT__IMPORT_URI) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BcoolPackage.Literals.IMPORT_INTERFACE_STATEMENT__IMPORT_URI));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getImportInterfaceRuleAccess().getImportURISTRINGTerminalRuleCall_1_0(), semanticObject.getImportURI());
		feeder.accept(grammarAccess.getImportInterfaceRuleAccess().getNameIDTerminalRuleCall_3_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     importURI=STRING
	 */
	protected void sequence_ImportLibRule(EObject context, ImportLibStatement semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, BcoolPackage.Literals.IMPORT_LIB_STATEMENT__IMPORT_URI) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BcoolPackage.Literals.IMPORT_LIB_STATEMENT__IMPORT_URI));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getImportLibRuleAccess().getImportURISTRINGTerminalRuleCall_1_0(), semanticObject.getImportURI());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (condition=GExpression filterEventExpressions+=EventExpression*)
	 */
	protected void sequence_MatchingRule(EObject context, MatchingRule semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_globalDSEsRule(EObject context, ECLDefCS semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
