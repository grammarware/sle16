package org.gemoc.bcool.model.xtext.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import org.gemoc.bcool.model.xtext.services.BCOoLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalBCOoLParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_BOOLEAN", "RULE_INT", "RULE_DOUBLE", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'and'", "'xor'", "'or'", "'.'", "'->'", "'='", "'<>'", "'<'", "'>'", "'<='", "'>='", "'+'", "'-'", "'*'", "'/'", "'not'", "'~'", "'Spec'", "'Global Event'", "';'", "'let'", "'Operator'", "'('", "')'", "'MatchingCorrespondance:'", "'end operator;'", "','", "' : '", "'::'", "'when'", "'CoordinationRule:'", "'Local Event'", "'ImportLib'", "'ImportInterface'", "'as'", "'import'", "'#'", "'if'", "'then'", "'else'", "'endif'"
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
    public String getGrammarFileName() { return "../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g"; }


     
     	private BCOoLGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(BCOoLGrammarAccess grammarAccess) {
        	this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected Grammar getGrammar() {
        	return grammarAccess.getGrammar();
        }
        
        @Override
        protected String getValueForTokenName(String tokenName) {
        	return tokenName;
        }




    // $ANTLR start "entryRuleBCoolSpec"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:61:1: entryRuleBCoolSpec : ruleBCoolSpec EOF ;
    public final void entryRuleBCoolSpec() throws RecognitionException {
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:62:1: ( ruleBCoolSpec EOF )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:63:1: ruleBCoolSpec EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBCoolSpecRule()); 
            }
            pushFollow(FOLLOW_ruleBCoolSpec_in_entryRuleBCoolSpec67);
            ruleBCoolSpec();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBCoolSpecRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBCoolSpec74); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBCoolSpec"


    // $ANTLR start "ruleBCoolSpec"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:70:1: ruleBCoolSpec : ( ( rule__BCoolSpec__Group__0 ) ) ;
    public final void ruleBCoolSpec() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:74:2: ( ( ( rule__BCoolSpec__Group__0 ) ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:75:1: ( ( rule__BCoolSpec__Group__0 ) )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:75:1: ( ( rule__BCoolSpec__Group__0 ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:76:1: ( rule__BCoolSpec__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBCoolSpecAccess().getGroup()); 
            }
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:77:1: ( rule__BCoolSpec__Group__0 )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:77:2: rule__BCoolSpec__Group__0
            {
            pushFollow(FOLLOW_rule__BCoolSpec__Group__0_in_ruleBCoolSpec100);
            rule__BCoolSpec__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBCoolSpecAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBCoolSpec"


    // $ANTLR start "entryRuleBCoolOperatorSpec"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:89:1: entryRuleBCoolOperatorSpec : ruleBCoolOperatorSpec EOF ;
    public final void entryRuleBCoolOperatorSpec() throws RecognitionException {
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:90:1: ( ruleBCoolOperatorSpec EOF )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:91:1: ruleBCoolOperatorSpec EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBCoolOperatorSpecRule()); 
            }
            pushFollow(FOLLOW_ruleBCoolOperatorSpec_in_entryRuleBCoolOperatorSpec127);
            ruleBCoolOperatorSpec();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBCoolOperatorSpecRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBCoolOperatorSpec134); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBCoolOperatorSpec"


    // $ANTLR start "ruleBCoolOperatorSpec"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:98:1: ruleBCoolOperatorSpec : ( ( rule__BCoolOperatorSpec__Group__0 ) ) ;
    public final void ruleBCoolOperatorSpec() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:102:2: ( ( ( rule__BCoolOperatorSpec__Group__0 ) ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:103:1: ( ( rule__BCoolOperatorSpec__Group__0 ) )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:103:1: ( ( rule__BCoolOperatorSpec__Group__0 ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:104:1: ( rule__BCoolOperatorSpec__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBCoolOperatorSpecAccess().getGroup()); 
            }
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:105:1: ( rule__BCoolOperatorSpec__Group__0 )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:105:2: rule__BCoolOperatorSpec__Group__0
            {
            pushFollow(FOLLOW_rule__BCoolOperatorSpec__Group__0_in_ruleBCoolOperatorSpec160);
            rule__BCoolOperatorSpec__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBCoolOperatorSpecAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBCoolOperatorSpec"


    // $ANTLR start "entryRuleglobalDSEsRule"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:117:1: entryRuleglobalDSEsRule : ruleglobalDSEsRule EOF ;
    public final void entryRuleglobalDSEsRule() throws RecognitionException {
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:118:1: ( ruleglobalDSEsRule EOF )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:119:1: ruleglobalDSEsRule EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGlobalDSEsRuleRule()); 
            }
            pushFollow(FOLLOW_ruleglobalDSEsRule_in_entryRuleglobalDSEsRule187);
            ruleglobalDSEsRule();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGlobalDSEsRuleRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleglobalDSEsRule194); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleglobalDSEsRule"


    // $ANTLR start "ruleglobalDSEsRule"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:126:1: ruleglobalDSEsRule : ( ( rule__GlobalDSEsRule__Group__0 ) ) ;
    public final void ruleglobalDSEsRule() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:130:2: ( ( ( rule__GlobalDSEsRule__Group__0 ) ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:131:1: ( ( rule__GlobalDSEsRule__Group__0 ) )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:131:1: ( ( rule__GlobalDSEsRule__Group__0 ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:132:1: ( rule__GlobalDSEsRule__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGlobalDSEsRuleAccess().getGroup()); 
            }
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:133:1: ( rule__GlobalDSEsRule__Group__0 )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:133:2: rule__GlobalDSEsRule__Group__0
            {
            pushFollow(FOLLOW_rule__GlobalDSEsRule__Group__0_in_ruleglobalDSEsRule220);
            rule__GlobalDSEsRule__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGlobalDSEsRuleAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleglobalDSEsRule"


    // $ANTLR start "entryRuleglobalEventExpressionRule"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:145:1: entryRuleglobalEventExpressionRule : ruleglobalEventExpressionRule EOF ;
    public final void entryRuleglobalEventExpressionRule() throws RecognitionException {
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:146:1: ( ruleglobalEventExpressionRule EOF )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:147:1: ruleglobalEventExpressionRule EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGlobalEventExpressionRuleRule()); 
            }
            pushFollow(FOLLOW_ruleglobalEventExpressionRule_in_entryRuleglobalEventExpressionRule247);
            ruleglobalEventExpressionRule();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGlobalEventExpressionRuleRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleglobalEventExpressionRule254); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleglobalEventExpressionRule"


    // $ANTLR start "ruleglobalEventExpressionRule"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:154:1: ruleglobalEventExpressionRule : ( ( rule__GlobalEventExpressionRule__Group__0 ) ) ;
    public final void ruleglobalEventExpressionRule() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:158:2: ( ( ( rule__GlobalEventExpressionRule__Group__0 ) ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:159:1: ( ( rule__GlobalEventExpressionRule__Group__0 ) )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:159:1: ( ( rule__GlobalEventExpressionRule__Group__0 ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:160:1: ( rule__GlobalEventExpressionRule__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGlobalEventExpressionRuleAccess().getGroup()); 
            }
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:161:1: ( rule__GlobalEventExpressionRule__Group__0 )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:161:2: rule__GlobalEventExpressionRule__Group__0
            {
            pushFollow(FOLLOW_rule__GlobalEventExpressionRule__Group__0_in_ruleglobalEventExpressionRule280);
            rule__GlobalEventExpressionRule__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGlobalEventExpressionRuleAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleglobalEventExpressionRule"


    // $ANTLR start "entryRuleBCoolCompositionRule"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:173:1: entryRuleBCoolCompositionRule : ruleBCoolCompositionRule EOF ;
    public final void entryRuleBCoolCompositionRule() throws RecognitionException {
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:174:1: ( ruleBCoolCompositionRule EOF )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:175:1: ruleBCoolCompositionRule EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBCoolCompositionRuleRule()); 
            }
            pushFollow(FOLLOW_ruleBCoolCompositionRule_in_entryRuleBCoolCompositionRule307);
            ruleBCoolCompositionRule();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBCoolCompositionRuleRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBCoolCompositionRule314); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBCoolCompositionRule"


    // $ANTLR start "ruleBCoolCompositionRule"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:182:1: ruleBCoolCompositionRule : ( ( rule__BCoolCompositionRule__Group__0 ) ) ;
    public final void ruleBCoolCompositionRule() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:186:2: ( ( ( rule__BCoolCompositionRule__Group__0 ) ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:187:1: ( ( rule__BCoolCompositionRule__Group__0 ) )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:187:1: ( ( rule__BCoolCompositionRule__Group__0 ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:188:1: ( rule__BCoolCompositionRule__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBCoolCompositionRuleAccess().getGroup()); 
            }
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:189:1: ( rule__BCoolCompositionRule__Group__0 )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:189:2: rule__BCoolCompositionRule__Group__0
            {
            pushFollow(FOLLOW_rule__BCoolCompositionRule__Group__0_in_ruleBCoolCompositionRule340);
            rule__BCoolCompositionRule__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBCoolCompositionRuleAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBCoolCompositionRule"


    // $ANTLR start "entryRuleBCoolOperatorArg"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:201:1: entryRuleBCoolOperatorArg : ruleBCoolOperatorArg EOF ;
    public final void entryRuleBCoolOperatorArg() throws RecognitionException {
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:202:1: ( ruleBCoolOperatorArg EOF )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:203:1: ruleBCoolOperatorArg EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBCoolOperatorArgRule()); 
            }
            pushFollow(FOLLOW_ruleBCoolOperatorArg_in_entryRuleBCoolOperatorArg367);
            ruleBCoolOperatorArg();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBCoolOperatorArgRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBCoolOperatorArg374); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBCoolOperatorArg"


    // $ANTLR start "ruleBCoolOperatorArg"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:210:1: ruleBCoolOperatorArg : ( ( rule__BCoolOperatorArg__Group__0 ) ) ;
    public final void ruleBCoolOperatorArg() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:214:2: ( ( ( rule__BCoolOperatorArg__Group__0 ) ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:215:1: ( ( rule__BCoolOperatorArg__Group__0 ) )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:215:1: ( ( rule__BCoolOperatorArg__Group__0 ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:216:1: ( rule__BCoolOperatorArg__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBCoolOperatorArgAccess().getGroup()); 
            }
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:217:1: ( rule__BCoolOperatorArg__Group__0 )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:217:2: rule__BCoolOperatorArg__Group__0
            {
            pushFollow(FOLLOW_rule__BCoolOperatorArg__Group__0_in_ruleBCoolOperatorArg400);
            rule__BCoolOperatorArg__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBCoolOperatorArgAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBCoolOperatorArg"


    // $ANTLR start "entryRuleMatchingRule"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:229:1: entryRuleMatchingRule : ruleMatchingRule EOF ;
    public final void entryRuleMatchingRule() throws RecognitionException {
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:230:1: ( ruleMatchingRule EOF )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:231:1: ruleMatchingRule EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMatchingRuleRule()); 
            }
            pushFollow(FOLLOW_ruleMatchingRule_in_entryRuleMatchingRule427);
            ruleMatchingRule();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMatchingRuleRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMatchingRule434); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMatchingRule"


    // $ANTLR start "ruleMatchingRule"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:238:1: ruleMatchingRule : ( ( rule__MatchingRule__Group__0 ) ) ;
    public final void ruleMatchingRule() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:242:2: ( ( ( rule__MatchingRule__Group__0 ) ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:243:1: ( ( rule__MatchingRule__Group__0 ) )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:243:1: ( ( rule__MatchingRule__Group__0 ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:244:1: ( rule__MatchingRule__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMatchingRuleAccess().getGroup()); 
            }
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:245:1: ( rule__MatchingRule__Group__0 )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:245:2: rule__MatchingRule__Group__0
            {
            pushFollow(FOLLOW_rule__MatchingRule__Group__0_in_ruleMatchingRule460);
            rule__MatchingRule__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMatchingRuleAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMatchingRule"


    // $ANTLR start "entryRuleEventExpression"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:257:1: entryRuleEventExpression : ruleEventExpression EOF ;
    public final void entryRuleEventExpression() throws RecognitionException {
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:258:1: ( ruleEventExpression EOF )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:259:1: ruleEventExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleEventExpression_in_entryRuleEventExpression487);
            ruleEventExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEventExpressionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEventExpression494); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEventExpression"


    // $ANTLR start "ruleEventExpression"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:266:1: ruleEventExpression : ( ( rule__EventExpression__Group__0 ) ) ;
    public final void ruleEventExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:270:2: ( ( ( rule__EventExpression__Group__0 ) ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:271:1: ( ( rule__EventExpression__Group__0 ) )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:271:1: ( ( rule__EventExpression__Group__0 ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:272:1: ( rule__EventExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventExpressionAccess().getGroup()); 
            }
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:273:1: ( rule__EventExpression__Group__0 )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:273:2: rule__EventExpression__Group__0
            {
            pushFollow(FOLLOW_rule__EventExpression__Group__0_in_ruleEventExpression520);
            rule__EventExpression__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEventExpressionAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEventExpression"


    // $ANTLR start "entryRuleCoordinationRule"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:285:1: entryRuleCoordinationRule : ruleCoordinationRule EOF ;
    public final void entryRuleCoordinationRule() throws RecognitionException {
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:286:1: ( ruleCoordinationRule EOF )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:287:1: ruleCoordinationRule EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCoordinationRuleRule()); 
            }
            pushFollow(FOLLOW_ruleCoordinationRule_in_entryRuleCoordinationRule547);
            ruleCoordinationRule();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCoordinationRuleRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCoordinationRule554); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCoordinationRule"


    // $ANTLR start "ruleCoordinationRule"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:294:1: ruleCoordinationRule : ( ( rule__CoordinationRule__EventRelationsAssignment ) ) ;
    public final void ruleCoordinationRule() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:298:2: ( ( ( rule__CoordinationRule__EventRelationsAssignment ) ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:299:1: ( ( rule__CoordinationRule__EventRelationsAssignment ) )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:299:1: ( ( rule__CoordinationRule__EventRelationsAssignment ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:300:1: ( rule__CoordinationRule__EventRelationsAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCoordinationRuleAccess().getEventRelationsAssignment()); 
            }
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:301:1: ( rule__CoordinationRule__EventRelationsAssignment )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:301:2: rule__CoordinationRule__EventRelationsAssignment
            {
            pushFollow(FOLLOW_rule__CoordinationRule__EventRelationsAssignment_in_ruleCoordinationRule580);
            rule__CoordinationRule__EventRelationsAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCoordinationRuleAccess().getEventRelationsAssignment()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCoordinationRule"


    // $ANTLR start "entryRuleEventRelation"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:313:1: entryRuleEventRelation : ruleEventRelation EOF ;
    public final void entryRuleEventRelation() throws RecognitionException {
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:314:1: ( ruleEventRelation EOF )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:315:1: ruleEventRelation EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventRelationRule()); 
            }
            pushFollow(FOLLOW_ruleEventRelation_in_entryRuleEventRelation607);
            ruleEventRelation();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEventRelationRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEventRelation614); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEventRelation"


    // $ANTLR start "ruleEventRelation"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:322:1: ruleEventRelation : ( ( rule__EventRelation__Group__0 ) ) ;
    public final void ruleEventRelation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:326:2: ( ( ( rule__EventRelation__Group__0 ) ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:327:1: ( ( rule__EventRelation__Group__0 ) )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:327:1: ( ( rule__EventRelation__Group__0 ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:328:1: ( rule__EventRelation__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventRelationAccess().getGroup()); 
            }
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:329:1: ( rule__EventRelation__Group__0 )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:329:2: rule__EventRelation__Group__0
            {
            pushFollow(FOLLOW_rule__EventRelation__Group__0_in_ruleEventRelation640);
            rule__EventRelation__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEventRelationAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEventRelation"


    // $ANTLR start "entryRuleImportLibRule"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:341:1: entryRuleImportLibRule : ruleImportLibRule EOF ;
    public final void entryRuleImportLibRule() throws RecognitionException {
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:342:1: ( ruleImportLibRule EOF )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:343:1: ruleImportLibRule EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportLibRuleRule()); 
            }
            pushFollow(FOLLOW_ruleImportLibRule_in_entryRuleImportLibRule667);
            ruleImportLibRule();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getImportLibRuleRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleImportLibRule674); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleImportLibRule"


    // $ANTLR start "ruleImportLibRule"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:350:1: ruleImportLibRule : ( ( rule__ImportLibRule__Group__0 ) ) ;
    public final void ruleImportLibRule() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:354:2: ( ( ( rule__ImportLibRule__Group__0 ) ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:355:1: ( ( rule__ImportLibRule__Group__0 ) )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:355:1: ( ( rule__ImportLibRule__Group__0 ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:356:1: ( rule__ImportLibRule__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportLibRuleAccess().getGroup()); 
            }
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:357:1: ( rule__ImportLibRule__Group__0 )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:357:2: rule__ImportLibRule__Group__0
            {
            pushFollow(FOLLOW_rule__ImportLibRule__Group__0_in_ruleImportLibRule700);
            rule__ImportLibRule__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getImportLibRuleAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleImportLibRule"


    // $ANTLR start "entryRuleImportInterfaceRule"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:369:1: entryRuleImportInterfaceRule : ruleImportInterfaceRule EOF ;
    public final void entryRuleImportInterfaceRule() throws RecognitionException {
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:370:1: ( ruleImportInterfaceRule EOF )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:371:1: ruleImportInterfaceRule EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportInterfaceRuleRule()); 
            }
            pushFollow(FOLLOW_ruleImportInterfaceRule_in_entryRuleImportInterfaceRule727);
            ruleImportInterfaceRule();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getImportInterfaceRuleRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleImportInterfaceRule734); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleImportInterfaceRule"


    // $ANTLR start "ruleImportInterfaceRule"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:378:1: ruleImportInterfaceRule : ( ( rule__ImportInterfaceRule__Group__0 ) ) ;
    public final void ruleImportInterfaceRule() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:382:2: ( ( ( rule__ImportInterfaceRule__Group__0 ) ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:383:1: ( ( rule__ImportInterfaceRule__Group__0 ) )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:383:1: ( ( rule__ImportInterfaceRule__Group__0 ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:384:1: ( rule__ImportInterfaceRule__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportInterfaceRuleAccess().getGroup()); 
            }
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:385:1: ( rule__ImportInterfaceRule__Group__0 )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:385:2: rule__ImportInterfaceRule__Group__0
            {
            pushFollow(FOLLOW_rule__ImportInterfaceRule__Group__0_in_ruleImportInterfaceRule760);
            rule__ImportInterfaceRule__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getImportInterfaceRuleAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleImportInterfaceRule"


    // $ANTLR start "entryRuleGImportStatement"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:399:1: entryRuleGImportStatement : ruleGImportStatement EOF ;
    public final void entryRuleGImportStatement() throws RecognitionException {
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:400:1: ( ruleGImportStatement EOF )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:401:1: ruleGImportStatement EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGImportStatementRule()); 
            }
            pushFollow(FOLLOW_ruleGImportStatement_in_entryRuleGImportStatement789);
            ruleGImportStatement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGImportStatementRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleGImportStatement796); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGImportStatement"


    // $ANTLR start "ruleGImportStatement"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:408:1: ruleGImportStatement : ( ( rule__GImportStatement__Group__0 ) ) ;
    public final void ruleGImportStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:412:2: ( ( ( rule__GImportStatement__Group__0 ) ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:413:1: ( ( rule__GImportStatement__Group__0 ) )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:413:1: ( ( rule__GImportStatement__Group__0 ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:414:1: ( rule__GImportStatement__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGImportStatementAccess().getGroup()); 
            }
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:415:1: ( rule__GImportStatement__Group__0 )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:415:2: rule__GImportStatement__Group__0
            {
            pushFollow(FOLLOW_rule__GImportStatement__Group__0_in_ruleGImportStatement822);
            rule__GImportStatement__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGImportStatementAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGImportStatement"


    // $ANTLR start "entryRuleGExpression"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:427:1: entryRuleGExpression : ruleGExpression EOF ;
    public final void entryRuleGExpression() throws RecognitionException {
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:428:1: ( ruleGExpression EOF )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:429:1: ruleGExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleGExpression_in_entryRuleGExpression849);
            ruleGExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGExpressionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleGExpression856); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGExpression"


    // $ANTLR start "ruleGExpression"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:436:1: ruleGExpression : ( ruleGOrExpression ) ;
    public final void ruleGExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:440:2: ( ( ruleGOrExpression ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:441:1: ( ruleGOrExpression )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:441:1: ( ruleGOrExpression )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:442:1: ruleGOrExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGExpressionAccess().getGOrExpressionParserRuleCall()); 
            }
            pushFollow(FOLLOW_ruleGOrExpression_in_ruleGExpression882);
            ruleGOrExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGExpressionAccess().getGOrExpressionParserRuleCall()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGExpression"


    // $ANTLR start "entryRuleGOrExpression"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:455:1: entryRuleGOrExpression : ruleGOrExpression EOF ;
    public final void entryRuleGOrExpression() throws RecognitionException {
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:456:1: ( ruleGOrExpression EOF )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:457:1: ruleGOrExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGOrExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleGOrExpression_in_entryRuleGOrExpression908);
            ruleGOrExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGOrExpressionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleGOrExpression915); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGOrExpression"


    // $ANTLR start "ruleGOrExpression"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:464:1: ruleGOrExpression : ( ( rule__GOrExpression__Group__0 ) ) ;
    public final void ruleGOrExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:468:2: ( ( ( rule__GOrExpression__Group__0 ) ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:469:1: ( ( rule__GOrExpression__Group__0 ) )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:469:1: ( ( rule__GOrExpression__Group__0 ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:470:1: ( rule__GOrExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGOrExpressionAccess().getGroup()); 
            }
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:471:1: ( rule__GOrExpression__Group__0 )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:471:2: rule__GOrExpression__Group__0
            {
            pushFollow(FOLLOW_rule__GOrExpression__Group__0_in_ruleGOrExpression941);
            rule__GOrExpression__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGOrExpressionAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGOrExpression"


    // $ANTLR start "entryRuleGXorExpression"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:483:1: entryRuleGXorExpression : ruleGXorExpression EOF ;
    public final void entryRuleGXorExpression() throws RecognitionException {
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:484:1: ( ruleGXorExpression EOF )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:485:1: ruleGXorExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGXorExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleGXorExpression_in_entryRuleGXorExpression968);
            ruleGXorExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGXorExpressionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleGXorExpression975); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGXorExpression"


    // $ANTLR start "ruleGXorExpression"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:492:1: ruleGXorExpression : ( ( rule__GXorExpression__Group__0 ) ) ;
    public final void ruleGXorExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:496:2: ( ( ( rule__GXorExpression__Group__0 ) ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:497:1: ( ( rule__GXorExpression__Group__0 ) )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:497:1: ( ( rule__GXorExpression__Group__0 ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:498:1: ( rule__GXorExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGXorExpressionAccess().getGroup()); 
            }
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:499:1: ( rule__GXorExpression__Group__0 )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:499:2: rule__GXorExpression__Group__0
            {
            pushFollow(FOLLOW_rule__GXorExpression__Group__0_in_ruleGXorExpression1001);
            rule__GXorExpression__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGXorExpressionAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGXorExpression"


    // $ANTLR start "entryRuleGAndExpression"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:511:1: entryRuleGAndExpression : ruleGAndExpression EOF ;
    public final void entryRuleGAndExpression() throws RecognitionException {
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:512:1: ( ruleGAndExpression EOF )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:513:1: ruleGAndExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGAndExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleGAndExpression_in_entryRuleGAndExpression1028);
            ruleGAndExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGAndExpressionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleGAndExpression1035); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGAndExpression"


    // $ANTLR start "ruleGAndExpression"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:520:1: ruleGAndExpression : ( ( rule__GAndExpression__Group__0 ) ) ;
    public final void ruleGAndExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:524:2: ( ( ( rule__GAndExpression__Group__0 ) ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:525:1: ( ( rule__GAndExpression__Group__0 ) )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:525:1: ( ( rule__GAndExpression__Group__0 ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:526:1: ( rule__GAndExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGAndExpressionAccess().getGroup()); 
            }
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:527:1: ( rule__GAndExpression__Group__0 )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:527:2: rule__GAndExpression__Group__0
            {
            pushFollow(FOLLOW_rule__GAndExpression__Group__0_in_ruleGAndExpression1061);
            rule__GAndExpression__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGAndExpressionAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGAndExpression"


    // $ANTLR start "entryRuleGEqualityExpression"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:539:1: entryRuleGEqualityExpression : ruleGEqualityExpression EOF ;
    public final void entryRuleGEqualityExpression() throws RecognitionException {
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:540:1: ( ruleGEqualityExpression EOF )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:541:1: ruleGEqualityExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGEqualityExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleGEqualityExpression_in_entryRuleGEqualityExpression1088);
            ruleGEqualityExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGEqualityExpressionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleGEqualityExpression1095); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGEqualityExpression"


    // $ANTLR start "ruleGEqualityExpression"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:548:1: ruleGEqualityExpression : ( ( rule__GEqualityExpression__Group__0 ) ) ;
    public final void ruleGEqualityExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:552:2: ( ( ( rule__GEqualityExpression__Group__0 ) ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:553:1: ( ( rule__GEqualityExpression__Group__0 ) )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:553:1: ( ( rule__GEqualityExpression__Group__0 ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:554:1: ( rule__GEqualityExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGEqualityExpressionAccess().getGroup()); 
            }
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:555:1: ( rule__GEqualityExpression__Group__0 )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:555:2: rule__GEqualityExpression__Group__0
            {
            pushFollow(FOLLOW_rule__GEqualityExpression__Group__0_in_ruleGEqualityExpression1121);
            rule__GEqualityExpression__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGEqualityExpressionAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGEqualityExpression"


    // $ANTLR start "entryRuleGRelationExpression"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:567:1: entryRuleGRelationExpression : ruleGRelationExpression EOF ;
    public final void entryRuleGRelationExpression() throws RecognitionException {
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:568:1: ( ruleGRelationExpression EOF )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:569:1: ruleGRelationExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGRelationExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleGRelationExpression_in_entryRuleGRelationExpression1148);
            ruleGRelationExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGRelationExpressionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleGRelationExpression1155); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGRelationExpression"


    // $ANTLR start "ruleGRelationExpression"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:576:1: ruleGRelationExpression : ( ( rule__GRelationExpression__Group__0 ) ) ;
    public final void ruleGRelationExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:580:2: ( ( ( rule__GRelationExpression__Group__0 ) ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:581:1: ( ( rule__GRelationExpression__Group__0 ) )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:581:1: ( ( rule__GRelationExpression__Group__0 ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:582:1: ( rule__GRelationExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGRelationExpressionAccess().getGroup()); 
            }
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:583:1: ( rule__GRelationExpression__Group__0 )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:583:2: rule__GRelationExpression__Group__0
            {
            pushFollow(FOLLOW_rule__GRelationExpression__Group__0_in_ruleGRelationExpression1181);
            rule__GRelationExpression__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGRelationExpressionAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGRelationExpression"


    // $ANTLR start "entryRuleGAdditionExpression"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:595:1: entryRuleGAdditionExpression : ruleGAdditionExpression EOF ;
    public final void entryRuleGAdditionExpression() throws RecognitionException {
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:596:1: ( ruleGAdditionExpression EOF )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:597:1: ruleGAdditionExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGAdditionExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleGAdditionExpression_in_entryRuleGAdditionExpression1208);
            ruleGAdditionExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGAdditionExpressionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleGAdditionExpression1215); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGAdditionExpression"


    // $ANTLR start "ruleGAdditionExpression"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:604:1: ruleGAdditionExpression : ( ( rule__GAdditionExpression__Group__0 ) ) ;
    public final void ruleGAdditionExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:608:2: ( ( ( rule__GAdditionExpression__Group__0 ) ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:609:1: ( ( rule__GAdditionExpression__Group__0 ) )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:609:1: ( ( rule__GAdditionExpression__Group__0 ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:610:1: ( rule__GAdditionExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGAdditionExpressionAccess().getGroup()); 
            }
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:611:1: ( rule__GAdditionExpression__Group__0 )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:611:2: rule__GAdditionExpression__Group__0
            {
            pushFollow(FOLLOW_rule__GAdditionExpression__Group__0_in_ruleGAdditionExpression1241);
            rule__GAdditionExpression__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGAdditionExpressionAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGAdditionExpression"


    // $ANTLR start "entryRuleGMultiplicationExpression"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:623:1: entryRuleGMultiplicationExpression : ruleGMultiplicationExpression EOF ;
    public final void entryRuleGMultiplicationExpression() throws RecognitionException {
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:624:1: ( ruleGMultiplicationExpression EOF )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:625:1: ruleGMultiplicationExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGMultiplicationExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleGMultiplicationExpression_in_entryRuleGMultiplicationExpression1268);
            ruleGMultiplicationExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGMultiplicationExpressionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleGMultiplicationExpression1275); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGMultiplicationExpression"


    // $ANTLR start "ruleGMultiplicationExpression"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:632:1: ruleGMultiplicationExpression : ( ( rule__GMultiplicationExpression__Group__0 ) ) ;
    public final void ruleGMultiplicationExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:636:2: ( ( ( rule__GMultiplicationExpression__Group__0 ) ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:637:1: ( ( rule__GMultiplicationExpression__Group__0 ) )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:637:1: ( ( rule__GMultiplicationExpression__Group__0 ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:638:1: ( rule__GMultiplicationExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGMultiplicationExpressionAccess().getGroup()); 
            }
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:639:1: ( rule__GMultiplicationExpression__Group__0 )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:639:2: rule__GMultiplicationExpression__Group__0
            {
            pushFollow(FOLLOW_rule__GMultiplicationExpression__Group__0_in_ruleGMultiplicationExpression1301);
            rule__GMultiplicationExpression__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGMultiplicationExpressionAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGMultiplicationExpression"


    // $ANTLR start "entryRuleGNegationExpression"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:651:1: entryRuleGNegationExpression : ruleGNegationExpression EOF ;
    public final void entryRuleGNegationExpression() throws RecognitionException {
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:652:1: ( ruleGNegationExpression EOF )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:653:1: ruleGNegationExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGNegationExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleGNegationExpression_in_entryRuleGNegationExpression1328);
            ruleGNegationExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGNegationExpressionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleGNegationExpression1335); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGNegationExpression"


    // $ANTLR start "ruleGNegationExpression"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:660:1: ruleGNegationExpression : ( ( rule__GNegationExpression__Alternatives ) ) ;
    public final void ruleGNegationExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:664:2: ( ( ( rule__GNegationExpression__Alternatives ) ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:665:1: ( ( rule__GNegationExpression__Alternatives ) )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:665:1: ( ( rule__GNegationExpression__Alternatives ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:666:1: ( rule__GNegationExpression__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGNegationExpressionAccess().getAlternatives()); 
            }
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:667:1: ( rule__GNegationExpression__Alternatives )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:667:2: rule__GNegationExpression__Alternatives
            {
            pushFollow(FOLLOW_rule__GNegationExpression__Alternatives_in_ruleGNegationExpression1361);
            rule__GNegationExpression__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGNegationExpressionAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGNegationExpression"


    // $ANTLR start "entryRuleGNavigationExpression"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:679:1: entryRuleGNavigationExpression : ruleGNavigationExpression EOF ;
    public final void entryRuleGNavigationExpression() throws RecognitionException {
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:680:1: ( ruleGNavigationExpression EOF )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:681:1: ruleGNavigationExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGNavigationExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleGNavigationExpression_in_entryRuleGNavigationExpression1388);
            ruleGNavigationExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGNavigationExpressionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleGNavigationExpression1395); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGNavigationExpression"


    // $ANTLR start "ruleGNavigationExpression"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:688:1: ruleGNavigationExpression : ( ( rule__GNavigationExpression__Group__0 ) ) ;
    public final void ruleGNavigationExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:692:2: ( ( ( rule__GNavigationExpression__Group__0 ) ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:693:1: ( ( rule__GNavigationExpression__Group__0 ) )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:693:1: ( ( rule__GNavigationExpression__Group__0 ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:694:1: ( rule__GNavigationExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGNavigationExpressionAccess().getGroup()); 
            }
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:695:1: ( rule__GNavigationExpression__Group__0 )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:695:2: rule__GNavigationExpression__Group__0
            {
            pushFollow(FOLLOW_rule__GNavigationExpression__Group__0_in_ruleGNavigationExpression1421);
            rule__GNavigationExpression__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGNavigationExpressionAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGNavigationExpression"


    // $ANTLR start "entryRuleGReferenceExpression"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:707:1: entryRuleGReferenceExpression : ruleGReferenceExpression EOF ;
    public final void entryRuleGReferenceExpression() throws RecognitionException {
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:708:1: ( ruleGReferenceExpression EOF )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:709:1: ruleGReferenceExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGReferenceExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleGReferenceExpression_in_entryRuleGReferenceExpression1448);
            ruleGReferenceExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGReferenceExpressionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleGReferenceExpression1455); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGReferenceExpression"


    // $ANTLR start "ruleGReferenceExpression"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:716:1: ruleGReferenceExpression : ( ( rule__GReferenceExpression__Alternatives ) ) ;
    public final void ruleGReferenceExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:720:2: ( ( ( rule__GReferenceExpression__Alternatives ) ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:721:1: ( ( rule__GReferenceExpression__Alternatives ) )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:721:1: ( ( rule__GReferenceExpression__Alternatives ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:722:1: ( rule__GReferenceExpression__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGReferenceExpressionAccess().getAlternatives()); 
            }
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:723:1: ( rule__GReferenceExpression__Alternatives )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:723:2: rule__GReferenceExpression__Alternatives
            {
            pushFollow(FOLLOW_rule__GReferenceExpression__Alternatives_in_ruleGReferenceExpression1481);
            rule__GReferenceExpression__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGReferenceExpressionAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGReferenceExpression"


    // $ANTLR start "entryRuleGPrimaryExpression"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:735:1: entryRuleGPrimaryExpression : ruleGPrimaryExpression EOF ;
    public final void entryRuleGPrimaryExpression() throws RecognitionException {
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:736:1: ( ruleGPrimaryExpression EOF )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:737:1: ruleGPrimaryExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGPrimaryExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleGPrimaryExpression_in_entryRuleGPrimaryExpression1508);
            ruleGPrimaryExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGPrimaryExpressionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleGPrimaryExpression1515); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGPrimaryExpression"


    // $ANTLR start "ruleGPrimaryExpression"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:744:1: ruleGPrimaryExpression : ( ( rule__GPrimaryExpression__Alternatives ) ) ;
    public final void ruleGPrimaryExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:748:2: ( ( ( rule__GPrimaryExpression__Alternatives ) ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:749:1: ( ( rule__GPrimaryExpression__Alternatives ) )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:749:1: ( ( rule__GPrimaryExpression__Alternatives ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:750:1: ( rule__GPrimaryExpression__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGPrimaryExpressionAccess().getAlternatives()); 
            }
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:751:1: ( rule__GPrimaryExpression__Alternatives )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:751:2: rule__GPrimaryExpression__Alternatives
            {
            pushFollow(FOLLOW_rule__GPrimaryExpression__Alternatives_in_ruleGPrimaryExpression1541);
            rule__GPrimaryExpression__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGPrimaryExpressionAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGPrimaryExpression"


    // $ANTLR start "entryRuleGStringExpression"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:763:1: entryRuleGStringExpression : ruleGStringExpression EOF ;
    public final void entryRuleGStringExpression() throws RecognitionException {
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:764:1: ( ruleGStringExpression EOF )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:765:1: ruleGStringExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGStringExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleGStringExpression_in_entryRuleGStringExpression1568);
            ruleGStringExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGStringExpressionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleGStringExpression1575); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGStringExpression"


    // $ANTLR start "ruleGStringExpression"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:772:1: ruleGStringExpression : ( ( rule__GStringExpression__Group__0 ) ) ;
    public final void ruleGStringExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:776:2: ( ( ( rule__GStringExpression__Group__0 ) ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:777:1: ( ( rule__GStringExpression__Group__0 ) )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:777:1: ( ( rule__GStringExpression__Group__0 ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:778:1: ( rule__GStringExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGStringExpressionAccess().getGroup()); 
            }
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:779:1: ( rule__GStringExpression__Group__0 )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:779:2: rule__GStringExpression__Group__0
            {
            pushFollow(FOLLOW_rule__GStringExpression__Group__0_in_ruleGStringExpression1601);
            rule__GStringExpression__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGStringExpressionAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGStringExpression"


    // $ANTLR start "entryRuleGBooleanExpression"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:791:1: entryRuleGBooleanExpression : ruleGBooleanExpression EOF ;
    public final void entryRuleGBooleanExpression() throws RecognitionException {
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:792:1: ( ruleGBooleanExpression EOF )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:793:1: ruleGBooleanExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGBooleanExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleGBooleanExpression_in_entryRuleGBooleanExpression1628);
            ruleGBooleanExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGBooleanExpressionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleGBooleanExpression1635); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGBooleanExpression"


    // $ANTLR start "ruleGBooleanExpression"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:800:1: ruleGBooleanExpression : ( ( rule__GBooleanExpression__Group__0 ) ) ;
    public final void ruleGBooleanExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:804:2: ( ( ( rule__GBooleanExpression__Group__0 ) ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:805:1: ( ( rule__GBooleanExpression__Group__0 ) )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:805:1: ( ( rule__GBooleanExpression__Group__0 ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:806:1: ( rule__GBooleanExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGBooleanExpressionAccess().getGroup()); 
            }
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:807:1: ( rule__GBooleanExpression__Group__0 )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:807:2: rule__GBooleanExpression__Group__0
            {
            pushFollow(FOLLOW_rule__GBooleanExpression__Group__0_in_ruleGBooleanExpression1661);
            rule__GBooleanExpression__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGBooleanExpressionAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGBooleanExpression"


    // $ANTLR start "entryRuleGNumericExpression"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:819:1: entryRuleGNumericExpression : ruleGNumericExpression EOF ;
    public final void entryRuleGNumericExpression() throws RecognitionException {
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:820:1: ( ruleGNumericExpression EOF )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:821:1: ruleGNumericExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGNumericExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleGNumericExpression_in_entryRuleGNumericExpression1688);
            ruleGNumericExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGNumericExpressionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleGNumericExpression1695); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGNumericExpression"


    // $ANTLR start "ruleGNumericExpression"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:828:1: ruleGNumericExpression : ( ( rule__GNumericExpression__Alternatives ) ) ;
    public final void ruleGNumericExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:832:2: ( ( ( rule__GNumericExpression__Alternatives ) ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:833:1: ( ( rule__GNumericExpression__Alternatives ) )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:833:1: ( ( rule__GNumericExpression__Alternatives ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:834:1: ( rule__GNumericExpression__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGNumericExpressionAccess().getAlternatives()); 
            }
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:835:1: ( rule__GNumericExpression__Alternatives )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:835:2: rule__GNumericExpression__Alternatives
            {
            pushFollow(FOLLOW_rule__GNumericExpression__Alternatives_in_ruleGNumericExpression1721);
            rule__GNumericExpression__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGNumericExpressionAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGNumericExpression"


    // $ANTLR start "entryRuleGIntegerExpression"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:847:1: entryRuleGIntegerExpression : ruleGIntegerExpression EOF ;
    public final void entryRuleGIntegerExpression() throws RecognitionException {
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:848:1: ( ruleGIntegerExpression EOF )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:849:1: ruleGIntegerExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGIntegerExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleGIntegerExpression_in_entryRuleGIntegerExpression1748);
            ruleGIntegerExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGIntegerExpressionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleGIntegerExpression1755); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGIntegerExpression"


    // $ANTLR start "ruleGIntegerExpression"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:856:1: ruleGIntegerExpression : ( ( rule__GIntegerExpression__Group__0 ) ) ;
    public final void ruleGIntegerExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:860:2: ( ( ( rule__GIntegerExpression__Group__0 ) ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:861:1: ( ( rule__GIntegerExpression__Group__0 ) )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:861:1: ( ( rule__GIntegerExpression__Group__0 ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:862:1: ( rule__GIntegerExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGIntegerExpressionAccess().getGroup()); 
            }
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:863:1: ( rule__GIntegerExpression__Group__0 )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:863:2: rule__GIntegerExpression__Group__0
            {
            pushFollow(FOLLOW_rule__GIntegerExpression__Group__0_in_ruleGIntegerExpression1781);
            rule__GIntegerExpression__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGIntegerExpressionAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGIntegerExpression"


    // $ANTLR start "entryRuleGDoubleExpression"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:875:1: entryRuleGDoubleExpression : ruleGDoubleExpression EOF ;
    public final void entryRuleGDoubleExpression() throws RecognitionException {
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:876:1: ( ruleGDoubleExpression EOF )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:877:1: ruleGDoubleExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGDoubleExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleGDoubleExpression_in_entryRuleGDoubleExpression1808);
            ruleGDoubleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGDoubleExpressionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleGDoubleExpression1815); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGDoubleExpression"


    // $ANTLR start "ruleGDoubleExpression"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:884:1: ruleGDoubleExpression : ( ( rule__GDoubleExpression__Group__0 ) ) ;
    public final void ruleGDoubleExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:888:2: ( ( ( rule__GDoubleExpression__Group__0 ) ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:889:1: ( ( rule__GDoubleExpression__Group__0 ) )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:889:1: ( ( rule__GDoubleExpression__Group__0 ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:890:1: ( rule__GDoubleExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGDoubleExpressionAccess().getGroup()); 
            }
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:891:1: ( rule__GDoubleExpression__Group__0 )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:891:2: rule__GDoubleExpression__Group__0
            {
            pushFollow(FOLLOW_rule__GDoubleExpression__Group__0_in_ruleGDoubleExpression1841);
            rule__GDoubleExpression__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGDoubleExpressionAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGDoubleExpression"


    // $ANTLR start "entryRuleGEnumLiteralExpression"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:903:1: entryRuleGEnumLiteralExpression : ruleGEnumLiteralExpression EOF ;
    public final void entryRuleGEnumLiteralExpression() throws RecognitionException {
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:904:1: ( ruleGEnumLiteralExpression EOF )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:905:1: ruleGEnumLiteralExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGEnumLiteralExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleGEnumLiteralExpression_in_entryRuleGEnumLiteralExpression1868);
            ruleGEnumLiteralExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGEnumLiteralExpressionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleGEnumLiteralExpression1875); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGEnumLiteralExpression"


    // $ANTLR start "ruleGEnumLiteralExpression"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:912:1: ruleGEnumLiteralExpression : ( ( rule__GEnumLiteralExpression__Group__0 ) ) ;
    public final void ruleGEnumLiteralExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:916:2: ( ( ( rule__GEnumLiteralExpression__Group__0 ) ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:917:1: ( ( rule__GEnumLiteralExpression__Group__0 ) )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:917:1: ( ( rule__GEnumLiteralExpression__Group__0 ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:918:1: ( rule__GEnumLiteralExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGEnumLiteralExpressionAccess().getGroup()); 
            }
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:919:1: ( rule__GEnumLiteralExpression__Group__0 )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:919:2: rule__GEnumLiteralExpression__Group__0
            {
            pushFollow(FOLLOW_rule__GEnumLiteralExpression__Group__0_in_ruleGEnumLiteralExpression1901);
            rule__GEnumLiteralExpression__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGEnumLiteralExpressionAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGEnumLiteralExpression"


    // $ANTLR start "entryRuleGIfExpression"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:931:1: entryRuleGIfExpression : ruleGIfExpression EOF ;
    public final void entryRuleGIfExpression() throws RecognitionException {
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:932:1: ( ruleGIfExpression EOF )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:933:1: ruleGIfExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGIfExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleGIfExpression_in_entryRuleGIfExpression1928);
            ruleGIfExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGIfExpressionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleGIfExpression1935); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGIfExpression"


    // $ANTLR start "ruleGIfExpression"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:940:1: ruleGIfExpression : ( ( rule__GIfExpression__Group__0 ) ) ;
    public final void ruleGIfExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:944:2: ( ( ( rule__GIfExpression__Group__0 ) ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:945:1: ( ( rule__GIfExpression__Group__0 ) )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:945:1: ( ( rule__GIfExpression__Group__0 ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:946:1: ( rule__GIfExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGIfExpressionAccess().getGroup()); 
            }
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:947:1: ( rule__GIfExpression__Group__0 )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:947:2: rule__GIfExpression__Group__0
            {
            pushFollow(FOLLOW_rule__GIfExpression__Group__0_in_ruleGIfExpression1961);
            rule__GIfExpression__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGIfExpressionAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGIfExpression"


    // $ANTLR start "entryRuleGBraceExpression"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:959:1: entryRuleGBraceExpression : ruleGBraceExpression EOF ;
    public final void entryRuleGBraceExpression() throws RecognitionException {
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:960:1: ( ruleGBraceExpression EOF )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:961:1: ruleGBraceExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGBraceExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleGBraceExpression_in_entryRuleGBraceExpression1988);
            ruleGBraceExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGBraceExpressionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleGBraceExpression1995); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGBraceExpression"


    // $ANTLR start "ruleGBraceExpression"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:968:1: ruleGBraceExpression : ( ( rule__GBraceExpression__Group__0 ) ) ;
    public final void ruleGBraceExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:972:2: ( ( ( rule__GBraceExpression__Group__0 ) ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:973:1: ( ( rule__GBraceExpression__Group__0 ) )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:973:1: ( ( rule__GBraceExpression__Group__0 ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:974:1: ( rule__GBraceExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGBraceExpressionAccess().getGroup()); 
            }
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:975:1: ( rule__GBraceExpression__Group__0 )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:975:2: rule__GBraceExpression__Group__0
            {
            pushFollow(FOLLOW_rule__GBraceExpression__Group__0_in_ruleGBraceExpression2021);
            rule__GBraceExpression__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGBraceExpressionAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGBraceExpression"


    // $ANTLR start "entryRuleNavigationOperator"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:987:1: entryRuleNavigationOperator : ruleNavigationOperator EOF ;
    public final void entryRuleNavigationOperator() throws RecognitionException {
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:988:1: ( ruleNavigationOperator EOF )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:989:1: ruleNavigationOperator EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNavigationOperatorRule()); 
            }
            pushFollow(FOLLOW_ruleNavigationOperator_in_entryRuleNavigationOperator2048);
            ruleNavigationOperator();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNavigationOperatorRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNavigationOperator2055); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNavigationOperator"


    // $ANTLR start "ruleNavigationOperator"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:996:1: ruleNavigationOperator : ( ( rule__NavigationOperator__Alternatives ) ) ;
    public final void ruleNavigationOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1000:2: ( ( ( rule__NavigationOperator__Alternatives ) ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1001:1: ( ( rule__NavigationOperator__Alternatives ) )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1001:1: ( ( rule__NavigationOperator__Alternatives ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1002:1: ( rule__NavigationOperator__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNavigationOperatorAccess().getAlternatives()); 
            }
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1003:1: ( rule__NavigationOperator__Alternatives )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1003:2: rule__NavigationOperator__Alternatives
            {
            pushFollow(FOLLOW_rule__NavigationOperator__Alternatives_in_ruleNavigationOperator2081);
            rule__NavigationOperator__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNavigationOperatorAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNavigationOperator"


    // $ANTLR start "entryRuleQualifiedName"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1015:1: entryRuleQualifiedName : ruleQualifiedName EOF ;
    public final void entryRuleQualifiedName() throws RecognitionException {
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1016:1: ( ruleQualifiedName EOF )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1017:1: ruleQualifiedName EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameRule()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName2108);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName2115); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1024:1: ruleQualifiedName : ( ( rule__QualifiedName__Group__0 ) ) ;
    public final void ruleQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1028:2: ( ( ( rule__QualifiedName__Group__0 ) ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1029:1: ( ( rule__QualifiedName__Group__0 ) )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1029:1: ( ( rule__QualifiedName__Group__0 ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1030:1: ( rule__QualifiedName__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getGroup()); 
            }
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1031:1: ( rule__QualifiedName__Group__0 )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1031:2: rule__QualifiedName__Group__0
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__0_in_ruleQualifiedName2141);
            rule__QualifiedName__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "ruleGAndOperator"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1044:1: ruleGAndOperator : ( ( 'and' ) ) ;
    public final void ruleGAndOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1048:1: ( ( ( 'and' ) ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1049:1: ( ( 'and' ) )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1049:1: ( ( 'and' ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1050:1: ( 'and' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGAndOperatorAccess().getANDEnumLiteralDeclaration()); 
            }
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1051:1: ( 'and' )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1051:3: 'and'
            {
            match(input,13,FOLLOW_13_in_ruleGAndOperator2179); if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGAndOperatorAccess().getANDEnumLiteralDeclaration()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGAndOperator"


    // $ANTLR start "ruleGXorOperator"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1064:1: ruleGXorOperator : ( ( 'xor' ) ) ;
    public final void ruleGXorOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1068:1: ( ( ( 'xor' ) ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1069:1: ( ( 'xor' ) )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1069:1: ( ( 'xor' ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1070:1: ( 'xor' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGXorOperatorAccess().getXOREnumLiteralDeclaration()); 
            }
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1071:1: ( 'xor' )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1071:3: 'xor'
            {
            match(input,14,FOLLOW_14_in_ruleGXorOperator2218); if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGXorOperatorAccess().getXOREnumLiteralDeclaration()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGXorOperator"


    // $ANTLR start "ruleGOrOperator"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1084:1: ruleGOrOperator : ( ( 'or' ) ) ;
    public final void ruleGOrOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1088:1: ( ( ( 'or' ) ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1089:1: ( ( 'or' ) )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1089:1: ( ( 'or' ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1090:1: ( 'or' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGOrOperatorAccess().getOREnumLiteralDeclaration()); 
            }
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1091:1: ( 'or' )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1091:3: 'or'
            {
            match(input,15,FOLLOW_15_in_ruleGOrOperator2257); if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGOrOperatorAccess().getOREnumLiteralDeclaration()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGOrOperator"


    // $ANTLR start "ruleGEqualityOperator"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1104:1: ruleGEqualityOperator : ( ( rule__GEqualityOperator__Alternatives ) ) ;
    public final void ruleGEqualityOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1108:1: ( ( ( rule__GEqualityOperator__Alternatives ) ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1109:1: ( ( rule__GEqualityOperator__Alternatives ) )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1109:1: ( ( rule__GEqualityOperator__Alternatives ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1110:1: ( rule__GEqualityOperator__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGEqualityOperatorAccess().getAlternatives()); 
            }
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1111:1: ( rule__GEqualityOperator__Alternatives )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1111:2: rule__GEqualityOperator__Alternatives
            {
            pushFollow(FOLLOW_rule__GEqualityOperator__Alternatives_in_ruleGEqualityOperator2295);
            rule__GEqualityOperator__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGEqualityOperatorAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGEqualityOperator"


    // $ANTLR start "ruleGRelationOperator"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1123:1: ruleGRelationOperator : ( ( rule__GRelationOperator__Alternatives ) ) ;
    public final void ruleGRelationOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1127:1: ( ( ( rule__GRelationOperator__Alternatives ) ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1128:1: ( ( rule__GRelationOperator__Alternatives ) )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1128:1: ( ( rule__GRelationOperator__Alternatives ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1129:1: ( rule__GRelationOperator__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGRelationOperatorAccess().getAlternatives()); 
            }
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1130:1: ( rule__GRelationOperator__Alternatives )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1130:2: rule__GRelationOperator__Alternatives
            {
            pushFollow(FOLLOW_rule__GRelationOperator__Alternatives_in_ruleGRelationOperator2331);
            rule__GRelationOperator__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGRelationOperatorAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGRelationOperator"


    // $ANTLR start "ruleGAdditionOperator"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1142:1: ruleGAdditionOperator : ( ( rule__GAdditionOperator__Alternatives ) ) ;
    public final void ruleGAdditionOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1146:1: ( ( ( rule__GAdditionOperator__Alternatives ) ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1147:1: ( ( rule__GAdditionOperator__Alternatives ) )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1147:1: ( ( rule__GAdditionOperator__Alternatives ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1148:1: ( rule__GAdditionOperator__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGAdditionOperatorAccess().getAlternatives()); 
            }
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1149:1: ( rule__GAdditionOperator__Alternatives )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1149:2: rule__GAdditionOperator__Alternatives
            {
            pushFollow(FOLLOW_rule__GAdditionOperator__Alternatives_in_ruleGAdditionOperator2367);
            rule__GAdditionOperator__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGAdditionOperatorAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGAdditionOperator"


    // $ANTLR start "ruleGMultiplicationOperator"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1161:1: ruleGMultiplicationOperator : ( ( rule__GMultiplicationOperator__Alternatives ) ) ;
    public final void ruleGMultiplicationOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1165:1: ( ( ( rule__GMultiplicationOperator__Alternatives ) ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1166:1: ( ( rule__GMultiplicationOperator__Alternatives ) )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1166:1: ( ( rule__GMultiplicationOperator__Alternatives ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1167:1: ( rule__GMultiplicationOperator__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGMultiplicationOperatorAccess().getAlternatives()); 
            }
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1168:1: ( rule__GMultiplicationOperator__Alternatives )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1168:2: rule__GMultiplicationOperator__Alternatives
            {
            pushFollow(FOLLOW_rule__GMultiplicationOperator__Alternatives_in_ruleGMultiplicationOperator2403);
            rule__GMultiplicationOperator__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGMultiplicationOperatorAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGMultiplicationOperator"


    // $ANTLR start "ruleGNegationOperator"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1180:1: ruleGNegationOperator : ( ( rule__GNegationOperator__Alternatives ) ) ;
    public final void ruleGNegationOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1184:1: ( ( ( rule__GNegationOperator__Alternatives ) ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1185:1: ( ( rule__GNegationOperator__Alternatives ) )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1185:1: ( ( rule__GNegationOperator__Alternatives ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1186:1: ( rule__GNegationOperator__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGNegationOperatorAccess().getAlternatives()); 
            }
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1187:1: ( rule__GNegationOperator__Alternatives )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1187:2: rule__GNegationOperator__Alternatives
            {
            pushFollow(FOLLOW_rule__GNegationOperator__Alternatives_in_ruleGNegationOperator2439);
            rule__GNegationOperator__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGNegationOperatorAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGNegationOperator"


    // $ANTLR start "rule__GNegationExpression__Alternatives"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1198:1: rule__GNegationExpression__Alternatives : ( ( ruleGNavigationExpression ) | ( ( rule__GNegationExpression__Group_1__0 ) ) );
    public final void rule__GNegationExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1202:1: ( ( ruleGNavigationExpression ) | ( ( rule__GNegationExpression__Group_1__0 ) ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( ((LA1_0>=RULE_ID && LA1_0<=RULE_DOUBLE)||LA1_0==35||(LA1_0>=49 && LA1_0<=50)) ) {
                alt1=1;
            }
            else if ( ((LA1_0>=28 && LA1_0<=29)) ) {
                alt1=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1203:1: ( ruleGNavigationExpression )
                    {
                    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1203:1: ( ruleGNavigationExpression )
                    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1204:1: ruleGNavigationExpression
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getGNegationExpressionAccess().getGNavigationExpressionParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_ruleGNavigationExpression_in_rule__GNegationExpression__Alternatives2474);
                    ruleGNavigationExpression();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getGNegationExpressionAccess().getGNavigationExpressionParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1209:6: ( ( rule__GNegationExpression__Group_1__0 ) )
                    {
                    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1209:6: ( ( rule__GNegationExpression__Group_1__0 ) )
                    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1210:1: ( rule__GNegationExpression__Group_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getGNegationExpressionAccess().getGroup_1()); 
                    }
                    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1211:1: ( rule__GNegationExpression__Group_1__0 )
                    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1211:2: rule__GNegationExpression__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__GNegationExpression__Group_1__0_in_rule__GNegationExpression__Alternatives2491);
                    rule__GNegationExpression__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getGNegationExpressionAccess().getGroup_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GNegationExpression__Alternatives"


    // $ANTLR start "rule__GReferenceExpression__Alternatives"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1220:1: rule__GReferenceExpression__Alternatives : ( ( ruleGPrimaryExpression ) | ( ( rule__GReferenceExpression__Group_1__0 ) ) );
    public final void rule__GReferenceExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1224:1: ( ( ruleGPrimaryExpression ) | ( ( rule__GReferenceExpression__Group_1__0 ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( ((LA2_0>=RULE_STRING && LA2_0<=RULE_DOUBLE)||LA2_0==35||(LA2_0>=49 && LA2_0<=50)) ) {
                alt2=1;
            }
            else if ( (LA2_0==RULE_ID) ) {
                alt2=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1225:1: ( ruleGPrimaryExpression )
                    {
                    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1225:1: ( ruleGPrimaryExpression )
                    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1226:1: ruleGPrimaryExpression
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getGReferenceExpressionAccess().getGPrimaryExpressionParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_ruleGPrimaryExpression_in_rule__GReferenceExpression__Alternatives2524);
                    ruleGPrimaryExpression();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getGReferenceExpressionAccess().getGPrimaryExpressionParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1231:6: ( ( rule__GReferenceExpression__Group_1__0 ) )
                    {
                    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1231:6: ( ( rule__GReferenceExpression__Group_1__0 ) )
                    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1232:1: ( rule__GReferenceExpression__Group_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getGReferenceExpressionAccess().getGroup_1()); 
                    }
                    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1233:1: ( rule__GReferenceExpression__Group_1__0 )
                    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1233:2: rule__GReferenceExpression__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__GReferenceExpression__Group_1__0_in_rule__GReferenceExpression__Alternatives2541);
                    rule__GReferenceExpression__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getGReferenceExpressionAccess().getGroup_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GReferenceExpression__Alternatives"


    // $ANTLR start "rule__GPrimaryExpression__Alternatives"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1242:1: rule__GPrimaryExpression__Alternatives : ( ( ruleGStringExpression ) | ( ruleGBooleanExpression ) | ( ruleGNumericExpression ) | ( ruleGEnumLiteralExpression ) | ( ruleGIfExpression ) | ( ruleGBraceExpression ) );
    public final void rule__GPrimaryExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1246:1: ( ( ruleGStringExpression ) | ( ruleGBooleanExpression ) | ( ruleGNumericExpression ) | ( ruleGEnumLiteralExpression ) | ( ruleGIfExpression ) | ( ruleGBraceExpression ) )
            int alt3=6;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt3=1;
                }
                break;
            case RULE_BOOLEAN:
                {
                alt3=2;
                }
                break;
            case RULE_INT:
            case RULE_DOUBLE:
                {
                alt3=3;
                }
                break;
            case 49:
                {
                alt3=4;
                }
                break;
            case 50:
                {
                alt3=5;
                }
                break;
            case 35:
                {
                alt3=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1247:1: ( ruleGStringExpression )
                    {
                    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1247:1: ( ruleGStringExpression )
                    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1248:1: ruleGStringExpression
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getGPrimaryExpressionAccess().getGStringExpressionParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_ruleGStringExpression_in_rule__GPrimaryExpression__Alternatives2574);
                    ruleGStringExpression();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getGPrimaryExpressionAccess().getGStringExpressionParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1253:6: ( ruleGBooleanExpression )
                    {
                    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1253:6: ( ruleGBooleanExpression )
                    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1254:1: ruleGBooleanExpression
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getGPrimaryExpressionAccess().getGBooleanExpressionParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_ruleGBooleanExpression_in_rule__GPrimaryExpression__Alternatives2591);
                    ruleGBooleanExpression();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getGPrimaryExpressionAccess().getGBooleanExpressionParserRuleCall_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1259:6: ( ruleGNumericExpression )
                    {
                    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1259:6: ( ruleGNumericExpression )
                    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1260:1: ruleGNumericExpression
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getGPrimaryExpressionAccess().getGNumericExpressionParserRuleCall_2()); 
                    }
                    pushFollow(FOLLOW_ruleGNumericExpression_in_rule__GPrimaryExpression__Alternatives2608);
                    ruleGNumericExpression();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getGPrimaryExpressionAccess().getGNumericExpressionParserRuleCall_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1265:6: ( ruleGEnumLiteralExpression )
                    {
                    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1265:6: ( ruleGEnumLiteralExpression )
                    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1266:1: ruleGEnumLiteralExpression
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getGPrimaryExpressionAccess().getGEnumLiteralExpressionParserRuleCall_3()); 
                    }
                    pushFollow(FOLLOW_ruleGEnumLiteralExpression_in_rule__GPrimaryExpression__Alternatives2625);
                    ruleGEnumLiteralExpression();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getGPrimaryExpressionAccess().getGEnumLiteralExpressionParserRuleCall_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1271:6: ( ruleGIfExpression )
                    {
                    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1271:6: ( ruleGIfExpression )
                    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1272:1: ruleGIfExpression
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getGPrimaryExpressionAccess().getGIfExpressionParserRuleCall_4()); 
                    }
                    pushFollow(FOLLOW_ruleGIfExpression_in_rule__GPrimaryExpression__Alternatives2642);
                    ruleGIfExpression();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getGPrimaryExpressionAccess().getGIfExpressionParserRuleCall_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1277:6: ( ruleGBraceExpression )
                    {
                    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1277:6: ( ruleGBraceExpression )
                    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1278:1: ruleGBraceExpression
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getGPrimaryExpressionAccess().getGBraceExpressionParserRuleCall_5()); 
                    }
                    pushFollow(FOLLOW_ruleGBraceExpression_in_rule__GPrimaryExpression__Alternatives2659);
                    ruleGBraceExpression();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getGPrimaryExpressionAccess().getGBraceExpressionParserRuleCall_5()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GPrimaryExpression__Alternatives"


    // $ANTLR start "rule__GNumericExpression__Alternatives"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1288:1: rule__GNumericExpression__Alternatives : ( ( ruleGIntegerExpression ) | ( ruleGDoubleExpression ) );
    public final void rule__GNumericExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1292:1: ( ( ruleGIntegerExpression ) | ( ruleGDoubleExpression ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_INT) ) {
                alt4=1;
            }
            else if ( (LA4_0==RULE_DOUBLE) ) {
                alt4=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1293:1: ( ruleGIntegerExpression )
                    {
                    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1293:1: ( ruleGIntegerExpression )
                    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1294:1: ruleGIntegerExpression
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getGNumericExpressionAccess().getGIntegerExpressionParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_ruleGIntegerExpression_in_rule__GNumericExpression__Alternatives2691);
                    ruleGIntegerExpression();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getGNumericExpressionAccess().getGIntegerExpressionParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1299:6: ( ruleGDoubleExpression )
                    {
                    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1299:6: ( ruleGDoubleExpression )
                    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1300:1: ruleGDoubleExpression
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getGNumericExpressionAccess().getGDoubleExpressionParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_ruleGDoubleExpression_in_rule__GNumericExpression__Alternatives2708);
                    ruleGDoubleExpression();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getGNumericExpressionAccess().getGDoubleExpressionParserRuleCall_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GNumericExpression__Alternatives"


    // $ANTLR start "rule__NavigationOperator__Alternatives"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1310:1: rule__NavigationOperator__Alternatives : ( ( '.' ) | ( '->' ) );
    public final void rule__NavigationOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1314:1: ( ( '.' ) | ( '->' ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==16) ) {
                alt5=1;
            }
            else if ( (LA5_0==17) ) {
                alt5=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1315:1: ( '.' )
                    {
                    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1315:1: ( '.' )
                    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1316:1: '.'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getNavigationOperatorAccess().getFullStopKeyword_0()); 
                    }
                    match(input,16,FOLLOW_16_in_rule__NavigationOperator__Alternatives2741); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getNavigationOperatorAccess().getFullStopKeyword_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1323:6: ( '->' )
                    {
                    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1323:6: ( '->' )
                    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1324:1: '->'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getNavigationOperatorAccess().getHyphenMinusGreaterThanSignKeyword_1()); 
                    }
                    match(input,17,FOLLOW_17_in_rule__NavigationOperator__Alternatives2761); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getNavigationOperatorAccess().getHyphenMinusGreaterThanSignKeyword_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NavigationOperator__Alternatives"


    // $ANTLR start "rule__GEqualityOperator__Alternatives"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1336:1: rule__GEqualityOperator__Alternatives : ( ( ( '=' ) ) | ( ( '<>' ) ) );
    public final void rule__GEqualityOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1340:1: ( ( ( '=' ) ) | ( ( '<>' ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==18) ) {
                alt6=1;
            }
            else if ( (LA6_0==19) ) {
                alt6=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1341:1: ( ( '=' ) )
                    {
                    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1341:1: ( ( '=' ) )
                    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1342:1: ( '=' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getGEqualityOperatorAccess().getEQUALEnumLiteralDeclaration_0()); 
                    }
                    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1343:1: ( '=' )
                    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1343:3: '='
                    {
                    match(input,18,FOLLOW_18_in_rule__GEqualityOperator__Alternatives2796); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getGEqualityOperatorAccess().getEQUALEnumLiteralDeclaration_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1348:6: ( ( '<>' ) )
                    {
                    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1348:6: ( ( '<>' ) )
                    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1349:1: ( '<>' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getGEqualityOperatorAccess().getNOTEQUALEnumLiteralDeclaration_1()); 
                    }
                    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1350:1: ( '<>' )
                    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1350:3: '<>'
                    {
                    match(input,19,FOLLOW_19_in_rule__GEqualityOperator__Alternatives2817); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getGEqualityOperatorAccess().getNOTEQUALEnumLiteralDeclaration_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GEqualityOperator__Alternatives"


    // $ANTLR start "rule__GRelationOperator__Alternatives"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1360:1: rule__GRelationOperator__Alternatives : ( ( ( '<' ) ) | ( ( '>' ) ) | ( ( '<=' ) ) | ( ( '>=' ) ) );
    public final void rule__GRelationOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1364:1: ( ( ( '<' ) ) | ( ( '>' ) ) | ( ( '<=' ) ) | ( ( '>=' ) ) )
            int alt7=4;
            switch ( input.LA(1) ) {
            case 20:
                {
                alt7=1;
                }
                break;
            case 21:
                {
                alt7=2;
                }
                break;
            case 22:
                {
                alt7=3;
                }
                break;
            case 23:
                {
                alt7=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1365:1: ( ( '<' ) )
                    {
                    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1365:1: ( ( '<' ) )
                    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1366:1: ( '<' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getGRelationOperatorAccess().getLESSEnumLiteralDeclaration_0()); 
                    }
                    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1367:1: ( '<' )
                    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1367:3: '<'
                    {
                    match(input,20,FOLLOW_20_in_rule__GRelationOperator__Alternatives2853); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getGRelationOperatorAccess().getLESSEnumLiteralDeclaration_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1372:6: ( ( '>' ) )
                    {
                    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1372:6: ( ( '>' ) )
                    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1373:1: ( '>' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getGRelationOperatorAccess().getGREATEREnumLiteralDeclaration_1()); 
                    }
                    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1374:1: ( '>' )
                    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1374:3: '>'
                    {
                    match(input,21,FOLLOW_21_in_rule__GRelationOperator__Alternatives2874); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getGRelationOperatorAccess().getGREATEREnumLiteralDeclaration_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1379:6: ( ( '<=' ) )
                    {
                    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1379:6: ( ( '<=' ) )
                    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1380:1: ( '<=' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getGRelationOperatorAccess().getLESSEQUALEnumLiteralDeclaration_2()); 
                    }
                    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1381:1: ( '<=' )
                    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1381:3: '<='
                    {
                    match(input,22,FOLLOW_22_in_rule__GRelationOperator__Alternatives2895); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getGRelationOperatorAccess().getLESSEQUALEnumLiteralDeclaration_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1386:6: ( ( '>=' ) )
                    {
                    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1386:6: ( ( '>=' ) )
                    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1387:1: ( '>=' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getGRelationOperatorAccess().getGREATEREQUALEnumLiteralDeclaration_3()); 
                    }
                    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1388:1: ( '>=' )
                    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1388:3: '>='
                    {
                    match(input,23,FOLLOW_23_in_rule__GRelationOperator__Alternatives2916); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getGRelationOperatorAccess().getGREATEREQUALEnumLiteralDeclaration_3()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GRelationOperator__Alternatives"


    // $ANTLR start "rule__GAdditionOperator__Alternatives"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1398:1: rule__GAdditionOperator__Alternatives : ( ( ( '+' ) ) | ( ( '-' ) ) );
    public final void rule__GAdditionOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1402:1: ( ( ( '+' ) ) | ( ( '-' ) ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==24) ) {
                alt8=1;
            }
            else if ( (LA8_0==25) ) {
                alt8=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1403:1: ( ( '+' ) )
                    {
                    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1403:1: ( ( '+' ) )
                    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1404:1: ( '+' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getGAdditionOperatorAccess().getADDITIONEnumLiteralDeclaration_0()); 
                    }
                    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1405:1: ( '+' )
                    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1405:3: '+'
                    {
                    match(input,24,FOLLOW_24_in_rule__GAdditionOperator__Alternatives2952); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getGAdditionOperatorAccess().getADDITIONEnumLiteralDeclaration_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1410:6: ( ( '-' ) )
                    {
                    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1410:6: ( ( '-' ) )
                    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1411:1: ( '-' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getGAdditionOperatorAccess().getSUBTRACTIONEnumLiteralDeclaration_1()); 
                    }
                    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1412:1: ( '-' )
                    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1412:3: '-'
                    {
                    match(input,25,FOLLOW_25_in_rule__GAdditionOperator__Alternatives2973); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getGAdditionOperatorAccess().getSUBTRACTIONEnumLiteralDeclaration_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GAdditionOperator__Alternatives"


    // $ANTLR start "rule__GMultiplicationOperator__Alternatives"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1422:1: rule__GMultiplicationOperator__Alternatives : ( ( ( '*' ) ) | ( ( '/' ) ) );
    public final void rule__GMultiplicationOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1426:1: ( ( ( '*' ) ) | ( ( '/' ) ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==26) ) {
                alt9=1;
            }
            else if ( (LA9_0==27) ) {
                alt9=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1427:1: ( ( '*' ) )
                    {
                    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1427:1: ( ( '*' ) )
                    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1428:1: ( '*' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getGMultiplicationOperatorAccess().getMULTIPLICATIONEnumLiteralDeclaration_0()); 
                    }
                    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1429:1: ( '*' )
                    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1429:3: '*'
                    {
                    match(input,26,FOLLOW_26_in_rule__GMultiplicationOperator__Alternatives3009); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getGMultiplicationOperatorAccess().getMULTIPLICATIONEnumLiteralDeclaration_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1434:6: ( ( '/' ) )
                    {
                    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1434:6: ( ( '/' ) )
                    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1435:1: ( '/' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getGMultiplicationOperatorAccess().getDIVISIONEnumLiteralDeclaration_1()); 
                    }
                    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1436:1: ( '/' )
                    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1436:3: '/'
                    {
                    match(input,27,FOLLOW_27_in_rule__GMultiplicationOperator__Alternatives3030); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getGMultiplicationOperatorAccess().getDIVISIONEnumLiteralDeclaration_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GMultiplicationOperator__Alternatives"


    // $ANTLR start "rule__GNegationOperator__Alternatives"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1446:1: rule__GNegationOperator__Alternatives : ( ( ( 'not' ) ) | ( ( '~' ) ) );
    public final void rule__GNegationOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1450:1: ( ( ( 'not' ) ) | ( ( '~' ) ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==28) ) {
                alt10=1;
            }
            else if ( (LA10_0==29) ) {
                alt10=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1451:1: ( ( 'not' ) )
                    {
                    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1451:1: ( ( 'not' ) )
                    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1452:1: ( 'not' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getGNegationOperatorAccess().getNEGATIONEnumLiteralDeclaration_0()); 
                    }
                    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1453:1: ( 'not' )
                    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1453:3: 'not'
                    {
                    match(input,28,FOLLOW_28_in_rule__GNegationOperator__Alternatives3066); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getGNegationOperatorAccess().getNEGATIONEnumLiteralDeclaration_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1458:6: ( ( '~' ) )
                    {
                    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1458:6: ( ( '~' ) )
                    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1459:1: ( '~' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getGNegationOperatorAccess().getMINUSEnumLiteralDeclaration_1()); 
                    }
                    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1460:1: ( '~' )
                    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1460:3: '~'
                    {
                    match(input,29,FOLLOW_29_in_rule__GNegationOperator__Alternatives3087); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getGNegationOperatorAccess().getMINUSEnumLiteralDeclaration_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GNegationOperator__Alternatives"


    // $ANTLR start "rule__BCoolSpec__Group__0"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1472:1: rule__BCoolSpec__Group__0 : rule__BCoolSpec__Group__0__Impl rule__BCoolSpec__Group__1 ;
    public final void rule__BCoolSpec__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1476:1: ( rule__BCoolSpec__Group__0__Impl rule__BCoolSpec__Group__1 )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1477:2: rule__BCoolSpec__Group__0__Impl rule__BCoolSpec__Group__1
            {
            pushFollow(FOLLOW_rule__BCoolSpec__Group__0__Impl_in_rule__BCoolSpec__Group__03120);
            rule__BCoolSpec__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__BCoolSpec__Group__1_in_rule__BCoolSpec__Group__03123);
            rule__BCoolSpec__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BCoolSpec__Group__0"


    // $ANTLR start "rule__BCoolSpec__Group__0__Impl"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1484:1: rule__BCoolSpec__Group__0__Impl : ( ( rule__BCoolSpec__NameAssignment_0 )? ) ;
    public final void rule__BCoolSpec__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1488:1: ( ( ( rule__BCoolSpec__NameAssignment_0 )? ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1489:1: ( ( rule__BCoolSpec__NameAssignment_0 )? )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1489:1: ( ( rule__BCoolSpec__NameAssignment_0 )? )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1490:1: ( rule__BCoolSpec__NameAssignment_0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBCoolSpecAccess().getNameAssignment_0()); 
            }
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1491:1: ( rule__BCoolSpec__NameAssignment_0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_ID) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1491:2: rule__BCoolSpec__NameAssignment_0
                    {
                    pushFollow(FOLLOW_rule__BCoolSpec__NameAssignment_0_in_rule__BCoolSpec__Group__0__Impl3150);
                    rule__BCoolSpec__NameAssignment_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBCoolSpecAccess().getNameAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BCoolSpec__Group__0__Impl"


    // $ANTLR start "rule__BCoolSpec__Group__1"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1501:1: rule__BCoolSpec__Group__1 : rule__BCoolSpec__Group__1__Impl rule__BCoolSpec__Group__2 ;
    public final void rule__BCoolSpec__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1505:1: ( rule__BCoolSpec__Group__1__Impl rule__BCoolSpec__Group__2 )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1506:2: rule__BCoolSpec__Group__1__Impl rule__BCoolSpec__Group__2
            {
            pushFollow(FOLLOW_rule__BCoolSpec__Group__1__Impl_in_rule__BCoolSpec__Group__13181);
            rule__BCoolSpec__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__BCoolSpec__Group__2_in_rule__BCoolSpec__Group__13184);
            rule__BCoolSpec__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BCoolSpec__Group__1"


    // $ANTLR start "rule__BCoolSpec__Group__1__Impl"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1513:1: rule__BCoolSpec__Group__1__Impl : ( ( ( rule__BCoolSpec__ImportsLibAssignment_1 ) ) ( ( rule__BCoolSpec__ImportsLibAssignment_1 )* ) ) ;
    public final void rule__BCoolSpec__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1517:1: ( ( ( ( rule__BCoolSpec__ImportsLibAssignment_1 ) ) ( ( rule__BCoolSpec__ImportsLibAssignment_1 )* ) ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1518:1: ( ( ( rule__BCoolSpec__ImportsLibAssignment_1 ) ) ( ( rule__BCoolSpec__ImportsLibAssignment_1 )* ) )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1518:1: ( ( ( rule__BCoolSpec__ImportsLibAssignment_1 ) ) ( ( rule__BCoolSpec__ImportsLibAssignment_1 )* ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1519:1: ( ( rule__BCoolSpec__ImportsLibAssignment_1 ) ) ( ( rule__BCoolSpec__ImportsLibAssignment_1 )* )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1519:1: ( ( rule__BCoolSpec__ImportsLibAssignment_1 ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1520:1: ( rule__BCoolSpec__ImportsLibAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBCoolSpecAccess().getImportsLibAssignment_1()); 
            }
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1521:1: ( rule__BCoolSpec__ImportsLibAssignment_1 )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1521:2: rule__BCoolSpec__ImportsLibAssignment_1
            {
            pushFollow(FOLLOW_rule__BCoolSpec__ImportsLibAssignment_1_in_rule__BCoolSpec__Group__1__Impl3213);
            rule__BCoolSpec__ImportsLibAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBCoolSpecAccess().getImportsLibAssignment_1()); 
            }

            }

            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1524:1: ( ( rule__BCoolSpec__ImportsLibAssignment_1 )* )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1525:1: ( rule__BCoolSpec__ImportsLibAssignment_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBCoolSpecAccess().getImportsLibAssignment_1()); 
            }
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1526:1: ( rule__BCoolSpec__ImportsLibAssignment_1 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==45) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1526:2: rule__BCoolSpec__ImportsLibAssignment_1
            	    {
            	    pushFollow(FOLLOW_rule__BCoolSpec__ImportsLibAssignment_1_in_rule__BCoolSpec__Group__1__Impl3225);
            	    rule__BCoolSpec__ImportsLibAssignment_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBCoolSpecAccess().getImportsLibAssignment_1()); 
            }

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BCoolSpec__Group__1__Impl"


    // $ANTLR start "rule__BCoolSpec__Group__2"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1537:1: rule__BCoolSpec__Group__2 : rule__BCoolSpec__Group__2__Impl rule__BCoolSpec__Group__3 ;
    public final void rule__BCoolSpec__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1541:1: ( rule__BCoolSpec__Group__2__Impl rule__BCoolSpec__Group__3 )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1542:2: rule__BCoolSpec__Group__2__Impl rule__BCoolSpec__Group__3
            {
            pushFollow(FOLLOW_rule__BCoolSpec__Group__2__Impl_in_rule__BCoolSpec__Group__23258);
            rule__BCoolSpec__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__BCoolSpec__Group__3_in_rule__BCoolSpec__Group__23261);
            rule__BCoolSpec__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BCoolSpec__Group__2"


    // $ANTLR start "rule__BCoolSpec__Group__2__Impl"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1549:1: rule__BCoolSpec__Group__2__Impl : ( ( ( rule__BCoolSpec__ImportsBehavioralInterfaceAssignment_2 ) ) ( ( rule__BCoolSpec__ImportsBehavioralInterfaceAssignment_2 )* ) ) ;
    public final void rule__BCoolSpec__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1553:1: ( ( ( ( rule__BCoolSpec__ImportsBehavioralInterfaceAssignment_2 ) ) ( ( rule__BCoolSpec__ImportsBehavioralInterfaceAssignment_2 )* ) ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1554:1: ( ( ( rule__BCoolSpec__ImportsBehavioralInterfaceAssignment_2 ) ) ( ( rule__BCoolSpec__ImportsBehavioralInterfaceAssignment_2 )* ) )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1554:1: ( ( ( rule__BCoolSpec__ImportsBehavioralInterfaceAssignment_2 ) ) ( ( rule__BCoolSpec__ImportsBehavioralInterfaceAssignment_2 )* ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1555:1: ( ( rule__BCoolSpec__ImportsBehavioralInterfaceAssignment_2 ) ) ( ( rule__BCoolSpec__ImportsBehavioralInterfaceAssignment_2 )* )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1555:1: ( ( rule__BCoolSpec__ImportsBehavioralInterfaceAssignment_2 ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1556:1: ( rule__BCoolSpec__ImportsBehavioralInterfaceAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBCoolSpecAccess().getImportsBehavioralInterfaceAssignment_2()); 
            }
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1557:1: ( rule__BCoolSpec__ImportsBehavioralInterfaceAssignment_2 )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1557:2: rule__BCoolSpec__ImportsBehavioralInterfaceAssignment_2
            {
            pushFollow(FOLLOW_rule__BCoolSpec__ImportsBehavioralInterfaceAssignment_2_in_rule__BCoolSpec__Group__2__Impl3290);
            rule__BCoolSpec__ImportsBehavioralInterfaceAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBCoolSpecAccess().getImportsBehavioralInterfaceAssignment_2()); 
            }

            }

            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1560:1: ( ( rule__BCoolSpec__ImportsBehavioralInterfaceAssignment_2 )* )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1561:1: ( rule__BCoolSpec__ImportsBehavioralInterfaceAssignment_2 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBCoolSpecAccess().getImportsBehavioralInterfaceAssignment_2()); 
            }
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1562:1: ( rule__BCoolSpec__ImportsBehavioralInterfaceAssignment_2 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==46) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1562:2: rule__BCoolSpec__ImportsBehavioralInterfaceAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__BCoolSpec__ImportsBehavioralInterfaceAssignment_2_in_rule__BCoolSpec__Group__2__Impl3302);
            	    rule__BCoolSpec__ImportsBehavioralInterfaceAssignment_2();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBCoolSpecAccess().getImportsBehavioralInterfaceAssignment_2()); 
            }

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BCoolSpec__Group__2__Impl"


    // $ANTLR start "rule__BCoolSpec__Group__3"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1573:1: rule__BCoolSpec__Group__3 : rule__BCoolSpec__Group__3__Impl ;
    public final void rule__BCoolSpec__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1577:1: ( rule__BCoolSpec__Group__3__Impl )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1578:2: rule__BCoolSpec__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__BCoolSpec__Group__3__Impl_in_rule__BCoolSpec__Group__33335);
            rule__BCoolSpec__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BCoolSpec__Group__3"


    // $ANTLR start "rule__BCoolSpec__Group__3__Impl"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1584:1: rule__BCoolSpec__Group__3__Impl : ( ( ( rule__BCoolSpec__BcoolOperatorsAssignment_3 ) ) ( ( rule__BCoolSpec__BcoolOperatorsAssignment_3 )* ) ) ;
    public final void rule__BCoolSpec__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1588:1: ( ( ( ( rule__BCoolSpec__BcoolOperatorsAssignment_3 ) ) ( ( rule__BCoolSpec__BcoolOperatorsAssignment_3 )* ) ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1589:1: ( ( ( rule__BCoolSpec__BcoolOperatorsAssignment_3 ) ) ( ( rule__BCoolSpec__BcoolOperatorsAssignment_3 )* ) )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1589:1: ( ( ( rule__BCoolSpec__BcoolOperatorsAssignment_3 ) ) ( ( rule__BCoolSpec__BcoolOperatorsAssignment_3 )* ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1590:1: ( ( rule__BCoolSpec__BcoolOperatorsAssignment_3 ) ) ( ( rule__BCoolSpec__BcoolOperatorsAssignment_3 )* )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1590:1: ( ( rule__BCoolSpec__BcoolOperatorsAssignment_3 ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1591:1: ( rule__BCoolSpec__BcoolOperatorsAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBCoolSpecAccess().getBcoolOperatorsAssignment_3()); 
            }
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1592:1: ( rule__BCoolSpec__BcoolOperatorsAssignment_3 )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1592:2: rule__BCoolSpec__BcoolOperatorsAssignment_3
            {
            pushFollow(FOLLOW_rule__BCoolSpec__BcoolOperatorsAssignment_3_in_rule__BCoolSpec__Group__3__Impl3364);
            rule__BCoolSpec__BcoolOperatorsAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBCoolSpecAccess().getBcoolOperatorsAssignment_3()); 
            }

            }

            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1595:1: ( ( rule__BCoolSpec__BcoolOperatorsAssignment_3 )* )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1596:1: ( rule__BCoolSpec__BcoolOperatorsAssignment_3 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBCoolSpecAccess().getBcoolOperatorsAssignment_3()); 
            }
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1597:1: ( rule__BCoolSpec__BcoolOperatorsAssignment_3 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==30) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1597:2: rule__BCoolSpec__BcoolOperatorsAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__BCoolSpec__BcoolOperatorsAssignment_3_in_rule__BCoolSpec__Group__3__Impl3376);
            	    rule__BCoolSpec__BcoolOperatorsAssignment_3();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBCoolSpecAccess().getBcoolOperatorsAssignment_3()); 
            }

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BCoolSpec__Group__3__Impl"


    // $ANTLR start "rule__BCoolOperatorSpec__Group__0"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1616:1: rule__BCoolOperatorSpec__Group__0 : rule__BCoolOperatorSpec__Group__0__Impl rule__BCoolOperatorSpec__Group__1 ;
    public final void rule__BCoolOperatorSpec__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1620:1: ( rule__BCoolOperatorSpec__Group__0__Impl rule__BCoolOperatorSpec__Group__1 )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1621:2: rule__BCoolOperatorSpec__Group__0__Impl rule__BCoolOperatorSpec__Group__1
            {
            pushFollow(FOLLOW_rule__BCoolOperatorSpec__Group__0__Impl_in_rule__BCoolOperatorSpec__Group__03417);
            rule__BCoolOperatorSpec__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__BCoolOperatorSpec__Group__1_in_rule__BCoolOperatorSpec__Group__03420);
            rule__BCoolOperatorSpec__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BCoolOperatorSpec__Group__0"


    // $ANTLR start "rule__BCoolOperatorSpec__Group__0__Impl"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1628:1: rule__BCoolOperatorSpec__Group__0__Impl : ( 'Spec' ) ;
    public final void rule__BCoolOperatorSpec__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1632:1: ( ( 'Spec' ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1633:1: ( 'Spec' )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1633:1: ( 'Spec' )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1634:1: 'Spec'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBCoolOperatorSpecAccess().getSpecKeyword_0()); 
            }
            match(input,30,FOLLOW_30_in_rule__BCoolOperatorSpec__Group__0__Impl3448); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBCoolOperatorSpecAccess().getSpecKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BCoolOperatorSpec__Group__0__Impl"


    // $ANTLR start "rule__BCoolOperatorSpec__Group__1"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1647:1: rule__BCoolOperatorSpec__Group__1 : rule__BCoolOperatorSpec__Group__1__Impl rule__BCoolOperatorSpec__Group__2 ;
    public final void rule__BCoolOperatorSpec__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1651:1: ( rule__BCoolOperatorSpec__Group__1__Impl rule__BCoolOperatorSpec__Group__2 )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1652:2: rule__BCoolOperatorSpec__Group__1__Impl rule__BCoolOperatorSpec__Group__2
            {
            pushFollow(FOLLOW_rule__BCoolOperatorSpec__Group__1__Impl_in_rule__BCoolOperatorSpec__Group__13479);
            rule__BCoolOperatorSpec__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__BCoolOperatorSpec__Group__2_in_rule__BCoolOperatorSpec__Group__13482);
            rule__BCoolOperatorSpec__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BCoolOperatorSpec__Group__1"


    // $ANTLR start "rule__BCoolOperatorSpec__Group__1__Impl"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1659:1: rule__BCoolOperatorSpec__Group__1__Impl : ( ( rule__BCoolOperatorSpec__NameAssignment_1 ) ) ;
    public final void rule__BCoolOperatorSpec__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1663:1: ( ( ( rule__BCoolOperatorSpec__NameAssignment_1 ) ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1664:1: ( ( rule__BCoolOperatorSpec__NameAssignment_1 ) )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1664:1: ( ( rule__BCoolOperatorSpec__NameAssignment_1 ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1665:1: ( rule__BCoolOperatorSpec__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBCoolOperatorSpecAccess().getNameAssignment_1()); 
            }
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1666:1: ( rule__BCoolOperatorSpec__NameAssignment_1 )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1666:2: rule__BCoolOperatorSpec__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__BCoolOperatorSpec__NameAssignment_1_in_rule__BCoolOperatorSpec__Group__1__Impl3509);
            rule__BCoolOperatorSpec__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBCoolOperatorSpecAccess().getNameAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BCoolOperatorSpec__Group__1__Impl"


    // $ANTLR start "rule__BCoolOperatorSpec__Group__2"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1676:1: rule__BCoolOperatorSpec__Group__2 : rule__BCoolOperatorSpec__Group__2__Impl rule__BCoolOperatorSpec__Group__3 ;
    public final void rule__BCoolOperatorSpec__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1680:1: ( rule__BCoolOperatorSpec__Group__2__Impl rule__BCoolOperatorSpec__Group__3 )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1681:2: rule__BCoolOperatorSpec__Group__2__Impl rule__BCoolOperatorSpec__Group__3
            {
            pushFollow(FOLLOW_rule__BCoolOperatorSpec__Group__2__Impl_in_rule__BCoolOperatorSpec__Group__23539);
            rule__BCoolOperatorSpec__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__BCoolOperatorSpec__Group__3_in_rule__BCoolOperatorSpec__Group__23542);
            rule__BCoolOperatorSpec__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BCoolOperatorSpec__Group__2"


    // $ANTLR start "rule__BCoolOperatorSpec__Group__2__Impl"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1688:1: rule__BCoolOperatorSpec__Group__2__Impl : ( ( rule__BCoolOperatorSpec__GlobalEventExpressionsAssignment_2 )? ) ;
    public final void rule__BCoolOperatorSpec__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1692:1: ( ( ( rule__BCoolOperatorSpec__GlobalEventExpressionsAssignment_2 )? ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1693:1: ( ( rule__BCoolOperatorSpec__GlobalEventExpressionsAssignment_2 )? )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1693:1: ( ( rule__BCoolOperatorSpec__GlobalEventExpressionsAssignment_2 )? )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1694:1: ( rule__BCoolOperatorSpec__GlobalEventExpressionsAssignment_2 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBCoolOperatorSpecAccess().getGlobalEventExpressionsAssignment_2()); 
            }
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1695:1: ( rule__BCoolOperatorSpec__GlobalEventExpressionsAssignment_2 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==33) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1695:2: rule__BCoolOperatorSpec__GlobalEventExpressionsAssignment_2
                    {
                    pushFollow(FOLLOW_rule__BCoolOperatorSpec__GlobalEventExpressionsAssignment_2_in_rule__BCoolOperatorSpec__Group__2__Impl3569);
                    rule__BCoolOperatorSpec__GlobalEventExpressionsAssignment_2();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBCoolOperatorSpecAccess().getGlobalEventExpressionsAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BCoolOperatorSpec__Group__2__Impl"


    // $ANTLR start "rule__BCoolOperatorSpec__Group__3"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1705:1: rule__BCoolOperatorSpec__Group__3 : rule__BCoolOperatorSpec__Group__3__Impl rule__BCoolOperatorSpec__Group__4 ;
    public final void rule__BCoolOperatorSpec__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1709:1: ( rule__BCoolOperatorSpec__Group__3__Impl rule__BCoolOperatorSpec__Group__4 )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1710:2: rule__BCoolOperatorSpec__Group__3__Impl rule__BCoolOperatorSpec__Group__4
            {
            pushFollow(FOLLOW_rule__BCoolOperatorSpec__Group__3__Impl_in_rule__BCoolOperatorSpec__Group__33600);
            rule__BCoolOperatorSpec__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__BCoolOperatorSpec__Group__4_in_rule__BCoolOperatorSpec__Group__33603);
            rule__BCoolOperatorSpec__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BCoolOperatorSpec__Group__3"


    // $ANTLR start "rule__BCoolOperatorSpec__Group__3__Impl"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1717:1: rule__BCoolOperatorSpec__Group__3__Impl : ( ( rule__BCoolOperatorSpec__GlobalDSEsAssignment_3 )? ) ;
    public final void rule__BCoolOperatorSpec__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1721:1: ( ( ( rule__BCoolOperatorSpec__GlobalDSEsAssignment_3 )? ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1722:1: ( ( rule__BCoolOperatorSpec__GlobalDSEsAssignment_3 )? )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1722:1: ( ( rule__BCoolOperatorSpec__GlobalDSEsAssignment_3 )? )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1723:1: ( rule__BCoolOperatorSpec__GlobalDSEsAssignment_3 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBCoolOperatorSpecAccess().getGlobalDSEsAssignment_3()); 
            }
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1724:1: ( rule__BCoolOperatorSpec__GlobalDSEsAssignment_3 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==31) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1724:2: rule__BCoolOperatorSpec__GlobalDSEsAssignment_3
                    {
                    pushFollow(FOLLOW_rule__BCoolOperatorSpec__GlobalDSEsAssignment_3_in_rule__BCoolOperatorSpec__Group__3__Impl3630);
                    rule__BCoolOperatorSpec__GlobalDSEsAssignment_3();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBCoolOperatorSpecAccess().getGlobalDSEsAssignment_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BCoolOperatorSpec__Group__3__Impl"


    // $ANTLR start "rule__BCoolOperatorSpec__Group__4"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1734:1: rule__BCoolOperatorSpec__Group__4 : rule__BCoolOperatorSpec__Group__4__Impl ;
    public final void rule__BCoolOperatorSpec__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1738:1: ( rule__BCoolOperatorSpec__Group__4__Impl )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1739:2: rule__BCoolOperatorSpec__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__BCoolOperatorSpec__Group__4__Impl_in_rule__BCoolOperatorSpec__Group__43661);
            rule__BCoolOperatorSpec__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BCoolOperatorSpec__Group__4"


    // $ANTLR start "rule__BCoolOperatorSpec__Group__4__Impl"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1745:1: rule__BCoolOperatorSpec__Group__4__Impl : ( ( ( rule__BCoolOperatorSpec__BcoolCompositionRulesAssignment_4 ) ) ( ( rule__BCoolOperatorSpec__BcoolCompositionRulesAssignment_4 )* ) ) ;
    public final void rule__BCoolOperatorSpec__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1749:1: ( ( ( ( rule__BCoolOperatorSpec__BcoolCompositionRulesAssignment_4 ) ) ( ( rule__BCoolOperatorSpec__BcoolCompositionRulesAssignment_4 )* ) ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1750:1: ( ( ( rule__BCoolOperatorSpec__BcoolCompositionRulesAssignment_4 ) ) ( ( rule__BCoolOperatorSpec__BcoolCompositionRulesAssignment_4 )* ) )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1750:1: ( ( ( rule__BCoolOperatorSpec__BcoolCompositionRulesAssignment_4 ) ) ( ( rule__BCoolOperatorSpec__BcoolCompositionRulesAssignment_4 )* ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1751:1: ( ( rule__BCoolOperatorSpec__BcoolCompositionRulesAssignment_4 ) ) ( ( rule__BCoolOperatorSpec__BcoolCompositionRulesAssignment_4 )* )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1751:1: ( ( rule__BCoolOperatorSpec__BcoolCompositionRulesAssignment_4 ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1752:1: ( rule__BCoolOperatorSpec__BcoolCompositionRulesAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBCoolOperatorSpecAccess().getBcoolCompositionRulesAssignment_4()); 
            }
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1753:1: ( rule__BCoolOperatorSpec__BcoolCompositionRulesAssignment_4 )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1753:2: rule__BCoolOperatorSpec__BcoolCompositionRulesAssignment_4
            {
            pushFollow(FOLLOW_rule__BCoolOperatorSpec__BcoolCompositionRulesAssignment_4_in_rule__BCoolOperatorSpec__Group__4__Impl3690);
            rule__BCoolOperatorSpec__BcoolCompositionRulesAssignment_4();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBCoolOperatorSpecAccess().getBcoolCompositionRulesAssignment_4()); 
            }

            }

            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1756:1: ( ( rule__BCoolOperatorSpec__BcoolCompositionRulesAssignment_4 )* )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1757:1: ( rule__BCoolOperatorSpec__BcoolCompositionRulesAssignment_4 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBCoolOperatorSpecAccess().getBcoolCompositionRulesAssignment_4()); 
            }
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1758:1: ( rule__BCoolOperatorSpec__BcoolCompositionRulesAssignment_4 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==34) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1758:2: rule__BCoolOperatorSpec__BcoolCompositionRulesAssignment_4
            	    {
            	    pushFollow(FOLLOW_rule__BCoolOperatorSpec__BcoolCompositionRulesAssignment_4_in_rule__BCoolOperatorSpec__Group__4__Impl3702);
            	    rule__BCoolOperatorSpec__BcoolCompositionRulesAssignment_4();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBCoolOperatorSpecAccess().getBcoolCompositionRulesAssignment_4()); 
            }

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BCoolOperatorSpec__Group__4__Impl"


    // $ANTLR start "rule__GlobalDSEsRule__Group__0"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1779:1: rule__GlobalDSEsRule__Group__0 : rule__GlobalDSEsRule__Group__0__Impl rule__GlobalDSEsRule__Group__1 ;
    public final void rule__GlobalDSEsRule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1783:1: ( rule__GlobalDSEsRule__Group__0__Impl rule__GlobalDSEsRule__Group__1 )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1784:2: rule__GlobalDSEsRule__Group__0__Impl rule__GlobalDSEsRule__Group__1
            {
            pushFollow(FOLLOW_rule__GlobalDSEsRule__Group__0__Impl_in_rule__GlobalDSEsRule__Group__03745);
            rule__GlobalDSEsRule__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__GlobalDSEsRule__Group__1_in_rule__GlobalDSEsRule__Group__03748);
            rule__GlobalDSEsRule__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalDSEsRule__Group__0"


    // $ANTLR start "rule__GlobalDSEsRule__Group__0__Impl"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1791:1: rule__GlobalDSEsRule__Group__0__Impl : ( 'Global Event' ) ;
    public final void rule__GlobalDSEsRule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1795:1: ( ( 'Global Event' ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1796:1: ( 'Global Event' )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1796:1: ( 'Global Event' )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1797:1: 'Global Event'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGlobalDSEsRuleAccess().getGlobalEventKeyword_0()); 
            }
            match(input,31,FOLLOW_31_in_rule__GlobalDSEsRule__Group__0__Impl3776); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGlobalDSEsRuleAccess().getGlobalEventKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalDSEsRule__Group__0__Impl"


    // $ANTLR start "rule__GlobalDSEsRule__Group__1"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1810:1: rule__GlobalDSEsRule__Group__1 : rule__GlobalDSEsRule__Group__1__Impl rule__GlobalDSEsRule__Group__2 ;
    public final void rule__GlobalDSEsRule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1814:1: ( rule__GlobalDSEsRule__Group__1__Impl rule__GlobalDSEsRule__Group__2 )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1815:2: rule__GlobalDSEsRule__Group__1__Impl rule__GlobalDSEsRule__Group__2
            {
            pushFollow(FOLLOW_rule__GlobalDSEsRule__Group__1__Impl_in_rule__GlobalDSEsRule__Group__13807);
            rule__GlobalDSEsRule__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__GlobalDSEsRule__Group__2_in_rule__GlobalDSEsRule__Group__13810);
            rule__GlobalDSEsRule__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalDSEsRule__Group__1"


    // $ANTLR start "rule__GlobalDSEsRule__Group__1__Impl"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1822:1: rule__GlobalDSEsRule__Group__1__Impl : ( ( rule__GlobalDSEsRule__NameAssignment_1 ) ) ;
    public final void rule__GlobalDSEsRule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1826:1: ( ( ( rule__GlobalDSEsRule__NameAssignment_1 ) ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1827:1: ( ( rule__GlobalDSEsRule__NameAssignment_1 ) )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1827:1: ( ( rule__GlobalDSEsRule__NameAssignment_1 ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1828:1: ( rule__GlobalDSEsRule__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGlobalDSEsRuleAccess().getNameAssignment_1()); 
            }
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1829:1: ( rule__GlobalDSEsRule__NameAssignment_1 )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1829:2: rule__GlobalDSEsRule__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__GlobalDSEsRule__NameAssignment_1_in_rule__GlobalDSEsRule__Group__1__Impl3837);
            rule__GlobalDSEsRule__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGlobalDSEsRuleAccess().getNameAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalDSEsRule__Group__1__Impl"


    // $ANTLR start "rule__GlobalDSEsRule__Group__2"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1839:1: rule__GlobalDSEsRule__Group__2 : rule__GlobalDSEsRule__Group__2__Impl ;
    public final void rule__GlobalDSEsRule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1843:1: ( rule__GlobalDSEsRule__Group__2__Impl )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1844:2: rule__GlobalDSEsRule__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__GlobalDSEsRule__Group__2__Impl_in_rule__GlobalDSEsRule__Group__23867);
            rule__GlobalDSEsRule__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalDSEsRule__Group__2"


    // $ANTLR start "rule__GlobalDSEsRule__Group__2__Impl"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1850:1: rule__GlobalDSEsRule__Group__2__Impl : ( ';' ) ;
    public final void rule__GlobalDSEsRule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1854:1: ( ( ';' ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1855:1: ( ';' )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1855:1: ( ';' )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1856:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGlobalDSEsRuleAccess().getSemicolonKeyword_2()); 
            }
            match(input,32,FOLLOW_32_in_rule__GlobalDSEsRule__Group__2__Impl3895); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGlobalDSEsRuleAccess().getSemicolonKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalDSEsRule__Group__2__Impl"


    // $ANTLR start "rule__GlobalEventExpressionRule__Group__0"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1875:1: rule__GlobalEventExpressionRule__Group__0 : rule__GlobalEventExpressionRule__Group__0__Impl rule__GlobalEventExpressionRule__Group__1 ;
    public final void rule__GlobalEventExpressionRule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1879:1: ( rule__GlobalEventExpressionRule__Group__0__Impl rule__GlobalEventExpressionRule__Group__1 )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1880:2: rule__GlobalEventExpressionRule__Group__0__Impl rule__GlobalEventExpressionRule__Group__1
            {
            pushFollow(FOLLOW_rule__GlobalEventExpressionRule__Group__0__Impl_in_rule__GlobalEventExpressionRule__Group__03932);
            rule__GlobalEventExpressionRule__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__GlobalEventExpressionRule__Group__1_in_rule__GlobalEventExpressionRule__Group__03935);
            rule__GlobalEventExpressionRule__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalEventExpressionRule__Group__0"


    // $ANTLR start "rule__GlobalEventExpressionRule__Group__0__Impl"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1887:1: rule__GlobalEventExpressionRule__Group__0__Impl : ( 'let' ) ;
    public final void rule__GlobalEventExpressionRule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1891:1: ( ( 'let' ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1892:1: ( 'let' )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1892:1: ( 'let' )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1893:1: 'let'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGlobalEventExpressionRuleAccess().getLetKeyword_0()); 
            }
            match(input,33,FOLLOW_33_in_rule__GlobalEventExpressionRule__Group__0__Impl3963); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGlobalEventExpressionRuleAccess().getLetKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalEventExpressionRule__Group__0__Impl"


    // $ANTLR start "rule__GlobalEventExpressionRule__Group__1"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1906:1: rule__GlobalEventExpressionRule__Group__1 : rule__GlobalEventExpressionRule__Group__1__Impl ;
    public final void rule__GlobalEventExpressionRule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1910:1: ( rule__GlobalEventExpressionRule__Group__1__Impl )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1911:2: rule__GlobalEventExpressionRule__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__GlobalEventExpressionRule__Group__1__Impl_in_rule__GlobalEventExpressionRule__Group__13994);
            rule__GlobalEventExpressionRule__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalEventExpressionRule__Group__1"


    // $ANTLR start "rule__GlobalEventExpressionRule__Group__1__Impl"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1917:1: rule__GlobalEventExpressionRule__Group__1__Impl : ( ruleEventExpression ) ;
    public final void rule__GlobalEventExpressionRule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1921:1: ( ( ruleEventExpression ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1922:1: ( ruleEventExpression )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1922:1: ( ruleEventExpression )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1923:1: ruleEventExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGlobalEventExpressionRuleAccess().getEventExpressionParserRuleCall_1()); 
            }
            pushFollow(FOLLOW_ruleEventExpression_in_rule__GlobalEventExpressionRule__Group__1__Impl4021);
            ruleEventExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGlobalEventExpressionRuleAccess().getEventExpressionParserRuleCall_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalEventExpressionRule__Group__1__Impl"


    // $ANTLR start "rule__BCoolCompositionRule__Group__0"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1938:1: rule__BCoolCompositionRule__Group__0 : rule__BCoolCompositionRule__Group__0__Impl rule__BCoolCompositionRule__Group__1 ;
    public final void rule__BCoolCompositionRule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1942:1: ( rule__BCoolCompositionRule__Group__0__Impl rule__BCoolCompositionRule__Group__1 )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1943:2: rule__BCoolCompositionRule__Group__0__Impl rule__BCoolCompositionRule__Group__1
            {
            pushFollow(FOLLOW_rule__BCoolCompositionRule__Group__0__Impl_in_rule__BCoolCompositionRule__Group__04054);
            rule__BCoolCompositionRule__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__BCoolCompositionRule__Group__1_in_rule__BCoolCompositionRule__Group__04057);
            rule__BCoolCompositionRule__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BCoolCompositionRule__Group__0"


    // $ANTLR start "rule__BCoolCompositionRule__Group__0__Impl"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1950:1: rule__BCoolCompositionRule__Group__0__Impl : ( 'Operator' ) ;
    public final void rule__BCoolCompositionRule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1954:1: ( ( 'Operator' ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1955:1: ( 'Operator' )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1955:1: ( 'Operator' )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1956:1: 'Operator'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBCoolCompositionRuleAccess().getOperatorKeyword_0()); 
            }
            match(input,34,FOLLOW_34_in_rule__BCoolCompositionRule__Group__0__Impl4085); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBCoolCompositionRuleAccess().getOperatorKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BCoolCompositionRule__Group__0__Impl"


    // $ANTLR start "rule__BCoolCompositionRule__Group__1"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1969:1: rule__BCoolCompositionRule__Group__1 : rule__BCoolCompositionRule__Group__1__Impl rule__BCoolCompositionRule__Group__2 ;
    public final void rule__BCoolCompositionRule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1973:1: ( rule__BCoolCompositionRule__Group__1__Impl rule__BCoolCompositionRule__Group__2 )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1974:2: rule__BCoolCompositionRule__Group__1__Impl rule__BCoolCompositionRule__Group__2
            {
            pushFollow(FOLLOW_rule__BCoolCompositionRule__Group__1__Impl_in_rule__BCoolCompositionRule__Group__14116);
            rule__BCoolCompositionRule__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__BCoolCompositionRule__Group__2_in_rule__BCoolCompositionRule__Group__14119);
            rule__BCoolCompositionRule__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BCoolCompositionRule__Group__1"


    // $ANTLR start "rule__BCoolCompositionRule__Group__1__Impl"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1981:1: rule__BCoolCompositionRule__Group__1__Impl : ( ( rule__BCoolCompositionRule__NameAssignment_1 ) ) ;
    public final void rule__BCoolCompositionRule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1985:1: ( ( ( rule__BCoolCompositionRule__NameAssignment_1 ) ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1986:1: ( ( rule__BCoolCompositionRule__NameAssignment_1 ) )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1986:1: ( ( rule__BCoolCompositionRule__NameAssignment_1 ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1987:1: ( rule__BCoolCompositionRule__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBCoolCompositionRuleAccess().getNameAssignment_1()); 
            }
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1988:1: ( rule__BCoolCompositionRule__NameAssignment_1 )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1988:2: rule__BCoolCompositionRule__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__BCoolCompositionRule__NameAssignment_1_in_rule__BCoolCompositionRule__Group__1__Impl4146);
            rule__BCoolCompositionRule__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBCoolCompositionRuleAccess().getNameAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BCoolCompositionRule__Group__1__Impl"


    // $ANTLR start "rule__BCoolCompositionRule__Group__2"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:1998:1: rule__BCoolCompositionRule__Group__2 : rule__BCoolCompositionRule__Group__2__Impl rule__BCoolCompositionRule__Group__3 ;
    public final void rule__BCoolCompositionRule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2002:1: ( rule__BCoolCompositionRule__Group__2__Impl rule__BCoolCompositionRule__Group__3 )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2003:2: rule__BCoolCompositionRule__Group__2__Impl rule__BCoolCompositionRule__Group__3
            {
            pushFollow(FOLLOW_rule__BCoolCompositionRule__Group__2__Impl_in_rule__BCoolCompositionRule__Group__24176);
            rule__BCoolCompositionRule__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__BCoolCompositionRule__Group__3_in_rule__BCoolCompositionRule__Group__24179);
            rule__BCoolCompositionRule__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BCoolCompositionRule__Group__2"


    // $ANTLR start "rule__BCoolCompositionRule__Group__2__Impl"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2010:1: rule__BCoolCompositionRule__Group__2__Impl : ( '(' ) ;
    public final void rule__BCoolCompositionRule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2014:1: ( ( '(' ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2015:1: ( '(' )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2015:1: ( '(' )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2016:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBCoolCompositionRuleAccess().getLeftParenthesisKeyword_2()); 
            }
            match(input,35,FOLLOW_35_in_rule__BCoolCompositionRule__Group__2__Impl4207); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBCoolCompositionRuleAccess().getLeftParenthesisKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BCoolCompositionRule__Group__2__Impl"


    // $ANTLR start "rule__BCoolCompositionRule__Group__3"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2029:1: rule__BCoolCompositionRule__Group__3 : rule__BCoolCompositionRule__Group__3__Impl rule__BCoolCompositionRule__Group__4 ;
    public final void rule__BCoolCompositionRule__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2033:1: ( rule__BCoolCompositionRule__Group__3__Impl rule__BCoolCompositionRule__Group__4 )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2034:2: rule__BCoolCompositionRule__Group__3__Impl rule__BCoolCompositionRule__Group__4
            {
            pushFollow(FOLLOW_rule__BCoolCompositionRule__Group__3__Impl_in_rule__BCoolCompositionRule__Group__34238);
            rule__BCoolCompositionRule__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__BCoolCompositionRule__Group__4_in_rule__BCoolCompositionRule__Group__34241);
            rule__BCoolCompositionRule__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BCoolCompositionRule__Group__3"


    // $ANTLR start "rule__BCoolCompositionRule__Group__3__Impl"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2041:1: rule__BCoolCompositionRule__Group__3__Impl : ( ( rule__BCoolCompositionRule__BCoolOperatorArgsAssignment_3 ) ) ;
    public final void rule__BCoolCompositionRule__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2045:1: ( ( ( rule__BCoolCompositionRule__BCoolOperatorArgsAssignment_3 ) ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2046:1: ( ( rule__BCoolCompositionRule__BCoolOperatorArgsAssignment_3 ) )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2046:1: ( ( rule__BCoolCompositionRule__BCoolOperatorArgsAssignment_3 ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2047:1: ( rule__BCoolCompositionRule__BCoolOperatorArgsAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBCoolCompositionRuleAccess().getBCoolOperatorArgsAssignment_3()); 
            }
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2048:1: ( rule__BCoolCompositionRule__BCoolOperatorArgsAssignment_3 )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2048:2: rule__BCoolCompositionRule__BCoolOperatorArgsAssignment_3
            {
            pushFollow(FOLLOW_rule__BCoolCompositionRule__BCoolOperatorArgsAssignment_3_in_rule__BCoolCompositionRule__Group__3__Impl4268);
            rule__BCoolCompositionRule__BCoolOperatorArgsAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBCoolCompositionRuleAccess().getBCoolOperatorArgsAssignment_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BCoolCompositionRule__Group__3__Impl"


    // $ANTLR start "rule__BCoolCompositionRule__Group__4"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2058:1: rule__BCoolCompositionRule__Group__4 : rule__BCoolCompositionRule__Group__4__Impl rule__BCoolCompositionRule__Group__5 ;
    public final void rule__BCoolCompositionRule__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2062:1: ( rule__BCoolCompositionRule__Group__4__Impl rule__BCoolCompositionRule__Group__5 )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2063:2: rule__BCoolCompositionRule__Group__4__Impl rule__BCoolCompositionRule__Group__5
            {
            pushFollow(FOLLOW_rule__BCoolCompositionRule__Group__4__Impl_in_rule__BCoolCompositionRule__Group__44298);
            rule__BCoolCompositionRule__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__BCoolCompositionRule__Group__5_in_rule__BCoolCompositionRule__Group__44301);
            rule__BCoolCompositionRule__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BCoolCompositionRule__Group__4"


    // $ANTLR start "rule__BCoolCompositionRule__Group__4__Impl"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2070:1: rule__BCoolCompositionRule__Group__4__Impl : ( ( rule__BCoolCompositionRule__Group_4__0 )* ) ;
    public final void rule__BCoolCompositionRule__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2074:1: ( ( ( rule__BCoolCompositionRule__Group_4__0 )* ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2075:1: ( ( rule__BCoolCompositionRule__Group_4__0 )* )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2075:1: ( ( rule__BCoolCompositionRule__Group_4__0 )* )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2076:1: ( rule__BCoolCompositionRule__Group_4__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBCoolCompositionRuleAccess().getGroup_4()); 
            }
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2077:1: ( rule__BCoolCompositionRule__Group_4__0 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==39) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2077:2: rule__BCoolCompositionRule__Group_4__0
            	    {
            	    pushFollow(FOLLOW_rule__BCoolCompositionRule__Group_4__0_in_rule__BCoolCompositionRule__Group__4__Impl4328);
            	    rule__BCoolCompositionRule__Group_4__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBCoolCompositionRuleAccess().getGroup_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BCoolCompositionRule__Group__4__Impl"


    // $ANTLR start "rule__BCoolCompositionRule__Group__5"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2087:1: rule__BCoolCompositionRule__Group__5 : rule__BCoolCompositionRule__Group__5__Impl rule__BCoolCompositionRule__Group__6 ;
    public final void rule__BCoolCompositionRule__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2091:1: ( rule__BCoolCompositionRule__Group__5__Impl rule__BCoolCompositionRule__Group__6 )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2092:2: rule__BCoolCompositionRule__Group__5__Impl rule__BCoolCompositionRule__Group__6
            {
            pushFollow(FOLLOW_rule__BCoolCompositionRule__Group__5__Impl_in_rule__BCoolCompositionRule__Group__54359);
            rule__BCoolCompositionRule__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__BCoolCompositionRule__Group__6_in_rule__BCoolCompositionRule__Group__54362);
            rule__BCoolCompositionRule__Group__6();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BCoolCompositionRule__Group__5"


    // $ANTLR start "rule__BCoolCompositionRule__Group__5__Impl"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2099:1: rule__BCoolCompositionRule__Group__5__Impl : ( ')' ) ;
    public final void rule__BCoolCompositionRule__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2103:1: ( ( ')' ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2104:1: ( ')' )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2104:1: ( ')' )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2105:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBCoolCompositionRuleAccess().getRightParenthesisKeyword_5()); 
            }
            match(input,36,FOLLOW_36_in_rule__BCoolCompositionRule__Group__5__Impl4390); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBCoolCompositionRuleAccess().getRightParenthesisKeyword_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BCoolCompositionRule__Group__5__Impl"


    // $ANTLR start "rule__BCoolCompositionRule__Group__6"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2118:1: rule__BCoolCompositionRule__Group__6 : rule__BCoolCompositionRule__Group__6__Impl rule__BCoolCompositionRule__Group__7 ;
    public final void rule__BCoolCompositionRule__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2122:1: ( rule__BCoolCompositionRule__Group__6__Impl rule__BCoolCompositionRule__Group__7 )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2123:2: rule__BCoolCompositionRule__Group__6__Impl rule__BCoolCompositionRule__Group__7
            {
            pushFollow(FOLLOW_rule__BCoolCompositionRule__Group__6__Impl_in_rule__BCoolCompositionRule__Group__64421);
            rule__BCoolCompositionRule__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__BCoolCompositionRule__Group__7_in_rule__BCoolCompositionRule__Group__64424);
            rule__BCoolCompositionRule__Group__7();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BCoolCompositionRule__Group__6"


    // $ANTLR start "rule__BCoolCompositionRule__Group__6__Impl"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2130:1: rule__BCoolCompositionRule__Group__6__Impl : ( 'MatchingCorrespondance:' ) ;
    public final void rule__BCoolCompositionRule__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2134:1: ( ( 'MatchingCorrespondance:' ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2135:1: ( 'MatchingCorrespondance:' )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2135:1: ( 'MatchingCorrespondance:' )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2136:1: 'MatchingCorrespondance:'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBCoolCompositionRuleAccess().getMatchingCorrespondanceKeyword_6()); 
            }
            match(input,37,FOLLOW_37_in_rule__BCoolCompositionRule__Group__6__Impl4452); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBCoolCompositionRuleAccess().getMatchingCorrespondanceKeyword_6()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BCoolCompositionRule__Group__6__Impl"


    // $ANTLR start "rule__BCoolCompositionRule__Group__7"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2149:1: rule__BCoolCompositionRule__Group__7 : rule__BCoolCompositionRule__Group__7__Impl rule__BCoolCompositionRule__Group__8 ;
    public final void rule__BCoolCompositionRule__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2153:1: ( rule__BCoolCompositionRule__Group__7__Impl rule__BCoolCompositionRule__Group__8 )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2154:2: rule__BCoolCompositionRule__Group__7__Impl rule__BCoolCompositionRule__Group__8
            {
            pushFollow(FOLLOW_rule__BCoolCompositionRule__Group__7__Impl_in_rule__BCoolCompositionRule__Group__74483);
            rule__BCoolCompositionRule__Group__7__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__BCoolCompositionRule__Group__8_in_rule__BCoolCompositionRule__Group__74486);
            rule__BCoolCompositionRule__Group__8();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BCoolCompositionRule__Group__7"


    // $ANTLR start "rule__BCoolCompositionRule__Group__7__Impl"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2161:1: rule__BCoolCompositionRule__Group__7__Impl : ( ( rule__BCoolCompositionRule__MatchingRuleAssignment_7 ) ) ;
    public final void rule__BCoolCompositionRule__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2165:1: ( ( ( rule__BCoolCompositionRule__MatchingRuleAssignment_7 ) ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2166:1: ( ( rule__BCoolCompositionRule__MatchingRuleAssignment_7 ) )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2166:1: ( ( rule__BCoolCompositionRule__MatchingRuleAssignment_7 ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2167:1: ( rule__BCoolCompositionRule__MatchingRuleAssignment_7 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBCoolCompositionRuleAccess().getMatchingRuleAssignment_7()); 
            }
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2168:1: ( rule__BCoolCompositionRule__MatchingRuleAssignment_7 )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2168:2: rule__BCoolCompositionRule__MatchingRuleAssignment_7
            {
            pushFollow(FOLLOW_rule__BCoolCompositionRule__MatchingRuleAssignment_7_in_rule__BCoolCompositionRule__Group__7__Impl4513);
            rule__BCoolCompositionRule__MatchingRuleAssignment_7();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBCoolCompositionRuleAccess().getMatchingRuleAssignment_7()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BCoolCompositionRule__Group__7__Impl"


    // $ANTLR start "rule__BCoolCompositionRule__Group__8"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2178:1: rule__BCoolCompositionRule__Group__8 : rule__BCoolCompositionRule__Group__8__Impl rule__BCoolCompositionRule__Group__9 ;
    public final void rule__BCoolCompositionRule__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2182:1: ( rule__BCoolCompositionRule__Group__8__Impl rule__BCoolCompositionRule__Group__9 )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2183:2: rule__BCoolCompositionRule__Group__8__Impl rule__BCoolCompositionRule__Group__9
            {
            pushFollow(FOLLOW_rule__BCoolCompositionRule__Group__8__Impl_in_rule__BCoolCompositionRule__Group__84543);
            rule__BCoolCompositionRule__Group__8__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__BCoolCompositionRule__Group__9_in_rule__BCoolCompositionRule__Group__84546);
            rule__BCoolCompositionRule__Group__9();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BCoolCompositionRule__Group__8"


    // $ANTLR start "rule__BCoolCompositionRule__Group__8__Impl"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2190:1: rule__BCoolCompositionRule__Group__8__Impl : ( ( rule__BCoolCompositionRule__CoordinationRuleAssignment_8 ) ) ;
    public final void rule__BCoolCompositionRule__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2194:1: ( ( ( rule__BCoolCompositionRule__CoordinationRuleAssignment_8 ) ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2195:1: ( ( rule__BCoolCompositionRule__CoordinationRuleAssignment_8 ) )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2195:1: ( ( rule__BCoolCompositionRule__CoordinationRuleAssignment_8 ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2196:1: ( rule__BCoolCompositionRule__CoordinationRuleAssignment_8 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBCoolCompositionRuleAccess().getCoordinationRuleAssignment_8()); 
            }
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2197:1: ( rule__BCoolCompositionRule__CoordinationRuleAssignment_8 )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2197:2: rule__BCoolCompositionRule__CoordinationRuleAssignment_8
            {
            pushFollow(FOLLOW_rule__BCoolCompositionRule__CoordinationRuleAssignment_8_in_rule__BCoolCompositionRule__Group__8__Impl4573);
            rule__BCoolCompositionRule__CoordinationRuleAssignment_8();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBCoolCompositionRuleAccess().getCoordinationRuleAssignment_8()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BCoolCompositionRule__Group__8__Impl"


    // $ANTLR start "rule__BCoolCompositionRule__Group__9"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2207:1: rule__BCoolCompositionRule__Group__9 : rule__BCoolCompositionRule__Group__9__Impl ;
    public final void rule__BCoolCompositionRule__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2211:1: ( rule__BCoolCompositionRule__Group__9__Impl )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2212:2: rule__BCoolCompositionRule__Group__9__Impl
            {
            pushFollow(FOLLOW_rule__BCoolCompositionRule__Group__9__Impl_in_rule__BCoolCompositionRule__Group__94603);
            rule__BCoolCompositionRule__Group__9__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BCoolCompositionRule__Group__9"


    // $ANTLR start "rule__BCoolCompositionRule__Group__9__Impl"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2218:1: rule__BCoolCompositionRule__Group__9__Impl : ( 'end operator;' ) ;
    public final void rule__BCoolCompositionRule__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2222:1: ( ( 'end operator;' ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2223:1: ( 'end operator;' )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2223:1: ( 'end operator;' )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2224:1: 'end operator;'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBCoolCompositionRuleAccess().getEndOperatorKeyword_9()); 
            }
            match(input,38,FOLLOW_38_in_rule__BCoolCompositionRule__Group__9__Impl4631); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBCoolCompositionRuleAccess().getEndOperatorKeyword_9()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BCoolCompositionRule__Group__9__Impl"


    // $ANTLR start "rule__BCoolCompositionRule__Group_4__0"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2257:1: rule__BCoolCompositionRule__Group_4__0 : rule__BCoolCompositionRule__Group_4__0__Impl rule__BCoolCompositionRule__Group_4__1 ;
    public final void rule__BCoolCompositionRule__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2261:1: ( rule__BCoolCompositionRule__Group_4__0__Impl rule__BCoolCompositionRule__Group_4__1 )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2262:2: rule__BCoolCompositionRule__Group_4__0__Impl rule__BCoolCompositionRule__Group_4__1
            {
            pushFollow(FOLLOW_rule__BCoolCompositionRule__Group_4__0__Impl_in_rule__BCoolCompositionRule__Group_4__04682);
            rule__BCoolCompositionRule__Group_4__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__BCoolCompositionRule__Group_4__1_in_rule__BCoolCompositionRule__Group_4__04685);
            rule__BCoolCompositionRule__Group_4__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BCoolCompositionRule__Group_4__0"


    // $ANTLR start "rule__BCoolCompositionRule__Group_4__0__Impl"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2269:1: rule__BCoolCompositionRule__Group_4__0__Impl : ( ',' ) ;
    public final void rule__BCoolCompositionRule__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2273:1: ( ( ',' ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2274:1: ( ',' )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2274:1: ( ',' )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2275:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBCoolCompositionRuleAccess().getCommaKeyword_4_0()); 
            }
            match(input,39,FOLLOW_39_in_rule__BCoolCompositionRule__Group_4__0__Impl4713); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBCoolCompositionRuleAccess().getCommaKeyword_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BCoolCompositionRule__Group_4__0__Impl"


    // $ANTLR start "rule__BCoolCompositionRule__Group_4__1"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2288:1: rule__BCoolCompositionRule__Group_4__1 : rule__BCoolCompositionRule__Group_4__1__Impl ;
    public final void rule__BCoolCompositionRule__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2292:1: ( rule__BCoolCompositionRule__Group_4__1__Impl )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2293:2: rule__BCoolCompositionRule__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__BCoolCompositionRule__Group_4__1__Impl_in_rule__BCoolCompositionRule__Group_4__14744);
            rule__BCoolCompositionRule__Group_4__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BCoolCompositionRule__Group_4__1"


    // $ANTLR start "rule__BCoolCompositionRule__Group_4__1__Impl"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2299:1: rule__BCoolCompositionRule__Group_4__1__Impl : ( ( rule__BCoolCompositionRule__BCoolOperatorArgsAssignment_4_1 ) ) ;
    public final void rule__BCoolCompositionRule__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2303:1: ( ( ( rule__BCoolCompositionRule__BCoolOperatorArgsAssignment_4_1 ) ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2304:1: ( ( rule__BCoolCompositionRule__BCoolOperatorArgsAssignment_4_1 ) )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2304:1: ( ( rule__BCoolCompositionRule__BCoolOperatorArgsAssignment_4_1 ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2305:1: ( rule__BCoolCompositionRule__BCoolOperatorArgsAssignment_4_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBCoolCompositionRuleAccess().getBCoolOperatorArgsAssignment_4_1()); 
            }
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2306:1: ( rule__BCoolCompositionRule__BCoolOperatorArgsAssignment_4_1 )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2306:2: rule__BCoolCompositionRule__BCoolOperatorArgsAssignment_4_1
            {
            pushFollow(FOLLOW_rule__BCoolCompositionRule__BCoolOperatorArgsAssignment_4_1_in_rule__BCoolCompositionRule__Group_4__1__Impl4771);
            rule__BCoolCompositionRule__BCoolOperatorArgsAssignment_4_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBCoolCompositionRuleAccess().getBCoolOperatorArgsAssignment_4_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BCoolCompositionRule__Group_4__1__Impl"


    // $ANTLR start "rule__BCoolOperatorArg__Group__0"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2320:1: rule__BCoolOperatorArg__Group__0 : rule__BCoolOperatorArg__Group__0__Impl rule__BCoolOperatorArg__Group__1 ;
    public final void rule__BCoolOperatorArg__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2324:1: ( rule__BCoolOperatorArg__Group__0__Impl rule__BCoolOperatorArg__Group__1 )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2325:2: rule__BCoolOperatorArg__Group__0__Impl rule__BCoolOperatorArg__Group__1
            {
            pushFollow(FOLLOW_rule__BCoolOperatorArg__Group__0__Impl_in_rule__BCoolOperatorArg__Group__04805);
            rule__BCoolOperatorArg__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__BCoolOperatorArg__Group__1_in_rule__BCoolOperatorArg__Group__04808);
            rule__BCoolOperatorArg__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BCoolOperatorArg__Group__0"


    // $ANTLR start "rule__BCoolOperatorArg__Group__0__Impl"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2332:1: rule__BCoolOperatorArg__Group__0__Impl : ( ( rule__BCoolOperatorArg__NameAssignment_0 ) ) ;
    public final void rule__BCoolOperatorArg__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2336:1: ( ( ( rule__BCoolOperatorArg__NameAssignment_0 ) ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2337:1: ( ( rule__BCoolOperatorArg__NameAssignment_0 ) )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2337:1: ( ( rule__BCoolOperatorArg__NameAssignment_0 ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2338:1: ( rule__BCoolOperatorArg__NameAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBCoolOperatorArgAccess().getNameAssignment_0()); 
            }
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2339:1: ( rule__BCoolOperatorArg__NameAssignment_0 )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2339:2: rule__BCoolOperatorArg__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__BCoolOperatorArg__NameAssignment_0_in_rule__BCoolOperatorArg__Group__0__Impl4835);
            rule__BCoolOperatorArg__NameAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBCoolOperatorArgAccess().getNameAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BCoolOperatorArg__Group__0__Impl"


    // $ANTLR start "rule__BCoolOperatorArg__Group__1"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2349:1: rule__BCoolOperatorArg__Group__1 : rule__BCoolOperatorArg__Group__1__Impl rule__BCoolOperatorArg__Group__2 ;
    public final void rule__BCoolOperatorArg__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2353:1: ( rule__BCoolOperatorArg__Group__1__Impl rule__BCoolOperatorArg__Group__2 )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2354:2: rule__BCoolOperatorArg__Group__1__Impl rule__BCoolOperatorArg__Group__2
            {
            pushFollow(FOLLOW_rule__BCoolOperatorArg__Group__1__Impl_in_rule__BCoolOperatorArg__Group__14865);
            rule__BCoolOperatorArg__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__BCoolOperatorArg__Group__2_in_rule__BCoolOperatorArg__Group__14868);
            rule__BCoolOperatorArg__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BCoolOperatorArg__Group__1"


    // $ANTLR start "rule__BCoolOperatorArg__Group__1__Impl"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2361:1: rule__BCoolOperatorArg__Group__1__Impl : ( ' : ' ) ;
    public final void rule__BCoolOperatorArg__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2365:1: ( ( ' : ' ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2366:1: ( ' : ' )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2366:1: ( ' : ' )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2367:1: ' : '
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBCoolOperatorArgAccess().getSpaceColonSpaceKeyword_1()); 
            }
            match(input,40,FOLLOW_40_in_rule__BCoolOperatorArg__Group__1__Impl4896); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBCoolOperatorArgAccess().getSpaceColonSpaceKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BCoolOperatorArg__Group__1__Impl"


    // $ANTLR start "rule__BCoolOperatorArg__Group__2"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2380:1: rule__BCoolOperatorArg__Group__2 : rule__BCoolOperatorArg__Group__2__Impl rule__BCoolOperatorArg__Group__3 ;
    public final void rule__BCoolOperatorArg__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2384:1: ( rule__BCoolOperatorArg__Group__2__Impl rule__BCoolOperatorArg__Group__3 )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2385:2: rule__BCoolOperatorArg__Group__2__Impl rule__BCoolOperatorArg__Group__3
            {
            pushFollow(FOLLOW_rule__BCoolOperatorArg__Group__2__Impl_in_rule__BCoolOperatorArg__Group__24927);
            rule__BCoolOperatorArg__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__BCoolOperatorArg__Group__3_in_rule__BCoolOperatorArg__Group__24930);
            rule__BCoolOperatorArg__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BCoolOperatorArg__Group__2"


    // $ANTLR start "rule__BCoolOperatorArg__Group__2__Impl"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2392:1: rule__BCoolOperatorArg__Group__2__Impl : ( ( rule__BCoolOperatorArg__InterfaceAssignment_2 ) ) ;
    public final void rule__BCoolOperatorArg__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2396:1: ( ( ( rule__BCoolOperatorArg__InterfaceAssignment_2 ) ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2397:1: ( ( rule__BCoolOperatorArg__InterfaceAssignment_2 ) )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2397:1: ( ( rule__BCoolOperatorArg__InterfaceAssignment_2 ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2398:1: ( rule__BCoolOperatorArg__InterfaceAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBCoolOperatorArgAccess().getInterfaceAssignment_2()); 
            }
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2399:1: ( rule__BCoolOperatorArg__InterfaceAssignment_2 )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2399:2: rule__BCoolOperatorArg__InterfaceAssignment_2
            {
            pushFollow(FOLLOW_rule__BCoolOperatorArg__InterfaceAssignment_2_in_rule__BCoolOperatorArg__Group__2__Impl4957);
            rule__BCoolOperatorArg__InterfaceAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBCoolOperatorArgAccess().getInterfaceAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BCoolOperatorArg__Group__2__Impl"


    // $ANTLR start "rule__BCoolOperatorArg__Group__3"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2409:1: rule__BCoolOperatorArg__Group__3 : rule__BCoolOperatorArg__Group__3__Impl rule__BCoolOperatorArg__Group__4 ;
    public final void rule__BCoolOperatorArg__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2413:1: ( rule__BCoolOperatorArg__Group__3__Impl rule__BCoolOperatorArg__Group__4 )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2414:2: rule__BCoolOperatorArg__Group__3__Impl rule__BCoolOperatorArg__Group__4
            {
            pushFollow(FOLLOW_rule__BCoolOperatorArg__Group__3__Impl_in_rule__BCoolOperatorArg__Group__34987);
            rule__BCoolOperatorArg__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__BCoolOperatorArg__Group__4_in_rule__BCoolOperatorArg__Group__34990);
            rule__BCoolOperatorArg__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BCoolOperatorArg__Group__3"


    // $ANTLR start "rule__BCoolOperatorArg__Group__3__Impl"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2421:1: rule__BCoolOperatorArg__Group__3__Impl : ( '::' ) ;
    public final void rule__BCoolOperatorArg__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2425:1: ( ( '::' ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2426:1: ( '::' )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2426:1: ( '::' )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2427:1: '::'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBCoolOperatorArgAccess().getColonColonKeyword_3()); 
            }
            match(input,41,FOLLOW_41_in_rule__BCoolOperatorArg__Group__3__Impl5018); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBCoolOperatorArgAccess().getColonColonKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BCoolOperatorArg__Group__3__Impl"


    // $ANTLR start "rule__BCoolOperatorArg__Group__4"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2440:1: rule__BCoolOperatorArg__Group__4 : rule__BCoolOperatorArg__Group__4__Impl ;
    public final void rule__BCoolOperatorArg__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2444:1: ( rule__BCoolOperatorArg__Group__4__Impl )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2445:2: rule__BCoolOperatorArg__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__BCoolOperatorArg__Group__4__Impl_in_rule__BCoolOperatorArg__Group__45049);
            rule__BCoolOperatorArg__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BCoolOperatorArg__Group__4"


    // $ANTLR start "rule__BCoolOperatorArg__Group__4__Impl"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2451:1: rule__BCoolOperatorArg__Group__4__Impl : ( ( rule__BCoolOperatorArg__DSEAssignment_4 ) ) ;
    public final void rule__BCoolOperatorArg__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2455:1: ( ( ( rule__BCoolOperatorArg__DSEAssignment_4 ) ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2456:1: ( ( rule__BCoolOperatorArg__DSEAssignment_4 ) )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2456:1: ( ( rule__BCoolOperatorArg__DSEAssignment_4 ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2457:1: ( rule__BCoolOperatorArg__DSEAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBCoolOperatorArgAccess().getDSEAssignment_4()); 
            }
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2458:1: ( rule__BCoolOperatorArg__DSEAssignment_4 )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2458:2: rule__BCoolOperatorArg__DSEAssignment_4
            {
            pushFollow(FOLLOW_rule__BCoolOperatorArg__DSEAssignment_4_in_rule__BCoolOperatorArg__Group__4__Impl5076);
            rule__BCoolOperatorArg__DSEAssignment_4();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBCoolOperatorArgAccess().getDSEAssignment_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BCoolOperatorArg__Group__4__Impl"


    // $ANTLR start "rule__MatchingRule__Group__0"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2478:1: rule__MatchingRule__Group__0 : rule__MatchingRule__Group__0__Impl rule__MatchingRule__Group__1 ;
    public final void rule__MatchingRule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2482:1: ( rule__MatchingRule__Group__0__Impl rule__MatchingRule__Group__1 )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2483:2: rule__MatchingRule__Group__0__Impl rule__MatchingRule__Group__1
            {
            pushFollow(FOLLOW_rule__MatchingRule__Group__0__Impl_in_rule__MatchingRule__Group__05116);
            rule__MatchingRule__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__MatchingRule__Group__1_in_rule__MatchingRule__Group__05119);
            rule__MatchingRule__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MatchingRule__Group__0"


    // $ANTLR start "rule__MatchingRule__Group__0__Impl"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2490:1: rule__MatchingRule__Group__0__Impl : ( 'when' ) ;
    public final void rule__MatchingRule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2494:1: ( ( 'when' ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2495:1: ( 'when' )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2495:1: ( 'when' )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2496:1: 'when'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMatchingRuleAccess().getWhenKeyword_0()); 
            }
            match(input,42,FOLLOW_42_in_rule__MatchingRule__Group__0__Impl5147); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMatchingRuleAccess().getWhenKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MatchingRule__Group__0__Impl"


    // $ANTLR start "rule__MatchingRule__Group__1"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2509:1: rule__MatchingRule__Group__1 : rule__MatchingRule__Group__1__Impl rule__MatchingRule__Group__2 ;
    public final void rule__MatchingRule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2513:1: ( rule__MatchingRule__Group__1__Impl rule__MatchingRule__Group__2 )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2514:2: rule__MatchingRule__Group__1__Impl rule__MatchingRule__Group__2
            {
            pushFollow(FOLLOW_rule__MatchingRule__Group__1__Impl_in_rule__MatchingRule__Group__15178);
            rule__MatchingRule__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__MatchingRule__Group__2_in_rule__MatchingRule__Group__15181);
            rule__MatchingRule__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MatchingRule__Group__1"


    // $ANTLR start "rule__MatchingRule__Group__1__Impl"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2521:1: rule__MatchingRule__Group__1__Impl : ( ( rule__MatchingRule__ConditionAssignment_1 ) ) ;
    public final void rule__MatchingRule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2525:1: ( ( ( rule__MatchingRule__ConditionAssignment_1 ) ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2526:1: ( ( rule__MatchingRule__ConditionAssignment_1 ) )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2526:1: ( ( rule__MatchingRule__ConditionAssignment_1 ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2527:1: ( rule__MatchingRule__ConditionAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMatchingRuleAccess().getConditionAssignment_1()); 
            }
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2528:1: ( rule__MatchingRule__ConditionAssignment_1 )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2528:2: rule__MatchingRule__ConditionAssignment_1
            {
            pushFollow(FOLLOW_rule__MatchingRule__ConditionAssignment_1_in_rule__MatchingRule__Group__1__Impl5208);
            rule__MatchingRule__ConditionAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMatchingRuleAccess().getConditionAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MatchingRule__Group__1__Impl"


    // $ANTLR start "rule__MatchingRule__Group__2"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2538:1: rule__MatchingRule__Group__2 : rule__MatchingRule__Group__2__Impl rule__MatchingRule__Group__3 ;
    public final void rule__MatchingRule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2542:1: ( rule__MatchingRule__Group__2__Impl rule__MatchingRule__Group__3 )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2543:2: rule__MatchingRule__Group__2__Impl rule__MatchingRule__Group__3
            {
            pushFollow(FOLLOW_rule__MatchingRule__Group__2__Impl_in_rule__MatchingRule__Group__25238);
            rule__MatchingRule__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__MatchingRule__Group__3_in_rule__MatchingRule__Group__25241);
            rule__MatchingRule__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MatchingRule__Group__2"


    // $ANTLR start "rule__MatchingRule__Group__2__Impl"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2550:1: rule__MatchingRule__Group__2__Impl : ( ';' ) ;
    public final void rule__MatchingRule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2554:1: ( ( ';' ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2555:1: ( ';' )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2555:1: ( ';' )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2556:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMatchingRuleAccess().getSemicolonKeyword_2()); 
            }
            match(input,32,FOLLOW_32_in_rule__MatchingRule__Group__2__Impl5269); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMatchingRuleAccess().getSemicolonKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MatchingRule__Group__2__Impl"


    // $ANTLR start "rule__MatchingRule__Group__3"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2569:1: rule__MatchingRule__Group__3 : rule__MatchingRule__Group__3__Impl rule__MatchingRule__Group__4 ;
    public final void rule__MatchingRule__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2573:1: ( rule__MatchingRule__Group__3__Impl rule__MatchingRule__Group__4 )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2574:2: rule__MatchingRule__Group__3__Impl rule__MatchingRule__Group__4
            {
            pushFollow(FOLLOW_rule__MatchingRule__Group__3__Impl_in_rule__MatchingRule__Group__35300);
            rule__MatchingRule__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__MatchingRule__Group__4_in_rule__MatchingRule__Group__35303);
            rule__MatchingRule__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MatchingRule__Group__3"


    // $ANTLR start "rule__MatchingRule__Group__3__Impl"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2581:1: rule__MatchingRule__Group__3__Impl : ( 'CoordinationRule:' ) ;
    public final void rule__MatchingRule__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2585:1: ( ( 'CoordinationRule:' ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2586:1: ( 'CoordinationRule:' )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2586:1: ( 'CoordinationRule:' )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2587:1: 'CoordinationRule:'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMatchingRuleAccess().getCoordinationRuleKeyword_3()); 
            }
            match(input,43,FOLLOW_43_in_rule__MatchingRule__Group__3__Impl5331); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMatchingRuleAccess().getCoordinationRuleKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MatchingRule__Group__3__Impl"


    // $ANTLR start "rule__MatchingRule__Group__4"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2600:1: rule__MatchingRule__Group__4 : rule__MatchingRule__Group__4__Impl ;
    public final void rule__MatchingRule__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2604:1: ( rule__MatchingRule__Group__4__Impl )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2605:2: rule__MatchingRule__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__MatchingRule__Group__4__Impl_in_rule__MatchingRule__Group__45362);
            rule__MatchingRule__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MatchingRule__Group__4"


    // $ANTLR start "rule__MatchingRule__Group__4__Impl"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2611:1: rule__MatchingRule__Group__4__Impl : ( ( rule__MatchingRule__Group_4__0 )* ) ;
    public final void rule__MatchingRule__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2615:1: ( ( ( rule__MatchingRule__Group_4__0 )* ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2616:1: ( ( rule__MatchingRule__Group_4__0 )* )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2616:1: ( ( rule__MatchingRule__Group_4__0 )* )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2617:1: ( rule__MatchingRule__Group_4__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMatchingRuleAccess().getGroup_4()); 
            }
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2618:1: ( rule__MatchingRule__Group_4__0 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==44) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2618:2: rule__MatchingRule__Group_4__0
            	    {
            	    pushFollow(FOLLOW_rule__MatchingRule__Group_4__0_in_rule__MatchingRule__Group__4__Impl5389);
            	    rule__MatchingRule__Group_4__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMatchingRuleAccess().getGroup_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MatchingRule__Group__4__Impl"


    // $ANTLR start "rule__MatchingRule__Group_4__0"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2638:1: rule__MatchingRule__Group_4__0 : rule__MatchingRule__Group_4__0__Impl rule__MatchingRule__Group_4__1 ;
    public final void rule__MatchingRule__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2642:1: ( rule__MatchingRule__Group_4__0__Impl rule__MatchingRule__Group_4__1 )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2643:2: rule__MatchingRule__Group_4__0__Impl rule__MatchingRule__Group_4__1
            {
            pushFollow(FOLLOW_rule__MatchingRule__Group_4__0__Impl_in_rule__MatchingRule__Group_4__05430);
            rule__MatchingRule__Group_4__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__MatchingRule__Group_4__1_in_rule__MatchingRule__Group_4__05433);
            rule__MatchingRule__Group_4__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MatchingRule__Group_4__0"


    // $ANTLR start "rule__MatchingRule__Group_4__0__Impl"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2650:1: rule__MatchingRule__Group_4__0__Impl : ( 'Local Event' ) ;
    public final void rule__MatchingRule__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2654:1: ( ( 'Local Event' ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2655:1: ( 'Local Event' )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2655:1: ( 'Local Event' )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2656:1: 'Local Event'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMatchingRuleAccess().getLocalEventKeyword_4_0()); 
            }
            match(input,44,FOLLOW_44_in_rule__MatchingRule__Group_4__0__Impl5461); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMatchingRuleAccess().getLocalEventKeyword_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MatchingRule__Group_4__0__Impl"


    // $ANTLR start "rule__MatchingRule__Group_4__1"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2669:1: rule__MatchingRule__Group_4__1 : rule__MatchingRule__Group_4__1__Impl rule__MatchingRule__Group_4__2 ;
    public final void rule__MatchingRule__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2673:1: ( rule__MatchingRule__Group_4__1__Impl rule__MatchingRule__Group_4__2 )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2674:2: rule__MatchingRule__Group_4__1__Impl rule__MatchingRule__Group_4__2
            {
            pushFollow(FOLLOW_rule__MatchingRule__Group_4__1__Impl_in_rule__MatchingRule__Group_4__15492);
            rule__MatchingRule__Group_4__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__MatchingRule__Group_4__2_in_rule__MatchingRule__Group_4__15495);
            rule__MatchingRule__Group_4__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MatchingRule__Group_4__1"


    // $ANTLR start "rule__MatchingRule__Group_4__1__Impl"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2681:1: rule__MatchingRule__Group_4__1__Impl : ( ( rule__MatchingRule__FilterEventExpressionsAssignment_4_1 ) ) ;
    public final void rule__MatchingRule__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2685:1: ( ( ( rule__MatchingRule__FilterEventExpressionsAssignment_4_1 ) ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2686:1: ( ( rule__MatchingRule__FilterEventExpressionsAssignment_4_1 ) )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2686:1: ( ( rule__MatchingRule__FilterEventExpressionsAssignment_4_1 ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2687:1: ( rule__MatchingRule__FilterEventExpressionsAssignment_4_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMatchingRuleAccess().getFilterEventExpressionsAssignment_4_1()); 
            }
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2688:1: ( rule__MatchingRule__FilterEventExpressionsAssignment_4_1 )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2688:2: rule__MatchingRule__FilterEventExpressionsAssignment_4_1
            {
            pushFollow(FOLLOW_rule__MatchingRule__FilterEventExpressionsAssignment_4_1_in_rule__MatchingRule__Group_4__1__Impl5522);
            rule__MatchingRule__FilterEventExpressionsAssignment_4_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMatchingRuleAccess().getFilterEventExpressionsAssignment_4_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MatchingRule__Group_4__1__Impl"


    // $ANTLR start "rule__MatchingRule__Group_4__2"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2698:1: rule__MatchingRule__Group_4__2 : rule__MatchingRule__Group_4__2__Impl ;
    public final void rule__MatchingRule__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2702:1: ( rule__MatchingRule__Group_4__2__Impl )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2703:2: rule__MatchingRule__Group_4__2__Impl
            {
            pushFollow(FOLLOW_rule__MatchingRule__Group_4__2__Impl_in_rule__MatchingRule__Group_4__25552);
            rule__MatchingRule__Group_4__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MatchingRule__Group_4__2"


    // $ANTLR start "rule__MatchingRule__Group_4__2__Impl"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2709:1: rule__MatchingRule__Group_4__2__Impl : ( ';' ) ;
    public final void rule__MatchingRule__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2713:1: ( ( ';' ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2714:1: ( ';' )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2714:1: ( ';' )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2715:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMatchingRuleAccess().getSemicolonKeyword_4_2()); 
            }
            match(input,32,FOLLOW_32_in_rule__MatchingRule__Group_4__2__Impl5580); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMatchingRuleAccess().getSemicolonKeyword_4_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MatchingRule__Group_4__2__Impl"


    // $ANTLR start "rule__EventExpression__Group__0"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2734:1: rule__EventExpression__Group__0 : rule__EventExpression__Group__0__Impl rule__EventExpression__Group__1 ;
    public final void rule__EventExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2738:1: ( rule__EventExpression__Group__0__Impl rule__EventExpression__Group__1 )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2739:2: rule__EventExpression__Group__0__Impl rule__EventExpression__Group__1
            {
            pushFollow(FOLLOW_rule__EventExpression__Group__0__Impl_in_rule__EventExpression__Group__05617);
            rule__EventExpression__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EventExpression__Group__1_in_rule__EventExpression__Group__05620);
            rule__EventExpression__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventExpression__Group__0"


    // $ANTLR start "rule__EventExpression__Group__0__Impl"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2746:1: rule__EventExpression__Group__0__Impl : ( ( rule__EventExpression__NameAssignment_0 ) ) ;
    public final void rule__EventExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2750:1: ( ( ( rule__EventExpression__NameAssignment_0 ) ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2751:1: ( ( rule__EventExpression__NameAssignment_0 ) )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2751:1: ( ( rule__EventExpression__NameAssignment_0 ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2752:1: ( rule__EventExpression__NameAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventExpressionAccess().getNameAssignment_0()); 
            }
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2753:1: ( rule__EventExpression__NameAssignment_0 )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2753:2: rule__EventExpression__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__EventExpression__NameAssignment_0_in_rule__EventExpression__Group__0__Impl5647);
            rule__EventExpression__NameAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEventExpressionAccess().getNameAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventExpression__Group__0__Impl"


    // $ANTLR start "rule__EventExpression__Group__1"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2763:1: rule__EventExpression__Group__1 : rule__EventExpression__Group__1__Impl rule__EventExpression__Group__2 ;
    public final void rule__EventExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2767:1: ( rule__EventExpression__Group__1__Impl rule__EventExpression__Group__2 )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2768:2: rule__EventExpression__Group__1__Impl rule__EventExpression__Group__2
            {
            pushFollow(FOLLOW_rule__EventExpression__Group__1__Impl_in_rule__EventExpression__Group__15677);
            rule__EventExpression__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EventExpression__Group__2_in_rule__EventExpression__Group__15680);
            rule__EventExpression__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventExpression__Group__1"


    // $ANTLR start "rule__EventExpression__Group__1__Impl"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2775:1: rule__EventExpression__Group__1__Impl : ( '=' ) ;
    public final void rule__EventExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2779:1: ( ( '=' ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2780:1: ( '=' )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2780:1: ( '=' )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2781:1: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventExpressionAccess().getEqualsSignKeyword_1()); 
            }
            match(input,18,FOLLOW_18_in_rule__EventExpression__Group__1__Impl5708); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEventExpressionAccess().getEqualsSignKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventExpression__Group__1__Impl"


    // $ANTLR start "rule__EventExpression__Group__2"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2794:1: rule__EventExpression__Group__2 : rule__EventExpression__Group__2__Impl rule__EventExpression__Group__3 ;
    public final void rule__EventExpression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2798:1: ( rule__EventExpression__Group__2__Impl rule__EventExpression__Group__3 )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2799:2: rule__EventExpression__Group__2__Impl rule__EventExpression__Group__3
            {
            pushFollow(FOLLOW_rule__EventExpression__Group__2__Impl_in_rule__EventExpression__Group__25739);
            rule__EventExpression__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EventExpression__Group__3_in_rule__EventExpression__Group__25742);
            rule__EventExpression__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventExpression__Group__2"


    // $ANTLR start "rule__EventExpression__Group__2__Impl"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2806:1: rule__EventExpression__Group__2__Impl : ( ( rule__EventExpression__DeclarationAssignment_2 ) ) ;
    public final void rule__EventExpression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2810:1: ( ( ( rule__EventExpression__DeclarationAssignment_2 ) ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2811:1: ( ( rule__EventExpression__DeclarationAssignment_2 ) )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2811:1: ( ( rule__EventExpression__DeclarationAssignment_2 ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2812:1: ( rule__EventExpression__DeclarationAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventExpressionAccess().getDeclarationAssignment_2()); 
            }
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2813:1: ( rule__EventExpression__DeclarationAssignment_2 )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2813:2: rule__EventExpression__DeclarationAssignment_2
            {
            pushFollow(FOLLOW_rule__EventExpression__DeclarationAssignment_2_in_rule__EventExpression__Group__2__Impl5769);
            rule__EventExpression__DeclarationAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEventExpressionAccess().getDeclarationAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventExpression__Group__2__Impl"


    // $ANTLR start "rule__EventExpression__Group__3"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2823:1: rule__EventExpression__Group__3 : rule__EventExpression__Group__3__Impl rule__EventExpression__Group__4 ;
    public final void rule__EventExpression__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2827:1: ( rule__EventExpression__Group__3__Impl rule__EventExpression__Group__4 )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2828:2: rule__EventExpression__Group__3__Impl rule__EventExpression__Group__4
            {
            pushFollow(FOLLOW_rule__EventExpression__Group__3__Impl_in_rule__EventExpression__Group__35799);
            rule__EventExpression__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EventExpression__Group__4_in_rule__EventExpression__Group__35802);
            rule__EventExpression__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventExpression__Group__3"


    // $ANTLR start "rule__EventExpression__Group__3__Impl"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2835:1: rule__EventExpression__Group__3__Impl : ( '(' ) ;
    public final void rule__EventExpression__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2839:1: ( ( '(' ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2840:1: ( '(' )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2840:1: ( '(' )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2841:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventExpressionAccess().getLeftParenthesisKeyword_3()); 
            }
            match(input,35,FOLLOW_35_in_rule__EventExpression__Group__3__Impl5830); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEventExpressionAccess().getLeftParenthesisKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventExpression__Group__3__Impl"


    // $ANTLR start "rule__EventExpression__Group__4"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2854:1: rule__EventExpression__Group__4 : rule__EventExpression__Group__4__Impl rule__EventExpression__Group__5 ;
    public final void rule__EventExpression__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2858:1: ( rule__EventExpression__Group__4__Impl rule__EventExpression__Group__5 )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2859:2: rule__EventExpression__Group__4__Impl rule__EventExpression__Group__5
            {
            pushFollow(FOLLOW_rule__EventExpression__Group__4__Impl_in_rule__EventExpression__Group__45861);
            rule__EventExpression__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EventExpression__Group__5_in_rule__EventExpression__Group__45864);
            rule__EventExpression__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventExpression__Group__4"


    // $ANTLR start "rule__EventExpression__Group__4__Impl"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2866:1: rule__EventExpression__Group__4__Impl : ( ( rule__EventExpression__Group_4__0 )? ) ;
    public final void rule__EventExpression__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2870:1: ( ( ( rule__EventExpression__Group_4__0 )? ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2871:1: ( ( rule__EventExpression__Group_4__0 )? )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2871:1: ( ( rule__EventExpression__Group_4__0 )? )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2872:1: ( rule__EventExpression__Group_4__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventExpressionAccess().getGroup_4()); 
            }
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2873:1: ( rule__EventExpression__Group_4__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==RULE_ID) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2873:2: rule__EventExpression__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__EventExpression__Group_4__0_in_rule__EventExpression__Group__4__Impl5891);
                    rule__EventExpression__Group_4__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEventExpressionAccess().getGroup_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventExpression__Group__4__Impl"


    // $ANTLR start "rule__EventExpression__Group__5"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2883:1: rule__EventExpression__Group__5 : rule__EventExpression__Group__5__Impl ;
    public final void rule__EventExpression__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2887:1: ( rule__EventExpression__Group__5__Impl )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2888:2: rule__EventExpression__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__EventExpression__Group__5__Impl_in_rule__EventExpression__Group__55922);
            rule__EventExpression__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventExpression__Group__5"


    // $ANTLR start "rule__EventExpression__Group__5__Impl"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2894:1: rule__EventExpression__Group__5__Impl : ( ')' ) ;
    public final void rule__EventExpression__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2898:1: ( ( ')' ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2899:1: ( ')' )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2899:1: ( ')' )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2900:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventExpressionAccess().getRightParenthesisKeyword_5()); 
            }
            match(input,36,FOLLOW_36_in_rule__EventExpression__Group__5__Impl5950); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEventExpressionAccess().getRightParenthesisKeyword_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventExpression__Group__5__Impl"


    // $ANTLR start "rule__EventExpression__Group_4__0"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2925:1: rule__EventExpression__Group_4__0 : rule__EventExpression__Group_4__0__Impl rule__EventExpression__Group_4__1 ;
    public final void rule__EventExpression__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2929:1: ( rule__EventExpression__Group_4__0__Impl rule__EventExpression__Group_4__1 )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2930:2: rule__EventExpression__Group_4__0__Impl rule__EventExpression__Group_4__1
            {
            pushFollow(FOLLOW_rule__EventExpression__Group_4__0__Impl_in_rule__EventExpression__Group_4__05993);
            rule__EventExpression__Group_4__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EventExpression__Group_4__1_in_rule__EventExpression__Group_4__05996);
            rule__EventExpression__Group_4__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventExpression__Group_4__0"


    // $ANTLR start "rule__EventExpression__Group_4__0__Impl"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2937:1: rule__EventExpression__Group_4__0__Impl : ( ( rule__EventExpression__ActualParametersAssignment_4_0 ) ) ;
    public final void rule__EventExpression__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2941:1: ( ( ( rule__EventExpression__ActualParametersAssignment_4_0 ) ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2942:1: ( ( rule__EventExpression__ActualParametersAssignment_4_0 ) )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2942:1: ( ( rule__EventExpression__ActualParametersAssignment_4_0 ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2943:1: ( rule__EventExpression__ActualParametersAssignment_4_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventExpressionAccess().getActualParametersAssignment_4_0()); 
            }
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2944:1: ( rule__EventExpression__ActualParametersAssignment_4_0 )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2944:2: rule__EventExpression__ActualParametersAssignment_4_0
            {
            pushFollow(FOLLOW_rule__EventExpression__ActualParametersAssignment_4_0_in_rule__EventExpression__Group_4__0__Impl6023);
            rule__EventExpression__ActualParametersAssignment_4_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEventExpressionAccess().getActualParametersAssignment_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventExpression__Group_4__0__Impl"


    // $ANTLR start "rule__EventExpression__Group_4__1"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2954:1: rule__EventExpression__Group_4__1 : rule__EventExpression__Group_4__1__Impl ;
    public final void rule__EventExpression__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2958:1: ( rule__EventExpression__Group_4__1__Impl )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2959:2: rule__EventExpression__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__EventExpression__Group_4__1__Impl_in_rule__EventExpression__Group_4__16053);
            rule__EventExpression__Group_4__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventExpression__Group_4__1"


    // $ANTLR start "rule__EventExpression__Group_4__1__Impl"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2965:1: rule__EventExpression__Group_4__1__Impl : ( ( rule__EventExpression__Group_4_1__0 )* ) ;
    public final void rule__EventExpression__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2969:1: ( ( ( rule__EventExpression__Group_4_1__0 )* ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2970:1: ( ( rule__EventExpression__Group_4_1__0 )* )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2970:1: ( ( rule__EventExpression__Group_4_1__0 )* )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2971:1: ( rule__EventExpression__Group_4_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventExpressionAccess().getGroup_4_1()); 
            }
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2972:1: ( rule__EventExpression__Group_4_1__0 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==39) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2972:2: rule__EventExpression__Group_4_1__0
            	    {
            	    pushFollow(FOLLOW_rule__EventExpression__Group_4_1__0_in_rule__EventExpression__Group_4__1__Impl6080);
            	    rule__EventExpression__Group_4_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEventExpressionAccess().getGroup_4_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventExpression__Group_4__1__Impl"


    // $ANTLR start "rule__EventExpression__Group_4_1__0"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2986:1: rule__EventExpression__Group_4_1__0 : rule__EventExpression__Group_4_1__0__Impl rule__EventExpression__Group_4_1__1 ;
    public final void rule__EventExpression__Group_4_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2990:1: ( rule__EventExpression__Group_4_1__0__Impl rule__EventExpression__Group_4_1__1 )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2991:2: rule__EventExpression__Group_4_1__0__Impl rule__EventExpression__Group_4_1__1
            {
            pushFollow(FOLLOW_rule__EventExpression__Group_4_1__0__Impl_in_rule__EventExpression__Group_4_1__06115);
            rule__EventExpression__Group_4_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EventExpression__Group_4_1__1_in_rule__EventExpression__Group_4_1__06118);
            rule__EventExpression__Group_4_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventExpression__Group_4_1__0"


    // $ANTLR start "rule__EventExpression__Group_4_1__0__Impl"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:2998:1: rule__EventExpression__Group_4_1__0__Impl : ( ',' ) ;
    public final void rule__EventExpression__Group_4_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3002:1: ( ( ',' ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3003:1: ( ',' )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3003:1: ( ',' )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3004:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventExpressionAccess().getCommaKeyword_4_1_0()); 
            }
            match(input,39,FOLLOW_39_in_rule__EventExpression__Group_4_1__0__Impl6146); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEventExpressionAccess().getCommaKeyword_4_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventExpression__Group_4_1__0__Impl"


    // $ANTLR start "rule__EventExpression__Group_4_1__1"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3017:1: rule__EventExpression__Group_4_1__1 : rule__EventExpression__Group_4_1__1__Impl ;
    public final void rule__EventExpression__Group_4_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3021:1: ( rule__EventExpression__Group_4_1__1__Impl )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3022:2: rule__EventExpression__Group_4_1__1__Impl
            {
            pushFollow(FOLLOW_rule__EventExpression__Group_4_1__1__Impl_in_rule__EventExpression__Group_4_1__16177);
            rule__EventExpression__Group_4_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventExpression__Group_4_1__1"


    // $ANTLR start "rule__EventExpression__Group_4_1__1__Impl"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3028:1: rule__EventExpression__Group_4_1__1__Impl : ( ( rule__EventExpression__ActualParametersAssignment_4_1_1 ) ) ;
    public final void rule__EventExpression__Group_4_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3032:1: ( ( ( rule__EventExpression__ActualParametersAssignment_4_1_1 ) ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3033:1: ( ( rule__EventExpression__ActualParametersAssignment_4_1_1 ) )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3033:1: ( ( rule__EventExpression__ActualParametersAssignment_4_1_1 ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3034:1: ( rule__EventExpression__ActualParametersAssignment_4_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventExpressionAccess().getActualParametersAssignment_4_1_1()); 
            }
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3035:1: ( rule__EventExpression__ActualParametersAssignment_4_1_1 )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3035:2: rule__EventExpression__ActualParametersAssignment_4_1_1
            {
            pushFollow(FOLLOW_rule__EventExpression__ActualParametersAssignment_4_1_1_in_rule__EventExpression__Group_4_1__1__Impl6204);
            rule__EventExpression__ActualParametersAssignment_4_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEventExpressionAccess().getActualParametersAssignment_4_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventExpression__Group_4_1__1__Impl"


    // $ANTLR start "rule__EventRelation__Group__0"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3049:1: rule__EventRelation__Group__0 : rule__EventRelation__Group__0__Impl rule__EventRelation__Group__1 ;
    public final void rule__EventRelation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3053:1: ( rule__EventRelation__Group__0__Impl rule__EventRelation__Group__1 )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3054:2: rule__EventRelation__Group__0__Impl rule__EventRelation__Group__1
            {
            pushFollow(FOLLOW_rule__EventRelation__Group__0__Impl_in_rule__EventRelation__Group__06238);
            rule__EventRelation__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EventRelation__Group__1_in_rule__EventRelation__Group__06241);
            rule__EventRelation__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventRelation__Group__0"


    // $ANTLR start "rule__EventRelation__Group__0__Impl"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3061:1: rule__EventRelation__Group__0__Impl : ( () ) ;
    public final void rule__EventRelation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3065:1: ( ( () ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3066:1: ( () )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3066:1: ( () )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3067:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventRelationAccess().getEventRelationAction_0()); 
            }
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3068:1: ()
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3070:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEventRelationAccess().getEventRelationAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventRelation__Group__0__Impl"


    // $ANTLR start "rule__EventRelation__Group__1"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3080:1: rule__EventRelation__Group__1 : rule__EventRelation__Group__1__Impl rule__EventRelation__Group__2 ;
    public final void rule__EventRelation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3084:1: ( rule__EventRelation__Group__1__Impl rule__EventRelation__Group__2 )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3085:2: rule__EventRelation__Group__1__Impl rule__EventRelation__Group__2
            {
            pushFollow(FOLLOW_rule__EventRelation__Group__1__Impl_in_rule__EventRelation__Group__16299);
            rule__EventRelation__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EventRelation__Group__2_in_rule__EventRelation__Group__16302);
            rule__EventRelation__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventRelation__Group__1"


    // $ANTLR start "rule__EventRelation__Group__1__Impl"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3092:1: rule__EventRelation__Group__1__Impl : ( ( rule__EventRelation__DeclarationAssignment_1 ) ) ;
    public final void rule__EventRelation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3096:1: ( ( ( rule__EventRelation__DeclarationAssignment_1 ) ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3097:1: ( ( rule__EventRelation__DeclarationAssignment_1 ) )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3097:1: ( ( rule__EventRelation__DeclarationAssignment_1 ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3098:1: ( rule__EventRelation__DeclarationAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventRelationAccess().getDeclarationAssignment_1()); 
            }
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3099:1: ( rule__EventRelation__DeclarationAssignment_1 )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3099:2: rule__EventRelation__DeclarationAssignment_1
            {
            pushFollow(FOLLOW_rule__EventRelation__DeclarationAssignment_1_in_rule__EventRelation__Group__1__Impl6329);
            rule__EventRelation__DeclarationAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEventRelationAccess().getDeclarationAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventRelation__Group__1__Impl"


    // $ANTLR start "rule__EventRelation__Group__2"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3109:1: rule__EventRelation__Group__2 : rule__EventRelation__Group__2__Impl rule__EventRelation__Group__3 ;
    public final void rule__EventRelation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3113:1: ( rule__EventRelation__Group__2__Impl rule__EventRelation__Group__3 )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3114:2: rule__EventRelation__Group__2__Impl rule__EventRelation__Group__3
            {
            pushFollow(FOLLOW_rule__EventRelation__Group__2__Impl_in_rule__EventRelation__Group__26359);
            rule__EventRelation__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EventRelation__Group__3_in_rule__EventRelation__Group__26362);
            rule__EventRelation__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventRelation__Group__2"


    // $ANTLR start "rule__EventRelation__Group__2__Impl"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3121:1: rule__EventRelation__Group__2__Impl : ( '(' ) ;
    public final void rule__EventRelation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3125:1: ( ( '(' ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3126:1: ( '(' )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3126:1: ( '(' )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3127:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventRelationAccess().getLeftParenthesisKeyword_2()); 
            }
            match(input,35,FOLLOW_35_in_rule__EventRelation__Group__2__Impl6390); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEventRelationAccess().getLeftParenthesisKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventRelation__Group__2__Impl"


    // $ANTLR start "rule__EventRelation__Group__3"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3140:1: rule__EventRelation__Group__3 : rule__EventRelation__Group__3__Impl rule__EventRelation__Group__4 ;
    public final void rule__EventRelation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3144:1: ( rule__EventRelation__Group__3__Impl rule__EventRelation__Group__4 )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3145:2: rule__EventRelation__Group__3__Impl rule__EventRelation__Group__4
            {
            pushFollow(FOLLOW_rule__EventRelation__Group__3__Impl_in_rule__EventRelation__Group__36421);
            rule__EventRelation__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EventRelation__Group__4_in_rule__EventRelation__Group__36424);
            rule__EventRelation__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventRelation__Group__3"


    // $ANTLR start "rule__EventRelation__Group__3__Impl"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3152:1: rule__EventRelation__Group__3__Impl : ( ( rule__EventRelation__Group_3__0 )? ) ;
    public final void rule__EventRelation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3156:1: ( ( ( rule__EventRelation__Group_3__0 )? ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3157:1: ( ( rule__EventRelation__Group_3__0 )? )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3157:1: ( ( rule__EventRelation__Group_3__0 )? )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3158:1: ( rule__EventRelation__Group_3__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventRelationAccess().getGroup_3()); 
            }
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3159:1: ( rule__EventRelation__Group_3__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==RULE_ID) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3159:2: rule__EventRelation__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__EventRelation__Group_3__0_in_rule__EventRelation__Group__3__Impl6451);
                    rule__EventRelation__Group_3__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEventRelationAccess().getGroup_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventRelation__Group__3__Impl"


    // $ANTLR start "rule__EventRelation__Group__4"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3169:1: rule__EventRelation__Group__4 : rule__EventRelation__Group__4__Impl ;
    public final void rule__EventRelation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3173:1: ( rule__EventRelation__Group__4__Impl )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3174:2: rule__EventRelation__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__EventRelation__Group__4__Impl_in_rule__EventRelation__Group__46482);
            rule__EventRelation__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventRelation__Group__4"


    // $ANTLR start "rule__EventRelation__Group__4__Impl"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3180:1: rule__EventRelation__Group__4__Impl : ( ')' ) ;
    public final void rule__EventRelation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3184:1: ( ( ')' ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3185:1: ( ')' )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3185:1: ( ')' )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3186:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventRelationAccess().getRightParenthesisKeyword_4()); 
            }
            match(input,36,FOLLOW_36_in_rule__EventRelation__Group__4__Impl6510); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEventRelationAccess().getRightParenthesisKeyword_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventRelation__Group__4__Impl"


    // $ANTLR start "rule__EventRelation__Group_3__0"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3209:1: rule__EventRelation__Group_3__0 : rule__EventRelation__Group_3__0__Impl rule__EventRelation__Group_3__1 ;
    public final void rule__EventRelation__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3213:1: ( rule__EventRelation__Group_3__0__Impl rule__EventRelation__Group_3__1 )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3214:2: rule__EventRelation__Group_3__0__Impl rule__EventRelation__Group_3__1
            {
            pushFollow(FOLLOW_rule__EventRelation__Group_3__0__Impl_in_rule__EventRelation__Group_3__06551);
            rule__EventRelation__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EventRelation__Group_3__1_in_rule__EventRelation__Group_3__06554);
            rule__EventRelation__Group_3__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventRelation__Group_3__0"


    // $ANTLR start "rule__EventRelation__Group_3__0__Impl"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3221:1: rule__EventRelation__Group_3__0__Impl : ( ( rule__EventRelation__ActualParametersAssignment_3_0 ) ) ;
    public final void rule__EventRelation__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3225:1: ( ( ( rule__EventRelation__ActualParametersAssignment_3_0 ) ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3226:1: ( ( rule__EventRelation__ActualParametersAssignment_3_0 ) )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3226:1: ( ( rule__EventRelation__ActualParametersAssignment_3_0 ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3227:1: ( rule__EventRelation__ActualParametersAssignment_3_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventRelationAccess().getActualParametersAssignment_3_0()); 
            }
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3228:1: ( rule__EventRelation__ActualParametersAssignment_3_0 )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3228:2: rule__EventRelation__ActualParametersAssignment_3_0
            {
            pushFollow(FOLLOW_rule__EventRelation__ActualParametersAssignment_3_0_in_rule__EventRelation__Group_3__0__Impl6581);
            rule__EventRelation__ActualParametersAssignment_3_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEventRelationAccess().getActualParametersAssignment_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventRelation__Group_3__0__Impl"


    // $ANTLR start "rule__EventRelation__Group_3__1"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3238:1: rule__EventRelation__Group_3__1 : rule__EventRelation__Group_3__1__Impl ;
    public final void rule__EventRelation__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3242:1: ( rule__EventRelation__Group_3__1__Impl )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3243:2: rule__EventRelation__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__EventRelation__Group_3__1__Impl_in_rule__EventRelation__Group_3__16611);
            rule__EventRelation__Group_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventRelation__Group_3__1"


    // $ANTLR start "rule__EventRelation__Group_3__1__Impl"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3249:1: rule__EventRelation__Group_3__1__Impl : ( ( rule__EventRelation__Group_3_1__0 )* ) ;
    public final void rule__EventRelation__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3253:1: ( ( ( rule__EventRelation__Group_3_1__0 )* ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3254:1: ( ( rule__EventRelation__Group_3_1__0 )* )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3254:1: ( ( rule__EventRelation__Group_3_1__0 )* )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3255:1: ( rule__EventRelation__Group_3_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventRelationAccess().getGroup_3_1()); 
            }
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3256:1: ( rule__EventRelation__Group_3_1__0 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==39) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3256:2: rule__EventRelation__Group_3_1__0
            	    {
            	    pushFollow(FOLLOW_rule__EventRelation__Group_3_1__0_in_rule__EventRelation__Group_3__1__Impl6638);
            	    rule__EventRelation__Group_3_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEventRelationAccess().getGroup_3_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventRelation__Group_3__1__Impl"


    // $ANTLR start "rule__EventRelation__Group_3_1__0"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3270:1: rule__EventRelation__Group_3_1__0 : rule__EventRelation__Group_3_1__0__Impl rule__EventRelation__Group_3_1__1 ;
    public final void rule__EventRelation__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3274:1: ( rule__EventRelation__Group_3_1__0__Impl rule__EventRelation__Group_3_1__1 )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3275:2: rule__EventRelation__Group_3_1__0__Impl rule__EventRelation__Group_3_1__1
            {
            pushFollow(FOLLOW_rule__EventRelation__Group_3_1__0__Impl_in_rule__EventRelation__Group_3_1__06673);
            rule__EventRelation__Group_3_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EventRelation__Group_3_1__1_in_rule__EventRelation__Group_3_1__06676);
            rule__EventRelation__Group_3_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventRelation__Group_3_1__0"


    // $ANTLR start "rule__EventRelation__Group_3_1__0__Impl"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3282:1: rule__EventRelation__Group_3_1__0__Impl : ( ',' ) ;
    public final void rule__EventRelation__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3286:1: ( ( ',' ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3287:1: ( ',' )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3287:1: ( ',' )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3288:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventRelationAccess().getCommaKeyword_3_1_0()); 
            }
            match(input,39,FOLLOW_39_in_rule__EventRelation__Group_3_1__0__Impl6704); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEventRelationAccess().getCommaKeyword_3_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventRelation__Group_3_1__0__Impl"


    // $ANTLR start "rule__EventRelation__Group_3_1__1"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3301:1: rule__EventRelation__Group_3_1__1 : rule__EventRelation__Group_3_1__1__Impl ;
    public final void rule__EventRelation__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3305:1: ( rule__EventRelation__Group_3_1__1__Impl )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3306:2: rule__EventRelation__Group_3_1__1__Impl
            {
            pushFollow(FOLLOW_rule__EventRelation__Group_3_1__1__Impl_in_rule__EventRelation__Group_3_1__16735);
            rule__EventRelation__Group_3_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventRelation__Group_3_1__1"


    // $ANTLR start "rule__EventRelation__Group_3_1__1__Impl"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3312:1: rule__EventRelation__Group_3_1__1__Impl : ( ( rule__EventRelation__ActualParametersAssignment_3_1_1 ) ) ;
    public final void rule__EventRelation__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3316:1: ( ( ( rule__EventRelation__ActualParametersAssignment_3_1_1 ) ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3317:1: ( ( rule__EventRelation__ActualParametersAssignment_3_1_1 ) )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3317:1: ( ( rule__EventRelation__ActualParametersAssignment_3_1_1 ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3318:1: ( rule__EventRelation__ActualParametersAssignment_3_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventRelationAccess().getActualParametersAssignment_3_1_1()); 
            }
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3319:1: ( rule__EventRelation__ActualParametersAssignment_3_1_1 )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3319:2: rule__EventRelation__ActualParametersAssignment_3_1_1
            {
            pushFollow(FOLLOW_rule__EventRelation__ActualParametersAssignment_3_1_1_in_rule__EventRelation__Group_3_1__1__Impl6762);
            rule__EventRelation__ActualParametersAssignment_3_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEventRelationAccess().getActualParametersAssignment_3_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventRelation__Group_3_1__1__Impl"


    // $ANTLR start "rule__ImportLibRule__Group__0"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3333:1: rule__ImportLibRule__Group__0 : rule__ImportLibRule__Group__0__Impl rule__ImportLibRule__Group__1 ;
    public final void rule__ImportLibRule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3337:1: ( rule__ImportLibRule__Group__0__Impl rule__ImportLibRule__Group__1 )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3338:2: rule__ImportLibRule__Group__0__Impl rule__ImportLibRule__Group__1
            {
            pushFollow(FOLLOW_rule__ImportLibRule__Group__0__Impl_in_rule__ImportLibRule__Group__06796);
            rule__ImportLibRule__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ImportLibRule__Group__1_in_rule__ImportLibRule__Group__06799);
            rule__ImportLibRule__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImportLibRule__Group__0"


    // $ANTLR start "rule__ImportLibRule__Group__0__Impl"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3345:1: rule__ImportLibRule__Group__0__Impl : ( 'ImportLib' ) ;
    public final void rule__ImportLibRule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3349:1: ( ( 'ImportLib' ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3350:1: ( 'ImportLib' )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3350:1: ( 'ImportLib' )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3351:1: 'ImportLib'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportLibRuleAccess().getImportLibKeyword_0()); 
            }
            match(input,45,FOLLOW_45_in_rule__ImportLibRule__Group__0__Impl6827); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getImportLibRuleAccess().getImportLibKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImportLibRule__Group__0__Impl"


    // $ANTLR start "rule__ImportLibRule__Group__1"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3364:1: rule__ImportLibRule__Group__1 : rule__ImportLibRule__Group__1__Impl ;
    public final void rule__ImportLibRule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3368:1: ( rule__ImportLibRule__Group__1__Impl )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3369:2: rule__ImportLibRule__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__ImportLibRule__Group__1__Impl_in_rule__ImportLibRule__Group__16858);
            rule__ImportLibRule__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImportLibRule__Group__1"


    // $ANTLR start "rule__ImportLibRule__Group__1__Impl"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3375:1: rule__ImportLibRule__Group__1__Impl : ( ( rule__ImportLibRule__ImportURIAssignment_1 ) ) ;
    public final void rule__ImportLibRule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3379:1: ( ( ( rule__ImportLibRule__ImportURIAssignment_1 ) ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3380:1: ( ( rule__ImportLibRule__ImportURIAssignment_1 ) )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3380:1: ( ( rule__ImportLibRule__ImportURIAssignment_1 ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3381:1: ( rule__ImportLibRule__ImportURIAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportLibRuleAccess().getImportURIAssignment_1()); 
            }
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3382:1: ( rule__ImportLibRule__ImportURIAssignment_1 )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3382:2: rule__ImportLibRule__ImportURIAssignment_1
            {
            pushFollow(FOLLOW_rule__ImportLibRule__ImportURIAssignment_1_in_rule__ImportLibRule__Group__1__Impl6885);
            rule__ImportLibRule__ImportURIAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getImportLibRuleAccess().getImportURIAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImportLibRule__Group__1__Impl"


    // $ANTLR start "rule__ImportInterfaceRule__Group__0"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3396:1: rule__ImportInterfaceRule__Group__0 : rule__ImportInterfaceRule__Group__0__Impl rule__ImportInterfaceRule__Group__1 ;
    public final void rule__ImportInterfaceRule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3400:1: ( rule__ImportInterfaceRule__Group__0__Impl rule__ImportInterfaceRule__Group__1 )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3401:2: rule__ImportInterfaceRule__Group__0__Impl rule__ImportInterfaceRule__Group__1
            {
            pushFollow(FOLLOW_rule__ImportInterfaceRule__Group__0__Impl_in_rule__ImportInterfaceRule__Group__06919);
            rule__ImportInterfaceRule__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ImportInterfaceRule__Group__1_in_rule__ImportInterfaceRule__Group__06922);
            rule__ImportInterfaceRule__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImportInterfaceRule__Group__0"


    // $ANTLR start "rule__ImportInterfaceRule__Group__0__Impl"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3408:1: rule__ImportInterfaceRule__Group__0__Impl : ( 'ImportInterface' ) ;
    public final void rule__ImportInterfaceRule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3412:1: ( ( 'ImportInterface' ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3413:1: ( 'ImportInterface' )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3413:1: ( 'ImportInterface' )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3414:1: 'ImportInterface'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportInterfaceRuleAccess().getImportInterfaceKeyword_0()); 
            }
            match(input,46,FOLLOW_46_in_rule__ImportInterfaceRule__Group__0__Impl6950); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getImportInterfaceRuleAccess().getImportInterfaceKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImportInterfaceRule__Group__0__Impl"


    // $ANTLR start "rule__ImportInterfaceRule__Group__1"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3427:1: rule__ImportInterfaceRule__Group__1 : rule__ImportInterfaceRule__Group__1__Impl rule__ImportInterfaceRule__Group__2 ;
    public final void rule__ImportInterfaceRule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3431:1: ( rule__ImportInterfaceRule__Group__1__Impl rule__ImportInterfaceRule__Group__2 )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3432:2: rule__ImportInterfaceRule__Group__1__Impl rule__ImportInterfaceRule__Group__2
            {
            pushFollow(FOLLOW_rule__ImportInterfaceRule__Group__1__Impl_in_rule__ImportInterfaceRule__Group__16981);
            rule__ImportInterfaceRule__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ImportInterfaceRule__Group__2_in_rule__ImportInterfaceRule__Group__16984);
            rule__ImportInterfaceRule__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImportInterfaceRule__Group__1"


    // $ANTLR start "rule__ImportInterfaceRule__Group__1__Impl"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3439:1: rule__ImportInterfaceRule__Group__1__Impl : ( ( rule__ImportInterfaceRule__ImportURIAssignment_1 ) ) ;
    public final void rule__ImportInterfaceRule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3443:1: ( ( ( rule__ImportInterfaceRule__ImportURIAssignment_1 ) ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3444:1: ( ( rule__ImportInterfaceRule__ImportURIAssignment_1 ) )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3444:1: ( ( rule__ImportInterfaceRule__ImportURIAssignment_1 ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3445:1: ( rule__ImportInterfaceRule__ImportURIAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportInterfaceRuleAccess().getImportURIAssignment_1()); 
            }
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3446:1: ( rule__ImportInterfaceRule__ImportURIAssignment_1 )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3446:2: rule__ImportInterfaceRule__ImportURIAssignment_1
            {
            pushFollow(FOLLOW_rule__ImportInterfaceRule__ImportURIAssignment_1_in_rule__ImportInterfaceRule__Group__1__Impl7011);
            rule__ImportInterfaceRule__ImportURIAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getImportInterfaceRuleAccess().getImportURIAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImportInterfaceRule__Group__1__Impl"


    // $ANTLR start "rule__ImportInterfaceRule__Group__2"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3456:1: rule__ImportInterfaceRule__Group__2 : rule__ImportInterfaceRule__Group__2__Impl rule__ImportInterfaceRule__Group__3 ;
    public final void rule__ImportInterfaceRule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3460:1: ( rule__ImportInterfaceRule__Group__2__Impl rule__ImportInterfaceRule__Group__3 )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3461:2: rule__ImportInterfaceRule__Group__2__Impl rule__ImportInterfaceRule__Group__3
            {
            pushFollow(FOLLOW_rule__ImportInterfaceRule__Group__2__Impl_in_rule__ImportInterfaceRule__Group__27041);
            rule__ImportInterfaceRule__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ImportInterfaceRule__Group__3_in_rule__ImportInterfaceRule__Group__27044);
            rule__ImportInterfaceRule__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImportInterfaceRule__Group__2"


    // $ANTLR start "rule__ImportInterfaceRule__Group__2__Impl"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3468:1: rule__ImportInterfaceRule__Group__2__Impl : ( 'as' ) ;
    public final void rule__ImportInterfaceRule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3472:1: ( ( 'as' ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3473:1: ( 'as' )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3473:1: ( 'as' )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3474:1: 'as'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportInterfaceRuleAccess().getAsKeyword_2()); 
            }
            match(input,47,FOLLOW_47_in_rule__ImportInterfaceRule__Group__2__Impl7072); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getImportInterfaceRuleAccess().getAsKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImportInterfaceRule__Group__2__Impl"


    // $ANTLR start "rule__ImportInterfaceRule__Group__3"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3487:1: rule__ImportInterfaceRule__Group__3 : rule__ImportInterfaceRule__Group__3__Impl ;
    public final void rule__ImportInterfaceRule__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3491:1: ( rule__ImportInterfaceRule__Group__3__Impl )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3492:2: rule__ImportInterfaceRule__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__ImportInterfaceRule__Group__3__Impl_in_rule__ImportInterfaceRule__Group__37103);
            rule__ImportInterfaceRule__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImportInterfaceRule__Group__3"


    // $ANTLR start "rule__ImportInterfaceRule__Group__3__Impl"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3498:1: rule__ImportInterfaceRule__Group__3__Impl : ( ( rule__ImportInterfaceRule__NameAssignment_3 ) ) ;
    public final void rule__ImportInterfaceRule__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3502:1: ( ( ( rule__ImportInterfaceRule__NameAssignment_3 ) ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3503:1: ( ( rule__ImportInterfaceRule__NameAssignment_3 ) )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3503:1: ( ( rule__ImportInterfaceRule__NameAssignment_3 ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3504:1: ( rule__ImportInterfaceRule__NameAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportInterfaceRuleAccess().getNameAssignment_3()); 
            }
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3505:1: ( rule__ImportInterfaceRule__NameAssignment_3 )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3505:2: rule__ImportInterfaceRule__NameAssignment_3
            {
            pushFollow(FOLLOW_rule__ImportInterfaceRule__NameAssignment_3_in_rule__ImportInterfaceRule__Group__3__Impl7130);
            rule__ImportInterfaceRule__NameAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getImportInterfaceRuleAccess().getNameAssignment_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImportInterfaceRule__Group__3__Impl"


    // $ANTLR start "rule__GImportStatement__Group__0"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3526:1: rule__GImportStatement__Group__0 : rule__GImportStatement__Group__0__Impl rule__GImportStatement__Group__1 ;
    public final void rule__GImportStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3530:1: ( rule__GImportStatement__Group__0__Impl rule__GImportStatement__Group__1 )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3531:2: rule__GImportStatement__Group__0__Impl rule__GImportStatement__Group__1
            {
            pushFollow(FOLLOW_rule__GImportStatement__Group__0__Impl_in_rule__GImportStatement__Group__07171);
            rule__GImportStatement__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__GImportStatement__Group__1_in_rule__GImportStatement__Group__07174);
            rule__GImportStatement__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GImportStatement__Group__0"


    // $ANTLR start "rule__GImportStatement__Group__0__Impl"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3538:1: rule__GImportStatement__Group__0__Impl : ( 'import' ) ;
    public final void rule__GImportStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3542:1: ( ( 'import' ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3543:1: ( 'import' )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3543:1: ( 'import' )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3544:1: 'import'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGImportStatementAccess().getImportKeyword_0()); 
            }
            match(input,48,FOLLOW_48_in_rule__GImportStatement__Group__0__Impl7202); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGImportStatementAccess().getImportKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GImportStatement__Group__0__Impl"


    // $ANTLR start "rule__GImportStatement__Group__1"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3557:1: rule__GImportStatement__Group__1 : rule__GImportStatement__Group__1__Impl ;
    public final void rule__GImportStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3561:1: ( rule__GImportStatement__Group__1__Impl )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3562:2: rule__GImportStatement__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__GImportStatement__Group__1__Impl_in_rule__GImportStatement__Group__17233);
            rule__GImportStatement__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GImportStatement__Group__1"


    // $ANTLR start "rule__GImportStatement__Group__1__Impl"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3568:1: rule__GImportStatement__Group__1__Impl : ( ( rule__GImportStatement__ImportURIAssignment_1 ) ) ;
    public final void rule__GImportStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3572:1: ( ( ( rule__GImportStatement__ImportURIAssignment_1 ) ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3573:1: ( ( rule__GImportStatement__ImportURIAssignment_1 ) )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3573:1: ( ( rule__GImportStatement__ImportURIAssignment_1 ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3574:1: ( rule__GImportStatement__ImportURIAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGImportStatementAccess().getImportURIAssignment_1()); 
            }
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3575:1: ( rule__GImportStatement__ImportURIAssignment_1 )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3575:2: rule__GImportStatement__ImportURIAssignment_1
            {
            pushFollow(FOLLOW_rule__GImportStatement__ImportURIAssignment_1_in_rule__GImportStatement__Group__1__Impl7260);
            rule__GImportStatement__ImportURIAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGImportStatementAccess().getImportURIAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GImportStatement__Group__1__Impl"


    // $ANTLR start "rule__GOrExpression__Group__0"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3589:1: rule__GOrExpression__Group__0 : rule__GOrExpression__Group__0__Impl rule__GOrExpression__Group__1 ;
    public final void rule__GOrExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3593:1: ( rule__GOrExpression__Group__0__Impl rule__GOrExpression__Group__1 )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3594:2: rule__GOrExpression__Group__0__Impl rule__GOrExpression__Group__1
            {
            pushFollow(FOLLOW_rule__GOrExpression__Group__0__Impl_in_rule__GOrExpression__Group__07294);
            rule__GOrExpression__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__GOrExpression__Group__1_in_rule__GOrExpression__Group__07297);
            rule__GOrExpression__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GOrExpression__Group__0"


    // $ANTLR start "rule__GOrExpression__Group__0__Impl"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3601:1: rule__GOrExpression__Group__0__Impl : ( ruleGXorExpression ) ;
    public final void rule__GOrExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3605:1: ( ( ruleGXorExpression ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3606:1: ( ruleGXorExpression )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3606:1: ( ruleGXorExpression )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3607:1: ruleGXorExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGOrExpressionAccess().getGXorExpressionParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleGXorExpression_in_rule__GOrExpression__Group__0__Impl7324);
            ruleGXorExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGOrExpressionAccess().getGXorExpressionParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GOrExpression__Group__0__Impl"


    // $ANTLR start "rule__GOrExpression__Group__1"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3618:1: rule__GOrExpression__Group__1 : rule__GOrExpression__Group__1__Impl ;
    public final void rule__GOrExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3622:1: ( rule__GOrExpression__Group__1__Impl )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3623:2: rule__GOrExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__GOrExpression__Group__1__Impl_in_rule__GOrExpression__Group__17353);
            rule__GOrExpression__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GOrExpression__Group__1"


    // $ANTLR start "rule__GOrExpression__Group__1__Impl"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3629:1: rule__GOrExpression__Group__1__Impl : ( ( rule__GOrExpression__Group_1__0 )* ) ;
    public final void rule__GOrExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3633:1: ( ( ( rule__GOrExpression__Group_1__0 )* ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3634:1: ( ( rule__GOrExpression__Group_1__0 )* )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3634:1: ( ( rule__GOrExpression__Group_1__0 )* )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3635:1: ( rule__GOrExpression__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGOrExpressionAccess().getGroup_1()); 
            }
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3636:1: ( rule__GOrExpression__Group_1__0 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==15) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3636:2: rule__GOrExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__GOrExpression__Group_1__0_in_rule__GOrExpression__Group__1__Impl7380);
            	    rule__GOrExpression__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGOrExpressionAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GOrExpression__Group__1__Impl"


    // $ANTLR start "rule__GOrExpression__Group_1__0"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3650:1: rule__GOrExpression__Group_1__0 : rule__GOrExpression__Group_1__0__Impl rule__GOrExpression__Group_1__1 ;
    public final void rule__GOrExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3654:1: ( rule__GOrExpression__Group_1__0__Impl rule__GOrExpression__Group_1__1 )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3655:2: rule__GOrExpression__Group_1__0__Impl rule__GOrExpression__Group_1__1
            {
            pushFollow(FOLLOW_rule__GOrExpression__Group_1__0__Impl_in_rule__GOrExpression__Group_1__07415);
            rule__GOrExpression__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__GOrExpression__Group_1__1_in_rule__GOrExpression__Group_1__07418);
            rule__GOrExpression__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GOrExpression__Group_1__0"


    // $ANTLR start "rule__GOrExpression__Group_1__0__Impl"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3662:1: rule__GOrExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__GOrExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3666:1: ( ( () ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3667:1: ( () )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3667:1: ( () )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3668:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGOrExpressionAccess().getGOrExpressionLeftOperandAction_1_0()); 
            }
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3669:1: ()
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3671:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGOrExpressionAccess().getGOrExpressionLeftOperandAction_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GOrExpression__Group_1__0__Impl"


    // $ANTLR start "rule__GOrExpression__Group_1__1"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3681:1: rule__GOrExpression__Group_1__1 : rule__GOrExpression__Group_1__1__Impl rule__GOrExpression__Group_1__2 ;
    public final void rule__GOrExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3685:1: ( rule__GOrExpression__Group_1__1__Impl rule__GOrExpression__Group_1__2 )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3686:2: rule__GOrExpression__Group_1__1__Impl rule__GOrExpression__Group_1__2
            {
            pushFollow(FOLLOW_rule__GOrExpression__Group_1__1__Impl_in_rule__GOrExpression__Group_1__17476);
            rule__GOrExpression__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__GOrExpression__Group_1__2_in_rule__GOrExpression__Group_1__17479);
            rule__GOrExpression__Group_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GOrExpression__Group_1__1"


    // $ANTLR start "rule__GOrExpression__Group_1__1__Impl"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3693:1: rule__GOrExpression__Group_1__1__Impl : ( ( rule__GOrExpression__OperatorAssignment_1_1 ) ) ;
    public final void rule__GOrExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3697:1: ( ( ( rule__GOrExpression__OperatorAssignment_1_1 ) ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3698:1: ( ( rule__GOrExpression__OperatorAssignment_1_1 ) )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3698:1: ( ( rule__GOrExpression__OperatorAssignment_1_1 ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3699:1: ( rule__GOrExpression__OperatorAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGOrExpressionAccess().getOperatorAssignment_1_1()); 
            }
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3700:1: ( rule__GOrExpression__OperatorAssignment_1_1 )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3700:2: rule__GOrExpression__OperatorAssignment_1_1
            {
            pushFollow(FOLLOW_rule__GOrExpression__OperatorAssignment_1_1_in_rule__GOrExpression__Group_1__1__Impl7506);
            rule__GOrExpression__OperatorAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGOrExpressionAccess().getOperatorAssignment_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GOrExpression__Group_1__1__Impl"


    // $ANTLR start "rule__GOrExpression__Group_1__2"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3710:1: rule__GOrExpression__Group_1__2 : rule__GOrExpression__Group_1__2__Impl ;
    public final void rule__GOrExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3714:1: ( rule__GOrExpression__Group_1__2__Impl )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3715:2: rule__GOrExpression__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__GOrExpression__Group_1__2__Impl_in_rule__GOrExpression__Group_1__27536);
            rule__GOrExpression__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GOrExpression__Group_1__2"


    // $ANTLR start "rule__GOrExpression__Group_1__2__Impl"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3721:1: rule__GOrExpression__Group_1__2__Impl : ( ( rule__GOrExpression__RightOperandAssignment_1_2 ) ) ;
    public final void rule__GOrExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3725:1: ( ( ( rule__GOrExpression__RightOperandAssignment_1_2 ) ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3726:1: ( ( rule__GOrExpression__RightOperandAssignment_1_2 ) )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3726:1: ( ( rule__GOrExpression__RightOperandAssignment_1_2 ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3727:1: ( rule__GOrExpression__RightOperandAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGOrExpressionAccess().getRightOperandAssignment_1_2()); 
            }
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3728:1: ( rule__GOrExpression__RightOperandAssignment_1_2 )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3728:2: rule__GOrExpression__RightOperandAssignment_1_2
            {
            pushFollow(FOLLOW_rule__GOrExpression__RightOperandAssignment_1_2_in_rule__GOrExpression__Group_1__2__Impl7563);
            rule__GOrExpression__RightOperandAssignment_1_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGOrExpressionAccess().getRightOperandAssignment_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GOrExpression__Group_1__2__Impl"


    // $ANTLR start "rule__GXorExpression__Group__0"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3744:1: rule__GXorExpression__Group__0 : rule__GXorExpression__Group__0__Impl rule__GXorExpression__Group__1 ;
    public final void rule__GXorExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3748:1: ( rule__GXorExpression__Group__0__Impl rule__GXorExpression__Group__1 )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3749:2: rule__GXorExpression__Group__0__Impl rule__GXorExpression__Group__1
            {
            pushFollow(FOLLOW_rule__GXorExpression__Group__0__Impl_in_rule__GXorExpression__Group__07599);
            rule__GXorExpression__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__GXorExpression__Group__1_in_rule__GXorExpression__Group__07602);
            rule__GXorExpression__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GXorExpression__Group__0"


    // $ANTLR start "rule__GXorExpression__Group__0__Impl"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3756:1: rule__GXorExpression__Group__0__Impl : ( ruleGAndExpression ) ;
    public final void rule__GXorExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3760:1: ( ( ruleGAndExpression ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3761:1: ( ruleGAndExpression )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3761:1: ( ruleGAndExpression )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3762:1: ruleGAndExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGXorExpressionAccess().getGAndExpressionParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleGAndExpression_in_rule__GXorExpression__Group__0__Impl7629);
            ruleGAndExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGXorExpressionAccess().getGAndExpressionParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GXorExpression__Group__0__Impl"


    // $ANTLR start "rule__GXorExpression__Group__1"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3773:1: rule__GXorExpression__Group__1 : rule__GXorExpression__Group__1__Impl ;
    public final void rule__GXorExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3777:1: ( rule__GXorExpression__Group__1__Impl )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3778:2: rule__GXorExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__GXorExpression__Group__1__Impl_in_rule__GXorExpression__Group__17658);
            rule__GXorExpression__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GXorExpression__Group__1"


    // $ANTLR start "rule__GXorExpression__Group__1__Impl"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3784:1: rule__GXorExpression__Group__1__Impl : ( ( rule__GXorExpression__Group_1__0 )* ) ;
    public final void rule__GXorExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3788:1: ( ( ( rule__GXorExpression__Group_1__0 )* ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3789:1: ( ( rule__GXorExpression__Group_1__0 )* )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3789:1: ( ( rule__GXorExpression__Group_1__0 )* )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3790:1: ( rule__GXorExpression__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGXorExpressionAccess().getGroup_1()); 
            }
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3791:1: ( rule__GXorExpression__Group_1__0 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==14) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3791:2: rule__GXorExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__GXorExpression__Group_1__0_in_rule__GXorExpression__Group__1__Impl7685);
            	    rule__GXorExpression__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGXorExpressionAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GXorExpression__Group__1__Impl"


    // $ANTLR start "rule__GXorExpression__Group_1__0"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3805:1: rule__GXorExpression__Group_1__0 : rule__GXorExpression__Group_1__0__Impl rule__GXorExpression__Group_1__1 ;
    public final void rule__GXorExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3809:1: ( rule__GXorExpression__Group_1__0__Impl rule__GXorExpression__Group_1__1 )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3810:2: rule__GXorExpression__Group_1__0__Impl rule__GXorExpression__Group_1__1
            {
            pushFollow(FOLLOW_rule__GXorExpression__Group_1__0__Impl_in_rule__GXorExpression__Group_1__07720);
            rule__GXorExpression__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__GXorExpression__Group_1__1_in_rule__GXorExpression__Group_1__07723);
            rule__GXorExpression__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GXorExpression__Group_1__0"


    // $ANTLR start "rule__GXorExpression__Group_1__0__Impl"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3817:1: rule__GXorExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__GXorExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3821:1: ( ( () ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3822:1: ( () )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3822:1: ( () )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3823:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGXorExpressionAccess().getGXorExpressionLeftOperandAction_1_0()); 
            }
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3824:1: ()
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3826:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGXorExpressionAccess().getGXorExpressionLeftOperandAction_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GXorExpression__Group_1__0__Impl"


    // $ANTLR start "rule__GXorExpression__Group_1__1"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3836:1: rule__GXorExpression__Group_1__1 : rule__GXorExpression__Group_1__1__Impl rule__GXorExpression__Group_1__2 ;
    public final void rule__GXorExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3840:1: ( rule__GXorExpression__Group_1__1__Impl rule__GXorExpression__Group_1__2 )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3841:2: rule__GXorExpression__Group_1__1__Impl rule__GXorExpression__Group_1__2
            {
            pushFollow(FOLLOW_rule__GXorExpression__Group_1__1__Impl_in_rule__GXorExpression__Group_1__17781);
            rule__GXorExpression__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__GXorExpression__Group_1__2_in_rule__GXorExpression__Group_1__17784);
            rule__GXorExpression__Group_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GXorExpression__Group_1__1"


    // $ANTLR start "rule__GXorExpression__Group_1__1__Impl"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3848:1: rule__GXorExpression__Group_1__1__Impl : ( ( rule__GXorExpression__OperatorAssignment_1_1 ) ) ;
    public final void rule__GXorExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3852:1: ( ( ( rule__GXorExpression__OperatorAssignment_1_1 ) ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3853:1: ( ( rule__GXorExpression__OperatorAssignment_1_1 ) )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3853:1: ( ( rule__GXorExpression__OperatorAssignment_1_1 ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3854:1: ( rule__GXorExpression__OperatorAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGXorExpressionAccess().getOperatorAssignment_1_1()); 
            }
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3855:1: ( rule__GXorExpression__OperatorAssignment_1_1 )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3855:2: rule__GXorExpression__OperatorAssignment_1_1
            {
            pushFollow(FOLLOW_rule__GXorExpression__OperatorAssignment_1_1_in_rule__GXorExpression__Group_1__1__Impl7811);
            rule__GXorExpression__OperatorAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGXorExpressionAccess().getOperatorAssignment_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GXorExpression__Group_1__1__Impl"


    // $ANTLR start "rule__GXorExpression__Group_1__2"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3865:1: rule__GXorExpression__Group_1__2 : rule__GXorExpression__Group_1__2__Impl ;
    public final void rule__GXorExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3869:1: ( rule__GXorExpression__Group_1__2__Impl )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3870:2: rule__GXorExpression__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__GXorExpression__Group_1__2__Impl_in_rule__GXorExpression__Group_1__27841);
            rule__GXorExpression__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GXorExpression__Group_1__2"


    // $ANTLR start "rule__GXorExpression__Group_1__2__Impl"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3876:1: rule__GXorExpression__Group_1__2__Impl : ( ( rule__GXorExpression__RightOperandAssignment_1_2 ) ) ;
    public final void rule__GXorExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3880:1: ( ( ( rule__GXorExpression__RightOperandAssignment_1_2 ) ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3881:1: ( ( rule__GXorExpression__RightOperandAssignment_1_2 ) )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3881:1: ( ( rule__GXorExpression__RightOperandAssignment_1_2 ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3882:1: ( rule__GXorExpression__RightOperandAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGXorExpressionAccess().getRightOperandAssignment_1_2()); 
            }
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3883:1: ( rule__GXorExpression__RightOperandAssignment_1_2 )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3883:2: rule__GXorExpression__RightOperandAssignment_1_2
            {
            pushFollow(FOLLOW_rule__GXorExpression__RightOperandAssignment_1_2_in_rule__GXorExpression__Group_1__2__Impl7868);
            rule__GXorExpression__RightOperandAssignment_1_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGXorExpressionAccess().getRightOperandAssignment_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GXorExpression__Group_1__2__Impl"


    // $ANTLR start "rule__GAndExpression__Group__0"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3899:1: rule__GAndExpression__Group__0 : rule__GAndExpression__Group__0__Impl rule__GAndExpression__Group__1 ;
    public final void rule__GAndExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3903:1: ( rule__GAndExpression__Group__0__Impl rule__GAndExpression__Group__1 )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3904:2: rule__GAndExpression__Group__0__Impl rule__GAndExpression__Group__1
            {
            pushFollow(FOLLOW_rule__GAndExpression__Group__0__Impl_in_rule__GAndExpression__Group__07904);
            rule__GAndExpression__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__GAndExpression__Group__1_in_rule__GAndExpression__Group__07907);
            rule__GAndExpression__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GAndExpression__Group__0"


    // $ANTLR start "rule__GAndExpression__Group__0__Impl"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3911:1: rule__GAndExpression__Group__0__Impl : ( ruleGEqualityExpression ) ;
    public final void rule__GAndExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3915:1: ( ( ruleGEqualityExpression ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3916:1: ( ruleGEqualityExpression )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3916:1: ( ruleGEqualityExpression )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3917:1: ruleGEqualityExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGAndExpressionAccess().getGEqualityExpressionParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleGEqualityExpression_in_rule__GAndExpression__Group__0__Impl7934);
            ruleGEqualityExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGAndExpressionAccess().getGEqualityExpressionParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GAndExpression__Group__0__Impl"


    // $ANTLR start "rule__GAndExpression__Group__1"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3928:1: rule__GAndExpression__Group__1 : rule__GAndExpression__Group__1__Impl ;
    public final void rule__GAndExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3932:1: ( rule__GAndExpression__Group__1__Impl )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3933:2: rule__GAndExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__GAndExpression__Group__1__Impl_in_rule__GAndExpression__Group__17963);
            rule__GAndExpression__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GAndExpression__Group__1"


    // $ANTLR start "rule__GAndExpression__Group__1__Impl"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3939:1: rule__GAndExpression__Group__1__Impl : ( ( rule__GAndExpression__Group_1__0 )* ) ;
    public final void rule__GAndExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3943:1: ( ( ( rule__GAndExpression__Group_1__0 )* ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3944:1: ( ( rule__GAndExpression__Group_1__0 )* )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3944:1: ( ( rule__GAndExpression__Group_1__0 )* )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3945:1: ( rule__GAndExpression__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGAndExpressionAccess().getGroup_1()); 
            }
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3946:1: ( rule__GAndExpression__Group_1__0 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==13) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3946:2: rule__GAndExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__GAndExpression__Group_1__0_in_rule__GAndExpression__Group__1__Impl7990);
            	    rule__GAndExpression__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGAndExpressionAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GAndExpression__Group__1__Impl"


    // $ANTLR start "rule__GAndExpression__Group_1__0"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3960:1: rule__GAndExpression__Group_1__0 : rule__GAndExpression__Group_1__0__Impl rule__GAndExpression__Group_1__1 ;
    public final void rule__GAndExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3964:1: ( rule__GAndExpression__Group_1__0__Impl rule__GAndExpression__Group_1__1 )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3965:2: rule__GAndExpression__Group_1__0__Impl rule__GAndExpression__Group_1__1
            {
            pushFollow(FOLLOW_rule__GAndExpression__Group_1__0__Impl_in_rule__GAndExpression__Group_1__08025);
            rule__GAndExpression__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__GAndExpression__Group_1__1_in_rule__GAndExpression__Group_1__08028);
            rule__GAndExpression__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GAndExpression__Group_1__0"


    // $ANTLR start "rule__GAndExpression__Group_1__0__Impl"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3972:1: rule__GAndExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__GAndExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3976:1: ( ( () ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3977:1: ( () )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3977:1: ( () )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3978:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGAndExpressionAccess().getGAndExpressionLeftOperandAction_1_0()); 
            }
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3979:1: ()
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3981:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGAndExpressionAccess().getGAndExpressionLeftOperandAction_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GAndExpression__Group_1__0__Impl"


    // $ANTLR start "rule__GAndExpression__Group_1__1"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3991:1: rule__GAndExpression__Group_1__1 : rule__GAndExpression__Group_1__1__Impl rule__GAndExpression__Group_1__2 ;
    public final void rule__GAndExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3995:1: ( rule__GAndExpression__Group_1__1__Impl rule__GAndExpression__Group_1__2 )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:3996:2: rule__GAndExpression__Group_1__1__Impl rule__GAndExpression__Group_1__2
            {
            pushFollow(FOLLOW_rule__GAndExpression__Group_1__1__Impl_in_rule__GAndExpression__Group_1__18086);
            rule__GAndExpression__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__GAndExpression__Group_1__2_in_rule__GAndExpression__Group_1__18089);
            rule__GAndExpression__Group_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GAndExpression__Group_1__1"


    // $ANTLR start "rule__GAndExpression__Group_1__1__Impl"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4003:1: rule__GAndExpression__Group_1__1__Impl : ( ( rule__GAndExpression__OperatorAssignment_1_1 ) ) ;
    public final void rule__GAndExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4007:1: ( ( ( rule__GAndExpression__OperatorAssignment_1_1 ) ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4008:1: ( ( rule__GAndExpression__OperatorAssignment_1_1 ) )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4008:1: ( ( rule__GAndExpression__OperatorAssignment_1_1 ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4009:1: ( rule__GAndExpression__OperatorAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGAndExpressionAccess().getOperatorAssignment_1_1()); 
            }
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4010:1: ( rule__GAndExpression__OperatorAssignment_1_1 )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4010:2: rule__GAndExpression__OperatorAssignment_1_1
            {
            pushFollow(FOLLOW_rule__GAndExpression__OperatorAssignment_1_1_in_rule__GAndExpression__Group_1__1__Impl8116);
            rule__GAndExpression__OperatorAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGAndExpressionAccess().getOperatorAssignment_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GAndExpression__Group_1__1__Impl"


    // $ANTLR start "rule__GAndExpression__Group_1__2"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4020:1: rule__GAndExpression__Group_1__2 : rule__GAndExpression__Group_1__2__Impl ;
    public final void rule__GAndExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4024:1: ( rule__GAndExpression__Group_1__2__Impl )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4025:2: rule__GAndExpression__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__GAndExpression__Group_1__2__Impl_in_rule__GAndExpression__Group_1__28146);
            rule__GAndExpression__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GAndExpression__Group_1__2"


    // $ANTLR start "rule__GAndExpression__Group_1__2__Impl"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4031:1: rule__GAndExpression__Group_1__2__Impl : ( ( rule__GAndExpression__RightOperandAssignment_1_2 ) ) ;
    public final void rule__GAndExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4035:1: ( ( ( rule__GAndExpression__RightOperandAssignment_1_2 ) ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4036:1: ( ( rule__GAndExpression__RightOperandAssignment_1_2 ) )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4036:1: ( ( rule__GAndExpression__RightOperandAssignment_1_2 ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4037:1: ( rule__GAndExpression__RightOperandAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGAndExpressionAccess().getRightOperandAssignment_1_2()); 
            }
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4038:1: ( rule__GAndExpression__RightOperandAssignment_1_2 )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4038:2: rule__GAndExpression__RightOperandAssignment_1_2
            {
            pushFollow(FOLLOW_rule__GAndExpression__RightOperandAssignment_1_2_in_rule__GAndExpression__Group_1__2__Impl8173);
            rule__GAndExpression__RightOperandAssignment_1_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGAndExpressionAccess().getRightOperandAssignment_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GAndExpression__Group_1__2__Impl"


    // $ANTLR start "rule__GEqualityExpression__Group__0"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4054:1: rule__GEqualityExpression__Group__0 : rule__GEqualityExpression__Group__0__Impl rule__GEqualityExpression__Group__1 ;
    public final void rule__GEqualityExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4058:1: ( rule__GEqualityExpression__Group__0__Impl rule__GEqualityExpression__Group__1 )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4059:2: rule__GEqualityExpression__Group__0__Impl rule__GEqualityExpression__Group__1
            {
            pushFollow(FOLLOW_rule__GEqualityExpression__Group__0__Impl_in_rule__GEqualityExpression__Group__08209);
            rule__GEqualityExpression__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__GEqualityExpression__Group__1_in_rule__GEqualityExpression__Group__08212);
            rule__GEqualityExpression__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GEqualityExpression__Group__0"


    // $ANTLR start "rule__GEqualityExpression__Group__0__Impl"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4066:1: rule__GEqualityExpression__Group__0__Impl : ( ruleGRelationExpression ) ;
    public final void rule__GEqualityExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4070:1: ( ( ruleGRelationExpression ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4071:1: ( ruleGRelationExpression )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4071:1: ( ruleGRelationExpression )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4072:1: ruleGRelationExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGEqualityExpressionAccess().getGRelationExpressionParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleGRelationExpression_in_rule__GEqualityExpression__Group__0__Impl8239);
            ruleGRelationExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGEqualityExpressionAccess().getGRelationExpressionParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GEqualityExpression__Group__0__Impl"


    // $ANTLR start "rule__GEqualityExpression__Group__1"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4083:1: rule__GEqualityExpression__Group__1 : rule__GEqualityExpression__Group__1__Impl ;
    public final void rule__GEqualityExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4087:1: ( rule__GEqualityExpression__Group__1__Impl )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4088:2: rule__GEqualityExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__GEqualityExpression__Group__1__Impl_in_rule__GEqualityExpression__Group__18268);
            rule__GEqualityExpression__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GEqualityExpression__Group__1"


    // $ANTLR start "rule__GEqualityExpression__Group__1__Impl"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4094:1: rule__GEqualityExpression__Group__1__Impl : ( ( rule__GEqualityExpression__Group_1__0 )* ) ;
    public final void rule__GEqualityExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4098:1: ( ( ( rule__GEqualityExpression__Group_1__0 )* ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4099:1: ( ( rule__GEqualityExpression__Group_1__0 )* )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4099:1: ( ( rule__GEqualityExpression__Group_1__0 )* )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4100:1: ( rule__GEqualityExpression__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGEqualityExpressionAccess().getGroup_1()); 
            }
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4101:1: ( rule__GEqualityExpression__Group_1__0 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( ((LA27_0>=18 && LA27_0<=19)) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4101:2: rule__GEqualityExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__GEqualityExpression__Group_1__0_in_rule__GEqualityExpression__Group__1__Impl8295);
            	    rule__GEqualityExpression__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGEqualityExpressionAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GEqualityExpression__Group__1__Impl"


    // $ANTLR start "rule__GEqualityExpression__Group_1__0"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4115:1: rule__GEqualityExpression__Group_1__0 : rule__GEqualityExpression__Group_1__0__Impl rule__GEqualityExpression__Group_1__1 ;
    public final void rule__GEqualityExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4119:1: ( rule__GEqualityExpression__Group_1__0__Impl rule__GEqualityExpression__Group_1__1 )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4120:2: rule__GEqualityExpression__Group_1__0__Impl rule__GEqualityExpression__Group_1__1
            {
            pushFollow(FOLLOW_rule__GEqualityExpression__Group_1__0__Impl_in_rule__GEqualityExpression__Group_1__08330);
            rule__GEqualityExpression__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__GEqualityExpression__Group_1__1_in_rule__GEqualityExpression__Group_1__08333);
            rule__GEqualityExpression__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GEqualityExpression__Group_1__0"


    // $ANTLR start "rule__GEqualityExpression__Group_1__0__Impl"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4127:1: rule__GEqualityExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__GEqualityExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4131:1: ( ( () ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4132:1: ( () )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4132:1: ( () )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4133:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGEqualityExpressionAccess().getGEqualityExpressionLeftOperandAction_1_0()); 
            }
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4134:1: ()
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4136:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGEqualityExpressionAccess().getGEqualityExpressionLeftOperandAction_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GEqualityExpression__Group_1__0__Impl"


    // $ANTLR start "rule__GEqualityExpression__Group_1__1"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4146:1: rule__GEqualityExpression__Group_1__1 : rule__GEqualityExpression__Group_1__1__Impl rule__GEqualityExpression__Group_1__2 ;
    public final void rule__GEqualityExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4150:1: ( rule__GEqualityExpression__Group_1__1__Impl rule__GEqualityExpression__Group_1__2 )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4151:2: rule__GEqualityExpression__Group_1__1__Impl rule__GEqualityExpression__Group_1__2
            {
            pushFollow(FOLLOW_rule__GEqualityExpression__Group_1__1__Impl_in_rule__GEqualityExpression__Group_1__18391);
            rule__GEqualityExpression__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__GEqualityExpression__Group_1__2_in_rule__GEqualityExpression__Group_1__18394);
            rule__GEqualityExpression__Group_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GEqualityExpression__Group_1__1"


    // $ANTLR start "rule__GEqualityExpression__Group_1__1__Impl"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4158:1: rule__GEqualityExpression__Group_1__1__Impl : ( ( rule__GEqualityExpression__OperatorAssignment_1_1 ) ) ;
    public final void rule__GEqualityExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4162:1: ( ( ( rule__GEqualityExpression__OperatorAssignment_1_1 ) ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4163:1: ( ( rule__GEqualityExpression__OperatorAssignment_1_1 ) )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4163:1: ( ( rule__GEqualityExpression__OperatorAssignment_1_1 ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4164:1: ( rule__GEqualityExpression__OperatorAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGEqualityExpressionAccess().getOperatorAssignment_1_1()); 
            }
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4165:1: ( rule__GEqualityExpression__OperatorAssignment_1_1 )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4165:2: rule__GEqualityExpression__OperatorAssignment_1_1
            {
            pushFollow(FOLLOW_rule__GEqualityExpression__OperatorAssignment_1_1_in_rule__GEqualityExpression__Group_1__1__Impl8421);
            rule__GEqualityExpression__OperatorAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGEqualityExpressionAccess().getOperatorAssignment_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GEqualityExpression__Group_1__1__Impl"


    // $ANTLR start "rule__GEqualityExpression__Group_1__2"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4175:1: rule__GEqualityExpression__Group_1__2 : rule__GEqualityExpression__Group_1__2__Impl ;
    public final void rule__GEqualityExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4179:1: ( rule__GEqualityExpression__Group_1__2__Impl )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4180:2: rule__GEqualityExpression__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__GEqualityExpression__Group_1__2__Impl_in_rule__GEqualityExpression__Group_1__28451);
            rule__GEqualityExpression__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GEqualityExpression__Group_1__2"


    // $ANTLR start "rule__GEqualityExpression__Group_1__2__Impl"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4186:1: rule__GEqualityExpression__Group_1__2__Impl : ( ( rule__GEqualityExpression__RightOperandAssignment_1_2 ) ) ;
    public final void rule__GEqualityExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4190:1: ( ( ( rule__GEqualityExpression__RightOperandAssignment_1_2 ) ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4191:1: ( ( rule__GEqualityExpression__RightOperandAssignment_1_2 ) )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4191:1: ( ( rule__GEqualityExpression__RightOperandAssignment_1_2 ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4192:1: ( rule__GEqualityExpression__RightOperandAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGEqualityExpressionAccess().getRightOperandAssignment_1_2()); 
            }
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4193:1: ( rule__GEqualityExpression__RightOperandAssignment_1_2 )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4193:2: rule__GEqualityExpression__RightOperandAssignment_1_2
            {
            pushFollow(FOLLOW_rule__GEqualityExpression__RightOperandAssignment_1_2_in_rule__GEqualityExpression__Group_1__2__Impl8478);
            rule__GEqualityExpression__RightOperandAssignment_1_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGEqualityExpressionAccess().getRightOperandAssignment_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GEqualityExpression__Group_1__2__Impl"


    // $ANTLR start "rule__GRelationExpression__Group__0"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4209:1: rule__GRelationExpression__Group__0 : rule__GRelationExpression__Group__0__Impl rule__GRelationExpression__Group__1 ;
    public final void rule__GRelationExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4213:1: ( rule__GRelationExpression__Group__0__Impl rule__GRelationExpression__Group__1 )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4214:2: rule__GRelationExpression__Group__0__Impl rule__GRelationExpression__Group__1
            {
            pushFollow(FOLLOW_rule__GRelationExpression__Group__0__Impl_in_rule__GRelationExpression__Group__08514);
            rule__GRelationExpression__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__GRelationExpression__Group__1_in_rule__GRelationExpression__Group__08517);
            rule__GRelationExpression__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GRelationExpression__Group__0"


    // $ANTLR start "rule__GRelationExpression__Group__0__Impl"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4221:1: rule__GRelationExpression__Group__0__Impl : ( ruleGAdditionExpression ) ;
    public final void rule__GRelationExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4225:1: ( ( ruleGAdditionExpression ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4226:1: ( ruleGAdditionExpression )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4226:1: ( ruleGAdditionExpression )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4227:1: ruleGAdditionExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGRelationExpressionAccess().getGAdditionExpressionParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleGAdditionExpression_in_rule__GRelationExpression__Group__0__Impl8544);
            ruleGAdditionExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGRelationExpressionAccess().getGAdditionExpressionParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GRelationExpression__Group__0__Impl"


    // $ANTLR start "rule__GRelationExpression__Group__1"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4238:1: rule__GRelationExpression__Group__1 : rule__GRelationExpression__Group__1__Impl ;
    public final void rule__GRelationExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4242:1: ( rule__GRelationExpression__Group__1__Impl )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4243:2: rule__GRelationExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__GRelationExpression__Group__1__Impl_in_rule__GRelationExpression__Group__18573);
            rule__GRelationExpression__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GRelationExpression__Group__1"


    // $ANTLR start "rule__GRelationExpression__Group__1__Impl"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4249:1: rule__GRelationExpression__Group__1__Impl : ( ( rule__GRelationExpression__Group_1__0 )* ) ;
    public final void rule__GRelationExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4253:1: ( ( ( rule__GRelationExpression__Group_1__0 )* ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4254:1: ( ( rule__GRelationExpression__Group_1__0 )* )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4254:1: ( ( rule__GRelationExpression__Group_1__0 )* )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4255:1: ( rule__GRelationExpression__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGRelationExpressionAccess().getGroup_1()); 
            }
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4256:1: ( rule__GRelationExpression__Group_1__0 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( ((LA28_0>=20 && LA28_0<=23)) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4256:2: rule__GRelationExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__GRelationExpression__Group_1__0_in_rule__GRelationExpression__Group__1__Impl8600);
            	    rule__GRelationExpression__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGRelationExpressionAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GRelationExpression__Group__1__Impl"


    // $ANTLR start "rule__GRelationExpression__Group_1__0"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4270:1: rule__GRelationExpression__Group_1__0 : rule__GRelationExpression__Group_1__0__Impl rule__GRelationExpression__Group_1__1 ;
    public final void rule__GRelationExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4274:1: ( rule__GRelationExpression__Group_1__0__Impl rule__GRelationExpression__Group_1__1 )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4275:2: rule__GRelationExpression__Group_1__0__Impl rule__GRelationExpression__Group_1__1
            {
            pushFollow(FOLLOW_rule__GRelationExpression__Group_1__0__Impl_in_rule__GRelationExpression__Group_1__08635);
            rule__GRelationExpression__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__GRelationExpression__Group_1__1_in_rule__GRelationExpression__Group_1__08638);
            rule__GRelationExpression__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GRelationExpression__Group_1__0"


    // $ANTLR start "rule__GRelationExpression__Group_1__0__Impl"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4282:1: rule__GRelationExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__GRelationExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4286:1: ( ( () ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4287:1: ( () )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4287:1: ( () )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4288:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGRelationExpressionAccess().getGRelationExpressionLeftOperandAction_1_0()); 
            }
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4289:1: ()
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4291:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGRelationExpressionAccess().getGRelationExpressionLeftOperandAction_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GRelationExpression__Group_1__0__Impl"


    // $ANTLR start "rule__GRelationExpression__Group_1__1"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4301:1: rule__GRelationExpression__Group_1__1 : rule__GRelationExpression__Group_1__1__Impl rule__GRelationExpression__Group_1__2 ;
    public final void rule__GRelationExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4305:1: ( rule__GRelationExpression__Group_1__1__Impl rule__GRelationExpression__Group_1__2 )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4306:2: rule__GRelationExpression__Group_1__1__Impl rule__GRelationExpression__Group_1__2
            {
            pushFollow(FOLLOW_rule__GRelationExpression__Group_1__1__Impl_in_rule__GRelationExpression__Group_1__18696);
            rule__GRelationExpression__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__GRelationExpression__Group_1__2_in_rule__GRelationExpression__Group_1__18699);
            rule__GRelationExpression__Group_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GRelationExpression__Group_1__1"


    // $ANTLR start "rule__GRelationExpression__Group_1__1__Impl"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4313:1: rule__GRelationExpression__Group_1__1__Impl : ( ( rule__GRelationExpression__OperatorAssignment_1_1 ) ) ;
    public final void rule__GRelationExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4317:1: ( ( ( rule__GRelationExpression__OperatorAssignment_1_1 ) ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4318:1: ( ( rule__GRelationExpression__OperatorAssignment_1_1 ) )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4318:1: ( ( rule__GRelationExpression__OperatorAssignment_1_1 ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4319:1: ( rule__GRelationExpression__OperatorAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGRelationExpressionAccess().getOperatorAssignment_1_1()); 
            }
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4320:1: ( rule__GRelationExpression__OperatorAssignment_1_1 )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4320:2: rule__GRelationExpression__OperatorAssignment_1_1
            {
            pushFollow(FOLLOW_rule__GRelationExpression__OperatorAssignment_1_1_in_rule__GRelationExpression__Group_1__1__Impl8726);
            rule__GRelationExpression__OperatorAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGRelationExpressionAccess().getOperatorAssignment_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GRelationExpression__Group_1__1__Impl"


    // $ANTLR start "rule__GRelationExpression__Group_1__2"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4330:1: rule__GRelationExpression__Group_1__2 : rule__GRelationExpression__Group_1__2__Impl ;
    public final void rule__GRelationExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4334:1: ( rule__GRelationExpression__Group_1__2__Impl )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4335:2: rule__GRelationExpression__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__GRelationExpression__Group_1__2__Impl_in_rule__GRelationExpression__Group_1__28756);
            rule__GRelationExpression__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GRelationExpression__Group_1__2"


    // $ANTLR start "rule__GRelationExpression__Group_1__2__Impl"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4341:1: rule__GRelationExpression__Group_1__2__Impl : ( ( rule__GRelationExpression__RightOperandAssignment_1_2 ) ) ;
    public final void rule__GRelationExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4345:1: ( ( ( rule__GRelationExpression__RightOperandAssignment_1_2 ) ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4346:1: ( ( rule__GRelationExpression__RightOperandAssignment_1_2 ) )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4346:1: ( ( rule__GRelationExpression__RightOperandAssignment_1_2 ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4347:1: ( rule__GRelationExpression__RightOperandAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGRelationExpressionAccess().getRightOperandAssignment_1_2()); 
            }
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4348:1: ( rule__GRelationExpression__RightOperandAssignment_1_2 )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4348:2: rule__GRelationExpression__RightOperandAssignment_1_2
            {
            pushFollow(FOLLOW_rule__GRelationExpression__RightOperandAssignment_1_2_in_rule__GRelationExpression__Group_1__2__Impl8783);
            rule__GRelationExpression__RightOperandAssignment_1_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGRelationExpressionAccess().getRightOperandAssignment_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GRelationExpression__Group_1__2__Impl"


    // $ANTLR start "rule__GAdditionExpression__Group__0"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4364:1: rule__GAdditionExpression__Group__0 : rule__GAdditionExpression__Group__0__Impl rule__GAdditionExpression__Group__1 ;
    public final void rule__GAdditionExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4368:1: ( rule__GAdditionExpression__Group__0__Impl rule__GAdditionExpression__Group__1 )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4369:2: rule__GAdditionExpression__Group__0__Impl rule__GAdditionExpression__Group__1
            {
            pushFollow(FOLLOW_rule__GAdditionExpression__Group__0__Impl_in_rule__GAdditionExpression__Group__08819);
            rule__GAdditionExpression__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__GAdditionExpression__Group__1_in_rule__GAdditionExpression__Group__08822);
            rule__GAdditionExpression__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GAdditionExpression__Group__0"


    // $ANTLR start "rule__GAdditionExpression__Group__0__Impl"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4376:1: rule__GAdditionExpression__Group__0__Impl : ( ruleGMultiplicationExpression ) ;
    public final void rule__GAdditionExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4380:1: ( ( ruleGMultiplicationExpression ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4381:1: ( ruleGMultiplicationExpression )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4381:1: ( ruleGMultiplicationExpression )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4382:1: ruleGMultiplicationExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGAdditionExpressionAccess().getGMultiplicationExpressionParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleGMultiplicationExpression_in_rule__GAdditionExpression__Group__0__Impl8849);
            ruleGMultiplicationExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGAdditionExpressionAccess().getGMultiplicationExpressionParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GAdditionExpression__Group__0__Impl"


    // $ANTLR start "rule__GAdditionExpression__Group__1"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4393:1: rule__GAdditionExpression__Group__1 : rule__GAdditionExpression__Group__1__Impl ;
    public final void rule__GAdditionExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4397:1: ( rule__GAdditionExpression__Group__1__Impl )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4398:2: rule__GAdditionExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__GAdditionExpression__Group__1__Impl_in_rule__GAdditionExpression__Group__18878);
            rule__GAdditionExpression__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GAdditionExpression__Group__1"


    // $ANTLR start "rule__GAdditionExpression__Group__1__Impl"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4404:1: rule__GAdditionExpression__Group__1__Impl : ( ( rule__GAdditionExpression__Group_1__0 )* ) ;
    public final void rule__GAdditionExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4408:1: ( ( ( rule__GAdditionExpression__Group_1__0 )* ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4409:1: ( ( rule__GAdditionExpression__Group_1__0 )* )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4409:1: ( ( rule__GAdditionExpression__Group_1__0 )* )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4410:1: ( rule__GAdditionExpression__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGAdditionExpressionAccess().getGroup_1()); 
            }
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4411:1: ( rule__GAdditionExpression__Group_1__0 )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( ((LA29_0>=24 && LA29_0<=25)) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4411:2: rule__GAdditionExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__GAdditionExpression__Group_1__0_in_rule__GAdditionExpression__Group__1__Impl8905);
            	    rule__GAdditionExpression__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGAdditionExpressionAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GAdditionExpression__Group__1__Impl"


    // $ANTLR start "rule__GAdditionExpression__Group_1__0"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4425:1: rule__GAdditionExpression__Group_1__0 : rule__GAdditionExpression__Group_1__0__Impl rule__GAdditionExpression__Group_1__1 ;
    public final void rule__GAdditionExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4429:1: ( rule__GAdditionExpression__Group_1__0__Impl rule__GAdditionExpression__Group_1__1 )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4430:2: rule__GAdditionExpression__Group_1__0__Impl rule__GAdditionExpression__Group_1__1
            {
            pushFollow(FOLLOW_rule__GAdditionExpression__Group_1__0__Impl_in_rule__GAdditionExpression__Group_1__08940);
            rule__GAdditionExpression__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__GAdditionExpression__Group_1__1_in_rule__GAdditionExpression__Group_1__08943);
            rule__GAdditionExpression__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GAdditionExpression__Group_1__0"


    // $ANTLR start "rule__GAdditionExpression__Group_1__0__Impl"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4437:1: rule__GAdditionExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__GAdditionExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4441:1: ( ( () ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4442:1: ( () )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4442:1: ( () )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4443:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGAdditionExpressionAccess().getGAdditionExpressionLeftOperandAction_1_0()); 
            }
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4444:1: ()
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4446:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGAdditionExpressionAccess().getGAdditionExpressionLeftOperandAction_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GAdditionExpression__Group_1__0__Impl"


    // $ANTLR start "rule__GAdditionExpression__Group_1__1"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4456:1: rule__GAdditionExpression__Group_1__1 : rule__GAdditionExpression__Group_1__1__Impl rule__GAdditionExpression__Group_1__2 ;
    public final void rule__GAdditionExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4460:1: ( rule__GAdditionExpression__Group_1__1__Impl rule__GAdditionExpression__Group_1__2 )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4461:2: rule__GAdditionExpression__Group_1__1__Impl rule__GAdditionExpression__Group_1__2
            {
            pushFollow(FOLLOW_rule__GAdditionExpression__Group_1__1__Impl_in_rule__GAdditionExpression__Group_1__19001);
            rule__GAdditionExpression__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__GAdditionExpression__Group_1__2_in_rule__GAdditionExpression__Group_1__19004);
            rule__GAdditionExpression__Group_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GAdditionExpression__Group_1__1"


    // $ANTLR start "rule__GAdditionExpression__Group_1__1__Impl"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4468:1: rule__GAdditionExpression__Group_1__1__Impl : ( ( rule__GAdditionExpression__OperatorAssignment_1_1 ) ) ;
    public final void rule__GAdditionExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4472:1: ( ( ( rule__GAdditionExpression__OperatorAssignment_1_1 ) ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4473:1: ( ( rule__GAdditionExpression__OperatorAssignment_1_1 ) )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4473:1: ( ( rule__GAdditionExpression__OperatorAssignment_1_1 ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4474:1: ( rule__GAdditionExpression__OperatorAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGAdditionExpressionAccess().getOperatorAssignment_1_1()); 
            }
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4475:1: ( rule__GAdditionExpression__OperatorAssignment_1_1 )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4475:2: rule__GAdditionExpression__OperatorAssignment_1_1
            {
            pushFollow(FOLLOW_rule__GAdditionExpression__OperatorAssignment_1_1_in_rule__GAdditionExpression__Group_1__1__Impl9031);
            rule__GAdditionExpression__OperatorAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGAdditionExpressionAccess().getOperatorAssignment_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GAdditionExpression__Group_1__1__Impl"


    // $ANTLR start "rule__GAdditionExpression__Group_1__2"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4485:1: rule__GAdditionExpression__Group_1__2 : rule__GAdditionExpression__Group_1__2__Impl ;
    public final void rule__GAdditionExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4489:1: ( rule__GAdditionExpression__Group_1__2__Impl )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4490:2: rule__GAdditionExpression__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__GAdditionExpression__Group_1__2__Impl_in_rule__GAdditionExpression__Group_1__29061);
            rule__GAdditionExpression__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GAdditionExpression__Group_1__2"


    // $ANTLR start "rule__GAdditionExpression__Group_1__2__Impl"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4496:1: rule__GAdditionExpression__Group_1__2__Impl : ( ( rule__GAdditionExpression__RightOperandAssignment_1_2 ) ) ;
    public final void rule__GAdditionExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4500:1: ( ( ( rule__GAdditionExpression__RightOperandAssignment_1_2 ) ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4501:1: ( ( rule__GAdditionExpression__RightOperandAssignment_1_2 ) )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4501:1: ( ( rule__GAdditionExpression__RightOperandAssignment_1_2 ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4502:1: ( rule__GAdditionExpression__RightOperandAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGAdditionExpressionAccess().getRightOperandAssignment_1_2()); 
            }
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4503:1: ( rule__GAdditionExpression__RightOperandAssignment_1_2 )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4503:2: rule__GAdditionExpression__RightOperandAssignment_1_2
            {
            pushFollow(FOLLOW_rule__GAdditionExpression__RightOperandAssignment_1_2_in_rule__GAdditionExpression__Group_1__2__Impl9088);
            rule__GAdditionExpression__RightOperandAssignment_1_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGAdditionExpressionAccess().getRightOperandAssignment_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GAdditionExpression__Group_1__2__Impl"


    // $ANTLR start "rule__GMultiplicationExpression__Group__0"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4519:1: rule__GMultiplicationExpression__Group__0 : rule__GMultiplicationExpression__Group__0__Impl rule__GMultiplicationExpression__Group__1 ;
    public final void rule__GMultiplicationExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4523:1: ( rule__GMultiplicationExpression__Group__0__Impl rule__GMultiplicationExpression__Group__1 )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4524:2: rule__GMultiplicationExpression__Group__0__Impl rule__GMultiplicationExpression__Group__1
            {
            pushFollow(FOLLOW_rule__GMultiplicationExpression__Group__0__Impl_in_rule__GMultiplicationExpression__Group__09124);
            rule__GMultiplicationExpression__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__GMultiplicationExpression__Group__1_in_rule__GMultiplicationExpression__Group__09127);
            rule__GMultiplicationExpression__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GMultiplicationExpression__Group__0"


    // $ANTLR start "rule__GMultiplicationExpression__Group__0__Impl"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4531:1: rule__GMultiplicationExpression__Group__0__Impl : ( ruleGNegationExpression ) ;
    public final void rule__GMultiplicationExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4535:1: ( ( ruleGNegationExpression ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4536:1: ( ruleGNegationExpression )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4536:1: ( ruleGNegationExpression )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4537:1: ruleGNegationExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGMultiplicationExpressionAccess().getGNegationExpressionParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleGNegationExpression_in_rule__GMultiplicationExpression__Group__0__Impl9154);
            ruleGNegationExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGMultiplicationExpressionAccess().getGNegationExpressionParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GMultiplicationExpression__Group__0__Impl"


    // $ANTLR start "rule__GMultiplicationExpression__Group__1"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4548:1: rule__GMultiplicationExpression__Group__1 : rule__GMultiplicationExpression__Group__1__Impl ;
    public final void rule__GMultiplicationExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4552:1: ( rule__GMultiplicationExpression__Group__1__Impl )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4553:2: rule__GMultiplicationExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__GMultiplicationExpression__Group__1__Impl_in_rule__GMultiplicationExpression__Group__19183);
            rule__GMultiplicationExpression__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GMultiplicationExpression__Group__1"


    // $ANTLR start "rule__GMultiplicationExpression__Group__1__Impl"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4559:1: rule__GMultiplicationExpression__Group__1__Impl : ( ( rule__GMultiplicationExpression__Group_1__0 )* ) ;
    public final void rule__GMultiplicationExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4563:1: ( ( ( rule__GMultiplicationExpression__Group_1__0 )* ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4564:1: ( ( rule__GMultiplicationExpression__Group_1__0 )* )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4564:1: ( ( rule__GMultiplicationExpression__Group_1__0 )* )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4565:1: ( rule__GMultiplicationExpression__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGMultiplicationExpressionAccess().getGroup_1()); 
            }
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4566:1: ( rule__GMultiplicationExpression__Group_1__0 )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( ((LA30_0>=26 && LA30_0<=27)) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4566:2: rule__GMultiplicationExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__GMultiplicationExpression__Group_1__0_in_rule__GMultiplicationExpression__Group__1__Impl9210);
            	    rule__GMultiplicationExpression__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGMultiplicationExpressionAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GMultiplicationExpression__Group__1__Impl"


    // $ANTLR start "rule__GMultiplicationExpression__Group_1__0"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4580:1: rule__GMultiplicationExpression__Group_1__0 : rule__GMultiplicationExpression__Group_1__0__Impl rule__GMultiplicationExpression__Group_1__1 ;
    public final void rule__GMultiplicationExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4584:1: ( rule__GMultiplicationExpression__Group_1__0__Impl rule__GMultiplicationExpression__Group_1__1 )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4585:2: rule__GMultiplicationExpression__Group_1__0__Impl rule__GMultiplicationExpression__Group_1__1
            {
            pushFollow(FOLLOW_rule__GMultiplicationExpression__Group_1__0__Impl_in_rule__GMultiplicationExpression__Group_1__09245);
            rule__GMultiplicationExpression__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__GMultiplicationExpression__Group_1__1_in_rule__GMultiplicationExpression__Group_1__09248);
            rule__GMultiplicationExpression__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GMultiplicationExpression__Group_1__0"


    // $ANTLR start "rule__GMultiplicationExpression__Group_1__0__Impl"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4592:1: rule__GMultiplicationExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__GMultiplicationExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4596:1: ( ( () ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4597:1: ( () )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4597:1: ( () )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4598:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGMultiplicationExpressionAccess().getGMultiplicationExpressionLeftOperandAction_1_0()); 
            }
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4599:1: ()
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4601:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGMultiplicationExpressionAccess().getGMultiplicationExpressionLeftOperandAction_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GMultiplicationExpression__Group_1__0__Impl"


    // $ANTLR start "rule__GMultiplicationExpression__Group_1__1"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4611:1: rule__GMultiplicationExpression__Group_1__1 : rule__GMultiplicationExpression__Group_1__1__Impl rule__GMultiplicationExpression__Group_1__2 ;
    public final void rule__GMultiplicationExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4615:1: ( rule__GMultiplicationExpression__Group_1__1__Impl rule__GMultiplicationExpression__Group_1__2 )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4616:2: rule__GMultiplicationExpression__Group_1__1__Impl rule__GMultiplicationExpression__Group_1__2
            {
            pushFollow(FOLLOW_rule__GMultiplicationExpression__Group_1__1__Impl_in_rule__GMultiplicationExpression__Group_1__19306);
            rule__GMultiplicationExpression__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__GMultiplicationExpression__Group_1__2_in_rule__GMultiplicationExpression__Group_1__19309);
            rule__GMultiplicationExpression__Group_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GMultiplicationExpression__Group_1__1"


    // $ANTLR start "rule__GMultiplicationExpression__Group_1__1__Impl"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4623:1: rule__GMultiplicationExpression__Group_1__1__Impl : ( ( rule__GMultiplicationExpression__OperatorAssignment_1_1 ) ) ;
    public final void rule__GMultiplicationExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4627:1: ( ( ( rule__GMultiplicationExpression__OperatorAssignment_1_1 ) ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4628:1: ( ( rule__GMultiplicationExpression__OperatorAssignment_1_1 ) )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4628:1: ( ( rule__GMultiplicationExpression__OperatorAssignment_1_1 ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4629:1: ( rule__GMultiplicationExpression__OperatorAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGMultiplicationExpressionAccess().getOperatorAssignment_1_1()); 
            }
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4630:1: ( rule__GMultiplicationExpression__OperatorAssignment_1_1 )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4630:2: rule__GMultiplicationExpression__OperatorAssignment_1_1
            {
            pushFollow(FOLLOW_rule__GMultiplicationExpression__OperatorAssignment_1_1_in_rule__GMultiplicationExpression__Group_1__1__Impl9336);
            rule__GMultiplicationExpression__OperatorAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGMultiplicationExpressionAccess().getOperatorAssignment_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GMultiplicationExpression__Group_1__1__Impl"


    // $ANTLR start "rule__GMultiplicationExpression__Group_1__2"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4640:1: rule__GMultiplicationExpression__Group_1__2 : rule__GMultiplicationExpression__Group_1__2__Impl ;
    public final void rule__GMultiplicationExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4644:1: ( rule__GMultiplicationExpression__Group_1__2__Impl )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4645:2: rule__GMultiplicationExpression__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__GMultiplicationExpression__Group_1__2__Impl_in_rule__GMultiplicationExpression__Group_1__29366);
            rule__GMultiplicationExpression__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GMultiplicationExpression__Group_1__2"


    // $ANTLR start "rule__GMultiplicationExpression__Group_1__2__Impl"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4651:1: rule__GMultiplicationExpression__Group_1__2__Impl : ( ( rule__GMultiplicationExpression__RightOperandAssignment_1_2 ) ) ;
    public final void rule__GMultiplicationExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4655:1: ( ( ( rule__GMultiplicationExpression__RightOperandAssignment_1_2 ) ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4656:1: ( ( rule__GMultiplicationExpression__RightOperandAssignment_1_2 ) )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4656:1: ( ( rule__GMultiplicationExpression__RightOperandAssignment_1_2 ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4657:1: ( rule__GMultiplicationExpression__RightOperandAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGMultiplicationExpressionAccess().getRightOperandAssignment_1_2()); 
            }
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4658:1: ( rule__GMultiplicationExpression__RightOperandAssignment_1_2 )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4658:2: rule__GMultiplicationExpression__RightOperandAssignment_1_2
            {
            pushFollow(FOLLOW_rule__GMultiplicationExpression__RightOperandAssignment_1_2_in_rule__GMultiplicationExpression__Group_1__2__Impl9393);
            rule__GMultiplicationExpression__RightOperandAssignment_1_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGMultiplicationExpressionAccess().getRightOperandAssignment_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GMultiplicationExpression__Group_1__2__Impl"


    // $ANTLR start "rule__GNegationExpression__Group_1__0"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4674:1: rule__GNegationExpression__Group_1__0 : rule__GNegationExpression__Group_1__0__Impl rule__GNegationExpression__Group_1__1 ;
    public final void rule__GNegationExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4678:1: ( rule__GNegationExpression__Group_1__0__Impl rule__GNegationExpression__Group_1__1 )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4679:2: rule__GNegationExpression__Group_1__0__Impl rule__GNegationExpression__Group_1__1
            {
            pushFollow(FOLLOW_rule__GNegationExpression__Group_1__0__Impl_in_rule__GNegationExpression__Group_1__09429);
            rule__GNegationExpression__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__GNegationExpression__Group_1__1_in_rule__GNegationExpression__Group_1__09432);
            rule__GNegationExpression__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GNegationExpression__Group_1__0"


    // $ANTLR start "rule__GNegationExpression__Group_1__0__Impl"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4686:1: rule__GNegationExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__GNegationExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4690:1: ( ( () ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4691:1: ( () )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4691:1: ( () )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4692:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGNegationExpressionAccess().getGNegationExpressionAction_1_0()); 
            }
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4693:1: ()
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4695:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGNegationExpressionAccess().getGNegationExpressionAction_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GNegationExpression__Group_1__0__Impl"


    // $ANTLR start "rule__GNegationExpression__Group_1__1"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4705:1: rule__GNegationExpression__Group_1__1 : rule__GNegationExpression__Group_1__1__Impl rule__GNegationExpression__Group_1__2 ;
    public final void rule__GNegationExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4709:1: ( rule__GNegationExpression__Group_1__1__Impl rule__GNegationExpression__Group_1__2 )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4710:2: rule__GNegationExpression__Group_1__1__Impl rule__GNegationExpression__Group_1__2
            {
            pushFollow(FOLLOW_rule__GNegationExpression__Group_1__1__Impl_in_rule__GNegationExpression__Group_1__19490);
            rule__GNegationExpression__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__GNegationExpression__Group_1__2_in_rule__GNegationExpression__Group_1__19493);
            rule__GNegationExpression__Group_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GNegationExpression__Group_1__1"


    // $ANTLR start "rule__GNegationExpression__Group_1__1__Impl"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4717:1: rule__GNegationExpression__Group_1__1__Impl : ( ( rule__GNegationExpression__OperatorAssignment_1_1 ) ) ;
    public final void rule__GNegationExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4721:1: ( ( ( rule__GNegationExpression__OperatorAssignment_1_1 ) ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4722:1: ( ( rule__GNegationExpression__OperatorAssignment_1_1 ) )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4722:1: ( ( rule__GNegationExpression__OperatorAssignment_1_1 ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4723:1: ( rule__GNegationExpression__OperatorAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGNegationExpressionAccess().getOperatorAssignment_1_1()); 
            }
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4724:1: ( rule__GNegationExpression__OperatorAssignment_1_1 )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4724:2: rule__GNegationExpression__OperatorAssignment_1_1
            {
            pushFollow(FOLLOW_rule__GNegationExpression__OperatorAssignment_1_1_in_rule__GNegationExpression__Group_1__1__Impl9520);
            rule__GNegationExpression__OperatorAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGNegationExpressionAccess().getOperatorAssignment_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GNegationExpression__Group_1__1__Impl"


    // $ANTLR start "rule__GNegationExpression__Group_1__2"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4734:1: rule__GNegationExpression__Group_1__2 : rule__GNegationExpression__Group_1__2__Impl ;
    public final void rule__GNegationExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4738:1: ( rule__GNegationExpression__Group_1__2__Impl )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4739:2: rule__GNegationExpression__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__GNegationExpression__Group_1__2__Impl_in_rule__GNegationExpression__Group_1__29550);
            rule__GNegationExpression__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GNegationExpression__Group_1__2"


    // $ANTLR start "rule__GNegationExpression__Group_1__2__Impl"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4745:1: rule__GNegationExpression__Group_1__2__Impl : ( ( rule__GNegationExpression__OperandAssignment_1_2 ) ) ;
    public final void rule__GNegationExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4749:1: ( ( ( rule__GNegationExpression__OperandAssignment_1_2 ) ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4750:1: ( ( rule__GNegationExpression__OperandAssignment_1_2 ) )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4750:1: ( ( rule__GNegationExpression__OperandAssignment_1_2 ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4751:1: ( rule__GNegationExpression__OperandAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGNegationExpressionAccess().getOperandAssignment_1_2()); 
            }
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4752:1: ( rule__GNegationExpression__OperandAssignment_1_2 )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4752:2: rule__GNegationExpression__OperandAssignment_1_2
            {
            pushFollow(FOLLOW_rule__GNegationExpression__OperandAssignment_1_2_in_rule__GNegationExpression__Group_1__2__Impl9577);
            rule__GNegationExpression__OperandAssignment_1_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGNegationExpressionAccess().getOperandAssignment_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GNegationExpression__Group_1__2__Impl"


    // $ANTLR start "rule__GNavigationExpression__Group__0"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4768:1: rule__GNavigationExpression__Group__0 : rule__GNavigationExpression__Group__0__Impl rule__GNavigationExpression__Group__1 ;
    public final void rule__GNavigationExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4772:1: ( rule__GNavigationExpression__Group__0__Impl rule__GNavigationExpression__Group__1 )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4773:2: rule__GNavigationExpression__Group__0__Impl rule__GNavigationExpression__Group__1
            {
            pushFollow(FOLLOW_rule__GNavigationExpression__Group__0__Impl_in_rule__GNavigationExpression__Group__09613);
            rule__GNavigationExpression__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__GNavigationExpression__Group__1_in_rule__GNavigationExpression__Group__09616);
            rule__GNavigationExpression__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GNavigationExpression__Group__0"


    // $ANTLR start "rule__GNavigationExpression__Group__0__Impl"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4780:1: rule__GNavigationExpression__Group__0__Impl : ( ruleGReferenceExpression ) ;
    public final void rule__GNavigationExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4784:1: ( ( ruleGReferenceExpression ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4785:1: ( ruleGReferenceExpression )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4785:1: ( ruleGReferenceExpression )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4786:1: ruleGReferenceExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGNavigationExpressionAccess().getGReferenceExpressionParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleGReferenceExpression_in_rule__GNavigationExpression__Group__0__Impl9643);
            ruleGReferenceExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGNavigationExpressionAccess().getGReferenceExpressionParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GNavigationExpression__Group__0__Impl"


    // $ANTLR start "rule__GNavigationExpression__Group__1"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4797:1: rule__GNavigationExpression__Group__1 : rule__GNavigationExpression__Group__1__Impl ;
    public final void rule__GNavigationExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4801:1: ( rule__GNavigationExpression__Group__1__Impl )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4802:2: rule__GNavigationExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__GNavigationExpression__Group__1__Impl_in_rule__GNavigationExpression__Group__19672);
            rule__GNavigationExpression__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GNavigationExpression__Group__1"


    // $ANTLR start "rule__GNavigationExpression__Group__1__Impl"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4808:1: rule__GNavigationExpression__Group__1__Impl : ( ( rule__GNavigationExpression__Group_1__0 )* ) ;
    public final void rule__GNavigationExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4812:1: ( ( ( rule__GNavigationExpression__Group_1__0 )* ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4813:1: ( ( rule__GNavigationExpression__Group_1__0 )* )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4813:1: ( ( rule__GNavigationExpression__Group_1__0 )* )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4814:1: ( rule__GNavigationExpression__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGNavigationExpressionAccess().getGroup_1()); 
            }
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4815:1: ( rule__GNavigationExpression__Group_1__0 )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( ((LA31_0>=16 && LA31_0<=17)) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4815:2: rule__GNavigationExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__GNavigationExpression__Group_1__0_in_rule__GNavigationExpression__Group__1__Impl9699);
            	    rule__GNavigationExpression__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGNavigationExpressionAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GNavigationExpression__Group__1__Impl"


    // $ANTLR start "rule__GNavigationExpression__Group_1__0"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4829:1: rule__GNavigationExpression__Group_1__0 : rule__GNavigationExpression__Group_1__0__Impl rule__GNavigationExpression__Group_1__1 ;
    public final void rule__GNavigationExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4833:1: ( rule__GNavigationExpression__Group_1__0__Impl rule__GNavigationExpression__Group_1__1 )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4834:2: rule__GNavigationExpression__Group_1__0__Impl rule__GNavigationExpression__Group_1__1
            {
            pushFollow(FOLLOW_rule__GNavigationExpression__Group_1__0__Impl_in_rule__GNavigationExpression__Group_1__09734);
            rule__GNavigationExpression__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__GNavigationExpression__Group_1__1_in_rule__GNavigationExpression__Group_1__09737);
            rule__GNavigationExpression__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GNavigationExpression__Group_1__0"


    // $ANTLR start "rule__GNavigationExpression__Group_1__0__Impl"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4841:1: rule__GNavigationExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__GNavigationExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4845:1: ( ( () ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4846:1: ( () )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4846:1: ( () )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4847:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGNavigationExpressionAccess().getGNavigationExpressionBodyAction_1_0()); 
            }
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4848:1: ()
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4850:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGNavigationExpressionAccess().getGNavigationExpressionBodyAction_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GNavigationExpression__Group_1__0__Impl"


    // $ANTLR start "rule__GNavigationExpression__Group_1__1"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4860:1: rule__GNavigationExpression__Group_1__1 : rule__GNavigationExpression__Group_1__1__Impl rule__GNavigationExpression__Group_1__2 ;
    public final void rule__GNavigationExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4864:1: ( rule__GNavigationExpression__Group_1__1__Impl rule__GNavigationExpression__Group_1__2 )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4865:2: rule__GNavigationExpression__Group_1__1__Impl rule__GNavigationExpression__Group_1__2
            {
            pushFollow(FOLLOW_rule__GNavigationExpression__Group_1__1__Impl_in_rule__GNavigationExpression__Group_1__19795);
            rule__GNavigationExpression__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__GNavigationExpression__Group_1__2_in_rule__GNavigationExpression__Group_1__19798);
            rule__GNavigationExpression__Group_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GNavigationExpression__Group_1__1"


    // $ANTLR start "rule__GNavigationExpression__Group_1__1__Impl"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4872:1: rule__GNavigationExpression__Group_1__1__Impl : ( ruleNavigationOperator ) ;
    public final void rule__GNavigationExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4876:1: ( ( ruleNavigationOperator ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4877:1: ( ruleNavigationOperator )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4877:1: ( ruleNavigationOperator )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4878:1: ruleNavigationOperator
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGNavigationExpressionAccess().getNavigationOperatorParserRuleCall_1_1()); 
            }
            pushFollow(FOLLOW_ruleNavigationOperator_in_rule__GNavigationExpression__Group_1__1__Impl9825);
            ruleNavigationOperator();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGNavigationExpressionAccess().getNavigationOperatorParserRuleCall_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GNavigationExpression__Group_1__1__Impl"


    // $ANTLR start "rule__GNavigationExpression__Group_1__2"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4889:1: rule__GNavigationExpression__Group_1__2 : rule__GNavigationExpression__Group_1__2__Impl ;
    public final void rule__GNavigationExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4893:1: ( rule__GNavigationExpression__Group_1__2__Impl )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4894:2: rule__GNavigationExpression__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__GNavigationExpression__Group_1__2__Impl_in_rule__GNavigationExpression__Group_1__29854);
            rule__GNavigationExpression__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GNavigationExpression__Group_1__2"


    // $ANTLR start "rule__GNavigationExpression__Group_1__2__Impl"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4900:1: rule__GNavigationExpression__Group_1__2__Impl : ( ( rule__GNavigationExpression__ReferencedEObjectAssignment_1_2 ) ) ;
    public final void rule__GNavigationExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4904:1: ( ( ( rule__GNavigationExpression__ReferencedEObjectAssignment_1_2 ) ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4905:1: ( ( rule__GNavigationExpression__ReferencedEObjectAssignment_1_2 ) )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4905:1: ( ( rule__GNavigationExpression__ReferencedEObjectAssignment_1_2 ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4906:1: ( rule__GNavigationExpression__ReferencedEObjectAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGNavigationExpressionAccess().getReferencedEObjectAssignment_1_2()); 
            }
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4907:1: ( rule__GNavigationExpression__ReferencedEObjectAssignment_1_2 )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4907:2: rule__GNavigationExpression__ReferencedEObjectAssignment_1_2
            {
            pushFollow(FOLLOW_rule__GNavigationExpression__ReferencedEObjectAssignment_1_2_in_rule__GNavigationExpression__Group_1__2__Impl9881);
            rule__GNavigationExpression__ReferencedEObjectAssignment_1_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGNavigationExpressionAccess().getReferencedEObjectAssignment_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GNavigationExpression__Group_1__2__Impl"


    // $ANTLR start "rule__GReferenceExpression__Group_1__0"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4923:1: rule__GReferenceExpression__Group_1__0 : rule__GReferenceExpression__Group_1__0__Impl rule__GReferenceExpression__Group_1__1 ;
    public final void rule__GReferenceExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4927:1: ( rule__GReferenceExpression__Group_1__0__Impl rule__GReferenceExpression__Group_1__1 )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4928:2: rule__GReferenceExpression__Group_1__0__Impl rule__GReferenceExpression__Group_1__1
            {
            pushFollow(FOLLOW_rule__GReferenceExpression__Group_1__0__Impl_in_rule__GReferenceExpression__Group_1__09917);
            rule__GReferenceExpression__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__GReferenceExpression__Group_1__1_in_rule__GReferenceExpression__Group_1__09920);
            rule__GReferenceExpression__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GReferenceExpression__Group_1__0"


    // $ANTLR start "rule__GReferenceExpression__Group_1__0__Impl"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4935:1: rule__GReferenceExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__GReferenceExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4939:1: ( ( () ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4940:1: ( () )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4940:1: ( () )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4941:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGReferenceExpressionAccess().getGReferenceExpressionAction_1_0()); 
            }
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4942:1: ()
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4944:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGReferenceExpressionAccess().getGReferenceExpressionAction_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GReferenceExpression__Group_1__0__Impl"


    // $ANTLR start "rule__GReferenceExpression__Group_1__1"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4954:1: rule__GReferenceExpression__Group_1__1 : rule__GReferenceExpression__Group_1__1__Impl ;
    public final void rule__GReferenceExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4958:1: ( rule__GReferenceExpression__Group_1__1__Impl )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4959:2: rule__GReferenceExpression__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__GReferenceExpression__Group_1__1__Impl_in_rule__GReferenceExpression__Group_1__19978);
            rule__GReferenceExpression__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GReferenceExpression__Group_1__1"


    // $ANTLR start "rule__GReferenceExpression__Group_1__1__Impl"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4965:1: rule__GReferenceExpression__Group_1__1__Impl : ( ( rule__GReferenceExpression__ReferencedEObjectAssignment_1_1 ) ) ;
    public final void rule__GReferenceExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4969:1: ( ( ( rule__GReferenceExpression__ReferencedEObjectAssignment_1_1 ) ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4970:1: ( ( rule__GReferenceExpression__ReferencedEObjectAssignment_1_1 ) )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4970:1: ( ( rule__GReferenceExpression__ReferencedEObjectAssignment_1_1 ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4971:1: ( rule__GReferenceExpression__ReferencedEObjectAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGReferenceExpressionAccess().getReferencedEObjectAssignment_1_1()); 
            }
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4972:1: ( rule__GReferenceExpression__ReferencedEObjectAssignment_1_1 )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4972:2: rule__GReferenceExpression__ReferencedEObjectAssignment_1_1
            {
            pushFollow(FOLLOW_rule__GReferenceExpression__ReferencedEObjectAssignment_1_1_in_rule__GReferenceExpression__Group_1__1__Impl10005);
            rule__GReferenceExpression__ReferencedEObjectAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGReferenceExpressionAccess().getReferencedEObjectAssignment_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GReferenceExpression__Group_1__1__Impl"


    // $ANTLR start "rule__GStringExpression__Group__0"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4986:1: rule__GStringExpression__Group__0 : rule__GStringExpression__Group__0__Impl rule__GStringExpression__Group__1 ;
    public final void rule__GStringExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4990:1: ( rule__GStringExpression__Group__0__Impl rule__GStringExpression__Group__1 )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4991:2: rule__GStringExpression__Group__0__Impl rule__GStringExpression__Group__1
            {
            pushFollow(FOLLOW_rule__GStringExpression__Group__0__Impl_in_rule__GStringExpression__Group__010039);
            rule__GStringExpression__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__GStringExpression__Group__1_in_rule__GStringExpression__Group__010042);
            rule__GStringExpression__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GStringExpression__Group__0"


    // $ANTLR start "rule__GStringExpression__Group__0__Impl"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:4998:1: rule__GStringExpression__Group__0__Impl : ( () ) ;
    public final void rule__GStringExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5002:1: ( ( () ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5003:1: ( () )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5003:1: ( () )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5004:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGStringExpressionAccess().getGStringExpressionAction_0()); 
            }
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5005:1: ()
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5007:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGStringExpressionAccess().getGStringExpressionAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GStringExpression__Group__0__Impl"


    // $ANTLR start "rule__GStringExpression__Group__1"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5017:1: rule__GStringExpression__Group__1 : rule__GStringExpression__Group__1__Impl ;
    public final void rule__GStringExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5021:1: ( rule__GStringExpression__Group__1__Impl )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5022:2: rule__GStringExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__GStringExpression__Group__1__Impl_in_rule__GStringExpression__Group__110100);
            rule__GStringExpression__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GStringExpression__Group__1"


    // $ANTLR start "rule__GStringExpression__Group__1__Impl"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5028:1: rule__GStringExpression__Group__1__Impl : ( ( rule__GStringExpression__ValueAssignment_1 ) ) ;
    public final void rule__GStringExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5032:1: ( ( ( rule__GStringExpression__ValueAssignment_1 ) ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5033:1: ( ( rule__GStringExpression__ValueAssignment_1 ) )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5033:1: ( ( rule__GStringExpression__ValueAssignment_1 ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5034:1: ( rule__GStringExpression__ValueAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGStringExpressionAccess().getValueAssignment_1()); 
            }
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5035:1: ( rule__GStringExpression__ValueAssignment_1 )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5035:2: rule__GStringExpression__ValueAssignment_1
            {
            pushFollow(FOLLOW_rule__GStringExpression__ValueAssignment_1_in_rule__GStringExpression__Group__1__Impl10127);
            rule__GStringExpression__ValueAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGStringExpressionAccess().getValueAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GStringExpression__Group__1__Impl"


    // $ANTLR start "rule__GBooleanExpression__Group__0"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5049:1: rule__GBooleanExpression__Group__0 : rule__GBooleanExpression__Group__0__Impl rule__GBooleanExpression__Group__1 ;
    public final void rule__GBooleanExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5053:1: ( rule__GBooleanExpression__Group__0__Impl rule__GBooleanExpression__Group__1 )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5054:2: rule__GBooleanExpression__Group__0__Impl rule__GBooleanExpression__Group__1
            {
            pushFollow(FOLLOW_rule__GBooleanExpression__Group__0__Impl_in_rule__GBooleanExpression__Group__010161);
            rule__GBooleanExpression__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__GBooleanExpression__Group__1_in_rule__GBooleanExpression__Group__010164);
            rule__GBooleanExpression__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GBooleanExpression__Group__0"


    // $ANTLR start "rule__GBooleanExpression__Group__0__Impl"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5061:1: rule__GBooleanExpression__Group__0__Impl : ( () ) ;
    public final void rule__GBooleanExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5065:1: ( ( () ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5066:1: ( () )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5066:1: ( () )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5067:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGBooleanExpressionAccess().getGBooleanExpressionAction_0()); 
            }
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5068:1: ()
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5070:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGBooleanExpressionAccess().getGBooleanExpressionAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GBooleanExpression__Group__0__Impl"


    // $ANTLR start "rule__GBooleanExpression__Group__1"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5080:1: rule__GBooleanExpression__Group__1 : rule__GBooleanExpression__Group__1__Impl ;
    public final void rule__GBooleanExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5084:1: ( rule__GBooleanExpression__Group__1__Impl )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5085:2: rule__GBooleanExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__GBooleanExpression__Group__1__Impl_in_rule__GBooleanExpression__Group__110222);
            rule__GBooleanExpression__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GBooleanExpression__Group__1"


    // $ANTLR start "rule__GBooleanExpression__Group__1__Impl"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5091:1: rule__GBooleanExpression__Group__1__Impl : ( ( rule__GBooleanExpression__ValueAssignment_1 ) ) ;
    public final void rule__GBooleanExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5095:1: ( ( ( rule__GBooleanExpression__ValueAssignment_1 ) ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5096:1: ( ( rule__GBooleanExpression__ValueAssignment_1 ) )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5096:1: ( ( rule__GBooleanExpression__ValueAssignment_1 ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5097:1: ( rule__GBooleanExpression__ValueAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGBooleanExpressionAccess().getValueAssignment_1()); 
            }
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5098:1: ( rule__GBooleanExpression__ValueAssignment_1 )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5098:2: rule__GBooleanExpression__ValueAssignment_1
            {
            pushFollow(FOLLOW_rule__GBooleanExpression__ValueAssignment_1_in_rule__GBooleanExpression__Group__1__Impl10249);
            rule__GBooleanExpression__ValueAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGBooleanExpressionAccess().getValueAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GBooleanExpression__Group__1__Impl"


    // $ANTLR start "rule__GIntegerExpression__Group__0"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5112:1: rule__GIntegerExpression__Group__0 : rule__GIntegerExpression__Group__0__Impl rule__GIntegerExpression__Group__1 ;
    public final void rule__GIntegerExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5116:1: ( rule__GIntegerExpression__Group__0__Impl rule__GIntegerExpression__Group__1 )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5117:2: rule__GIntegerExpression__Group__0__Impl rule__GIntegerExpression__Group__1
            {
            pushFollow(FOLLOW_rule__GIntegerExpression__Group__0__Impl_in_rule__GIntegerExpression__Group__010283);
            rule__GIntegerExpression__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__GIntegerExpression__Group__1_in_rule__GIntegerExpression__Group__010286);
            rule__GIntegerExpression__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GIntegerExpression__Group__0"


    // $ANTLR start "rule__GIntegerExpression__Group__0__Impl"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5124:1: rule__GIntegerExpression__Group__0__Impl : ( () ) ;
    public final void rule__GIntegerExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5128:1: ( ( () ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5129:1: ( () )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5129:1: ( () )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5130:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGIntegerExpressionAccess().getGIntegerExpressionAction_0()); 
            }
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5131:1: ()
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5133:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGIntegerExpressionAccess().getGIntegerExpressionAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GIntegerExpression__Group__0__Impl"


    // $ANTLR start "rule__GIntegerExpression__Group__1"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5143:1: rule__GIntegerExpression__Group__1 : rule__GIntegerExpression__Group__1__Impl ;
    public final void rule__GIntegerExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5147:1: ( rule__GIntegerExpression__Group__1__Impl )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5148:2: rule__GIntegerExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__GIntegerExpression__Group__1__Impl_in_rule__GIntegerExpression__Group__110344);
            rule__GIntegerExpression__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GIntegerExpression__Group__1"


    // $ANTLR start "rule__GIntegerExpression__Group__1__Impl"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5154:1: rule__GIntegerExpression__Group__1__Impl : ( ( rule__GIntegerExpression__ValueAssignment_1 ) ) ;
    public final void rule__GIntegerExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5158:1: ( ( ( rule__GIntegerExpression__ValueAssignment_1 ) ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5159:1: ( ( rule__GIntegerExpression__ValueAssignment_1 ) )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5159:1: ( ( rule__GIntegerExpression__ValueAssignment_1 ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5160:1: ( rule__GIntegerExpression__ValueAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGIntegerExpressionAccess().getValueAssignment_1()); 
            }
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5161:1: ( rule__GIntegerExpression__ValueAssignment_1 )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5161:2: rule__GIntegerExpression__ValueAssignment_1
            {
            pushFollow(FOLLOW_rule__GIntegerExpression__ValueAssignment_1_in_rule__GIntegerExpression__Group__1__Impl10371);
            rule__GIntegerExpression__ValueAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGIntegerExpressionAccess().getValueAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GIntegerExpression__Group__1__Impl"


    // $ANTLR start "rule__GDoubleExpression__Group__0"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5175:1: rule__GDoubleExpression__Group__0 : rule__GDoubleExpression__Group__0__Impl rule__GDoubleExpression__Group__1 ;
    public final void rule__GDoubleExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5179:1: ( rule__GDoubleExpression__Group__0__Impl rule__GDoubleExpression__Group__1 )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5180:2: rule__GDoubleExpression__Group__0__Impl rule__GDoubleExpression__Group__1
            {
            pushFollow(FOLLOW_rule__GDoubleExpression__Group__0__Impl_in_rule__GDoubleExpression__Group__010405);
            rule__GDoubleExpression__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__GDoubleExpression__Group__1_in_rule__GDoubleExpression__Group__010408);
            rule__GDoubleExpression__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GDoubleExpression__Group__0"


    // $ANTLR start "rule__GDoubleExpression__Group__0__Impl"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5187:1: rule__GDoubleExpression__Group__0__Impl : ( () ) ;
    public final void rule__GDoubleExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5191:1: ( ( () ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5192:1: ( () )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5192:1: ( () )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5193:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGDoubleExpressionAccess().getGDoubleExpressionAction_0()); 
            }
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5194:1: ()
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5196:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGDoubleExpressionAccess().getGDoubleExpressionAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GDoubleExpression__Group__0__Impl"


    // $ANTLR start "rule__GDoubleExpression__Group__1"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5206:1: rule__GDoubleExpression__Group__1 : rule__GDoubleExpression__Group__1__Impl ;
    public final void rule__GDoubleExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5210:1: ( rule__GDoubleExpression__Group__1__Impl )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5211:2: rule__GDoubleExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__GDoubleExpression__Group__1__Impl_in_rule__GDoubleExpression__Group__110466);
            rule__GDoubleExpression__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GDoubleExpression__Group__1"


    // $ANTLR start "rule__GDoubleExpression__Group__1__Impl"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5217:1: rule__GDoubleExpression__Group__1__Impl : ( ( rule__GDoubleExpression__ValueAssignment_1 ) ) ;
    public final void rule__GDoubleExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5221:1: ( ( ( rule__GDoubleExpression__ValueAssignment_1 ) ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5222:1: ( ( rule__GDoubleExpression__ValueAssignment_1 ) )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5222:1: ( ( rule__GDoubleExpression__ValueAssignment_1 ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5223:1: ( rule__GDoubleExpression__ValueAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGDoubleExpressionAccess().getValueAssignment_1()); 
            }
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5224:1: ( rule__GDoubleExpression__ValueAssignment_1 )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5224:2: rule__GDoubleExpression__ValueAssignment_1
            {
            pushFollow(FOLLOW_rule__GDoubleExpression__ValueAssignment_1_in_rule__GDoubleExpression__Group__1__Impl10493);
            rule__GDoubleExpression__ValueAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGDoubleExpressionAccess().getValueAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GDoubleExpression__Group__1__Impl"


    // $ANTLR start "rule__GEnumLiteralExpression__Group__0"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5238:1: rule__GEnumLiteralExpression__Group__0 : rule__GEnumLiteralExpression__Group__0__Impl rule__GEnumLiteralExpression__Group__1 ;
    public final void rule__GEnumLiteralExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5242:1: ( rule__GEnumLiteralExpression__Group__0__Impl rule__GEnumLiteralExpression__Group__1 )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5243:2: rule__GEnumLiteralExpression__Group__0__Impl rule__GEnumLiteralExpression__Group__1
            {
            pushFollow(FOLLOW_rule__GEnumLiteralExpression__Group__0__Impl_in_rule__GEnumLiteralExpression__Group__010527);
            rule__GEnumLiteralExpression__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__GEnumLiteralExpression__Group__1_in_rule__GEnumLiteralExpression__Group__010530);
            rule__GEnumLiteralExpression__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GEnumLiteralExpression__Group__0"


    // $ANTLR start "rule__GEnumLiteralExpression__Group__0__Impl"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5250:1: rule__GEnumLiteralExpression__Group__0__Impl : ( () ) ;
    public final void rule__GEnumLiteralExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5254:1: ( ( () ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5255:1: ( () )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5255:1: ( () )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5256:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGEnumLiteralExpressionAccess().getGEnumLiteralExpressionAction_0()); 
            }
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5257:1: ()
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5259:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGEnumLiteralExpressionAccess().getGEnumLiteralExpressionAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GEnumLiteralExpression__Group__0__Impl"


    // $ANTLR start "rule__GEnumLiteralExpression__Group__1"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5269:1: rule__GEnumLiteralExpression__Group__1 : rule__GEnumLiteralExpression__Group__1__Impl rule__GEnumLiteralExpression__Group__2 ;
    public final void rule__GEnumLiteralExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5273:1: ( rule__GEnumLiteralExpression__Group__1__Impl rule__GEnumLiteralExpression__Group__2 )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5274:2: rule__GEnumLiteralExpression__Group__1__Impl rule__GEnumLiteralExpression__Group__2
            {
            pushFollow(FOLLOW_rule__GEnumLiteralExpression__Group__1__Impl_in_rule__GEnumLiteralExpression__Group__110588);
            rule__GEnumLiteralExpression__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__GEnumLiteralExpression__Group__2_in_rule__GEnumLiteralExpression__Group__110591);
            rule__GEnumLiteralExpression__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GEnumLiteralExpression__Group__1"


    // $ANTLR start "rule__GEnumLiteralExpression__Group__1__Impl"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5281:1: rule__GEnumLiteralExpression__Group__1__Impl : ( '#' ) ;
    public final void rule__GEnumLiteralExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5285:1: ( ( '#' ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5286:1: ( '#' )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5286:1: ( '#' )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5287:1: '#'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGEnumLiteralExpressionAccess().getNumberSignKeyword_1()); 
            }
            match(input,49,FOLLOW_49_in_rule__GEnumLiteralExpression__Group__1__Impl10619); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGEnumLiteralExpressionAccess().getNumberSignKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GEnumLiteralExpression__Group__1__Impl"


    // $ANTLR start "rule__GEnumLiteralExpression__Group__2"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5300:1: rule__GEnumLiteralExpression__Group__2 : rule__GEnumLiteralExpression__Group__2__Impl ;
    public final void rule__GEnumLiteralExpression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5304:1: ( rule__GEnumLiteralExpression__Group__2__Impl )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5305:2: rule__GEnumLiteralExpression__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__GEnumLiteralExpression__Group__2__Impl_in_rule__GEnumLiteralExpression__Group__210650);
            rule__GEnumLiteralExpression__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GEnumLiteralExpression__Group__2"


    // $ANTLR start "rule__GEnumLiteralExpression__Group__2__Impl"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5311:1: rule__GEnumLiteralExpression__Group__2__Impl : ( ( rule__GEnumLiteralExpression__ValueAssignment_2 ) ) ;
    public final void rule__GEnumLiteralExpression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5315:1: ( ( ( rule__GEnumLiteralExpression__ValueAssignment_2 ) ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5316:1: ( ( rule__GEnumLiteralExpression__ValueAssignment_2 ) )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5316:1: ( ( rule__GEnumLiteralExpression__ValueAssignment_2 ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5317:1: ( rule__GEnumLiteralExpression__ValueAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGEnumLiteralExpressionAccess().getValueAssignment_2()); 
            }
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5318:1: ( rule__GEnumLiteralExpression__ValueAssignment_2 )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5318:2: rule__GEnumLiteralExpression__ValueAssignment_2
            {
            pushFollow(FOLLOW_rule__GEnumLiteralExpression__ValueAssignment_2_in_rule__GEnumLiteralExpression__Group__2__Impl10677);
            rule__GEnumLiteralExpression__ValueAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGEnumLiteralExpressionAccess().getValueAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GEnumLiteralExpression__Group__2__Impl"


    // $ANTLR start "rule__GIfExpression__Group__0"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5334:1: rule__GIfExpression__Group__0 : rule__GIfExpression__Group__0__Impl rule__GIfExpression__Group__1 ;
    public final void rule__GIfExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5338:1: ( rule__GIfExpression__Group__0__Impl rule__GIfExpression__Group__1 )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5339:2: rule__GIfExpression__Group__0__Impl rule__GIfExpression__Group__1
            {
            pushFollow(FOLLOW_rule__GIfExpression__Group__0__Impl_in_rule__GIfExpression__Group__010713);
            rule__GIfExpression__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__GIfExpression__Group__1_in_rule__GIfExpression__Group__010716);
            rule__GIfExpression__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GIfExpression__Group__0"


    // $ANTLR start "rule__GIfExpression__Group__0__Impl"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5346:1: rule__GIfExpression__Group__0__Impl : ( () ) ;
    public final void rule__GIfExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5350:1: ( ( () ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5351:1: ( () )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5351:1: ( () )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5352:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGIfExpressionAccess().getGIfExpressionAction_0()); 
            }
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5353:1: ()
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5355:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGIfExpressionAccess().getGIfExpressionAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GIfExpression__Group__0__Impl"


    // $ANTLR start "rule__GIfExpression__Group__1"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5365:1: rule__GIfExpression__Group__1 : rule__GIfExpression__Group__1__Impl rule__GIfExpression__Group__2 ;
    public final void rule__GIfExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5369:1: ( rule__GIfExpression__Group__1__Impl rule__GIfExpression__Group__2 )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5370:2: rule__GIfExpression__Group__1__Impl rule__GIfExpression__Group__2
            {
            pushFollow(FOLLOW_rule__GIfExpression__Group__1__Impl_in_rule__GIfExpression__Group__110774);
            rule__GIfExpression__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__GIfExpression__Group__2_in_rule__GIfExpression__Group__110777);
            rule__GIfExpression__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GIfExpression__Group__1"


    // $ANTLR start "rule__GIfExpression__Group__1__Impl"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5377:1: rule__GIfExpression__Group__1__Impl : ( 'if' ) ;
    public final void rule__GIfExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5381:1: ( ( 'if' ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5382:1: ( 'if' )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5382:1: ( 'if' )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5383:1: 'if'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGIfExpressionAccess().getIfKeyword_1()); 
            }
            match(input,50,FOLLOW_50_in_rule__GIfExpression__Group__1__Impl10805); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGIfExpressionAccess().getIfKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GIfExpression__Group__1__Impl"


    // $ANTLR start "rule__GIfExpression__Group__2"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5396:1: rule__GIfExpression__Group__2 : rule__GIfExpression__Group__2__Impl rule__GIfExpression__Group__3 ;
    public final void rule__GIfExpression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5400:1: ( rule__GIfExpression__Group__2__Impl rule__GIfExpression__Group__3 )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5401:2: rule__GIfExpression__Group__2__Impl rule__GIfExpression__Group__3
            {
            pushFollow(FOLLOW_rule__GIfExpression__Group__2__Impl_in_rule__GIfExpression__Group__210836);
            rule__GIfExpression__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__GIfExpression__Group__3_in_rule__GIfExpression__Group__210839);
            rule__GIfExpression__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GIfExpression__Group__2"


    // $ANTLR start "rule__GIfExpression__Group__2__Impl"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5408:1: rule__GIfExpression__Group__2__Impl : ( ( rule__GIfExpression__ConditionAssignment_2 ) ) ;
    public final void rule__GIfExpression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5412:1: ( ( ( rule__GIfExpression__ConditionAssignment_2 ) ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5413:1: ( ( rule__GIfExpression__ConditionAssignment_2 ) )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5413:1: ( ( rule__GIfExpression__ConditionAssignment_2 ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5414:1: ( rule__GIfExpression__ConditionAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGIfExpressionAccess().getConditionAssignment_2()); 
            }
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5415:1: ( rule__GIfExpression__ConditionAssignment_2 )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5415:2: rule__GIfExpression__ConditionAssignment_2
            {
            pushFollow(FOLLOW_rule__GIfExpression__ConditionAssignment_2_in_rule__GIfExpression__Group__2__Impl10866);
            rule__GIfExpression__ConditionAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGIfExpressionAccess().getConditionAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GIfExpression__Group__2__Impl"


    // $ANTLR start "rule__GIfExpression__Group__3"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5425:1: rule__GIfExpression__Group__3 : rule__GIfExpression__Group__3__Impl rule__GIfExpression__Group__4 ;
    public final void rule__GIfExpression__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5429:1: ( rule__GIfExpression__Group__3__Impl rule__GIfExpression__Group__4 )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5430:2: rule__GIfExpression__Group__3__Impl rule__GIfExpression__Group__4
            {
            pushFollow(FOLLOW_rule__GIfExpression__Group__3__Impl_in_rule__GIfExpression__Group__310896);
            rule__GIfExpression__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__GIfExpression__Group__4_in_rule__GIfExpression__Group__310899);
            rule__GIfExpression__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GIfExpression__Group__3"


    // $ANTLR start "rule__GIfExpression__Group__3__Impl"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5437:1: rule__GIfExpression__Group__3__Impl : ( 'then' ) ;
    public final void rule__GIfExpression__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5441:1: ( ( 'then' ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5442:1: ( 'then' )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5442:1: ( 'then' )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5443:1: 'then'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGIfExpressionAccess().getThenKeyword_3()); 
            }
            match(input,51,FOLLOW_51_in_rule__GIfExpression__Group__3__Impl10927); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGIfExpressionAccess().getThenKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GIfExpression__Group__3__Impl"


    // $ANTLR start "rule__GIfExpression__Group__4"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5456:1: rule__GIfExpression__Group__4 : rule__GIfExpression__Group__4__Impl rule__GIfExpression__Group__5 ;
    public final void rule__GIfExpression__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5460:1: ( rule__GIfExpression__Group__4__Impl rule__GIfExpression__Group__5 )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5461:2: rule__GIfExpression__Group__4__Impl rule__GIfExpression__Group__5
            {
            pushFollow(FOLLOW_rule__GIfExpression__Group__4__Impl_in_rule__GIfExpression__Group__410958);
            rule__GIfExpression__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__GIfExpression__Group__5_in_rule__GIfExpression__Group__410961);
            rule__GIfExpression__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GIfExpression__Group__4"


    // $ANTLR start "rule__GIfExpression__Group__4__Impl"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5468:1: rule__GIfExpression__Group__4__Impl : ( ( rule__GIfExpression__ThenExpressionAssignment_4 ) ) ;
    public final void rule__GIfExpression__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5472:1: ( ( ( rule__GIfExpression__ThenExpressionAssignment_4 ) ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5473:1: ( ( rule__GIfExpression__ThenExpressionAssignment_4 ) )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5473:1: ( ( rule__GIfExpression__ThenExpressionAssignment_4 ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5474:1: ( rule__GIfExpression__ThenExpressionAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGIfExpressionAccess().getThenExpressionAssignment_4()); 
            }
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5475:1: ( rule__GIfExpression__ThenExpressionAssignment_4 )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5475:2: rule__GIfExpression__ThenExpressionAssignment_4
            {
            pushFollow(FOLLOW_rule__GIfExpression__ThenExpressionAssignment_4_in_rule__GIfExpression__Group__4__Impl10988);
            rule__GIfExpression__ThenExpressionAssignment_4();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGIfExpressionAccess().getThenExpressionAssignment_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GIfExpression__Group__4__Impl"


    // $ANTLR start "rule__GIfExpression__Group__5"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5485:1: rule__GIfExpression__Group__5 : rule__GIfExpression__Group__5__Impl rule__GIfExpression__Group__6 ;
    public final void rule__GIfExpression__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5489:1: ( rule__GIfExpression__Group__5__Impl rule__GIfExpression__Group__6 )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5490:2: rule__GIfExpression__Group__5__Impl rule__GIfExpression__Group__6
            {
            pushFollow(FOLLOW_rule__GIfExpression__Group__5__Impl_in_rule__GIfExpression__Group__511018);
            rule__GIfExpression__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__GIfExpression__Group__6_in_rule__GIfExpression__Group__511021);
            rule__GIfExpression__Group__6();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GIfExpression__Group__5"


    // $ANTLR start "rule__GIfExpression__Group__5__Impl"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5497:1: rule__GIfExpression__Group__5__Impl : ( 'else' ) ;
    public final void rule__GIfExpression__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5501:1: ( ( 'else' ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5502:1: ( 'else' )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5502:1: ( 'else' )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5503:1: 'else'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGIfExpressionAccess().getElseKeyword_5()); 
            }
            match(input,52,FOLLOW_52_in_rule__GIfExpression__Group__5__Impl11049); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGIfExpressionAccess().getElseKeyword_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GIfExpression__Group__5__Impl"


    // $ANTLR start "rule__GIfExpression__Group__6"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5516:1: rule__GIfExpression__Group__6 : rule__GIfExpression__Group__6__Impl rule__GIfExpression__Group__7 ;
    public final void rule__GIfExpression__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5520:1: ( rule__GIfExpression__Group__6__Impl rule__GIfExpression__Group__7 )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5521:2: rule__GIfExpression__Group__6__Impl rule__GIfExpression__Group__7
            {
            pushFollow(FOLLOW_rule__GIfExpression__Group__6__Impl_in_rule__GIfExpression__Group__611080);
            rule__GIfExpression__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__GIfExpression__Group__7_in_rule__GIfExpression__Group__611083);
            rule__GIfExpression__Group__7();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GIfExpression__Group__6"


    // $ANTLR start "rule__GIfExpression__Group__6__Impl"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5528:1: rule__GIfExpression__Group__6__Impl : ( ( rule__GIfExpression__ElseExpressionAssignment_6 ) ) ;
    public final void rule__GIfExpression__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5532:1: ( ( ( rule__GIfExpression__ElseExpressionAssignment_6 ) ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5533:1: ( ( rule__GIfExpression__ElseExpressionAssignment_6 ) )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5533:1: ( ( rule__GIfExpression__ElseExpressionAssignment_6 ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5534:1: ( rule__GIfExpression__ElseExpressionAssignment_6 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGIfExpressionAccess().getElseExpressionAssignment_6()); 
            }
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5535:1: ( rule__GIfExpression__ElseExpressionAssignment_6 )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5535:2: rule__GIfExpression__ElseExpressionAssignment_6
            {
            pushFollow(FOLLOW_rule__GIfExpression__ElseExpressionAssignment_6_in_rule__GIfExpression__Group__6__Impl11110);
            rule__GIfExpression__ElseExpressionAssignment_6();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGIfExpressionAccess().getElseExpressionAssignment_6()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GIfExpression__Group__6__Impl"


    // $ANTLR start "rule__GIfExpression__Group__7"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5545:1: rule__GIfExpression__Group__7 : rule__GIfExpression__Group__7__Impl ;
    public final void rule__GIfExpression__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5549:1: ( rule__GIfExpression__Group__7__Impl )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5550:2: rule__GIfExpression__Group__7__Impl
            {
            pushFollow(FOLLOW_rule__GIfExpression__Group__7__Impl_in_rule__GIfExpression__Group__711140);
            rule__GIfExpression__Group__7__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GIfExpression__Group__7"


    // $ANTLR start "rule__GIfExpression__Group__7__Impl"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5556:1: rule__GIfExpression__Group__7__Impl : ( 'endif' ) ;
    public final void rule__GIfExpression__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5560:1: ( ( 'endif' ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5561:1: ( 'endif' )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5561:1: ( 'endif' )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5562:1: 'endif'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGIfExpressionAccess().getEndifKeyword_7()); 
            }
            match(input,53,FOLLOW_53_in_rule__GIfExpression__Group__7__Impl11168); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGIfExpressionAccess().getEndifKeyword_7()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GIfExpression__Group__7__Impl"


    // $ANTLR start "rule__GBraceExpression__Group__0"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5591:1: rule__GBraceExpression__Group__0 : rule__GBraceExpression__Group__0__Impl rule__GBraceExpression__Group__1 ;
    public final void rule__GBraceExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5595:1: ( rule__GBraceExpression__Group__0__Impl rule__GBraceExpression__Group__1 )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5596:2: rule__GBraceExpression__Group__0__Impl rule__GBraceExpression__Group__1
            {
            pushFollow(FOLLOW_rule__GBraceExpression__Group__0__Impl_in_rule__GBraceExpression__Group__011215);
            rule__GBraceExpression__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__GBraceExpression__Group__1_in_rule__GBraceExpression__Group__011218);
            rule__GBraceExpression__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GBraceExpression__Group__0"


    // $ANTLR start "rule__GBraceExpression__Group__0__Impl"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5603:1: rule__GBraceExpression__Group__0__Impl : ( () ) ;
    public final void rule__GBraceExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5607:1: ( ( () ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5608:1: ( () )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5608:1: ( () )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5609:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGBraceExpressionAccess().getGBraceExpressionAction_0()); 
            }
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5610:1: ()
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5612:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGBraceExpressionAccess().getGBraceExpressionAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GBraceExpression__Group__0__Impl"


    // $ANTLR start "rule__GBraceExpression__Group__1"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5622:1: rule__GBraceExpression__Group__1 : rule__GBraceExpression__Group__1__Impl rule__GBraceExpression__Group__2 ;
    public final void rule__GBraceExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5626:1: ( rule__GBraceExpression__Group__1__Impl rule__GBraceExpression__Group__2 )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5627:2: rule__GBraceExpression__Group__1__Impl rule__GBraceExpression__Group__2
            {
            pushFollow(FOLLOW_rule__GBraceExpression__Group__1__Impl_in_rule__GBraceExpression__Group__111276);
            rule__GBraceExpression__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__GBraceExpression__Group__2_in_rule__GBraceExpression__Group__111279);
            rule__GBraceExpression__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GBraceExpression__Group__1"


    // $ANTLR start "rule__GBraceExpression__Group__1__Impl"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5634:1: rule__GBraceExpression__Group__1__Impl : ( '(' ) ;
    public final void rule__GBraceExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5638:1: ( ( '(' ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5639:1: ( '(' )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5639:1: ( '(' )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5640:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGBraceExpressionAccess().getLeftParenthesisKeyword_1()); 
            }
            match(input,35,FOLLOW_35_in_rule__GBraceExpression__Group__1__Impl11307); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGBraceExpressionAccess().getLeftParenthesisKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GBraceExpression__Group__1__Impl"


    // $ANTLR start "rule__GBraceExpression__Group__2"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5653:1: rule__GBraceExpression__Group__2 : rule__GBraceExpression__Group__2__Impl rule__GBraceExpression__Group__3 ;
    public final void rule__GBraceExpression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5657:1: ( rule__GBraceExpression__Group__2__Impl rule__GBraceExpression__Group__3 )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5658:2: rule__GBraceExpression__Group__2__Impl rule__GBraceExpression__Group__3
            {
            pushFollow(FOLLOW_rule__GBraceExpression__Group__2__Impl_in_rule__GBraceExpression__Group__211338);
            rule__GBraceExpression__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__GBraceExpression__Group__3_in_rule__GBraceExpression__Group__211341);
            rule__GBraceExpression__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GBraceExpression__Group__2"


    // $ANTLR start "rule__GBraceExpression__Group__2__Impl"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5665:1: rule__GBraceExpression__Group__2__Impl : ( ( rule__GBraceExpression__InnerExpressionAssignment_2 ) ) ;
    public final void rule__GBraceExpression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5669:1: ( ( ( rule__GBraceExpression__InnerExpressionAssignment_2 ) ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5670:1: ( ( rule__GBraceExpression__InnerExpressionAssignment_2 ) )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5670:1: ( ( rule__GBraceExpression__InnerExpressionAssignment_2 ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5671:1: ( rule__GBraceExpression__InnerExpressionAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGBraceExpressionAccess().getInnerExpressionAssignment_2()); 
            }
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5672:1: ( rule__GBraceExpression__InnerExpressionAssignment_2 )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5672:2: rule__GBraceExpression__InnerExpressionAssignment_2
            {
            pushFollow(FOLLOW_rule__GBraceExpression__InnerExpressionAssignment_2_in_rule__GBraceExpression__Group__2__Impl11368);
            rule__GBraceExpression__InnerExpressionAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGBraceExpressionAccess().getInnerExpressionAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GBraceExpression__Group__2__Impl"


    // $ANTLR start "rule__GBraceExpression__Group__3"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5682:1: rule__GBraceExpression__Group__3 : rule__GBraceExpression__Group__3__Impl ;
    public final void rule__GBraceExpression__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5686:1: ( rule__GBraceExpression__Group__3__Impl )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5687:2: rule__GBraceExpression__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__GBraceExpression__Group__3__Impl_in_rule__GBraceExpression__Group__311398);
            rule__GBraceExpression__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GBraceExpression__Group__3"


    // $ANTLR start "rule__GBraceExpression__Group__3__Impl"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5693:1: rule__GBraceExpression__Group__3__Impl : ( ')' ) ;
    public final void rule__GBraceExpression__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5697:1: ( ( ')' ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5698:1: ( ')' )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5698:1: ( ')' )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5699:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGBraceExpressionAccess().getRightParenthesisKeyword_3()); 
            }
            match(input,36,FOLLOW_36_in_rule__GBraceExpression__Group__3__Impl11426); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGBraceExpressionAccess().getRightParenthesisKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GBraceExpression__Group__3__Impl"


    // $ANTLR start "rule__QualifiedName__Group__0"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5720:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5724:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5725:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__011465);
            rule__QualifiedName__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__011468);
            rule__QualifiedName__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__0"


    // $ANTLR start "rule__QualifiedName__Group__0__Impl"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5732:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5736:1: ( ( RULE_ID ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5737:1: ( RULE_ID )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5737:1: ( RULE_ID )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5738:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__QualifiedName__Group__0__Impl11495); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__0__Impl"


    // $ANTLR start "rule__QualifiedName__Group__1"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5749:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5753:1: ( rule__QualifiedName__Group__1__Impl )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5754:2: rule__QualifiedName__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__111524);
            rule__QualifiedName__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__1"


    // $ANTLR start "rule__QualifiedName__Group__1__Impl"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5760:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5764:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5765:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5765:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5766:1: ( rule__QualifiedName__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            }
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5767:1: ( rule__QualifiedName__Group_1__0 )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==16) ) {
                    int LA32_2 = input.LA(2);

                    if ( (LA32_2==RULE_ID) ) {
                        int LA32_3 = input.LA(3);

                        if ( (synpred38_InternalBCOoL()) ) {
                            alt32=1;
                        }


                    }


                }


                switch (alt32) {
            	case 1 :
            	    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5767:2: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__QualifiedName__Group_1__0_in_rule__QualifiedName__Group__1__Impl11551);
            	    rule__QualifiedName__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__1__Impl"


    // $ANTLR start "rule__QualifiedName__Group_1__0"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5781:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5785:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5786:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__0__Impl_in_rule__QualifiedName__Group_1__011586);
            rule__QualifiedName__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__1_in_rule__QualifiedName__Group_1__011589);
            rule__QualifiedName__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__0"


    // $ANTLR start "rule__QualifiedName__Group_1__0__Impl"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5793:1: rule__QualifiedName__Group_1__0__Impl : ( ( '.' ) ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5797:1: ( ( ( '.' ) ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5798:1: ( ( '.' ) )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5798:1: ( ( '.' ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5799:1: ( '.' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            }
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5800:1: ( '.' )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5801:2: '.'
            {
            match(input,16,FOLLOW_16_in_rule__QualifiedName__Group_1__0__Impl11618); if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__0__Impl"


    // $ANTLR start "rule__QualifiedName__Group_1__1"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5812:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5816:1: ( rule__QualifiedName__Group_1__1__Impl )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5817:2: rule__QualifiedName__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__1__Impl_in_rule__QualifiedName__Group_1__111650);
            rule__QualifiedName__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__1"


    // $ANTLR start "rule__QualifiedName__Group_1__1__Impl"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5823:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5827:1: ( ( RULE_ID ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5828:1: ( RULE_ID )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5828:1: ( RULE_ID )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5829:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__QualifiedName__Group_1__1__Impl11677); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__1__Impl"


    // $ANTLR start "rule__BCoolSpec__NameAssignment_0"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5845:1: rule__BCoolSpec__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__BCoolSpec__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5849:1: ( ( RULE_ID ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5850:1: ( RULE_ID )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5850:1: ( RULE_ID )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5851:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBCoolSpecAccess().getNameIDTerminalRuleCall_0_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__BCoolSpec__NameAssignment_011715); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBCoolSpecAccess().getNameIDTerminalRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BCoolSpec__NameAssignment_0"


    // $ANTLR start "rule__BCoolSpec__ImportsLibAssignment_1"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5860:1: rule__BCoolSpec__ImportsLibAssignment_1 : ( ruleImportLibRule ) ;
    public final void rule__BCoolSpec__ImportsLibAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5864:1: ( ( ruleImportLibRule ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5865:1: ( ruleImportLibRule )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5865:1: ( ruleImportLibRule )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5866:1: ruleImportLibRule
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBCoolSpecAccess().getImportsLibImportLibRuleParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleImportLibRule_in_rule__BCoolSpec__ImportsLibAssignment_111746);
            ruleImportLibRule();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBCoolSpecAccess().getImportsLibImportLibRuleParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BCoolSpec__ImportsLibAssignment_1"


    // $ANTLR start "rule__BCoolSpec__ImportsBehavioralInterfaceAssignment_2"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5875:1: rule__BCoolSpec__ImportsBehavioralInterfaceAssignment_2 : ( ruleImportInterfaceRule ) ;
    public final void rule__BCoolSpec__ImportsBehavioralInterfaceAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5879:1: ( ( ruleImportInterfaceRule ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5880:1: ( ruleImportInterfaceRule )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5880:1: ( ruleImportInterfaceRule )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5881:1: ruleImportInterfaceRule
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBCoolSpecAccess().getImportsBehavioralInterfaceImportInterfaceRuleParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleImportInterfaceRule_in_rule__BCoolSpec__ImportsBehavioralInterfaceAssignment_211777);
            ruleImportInterfaceRule();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBCoolSpecAccess().getImportsBehavioralInterfaceImportInterfaceRuleParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BCoolSpec__ImportsBehavioralInterfaceAssignment_2"


    // $ANTLR start "rule__BCoolSpec__BcoolOperatorsAssignment_3"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5890:1: rule__BCoolSpec__BcoolOperatorsAssignment_3 : ( ruleBCoolOperatorSpec ) ;
    public final void rule__BCoolSpec__BcoolOperatorsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5894:1: ( ( ruleBCoolOperatorSpec ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5895:1: ( ruleBCoolOperatorSpec )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5895:1: ( ruleBCoolOperatorSpec )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5896:1: ruleBCoolOperatorSpec
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBCoolSpecAccess().getBcoolOperatorsBCoolOperatorSpecParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_ruleBCoolOperatorSpec_in_rule__BCoolSpec__BcoolOperatorsAssignment_311808);
            ruleBCoolOperatorSpec();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBCoolSpecAccess().getBcoolOperatorsBCoolOperatorSpecParserRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BCoolSpec__BcoolOperatorsAssignment_3"


    // $ANTLR start "rule__BCoolOperatorSpec__NameAssignment_1"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5905:1: rule__BCoolOperatorSpec__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__BCoolOperatorSpec__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5909:1: ( ( RULE_ID ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5910:1: ( RULE_ID )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5910:1: ( RULE_ID )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5911:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBCoolOperatorSpecAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__BCoolOperatorSpec__NameAssignment_111839); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBCoolOperatorSpecAccess().getNameIDTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BCoolOperatorSpec__NameAssignment_1"


    // $ANTLR start "rule__BCoolOperatorSpec__GlobalEventExpressionsAssignment_2"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5920:1: rule__BCoolOperatorSpec__GlobalEventExpressionsAssignment_2 : ( ruleglobalEventExpressionRule ) ;
    public final void rule__BCoolOperatorSpec__GlobalEventExpressionsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5924:1: ( ( ruleglobalEventExpressionRule ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5925:1: ( ruleglobalEventExpressionRule )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5925:1: ( ruleglobalEventExpressionRule )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5926:1: ruleglobalEventExpressionRule
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBCoolOperatorSpecAccess().getGlobalEventExpressionsGlobalEventExpressionRuleParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleglobalEventExpressionRule_in_rule__BCoolOperatorSpec__GlobalEventExpressionsAssignment_211870);
            ruleglobalEventExpressionRule();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBCoolOperatorSpecAccess().getGlobalEventExpressionsGlobalEventExpressionRuleParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BCoolOperatorSpec__GlobalEventExpressionsAssignment_2"


    // $ANTLR start "rule__BCoolOperatorSpec__GlobalDSEsAssignment_3"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5935:1: rule__BCoolOperatorSpec__GlobalDSEsAssignment_3 : ( ruleglobalDSEsRule ) ;
    public final void rule__BCoolOperatorSpec__GlobalDSEsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5939:1: ( ( ruleglobalDSEsRule ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5940:1: ( ruleglobalDSEsRule )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5940:1: ( ruleglobalDSEsRule )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5941:1: ruleglobalDSEsRule
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBCoolOperatorSpecAccess().getGlobalDSEsGlobalDSEsRuleParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_ruleglobalDSEsRule_in_rule__BCoolOperatorSpec__GlobalDSEsAssignment_311901);
            ruleglobalDSEsRule();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBCoolOperatorSpecAccess().getGlobalDSEsGlobalDSEsRuleParserRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BCoolOperatorSpec__GlobalDSEsAssignment_3"


    // $ANTLR start "rule__BCoolOperatorSpec__BcoolCompositionRulesAssignment_4"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5950:1: rule__BCoolOperatorSpec__BcoolCompositionRulesAssignment_4 : ( ruleBCoolCompositionRule ) ;
    public final void rule__BCoolOperatorSpec__BcoolCompositionRulesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5954:1: ( ( ruleBCoolCompositionRule ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5955:1: ( ruleBCoolCompositionRule )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5955:1: ( ruleBCoolCompositionRule )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5956:1: ruleBCoolCompositionRule
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBCoolOperatorSpecAccess().getBcoolCompositionRulesBCoolCompositionRuleParserRuleCall_4_0()); 
            }
            pushFollow(FOLLOW_ruleBCoolCompositionRule_in_rule__BCoolOperatorSpec__BcoolCompositionRulesAssignment_411932);
            ruleBCoolCompositionRule();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBCoolOperatorSpecAccess().getBcoolCompositionRulesBCoolCompositionRuleParserRuleCall_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BCoolOperatorSpec__BcoolCompositionRulesAssignment_4"


    // $ANTLR start "rule__GlobalDSEsRule__NameAssignment_1"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5965:1: rule__GlobalDSEsRule__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__GlobalDSEsRule__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5969:1: ( ( RULE_ID ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5970:1: ( RULE_ID )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5970:1: ( RULE_ID )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5971:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGlobalDSEsRuleAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__GlobalDSEsRule__NameAssignment_111963); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGlobalDSEsRuleAccess().getNameIDTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalDSEsRule__NameAssignment_1"


    // $ANTLR start "rule__BCoolCompositionRule__NameAssignment_1"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5980:1: rule__BCoolCompositionRule__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__BCoolCompositionRule__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5984:1: ( ( RULE_ID ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5985:1: ( RULE_ID )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5985:1: ( RULE_ID )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5986:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBCoolCompositionRuleAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__BCoolCompositionRule__NameAssignment_111994); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBCoolCompositionRuleAccess().getNameIDTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BCoolCompositionRule__NameAssignment_1"


    // $ANTLR start "rule__BCoolCompositionRule__BCoolOperatorArgsAssignment_3"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5995:1: rule__BCoolCompositionRule__BCoolOperatorArgsAssignment_3 : ( ruleBCoolOperatorArg ) ;
    public final void rule__BCoolCompositionRule__BCoolOperatorArgsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5999:1: ( ( ruleBCoolOperatorArg ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6000:1: ( ruleBCoolOperatorArg )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6000:1: ( ruleBCoolOperatorArg )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6001:1: ruleBCoolOperatorArg
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBCoolCompositionRuleAccess().getBCoolOperatorArgsBCoolOperatorArgParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_ruleBCoolOperatorArg_in_rule__BCoolCompositionRule__BCoolOperatorArgsAssignment_312025);
            ruleBCoolOperatorArg();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBCoolCompositionRuleAccess().getBCoolOperatorArgsBCoolOperatorArgParserRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BCoolCompositionRule__BCoolOperatorArgsAssignment_3"


    // $ANTLR start "rule__BCoolCompositionRule__BCoolOperatorArgsAssignment_4_1"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6010:1: rule__BCoolCompositionRule__BCoolOperatorArgsAssignment_4_1 : ( ruleBCoolOperatorArg ) ;
    public final void rule__BCoolCompositionRule__BCoolOperatorArgsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6014:1: ( ( ruleBCoolOperatorArg ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6015:1: ( ruleBCoolOperatorArg )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6015:1: ( ruleBCoolOperatorArg )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6016:1: ruleBCoolOperatorArg
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBCoolCompositionRuleAccess().getBCoolOperatorArgsBCoolOperatorArgParserRuleCall_4_1_0()); 
            }
            pushFollow(FOLLOW_ruleBCoolOperatorArg_in_rule__BCoolCompositionRule__BCoolOperatorArgsAssignment_4_112056);
            ruleBCoolOperatorArg();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBCoolCompositionRuleAccess().getBCoolOperatorArgsBCoolOperatorArgParserRuleCall_4_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BCoolCompositionRule__BCoolOperatorArgsAssignment_4_1"


    // $ANTLR start "rule__BCoolCompositionRule__MatchingRuleAssignment_7"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6025:1: rule__BCoolCompositionRule__MatchingRuleAssignment_7 : ( ruleMatchingRule ) ;
    public final void rule__BCoolCompositionRule__MatchingRuleAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6029:1: ( ( ruleMatchingRule ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6030:1: ( ruleMatchingRule )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6030:1: ( ruleMatchingRule )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6031:1: ruleMatchingRule
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBCoolCompositionRuleAccess().getMatchingRuleMatchingRuleParserRuleCall_7_0()); 
            }
            pushFollow(FOLLOW_ruleMatchingRule_in_rule__BCoolCompositionRule__MatchingRuleAssignment_712087);
            ruleMatchingRule();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBCoolCompositionRuleAccess().getMatchingRuleMatchingRuleParserRuleCall_7_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BCoolCompositionRule__MatchingRuleAssignment_7"


    // $ANTLR start "rule__BCoolCompositionRule__CoordinationRuleAssignment_8"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6040:1: rule__BCoolCompositionRule__CoordinationRuleAssignment_8 : ( ruleCoordinationRule ) ;
    public final void rule__BCoolCompositionRule__CoordinationRuleAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6044:1: ( ( ruleCoordinationRule ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6045:1: ( ruleCoordinationRule )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6045:1: ( ruleCoordinationRule )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6046:1: ruleCoordinationRule
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBCoolCompositionRuleAccess().getCoordinationRuleCoordinationRuleParserRuleCall_8_0()); 
            }
            pushFollow(FOLLOW_ruleCoordinationRule_in_rule__BCoolCompositionRule__CoordinationRuleAssignment_812118);
            ruleCoordinationRule();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBCoolCompositionRuleAccess().getCoordinationRuleCoordinationRuleParserRuleCall_8_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BCoolCompositionRule__CoordinationRuleAssignment_8"


    // $ANTLR start "rule__BCoolOperatorArg__NameAssignment_0"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6055:1: rule__BCoolOperatorArg__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__BCoolOperatorArg__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6059:1: ( ( RULE_ID ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6060:1: ( RULE_ID )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6060:1: ( RULE_ID )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6061:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBCoolOperatorArgAccess().getNameIDTerminalRuleCall_0_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__BCoolOperatorArg__NameAssignment_012149); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBCoolOperatorArgAccess().getNameIDTerminalRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BCoolOperatorArg__NameAssignment_0"


    // $ANTLR start "rule__BCoolOperatorArg__InterfaceAssignment_2"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6070:1: rule__BCoolOperatorArg__InterfaceAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__BCoolOperatorArg__InterfaceAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6074:1: ( ( ( RULE_ID ) ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6075:1: ( ( RULE_ID ) )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6075:1: ( ( RULE_ID ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6076:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBCoolOperatorArgAccess().getInterfaceImportInterfaceStatementCrossReference_2_0()); 
            }
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6077:1: ( RULE_ID )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6078:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBCoolOperatorArgAccess().getInterfaceImportInterfaceStatementIDTerminalRuleCall_2_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__BCoolOperatorArg__InterfaceAssignment_212184); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBCoolOperatorArgAccess().getInterfaceImportInterfaceStatementIDTerminalRuleCall_2_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBCoolOperatorArgAccess().getInterfaceImportInterfaceStatementCrossReference_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BCoolOperatorArg__InterfaceAssignment_2"


    // $ANTLR start "rule__BCoolOperatorArg__DSEAssignment_4"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6089:1: rule__BCoolOperatorArg__DSEAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__BCoolOperatorArg__DSEAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6093:1: ( ( ( RULE_ID ) ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6094:1: ( ( RULE_ID ) )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6094:1: ( ( RULE_ID ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6095:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBCoolOperatorArgAccess().getDSEECLDefCSCrossReference_4_0()); 
            }
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6096:1: ( RULE_ID )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6097:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBCoolOperatorArgAccess().getDSEECLDefCSIDTerminalRuleCall_4_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__BCoolOperatorArg__DSEAssignment_412223); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBCoolOperatorArgAccess().getDSEECLDefCSIDTerminalRuleCall_4_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBCoolOperatorArgAccess().getDSEECLDefCSCrossReference_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BCoolOperatorArg__DSEAssignment_4"


    // $ANTLR start "rule__MatchingRule__ConditionAssignment_1"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6108:1: rule__MatchingRule__ConditionAssignment_1 : ( ruleGExpression ) ;
    public final void rule__MatchingRule__ConditionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6112:1: ( ( ruleGExpression ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6113:1: ( ruleGExpression )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6113:1: ( ruleGExpression )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6114:1: ruleGExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMatchingRuleAccess().getConditionGExpressionParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleGExpression_in_rule__MatchingRule__ConditionAssignment_112258);
            ruleGExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMatchingRuleAccess().getConditionGExpressionParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MatchingRule__ConditionAssignment_1"


    // $ANTLR start "rule__MatchingRule__FilterEventExpressionsAssignment_4_1"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6123:1: rule__MatchingRule__FilterEventExpressionsAssignment_4_1 : ( ruleEventExpression ) ;
    public final void rule__MatchingRule__FilterEventExpressionsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6127:1: ( ( ruleEventExpression ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6128:1: ( ruleEventExpression )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6128:1: ( ruleEventExpression )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6129:1: ruleEventExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMatchingRuleAccess().getFilterEventExpressionsEventExpressionParserRuleCall_4_1_0()); 
            }
            pushFollow(FOLLOW_ruleEventExpression_in_rule__MatchingRule__FilterEventExpressionsAssignment_4_112289);
            ruleEventExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMatchingRuleAccess().getFilterEventExpressionsEventExpressionParserRuleCall_4_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MatchingRule__FilterEventExpressionsAssignment_4_1"


    // $ANTLR start "rule__EventExpression__NameAssignment_0"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6138:1: rule__EventExpression__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__EventExpression__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6142:1: ( ( RULE_ID ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6143:1: ( RULE_ID )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6143:1: ( RULE_ID )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6144:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventExpressionAccess().getNameIDTerminalRuleCall_0_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__EventExpression__NameAssignment_012320); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEventExpressionAccess().getNameIDTerminalRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventExpression__NameAssignment_0"


    // $ANTLR start "rule__EventExpression__DeclarationAssignment_2"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6153:1: rule__EventExpression__DeclarationAssignment_2 : ( ( ruleQualifiedName ) ) ;
    public final void rule__EventExpression__DeclarationAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6157:1: ( ( ( ruleQualifiedName ) ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6158:1: ( ( ruleQualifiedName ) )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6158:1: ( ( ruleQualifiedName ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6159:1: ( ruleQualifiedName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventExpressionAccess().getDeclarationExpressionDeclarationCrossReference_2_0()); 
            }
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6160:1: ( ruleQualifiedName )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6161:1: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventExpressionAccess().getDeclarationExpressionDeclarationQualifiedNameParserRuleCall_2_0_1()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__EventExpression__DeclarationAssignment_212355);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEventExpressionAccess().getDeclarationExpressionDeclarationQualifiedNameParserRuleCall_2_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEventExpressionAccess().getDeclarationExpressionDeclarationCrossReference_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventExpression__DeclarationAssignment_2"


    // $ANTLR start "rule__EventExpression__ActualParametersAssignment_4_0"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6172:1: rule__EventExpression__ActualParametersAssignment_4_0 : ( ( RULE_ID ) ) ;
    public final void rule__EventExpression__ActualParametersAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6176:1: ( ( ( RULE_ID ) ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6177:1: ( ( RULE_ID ) )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6177:1: ( ( RULE_ID ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6178:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventExpressionAccess().getActualParametersEObjectCrossReference_4_0_0()); 
            }
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6179:1: ( RULE_ID )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6180:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventExpressionAccess().getActualParametersEObjectIDTerminalRuleCall_4_0_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__EventExpression__ActualParametersAssignment_4_012394); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEventExpressionAccess().getActualParametersEObjectIDTerminalRuleCall_4_0_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEventExpressionAccess().getActualParametersEObjectCrossReference_4_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventExpression__ActualParametersAssignment_4_0"


    // $ANTLR start "rule__EventExpression__ActualParametersAssignment_4_1_1"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6191:1: rule__EventExpression__ActualParametersAssignment_4_1_1 : ( ( RULE_ID ) ) ;
    public final void rule__EventExpression__ActualParametersAssignment_4_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6195:1: ( ( ( RULE_ID ) ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6196:1: ( ( RULE_ID ) )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6196:1: ( ( RULE_ID ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6197:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventExpressionAccess().getActualParametersEObjectCrossReference_4_1_1_0()); 
            }
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6198:1: ( RULE_ID )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6199:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventExpressionAccess().getActualParametersEObjectIDTerminalRuleCall_4_1_1_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__EventExpression__ActualParametersAssignment_4_1_112433); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEventExpressionAccess().getActualParametersEObjectIDTerminalRuleCall_4_1_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEventExpressionAccess().getActualParametersEObjectCrossReference_4_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventExpression__ActualParametersAssignment_4_1_1"


    // $ANTLR start "rule__CoordinationRule__EventRelationsAssignment"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6210:1: rule__CoordinationRule__EventRelationsAssignment : ( ruleEventRelation ) ;
    public final void rule__CoordinationRule__EventRelationsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6214:1: ( ( ruleEventRelation ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6215:1: ( ruleEventRelation )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6215:1: ( ruleEventRelation )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6216:1: ruleEventRelation
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCoordinationRuleAccess().getEventRelationsEventRelationParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleEventRelation_in_rule__CoordinationRule__EventRelationsAssignment12468);
            ruleEventRelation();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCoordinationRuleAccess().getEventRelationsEventRelationParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CoordinationRule__EventRelationsAssignment"


    // $ANTLR start "rule__EventRelation__DeclarationAssignment_1"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6225:1: rule__EventRelation__DeclarationAssignment_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__EventRelation__DeclarationAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6229:1: ( ( ( ruleQualifiedName ) ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6230:1: ( ( ruleQualifiedName ) )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6230:1: ( ( ruleQualifiedName ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6231:1: ( ruleQualifiedName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventRelationAccess().getDeclarationRelationDeclarationCrossReference_1_0()); 
            }
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6232:1: ( ruleQualifiedName )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6233:1: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventRelationAccess().getDeclarationRelationDeclarationQualifiedNameParserRuleCall_1_0_1()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__EventRelation__DeclarationAssignment_112503);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEventRelationAccess().getDeclarationRelationDeclarationQualifiedNameParserRuleCall_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEventRelationAccess().getDeclarationRelationDeclarationCrossReference_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventRelation__DeclarationAssignment_1"


    // $ANTLR start "rule__EventRelation__ActualParametersAssignment_3_0"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6244:1: rule__EventRelation__ActualParametersAssignment_3_0 : ( ( RULE_ID ) ) ;
    public final void rule__EventRelation__ActualParametersAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6248:1: ( ( ( RULE_ID ) ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6249:1: ( ( RULE_ID ) )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6249:1: ( ( RULE_ID ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6250:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventRelationAccess().getActualParametersECLDefCSCrossReference_3_0_0()); 
            }
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6251:1: ( RULE_ID )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6252:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventRelationAccess().getActualParametersECLDefCSIDTerminalRuleCall_3_0_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__EventRelation__ActualParametersAssignment_3_012542); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEventRelationAccess().getActualParametersECLDefCSIDTerminalRuleCall_3_0_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEventRelationAccess().getActualParametersECLDefCSCrossReference_3_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventRelation__ActualParametersAssignment_3_0"


    // $ANTLR start "rule__EventRelation__ActualParametersAssignment_3_1_1"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6263:1: rule__EventRelation__ActualParametersAssignment_3_1_1 : ( ( RULE_ID ) ) ;
    public final void rule__EventRelation__ActualParametersAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6267:1: ( ( ( RULE_ID ) ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6268:1: ( ( RULE_ID ) )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6268:1: ( ( RULE_ID ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6269:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventRelationAccess().getActualParametersECLDefCSCrossReference_3_1_1_0()); 
            }
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6270:1: ( RULE_ID )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6271:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventRelationAccess().getActualParametersECLDefCSIDTerminalRuleCall_3_1_1_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__EventRelation__ActualParametersAssignment_3_1_112581); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEventRelationAccess().getActualParametersECLDefCSIDTerminalRuleCall_3_1_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEventRelationAccess().getActualParametersECLDefCSCrossReference_3_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventRelation__ActualParametersAssignment_3_1_1"


    // $ANTLR start "rule__ImportLibRule__ImportURIAssignment_1"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6282:1: rule__ImportLibRule__ImportURIAssignment_1 : ( RULE_STRING ) ;
    public final void rule__ImportLibRule__ImportURIAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6286:1: ( ( RULE_STRING ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6287:1: ( RULE_STRING )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6287:1: ( RULE_STRING )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6288:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportLibRuleAccess().getImportURISTRINGTerminalRuleCall_1_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__ImportLibRule__ImportURIAssignment_112616); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getImportLibRuleAccess().getImportURISTRINGTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImportLibRule__ImportURIAssignment_1"


    // $ANTLR start "rule__ImportInterfaceRule__ImportURIAssignment_1"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6297:1: rule__ImportInterfaceRule__ImportURIAssignment_1 : ( RULE_STRING ) ;
    public final void rule__ImportInterfaceRule__ImportURIAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6301:1: ( ( RULE_STRING ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6302:1: ( RULE_STRING )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6302:1: ( RULE_STRING )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6303:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportInterfaceRuleAccess().getImportURISTRINGTerminalRuleCall_1_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__ImportInterfaceRule__ImportURIAssignment_112647); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getImportInterfaceRuleAccess().getImportURISTRINGTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImportInterfaceRule__ImportURIAssignment_1"


    // $ANTLR start "rule__ImportInterfaceRule__NameAssignment_3"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6312:1: rule__ImportInterfaceRule__NameAssignment_3 : ( RULE_ID ) ;
    public final void rule__ImportInterfaceRule__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6316:1: ( ( RULE_ID ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6317:1: ( RULE_ID )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6317:1: ( RULE_ID )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6318:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportInterfaceRuleAccess().getNameIDTerminalRuleCall_3_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ImportInterfaceRule__NameAssignment_312678); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getImportInterfaceRuleAccess().getNameIDTerminalRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImportInterfaceRule__NameAssignment_3"


    // $ANTLR start "rule__GImportStatement__ImportURIAssignment_1"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6330:1: rule__GImportStatement__ImportURIAssignment_1 : ( RULE_STRING ) ;
    public final void rule__GImportStatement__ImportURIAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6334:1: ( ( RULE_STRING ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6335:1: ( RULE_STRING )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6335:1: ( RULE_STRING )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6336:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGImportStatementAccess().getImportURISTRINGTerminalRuleCall_1_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__GImportStatement__ImportURIAssignment_112712); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGImportStatementAccess().getImportURISTRINGTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GImportStatement__ImportURIAssignment_1"


    // $ANTLR start "rule__GOrExpression__OperatorAssignment_1_1"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6345:1: rule__GOrExpression__OperatorAssignment_1_1 : ( ruleGOrOperator ) ;
    public final void rule__GOrExpression__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6349:1: ( ( ruleGOrOperator ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6350:1: ( ruleGOrOperator )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6350:1: ( ruleGOrOperator )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6351:1: ruleGOrOperator
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGOrExpressionAccess().getOperatorGOrOperatorEnumRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleGOrOperator_in_rule__GOrExpression__OperatorAssignment_1_112743);
            ruleGOrOperator();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGOrExpressionAccess().getOperatorGOrOperatorEnumRuleCall_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GOrExpression__OperatorAssignment_1_1"


    // $ANTLR start "rule__GOrExpression__RightOperandAssignment_1_2"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6360:1: rule__GOrExpression__RightOperandAssignment_1_2 : ( ruleGXorExpression ) ;
    public final void rule__GOrExpression__RightOperandAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6364:1: ( ( ruleGXorExpression ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6365:1: ( ruleGXorExpression )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6365:1: ( ruleGXorExpression )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6366:1: ruleGXorExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGOrExpressionAccess().getRightOperandGXorExpressionParserRuleCall_1_2_0()); 
            }
            pushFollow(FOLLOW_ruleGXorExpression_in_rule__GOrExpression__RightOperandAssignment_1_212774);
            ruleGXorExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGOrExpressionAccess().getRightOperandGXorExpressionParserRuleCall_1_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GOrExpression__RightOperandAssignment_1_2"


    // $ANTLR start "rule__GXorExpression__OperatorAssignment_1_1"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6375:1: rule__GXorExpression__OperatorAssignment_1_1 : ( ruleGXorOperator ) ;
    public final void rule__GXorExpression__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6379:1: ( ( ruleGXorOperator ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6380:1: ( ruleGXorOperator )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6380:1: ( ruleGXorOperator )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6381:1: ruleGXorOperator
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGXorExpressionAccess().getOperatorGXorOperatorEnumRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleGXorOperator_in_rule__GXorExpression__OperatorAssignment_1_112805);
            ruleGXorOperator();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGXorExpressionAccess().getOperatorGXorOperatorEnumRuleCall_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GXorExpression__OperatorAssignment_1_1"


    // $ANTLR start "rule__GXorExpression__RightOperandAssignment_1_2"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6390:1: rule__GXorExpression__RightOperandAssignment_1_2 : ( ruleGAndExpression ) ;
    public final void rule__GXorExpression__RightOperandAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6394:1: ( ( ruleGAndExpression ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6395:1: ( ruleGAndExpression )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6395:1: ( ruleGAndExpression )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6396:1: ruleGAndExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGXorExpressionAccess().getRightOperandGAndExpressionParserRuleCall_1_2_0()); 
            }
            pushFollow(FOLLOW_ruleGAndExpression_in_rule__GXorExpression__RightOperandAssignment_1_212836);
            ruleGAndExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGXorExpressionAccess().getRightOperandGAndExpressionParserRuleCall_1_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GXorExpression__RightOperandAssignment_1_2"


    // $ANTLR start "rule__GAndExpression__OperatorAssignment_1_1"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6405:1: rule__GAndExpression__OperatorAssignment_1_1 : ( ruleGAndOperator ) ;
    public final void rule__GAndExpression__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6409:1: ( ( ruleGAndOperator ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6410:1: ( ruleGAndOperator )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6410:1: ( ruleGAndOperator )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6411:1: ruleGAndOperator
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGAndExpressionAccess().getOperatorGAndOperatorEnumRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleGAndOperator_in_rule__GAndExpression__OperatorAssignment_1_112867);
            ruleGAndOperator();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGAndExpressionAccess().getOperatorGAndOperatorEnumRuleCall_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GAndExpression__OperatorAssignment_1_1"


    // $ANTLR start "rule__GAndExpression__RightOperandAssignment_1_2"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6420:1: rule__GAndExpression__RightOperandAssignment_1_2 : ( ruleGEqualityExpression ) ;
    public final void rule__GAndExpression__RightOperandAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6424:1: ( ( ruleGEqualityExpression ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6425:1: ( ruleGEqualityExpression )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6425:1: ( ruleGEqualityExpression )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6426:1: ruleGEqualityExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGAndExpressionAccess().getRightOperandGEqualityExpressionParserRuleCall_1_2_0()); 
            }
            pushFollow(FOLLOW_ruleGEqualityExpression_in_rule__GAndExpression__RightOperandAssignment_1_212898);
            ruleGEqualityExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGAndExpressionAccess().getRightOperandGEqualityExpressionParserRuleCall_1_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GAndExpression__RightOperandAssignment_1_2"


    // $ANTLR start "rule__GEqualityExpression__OperatorAssignment_1_1"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6435:1: rule__GEqualityExpression__OperatorAssignment_1_1 : ( ruleGEqualityOperator ) ;
    public final void rule__GEqualityExpression__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6439:1: ( ( ruleGEqualityOperator ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6440:1: ( ruleGEqualityOperator )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6440:1: ( ruleGEqualityOperator )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6441:1: ruleGEqualityOperator
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGEqualityExpressionAccess().getOperatorGEqualityOperatorEnumRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleGEqualityOperator_in_rule__GEqualityExpression__OperatorAssignment_1_112929);
            ruleGEqualityOperator();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGEqualityExpressionAccess().getOperatorGEqualityOperatorEnumRuleCall_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GEqualityExpression__OperatorAssignment_1_1"


    // $ANTLR start "rule__GEqualityExpression__RightOperandAssignment_1_2"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6450:1: rule__GEqualityExpression__RightOperandAssignment_1_2 : ( ruleGRelationExpression ) ;
    public final void rule__GEqualityExpression__RightOperandAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6454:1: ( ( ruleGRelationExpression ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6455:1: ( ruleGRelationExpression )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6455:1: ( ruleGRelationExpression )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6456:1: ruleGRelationExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGEqualityExpressionAccess().getRightOperandGRelationExpressionParserRuleCall_1_2_0()); 
            }
            pushFollow(FOLLOW_ruleGRelationExpression_in_rule__GEqualityExpression__RightOperandAssignment_1_212960);
            ruleGRelationExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGEqualityExpressionAccess().getRightOperandGRelationExpressionParserRuleCall_1_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GEqualityExpression__RightOperandAssignment_1_2"


    // $ANTLR start "rule__GRelationExpression__OperatorAssignment_1_1"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6465:1: rule__GRelationExpression__OperatorAssignment_1_1 : ( ruleGRelationOperator ) ;
    public final void rule__GRelationExpression__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6469:1: ( ( ruleGRelationOperator ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6470:1: ( ruleGRelationOperator )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6470:1: ( ruleGRelationOperator )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6471:1: ruleGRelationOperator
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGRelationExpressionAccess().getOperatorGRelationOperatorEnumRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleGRelationOperator_in_rule__GRelationExpression__OperatorAssignment_1_112991);
            ruleGRelationOperator();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGRelationExpressionAccess().getOperatorGRelationOperatorEnumRuleCall_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GRelationExpression__OperatorAssignment_1_1"


    // $ANTLR start "rule__GRelationExpression__RightOperandAssignment_1_2"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6480:1: rule__GRelationExpression__RightOperandAssignment_1_2 : ( ruleGAdditionExpression ) ;
    public final void rule__GRelationExpression__RightOperandAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6484:1: ( ( ruleGAdditionExpression ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6485:1: ( ruleGAdditionExpression )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6485:1: ( ruleGAdditionExpression )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6486:1: ruleGAdditionExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGRelationExpressionAccess().getRightOperandGAdditionExpressionParserRuleCall_1_2_0()); 
            }
            pushFollow(FOLLOW_ruleGAdditionExpression_in_rule__GRelationExpression__RightOperandAssignment_1_213022);
            ruleGAdditionExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGRelationExpressionAccess().getRightOperandGAdditionExpressionParserRuleCall_1_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GRelationExpression__RightOperandAssignment_1_2"


    // $ANTLR start "rule__GAdditionExpression__OperatorAssignment_1_1"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6495:1: rule__GAdditionExpression__OperatorAssignment_1_1 : ( ruleGAdditionOperator ) ;
    public final void rule__GAdditionExpression__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6499:1: ( ( ruleGAdditionOperator ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6500:1: ( ruleGAdditionOperator )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6500:1: ( ruleGAdditionOperator )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6501:1: ruleGAdditionOperator
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGAdditionExpressionAccess().getOperatorGAdditionOperatorEnumRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleGAdditionOperator_in_rule__GAdditionExpression__OperatorAssignment_1_113053);
            ruleGAdditionOperator();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGAdditionExpressionAccess().getOperatorGAdditionOperatorEnumRuleCall_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GAdditionExpression__OperatorAssignment_1_1"


    // $ANTLR start "rule__GAdditionExpression__RightOperandAssignment_1_2"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6510:1: rule__GAdditionExpression__RightOperandAssignment_1_2 : ( ruleGMultiplicationExpression ) ;
    public final void rule__GAdditionExpression__RightOperandAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6514:1: ( ( ruleGMultiplicationExpression ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6515:1: ( ruleGMultiplicationExpression )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6515:1: ( ruleGMultiplicationExpression )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6516:1: ruleGMultiplicationExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGAdditionExpressionAccess().getRightOperandGMultiplicationExpressionParserRuleCall_1_2_0()); 
            }
            pushFollow(FOLLOW_ruleGMultiplicationExpression_in_rule__GAdditionExpression__RightOperandAssignment_1_213084);
            ruleGMultiplicationExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGAdditionExpressionAccess().getRightOperandGMultiplicationExpressionParserRuleCall_1_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GAdditionExpression__RightOperandAssignment_1_2"


    // $ANTLR start "rule__GMultiplicationExpression__OperatorAssignment_1_1"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6525:1: rule__GMultiplicationExpression__OperatorAssignment_1_1 : ( ruleGMultiplicationOperator ) ;
    public final void rule__GMultiplicationExpression__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6529:1: ( ( ruleGMultiplicationOperator ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6530:1: ( ruleGMultiplicationOperator )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6530:1: ( ruleGMultiplicationOperator )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6531:1: ruleGMultiplicationOperator
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGMultiplicationExpressionAccess().getOperatorGMultiplicationOperatorEnumRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleGMultiplicationOperator_in_rule__GMultiplicationExpression__OperatorAssignment_1_113115);
            ruleGMultiplicationOperator();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGMultiplicationExpressionAccess().getOperatorGMultiplicationOperatorEnumRuleCall_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GMultiplicationExpression__OperatorAssignment_1_1"


    // $ANTLR start "rule__GMultiplicationExpression__RightOperandAssignment_1_2"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6540:1: rule__GMultiplicationExpression__RightOperandAssignment_1_2 : ( ruleGNegationExpression ) ;
    public final void rule__GMultiplicationExpression__RightOperandAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6544:1: ( ( ruleGNegationExpression ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6545:1: ( ruleGNegationExpression )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6545:1: ( ruleGNegationExpression )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6546:1: ruleGNegationExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGMultiplicationExpressionAccess().getRightOperandGNegationExpressionParserRuleCall_1_2_0()); 
            }
            pushFollow(FOLLOW_ruleGNegationExpression_in_rule__GMultiplicationExpression__RightOperandAssignment_1_213146);
            ruleGNegationExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGMultiplicationExpressionAccess().getRightOperandGNegationExpressionParserRuleCall_1_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GMultiplicationExpression__RightOperandAssignment_1_2"


    // $ANTLR start "rule__GNegationExpression__OperatorAssignment_1_1"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6555:1: rule__GNegationExpression__OperatorAssignment_1_1 : ( ruleGNegationOperator ) ;
    public final void rule__GNegationExpression__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6559:1: ( ( ruleGNegationOperator ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6560:1: ( ruleGNegationOperator )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6560:1: ( ruleGNegationOperator )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6561:1: ruleGNegationOperator
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGNegationExpressionAccess().getOperatorGNegationOperatorEnumRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleGNegationOperator_in_rule__GNegationExpression__OperatorAssignment_1_113177);
            ruleGNegationOperator();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGNegationExpressionAccess().getOperatorGNegationOperatorEnumRuleCall_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GNegationExpression__OperatorAssignment_1_1"


    // $ANTLR start "rule__GNegationExpression__OperandAssignment_1_2"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6570:1: rule__GNegationExpression__OperandAssignment_1_2 : ( ruleGNavigationExpression ) ;
    public final void rule__GNegationExpression__OperandAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6574:1: ( ( ruleGNavigationExpression ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6575:1: ( ruleGNavigationExpression )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6575:1: ( ruleGNavigationExpression )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6576:1: ruleGNavigationExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGNegationExpressionAccess().getOperandGNavigationExpressionParserRuleCall_1_2_0()); 
            }
            pushFollow(FOLLOW_ruleGNavigationExpression_in_rule__GNegationExpression__OperandAssignment_1_213208);
            ruleGNavigationExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGNegationExpressionAccess().getOperandGNavigationExpressionParserRuleCall_1_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GNegationExpression__OperandAssignment_1_2"


    // $ANTLR start "rule__GNavigationExpression__ReferencedEObjectAssignment_1_2"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6585:1: rule__GNavigationExpression__ReferencedEObjectAssignment_1_2 : ( ( RULE_ID ) ) ;
    public final void rule__GNavigationExpression__ReferencedEObjectAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6589:1: ( ( ( RULE_ID ) ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6590:1: ( ( RULE_ID ) )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6590:1: ( ( RULE_ID ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6591:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGNavigationExpressionAccess().getReferencedEObjectEObjectCrossReference_1_2_0()); 
            }
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6592:1: ( RULE_ID )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6593:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGNavigationExpressionAccess().getReferencedEObjectEObjectIDTerminalRuleCall_1_2_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__GNavigationExpression__ReferencedEObjectAssignment_1_213243); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGNavigationExpressionAccess().getReferencedEObjectEObjectIDTerminalRuleCall_1_2_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGNavigationExpressionAccess().getReferencedEObjectEObjectCrossReference_1_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GNavigationExpression__ReferencedEObjectAssignment_1_2"


    // $ANTLR start "rule__GReferenceExpression__ReferencedEObjectAssignment_1_1"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6604:1: rule__GReferenceExpression__ReferencedEObjectAssignment_1_1 : ( ( RULE_ID ) ) ;
    public final void rule__GReferenceExpression__ReferencedEObjectAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6608:1: ( ( ( RULE_ID ) ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6609:1: ( ( RULE_ID ) )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6609:1: ( ( RULE_ID ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6610:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGReferenceExpressionAccess().getReferencedEObjectEObjectCrossReference_1_1_0()); 
            }
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6611:1: ( RULE_ID )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6612:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGReferenceExpressionAccess().getReferencedEObjectEObjectIDTerminalRuleCall_1_1_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__GReferenceExpression__ReferencedEObjectAssignment_1_113282); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGReferenceExpressionAccess().getReferencedEObjectEObjectIDTerminalRuleCall_1_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGReferenceExpressionAccess().getReferencedEObjectEObjectCrossReference_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GReferenceExpression__ReferencedEObjectAssignment_1_1"


    // $ANTLR start "rule__GStringExpression__ValueAssignment_1"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6623:1: rule__GStringExpression__ValueAssignment_1 : ( RULE_STRING ) ;
    public final void rule__GStringExpression__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6627:1: ( ( RULE_STRING ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6628:1: ( RULE_STRING )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6628:1: ( RULE_STRING )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6629:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGStringExpressionAccess().getValueSTRINGTerminalRuleCall_1_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__GStringExpression__ValueAssignment_113317); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGStringExpressionAccess().getValueSTRINGTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GStringExpression__ValueAssignment_1"


    // $ANTLR start "rule__GBooleanExpression__ValueAssignment_1"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6638:1: rule__GBooleanExpression__ValueAssignment_1 : ( RULE_BOOLEAN ) ;
    public final void rule__GBooleanExpression__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6642:1: ( ( RULE_BOOLEAN ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6643:1: ( RULE_BOOLEAN )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6643:1: ( RULE_BOOLEAN )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6644:1: RULE_BOOLEAN
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGBooleanExpressionAccess().getValueBOOLEANTerminalRuleCall_1_0()); 
            }
            match(input,RULE_BOOLEAN,FOLLOW_RULE_BOOLEAN_in_rule__GBooleanExpression__ValueAssignment_113348); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGBooleanExpressionAccess().getValueBOOLEANTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GBooleanExpression__ValueAssignment_1"


    // $ANTLR start "rule__GIntegerExpression__ValueAssignment_1"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6653:1: rule__GIntegerExpression__ValueAssignment_1 : ( RULE_INT ) ;
    public final void rule__GIntegerExpression__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6657:1: ( ( RULE_INT ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6658:1: ( RULE_INT )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6658:1: ( RULE_INT )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6659:1: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGIntegerExpressionAccess().getValueINTTerminalRuleCall_1_0()); 
            }
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__GIntegerExpression__ValueAssignment_113379); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGIntegerExpressionAccess().getValueINTTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GIntegerExpression__ValueAssignment_1"


    // $ANTLR start "rule__GDoubleExpression__ValueAssignment_1"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6668:1: rule__GDoubleExpression__ValueAssignment_1 : ( RULE_DOUBLE ) ;
    public final void rule__GDoubleExpression__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6672:1: ( ( RULE_DOUBLE ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6673:1: ( RULE_DOUBLE )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6673:1: ( RULE_DOUBLE )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6674:1: RULE_DOUBLE
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGDoubleExpressionAccess().getValueDOUBLETerminalRuleCall_1_0()); 
            }
            match(input,RULE_DOUBLE,FOLLOW_RULE_DOUBLE_in_rule__GDoubleExpression__ValueAssignment_113410); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGDoubleExpressionAccess().getValueDOUBLETerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GDoubleExpression__ValueAssignment_1"


    // $ANTLR start "rule__GEnumLiteralExpression__ValueAssignment_2"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6683:1: rule__GEnumLiteralExpression__ValueAssignment_2 : ( ( ruleQualifiedName ) ) ;
    public final void rule__GEnumLiteralExpression__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6687:1: ( ( ( ruleQualifiedName ) ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6688:1: ( ( ruleQualifiedName ) )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6688:1: ( ( ruleQualifiedName ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6689:1: ( ruleQualifiedName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGEnumLiteralExpressionAccess().getValueEEnumLiteralCrossReference_2_0()); 
            }
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6690:1: ( ruleQualifiedName )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6691:1: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGEnumLiteralExpressionAccess().getValueEEnumLiteralQualifiedNameParserRuleCall_2_0_1()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__GEnumLiteralExpression__ValueAssignment_213445);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGEnumLiteralExpressionAccess().getValueEEnumLiteralQualifiedNameParserRuleCall_2_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGEnumLiteralExpressionAccess().getValueEEnumLiteralCrossReference_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GEnumLiteralExpression__ValueAssignment_2"


    // $ANTLR start "rule__GIfExpression__ConditionAssignment_2"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6702:1: rule__GIfExpression__ConditionAssignment_2 : ( ruleGExpression ) ;
    public final void rule__GIfExpression__ConditionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6706:1: ( ( ruleGExpression ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6707:1: ( ruleGExpression )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6707:1: ( ruleGExpression )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6708:1: ruleGExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGIfExpressionAccess().getConditionGExpressionParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleGExpression_in_rule__GIfExpression__ConditionAssignment_213480);
            ruleGExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGIfExpressionAccess().getConditionGExpressionParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GIfExpression__ConditionAssignment_2"


    // $ANTLR start "rule__GIfExpression__ThenExpressionAssignment_4"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6717:1: rule__GIfExpression__ThenExpressionAssignment_4 : ( ruleGExpression ) ;
    public final void rule__GIfExpression__ThenExpressionAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6721:1: ( ( ruleGExpression ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6722:1: ( ruleGExpression )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6722:1: ( ruleGExpression )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6723:1: ruleGExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGIfExpressionAccess().getThenExpressionGExpressionParserRuleCall_4_0()); 
            }
            pushFollow(FOLLOW_ruleGExpression_in_rule__GIfExpression__ThenExpressionAssignment_413511);
            ruleGExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGIfExpressionAccess().getThenExpressionGExpressionParserRuleCall_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GIfExpression__ThenExpressionAssignment_4"


    // $ANTLR start "rule__GIfExpression__ElseExpressionAssignment_6"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6732:1: rule__GIfExpression__ElseExpressionAssignment_6 : ( ruleGExpression ) ;
    public final void rule__GIfExpression__ElseExpressionAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6736:1: ( ( ruleGExpression ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6737:1: ( ruleGExpression )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6737:1: ( ruleGExpression )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6738:1: ruleGExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGIfExpressionAccess().getElseExpressionGExpressionParserRuleCall_6_0()); 
            }
            pushFollow(FOLLOW_ruleGExpression_in_rule__GIfExpression__ElseExpressionAssignment_613542);
            ruleGExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGIfExpressionAccess().getElseExpressionGExpressionParserRuleCall_6_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GIfExpression__ElseExpressionAssignment_6"


    // $ANTLR start "rule__GBraceExpression__InnerExpressionAssignment_2"
    // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6747:1: rule__GBraceExpression__InnerExpressionAssignment_2 : ( ruleGExpression ) ;
    public final void rule__GBraceExpression__InnerExpressionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6751:1: ( ( ruleGExpression ) )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6752:1: ( ruleGExpression )
            {
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6752:1: ( ruleGExpression )
            // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:6753:1: ruleGExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGBraceExpressionAccess().getInnerExpressionGExpressionParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleGExpression_in_rule__GBraceExpression__InnerExpressionAssignment_213573);
            ruleGExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGBraceExpressionAccess().getInnerExpressionGExpressionParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GBraceExpression__InnerExpressionAssignment_2"

    // $ANTLR start synpred38_InternalBCOoL
    public final void synpred38_InternalBCOoL_fragment() throws RecognitionException {   
        // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5767:2: ( rule__QualifiedName__Group_1__0 )
        // ../org.gemoc.bcool.model.xtext.ui/src-gen/org/gemoc/bcool/model/xtext/ui/contentassist/antlr/internal/InternalBCOoL.g:5767:2: rule__QualifiedName__Group_1__0
        {
        pushFollow(FOLLOW_rule__QualifiedName__Group_1__0_in_synpred38_InternalBCOoL11551);
        rule__QualifiedName__Group_1__0();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred38_InternalBCOoL

    // Delegated rules

    public final boolean synpred38_InternalBCOoL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred38_InternalBCOoL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


 

    public static final BitSet FOLLOW_ruleBCoolSpec_in_entryRuleBCoolSpec67 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBCoolSpec74 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BCoolSpec__Group__0_in_ruleBCoolSpec100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBCoolOperatorSpec_in_entryRuleBCoolOperatorSpec127 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBCoolOperatorSpec134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BCoolOperatorSpec__Group__0_in_ruleBCoolOperatorSpec160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleglobalDSEsRule_in_entryRuleglobalDSEsRule187 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleglobalDSEsRule194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GlobalDSEsRule__Group__0_in_ruleglobalDSEsRule220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleglobalEventExpressionRule_in_entryRuleglobalEventExpressionRule247 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleglobalEventExpressionRule254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GlobalEventExpressionRule__Group__0_in_ruleglobalEventExpressionRule280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBCoolCompositionRule_in_entryRuleBCoolCompositionRule307 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBCoolCompositionRule314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BCoolCompositionRule__Group__0_in_ruleBCoolCompositionRule340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBCoolOperatorArg_in_entryRuleBCoolOperatorArg367 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBCoolOperatorArg374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BCoolOperatorArg__Group__0_in_ruleBCoolOperatorArg400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMatchingRule_in_entryRuleMatchingRule427 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMatchingRule434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MatchingRule__Group__0_in_ruleMatchingRule460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEventExpression_in_entryRuleEventExpression487 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEventExpression494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EventExpression__Group__0_in_ruleEventExpression520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCoordinationRule_in_entryRuleCoordinationRule547 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCoordinationRule554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CoordinationRule__EventRelationsAssignment_in_ruleCoordinationRule580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEventRelation_in_entryRuleEventRelation607 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEventRelation614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EventRelation__Group__0_in_ruleEventRelation640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImportLibRule_in_entryRuleImportLibRule667 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImportLibRule674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImportLibRule__Group__0_in_ruleImportLibRule700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImportInterfaceRule_in_entryRuleImportInterfaceRule727 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImportInterfaceRule734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImportInterfaceRule__Group__0_in_ruleImportInterfaceRule760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGImportStatement_in_entryRuleGImportStatement789 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGImportStatement796 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GImportStatement__Group__0_in_ruleGImportStatement822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGExpression_in_entryRuleGExpression849 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGExpression856 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGOrExpression_in_ruleGExpression882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGOrExpression_in_entryRuleGOrExpression908 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGOrExpression915 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GOrExpression__Group__0_in_ruleGOrExpression941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGXorExpression_in_entryRuleGXorExpression968 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGXorExpression975 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GXorExpression__Group__0_in_ruleGXorExpression1001 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGAndExpression_in_entryRuleGAndExpression1028 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGAndExpression1035 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GAndExpression__Group__0_in_ruleGAndExpression1061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGEqualityExpression_in_entryRuleGEqualityExpression1088 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGEqualityExpression1095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GEqualityExpression__Group__0_in_ruleGEqualityExpression1121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGRelationExpression_in_entryRuleGRelationExpression1148 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGRelationExpression1155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GRelationExpression__Group__0_in_ruleGRelationExpression1181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGAdditionExpression_in_entryRuleGAdditionExpression1208 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGAdditionExpression1215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GAdditionExpression__Group__0_in_ruleGAdditionExpression1241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGMultiplicationExpression_in_entryRuleGMultiplicationExpression1268 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGMultiplicationExpression1275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GMultiplicationExpression__Group__0_in_ruleGMultiplicationExpression1301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGNegationExpression_in_entryRuleGNegationExpression1328 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGNegationExpression1335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GNegationExpression__Alternatives_in_ruleGNegationExpression1361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGNavigationExpression_in_entryRuleGNavigationExpression1388 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGNavigationExpression1395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GNavigationExpression__Group__0_in_ruleGNavigationExpression1421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGReferenceExpression_in_entryRuleGReferenceExpression1448 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGReferenceExpression1455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GReferenceExpression__Alternatives_in_ruleGReferenceExpression1481 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGPrimaryExpression_in_entryRuleGPrimaryExpression1508 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGPrimaryExpression1515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GPrimaryExpression__Alternatives_in_ruleGPrimaryExpression1541 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGStringExpression_in_entryRuleGStringExpression1568 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGStringExpression1575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GStringExpression__Group__0_in_ruleGStringExpression1601 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGBooleanExpression_in_entryRuleGBooleanExpression1628 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGBooleanExpression1635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GBooleanExpression__Group__0_in_ruleGBooleanExpression1661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGNumericExpression_in_entryRuleGNumericExpression1688 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGNumericExpression1695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GNumericExpression__Alternatives_in_ruleGNumericExpression1721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGIntegerExpression_in_entryRuleGIntegerExpression1748 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGIntegerExpression1755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GIntegerExpression__Group__0_in_ruleGIntegerExpression1781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGDoubleExpression_in_entryRuleGDoubleExpression1808 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGDoubleExpression1815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GDoubleExpression__Group__0_in_ruleGDoubleExpression1841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGEnumLiteralExpression_in_entryRuleGEnumLiteralExpression1868 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGEnumLiteralExpression1875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GEnumLiteralExpression__Group__0_in_ruleGEnumLiteralExpression1901 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGIfExpression_in_entryRuleGIfExpression1928 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGIfExpression1935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GIfExpression__Group__0_in_ruleGIfExpression1961 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGBraceExpression_in_entryRuleGBraceExpression1988 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGBraceExpression1995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GBraceExpression__Group__0_in_ruleGBraceExpression2021 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNavigationOperator_in_entryRuleNavigationOperator2048 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNavigationOperator2055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NavigationOperator__Alternatives_in_ruleNavigationOperator2081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName2108 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName2115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__0_in_ruleQualifiedName2141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleGAndOperator2179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleGXorOperator2218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleGOrOperator2257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GEqualityOperator__Alternatives_in_ruleGEqualityOperator2295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GRelationOperator__Alternatives_in_ruleGRelationOperator2331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GAdditionOperator__Alternatives_in_ruleGAdditionOperator2367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GMultiplicationOperator__Alternatives_in_ruleGMultiplicationOperator2403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GNegationOperator__Alternatives_in_ruleGNegationOperator2439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGNavigationExpression_in_rule__GNegationExpression__Alternatives2474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GNegationExpression__Group_1__0_in_rule__GNegationExpression__Alternatives2491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGPrimaryExpression_in_rule__GReferenceExpression__Alternatives2524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GReferenceExpression__Group_1__0_in_rule__GReferenceExpression__Alternatives2541 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGStringExpression_in_rule__GPrimaryExpression__Alternatives2574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGBooleanExpression_in_rule__GPrimaryExpression__Alternatives2591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGNumericExpression_in_rule__GPrimaryExpression__Alternatives2608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGEnumLiteralExpression_in_rule__GPrimaryExpression__Alternatives2625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGIfExpression_in_rule__GPrimaryExpression__Alternatives2642 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGBraceExpression_in_rule__GPrimaryExpression__Alternatives2659 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGIntegerExpression_in_rule__GNumericExpression__Alternatives2691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGDoubleExpression_in_rule__GNumericExpression__Alternatives2708 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__NavigationOperator__Alternatives2741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__NavigationOperator__Alternatives2761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__GEqualityOperator__Alternatives2796 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__GEqualityOperator__Alternatives2817 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__GRelationOperator__Alternatives2853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__GRelationOperator__Alternatives2874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__GRelationOperator__Alternatives2895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__GRelationOperator__Alternatives2916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__GAdditionOperator__Alternatives2952 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__GAdditionOperator__Alternatives2973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__GMultiplicationOperator__Alternatives3009 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__GMultiplicationOperator__Alternatives3030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__GNegationOperator__Alternatives3066 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__GNegationOperator__Alternatives3087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BCoolSpec__Group__0__Impl_in_rule__BCoolSpec__Group__03120 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_rule__BCoolSpec__Group__1_in_rule__BCoolSpec__Group__03123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BCoolSpec__NameAssignment_0_in_rule__BCoolSpec__Group__0__Impl3150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BCoolSpec__Group__1__Impl_in_rule__BCoolSpec__Group__13181 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_rule__BCoolSpec__Group__2_in_rule__BCoolSpec__Group__13184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BCoolSpec__ImportsLibAssignment_1_in_rule__BCoolSpec__Group__1__Impl3213 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_rule__BCoolSpec__ImportsLibAssignment_1_in_rule__BCoolSpec__Group__1__Impl3225 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_rule__BCoolSpec__Group__2__Impl_in_rule__BCoolSpec__Group__23258 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__BCoolSpec__Group__3_in_rule__BCoolSpec__Group__23261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BCoolSpec__ImportsBehavioralInterfaceAssignment_2_in_rule__BCoolSpec__Group__2__Impl3290 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_rule__BCoolSpec__ImportsBehavioralInterfaceAssignment_2_in_rule__BCoolSpec__Group__2__Impl3302 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_rule__BCoolSpec__Group__3__Impl_in_rule__BCoolSpec__Group__33335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BCoolSpec__BcoolOperatorsAssignment_3_in_rule__BCoolSpec__Group__3__Impl3364 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_rule__BCoolSpec__BcoolOperatorsAssignment_3_in_rule__BCoolSpec__Group__3__Impl3376 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_rule__BCoolOperatorSpec__Group__0__Impl_in_rule__BCoolOperatorSpec__Group__03417 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__BCoolOperatorSpec__Group__1_in_rule__BCoolOperatorSpec__Group__03420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__BCoolOperatorSpec__Group__0__Impl3448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BCoolOperatorSpec__Group__1__Impl_in_rule__BCoolOperatorSpec__Group__13479 = new BitSet(new long[]{0x0000000680000000L});
    public static final BitSet FOLLOW_rule__BCoolOperatorSpec__Group__2_in_rule__BCoolOperatorSpec__Group__13482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BCoolOperatorSpec__NameAssignment_1_in_rule__BCoolOperatorSpec__Group__1__Impl3509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BCoolOperatorSpec__Group__2__Impl_in_rule__BCoolOperatorSpec__Group__23539 = new BitSet(new long[]{0x0000000680000000L});
    public static final BitSet FOLLOW_rule__BCoolOperatorSpec__Group__3_in_rule__BCoolOperatorSpec__Group__23542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BCoolOperatorSpec__GlobalEventExpressionsAssignment_2_in_rule__BCoolOperatorSpec__Group__2__Impl3569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BCoolOperatorSpec__Group__3__Impl_in_rule__BCoolOperatorSpec__Group__33600 = new BitSet(new long[]{0x0000000680000000L});
    public static final BitSet FOLLOW_rule__BCoolOperatorSpec__Group__4_in_rule__BCoolOperatorSpec__Group__33603 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BCoolOperatorSpec__GlobalDSEsAssignment_3_in_rule__BCoolOperatorSpec__Group__3__Impl3630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BCoolOperatorSpec__Group__4__Impl_in_rule__BCoolOperatorSpec__Group__43661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BCoolOperatorSpec__BcoolCompositionRulesAssignment_4_in_rule__BCoolOperatorSpec__Group__4__Impl3690 = new BitSet(new long[]{0x0000000680000002L});
    public static final BitSet FOLLOW_rule__BCoolOperatorSpec__BcoolCompositionRulesAssignment_4_in_rule__BCoolOperatorSpec__Group__4__Impl3702 = new BitSet(new long[]{0x0000000680000002L});
    public static final BitSet FOLLOW_rule__GlobalDSEsRule__Group__0__Impl_in_rule__GlobalDSEsRule__Group__03745 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__GlobalDSEsRule__Group__1_in_rule__GlobalDSEsRule__Group__03748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__GlobalDSEsRule__Group__0__Impl3776 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GlobalDSEsRule__Group__1__Impl_in_rule__GlobalDSEsRule__Group__13807 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__GlobalDSEsRule__Group__2_in_rule__GlobalDSEsRule__Group__13810 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GlobalDSEsRule__NameAssignment_1_in_rule__GlobalDSEsRule__Group__1__Impl3837 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GlobalDSEsRule__Group__2__Impl_in_rule__GlobalDSEsRule__Group__23867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__GlobalDSEsRule__Group__2__Impl3895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GlobalEventExpressionRule__Group__0__Impl_in_rule__GlobalEventExpressionRule__Group__03932 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__GlobalEventExpressionRule__Group__1_in_rule__GlobalEventExpressionRule__Group__03935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__GlobalEventExpressionRule__Group__0__Impl3963 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GlobalEventExpressionRule__Group__1__Impl_in_rule__GlobalEventExpressionRule__Group__13994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEventExpression_in_rule__GlobalEventExpressionRule__Group__1__Impl4021 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BCoolCompositionRule__Group__0__Impl_in_rule__BCoolCompositionRule__Group__04054 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__BCoolCompositionRule__Group__1_in_rule__BCoolCompositionRule__Group__04057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__BCoolCompositionRule__Group__0__Impl4085 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BCoolCompositionRule__Group__1__Impl_in_rule__BCoolCompositionRule__Group__14116 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_rule__BCoolCompositionRule__Group__2_in_rule__BCoolCompositionRule__Group__14119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BCoolCompositionRule__NameAssignment_1_in_rule__BCoolCompositionRule__Group__1__Impl4146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BCoolCompositionRule__Group__2__Impl_in_rule__BCoolCompositionRule__Group__24176 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__BCoolCompositionRule__Group__3_in_rule__BCoolCompositionRule__Group__24179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__BCoolCompositionRule__Group__2__Impl4207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BCoolCompositionRule__Group__3__Impl_in_rule__BCoolCompositionRule__Group__34238 = new BitSet(new long[]{0x0000009000000000L});
    public static final BitSet FOLLOW_rule__BCoolCompositionRule__Group__4_in_rule__BCoolCompositionRule__Group__34241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BCoolCompositionRule__BCoolOperatorArgsAssignment_3_in_rule__BCoolCompositionRule__Group__3__Impl4268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BCoolCompositionRule__Group__4__Impl_in_rule__BCoolCompositionRule__Group__44298 = new BitSet(new long[]{0x0000009000000000L});
    public static final BitSet FOLLOW_rule__BCoolCompositionRule__Group__5_in_rule__BCoolCompositionRule__Group__44301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BCoolCompositionRule__Group_4__0_in_rule__BCoolCompositionRule__Group__4__Impl4328 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_rule__BCoolCompositionRule__Group__5__Impl_in_rule__BCoolCompositionRule__Group__54359 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_rule__BCoolCompositionRule__Group__6_in_rule__BCoolCompositionRule__Group__54362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__BCoolCompositionRule__Group__5__Impl4390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BCoolCompositionRule__Group__6__Impl_in_rule__BCoolCompositionRule__Group__64421 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_rule__BCoolCompositionRule__Group__7_in_rule__BCoolCompositionRule__Group__64424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__BCoolCompositionRule__Group__6__Impl4452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BCoolCompositionRule__Group__7__Impl_in_rule__BCoolCompositionRule__Group__74483 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__BCoolCompositionRule__Group__8_in_rule__BCoolCompositionRule__Group__74486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BCoolCompositionRule__MatchingRuleAssignment_7_in_rule__BCoolCompositionRule__Group__7__Impl4513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BCoolCompositionRule__Group__8__Impl_in_rule__BCoolCompositionRule__Group__84543 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_rule__BCoolCompositionRule__Group__9_in_rule__BCoolCompositionRule__Group__84546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BCoolCompositionRule__CoordinationRuleAssignment_8_in_rule__BCoolCompositionRule__Group__8__Impl4573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BCoolCompositionRule__Group__9__Impl_in_rule__BCoolCompositionRule__Group__94603 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__BCoolCompositionRule__Group__9__Impl4631 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BCoolCompositionRule__Group_4__0__Impl_in_rule__BCoolCompositionRule__Group_4__04682 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__BCoolCompositionRule__Group_4__1_in_rule__BCoolCompositionRule__Group_4__04685 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__BCoolCompositionRule__Group_4__0__Impl4713 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BCoolCompositionRule__Group_4__1__Impl_in_rule__BCoolCompositionRule__Group_4__14744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BCoolCompositionRule__BCoolOperatorArgsAssignment_4_1_in_rule__BCoolCompositionRule__Group_4__1__Impl4771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BCoolOperatorArg__Group__0__Impl_in_rule__BCoolOperatorArg__Group__04805 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_rule__BCoolOperatorArg__Group__1_in_rule__BCoolOperatorArg__Group__04808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BCoolOperatorArg__NameAssignment_0_in_rule__BCoolOperatorArg__Group__0__Impl4835 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BCoolOperatorArg__Group__1__Impl_in_rule__BCoolOperatorArg__Group__14865 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__BCoolOperatorArg__Group__2_in_rule__BCoolOperatorArg__Group__14868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__BCoolOperatorArg__Group__1__Impl4896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BCoolOperatorArg__Group__2__Impl_in_rule__BCoolOperatorArg__Group__24927 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_rule__BCoolOperatorArg__Group__3_in_rule__BCoolOperatorArg__Group__24930 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BCoolOperatorArg__InterfaceAssignment_2_in_rule__BCoolOperatorArg__Group__2__Impl4957 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BCoolOperatorArg__Group__3__Impl_in_rule__BCoolOperatorArg__Group__34987 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__BCoolOperatorArg__Group__4_in_rule__BCoolOperatorArg__Group__34990 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__BCoolOperatorArg__Group__3__Impl5018 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BCoolOperatorArg__Group__4__Impl_in_rule__BCoolOperatorArg__Group__45049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BCoolOperatorArg__DSEAssignment_4_in_rule__BCoolOperatorArg__Group__4__Impl5076 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MatchingRule__Group__0__Impl_in_rule__MatchingRule__Group__05116 = new BitSet(new long[]{0x00060008300001F0L});
    public static final BitSet FOLLOW_rule__MatchingRule__Group__1_in_rule__MatchingRule__Group__05119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__MatchingRule__Group__0__Impl5147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MatchingRule__Group__1__Impl_in_rule__MatchingRule__Group__15178 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__MatchingRule__Group__2_in_rule__MatchingRule__Group__15181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MatchingRule__ConditionAssignment_1_in_rule__MatchingRule__Group__1__Impl5208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MatchingRule__Group__2__Impl_in_rule__MatchingRule__Group__25238 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_rule__MatchingRule__Group__3_in_rule__MatchingRule__Group__25241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__MatchingRule__Group__2__Impl5269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MatchingRule__Group__3__Impl_in_rule__MatchingRule__Group__35300 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_rule__MatchingRule__Group__4_in_rule__MatchingRule__Group__35303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__MatchingRule__Group__3__Impl5331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MatchingRule__Group__4__Impl_in_rule__MatchingRule__Group__45362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MatchingRule__Group_4__0_in_rule__MatchingRule__Group__4__Impl5389 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_rule__MatchingRule__Group_4__0__Impl_in_rule__MatchingRule__Group_4__05430 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__MatchingRule__Group_4__1_in_rule__MatchingRule__Group_4__05433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__MatchingRule__Group_4__0__Impl5461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MatchingRule__Group_4__1__Impl_in_rule__MatchingRule__Group_4__15492 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__MatchingRule__Group_4__2_in_rule__MatchingRule__Group_4__15495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MatchingRule__FilterEventExpressionsAssignment_4_1_in_rule__MatchingRule__Group_4__1__Impl5522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MatchingRule__Group_4__2__Impl_in_rule__MatchingRule__Group_4__25552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__MatchingRule__Group_4__2__Impl5580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EventExpression__Group__0__Impl_in_rule__EventExpression__Group__05617 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__EventExpression__Group__1_in_rule__EventExpression__Group__05620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EventExpression__NameAssignment_0_in_rule__EventExpression__Group__0__Impl5647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EventExpression__Group__1__Impl_in_rule__EventExpression__Group__15677 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__EventExpression__Group__2_in_rule__EventExpression__Group__15680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__EventExpression__Group__1__Impl5708 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EventExpression__Group__2__Impl_in_rule__EventExpression__Group__25739 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_rule__EventExpression__Group__3_in_rule__EventExpression__Group__25742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EventExpression__DeclarationAssignment_2_in_rule__EventExpression__Group__2__Impl5769 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EventExpression__Group__3__Impl_in_rule__EventExpression__Group__35799 = new BitSet(new long[]{0x0000001000000010L});
    public static final BitSet FOLLOW_rule__EventExpression__Group__4_in_rule__EventExpression__Group__35802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__EventExpression__Group__3__Impl5830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EventExpression__Group__4__Impl_in_rule__EventExpression__Group__45861 = new BitSet(new long[]{0x0000001000000010L});
    public static final BitSet FOLLOW_rule__EventExpression__Group__5_in_rule__EventExpression__Group__45864 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EventExpression__Group_4__0_in_rule__EventExpression__Group__4__Impl5891 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EventExpression__Group__5__Impl_in_rule__EventExpression__Group__55922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__EventExpression__Group__5__Impl5950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EventExpression__Group_4__0__Impl_in_rule__EventExpression__Group_4__05993 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_rule__EventExpression__Group_4__1_in_rule__EventExpression__Group_4__05996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EventExpression__ActualParametersAssignment_4_0_in_rule__EventExpression__Group_4__0__Impl6023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EventExpression__Group_4__1__Impl_in_rule__EventExpression__Group_4__16053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EventExpression__Group_4_1__0_in_rule__EventExpression__Group_4__1__Impl6080 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_rule__EventExpression__Group_4_1__0__Impl_in_rule__EventExpression__Group_4_1__06115 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__EventExpression__Group_4_1__1_in_rule__EventExpression__Group_4_1__06118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__EventExpression__Group_4_1__0__Impl6146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EventExpression__Group_4_1__1__Impl_in_rule__EventExpression__Group_4_1__16177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EventExpression__ActualParametersAssignment_4_1_1_in_rule__EventExpression__Group_4_1__1__Impl6204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EventRelation__Group__0__Impl_in_rule__EventRelation__Group__06238 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__EventRelation__Group__1_in_rule__EventRelation__Group__06241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EventRelation__Group__1__Impl_in_rule__EventRelation__Group__16299 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_rule__EventRelation__Group__2_in_rule__EventRelation__Group__16302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EventRelation__DeclarationAssignment_1_in_rule__EventRelation__Group__1__Impl6329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EventRelation__Group__2__Impl_in_rule__EventRelation__Group__26359 = new BitSet(new long[]{0x0000001000000010L});
    public static final BitSet FOLLOW_rule__EventRelation__Group__3_in_rule__EventRelation__Group__26362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__EventRelation__Group__2__Impl6390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EventRelation__Group__3__Impl_in_rule__EventRelation__Group__36421 = new BitSet(new long[]{0x0000001000000010L});
    public static final BitSet FOLLOW_rule__EventRelation__Group__4_in_rule__EventRelation__Group__36424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EventRelation__Group_3__0_in_rule__EventRelation__Group__3__Impl6451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EventRelation__Group__4__Impl_in_rule__EventRelation__Group__46482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__EventRelation__Group__4__Impl6510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EventRelation__Group_3__0__Impl_in_rule__EventRelation__Group_3__06551 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_rule__EventRelation__Group_3__1_in_rule__EventRelation__Group_3__06554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EventRelation__ActualParametersAssignment_3_0_in_rule__EventRelation__Group_3__0__Impl6581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EventRelation__Group_3__1__Impl_in_rule__EventRelation__Group_3__16611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EventRelation__Group_3_1__0_in_rule__EventRelation__Group_3__1__Impl6638 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_rule__EventRelation__Group_3_1__0__Impl_in_rule__EventRelation__Group_3_1__06673 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__EventRelation__Group_3_1__1_in_rule__EventRelation__Group_3_1__06676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__EventRelation__Group_3_1__0__Impl6704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EventRelation__Group_3_1__1__Impl_in_rule__EventRelation__Group_3_1__16735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EventRelation__ActualParametersAssignment_3_1_1_in_rule__EventRelation__Group_3_1__1__Impl6762 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImportLibRule__Group__0__Impl_in_rule__ImportLibRule__Group__06796 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__ImportLibRule__Group__1_in_rule__ImportLibRule__Group__06799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_rule__ImportLibRule__Group__0__Impl6827 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImportLibRule__Group__1__Impl_in_rule__ImportLibRule__Group__16858 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImportLibRule__ImportURIAssignment_1_in_rule__ImportLibRule__Group__1__Impl6885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImportInterfaceRule__Group__0__Impl_in_rule__ImportInterfaceRule__Group__06919 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__ImportInterfaceRule__Group__1_in_rule__ImportInterfaceRule__Group__06922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_rule__ImportInterfaceRule__Group__0__Impl6950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImportInterfaceRule__Group__1__Impl_in_rule__ImportInterfaceRule__Group__16981 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_rule__ImportInterfaceRule__Group__2_in_rule__ImportInterfaceRule__Group__16984 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImportInterfaceRule__ImportURIAssignment_1_in_rule__ImportInterfaceRule__Group__1__Impl7011 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImportInterfaceRule__Group__2__Impl_in_rule__ImportInterfaceRule__Group__27041 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ImportInterfaceRule__Group__3_in_rule__ImportInterfaceRule__Group__27044 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_rule__ImportInterfaceRule__Group__2__Impl7072 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImportInterfaceRule__Group__3__Impl_in_rule__ImportInterfaceRule__Group__37103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImportInterfaceRule__NameAssignment_3_in_rule__ImportInterfaceRule__Group__3__Impl7130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GImportStatement__Group__0__Impl_in_rule__GImportStatement__Group__07171 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__GImportStatement__Group__1_in_rule__GImportStatement__Group__07174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_rule__GImportStatement__Group__0__Impl7202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GImportStatement__Group__1__Impl_in_rule__GImportStatement__Group__17233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GImportStatement__ImportURIAssignment_1_in_rule__GImportStatement__Group__1__Impl7260 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GOrExpression__Group__0__Impl_in_rule__GOrExpression__Group__07294 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__GOrExpression__Group__1_in_rule__GOrExpression__Group__07297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGXorExpression_in_rule__GOrExpression__Group__0__Impl7324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GOrExpression__Group__1__Impl_in_rule__GOrExpression__Group__17353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GOrExpression__Group_1__0_in_rule__GOrExpression__Group__1__Impl7380 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_rule__GOrExpression__Group_1__0__Impl_in_rule__GOrExpression__Group_1__07415 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__GOrExpression__Group_1__1_in_rule__GOrExpression__Group_1__07418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GOrExpression__Group_1__1__Impl_in_rule__GOrExpression__Group_1__17476 = new BitSet(new long[]{0x00060008300001F0L});
    public static final BitSet FOLLOW_rule__GOrExpression__Group_1__2_in_rule__GOrExpression__Group_1__17479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GOrExpression__OperatorAssignment_1_1_in_rule__GOrExpression__Group_1__1__Impl7506 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GOrExpression__Group_1__2__Impl_in_rule__GOrExpression__Group_1__27536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GOrExpression__RightOperandAssignment_1_2_in_rule__GOrExpression__Group_1__2__Impl7563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GXorExpression__Group__0__Impl_in_rule__GXorExpression__Group__07599 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__GXorExpression__Group__1_in_rule__GXorExpression__Group__07602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGAndExpression_in_rule__GXorExpression__Group__0__Impl7629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GXorExpression__Group__1__Impl_in_rule__GXorExpression__Group__17658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GXorExpression__Group_1__0_in_rule__GXorExpression__Group__1__Impl7685 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_rule__GXorExpression__Group_1__0__Impl_in_rule__GXorExpression__Group_1__07720 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__GXorExpression__Group_1__1_in_rule__GXorExpression__Group_1__07723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GXorExpression__Group_1__1__Impl_in_rule__GXorExpression__Group_1__17781 = new BitSet(new long[]{0x00060008300001F0L});
    public static final BitSet FOLLOW_rule__GXorExpression__Group_1__2_in_rule__GXorExpression__Group_1__17784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GXorExpression__OperatorAssignment_1_1_in_rule__GXorExpression__Group_1__1__Impl7811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GXorExpression__Group_1__2__Impl_in_rule__GXorExpression__Group_1__27841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GXorExpression__RightOperandAssignment_1_2_in_rule__GXorExpression__Group_1__2__Impl7868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GAndExpression__Group__0__Impl_in_rule__GAndExpression__Group__07904 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__GAndExpression__Group__1_in_rule__GAndExpression__Group__07907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGEqualityExpression_in_rule__GAndExpression__Group__0__Impl7934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GAndExpression__Group__1__Impl_in_rule__GAndExpression__Group__17963 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GAndExpression__Group_1__0_in_rule__GAndExpression__Group__1__Impl7990 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_rule__GAndExpression__Group_1__0__Impl_in_rule__GAndExpression__Group_1__08025 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__GAndExpression__Group_1__1_in_rule__GAndExpression__Group_1__08028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GAndExpression__Group_1__1__Impl_in_rule__GAndExpression__Group_1__18086 = new BitSet(new long[]{0x00060008300001F0L});
    public static final BitSet FOLLOW_rule__GAndExpression__Group_1__2_in_rule__GAndExpression__Group_1__18089 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GAndExpression__OperatorAssignment_1_1_in_rule__GAndExpression__Group_1__1__Impl8116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GAndExpression__Group_1__2__Impl_in_rule__GAndExpression__Group_1__28146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GAndExpression__RightOperandAssignment_1_2_in_rule__GAndExpression__Group_1__2__Impl8173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GEqualityExpression__Group__0__Impl_in_rule__GEqualityExpression__Group__08209 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_rule__GEqualityExpression__Group__1_in_rule__GEqualityExpression__Group__08212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGRelationExpression_in_rule__GEqualityExpression__Group__0__Impl8239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GEqualityExpression__Group__1__Impl_in_rule__GEqualityExpression__Group__18268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GEqualityExpression__Group_1__0_in_rule__GEqualityExpression__Group__1__Impl8295 = new BitSet(new long[]{0x00000000000C0002L});
    public static final BitSet FOLLOW_rule__GEqualityExpression__Group_1__0__Impl_in_rule__GEqualityExpression__Group_1__08330 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_rule__GEqualityExpression__Group_1__1_in_rule__GEqualityExpression__Group_1__08333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GEqualityExpression__Group_1__1__Impl_in_rule__GEqualityExpression__Group_1__18391 = new BitSet(new long[]{0x00060008300001F0L});
    public static final BitSet FOLLOW_rule__GEqualityExpression__Group_1__2_in_rule__GEqualityExpression__Group_1__18394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GEqualityExpression__OperatorAssignment_1_1_in_rule__GEqualityExpression__Group_1__1__Impl8421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GEqualityExpression__Group_1__2__Impl_in_rule__GEqualityExpression__Group_1__28451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GEqualityExpression__RightOperandAssignment_1_2_in_rule__GEqualityExpression__Group_1__2__Impl8478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GRelationExpression__Group__0__Impl_in_rule__GRelationExpression__Group__08514 = new BitSet(new long[]{0x0000000000F00000L});
    public static final BitSet FOLLOW_rule__GRelationExpression__Group__1_in_rule__GRelationExpression__Group__08517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGAdditionExpression_in_rule__GRelationExpression__Group__0__Impl8544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GRelationExpression__Group__1__Impl_in_rule__GRelationExpression__Group__18573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GRelationExpression__Group_1__0_in_rule__GRelationExpression__Group__1__Impl8600 = new BitSet(new long[]{0x0000000000F00002L});
    public static final BitSet FOLLOW_rule__GRelationExpression__Group_1__0__Impl_in_rule__GRelationExpression__Group_1__08635 = new BitSet(new long[]{0x0000000000F00000L});
    public static final BitSet FOLLOW_rule__GRelationExpression__Group_1__1_in_rule__GRelationExpression__Group_1__08638 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GRelationExpression__Group_1__1__Impl_in_rule__GRelationExpression__Group_1__18696 = new BitSet(new long[]{0x00060008300001F0L});
    public static final BitSet FOLLOW_rule__GRelationExpression__Group_1__2_in_rule__GRelationExpression__Group_1__18699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GRelationExpression__OperatorAssignment_1_1_in_rule__GRelationExpression__Group_1__1__Impl8726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GRelationExpression__Group_1__2__Impl_in_rule__GRelationExpression__Group_1__28756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GRelationExpression__RightOperandAssignment_1_2_in_rule__GRelationExpression__Group_1__2__Impl8783 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GAdditionExpression__Group__0__Impl_in_rule__GAdditionExpression__Group__08819 = new BitSet(new long[]{0x0000000003000000L});
    public static final BitSet FOLLOW_rule__GAdditionExpression__Group__1_in_rule__GAdditionExpression__Group__08822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGMultiplicationExpression_in_rule__GAdditionExpression__Group__0__Impl8849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GAdditionExpression__Group__1__Impl_in_rule__GAdditionExpression__Group__18878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GAdditionExpression__Group_1__0_in_rule__GAdditionExpression__Group__1__Impl8905 = new BitSet(new long[]{0x0000000003000002L});
    public static final BitSet FOLLOW_rule__GAdditionExpression__Group_1__0__Impl_in_rule__GAdditionExpression__Group_1__08940 = new BitSet(new long[]{0x0000000003000000L});
    public static final BitSet FOLLOW_rule__GAdditionExpression__Group_1__1_in_rule__GAdditionExpression__Group_1__08943 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GAdditionExpression__Group_1__1__Impl_in_rule__GAdditionExpression__Group_1__19001 = new BitSet(new long[]{0x00060008300001F0L});
    public static final BitSet FOLLOW_rule__GAdditionExpression__Group_1__2_in_rule__GAdditionExpression__Group_1__19004 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GAdditionExpression__OperatorAssignment_1_1_in_rule__GAdditionExpression__Group_1__1__Impl9031 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GAdditionExpression__Group_1__2__Impl_in_rule__GAdditionExpression__Group_1__29061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GAdditionExpression__RightOperandAssignment_1_2_in_rule__GAdditionExpression__Group_1__2__Impl9088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GMultiplicationExpression__Group__0__Impl_in_rule__GMultiplicationExpression__Group__09124 = new BitSet(new long[]{0x000000000C000000L});
    public static final BitSet FOLLOW_rule__GMultiplicationExpression__Group__1_in_rule__GMultiplicationExpression__Group__09127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGNegationExpression_in_rule__GMultiplicationExpression__Group__0__Impl9154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GMultiplicationExpression__Group__1__Impl_in_rule__GMultiplicationExpression__Group__19183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GMultiplicationExpression__Group_1__0_in_rule__GMultiplicationExpression__Group__1__Impl9210 = new BitSet(new long[]{0x000000000C000002L});
    public static final BitSet FOLLOW_rule__GMultiplicationExpression__Group_1__0__Impl_in_rule__GMultiplicationExpression__Group_1__09245 = new BitSet(new long[]{0x000000000C000000L});
    public static final BitSet FOLLOW_rule__GMultiplicationExpression__Group_1__1_in_rule__GMultiplicationExpression__Group_1__09248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GMultiplicationExpression__Group_1__1__Impl_in_rule__GMultiplicationExpression__Group_1__19306 = new BitSet(new long[]{0x00060008300001F0L});
    public static final BitSet FOLLOW_rule__GMultiplicationExpression__Group_1__2_in_rule__GMultiplicationExpression__Group_1__19309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GMultiplicationExpression__OperatorAssignment_1_1_in_rule__GMultiplicationExpression__Group_1__1__Impl9336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GMultiplicationExpression__Group_1__2__Impl_in_rule__GMultiplicationExpression__Group_1__29366 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GMultiplicationExpression__RightOperandAssignment_1_2_in_rule__GMultiplicationExpression__Group_1__2__Impl9393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GNegationExpression__Group_1__0__Impl_in_rule__GNegationExpression__Group_1__09429 = new BitSet(new long[]{0x00060008300001F0L});
    public static final BitSet FOLLOW_rule__GNegationExpression__Group_1__1_in_rule__GNegationExpression__Group_1__09432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GNegationExpression__Group_1__1__Impl_in_rule__GNegationExpression__Group_1__19490 = new BitSet(new long[]{0x00060008000001F0L});
    public static final BitSet FOLLOW_rule__GNegationExpression__Group_1__2_in_rule__GNegationExpression__Group_1__19493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GNegationExpression__OperatorAssignment_1_1_in_rule__GNegationExpression__Group_1__1__Impl9520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GNegationExpression__Group_1__2__Impl_in_rule__GNegationExpression__Group_1__29550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GNegationExpression__OperandAssignment_1_2_in_rule__GNegationExpression__Group_1__2__Impl9577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GNavigationExpression__Group__0__Impl_in_rule__GNavigationExpression__Group__09613 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_rule__GNavigationExpression__Group__1_in_rule__GNavigationExpression__Group__09616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGReferenceExpression_in_rule__GNavigationExpression__Group__0__Impl9643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GNavigationExpression__Group__1__Impl_in_rule__GNavigationExpression__Group__19672 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GNavigationExpression__Group_1__0_in_rule__GNavigationExpression__Group__1__Impl9699 = new BitSet(new long[]{0x0000000000030002L});
    public static final BitSet FOLLOW_rule__GNavigationExpression__Group_1__0__Impl_in_rule__GNavigationExpression__Group_1__09734 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_rule__GNavigationExpression__Group_1__1_in_rule__GNavigationExpression__Group_1__09737 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GNavigationExpression__Group_1__1__Impl_in_rule__GNavigationExpression__Group_1__19795 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__GNavigationExpression__Group_1__2_in_rule__GNavigationExpression__Group_1__19798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNavigationOperator_in_rule__GNavigationExpression__Group_1__1__Impl9825 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GNavigationExpression__Group_1__2__Impl_in_rule__GNavigationExpression__Group_1__29854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GNavigationExpression__ReferencedEObjectAssignment_1_2_in_rule__GNavigationExpression__Group_1__2__Impl9881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GReferenceExpression__Group_1__0__Impl_in_rule__GReferenceExpression__Group_1__09917 = new BitSet(new long[]{0x00060008000001F0L});
    public static final BitSet FOLLOW_rule__GReferenceExpression__Group_1__1_in_rule__GReferenceExpression__Group_1__09920 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GReferenceExpression__Group_1__1__Impl_in_rule__GReferenceExpression__Group_1__19978 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GReferenceExpression__ReferencedEObjectAssignment_1_1_in_rule__GReferenceExpression__Group_1__1__Impl10005 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GStringExpression__Group__0__Impl_in_rule__GStringExpression__Group__010039 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__GStringExpression__Group__1_in_rule__GStringExpression__Group__010042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GStringExpression__Group__1__Impl_in_rule__GStringExpression__Group__110100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GStringExpression__ValueAssignment_1_in_rule__GStringExpression__Group__1__Impl10127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GBooleanExpression__Group__0__Impl_in_rule__GBooleanExpression__Group__010161 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__GBooleanExpression__Group__1_in_rule__GBooleanExpression__Group__010164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GBooleanExpression__Group__1__Impl_in_rule__GBooleanExpression__Group__110222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GBooleanExpression__ValueAssignment_1_in_rule__GBooleanExpression__Group__1__Impl10249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GIntegerExpression__Group__0__Impl_in_rule__GIntegerExpression__Group__010283 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__GIntegerExpression__Group__1_in_rule__GIntegerExpression__Group__010286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GIntegerExpression__Group__1__Impl_in_rule__GIntegerExpression__Group__110344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GIntegerExpression__ValueAssignment_1_in_rule__GIntegerExpression__Group__1__Impl10371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GDoubleExpression__Group__0__Impl_in_rule__GDoubleExpression__Group__010405 = new BitSet(new long[]{0x0000000000000180L});
    public static final BitSet FOLLOW_rule__GDoubleExpression__Group__1_in_rule__GDoubleExpression__Group__010408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GDoubleExpression__Group__1__Impl_in_rule__GDoubleExpression__Group__110466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GDoubleExpression__ValueAssignment_1_in_rule__GDoubleExpression__Group__1__Impl10493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GEnumLiteralExpression__Group__0__Impl_in_rule__GEnumLiteralExpression__Group__010527 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_rule__GEnumLiteralExpression__Group__1_in_rule__GEnumLiteralExpression__Group__010530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GEnumLiteralExpression__Group__1__Impl_in_rule__GEnumLiteralExpression__Group__110588 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__GEnumLiteralExpression__Group__2_in_rule__GEnumLiteralExpression__Group__110591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_rule__GEnumLiteralExpression__Group__1__Impl10619 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GEnumLiteralExpression__Group__2__Impl_in_rule__GEnumLiteralExpression__Group__210650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GEnumLiteralExpression__ValueAssignment_2_in_rule__GEnumLiteralExpression__Group__2__Impl10677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GIfExpression__Group__0__Impl_in_rule__GIfExpression__Group__010713 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_rule__GIfExpression__Group__1_in_rule__GIfExpression__Group__010716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GIfExpression__Group__1__Impl_in_rule__GIfExpression__Group__110774 = new BitSet(new long[]{0x00060008300001F0L});
    public static final BitSet FOLLOW_rule__GIfExpression__Group__2_in_rule__GIfExpression__Group__110777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_rule__GIfExpression__Group__1__Impl10805 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GIfExpression__Group__2__Impl_in_rule__GIfExpression__Group__210836 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_rule__GIfExpression__Group__3_in_rule__GIfExpression__Group__210839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GIfExpression__ConditionAssignment_2_in_rule__GIfExpression__Group__2__Impl10866 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GIfExpression__Group__3__Impl_in_rule__GIfExpression__Group__310896 = new BitSet(new long[]{0x00060008300001F0L});
    public static final BitSet FOLLOW_rule__GIfExpression__Group__4_in_rule__GIfExpression__Group__310899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_rule__GIfExpression__Group__3__Impl10927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GIfExpression__Group__4__Impl_in_rule__GIfExpression__Group__410958 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_rule__GIfExpression__Group__5_in_rule__GIfExpression__Group__410961 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GIfExpression__ThenExpressionAssignment_4_in_rule__GIfExpression__Group__4__Impl10988 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GIfExpression__Group__5__Impl_in_rule__GIfExpression__Group__511018 = new BitSet(new long[]{0x00060008300001F0L});
    public static final BitSet FOLLOW_rule__GIfExpression__Group__6_in_rule__GIfExpression__Group__511021 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_rule__GIfExpression__Group__5__Impl11049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GIfExpression__Group__6__Impl_in_rule__GIfExpression__Group__611080 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_rule__GIfExpression__Group__7_in_rule__GIfExpression__Group__611083 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GIfExpression__ElseExpressionAssignment_6_in_rule__GIfExpression__Group__6__Impl11110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GIfExpression__Group__7__Impl_in_rule__GIfExpression__Group__711140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_rule__GIfExpression__Group__7__Impl11168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GBraceExpression__Group__0__Impl_in_rule__GBraceExpression__Group__011215 = new BitSet(new long[]{0x00060008000001E0L});
    public static final BitSet FOLLOW_rule__GBraceExpression__Group__1_in_rule__GBraceExpression__Group__011218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GBraceExpression__Group__1__Impl_in_rule__GBraceExpression__Group__111276 = new BitSet(new long[]{0x00060008300001F0L});
    public static final BitSet FOLLOW_rule__GBraceExpression__Group__2_in_rule__GBraceExpression__Group__111279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__GBraceExpression__Group__1__Impl11307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GBraceExpression__Group__2__Impl_in_rule__GBraceExpression__Group__211338 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_rule__GBraceExpression__Group__3_in_rule__GBraceExpression__Group__211341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GBraceExpression__InnerExpressionAssignment_2_in_rule__GBraceExpression__Group__2__Impl11368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GBraceExpression__Group__3__Impl_in_rule__GBraceExpression__Group__311398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__GBraceExpression__Group__3__Impl11426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__011465 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__011468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__QualifiedName__Group__0__Impl11495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__111524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0_in_rule__QualifiedName__Group__1__Impl11551 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0__Impl_in_rule__QualifiedName__Group_1__011586 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__1_in_rule__QualifiedName__Group_1__011589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__QualifiedName__Group_1__0__Impl11618 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__1__Impl_in_rule__QualifiedName__Group_1__111650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__QualifiedName__Group_1__1__Impl11677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__BCoolSpec__NameAssignment_011715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImportLibRule_in_rule__BCoolSpec__ImportsLibAssignment_111746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImportInterfaceRule_in_rule__BCoolSpec__ImportsBehavioralInterfaceAssignment_211777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBCoolOperatorSpec_in_rule__BCoolSpec__BcoolOperatorsAssignment_311808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__BCoolOperatorSpec__NameAssignment_111839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleglobalEventExpressionRule_in_rule__BCoolOperatorSpec__GlobalEventExpressionsAssignment_211870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleglobalDSEsRule_in_rule__BCoolOperatorSpec__GlobalDSEsAssignment_311901 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBCoolCompositionRule_in_rule__BCoolOperatorSpec__BcoolCompositionRulesAssignment_411932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__GlobalDSEsRule__NameAssignment_111963 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__BCoolCompositionRule__NameAssignment_111994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBCoolOperatorArg_in_rule__BCoolCompositionRule__BCoolOperatorArgsAssignment_312025 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBCoolOperatorArg_in_rule__BCoolCompositionRule__BCoolOperatorArgsAssignment_4_112056 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMatchingRule_in_rule__BCoolCompositionRule__MatchingRuleAssignment_712087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCoordinationRule_in_rule__BCoolCompositionRule__CoordinationRuleAssignment_812118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__BCoolOperatorArg__NameAssignment_012149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__BCoolOperatorArg__InterfaceAssignment_212184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__BCoolOperatorArg__DSEAssignment_412223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGExpression_in_rule__MatchingRule__ConditionAssignment_112258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEventExpression_in_rule__MatchingRule__FilterEventExpressionsAssignment_4_112289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__EventExpression__NameAssignment_012320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__EventExpression__DeclarationAssignment_212355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__EventExpression__ActualParametersAssignment_4_012394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__EventExpression__ActualParametersAssignment_4_1_112433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEventRelation_in_rule__CoordinationRule__EventRelationsAssignment12468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__EventRelation__DeclarationAssignment_112503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__EventRelation__ActualParametersAssignment_3_012542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__EventRelation__ActualParametersAssignment_3_1_112581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__ImportLibRule__ImportURIAssignment_112616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__ImportInterfaceRule__ImportURIAssignment_112647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ImportInterfaceRule__NameAssignment_312678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__GImportStatement__ImportURIAssignment_112712 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGOrOperator_in_rule__GOrExpression__OperatorAssignment_1_112743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGXorExpression_in_rule__GOrExpression__RightOperandAssignment_1_212774 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGXorOperator_in_rule__GXorExpression__OperatorAssignment_1_112805 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGAndExpression_in_rule__GXorExpression__RightOperandAssignment_1_212836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGAndOperator_in_rule__GAndExpression__OperatorAssignment_1_112867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGEqualityExpression_in_rule__GAndExpression__RightOperandAssignment_1_212898 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGEqualityOperator_in_rule__GEqualityExpression__OperatorAssignment_1_112929 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGRelationExpression_in_rule__GEqualityExpression__RightOperandAssignment_1_212960 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGRelationOperator_in_rule__GRelationExpression__OperatorAssignment_1_112991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGAdditionExpression_in_rule__GRelationExpression__RightOperandAssignment_1_213022 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGAdditionOperator_in_rule__GAdditionExpression__OperatorAssignment_1_113053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGMultiplicationExpression_in_rule__GAdditionExpression__RightOperandAssignment_1_213084 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGMultiplicationOperator_in_rule__GMultiplicationExpression__OperatorAssignment_1_113115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGNegationExpression_in_rule__GMultiplicationExpression__RightOperandAssignment_1_213146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGNegationOperator_in_rule__GNegationExpression__OperatorAssignment_1_113177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGNavigationExpression_in_rule__GNegationExpression__OperandAssignment_1_213208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__GNavigationExpression__ReferencedEObjectAssignment_1_213243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__GReferenceExpression__ReferencedEObjectAssignment_1_113282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__GStringExpression__ValueAssignment_113317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_BOOLEAN_in_rule__GBooleanExpression__ValueAssignment_113348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__GIntegerExpression__ValueAssignment_113379 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DOUBLE_in_rule__GDoubleExpression__ValueAssignment_113410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__GEnumLiteralExpression__ValueAssignment_213445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGExpression_in_rule__GIfExpression__ConditionAssignment_213480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGExpression_in_rule__GIfExpression__ThenExpressionAssignment_413511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGExpression_in_rule__GIfExpression__ElseExpressionAssignment_613542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGExpression_in_rule__GBraceExpression__InnerExpressionAssignment_213573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0_in_synpred38_InternalBCOoL11551 = new BitSet(new long[]{0x0000000000000002L});

}