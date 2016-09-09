package org.gemoc.bcool.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.gemoc.bcool.services.BCOoLLibGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalBCOoLLibParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'BCoolLibrary'", "'{'", "'expressionDefinitions'", "','", "'}'", "'relationDefinitions'", "'relationDeclarations'", "'expressionDeclarations'", "'ExpressionDefinition'", "'definition'", "'RelationDefinition'", "'RelationDeclaration'", "'formalParameters'", "'ExpressionDeclaration'"
    };
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=5;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalBCOoLLibParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalBCOoLLibParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalBCOoLLibParser.tokenNames; }
    public String getGrammarFileName() { return "../org.gemoc.bcool.bcoollib/src-gen/org/gemoc/bcool/parser/antlr/internal/InternalBCOoLLib.g"; }



     	private BCOoLLibGrammarAccess grammarAccess;
     	
        public InternalBCOoLLibParser(TokenStream input, BCOoLLibGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "BCoolLibrary";	
       	}
       	
       	@Override
       	protected BCOoLLibGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleBCoolLibrary"
    // ../org.gemoc.bcool.bcoollib/src-gen/org/gemoc/bcool/parser/antlr/internal/InternalBCOoLLib.g:67:1: entryRuleBCoolLibrary returns [EObject current=null] : iv_ruleBCoolLibrary= ruleBCoolLibrary EOF ;
    public final EObject entryRuleBCoolLibrary() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBCoolLibrary = null;


        try {
            // ../org.gemoc.bcool.bcoollib/src-gen/org/gemoc/bcool/parser/antlr/internal/InternalBCOoLLib.g:68:2: (iv_ruleBCoolLibrary= ruleBCoolLibrary EOF )
            // ../org.gemoc.bcool.bcoollib/src-gen/org/gemoc/bcool/parser/antlr/internal/InternalBCOoLLib.g:69:2: iv_ruleBCoolLibrary= ruleBCoolLibrary EOF
            {
             newCompositeNode(grammarAccess.getBCoolLibraryRule()); 
            pushFollow(FOLLOW_ruleBCoolLibrary_in_entryRuleBCoolLibrary75);
            iv_ruleBCoolLibrary=ruleBCoolLibrary();

            state._fsp--;

             current =iv_ruleBCoolLibrary; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBCoolLibrary85); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBCoolLibrary"


    // $ANTLR start "ruleBCoolLibrary"
    // ../org.gemoc.bcool.bcoollib/src-gen/org/gemoc/bcool/parser/antlr/internal/InternalBCOoLLib.g:76:1: ruleBCoolLibrary returns [EObject current=null] : ( () otherlv_1= 'BCoolLibrary' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'expressionDefinitions' otherlv_5= '{' ( (lv_expressionDefinitions_6_0= ruleExpressionDefinition ) ) (otherlv_7= ',' ( (lv_expressionDefinitions_8_0= ruleExpressionDefinition ) ) )* otherlv_9= '}' )? (otherlv_10= 'relationDefinitions' otherlv_11= '{' ( (lv_relationDefinitions_12_0= ruleRelationDefinition ) ) (otherlv_13= ',' ( (lv_relationDefinitions_14_0= ruleRelationDefinition ) ) )* otherlv_15= '}' )? (otherlv_16= 'relationDeclarations' otherlv_17= '{' ( (lv_relationDeclarations_18_0= ruleRelationDeclaration ) ) (otherlv_19= ',' ( (lv_relationDeclarations_20_0= ruleRelationDeclaration ) ) )* otherlv_21= '}' )? (otherlv_22= 'expressionDeclarations' otherlv_23= '{' ( (lv_expressionDeclarations_24_0= ruleExpressionDeclaration ) ) (otherlv_25= ',' ( (lv_expressionDeclarations_26_0= ruleExpressionDeclaration ) ) )* otherlv_27= '}' )? otherlv_28= '}' ) ;
    public final EObject ruleBCoolLibrary() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        Token otherlv_25=null;
        Token otherlv_27=null;
        Token otherlv_28=null;
        EObject lv_expressionDefinitions_6_0 = null;

        EObject lv_expressionDefinitions_8_0 = null;

        EObject lv_relationDefinitions_12_0 = null;

        EObject lv_relationDefinitions_14_0 = null;

        EObject lv_relationDeclarations_18_0 = null;

        EObject lv_relationDeclarations_20_0 = null;

        EObject lv_expressionDeclarations_24_0 = null;

        EObject lv_expressionDeclarations_26_0 = null;


         enterRule(); 
            
        try {
            // ../org.gemoc.bcool.bcoollib/src-gen/org/gemoc/bcool/parser/antlr/internal/InternalBCOoLLib.g:79:28: ( ( () otherlv_1= 'BCoolLibrary' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'expressionDefinitions' otherlv_5= '{' ( (lv_expressionDefinitions_6_0= ruleExpressionDefinition ) ) (otherlv_7= ',' ( (lv_expressionDefinitions_8_0= ruleExpressionDefinition ) ) )* otherlv_9= '}' )? (otherlv_10= 'relationDefinitions' otherlv_11= '{' ( (lv_relationDefinitions_12_0= ruleRelationDefinition ) ) (otherlv_13= ',' ( (lv_relationDefinitions_14_0= ruleRelationDefinition ) ) )* otherlv_15= '}' )? (otherlv_16= 'relationDeclarations' otherlv_17= '{' ( (lv_relationDeclarations_18_0= ruleRelationDeclaration ) ) (otherlv_19= ',' ( (lv_relationDeclarations_20_0= ruleRelationDeclaration ) ) )* otherlv_21= '}' )? (otherlv_22= 'expressionDeclarations' otherlv_23= '{' ( (lv_expressionDeclarations_24_0= ruleExpressionDeclaration ) ) (otherlv_25= ',' ( (lv_expressionDeclarations_26_0= ruleExpressionDeclaration ) ) )* otherlv_27= '}' )? otherlv_28= '}' ) )
            // ../org.gemoc.bcool.bcoollib/src-gen/org/gemoc/bcool/parser/antlr/internal/InternalBCOoLLib.g:80:1: ( () otherlv_1= 'BCoolLibrary' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'expressionDefinitions' otherlv_5= '{' ( (lv_expressionDefinitions_6_0= ruleExpressionDefinition ) ) (otherlv_7= ',' ( (lv_expressionDefinitions_8_0= ruleExpressionDefinition ) ) )* otherlv_9= '}' )? (otherlv_10= 'relationDefinitions' otherlv_11= '{' ( (lv_relationDefinitions_12_0= ruleRelationDefinition ) ) (otherlv_13= ',' ( (lv_relationDefinitions_14_0= ruleRelationDefinition ) ) )* otherlv_15= '}' )? (otherlv_16= 'relationDeclarations' otherlv_17= '{' ( (lv_relationDeclarations_18_0= ruleRelationDeclaration ) ) (otherlv_19= ',' ( (lv_relationDeclarations_20_0= ruleRelationDeclaration ) ) )* otherlv_21= '}' )? (otherlv_22= 'expressionDeclarations' otherlv_23= '{' ( (lv_expressionDeclarations_24_0= ruleExpressionDeclaration ) ) (otherlv_25= ',' ( (lv_expressionDeclarations_26_0= ruleExpressionDeclaration ) ) )* otherlv_27= '}' )? otherlv_28= '}' )
            {
            // ../org.gemoc.bcool.bcoollib/src-gen/org/gemoc/bcool/parser/antlr/internal/InternalBCOoLLib.g:80:1: ( () otherlv_1= 'BCoolLibrary' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'expressionDefinitions' otherlv_5= '{' ( (lv_expressionDefinitions_6_0= ruleExpressionDefinition ) ) (otherlv_7= ',' ( (lv_expressionDefinitions_8_0= ruleExpressionDefinition ) ) )* otherlv_9= '}' )? (otherlv_10= 'relationDefinitions' otherlv_11= '{' ( (lv_relationDefinitions_12_0= ruleRelationDefinition ) ) (otherlv_13= ',' ( (lv_relationDefinitions_14_0= ruleRelationDefinition ) ) )* otherlv_15= '}' )? (otherlv_16= 'relationDeclarations' otherlv_17= '{' ( (lv_relationDeclarations_18_0= ruleRelationDeclaration ) ) (otherlv_19= ',' ( (lv_relationDeclarations_20_0= ruleRelationDeclaration ) ) )* otherlv_21= '}' )? (otherlv_22= 'expressionDeclarations' otherlv_23= '{' ( (lv_expressionDeclarations_24_0= ruleExpressionDeclaration ) ) (otherlv_25= ',' ( (lv_expressionDeclarations_26_0= ruleExpressionDeclaration ) ) )* otherlv_27= '}' )? otherlv_28= '}' )
            // ../org.gemoc.bcool.bcoollib/src-gen/org/gemoc/bcool/parser/antlr/internal/InternalBCOoLLib.g:80:2: () otherlv_1= 'BCoolLibrary' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'expressionDefinitions' otherlv_5= '{' ( (lv_expressionDefinitions_6_0= ruleExpressionDefinition ) ) (otherlv_7= ',' ( (lv_expressionDefinitions_8_0= ruleExpressionDefinition ) ) )* otherlv_9= '}' )? (otherlv_10= 'relationDefinitions' otherlv_11= '{' ( (lv_relationDefinitions_12_0= ruleRelationDefinition ) ) (otherlv_13= ',' ( (lv_relationDefinitions_14_0= ruleRelationDefinition ) ) )* otherlv_15= '}' )? (otherlv_16= 'relationDeclarations' otherlv_17= '{' ( (lv_relationDeclarations_18_0= ruleRelationDeclaration ) ) (otherlv_19= ',' ( (lv_relationDeclarations_20_0= ruleRelationDeclaration ) ) )* otherlv_21= '}' )? (otherlv_22= 'expressionDeclarations' otherlv_23= '{' ( (lv_expressionDeclarations_24_0= ruleExpressionDeclaration ) ) (otherlv_25= ',' ( (lv_expressionDeclarations_26_0= ruleExpressionDeclaration ) ) )* otherlv_27= '}' )? otherlv_28= '}'
            {
            // ../org.gemoc.bcool.bcoollib/src-gen/org/gemoc/bcool/parser/antlr/internal/InternalBCOoLLib.g:80:2: ()
            // ../org.gemoc.bcool.bcoollib/src-gen/org/gemoc/bcool/parser/antlr/internal/InternalBCOoLLib.g:81:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getBCoolLibraryAccess().getBCoolLibraryAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,11,FOLLOW_11_in_ruleBCoolLibrary131); 

                	newLeafNode(otherlv_1, grammarAccess.getBCoolLibraryAccess().getBCoolLibraryKeyword_1());
                
            // ../org.gemoc.bcool.bcoollib/src-gen/org/gemoc/bcool/parser/antlr/internal/InternalBCOoLLib.g:90:1: ( (lv_name_2_0= RULE_ID ) )
            // ../org.gemoc.bcool.bcoollib/src-gen/org/gemoc/bcool/parser/antlr/internal/InternalBCOoLLib.g:91:1: (lv_name_2_0= RULE_ID )
            {
            // ../org.gemoc.bcool.bcoollib/src-gen/org/gemoc/bcool/parser/antlr/internal/InternalBCOoLLib.g:91:1: (lv_name_2_0= RULE_ID )
            // ../org.gemoc.bcool.bcoollib/src-gen/org/gemoc/bcool/parser/antlr/internal/InternalBCOoLLib.g:92:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleBCoolLibrary148); 

            			newLeafNode(lv_name_2_0, grammarAccess.getBCoolLibraryAccess().getNameIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getBCoolLibraryRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"ID");
            	    

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_12_in_ruleBCoolLibrary165); 

                	newLeafNode(otherlv_3, grammarAccess.getBCoolLibraryAccess().getLeftCurlyBracketKeyword_3());
                
            // ../org.gemoc.bcool.bcoollib/src-gen/org/gemoc/bcool/parser/antlr/internal/InternalBCOoLLib.g:112:1: (otherlv_4= 'expressionDefinitions' otherlv_5= '{' ( (lv_expressionDefinitions_6_0= ruleExpressionDefinition ) ) (otherlv_7= ',' ( (lv_expressionDefinitions_8_0= ruleExpressionDefinition ) ) )* otherlv_9= '}' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==13) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../org.gemoc.bcool.bcoollib/src-gen/org/gemoc/bcool/parser/antlr/internal/InternalBCOoLLib.g:112:3: otherlv_4= 'expressionDefinitions' otherlv_5= '{' ( (lv_expressionDefinitions_6_0= ruleExpressionDefinition ) ) (otherlv_7= ',' ( (lv_expressionDefinitions_8_0= ruleExpressionDefinition ) ) )* otherlv_9= '}'
                    {
                    otherlv_4=(Token)match(input,13,FOLLOW_13_in_ruleBCoolLibrary178); 

                        	newLeafNode(otherlv_4, grammarAccess.getBCoolLibraryAccess().getExpressionDefinitionsKeyword_4_0());
                        
                    otherlv_5=(Token)match(input,12,FOLLOW_12_in_ruleBCoolLibrary190); 

                        	newLeafNode(otherlv_5, grammarAccess.getBCoolLibraryAccess().getLeftCurlyBracketKeyword_4_1());
                        
                    // ../org.gemoc.bcool.bcoollib/src-gen/org/gemoc/bcool/parser/antlr/internal/InternalBCOoLLib.g:120:1: ( (lv_expressionDefinitions_6_0= ruleExpressionDefinition ) )
                    // ../org.gemoc.bcool.bcoollib/src-gen/org/gemoc/bcool/parser/antlr/internal/InternalBCOoLLib.g:121:1: (lv_expressionDefinitions_6_0= ruleExpressionDefinition )
                    {
                    // ../org.gemoc.bcool.bcoollib/src-gen/org/gemoc/bcool/parser/antlr/internal/InternalBCOoLLib.g:121:1: (lv_expressionDefinitions_6_0= ruleExpressionDefinition )
                    // ../org.gemoc.bcool.bcoollib/src-gen/org/gemoc/bcool/parser/antlr/internal/InternalBCOoLLib.g:122:3: lv_expressionDefinitions_6_0= ruleExpressionDefinition
                    {
                     
                    	        newCompositeNode(grammarAccess.getBCoolLibraryAccess().getExpressionDefinitionsExpressionDefinitionParserRuleCall_4_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleExpressionDefinition_in_ruleBCoolLibrary211);
                    lv_expressionDefinitions_6_0=ruleExpressionDefinition();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getBCoolLibraryRule());
                    	        }
                           		add(
                           			current, 
                           			"expressionDefinitions",
                            		lv_expressionDefinitions_6_0, 
                            		"ExpressionDefinition");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.gemoc.bcool.bcoollib/src-gen/org/gemoc/bcool/parser/antlr/internal/InternalBCOoLLib.g:138:2: (otherlv_7= ',' ( (lv_expressionDefinitions_8_0= ruleExpressionDefinition ) ) )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==14) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // ../org.gemoc.bcool.bcoollib/src-gen/org/gemoc/bcool/parser/antlr/internal/InternalBCOoLLib.g:138:4: otherlv_7= ',' ( (lv_expressionDefinitions_8_0= ruleExpressionDefinition ) )
                    	    {
                    	    otherlv_7=(Token)match(input,14,FOLLOW_14_in_ruleBCoolLibrary224); 

                    	        	newLeafNode(otherlv_7, grammarAccess.getBCoolLibraryAccess().getCommaKeyword_4_3_0());
                    	        
                    	    // ../org.gemoc.bcool.bcoollib/src-gen/org/gemoc/bcool/parser/antlr/internal/InternalBCOoLLib.g:142:1: ( (lv_expressionDefinitions_8_0= ruleExpressionDefinition ) )
                    	    // ../org.gemoc.bcool.bcoollib/src-gen/org/gemoc/bcool/parser/antlr/internal/InternalBCOoLLib.g:143:1: (lv_expressionDefinitions_8_0= ruleExpressionDefinition )
                    	    {
                    	    // ../org.gemoc.bcool.bcoollib/src-gen/org/gemoc/bcool/parser/antlr/internal/InternalBCOoLLib.g:143:1: (lv_expressionDefinitions_8_0= ruleExpressionDefinition )
                    	    // ../org.gemoc.bcool.bcoollib/src-gen/org/gemoc/bcool/parser/antlr/internal/InternalBCOoLLib.g:144:3: lv_expressionDefinitions_8_0= ruleExpressionDefinition
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getBCoolLibraryAccess().getExpressionDefinitionsExpressionDefinitionParserRuleCall_4_3_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleExpressionDefinition_in_ruleBCoolLibrary245);
                    	    lv_expressionDefinitions_8_0=ruleExpressionDefinition();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getBCoolLibraryRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"expressionDefinitions",
                    	            		lv_expressionDefinitions_8_0, 
                    	            		"ExpressionDefinition");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop1;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,15,FOLLOW_15_in_ruleBCoolLibrary259); 

                        	newLeafNode(otherlv_9, grammarAccess.getBCoolLibraryAccess().getRightCurlyBracketKeyword_4_4());
                        

                    }
                    break;

            }

            // ../org.gemoc.bcool.bcoollib/src-gen/org/gemoc/bcool/parser/antlr/internal/InternalBCOoLLib.g:164:3: (otherlv_10= 'relationDefinitions' otherlv_11= '{' ( (lv_relationDefinitions_12_0= ruleRelationDefinition ) ) (otherlv_13= ',' ( (lv_relationDefinitions_14_0= ruleRelationDefinition ) ) )* otherlv_15= '}' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==16) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../org.gemoc.bcool.bcoollib/src-gen/org/gemoc/bcool/parser/antlr/internal/InternalBCOoLLib.g:164:5: otherlv_10= 'relationDefinitions' otherlv_11= '{' ( (lv_relationDefinitions_12_0= ruleRelationDefinition ) ) (otherlv_13= ',' ( (lv_relationDefinitions_14_0= ruleRelationDefinition ) ) )* otherlv_15= '}'
                    {
                    otherlv_10=(Token)match(input,16,FOLLOW_16_in_ruleBCoolLibrary274); 

                        	newLeafNode(otherlv_10, grammarAccess.getBCoolLibraryAccess().getRelationDefinitionsKeyword_5_0());
                        
                    otherlv_11=(Token)match(input,12,FOLLOW_12_in_ruleBCoolLibrary286); 

                        	newLeafNode(otherlv_11, grammarAccess.getBCoolLibraryAccess().getLeftCurlyBracketKeyword_5_1());
                        
                    // ../org.gemoc.bcool.bcoollib/src-gen/org/gemoc/bcool/parser/antlr/internal/InternalBCOoLLib.g:172:1: ( (lv_relationDefinitions_12_0= ruleRelationDefinition ) )
                    // ../org.gemoc.bcool.bcoollib/src-gen/org/gemoc/bcool/parser/antlr/internal/InternalBCOoLLib.g:173:1: (lv_relationDefinitions_12_0= ruleRelationDefinition )
                    {
                    // ../org.gemoc.bcool.bcoollib/src-gen/org/gemoc/bcool/parser/antlr/internal/InternalBCOoLLib.g:173:1: (lv_relationDefinitions_12_0= ruleRelationDefinition )
                    // ../org.gemoc.bcool.bcoollib/src-gen/org/gemoc/bcool/parser/antlr/internal/InternalBCOoLLib.g:174:3: lv_relationDefinitions_12_0= ruleRelationDefinition
                    {
                     
                    	        newCompositeNode(grammarAccess.getBCoolLibraryAccess().getRelationDefinitionsRelationDefinitionParserRuleCall_5_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleRelationDefinition_in_ruleBCoolLibrary307);
                    lv_relationDefinitions_12_0=ruleRelationDefinition();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getBCoolLibraryRule());
                    	        }
                           		add(
                           			current, 
                           			"relationDefinitions",
                            		lv_relationDefinitions_12_0, 
                            		"RelationDefinition");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.gemoc.bcool.bcoollib/src-gen/org/gemoc/bcool/parser/antlr/internal/InternalBCOoLLib.g:190:2: (otherlv_13= ',' ( (lv_relationDefinitions_14_0= ruleRelationDefinition ) ) )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==14) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // ../org.gemoc.bcool.bcoollib/src-gen/org/gemoc/bcool/parser/antlr/internal/InternalBCOoLLib.g:190:4: otherlv_13= ',' ( (lv_relationDefinitions_14_0= ruleRelationDefinition ) )
                    	    {
                    	    otherlv_13=(Token)match(input,14,FOLLOW_14_in_ruleBCoolLibrary320); 

                    	        	newLeafNode(otherlv_13, grammarAccess.getBCoolLibraryAccess().getCommaKeyword_5_3_0());
                    	        
                    	    // ../org.gemoc.bcool.bcoollib/src-gen/org/gemoc/bcool/parser/antlr/internal/InternalBCOoLLib.g:194:1: ( (lv_relationDefinitions_14_0= ruleRelationDefinition ) )
                    	    // ../org.gemoc.bcool.bcoollib/src-gen/org/gemoc/bcool/parser/antlr/internal/InternalBCOoLLib.g:195:1: (lv_relationDefinitions_14_0= ruleRelationDefinition )
                    	    {
                    	    // ../org.gemoc.bcool.bcoollib/src-gen/org/gemoc/bcool/parser/antlr/internal/InternalBCOoLLib.g:195:1: (lv_relationDefinitions_14_0= ruleRelationDefinition )
                    	    // ../org.gemoc.bcool.bcoollib/src-gen/org/gemoc/bcool/parser/antlr/internal/InternalBCOoLLib.g:196:3: lv_relationDefinitions_14_0= ruleRelationDefinition
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getBCoolLibraryAccess().getRelationDefinitionsRelationDefinitionParserRuleCall_5_3_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleRelationDefinition_in_ruleBCoolLibrary341);
                    	    lv_relationDefinitions_14_0=ruleRelationDefinition();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getBCoolLibraryRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"relationDefinitions",
                    	            		lv_relationDefinitions_14_0, 
                    	            		"RelationDefinition");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);

                    otherlv_15=(Token)match(input,15,FOLLOW_15_in_ruleBCoolLibrary355); 

                        	newLeafNode(otherlv_15, grammarAccess.getBCoolLibraryAccess().getRightCurlyBracketKeyword_5_4());
                        

                    }
                    break;

            }

            // ../org.gemoc.bcool.bcoollib/src-gen/org/gemoc/bcool/parser/antlr/internal/InternalBCOoLLib.g:216:3: (otherlv_16= 'relationDeclarations' otherlv_17= '{' ( (lv_relationDeclarations_18_0= ruleRelationDeclaration ) ) (otherlv_19= ',' ( (lv_relationDeclarations_20_0= ruleRelationDeclaration ) ) )* otherlv_21= '}' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==17) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../org.gemoc.bcool.bcoollib/src-gen/org/gemoc/bcool/parser/antlr/internal/InternalBCOoLLib.g:216:5: otherlv_16= 'relationDeclarations' otherlv_17= '{' ( (lv_relationDeclarations_18_0= ruleRelationDeclaration ) ) (otherlv_19= ',' ( (lv_relationDeclarations_20_0= ruleRelationDeclaration ) ) )* otherlv_21= '}'
                    {
                    otherlv_16=(Token)match(input,17,FOLLOW_17_in_ruleBCoolLibrary370); 

                        	newLeafNode(otherlv_16, grammarAccess.getBCoolLibraryAccess().getRelationDeclarationsKeyword_6_0());
                        
                    otherlv_17=(Token)match(input,12,FOLLOW_12_in_ruleBCoolLibrary382); 

                        	newLeafNode(otherlv_17, grammarAccess.getBCoolLibraryAccess().getLeftCurlyBracketKeyword_6_1());
                        
                    // ../org.gemoc.bcool.bcoollib/src-gen/org/gemoc/bcool/parser/antlr/internal/InternalBCOoLLib.g:224:1: ( (lv_relationDeclarations_18_0= ruleRelationDeclaration ) )
                    // ../org.gemoc.bcool.bcoollib/src-gen/org/gemoc/bcool/parser/antlr/internal/InternalBCOoLLib.g:225:1: (lv_relationDeclarations_18_0= ruleRelationDeclaration )
                    {
                    // ../org.gemoc.bcool.bcoollib/src-gen/org/gemoc/bcool/parser/antlr/internal/InternalBCOoLLib.g:225:1: (lv_relationDeclarations_18_0= ruleRelationDeclaration )
                    // ../org.gemoc.bcool.bcoollib/src-gen/org/gemoc/bcool/parser/antlr/internal/InternalBCOoLLib.g:226:3: lv_relationDeclarations_18_0= ruleRelationDeclaration
                    {
                     
                    	        newCompositeNode(grammarAccess.getBCoolLibraryAccess().getRelationDeclarationsRelationDeclarationParserRuleCall_6_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleRelationDeclaration_in_ruleBCoolLibrary403);
                    lv_relationDeclarations_18_0=ruleRelationDeclaration();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getBCoolLibraryRule());
                    	        }
                           		add(
                           			current, 
                           			"relationDeclarations",
                            		lv_relationDeclarations_18_0, 
                            		"RelationDeclaration");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.gemoc.bcool.bcoollib/src-gen/org/gemoc/bcool/parser/antlr/internal/InternalBCOoLLib.g:242:2: (otherlv_19= ',' ( (lv_relationDeclarations_20_0= ruleRelationDeclaration ) ) )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==14) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // ../org.gemoc.bcool.bcoollib/src-gen/org/gemoc/bcool/parser/antlr/internal/InternalBCOoLLib.g:242:4: otherlv_19= ',' ( (lv_relationDeclarations_20_0= ruleRelationDeclaration ) )
                    	    {
                    	    otherlv_19=(Token)match(input,14,FOLLOW_14_in_ruleBCoolLibrary416); 

                    	        	newLeafNode(otherlv_19, grammarAccess.getBCoolLibraryAccess().getCommaKeyword_6_3_0());
                    	        
                    	    // ../org.gemoc.bcool.bcoollib/src-gen/org/gemoc/bcool/parser/antlr/internal/InternalBCOoLLib.g:246:1: ( (lv_relationDeclarations_20_0= ruleRelationDeclaration ) )
                    	    // ../org.gemoc.bcool.bcoollib/src-gen/org/gemoc/bcool/parser/antlr/internal/InternalBCOoLLib.g:247:1: (lv_relationDeclarations_20_0= ruleRelationDeclaration )
                    	    {
                    	    // ../org.gemoc.bcool.bcoollib/src-gen/org/gemoc/bcool/parser/antlr/internal/InternalBCOoLLib.g:247:1: (lv_relationDeclarations_20_0= ruleRelationDeclaration )
                    	    // ../org.gemoc.bcool.bcoollib/src-gen/org/gemoc/bcool/parser/antlr/internal/InternalBCOoLLib.g:248:3: lv_relationDeclarations_20_0= ruleRelationDeclaration
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getBCoolLibraryAccess().getRelationDeclarationsRelationDeclarationParserRuleCall_6_3_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleRelationDeclaration_in_ruleBCoolLibrary437);
                    	    lv_relationDeclarations_20_0=ruleRelationDeclaration();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getBCoolLibraryRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"relationDeclarations",
                    	            		lv_relationDeclarations_20_0, 
                    	            		"RelationDeclaration");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    otherlv_21=(Token)match(input,15,FOLLOW_15_in_ruleBCoolLibrary451); 

                        	newLeafNode(otherlv_21, grammarAccess.getBCoolLibraryAccess().getRightCurlyBracketKeyword_6_4());
                        

                    }
                    break;

            }

            // ../org.gemoc.bcool.bcoollib/src-gen/org/gemoc/bcool/parser/antlr/internal/InternalBCOoLLib.g:268:3: (otherlv_22= 'expressionDeclarations' otherlv_23= '{' ( (lv_expressionDeclarations_24_0= ruleExpressionDeclaration ) ) (otherlv_25= ',' ( (lv_expressionDeclarations_26_0= ruleExpressionDeclaration ) ) )* otherlv_27= '}' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==18) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../org.gemoc.bcool.bcoollib/src-gen/org/gemoc/bcool/parser/antlr/internal/InternalBCOoLLib.g:268:5: otherlv_22= 'expressionDeclarations' otherlv_23= '{' ( (lv_expressionDeclarations_24_0= ruleExpressionDeclaration ) ) (otherlv_25= ',' ( (lv_expressionDeclarations_26_0= ruleExpressionDeclaration ) ) )* otherlv_27= '}'
                    {
                    otherlv_22=(Token)match(input,18,FOLLOW_18_in_ruleBCoolLibrary466); 

                        	newLeafNode(otherlv_22, grammarAccess.getBCoolLibraryAccess().getExpressionDeclarationsKeyword_7_0());
                        
                    otherlv_23=(Token)match(input,12,FOLLOW_12_in_ruleBCoolLibrary478); 

                        	newLeafNode(otherlv_23, grammarAccess.getBCoolLibraryAccess().getLeftCurlyBracketKeyword_7_1());
                        
                    // ../org.gemoc.bcool.bcoollib/src-gen/org/gemoc/bcool/parser/antlr/internal/InternalBCOoLLib.g:276:1: ( (lv_expressionDeclarations_24_0= ruleExpressionDeclaration ) )
                    // ../org.gemoc.bcool.bcoollib/src-gen/org/gemoc/bcool/parser/antlr/internal/InternalBCOoLLib.g:277:1: (lv_expressionDeclarations_24_0= ruleExpressionDeclaration )
                    {
                    // ../org.gemoc.bcool.bcoollib/src-gen/org/gemoc/bcool/parser/antlr/internal/InternalBCOoLLib.g:277:1: (lv_expressionDeclarations_24_0= ruleExpressionDeclaration )
                    // ../org.gemoc.bcool.bcoollib/src-gen/org/gemoc/bcool/parser/antlr/internal/InternalBCOoLLib.g:278:3: lv_expressionDeclarations_24_0= ruleExpressionDeclaration
                    {
                     
                    	        newCompositeNode(grammarAccess.getBCoolLibraryAccess().getExpressionDeclarationsExpressionDeclarationParserRuleCall_7_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleExpressionDeclaration_in_ruleBCoolLibrary499);
                    lv_expressionDeclarations_24_0=ruleExpressionDeclaration();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getBCoolLibraryRule());
                    	        }
                           		add(
                           			current, 
                           			"expressionDeclarations",
                            		lv_expressionDeclarations_24_0, 
                            		"ExpressionDeclaration");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.gemoc.bcool.bcoollib/src-gen/org/gemoc/bcool/parser/antlr/internal/InternalBCOoLLib.g:294:2: (otherlv_25= ',' ( (lv_expressionDeclarations_26_0= ruleExpressionDeclaration ) ) )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==14) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // ../org.gemoc.bcool.bcoollib/src-gen/org/gemoc/bcool/parser/antlr/internal/InternalBCOoLLib.g:294:4: otherlv_25= ',' ( (lv_expressionDeclarations_26_0= ruleExpressionDeclaration ) )
                    	    {
                    	    otherlv_25=(Token)match(input,14,FOLLOW_14_in_ruleBCoolLibrary512); 

                    	        	newLeafNode(otherlv_25, grammarAccess.getBCoolLibraryAccess().getCommaKeyword_7_3_0());
                    	        
                    	    // ../org.gemoc.bcool.bcoollib/src-gen/org/gemoc/bcool/parser/antlr/internal/InternalBCOoLLib.g:298:1: ( (lv_expressionDeclarations_26_0= ruleExpressionDeclaration ) )
                    	    // ../org.gemoc.bcool.bcoollib/src-gen/org/gemoc/bcool/parser/antlr/internal/InternalBCOoLLib.g:299:1: (lv_expressionDeclarations_26_0= ruleExpressionDeclaration )
                    	    {
                    	    // ../org.gemoc.bcool.bcoollib/src-gen/org/gemoc/bcool/parser/antlr/internal/InternalBCOoLLib.g:299:1: (lv_expressionDeclarations_26_0= ruleExpressionDeclaration )
                    	    // ../org.gemoc.bcool.bcoollib/src-gen/org/gemoc/bcool/parser/antlr/internal/InternalBCOoLLib.g:300:3: lv_expressionDeclarations_26_0= ruleExpressionDeclaration
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getBCoolLibraryAccess().getExpressionDeclarationsExpressionDeclarationParserRuleCall_7_3_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleExpressionDeclaration_in_ruleBCoolLibrary533);
                    	    lv_expressionDeclarations_26_0=ruleExpressionDeclaration();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getBCoolLibraryRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"expressionDeclarations",
                    	            		lv_expressionDeclarations_26_0, 
                    	            		"ExpressionDeclaration");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);

                    otherlv_27=(Token)match(input,15,FOLLOW_15_in_ruleBCoolLibrary547); 

                        	newLeafNode(otherlv_27, grammarAccess.getBCoolLibraryAccess().getRightCurlyBracketKeyword_7_4());
                        

                    }
                    break;

            }

            otherlv_28=(Token)match(input,15,FOLLOW_15_in_ruleBCoolLibrary561); 

                	newLeafNode(otherlv_28, grammarAccess.getBCoolLibraryAccess().getRightCurlyBracketKeyword_8());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBCoolLibrary"


    // $ANTLR start "entryRuleExpressionDefinition"
    // ../org.gemoc.bcool.bcoollib/src-gen/org/gemoc/bcool/parser/antlr/internal/InternalBCOoLLib.g:332:1: entryRuleExpressionDefinition returns [EObject current=null] : iv_ruleExpressionDefinition= ruleExpressionDefinition EOF ;
    public final EObject entryRuleExpressionDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpressionDefinition = null;


        try {
            // ../org.gemoc.bcool.bcoollib/src-gen/org/gemoc/bcool/parser/antlr/internal/InternalBCOoLLib.g:333:2: (iv_ruleExpressionDefinition= ruleExpressionDefinition EOF )
            // ../org.gemoc.bcool.bcoollib/src-gen/org/gemoc/bcool/parser/antlr/internal/InternalBCOoLLib.g:334:2: iv_ruleExpressionDefinition= ruleExpressionDefinition EOF
            {
             newCompositeNode(grammarAccess.getExpressionDefinitionRule()); 
            pushFollow(FOLLOW_ruleExpressionDefinition_in_entryRuleExpressionDefinition597);
            iv_ruleExpressionDefinition=ruleExpressionDefinition();

            state._fsp--;

             current =iv_ruleExpressionDefinition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpressionDefinition607); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExpressionDefinition"


    // $ANTLR start "ruleExpressionDefinition"
    // ../org.gemoc.bcool.bcoollib/src-gen/org/gemoc/bcool/parser/antlr/internal/InternalBCOoLLib.g:341:1: ruleExpressionDefinition returns [EObject current=null] : (otherlv_0= 'ExpressionDefinition' otherlv_1= '{' otherlv_2= 'definition' ( (otherlv_3= RULE_ID ) ) otherlv_4= '}' ) ;
    public final EObject ruleExpressionDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;

         enterRule(); 
            
        try {
            // ../org.gemoc.bcool.bcoollib/src-gen/org/gemoc/bcool/parser/antlr/internal/InternalBCOoLLib.g:344:28: ( (otherlv_0= 'ExpressionDefinition' otherlv_1= '{' otherlv_2= 'definition' ( (otherlv_3= RULE_ID ) ) otherlv_4= '}' ) )
            // ../org.gemoc.bcool.bcoollib/src-gen/org/gemoc/bcool/parser/antlr/internal/InternalBCOoLLib.g:345:1: (otherlv_0= 'ExpressionDefinition' otherlv_1= '{' otherlv_2= 'definition' ( (otherlv_3= RULE_ID ) ) otherlv_4= '}' )
            {
            // ../org.gemoc.bcool.bcoollib/src-gen/org/gemoc/bcool/parser/antlr/internal/InternalBCOoLLib.g:345:1: (otherlv_0= 'ExpressionDefinition' otherlv_1= '{' otherlv_2= 'definition' ( (otherlv_3= RULE_ID ) ) otherlv_4= '}' )
            // ../org.gemoc.bcool.bcoollib/src-gen/org/gemoc/bcool/parser/antlr/internal/InternalBCOoLLib.g:345:3: otherlv_0= 'ExpressionDefinition' otherlv_1= '{' otherlv_2= 'definition' ( (otherlv_3= RULE_ID ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_19_in_ruleExpressionDefinition644); 

                	newLeafNode(otherlv_0, grammarAccess.getExpressionDefinitionAccess().getExpressionDefinitionKeyword_0());
                
            otherlv_1=(Token)match(input,12,FOLLOW_12_in_ruleExpressionDefinition656); 

                	newLeafNode(otherlv_1, grammarAccess.getExpressionDefinitionAccess().getLeftCurlyBracketKeyword_1());
                
            otherlv_2=(Token)match(input,20,FOLLOW_20_in_ruleExpressionDefinition668); 

                	newLeafNode(otherlv_2, grammarAccess.getExpressionDefinitionAccess().getDefinitionKeyword_2());
                
            // ../org.gemoc.bcool.bcoollib/src-gen/org/gemoc/bcool/parser/antlr/internal/InternalBCOoLLib.g:357:1: ( (otherlv_3= RULE_ID ) )
            // ../org.gemoc.bcool.bcoollib/src-gen/org/gemoc/bcool/parser/antlr/internal/InternalBCOoLLib.g:358:1: (otherlv_3= RULE_ID )
            {
            // ../org.gemoc.bcool.bcoollib/src-gen/org/gemoc/bcool/parser/antlr/internal/InternalBCOoLLib.g:358:1: (otherlv_3= RULE_ID )
            // ../org.gemoc.bcool.bcoollib/src-gen/org/gemoc/bcool/parser/antlr/internal/InternalBCOoLLib.g:359:3: otherlv_3= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getExpressionDefinitionRule());
            	        }
                    
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleExpressionDefinition688); 

            		newLeafNode(otherlv_3, grammarAccess.getExpressionDefinitionAccess().getDefinitionExpressionDeclarationCrossReference_3_0()); 
            	

            }


            }

            otherlv_4=(Token)match(input,15,FOLLOW_15_in_ruleExpressionDefinition700); 

                	newLeafNode(otherlv_4, grammarAccess.getExpressionDefinitionAccess().getRightCurlyBracketKeyword_4());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExpressionDefinition"


    // $ANTLR start "entryRuleRelationDefinition"
    // ../org.gemoc.bcool.bcoollib/src-gen/org/gemoc/bcool/parser/antlr/internal/InternalBCOoLLib.g:382:1: entryRuleRelationDefinition returns [EObject current=null] : iv_ruleRelationDefinition= ruleRelationDefinition EOF ;
    public final EObject entryRuleRelationDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelationDefinition = null;


        try {
            // ../org.gemoc.bcool.bcoollib/src-gen/org/gemoc/bcool/parser/antlr/internal/InternalBCOoLLib.g:383:2: (iv_ruleRelationDefinition= ruleRelationDefinition EOF )
            // ../org.gemoc.bcool.bcoollib/src-gen/org/gemoc/bcool/parser/antlr/internal/InternalBCOoLLib.g:384:2: iv_ruleRelationDefinition= ruleRelationDefinition EOF
            {
             newCompositeNode(grammarAccess.getRelationDefinitionRule()); 
            pushFollow(FOLLOW_ruleRelationDefinition_in_entryRuleRelationDefinition736);
            iv_ruleRelationDefinition=ruleRelationDefinition();

            state._fsp--;

             current =iv_ruleRelationDefinition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRelationDefinition746); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRelationDefinition"


    // $ANTLR start "ruleRelationDefinition"
    // ../org.gemoc.bcool.bcoollib/src-gen/org/gemoc/bcool/parser/antlr/internal/InternalBCOoLLib.g:391:1: ruleRelationDefinition returns [EObject current=null] : (otherlv_0= 'RelationDefinition' otherlv_1= '{' otherlv_2= 'definition' ( (otherlv_3= RULE_ID ) ) otherlv_4= '}' ) ;
    public final EObject ruleRelationDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;

         enterRule(); 
            
        try {
            // ../org.gemoc.bcool.bcoollib/src-gen/org/gemoc/bcool/parser/antlr/internal/InternalBCOoLLib.g:394:28: ( (otherlv_0= 'RelationDefinition' otherlv_1= '{' otherlv_2= 'definition' ( (otherlv_3= RULE_ID ) ) otherlv_4= '}' ) )
            // ../org.gemoc.bcool.bcoollib/src-gen/org/gemoc/bcool/parser/antlr/internal/InternalBCOoLLib.g:395:1: (otherlv_0= 'RelationDefinition' otherlv_1= '{' otherlv_2= 'definition' ( (otherlv_3= RULE_ID ) ) otherlv_4= '}' )
            {
            // ../org.gemoc.bcool.bcoollib/src-gen/org/gemoc/bcool/parser/antlr/internal/InternalBCOoLLib.g:395:1: (otherlv_0= 'RelationDefinition' otherlv_1= '{' otherlv_2= 'definition' ( (otherlv_3= RULE_ID ) ) otherlv_4= '}' )
            // ../org.gemoc.bcool.bcoollib/src-gen/org/gemoc/bcool/parser/antlr/internal/InternalBCOoLLib.g:395:3: otherlv_0= 'RelationDefinition' otherlv_1= '{' otherlv_2= 'definition' ( (otherlv_3= RULE_ID ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,21,FOLLOW_21_in_ruleRelationDefinition783); 

                	newLeafNode(otherlv_0, grammarAccess.getRelationDefinitionAccess().getRelationDefinitionKeyword_0());
                
            otherlv_1=(Token)match(input,12,FOLLOW_12_in_ruleRelationDefinition795); 

                	newLeafNode(otherlv_1, grammarAccess.getRelationDefinitionAccess().getLeftCurlyBracketKeyword_1());
                
            otherlv_2=(Token)match(input,20,FOLLOW_20_in_ruleRelationDefinition807); 

                	newLeafNode(otherlv_2, grammarAccess.getRelationDefinitionAccess().getDefinitionKeyword_2());
                
            // ../org.gemoc.bcool.bcoollib/src-gen/org/gemoc/bcool/parser/antlr/internal/InternalBCOoLLib.g:407:1: ( (otherlv_3= RULE_ID ) )
            // ../org.gemoc.bcool.bcoollib/src-gen/org/gemoc/bcool/parser/antlr/internal/InternalBCOoLLib.g:408:1: (otherlv_3= RULE_ID )
            {
            // ../org.gemoc.bcool.bcoollib/src-gen/org/gemoc/bcool/parser/antlr/internal/InternalBCOoLLib.g:408:1: (otherlv_3= RULE_ID )
            // ../org.gemoc.bcool.bcoollib/src-gen/org/gemoc/bcool/parser/antlr/internal/InternalBCOoLLib.g:409:3: otherlv_3= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getRelationDefinitionRule());
            	        }
                    
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRelationDefinition827); 

            		newLeafNode(otherlv_3, grammarAccess.getRelationDefinitionAccess().getDefinitionRelationDeclarationCrossReference_3_0()); 
            	

            }


            }

            otherlv_4=(Token)match(input,15,FOLLOW_15_in_ruleRelationDefinition839); 

                	newLeafNode(otherlv_4, grammarAccess.getRelationDefinitionAccess().getRightCurlyBracketKeyword_4());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRelationDefinition"


    // $ANTLR start "entryRuleRelationDeclaration"
    // ../org.gemoc.bcool.bcoollib/src-gen/org/gemoc/bcool/parser/antlr/internal/InternalBCOoLLib.g:432:1: entryRuleRelationDeclaration returns [EObject current=null] : iv_ruleRelationDeclaration= ruleRelationDeclaration EOF ;
    public final EObject entryRuleRelationDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelationDeclaration = null;


        try {
            // ../org.gemoc.bcool.bcoollib/src-gen/org/gemoc/bcool/parser/antlr/internal/InternalBCOoLLib.g:433:2: (iv_ruleRelationDeclaration= ruleRelationDeclaration EOF )
            // ../org.gemoc.bcool.bcoollib/src-gen/org/gemoc/bcool/parser/antlr/internal/InternalBCOoLLib.g:434:2: iv_ruleRelationDeclaration= ruleRelationDeclaration EOF
            {
             newCompositeNode(grammarAccess.getRelationDeclarationRule()); 
            pushFollow(FOLLOW_ruleRelationDeclaration_in_entryRuleRelationDeclaration875);
            iv_ruleRelationDeclaration=ruleRelationDeclaration();

            state._fsp--;

             current =iv_ruleRelationDeclaration; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRelationDeclaration885); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRelationDeclaration"


    // $ANTLR start "ruleRelationDeclaration"
    // ../org.gemoc.bcool.bcoollib/src-gen/org/gemoc/bcool/parser/antlr/internal/InternalBCOoLLib.g:441:1: ruleRelationDeclaration returns [EObject current=null] : ( () otherlv_1= 'RelationDeclaration' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'formalParameters' otherlv_5= '{' ( (otherlv_6= RULE_ID ) ) (otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) )* otherlv_9= '}' )? otherlv_10= '}' ) ;
    public final EObject ruleRelationDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;

         enterRule(); 
            
        try {
            // ../org.gemoc.bcool.bcoollib/src-gen/org/gemoc/bcool/parser/antlr/internal/InternalBCOoLLib.g:444:28: ( ( () otherlv_1= 'RelationDeclaration' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'formalParameters' otherlv_5= '{' ( (otherlv_6= RULE_ID ) ) (otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) )* otherlv_9= '}' )? otherlv_10= '}' ) )
            // ../org.gemoc.bcool.bcoollib/src-gen/org/gemoc/bcool/parser/antlr/internal/InternalBCOoLLib.g:445:1: ( () otherlv_1= 'RelationDeclaration' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'formalParameters' otherlv_5= '{' ( (otherlv_6= RULE_ID ) ) (otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) )* otherlv_9= '}' )? otherlv_10= '}' )
            {
            // ../org.gemoc.bcool.bcoollib/src-gen/org/gemoc/bcool/parser/antlr/internal/InternalBCOoLLib.g:445:1: ( () otherlv_1= 'RelationDeclaration' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'formalParameters' otherlv_5= '{' ( (otherlv_6= RULE_ID ) ) (otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) )* otherlv_9= '}' )? otherlv_10= '}' )
            // ../org.gemoc.bcool.bcoollib/src-gen/org/gemoc/bcool/parser/antlr/internal/InternalBCOoLLib.g:445:2: () otherlv_1= 'RelationDeclaration' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'formalParameters' otherlv_5= '{' ( (otherlv_6= RULE_ID ) ) (otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) )* otherlv_9= '}' )? otherlv_10= '}'
            {
            // ../org.gemoc.bcool.bcoollib/src-gen/org/gemoc/bcool/parser/antlr/internal/InternalBCOoLLib.g:445:2: ()
            // ../org.gemoc.bcool.bcoollib/src-gen/org/gemoc/bcool/parser/antlr/internal/InternalBCOoLLib.g:446:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getRelationDeclarationAccess().getRelationDeclarationAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,22,FOLLOW_22_in_ruleRelationDeclaration931); 

                	newLeafNode(otherlv_1, grammarAccess.getRelationDeclarationAccess().getRelationDeclarationKeyword_1());
                
            // ../org.gemoc.bcool.bcoollib/src-gen/org/gemoc/bcool/parser/antlr/internal/InternalBCOoLLib.g:455:1: ( (lv_name_2_0= RULE_ID ) )
            // ../org.gemoc.bcool.bcoollib/src-gen/org/gemoc/bcool/parser/antlr/internal/InternalBCOoLLib.g:456:1: (lv_name_2_0= RULE_ID )
            {
            // ../org.gemoc.bcool.bcoollib/src-gen/org/gemoc/bcool/parser/antlr/internal/InternalBCOoLLib.g:456:1: (lv_name_2_0= RULE_ID )
            // ../org.gemoc.bcool.bcoollib/src-gen/org/gemoc/bcool/parser/antlr/internal/InternalBCOoLLib.g:457:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRelationDeclaration948); 

            			newLeafNode(lv_name_2_0, grammarAccess.getRelationDeclarationAccess().getNameIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getRelationDeclarationRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"ID");
            	    

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_12_in_ruleRelationDeclaration965); 

                	newLeafNode(otherlv_3, grammarAccess.getRelationDeclarationAccess().getLeftCurlyBracketKeyword_3());
                
            // ../org.gemoc.bcool.bcoollib/src-gen/org/gemoc/bcool/parser/antlr/internal/InternalBCOoLLib.g:477:1: (otherlv_4= 'formalParameters' otherlv_5= '{' ( (otherlv_6= RULE_ID ) ) (otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) )* otherlv_9= '}' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==23) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../org.gemoc.bcool.bcoollib/src-gen/org/gemoc/bcool/parser/antlr/internal/InternalBCOoLLib.g:477:3: otherlv_4= 'formalParameters' otherlv_5= '{' ( (otherlv_6= RULE_ID ) ) (otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) )* otherlv_9= '}'
                    {
                    otherlv_4=(Token)match(input,23,FOLLOW_23_in_ruleRelationDeclaration978); 

                        	newLeafNode(otherlv_4, grammarAccess.getRelationDeclarationAccess().getFormalParametersKeyword_4_0());
                        
                    otherlv_5=(Token)match(input,12,FOLLOW_12_in_ruleRelationDeclaration990); 

                        	newLeafNode(otherlv_5, grammarAccess.getRelationDeclarationAccess().getLeftCurlyBracketKeyword_4_1());
                        
                    // ../org.gemoc.bcool.bcoollib/src-gen/org/gemoc/bcool/parser/antlr/internal/InternalBCOoLLib.g:485:1: ( (otherlv_6= RULE_ID ) )
                    // ../org.gemoc.bcool.bcoollib/src-gen/org/gemoc/bcool/parser/antlr/internal/InternalBCOoLLib.g:486:1: (otherlv_6= RULE_ID )
                    {
                    // ../org.gemoc.bcool.bcoollib/src-gen/org/gemoc/bcool/parser/antlr/internal/InternalBCOoLLib.g:486:1: (otherlv_6= RULE_ID )
                    // ../org.gemoc.bcool.bcoollib/src-gen/org/gemoc/bcool/parser/antlr/internal/InternalBCOoLLib.g:487:3: otherlv_6= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getRelationDeclarationRule());
                    	        }
                            
                    otherlv_6=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRelationDeclaration1010); 

                    		newLeafNode(otherlv_6, grammarAccess.getRelationDeclarationAccess().getFormalParametersEObjectCrossReference_4_2_0()); 
                    	

                    }


                    }

                    // ../org.gemoc.bcool.bcoollib/src-gen/org/gemoc/bcool/parser/antlr/internal/InternalBCOoLLib.g:498:2: (otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==14) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // ../org.gemoc.bcool.bcoollib/src-gen/org/gemoc/bcool/parser/antlr/internal/InternalBCOoLLib.g:498:4: otherlv_7= ',' ( (otherlv_8= RULE_ID ) )
                    	    {
                    	    otherlv_7=(Token)match(input,14,FOLLOW_14_in_ruleRelationDeclaration1023); 

                    	        	newLeafNode(otherlv_7, grammarAccess.getRelationDeclarationAccess().getCommaKeyword_4_3_0());
                    	        
                    	    // ../org.gemoc.bcool.bcoollib/src-gen/org/gemoc/bcool/parser/antlr/internal/InternalBCOoLLib.g:502:1: ( (otherlv_8= RULE_ID ) )
                    	    // ../org.gemoc.bcool.bcoollib/src-gen/org/gemoc/bcool/parser/antlr/internal/InternalBCOoLLib.g:503:1: (otherlv_8= RULE_ID )
                    	    {
                    	    // ../org.gemoc.bcool.bcoollib/src-gen/org/gemoc/bcool/parser/antlr/internal/InternalBCOoLLib.g:503:1: (otherlv_8= RULE_ID )
                    	    // ../org.gemoc.bcool.bcoollib/src-gen/org/gemoc/bcool/parser/antlr/internal/InternalBCOoLLib.g:504:3: otherlv_8= RULE_ID
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getRelationDeclarationRule());
                    	    	        }
                    	            
                    	    otherlv_8=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRelationDeclaration1043); 

                    	    		newLeafNode(otherlv_8, grammarAccess.getRelationDeclarationAccess().getFormalParametersEObjectCrossReference_4_3_1_0()); 
                    	    	

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,15,FOLLOW_15_in_ruleRelationDeclaration1057); 

                        	newLeafNode(otherlv_9, grammarAccess.getRelationDeclarationAccess().getRightCurlyBracketKeyword_4_4());
                        

                    }
                    break;

            }

            otherlv_10=(Token)match(input,15,FOLLOW_15_in_ruleRelationDeclaration1071); 

                	newLeafNode(otherlv_10, grammarAccess.getRelationDeclarationAccess().getRightCurlyBracketKeyword_5());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRelationDeclaration"


    // $ANTLR start "entryRuleExpressionDeclaration"
    // ../org.gemoc.bcool.bcoollib/src-gen/org/gemoc/bcool/parser/antlr/internal/InternalBCOoLLib.g:531:1: entryRuleExpressionDeclaration returns [EObject current=null] : iv_ruleExpressionDeclaration= ruleExpressionDeclaration EOF ;
    public final EObject entryRuleExpressionDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpressionDeclaration = null;


        try {
            // ../org.gemoc.bcool.bcoollib/src-gen/org/gemoc/bcool/parser/antlr/internal/InternalBCOoLLib.g:532:2: (iv_ruleExpressionDeclaration= ruleExpressionDeclaration EOF )
            // ../org.gemoc.bcool.bcoollib/src-gen/org/gemoc/bcool/parser/antlr/internal/InternalBCOoLLib.g:533:2: iv_ruleExpressionDeclaration= ruleExpressionDeclaration EOF
            {
             newCompositeNode(grammarAccess.getExpressionDeclarationRule()); 
            pushFollow(FOLLOW_ruleExpressionDeclaration_in_entryRuleExpressionDeclaration1107);
            iv_ruleExpressionDeclaration=ruleExpressionDeclaration();

            state._fsp--;

             current =iv_ruleExpressionDeclaration; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpressionDeclaration1117); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExpressionDeclaration"


    // $ANTLR start "ruleExpressionDeclaration"
    // ../org.gemoc.bcool.bcoollib/src-gen/org/gemoc/bcool/parser/antlr/internal/InternalBCOoLLib.g:540:1: ruleExpressionDeclaration returns [EObject current=null] : ( () otherlv_1= 'ExpressionDeclaration' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'formalParameters' otherlv_5= '{' ( (otherlv_6= RULE_ID ) ) (otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) )* otherlv_9= '}' )? otherlv_10= '}' ) ;
    public final EObject ruleExpressionDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;

         enterRule(); 
            
        try {
            // ../org.gemoc.bcool.bcoollib/src-gen/org/gemoc/bcool/parser/antlr/internal/InternalBCOoLLib.g:543:28: ( ( () otherlv_1= 'ExpressionDeclaration' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'formalParameters' otherlv_5= '{' ( (otherlv_6= RULE_ID ) ) (otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) )* otherlv_9= '}' )? otherlv_10= '}' ) )
            // ../org.gemoc.bcool.bcoollib/src-gen/org/gemoc/bcool/parser/antlr/internal/InternalBCOoLLib.g:544:1: ( () otherlv_1= 'ExpressionDeclaration' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'formalParameters' otherlv_5= '{' ( (otherlv_6= RULE_ID ) ) (otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) )* otherlv_9= '}' )? otherlv_10= '}' )
            {
            // ../org.gemoc.bcool.bcoollib/src-gen/org/gemoc/bcool/parser/antlr/internal/InternalBCOoLLib.g:544:1: ( () otherlv_1= 'ExpressionDeclaration' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'formalParameters' otherlv_5= '{' ( (otherlv_6= RULE_ID ) ) (otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) )* otherlv_9= '}' )? otherlv_10= '}' )
            // ../org.gemoc.bcool.bcoollib/src-gen/org/gemoc/bcool/parser/antlr/internal/InternalBCOoLLib.g:544:2: () otherlv_1= 'ExpressionDeclaration' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'formalParameters' otherlv_5= '{' ( (otherlv_6= RULE_ID ) ) (otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) )* otherlv_9= '}' )? otherlv_10= '}'
            {
            // ../org.gemoc.bcool.bcoollib/src-gen/org/gemoc/bcool/parser/antlr/internal/InternalBCOoLLib.g:544:2: ()
            // ../org.gemoc.bcool.bcoollib/src-gen/org/gemoc/bcool/parser/antlr/internal/InternalBCOoLLib.g:545:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getExpressionDeclarationAccess().getExpressionDeclarationAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,24,FOLLOW_24_in_ruleExpressionDeclaration1163); 

                	newLeafNode(otherlv_1, grammarAccess.getExpressionDeclarationAccess().getExpressionDeclarationKeyword_1());
                
            // ../org.gemoc.bcool.bcoollib/src-gen/org/gemoc/bcool/parser/antlr/internal/InternalBCOoLLib.g:554:1: ( (lv_name_2_0= RULE_ID ) )
            // ../org.gemoc.bcool.bcoollib/src-gen/org/gemoc/bcool/parser/antlr/internal/InternalBCOoLLib.g:555:1: (lv_name_2_0= RULE_ID )
            {
            // ../org.gemoc.bcool.bcoollib/src-gen/org/gemoc/bcool/parser/antlr/internal/InternalBCOoLLib.g:555:1: (lv_name_2_0= RULE_ID )
            // ../org.gemoc.bcool.bcoollib/src-gen/org/gemoc/bcool/parser/antlr/internal/InternalBCOoLLib.g:556:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleExpressionDeclaration1180); 

            			newLeafNode(lv_name_2_0, grammarAccess.getExpressionDeclarationAccess().getNameIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getExpressionDeclarationRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"ID");
            	    

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_12_in_ruleExpressionDeclaration1197); 

                	newLeafNode(otherlv_3, grammarAccess.getExpressionDeclarationAccess().getLeftCurlyBracketKeyword_3());
                
            // ../org.gemoc.bcool.bcoollib/src-gen/org/gemoc/bcool/parser/antlr/internal/InternalBCOoLLib.g:576:1: (otherlv_4= 'formalParameters' otherlv_5= '{' ( (otherlv_6= RULE_ID ) ) (otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) )* otherlv_9= '}' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==23) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../org.gemoc.bcool.bcoollib/src-gen/org/gemoc/bcool/parser/antlr/internal/InternalBCOoLLib.g:576:3: otherlv_4= 'formalParameters' otherlv_5= '{' ( (otherlv_6= RULE_ID ) ) (otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) )* otherlv_9= '}'
                    {
                    otherlv_4=(Token)match(input,23,FOLLOW_23_in_ruleExpressionDeclaration1210); 

                        	newLeafNode(otherlv_4, grammarAccess.getExpressionDeclarationAccess().getFormalParametersKeyword_4_0());
                        
                    otherlv_5=(Token)match(input,12,FOLLOW_12_in_ruleExpressionDeclaration1222); 

                        	newLeafNode(otherlv_5, grammarAccess.getExpressionDeclarationAccess().getLeftCurlyBracketKeyword_4_1());
                        
                    // ../org.gemoc.bcool.bcoollib/src-gen/org/gemoc/bcool/parser/antlr/internal/InternalBCOoLLib.g:584:1: ( (otherlv_6= RULE_ID ) )
                    // ../org.gemoc.bcool.bcoollib/src-gen/org/gemoc/bcool/parser/antlr/internal/InternalBCOoLLib.g:585:1: (otherlv_6= RULE_ID )
                    {
                    // ../org.gemoc.bcool.bcoollib/src-gen/org/gemoc/bcool/parser/antlr/internal/InternalBCOoLLib.g:585:1: (otherlv_6= RULE_ID )
                    // ../org.gemoc.bcool.bcoollib/src-gen/org/gemoc/bcool/parser/antlr/internal/InternalBCOoLLib.g:586:3: otherlv_6= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getExpressionDeclarationRule());
                    	        }
                            
                    otherlv_6=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleExpressionDeclaration1242); 

                    		newLeafNode(otherlv_6, grammarAccess.getExpressionDeclarationAccess().getFormalParametersEObjectCrossReference_4_2_0()); 
                    	

                    }


                    }

                    // ../org.gemoc.bcool.bcoollib/src-gen/org/gemoc/bcool/parser/antlr/internal/InternalBCOoLLib.g:597:2: (otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==14) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // ../org.gemoc.bcool.bcoollib/src-gen/org/gemoc/bcool/parser/antlr/internal/InternalBCOoLLib.g:597:4: otherlv_7= ',' ( (otherlv_8= RULE_ID ) )
                    	    {
                    	    otherlv_7=(Token)match(input,14,FOLLOW_14_in_ruleExpressionDeclaration1255); 

                    	        	newLeafNode(otherlv_7, grammarAccess.getExpressionDeclarationAccess().getCommaKeyword_4_3_0());
                    	        
                    	    // ../org.gemoc.bcool.bcoollib/src-gen/org/gemoc/bcool/parser/antlr/internal/InternalBCOoLLib.g:601:1: ( (otherlv_8= RULE_ID ) )
                    	    // ../org.gemoc.bcool.bcoollib/src-gen/org/gemoc/bcool/parser/antlr/internal/InternalBCOoLLib.g:602:1: (otherlv_8= RULE_ID )
                    	    {
                    	    // ../org.gemoc.bcool.bcoollib/src-gen/org/gemoc/bcool/parser/antlr/internal/InternalBCOoLLib.g:602:1: (otherlv_8= RULE_ID )
                    	    // ../org.gemoc.bcool.bcoollib/src-gen/org/gemoc/bcool/parser/antlr/internal/InternalBCOoLLib.g:603:3: otherlv_8= RULE_ID
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getExpressionDeclarationRule());
                    	    	        }
                    	            
                    	    otherlv_8=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleExpressionDeclaration1275); 

                    	    		newLeafNode(otherlv_8, grammarAccess.getExpressionDeclarationAccess().getFormalParametersEObjectCrossReference_4_3_1_0()); 
                    	    	

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop11;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,15,FOLLOW_15_in_ruleExpressionDeclaration1289); 

                        	newLeafNode(otherlv_9, grammarAccess.getExpressionDeclarationAccess().getRightCurlyBracketKeyword_4_4());
                        

                    }
                    break;

            }

            otherlv_10=(Token)match(input,15,FOLLOW_15_in_ruleExpressionDeclaration1303); 

                	newLeafNode(otherlv_10, grammarAccess.getExpressionDeclarationAccess().getRightCurlyBracketKeyword_5());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExpressionDeclaration"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleBCoolLibrary_in_entryRuleBCoolLibrary75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBCoolLibrary85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleBCoolLibrary131 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleBCoolLibrary148 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleBCoolLibrary165 = new BitSet(new long[]{0x000000000007A000L});
    public static final BitSet FOLLOW_13_in_ruleBCoolLibrary178 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleBCoolLibrary190 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_ruleExpressionDefinition_in_ruleBCoolLibrary211 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_14_in_ruleBCoolLibrary224 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_ruleExpressionDefinition_in_ruleBCoolLibrary245 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_15_in_ruleBCoolLibrary259 = new BitSet(new long[]{0x0000000000078000L});
    public static final BitSet FOLLOW_16_in_ruleBCoolLibrary274 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleBCoolLibrary286 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_ruleRelationDefinition_in_ruleBCoolLibrary307 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_14_in_ruleBCoolLibrary320 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_ruleRelationDefinition_in_ruleBCoolLibrary341 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_15_in_ruleBCoolLibrary355 = new BitSet(new long[]{0x0000000000068000L});
    public static final BitSet FOLLOW_17_in_ruleBCoolLibrary370 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleBCoolLibrary382 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_ruleRelationDeclaration_in_ruleBCoolLibrary403 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_14_in_ruleBCoolLibrary416 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_ruleRelationDeclaration_in_ruleBCoolLibrary437 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_15_in_ruleBCoolLibrary451 = new BitSet(new long[]{0x0000000000048000L});
    public static final BitSet FOLLOW_18_in_ruleBCoolLibrary466 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleBCoolLibrary478 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_ruleExpressionDeclaration_in_ruleBCoolLibrary499 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_14_in_ruleBCoolLibrary512 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_ruleExpressionDeclaration_in_ruleBCoolLibrary533 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_15_in_ruleBCoolLibrary547 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleBCoolLibrary561 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpressionDefinition_in_entryRuleExpressionDefinition597 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpressionDefinition607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleExpressionDefinition644 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleExpressionDefinition656 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleExpressionDefinition668 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleExpressionDefinition688 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleExpressionDefinition700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRelationDefinition_in_entryRuleRelationDefinition736 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRelationDefinition746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleRelationDefinition783 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleRelationDefinition795 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleRelationDefinition807 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRelationDefinition827 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleRelationDefinition839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRelationDeclaration_in_entryRuleRelationDeclaration875 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRelationDeclaration885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleRelationDeclaration931 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRelationDeclaration948 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleRelationDeclaration965 = new BitSet(new long[]{0x0000000000808000L});
    public static final BitSet FOLLOW_23_in_ruleRelationDeclaration978 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleRelationDeclaration990 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRelationDeclaration1010 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_14_in_ruleRelationDeclaration1023 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRelationDeclaration1043 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_15_in_ruleRelationDeclaration1057 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleRelationDeclaration1071 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpressionDeclaration_in_entryRuleExpressionDeclaration1107 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpressionDeclaration1117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleExpressionDeclaration1163 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleExpressionDeclaration1180 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleExpressionDeclaration1197 = new BitSet(new long[]{0x0000000000808000L});
    public static final BitSet FOLLOW_23_in_ruleExpressionDeclaration1210 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleExpressionDeclaration1222 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleExpressionDeclaration1242 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_14_in_ruleExpressionDeclaration1255 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleExpressionDeclaration1275 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_15_in_ruleExpressionDeclaration1289 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleExpressionDeclaration1303 = new BitSet(new long[]{0x0000000000000002L});

}