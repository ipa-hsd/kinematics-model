package de.fraunhofer.ipa.composition.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import de.fraunhofer.ipa.composition.services.CompositionGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalCompositionParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_DOUBLE", "RULE_STRING", "RULE_ID", "RULE_DIGIT", "RULE_BOOLEAN", "RULE_DECINT", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'fixed'", "'prismatic'", "'revolute'", "'Component'", "'{'", "'name'", "'}'", "'parameters'", "','", "'links'", "'joints'", "'components'", "'('", "')'", "'ComponentInstance'", "'type'", "'Parameter'", "'value'", "'ParameterValue'", "'ParameterType'", "'LinkRef'", "'ref'", "'ParameterPoseType'", "'ParameterStringType'", "'ParameterLinkRefType'", "'ParameterInstance'", "'parameter'", "'Joint'", "'parent'", "'origin'", "'child'", "'limit'", "'axis'", "'Link'", "'Pose'", "'x'", "'y'", "'z'", "'roll'", "'pitch'", "'yaw'", "'Limit'", "'effort'", "'velocity'", "'lower'", "'upper'", "'Axis'"
    };
    public static final int T__50=50;
    public static final int RULE_BOOLEAN=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__59=59;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=6;
    public static final int RULE_DIGIT=7;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=10;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=11;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=12;
    public static final int T__37=37;
    public static final int RULE_DOUBLE=4;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int RULE_DECINT=9;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=13;
    public static final int RULE_ANY_OTHER=14;
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


        public InternalCompositionParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalCompositionParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalCompositionParser.tokenNames; }
    public String getGrammarFileName() { return "InternalComposition.g"; }


    	private CompositionGrammarAccess grammarAccess;

    	public void setGrammarAccess(CompositionGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleComponent"
    // InternalComposition.g:53:1: entryRuleComponent : ruleComponent EOF ;
    public final void entryRuleComponent() throws RecognitionException {
        try {
            // InternalComposition.g:54:1: ( ruleComponent EOF )
            // InternalComposition.g:55:1: ruleComponent EOF
            {
             before(grammarAccess.getComponentRule()); 
            pushFollow(FOLLOW_1);
            ruleComponent();

            state._fsp--;

             after(grammarAccess.getComponentRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleComponent"


    // $ANTLR start "ruleComponent"
    // InternalComposition.g:62:1: ruleComponent : ( ( rule__Component__Group__0 ) ) ;
    public final void ruleComponent() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComposition.g:66:2: ( ( ( rule__Component__Group__0 ) ) )
            // InternalComposition.g:67:2: ( ( rule__Component__Group__0 ) )
            {
            // InternalComposition.g:67:2: ( ( rule__Component__Group__0 ) )
            // InternalComposition.g:68:3: ( rule__Component__Group__0 )
            {
             before(grammarAccess.getComponentAccess().getGroup()); 
            // InternalComposition.g:69:3: ( rule__Component__Group__0 )
            // InternalComposition.g:69:4: rule__Component__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Component__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getComponentAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleComponent"


    // $ANTLR start "entryRuleComponentInstance"
    // InternalComposition.g:78:1: entryRuleComponentInstance : ruleComponentInstance EOF ;
    public final void entryRuleComponentInstance() throws RecognitionException {
        try {
            // InternalComposition.g:79:1: ( ruleComponentInstance EOF )
            // InternalComposition.g:80:1: ruleComponentInstance EOF
            {
             before(grammarAccess.getComponentInstanceRule()); 
            pushFollow(FOLLOW_1);
            ruleComponentInstance();

            state._fsp--;

             after(grammarAccess.getComponentInstanceRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleComponentInstance"


    // $ANTLR start "ruleComponentInstance"
    // InternalComposition.g:87:1: ruleComponentInstance : ( ( rule__ComponentInstance__Group__0 ) ) ;
    public final void ruleComponentInstance() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComposition.g:91:2: ( ( ( rule__ComponentInstance__Group__0 ) ) )
            // InternalComposition.g:92:2: ( ( rule__ComponentInstance__Group__0 ) )
            {
            // InternalComposition.g:92:2: ( ( rule__ComponentInstance__Group__0 ) )
            // InternalComposition.g:93:3: ( rule__ComponentInstance__Group__0 )
            {
             before(grammarAccess.getComponentInstanceAccess().getGroup()); 
            // InternalComposition.g:94:3: ( rule__ComponentInstance__Group__0 )
            // InternalComposition.g:94:4: rule__ComponentInstance__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ComponentInstance__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getComponentInstanceAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleComponentInstance"


    // $ANTLR start "entryRuleParameterValue"
    // InternalComposition.g:103:1: entryRuleParameterValue : ruleParameterValue EOF ;
    public final void entryRuleParameterValue() throws RecognitionException {
        try {
            // InternalComposition.g:104:1: ( ruleParameterValue EOF )
            // InternalComposition.g:105:1: ruleParameterValue EOF
            {
             before(grammarAccess.getParameterValueRule()); 
            pushFollow(FOLLOW_1);
            ruleParameterValue();

            state._fsp--;

             after(grammarAccess.getParameterValueRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleParameterValue"


    // $ANTLR start "ruleParameterValue"
    // InternalComposition.g:112:1: ruleParameterValue : ( ( rule__ParameterValue__Alternatives ) ) ;
    public final void ruleParameterValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComposition.g:116:2: ( ( ( rule__ParameterValue__Alternatives ) ) )
            // InternalComposition.g:117:2: ( ( rule__ParameterValue__Alternatives ) )
            {
            // InternalComposition.g:117:2: ( ( rule__ParameterValue__Alternatives ) )
            // InternalComposition.g:118:3: ( rule__ParameterValue__Alternatives )
            {
             before(grammarAccess.getParameterValueAccess().getAlternatives()); 
            // InternalComposition.g:119:3: ( rule__ParameterValue__Alternatives )
            // InternalComposition.g:119:4: rule__ParameterValue__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ParameterValue__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getParameterValueAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleParameterValue"


    // $ANTLR start "entryRuleParameterType"
    // InternalComposition.g:128:1: entryRuleParameterType : ruleParameterType EOF ;
    public final void entryRuleParameterType() throws RecognitionException {
        try {
            // InternalComposition.g:129:1: ( ruleParameterType EOF )
            // InternalComposition.g:130:1: ruleParameterType EOF
            {
             before(grammarAccess.getParameterTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleParameterType();

            state._fsp--;

             after(grammarAccess.getParameterTypeRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleParameterType"


    // $ANTLR start "ruleParameterType"
    // InternalComposition.g:137:1: ruleParameterType : ( ( rule__ParameterType__Alternatives ) ) ;
    public final void ruleParameterType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComposition.g:141:2: ( ( ( rule__ParameterType__Alternatives ) ) )
            // InternalComposition.g:142:2: ( ( rule__ParameterType__Alternatives ) )
            {
            // InternalComposition.g:142:2: ( ( rule__ParameterType__Alternatives ) )
            // InternalComposition.g:143:3: ( rule__ParameterType__Alternatives )
            {
             before(grammarAccess.getParameterTypeAccess().getAlternatives()); 
            // InternalComposition.g:144:3: ( rule__ParameterType__Alternatives )
            // InternalComposition.g:144:4: rule__ParameterType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ParameterType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getParameterTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleParameterType"


    // $ANTLR start "entryRuleParameter"
    // InternalComposition.g:153:1: entryRuleParameter : ruleParameter EOF ;
    public final void entryRuleParameter() throws RecognitionException {
        try {
            // InternalComposition.g:154:1: ( ruleParameter EOF )
            // InternalComposition.g:155:1: ruleParameter EOF
            {
             before(grammarAccess.getParameterRule()); 
            pushFollow(FOLLOW_1);
            ruleParameter();

            state._fsp--;

             after(grammarAccess.getParameterRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleParameter"


    // $ANTLR start "ruleParameter"
    // InternalComposition.g:162:1: ruleParameter : ( ( rule__Parameter__Group__0 ) ) ;
    public final void ruleParameter() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComposition.g:166:2: ( ( ( rule__Parameter__Group__0 ) ) )
            // InternalComposition.g:167:2: ( ( rule__Parameter__Group__0 ) )
            {
            // InternalComposition.g:167:2: ( ( rule__Parameter__Group__0 ) )
            // InternalComposition.g:168:3: ( rule__Parameter__Group__0 )
            {
             before(grammarAccess.getParameterAccess().getGroup()); 
            // InternalComposition.g:169:3: ( rule__Parameter__Group__0 )
            // InternalComposition.g:169:4: rule__Parameter__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Parameter__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getParameterAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleParameter"


    // $ANTLR start "entryRuleParameterValue_Impl"
    // InternalComposition.g:178:1: entryRuleParameterValue_Impl : ruleParameterValue_Impl EOF ;
    public final void entryRuleParameterValue_Impl() throws RecognitionException {
        try {
            // InternalComposition.g:179:1: ( ruleParameterValue_Impl EOF )
            // InternalComposition.g:180:1: ruleParameterValue_Impl EOF
            {
             before(grammarAccess.getParameterValue_ImplRule()); 
            pushFollow(FOLLOW_1);
            ruleParameterValue_Impl();

            state._fsp--;

             after(grammarAccess.getParameterValue_ImplRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleParameterValue_Impl"


    // $ANTLR start "ruleParameterValue_Impl"
    // InternalComposition.g:187:1: ruleParameterValue_Impl : ( ( rule__ParameterValue_Impl__Group__0 ) ) ;
    public final void ruleParameterValue_Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComposition.g:191:2: ( ( ( rule__ParameterValue_Impl__Group__0 ) ) )
            // InternalComposition.g:192:2: ( ( rule__ParameterValue_Impl__Group__0 ) )
            {
            // InternalComposition.g:192:2: ( ( rule__ParameterValue_Impl__Group__0 ) )
            // InternalComposition.g:193:3: ( rule__ParameterValue_Impl__Group__0 )
            {
             before(grammarAccess.getParameterValue_ImplAccess().getGroup()); 
            // InternalComposition.g:194:3: ( rule__ParameterValue_Impl__Group__0 )
            // InternalComposition.g:194:4: rule__ParameterValue_Impl__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ParameterValue_Impl__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getParameterValue_ImplAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleParameterValue_Impl"


    // $ANTLR start "entryRuleParameterType_Impl"
    // InternalComposition.g:203:1: entryRuleParameterType_Impl : ruleParameterType_Impl EOF ;
    public final void entryRuleParameterType_Impl() throws RecognitionException {
        try {
            // InternalComposition.g:204:1: ( ruleParameterType_Impl EOF )
            // InternalComposition.g:205:1: ruleParameterType_Impl EOF
            {
             before(grammarAccess.getParameterType_ImplRule()); 
            pushFollow(FOLLOW_1);
            ruleParameterType_Impl();

            state._fsp--;

             after(grammarAccess.getParameterType_ImplRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleParameterType_Impl"


    // $ANTLR start "ruleParameterType_Impl"
    // InternalComposition.g:212:1: ruleParameterType_Impl : ( ( rule__ParameterType_Impl__Group__0 ) ) ;
    public final void ruleParameterType_Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComposition.g:216:2: ( ( ( rule__ParameterType_Impl__Group__0 ) ) )
            // InternalComposition.g:217:2: ( ( rule__ParameterType_Impl__Group__0 ) )
            {
            // InternalComposition.g:217:2: ( ( rule__ParameterType_Impl__Group__0 ) )
            // InternalComposition.g:218:3: ( rule__ParameterType_Impl__Group__0 )
            {
             before(grammarAccess.getParameterType_ImplAccess().getGroup()); 
            // InternalComposition.g:219:3: ( rule__ParameterType_Impl__Group__0 )
            // InternalComposition.g:219:4: rule__ParameterType_Impl__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ParameterType_Impl__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getParameterType_ImplAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleParameterType_Impl"


    // $ANTLR start "entryRuleLinkRef"
    // InternalComposition.g:228:1: entryRuleLinkRef : ruleLinkRef EOF ;
    public final void entryRuleLinkRef() throws RecognitionException {
        try {
            // InternalComposition.g:229:1: ( ruleLinkRef EOF )
            // InternalComposition.g:230:1: ruleLinkRef EOF
            {
             before(grammarAccess.getLinkRefRule()); 
            pushFollow(FOLLOW_1);
            ruleLinkRef();

            state._fsp--;

             after(grammarAccess.getLinkRefRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleLinkRef"


    // $ANTLR start "ruleLinkRef"
    // InternalComposition.g:237:1: ruleLinkRef : ( ( rule__LinkRef__Group__0 ) ) ;
    public final void ruleLinkRef() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComposition.g:241:2: ( ( ( rule__LinkRef__Group__0 ) ) )
            // InternalComposition.g:242:2: ( ( rule__LinkRef__Group__0 ) )
            {
            // InternalComposition.g:242:2: ( ( rule__LinkRef__Group__0 ) )
            // InternalComposition.g:243:3: ( rule__LinkRef__Group__0 )
            {
             before(grammarAccess.getLinkRefAccess().getGroup()); 
            // InternalComposition.g:244:3: ( rule__LinkRef__Group__0 )
            // InternalComposition.g:244:4: rule__LinkRef__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__LinkRef__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLinkRefAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLinkRef"


    // $ANTLR start "entryRuleParameterPoseType"
    // InternalComposition.g:253:1: entryRuleParameterPoseType : ruleParameterPoseType EOF ;
    public final void entryRuleParameterPoseType() throws RecognitionException {
        try {
            // InternalComposition.g:254:1: ( ruleParameterPoseType EOF )
            // InternalComposition.g:255:1: ruleParameterPoseType EOF
            {
             before(grammarAccess.getParameterPoseTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleParameterPoseType();

            state._fsp--;

             after(grammarAccess.getParameterPoseTypeRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleParameterPoseType"


    // $ANTLR start "ruleParameterPoseType"
    // InternalComposition.g:262:1: ruleParameterPoseType : ( ( rule__ParameterPoseType__Group__0 ) ) ;
    public final void ruleParameterPoseType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComposition.g:266:2: ( ( ( rule__ParameterPoseType__Group__0 ) ) )
            // InternalComposition.g:267:2: ( ( rule__ParameterPoseType__Group__0 ) )
            {
            // InternalComposition.g:267:2: ( ( rule__ParameterPoseType__Group__0 ) )
            // InternalComposition.g:268:3: ( rule__ParameterPoseType__Group__0 )
            {
             before(grammarAccess.getParameterPoseTypeAccess().getGroup()); 
            // InternalComposition.g:269:3: ( rule__ParameterPoseType__Group__0 )
            // InternalComposition.g:269:4: rule__ParameterPoseType__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ParameterPoseType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getParameterPoseTypeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleParameterPoseType"


    // $ANTLR start "entryRuleParameterStringType"
    // InternalComposition.g:278:1: entryRuleParameterStringType : ruleParameterStringType EOF ;
    public final void entryRuleParameterStringType() throws RecognitionException {
        try {
            // InternalComposition.g:279:1: ( ruleParameterStringType EOF )
            // InternalComposition.g:280:1: ruleParameterStringType EOF
            {
             before(grammarAccess.getParameterStringTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleParameterStringType();

            state._fsp--;

             after(grammarAccess.getParameterStringTypeRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleParameterStringType"


    // $ANTLR start "ruleParameterStringType"
    // InternalComposition.g:287:1: ruleParameterStringType : ( ( rule__ParameterStringType__Group__0 ) ) ;
    public final void ruleParameterStringType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComposition.g:291:2: ( ( ( rule__ParameterStringType__Group__0 ) ) )
            // InternalComposition.g:292:2: ( ( rule__ParameterStringType__Group__0 ) )
            {
            // InternalComposition.g:292:2: ( ( rule__ParameterStringType__Group__0 ) )
            // InternalComposition.g:293:3: ( rule__ParameterStringType__Group__0 )
            {
             before(grammarAccess.getParameterStringTypeAccess().getGroup()); 
            // InternalComposition.g:294:3: ( rule__ParameterStringType__Group__0 )
            // InternalComposition.g:294:4: rule__ParameterStringType__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ParameterStringType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getParameterStringTypeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleParameterStringType"


    // $ANTLR start "entryRuleParameterLinkRefType"
    // InternalComposition.g:303:1: entryRuleParameterLinkRefType : ruleParameterLinkRefType EOF ;
    public final void entryRuleParameterLinkRefType() throws RecognitionException {
        try {
            // InternalComposition.g:304:1: ( ruleParameterLinkRefType EOF )
            // InternalComposition.g:305:1: ruleParameterLinkRefType EOF
            {
             before(grammarAccess.getParameterLinkRefTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleParameterLinkRefType();

            state._fsp--;

             after(grammarAccess.getParameterLinkRefTypeRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleParameterLinkRefType"


    // $ANTLR start "ruleParameterLinkRefType"
    // InternalComposition.g:312:1: ruleParameterLinkRefType : ( ( rule__ParameterLinkRefType__Group__0 ) ) ;
    public final void ruleParameterLinkRefType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComposition.g:316:2: ( ( ( rule__ParameterLinkRefType__Group__0 ) ) )
            // InternalComposition.g:317:2: ( ( rule__ParameterLinkRefType__Group__0 ) )
            {
            // InternalComposition.g:317:2: ( ( rule__ParameterLinkRefType__Group__0 ) )
            // InternalComposition.g:318:3: ( rule__ParameterLinkRefType__Group__0 )
            {
             before(grammarAccess.getParameterLinkRefTypeAccess().getGroup()); 
            // InternalComposition.g:319:3: ( rule__ParameterLinkRefType__Group__0 )
            // InternalComposition.g:319:4: rule__ParameterLinkRefType__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ParameterLinkRefType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getParameterLinkRefTypeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleParameterLinkRefType"


    // $ANTLR start "entryRuleParameterInstance"
    // InternalComposition.g:328:1: entryRuleParameterInstance : ruleParameterInstance EOF ;
    public final void entryRuleParameterInstance() throws RecognitionException {
        try {
            // InternalComposition.g:329:1: ( ruleParameterInstance EOF )
            // InternalComposition.g:330:1: ruleParameterInstance EOF
            {
             before(grammarAccess.getParameterInstanceRule()); 
            pushFollow(FOLLOW_1);
            ruleParameterInstance();

            state._fsp--;

             after(grammarAccess.getParameterInstanceRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleParameterInstance"


    // $ANTLR start "ruleParameterInstance"
    // InternalComposition.g:337:1: ruleParameterInstance : ( ( rule__ParameterInstance__Group__0 ) ) ;
    public final void ruleParameterInstance() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComposition.g:341:2: ( ( ( rule__ParameterInstance__Group__0 ) ) )
            // InternalComposition.g:342:2: ( ( rule__ParameterInstance__Group__0 ) )
            {
            // InternalComposition.g:342:2: ( ( rule__ParameterInstance__Group__0 ) )
            // InternalComposition.g:343:3: ( rule__ParameterInstance__Group__0 )
            {
             before(grammarAccess.getParameterInstanceAccess().getGroup()); 
            // InternalComposition.g:344:3: ( rule__ParameterInstance__Group__0 )
            // InternalComposition.g:344:4: rule__ParameterInstance__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ParameterInstance__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getParameterInstanceAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleParameterInstance"


    // $ANTLR start "entryRuleJoint"
    // InternalComposition.g:353:1: entryRuleJoint : ruleJoint EOF ;
    public final void entryRuleJoint() throws RecognitionException {
        try {
            // InternalComposition.g:354:1: ( ruleJoint EOF )
            // InternalComposition.g:355:1: ruleJoint EOF
            {
             before(grammarAccess.getJointRule()); 
            pushFollow(FOLLOW_1);
            ruleJoint();

            state._fsp--;

             after(grammarAccess.getJointRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleJoint"


    // $ANTLR start "ruleJoint"
    // InternalComposition.g:362:1: ruleJoint : ( ( rule__Joint__Group__0 ) ) ;
    public final void ruleJoint() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComposition.g:366:2: ( ( ( rule__Joint__Group__0 ) ) )
            // InternalComposition.g:367:2: ( ( rule__Joint__Group__0 ) )
            {
            // InternalComposition.g:367:2: ( ( rule__Joint__Group__0 ) )
            // InternalComposition.g:368:3: ( rule__Joint__Group__0 )
            {
             before(grammarAccess.getJointAccess().getGroup()); 
            // InternalComposition.g:369:3: ( rule__Joint__Group__0 )
            // InternalComposition.g:369:4: rule__Joint__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Joint__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getJointAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleJoint"


    // $ANTLR start "entryRuleLink"
    // InternalComposition.g:378:1: entryRuleLink : ruleLink EOF ;
    public final void entryRuleLink() throws RecognitionException {
        try {
            // InternalComposition.g:379:1: ( ruleLink EOF )
            // InternalComposition.g:380:1: ruleLink EOF
            {
             before(grammarAccess.getLinkRule()); 
            pushFollow(FOLLOW_1);
            ruleLink();

            state._fsp--;

             after(grammarAccess.getLinkRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleLink"


    // $ANTLR start "ruleLink"
    // InternalComposition.g:387:1: ruleLink : ( ( rule__Link__Group__0 ) ) ;
    public final void ruleLink() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComposition.g:391:2: ( ( ( rule__Link__Group__0 ) ) )
            // InternalComposition.g:392:2: ( ( rule__Link__Group__0 ) )
            {
            // InternalComposition.g:392:2: ( ( rule__Link__Group__0 ) )
            // InternalComposition.g:393:3: ( rule__Link__Group__0 )
            {
             before(grammarAccess.getLinkAccess().getGroup()); 
            // InternalComposition.g:394:3: ( rule__Link__Group__0 )
            // InternalComposition.g:394:4: rule__Link__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Link__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLinkAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLink"


    // $ANTLR start "entryRulePose"
    // InternalComposition.g:403:1: entryRulePose : rulePose EOF ;
    public final void entryRulePose() throws RecognitionException {
        try {
            // InternalComposition.g:404:1: ( rulePose EOF )
            // InternalComposition.g:405:1: rulePose EOF
            {
             before(grammarAccess.getPoseRule()); 
            pushFollow(FOLLOW_1);
            rulePose();

            state._fsp--;

             after(grammarAccess.getPoseRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRulePose"


    // $ANTLR start "rulePose"
    // InternalComposition.g:412:1: rulePose : ( ( rule__Pose__Group__0 ) ) ;
    public final void rulePose() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComposition.g:416:2: ( ( ( rule__Pose__Group__0 ) ) )
            // InternalComposition.g:417:2: ( ( rule__Pose__Group__0 ) )
            {
            // InternalComposition.g:417:2: ( ( rule__Pose__Group__0 ) )
            // InternalComposition.g:418:3: ( rule__Pose__Group__0 )
            {
             before(grammarAccess.getPoseAccess().getGroup()); 
            // InternalComposition.g:419:3: ( rule__Pose__Group__0 )
            // InternalComposition.g:419:4: rule__Pose__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Pose__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPoseAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePose"


    // $ANTLR start "entryRuleLimit"
    // InternalComposition.g:428:1: entryRuleLimit : ruleLimit EOF ;
    public final void entryRuleLimit() throws RecognitionException {
        try {
            // InternalComposition.g:429:1: ( ruleLimit EOF )
            // InternalComposition.g:430:1: ruleLimit EOF
            {
             before(grammarAccess.getLimitRule()); 
            pushFollow(FOLLOW_1);
            ruleLimit();

            state._fsp--;

             after(grammarAccess.getLimitRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleLimit"


    // $ANTLR start "ruleLimit"
    // InternalComposition.g:437:1: ruleLimit : ( ( rule__Limit__Group__0 ) ) ;
    public final void ruleLimit() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComposition.g:441:2: ( ( ( rule__Limit__Group__0 ) ) )
            // InternalComposition.g:442:2: ( ( rule__Limit__Group__0 ) )
            {
            // InternalComposition.g:442:2: ( ( rule__Limit__Group__0 ) )
            // InternalComposition.g:443:3: ( rule__Limit__Group__0 )
            {
             before(grammarAccess.getLimitAccess().getGroup()); 
            // InternalComposition.g:444:3: ( rule__Limit__Group__0 )
            // InternalComposition.g:444:4: rule__Limit__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Limit__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLimitAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLimit"


    // $ANTLR start "entryRuleAxis"
    // InternalComposition.g:453:1: entryRuleAxis : ruleAxis EOF ;
    public final void entryRuleAxis() throws RecognitionException {
        try {
            // InternalComposition.g:454:1: ( ruleAxis EOF )
            // InternalComposition.g:455:1: ruleAxis EOF
            {
             before(grammarAccess.getAxisRule()); 
            pushFollow(FOLLOW_1);
            ruleAxis();

            state._fsp--;

             after(grammarAccess.getAxisRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleAxis"


    // $ANTLR start "ruleAxis"
    // InternalComposition.g:462:1: ruleAxis : ( ( rule__Axis__Group__0 ) ) ;
    public final void ruleAxis() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComposition.g:466:2: ( ( ( rule__Axis__Group__0 ) ) )
            // InternalComposition.g:467:2: ( ( rule__Axis__Group__0 ) )
            {
            // InternalComposition.g:467:2: ( ( rule__Axis__Group__0 ) )
            // InternalComposition.g:468:3: ( rule__Axis__Group__0 )
            {
             before(grammarAccess.getAxisAccess().getGroup()); 
            // InternalComposition.g:469:3: ( rule__Axis__Group__0 )
            // InternalComposition.g:469:4: rule__Axis__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Axis__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAxisAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAxis"


    // $ANTLR start "entryRuleEString"
    // InternalComposition.g:478:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalComposition.g:479:1: ( ruleEString EOF )
            // InternalComposition.g:480:1: ruleEString EOF
            {
             before(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEStringRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalComposition.g:487:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComposition.g:491:2: ( ( ( rule__EString__Alternatives ) ) )
            // InternalComposition.g:492:2: ( ( rule__EString__Alternatives ) )
            {
            // InternalComposition.g:492:2: ( ( rule__EString__Alternatives ) )
            // InternalComposition.g:493:3: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // InternalComposition.g:494:3: ( rule__EString__Alternatives )
            // InternalComposition.g:494:4: rule__EString__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__EString__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEStringAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleEDouble"
    // InternalComposition.g:503:1: entryRuleEDouble : ruleEDouble EOF ;
    public final void entryRuleEDouble() throws RecognitionException {
        try {
            // InternalComposition.g:504:1: ( ruleEDouble EOF )
            // InternalComposition.g:505:1: ruleEDouble EOF
            {
             before(grammarAccess.getEDoubleRule()); 
            pushFollow(FOLLOW_1);
            ruleEDouble();

            state._fsp--;

             after(grammarAccess.getEDoubleRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleEDouble"


    // $ANTLR start "ruleEDouble"
    // InternalComposition.g:512:1: ruleEDouble : ( RULE_DOUBLE ) ;
    public final void ruleEDouble() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComposition.g:516:2: ( ( RULE_DOUBLE ) )
            // InternalComposition.g:517:2: ( RULE_DOUBLE )
            {
            // InternalComposition.g:517:2: ( RULE_DOUBLE )
            // InternalComposition.g:518:3: RULE_DOUBLE
            {
             before(grammarAccess.getEDoubleAccess().getDOUBLETerminalRuleCall()); 
            match(input,RULE_DOUBLE,FOLLOW_2); 
             after(grammarAccess.getEDoubleAccess().getDOUBLETerminalRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEDouble"


    // $ANTLR start "ruleJointType"
    // InternalComposition.g:528:1: ruleJointType : ( ( rule__JointType__Alternatives ) ) ;
    public final void ruleJointType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComposition.g:532:1: ( ( ( rule__JointType__Alternatives ) ) )
            // InternalComposition.g:533:2: ( ( rule__JointType__Alternatives ) )
            {
            // InternalComposition.g:533:2: ( ( rule__JointType__Alternatives ) )
            // InternalComposition.g:534:3: ( rule__JointType__Alternatives )
            {
             before(grammarAccess.getJointTypeAccess().getAlternatives()); 
            // InternalComposition.g:535:3: ( rule__JointType__Alternatives )
            // InternalComposition.g:535:4: rule__JointType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__JointType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getJointTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleJointType"


    // $ANTLR start "rule__ParameterValue__Alternatives"
    // InternalComposition.g:543:1: rule__ParameterValue__Alternatives : ( ( ruleParameterValue_Impl ) | ( ruleLinkRef ) );
    public final void rule__ParameterValue__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComposition.g:547:1: ( ( ruleParameterValue_Impl ) | ( ruleLinkRef ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==33) ) {
                alt1=1;
            }
            else if ( (LA1_0==35) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalComposition.g:548:2: ( ruleParameterValue_Impl )
                    {
                    // InternalComposition.g:548:2: ( ruleParameterValue_Impl )
                    // InternalComposition.g:549:3: ruleParameterValue_Impl
                    {
                     before(grammarAccess.getParameterValueAccess().getParameterValue_ImplParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleParameterValue_Impl();

                    state._fsp--;

                     after(grammarAccess.getParameterValueAccess().getParameterValue_ImplParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalComposition.g:554:2: ( ruleLinkRef )
                    {
                    // InternalComposition.g:554:2: ( ruleLinkRef )
                    // InternalComposition.g:555:3: ruleLinkRef
                    {
                     before(grammarAccess.getParameterValueAccess().getLinkRefParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleLinkRef();

                    state._fsp--;

                     after(grammarAccess.getParameterValueAccess().getLinkRefParserRuleCall_1()); 

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
    // $ANTLR end "rule__ParameterValue__Alternatives"


    // $ANTLR start "rule__ParameterType__Alternatives"
    // InternalComposition.g:564:1: rule__ParameterType__Alternatives : ( ( ruleParameterType_Impl ) | ( ruleParameterPoseType ) | ( ruleParameterStringType ) | ( ruleParameterLinkRefType ) );
    public final void rule__ParameterType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComposition.g:568:1: ( ( ruleParameterType_Impl ) | ( ruleParameterPoseType ) | ( ruleParameterStringType ) | ( ruleParameterLinkRefType ) )
            int alt2=4;
            switch ( input.LA(1) ) {
            case 34:
                {
                alt2=1;
                }
                break;
            case 37:
                {
                alt2=2;
                }
                break;
            case 38:
                {
                alt2=3;
                }
                break;
            case 39:
                {
                alt2=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalComposition.g:569:2: ( ruleParameterType_Impl )
                    {
                    // InternalComposition.g:569:2: ( ruleParameterType_Impl )
                    // InternalComposition.g:570:3: ruleParameterType_Impl
                    {
                     before(grammarAccess.getParameterTypeAccess().getParameterType_ImplParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleParameterType_Impl();

                    state._fsp--;

                     after(grammarAccess.getParameterTypeAccess().getParameterType_ImplParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalComposition.g:575:2: ( ruleParameterPoseType )
                    {
                    // InternalComposition.g:575:2: ( ruleParameterPoseType )
                    // InternalComposition.g:576:3: ruleParameterPoseType
                    {
                     before(grammarAccess.getParameterTypeAccess().getParameterPoseTypeParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleParameterPoseType();

                    state._fsp--;

                     after(grammarAccess.getParameterTypeAccess().getParameterPoseTypeParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalComposition.g:581:2: ( ruleParameterStringType )
                    {
                    // InternalComposition.g:581:2: ( ruleParameterStringType )
                    // InternalComposition.g:582:3: ruleParameterStringType
                    {
                     before(grammarAccess.getParameterTypeAccess().getParameterStringTypeParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleParameterStringType();

                    state._fsp--;

                     after(grammarAccess.getParameterTypeAccess().getParameterStringTypeParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalComposition.g:587:2: ( ruleParameterLinkRefType )
                    {
                    // InternalComposition.g:587:2: ( ruleParameterLinkRefType )
                    // InternalComposition.g:588:3: ruleParameterLinkRefType
                    {
                     before(grammarAccess.getParameterTypeAccess().getParameterLinkRefTypeParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleParameterLinkRefType();

                    state._fsp--;

                     after(grammarAccess.getParameterTypeAccess().getParameterLinkRefTypeParserRuleCall_3()); 

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
    // $ANTLR end "rule__ParameterType__Alternatives"


    // $ANTLR start "rule__EString__Alternatives"
    // InternalComposition.g:597:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComposition.g:601:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_STRING) ) {
                alt3=1;
            }
            else if ( (LA3_0==RULE_ID) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalComposition.g:602:2: ( RULE_STRING )
                    {
                    // InternalComposition.g:602:2: ( RULE_STRING )
                    // InternalComposition.g:603:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalComposition.g:608:2: ( RULE_ID )
                    {
                    // InternalComposition.g:608:2: ( RULE_ID )
                    // InternalComposition.g:609:3: RULE_ID
                    {
                     before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 

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
    // $ANTLR end "rule__EString__Alternatives"


    // $ANTLR start "rule__JointType__Alternatives"
    // InternalComposition.g:618:1: rule__JointType__Alternatives : ( ( ( 'fixed' ) ) | ( ( 'prismatic' ) ) | ( ( 'revolute' ) ) );
    public final void rule__JointType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComposition.g:622:1: ( ( ( 'fixed' ) ) | ( ( 'prismatic' ) ) | ( ( 'revolute' ) ) )
            int alt4=3;
            switch ( input.LA(1) ) {
            case 15:
                {
                alt4=1;
                }
                break;
            case 16:
                {
                alt4=2;
                }
                break;
            case 17:
                {
                alt4=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalComposition.g:623:2: ( ( 'fixed' ) )
                    {
                    // InternalComposition.g:623:2: ( ( 'fixed' ) )
                    // InternalComposition.g:624:3: ( 'fixed' )
                    {
                     before(grammarAccess.getJointTypeAccess().getFixedEnumLiteralDeclaration_0()); 
                    // InternalComposition.g:625:3: ( 'fixed' )
                    // InternalComposition.g:625:4: 'fixed'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getJointTypeAccess().getFixedEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalComposition.g:629:2: ( ( 'prismatic' ) )
                    {
                    // InternalComposition.g:629:2: ( ( 'prismatic' ) )
                    // InternalComposition.g:630:3: ( 'prismatic' )
                    {
                     before(grammarAccess.getJointTypeAccess().getPrismaticEnumLiteralDeclaration_1()); 
                    // InternalComposition.g:631:3: ( 'prismatic' )
                    // InternalComposition.g:631:4: 'prismatic'
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getJointTypeAccess().getPrismaticEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalComposition.g:635:2: ( ( 'revolute' ) )
                    {
                    // InternalComposition.g:635:2: ( ( 'revolute' ) )
                    // InternalComposition.g:636:3: ( 'revolute' )
                    {
                     before(grammarAccess.getJointTypeAccess().getRevoluteEnumLiteralDeclaration_2()); 
                    // InternalComposition.g:637:3: ( 'revolute' )
                    // InternalComposition.g:637:4: 'revolute'
                    {
                    match(input,17,FOLLOW_2); 

                    }

                     after(grammarAccess.getJointTypeAccess().getRevoluteEnumLiteralDeclaration_2()); 

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
    // $ANTLR end "rule__JointType__Alternatives"


    // $ANTLR start "rule__Component__Group__0"
    // InternalComposition.g:645:1: rule__Component__Group__0 : rule__Component__Group__0__Impl rule__Component__Group__1 ;
    public final void rule__Component__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComposition.g:649:1: ( rule__Component__Group__0__Impl rule__Component__Group__1 )
            // InternalComposition.g:650:2: rule__Component__Group__0__Impl rule__Component__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Component__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Component__Group__1();

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
    // $ANTLR end "rule__Component__Group__0"


    // $ANTLR start "rule__Component__Group__0__Impl"
    // InternalComposition.g:657:1: rule__Component__Group__0__Impl : ( 'Component' ) ;
    public final void rule__Component__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComposition.g:661:1: ( ( 'Component' ) )
            // InternalComposition.g:662:1: ( 'Component' )
            {
            // InternalComposition.g:662:1: ( 'Component' )
            // InternalComposition.g:663:2: 'Component'
            {
             before(grammarAccess.getComponentAccess().getComponentKeyword_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getComponentAccess().getComponentKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group__0__Impl"


    // $ANTLR start "rule__Component__Group__1"
    // InternalComposition.g:672:1: rule__Component__Group__1 : rule__Component__Group__1__Impl rule__Component__Group__2 ;
    public final void rule__Component__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComposition.g:676:1: ( rule__Component__Group__1__Impl rule__Component__Group__2 )
            // InternalComposition.g:677:2: rule__Component__Group__1__Impl rule__Component__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Component__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Component__Group__2();

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
    // $ANTLR end "rule__Component__Group__1"


    // $ANTLR start "rule__Component__Group__1__Impl"
    // InternalComposition.g:684:1: rule__Component__Group__1__Impl : ( '{' ) ;
    public final void rule__Component__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComposition.g:688:1: ( ( '{' ) )
            // InternalComposition.g:689:1: ( '{' )
            {
            // InternalComposition.g:689:1: ( '{' )
            // InternalComposition.g:690:2: '{'
            {
             before(grammarAccess.getComponentAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getComponentAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group__1__Impl"


    // $ANTLR start "rule__Component__Group__2"
    // InternalComposition.g:699:1: rule__Component__Group__2 : rule__Component__Group__2__Impl rule__Component__Group__3 ;
    public final void rule__Component__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComposition.g:703:1: ( rule__Component__Group__2__Impl rule__Component__Group__3 )
            // InternalComposition.g:704:2: rule__Component__Group__2__Impl rule__Component__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Component__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Component__Group__3();

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
    // $ANTLR end "rule__Component__Group__2"


    // $ANTLR start "rule__Component__Group__2__Impl"
    // InternalComposition.g:711:1: rule__Component__Group__2__Impl : ( 'name' ) ;
    public final void rule__Component__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComposition.g:715:1: ( ( 'name' ) )
            // InternalComposition.g:716:1: ( 'name' )
            {
            // InternalComposition.g:716:1: ( 'name' )
            // InternalComposition.g:717:2: 'name'
            {
             before(grammarAccess.getComponentAccess().getNameKeyword_2()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getComponentAccess().getNameKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group__2__Impl"


    // $ANTLR start "rule__Component__Group__3"
    // InternalComposition.g:726:1: rule__Component__Group__3 : rule__Component__Group__3__Impl rule__Component__Group__4 ;
    public final void rule__Component__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComposition.g:730:1: ( rule__Component__Group__3__Impl rule__Component__Group__4 )
            // InternalComposition.g:731:2: rule__Component__Group__3__Impl rule__Component__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__Component__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Component__Group__4();

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
    // $ANTLR end "rule__Component__Group__3"


    // $ANTLR start "rule__Component__Group__3__Impl"
    // InternalComposition.g:738:1: rule__Component__Group__3__Impl : ( ( rule__Component__NameAssignment_3 ) ) ;
    public final void rule__Component__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComposition.g:742:1: ( ( ( rule__Component__NameAssignment_3 ) ) )
            // InternalComposition.g:743:1: ( ( rule__Component__NameAssignment_3 ) )
            {
            // InternalComposition.g:743:1: ( ( rule__Component__NameAssignment_3 ) )
            // InternalComposition.g:744:2: ( rule__Component__NameAssignment_3 )
            {
             before(grammarAccess.getComponentAccess().getNameAssignment_3()); 
            // InternalComposition.g:745:2: ( rule__Component__NameAssignment_3 )
            // InternalComposition.g:745:3: rule__Component__NameAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Component__NameAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getComponentAccess().getNameAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group__3__Impl"


    // $ANTLR start "rule__Component__Group__4"
    // InternalComposition.g:753:1: rule__Component__Group__4 : rule__Component__Group__4__Impl rule__Component__Group__5 ;
    public final void rule__Component__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComposition.g:757:1: ( rule__Component__Group__4__Impl rule__Component__Group__5 )
            // InternalComposition.g:758:2: rule__Component__Group__4__Impl rule__Component__Group__5
            {
            pushFollow(FOLLOW_6);
            rule__Component__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Component__Group__5();

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
    // $ANTLR end "rule__Component__Group__4"


    // $ANTLR start "rule__Component__Group__4__Impl"
    // InternalComposition.g:765:1: rule__Component__Group__4__Impl : ( ( rule__Component__Group_4__0 )? ) ;
    public final void rule__Component__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComposition.g:769:1: ( ( ( rule__Component__Group_4__0 )? ) )
            // InternalComposition.g:770:1: ( ( rule__Component__Group_4__0 )? )
            {
            // InternalComposition.g:770:1: ( ( rule__Component__Group_4__0 )? )
            // InternalComposition.g:771:2: ( rule__Component__Group_4__0 )?
            {
             before(grammarAccess.getComponentAccess().getGroup_4()); 
            // InternalComposition.g:772:2: ( rule__Component__Group_4__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==22) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalComposition.g:772:3: rule__Component__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Component__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getComponentAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group__4__Impl"


    // $ANTLR start "rule__Component__Group__5"
    // InternalComposition.g:780:1: rule__Component__Group__5 : rule__Component__Group__5__Impl rule__Component__Group__6 ;
    public final void rule__Component__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComposition.g:784:1: ( rule__Component__Group__5__Impl rule__Component__Group__6 )
            // InternalComposition.g:785:2: rule__Component__Group__5__Impl rule__Component__Group__6
            {
            pushFollow(FOLLOW_6);
            rule__Component__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Component__Group__6();

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
    // $ANTLR end "rule__Component__Group__5"


    // $ANTLR start "rule__Component__Group__5__Impl"
    // InternalComposition.g:792:1: rule__Component__Group__5__Impl : ( ( rule__Component__Group_5__0 )? ) ;
    public final void rule__Component__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComposition.g:796:1: ( ( ( rule__Component__Group_5__0 )? ) )
            // InternalComposition.g:797:1: ( ( rule__Component__Group_5__0 )? )
            {
            // InternalComposition.g:797:1: ( ( rule__Component__Group_5__0 )? )
            // InternalComposition.g:798:2: ( rule__Component__Group_5__0 )?
            {
             before(grammarAccess.getComponentAccess().getGroup_5()); 
            // InternalComposition.g:799:2: ( rule__Component__Group_5__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==24) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalComposition.g:799:3: rule__Component__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Component__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getComponentAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group__5__Impl"


    // $ANTLR start "rule__Component__Group__6"
    // InternalComposition.g:807:1: rule__Component__Group__6 : rule__Component__Group__6__Impl rule__Component__Group__7 ;
    public final void rule__Component__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComposition.g:811:1: ( rule__Component__Group__6__Impl rule__Component__Group__7 )
            // InternalComposition.g:812:2: rule__Component__Group__6__Impl rule__Component__Group__7
            {
            pushFollow(FOLLOW_6);
            rule__Component__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Component__Group__7();

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
    // $ANTLR end "rule__Component__Group__6"


    // $ANTLR start "rule__Component__Group__6__Impl"
    // InternalComposition.g:819:1: rule__Component__Group__6__Impl : ( ( rule__Component__Group_6__0 )? ) ;
    public final void rule__Component__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComposition.g:823:1: ( ( ( rule__Component__Group_6__0 )? ) )
            // InternalComposition.g:824:1: ( ( rule__Component__Group_6__0 )? )
            {
            // InternalComposition.g:824:1: ( ( rule__Component__Group_6__0 )? )
            // InternalComposition.g:825:2: ( rule__Component__Group_6__0 )?
            {
             before(grammarAccess.getComponentAccess().getGroup_6()); 
            // InternalComposition.g:826:2: ( rule__Component__Group_6__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==25) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalComposition.g:826:3: rule__Component__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Component__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getComponentAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group__6__Impl"


    // $ANTLR start "rule__Component__Group__7"
    // InternalComposition.g:834:1: rule__Component__Group__7 : rule__Component__Group__7__Impl rule__Component__Group__8 ;
    public final void rule__Component__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComposition.g:838:1: ( rule__Component__Group__7__Impl rule__Component__Group__8 )
            // InternalComposition.g:839:2: rule__Component__Group__7__Impl rule__Component__Group__8
            {
            pushFollow(FOLLOW_6);
            rule__Component__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Component__Group__8();

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
    // $ANTLR end "rule__Component__Group__7"


    // $ANTLR start "rule__Component__Group__7__Impl"
    // InternalComposition.g:846:1: rule__Component__Group__7__Impl : ( ( rule__Component__Group_7__0 )? ) ;
    public final void rule__Component__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComposition.g:850:1: ( ( ( rule__Component__Group_7__0 )? ) )
            // InternalComposition.g:851:1: ( ( rule__Component__Group_7__0 )? )
            {
            // InternalComposition.g:851:1: ( ( rule__Component__Group_7__0 )? )
            // InternalComposition.g:852:2: ( rule__Component__Group_7__0 )?
            {
             before(grammarAccess.getComponentAccess().getGroup_7()); 
            // InternalComposition.g:853:2: ( rule__Component__Group_7__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==26) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalComposition.g:853:3: rule__Component__Group_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Component__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getComponentAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group__7__Impl"


    // $ANTLR start "rule__Component__Group__8"
    // InternalComposition.g:861:1: rule__Component__Group__8 : rule__Component__Group__8__Impl ;
    public final void rule__Component__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComposition.g:865:1: ( rule__Component__Group__8__Impl )
            // InternalComposition.g:866:2: rule__Component__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Component__Group__8__Impl();

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
    // $ANTLR end "rule__Component__Group__8"


    // $ANTLR start "rule__Component__Group__8__Impl"
    // InternalComposition.g:872:1: rule__Component__Group__8__Impl : ( '}' ) ;
    public final void rule__Component__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComposition.g:876:1: ( ( '}' ) )
            // InternalComposition.g:877:1: ( '}' )
            {
            // InternalComposition.g:877:1: ( '}' )
            // InternalComposition.g:878:2: '}'
            {
             before(grammarAccess.getComponentAccess().getRightCurlyBracketKeyword_8()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getComponentAccess().getRightCurlyBracketKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group__8__Impl"


    // $ANTLR start "rule__Component__Group_4__0"
    // InternalComposition.g:888:1: rule__Component__Group_4__0 : rule__Component__Group_4__0__Impl rule__Component__Group_4__1 ;
    public final void rule__Component__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComposition.g:892:1: ( rule__Component__Group_4__0__Impl rule__Component__Group_4__1 )
            // InternalComposition.g:893:2: rule__Component__Group_4__0__Impl rule__Component__Group_4__1
            {
            pushFollow(FOLLOW_3);
            rule__Component__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Component__Group_4__1();

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
    // $ANTLR end "rule__Component__Group_4__0"


    // $ANTLR start "rule__Component__Group_4__0__Impl"
    // InternalComposition.g:900:1: rule__Component__Group_4__0__Impl : ( 'parameters' ) ;
    public final void rule__Component__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComposition.g:904:1: ( ( 'parameters' ) )
            // InternalComposition.g:905:1: ( 'parameters' )
            {
            // InternalComposition.g:905:1: ( 'parameters' )
            // InternalComposition.g:906:2: 'parameters'
            {
             before(grammarAccess.getComponentAccess().getParametersKeyword_4_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getComponentAccess().getParametersKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group_4__0__Impl"


    // $ANTLR start "rule__Component__Group_4__1"
    // InternalComposition.g:915:1: rule__Component__Group_4__1 : rule__Component__Group_4__1__Impl rule__Component__Group_4__2 ;
    public final void rule__Component__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComposition.g:919:1: ( rule__Component__Group_4__1__Impl rule__Component__Group_4__2 )
            // InternalComposition.g:920:2: rule__Component__Group_4__1__Impl rule__Component__Group_4__2
            {
            pushFollow(FOLLOW_7);
            rule__Component__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Component__Group_4__2();

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
    // $ANTLR end "rule__Component__Group_4__1"


    // $ANTLR start "rule__Component__Group_4__1__Impl"
    // InternalComposition.g:927:1: rule__Component__Group_4__1__Impl : ( '{' ) ;
    public final void rule__Component__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComposition.g:931:1: ( ( '{' ) )
            // InternalComposition.g:932:1: ( '{' )
            {
            // InternalComposition.g:932:1: ( '{' )
            // InternalComposition.g:933:2: '{'
            {
             before(grammarAccess.getComponentAccess().getLeftCurlyBracketKeyword_4_1()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getComponentAccess().getLeftCurlyBracketKeyword_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group_4__1__Impl"


    // $ANTLR start "rule__Component__Group_4__2"
    // InternalComposition.g:942:1: rule__Component__Group_4__2 : rule__Component__Group_4__2__Impl rule__Component__Group_4__3 ;
    public final void rule__Component__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComposition.g:946:1: ( rule__Component__Group_4__2__Impl rule__Component__Group_4__3 )
            // InternalComposition.g:947:2: rule__Component__Group_4__2__Impl rule__Component__Group_4__3
            {
            pushFollow(FOLLOW_8);
            rule__Component__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Component__Group_4__3();

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
    // $ANTLR end "rule__Component__Group_4__2"


    // $ANTLR start "rule__Component__Group_4__2__Impl"
    // InternalComposition.g:954:1: rule__Component__Group_4__2__Impl : ( ( rule__Component__ParametersAssignment_4_2 ) ) ;
    public final void rule__Component__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComposition.g:958:1: ( ( ( rule__Component__ParametersAssignment_4_2 ) ) )
            // InternalComposition.g:959:1: ( ( rule__Component__ParametersAssignment_4_2 ) )
            {
            // InternalComposition.g:959:1: ( ( rule__Component__ParametersAssignment_4_2 ) )
            // InternalComposition.g:960:2: ( rule__Component__ParametersAssignment_4_2 )
            {
             before(grammarAccess.getComponentAccess().getParametersAssignment_4_2()); 
            // InternalComposition.g:961:2: ( rule__Component__ParametersAssignment_4_2 )
            // InternalComposition.g:961:3: rule__Component__ParametersAssignment_4_2
            {
            pushFollow(FOLLOW_2);
            rule__Component__ParametersAssignment_4_2();

            state._fsp--;


            }

             after(grammarAccess.getComponentAccess().getParametersAssignment_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group_4__2__Impl"


    // $ANTLR start "rule__Component__Group_4__3"
    // InternalComposition.g:969:1: rule__Component__Group_4__3 : rule__Component__Group_4__3__Impl rule__Component__Group_4__4 ;
    public final void rule__Component__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComposition.g:973:1: ( rule__Component__Group_4__3__Impl rule__Component__Group_4__4 )
            // InternalComposition.g:974:2: rule__Component__Group_4__3__Impl rule__Component__Group_4__4
            {
            pushFollow(FOLLOW_8);
            rule__Component__Group_4__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Component__Group_4__4();

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
    // $ANTLR end "rule__Component__Group_4__3"


    // $ANTLR start "rule__Component__Group_4__3__Impl"
    // InternalComposition.g:981:1: rule__Component__Group_4__3__Impl : ( ( rule__Component__Group_4_3__0 )* ) ;
    public final void rule__Component__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComposition.g:985:1: ( ( ( rule__Component__Group_4_3__0 )* ) )
            // InternalComposition.g:986:1: ( ( rule__Component__Group_4_3__0 )* )
            {
            // InternalComposition.g:986:1: ( ( rule__Component__Group_4_3__0 )* )
            // InternalComposition.g:987:2: ( rule__Component__Group_4_3__0 )*
            {
             before(grammarAccess.getComponentAccess().getGroup_4_3()); 
            // InternalComposition.g:988:2: ( rule__Component__Group_4_3__0 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==23) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalComposition.g:988:3: rule__Component__Group_4_3__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Component__Group_4_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getComponentAccess().getGroup_4_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group_4__3__Impl"


    // $ANTLR start "rule__Component__Group_4__4"
    // InternalComposition.g:996:1: rule__Component__Group_4__4 : rule__Component__Group_4__4__Impl ;
    public final void rule__Component__Group_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComposition.g:1000:1: ( rule__Component__Group_4__4__Impl )
            // InternalComposition.g:1001:2: rule__Component__Group_4__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Component__Group_4__4__Impl();

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
    // $ANTLR end "rule__Component__Group_4__4"


    // $ANTLR start "rule__Component__Group_4__4__Impl"
    // InternalComposition.g:1007:1: rule__Component__Group_4__4__Impl : ( '}' ) ;
    public final void rule__Component__Group_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComposition.g:1011:1: ( ( '}' ) )
            // InternalComposition.g:1012:1: ( '}' )
            {
            // InternalComposition.g:1012:1: ( '}' )
            // InternalComposition.g:1013:2: '}'
            {
             before(grammarAccess.getComponentAccess().getRightCurlyBracketKeyword_4_4()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getComponentAccess().getRightCurlyBracketKeyword_4_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group_4__4__Impl"


    // $ANTLR start "rule__Component__Group_4_3__0"
    // InternalComposition.g:1023:1: rule__Component__Group_4_3__0 : rule__Component__Group_4_3__0__Impl rule__Component__Group_4_3__1 ;
    public final void rule__Component__Group_4_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComposition.g:1027:1: ( rule__Component__Group_4_3__0__Impl rule__Component__Group_4_3__1 )
            // InternalComposition.g:1028:2: rule__Component__Group_4_3__0__Impl rule__Component__Group_4_3__1
            {
            pushFollow(FOLLOW_7);
            rule__Component__Group_4_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Component__Group_4_3__1();

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
    // $ANTLR end "rule__Component__Group_4_3__0"


    // $ANTLR start "rule__Component__Group_4_3__0__Impl"
    // InternalComposition.g:1035:1: rule__Component__Group_4_3__0__Impl : ( ',' ) ;
    public final void rule__Component__Group_4_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComposition.g:1039:1: ( ( ',' ) )
            // InternalComposition.g:1040:1: ( ',' )
            {
            // InternalComposition.g:1040:1: ( ',' )
            // InternalComposition.g:1041:2: ','
            {
             before(grammarAccess.getComponentAccess().getCommaKeyword_4_3_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getComponentAccess().getCommaKeyword_4_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group_4_3__0__Impl"


    // $ANTLR start "rule__Component__Group_4_3__1"
    // InternalComposition.g:1050:1: rule__Component__Group_4_3__1 : rule__Component__Group_4_3__1__Impl ;
    public final void rule__Component__Group_4_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComposition.g:1054:1: ( rule__Component__Group_4_3__1__Impl )
            // InternalComposition.g:1055:2: rule__Component__Group_4_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Component__Group_4_3__1__Impl();

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
    // $ANTLR end "rule__Component__Group_4_3__1"


    // $ANTLR start "rule__Component__Group_4_3__1__Impl"
    // InternalComposition.g:1061:1: rule__Component__Group_4_3__1__Impl : ( ( rule__Component__ParametersAssignment_4_3_1 ) ) ;
    public final void rule__Component__Group_4_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComposition.g:1065:1: ( ( ( rule__Component__ParametersAssignment_4_3_1 ) ) )
            // InternalComposition.g:1066:1: ( ( rule__Component__ParametersAssignment_4_3_1 ) )
            {
            // InternalComposition.g:1066:1: ( ( rule__Component__ParametersAssignment_4_3_1 ) )
            // InternalComposition.g:1067:2: ( rule__Component__ParametersAssignment_4_3_1 )
            {
             before(grammarAccess.getComponentAccess().getParametersAssignment_4_3_1()); 
            // InternalComposition.g:1068:2: ( rule__Component__ParametersAssignment_4_3_1 )
            // InternalComposition.g:1068:3: rule__Component__ParametersAssignment_4_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Component__ParametersAssignment_4_3_1();

            state._fsp--;


            }

             after(grammarAccess.getComponentAccess().getParametersAssignment_4_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group_4_3__1__Impl"


    // $ANTLR start "rule__Component__Group_5__0"
    // InternalComposition.g:1077:1: rule__Component__Group_5__0 : rule__Component__Group_5__0__Impl rule__Component__Group_5__1 ;
    public final void rule__Component__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComposition.g:1081:1: ( rule__Component__Group_5__0__Impl rule__Component__Group_5__1 )
            // InternalComposition.g:1082:2: rule__Component__Group_5__0__Impl rule__Component__Group_5__1
            {
            pushFollow(FOLLOW_3);
            rule__Component__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Component__Group_5__1();

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
    // $ANTLR end "rule__Component__Group_5__0"


    // $ANTLR start "rule__Component__Group_5__0__Impl"
    // InternalComposition.g:1089:1: rule__Component__Group_5__0__Impl : ( 'links' ) ;
    public final void rule__Component__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComposition.g:1093:1: ( ( 'links' ) )
            // InternalComposition.g:1094:1: ( 'links' )
            {
            // InternalComposition.g:1094:1: ( 'links' )
            // InternalComposition.g:1095:2: 'links'
            {
             before(grammarAccess.getComponentAccess().getLinksKeyword_5_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getComponentAccess().getLinksKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group_5__0__Impl"


    // $ANTLR start "rule__Component__Group_5__1"
    // InternalComposition.g:1104:1: rule__Component__Group_5__1 : rule__Component__Group_5__1__Impl rule__Component__Group_5__2 ;
    public final void rule__Component__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComposition.g:1108:1: ( rule__Component__Group_5__1__Impl rule__Component__Group_5__2 )
            // InternalComposition.g:1109:2: rule__Component__Group_5__1__Impl rule__Component__Group_5__2
            {
            pushFollow(FOLLOW_10);
            rule__Component__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Component__Group_5__2();

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
    // $ANTLR end "rule__Component__Group_5__1"


    // $ANTLR start "rule__Component__Group_5__1__Impl"
    // InternalComposition.g:1116:1: rule__Component__Group_5__1__Impl : ( '{' ) ;
    public final void rule__Component__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComposition.g:1120:1: ( ( '{' ) )
            // InternalComposition.g:1121:1: ( '{' )
            {
            // InternalComposition.g:1121:1: ( '{' )
            // InternalComposition.g:1122:2: '{'
            {
             before(grammarAccess.getComponentAccess().getLeftCurlyBracketKeyword_5_1()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getComponentAccess().getLeftCurlyBracketKeyword_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group_5__1__Impl"


    // $ANTLR start "rule__Component__Group_5__2"
    // InternalComposition.g:1131:1: rule__Component__Group_5__2 : rule__Component__Group_5__2__Impl rule__Component__Group_5__3 ;
    public final void rule__Component__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComposition.g:1135:1: ( rule__Component__Group_5__2__Impl rule__Component__Group_5__3 )
            // InternalComposition.g:1136:2: rule__Component__Group_5__2__Impl rule__Component__Group_5__3
            {
            pushFollow(FOLLOW_8);
            rule__Component__Group_5__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Component__Group_5__3();

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
    // $ANTLR end "rule__Component__Group_5__2"


    // $ANTLR start "rule__Component__Group_5__2__Impl"
    // InternalComposition.g:1143:1: rule__Component__Group_5__2__Impl : ( ( rule__Component__LinksAssignment_5_2 ) ) ;
    public final void rule__Component__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComposition.g:1147:1: ( ( ( rule__Component__LinksAssignment_5_2 ) ) )
            // InternalComposition.g:1148:1: ( ( rule__Component__LinksAssignment_5_2 ) )
            {
            // InternalComposition.g:1148:1: ( ( rule__Component__LinksAssignment_5_2 ) )
            // InternalComposition.g:1149:2: ( rule__Component__LinksAssignment_5_2 )
            {
             before(grammarAccess.getComponentAccess().getLinksAssignment_5_2()); 
            // InternalComposition.g:1150:2: ( rule__Component__LinksAssignment_5_2 )
            // InternalComposition.g:1150:3: rule__Component__LinksAssignment_5_2
            {
            pushFollow(FOLLOW_2);
            rule__Component__LinksAssignment_5_2();

            state._fsp--;


            }

             after(grammarAccess.getComponentAccess().getLinksAssignment_5_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group_5__2__Impl"


    // $ANTLR start "rule__Component__Group_5__3"
    // InternalComposition.g:1158:1: rule__Component__Group_5__3 : rule__Component__Group_5__3__Impl rule__Component__Group_5__4 ;
    public final void rule__Component__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComposition.g:1162:1: ( rule__Component__Group_5__3__Impl rule__Component__Group_5__4 )
            // InternalComposition.g:1163:2: rule__Component__Group_5__3__Impl rule__Component__Group_5__4
            {
            pushFollow(FOLLOW_8);
            rule__Component__Group_5__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Component__Group_5__4();

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
    // $ANTLR end "rule__Component__Group_5__3"


    // $ANTLR start "rule__Component__Group_5__3__Impl"
    // InternalComposition.g:1170:1: rule__Component__Group_5__3__Impl : ( ( rule__Component__Group_5_3__0 )* ) ;
    public final void rule__Component__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComposition.g:1174:1: ( ( ( rule__Component__Group_5_3__0 )* ) )
            // InternalComposition.g:1175:1: ( ( rule__Component__Group_5_3__0 )* )
            {
            // InternalComposition.g:1175:1: ( ( rule__Component__Group_5_3__0 )* )
            // InternalComposition.g:1176:2: ( rule__Component__Group_5_3__0 )*
            {
             before(grammarAccess.getComponentAccess().getGroup_5_3()); 
            // InternalComposition.g:1177:2: ( rule__Component__Group_5_3__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==23) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalComposition.g:1177:3: rule__Component__Group_5_3__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Component__Group_5_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getComponentAccess().getGroup_5_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group_5__3__Impl"


    // $ANTLR start "rule__Component__Group_5__4"
    // InternalComposition.g:1185:1: rule__Component__Group_5__4 : rule__Component__Group_5__4__Impl ;
    public final void rule__Component__Group_5__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComposition.g:1189:1: ( rule__Component__Group_5__4__Impl )
            // InternalComposition.g:1190:2: rule__Component__Group_5__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Component__Group_5__4__Impl();

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
    // $ANTLR end "rule__Component__Group_5__4"


    // $ANTLR start "rule__Component__Group_5__4__Impl"
    // InternalComposition.g:1196:1: rule__Component__Group_5__4__Impl : ( '}' ) ;
    public final void rule__Component__Group_5__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComposition.g:1200:1: ( ( '}' ) )
            // InternalComposition.g:1201:1: ( '}' )
            {
            // InternalComposition.g:1201:1: ( '}' )
            // InternalComposition.g:1202:2: '}'
            {
             before(grammarAccess.getComponentAccess().getRightCurlyBracketKeyword_5_4()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getComponentAccess().getRightCurlyBracketKeyword_5_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group_5__4__Impl"


    // $ANTLR start "rule__Component__Group_5_3__0"
    // InternalComposition.g:1212:1: rule__Component__Group_5_3__0 : rule__Component__Group_5_3__0__Impl rule__Component__Group_5_3__1 ;
    public final void rule__Component__Group_5_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComposition.g:1216:1: ( rule__Component__Group_5_3__0__Impl rule__Component__Group_5_3__1 )
            // InternalComposition.g:1217:2: rule__Component__Group_5_3__0__Impl rule__Component__Group_5_3__1
            {
            pushFollow(FOLLOW_10);
            rule__Component__Group_5_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Component__Group_5_3__1();

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
    // $ANTLR end "rule__Component__Group_5_3__0"


    // $ANTLR start "rule__Component__Group_5_3__0__Impl"
    // InternalComposition.g:1224:1: rule__Component__Group_5_3__0__Impl : ( ',' ) ;
    public final void rule__Component__Group_5_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComposition.g:1228:1: ( ( ',' ) )
            // InternalComposition.g:1229:1: ( ',' )
            {
            // InternalComposition.g:1229:1: ( ',' )
            // InternalComposition.g:1230:2: ','
            {
             before(grammarAccess.getComponentAccess().getCommaKeyword_5_3_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getComponentAccess().getCommaKeyword_5_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group_5_3__0__Impl"


    // $ANTLR start "rule__Component__Group_5_3__1"
    // InternalComposition.g:1239:1: rule__Component__Group_5_3__1 : rule__Component__Group_5_3__1__Impl ;
    public final void rule__Component__Group_5_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComposition.g:1243:1: ( rule__Component__Group_5_3__1__Impl )
            // InternalComposition.g:1244:2: rule__Component__Group_5_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Component__Group_5_3__1__Impl();

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
    // $ANTLR end "rule__Component__Group_5_3__1"


    // $ANTLR start "rule__Component__Group_5_3__1__Impl"
    // InternalComposition.g:1250:1: rule__Component__Group_5_3__1__Impl : ( ( rule__Component__LinksAssignment_5_3_1 ) ) ;
    public final void rule__Component__Group_5_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComposition.g:1254:1: ( ( ( rule__Component__LinksAssignment_5_3_1 ) ) )
            // InternalComposition.g:1255:1: ( ( rule__Component__LinksAssignment_5_3_1 ) )
            {
            // InternalComposition.g:1255:1: ( ( rule__Component__LinksAssignment_5_3_1 ) )
            // InternalComposition.g:1256:2: ( rule__Component__LinksAssignment_5_3_1 )
            {
             before(grammarAccess.getComponentAccess().getLinksAssignment_5_3_1()); 
            // InternalComposition.g:1257:2: ( rule__Component__LinksAssignment_5_3_1 )
            // InternalComposition.g:1257:3: rule__Component__LinksAssignment_5_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Component__LinksAssignment_5_3_1();

            state._fsp--;


            }

             after(grammarAccess.getComponentAccess().getLinksAssignment_5_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group_5_3__1__Impl"


    // $ANTLR start "rule__Component__Group_6__0"
    // InternalComposition.g:1266:1: rule__Component__Group_6__0 : rule__Component__Group_6__0__Impl rule__Component__Group_6__1 ;
    public final void rule__Component__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComposition.g:1270:1: ( rule__Component__Group_6__0__Impl rule__Component__Group_6__1 )
            // InternalComposition.g:1271:2: rule__Component__Group_6__0__Impl rule__Component__Group_6__1
            {
            pushFollow(FOLLOW_3);
            rule__Component__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Component__Group_6__1();

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
    // $ANTLR end "rule__Component__Group_6__0"


    // $ANTLR start "rule__Component__Group_6__0__Impl"
    // InternalComposition.g:1278:1: rule__Component__Group_6__0__Impl : ( 'joints' ) ;
    public final void rule__Component__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComposition.g:1282:1: ( ( 'joints' ) )
            // InternalComposition.g:1283:1: ( 'joints' )
            {
            // InternalComposition.g:1283:1: ( 'joints' )
            // InternalComposition.g:1284:2: 'joints'
            {
             before(grammarAccess.getComponentAccess().getJointsKeyword_6_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getComponentAccess().getJointsKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group_6__0__Impl"


    // $ANTLR start "rule__Component__Group_6__1"
    // InternalComposition.g:1293:1: rule__Component__Group_6__1 : rule__Component__Group_6__1__Impl rule__Component__Group_6__2 ;
    public final void rule__Component__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComposition.g:1297:1: ( rule__Component__Group_6__1__Impl rule__Component__Group_6__2 )
            // InternalComposition.g:1298:2: rule__Component__Group_6__1__Impl rule__Component__Group_6__2
            {
            pushFollow(FOLLOW_11);
            rule__Component__Group_6__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Component__Group_6__2();

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
    // $ANTLR end "rule__Component__Group_6__1"


    // $ANTLR start "rule__Component__Group_6__1__Impl"
    // InternalComposition.g:1305:1: rule__Component__Group_6__1__Impl : ( '{' ) ;
    public final void rule__Component__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComposition.g:1309:1: ( ( '{' ) )
            // InternalComposition.g:1310:1: ( '{' )
            {
            // InternalComposition.g:1310:1: ( '{' )
            // InternalComposition.g:1311:2: '{'
            {
             before(grammarAccess.getComponentAccess().getLeftCurlyBracketKeyword_6_1()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getComponentAccess().getLeftCurlyBracketKeyword_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group_6__1__Impl"


    // $ANTLR start "rule__Component__Group_6__2"
    // InternalComposition.g:1320:1: rule__Component__Group_6__2 : rule__Component__Group_6__2__Impl rule__Component__Group_6__3 ;
    public final void rule__Component__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComposition.g:1324:1: ( rule__Component__Group_6__2__Impl rule__Component__Group_6__3 )
            // InternalComposition.g:1325:2: rule__Component__Group_6__2__Impl rule__Component__Group_6__3
            {
            pushFollow(FOLLOW_8);
            rule__Component__Group_6__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Component__Group_6__3();

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
    // $ANTLR end "rule__Component__Group_6__2"


    // $ANTLR start "rule__Component__Group_6__2__Impl"
    // InternalComposition.g:1332:1: rule__Component__Group_6__2__Impl : ( ( rule__Component__JointsAssignment_6_2 ) ) ;
    public final void rule__Component__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComposition.g:1336:1: ( ( ( rule__Component__JointsAssignment_6_2 ) ) )
            // InternalComposition.g:1337:1: ( ( rule__Component__JointsAssignment_6_2 ) )
            {
            // InternalComposition.g:1337:1: ( ( rule__Component__JointsAssignment_6_2 ) )
            // InternalComposition.g:1338:2: ( rule__Component__JointsAssignment_6_2 )
            {
             before(grammarAccess.getComponentAccess().getJointsAssignment_6_2()); 
            // InternalComposition.g:1339:2: ( rule__Component__JointsAssignment_6_2 )
            // InternalComposition.g:1339:3: rule__Component__JointsAssignment_6_2
            {
            pushFollow(FOLLOW_2);
            rule__Component__JointsAssignment_6_2();

            state._fsp--;


            }

             after(grammarAccess.getComponentAccess().getJointsAssignment_6_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group_6__2__Impl"


    // $ANTLR start "rule__Component__Group_6__3"
    // InternalComposition.g:1347:1: rule__Component__Group_6__3 : rule__Component__Group_6__3__Impl rule__Component__Group_6__4 ;
    public final void rule__Component__Group_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComposition.g:1351:1: ( rule__Component__Group_6__3__Impl rule__Component__Group_6__4 )
            // InternalComposition.g:1352:2: rule__Component__Group_6__3__Impl rule__Component__Group_6__4
            {
            pushFollow(FOLLOW_8);
            rule__Component__Group_6__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Component__Group_6__4();

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
    // $ANTLR end "rule__Component__Group_6__3"


    // $ANTLR start "rule__Component__Group_6__3__Impl"
    // InternalComposition.g:1359:1: rule__Component__Group_6__3__Impl : ( ( rule__Component__Group_6_3__0 )* ) ;
    public final void rule__Component__Group_6__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComposition.g:1363:1: ( ( ( rule__Component__Group_6_3__0 )* ) )
            // InternalComposition.g:1364:1: ( ( rule__Component__Group_6_3__0 )* )
            {
            // InternalComposition.g:1364:1: ( ( rule__Component__Group_6_3__0 )* )
            // InternalComposition.g:1365:2: ( rule__Component__Group_6_3__0 )*
            {
             before(grammarAccess.getComponentAccess().getGroup_6_3()); 
            // InternalComposition.g:1366:2: ( rule__Component__Group_6_3__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==23) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalComposition.g:1366:3: rule__Component__Group_6_3__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Component__Group_6_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getComponentAccess().getGroup_6_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group_6__3__Impl"


    // $ANTLR start "rule__Component__Group_6__4"
    // InternalComposition.g:1374:1: rule__Component__Group_6__4 : rule__Component__Group_6__4__Impl ;
    public final void rule__Component__Group_6__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComposition.g:1378:1: ( rule__Component__Group_6__4__Impl )
            // InternalComposition.g:1379:2: rule__Component__Group_6__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Component__Group_6__4__Impl();

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
    // $ANTLR end "rule__Component__Group_6__4"


    // $ANTLR start "rule__Component__Group_6__4__Impl"
    // InternalComposition.g:1385:1: rule__Component__Group_6__4__Impl : ( '}' ) ;
    public final void rule__Component__Group_6__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComposition.g:1389:1: ( ( '}' ) )
            // InternalComposition.g:1390:1: ( '}' )
            {
            // InternalComposition.g:1390:1: ( '}' )
            // InternalComposition.g:1391:2: '}'
            {
             before(grammarAccess.getComponentAccess().getRightCurlyBracketKeyword_6_4()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getComponentAccess().getRightCurlyBracketKeyword_6_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group_6__4__Impl"


    // $ANTLR start "rule__Component__Group_6_3__0"
    // InternalComposition.g:1401:1: rule__Component__Group_6_3__0 : rule__Component__Group_6_3__0__Impl rule__Component__Group_6_3__1 ;
    public final void rule__Component__Group_6_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComposition.g:1405:1: ( rule__Component__Group_6_3__0__Impl rule__Component__Group_6_3__1 )
            // InternalComposition.g:1406:2: rule__Component__Group_6_3__0__Impl rule__Component__Group_6_3__1
            {
            pushFollow(FOLLOW_11);
            rule__Component__Group_6_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Component__Group_6_3__1();

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
    // $ANTLR end "rule__Component__Group_6_3__0"


    // $ANTLR start "rule__Component__Group_6_3__0__Impl"
    // InternalComposition.g:1413:1: rule__Component__Group_6_3__0__Impl : ( ',' ) ;
    public final void rule__Component__Group_6_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComposition.g:1417:1: ( ( ',' ) )
            // InternalComposition.g:1418:1: ( ',' )
            {
            // InternalComposition.g:1418:1: ( ',' )
            // InternalComposition.g:1419:2: ','
            {
             before(grammarAccess.getComponentAccess().getCommaKeyword_6_3_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getComponentAccess().getCommaKeyword_6_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group_6_3__0__Impl"


    // $ANTLR start "rule__Component__Group_6_3__1"
    // InternalComposition.g:1428:1: rule__Component__Group_6_3__1 : rule__Component__Group_6_3__1__Impl ;
    public final void rule__Component__Group_6_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComposition.g:1432:1: ( rule__Component__Group_6_3__1__Impl )
            // InternalComposition.g:1433:2: rule__Component__Group_6_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Component__Group_6_3__1__Impl();

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
    // $ANTLR end "rule__Component__Group_6_3__1"


    // $ANTLR start "rule__Component__Group_6_3__1__Impl"
    // InternalComposition.g:1439:1: rule__Component__Group_6_3__1__Impl : ( ( rule__Component__JointsAssignment_6_3_1 ) ) ;
    public final void rule__Component__Group_6_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComposition.g:1443:1: ( ( ( rule__Component__JointsAssignment_6_3_1 ) ) )
            // InternalComposition.g:1444:1: ( ( rule__Component__JointsAssignment_6_3_1 ) )
            {
            // InternalComposition.g:1444:1: ( ( rule__Component__JointsAssignment_6_3_1 ) )
            // InternalComposition.g:1445:2: ( rule__Component__JointsAssignment_6_3_1 )
            {
             before(grammarAccess.getComponentAccess().getJointsAssignment_6_3_1()); 
            // InternalComposition.g:1446:2: ( rule__Component__JointsAssignment_6_3_1 )
            // InternalComposition.g:1446:3: rule__Component__JointsAssignment_6_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Component__JointsAssignment_6_3_1();

            state._fsp--;


            }

             after(grammarAccess.getComponentAccess().getJointsAssignment_6_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group_6_3__1__Impl"


    // $ANTLR start "rule__Component__Group_7__0"
    // InternalComposition.g:1455:1: rule__Component__Group_7__0 : rule__Component__Group_7__0__Impl rule__Component__Group_7__1 ;
    public final void rule__Component__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComposition.g:1459:1: ( rule__Component__Group_7__0__Impl rule__Component__Group_7__1 )
            // InternalComposition.g:1460:2: rule__Component__Group_7__0__Impl rule__Component__Group_7__1
            {
            pushFollow(FOLLOW_12);
            rule__Component__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Component__Group_7__1();

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
    // $ANTLR end "rule__Component__Group_7__0"


    // $ANTLR start "rule__Component__Group_7__0__Impl"
    // InternalComposition.g:1467:1: rule__Component__Group_7__0__Impl : ( 'components' ) ;
    public final void rule__Component__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComposition.g:1471:1: ( ( 'components' ) )
            // InternalComposition.g:1472:1: ( 'components' )
            {
            // InternalComposition.g:1472:1: ( 'components' )
            // InternalComposition.g:1473:2: 'components'
            {
             before(grammarAccess.getComponentAccess().getComponentsKeyword_7_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getComponentAccess().getComponentsKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group_7__0__Impl"


    // $ANTLR start "rule__Component__Group_7__1"
    // InternalComposition.g:1482:1: rule__Component__Group_7__1 : rule__Component__Group_7__1__Impl rule__Component__Group_7__2 ;
    public final void rule__Component__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComposition.g:1486:1: ( rule__Component__Group_7__1__Impl rule__Component__Group_7__2 )
            // InternalComposition.g:1487:2: rule__Component__Group_7__1__Impl rule__Component__Group_7__2
            {
            pushFollow(FOLLOW_13);
            rule__Component__Group_7__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Component__Group_7__2();

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
    // $ANTLR end "rule__Component__Group_7__1"


    // $ANTLR start "rule__Component__Group_7__1__Impl"
    // InternalComposition.g:1494:1: rule__Component__Group_7__1__Impl : ( '(' ) ;
    public final void rule__Component__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComposition.g:1498:1: ( ( '(' ) )
            // InternalComposition.g:1499:1: ( '(' )
            {
            // InternalComposition.g:1499:1: ( '(' )
            // InternalComposition.g:1500:2: '('
            {
             before(grammarAccess.getComponentAccess().getLeftParenthesisKeyword_7_1()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getComponentAccess().getLeftParenthesisKeyword_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group_7__1__Impl"


    // $ANTLR start "rule__Component__Group_7__2"
    // InternalComposition.g:1509:1: rule__Component__Group_7__2 : rule__Component__Group_7__2__Impl rule__Component__Group_7__3 ;
    public final void rule__Component__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComposition.g:1513:1: ( rule__Component__Group_7__2__Impl rule__Component__Group_7__3 )
            // InternalComposition.g:1514:2: rule__Component__Group_7__2__Impl rule__Component__Group_7__3
            {
            pushFollow(FOLLOW_14);
            rule__Component__Group_7__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Component__Group_7__3();

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
    // $ANTLR end "rule__Component__Group_7__2"


    // $ANTLR start "rule__Component__Group_7__2__Impl"
    // InternalComposition.g:1521:1: rule__Component__Group_7__2__Impl : ( ( rule__Component__ComponentsAssignment_7_2 ) ) ;
    public final void rule__Component__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComposition.g:1525:1: ( ( ( rule__Component__ComponentsAssignment_7_2 ) ) )
            // InternalComposition.g:1526:1: ( ( rule__Component__ComponentsAssignment_7_2 ) )
            {
            // InternalComposition.g:1526:1: ( ( rule__Component__ComponentsAssignment_7_2 ) )
            // InternalComposition.g:1527:2: ( rule__Component__ComponentsAssignment_7_2 )
            {
             before(grammarAccess.getComponentAccess().getComponentsAssignment_7_2()); 
            // InternalComposition.g:1528:2: ( rule__Component__ComponentsAssignment_7_2 )
            // InternalComposition.g:1528:3: rule__Component__ComponentsAssignment_7_2
            {
            pushFollow(FOLLOW_2);
            rule__Component__ComponentsAssignment_7_2();

            state._fsp--;


            }

             after(grammarAccess.getComponentAccess().getComponentsAssignment_7_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group_7__2__Impl"


    // $ANTLR start "rule__Component__Group_7__3"
    // InternalComposition.g:1536:1: rule__Component__Group_7__3 : rule__Component__Group_7__3__Impl rule__Component__Group_7__4 ;
    public final void rule__Component__Group_7__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComposition.g:1540:1: ( rule__Component__Group_7__3__Impl rule__Component__Group_7__4 )
            // InternalComposition.g:1541:2: rule__Component__Group_7__3__Impl rule__Component__Group_7__4
            {
            pushFollow(FOLLOW_14);
            rule__Component__Group_7__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Component__Group_7__4();

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
    // $ANTLR end "rule__Component__Group_7__3"


    // $ANTLR start "rule__Component__Group_7__3__Impl"
    // InternalComposition.g:1548:1: rule__Component__Group_7__3__Impl : ( ( rule__Component__Group_7_3__0 )* ) ;
    public final void rule__Component__Group_7__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComposition.g:1552:1: ( ( ( rule__Component__Group_7_3__0 )* ) )
            // InternalComposition.g:1553:1: ( ( rule__Component__Group_7_3__0 )* )
            {
            // InternalComposition.g:1553:1: ( ( rule__Component__Group_7_3__0 )* )
            // InternalComposition.g:1554:2: ( rule__Component__Group_7_3__0 )*
            {
             before(grammarAccess.getComponentAccess().getGroup_7_3()); 
            // InternalComposition.g:1555:2: ( rule__Component__Group_7_3__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==23) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalComposition.g:1555:3: rule__Component__Group_7_3__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Component__Group_7_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getComponentAccess().getGroup_7_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group_7__3__Impl"


    // $ANTLR start "rule__Component__Group_7__4"
    // InternalComposition.g:1563:1: rule__Component__Group_7__4 : rule__Component__Group_7__4__Impl ;
    public final void rule__Component__Group_7__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComposition.g:1567:1: ( rule__Component__Group_7__4__Impl )
            // InternalComposition.g:1568:2: rule__Component__Group_7__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Component__Group_7__4__Impl();

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
    // $ANTLR end "rule__Component__Group_7__4"


    // $ANTLR start "rule__Component__Group_7__4__Impl"
    // InternalComposition.g:1574:1: rule__Component__Group_7__4__Impl : ( ')' ) ;
    public final void rule__Component__Group_7__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComposition.g:1578:1: ( ( ')' ) )
            // InternalComposition.g:1579:1: ( ')' )
            {
            // InternalComposition.g:1579:1: ( ')' )
            // InternalComposition.g:1580:2: ')'
            {
             before(grammarAccess.getComponentAccess().getRightParenthesisKeyword_7_4()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getComponentAccess().getRightParenthesisKeyword_7_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group_7__4__Impl"


    // $ANTLR start "rule__Component__Group_7_3__0"
    // InternalComposition.g:1590:1: rule__Component__Group_7_3__0 : rule__Component__Group_7_3__0__Impl rule__Component__Group_7_3__1 ;
    public final void rule__Component__Group_7_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComposition.g:1594:1: ( rule__Component__Group_7_3__0__Impl rule__Component__Group_7_3__1 )
            // InternalComposition.g:1595:2: rule__Component__Group_7_3__0__Impl rule__Component__Group_7_3__1
            {
            pushFollow(FOLLOW_13);
            rule__Component__Group_7_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Component__Group_7_3__1();

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
    // $ANTLR end "rule__Component__Group_7_3__0"


    // $ANTLR start "rule__Component__Group_7_3__0__Impl"
    // InternalComposition.g:1602:1: rule__Component__Group_7_3__0__Impl : ( ',' ) ;
    public final void rule__Component__Group_7_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComposition.g:1606:1: ( ( ',' ) )
            // InternalComposition.g:1607:1: ( ',' )
            {
            // InternalComposition.g:1607:1: ( ',' )
            // InternalComposition.g:1608:2: ','
            {
             before(grammarAccess.getComponentAccess().getCommaKeyword_7_3_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getComponentAccess().getCommaKeyword_7_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group_7_3__0__Impl"


    // $ANTLR start "rule__Component__Group_7_3__1"
    // InternalComposition.g:1617:1: rule__Component__Group_7_3__1 : rule__Component__Group_7_3__1__Impl ;
    public final void rule__Component__Group_7_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComposition.g:1621:1: ( rule__Component__Group_7_3__1__Impl )
            // InternalComposition.g:1622:2: rule__Component__Group_7_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Component__Group_7_3__1__Impl();

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
    // $ANTLR end "rule__Component__Group_7_3__1"


    // $ANTLR start "rule__Component__Group_7_3__1__Impl"
    // InternalComposition.g:1628:1: rule__Component__Group_7_3__1__Impl : ( ( rule__Component__ComponentsAssignment_7_3_1 ) ) ;
    public final void rule__Component__Group_7_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComposition.g:1632:1: ( ( ( rule__Component__ComponentsAssignment_7_3_1 ) ) )
            // InternalComposition.g:1633:1: ( ( rule__Component__ComponentsAssignment_7_3_1 ) )
            {
            // InternalComposition.g:1633:1: ( ( rule__Component__ComponentsAssignment_7_3_1 ) )
            // InternalComposition.g:1634:2: ( rule__Component__ComponentsAssignment_7_3_1 )
            {
             before(grammarAccess.getComponentAccess().getComponentsAssignment_7_3_1()); 
            // InternalComposition.g:1635:2: ( rule__Component__ComponentsAssignment_7_3_1 )
            // InternalComposition.g:1635:3: rule__Component__ComponentsAssignment_7_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Component__ComponentsAssignment_7_3_1();

            state._fsp--;


            }

             after(grammarAccess.getComponentAccess().getComponentsAssignment_7_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group_7_3__1__Impl"


    // $ANTLR start "rule__ComponentInstance__Group__0"
    // InternalComposition.g:1644:1: rule__ComponentInstance__Group__0 : rule__ComponentInstance__Group__0__Impl rule__ComponentInstance__Group__1 ;
    public final void rule__ComponentInstance__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComposition.g:1648:1: ( rule__ComponentInstance__Group__0__Impl rule__ComponentInstance__Group__1 )
            // InternalComposition.g:1649:2: rule__ComponentInstance__Group__0__Impl rule__ComponentInstance__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__ComponentInstance__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComponentInstance__Group__1();

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
    // $ANTLR end "rule__ComponentInstance__Group__0"


    // $ANTLR start "rule__ComponentInstance__Group__0__Impl"
    // InternalComposition.g:1656:1: rule__ComponentInstance__Group__0__Impl : ( 'ComponentInstance' ) ;
    public final void rule__ComponentInstance__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComposition.g:1660:1: ( ( 'ComponentInstance' ) )
            // InternalComposition.g:1661:1: ( 'ComponentInstance' )
            {
            // InternalComposition.g:1661:1: ( 'ComponentInstance' )
            // InternalComposition.g:1662:2: 'ComponentInstance'
            {
             before(grammarAccess.getComponentInstanceAccess().getComponentInstanceKeyword_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getComponentInstanceAccess().getComponentInstanceKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInstance__Group__0__Impl"


    // $ANTLR start "rule__ComponentInstance__Group__1"
    // InternalComposition.g:1671:1: rule__ComponentInstance__Group__1 : rule__ComponentInstance__Group__1__Impl rule__ComponentInstance__Group__2 ;
    public final void rule__ComponentInstance__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComposition.g:1675:1: ( rule__ComponentInstance__Group__1__Impl rule__ComponentInstance__Group__2 )
            // InternalComposition.g:1676:2: rule__ComponentInstance__Group__1__Impl rule__ComponentInstance__Group__2
            {
            pushFollow(FOLLOW_15);
            rule__ComponentInstance__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComponentInstance__Group__2();

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
    // $ANTLR end "rule__ComponentInstance__Group__1"


    // $ANTLR start "rule__ComponentInstance__Group__1__Impl"
    // InternalComposition.g:1683:1: rule__ComponentInstance__Group__1__Impl : ( '{' ) ;
    public final void rule__ComponentInstance__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComposition.g:1687:1: ( ( '{' ) )
            // InternalComposition.g:1688:1: ( '{' )
            {
            // InternalComposition.g:1688:1: ( '{' )
            // InternalComposition.g:1689:2: '{'
            {
             before(grammarAccess.getComponentInstanceAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getComponentInstanceAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInstance__Group__1__Impl"


    // $ANTLR start "rule__ComponentInstance__Group__2"
    // InternalComposition.g:1698:1: rule__ComponentInstance__Group__2 : rule__ComponentInstance__Group__2__Impl rule__ComponentInstance__Group__3 ;
    public final void rule__ComponentInstance__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComposition.g:1702:1: ( rule__ComponentInstance__Group__2__Impl rule__ComponentInstance__Group__3 )
            // InternalComposition.g:1703:2: rule__ComponentInstance__Group__2__Impl rule__ComponentInstance__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__ComponentInstance__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComponentInstance__Group__3();

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
    // $ANTLR end "rule__ComponentInstance__Group__2"


    // $ANTLR start "rule__ComponentInstance__Group__2__Impl"
    // InternalComposition.g:1710:1: rule__ComponentInstance__Group__2__Impl : ( 'type' ) ;
    public final void rule__ComponentInstance__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComposition.g:1714:1: ( ( 'type' ) )
            // InternalComposition.g:1715:1: ( 'type' )
            {
            // InternalComposition.g:1715:1: ( 'type' )
            // InternalComposition.g:1716:2: 'type'
            {
             before(grammarAccess.getComponentInstanceAccess().getTypeKeyword_2()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getComponentInstanceAccess().getTypeKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInstance__Group__2__Impl"


    // $ANTLR start "rule__ComponentInstance__Group__3"
    // InternalComposition.g:1725:1: rule__ComponentInstance__Group__3 : rule__ComponentInstance__Group__3__Impl rule__ComponentInstance__Group__4 ;
    public final void rule__ComponentInstance__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComposition.g:1729:1: ( rule__ComponentInstance__Group__3__Impl rule__ComponentInstance__Group__4 )
            // InternalComposition.g:1730:2: rule__ComponentInstance__Group__3__Impl rule__ComponentInstance__Group__4
            {
            pushFollow(FOLLOW_16);
            rule__ComponentInstance__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComponentInstance__Group__4();

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
    // $ANTLR end "rule__ComponentInstance__Group__3"


    // $ANTLR start "rule__ComponentInstance__Group__3__Impl"
    // InternalComposition.g:1737:1: rule__ComponentInstance__Group__3__Impl : ( ( rule__ComponentInstance__TypeAssignment_3 ) ) ;
    public final void rule__ComponentInstance__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComposition.g:1741:1: ( ( ( rule__ComponentInstance__TypeAssignment_3 ) ) )
            // InternalComposition.g:1742:1: ( ( rule__ComponentInstance__TypeAssignment_3 ) )
            {
            // InternalComposition.g:1742:1: ( ( rule__ComponentInstance__TypeAssignment_3 ) )
            // InternalComposition.g:1743:2: ( rule__ComponentInstance__TypeAssignment_3 )
            {
             before(grammarAccess.getComponentInstanceAccess().getTypeAssignment_3()); 
            // InternalComposition.g:1744:2: ( rule__ComponentInstance__TypeAssignment_3 )
            // InternalComposition.g:1744:3: rule__ComponentInstance__TypeAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__ComponentInstance__TypeAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getComponentInstanceAccess().getTypeAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInstance__Group__3__Impl"


    // $ANTLR start "rule__ComponentInstance__Group__4"
    // InternalComposition.g:1752:1: rule__ComponentInstance__Group__4 : rule__ComponentInstance__Group__4__Impl rule__ComponentInstance__Group__5 ;
    public final void rule__ComponentInstance__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComposition.g:1756:1: ( rule__ComponentInstance__Group__4__Impl rule__ComponentInstance__Group__5 )
            // InternalComposition.g:1757:2: rule__ComponentInstance__Group__4__Impl rule__ComponentInstance__Group__5
            {
            pushFollow(FOLLOW_16);
            rule__ComponentInstance__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComponentInstance__Group__5();

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
    // $ANTLR end "rule__ComponentInstance__Group__4"


    // $ANTLR start "rule__ComponentInstance__Group__4__Impl"
    // InternalComposition.g:1764:1: rule__ComponentInstance__Group__4__Impl : ( ( rule__ComponentInstance__Group_4__0 )? ) ;
    public final void rule__ComponentInstance__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComposition.g:1768:1: ( ( ( rule__ComponentInstance__Group_4__0 )? ) )
            // InternalComposition.g:1769:1: ( ( rule__ComponentInstance__Group_4__0 )? )
            {
            // InternalComposition.g:1769:1: ( ( rule__ComponentInstance__Group_4__0 )? )
            // InternalComposition.g:1770:2: ( rule__ComponentInstance__Group_4__0 )?
            {
             before(grammarAccess.getComponentInstanceAccess().getGroup_4()); 
            // InternalComposition.g:1771:2: ( rule__ComponentInstance__Group_4__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==22) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalComposition.g:1771:3: rule__ComponentInstance__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ComponentInstance__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getComponentInstanceAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInstance__Group__4__Impl"


    // $ANTLR start "rule__ComponentInstance__Group__5"
    // InternalComposition.g:1779:1: rule__ComponentInstance__Group__5 : rule__ComponentInstance__Group__5__Impl ;
    public final void rule__ComponentInstance__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComposition.g:1783:1: ( rule__ComponentInstance__Group__5__Impl )
            // InternalComposition.g:1784:2: rule__ComponentInstance__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ComponentInstance__Group__5__Impl();

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
    // $ANTLR end "rule__ComponentInstance__Group__5"


    // $ANTLR start "rule__ComponentInstance__Group__5__Impl"
    // InternalComposition.g:1790:1: rule__ComponentInstance__Group__5__Impl : ( '}' ) ;
    public final void rule__ComponentInstance__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComposition.g:1794:1: ( ( '}' ) )
            // InternalComposition.g:1795:1: ( '}' )
            {
            // InternalComposition.g:1795:1: ( '}' )
            // InternalComposition.g:1796:2: '}'
            {
             before(grammarAccess.getComponentInstanceAccess().getRightCurlyBracketKeyword_5()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getComponentInstanceAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInstance__Group__5__Impl"


    // $ANTLR start "rule__ComponentInstance__Group_4__0"
    // InternalComposition.g:1806:1: rule__ComponentInstance__Group_4__0 : rule__ComponentInstance__Group_4__0__Impl rule__ComponentInstance__Group_4__1 ;
    public final void rule__ComponentInstance__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComposition.g:1810:1: ( rule__ComponentInstance__Group_4__0__Impl rule__ComponentInstance__Group_4__1 )
            // InternalComposition.g:1811:2: rule__ComponentInstance__Group_4__0__Impl rule__ComponentInstance__Group_4__1
            {
            pushFollow(FOLLOW_12);
            rule__ComponentInstance__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComponentInstance__Group_4__1();

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
    // $ANTLR end "rule__ComponentInstance__Group_4__0"


    // $ANTLR start "rule__ComponentInstance__Group_4__0__Impl"
    // InternalComposition.g:1818:1: rule__ComponentInstance__Group_4__0__Impl : ( 'parameters' ) ;
    public final void rule__ComponentInstance__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComposition.g:1822:1: ( ( 'parameters' ) )
            // InternalComposition.g:1823:1: ( 'parameters' )
            {
            // InternalComposition.g:1823:1: ( 'parameters' )
            // InternalComposition.g:1824:2: 'parameters'
            {
             before(grammarAccess.getComponentInstanceAccess().getParametersKeyword_4_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getComponentInstanceAccess().getParametersKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInstance__Group_4__0__Impl"


    // $ANTLR start "rule__ComponentInstance__Group_4__1"
    // InternalComposition.g:1833:1: rule__ComponentInstance__Group_4__1 : rule__ComponentInstance__Group_4__1__Impl rule__ComponentInstance__Group_4__2 ;
    public final void rule__ComponentInstance__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComposition.g:1837:1: ( rule__ComponentInstance__Group_4__1__Impl rule__ComponentInstance__Group_4__2 )
            // InternalComposition.g:1838:2: rule__ComponentInstance__Group_4__1__Impl rule__ComponentInstance__Group_4__2
            {
            pushFollow(FOLLOW_17);
            rule__ComponentInstance__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComponentInstance__Group_4__2();

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
    // $ANTLR end "rule__ComponentInstance__Group_4__1"


    // $ANTLR start "rule__ComponentInstance__Group_4__1__Impl"
    // InternalComposition.g:1845:1: rule__ComponentInstance__Group_4__1__Impl : ( '(' ) ;
    public final void rule__ComponentInstance__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComposition.g:1849:1: ( ( '(' ) )
            // InternalComposition.g:1850:1: ( '(' )
            {
            // InternalComposition.g:1850:1: ( '(' )
            // InternalComposition.g:1851:2: '('
            {
             before(grammarAccess.getComponentInstanceAccess().getLeftParenthesisKeyword_4_1()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getComponentInstanceAccess().getLeftParenthesisKeyword_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInstance__Group_4__1__Impl"


    // $ANTLR start "rule__ComponentInstance__Group_4__2"
    // InternalComposition.g:1860:1: rule__ComponentInstance__Group_4__2 : rule__ComponentInstance__Group_4__2__Impl rule__ComponentInstance__Group_4__3 ;
    public final void rule__ComponentInstance__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComposition.g:1864:1: ( rule__ComponentInstance__Group_4__2__Impl rule__ComponentInstance__Group_4__3 )
            // InternalComposition.g:1865:2: rule__ComponentInstance__Group_4__2__Impl rule__ComponentInstance__Group_4__3
            {
            pushFollow(FOLLOW_14);
            rule__ComponentInstance__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComponentInstance__Group_4__3();

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
    // $ANTLR end "rule__ComponentInstance__Group_4__2"


    // $ANTLR start "rule__ComponentInstance__Group_4__2__Impl"
    // InternalComposition.g:1872:1: rule__ComponentInstance__Group_4__2__Impl : ( ( rule__ComponentInstance__ParametersAssignment_4_2 ) ) ;
    public final void rule__ComponentInstance__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComposition.g:1876:1: ( ( ( rule__ComponentInstance__ParametersAssignment_4_2 ) ) )
            // InternalComposition.g:1877:1: ( ( rule__ComponentInstance__ParametersAssignment_4_2 ) )
            {
            // InternalComposition.g:1877:1: ( ( rule__ComponentInstance__ParametersAssignment_4_2 ) )
            // InternalComposition.g:1878:2: ( rule__ComponentInstance__ParametersAssignment_4_2 )
            {
             before(grammarAccess.getComponentInstanceAccess().getParametersAssignment_4_2()); 
            // InternalComposition.g:1879:2: ( rule__ComponentInstance__ParametersAssignment_4_2 )
            // InternalComposition.g:1879:3: rule__ComponentInstance__ParametersAssignment_4_2
            {
            pushFollow(FOLLOW_2);
            rule__ComponentInstance__ParametersAssignment_4_2();

            state._fsp--;


            }

             after(grammarAccess.getComponentInstanceAccess().getParametersAssignment_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInstance__Group_4__2__Impl"


    // $ANTLR start "rule__ComponentInstance__Group_4__3"
    // InternalComposition.g:1887:1: rule__ComponentInstance__Group_4__3 : rule__ComponentInstance__Group_4__3__Impl rule__ComponentInstance__Group_4__4 ;
    public final void rule__ComponentInstance__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComposition.g:1891:1: ( rule__ComponentInstance__Group_4__3__Impl rule__ComponentInstance__Group_4__4 )
            // InternalComposition.g:1892:2: rule__ComponentInstance__Group_4__3__Impl rule__ComponentInstance__Group_4__4
            {
            pushFollow(FOLLOW_14);
            rule__ComponentInstance__Group_4__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComponentInstance__Group_4__4();

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
    // $ANTLR end "rule__ComponentInstance__Group_4__3"


    // $ANTLR start "rule__ComponentInstance__Group_4__3__Impl"
    // InternalComposition.g:1899:1: rule__ComponentInstance__Group_4__3__Impl : ( ( rule__ComponentInstance__Group_4_3__0 )* ) ;
    public final void rule__ComponentInstance__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComposition.g:1903:1: ( ( ( rule__ComponentInstance__Group_4_3__0 )* ) )
            // InternalComposition.g:1904:1: ( ( rule__ComponentInstance__Group_4_3__0 )* )
            {
            // InternalComposition.g:1904:1: ( ( rule__ComponentInstance__Group_4_3__0 )* )
            // InternalComposition.g:1905:2: ( rule__ComponentInstance__Group_4_3__0 )*
            {
             before(grammarAccess.getComponentInstanceAccess().getGroup_4_3()); 
            // InternalComposition.g:1906:2: ( rule__ComponentInstance__Group_4_3__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==23) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalComposition.g:1906:3: rule__ComponentInstance__Group_4_3__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__ComponentInstance__Group_4_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getComponentInstanceAccess().getGroup_4_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInstance__Group_4__3__Impl"


    // $ANTLR start "rule__ComponentInstance__Group_4__4"
    // InternalComposition.g:1914:1: rule__ComponentInstance__Group_4__4 : rule__ComponentInstance__Group_4__4__Impl ;
    public final void rule__ComponentInstance__Group_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComposition.g:1918:1: ( rule__ComponentInstance__Group_4__4__Impl )
            // InternalComposition.g:1919:2: rule__ComponentInstance__Group_4__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ComponentInstance__Group_4__4__Impl();

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
    // $ANTLR end "rule__ComponentInstance__Group_4__4"


    // $ANTLR start "rule__ComponentInstance__Group_4__4__Impl"
    // InternalComposition.g:1925:1: rule__ComponentInstance__Group_4__4__Impl : ( ')' ) ;
    public final void rule__ComponentInstance__Group_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComposition.g:1929:1: ( ( ')' ) )
            // InternalComposition.g:1930:1: ( ')' )
            {
            // InternalComposition.g:1930:1: ( ')' )
            // InternalComposition.g:1931:2: ')'
            {
             before(grammarAccess.getComponentInstanceAccess().getRightParenthesisKeyword_4_4()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getComponentInstanceAccess().getRightParenthesisKeyword_4_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInstance__Group_4__4__Impl"


    // $ANTLR start "rule__ComponentInstance__Group_4_3__0"
    // InternalComposition.g:1941:1: rule__ComponentInstance__Group_4_3__0 : rule__ComponentInstance__Group_4_3__0__Impl rule__ComponentInstance__Group_4_3__1 ;
    public final void rule__ComponentInstance__Group_4_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComposition.g:1945:1: ( rule__ComponentInstance__Group_4_3__0__Impl rule__ComponentInstance__Group_4_3__1 )
            // InternalComposition.g:1946:2: rule__ComponentInstance__Group_4_3__0__Impl rule__ComponentInstance__Group_4_3__1
            {
            pushFollow(FOLLOW_17);
            rule__ComponentInstance__Group_4_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComponentInstance__Group_4_3__1();

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
    // $ANTLR end "rule__ComponentInstance__Group_4_3__0"


    // $ANTLR start "rule__ComponentInstance__Group_4_3__0__Impl"
    // InternalComposition.g:1953:1: rule__ComponentInstance__Group_4_3__0__Impl : ( ',' ) ;
    public final void rule__ComponentInstance__Group_4_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComposition.g:1957:1: ( ( ',' ) )
            // InternalComposition.g:1958:1: ( ',' )
            {
            // InternalComposition.g:1958:1: ( ',' )
            // InternalComposition.g:1959:2: ','
            {
             before(grammarAccess.getComponentInstanceAccess().getCommaKeyword_4_3_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getComponentInstanceAccess().getCommaKeyword_4_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInstance__Group_4_3__0__Impl"


    // $ANTLR start "rule__ComponentInstance__Group_4_3__1"
    // InternalComposition.g:1968:1: rule__ComponentInstance__Group_4_3__1 : rule__ComponentInstance__Group_4_3__1__Impl ;
    public final void rule__ComponentInstance__Group_4_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComposition.g:1972:1: ( rule__ComponentInstance__Group_4_3__1__Impl )
            // InternalComposition.g:1973:2: rule__ComponentInstance__Group_4_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ComponentInstance__Group_4_3__1__Impl();

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
    // $ANTLR end "rule__ComponentInstance__Group_4_3__1"


    // $ANTLR start "rule__ComponentInstance__Group_4_3__1__Impl"
    // InternalComposition.g:1979:1: rule__ComponentInstance__Group_4_3__1__Impl : ( ( rule__ComponentInstance__ParametersAssignment_4_3_1 ) ) ;
    public final void rule__ComponentInstance__Group_4_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComposition.g:1983:1: ( ( ( rule__ComponentInstance__ParametersAssignment_4_3_1 ) ) )
            // InternalComposition.g:1984:1: ( ( rule__ComponentInstance__ParametersAssignment_4_3_1 ) )
            {
            // InternalComposition.g:1984:1: ( ( rule__ComponentInstance__ParametersAssignment_4_3_1 ) )
            // InternalComposition.g:1985:2: ( rule__ComponentInstance__ParametersAssignment_4_3_1 )
            {
             before(grammarAccess.getComponentInstanceAccess().getParametersAssignment_4_3_1()); 
            // InternalComposition.g:1986:2: ( rule__ComponentInstance__ParametersAssignment_4_3_1 )
            // InternalComposition.g:1986:3: rule__ComponentInstance__ParametersAssignment_4_3_1
            {
            pushFollow(FOLLOW_2);
            rule__ComponentInstance__ParametersAssignment_4_3_1();

            state._fsp--;


            }

             after(grammarAccess.getComponentInstanceAccess().getParametersAssignment_4_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInstance__Group_4_3__1__Impl"


    // $ANTLR start "rule__Parameter__Group__0"
    // InternalComposition.g:1995:1: rule__Parameter__Group__0 : rule__Parameter__Group__0__Impl rule__Parameter__Group__1 ;
    public final void rule__Parameter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComposition.g:1999:1: ( rule__Parameter__Group__0__Impl rule__Parameter__Group__1 )
            // InternalComposition.g:2000:2: rule__Parameter__Group__0__Impl rule__Parameter__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Parameter__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parameter__Group__1();

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
    // $ANTLR end "rule__Parameter__Group__0"


    // $ANTLR start "rule__Parameter__Group__0__Impl"
    // InternalComposition.g:2007:1: rule__Parameter__Group__0__Impl : ( 'Parameter' ) ;
    public final void rule__Parameter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComposition.g:2011:1: ( ( 'Parameter' ) )
            // InternalComposition.g:2012:1: ( 'Parameter' )
            {
            // InternalComposition.g:2012:1: ( 'Parameter' )
            // InternalComposition.g:2013:2: 'Parameter'
            {
             before(grammarAccess.getParameterAccess().getParameterKeyword_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getParameterAccess().getParameterKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__0__Impl"


    // $ANTLR start "rule__Parameter__Group__1"
    // InternalComposition.g:2022:1: rule__Parameter__Group__1 : rule__Parameter__Group__1__Impl rule__Parameter__Group__2 ;
    public final void rule__Parameter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComposition.g:2026:1: ( rule__Parameter__Group__1__Impl rule__Parameter__Group__2 )
            // InternalComposition.g:2027:2: rule__Parameter__Group__1__Impl rule__Parameter__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__Parameter__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parameter__Group__2();

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
    // $ANTLR end "rule__Parameter__Group__1"


    // $ANTLR start "rule__Parameter__Group__1__Impl"
    // InternalComposition.g:2034:1: rule__Parameter__Group__1__Impl : ( ( rule__Parameter__NameAssignment_1 ) ) ;
    public final void rule__Parameter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComposition.g:2038:1: ( ( ( rule__Parameter__NameAssignment_1 ) ) )
            // InternalComposition.g:2039:1: ( ( rule__Parameter__NameAssignment_1 ) )
            {
            // InternalComposition.g:2039:1: ( ( rule__Parameter__NameAssignment_1 ) )
            // InternalComposition.g:2040:2: ( rule__Parameter__NameAssignment_1 )
            {
             before(grammarAccess.getParameterAccess().getNameAssignment_1()); 
            // InternalComposition.g:2041:2: ( rule__Parameter__NameAssignment_1 )
            // InternalComposition.g:2041:3: rule__Parameter__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Parameter__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getParameterAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__1__Impl"


    // $ANTLR start "rule__Parameter__Group__2"
    // InternalComposition.g:2049:1: rule__Parameter__Group__2 : rule__Parameter__Group__2__Impl rule__Parameter__Group__3 ;
    public final void rule__Parameter__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComposition.g:2053:1: ( rule__Parameter__Group__2__Impl rule__Parameter__Group__3 )
            // InternalComposition.g:2054:2: rule__Parameter__Group__2__Impl rule__Parameter__Group__3
            {
            pushFollow(FOLLOW_15);
            rule__Parameter__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parameter__Group__3();

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
    // $ANTLR end "rule__Parameter__Group__2"


    // $ANTLR start "rule__Parameter__Group__2__Impl"
    // InternalComposition.g:2061:1: rule__Parameter__Group__2__Impl : ( '{' ) ;
    public final void rule__Parameter__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComposition.g:2065:1: ( ( '{' ) )
            // InternalComposition.g:2066:1: ( '{' )
            {
            // InternalComposition.g:2066:1: ( '{' )
            // InternalComposition.g:2067:2: '{'
            {
             before(grammarAccess.getParameterAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getParameterAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__2__Impl"


    // $ANTLR start "rule__Parameter__Group__3"
    // InternalComposition.g:2076:1: rule__Parameter__Group__3 : rule__Parameter__Group__3__Impl rule__Parameter__Group__4 ;
    public final void rule__Parameter__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComposition.g:2080:1: ( rule__Parameter__Group__3__Impl rule__Parameter__Group__4 )
            // InternalComposition.g:2081:2: rule__Parameter__Group__3__Impl rule__Parameter__Group__4
            {
            pushFollow(FOLLOW_18);
            rule__Parameter__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parameter__Group__4();

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
    // $ANTLR end "rule__Parameter__Group__3"


    // $ANTLR start "rule__Parameter__Group__3__Impl"
    // InternalComposition.g:2088:1: rule__Parameter__Group__3__Impl : ( 'type' ) ;
    public final void rule__Parameter__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComposition.g:2092:1: ( ( 'type' ) )
            // InternalComposition.g:2093:1: ( 'type' )
            {
            // InternalComposition.g:2093:1: ( 'type' )
            // InternalComposition.g:2094:2: 'type'
            {
             before(grammarAccess.getParameterAccess().getTypeKeyword_3()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getParameterAccess().getTypeKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__3__Impl"


    // $ANTLR start "rule__Parameter__Group__4"
    // InternalComposition.g:2103:1: rule__Parameter__Group__4 : rule__Parameter__Group__4__Impl rule__Parameter__Group__5 ;
    public final void rule__Parameter__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComposition.g:2107:1: ( rule__Parameter__Group__4__Impl rule__Parameter__Group__5 )
            // InternalComposition.g:2108:2: rule__Parameter__Group__4__Impl rule__Parameter__Group__5
            {
            pushFollow(FOLLOW_19);
            rule__Parameter__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parameter__Group__5();

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
    // $ANTLR end "rule__Parameter__Group__4"


    // $ANTLR start "rule__Parameter__Group__4__Impl"
    // InternalComposition.g:2115:1: rule__Parameter__Group__4__Impl : ( ( rule__Parameter__TypeAssignment_4 ) ) ;
    public final void rule__Parameter__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComposition.g:2119:1: ( ( ( rule__Parameter__TypeAssignment_4 ) ) )
            // InternalComposition.g:2120:1: ( ( rule__Parameter__TypeAssignment_4 ) )
            {
            // InternalComposition.g:2120:1: ( ( rule__Parameter__TypeAssignment_4 ) )
            // InternalComposition.g:2121:2: ( rule__Parameter__TypeAssignment_4 )
            {
             before(grammarAccess.getParameterAccess().getTypeAssignment_4()); 
            // InternalComposition.g:2122:2: ( rule__Parameter__TypeAssignment_4 )
            // InternalComposition.g:2122:3: rule__Parameter__TypeAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Parameter__TypeAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getParameterAccess().getTypeAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__4__Impl"


    // $ANTLR start "rule__Parameter__Group__5"
    // InternalComposition.g:2130:1: rule__Parameter__Group__5 : rule__Parameter__Group__5__Impl rule__Parameter__Group__6 ;
    public final void rule__Parameter__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComposition.g:2134:1: ( rule__Parameter__Group__5__Impl rule__Parameter__Group__6 )
            // InternalComposition.g:2135:2: rule__Parameter__Group__5__Impl rule__Parameter__Group__6
            {
            pushFollow(FOLLOW_19);
            rule__Parameter__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parameter__Group__6();

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
    // $ANTLR end "rule__Parameter__Group__5"


    // $ANTLR start "rule__Parameter__Group__5__Impl"
    // InternalComposition.g:2142:1: rule__Parameter__Group__5__Impl : ( ( rule__Parameter__Group_5__0 )? ) ;
    public final void rule__Parameter__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComposition.g:2146:1: ( ( ( rule__Parameter__Group_5__0 )? ) )
            // InternalComposition.g:2147:1: ( ( rule__Parameter__Group_5__0 )? )
            {
            // InternalComposition.g:2147:1: ( ( rule__Parameter__Group_5__0 )? )
            // InternalComposition.g:2148:2: ( rule__Parameter__Group_5__0 )?
            {
             before(grammarAccess.getParameterAccess().getGroup_5()); 
            // InternalComposition.g:2149:2: ( rule__Parameter__Group_5__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==32) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalComposition.g:2149:3: rule__Parameter__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Parameter__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getParameterAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__5__Impl"


    // $ANTLR start "rule__Parameter__Group__6"
    // InternalComposition.g:2157:1: rule__Parameter__Group__6 : rule__Parameter__Group__6__Impl ;
    public final void rule__Parameter__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComposition.g:2161:1: ( rule__Parameter__Group__6__Impl )
            // InternalComposition.g:2162:2: rule__Parameter__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Parameter__Group__6__Impl();

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
    // $ANTLR end "rule__Parameter__Group__6"


    // $ANTLR start "rule__Parameter__Group__6__Impl"
    // InternalComposition.g:2168:1: rule__Parameter__Group__6__Impl : ( '}' ) ;
    public final void rule__Parameter__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComposition.g:2172:1: ( ( '}' ) )
            // InternalComposition.g:2173:1: ( '}' )
            {
            // InternalComposition.g:2173:1: ( '}' )
            // InternalComposition.g:2174:2: '}'
            {
             before(grammarAccess.getParameterAccess().getRightCurlyBracketKeyword_6()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getParameterAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__6__Impl"


    // $ANTLR start "rule__Parameter__Group_5__0"
    // InternalComposition.g:2184:1: rule__Parameter__Group_5__0 : rule__Parameter__Group_5__0__Impl rule__Parameter__Group_5__1 ;
    public final void rule__Parameter__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComposition.g:2188:1: ( rule__Parameter__Group_5__0__Impl rule__Parameter__Group_5__1 )
            // InternalComposition.g:2189:2: rule__Parameter__Group_5__0__Impl rule__Parameter__Group_5__1
            {
            pushFollow(FOLLOW_20);
            rule__Parameter__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parameter__Group_5__1();

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
    // $ANTLR end "rule__Parameter__Group_5__0"


    // $ANTLR start "rule__Parameter__Group_5__0__Impl"
    // InternalComposition.g:2196:1: rule__Parameter__Group_5__0__Impl : ( 'value' ) ;
    public final void rule__Parameter__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComposition.g:2200:1: ( ( 'value' ) )
            // InternalComposition.g:2201:1: ( 'value' )
            {
            // InternalComposition.g:2201:1: ( 'value' )
            // InternalComposition.g:2202:2: 'value'
            {
             before(grammarAccess.getParameterAccess().getValueKeyword_5_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getParameterAccess().getValueKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group_5__0__Impl"


    // $ANTLR start "rule__Parameter__Group_5__1"
    // InternalComposition.g:2211:1: rule__Parameter__Group_5__1 : rule__Parameter__Group_5__1__Impl ;
    public final void rule__Parameter__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComposition.g:2215:1: ( rule__Parameter__Group_5__1__Impl )
            // InternalComposition.g:2216:2: rule__Parameter__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Parameter__Group_5__1__Impl();

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
    // $ANTLR end "rule__Parameter__Group_5__1"


    // $ANTLR start "rule__Parameter__Group_5__1__Impl"
    // InternalComposition.g:2222:1: rule__Parameter__Group_5__1__Impl : ( ( rule__Parameter__ValueAssignment_5_1 ) ) ;
    public final void rule__Parameter__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComposition.g:2226:1: ( ( ( rule__Parameter__ValueAssignment_5_1 ) ) )
            // InternalComposition.g:2227:1: ( ( rule__Parameter__ValueAssignment_5_1 ) )
            {
            // InternalComposition.g:2227:1: ( ( rule__Parameter__ValueAssignment_5_1 ) )
            // InternalComposition.g:2228:2: ( rule__Parameter__ValueAssignment_5_1 )
            {
             before(grammarAccess.getParameterAccess().getValueAssignment_5_1()); 
            // InternalComposition.g:2229:2: ( rule__Parameter__ValueAssignment_5_1 )
            // InternalComposition.g:2229:3: rule__Parameter__ValueAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__Parameter__ValueAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getParameterAccess().getValueAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group_5__1__Impl"


    // $ANTLR start "rule__ParameterValue_Impl__Group__0"
    // InternalComposition.g:2238:1: rule__ParameterValue_Impl__Group__0 : rule__ParameterValue_Impl__Group__0__Impl rule__ParameterValue_Impl__Group__1 ;
    public final void rule__ParameterValue_Impl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComposition.g:2242:1: ( rule__ParameterValue_Impl__Group__0__Impl rule__ParameterValue_Impl__Group__1 )
            // InternalComposition.g:2243:2: rule__ParameterValue_Impl__Group__0__Impl rule__ParameterValue_Impl__Group__1
            {
            pushFollow(FOLLOW_21);
            rule__ParameterValue_Impl__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ParameterValue_Impl__Group__1();

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
    // $ANTLR end "rule__ParameterValue_Impl__Group__0"


    // $ANTLR start "rule__ParameterValue_Impl__Group__0__Impl"
    // InternalComposition.g:2250:1: rule__ParameterValue_Impl__Group__0__Impl : ( () ) ;
    public final void rule__ParameterValue_Impl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComposition.g:2254:1: ( ( () ) )
            // InternalComposition.g:2255:1: ( () )
            {
            // InternalComposition.g:2255:1: ( () )
            // InternalComposition.g:2256:2: ()
            {
             before(grammarAccess.getParameterValue_ImplAccess().getParameterValueAction_0()); 
            // InternalComposition.g:2257:2: ()
            // InternalComposition.g:2257:3: 
            {
            }

             after(grammarAccess.getParameterValue_ImplAccess().getParameterValueAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterValue_Impl__Group__0__Impl"


    // $ANTLR start "rule__ParameterValue_Impl__Group__1"
    // InternalComposition.g:2265:1: rule__ParameterValue_Impl__Group__1 : rule__ParameterValue_Impl__Group__1__Impl rule__ParameterValue_Impl__Group__2 ;
    public final void rule__ParameterValue_Impl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComposition.g:2269:1: ( rule__ParameterValue_Impl__Group__1__Impl rule__ParameterValue_Impl__Group__2 )
            // InternalComposition.g:2270:2: rule__ParameterValue_Impl__Group__1__Impl rule__ParameterValue_Impl__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__ParameterValue_Impl__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ParameterValue_Impl__Group__2();

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
    // $ANTLR end "rule__ParameterValue_Impl__Group__1"


    // $ANTLR start "rule__ParameterValue_Impl__Group__1__Impl"
    // InternalComposition.g:2277:1: rule__ParameterValue_Impl__Group__1__Impl : ( 'ParameterValue' ) ;
    public final void rule__ParameterValue_Impl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComposition.g:2281:1: ( ( 'ParameterValue' ) )
            // InternalComposition.g:2282:1: ( 'ParameterValue' )
            {
            // InternalComposition.g:2282:1: ( 'ParameterValue' )
            // InternalComposition.g:2283:2: 'ParameterValue'
            {
             before(grammarAccess.getParameterValue_ImplAccess().getParameterValueKeyword_1()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getParameterValue_ImplAccess().getParameterValueKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterValue_Impl__Group__1__Impl"


    // $ANTLR start "rule__ParameterValue_Impl__Group__2"
    // InternalComposition.g:2292:1: rule__ParameterValue_Impl__Group__2 : rule__ParameterValue_Impl__Group__2__Impl rule__ParameterValue_Impl__Group__3 ;
    public final void rule__ParameterValue_Impl__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComposition.g:2296:1: ( rule__ParameterValue_Impl__Group__2__Impl rule__ParameterValue_Impl__Group__3 )
            // InternalComposition.g:2297:2: rule__ParameterValue_Impl__Group__2__Impl rule__ParameterValue_Impl__Group__3
            {
            pushFollow(FOLLOW_19);
            rule__ParameterValue_Impl__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ParameterValue_Impl__Group__3();

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
    // $ANTLR end "rule__ParameterValue_Impl__Group__2"


    // $ANTLR start "rule__ParameterValue_Impl__Group__2__Impl"
    // InternalComposition.g:2304:1: rule__ParameterValue_Impl__Group__2__Impl : ( '{' ) ;
    public final void rule__ParameterValue_Impl__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComposition.g:2308:1: ( ( '{' ) )
            // InternalComposition.g:2309:1: ( '{' )
            {
            // InternalComposition.g:2309:1: ( '{' )
            // InternalComposition.g:2310:2: '{'
            {
             before(grammarAccess.getParameterValue_ImplAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getParameterValue_ImplAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterValue_Impl__Group__2__Impl"


    // $ANTLR start "rule__ParameterValue_Impl__Group__3"
    // InternalComposition.g:2319:1: rule__ParameterValue_Impl__Group__3 : rule__ParameterValue_Impl__Group__3__Impl rule__ParameterValue_Impl__Group__4 ;
    public final void rule__ParameterValue_Impl__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComposition.g:2323:1: ( rule__ParameterValue_Impl__Group__3__Impl rule__ParameterValue_Impl__Group__4 )
            // InternalComposition.g:2324:2: rule__ParameterValue_Impl__Group__3__Impl rule__ParameterValue_Impl__Group__4
            {
            pushFollow(FOLLOW_19);
            rule__ParameterValue_Impl__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ParameterValue_Impl__Group__4();

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
    // $ANTLR end "rule__ParameterValue_Impl__Group__3"


    // $ANTLR start "rule__ParameterValue_Impl__Group__3__Impl"
    // InternalComposition.g:2331:1: rule__ParameterValue_Impl__Group__3__Impl : ( ( rule__ParameterValue_Impl__Group_3__0 )? ) ;
    public final void rule__ParameterValue_Impl__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComposition.g:2335:1: ( ( ( rule__ParameterValue_Impl__Group_3__0 )? ) )
            // InternalComposition.g:2336:1: ( ( rule__ParameterValue_Impl__Group_3__0 )? )
            {
            // InternalComposition.g:2336:1: ( ( rule__ParameterValue_Impl__Group_3__0 )? )
            // InternalComposition.g:2337:2: ( rule__ParameterValue_Impl__Group_3__0 )?
            {
             before(grammarAccess.getParameterValue_ImplAccess().getGroup_3()); 
            // InternalComposition.g:2338:2: ( rule__ParameterValue_Impl__Group_3__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==32) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalComposition.g:2338:3: rule__ParameterValue_Impl__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ParameterValue_Impl__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getParameterValue_ImplAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterValue_Impl__Group__3__Impl"


    // $ANTLR start "rule__ParameterValue_Impl__Group__4"
    // InternalComposition.g:2346:1: rule__ParameterValue_Impl__Group__4 : rule__ParameterValue_Impl__Group__4__Impl ;
    public final void rule__ParameterValue_Impl__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComposition.g:2350:1: ( rule__ParameterValue_Impl__Group__4__Impl )
            // InternalComposition.g:2351:2: rule__ParameterValue_Impl__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ParameterValue_Impl__Group__4__Impl();

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
    // $ANTLR end "rule__ParameterValue_Impl__Group__4"


    // $ANTLR start "rule__ParameterValue_Impl__Group__4__Impl"
    // InternalComposition.g:2357:1: rule__ParameterValue_Impl__Group__4__Impl : ( '}' ) ;
    public final void rule__ParameterValue_Impl__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComposition.g:2361:1: ( ( '}' ) )
            // InternalComposition.g:2362:1: ( '}' )
            {
            // InternalComposition.g:2362:1: ( '}' )
            // InternalComposition.g:2363:2: '}'
            {
             before(grammarAccess.getParameterValue_ImplAccess().getRightCurlyBracketKeyword_4()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getParameterValue_ImplAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterValue_Impl__Group__4__Impl"


    // $ANTLR start "rule__ParameterValue_Impl__Group_3__0"
    // InternalComposition.g:2373:1: rule__ParameterValue_Impl__Group_3__0 : rule__ParameterValue_Impl__Group_3__0__Impl rule__ParameterValue_Impl__Group_3__1 ;
    public final void rule__ParameterValue_Impl__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComposition.g:2377:1: ( rule__ParameterValue_Impl__Group_3__0__Impl rule__ParameterValue_Impl__Group_3__1 )
            // InternalComposition.g:2378:2: rule__ParameterValue_Impl__Group_3__0__Impl rule__ParameterValue_Impl__Group_3__1
            {
            pushFollow(FOLLOW_5);
            rule__ParameterValue_Impl__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ParameterValue_Impl__Group_3__1();

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
    // $ANTLR end "rule__ParameterValue_Impl__Group_3__0"


    // $ANTLR start "rule__ParameterValue_Impl__Group_3__0__Impl"
    // InternalComposition.g:2385:1: rule__ParameterValue_Impl__Group_3__0__Impl : ( 'value' ) ;
    public final void rule__ParameterValue_Impl__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComposition.g:2389:1: ( ( 'value' ) )
            // InternalComposition.g:2390:1: ( 'value' )
            {
            // InternalComposition.g:2390:1: ( 'value' )
            // InternalComposition.g:2391:2: 'value'
            {
             before(grammarAccess.getParameterValue_ImplAccess().getValueKeyword_3_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getParameterValue_ImplAccess().getValueKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterValue_Impl__Group_3__0__Impl"


    // $ANTLR start "rule__ParameterValue_Impl__Group_3__1"
    // InternalComposition.g:2400:1: rule__ParameterValue_Impl__Group_3__1 : rule__ParameterValue_Impl__Group_3__1__Impl ;
    public final void rule__ParameterValue_Impl__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComposition.g:2404:1: ( rule__ParameterValue_Impl__Group_3__1__Impl )
            // InternalComposition.g:2405:2: rule__ParameterValue_Impl__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ParameterValue_Impl__Group_3__1__Impl();

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
    // $ANTLR end "rule__ParameterValue_Impl__Group_3__1"


    // $ANTLR start "rule__ParameterValue_Impl__Group_3__1__Impl"
    // InternalComposition.g:2411:1: rule__ParameterValue_Impl__Group_3__1__Impl : ( ( rule__ParameterValue_Impl__ValueAssignment_3_1 ) ) ;
    public final void rule__ParameterValue_Impl__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComposition.g:2415:1: ( ( ( rule__ParameterValue_Impl__ValueAssignment_3_1 ) ) )
            // InternalComposition.g:2416:1: ( ( rule__ParameterValue_Impl__ValueAssignment_3_1 ) )
            {
            // InternalComposition.g:2416:1: ( ( rule__ParameterValue_Impl__ValueAssignment_3_1 ) )
            // InternalComposition.g:2417:2: ( rule__ParameterValue_Impl__ValueAssignment_3_1 )
            {
             before(grammarAccess.getParameterValue_ImplAccess().getValueAssignment_3_1()); 
            // InternalComposition.g:2418:2: ( rule__ParameterValue_Impl__ValueAssignment_3_1 )
            // InternalComposition.g:2418:3: rule__ParameterValue_Impl__ValueAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__ParameterValue_Impl__ValueAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getParameterValue_ImplAccess().getValueAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterValue_Impl__Group_3__1__Impl"


    // $ANTLR start "rule__ParameterType_Impl__Group__0"
    // InternalComposition.g:2427:1: rule__ParameterType_Impl__Group__0 : rule__ParameterType_Impl__Group__0__Impl rule__ParameterType_Impl__Group__1 ;
    public final void rule__ParameterType_Impl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComposition.g:2431:1: ( rule__ParameterType_Impl__Group__0__Impl rule__ParameterType_Impl__Group__1 )
            // InternalComposition.g:2432:2: rule__ParameterType_Impl__Group__0__Impl rule__ParameterType_Impl__Group__1
            {
            pushFollow(FOLLOW_22);
            rule__ParameterType_Impl__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ParameterType_Impl__Group__1();

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
    // $ANTLR end "rule__ParameterType_Impl__Group__0"


    // $ANTLR start "rule__ParameterType_Impl__Group__0__Impl"
    // InternalComposition.g:2439:1: rule__ParameterType_Impl__Group__0__Impl : ( () ) ;
    public final void rule__ParameterType_Impl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComposition.g:2443:1: ( ( () ) )
            // InternalComposition.g:2444:1: ( () )
            {
            // InternalComposition.g:2444:1: ( () )
            // InternalComposition.g:2445:2: ()
            {
             before(grammarAccess.getParameterType_ImplAccess().getParameterTypeAction_0()); 
            // InternalComposition.g:2446:2: ()
            // InternalComposition.g:2446:3: 
            {
            }

             after(grammarAccess.getParameterType_ImplAccess().getParameterTypeAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterType_Impl__Group__0__Impl"


    // $ANTLR start "rule__ParameterType_Impl__Group__1"
    // InternalComposition.g:2454:1: rule__ParameterType_Impl__Group__1 : rule__ParameterType_Impl__Group__1__Impl ;
    public final void rule__ParameterType_Impl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComposition.g:2458:1: ( rule__ParameterType_Impl__Group__1__Impl )
            // InternalComposition.g:2459:2: rule__ParameterType_Impl__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ParameterType_Impl__Group__1__Impl();

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
    // $ANTLR end "rule__ParameterType_Impl__Group__1"


    // $ANTLR start "rule__ParameterType_Impl__Group__1__Impl"
    // InternalComposition.g:2465:1: rule__ParameterType_Impl__Group__1__Impl : ( 'ParameterType' ) ;
    public final void rule__ParameterType_Impl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComposition.g:2469:1: ( ( 'ParameterType' ) )
            // InternalComposition.g:2470:1: ( 'ParameterType' )
            {
            // InternalComposition.g:2470:1: ( 'ParameterType' )
            // InternalComposition.g:2471:2: 'ParameterType'
            {
             before(grammarAccess.getParameterType_ImplAccess().getParameterTypeKeyword_1()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getParameterType_ImplAccess().getParameterTypeKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterType_Impl__Group__1__Impl"


    // $ANTLR start "rule__LinkRef__Group__0"
    // InternalComposition.g:2481:1: rule__LinkRef__Group__0 : rule__LinkRef__Group__0__Impl rule__LinkRef__Group__1 ;
    public final void rule__LinkRef__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComposition.g:2485:1: ( rule__LinkRef__Group__0__Impl rule__LinkRef__Group__1 )
            // InternalComposition.g:2486:2: rule__LinkRef__Group__0__Impl rule__LinkRef__Group__1
            {
            pushFollow(FOLLOW_20);
            rule__LinkRef__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LinkRef__Group__1();

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
    // $ANTLR end "rule__LinkRef__Group__0"


    // $ANTLR start "rule__LinkRef__Group__0__Impl"
    // InternalComposition.g:2493:1: rule__LinkRef__Group__0__Impl : ( () ) ;
    public final void rule__LinkRef__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComposition.g:2497:1: ( ( () ) )
            // InternalComposition.g:2498:1: ( () )
            {
            // InternalComposition.g:2498:1: ( () )
            // InternalComposition.g:2499:2: ()
            {
             before(grammarAccess.getLinkRefAccess().getLinkRefAction_0()); 
            // InternalComposition.g:2500:2: ()
            // InternalComposition.g:2500:3: 
            {
            }

             after(grammarAccess.getLinkRefAccess().getLinkRefAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LinkRef__Group__0__Impl"


    // $ANTLR start "rule__LinkRef__Group__1"
    // InternalComposition.g:2508:1: rule__LinkRef__Group__1 : rule__LinkRef__Group__1__Impl rule__LinkRef__Group__2 ;
    public final void rule__LinkRef__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComposition.g:2512:1: ( rule__LinkRef__Group__1__Impl rule__LinkRef__Group__2 )
            // InternalComposition.g:2513:2: rule__LinkRef__Group__1__Impl rule__LinkRef__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__LinkRef__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LinkRef__Group__2();

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
    // $ANTLR end "rule__LinkRef__Group__1"


    // $ANTLR start "rule__LinkRef__Group__1__Impl"
    // InternalComposition.g:2520:1: rule__LinkRef__Group__1__Impl : ( 'LinkRef' ) ;
    public final void rule__LinkRef__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComposition.g:2524:1: ( ( 'LinkRef' ) )
            // InternalComposition.g:2525:1: ( 'LinkRef' )
            {
            // InternalComposition.g:2525:1: ( 'LinkRef' )
            // InternalComposition.g:2526:2: 'LinkRef'
            {
             before(grammarAccess.getLinkRefAccess().getLinkRefKeyword_1()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getLinkRefAccess().getLinkRefKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LinkRef__Group__1__Impl"


    // $ANTLR start "rule__LinkRef__Group__2"
    // InternalComposition.g:2535:1: rule__LinkRef__Group__2 : rule__LinkRef__Group__2__Impl rule__LinkRef__Group__3 ;
    public final void rule__LinkRef__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComposition.g:2539:1: ( rule__LinkRef__Group__2__Impl rule__LinkRef__Group__3 )
            // InternalComposition.g:2540:2: rule__LinkRef__Group__2__Impl rule__LinkRef__Group__3
            {
            pushFollow(FOLLOW_23);
            rule__LinkRef__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LinkRef__Group__3();

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
    // $ANTLR end "rule__LinkRef__Group__2"


    // $ANTLR start "rule__LinkRef__Group__2__Impl"
    // InternalComposition.g:2547:1: rule__LinkRef__Group__2__Impl : ( '{' ) ;
    public final void rule__LinkRef__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComposition.g:2551:1: ( ( '{' ) )
            // InternalComposition.g:2552:1: ( '{' )
            {
            // InternalComposition.g:2552:1: ( '{' )
            // InternalComposition.g:2553:2: '{'
            {
             before(grammarAccess.getLinkRefAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getLinkRefAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LinkRef__Group__2__Impl"


    // $ANTLR start "rule__LinkRef__Group__3"
    // InternalComposition.g:2562:1: rule__LinkRef__Group__3 : rule__LinkRef__Group__3__Impl rule__LinkRef__Group__4 ;
    public final void rule__LinkRef__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComposition.g:2566:1: ( rule__LinkRef__Group__3__Impl rule__LinkRef__Group__4 )
            // InternalComposition.g:2567:2: rule__LinkRef__Group__3__Impl rule__LinkRef__Group__4
            {
            pushFollow(FOLLOW_23);
            rule__LinkRef__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LinkRef__Group__4();

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
    // $ANTLR end "rule__LinkRef__Group__3"


    // $ANTLR start "rule__LinkRef__Group__3__Impl"
    // InternalComposition.g:2574:1: rule__LinkRef__Group__3__Impl : ( ( rule__LinkRef__Group_3__0 )? ) ;
    public final void rule__LinkRef__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComposition.g:2578:1: ( ( ( rule__LinkRef__Group_3__0 )? ) )
            // InternalComposition.g:2579:1: ( ( rule__LinkRef__Group_3__0 )? )
            {
            // InternalComposition.g:2579:1: ( ( rule__LinkRef__Group_3__0 )? )
            // InternalComposition.g:2580:2: ( rule__LinkRef__Group_3__0 )?
            {
             before(grammarAccess.getLinkRefAccess().getGroup_3()); 
            // InternalComposition.g:2581:2: ( rule__LinkRef__Group_3__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==32) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalComposition.g:2581:3: rule__LinkRef__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__LinkRef__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLinkRefAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LinkRef__Group__3__Impl"


    // $ANTLR start "rule__LinkRef__Group__4"
    // InternalComposition.g:2589:1: rule__LinkRef__Group__4 : rule__LinkRef__Group__4__Impl rule__LinkRef__Group__5 ;
    public final void rule__LinkRef__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComposition.g:2593:1: ( rule__LinkRef__Group__4__Impl rule__LinkRef__Group__5 )
            // InternalComposition.g:2594:2: rule__LinkRef__Group__4__Impl rule__LinkRef__Group__5
            {
            pushFollow(FOLLOW_23);
            rule__LinkRef__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LinkRef__Group__5();

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
    // $ANTLR end "rule__LinkRef__Group__4"


    // $ANTLR start "rule__LinkRef__Group__4__Impl"
    // InternalComposition.g:2601:1: rule__LinkRef__Group__4__Impl : ( ( rule__LinkRef__Group_4__0 )? ) ;
    public final void rule__LinkRef__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComposition.g:2605:1: ( ( ( rule__LinkRef__Group_4__0 )? ) )
            // InternalComposition.g:2606:1: ( ( rule__LinkRef__Group_4__0 )? )
            {
            // InternalComposition.g:2606:1: ( ( rule__LinkRef__Group_4__0 )? )
            // InternalComposition.g:2607:2: ( rule__LinkRef__Group_4__0 )?
            {
             before(grammarAccess.getLinkRefAccess().getGroup_4()); 
            // InternalComposition.g:2608:2: ( rule__LinkRef__Group_4__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==36) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalComposition.g:2608:3: rule__LinkRef__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__LinkRef__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLinkRefAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LinkRef__Group__4__Impl"


    // $ANTLR start "rule__LinkRef__Group__5"
    // InternalComposition.g:2616:1: rule__LinkRef__Group__5 : rule__LinkRef__Group__5__Impl ;
    public final void rule__LinkRef__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComposition.g:2620:1: ( rule__LinkRef__Group__5__Impl )
            // InternalComposition.g:2621:2: rule__LinkRef__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LinkRef__Group__5__Impl();

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
    // $ANTLR end "rule__LinkRef__Group__5"


    // $ANTLR start "rule__LinkRef__Group__5__Impl"
    // InternalComposition.g:2627:1: rule__LinkRef__Group__5__Impl : ( '}' ) ;
    public final void rule__LinkRef__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComposition.g:2631:1: ( ( '}' ) )
            // InternalComposition.g:2632:1: ( '}' )
            {
            // InternalComposition.g:2632:1: ( '}' )
            // InternalComposition.g:2633:2: '}'
            {
             before(grammarAccess.getLinkRefAccess().getRightCurlyBracketKeyword_5()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getLinkRefAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LinkRef__Group__5__Impl"


    // $ANTLR start "rule__LinkRef__Group_3__0"
    // InternalComposition.g:2643:1: rule__LinkRef__Group_3__0 : rule__LinkRef__Group_3__0__Impl rule__LinkRef__Group_3__1 ;
    public final void rule__LinkRef__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComposition.g:2647:1: ( rule__LinkRef__Group_3__0__Impl rule__LinkRef__Group_3__1 )
            // InternalComposition.g:2648:2: rule__LinkRef__Group_3__0__Impl rule__LinkRef__Group_3__1
            {
            pushFollow(FOLLOW_5);
            rule__LinkRef__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LinkRef__Group_3__1();

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
    // $ANTLR end "rule__LinkRef__Group_3__0"


    // $ANTLR start "rule__LinkRef__Group_3__0__Impl"
    // InternalComposition.g:2655:1: rule__LinkRef__Group_3__0__Impl : ( 'value' ) ;
    public final void rule__LinkRef__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComposition.g:2659:1: ( ( 'value' ) )
            // InternalComposition.g:2660:1: ( 'value' )
            {
            // InternalComposition.g:2660:1: ( 'value' )
            // InternalComposition.g:2661:2: 'value'
            {
             before(grammarAccess.getLinkRefAccess().getValueKeyword_3_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getLinkRefAccess().getValueKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LinkRef__Group_3__0__Impl"


    // $ANTLR start "rule__LinkRef__Group_3__1"
    // InternalComposition.g:2670:1: rule__LinkRef__Group_3__1 : rule__LinkRef__Group_3__1__Impl ;
    public final void rule__LinkRef__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComposition.g:2674:1: ( rule__LinkRef__Group_3__1__Impl )
            // InternalComposition.g:2675:2: rule__LinkRef__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LinkRef__Group_3__1__Impl();

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
    // $ANTLR end "rule__LinkRef__Group_3__1"


    // $ANTLR start "rule__LinkRef__Group_3__1__Impl"
    // InternalComposition.g:2681:1: rule__LinkRef__Group_3__1__Impl : ( ( rule__LinkRef__ValueAssignment_3_1 ) ) ;
    public final void rule__LinkRef__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComposition.g:2685:1: ( ( ( rule__LinkRef__ValueAssignment_3_1 ) ) )
            // InternalComposition.g:2686:1: ( ( rule__LinkRef__ValueAssignment_3_1 ) )
            {
            // InternalComposition.g:2686:1: ( ( rule__LinkRef__ValueAssignment_3_1 ) )
            // InternalComposition.g:2687:2: ( rule__LinkRef__ValueAssignment_3_1 )
            {
             before(grammarAccess.getLinkRefAccess().getValueAssignment_3_1()); 
            // InternalComposition.g:2688:2: ( rule__LinkRef__ValueAssignment_3_1 )
            // InternalComposition.g:2688:3: rule__LinkRef__ValueAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__LinkRef__ValueAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getLinkRefAccess().getValueAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LinkRef__Group_3__1__Impl"


    // $ANTLR start "rule__LinkRef__Group_4__0"
    // InternalComposition.g:2697:1: rule__LinkRef__Group_4__0 : rule__LinkRef__Group_4__0__Impl rule__LinkRef__Group_4__1 ;
    public final void rule__LinkRef__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComposition.g:2701:1: ( rule__LinkRef__Group_4__0__Impl rule__LinkRef__Group_4__1 )
            // InternalComposition.g:2702:2: rule__LinkRef__Group_4__0__Impl rule__LinkRef__Group_4__1
            {
            pushFollow(FOLLOW_5);
            rule__LinkRef__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LinkRef__Group_4__1();

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
    // $ANTLR end "rule__LinkRef__Group_4__0"


    // $ANTLR start "rule__LinkRef__Group_4__0__Impl"
    // InternalComposition.g:2709:1: rule__LinkRef__Group_4__0__Impl : ( 'ref' ) ;
    public final void rule__LinkRef__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComposition.g:2713:1: ( ( 'ref' ) )
            // InternalComposition.g:2714:1: ( 'ref' )
            {
            // InternalComposition.g:2714:1: ( 'ref' )
            // InternalComposition.g:2715:2: 'ref'
            {
             before(grammarAccess.getLinkRefAccess().getRefKeyword_4_0()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getLinkRefAccess().getRefKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LinkRef__Group_4__0__Impl"


    // $ANTLR start "rule__LinkRef__Group_4__1"
    // InternalComposition.g:2724:1: rule__LinkRef__Group_4__1 : rule__LinkRef__Group_4__1__Impl ;
    public final void rule__LinkRef__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComposition.g:2728:1: ( rule__LinkRef__Group_4__1__Impl )
            // InternalComposition.g:2729:2: rule__LinkRef__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LinkRef__Group_4__1__Impl();

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
    // $ANTLR end "rule__LinkRef__Group_4__1"


    // $ANTLR start "rule__LinkRef__Group_4__1__Impl"
    // InternalComposition.g:2735:1: rule__LinkRef__Group_4__1__Impl : ( ( rule__LinkRef__RefAssignment_4_1 ) ) ;
    public final void rule__LinkRef__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComposition.g:2739:1: ( ( ( rule__LinkRef__RefAssignment_4_1 ) ) )
            // InternalComposition.g:2740:1: ( ( rule__LinkRef__RefAssignment_4_1 ) )
            {
            // InternalComposition.g:2740:1: ( ( rule__LinkRef__RefAssignment_4_1 ) )
            // InternalComposition.g:2741:2: ( rule__LinkRef__RefAssignment_4_1 )
            {
             before(grammarAccess.getLinkRefAccess().getRefAssignment_4_1()); 
            // InternalComposition.g:2742:2: ( rule__LinkRef__RefAssignment_4_1 )
            // InternalComposition.g:2742:3: rule__LinkRef__RefAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__LinkRef__RefAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getLinkRefAccess().getRefAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LinkRef__Group_4__1__Impl"


    // $ANTLR start "rule__ParameterPoseType__Group__0"
    // InternalComposition.g:2751:1: rule__ParameterPoseType__Group__0 : rule__ParameterPoseType__Group__0__Impl rule__ParameterPoseType__Group__1 ;
    public final void rule__ParameterPoseType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComposition.g:2755:1: ( rule__ParameterPoseType__Group__0__Impl rule__ParameterPoseType__Group__1 )
            // InternalComposition.g:2756:2: rule__ParameterPoseType__Group__0__Impl rule__ParameterPoseType__Group__1
            {
            pushFollow(FOLLOW_24);
            rule__ParameterPoseType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ParameterPoseType__Group__1();

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
    // $ANTLR end "rule__ParameterPoseType__Group__0"


    // $ANTLR start "rule__ParameterPoseType__Group__0__Impl"
    // InternalComposition.g:2763:1: rule__ParameterPoseType__Group__0__Impl : ( () ) ;
    public final void rule__ParameterPoseType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComposition.g:2767:1: ( ( () ) )
            // InternalComposition.g:2768:1: ( () )
            {
            // InternalComposition.g:2768:1: ( () )
            // InternalComposition.g:2769:2: ()
            {
             before(grammarAccess.getParameterPoseTypeAccess().getParameterPoseTypeAction_0()); 
            // InternalComposition.g:2770:2: ()
            // InternalComposition.g:2770:3: 
            {
            }

             after(grammarAccess.getParameterPoseTypeAccess().getParameterPoseTypeAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterPoseType__Group__0__Impl"


    // $ANTLR start "rule__ParameterPoseType__Group__1"
    // InternalComposition.g:2778:1: rule__ParameterPoseType__Group__1 : rule__ParameterPoseType__Group__1__Impl ;
    public final void rule__ParameterPoseType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComposition.g:2782:1: ( rule__ParameterPoseType__Group__1__Impl )
            // InternalComposition.g:2783:2: rule__ParameterPoseType__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ParameterPoseType__Group__1__Impl();

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
    // $ANTLR end "rule__ParameterPoseType__Group__1"


    // $ANTLR start "rule__ParameterPoseType__Group__1__Impl"
    // InternalComposition.g:2789:1: rule__ParameterPoseType__Group__1__Impl : ( 'ParameterPoseType' ) ;
    public final void rule__ParameterPoseType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComposition.g:2793:1: ( ( 'ParameterPoseType' ) )
            // InternalComposition.g:2794:1: ( 'ParameterPoseType' )
            {
            // InternalComposition.g:2794:1: ( 'ParameterPoseType' )
            // InternalComposition.g:2795:2: 'ParameterPoseType'
            {
             before(grammarAccess.getParameterPoseTypeAccess().getParameterPoseTypeKeyword_1()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getParameterPoseTypeAccess().getParameterPoseTypeKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterPoseType__Group__1__Impl"


    // $ANTLR start "rule__ParameterStringType__Group__0"
    // InternalComposition.g:2805:1: rule__ParameterStringType__Group__0 : rule__ParameterStringType__Group__0__Impl rule__ParameterStringType__Group__1 ;
    public final void rule__ParameterStringType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComposition.g:2809:1: ( rule__ParameterStringType__Group__0__Impl rule__ParameterStringType__Group__1 )
            // InternalComposition.g:2810:2: rule__ParameterStringType__Group__0__Impl rule__ParameterStringType__Group__1
            {
            pushFollow(FOLLOW_25);
            rule__ParameterStringType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ParameterStringType__Group__1();

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
    // $ANTLR end "rule__ParameterStringType__Group__0"


    // $ANTLR start "rule__ParameterStringType__Group__0__Impl"
    // InternalComposition.g:2817:1: rule__ParameterStringType__Group__0__Impl : ( () ) ;
    public final void rule__ParameterStringType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComposition.g:2821:1: ( ( () ) )
            // InternalComposition.g:2822:1: ( () )
            {
            // InternalComposition.g:2822:1: ( () )
            // InternalComposition.g:2823:2: ()
            {
             before(grammarAccess.getParameterStringTypeAccess().getParameterStringTypeAction_0()); 
            // InternalComposition.g:2824:2: ()
            // InternalComposition.g:2824:3: 
            {
            }

             after(grammarAccess.getParameterStringTypeAccess().getParameterStringTypeAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterStringType__Group__0__Impl"


    // $ANTLR start "rule__ParameterStringType__Group__1"
    // InternalComposition.g:2832:1: rule__ParameterStringType__Group__1 : rule__ParameterStringType__Group__1__Impl ;
    public final void rule__ParameterStringType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComposition.g:2836:1: ( rule__ParameterStringType__Group__1__Impl )
            // InternalComposition.g:2837:2: rule__ParameterStringType__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ParameterStringType__Group__1__Impl();

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
    // $ANTLR end "rule__ParameterStringType__Group__1"


    // $ANTLR start "rule__ParameterStringType__Group__1__Impl"
    // InternalComposition.g:2843:1: rule__ParameterStringType__Group__1__Impl : ( 'ParameterStringType' ) ;
    public final void rule__ParameterStringType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComposition.g:2847:1: ( ( 'ParameterStringType' ) )
            // InternalComposition.g:2848:1: ( 'ParameterStringType' )
            {
            // InternalComposition.g:2848:1: ( 'ParameterStringType' )
            // InternalComposition.g:2849:2: 'ParameterStringType'
            {
             before(grammarAccess.getParameterStringTypeAccess().getParameterStringTypeKeyword_1()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getParameterStringTypeAccess().getParameterStringTypeKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterStringType__Group__1__Impl"


    // $ANTLR start "rule__ParameterLinkRefType__Group__0"
    // InternalComposition.g:2859:1: rule__ParameterLinkRefType__Group__0 : rule__ParameterLinkRefType__Group__0__Impl rule__ParameterLinkRefType__Group__1 ;
    public final void rule__ParameterLinkRefType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComposition.g:2863:1: ( rule__ParameterLinkRefType__Group__0__Impl rule__ParameterLinkRefType__Group__1 )
            // InternalComposition.g:2864:2: rule__ParameterLinkRefType__Group__0__Impl rule__ParameterLinkRefType__Group__1
            {
            pushFollow(FOLLOW_18);
            rule__ParameterLinkRefType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ParameterLinkRefType__Group__1();

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
    // $ANTLR end "rule__ParameterLinkRefType__Group__0"


    // $ANTLR start "rule__ParameterLinkRefType__Group__0__Impl"
    // InternalComposition.g:2871:1: rule__ParameterLinkRefType__Group__0__Impl : ( () ) ;
    public final void rule__ParameterLinkRefType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComposition.g:2875:1: ( ( () ) )
            // InternalComposition.g:2876:1: ( () )
            {
            // InternalComposition.g:2876:1: ( () )
            // InternalComposition.g:2877:2: ()
            {
             before(grammarAccess.getParameterLinkRefTypeAccess().getParameterLinkRefTypeAction_0()); 
            // InternalComposition.g:2878:2: ()
            // InternalComposition.g:2878:3: 
            {
            }

             after(grammarAccess.getParameterLinkRefTypeAccess().getParameterLinkRefTypeAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterLinkRefType__Group__0__Impl"


    // $ANTLR start "rule__ParameterLinkRefType__Group__1"
    // InternalComposition.g:2886:1: rule__ParameterLinkRefType__Group__1 : rule__ParameterLinkRefType__Group__1__Impl ;
    public final void rule__ParameterLinkRefType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComposition.g:2890:1: ( rule__ParameterLinkRefType__Group__1__Impl )
            // InternalComposition.g:2891:2: rule__ParameterLinkRefType__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ParameterLinkRefType__Group__1__Impl();

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
    // $ANTLR end "rule__ParameterLinkRefType__Group__1"


    // $ANTLR start "rule__ParameterLinkRefType__Group__1__Impl"
    // InternalComposition.g:2897:1: rule__ParameterLinkRefType__Group__1__Impl : ( 'ParameterLinkRefType' ) ;
    public final void rule__ParameterLinkRefType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComposition.g:2901:1: ( ( 'ParameterLinkRefType' ) )
            // InternalComposition.g:2902:1: ( 'ParameterLinkRefType' )
            {
            // InternalComposition.g:2902:1: ( 'ParameterLinkRefType' )
            // InternalComposition.g:2903:2: 'ParameterLinkRefType'
            {
             before(grammarAccess.getParameterLinkRefTypeAccess().getParameterLinkRefTypeKeyword_1()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getParameterLinkRefTypeAccess().getParameterLinkRefTypeKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterLinkRefType__Group__1__Impl"


    // $ANTLR start "rule__ParameterInstance__Group__0"
    // InternalComposition.g:2913:1: rule__ParameterInstance__Group__0 : rule__ParameterInstance__Group__0__Impl rule__ParameterInstance__Group__1 ;
    public final void rule__ParameterInstance__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComposition.g:2917:1: ( rule__ParameterInstance__Group__0__Impl rule__ParameterInstance__Group__1 )
            // InternalComposition.g:2918:2: rule__ParameterInstance__Group__0__Impl rule__ParameterInstance__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__ParameterInstance__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ParameterInstance__Group__1();

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
    // $ANTLR end "rule__ParameterInstance__Group__0"


    // $ANTLR start "rule__ParameterInstance__Group__0__Impl"
    // InternalComposition.g:2925:1: rule__ParameterInstance__Group__0__Impl : ( 'ParameterInstance' ) ;
    public final void rule__ParameterInstance__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComposition.g:2929:1: ( ( 'ParameterInstance' ) )
            // InternalComposition.g:2930:1: ( 'ParameterInstance' )
            {
            // InternalComposition.g:2930:1: ( 'ParameterInstance' )
            // InternalComposition.g:2931:2: 'ParameterInstance'
            {
             before(grammarAccess.getParameterInstanceAccess().getParameterInstanceKeyword_0()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getParameterInstanceAccess().getParameterInstanceKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterInstance__Group__0__Impl"


    // $ANTLR start "rule__ParameterInstance__Group__1"
    // InternalComposition.g:2940:1: rule__ParameterInstance__Group__1 : rule__ParameterInstance__Group__1__Impl rule__ParameterInstance__Group__2 ;
    public final void rule__ParameterInstance__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComposition.g:2944:1: ( rule__ParameterInstance__Group__1__Impl rule__ParameterInstance__Group__2 )
            // InternalComposition.g:2945:2: rule__ParameterInstance__Group__1__Impl rule__ParameterInstance__Group__2
            {
            pushFollow(FOLLOW_26);
            rule__ParameterInstance__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ParameterInstance__Group__2();

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
    // $ANTLR end "rule__ParameterInstance__Group__1"


    // $ANTLR start "rule__ParameterInstance__Group__1__Impl"
    // InternalComposition.g:2952:1: rule__ParameterInstance__Group__1__Impl : ( '{' ) ;
    public final void rule__ParameterInstance__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComposition.g:2956:1: ( ( '{' ) )
            // InternalComposition.g:2957:1: ( '{' )
            {
            // InternalComposition.g:2957:1: ( '{' )
            // InternalComposition.g:2958:2: '{'
            {
             before(grammarAccess.getParameterInstanceAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getParameterInstanceAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterInstance__Group__1__Impl"


    // $ANTLR start "rule__ParameterInstance__Group__2"
    // InternalComposition.g:2967:1: rule__ParameterInstance__Group__2 : rule__ParameterInstance__Group__2__Impl rule__ParameterInstance__Group__3 ;
    public final void rule__ParameterInstance__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComposition.g:2971:1: ( rule__ParameterInstance__Group__2__Impl rule__ParameterInstance__Group__3 )
            // InternalComposition.g:2972:2: rule__ParameterInstance__Group__2__Impl rule__ParameterInstance__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__ParameterInstance__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ParameterInstance__Group__3();

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
    // $ANTLR end "rule__ParameterInstance__Group__2"


    // $ANTLR start "rule__ParameterInstance__Group__2__Impl"
    // InternalComposition.g:2979:1: rule__ParameterInstance__Group__2__Impl : ( 'parameter' ) ;
    public final void rule__ParameterInstance__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComposition.g:2983:1: ( ( 'parameter' ) )
            // InternalComposition.g:2984:1: ( 'parameter' )
            {
            // InternalComposition.g:2984:1: ( 'parameter' )
            // InternalComposition.g:2985:2: 'parameter'
            {
             before(grammarAccess.getParameterInstanceAccess().getParameterKeyword_2()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getParameterInstanceAccess().getParameterKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterInstance__Group__2__Impl"


    // $ANTLR start "rule__ParameterInstance__Group__3"
    // InternalComposition.g:2994:1: rule__ParameterInstance__Group__3 : rule__ParameterInstance__Group__3__Impl rule__ParameterInstance__Group__4 ;
    public final void rule__ParameterInstance__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComposition.g:2998:1: ( rule__ParameterInstance__Group__3__Impl rule__ParameterInstance__Group__4 )
            // InternalComposition.g:2999:2: rule__ParameterInstance__Group__3__Impl rule__ParameterInstance__Group__4
            {
            pushFollow(FOLLOW_27);
            rule__ParameterInstance__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ParameterInstance__Group__4();

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
    // $ANTLR end "rule__ParameterInstance__Group__3"


    // $ANTLR start "rule__ParameterInstance__Group__3__Impl"
    // InternalComposition.g:3006:1: rule__ParameterInstance__Group__3__Impl : ( ( rule__ParameterInstance__ParameterAssignment_3 ) ) ;
    public final void rule__ParameterInstance__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComposition.g:3010:1: ( ( ( rule__ParameterInstance__ParameterAssignment_3 ) ) )
            // InternalComposition.g:3011:1: ( ( rule__ParameterInstance__ParameterAssignment_3 ) )
            {
            // InternalComposition.g:3011:1: ( ( rule__ParameterInstance__ParameterAssignment_3 ) )
            // InternalComposition.g:3012:2: ( rule__ParameterInstance__ParameterAssignment_3 )
            {
             before(grammarAccess.getParameterInstanceAccess().getParameterAssignment_3()); 
            // InternalComposition.g:3013:2: ( rule__ParameterInstance__ParameterAssignment_3 )
            // InternalComposition.g:3013:3: rule__ParameterInstance__ParameterAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__ParameterInstance__ParameterAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getParameterInstanceAccess().getParameterAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterInstance__Group__3__Impl"


    // $ANTLR start "rule__ParameterInstance__Group__4"
    // InternalComposition.g:3021:1: rule__ParameterInstance__Group__4 : rule__ParameterInstance__Group__4__Impl rule__ParameterInstance__Group__5 ;
    public final void rule__ParameterInstance__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComposition.g:3025:1: ( rule__ParameterInstance__Group__4__Impl rule__ParameterInstance__Group__5 )
            // InternalComposition.g:3026:2: rule__ParameterInstance__Group__4__Impl rule__ParameterInstance__Group__5
            {
            pushFollow(FOLLOW_20);
            rule__ParameterInstance__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ParameterInstance__Group__5();

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
    // $ANTLR end "rule__ParameterInstance__Group__4"


    // $ANTLR start "rule__ParameterInstance__Group__4__Impl"
    // InternalComposition.g:3033:1: rule__ParameterInstance__Group__4__Impl : ( 'value' ) ;
    public final void rule__ParameterInstance__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComposition.g:3037:1: ( ( 'value' ) )
            // InternalComposition.g:3038:1: ( 'value' )
            {
            // InternalComposition.g:3038:1: ( 'value' )
            // InternalComposition.g:3039:2: 'value'
            {
             before(grammarAccess.getParameterInstanceAccess().getValueKeyword_4()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getParameterInstanceAccess().getValueKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterInstance__Group__4__Impl"


    // $ANTLR start "rule__ParameterInstance__Group__5"
    // InternalComposition.g:3048:1: rule__ParameterInstance__Group__5 : rule__ParameterInstance__Group__5__Impl rule__ParameterInstance__Group__6 ;
    public final void rule__ParameterInstance__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComposition.g:3052:1: ( rule__ParameterInstance__Group__5__Impl rule__ParameterInstance__Group__6 )
            // InternalComposition.g:3053:2: rule__ParameterInstance__Group__5__Impl rule__ParameterInstance__Group__6
            {
            pushFollow(FOLLOW_28);
            rule__ParameterInstance__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ParameterInstance__Group__6();

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
    // $ANTLR end "rule__ParameterInstance__Group__5"


    // $ANTLR start "rule__ParameterInstance__Group__5__Impl"
    // InternalComposition.g:3060:1: rule__ParameterInstance__Group__5__Impl : ( ( rule__ParameterInstance__ValueAssignment_5 ) ) ;
    public final void rule__ParameterInstance__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComposition.g:3064:1: ( ( ( rule__ParameterInstance__ValueAssignment_5 ) ) )
            // InternalComposition.g:3065:1: ( ( rule__ParameterInstance__ValueAssignment_5 ) )
            {
            // InternalComposition.g:3065:1: ( ( rule__ParameterInstance__ValueAssignment_5 ) )
            // InternalComposition.g:3066:2: ( rule__ParameterInstance__ValueAssignment_5 )
            {
             before(grammarAccess.getParameterInstanceAccess().getValueAssignment_5()); 
            // InternalComposition.g:3067:2: ( rule__ParameterInstance__ValueAssignment_5 )
            // InternalComposition.g:3067:3: rule__ParameterInstance__ValueAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__ParameterInstance__ValueAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getParameterInstanceAccess().getValueAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterInstance__Group__5__Impl"


    // $ANTLR start "rule__ParameterInstance__Group__6"
    // InternalComposition.g:3075:1: rule__ParameterInstance__Group__6 : rule__ParameterInstance__Group__6__Impl ;
    public final void rule__ParameterInstance__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComposition.g:3079:1: ( rule__ParameterInstance__Group__6__Impl )
            // InternalComposition.g:3080:2: rule__ParameterInstance__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ParameterInstance__Group__6__Impl();

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
    // $ANTLR end "rule__ParameterInstance__Group__6"


    // $ANTLR start "rule__ParameterInstance__Group__6__Impl"
    // InternalComposition.g:3086:1: rule__ParameterInstance__Group__6__Impl : ( '}' ) ;
    public final void rule__ParameterInstance__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComposition.g:3090:1: ( ( '}' ) )
            // InternalComposition.g:3091:1: ( '}' )
            {
            // InternalComposition.g:3091:1: ( '}' )
            // InternalComposition.g:3092:2: '}'
            {
             before(grammarAccess.getParameterInstanceAccess().getRightCurlyBracketKeyword_6()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getParameterInstanceAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterInstance__Group__6__Impl"


    // $ANTLR start "rule__Joint__Group__0"
    // InternalComposition.g:3102:1: rule__Joint__Group__0 : rule__Joint__Group__0__Impl rule__Joint__Group__1 ;
    public final void rule__Joint__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComposition.g:3106:1: ( rule__Joint__Group__0__Impl rule__Joint__Group__1 )
            // InternalComposition.g:3107:2: rule__Joint__Group__0__Impl rule__Joint__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Joint__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Joint__Group__1();

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
    // $ANTLR end "rule__Joint__Group__0"


    // $ANTLR start "rule__Joint__Group__0__Impl"
    // InternalComposition.g:3114:1: rule__Joint__Group__0__Impl : ( 'Joint' ) ;
    public final void rule__Joint__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComposition.g:3118:1: ( ( 'Joint' ) )
            // InternalComposition.g:3119:1: ( 'Joint' )
            {
            // InternalComposition.g:3119:1: ( 'Joint' )
            // InternalComposition.g:3120:2: 'Joint'
            {
             before(grammarAccess.getJointAccess().getJointKeyword_0()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getJointAccess().getJointKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Joint__Group__0__Impl"


    // $ANTLR start "rule__Joint__Group__1"
    // InternalComposition.g:3129:1: rule__Joint__Group__1 : rule__Joint__Group__1__Impl rule__Joint__Group__2 ;
    public final void rule__Joint__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComposition.g:3133:1: ( rule__Joint__Group__1__Impl rule__Joint__Group__2 )
            // InternalComposition.g:3134:2: rule__Joint__Group__1__Impl rule__Joint__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__Joint__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Joint__Group__2();

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
    // $ANTLR end "rule__Joint__Group__1"


    // $ANTLR start "rule__Joint__Group__1__Impl"
    // InternalComposition.g:3141:1: rule__Joint__Group__1__Impl : ( ( rule__Joint__NameAssignment_1 ) ) ;
    public final void rule__Joint__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComposition.g:3145:1: ( ( ( rule__Joint__NameAssignment_1 ) ) )
            // InternalComposition.g:3146:1: ( ( rule__Joint__NameAssignment_1 ) )
            {
            // InternalComposition.g:3146:1: ( ( rule__Joint__NameAssignment_1 ) )
            // InternalComposition.g:3147:2: ( rule__Joint__NameAssignment_1 )
            {
             before(grammarAccess.getJointAccess().getNameAssignment_1()); 
            // InternalComposition.g:3148:2: ( rule__Joint__NameAssignment_1 )
            // InternalComposition.g:3148:3: rule__Joint__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Joint__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getJointAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Joint__Group__1__Impl"


    // $ANTLR start "rule__Joint__Group__2"
    // InternalComposition.g:3156:1: rule__Joint__Group__2 : rule__Joint__Group__2__Impl rule__Joint__Group__3 ;
    public final void rule__Joint__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComposition.g:3160:1: ( rule__Joint__Group__2__Impl rule__Joint__Group__3 )
            // InternalComposition.g:3161:2: rule__Joint__Group__2__Impl rule__Joint__Group__3
            {
            pushFollow(FOLLOW_15);
            rule__Joint__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Joint__Group__3();

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
    // $ANTLR end "rule__Joint__Group__2"


    // $ANTLR start "rule__Joint__Group__2__Impl"
    // InternalComposition.g:3168:1: rule__Joint__Group__2__Impl : ( '{' ) ;
    public final void rule__Joint__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComposition.g:3172:1: ( ( '{' ) )
            // InternalComposition.g:3173:1: ( '{' )
            {
            // InternalComposition.g:3173:1: ( '{' )
            // InternalComposition.g:3174:2: '{'
            {
             before(grammarAccess.getJointAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getJointAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Joint__Group__2__Impl"


    // $ANTLR start "rule__Joint__Group__3"
    // InternalComposition.g:3183:1: rule__Joint__Group__3 : rule__Joint__Group__3__Impl rule__Joint__Group__4 ;
    public final void rule__Joint__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComposition.g:3187:1: ( rule__Joint__Group__3__Impl rule__Joint__Group__4 )
            // InternalComposition.g:3188:2: rule__Joint__Group__3__Impl rule__Joint__Group__4
            {
            pushFollow(FOLLOW_29);
            rule__Joint__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Joint__Group__4();

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
    // $ANTLR end "rule__Joint__Group__3"


    // $ANTLR start "rule__Joint__Group__3__Impl"
    // InternalComposition.g:3195:1: rule__Joint__Group__3__Impl : ( 'type' ) ;
    public final void rule__Joint__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComposition.g:3199:1: ( ( 'type' ) )
            // InternalComposition.g:3200:1: ( 'type' )
            {
            // InternalComposition.g:3200:1: ( 'type' )
            // InternalComposition.g:3201:2: 'type'
            {
             before(grammarAccess.getJointAccess().getTypeKeyword_3()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getJointAccess().getTypeKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Joint__Group__3__Impl"


    // $ANTLR start "rule__Joint__Group__4"
    // InternalComposition.g:3210:1: rule__Joint__Group__4 : rule__Joint__Group__4__Impl rule__Joint__Group__5 ;
    public final void rule__Joint__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComposition.g:3214:1: ( rule__Joint__Group__4__Impl rule__Joint__Group__5 )
            // InternalComposition.g:3215:2: rule__Joint__Group__4__Impl rule__Joint__Group__5
            {
            pushFollow(FOLLOW_30);
            rule__Joint__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Joint__Group__5();

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
    // $ANTLR end "rule__Joint__Group__4"


    // $ANTLR start "rule__Joint__Group__4__Impl"
    // InternalComposition.g:3222:1: rule__Joint__Group__4__Impl : ( ( rule__Joint__TypeAssignment_4 ) ) ;
    public final void rule__Joint__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComposition.g:3226:1: ( ( ( rule__Joint__TypeAssignment_4 ) ) )
            // InternalComposition.g:3227:1: ( ( rule__Joint__TypeAssignment_4 ) )
            {
            // InternalComposition.g:3227:1: ( ( rule__Joint__TypeAssignment_4 ) )
            // InternalComposition.g:3228:2: ( rule__Joint__TypeAssignment_4 )
            {
             before(grammarAccess.getJointAccess().getTypeAssignment_4()); 
            // InternalComposition.g:3229:2: ( rule__Joint__TypeAssignment_4 )
            // InternalComposition.g:3229:3: rule__Joint__TypeAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Joint__TypeAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getJointAccess().getTypeAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Joint__Group__4__Impl"


    // $ANTLR start "rule__Joint__Group__5"
    // InternalComposition.g:3237:1: rule__Joint__Group__5 : rule__Joint__Group__5__Impl rule__Joint__Group__6 ;
    public final void rule__Joint__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComposition.g:3241:1: ( rule__Joint__Group__5__Impl rule__Joint__Group__6 )
            // InternalComposition.g:3242:2: rule__Joint__Group__5__Impl rule__Joint__Group__6
            {
            pushFollow(FOLLOW_5);
            rule__Joint__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Joint__Group__6();

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
    // $ANTLR end "rule__Joint__Group__5"


    // $ANTLR start "rule__Joint__Group__5__Impl"
    // InternalComposition.g:3249:1: rule__Joint__Group__5__Impl : ( 'parent' ) ;
    public final void rule__Joint__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComposition.g:3253:1: ( ( 'parent' ) )
            // InternalComposition.g:3254:1: ( 'parent' )
            {
            // InternalComposition.g:3254:1: ( 'parent' )
            // InternalComposition.g:3255:2: 'parent'
            {
             before(grammarAccess.getJointAccess().getParentKeyword_5()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getJointAccess().getParentKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Joint__Group__5__Impl"


    // $ANTLR start "rule__Joint__Group__6"
    // InternalComposition.g:3264:1: rule__Joint__Group__6 : rule__Joint__Group__6__Impl rule__Joint__Group__7 ;
    public final void rule__Joint__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComposition.g:3268:1: ( rule__Joint__Group__6__Impl rule__Joint__Group__7 )
            // InternalComposition.g:3269:2: rule__Joint__Group__6__Impl rule__Joint__Group__7
            {
            pushFollow(FOLLOW_31);
            rule__Joint__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Joint__Group__7();

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
    // $ANTLR end "rule__Joint__Group__6"


    // $ANTLR start "rule__Joint__Group__6__Impl"
    // InternalComposition.g:3276:1: rule__Joint__Group__6__Impl : ( ( rule__Joint__ParentAssignment_6 ) ) ;
    public final void rule__Joint__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComposition.g:3280:1: ( ( ( rule__Joint__ParentAssignment_6 ) ) )
            // InternalComposition.g:3281:1: ( ( rule__Joint__ParentAssignment_6 ) )
            {
            // InternalComposition.g:3281:1: ( ( rule__Joint__ParentAssignment_6 ) )
            // InternalComposition.g:3282:2: ( rule__Joint__ParentAssignment_6 )
            {
             before(grammarAccess.getJointAccess().getParentAssignment_6()); 
            // InternalComposition.g:3283:2: ( rule__Joint__ParentAssignment_6 )
            // InternalComposition.g:3283:3: rule__Joint__ParentAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__Joint__ParentAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getJointAccess().getParentAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Joint__Group__6__Impl"


    // $ANTLR start "rule__Joint__Group__7"
    // InternalComposition.g:3291:1: rule__Joint__Group__7 : rule__Joint__Group__7__Impl rule__Joint__Group__8 ;
    public final void rule__Joint__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComposition.g:3295:1: ( rule__Joint__Group__7__Impl rule__Joint__Group__8 )
            // InternalComposition.g:3296:2: rule__Joint__Group__7__Impl rule__Joint__Group__8
            {
            pushFollow(FOLLOW_31);
            rule__Joint__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Joint__Group__8();

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
    // $ANTLR end "rule__Joint__Group__7"


    // $ANTLR start "rule__Joint__Group__7__Impl"
    // InternalComposition.g:3303:1: rule__Joint__Group__7__Impl : ( ( rule__Joint__Group_7__0 )? ) ;
    public final void rule__Joint__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComposition.g:3307:1: ( ( ( rule__Joint__Group_7__0 )? ) )
            // InternalComposition.g:3308:1: ( ( rule__Joint__Group_7__0 )? )
            {
            // InternalComposition.g:3308:1: ( ( rule__Joint__Group_7__0 )? )
            // InternalComposition.g:3309:2: ( rule__Joint__Group_7__0 )?
            {
             before(grammarAccess.getJointAccess().getGroup_7()); 
            // InternalComposition.g:3310:2: ( rule__Joint__Group_7__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==45) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalComposition.g:3310:3: rule__Joint__Group_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Joint__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getJointAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Joint__Group__7__Impl"


    // $ANTLR start "rule__Joint__Group__8"
    // InternalComposition.g:3318:1: rule__Joint__Group__8 : rule__Joint__Group__8__Impl rule__Joint__Group__9 ;
    public final void rule__Joint__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComposition.g:3322:1: ( rule__Joint__Group__8__Impl rule__Joint__Group__9 )
            // InternalComposition.g:3323:2: rule__Joint__Group__8__Impl rule__Joint__Group__9
            {
            pushFollow(FOLLOW_32);
            rule__Joint__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Joint__Group__9();

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
    // $ANTLR end "rule__Joint__Group__8"


    // $ANTLR start "rule__Joint__Group__8__Impl"
    // InternalComposition.g:3330:1: rule__Joint__Group__8__Impl : ( 'origin' ) ;
    public final void rule__Joint__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComposition.g:3334:1: ( ( 'origin' ) )
            // InternalComposition.g:3335:1: ( 'origin' )
            {
            // InternalComposition.g:3335:1: ( 'origin' )
            // InternalComposition.g:3336:2: 'origin'
            {
             before(grammarAccess.getJointAccess().getOriginKeyword_8()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getJointAccess().getOriginKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Joint__Group__8__Impl"


    // $ANTLR start "rule__Joint__Group__9"
    // InternalComposition.g:3345:1: rule__Joint__Group__9 : rule__Joint__Group__9__Impl rule__Joint__Group__10 ;
    public final void rule__Joint__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComposition.g:3349:1: ( rule__Joint__Group__9__Impl rule__Joint__Group__10 )
            // InternalComposition.g:3350:2: rule__Joint__Group__9__Impl rule__Joint__Group__10
            {
            pushFollow(FOLLOW_33);
            rule__Joint__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Joint__Group__10();

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
    // $ANTLR end "rule__Joint__Group__9"


    // $ANTLR start "rule__Joint__Group__9__Impl"
    // InternalComposition.g:3357:1: rule__Joint__Group__9__Impl : ( ( rule__Joint__OriginAssignment_9 ) ) ;
    public final void rule__Joint__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComposition.g:3361:1: ( ( ( rule__Joint__OriginAssignment_9 ) ) )
            // InternalComposition.g:3362:1: ( ( rule__Joint__OriginAssignment_9 ) )
            {
            // InternalComposition.g:3362:1: ( ( rule__Joint__OriginAssignment_9 ) )
            // InternalComposition.g:3363:2: ( rule__Joint__OriginAssignment_9 )
            {
             before(grammarAccess.getJointAccess().getOriginAssignment_9()); 
            // InternalComposition.g:3364:2: ( rule__Joint__OriginAssignment_9 )
            // InternalComposition.g:3364:3: rule__Joint__OriginAssignment_9
            {
            pushFollow(FOLLOW_2);
            rule__Joint__OriginAssignment_9();

            state._fsp--;


            }

             after(grammarAccess.getJointAccess().getOriginAssignment_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Joint__Group__9__Impl"


    // $ANTLR start "rule__Joint__Group__10"
    // InternalComposition.g:3372:1: rule__Joint__Group__10 : rule__Joint__Group__10__Impl rule__Joint__Group__11 ;
    public final void rule__Joint__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComposition.g:3376:1: ( rule__Joint__Group__10__Impl rule__Joint__Group__11 )
            // InternalComposition.g:3377:2: rule__Joint__Group__10__Impl rule__Joint__Group__11
            {
            pushFollow(FOLLOW_33);
            rule__Joint__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Joint__Group__11();

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
    // $ANTLR end "rule__Joint__Group__10"


    // $ANTLR start "rule__Joint__Group__10__Impl"
    // InternalComposition.g:3384:1: rule__Joint__Group__10__Impl : ( ( rule__Joint__Group_10__0 )? ) ;
    public final void rule__Joint__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComposition.g:3388:1: ( ( ( rule__Joint__Group_10__0 )? ) )
            // InternalComposition.g:3389:1: ( ( rule__Joint__Group_10__0 )? )
            {
            // InternalComposition.g:3389:1: ( ( rule__Joint__Group_10__0 )? )
            // InternalComposition.g:3390:2: ( rule__Joint__Group_10__0 )?
            {
             before(grammarAccess.getJointAccess().getGroup_10()); 
            // InternalComposition.g:3391:2: ( rule__Joint__Group_10__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==46) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalComposition.g:3391:3: rule__Joint__Group_10__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Joint__Group_10__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getJointAccess().getGroup_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Joint__Group__10__Impl"


    // $ANTLR start "rule__Joint__Group__11"
    // InternalComposition.g:3399:1: rule__Joint__Group__11 : rule__Joint__Group__11__Impl rule__Joint__Group__12 ;
    public final void rule__Joint__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComposition.g:3403:1: ( rule__Joint__Group__11__Impl rule__Joint__Group__12 )
            // InternalComposition.g:3404:2: rule__Joint__Group__11__Impl rule__Joint__Group__12
            {
            pushFollow(FOLLOW_33);
            rule__Joint__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Joint__Group__12();

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
    // $ANTLR end "rule__Joint__Group__11"


    // $ANTLR start "rule__Joint__Group__11__Impl"
    // InternalComposition.g:3411:1: rule__Joint__Group__11__Impl : ( ( rule__Joint__Group_11__0 )? ) ;
    public final void rule__Joint__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComposition.g:3415:1: ( ( ( rule__Joint__Group_11__0 )? ) )
            // InternalComposition.g:3416:1: ( ( rule__Joint__Group_11__0 )? )
            {
            // InternalComposition.g:3416:1: ( ( rule__Joint__Group_11__0 )? )
            // InternalComposition.g:3417:2: ( rule__Joint__Group_11__0 )?
            {
             before(grammarAccess.getJointAccess().getGroup_11()); 
            // InternalComposition.g:3418:2: ( rule__Joint__Group_11__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==47) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalComposition.g:3418:3: rule__Joint__Group_11__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Joint__Group_11__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getJointAccess().getGroup_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Joint__Group__11__Impl"


    // $ANTLR start "rule__Joint__Group__12"
    // InternalComposition.g:3426:1: rule__Joint__Group__12 : rule__Joint__Group__12__Impl ;
    public final void rule__Joint__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComposition.g:3430:1: ( rule__Joint__Group__12__Impl )
            // InternalComposition.g:3431:2: rule__Joint__Group__12__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Joint__Group__12__Impl();

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
    // $ANTLR end "rule__Joint__Group__12"


    // $ANTLR start "rule__Joint__Group__12__Impl"
    // InternalComposition.g:3437:1: rule__Joint__Group__12__Impl : ( '}' ) ;
    public final void rule__Joint__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComposition.g:3441:1: ( ( '}' ) )
            // InternalComposition.g:3442:1: ( '}' )
            {
            // InternalComposition.g:3442:1: ( '}' )
            // InternalComposition.g:3443:2: '}'
            {
             before(grammarAccess.getJointAccess().getRightCurlyBracketKeyword_12()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getJointAccess().getRightCurlyBracketKeyword_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Joint__Group__12__Impl"


    // $ANTLR start "rule__Joint__Group_7__0"
    // InternalComposition.g:3453:1: rule__Joint__Group_7__0 : rule__Joint__Group_7__0__Impl rule__Joint__Group_7__1 ;
    public final void rule__Joint__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComposition.g:3457:1: ( rule__Joint__Group_7__0__Impl rule__Joint__Group_7__1 )
            // InternalComposition.g:3458:2: rule__Joint__Group_7__0__Impl rule__Joint__Group_7__1
            {
            pushFollow(FOLLOW_5);
            rule__Joint__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Joint__Group_7__1();

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
    // $ANTLR end "rule__Joint__Group_7__0"


    // $ANTLR start "rule__Joint__Group_7__0__Impl"
    // InternalComposition.g:3465:1: rule__Joint__Group_7__0__Impl : ( 'child' ) ;
    public final void rule__Joint__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComposition.g:3469:1: ( ( 'child' ) )
            // InternalComposition.g:3470:1: ( 'child' )
            {
            // InternalComposition.g:3470:1: ( 'child' )
            // InternalComposition.g:3471:2: 'child'
            {
             before(grammarAccess.getJointAccess().getChildKeyword_7_0()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getJointAccess().getChildKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Joint__Group_7__0__Impl"


    // $ANTLR start "rule__Joint__Group_7__1"
    // InternalComposition.g:3480:1: rule__Joint__Group_7__1 : rule__Joint__Group_7__1__Impl ;
    public final void rule__Joint__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComposition.g:3484:1: ( rule__Joint__Group_7__1__Impl )
            // InternalComposition.g:3485:2: rule__Joint__Group_7__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Joint__Group_7__1__Impl();

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
    // $ANTLR end "rule__Joint__Group_7__1"


    // $ANTLR start "rule__Joint__Group_7__1__Impl"
    // InternalComposition.g:3491:1: rule__Joint__Group_7__1__Impl : ( ( rule__Joint__ChildAssignment_7_1 ) ) ;
    public final void rule__Joint__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComposition.g:3495:1: ( ( ( rule__Joint__ChildAssignment_7_1 ) ) )
            // InternalComposition.g:3496:1: ( ( rule__Joint__ChildAssignment_7_1 ) )
            {
            // InternalComposition.g:3496:1: ( ( rule__Joint__ChildAssignment_7_1 ) )
            // InternalComposition.g:3497:2: ( rule__Joint__ChildAssignment_7_1 )
            {
             before(grammarAccess.getJointAccess().getChildAssignment_7_1()); 
            // InternalComposition.g:3498:2: ( rule__Joint__ChildAssignment_7_1 )
            // InternalComposition.g:3498:3: rule__Joint__ChildAssignment_7_1
            {
            pushFollow(FOLLOW_2);
            rule__Joint__ChildAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getJointAccess().getChildAssignment_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Joint__Group_7__1__Impl"


    // $ANTLR start "rule__Joint__Group_10__0"
    // InternalComposition.g:3507:1: rule__Joint__Group_10__0 : rule__Joint__Group_10__0__Impl rule__Joint__Group_10__1 ;
    public final void rule__Joint__Group_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComposition.g:3511:1: ( rule__Joint__Group_10__0__Impl rule__Joint__Group_10__1 )
            // InternalComposition.g:3512:2: rule__Joint__Group_10__0__Impl rule__Joint__Group_10__1
            {
            pushFollow(FOLLOW_34);
            rule__Joint__Group_10__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Joint__Group_10__1();

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
    // $ANTLR end "rule__Joint__Group_10__0"


    // $ANTLR start "rule__Joint__Group_10__0__Impl"
    // InternalComposition.g:3519:1: rule__Joint__Group_10__0__Impl : ( 'limit' ) ;
    public final void rule__Joint__Group_10__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComposition.g:3523:1: ( ( 'limit' ) )
            // InternalComposition.g:3524:1: ( 'limit' )
            {
            // InternalComposition.g:3524:1: ( 'limit' )
            // InternalComposition.g:3525:2: 'limit'
            {
             before(grammarAccess.getJointAccess().getLimitKeyword_10_0()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getJointAccess().getLimitKeyword_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Joint__Group_10__0__Impl"


    // $ANTLR start "rule__Joint__Group_10__1"
    // InternalComposition.g:3534:1: rule__Joint__Group_10__1 : rule__Joint__Group_10__1__Impl ;
    public final void rule__Joint__Group_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComposition.g:3538:1: ( rule__Joint__Group_10__1__Impl )
            // InternalComposition.g:3539:2: rule__Joint__Group_10__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Joint__Group_10__1__Impl();

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
    // $ANTLR end "rule__Joint__Group_10__1"


    // $ANTLR start "rule__Joint__Group_10__1__Impl"
    // InternalComposition.g:3545:1: rule__Joint__Group_10__1__Impl : ( ( rule__Joint__LimitAssignment_10_1 ) ) ;
    public final void rule__Joint__Group_10__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComposition.g:3549:1: ( ( ( rule__Joint__LimitAssignment_10_1 ) ) )
            // InternalComposition.g:3550:1: ( ( rule__Joint__LimitAssignment_10_1 ) )
            {
            // InternalComposition.g:3550:1: ( ( rule__Joint__LimitAssignment_10_1 ) )
            // InternalComposition.g:3551:2: ( rule__Joint__LimitAssignment_10_1 )
            {
             before(grammarAccess.getJointAccess().getLimitAssignment_10_1()); 
            // InternalComposition.g:3552:2: ( rule__Joint__LimitAssignment_10_1 )
            // InternalComposition.g:3552:3: rule__Joint__LimitAssignment_10_1
            {
            pushFollow(FOLLOW_2);
            rule__Joint__LimitAssignment_10_1();

            state._fsp--;


            }

             after(grammarAccess.getJointAccess().getLimitAssignment_10_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Joint__Group_10__1__Impl"


    // $ANTLR start "rule__Joint__Group_11__0"
    // InternalComposition.g:3561:1: rule__Joint__Group_11__0 : rule__Joint__Group_11__0__Impl rule__Joint__Group_11__1 ;
    public final void rule__Joint__Group_11__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComposition.g:3565:1: ( rule__Joint__Group_11__0__Impl rule__Joint__Group_11__1 )
            // InternalComposition.g:3566:2: rule__Joint__Group_11__0__Impl rule__Joint__Group_11__1
            {
            pushFollow(FOLLOW_35);
            rule__Joint__Group_11__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Joint__Group_11__1();

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
    // $ANTLR end "rule__Joint__Group_11__0"


    // $ANTLR start "rule__Joint__Group_11__0__Impl"
    // InternalComposition.g:3573:1: rule__Joint__Group_11__0__Impl : ( 'axis' ) ;
    public final void rule__Joint__Group_11__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComposition.g:3577:1: ( ( 'axis' ) )
            // InternalComposition.g:3578:1: ( 'axis' )
            {
            // InternalComposition.g:3578:1: ( 'axis' )
            // InternalComposition.g:3579:2: 'axis'
            {
             before(grammarAccess.getJointAccess().getAxisKeyword_11_0()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getJointAccess().getAxisKeyword_11_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Joint__Group_11__0__Impl"


    // $ANTLR start "rule__Joint__Group_11__1"
    // InternalComposition.g:3588:1: rule__Joint__Group_11__1 : rule__Joint__Group_11__1__Impl ;
    public final void rule__Joint__Group_11__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComposition.g:3592:1: ( rule__Joint__Group_11__1__Impl )
            // InternalComposition.g:3593:2: rule__Joint__Group_11__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Joint__Group_11__1__Impl();

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
    // $ANTLR end "rule__Joint__Group_11__1"


    // $ANTLR start "rule__Joint__Group_11__1__Impl"
    // InternalComposition.g:3599:1: rule__Joint__Group_11__1__Impl : ( ( rule__Joint__AxisAssignment_11_1 ) ) ;
    public final void rule__Joint__Group_11__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComposition.g:3603:1: ( ( ( rule__Joint__AxisAssignment_11_1 ) ) )
            // InternalComposition.g:3604:1: ( ( rule__Joint__AxisAssignment_11_1 ) )
            {
            // InternalComposition.g:3604:1: ( ( rule__Joint__AxisAssignment_11_1 ) )
            // InternalComposition.g:3605:2: ( rule__Joint__AxisAssignment_11_1 )
            {
             before(grammarAccess.getJointAccess().getAxisAssignment_11_1()); 
            // InternalComposition.g:3606:2: ( rule__Joint__AxisAssignment_11_1 )
            // InternalComposition.g:3606:3: rule__Joint__AxisAssignment_11_1
            {
            pushFollow(FOLLOW_2);
            rule__Joint__AxisAssignment_11_1();

            state._fsp--;


            }

             after(grammarAccess.getJointAccess().getAxisAssignment_11_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Joint__Group_11__1__Impl"


    // $ANTLR start "rule__Link__Group__0"
    // InternalComposition.g:3615:1: rule__Link__Group__0 : rule__Link__Group__0__Impl rule__Link__Group__1 ;
    public final void rule__Link__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComposition.g:3619:1: ( rule__Link__Group__0__Impl rule__Link__Group__1 )
            // InternalComposition.g:3620:2: rule__Link__Group__0__Impl rule__Link__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__Link__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Link__Group__1();

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
    // $ANTLR end "rule__Link__Group__0"


    // $ANTLR start "rule__Link__Group__0__Impl"
    // InternalComposition.g:3627:1: rule__Link__Group__0__Impl : ( () ) ;
    public final void rule__Link__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComposition.g:3631:1: ( ( () ) )
            // InternalComposition.g:3632:1: ( () )
            {
            // InternalComposition.g:3632:1: ( () )
            // InternalComposition.g:3633:2: ()
            {
             before(grammarAccess.getLinkAccess().getLinkAction_0()); 
            // InternalComposition.g:3634:2: ()
            // InternalComposition.g:3634:3: 
            {
            }

             after(grammarAccess.getLinkAccess().getLinkAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__Group__0__Impl"


    // $ANTLR start "rule__Link__Group__1"
    // InternalComposition.g:3642:1: rule__Link__Group__1 : rule__Link__Group__1__Impl rule__Link__Group__2 ;
    public final void rule__Link__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComposition.g:3646:1: ( rule__Link__Group__1__Impl rule__Link__Group__2 )
            // InternalComposition.g:3647:2: rule__Link__Group__1__Impl rule__Link__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Link__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Link__Group__2();

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
    // $ANTLR end "rule__Link__Group__1"


    // $ANTLR start "rule__Link__Group__1__Impl"
    // InternalComposition.g:3654:1: rule__Link__Group__1__Impl : ( 'Link' ) ;
    public final void rule__Link__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComposition.g:3658:1: ( ( 'Link' ) )
            // InternalComposition.g:3659:1: ( 'Link' )
            {
            // InternalComposition.g:3659:1: ( 'Link' )
            // InternalComposition.g:3660:2: 'Link'
            {
             before(grammarAccess.getLinkAccess().getLinkKeyword_1()); 
            match(input,48,FOLLOW_2); 
             after(grammarAccess.getLinkAccess().getLinkKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__Group__1__Impl"


    // $ANTLR start "rule__Link__Group__2"
    // InternalComposition.g:3669:1: rule__Link__Group__2 : rule__Link__Group__2__Impl ;
    public final void rule__Link__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComposition.g:3673:1: ( rule__Link__Group__2__Impl )
            // InternalComposition.g:3674:2: rule__Link__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Link__Group__2__Impl();

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
    // $ANTLR end "rule__Link__Group__2"


    // $ANTLR start "rule__Link__Group__2__Impl"
    // InternalComposition.g:3680:1: rule__Link__Group__2__Impl : ( ( rule__Link__NameAssignment_2 ) ) ;
    public final void rule__Link__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComposition.g:3684:1: ( ( ( rule__Link__NameAssignment_2 ) ) )
            // InternalComposition.g:3685:1: ( ( rule__Link__NameAssignment_2 ) )
            {
            // InternalComposition.g:3685:1: ( ( rule__Link__NameAssignment_2 ) )
            // InternalComposition.g:3686:2: ( rule__Link__NameAssignment_2 )
            {
             before(grammarAccess.getLinkAccess().getNameAssignment_2()); 
            // InternalComposition.g:3687:2: ( rule__Link__NameAssignment_2 )
            // InternalComposition.g:3687:3: rule__Link__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Link__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getLinkAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__Group__2__Impl"


    // $ANTLR start "rule__Pose__Group__0"
    // InternalComposition.g:3696:1: rule__Pose__Group__0 : rule__Pose__Group__0__Impl rule__Pose__Group__1 ;
    public final void rule__Pose__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComposition.g:3700:1: ( rule__Pose__Group__0__Impl rule__Pose__Group__1 )
            // InternalComposition.g:3701:2: rule__Pose__Group__0__Impl rule__Pose__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Pose__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Pose__Group__1();

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
    // $ANTLR end "rule__Pose__Group__0"


    // $ANTLR start "rule__Pose__Group__0__Impl"
    // InternalComposition.g:3708:1: rule__Pose__Group__0__Impl : ( 'Pose' ) ;
    public final void rule__Pose__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComposition.g:3712:1: ( ( 'Pose' ) )
            // InternalComposition.g:3713:1: ( 'Pose' )
            {
            // InternalComposition.g:3713:1: ( 'Pose' )
            // InternalComposition.g:3714:2: 'Pose'
            {
             before(grammarAccess.getPoseAccess().getPoseKeyword_0()); 
            match(input,49,FOLLOW_2); 
             after(grammarAccess.getPoseAccess().getPoseKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pose__Group__0__Impl"


    // $ANTLR start "rule__Pose__Group__1"
    // InternalComposition.g:3723:1: rule__Pose__Group__1 : rule__Pose__Group__1__Impl rule__Pose__Group__2 ;
    public final void rule__Pose__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComposition.g:3727:1: ( rule__Pose__Group__1__Impl rule__Pose__Group__2 )
            // InternalComposition.g:3728:2: rule__Pose__Group__1__Impl rule__Pose__Group__2
            {
            pushFollow(FOLLOW_36);
            rule__Pose__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Pose__Group__2();

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
    // $ANTLR end "rule__Pose__Group__1"


    // $ANTLR start "rule__Pose__Group__1__Impl"
    // InternalComposition.g:3735:1: rule__Pose__Group__1__Impl : ( '{' ) ;
    public final void rule__Pose__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComposition.g:3739:1: ( ( '{' ) )
            // InternalComposition.g:3740:1: ( '{' )
            {
            // InternalComposition.g:3740:1: ( '{' )
            // InternalComposition.g:3741:2: '{'
            {
             before(grammarAccess.getPoseAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getPoseAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pose__Group__1__Impl"


    // $ANTLR start "rule__Pose__Group__2"
    // InternalComposition.g:3750:1: rule__Pose__Group__2 : rule__Pose__Group__2__Impl rule__Pose__Group__3 ;
    public final void rule__Pose__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComposition.g:3754:1: ( rule__Pose__Group__2__Impl rule__Pose__Group__3 )
            // InternalComposition.g:3755:2: rule__Pose__Group__2__Impl rule__Pose__Group__3
            {
            pushFollow(FOLLOW_37);
            rule__Pose__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Pose__Group__3();

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
    // $ANTLR end "rule__Pose__Group__2"


    // $ANTLR start "rule__Pose__Group__2__Impl"
    // InternalComposition.g:3762:1: rule__Pose__Group__2__Impl : ( 'x' ) ;
    public final void rule__Pose__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComposition.g:3766:1: ( ( 'x' ) )
            // InternalComposition.g:3767:1: ( 'x' )
            {
            // InternalComposition.g:3767:1: ( 'x' )
            // InternalComposition.g:3768:2: 'x'
            {
             before(grammarAccess.getPoseAccess().getXKeyword_2()); 
            match(input,50,FOLLOW_2); 
             after(grammarAccess.getPoseAccess().getXKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pose__Group__2__Impl"


    // $ANTLR start "rule__Pose__Group__3"
    // InternalComposition.g:3777:1: rule__Pose__Group__3 : rule__Pose__Group__3__Impl rule__Pose__Group__4 ;
    public final void rule__Pose__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComposition.g:3781:1: ( rule__Pose__Group__3__Impl rule__Pose__Group__4 )
            // InternalComposition.g:3782:2: rule__Pose__Group__3__Impl rule__Pose__Group__4
            {
            pushFollow(FOLLOW_38);
            rule__Pose__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Pose__Group__4();

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
    // $ANTLR end "rule__Pose__Group__3"


    // $ANTLR start "rule__Pose__Group__3__Impl"
    // InternalComposition.g:3789:1: rule__Pose__Group__3__Impl : ( ( rule__Pose__XAssignment_3 ) ) ;
    public final void rule__Pose__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComposition.g:3793:1: ( ( ( rule__Pose__XAssignment_3 ) ) )
            // InternalComposition.g:3794:1: ( ( rule__Pose__XAssignment_3 ) )
            {
            // InternalComposition.g:3794:1: ( ( rule__Pose__XAssignment_3 ) )
            // InternalComposition.g:3795:2: ( rule__Pose__XAssignment_3 )
            {
             before(grammarAccess.getPoseAccess().getXAssignment_3()); 
            // InternalComposition.g:3796:2: ( rule__Pose__XAssignment_3 )
            // InternalComposition.g:3796:3: rule__Pose__XAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Pose__XAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getPoseAccess().getXAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pose__Group__3__Impl"


    // $ANTLR start "rule__Pose__Group__4"
    // InternalComposition.g:3804:1: rule__Pose__Group__4 : rule__Pose__Group__4__Impl rule__Pose__Group__5 ;
    public final void rule__Pose__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComposition.g:3808:1: ( rule__Pose__Group__4__Impl rule__Pose__Group__5 )
            // InternalComposition.g:3809:2: rule__Pose__Group__4__Impl rule__Pose__Group__5
            {
            pushFollow(FOLLOW_37);
            rule__Pose__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Pose__Group__5();

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
    // $ANTLR end "rule__Pose__Group__4"


    // $ANTLR start "rule__Pose__Group__4__Impl"
    // InternalComposition.g:3816:1: rule__Pose__Group__4__Impl : ( 'y' ) ;
    public final void rule__Pose__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComposition.g:3820:1: ( ( 'y' ) )
            // InternalComposition.g:3821:1: ( 'y' )
            {
            // InternalComposition.g:3821:1: ( 'y' )
            // InternalComposition.g:3822:2: 'y'
            {
             before(grammarAccess.getPoseAccess().getYKeyword_4()); 
            match(input,51,FOLLOW_2); 
             after(grammarAccess.getPoseAccess().getYKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pose__Group__4__Impl"


    // $ANTLR start "rule__Pose__Group__5"
    // InternalComposition.g:3831:1: rule__Pose__Group__5 : rule__Pose__Group__5__Impl rule__Pose__Group__6 ;
    public final void rule__Pose__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComposition.g:3835:1: ( rule__Pose__Group__5__Impl rule__Pose__Group__6 )
            // InternalComposition.g:3836:2: rule__Pose__Group__5__Impl rule__Pose__Group__6
            {
            pushFollow(FOLLOW_39);
            rule__Pose__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Pose__Group__6();

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
    // $ANTLR end "rule__Pose__Group__5"


    // $ANTLR start "rule__Pose__Group__5__Impl"
    // InternalComposition.g:3843:1: rule__Pose__Group__5__Impl : ( ( rule__Pose__YAssignment_5 ) ) ;
    public final void rule__Pose__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComposition.g:3847:1: ( ( ( rule__Pose__YAssignment_5 ) ) )
            // InternalComposition.g:3848:1: ( ( rule__Pose__YAssignment_5 ) )
            {
            // InternalComposition.g:3848:1: ( ( rule__Pose__YAssignment_5 ) )
            // InternalComposition.g:3849:2: ( rule__Pose__YAssignment_5 )
            {
             before(grammarAccess.getPoseAccess().getYAssignment_5()); 
            // InternalComposition.g:3850:2: ( rule__Pose__YAssignment_5 )
            // InternalComposition.g:3850:3: rule__Pose__YAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Pose__YAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getPoseAccess().getYAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pose__Group__5__Impl"


    // $ANTLR start "rule__Pose__Group__6"
    // InternalComposition.g:3858:1: rule__Pose__Group__6 : rule__Pose__Group__6__Impl rule__Pose__Group__7 ;
    public final void rule__Pose__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComposition.g:3862:1: ( rule__Pose__Group__6__Impl rule__Pose__Group__7 )
            // InternalComposition.g:3863:2: rule__Pose__Group__6__Impl rule__Pose__Group__7
            {
            pushFollow(FOLLOW_37);
            rule__Pose__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Pose__Group__7();

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
    // $ANTLR end "rule__Pose__Group__6"


    // $ANTLR start "rule__Pose__Group__6__Impl"
    // InternalComposition.g:3870:1: rule__Pose__Group__6__Impl : ( 'z' ) ;
    public final void rule__Pose__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComposition.g:3874:1: ( ( 'z' ) )
            // InternalComposition.g:3875:1: ( 'z' )
            {
            // InternalComposition.g:3875:1: ( 'z' )
            // InternalComposition.g:3876:2: 'z'
            {
             before(grammarAccess.getPoseAccess().getZKeyword_6()); 
            match(input,52,FOLLOW_2); 
             after(grammarAccess.getPoseAccess().getZKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pose__Group__6__Impl"


    // $ANTLR start "rule__Pose__Group__7"
    // InternalComposition.g:3885:1: rule__Pose__Group__7 : rule__Pose__Group__7__Impl rule__Pose__Group__8 ;
    public final void rule__Pose__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComposition.g:3889:1: ( rule__Pose__Group__7__Impl rule__Pose__Group__8 )
            // InternalComposition.g:3890:2: rule__Pose__Group__7__Impl rule__Pose__Group__8
            {
            pushFollow(FOLLOW_40);
            rule__Pose__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Pose__Group__8();

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
    // $ANTLR end "rule__Pose__Group__7"


    // $ANTLR start "rule__Pose__Group__7__Impl"
    // InternalComposition.g:3897:1: rule__Pose__Group__7__Impl : ( ( rule__Pose__ZAssignment_7 ) ) ;
    public final void rule__Pose__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComposition.g:3901:1: ( ( ( rule__Pose__ZAssignment_7 ) ) )
            // InternalComposition.g:3902:1: ( ( rule__Pose__ZAssignment_7 ) )
            {
            // InternalComposition.g:3902:1: ( ( rule__Pose__ZAssignment_7 ) )
            // InternalComposition.g:3903:2: ( rule__Pose__ZAssignment_7 )
            {
             before(grammarAccess.getPoseAccess().getZAssignment_7()); 
            // InternalComposition.g:3904:2: ( rule__Pose__ZAssignment_7 )
            // InternalComposition.g:3904:3: rule__Pose__ZAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__Pose__ZAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getPoseAccess().getZAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pose__Group__7__Impl"


    // $ANTLR start "rule__Pose__Group__8"
    // InternalComposition.g:3912:1: rule__Pose__Group__8 : rule__Pose__Group__8__Impl rule__Pose__Group__9 ;
    public final void rule__Pose__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComposition.g:3916:1: ( rule__Pose__Group__8__Impl rule__Pose__Group__9 )
            // InternalComposition.g:3917:2: rule__Pose__Group__8__Impl rule__Pose__Group__9
            {
            pushFollow(FOLLOW_37);
            rule__Pose__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Pose__Group__9();

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
    // $ANTLR end "rule__Pose__Group__8"


    // $ANTLR start "rule__Pose__Group__8__Impl"
    // InternalComposition.g:3924:1: rule__Pose__Group__8__Impl : ( 'roll' ) ;
    public final void rule__Pose__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComposition.g:3928:1: ( ( 'roll' ) )
            // InternalComposition.g:3929:1: ( 'roll' )
            {
            // InternalComposition.g:3929:1: ( 'roll' )
            // InternalComposition.g:3930:2: 'roll'
            {
             before(grammarAccess.getPoseAccess().getRollKeyword_8()); 
            match(input,53,FOLLOW_2); 
             after(grammarAccess.getPoseAccess().getRollKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pose__Group__8__Impl"


    // $ANTLR start "rule__Pose__Group__9"
    // InternalComposition.g:3939:1: rule__Pose__Group__9 : rule__Pose__Group__9__Impl rule__Pose__Group__10 ;
    public final void rule__Pose__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComposition.g:3943:1: ( rule__Pose__Group__9__Impl rule__Pose__Group__10 )
            // InternalComposition.g:3944:2: rule__Pose__Group__9__Impl rule__Pose__Group__10
            {
            pushFollow(FOLLOW_41);
            rule__Pose__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Pose__Group__10();

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
    // $ANTLR end "rule__Pose__Group__9"


    // $ANTLR start "rule__Pose__Group__9__Impl"
    // InternalComposition.g:3951:1: rule__Pose__Group__9__Impl : ( ( rule__Pose__RollAssignment_9 ) ) ;
    public final void rule__Pose__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComposition.g:3955:1: ( ( ( rule__Pose__RollAssignment_9 ) ) )
            // InternalComposition.g:3956:1: ( ( rule__Pose__RollAssignment_9 ) )
            {
            // InternalComposition.g:3956:1: ( ( rule__Pose__RollAssignment_9 ) )
            // InternalComposition.g:3957:2: ( rule__Pose__RollAssignment_9 )
            {
             before(grammarAccess.getPoseAccess().getRollAssignment_9()); 
            // InternalComposition.g:3958:2: ( rule__Pose__RollAssignment_9 )
            // InternalComposition.g:3958:3: rule__Pose__RollAssignment_9
            {
            pushFollow(FOLLOW_2);
            rule__Pose__RollAssignment_9();

            state._fsp--;


            }

             after(grammarAccess.getPoseAccess().getRollAssignment_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pose__Group__9__Impl"


    // $ANTLR start "rule__Pose__Group__10"
    // InternalComposition.g:3966:1: rule__Pose__Group__10 : rule__Pose__Group__10__Impl rule__Pose__Group__11 ;
    public final void rule__Pose__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComposition.g:3970:1: ( rule__Pose__Group__10__Impl rule__Pose__Group__11 )
            // InternalComposition.g:3971:2: rule__Pose__Group__10__Impl rule__Pose__Group__11
            {
            pushFollow(FOLLOW_37);
            rule__Pose__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Pose__Group__11();

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
    // $ANTLR end "rule__Pose__Group__10"


    // $ANTLR start "rule__Pose__Group__10__Impl"
    // InternalComposition.g:3978:1: rule__Pose__Group__10__Impl : ( 'pitch' ) ;
    public final void rule__Pose__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComposition.g:3982:1: ( ( 'pitch' ) )
            // InternalComposition.g:3983:1: ( 'pitch' )
            {
            // InternalComposition.g:3983:1: ( 'pitch' )
            // InternalComposition.g:3984:2: 'pitch'
            {
             before(grammarAccess.getPoseAccess().getPitchKeyword_10()); 
            match(input,54,FOLLOW_2); 
             after(grammarAccess.getPoseAccess().getPitchKeyword_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pose__Group__10__Impl"


    // $ANTLR start "rule__Pose__Group__11"
    // InternalComposition.g:3993:1: rule__Pose__Group__11 : rule__Pose__Group__11__Impl rule__Pose__Group__12 ;
    public final void rule__Pose__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComposition.g:3997:1: ( rule__Pose__Group__11__Impl rule__Pose__Group__12 )
            // InternalComposition.g:3998:2: rule__Pose__Group__11__Impl rule__Pose__Group__12
            {
            pushFollow(FOLLOW_42);
            rule__Pose__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Pose__Group__12();

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
    // $ANTLR end "rule__Pose__Group__11"


    // $ANTLR start "rule__Pose__Group__11__Impl"
    // InternalComposition.g:4005:1: rule__Pose__Group__11__Impl : ( ( rule__Pose__PitchAssignment_11 ) ) ;
    public final void rule__Pose__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComposition.g:4009:1: ( ( ( rule__Pose__PitchAssignment_11 ) ) )
            // InternalComposition.g:4010:1: ( ( rule__Pose__PitchAssignment_11 ) )
            {
            // InternalComposition.g:4010:1: ( ( rule__Pose__PitchAssignment_11 ) )
            // InternalComposition.g:4011:2: ( rule__Pose__PitchAssignment_11 )
            {
             before(grammarAccess.getPoseAccess().getPitchAssignment_11()); 
            // InternalComposition.g:4012:2: ( rule__Pose__PitchAssignment_11 )
            // InternalComposition.g:4012:3: rule__Pose__PitchAssignment_11
            {
            pushFollow(FOLLOW_2);
            rule__Pose__PitchAssignment_11();

            state._fsp--;


            }

             after(grammarAccess.getPoseAccess().getPitchAssignment_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pose__Group__11__Impl"


    // $ANTLR start "rule__Pose__Group__12"
    // InternalComposition.g:4020:1: rule__Pose__Group__12 : rule__Pose__Group__12__Impl rule__Pose__Group__13 ;
    public final void rule__Pose__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComposition.g:4024:1: ( rule__Pose__Group__12__Impl rule__Pose__Group__13 )
            // InternalComposition.g:4025:2: rule__Pose__Group__12__Impl rule__Pose__Group__13
            {
            pushFollow(FOLLOW_37);
            rule__Pose__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Pose__Group__13();

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
    // $ANTLR end "rule__Pose__Group__12"


    // $ANTLR start "rule__Pose__Group__12__Impl"
    // InternalComposition.g:4032:1: rule__Pose__Group__12__Impl : ( 'yaw' ) ;
    public final void rule__Pose__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComposition.g:4036:1: ( ( 'yaw' ) )
            // InternalComposition.g:4037:1: ( 'yaw' )
            {
            // InternalComposition.g:4037:1: ( 'yaw' )
            // InternalComposition.g:4038:2: 'yaw'
            {
             before(grammarAccess.getPoseAccess().getYawKeyword_12()); 
            match(input,55,FOLLOW_2); 
             after(grammarAccess.getPoseAccess().getYawKeyword_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pose__Group__12__Impl"


    // $ANTLR start "rule__Pose__Group__13"
    // InternalComposition.g:4047:1: rule__Pose__Group__13 : rule__Pose__Group__13__Impl rule__Pose__Group__14 ;
    public final void rule__Pose__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComposition.g:4051:1: ( rule__Pose__Group__13__Impl rule__Pose__Group__14 )
            // InternalComposition.g:4052:2: rule__Pose__Group__13__Impl rule__Pose__Group__14
            {
            pushFollow(FOLLOW_28);
            rule__Pose__Group__13__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Pose__Group__14();

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
    // $ANTLR end "rule__Pose__Group__13"


    // $ANTLR start "rule__Pose__Group__13__Impl"
    // InternalComposition.g:4059:1: rule__Pose__Group__13__Impl : ( ( rule__Pose__YawAssignment_13 ) ) ;
    public final void rule__Pose__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComposition.g:4063:1: ( ( ( rule__Pose__YawAssignment_13 ) ) )
            // InternalComposition.g:4064:1: ( ( rule__Pose__YawAssignment_13 ) )
            {
            // InternalComposition.g:4064:1: ( ( rule__Pose__YawAssignment_13 ) )
            // InternalComposition.g:4065:2: ( rule__Pose__YawAssignment_13 )
            {
             before(grammarAccess.getPoseAccess().getYawAssignment_13()); 
            // InternalComposition.g:4066:2: ( rule__Pose__YawAssignment_13 )
            // InternalComposition.g:4066:3: rule__Pose__YawAssignment_13
            {
            pushFollow(FOLLOW_2);
            rule__Pose__YawAssignment_13();

            state._fsp--;


            }

             after(grammarAccess.getPoseAccess().getYawAssignment_13()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pose__Group__13__Impl"


    // $ANTLR start "rule__Pose__Group__14"
    // InternalComposition.g:4074:1: rule__Pose__Group__14 : rule__Pose__Group__14__Impl ;
    public final void rule__Pose__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComposition.g:4078:1: ( rule__Pose__Group__14__Impl )
            // InternalComposition.g:4079:2: rule__Pose__Group__14__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Pose__Group__14__Impl();

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
    // $ANTLR end "rule__Pose__Group__14"


    // $ANTLR start "rule__Pose__Group__14__Impl"
    // InternalComposition.g:4085:1: rule__Pose__Group__14__Impl : ( '}' ) ;
    public final void rule__Pose__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComposition.g:4089:1: ( ( '}' ) )
            // InternalComposition.g:4090:1: ( '}' )
            {
            // InternalComposition.g:4090:1: ( '}' )
            // InternalComposition.g:4091:2: '}'
            {
             before(grammarAccess.getPoseAccess().getRightCurlyBracketKeyword_14()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getPoseAccess().getRightCurlyBracketKeyword_14()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pose__Group__14__Impl"


    // $ANTLR start "rule__Limit__Group__0"
    // InternalComposition.g:4101:1: rule__Limit__Group__0 : rule__Limit__Group__0__Impl rule__Limit__Group__1 ;
    public final void rule__Limit__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComposition.g:4105:1: ( rule__Limit__Group__0__Impl rule__Limit__Group__1 )
            // InternalComposition.g:4106:2: rule__Limit__Group__0__Impl rule__Limit__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Limit__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Limit__Group__1();

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
    // $ANTLR end "rule__Limit__Group__0"


    // $ANTLR start "rule__Limit__Group__0__Impl"
    // InternalComposition.g:4113:1: rule__Limit__Group__0__Impl : ( 'Limit' ) ;
    public final void rule__Limit__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComposition.g:4117:1: ( ( 'Limit' ) )
            // InternalComposition.g:4118:1: ( 'Limit' )
            {
            // InternalComposition.g:4118:1: ( 'Limit' )
            // InternalComposition.g:4119:2: 'Limit'
            {
             before(grammarAccess.getLimitAccess().getLimitKeyword_0()); 
            match(input,56,FOLLOW_2); 
             after(grammarAccess.getLimitAccess().getLimitKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Limit__Group__0__Impl"


    // $ANTLR start "rule__Limit__Group__1"
    // InternalComposition.g:4128:1: rule__Limit__Group__1 : rule__Limit__Group__1__Impl rule__Limit__Group__2 ;
    public final void rule__Limit__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComposition.g:4132:1: ( rule__Limit__Group__1__Impl rule__Limit__Group__2 )
            // InternalComposition.g:4133:2: rule__Limit__Group__1__Impl rule__Limit__Group__2
            {
            pushFollow(FOLLOW_43);
            rule__Limit__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Limit__Group__2();

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
    // $ANTLR end "rule__Limit__Group__1"


    // $ANTLR start "rule__Limit__Group__1__Impl"
    // InternalComposition.g:4140:1: rule__Limit__Group__1__Impl : ( '{' ) ;
    public final void rule__Limit__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComposition.g:4144:1: ( ( '{' ) )
            // InternalComposition.g:4145:1: ( '{' )
            {
            // InternalComposition.g:4145:1: ( '{' )
            // InternalComposition.g:4146:2: '{'
            {
             before(grammarAccess.getLimitAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getLimitAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Limit__Group__1__Impl"


    // $ANTLR start "rule__Limit__Group__2"
    // InternalComposition.g:4155:1: rule__Limit__Group__2 : rule__Limit__Group__2__Impl rule__Limit__Group__3 ;
    public final void rule__Limit__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComposition.g:4159:1: ( rule__Limit__Group__2__Impl rule__Limit__Group__3 )
            // InternalComposition.g:4160:2: rule__Limit__Group__2__Impl rule__Limit__Group__3
            {
            pushFollow(FOLLOW_37);
            rule__Limit__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Limit__Group__3();

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
    // $ANTLR end "rule__Limit__Group__2"


    // $ANTLR start "rule__Limit__Group__2__Impl"
    // InternalComposition.g:4167:1: rule__Limit__Group__2__Impl : ( 'effort' ) ;
    public final void rule__Limit__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComposition.g:4171:1: ( ( 'effort' ) )
            // InternalComposition.g:4172:1: ( 'effort' )
            {
            // InternalComposition.g:4172:1: ( 'effort' )
            // InternalComposition.g:4173:2: 'effort'
            {
             before(grammarAccess.getLimitAccess().getEffortKeyword_2()); 
            match(input,57,FOLLOW_2); 
             after(grammarAccess.getLimitAccess().getEffortKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Limit__Group__2__Impl"


    // $ANTLR start "rule__Limit__Group__3"
    // InternalComposition.g:4182:1: rule__Limit__Group__3 : rule__Limit__Group__3__Impl rule__Limit__Group__4 ;
    public final void rule__Limit__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComposition.g:4186:1: ( rule__Limit__Group__3__Impl rule__Limit__Group__4 )
            // InternalComposition.g:4187:2: rule__Limit__Group__3__Impl rule__Limit__Group__4
            {
            pushFollow(FOLLOW_44);
            rule__Limit__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Limit__Group__4();

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
    // $ANTLR end "rule__Limit__Group__3"


    // $ANTLR start "rule__Limit__Group__3__Impl"
    // InternalComposition.g:4194:1: rule__Limit__Group__3__Impl : ( ( rule__Limit__EffortAssignment_3 ) ) ;
    public final void rule__Limit__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComposition.g:4198:1: ( ( ( rule__Limit__EffortAssignment_3 ) ) )
            // InternalComposition.g:4199:1: ( ( rule__Limit__EffortAssignment_3 ) )
            {
            // InternalComposition.g:4199:1: ( ( rule__Limit__EffortAssignment_3 ) )
            // InternalComposition.g:4200:2: ( rule__Limit__EffortAssignment_3 )
            {
             before(grammarAccess.getLimitAccess().getEffortAssignment_3()); 
            // InternalComposition.g:4201:2: ( rule__Limit__EffortAssignment_3 )
            // InternalComposition.g:4201:3: rule__Limit__EffortAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Limit__EffortAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getLimitAccess().getEffortAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Limit__Group__3__Impl"


    // $ANTLR start "rule__Limit__Group__4"
    // InternalComposition.g:4209:1: rule__Limit__Group__4 : rule__Limit__Group__4__Impl rule__Limit__Group__5 ;
    public final void rule__Limit__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComposition.g:4213:1: ( rule__Limit__Group__4__Impl rule__Limit__Group__5 )
            // InternalComposition.g:4214:2: rule__Limit__Group__4__Impl rule__Limit__Group__5
            {
            pushFollow(FOLLOW_37);
            rule__Limit__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Limit__Group__5();

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
    // $ANTLR end "rule__Limit__Group__4"


    // $ANTLR start "rule__Limit__Group__4__Impl"
    // InternalComposition.g:4221:1: rule__Limit__Group__4__Impl : ( 'velocity' ) ;
    public final void rule__Limit__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComposition.g:4225:1: ( ( 'velocity' ) )
            // InternalComposition.g:4226:1: ( 'velocity' )
            {
            // InternalComposition.g:4226:1: ( 'velocity' )
            // InternalComposition.g:4227:2: 'velocity'
            {
             before(grammarAccess.getLimitAccess().getVelocityKeyword_4()); 
            match(input,58,FOLLOW_2); 
             after(grammarAccess.getLimitAccess().getVelocityKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Limit__Group__4__Impl"


    // $ANTLR start "rule__Limit__Group__5"
    // InternalComposition.g:4236:1: rule__Limit__Group__5 : rule__Limit__Group__5__Impl rule__Limit__Group__6 ;
    public final void rule__Limit__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComposition.g:4240:1: ( rule__Limit__Group__5__Impl rule__Limit__Group__6 )
            // InternalComposition.g:4241:2: rule__Limit__Group__5__Impl rule__Limit__Group__6
            {
            pushFollow(FOLLOW_45);
            rule__Limit__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Limit__Group__6();

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
    // $ANTLR end "rule__Limit__Group__5"


    // $ANTLR start "rule__Limit__Group__5__Impl"
    // InternalComposition.g:4248:1: rule__Limit__Group__5__Impl : ( ( rule__Limit__VelocityAssignment_5 ) ) ;
    public final void rule__Limit__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComposition.g:4252:1: ( ( ( rule__Limit__VelocityAssignment_5 ) ) )
            // InternalComposition.g:4253:1: ( ( rule__Limit__VelocityAssignment_5 ) )
            {
            // InternalComposition.g:4253:1: ( ( rule__Limit__VelocityAssignment_5 ) )
            // InternalComposition.g:4254:2: ( rule__Limit__VelocityAssignment_5 )
            {
             before(grammarAccess.getLimitAccess().getVelocityAssignment_5()); 
            // InternalComposition.g:4255:2: ( rule__Limit__VelocityAssignment_5 )
            // InternalComposition.g:4255:3: rule__Limit__VelocityAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Limit__VelocityAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getLimitAccess().getVelocityAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Limit__Group__5__Impl"


    // $ANTLR start "rule__Limit__Group__6"
    // InternalComposition.g:4263:1: rule__Limit__Group__6 : rule__Limit__Group__6__Impl rule__Limit__Group__7 ;
    public final void rule__Limit__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComposition.g:4267:1: ( rule__Limit__Group__6__Impl rule__Limit__Group__7 )
            // InternalComposition.g:4268:2: rule__Limit__Group__6__Impl rule__Limit__Group__7
            {
            pushFollow(FOLLOW_45);
            rule__Limit__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Limit__Group__7();

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
    // $ANTLR end "rule__Limit__Group__6"


    // $ANTLR start "rule__Limit__Group__6__Impl"
    // InternalComposition.g:4275:1: rule__Limit__Group__6__Impl : ( ( rule__Limit__Group_6__0 )? ) ;
    public final void rule__Limit__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComposition.g:4279:1: ( ( ( rule__Limit__Group_6__0 )? ) )
            // InternalComposition.g:4280:1: ( ( rule__Limit__Group_6__0 )? )
            {
            // InternalComposition.g:4280:1: ( ( rule__Limit__Group_6__0 )? )
            // InternalComposition.g:4281:2: ( rule__Limit__Group_6__0 )?
            {
             before(grammarAccess.getLimitAccess().getGroup_6()); 
            // InternalComposition.g:4282:2: ( rule__Limit__Group_6__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==59) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalComposition.g:4282:3: rule__Limit__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Limit__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLimitAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Limit__Group__6__Impl"


    // $ANTLR start "rule__Limit__Group__7"
    // InternalComposition.g:4290:1: rule__Limit__Group__7 : rule__Limit__Group__7__Impl rule__Limit__Group__8 ;
    public final void rule__Limit__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComposition.g:4294:1: ( rule__Limit__Group__7__Impl rule__Limit__Group__8 )
            // InternalComposition.g:4295:2: rule__Limit__Group__7__Impl rule__Limit__Group__8
            {
            pushFollow(FOLLOW_45);
            rule__Limit__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Limit__Group__8();

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
    // $ANTLR end "rule__Limit__Group__7"


    // $ANTLR start "rule__Limit__Group__7__Impl"
    // InternalComposition.g:4302:1: rule__Limit__Group__7__Impl : ( ( rule__Limit__Group_7__0 )? ) ;
    public final void rule__Limit__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComposition.g:4306:1: ( ( ( rule__Limit__Group_7__0 )? ) )
            // InternalComposition.g:4307:1: ( ( rule__Limit__Group_7__0 )? )
            {
            // InternalComposition.g:4307:1: ( ( rule__Limit__Group_7__0 )? )
            // InternalComposition.g:4308:2: ( rule__Limit__Group_7__0 )?
            {
             before(grammarAccess.getLimitAccess().getGroup_7()); 
            // InternalComposition.g:4309:2: ( rule__Limit__Group_7__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==60) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalComposition.g:4309:3: rule__Limit__Group_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Limit__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLimitAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Limit__Group__7__Impl"


    // $ANTLR start "rule__Limit__Group__8"
    // InternalComposition.g:4317:1: rule__Limit__Group__8 : rule__Limit__Group__8__Impl ;
    public final void rule__Limit__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComposition.g:4321:1: ( rule__Limit__Group__8__Impl )
            // InternalComposition.g:4322:2: rule__Limit__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Limit__Group__8__Impl();

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
    // $ANTLR end "rule__Limit__Group__8"


    // $ANTLR start "rule__Limit__Group__8__Impl"
    // InternalComposition.g:4328:1: rule__Limit__Group__8__Impl : ( '}' ) ;
    public final void rule__Limit__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComposition.g:4332:1: ( ( '}' ) )
            // InternalComposition.g:4333:1: ( '}' )
            {
            // InternalComposition.g:4333:1: ( '}' )
            // InternalComposition.g:4334:2: '}'
            {
             before(grammarAccess.getLimitAccess().getRightCurlyBracketKeyword_8()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getLimitAccess().getRightCurlyBracketKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Limit__Group__8__Impl"


    // $ANTLR start "rule__Limit__Group_6__0"
    // InternalComposition.g:4344:1: rule__Limit__Group_6__0 : rule__Limit__Group_6__0__Impl rule__Limit__Group_6__1 ;
    public final void rule__Limit__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComposition.g:4348:1: ( rule__Limit__Group_6__0__Impl rule__Limit__Group_6__1 )
            // InternalComposition.g:4349:2: rule__Limit__Group_6__0__Impl rule__Limit__Group_6__1
            {
            pushFollow(FOLLOW_37);
            rule__Limit__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Limit__Group_6__1();

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
    // $ANTLR end "rule__Limit__Group_6__0"


    // $ANTLR start "rule__Limit__Group_6__0__Impl"
    // InternalComposition.g:4356:1: rule__Limit__Group_6__0__Impl : ( 'lower' ) ;
    public final void rule__Limit__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComposition.g:4360:1: ( ( 'lower' ) )
            // InternalComposition.g:4361:1: ( 'lower' )
            {
            // InternalComposition.g:4361:1: ( 'lower' )
            // InternalComposition.g:4362:2: 'lower'
            {
             before(grammarAccess.getLimitAccess().getLowerKeyword_6_0()); 
            match(input,59,FOLLOW_2); 
             after(grammarAccess.getLimitAccess().getLowerKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Limit__Group_6__0__Impl"


    // $ANTLR start "rule__Limit__Group_6__1"
    // InternalComposition.g:4371:1: rule__Limit__Group_6__1 : rule__Limit__Group_6__1__Impl ;
    public final void rule__Limit__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComposition.g:4375:1: ( rule__Limit__Group_6__1__Impl )
            // InternalComposition.g:4376:2: rule__Limit__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Limit__Group_6__1__Impl();

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
    // $ANTLR end "rule__Limit__Group_6__1"


    // $ANTLR start "rule__Limit__Group_6__1__Impl"
    // InternalComposition.g:4382:1: rule__Limit__Group_6__1__Impl : ( ( rule__Limit__LowerAssignment_6_1 ) ) ;
    public final void rule__Limit__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComposition.g:4386:1: ( ( ( rule__Limit__LowerAssignment_6_1 ) ) )
            // InternalComposition.g:4387:1: ( ( rule__Limit__LowerAssignment_6_1 ) )
            {
            // InternalComposition.g:4387:1: ( ( rule__Limit__LowerAssignment_6_1 ) )
            // InternalComposition.g:4388:2: ( rule__Limit__LowerAssignment_6_1 )
            {
             before(grammarAccess.getLimitAccess().getLowerAssignment_6_1()); 
            // InternalComposition.g:4389:2: ( rule__Limit__LowerAssignment_6_1 )
            // InternalComposition.g:4389:3: rule__Limit__LowerAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__Limit__LowerAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getLimitAccess().getLowerAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Limit__Group_6__1__Impl"


    // $ANTLR start "rule__Limit__Group_7__0"
    // InternalComposition.g:4398:1: rule__Limit__Group_7__0 : rule__Limit__Group_7__0__Impl rule__Limit__Group_7__1 ;
    public final void rule__Limit__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComposition.g:4402:1: ( rule__Limit__Group_7__0__Impl rule__Limit__Group_7__1 )
            // InternalComposition.g:4403:2: rule__Limit__Group_7__0__Impl rule__Limit__Group_7__1
            {
            pushFollow(FOLLOW_37);
            rule__Limit__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Limit__Group_7__1();

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
    // $ANTLR end "rule__Limit__Group_7__0"


    // $ANTLR start "rule__Limit__Group_7__0__Impl"
    // InternalComposition.g:4410:1: rule__Limit__Group_7__0__Impl : ( 'upper' ) ;
    public final void rule__Limit__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComposition.g:4414:1: ( ( 'upper' ) )
            // InternalComposition.g:4415:1: ( 'upper' )
            {
            // InternalComposition.g:4415:1: ( 'upper' )
            // InternalComposition.g:4416:2: 'upper'
            {
             before(grammarAccess.getLimitAccess().getUpperKeyword_7_0()); 
            match(input,60,FOLLOW_2); 
             after(grammarAccess.getLimitAccess().getUpperKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Limit__Group_7__0__Impl"


    // $ANTLR start "rule__Limit__Group_7__1"
    // InternalComposition.g:4425:1: rule__Limit__Group_7__1 : rule__Limit__Group_7__1__Impl ;
    public final void rule__Limit__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComposition.g:4429:1: ( rule__Limit__Group_7__1__Impl )
            // InternalComposition.g:4430:2: rule__Limit__Group_7__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Limit__Group_7__1__Impl();

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
    // $ANTLR end "rule__Limit__Group_7__1"


    // $ANTLR start "rule__Limit__Group_7__1__Impl"
    // InternalComposition.g:4436:1: rule__Limit__Group_7__1__Impl : ( ( rule__Limit__UpperAssignment_7_1 ) ) ;
    public final void rule__Limit__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComposition.g:4440:1: ( ( ( rule__Limit__UpperAssignment_7_1 ) ) )
            // InternalComposition.g:4441:1: ( ( rule__Limit__UpperAssignment_7_1 ) )
            {
            // InternalComposition.g:4441:1: ( ( rule__Limit__UpperAssignment_7_1 ) )
            // InternalComposition.g:4442:2: ( rule__Limit__UpperAssignment_7_1 )
            {
             before(grammarAccess.getLimitAccess().getUpperAssignment_7_1()); 
            // InternalComposition.g:4443:2: ( rule__Limit__UpperAssignment_7_1 )
            // InternalComposition.g:4443:3: rule__Limit__UpperAssignment_7_1
            {
            pushFollow(FOLLOW_2);
            rule__Limit__UpperAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getLimitAccess().getUpperAssignment_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Limit__Group_7__1__Impl"


    // $ANTLR start "rule__Axis__Group__0"
    // InternalComposition.g:4452:1: rule__Axis__Group__0 : rule__Axis__Group__0__Impl rule__Axis__Group__1 ;
    public final void rule__Axis__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComposition.g:4456:1: ( rule__Axis__Group__0__Impl rule__Axis__Group__1 )
            // InternalComposition.g:4457:2: rule__Axis__Group__0__Impl rule__Axis__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Axis__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Axis__Group__1();

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
    // $ANTLR end "rule__Axis__Group__0"


    // $ANTLR start "rule__Axis__Group__0__Impl"
    // InternalComposition.g:4464:1: rule__Axis__Group__0__Impl : ( 'Axis' ) ;
    public final void rule__Axis__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComposition.g:4468:1: ( ( 'Axis' ) )
            // InternalComposition.g:4469:1: ( 'Axis' )
            {
            // InternalComposition.g:4469:1: ( 'Axis' )
            // InternalComposition.g:4470:2: 'Axis'
            {
             before(grammarAccess.getAxisAccess().getAxisKeyword_0()); 
            match(input,61,FOLLOW_2); 
             after(grammarAccess.getAxisAccess().getAxisKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Axis__Group__0__Impl"


    // $ANTLR start "rule__Axis__Group__1"
    // InternalComposition.g:4479:1: rule__Axis__Group__1 : rule__Axis__Group__1__Impl rule__Axis__Group__2 ;
    public final void rule__Axis__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComposition.g:4483:1: ( rule__Axis__Group__1__Impl rule__Axis__Group__2 )
            // InternalComposition.g:4484:2: rule__Axis__Group__1__Impl rule__Axis__Group__2
            {
            pushFollow(FOLLOW_36);
            rule__Axis__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Axis__Group__2();

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
    // $ANTLR end "rule__Axis__Group__1"


    // $ANTLR start "rule__Axis__Group__1__Impl"
    // InternalComposition.g:4491:1: rule__Axis__Group__1__Impl : ( '{' ) ;
    public final void rule__Axis__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComposition.g:4495:1: ( ( '{' ) )
            // InternalComposition.g:4496:1: ( '{' )
            {
            // InternalComposition.g:4496:1: ( '{' )
            // InternalComposition.g:4497:2: '{'
            {
             before(grammarAccess.getAxisAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getAxisAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Axis__Group__1__Impl"


    // $ANTLR start "rule__Axis__Group__2"
    // InternalComposition.g:4506:1: rule__Axis__Group__2 : rule__Axis__Group__2__Impl rule__Axis__Group__3 ;
    public final void rule__Axis__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComposition.g:4510:1: ( rule__Axis__Group__2__Impl rule__Axis__Group__3 )
            // InternalComposition.g:4511:2: rule__Axis__Group__2__Impl rule__Axis__Group__3
            {
            pushFollow(FOLLOW_37);
            rule__Axis__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Axis__Group__3();

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
    // $ANTLR end "rule__Axis__Group__2"


    // $ANTLR start "rule__Axis__Group__2__Impl"
    // InternalComposition.g:4518:1: rule__Axis__Group__2__Impl : ( 'x' ) ;
    public final void rule__Axis__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComposition.g:4522:1: ( ( 'x' ) )
            // InternalComposition.g:4523:1: ( 'x' )
            {
            // InternalComposition.g:4523:1: ( 'x' )
            // InternalComposition.g:4524:2: 'x'
            {
             before(grammarAccess.getAxisAccess().getXKeyword_2()); 
            match(input,50,FOLLOW_2); 
             after(grammarAccess.getAxisAccess().getXKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Axis__Group__2__Impl"


    // $ANTLR start "rule__Axis__Group__3"
    // InternalComposition.g:4533:1: rule__Axis__Group__3 : rule__Axis__Group__3__Impl rule__Axis__Group__4 ;
    public final void rule__Axis__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComposition.g:4537:1: ( rule__Axis__Group__3__Impl rule__Axis__Group__4 )
            // InternalComposition.g:4538:2: rule__Axis__Group__3__Impl rule__Axis__Group__4
            {
            pushFollow(FOLLOW_38);
            rule__Axis__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Axis__Group__4();

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
    // $ANTLR end "rule__Axis__Group__3"


    // $ANTLR start "rule__Axis__Group__3__Impl"
    // InternalComposition.g:4545:1: rule__Axis__Group__3__Impl : ( ( rule__Axis__XAssignment_3 ) ) ;
    public final void rule__Axis__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComposition.g:4549:1: ( ( ( rule__Axis__XAssignment_3 ) ) )
            // InternalComposition.g:4550:1: ( ( rule__Axis__XAssignment_3 ) )
            {
            // InternalComposition.g:4550:1: ( ( rule__Axis__XAssignment_3 ) )
            // InternalComposition.g:4551:2: ( rule__Axis__XAssignment_3 )
            {
             before(grammarAccess.getAxisAccess().getXAssignment_3()); 
            // InternalComposition.g:4552:2: ( rule__Axis__XAssignment_3 )
            // InternalComposition.g:4552:3: rule__Axis__XAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Axis__XAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getAxisAccess().getXAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Axis__Group__3__Impl"


    // $ANTLR start "rule__Axis__Group__4"
    // InternalComposition.g:4560:1: rule__Axis__Group__4 : rule__Axis__Group__4__Impl rule__Axis__Group__5 ;
    public final void rule__Axis__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComposition.g:4564:1: ( rule__Axis__Group__4__Impl rule__Axis__Group__5 )
            // InternalComposition.g:4565:2: rule__Axis__Group__4__Impl rule__Axis__Group__5
            {
            pushFollow(FOLLOW_37);
            rule__Axis__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Axis__Group__5();

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
    // $ANTLR end "rule__Axis__Group__4"


    // $ANTLR start "rule__Axis__Group__4__Impl"
    // InternalComposition.g:4572:1: rule__Axis__Group__4__Impl : ( 'y' ) ;
    public final void rule__Axis__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComposition.g:4576:1: ( ( 'y' ) )
            // InternalComposition.g:4577:1: ( 'y' )
            {
            // InternalComposition.g:4577:1: ( 'y' )
            // InternalComposition.g:4578:2: 'y'
            {
             before(grammarAccess.getAxisAccess().getYKeyword_4()); 
            match(input,51,FOLLOW_2); 
             after(grammarAccess.getAxisAccess().getYKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Axis__Group__4__Impl"


    // $ANTLR start "rule__Axis__Group__5"
    // InternalComposition.g:4587:1: rule__Axis__Group__5 : rule__Axis__Group__5__Impl rule__Axis__Group__6 ;
    public final void rule__Axis__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComposition.g:4591:1: ( rule__Axis__Group__5__Impl rule__Axis__Group__6 )
            // InternalComposition.g:4592:2: rule__Axis__Group__5__Impl rule__Axis__Group__6
            {
            pushFollow(FOLLOW_39);
            rule__Axis__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Axis__Group__6();

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
    // $ANTLR end "rule__Axis__Group__5"


    // $ANTLR start "rule__Axis__Group__5__Impl"
    // InternalComposition.g:4599:1: rule__Axis__Group__5__Impl : ( ( rule__Axis__YAssignment_5 ) ) ;
    public final void rule__Axis__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComposition.g:4603:1: ( ( ( rule__Axis__YAssignment_5 ) ) )
            // InternalComposition.g:4604:1: ( ( rule__Axis__YAssignment_5 ) )
            {
            // InternalComposition.g:4604:1: ( ( rule__Axis__YAssignment_5 ) )
            // InternalComposition.g:4605:2: ( rule__Axis__YAssignment_5 )
            {
             before(grammarAccess.getAxisAccess().getYAssignment_5()); 
            // InternalComposition.g:4606:2: ( rule__Axis__YAssignment_5 )
            // InternalComposition.g:4606:3: rule__Axis__YAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Axis__YAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getAxisAccess().getYAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Axis__Group__5__Impl"


    // $ANTLR start "rule__Axis__Group__6"
    // InternalComposition.g:4614:1: rule__Axis__Group__6 : rule__Axis__Group__6__Impl rule__Axis__Group__7 ;
    public final void rule__Axis__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComposition.g:4618:1: ( rule__Axis__Group__6__Impl rule__Axis__Group__7 )
            // InternalComposition.g:4619:2: rule__Axis__Group__6__Impl rule__Axis__Group__7
            {
            pushFollow(FOLLOW_37);
            rule__Axis__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Axis__Group__7();

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
    // $ANTLR end "rule__Axis__Group__6"


    // $ANTLR start "rule__Axis__Group__6__Impl"
    // InternalComposition.g:4626:1: rule__Axis__Group__6__Impl : ( 'z' ) ;
    public final void rule__Axis__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComposition.g:4630:1: ( ( 'z' ) )
            // InternalComposition.g:4631:1: ( 'z' )
            {
            // InternalComposition.g:4631:1: ( 'z' )
            // InternalComposition.g:4632:2: 'z'
            {
             before(grammarAccess.getAxisAccess().getZKeyword_6()); 
            match(input,52,FOLLOW_2); 
             after(grammarAccess.getAxisAccess().getZKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Axis__Group__6__Impl"


    // $ANTLR start "rule__Axis__Group__7"
    // InternalComposition.g:4641:1: rule__Axis__Group__7 : rule__Axis__Group__7__Impl rule__Axis__Group__8 ;
    public final void rule__Axis__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComposition.g:4645:1: ( rule__Axis__Group__7__Impl rule__Axis__Group__8 )
            // InternalComposition.g:4646:2: rule__Axis__Group__7__Impl rule__Axis__Group__8
            {
            pushFollow(FOLLOW_28);
            rule__Axis__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Axis__Group__8();

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
    // $ANTLR end "rule__Axis__Group__7"


    // $ANTLR start "rule__Axis__Group__7__Impl"
    // InternalComposition.g:4653:1: rule__Axis__Group__7__Impl : ( ( rule__Axis__ZAssignment_7 ) ) ;
    public final void rule__Axis__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComposition.g:4657:1: ( ( ( rule__Axis__ZAssignment_7 ) ) )
            // InternalComposition.g:4658:1: ( ( rule__Axis__ZAssignment_7 ) )
            {
            // InternalComposition.g:4658:1: ( ( rule__Axis__ZAssignment_7 ) )
            // InternalComposition.g:4659:2: ( rule__Axis__ZAssignment_7 )
            {
             before(grammarAccess.getAxisAccess().getZAssignment_7()); 
            // InternalComposition.g:4660:2: ( rule__Axis__ZAssignment_7 )
            // InternalComposition.g:4660:3: rule__Axis__ZAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__Axis__ZAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getAxisAccess().getZAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Axis__Group__7__Impl"


    // $ANTLR start "rule__Axis__Group__8"
    // InternalComposition.g:4668:1: rule__Axis__Group__8 : rule__Axis__Group__8__Impl ;
    public final void rule__Axis__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComposition.g:4672:1: ( rule__Axis__Group__8__Impl )
            // InternalComposition.g:4673:2: rule__Axis__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Axis__Group__8__Impl();

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
    // $ANTLR end "rule__Axis__Group__8"


    // $ANTLR start "rule__Axis__Group__8__Impl"
    // InternalComposition.g:4679:1: rule__Axis__Group__8__Impl : ( '}' ) ;
    public final void rule__Axis__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComposition.g:4683:1: ( ( '}' ) )
            // InternalComposition.g:4684:1: ( '}' )
            {
            // InternalComposition.g:4684:1: ( '}' )
            // InternalComposition.g:4685:2: '}'
            {
             before(grammarAccess.getAxisAccess().getRightCurlyBracketKeyword_8()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getAxisAccess().getRightCurlyBracketKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Axis__Group__8__Impl"


    // $ANTLR start "rule__Component__NameAssignment_3"
    // InternalComposition.g:4695:1: rule__Component__NameAssignment_3 : ( ruleEString ) ;
    public final void rule__Component__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComposition.g:4699:1: ( ( ruleEString ) )
            // InternalComposition.g:4700:2: ( ruleEString )
            {
            // InternalComposition.g:4700:2: ( ruleEString )
            // InternalComposition.g:4701:3: ruleEString
            {
             before(grammarAccess.getComponentAccess().getNameEStringParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getComponentAccess().getNameEStringParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__NameAssignment_3"


    // $ANTLR start "rule__Component__ParametersAssignment_4_2"
    // InternalComposition.g:4710:1: rule__Component__ParametersAssignment_4_2 : ( ruleParameter ) ;
    public final void rule__Component__ParametersAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComposition.g:4714:1: ( ( ruleParameter ) )
            // InternalComposition.g:4715:2: ( ruleParameter )
            {
            // InternalComposition.g:4715:2: ( ruleParameter )
            // InternalComposition.g:4716:3: ruleParameter
            {
             before(grammarAccess.getComponentAccess().getParametersParameterParserRuleCall_4_2_0()); 
            pushFollow(FOLLOW_2);
            ruleParameter();

            state._fsp--;

             after(grammarAccess.getComponentAccess().getParametersParameterParserRuleCall_4_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__ParametersAssignment_4_2"


    // $ANTLR start "rule__Component__ParametersAssignment_4_3_1"
    // InternalComposition.g:4725:1: rule__Component__ParametersAssignment_4_3_1 : ( ruleParameter ) ;
    public final void rule__Component__ParametersAssignment_4_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComposition.g:4729:1: ( ( ruleParameter ) )
            // InternalComposition.g:4730:2: ( ruleParameter )
            {
            // InternalComposition.g:4730:2: ( ruleParameter )
            // InternalComposition.g:4731:3: ruleParameter
            {
             before(grammarAccess.getComponentAccess().getParametersParameterParserRuleCall_4_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleParameter();

            state._fsp--;

             after(grammarAccess.getComponentAccess().getParametersParameterParserRuleCall_4_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__ParametersAssignment_4_3_1"


    // $ANTLR start "rule__Component__LinksAssignment_5_2"
    // InternalComposition.g:4740:1: rule__Component__LinksAssignment_5_2 : ( ruleLink ) ;
    public final void rule__Component__LinksAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComposition.g:4744:1: ( ( ruleLink ) )
            // InternalComposition.g:4745:2: ( ruleLink )
            {
            // InternalComposition.g:4745:2: ( ruleLink )
            // InternalComposition.g:4746:3: ruleLink
            {
             before(grammarAccess.getComponentAccess().getLinksLinkParserRuleCall_5_2_0()); 
            pushFollow(FOLLOW_2);
            ruleLink();

            state._fsp--;

             after(grammarAccess.getComponentAccess().getLinksLinkParserRuleCall_5_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__LinksAssignment_5_2"


    // $ANTLR start "rule__Component__LinksAssignment_5_3_1"
    // InternalComposition.g:4755:1: rule__Component__LinksAssignment_5_3_1 : ( ruleLink ) ;
    public final void rule__Component__LinksAssignment_5_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComposition.g:4759:1: ( ( ruleLink ) )
            // InternalComposition.g:4760:2: ( ruleLink )
            {
            // InternalComposition.g:4760:2: ( ruleLink )
            // InternalComposition.g:4761:3: ruleLink
            {
             before(grammarAccess.getComponentAccess().getLinksLinkParserRuleCall_5_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleLink();

            state._fsp--;

             after(grammarAccess.getComponentAccess().getLinksLinkParserRuleCall_5_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__LinksAssignment_5_3_1"


    // $ANTLR start "rule__Component__JointsAssignment_6_2"
    // InternalComposition.g:4770:1: rule__Component__JointsAssignment_6_2 : ( ruleJoint ) ;
    public final void rule__Component__JointsAssignment_6_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComposition.g:4774:1: ( ( ruleJoint ) )
            // InternalComposition.g:4775:2: ( ruleJoint )
            {
            // InternalComposition.g:4775:2: ( ruleJoint )
            // InternalComposition.g:4776:3: ruleJoint
            {
             before(grammarAccess.getComponentAccess().getJointsJointParserRuleCall_6_2_0()); 
            pushFollow(FOLLOW_2);
            ruleJoint();

            state._fsp--;

             after(grammarAccess.getComponentAccess().getJointsJointParserRuleCall_6_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__JointsAssignment_6_2"


    // $ANTLR start "rule__Component__JointsAssignment_6_3_1"
    // InternalComposition.g:4785:1: rule__Component__JointsAssignment_6_3_1 : ( ruleJoint ) ;
    public final void rule__Component__JointsAssignment_6_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComposition.g:4789:1: ( ( ruleJoint ) )
            // InternalComposition.g:4790:2: ( ruleJoint )
            {
            // InternalComposition.g:4790:2: ( ruleJoint )
            // InternalComposition.g:4791:3: ruleJoint
            {
             before(grammarAccess.getComponentAccess().getJointsJointParserRuleCall_6_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleJoint();

            state._fsp--;

             after(grammarAccess.getComponentAccess().getJointsJointParserRuleCall_6_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__JointsAssignment_6_3_1"


    // $ANTLR start "rule__Component__ComponentsAssignment_7_2"
    // InternalComposition.g:4800:1: rule__Component__ComponentsAssignment_7_2 : ( ruleComponentInstance ) ;
    public final void rule__Component__ComponentsAssignment_7_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComposition.g:4804:1: ( ( ruleComponentInstance ) )
            // InternalComposition.g:4805:2: ( ruleComponentInstance )
            {
            // InternalComposition.g:4805:2: ( ruleComponentInstance )
            // InternalComposition.g:4806:3: ruleComponentInstance
            {
             before(grammarAccess.getComponentAccess().getComponentsComponentInstanceParserRuleCall_7_2_0()); 
            pushFollow(FOLLOW_2);
            ruleComponentInstance();

            state._fsp--;

             after(grammarAccess.getComponentAccess().getComponentsComponentInstanceParserRuleCall_7_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__ComponentsAssignment_7_2"


    // $ANTLR start "rule__Component__ComponentsAssignment_7_3_1"
    // InternalComposition.g:4815:1: rule__Component__ComponentsAssignment_7_3_1 : ( ruleComponentInstance ) ;
    public final void rule__Component__ComponentsAssignment_7_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComposition.g:4819:1: ( ( ruleComponentInstance ) )
            // InternalComposition.g:4820:2: ( ruleComponentInstance )
            {
            // InternalComposition.g:4820:2: ( ruleComponentInstance )
            // InternalComposition.g:4821:3: ruleComponentInstance
            {
             before(grammarAccess.getComponentAccess().getComponentsComponentInstanceParserRuleCall_7_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleComponentInstance();

            state._fsp--;

             after(grammarAccess.getComponentAccess().getComponentsComponentInstanceParserRuleCall_7_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__ComponentsAssignment_7_3_1"


    // $ANTLR start "rule__ComponentInstance__TypeAssignment_3"
    // InternalComposition.g:4830:1: rule__ComponentInstance__TypeAssignment_3 : ( ( ruleEString ) ) ;
    public final void rule__ComponentInstance__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComposition.g:4834:1: ( ( ( ruleEString ) ) )
            // InternalComposition.g:4835:2: ( ( ruleEString ) )
            {
            // InternalComposition.g:4835:2: ( ( ruleEString ) )
            // InternalComposition.g:4836:3: ( ruleEString )
            {
             before(grammarAccess.getComponentInstanceAccess().getTypeComponentCrossReference_3_0()); 
            // InternalComposition.g:4837:3: ( ruleEString )
            // InternalComposition.g:4838:4: ruleEString
            {
             before(grammarAccess.getComponentInstanceAccess().getTypeComponentEStringParserRuleCall_3_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getComponentInstanceAccess().getTypeComponentEStringParserRuleCall_3_0_1()); 

            }

             after(grammarAccess.getComponentInstanceAccess().getTypeComponentCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInstance__TypeAssignment_3"


    // $ANTLR start "rule__ComponentInstance__ParametersAssignment_4_2"
    // InternalComposition.g:4849:1: rule__ComponentInstance__ParametersAssignment_4_2 : ( ruleParameterInstance ) ;
    public final void rule__ComponentInstance__ParametersAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComposition.g:4853:1: ( ( ruleParameterInstance ) )
            // InternalComposition.g:4854:2: ( ruleParameterInstance )
            {
            // InternalComposition.g:4854:2: ( ruleParameterInstance )
            // InternalComposition.g:4855:3: ruleParameterInstance
            {
             before(grammarAccess.getComponentInstanceAccess().getParametersParameterInstanceParserRuleCall_4_2_0()); 
            pushFollow(FOLLOW_2);
            ruleParameterInstance();

            state._fsp--;

             after(grammarAccess.getComponentInstanceAccess().getParametersParameterInstanceParserRuleCall_4_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInstance__ParametersAssignment_4_2"


    // $ANTLR start "rule__ComponentInstance__ParametersAssignment_4_3_1"
    // InternalComposition.g:4864:1: rule__ComponentInstance__ParametersAssignment_4_3_1 : ( ruleParameterInstance ) ;
    public final void rule__ComponentInstance__ParametersAssignment_4_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComposition.g:4868:1: ( ( ruleParameterInstance ) )
            // InternalComposition.g:4869:2: ( ruleParameterInstance )
            {
            // InternalComposition.g:4869:2: ( ruleParameterInstance )
            // InternalComposition.g:4870:3: ruleParameterInstance
            {
             before(grammarAccess.getComponentInstanceAccess().getParametersParameterInstanceParserRuleCall_4_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleParameterInstance();

            state._fsp--;

             after(grammarAccess.getComponentInstanceAccess().getParametersParameterInstanceParserRuleCall_4_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInstance__ParametersAssignment_4_3_1"


    // $ANTLR start "rule__Parameter__NameAssignment_1"
    // InternalComposition.g:4879:1: rule__Parameter__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Parameter__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComposition.g:4883:1: ( ( ruleEString ) )
            // InternalComposition.g:4884:2: ( ruleEString )
            {
            // InternalComposition.g:4884:2: ( ruleEString )
            // InternalComposition.g:4885:3: ruleEString
            {
             before(grammarAccess.getParameterAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getParameterAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__NameAssignment_1"


    // $ANTLR start "rule__Parameter__TypeAssignment_4"
    // InternalComposition.g:4894:1: rule__Parameter__TypeAssignment_4 : ( ruleParameterType ) ;
    public final void rule__Parameter__TypeAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComposition.g:4898:1: ( ( ruleParameterType ) )
            // InternalComposition.g:4899:2: ( ruleParameterType )
            {
            // InternalComposition.g:4899:2: ( ruleParameterType )
            // InternalComposition.g:4900:3: ruleParameterType
            {
             before(grammarAccess.getParameterAccess().getTypeParameterTypeParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleParameterType();

            state._fsp--;

             after(grammarAccess.getParameterAccess().getTypeParameterTypeParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__TypeAssignment_4"


    // $ANTLR start "rule__Parameter__ValueAssignment_5_1"
    // InternalComposition.g:4909:1: rule__Parameter__ValueAssignment_5_1 : ( ruleParameterValue ) ;
    public final void rule__Parameter__ValueAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComposition.g:4913:1: ( ( ruleParameterValue ) )
            // InternalComposition.g:4914:2: ( ruleParameterValue )
            {
            // InternalComposition.g:4914:2: ( ruleParameterValue )
            // InternalComposition.g:4915:3: ruleParameterValue
            {
             before(grammarAccess.getParameterAccess().getValueParameterValueParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleParameterValue();

            state._fsp--;

             after(grammarAccess.getParameterAccess().getValueParameterValueParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__ValueAssignment_5_1"


    // $ANTLR start "rule__ParameterValue_Impl__ValueAssignment_3_1"
    // InternalComposition.g:4924:1: rule__ParameterValue_Impl__ValueAssignment_3_1 : ( ruleEString ) ;
    public final void rule__ParameterValue_Impl__ValueAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComposition.g:4928:1: ( ( ruleEString ) )
            // InternalComposition.g:4929:2: ( ruleEString )
            {
            // InternalComposition.g:4929:2: ( ruleEString )
            // InternalComposition.g:4930:3: ruleEString
            {
             before(grammarAccess.getParameterValue_ImplAccess().getValueEStringParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getParameterValue_ImplAccess().getValueEStringParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterValue_Impl__ValueAssignment_3_1"


    // $ANTLR start "rule__LinkRef__ValueAssignment_3_1"
    // InternalComposition.g:4939:1: rule__LinkRef__ValueAssignment_3_1 : ( ruleEString ) ;
    public final void rule__LinkRef__ValueAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComposition.g:4943:1: ( ( ruleEString ) )
            // InternalComposition.g:4944:2: ( ruleEString )
            {
            // InternalComposition.g:4944:2: ( ruleEString )
            // InternalComposition.g:4945:3: ruleEString
            {
             before(grammarAccess.getLinkRefAccess().getValueEStringParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getLinkRefAccess().getValueEStringParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LinkRef__ValueAssignment_3_1"


    // $ANTLR start "rule__LinkRef__RefAssignment_4_1"
    // InternalComposition.g:4954:1: rule__LinkRef__RefAssignment_4_1 : ( ( ruleEString ) ) ;
    public final void rule__LinkRef__RefAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComposition.g:4958:1: ( ( ( ruleEString ) ) )
            // InternalComposition.g:4959:2: ( ( ruleEString ) )
            {
            // InternalComposition.g:4959:2: ( ( ruleEString ) )
            // InternalComposition.g:4960:3: ( ruleEString )
            {
             before(grammarAccess.getLinkRefAccess().getRefLinkCrossReference_4_1_0()); 
            // InternalComposition.g:4961:3: ( ruleEString )
            // InternalComposition.g:4962:4: ruleEString
            {
             before(grammarAccess.getLinkRefAccess().getRefLinkEStringParserRuleCall_4_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getLinkRefAccess().getRefLinkEStringParserRuleCall_4_1_0_1()); 

            }

             after(grammarAccess.getLinkRefAccess().getRefLinkCrossReference_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LinkRef__RefAssignment_4_1"


    // $ANTLR start "rule__ParameterInstance__ParameterAssignment_3"
    // InternalComposition.g:4973:1: rule__ParameterInstance__ParameterAssignment_3 : ( ( ruleEString ) ) ;
    public final void rule__ParameterInstance__ParameterAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComposition.g:4977:1: ( ( ( ruleEString ) ) )
            // InternalComposition.g:4978:2: ( ( ruleEString ) )
            {
            // InternalComposition.g:4978:2: ( ( ruleEString ) )
            // InternalComposition.g:4979:3: ( ruleEString )
            {
             before(grammarAccess.getParameterInstanceAccess().getParameterParameterCrossReference_3_0()); 
            // InternalComposition.g:4980:3: ( ruleEString )
            // InternalComposition.g:4981:4: ruleEString
            {
             before(grammarAccess.getParameterInstanceAccess().getParameterParameterEStringParserRuleCall_3_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getParameterInstanceAccess().getParameterParameterEStringParserRuleCall_3_0_1()); 

            }

             after(grammarAccess.getParameterInstanceAccess().getParameterParameterCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterInstance__ParameterAssignment_3"


    // $ANTLR start "rule__ParameterInstance__ValueAssignment_5"
    // InternalComposition.g:4992:1: rule__ParameterInstance__ValueAssignment_5 : ( ruleParameterValue ) ;
    public final void rule__ParameterInstance__ValueAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComposition.g:4996:1: ( ( ruleParameterValue ) )
            // InternalComposition.g:4997:2: ( ruleParameterValue )
            {
            // InternalComposition.g:4997:2: ( ruleParameterValue )
            // InternalComposition.g:4998:3: ruleParameterValue
            {
             before(grammarAccess.getParameterInstanceAccess().getValueParameterValueParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleParameterValue();

            state._fsp--;

             after(grammarAccess.getParameterInstanceAccess().getValueParameterValueParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterInstance__ValueAssignment_5"


    // $ANTLR start "rule__Joint__NameAssignment_1"
    // InternalComposition.g:5007:1: rule__Joint__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Joint__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComposition.g:5011:1: ( ( ruleEString ) )
            // InternalComposition.g:5012:2: ( ruleEString )
            {
            // InternalComposition.g:5012:2: ( ruleEString )
            // InternalComposition.g:5013:3: ruleEString
            {
             before(grammarAccess.getJointAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getJointAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Joint__NameAssignment_1"


    // $ANTLR start "rule__Joint__TypeAssignment_4"
    // InternalComposition.g:5022:1: rule__Joint__TypeAssignment_4 : ( ruleJointType ) ;
    public final void rule__Joint__TypeAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComposition.g:5026:1: ( ( ruleJointType ) )
            // InternalComposition.g:5027:2: ( ruleJointType )
            {
            // InternalComposition.g:5027:2: ( ruleJointType )
            // InternalComposition.g:5028:3: ruleJointType
            {
             before(grammarAccess.getJointAccess().getTypeJointTypeEnumRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleJointType();

            state._fsp--;

             after(grammarAccess.getJointAccess().getTypeJointTypeEnumRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Joint__TypeAssignment_4"


    // $ANTLR start "rule__Joint__ParentAssignment_6"
    // InternalComposition.g:5037:1: rule__Joint__ParentAssignment_6 : ( ( ruleEString ) ) ;
    public final void rule__Joint__ParentAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComposition.g:5041:1: ( ( ( ruleEString ) ) )
            // InternalComposition.g:5042:2: ( ( ruleEString ) )
            {
            // InternalComposition.g:5042:2: ( ( ruleEString ) )
            // InternalComposition.g:5043:3: ( ruleEString )
            {
             before(grammarAccess.getJointAccess().getParentLinkCrossReference_6_0()); 
            // InternalComposition.g:5044:3: ( ruleEString )
            // InternalComposition.g:5045:4: ruleEString
            {
             before(grammarAccess.getJointAccess().getParentLinkEStringParserRuleCall_6_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getJointAccess().getParentLinkEStringParserRuleCall_6_0_1()); 

            }

             after(grammarAccess.getJointAccess().getParentLinkCrossReference_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Joint__ParentAssignment_6"


    // $ANTLR start "rule__Joint__ChildAssignment_7_1"
    // InternalComposition.g:5056:1: rule__Joint__ChildAssignment_7_1 : ( ( ruleEString ) ) ;
    public final void rule__Joint__ChildAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComposition.g:5060:1: ( ( ( ruleEString ) ) )
            // InternalComposition.g:5061:2: ( ( ruleEString ) )
            {
            // InternalComposition.g:5061:2: ( ( ruleEString ) )
            // InternalComposition.g:5062:3: ( ruleEString )
            {
             before(grammarAccess.getJointAccess().getChildLinkCrossReference_7_1_0()); 
            // InternalComposition.g:5063:3: ( ruleEString )
            // InternalComposition.g:5064:4: ruleEString
            {
             before(grammarAccess.getJointAccess().getChildLinkEStringParserRuleCall_7_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getJointAccess().getChildLinkEStringParserRuleCall_7_1_0_1()); 

            }

             after(grammarAccess.getJointAccess().getChildLinkCrossReference_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Joint__ChildAssignment_7_1"


    // $ANTLR start "rule__Joint__OriginAssignment_9"
    // InternalComposition.g:5075:1: rule__Joint__OriginAssignment_9 : ( rulePose ) ;
    public final void rule__Joint__OriginAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComposition.g:5079:1: ( ( rulePose ) )
            // InternalComposition.g:5080:2: ( rulePose )
            {
            // InternalComposition.g:5080:2: ( rulePose )
            // InternalComposition.g:5081:3: rulePose
            {
             before(grammarAccess.getJointAccess().getOriginPoseParserRuleCall_9_0()); 
            pushFollow(FOLLOW_2);
            rulePose();

            state._fsp--;

             after(grammarAccess.getJointAccess().getOriginPoseParserRuleCall_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Joint__OriginAssignment_9"


    // $ANTLR start "rule__Joint__LimitAssignment_10_1"
    // InternalComposition.g:5090:1: rule__Joint__LimitAssignment_10_1 : ( ruleLimit ) ;
    public final void rule__Joint__LimitAssignment_10_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComposition.g:5094:1: ( ( ruleLimit ) )
            // InternalComposition.g:5095:2: ( ruleLimit )
            {
            // InternalComposition.g:5095:2: ( ruleLimit )
            // InternalComposition.g:5096:3: ruleLimit
            {
             before(grammarAccess.getJointAccess().getLimitLimitParserRuleCall_10_1_0()); 
            pushFollow(FOLLOW_2);
            ruleLimit();

            state._fsp--;

             after(grammarAccess.getJointAccess().getLimitLimitParserRuleCall_10_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Joint__LimitAssignment_10_1"


    // $ANTLR start "rule__Joint__AxisAssignment_11_1"
    // InternalComposition.g:5105:1: rule__Joint__AxisAssignment_11_1 : ( ruleAxis ) ;
    public final void rule__Joint__AxisAssignment_11_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComposition.g:5109:1: ( ( ruleAxis ) )
            // InternalComposition.g:5110:2: ( ruleAxis )
            {
            // InternalComposition.g:5110:2: ( ruleAxis )
            // InternalComposition.g:5111:3: ruleAxis
            {
             before(grammarAccess.getJointAccess().getAxisAxisParserRuleCall_11_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAxis();

            state._fsp--;

             after(grammarAccess.getJointAccess().getAxisAxisParserRuleCall_11_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Joint__AxisAssignment_11_1"


    // $ANTLR start "rule__Link__NameAssignment_2"
    // InternalComposition.g:5120:1: rule__Link__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Link__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComposition.g:5124:1: ( ( ruleEString ) )
            // InternalComposition.g:5125:2: ( ruleEString )
            {
            // InternalComposition.g:5125:2: ( ruleEString )
            // InternalComposition.g:5126:3: ruleEString
            {
             before(grammarAccess.getLinkAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getLinkAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__NameAssignment_2"


    // $ANTLR start "rule__Pose__XAssignment_3"
    // InternalComposition.g:5135:1: rule__Pose__XAssignment_3 : ( ruleEDouble ) ;
    public final void rule__Pose__XAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComposition.g:5139:1: ( ( ruleEDouble ) )
            // InternalComposition.g:5140:2: ( ruleEDouble )
            {
            // InternalComposition.g:5140:2: ( ruleEDouble )
            // InternalComposition.g:5141:3: ruleEDouble
            {
             before(grammarAccess.getPoseAccess().getXEDoubleParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleEDouble();

            state._fsp--;

             after(grammarAccess.getPoseAccess().getXEDoubleParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pose__XAssignment_3"


    // $ANTLR start "rule__Pose__YAssignment_5"
    // InternalComposition.g:5150:1: rule__Pose__YAssignment_5 : ( ruleEDouble ) ;
    public final void rule__Pose__YAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComposition.g:5154:1: ( ( ruleEDouble ) )
            // InternalComposition.g:5155:2: ( ruleEDouble )
            {
            // InternalComposition.g:5155:2: ( ruleEDouble )
            // InternalComposition.g:5156:3: ruleEDouble
            {
             before(grammarAccess.getPoseAccess().getYEDoubleParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleEDouble();

            state._fsp--;

             after(grammarAccess.getPoseAccess().getYEDoubleParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pose__YAssignment_5"


    // $ANTLR start "rule__Pose__ZAssignment_7"
    // InternalComposition.g:5165:1: rule__Pose__ZAssignment_7 : ( ruleEDouble ) ;
    public final void rule__Pose__ZAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComposition.g:5169:1: ( ( ruleEDouble ) )
            // InternalComposition.g:5170:2: ( ruleEDouble )
            {
            // InternalComposition.g:5170:2: ( ruleEDouble )
            // InternalComposition.g:5171:3: ruleEDouble
            {
             before(grammarAccess.getPoseAccess().getZEDoubleParserRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            ruleEDouble();

            state._fsp--;

             after(grammarAccess.getPoseAccess().getZEDoubleParserRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pose__ZAssignment_7"


    // $ANTLR start "rule__Pose__RollAssignment_9"
    // InternalComposition.g:5180:1: rule__Pose__RollAssignment_9 : ( ruleEDouble ) ;
    public final void rule__Pose__RollAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComposition.g:5184:1: ( ( ruleEDouble ) )
            // InternalComposition.g:5185:2: ( ruleEDouble )
            {
            // InternalComposition.g:5185:2: ( ruleEDouble )
            // InternalComposition.g:5186:3: ruleEDouble
            {
             before(grammarAccess.getPoseAccess().getRollEDoubleParserRuleCall_9_0()); 
            pushFollow(FOLLOW_2);
            ruleEDouble();

            state._fsp--;

             after(grammarAccess.getPoseAccess().getRollEDoubleParserRuleCall_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pose__RollAssignment_9"


    // $ANTLR start "rule__Pose__PitchAssignment_11"
    // InternalComposition.g:5195:1: rule__Pose__PitchAssignment_11 : ( ruleEDouble ) ;
    public final void rule__Pose__PitchAssignment_11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComposition.g:5199:1: ( ( ruleEDouble ) )
            // InternalComposition.g:5200:2: ( ruleEDouble )
            {
            // InternalComposition.g:5200:2: ( ruleEDouble )
            // InternalComposition.g:5201:3: ruleEDouble
            {
             before(grammarAccess.getPoseAccess().getPitchEDoubleParserRuleCall_11_0()); 
            pushFollow(FOLLOW_2);
            ruleEDouble();

            state._fsp--;

             after(grammarAccess.getPoseAccess().getPitchEDoubleParserRuleCall_11_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pose__PitchAssignment_11"


    // $ANTLR start "rule__Pose__YawAssignment_13"
    // InternalComposition.g:5210:1: rule__Pose__YawAssignment_13 : ( ruleEDouble ) ;
    public final void rule__Pose__YawAssignment_13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComposition.g:5214:1: ( ( ruleEDouble ) )
            // InternalComposition.g:5215:2: ( ruleEDouble )
            {
            // InternalComposition.g:5215:2: ( ruleEDouble )
            // InternalComposition.g:5216:3: ruleEDouble
            {
             before(grammarAccess.getPoseAccess().getYawEDoubleParserRuleCall_13_0()); 
            pushFollow(FOLLOW_2);
            ruleEDouble();

            state._fsp--;

             after(grammarAccess.getPoseAccess().getYawEDoubleParserRuleCall_13_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pose__YawAssignment_13"


    // $ANTLR start "rule__Limit__EffortAssignment_3"
    // InternalComposition.g:5225:1: rule__Limit__EffortAssignment_3 : ( ruleEDouble ) ;
    public final void rule__Limit__EffortAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComposition.g:5229:1: ( ( ruleEDouble ) )
            // InternalComposition.g:5230:2: ( ruleEDouble )
            {
            // InternalComposition.g:5230:2: ( ruleEDouble )
            // InternalComposition.g:5231:3: ruleEDouble
            {
             before(grammarAccess.getLimitAccess().getEffortEDoubleParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleEDouble();

            state._fsp--;

             after(grammarAccess.getLimitAccess().getEffortEDoubleParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Limit__EffortAssignment_3"


    // $ANTLR start "rule__Limit__VelocityAssignment_5"
    // InternalComposition.g:5240:1: rule__Limit__VelocityAssignment_5 : ( ruleEDouble ) ;
    public final void rule__Limit__VelocityAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComposition.g:5244:1: ( ( ruleEDouble ) )
            // InternalComposition.g:5245:2: ( ruleEDouble )
            {
            // InternalComposition.g:5245:2: ( ruleEDouble )
            // InternalComposition.g:5246:3: ruleEDouble
            {
             before(grammarAccess.getLimitAccess().getVelocityEDoubleParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleEDouble();

            state._fsp--;

             after(grammarAccess.getLimitAccess().getVelocityEDoubleParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Limit__VelocityAssignment_5"


    // $ANTLR start "rule__Limit__LowerAssignment_6_1"
    // InternalComposition.g:5255:1: rule__Limit__LowerAssignment_6_1 : ( ruleEDouble ) ;
    public final void rule__Limit__LowerAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComposition.g:5259:1: ( ( ruleEDouble ) )
            // InternalComposition.g:5260:2: ( ruleEDouble )
            {
            // InternalComposition.g:5260:2: ( ruleEDouble )
            // InternalComposition.g:5261:3: ruleEDouble
            {
             before(grammarAccess.getLimitAccess().getLowerEDoubleParserRuleCall_6_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEDouble();

            state._fsp--;

             after(grammarAccess.getLimitAccess().getLowerEDoubleParserRuleCall_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Limit__LowerAssignment_6_1"


    // $ANTLR start "rule__Limit__UpperAssignment_7_1"
    // InternalComposition.g:5270:1: rule__Limit__UpperAssignment_7_1 : ( ruleEDouble ) ;
    public final void rule__Limit__UpperAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComposition.g:5274:1: ( ( ruleEDouble ) )
            // InternalComposition.g:5275:2: ( ruleEDouble )
            {
            // InternalComposition.g:5275:2: ( ruleEDouble )
            // InternalComposition.g:5276:3: ruleEDouble
            {
             before(grammarAccess.getLimitAccess().getUpperEDoubleParserRuleCall_7_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEDouble();

            state._fsp--;

             after(grammarAccess.getLimitAccess().getUpperEDoubleParserRuleCall_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Limit__UpperAssignment_7_1"


    // $ANTLR start "rule__Axis__XAssignment_3"
    // InternalComposition.g:5285:1: rule__Axis__XAssignment_3 : ( ruleEDouble ) ;
    public final void rule__Axis__XAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComposition.g:5289:1: ( ( ruleEDouble ) )
            // InternalComposition.g:5290:2: ( ruleEDouble )
            {
            // InternalComposition.g:5290:2: ( ruleEDouble )
            // InternalComposition.g:5291:3: ruleEDouble
            {
             before(grammarAccess.getAxisAccess().getXEDoubleParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleEDouble();

            state._fsp--;

             after(grammarAccess.getAxisAccess().getXEDoubleParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Axis__XAssignment_3"


    // $ANTLR start "rule__Axis__YAssignment_5"
    // InternalComposition.g:5300:1: rule__Axis__YAssignment_5 : ( ruleEDouble ) ;
    public final void rule__Axis__YAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComposition.g:5304:1: ( ( ruleEDouble ) )
            // InternalComposition.g:5305:2: ( ruleEDouble )
            {
            // InternalComposition.g:5305:2: ( ruleEDouble )
            // InternalComposition.g:5306:3: ruleEDouble
            {
             before(grammarAccess.getAxisAccess().getYEDoubleParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleEDouble();

            state._fsp--;

             after(grammarAccess.getAxisAccess().getYEDoubleParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Axis__YAssignment_5"


    // $ANTLR start "rule__Axis__ZAssignment_7"
    // InternalComposition.g:5315:1: rule__Axis__ZAssignment_7 : ( ruleEDouble ) ;
    public final void rule__Axis__ZAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComposition.g:5319:1: ( ( ruleEDouble ) )
            // InternalComposition.g:5320:2: ( ruleEDouble )
            {
            // InternalComposition.g:5320:2: ( ruleEDouble )
            // InternalComposition.g:5321:3: ruleEDouble
            {
             before(grammarAccess.getAxisAccess().getZEDoubleParserRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            ruleEDouble();

            state._fsp--;

             after(grammarAccess.getAxisAccess().getZEDoubleParserRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Axis__ZAssignment_7"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000007600000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000A00000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000010800000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x000000E400000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000100200000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000A00000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000001100200000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000038000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000300000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000C00000200000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x1800000000200000L});

}