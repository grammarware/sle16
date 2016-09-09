package org.gemoc.bcool.serializer;

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
import org.gemoc.bcool.model.bcool.BCoolLibrary;
import org.gemoc.bcool.model.bcool.BcoolPackage;
import org.gemoc.bcool.model.bcool.ExpressionDeclaration;
import org.gemoc.bcool.model.bcool.ExpressionDefinition;
import org.gemoc.bcool.model.bcool.RelationDeclaration;
import org.gemoc.bcool.model.bcool.RelationDefinition;
import org.gemoc.bcool.services.BCOoLLibGrammarAccess;

@SuppressWarnings("all")
public class BCOoLLibSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private BCOoLLibGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == BcoolPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case BcoolPackage.BCOOL_LIBRARY:
				if(context == grammarAccess.getBCoolLibraryRule()) {
					sequence_BCoolLibrary(context, (BCoolLibrary) semanticObject); 
					return; 
				}
				else break;
			case BcoolPackage.EXPRESSION_DECLARATION:
				if(context == grammarAccess.getExpressionDeclarationRule()) {
					sequence_ExpressionDeclaration(context, (ExpressionDeclaration) semanticObject); 
					return; 
				}
				else break;
			case BcoolPackage.EXPRESSION_DEFINITION:
				if(context == grammarAccess.getExpressionDefinitionRule()) {
					sequence_ExpressionDefinition(context, (ExpressionDefinition) semanticObject); 
					return; 
				}
				else break;
			case BcoolPackage.RELATION_DECLARATION:
				if(context == grammarAccess.getRelationDeclarationRule()) {
					sequence_RelationDeclaration(context, (RelationDeclaration) semanticObject); 
					return; 
				}
				else break;
			case BcoolPackage.RELATION_DEFINITION:
				if(context == grammarAccess.getRelationDefinitionRule()) {
					sequence_RelationDefinition(context, (RelationDefinition) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         (expressionDefinitions+=ExpressionDefinition expressionDefinitions+=ExpressionDefinition*)? 
	 *         (relationDefinitions+=RelationDefinition relationDefinitions+=RelationDefinition*)? 
	 *         (relationDeclarations+=RelationDeclaration relationDeclarations+=RelationDeclaration*)? 
	 *         (expressionDeclarations+=ExpressionDeclaration expressionDeclarations+=ExpressionDeclaration*)?
	 *     )
	 */
	protected void sequence_BCoolLibrary(EObject context, BCoolLibrary semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID (formalParameters+=[EObject|ID] formalParameters+=[EObject|ID]*)?)
	 */
	protected void sequence_ExpressionDeclaration(EObject context, ExpressionDeclaration semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     definition=[ExpressionDeclaration|ID]
	 */
	protected void sequence_ExpressionDefinition(EObject context, ExpressionDefinition semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, BcoolPackage.Literals.EXPRESSION_DEFINITION__DEFINITION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BcoolPackage.Literals.EXPRESSION_DEFINITION__DEFINITION));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getExpressionDefinitionAccess().getDefinitionExpressionDeclarationIDTerminalRuleCall_3_0_1(), semanticObject.getDefinition());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID (formalParameters+=[EObject|ID] formalParameters+=[EObject|ID]*)?)
	 */
	protected void sequence_RelationDeclaration(EObject context, RelationDeclaration semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     definition=[RelationDeclaration|ID]
	 */
	protected void sequence_RelationDefinition(EObject context, RelationDefinition semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, BcoolPackage.Literals.RELATION_DEFINITION__DEFINITION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BcoolPackage.Literals.RELATION_DEFINITION__DEFINITION));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getRelationDefinitionAccess().getDefinitionRelationDeclarationIDTerminalRuleCall_3_0_1(), semanticObject.getDefinition());
		feeder.finish();
	}
}
