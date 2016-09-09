package org.gemoc.bcool.ui.contentassist.antlr.internal; 

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
import org.gemoc.bcool.services.BCOoLLibGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalBCOoLLibParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'BCoolLibrary'", "'{'", "'}'", "'expressionDefinitions'", "','", "'relationDefinitions'", "'relationDeclarations'", "'expressionDeclarations'", "'ExpressionDefinition'", "'definition'", "'RelationDefinition'", "'RelationDeclaration'", "'formalParameters'", "'ExpressionDeclaration'"
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
    public String getGrammarFileName() { return "../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g"; }


     
     	private BCOoLLibGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(BCOoLLibGrammarAccess grammarAccess) {
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




    // $ANTLR start "entryRuleBCoolLibrary"
    // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:60:1: entryRuleBCoolLibrary : ruleBCoolLibrary EOF ;
    public final void entryRuleBCoolLibrary() throws RecognitionException {
        try {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:61:1: ( ruleBCoolLibrary EOF )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:62:1: ruleBCoolLibrary EOF
            {
             before(grammarAccess.getBCoolLibraryRule()); 
            pushFollow(FOLLOW_ruleBCoolLibrary_in_entryRuleBCoolLibrary61);
            ruleBCoolLibrary();

            state._fsp--;

             after(grammarAccess.getBCoolLibraryRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBCoolLibrary68); 

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
    // $ANTLR end "entryRuleBCoolLibrary"


    // $ANTLR start "ruleBCoolLibrary"
    // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:69:1: ruleBCoolLibrary : ( ( rule__BCoolLibrary__Group__0 ) ) ;
    public final void ruleBCoolLibrary() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:73:2: ( ( ( rule__BCoolLibrary__Group__0 ) ) )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:74:1: ( ( rule__BCoolLibrary__Group__0 ) )
            {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:74:1: ( ( rule__BCoolLibrary__Group__0 ) )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:75:1: ( rule__BCoolLibrary__Group__0 )
            {
             before(grammarAccess.getBCoolLibraryAccess().getGroup()); 
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:76:1: ( rule__BCoolLibrary__Group__0 )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:76:2: rule__BCoolLibrary__Group__0
            {
            pushFollow(FOLLOW_rule__BCoolLibrary__Group__0_in_ruleBCoolLibrary94);
            rule__BCoolLibrary__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBCoolLibraryAccess().getGroup()); 

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
    // $ANTLR end "ruleBCoolLibrary"


    // $ANTLR start "entryRuleExpressionDefinition"
    // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:88:1: entryRuleExpressionDefinition : ruleExpressionDefinition EOF ;
    public final void entryRuleExpressionDefinition() throws RecognitionException {
        try {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:89:1: ( ruleExpressionDefinition EOF )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:90:1: ruleExpressionDefinition EOF
            {
             before(grammarAccess.getExpressionDefinitionRule()); 
            pushFollow(FOLLOW_ruleExpressionDefinition_in_entryRuleExpressionDefinition121);
            ruleExpressionDefinition();

            state._fsp--;

             after(grammarAccess.getExpressionDefinitionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpressionDefinition128); 

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
    // $ANTLR end "entryRuleExpressionDefinition"


    // $ANTLR start "ruleExpressionDefinition"
    // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:97:1: ruleExpressionDefinition : ( ( rule__ExpressionDefinition__Group__0 ) ) ;
    public final void ruleExpressionDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:101:2: ( ( ( rule__ExpressionDefinition__Group__0 ) ) )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:102:1: ( ( rule__ExpressionDefinition__Group__0 ) )
            {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:102:1: ( ( rule__ExpressionDefinition__Group__0 ) )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:103:1: ( rule__ExpressionDefinition__Group__0 )
            {
             before(grammarAccess.getExpressionDefinitionAccess().getGroup()); 
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:104:1: ( rule__ExpressionDefinition__Group__0 )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:104:2: rule__ExpressionDefinition__Group__0
            {
            pushFollow(FOLLOW_rule__ExpressionDefinition__Group__0_in_ruleExpressionDefinition154);
            rule__ExpressionDefinition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getExpressionDefinitionAccess().getGroup()); 

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
    // $ANTLR end "ruleExpressionDefinition"


    // $ANTLR start "entryRuleRelationDefinition"
    // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:116:1: entryRuleRelationDefinition : ruleRelationDefinition EOF ;
    public final void entryRuleRelationDefinition() throws RecognitionException {
        try {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:117:1: ( ruleRelationDefinition EOF )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:118:1: ruleRelationDefinition EOF
            {
             before(grammarAccess.getRelationDefinitionRule()); 
            pushFollow(FOLLOW_ruleRelationDefinition_in_entryRuleRelationDefinition181);
            ruleRelationDefinition();

            state._fsp--;

             after(grammarAccess.getRelationDefinitionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRelationDefinition188); 

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
    // $ANTLR end "entryRuleRelationDefinition"


    // $ANTLR start "ruleRelationDefinition"
    // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:125:1: ruleRelationDefinition : ( ( rule__RelationDefinition__Group__0 ) ) ;
    public final void ruleRelationDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:129:2: ( ( ( rule__RelationDefinition__Group__0 ) ) )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:130:1: ( ( rule__RelationDefinition__Group__0 ) )
            {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:130:1: ( ( rule__RelationDefinition__Group__0 ) )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:131:1: ( rule__RelationDefinition__Group__0 )
            {
             before(grammarAccess.getRelationDefinitionAccess().getGroup()); 
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:132:1: ( rule__RelationDefinition__Group__0 )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:132:2: rule__RelationDefinition__Group__0
            {
            pushFollow(FOLLOW_rule__RelationDefinition__Group__0_in_ruleRelationDefinition214);
            rule__RelationDefinition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRelationDefinitionAccess().getGroup()); 

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
    // $ANTLR end "ruleRelationDefinition"


    // $ANTLR start "entryRuleRelationDeclaration"
    // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:144:1: entryRuleRelationDeclaration : ruleRelationDeclaration EOF ;
    public final void entryRuleRelationDeclaration() throws RecognitionException {
        try {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:145:1: ( ruleRelationDeclaration EOF )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:146:1: ruleRelationDeclaration EOF
            {
             before(grammarAccess.getRelationDeclarationRule()); 
            pushFollow(FOLLOW_ruleRelationDeclaration_in_entryRuleRelationDeclaration241);
            ruleRelationDeclaration();

            state._fsp--;

             after(grammarAccess.getRelationDeclarationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRelationDeclaration248); 

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
    // $ANTLR end "entryRuleRelationDeclaration"


    // $ANTLR start "ruleRelationDeclaration"
    // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:153:1: ruleRelationDeclaration : ( ( rule__RelationDeclaration__Group__0 ) ) ;
    public final void ruleRelationDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:157:2: ( ( ( rule__RelationDeclaration__Group__0 ) ) )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:158:1: ( ( rule__RelationDeclaration__Group__0 ) )
            {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:158:1: ( ( rule__RelationDeclaration__Group__0 ) )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:159:1: ( rule__RelationDeclaration__Group__0 )
            {
             before(grammarAccess.getRelationDeclarationAccess().getGroup()); 
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:160:1: ( rule__RelationDeclaration__Group__0 )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:160:2: rule__RelationDeclaration__Group__0
            {
            pushFollow(FOLLOW_rule__RelationDeclaration__Group__0_in_ruleRelationDeclaration274);
            rule__RelationDeclaration__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRelationDeclarationAccess().getGroup()); 

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
    // $ANTLR end "ruleRelationDeclaration"


    // $ANTLR start "entryRuleExpressionDeclaration"
    // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:172:1: entryRuleExpressionDeclaration : ruleExpressionDeclaration EOF ;
    public final void entryRuleExpressionDeclaration() throws RecognitionException {
        try {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:173:1: ( ruleExpressionDeclaration EOF )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:174:1: ruleExpressionDeclaration EOF
            {
             before(grammarAccess.getExpressionDeclarationRule()); 
            pushFollow(FOLLOW_ruleExpressionDeclaration_in_entryRuleExpressionDeclaration301);
            ruleExpressionDeclaration();

            state._fsp--;

             after(grammarAccess.getExpressionDeclarationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpressionDeclaration308); 

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
    // $ANTLR end "entryRuleExpressionDeclaration"


    // $ANTLR start "ruleExpressionDeclaration"
    // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:181:1: ruleExpressionDeclaration : ( ( rule__ExpressionDeclaration__Group__0 ) ) ;
    public final void ruleExpressionDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:185:2: ( ( ( rule__ExpressionDeclaration__Group__0 ) ) )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:186:1: ( ( rule__ExpressionDeclaration__Group__0 ) )
            {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:186:1: ( ( rule__ExpressionDeclaration__Group__0 ) )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:187:1: ( rule__ExpressionDeclaration__Group__0 )
            {
             before(grammarAccess.getExpressionDeclarationAccess().getGroup()); 
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:188:1: ( rule__ExpressionDeclaration__Group__0 )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:188:2: rule__ExpressionDeclaration__Group__0
            {
            pushFollow(FOLLOW_rule__ExpressionDeclaration__Group__0_in_ruleExpressionDeclaration334);
            rule__ExpressionDeclaration__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getExpressionDeclarationAccess().getGroup()); 

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
    // $ANTLR end "ruleExpressionDeclaration"


    // $ANTLR start "rule__BCoolLibrary__Group__0"
    // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:202:1: rule__BCoolLibrary__Group__0 : rule__BCoolLibrary__Group__0__Impl rule__BCoolLibrary__Group__1 ;
    public final void rule__BCoolLibrary__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:206:1: ( rule__BCoolLibrary__Group__0__Impl rule__BCoolLibrary__Group__1 )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:207:2: rule__BCoolLibrary__Group__0__Impl rule__BCoolLibrary__Group__1
            {
            pushFollow(FOLLOW_rule__BCoolLibrary__Group__0__Impl_in_rule__BCoolLibrary__Group__0368);
            rule__BCoolLibrary__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BCoolLibrary__Group__1_in_rule__BCoolLibrary__Group__0371);
            rule__BCoolLibrary__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BCoolLibrary__Group__0"


    // $ANTLR start "rule__BCoolLibrary__Group__0__Impl"
    // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:214:1: rule__BCoolLibrary__Group__0__Impl : ( () ) ;
    public final void rule__BCoolLibrary__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:218:1: ( ( () ) )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:219:1: ( () )
            {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:219:1: ( () )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:220:1: ()
            {
             before(grammarAccess.getBCoolLibraryAccess().getBCoolLibraryAction_0()); 
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:221:1: ()
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:223:1: 
            {
            }

             after(grammarAccess.getBCoolLibraryAccess().getBCoolLibraryAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BCoolLibrary__Group__0__Impl"


    // $ANTLR start "rule__BCoolLibrary__Group__1"
    // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:233:1: rule__BCoolLibrary__Group__1 : rule__BCoolLibrary__Group__1__Impl rule__BCoolLibrary__Group__2 ;
    public final void rule__BCoolLibrary__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:237:1: ( rule__BCoolLibrary__Group__1__Impl rule__BCoolLibrary__Group__2 )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:238:2: rule__BCoolLibrary__Group__1__Impl rule__BCoolLibrary__Group__2
            {
            pushFollow(FOLLOW_rule__BCoolLibrary__Group__1__Impl_in_rule__BCoolLibrary__Group__1429);
            rule__BCoolLibrary__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BCoolLibrary__Group__2_in_rule__BCoolLibrary__Group__1432);
            rule__BCoolLibrary__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BCoolLibrary__Group__1"


    // $ANTLR start "rule__BCoolLibrary__Group__1__Impl"
    // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:245:1: rule__BCoolLibrary__Group__1__Impl : ( 'BCoolLibrary' ) ;
    public final void rule__BCoolLibrary__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:249:1: ( ( 'BCoolLibrary' ) )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:250:1: ( 'BCoolLibrary' )
            {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:250:1: ( 'BCoolLibrary' )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:251:1: 'BCoolLibrary'
            {
             before(grammarAccess.getBCoolLibraryAccess().getBCoolLibraryKeyword_1()); 
            match(input,11,FOLLOW_11_in_rule__BCoolLibrary__Group__1__Impl460); 
             after(grammarAccess.getBCoolLibraryAccess().getBCoolLibraryKeyword_1()); 

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
    // $ANTLR end "rule__BCoolLibrary__Group__1__Impl"


    // $ANTLR start "rule__BCoolLibrary__Group__2"
    // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:264:1: rule__BCoolLibrary__Group__2 : rule__BCoolLibrary__Group__2__Impl rule__BCoolLibrary__Group__3 ;
    public final void rule__BCoolLibrary__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:268:1: ( rule__BCoolLibrary__Group__2__Impl rule__BCoolLibrary__Group__3 )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:269:2: rule__BCoolLibrary__Group__2__Impl rule__BCoolLibrary__Group__3
            {
            pushFollow(FOLLOW_rule__BCoolLibrary__Group__2__Impl_in_rule__BCoolLibrary__Group__2491);
            rule__BCoolLibrary__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BCoolLibrary__Group__3_in_rule__BCoolLibrary__Group__2494);
            rule__BCoolLibrary__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BCoolLibrary__Group__2"


    // $ANTLR start "rule__BCoolLibrary__Group__2__Impl"
    // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:276:1: rule__BCoolLibrary__Group__2__Impl : ( ( rule__BCoolLibrary__NameAssignment_2 ) ) ;
    public final void rule__BCoolLibrary__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:280:1: ( ( ( rule__BCoolLibrary__NameAssignment_2 ) ) )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:281:1: ( ( rule__BCoolLibrary__NameAssignment_2 ) )
            {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:281:1: ( ( rule__BCoolLibrary__NameAssignment_2 ) )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:282:1: ( rule__BCoolLibrary__NameAssignment_2 )
            {
             before(grammarAccess.getBCoolLibraryAccess().getNameAssignment_2()); 
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:283:1: ( rule__BCoolLibrary__NameAssignment_2 )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:283:2: rule__BCoolLibrary__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__BCoolLibrary__NameAssignment_2_in_rule__BCoolLibrary__Group__2__Impl521);
            rule__BCoolLibrary__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getBCoolLibraryAccess().getNameAssignment_2()); 

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
    // $ANTLR end "rule__BCoolLibrary__Group__2__Impl"


    // $ANTLR start "rule__BCoolLibrary__Group__3"
    // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:293:1: rule__BCoolLibrary__Group__3 : rule__BCoolLibrary__Group__3__Impl rule__BCoolLibrary__Group__4 ;
    public final void rule__BCoolLibrary__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:297:1: ( rule__BCoolLibrary__Group__3__Impl rule__BCoolLibrary__Group__4 )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:298:2: rule__BCoolLibrary__Group__3__Impl rule__BCoolLibrary__Group__4
            {
            pushFollow(FOLLOW_rule__BCoolLibrary__Group__3__Impl_in_rule__BCoolLibrary__Group__3551);
            rule__BCoolLibrary__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BCoolLibrary__Group__4_in_rule__BCoolLibrary__Group__3554);
            rule__BCoolLibrary__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BCoolLibrary__Group__3"


    // $ANTLR start "rule__BCoolLibrary__Group__3__Impl"
    // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:305:1: rule__BCoolLibrary__Group__3__Impl : ( '{' ) ;
    public final void rule__BCoolLibrary__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:309:1: ( ( '{' ) )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:310:1: ( '{' )
            {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:310:1: ( '{' )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:311:1: '{'
            {
             before(grammarAccess.getBCoolLibraryAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,12,FOLLOW_12_in_rule__BCoolLibrary__Group__3__Impl582); 
             after(grammarAccess.getBCoolLibraryAccess().getLeftCurlyBracketKeyword_3()); 

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
    // $ANTLR end "rule__BCoolLibrary__Group__3__Impl"


    // $ANTLR start "rule__BCoolLibrary__Group__4"
    // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:324:1: rule__BCoolLibrary__Group__4 : rule__BCoolLibrary__Group__4__Impl rule__BCoolLibrary__Group__5 ;
    public final void rule__BCoolLibrary__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:328:1: ( rule__BCoolLibrary__Group__4__Impl rule__BCoolLibrary__Group__5 )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:329:2: rule__BCoolLibrary__Group__4__Impl rule__BCoolLibrary__Group__5
            {
            pushFollow(FOLLOW_rule__BCoolLibrary__Group__4__Impl_in_rule__BCoolLibrary__Group__4613);
            rule__BCoolLibrary__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BCoolLibrary__Group__5_in_rule__BCoolLibrary__Group__4616);
            rule__BCoolLibrary__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BCoolLibrary__Group__4"


    // $ANTLR start "rule__BCoolLibrary__Group__4__Impl"
    // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:336:1: rule__BCoolLibrary__Group__4__Impl : ( ( rule__BCoolLibrary__Group_4__0 )? ) ;
    public final void rule__BCoolLibrary__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:340:1: ( ( ( rule__BCoolLibrary__Group_4__0 )? ) )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:341:1: ( ( rule__BCoolLibrary__Group_4__0 )? )
            {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:341:1: ( ( rule__BCoolLibrary__Group_4__0 )? )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:342:1: ( rule__BCoolLibrary__Group_4__0 )?
            {
             before(grammarAccess.getBCoolLibraryAccess().getGroup_4()); 
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:343:1: ( rule__BCoolLibrary__Group_4__0 )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==14) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:343:2: rule__BCoolLibrary__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__BCoolLibrary__Group_4__0_in_rule__BCoolLibrary__Group__4__Impl643);
                    rule__BCoolLibrary__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getBCoolLibraryAccess().getGroup_4()); 

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
    // $ANTLR end "rule__BCoolLibrary__Group__4__Impl"


    // $ANTLR start "rule__BCoolLibrary__Group__5"
    // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:353:1: rule__BCoolLibrary__Group__5 : rule__BCoolLibrary__Group__5__Impl rule__BCoolLibrary__Group__6 ;
    public final void rule__BCoolLibrary__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:357:1: ( rule__BCoolLibrary__Group__5__Impl rule__BCoolLibrary__Group__6 )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:358:2: rule__BCoolLibrary__Group__5__Impl rule__BCoolLibrary__Group__6
            {
            pushFollow(FOLLOW_rule__BCoolLibrary__Group__5__Impl_in_rule__BCoolLibrary__Group__5674);
            rule__BCoolLibrary__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BCoolLibrary__Group__6_in_rule__BCoolLibrary__Group__5677);
            rule__BCoolLibrary__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BCoolLibrary__Group__5"


    // $ANTLR start "rule__BCoolLibrary__Group__5__Impl"
    // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:365:1: rule__BCoolLibrary__Group__5__Impl : ( ( rule__BCoolLibrary__Group_5__0 )? ) ;
    public final void rule__BCoolLibrary__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:369:1: ( ( ( rule__BCoolLibrary__Group_5__0 )? ) )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:370:1: ( ( rule__BCoolLibrary__Group_5__0 )? )
            {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:370:1: ( ( rule__BCoolLibrary__Group_5__0 )? )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:371:1: ( rule__BCoolLibrary__Group_5__0 )?
            {
             before(grammarAccess.getBCoolLibraryAccess().getGroup_5()); 
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:372:1: ( rule__BCoolLibrary__Group_5__0 )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==16) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:372:2: rule__BCoolLibrary__Group_5__0
                    {
                    pushFollow(FOLLOW_rule__BCoolLibrary__Group_5__0_in_rule__BCoolLibrary__Group__5__Impl704);
                    rule__BCoolLibrary__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getBCoolLibraryAccess().getGroup_5()); 

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
    // $ANTLR end "rule__BCoolLibrary__Group__5__Impl"


    // $ANTLR start "rule__BCoolLibrary__Group__6"
    // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:382:1: rule__BCoolLibrary__Group__6 : rule__BCoolLibrary__Group__6__Impl rule__BCoolLibrary__Group__7 ;
    public final void rule__BCoolLibrary__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:386:1: ( rule__BCoolLibrary__Group__6__Impl rule__BCoolLibrary__Group__7 )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:387:2: rule__BCoolLibrary__Group__6__Impl rule__BCoolLibrary__Group__7
            {
            pushFollow(FOLLOW_rule__BCoolLibrary__Group__6__Impl_in_rule__BCoolLibrary__Group__6735);
            rule__BCoolLibrary__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BCoolLibrary__Group__7_in_rule__BCoolLibrary__Group__6738);
            rule__BCoolLibrary__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BCoolLibrary__Group__6"


    // $ANTLR start "rule__BCoolLibrary__Group__6__Impl"
    // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:394:1: rule__BCoolLibrary__Group__6__Impl : ( ( rule__BCoolLibrary__Group_6__0 )? ) ;
    public final void rule__BCoolLibrary__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:398:1: ( ( ( rule__BCoolLibrary__Group_6__0 )? ) )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:399:1: ( ( rule__BCoolLibrary__Group_6__0 )? )
            {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:399:1: ( ( rule__BCoolLibrary__Group_6__0 )? )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:400:1: ( rule__BCoolLibrary__Group_6__0 )?
            {
             before(grammarAccess.getBCoolLibraryAccess().getGroup_6()); 
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:401:1: ( rule__BCoolLibrary__Group_6__0 )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==17) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:401:2: rule__BCoolLibrary__Group_6__0
                    {
                    pushFollow(FOLLOW_rule__BCoolLibrary__Group_6__0_in_rule__BCoolLibrary__Group__6__Impl765);
                    rule__BCoolLibrary__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getBCoolLibraryAccess().getGroup_6()); 

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
    // $ANTLR end "rule__BCoolLibrary__Group__6__Impl"


    // $ANTLR start "rule__BCoolLibrary__Group__7"
    // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:411:1: rule__BCoolLibrary__Group__7 : rule__BCoolLibrary__Group__7__Impl rule__BCoolLibrary__Group__8 ;
    public final void rule__BCoolLibrary__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:415:1: ( rule__BCoolLibrary__Group__7__Impl rule__BCoolLibrary__Group__8 )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:416:2: rule__BCoolLibrary__Group__7__Impl rule__BCoolLibrary__Group__8
            {
            pushFollow(FOLLOW_rule__BCoolLibrary__Group__7__Impl_in_rule__BCoolLibrary__Group__7796);
            rule__BCoolLibrary__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BCoolLibrary__Group__8_in_rule__BCoolLibrary__Group__7799);
            rule__BCoolLibrary__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BCoolLibrary__Group__7"


    // $ANTLR start "rule__BCoolLibrary__Group__7__Impl"
    // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:423:1: rule__BCoolLibrary__Group__7__Impl : ( ( rule__BCoolLibrary__Group_7__0 )? ) ;
    public final void rule__BCoolLibrary__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:427:1: ( ( ( rule__BCoolLibrary__Group_7__0 )? ) )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:428:1: ( ( rule__BCoolLibrary__Group_7__0 )? )
            {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:428:1: ( ( rule__BCoolLibrary__Group_7__0 )? )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:429:1: ( rule__BCoolLibrary__Group_7__0 )?
            {
             before(grammarAccess.getBCoolLibraryAccess().getGroup_7()); 
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:430:1: ( rule__BCoolLibrary__Group_7__0 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==18) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:430:2: rule__BCoolLibrary__Group_7__0
                    {
                    pushFollow(FOLLOW_rule__BCoolLibrary__Group_7__0_in_rule__BCoolLibrary__Group__7__Impl826);
                    rule__BCoolLibrary__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getBCoolLibraryAccess().getGroup_7()); 

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
    // $ANTLR end "rule__BCoolLibrary__Group__7__Impl"


    // $ANTLR start "rule__BCoolLibrary__Group__8"
    // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:440:1: rule__BCoolLibrary__Group__8 : rule__BCoolLibrary__Group__8__Impl ;
    public final void rule__BCoolLibrary__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:444:1: ( rule__BCoolLibrary__Group__8__Impl )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:445:2: rule__BCoolLibrary__Group__8__Impl
            {
            pushFollow(FOLLOW_rule__BCoolLibrary__Group__8__Impl_in_rule__BCoolLibrary__Group__8857);
            rule__BCoolLibrary__Group__8__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BCoolLibrary__Group__8"


    // $ANTLR start "rule__BCoolLibrary__Group__8__Impl"
    // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:451:1: rule__BCoolLibrary__Group__8__Impl : ( '}' ) ;
    public final void rule__BCoolLibrary__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:455:1: ( ( '}' ) )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:456:1: ( '}' )
            {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:456:1: ( '}' )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:457:1: '}'
            {
             before(grammarAccess.getBCoolLibraryAccess().getRightCurlyBracketKeyword_8()); 
            match(input,13,FOLLOW_13_in_rule__BCoolLibrary__Group__8__Impl885); 
             after(grammarAccess.getBCoolLibraryAccess().getRightCurlyBracketKeyword_8()); 

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
    // $ANTLR end "rule__BCoolLibrary__Group__8__Impl"


    // $ANTLR start "rule__BCoolLibrary__Group_4__0"
    // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:488:1: rule__BCoolLibrary__Group_4__0 : rule__BCoolLibrary__Group_4__0__Impl rule__BCoolLibrary__Group_4__1 ;
    public final void rule__BCoolLibrary__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:492:1: ( rule__BCoolLibrary__Group_4__0__Impl rule__BCoolLibrary__Group_4__1 )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:493:2: rule__BCoolLibrary__Group_4__0__Impl rule__BCoolLibrary__Group_4__1
            {
            pushFollow(FOLLOW_rule__BCoolLibrary__Group_4__0__Impl_in_rule__BCoolLibrary__Group_4__0934);
            rule__BCoolLibrary__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BCoolLibrary__Group_4__1_in_rule__BCoolLibrary__Group_4__0937);
            rule__BCoolLibrary__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BCoolLibrary__Group_4__0"


    // $ANTLR start "rule__BCoolLibrary__Group_4__0__Impl"
    // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:500:1: rule__BCoolLibrary__Group_4__0__Impl : ( 'expressionDefinitions' ) ;
    public final void rule__BCoolLibrary__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:504:1: ( ( 'expressionDefinitions' ) )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:505:1: ( 'expressionDefinitions' )
            {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:505:1: ( 'expressionDefinitions' )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:506:1: 'expressionDefinitions'
            {
             before(grammarAccess.getBCoolLibraryAccess().getExpressionDefinitionsKeyword_4_0()); 
            match(input,14,FOLLOW_14_in_rule__BCoolLibrary__Group_4__0__Impl965); 
             after(grammarAccess.getBCoolLibraryAccess().getExpressionDefinitionsKeyword_4_0()); 

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
    // $ANTLR end "rule__BCoolLibrary__Group_4__0__Impl"


    // $ANTLR start "rule__BCoolLibrary__Group_4__1"
    // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:519:1: rule__BCoolLibrary__Group_4__1 : rule__BCoolLibrary__Group_4__1__Impl rule__BCoolLibrary__Group_4__2 ;
    public final void rule__BCoolLibrary__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:523:1: ( rule__BCoolLibrary__Group_4__1__Impl rule__BCoolLibrary__Group_4__2 )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:524:2: rule__BCoolLibrary__Group_4__1__Impl rule__BCoolLibrary__Group_4__2
            {
            pushFollow(FOLLOW_rule__BCoolLibrary__Group_4__1__Impl_in_rule__BCoolLibrary__Group_4__1996);
            rule__BCoolLibrary__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BCoolLibrary__Group_4__2_in_rule__BCoolLibrary__Group_4__1999);
            rule__BCoolLibrary__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BCoolLibrary__Group_4__1"


    // $ANTLR start "rule__BCoolLibrary__Group_4__1__Impl"
    // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:531:1: rule__BCoolLibrary__Group_4__1__Impl : ( '{' ) ;
    public final void rule__BCoolLibrary__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:535:1: ( ( '{' ) )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:536:1: ( '{' )
            {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:536:1: ( '{' )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:537:1: '{'
            {
             before(grammarAccess.getBCoolLibraryAccess().getLeftCurlyBracketKeyword_4_1()); 
            match(input,12,FOLLOW_12_in_rule__BCoolLibrary__Group_4__1__Impl1027); 
             after(grammarAccess.getBCoolLibraryAccess().getLeftCurlyBracketKeyword_4_1()); 

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
    // $ANTLR end "rule__BCoolLibrary__Group_4__1__Impl"


    // $ANTLR start "rule__BCoolLibrary__Group_4__2"
    // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:550:1: rule__BCoolLibrary__Group_4__2 : rule__BCoolLibrary__Group_4__2__Impl rule__BCoolLibrary__Group_4__3 ;
    public final void rule__BCoolLibrary__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:554:1: ( rule__BCoolLibrary__Group_4__2__Impl rule__BCoolLibrary__Group_4__3 )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:555:2: rule__BCoolLibrary__Group_4__2__Impl rule__BCoolLibrary__Group_4__3
            {
            pushFollow(FOLLOW_rule__BCoolLibrary__Group_4__2__Impl_in_rule__BCoolLibrary__Group_4__21058);
            rule__BCoolLibrary__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BCoolLibrary__Group_4__3_in_rule__BCoolLibrary__Group_4__21061);
            rule__BCoolLibrary__Group_4__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BCoolLibrary__Group_4__2"


    // $ANTLR start "rule__BCoolLibrary__Group_4__2__Impl"
    // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:562:1: rule__BCoolLibrary__Group_4__2__Impl : ( ( rule__BCoolLibrary__ExpressionDefinitionsAssignment_4_2 ) ) ;
    public final void rule__BCoolLibrary__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:566:1: ( ( ( rule__BCoolLibrary__ExpressionDefinitionsAssignment_4_2 ) ) )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:567:1: ( ( rule__BCoolLibrary__ExpressionDefinitionsAssignment_4_2 ) )
            {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:567:1: ( ( rule__BCoolLibrary__ExpressionDefinitionsAssignment_4_2 ) )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:568:1: ( rule__BCoolLibrary__ExpressionDefinitionsAssignment_4_2 )
            {
             before(grammarAccess.getBCoolLibraryAccess().getExpressionDefinitionsAssignment_4_2()); 
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:569:1: ( rule__BCoolLibrary__ExpressionDefinitionsAssignment_4_2 )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:569:2: rule__BCoolLibrary__ExpressionDefinitionsAssignment_4_2
            {
            pushFollow(FOLLOW_rule__BCoolLibrary__ExpressionDefinitionsAssignment_4_2_in_rule__BCoolLibrary__Group_4__2__Impl1088);
            rule__BCoolLibrary__ExpressionDefinitionsAssignment_4_2();

            state._fsp--;


            }

             after(grammarAccess.getBCoolLibraryAccess().getExpressionDefinitionsAssignment_4_2()); 

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
    // $ANTLR end "rule__BCoolLibrary__Group_4__2__Impl"


    // $ANTLR start "rule__BCoolLibrary__Group_4__3"
    // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:579:1: rule__BCoolLibrary__Group_4__3 : rule__BCoolLibrary__Group_4__3__Impl rule__BCoolLibrary__Group_4__4 ;
    public final void rule__BCoolLibrary__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:583:1: ( rule__BCoolLibrary__Group_4__3__Impl rule__BCoolLibrary__Group_4__4 )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:584:2: rule__BCoolLibrary__Group_4__3__Impl rule__BCoolLibrary__Group_4__4
            {
            pushFollow(FOLLOW_rule__BCoolLibrary__Group_4__3__Impl_in_rule__BCoolLibrary__Group_4__31118);
            rule__BCoolLibrary__Group_4__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BCoolLibrary__Group_4__4_in_rule__BCoolLibrary__Group_4__31121);
            rule__BCoolLibrary__Group_4__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BCoolLibrary__Group_4__3"


    // $ANTLR start "rule__BCoolLibrary__Group_4__3__Impl"
    // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:591:1: rule__BCoolLibrary__Group_4__3__Impl : ( ( rule__BCoolLibrary__Group_4_3__0 )* ) ;
    public final void rule__BCoolLibrary__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:595:1: ( ( ( rule__BCoolLibrary__Group_4_3__0 )* ) )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:596:1: ( ( rule__BCoolLibrary__Group_4_3__0 )* )
            {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:596:1: ( ( rule__BCoolLibrary__Group_4_3__0 )* )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:597:1: ( rule__BCoolLibrary__Group_4_3__0 )*
            {
             before(grammarAccess.getBCoolLibraryAccess().getGroup_4_3()); 
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:598:1: ( rule__BCoolLibrary__Group_4_3__0 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==15) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:598:2: rule__BCoolLibrary__Group_4_3__0
            	    {
            	    pushFollow(FOLLOW_rule__BCoolLibrary__Group_4_3__0_in_rule__BCoolLibrary__Group_4__3__Impl1148);
            	    rule__BCoolLibrary__Group_4_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getBCoolLibraryAccess().getGroup_4_3()); 

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
    // $ANTLR end "rule__BCoolLibrary__Group_4__3__Impl"


    // $ANTLR start "rule__BCoolLibrary__Group_4__4"
    // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:608:1: rule__BCoolLibrary__Group_4__4 : rule__BCoolLibrary__Group_4__4__Impl ;
    public final void rule__BCoolLibrary__Group_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:612:1: ( rule__BCoolLibrary__Group_4__4__Impl )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:613:2: rule__BCoolLibrary__Group_4__4__Impl
            {
            pushFollow(FOLLOW_rule__BCoolLibrary__Group_4__4__Impl_in_rule__BCoolLibrary__Group_4__41179);
            rule__BCoolLibrary__Group_4__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BCoolLibrary__Group_4__4"


    // $ANTLR start "rule__BCoolLibrary__Group_4__4__Impl"
    // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:619:1: rule__BCoolLibrary__Group_4__4__Impl : ( '}' ) ;
    public final void rule__BCoolLibrary__Group_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:623:1: ( ( '}' ) )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:624:1: ( '}' )
            {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:624:1: ( '}' )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:625:1: '}'
            {
             before(grammarAccess.getBCoolLibraryAccess().getRightCurlyBracketKeyword_4_4()); 
            match(input,13,FOLLOW_13_in_rule__BCoolLibrary__Group_4__4__Impl1207); 
             after(grammarAccess.getBCoolLibraryAccess().getRightCurlyBracketKeyword_4_4()); 

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
    // $ANTLR end "rule__BCoolLibrary__Group_4__4__Impl"


    // $ANTLR start "rule__BCoolLibrary__Group_4_3__0"
    // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:648:1: rule__BCoolLibrary__Group_4_3__0 : rule__BCoolLibrary__Group_4_3__0__Impl rule__BCoolLibrary__Group_4_3__1 ;
    public final void rule__BCoolLibrary__Group_4_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:652:1: ( rule__BCoolLibrary__Group_4_3__0__Impl rule__BCoolLibrary__Group_4_3__1 )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:653:2: rule__BCoolLibrary__Group_4_3__0__Impl rule__BCoolLibrary__Group_4_3__1
            {
            pushFollow(FOLLOW_rule__BCoolLibrary__Group_4_3__0__Impl_in_rule__BCoolLibrary__Group_4_3__01248);
            rule__BCoolLibrary__Group_4_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BCoolLibrary__Group_4_3__1_in_rule__BCoolLibrary__Group_4_3__01251);
            rule__BCoolLibrary__Group_4_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BCoolLibrary__Group_4_3__0"


    // $ANTLR start "rule__BCoolLibrary__Group_4_3__0__Impl"
    // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:660:1: rule__BCoolLibrary__Group_4_3__0__Impl : ( ',' ) ;
    public final void rule__BCoolLibrary__Group_4_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:664:1: ( ( ',' ) )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:665:1: ( ',' )
            {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:665:1: ( ',' )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:666:1: ','
            {
             before(grammarAccess.getBCoolLibraryAccess().getCommaKeyword_4_3_0()); 
            match(input,15,FOLLOW_15_in_rule__BCoolLibrary__Group_4_3__0__Impl1279); 
             after(grammarAccess.getBCoolLibraryAccess().getCommaKeyword_4_3_0()); 

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
    // $ANTLR end "rule__BCoolLibrary__Group_4_3__0__Impl"


    // $ANTLR start "rule__BCoolLibrary__Group_4_3__1"
    // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:679:1: rule__BCoolLibrary__Group_4_3__1 : rule__BCoolLibrary__Group_4_3__1__Impl ;
    public final void rule__BCoolLibrary__Group_4_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:683:1: ( rule__BCoolLibrary__Group_4_3__1__Impl )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:684:2: rule__BCoolLibrary__Group_4_3__1__Impl
            {
            pushFollow(FOLLOW_rule__BCoolLibrary__Group_4_3__1__Impl_in_rule__BCoolLibrary__Group_4_3__11310);
            rule__BCoolLibrary__Group_4_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BCoolLibrary__Group_4_3__1"


    // $ANTLR start "rule__BCoolLibrary__Group_4_3__1__Impl"
    // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:690:1: rule__BCoolLibrary__Group_4_3__1__Impl : ( ( rule__BCoolLibrary__ExpressionDefinitionsAssignment_4_3_1 ) ) ;
    public final void rule__BCoolLibrary__Group_4_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:694:1: ( ( ( rule__BCoolLibrary__ExpressionDefinitionsAssignment_4_3_1 ) ) )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:695:1: ( ( rule__BCoolLibrary__ExpressionDefinitionsAssignment_4_3_1 ) )
            {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:695:1: ( ( rule__BCoolLibrary__ExpressionDefinitionsAssignment_4_3_1 ) )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:696:1: ( rule__BCoolLibrary__ExpressionDefinitionsAssignment_4_3_1 )
            {
             before(grammarAccess.getBCoolLibraryAccess().getExpressionDefinitionsAssignment_4_3_1()); 
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:697:1: ( rule__BCoolLibrary__ExpressionDefinitionsAssignment_4_3_1 )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:697:2: rule__BCoolLibrary__ExpressionDefinitionsAssignment_4_3_1
            {
            pushFollow(FOLLOW_rule__BCoolLibrary__ExpressionDefinitionsAssignment_4_3_1_in_rule__BCoolLibrary__Group_4_3__1__Impl1337);
            rule__BCoolLibrary__ExpressionDefinitionsAssignment_4_3_1();

            state._fsp--;


            }

             after(grammarAccess.getBCoolLibraryAccess().getExpressionDefinitionsAssignment_4_3_1()); 

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
    // $ANTLR end "rule__BCoolLibrary__Group_4_3__1__Impl"


    // $ANTLR start "rule__BCoolLibrary__Group_5__0"
    // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:711:1: rule__BCoolLibrary__Group_5__0 : rule__BCoolLibrary__Group_5__0__Impl rule__BCoolLibrary__Group_5__1 ;
    public final void rule__BCoolLibrary__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:715:1: ( rule__BCoolLibrary__Group_5__0__Impl rule__BCoolLibrary__Group_5__1 )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:716:2: rule__BCoolLibrary__Group_5__0__Impl rule__BCoolLibrary__Group_5__1
            {
            pushFollow(FOLLOW_rule__BCoolLibrary__Group_5__0__Impl_in_rule__BCoolLibrary__Group_5__01371);
            rule__BCoolLibrary__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BCoolLibrary__Group_5__1_in_rule__BCoolLibrary__Group_5__01374);
            rule__BCoolLibrary__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BCoolLibrary__Group_5__0"


    // $ANTLR start "rule__BCoolLibrary__Group_5__0__Impl"
    // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:723:1: rule__BCoolLibrary__Group_5__0__Impl : ( 'relationDefinitions' ) ;
    public final void rule__BCoolLibrary__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:727:1: ( ( 'relationDefinitions' ) )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:728:1: ( 'relationDefinitions' )
            {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:728:1: ( 'relationDefinitions' )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:729:1: 'relationDefinitions'
            {
             before(grammarAccess.getBCoolLibraryAccess().getRelationDefinitionsKeyword_5_0()); 
            match(input,16,FOLLOW_16_in_rule__BCoolLibrary__Group_5__0__Impl1402); 
             after(grammarAccess.getBCoolLibraryAccess().getRelationDefinitionsKeyword_5_0()); 

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
    // $ANTLR end "rule__BCoolLibrary__Group_5__0__Impl"


    // $ANTLR start "rule__BCoolLibrary__Group_5__1"
    // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:742:1: rule__BCoolLibrary__Group_5__1 : rule__BCoolLibrary__Group_5__1__Impl rule__BCoolLibrary__Group_5__2 ;
    public final void rule__BCoolLibrary__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:746:1: ( rule__BCoolLibrary__Group_5__1__Impl rule__BCoolLibrary__Group_5__2 )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:747:2: rule__BCoolLibrary__Group_5__1__Impl rule__BCoolLibrary__Group_5__2
            {
            pushFollow(FOLLOW_rule__BCoolLibrary__Group_5__1__Impl_in_rule__BCoolLibrary__Group_5__11433);
            rule__BCoolLibrary__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BCoolLibrary__Group_5__2_in_rule__BCoolLibrary__Group_5__11436);
            rule__BCoolLibrary__Group_5__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BCoolLibrary__Group_5__1"


    // $ANTLR start "rule__BCoolLibrary__Group_5__1__Impl"
    // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:754:1: rule__BCoolLibrary__Group_5__1__Impl : ( '{' ) ;
    public final void rule__BCoolLibrary__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:758:1: ( ( '{' ) )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:759:1: ( '{' )
            {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:759:1: ( '{' )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:760:1: '{'
            {
             before(grammarAccess.getBCoolLibraryAccess().getLeftCurlyBracketKeyword_5_1()); 
            match(input,12,FOLLOW_12_in_rule__BCoolLibrary__Group_5__1__Impl1464); 
             after(grammarAccess.getBCoolLibraryAccess().getLeftCurlyBracketKeyword_5_1()); 

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
    // $ANTLR end "rule__BCoolLibrary__Group_5__1__Impl"


    // $ANTLR start "rule__BCoolLibrary__Group_5__2"
    // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:773:1: rule__BCoolLibrary__Group_5__2 : rule__BCoolLibrary__Group_5__2__Impl rule__BCoolLibrary__Group_5__3 ;
    public final void rule__BCoolLibrary__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:777:1: ( rule__BCoolLibrary__Group_5__2__Impl rule__BCoolLibrary__Group_5__3 )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:778:2: rule__BCoolLibrary__Group_5__2__Impl rule__BCoolLibrary__Group_5__3
            {
            pushFollow(FOLLOW_rule__BCoolLibrary__Group_5__2__Impl_in_rule__BCoolLibrary__Group_5__21495);
            rule__BCoolLibrary__Group_5__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BCoolLibrary__Group_5__3_in_rule__BCoolLibrary__Group_5__21498);
            rule__BCoolLibrary__Group_5__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BCoolLibrary__Group_5__2"


    // $ANTLR start "rule__BCoolLibrary__Group_5__2__Impl"
    // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:785:1: rule__BCoolLibrary__Group_5__2__Impl : ( ( rule__BCoolLibrary__RelationDefinitionsAssignment_5_2 ) ) ;
    public final void rule__BCoolLibrary__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:789:1: ( ( ( rule__BCoolLibrary__RelationDefinitionsAssignment_5_2 ) ) )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:790:1: ( ( rule__BCoolLibrary__RelationDefinitionsAssignment_5_2 ) )
            {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:790:1: ( ( rule__BCoolLibrary__RelationDefinitionsAssignment_5_2 ) )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:791:1: ( rule__BCoolLibrary__RelationDefinitionsAssignment_5_2 )
            {
             before(grammarAccess.getBCoolLibraryAccess().getRelationDefinitionsAssignment_5_2()); 
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:792:1: ( rule__BCoolLibrary__RelationDefinitionsAssignment_5_2 )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:792:2: rule__BCoolLibrary__RelationDefinitionsAssignment_5_2
            {
            pushFollow(FOLLOW_rule__BCoolLibrary__RelationDefinitionsAssignment_5_2_in_rule__BCoolLibrary__Group_5__2__Impl1525);
            rule__BCoolLibrary__RelationDefinitionsAssignment_5_2();

            state._fsp--;


            }

             after(grammarAccess.getBCoolLibraryAccess().getRelationDefinitionsAssignment_5_2()); 

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
    // $ANTLR end "rule__BCoolLibrary__Group_5__2__Impl"


    // $ANTLR start "rule__BCoolLibrary__Group_5__3"
    // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:802:1: rule__BCoolLibrary__Group_5__3 : rule__BCoolLibrary__Group_5__3__Impl rule__BCoolLibrary__Group_5__4 ;
    public final void rule__BCoolLibrary__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:806:1: ( rule__BCoolLibrary__Group_5__3__Impl rule__BCoolLibrary__Group_5__4 )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:807:2: rule__BCoolLibrary__Group_5__3__Impl rule__BCoolLibrary__Group_5__4
            {
            pushFollow(FOLLOW_rule__BCoolLibrary__Group_5__3__Impl_in_rule__BCoolLibrary__Group_5__31555);
            rule__BCoolLibrary__Group_5__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BCoolLibrary__Group_5__4_in_rule__BCoolLibrary__Group_5__31558);
            rule__BCoolLibrary__Group_5__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BCoolLibrary__Group_5__3"


    // $ANTLR start "rule__BCoolLibrary__Group_5__3__Impl"
    // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:814:1: rule__BCoolLibrary__Group_5__3__Impl : ( ( rule__BCoolLibrary__Group_5_3__0 )* ) ;
    public final void rule__BCoolLibrary__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:818:1: ( ( ( rule__BCoolLibrary__Group_5_3__0 )* ) )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:819:1: ( ( rule__BCoolLibrary__Group_5_3__0 )* )
            {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:819:1: ( ( rule__BCoolLibrary__Group_5_3__0 )* )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:820:1: ( rule__BCoolLibrary__Group_5_3__0 )*
            {
             before(grammarAccess.getBCoolLibraryAccess().getGroup_5_3()); 
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:821:1: ( rule__BCoolLibrary__Group_5_3__0 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==15) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:821:2: rule__BCoolLibrary__Group_5_3__0
            	    {
            	    pushFollow(FOLLOW_rule__BCoolLibrary__Group_5_3__0_in_rule__BCoolLibrary__Group_5__3__Impl1585);
            	    rule__BCoolLibrary__Group_5_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getBCoolLibraryAccess().getGroup_5_3()); 

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
    // $ANTLR end "rule__BCoolLibrary__Group_5__3__Impl"


    // $ANTLR start "rule__BCoolLibrary__Group_5__4"
    // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:831:1: rule__BCoolLibrary__Group_5__4 : rule__BCoolLibrary__Group_5__4__Impl ;
    public final void rule__BCoolLibrary__Group_5__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:835:1: ( rule__BCoolLibrary__Group_5__4__Impl )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:836:2: rule__BCoolLibrary__Group_5__4__Impl
            {
            pushFollow(FOLLOW_rule__BCoolLibrary__Group_5__4__Impl_in_rule__BCoolLibrary__Group_5__41616);
            rule__BCoolLibrary__Group_5__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BCoolLibrary__Group_5__4"


    // $ANTLR start "rule__BCoolLibrary__Group_5__4__Impl"
    // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:842:1: rule__BCoolLibrary__Group_5__4__Impl : ( '}' ) ;
    public final void rule__BCoolLibrary__Group_5__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:846:1: ( ( '}' ) )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:847:1: ( '}' )
            {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:847:1: ( '}' )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:848:1: '}'
            {
             before(grammarAccess.getBCoolLibraryAccess().getRightCurlyBracketKeyword_5_4()); 
            match(input,13,FOLLOW_13_in_rule__BCoolLibrary__Group_5__4__Impl1644); 
             after(grammarAccess.getBCoolLibraryAccess().getRightCurlyBracketKeyword_5_4()); 

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
    // $ANTLR end "rule__BCoolLibrary__Group_5__4__Impl"


    // $ANTLR start "rule__BCoolLibrary__Group_5_3__0"
    // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:871:1: rule__BCoolLibrary__Group_5_3__0 : rule__BCoolLibrary__Group_5_3__0__Impl rule__BCoolLibrary__Group_5_3__1 ;
    public final void rule__BCoolLibrary__Group_5_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:875:1: ( rule__BCoolLibrary__Group_5_3__0__Impl rule__BCoolLibrary__Group_5_3__1 )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:876:2: rule__BCoolLibrary__Group_5_3__0__Impl rule__BCoolLibrary__Group_5_3__1
            {
            pushFollow(FOLLOW_rule__BCoolLibrary__Group_5_3__0__Impl_in_rule__BCoolLibrary__Group_5_3__01685);
            rule__BCoolLibrary__Group_5_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BCoolLibrary__Group_5_3__1_in_rule__BCoolLibrary__Group_5_3__01688);
            rule__BCoolLibrary__Group_5_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BCoolLibrary__Group_5_3__0"


    // $ANTLR start "rule__BCoolLibrary__Group_5_3__0__Impl"
    // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:883:1: rule__BCoolLibrary__Group_5_3__0__Impl : ( ',' ) ;
    public final void rule__BCoolLibrary__Group_5_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:887:1: ( ( ',' ) )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:888:1: ( ',' )
            {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:888:1: ( ',' )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:889:1: ','
            {
             before(grammarAccess.getBCoolLibraryAccess().getCommaKeyword_5_3_0()); 
            match(input,15,FOLLOW_15_in_rule__BCoolLibrary__Group_5_3__0__Impl1716); 
             after(grammarAccess.getBCoolLibraryAccess().getCommaKeyword_5_3_0()); 

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
    // $ANTLR end "rule__BCoolLibrary__Group_5_3__0__Impl"


    // $ANTLR start "rule__BCoolLibrary__Group_5_3__1"
    // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:902:1: rule__BCoolLibrary__Group_5_3__1 : rule__BCoolLibrary__Group_5_3__1__Impl ;
    public final void rule__BCoolLibrary__Group_5_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:906:1: ( rule__BCoolLibrary__Group_5_3__1__Impl )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:907:2: rule__BCoolLibrary__Group_5_3__1__Impl
            {
            pushFollow(FOLLOW_rule__BCoolLibrary__Group_5_3__1__Impl_in_rule__BCoolLibrary__Group_5_3__11747);
            rule__BCoolLibrary__Group_5_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BCoolLibrary__Group_5_3__1"


    // $ANTLR start "rule__BCoolLibrary__Group_5_3__1__Impl"
    // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:913:1: rule__BCoolLibrary__Group_5_3__1__Impl : ( ( rule__BCoolLibrary__RelationDefinitionsAssignment_5_3_1 ) ) ;
    public final void rule__BCoolLibrary__Group_5_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:917:1: ( ( ( rule__BCoolLibrary__RelationDefinitionsAssignment_5_3_1 ) ) )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:918:1: ( ( rule__BCoolLibrary__RelationDefinitionsAssignment_5_3_1 ) )
            {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:918:1: ( ( rule__BCoolLibrary__RelationDefinitionsAssignment_5_3_1 ) )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:919:1: ( rule__BCoolLibrary__RelationDefinitionsAssignment_5_3_1 )
            {
             before(grammarAccess.getBCoolLibraryAccess().getRelationDefinitionsAssignment_5_3_1()); 
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:920:1: ( rule__BCoolLibrary__RelationDefinitionsAssignment_5_3_1 )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:920:2: rule__BCoolLibrary__RelationDefinitionsAssignment_5_3_1
            {
            pushFollow(FOLLOW_rule__BCoolLibrary__RelationDefinitionsAssignment_5_3_1_in_rule__BCoolLibrary__Group_5_3__1__Impl1774);
            rule__BCoolLibrary__RelationDefinitionsAssignment_5_3_1();

            state._fsp--;


            }

             after(grammarAccess.getBCoolLibraryAccess().getRelationDefinitionsAssignment_5_3_1()); 

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
    // $ANTLR end "rule__BCoolLibrary__Group_5_3__1__Impl"


    // $ANTLR start "rule__BCoolLibrary__Group_6__0"
    // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:934:1: rule__BCoolLibrary__Group_6__0 : rule__BCoolLibrary__Group_6__0__Impl rule__BCoolLibrary__Group_6__1 ;
    public final void rule__BCoolLibrary__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:938:1: ( rule__BCoolLibrary__Group_6__0__Impl rule__BCoolLibrary__Group_6__1 )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:939:2: rule__BCoolLibrary__Group_6__0__Impl rule__BCoolLibrary__Group_6__1
            {
            pushFollow(FOLLOW_rule__BCoolLibrary__Group_6__0__Impl_in_rule__BCoolLibrary__Group_6__01808);
            rule__BCoolLibrary__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BCoolLibrary__Group_6__1_in_rule__BCoolLibrary__Group_6__01811);
            rule__BCoolLibrary__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BCoolLibrary__Group_6__0"


    // $ANTLR start "rule__BCoolLibrary__Group_6__0__Impl"
    // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:946:1: rule__BCoolLibrary__Group_6__0__Impl : ( 'relationDeclarations' ) ;
    public final void rule__BCoolLibrary__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:950:1: ( ( 'relationDeclarations' ) )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:951:1: ( 'relationDeclarations' )
            {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:951:1: ( 'relationDeclarations' )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:952:1: 'relationDeclarations'
            {
             before(grammarAccess.getBCoolLibraryAccess().getRelationDeclarationsKeyword_6_0()); 
            match(input,17,FOLLOW_17_in_rule__BCoolLibrary__Group_6__0__Impl1839); 
             after(grammarAccess.getBCoolLibraryAccess().getRelationDeclarationsKeyword_6_0()); 

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
    // $ANTLR end "rule__BCoolLibrary__Group_6__0__Impl"


    // $ANTLR start "rule__BCoolLibrary__Group_6__1"
    // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:965:1: rule__BCoolLibrary__Group_6__1 : rule__BCoolLibrary__Group_6__1__Impl rule__BCoolLibrary__Group_6__2 ;
    public final void rule__BCoolLibrary__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:969:1: ( rule__BCoolLibrary__Group_6__1__Impl rule__BCoolLibrary__Group_6__2 )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:970:2: rule__BCoolLibrary__Group_6__1__Impl rule__BCoolLibrary__Group_6__2
            {
            pushFollow(FOLLOW_rule__BCoolLibrary__Group_6__1__Impl_in_rule__BCoolLibrary__Group_6__11870);
            rule__BCoolLibrary__Group_6__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BCoolLibrary__Group_6__2_in_rule__BCoolLibrary__Group_6__11873);
            rule__BCoolLibrary__Group_6__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BCoolLibrary__Group_6__1"


    // $ANTLR start "rule__BCoolLibrary__Group_6__1__Impl"
    // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:977:1: rule__BCoolLibrary__Group_6__1__Impl : ( '{' ) ;
    public final void rule__BCoolLibrary__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:981:1: ( ( '{' ) )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:982:1: ( '{' )
            {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:982:1: ( '{' )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:983:1: '{'
            {
             before(grammarAccess.getBCoolLibraryAccess().getLeftCurlyBracketKeyword_6_1()); 
            match(input,12,FOLLOW_12_in_rule__BCoolLibrary__Group_6__1__Impl1901); 
             after(grammarAccess.getBCoolLibraryAccess().getLeftCurlyBracketKeyword_6_1()); 

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
    // $ANTLR end "rule__BCoolLibrary__Group_6__1__Impl"


    // $ANTLR start "rule__BCoolLibrary__Group_6__2"
    // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:996:1: rule__BCoolLibrary__Group_6__2 : rule__BCoolLibrary__Group_6__2__Impl rule__BCoolLibrary__Group_6__3 ;
    public final void rule__BCoolLibrary__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1000:1: ( rule__BCoolLibrary__Group_6__2__Impl rule__BCoolLibrary__Group_6__3 )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1001:2: rule__BCoolLibrary__Group_6__2__Impl rule__BCoolLibrary__Group_6__3
            {
            pushFollow(FOLLOW_rule__BCoolLibrary__Group_6__2__Impl_in_rule__BCoolLibrary__Group_6__21932);
            rule__BCoolLibrary__Group_6__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BCoolLibrary__Group_6__3_in_rule__BCoolLibrary__Group_6__21935);
            rule__BCoolLibrary__Group_6__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BCoolLibrary__Group_6__2"


    // $ANTLR start "rule__BCoolLibrary__Group_6__2__Impl"
    // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1008:1: rule__BCoolLibrary__Group_6__2__Impl : ( ( rule__BCoolLibrary__RelationDeclarationsAssignment_6_2 ) ) ;
    public final void rule__BCoolLibrary__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1012:1: ( ( ( rule__BCoolLibrary__RelationDeclarationsAssignment_6_2 ) ) )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1013:1: ( ( rule__BCoolLibrary__RelationDeclarationsAssignment_6_2 ) )
            {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1013:1: ( ( rule__BCoolLibrary__RelationDeclarationsAssignment_6_2 ) )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1014:1: ( rule__BCoolLibrary__RelationDeclarationsAssignment_6_2 )
            {
             before(grammarAccess.getBCoolLibraryAccess().getRelationDeclarationsAssignment_6_2()); 
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1015:1: ( rule__BCoolLibrary__RelationDeclarationsAssignment_6_2 )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1015:2: rule__BCoolLibrary__RelationDeclarationsAssignment_6_2
            {
            pushFollow(FOLLOW_rule__BCoolLibrary__RelationDeclarationsAssignment_6_2_in_rule__BCoolLibrary__Group_6__2__Impl1962);
            rule__BCoolLibrary__RelationDeclarationsAssignment_6_2();

            state._fsp--;


            }

             after(grammarAccess.getBCoolLibraryAccess().getRelationDeclarationsAssignment_6_2()); 

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
    // $ANTLR end "rule__BCoolLibrary__Group_6__2__Impl"


    // $ANTLR start "rule__BCoolLibrary__Group_6__3"
    // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1025:1: rule__BCoolLibrary__Group_6__3 : rule__BCoolLibrary__Group_6__3__Impl rule__BCoolLibrary__Group_6__4 ;
    public final void rule__BCoolLibrary__Group_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1029:1: ( rule__BCoolLibrary__Group_6__3__Impl rule__BCoolLibrary__Group_6__4 )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1030:2: rule__BCoolLibrary__Group_6__3__Impl rule__BCoolLibrary__Group_6__4
            {
            pushFollow(FOLLOW_rule__BCoolLibrary__Group_6__3__Impl_in_rule__BCoolLibrary__Group_6__31992);
            rule__BCoolLibrary__Group_6__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BCoolLibrary__Group_6__4_in_rule__BCoolLibrary__Group_6__31995);
            rule__BCoolLibrary__Group_6__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BCoolLibrary__Group_6__3"


    // $ANTLR start "rule__BCoolLibrary__Group_6__3__Impl"
    // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1037:1: rule__BCoolLibrary__Group_6__3__Impl : ( ( rule__BCoolLibrary__Group_6_3__0 )* ) ;
    public final void rule__BCoolLibrary__Group_6__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1041:1: ( ( ( rule__BCoolLibrary__Group_6_3__0 )* ) )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1042:1: ( ( rule__BCoolLibrary__Group_6_3__0 )* )
            {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1042:1: ( ( rule__BCoolLibrary__Group_6_3__0 )* )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1043:1: ( rule__BCoolLibrary__Group_6_3__0 )*
            {
             before(grammarAccess.getBCoolLibraryAccess().getGroup_6_3()); 
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1044:1: ( rule__BCoolLibrary__Group_6_3__0 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==15) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1044:2: rule__BCoolLibrary__Group_6_3__0
            	    {
            	    pushFollow(FOLLOW_rule__BCoolLibrary__Group_6_3__0_in_rule__BCoolLibrary__Group_6__3__Impl2022);
            	    rule__BCoolLibrary__Group_6_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getBCoolLibraryAccess().getGroup_6_3()); 

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
    // $ANTLR end "rule__BCoolLibrary__Group_6__3__Impl"


    // $ANTLR start "rule__BCoolLibrary__Group_6__4"
    // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1054:1: rule__BCoolLibrary__Group_6__4 : rule__BCoolLibrary__Group_6__4__Impl ;
    public final void rule__BCoolLibrary__Group_6__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1058:1: ( rule__BCoolLibrary__Group_6__4__Impl )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1059:2: rule__BCoolLibrary__Group_6__4__Impl
            {
            pushFollow(FOLLOW_rule__BCoolLibrary__Group_6__4__Impl_in_rule__BCoolLibrary__Group_6__42053);
            rule__BCoolLibrary__Group_6__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BCoolLibrary__Group_6__4"


    // $ANTLR start "rule__BCoolLibrary__Group_6__4__Impl"
    // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1065:1: rule__BCoolLibrary__Group_6__4__Impl : ( '}' ) ;
    public final void rule__BCoolLibrary__Group_6__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1069:1: ( ( '}' ) )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1070:1: ( '}' )
            {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1070:1: ( '}' )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1071:1: '}'
            {
             before(grammarAccess.getBCoolLibraryAccess().getRightCurlyBracketKeyword_6_4()); 
            match(input,13,FOLLOW_13_in_rule__BCoolLibrary__Group_6__4__Impl2081); 
             after(grammarAccess.getBCoolLibraryAccess().getRightCurlyBracketKeyword_6_4()); 

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
    // $ANTLR end "rule__BCoolLibrary__Group_6__4__Impl"


    // $ANTLR start "rule__BCoolLibrary__Group_6_3__0"
    // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1094:1: rule__BCoolLibrary__Group_6_3__0 : rule__BCoolLibrary__Group_6_3__0__Impl rule__BCoolLibrary__Group_6_3__1 ;
    public final void rule__BCoolLibrary__Group_6_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1098:1: ( rule__BCoolLibrary__Group_6_3__0__Impl rule__BCoolLibrary__Group_6_3__1 )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1099:2: rule__BCoolLibrary__Group_6_3__0__Impl rule__BCoolLibrary__Group_6_3__1
            {
            pushFollow(FOLLOW_rule__BCoolLibrary__Group_6_3__0__Impl_in_rule__BCoolLibrary__Group_6_3__02122);
            rule__BCoolLibrary__Group_6_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BCoolLibrary__Group_6_3__1_in_rule__BCoolLibrary__Group_6_3__02125);
            rule__BCoolLibrary__Group_6_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BCoolLibrary__Group_6_3__0"


    // $ANTLR start "rule__BCoolLibrary__Group_6_3__0__Impl"
    // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1106:1: rule__BCoolLibrary__Group_6_3__0__Impl : ( ',' ) ;
    public final void rule__BCoolLibrary__Group_6_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1110:1: ( ( ',' ) )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1111:1: ( ',' )
            {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1111:1: ( ',' )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1112:1: ','
            {
             before(grammarAccess.getBCoolLibraryAccess().getCommaKeyword_6_3_0()); 
            match(input,15,FOLLOW_15_in_rule__BCoolLibrary__Group_6_3__0__Impl2153); 
             after(grammarAccess.getBCoolLibraryAccess().getCommaKeyword_6_3_0()); 

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
    // $ANTLR end "rule__BCoolLibrary__Group_6_3__0__Impl"


    // $ANTLR start "rule__BCoolLibrary__Group_6_3__1"
    // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1125:1: rule__BCoolLibrary__Group_6_3__1 : rule__BCoolLibrary__Group_6_3__1__Impl ;
    public final void rule__BCoolLibrary__Group_6_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1129:1: ( rule__BCoolLibrary__Group_6_3__1__Impl )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1130:2: rule__BCoolLibrary__Group_6_3__1__Impl
            {
            pushFollow(FOLLOW_rule__BCoolLibrary__Group_6_3__1__Impl_in_rule__BCoolLibrary__Group_6_3__12184);
            rule__BCoolLibrary__Group_6_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BCoolLibrary__Group_6_3__1"


    // $ANTLR start "rule__BCoolLibrary__Group_6_3__1__Impl"
    // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1136:1: rule__BCoolLibrary__Group_6_3__1__Impl : ( ( rule__BCoolLibrary__RelationDeclarationsAssignment_6_3_1 ) ) ;
    public final void rule__BCoolLibrary__Group_6_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1140:1: ( ( ( rule__BCoolLibrary__RelationDeclarationsAssignment_6_3_1 ) ) )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1141:1: ( ( rule__BCoolLibrary__RelationDeclarationsAssignment_6_3_1 ) )
            {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1141:1: ( ( rule__BCoolLibrary__RelationDeclarationsAssignment_6_3_1 ) )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1142:1: ( rule__BCoolLibrary__RelationDeclarationsAssignment_6_3_1 )
            {
             before(grammarAccess.getBCoolLibraryAccess().getRelationDeclarationsAssignment_6_3_1()); 
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1143:1: ( rule__BCoolLibrary__RelationDeclarationsAssignment_6_3_1 )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1143:2: rule__BCoolLibrary__RelationDeclarationsAssignment_6_3_1
            {
            pushFollow(FOLLOW_rule__BCoolLibrary__RelationDeclarationsAssignment_6_3_1_in_rule__BCoolLibrary__Group_6_3__1__Impl2211);
            rule__BCoolLibrary__RelationDeclarationsAssignment_6_3_1();

            state._fsp--;


            }

             after(grammarAccess.getBCoolLibraryAccess().getRelationDeclarationsAssignment_6_3_1()); 

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
    // $ANTLR end "rule__BCoolLibrary__Group_6_3__1__Impl"


    // $ANTLR start "rule__BCoolLibrary__Group_7__0"
    // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1157:1: rule__BCoolLibrary__Group_7__0 : rule__BCoolLibrary__Group_7__0__Impl rule__BCoolLibrary__Group_7__1 ;
    public final void rule__BCoolLibrary__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1161:1: ( rule__BCoolLibrary__Group_7__0__Impl rule__BCoolLibrary__Group_7__1 )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1162:2: rule__BCoolLibrary__Group_7__0__Impl rule__BCoolLibrary__Group_7__1
            {
            pushFollow(FOLLOW_rule__BCoolLibrary__Group_7__0__Impl_in_rule__BCoolLibrary__Group_7__02245);
            rule__BCoolLibrary__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BCoolLibrary__Group_7__1_in_rule__BCoolLibrary__Group_7__02248);
            rule__BCoolLibrary__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BCoolLibrary__Group_7__0"


    // $ANTLR start "rule__BCoolLibrary__Group_7__0__Impl"
    // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1169:1: rule__BCoolLibrary__Group_7__0__Impl : ( 'expressionDeclarations' ) ;
    public final void rule__BCoolLibrary__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1173:1: ( ( 'expressionDeclarations' ) )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1174:1: ( 'expressionDeclarations' )
            {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1174:1: ( 'expressionDeclarations' )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1175:1: 'expressionDeclarations'
            {
             before(grammarAccess.getBCoolLibraryAccess().getExpressionDeclarationsKeyword_7_0()); 
            match(input,18,FOLLOW_18_in_rule__BCoolLibrary__Group_7__0__Impl2276); 
             after(grammarAccess.getBCoolLibraryAccess().getExpressionDeclarationsKeyword_7_0()); 

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
    // $ANTLR end "rule__BCoolLibrary__Group_7__0__Impl"


    // $ANTLR start "rule__BCoolLibrary__Group_7__1"
    // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1188:1: rule__BCoolLibrary__Group_7__1 : rule__BCoolLibrary__Group_7__1__Impl rule__BCoolLibrary__Group_7__2 ;
    public final void rule__BCoolLibrary__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1192:1: ( rule__BCoolLibrary__Group_7__1__Impl rule__BCoolLibrary__Group_7__2 )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1193:2: rule__BCoolLibrary__Group_7__1__Impl rule__BCoolLibrary__Group_7__2
            {
            pushFollow(FOLLOW_rule__BCoolLibrary__Group_7__1__Impl_in_rule__BCoolLibrary__Group_7__12307);
            rule__BCoolLibrary__Group_7__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BCoolLibrary__Group_7__2_in_rule__BCoolLibrary__Group_7__12310);
            rule__BCoolLibrary__Group_7__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BCoolLibrary__Group_7__1"


    // $ANTLR start "rule__BCoolLibrary__Group_7__1__Impl"
    // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1200:1: rule__BCoolLibrary__Group_7__1__Impl : ( '{' ) ;
    public final void rule__BCoolLibrary__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1204:1: ( ( '{' ) )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1205:1: ( '{' )
            {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1205:1: ( '{' )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1206:1: '{'
            {
             before(grammarAccess.getBCoolLibraryAccess().getLeftCurlyBracketKeyword_7_1()); 
            match(input,12,FOLLOW_12_in_rule__BCoolLibrary__Group_7__1__Impl2338); 
             after(grammarAccess.getBCoolLibraryAccess().getLeftCurlyBracketKeyword_7_1()); 

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
    // $ANTLR end "rule__BCoolLibrary__Group_7__1__Impl"


    // $ANTLR start "rule__BCoolLibrary__Group_7__2"
    // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1219:1: rule__BCoolLibrary__Group_7__2 : rule__BCoolLibrary__Group_7__2__Impl rule__BCoolLibrary__Group_7__3 ;
    public final void rule__BCoolLibrary__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1223:1: ( rule__BCoolLibrary__Group_7__2__Impl rule__BCoolLibrary__Group_7__3 )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1224:2: rule__BCoolLibrary__Group_7__2__Impl rule__BCoolLibrary__Group_7__3
            {
            pushFollow(FOLLOW_rule__BCoolLibrary__Group_7__2__Impl_in_rule__BCoolLibrary__Group_7__22369);
            rule__BCoolLibrary__Group_7__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BCoolLibrary__Group_7__3_in_rule__BCoolLibrary__Group_7__22372);
            rule__BCoolLibrary__Group_7__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BCoolLibrary__Group_7__2"


    // $ANTLR start "rule__BCoolLibrary__Group_7__2__Impl"
    // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1231:1: rule__BCoolLibrary__Group_7__2__Impl : ( ( rule__BCoolLibrary__ExpressionDeclarationsAssignment_7_2 ) ) ;
    public final void rule__BCoolLibrary__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1235:1: ( ( ( rule__BCoolLibrary__ExpressionDeclarationsAssignment_7_2 ) ) )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1236:1: ( ( rule__BCoolLibrary__ExpressionDeclarationsAssignment_7_2 ) )
            {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1236:1: ( ( rule__BCoolLibrary__ExpressionDeclarationsAssignment_7_2 ) )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1237:1: ( rule__BCoolLibrary__ExpressionDeclarationsAssignment_7_2 )
            {
             before(grammarAccess.getBCoolLibraryAccess().getExpressionDeclarationsAssignment_7_2()); 
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1238:1: ( rule__BCoolLibrary__ExpressionDeclarationsAssignment_7_2 )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1238:2: rule__BCoolLibrary__ExpressionDeclarationsAssignment_7_2
            {
            pushFollow(FOLLOW_rule__BCoolLibrary__ExpressionDeclarationsAssignment_7_2_in_rule__BCoolLibrary__Group_7__2__Impl2399);
            rule__BCoolLibrary__ExpressionDeclarationsAssignment_7_2();

            state._fsp--;


            }

             after(grammarAccess.getBCoolLibraryAccess().getExpressionDeclarationsAssignment_7_2()); 

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
    // $ANTLR end "rule__BCoolLibrary__Group_7__2__Impl"


    // $ANTLR start "rule__BCoolLibrary__Group_7__3"
    // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1248:1: rule__BCoolLibrary__Group_7__3 : rule__BCoolLibrary__Group_7__3__Impl rule__BCoolLibrary__Group_7__4 ;
    public final void rule__BCoolLibrary__Group_7__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1252:1: ( rule__BCoolLibrary__Group_7__3__Impl rule__BCoolLibrary__Group_7__4 )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1253:2: rule__BCoolLibrary__Group_7__3__Impl rule__BCoolLibrary__Group_7__4
            {
            pushFollow(FOLLOW_rule__BCoolLibrary__Group_7__3__Impl_in_rule__BCoolLibrary__Group_7__32429);
            rule__BCoolLibrary__Group_7__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BCoolLibrary__Group_7__4_in_rule__BCoolLibrary__Group_7__32432);
            rule__BCoolLibrary__Group_7__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BCoolLibrary__Group_7__3"


    // $ANTLR start "rule__BCoolLibrary__Group_7__3__Impl"
    // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1260:1: rule__BCoolLibrary__Group_7__3__Impl : ( ( rule__BCoolLibrary__Group_7_3__0 )* ) ;
    public final void rule__BCoolLibrary__Group_7__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1264:1: ( ( ( rule__BCoolLibrary__Group_7_3__0 )* ) )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1265:1: ( ( rule__BCoolLibrary__Group_7_3__0 )* )
            {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1265:1: ( ( rule__BCoolLibrary__Group_7_3__0 )* )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1266:1: ( rule__BCoolLibrary__Group_7_3__0 )*
            {
             before(grammarAccess.getBCoolLibraryAccess().getGroup_7_3()); 
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1267:1: ( rule__BCoolLibrary__Group_7_3__0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==15) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1267:2: rule__BCoolLibrary__Group_7_3__0
            	    {
            	    pushFollow(FOLLOW_rule__BCoolLibrary__Group_7_3__0_in_rule__BCoolLibrary__Group_7__3__Impl2459);
            	    rule__BCoolLibrary__Group_7_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getBCoolLibraryAccess().getGroup_7_3()); 

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
    // $ANTLR end "rule__BCoolLibrary__Group_7__3__Impl"


    // $ANTLR start "rule__BCoolLibrary__Group_7__4"
    // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1277:1: rule__BCoolLibrary__Group_7__4 : rule__BCoolLibrary__Group_7__4__Impl ;
    public final void rule__BCoolLibrary__Group_7__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1281:1: ( rule__BCoolLibrary__Group_7__4__Impl )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1282:2: rule__BCoolLibrary__Group_7__4__Impl
            {
            pushFollow(FOLLOW_rule__BCoolLibrary__Group_7__4__Impl_in_rule__BCoolLibrary__Group_7__42490);
            rule__BCoolLibrary__Group_7__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BCoolLibrary__Group_7__4"


    // $ANTLR start "rule__BCoolLibrary__Group_7__4__Impl"
    // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1288:1: rule__BCoolLibrary__Group_7__4__Impl : ( '}' ) ;
    public final void rule__BCoolLibrary__Group_7__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1292:1: ( ( '}' ) )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1293:1: ( '}' )
            {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1293:1: ( '}' )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1294:1: '}'
            {
             before(grammarAccess.getBCoolLibraryAccess().getRightCurlyBracketKeyword_7_4()); 
            match(input,13,FOLLOW_13_in_rule__BCoolLibrary__Group_7__4__Impl2518); 
             after(grammarAccess.getBCoolLibraryAccess().getRightCurlyBracketKeyword_7_4()); 

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
    // $ANTLR end "rule__BCoolLibrary__Group_7__4__Impl"


    // $ANTLR start "rule__BCoolLibrary__Group_7_3__0"
    // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1317:1: rule__BCoolLibrary__Group_7_3__0 : rule__BCoolLibrary__Group_7_3__0__Impl rule__BCoolLibrary__Group_7_3__1 ;
    public final void rule__BCoolLibrary__Group_7_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1321:1: ( rule__BCoolLibrary__Group_7_3__0__Impl rule__BCoolLibrary__Group_7_3__1 )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1322:2: rule__BCoolLibrary__Group_7_3__0__Impl rule__BCoolLibrary__Group_7_3__1
            {
            pushFollow(FOLLOW_rule__BCoolLibrary__Group_7_3__0__Impl_in_rule__BCoolLibrary__Group_7_3__02559);
            rule__BCoolLibrary__Group_7_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BCoolLibrary__Group_7_3__1_in_rule__BCoolLibrary__Group_7_3__02562);
            rule__BCoolLibrary__Group_7_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BCoolLibrary__Group_7_3__0"


    // $ANTLR start "rule__BCoolLibrary__Group_7_3__0__Impl"
    // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1329:1: rule__BCoolLibrary__Group_7_3__0__Impl : ( ',' ) ;
    public final void rule__BCoolLibrary__Group_7_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1333:1: ( ( ',' ) )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1334:1: ( ',' )
            {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1334:1: ( ',' )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1335:1: ','
            {
             before(grammarAccess.getBCoolLibraryAccess().getCommaKeyword_7_3_0()); 
            match(input,15,FOLLOW_15_in_rule__BCoolLibrary__Group_7_3__0__Impl2590); 
             after(grammarAccess.getBCoolLibraryAccess().getCommaKeyword_7_3_0()); 

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
    // $ANTLR end "rule__BCoolLibrary__Group_7_3__0__Impl"


    // $ANTLR start "rule__BCoolLibrary__Group_7_3__1"
    // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1348:1: rule__BCoolLibrary__Group_7_3__1 : rule__BCoolLibrary__Group_7_3__1__Impl ;
    public final void rule__BCoolLibrary__Group_7_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1352:1: ( rule__BCoolLibrary__Group_7_3__1__Impl )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1353:2: rule__BCoolLibrary__Group_7_3__1__Impl
            {
            pushFollow(FOLLOW_rule__BCoolLibrary__Group_7_3__1__Impl_in_rule__BCoolLibrary__Group_7_3__12621);
            rule__BCoolLibrary__Group_7_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BCoolLibrary__Group_7_3__1"


    // $ANTLR start "rule__BCoolLibrary__Group_7_3__1__Impl"
    // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1359:1: rule__BCoolLibrary__Group_7_3__1__Impl : ( ( rule__BCoolLibrary__ExpressionDeclarationsAssignment_7_3_1 ) ) ;
    public final void rule__BCoolLibrary__Group_7_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1363:1: ( ( ( rule__BCoolLibrary__ExpressionDeclarationsAssignment_7_3_1 ) ) )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1364:1: ( ( rule__BCoolLibrary__ExpressionDeclarationsAssignment_7_3_1 ) )
            {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1364:1: ( ( rule__BCoolLibrary__ExpressionDeclarationsAssignment_7_3_1 ) )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1365:1: ( rule__BCoolLibrary__ExpressionDeclarationsAssignment_7_3_1 )
            {
             before(grammarAccess.getBCoolLibraryAccess().getExpressionDeclarationsAssignment_7_3_1()); 
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1366:1: ( rule__BCoolLibrary__ExpressionDeclarationsAssignment_7_3_1 )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1366:2: rule__BCoolLibrary__ExpressionDeclarationsAssignment_7_3_1
            {
            pushFollow(FOLLOW_rule__BCoolLibrary__ExpressionDeclarationsAssignment_7_3_1_in_rule__BCoolLibrary__Group_7_3__1__Impl2648);
            rule__BCoolLibrary__ExpressionDeclarationsAssignment_7_3_1();

            state._fsp--;


            }

             after(grammarAccess.getBCoolLibraryAccess().getExpressionDeclarationsAssignment_7_3_1()); 

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
    // $ANTLR end "rule__BCoolLibrary__Group_7_3__1__Impl"


    // $ANTLR start "rule__ExpressionDefinition__Group__0"
    // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1380:1: rule__ExpressionDefinition__Group__0 : rule__ExpressionDefinition__Group__0__Impl rule__ExpressionDefinition__Group__1 ;
    public final void rule__ExpressionDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1384:1: ( rule__ExpressionDefinition__Group__0__Impl rule__ExpressionDefinition__Group__1 )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1385:2: rule__ExpressionDefinition__Group__0__Impl rule__ExpressionDefinition__Group__1
            {
            pushFollow(FOLLOW_rule__ExpressionDefinition__Group__0__Impl_in_rule__ExpressionDefinition__Group__02682);
            rule__ExpressionDefinition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ExpressionDefinition__Group__1_in_rule__ExpressionDefinition__Group__02685);
            rule__ExpressionDefinition__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionDefinition__Group__0"


    // $ANTLR start "rule__ExpressionDefinition__Group__0__Impl"
    // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1392:1: rule__ExpressionDefinition__Group__0__Impl : ( 'ExpressionDefinition' ) ;
    public final void rule__ExpressionDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1396:1: ( ( 'ExpressionDefinition' ) )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1397:1: ( 'ExpressionDefinition' )
            {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1397:1: ( 'ExpressionDefinition' )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1398:1: 'ExpressionDefinition'
            {
             before(grammarAccess.getExpressionDefinitionAccess().getExpressionDefinitionKeyword_0()); 
            match(input,19,FOLLOW_19_in_rule__ExpressionDefinition__Group__0__Impl2713); 
             after(grammarAccess.getExpressionDefinitionAccess().getExpressionDefinitionKeyword_0()); 

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
    // $ANTLR end "rule__ExpressionDefinition__Group__0__Impl"


    // $ANTLR start "rule__ExpressionDefinition__Group__1"
    // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1411:1: rule__ExpressionDefinition__Group__1 : rule__ExpressionDefinition__Group__1__Impl rule__ExpressionDefinition__Group__2 ;
    public final void rule__ExpressionDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1415:1: ( rule__ExpressionDefinition__Group__1__Impl rule__ExpressionDefinition__Group__2 )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1416:2: rule__ExpressionDefinition__Group__1__Impl rule__ExpressionDefinition__Group__2
            {
            pushFollow(FOLLOW_rule__ExpressionDefinition__Group__1__Impl_in_rule__ExpressionDefinition__Group__12744);
            rule__ExpressionDefinition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ExpressionDefinition__Group__2_in_rule__ExpressionDefinition__Group__12747);
            rule__ExpressionDefinition__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionDefinition__Group__1"


    // $ANTLR start "rule__ExpressionDefinition__Group__1__Impl"
    // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1423:1: rule__ExpressionDefinition__Group__1__Impl : ( '{' ) ;
    public final void rule__ExpressionDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1427:1: ( ( '{' ) )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1428:1: ( '{' )
            {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1428:1: ( '{' )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1429:1: '{'
            {
             before(grammarAccess.getExpressionDefinitionAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,12,FOLLOW_12_in_rule__ExpressionDefinition__Group__1__Impl2775); 
             after(grammarAccess.getExpressionDefinitionAccess().getLeftCurlyBracketKeyword_1()); 

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
    // $ANTLR end "rule__ExpressionDefinition__Group__1__Impl"


    // $ANTLR start "rule__ExpressionDefinition__Group__2"
    // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1442:1: rule__ExpressionDefinition__Group__2 : rule__ExpressionDefinition__Group__2__Impl rule__ExpressionDefinition__Group__3 ;
    public final void rule__ExpressionDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1446:1: ( rule__ExpressionDefinition__Group__2__Impl rule__ExpressionDefinition__Group__3 )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1447:2: rule__ExpressionDefinition__Group__2__Impl rule__ExpressionDefinition__Group__3
            {
            pushFollow(FOLLOW_rule__ExpressionDefinition__Group__2__Impl_in_rule__ExpressionDefinition__Group__22806);
            rule__ExpressionDefinition__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ExpressionDefinition__Group__3_in_rule__ExpressionDefinition__Group__22809);
            rule__ExpressionDefinition__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionDefinition__Group__2"


    // $ANTLR start "rule__ExpressionDefinition__Group__2__Impl"
    // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1454:1: rule__ExpressionDefinition__Group__2__Impl : ( 'definition' ) ;
    public final void rule__ExpressionDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1458:1: ( ( 'definition' ) )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1459:1: ( 'definition' )
            {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1459:1: ( 'definition' )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1460:1: 'definition'
            {
             before(grammarAccess.getExpressionDefinitionAccess().getDefinitionKeyword_2()); 
            match(input,20,FOLLOW_20_in_rule__ExpressionDefinition__Group__2__Impl2837); 
             after(grammarAccess.getExpressionDefinitionAccess().getDefinitionKeyword_2()); 

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
    // $ANTLR end "rule__ExpressionDefinition__Group__2__Impl"


    // $ANTLR start "rule__ExpressionDefinition__Group__3"
    // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1473:1: rule__ExpressionDefinition__Group__3 : rule__ExpressionDefinition__Group__3__Impl rule__ExpressionDefinition__Group__4 ;
    public final void rule__ExpressionDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1477:1: ( rule__ExpressionDefinition__Group__3__Impl rule__ExpressionDefinition__Group__4 )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1478:2: rule__ExpressionDefinition__Group__3__Impl rule__ExpressionDefinition__Group__4
            {
            pushFollow(FOLLOW_rule__ExpressionDefinition__Group__3__Impl_in_rule__ExpressionDefinition__Group__32868);
            rule__ExpressionDefinition__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ExpressionDefinition__Group__4_in_rule__ExpressionDefinition__Group__32871);
            rule__ExpressionDefinition__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionDefinition__Group__3"


    // $ANTLR start "rule__ExpressionDefinition__Group__3__Impl"
    // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1485:1: rule__ExpressionDefinition__Group__3__Impl : ( ( rule__ExpressionDefinition__DefinitionAssignment_3 ) ) ;
    public final void rule__ExpressionDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1489:1: ( ( ( rule__ExpressionDefinition__DefinitionAssignment_3 ) ) )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1490:1: ( ( rule__ExpressionDefinition__DefinitionAssignment_3 ) )
            {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1490:1: ( ( rule__ExpressionDefinition__DefinitionAssignment_3 ) )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1491:1: ( rule__ExpressionDefinition__DefinitionAssignment_3 )
            {
             before(grammarAccess.getExpressionDefinitionAccess().getDefinitionAssignment_3()); 
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1492:1: ( rule__ExpressionDefinition__DefinitionAssignment_3 )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1492:2: rule__ExpressionDefinition__DefinitionAssignment_3
            {
            pushFollow(FOLLOW_rule__ExpressionDefinition__DefinitionAssignment_3_in_rule__ExpressionDefinition__Group__3__Impl2898);
            rule__ExpressionDefinition__DefinitionAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getExpressionDefinitionAccess().getDefinitionAssignment_3()); 

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
    // $ANTLR end "rule__ExpressionDefinition__Group__3__Impl"


    // $ANTLR start "rule__ExpressionDefinition__Group__4"
    // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1502:1: rule__ExpressionDefinition__Group__4 : rule__ExpressionDefinition__Group__4__Impl ;
    public final void rule__ExpressionDefinition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1506:1: ( rule__ExpressionDefinition__Group__4__Impl )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1507:2: rule__ExpressionDefinition__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__ExpressionDefinition__Group__4__Impl_in_rule__ExpressionDefinition__Group__42928);
            rule__ExpressionDefinition__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionDefinition__Group__4"


    // $ANTLR start "rule__ExpressionDefinition__Group__4__Impl"
    // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1513:1: rule__ExpressionDefinition__Group__4__Impl : ( '}' ) ;
    public final void rule__ExpressionDefinition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1517:1: ( ( '}' ) )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1518:1: ( '}' )
            {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1518:1: ( '}' )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1519:1: '}'
            {
             before(grammarAccess.getExpressionDefinitionAccess().getRightCurlyBracketKeyword_4()); 
            match(input,13,FOLLOW_13_in_rule__ExpressionDefinition__Group__4__Impl2956); 
             after(grammarAccess.getExpressionDefinitionAccess().getRightCurlyBracketKeyword_4()); 

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
    // $ANTLR end "rule__ExpressionDefinition__Group__4__Impl"


    // $ANTLR start "rule__RelationDefinition__Group__0"
    // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1542:1: rule__RelationDefinition__Group__0 : rule__RelationDefinition__Group__0__Impl rule__RelationDefinition__Group__1 ;
    public final void rule__RelationDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1546:1: ( rule__RelationDefinition__Group__0__Impl rule__RelationDefinition__Group__1 )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1547:2: rule__RelationDefinition__Group__0__Impl rule__RelationDefinition__Group__1
            {
            pushFollow(FOLLOW_rule__RelationDefinition__Group__0__Impl_in_rule__RelationDefinition__Group__02997);
            rule__RelationDefinition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RelationDefinition__Group__1_in_rule__RelationDefinition__Group__03000);
            rule__RelationDefinition__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelationDefinition__Group__0"


    // $ANTLR start "rule__RelationDefinition__Group__0__Impl"
    // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1554:1: rule__RelationDefinition__Group__0__Impl : ( 'RelationDefinition' ) ;
    public final void rule__RelationDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1558:1: ( ( 'RelationDefinition' ) )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1559:1: ( 'RelationDefinition' )
            {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1559:1: ( 'RelationDefinition' )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1560:1: 'RelationDefinition'
            {
             before(grammarAccess.getRelationDefinitionAccess().getRelationDefinitionKeyword_0()); 
            match(input,21,FOLLOW_21_in_rule__RelationDefinition__Group__0__Impl3028); 
             after(grammarAccess.getRelationDefinitionAccess().getRelationDefinitionKeyword_0()); 

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
    // $ANTLR end "rule__RelationDefinition__Group__0__Impl"


    // $ANTLR start "rule__RelationDefinition__Group__1"
    // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1573:1: rule__RelationDefinition__Group__1 : rule__RelationDefinition__Group__1__Impl rule__RelationDefinition__Group__2 ;
    public final void rule__RelationDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1577:1: ( rule__RelationDefinition__Group__1__Impl rule__RelationDefinition__Group__2 )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1578:2: rule__RelationDefinition__Group__1__Impl rule__RelationDefinition__Group__2
            {
            pushFollow(FOLLOW_rule__RelationDefinition__Group__1__Impl_in_rule__RelationDefinition__Group__13059);
            rule__RelationDefinition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RelationDefinition__Group__2_in_rule__RelationDefinition__Group__13062);
            rule__RelationDefinition__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelationDefinition__Group__1"


    // $ANTLR start "rule__RelationDefinition__Group__1__Impl"
    // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1585:1: rule__RelationDefinition__Group__1__Impl : ( '{' ) ;
    public final void rule__RelationDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1589:1: ( ( '{' ) )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1590:1: ( '{' )
            {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1590:1: ( '{' )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1591:1: '{'
            {
             before(grammarAccess.getRelationDefinitionAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,12,FOLLOW_12_in_rule__RelationDefinition__Group__1__Impl3090); 
             after(grammarAccess.getRelationDefinitionAccess().getLeftCurlyBracketKeyword_1()); 

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
    // $ANTLR end "rule__RelationDefinition__Group__1__Impl"


    // $ANTLR start "rule__RelationDefinition__Group__2"
    // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1604:1: rule__RelationDefinition__Group__2 : rule__RelationDefinition__Group__2__Impl rule__RelationDefinition__Group__3 ;
    public final void rule__RelationDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1608:1: ( rule__RelationDefinition__Group__2__Impl rule__RelationDefinition__Group__3 )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1609:2: rule__RelationDefinition__Group__2__Impl rule__RelationDefinition__Group__3
            {
            pushFollow(FOLLOW_rule__RelationDefinition__Group__2__Impl_in_rule__RelationDefinition__Group__23121);
            rule__RelationDefinition__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RelationDefinition__Group__3_in_rule__RelationDefinition__Group__23124);
            rule__RelationDefinition__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelationDefinition__Group__2"


    // $ANTLR start "rule__RelationDefinition__Group__2__Impl"
    // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1616:1: rule__RelationDefinition__Group__2__Impl : ( 'definition' ) ;
    public final void rule__RelationDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1620:1: ( ( 'definition' ) )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1621:1: ( 'definition' )
            {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1621:1: ( 'definition' )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1622:1: 'definition'
            {
             before(grammarAccess.getRelationDefinitionAccess().getDefinitionKeyword_2()); 
            match(input,20,FOLLOW_20_in_rule__RelationDefinition__Group__2__Impl3152); 
             after(grammarAccess.getRelationDefinitionAccess().getDefinitionKeyword_2()); 

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
    // $ANTLR end "rule__RelationDefinition__Group__2__Impl"


    // $ANTLR start "rule__RelationDefinition__Group__3"
    // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1635:1: rule__RelationDefinition__Group__3 : rule__RelationDefinition__Group__3__Impl rule__RelationDefinition__Group__4 ;
    public final void rule__RelationDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1639:1: ( rule__RelationDefinition__Group__3__Impl rule__RelationDefinition__Group__4 )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1640:2: rule__RelationDefinition__Group__3__Impl rule__RelationDefinition__Group__4
            {
            pushFollow(FOLLOW_rule__RelationDefinition__Group__3__Impl_in_rule__RelationDefinition__Group__33183);
            rule__RelationDefinition__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RelationDefinition__Group__4_in_rule__RelationDefinition__Group__33186);
            rule__RelationDefinition__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelationDefinition__Group__3"


    // $ANTLR start "rule__RelationDefinition__Group__3__Impl"
    // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1647:1: rule__RelationDefinition__Group__3__Impl : ( ( rule__RelationDefinition__DefinitionAssignment_3 ) ) ;
    public final void rule__RelationDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1651:1: ( ( ( rule__RelationDefinition__DefinitionAssignment_3 ) ) )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1652:1: ( ( rule__RelationDefinition__DefinitionAssignment_3 ) )
            {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1652:1: ( ( rule__RelationDefinition__DefinitionAssignment_3 ) )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1653:1: ( rule__RelationDefinition__DefinitionAssignment_3 )
            {
             before(grammarAccess.getRelationDefinitionAccess().getDefinitionAssignment_3()); 
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1654:1: ( rule__RelationDefinition__DefinitionAssignment_3 )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1654:2: rule__RelationDefinition__DefinitionAssignment_3
            {
            pushFollow(FOLLOW_rule__RelationDefinition__DefinitionAssignment_3_in_rule__RelationDefinition__Group__3__Impl3213);
            rule__RelationDefinition__DefinitionAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getRelationDefinitionAccess().getDefinitionAssignment_3()); 

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
    // $ANTLR end "rule__RelationDefinition__Group__3__Impl"


    // $ANTLR start "rule__RelationDefinition__Group__4"
    // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1664:1: rule__RelationDefinition__Group__4 : rule__RelationDefinition__Group__4__Impl ;
    public final void rule__RelationDefinition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1668:1: ( rule__RelationDefinition__Group__4__Impl )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1669:2: rule__RelationDefinition__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__RelationDefinition__Group__4__Impl_in_rule__RelationDefinition__Group__43243);
            rule__RelationDefinition__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelationDefinition__Group__4"


    // $ANTLR start "rule__RelationDefinition__Group__4__Impl"
    // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1675:1: rule__RelationDefinition__Group__4__Impl : ( '}' ) ;
    public final void rule__RelationDefinition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1679:1: ( ( '}' ) )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1680:1: ( '}' )
            {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1680:1: ( '}' )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1681:1: '}'
            {
             before(grammarAccess.getRelationDefinitionAccess().getRightCurlyBracketKeyword_4()); 
            match(input,13,FOLLOW_13_in_rule__RelationDefinition__Group__4__Impl3271); 
             after(grammarAccess.getRelationDefinitionAccess().getRightCurlyBracketKeyword_4()); 

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
    // $ANTLR end "rule__RelationDefinition__Group__4__Impl"


    // $ANTLR start "rule__RelationDeclaration__Group__0"
    // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1704:1: rule__RelationDeclaration__Group__0 : rule__RelationDeclaration__Group__0__Impl rule__RelationDeclaration__Group__1 ;
    public final void rule__RelationDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1708:1: ( rule__RelationDeclaration__Group__0__Impl rule__RelationDeclaration__Group__1 )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1709:2: rule__RelationDeclaration__Group__0__Impl rule__RelationDeclaration__Group__1
            {
            pushFollow(FOLLOW_rule__RelationDeclaration__Group__0__Impl_in_rule__RelationDeclaration__Group__03312);
            rule__RelationDeclaration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RelationDeclaration__Group__1_in_rule__RelationDeclaration__Group__03315);
            rule__RelationDeclaration__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelationDeclaration__Group__0"


    // $ANTLR start "rule__RelationDeclaration__Group__0__Impl"
    // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1716:1: rule__RelationDeclaration__Group__0__Impl : ( () ) ;
    public final void rule__RelationDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1720:1: ( ( () ) )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1721:1: ( () )
            {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1721:1: ( () )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1722:1: ()
            {
             before(grammarAccess.getRelationDeclarationAccess().getRelationDeclarationAction_0()); 
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1723:1: ()
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1725:1: 
            {
            }

             after(grammarAccess.getRelationDeclarationAccess().getRelationDeclarationAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelationDeclaration__Group__0__Impl"


    // $ANTLR start "rule__RelationDeclaration__Group__1"
    // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1735:1: rule__RelationDeclaration__Group__1 : rule__RelationDeclaration__Group__1__Impl rule__RelationDeclaration__Group__2 ;
    public final void rule__RelationDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1739:1: ( rule__RelationDeclaration__Group__1__Impl rule__RelationDeclaration__Group__2 )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1740:2: rule__RelationDeclaration__Group__1__Impl rule__RelationDeclaration__Group__2
            {
            pushFollow(FOLLOW_rule__RelationDeclaration__Group__1__Impl_in_rule__RelationDeclaration__Group__13373);
            rule__RelationDeclaration__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RelationDeclaration__Group__2_in_rule__RelationDeclaration__Group__13376);
            rule__RelationDeclaration__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelationDeclaration__Group__1"


    // $ANTLR start "rule__RelationDeclaration__Group__1__Impl"
    // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1747:1: rule__RelationDeclaration__Group__1__Impl : ( 'RelationDeclaration' ) ;
    public final void rule__RelationDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1751:1: ( ( 'RelationDeclaration' ) )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1752:1: ( 'RelationDeclaration' )
            {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1752:1: ( 'RelationDeclaration' )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1753:1: 'RelationDeclaration'
            {
             before(grammarAccess.getRelationDeclarationAccess().getRelationDeclarationKeyword_1()); 
            match(input,22,FOLLOW_22_in_rule__RelationDeclaration__Group__1__Impl3404); 
             after(grammarAccess.getRelationDeclarationAccess().getRelationDeclarationKeyword_1()); 

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
    // $ANTLR end "rule__RelationDeclaration__Group__1__Impl"


    // $ANTLR start "rule__RelationDeclaration__Group__2"
    // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1766:1: rule__RelationDeclaration__Group__2 : rule__RelationDeclaration__Group__2__Impl rule__RelationDeclaration__Group__3 ;
    public final void rule__RelationDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1770:1: ( rule__RelationDeclaration__Group__2__Impl rule__RelationDeclaration__Group__3 )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1771:2: rule__RelationDeclaration__Group__2__Impl rule__RelationDeclaration__Group__3
            {
            pushFollow(FOLLOW_rule__RelationDeclaration__Group__2__Impl_in_rule__RelationDeclaration__Group__23435);
            rule__RelationDeclaration__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RelationDeclaration__Group__3_in_rule__RelationDeclaration__Group__23438);
            rule__RelationDeclaration__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelationDeclaration__Group__2"


    // $ANTLR start "rule__RelationDeclaration__Group__2__Impl"
    // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1778:1: rule__RelationDeclaration__Group__2__Impl : ( ( rule__RelationDeclaration__NameAssignment_2 ) ) ;
    public final void rule__RelationDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1782:1: ( ( ( rule__RelationDeclaration__NameAssignment_2 ) ) )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1783:1: ( ( rule__RelationDeclaration__NameAssignment_2 ) )
            {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1783:1: ( ( rule__RelationDeclaration__NameAssignment_2 ) )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1784:1: ( rule__RelationDeclaration__NameAssignment_2 )
            {
             before(grammarAccess.getRelationDeclarationAccess().getNameAssignment_2()); 
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1785:1: ( rule__RelationDeclaration__NameAssignment_2 )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1785:2: rule__RelationDeclaration__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__RelationDeclaration__NameAssignment_2_in_rule__RelationDeclaration__Group__2__Impl3465);
            rule__RelationDeclaration__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getRelationDeclarationAccess().getNameAssignment_2()); 

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
    // $ANTLR end "rule__RelationDeclaration__Group__2__Impl"


    // $ANTLR start "rule__RelationDeclaration__Group__3"
    // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1795:1: rule__RelationDeclaration__Group__3 : rule__RelationDeclaration__Group__3__Impl rule__RelationDeclaration__Group__4 ;
    public final void rule__RelationDeclaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1799:1: ( rule__RelationDeclaration__Group__3__Impl rule__RelationDeclaration__Group__4 )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1800:2: rule__RelationDeclaration__Group__3__Impl rule__RelationDeclaration__Group__4
            {
            pushFollow(FOLLOW_rule__RelationDeclaration__Group__3__Impl_in_rule__RelationDeclaration__Group__33495);
            rule__RelationDeclaration__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RelationDeclaration__Group__4_in_rule__RelationDeclaration__Group__33498);
            rule__RelationDeclaration__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelationDeclaration__Group__3"


    // $ANTLR start "rule__RelationDeclaration__Group__3__Impl"
    // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1807:1: rule__RelationDeclaration__Group__3__Impl : ( '{' ) ;
    public final void rule__RelationDeclaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1811:1: ( ( '{' ) )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1812:1: ( '{' )
            {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1812:1: ( '{' )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1813:1: '{'
            {
             before(grammarAccess.getRelationDeclarationAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,12,FOLLOW_12_in_rule__RelationDeclaration__Group__3__Impl3526); 
             after(grammarAccess.getRelationDeclarationAccess().getLeftCurlyBracketKeyword_3()); 

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
    // $ANTLR end "rule__RelationDeclaration__Group__3__Impl"


    // $ANTLR start "rule__RelationDeclaration__Group__4"
    // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1826:1: rule__RelationDeclaration__Group__4 : rule__RelationDeclaration__Group__4__Impl rule__RelationDeclaration__Group__5 ;
    public final void rule__RelationDeclaration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1830:1: ( rule__RelationDeclaration__Group__4__Impl rule__RelationDeclaration__Group__5 )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1831:2: rule__RelationDeclaration__Group__4__Impl rule__RelationDeclaration__Group__5
            {
            pushFollow(FOLLOW_rule__RelationDeclaration__Group__4__Impl_in_rule__RelationDeclaration__Group__43557);
            rule__RelationDeclaration__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RelationDeclaration__Group__5_in_rule__RelationDeclaration__Group__43560);
            rule__RelationDeclaration__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelationDeclaration__Group__4"


    // $ANTLR start "rule__RelationDeclaration__Group__4__Impl"
    // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1838:1: rule__RelationDeclaration__Group__4__Impl : ( ( rule__RelationDeclaration__Group_4__0 )? ) ;
    public final void rule__RelationDeclaration__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1842:1: ( ( ( rule__RelationDeclaration__Group_4__0 )? ) )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1843:1: ( ( rule__RelationDeclaration__Group_4__0 )? )
            {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1843:1: ( ( rule__RelationDeclaration__Group_4__0 )? )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1844:1: ( rule__RelationDeclaration__Group_4__0 )?
            {
             before(grammarAccess.getRelationDeclarationAccess().getGroup_4()); 
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1845:1: ( rule__RelationDeclaration__Group_4__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==23) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1845:2: rule__RelationDeclaration__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__RelationDeclaration__Group_4__0_in_rule__RelationDeclaration__Group__4__Impl3587);
                    rule__RelationDeclaration__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRelationDeclarationAccess().getGroup_4()); 

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
    // $ANTLR end "rule__RelationDeclaration__Group__4__Impl"


    // $ANTLR start "rule__RelationDeclaration__Group__5"
    // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1855:1: rule__RelationDeclaration__Group__5 : rule__RelationDeclaration__Group__5__Impl ;
    public final void rule__RelationDeclaration__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1859:1: ( rule__RelationDeclaration__Group__5__Impl )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1860:2: rule__RelationDeclaration__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__RelationDeclaration__Group__5__Impl_in_rule__RelationDeclaration__Group__53618);
            rule__RelationDeclaration__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelationDeclaration__Group__5"


    // $ANTLR start "rule__RelationDeclaration__Group__5__Impl"
    // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1866:1: rule__RelationDeclaration__Group__5__Impl : ( '}' ) ;
    public final void rule__RelationDeclaration__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1870:1: ( ( '}' ) )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1871:1: ( '}' )
            {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1871:1: ( '}' )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1872:1: '}'
            {
             before(grammarAccess.getRelationDeclarationAccess().getRightCurlyBracketKeyword_5()); 
            match(input,13,FOLLOW_13_in_rule__RelationDeclaration__Group__5__Impl3646); 
             after(grammarAccess.getRelationDeclarationAccess().getRightCurlyBracketKeyword_5()); 

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
    // $ANTLR end "rule__RelationDeclaration__Group__5__Impl"


    // $ANTLR start "rule__RelationDeclaration__Group_4__0"
    // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1897:1: rule__RelationDeclaration__Group_4__0 : rule__RelationDeclaration__Group_4__0__Impl rule__RelationDeclaration__Group_4__1 ;
    public final void rule__RelationDeclaration__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1901:1: ( rule__RelationDeclaration__Group_4__0__Impl rule__RelationDeclaration__Group_4__1 )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1902:2: rule__RelationDeclaration__Group_4__0__Impl rule__RelationDeclaration__Group_4__1
            {
            pushFollow(FOLLOW_rule__RelationDeclaration__Group_4__0__Impl_in_rule__RelationDeclaration__Group_4__03689);
            rule__RelationDeclaration__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RelationDeclaration__Group_4__1_in_rule__RelationDeclaration__Group_4__03692);
            rule__RelationDeclaration__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelationDeclaration__Group_4__0"


    // $ANTLR start "rule__RelationDeclaration__Group_4__0__Impl"
    // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1909:1: rule__RelationDeclaration__Group_4__0__Impl : ( 'formalParameters' ) ;
    public final void rule__RelationDeclaration__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1913:1: ( ( 'formalParameters' ) )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1914:1: ( 'formalParameters' )
            {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1914:1: ( 'formalParameters' )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1915:1: 'formalParameters'
            {
             before(grammarAccess.getRelationDeclarationAccess().getFormalParametersKeyword_4_0()); 
            match(input,23,FOLLOW_23_in_rule__RelationDeclaration__Group_4__0__Impl3720); 
             after(grammarAccess.getRelationDeclarationAccess().getFormalParametersKeyword_4_0()); 

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
    // $ANTLR end "rule__RelationDeclaration__Group_4__0__Impl"


    // $ANTLR start "rule__RelationDeclaration__Group_4__1"
    // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1928:1: rule__RelationDeclaration__Group_4__1 : rule__RelationDeclaration__Group_4__1__Impl rule__RelationDeclaration__Group_4__2 ;
    public final void rule__RelationDeclaration__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1932:1: ( rule__RelationDeclaration__Group_4__1__Impl rule__RelationDeclaration__Group_4__2 )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1933:2: rule__RelationDeclaration__Group_4__1__Impl rule__RelationDeclaration__Group_4__2
            {
            pushFollow(FOLLOW_rule__RelationDeclaration__Group_4__1__Impl_in_rule__RelationDeclaration__Group_4__13751);
            rule__RelationDeclaration__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RelationDeclaration__Group_4__2_in_rule__RelationDeclaration__Group_4__13754);
            rule__RelationDeclaration__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelationDeclaration__Group_4__1"


    // $ANTLR start "rule__RelationDeclaration__Group_4__1__Impl"
    // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1940:1: rule__RelationDeclaration__Group_4__1__Impl : ( '{' ) ;
    public final void rule__RelationDeclaration__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1944:1: ( ( '{' ) )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1945:1: ( '{' )
            {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1945:1: ( '{' )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1946:1: '{'
            {
             before(grammarAccess.getRelationDeclarationAccess().getLeftCurlyBracketKeyword_4_1()); 
            match(input,12,FOLLOW_12_in_rule__RelationDeclaration__Group_4__1__Impl3782); 
             after(grammarAccess.getRelationDeclarationAccess().getLeftCurlyBracketKeyword_4_1()); 

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
    // $ANTLR end "rule__RelationDeclaration__Group_4__1__Impl"


    // $ANTLR start "rule__RelationDeclaration__Group_4__2"
    // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1959:1: rule__RelationDeclaration__Group_4__2 : rule__RelationDeclaration__Group_4__2__Impl rule__RelationDeclaration__Group_4__3 ;
    public final void rule__RelationDeclaration__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1963:1: ( rule__RelationDeclaration__Group_4__2__Impl rule__RelationDeclaration__Group_4__3 )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1964:2: rule__RelationDeclaration__Group_4__2__Impl rule__RelationDeclaration__Group_4__3
            {
            pushFollow(FOLLOW_rule__RelationDeclaration__Group_4__2__Impl_in_rule__RelationDeclaration__Group_4__23813);
            rule__RelationDeclaration__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RelationDeclaration__Group_4__3_in_rule__RelationDeclaration__Group_4__23816);
            rule__RelationDeclaration__Group_4__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelationDeclaration__Group_4__2"


    // $ANTLR start "rule__RelationDeclaration__Group_4__2__Impl"
    // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1971:1: rule__RelationDeclaration__Group_4__2__Impl : ( ( rule__RelationDeclaration__FormalParametersAssignment_4_2 ) ) ;
    public final void rule__RelationDeclaration__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1975:1: ( ( ( rule__RelationDeclaration__FormalParametersAssignment_4_2 ) ) )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1976:1: ( ( rule__RelationDeclaration__FormalParametersAssignment_4_2 ) )
            {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1976:1: ( ( rule__RelationDeclaration__FormalParametersAssignment_4_2 ) )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1977:1: ( rule__RelationDeclaration__FormalParametersAssignment_4_2 )
            {
             before(grammarAccess.getRelationDeclarationAccess().getFormalParametersAssignment_4_2()); 
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1978:1: ( rule__RelationDeclaration__FormalParametersAssignment_4_2 )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1978:2: rule__RelationDeclaration__FormalParametersAssignment_4_2
            {
            pushFollow(FOLLOW_rule__RelationDeclaration__FormalParametersAssignment_4_2_in_rule__RelationDeclaration__Group_4__2__Impl3843);
            rule__RelationDeclaration__FormalParametersAssignment_4_2();

            state._fsp--;


            }

             after(grammarAccess.getRelationDeclarationAccess().getFormalParametersAssignment_4_2()); 

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
    // $ANTLR end "rule__RelationDeclaration__Group_4__2__Impl"


    // $ANTLR start "rule__RelationDeclaration__Group_4__3"
    // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1988:1: rule__RelationDeclaration__Group_4__3 : rule__RelationDeclaration__Group_4__3__Impl rule__RelationDeclaration__Group_4__4 ;
    public final void rule__RelationDeclaration__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1992:1: ( rule__RelationDeclaration__Group_4__3__Impl rule__RelationDeclaration__Group_4__4 )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:1993:2: rule__RelationDeclaration__Group_4__3__Impl rule__RelationDeclaration__Group_4__4
            {
            pushFollow(FOLLOW_rule__RelationDeclaration__Group_4__3__Impl_in_rule__RelationDeclaration__Group_4__33873);
            rule__RelationDeclaration__Group_4__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RelationDeclaration__Group_4__4_in_rule__RelationDeclaration__Group_4__33876);
            rule__RelationDeclaration__Group_4__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelationDeclaration__Group_4__3"


    // $ANTLR start "rule__RelationDeclaration__Group_4__3__Impl"
    // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2000:1: rule__RelationDeclaration__Group_4__3__Impl : ( ( rule__RelationDeclaration__Group_4_3__0 )* ) ;
    public final void rule__RelationDeclaration__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2004:1: ( ( ( rule__RelationDeclaration__Group_4_3__0 )* ) )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2005:1: ( ( rule__RelationDeclaration__Group_4_3__0 )* )
            {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2005:1: ( ( rule__RelationDeclaration__Group_4_3__0 )* )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2006:1: ( rule__RelationDeclaration__Group_4_3__0 )*
            {
             before(grammarAccess.getRelationDeclarationAccess().getGroup_4_3()); 
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2007:1: ( rule__RelationDeclaration__Group_4_3__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==15) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2007:2: rule__RelationDeclaration__Group_4_3__0
            	    {
            	    pushFollow(FOLLOW_rule__RelationDeclaration__Group_4_3__0_in_rule__RelationDeclaration__Group_4__3__Impl3903);
            	    rule__RelationDeclaration__Group_4_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getRelationDeclarationAccess().getGroup_4_3()); 

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
    // $ANTLR end "rule__RelationDeclaration__Group_4__3__Impl"


    // $ANTLR start "rule__RelationDeclaration__Group_4__4"
    // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2017:1: rule__RelationDeclaration__Group_4__4 : rule__RelationDeclaration__Group_4__4__Impl ;
    public final void rule__RelationDeclaration__Group_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2021:1: ( rule__RelationDeclaration__Group_4__4__Impl )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2022:2: rule__RelationDeclaration__Group_4__4__Impl
            {
            pushFollow(FOLLOW_rule__RelationDeclaration__Group_4__4__Impl_in_rule__RelationDeclaration__Group_4__43934);
            rule__RelationDeclaration__Group_4__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelationDeclaration__Group_4__4"


    // $ANTLR start "rule__RelationDeclaration__Group_4__4__Impl"
    // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2028:1: rule__RelationDeclaration__Group_4__4__Impl : ( '}' ) ;
    public final void rule__RelationDeclaration__Group_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2032:1: ( ( '}' ) )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2033:1: ( '}' )
            {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2033:1: ( '}' )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2034:1: '}'
            {
             before(grammarAccess.getRelationDeclarationAccess().getRightCurlyBracketKeyword_4_4()); 
            match(input,13,FOLLOW_13_in_rule__RelationDeclaration__Group_4__4__Impl3962); 
             after(grammarAccess.getRelationDeclarationAccess().getRightCurlyBracketKeyword_4_4()); 

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
    // $ANTLR end "rule__RelationDeclaration__Group_4__4__Impl"


    // $ANTLR start "rule__RelationDeclaration__Group_4_3__0"
    // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2057:1: rule__RelationDeclaration__Group_4_3__0 : rule__RelationDeclaration__Group_4_3__0__Impl rule__RelationDeclaration__Group_4_3__1 ;
    public final void rule__RelationDeclaration__Group_4_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2061:1: ( rule__RelationDeclaration__Group_4_3__0__Impl rule__RelationDeclaration__Group_4_3__1 )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2062:2: rule__RelationDeclaration__Group_4_3__0__Impl rule__RelationDeclaration__Group_4_3__1
            {
            pushFollow(FOLLOW_rule__RelationDeclaration__Group_4_3__0__Impl_in_rule__RelationDeclaration__Group_4_3__04003);
            rule__RelationDeclaration__Group_4_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RelationDeclaration__Group_4_3__1_in_rule__RelationDeclaration__Group_4_3__04006);
            rule__RelationDeclaration__Group_4_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelationDeclaration__Group_4_3__0"


    // $ANTLR start "rule__RelationDeclaration__Group_4_3__0__Impl"
    // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2069:1: rule__RelationDeclaration__Group_4_3__0__Impl : ( ',' ) ;
    public final void rule__RelationDeclaration__Group_4_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2073:1: ( ( ',' ) )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2074:1: ( ',' )
            {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2074:1: ( ',' )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2075:1: ','
            {
             before(grammarAccess.getRelationDeclarationAccess().getCommaKeyword_4_3_0()); 
            match(input,15,FOLLOW_15_in_rule__RelationDeclaration__Group_4_3__0__Impl4034); 
             after(grammarAccess.getRelationDeclarationAccess().getCommaKeyword_4_3_0()); 

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
    // $ANTLR end "rule__RelationDeclaration__Group_4_3__0__Impl"


    // $ANTLR start "rule__RelationDeclaration__Group_4_3__1"
    // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2088:1: rule__RelationDeclaration__Group_4_3__1 : rule__RelationDeclaration__Group_4_3__1__Impl ;
    public final void rule__RelationDeclaration__Group_4_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2092:1: ( rule__RelationDeclaration__Group_4_3__1__Impl )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2093:2: rule__RelationDeclaration__Group_4_3__1__Impl
            {
            pushFollow(FOLLOW_rule__RelationDeclaration__Group_4_3__1__Impl_in_rule__RelationDeclaration__Group_4_3__14065);
            rule__RelationDeclaration__Group_4_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelationDeclaration__Group_4_3__1"


    // $ANTLR start "rule__RelationDeclaration__Group_4_3__1__Impl"
    // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2099:1: rule__RelationDeclaration__Group_4_3__1__Impl : ( ( rule__RelationDeclaration__FormalParametersAssignment_4_3_1 ) ) ;
    public final void rule__RelationDeclaration__Group_4_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2103:1: ( ( ( rule__RelationDeclaration__FormalParametersAssignment_4_3_1 ) ) )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2104:1: ( ( rule__RelationDeclaration__FormalParametersAssignment_4_3_1 ) )
            {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2104:1: ( ( rule__RelationDeclaration__FormalParametersAssignment_4_3_1 ) )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2105:1: ( rule__RelationDeclaration__FormalParametersAssignment_4_3_1 )
            {
             before(grammarAccess.getRelationDeclarationAccess().getFormalParametersAssignment_4_3_1()); 
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2106:1: ( rule__RelationDeclaration__FormalParametersAssignment_4_3_1 )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2106:2: rule__RelationDeclaration__FormalParametersAssignment_4_3_1
            {
            pushFollow(FOLLOW_rule__RelationDeclaration__FormalParametersAssignment_4_3_1_in_rule__RelationDeclaration__Group_4_3__1__Impl4092);
            rule__RelationDeclaration__FormalParametersAssignment_4_3_1();

            state._fsp--;


            }

             after(grammarAccess.getRelationDeclarationAccess().getFormalParametersAssignment_4_3_1()); 

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
    // $ANTLR end "rule__RelationDeclaration__Group_4_3__1__Impl"


    // $ANTLR start "rule__ExpressionDeclaration__Group__0"
    // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2120:1: rule__ExpressionDeclaration__Group__0 : rule__ExpressionDeclaration__Group__0__Impl rule__ExpressionDeclaration__Group__1 ;
    public final void rule__ExpressionDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2124:1: ( rule__ExpressionDeclaration__Group__0__Impl rule__ExpressionDeclaration__Group__1 )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2125:2: rule__ExpressionDeclaration__Group__0__Impl rule__ExpressionDeclaration__Group__1
            {
            pushFollow(FOLLOW_rule__ExpressionDeclaration__Group__0__Impl_in_rule__ExpressionDeclaration__Group__04126);
            rule__ExpressionDeclaration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ExpressionDeclaration__Group__1_in_rule__ExpressionDeclaration__Group__04129);
            rule__ExpressionDeclaration__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionDeclaration__Group__0"


    // $ANTLR start "rule__ExpressionDeclaration__Group__0__Impl"
    // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2132:1: rule__ExpressionDeclaration__Group__0__Impl : ( () ) ;
    public final void rule__ExpressionDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2136:1: ( ( () ) )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2137:1: ( () )
            {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2137:1: ( () )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2138:1: ()
            {
             before(grammarAccess.getExpressionDeclarationAccess().getExpressionDeclarationAction_0()); 
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2139:1: ()
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2141:1: 
            {
            }

             after(grammarAccess.getExpressionDeclarationAccess().getExpressionDeclarationAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionDeclaration__Group__0__Impl"


    // $ANTLR start "rule__ExpressionDeclaration__Group__1"
    // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2151:1: rule__ExpressionDeclaration__Group__1 : rule__ExpressionDeclaration__Group__1__Impl rule__ExpressionDeclaration__Group__2 ;
    public final void rule__ExpressionDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2155:1: ( rule__ExpressionDeclaration__Group__1__Impl rule__ExpressionDeclaration__Group__2 )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2156:2: rule__ExpressionDeclaration__Group__1__Impl rule__ExpressionDeclaration__Group__2
            {
            pushFollow(FOLLOW_rule__ExpressionDeclaration__Group__1__Impl_in_rule__ExpressionDeclaration__Group__14187);
            rule__ExpressionDeclaration__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ExpressionDeclaration__Group__2_in_rule__ExpressionDeclaration__Group__14190);
            rule__ExpressionDeclaration__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionDeclaration__Group__1"


    // $ANTLR start "rule__ExpressionDeclaration__Group__1__Impl"
    // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2163:1: rule__ExpressionDeclaration__Group__1__Impl : ( 'ExpressionDeclaration' ) ;
    public final void rule__ExpressionDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2167:1: ( ( 'ExpressionDeclaration' ) )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2168:1: ( 'ExpressionDeclaration' )
            {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2168:1: ( 'ExpressionDeclaration' )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2169:1: 'ExpressionDeclaration'
            {
             before(grammarAccess.getExpressionDeclarationAccess().getExpressionDeclarationKeyword_1()); 
            match(input,24,FOLLOW_24_in_rule__ExpressionDeclaration__Group__1__Impl4218); 
             after(grammarAccess.getExpressionDeclarationAccess().getExpressionDeclarationKeyword_1()); 

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
    // $ANTLR end "rule__ExpressionDeclaration__Group__1__Impl"


    // $ANTLR start "rule__ExpressionDeclaration__Group__2"
    // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2182:1: rule__ExpressionDeclaration__Group__2 : rule__ExpressionDeclaration__Group__2__Impl rule__ExpressionDeclaration__Group__3 ;
    public final void rule__ExpressionDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2186:1: ( rule__ExpressionDeclaration__Group__2__Impl rule__ExpressionDeclaration__Group__3 )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2187:2: rule__ExpressionDeclaration__Group__2__Impl rule__ExpressionDeclaration__Group__3
            {
            pushFollow(FOLLOW_rule__ExpressionDeclaration__Group__2__Impl_in_rule__ExpressionDeclaration__Group__24249);
            rule__ExpressionDeclaration__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ExpressionDeclaration__Group__3_in_rule__ExpressionDeclaration__Group__24252);
            rule__ExpressionDeclaration__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionDeclaration__Group__2"


    // $ANTLR start "rule__ExpressionDeclaration__Group__2__Impl"
    // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2194:1: rule__ExpressionDeclaration__Group__2__Impl : ( ( rule__ExpressionDeclaration__NameAssignment_2 ) ) ;
    public final void rule__ExpressionDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2198:1: ( ( ( rule__ExpressionDeclaration__NameAssignment_2 ) ) )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2199:1: ( ( rule__ExpressionDeclaration__NameAssignment_2 ) )
            {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2199:1: ( ( rule__ExpressionDeclaration__NameAssignment_2 ) )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2200:1: ( rule__ExpressionDeclaration__NameAssignment_2 )
            {
             before(grammarAccess.getExpressionDeclarationAccess().getNameAssignment_2()); 
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2201:1: ( rule__ExpressionDeclaration__NameAssignment_2 )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2201:2: rule__ExpressionDeclaration__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__ExpressionDeclaration__NameAssignment_2_in_rule__ExpressionDeclaration__Group__2__Impl4279);
            rule__ExpressionDeclaration__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getExpressionDeclarationAccess().getNameAssignment_2()); 

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
    // $ANTLR end "rule__ExpressionDeclaration__Group__2__Impl"


    // $ANTLR start "rule__ExpressionDeclaration__Group__3"
    // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2211:1: rule__ExpressionDeclaration__Group__3 : rule__ExpressionDeclaration__Group__3__Impl rule__ExpressionDeclaration__Group__4 ;
    public final void rule__ExpressionDeclaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2215:1: ( rule__ExpressionDeclaration__Group__3__Impl rule__ExpressionDeclaration__Group__4 )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2216:2: rule__ExpressionDeclaration__Group__3__Impl rule__ExpressionDeclaration__Group__4
            {
            pushFollow(FOLLOW_rule__ExpressionDeclaration__Group__3__Impl_in_rule__ExpressionDeclaration__Group__34309);
            rule__ExpressionDeclaration__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ExpressionDeclaration__Group__4_in_rule__ExpressionDeclaration__Group__34312);
            rule__ExpressionDeclaration__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionDeclaration__Group__3"


    // $ANTLR start "rule__ExpressionDeclaration__Group__3__Impl"
    // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2223:1: rule__ExpressionDeclaration__Group__3__Impl : ( '{' ) ;
    public final void rule__ExpressionDeclaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2227:1: ( ( '{' ) )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2228:1: ( '{' )
            {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2228:1: ( '{' )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2229:1: '{'
            {
             before(grammarAccess.getExpressionDeclarationAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,12,FOLLOW_12_in_rule__ExpressionDeclaration__Group__3__Impl4340); 
             after(grammarAccess.getExpressionDeclarationAccess().getLeftCurlyBracketKeyword_3()); 

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
    // $ANTLR end "rule__ExpressionDeclaration__Group__3__Impl"


    // $ANTLR start "rule__ExpressionDeclaration__Group__4"
    // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2242:1: rule__ExpressionDeclaration__Group__4 : rule__ExpressionDeclaration__Group__4__Impl rule__ExpressionDeclaration__Group__5 ;
    public final void rule__ExpressionDeclaration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2246:1: ( rule__ExpressionDeclaration__Group__4__Impl rule__ExpressionDeclaration__Group__5 )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2247:2: rule__ExpressionDeclaration__Group__4__Impl rule__ExpressionDeclaration__Group__5
            {
            pushFollow(FOLLOW_rule__ExpressionDeclaration__Group__4__Impl_in_rule__ExpressionDeclaration__Group__44371);
            rule__ExpressionDeclaration__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ExpressionDeclaration__Group__5_in_rule__ExpressionDeclaration__Group__44374);
            rule__ExpressionDeclaration__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionDeclaration__Group__4"


    // $ANTLR start "rule__ExpressionDeclaration__Group__4__Impl"
    // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2254:1: rule__ExpressionDeclaration__Group__4__Impl : ( ( rule__ExpressionDeclaration__Group_4__0 )? ) ;
    public final void rule__ExpressionDeclaration__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2258:1: ( ( ( rule__ExpressionDeclaration__Group_4__0 )? ) )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2259:1: ( ( rule__ExpressionDeclaration__Group_4__0 )? )
            {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2259:1: ( ( rule__ExpressionDeclaration__Group_4__0 )? )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2260:1: ( rule__ExpressionDeclaration__Group_4__0 )?
            {
             before(grammarAccess.getExpressionDeclarationAccess().getGroup_4()); 
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2261:1: ( rule__ExpressionDeclaration__Group_4__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==23) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2261:2: rule__ExpressionDeclaration__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__ExpressionDeclaration__Group_4__0_in_rule__ExpressionDeclaration__Group__4__Impl4401);
                    rule__ExpressionDeclaration__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getExpressionDeclarationAccess().getGroup_4()); 

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
    // $ANTLR end "rule__ExpressionDeclaration__Group__4__Impl"


    // $ANTLR start "rule__ExpressionDeclaration__Group__5"
    // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2271:1: rule__ExpressionDeclaration__Group__5 : rule__ExpressionDeclaration__Group__5__Impl ;
    public final void rule__ExpressionDeclaration__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2275:1: ( rule__ExpressionDeclaration__Group__5__Impl )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2276:2: rule__ExpressionDeclaration__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__ExpressionDeclaration__Group__5__Impl_in_rule__ExpressionDeclaration__Group__54432);
            rule__ExpressionDeclaration__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionDeclaration__Group__5"


    // $ANTLR start "rule__ExpressionDeclaration__Group__5__Impl"
    // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2282:1: rule__ExpressionDeclaration__Group__5__Impl : ( '}' ) ;
    public final void rule__ExpressionDeclaration__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2286:1: ( ( '}' ) )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2287:1: ( '}' )
            {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2287:1: ( '}' )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2288:1: '}'
            {
             before(grammarAccess.getExpressionDeclarationAccess().getRightCurlyBracketKeyword_5()); 
            match(input,13,FOLLOW_13_in_rule__ExpressionDeclaration__Group__5__Impl4460); 
             after(grammarAccess.getExpressionDeclarationAccess().getRightCurlyBracketKeyword_5()); 

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
    // $ANTLR end "rule__ExpressionDeclaration__Group__5__Impl"


    // $ANTLR start "rule__ExpressionDeclaration__Group_4__0"
    // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2313:1: rule__ExpressionDeclaration__Group_4__0 : rule__ExpressionDeclaration__Group_4__0__Impl rule__ExpressionDeclaration__Group_4__1 ;
    public final void rule__ExpressionDeclaration__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2317:1: ( rule__ExpressionDeclaration__Group_4__0__Impl rule__ExpressionDeclaration__Group_4__1 )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2318:2: rule__ExpressionDeclaration__Group_4__0__Impl rule__ExpressionDeclaration__Group_4__1
            {
            pushFollow(FOLLOW_rule__ExpressionDeclaration__Group_4__0__Impl_in_rule__ExpressionDeclaration__Group_4__04503);
            rule__ExpressionDeclaration__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ExpressionDeclaration__Group_4__1_in_rule__ExpressionDeclaration__Group_4__04506);
            rule__ExpressionDeclaration__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionDeclaration__Group_4__0"


    // $ANTLR start "rule__ExpressionDeclaration__Group_4__0__Impl"
    // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2325:1: rule__ExpressionDeclaration__Group_4__0__Impl : ( 'formalParameters' ) ;
    public final void rule__ExpressionDeclaration__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2329:1: ( ( 'formalParameters' ) )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2330:1: ( 'formalParameters' )
            {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2330:1: ( 'formalParameters' )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2331:1: 'formalParameters'
            {
             before(grammarAccess.getExpressionDeclarationAccess().getFormalParametersKeyword_4_0()); 
            match(input,23,FOLLOW_23_in_rule__ExpressionDeclaration__Group_4__0__Impl4534); 
             after(grammarAccess.getExpressionDeclarationAccess().getFormalParametersKeyword_4_0()); 

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
    // $ANTLR end "rule__ExpressionDeclaration__Group_4__0__Impl"


    // $ANTLR start "rule__ExpressionDeclaration__Group_4__1"
    // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2344:1: rule__ExpressionDeclaration__Group_4__1 : rule__ExpressionDeclaration__Group_4__1__Impl rule__ExpressionDeclaration__Group_4__2 ;
    public final void rule__ExpressionDeclaration__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2348:1: ( rule__ExpressionDeclaration__Group_4__1__Impl rule__ExpressionDeclaration__Group_4__2 )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2349:2: rule__ExpressionDeclaration__Group_4__1__Impl rule__ExpressionDeclaration__Group_4__2
            {
            pushFollow(FOLLOW_rule__ExpressionDeclaration__Group_4__1__Impl_in_rule__ExpressionDeclaration__Group_4__14565);
            rule__ExpressionDeclaration__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ExpressionDeclaration__Group_4__2_in_rule__ExpressionDeclaration__Group_4__14568);
            rule__ExpressionDeclaration__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionDeclaration__Group_4__1"


    // $ANTLR start "rule__ExpressionDeclaration__Group_4__1__Impl"
    // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2356:1: rule__ExpressionDeclaration__Group_4__1__Impl : ( '{' ) ;
    public final void rule__ExpressionDeclaration__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2360:1: ( ( '{' ) )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2361:1: ( '{' )
            {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2361:1: ( '{' )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2362:1: '{'
            {
             before(grammarAccess.getExpressionDeclarationAccess().getLeftCurlyBracketKeyword_4_1()); 
            match(input,12,FOLLOW_12_in_rule__ExpressionDeclaration__Group_4__1__Impl4596); 
             after(grammarAccess.getExpressionDeclarationAccess().getLeftCurlyBracketKeyword_4_1()); 

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
    // $ANTLR end "rule__ExpressionDeclaration__Group_4__1__Impl"


    // $ANTLR start "rule__ExpressionDeclaration__Group_4__2"
    // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2375:1: rule__ExpressionDeclaration__Group_4__2 : rule__ExpressionDeclaration__Group_4__2__Impl rule__ExpressionDeclaration__Group_4__3 ;
    public final void rule__ExpressionDeclaration__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2379:1: ( rule__ExpressionDeclaration__Group_4__2__Impl rule__ExpressionDeclaration__Group_4__3 )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2380:2: rule__ExpressionDeclaration__Group_4__2__Impl rule__ExpressionDeclaration__Group_4__3
            {
            pushFollow(FOLLOW_rule__ExpressionDeclaration__Group_4__2__Impl_in_rule__ExpressionDeclaration__Group_4__24627);
            rule__ExpressionDeclaration__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ExpressionDeclaration__Group_4__3_in_rule__ExpressionDeclaration__Group_4__24630);
            rule__ExpressionDeclaration__Group_4__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionDeclaration__Group_4__2"


    // $ANTLR start "rule__ExpressionDeclaration__Group_4__2__Impl"
    // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2387:1: rule__ExpressionDeclaration__Group_4__2__Impl : ( ( rule__ExpressionDeclaration__FormalParametersAssignment_4_2 ) ) ;
    public final void rule__ExpressionDeclaration__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2391:1: ( ( ( rule__ExpressionDeclaration__FormalParametersAssignment_4_2 ) ) )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2392:1: ( ( rule__ExpressionDeclaration__FormalParametersAssignment_4_2 ) )
            {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2392:1: ( ( rule__ExpressionDeclaration__FormalParametersAssignment_4_2 ) )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2393:1: ( rule__ExpressionDeclaration__FormalParametersAssignment_4_2 )
            {
             before(grammarAccess.getExpressionDeclarationAccess().getFormalParametersAssignment_4_2()); 
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2394:1: ( rule__ExpressionDeclaration__FormalParametersAssignment_4_2 )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2394:2: rule__ExpressionDeclaration__FormalParametersAssignment_4_2
            {
            pushFollow(FOLLOW_rule__ExpressionDeclaration__FormalParametersAssignment_4_2_in_rule__ExpressionDeclaration__Group_4__2__Impl4657);
            rule__ExpressionDeclaration__FormalParametersAssignment_4_2();

            state._fsp--;


            }

             after(grammarAccess.getExpressionDeclarationAccess().getFormalParametersAssignment_4_2()); 

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
    // $ANTLR end "rule__ExpressionDeclaration__Group_4__2__Impl"


    // $ANTLR start "rule__ExpressionDeclaration__Group_4__3"
    // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2404:1: rule__ExpressionDeclaration__Group_4__3 : rule__ExpressionDeclaration__Group_4__3__Impl rule__ExpressionDeclaration__Group_4__4 ;
    public final void rule__ExpressionDeclaration__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2408:1: ( rule__ExpressionDeclaration__Group_4__3__Impl rule__ExpressionDeclaration__Group_4__4 )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2409:2: rule__ExpressionDeclaration__Group_4__3__Impl rule__ExpressionDeclaration__Group_4__4
            {
            pushFollow(FOLLOW_rule__ExpressionDeclaration__Group_4__3__Impl_in_rule__ExpressionDeclaration__Group_4__34687);
            rule__ExpressionDeclaration__Group_4__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ExpressionDeclaration__Group_4__4_in_rule__ExpressionDeclaration__Group_4__34690);
            rule__ExpressionDeclaration__Group_4__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionDeclaration__Group_4__3"


    // $ANTLR start "rule__ExpressionDeclaration__Group_4__3__Impl"
    // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2416:1: rule__ExpressionDeclaration__Group_4__3__Impl : ( ( rule__ExpressionDeclaration__Group_4_3__0 )* ) ;
    public final void rule__ExpressionDeclaration__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2420:1: ( ( ( rule__ExpressionDeclaration__Group_4_3__0 )* ) )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2421:1: ( ( rule__ExpressionDeclaration__Group_4_3__0 )* )
            {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2421:1: ( ( rule__ExpressionDeclaration__Group_4_3__0 )* )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2422:1: ( rule__ExpressionDeclaration__Group_4_3__0 )*
            {
             before(grammarAccess.getExpressionDeclarationAccess().getGroup_4_3()); 
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2423:1: ( rule__ExpressionDeclaration__Group_4_3__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==15) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2423:2: rule__ExpressionDeclaration__Group_4_3__0
            	    {
            	    pushFollow(FOLLOW_rule__ExpressionDeclaration__Group_4_3__0_in_rule__ExpressionDeclaration__Group_4__3__Impl4717);
            	    rule__ExpressionDeclaration__Group_4_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getExpressionDeclarationAccess().getGroup_4_3()); 

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
    // $ANTLR end "rule__ExpressionDeclaration__Group_4__3__Impl"


    // $ANTLR start "rule__ExpressionDeclaration__Group_4__4"
    // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2433:1: rule__ExpressionDeclaration__Group_4__4 : rule__ExpressionDeclaration__Group_4__4__Impl ;
    public final void rule__ExpressionDeclaration__Group_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2437:1: ( rule__ExpressionDeclaration__Group_4__4__Impl )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2438:2: rule__ExpressionDeclaration__Group_4__4__Impl
            {
            pushFollow(FOLLOW_rule__ExpressionDeclaration__Group_4__4__Impl_in_rule__ExpressionDeclaration__Group_4__44748);
            rule__ExpressionDeclaration__Group_4__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionDeclaration__Group_4__4"


    // $ANTLR start "rule__ExpressionDeclaration__Group_4__4__Impl"
    // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2444:1: rule__ExpressionDeclaration__Group_4__4__Impl : ( '}' ) ;
    public final void rule__ExpressionDeclaration__Group_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2448:1: ( ( '}' ) )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2449:1: ( '}' )
            {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2449:1: ( '}' )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2450:1: '}'
            {
             before(grammarAccess.getExpressionDeclarationAccess().getRightCurlyBracketKeyword_4_4()); 
            match(input,13,FOLLOW_13_in_rule__ExpressionDeclaration__Group_4__4__Impl4776); 
             after(grammarAccess.getExpressionDeclarationAccess().getRightCurlyBracketKeyword_4_4()); 

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
    // $ANTLR end "rule__ExpressionDeclaration__Group_4__4__Impl"


    // $ANTLR start "rule__ExpressionDeclaration__Group_4_3__0"
    // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2473:1: rule__ExpressionDeclaration__Group_4_3__0 : rule__ExpressionDeclaration__Group_4_3__0__Impl rule__ExpressionDeclaration__Group_4_3__1 ;
    public final void rule__ExpressionDeclaration__Group_4_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2477:1: ( rule__ExpressionDeclaration__Group_4_3__0__Impl rule__ExpressionDeclaration__Group_4_3__1 )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2478:2: rule__ExpressionDeclaration__Group_4_3__0__Impl rule__ExpressionDeclaration__Group_4_3__1
            {
            pushFollow(FOLLOW_rule__ExpressionDeclaration__Group_4_3__0__Impl_in_rule__ExpressionDeclaration__Group_4_3__04817);
            rule__ExpressionDeclaration__Group_4_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ExpressionDeclaration__Group_4_3__1_in_rule__ExpressionDeclaration__Group_4_3__04820);
            rule__ExpressionDeclaration__Group_4_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionDeclaration__Group_4_3__0"


    // $ANTLR start "rule__ExpressionDeclaration__Group_4_3__0__Impl"
    // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2485:1: rule__ExpressionDeclaration__Group_4_3__0__Impl : ( ',' ) ;
    public final void rule__ExpressionDeclaration__Group_4_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2489:1: ( ( ',' ) )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2490:1: ( ',' )
            {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2490:1: ( ',' )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2491:1: ','
            {
             before(grammarAccess.getExpressionDeclarationAccess().getCommaKeyword_4_3_0()); 
            match(input,15,FOLLOW_15_in_rule__ExpressionDeclaration__Group_4_3__0__Impl4848); 
             after(grammarAccess.getExpressionDeclarationAccess().getCommaKeyword_4_3_0()); 

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
    // $ANTLR end "rule__ExpressionDeclaration__Group_4_3__0__Impl"


    // $ANTLR start "rule__ExpressionDeclaration__Group_4_3__1"
    // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2504:1: rule__ExpressionDeclaration__Group_4_3__1 : rule__ExpressionDeclaration__Group_4_3__1__Impl ;
    public final void rule__ExpressionDeclaration__Group_4_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2508:1: ( rule__ExpressionDeclaration__Group_4_3__1__Impl )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2509:2: rule__ExpressionDeclaration__Group_4_3__1__Impl
            {
            pushFollow(FOLLOW_rule__ExpressionDeclaration__Group_4_3__1__Impl_in_rule__ExpressionDeclaration__Group_4_3__14879);
            rule__ExpressionDeclaration__Group_4_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionDeclaration__Group_4_3__1"


    // $ANTLR start "rule__ExpressionDeclaration__Group_4_3__1__Impl"
    // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2515:1: rule__ExpressionDeclaration__Group_4_3__1__Impl : ( ( rule__ExpressionDeclaration__FormalParametersAssignment_4_3_1 ) ) ;
    public final void rule__ExpressionDeclaration__Group_4_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2519:1: ( ( ( rule__ExpressionDeclaration__FormalParametersAssignment_4_3_1 ) ) )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2520:1: ( ( rule__ExpressionDeclaration__FormalParametersAssignment_4_3_1 ) )
            {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2520:1: ( ( rule__ExpressionDeclaration__FormalParametersAssignment_4_3_1 ) )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2521:1: ( rule__ExpressionDeclaration__FormalParametersAssignment_4_3_1 )
            {
             before(grammarAccess.getExpressionDeclarationAccess().getFormalParametersAssignment_4_3_1()); 
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2522:1: ( rule__ExpressionDeclaration__FormalParametersAssignment_4_3_1 )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2522:2: rule__ExpressionDeclaration__FormalParametersAssignment_4_3_1
            {
            pushFollow(FOLLOW_rule__ExpressionDeclaration__FormalParametersAssignment_4_3_1_in_rule__ExpressionDeclaration__Group_4_3__1__Impl4906);
            rule__ExpressionDeclaration__FormalParametersAssignment_4_3_1();

            state._fsp--;


            }

             after(grammarAccess.getExpressionDeclarationAccess().getFormalParametersAssignment_4_3_1()); 

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
    // $ANTLR end "rule__ExpressionDeclaration__Group_4_3__1__Impl"


    // $ANTLR start "rule__BCoolLibrary__NameAssignment_2"
    // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2537:1: rule__BCoolLibrary__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__BCoolLibrary__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2541:1: ( ( RULE_ID ) )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2542:1: ( RULE_ID )
            {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2542:1: ( RULE_ID )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2543:1: RULE_ID
            {
             before(grammarAccess.getBCoolLibraryAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__BCoolLibrary__NameAssignment_24945); 
             after(grammarAccess.getBCoolLibraryAccess().getNameIDTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__BCoolLibrary__NameAssignment_2"


    // $ANTLR start "rule__BCoolLibrary__ExpressionDefinitionsAssignment_4_2"
    // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2552:1: rule__BCoolLibrary__ExpressionDefinitionsAssignment_4_2 : ( ruleExpressionDefinition ) ;
    public final void rule__BCoolLibrary__ExpressionDefinitionsAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2556:1: ( ( ruleExpressionDefinition ) )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2557:1: ( ruleExpressionDefinition )
            {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2557:1: ( ruleExpressionDefinition )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2558:1: ruleExpressionDefinition
            {
             before(grammarAccess.getBCoolLibraryAccess().getExpressionDefinitionsExpressionDefinitionParserRuleCall_4_2_0()); 
            pushFollow(FOLLOW_ruleExpressionDefinition_in_rule__BCoolLibrary__ExpressionDefinitionsAssignment_4_24976);
            ruleExpressionDefinition();

            state._fsp--;

             after(grammarAccess.getBCoolLibraryAccess().getExpressionDefinitionsExpressionDefinitionParserRuleCall_4_2_0()); 

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
    // $ANTLR end "rule__BCoolLibrary__ExpressionDefinitionsAssignment_4_2"


    // $ANTLR start "rule__BCoolLibrary__ExpressionDefinitionsAssignment_4_3_1"
    // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2567:1: rule__BCoolLibrary__ExpressionDefinitionsAssignment_4_3_1 : ( ruleExpressionDefinition ) ;
    public final void rule__BCoolLibrary__ExpressionDefinitionsAssignment_4_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2571:1: ( ( ruleExpressionDefinition ) )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2572:1: ( ruleExpressionDefinition )
            {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2572:1: ( ruleExpressionDefinition )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2573:1: ruleExpressionDefinition
            {
             before(grammarAccess.getBCoolLibraryAccess().getExpressionDefinitionsExpressionDefinitionParserRuleCall_4_3_1_0()); 
            pushFollow(FOLLOW_ruleExpressionDefinition_in_rule__BCoolLibrary__ExpressionDefinitionsAssignment_4_3_15007);
            ruleExpressionDefinition();

            state._fsp--;

             after(grammarAccess.getBCoolLibraryAccess().getExpressionDefinitionsExpressionDefinitionParserRuleCall_4_3_1_0()); 

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
    // $ANTLR end "rule__BCoolLibrary__ExpressionDefinitionsAssignment_4_3_1"


    // $ANTLR start "rule__BCoolLibrary__RelationDefinitionsAssignment_5_2"
    // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2582:1: rule__BCoolLibrary__RelationDefinitionsAssignment_5_2 : ( ruleRelationDefinition ) ;
    public final void rule__BCoolLibrary__RelationDefinitionsAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2586:1: ( ( ruleRelationDefinition ) )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2587:1: ( ruleRelationDefinition )
            {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2587:1: ( ruleRelationDefinition )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2588:1: ruleRelationDefinition
            {
             before(grammarAccess.getBCoolLibraryAccess().getRelationDefinitionsRelationDefinitionParserRuleCall_5_2_0()); 
            pushFollow(FOLLOW_ruleRelationDefinition_in_rule__BCoolLibrary__RelationDefinitionsAssignment_5_25038);
            ruleRelationDefinition();

            state._fsp--;

             after(grammarAccess.getBCoolLibraryAccess().getRelationDefinitionsRelationDefinitionParserRuleCall_5_2_0()); 

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
    // $ANTLR end "rule__BCoolLibrary__RelationDefinitionsAssignment_5_2"


    // $ANTLR start "rule__BCoolLibrary__RelationDefinitionsAssignment_5_3_1"
    // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2597:1: rule__BCoolLibrary__RelationDefinitionsAssignment_5_3_1 : ( ruleRelationDefinition ) ;
    public final void rule__BCoolLibrary__RelationDefinitionsAssignment_5_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2601:1: ( ( ruleRelationDefinition ) )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2602:1: ( ruleRelationDefinition )
            {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2602:1: ( ruleRelationDefinition )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2603:1: ruleRelationDefinition
            {
             before(grammarAccess.getBCoolLibraryAccess().getRelationDefinitionsRelationDefinitionParserRuleCall_5_3_1_0()); 
            pushFollow(FOLLOW_ruleRelationDefinition_in_rule__BCoolLibrary__RelationDefinitionsAssignment_5_3_15069);
            ruleRelationDefinition();

            state._fsp--;

             after(grammarAccess.getBCoolLibraryAccess().getRelationDefinitionsRelationDefinitionParserRuleCall_5_3_1_0()); 

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
    // $ANTLR end "rule__BCoolLibrary__RelationDefinitionsAssignment_5_3_1"


    // $ANTLR start "rule__BCoolLibrary__RelationDeclarationsAssignment_6_2"
    // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2612:1: rule__BCoolLibrary__RelationDeclarationsAssignment_6_2 : ( ruleRelationDeclaration ) ;
    public final void rule__BCoolLibrary__RelationDeclarationsAssignment_6_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2616:1: ( ( ruleRelationDeclaration ) )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2617:1: ( ruleRelationDeclaration )
            {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2617:1: ( ruleRelationDeclaration )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2618:1: ruleRelationDeclaration
            {
             before(grammarAccess.getBCoolLibraryAccess().getRelationDeclarationsRelationDeclarationParserRuleCall_6_2_0()); 
            pushFollow(FOLLOW_ruleRelationDeclaration_in_rule__BCoolLibrary__RelationDeclarationsAssignment_6_25100);
            ruleRelationDeclaration();

            state._fsp--;

             after(grammarAccess.getBCoolLibraryAccess().getRelationDeclarationsRelationDeclarationParserRuleCall_6_2_0()); 

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
    // $ANTLR end "rule__BCoolLibrary__RelationDeclarationsAssignment_6_2"


    // $ANTLR start "rule__BCoolLibrary__RelationDeclarationsAssignment_6_3_1"
    // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2627:1: rule__BCoolLibrary__RelationDeclarationsAssignment_6_3_1 : ( ruleRelationDeclaration ) ;
    public final void rule__BCoolLibrary__RelationDeclarationsAssignment_6_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2631:1: ( ( ruleRelationDeclaration ) )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2632:1: ( ruleRelationDeclaration )
            {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2632:1: ( ruleRelationDeclaration )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2633:1: ruleRelationDeclaration
            {
             before(grammarAccess.getBCoolLibraryAccess().getRelationDeclarationsRelationDeclarationParserRuleCall_6_3_1_0()); 
            pushFollow(FOLLOW_ruleRelationDeclaration_in_rule__BCoolLibrary__RelationDeclarationsAssignment_6_3_15131);
            ruleRelationDeclaration();

            state._fsp--;

             after(grammarAccess.getBCoolLibraryAccess().getRelationDeclarationsRelationDeclarationParserRuleCall_6_3_1_0()); 

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
    // $ANTLR end "rule__BCoolLibrary__RelationDeclarationsAssignment_6_3_1"


    // $ANTLR start "rule__BCoolLibrary__ExpressionDeclarationsAssignment_7_2"
    // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2642:1: rule__BCoolLibrary__ExpressionDeclarationsAssignment_7_2 : ( ruleExpressionDeclaration ) ;
    public final void rule__BCoolLibrary__ExpressionDeclarationsAssignment_7_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2646:1: ( ( ruleExpressionDeclaration ) )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2647:1: ( ruleExpressionDeclaration )
            {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2647:1: ( ruleExpressionDeclaration )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2648:1: ruleExpressionDeclaration
            {
             before(grammarAccess.getBCoolLibraryAccess().getExpressionDeclarationsExpressionDeclarationParserRuleCall_7_2_0()); 
            pushFollow(FOLLOW_ruleExpressionDeclaration_in_rule__BCoolLibrary__ExpressionDeclarationsAssignment_7_25162);
            ruleExpressionDeclaration();

            state._fsp--;

             after(grammarAccess.getBCoolLibraryAccess().getExpressionDeclarationsExpressionDeclarationParserRuleCall_7_2_0()); 

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
    // $ANTLR end "rule__BCoolLibrary__ExpressionDeclarationsAssignment_7_2"


    // $ANTLR start "rule__BCoolLibrary__ExpressionDeclarationsAssignment_7_3_1"
    // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2657:1: rule__BCoolLibrary__ExpressionDeclarationsAssignment_7_3_1 : ( ruleExpressionDeclaration ) ;
    public final void rule__BCoolLibrary__ExpressionDeclarationsAssignment_7_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2661:1: ( ( ruleExpressionDeclaration ) )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2662:1: ( ruleExpressionDeclaration )
            {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2662:1: ( ruleExpressionDeclaration )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2663:1: ruleExpressionDeclaration
            {
             before(grammarAccess.getBCoolLibraryAccess().getExpressionDeclarationsExpressionDeclarationParserRuleCall_7_3_1_0()); 
            pushFollow(FOLLOW_ruleExpressionDeclaration_in_rule__BCoolLibrary__ExpressionDeclarationsAssignment_7_3_15193);
            ruleExpressionDeclaration();

            state._fsp--;

             after(grammarAccess.getBCoolLibraryAccess().getExpressionDeclarationsExpressionDeclarationParserRuleCall_7_3_1_0()); 

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
    // $ANTLR end "rule__BCoolLibrary__ExpressionDeclarationsAssignment_7_3_1"


    // $ANTLR start "rule__ExpressionDefinition__DefinitionAssignment_3"
    // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2672:1: rule__ExpressionDefinition__DefinitionAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__ExpressionDefinition__DefinitionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2676:1: ( ( ( RULE_ID ) ) )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2677:1: ( ( RULE_ID ) )
            {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2677:1: ( ( RULE_ID ) )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2678:1: ( RULE_ID )
            {
             before(grammarAccess.getExpressionDefinitionAccess().getDefinitionExpressionDeclarationCrossReference_3_0()); 
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2679:1: ( RULE_ID )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2680:1: RULE_ID
            {
             before(grammarAccess.getExpressionDefinitionAccess().getDefinitionExpressionDeclarationIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ExpressionDefinition__DefinitionAssignment_35228); 
             after(grammarAccess.getExpressionDefinitionAccess().getDefinitionExpressionDeclarationIDTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getExpressionDefinitionAccess().getDefinitionExpressionDeclarationCrossReference_3_0()); 

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
    // $ANTLR end "rule__ExpressionDefinition__DefinitionAssignment_3"


    // $ANTLR start "rule__RelationDefinition__DefinitionAssignment_3"
    // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2691:1: rule__RelationDefinition__DefinitionAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__RelationDefinition__DefinitionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2695:1: ( ( ( RULE_ID ) ) )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2696:1: ( ( RULE_ID ) )
            {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2696:1: ( ( RULE_ID ) )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2697:1: ( RULE_ID )
            {
             before(grammarAccess.getRelationDefinitionAccess().getDefinitionRelationDeclarationCrossReference_3_0()); 
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2698:1: ( RULE_ID )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2699:1: RULE_ID
            {
             before(grammarAccess.getRelationDefinitionAccess().getDefinitionRelationDeclarationIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__RelationDefinition__DefinitionAssignment_35267); 
             after(grammarAccess.getRelationDefinitionAccess().getDefinitionRelationDeclarationIDTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getRelationDefinitionAccess().getDefinitionRelationDeclarationCrossReference_3_0()); 

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
    // $ANTLR end "rule__RelationDefinition__DefinitionAssignment_3"


    // $ANTLR start "rule__RelationDeclaration__NameAssignment_2"
    // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2710:1: rule__RelationDeclaration__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__RelationDeclaration__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2714:1: ( ( RULE_ID ) )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2715:1: ( RULE_ID )
            {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2715:1: ( RULE_ID )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2716:1: RULE_ID
            {
             before(grammarAccess.getRelationDeclarationAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__RelationDeclaration__NameAssignment_25302); 
             after(grammarAccess.getRelationDeclarationAccess().getNameIDTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__RelationDeclaration__NameAssignment_2"


    // $ANTLR start "rule__RelationDeclaration__FormalParametersAssignment_4_2"
    // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2725:1: rule__RelationDeclaration__FormalParametersAssignment_4_2 : ( ( RULE_ID ) ) ;
    public final void rule__RelationDeclaration__FormalParametersAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2729:1: ( ( ( RULE_ID ) ) )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2730:1: ( ( RULE_ID ) )
            {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2730:1: ( ( RULE_ID ) )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2731:1: ( RULE_ID )
            {
             before(grammarAccess.getRelationDeclarationAccess().getFormalParametersEObjectCrossReference_4_2_0()); 
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2732:1: ( RULE_ID )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2733:1: RULE_ID
            {
             before(grammarAccess.getRelationDeclarationAccess().getFormalParametersEObjectIDTerminalRuleCall_4_2_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__RelationDeclaration__FormalParametersAssignment_4_25337); 
             after(grammarAccess.getRelationDeclarationAccess().getFormalParametersEObjectIDTerminalRuleCall_4_2_0_1()); 

            }

             after(grammarAccess.getRelationDeclarationAccess().getFormalParametersEObjectCrossReference_4_2_0()); 

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
    // $ANTLR end "rule__RelationDeclaration__FormalParametersAssignment_4_2"


    // $ANTLR start "rule__RelationDeclaration__FormalParametersAssignment_4_3_1"
    // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2744:1: rule__RelationDeclaration__FormalParametersAssignment_4_3_1 : ( ( RULE_ID ) ) ;
    public final void rule__RelationDeclaration__FormalParametersAssignment_4_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2748:1: ( ( ( RULE_ID ) ) )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2749:1: ( ( RULE_ID ) )
            {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2749:1: ( ( RULE_ID ) )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2750:1: ( RULE_ID )
            {
             before(grammarAccess.getRelationDeclarationAccess().getFormalParametersEObjectCrossReference_4_3_1_0()); 
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2751:1: ( RULE_ID )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2752:1: RULE_ID
            {
             before(grammarAccess.getRelationDeclarationAccess().getFormalParametersEObjectIDTerminalRuleCall_4_3_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__RelationDeclaration__FormalParametersAssignment_4_3_15376); 
             after(grammarAccess.getRelationDeclarationAccess().getFormalParametersEObjectIDTerminalRuleCall_4_3_1_0_1()); 

            }

             after(grammarAccess.getRelationDeclarationAccess().getFormalParametersEObjectCrossReference_4_3_1_0()); 

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
    // $ANTLR end "rule__RelationDeclaration__FormalParametersAssignment_4_3_1"


    // $ANTLR start "rule__ExpressionDeclaration__NameAssignment_2"
    // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2763:1: rule__ExpressionDeclaration__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__ExpressionDeclaration__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2767:1: ( ( RULE_ID ) )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2768:1: ( RULE_ID )
            {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2768:1: ( RULE_ID )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2769:1: RULE_ID
            {
             before(grammarAccess.getExpressionDeclarationAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ExpressionDeclaration__NameAssignment_25411); 
             after(grammarAccess.getExpressionDeclarationAccess().getNameIDTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__ExpressionDeclaration__NameAssignment_2"


    // $ANTLR start "rule__ExpressionDeclaration__FormalParametersAssignment_4_2"
    // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2778:1: rule__ExpressionDeclaration__FormalParametersAssignment_4_2 : ( ( RULE_ID ) ) ;
    public final void rule__ExpressionDeclaration__FormalParametersAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2782:1: ( ( ( RULE_ID ) ) )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2783:1: ( ( RULE_ID ) )
            {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2783:1: ( ( RULE_ID ) )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2784:1: ( RULE_ID )
            {
             before(grammarAccess.getExpressionDeclarationAccess().getFormalParametersEObjectCrossReference_4_2_0()); 
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2785:1: ( RULE_ID )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2786:1: RULE_ID
            {
             before(grammarAccess.getExpressionDeclarationAccess().getFormalParametersEObjectIDTerminalRuleCall_4_2_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ExpressionDeclaration__FormalParametersAssignment_4_25446); 
             after(grammarAccess.getExpressionDeclarationAccess().getFormalParametersEObjectIDTerminalRuleCall_4_2_0_1()); 

            }

             after(grammarAccess.getExpressionDeclarationAccess().getFormalParametersEObjectCrossReference_4_2_0()); 

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
    // $ANTLR end "rule__ExpressionDeclaration__FormalParametersAssignment_4_2"


    // $ANTLR start "rule__ExpressionDeclaration__FormalParametersAssignment_4_3_1"
    // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2797:1: rule__ExpressionDeclaration__FormalParametersAssignment_4_3_1 : ( ( RULE_ID ) ) ;
    public final void rule__ExpressionDeclaration__FormalParametersAssignment_4_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2801:1: ( ( ( RULE_ID ) ) )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2802:1: ( ( RULE_ID ) )
            {
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2802:1: ( ( RULE_ID ) )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2803:1: ( RULE_ID )
            {
             before(grammarAccess.getExpressionDeclarationAccess().getFormalParametersEObjectCrossReference_4_3_1_0()); 
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2804:1: ( RULE_ID )
            // ../org.gemoc.bcool.bcoollib.ui/src-gen/org/gemoc/bcool/ui/contentassist/antlr/internal/InternalBCOoLLib.g:2805:1: RULE_ID
            {
             before(grammarAccess.getExpressionDeclarationAccess().getFormalParametersEObjectIDTerminalRuleCall_4_3_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ExpressionDeclaration__FormalParametersAssignment_4_3_15485); 
             after(grammarAccess.getExpressionDeclarationAccess().getFormalParametersEObjectIDTerminalRuleCall_4_3_1_0_1()); 

            }

             after(grammarAccess.getExpressionDeclarationAccess().getFormalParametersEObjectCrossReference_4_3_1_0()); 

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
    // $ANTLR end "rule__ExpressionDeclaration__FormalParametersAssignment_4_3_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleBCoolLibrary_in_entryRuleBCoolLibrary61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBCoolLibrary68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BCoolLibrary__Group__0_in_ruleBCoolLibrary94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpressionDefinition_in_entryRuleExpressionDefinition121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpressionDefinition128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExpressionDefinition__Group__0_in_ruleExpressionDefinition154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRelationDefinition_in_entryRuleRelationDefinition181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRelationDefinition188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RelationDefinition__Group__0_in_ruleRelationDefinition214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRelationDeclaration_in_entryRuleRelationDeclaration241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRelationDeclaration248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RelationDeclaration__Group__0_in_ruleRelationDeclaration274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpressionDeclaration_in_entryRuleExpressionDeclaration301 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpressionDeclaration308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExpressionDeclaration__Group__0_in_ruleExpressionDeclaration334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BCoolLibrary__Group__0__Impl_in_rule__BCoolLibrary__Group__0368 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_rule__BCoolLibrary__Group__1_in_rule__BCoolLibrary__Group__0371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BCoolLibrary__Group__1__Impl_in_rule__BCoolLibrary__Group__1429 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__BCoolLibrary__Group__2_in_rule__BCoolLibrary__Group__1432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__BCoolLibrary__Group__1__Impl460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BCoolLibrary__Group__2__Impl_in_rule__BCoolLibrary__Group__2491 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__BCoolLibrary__Group__3_in_rule__BCoolLibrary__Group__2494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BCoolLibrary__NameAssignment_2_in_rule__BCoolLibrary__Group__2__Impl521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BCoolLibrary__Group__3__Impl_in_rule__BCoolLibrary__Group__3551 = new BitSet(new long[]{0x0000000000076000L});
    public static final BitSet FOLLOW_rule__BCoolLibrary__Group__4_in_rule__BCoolLibrary__Group__3554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__BCoolLibrary__Group__3__Impl582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BCoolLibrary__Group__4__Impl_in_rule__BCoolLibrary__Group__4613 = new BitSet(new long[]{0x0000000000076000L});
    public static final BitSet FOLLOW_rule__BCoolLibrary__Group__5_in_rule__BCoolLibrary__Group__4616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BCoolLibrary__Group_4__0_in_rule__BCoolLibrary__Group__4__Impl643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BCoolLibrary__Group__5__Impl_in_rule__BCoolLibrary__Group__5674 = new BitSet(new long[]{0x0000000000076000L});
    public static final BitSet FOLLOW_rule__BCoolLibrary__Group__6_in_rule__BCoolLibrary__Group__5677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BCoolLibrary__Group_5__0_in_rule__BCoolLibrary__Group__5__Impl704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BCoolLibrary__Group__6__Impl_in_rule__BCoolLibrary__Group__6735 = new BitSet(new long[]{0x0000000000076000L});
    public static final BitSet FOLLOW_rule__BCoolLibrary__Group__7_in_rule__BCoolLibrary__Group__6738 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BCoolLibrary__Group_6__0_in_rule__BCoolLibrary__Group__6__Impl765 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BCoolLibrary__Group__7__Impl_in_rule__BCoolLibrary__Group__7796 = new BitSet(new long[]{0x0000000000076000L});
    public static final BitSet FOLLOW_rule__BCoolLibrary__Group__8_in_rule__BCoolLibrary__Group__7799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BCoolLibrary__Group_7__0_in_rule__BCoolLibrary__Group__7__Impl826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BCoolLibrary__Group__8__Impl_in_rule__BCoolLibrary__Group__8857 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__BCoolLibrary__Group__8__Impl885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BCoolLibrary__Group_4__0__Impl_in_rule__BCoolLibrary__Group_4__0934 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__BCoolLibrary__Group_4__1_in_rule__BCoolLibrary__Group_4__0937 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__BCoolLibrary__Group_4__0__Impl965 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BCoolLibrary__Group_4__1__Impl_in_rule__BCoolLibrary__Group_4__1996 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__BCoolLibrary__Group_4__2_in_rule__BCoolLibrary__Group_4__1999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__BCoolLibrary__Group_4__1__Impl1027 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BCoolLibrary__Group_4__2__Impl_in_rule__BCoolLibrary__Group_4__21058 = new BitSet(new long[]{0x000000000000A000L});
    public static final BitSet FOLLOW_rule__BCoolLibrary__Group_4__3_in_rule__BCoolLibrary__Group_4__21061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BCoolLibrary__ExpressionDefinitionsAssignment_4_2_in_rule__BCoolLibrary__Group_4__2__Impl1088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BCoolLibrary__Group_4__3__Impl_in_rule__BCoolLibrary__Group_4__31118 = new BitSet(new long[]{0x000000000000A000L});
    public static final BitSet FOLLOW_rule__BCoolLibrary__Group_4__4_in_rule__BCoolLibrary__Group_4__31121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BCoolLibrary__Group_4_3__0_in_rule__BCoolLibrary__Group_4__3__Impl1148 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_rule__BCoolLibrary__Group_4__4__Impl_in_rule__BCoolLibrary__Group_4__41179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__BCoolLibrary__Group_4__4__Impl1207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BCoolLibrary__Group_4_3__0__Impl_in_rule__BCoolLibrary__Group_4_3__01248 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__BCoolLibrary__Group_4_3__1_in_rule__BCoolLibrary__Group_4_3__01251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__BCoolLibrary__Group_4_3__0__Impl1279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BCoolLibrary__Group_4_3__1__Impl_in_rule__BCoolLibrary__Group_4_3__11310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BCoolLibrary__ExpressionDefinitionsAssignment_4_3_1_in_rule__BCoolLibrary__Group_4_3__1__Impl1337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BCoolLibrary__Group_5__0__Impl_in_rule__BCoolLibrary__Group_5__01371 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__BCoolLibrary__Group_5__1_in_rule__BCoolLibrary__Group_5__01374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__BCoolLibrary__Group_5__0__Impl1402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BCoolLibrary__Group_5__1__Impl_in_rule__BCoolLibrary__Group_5__11433 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__BCoolLibrary__Group_5__2_in_rule__BCoolLibrary__Group_5__11436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__BCoolLibrary__Group_5__1__Impl1464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BCoolLibrary__Group_5__2__Impl_in_rule__BCoolLibrary__Group_5__21495 = new BitSet(new long[]{0x000000000000A000L});
    public static final BitSet FOLLOW_rule__BCoolLibrary__Group_5__3_in_rule__BCoolLibrary__Group_5__21498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BCoolLibrary__RelationDefinitionsAssignment_5_2_in_rule__BCoolLibrary__Group_5__2__Impl1525 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BCoolLibrary__Group_5__3__Impl_in_rule__BCoolLibrary__Group_5__31555 = new BitSet(new long[]{0x000000000000A000L});
    public static final BitSet FOLLOW_rule__BCoolLibrary__Group_5__4_in_rule__BCoolLibrary__Group_5__31558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BCoolLibrary__Group_5_3__0_in_rule__BCoolLibrary__Group_5__3__Impl1585 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_rule__BCoolLibrary__Group_5__4__Impl_in_rule__BCoolLibrary__Group_5__41616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__BCoolLibrary__Group_5__4__Impl1644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BCoolLibrary__Group_5_3__0__Impl_in_rule__BCoolLibrary__Group_5_3__01685 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__BCoolLibrary__Group_5_3__1_in_rule__BCoolLibrary__Group_5_3__01688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__BCoolLibrary__Group_5_3__0__Impl1716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BCoolLibrary__Group_5_3__1__Impl_in_rule__BCoolLibrary__Group_5_3__11747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BCoolLibrary__RelationDefinitionsAssignment_5_3_1_in_rule__BCoolLibrary__Group_5_3__1__Impl1774 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BCoolLibrary__Group_6__0__Impl_in_rule__BCoolLibrary__Group_6__01808 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__BCoolLibrary__Group_6__1_in_rule__BCoolLibrary__Group_6__01811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__BCoolLibrary__Group_6__0__Impl1839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BCoolLibrary__Group_6__1__Impl_in_rule__BCoolLibrary__Group_6__11870 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__BCoolLibrary__Group_6__2_in_rule__BCoolLibrary__Group_6__11873 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__BCoolLibrary__Group_6__1__Impl1901 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BCoolLibrary__Group_6__2__Impl_in_rule__BCoolLibrary__Group_6__21932 = new BitSet(new long[]{0x000000000000A000L});
    public static final BitSet FOLLOW_rule__BCoolLibrary__Group_6__3_in_rule__BCoolLibrary__Group_6__21935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BCoolLibrary__RelationDeclarationsAssignment_6_2_in_rule__BCoolLibrary__Group_6__2__Impl1962 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BCoolLibrary__Group_6__3__Impl_in_rule__BCoolLibrary__Group_6__31992 = new BitSet(new long[]{0x000000000000A000L});
    public static final BitSet FOLLOW_rule__BCoolLibrary__Group_6__4_in_rule__BCoolLibrary__Group_6__31995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BCoolLibrary__Group_6_3__0_in_rule__BCoolLibrary__Group_6__3__Impl2022 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_rule__BCoolLibrary__Group_6__4__Impl_in_rule__BCoolLibrary__Group_6__42053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__BCoolLibrary__Group_6__4__Impl2081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BCoolLibrary__Group_6_3__0__Impl_in_rule__BCoolLibrary__Group_6_3__02122 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__BCoolLibrary__Group_6_3__1_in_rule__BCoolLibrary__Group_6_3__02125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__BCoolLibrary__Group_6_3__0__Impl2153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BCoolLibrary__Group_6_3__1__Impl_in_rule__BCoolLibrary__Group_6_3__12184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BCoolLibrary__RelationDeclarationsAssignment_6_3_1_in_rule__BCoolLibrary__Group_6_3__1__Impl2211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BCoolLibrary__Group_7__0__Impl_in_rule__BCoolLibrary__Group_7__02245 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__BCoolLibrary__Group_7__1_in_rule__BCoolLibrary__Group_7__02248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__BCoolLibrary__Group_7__0__Impl2276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BCoolLibrary__Group_7__1__Impl_in_rule__BCoolLibrary__Group_7__12307 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__BCoolLibrary__Group_7__2_in_rule__BCoolLibrary__Group_7__12310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__BCoolLibrary__Group_7__1__Impl2338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BCoolLibrary__Group_7__2__Impl_in_rule__BCoolLibrary__Group_7__22369 = new BitSet(new long[]{0x000000000000A000L});
    public static final BitSet FOLLOW_rule__BCoolLibrary__Group_7__3_in_rule__BCoolLibrary__Group_7__22372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BCoolLibrary__ExpressionDeclarationsAssignment_7_2_in_rule__BCoolLibrary__Group_7__2__Impl2399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BCoolLibrary__Group_7__3__Impl_in_rule__BCoolLibrary__Group_7__32429 = new BitSet(new long[]{0x000000000000A000L});
    public static final BitSet FOLLOW_rule__BCoolLibrary__Group_7__4_in_rule__BCoolLibrary__Group_7__32432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BCoolLibrary__Group_7_3__0_in_rule__BCoolLibrary__Group_7__3__Impl2459 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_rule__BCoolLibrary__Group_7__4__Impl_in_rule__BCoolLibrary__Group_7__42490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__BCoolLibrary__Group_7__4__Impl2518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BCoolLibrary__Group_7_3__0__Impl_in_rule__BCoolLibrary__Group_7_3__02559 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__BCoolLibrary__Group_7_3__1_in_rule__BCoolLibrary__Group_7_3__02562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__BCoolLibrary__Group_7_3__0__Impl2590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BCoolLibrary__Group_7_3__1__Impl_in_rule__BCoolLibrary__Group_7_3__12621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BCoolLibrary__ExpressionDeclarationsAssignment_7_3_1_in_rule__BCoolLibrary__Group_7_3__1__Impl2648 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExpressionDefinition__Group__0__Impl_in_rule__ExpressionDefinition__Group__02682 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__ExpressionDefinition__Group__1_in_rule__ExpressionDefinition__Group__02685 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__ExpressionDefinition__Group__0__Impl2713 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExpressionDefinition__Group__1__Impl_in_rule__ExpressionDefinition__Group__12744 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__ExpressionDefinition__Group__2_in_rule__ExpressionDefinition__Group__12747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__ExpressionDefinition__Group__1__Impl2775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExpressionDefinition__Group__2__Impl_in_rule__ExpressionDefinition__Group__22806 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ExpressionDefinition__Group__3_in_rule__ExpressionDefinition__Group__22809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__ExpressionDefinition__Group__2__Impl2837 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExpressionDefinition__Group__3__Impl_in_rule__ExpressionDefinition__Group__32868 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__ExpressionDefinition__Group__4_in_rule__ExpressionDefinition__Group__32871 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExpressionDefinition__DefinitionAssignment_3_in_rule__ExpressionDefinition__Group__3__Impl2898 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExpressionDefinition__Group__4__Impl_in_rule__ExpressionDefinition__Group__42928 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__ExpressionDefinition__Group__4__Impl2956 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RelationDefinition__Group__0__Impl_in_rule__RelationDefinition__Group__02997 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__RelationDefinition__Group__1_in_rule__RelationDefinition__Group__03000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__RelationDefinition__Group__0__Impl3028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RelationDefinition__Group__1__Impl_in_rule__RelationDefinition__Group__13059 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__RelationDefinition__Group__2_in_rule__RelationDefinition__Group__13062 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__RelationDefinition__Group__1__Impl3090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RelationDefinition__Group__2__Impl_in_rule__RelationDefinition__Group__23121 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__RelationDefinition__Group__3_in_rule__RelationDefinition__Group__23124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__RelationDefinition__Group__2__Impl3152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RelationDefinition__Group__3__Impl_in_rule__RelationDefinition__Group__33183 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__RelationDefinition__Group__4_in_rule__RelationDefinition__Group__33186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RelationDefinition__DefinitionAssignment_3_in_rule__RelationDefinition__Group__3__Impl3213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RelationDefinition__Group__4__Impl_in_rule__RelationDefinition__Group__43243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__RelationDefinition__Group__4__Impl3271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RelationDeclaration__Group__0__Impl_in_rule__RelationDeclaration__Group__03312 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__RelationDeclaration__Group__1_in_rule__RelationDeclaration__Group__03315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RelationDeclaration__Group__1__Impl_in_rule__RelationDeclaration__Group__13373 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__RelationDeclaration__Group__2_in_rule__RelationDeclaration__Group__13376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__RelationDeclaration__Group__1__Impl3404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RelationDeclaration__Group__2__Impl_in_rule__RelationDeclaration__Group__23435 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__RelationDeclaration__Group__3_in_rule__RelationDeclaration__Group__23438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RelationDeclaration__NameAssignment_2_in_rule__RelationDeclaration__Group__2__Impl3465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RelationDeclaration__Group__3__Impl_in_rule__RelationDeclaration__Group__33495 = new BitSet(new long[]{0x0000000000802000L});
    public static final BitSet FOLLOW_rule__RelationDeclaration__Group__4_in_rule__RelationDeclaration__Group__33498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__RelationDeclaration__Group__3__Impl3526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RelationDeclaration__Group__4__Impl_in_rule__RelationDeclaration__Group__43557 = new BitSet(new long[]{0x0000000000802000L});
    public static final BitSet FOLLOW_rule__RelationDeclaration__Group__5_in_rule__RelationDeclaration__Group__43560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RelationDeclaration__Group_4__0_in_rule__RelationDeclaration__Group__4__Impl3587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RelationDeclaration__Group__5__Impl_in_rule__RelationDeclaration__Group__53618 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__RelationDeclaration__Group__5__Impl3646 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RelationDeclaration__Group_4__0__Impl_in_rule__RelationDeclaration__Group_4__03689 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__RelationDeclaration__Group_4__1_in_rule__RelationDeclaration__Group_4__03692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__RelationDeclaration__Group_4__0__Impl3720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RelationDeclaration__Group_4__1__Impl_in_rule__RelationDeclaration__Group_4__13751 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__RelationDeclaration__Group_4__2_in_rule__RelationDeclaration__Group_4__13754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__RelationDeclaration__Group_4__1__Impl3782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RelationDeclaration__Group_4__2__Impl_in_rule__RelationDeclaration__Group_4__23813 = new BitSet(new long[]{0x000000000000A000L});
    public static final BitSet FOLLOW_rule__RelationDeclaration__Group_4__3_in_rule__RelationDeclaration__Group_4__23816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RelationDeclaration__FormalParametersAssignment_4_2_in_rule__RelationDeclaration__Group_4__2__Impl3843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RelationDeclaration__Group_4__3__Impl_in_rule__RelationDeclaration__Group_4__33873 = new BitSet(new long[]{0x000000000000A000L});
    public static final BitSet FOLLOW_rule__RelationDeclaration__Group_4__4_in_rule__RelationDeclaration__Group_4__33876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RelationDeclaration__Group_4_3__0_in_rule__RelationDeclaration__Group_4__3__Impl3903 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_rule__RelationDeclaration__Group_4__4__Impl_in_rule__RelationDeclaration__Group_4__43934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__RelationDeclaration__Group_4__4__Impl3962 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RelationDeclaration__Group_4_3__0__Impl_in_rule__RelationDeclaration__Group_4_3__04003 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__RelationDeclaration__Group_4_3__1_in_rule__RelationDeclaration__Group_4_3__04006 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__RelationDeclaration__Group_4_3__0__Impl4034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RelationDeclaration__Group_4_3__1__Impl_in_rule__RelationDeclaration__Group_4_3__14065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RelationDeclaration__FormalParametersAssignment_4_3_1_in_rule__RelationDeclaration__Group_4_3__1__Impl4092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExpressionDeclaration__Group__0__Impl_in_rule__ExpressionDeclaration__Group__04126 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__ExpressionDeclaration__Group__1_in_rule__ExpressionDeclaration__Group__04129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExpressionDeclaration__Group__1__Impl_in_rule__ExpressionDeclaration__Group__14187 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ExpressionDeclaration__Group__2_in_rule__ExpressionDeclaration__Group__14190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__ExpressionDeclaration__Group__1__Impl4218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExpressionDeclaration__Group__2__Impl_in_rule__ExpressionDeclaration__Group__24249 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__ExpressionDeclaration__Group__3_in_rule__ExpressionDeclaration__Group__24252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExpressionDeclaration__NameAssignment_2_in_rule__ExpressionDeclaration__Group__2__Impl4279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExpressionDeclaration__Group__3__Impl_in_rule__ExpressionDeclaration__Group__34309 = new BitSet(new long[]{0x0000000000802000L});
    public static final BitSet FOLLOW_rule__ExpressionDeclaration__Group__4_in_rule__ExpressionDeclaration__Group__34312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__ExpressionDeclaration__Group__3__Impl4340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExpressionDeclaration__Group__4__Impl_in_rule__ExpressionDeclaration__Group__44371 = new BitSet(new long[]{0x0000000000802000L});
    public static final BitSet FOLLOW_rule__ExpressionDeclaration__Group__5_in_rule__ExpressionDeclaration__Group__44374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExpressionDeclaration__Group_4__0_in_rule__ExpressionDeclaration__Group__4__Impl4401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExpressionDeclaration__Group__5__Impl_in_rule__ExpressionDeclaration__Group__54432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__ExpressionDeclaration__Group__5__Impl4460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExpressionDeclaration__Group_4__0__Impl_in_rule__ExpressionDeclaration__Group_4__04503 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__ExpressionDeclaration__Group_4__1_in_rule__ExpressionDeclaration__Group_4__04506 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__ExpressionDeclaration__Group_4__0__Impl4534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExpressionDeclaration__Group_4__1__Impl_in_rule__ExpressionDeclaration__Group_4__14565 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ExpressionDeclaration__Group_4__2_in_rule__ExpressionDeclaration__Group_4__14568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__ExpressionDeclaration__Group_4__1__Impl4596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExpressionDeclaration__Group_4__2__Impl_in_rule__ExpressionDeclaration__Group_4__24627 = new BitSet(new long[]{0x000000000000A000L});
    public static final BitSet FOLLOW_rule__ExpressionDeclaration__Group_4__3_in_rule__ExpressionDeclaration__Group_4__24630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExpressionDeclaration__FormalParametersAssignment_4_2_in_rule__ExpressionDeclaration__Group_4__2__Impl4657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExpressionDeclaration__Group_4__3__Impl_in_rule__ExpressionDeclaration__Group_4__34687 = new BitSet(new long[]{0x000000000000A000L});
    public static final BitSet FOLLOW_rule__ExpressionDeclaration__Group_4__4_in_rule__ExpressionDeclaration__Group_4__34690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExpressionDeclaration__Group_4_3__0_in_rule__ExpressionDeclaration__Group_4__3__Impl4717 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_rule__ExpressionDeclaration__Group_4__4__Impl_in_rule__ExpressionDeclaration__Group_4__44748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__ExpressionDeclaration__Group_4__4__Impl4776 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExpressionDeclaration__Group_4_3__0__Impl_in_rule__ExpressionDeclaration__Group_4_3__04817 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ExpressionDeclaration__Group_4_3__1_in_rule__ExpressionDeclaration__Group_4_3__04820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__ExpressionDeclaration__Group_4_3__0__Impl4848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExpressionDeclaration__Group_4_3__1__Impl_in_rule__ExpressionDeclaration__Group_4_3__14879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExpressionDeclaration__FormalParametersAssignment_4_3_1_in_rule__ExpressionDeclaration__Group_4_3__1__Impl4906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__BCoolLibrary__NameAssignment_24945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpressionDefinition_in_rule__BCoolLibrary__ExpressionDefinitionsAssignment_4_24976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpressionDefinition_in_rule__BCoolLibrary__ExpressionDefinitionsAssignment_4_3_15007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRelationDefinition_in_rule__BCoolLibrary__RelationDefinitionsAssignment_5_25038 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRelationDefinition_in_rule__BCoolLibrary__RelationDefinitionsAssignment_5_3_15069 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRelationDeclaration_in_rule__BCoolLibrary__RelationDeclarationsAssignment_6_25100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRelationDeclaration_in_rule__BCoolLibrary__RelationDeclarationsAssignment_6_3_15131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpressionDeclaration_in_rule__BCoolLibrary__ExpressionDeclarationsAssignment_7_25162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpressionDeclaration_in_rule__BCoolLibrary__ExpressionDeclarationsAssignment_7_3_15193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ExpressionDefinition__DefinitionAssignment_35228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__RelationDefinition__DefinitionAssignment_35267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__RelationDeclaration__NameAssignment_25302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__RelationDeclaration__FormalParametersAssignment_4_25337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__RelationDeclaration__FormalParametersAssignment_4_3_15376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ExpressionDeclaration__NameAssignment_25411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ExpressionDeclaration__FormalParametersAssignment_4_25446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ExpressionDeclaration__FormalParametersAssignment_4_3_15485 = new BitSet(new long[]{0x0000000000000002L});

}