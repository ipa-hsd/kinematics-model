package de.fraunhofer.ipa.geometry.ide.contentassist.antlr.internal;

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
import de.fraunhofer.ipa.geometry.services.GeometryGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalGeometryParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_DOUBLE", "RULE_DIGIT", "RULE_BOOLEAN", "RULE_DECINT", "RULE_JOINTTYPE", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'String'", "'LinkGeometry'", "'{'", "'ref'", "'}'", "'visual'", "'collision'", "'Visual'", "'origin'", "'geometry'", "'Collision'", "'Pose'", "'rpy'", "'xyz'", "'value'", "'Geometry'", "'box'", "'cylinder'", "'mesh'", "'sphere'", "'Box'", "'x'", "'y'", "'z'", "'Cylinder'", "'length'", "'radius'", "'Mesh'", "'filename'", "'scale'", "'Sphere'"
    };
    public static final int RULE_BOOLEAN=7;
    public static final int T__19=19;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int RULE_ID=10;
    public static final int RULE_DIGIT=6;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=11;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=12;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=13;
    public static final int T__37=37;
    public static final int RULE_DOUBLE=5;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int RULE_JOINTTYPE=9;
    public static final int T__36=36;
    public static final int RULE_DECINT=8;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=14;
    public static final int RULE_ANY_OTHER=15;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalGeometryParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalGeometryParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalGeometryParser.tokenNames; }
    public String getGrammarFileName() { return "InternalGeometry.g"; }


    	private GeometryGrammarAccess grammarAccess;

    	public void setGrammarAccess(GeometryGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleLinkGeometry"
    // InternalGeometry.g:53:1: entryRuleLinkGeometry : ruleLinkGeometry EOF ;
    public final void entryRuleLinkGeometry() throws RecognitionException {
        try {
            // InternalGeometry.g:54:1: ( ruleLinkGeometry EOF )
            // InternalGeometry.g:55:1: ruleLinkGeometry EOF
            {
             before(grammarAccess.getLinkGeometryRule()); 
            pushFollow(FOLLOW_1);
            ruleLinkGeometry();

            state._fsp--;

             after(grammarAccess.getLinkGeometryRule()); 
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
    // $ANTLR end "entryRuleLinkGeometry"


    // $ANTLR start "ruleLinkGeometry"
    // InternalGeometry.g:62:1: ruleLinkGeometry : ( ( rule__LinkGeometry__Group__0 ) ) ;
    public final void ruleLinkGeometry() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGeometry.g:66:2: ( ( ( rule__LinkGeometry__Group__0 ) ) )
            // InternalGeometry.g:67:2: ( ( rule__LinkGeometry__Group__0 ) )
            {
            // InternalGeometry.g:67:2: ( ( rule__LinkGeometry__Group__0 ) )
            // InternalGeometry.g:68:3: ( rule__LinkGeometry__Group__0 )
            {
             before(grammarAccess.getLinkGeometryAccess().getGroup()); 
            // InternalGeometry.g:69:3: ( rule__LinkGeometry__Group__0 )
            // InternalGeometry.g:69:4: rule__LinkGeometry__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__LinkGeometry__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLinkGeometryAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLinkGeometry"


    // $ANTLR start "entryRuleVisual"
    // InternalGeometry.g:78:1: entryRuleVisual : ruleVisual EOF ;
    public final void entryRuleVisual() throws RecognitionException {
        try {
            // InternalGeometry.g:79:1: ( ruleVisual EOF )
            // InternalGeometry.g:80:1: ruleVisual EOF
            {
             before(grammarAccess.getVisualRule()); 
            pushFollow(FOLLOW_1);
            ruleVisual();

            state._fsp--;

             after(grammarAccess.getVisualRule()); 
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
    // $ANTLR end "entryRuleVisual"


    // $ANTLR start "ruleVisual"
    // InternalGeometry.g:87:1: ruleVisual : ( ( rule__Visual__Group__0 ) ) ;
    public final void ruleVisual() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGeometry.g:91:2: ( ( ( rule__Visual__Group__0 ) ) )
            // InternalGeometry.g:92:2: ( ( rule__Visual__Group__0 ) )
            {
            // InternalGeometry.g:92:2: ( ( rule__Visual__Group__0 ) )
            // InternalGeometry.g:93:3: ( rule__Visual__Group__0 )
            {
             before(grammarAccess.getVisualAccess().getGroup()); 
            // InternalGeometry.g:94:3: ( rule__Visual__Group__0 )
            // InternalGeometry.g:94:4: rule__Visual__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Visual__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getVisualAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVisual"


    // $ANTLR start "entryRuleCollision"
    // InternalGeometry.g:103:1: entryRuleCollision : ruleCollision EOF ;
    public final void entryRuleCollision() throws RecognitionException {
        try {
            // InternalGeometry.g:104:1: ( ruleCollision EOF )
            // InternalGeometry.g:105:1: ruleCollision EOF
            {
             before(grammarAccess.getCollisionRule()); 
            pushFollow(FOLLOW_1);
            ruleCollision();

            state._fsp--;

             after(grammarAccess.getCollisionRule()); 
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
    // $ANTLR end "entryRuleCollision"


    // $ANTLR start "ruleCollision"
    // InternalGeometry.g:112:1: ruleCollision : ( ( rule__Collision__Group__0 ) ) ;
    public final void ruleCollision() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGeometry.g:116:2: ( ( ( rule__Collision__Group__0 ) ) )
            // InternalGeometry.g:117:2: ( ( rule__Collision__Group__0 ) )
            {
            // InternalGeometry.g:117:2: ( ( rule__Collision__Group__0 ) )
            // InternalGeometry.g:118:3: ( rule__Collision__Group__0 )
            {
             before(grammarAccess.getCollisionAccess().getGroup()); 
            // InternalGeometry.g:119:3: ( rule__Collision__Group__0 )
            // InternalGeometry.g:119:4: rule__Collision__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Collision__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCollisionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCollision"


    // $ANTLR start "entryRulePose"
    // InternalGeometry.g:128:1: entryRulePose : rulePose EOF ;
    public final void entryRulePose() throws RecognitionException {
        try {
            // InternalGeometry.g:129:1: ( rulePose EOF )
            // InternalGeometry.g:130:1: rulePose EOF
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
    // InternalGeometry.g:137:1: rulePose : ( ( rule__Pose__Group__0 ) ) ;
    public final void rulePose() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGeometry.g:141:2: ( ( ( rule__Pose__Group__0 ) ) )
            // InternalGeometry.g:142:2: ( ( rule__Pose__Group__0 ) )
            {
            // InternalGeometry.g:142:2: ( ( rule__Pose__Group__0 ) )
            // InternalGeometry.g:143:3: ( rule__Pose__Group__0 )
            {
             before(grammarAccess.getPoseAccess().getGroup()); 
            // InternalGeometry.g:144:3: ( rule__Pose__Group__0 )
            // InternalGeometry.g:144:4: rule__Pose__Group__0
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


    // $ANTLR start "entryRuleGeometry"
    // InternalGeometry.g:153:1: entryRuleGeometry : ruleGeometry EOF ;
    public final void entryRuleGeometry() throws RecognitionException {
        try {
            // InternalGeometry.g:154:1: ( ruleGeometry EOF )
            // InternalGeometry.g:155:1: ruleGeometry EOF
            {
             before(grammarAccess.getGeometryRule()); 
            pushFollow(FOLLOW_1);
            ruleGeometry();

            state._fsp--;

             after(grammarAccess.getGeometryRule()); 
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
    // $ANTLR end "entryRuleGeometry"


    // $ANTLR start "ruleGeometry"
    // InternalGeometry.g:162:1: ruleGeometry : ( ( rule__Geometry__Group__0 ) ) ;
    public final void ruleGeometry() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGeometry.g:166:2: ( ( ( rule__Geometry__Group__0 ) ) )
            // InternalGeometry.g:167:2: ( ( rule__Geometry__Group__0 ) )
            {
            // InternalGeometry.g:167:2: ( ( rule__Geometry__Group__0 ) )
            // InternalGeometry.g:168:3: ( rule__Geometry__Group__0 )
            {
             before(grammarAccess.getGeometryAccess().getGroup()); 
            // InternalGeometry.g:169:3: ( rule__Geometry__Group__0 )
            // InternalGeometry.g:169:4: rule__Geometry__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Geometry__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGeometryAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGeometry"


    // $ANTLR start "entryRuleString0"
    // InternalGeometry.g:178:1: entryRuleString0 : ruleString0 EOF ;
    public final void entryRuleString0() throws RecognitionException {
        try {
            // InternalGeometry.g:179:1: ( ruleString0 EOF )
            // InternalGeometry.g:180:1: ruleString0 EOF
            {
             before(grammarAccess.getString0Rule()); 
            pushFollow(FOLLOW_1);
            ruleString0();

            state._fsp--;

             after(grammarAccess.getString0Rule()); 
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
    // $ANTLR end "entryRuleString0"


    // $ANTLR start "ruleString0"
    // InternalGeometry.g:187:1: ruleString0 : ( 'String' ) ;
    public final void ruleString0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGeometry.g:191:2: ( ( 'String' ) )
            // InternalGeometry.g:192:2: ( 'String' )
            {
            // InternalGeometry.g:192:2: ( 'String' )
            // InternalGeometry.g:193:3: 'String'
            {
             before(grammarAccess.getString0Access().getStringKeyword()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getString0Access().getStringKeyword()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleString0"


    // $ANTLR start "entryRuleBox"
    // InternalGeometry.g:203:1: entryRuleBox : ruleBox EOF ;
    public final void entryRuleBox() throws RecognitionException {
        try {
            // InternalGeometry.g:204:1: ( ruleBox EOF )
            // InternalGeometry.g:205:1: ruleBox EOF
            {
             before(grammarAccess.getBoxRule()); 
            pushFollow(FOLLOW_1);
            ruleBox();

            state._fsp--;

             after(grammarAccess.getBoxRule()); 
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
    // $ANTLR end "entryRuleBox"


    // $ANTLR start "ruleBox"
    // InternalGeometry.g:212:1: ruleBox : ( ( rule__Box__Group__0 ) ) ;
    public final void ruleBox() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGeometry.g:216:2: ( ( ( rule__Box__Group__0 ) ) )
            // InternalGeometry.g:217:2: ( ( rule__Box__Group__0 ) )
            {
            // InternalGeometry.g:217:2: ( ( rule__Box__Group__0 ) )
            // InternalGeometry.g:218:3: ( rule__Box__Group__0 )
            {
             before(grammarAccess.getBoxAccess().getGroup()); 
            // InternalGeometry.g:219:3: ( rule__Box__Group__0 )
            // InternalGeometry.g:219:4: rule__Box__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Box__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBoxAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBox"


    // $ANTLR start "entryRuleCylinder"
    // InternalGeometry.g:228:1: entryRuleCylinder : ruleCylinder EOF ;
    public final void entryRuleCylinder() throws RecognitionException {
        try {
            // InternalGeometry.g:229:1: ( ruleCylinder EOF )
            // InternalGeometry.g:230:1: ruleCylinder EOF
            {
             before(grammarAccess.getCylinderRule()); 
            pushFollow(FOLLOW_1);
            ruleCylinder();

            state._fsp--;

             after(grammarAccess.getCylinderRule()); 
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
    // $ANTLR end "entryRuleCylinder"


    // $ANTLR start "ruleCylinder"
    // InternalGeometry.g:237:1: ruleCylinder : ( ( rule__Cylinder__Group__0 ) ) ;
    public final void ruleCylinder() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGeometry.g:241:2: ( ( ( rule__Cylinder__Group__0 ) ) )
            // InternalGeometry.g:242:2: ( ( rule__Cylinder__Group__0 ) )
            {
            // InternalGeometry.g:242:2: ( ( rule__Cylinder__Group__0 ) )
            // InternalGeometry.g:243:3: ( rule__Cylinder__Group__0 )
            {
             before(grammarAccess.getCylinderAccess().getGroup()); 
            // InternalGeometry.g:244:3: ( rule__Cylinder__Group__0 )
            // InternalGeometry.g:244:4: rule__Cylinder__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Cylinder__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCylinderAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCylinder"


    // $ANTLR start "entryRuleMesh"
    // InternalGeometry.g:253:1: entryRuleMesh : ruleMesh EOF ;
    public final void entryRuleMesh() throws RecognitionException {
        try {
            // InternalGeometry.g:254:1: ( ruleMesh EOF )
            // InternalGeometry.g:255:1: ruleMesh EOF
            {
             before(grammarAccess.getMeshRule()); 
            pushFollow(FOLLOW_1);
            ruleMesh();

            state._fsp--;

             after(grammarAccess.getMeshRule()); 
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
    // $ANTLR end "entryRuleMesh"


    // $ANTLR start "ruleMesh"
    // InternalGeometry.g:262:1: ruleMesh : ( ( rule__Mesh__Group__0 ) ) ;
    public final void ruleMesh() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGeometry.g:266:2: ( ( ( rule__Mesh__Group__0 ) ) )
            // InternalGeometry.g:267:2: ( ( rule__Mesh__Group__0 ) )
            {
            // InternalGeometry.g:267:2: ( ( rule__Mesh__Group__0 ) )
            // InternalGeometry.g:268:3: ( rule__Mesh__Group__0 )
            {
             before(grammarAccess.getMeshAccess().getGroup()); 
            // InternalGeometry.g:269:3: ( rule__Mesh__Group__0 )
            // InternalGeometry.g:269:4: rule__Mesh__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Mesh__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMeshAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMesh"


    // $ANTLR start "entryRuleSphere"
    // InternalGeometry.g:278:1: entryRuleSphere : ruleSphere EOF ;
    public final void entryRuleSphere() throws RecognitionException {
        try {
            // InternalGeometry.g:279:1: ( ruleSphere EOF )
            // InternalGeometry.g:280:1: ruleSphere EOF
            {
             before(grammarAccess.getSphereRule()); 
            pushFollow(FOLLOW_1);
            ruleSphere();

            state._fsp--;

             after(grammarAccess.getSphereRule()); 
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
    // $ANTLR end "entryRuleSphere"


    // $ANTLR start "ruleSphere"
    // InternalGeometry.g:287:1: ruleSphere : ( ( rule__Sphere__Group__0 ) ) ;
    public final void ruleSphere() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGeometry.g:291:2: ( ( ( rule__Sphere__Group__0 ) ) )
            // InternalGeometry.g:292:2: ( ( rule__Sphere__Group__0 ) )
            {
            // InternalGeometry.g:292:2: ( ( rule__Sphere__Group__0 ) )
            // InternalGeometry.g:293:3: ( rule__Sphere__Group__0 )
            {
             before(grammarAccess.getSphereAccess().getGroup()); 
            // InternalGeometry.g:294:3: ( rule__Sphere__Group__0 )
            // InternalGeometry.g:294:4: rule__Sphere__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Sphere__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSphereAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSphere"


    // $ANTLR start "entryRuleEString"
    // InternalGeometry.g:303:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalGeometry.g:304:1: ( ruleEString EOF )
            // InternalGeometry.g:305:1: ruleEString EOF
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
    // InternalGeometry.g:312:1: ruleEString : ( RULE_STRING ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGeometry.g:316:2: ( ( RULE_STRING ) )
            // InternalGeometry.g:317:2: ( RULE_STRING )
            {
            // InternalGeometry.g:317:2: ( RULE_STRING )
            // InternalGeometry.g:318:3: RULE_STRING
            {
             before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall()); 

            }


            }

        }
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


    // $ANTLR start "entryRuleDouble0"
    // InternalGeometry.g:328:1: entryRuleDouble0 : ruleDouble0 EOF ;
    public final void entryRuleDouble0() throws RecognitionException {
        try {
            // InternalGeometry.g:329:1: ( ruleDouble0 EOF )
            // InternalGeometry.g:330:1: ruleDouble0 EOF
            {
             before(grammarAccess.getDouble0Rule()); 
            pushFollow(FOLLOW_1);
            ruleDouble0();

            state._fsp--;

             after(grammarAccess.getDouble0Rule()); 
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
    // $ANTLR end "entryRuleDouble0"


    // $ANTLR start "ruleDouble0"
    // InternalGeometry.g:337:1: ruleDouble0 : ( RULE_DOUBLE ) ;
    public final void ruleDouble0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGeometry.g:341:2: ( ( RULE_DOUBLE ) )
            // InternalGeometry.g:342:2: ( RULE_DOUBLE )
            {
            // InternalGeometry.g:342:2: ( RULE_DOUBLE )
            // InternalGeometry.g:343:3: RULE_DOUBLE
            {
             before(grammarAccess.getDouble0Access().getDOUBLETerminalRuleCall()); 
            match(input,RULE_DOUBLE,FOLLOW_2); 
             after(grammarAccess.getDouble0Access().getDOUBLETerminalRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDouble0"


    // $ANTLR start "rule__LinkGeometry__Group__0"
    // InternalGeometry.g:352:1: rule__LinkGeometry__Group__0 : rule__LinkGeometry__Group__0__Impl rule__LinkGeometry__Group__1 ;
    public final void rule__LinkGeometry__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGeometry.g:356:1: ( rule__LinkGeometry__Group__0__Impl rule__LinkGeometry__Group__1 )
            // InternalGeometry.g:357:2: rule__LinkGeometry__Group__0__Impl rule__LinkGeometry__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__LinkGeometry__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LinkGeometry__Group__1();

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
    // $ANTLR end "rule__LinkGeometry__Group__0"


    // $ANTLR start "rule__LinkGeometry__Group__0__Impl"
    // InternalGeometry.g:364:1: rule__LinkGeometry__Group__0__Impl : ( 'LinkGeometry' ) ;
    public final void rule__LinkGeometry__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGeometry.g:368:1: ( ( 'LinkGeometry' ) )
            // InternalGeometry.g:369:1: ( 'LinkGeometry' )
            {
            // InternalGeometry.g:369:1: ( 'LinkGeometry' )
            // InternalGeometry.g:370:2: 'LinkGeometry'
            {
             before(grammarAccess.getLinkGeometryAccess().getLinkGeometryKeyword_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getLinkGeometryAccess().getLinkGeometryKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LinkGeometry__Group__0__Impl"


    // $ANTLR start "rule__LinkGeometry__Group__1"
    // InternalGeometry.g:379:1: rule__LinkGeometry__Group__1 : rule__LinkGeometry__Group__1__Impl rule__LinkGeometry__Group__2 ;
    public final void rule__LinkGeometry__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGeometry.g:383:1: ( rule__LinkGeometry__Group__1__Impl rule__LinkGeometry__Group__2 )
            // InternalGeometry.g:384:2: rule__LinkGeometry__Group__1__Impl rule__LinkGeometry__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__LinkGeometry__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LinkGeometry__Group__2();

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
    // $ANTLR end "rule__LinkGeometry__Group__1"


    // $ANTLR start "rule__LinkGeometry__Group__1__Impl"
    // InternalGeometry.g:391:1: rule__LinkGeometry__Group__1__Impl : ( '{' ) ;
    public final void rule__LinkGeometry__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGeometry.g:395:1: ( ( '{' ) )
            // InternalGeometry.g:396:1: ( '{' )
            {
            // InternalGeometry.g:396:1: ( '{' )
            // InternalGeometry.g:397:2: '{'
            {
             before(grammarAccess.getLinkGeometryAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getLinkGeometryAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LinkGeometry__Group__1__Impl"


    // $ANTLR start "rule__LinkGeometry__Group__2"
    // InternalGeometry.g:406:1: rule__LinkGeometry__Group__2 : rule__LinkGeometry__Group__2__Impl rule__LinkGeometry__Group__3 ;
    public final void rule__LinkGeometry__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGeometry.g:410:1: ( rule__LinkGeometry__Group__2__Impl rule__LinkGeometry__Group__3 )
            // InternalGeometry.g:411:2: rule__LinkGeometry__Group__2__Impl rule__LinkGeometry__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__LinkGeometry__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LinkGeometry__Group__3();

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
    // $ANTLR end "rule__LinkGeometry__Group__2"


    // $ANTLR start "rule__LinkGeometry__Group__2__Impl"
    // InternalGeometry.g:418:1: rule__LinkGeometry__Group__2__Impl : ( 'ref' ) ;
    public final void rule__LinkGeometry__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGeometry.g:422:1: ( ( 'ref' ) )
            // InternalGeometry.g:423:1: ( 'ref' )
            {
            // InternalGeometry.g:423:1: ( 'ref' )
            // InternalGeometry.g:424:2: 'ref'
            {
             before(grammarAccess.getLinkGeometryAccess().getRefKeyword_2()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getLinkGeometryAccess().getRefKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LinkGeometry__Group__2__Impl"


    // $ANTLR start "rule__LinkGeometry__Group__3"
    // InternalGeometry.g:433:1: rule__LinkGeometry__Group__3 : rule__LinkGeometry__Group__3__Impl rule__LinkGeometry__Group__4 ;
    public final void rule__LinkGeometry__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGeometry.g:437:1: ( rule__LinkGeometry__Group__3__Impl rule__LinkGeometry__Group__4 )
            // InternalGeometry.g:438:2: rule__LinkGeometry__Group__3__Impl rule__LinkGeometry__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__LinkGeometry__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LinkGeometry__Group__4();

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
    // $ANTLR end "rule__LinkGeometry__Group__3"


    // $ANTLR start "rule__LinkGeometry__Group__3__Impl"
    // InternalGeometry.g:445:1: rule__LinkGeometry__Group__3__Impl : ( ( rule__LinkGeometry__RefAssignment_3 ) ) ;
    public final void rule__LinkGeometry__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGeometry.g:449:1: ( ( ( rule__LinkGeometry__RefAssignment_3 ) ) )
            // InternalGeometry.g:450:1: ( ( rule__LinkGeometry__RefAssignment_3 ) )
            {
            // InternalGeometry.g:450:1: ( ( rule__LinkGeometry__RefAssignment_3 ) )
            // InternalGeometry.g:451:2: ( rule__LinkGeometry__RefAssignment_3 )
            {
             before(grammarAccess.getLinkGeometryAccess().getRefAssignment_3()); 
            // InternalGeometry.g:452:2: ( rule__LinkGeometry__RefAssignment_3 )
            // InternalGeometry.g:452:3: rule__LinkGeometry__RefAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__LinkGeometry__RefAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getLinkGeometryAccess().getRefAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LinkGeometry__Group__3__Impl"


    // $ANTLR start "rule__LinkGeometry__Group__4"
    // InternalGeometry.g:460:1: rule__LinkGeometry__Group__4 : rule__LinkGeometry__Group__4__Impl rule__LinkGeometry__Group__5 ;
    public final void rule__LinkGeometry__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGeometry.g:464:1: ( rule__LinkGeometry__Group__4__Impl rule__LinkGeometry__Group__5 )
            // InternalGeometry.g:465:2: rule__LinkGeometry__Group__4__Impl rule__LinkGeometry__Group__5
            {
            pushFollow(FOLLOW_6);
            rule__LinkGeometry__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LinkGeometry__Group__5();

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
    // $ANTLR end "rule__LinkGeometry__Group__4"


    // $ANTLR start "rule__LinkGeometry__Group__4__Impl"
    // InternalGeometry.g:472:1: rule__LinkGeometry__Group__4__Impl : ( ( rule__LinkGeometry__Group_4__0 )? ) ;
    public final void rule__LinkGeometry__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGeometry.g:476:1: ( ( ( rule__LinkGeometry__Group_4__0 )? ) )
            // InternalGeometry.g:477:1: ( ( rule__LinkGeometry__Group_4__0 )? )
            {
            // InternalGeometry.g:477:1: ( ( rule__LinkGeometry__Group_4__0 )? )
            // InternalGeometry.g:478:2: ( rule__LinkGeometry__Group_4__0 )?
            {
             before(grammarAccess.getLinkGeometryAccess().getGroup_4()); 
            // InternalGeometry.g:479:2: ( rule__LinkGeometry__Group_4__0 )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==21) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalGeometry.g:479:3: rule__LinkGeometry__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__LinkGeometry__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLinkGeometryAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LinkGeometry__Group__4__Impl"


    // $ANTLR start "rule__LinkGeometry__Group__5"
    // InternalGeometry.g:487:1: rule__LinkGeometry__Group__5 : rule__LinkGeometry__Group__5__Impl rule__LinkGeometry__Group__6 ;
    public final void rule__LinkGeometry__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGeometry.g:491:1: ( rule__LinkGeometry__Group__5__Impl rule__LinkGeometry__Group__6 )
            // InternalGeometry.g:492:2: rule__LinkGeometry__Group__5__Impl rule__LinkGeometry__Group__6
            {
            pushFollow(FOLLOW_6);
            rule__LinkGeometry__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LinkGeometry__Group__6();

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
    // $ANTLR end "rule__LinkGeometry__Group__5"


    // $ANTLR start "rule__LinkGeometry__Group__5__Impl"
    // InternalGeometry.g:499:1: rule__LinkGeometry__Group__5__Impl : ( ( rule__LinkGeometry__Group_5__0 )? ) ;
    public final void rule__LinkGeometry__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGeometry.g:503:1: ( ( ( rule__LinkGeometry__Group_5__0 )? ) )
            // InternalGeometry.g:504:1: ( ( rule__LinkGeometry__Group_5__0 )? )
            {
            // InternalGeometry.g:504:1: ( ( rule__LinkGeometry__Group_5__0 )? )
            // InternalGeometry.g:505:2: ( rule__LinkGeometry__Group_5__0 )?
            {
             before(grammarAccess.getLinkGeometryAccess().getGroup_5()); 
            // InternalGeometry.g:506:2: ( rule__LinkGeometry__Group_5__0 )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==22) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalGeometry.g:506:3: rule__LinkGeometry__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__LinkGeometry__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLinkGeometryAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LinkGeometry__Group__5__Impl"


    // $ANTLR start "rule__LinkGeometry__Group__6"
    // InternalGeometry.g:514:1: rule__LinkGeometry__Group__6 : rule__LinkGeometry__Group__6__Impl ;
    public final void rule__LinkGeometry__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGeometry.g:518:1: ( rule__LinkGeometry__Group__6__Impl )
            // InternalGeometry.g:519:2: rule__LinkGeometry__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LinkGeometry__Group__6__Impl();

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
    // $ANTLR end "rule__LinkGeometry__Group__6"


    // $ANTLR start "rule__LinkGeometry__Group__6__Impl"
    // InternalGeometry.g:525:1: rule__LinkGeometry__Group__6__Impl : ( '}' ) ;
    public final void rule__LinkGeometry__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGeometry.g:529:1: ( ( '}' ) )
            // InternalGeometry.g:530:1: ( '}' )
            {
            // InternalGeometry.g:530:1: ( '}' )
            // InternalGeometry.g:531:2: '}'
            {
             before(grammarAccess.getLinkGeometryAccess().getRightCurlyBracketKeyword_6()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getLinkGeometryAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LinkGeometry__Group__6__Impl"


    // $ANTLR start "rule__LinkGeometry__Group_4__0"
    // InternalGeometry.g:541:1: rule__LinkGeometry__Group_4__0 : rule__LinkGeometry__Group_4__0__Impl rule__LinkGeometry__Group_4__1 ;
    public final void rule__LinkGeometry__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGeometry.g:545:1: ( rule__LinkGeometry__Group_4__0__Impl rule__LinkGeometry__Group_4__1 )
            // InternalGeometry.g:546:2: rule__LinkGeometry__Group_4__0__Impl rule__LinkGeometry__Group_4__1
            {
            pushFollow(FOLLOW_7);
            rule__LinkGeometry__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LinkGeometry__Group_4__1();

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
    // $ANTLR end "rule__LinkGeometry__Group_4__0"


    // $ANTLR start "rule__LinkGeometry__Group_4__0__Impl"
    // InternalGeometry.g:553:1: rule__LinkGeometry__Group_4__0__Impl : ( 'visual' ) ;
    public final void rule__LinkGeometry__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGeometry.g:557:1: ( ( 'visual' ) )
            // InternalGeometry.g:558:1: ( 'visual' )
            {
            // InternalGeometry.g:558:1: ( 'visual' )
            // InternalGeometry.g:559:2: 'visual'
            {
             before(grammarAccess.getLinkGeometryAccess().getVisualKeyword_4_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getLinkGeometryAccess().getVisualKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LinkGeometry__Group_4__0__Impl"


    // $ANTLR start "rule__LinkGeometry__Group_4__1"
    // InternalGeometry.g:568:1: rule__LinkGeometry__Group_4__1 : rule__LinkGeometry__Group_4__1__Impl ;
    public final void rule__LinkGeometry__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGeometry.g:572:1: ( rule__LinkGeometry__Group_4__1__Impl )
            // InternalGeometry.g:573:2: rule__LinkGeometry__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LinkGeometry__Group_4__1__Impl();

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
    // $ANTLR end "rule__LinkGeometry__Group_4__1"


    // $ANTLR start "rule__LinkGeometry__Group_4__1__Impl"
    // InternalGeometry.g:579:1: rule__LinkGeometry__Group_4__1__Impl : ( ( rule__LinkGeometry__VisualAssignment_4_1 ) ) ;
    public final void rule__LinkGeometry__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGeometry.g:583:1: ( ( ( rule__LinkGeometry__VisualAssignment_4_1 ) ) )
            // InternalGeometry.g:584:1: ( ( rule__LinkGeometry__VisualAssignment_4_1 ) )
            {
            // InternalGeometry.g:584:1: ( ( rule__LinkGeometry__VisualAssignment_4_1 ) )
            // InternalGeometry.g:585:2: ( rule__LinkGeometry__VisualAssignment_4_1 )
            {
             before(grammarAccess.getLinkGeometryAccess().getVisualAssignment_4_1()); 
            // InternalGeometry.g:586:2: ( rule__LinkGeometry__VisualAssignment_4_1 )
            // InternalGeometry.g:586:3: rule__LinkGeometry__VisualAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__LinkGeometry__VisualAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getLinkGeometryAccess().getVisualAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LinkGeometry__Group_4__1__Impl"


    // $ANTLR start "rule__LinkGeometry__Group_5__0"
    // InternalGeometry.g:595:1: rule__LinkGeometry__Group_5__0 : rule__LinkGeometry__Group_5__0__Impl rule__LinkGeometry__Group_5__1 ;
    public final void rule__LinkGeometry__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGeometry.g:599:1: ( rule__LinkGeometry__Group_5__0__Impl rule__LinkGeometry__Group_5__1 )
            // InternalGeometry.g:600:2: rule__LinkGeometry__Group_5__0__Impl rule__LinkGeometry__Group_5__1
            {
            pushFollow(FOLLOW_8);
            rule__LinkGeometry__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LinkGeometry__Group_5__1();

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
    // $ANTLR end "rule__LinkGeometry__Group_5__0"


    // $ANTLR start "rule__LinkGeometry__Group_5__0__Impl"
    // InternalGeometry.g:607:1: rule__LinkGeometry__Group_5__0__Impl : ( 'collision' ) ;
    public final void rule__LinkGeometry__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGeometry.g:611:1: ( ( 'collision' ) )
            // InternalGeometry.g:612:1: ( 'collision' )
            {
            // InternalGeometry.g:612:1: ( 'collision' )
            // InternalGeometry.g:613:2: 'collision'
            {
             before(grammarAccess.getLinkGeometryAccess().getCollisionKeyword_5_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getLinkGeometryAccess().getCollisionKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LinkGeometry__Group_5__0__Impl"


    // $ANTLR start "rule__LinkGeometry__Group_5__1"
    // InternalGeometry.g:622:1: rule__LinkGeometry__Group_5__1 : rule__LinkGeometry__Group_5__1__Impl ;
    public final void rule__LinkGeometry__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGeometry.g:626:1: ( rule__LinkGeometry__Group_5__1__Impl )
            // InternalGeometry.g:627:2: rule__LinkGeometry__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LinkGeometry__Group_5__1__Impl();

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
    // $ANTLR end "rule__LinkGeometry__Group_5__1"


    // $ANTLR start "rule__LinkGeometry__Group_5__1__Impl"
    // InternalGeometry.g:633:1: rule__LinkGeometry__Group_5__1__Impl : ( ( rule__LinkGeometry__CollisionAssignment_5_1 ) ) ;
    public final void rule__LinkGeometry__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGeometry.g:637:1: ( ( ( rule__LinkGeometry__CollisionAssignment_5_1 ) ) )
            // InternalGeometry.g:638:1: ( ( rule__LinkGeometry__CollisionAssignment_5_1 ) )
            {
            // InternalGeometry.g:638:1: ( ( rule__LinkGeometry__CollisionAssignment_5_1 ) )
            // InternalGeometry.g:639:2: ( rule__LinkGeometry__CollisionAssignment_5_1 )
            {
             before(grammarAccess.getLinkGeometryAccess().getCollisionAssignment_5_1()); 
            // InternalGeometry.g:640:2: ( rule__LinkGeometry__CollisionAssignment_5_1 )
            // InternalGeometry.g:640:3: rule__LinkGeometry__CollisionAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__LinkGeometry__CollisionAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getLinkGeometryAccess().getCollisionAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LinkGeometry__Group_5__1__Impl"


    // $ANTLR start "rule__Visual__Group__0"
    // InternalGeometry.g:649:1: rule__Visual__Group__0 : rule__Visual__Group__0__Impl rule__Visual__Group__1 ;
    public final void rule__Visual__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGeometry.g:653:1: ( rule__Visual__Group__0__Impl rule__Visual__Group__1 )
            // InternalGeometry.g:654:2: rule__Visual__Group__0__Impl rule__Visual__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__Visual__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Visual__Group__1();

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
    // $ANTLR end "rule__Visual__Group__0"


    // $ANTLR start "rule__Visual__Group__0__Impl"
    // InternalGeometry.g:661:1: rule__Visual__Group__0__Impl : ( () ) ;
    public final void rule__Visual__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGeometry.g:665:1: ( ( () ) )
            // InternalGeometry.g:666:1: ( () )
            {
            // InternalGeometry.g:666:1: ( () )
            // InternalGeometry.g:667:2: ()
            {
             before(grammarAccess.getVisualAccess().getVisualAction_0()); 
            // InternalGeometry.g:668:2: ()
            // InternalGeometry.g:668:3: 
            {
            }

             after(grammarAccess.getVisualAccess().getVisualAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Visual__Group__0__Impl"


    // $ANTLR start "rule__Visual__Group__1"
    // InternalGeometry.g:676:1: rule__Visual__Group__1 : rule__Visual__Group__1__Impl rule__Visual__Group__2 ;
    public final void rule__Visual__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGeometry.g:680:1: ( rule__Visual__Group__1__Impl rule__Visual__Group__2 )
            // InternalGeometry.g:681:2: rule__Visual__Group__1__Impl rule__Visual__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__Visual__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Visual__Group__2();

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
    // $ANTLR end "rule__Visual__Group__1"


    // $ANTLR start "rule__Visual__Group__1__Impl"
    // InternalGeometry.g:688:1: rule__Visual__Group__1__Impl : ( 'Visual' ) ;
    public final void rule__Visual__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGeometry.g:692:1: ( ( 'Visual' ) )
            // InternalGeometry.g:693:1: ( 'Visual' )
            {
            // InternalGeometry.g:693:1: ( 'Visual' )
            // InternalGeometry.g:694:2: 'Visual'
            {
             before(grammarAccess.getVisualAccess().getVisualKeyword_1()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getVisualAccess().getVisualKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Visual__Group__1__Impl"


    // $ANTLR start "rule__Visual__Group__2"
    // InternalGeometry.g:703:1: rule__Visual__Group__2 : rule__Visual__Group__2__Impl rule__Visual__Group__3 ;
    public final void rule__Visual__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGeometry.g:707:1: ( rule__Visual__Group__2__Impl rule__Visual__Group__3 )
            // InternalGeometry.g:708:2: rule__Visual__Group__2__Impl rule__Visual__Group__3
            {
            pushFollow(FOLLOW_9);
            rule__Visual__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Visual__Group__3();

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
    // $ANTLR end "rule__Visual__Group__2"


    // $ANTLR start "rule__Visual__Group__2__Impl"
    // InternalGeometry.g:715:1: rule__Visual__Group__2__Impl : ( '{' ) ;
    public final void rule__Visual__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGeometry.g:719:1: ( ( '{' ) )
            // InternalGeometry.g:720:1: ( '{' )
            {
            // InternalGeometry.g:720:1: ( '{' )
            // InternalGeometry.g:721:2: '{'
            {
             before(grammarAccess.getVisualAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getVisualAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Visual__Group__2__Impl"


    // $ANTLR start "rule__Visual__Group__3"
    // InternalGeometry.g:730:1: rule__Visual__Group__3 : rule__Visual__Group__3__Impl rule__Visual__Group__4 ;
    public final void rule__Visual__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGeometry.g:734:1: ( rule__Visual__Group__3__Impl rule__Visual__Group__4 )
            // InternalGeometry.g:735:2: rule__Visual__Group__3__Impl rule__Visual__Group__4
            {
            pushFollow(FOLLOW_9);
            rule__Visual__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Visual__Group__4();

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
    // $ANTLR end "rule__Visual__Group__3"


    // $ANTLR start "rule__Visual__Group__3__Impl"
    // InternalGeometry.g:742:1: rule__Visual__Group__3__Impl : ( ( rule__Visual__Group_3__0 )? ) ;
    public final void rule__Visual__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGeometry.g:746:1: ( ( ( rule__Visual__Group_3__0 )? ) )
            // InternalGeometry.g:747:1: ( ( rule__Visual__Group_3__0 )? )
            {
            // InternalGeometry.g:747:1: ( ( rule__Visual__Group_3__0 )? )
            // InternalGeometry.g:748:2: ( rule__Visual__Group_3__0 )?
            {
             before(grammarAccess.getVisualAccess().getGroup_3()); 
            // InternalGeometry.g:749:2: ( rule__Visual__Group_3__0 )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==24) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalGeometry.g:749:3: rule__Visual__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Visual__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getVisualAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Visual__Group__3__Impl"


    // $ANTLR start "rule__Visual__Group__4"
    // InternalGeometry.g:757:1: rule__Visual__Group__4 : rule__Visual__Group__4__Impl rule__Visual__Group__5 ;
    public final void rule__Visual__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGeometry.g:761:1: ( rule__Visual__Group__4__Impl rule__Visual__Group__5 )
            // InternalGeometry.g:762:2: rule__Visual__Group__4__Impl rule__Visual__Group__5
            {
            pushFollow(FOLLOW_9);
            rule__Visual__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Visual__Group__5();

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
    // $ANTLR end "rule__Visual__Group__4"


    // $ANTLR start "rule__Visual__Group__4__Impl"
    // InternalGeometry.g:769:1: rule__Visual__Group__4__Impl : ( ( rule__Visual__Group_4__0 )? ) ;
    public final void rule__Visual__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGeometry.g:773:1: ( ( ( rule__Visual__Group_4__0 )? ) )
            // InternalGeometry.g:774:1: ( ( rule__Visual__Group_4__0 )? )
            {
            // InternalGeometry.g:774:1: ( ( rule__Visual__Group_4__0 )? )
            // InternalGeometry.g:775:2: ( rule__Visual__Group_4__0 )?
            {
             before(grammarAccess.getVisualAccess().getGroup_4()); 
            // InternalGeometry.g:776:2: ( rule__Visual__Group_4__0 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==25) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalGeometry.g:776:3: rule__Visual__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Visual__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getVisualAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Visual__Group__4__Impl"


    // $ANTLR start "rule__Visual__Group__5"
    // InternalGeometry.g:784:1: rule__Visual__Group__5 : rule__Visual__Group__5__Impl ;
    public final void rule__Visual__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGeometry.g:788:1: ( rule__Visual__Group__5__Impl )
            // InternalGeometry.g:789:2: rule__Visual__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Visual__Group__5__Impl();

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
    // $ANTLR end "rule__Visual__Group__5"


    // $ANTLR start "rule__Visual__Group__5__Impl"
    // InternalGeometry.g:795:1: rule__Visual__Group__5__Impl : ( '}' ) ;
    public final void rule__Visual__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGeometry.g:799:1: ( ( '}' ) )
            // InternalGeometry.g:800:1: ( '}' )
            {
            // InternalGeometry.g:800:1: ( '}' )
            // InternalGeometry.g:801:2: '}'
            {
             before(grammarAccess.getVisualAccess().getRightCurlyBracketKeyword_5()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getVisualAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Visual__Group__5__Impl"


    // $ANTLR start "rule__Visual__Group_3__0"
    // InternalGeometry.g:811:1: rule__Visual__Group_3__0 : rule__Visual__Group_3__0__Impl rule__Visual__Group_3__1 ;
    public final void rule__Visual__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGeometry.g:815:1: ( rule__Visual__Group_3__0__Impl rule__Visual__Group_3__1 )
            // InternalGeometry.g:816:2: rule__Visual__Group_3__0__Impl rule__Visual__Group_3__1
            {
            pushFollow(FOLLOW_10);
            rule__Visual__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Visual__Group_3__1();

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
    // $ANTLR end "rule__Visual__Group_3__0"


    // $ANTLR start "rule__Visual__Group_3__0__Impl"
    // InternalGeometry.g:823:1: rule__Visual__Group_3__0__Impl : ( 'origin' ) ;
    public final void rule__Visual__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGeometry.g:827:1: ( ( 'origin' ) )
            // InternalGeometry.g:828:1: ( 'origin' )
            {
            // InternalGeometry.g:828:1: ( 'origin' )
            // InternalGeometry.g:829:2: 'origin'
            {
             before(grammarAccess.getVisualAccess().getOriginKeyword_3_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getVisualAccess().getOriginKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Visual__Group_3__0__Impl"


    // $ANTLR start "rule__Visual__Group_3__1"
    // InternalGeometry.g:838:1: rule__Visual__Group_3__1 : rule__Visual__Group_3__1__Impl ;
    public final void rule__Visual__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGeometry.g:842:1: ( rule__Visual__Group_3__1__Impl )
            // InternalGeometry.g:843:2: rule__Visual__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Visual__Group_3__1__Impl();

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
    // $ANTLR end "rule__Visual__Group_3__1"


    // $ANTLR start "rule__Visual__Group_3__1__Impl"
    // InternalGeometry.g:849:1: rule__Visual__Group_3__1__Impl : ( ( rule__Visual__OriginAssignment_3_1 ) ) ;
    public final void rule__Visual__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGeometry.g:853:1: ( ( ( rule__Visual__OriginAssignment_3_1 ) ) )
            // InternalGeometry.g:854:1: ( ( rule__Visual__OriginAssignment_3_1 ) )
            {
            // InternalGeometry.g:854:1: ( ( rule__Visual__OriginAssignment_3_1 ) )
            // InternalGeometry.g:855:2: ( rule__Visual__OriginAssignment_3_1 )
            {
             before(grammarAccess.getVisualAccess().getOriginAssignment_3_1()); 
            // InternalGeometry.g:856:2: ( rule__Visual__OriginAssignment_3_1 )
            // InternalGeometry.g:856:3: rule__Visual__OriginAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Visual__OriginAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getVisualAccess().getOriginAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Visual__Group_3__1__Impl"


    // $ANTLR start "rule__Visual__Group_4__0"
    // InternalGeometry.g:865:1: rule__Visual__Group_4__0 : rule__Visual__Group_4__0__Impl rule__Visual__Group_4__1 ;
    public final void rule__Visual__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGeometry.g:869:1: ( rule__Visual__Group_4__0__Impl rule__Visual__Group_4__1 )
            // InternalGeometry.g:870:2: rule__Visual__Group_4__0__Impl rule__Visual__Group_4__1
            {
            pushFollow(FOLLOW_11);
            rule__Visual__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Visual__Group_4__1();

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
    // $ANTLR end "rule__Visual__Group_4__0"


    // $ANTLR start "rule__Visual__Group_4__0__Impl"
    // InternalGeometry.g:877:1: rule__Visual__Group_4__0__Impl : ( 'geometry' ) ;
    public final void rule__Visual__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGeometry.g:881:1: ( ( 'geometry' ) )
            // InternalGeometry.g:882:1: ( 'geometry' )
            {
            // InternalGeometry.g:882:1: ( 'geometry' )
            // InternalGeometry.g:883:2: 'geometry'
            {
             before(grammarAccess.getVisualAccess().getGeometryKeyword_4_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getVisualAccess().getGeometryKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Visual__Group_4__0__Impl"


    // $ANTLR start "rule__Visual__Group_4__1"
    // InternalGeometry.g:892:1: rule__Visual__Group_4__1 : rule__Visual__Group_4__1__Impl ;
    public final void rule__Visual__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGeometry.g:896:1: ( rule__Visual__Group_4__1__Impl )
            // InternalGeometry.g:897:2: rule__Visual__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Visual__Group_4__1__Impl();

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
    // $ANTLR end "rule__Visual__Group_4__1"


    // $ANTLR start "rule__Visual__Group_4__1__Impl"
    // InternalGeometry.g:903:1: rule__Visual__Group_4__1__Impl : ( ( rule__Visual__GeometryAssignment_4_1 ) ) ;
    public final void rule__Visual__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGeometry.g:907:1: ( ( ( rule__Visual__GeometryAssignment_4_1 ) ) )
            // InternalGeometry.g:908:1: ( ( rule__Visual__GeometryAssignment_4_1 ) )
            {
            // InternalGeometry.g:908:1: ( ( rule__Visual__GeometryAssignment_4_1 ) )
            // InternalGeometry.g:909:2: ( rule__Visual__GeometryAssignment_4_1 )
            {
             before(grammarAccess.getVisualAccess().getGeometryAssignment_4_1()); 
            // InternalGeometry.g:910:2: ( rule__Visual__GeometryAssignment_4_1 )
            // InternalGeometry.g:910:3: rule__Visual__GeometryAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Visual__GeometryAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getVisualAccess().getGeometryAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Visual__Group_4__1__Impl"


    // $ANTLR start "rule__Collision__Group__0"
    // InternalGeometry.g:919:1: rule__Collision__Group__0 : rule__Collision__Group__0__Impl rule__Collision__Group__1 ;
    public final void rule__Collision__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGeometry.g:923:1: ( rule__Collision__Group__0__Impl rule__Collision__Group__1 )
            // InternalGeometry.g:924:2: rule__Collision__Group__0__Impl rule__Collision__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__Collision__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Collision__Group__1();

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
    // $ANTLR end "rule__Collision__Group__0"


    // $ANTLR start "rule__Collision__Group__0__Impl"
    // InternalGeometry.g:931:1: rule__Collision__Group__0__Impl : ( () ) ;
    public final void rule__Collision__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGeometry.g:935:1: ( ( () ) )
            // InternalGeometry.g:936:1: ( () )
            {
            // InternalGeometry.g:936:1: ( () )
            // InternalGeometry.g:937:2: ()
            {
             before(grammarAccess.getCollisionAccess().getCollisionAction_0()); 
            // InternalGeometry.g:938:2: ()
            // InternalGeometry.g:938:3: 
            {
            }

             after(grammarAccess.getCollisionAccess().getCollisionAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Collision__Group__0__Impl"


    // $ANTLR start "rule__Collision__Group__1"
    // InternalGeometry.g:946:1: rule__Collision__Group__1 : rule__Collision__Group__1__Impl rule__Collision__Group__2 ;
    public final void rule__Collision__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGeometry.g:950:1: ( rule__Collision__Group__1__Impl rule__Collision__Group__2 )
            // InternalGeometry.g:951:2: rule__Collision__Group__1__Impl rule__Collision__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__Collision__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Collision__Group__2();

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
    // $ANTLR end "rule__Collision__Group__1"


    // $ANTLR start "rule__Collision__Group__1__Impl"
    // InternalGeometry.g:958:1: rule__Collision__Group__1__Impl : ( 'Collision' ) ;
    public final void rule__Collision__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGeometry.g:962:1: ( ( 'Collision' ) )
            // InternalGeometry.g:963:1: ( 'Collision' )
            {
            // InternalGeometry.g:963:1: ( 'Collision' )
            // InternalGeometry.g:964:2: 'Collision'
            {
             before(grammarAccess.getCollisionAccess().getCollisionKeyword_1()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getCollisionAccess().getCollisionKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Collision__Group__1__Impl"


    // $ANTLR start "rule__Collision__Group__2"
    // InternalGeometry.g:973:1: rule__Collision__Group__2 : rule__Collision__Group__2__Impl rule__Collision__Group__3 ;
    public final void rule__Collision__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGeometry.g:977:1: ( rule__Collision__Group__2__Impl rule__Collision__Group__3 )
            // InternalGeometry.g:978:2: rule__Collision__Group__2__Impl rule__Collision__Group__3
            {
            pushFollow(FOLLOW_9);
            rule__Collision__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Collision__Group__3();

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
    // $ANTLR end "rule__Collision__Group__2"


    // $ANTLR start "rule__Collision__Group__2__Impl"
    // InternalGeometry.g:985:1: rule__Collision__Group__2__Impl : ( '{' ) ;
    public final void rule__Collision__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGeometry.g:989:1: ( ( '{' ) )
            // InternalGeometry.g:990:1: ( '{' )
            {
            // InternalGeometry.g:990:1: ( '{' )
            // InternalGeometry.g:991:2: '{'
            {
             before(grammarAccess.getCollisionAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getCollisionAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Collision__Group__2__Impl"


    // $ANTLR start "rule__Collision__Group__3"
    // InternalGeometry.g:1000:1: rule__Collision__Group__3 : rule__Collision__Group__3__Impl rule__Collision__Group__4 ;
    public final void rule__Collision__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGeometry.g:1004:1: ( rule__Collision__Group__3__Impl rule__Collision__Group__4 )
            // InternalGeometry.g:1005:2: rule__Collision__Group__3__Impl rule__Collision__Group__4
            {
            pushFollow(FOLLOW_9);
            rule__Collision__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Collision__Group__4();

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
    // $ANTLR end "rule__Collision__Group__3"


    // $ANTLR start "rule__Collision__Group__3__Impl"
    // InternalGeometry.g:1012:1: rule__Collision__Group__3__Impl : ( ( rule__Collision__Group_3__0 )? ) ;
    public final void rule__Collision__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGeometry.g:1016:1: ( ( ( rule__Collision__Group_3__0 )? ) )
            // InternalGeometry.g:1017:1: ( ( rule__Collision__Group_3__0 )? )
            {
            // InternalGeometry.g:1017:1: ( ( rule__Collision__Group_3__0 )? )
            // InternalGeometry.g:1018:2: ( rule__Collision__Group_3__0 )?
            {
             before(grammarAccess.getCollisionAccess().getGroup_3()); 
            // InternalGeometry.g:1019:2: ( rule__Collision__Group_3__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==24) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalGeometry.g:1019:3: rule__Collision__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Collision__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCollisionAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Collision__Group__3__Impl"


    // $ANTLR start "rule__Collision__Group__4"
    // InternalGeometry.g:1027:1: rule__Collision__Group__4 : rule__Collision__Group__4__Impl rule__Collision__Group__5 ;
    public final void rule__Collision__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGeometry.g:1031:1: ( rule__Collision__Group__4__Impl rule__Collision__Group__5 )
            // InternalGeometry.g:1032:2: rule__Collision__Group__4__Impl rule__Collision__Group__5
            {
            pushFollow(FOLLOW_9);
            rule__Collision__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Collision__Group__5();

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
    // $ANTLR end "rule__Collision__Group__4"


    // $ANTLR start "rule__Collision__Group__4__Impl"
    // InternalGeometry.g:1039:1: rule__Collision__Group__4__Impl : ( ( rule__Collision__Group_4__0 )? ) ;
    public final void rule__Collision__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGeometry.g:1043:1: ( ( ( rule__Collision__Group_4__0 )? ) )
            // InternalGeometry.g:1044:1: ( ( rule__Collision__Group_4__0 )? )
            {
            // InternalGeometry.g:1044:1: ( ( rule__Collision__Group_4__0 )? )
            // InternalGeometry.g:1045:2: ( rule__Collision__Group_4__0 )?
            {
             before(grammarAccess.getCollisionAccess().getGroup_4()); 
            // InternalGeometry.g:1046:2: ( rule__Collision__Group_4__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==25) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalGeometry.g:1046:3: rule__Collision__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Collision__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCollisionAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Collision__Group__4__Impl"


    // $ANTLR start "rule__Collision__Group__5"
    // InternalGeometry.g:1054:1: rule__Collision__Group__5 : rule__Collision__Group__5__Impl ;
    public final void rule__Collision__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGeometry.g:1058:1: ( rule__Collision__Group__5__Impl )
            // InternalGeometry.g:1059:2: rule__Collision__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Collision__Group__5__Impl();

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
    // $ANTLR end "rule__Collision__Group__5"


    // $ANTLR start "rule__Collision__Group__5__Impl"
    // InternalGeometry.g:1065:1: rule__Collision__Group__5__Impl : ( '}' ) ;
    public final void rule__Collision__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGeometry.g:1069:1: ( ( '}' ) )
            // InternalGeometry.g:1070:1: ( '}' )
            {
            // InternalGeometry.g:1070:1: ( '}' )
            // InternalGeometry.g:1071:2: '}'
            {
             before(grammarAccess.getCollisionAccess().getRightCurlyBracketKeyword_5()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getCollisionAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Collision__Group__5__Impl"


    // $ANTLR start "rule__Collision__Group_3__0"
    // InternalGeometry.g:1081:1: rule__Collision__Group_3__0 : rule__Collision__Group_3__0__Impl rule__Collision__Group_3__1 ;
    public final void rule__Collision__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGeometry.g:1085:1: ( rule__Collision__Group_3__0__Impl rule__Collision__Group_3__1 )
            // InternalGeometry.g:1086:2: rule__Collision__Group_3__0__Impl rule__Collision__Group_3__1
            {
            pushFollow(FOLLOW_10);
            rule__Collision__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Collision__Group_3__1();

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
    // $ANTLR end "rule__Collision__Group_3__0"


    // $ANTLR start "rule__Collision__Group_3__0__Impl"
    // InternalGeometry.g:1093:1: rule__Collision__Group_3__0__Impl : ( 'origin' ) ;
    public final void rule__Collision__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGeometry.g:1097:1: ( ( 'origin' ) )
            // InternalGeometry.g:1098:1: ( 'origin' )
            {
            // InternalGeometry.g:1098:1: ( 'origin' )
            // InternalGeometry.g:1099:2: 'origin'
            {
             before(grammarAccess.getCollisionAccess().getOriginKeyword_3_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getCollisionAccess().getOriginKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Collision__Group_3__0__Impl"


    // $ANTLR start "rule__Collision__Group_3__1"
    // InternalGeometry.g:1108:1: rule__Collision__Group_3__1 : rule__Collision__Group_3__1__Impl ;
    public final void rule__Collision__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGeometry.g:1112:1: ( rule__Collision__Group_3__1__Impl )
            // InternalGeometry.g:1113:2: rule__Collision__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Collision__Group_3__1__Impl();

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
    // $ANTLR end "rule__Collision__Group_3__1"


    // $ANTLR start "rule__Collision__Group_3__1__Impl"
    // InternalGeometry.g:1119:1: rule__Collision__Group_3__1__Impl : ( ( rule__Collision__OriginAssignment_3_1 ) ) ;
    public final void rule__Collision__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGeometry.g:1123:1: ( ( ( rule__Collision__OriginAssignment_3_1 ) ) )
            // InternalGeometry.g:1124:1: ( ( rule__Collision__OriginAssignment_3_1 ) )
            {
            // InternalGeometry.g:1124:1: ( ( rule__Collision__OriginAssignment_3_1 ) )
            // InternalGeometry.g:1125:2: ( rule__Collision__OriginAssignment_3_1 )
            {
             before(grammarAccess.getCollisionAccess().getOriginAssignment_3_1()); 
            // InternalGeometry.g:1126:2: ( rule__Collision__OriginAssignment_3_1 )
            // InternalGeometry.g:1126:3: rule__Collision__OriginAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Collision__OriginAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getCollisionAccess().getOriginAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Collision__Group_3__1__Impl"


    // $ANTLR start "rule__Collision__Group_4__0"
    // InternalGeometry.g:1135:1: rule__Collision__Group_4__0 : rule__Collision__Group_4__0__Impl rule__Collision__Group_4__1 ;
    public final void rule__Collision__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGeometry.g:1139:1: ( rule__Collision__Group_4__0__Impl rule__Collision__Group_4__1 )
            // InternalGeometry.g:1140:2: rule__Collision__Group_4__0__Impl rule__Collision__Group_4__1
            {
            pushFollow(FOLLOW_11);
            rule__Collision__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Collision__Group_4__1();

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
    // $ANTLR end "rule__Collision__Group_4__0"


    // $ANTLR start "rule__Collision__Group_4__0__Impl"
    // InternalGeometry.g:1147:1: rule__Collision__Group_4__0__Impl : ( 'geometry' ) ;
    public final void rule__Collision__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGeometry.g:1151:1: ( ( 'geometry' ) )
            // InternalGeometry.g:1152:1: ( 'geometry' )
            {
            // InternalGeometry.g:1152:1: ( 'geometry' )
            // InternalGeometry.g:1153:2: 'geometry'
            {
             before(grammarAccess.getCollisionAccess().getGeometryKeyword_4_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getCollisionAccess().getGeometryKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Collision__Group_4__0__Impl"


    // $ANTLR start "rule__Collision__Group_4__1"
    // InternalGeometry.g:1162:1: rule__Collision__Group_4__1 : rule__Collision__Group_4__1__Impl ;
    public final void rule__Collision__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGeometry.g:1166:1: ( rule__Collision__Group_4__1__Impl )
            // InternalGeometry.g:1167:2: rule__Collision__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Collision__Group_4__1__Impl();

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
    // $ANTLR end "rule__Collision__Group_4__1"


    // $ANTLR start "rule__Collision__Group_4__1__Impl"
    // InternalGeometry.g:1173:1: rule__Collision__Group_4__1__Impl : ( ( rule__Collision__GeometryAssignment_4_1 ) ) ;
    public final void rule__Collision__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGeometry.g:1177:1: ( ( ( rule__Collision__GeometryAssignment_4_1 ) ) )
            // InternalGeometry.g:1178:1: ( ( rule__Collision__GeometryAssignment_4_1 ) )
            {
            // InternalGeometry.g:1178:1: ( ( rule__Collision__GeometryAssignment_4_1 ) )
            // InternalGeometry.g:1179:2: ( rule__Collision__GeometryAssignment_4_1 )
            {
             before(grammarAccess.getCollisionAccess().getGeometryAssignment_4_1()); 
            // InternalGeometry.g:1180:2: ( rule__Collision__GeometryAssignment_4_1 )
            // InternalGeometry.g:1180:3: rule__Collision__GeometryAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Collision__GeometryAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getCollisionAccess().getGeometryAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Collision__Group_4__1__Impl"


    // $ANTLR start "rule__Pose__Group__0"
    // InternalGeometry.g:1189:1: rule__Pose__Group__0 : rule__Pose__Group__0__Impl rule__Pose__Group__1 ;
    public final void rule__Pose__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGeometry.g:1193:1: ( rule__Pose__Group__0__Impl rule__Pose__Group__1 )
            // InternalGeometry.g:1194:2: rule__Pose__Group__0__Impl rule__Pose__Group__1
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
    // InternalGeometry.g:1201:1: rule__Pose__Group__0__Impl : ( 'Pose' ) ;
    public final void rule__Pose__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGeometry.g:1205:1: ( ( 'Pose' ) )
            // InternalGeometry.g:1206:1: ( 'Pose' )
            {
            // InternalGeometry.g:1206:1: ( 'Pose' )
            // InternalGeometry.g:1207:2: 'Pose'
            {
             before(grammarAccess.getPoseAccess().getPoseKeyword_0()); 
            match(input,27,FOLLOW_2); 
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
    // InternalGeometry.g:1216:1: rule__Pose__Group__1 : rule__Pose__Group__1__Impl rule__Pose__Group__2 ;
    public final void rule__Pose__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGeometry.g:1220:1: ( rule__Pose__Group__1__Impl rule__Pose__Group__2 )
            // InternalGeometry.g:1221:2: rule__Pose__Group__1__Impl rule__Pose__Group__2
            {
            pushFollow(FOLLOW_12);
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
    // InternalGeometry.g:1228:1: rule__Pose__Group__1__Impl : ( '{' ) ;
    public final void rule__Pose__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGeometry.g:1232:1: ( ( '{' ) )
            // InternalGeometry.g:1233:1: ( '{' )
            {
            // InternalGeometry.g:1233:1: ( '{' )
            // InternalGeometry.g:1234:2: '{'
            {
             before(grammarAccess.getPoseAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,18,FOLLOW_2); 
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
    // InternalGeometry.g:1243:1: rule__Pose__Group__2 : rule__Pose__Group__2__Impl rule__Pose__Group__3 ;
    public final void rule__Pose__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGeometry.g:1247:1: ( rule__Pose__Group__2__Impl rule__Pose__Group__3 )
            // InternalGeometry.g:1248:2: rule__Pose__Group__2__Impl rule__Pose__Group__3
            {
            pushFollow(FOLLOW_12);
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
    // InternalGeometry.g:1255:1: rule__Pose__Group__2__Impl : ( ( rule__Pose__Group_2__0 )? ) ;
    public final void rule__Pose__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGeometry.g:1259:1: ( ( ( rule__Pose__Group_2__0 )? ) )
            // InternalGeometry.g:1260:1: ( ( rule__Pose__Group_2__0 )? )
            {
            // InternalGeometry.g:1260:1: ( ( rule__Pose__Group_2__0 )? )
            // InternalGeometry.g:1261:2: ( rule__Pose__Group_2__0 )?
            {
             before(grammarAccess.getPoseAccess().getGroup_2()); 
            // InternalGeometry.g:1262:2: ( rule__Pose__Group_2__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==30) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalGeometry.g:1262:3: rule__Pose__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Pose__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPoseAccess().getGroup_2()); 

            }


            }

        }
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
    // InternalGeometry.g:1270:1: rule__Pose__Group__3 : rule__Pose__Group__3__Impl rule__Pose__Group__4 ;
    public final void rule__Pose__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGeometry.g:1274:1: ( rule__Pose__Group__3__Impl rule__Pose__Group__4 )
            // InternalGeometry.g:1275:2: rule__Pose__Group__3__Impl rule__Pose__Group__4
            {
            pushFollow(FOLLOW_13);
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
    // InternalGeometry.g:1282:1: rule__Pose__Group__3__Impl : ( 'rpy' ) ;
    public final void rule__Pose__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGeometry.g:1286:1: ( ( 'rpy' ) )
            // InternalGeometry.g:1287:1: ( 'rpy' )
            {
            // InternalGeometry.g:1287:1: ( 'rpy' )
            // InternalGeometry.g:1288:2: 'rpy'
            {
             before(grammarAccess.getPoseAccess().getRpyKeyword_3()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getPoseAccess().getRpyKeyword_3()); 

            }


            }

        }
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
    // InternalGeometry.g:1297:1: rule__Pose__Group__4 : rule__Pose__Group__4__Impl rule__Pose__Group__5 ;
    public final void rule__Pose__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGeometry.g:1301:1: ( rule__Pose__Group__4__Impl rule__Pose__Group__5 )
            // InternalGeometry.g:1302:2: rule__Pose__Group__4__Impl rule__Pose__Group__5
            {
            pushFollow(FOLLOW_14);
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
    // InternalGeometry.g:1309:1: rule__Pose__Group__4__Impl : ( ( rule__Pose__RpyAssignment_4 ) ) ;
    public final void rule__Pose__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGeometry.g:1313:1: ( ( ( rule__Pose__RpyAssignment_4 ) ) )
            // InternalGeometry.g:1314:1: ( ( rule__Pose__RpyAssignment_4 ) )
            {
            // InternalGeometry.g:1314:1: ( ( rule__Pose__RpyAssignment_4 ) )
            // InternalGeometry.g:1315:2: ( rule__Pose__RpyAssignment_4 )
            {
             before(grammarAccess.getPoseAccess().getRpyAssignment_4()); 
            // InternalGeometry.g:1316:2: ( rule__Pose__RpyAssignment_4 )
            // InternalGeometry.g:1316:3: rule__Pose__RpyAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Pose__RpyAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getPoseAccess().getRpyAssignment_4()); 

            }


            }

        }
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
    // InternalGeometry.g:1324:1: rule__Pose__Group__5 : rule__Pose__Group__5__Impl rule__Pose__Group__6 ;
    public final void rule__Pose__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGeometry.g:1328:1: ( rule__Pose__Group__5__Impl rule__Pose__Group__6 )
            // InternalGeometry.g:1329:2: rule__Pose__Group__5__Impl rule__Pose__Group__6
            {
            pushFollow(FOLLOW_13);
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
    // InternalGeometry.g:1336:1: rule__Pose__Group__5__Impl : ( 'xyz' ) ;
    public final void rule__Pose__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGeometry.g:1340:1: ( ( 'xyz' ) )
            // InternalGeometry.g:1341:1: ( 'xyz' )
            {
            // InternalGeometry.g:1341:1: ( 'xyz' )
            // InternalGeometry.g:1342:2: 'xyz'
            {
             before(grammarAccess.getPoseAccess().getXyzKeyword_5()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getPoseAccess().getXyzKeyword_5()); 

            }


            }

        }
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
    // InternalGeometry.g:1351:1: rule__Pose__Group__6 : rule__Pose__Group__6__Impl rule__Pose__Group__7 ;
    public final void rule__Pose__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGeometry.g:1355:1: ( rule__Pose__Group__6__Impl rule__Pose__Group__7 )
            // InternalGeometry.g:1356:2: rule__Pose__Group__6__Impl rule__Pose__Group__7
            {
            pushFollow(FOLLOW_15);
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
    // InternalGeometry.g:1363:1: rule__Pose__Group__6__Impl : ( ( rule__Pose__XyzAssignment_6 ) ) ;
    public final void rule__Pose__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGeometry.g:1367:1: ( ( ( rule__Pose__XyzAssignment_6 ) ) )
            // InternalGeometry.g:1368:1: ( ( rule__Pose__XyzAssignment_6 ) )
            {
            // InternalGeometry.g:1368:1: ( ( rule__Pose__XyzAssignment_6 ) )
            // InternalGeometry.g:1369:2: ( rule__Pose__XyzAssignment_6 )
            {
             before(grammarAccess.getPoseAccess().getXyzAssignment_6()); 
            // InternalGeometry.g:1370:2: ( rule__Pose__XyzAssignment_6 )
            // InternalGeometry.g:1370:3: rule__Pose__XyzAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__Pose__XyzAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getPoseAccess().getXyzAssignment_6()); 

            }


            }

        }
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
    // InternalGeometry.g:1378:1: rule__Pose__Group__7 : rule__Pose__Group__7__Impl ;
    public final void rule__Pose__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGeometry.g:1382:1: ( rule__Pose__Group__7__Impl )
            // InternalGeometry.g:1383:2: rule__Pose__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Pose__Group__7__Impl();

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
    // InternalGeometry.g:1389:1: rule__Pose__Group__7__Impl : ( '}' ) ;
    public final void rule__Pose__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGeometry.g:1393:1: ( ( '}' ) )
            // InternalGeometry.g:1394:1: ( '}' )
            {
            // InternalGeometry.g:1394:1: ( '}' )
            // InternalGeometry.g:1395:2: '}'
            {
             before(grammarAccess.getPoseAccess().getRightCurlyBracketKeyword_7()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getPoseAccess().getRightCurlyBracketKeyword_7()); 

            }


            }

        }
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


    // $ANTLR start "rule__Pose__Group_2__0"
    // InternalGeometry.g:1405:1: rule__Pose__Group_2__0 : rule__Pose__Group_2__0__Impl rule__Pose__Group_2__1 ;
    public final void rule__Pose__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGeometry.g:1409:1: ( rule__Pose__Group_2__0__Impl rule__Pose__Group_2__1 )
            // InternalGeometry.g:1410:2: rule__Pose__Group_2__0__Impl rule__Pose__Group_2__1
            {
            pushFollow(FOLLOW_13);
            rule__Pose__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Pose__Group_2__1();

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
    // $ANTLR end "rule__Pose__Group_2__0"


    // $ANTLR start "rule__Pose__Group_2__0__Impl"
    // InternalGeometry.g:1417:1: rule__Pose__Group_2__0__Impl : ( 'value' ) ;
    public final void rule__Pose__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGeometry.g:1421:1: ( ( 'value' ) )
            // InternalGeometry.g:1422:1: ( 'value' )
            {
            // InternalGeometry.g:1422:1: ( 'value' )
            // InternalGeometry.g:1423:2: 'value'
            {
             before(grammarAccess.getPoseAccess().getValueKeyword_2_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getPoseAccess().getValueKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pose__Group_2__0__Impl"


    // $ANTLR start "rule__Pose__Group_2__1"
    // InternalGeometry.g:1432:1: rule__Pose__Group_2__1 : rule__Pose__Group_2__1__Impl ;
    public final void rule__Pose__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGeometry.g:1436:1: ( rule__Pose__Group_2__1__Impl )
            // InternalGeometry.g:1437:2: rule__Pose__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Pose__Group_2__1__Impl();

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
    // $ANTLR end "rule__Pose__Group_2__1"


    // $ANTLR start "rule__Pose__Group_2__1__Impl"
    // InternalGeometry.g:1443:1: rule__Pose__Group_2__1__Impl : ( ( rule__Pose__ValueAssignment_2_1 ) ) ;
    public final void rule__Pose__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGeometry.g:1447:1: ( ( ( rule__Pose__ValueAssignment_2_1 ) ) )
            // InternalGeometry.g:1448:1: ( ( rule__Pose__ValueAssignment_2_1 ) )
            {
            // InternalGeometry.g:1448:1: ( ( rule__Pose__ValueAssignment_2_1 ) )
            // InternalGeometry.g:1449:2: ( rule__Pose__ValueAssignment_2_1 )
            {
             before(grammarAccess.getPoseAccess().getValueAssignment_2_1()); 
            // InternalGeometry.g:1450:2: ( rule__Pose__ValueAssignment_2_1 )
            // InternalGeometry.g:1450:3: rule__Pose__ValueAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Pose__ValueAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getPoseAccess().getValueAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pose__Group_2__1__Impl"


    // $ANTLR start "rule__Geometry__Group__0"
    // InternalGeometry.g:1459:1: rule__Geometry__Group__0 : rule__Geometry__Group__0__Impl rule__Geometry__Group__1 ;
    public final void rule__Geometry__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGeometry.g:1463:1: ( rule__Geometry__Group__0__Impl rule__Geometry__Group__1 )
            // InternalGeometry.g:1464:2: rule__Geometry__Group__0__Impl rule__Geometry__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__Geometry__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Geometry__Group__1();

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
    // $ANTLR end "rule__Geometry__Group__0"


    // $ANTLR start "rule__Geometry__Group__0__Impl"
    // InternalGeometry.g:1471:1: rule__Geometry__Group__0__Impl : ( () ) ;
    public final void rule__Geometry__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGeometry.g:1475:1: ( ( () ) )
            // InternalGeometry.g:1476:1: ( () )
            {
            // InternalGeometry.g:1476:1: ( () )
            // InternalGeometry.g:1477:2: ()
            {
             before(grammarAccess.getGeometryAccess().getGeometryAction_0()); 
            // InternalGeometry.g:1478:2: ()
            // InternalGeometry.g:1478:3: 
            {
            }

             after(grammarAccess.getGeometryAccess().getGeometryAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Geometry__Group__0__Impl"


    // $ANTLR start "rule__Geometry__Group__1"
    // InternalGeometry.g:1486:1: rule__Geometry__Group__1 : rule__Geometry__Group__1__Impl rule__Geometry__Group__2 ;
    public final void rule__Geometry__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGeometry.g:1490:1: ( rule__Geometry__Group__1__Impl rule__Geometry__Group__2 )
            // InternalGeometry.g:1491:2: rule__Geometry__Group__1__Impl rule__Geometry__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__Geometry__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Geometry__Group__2();

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
    // $ANTLR end "rule__Geometry__Group__1"


    // $ANTLR start "rule__Geometry__Group__1__Impl"
    // InternalGeometry.g:1498:1: rule__Geometry__Group__1__Impl : ( 'Geometry' ) ;
    public final void rule__Geometry__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGeometry.g:1502:1: ( ( 'Geometry' ) )
            // InternalGeometry.g:1503:1: ( 'Geometry' )
            {
            // InternalGeometry.g:1503:1: ( 'Geometry' )
            // InternalGeometry.g:1504:2: 'Geometry'
            {
             before(grammarAccess.getGeometryAccess().getGeometryKeyword_1()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getGeometryAccess().getGeometryKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Geometry__Group__1__Impl"


    // $ANTLR start "rule__Geometry__Group__2"
    // InternalGeometry.g:1513:1: rule__Geometry__Group__2 : rule__Geometry__Group__2__Impl rule__Geometry__Group__3 ;
    public final void rule__Geometry__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGeometry.g:1517:1: ( rule__Geometry__Group__2__Impl rule__Geometry__Group__3 )
            // InternalGeometry.g:1518:2: rule__Geometry__Group__2__Impl rule__Geometry__Group__3
            {
            pushFollow(FOLLOW_16);
            rule__Geometry__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Geometry__Group__3();

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
    // $ANTLR end "rule__Geometry__Group__2"


    // $ANTLR start "rule__Geometry__Group__2__Impl"
    // InternalGeometry.g:1525:1: rule__Geometry__Group__2__Impl : ( '{' ) ;
    public final void rule__Geometry__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGeometry.g:1529:1: ( ( '{' ) )
            // InternalGeometry.g:1530:1: ( '{' )
            {
            // InternalGeometry.g:1530:1: ( '{' )
            // InternalGeometry.g:1531:2: '{'
            {
             before(grammarAccess.getGeometryAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getGeometryAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Geometry__Group__2__Impl"


    // $ANTLR start "rule__Geometry__Group__3"
    // InternalGeometry.g:1540:1: rule__Geometry__Group__3 : rule__Geometry__Group__3__Impl rule__Geometry__Group__4 ;
    public final void rule__Geometry__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGeometry.g:1544:1: ( rule__Geometry__Group__3__Impl rule__Geometry__Group__4 )
            // InternalGeometry.g:1545:2: rule__Geometry__Group__3__Impl rule__Geometry__Group__4
            {
            pushFollow(FOLLOW_16);
            rule__Geometry__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Geometry__Group__4();

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
    // $ANTLR end "rule__Geometry__Group__3"


    // $ANTLR start "rule__Geometry__Group__3__Impl"
    // InternalGeometry.g:1552:1: rule__Geometry__Group__3__Impl : ( ( rule__Geometry__Group_3__0 )? ) ;
    public final void rule__Geometry__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGeometry.g:1556:1: ( ( ( rule__Geometry__Group_3__0 )? ) )
            // InternalGeometry.g:1557:1: ( ( rule__Geometry__Group_3__0 )? )
            {
            // InternalGeometry.g:1557:1: ( ( rule__Geometry__Group_3__0 )? )
            // InternalGeometry.g:1558:2: ( rule__Geometry__Group_3__0 )?
            {
             before(grammarAccess.getGeometryAccess().getGroup_3()); 
            // InternalGeometry.g:1559:2: ( rule__Geometry__Group_3__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==32) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalGeometry.g:1559:3: rule__Geometry__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Geometry__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getGeometryAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Geometry__Group__3__Impl"


    // $ANTLR start "rule__Geometry__Group__4"
    // InternalGeometry.g:1567:1: rule__Geometry__Group__4 : rule__Geometry__Group__4__Impl rule__Geometry__Group__5 ;
    public final void rule__Geometry__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGeometry.g:1571:1: ( rule__Geometry__Group__4__Impl rule__Geometry__Group__5 )
            // InternalGeometry.g:1572:2: rule__Geometry__Group__4__Impl rule__Geometry__Group__5
            {
            pushFollow(FOLLOW_16);
            rule__Geometry__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Geometry__Group__5();

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
    // $ANTLR end "rule__Geometry__Group__4"


    // $ANTLR start "rule__Geometry__Group__4__Impl"
    // InternalGeometry.g:1579:1: rule__Geometry__Group__4__Impl : ( ( rule__Geometry__Group_4__0 )? ) ;
    public final void rule__Geometry__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGeometry.g:1583:1: ( ( ( rule__Geometry__Group_4__0 )? ) )
            // InternalGeometry.g:1584:1: ( ( rule__Geometry__Group_4__0 )? )
            {
            // InternalGeometry.g:1584:1: ( ( rule__Geometry__Group_4__0 )? )
            // InternalGeometry.g:1585:2: ( rule__Geometry__Group_4__0 )?
            {
             before(grammarAccess.getGeometryAccess().getGroup_4()); 
            // InternalGeometry.g:1586:2: ( rule__Geometry__Group_4__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==33) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalGeometry.g:1586:3: rule__Geometry__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Geometry__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getGeometryAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Geometry__Group__4__Impl"


    // $ANTLR start "rule__Geometry__Group__5"
    // InternalGeometry.g:1594:1: rule__Geometry__Group__5 : rule__Geometry__Group__5__Impl rule__Geometry__Group__6 ;
    public final void rule__Geometry__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGeometry.g:1598:1: ( rule__Geometry__Group__5__Impl rule__Geometry__Group__6 )
            // InternalGeometry.g:1599:2: rule__Geometry__Group__5__Impl rule__Geometry__Group__6
            {
            pushFollow(FOLLOW_16);
            rule__Geometry__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Geometry__Group__6();

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
    // $ANTLR end "rule__Geometry__Group__5"


    // $ANTLR start "rule__Geometry__Group__5__Impl"
    // InternalGeometry.g:1606:1: rule__Geometry__Group__5__Impl : ( ( rule__Geometry__Group_5__0 )? ) ;
    public final void rule__Geometry__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGeometry.g:1610:1: ( ( ( rule__Geometry__Group_5__0 )? ) )
            // InternalGeometry.g:1611:1: ( ( rule__Geometry__Group_5__0 )? )
            {
            // InternalGeometry.g:1611:1: ( ( rule__Geometry__Group_5__0 )? )
            // InternalGeometry.g:1612:2: ( rule__Geometry__Group_5__0 )?
            {
             before(grammarAccess.getGeometryAccess().getGroup_5()); 
            // InternalGeometry.g:1613:2: ( rule__Geometry__Group_5__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==34) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalGeometry.g:1613:3: rule__Geometry__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Geometry__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getGeometryAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Geometry__Group__5__Impl"


    // $ANTLR start "rule__Geometry__Group__6"
    // InternalGeometry.g:1621:1: rule__Geometry__Group__6 : rule__Geometry__Group__6__Impl rule__Geometry__Group__7 ;
    public final void rule__Geometry__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGeometry.g:1625:1: ( rule__Geometry__Group__6__Impl rule__Geometry__Group__7 )
            // InternalGeometry.g:1626:2: rule__Geometry__Group__6__Impl rule__Geometry__Group__7
            {
            pushFollow(FOLLOW_16);
            rule__Geometry__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Geometry__Group__7();

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
    // $ANTLR end "rule__Geometry__Group__6"


    // $ANTLR start "rule__Geometry__Group__6__Impl"
    // InternalGeometry.g:1633:1: rule__Geometry__Group__6__Impl : ( ( rule__Geometry__Group_6__0 )? ) ;
    public final void rule__Geometry__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGeometry.g:1637:1: ( ( ( rule__Geometry__Group_6__0 )? ) )
            // InternalGeometry.g:1638:1: ( ( rule__Geometry__Group_6__0 )? )
            {
            // InternalGeometry.g:1638:1: ( ( rule__Geometry__Group_6__0 )? )
            // InternalGeometry.g:1639:2: ( rule__Geometry__Group_6__0 )?
            {
             before(grammarAccess.getGeometryAccess().getGroup_6()); 
            // InternalGeometry.g:1640:2: ( rule__Geometry__Group_6__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==35) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalGeometry.g:1640:3: rule__Geometry__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Geometry__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getGeometryAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Geometry__Group__6__Impl"


    // $ANTLR start "rule__Geometry__Group__7"
    // InternalGeometry.g:1648:1: rule__Geometry__Group__7 : rule__Geometry__Group__7__Impl ;
    public final void rule__Geometry__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGeometry.g:1652:1: ( rule__Geometry__Group__7__Impl )
            // InternalGeometry.g:1653:2: rule__Geometry__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Geometry__Group__7__Impl();

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
    // $ANTLR end "rule__Geometry__Group__7"


    // $ANTLR start "rule__Geometry__Group__7__Impl"
    // InternalGeometry.g:1659:1: rule__Geometry__Group__7__Impl : ( '}' ) ;
    public final void rule__Geometry__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGeometry.g:1663:1: ( ( '}' ) )
            // InternalGeometry.g:1664:1: ( '}' )
            {
            // InternalGeometry.g:1664:1: ( '}' )
            // InternalGeometry.g:1665:2: '}'
            {
             before(grammarAccess.getGeometryAccess().getRightCurlyBracketKeyword_7()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getGeometryAccess().getRightCurlyBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Geometry__Group__7__Impl"


    // $ANTLR start "rule__Geometry__Group_3__0"
    // InternalGeometry.g:1675:1: rule__Geometry__Group_3__0 : rule__Geometry__Group_3__0__Impl rule__Geometry__Group_3__1 ;
    public final void rule__Geometry__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGeometry.g:1679:1: ( rule__Geometry__Group_3__0__Impl rule__Geometry__Group_3__1 )
            // InternalGeometry.g:1680:2: rule__Geometry__Group_3__0__Impl rule__Geometry__Group_3__1
            {
            pushFollow(FOLLOW_17);
            rule__Geometry__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Geometry__Group_3__1();

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
    // $ANTLR end "rule__Geometry__Group_3__0"


    // $ANTLR start "rule__Geometry__Group_3__0__Impl"
    // InternalGeometry.g:1687:1: rule__Geometry__Group_3__0__Impl : ( 'box' ) ;
    public final void rule__Geometry__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGeometry.g:1691:1: ( ( 'box' ) )
            // InternalGeometry.g:1692:1: ( 'box' )
            {
            // InternalGeometry.g:1692:1: ( 'box' )
            // InternalGeometry.g:1693:2: 'box'
            {
             before(grammarAccess.getGeometryAccess().getBoxKeyword_3_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getGeometryAccess().getBoxKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Geometry__Group_3__0__Impl"


    // $ANTLR start "rule__Geometry__Group_3__1"
    // InternalGeometry.g:1702:1: rule__Geometry__Group_3__1 : rule__Geometry__Group_3__1__Impl ;
    public final void rule__Geometry__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGeometry.g:1706:1: ( rule__Geometry__Group_3__1__Impl )
            // InternalGeometry.g:1707:2: rule__Geometry__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Geometry__Group_3__1__Impl();

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
    // $ANTLR end "rule__Geometry__Group_3__1"


    // $ANTLR start "rule__Geometry__Group_3__1__Impl"
    // InternalGeometry.g:1713:1: rule__Geometry__Group_3__1__Impl : ( ( rule__Geometry__BoxAssignment_3_1 ) ) ;
    public final void rule__Geometry__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGeometry.g:1717:1: ( ( ( rule__Geometry__BoxAssignment_3_1 ) ) )
            // InternalGeometry.g:1718:1: ( ( rule__Geometry__BoxAssignment_3_1 ) )
            {
            // InternalGeometry.g:1718:1: ( ( rule__Geometry__BoxAssignment_3_1 ) )
            // InternalGeometry.g:1719:2: ( rule__Geometry__BoxAssignment_3_1 )
            {
             before(grammarAccess.getGeometryAccess().getBoxAssignment_3_1()); 
            // InternalGeometry.g:1720:2: ( rule__Geometry__BoxAssignment_3_1 )
            // InternalGeometry.g:1720:3: rule__Geometry__BoxAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Geometry__BoxAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getGeometryAccess().getBoxAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Geometry__Group_3__1__Impl"


    // $ANTLR start "rule__Geometry__Group_4__0"
    // InternalGeometry.g:1729:1: rule__Geometry__Group_4__0 : rule__Geometry__Group_4__0__Impl rule__Geometry__Group_4__1 ;
    public final void rule__Geometry__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGeometry.g:1733:1: ( rule__Geometry__Group_4__0__Impl rule__Geometry__Group_4__1 )
            // InternalGeometry.g:1734:2: rule__Geometry__Group_4__0__Impl rule__Geometry__Group_4__1
            {
            pushFollow(FOLLOW_18);
            rule__Geometry__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Geometry__Group_4__1();

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
    // $ANTLR end "rule__Geometry__Group_4__0"


    // $ANTLR start "rule__Geometry__Group_4__0__Impl"
    // InternalGeometry.g:1741:1: rule__Geometry__Group_4__0__Impl : ( 'cylinder' ) ;
    public final void rule__Geometry__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGeometry.g:1745:1: ( ( 'cylinder' ) )
            // InternalGeometry.g:1746:1: ( 'cylinder' )
            {
            // InternalGeometry.g:1746:1: ( 'cylinder' )
            // InternalGeometry.g:1747:2: 'cylinder'
            {
             before(grammarAccess.getGeometryAccess().getCylinderKeyword_4_0()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getGeometryAccess().getCylinderKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Geometry__Group_4__0__Impl"


    // $ANTLR start "rule__Geometry__Group_4__1"
    // InternalGeometry.g:1756:1: rule__Geometry__Group_4__1 : rule__Geometry__Group_4__1__Impl ;
    public final void rule__Geometry__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGeometry.g:1760:1: ( rule__Geometry__Group_4__1__Impl )
            // InternalGeometry.g:1761:2: rule__Geometry__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Geometry__Group_4__1__Impl();

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
    // $ANTLR end "rule__Geometry__Group_4__1"


    // $ANTLR start "rule__Geometry__Group_4__1__Impl"
    // InternalGeometry.g:1767:1: rule__Geometry__Group_4__1__Impl : ( ( rule__Geometry__CylinderAssignment_4_1 ) ) ;
    public final void rule__Geometry__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGeometry.g:1771:1: ( ( ( rule__Geometry__CylinderAssignment_4_1 ) ) )
            // InternalGeometry.g:1772:1: ( ( rule__Geometry__CylinderAssignment_4_1 ) )
            {
            // InternalGeometry.g:1772:1: ( ( rule__Geometry__CylinderAssignment_4_1 ) )
            // InternalGeometry.g:1773:2: ( rule__Geometry__CylinderAssignment_4_1 )
            {
             before(grammarAccess.getGeometryAccess().getCylinderAssignment_4_1()); 
            // InternalGeometry.g:1774:2: ( rule__Geometry__CylinderAssignment_4_1 )
            // InternalGeometry.g:1774:3: rule__Geometry__CylinderAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Geometry__CylinderAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getGeometryAccess().getCylinderAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Geometry__Group_4__1__Impl"


    // $ANTLR start "rule__Geometry__Group_5__0"
    // InternalGeometry.g:1783:1: rule__Geometry__Group_5__0 : rule__Geometry__Group_5__0__Impl rule__Geometry__Group_5__1 ;
    public final void rule__Geometry__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGeometry.g:1787:1: ( rule__Geometry__Group_5__0__Impl rule__Geometry__Group_5__1 )
            // InternalGeometry.g:1788:2: rule__Geometry__Group_5__0__Impl rule__Geometry__Group_5__1
            {
            pushFollow(FOLLOW_19);
            rule__Geometry__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Geometry__Group_5__1();

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
    // $ANTLR end "rule__Geometry__Group_5__0"


    // $ANTLR start "rule__Geometry__Group_5__0__Impl"
    // InternalGeometry.g:1795:1: rule__Geometry__Group_5__0__Impl : ( 'mesh' ) ;
    public final void rule__Geometry__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGeometry.g:1799:1: ( ( 'mesh' ) )
            // InternalGeometry.g:1800:1: ( 'mesh' )
            {
            // InternalGeometry.g:1800:1: ( 'mesh' )
            // InternalGeometry.g:1801:2: 'mesh'
            {
             before(grammarAccess.getGeometryAccess().getMeshKeyword_5_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getGeometryAccess().getMeshKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Geometry__Group_5__0__Impl"


    // $ANTLR start "rule__Geometry__Group_5__1"
    // InternalGeometry.g:1810:1: rule__Geometry__Group_5__1 : rule__Geometry__Group_5__1__Impl ;
    public final void rule__Geometry__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGeometry.g:1814:1: ( rule__Geometry__Group_5__1__Impl )
            // InternalGeometry.g:1815:2: rule__Geometry__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Geometry__Group_5__1__Impl();

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
    // $ANTLR end "rule__Geometry__Group_5__1"


    // $ANTLR start "rule__Geometry__Group_5__1__Impl"
    // InternalGeometry.g:1821:1: rule__Geometry__Group_5__1__Impl : ( ( rule__Geometry__MeshAssignment_5_1 ) ) ;
    public final void rule__Geometry__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGeometry.g:1825:1: ( ( ( rule__Geometry__MeshAssignment_5_1 ) ) )
            // InternalGeometry.g:1826:1: ( ( rule__Geometry__MeshAssignment_5_1 ) )
            {
            // InternalGeometry.g:1826:1: ( ( rule__Geometry__MeshAssignment_5_1 ) )
            // InternalGeometry.g:1827:2: ( rule__Geometry__MeshAssignment_5_1 )
            {
             before(grammarAccess.getGeometryAccess().getMeshAssignment_5_1()); 
            // InternalGeometry.g:1828:2: ( rule__Geometry__MeshAssignment_5_1 )
            // InternalGeometry.g:1828:3: rule__Geometry__MeshAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__Geometry__MeshAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getGeometryAccess().getMeshAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Geometry__Group_5__1__Impl"


    // $ANTLR start "rule__Geometry__Group_6__0"
    // InternalGeometry.g:1837:1: rule__Geometry__Group_6__0 : rule__Geometry__Group_6__0__Impl rule__Geometry__Group_6__1 ;
    public final void rule__Geometry__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGeometry.g:1841:1: ( rule__Geometry__Group_6__0__Impl rule__Geometry__Group_6__1 )
            // InternalGeometry.g:1842:2: rule__Geometry__Group_6__0__Impl rule__Geometry__Group_6__1
            {
            pushFollow(FOLLOW_20);
            rule__Geometry__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Geometry__Group_6__1();

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
    // $ANTLR end "rule__Geometry__Group_6__0"


    // $ANTLR start "rule__Geometry__Group_6__0__Impl"
    // InternalGeometry.g:1849:1: rule__Geometry__Group_6__0__Impl : ( 'sphere' ) ;
    public final void rule__Geometry__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGeometry.g:1853:1: ( ( 'sphere' ) )
            // InternalGeometry.g:1854:1: ( 'sphere' )
            {
            // InternalGeometry.g:1854:1: ( 'sphere' )
            // InternalGeometry.g:1855:2: 'sphere'
            {
             before(grammarAccess.getGeometryAccess().getSphereKeyword_6_0()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getGeometryAccess().getSphereKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Geometry__Group_6__0__Impl"


    // $ANTLR start "rule__Geometry__Group_6__1"
    // InternalGeometry.g:1864:1: rule__Geometry__Group_6__1 : rule__Geometry__Group_6__1__Impl ;
    public final void rule__Geometry__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGeometry.g:1868:1: ( rule__Geometry__Group_6__1__Impl )
            // InternalGeometry.g:1869:2: rule__Geometry__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Geometry__Group_6__1__Impl();

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
    // $ANTLR end "rule__Geometry__Group_6__1"


    // $ANTLR start "rule__Geometry__Group_6__1__Impl"
    // InternalGeometry.g:1875:1: rule__Geometry__Group_6__1__Impl : ( ( rule__Geometry__SphereAssignment_6_1 ) ) ;
    public final void rule__Geometry__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGeometry.g:1879:1: ( ( ( rule__Geometry__SphereAssignment_6_1 ) ) )
            // InternalGeometry.g:1880:1: ( ( rule__Geometry__SphereAssignment_6_1 ) )
            {
            // InternalGeometry.g:1880:1: ( ( rule__Geometry__SphereAssignment_6_1 ) )
            // InternalGeometry.g:1881:2: ( rule__Geometry__SphereAssignment_6_1 )
            {
             before(grammarAccess.getGeometryAccess().getSphereAssignment_6_1()); 
            // InternalGeometry.g:1882:2: ( rule__Geometry__SphereAssignment_6_1 )
            // InternalGeometry.g:1882:3: rule__Geometry__SphereAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__Geometry__SphereAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getGeometryAccess().getSphereAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Geometry__Group_6__1__Impl"


    // $ANTLR start "rule__Box__Group__0"
    // InternalGeometry.g:1891:1: rule__Box__Group__0 : rule__Box__Group__0__Impl rule__Box__Group__1 ;
    public final void rule__Box__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGeometry.g:1895:1: ( rule__Box__Group__0__Impl rule__Box__Group__1 )
            // InternalGeometry.g:1896:2: rule__Box__Group__0__Impl rule__Box__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Box__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Box__Group__1();

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
    // $ANTLR end "rule__Box__Group__0"


    // $ANTLR start "rule__Box__Group__0__Impl"
    // InternalGeometry.g:1903:1: rule__Box__Group__0__Impl : ( 'Box' ) ;
    public final void rule__Box__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGeometry.g:1907:1: ( ( 'Box' ) )
            // InternalGeometry.g:1908:1: ( 'Box' )
            {
            // InternalGeometry.g:1908:1: ( 'Box' )
            // InternalGeometry.g:1909:2: 'Box'
            {
             before(grammarAccess.getBoxAccess().getBoxKeyword_0()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getBoxAccess().getBoxKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Box__Group__0__Impl"


    // $ANTLR start "rule__Box__Group__1"
    // InternalGeometry.g:1918:1: rule__Box__Group__1 : rule__Box__Group__1__Impl rule__Box__Group__2 ;
    public final void rule__Box__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGeometry.g:1922:1: ( rule__Box__Group__1__Impl rule__Box__Group__2 )
            // InternalGeometry.g:1923:2: rule__Box__Group__1__Impl rule__Box__Group__2
            {
            pushFollow(FOLLOW_21);
            rule__Box__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Box__Group__2();

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
    // $ANTLR end "rule__Box__Group__1"


    // $ANTLR start "rule__Box__Group__1__Impl"
    // InternalGeometry.g:1930:1: rule__Box__Group__1__Impl : ( '{' ) ;
    public final void rule__Box__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGeometry.g:1934:1: ( ( '{' ) )
            // InternalGeometry.g:1935:1: ( '{' )
            {
            // InternalGeometry.g:1935:1: ( '{' )
            // InternalGeometry.g:1936:2: '{'
            {
             before(grammarAccess.getBoxAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getBoxAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Box__Group__1__Impl"


    // $ANTLR start "rule__Box__Group__2"
    // InternalGeometry.g:1945:1: rule__Box__Group__2 : rule__Box__Group__2__Impl rule__Box__Group__3 ;
    public final void rule__Box__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGeometry.g:1949:1: ( rule__Box__Group__2__Impl rule__Box__Group__3 )
            // InternalGeometry.g:1950:2: rule__Box__Group__2__Impl rule__Box__Group__3
            {
            pushFollow(FOLLOW_22);
            rule__Box__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Box__Group__3();

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
    // $ANTLR end "rule__Box__Group__2"


    // $ANTLR start "rule__Box__Group__2__Impl"
    // InternalGeometry.g:1957:1: rule__Box__Group__2__Impl : ( 'x' ) ;
    public final void rule__Box__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGeometry.g:1961:1: ( ( 'x' ) )
            // InternalGeometry.g:1962:1: ( 'x' )
            {
            // InternalGeometry.g:1962:1: ( 'x' )
            // InternalGeometry.g:1963:2: 'x'
            {
             before(grammarAccess.getBoxAccess().getXKeyword_2()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getBoxAccess().getXKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Box__Group__2__Impl"


    // $ANTLR start "rule__Box__Group__3"
    // InternalGeometry.g:1972:1: rule__Box__Group__3 : rule__Box__Group__3__Impl rule__Box__Group__4 ;
    public final void rule__Box__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGeometry.g:1976:1: ( rule__Box__Group__3__Impl rule__Box__Group__4 )
            // InternalGeometry.g:1977:2: rule__Box__Group__3__Impl rule__Box__Group__4
            {
            pushFollow(FOLLOW_23);
            rule__Box__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Box__Group__4();

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
    // $ANTLR end "rule__Box__Group__3"


    // $ANTLR start "rule__Box__Group__3__Impl"
    // InternalGeometry.g:1984:1: rule__Box__Group__3__Impl : ( ( rule__Box__XAssignment_3 ) ) ;
    public final void rule__Box__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGeometry.g:1988:1: ( ( ( rule__Box__XAssignment_3 ) ) )
            // InternalGeometry.g:1989:1: ( ( rule__Box__XAssignment_3 ) )
            {
            // InternalGeometry.g:1989:1: ( ( rule__Box__XAssignment_3 ) )
            // InternalGeometry.g:1990:2: ( rule__Box__XAssignment_3 )
            {
             before(grammarAccess.getBoxAccess().getXAssignment_3()); 
            // InternalGeometry.g:1991:2: ( rule__Box__XAssignment_3 )
            // InternalGeometry.g:1991:3: rule__Box__XAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Box__XAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getBoxAccess().getXAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Box__Group__3__Impl"


    // $ANTLR start "rule__Box__Group__4"
    // InternalGeometry.g:1999:1: rule__Box__Group__4 : rule__Box__Group__4__Impl rule__Box__Group__5 ;
    public final void rule__Box__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGeometry.g:2003:1: ( rule__Box__Group__4__Impl rule__Box__Group__5 )
            // InternalGeometry.g:2004:2: rule__Box__Group__4__Impl rule__Box__Group__5
            {
            pushFollow(FOLLOW_22);
            rule__Box__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Box__Group__5();

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
    // $ANTLR end "rule__Box__Group__4"


    // $ANTLR start "rule__Box__Group__4__Impl"
    // InternalGeometry.g:2011:1: rule__Box__Group__4__Impl : ( 'y' ) ;
    public final void rule__Box__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGeometry.g:2015:1: ( ( 'y' ) )
            // InternalGeometry.g:2016:1: ( 'y' )
            {
            // InternalGeometry.g:2016:1: ( 'y' )
            // InternalGeometry.g:2017:2: 'y'
            {
             before(grammarAccess.getBoxAccess().getYKeyword_4()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getBoxAccess().getYKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Box__Group__4__Impl"


    // $ANTLR start "rule__Box__Group__5"
    // InternalGeometry.g:2026:1: rule__Box__Group__5 : rule__Box__Group__5__Impl rule__Box__Group__6 ;
    public final void rule__Box__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGeometry.g:2030:1: ( rule__Box__Group__5__Impl rule__Box__Group__6 )
            // InternalGeometry.g:2031:2: rule__Box__Group__5__Impl rule__Box__Group__6
            {
            pushFollow(FOLLOW_24);
            rule__Box__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Box__Group__6();

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
    // $ANTLR end "rule__Box__Group__5"


    // $ANTLR start "rule__Box__Group__5__Impl"
    // InternalGeometry.g:2038:1: rule__Box__Group__5__Impl : ( ( rule__Box__YAssignment_5 ) ) ;
    public final void rule__Box__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGeometry.g:2042:1: ( ( ( rule__Box__YAssignment_5 ) ) )
            // InternalGeometry.g:2043:1: ( ( rule__Box__YAssignment_5 ) )
            {
            // InternalGeometry.g:2043:1: ( ( rule__Box__YAssignment_5 ) )
            // InternalGeometry.g:2044:2: ( rule__Box__YAssignment_5 )
            {
             before(grammarAccess.getBoxAccess().getYAssignment_5()); 
            // InternalGeometry.g:2045:2: ( rule__Box__YAssignment_5 )
            // InternalGeometry.g:2045:3: rule__Box__YAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Box__YAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getBoxAccess().getYAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Box__Group__5__Impl"


    // $ANTLR start "rule__Box__Group__6"
    // InternalGeometry.g:2053:1: rule__Box__Group__6 : rule__Box__Group__6__Impl rule__Box__Group__7 ;
    public final void rule__Box__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGeometry.g:2057:1: ( rule__Box__Group__6__Impl rule__Box__Group__7 )
            // InternalGeometry.g:2058:2: rule__Box__Group__6__Impl rule__Box__Group__7
            {
            pushFollow(FOLLOW_22);
            rule__Box__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Box__Group__7();

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
    // $ANTLR end "rule__Box__Group__6"


    // $ANTLR start "rule__Box__Group__6__Impl"
    // InternalGeometry.g:2065:1: rule__Box__Group__6__Impl : ( 'z' ) ;
    public final void rule__Box__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGeometry.g:2069:1: ( ( 'z' ) )
            // InternalGeometry.g:2070:1: ( 'z' )
            {
            // InternalGeometry.g:2070:1: ( 'z' )
            // InternalGeometry.g:2071:2: 'z'
            {
             before(grammarAccess.getBoxAccess().getZKeyword_6()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getBoxAccess().getZKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Box__Group__6__Impl"


    // $ANTLR start "rule__Box__Group__7"
    // InternalGeometry.g:2080:1: rule__Box__Group__7 : rule__Box__Group__7__Impl rule__Box__Group__8 ;
    public final void rule__Box__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGeometry.g:2084:1: ( rule__Box__Group__7__Impl rule__Box__Group__8 )
            // InternalGeometry.g:2085:2: rule__Box__Group__7__Impl rule__Box__Group__8
            {
            pushFollow(FOLLOW_15);
            rule__Box__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Box__Group__8();

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
    // $ANTLR end "rule__Box__Group__7"


    // $ANTLR start "rule__Box__Group__7__Impl"
    // InternalGeometry.g:2092:1: rule__Box__Group__7__Impl : ( ( rule__Box__ZAssignment_7 ) ) ;
    public final void rule__Box__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGeometry.g:2096:1: ( ( ( rule__Box__ZAssignment_7 ) ) )
            // InternalGeometry.g:2097:1: ( ( rule__Box__ZAssignment_7 ) )
            {
            // InternalGeometry.g:2097:1: ( ( rule__Box__ZAssignment_7 ) )
            // InternalGeometry.g:2098:2: ( rule__Box__ZAssignment_7 )
            {
             before(grammarAccess.getBoxAccess().getZAssignment_7()); 
            // InternalGeometry.g:2099:2: ( rule__Box__ZAssignment_7 )
            // InternalGeometry.g:2099:3: rule__Box__ZAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__Box__ZAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getBoxAccess().getZAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Box__Group__7__Impl"


    // $ANTLR start "rule__Box__Group__8"
    // InternalGeometry.g:2107:1: rule__Box__Group__8 : rule__Box__Group__8__Impl ;
    public final void rule__Box__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGeometry.g:2111:1: ( rule__Box__Group__8__Impl )
            // InternalGeometry.g:2112:2: rule__Box__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Box__Group__8__Impl();

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
    // $ANTLR end "rule__Box__Group__8"


    // $ANTLR start "rule__Box__Group__8__Impl"
    // InternalGeometry.g:2118:1: rule__Box__Group__8__Impl : ( '}' ) ;
    public final void rule__Box__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGeometry.g:2122:1: ( ( '}' ) )
            // InternalGeometry.g:2123:1: ( '}' )
            {
            // InternalGeometry.g:2123:1: ( '}' )
            // InternalGeometry.g:2124:2: '}'
            {
             before(grammarAccess.getBoxAccess().getRightCurlyBracketKeyword_8()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getBoxAccess().getRightCurlyBracketKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Box__Group__8__Impl"


    // $ANTLR start "rule__Cylinder__Group__0"
    // InternalGeometry.g:2134:1: rule__Cylinder__Group__0 : rule__Cylinder__Group__0__Impl rule__Cylinder__Group__1 ;
    public final void rule__Cylinder__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGeometry.g:2138:1: ( rule__Cylinder__Group__0__Impl rule__Cylinder__Group__1 )
            // InternalGeometry.g:2139:2: rule__Cylinder__Group__0__Impl rule__Cylinder__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Cylinder__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Cylinder__Group__1();

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
    // $ANTLR end "rule__Cylinder__Group__0"


    // $ANTLR start "rule__Cylinder__Group__0__Impl"
    // InternalGeometry.g:2146:1: rule__Cylinder__Group__0__Impl : ( 'Cylinder' ) ;
    public final void rule__Cylinder__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGeometry.g:2150:1: ( ( 'Cylinder' ) )
            // InternalGeometry.g:2151:1: ( 'Cylinder' )
            {
            // InternalGeometry.g:2151:1: ( 'Cylinder' )
            // InternalGeometry.g:2152:2: 'Cylinder'
            {
             before(grammarAccess.getCylinderAccess().getCylinderKeyword_0()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getCylinderAccess().getCylinderKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cylinder__Group__0__Impl"


    // $ANTLR start "rule__Cylinder__Group__1"
    // InternalGeometry.g:2161:1: rule__Cylinder__Group__1 : rule__Cylinder__Group__1__Impl rule__Cylinder__Group__2 ;
    public final void rule__Cylinder__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGeometry.g:2165:1: ( rule__Cylinder__Group__1__Impl rule__Cylinder__Group__2 )
            // InternalGeometry.g:2166:2: rule__Cylinder__Group__1__Impl rule__Cylinder__Group__2
            {
            pushFollow(FOLLOW_25);
            rule__Cylinder__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Cylinder__Group__2();

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
    // $ANTLR end "rule__Cylinder__Group__1"


    // $ANTLR start "rule__Cylinder__Group__1__Impl"
    // InternalGeometry.g:2173:1: rule__Cylinder__Group__1__Impl : ( '{' ) ;
    public final void rule__Cylinder__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGeometry.g:2177:1: ( ( '{' ) )
            // InternalGeometry.g:2178:1: ( '{' )
            {
            // InternalGeometry.g:2178:1: ( '{' )
            // InternalGeometry.g:2179:2: '{'
            {
             before(grammarAccess.getCylinderAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getCylinderAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cylinder__Group__1__Impl"


    // $ANTLR start "rule__Cylinder__Group__2"
    // InternalGeometry.g:2188:1: rule__Cylinder__Group__2 : rule__Cylinder__Group__2__Impl rule__Cylinder__Group__3 ;
    public final void rule__Cylinder__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGeometry.g:2192:1: ( rule__Cylinder__Group__2__Impl rule__Cylinder__Group__3 )
            // InternalGeometry.g:2193:2: rule__Cylinder__Group__2__Impl rule__Cylinder__Group__3
            {
            pushFollow(FOLLOW_22);
            rule__Cylinder__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Cylinder__Group__3();

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
    // $ANTLR end "rule__Cylinder__Group__2"


    // $ANTLR start "rule__Cylinder__Group__2__Impl"
    // InternalGeometry.g:2200:1: rule__Cylinder__Group__2__Impl : ( 'length' ) ;
    public final void rule__Cylinder__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGeometry.g:2204:1: ( ( 'length' ) )
            // InternalGeometry.g:2205:1: ( 'length' )
            {
            // InternalGeometry.g:2205:1: ( 'length' )
            // InternalGeometry.g:2206:2: 'length'
            {
             before(grammarAccess.getCylinderAccess().getLengthKeyword_2()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getCylinderAccess().getLengthKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cylinder__Group__2__Impl"


    // $ANTLR start "rule__Cylinder__Group__3"
    // InternalGeometry.g:2215:1: rule__Cylinder__Group__3 : rule__Cylinder__Group__3__Impl rule__Cylinder__Group__4 ;
    public final void rule__Cylinder__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGeometry.g:2219:1: ( rule__Cylinder__Group__3__Impl rule__Cylinder__Group__4 )
            // InternalGeometry.g:2220:2: rule__Cylinder__Group__3__Impl rule__Cylinder__Group__4
            {
            pushFollow(FOLLOW_26);
            rule__Cylinder__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Cylinder__Group__4();

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
    // $ANTLR end "rule__Cylinder__Group__3"


    // $ANTLR start "rule__Cylinder__Group__3__Impl"
    // InternalGeometry.g:2227:1: rule__Cylinder__Group__3__Impl : ( ( rule__Cylinder__LengthAssignment_3 ) ) ;
    public final void rule__Cylinder__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGeometry.g:2231:1: ( ( ( rule__Cylinder__LengthAssignment_3 ) ) )
            // InternalGeometry.g:2232:1: ( ( rule__Cylinder__LengthAssignment_3 ) )
            {
            // InternalGeometry.g:2232:1: ( ( rule__Cylinder__LengthAssignment_3 ) )
            // InternalGeometry.g:2233:2: ( rule__Cylinder__LengthAssignment_3 )
            {
             before(grammarAccess.getCylinderAccess().getLengthAssignment_3()); 
            // InternalGeometry.g:2234:2: ( rule__Cylinder__LengthAssignment_3 )
            // InternalGeometry.g:2234:3: rule__Cylinder__LengthAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Cylinder__LengthAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getCylinderAccess().getLengthAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cylinder__Group__3__Impl"


    // $ANTLR start "rule__Cylinder__Group__4"
    // InternalGeometry.g:2242:1: rule__Cylinder__Group__4 : rule__Cylinder__Group__4__Impl rule__Cylinder__Group__5 ;
    public final void rule__Cylinder__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGeometry.g:2246:1: ( rule__Cylinder__Group__4__Impl rule__Cylinder__Group__5 )
            // InternalGeometry.g:2247:2: rule__Cylinder__Group__4__Impl rule__Cylinder__Group__5
            {
            pushFollow(FOLLOW_22);
            rule__Cylinder__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Cylinder__Group__5();

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
    // $ANTLR end "rule__Cylinder__Group__4"


    // $ANTLR start "rule__Cylinder__Group__4__Impl"
    // InternalGeometry.g:2254:1: rule__Cylinder__Group__4__Impl : ( 'radius' ) ;
    public final void rule__Cylinder__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGeometry.g:2258:1: ( ( 'radius' ) )
            // InternalGeometry.g:2259:1: ( 'radius' )
            {
            // InternalGeometry.g:2259:1: ( 'radius' )
            // InternalGeometry.g:2260:2: 'radius'
            {
             before(grammarAccess.getCylinderAccess().getRadiusKeyword_4()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getCylinderAccess().getRadiusKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cylinder__Group__4__Impl"


    // $ANTLR start "rule__Cylinder__Group__5"
    // InternalGeometry.g:2269:1: rule__Cylinder__Group__5 : rule__Cylinder__Group__5__Impl rule__Cylinder__Group__6 ;
    public final void rule__Cylinder__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGeometry.g:2273:1: ( rule__Cylinder__Group__5__Impl rule__Cylinder__Group__6 )
            // InternalGeometry.g:2274:2: rule__Cylinder__Group__5__Impl rule__Cylinder__Group__6
            {
            pushFollow(FOLLOW_15);
            rule__Cylinder__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Cylinder__Group__6();

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
    // $ANTLR end "rule__Cylinder__Group__5"


    // $ANTLR start "rule__Cylinder__Group__5__Impl"
    // InternalGeometry.g:2281:1: rule__Cylinder__Group__5__Impl : ( ( rule__Cylinder__RadiusAssignment_5 ) ) ;
    public final void rule__Cylinder__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGeometry.g:2285:1: ( ( ( rule__Cylinder__RadiusAssignment_5 ) ) )
            // InternalGeometry.g:2286:1: ( ( rule__Cylinder__RadiusAssignment_5 ) )
            {
            // InternalGeometry.g:2286:1: ( ( rule__Cylinder__RadiusAssignment_5 ) )
            // InternalGeometry.g:2287:2: ( rule__Cylinder__RadiusAssignment_5 )
            {
             before(grammarAccess.getCylinderAccess().getRadiusAssignment_5()); 
            // InternalGeometry.g:2288:2: ( rule__Cylinder__RadiusAssignment_5 )
            // InternalGeometry.g:2288:3: rule__Cylinder__RadiusAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Cylinder__RadiusAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getCylinderAccess().getRadiusAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cylinder__Group__5__Impl"


    // $ANTLR start "rule__Cylinder__Group__6"
    // InternalGeometry.g:2296:1: rule__Cylinder__Group__6 : rule__Cylinder__Group__6__Impl ;
    public final void rule__Cylinder__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGeometry.g:2300:1: ( rule__Cylinder__Group__6__Impl )
            // InternalGeometry.g:2301:2: rule__Cylinder__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Cylinder__Group__6__Impl();

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
    // $ANTLR end "rule__Cylinder__Group__6"


    // $ANTLR start "rule__Cylinder__Group__6__Impl"
    // InternalGeometry.g:2307:1: rule__Cylinder__Group__6__Impl : ( '}' ) ;
    public final void rule__Cylinder__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGeometry.g:2311:1: ( ( '}' ) )
            // InternalGeometry.g:2312:1: ( '}' )
            {
            // InternalGeometry.g:2312:1: ( '}' )
            // InternalGeometry.g:2313:2: '}'
            {
             before(grammarAccess.getCylinderAccess().getRightCurlyBracketKeyword_6()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getCylinderAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cylinder__Group__6__Impl"


    // $ANTLR start "rule__Mesh__Group__0"
    // InternalGeometry.g:2323:1: rule__Mesh__Group__0 : rule__Mesh__Group__0__Impl rule__Mesh__Group__1 ;
    public final void rule__Mesh__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGeometry.g:2327:1: ( rule__Mesh__Group__0__Impl rule__Mesh__Group__1 )
            // InternalGeometry.g:2328:2: rule__Mesh__Group__0__Impl rule__Mesh__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Mesh__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mesh__Group__1();

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
    // $ANTLR end "rule__Mesh__Group__0"


    // $ANTLR start "rule__Mesh__Group__0__Impl"
    // InternalGeometry.g:2335:1: rule__Mesh__Group__0__Impl : ( 'Mesh' ) ;
    public final void rule__Mesh__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGeometry.g:2339:1: ( ( 'Mesh' ) )
            // InternalGeometry.g:2340:1: ( 'Mesh' )
            {
            // InternalGeometry.g:2340:1: ( 'Mesh' )
            // InternalGeometry.g:2341:2: 'Mesh'
            {
             before(grammarAccess.getMeshAccess().getMeshKeyword_0()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getMeshAccess().getMeshKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mesh__Group__0__Impl"


    // $ANTLR start "rule__Mesh__Group__1"
    // InternalGeometry.g:2350:1: rule__Mesh__Group__1 : rule__Mesh__Group__1__Impl rule__Mesh__Group__2 ;
    public final void rule__Mesh__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGeometry.g:2354:1: ( rule__Mesh__Group__1__Impl rule__Mesh__Group__2 )
            // InternalGeometry.g:2355:2: rule__Mesh__Group__1__Impl rule__Mesh__Group__2
            {
            pushFollow(FOLLOW_27);
            rule__Mesh__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mesh__Group__2();

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
    // $ANTLR end "rule__Mesh__Group__1"


    // $ANTLR start "rule__Mesh__Group__1__Impl"
    // InternalGeometry.g:2362:1: rule__Mesh__Group__1__Impl : ( '{' ) ;
    public final void rule__Mesh__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGeometry.g:2366:1: ( ( '{' ) )
            // InternalGeometry.g:2367:1: ( '{' )
            {
            // InternalGeometry.g:2367:1: ( '{' )
            // InternalGeometry.g:2368:2: '{'
            {
             before(grammarAccess.getMeshAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getMeshAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mesh__Group__1__Impl"


    // $ANTLR start "rule__Mesh__Group__2"
    // InternalGeometry.g:2377:1: rule__Mesh__Group__2 : rule__Mesh__Group__2__Impl rule__Mesh__Group__3 ;
    public final void rule__Mesh__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGeometry.g:2381:1: ( rule__Mesh__Group__2__Impl rule__Mesh__Group__3 )
            // InternalGeometry.g:2382:2: rule__Mesh__Group__2__Impl rule__Mesh__Group__3
            {
            pushFollow(FOLLOW_13);
            rule__Mesh__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mesh__Group__3();

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
    // $ANTLR end "rule__Mesh__Group__2"


    // $ANTLR start "rule__Mesh__Group__2__Impl"
    // InternalGeometry.g:2389:1: rule__Mesh__Group__2__Impl : ( 'filename' ) ;
    public final void rule__Mesh__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGeometry.g:2393:1: ( ( 'filename' ) )
            // InternalGeometry.g:2394:1: ( 'filename' )
            {
            // InternalGeometry.g:2394:1: ( 'filename' )
            // InternalGeometry.g:2395:2: 'filename'
            {
             before(grammarAccess.getMeshAccess().getFilenameKeyword_2()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getMeshAccess().getFilenameKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mesh__Group__2__Impl"


    // $ANTLR start "rule__Mesh__Group__3"
    // InternalGeometry.g:2404:1: rule__Mesh__Group__3 : rule__Mesh__Group__3__Impl rule__Mesh__Group__4 ;
    public final void rule__Mesh__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGeometry.g:2408:1: ( rule__Mesh__Group__3__Impl rule__Mesh__Group__4 )
            // InternalGeometry.g:2409:2: rule__Mesh__Group__3__Impl rule__Mesh__Group__4
            {
            pushFollow(FOLLOW_28);
            rule__Mesh__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mesh__Group__4();

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
    // $ANTLR end "rule__Mesh__Group__3"


    // $ANTLR start "rule__Mesh__Group__3__Impl"
    // InternalGeometry.g:2416:1: rule__Mesh__Group__3__Impl : ( ( rule__Mesh__FilenameAssignment_3 ) ) ;
    public final void rule__Mesh__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGeometry.g:2420:1: ( ( ( rule__Mesh__FilenameAssignment_3 ) ) )
            // InternalGeometry.g:2421:1: ( ( rule__Mesh__FilenameAssignment_3 ) )
            {
            // InternalGeometry.g:2421:1: ( ( rule__Mesh__FilenameAssignment_3 ) )
            // InternalGeometry.g:2422:2: ( rule__Mesh__FilenameAssignment_3 )
            {
             before(grammarAccess.getMeshAccess().getFilenameAssignment_3()); 
            // InternalGeometry.g:2423:2: ( rule__Mesh__FilenameAssignment_3 )
            // InternalGeometry.g:2423:3: rule__Mesh__FilenameAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Mesh__FilenameAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getMeshAccess().getFilenameAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mesh__Group__3__Impl"


    // $ANTLR start "rule__Mesh__Group__4"
    // InternalGeometry.g:2431:1: rule__Mesh__Group__4 : rule__Mesh__Group__4__Impl rule__Mesh__Group__5 ;
    public final void rule__Mesh__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGeometry.g:2435:1: ( rule__Mesh__Group__4__Impl rule__Mesh__Group__5 )
            // InternalGeometry.g:2436:2: rule__Mesh__Group__4__Impl rule__Mesh__Group__5
            {
            pushFollow(FOLLOW_28);
            rule__Mesh__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mesh__Group__5();

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
    // $ANTLR end "rule__Mesh__Group__4"


    // $ANTLR start "rule__Mesh__Group__4__Impl"
    // InternalGeometry.g:2443:1: rule__Mesh__Group__4__Impl : ( ( rule__Mesh__Group_4__0 )? ) ;
    public final void rule__Mesh__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGeometry.g:2447:1: ( ( ( rule__Mesh__Group_4__0 )? ) )
            // InternalGeometry.g:2448:1: ( ( rule__Mesh__Group_4__0 )? )
            {
            // InternalGeometry.g:2448:1: ( ( rule__Mesh__Group_4__0 )? )
            // InternalGeometry.g:2449:2: ( rule__Mesh__Group_4__0 )?
            {
             before(grammarAccess.getMeshAccess().getGroup_4()); 
            // InternalGeometry.g:2450:2: ( rule__Mesh__Group_4__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==45) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalGeometry.g:2450:3: rule__Mesh__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Mesh__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMeshAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mesh__Group__4__Impl"


    // $ANTLR start "rule__Mesh__Group__5"
    // InternalGeometry.g:2458:1: rule__Mesh__Group__5 : rule__Mesh__Group__5__Impl ;
    public final void rule__Mesh__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGeometry.g:2462:1: ( rule__Mesh__Group__5__Impl )
            // InternalGeometry.g:2463:2: rule__Mesh__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Mesh__Group__5__Impl();

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
    // $ANTLR end "rule__Mesh__Group__5"


    // $ANTLR start "rule__Mesh__Group__5__Impl"
    // InternalGeometry.g:2469:1: rule__Mesh__Group__5__Impl : ( '}' ) ;
    public final void rule__Mesh__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGeometry.g:2473:1: ( ( '}' ) )
            // InternalGeometry.g:2474:1: ( '}' )
            {
            // InternalGeometry.g:2474:1: ( '}' )
            // InternalGeometry.g:2475:2: '}'
            {
             before(grammarAccess.getMeshAccess().getRightCurlyBracketKeyword_5()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getMeshAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mesh__Group__5__Impl"


    // $ANTLR start "rule__Mesh__Group_4__0"
    // InternalGeometry.g:2485:1: rule__Mesh__Group_4__0 : rule__Mesh__Group_4__0__Impl rule__Mesh__Group_4__1 ;
    public final void rule__Mesh__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGeometry.g:2489:1: ( rule__Mesh__Group_4__0__Impl rule__Mesh__Group_4__1 )
            // InternalGeometry.g:2490:2: rule__Mesh__Group_4__0__Impl rule__Mesh__Group_4__1
            {
            pushFollow(FOLLOW_22);
            rule__Mesh__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mesh__Group_4__1();

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
    // $ANTLR end "rule__Mesh__Group_4__0"


    // $ANTLR start "rule__Mesh__Group_4__0__Impl"
    // InternalGeometry.g:2497:1: rule__Mesh__Group_4__0__Impl : ( 'scale' ) ;
    public final void rule__Mesh__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGeometry.g:2501:1: ( ( 'scale' ) )
            // InternalGeometry.g:2502:1: ( 'scale' )
            {
            // InternalGeometry.g:2502:1: ( 'scale' )
            // InternalGeometry.g:2503:2: 'scale'
            {
             before(grammarAccess.getMeshAccess().getScaleKeyword_4_0()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getMeshAccess().getScaleKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mesh__Group_4__0__Impl"


    // $ANTLR start "rule__Mesh__Group_4__1"
    // InternalGeometry.g:2512:1: rule__Mesh__Group_4__1 : rule__Mesh__Group_4__1__Impl ;
    public final void rule__Mesh__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGeometry.g:2516:1: ( rule__Mesh__Group_4__1__Impl )
            // InternalGeometry.g:2517:2: rule__Mesh__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Mesh__Group_4__1__Impl();

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
    // $ANTLR end "rule__Mesh__Group_4__1"


    // $ANTLR start "rule__Mesh__Group_4__1__Impl"
    // InternalGeometry.g:2523:1: rule__Mesh__Group_4__1__Impl : ( ( rule__Mesh__ScaleAssignment_4_1 ) ) ;
    public final void rule__Mesh__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGeometry.g:2527:1: ( ( ( rule__Mesh__ScaleAssignment_4_1 ) ) )
            // InternalGeometry.g:2528:1: ( ( rule__Mesh__ScaleAssignment_4_1 ) )
            {
            // InternalGeometry.g:2528:1: ( ( rule__Mesh__ScaleAssignment_4_1 ) )
            // InternalGeometry.g:2529:2: ( rule__Mesh__ScaleAssignment_4_1 )
            {
             before(grammarAccess.getMeshAccess().getScaleAssignment_4_1()); 
            // InternalGeometry.g:2530:2: ( rule__Mesh__ScaleAssignment_4_1 )
            // InternalGeometry.g:2530:3: rule__Mesh__ScaleAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Mesh__ScaleAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getMeshAccess().getScaleAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mesh__Group_4__1__Impl"


    // $ANTLR start "rule__Sphere__Group__0"
    // InternalGeometry.g:2539:1: rule__Sphere__Group__0 : rule__Sphere__Group__0__Impl rule__Sphere__Group__1 ;
    public final void rule__Sphere__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGeometry.g:2543:1: ( rule__Sphere__Group__0__Impl rule__Sphere__Group__1 )
            // InternalGeometry.g:2544:2: rule__Sphere__Group__0__Impl rule__Sphere__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Sphere__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Sphere__Group__1();

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
    // $ANTLR end "rule__Sphere__Group__0"


    // $ANTLR start "rule__Sphere__Group__0__Impl"
    // InternalGeometry.g:2551:1: rule__Sphere__Group__0__Impl : ( 'Sphere' ) ;
    public final void rule__Sphere__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGeometry.g:2555:1: ( ( 'Sphere' ) )
            // InternalGeometry.g:2556:1: ( 'Sphere' )
            {
            // InternalGeometry.g:2556:1: ( 'Sphere' )
            // InternalGeometry.g:2557:2: 'Sphere'
            {
             before(grammarAccess.getSphereAccess().getSphereKeyword_0()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getSphereAccess().getSphereKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sphere__Group__0__Impl"


    // $ANTLR start "rule__Sphere__Group__1"
    // InternalGeometry.g:2566:1: rule__Sphere__Group__1 : rule__Sphere__Group__1__Impl rule__Sphere__Group__2 ;
    public final void rule__Sphere__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGeometry.g:2570:1: ( rule__Sphere__Group__1__Impl rule__Sphere__Group__2 )
            // InternalGeometry.g:2571:2: rule__Sphere__Group__1__Impl rule__Sphere__Group__2
            {
            pushFollow(FOLLOW_26);
            rule__Sphere__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Sphere__Group__2();

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
    // $ANTLR end "rule__Sphere__Group__1"


    // $ANTLR start "rule__Sphere__Group__1__Impl"
    // InternalGeometry.g:2578:1: rule__Sphere__Group__1__Impl : ( '{' ) ;
    public final void rule__Sphere__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGeometry.g:2582:1: ( ( '{' ) )
            // InternalGeometry.g:2583:1: ( '{' )
            {
            // InternalGeometry.g:2583:1: ( '{' )
            // InternalGeometry.g:2584:2: '{'
            {
             before(grammarAccess.getSphereAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getSphereAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sphere__Group__1__Impl"


    // $ANTLR start "rule__Sphere__Group__2"
    // InternalGeometry.g:2593:1: rule__Sphere__Group__2 : rule__Sphere__Group__2__Impl rule__Sphere__Group__3 ;
    public final void rule__Sphere__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGeometry.g:2597:1: ( rule__Sphere__Group__2__Impl rule__Sphere__Group__3 )
            // InternalGeometry.g:2598:2: rule__Sphere__Group__2__Impl rule__Sphere__Group__3
            {
            pushFollow(FOLLOW_22);
            rule__Sphere__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Sphere__Group__3();

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
    // $ANTLR end "rule__Sphere__Group__2"


    // $ANTLR start "rule__Sphere__Group__2__Impl"
    // InternalGeometry.g:2605:1: rule__Sphere__Group__2__Impl : ( 'radius' ) ;
    public final void rule__Sphere__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGeometry.g:2609:1: ( ( 'radius' ) )
            // InternalGeometry.g:2610:1: ( 'radius' )
            {
            // InternalGeometry.g:2610:1: ( 'radius' )
            // InternalGeometry.g:2611:2: 'radius'
            {
             before(grammarAccess.getSphereAccess().getRadiusKeyword_2()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getSphereAccess().getRadiusKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sphere__Group__2__Impl"


    // $ANTLR start "rule__Sphere__Group__3"
    // InternalGeometry.g:2620:1: rule__Sphere__Group__3 : rule__Sphere__Group__3__Impl rule__Sphere__Group__4 ;
    public final void rule__Sphere__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGeometry.g:2624:1: ( rule__Sphere__Group__3__Impl rule__Sphere__Group__4 )
            // InternalGeometry.g:2625:2: rule__Sphere__Group__3__Impl rule__Sphere__Group__4
            {
            pushFollow(FOLLOW_15);
            rule__Sphere__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Sphere__Group__4();

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
    // $ANTLR end "rule__Sphere__Group__3"


    // $ANTLR start "rule__Sphere__Group__3__Impl"
    // InternalGeometry.g:2632:1: rule__Sphere__Group__3__Impl : ( ( rule__Sphere__RadiusAssignment_3 ) ) ;
    public final void rule__Sphere__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGeometry.g:2636:1: ( ( ( rule__Sphere__RadiusAssignment_3 ) ) )
            // InternalGeometry.g:2637:1: ( ( rule__Sphere__RadiusAssignment_3 ) )
            {
            // InternalGeometry.g:2637:1: ( ( rule__Sphere__RadiusAssignment_3 ) )
            // InternalGeometry.g:2638:2: ( rule__Sphere__RadiusAssignment_3 )
            {
             before(grammarAccess.getSphereAccess().getRadiusAssignment_3()); 
            // InternalGeometry.g:2639:2: ( rule__Sphere__RadiusAssignment_3 )
            // InternalGeometry.g:2639:3: rule__Sphere__RadiusAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Sphere__RadiusAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getSphereAccess().getRadiusAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sphere__Group__3__Impl"


    // $ANTLR start "rule__Sphere__Group__4"
    // InternalGeometry.g:2647:1: rule__Sphere__Group__4 : rule__Sphere__Group__4__Impl ;
    public final void rule__Sphere__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGeometry.g:2651:1: ( rule__Sphere__Group__4__Impl )
            // InternalGeometry.g:2652:2: rule__Sphere__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Sphere__Group__4__Impl();

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
    // $ANTLR end "rule__Sphere__Group__4"


    // $ANTLR start "rule__Sphere__Group__4__Impl"
    // InternalGeometry.g:2658:1: rule__Sphere__Group__4__Impl : ( '}' ) ;
    public final void rule__Sphere__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGeometry.g:2662:1: ( ( '}' ) )
            // InternalGeometry.g:2663:1: ( '}' )
            {
            // InternalGeometry.g:2663:1: ( '}' )
            // InternalGeometry.g:2664:2: '}'
            {
             before(grammarAccess.getSphereAccess().getRightCurlyBracketKeyword_4()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getSphereAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sphere__Group__4__Impl"


    // $ANTLR start "rule__LinkGeometry__RefAssignment_3"
    // InternalGeometry.g:2674:1: rule__LinkGeometry__RefAssignment_3 : ( ( ruleEString ) ) ;
    public final void rule__LinkGeometry__RefAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGeometry.g:2678:1: ( ( ( ruleEString ) ) )
            // InternalGeometry.g:2679:2: ( ( ruleEString ) )
            {
            // InternalGeometry.g:2679:2: ( ( ruleEString ) )
            // InternalGeometry.g:2680:3: ( ruleEString )
            {
             before(grammarAccess.getLinkGeometryAccess().getRefLinkCrossReference_3_0()); 
            // InternalGeometry.g:2681:3: ( ruleEString )
            // InternalGeometry.g:2682:4: ruleEString
            {
             before(grammarAccess.getLinkGeometryAccess().getRefLinkEStringParserRuleCall_3_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getLinkGeometryAccess().getRefLinkEStringParserRuleCall_3_0_1()); 

            }

             after(grammarAccess.getLinkGeometryAccess().getRefLinkCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LinkGeometry__RefAssignment_3"


    // $ANTLR start "rule__LinkGeometry__VisualAssignment_4_1"
    // InternalGeometry.g:2693:1: rule__LinkGeometry__VisualAssignment_4_1 : ( ruleVisual ) ;
    public final void rule__LinkGeometry__VisualAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGeometry.g:2697:1: ( ( ruleVisual ) )
            // InternalGeometry.g:2698:2: ( ruleVisual )
            {
            // InternalGeometry.g:2698:2: ( ruleVisual )
            // InternalGeometry.g:2699:3: ruleVisual
            {
             before(grammarAccess.getLinkGeometryAccess().getVisualVisualParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleVisual();

            state._fsp--;

             after(grammarAccess.getLinkGeometryAccess().getVisualVisualParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LinkGeometry__VisualAssignment_4_1"


    // $ANTLR start "rule__LinkGeometry__CollisionAssignment_5_1"
    // InternalGeometry.g:2708:1: rule__LinkGeometry__CollisionAssignment_5_1 : ( ruleCollision ) ;
    public final void rule__LinkGeometry__CollisionAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGeometry.g:2712:1: ( ( ruleCollision ) )
            // InternalGeometry.g:2713:2: ( ruleCollision )
            {
            // InternalGeometry.g:2713:2: ( ruleCollision )
            // InternalGeometry.g:2714:3: ruleCollision
            {
             before(grammarAccess.getLinkGeometryAccess().getCollisionCollisionParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleCollision();

            state._fsp--;

             after(grammarAccess.getLinkGeometryAccess().getCollisionCollisionParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LinkGeometry__CollisionAssignment_5_1"


    // $ANTLR start "rule__Visual__OriginAssignment_3_1"
    // InternalGeometry.g:2723:1: rule__Visual__OriginAssignment_3_1 : ( rulePose ) ;
    public final void rule__Visual__OriginAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGeometry.g:2727:1: ( ( rulePose ) )
            // InternalGeometry.g:2728:2: ( rulePose )
            {
            // InternalGeometry.g:2728:2: ( rulePose )
            // InternalGeometry.g:2729:3: rulePose
            {
             before(grammarAccess.getVisualAccess().getOriginPoseParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            rulePose();

            state._fsp--;

             after(grammarAccess.getVisualAccess().getOriginPoseParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Visual__OriginAssignment_3_1"


    // $ANTLR start "rule__Visual__GeometryAssignment_4_1"
    // InternalGeometry.g:2738:1: rule__Visual__GeometryAssignment_4_1 : ( ruleGeometry ) ;
    public final void rule__Visual__GeometryAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGeometry.g:2742:1: ( ( ruleGeometry ) )
            // InternalGeometry.g:2743:2: ( ruleGeometry )
            {
            // InternalGeometry.g:2743:2: ( ruleGeometry )
            // InternalGeometry.g:2744:3: ruleGeometry
            {
             before(grammarAccess.getVisualAccess().getGeometryGeometryParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleGeometry();

            state._fsp--;

             after(grammarAccess.getVisualAccess().getGeometryGeometryParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Visual__GeometryAssignment_4_1"


    // $ANTLR start "rule__Collision__OriginAssignment_3_1"
    // InternalGeometry.g:2753:1: rule__Collision__OriginAssignment_3_1 : ( rulePose ) ;
    public final void rule__Collision__OriginAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGeometry.g:2757:1: ( ( rulePose ) )
            // InternalGeometry.g:2758:2: ( rulePose )
            {
            // InternalGeometry.g:2758:2: ( rulePose )
            // InternalGeometry.g:2759:3: rulePose
            {
             before(grammarAccess.getCollisionAccess().getOriginPoseParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            rulePose();

            state._fsp--;

             after(grammarAccess.getCollisionAccess().getOriginPoseParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Collision__OriginAssignment_3_1"


    // $ANTLR start "rule__Collision__GeometryAssignment_4_1"
    // InternalGeometry.g:2768:1: rule__Collision__GeometryAssignment_4_1 : ( ruleGeometry ) ;
    public final void rule__Collision__GeometryAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGeometry.g:2772:1: ( ( ruleGeometry ) )
            // InternalGeometry.g:2773:2: ( ruleGeometry )
            {
            // InternalGeometry.g:2773:2: ( ruleGeometry )
            // InternalGeometry.g:2774:3: ruleGeometry
            {
             before(grammarAccess.getCollisionAccess().getGeometryGeometryParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleGeometry();

            state._fsp--;

             after(grammarAccess.getCollisionAccess().getGeometryGeometryParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Collision__GeometryAssignment_4_1"


    // $ANTLR start "rule__Pose__ValueAssignment_2_1"
    // InternalGeometry.g:2783:1: rule__Pose__ValueAssignment_2_1 : ( ruleString0 ) ;
    public final void rule__Pose__ValueAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGeometry.g:2787:1: ( ( ruleString0 ) )
            // InternalGeometry.g:2788:2: ( ruleString0 )
            {
            // InternalGeometry.g:2788:2: ( ruleString0 )
            // InternalGeometry.g:2789:3: ruleString0
            {
             before(grammarAccess.getPoseAccess().getValueString0ParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleString0();

            state._fsp--;

             after(grammarAccess.getPoseAccess().getValueString0ParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pose__ValueAssignment_2_1"


    // $ANTLR start "rule__Pose__RpyAssignment_4"
    // InternalGeometry.g:2798:1: rule__Pose__RpyAssignment_4 : ( ruleString0 ) ;
    public final void rule__Pose__RpyAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGeometry.g:2802:1: ( ( ruleString0 ) )
            // InternalGeometry.g:2803:2: ( ruleString0 )
            {
            // InternalGeometry.g:2803:2: ( ruleString0 )
            // InternalGeometry.g:2804:3: ruleString0
            {
             before(grammarAccess.getPoseAccess().getRpyString0ParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleString0();

            state._fsp--;

             after(grammarAccess.getPoseAccess().getRpyString0ParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pose__RpyAssignment_4"


    // $ANTLR start "rule__Pose__XyzAssignment_6"
    // InternalGeometry.g:2813:1: rule__Pose__XyzAssignment_6 : ( ruleString0 ) ;
    public final void rule__Pose__XyzAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGeometry.g:2817:1: ( ( ruleString0 ) )
            // InternalGeometry.g:2818:2: ( ruleString0 )
            {
            // InternalGeometry.g:2818:2: ( ruleString0 )
            // InternalGeometry.g:2819:3: ruleString0
            {
             before(grammarAccess.getPoseAccess().getXyzString0ParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleString0();

            state._fsp--;

             after(grammarAccess.getPoseAccess().getXyzString0ParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pose__XyzAssignment_6"


    // $ANTLR start "rule__Geometry__BoxAssignment_3_1"
    // InternalGeometry.g:2828:1: rule__Geometry__BoxAssignment_3_1 : ( ruleBox ) ;
    public final void rule__Geometry__BoxAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGeometry.g:2832:1: ( ( ruleBox ) )
            // InternalGeometry.g:2833:2: ( ruleBox )
            {
            // InternalGeometry.g:2833:2: ( ruleBox )
            // InternalGeometry.g:2834:3: ruleBox
            {
             before(grammarAccess.getGeometryAccess().getBoxBoxParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleBox();

            state._fsp--;

             after(grammarAccess.getGeometryAccess().getBoxBoxParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Geometry__BoxAssignment_3_1"


    // $ANTLR start "rule__Geometry__CylinderAssignment_4_1"
    // InternalGeometry.g:2843:1: rule__Geometry__CylinderAssignment_4_1 : ( ruleCylinder ) ;
    public final void rule__Geometry__CylinderAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGeometry.g:2847:1: ( ( ruleCylinder ) )
            // InternalGeometry.g:2848:2: ( ruleCylinder )
            {
            // InternalGeometry.g:2848:2: ( ruleCylinder )
            // InternalGeometry.g:2849:3: ruleCylinder
            {
             before(grammarAccess.getGeometryAccess().getCylinderCylinderParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleCylinder();

            state._fsp--;

             after(grammarAccess.getGeometryAccess().getCylinderCylinderParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Geometry__CylinderAssignment_4_1"


    // $ANTLR start "rule__Geometry__MeshAssignment_5_1"
    // InternalGeometry.g:2858:1: rule__Geometry__MeshAssignment_5_1 : ( ruleMesh ) ;
    public final void rule__Geometry__MeshAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGeometry.g:2862:1: ( ( ruleMesh ) )
            // InternalGeometry.g:2863:2: ( ruleMesh )
            {
            // InternalGeometry.g:2863:2: ( ruleMesh )
            // InternalGeometry.g:2864:3: ruleMesh
            {
             before(grammarAccess.getGeometryAccess().getMeshMeshParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleMesh();

            state._fsp--;

             after(grammarAccess.getGeometryAccess().getMeshMeshParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Geometry__MeshAssignment_5_1"


    // $ANTLR start "rule__Geometry__SphereAssignment_6_1"
    // InternalGeometry.g:2873:1: rule__Geometry__SphereAssignment_6_1 : ( ruleSphere ) ;
    public final void rule__Geometry__SphereAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGeometry.g:2877:1: ( ( ruleSphere ) )
            // InternalGeometry.g:2878:2: ( ruleSphere )
            {
            // InternalGeometry.g:2878:2: ( ruleSphere )
            // InternalGeometry.g:2879:3: ruleSphere
            {
             before(grammarAccess.getGeometryAccess().getSphereSphereParserRuleCall_6_1_0()); 
            pushFollow(FOLLOW_2);
            ruleSphere();

            state._fsp--;

             after(grammarAccess.getGeometryAccess().getSphereSphereParserRuleCall_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Geometry__SphereAssignment_6_1"


    // $ANTLR start "rule__Box__XAssignment_3"
    // InternalGeometry.g:2888:1: rule__Box__XAssignment_3 : ( ruleDouble0 ) ;
    public final void rule__Box__XAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGeometry.g:2892:1: ( ( ruleDouble0 ) )
            // InternalGeometry.g:2893:2: ( ruleDouble0 )
            {
            // InternalGeometry.g:2893:2: ( ruleDouble0 )
            // InternalGeometry.g:2894:3: ruleDouble0
            {
             before(grammarAccess.getBoxAccess().getXDouble0ParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleDouble0();

            state._fsp--;

             after(grammarAccess.getBoxAccess().getXDouble0ParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Box__XAssignment_3"


    // $ANTLR start "rule__Box__YAssignment_5"
    // InternalGeometry.g:2903:1: rule__Box__YAssignment_5 : ( ruleDouble0 ) ;
    public final void rule__Box__YAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGeometry.g:2907:1: ( ( ruleDouble0 ) )
            // InternalGeometry.g:2908:2: ( ruleDouble0 )
            {
            // InternalGeometry.g:2908:2: ( ruleDouble0 )
            // InternalGeometry.g:2909:3: ruleDouble0
            {
             before(grammarAccess.getBoxAccess().getYDouble0ParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleDouble0();

            state._fsp--;

             after(grammarAccess.getBoxAccess().getYDouble0ParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Box__YAssignment_5"


    // $ANTLR start "rule__Box__ZAssignment_7"
    // InternalGeometry.g:2918:1: rule__Box__ZAssignment_7 : ( ruleDouble0 ) ;
    public final void rule__Box__ZAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGeometry.g:2922:1: ( ( ruleDouble0 ) )
            // InternalGeometry.g:2923:2: ( ruleDouble0 )
            {
            // InternalGeometry.g:2923:2: ( ruleDouble0 )
            // InternalGeometry.g:2924:3: ruleDouble0
            {
             before(grammarAccess.getBoxAccess().getZDouble0ParserRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            ruleDouble0();

            state._fsp--;

             after(grammarAccess.getBoxAccess().getZDouble0ParserRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Box__ZAssignment_7"


    // $ANTLR start "rule__Cylinder__LengthAssignment_3"
    // InternalGeometry.g:2933:1: rule__Cylinder__LengthAssignment_3 : ( ruleDouble0 ) ;
    public final void rule__Cylinder__LengthAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGeometry.g:2937:1: ( ( ruleDouble0 ) )
            // InternalGeometry.g:2938:2: ( ruleDouble0 )
            {
            // InternalGeometry.g:2938:2: ( ruleDouble0 )
            // InternalGeometry.g:2939:3: ruleDouble0
            {
             before(grammarAccess.getCylinderAccess().getLengthDouble0ParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleDouble0();

            state._fsp--;

             after(grammarAccess.getCylinderAccess().getLengthDouble0ParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cylinder__LengthAssignment_3"


    // $ANTLR start "rule__Cylinder__RadiusAssignment_5"
    // InternalGeometry.g:2948:1: rule__Cylinder__RadiusAssignment_5 : ( ruleDouble0 ) ;
    public final void rule__Cylinder__RadiusAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGeometry.g:2952:1: ( ( ruleDouble0 ) )
            // InternalGeometry.g:2953:2: ( ruleDouble0 )
            {
            // InternalGeometry.g:2953:2: ( ruleDouble0 )
            // InternalGeometry.g:2954:3: ruleDouble0
            {
             before(grammarAccess.getCylinderAccess().getRadiusDouble0ParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleDouble0();

            state._fsp--;

             after(grammarAccess.getCylinderAccess().getRadiusDouble0ParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cylinder__RadiusAssignment_5"


    // $ANTLR start "rule__Mesh__FilenameAssignment_3"
    // InternalGeometry.g:2963:1: rule__Mesh__FilenameAssignment_3 : ( ruleString0 ) ;
    public final void rule__Mesh__FilenameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGeometry.g:2967:1: ( ( ruleString0 ) )
            // InternalGeometry.g:2968:2: ( ruleString0 )
            {
            // InternalGeometry.g:2968:2: ( ruleString0 )
            // InternalGeometry.g:2969:3: ruleString0
            {
             before(grammarAccess.getMeshAccess().getFilenameString0ParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleString0();

            state._fsp--;

             after(grammarAccess.getMeshAccess().getFilenameString0ParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mesh__FilenameAssignment_3"


    // $ANTLR start "rule__Mesh__ScaleAssignment_4_1"
    // InternalGeometry.g:2978:1: rule__Mesh__ScaleAssignment_4_1 : ( ruleDouble0 ) ;
    public final void rule__Mesh__ScaleAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGeometry.g:2982:1: ( ( ruleDouble0 ) )
            // InternalGeometry.g:2983:2: ( ruleDouble0 )
            {
            // InternalGeometry.g:2983:2: ( ruleDouble0 )
            // InternalGeometry.g:2984:3: ruleDouble0
            {
             before(grammarAccess.getMeshAccess().getScaleDouble0ParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleDouble0();

            state._fsp--;

             after(grammarAccess.getMeshAccess().getScaleDouble0ParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mesh__ScaleAssignment_4_1"


    // $ANTLR start "rule__Sphere__RadiusAssignment_3"
    // InternalGeometry.g:2993:1: rule__Sphere__RadiusAssignment_3 : ( ruleDouble0 ) ;
    public final void rule__Sphere__RadiusAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGeometry.g:2997:1: ( ( ruleDouble0 ) )
            // InternalGeometry.g:2998:2: ( ruleDouble0 )
            {
            // InternalGeometry.g:2998:2: ( ruleDouble0 )
            // InternalGeometry.g:2999:3: ruleDouble0
            {
             before(grammarAccess.getSphereAccess().getRadiusDouble0ParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleDouble0();

            state._fsp--;

             after(grammarAccess.getSphereAccess().getRadiusDouble0ParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sphere__RadiusAssignment_3"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000700000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000003100000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000050000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000F00100000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000200000100000L});

}