package org.gemoc.gel.parser.antlr.internal; 

import org.antlr.runtime.BitSet;
import org.antlr.runtime.EarlyExitException;
import org.antlr.runtime.NoViableAltException;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.RecognizerSharedState;
import org.antlr.runtime.Token;
import org.antlr.runtime.TokenStream;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.gemoc.gel.services.GELGrammarAccess;
@SuppressWarnings("all")
public class InternalGELParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_BOOLEAN", "RULE_DOUBLE", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'import'", "'DSE'", "':'", "'upon'", "'feedback'", "'end'", "'raises'", "'Composite'", "'forall'", "'{'", "'}'", "'where'", "'--->'", "'&'", "'|'", "'><'", "'+'", "'['", "']'", "'('", "')'", "','", "'=>'", "'default'", "'allow'", "'returning'", "'.'", "'#'", "'if'", "'then'", "'else'", "'endif'", "'->'", "'public'", "'private'", "'triggers'", "'interrupts'", "'blocking'", "'nonblocking'", "'and'", "'xor'", "'or'", "'='", "'<>'", "'<'", "'>'", "'<='", "'>='", "'-'", "'*'", "'/'", "'not'", "'~'"
    };
    public static final int RULE_BOOLEAN=7;
    public static final int RULE_ID=5;
    public static final int T__64=64;
    public static final int T__29=29;
    public static final int T__65=65;
    public static final int T__28=28;
    public static final int T__62=62;
    public static final int T__27=27;
    public static final int T__63=63;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=12;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int T__61=61;
    public static final int T__60=60;
    public static final int EOF=-1;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__19=19;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__16=16;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__15=15;
    public static final int T__53=53;
    public static final int T__18=18;
    public static final int T__54=54;
    public static final int T__17=17;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int T__59=59;
    public static final int RULE_INT=6;
    public static final int T__50=50;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int RULE_SL_COMMENT=10;
    public static final int RULE_DOUBLE=8;
    public static final int RULE_ML_COMMENT=9;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int RULE_STRING=4;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_WS=11;

    // delegates
    // delegators


        public InternalGELParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalGELParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalGELParser.tokenNames; }
    public String getGrammarFileName() { return "../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g"; }



     	private GELGrammarAccess grammarAccess;
     	
        public InternalGELParser(TokenStream input, GELGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "DomainSpecificEventsSpecification";	
       	}
       	
       	@Override
       	protected GELGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleDomainSpecificEventsSpecification"
    // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:68:1: entryRuleDomainSpecificEventsSpecification returns [EObject current=null] : iv_ruleDomainSpecificEventsSpecification= ruleDomainSpecificEventsSpecification EOF ;
    public final EObject entryRuleDomainSpecificEventsSpecification() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDomainSpecificEventsSpecification = null;


        try {
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:69:2: (iv_ruleDomainSpecificEventsSpecification= ruleDomainSpecificEventsSpecification EOF )
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:70:2: iv_ruleDomainSpecificEventsSpecification= ruleDomainSpecificEventsSpecification EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDomainSpecificEventsSpecificationRule()); 
            }
            pushFollow(FOLLOW_ruleDomainSpecificEventsSpecification_in_entryRuleDomainSpecificEventsSpecification75);
            iv_ruleDomainSpecificEventsSpecification=ruleDomainSpecificEventsSpecification();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDomainSpecificEventsSpecification; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDomainSpecificEventsSpecification85); if (state.failed) return current;

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
    // $ANTLR end "entryRuleDomainSpecificEventsSpecification"


    // $ANTLR start "ruleDomainSpecificEventsSpecification"
    // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:77:1: ruleDomainSpecificEventsSpecification returns [EObject current=null] : ( () ( (lv_imports_1_0= ruleImportStatement ) )* ( (lv_events_2_0= ruleDomainSpecificEvent ) )* ) ;
    public final EObject ruleDomainSpecificEventsSpecification() throws RecognitionException {
        EObject current = null;

        EObject lv_imports_1_0 = null;

        EObject lv_events_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:80:28: ( ( () ( (lv_imports_1_0= ruleImportStatement ) )* ( (lv_events_2_0= ruleDomainSpecificEvent ) )* ) )
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:81:1: ( () ( (lv_imports_1_0= ruleImportStatement ) )* ( (lv_events_2_0= ruleDomainSpecificEvent ) )* )
            {
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:81:1: ( () ( (lv_imports_1_0= ruleImportStatement ) )* ( (lv_events_2_0= ruleDomainSpecificEvent ) )* )
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:81:2: () ( (lv_imports_1_0= ruleImportStatement ) )* ( (lv_events_2_0= ruleDomainSpecificEvent ) )*
            {
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:81:2: ()
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:82:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getDomainSpecificEventsSpecificationAccess().getDomainSpecificEventsSpecificationAction_0(),
                          current);
                  
            }

            }

            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:87:2: ( (lv_imports_1_0= ruleImportStatement ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==13) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:88:1: (lv_imports_1_0= ruleImportStatement )
            	    {
            	    // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:88:1: (lv_imports_1_0= ruleImportStatement )
            	    // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:89:3: lv_imports_1_0= ruleImportStatement
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getDomainSpecificEventsSpecificationAccess().getImportsImportStatementParserRuleCall_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleImportStatement_in_ruleDomainSpecificEventsSpecification140);
            	    lv_imports_1_0=ruleImportStatement();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getDomainSpecificEventsSpecificationRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"imports",
            	              		lv_imports_1_0, 
            	              		"ImportStatement");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:105:3: ( (lv_events_2_0= ruleDomainSpecificEvent ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==14||LA2_0==20||(LA2_0>=46 && LA2_0<=47)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:106:1: (lv_events_2_0= ruleDomainSpecificEvent )
            	    {
            	    // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:106:1: (lv_events_2_0= ruleDomainSpecificEvent )
            	    // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:107:3: lv_events_2_0= ruleDomainSpecificEvent
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getDomainSpecificEventsSpecificationAccess().getEventsDomainSpecificEventParserRuleCall_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleDomainSpecificEvent_in_ruleDomainSpecificEventsSpecification162);
            	    lv_events_2_0=ruleDomainSpecificEvent();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getDomainSpecificEventsSpecificationRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"events",
            	              		lv_events_2_0, 
            	              		"DomainSpecificEvent");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
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
    // $ANTLR end "ruleDomainSpecificEventsSpecification"


    // $ANTLR start "entryRuleImportStatement"
    // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:131:1: entryRuleImportStatement returns [EObject current=null] : iv_ruleImportStatement= ruleImportStatement EOF ;
    public final EObject entryRuleImportStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImportStatement = null;


        try {
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:132:2: (iv_ruleImportStatement= ruleImportStatement EOF )
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:133:2: iv_ruleImportStatement= ruleImportStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getImportStatementRule()); 
            }
            pushFollow(FOLLOW_ruleImportStatement_in_entryRuleImportStatement199);
            iv_ruleImportStatement=ruleImportStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleImportStatement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleImportStatement209); if (state.failed) return current;

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
    // $ANTLR end "entryRuleImportStatement"


    // $ANTLR start "ruleImportStatement"
    // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:140:1: ruleImportStatement returns [EObject current=null] : (otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleImportStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_importURI_1_0=null;

         enterRule(); 
            
        try {
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:143:28: ( (otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) ) ) )
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:144:1: (otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) ) )
            {
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:144:1: (otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) ) )
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:144:3: otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,13,FOLLOW_13_in_ruleImportStatement246); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getImportStatementAccess().getImportKeyword_0());
                  
            }
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:148:1: ( (lv_importURI_1_0= RULE_STRING ) )
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:149:1: (lv_importURI_1_0= RULE_STRING )
            {
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:149:1: (lv_importURI_1_0= RULE_STRING )
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:150:3: lv_importURI_1_0= RULE_STRING
            {
            lv_importURI_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleImportStatement263); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_importURI_1_0, grammarAccess.getImportStatementAccess().getImportURISTRINGTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getImportStatementRule());
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
    // $ANTLR end "ruleImportStatement"


    // $ANTLR start "entryRuleDomainSpecificEvent"
    // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:174:1: entryRuleDomainSpecificEvent returns [EObject current=null] : iv_ruleDomainSpecificEvent= ruleDomainSpecificEvent EOF ;
    public final EObject entryRuleDomainSpecificEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDomainSpecificEvent = null;


        try {
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:175:2: (iv_ruleDomainSpecificEvent= ruleDomainSpecificEvent EOF )
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:176:2: iv_ruleDomainSpecificEvent= ruleDomainSpecificEvent EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDomainSpecificEventRule()); 
            }
            pushFollow(FOLLOW_ruleDomainSpecificEvent_in_entryRuleDomainSpecificEvent304);
            iv_ruleDomainSpecificEvent=ruleDomainSpecificEvent();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDomainSpecificEvent; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDomainSpecificEvent314); if (state.failed) return current;

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
    // $ANTLR end "entryRuleDomainSpecificEvent"


    // $ANTLR start "ruleDomainSpecificEvent"
    // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:183:1: ruleDomainSpecificEvent returns [EObject current=null] : (this_AtomicDomainSpecificEvent_0= ruleAtomicDomainSpecificEvent | this_CompositeDomainSpecificEvent_1= ruleCompositeDomainSpecificEvent ) ;
    public final EObject ruleDomainSpecificEvent() throws RecognitionException {
        EObject current = null;

        EObject this_AtomicDomainSpecificEvent_0 = null;

        EObject this_CompositeDomainSpecificEvent_1 = null;


         enterRule(); 
            
        try {
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:186:28: ( (this_AtomicDomainSpecificEvent_0= ruleAtomicDomainSpecificEvent | this_CompositeDomainSpecificEvent_1= ruleCompositeDomainSpecificEvent ) )
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:187:1: (this_AtomicDomainSpecificEvent_0= ruleAtomicDomainSpecificEvent | this_CompositeDomainSpecificEvent_1= ruleCompositeDomainSpecificEvent )
            {
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:187:1: (this_AtomicDomainSpecificEvent_0= ruleAtomicDomainSpecificEvent | this_CompositeDomainSpecificEvent_1= ruleCompositeDomainSpecificEvent )
            int alt3=2;
            switch ( input.LA(1) ) {
            case 46:
                {
                int LA3_1 = input.LA(2);

                if ( (LA3_1==20) ) {
                    alt3=2;
                }
                else if ( (LA3_1==14) ) {
                    alt3=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 1, input);

                    throw nvae;
                }
                }
                break;
            case 47:
                {
                int LA3_2 = input.LA(2);

                if ( (LA3_2==20) ) {
                    alt3=2;
                }
                else if ( (LA3_2==14) ) {
                    alt3=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 2, input);

                    throw nvae;
                }
                }
                break;
            case 14:
                {
                alt3=1;
                }
                break;
            case 20:
                {
                alt3=2;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:188:5: this_AtomicDomainSpecificEvent_0= ruleAtomicDomainSpecificEvent
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getDomainSpecificEventAccess().getAtomicDomainSpecificEventParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleAtomicDomainSpecificEvent_in_ruleDomainSpecificEvent361);
                    this_AtomicDomainSpecificEvent_0=ruleAtomicDomainSpecificEvent();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_AtomicDomainSpecificEvent_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:198:5: this_CompositeDomainSpecificEvent_1= ruleCompositeDomainSpecificEvent
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getDomainSpecificEventAccess().getCompositeDomainSpecificEventParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleCompositeDomainSpecificEvent_in_ruleDomainSpecificEvent388);
                    this_CompositeDomainSpecificEvent_1=ruleCompositeDomainSpecificEvent();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_CompositeDomainSpecificEvent_1; 
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
    // $ANTLR end "ruleDomainSpecificEvent"


    // $ANTLR start "entryRuleAtomicDomainSpecificEvent"
    // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:214:1: entryRuleAtomicDomainSpecificEvent returns [EObject current=null] : iv_ruleAtomicDomainSpecificEvent= ruleAtomicDomainSpecificEvent EOF ;
    public final EObject entryRuleAtomicDomainSpecificEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtomicDomainSpecificEvent = null;


        try {
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:215:2: (iv_ruleAtomicDomainSpecificEvent= ruleAtomicDomainSpecificEvent EOF )
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:216:2: iv_ruleAtomicDomainSpecificEvent= ruleAtomicDomainSpecificEvent EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAtomicDomainSpecificEventRule()); 
            }
            pushFollow(FOLLOW_ruleAtomicDomainSpecificEvent_in_entryRuleAtomicDomainSpecificEvent423);
            iv_ruleAtomicDomainSpecificEvent=ruleAtomicDomainSpecificEvent();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAtomicDomainSpecificEvent; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAtomicDomainSpecificEvent433); if (state.failed) return current;

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
    // $ANTLR end "entryRuleAtomicDomainSpecificEvent"


    // $ANTLR start "ruleAtomicDomainSpecificEvent"
    // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:223:1: ruleAtomicDomainSpecificEvent returns [EObject current=null] : ( () ( (lv_visibility_1_0= ruleVisibility ) )? otherlv_2= 'DSE' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ':' otherlv_5= 'upon' ( (lv_uponMoccEvent_6_0= ruleMoccEvent ) ) ( ( (lv_executionKind_7_0= ruleExecutionKind ) ) ( (lv_executionFunction_8_0= ruleExecutionFunction ) ) (otherlv_9= 'feedback' otherlv_10= ':' ( (lv_feedbackPolicy_11_0= ruleFeedbackPolicy ) ) otherlv_12= 'end' )? )? (otherlv_13= 'raises' ( (lv_raisedMoccEvent_14_0= ruleMoccEvent ) ) )? otherlv_15= 'end' ) ;
    public final EObject ruleAtomicDomainSpecificEvent() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Enumerator lv_visibility_1_0 = null;

        EObject lv_uponMoccEvent_6_0 = null;

        Enumerator lv_executionKind_7_0 = null;

        EObject lv_executionFunction_8_0 = null;

        EObject lv_feedbackPolicy_11_0 = null;

        EObject lv_raisedMoccEvent_14_0 = null;


         enterRule(); 
            
        try {
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:226:28: ( ( () ( (lv_visibility_1_0= ruleVisibility ) )? otherlv_2= 'DSE' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ':' otherlv_5= 'upon' ( (lv_uponMoccEvent_6_0= ruleMoccEvent ) ) ( ( (lv_executionKind_7_0= ruleExecutionKind ) ) ( (lv_executionFunction_8_0= ruleExecutionFunction ) ) (otherlv_9= 'feedback' otherlv_10= ':' ( (lv_feedbackPolicy_11_0= ruleFeedbackPolicy ) ) otherlv_12= 'end' )? )? (otherlv_13= 'raises' ( (lv_raisedMoccEvent_14_0= ruleMoccEvent ) ) )? otherlv_15= 'end' ) )
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:227:1: ( () ( (lv_visibility_1_0= ruleVisibility ) )? otherlv_2= 'DSE' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ':' otherlv_5= 'upon' ( (lv_uponMoccEvent_6_0= ruleMoccEvent ) ) ( ( (lv_executionKind_7_0= ruleExecutionKind ) ) ( (lv_executionFunction_8_0= ruleExecutionFunction ) ) (otherlv_9= 'feedback' otherlv_10= ':' ( (lv_feedbackPolicy_11_0= ruleFeedbackPolicy ) ) otherlv_12= 'end' )? )? (otherlv_13= 'raises' ( (lv_raisedMoccEvent_14_0= ruleMoccEvent ) ) )? otherlv_15= 'end' )
            {
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:227:1: ( () ( (lv_visibility_1_0= ruleVisibility ) )? otherlv_2= 'DSE' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ':' otherlv_5= 'upon' ( (lv_uponMoccEvent_6_0= ruleMoccEvent ) ) ( ( (lv_executionKind_7_0= ruleExecutionKind ) ) ( (lv_executionFunction_8_0= ruleExecutionFunction ) ) (otherlv_9= 'feedback' otherlv_10= ':' ( (lv_feedbackPolicy_11_0= ruleFeedbackPolicy ) ) otherlv_12= 'end' )? )? (otherlv_13= 'raises' ( (lv_raisedMoccEvent_14_0= ruleMoccEvent ) ) )? otherlv_15= 'end' )
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:227:2: () ( (lv_visibility_1_0= ruleVisibility ) )? otherlv_2= 'DSE' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ':' otherlv_5= 'upon' ( (lv_uponMoccEvent_6_0= ruleMoccEvent ) ) ( ( (lv_executionKind_7_0= ruleExecutionKind ) ) ( (lv_executionFunction_8_0= ruleExecutionFunction ) ) (otherlv_9= 'feedback' otherlv_10= ':' ( (lv_feedbackPolicy_11_0= ruleFeedbackPolicy ) ) otherlv_12= 'end' )? )? (otherlv_13= 'raises' ( (lv_raisedMoccEvent_14_0= ruleMoccEvent ) ) )? otherlv_15= 'end'
            {
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:227:2: ()
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:228:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getAtomicDomainSpecificEventAccess().getAtomicDomainSpecificEventAction_0(),
                          current);
                  
            }

            }

            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:233:2: ( (lv_visibility_1_0= ruleVisibility ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( ((LA4_0>=46 && LA4_0<=47)) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:234:1: (lv_visibility_1_0= ruleVisibility )
                    {
                    // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:234:1: (lv_visibility_1_0= ruleVisibility )
                    // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:235:3: lv_visibility_1_0= ruleVisibility
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getAtomicDomainSpecificEventAccess().getVisibilityVisibilityEnumRuleCall_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleVisibility_in_ruleAtomicDomainSpecificEvent488);
                    lv_visibility_1_0=ruleVisibility();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getAtomicDomainSpecificEventRule());
                      	        }
                             		set(
                             			current, 
                             			"visibility",
                              		lv_visibility_1_0, 
                              		"Visibility");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,14,FOLLOW_14_in_ruleAtomicDomainSpecificEvent501); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getAtomicDomainSpecificEventAccess().getDSEKeyword_2());
                  
            }
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:255:1: ( (lv_name_3_0= RULE_ID ) )
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:256:1: (lv_name_3_0= RULE_ID )
            {
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:256:1: (lv_name_3_0= RULE_ID )
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:257:3: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAtomicDomainSpecificEvent518); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_3_0, grammarAccess.getAtomicDomainSpecificEventAccess().getNameIDTerminalRuleCall_3_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getAtomicDomainSpecificEventRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_3_0, 
                      		"ID");
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,15,FOLLOW_15_in_ruleAtomicDomainSpecificEvent535); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getAtomicDomainSpecificEventAccess().getColonKeyword_4());
                  
            }
            otherlv_5=(Token)match(input,16,FOLLOW_16_in_ruleAtomicDomainSpecificEvent547); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getAtomicDomainSpecificEventAccess().getUponKeyword_5());
                  
            }
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:281:1: ( (lv_uponMoccEvent_6_0= ruleMoccEvent ) )
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:282:1: (lv_uponMoccEvent_6_0= ruleMoccEvent )
            {
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:282:1: (lv_uponMoccEvent_6_0= ruleMoccEvent )
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:283:3: lv_uponMoccEvent_6_0= ruleMoccEvent
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAtomicDomainSpecificEventAccess().getUponMoccEventMoccEventParserRuleCall_6_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleMoccEvent_in_ruleAtomicDomainSpecificEvent568);
            lv_uponMoccEvent_6_0=ruleMoccEvent();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getAtomicDomainSpecificEventRule());
              	        }
                     		set(
                     			current, 
                     			"uponMoccEvent",
                      		lv_uponMoccEvent_6_0, 
                      		"MoccEvent");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:299:2: ( ( (lv_executionKind_7_0= ruleExecutionKind ) ) ( (lv_executionFunction_8_0= ruleExecutionFunction ) ) (otherlv_9= 'feedback' otherlv_10= ':' ( (lv_feedbackPolicy_11_0= ruleFeedbackPolicy ) ) otherlv_12= 'end' )? )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( ((LA6_0>=48 && LA6_0<=49)) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:299:3: ( (lv_executionKind_7_0= ruleExecutionKind ) ) ( (lv_executionFunction_8_0= ruleExecutionFunction ) ) (otherlv_9= 'feedback' otherlv_10= ':' ( (lv_feedbackPolicy_11_0= ruleFeedbackPolicy ) ) otherlv_12= 'end' )?
                    {
                    // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:299:3: ( (lv_executionKind_7_0= ruleExecutionKind ) )
                    // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:300:1: (lv_executionKind_7_0= ruleExecutionKind )
                    {
                    // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:300:1: (lv_executionKind_7_0= ruleExecutionKind )
                    // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:301:3: lv_executionKind_7_0= ruleExecutionKind
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getAtomicDomainSpecificEventAccess().getExecutionKindExecutionKindEnumRuleCall_7_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExecutionKind_in_ruleAtomicDomainSpecificEvent590);
                    lv_executionKind_7_0=ruleExecutionKind();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getAtomicDomainSpecificEventRule());
                      	        }
                             		set(
                             			current, 
                             			"executionKind",
                              		lv_executionKind_7_0, 
                              		"ExecutionKind");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:317:2: ( (lv_executionFunction_8_0= ruleExecutionFunction ) )
                    // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:318:1: (lv_executionFunction_8_0= ruleExecutionFunction )
                    {
                    // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:318:1: (lv_executionFunction_8_0= ruleExecutionFunction )
                    // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:319:3: lv_executionFunction_8_0= ruleExecutionFunction
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getAtomicDomainSpecificEventAccess().getExecutionFunctionExecutionFunctionParserRuleCall_7_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExecutionFunction_in_ruleAtomicDomainSpecificEvent611);
                    lv_executionFunction_8_0=ruleExecutionFunction();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getAtomicDomainSpecificEventRule());
                      	        }
                             		set(
                             			current, 
                             			"executionFunction",
                              		lv_executionFunction_8_0, 
                              		"ExecutionFunction");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:335:2: (otherlv_9= 'feedback' otherlv_10= ':' ( (lv_feedbackPolicy_11_0= ruleFeedbackPolicy ) ) otherlv_12= 'end' )?
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( (LA5_0==17) ) {
                        alt5=1;
                    }
                    switch (alt5) {
                        case 1 :
                            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:335:4: otherlv_9= 'feedback' otherlv_10= ':' ( (lv_feedbackPolicy_11_0= ruleFeedbackPolicy ) ) otherlv_12= 'end'
                            {
                            otherlv_9=(Token)match(input,17,FOLLOW_17_in_ruleAtomicDomainSpecificEvent624); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_9, grammarAccess.getAtomicDomainSpecificEventAccess().getFeedbackKeyword_7_2_0());
                                  
                            }
                            otherlv_10=(Token)match(input,15,FOLLOW_15_in_ruleAtomicDomainSpecificEvent636); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_10, grammarAccess.getAtomicDomainSpecificEventAccess().getColonKeyword_7_2_1());
                                  
                            }
                            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:343:1: ( (lv_feedbackPolicy_11_0= ruleFeedbackPolicy ) )
                            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:344:1: (lv_feedbackPolicy_11_0= ruleFeedbackPolicy )
                            {
                            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:344:1: (lv_feedbackPolicy_11_0= ruleFeedbackPolicy )
                            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:345:3: lv_feedbackPolicy_11_0= ruleFeedbackPolicy
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getAtomicDomainSpecificEventAccess().getFeedbackPolicyFeedbackPolicyParserRuleCall_7_2_2_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleFeedbackPolicy_in_ruleAtomicDomainSpecificEvent657);
                            lv_feedbackPolicy_11_0=ruleFeedbackPolicy();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getAtomicDomainSpecificEventRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"feedbackPolicy",
                                      		lv_feedbackPolicy_11_0, 
                                      		"FeedbackPolicy");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }

                            otherlv_12=(Token)match(input,18,FOLLOW_18_in_ruleAtomicDomainSpecificEvent669); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_12, grammarAccess.getAtomicDomainSpecificEventAccess().getEndKeyword_7_2_3());
                                  
                            }

                            }
                            break;

                    }


                    }
                    break;

            }

            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:365:5: (otherlv_13= 'raises' ( (lv_raisedMoccEvent_14_0= ruleMoccEvent ) ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==19) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:365:7: otherlv_13= 'raises' ( (lv_raisedMoccEvent_14_0= ruleMoccEvent ) )
                    {
                    otherlv_13=(Token)match(input,19,FOLLOW_19_in_ruleAtomicDomainSpecificEvent686); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_13, grammarAccess.getAtomicDomainSpecificEventAccess().getRaisesKeyword_8_0());
                          
                    }
                    // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:369:1: ( (lv_raisedMoccEvent_14_0= ruleMoccEvent ) )
                    // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:370:1: (lv_raisedMoccEvent_14_0= ruleMoccEvent )
                    {
                    // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:370:1: (lv_raisedMoccEvent_14_0= ruleMoccEvent )
                    // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:371:3: lv_raisedMoccEvent_14_0= ruleMoccEvent
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getAtomicDomainSpecificEventAccess().getRaisedMoccEventMoccEventParserRuleCall_8_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleMoccEvent_in_ruleAtomicDomainSpecificEvent707);
                    lv_raisedMoccEvent_14_0=ruleMoccEvent();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getAtomicDomainSpecificEventRule());
                      	        }
                             		set(
                             			current, 
                             			"raisedMoccEvent",
                              		lv_raisedMoccEvent_14_0, 
                              		"MoccEvent");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_15=(Token)match(input,18,FOLLOW_18_in_ruleAtomicDomainSpecificEvent721); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_15, grammarAccess.getAtomicDomainSpecificEventAccess().getEndKeyword_9());
                  
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
    // $ANTLR end "ruleAtomicDomainSpecificEvent"


    // $ANTLR start "entryRuleCompositeDomainSpecificEvent"
    // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:399:1: entryRuleCompositeDomainSpecificEvent returns [EObject current=null] : iv_ruleCompositeDomainSpecificEvent= ruleCompositeDomainSpecificEvent EOF ;
    public final EObject entryRuleCompositeDomainSpecificEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompositeDomainSpecificEvent = null;


        try {
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:400:2: (iv_ruleCompositeDomainSpecificEvent= ruleCompositeDomainSpecificEvent EOF )
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:401:2: iv_ruleCompositeDomainSpecificEvent= ruleCompositeDomainSpecificEvent EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCompositeDomainSpecificEventRule()); 
            }
            pushFollow(FOLLOW_ruleCompositeDomainSpecificEvent_in_entryRuleCompositeDomainSpecificEvent757);
            iv_ruleCompositeDomainSpecificEvent=ruleCompositeDomainSpecificEvent();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCompositeDomainSpecificEvent; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCompositeDomainSpecificEvent767); if (state.failed) return current;

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
    // $ANTLR end "entryRuleCompositeDomainSpecificEvent"


    // $ANTLR start "ruleCompositeDomainSpecificEvent"
    // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:408:1: ruleCompositeDomainSpecificEvent returns [EObject current=null] : ( () ( (lv_visibility_1_0= ruleVisibility ) )? otherlv_2= 'Composite' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ':' ( (lv_unfoldingStrategy_5_0= ruleUnfoldingStrategy ) )? ( (lv_body_6_0= ruleDomainSpecificEventsPattern ) ) otherlv_7= 'end' ) ;
    public final EObject ruleCompositeDomainSpecificEvent() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;
        Token otherlv_7=null;
        Enumerator lv_visibility_1_0 = null;

        EObject lv_unfoldingStrategy_5_0 = null;

        EObject lv_body_6_0 = null;


         enterRule(); 
            
        try {
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:411:28: ( ( () ( (lv_visibility_1_0= ruleVisibility ) )? otherlv_2= 'Composite' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ':' ( (lv_unfoldingStrategy_5_0= ruleUnfoldingStrategy ) )? ( (lv_body_6_0= ruleDomainSpecificEventsPattern ) ) otherlv_7= 'end' ) )
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:412:1: ( () ( (lv_visibility_1_0= ruleVisibility ) )? otherlv_2= 'Composite' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ':' ( (lv_unfoldingStrategy_5_0= ruleUnfoldingStrategy ) )? ( (lv_body_6_0= ruleDomainSpecificEventsPattern ) ) otherlv_7= 'end' )
            {
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:412:1: ( () ( (lv_visibility_1_0= ruleVisibility ) )? otherlv_2= 'Composite' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ':' ( (lv_unfoldingStrategy_5_0= ruleUnfoldingStrategy ) )? ( (lv_body_6_0= ruleDomainSpecificEventsPattern ) ) otherlv_7= 'end' )
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:412:2: () ( (lv_visibility_1_0= ruleVisibility ) )? otherlv_2= 'Composite' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ':' ( (lv_unfoldingStrategy_5_0= ruleUnfoldingStrategy ) )? ( (lv_body_6_0= ruleDomainSpecificEventsPattern ) ) otherlv_7= 'end'
            {
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:412:2: ()
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:413:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getCompositeDomainSpecificEventAccess().getCompositeDomainSpecificEventAction_0(),
                          current);
                  
            }

            }

            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:418:2: ( (lv_visibility_1_0= ruleVisibility ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( ((LA8_0>=46 && LA8_0<=47)) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:419:1: (lv_visibility_1_0= ruleVisibility )
                    {
                    // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:419:1: (lv_visibility_1_0= ruleVisibility )
                    // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:420:3: lv_visibility_1_0= ruleVisibility
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getCompositeDomainSpecificEventAccess().getVisibilityVisibilityEnumRuleCall_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleVisibility_in_ruleCompositeDomainSpecificEvent822);
                    lv_visibility_1_0=ruleVisibility();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getCompositeDomainSpecificEventRule());
                      	        }
                             		set(
                             			current, 
                             			"visibility",
                              		lv_visibility_1_0, 
                              		"Visibility");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,20,FOLLOW_20_in_ruleCompositeDomainSpecificEvent835); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getCompositeDomainSpecificEventAccess().getCompositeKeyword_2());
                  
            }
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:440:1: ( (lv_name_3_0= RULE_ID ) )
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:441:1: (lv_name_3_0= RULE_ID )
            {
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:441:1: (lv_name_3_0= RULE_ID )
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:442:3: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCompositeDomainSpecificEvent852); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_3_0, grammarAccess.getCompositeDomainSpecificEventAccess().getNameIDTerminalRuleCall_3_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getCompositeDomainSpecificEventRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_3_0, 
                      		"ID");
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,15,FOLLOW_15_in_ruleCompositeDomainSpecificEvent869); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getCompositeDomainSpecificEventAccess().getColonKeyword_4());
                  
            }
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:462:1: ( (lv_unfoldingStrategy_5_0= ruleUnfoldingStrategy ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==21) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:463:1: (lv_unfoldingStrategy_5_0= ruleUnfoldingStrategy )
                    {
                    // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:463:1: (lv_unfoldingStrategy_5_0= ruleUnfoldingStrategy )
                    // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:464:3: lv_unfoldingStrategy_5_0= ruleUnfoldingStrategy
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getCompositeDomainSpecificEventAccess().getUnfoldingStrategyUnfoldingStrategyParserRuleCall_5_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleUnfoldingStrategy_in_ruleCompositeDomainSpecificEvent890);
                    lv_unfoldingStrategy_5_0=ruleUnfoldingStrategy();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getCompositeDomainSpecificEventRule());
                      	        }
                             		set(
                             			current, 
                             			"unfoldingStrategy",
                              		lv_unfoldingStrategy_5_0, 
                              		"UnfoldingStrategy");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:480:3: ( (lv_body_6_0= ruleDomainSpecificEventsPattern ) )
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:481:1: (lv_body_6_0= ruleDomainSpecificEventsPattern )
            {
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:481:1: (lv_body_6_0= ruleDomainSpecificEventsPattern )
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:482:3: lv_body_6_0= ruleDomainSpecificEventsPattern
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getCompositeDomainSpecificEventAccess().getBodyDomainSpecificEventsPatternParserRuleCall_6_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleDomainSpecificEventsPattern_in_ruleCompositeDomainSpecificEvent912);
            lv_body_6_0=ruleDomainSpecificEventsPattern();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getCompositeDomainSpecificEventRule());
              	        }
                     		set(
                     			current, 
                     			"body",
                      		lv_body_6_0, 
                      		"DomainSpecificEventsPattern");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_7=(Token)match(input,18,FOLLOW_18_in_ruleCompositeDomainSpecificEvent924); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_7, grammarAccess.getCompositeDomainSpecificEventAccess().getEndKeyword_7());
                  
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
    // $ANTLR end "ruleCompositeDomainSpecificEvent"


    // $ANTLR start "entryRuleUnfoldingStrategy"
    // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:510:1: entryRuleUnfoldingStrategy returns [EObject current=null] : iv_ruleUnfoldingStrategy= ruleUnfoldingStrategy EOF ;
    public final EObject entryRuleUnfoldingStrategy() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnfoldingStrategy = null;


        try {
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:511:2: (iv_ruleUnfoldingStrategy= ruleUnfoldingStrategy EOF )
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:512:2: iv_ruleUnfoldingStrategy= ruleUnfoldingStrategy EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUnfoldingStrategyRule()); 
            }
            pushFollow(FOLLOW_ruleUnfoldingStrategy_in_entryRuleUnfoldingStrategy960);
            iv_ruleUnfoldingStrategy=ruleUnfoldingStrategy();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleUnfoldingStrategy; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleUnfoldingStrategy970); if (state.failed) return current;

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
    // $ANTLR end "entryRuleUnfoldingStrategy"


    // $ANTLR start "ruleUnfoldingStrategy"
    // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:519:1: ruleUnfoldingStrategy returns [EObject current=null] : ( () otherlv_1= 'forall' otherlv_2= '{' ( (lv_localVariables_3_0= ruleLocalVariable ) )+ otherlv_4= '}' otherlv_5= 'where' otherlv_6= '{' ( (lv_instantiationPredicates_7_0= ruleInstantiationPredicate ) )+ otherlv_8= '}' ) ;
    public final EObject ruleUnfoldingStrategy() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject lv_localVariables_3_0 = null;

        EObject lv_instantiationPredicates_7_0 = null;


         enterRule(); 
            
        try {
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:522:28: ( ( () otherlv_1= 'forall' otherlv_2= '{' ( (lv_localVariables_3_0= ruleLocalVariable ) )+ otherlv_4= '}' otherlv_5= 'where' otherlv_6= '{' ( (lv_instantiationPredicates_7_0= ruleInstantiationPredicate ) )+ otherlv_8= '}' ) )
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:523:1: ( () otherlv_1= 'forall' otherlv_2= '{' ( (lv_localVariables_3_0= ruleLocalVariable ) )+ otherlv_4= '}' otherlv_5= 'where' otherlv_6= '{' ( (lv_instantiationPredicates_7_0= ruleInstantiationPredicate ) )+ otherlv_8= '}' )
            {
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:523:1: ( () otherlv_1= 'forall' otherlv_2= '{' ( (lv_localVariables_3_0= ruleLocalVariable ) )+ otherlv_4= '}' otherlv_5= 'where' otherlv_6= '{' ( (lv_instantiationPredicates_7_0= ruleInstantiationPredicate ) )+ otherlv_8= '}' )
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:523:2: () otherlv_1= 'forall' otherlv_2= '{' ( (lv_localVariables_3_0= ruleLocalVariable ) )+ otherlv_4= '}' otherlv_5= 'where' otherlv_6= '{' ( (lv_instantiationPredicates_7_0= ruleInstantiationPredicate ) )+ otherlv_8= '}'
            {
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:523:2: ()
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:524:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getUnfoldingStrategyAccess().getUnfoldingStrategyAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,21,FOLLOW_21_in_ruleUnfoldingStrategy1016); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getUnfoldingStrategyAccess().getForallKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,22,FOLLOW_22_in_ruleUnfoldingStrategy1028); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getUnfoldingStrategyAccess().getLeftCurlyBracketKeyword_2());
                  
            }
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:537:1: ( (lv_localVariables_3_0= ruleLocalVariable ) )+
            int cnt10=0;
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_ID) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:538:1: (lv_localVariables_3_0= ruleLocalVariable )
            	    {
            	    // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:538:1: (lv_localVariables_3_0= ruleLocalVariable )
            	    // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:539:3: lv_localVariables_3_0= ruleLocalVariable
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getUnfoldingStrategyAccess().getLocalVariablesLocalVariableParserRuleCall_3_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleLocalVariable_in_ruleUnfoldingStrategy1049);
            	    lv_localVariables_3_0=ruleLocalVariable();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getUnfoldingStrategyRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"localVariables",
            	              		lv_localVariables_3_0, 
            	              		"LocalVariable");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt10 >= 1 ) break loop10;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(10, input);
                        throw eee;
                }
                cnt10++;
            } while (true);

            otherlv_4=(Token)match(input,23,FOLLOW_23_in_ruleUnfoldingStrategy1062); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getUnfoldingStrategyAccess().getRightCurlyBracketKeyword_4());
                  
            }
            otherlv_5=(Token)match(input,24,FOLLOW_24_in_ruleUnfoldingStrategy1074); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getUnfoldingStrategyAccess().getWhereKeyword_5());
                  
            }
            otherlv_6=(Token)match(input,22,FOLLOW_22_in_ruleUnfoldingStrategy1086); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getUnfoldingStrategyAccess().getLeftCurlyBracketKeyword_6());
                  
            }
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:567:1: ( (lv_instantiationPredicates_7_0= ruleInstantiationPredicate ) )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>=RULE_STRING && LA11_0<=RULE_DOUBLE)||LA11_0==32||(LA11_0>=40 && LA11_0<=41)||(LA11_0>=64 && LA11_0<=65)) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:568:1: (lv_instantiationPredicates_7_0= ruleInstantiationPredicate )
            	    {
            	    // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:568:1: (lv_instantiationPredicates_7_0= ruleInstantiationPredicate )
            	    // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:569:3: lv_instantiationPredicates_7_0= ruleInstantiationPredicate
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getUnfoldingStrategyAccess().getInstantiationPredicatesInstantiationPredicateParserRuleCall_7_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleInstantiationPredicate_in_ruleUnfoldingStrategy1107);
            	    lv_instantiationPredicates_7_0=ruleInstantiationPredicate();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getUnfoldingStrategyRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"instantiationPredicates",
            	              		lv_instantiationPredicates_7_0, 
            	              		"InstantiationPredicate");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt11 >= 1 ) break loop11;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(11, input);
                        throw eee;
                }
                cnt11++;
            } while (true);

            otherlv_8=(Token)match(input,23,FOLLOW_23_in_ruleUnfoldingStrategy1120); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_8, grammarAccess.getUnfoldingStrategyAccess().getRightCurlyBracketKeyword_8());
                  
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
    // $ANTLR end "ruleUnfoldingStrategy"


    // $ANTLR start "entryRuleLocalVariable"
    // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:597:1: entryRuleLocalVariable returns [EObject current=null] : iv_ruleLocalVariable= ruleLocalVariable EOF ;
    public final EObject entryRuleLocalVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLocalVariable = null;


        try {
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:598:2: (iv_ruleLocalVariable= ruleLocalVariable EOF )
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:599:2: iv_ruleLocalVariable= ruleLocalVariable EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLocalVariableRule()); 
            }
            pushFollow(FOLLOW_ruleLocalVariable_in_entryRuleLocalVariable1156);
            iv_ruleLocalVariable=ruleLocalVariable();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLocalVariable; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLocalVariable1166); if (state.failed) return current;

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
    // $ANTLR end "entryRuleLocalVariable"


    // $ANTLR start "ruleLocalVariable"
    // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:606:1: ruleLocalVariable returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( ( ruleQualifiedName ) ) ) ;
    public final EObject ruleLocalVariable() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:609:28: ( ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( ( ruleQualifiedName ) ) ) )
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:610:1: ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( ( ruleQualifiedName ) ) )
            {
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:610:1: ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( ( ruleQualifiedName ) ) )
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:610:2: () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( ( ruleQualifiedName ) )
            {
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:610:2: ()
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:611:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getLocalVariableAccess().getLocalVariableAction_0(),
                          current);
                  
            }

            }

            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:616:2: ( (lv_name_1_0= RULE_ID ) )
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:617:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:617:1: (lv_name_1_0= RULE_ID )
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:618:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleLocalVariable1217); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_1_0, grammarAccess.getLocalVariableAccess().getNameIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getLocalVariableRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"ID");
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,15,FOLLOW_15_in_ruleLocalVariable1234); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getLocalVariableAccess().getColonKeyword_2());
                  
            }
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:638:1: ( ( ruleQualifiedName ) )
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:639:1: ( ruleQualifiedName )
            {
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:639:1: ( ruleQualifiedName )
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:640:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getLocalVariableRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getLocalVariableAccess().getTypeEClassifierCrossReference_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleLocalVariable1257);
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
    // $ANTLR end "ruleLocalVariable"


    // $ANTLR start "entryRuleInstantiationPredicate"
    // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:661:1: entryRuleInstantiationPredicate returns [EObject current=null] : iv_ruleInstantiationPredicate= ruleInstantiationPredicate EOF ;
    public final EObject entryRuleInstantiationPredicate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInstantiationPredicate = null;


        try {
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:662:2: (iv_ruleInstantiationPredicate= ruleInstantiationPredicate EOF )
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:663:2: iv_ruleInstantiationPredicate= ruleInstantiationPredicate EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInstantiationPredicateRule()); 
            }
            pushFollow(FOLLOW_ruleInstantiationPredicate_in_entryRuleInstantiationPredicate1293);
            iv_ruleInstantiationPredicate=ruleInstantiationPredicate();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInstantiationPredicate; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleInstantiationPredicate1303); if (state.failed) return current;

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
    // $ANTLR end "entryRuleInstantiationPredicate"


    // $ANTLR start "ruleInstantiationPredicate"
    // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:670:1: ruleInstantiationPredicate returns [EObject current=null] : ( () ( (lv_body_1_0= ruleGExpression ) ) ) ;
    public final EObject ruleInstantiationPredicate() throws RecognitionException {
        EObject current = null;

        EObject lv_body_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:673:28: ( ( () ( (lv_body_1_0= ruleGExpression ) ) ) )
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:674:1: ( () ( (lv_body_1_0= ruleGExpression ) ) )
            {
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:674:1: ( () ( (lv_body_1_0= ruleGExpression ) ) )
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:674:2: () ( (lv_body_1_0= ruleGExpression ) )
            {
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:674:2: ()
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:675:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getInstantiationPredicateAccess().getInstantiationPredicateAction_0(),
                          current);
                  
            }

            }

            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:680:2: ( (lv_body_1_0= ruleGExpression ) )
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:681:1: (lv_body_1_0= ruleGExpression )
            {
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:681:1: (lv_body_1_0= ruleGExpression )
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:682:3: lv_body_1_0= ruleGExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getInstantiationPredicateAccess().getBodyGExpressionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleGExpression_in_ruleInstantiationPredicate1358);
            lv_body_1_0=ruleGExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getInstantiationPredicateRule());
              	        }
                     		set(
                     			current, 
                     			"body",
                      		lv_body_1_0, 
                      		"GExpression");
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
    // $ANTLR end "ruleInstantiationPredicate"


    // $ANTLR start "entryRuleDomainSpecificEventsPattern"
    // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:706:1: entryRuleDomainSpecificEventsPattern returns [EObject current=null] : iv_ruleDomainSpecificEventsPattern= ruleDomainSpecificEventsPattern EOF ;
    public final EObject entryRuleDomainSpecificEventsPattern() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDomainSpecificEventsPattern = null;


        try {
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:707:2: (iv_ruleDomainSpecificEventsPattern= ruleDomainSpecificEventsPattern EOF )
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:708:2: iv_ruleDomainSpecificEventsPattern= ruleDomainSpecificEventsPattern EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDomainSpecificEventsPatternRule()); 
            }
            pushFollow(FOLLOW_ruleDomainSpecificEventsPattern_in_entryRuleDomainSpecificEventsPattern1394);
            iv_ruleDomainSpecificEventsPattern=ruleDomainSpecificEventsPattern();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDomainSpecificEventsPattern; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDomainSpecificEventsPattern1404); if (state.failed) return current;

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
    // $ANTLR end "entryRuleDomainSpecificEventsPattern"


    // $ANTLR start "ruleDomainSpecificEventsPattern"
    // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:715:1: ruleDomainSpecificEventsPattern returns [EObject current=null] : this_LogicalSequence_0= ruleLogicalSequence ;
    public final EObject ruleDomainSpecificEventsPattern() throws RecognitionException {
        EObject current = null;

        EObject this_LogicalSequence_0 = null;


         enterRule(); 
            
        try {
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:718:28: (this_LogicalSequence_0= ruleLogicalSequence )
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:720:5: this_LogicalSequence_0= ruleLogicalSequence
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getDomainSpecificEventsPatternAccess().getLogicalSequenceParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_ruleLogicalSequence_in_ruleDomainSpecificEventsPattern1450);
            this_LogicalSequence_0=ruleLogicalSequence();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_LogicalSequence_0; 
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
    // $ANTLR end "ruleDomainSpecificEventsPattern"


    // $ANTLR start "entryRuleLogicalSequence"
    // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:736:1: entryRuleLogicalSequence returns [EObject current=null] : iv_ruleLogicalSequence= ruleLogicalSequence EOF ;
    public final EObject entryRuleLogicalSequence() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicalSequence = null;


        try {
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:737:2: (iv_ruleLogicalSequence= ruleLogicalSequence EOF )
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:738:2: iv_ruleLogicalSequence= ruleLogicalSequence EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLogicalSequenceRule()); 
            }
            pushFollow(FOLLOW_ruleLogicalSequence_in_entryRuleLogicalSequence1484);
            iv_ruleLogicalSequence=ruleLogicalSequence();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLogicalSequence; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLogicalSequence1494); if (state.failed) return current;

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
    // $ANTLR end "entryRuleLogicalSequence"


    // $ANTLR start "ruleLogicalSequence"
    // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:745:1: ruleLogicalSequence returns [EObject current=null] : (this_CoincidencePattern_0= ruleCoincidencePattern ( () ( ( '--->' )=>otherlv_2= '--->' ) ( (lv_rightOperand_3_0= ruleCoincidencePattern ) ) )* ) ;
    public final EObject ruleLogicalSequence() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_CoincidencePattern_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:748:28: ( (this_CoincidencePattern_0= ruleCoincidencePattern ( () ( ( '--->' )=>otherlv_2= '--->' ) ( (lv_rightOperand_3_0= ruleCoincidencePattern ) ) )* ) )
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:749:1: (this_CoincidencePattern_0= ruleCoincidencePattern ( () ( ( '--->' )=>otherlv_2= '--->' ) ( (lv_rightOperand_3_0= ruleCoincidencePattern ) ) )* )
            {
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:749:1: (this_CoincidencePattern_0= ruleCoincidencePattern ( () ( ( '--->' )=>otherlv_2= '--->' ) ( (lv_rightOperand_3_0= ruleCoincidencePattern ) ) )* )
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:750:5: this_CoincidencePattern_0= ruleCoincidencePattern ( () ( ( '--->' )=>otherlv_2= '--->' ) ( (lv_rightOperand_3_0= ruleCoincidencePattern ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getLogicalSequenceAccess().getCoincidencePatternParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleCoincidencePattern_in_ruleLogicalSequence1541);
            this_CoincidencePattern_0=ruleCoincidencePattern();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_CoincidencePattern_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:758:1: ( () ( ( '--->' )=>otherlv_2= '--->' ) ( (lv_rightOperand_3_0= ruleCoincidencePattern ) ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==25) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:758:2: () ( ( '--->' )=>otherlv_2= '--->' ) ( (lv_rightOperand_3_0= ruleCoincidencePattern ) )
            	    {
            	    // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:758:2: ()
            	    // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:759:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getLogicalSequenceAccess().getLogicalSequenceLeftOperandAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:764:2: ( ( '--->' )=>otherlv_2= '--->' )
            	    // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:764:3: ( '--->' )=>otherlv_2= '--->'
            	    {
            	    otherlv_2=(Token)match(input,25,FOLLOW_25_in_ruleLogicalSequence1570); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getLogicalSequenceAccess().getHyphenMinusHyphenMinusHyphenMinusGreaterThanSignKeyword_1_1());
            	          
            	    }

            	    }

            	    // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:769:2: ( (lv_rightOperand_3_0= ruleCoincidencePattern ) )
            	    // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:770:1: (lv_rightOperand_3_0= ruleCoincidencePattern )
            	    {
            	    // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:770:1: (lv_rightOperand_3_0= ruleCoincidencePattern )
            	    // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:771:3: lv_rightOperand_3_0= ruleCoincidencePattern
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getLogicalSequenceAccess().getRightOperandCoincidencePatternParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleCoincidencePattern_in_ruleLogicalSequence1592);
            	    lv_rightOperand_3_0=ruleCoincidencePattern();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getLogicalSequenceRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"rightOperand",
            	              		lv_rightOperand_3_0, 
            	              		"CoincidencePattern");
            	      	        afterParserOrEnumRuleCall();
            	      	    
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
    // $ANTLR end "ruleLogicalSequence"


    // $ANTLR start "entryRuleCoincidencePattern"
    // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:795:1: entryRuleCoincidencePattern returns [EObject current=null] : iv_ruleCoincidencePattern= ruleCoincidencePattern EOF ;
    public final EObject entryRuleCoincidencePattern() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCoincidencePattern = null;


        try {
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:796:2: (iv_ruleCoincidencePattern= ruleCoincidencePattern EOF )
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:797:2: iv_ruleCoincidencePattern= ruleCoincidencePattern EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCoincidencePatternRule()); 
            }
            pushFollow(FOLLOW_ruleCoincidencePattern_in_entryRuleCoincidencePattern1630);
            iv_ruleCoincidencePattern=ruleCoincidencePattern();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCoincidencePattern; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCoincidencePattern1640); if (state.failed) return current;

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
    // $ANTLR end "entryRuleCoincidencePattern"


    // $ANTLR start "ruleCoincidencePattern"
    // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:804:1: ruleCoincidencePattern returns [EObject current=null] : (this_OrPattern_0= ruleOrPattern ( () otherlv_2= '&' ( (lv_rightOperand_3_0= ruleOrPattern ) ) )* ) ;
    public final EObject ruleCoincidencePattern() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_OrPattern_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:807:28: ( (this_OrPattern_0= ruleOrPattern ( () otherlv_2= '&' ( (lv_rightOperand_3_0= ruleOrPattern ) ) )* ) )
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:808:1: (this_OrPattern_0= ruleOrPattern ( () otherlv_2= '&' ( (lv_rightOperand_3_0= ruleOrPattern ) ) )* )
            {
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:808:1: (this_OrPattern_0= ruleOrPattern ( () otherlv_2= '&' ( (lv_rightOperand_3_0= ruleOrPattern ) ) )* )
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:809:5: this_OrPattern_0= ruleOrPattern ( () otherlv_2= '&' ( (lv_rightOperand_3_0= ruleOrPattern ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getCoincidencePatternAccess().getOrPatternParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleOrPattern_in_ruleCoincidencePattern1687);
            this_OrPattern_0=ruleOrPattern();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_OrPattern_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:817:1: ( () otherlv_2= '&' ( (lv_rightOperand_3_0= ruleOrPattern ) ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==26) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:817:2: () otherlv_2= '&' ( (lv_rightOperand_3_0= ruleOrPattern ) )
            	    {
            	    // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:817:2: ()
            	    // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:818:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getCoincidencePatternAccess().getCoincidencePatternLeftOperandAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,26,FOLLOW_26_in_ruleCoincidencePattern1708); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getCoincidencePatternAccess().getAmpersandKeyword_1_1());
            	          
            	    }
            	    // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:827:1: ( (lv_rightOperand_3_0= ruleOrPattern ) )
            	    // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:828:1: (lv_rightOperand_3_0= ruleOrPattern )
            	    {
            	    // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:828:1: (lv_rightOperand_3_0= ruleOrPattern )
            	    // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:829:3: lv_rightOperand_3_0= ruleOrPattern
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getCoincidencePatternAccess().getRightOperandOrPatternParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOrPattern_in_ruleCoincidencePattern1729);
            	    lv_rightOperand_3_0=ruleOrPattern();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getCoincidencePatternRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"rightOperand",
            	              		lv_rightOperand_3_0, 
            	              		"OrPattern");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop13;
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
    // $ANTLR end "ruleCoincidencePattern"


    // $ANTLR start "entryRuleOrPattern"
    // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:853:1: entryRuleOrPattern returns [EObject current=null] : iv_ruleOrPattern= ruleOrPattern EOF ;
    public final EObject entryRuleOrPattern() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrPattern = null;


        try {
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:854:2: (iv_ruleOrPattern= ruleOrPattern EOF )
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:855:2: iv_ruleOrPattern= ruleOrPattern EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOrPatternRule()); 
            }
            pushFollow(FOLLOW_ruleOrPattern_in_entryRuleOrPattern1767);
            iv_ruleOrPattern=ruleOrPattern();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOrPattern; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOrPattern1777); if (state.failed) return current;

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
    // $ANTLR end "entryRuleOrPattern"


    // $ANTLR start "ruleOrPattern"
    // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:862:1: ruleOrPattern returns [EObject current=null] : (this_XorPattern_0= ruleXorPattern ( () otherlv_2= '|' ( (lv_rightOperand_3_0= ruleXorPattern ) ) )* ) ;
    public final EObject ruleOrPattern() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_XorPattern_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:865:28: ( (this_XorPattern_0= ruleXorPattern ( () otherlv_2= '|' ( (lv_rightOperand_3_0= ruleXorPattern ) ) )* ) )
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:866:1: (this_XorPattern_0= ruleXorPattern ( () otherlv_2= '|' ( (lv_rightOperand_3_0= ruleXorPattern ) ) )* )
            {
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:866:1: (this_XorPattern_0= ruleXorPattern ( () otherlv_2= '|' ( (lv_rightOperand_3_0= ruleXorPattern ) ) )* )
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:867:5: this_XorPattern_0= ruleXorPattern ( () otherlv_2= '|' ( (lv_rightOperand_3_0= ruleXorPattern ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getOrPatternAccess().getXorPatternParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXorPattern_in_ruleOrPattern1824);
            this_XorPattern_0=ruleXorPattern();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XorPattern_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:875:1: ( () otherlv_2= '|' ( (lv_rightOperand_3_0= ruleXorPattern ) ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==27) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:875:2: () otherlv_2= '|' ( (lv_rightOperand_3_0= ruleXorPattern ) )
            	    {
            	    // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:875:2: ()
            	    // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:876:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getOrPatternAccess().getOrPatternLeftOperandAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,27,FOLLOW_27_in_ruleOrPattern1845); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getOrPatternAccess().getVerticalLineKeyword_1_1());
            	          
            	    }
            	    // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:885:1: ( (lv_rightOperand_3_0= ruleXorPattern ) )
            	    // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:886:1: (lv_rightOperand_3_0= ruleXorPattern )
            	    {
            	    // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:886:1: (lv_rightOperand_3_0= ruleXorPattern )
            	    // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:887:3: lv_rightOperand_3_0= ruleXorPattern
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getOrPatternAccess().getRightOperandXorPatternParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXorPattern_in_ruleOrPattern1866);
            	    lv_rightOperand_3_0=ruleXorPattern();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getOrPatternRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"rightOperand",
            	              		lv_rightOperand_3_0, 
            	              		"XorPattern");
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
    // $ANTLR end "ruleOrPattern"


    // $ANTLR start "entryRuleXorPattern"
    // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:911:1: entryRuleXorPattern returns [EObject current=null] : iv_ruleXorPattern= ruleXorPattern EOF ;
    public final EObject entryRuleXorPattern() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXorPattern = null;


        try {
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:912:2: (iv_ruleXorPattern= ruleXorPattern EOF )
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:913:2: iv_ruleXorPattern= ruleXorPattern EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXorPatternRule()); 
            }
            pushFollow(FOLLOW_ruleXorPattern_in_entryRuleXorPattern1904);
            iv_ruleXorPattern=ruleXorPattern();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXorPattern; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXorPattern1914); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXorPattern"


    // $ANTLR start "ruleXorPattern"
    // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:920:1: ruleXorPattern returns [EObject current=null] : (this_PlusPattern_0= rulePlusPattern ( () otherlv_2= '><' ( (lv_rightOperand_3_0= rulePlusPattern ) ) )* ) ;
    public final EObject ruleXorPattern() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_PlusPattern_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:923:28: ( (this_PlusPattern_0= rulePlusPattern ( () otherlv_2= '><' ( (lv_rightOperand_3_0= rulePlusPattern ) ) )* ) )
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:924:1: (this_PlusPattern_0= rulePlusPattern ( () otherlv_2= '><' ( (lv_rightOperand_3_0= rulePlusPattern ) ) )* )
            {
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:924:1: (this_PlusPattern_0= rulePlusPattern ( () otherlv_2= '><' ( (lv_rightOperand_3_0= rulePlusPattern ) ) )* )
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:925:5: this_PlusPattern_0= rulePlusPattern ( () otherlv_2= '><' ( (lv_rightOperand_3_0= rulePlusPattern ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXorPatternAccess().getPlusPatternParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_rulePlusPattern_in_ruleXorPattern1961);
            this_PlusPattern_0=rulePlusPattern();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_PlusPattern_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:933:1: ( () otherlv_2= '><' ( (lv_rightOperand_3_0= rulePlusPattern ) ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==28) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:933:2: () otherlv_2= '><' ( (lv_rightOperand_3_0= rulePlusPattern ) )
            	    {
            	    // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:933:2: ()
            	    // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:934:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXorPatternAccess().getXorPatternLeftOperandAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,28,FOLLOW_28_in_ruleXorPattern1982); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getXorPatternAccess().getGreaterThanSignLessThanSignKeyword_1_1());
            	          
            	    }
            	    // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:943:1: ( (lv_rightOperand_3_0= rulePlusPattern ) )
            	    // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:944:1: (lv_rightOperand_3_0= rulePlusPattern )
            	    {
            	    // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:944:1: (lv_rightOperand_3_0= rulePlusPattern )
            	    // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:945:3: lv_rightOperand_3_0= rulePlusPattern
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXorPatternAccess().getRightOperandPlusPatternParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_rulePlusPattern_in_ruleXorPattern2003);
            	    lv_rightOperand_3_0=rulePlusPattern();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXorPatternRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"rightOperand",
            	              		lv_rightOperand_3_0, 
            	              		"PlusPattern");
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
    // $ANTLR end "ruleXorPattern"


    // $ANTLR start "entryRulePlusPattern"
    // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:969:1: entryRulePlusPattern returns [EObject current=null] : iv_rulePlusPattern= rulePlusPattern EOF ;
    public final EObject entryRulePlusPattern() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePlusPattern = null;


        try {
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:970:2: (iv_rulePlusPattern= rulePlusPattern EOF )
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:971:2: iv_rulePlusPattern= rulePlusPattern EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPlusPatternRule()); 
            }
            pushFollow(FOLLOW_rulePlusPattern_in_entryRulePlusPattern2041);
            iv_rulePlusPattern=rulePlusPattern();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePlusPattern; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePlusPattern2051); if (state.failed) return current;

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
    // $ANTLR end "entryRulePlusPattern"


    // $ANTLR start "rulePlusPattern"
    // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:978:1: rulePlusPattern returns [EObject current=null] : (this_IterationPattern_0= ruleIterationPattern ( () otherlv_2= '+' )? ) ;
    public final EObject rulePlusPattern() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_IterationPattern_0 = null;


         enterRule(); 
            
        try {
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:981:28: ( (this_IterationPattern_0= ruleIterationPattern ( () otherlv_2= '+' )? ) )
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:982:1: (this_IterationPattern_0= ruleIterationPattern ( () otherlv_2= '+' )? )
            {
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:982:1: (this_IterationPattern_0= ruleIterationPattern ( () otherlv_2= '+' )? )
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:983:5: this_IterationPattern_0= ruleIterationPattern ( () otherlv_2= '+' )?
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getPlusPatternAccess().getIterationPatternParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleIterationPattern_in_rulePlusPattern2098);
            this_IterationPattern_0=ruleIterationPattern();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_IterationPattern_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:991:1: ( () otherlv_2= '+' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==29) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:991:2: () otherlv_2= '+'
                    {
                    // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:991:2: ()
                    // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:992:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElementAndSet(
                                  grammarAccess.getPlusPatternAccess().getPlusPatternOperandAction_1_0(),
                                  current);
                          
                    }

                    }

                    otherlv_2=(Token)match(input,29,FOLLOW_29_in_rulePlusPattern2119); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getPlusPatternAccess().getPlusSignKeyword_1_1());
                          
                    }

                    }
                    break;

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
    // $ANTLR end "rulePlusPattern"


    // $ANTLR start "entryRuleIterationPattern"
    // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:1009:1: entryRuleIterationPattern returns [EObject current=null] : iv_ruleIterationPattern= ruleIterationPattern EOF ;
    public final EObject entryRuleIterationPattern() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIterationPattern = null;


        try {
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:1010:2: (iv_ruleIterationPattern= ruleIterationPattern EOF )
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:1011:2: iv_ruleIterationPattern= ruleIterationPattern EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIterationPatternRule()); 
            }
            pushFollow(FOLLOW_ruleIterationPattern_in_entryRuleIterationPattern2157);
            iv_ruleIterationPattern=ruleIterationPattern();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIterationPattern; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIterationPattern2167); if (state.failed) return current;

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
    // $ANTLR end "entryRuleIterationPattern"


    // $ANTLR start "ruleIterationPattern"
    // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:1018:1: ruleIterationPattern returns [EObject current=null] : (this_DomainSpecificEventReferenceOrPattern_0= ruleDomainSpecificEventReferenceOrPattern ( () otherlv_2= '[' ( (lv_numberOfIterations_3_0= RULE_INT ) ) otherlv_4= ']' )? ) ;
    public final EObject ruleIterationPattern() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token lv_numberOfIterations_3_0=null;
        Token otherlv_4=null;
        EObject this_DomainSpecificEventReferenceOrPattern_0 = null;


         enterRule(); 
            
        try {
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:1021:28: ( (this_DomainSpecificEventReferenceOrPattern_0= ruleDomainSpecificEventReferenceOrPattern ( () otherlv_2= '[' ( (lv_numberOfIterations_3_0= RULE_INT ) ) otherlv_4= ']' )? ) )
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:1022:1: (this_DomainSpecificEventReferenceOrPattern_0= ruleDomainSpecificEventReferenceOrPattern ( () otherlv_2= '[' ( (lv_numberOfIterations_3_0= RULE_INT ) ) otherlv_4= ']' )? )
            {
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:1022:1: (this_DomainSpecificEventReferenceOrPattern_0= ruleDomainSpecificEventReferenceOrPattern ( () otherlv_2= '[' ( (lv_numberOfIterations_3_0= RULE_INT ) ) otherlv_4= ']' )? )
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:1023:5: this_DomainSpecificEventReferenceOrPattern_0= ruleDomainSpecificEventReferenceOrPattern ( () otherlv_2= '[' ( (lv_numberOfIterations_3_0= RULE_INT ) ) otherlv_4= ']' )?
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getIterationPatternAccess().getDomainSpecificEventReferenceOrPatternParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleDomainSpecificEventReferenceOrPattern_in_ruleIterationPattern2214);
            this_DomainSpecificEventReferenceOrPattern_0=ruleDomainSpecificEventReferenceOrPattern();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_DomainSpecificEventReferenceOrPattern_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:1031:1: ( () otherlv_2= '[' ( (lv_numberOfIterations_3_0= RULE_INT ) ) otherlv_4= ']' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==30) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:1031:2: () otherlv_2= '[' ( (lv_numberOfIterations_3_0= RULE_INT ) ) otherlv_4= ']'
                    {
                    // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:1031:2: ()
                    // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:1032:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElementAndSet(
                                  grammarAccess.getIterationPatternAccess().getIterationPatternOperandAction_1_0(),
                                  current);
                          
                    }

                    }

                    otherlv_2=(Token)match(input,30,FOLLOW_30_in_ruleIterationPattern2235); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getIterationPatternAccess().getLeftSquareBracketKeyword_1_1());
                          
                    }
                    // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:1041:1: ( (lv_numberOfIterations_3_0= RULE_INT ) )
                    // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:1042:1: (lv_numberOfIterations_3_0= RULE_INT )
                    {
                    // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:1042:1: (lv_numberOfIterations_3_0= RULE_INT )
                    // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:1043:3: lv_numberOfIterations_3_0= RULE_INT
                    {
                    lv_numberOfIterations_3_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleIterationPattern2252); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_numberOfIterations_3_0, grammarAccess.getIterationPatternAccess().getNumberOfIterationsINTTerminalRuleCall_1_2_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getIterationPatternRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"numberOfIterations",
                              		lv_numberOfIterations_3_0, 
                              		"INT");
                      	    
                    }

                    }


                    }

                    otherlv_4=(Token)match(input,31,FOLLOW_31_in_ruleIterationPattern2269); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getIterationPatternAccess().getRightSquareBracketKeyword_1_3());
                          
                    }

                    }
                    break;

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
    // $ANTLR end "ruleIterationPattern"


    // $ANTLR start "entryRuleDomainSpecificEventReferenceOrPattern"
    // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:1071:1: entryRuleDomainSpecificEventReferenceOrPattern returns [EObject current=null] : iv_ruleDomainSpecificEventReferenceOrPattern= ruleDomainSpecificEventReferenceOrPattern EOF ;
    public final EObject entryRuleDomainSpecificEventReferenceOrPattern() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDomainSpecificEventReferenceOrPattern = null;


        try {
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:1072:2: (iv_ruleDomainSpecificEventReferenceOrPattern= ruleDomainSpecificEventReferenceOrPattern EOF )
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:1073:2: iv_ruleDomainSpecificEventReferenceOrPattern= ruleDomainSpecificEventReferenceOrPattern EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDomainSpecificEventReferenceOrPatternRule()); 
            }
            pushFollow(FOLLOW_ruleDomainSpecificEventReferenceOrPattern_in_entryRuleDomainSpecificEventReferenceOrPattern2307);
            iv_ruleDomainSpecificEventReferenceOrPattern=ruleDomainSpecificEventReferenceOrPattern();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDomainSpecificEventReferenceOrPattern; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDomainSpecificEventReferenceOrPattern2317); if (state.failed) return current;

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
    // $ANTLR end "entryRuleDomainSpecificEventReferenceOrPattern"


    // $ANTLR start "ruleDomainSpecificEventReferenceOrPattern"
    // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:1080:1: ruleDomainSpecificEventReferenceOrPattern returns [EObject current=null] : (this_DomainSpecificEventReferenceWithOrWithoutTarget_0= ruleDomainSpecificEventReferenceWithOrWithoutTarget | (otherlv_1= '(' this_DomainSpecificEventsPattern_2= ruleDomainSpecificEventsPattern otherlv_3= ')' ) ) ;
    public final EObject ruleDomainSpecificEventReferenceOrPattern() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject this_DomainSpecificEventReferenceWithOrWithoutTarget_0 = null;

        EObject this_DomainSpecificEventsPattern_2 = null;


         enterRule(); 
            
        try {
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:1083:28: ( (this_DomainSpecificEventReferenceWithOrWithoutTarget_0= ruleDomainSpecificEventReferenceWithOrWithoutTarget | (otherlv_1= '(' this_DomainSpecificEventsPattern_2= ruleDomainSpecificEventsPattern otherlv_3= ')' ) ) )
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:1084:1: (this_DomainSpecificEventReferenceWithOrWithoutTarget_0= ruleDomainSpecificEventReferenceWithOrWithoutTarget | (otherlv_1= '(' this_DomainSpecificEventsPattern_2= ruleDomainSpecificEventsPattern otherlv_3= ')' ) )
            {
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:1084:1: (this_DomainSpecificEventReferenceWithOrWithoutTarget_0= ruleDomainSpecificEventReferenceWithOrWithoutTarget | (otherlv_1= '(' this_DomainSpecificEventsPattern_2= ruleDomainSpecificEventsPattern otherlv_3= ')' ) )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==RULE_ID) ) {
                alt18=1;
            }
            else if ( (LA18_0==32) ) {
                alt18=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:1085:5: this_DomainSpecificEventReferenceWithOrWithoutTarget_0= ruleDomainSpecificEventReferenceWithOrWithoutTarget
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getDomainSpecificEventReferenceOrPatternAccess().getDomainSpecificEventReferenceWithOrWithoutTargetParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleDomainSpecificEventReferenceWithOrWithoutTarget_in_ruleDomainSpecificEventReferenceOrPattern2364);
                    this_DomainSpecificEventReferenceWithOrWithoutTarget_0=ruleDomainSpecificEventReferenceWithOrWithoutTarget();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_DomainSpecificEventReferenceWithOrWithoutTarget_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:1094:6: (otherlv_1= '(' this_DomainSpecificEventsPattern_2= ruleDomainSpecificEventsPattern otherlv_3= ')' )
                    {
                    // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:1094:6: (otherlv_1= '(' this_DomainSpecificEventsPattern_2= ruleDomainSpecificEventsPattern otherlv_3= ')' )
                    // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:1094:8: otherlv_1= '(' this_DomainSpecificEventsPattern_2= ruleDomainSpecificEventsPattern otherlv_3= ')'
                    {
                    otherlv_1=(Token)match(input,32,FOLLOW_32_in_ruleDomainSpecificEventReferenceOrPattern2382); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getDomainSpecificEventReferenceOrPatternAccess().getLeftParenthesisKeyword_1_0());
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getDomainSpecificEventReferenceOrPatternAccess().getDomainSpecificEventsPatternParserRuleCall_1_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleDomainSpecificEventsPattern_in_ruleDomainSpecificEventReferenceOrPattern2404);
                    this_DomainSpecificEventsPattern_2=ruleDomainSpecificEventsPattern();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_DomainSpecificEventsPattern_2; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    otherlv_3=(Token)match(input,33,FOLLOW_33_in_ruleDomainSpecificEventReferenceOrPattern2415); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getDomainSpecificEventReferenceOrPatternAccess().getRightParenthesisKeyword_1_2());
                          
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
    // $ANTLR end "ruleDomainSpecificEventReferenceOrPattern"


    // $ANTLR start "entryRuleDomainSpecificEventReferenceWithOrWithoutTarget"
    // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:1119:1: entryRuleDomainSpecificEventReferenceWithOrWithoutTarget returns [EObject current=null] : iv_ruleDomainSpecificEventReferenceWithOrWithoutTarget= ruleDomainSpecificEventReferenceWithOrWithoutTarget EOF ;
    public final EObject entryRuleDomainSpecificEventReferenceWithOrWithoutTarget() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDomainSpecificEventReferenceWithOrWithoutTarget = null;


        try {
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:1120:2: (iv_ruleDomainSpecificEventReferenceWithOrWithoutTarget= ruleDomainSpecificEventReferenceWithOrWithoutTarget EOF )
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:1121:2: iv_ruleDomainSpecificEventReferenceWithOrWithoutTarget= ruleDomainSpecificEventReferenceWithOrWithoutTarget EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDomainSpecificEventReferenceWithOrWithoutTargetRule()); 
            }
            pushFollow(FOLLOW_ruleDomainSpecificEventReferenceWithOrWithoutTarget_in_entryRuleDomainSpecificEventReferenceWithOrWithoutTarget2452);
            iv_ruleDomainSpecificEventReferenceWithOrWithoutTarget=ruleDomainSpecificEventReferenceWithOrWithoutTarget();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDomainSpecificEventReferenceWithOrWithoutTarget; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDomainSpecificEventReferenceWithOrWithoutTarget2462); if (state.failed) return current;

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
    // $ANTLR end "entryRuleDomainSpecificEventReferenceWithOrWithoutTarget"


    // $ANTLR start "ruleDomainSpecificEventReferenceWithOrWithoutTarget"
    // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:1128:1: ruleDomainSpecificEventReferenceWithOrWithoutTarget returns [EObject current=null] : (this_DomainSpecificEventReference_0= ruleDomainSpecificEventReference | this_DomainSpecificEventReferenceWithArguments_1= ruleDomainSpecificEventReferenceWithArguments ) ;
    public final EObject ruleDomainSpecificEventReferenceWithOrWithoutTarget() throws RecognitionException {
        EObject current = null;

        EObject this_DomainSpecificEventReference_0 = null;

        EObject this_DomainSpecificEventReferenceWithArguments_1 = null;


         enterRule(); 
            
        try {
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:1131:28: ( (this_DomainSpecificEventReference_0= ruleDomainSpecificEventReference | this_DomainSpecificEventReferenceWithArguments_1= ruleDomainSpecificEventReferenceWithArguments ) )
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:1132:1: (this_DomainSpecificEventReference_0= ruleDomainSpecificEventReference | this_DomainSpecificEventReferenceWithArguments_1= ruleDomainSpecificEventReferenceWithArguments )
            {
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:1132:1: (this_DomainSpecificEventReference_0= ruleDomainSpecificEventReference | this_DomainSpecificEventReferenceWithArguments_1= ruleDomainSpecificEventReferenceWithArguments )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==RULE_ID) ) {
                int LA19_1 = input.LA(2);

                if ( (LA19_1==32) ) {
                    alt19=2;
                }
                else if ( (LA19_1==EOF||LA19_1==18||(LA19_1>=25 && LA19_1<=30)||LA19_1==33) ) {
                    alt19=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 19, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:1133:5: this_DomainSpecificEventReference_0= ruleDomainSpecificEventReference
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getDomainSpecificEventReferenceWithOrWithoutTargetAccess().getDomainSpecificEventReferenceParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleDomainSpecificEventReference_in_ruleDomainSpecificEventReferenceWithOrWithoutTarget2509);
                    this_DomainSpecificEventReference_0=ruleDomainSpecificEventReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_DomainSpecificEventReference_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:1143:5: this_DomainSpecificEventReferenceWithArguments_1= ruleDomainSpecificEventReferenceWithArguments
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getDomainSpecificEventReferenceWithOrWithoutTargetAccess().getDomainSpecificEventReferenceWithArgumentsParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleDomainSpecificEventReferenceWithArguments_in_ruleDomainSpecificEventReferenceWithOrWithoutTarget2536);
                    this_DomainSpecificEventReferenceWithArguments_1=ruleDomainSpecificEventReferenceWithArguments();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_DomainSpecificEventReferenceWithArguments_1; 
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
    // $ANTLR end "ruleDomainSpecificEventReferenceWithOrWithoutTarget"


    // $ANTLR start "entryRuleDomainSpecificEventReference"
    // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:1159:1: entryRuleDomainSpecificEventReference returns [EObject current=null] : iv_ruleDomainSpecificEventReference= ruleDomainSpecificEventReference EOF ;
    public final EObject entryRuleDomainSpecificEventReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDomainSpecificEventReference = null;


        try {
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:1160:2: (iv_ruleDomainSpecificEventReference= ruleDomainSpecificEventReference EOF )
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:1161:2: iv_ruleDomainSpecificEventReference= ruleDomainSpecificEventReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDomainSpecificEventReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleDomainSpecificEventReference_in_entryRuleDomainSpecificEventReference2571);
            iv_ruleDomainSpecificEventReference=ruleDomainSpecificEventReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDomainSpecificEventReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDomainSpecificEventReference2581); if (state.failed) return current;

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
    // $ANTLR end "entryRuleDomainSpecificEventReference"


    // $ANTLR start "ruleDomainSpecificEventReference"
    // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:1168:1: ruleDomainSpecificEventReference returns [EObject current=null] : ( () ( (otherlv_1= RULE_ID ) ) ) ;
    public final EObject ruleDomainSpecificEventReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:1171:28: ( ( () ( (otherlv_1= RULE_ID ) ) ) )
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:1172:1: ( () ( (otherlv_1= RULE_ID ) ) )
            {
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:1172:1: ( () ( (otherlv_1= RULE_ID ) ) )
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:1172:2: () ( (otherlv_1= RULE_ID ) )
            {
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:1172:2: ()
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:1173:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getDomainSpecificEventReferenceAccess().getDomainSpecificEventReferenceAction_0(),
                          current);
                  
            }

            }

            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:1178:2: ( (otherlv_1= RULE_ID ) )
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:1179:1: (otherlv_1= RULE_ID )
            {
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:1179:1: (otherlv_1= RULE_ID )
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:1180:3: otherlv_1= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getDomainSpecificEventReferenceRule());
              	        }
                      
            }
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDomainSpecificEventReference2635); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_1, grammarAccess.getDomainSpecificEventReferenceAccess().getReferencedDseDomainSpecificEventCrossReference_1_0()); 
              	
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
    // $ANTLR end "ruleDomainSpecificEventReference"


    // $ANTLR start "entryRuleDomainSpecificEventReferenceWithArguments"
    // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:1199:1: entryRuleDomainSpecificEventReferenceWithArguments returns [EObject current=null] : iv_ruleDomainSpecificEventReferenceWithArguments= ruleDomainSpecificEventReferenceWithArguments EOF ;
    public final EObject entryRuleDomainSpecificEventReferenceWithArguments() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDomainSpecificEventReferenceWithArguments = null;


        try {
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:1200:2: (iv_ruleDomainSpecificEventReferenceWithArguments= ruleDomainSpecificEventReferenceWithArguments EOF )
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:1201:2: iv_ruleDomainSpecificEventReferenceWithArguments= ruleDomainSpecificEventReferenceWithArguments EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDomainSpecificEventReferenceWithArgumentsRule()); 
            }
            pushFollow(FOLLOW_ruleDomainSpecificEventReferenceWithArguments_in_entryRuleDomainSpecificEventReferenceWithArguments2671);
            iv_ruleDomainSpecificEventReferenceWithArguments=ruleDomainSpecificEventReferenceWithArguments();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDomainSpecificEventReferenceWithArguments; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDomainSpecificEventReferenceWithArguments2681); if (state.failed) return current;

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
    // $ANTLR end "entryRuleDomainSpecificEventReferenceWithArguments"


    // $ANTLR start "ruleDomainSpecificEventReferenceWithArguments"
    // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:1208:1: ruleDomainSpecificEventReferenceWithArguments returns [EObject current=null] : ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' ( (lv_arguments_3_0= ruleListOfArguments ) ) otherlv_4= ')' ) ;
    public final EObject ruleDomainSpecificEventReferenceWithArguments() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_arguments_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:1211:28: ( ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' ( (lv_arguments_3_0= ruleListOfArguments ) ) otherlv_4= ')' ) )
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:1212:1: ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' ( (lv_arguments_3_0= ruleListOfArguments ) ) otherlv_4= ')' )
            {
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:1212:1: ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' ( (lv_arguments_3_0= ruleListOfArguments ) ) otherlv_4= ')' )
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:1212:2: () ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' ( (lv_arguments_3_0= ruleListOfArguments ) ) otherlv_4= ')'
            {
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:1212:2: ()
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:1213:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getDomainSpecificEventReferenceWithArgumentsAccess().getDomainSpecificEventReferenceWithArgumentsAction_0(),
                          current);
                  
            }

            }

            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:1218:2: ( (otherlv_1= RULE_ID ) )
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:1219:1: (otherlv_1= RULE_ID )
            {
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:1219:1: (otherlv_1= RULE_ID )
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:1220:3: otherlv_1= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getDomainSpecificEventReferenceWithArgumentsRule());
              	        }
                      
            }
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDomainSpecificEventReferenceWithArguments2735); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_1, grammarAccess.getDomainSpecificEventReferenceWithArgumentsAccess().getReferencedDseDomainSpecificEventCrossReference_1_0()); 
              	
            }

            }


            }

            otherlv_2=(Token)match(input,32,FOLLOW_32_in_ruleDomainSpecificEventReferenceWithArguments2747); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getDomainSpecificEventReferenceWithArgumentsAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:1235:1: ( (lv_arguments_3_0= ruleListOfArguments ) )
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:1236:1: (lv_arguments_3_0= ruleListOfArguments )
            {
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:1236:1: (lv_arguments_3_0= ruleListOfArguments )
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:1237:3: lv_arguments_3_0= ruleListOfArguments
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getDomainSpecificEventReferenceWithArgumentsAccess().getArgumentsListOfArgumentsParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleListOfArguments_in_ruleDomainSpecificEventReferenceWithArguments2768);
            lv_arguments_3_0=ruleListOfArguments();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getDomainSpecificEventReferenceWithArgumentsRule());
              	        }
                     		set(
                     			current, 
                     			"arguments",
                      		lv_arguments_3_0, 
                      		"ListOfArguments");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,33,FOLLOW_33_in_ruleDomainSpecificEventReferenceWithArguments2780); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getDomainSpecificEventReferenceWithArgumentsAccess().getRightParenthesisKeyword_4());
                  
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
    // $ANTLR end "ruleDomainSpecificEventReferenceWithArguments"


    // $ANTLR start "entryRuleListOfArguments"
    // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:1265:1: entryRuleListOfArguments returns [EObject current=null] : iv_ruleListOfArguments= ruleListOfArguments EOF ;
    public final EObject entryRuleListOfArguments() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleListOfArguments = null;


        try {
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:1266:2: (iv_ruleListOfArguments= ruleListOfArguments EOF )
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:1267:2: iv_ruleListOfArguments= ruleListOfArguments EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getListOfArgumentsRule()); 
            }
            pushFollow(FOLLOW_ruleListOfArguments_in_entryRuleListOfArguments2816);
            iv_ruleListOfArguments=ruleListOfArguments();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleListOfArguments; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleListOfArguments2826); if (state.failed) return current;

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
    // $ANTLR end "entryRuleListOfArguments"


    // $ANTLR start "ruleListOfArguments"
    // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:1274:1: ruleListOfArguments returns [EObject current=null] : (this_SingleArgument_0= ruleSingleArgument | this_MultipleArguments_1= ruleMultipleArguments ) ;
    public final EObject ruleListOfArguments() throws RecognitionException {
        EObject current = null;

        EObject this_SingleArgument_0 = null;

        EObject this_MultipleArguments_1 = null;


         enterRule(); 
            
        try {
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:1277:28: ( (this_SingleArgument_0= ruleSingleArgument | this_MultipleArguments_1= ruleMultipleArguments ) )
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:1278:1: (this_SingleArgument_0= ruleSingleArgument | this_MultipleArguments_1= ruleMultipleArguments )
            {
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:1278:1: (this_SingleArgument_0= ruleSingleArgument | this_MultipleArguments_1= ruleMultipleArguments )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==RULE_ID) ) {
                int LA20_1 = input.LA(2);

                if ( (LA20_1==34) ) {
                    alt20=2;
                }
                else if ( (LA20_1==EOF||LA20_1==33) ) {
                    alt20=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 20, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:1279:5: this_SingleArgument_0= ruleSingleArgument
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getListOfArgumentsAccess().getSingleArgumentParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleSingleArgument_in_ruleListOfArguments2873);
                    this_SingleArgument_0=ruleSingleArgument();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_SingleArgument_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:1289:5: this_MultipleArguments_1= ruleMultipleArguments
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getListOfArgumentsAccess().getMultipleArgumentsParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleMultipleArguments_in_ruleListOfArguments2900);
                    this_MultipleArguments_1=ruleMultipleArguments();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_MultipleArguments_1; 
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
    // $ANTLR end "ruleListOfArguments"


    // $ANTLR start "entryRuleSingleArgument"
    // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:1305:1: entryRuleSingleArgument returns [EObject current=null] : iv_ruleSingleArgument= ruleSingleArgument EOF ;
    public final EObject entryRuleSingleArgument() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSingleArgument = null;


        try {
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:1306:2: (iv_ruleSingleArgument= ruleSingleArgument EOF )
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:1307:2: iv_ruleSingleArgument= ruleSingleArgument EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSingleArgumentRule()); 
            }
            pushFollow(FOLLOW_ruleSingleArgument_in_entryRuleSingleArgument2935);
            iv_ruleSingleArgument=ruleSingleArgument();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSingleArgument; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSingleArgument2945); if (state.failed) return current;

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
    // $ANTLR end "entryRuleSingleArgument"


    // $ANTLR start "ruleSingleArgument"
    // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:1314:1: ruleSingleArgument returns [EObject current=null] : ( () ( (otherlv_1= RULE_ID ) ) ) ;
    public final EObject ruleSingleArgument() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:1317:28: ( ( () ( (otherlv_1= RULE_ID ) ) ) )
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:1318:1: ( () ( (otherlv_1= RULE_ID ) ) )
            {
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:1318:1: ( () ( (otherlv_1= RULE_ID ) ) )
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:1318:2: () ( (otherlv_1= RULE_ID ) )
            {
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:1318:2: ()
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:1319:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getSingleArgumentAccess().getSingleArgumentAction_0(),
                          current);
                  
            }

            }

            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:1324:2: ( (otherlv_1= RULE_ID ) )
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:1325:1: (otherlv_1= RULE_ID )
            {
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:1325:1: (otherlv_1= RULE_ID )
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:1326:3: otherlv_1= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getSingleArgumentRule());
              	        }
                      
            }
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSingleArgument2999); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_1, grammarAccess.getSingleArgumentAccess().getArgumentLocalVariableCrossReference_1_0()); 
              	
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
    // $ANTLR end "ruleSingleArgument"


    // $ANTLR start "entryRuleMultipleArguments"
    // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:1345:1: entryRuleMultipleArguments returns [EObject current=null] : iv_ruleMultipleArguments= ruleMultipleArguments EOF ;
    public final EObject entryRuleMultipleArguments() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultipleArguments = null;


        try {
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:1346:2: (iv_ruleMultipleArguments= ruleMultipleArguments EOF )
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:1347:2: iv_ruleMultipleArguments= ruleMultipleArguments EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMultipleArgumentsRule()); 
            }
            pushFollow(FOLLOW_ruleMultipleArguments_in_entryRuleMultipleArguments3035);
            iv_ruleMultipleArguments=ruleMultipleArguments();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMultipleArguments; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMultipleArguments3045); if (state.failed) return current;

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
    // $ANTLR end "entryRuleMultipleArguments"


    // $ANTLR start "ruleMultipleArguments"
    // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:1354:1: ruleMultipleArguments returns [EObject current=null] : ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= ',' ( (lv_tail_3_0= ruleListOfArguments ) ) ) ;
    public final EObject ruleMultipleArguments() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        EObject lv_tail_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:1357:28: ( ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= ',' ( (lv_tail_3_0= ruleListOfArguments ) ) ) )
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:1358:1: ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= ',' ( (lv_tail_3_0= ruleListOfArguments ) ) )
            {
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:1358:1: ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= ',' ( (lv_tail_3_0= ruleListOfArguments ) ) )
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:1358:2: () ( (otherlv_1= RULE_ID ) ) otherlv_2= ',' ( (lv_tail_3_0= ruleListOfArguments ) )
            {
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:1358:2: ()
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:1359:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getMultipleArgumentsAccess().getMultipleArgumentsAction_0(),
                          current);
                  
            }

            }

            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:1364:2: ( (otherlv_1= RULE_ID ) )
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:1365:1: (otherlv_1= RULE_ID )
            {
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:1365:1: (otherlv_1= RULE_ID )
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:1366:3: otherlv_1= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getMultipleArgumentsRule());
              	        }
                      
            }
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMultipleArguments3099); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_1, grammarAccess.getMultipleArgumentsAccess().getHeadLocalVariableCrossReference_1_0()); 
              	
            }

            }


            }

            otherlv_2=(Token)match(input,34,FOLLOW_34_in_ruleMultipleArguments3111); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getMultipleArgumentsAccess().getCommaKeyword_2());
                  
            }
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:1381:1: ( (lv_tail_3_0= ruleListOfArguments ) )
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:1382:1: (lv_tail_3_0= ruleListOfArguments )
            {
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:1382:1: (lv_tail_3_0= ruleListOfArguments )
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:1383:3: lv_tail_3_0= ruleListOfArguments
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMultipleArgumentsAccess().getTailListOfArgumentsParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleListOfArguments_in_ruleMultipleArguments3132);
            lv_tail_3_0=ruleListOfArguments();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getMultipleArgumentsRule());
              	        }
                     		set(
                     			current, 
                     			"tail",
                      		lv_tail_3_0, 
                      		"ListOfArguments");
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
    // $ANTLR end "ruleMultipleArguments"


    // $ANTLR start "entryRuleFeedbackPolicy"
    // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:1407:1: entryRuleFeedbackPolicy returns [EObject current=null] : iv_ruleFeedbackPolicy= ruleFeedbackPolicy EOF ;
    public final EObject entryRuleFeedbackPolicy() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFeedbackPolicy = null;


        try {
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:1408:2: (iv_ruleFeedbackPolicy= ruleFeedbackPolicy EOF )
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:1409:2: iv_ruleFeedbackPolicy= ruleFeedbackPolicy EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFeedbackPolicyRule()); 
            }
            pushFollow(FOLLOW_ruleFeedbackPolicy_in_entryRuleFeedbackPolicy3168);
            iv_ruleFeedbackPolicy=ruleFeedbackPolicy();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFeedbackPolicy; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFeedbackPolicy3178); if (state.failed) return current;

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
    // $ANTLR end "entryRuleFeedbackPolicy"


    // $ANTLR start "ruleFeedbackPolicy"
    // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:1416:1: ruleFeedbackPolicy returns [EObject current=null] : ( () ( (lv_rules_1_0= ruleFeedbackRule ) )* ( (lv_defaultRule_2_0= ruleDefaultFeedbackRule ) ) ) ;
    public final EObject ruleFeedbackPolicy() throws RecognitionException {
        EObject current = null;

        EObject lv_rules_1_0 = null;

        EObject lv_defaultRule_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:1419:28: ( ( () ( (lv_rules_1_0= ruleFeedbackRule ) )* ( (lv_defaultRule_2_0= ruleDefaultFeedbackRule ) ) ) )
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:1420:1: ( () ( (lv_rules_1_0= ruleFeedbackRule ) )* ( (lv_defaultRule_2_0= ruleDefaultFeedbackRule ) ) )
            {
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:1420:1: ( () ( (lv_rules_1_0= ruleFeedbackRule ) )* ( (lv_defaultRule_2_0= ruleDefaultFeedbackRule ) ) )
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:1420:2: () ( (lv_rules_1_0= ruleFeedbackRule ) )* ( (lv_defaultRule_2_0= ruleDefaultFeedbackRule ) )
            {
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:1420:2: ()
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:1421:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getFeedbackPolicyAccess().getFeedbackPolicyAction_0(),
                          current);
                  
            }

            }

            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:1426:2: ( (lv_rules_1_0= ruleFeedbackRule ) )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==30) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:1427:1: (lv_rules_1_0= ruleFeedbackRule )
            	    {
            	    // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:1427:1: (lv_rules_1_0= ruleFeedbackRule )
            	    // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:1428:3: lv_rules_1_0= ruleFeedbackRule
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getFeedbackPolicyAccess().getRulesFeedbackRuleParserRuleCall_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleFeedbackRule_in_ruleFeedbackPolicy3233);
            	    lv_rules_1_0=ruleFeedbackRule();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getFeedbackPolicyRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"rules",
            	              		lv_rules_1_0, 
            	              		"FeedbackRule");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:1444:3: ( (lv_defaultRule_2_0= ruleDefaultFeedbackRule ) )
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:1445:1: (lv_defaultRule_2_0= ruleDefaultFeedbackRule )
            {
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:1445:1: (lv_defaultRule_2_0= ruleDefaultFeedbackRule )
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:1446:3: lv_defaultRule_2_0= ruleDefaultFeedbackRule
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getFeedbackPolicyAccess().getDefaultRuleDefaultFeedbackRuleParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleDefaultFeedbackRule_in_ruleFeedbackPolicy3255);
            lv_defaultRule_2_0=ruleDefaultFeedbackRule();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getFeedbackPolicyRule());
              	        }
                     		set(
                     			current, 
                     			"defaultRule",
                      		lv_defaultRule_2_0, 
                      		"DefaultFeedbackRule");
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
    // $ANTLR end "ruleFeedbackPolicy"


    // $ANTLR start "entryRuleFeedbackRule"
    // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:1470:1: entryRuleFeedbackRule returns [EObject current=null] : iv_ruleFeedbackRule= ruleFeedbackRule EOF ;
    public final EObject entryRuleFeedbackRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFeedbackRule = null;


        try {
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:1471:2: (iv_ruleFeedbackRule= ruleFeedbackRule EOF )
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:1472:2: iv_ruleFeedbackRule= ruleFeedbackRule EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFeedbackRuleRule()); 
            }
            pushFollow(FOLLOW_ruleFeedbackRule_in_entryRuleFeedbackRule3291);
            iv_ruleFeedbackRule=ruleFeedbackRule();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFeedbackRule; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFeedbackRule3301); if (state.failed) return current;

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
    // $ANTLR end "entryRuleFeedbackRule"


    // $ANTLR start "ruleFeedbackRule"
    // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:1479:1: ruleFeedbackRule returns [EObject current=null] : ( () otherlv_1= '[' ( (lv_filter_2_0= ruleFeedbackFilter ) ) otherlv_3= ']' otherlv_4= '=>' ( (lv_consequence_5_0= ruleFeedbackConsequence ) ) ) ;
    public final EObject ruleFeedbackRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        EObject lv_filter_2_0 = null;

        EObject lv_consequence_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:1482:28: ( ( () otherlv_1= '[' ( (lv_filter_2_0= ruleFeedbackFilter ) ) otherlv_3= ']' otherlv_4= '=>' ( (lv_consequence_5_0= ruleFeedbackConsequence ) ) ) )
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:1483:1: ( () otherlv_1= '[' ( (lv_filter_2_0= ruleFeedbackFilter ) ) otherlv_3= ']' otherlv_4= '=>' ( (lv_consequence_5_0= ruleFeedbackConsequence ) ) )
            {
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:1483:1: ( () otherlv_1= '[' ( (lv_filter_2_0= ruleFeedbackFilter ) ) otherlv_3= ']' otherlv_4= '=>' ( (lv_consequence_5_0= ruleFeedbackConsequence ) ) )
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:1483:2: () otherlv_1= '[' ( (lv_filter_2_0= ruleFeedbackFilter ) ) otherlv_3= ']' otherlv_4= '=>' ( (lv_consequence_5_0= ruleFeedbackConsequence ) )
            {
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:1483:2: ()
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:1484:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getFeedbackRuleAccess().getFeedbackRuleAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,30,FOLLOW_30_in_ruleFeedbackRule3347); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getFeedbackRuleAccess().getLeftSquareBracketKeyword_1());
                  
            }
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:1493:1: ( (lv_filter_2_0= ruleFeedbackFilter ) )
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:1494:1: (lv_filter_2_0= ruleFeedbackFilter )
            {
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:1494:1: (lv_filter_2_0= ruleFeedbackFilter )
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:1495:3: lv_filter_2_0= ruleFeedbackFilter
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getFeedbackRuleAccess().getFilterFeedbackFilterParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleFeedbackFilter_in_ruleFeedbackRule3368);
            lv_filter_2_0=ruleFeedbackFilter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getFeedbackRuleRule());
              	        }
                     		set(
                     			current, 
                     			"filter",
                      		lv_filter_2_0, 
                      		"FeedbackFilter");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,31,FOLLOW_31_in_ruleFeedbackRule3380); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getFeedbackRuleAccess().getRightSquareBracketKeyword_3());
                  
            }
            otherlv_4=(Token)match(input,35,FOLLOW_35_in_ruleFeedbackRule3392); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getFeedbackRuleAccess().getEqualsSignGreaterThanSignKeyword_4());
                  
            }
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:1519:1: ( (lv_consequence_5_0= ruleFeedbackConsequence ) )
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:1520:1: (lv_consequence_5_0= ruleFeedbackConsequence )
            {
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:1520:1: (lv_consequence_5_0= ruleFeedbackConsequence )
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:1521:3: lv_consequence_5_0= ruleFeedbackConsequence
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getFeedbackRuleAccess().getConsequenceFeedbackConsequenceParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleFeedbackConsequence_in_ruleFeedbackRule3413);
            lv_consequence_5_0=ruleFeedbackConsequence();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getFeedbackRuleRule());
              	        }
                     		set(
                     			current, 
                     			"consequence",
                      		lv_consequence_5_0, 
                      		"FeedbackConsequence");
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
    // $ANTLR end "ruleFeedbackRule"


    // $ANTLR start "entryRuleDefaultFeedbackRule"
    // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:1545:1: entryRuleDefaultFeedbackRule returns [EObject current=null] : iv_ruleDefaultFeedbackRule= ruleDefaultFeedbackRule EOF ;
    public final EObject entryRuleDefaultFeedbackRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefaultFeedbackRule = null;


        try {
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:1546:2: (iv_ruleDefaultFeedbackRule= ruleDefaultFeedbackRule EOF )
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:1547:2: iv_ruleDefaultFeedbackRule= ruleDefaultFeedbackRule EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDefaultFeedbackRuleRule()); 
            }
            pushFollow(FOLLOW_ruleDefaultFeedbackRule_in_entryRuleDefaultFeedbackRule3449);
            iv_ruleDefaultFeedbackRule=ruleDefaultFeedbackRule();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDefaultFeedbackRule; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDefaultFeedbackRule3459); if (state.failed) return current;

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
    // $ANTLR end "entryRuleDefaultFeedbackRule"


    // $ANTLR start "ruleDefaultFeedbackRule"
    // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:1554:1: ruleDefaultFeedbackRule returns [EObject current=null] : ( () otherlv_1= 'default' otherlv_2= '=>' ( (lv_consequence_3_0= ruleFeedbackConsequence ) ) ) ;
    public final EObject ruleDefaultFeedbackRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        EObject lv_consequence_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:1557:28: ( ( () otherlv_1= 'default' otherlv_2= '=>' ( (lv_consequence_3_0= ruleFeedbackConsequence ) ) ) )
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:1558:1: ( () otherlv_1= 'default' otherlv_2= '=>' ( (lv_consequence_3_0= ruleFeedbackConsequence ) ) )
            {
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:1558:1: ( () otherlv_1= 'default' otherlv_2= '=>' ( (lv_consequence_3_0= ruleFeedbackConsequence ) ) )
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:1558:2: () otherlv_1= 'default' otherlv_2= '=>' ( (lv_consequence_3_0= ruleFeedbackConsequence ) )
            {
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:1558:2: ()
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:1559:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getDefaultFeedbackRuleAccess().getFeedbackRuleAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,36,FOLLOW_36_in_ruleDefaultFeedbackRule3505); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getDefaultFeedbackRuleAccess().getDefaultKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,35,FOLLOW_35_in_ruleDefaultFeedbackRule3517); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getDefaultFeedbackRuleAccess().getEqualsSignGreaterThanSignKeyword_2());
                  
            }
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:1572:1: ( (lv_consequence_3_0= ruleFeedbackConsequence ) )
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:1573:1: (lv_consequence_3_0= ruleFeedbackConsequence )
            {
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:1573:1: (lv_consequence_3_0= ruleFeedbackConsequence )
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:1574:3: lv_consequence_3_0= ruleFeedbackConsequence
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getDefaultFeedbackRuleAccess().getConsequenceFeedbackConsequenceParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleFeedbackConsequence_in_ruleDefaultFeedbackRule3538);
            lv_consequence_3_0=ruleFeedbackConsequence();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getDefaultFeedbackRuleRule());
              	        }
                     		set(
                     			current, 
                     			"consequence",
                      		lv_consequence_3_0, 
                      		"FeedbackConsequence");
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
    // $ANTLR end "ruleDefaultFeedbackRule"


    // $ANTLR start "entryRuleFeedbackFilter"
    // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:1598:1: entryRuleFeedbackFilter returns [EObject current=null] : iv_ruleFeedbackFilter= ruleFeedbackFilter EOF ;
    public final EObject entryRuleFeedbackFilter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFeedbackFilter = null;


        try {
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:1599:2: (iv_ruleFeedbackFilter= ruleFeedbackFilter EOF )
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:1600:2: iv_ruleFeedbackFilter= ruleFeedbackFilter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFeedbackFilterRule()); 
            }
            pushFollow(FOLLOW_ruleFeedbackFilter_in_entryRuleFeedbackFilter3574);
            iv_ruleFeedbackFilter=ruleFeedbackFilter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFeedbackFilter; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFeedbackFilter3584); if (state.failed) return current;

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
    // $ANTLR end "entryRuleFeedbackFilter"


    // $ANTLR start "ruleFeedbackFilter"
    // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:1607:1: ruleFeedbackFilter returns [EObject current=null] : ( () ( (lv_body_1_0= ruleGExpression ) ) ) ;
    public final EObject ruleFeedbackFilter() throws RecognitionException {
        EObject current = null;

        EObject lv_body_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:1610:28: ( ( () ( (lv_body_1_0= ruleGExpression ) ) ) )
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:1611:1: ( () ( (lv_body_1_0= ruleGExpression ) ) )
            {
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:1611:1: ( () ( (lv_body_1_0= ruleGExpression ) ) )
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:1611:2: () ( (lv_body_1_0= ruleGExpression ) )
            {
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:1611:2: ()
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:1612:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getFeedbackFilterAccess().getFeedbackFilterAction_0(),
                          current);
                  
            }

            }

            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:1617:2: ( (lv_body_1_0= ruleGExpression ) )
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:1618:1: (lv_body_1_0= ruleGExpression )
            {
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:1618:1: (lv_body_1_0= ruleGExpression )
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:1619:3: lv_body_1_0= ruleGExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getFeedbackFilterAccess().getBodyGExpressionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleGExpression_in_ruleFeedbackFilter3639);
            lv_body_1_0=ruleGExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getFeedbackFilterRule());
              	        }
                     		set(
                     			current, 
                     			"body",
                      		lv_body_1_0, 
                      		"GExpression");
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
    // $ANTLR end "ruleFeedbackFilter"


    // $ANTLR start "entryRuleFeedbackConsequence"
    // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:1643:1: entryRuleFeedbackConsequence returns [EObject current=null] : iv_ruleFeedbackConsequence= ruleFeedbackConsequence EOF ;
    public final EObject entryRuleFeedbackConsequence() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFeedbackConsequence = null;


        try {
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:1644:2: (iv_ruleFeedbackConsequence= ruleFeedbackConsequence EOF )
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:1645:2: iv_ruleFeedbackConsequence= ruleFeedbackConsequence EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFeedbackConsequenceRule()); 
            }
            pushFollow(FOLLOW_ruleFeedbackConsequence_in_entryRuleFeedbackConsequence3675);
            iv_ruleFeedbackConsequence=ruleFeedbackConsequence();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFeedbackConsequence; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFeedbackConsequence3685); if (state.failed) return current;

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
    // $ANTLR end "entryRuleFeedbackConsequence"


    // $ANTLR start "ruleFeedbackConsequence"
    // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:1652:1: ruleFeedbackConsequence returns [EObject current=null] : ( () otherlv_1= 'allow' ( (lv_navigationPathToMoccEvent_2_0= ruleGExpression ) ) ) ;
    public final EObject ruleFeedbackConsequence() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_navigationPathToMoccEvent_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:1655:28: ( ( () otherlv_1= 'allow' ( (lv_navigationPathToMoccEvent_2_0= ruleGExpression ) ) ) )
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:1656:1: ( () otherlv_1= 'allow' ( (lv_navigationPathToMoccEvent_2_0= ruleGExpression ) ) )
            {
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:1656:1: ( () otherlv_1= 'allow' ( (lv_navigationPathToMoccEvent_2_0= ruleGExpression ) ) )
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:1656:2: () otherlv_1= 'allow' ( (lv_navigationPathToMoccEvent_2_0= ruleGExpression ) )
            {
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:1656:2: ()
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:1657:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getFeedbackConsequenceAccess().getFeedbackConsequenceAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,37,FOLLOW_37_in_ruleFeedbackConsequence3731); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getFeedbackConsequenceAccess().getAllowKeyword_1());
                  
            }
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:1666:1: ( (lv_navigationPathToMoccEvent_2_0= ruleGExpression ) )
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:1667:1: (lv_navigationPathToMoccEvent_2_0= ruleGExpression )
            {
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:1667:1: (lv_navigationPathToMoccEvent_2_0= ruleGExpression )
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:1668:3: lv_navigationPathToMoccEvent_2_0= ruleGExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getFeedbackConsequenceAccess().getNavigationPathToMoccEventGExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleGExpression_in_ruleFeedbackConsequence3752);
            lv_navigationPathToMoccEvent_2_0=ruleGExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getFeedbackConsequenceRule());
              	        }
                     		set(
                     			current, 
                     			"navigationPathToMoccEvent",
                      		lv_navigationPathToMoccEvent_2_0, 
                      		"GExpression");
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
    // $ANTLR end "ruleFeedbackConsequence"


    // $ANTLR start "entryRuleMoccEvent"
    // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:1692:1: entryRuleMoccEvent returns [EObject current=null] : iv_ruleMoccEvent= ruleMoccEvent EOF ;
    public final EObject entryRuleMoccEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMoccEvent = null;


        try {
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:1693:2: (iv_ruleMoccEvent= ruleMoccEvent EOF )
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:1694:2: iv_ruleMoccEvent= ruleMoccEvent EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMoccEventRule()); 
            }
            pushFollow(FOLLOW_ruleMoccEvent_in_entryRuleMoccEvent3788);
            iv_ruleMoccEvent=ruleMoccEvent();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMoccEvent; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMoccEvent3798); if (state.failed) return current;

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
    // $ANTLR end "entryRuleMoccEvent"


    // $ANTLR start "ruleMoccEvent"
    // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:1701:1: ruleMoccEvent returns [EObject current=null] : this_EclEvent_0= ruleEclEvent ;
    public final EObject ruleMoccEvent() throws RecognitionException {
        EObject current = null;

        EObject this_EclEvent_0 = null;


         enterRule(); 
            
        try {
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:1704:28: (this_EclEvent_0= ruleEclEvent )
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:1706:5: this_EclEvent_0= ruleEclEvent
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getMoccEventAccess().getEclEventParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_ruleEclEvent_in_ruleMoccEvent3844);
            this_EclEvent_0=ruleEclEvent();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_EclEvent_0; 
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
    // $ANTLR end "ruleMoccEvent"


    // $ANTLR start "entryRuleEclEvent"
    // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:1722:1: entryRuleEclEvent returns [EObject current=null] : iv_ruleEclEvent= ruleEclEvent EOF ;
    public final EObject entryRuleEclEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEclEvent = null;


        try {
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:1723:2: (iv_ruleEclEvent= ruleEclEvent EOF )
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:1724:2: iv_ruleEclEvent= ruleEclEvent EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEclEventRule()); 
            }
            pushFollow(FOLLOW_ruleEclEvent_in_entryRuleEclEvent3878);
            iv_ruleEclEvent=ruleEclEvent();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEclEvent; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEclEvent3888); if (state.failed) return current;

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
    // $ANTLR end "entryRuleEclEvent"


    // $ANTLR start "ruleEclEvent"
    // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:1731:1: ruleEclEvent returns [EObject current=null] : ( () ( ( ruleQualifiedName ) ) ) ;
    public final EObject ruleEclEvent() throws RecognitionException {
        EObject current = null;

         enterRule(); 
            
        try {
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:1734:28: ( ( () ( ( ruleQualifiedName ) ) ) )
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:1735:1: ( () ( ( ruleQualifiedName ) ) )
            {
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:1735:1: ( () ( ( ruleQualifiedName ) ) )
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:1735:2: () ( ( ruleQualifiedName ) )
            {
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:1735:2: ()
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:1736:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getEclEventAccess().getEclEventAction_0(),
                          current);
                  
            }

            }

            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:1741:2: ( ( ruleQualifiedName ) )
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:1742:1: ( ruleQualifiedName )
            {
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:1742:1: ( ruleQualifiedName )
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:1743:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getEclEventRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getEclEventAccess().getEventReferenceECLDefCSCrossReference_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleEclEvent3945);
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
    // $ANTLR end "ruleEclEvent"


    // $ANTLR start "entryRuleExecutionFunction"
    // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:1764:1: entryRuleExecutionFunction returns [EObject current=null] : iv_ruleExecutionFunction= ruleExecutionFunction EOF ;
    public final EObject entryRuleExecutionFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExecutionFunction = null;


        try {
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:1765:2: (iv_ruleExecutionFunction= ruleExecutionFunction EOF )
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:1766:2: iv_ruleExecutionFunction= ruleExecutionFunction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExecutionFunctionRule()); 
            }
            pushFollow(FOLLOW_ruleExecutionFunction_in_entryRuleExecutionFunction3981);
            iv_ruleExecutionFunction=ruleExecutionFunction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExecutionFunction; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExecutionFunction3991); if (state.failed) return current;

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
    // $ANTLR end "entryRuleExecutionFunction"


    // $ANTLR start "ruleExecutionFunction"
    // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:1773:1: ruleExecutionFunction returns [EObject current=null] : this_Kermeta3ExecutionFunction_0= ruleKermeta3ExecutionFunction ;
    public final EObject ruleExecutionFunction() throws RecognitionException {
        EObject current = null;

        EObject this_Kermeta3ExecutionFunction_0 = null;


         enterRule(); 
            
        try {
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:1776:28: (this_Kermeta3ExecutionFunction_0= ruleKermeta3ExecutionFunction )
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:1778:5: this_Kermeta3ExecutionFunction_0= ruleKermeta3ExecutionFunction
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getExecutionFunctionAccess().getKermeta3ExecutionFunctionParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_ruleKermeta3ExecutionFunction_in_ruleExecutionFunction4037);
            this_Kermeta3ExecutionFunction_0=ruleKermeta3ExecutionFunction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_Kermeta3ExecutionFunction_0; 
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
    // $ANTLR end "ruleExecutionFunction"


    // $ANTLR start "entryRuleKermeta3ExecutionFunction"
    // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:1794:1: entryRuleKermeta3ExecutionFunction returns [EObject current=null] : iv_ruleKermeta3ExecutionFunction= ruleKermeta3ExecutionFunction EOF ;
    public final EObject entryRuleKermeta3ExecutionFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleKermeta3ExecutionFunction = null;


        try {
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:1795:2: (iv_ruleKermeta3ExecutionFunction= ruleKermeta3ExecutionFunction EOF )
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:1796:2: iv_ruleKermeta3ExecutionFunction= ruleKermeta3ExecutionFunction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getKermeta3ExecutionFunctionRule()); 
            }
            pushFollow(FOLLOW_ruleKermeta3ExecutionFunction_in_entryRuleKermeta3ExecutionFunction4071);
            iv_ruleKermeta3ExecutionFunction=ruleKermeta3ExecutionFunction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleKermeta3ExecutionFunction; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleKermeta3ExecutionFunction4081); if (state.failed) return current;

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
    // $ANTLR end "entryRuleKermeta3ExecutionFunction"


    // $ANTLR start "ruleKermeta3ExecutionFunction"
    // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:1803:1: ruleKermeta3ExecutionFunction returns [EObject current=null] : ( () ( (lv_navigationPathToOperation_1_0= ruleGExpression ) ) ( (lv_callKind_2_0= ruleCallKind ) )? (otherlv_3= 'returning' ( (lv_result_4_0= ruleExecutionFunctionResult ) ) )? ) ;
    public final EObject ruleKermeta3ExecutionFunction() throws RecognitionException {
        EObject current = null;

        Token otherlv_3=null;
        EObject lv_navigationPathToOperation_1_0 = null;

        Enumerator lv_callKind_2_0 = null;

        EObject lv_result_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:1806:28: ( ( () ( (lv_navigationPathToOperation_1_0= ruleGExpression ) ) ( (lv_callKind_2_0= ruleCallKind ) )? (otherlv_3= 'returning' ( (lv_result_4_0= ruleExecutionFunctionResult ) ) )? ) )
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:1807:1: ( () ( (lv_navigationPathToOperation_1_0= ruleGExpression ) ) ( (lv_callKind_2_0= ruleCallKind ) )? (otherlv_3= 'returning' ( (lv_result_4_0= ruleExecutionFunctionResult ) ) )? )
            {
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:1807:1: ( () ( (lv_navigationPathToOperation_1_0= ruleGExpression ) ) ( (lv_callKind_2_0= ruleCallKind ) )? (otherlv_3= 'returning' ( (lv_result_4_0= ruleExecutionFunctionResult ) ) )? )
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:1807:2: () ( (lv_navigationPathToOperation_1_0= ruleGExpression ) ) ( (lv_callKind_2_0= ruleCallKind ) )? (otherlv_3= 'returning' ( (lv_result_4_0= ruleExecutionFunctionResult ) ) )?
            {
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:1807:2: ()
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:1808:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getKermeta3ExecutionFunctionAccess().getKermeta3ExecutionFunctionAction_0(),
                          current);
                  
            }

            }

            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:1813:2: ( (lv_navigationPathToOperation_1_0= ruleGExpression ) )
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:1814:1: (lv_navigationPathToOperation_1_0= ruleGExpression )
            {
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:1814:1: (lv_navigationPathToOperation_1_0= ruleGExpression )
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:1815:3: lv_navigationPathToOperation_1_0= ruleGExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getKermeta3ExecutionFunctionAccess().getNavigationPathToOperationGExpressionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleGExpression_in_ruleKermeta3ExecutionFunction4136);
            lv_navigationPathToOperation_1_0=ruleGExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getKermeta3ExecutionFunctionRule());
              	        }
                     		set(
                     			current, 
                     			"navigationPathToOperation",
                      		lv_navigationPathToOperation_1_0, 
                      		"GExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:1831:2: ( (lv_callKind_2_0= ruleCallKind ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( ((LA22_0>=50 && LA22_0<=51)) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:1832:1: (lv_callKind_2_0= ruleCallKind )
                    {
                    // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:1832:1: (lv_callKind_2_0= ruleCallKind )
                    // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:1833:3: lv_callKind_2_0= ruleCallKind
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getKermeta3ExecutionFunctionAccess().getCallKindCallKindEnumRuleCall_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleCallKind_in_ruleKermeta3ExecutionFunction4157);
                    lv_callKind_2_0=ruleCallKind();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getKermeta3ExecutionFunctionRule());
                      	        }
                             		set(
                             			current, 
                             			"callKind",
                              		lv_callKind_2_0, 
                              		"CallKind");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:1849:3: (otherlv_3= 'returning' ( (lv_result_4_0= ruleExecutionFunctionResult ) ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==38) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:1849:5: otherlv_3= 'returning' ( (lv_result_4_0= ruleExecutionFunctionResult ) )
                    {
                    otherlv_3=(Token)match(input,38,FOLLOW_38_in_ruleKermeta3ExecutionFunction4171); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getKermeta3ExecutionFunctionAccess().getReturningKeyword_3_0());
                          
                    }
                    // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:1853:1: ( (lv_result_4_0= ruleExecutionFunctionResult ) )
                    // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:1854:1: (lv_result_4_0= ruleExecutionFunctionResult )
                    {
                    // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:1854:1: (lv_result_4_0= ruleExecutionFunctionResult )
                    // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:1855:3: lv_result_4_0= ruleExecutionFunctionResult
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getKermeta3ExecutionFunctionAccess().getResultExecutionFunctionResultParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExecutionFunctionResult_in_ruleKermeta3ExecutionFunction4192);
                    lv_result_4_0=ruleExecutionFunctionResult();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getKermeta3ExecutionFunctionRule());
                      	        }
                             		set(
                             			current, 
                             			"result",
                              		lv_result_4_0, 
                              		"ExecutionFunctionResult");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

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
    // $ANTLR end "ruleKermeta3ExecutionFunction"


    // $ANTLR start "entryRuleExecutionFunctionResult"
    // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:1879:1: entryRuleExecutionFunctionResult returns [EObject current=null] : iv_ruleExecutionFunctionResult= ruleExecutionFunctionResult EOF ;
    public final EObject entryRuleExecutionFunctionResult() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExecutionFunctionResult = null;


        try {
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:1880:2: (iv_ruleExecutionFunctionResult= ruleExecutionFunctionResult EOF )
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:1881:2: iv_ruleExecutionFunctionResult= ruleExecutionFunctionResult EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExecutionFunctionResultRule()); 
            }
            pushFollow(FOLLOW_ruleExecutionFunctionResult_in_entryRuleExecutionFunctionResult4230);
            iv_ruleExecutionFunctionResult=ruleExecutionFunctionResult();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExecutionFunctionResult; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExecutionFunctionResult4240); if (state.failed) return current;

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
    // $ANTLR end "entryRuleExecutionFunctionResult"


    // $ANTLR start "ruleExecutionFunctionResult"
    // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:1888:1: ruleExecutionFunctionResult returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleExecutionFunctionResult() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;

         enterRule(); 
            
        try {
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:1891:28: ( ( () ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:1892:1: ( () ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:1892:1: ( () ( (lv_name_1_0= RULE_ID ) ) )
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:1892:2: () ( (lv_name_1_0= RULE_ID ) )
            {
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:1892:2: ()
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:1893:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getExecutionFunctionResultAccess().getExecutionFunctionResultAction_0(),
                          current);
                  
            }

            }

            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:1898:2: ( (lv_name_1_0= RULE_ID ) )
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:1899:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:1899:1: (lv_name_1_0= RULE_ID )
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:1900:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleExecutionFunctionResult4291); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_1_0, grammarAccess.getExecutionFunctionResultAccess().getNameIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getExecutionFunctionResultRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
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
    // $ANTLR end "ruleExecutionFunctionResult"


    // $ANTLR start "entryRuleQualifiedName"
    // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:1924:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:1925:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:1926:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName4333);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedName.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName4344); if (state.failed) return current;

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
    // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:1933:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:1936:28: ( (this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )* ) )
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:1937:1: (this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )* )
            {
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:1937:1: (this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )* )
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:1937:6: this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName4384); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
                  
            }
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:1944:1: ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==39) ) {
                    int LA24_2 = input.LA(2);

                    if ( (LA24_2==RULE_ID) ) {
                        int LA24_3 = input.LA(3);

                        if ( (synpred2_InternalGEL()) ) {
                            alt24=1;
                        }


                    }


                }


                switch (alt24) {
            	case 1 :
            	    // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:1944:2: ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID
            	    {
            	    // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:1944:2: ( ( '.' )=>kw= '.' )
            	    // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:1944:3: ( '.' )=>kw= '.'
            	    {
            	    kw=(Token)match(input,39,FOLLOW_39_in_ruleQualifiedName4412); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            	          
            	    }

            	    }

            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName4428); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_ID_2);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop24;
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


    // $ANTLR start "entryRuleGImportStatement"
    // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:1969:1: entryRuleGImportStatement returns [EObject current=null] : iv_ruleGImportStatement= ruleGImportStatement EOF ;
    public final EObject entryRuleGImportStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGImportStatement = null;


        try {
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:1970:2: (iv_ruleGImportStatement= ruleGImportStatement EOF )
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:1971:2: iv_ruleGImportStatement= ruleGImportStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGImportStatementRule()); 
            }
            pushFollow(FOLLOW_ruleGImportStatement_in_entryRuleGImportStatement4477);
            iv_ruleGImportStatement=ruleGImportStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGImportStatement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleGImportStatement4487); if (state.failed) return current;

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
    // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:1978:1: ruleGImportStatement returns [EObject current=null] : (otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleGImportStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_importURI_1_0=null;

         enterRule(); 
            
        try {
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:1981:28: ( (otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) ) ) )
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:1982:1: (otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) ) )
            {
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:1982:1: (otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) ) )
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:1982:3: otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,13,FOLLOW_13_in_ruleGImportStatement4524); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getGImportStatementAccess().getImportKeyword_0());
                  
            }
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:1986:1: ( (lv_importURI_1_0= RULE_STRING ) )
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:1987:1: (lv_importURI_1_0= RULE_STRING )
            {
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:1987:1: (lv_importURI_1_0= RULE_STRING )
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:1988:3: lv_importURI_1_0= RULE_STRING
            {
            lv_importURI_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleGImportStatement4541); if (state.failed) return current;
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
    // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:2012:1: entryRuleGExpression returns [EObject current=null] : iv_ruleGExpression= ruleGExpression EOF ;
    public final EObject entryRuleGExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGExpression = null;


        try {
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:2013:2: (iv_ruleGExpression= ruleGExpression EOF )
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:2014:2: iv_ruleGExpression= ruleGExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleGExpression_in_entryRuleGExpression4582);
            iv_ruleGExpression=ruleGExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleGExpression4592); if (state.failed) return current;

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
    // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:2021:1: ruleGExpression returns [EObject current=null] : this_GOrExpression_0= ruleGOrExpression ;
    public final EObject ruleGExpression() throws RecognitionException {
        EObject current = null;

        EObject this_GOrExpression_0 = null;


         enterRule(); 
            
        try {
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:2024:28: (this_GOrExpression_0= ruleGOrExpression )
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:2026:5: this_GOrExpression_0= ruleGOrExpression
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getGExpressionAccess().getGOrExpressionParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_ruleGOrExpression_in_ruleGExpression4638);
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
    // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:2042:1: entryRuleGOrExpression returns [EObject current=null] : iv_ruleGOrExpression= ruleGOrExpression EOF ;
    public final EObject entryRuleGOrExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGOrExpression = null;


        try {
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:2043:2: (iv_ruleGOrExpression= ruleGOrExpression EOF )
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:2044:2: iv_ruleGOrExpression= ruleGOrExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGOrExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleGOrExpression_in_entryRuleGOrExpression4672);
            iv_ruleGOrExpression=ruleGOrExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGOrExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleGOrExpression4682); if (state.failed) return current;

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
    // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:2051:1: ruleGOrExpression returns [EObject current=null] : (this_GXorExpression_0= ruleGXorExpression ( () ( (lv_operator_2_0= ruleGOrOperator ) ) ( (lv_rightOperand_3_0= ruleGXorExpression ) ) )* ) ;
    public final EObject ruleGOrExpression() throws RecognitionException {
        EObject current = null;

        EObject this_GXorExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:2054:28: ( (this_GXorExpression_0= ruleGXorExpression ( () ( (lv_operator_2_0= ruleGOrOperator ) ) ( (lv_rightOperand_3_0= ruleGXorExpression ) ) )* ) )
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:2055:1: (this_GXorExpression_0= ruleGXorExpression ( () ( (lv_operator_2_0= ruleGOrOperator ) ) ( (lv_rightOperand_3_0= ruleGXorExpression ) ) )* )
            {
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:2055:1: (this_GXorExpression_0= ruleGXorExpression ( () ( (lv_operator_2_0= ruleGOrOperator ) ) ( (lv_rightOperand_3_0= ruleGXorExpression ) ) )* )
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:2056:5: this_GXorExpression_0= ruleGXorExpression ( () ( (lv_operator_2_0= ruleGOrOperator ) ) ( (lv_rightOperand_3_0= ruleGXorExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getGOrExpressionAccess().getGXorExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleGXorExpression_in_ruleGOrExpression4729);
            this_GXorExpression_0=ruleGXorExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_GXorExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:2064:1: ( () ( (lv_operator_2_0= ruleGOrOperator ) ) ( (lv_rightOperand_3_0= ruleGXorExpression ) ) )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==54) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:2064:2: () ( (lv_operator_2_0= ruleGOrOperator ) ) ( (lv_rightOperand_3_0= ruleGXorExpression ) )
            	    {
            	    // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:2064:2: ()
            	    // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:2065:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getGOrExpressionAccess().getGOrExpressionLeftOperandAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:2070:2: ( (lv_operator_2_0= ruleGOrOperator ) )
            	    // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:2071:1: (lv_operator_2_0= ruleGOrOperator )
            	    {
            	    // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:2071:1: (lv_operator_2_0= ruleGOrOperator )
            	    // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:2072:3: lv_operator_2_0= ruleGOrOperator
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getGOrExpressionAccess().getOperatorGOrOperatorEnumRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleGOrOperator_in_ruleGOrExpression4759);
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

            	    // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:2088:2: ( (lv_rightOperand_3_0= ruleGXorExpression ) )
            	    // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:2089:1: (lv_rightOperand_3_0= ruleGXorExpression )
            	    {
            	    // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:2089:1: (lv_rightOperand_3_0= ruleGXorExpression )
            	    // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:2090:3: lv_rightOperand_3_0= ruleGXorExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getGOrExpressionAccess().getRightOperandGXorExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleGXorExpression_in_ruleGOrExpression4780);
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
            	    break loop25;
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
    // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:2114:1: entryRuleGXorExpression returns [EObject current=null] : iv_ruleGXorExpression= ruleGXorExpression EOF ;
    public final EObject entryRuleGXorExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGXorExpression = null;


        try {
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:2115:2: (iv_ruleGXorExpression= ruleGXorExpression EOF )
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:2116:2: iv_ruleGXorExpression= ruleGXorExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGXorExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleGXorExpression_in_entryRuleGXorExpression4818);
            iv_ruleGXorExpression=ruleGXorExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGXorExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleGXorExpression4828); if (state.failed) return current;

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
    // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:2123:1: ruleGXorExpression returns [EObject current=null] : (this_GAndExpression_0= ruleGAndExpression ( () ( (lv_operator_2_0= ruleGXorOperator ) ) ( (lv_rightOperand_3_0= ruleGAndExpression ) ) )* ) ;
    public final EObject ruleGXorExpression() throws RecognitionException {
        EObject current = null;

        EObject this_GAndExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:2126:28: ( (this_GAndExpression_0= ruleGAndExpression ( () ( (lv_operator_2_0= ruleGXorOperator ) ) ( (lv_rightOperand_3_0= ruleGAndExpression ) ) )* ) )
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:2127:1: (this_GAndExpression_0= ruleGAndExpression ( () ( (lv_operator_2_0= ruleGXorOperator ) ) ( (lv_rightOperand_3_0= ruleGAndExpression ) ) )* )
            {
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:2127:1: (this_GAndExpression_0= ruleGAndExpression ( () ( (lv_operator_2_0= ruleGXorOperator ) ) ( (lv_rightOperand_3_0= ruleGAndExpression ) ) )* )
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:2128:5: this_GAndExpression_0= ruleGAndExpression ( () ( (lv_operator_2_0= ruleGXorOperator ) ) ( (lv_rightOperand_3_0= ruleGAndExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getGXorExpressionAccess().getGAndExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleGAndExpression_in_ruleGXorExpression4875);
            this_GAndExpression_0=ruleGAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_GAndExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:2136:1: ( () ( (lv_operator_2_0= ruleGXorOperator ) ) ( (lv_rightOperand_3_0= ruleGAndExpression ) ) )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==53) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:2136:2: () ( (lv_operator_2_0= ruleGXorOperator ) ) ( (lv_rightOperand_3_0= ruleGAndExpression ) )
            	    {
            	    // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:2136:2: ()
            	    // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:2137:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getGXorExpressionAccess().getGXorExpressionLeftOperandAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:2142:2: ( (lv_operator_2_0= ruleGXorOperator ) )
            	    // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:2143:1: (lv_operator_2_0= ruleGXorOperator )
            	    {
            	    // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:2143:1: (lv_operator_2_0= ruleGXorOperator )
            	    // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:2144:3: lv_operator_2_0= ruleGXorOperator
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getGXorExpressionAccess().getOperatorGXorOperatorEnumRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleGXorOperator_in_ruleGXorExpression4905);
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

            	    // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:2160:2: ( (lv_rightOperand_3_0= ruleGAndExpression ) )
            	    // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:2161:1: (lv_rightOperand_3_0= ruleGAndExpression )
            	    {
            	    // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:2161:1: (lv_rightOperand_3_0= ruleGAndExpression )
            	    // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:2162:3: lv_rightOperand_3_0= ruleGAndExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getGXorExpressionAccess().getRightOperandGAndExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleGAndExpression_in_ruleGXorExpression4926);
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
            	    break loop26;
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
    // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:2186:1: entryRuleGAndExpression returns [EObject current=null] : iv_ruleGAndExpression= ruleGAndExpression EOF ;
    public final EObject entryRuleGAndExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGAndExpression = null;


        try {
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:2187:2: (iv_ruleGAndExpression= ruleGAndExpression EOF )
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:2188:2: iv_ruleGAndExpression= ruleGAndExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGAndExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleGAndExpression_in_entryRuleGAndExpression4964);
            iv_ruleGAndExpression=ruleGAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGAndExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleGAndExpression4974); if (state.failed) return current;

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
    // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:2195:1: ruleGAndExpression returns [EObject current=null] : (this_GEqualityExpression_0= ruleGEqualityExpression ( () ( (lv_operator_2_0= ruleGAndOperator ) ) ( (lv_rightOperand_3_0= ruleGEqualityExpression ) ) )* ) ;
    public final EObject ruleGAndExpression() throws RecognitionException {
        EObject current = null;

        EObject this_GEqualityExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:2198:28: ( (this_GEqualityExpression_0= ruleGEqualityExpression ( () ( (lv_operator_2_0= ruleGAndOperator ) ) ( (lv_rightOperand_3_0= ruleGEqualityExpression ) ) )* ) )
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:2199:1: (this_GEqualityExpression_0= ruleGEqualityExpression ( () ( (lv_operator_2_0= ruleGAndOperator ) ) ( (lv_rightOperand_3_0= ruleGEqualityExpression ) ) )* )
            {
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:2199:1: (this_GEqualityExpression_0= ruleGEqualityExpression ( () ( (lv_operator_2_0= ruleGAndOperator ) ) ( (lv_rightOperand_3_0= ruleGEqualityExpression ) ) )* )
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:2200:5: this_GEqualityExpression_0= ruleGEqualityExpression ( () ( (lv_operator_2_0= ruleGAndOperator ) ) ( (lv_rightOperand_3_0= ruleGEqualityExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getGAndExpressionAccess().getGEqualityExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleGEqualityExpression_in_ruleGAndExpression5021);
            this_GEqualityExpression_0=ruleGEqualityExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_GEqualityExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:2208:1: ( () ( (lv_operator_2_0= ruleGAndOperator ) ) ( (lv_rightOperand_3_0= ruleGEqualityExpression ) ) )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==52) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:2208:2: () ( (lv_operator_2_0= ruleGAndOperator ) ) ( (lv_rightOperand_3_0= ruleGEqualityExpression ) )
            	    {
            	    // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:2208:2: ()
            	    // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:2209:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getGAndExpressionAccess().getGAndExpressionLeftOperandAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:2214:2: ( (lv_operator_2_0= ruleGAndOperator ) )
            	    // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:2215:1: (lv_operator_2_0= ruleGAndOperator )
            	    {
            	    // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:2215:1: (lv_operator_2_0= ruleGAndOperator )
            	    // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:2216:3: lv_operator_2_0= ruleGAndOperator
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getGAndExpressionAccess().getOperatorGAndOperatorEnumRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleGAndOperator_in_ruleGAndExpression5051);
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

            	    // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:2232:2: ( (lv_rightOperand_3_0= ruleGEqualityExpression ) )
            	    // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:2233:1: (lv_rightOperand_3_0= ruleGEqualityExpression )
            	    {
            	    // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:2233:1: (lv_rightOperand_3_0= ruleGEqualityExpression )
            	    // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:2234:3: lv_rightOperand_3_0= ruleGEqualityExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getGAndExpressionAccess().getRightOperandGEqualityExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleGEqualityExpression_in_ruleGAndExpression5072);
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
    // $ANTLR end "ruleGAndExpression"


    // $ANTLR start "entryRuleGEqualityExpression"
    // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:2258:1: entryRuleGEqualityExpression returns [EObject current=null] : iv_ruleGEqualityExpression= ruleGEqualityExpression EOF ;
    public final EObject entryRuleGEqualityExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGEqualityExpression = null;


        try {
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:2259:2: (iv_ruleGEqualityExpression= ruleGEqualityExpression EOF )
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:2260:2: iv_ruleGEqualityExpression= ruleGEqualityExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGEqualityExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleGEqualityExpression_in_entryRuleGEqualityExpression5110);
            iv_ruleGEqualityExpression=ruleGEqualityExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGEqualityExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleGEqualityExpression5120); if (state.failed) return current;

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
    // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:2267:1: ruleGEqualityExpression returns [EObject current=null] : (this_GRelationExpression_0= ruleGRelationExpression ( () ( (lv_operator_2_0= ruleGEqualityOperator ) ) ( (lv_rightOperand_3_0= ruleGRelationExpression ) ) )* ) ;
    public final EObject ruleGEqualityExpression() throws RecognitionException {
        EObject current = null;

        EObject this_GRelationExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:2270:28: ( (this_GRelationExpression_0= ruleGRelationExpression ( () ( (lv_operator_2_0= ruleGEqualityOperator ) ) ( (lv_rightOperand_3_0= ruleGRelationExpression ) ) )* ) )
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:2271:1: (this_GRelationExpression_0= ruleGRelationExpression ( () ( (lv_operator_2_0= ruleGEqualityOperator ) ) ( (lv_rightOperand_3_0= ruleGRelationExpression ) ) )* )
            {
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:2271:1: (this_GRelationExpression_0= ruleGRelationExpression ( () ( (lv_operator_2_0= ruleGEqualityOperator ) ) ( (lv_rightOperand_3_0= ruleGRelationExpression ) ) )* )
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:2272:5: this_GRelationExpression_0= ruleGRelationExpression ( () ( (lv_operator_2_0= ruleGEqualityOperator ) ) ( (lv_rightOperand_3_0= ruleGRelationExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getGEqualityExpressionAccess().getGRelationExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleGRelationExpression_in_ruleGEqualityExpression5167);
            this_GRelationExpression_0=ruleGRelationExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_GRelationExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:2280:1: ( () ( (lv_operator_2_0= ruleGEqualityOperator ) ) ( (lv_rightOperand_3_0= ruleGRelationExpression ) ) )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( ((LA28_0>=55 && LA28_0<=56)) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:2280:2: () ( (lv_operator_2_0= ruleGEqualityOperator ) ) ( (lv_rightOperand_3_0= ruleGRelationExpression ) )
            	    {
            	    // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:2280:2: ()
            	    // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:2281:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getGEqualityExpressionAccess().getGEqualityExpressionLeftOperandAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:2286:2: ( (lv_operator_2_0= ruleGEqualityOperator ) )
            	    // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:2287:1: (lv_operator_2_0= ruleGEqualityOperator )
            	    {
            	    // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:2287:1: (lv_operator_2_0= ruleGEqualityOperator )
            	    // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:2288:3: lv_operator_2_0= ruleGEqualityOperator
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getGEqualityExpressionAccess().getOperatorGEqualityOperatorEnumRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleGEqualityOperator_in_ruleGEqualityExpression5197);
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

            	    // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:2304:2: ( (lv_rightOperand_3_0= ruleGRelationExpression ) )
            	    // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:2305:1: (lv_rightOperand_3_0= ruleGRelationExpression )
            	    {
            	    // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:2305:1: (lv_rightOperand_3_0= ruleGRelationExpression )
            	    // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:2306:3: lv_rightOperand_3_0= ruleGRelationExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getGEqualityExpressionAccess().getRightOperandGRelationExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleGRelationExpression_in_ruleGEqualityExpression5218);
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
            	    break loop28;
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
    // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:2330:1: entryRuleGRelationExpression returns [EObject current=null] : iv_ruleGRelationExpression= ruleGRelationExpression EOF ;
    public final EObject entryRuleGRelationExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGRelationExpression = null;


        try {
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:2331:2: (iv_ruleGRelationExpression= ruleGRelationExpression EOF )
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:2332:2: iv_ruleGRelationExpression= ruleGRelationExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGRelationExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleGRelationExpression_in_entryRuleGRelationExpression5256);
            iv_ruleGRelationExpression=ruleGRelationExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGRelationExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleGRelationExpression5266); if (state.failed) return current;

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
    // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:2339:1: ruleGRelationExpression returns [EObject current=null] : (this_GAdditionExpression_0= ruleGAdditionExpression ( () ( (lv_operator_2_0= ruleGRelationOperator ) ) ( (lv_rightOperand_3_0= ruleGAdditionExpression ) ) )* ) ;
    public final EObject ruleGRelationExpression() throws RecognitionException {
        EObject current = null;

        EObject this_GAdditionExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:2342:28: ( (this_GAdditionExpression_0= ruleGAdditionExpression ( () ( (lv_operator_2_0= ruleGRelationOperator ) ) ( (lv_rightOperand_3_0= ruleGAdditionExpression ) ) )* ) )
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:2343:1: (this_GAdditionExpression_0= ruleGAdditionExpression ( () ( (lv_operator_2_0= ruleGRelationOperator ) ) ( (lv_rightOperand_3_0= ruleGAdditionExpression ) ) )* )
            {
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:2343:1: (this_GAdditionExpression_0= ruleGAdditionExpression ( () ( (lv_operator_2_0= ruleGRelationOperator ) ) ( (lv_rightOperand_3_0= ruleGAdditionExpression ) ) )* )
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:2344:5: this_GAdditionExpression_0= ruleGAdditionExpression ( () ( (lv_operator_2_0= ruleGRelationOperator ) ) ( (lv_rightOperand_3_0= ruleGAdditionExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getGRelationExpressionAccess().getGAdditionExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleGAdditionExpression_in_ruleGRelationExpression5313);
            this_GAdditionExpression_0=ruleGAdditionExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_GAdditionExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:2352:1: ( () ( (lv_operator_2_0= ruleGRelationOperator ) ) ( (lv_rightOperand_3_0= ruleGAdditionExpression ) ) )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( ((LA29_0>=57 && LA29_0<=60)) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:2352:2: () ( (lv_operator_2_0= ruleGRelationOperator ) ) ( (lv_rightOperand_3_0= ruleGAdditionExpression ) )
            	    {
            	    // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:2352:2: ()
            	    // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:2353:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getGRelationExpressionAccess().getGRelationExpressionLeftOperandAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:2358:2: ( (lv_operator_2_0= ruleGRelationOperator ) )
            	    // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:2359:1: (lv_operator_2_0= ruleGRelationOperator )
            	    {
            	    // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:2359:1: (lv_operator_2_0= ruleGRelationOperator )
            	    // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:2360:3: lv_operator_2_0= ruleGRelationOperator
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getGRelationExpressionAccess().getOperatorGRelationOperatorEnumRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleGRelationOperator_in_ruleGRelationExpression5343);
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

            	    // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:2376:2: ( (lv_rightOperand_3_0= ruleGAdditionExpression ) )
            	    // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:2377:1: (lv_rightOperand_3_0= ruleGAdditionExpression )
            	    {
            	    // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:2377:1: (lv_rightOperand_3_0= ruleGAdditionExpression )
            	    // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:2378:3: lv_rightOperand_3_0= ruleGAdditionExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getGRelationExpressionAccess().getRightOperandGAdditionExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleGAdditionExpression_in_ruleGRelationExpression5364);
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
            	    break loop29;
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
    // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:2402:1: entryRuleGAdditionExpression returns [EObject current=null] : iv_ruleGAdditionExpression= ruleGAdditionExpression EOF ;
    public final EObject entryRuleGAdditionExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGAdditionExpression = null;


        try {
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:2403:2: (iv_ruleGAdditionExpression= ruleGAdditionExpression EOF )
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:2404:2: iv_ruleGAdditionExpression= ruleGAdditionExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGAdditionExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleGAdditionExpression_in_entryRuleGAdditionExpression5402);
            iv_ruleGAdditionExpression=ruleGAdditionExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGAdditionExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleGAdditionExpression5412); if (state.failed) return current;

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
    // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:2411:1: ruleGAdditionExpression returns [EObject current=null] : (this_GMultiplicationExpression_0= ruleGMultiplicationExpression ( () ( (lv_operator_2_0= ruleGAdditionOperator ) ) ( (lv_rightOperand_3_0= ruleGMultiplicationExpression ) ) )* ) ;
    public final EObject ruleGAdditionExpression() throws RecognitionException {
        EObject current = null;

        EObject this_GMultiplicationExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:2414:28: ( (this_GMultiplicationExpression_0= ruleGMultiplicationExpression ( () ( (lv_operator_2_0= ruleGAdditionOperator ) ) ( (lv_rightOperand_3_0= ruleGMultiplicationExpression ) ) )* ) )
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:2415:1: (this_GMultiplicationExpression_0= ruleGMultiplicationExpression ( () ( (lv_operator_2_0= ruleGAdditionOperator ) ) ( (lv_rightOperand_3_0= ruleGMultiplicationExpression ) ) )* )
            {
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:2415:1: (this_GMultiplicationExpression_0= ruleGMultiplicationExpression ( () ( (lv_operator_2_0= ruleGAdditionOperator ) ) ( (lv_rightOperand_3_0= ruleGMultiplicationExpression ) ) )* )
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:2416:5: this_GMultiplicationExpression_0= ruleGMultiplicationExpression ( () ( (lv_operator_2_0= ruleGAdditionOperator ) ) ( (lv_rightOperand_3_0= ruleGMultiplicationExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getGAdditionExpressionAccess().getGMultiplicationExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleGMultiplicationExpression_in_ruleGAdditionExpression5459);
            this_GMultiplicationExpression_0=ruleGMultiplicationExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_GMultiplicationExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:2424:1: ( () ( (lv_operator_2_0= ruleGAdditionOperator ) ) ( (lv_rightOperand_3_0= ruleGMultiplicationExpression ) ) )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==29||LA30_0==61) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:2424:2: () ( (lv_operator_2_0= ruleGAdditionOperator ) ) ( (lv_rightOperand_3_0= ruleGMultiplicationExpression ) )
            	    {
            	    // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:2424:2: ()
            	    // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:2425:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getGAdditionExpressionAccess().getGAdditionExpressionLeftOperandAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:2430:2: ( (lv_operator_2_0= ruleGAdditionOperator ) )
            	    // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:2431:1: (lv_operator_2_0= ruleGAdditionOperator )
            	    {
            	    // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:2431:1: (lv_operator_2_0= ruleGAdditionOperator )
            	    // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:2432:3: lv_operator_2_0= ruleGAdditionOperator
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getGAdditionExpressionAccess().getOperatorGAdditionOperatorEnumRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleGAdditionOperator_in_ruleGAdditionExpression5489);
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

            	    // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:2448:2: ( (lv_rightOperand_3_0= ruleGMultiplicationExpression ) )
            	    // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:2449:1: (lv_rightOperand_3_0= ruleGMultiplicationExpression )
            	    {
            	    // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:2449:1: (lv_rightOperand_3_0= ruleGMultiplicationExpression )
            	    // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:2450:3: lv_rightOperand_3_0= ruleGMultiplicationExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getGAdditionExpressionAccess().getRightOperandGMultiplicationExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleGMultiplicationExpression_in_ruleGAdditionExpression5510);
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
            	    break loop30;
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
    // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:2474:1: entryRuleGMultiplicationExpression returns [EObject current=null] : iv_ruleGMultiplicationExpression= ruleGMultiplicationExpression EOF ;
    public final EObject entryRuleGMultiplicationExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGMultiplicationExpression = null;


        try {
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:2475:2: (iv_ruleGMultiplicationExpression= ruleGMultiplicationExpression EOF )
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:2476:2: iv_ruleGMultiplicationExpression= ruleGMultiplicationExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGMultiplicationExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleGMultiplicationExpression_in_entryRuleGMultiplicationExpression5548);
            iv_ruleGMultiplicationExpression=ruleGMultiplicationExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGMultiplicationExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleGMultiplicationExpression5558); if (state.failed) return current;

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
    // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:2483:1: ruleGMultiplicationExpression returns [EObject current=null] : (this_GNegationExpression_0= ruleGNegationExpression ( () ( (lv_operator_2_0= ruleGMultiplicationOperator ) ) ( (lv_rightOperand_3_0= ruleGNegationExpression ) ) )* ) ;
    public final EObject ruleGMultiplicationExpression() throws RecognitionException {
        EObject current = null;

        EObject this_GNegationExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:2486:28: ( (this_GNegationExpression_0= ruleGNegationExpression ( () ( (lv_operator_2_0= ruleGMultiplicationOperator ) ) ( (lv_rightOperand_3_0= ruleGNegationExpression ) ) )* ) )
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:2487:1: (this_GNegationExpression_0= ruleGNegationExpression ( () ( (lv_operator_2_0= ruleGMultiplicationOperator ) ) ( (lv_rightOperand_3_0= ruleGNegationExpression ) ) )* )
            {
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:2487:1: (this_GNegationExpression_0= ruleGNegationExpression ( () ( (lv_operator_2_0= ruleGMultiplicationOperator ) ) ( (lv_rightOperand_3_0= ruleGNegationExpression ) ) )* )
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:2488:5: this_GNegationExpression_0= ruleGNegationExpression ( () ( (lv_operator_2_0= ruleGMultiplicationOperator ) ) ( (lv_rightOperand_3_0= ruleGNegationExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getGMultiplicationExpressionAccess().getGNegationExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleGNegationExpression_in_ruleGMultiplicationExpression5605);
            this_GNegationExpression_0=ruleGNegationExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_GNegationExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:2496:1: ( () ( (lv_operator_2_0= ruleGMultiplicationOperator ) ) ( (lv_rightOperand_3_0= ruleGNegationExpression ) ) )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( ((LA31_0>=62 && LA31_0<=63)) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:2496:2: () ( (lv_operator_2_0= ruleGMultiplicationOperator ) ) ( (lv_rightOperand_3_0= ruleGNegationExpression ) )
            	    {
            	    // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:2496:2: ()
            	    // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:2497:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getGMultiplicationExpressionAccess().getGMultiplicationExpressionLeftOperandAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:2502:2: ( (lv_operator_2_0= ruleGMultiplicationOperator ) )
            	    // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:2503:1: (lv_operator_2_0= ruleGMultiplicationOperator )
            	    {
            	    // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:2503:1: (lv_operator_2_0= ruleGMultiplicationOperator )
            	    // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:2504:3: lv_operator_2_0= ruleGMultiplicationOperator
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getGMultiplicationExpressionAccess().getOperatorGMultiplicationOperatorEnumRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleGMultiplicationOperator_in_ruleGMultiplicationExpression5635);
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

            	    // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:2520:2: ( (lv_rightOperand_3_0= ruleGNegationExpression ) )
            	    // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:2521:1: (lv_rightOperand_3_0= ruleGNegationExpression )
            	    {
            	    // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:2521:1: (lv_rightOperand_3_0= ruleGNegationExpression )
            	    // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:2522:3: lv_rightOperand_3_0= ruleGNegationExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getGMultiplicationExpressionAccess().getRightOperandGNegationExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleGNegationExpression_in_ruleGMultiplicationExpression5656);
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
            	    break loop31;
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
    // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:2546:1: entryRuleGNegationExpression returns [EObject current=null] : iv_ruleGNegationExpression= ruleGNegationExpression EOF ;
    public final EObject entryRuleGNegationExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGNegationExpression = null;


        try {
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:2547:2: (iv_ruleGNegationExpression= ruleGNegationExpression EOF )
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:2548:2: iv_ruleGNegationExpression= ruleGNegationExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGNegationExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleGNegationExpression_in_entryRuleGNegationExpression5694);
            iv_ruleGNegationExpression=ruleGNegationExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGNegationExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleGNegationExpression5704); if (state.failed) return current;

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
    // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:2555:1: ruleGNegationExpression returns [EObject current=null] : (this_GNavigationExpression_0= ruleGNavigationExpression | ( () ( (lv_operator_2_0= ruleGNegationOperator ) ) ( (lv_operand_3_0= ruleGNavigationExpression ) ) ) ) ;
    public final EObject ruleGNegationExpression() throws RecognitionException {
        EObject current = null;

        EObject this_GNavigationExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_operand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:2558:28: ( (this_GNavigationExpression_0= ruleGNavigationExpression | ( () ( (lv_operator_2_0= ruleGNegationOperator ) ) ( (lv_operand_3_0= ruleGNavigationExpression ) ) ) ) )
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:2559:1: (this_GNavigationExpression_0= ruleGNavigationExpression | ( () ( (lv_operator_2_0= ruleGNegationOperator ) ) ( (lv_operand_3_0= ruleGNavigationExpression ) ) ) )
            {
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:2559:1: (this_GNavigationExpression_0= ruleGNavigationExpression | ( () ( (lv_operator_2_0= ruleGNegationOperator ) ) ( (lv_operand_3_0= ruleGNavigationExpression ) ) ) )
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( ((LA32_0>=RULE_STRING && LA32_0<=RULE_DOUBLE)||LA32_0==32||(LA32_0>=40 && LA32_0<=41)) ) {
                alt32=1;
            }
            else if ( ((LA32_0>=64 && LA32_0<=65)) ) {
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
                    // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:2560:5: this_GNavigationExpression_0= ruleGNavigationExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getGNegationExpressionAccess().getGNavigationExpressionParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleGNavigationExpression_in_ruleGNegationExpression5751);
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
                    // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:2569:6: ( () ( (lv_operator_2_0= ruleGNegationOperator ) ) ( (lv_operand_3_0= ruleGNavigationExpression ) ) )
                    {
                    // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:2569:6: ( () ( (lv_operator_2_0= ruleGNegationOperator ) ) ( (lv_operand_3_0= ruleGNavigationExpression ) ) )
                    // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:2569:7: () ( (lv_operator_2_0= ruleGNegationOperator ) ) ( (lv_operand_3_0= ruleGNavigationExpression ) )
                    {
                    // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:2569:7: ()
                    // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:2570:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getGNegationExpressionAccess().getGNegationExpressionAction_1_0(),
                                  current);
                          
                    }

                    }

                    // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:2575:2: ( (lv_operator_2_0= ruleGNegationOperator ) )
                    // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:2576:1: (lv_operator_2_0= ruleGNegationOperator )
                    {
                    // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:2576:1: (lv_operator_2_0= ruleGNegationOperator )
                    // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:2577:3: lv_operator_2_0= ruleGNegationOperator
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getGNegationExpressionAccess().getOperatorGNegationOperatorEnumRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleGNegationOperator_in_ruleGNegationExpression5787);
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

                    // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:2593:2: ( (lv_operand_3_0= ruleGNavigationExpression ) )
                    // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:2594:1: (lv_operand_3_0= ruleGNavigationExpression )
                    {
                    // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:2594:1: (lv_operand_3_0= ruleGNavigationExpression )
                    // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:2595:3: lv_operand_3_0= ruleGNavigationExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getGNegationExpressionAccess().getOperandGNavigationExpressionParserRuleCall_1_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleGNavigationExpression_in_ruleGNegationExpression5808);
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
    // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:2619:1: entryRuleGNavigationExpression returns [EObject current=null] : iv_ruleGNavigationExpression= ruleGNavigationExpression EOF ;
    public final EObject entryRuleGNavigationExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGNavigationExpression = null;


        try {
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:2620:2: (iv_ruleGNavigationExpression= ruleGNavigationExpression EOF )
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:2621:2: iv_ruleGNavigationExpression= ruleGNavigationExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGNavigationExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleGNavigationExpression_in_entryRuleGNavigationExpression5845);
            iv_ruleGNavigationExpression=ruleGNavigationExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGNavigationExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleGNavigationExpression5855); if (state.failed) return current;

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
    // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:2628:1: ruleGNavigationExpression returns [EObject current=null] : (this_GReferenceExpression_0= ruleGReferenceExpression ( () ruleNavigationOperator ( (otherlv_3= RULE_ID ) ) )* ) ;
    public final EObject ruleGNavigationExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_3=null;
        EObject this_GReferenceExpression_0 = null;


         enterRule(); 
            
        try {
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:2631:28: ( (this_GReferenceExpression_0= ruleGReferenceExpression ( () ruleNavigationOperator ( (otherlv_3= RULE_ID ) ) )* ) )
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:2632:1: (this_GReferenceExpression_0= ruleGReferenceExpression ( () ruleNavigationOperator ( (otherlv_3= RULE_ID ) ) )* )
            {
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:2632:1: (this_GReferenceExpression_0= ruleGReferenceExpression ( () ruleNavigationOperator ( (otherlv_3= RULE_ID ) ) )* )
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:2633:5: this_GReferenceExpression_0= ruleGReferenceExpression ( () ruleNavigationOperator ( (otherlv_3= RULE_ID ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getGNavigationExpressionAccess().getGReferenceExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleGReferenceExpression_in_ruleGNavigationExpression5902);
            this_GReferenceExpression_0=ruleGReferenceExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_GReferenceExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:2641:1: ( () ruleNavigationOperator ( (otherlv_3= RULE_ID ) ) )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==39||LA33_0==45) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:2641:2: () ruleNavigationOperator ( (otherlv_3= RULE_ID ) )
            	    {
            	    // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:2641:2: ()
            	    // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:2642:5: 
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
            	    pushFollow(FOLLOW_ruleNavigationOperator_in_ruleGNavigationExpression5927);
            	    ruleNavigationOperator();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	              afterParserOrEnumRuleCall();
            	          
            	    }
            	    // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:2655:1: ( (otherlv_3= RULE_ID ) )
            	    // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:2656:1: (otherlv_3= RULE_ID )
            	    {
            	    // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:2656:1: (otherlv_3= RULE_ID )
            	    // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:2657:3: otherlv_3= RULE_ID
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getGNavigationExpressionRule());
            	      	        }
            	              
            	    }
            	    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleGNavigationExpression5946); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		newLeafNode(otherlv_3, grammarAccess.getGNavigationExpressionAccess().getReferencedEObjectEObjectCrossReference_1_2_0()); 
            	      	
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop33;
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
    // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:2676:1: entryRuleGReferenceExpression returns [EObject current=null] : iv_ruleGReferenceExpression= ruleGReferenceExpression EOF ;
    public final EObject entryRuleGReferenceExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGReferenceExpression = null;


        try {
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:2677:2: (iv_ruleGReferenceExpression= ruleGReferenceExpression EOF )
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:2678:2: iv_ruleGReferenceExpression= ruleGReferenceExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGReferenceExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleGReferenceExpression_in_entryRuleGReferenceExpression5984);
            iv_ruleGReferenceExpression=ruleGReferenceExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGReferenceExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleGReferenceExpression5994); if (state.failed) return current;

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
    // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:2685:1: ruleGReferenceExpression returns [EObject current=null] : (this_GPrimaryExpression_0= ruleGPrimaryExpression | ( () ( (otherlv_2= RULE_ID ) ) ) ) ;
    public final EObject ruleGReferenceExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_GPrimaryExpression_0 = null;


         enterRule(); 
            
        try {
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:2688:28: ( (this_GPrimaryExpression_0= ruleGPrimaryExpression | ( () ( (otherlv_2= RULE_ID ) ) ) ) )
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:2689:1: (this_GPrimaryExpression_0= ruleGPrimaryExpression | ( () ( (otherlv_2= RULE_ID ) ) ) )
            {
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:2689:1: (this_GPrimaryExpression_0= ruleGPrimaryExpression | ( () ( (otherlv_2= RULE_ID ) ) ) )
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==RULE_STRING||(LA34_0>=RULE_INT && LA34_0<=RULE_DOUBLE)||LA34_0==32||(LA34_0>=40 && LA34_0<=41)) ) {
                alt34=1;
            }
            else if ( (LA34_0==RULE_ID) ) {
                alt34=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;
            }
            switch (alt34) {
                case 1 :
                    // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:2690:5: this_GPrimaryExpression_0= ruleGPrimaryExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getGReferenceExpressionAccess().getGPrimaryExpressionParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleGPrimaryExpression_in_ruleGReferenceExpression6041);
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
                    // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:2699:6: ( () ( (otherlv_2= RULE_ID ) ) )
                    {
                    // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:2699:6: ( () ( (otherlv_2= RULE_ID ) ) )
                    // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:2699:7: () ( (otherlv_2= RULE_ID ) )
                    {
                    // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:2699:7: ()
                    // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:2700:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getGReferenceExpressionAccess().getGReferenceExpressionAction_1_0(),
                                  current);
                          
                    }

                    }

                    // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:2705:2: ( (otherlv_2= RULE_ID ) )
                    // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:2706:1: (otherlv_2= RULE_ID )
                    {
                    // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:2706:1: (otherlv_2= RULE_ID )
                    // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:2707:3: otherlv_2= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getGReferenceExpressionRule());
                      	        }
                              
                    }
                    otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleGReferenceExpression6076); if (state.failed) return current;
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
    // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:2726:1: entryRuleGPrimaryExpression returns [EObject current=null] : iv_ruleGPrimaryExpression= ruleGPrimaryExpression EOF ;
    public final EObject entryRuleGPrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGPrimaryExpression = null;


        try {
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:2727:2: (iv_ruleGPrimaryExpression= ruleGPrimaryExpression EOF )
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:2728:2: iv_ruleGPrimaryExpression= ruleGPrimaryExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGPrimaryExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleGPrimaryExpression_in_entryRuleGPrimaryExpression6113);
            iv_ruleGPrimaryExpression=ruleGPrimaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGPrimaryExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleGPrimaryExpression6123); if (state.failed) return current;

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
    // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:2735:1: ruleGPrimaryExpression returns [EObject current=null] : (this_GStringExpression_0= ruleGStringExpression | this_GBooleanExpression_1= ruleGBooleanExpression | this_GNumericExpression_2= ruleGNumericExpression | this_GEnumLiteralExpression_3= ruleGEnumLiteralExpression | this_GIfExpression_4= ruleGIfExpression | this_GBraceExpression_5= ruleGBraceExpression ) ;
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
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:2738:28: ( (this_GStringExpression_0= ruleGStringExpression | this_GBooleanExpression_1= ruleGBooleanExpression | this_GNumericExpression_2= ruleGNumericExpression | this_GEnumLiteralExpression_3= ruleGEnumLiteralExpression | this_GIfExpression_4= ruleGIfExpression | this_GBraceExpression_5= ruleGBraceExpression ) )
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:2739:1: (this_GStringExpression_0= ruleGStringExpression | this_GBooleanExpression_1= ruleGBooleanExpression | this_GNumericExpression_2= ruleGNumericExpression | this_GEnumLiteralExpression_3= ruleGEnumLiteralExpression | this_GIfExpression_4= ruleGIfExpression | this_GBraceExpression_5= ruleGBraceExpression )
            {
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:2739:1: (this_GStringExpression_0= ruleGStringExpression | this_GBooleanExpression_1= ruleGBooleanExpression | this_GNumericExpression_2= ruleGNumericExpression | this_GEnumLiteralExpression_3= ruleGEnumLiteralExpression | this_GIfExpression_4= ruleGIfExpression | this_GBraceExpression_5= ruleGBraceExpression )
            int alt35=6;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt35=1;
                }
                break;
            case RULE_BOOLEAN:
                {
                alt35=2;
                }
                break;
            case RULE_INT:
            case RULE_DOUBLE:
                {
                alt35=3;
                }
                break;
            case 40:
                {
                alt35=4;
                }
                break;
            case 41:
                {
                alt35=5;
                }
                break;
            case 32:
                {
                alt35=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;
            }

            switch (alt35) {
                case 1 :
                    // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:2740:5: this_GStringExpression_0= ruleGStringExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getGPrimaryExpressionAccess().getGStringExpressionParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleGStringExpression_in_ruleGPrimaryExpression6170);
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
                    // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:2750:5: this_GBooleanExpression_1= ruleGBooleanExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getGPrimaryExpressionAccess().getGBooleanExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleGBooleanExpression_in_ruleGPrimaryExpression6197);
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
                    // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:2760:5: this_GNumericExpression_2= ruleGNumericExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getGPrimaryExpressionAccess().getGNumericExpressionParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleGNumericExpression_in_ruleGPrimaryExpression6224);
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
                    // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:2770:5: this_GEnumLiteralExpression_3= ruleGEnumLiteralExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getGPrimaryExpressionAccess().getGEnumLiteralExpressionParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleGEnumLiteralExpression_in_ruleGPrimaryExpression6251);
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
                    // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:2780:5: this_GIfExpression_4= ruleGIfExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getGPrimaryExpressionAccess().getGIfExpressionParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleGIfExpression_in_ruleGPrimaryExpression6278);
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
                    // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:2790:5: this_GBraceExpression_5= ruleGBraceExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getGPrimaryExpressionAccess().getGBraceExpressionParserRuleCall_5()); 
                          
                    }
                    pushFollow(FOLLOW_ruleGBraceExpression_in_ruleGPrimaryExpression6305);
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
    // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:2806:1: entryRuleGStringExpression returns [EObject current=null] : iv_ruleGStringExpression= ruleGStringExpression EOF ;
    public final EObject entryRuleGStringExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGStringExpression = null;


        try {
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:2807:2: (iv_ruleGStringExpression= ruleGStringExpression EOF )
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:2808:2: iv_ruleGStringExpression= ruleGStringExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGStringExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleGStringExpression_in_entryRuleGStringExpression6340);
            iv_ruleGStringExpression=ruleGStringExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGStringExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleGStringExpression6350); if (state.failed) return current;

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
    // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:2815:1: ruleGStringExpression returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleGStringExpression() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;

         enterRule(); 
            
        try {
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:2818:28: ( ( () ( (lv_value_1_0= RULE_STRING ) ) ) )
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:2819:1: ( () ( (lv_value_1_0= RULE_STRING ) ) )
            {
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:2819:1: ( () ( (lv_value_1_0= RULE_STRING ) ) )
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:2819:2: () ( (lv_value_1_0= RULE_STRING ) )
            {
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:2819:2: ()
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:2820:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getGStringExpressionAccess().getGStringExpressionAction_0(),
                          current);
                  
            }

            }

            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:2825:2: ( (lv_value_1_0= RULE_STRING ) )
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:2826:1: (lv_value_1_0= RULE_STRING )
            {
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:2826:1: (lv_value_1_0= RULE_STRING )
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:2827:3: lv_value_1_0= RULE_STRING
            {
            lv_value_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleGStringExpression6401); if (state.failed) return current;
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
    // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:2851:1: entryRuleGBooleanExpression returns [EObject current=null] : iv_ruleGBooleanExpression= ruleGBooleanExpression EOF ;
    public final EObject entryRuleGBooleanExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGBooleanExpression = null;


        try {
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:2852:2: (iv_ruleGBooleanExpression= ruleGBooleanExpression EOF )
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:2853:2: iv_ruleGBooleanExpression= ruleGBooleanExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGBooleanExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleGBooleanExpression_in_entryRuleGBooleanExpression6442);
            iv_ruleGBooleanExpression=ruleGBooleanExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGBooleanExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleGBooleanExpression6452); if (state.failed) return current;

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
    // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:2860:1: ruleGBooleanExpression returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_BOOLEAN ) ) ) ;
    public final EObject ruleGBooleanExpression() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;

         enterRule(); 
            
        try {
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:2863:28: ( ( () ( (lv_value_1_0= RULE_BOOLEAN ) ) ) )
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:2864:1: ( () ( (lv_value_1_0= RULE_BOOLEAN ) ) )
            {
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:2864:1: ( () ( (lv_value_1_0= RULE_BOOLEAN ) ) )
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:2864:2: () ( (lv_value_1_0= RULE_BOOLEAN ) )
            {
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:2864:2: ()
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:2865:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getGBooleanExpressionAccess().getGBooleanExpressionAction_0(),
                          current);
                  
            }

            }

            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:2870:2: ( (lv_value_1_0= RULE_BOOLEAN ) )
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:2871:1: (lv_value_1_0= RULE_BOOLEAN )
            {
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:2871:1: (lv_value_1_0= RULE_BOOLEAN )
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:2872:3: lv_value_1_0= RULE_BOOLEAN
            {
            lv_value_1_0=(Token)match(input,RULE_BOOLEAN,FOLLOW_RULE_BOOLEAN_in_ruleGBooleanExpression6503); if (state.failed) return current;
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
    // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:2896:1: entryRuleGNumericExpression returns [EObject current=null] : iv_ruleGNumericExpression= ruleGNumericExpression EOF ;
    public final EObject entryRuleGNumericExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGNumericExpression = null;


        try {
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:2897:2: (iv_ruleGNumericExpression= ruleGNumericExpression EOF )
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:2898:2: iv_ruleGNumericExpression= ruleGNumericExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGNumericExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleGNumericExpression_in_entryRuleGNumericExpression6544);
            iv_ruleGNumericExpression=ruleGNumericExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGNumericExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleGNumericExpression6554); if (state.failed) return current;

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
    // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:2905:1: ruleGNumericExpression returns [EObject current=null] : (this_GIntegerExpression_0= ruleGIntegerExpression | this_GDoubleExpression_1= ruleGDoubleExpression ) ;
    public final EObject ruleGNumericExpression() throws RecognitionException {
        EObject current = null;

        EObject this_GIntegerExpression_0 = null;

        EObject this_GDoubleExpression_1 = null;


         enterRule(); 
            
        try {
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:2908:28: ( (this_GIntegerExpression_0= ruleGIntegerExpression | this_GDoubleExpression_1= ruleGDoubleExpression ) )
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:2909:1: (this_GIntegerExpression_0= ruleGIntegerExpression | this_GDoubleExpression_1= ruleGDoubleExpression )
            {
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:2909:1: (this_GIntegerExpression_0= ruleGIntegerExpression | this_GDoubleExpression_1= ruleGDoubleExpression )
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==RULE_INT) ) {
                alt36=1;
            }
            else if ( (LA36_0==RULE_DOUBLE) ) {
                alt36=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 36, 0, input);

                throw nvae;
            }
            switch (alt36) {
                case 1 :
                    // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:2910:5: this_GIntegerExpression_0= ruleGIntegerExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getGNumericExpressionAccess().getGIntegerExpressionParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleGIntegerExpression_in_ruleGNumericExpression6601);
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
                    // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:2920:5: this_GDoubleExpression_1= ruleGDoubleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getGNumericExpressionAccess().getGDoubleExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleGDoubleExpression_in_ruleGNumericExpression6628);
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
    // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:2936:1: entryRuleGIntegerExpression returns [EObject current=null] : iv_ruleGIntegerExpression= ruleGIntegerExpression EOF ;
    public final EObject entryRuleGIntegerExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGIntegerExpression = null;


        try {
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:2937:2: (iv_ruleGIntegerExpression= ruleGIntegerExpression EOF )
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:2938:2: iv_ruleGIntegerExpression= ruleGIntegerExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGIntegerExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleGIntegerExpression_in_entryRuleGIntegerExpression6663);
            iv_ruleGIntegerExpression=ruleGIntegerExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGIntegerExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleGIntegerExpression6673); if (state.failed) return current;

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
    // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:2945:1: ruleGIntegerExpression returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_INT ) ) ) ;
    public final EObject ruleGIntegerExpression() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;

         enterRule(); 
            
        try {
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:2948:28: ( ( () ( (lv_value_1_0= RULE_INT ) ) ) )
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:2949:1: ( () ( (lv_value_1_0= RULE_INT ) ) )
            {
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:2949:1: ( () ( (lv_value_1_0= RULE_INT ) ) )
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:2949:2: () ( (lv_value_1_0= RULE_INT ) )
            {
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:2949:2: ()
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:2950:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getGIntegerExpressionAccess().getGIntegerExpressionAction_0(),
                          current);
                  
            }

            }

            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:2955:2: ( (lv_value_1_0= RULE_INT ) )
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:2956:1: (lv_value_1_0= RULE_INT )
            {
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:2956:1: (lv_value_1_0= RULE_INT )
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:2957:3: lv_value_1_0= RULE_INT
            {
            lv_value_1_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleGIntegerExpression6724); if (state.failed) return current;
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
    // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:2981:1: entryRuleGDoubleExpression returns [EObject current=null] : iv_ruleGDoubleExpression= ruleGDoubleExpression EOF ;
    public final EObject entryRuleGDoubleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGDoubleExpression = null;


        try {
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:2982:2: (iv_ruleGDoubleExpression= ruleGDoubleExpression EOF )
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:2983:2: iv_ruleGDoubleExpression= ruleGDoubleExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGDoubleExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleGDoubleExpression_in_entryRuleGDoubleExpression6765);
            iv_ruleGDoubleExpression=ruleGDoubleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGDoubleExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleGDoubleExpression6775); if (state.failed) return current;

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
    // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:2990:1: ruleGDoubleExpression returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_DOUBLE ) ) ) ;
    public final EObject ruleGDoubleExpression() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;

         enterRule(); 
            
        try {
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:2993:28: ( ( () ( (lv_value_1_0= RULE_DOUBLE ) ) ) )
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:2994:1: ( () ( (lv_value_1_0= RULE_DOUBLE ) ) )
            {
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:2994:1: ( () ( (lv_value_1_0= RULE_DOUBLE ) ) )
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:2994:2: () ( (lv_value_1_0= RULE_DOUBLE ) )
            {
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:2994:2: ()
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:2995:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getGDoubleExpressionAccess().getGDoubleExpressionAction_0(),
                          current);
                  
            }

            }

            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:3000:2: ( (lv_value_1_0= RULE_DOUBLE ) )
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:3001:1: (lv_value_1_0= RULE_DOUBLE )
            {
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:3001:1: (lv_value_1_0= RULE_DOUBLE )
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:3002:3: lv_value_1_0= RULE_DOUBLE
            {
            lv_value_1_0=(Token)match(input,RULE_DOUBLE,FOLLOW_RULE_DOUBLE_in_ruleGDoubleExpression6826); if (state.failed) return current;
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
    // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:3026:1: entryRuleGEnumLiteralExpression returns [EObject current=null] : iv_ruleGEnumLiteralExpression= ruleGEnumLiteralExpression EOF ;
    public final EObject entryRuleGEnumLiteralExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGEnumLiteralExpression = null;


        try {
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:3027:2: (iv_ruleGEnumLiteralExpression= ruleGEnumLiteralExpression EOF )
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:3028:2: iv_ruleGEnumLiteralExpression= ruleGEnumLiteralExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGEnumLiteralExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleGEnumLiteralExpression_in_entryRuleGEnumLiteralExpression6867);
            iv_ruleGEnumLiteralExpression=ruleGEnumLiteralExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGEnumLiteralExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleGEnumLiteralExpression6877); if (state.failed) return current;

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
    // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:3035:1: ruleGEnumLiteralExpression returns [EObject current=null] : ( () otherlv_1= '#' ( ( ruleQualifiedName ) ) ) ;
    public final EObject ruleGEnumLiteralExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:3038:28: ( ( () otherlv_1= '#' ( ( ruleQualifiedName ) ) ) )
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:3039:1: ( () otherlv_1= '#' ( ( ruleQualifiedName ) ) )
            {
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:3039:1: ( () otherlv_1= '#' ( ( ruleQualifiedName ) ) )
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:3039:2: () otherlv_1= '#' ( ( ruleQualifiedName ) )
            {
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:3039:2: ()
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:3040:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getGEnumLiteralExpressionAccess().getGEnumLiteralExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,40,FOLLOW_40_in_ruleGEnumLiteralExpression6923); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getGEnumLiteralExpressionAccess().getNumberSignKeyword_1());
                  
            }
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:3049:1: ( ( ruleQualifiedName ) )
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:3050:1: ( ruleQualifiedName )
            {
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:3050:1: ( ruleQualifiedName )
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:3051:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getGEnumLiteralExpressionRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getGEnumLiteralExpressionAccess().getValueEEnumLiteralCrossReference_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleGEnumLiteralExpression6946);
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
    // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:3072:1: entryRuleGIfExpression returns [EObject current=null] : iv_ruleGIfExpression= ruleGIfExpression EOF ;
    public final EObject entryRuleGIfExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGIfExpression = null;


        try {
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:3073:2: (iv_ruleGIfExpression= ruleGIfExpression EOF )
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:3074:2: iv_ruleGIfExpression= ruleGIfExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGIfExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleGIfExpression_in_entryRuleGIfExpression6982);
            iv_ruleGIfExpression=ruleGIfExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGIfExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleGIfExpression6992); if (state.failed) return current;

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
    // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:3081:1: ruleGIfExpression returns [EObject current=null] : ( () otherlv_1= 'if' ( (lv_condition_2_0= ruleGExpression ) ) otherlv_3= 'then' ( (lv_thenExpression_4_0= ruleGExpression ) ) otherlv_5= 'else' ( (lv_elseExpression_6_0= ruleGExpression ) ) otherlv_7= 'endif' ) ;
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
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:3084:28: ( ( () otherlv_1= 'if' ( (lv_condition_2_0= ruleGExpression ) ) otherlv_3= 'then' ( (lv_thenExpression_4_0= ruleGExpression ) ) otherlv_5= 'else' ( (lv_elseExpression_6_0= ruleGExpression ) ) otherlv_7= 'endif' ) )
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:3085:1: ( () otherlv_1= 'if' ( (lv_condition_2_0= ruleGExpression ) ) otherlv_3= 'then' ( (lv_thenExpression_4_0= ruleGExpression ) ) otherlv_5= 'else' ( (lv_elseExpression_6_0= ruleGExpression ) ) otherlv_7= 'endif' )
            {
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:3085:1: ( () otherlv_1= 'if' ( (lv_condition_2_0= ruleGExpression ) ) otherlv_3= 'then' ( (lv_thenExpression_4_0= ruleGExpression ) ) otherlv_5= 'else' ( (lv_elseExpression_6_0= ruleGExpression ) ) otherlv_7= 'endif' )
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:3085:2: () otherlv_1= 'if' ( (lv_condition_2_0= ruleGExpression ) ) otherlv_3= 'then' ( (lv_thenExpression_4_0= ruleGExpression ) ) otherlv_5= 'else' ( (lv_elseExpression_6_0= ruleGExpression ) ) otherlv_7= 'endif'
            {
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:3085:2: ()
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:3086:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getGIfExpressionAccess().getGIfExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,41,FOLLOW_41_in_ruleGIfExpression7038); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getGIfExpressionAccess().getIfKeyword_1());
                  
            }
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:3095:1: ( (lv_condition_2_0= ruleGExpression ) )
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:3096:1: (lv_condition_2_0= ruleGExpression )
            {
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:3096:1: (lv_condition_2_0= ruleGExpression )
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:3097:3: lv_condition_2_0= ruleGExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getGIfExpressionAccess().getConditionGExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleGExpression_in_ruleGIfExpression7059);
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

            otherlv_3=(Token)match(input,42,FOLLOW_42_in_ruleGIfExpression7071); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getGIfExpressionAccess().getThenKeyword_3());
                  
            }
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:3117:1: ( (lv_thenExpression_4_0= ruleGExpression ) )
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:3118:1: (lv_thenExpression_4_0= ruleGExpression )
            {
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:3118:1: (lv_thenExpression_4_0= ruleGExpression )
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:3119:3: lv_thenExpression_4_0= ruleGExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getGIfExpressionAccess().getThenExpressionGExpressionParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleGExpression_in_ruleGIfExpression7092);
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

            otherlv_5=(Token)match(input,43,FOLLOW_43_in_ruleGIfExpression7104); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getGIfExpressionAccess().getElseKeyword_5());
                  
            }
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:3139:1: ( (lv_elseExpression_6_0= ruleGExpression ) )
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:3140:1: (lv_elseExpression_6_0= ruleGExpression )
            {
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:3140:1: (lv_elseExpression_6_0= ruleGExpression )
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:3141:3: lv_elseExpression_6_0= ruleGExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getGIfExpressionAccess().getElseExpressionGExpressionParserRuleCall_6_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleGExpression_in_ruleGIfExpression7125);
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

            otherlv_7=(Token)match(input,44,FOLLOW_44_in_ruleGIfExpression7137); if (state.failed) return current;
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
    // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:3169:1: entryRuleGBraceExpression returns [EObject current=null] : iv_ruleGBraceExpression= ruleGBraceExpression EOF ;
    public final EObject entryRuleGBraceExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGBraceExpression = null;


        try {
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:3170:2: (iv_ruleGBraceExpression= ruleGBraceExpression EOF )
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:3171:2: iv_ruleGBraceExpression= ruleGBraceExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGBraceExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleGBraceExpression_in_entryRuleGBraceExpression7173);
            iv_ruleGBraceExpression=ruleGBraceExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGBraceExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleGBraceExpression7183); if (state.failed) return current;

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
    // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:3178:1: ruleGBraceExpression returns [EObject current=null] : ( () otherlv_1= '(' ( (lv_innerExpression_2_0= ruleGExpression ) ) otherlv_3= ')' ) ;
    public final EObject ruleGBraceExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_innerExpression_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:3181:28: ( ( () otherlv_1= '(' ( (lv_innerExpression_2_0= ruleGExpression ) ) otherlv_3= ')' ) )
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:3182:1: ( () otherlv_1= '(' ( (lv_innerExpression_2_0= ruleGExpression ) ) otherlv_3= ')' )
            {
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:3182:1: ( () otherlv_1= '(' ( (lv_innerExpression_2_0= ruleGExpression ) ) otherlv_3= ')' )
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:3182:2: () otherlv_1= '(' ( (lv_innerExpression_2_0= ruleGExpression ) ) otherlv_3= ')'
            {
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:3182:2: ()
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:3183:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getGBraceExpressionAccess().getGBraceExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,32,FOLLOW_32_in_ruleGBraceExpression7229); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getGBraceExpressionAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:3192:1: ( (lv_innerExpression_2_0= ruleGExpression ) )
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:3193:1: (lv_innerExpression_2_0= ruleGExpression )
            {
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:3193:1: (lv_innerExpression_2_0= ruleGExpression )
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:3194:3: lv_innerExpression_2_0= ruleGExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getGBraceExpressionAccess().getInnerExpressionGExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleGExpression_in_ruleGBraceExpression7250);
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

            otherlv_3=(Token)match(input,33,FOLLOW_33_in_ruleGBraceExpression7262); if (state.failed) return current;
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
    // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:3222:1: entryRuleNavigationOperator returns [String current=null] : iv_ruleNavigationOperator= ruleNavigationOperator EOF ;
    public final String entryRuleNavigationOperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNavigationOperator = null;


        try {
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:3223:2: (iv_ruleNavigationOperator= ruleNavigationOperator EOF )
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:3224:2: iv_ruleNavigationOperator= ruleNavigationOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNavigationOperatorRule()); 
            }
            pushFollow(FOLLOW_ruleNavigationOperator_in_entryRuleNavigationOperator7299);
            iv_ruleNavigationOperator=ruleNavigationOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNavigationOperator.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNavigationOperator7310); if (state.failed) return current;

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
    // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:3231:1: ruleNavigationOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '.' | kw= '->' ) ;
    public final AntlrDatatypeRuleToken ruleNavigationOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:3234:28: ( (kw= '.' | kw= '->' ) )
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:3235:1: (kw= '.' | kw= '->' )
            {
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:3235:1: (kw= '.' | kw= '->' )
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==39) ) {
                alt37=1;
            }
            else if ( (LA37_0==45) ) {
                alt37=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 37, 0, input);

                throw nvae;
            }
            switch (alt37) {
                case 1 :
                    // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:3236:2: kw= '.'
                    {
                    kw=(Token)match(input,39,FOLLOW_39_in_ruleNavigationOperator7348); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getNavigationOperatorAccess().getFullStopKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:3243:2: kw= '->'
                    {
                    kw=(Token)match(input,45,FOLLOW_45_in_ruleNavigationOperator7367); if (state.failed) return current;
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


    // $ANTLR start "ruleVisibility"
    // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:3256:1: ruleVisibility returns [Enumerator current=null] : ( (enumLiteral_0= 'public' ) | (enumLiteral_1= 'private' ) ) ;
    public final Enumerator ruleVisibility() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:3258:28: ( ( (enumLiteral_0= 'public' ) | (enumLiteral_1= 'private' ) ) )
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:3259:1: ( (enumLiteral_0= 'public' ) | (enumLiteral_1= 'private' ) )
            {
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:3259:1: ( (enumLiteral_0= 'public' ) | (enumLiteral_1= 'private' ) )
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==46) ) {
                alt38=1;
            }
            else if ( (LA38_0==47) ) {
                alt38=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;
            }
            switch (alt38) {
                case 1 :
                    // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:3259:2: (enumLiteral_0= 'public' )
                    {
                    // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:3259:2: (enumLiteral_0= 'public' )
                    // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:3259:4: enumLiteral_0= 'public'
                    {
                    enumLiteral_0=(Token)match(input,46,FOLLOW_46_in_ruleVisibility7421); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getVisibilityAccess().getPublicEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getVisibilityAccess().getPublicEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:3265:6: (enumLiteral_1= 'private' )
                    {
                    // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:3265:6: (enumLiteral_1= 'private' )
                    // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:3265:8: enumLiteral_1= 'private'
                    {
                    enumLiteral_1=(Token)match(input,47,FOLLOW_47_in_ruleVisibility7438); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getVisibilityAccess().getPrivateEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getVisibilityAccess().getPrivateEnumLiteralDeclaration_1()); 
                          
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
    // $ANTLR end "ruleVisibility"


    // $ANTLR start "ruleExecutionKind"
    // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:3275:1: ruleExecutionKind returns [Enumerator current=null] : ( (enumLiteral_0= 'triggers' ) | (enumLiteral_1= 'interrupts' ) ) ;
    public final Enumerator ruleExecutionKind() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:3277:28: ( ( (enumLiteral_0= 'triggers' ) | (enumLiteral_1= 'interrupts' ) ) )
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:3278:1: ( (enumLiteral_0= 'triggers' ) | (enumLiteral_1= 'interrupts' ) )
            {
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:3278:1: ( (enumLiteral_0= 'triggers' ) | (enumLiteral_1= 'interrupts' ) )
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==48) ) {
                alt39=1;
            }
            else if ( (LA39_0==49) ) {
                alt39=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 39, 0, input);

                throw nvae;
            }
            switch (alt39) {
                case 1 :
                    // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:3278:2: (enumLiteral_0= 'triggers' )
                    {
                    // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:3278:2: (enumLiteral_0= 'triggers' )
                    // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:3278:4: enumLiteral_0= 'triggers'
                    {
                    enumLiteral_0=(Token)match(input,48,FOLLOW_48_in_ruleExecutionKind7483); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getExecutionKindAccess().getSubmissionEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getExecutionKindAccess().getSubmissionEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:3284:6: (enumLiteral_1= 'interrupts' )
                    {
                    // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:3284:6: (enumLiteral_1= 'interrupts' )
                    // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:3284:8: enumLiteral_1= 'interrupts'
                    {
                    enumLiteral_1=(Token)match(input,49,FOLLOW_49_in_ruleExecutionKind7500); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getExecutionKindAccess().getInterruptionEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getExecutionKindAccess().getInterruptionEnumLiteralDeclaration_1()); 
                          
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
    // $ANTLR end "ruleExecutionKind"


    // $ANTLR start "ruleCallKind"
    // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:3294:1: ruleCallKind returns [Enumerator current=null] : ( (enumLiteral_0= 'blocking' ) | (enumLiteral_1= 'nonblocking' ) ) ;
    public final Enumerator ruleCallKind() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:3296:28: ( ( (enumLiteral_0= 'blocking' ) | (enumLiteral_1= 'nonblocking' ) ) )
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:3297:1: ( (enumLiteral_0= 'blocking' ) | (enumLiteral_1= 'nonblocking' ) )
            {
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:3297:1: ( (enumLiteral_0= 'blocking' ) | (enumLiteral_1= 'nonblocking' ) )
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==50) ) {
                alt40=1;
            }
            else if ( (LA40_0==51) ) {
                alt40=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 40, 0, input);

                throw nvae;
            }
            switch (alt40) {
                case 1 :
                    // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:3297:2: (enumLiteral_0= 'blocking' )
                    {
                    // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:3297:2: (enumLiteral_0= 'blocking' )
                    // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:3297:4: enumLiteral_0= 'blocking'
                    {
                    enumLiteral_0=(Token)match(input,50,FOLLOW_50_in_ruleCallKind7545); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCallKindAccess().getBlockingEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getCallKindAccess().getBlockingEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:3303:6: (enumLiteral_1= 'nonblocking' )
                    {
                    // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:3303:6: (enumLiteral_1= 'nonblocking' )
                    // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:3303:8: enumLiteral_1= 'nonblocking'
                    {
                    enumLiteral_1=(Token)match(input,51,FOLLOW_51_in_ruleCallKind7562); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCallKindAccess().getNonBlockingEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getCallKindAccess().getNonBlockingEnumLiteralDeclaration_1()); 
                          
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
    // $ANTLR end "ruleCallKind"


    // $ANTLR start "ruleGAndOperator"
    // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:3313:1: ruleGAndOperator returns [Enumerator current=null] : (enumLiteral_0= 'and' ) ;
    public final Enumerator ruleGAndOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;

         enterRule(); 
        try {
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:3315:28: ( (enumLiteral_0= 'and' ) )
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:3316:1: (enumLiteral_0= 'and' )
            {
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:3316:1: (enumLiteral_0= 'and' )
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:3316:3: enumLiteral_0= 'and'
            {
            enumLiteral_0=(Token)match(input,52,FOLLOW_52_in_ruleGAndOperator7606); if (state.failed) return current;
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
    // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:3326:1: ruleGXorOperator returns [Enumerator current=null] : (enumLiteral_0= 'xor' ) ;
    public final Enumerator ruleGXorOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;

         enterRule(); 
        try {
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:3328:28: ( (enumLiteral_0= 'xor' ) )
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:3329:1: (enumLiteral_0= 'xor' )
            {
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:3329:1: (enumLiteral_0= 'xor' )
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:3329:3: enumLiteral_0= 'xor'
            {
            enumLiteral_0=(Token)match(input,53,FOLLOW_53_in_ruleGXorOperator7649); if (state.failed) return current;
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
    // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:3339:1: ruleGOrOperator returns [Enumerator current=null] : (enumLiteral_0= 'or' ) ;
    public final Enumerator ruleGOrOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;

         enterRule(); 
        try {
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:3341:28: ( (enumLiteral_0= 'or' ) )
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:3342:1: (enumLiteral_0= 'or' )
            {
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:3342:1: (enumLiteral_0= 'or' )
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:3342:3: enumLiteral_0= 'or'
            {
            enumLiteral_0=(Token)match(input,54,FOLLOW_54_in_ruleGOrOperator7692); if (state.failed) return current;
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
    // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:3352:1: ruleGEqualityOperator returns [Enumerator current=null] : ( (enumLiteral_0= '=' ) | (enumLiteral_1= '<>' ) ) ;
    public final Enumerator ruleGEqualityOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:3354:28: ( ( (enumLiteral_0= '=' ) | (enumLiteral_1= '<>' ) ) )
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:3355:1: ( (enumLiteral_0= '=' ) | (enumLiteral_1= '<>' ) )
            {
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:3355:1: ( (enumLiteral_0= '=' ) | (enumLiteral_1= '<>' ) )
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==55) ) {
                alt41=1;
            }
            else if ( (LA41_0==56) ) {
                alt41=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 41, 0, input);

                throw nvae;
            }
            switch (alt41) {
                case 1 :
                    // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:3355:2: (enumLiteral_0= '=' )
                    {
                    // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:3355:2: (enumLiteral_0= '=' )
                    // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:3355:4: enumLiteral_0= '='
                    {
                    enumLiteral_0=(Token)match(input,55,FOLLOW_55_in_ruleGEqualityOperator7736); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getGEqualityOperatorAccess().getEQUALEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getGEqualityOperatorAccess().getEQUALEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:3361:6: (enumLiteral_1= '<>' )
                    {
                    // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:3361:6: (enumLiteral_1= '<>' )
                    // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:3361:8: enumLiteral_1= '<>'
                    {
                    enumLiteral_1=(Token)match(input,56,FOLLOW_56_in_ruleGEqualityOperator7753); if (state.failed) return current;
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
    // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:3371:1: ruleGRelationOperator returns [Enumerator current=null] : ( (enumLiteral_0= '<' ) | (enumLiteral_1= '>' ) | (enumLiteral_2= '<=' ) | (enumLiteral_3= '>=' ) ) ;
    public final Enumerator ruleGRelationOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;

         enterRule(); 
        try {
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:3373:28: ( ( (enumLiteral_0= '<' ) | (enumLiteral_1= '>' ) | (enumLiteral_2= '<=' ) | (enumLiteral_3= '>=' ) ) )
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:3374:1: ( (enumLiteral_0= '<' ) | (enumLiteral_1= '>' ) | (enumLiteral_2= '<=' ) | (enumLiteral_3= '>=' ) )
            {
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:3374:1: ( (enumLiteral_0= '<' ) | (enumLiteral_1= '>' ) | (enumLiteral_2= '<=' ) | (enumLiteral_3= '>=' ) )
            int alt42=4;
            switch ( input.LA(1) ) {
            case 57:
                {
                alt42=1;
                }
                break;
            case 58:
                {
                alt42=2;
                }
                break;
            case 59:
                {
                alt42=3;
                }
                break;
            case 60:
                {
                alt42=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 42, 0, input);

                throw nvae;
            }

            switch (alt42) {
                case 1 :
                    // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:3374:2: (enumLiteral_0= '<' )
                    {
                    // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:3374:2: (enumLiteral_0= '<' )
                    // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:3374:4: enumLiteral_0= '<'
                    {
                    enumLiteral_0=(Token)match(input,57,FOLLOW_57_in_ruleGRelationOperator7798); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getGRelationOperatorAccess().getLESSEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getGRelationOperatorAccess().getLESSEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:3380:6: (enumLiteral_1= '>' )
                    {
                    // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:3380:6: (enumLiteral_1= '>' )
                    // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:3380:8: enumLiteral_1= '>'
                    {
                    enumLiteral_1=(Token)match(input,58,FOLLOW_58_in_ruleGRelationOperator7815); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getGRelationOperatorAccess().getGREATEREnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getGRelationOperatorAccess().getGREATEREnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:3386:6: (enumLiteral_2= '<=' )
                    {
                    // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:3386:6: (enumLiteral_2= '<=' )
                    // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:3386:8: enumLiteral_2= '<='
                    {
                    enumLiteral_2=(Token)match(input,59,FOLLOW_59_in_ruleGRelationOperator7832); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getGRelationOperatorAccess().getLESSEQUALEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getGRelationOperatorAccess().getLESSEQUALEnumLiteralDeclaration_2()); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:3392:6: (enumLiteral_3= '>=' )
                    {
                    // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:3392:6: (enumLiteral_3= '>=' )
                    // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:3392:8: enumLiteral_3= '>='
                    {
                    enumLiteral_3=(Token)match(input,60,FOLLOW_60_in_ruleGRelationOperator7849); if (state.failed) return current;
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
    // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:3402:1: ruleGAdditionOperator returns [Enumerator current=null] : ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) ) ;
    public final Enumerator ruleGAdditionOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:3404:28: ( ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) ) )
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:3405:1: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) )
            {
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:3405:1: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) )
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==29) ) {
                alt43=1;
            }
            else if ( (LA43_0==61) ) {
                alt43=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 43, 0, input);

                throw nvae;
            }
            switch (alt43) {
                case 1 :
                    // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:3405:2: (enumLiteral_0= '+' )
                    {
                    // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:3405:2: (enumLiteral_0= '+' )
                    // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:3405:4: enumLiteral_0= '+'
                    {
                    enumLiteral_0=(Token)match(input,29,FOLLOW_29_in_ruleGAdditionOperator7894); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getGAdditionOperatorAccess().getADDITIONEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getGAdditionOperatorAccess().getADDITIONEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:3411:6: (enumLiteral_1= '-' )
                    {
                    // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:3411:6: (enumLiteral_1= '-' )
                    // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:3411:8: enumLiteral_1= '-'
                    {
                    enumLiteral_1=(Token)match(input,61,FOLLOW_61_in_ruleGAdditionOperator7911); if (state.failed) return current;
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
    // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:3421:1: ruleGMultiplicationOperator returns [Enumerator current=null] : ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) ) ;
    public final Enumerator ruleGMultiplicationOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:3423:28: ( ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) ) )
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:3424:1: ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) )
            {
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:3424:1: ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) )
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==62) ) {
                alt44=1;
            }
            else if ( (LA44_0==63) ) {
                alt44=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 44, 0, input);

                throw nvae;
            }
            switch (alt44) {
                case 1 :
                    // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:3424:2: (enumLiteral_0= '*' )
                    {
                    // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:3424:2: (enumLiteral_0= '*' )
                    // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:3424:4: enumLiteral_0= '*'
                    {
                    enumLiteral_0=(Token)match(input,62,FOLLOW_62_in_ruleGMultiplicationOperator7956); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getGMultiplicationOperatorAccess().getMULTIPLICATIONEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getGMultiplicationOperatorAccess().getMULTIPLICATIONEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:3430:6: (enumLiteral_1= '/' )
                    {
                    // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:3430:6: (enumLiteral_1= '/' )
                    // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:3430:8: enumLiteral_1= '/'
                    {
                    enumLiteral_1=(Token)match(input,63,FOLLOW_63_in_ruleGMultiplicationOperator7973); if (state.failed) return current;
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
    // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:3440:1: ruleGNegationOperator returns [Enumerator current=null] : ( (enumLiteral_0= 'not' ) | (enumLiteral_1= '~' ) ) ;
    public final Enumerator ruleGNegationOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:3442:28: ( ( (enumLiteral_0= 'not' ) | (enumLiteral_1= '~' ) ) )
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:3443:1: ( (enumLiteral_0= 'not' ) | (enumLiteral_1= '~' ) )
            {
            // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:3443:1: ( (enumLiteral_0= 'not' ) | (enumLiteral_1= '~' ) )
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==64) ) {
                alt45=1;
            }
            else if ( (LA45_0==65) ) {
                alt45=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 45, 0, input);

                throw nvae;
            }
            switch (alt45) {
                case 1 :
                    // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:3443:2: (enumLiteral_0= 'not' )
                    {
                    // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:3443:2: (enumLiteral_0= 'not' )
                    // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:3443:4: enumLiteral_0= 'not'
                    {
                    enumLiteral_0=(Token)match(input,64,FOLLOW_64_in_ruleGNegationOperator8018); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getGNegationOperatorAccess().getNEGATIONEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getGNegationOperatorAccess().getNEGATIONEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:3449:6: (enumLiteral_1= '~' )
                    {
                    // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:3449:6: (enumLiteral_1= '~' )
                    // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:3449:8: enumLiteral_1= '~'
                    {
                    enumLiteral_1=(Token)match(input,65,FOLLOW_65_in_ruleGNegationOperator8035); if (state.failed) return current;
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

    // $ANTLR start synpred2_InternalGEL
    public final void synpred2_InternalGEL_fragment() throws RecognitionException {   
        // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:1944:3: ( '.' )
        // ../org.gemoc.gel.xtext/src-gen/org/gemoc/gel/parser/antlr/internal/InternalGEL.g:1945:2: '.'
        {
        match(input,39,FOLLOW_39_in_synpred2_InternalGEL4403); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred2_InternalGEL

    // Delegated rules

    public final boolean synpred2_InternalGEL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred2_InternalGEL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


 

    public static final BitSet FOLLOW_ruleDomainSpecificEventsSpecification_in_entryRuleDomainSpecificEventsSpecification75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDomainSpecificEventsSpecification85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImportStatement_in_ruleDomainSpecificEventsSpecification140 = new BitSet(new long[]{0x0000C00000106002L});
    public static final BitSet FOLLOW_ruleDomainSpecificEvent_in_ruleDomainSpecificEventsSpecification162 = new BitSet(new long[]{0x0000C00000104002L});
    public static final BitSet FOLLOW_ruleImportStatement_in_entryRuleImportStatement199 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImportStatement209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleImportStatement246 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleImportStatement263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDomainSpecificEvent_in_entryRuleDomainSpecificEvent304 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDomainSpecificEvent314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtomicDomainSpecificEvent_in_ruleDomainSpecificEvent361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompositeDomainSpecificEvent_in_ruleDomainSpecificEvent388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtomicDomainSpecificEvent_in_entryRuleAtomicDomainSpecificEvent423 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAtomicDomainSpecificEvent433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVisibility_in_ruleAtomicDomainSpecificEvent488 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleAtomicDomainSpecificEvent501 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAtomicDomainSpecificEvent518 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleAtomicDomainSpecificEvent535 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleAtomicDomainSpecificEvent547 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleMoccEvent_in_ruleAtomicDomainSpecificEvent568 = new BitSet(new long[]{0x00030000000C0000L});
    public static final BitSet FOLLOW_ruleExecutionKind_in_ruleAtomicDomainSpecificEvent590 = new BitSet(new long[]{0x00000301000001F0L,0x0000000000000003L});
    public static final BitSet FOLLOW_ruleExecutionFunction_in_ruleAtomicDomainSpecificEvent611 = new BitSet(new long[]{0x00000000000E0000L});
    public static final BitSet FOLLOW_17_in_ruleAtomicDomainSpecificEvent624 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleAtomicDomainSpecificEvent636 = new BitSet(new long[]{0x0000001040000000L});
    public static final BitSet FOLLOW_ruleFeedbackPolicy_in_ruleAtomicDomainSpecificEvent657 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleAtomicDomainSpecificEvent669 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_19_in_ruleAtomicDomainSpecificEvent686 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleMoccEvent_in_ruleAtomicDomainSpecificEvent707 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleAtomicDomainSpecificEvent721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompositeDomainSpecificEvent_in_entryRuleCompositeDomainSpecificEvent757 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCompositeDomainSpecificEvent767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVisibility_in_ruleCompositeDomainSpecificEvent822 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleCompositeDomainSpecificEvent835 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCompositeDomainSpecificEvent852 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleCompositeDomainSpecificEvent869 = new BitSet(new long[]{0x0000000100200020L});
    public static final BitSet FOLLOW_ruleUnfoldingStrategy_in_ruleCompositeDomainSpecificEvent890 = new BitSet(new long[]{0x0000000100200020L});
    public static final BitSet FOLLOW_ruleDomainSpecificEventsPattern_in_ruleCompositeDomainSpecificEvent912 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleCompositeDomainSpecificEvent924 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnfoldingStrategy_in_entryRuleUnfoldingStrategy960 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUnfoldingStrategy970 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleUnfoldingStrategy1016 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleUnfoldingStrategy1028 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleLocalVariable_in_ruleUnfoldingStrategy1049 = new BitSet(new long[]{0x0000000000800020L});
    public static final BitSet FOLLOW_23_in_ruleUnfoldingStrategy1062 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleUnfoldingStrategy1074 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleUnfoldingStrategy1086 = new BitSet(new long[]{0x00000301000001F0L,0x0000000000000003L});
    public static final BitSet FOLLOW_ruleInstantiationPredicate_in_ruleUnfoldingStrategy1107 = new BitSet(new long[]{0x00000301008001F0L,0x0000000000000003L});
    public static final BitSet FOLLOW_23_in_ruleUnfoldingStrategy1120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLocalVariable_in_entryRuleLocalVariable1156 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLocalVariable1166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleLocalVariable1217 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleLocalVariable1234 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleLocalVariable1257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInstantiationPredicate_in_entryRuleInstantiationPredicate1293 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInstantiationPredicate1303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGExpression_in_ruleInstantiationPredicate1358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDomainSpecificEventsPattern_in_entryRuleDomainSpecificEventsPattern1394 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDomainSpecificEventsPattern1404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLogicalSequence_in_ruleDomainSpecificEventsPattern1450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLogicalSequence_in_entryRuleLogicalSequence1484 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLogicalSequence1494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCoincidencePattern_in_ruleLogicalSequence1541 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_25_in_ruleLogicalSequence1570 = new BitSet(new long[]{0x0000000100200020L});
    public static final BitSet FOLLOW_ruleCoincidencePattern_in_ruleLogicalSequence1592 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_ruleCoincidencePattern_in_entryRuleCoincidencePattern1630 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCoincidencePattern1640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrPattern_in_ruleCoincidencePattern1687 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_26_in_ruleCoincidencePattern1708 = new BitSet(new long[]{0x0000000100200020L});
    public static final BitSet FOLLOW_ruleOrPattern_in_ruleCoincidencePattern1729 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_ruleOrPattern_in_entryRuleOrPattern1767 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOrPattern1777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXorPattern_in_ruleOrPattern1824 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_27_in_ruleOrPattern1845 = new BitSet(new long[]{0x0000000100200020L});
    public static final BitSet FOLLOW_ruleXorPattern_in_ruleOrPattern1866 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_ruleXorPattern_in_entryRuleXorPattern1904 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXorPattern1914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePlusPattern_in_ruleXorPattern1961 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_28_in_ruleXorPattern1982 = new BitSet(new long[]{0x0000000100200020L});
    public static final BitSet FOLLOW_rulePlusPattern_in_ruleXorPattern2003 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_rulePlusPattern_in_entryRulePlusPattern2041 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePlusPattern2051 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIterationPattern_in_rulePlusPattern2098 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_29_in_rulePlusPattern2119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIterationPattern_in_entryRuleIterationPattern2157 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIterationPattern2167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDomainSpecificEventReferenceOrPattern_in_ruleIterationPattern2214 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_30_in_ruleIterationPattern2235 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleIterationPattern2252 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleIterationPattern2269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDomainSpecificEventReferenceOrPattern_in_entryRuleDomainSpecificEventReferenceOrPattern2307 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDomainSpecificEventReferenceOrPattern2317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDomainSpecificEventReferenceWithOrWithoutTarget_in_ruleDomainSpecificEventReferenceOrPattern2364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleDomainSpecificEventReferenceOrPattern2382 = new BitSet(new long[]{0x0000000100200020L});
    public static final BitSet FOLLOW_ruleDomainSpecificEventsPattern_in_ruleDomainSpecificEventReferenceOrPattern2404 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ruleDomainSpecificEventReferenceOrPattern2415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDomainSpecificEventReferenceWithOrWithoutTarget_in_entryRuleDomainSpecificEventReferenceWithOrWithoutTarget2452 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDomainSpecificEventReferenceWithOrWithoutTarget2462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDomainSpecificEventReference_in_ruleDomainSpecificEventReferenceWithOrWithoutTarget2509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDomainSpecificEventReferenceWithArguments_in_ruleDomainSpecificEventReferenceWithOrWithoutTarget2536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDomainSpecificEventReference_in_entryRuleDomainSpecificEventReference2571 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDomainSpecificEventReference2581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDomainSpecificEventReference2635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDomainSpecificEventReferenceWithArguments_in_entryRuleDomainSpecificEventReferenceWithArguments2671 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDomainSpecificEventReferenceWithArguments2681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDomainSpecificEventReferenceWithArguments2735 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_ruleDomainSpecificEventReferenceWithArguments2747 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleListOfArguments_in_ruleDomainSpecificEventReferenceWithArguments2768 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ruleDomainSpecificEventReferenceWithArguments2780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleListOfArguments_in_entryRuleListOfArguments2816 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleListOfArguments2826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSingleArgument_in_ruleListOfArguments2873 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultipleArguments_in_ruleListOfArguments2900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSingleArgument_in_entryRuleSingleArgument2935 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSingleArgument2945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSingleArgument2999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultipleArguments_in_entryRuleMultipleArguments3035 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMultipleArguments3045 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMultipleArguments3099 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_ruleMultipleArguments3111 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleListOfArguments_in_ruleMultipleArguments3132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFeedbackPolicy_in_entryRuleFeedbackPolicy3168 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFeedbackPolicy3178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFeedbackRule_in_ruleFeedbackPolicy3233 = new BitSet(new long[]{0x0000001040000000L});
    public static final BitSet FOLLOW_ruleDefaultFeedbackRule_in_ruleFeedbackPolicy3255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFeedbackRule_in_entryRuleFeedbackRule3291 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFeedbackRule3301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleFeedbackRule3347 = new BitSet(new long[]{0x00000301000001F0L,0x0000000000000003L});
    public static final BitSet FOLLOW_ruleFeedbackFilter_in_ruleFeedbackRule3368 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleFeedbackRule3380 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_ruleFeedbackRule3392 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_ruleFeedbackConsequence_in_ruleFeedbackRule3413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefaultFeedbackRule_in_entryRuleDefaultFeedbackRule3449 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDefaultFeedbackRule3459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleDefaultFeedbackRule3505 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_ruleDefaultFeedbackRule3517 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_ruleFeedbackConsequence_in_ruleDefaultFeedbackRule3538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFeedbackFilter_in_entryRuleFeedbackFilter3574 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFeedbackFilter3584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGExpression_in_ruleFeedbackFilter3639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFeedbackConsequence_in_entryRuleFeedbackConsequence3675 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFeedbackConsequence3685 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleFeedbackConsequence3731 = new BitSet(new long[]{0x00000301000001F0L,0x0000000000000003L});
    public static final BitSet FOLLOW_ruleGExpression_in_ruleFeedbackConsequence3752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMoccEvent_in_entryRuleMoccEvent3788 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMoccEvent3798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEclEvent_in_ruleMoccEvent3844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEclEvent_in_entryRuleEclEvent3878 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEclEvent3888 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleEclEvent3945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExecutionFunction_in_entryRuleExecutionFunction3981 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExecutionFunction3991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleKermeta3ExecutionFunction_in_ruleExecutionFunction4037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleKermeta3ExecutionFunction_in_entryRuleKermeta3ExecutionFunction4071 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleKermeta3ExecutionFunction4081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGExpression_in_ruleKermeta3ExecutionFunction4136 = new BitSet(new long[]{0x000C004000000002L});
    public static final BitSet FOLLOW_ruleCallKind_in_ruleKermeta3ExecutionFunction4157 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_38_in_ruleKermeta3ExecutionFunction4171 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleExecutionFunctionResult_in_ruleKermeta3ExecutionFunction4192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExecutionFunctionResult_in_entryRuleExecutionFunctionResult4230 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExecutionFunctionResult4240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleExecutionFunctionResult4291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName4333 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName4344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName4384 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_39_in_ruleQualifiedName4412 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName4428 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_ruleGImportStatement_in_entryRuleGImportStatement4477 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGImportStatement4487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleGImportStatement4524 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleGImportStatement4541 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGExpression_in_entryRuleGExpression4582 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGExpression4592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGOrExpression_in_ruleGExpression4638 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGOrExpression_in_entryRuleGOrExpression4672 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGOrExpression4682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGXorExpression_in_ruleGOrExpression4729 = new BitSet(new long[]{0x0040000000000002L});
    public static final BitSet FOLLOW_ruleGOrOperator_in_ruleGOrExpression4759 = new BitSet(new long[]{0x00000301000001F0L,0x0000000000000003L});
    public static final BitSet FOLLOW_ruleGXorExpression_in_ruleGOrExpression4780 = new BitSet(new long[]{0x0040000000000002L});
    public static final BitSet FOLLOW_ruleGXorExpression_in_entryRuleGXorExpression4818 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGXorExpression4828 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGAndExpression_in_ruleGXorExpression4875 = new BitSet(new long[]{0x0020000000000002L});
    public static final BitSet FOLLOW_ruleGXorOperator_in_ruleGXorExpression4905 = new BitSet(new long[]{0x00000301000001F0L,0x0000000000000003L});
    public static final BitSet FOLLOW_ruleGAndExpression_in_ruleGXorExpression4926 = new BitSet(new long[]{0x0020000000000002L});
    public static final BitSet FOLLOW_ruleGAndExpression_in_entryRuleGAndExpression4964 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGAndExpression4974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGEqualityExpression_in_ruleGAndExpression5021 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_ruleGAndOperator_in_ruleGAndExpression5051 = new BitSet(new long[]{0x00000301000001F0L,0x0000000000000003L});
    public static final BitSet FOLLOW_ruleGEqualityExpression_in_ruleGAndExpression5072 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_ruleGEqualityExpression_in_entryRuleGEqualityExpression5110 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGEqualityExpression5120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGRelationExpression_in_ruleGEqualityExpression5167 = new BitSet(new long[]{0x0180000000000002L});
    public static final BitSet FOLLOW_ruleGEqualityOperator_in_ruleGEqualityExpression5197 = new BitSet(new long[]{0x00000301000001F0L,0x0000000000000003L});
    public static final BitSet FOLLOW_ruleGRelationExpression_in_ruleGEqualityExpression5218 = new BitSet(new long[]{0x0180000000000002L});
    public static final BitSet FOLLOW_ruleGRelationExpression_in_entryRuleGRelationExpression5256 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGRelationExpression5266 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGAdditionExpression_in_ruleGRelationExpression5313 = new BitSet(new long[]{0x1E00000000000002L});
    public static final BitSet FOLLOW_ruleGRelationOperator_in_ruleGRelationExpression5343 = new BitSet(new long[]{0x00000301000001F0L,0x0000000000000003L});
    public static final BitSet FOLLOW_ruleGAdditionExpression_in_ruleGRelationExpression5364 = new BitSet(new long[]{0x1E00000000000002L});
    public static final BitSet FOLLOW_ruleGAdditionExpression_in_entryRuleGAdditionExpression5402 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGAdditionExpression5412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGMultiplicationExpression_in_ruleGAdditionExpression5459 = new BitSet(new long[]{0x2000000020000002L});
    public static final BitSet FOLLOW_ruleGAdditionOperator_in_ruleGAdditionExpression5489 = new BitSet(new long[]{0x00000301000001F0L,0x0000000000000003L});
    public static final BitSet FOLLOW_ruleGMultiplicationExpression_in_ruleGAdditionExpression5510 = new BitSet(new long[]{0x2000000020000002L});
    public static final BitSet FOLLOW_ruleGMultiplicationExpression_in_entryRuleGMultiplicationExpression5548 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGMultiplicationExpression5558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGNegationExpression_in_ruleGMultiplicationExpression5605 = new BitSet(new long[]{0xC000000000000002L});
    public static final BitSet FOLLOW_ruleGMultiplicationOperator_in_ruleGMultiplicationExpression5635 = new BitSet(new long[]{0x00000301000001F0L,0x0000000000000003L});
    public static final BitSet FOLLOW_ruleGNegationExpression_in_ruleGMultiplicationExpression5656 = new BitSet(new long[]{0xC000000000000002L});
    public static final BitSet FOLLOW_ruleGNegationExpression_in_entryRuleGNegationExpression5694 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGNegationExpression5704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGNavigationExpression_in_ruleGNegationExpression5751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGNegationOperator_in_ruleGNegationExpression5787 = new BitSet(new long[]{0x00000301000001F0L});
    public static final BitSet FOLLOW_ruleGNavigationExpression_in_ruleGNegationExpression5808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGNavigationExpression_in_entryRuleGNavigationExpression5845 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGNavigationExpression5855 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGReferenceExpression_in_ruleGNavigationExpression5902 = new BitSet(new long[]{0x0000208000000002L});
    public static final BitSet FOLLOW_ruleNavigationOperator_in_ruleGNavigationExpression5927 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleGNavigationExpression5946 = new BitSet(new long[]{0x0000208000000002L});
    public static final BitSet FOLLOW_ruleGReferenceExpression_in_entryRuleGReferenceExpression5984 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGReferenceExpression5994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGPrimaryExpression_in_ruleGReferenceExpression6041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleGReferenceExpression6076 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGPrimaryExpression_in_entryRuleGPrimaryExpression6113 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGPrimaryExpression6123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGStringExpression_in_ruleGPrimaryExpression6170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGBooleanExpression_in_ruleGPrimaryExpression6197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGNumericExpression_in_ruleGPrimaryExpression6224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGEnumLiteralExpression_in_ruleGPrimaryExpression6251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGIfExpression_in_ruleGPrimaryExpression6278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGBraceExpression_in_ruleGPrimaryExpression6305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGStringExpression_in_entryRuleGStringExpression6340 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGStringExpression6350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleGStringExpression6401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGBooleanExpression_in_entryRuleGBooleanExpression6442 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGBooleanExpression6452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_BOOLEAN_in_ruleGBooleanExpression6503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGNumericExpression_in_entryRuleGNumericExpression6544 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGNumericExpression6554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGIntegerExpression_in_ruleGNumericExpression6601 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGDoubleExpression_in_ruleGNumericExpression6628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGIntegerExpression_in_entryRuleGIntegerExpression6663 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGIntegerExpression6673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleGIntegerExpression6724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGDoubleExpression_in_entryRuleGDoubleExpression6765 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGDoubleExpression6775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DOUBLE_in_ruleGDoubleExpression6826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGEnumLiteralExpression_in_entryRuleGEnumLiteralExpression6867 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGEnumLiteralExpression6877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleGEnumLiteralExpression6923 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleGEnumLiteralExpression6946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGIfExpression_in_entryRuleGIfExpression6982 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGIfExpression6992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleGIfExpression7038 = new BitSet(new long[]{0x00000301000001F0L,0x0000000000000003L});
    public static final BitSet FOLLOW_ruleGExpression_in_ruleGIfExpression7059 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_ruleGIfExpression7071 = new BitSet(new long[]{0x00000301000001F0L,0x0000000000000003L});
    public static final BitSet FOLLOW_ruleGExpression_in_ruleGIfExpression7092 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_ruleGIfExpression7104 = new BitSet(new long[]{0x00000301000001F0L,0x0000000000000003L});
    public static final BitSet FOLLOW_ruleGExpression_in_ruleGIfExpression7125 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_ruleGIfExpression7137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGBraceExpression_in_entryRuleGBraceExpression7173 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGBraceExpression7183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleGBraceExpression7229 = new BitSet(new long[]{0x00000301000001F0L,0x0000000000000003L});
    public static final BitSet FOLLOW_ruleGExpression_in_ruleGBraceExpression7250 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ruleGBraceExpression7262 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNavigationOperator_in_entryRuleNavigationOperator7299 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNavigationOperator7310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleNavigationOperator7348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleNavigationOperator7367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleVisibility7421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruleVisibility7438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleExecutionKind7483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleExecutionKind7500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_ruleCallKind7545 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_ruleCallKind7562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_ruleGAndOperator7606 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_ruleGXorOperator7649 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_ruleGOrOperator7692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_ruleGEqualityOperator7736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_ruleGEqualityOperator7753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_ruleGRelationOperator7798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_ruleGRelationOperator7815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_ruleGRelationOperator7832 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_ruleGRelationOperator7849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleGAdditionOperator7894 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_ruleGAdditionOperator7911 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_ruleGMultiplicationOperator7956 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_ruleGMultiplicationOperator7973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_ruleGNegationOperator8018 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleGNegationOperator8035 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_synpred2_InternalGEL4403 = new BitSet(new long[]{0x0000000000000002L});

}