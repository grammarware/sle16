package org.modelexecution.operationalsemantics.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.modelexecution.operationalsemantics.services.ActivityDiagramInputGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalActivityDiagramInputParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_STRING", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "','", "'='", "'true'", "'false'", "'-'"
    };
    public static final int RULE_ID=6;
    public static final int RULE_WS=9;
    public static final int RULE_STRING=5;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__15=15;
    public static final int RULE_INT=4;
    public static final int T__11=11;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;

    // delegates
    // delegators


        public InternalActivityDiagramInputParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalActivityDiagramInputParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalActivityDiagramInputParser.tokenNames; }
    public String getGrammarFileName() { return "../org.modelexecution.operationalsemantics.ad.input.grammar/src-gen/org/modelexecution/operationalsemantics/parser/antlr/internal/InternalActivityDiagramInput.g"; }



     	private ActivityDiagramInputGrammarAccess grammarAccess;
     	
        public InternalActivityDiagramInputParser(TokenStream input, ActivityDiagramInputGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Input";	
       	}
       	
       	@Override
       	protected ActivityDiagramInputGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleInput"
    // ../org.modelexecution.operationalsemantics.ad.input.grammar/src-gen/org/modelexecution/operationalsemantics/parser/antlr/internal/InternalActivityDiagramInput.g:67:1: entryRuleInput returns [EObject current=null] : iv_ruleInput= ruleInput EOF ;
    public final EObject entryRuleInput() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInput = null;


        try {
            // ../org.modelexecution.operationalsemantics.ad.input.grammar/src-gen/org/modelexecution/operationalsemantics/parser/antlr/internal/InternalActivityDiagramInput.g:68:2: (iv_ruleInput= ruleInput EOF )
            // ../org.modelexecution.operationalsemantics.ad.input.grammar/src-gen/org/modelexecution/operationalsemantics/parser/antlr/internal/InternalActivityDiagramInput.g:69:2: iv_ruleInput= ruleInput EOF
            {
             newCompositeNode(grammarAccess.getInputRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleInput_in_entryRuleInput75);
            iv_ruleInput=ruleInput();

            state._fsp--;

             current =iv_ruleInput; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleInput85); 

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
    // $ANTLR end "entryRuleInput"


    // $ANTLR start "ruleInput"
    // ../org.modelexecution.operationalsemantics.ad.input.grammar/src-gen/org/modelexecution/operationalsemantics/parser/antlr/internal/InternalActivityDiagramInput.g:76:1: ruleInput returns [EObject current=null] : ( () ( (lv_inputValues_1_0= ruleInputValue ) ) (otherlv_2= ',' ( (lv_inputValues_3_0= ruleInputValue ) ) )* ) ;
    public final EObject ruleInput() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_inputValues_1_0 = null;

        EObject lv_inputValues_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.modelexecution.operationalsemantics.ad.input.grammar/src-gen/org/modelexecution/operationalsemantics/parser/antlr/internal/InternalActivityDiagramInput.g:79:28: ( ( () ( (lv_inputValues_1_0= ruleInputValue ) ) (otherlv_2= ',' ( (lv_inputValues_3_0= ruleInputValue ) ) )* ) )
            // ../org.modelexecution.operationalsemantics.ad.input.grammar/src-gen/org/modelexecution/operationalsemantics/parser/antlr/internal/InternalActivityDiagramInput.g:80:1: ( () ( (lv_inputValues_1_0= ruleInputValue ) ) (otherlv_2= ',' ( (lv_inputValues_3_0= ruleInputValue ) ) )* )
            {
            // ../org.modelexecution.operationalsemantics.ad.input.grammar/src-gen/org/modelexecution/operationalsemantics/parser/antlr/internal/InternalActivityDiagramInput.g:80:1: ( () ( (lv_inputValues_1_0= ruleInputValue ) ) (otherlv_2= ',' ( (lv_inputValues_3_0= ruleInputValue ) ) )* )
            // ../org.modelexecution.operationalsemantics.ad.input.grammar/src-gen/org/modelexecution/operationalsemantics/parser/antlr/internal/InternalActivityDiagramInput.g:80:2: () ( (lv_inputValues_1_0= ruleInputValue ) ) (otherlv_2= ',' ( (lv_inputValues_3_0= ruleInputValue ) ) )*
            {
            // ../org.modelexecution.operationalsemantics.ad.input.grammar/src-gen/org/modelexecution/operationalsemantics/parser/antlr/internal/InternalActivityDiagramInput.g:80:2: ()
            // ../org.modelexecution.operationalsemantics.ad.input.grammar/src-gen/org/modelexecution/operationalsemantics/parser/antlr/internal/InternalActivityDiagramInput.g:81:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getInputAccess().getInputAction_0(),
                        current);
                

            }

            // ../org.modelexecution.operationalsemantics.ad.input.grammar/src-gen/org/modelexecution/operationalsemantics/parser/antlr/internal/InternalActivityDiagramInput.g:86:2: ( (lv_inputValues_1_0= ruleInputValue ) )
            // ../org.modelexecution.operationalsemantics.ad.input.grammar/src-gen/org/modelexecution/operationalsemantics/parser/antlr/internal/InternalActivityDiagramInput.g:87:1: (lv_inputValues_1_0= ruleInputValue )
            {
            // ../org.modelexecution.operationalsemantics.ad.input.grammar/src-gen/org/modelexecution/operationalsemantics/parser/antlr/internal/InternalActivityDiagramInput.g:87:1: (lv_inputValues_1_0= ruleInputValue )
            // ../org.modelexecution.operationalsemantics.ad.input.grammar/src-gen/org/modelexecution/operationalsemantics/parser/antlr/internal/InternalActivityDiagramInput.g:88:3: lv_inputValues_1_0= ruleInputValue
            {
             
            	        newCompositeNode(grammarAccess.getInputAccess().getInputValuesInputValueParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleInputValue_in_ruleInput140);
            lv_inputValues_1_0=ruleInputValue();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getInputRule());
            	        }
                   		add(
                   			current, 
                   			"inputValues",
                    		lv_inputValues_1_0, 
                    		"InputValue");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.modelexecution.operationalsemantics.ad.input.grammar/src-gen/org/modelexecution/operationalsemantics/parser/antlr/internal/InternalActivityDiagramInput.g:104:2: (otherlv_2= ',' ( (lv_inputValues_3_0= ruleInputValue ) ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.modelexecution.operationalsemantics.ad.input.grammar/src-gen/org/modelexecution/operationalsemantics/parser/antlr/internal/InternalActivityDiagramInput.g:104:4: otherlv_2= ',' ( (lv_inputValues_3_0= ruleInputValue ) )
            	    {
            	    otherlv_2=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleInput153); 

            	        	newLeafNode(otherlv_2, grammarAccess.getInputAccess().getCommaKeyword_2_0());
            	        
            	    // ../org.modelexecution.operationalsemantics.ad.input.grammar/src-gen/org/modelexecution/operationalsemantics/parser/antlr/internal/InternalActivityDiagramInput.g:108:1: ( (lv_inputValues_3_0= ruleInputValue ) )
            	    // ../org.modelexecution.operationalsemantics.ad.input.grammar/src-gen/org/modelexecution/operationalsemantics/parser/antlr/internal/InternalActivityDiagramInput.g:109:1: (lv_inputValues_3_0= ruleInputValue )
            	    {
            	    // ../org.modelexecution.operationalsemantics.ad.input.grammar/src-gen/org/modelexecution/operationalsemantics/parser/antlr/internal/InternalActivityDiagramInput.g:109:1: (lv_inputValues_3_0= ruleInputValue )
            	    // ../org.modelexecution.operationalsemantics.ad.input.grammar/src-gen/org/modelexecution/operationalsemantics/parser/antlr/internal/InternalActivityDiagramInput.g:110:3: lv_inputValues_3_0= ruleInputValue
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getInputAccess().getInputValuesInputValueParserRuleCall_2_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleInputValue_in_ruleInput174);
            	    lv_inputValues_3_0=ruleInputValue();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getInputRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"inputValues",
            	            		lv_inputValues_3_0, 
            	            		"InputValue");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


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
    // $ANTLR end "ruleInput"


    // $ANTLR start "entryRuleInputValue"
    // ../org.modelexecution.operationalsemantics.ad.input.grammar/src-gen/org/modelexecution/operationalsemantics/parser/antlr/internal/InternalActivityDiagramInput.g:134:1: entryRuleInputValue returns [EObject current=null] : iv_ruleInputValue= ruleInputValue EOF ;
    public final EObject entryRuleInputValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInputValue = null;


        try {
            // ../org.modelexecution.operationalsemantics.ad.input.grammar/src-gen/org/modelexecution/operationalsemantics/parser/antlr/internal/InternalActivityDiagramInput.g:135:2: (iv_ruleInputValue= ruleInputValue EOF )
            // ../org.modelexecution.operationalsemantics.ad.input.grammar/src-gen/org/modelexecution/operationalsemantics/parser/antlr/internal/InternalActivityDiagramInput.g:136:2: iv_ruleInputValue= ruleInputValue EOF
            {
             newCompositeNode(grammarAccess.getInputValueRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleInputValue_in_entryRuleInputValue212);
            iv_ruleInputValue=ruleInputValue();

            state._fsp--;

             current =iv_ruleInputValue; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleInputValue222); 

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
    // $ANTLR end "entryRuleInputValue"


    // $ANTLR start "ruleInputValue"
    // ../org.modelexecution.operationalsemantics.ad.input.grammar/src-gen/org/modelexecution/operationalsemantics/parser/antlr/internal/InternalActivityDiagramInput.g:143:1: ruleInputValue returns [EObject current=null] : ( ( ( ruleEString ) ) otherlv_1= '=' ( (lv_value_2_0= ruleValue ) ) ) ;
    public final EObject ruleInputValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_value_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.modelexecution.operationalsemantics.ad.input.grammar/src-gen/org/modelexecution/operationalsemantics/parser/antlr/internal/InternalActivityDiagramInput.g:146:28: ( ( ( ( ruleEString ) ) otherlv_1= '=' ( (lv_value_2_0= ruleValue ) ) ) )
            // ../org.modelexecution.operationalsemantics.ad.input.grammar/src-gen/org/modelexecution/operationalsemantics/parser/antlr/internal/InternalActivityDiagramInput.g:147:1: ( ( ( ruleEString ) ) otherlv_1= '=' ( (lv_value_2_0= ruleValue ) ) )
            {
            // ../org.modelexecution.operationalsemantics.ad.input.grammar/src-gen/org/modelexecution/operationalsemantics/parser/antlr/internal/InternalActivityDiagramInput.g:147:1: ( ( ( ruleEString ) ) otherlv_1= '=' ( (lv_value_2_0= ruleValue ) ) )
            // ../org.modelexecution.operationalsemantics.ad.input.grammar/src-gen/org/modelexecution/operationalsemantics/parser/antlr/internal/InternalActivityDiagramInput.g:147:2: ( ( ruleEString ) ) otherlv_1= '=' ( (lv_value_2_0= ruleValue ) )
            {
            // ../org.modelexecution.operationalsemantics.ad.input.grammar/src-gen/org/modelexecution/operationalsemantics/parser/antlr/internal/InternalActivityDiagramInput.g:147:2: ( ( ruleEString ) )
            // ../org.modelexecution.operationalsemantics.ad.input.grammar/src-gen/org/modelexecution/operationalsemantics/parser/antlr/internal/InternalActivityDiagramInput.g:148:1: ( ruleEString )
            {
            // ../org.modelexecution.operationalsemantics.ad.input.grammar/src-gen/org/modelexecution/operationalsemantics/parser/antlr/internal/InternalActivityDiagramInput.g:148:1: ( ruleEString )
            // ../org.modelexecution.operationalsemantics.ad.input.grammar/src-gen/org/modelexecution/operationalsemantics/parser/antlr/internal/InternalActivityDiagramInput.g:149:3: ruleEString
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getInputValueRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getInputValueAccess().getVariableVariableCrossReference_0_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleInputValue270);
            ruleEString();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleInputValue282); 

                	newLeafNode(otherlv_1, grammarAccess.getInputValueAccess().getEqualsSignKeyword_1());
                
            // ../org.modelexecution.operationalsemantics.ad.input.grammar/src-gen/org/modelexecution/operationalsemantics/parser/antlr/internal/InternalActivityDiagramInput.g:166:1: ( (lv_value_2_0= ruleValue ) )
            // ../org.modelexecution.operationalsemantics.ad.input.grammar/src-gen/org/modelexecution/operationalsemantics/parser/antlr/internal/InternalActivityDiagramInput.g:167:1: (lv_value_2_0= ruleValue )
            {
            // ../org.modelexecution.operationalsemantics.ad.input.grammar/src-gen/org/modelexecution/operationalsemantics/parser/antlr/internal/InternalActivityDiagramInput.g:167:1: (lv_value_2_0= ruleValue )
            // ../org.modelexecution.operationalsemantics.ad.input.grammar/src-gen/org/modelexecution/operationalsemantics/parser/antlr/internal/InternalActivityDiagramInput.g:168:3: lv_value_2_0= ruleValue
            {
             
            	        newCompositeNode(grammarAccess.getInputValueAccess().getValueValueParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleValue_in_ruleInputValue303);
            lv_value_2_0=ruleValue();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getInputValueRule());
            	        }
                   		set(
                   			current, 
                   			"value",
                    		lv_value_2_0, 
                    		"Value");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


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
    // $ANTLR end "ruleInputValue"


    // $ANTLR start "entryRuleValue"
    // ../org.modelexecution.operationalsemantics.ad.input.grammar/src-gen/org/modelexecution/operationalsemantics/parser/antlr/internal/InternalActivityDiagramInput.g:192:1: entryRuleValue returns [EObject current=null] : iv_ruleValue= ruleValue EOF ;
    public final EObject entryRuleValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValue = null;


        try {
            // ../org.modelexecution.operationalsemantics.ad.input.grammar/src-gen/org/modelexecution/operationalsemantics/parser/antlr/internal/InternalActivityDiagramInput.g:193:2: (iv_ruleValue= ruleValue EOF )
            // ../org.modelexecution.operationalsemantics.ad.input.grammar/src-gen/org/modelexecution/operationalsemantics/parser/antlr/internal/InternalActivityDiagramInput.g:194:2: iv_ruleValue= ruleValue EOF
            {
             newCompositeNode(grammarAccess.getValueRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleValue_in_entryRuleValue339);
            iv_ruleValue=ruleValue();

            state._fsp--;

             current =iv_ruleValue; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleValue349); 

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
    // $ANTLR end "entryRuleValue"


    // $ANTLR start "ruleValue"
    // ../org.modelexecution.operationalsemantics.ad.input.grammar/src-gen/org/modelexecution/operationalsemantics/parser/antlr/internal/InternalActivityDiagramInput.g:201:1: ruleValue returns [EObject current=null] : (this_BooleanValue_0= ruleBooleanValue | this_IntegerValue_1= ruleIntegerValue ) ;
    public final EObject ruleValue() throws RecognitionException {
        EObject current = null;

        EObject this_BooleanValue_0 = null;

        EObject this_IntegerValue_1 = null;


         enterRule(); 
            
        try {
            // ../org.modelexecution.operationalsemantics.ad.input.grammar/src-gen/org/modelexecution/operationalsemantics/parser/antlr/internal/InternalActivityDiagramInput.g:204:28: ( (this_BooleanValue_0= ruleBooleanValue | this_IntegerValue_1= ruleIntegerValue ) )
            // ../org.modelexecution.operationalsemantics.ad.input.grammar/src-gen/org/modelexecution/operationalsemantics/parser/antlr/internal/InternalActivityDiagramInput.g:205:1: (this_BooleanValue_0= ruleBooleanValue | this_IntegerValue_1= ruleIntegerValue )
            {
            // ../org.modelexecution.operationalsemantics.ad.input.grammar/src-gen/org/modelexecution/operationalsemantics/parser/antlr/internal/InternalActivityDiagramInput.g:205:1: (this_BooleanValue_0= ruleBooleanValue | this_IntegerValue_1= ruleIntegerValue )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( ((LA2_0>=13 && LA2_0<=14)) ) {
                alt2=1;
            }
            else if ( (LA2_0==RULE_INT||LA2_0==15) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../org.modelexecution.operationalsemantics.ad.input.grammar/src-gen/org/modelexecution/operationalsemantics/parser/antlr/internal/InternalActivityDiagramInput.g:206:5: this_BooleanValue_0= ruleBooleanValue
                    {
                     
                            newCompositeNode(grammarAccess.getValueAccess().getBooleanValueParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleBooleanValue_in_ruleValue396);
                    this_BooleanValue_0=ruleBooleanValue();

                    state._fsp--;

                     
                            current = this_BooleanValue_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.modelexecution.operationalsemantics.ad.input.grammar/src-gen/org/modelexecution/operationalsemantics/parser/antlr/internal/InternalActivityDiagramInput.g:216:5: this_IntegerValue_1= ruleIntegerValue
                    {
                     
                            newCompositeNode(grammarAccess.getValueAccess().getIntegerValueParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleIntegerValue_in_ruleValue423);
                    this_IntegerValue_1=ruleIntegerValue();

                    state._fsp--;

                     
                            current = this_IntegerValue_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

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
    // $ANTLR end "ruleValue"


    // $ANTLR start "entryRuleBooleanValue"
    // ../org.modelexecution.operationalsemantics.ad.input.grammar/src-gen/org/modelexecution/operationalsemantics/parser/antlr/internal/InternalActivityDiagramInput.g:232:1: entryRuleBooleanValue returns [EObject current=null] : iv_ruleBooleanValue= ruleBooleanValue EOF ;
    public final EObject entryRuleBooleanValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanValue = null;


        try {
            // ../org.modelexecution.operationalsemantics.ad.input.grammar/src-gen/org/modelexecution/operationalsemantics/parser/antlr/internal/InternalActivityDiagramInput.g:233:2: (iv_ruleBooleanValue= ruleBooleanValue EOF )
            // ../org.modelexecution.operationalsemantics.ad.input.grammar/src-gen/org/modelexecution/operationalsemantics/parser/antlr/internal/InternalActivityDiagramInput.g:234:2: iv_ruleBooleanValue= ruleBooleanValue EOF
            {
             newCompositeNode(grammarAccess.getBooleanValueRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleBooleanValue_in_entryRuleBooleanValue458);
            iv_ruleBooleanValue=ruleBooleanValue();

            state._fsp--;

             current =iv_ruleBooleanValue; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleBooleanValue468); 

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
    // $ANTLR end "entryRuleBooleanValue"


    // $ANTLR start "ruleBooleanValue"
    // ../org.modelexecution.operationalsemantics.ad.input.grammar/src-gen/org/modelexecution/operationalsemantics/parser/antlr/internal/InternalActivityDiagramInput.g:241:1: ruleBooleanValue returns [EObject current=null] : ( (lv_value_0_0= ruleEBoolean ) ) ;
    public final EObject ruleBooleanValue() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.modelexecution.operationalsemantics.ad.input.grammar/src-gen/org/modelexecution/operationalsemantics/parser/antlr/internal/InternalActivityDiagramInput.g:244:28: ( ( (lv_value_0_0= ruleEBoolean ) ) )
            // ../org.modelexecution.operationalsemantics.ad.input.grammar/src-gen/org/modelexecution/operationalsemantics/parser/antlr/internal/InternalActivityDiagramInput.g:245:1: ( (lv_value_0_0= ruleEBoolean ) )
            {
            // ../org.modelexecution.operationalsemantics.ad.input.grammar/src-gen/org/modelexecution/operationalsemantics/parser/antlr/internal/InternalActivityDiagramInput.g:245:1: ( (lv_value_0_0= ruleEBoolean ) )
            // ../org.modelexecution.operationalsemantics.ad.input.grammar/src-gen/org/modelexecution/operationalsemantics/parser/antlr/internal/InternalActivityDiagramInput.g:246:1: (lv_value_0_0= ruleEBoolean )
            {
            // ../org.modelexecution.operationalsemantics.ad.input.grammar/src-gen/org/modelexecution/operationalsemantics/parser/antlr/internal/InternalActivityDiagramInput.g:246:1: (lv_value_0_0= ruleEBoolean )
            // ../org.modelexecution.operationalsemantics.ad.input.grammar/src-gen/org/modelexecution/operationalsemantics/parser/antlr/internal/InternalActivityDiagramInput.g:247:3: lv_value_0_0= ruleEBoolean
            {
             
            	        newCompositeNode(grammarAccess.getBooleanValueAccess().getValueEBooleanParserRuleCall_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEBoolean_in_ruleBooleanValue513);
            lv_value_0_0=ruleEBoolean();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getBooleanValueRule());
            	        }
                   		set(
                   			current, 
                   			"value",
                    		lv_value_0_0, 
                    		"EBoolean");
            	        afterParserOrEnumRuleCall();
            	    

            }


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
    // $ANTLR end "ruleBooleanValue"


    // $ANTLR start "entryRuleIntegerValue"
    // ../org.modelexecution.operationalsemantics.ad.input.grammar/src-gen/org/modelexecution/operationalsemantics/parser/antlr/internal/InternalActivityDiagramInput.g:271:1: entryRuleIntegerValue returns [EObject current=null] : iv_ruleIntegerValue= ruleIntegerValue EOF ;
    public final EObject entryRuleIntegerValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntegerValue = null;


        try {
            // ../org.modelexecution.operationalsemantics.ad.input.grammar/src-gen/org/modelexecution/operationalsemantics/parser/antlr/internal/InternalActivityDiagramInput.g:272:2: (iv_ruleIntegerValue= ruleIntegerValue EOF )
            // ../org.modelexecution.operationalsemantics.ad.input.grammar/src-gen/org/modelexecution/operationalsemantics/parser/antlr/internal/InternalActivityDiagramInput.g:273:2: iv_ruleIntegerValue= ruleIntegerValue EOF
            {
             newCompositeNode(grammarAccess.getIntegerValueRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleIntegerValue_in_entryRuleIntegerValue548);
            iv_ruleIntegerValue=ruleIntegerValue();

            state._fsp--;

             current =iv_ruleIntegerValue; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleIntegerValue558); 

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
    // $ANTLR end "entryRuleIntegerValue"


    // $ANTLR start "ruleIntegerValue"
    // ../org.modelexecution.operationalsemantics.ad.input.grammar/src-gen/org/modelexecution/operationalsemantics/parser/antlr/internal/InternalActivityDiagramInput.g:280:1: ruleIntegerValue returns [EObject current=null] : ( (lv_value_0_0= ruleEInt ) ) ;
    public final EObject ruleIntegerValue() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.modelexecution.operationalsemantics.ad.input.grammar/src-gen/org/modelexecution/operationalsemantics/parser/antlr/internal/InternalActivityDiagramInput.g:283:28: ( ( (lv_value_0_0= ruleEInt ) ) )
            // ../org.modelexecution.operationalsemantics.ad.input.grammar/src-gen/org/modelexecution/operationalsemantics/parser/antlr/internal/InternalActivityDiagramInput.g:284:1: ( (lv_value_0_0= ruleEInt ) )
            {
            // ../org.modelexecution.operationalsemantics.ad.input.grammar/src-gen/org/modelexecution/operationalsemantics/parser/antlr/internal/InternalActivityDiagramInput.g:284:1: ( (lv_value_0_0= ruleEInt ) )
            // ../org.modelexecution.operationalsemantics.ad.input.grammar/src-gen/org/modelexecution/operationalsemantics/parser/antlr/internal/InternalActivityDiagramInput.g:285:1: (lv_value_0_0= ruleEInt )
            {
            // ../org.modelexecution.operationalsemantics.ad.input.grammar/src-gen/org/modelexecution/operationalsemantics/parser/antlr/internal/InternalActivityDiagramInput.g:285:1: (lv_value_0_0= ruleEInt )
            // ../org.modelexecution.operationalsemantics.ad.input.grammar/src-gen/org/modelexecution/operationalsemantics/parser/antlr/internal/InternalActivityDiagramInput.g:286:3: lv_value_0_0= ruleEInt
            {
             
            	        newCompositeNode(grammarAccess.getIntegerValueAccess().getValueEIntParserRuleCall_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleIntegerValue603);
            lv_value_0_0=ruleEInt();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getIntegerValueRule());
            	        }
                   		set(
                   			current, 
                   			"value",
                    		lv_value_0_0, 
                    		"EInt");
            	        afterParserOrEnumRuleCall();
            	    

            }


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
    // $ANTLR end "ruleIntegerValue"


    // $ANTLR start "entryRuleEBoolean"
    // ../org.modelexecution.operationalsemantics.ad.input.grammar/src-gen/org/modelexecution/operationalsemantics/parser/antlr/internal/InternalActivityDiagramInput.g:310:1: entryRuleEBoolean returns [String current=null] : iv_ruleEBoolean= ruleEBoolean EOF ;
    public final String entryRuleEBoolean() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEBoolean = null;


        try {
            // ../org.modelexecution.operationalsemantics.ad.input.grammar/src-gen/org/modelexecution/operationalsemantics/parser/antlr/internal/InternalActivityDiagramInput.g:311:2: (iv_ruleEBoolean= ruleEBoolean EOF )
            // ../org.modelexecution.operationalsemantics.ad.input.grammar/src-gen/org/modelexecution/operationalsemantics/parser/antlr/internal/InternalActivityDiagramInput.g:312:2: iv_ruleEBoolean= ruleEBoolean EOF
            {
             newCompositeNode(grammarAccess.getEBooleanRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEBoolean_in_entryRuleEBoolean639);
            iv_ruleEBoolean=ruleEBoolean();

            state._fsp--;

             current =iv_ruleEBoolean.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEBoolean650); 

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
    // $ANTLR end "entryRuleEBoolean"


    // $ANTLR start "ruleEBoolean"
    // ../org.modelexecution.operationalsemantics.ad.input.grammar/src-gen/org/modelexecution/operationalsemantics/parser/antlr/internal/InternalActivityDiagramInput.g:319:1: ruleEBoolean returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'true' | kw= 'false' ) ;
    public final AntlrDatatypeRuleToken ruleEBoolean() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.modelexecution.operationalsemantics.ad.input.grammar/src-gen/org/modelexecution/operationalsemantics/parser/antlr/internal/InternalActivityDiagramInput.g:322:28: ( (kw= 'true' | kw= 'false' ) )
            // ../org.modelexecution.operationalsemantics.ad.input.grammar/src-gen/org/modelexecution/operationalsemantics/parser/antlr/internal/InternalActivityDiagramInput.g:323:1: (kw= 'true' | kw= 'false' )
            {
            // ../org.modelexecution.operationalsemantics.ad.input.grammar/src-gen/org/modelexecution/operationalsemantics/parser/antlr/internal/InternalActivityDiagramInput.g:323:1: (kw= 'true' | kw= 'false' )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==13) ) {
                alt3=1;
            }
            else if ( (LA3_0==14) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../org.modelexecution.operationalsemantics.ad.input.grammar/src-gen/org/modelexecution/operationalsemantics/parser/antlr/internal/InternalActivityDiagramInput.g:324:2: kw= 'true'
                    {
                    kw=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleEBoolean688); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getEBooleanAccess().getTrueKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../org.modelexecution.operationalsemantics.ad.input.grammar/src-gen/org/modelexecution/operationalsemantics/parser/antlr/internal/InternalActivityDiagramInput.g:331:2: kw= 'false'
                    {
                    kw=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleEBoolean707); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getEBooleanAccess().getFalseKeyword_1()); 
                        

                    }
                    break;

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
    // $ANTLR end "ruleEBoolean"


    // $ANTLR start "entryRuleEInt"
    // ../org.modelexecution.operationalsemantics.ad.input.grammar/src-gen/org/modelexecution/operationalsemantics/parser/antlr/internal/InternalActivityDiagramInput.g:344:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // ../org.modelexecution.operationalsemantics.ad.input.grammar/src-gen/org/modelexecution/operationalsemantics/parser/antlr/internal/InternalActivityDiagramInput.g:345:2: (iv_ruleEInt= ruleEInt EOF )
            // ../org.modelexecution.operationalsemantics.ad.input.grammar/src-gen/org/modelexecution/operationalsemantics/parser/antlr/internal/InternalActivityDiagramInput.g:346:2: iv_ruleEInt= ruleEInt EOF
            {
             newCompositeNode(grammarAccess.getEIntRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_entryRuleEInt748);
            iv_ruleEInt=ruleEInt();

            state._fsp--;

             current =iv_ruleEInt.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEInt759); 

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
    // $ANTLR end "entryRuleEInt"


    // $ANTLR start "ruleEInt"
    // ../org.modelexecution.operationalsemantics.ad.input.grammar/src-gen/org/modelexecution/operationalsemantics/parser/antlr/internal/InternalActivityDiagramInput.g:353:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;

         enterRule(); 
            
        try {
            // ../org.modelexecution.operationalsemantics.ad.input.grammar/src-gen/org/modelexecution/operationalsemantics/parser/antlr/internal/InternalActivityDiagramInput.g:356:28: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // ../org.modelexecution.operationalsemantics.ad.input.grammar/src-gen/org/modelexecution/operationalsemantics/parser/antlr/internal/InternalActivityDiagramInput.g:357:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // ../org.modelexecution.operationalsemantics.ad.input.grammar/src-gen/org/modelexecution/operationalsemantics/parser/antlr/internal/InternalActivityDiagramInput.g:357:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            // ../org.modelexecution.operationalsemantics.ad.input.grammar/src-gen/org/modelexecution/operationalsemantics/parser/antlr/internal/InternalActivityDiagramInput.g:357:2: (kw= '-' )? this_INT_1= RULE_INT
            {
            // ../org.modelexecution.operationalsemantics.ad.input.grammar/src-gen/org/modelexecution/operationalsemantics/parser/antlr/internal/InternalActivityDiagramInput.g:357:2: (kw= '-' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==15) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../org.modelexecution.operationalsemantics.ad.input.grammar/src-gen/org/modelexecution/operationalsemantics/parser/antlr/internal/InternalActivityDiagramInput.g:358:2: kw= '-'
                    {
                    kw=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleEInt798); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
                        

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleEInt815); 

            		current.merge(this_INT_1);
                
             
                newLeafNode(this_INT_1, grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 
                

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
    // $ANTLR end "ruleEInt"


    // $ANTLR start "entryRuleEString"
    // ../org.modelexecution.operationalsemantics.ad.input.grammar/src-gen/org/modelexecution/operationalsemantics/parser/antlr/internal/InternalActivityDiagramInput.g:378:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // ../org.modelexecution.operationalsemantics.ad.input.grammar/src-gen/org/modelexecution/operationalsemantics/parser/antlr/internal/InternalActivityDiagramInput.g:379:2: (iv_ruleEString= ruleEString EOF )
            // ../org.modelexecution.operationalsemantics.ad.input.grammar/src-gen/org/modelexecution/operationalsemantics/parser/antlr/internal/InternalActivityDiagramInput.g:380:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_entryRuleEString861);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEString872); 

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
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // ../org.modelexecution.operationalsemantics.ad.input.grammar/src-gen/org/modelexecution/operationalsemantics/parser/antlr/internal/InternalActivityDiagramInput.g:387:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;

         enterRule(); 
            
        try {
            // ../org.modelexecution.operationalsemantics.ad.input.grammar/src-gen/org/modelexecution/operationalsemantics/parser/antlr/internal/InternalActivityDiagramInput.g:390:28: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // ../org.modelexecution.operationalsemantics.ad.input.grammar/src-gen/org/modelexecution/operationalsemantics/parser/antlr/internal/InternalActivityDiagramInput.g:391:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // ../org.modelexecution.operationalsemantics.ad.input.grammar/src-gen/org/modelexecution/operationalsemantics/parser/antlr/internal/InternalActivityDiagramInput.g:391:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_STRING) ) {
                alt5=1;
            }
            else if ( (LA5_0==RULE_ID) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../org.modelexecution.operationalsemantics.ad.input.grammar/src-gen/org/modelexecution/operationalsemantics/parser/antlr/internal/InternalActivityDiagramInput.g:391:6: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleEString912); 

                    		current.merge(this_STRING_0);
                        
                     
                        newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../org.modelexecution.operationalsemantics.ad.input.grammar/src-gen/org/modelexecution/operationalsemantics/parser/antlr/internal/InternalActivityDiagramInput.g:399:10: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleEString938); 

                    		current.merge(this_ID_1);
                        
                     
                        newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                        

                    }
                    break;

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
    // $ANTLR end "ruleEString"

    // Delegated rules


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleInput_in_entryRuleInput75 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleInput85 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInputValue_in_ruleInput140 = new BitSet(new long[]{0x0000000000000802L});
        public static final BitSet FOLLOW_11_in_ruleInput153 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_ruleInputValue_in_ruleInput174 = new BitSet(new long[]{0x0000000000000802L});
        public static final BitSet FOLLOW_ruleInputValue_in_entryRuleInputValue212 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleInputValue222 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_ruleInputValue270 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleInputValue282 = new BitSet(new long[]{0x000000000000E010L});
        public static final BitSet FOLLOW_ruleValue_in_ruleInputValue303 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleValue_in_entryRuleValue339 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleValue349 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBooleanValue_in_ruleValue396 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIntegerValue_in_ruleValue423 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBooleanValue_in_entryRuleBooleanValue458 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleBooleanValue468 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEBoolean_in_ruleBooleanValue513 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIntegerValue_in_entryRuleIntegerValue548 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleIntegerValue558 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleIntegerValue603 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEBoolean_in_entryRuleEBoolean639 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEBoolean650 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_ruleEBoolean688 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_ruleEBoolean707 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_entryRuleEInt748 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEInt759 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_ruleEInt798 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleEInt815 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_entryRuleEString861 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEString872 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleEString912 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleEString938 = new BitSet(new long[]{0x0000000000000002L});
    }


}