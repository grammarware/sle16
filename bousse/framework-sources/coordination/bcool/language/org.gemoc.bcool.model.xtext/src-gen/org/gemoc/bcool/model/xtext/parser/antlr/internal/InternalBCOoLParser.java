package org.gemoc.bcool.model.xtext.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.gemoc.bcool.model.xtext.services.BCOoLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalBCOoLParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_BOOLEAN", "RULE_INT", "RULE_DOUBLE", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Spec'", "'Global Event'", "';'", "'let'", "'Operator'", "'('", "','", "')'", "'MatchingCorrespondance:'", "'end operator;'", "' : '", "'::'", "'when'", "'CoordinationRule:'", "'Local Event'", "'='", "'ImportLib'", "'ImportInterface'", "'as'", "'import'", "'#'", "'if'", "'then'", "'else'", "'endif'", "'.'", "'->'", "'and'", "'xor'", "'or'", "'<>'", "'<'", "'>'", "'<='", "'>='", "'+'", "'-'", "'*'", "'/'", "'not'", "'~'"
    };
    public static final int T__50=50;
    public static final int RULE_BOOLEAN=6;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int RULE_ID=4;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=7;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=9;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=10;
    public static final int T__37=37;
    public static final int RULE_DOUBLE=8;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=11;
    public static final int RULE_ANY_OTHER=12;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalBCOoLParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalBCOoLParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalBCOoLParser.tokenNames; }
    public String getGrammarFileName() { return "../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g"; }



     	private BCOoLGrammarAccess grammarAccess;
     	
        public InternalBCOoLParser(TokenStream input, BCOoLGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "BCoolSpec";	
       	}
       	
       	@Override
       	protected BCOoLGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleBCoolSpec"
    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:68:1: entryRuleBCoolSpec returns [EObject current=null] : iv_ruleBCoolSpec= ruleBCoolSpec EOF ;
    public final EObject entryRuleBCoolSpec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBCoolSpec = null;


        try {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:69:2: (iv_ruleBCoolSpec= ruleBCoolSpec EOF )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:70:2: iv_ruleBCoolSpec= ruleBCoolSpec EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBCoolSpecRule()); 
            }
            pushFollow(FOLLOW_ruleBCoolSpec_in_entryRuleBCoolSpec75);
            iv_ruleBCoolSpec=ruleBCoolSpec();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBCoolSpec; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBCoolSpec85); if (state.failed) return current;

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
    // $ANTLR end "entryRuleBCoolSpec"


    // $ANTLR start "ruleBCoolSpec"
    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:77:1: ruleBCoolSpec returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) )? ( (lv_importsLib_1_0= ruleImportLibRule ) )+ ( (lv_importsBehavioralInterface_2_0= ruleImportInterfaceRule ) )+ ( (lv_bcoolOperators_3_0= ruleBCoolOperatorSpec ) )+ ) ;
    public final EObject ruleBCoolSpec() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        EObject lv_importsLib_1_0 = null;

        EObject lv_importsBehavioralInterface_2_0 = null;

        EObject lv_bcoolOperators_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:80:28: ( ( ( (lv_name_0_0= RULE_ID ) )? ( (lv_importsLib_1_0= ruleImportLibRule ) )+ ( (lv_importsBehavioralInterface_2_0= ruleImportInterfaceRule ) )+ ( (lv_bcoolOperators_3_0= ruleBCoolOperatorSpec ) )+ ) )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:81:1: ( ( (lv_name_0_0= RULE_ID ) )? ( (lv_importsLib_1_0= ruleImportLibRule ) )+ ( (lv_importsBehavioralInterface_2_0= ruleImportInterfaceRule ) )+ ( (lv_bcoolOperators_3_0= ruleBCoolOperatorSpec ) )+ )
            {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:81:1: ( ( (lv_name_0_0= RULE_ID ) )? ( (lv_importsLib_1_0= ruleImportLibRule ) )+ ( (lv_importsBehavioralInterface_2_0= ruleImportInterfaceRule ) )+ ( (lv_bcoolOperators_3_0= ruleBCoolOperatorSpec ) )+ )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:81:2: ( (lv_name_0_0= RULE_ID ) )? ( (lv_importsLib_1_0= ruleImportLibRule ) )+ ( (lv_importsBehavioralInterface_2_0= ruleImportInterfaceRule ) )+ ( (lv_bcoolOperators_3_0= ruleBCoolOperatorSpec ) )+
            {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:81:2: ( (lv_name_0_0= RULE_ID ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_ID) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:82:1: (lv_name_0_0= RULE_ID )
                    {
                    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:82:1: (lv_name_0_0= RULE_ID )
                    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:83:3: lv_name_0_0= RULE_ID
                    {
                    lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleBCoolSpec127); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_name_0_0, grammarAccess.getBCoolSpecAccess().getNameIDTerminalRuleCall_0_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getBCoolSpecRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"name",
                              		lv_name_0_0, 
                              		"ID");
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:99:3: ( (lv_importsLib_1_0= ruleImportLibRule ) )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==29) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:100:1: (lv_importsLib_1_0= ruleImportLibRule )
            	    {
            	    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:100:1: (lv_importsLib_1_0= ruleImportLibRule )
            	    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:101:3: lv_importsLib_1_0= ruleImportLibRule
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getBCoolSpecAccess().getImportsLibImportLibRuleParserRuleCall_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleImportLibRule_in_ruleBCoolSpec154);
            	    lv_importsLib_1_0=ruleImportLibRule();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getBCoolSpecRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"importsLib",
            	              		lv_importsLib_1_0, 
            	              		"ImportLibRule");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);

            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:117:3: ( (lv_importsBehavioralInterface_2_0= ruleImportInterfaceRule ) )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==30) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:118:1: (lv_importsBehavioralInterface_2_0= ruleImportInterfaceRule )
            	    {
            	    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:118:1: (lv_importsBehavioralInterface_2_0= ruleImportInterfaceRule )
            	    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:119:3: lv_importsBehavioralInterface_2_0= ruleImportInterfaceRule
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getBCoolSpecAccess().getImportsBehavioralInterfaceImportInterfaceRuleParserRuleCall_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleImportInterfaceRule_in_ruleBCoolSpec176);
            	    lv_importsBehavioralInterface_2_0=ruleImportInterfaceRule();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getBCoolSpecRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"importsBehavioralInterface",
            	              		lv_importsBehavioralInterface_2_0, 
            	              		"ImportInterfaceRule");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);

            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:135:3: ( (lv_bcoolOperators_3_0= ruleBCoolOperatorSpec ) )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==13) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:136:1: (lv_bcoolOperators_3_0= ruleBCoolOperatorSpec )
            	    {
            	    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:136:1: (lv_bcoolOperators_3_0= ruleBCoolOperatorSpec )
            	    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:137:3: lv_bcoolOperators_3_0= ruleBCoolOperatorSpec
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getBCoolSpecAccess().getBcoolOperatorsBCoolOperatorSpecParserRuleCall_3_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleBCoolOperatorSpec_in_ruleBCoolSpec198);
            	    lv_bcoolOperators_3_0=ruleBCoolOperatorSpec();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getBCoolSpecRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"bcoolOperators",
            	              		lv_bcoolOperators_3_0, 
            	              		"BCoolOperatorSpec");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleBCoolSpec"


    // $ANTLR start "entryRuleBCoolOperatorSpec"
    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:161:1: entryRuleBCoolOperatorSpec returns [EObject current=null] : iv_ruleBCoolOperatorSpec= ruleBCoolOperatorSpec EOF ;
    public final EObject entryRuleBCoolOperatorSpec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBCoolOperatorSpec = null;


        try {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:162:2: (iv_ruleBCoolOperatorSpec= ruleBCoolOperatorSpec EOF )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:163:2: iv_ruleBCoolOperatorSpec= ruleBCoolOperatorSpec EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBCoolOperatorSpecRule()); 
            }
            pushFollow(FOLLOW_ruleBCoolOperatorSpec_in_entryRuleBCoolOperatorSpec235);
            iv_ruleBCoolOperatorSpec=ruleBCoolOperatorSpec();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBCoolOperatorSpec; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBCoolOperatorSpec245); if (state.failed) return current;

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
    // $ANTLR end "entryRuleBCoolOperatorSpec"


    // $ANTLR start "ruleBCoolOperatorSpec"
    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:170:1: ruleBCoolOperatorSpec returns [EObject current=null] : (otherlv_0= 'Spec' ( (lv_name_1_0= RULE_ID ) ) ( (lv_globalEventExpressions_2_0= ruleglobalEventExpressionRule ) )? ( (lv_globalDSEs_3_0= ruleglobalDSEsRule ) )? ( (lv_bcoolCompositionRules_4_0= ruleBCoolCompositionRule ) )+ ) ;
    public final EObject ruleBCoolOperatorSpec() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject lv_globalEventExpressions_2_0 = null;

        EObject lv_globalDSEs_3_0 = null;

        EObject lv_bcoolCompositionRules_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:173:28: ( (otherlv_0= 'Spec' ( (lv_name_1_0= RULE_ID ) ) ( (lv_globalEventExpressions_2_0= ruleglobalEventExpressionRule ) )? ( (lv_globalDSEs_3_0= ruleglobalDSEsRule ) )? ( (lv_bcoolCompositionRules_4_0= ruleBCoolCompositionRule ) )+ ) )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:174:1: (otherlv_0= 'Spec' ( (lv_name_1_0= RULE_ID ) ) ( (lv_globalEventExpressions_2_0= ruleglobalEventExpressionRule ) )? ( (lv_globalDSEs_3_0= ruleglobalDSEsRule ) )? ( (lv_bcoolCompositionRules_4_0= ruleBCoolCompositionRule ) )+ )
            {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:174:1: (otherlv_0= 'Spec' ( (lv_name_1_0= RULE_ID ) ) ( (lv_globalEventExpressions_2_0= ruleglobalEventExpressionRule ) )? ( (lv_globalDSEs_3_0= ruleglobalDSEsRule ) )? ( (lv_bcoolCompositionRules_4_0= ruleBCoolCompositionRule ) )+ )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:174:3: otherlv_0= 'Spec' ( (lv_name_1_0= RULE_ID ) ) ( (lv_globalEventExpressions_2_0= ruleglobalEventExpressionRule ) )? ( (lv_globalDSEs_3_0= ruleglobalDSEsRule ) )? ( (lv_bcoolCompositionRules_4_0= ruleBCoolCompositionRule ) )+
            {
            otherlv_0=(Token)match(input,13,FOLLOW_13_in_ruleBCoolOperatorSpec282); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getBCoolOperatorSpecAccess().getSpecKeyword_0());
                  
            }
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:178:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:179:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:179:1: (lv_name_1_0= RULE_ID )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:180:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleBCoolOperatorSpec299); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_1_0, grammarAccess.getBCoolOperatorSpecAccess().getNameIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getBCoolOperatorSpecRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"ID");
              	    
            }

            }


            }

            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:196:2: ( (lv_globalEventExpressions_2_0= ruleglobalEventExpressionRule ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==16) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:197:1: (lv_globalEventExpressions_2_0= ruleglobalEventExpressionRule )
                    {
                    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:197:1: (lv_globalEventExpressions_2_0= ruleglobalEventExpressionRule )
                    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:198:3: lv_globalEventExpressions_2_0= ruleglobalEventExpressionRule
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getBCoolOperatorSpecAccess().getGlobalEventExpressionsGlobalEventExpressionRuleParserRuleCall_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleglobalEventExpressionRule_in_ruleBCoolOperatorSpec325);
                    lv_globalEventExpressions_2_0=ruleglobalEventExpressionRule();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getBCoolOperatorSpecRule());
                      	        }
                             		add(
                             			current, 
                             			"globalEventExpressions",
                              		lv_globalEventExpressions_2_0, 
                              		"globalEventExpressionRule");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:214:3: ( (lv_globalDSEs_3_0= ruleglobalDSEsRule ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==14) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:215:1: (lv_globalDSEs_3_0= ruleglobalDSEsRule )
                    {
                    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:215:1: (lv_globalDSEs_3_0= ruleglobalDSEsRule )
                    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:216:3: lv_globalDSEs_3_0= ruleglobalDSEsRule
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getBCoolOperatorSpecAccess().getGlobalDSEsGlobalDSEsRuleParserRuleCall_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleglobalDSEsRule_in_ruleBCoolOperatorSpec347);
                    lv_globalDSEs_3_0=ruleglobalDSEsRule();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getBCoolOperatorSpecRule());
                      	        }
                             		add(
                             			current, 
                             			"globalDSEs",
                              		lv_globalDSEs_3_0, 
                              		"globalDSEsRule");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:232:3: ( (lv_bcoolCompositionRules_4_0= ruleBCoolCompositionRule ) )+
            int cnt7=0;
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==17) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:233:1: (lv_bcoolCompositionRules_4_0= ruleBCoolCompositionRule )
            	    {
            	    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:233:1: (lv_bcoolCompositionRules_4_0= ruleBCoolCompositionRule )
            	    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:234:3: lv_bcoolCompositionRules_4_0= ruleBCoolCompositionRule
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getBCoolOperatorSpecAccess().getBcoolCompositionRulesBCoolCompositionRuleParserRuleCall_4_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleBCoolCompositionRule_in_ruleBCoolOperatorSpec369);
            	    lv_bcoolCompositionRules_4_0=ruleBCoolCompositionRule();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getBCoolOperatorSpecRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"bcoolCompositionRules",
            	              		lv_bcoolCompositionRules_4_0, 
            	              		"BCoolCompositionRule");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt7 >= 1 ) break loop7;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(7, input);
                        throw eee;
                }
                cnt7++;
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleBCoolOperatorSpec"


    // $ANTLR start "entryRuleglobalDSEsRule"
    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:258:1: entryRuleglobalDSEsRule returns [EObject current=null] : iv_ruleglobalDSEsRule= ruleglobalDSEsRule EOF ;
    public final EObject entryRuleglobalDSEsRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleglobalDSEsRule = null;


        try {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:259:2: (iv_ruleglobalDSEsRule= ruleglobalDSEsRule EOF )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:260:2: iv_ruleglobalDSEsRule= ruleglobalDSEsRule EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGlobalDSEsRuleRule()); 
            }
            pushFollow(FOLLOW_ruleglobalDSEsRule_in_entryRuleglobalDSEsRule406);
            iv_ruleglobalDSEsRule=ruleglobalDSEsRule();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleglobalDSEsRule; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleglobalDSEsRule416); if (state.failed) return current;

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
    // $ANTLR end "entryRuleglobalDSEsRule"


    // $ANTLR start "ruleglobalDSEsRule"
    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:267:1: ruleglobalDSEsRule returns [EObject current=null] : (otherlv_0= 'Global Event' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' ) ;
    public final EObject ruleglobalDSEsRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:270:28: ( (otherlv_0= 'Global Event' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' ) )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:271:1: (otherlv_0= 'Global Event' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' )
            {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:271:1: (otherlv_0= 'Global Event' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:271:3: otherlv_0= 'Global Event' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,14,FOLLOW_14_in_ruleglobalDSEsRule453); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getGlobalDSEsRuleAccess().getGlobalEventKeyword_0());
                  
            }
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:275:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:276:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:276:1: (lv_name_1_0= RULE_ID )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:277:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleglobalDSEsRule470); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_1_0, grammarAccess.getGlobalDSEsRuleAccess().getNameIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getGlobalDSEsRuleRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"ID");
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,15,FOLLOW_15_in_ruleglobalDSEsRule487); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getGlobalDSEsRuleAccess().getSemicolonKeyword_2());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleglobalDSEsRule"


    // $ANTLR start "entryRuleglobalEventExpressionRule"
    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:305:1: entryRuleglobalEventExpressionRule returns [EObject current=null] : iv_ruleglobalEventExpressionRule= ruleglobalEventExpressionRule EOF ;
    public final EObject entryRuleglobalEventExpressionRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleglobalEventExpressionRule = null;


        try {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:306:2: (iv_ruleglobalEventExpressionRule= ruleglobalEventExpressionRule EOF )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:307:2: iv_ruleglobalEventExpressionRule= ruleglobalEventExpressionRule EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGlobalEventExpressionRuleRule()); 
            }
            pushFollow(FOLLOW_ruleglobalEventExpressionRule_in_entryRuleglobalEventExpressionRule523);
            iv_ruleglobalEventExpressionRule=ruleglobalEventExpressionRule();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleglobalEventExpressionRule; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleglobalEventExpressionRule533); if (state.failed) return current;

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
    // $ANTLR end "entryRuleglobalEventExpressionRule"


    // $ANTLR start "ruleglobalEventExpressionRule"
    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:314:1: ruleglobalEventExpressionRule returns [EObject current=null] : (otherlv_0= 'let' this_EventExpression_1= ruleEventExpression ) ;
    public final EObject ruleglobalEventExpressionRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject this_EventExpression_1 = null;


         enterRule(); 
            
        try {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:317:28: ( (otherlv_0= 'let' this_EventExpression_1= ruleEventExpression ) )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:318:1: (otherlv_0= 'let' this_EventExpression_1= ruleEventExpression )
            {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:318:1: (otherlv_0= 'let' this_EventExpression_1= ruleEventExpression )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:318:3: otherlv_0= 'let' this_EventExpression_1= ruleEventExpression
            {
            otherlv_0=(Token)match(input,16,FOLLOW_16_in_ruleglobalEventExpressionRule570); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getGlobalEventExpressionRuleAccess().getLetKeyword_0());
                  
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getGlobalEventExpressionRuleAccess().getEventExpressionParserRuleCall_1()); 
                  
            }
            pushFollow(FOLLOW_ruleEventExpression_in_ruleglobalEventExpressionRule592);
            this_EventExpression_1=ruleEventExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_EventExpression_1; 
                      afterParserOrEnumRuleCall();
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleglobalEventExpressionRule"


    // $ANTLR start "entryRuleBCoolCompositionRule"
    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:339:1: entryRuleBCoolCompositionRule returns [EObject current=null] : iv_ruleBCoolCompositionRule= ruleBCoolCompositionRule EOF ;
    public final EObject entryRuleBCoolCompositionRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBCoolCompositionRule = null;


        try {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:340:2: (iv_ruleBCoolCompositionRule= ruleBCoolCompositionRule EOF )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:341:2: iv_ruleBCoolCompositionRule= ruleBCoolCompositionRule EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBCoolCompositionRuleRule()); 
            }
            pushFollow(FOLLOW_ruleBCoolCompositionRule_in_entryRuleBCoolCompositionRule627);
            iv_ruleBCoolCompositionRule=ruleBCoolCompositionRule();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBCoolCompositionRule; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBCoolCompositionRule637); if (state.failed) return current;

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
    // $ANTLR end "entryRuleBCoolCompositionRule"


    // $ANTLR start "ruleBCoolCompositionRule"
    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:348:1: ruleBCoolCompositionRule returns [EObject current=null] : (otherlv_0= 'Operator' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_BCoolOperatorArgs_3_0= ruleBCoolOperatorArg ) ) (otherlv_4= ',' ( (lv_BCoolOperatorArgs_5_0= ruleBCoolOperatorArg ) ) )* otherlv_6= ')' otherlv_7= 'MatchingCorrespondance:' ( (lv_matchingRule_8_0= ruleMatchingRule ) ) ( (lv_coordinationRule_9_0= ruleCoordinationRule ) ) otherlv_10= 'end operator;' ) ;
    public final EObject ruleBCoolCompositionRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_10=null;
        EObject lv_BCoolOperatorArgs_3_0 = null;

        EObject lv_BCoolOperatorArgs_5_0 = null;

        EObject lv_matchingRule_8_0 = null;

        EObject lv_coordinationRule_9_0 = null;


         enterRule(); 
            
        try {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:351:28: ( (otherlv_0= 'Operator' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_BCoolOperatorArgs_3_0= ruleBCoolOperatorArg ) ) (otherlv_4= ',' ( (lv_BCoolOperatorArgs_5_0= ruleBCoolOperatorArg ) ) )* otherlv_6= ')' otherlv_7= 'MatchingCorrespondance:' ( (lv_matchingRule_8_0= ruleMatchingRule ) ) ( (lv_coordinationRule_9_0= ruleCoordinationRule ) ) otherlv_10= 'end operator;' ) )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:352:1: (otherlv_0= 'Operator' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_BCoolOperatorArgs_3_0= ruleBCoolOperatorArg ) ) (otherlv_4= ',' ( (lv_BCoolOperatorArgs_5_0= ruleBCoolOperatorArg ) ) )* otherlv_6= ')' otherlv_7= 'MatchingCorrespondance:' ( (lv_matchingRule_8_0= ruleMatchingRule ) ) ( (lv_coordinationRule_9_0= ruleCoordinationRule ) ) otherlv_10= 'end operator;' )
            {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:352:1: (otherlv_0= 'Operator' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_BCoolOperatorArgs_3_0= ruleBCoolOperatorArg ) ) (otherlv_4= ',' ( (lv_BCoolOperatorArgs_5_0= ruleBCoolOperatorArg ) ) )* otherlv_6= ')' otherlv_7= 'MatchingCorrespondance:' ( (lv_matchingRule_8_0= ruleMatchingRule ) ) ( (lv_coordinationRule_9_0= ruleCoordinationRule ) ) otherlv_10= 'end operator;' )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:352:3: otherlv_0= 'Operator' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_BCoolOperatorArgs_3_0= ruleBCoolOperatorArg ) ) (otherlv_4= ',' ( (lv_BCoolOperatorArgs_5_0= ruleBCoolOperatorArg ) ) )* otherlv_6= ')' otherlv_7= 'MatchingCorrespondance:' ( (lv_matchingRule_8_0= ruleMatchingRule ) ) ( (lv_coordinationRule_9_0= ruleCoordinationRule ) ) otherlv_10= 'end operator;'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_17_in_ruleBCoolCompositionRule674); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getBCoolCompositionRuleAccess().getOperatorKeyword_0());
                  
            }
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:356:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:357:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:357:1: (lv_name_1_0= RULE_ID )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:358:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleBCoolCompositionRule691); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_1_0, grammarAccess.getBCoolCompositionRuleAccess().getNameIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getBCoolCompositionRuleRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"ID");
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,18,FOLLOW_18_in_ruleBCoolCompositionRule708); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getBCoolCompositionRuleAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:378:1: ( (lv_BCoolOperatorArgs_3_0= ruleBCoolOperatorArg ) )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:379:1: (lv_BCoolOperatorArgs_3_0= ruleBCoolOperatorArg )
            {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:379:1: (lv_BCoolOperatorArgs_3_0= ruleBCoolOperatorArg )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:380:3: lv_BCoolOperatorArgs_3_0= ruleBCoolOperatorArg
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getBCoolCompositionRuleAccess().getBCoolOperatorArgsBCoolOperatorArgParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleBCoolOperatorArg_in_ruleBCoolCompositionRule729);
            lv_BCoolOperatorArgs_3_0=ruleBCoolOperatorArg();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getBCoolCompositionRuleRule());
              	        }
                     		add(
                     			current, 
                     			"BCoolOperatorArgs",
                      		lv_BCoolOperatorArgs_3_0, 
                      		"BCoolOperatorArg");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:396:2: (otherlv_4= ',' ( (lv_BCoolOperatorArgs_5_0= ruleBCoolOperatorArg ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==19) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:396:4: otherlv_4= ',' ( (lv_BCoolOperatorArgs_5_0= ruleBCoolOperatorArg ) )
            	    {
            	    otherlv_4=(Token)match(input,19,FOLLOW_19_in_ruleBCoolCompositionRule742); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_4, grammarAccess.getBCoolCompositionRuleAccess().getCommaKeyword_4_0());
            	          
            	    }
            	    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:400:1: ( (lv_BCoolOperatorArgs_5_0= ruleBCoolOperatorArg ) )
            	    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:401:1: (lv_BCoolOperatorArgs_5_0= ruleBCoolOperatorArg )
            	    {
            	    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:401:1: (lv_BCoolOperatorArgs_5_0= ruleBCoolOperatorArg )
            	    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:402:3: lv_BCoolOperatorArgs_5_0= ruleBCoolOperatorArg
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getBCoolCompositionRuleAccess().getBCoolOperatorArgsBCoolOperatorArgParserRuleCall_4_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleBCoolOperatorArg_in_ruleBCoolCompositionRule763);
            	    lv_BCoolOperatorArgs_5_0=ruleBCoolOperatorArg();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getBCoolCompositionRuleRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"BCoolOperatorArgs",
            	              		lv_BCoolOperatorArgs_5_0, 
            	              		"BCoolOperatorArg");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            otherlv_6=(Token)match(input,20,FOLLOW_20_in_ruleBCoolCompositionRule777); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getBCoolCompositionRuleAccess().getRightParenthesisKeyword_5());
                  
            }
            otherlv_7=(Token)match(input,21,FOLLOW_21_in_ruleBCoolCompositionRule789); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_7, grammarAccess.getBCoolCompositionRuleAccess().getMatchingCorrespondanceKeyword_6());
                  
            }
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:426:1: ( (lv_matchingRule_8_0= ruleMatchingRule ) )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:427:1: (lv_matchingRule_8_0= ruleMatchingRule )
            {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:427:1: (lv_matchingRule_8_0= ruleMatchingRule )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:428:3: lv_matchingRule_8_0= ruleMatchingRule
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getBCoolCompositionRuleAccess().getMatchingRuleMatchingRuleParserRuleCall_7_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleMatchingRule_in_ruleBCoolCompositionRule810);
            lv_matchingRule_8_0=ruleMatchingRule();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getBCoolCompositionRuleRule());
              	        }
                     		set(
                     			current, 
                     			"matchingRule",
                      		lv_matchingRule_8_0, 
                      		"MatchingRule");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:444:2: ( (lv_coordinationRule_9_0= ruleCoordinationRule ) )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:445:1: (lv_coordinationRule_9_0= ruleCoordinationRule )
            {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:445:1: (lv_coordinationRule_9_0= ruleCoordinationRule )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:446:3: lv_coordinationRule_9_0= ruleCoordinationRule
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getBCoolCompositionRuleAccess().getCoordinationRuleCoordinationRuleParserRuleCall_8_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleCoordinationRule_in_ruleBCoolCompositionRule831);
            lv_coordinationRule_9_0=ruleCoordinationRule();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getBCoolCompositionRuleRule());
              	        }
                     		set(
                     			current, 
                     			"coordinationRule",
                      		lv_coordinationRule_9_0, 
                      		"CoordinationRule");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_10=(Token)match(input,22,FOLLOW_22_in_ruleBCoolCompositionRule843); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_10, grammarAccess.getBCoolCompositionRuleAccess().getEndOperatorKeyword_9());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleBCoolCompositionRule"


    // $ANTLR start "entryRuleBCoolOperatorArg"
    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:474:1: entryRuleBCoolOperatorArg returns [EObject current=null] : iv_ruleBCoolOperatorArg= ruleBCoolOperatorArg EOF ;
    public final EObject entryRuleBCoolOperatorArg() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBCoolOperatorArg = null;


        try {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:475:2: (iv_ruleBCoolOperatorArg= ruleBCoolOperatorArg EOF )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:476:2: iv_ruleBCoolOperatorArg= ruleBCoolOperatorArg EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBCoolOperatorArgRule()); 
            }
            pushFollow(FOLLOW_ruleBCoolOperatorArg_in_entryRuleBCoolOperatorArg879);
            iv_ruleBCoolOperatorArg=ruleBCoolOperatorArg();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBCoolOperatorArg; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBCoolOperatorArg889); if (state.failed) return current;

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
    // $ANTLR end "entryRuleBCoolOperatorArg"


    // $ANTLR start "ruleBCoolOperatorArg"
    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:483:1: ruleBCoolOperatorArg returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ' : ' ( (otherlv_2= RULE_ID ) ) otherlv_3= '::' ( (otherlv_4= RULE_ID ) ) ) ;
    public final EObject ruleBCoolOperatorArg() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;

         enterRule(); 
            
        try {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:486:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ' : ' ( (otherlv_2= RULE_ID ) ) otherlv_3= '::' ( (otherlv_4= RULE_ID ) ) ) )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:487:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ' : ' ( (otherlv_2= RULE_ID ) ) otherlv_3= '::' ( (otherlv_4= RULE_ID ) ) )
            {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:487:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ' : ' ( (otherlv_2= RULE_ID ) ) otherlv_3= '::' ( (otherlv_4= RULE_ID ) ) )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:487:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ' : ' ( (otherlv_2= RULE_ID ) ) otherlv_3= '::' ( (otherlv_4= RULE_ID ) )
            {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:487:2: ( (lv_name_0_0= RULE_ID ) )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:488:1: (lv_name_0_0= RULE_ID )
            {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:488:1: (lv_name_0_0= RULE_ID )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:489:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleBCoolOperatorArg931); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_0_0, grammarAccess.getBCoolOperatorArgAccess().getNameIDTerminalRuleCall_0_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getBCoolOperatorArgRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_0_0, 
                      		"ID");
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,23,FOLLOW_23_in_ruleBCoolOperatorArg948); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getBCoolOperatorArgAccess().getSpaceColonSpaceKeyword_1());
                  
            }
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:509:1: ( (otherlv_2= RULE_ID ) )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:510:1: (otherlv_2= RULE_ID )
            {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:510:1: (otherlv_2= RULE_ID )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:511:3: otherlv_2= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getBCoolOperatorArgRule());
              	        }
                      
            }
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleBCoolOperatorArg968); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_2, grammarAccess.getBCoolOperatorArgAccess().getInterfaceImportInterfaceStatementCrossReference_2_0()); 
              	
            }

            }


            }

            otherlv_3=(Token)match(input,24,FOLLOW_24_in_ruleBCoolOperatorArg980); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getBCoolOperatorArgAccess().getColonColonKeyword_3());
                  
            }
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:526:1: ( (otherlv_4= RULE_ID ) )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:527:1: (otherlv_4= RULE_ID )
            {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:527:1: (otherlv_4= RULE_ID )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:528:3: otherlv_4= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getBCoolOperatorArgRule());
              	        }
                      
            }
            otherlv_4=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleBCoolOperatorArg1000); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_4, grammarAccess.getBCoolOperatorArgAccess().getDSEECLDefCSCrossReference_4_0()); 
              	
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleBCoolOperatorArg"


    // $ANTLR start "entryRuleMatchingRule"
    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:547:1: entryRuleMatchingRule returns [EObject current=null] : iv_ruleMatchingRule= ruleMatchingRule EOF ;
    public final EObject entryRuleMatchingRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMatchingRule = null;


        try {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:548:2: (iv_ruleMatchingRule= ruleMatchingRule EOF )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:549:2: iv_ruleMatchingRule= ruleMatchingRule EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMatchingRuleRule()); 
            }
            pushFollow(FOLLOW_ruleMatchingRule_in_entryRuleMatchingRule1036);
            iv_ruleMatchingRule=ruleMatchingRule();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMatchingRule; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMatchingRule1046); if (state.failed) return current;

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
    // $ANTLR end "entryRuleMatchingRule"


    // $ANTLR start "ruleMatchingRule"
    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:556:1: ruleMatchingRule returns [EObject current=null] : (otherlv_0= 'when' ( (lv_condition_1_0= ruleGExpression ) ) otherlv_2= ';' otherlv_3= 'CoordinationRule:' (otherlv_4= 'Local Event' ( (lv_filterEventExpressions_5_0= ruleEventExpression ) ) otherlv_6= ';' )* ) ;
    public final EObject ruleMatchingRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_condition_1_0 = null;

        EObject lv_filterEventExpressions_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:559:28: ( (otherlv_0= 'when' ( (lv_condition_1_0= ruleGExpression ) ) otherlv_2= ';' otherlv_3= 'CoordinationRule:' (otherlv_4= 'Local Event' ( (lv_filterEventExpressions_5_0= ruleEventExpression ) ) otherlv_6= ';' )* ) )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:560:1: (otherlv_0= 'when' ( (lv_condition_1_0= ruleGExpression ) ) otherlv_2= ';' otherlv_3= 'CoordinationRule:' (otherlv_4= 'Local Event' ( (lv_filterEventExpressions_5_0= ruleEventExpression ) ) otherlv_6= ';' )* )
            {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:560:1: (otherlv_0= 'when' ( (lv_condition_1_0= ruleGExpression ) ) otherlv_2= ';' otherlv_3= 'CoordinationRule:' (otherlv_4= 'Local Event' ( (lv_filterEventExpressions_5_0= ruleEventExpression ) ) otherlv_6= ';' )* )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:560:3: otherlv_0= 'when' ( (lv_condition_1_0= ruleGExpression ) ) otherlv_2= ';' otherlv_3= 'CoordinationRule:' (otherlv_4= 'Local Event' ( (lv_filterEventExpressions_5_0= ruleEventExpression ) ) otherlv_6= ';' )*
            {
            otherlv_0=(Token)match(input,25,FOLLOW_25_in_ruleMatchingRule1083); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getMatchingRuleAccess().getWhenKeyword_0());
                  
            }
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:564:1: ( (lv_condition_1_0= ruleGExpression ) )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:565:1: (lv_condition_1_0= ruleGExpression )
            {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:565:1: (lv_condition_1_0= ruleGExpression )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:566:3: lv_condition_1_0= ruleGExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMatchingRuleAccess().getConditionGExpressionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleGExpression_in_ruleMatchingRule1104);
            lv_condition_1_0=ruleGExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getMatchingRuleRule());
              	        }
                     		set(
                     			current, 
                     			"condition",
                      		lv_condition_1_0, 
                      		"GExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,15,FOLLOW_15_in_ruleMatchingRule1116); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getMatchingRuleAccess().getSemicolonKeyword_2());
                  
            }
            otherlv_3=(Token)match(input,26,FOLLOW_26_in_ruleMatchingRule1128); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getMatchingRuleAccess().getCoordinationRuleKeyword_3());
                  
            }
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:590:1: (otherlv_4= 'Local Event' ( (lv_filterEventExpressions_5_0= ruleEventExpression ) ) otherlv_6= ';' )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==27) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:590:3: otherlv_4= 'Local Event' ( (lv_filterEventExpressions_5_0= ruleEventExpression ) ) otherlv_6= ';'
            	    {
            	    otherlv_4=(Token)match(input,27,FOLLOW_27_in_ruleMatchingRule1141); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_4, grammarAccess.getMatchingRuleAccess().getLocalEventKeyword_4_0());
            	          
            	    }
            	    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:594:1: ( (lv_filterEventExpressions_5_0= ruleEventExpression ) )
            	    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:595:1: (lv_filterEventExpressions_5_0= ruleEventExpression )
            	    {
            	    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:595:1: (lv_filterEventExpressions_5_0= ruleEventExpression )
            	    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:596:3: lv_filterEventExpressions_5_0= ruleEventExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getMatchingRuleAccess().getFilterEventExpressionsEventExpressionParserRuleCall_4_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleEventExpression_in_ruleMatchingRule1162);
            	    lv_filterEventExpressions_5_0=ruleEventExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getMatchingRuleRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"filterEventExpressions",
            	              		lv_filterEventExpressions_5_0, 
            	              		"EventExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    otherlv_6=(Token)match(input,15,FOLLOW_15_in_ruleMatchingRule1174); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_6, grammarAccess.getMatchingRuleAccess().getSemicolonKeyword_4_2());
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleMatchingRule"


    // $ANTLR start "entryRuleEventExpression"
    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:624:1: entryRuleEventExpression returns [EObject current=null] : iv_ruleEventExpression= ruleEventExpression EOF ;
    public final EObject entryRuleEventExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEventExpression = null;


        try {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:625:2: (iv_ruleEventExpression= ruleEventExpression EOF )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:626:2: iv_ruleEventExpression= ruleEventExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEventExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleEventExpression_in_entryRuleEventExpression1212);
            iv_ruleEventExpression=ruleEventExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEventExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEventExpression1222); if (state.failed) return current;

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
    // $ANTLR end "entryRuleEventExpression"


    // $ANTLR start "ruleEventExpression"
    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:633:1: ruleEventExpression returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( ( ruleQualifiedName ) ) otherlv_3= '(' ( ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )* )? otherlv_7= ')' ) ;
    public final EObject ruleEventExpression() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;

         enterRule(); 
            
        try {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:636:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( ( ruleQualifiedName ) ) otherlv_3= '(' ( ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )* )? otherlv_7= ')' ) )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:637:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( ( ruleQualifiedName ) ) otherlv_3= '(' ( ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )* )? otherlv_7= ')' )
            {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:637:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( ( ruleQualifiedName ) ) otherlv_3= '(' ( ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )* )? otherlv_7= ')' )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:637:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( ( ruleQualifiedName ) ) otherlv_3= '(' ( ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )* )? otherlv_7= ')'
            {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:637:2: ( (lv_name_0_0= RULE_ID ) )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:638:1: (lv_name_0_0= RULE_ID )
            {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:638:1: (lv_name_0_0= RULE_ID )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:639:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEventExpression1264); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_0_0, grammarAccess.getEventExpressionAccess().getNameIDTerminalRuleCall_0_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getEventExpressionRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_0_0, 
                      		"ID");
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,28,FOLLOW_28_in_ruleEventExpression1281); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getEventExpressionAccess().getEqualsSignKeyword_1());
                  
            }
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:659:1: ( ( ruleQualifiedName ) )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:660:1: ( ruleQualifiedName )
            {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:660:1: ( ruleQualifiedName )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:661:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getEventExpressionRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getEventExpressionAccess().getDeclarationExpressionDeclarationCrossReference_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleEventExpression1304);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,18,FOLLOW_18_in_ruleEventExpression1316); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getEventExpressionAccess().getLeftParenthesisKeyword_3());
                  
            }
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:678:1: ( ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )* )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_ID) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:678:2: ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )*
                    {
                    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:678:2: ( (otherlv_4= RULE_ID ) )
                    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:679:1: (otherlv_4= RULE_ID )
                    {
                    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:679:1: (otherlv_4= RULE_ID )
                    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:680:3: otherlv_4= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getEventExpressionRule());
                      	        }
                              
                    }
                    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEventExpression1337); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		newLeafNode(otherlv_4, grammarAccess.getEventExpressionAccess().getActualParametersEObjectCrossReference_4_0_0()); 
                      	
                    }

                    }


                    }

                    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:691:2: (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0==19) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:691:4: otherlv_5= ',' ( (otherlv_6= RULE_ID ) )
                    	    {
                    	    otherlv_5=(Token)match(input,19,FOLLOW_19_in_ruleEventExpression1350); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_5, grammarAccess.getEventExpressionAccess().getCommaKeyword_4_1_0());
                    	          
                    	    }
                    	    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:695:1: ( (otherlv_6= RULE_ID ) )
                    	    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:696:1: (otherlv_6= RULE_ID )
                    	    {
                    	    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:696:1: (otherlv_6= RULE_ID )
                    	    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:697:3: otherlv_6= RULE_ID
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      			if (current==null) {
                    	      	            current = createModelElement(grammarAccess.getEventExpressionRule());
                    	      	        }
                    	              
                    	    }
                    	    otherlv_6=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEventExpression1370); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      		newLeafNode(otherlv_6, grammarAccess.getEventExpressionAccess().getActualParametersEObjectCrossReference_4_1_1_0()); 
                    	      	
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop10;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_7=(Token)match(input,20,FOLLOW_20_in_ruleEventExpression1386); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_7, grammarAccess.getEventExpressionAccess().getRightParenthesisKeyword_5());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleEventExpression"


    // $ANTLR start "entryRuleCoordinationRule"
    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:720:1: entryRuleCoordinationRule returns [EObject current=null] : iv_ruleCoordinationRule= ruleCoordinationRule EOF ;
    public final EObject entryRuleCoordinationRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCoordinationRule = null;


        try {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:721:2: (iv_ruleCoordinationRule= ruleCoordinationRule EOF )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:722:2: iv_ruleCoordinationRule= ruleCoordinationRule EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCoordinationRuleRule()); 
            }
            pushFollow(FOLLOW_ruleCoordinationRule_in_entryRuleCoordinationRule1422);
            iv_ruleCoordinationRule=ruleCoordinationRule();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCoordinationRule; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCoordinationRule1432); if (state.failed) return current;

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
    // $ANTLR end "entryRuleCoordinationRule"


    // $ANTLR start "ruleCoordinationRule"
    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:729:1: ruleCoordinationRule returns [EObject current=null] : ( (lv_eventRelations_0_0= ruleEventRelation ) ) ;
    public final EObject ruleCoordinationRule() throws RecognitionException {
        EObject current = null;

        EObject lv_eventRelations_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:732:28: ( ( (lv_eventRelations_0_0= ruleEventRelation ) ) )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:733:1: ( (lv_eventRelations_0_0= ruleEventRelation ) )
            {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:733:1: ( (lv_eventRelations_0_0= ruleEventRelation ) )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:734:1: (lv_eventRelations_0_0= ruleEventRelation )
            {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:734:1: (lv_eventRelations_0_0= ruleEventRelation )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:735:3: lv_eventRelations_0_0= ruleEventRelation
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getCoordinationRuleAccess().getEventRelationsEventRelationParserRuleCall_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleEventRelation_in_ruleCoordinationRule1477);
            lv_eventRelations_0_0=ruleEventRelation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getCoordinationRuleRule());
              	        }
                     		set(
                     			current, 
                     			"eventRelations",
                      		lv_eventRelations_0_0, 
                      		"EventRelation");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleCoordinationRule"


    // $ANTLR start "entryRuleEventRelation"
    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:759:1: entryRuleEventRelation returns [EObject current=null] : iv_ruleEventRelation= ruleEventRelation EOF ;
    public final EObject entryRuleEventRelation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEventRelation = null;


        try {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:760:2: (iv_ruleEventRelation= ruleEventRelation EOF )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:761:2: iv_ruleEventRelation= ruleEventRelation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEventRelationRule()); 
            }
            pushFollow(FOLLOW_ruleEventRelation_in_entryRuleEventRelation1512);
            iv_ruleEventRelation=ruleEventRelation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEventRelation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEventRelation1522); if (state.failed) return current;

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
    // $ANTLR end "entryRuleEventRelation"


    // $ANTLR start "ruleEventRelation"
    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:768:1: ruleEventRelation returns [EObject current=null] : ( () ( ( ruleQualifiedName ) ) otherlv_2= '(' ( ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* )? otherlv_6= ')' ) ;
    public final EObject ruleEventRelation() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;

         enterRule(); 
            
        try {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:771:28: ( ( () ( ( ruleQualifiedName ) ) otherlv_2= '(' ( ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* )? otherlv_6= ')' ) )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:772:1: ( () ( ( ruleQualifiedName ) ) otherlv_2= '(' ( ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* )? otherlv_6= ')' )
            {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:772:1: ( () ( ( ruleQualifiedName ) ) otherlv_2= '(' ( ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* )? otherlv_6= ')' )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:772:2: () ( ( ruleQualifiedName ) ) otherlv_2= '(' ( ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* )? otherlv_6= ')'
            {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:772:2: ()
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:773:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getEventRelationAccess().getEventRelationAction_0(),
                          current);
                  
            }

            }

            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:778:2: ( ( ruleQualifiedName ) )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:779:1: ( ruleQualifiedName )
            {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:779:1: ( ruleQualifiedName )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:780:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getEventRelationRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getEventRelationAccess().getDeclarationRelationDeclarationCrossReference_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleEventRelation1579);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,18,FOLLOW_18_in_ruleEventRelation1591); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getEventRelationAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:797:1: ( ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_ID) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:797:2: ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )*
                    {
                    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:797:2: ( (otherlv_3= RULE_ID ) )
                    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:798:1: (otherlv_3= RULE_ID )
                    {
                    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:798:1: (otherlv_3= RULE_ID )
                    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:799:3: otherlv_3= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getEventRelationRule());
                      	        }
                              
                    }
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEventRelation1612); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		newLeafNode(otherlv_3, grammarAccess.getEventRelationAccess().getActualParametersECLDefCSCrossReference_3_0_0()); 
                      	
                    }

                    }


                    }

                    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:810:2: (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==19) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:810:4: otherlv_4= ',' ( (otherlv_5= RULE_ID ) )
                    	    {
                    	    otherlv_4=(Token)match(input,19,FOLLOW_19_in_ruleEventRelation1625); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_4, grammarAccess.getEventRelationAccess().getCommaKeyword_3_1_0());
                    	          
                    	    }
                    	    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:814:1: ( (otherlv_5= RULE_ID ) )
                    	    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:815:1: (otherlv_5= RULE_ID )
                    	    {
                    	    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:815:1: (otherlv_5= RULE_ID )
                    	    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:816:3: otherlv_5= RULE_ID
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      			if (current==null) {
                    	      	            current = createModelElement(grammarAccess.getEventRelationRule());
                    	      	        }
                    	              
                    	    }
                    	    otherlv_5=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEventRelation1645); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      		newLeafNode(otherlv_5, grammarAccess.getEventRelationAccess().getActualParametersECLDefCSCrossReference_3_1_1_0()); 
                    	      	
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop12;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_6=(Token)match(input,20,FOLLOW_20_in_ruleEventRelation1661); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getEventRelationAccess().getRightParenthesisKeyword_4());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleEventRelation"


    // $ANTLR start "entryRuleImportLibRule"
    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:839:1: entryRuleImportLibRule returns [EObject current=null] : iv_ruleImportLibRule= ruleImportLibRule EOF ;
    public final EObject entryRuleImportLibRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImportLibRule = null;


        try {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:840:2: (iv_ruleImportLibRule= ruleImportLibRule EOF )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:841:2: iv_ruleImportLibRule= ruleImportLibRule EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getImportLibRuleRule()); 
            }
            pushFollow(FOLLOW_ruleImportLibRule_in_entryRuleImportLibRule1697);
            iv_ruleImportLibRule=ruleImportLibRule();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleImportLibRule; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleImportLibRule1707); if (state.failed) return current;

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
    // $ANTLR end "entryRuleImportLibRule"


    // $ANTLR start "ruleImportLibRule"
    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:848:1: ruleImportLibRule returns [EObject current=null] : (otherlv_0= 'ImportLib' ( (lv_importURI_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleImportLibRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_importURI_1_0=null;

         enterRule(); 
            
        try {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:851:28: ( (otherlv_0= 'ImportLib' ( (lv_importURI_1_0= RULE_STRING ) ) ) )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:852:1: (otherlv_0= 'ImportLib' ( (lv_importURI_1_0= RULE_STRING ) ) )
            {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:852:1: (otherlv_0= 'ImportLib' ( (lv_importURI_1_0= RULE_STRING ) ) )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:852:3: otherlv_0= 'ImportLib' ( (lv_importURI_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,29,FOLLOW_29_in_ruleImportLibRule1744); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getImportLibRuleAccess().getImportLibKeyword_0());
                  
            }
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:856:1: ( (lv_importURI_1_0= RULE_STRING ) )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:857:1: (lv_importURI_1_0= RULE_STRING )
            {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:857:1: (lv_importURI_1_0= RULE_STRING )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:858:3: lv_importURI_1_0= RULE_STRING
            {
            lv_importURI_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleImportLibRule1761); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_importURI_1_0, grammarAccess.getImportLibRuleAccess().getImportURISTRINGTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getImportLibRuleRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"importURI",
                      		lv_importURI_1_0, 
                      		"STRING");
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleImportLibRule"


    // $ANTLR start "entryRuleImportInterfaceRule"
    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:882:1: entryRuleImportInterfaceRule returns [EObject current=null] : iv_ruleImportInterfaceRule= ruleImportInterfaceRule EOF ;
    public final EObject entryRuleImportInterfaceRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImportInterfaceRule = null;


        try {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:883:2: (iv_ruleImportInterfaceRule= ruleImportInterfaceRule EOF )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:884:2: iv_ruleImportInterfaceRule= ruleImportInterfaceRule EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getImportInterfaceRuleRule()); 
            }
            pushFollow(FOLLOW_ruleImportInterfaceRule_in_entryRuleImportInterfaceRule1802);
            iv_ruleImportInterfaceRule=ruleImportInterfaceRule();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleImportInterfaceRule; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleImportInterfaceRule1812); if (state.failed) return current;

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
    // $ANTLR end "entryRuleImportInterfaceRule"


    // $ANTLR start "ruleImportInterfaceRule"
    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:891:1: ruleImportInterfaceRule returns [EObject current=null] : (otherlv_0= 'ImportInterface' ( (lv_importURI_1_0= RULE_STRING ) ) otherlv_2= 'as' ( (lv_name_3_0= RULE_ID ) ) ) ;
    public final EObject ruleImportInterfaceRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_importURI_1_0=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;

         enterRule(); 
            
        try {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:894:28: ( (otherlv_0= 'ImportInterface' ( (lv_importURI_1_0= RULE_STRING ) ) otherlv_2= 'as' ( (lv_name_3_0= RULE_ID ) ) ) )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:895:1: (otherlv_0= 'ImportInterface' ( (lv_importURI_1_0= RULE_STRING ) ) otherlv_2= 'as' ( (lv_name_3_0= RULE_ID ) ) )
            {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:895:1: (otherlv_0= 'ImportInterface' ( (lv_importURI_1_0= RULE_STRING ) ) otherlv_2= 'as' ( (lv_name_3_0= RULE_ID ) ) )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:895:3: otherlv_0= 'ImportInterface' ( (lv_importURI_1_0= RULE_STRING ) ) otherlv_2= 'as' ( (lv_name_3_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,30,FOLLOW_30_in_ruleImportInterfaceRule1849); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getImportInterfaceRuleAccess().getImportInterfaceKeyword_0());
                  
            }
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:899:1: ( (lv_importURI_1_0= RULE_STRING ) )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:900:1: (lv_importURI_1_0= RULE_STRING )
            {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:900:1: (lv_importURI_1_0= RULE_STRING )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:901:3: lv_importURI_1_0= RULE_STRING
            {
            lv_importURI_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleImportInterfaceRule1866); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_importURI_1_0, grammarAccess.getImportInterfaceRuleAccess().getImportURISTRINGTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getImportInterfaceRuleRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"importURI",
                      		lv_importURI_1_0, 
                      		"STRING");
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,31,FOLLOW_31_in_ruleImportInterfaceRule1883); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getImportInterfaceRuleAccess().getAsKeyword_2());
                  
            }
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:921:1: ( (lv_name_3_0= RULE_ID ) )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:922:1: (lv_name_3_0= RULE_ID )
            {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:922:1: (lv_name_3_0= RULE_ID )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:923:3: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleImportInterfaceRule1900); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_3_0, grammarAccess.getImportInterfaceRuleAccess().getNameIDTerminalRuleCall_3_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getImportInterfaceRuleRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_3_0, 
                      		"ID");
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleImportInterfaceRule"


    // $ANTLR start "entryRuleGImportStatement"
    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:949:1: entryRuleGImportStatement returns [EObject current=null] : iv_ruleGImportStatement= ruleGImportStatement EOF ;
    public final EObject entryRuleGImportStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGImportStatement = null;


        try {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:950:2: (iv_ruleGImportStatement= ruleGImportStatement EOF )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:951:2: iv_ruleGImportStatement= ruleGImportStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGImportStatementRule()); 
            }
            pushFollow(FOLLOW_ruleGImportStatement_in_entryRuleGImportStatement1943);
            iv_ruleGImportStatement=ruleGImportStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGImportStatement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleGImportStatement1953); if (state.failed) return current;

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
    // $ANTLR end "entryRuleGImportStatement"


    // $ANTLR start "ruleGImportStatement"
    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:958:1: ruleGImportStatement returns [EObject current=null] : (otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleGImportStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_importURI_1_0=null;

         enterRule(); 
            
        try {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:961:28: ( (otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) ) ) )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:962:1: (otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) ) )
            {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:962:1: (otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) ) )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:962:3: otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,32,FOLLOW_32_in_ruleGImportStatement1990); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getGImportStatementAccess().getImportKeyword_0());
                  
            }
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:966:1: ( (lv_importURI_1_0= RULE_STRING ) )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:967:1: (lv_importURI_1_0= RULE_STRING )
            {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:967:1: (lv_importURI_1_0= RULE_STRING )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:968:3: lv_importURI_1_0= RULE_STRING
            {
            lv_importURI_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleGImportStatement2007); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_importURI_1_0, grammarAccess.getGImportStatementAccess().getImportURISTRINGTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getGImportStatementRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"importURI",
                      		lv_importURI_1_0, 
                      		"STRING");
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleGImportStatement"


    // $ANTLR start "entryRuleGExpression"
    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:992:1: entryRuleGExpression returns [EObject current=null] : iv_ruleGExpression= ruleGExpression EOF ;
    public final EObject entryRuleGExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGExpression = null;


        try {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:993:2: (iv_ruleGExpression= ruleGExpression EOF )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:994:2: iv_ruleGExpression= ruleGExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleGExpression_in_entryRuleGExpression2048);
            iv_ruleGExpression=ruleGExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleGExpression2058); if (state.failed) return current;

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
    // $ANTLR end "entryRuleGExpression"


    // $ANTLR start "ruleGExpression"
    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1001:1: ruleGExpression returns [EObject current=null] : this_GOrExpression_0= ruleGOrExpression ;
    public final EObject ruleGExpression() throws RecognitionException {
        EObject current = null;

        EObject this_GOrExpression_0 = null;


         enterRule(); 
            
        try {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1004:28: (this_GOrExpression_0= ruleGOrExpression )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1006:5: this_GOrExpression_0= ruleGOrExpression
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getGExpressionAccess().getGOrExpressionParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_ruleGOrExpression_in_ruleGExpression2104);
            this_GOrExpression_0=ruleGOrExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_GOrExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }

            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleGExpression"


    // $ANTLR start "entryRuleGOrExpression"
    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1022:1: entryRuleGOrExpression returns [EObject current=null] : iv_ruleGOrExpression= ruleGOrExpression EOF ;
    public final EObject entryRuleGOrExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGOrExpression = null;


        try {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1023:2: (iv_ruleGOrExpression= ruleGOrExpression EOF )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1024:2: iv_ruleGOrExpression= ruleGOrExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGOrExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleGOrExpression_in_entryRuleGOrExpression2138);
            iv_ruleGOrExpression=ruleGOrExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGOrExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleGOrExpression2148); if (state.failed) return current;

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
    // $ANTLR end "entryRuleGOrExpression"


    // $ANTLR start "ruleGOrExpression"
    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1031:1: ruleGOrExpression returns [EObject current=null] : (this_GXorExpression_0= ruleGXorExpression ( () ( (lv_operator_2_0= ruleGOrOperator ) ) ( (lv_rightOperand_3_0= ruleGXorExpression ) ) )* ) ;
    public final EObject ruleGOrExpression() throws RecognitionException {
        EObject current = null;

        EObject this_GXorExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1034:28: ( (this_GXorExpression_0= ruleGXorExpression ( () ( (lv_operator_2_0= ruleGOrOperator ) ) ( (lv_rightOperand_3_0= ruleGXorExpression ) ) )* ) )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1035:1: (this_GXorExpression_0= ruleGXorExpression ( () ( (lv_operator_2_0= ruleGOrOperator ) ) ( (lv_rightOperand_3_0= ruleGXorExpression ) ) )* )
            {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1035:1: (this_GXorExpression_0= ruleGXorExpression ( () ( (lv_operator_2_0= ruleGOrOperator ) ) ( (lv_rightOperand_3_0= ruleGXorExpression ) ) )* )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1036:5: this_GXorExpression_0= ruleGXorExpression ( () ( (lv_operator_2_0= ruleGOrOperator ) ) ( (lv_rightOperand_3_0= ruleGXorExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getGOrExpressionAccess().getGXorExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleGXorExpression_in_ruleGOrExpression2195);
            this_GXorExpression_0=ruleGXorExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_GXorExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1044:1: ( () ( (lv_operator_2_0= ruleGOrOperator ) ) ( (lv_rightOperand_3_0= ruleGXorExpression ) ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==42) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1044:2: () ( (lv_operator_2_0= ruleGOrOperator ) ) ( (lv_rightOperand_3_0= ruleGXorExpression ) )
            	    {
            	    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1044:2: ()
            	    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1045:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getGOrExpressionAccess().getGOrExpressionLeftOperandAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1050:2: ( (lv_operator_2_0= ruleGOrOperator ) )
            	    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1051:1: (lv_operator_2_0= ruleGOrOperator )
            	    {
            	    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1051:1: (lv_operator_2_0= ruleGOrOperator )
            	    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1052:3: lv_operator_2_0= ruleGOrOperator
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getGOrExpressionAccess().getOperatorGOrOperatorEnumRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleGOrOperator_in_ruleGOrExpression2225);
            	    lv_operator_2_0=ruleGOrOperator();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getGOrExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"operator",
            	              		lv_operator_2_0, 
            	              		"GOrOperator");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1068:2: ( (lv_rightOperand_3_0= ruleGXorExpression ) )
            	    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1069:1: (lv_rightOperand_3_0= ruleGXorExpression )
            	    {
            	    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1069:1: (lv_rightOperand_3_0= ruleGXorExpression )
            	    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1070:3: lv_rightOperand_3_0= ruleGXorExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getGOrExpressionAccess().getRightOperandGXorExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleGXorExpression_in_ruleGOrExpression2246);
            	    lv_rightOperand_3_0=ruleGXorExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getGOrExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"rightOperand",
            	              		lv_rightOperand_3_0, 
            	              		"GXorExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleGOrExpression"


    // $ANTLR start "entryRuleGXorExpression"
    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1094:1: entryRuleGXorExpression returns [EObject current=null] : iv_ruleGXorExpression= ruleGXorExpression EOF ;
    public final EObject entryRuleGXorExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGXorExpression = null;


        try {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1095:2: (iv_ruleGXorExpression= ruleGXorExpression EOF )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1096:2: iv_ruleGXorExpression= ruleGXorExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGXorExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleGXorExpression_in_entryRuleGXorExpression2284);
            iv_ruleGXorExpression=ruleGXorExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGXorExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleGXorExpression2294); if (state.failed) return current;

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
    // $ANTLR end "entryRuleGXorExpression"


    // $ANTLR start "ruleGXorExpression"
    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1103:1: ruleGXorExpression returns [EObject current=null] : (this_GAndExpression_0= ruleGAndExpression ( () ( (lv_operator_2_0= ruleGXorOperator ) ) ( (lv_rightOperand_3_0= ruleGAndExpression ) ) )* ) ;
    public final EObject ruleGXorExpression() throws RecognitionException {
        EObject current = null;

        EObject this_GAndExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1106:28: ( (this_GAndExpression_0= ruleGAndExpression ( () ( (lv_operator_2_0= ruleGXorOperator ) ) ( (lv_rightOperand_3_0= ruleGAndExpression ) ) )* ) )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1107:1: (this_GAndExpression_0= ruleGAndExpression ( () ( (lv_operator_2_0= ruleGXorOperator ) ) ( (lv_rightOperand_3_0= ruleGAndExpression ) ) )* )
            {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1107:1: (this_GAndExpression_0= ruleGAndExpression ( () ( (lv_operator_2_0= ruleGXorOperator ) ) ( (lv_rightOperand_3_0= ruleGAndExpression ) ) )* )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1108:5: this_GAndExpression_0= ruleGAndExpression ( () ( (lv_operator_2_0= ruleGXorOperator ) ) ( (lv_rightOperand_3_0= ruleGAndExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getGXorExpressionAccess().getGAndExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleGAndExpression_in_ruleGXorExpression2341);
            this_GAndExpression_0=ruleGAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_GAndExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1116:1: ( () ( (lv_operator_2_0= ruleGXorOperator ) ) ( (lv_rightOperand_3_0= ruleGAndExpression ) ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==41) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1116:2: () ( (lv_operator_2_0= ruleGXorOperator ) ) ( (lv_rightOperand_3_0= ruleGAndExpression ) )
            	    {
            	    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1116:2: ()
            	    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1117:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getGXorExpressionAccess().getGXorExpressionLeftOperandAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1122:2: ( (lv_operator_2_0= ruleGXorOperator ) )
            	    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1123:1: (lv_operator_2_0= ruleGXorOperator )
            	    {
            	    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1123:1: (lv_operator_2_0= ruleGXorOperator )
            	    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1124:3: lv_operator_2_0= ruleGXorOperator
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getGXorExpressionAccess().getOperatorGXorOperatorEnumRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleGXorOperator_in_ruleGXorExpression2371);
            	    lv_operator_2_0=ruleGXorOperator();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getGXorExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"operator",
            	              		lv_operator_2_0, 
            	              		"GXorOperator");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1140:2: ( (lv_rightOperand_3_0= ruleGAndExpression ) )
            	    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1141:1: (lv_rightOperand_3_0= ruleGAndExpression )
            	    {
            	    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1141:1: (lv_rightOperand_3_0= ruleGAndExpression )
            	    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1142:3: lv_rightOperand_3_0= ruleGAndExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getGXorExpressionAccess().getRightOperandGAndExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleGAndExpression_in_ruleGXorExpression2392);
            	    lv_rightOperand_3_0=ruleGAndExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getGXorExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"rightOperand",
            	              		lv_rightOperand_3_0, 
            	              		"GAndExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleGXorExpression"


    // $ANTLR start "entryRuleGAndExpression"
    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1166:1: entryRuleGAndExpression returns [EObject current=null] : iv_ruleGAndExpression= ruleGAndExpression EOF ;
    public final EObject entryRuleGAndExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGAndExpression = null;


        try {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1167:2: (iv_ruleGAndExpression= ruleGAndExpression EOF )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1168:2: iv_ruleGAndExpression= ruleGAndExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGAndExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleGAndExpression_in_entryRuleGAndExpression2430);
            iv_ruleGAndExpression=ruleGAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGAndExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleGAndExpression2440); if (state.failed) return current;

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
    // $ANTLR end "entryRuleGAndExpression"


    // $ANTLR start "ruleGAndExpression"
    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1175:1: ruleGAndExpression returns [EObject current=null] : (this_GEqualityExpression_0= ruleGEqualityExpression ( () ( (lv_operator_2_0= ruleGAndOperator ) ) ( (lv_rightOperand_3_0= ruleGEqualityExpression ) ) )* ) ;
    public final EObject ruleGAndExpression() throws RecognitionException {
        EObject current = null;

        EObject this_GEqualityExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1178:28: ( (this_GEqualityExpression_0= ruleGEqualityExpression ( () ( (lv_operator_2_0= ruleGAndOperator ) ) ( (lv_rightOperand_3_0= ruleGEqualityExpression ) ) )* ) )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1179:1: (this_GEqualityExpression_0= ruleGEqualityExpression ( () ( (lv_operator_2_0= ruleGAndOperator ) ) ( (lv_rightOperand_3_0= ruleGEqualityExpression ) ) )* )
            {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1179:1: (this_GEqualityExpression_0= ruleGEqualityExpression ( () ( (lv_operator_2_0= ruleGAndOperator ) ) ( (lv_rightOperand_3_0= ruleGEqualityExpression ) ) )* )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1180:5: this_GEqualityExpression_0= ruleGEqualityExpression ( () ( (lv_operator_2_0= ruleGAndOperator ) ) ( (lv_rightOperand_3_0= ruleGEqualityExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getGAndExpressionAccess().getGEqualityExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleGEqualityExpression_in_ruleGAndExpression2487);
            this_GEqualityExpression_0=ruleGEqualityExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_GEqualityExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1188:1: ( () ( (lv_operator_2_0= ruleGAndOperator ) ) ( (lv_rightOperand_3_0= ruleGEqualityExpression ) ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==40) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1188:2: () ( (lv_operator_2_0= ruleGAndOperator ) ) ( (lv_rightOperand_3_0= ruleGEqualityExpression ) )
            	    {
            	    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1188:2: ()
            	    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1189:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getGAndExpressionAccess().getGAndExpressionLeftOperandAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1194:2: ( (lv_operator_2_0= ruleGAndOperator ) )
            	    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1195:1: (lv_operator_2_0= ruleGAndOperator )
            	    {
            	    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1195:1: (lv_operator_2_0= ruleGAndOperator )
            	    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1196:3: lv_operator_2_0= ruleGAndOperator
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getGAndExpressionAccess().getOperatorGAndOperatorEnumRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleGAndOperator_in_ruleGAndExpression2517);
            	    lv_operator_2_0=ruleGAndOperator();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getGAndExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"operator",
            	              		lv_operator_2_0, 
            	              		"GAndOperator");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1212:2: ( (lv_rightOperand_3_0= ruleGEqualityExpression ) )
            	    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1213:1: (lv_rightOperand_3_0= ruleGEqualityExpression )
            	    {
            	    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1213:1: (lv_rightOperand_3_0= ruleGEqualityExpression )
            	    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1214:3: lv_rightOperand_3_0= ruleGEqualityExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getGAndExpressionAccess().getRightOperandGEqualityExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleGEqualityExpression_in_ruleGAndExpression2538);
            	    lv_rightOperand_3_0=ruleGEqualityExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getGAndExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"rightOperand",
            	              		lv_rightOperand_3_0, 
            	              		"GEqualityExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleGAndExpression"


    // $ANTLR start "entryRuleGEqualityExpression"
    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1238:1: entryRuleGEqualityExpression returns [EObject current=null] : iv_ruleGEqualityExpression= ruleGEqualityExpression EOF ;
    public final EObject entryRuleGEqualityExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGEqualityExpression = null;


        try {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1239:2: (iv_ruleGEqualityExpression= ruleGEqualityExpression EOF )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1240:2: iv_ruleGEqualityExpression= ruleGEqualityExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGEqualityExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleGEqualityExpression_in_entryRuleGEqualityExpression2576);
            iv_ruleGEqualityExpression=ruleGEqualityExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGEqualityExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleGEqualityExpression2586); if (state.failed) return current;

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
    // $ANTLR end "entryRuleGEqualityExpression"


    // $ANTLR start "ruleGEqualityExpression"
    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1247:1: ruleGEqualityExpression returns [EObject current=null] : (this_GRelationExpression_0= ruleGRelationExpression ( () ( (lv_operator_2_0= ruleGEqualityOperator ) ) ( (lv_rightOperand_3_0= ruleGRelationExpression ) ) )* ) ;
    public final EObject ruleGEqualityExpression() throws RecognitionException {
        EObject current = null;

        EObject this_GRelationExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1250:28: ( (this_GRelationExpression_0= ruleGRelationExpression ( () ( (lv_operator_2_0= ruleGEqualityOperator ) ) ( (lv_rightOperand_3_0= ruleGRelationExpression ) ) )* ) )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1251:1: (this_GRelationExpression_0= ruleGRelationExpression ( () ( (lv_operator_2_0= ruleGEqualityOperator ) ) ( (lv_rightOperand_3_0= ruleGRelationExpression ) ) )* )
            {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1251:1: (this_GRelationExpression_0= ruleGRelationExpression ( () ( (lv_operator_2_0= ruleGEqualityOperator ) ) ( (lv_rightOperand_3_0= ruleGRelationExpression ) ) )* )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1252:5: this_GRelationExpression_0= ruleGRelationExpression ( () ( (lv_operator_2_0= ruleGEqualityOperator ) ) ( (lv_rightOperand_3_0= ruleGRelationExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getGEqualityExpressionAccess().getGRelationExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleGRelationExpression_in_ruleGEqualityExpression2633);
            this_GRelationExpression_0=ruleGRelationExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_GRelationExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1260:1: ( () ( (lv_operator_2_0= ruleGEqualityOperator ) ) ( (lv_rightOperand_3_0= ruleGRelationExpression ) ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==28||LA17_0==43) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1260:2: () ( (lv_operator_2_0= ruleGEqualityOperator ) ) ( (lv_rightOperand_3_0= ruleGRelationExpression ) )
            	    {
            	    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1260:2: ()
            	    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1261:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getGEqualityExpressionAccess().getGEqualityExpressionLeftOperandAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1266:2: ( (lv_operator_2_0= ruleGEqualityOperator ) )
            	    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1267:1: (lv_operator_2_0= ruleGEqualityOperator )
            	    {
            	    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1267:1: (lv_operator_2_0= ruleGEqualityOperator )
            	    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1268:3: lv_operator_2_0= ruleGEqualityOperator
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getGEqualityExpressionAccess().getOperatorGEqualityOperatorEnumRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleGEqualityOperator_in_ruleGEqualityExpression2663);
            	    lv_operator_2_0=ruleGEqualityOperator();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getGEqualityExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"operator",
            	              		lv_operator_2_0, 
            	              		"GEqualityOperator");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1284:2: ( (lv_rightOperand_3_0= ruleGRelationExpression ) )
            	    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1285:1: (lv_rightOperand_3_0= ruleGRelationExpression )
            	    {
            	    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1285:1: (lv_rightOperand_3_0= ruleGRelationExpression )
            	    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1286:3: lv_rightOperand_3_0= ruleGRelationExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getGEqualityExpressionAccess().getRightOperandGRelationExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleGRelationExpression_in_ruleGEqualityExpression2684);
            	    lv_rightOperand_3_0=ruleGRelationExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getGEqualityExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"rightOperand",
            	              		lv_rightOperand_3_0, 
            	              		"GRelationExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleGEqualityExpression"


    // $ANTLR start "entryRuleGRelationExpression"
    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1310:1: entryRuleGRelationExpression returns [EObject current=null] : iv_ruleGRelationExpression= ruleGRelationExpression EOF ;
    public final EObject entryRuleGRelationExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGRelationExpression = null;


        try {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1311:2: (iv_ruleGRelationExpression= ruleGRelationExpression EOF )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1312:2: iv_ruleGRelationExpression= ruleGRelationExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGRelationExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleGRelationExpression_in_entryRuleGRelationExpression2722);
            iv_ruleGRelationExpression=ruleGRelationExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGRelationExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleGRelationExpression2732); if (state.failed) return current;

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
    // $ANTLR end "entryRuleGRelationExpression"


    // $ANTLR start "ruleGRelationExpression"
    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1319:1: ruleGRelationExpression returns [EObject current=null] : (this_GAdditionExpression_0= ruleGAdditionExpression ( () ( (lv_operator_2_0= ruleGRelationOperator ) ) ( (lv_rightOperand_3_0= ruleGAdditionExpression ) ) )* ) ;
    public final EObject ruleGRelationExpression() throws RecognitionException {
        EObject current = null;

        EObject this_GAdditionExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1322:28: ( (this_GAdditionExpression_0= ruleGAdditionExpression ( () ( (lv_operator_2_0= ruleGRelationOperator ) ) ( (lv_rightOperand_3_0= ruleGAdditionExpression ) ) )* ) )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1323:1: (this_GAdditionExpression_0= ruleGAdditionExpression ( () ( (lv_operator_2_0= ruleGRelationOperator ) ) ( (lv_rightOperand_3_0= ruleGAdditionExpression ) ) )* )
            {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1323:1: (this_GAdditionExpression_0= ruleGAdditionExpression ( () ( (lv_operator_2_0= ruleGRelationOperator ) ) ( (lv_rightOperand_3_0= ruleGAdditionExpression ) ) )* )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1324:5: this_GAdditionExpression_0= ruleGAdditionExpression ( () ( (lv_operator_2_0= ruleGRelationOperator ) ) ( (lv_rightOperand_3_0= ruleGAdditionExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getGRelationExpressionAccess().getGAdditionExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleGAdditionExpression_in_ruleGRelationExpression2779);
            this_GAdditionExpression_0=ruleGAdditionExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_GAdditionExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1332:1: ( () ( (lv_operator_2_0= ruleGRelationOperator ) ) ( (lv_rightOperand_3_0= ruleGAdditionExpression ) ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( ((LA18_0>=44 && LA18_0<=47)) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1332:2: () ( (lv_operator_2_0= ruleGRelationOperator ) ) ( (lv_rightOperand_3_0= ruleGAdditionExpression ) )
            	    {
            	    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1332:2: ()
            	    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1333:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getGRelationExpressionAccess().getGRelationExpressionLeftOperandAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1338:2: ( (lv_operator_2_0= ruleGRelationOperator ) )
            	    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1339:1: (lv_operator_2_0= ruleGRelationOperator )
            	    {
            	    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1339:1: (lv_operator_2_0= ruleGRelationOperator )
            	    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1340:3: lv_operator_2_0= ruleGRelationOperator
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getGRelationExpressionAccess().getOperatorGRelationOperatorEnumRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleGRelationOperator_in_ruleGRelationExpression2809);
            	    lv_operator_2_0=ruleGRelationOperator();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getGRelationExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"operator",
            	              		lv_operator_2_0, 
            	              		"GRelationOperator");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1356:2: ( (lv_rightOperand_3_0= ruleGAdditionExpression ) )
            	    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1357:1: (lv_rightOperand_3_0= ruleGAdditionExpression )
            	    {
            	    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1357:1: (lv_rightOperand_3_0= ruleGAdditionExpression )
            	    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1358:3: lv_rightOperand_3_0= ruleGAdditionExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getGRelationExpressionAccess().getRightOperandGAdditionExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleGAdditionExpression_in_ruleGRelationExpression2830);
            	    lv_rightOperand_3_0=ruleGAdditionExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getGRelationExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"rightOperand",
            	              		lv_rightOperand_3_0, 
            	              		"GAdditionExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleGRelationExpression"


    // $ANTLR start "entryRuleGAdditionExpression"
    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1382:1: entryRuleGAdditionExpression returns [EObject current=null] : iv_ruleGAdditionExpression= ruleGAdditionExpression EOF ;
    public final EObject entryRuleGAdditionExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGAdditionExpression = null;


        try {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1383:2: (iv_ruleGAdditionExpression= ruleGAdditionExpression EOF )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1384:2: iv_ruleGAdditionExpression= ruleGAdditionExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGAdditionExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleGAdditionExpression_in_entryRuleGAdditionExpression2868);
            iv_ruleGAdditionExpression=ruleGAdditionExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGAdditionExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleGAdditionExpression2878); if (state.failed) return current;

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
    // $ANTLR end "entryRuleGAdditionExpression"


    // $ANTLR start "ruleGAdditionExpression"
    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1391:1: ruleGAdditionExpression returns [EObject current=null] : (this_GMultiplicationExpression_0= ruleGMultiplicationExpression ( () ( (lv_operator_2_0= ruleGAdditionOperator ) ) ( (lv_rightOperand_3_0= ruleGMultiplicationExpression ) ) )* ) ;
    public final EObject ruleGAdditionExpression() throws RecognitionException {
        EObject current = null;

        EObject this_GMultiplicationExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1394:28: ( (this_GMultiplicationExpression_0= ruleGMultiplicationExpression ( () ( (lv_operator_2_0= ruleGAdditionOperator ) ) ( (lv_rightOperand_3_0= ruleGMultiplicationExpression ) ) )* ) )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1395:1: (this_GMultiplicationExpression_0= ruleGMultiplicationExpression ( () ( (lv_operator_2_0= ruleGAdditionOperator ) ) ( (lv_rightOperand_3_0= ruleGMultiplicationExpression ) ) )* )
            {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1395:1: (this_GMultiplicationExpression_0= ruleGMultiplicationExpression ( () ( (lv_operator_2_0= ruleGAdditionOperator ) ) ( (lv_rightOperand_3_0= ruleGMultiplicationExpression ) ) )* )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1396:5: this_GMultiplicationExpression_0= ruleGMultiplicationExpression ( () ( (lv_operator_2_0= ruleGAdditionOperator ) ) ( (lv_rightOperand_3_0= ruleGMultiplicationExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getGAdditionExpressionAccess().getGMultiplicationExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleGMultiplicationExpression_in_ruleGAdditionExpression2925);
            this_GMultiplicationExpression_0=ruleGMultiplicationExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_GMultiplicationExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1404:1: ( () ( (lv_operator_2_0= ruleGAdditionOperator ) ) ( (lv_rightOperand_3_0= ruleGMultiplicationExpression ) ) )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( ((LA19_0>=48 && LA19_0<=49)) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1404:2: () ( (lv_operator_2_0= ruleGAdditionOperator ) ) ( (lv_rightOperand_3_0= ruleGMultiplicationExpression ) )
            	    {
            	    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1404:2: ()
            	    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1405:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getGAdditionExpressionAccess().getGAdditionExpressionLeftOperandAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1410:2: ( (lv_operator_2_0= ruleGAdditionOperator ) )
            	    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1411:1: (lv_operator_2_0= ruleGAdditionOperator )
            	    {
            	    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1411:1: (lv_operator_2_0= ruleGAdditionOperator )
            	    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1412:3: lv_operator_2_0= ruleGAdditionOperator
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getGAdditionExpressionAccess().getOperatorGAdditionOperatorEnumRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleGAdditionOperator_in_ruleGAdditionExpression2955);
            	    lv_operator_2_0=ruleGAdditionOperator();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getGAdditionExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"operator",
            	              		lv_operator_2_0, 
            	              		"GAdditionOperator");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1428:2: ( (lv_rightOperand_3_0= ruleGMultiplicationExpression ) )
            	    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1429:1: (lv_rightOperand_3_0= ruleGMultiplicationExpression )
            	    {
            	    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1429:1: (lv_rightOperand_3_0= ruleGMultiplicationExpression )
            	    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1430:3: lv_rightOperand_3_0= ruleGMultiplicationExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getGAdditionExpressionAccess().getRightOperandGMultiplicationExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleGMultiplicationExpression_in_ruleGAdditionExpression2976);
            	    lv_rightOperand_3_0=ruleGMultiplicationExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getGAdditionExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"rightOperand",
            	              		lv_rightOperand_3_0, 
            	              		"GMultiplicationExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleGAdditionExpression"


    // $ANTLR start "entryRuleGMultiplicationExpression"
    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1454:1: entryRuleGMultiplicationExpression returns [EObject current=null] : iv_ruleGMultiplicationExpression= ruleGMultiplicationExpression EOF ;
    public final EObject entryRuleGMultiplicationExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGMultiplicationExpression = null;


        try {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1455:2: (iv_ruleGMultiplicationExpression= ruleGMultiplicationExpression EOF )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1456:2: iv_ruleGMultiplicationExpression= ruleGMultiplicationExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGMultiplicationExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleGMultiplicationExpression_in_entryRuleGMultiplicationExpression3014);
            iv_ruleGMultiplicationExpression=ruleGMultiplicationExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGMultiplicationExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleGMultiplicationExpression3024); if (state.failed) return current;

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
    // $ANTLR end "entryRuleGMultiplicationExpression"


    // $ANTLR start "ruleGMultiplicationExpression"
    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1463:1: ruleGMultiplicationExpression returns [EObject current=null] : (this_GNegationExpression_0= ruleGNegationExpression ( () ( (lv_operator_2_0= ruleGMultiplicationOperator ) ) ( (lv_rightOperand_3_0= ruleGNegationExpression ) ) )* ) ;
    public final EObject ruleGMultiplicationExpression() throws RecognitionException {
        EObject current = null;

        EObject this_GNegationExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1466:28: ( (this_GNegationExpression_0= ruleGNegationExpression ( () ( (lv_operator_2_0= ruleGMultiplicationOperator ) ) ( (lv_rightOperand_3_0= ruleGNegationExpression ) ) )* ) )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1467:1: (this_GNegationExpression_0= ruleGNegationExpression ( () ( (lv_operator_2_0= ruleGMultiplicationOperator ) ) ( (lv_rightOperand_3_0= ruleGNegationExpression ) ) )* )
            {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1467:1: (this_GNegationExpression_0= ruleGNegationExpression ( () ( (lv_operator_2_0= ruleGMultiplicationOperator ) ) ( (lv_rightOperand_3_0= ruleGNegationExpression ) ) )* )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1468:5: this_GNegationExpression_0= ruleGNegationExpression ( () ( (lv_operator_2_0= ruleGMultiplicationOperator ) ) ( (lv_rightOperand_3_0= ruleGNegationExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getGMultiplicationExpressionAccess().getGNegationExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleGNegationExpression_in_ruleGMultiplicationExpression3071);
            this_GNegationExpression_0=ruleGNegationExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_GNegationExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1476:1: ( () ( (lv_operator_2_0= ruleGMultiplicationOperator ) ) ( (lv_rightOperand_3_0= ruleGNegationExpression ) ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( ((LA20_0>=50 && LA20_0<=51)) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1476:2: () ( (lv_operator_2_0= ruleGMultiplicationOperator ) ) ( (lv_rightOperand_3_0= ruleGNegationExpression ) )
            	    {
            	    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1476:2: ()
            	    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1477:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getGMultiplicationExpressionAccess().getGMultiplicationExpressionLeftOperandAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1482:2: ( (lv_operator_2_0= ruleGMultiplicationOperator ) )
            	    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1483:1: (lv_operator_2_0= ruleGMultiplicationOperator )
            	    {
            	    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1483:1: (lv_operator_2_0= ruleGMultiplicationOperator )
            	    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1484:3: lv_operator_2_0= ruleGMultiplicationOperator
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getGMultiplicationExpressionAccess().getOperatorGMultiplicationOperatorEnumRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleGMultiplicationOperator_in_ruleGMultiplicationExpression3101);
            	    lv_operator_2_0=ruleGMultiplicationOperator();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getGMultiplicationExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"operator",
            	              		lv_operator_2_0, 
            	              		"GMultiplicationOperator");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1500:2: ( (lv_rightOperand_3_0= ruleGNegationExpression ) )
            	    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1501:1: (lv_rightOperand_3_0= ruleGNegationExpression )
            	    {
            	    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1501:1: (lv_rightOperand_3_0= ruleGNegationExpression )
            	    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1502:3: lv_rightOperand_3_0= ruleGNegationExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getGMultiplicationExpressionAccess().getRightOperandGNegationExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleGNegationExpression_in_ruleGMultiplicationExpression3122);
            	    lv_rightOperand_3_0=ruleGNegationExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getGMultiplicationExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"rightOperand",
            	              		lv_rightOperand_3_0, 
            	              		"GNegationExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleGMultiplicationExpression"


    // $ANTLR start "entryRuleGNegationExpression"
    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1526:1: entryRuleGNegationExpression returns [EObject current=null] : iv_ruleGNegationExpression= ruleGNegationExpression EOF ;
    public final EObject entryRuleGNegationExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGNegationExpression = null;


        try {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1527:2: (iv_ruleGNegationExpression= ruleGNegationExpression EOF )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1528:2: iv_ruleGNegationExpression= ruleGNegationExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGNegationExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleGNegationExpression_in_entryRuleGNegationExpression3160);
            iv_ruleGNegationExpression=ruleGNegationExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGNegationExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleGNegationExpression3170); if (state.failed) return current;

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
    // $ANTLR end "entryRuleGNegationExpression"


    // $ANTLR start "ruleGNegationExpression"
    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1535:1: ruleGNegationExpression returns [EObject current=null] : (this_GNavigationExpression_0= ruleGNavigationExpression | ( () ( (lv_operator_2_0= ruleGNegationOperator ) ) ( (lv_operand_3_0= ruleGNavigationExpression ) ) ) ) ;
    public final EObject ruleGNegationExpression() throws RecognitionException {
        EObject current = null;

        EObject this_GNavigationExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_operand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1538:28: ( (this_GNavigationExpression_0= ruleGNavigationExpression | ( () ( (lv_operator_2_0= ruleGNegationOperator ) ) ( (lv_operand_3_0= ruleGNavigationExpression ) ) ) ) )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1539:1: (this_GNavigationExpression_0= ruleGNavigationExpression | ( () ( (lv_operator_2_0= ruleGNegationOperator ) ) ( (lv_operand_3_0= ruleGNavigationExpression ) ) ) )
            {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1539:1: (this_GNavigationExpression_0= ruleGNavigationExpression | ( () ( (lv_operator_2_0= ruleGNegationOperator ) ) ( (lv_operand_3_0= ruleGNavigationExpression ) ) ) )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( ((LA21_0>=RULE_ID && LA21_0<=RULE_DOUBLE)||LA21_0==18||(LA21_0>=33 && LA21_0<=34)) ) {
                alt21=1;
            }
            else if ( ((LA21_0>=52 && LA21_0<=53)) ) {
                alt21=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1540:5: this_GNavigationExpression_0= ruleGNavigationExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getGNegationExpressionAccess().getGNavigationExpressionParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleGNavigationExpression_in_ruleGNegationExpression3217);
                    this_GNavigationExpression_0=ruleGNavigationExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_GNavigationExpression_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1549:6: ( () ( (lv_operator_2_0= ruleGNegationOperator ) ) ( (lv_operand_3_0= ruleGNavigationExpression ) ) )
                    {
                    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1549:6: ( () ( (lv_operator_2_0= ruleGNegationOperator ) ) ( (lv_operand_3_0= ruleGNavigationExpression ) ) )
                    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1549:7: () ( (lv_operator_2_0= ruleGNegationOperator ) ) ( (lv_operand_3_0= ruleGNavigationExpression ) )
                    {
                    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1549:7: ()
                    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1550:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getGNegationExpressionAccess().getGNegationExpressionAction_1_0(),
                                  current);
                          
                    }

                    }

                    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1555:2: ( (lv_operator_2_0= ruleGNegationOperator ) )
                    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1556:1: (lv_operator_2_0= ruleGNegationOperator )
                    {
                    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1556:1: (lv_operator_2_0= ruleGNegationOperator )
                    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1557:3: lv_operator_2_0= ruleGNegationOperator
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getGNegationExpressionAccess().getOperatorGNegationOperatorEnumRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleGNegationOperator_in_ruleGNegationExpression3253);
                    lv_operator_2_0=ruleGNegationOperator();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getGNegationExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"operator",
                              		lv_operator_2_0, 
                              		"GNegationOperator");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1573:2: ( (lv_operand_3_0= ruleGNavigationExpression ) )
                    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1574:1: (lv_operand_3_0= ruleGNavigationExpression )
                    {
                    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1574:1: (lv_operand_3_0= ruleGNavigationExpression )
                    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1575:3: lv_operand_3_0= ruleGNavigationExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getGNegationExpressionAccess().getOperandGNavigationExpressionParserRuleCall_1_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleGNavigationExpression_in_ruleGNegationExpression3274);
                    lv_operand_3_0=ruleGNavigationExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getGNegationExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"operand",
                              		lv_operand_3_0, 
                              		"GNavigationExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleGNegationExpression"


    // $ANTLR start "entryRuleGNavigationExpression"
    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1599:1: entryRuleGNavigationExpression returns [EObject current=null] : iv_ruleGNavigationExpression= ruleGNavigationExpression EOF ;
    public final EObject entryRuleGNavigationExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGNavigationExpression = null;


        try {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1600:2: (iv_ruleGNavigationExpression= ruleGNavigationExpression EOF )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1601:2: iv_ruleGNavigationExpression= ruleGNavigationExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGNavigationExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleGNavigationExpression_in_entryRuleGNavigationExpression3311);
            iv_ruleGNavigationExpression=ruleGNavigationExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGNavigationExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleGNavigationExpression3321); if (state.failed) return current;

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
    // $ANTLR end "entryRuleGNavigationExpression"


    // $ANTLR start "ruleGNavigationExpression"
    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1608:1: ruleGNavigationExpression returns [EObject current=null] : (this_GReferenceExpression_0= ruleGReferenceExpression ( () ruleNavigationOperator ( (otherlv_3= RULE_ID ) ) )* ) ;
    public final EObject ruleGNavigationExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_3=null;
        EObject this_GReferenceExpression_0 = null;


         enterRule(); 
            
        try {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1611:28: ( (this_GReferenceExpression_0= ruleGReferenceExpression ( () ruleNavigationOperator ( (otherlv_3= RULE_ID ) ) )* ) )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1612:1: (this_GReferenceExpression_0= ruleGReferenceExpression ( () ruleNavigationOperator ( (otherlv_3= RULE_ID ) ) )* )
            {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1612:1: (this_GReferenceExpression_0= ruleGReferenceExpression ( () ruleNavigationOperator ( (otherlv_3= RULE_ID ) ) )* )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1613:5: this_GReferenceExpression_0= ruleGReferenceExpression ( () ruleNavigationOperator ( (otherlv_3= RULE_ID ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getGNavigationExpressionAccess().getGReferenceExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleGReferenceExpression_in_ruleGNavigationExpression3368);
            this_GReferenceExpression_0=ruleGReferenceExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_GReferenceExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1621:1: ( () ruleNavigationOperator ( (otherlv_3= RULE_ID ) ) )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( ((LA22_0>=38 && LA22_0<=39)) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1621:2: () ruleNavigationOperator ( (otherlv_3= RULE_ID ) )
            	    {
            	    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1621:2: ()
            	    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1622:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getGNavigationExpressionAccess().getGNavigationExpressionBodyAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getGNavigationExpressionAccess().getNavigationOperatorParserRuleCall_1_1()); 
            	          
            	    }
            	    pushFollow(FOLLOW_ruleNavigationOperator_in_ruleGNavigationExpression3393);
            	    ruleNavigationOperator();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	              afterParserOrEnumRuleCall();
            	          
            	    }
            	    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1635:1: ( (otherlv_3= RULE_ID ) )
            	    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1636:1: (otherlv_3= RULE_ID )
            	    {
            	    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1636:1: (otherlv_3= RULE_ID )
            	    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1637:3: otherlv_3= RULE_ID
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getGNavigationExpressionRule());
            	      	        }
            	              
            	    }
            	    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleGNavigationExpression3412); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		newLeafNode(otherlv_3, grammarAccess.getGNavigationExpressionAccess().getReferencedEObjectEObjectCrossReference_1_2_0()); 
            	      	
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleGNavigationExpression"


    // $ANTLR start "entryRuleGReferenceExpression"
    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1656:1: entryRuleGReferenceExpression returns [EObject current=null] : iv_ruleGReferenceExpression= ruleGReferenceExpression EOF ;
    public final EObject entryRuleGReferenceExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGReferenceExpression = null;


        try {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1657:2: (iv_ruleGReferenceExpression= ruleGReferenceExpression EOF )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1658:2: iv_ruleGReferenceExpression= ruleGReferenceExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGReferenceExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleGReferenceExpression_in_entryRuleGReferenceExpression3450);
            iv_ruleGReferenceExpression=ruleGReferenceExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGReferenceExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleGReferenceExpression3460); if (state.failed) return current;

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
    // $ANTLR end "entryRuleGReferenceExpression"


    // $ANTLR start "ruleGReferenceExpression"
    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1665:1: ruleGReferenceExpression returns [EObject current=null] : (this_GPrimaryExpression_0= ruleGPrimaryExpression | ( () ( (otherlv_2= RULE_ID ) ) ) ) ;
    public final EObject ruleGReferenceExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_GPrimaryExpression_0 = null;


         enterRule(); 
            
        try {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1668:28: ( (this_GPrimaryExpression_0= ruleGPrimaryExpression | ( () ( (otherlv_2= RULE_ID ) ) ) ) )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1669:1: (this_GPrimaryExpression_0= ruleGPrimaryExpression | ( () ( (otherlv_2= RULE_ID ) ) ) )
            {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1669:1: (this_GPrimaryExpression_0= ruleGPrimaryExpression | ( () ( (otherlv_2= RULE_ID ) ) ) )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( ((LA23_0>=RULE_STRING && LA23_0<=RULE_DOUBLE)||LA23_0==18||(LA23_0>=33 && LA23_0<=34)) ) {
                alt23=1;
            }
            else if ( (LA23_0==RULE_ID) ) {
                alt23=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1670:5: this_GPrimaryExpression_0= ruleGPrimaryExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getGReferenceExpressionAccess().getGPrimaryExpressionParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleGPrimaryExpression_in_ruleGReferenceExpression3507);
                    this_GPrimaryExpression_0=ruleGPrimaryExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_GPrimaryExpression_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1679:6: ( () ( (otherlv_2= RULE_ID ) ) )
                    {
                    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1679:6: ( () ( (otherlv_2= RULE_ID ) ) )
                    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1679:7: () ( (otherlv_2= RULE_ID ) )
                    {
                    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1679:7: ()
                    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1680:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getGReferenceExpressionAccess().getGReferenceExpressionAction_1_0(),
                                  current);
                          
                    }

                    }

                    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1685:2: ( (otherlv_2= RULE_ID ) )
                    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1686:1: (otherlv_2= RULE_ID )
                    {
                    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1686:1: (otherlv_2= RULE_ID )
                    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1687:3: otherlv_2= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getGReferenceExpressionRule());
                      	        }
                              
                    }
                    otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleGReferenceExpression3542); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		newLeafNode(otherlv_2, grammarAccess.getGReferenceExpressionAccess().getReferencedEObjectEObjectCrossReference_1_1_0()); 
                      	
                    }

                    }


                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleGReferenceExpression"


    // $ANTLR start "entryRuleGPrimaryExpression"
    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1706:1: entryRuleGPrimaryExpression returns [EObject current=null] : iv_ruleGPrimaryExpression= ruleGPrimaryExpression EOF ;
    public final EObject entryRuleGPrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGPrimaryExpression = null;


        try {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1707:2: (iv_ruleGPrimaryExpression= ruleGPrimaryExpression EOF )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1708:2: iv_ruleGPrimaryExpression= ruleGPrimaryExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGPrimaryExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleGPrimaryExpression_in_entryRuleGPrimaryExpression3579);
            iv_ruleGPrimaryExpression=ruleGPrimaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGPrimaryExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleGPrimaryExpression3589); if (state.failed) return current;

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
    // $ANTLR end "entryRuleGPrimaryExpression"


    // $ANTLR start "ruleGPrimaryExpression"
    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1715:1: ruleGPrimaryExpression returns [EObject current=null] : (this_GStringExpression_0= ruleGStringExpression | this_GBooleanExpression_1= ruleGBooleanExpression | this_GNumericExpression_2= ruleGNumericExpression | this_GEnumLiteralExpression_3= ruleGEnumLiteralExpression | this_GIfExpression_4= ruleGIfExpression | this_GBraceExpression_5= ruleGBraceExpression ) ;
    public final EObject ruleGPrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject this_GStringExpression_0 = null;

        EObject this_GBooleanExpression_1 = null;

        EObject this_GNumericExpression_2 = null;

        EObject this_GEnumLiteralExpression_3 = null;

        EObject this_GIfExpression_4 = null;

        EObject this_GBraceExpression_5 = null;


         enterRule(); 
            
        try {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1718:28: ( (this_GStringExpression_0= ruleGStringExpression | this_GBooleanExpression_1= ruleGBooleanExpression | this_GNumericExpression_2= ruleGNumericExpression | this_GEnumLiteralExpression_3= ruleGEnumLiteralExpression | this_GIfExpression_4= ruleGIfExpression | this_GBraceExpression_5= ruleGBraceExpression ) )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1719:1: (this_GStringExpression_0= ruleGStringExpression | this_GBooleanExpression_1= ruleGBooleanExpression | this_GNumericExpression_2= ruleGNumericExpression | this_GEnumLiteralExpression_3= ruleGEnumLiteralExpression | this_GIfExpression_4= ruleGIfExpression | this_GBraceExpression_5= ruleGBraceExpression )
            {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1719:1: (this_GStringExpression_0= ruleGStringExpression | this_GBooleanExpression_1= ruleGBooleanExpression | this_GNumericExpression_2= ruleGNumericExpression | this_GEnumLiteralExpression_3= ruleGEnumLiteralExpression | this_GIfExpression_4= ruleGIfExpression | this_GBraceExpression_5= ruleGBraceExpression )
            int alt24=6;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt24=1;
                }
                break;
            case RULE_BOOLEAN:
                {
                alt24=2;
                }
                break;
            case RULE_INT:
            case RULE_DOUBLE:
                {
                alt24=3;
                }
                break;
            case 33:
                {
                alt24=4;
                }
                break;
            case 34:
                {
                alt24=5;
                }
                break;
            case 18:
                {
                alt24=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }

            switch (alt24) {
                case 1 :
                    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1720:5: this_GStringExpression_0= ruleGStringExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getGPrimaryExpressionAccess().getGStringExpressionParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleGStringExpression_in_ruleGPrimaryExpression3636);
                    this_GStringExpression_0=ruleGStringExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_GStringExpression_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1730:5: this_GBooleanExpression_1= ruleGBooleanExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getGPrimaryExpressionAccess().getGBooleanExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleGBooleanExpression_in_ruleGPrimaryExpression3663);
                    this_GBooleanExpression_1=ruleGBooleanExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_GBooleanExpression_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1740:5: this_GNumericExpression_2= ruleGNumericExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getGPrimaryExpressionAccess().getGNumericExpressionParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleGNumericExpression_in_ruleGPrimaryExpression3690);
                    this_GNumericExpression_2=ruleGNumericExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_GNumericExpression_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1750:5: this_GEnumLiteralExpression_3= ruleGEnumLiteralExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getGPrimaryExpressionAccess().getGEnumLiteralExpressionParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleGEnumLiteralExpression_in_ruleGPrimaryExpression3717);
                    this_GEnumLiteralExpression_3=ruleGEnumLiteralExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_GEnumLiteralExpression_3; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 5 :
                    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1760:5: this_GIfExpression_4= ruleGIfExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getGPrimaryExpressionAccess().getGIfExpressionParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleGIfExpression_in_ruleGPrimaryExpression3744);
                    this_GIfExpression_4=ruleGIfExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_GIfExpression_4; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 6 :
                    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1770:5: this_GBraceExpression_5= ruleGBraceExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getGPrimaryExpressionAccess().getGBraceExpressionParserRuleCall_5()); 
                          
                    }
                    pushFollow(FOLLOW_ruleGBraceExpression_in_ruleGPrimaryExpression3771);
                    this_GBraceExpression_5=ruleGBraceExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_GBraceExpression_5; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleGPrimaryExpression"


    // $ANTLR start "entryRuleGStringExpression"
    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1786:1: entryRuleGStringExpression returns [EObject current=null] : iv_ruleGStringExpression= ruleGStringExpression EOF ;
    public final EObject entryRuleGStringExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGStringExpression = null;


        try {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1787:2: (iv_ruleGStringExpression= ruleGStringExpression EOF )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1788:2: iv_ruleGStringExpression= ruleGStringExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGStringExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleGStringExpression_in_entryRuleGStringExpression3806);
            iv_ruleGStringExpression=ruleGStringExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGStringExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleGStringExpression3816); if (state.failed) return current;

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
    // $ANTLR end "entryRuleGStringExpression"


    // $ANTLR start "ruleGStringExpression"
    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1795:1: ruleGStringExpression returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleGStringExpression() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;

         enterRule(); 
            
        try {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1798:28: ( ( () ( (lv_value_1_0= RULE_STRING ) ) ) )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1799:1: ( () ( (lv_value_1_0= RULE_STRING ) ) )
            {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1799:1: ( () ( (lv_value_1_0= RULE_STRING ) ) )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1799:2: () ( (lv_value_1_0= RULE_STRING ) )
            {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1799:2: ()
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1800:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getGStringExpressionAccess().getGStringExpressionAction_0(),
                          current);
                  
            }

            }

            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1805:2: ( (lv_value_1_0= RULE_STRING ) )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1806:1: (lv_value_1_0= RULE_STRING )
            {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1806:1: (lv_value_1_0= RULE_STRING )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1807:3: lv_value_1_0= RULE_STRING
            {
            lv_value_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleGStringExpression3867); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_value_1_0, grammarAccess.getGStringExpressionAccess().getValueSTRINGTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getGStringExpressionRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"value",
                      		lv_value_1_0, 
                      		"STRING");
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleGStringExpression"


    // $ANTLR start "entryRuleGBooleanExpression"
    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1831:1: entryRuleGBooleanExpression returns [EObject current=null] : iv_ruleGBooleanExpression= ruleGBooleanExpression EOF ;
    public final EObject entryRuleGBooleanExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGBooleanExpression = null;


        try {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1832:2: (iv_ruleGBooleanExpression= ruleGBooleanExpression EOF )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1833:2: iv_ruleGBooleanExpression= ruleGBooleanExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGBooleanExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleGBooleanExpression_in_entryRuleGBooleanExpression3908);
            iv_ruleGBooleanExpression=ruleGBooleanExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGBooleanExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleGBooleanExpression3918); if (state.failed) return current;

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
    // $ANTLR end "entryRuleGBooleanExpression"


    // $ANTLR start "ruleGBooleanExpression"
    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1840:1: ruleGBooleanExpression returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_BOOLEAN ) ) ) ;
    public final EObject ruleGBooleanExpression() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;

         enterRule(); 
            
        try {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1843:28: ( ( () ( (lv_value_1_0= RULE_BOOLEAN ) ) ) )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1844:1: ( () ( (lv_value_1_0= RULE_BOOLEAN ) ) )
            {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1844:1: ( () ( (lv_value_1_0= RULE_BOOLEAN ) ) )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1844:2: () ( (lv_value_1_0= RULE_BOOLEAN ) )
            {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1844:2: ()
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1845:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getGBooleanExpressionAccess().getGBooleanExpressionAction_0(),
                          current);
                  
            }

            }

            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1850:2: ( (lv_value_1_0= RULE_BOOLEAN ) )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1851:1: (lv_value_1_0= RULE_BOOLEAN )
            {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1851:1: (lv_value_1_0= RULE_BOOLEAN )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1852:3: lv_value_1_0= RULE_BOOLEAN
            {
            lv_value_1_0=(Token)match(input,RULE_BOOLEAN,FOLLOW_RULE_BOOLEAN_in_ruleGBooleanExpression3969); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_value_1_0, grammarAccess.getGBooleanExpressionAccess().getValueBOOLEANTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getGBooleanExpressionRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"value",
                      		lv_value_1_0, 
                      		"BOOLEAN");
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleGBooleanExpression"


    // $ANTLR start "entryRuleGNumericExpression"
    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1876:1: entryRuleGNumericExpression returns [EObject current=null] : iv_ruleGNumericExpression= ruleGNumericExpression EOF ;
    public final EObject entryRuleGNumericExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGNumericExpression = null;


        try {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1877:2: (iv_ruleGNumericExpression= ruleGNumericExpression EOF )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1878:2: iv_ruleGNumericExpression= ruleGNumericExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGNumericExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleGNumericExpression_in_entryRuleGNumericExpression4010);
            iv_ruleGNumericExpression=ruleGNumericExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGNumericExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleGNumericExpression4020); if (state.failed) return current;

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
    // $ANTLR end "entryRuleGNumericExpression"


    // $ANTLR start "ruleGNumericExpression"
    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1885:1: ruleGNumericExpression returns [EObject current=null] : (this_GIntegerExpression_0= ruleGIntegerExpression | this_GDoubleExpression_1= ruleGDoubleExpression ) ;
    public final EObject ruleGNumericExpression() throws RecognitionException {
        EObject current = null;

        EObject this_GIntegerExpression_0 = null;

        EObject this_GDoubleExpression_1 = null;


         enterRule(); 
            
        try {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1888:28: ( (this_GIntegerExpression_0= ruleGIntegerExpression | this_GDoubleExpression_1= ruleGDoubleExpression ) )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1889:1: (this_GIntegerExpression_0= ruleGIntegerExpression | this_GDoubleExpression_1= ruleGDoubleExpression )
            {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1889:1: (this_GIntegerExpression_0= ruleGIntegerExpression | this_GDoubleExpression_1= ruleGDoubleExpression )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==RULE_INT) ) {
                alt25=1;
            }
            else if ( (LA25_0==RULE_DOUBLE) ) {
                alt25=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }
            switch (alt25) {
                case 1 :
                    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1890:5: this_GIntegerExpression_0= ruleGIntegerExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getGNumericExpressionAccess().getGIntegerExpressionParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleGIntegerExpression_in_ruleGNumericExpression4067);
                    this_GIntegerExpression_0=ruleGIntegerExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_GIntegerExpression_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1900:5: this_GDoubleExpression_1= ruleGDoubleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getGNumericExpressionAccess().getGDoubleExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleGDoubleExpression_in_ruleGNumericExpression4094);
                    this_GDoubleExpression_1=ruleGDoubleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_GDoubleExpression_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleGNumericExpression"


    // $ANTLR start "entryRuleGIntegerExpression"
    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1916:1: entryRuleGIntegerExpression returns [EObject current=null] : iv_ruleGIntegerExpression= ruleGIntegerExpression EOF ;
    public final EObject entryRuleGIntegerExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGIntegerExpression = null;


        try {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1917:2: (iv_ruleGIntegerExpression= ruleGIntegerExpression EOF )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1918:2: iv_ruleGIntegerExpression= ruleGIntegerExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGIntegerExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleGIntegerExpression_in_entryRuleGIntegerExpression4129);
            iv_ruleGIntegerExpression=ruleGIntegerExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGIntegerExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleGIntegerExpression4139); if (state.failed) return current;

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
    // $ANTLR end "entryRuleGIntegerExpression"


    // $ANTLR start "ruleGIntegerExpression"
    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1925:1: ruleGIntegerExpression returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_INT ) ) ) ;
    public final EObject ruleGIntegerExpression() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;

         enterRule(); 
            
        try {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1928:28: ( ( () ( (lv_value_1_0= RULE_INT ) ) ) )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1929:1: ( () ( (lv_value_1_0= RULE_INT ) ) )
            {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1929:1: ( () ( (lv_value_1_0= RULE_INT ) ) )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1929:2: () ( (lv_value_1_0= RULE_INT ) )
            {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1929:2: ()
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1930:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getGIntegerExpressionAccess().getGIntegerExpressionAction_0(),
                          current);
                  
            }

            }

            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1935:2: ( (lv_value_1_0= RULE_INT ) )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1936:1: (lv_value_1_0= RULE_INT )
            {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1936:1: (lv_value_1_0= RULE_INT )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1937:3: lv_value_1_0= RULE_INT
            {
            lv_value_1_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleGIntegerExpression4190); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_value_1_0, grammarAccess.getGIntegerExpressionAccess().getValueINTTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getGIntegerExpressionRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"value",
                      		lv_value_1_0, 
                      		"INT");
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleGIntegerExpression"


    // $ANTLR start "entryRuleGDoubleExpression"
    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1961:1: entryRuleGDoubleExpression returns [EObject current=null] : iv_ruleGDoubleExpression= ruleGDoubleExpression EOF ;
    public final EObject entryRuleGDoubleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGDoubleExpression = null;


        try {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1962:2: (iv_ruleGDoubleExpression= ruleGDoubleExpression EOF )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1963:2: iv_ruleGDoubleExpression= ruleGDoubleExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGDoubleExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleGDoubleExpression_in_entryRuleGDoubleExpression4231);
            iv_ruleGDoubleExpression=ruleGDoubleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGDoubleExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleGDoubleExpression4241); if (state.failed) return current;

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
    // $ANTLR end "entryRuleGDoubleExpression"


    // $ANTLR start "ruleGDoubleExpression"
    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1970:1: ruleGDoubleExpression returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_DOUBLE ) ) ) ;
    public final EObject ruleGDoubleExpression() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;

         enterRule(); 
            
        try {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1973:28: ( ( () ( (lv_value_1_0= RULE_DOUBLE ) ) ) )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1974:1: ( () ( (lv_value_1_0= RULE_DOUBLE ) ) )
            {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1974:1: ( () ( (lv_value_1_0= RULE_DOUBLE ) ) )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1974:2: () ( (lv_value_1_0= RULE_DOUBLE ) )
            {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1974:2: ()
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1975:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getGDoubleExpressionAccess().getGDoubleExpressionAction_0(),
                          current);
                  
            }

            }

            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1980:2: ( (lv_value_1_0= RULE_DOUBLE ) )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1981:1: (lv_value_1_0= RULE_DOUBLE )
            {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1981:1: (lv_value_1_0= RULE_DOUBLE )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:1982:3: lv_value_1_0= RULE_DOUBLE
            {
            lv_value_1_0=(Token)match(input,RULE_DOUBLE,FOLLOW_RULE_DOUBLE_in_ruleGDoubleExpression4292); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_value_1_0, grammarAccess.getGDoubleExpressionAccess().getValueDOUBLETerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getGDoubleExpressionRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"value",
                      		lv_value_1_0, 
                      		"DOUBLE");
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleGDoubleExpression"


    // $ANTLR start "entryRuleGEnumLiteralExpression"
    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2006:1: entryRuleGEnumLiteralExpression returns [EObject current=null] : iv_ruleGEnumLiteralExpression= ruleGEnumLiteralExpression EOF ;
    public final EObject entryRuleGEnumLiteralExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGEnumLiteralExpression = null;


        try {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2007:2: (iv_ruleGEnumLiteralExpression= ruleGEnumLiteralExpression EOF )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2008:2: iv_ruleGEnumLiteralExpression= ruleGEnumLiteralExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGEnumLiteralExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleGEnumLiteralExpression_in_entryRuleGEnumLiteralExpression4333);
            iv_ruleGEnumLiteralExpression=ruleGEnumLiteralExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGEnumLiteralExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleGEnumLiteralExpression4343); if (state.failed) return current;

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
    // $ANTLR end "entryRuleGEnumLiteralExpression"


    // $ANTLR start "ruleGEnumLiteralExpression"
    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2015:1: ruleGEnumLiteralExpression returns [EObject current=null] : ( () otherlv_1= '#' ( ( ruleQualifiedName ) ) ) ;
    public final EObject ruleGEnumLiteralExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2018:28: ( ( () otherlv_1= '#' ( ( ruleQualifiedName ) ) ) )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2019:1: ( () otherlv_1= '#' ( ( ruleQualifiedName ) ) )
            {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2019:1: ( () otherlv_1= '#' ( ( ruleQualifiedName ) ) )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2019:2: () otherlv_1= '#' ( ( ruleQualifiedName ) )
            {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2019:2: ()
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2020:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getGEnumLiteralExpressionAccess().getGEnumLiteralExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,33,FOLLOW_33_in_ruleGEnumLiteralExpression4389); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getGEnumLiteralExpressionAccess().getNumberSignKeyword_1());
                  
            }
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2029:1: ( ( ruleQualifiedName ) )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2030:1: ( ruleQualifiedName )
            {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2030:1: ( ruleQualifiedName )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2031:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getGEnumLiteralExpressionRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getGEnumLiteralExpressionAccess().getValueEEnumLiteralCrossReference_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleGEnumLiteralExpression4412);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleGEnumLiteralExpression"


    // $ANTLR start "entryRuleGIfExpression"
    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2052:1: entryRuleGIfExpression returns [EObject current=null] : iv_ruleGIfExpression= ruleGIfExpression EOF ;
    public final EObject entryRuleGIfExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGIfExpression = null;


        try {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2053:2: (iv_ruleGIfExpression= ruleGIfExpression EOF )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2054:2: iv_ruleGIfExpression= ruleGIfExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGIfExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleGIfExpression_in_entryRuleGIfExpression4448);
            iv_ruleGIfExpression=ruleGIfExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGIfExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleGIfExpression4458); if (state.failed) return current;

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
    // $ANTLR end "entryRuleGIfExpression"


    // $ANTLR start "ruleGIfExpression"
    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2061:1: ruleGIfExpression returns [EObject current=null] : ( () otherlv_1= 'if' ( (lv_condition_2_0= ruleGExpression ) ) otherlv_3= 'then' ( (lv_thenExpression_4_0= ruleGExpression ) ) otherlv_5= 'else' ( (lv_elseExpression_6_0= ruleGExpression ) ) otherlv_7= 'endif' ) ;
    public final EObject ruleGIfExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_condition_2_0 = null;

        EObject lv_thenExpression_4_0 = null;

        EObject lv_elseExpression_6_0 = null;


         enterRule(); 
            
        try {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2064:28: ( ( () otherlv_1= 'if' ( (lv_condition_2_0= ruleGExpression ) ) otherlv_3= 'then' ( (lv_thenExpression_4_0= ruleGExpression ) ) otherlv_5= 'else' ( (lv_elseExpression_6_0= ruleGExpression ) ) otherlv_7= 'endif' ) )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2065:1: ( () otherlv_1= 'if' ( (lv_condition_2_0= ruleGExpression ) ) otherlv_3= 'then' ( (lv_thenExpression_4_0= ruleGExpression ) ) otherlv_5= 'else' ( (lv_elseExpression_6_0= ruleGExpression ) ) otherlv_7= 'endif' )
            {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2065:1: ( () otherlv_1= 'if' ( (lv_condition_2_0= ruleGExpression ) ) otherlv_3= 'then' ( (lv_thenExpression_4_0= ruleGExpression ) ) otherlv_5= 'else' ( (lv_elseExpression_6_0= ruleGExpression ) ) otherlv_7= 'endif' )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2065:2: () otherlv_1= 'if' ( (lv_condition_2_0= ruleGExpression ) ) otherlv_3= 'then' ( (lv_thenExpression_4_0= ruleGExpression ) ) otherlv_5= 'else' ( (lv_elseExpression_6_0= ruleGExpression ) ) otherlv_7= 'endif'
            {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2065:2: ()
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2066:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getGIfExpressionAccess().getGIfExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,34,FOLLOW_34_in_ruleGIfExpression4504); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getGIfExpressionAccess().getIfKeyword_1());
                  
            }
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2075:1: ( (lv_condition_2_0= ruleGExpression ) )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2076:1: (lv_condition_2_0= ruleGExpression )
            {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2076:1: (lv_condition_2_0= ruleGExpression )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2077:3: lv_condition_2_0= ruleGExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getGIfExpressionAccess().getConditionGExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleGExpression_in_ruleGIfExpression4525);
            lv_condition_2_0=ruleGExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getGIfExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"condition",
                      		lv_condition_2_0, 
                      		"GExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,35,FOLLOW_35_in_ruleGIfExpression4537); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getGIfExpressionAccess().getThenKeyword_3());
                  
            }
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2097:1: ( (lv_thenExpression_4_0= ruleGExpression ) )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2098:1: (lv_thenExpression_4_0= ruleGExpression )
            {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2098:1: (lv_thenExpression_4_0= ruleGExpression )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2099:3: lv_thenExpression_4_0= ruleGExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getGIfExpressionAccess().getThenExpressionGExpressionParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleGExpression_in_ruleGIfExpression4558);
            lv_thenExpression_4_0=ruleGExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getGIfExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"thenExpression",
                      		lv_thenExpression_4_0, 
                      		"GExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_5=(Token)match(input,36,FOLLOW_36_in_ruleGIfExpression4570); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getGIfExpressionAccess().getElseKeyword_5());
                  
            }
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2119:1: ( (lv_elseExpression_6_0= ruleGExpression ) )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2120:1: (lv_elseExpression_6_0= ruleGExpression )
            {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2120:1: (lv_elseExpression_6_0= ruleGExpression )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2121:3: lv_elseExpression_6_0= ruleGExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getGIfExpressionAccess().getElseExpressionGExpressionParserRuleCall_6_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleGExpression_in_ruleGIfExpression4591);
            lv_elseExpression_6_0=ruleGExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getGIfExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"elseExpression",
                      		lv_elseExpression_6_0, 
                      		"GExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_7=(Token)match(input,37,FOLLOW_37_in_ruleGIfExpression4603); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_7, grammarAccess.getGIfExpressionAccess().getEndifKeyword_7());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleGIfExpression"


    // $ANTLR start "entryRuleGBraceExpression"
    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2149:1: entryRuleGBraceExpression returns [EObject current=null] : iv_ruleGBraceExpression= ruleGBraceExpression EOF ;
    public final EObject entryRuleGBraceExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGBraceExpression = null;


        try {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2150:2: (iv_ruleGBraceExpression= ruleGBraceExpression EOF )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2151:2: iv_ruleGBraceExpression= ruleGBraceExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGBraceExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleGBraceExpression_in_entryRuleGBraceExpression4639);
            iv_ruleGBraceExpression=ruleGBraceExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGBraceExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleGBraceExpression4649); if (state.failed) return current;

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
    // $ANTLR end "entryRuleGBraceExpression"


    // $ANTLR start "ruleGBraceExpression"
    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2158:1: ruleGBraceExpression returns [EObject current=null] : ( () otherlv_1= '(' ( (lv_innerExpression_2_0= ruleGExpression ) ) otherlv_3= ')' ) ;
    public final EObject ruleGBraceExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_innerExpression_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2161:28: ( ( () otherlv_1= '(' ( (lv_innerExpression_2_0= ruleGExpression ) ) otherlv_3= ')' ) )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2162:1: ( () otherlv_1= '(' ( (lv_innerExpression_2_0= ruleGExpression ) ) otherlv_3= ')' )
            {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2162:1: ( () otherlv_1= '(' ( (lv_innerExpression_2_0= ruleGExpression ) ) otherlv_3= ')' )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2162:2: () otherlv_1= '(' ( (lv_innerExpression_2_0= ruleGExpression ) ) otherlv_3= ')'
            {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2162:2: ()
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2163:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getGBraceExpressionAccess().getGBraceExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,18,FOLLOW_18_in_ruleGBraceExpression4695); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getGBraceExpressionAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2172:1: ( (lv_innerExpression_2_0= ruleGExpression ) )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2173:1: (lv_innerExpression_2_0= ruleGExpression )
            {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2173:1: (lv_innerExpression_2_0= ruleGExpression )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2174:3: lv_innerExpression_2_0= ruleGExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getGBraceExpressionAccess().getInnerExpressionGExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleGExpression_in_ruleGBraceExpression4716);
            lv_innerExpression_2_0=ruleGExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getGBraceExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"innerExpression",
                      		lv_innerExpression_2_0, 
                      		"GExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,20,FOLLOW_20_in_ruleGBraceExpression4728); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getGBraceExpressionAccess().getRightParenthesisKeyword_3());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleGBraceExpression"


    // $ANTLR start "entryRuleNavigationOperator"
    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2202:1: entryRuleNavigationOperator returns [String current=null] : iv_ruleNavigationOperator= ruleNavigationOperator EOF ;
    public final String entryRuleNavigationOperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNavigationOperator = null;


        try {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2203:2: (iv_ruleNavigationOperator= ruleNavigationOperator EOF )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2204:2: iv_ruleNavigationOperator= ruleNavigationOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNavigationOperatorRule()); 
            }
            pushFollow(FOLLOW_ruleNavigationOperator_in_entryRuleNavigationOperator4765);
            iv_ruleNavigationOperator=ruleNavigationOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNavigationOperator.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNavigationOperator4776); if (state.failed) return current;

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
    // $ANTLR end "entryRuleNavigationOperator"


    // $ANTLR start "ruleNavigationOperator"
    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2211:1: ruleNavigationOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '.' | kw= '->' ) ;
    public final AntlrDatatypeRuleToken ruleNavigationOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2214:28: ( (kw= '.' | kw= '->' ) )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2215:1: (kw= '.' | kw= '->' )
            {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2215:1: (kw= '.' | kw= '->' )
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==38) ) {
                alt26=1;
            }
            else if ( (LA26_0==39) ) {
                alt26=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }
            switch (alt26) {
                case 1 :
                    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2216:2: kw= '.'
                    {
                    kw=(Token)match(input,38,FOLLOW_38_in_ruleNavigationOperator4814); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getNavigationOperatorAccess().getFullStopKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2223:2: kw= '->'
                    {
                    kw=(Token)match(input,39,FOLLOW_39_in_ruleNavigationOperator4833); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getNavigationOperatorAccess().getHyphenMinusGreaterThanSignKeyword_1()); 
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleNavigationOperator"


    // $ANTLR start "entryRuleQualifiedName"
    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2236:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2237:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2238:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName4874);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedName.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName4885); if (state.failed) return current;

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
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2245:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2248:28: ( (this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )* ) )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2249:1: (this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )* )
            {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2249:1: (this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )* )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2249:6: this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName4925); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
                  
            }
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2256:1: ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==38) ) {
                    int LA27_2 = input.LA(2);

                    if ( (LA27_2==RULE_ID) ) {
                        int LA27_3 = input.LA(3);

                        if ( (synpred1_InternalBCOoL()) ) {
                            alt27=1;
                        }


                    }


                }


                switch (alt27) {
            	case 1 :
            	    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2256:2: ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID
            	    {
            	    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2256:2: ( ( '.' )=>kw= '.' )
            	    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2256:3: ( '.' )=>kw= '.'
            	    {
            	    kw=(Token)match(input,38,FOLLOW_38_in_ruleQualifiedName4953); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            	          
            	    }

            	    }

            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName4969); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_ID_2);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "ruleGAndOperator"
    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2279:1: ruleGAndOperator returns [Enumerator current=null] : (enumLiteral_0= 'and' ) ;
    public final Enumerator ruleGAndOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;

         enterRule(); 
        try {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2281:28: ( (enumLiteral_0= 'and' ) )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2282:1: (enumLiteral_0= 'and' )
            {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2282:1: (enumLiteral_0= 'and' )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2282:3: enumLiteral_0= 'and'
            {
            enumLiteral_0=(Token)match(input,40,FOLLOW_40_in_ruleGAndOperator5029); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current = grammarAccess.getGAndOperatorAccess().getANDEnumLiteralDeclaration().getEnumLiteral().getInstance();
                      newLeafNode(enumLiteral_0, grammarAccess.getGAndOperatorAccess().getANDEnumLiteralDeclaration()); 
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleGAndOperator"


    // $ANTLR start "ruleGXorOperator"
    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2292:1: ruleGXorOperator returns [Enumerator current=null] : (enumLiteral_0= 'xor' ) ;
    public final Enumerator ruleGXorOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;

         enterRule(); 
        try {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2294:28: ( (enumLiteral_0= 'xor' ) )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2295:1: (enumLiteral_0= 'xor' )
            {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2295:1: (enumLiteral_0= 'xor' )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2295:3: enumLiteral_0= 'xor'
            {
            enumLiteral_0=(Token)match(input,41,FOLLOW_41_in_ruleGXorOperator5072); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current = grammarAccess.getGXorOperatorAccess().getXOREnumLiteralDeclaration().getEnumLiteral().getInstance();
                      newLeafNode(enumLiteral_0, grammarAccess.getGXorOperatorAccess().getXOREnumLiteralDeclaration()); 
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleGXorOperator"


    // $ANTLR start "ruleGOrOperator"
    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2305:1: ruleGOrOperator returns [Enumerator current=null] : (enumLiteral_0= 'or' ) ;
    public final Enumerator ruleGOrOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;

         enterRule(); 
        try {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2307:28: ( (enumLiteral_0= 'or' ) )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2308:1: (enumLiteral_0= 'or' )
            {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2308:1: (enumLiteral_0= 'or' )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2308:3: enumLiteral_0= 'or'
            {
            enumLiteral_0=(Token)match(input,42,FOLLOW_42_in_ruleGOrOperator5115); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current = grammarAccess.getGOrOperatorAccess().getOREnumLiteralDeclaration().getEnumLiteral().getInstance();
                      newLeafNode(enumLiteral_0, grammarAccess.getGOrOperatorAccess().getOREnumLiteralDeclaration()); 
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleGOrOperator"


    // $ANTLR start "ruleGEqualityOperator"
    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2318:1: ruleGEqualityOperator returns [Enumerator current=null] : ( (enumLiteral_0= '=' ) | (enumLiteral_1= '<>' ) ) ;
    public final Enumerator ruleGEqualityOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2320:28: ( ( (enumLiteral_0= '=' ) | (enumLiteral_1= '<>' ) ) )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2321:1: ( (enumLiteral_0= '=' ) | (enumLiteral_1= '<>' ) )
            {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2321:1: ( (enumLiteral_0= '=' ) | (enumLiteral_1= '<>' ) )
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==28) ) {
                alt28=1;
            }
            else if ( (LA28_0==43) ) {
                alt28=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }
            switch (alt28) {
                case 1 :
                    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2321:2: (enumLiteral_0= '=' )
                    {
                    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2321:2: (enumLiteral_0= '=' )
                    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2321:4: enumLiteral_0= '='
                    {
                    enumLiteral_0=(Token)match(input,28,FOLLOW_28_in_ruleGEqualityOperator5159); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getGEqualityOperatorAccess().getEQUALEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getGEqualityOperatorAccess().getEQUALEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2327:6: (enumLiteral_1= '<>' )
                    {
                    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2327:6: (enumLiteral_1= '<>' )
                    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2327:8: enumLiteral_1= '<>'
                    {
                    enumLiteral_1=(Token)match(input,43,FOLLOW_43_in_ruleGEqualityOperator5176); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getGEqualityOperatorAccess().getNOTEQUALEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getGEqualityOperatorAccess().getNOTEQUALEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleGEqualityOperator"


    // $ANTLR start "ruleGRelationOperator"
    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2337:1: ruleGRelationOperator returns [Enumerator current=null] : ( (enumLiteral_0= '<' ) | (enumLiteral_1= '>' ) | (enumLiteral_2= '<=' ) | (enumLiteral_3= '>=' ) ) ;
    public final Enumerator ruleGRelationOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;

         enterRule(); 
        try {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2339:28: ( ( (enumLiteral_0= '<' ) | (enumLiteral_1= '>' ) | (enumLiteral_2= '<=' ) | (enumLiteral_3= '>=' ) ) )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2340:1: ( (enumLiteral_0= '<' ) | (enumLiteral_1= '>' ) | (enumLiteral_2= '<=' ) | (enumLiteral_3= '>=' ) )
            {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2340:1: ( (enumLiteral_0= '<' ) | (enumLiteral_1= '>' ) | (enumLiteral_2= '<=' ) | (enumLiteral_3= '>=' ) )
            int alt29=4;
            switch ( input.LA(1) ) {
            case 44:
                {
                alt29=1;
                }
                break;
            case 45:
                {
                alt29=2;
                }
                break;
            case 46:
                {
                alt29=3;
                }
                break;
            case 47:
                {
                alt29=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }

            switch (alt29) {
                case 1 :
                    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2340:2: (enumLiteral_0= '<' )
                    {
                    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2340:2: (enumLiteral_0= '<' )
                    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2340:4: enumLiteral_0= '<'
                    {
                    enumLiteral_0=(Token)match(input,44,FOLLOW_44_in_ruleGRelationOperator5221); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getGRelationOperatorAccess().getLESSEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getGRelationOperatorAccess().getLESSEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2346:6: (enumLiteral_1= '>' )
                    {
                    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2346:6: (enumLiteral_1= '>' )
                    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2346:8: enumLiteral_1= '>'
                    {
                    enumLiteral_1=(Token)match(input,45,FOLLOW_45_in_ruleGRelationOperator5238); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getGRelationOperatorAccess().getGREATEREnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getGRelationOperatorAccess().getGREATEREnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2352:6: (enumLiteral_2= '<=' )
                    {
                    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2352:6: (enumLiteral_2= '<=' )
                    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2352:8: enumLiteral_2= '<='
                    {
                    enumLiteral_2=(Token)match(input,46,FOLLOW_46_in_ruleGRelationOperator5255); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getGRelationOperatorAccess().getLESSEQUALEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getGRelationOperatorAccess().getLESSEQUALEnumLiteralDeclaration_2()); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2358:6: (enumLiteral_3= '>=' )
                    {
                    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2358:6: (enumLiteral_3= '>=' )
                    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2358:8: enumLiteral_3= '>='
                    {
                    enumLiteral_3=(Token)match(input,47,FOLLOW_47_in_ruleGRelationOperator5272); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getGRelationOperatorAccess().getGREATEREQUALEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_3, grammarAccess.getGRelationOperatorAccess().getGREATEREQUALEnumLiteralDeclaration_3()); 
                          
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleGRelationOperator"


    // $ANTLR start "ruleGAdditionOperator"
    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2368:1: ruleGAdditionOperator returns [Enumerator current=null] : ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) ) ;
    public final Enumerator ruleGAdditionOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2370:28: ( ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) ) )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2371:1: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) )
            {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2371:1: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) )
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==48) ) {
                alt30=1;
            }
            else if ( (LA30_0==49) ) {
                alt30=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }
            switch (alt30) {
                case 1 :
                    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2371:2: (enumLiteral_0= '+' )
                    {
                    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2371:2: (enumLiteral_0= '+' )
                    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2371:4: enumLiteral_0= '+'
                    {
                    enumLiteral_0=(Token)match(input,48,FOLLOW_48_in_ruleGAdditionOperator5317); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getGAdditionOperatorAccess().getADDITIONEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getGAdditionOperatorAccess().getADDITIONEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2377:6: (enumLiteral_1= '-' )
                    {
                    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2377:6: (enumLiteral_1= '-' )
                    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2377:8: enumLiteral_1= '-'
                    {
                    enumLiteral_1=(Token)match(input,49,FOLLOW_49_in_ruleGAdditionOperator5334); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getGAdditionOperatorAccess().getSUBTRACTIONEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getGAdditionOperatorAccess().getSUBTRACTIONEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleGAdditionOperator"


    // $ANTLR start "ruleGMultiplicationOperator"
    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2387:1: ruleGMultiplicationOperator returns [Enumerator current=null] : ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) ) ;
    public final Enumerator ruleGMultiplicationOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2389:28: ( ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) ) )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2390:1: ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) )
            {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2390:1: ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) )
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==50) ) {
                alt31=1;
            }
            else if ( (LA31_0==51) ) {
                alt31=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }
            switch (alt31) {
                case 1 :
                    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2390:2: (enumLiteral_0= '*' )
                    {
                    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2390:2: (enumLiteral_0= '*' )
                    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2390:4: enumLiteral_0= '*'
                    {
                    enumLiteral_0=(Token)match(input,50,FOLLOW_50_in_ruleGMultiplicationOperator5379); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getGMultiplicationOperatorAccess().getMULTIPLICATIONEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getGMultiplicationOperatorAccess().getMULTIPLICATIONEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2396:6: (enumLiteral_1= '/' )
                    {
                    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2396:6: (enumLiteral_1= '/' )
                    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2396:8: enumLiteral_1= '/'
                    {
                    enumLiteral_1=(Token)match(input,51,FOLLOW_51_in_ruleGMultiplicationOperator5396); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getGMultiplicationOperatorAccess().getDIVISIONEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getGMultiplicationOperatorAccess().getDIVISIONEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleGMultiplicationOperator"


    // $ANTLR start "ruleGNegationOperator"
    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2406:1: ruleGNegationOperator returns [Enumerator current=null] : ( (enumLiteral_0= 'not' ) | (enumLiteral_1= '~' ) ) ;
    public final Enumerator ruleGNegationOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2408:28: ( ( (enumLiteral_0= 'not' ) | (enumLiteral_1= '~' ) ) )
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2409:1: ( (enumLiteral_0= 'not' ) | (enumLiteral_1= '~' ) )
            {
            // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2409:1: ( (enumLiteral_0= 'not' ) | (enumLiteral_1= '~' ) )
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==52) ) {
                alt32=1;
            }
            else if ( (LA32_0==53) ) {
                alt32=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;
            }
            switch (alt32) {
                case 1 :
                    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2409:2: (enumLiteral_0= 'not' )
                    {
                    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2409:2: (enumLiteral_0= 'not' )
                    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2409:4: enumLiteral_0= 'not'
                    {
                    enumLiteral_0=(Token)match(input,52,FOLLOW_52_in_ruleGNegationOperator5441); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getGNegationOperatorAccess().getNEGATIONEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getGNegationOperatorAccess().getNEGATIONEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2415:6: (enumLiteral_1= '~' )
                    {
                    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2415:6: (enumLiteral_1= '~' )
                    // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2415:8: enumLiteral_1= '~'
                    {
                    enumLiteral_1=(Token)match(input,53,FOLLOW_53_in_ruleGNegationOperator5458); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getGNegationOperatorAccess().getMINUSEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getGNegationOperatorAccess().getMINUSEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleGNegationOperator"

    // $ANTLR start synpred1_InternalBCOoL
    public final void synpred1_InternalBCOoL_fragment() throws RecognitionException {   
        // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2256:3: ( '.' )
        // ../org.gemoc.bcool.model.xtext/src-gen/org/gemoc/bcool/model/xtext/parser/antlr/internal/InternalBCOoL.g:2257:2: '.'
        {
        match(input,38,FOLLOW_38_in_synpred1_InternalBCOoL4944); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred1_InternalBCOoL

    // Delegated rules

    public final boolean synpred1_InternalBCOoL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_InternalBCOoL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


 

    public static final BitSet FOLLOW_ruleBCoolSpec_in_entryRuleBCoolSpec75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBCoolSpec85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleBCoolSpec127 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_ruleImportLibRule_in_ruleBCoolSpec154 = new BitSet(new long[]{0x0000000060000000L});
    public static final BitSet FOLLOW_ruleImportInterfaceRule_in_ruleBCoolSpec176 = new BitSet(new long[]{0x0000000040002000L});
    public static final BitSet FOLLOW_ruleBCoolOperatorSpec_in_ruleBCoolSpec198 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_ruleBCoolOperatorSpec_in_entryRuleBCoolOperatorSpec235 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBCoolOperatorSpec245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleBCoolOperatorSpec282 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleBCoolOperatorSpec299 = new BitSet(new long[]{0x0000000000034000L});
    public static final BitSet FOLLOW_ruleglobalEventExpressionRule_in_ruleBCoolOperatorSpec325 = new BitSet(new long[]{0x0000000000034000L});
    public static final BitSet FOLLOW_ruleglobalDSEsRule_in_ruleBCoolOperatorSpec347 = new BitSet(new long[]{0x0000000000034000L});
    public static final BitSet FOLLOW_ruleBCoolCompositionRule_in_ruleBCoolOperatorSpec369 = new BitSet(new long[]{0x0000000000034002L});
    public static final BitSet FOLLOW_ruleglobalDSEsRule_in_entryRuleglobalDSEsRule406 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleglobalDSEsRule416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleglobalDSEsRule453 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleglobalDSEsRule470 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleglobalDSEsRule487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleglobalEventExpressionRule_in_entryRuleglobalEventExpressionRule523 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleglobalEventExpressionRule533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleglobalEventExpressionRule570 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleEventExpression_in_ruleglobalEventExpressionRule592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBCoolCompositionRule_in_entryRuleBCoolCompositionRule627 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBCoolCompositionRule637 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleBCoolCompositionRule674 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleBCoolCompositionRule691 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleBCoolCompositionRule708 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleBCoolOperatorArg_in_ruleBCoolCompositionRule729 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_19_in_ruleBCoolCompositionRule742 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleBCoolOperatorArg_in_ruleBCoolCompositionRule763 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_20_in_ruleBCoolCompositionRule777 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleBCoolCompositionRule789 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_ruleMatchingRule_in_ruleBCoolCompositionRule810 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleCoordinationRule_in_ruleBCoolCompositionRule831 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleBCoolCompositionRule843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBCoolOperatorArg_in_entryRuleBCoolOperatorArg879 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBCoolOperatorArg889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleBCoolOperatorArg931 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleBCoolOperatorArg948 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleBCoolOperatorArg968 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleBCoolOperatorArg980 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleBCoolOperatorArg1000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMatchingRule_in_entryRuleMatchingRule1036 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMatchingRule1046 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleMatchingRule1083 = new BitSet(new long[]{0x00300006000401F0L});
    public static final BitSet FOLLOW_ruleGExpression_in_ruleMatchingRule1104 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleMatchingRule1116 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleMatchingRule1128 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_27_in_ruleMatchingRule1141 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleEventExpression_in_ruleMatchingRule1162 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleMatchingRule1174 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_ruleEventExpression_in_entryRuleEventExpression1212 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEventExpression1222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEventExpression1264 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleEventExpression1281 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleEventExpression1304 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleEventExpression1316 = new BitSet(new long[]{0x0000000000100010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEventExpression1337 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_19_in_ruleEventExpression1350 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEventExpression1370 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_20_in_ruleEventExpression1386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCoordinationRule_in_entryRuleCoordinationRule1422 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCoordinationRule1432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEventRelation_in_ruleCoordinationRule1477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEventRelation_in_entryRuleEventRelation1512 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEventRelation1522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleEventRelation1579 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleEventRelation1591 = new BitSet(new long[]{0x0000000000100010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEventRelation1612 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_19_in_ruleEventRelation1625 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEventRelation1645 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_20_in_ruleEventRelation1661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImportLibRule_in_entryRuleImportLibRule1697 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImportLibRule1707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleImportLibRule1744 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleImportLibRule1761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImportInterfaceRule_in_entryRuleImportInterfaceRule1802 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImportInterfaceRule1812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleImportInterfaceRule1849 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleImportInterfaceRule1866 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleImportInterfaceRule1883 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleImportInterfaceRule1900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGImportStatement_in_entryRuleGImportStatement1943 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGImportStatement1953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleGImportStatement1990 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleGImportStatement2007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGExpression_in_entryRuleGExpression2048 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGExpression2058 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGOrExpression_in_ruleGExpression2104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGOrExpression_in_entryRuleGOrExpression2138 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGOrExpression2148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGXorExpression_in_ruleGOrExpression2195 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_ruleGOrOperator_in_ruleGOrExpression2225 = new BitSet(new long[]{0x00300006000401F0L});
    public static final BitSet FOLLOW_ruleGXorExpression_in_ruleGOrExpression2246 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_ruleGXorExpression_in_entryRuleGXorExpression2284 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGXorExpression2294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGAndExpression_in_ruleGXorExpression2341 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_ruleGXorOperator_in_ruleGXorExpression2371 = new BitSet(new long[]{0x00300006000401F0L});
    public static final BitSet FOLLOW_ruleGAndExpression_in_ruleGXorExpression2392 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_ruleGAndExpression_in_entryRuleGAndExpression2430 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGAndExpression2440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGEqualityExpression_in_ruleGAndExpression2487 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_ruleGAndOperator_in_ruleGAndExpression2517 = new BitSet(new long[]{0x00300006000401F0L});
    public static final BitSet FOLLOW_ruleGEqualityExpression_in_ruleGAndExpression2538 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_ruleGEqualityExpression_in_entryRuleGEqualityExpression2576 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGEqualityExpression2586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGRelationExpression_in_ruleGEqualityExpression2633 = new BitSet(new long[]{0x0000080010000002L});
    public static final BitSet FOLLOW_ruleGEqualityOperator_in_ruleGEqualityExpression2663 = new BitSet(new long[]{0x00300006000401F0L});
    public static final BitSet FOLLOW_ruleGRelationExpression_in_ruleGEqualityExpression2684 = new BitSet(new long[]{0x0000080010000002L});
    public static final BitSet FOLLOW_ruleGRelationExpression_in_entryRuleGRelationExpression2722 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGRelationExpression2732 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGAdditionExpression_in_ruleGRelationExpression2779 = new BitSet(new long[]{0x0000F00000000002L});
    public static final BitSet FOLLOW_ruleGRelationOperator_in_ruleGRelationExpression2809 = new BitSet(new long[]{0x00300006000401F0L});
    public static final BitSet FOLLOW_ruleGAdditionExpression_in_ruleGRelationExpression2830 = new BitSet(new long[]{0x0000F00000000002L});
    public static final BitSet FOLLOW_ruleGAdditionExpression_in_entryRuleGAdditionExpression2868 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGAdditionExpression2878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGMultiplicationExpression_in_ruleGAdditionExpression2925 = new BitSet(new long[]{0x0003000000000002L});
    public static final BitSet FOLLOW_ruleGAdditionOperator_in_ruleGAdditionExpression2955 = new BitSet(new long[]{0x00300006000401F0L});
    public static final BitSet FOLLOW_ruleGMultiplicationExpression_in_ruleGAdditionExpression2976 = new BitSet(new long[]{0x0003000000000002L});
    public static final BitSet FOLLOW_ruleGMultiplicationExpression_in_entryRuleGMultiplicationExpression3014 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGMultiplicationExpression3024 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGNegationExpression_in_ruleGMultiplicationExpression3071 = new BitSet(new long[]{0x000C000000000002L});
    public static final BitSet FOLLOW_ruleGMultiplicationOperator_in_ruleGMultiplicationExpression3101 = new BitSet(new long[]{0x00300006000401F0L});
    public static final BitSet FOLLOW_ruleGNegationExpression_in_ruleGMultiplicationExpression3122 = new BitSet(new long[]{0x000C000000000002L});
    public static final BitSet FOLLOW_ruleGNegationExpression_in_entryRuleGNegationExpression3160 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGNegationExpression3170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGNavigationExpression_in_ruleGNegationExpression3217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGNegationOperator_in_ruleGNegationExpression3253 = new BitSet(new long[]{0x00000006000401F0L});
    public static final BitSet FOLLOW_ruleGNavigationExpression_in_ruleGNegationExpression3274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGNavigationExpression_in_entryRuleGNavigationExpression3311 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGNavigationExpression3321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGReferenceExpression_in_ruleGNavigationExpression3368 = new BitSet(new long[]{0x000000C000000002L});
    public static final BitSet FOLLOW_ruleNavigationOperator_in_ruleGNavigationExpression3393 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleGNavigationExpression3412 = new BitSet(new long[]{0x000000C000000002L});
    public static final BitSet FOLLOW_ruleGReferenceExpression_in_entryRuleGReferenceExpression3450 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGReferenceExpression3460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGPrimaryExpression_in_ruleGReferenceExpression3507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleGReferenceExpression3542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGPrimaryExpression_in_entryRuleGPrimaryExpression3579 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGPrimaryExpression3589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGStringExpression_in_ruleGPrimaryExpression3636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGBooleanExpression_in_ruleGPrimaryExpression3663 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGNumericExpression_in_ruleGPrimaryExpression3690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGEnumLiteralExpression_in_ruleGPrimaryExpression3717 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGIfExpression_in_ruleGPrimaryExpression3744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGBraceExpression_in_ruleGPrimaryExpression3771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGStringExpression_in_entryRuleGStringExpression3806 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGStringExpression3816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleGStringExpression3867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGBooleanExpression_in_entryRuleGBooleanExpression3908 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGBooleanExpression3918 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_BOOLEAN_in_ruleGBooleanExpression3969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGNumericExpression_in_entryRuleGNumericExpression4010 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGNumericExpression4020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGIntegerExpression_in_ruleGNumericExpression4067 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGDoubleExpression_in_ruleGNumericExpression4094 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGIntegerExpression_in_entryRuleGIntegerExpression4129 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGIntegerExpression4139 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleGIntegerExpression4190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGDoubleExpression_in_entryRuleGDoubleExpression4231 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGDoubleExpression4241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DOUBLE_in_ruleGDoubleExpression4292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGEnumLiteralExpression_in_entryRuleGEnumLiteralExpression4333 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGEnumLiteralExpression4343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleGEnumLiteralExpression4389 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleGEnumLiteralExpression4412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGIfExpression_in_entryRuleGIfExpression4448 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGIfExpression4458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleGIfExpression4504 = new BitSet(new long[]{0x00300006000401F0L});
    public static final BitSet FOLLOW_ruleGExpression_in_ruleGIfExpression4525 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_ruleGIfExpression4537 = new BitSet(new long[]{0x00300006000401F0L});
    public static final BitSet FOLLOW_ruleGExpression_in_ruleGIfExpression4558 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_ruleGIfExpression4570 = new BitSet(new long[]{0x00300006000401F0L});
    public static final BitSet FOLLOW_ruleGExpression_in_ruleGIfExpression4591 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_ruleGIfExpression4603 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGBraceExpression_in_entryRuleGBraceExpression4639 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGBraceExpression4649 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleGBraceExpression4695 = new BitSet(new long[]{0x00300006000401F0L});
    public static final BitSet FOLLOW_ruleGExpression_in_ruleGBraceExpression4716 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleGBraceExpression4728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNavigationOperator_in_entryRuleNavigationOperator4765 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNavigationOperator4776 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleNavigationOperator4814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleNavigationOperator4833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName4874 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName4885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName4925 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_38_in_ruleQualifiedName4953 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName4969 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_40_in_ruleGAndOperator5029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleGXorOperator5072 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleGOrOperator5115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleGEqualityOperator5159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleGEqualityOperator5176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleGRelationOperator5221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleGRelationOperator5238 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleGRelationOperator5255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruleGRelationOperator5272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleGAdditionOperator5317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleGAdditionOperator5334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_ruleGMultiplicationOperator5379 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_ruleGMultiplicationOperator5396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_ruleGNegationOperator5441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_ruleGNegationOperator5458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_synpred1_InternalBCOoL4944 = new BitSet(new long[]{0x0000000000000002L});

}