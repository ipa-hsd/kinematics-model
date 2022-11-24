package de.fraunhofer.ipa.kinematics.ide.contentassist.antlr.internal;

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
import de.fraunhofer.ipa.kinematics.services.KinematicsGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalKinematicsParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_DOUBLE", "RULE_STRING", "RULE_ID", "RULE_DIGIT", "RULE_BOOLEAN", "RULE_DECINT", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'fixed'", "'prismatic'", "'revolute'", "'Joint'", "'{'", "'type'", "'parent'", "'origin'", "'}'", "'child'", "'limit'", "'axis'", "'Pose'", "'x'", "'y'", "'z'", "'roll'", "'pitch'", "'yaw'", "'Limit'", "'effort'", "'velocity'", "'lower'", "'upper'", "'Axis'"
    };
    public static final int RULE_BOOLEAN=8;
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=12;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__37=37;
    public static final int RULE_DOUBLE=4;
    public static final int T__16=16;
    public static final int T__38=38;
    public static final int T__17=17;
    public static final int T__39=39;
    public static final int T__18=18;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int RULE_DECINT=9;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=6;
    public static final int RULE_WS=13;
    public static final int RULE_DIGIT=7;
    public static final int RULE_ANY_OTHER=14;
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

    // delegates
    // delegators


        public InternalKinematicsParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalKinematicsParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalKinematicsParser.tokenNames; }
    public String getGrammarFileName() { return "InternalKinematics.g"; }


    	private KinematicsGrammarAccess grammarAccess;

    	public void setGrammarAccess(KinematicsGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleJoint"
    // InternalKinematics.g:53:1: entryRuleJoint : ruleJoint EOF ;
    public final void entryRuleJoint() throws RecognitionException {
        try {
            // InternalKinematics.g:54:1: ( ruleJoint EOF )
            // InternalKinematics.g:55:1: ruleJoint EOF
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
    // InternalKinematics.g:62:1: ruleJoint : ( ( rule__Joint__Group__0 ) ) ;
    public final void ruleJoint() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:66:2: ( ( ( rule__Joint__Group__0 ) ) )
            // InternalKinematics.g:67:2: ( ( rule__Joint__Group__0 ) )
            {
            // InternalKinematics.g:67:2: ( ( rule__Joint__Group__0 ) )
            // InternalKinematics.g:68:3: ( rule__Joint__Group__0 )
            {
             before(grammarAccess.getJointAccess().getGroup()); 
            // InternalKinematics.g:69:3: ( rule__Joint__Group__0 )
            // InternalKinematics.g:69:4: rule__Joint__Group__0
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


    // $ANTLR start "entryRulePose"
    // InternalKinematics.g:78:1: entryRulePose : rulePose EOF ;
    public final void entryRulePose() throws RecognitionException {
        try {
            // InternalKinematics.g:79:1: ( rulePose EOF )
            // InternalKinematics.g:80:1: rulePose EOF
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
    // InternalKinematics.g:87:1: rulePose : ( ( rule__Pose__Group__0 ) ) ;
    public final void rulePose() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:91:2: ( ( ( rule__Pose__Group__0 ) ) )
            // InternalKinematics.g:92:2: ( ( rule__Pose__Group__0 ) )
            {
            // InternalKinematics.g:92:2: ( ( rule__Pose__Group__0 ) )
            // InternalKinematics.g:93:3: ( rule__Pose__Group__0 )
            {
             before(grammarAccess.getPoseAccess().getGroup()); 
            // InternalKinematics.g:94:3: ( rule__Pose__Group__0 )
            // InternalKinematics.g:94:4: rule__Pose__Group__0
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
    // InternalKinematics.g:103:1: entryRuleLimit : ruleLimit EOF ;
    public final void entryRuleLimit() throws RecognitionException {
        try {
            // InternalKinematics.g:104:1: ( ruleLimit EOF )
            // InternalKinematics.g:105:1: ruleLimit EOF
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
    // InternalKinematics.g:112:1: ruleLimit : ( ( rule__Limit__Group__0 ) ) ;
    public final void ruleLimit() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:116:2: ( ( ( rule__Limit__Group__0 ) ) )
            // InternalKinematics.g:117:2: ( ( rule__Limit__Group__0 ) )
            {
            // InternalKinematics.g:117:2: ( ( rule__Limit__Group__0 ) )
            // InternalKinematics.g:118:3: ( rule__Limit__Group__0 )
            {
             before(grammarAccess.getLimitAccess().getGroup()); 
            // InternalKinematics.g:119:3: ( rule__Limit__Group__0 )
            // InternalKinematics.g:119:4: rule__Limit__Group__0
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
    // InternalKinematics.g:128:1: entryRuleAxis : ruleAxis EOF ;
    public final void entryRuleAxis() throws RecognitionException {
        try {
            // InternalKinematics.g:129:1: ( ruleAxis EOF )
            // InternalKinematics.g:130:1: ruleAxis EOF
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
    // InternalKinematics.g:137:1: ruleAxis : ( ( rule__Axis__Group__0 ) ) ;
    public final void ruleAxis() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:141:2: ( ( ( rule__Axis__Group__0 ) ) )
            // InternalKinematics.g:142:2: ( ( rule__Axis__Group__0 ) )
            {
            // InternalKinematics.g:142:2: ( ( rule__Axis__Group__0 ) )
            // InternalKinematics.g:143:3: ( rule__Axis__Group__0 )
            {
             before(grammarAccess.getAxisAccess().getGroup()); 
            // InternalKinematics.g:144:3: ( rule__Axis__Group__0 )
            // InternalKinematics.g:144:4: rule__Axis__Group__0
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
    // InternalKinematics.g:153:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalKinematics.g:154:1: ( ruleEString EOF )
            // InternalKinematics.g:155:1: ruleEString EOF
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
    // InternalKinematics.g:162:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:166:2: ( ( ( rule__EString__Alternatives ) ) )
            // InternalKinematics.g:167:2: ( ( rule__EString__Alternatives ) )
            {
            // InternalKinematics.g:167:2: ( ( rule__EString__Alternatives ) )
            // InternalKinematics.g:168:3: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // InternalKinematics.g:169:3: ( rule__EString__Alternatives )
            // InternalKinematics.g:169:4: rule__EString__Alternatives
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
    // InternalKinematics.g:178:1: entryRuleEDouble : ruleEDouble EOF ;
    public final void entryRuleEDouble() throws RecognitionException {
        try {
            // InternalKinematics.g:179:1: ( ruleEDouble EOF )
            // InternalKinematics.g:180:1: ruleEDouble EOF
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
    // InternalKinematics.g:187:1: ruleEDouble : ( RULE_DOUBLE ) ;
    public final void ruleEDouble() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:191:2: ( ( RULE_DOUBLE ) )
            // InternalKinematics.g:192:2: ( RULE_DOUBLE )
            {
            // InternalKinematics.g:192:2: ( RULE_DOUBLE )
            // InternalKinematics.g:193:3: RULE_DOUBLE
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
    // InternalKinematics.g:203:1: ruleJointType : ( ( rule__JointType__Alternatives ) ) ;
    public final void ruleJointType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:207:1: ( ( ( rule__JointType__Alternatives ) ) )
            // InternalKinematics.g:208:2: ( ( rule__JointType__Alternatives ) )
            {
            // InternalKinematics.g:208:2: ( ( rule__JointType__Alternatives ) )
            // InternalKinematics.g:209:3: ( rule__JointType__Alternatives )
            {
             before(grammarAccess.getJointTypeAccess().getAlternatives()); 
            // InternalKinematics.g:210:3: ( rule__JointType__Alternatives )
            // InternalKinematics.g:210:4: rule__JointType__Alternatives
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


    // $ANTLR start "rule__EString__Alternatives"
    // InternalKinematics.g:218:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:222:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_STRING) ) {
                alt1=1;
            }
            else if ( (LA1_0==RULE_ID) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalKinematics.g:223:2: ( RULE_STRING )
                    {
                    // InternalKinematics.g:223:2: ( RULE_STRING )
                    // InternalKinematics.g:224:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalKinematics.g:229:2: ( RULE_ID )
                    {
                    // InternalKinematics.g:229:2: ( RULE_ID )
                    // InternalKinematics.g:230:3: RULE_ID
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
    // InternalKinematics.g:239:1: rule__JointType__Alternatives : ( ( ( 'fixed' ) ) | ( ( 'prismatic' ) ) | ( ( 'revolute' ) ) );
    public final void rule__JointType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:243:1: ( ( ( 'fixed' ) ) | ( ( 'prismatic' ) ) | ( ( 'revolute' ) ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 15:
                {
                alt2=1;
                }
                break;
            case 16:
                {
                alt2=2;
                }
                break;
            case 17:
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalKinematics.g:244:2: ( ( 'fixed' ) )
                    {
                    // InternalKinematics.g:244:2: ( ( 'fixed' ) )
                    // InternalKinematics.g:245:3: ( 'fixed' )
                    {
                     before(grammarAccess.getJointTypeAccess().getFixedEnumLiteralDeclaration_0()); 
                    // InternalKinematics.g:246:3: ( 'fixed' )
                    // InternalKinematics.g:246:4: 'fixed'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getJointTypeAccess().getFixedEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalKinematics.g:250:2: ( ( 'prismatic' ) )
                    {
                    // InternalKinematics.g:250:2: ( ( 'prismatic' ) )
                    // InternalKinematics.g:251:3: ( 'prismatic' )
                    {
                     before(grammarAccess.getJointTypeAccess().getPrismaticEnumLiteralDeclaration_1()); 
                    // InternalKinematics.g:252:3: ( 'prismatic' )
                    // InternalKinematics.g:252:4: 'prismatic'
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getJointTypeAccess().getPrismaticEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalKinematics.g:256:2: ( ( 'revolute' ) )
                    {
                    // InternalKinematics.g:256:2: ( ( 'revolute' ) )
                    // InternalKinematics.g:257:3: ( 'revolute' )
                    {
                     before(grammarAccess.getJointTypeAccess().getRevoluteEnumLiteralDeclaration_2()); 
                    // InternalKinematics.g:258:3: ( 'revolute' )
                    // InternalKinematics.g:258:4: 'revolute'
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


    // $ANTLR start "rule__Joint__Group__0"
    // InternalKinematics.g:266:1: rule__Joint__Group__0 : rule__Joint__Group__0__Impl rule__Joint__Group__1 ;
    public final void rule__Joint__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:270:1: ( rule__Joint__Group__0__Impl rule__Joint__Group__1 )
            // InternalKinematics.g:271:2: rule__Joint__Group__0__Impl rule__Joint__Group__1
            {
            pushFollow(FOLLOW_3);
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
    // InternalKinematics.g:278:1: rule__Joint__Group__0__Impl : ( 'Joint' ) ;
    public final void rule__Joint__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:282:1: ( ( 'Joint' ) )
            // InternalKinematics.g:283:1: ( 'Joint' )
            {
            // InternalKinematics.g:283:1: ( 'Joint' )
            // InternalKinematics.g:284:2: 'Joint'
            {
             before(grammarAccess.getJointAccess().getJointKeyword_0()); 
            match(input,18,FOLLOW_2); 
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
    // InternalKinematics.g:293:1: rule__Joint__Group__1 : rule__Joint__Group__1__Impl rule__Joint__Group__2 ;
    public final void rule__Joint__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:297:1: ( rule__Joint__Group__1__Impl rule__Joint__Group__2 )
            // InternalKinematics.g:298:2: rule__Joint__Group__1__Impl rule__Joint__Group__2
            {
            pushFollow(FOLLOW_4);
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
    // InternalKinematics.g:305:1: rule__Joint__Group__1__Impl : ( ( rule__Joint__NameAssignment_1 ) ) ;
    public final void rule__Joint__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:309:1: ( ( ( rule__Joint__NameAssignment_1 ) ) )
            // InternalKinematics.g:310:1: ( ( rule__Joint__NameAssignment_1 ) )
            {
            // InternalKinematics.g:310:1: ( ( rule__Joint__NameAssignment_1 ) )
            // InternalKinematics.g:311:2: ( rule__Joint__NameAssignment_1 )
            {
             before(grammarAccess.getJointAccess().getNameAssignment_1()); 
            // InternalKinematics.g:312:2: ( rule__Joint__NameAssignment_1 )
            // InternalKinematics.g:312:3: rule__Joint__NameAssignment_1
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
    // InternalKinematics.g:320:1: rule__Joint__Group__2 : rule__Joint__Group__2__Impl rule__Joint__Group__3 ;
    public final void rule__Joint__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:324:1: ( rule__Joint__Group__2__Impl rule__Joint__Group__3 )
            // InternalKinematics.g:325:2: rule__Joint__Group__2__Impl rule__Joint__Group__3
            {
            pushFollow(FOLLOW_5);
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
    // InternalKinematics.g:332:1: rule__Joint__Group__2__Impl : ( '{' ) ;
    public final void rule__Joint__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:336:1: ( ( '{' ) )
            // InternalKinematics.g:337:1: ( '{' )
            {
            // InternalKinematics.g:337:1: ( '{' )
            // InternalKinematics.g:338:2: '{'
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
    // InternalKinematics.g:347:1: rule__Joint__Group__3 : rule__Joint__Group__3__Impl rule__Joint__Group__4 ;
    public final void rule__Joint__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:351:1: ( rule__Joint__Group__3__Impl rule__Joint__Group__4 )
            // InternalKinematics.g:352:2: rule__Joint__Group__3__Impl rule__Joint__Group__4
            {
            pushFollow(FOLLOW_6);
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
    // InternalKinematics.g:359:1: rule__Joint__Group__3__Impl : ( 'type' ) ;
    public final void rule__Joint__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:363:1: ( ( 'type' ) )
            // InternalKinematics.g:364:1: ( 'type' )
            {
            // InternalKinematics.g:364:1: ( 'type' )
            // InternalKinematics.g:365:2: 'type'
            {
             before(grammarAccess.getJointAccess().getTypeKeyword_3()); 
            match(input,20,FOLLOW_2); 
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
    // InternalKinematics.g:374:1: rule__Joint__Group__4 : rule__Joint__Group__4__Impl rule__Joint__Group__5 ;
    public final void rule__Joint__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:378:1: ( rule__Joint__Group__4__Impl rule__Joint__Group__5 )
            // InternalKinematics.g:379:2: rule__Joint__Group__4__Impl rule__Joint__Group__5
            {
            pushFollow(FOLLOW_7);
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
    // InternalKinematics.g:386:1: rule__Joint__Group__4__Impl : ( ( rule__Joint__TypeAssignment_4 ) ) ;
    public final void rule__Joint__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:390:1: ( ( ( rule__Joint__TypeAssignment_4 ) ) )
            // InternalKinematics.g:391:1: ( ( rule__Joint__TypeAssignment_4 ) )
            {
            // InternalKinematics.g:391:1: ( ( rule__Joint__TypeAssignment_4 ) )
            // InternalKinematics.g:392:2: ( rule__Joint__TypeAssignment_4 )
            {
             before(grammarAccess.getJointAccess().getTypeAssignment_4()); 
            // InternalKinematics.g:393:2: ( rule__Joint__TypeAssignment_4 )
            // InternalKinematics.g:393:3: rule__Joint__TypeAssignment_4
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
    // InternalKinematics.g:401:1: rule__Joint__Group__5 : rule__Joint__Group__5__Impl rule__Joint__Group__6 ;
    public final void rule__Joint__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:405:1: ( rule__Joint__Group__5__Impl rule__Joint__Group__6 )
            // InternalKinematics.g:406:2: rule__Joint__Group__5__Impl rule__Joint__Group__6
            {
            pushFollow(FOLLOW_3);
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
    // InternalKinematics.g:413:1: rule__Joint__Group__5__Impl : ( 'parent' ) ;
    public final void rule__Joint__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:417:1: ( ( 'parent' ) )
            // InternalKinematics.g:418:1: ( 'parent' )
            {
            // InternalKinematics.g:418:1: ( 'parent' )
            // InternalKinematics.g:419:2: 'parent'
            {
             before(grammarAccess.getJointAccess().getParentKeyword_5()); 
            match(input,21,FOLLOW_2); 
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
    // InternalKinematics.g:428:1: rule__Joint__Group__6 : rule__Joint__Group__6__Impl rule__Joint__Group__7 ;
    public final void rule__Joint__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:432:1: ( rule__Joint__Group__6__Impl rule__Joint__Group__7 )
            // InternalKinematics.g:433:2: rule__Joint__Group__6__Impl rule__Joint__Group__7
            {
            pushFollow(FOLLOW_8);
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
    // InternalKinematics.g:440:1: rule__Joint__Group__6__Impl : ( ( rule__Joint__ParentAssignment_6 ) ) ;
    public final void rule__Joint__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:444:1: ( ( ( rule__Joint__ParentAssignment_6 ) ) )
            // InternalKinematics.g:445:1: ( ( rule__Joint__ParentAssignment_6 ) )
            {
            // InternalKinematics.g:445:1: ( ( rule__Joint__ParentAssignment_6 ) )
            // InternalKinematics.g:446:2: ( rule__Joint__ParentAssignment_6 )
            {
             before(grammarAccess.getJointAccess().getParentAssignment_6()); 
            // InternalKinematics.g:447:2: ( rule__Joint__ParentAssignment_6 )
            // InternalKinematics.g:447:3: rule__Joint__ParentAssignment_6
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
    // InternalKinematics.g:455:1: rule__Joint__Group__7 : rule__Joint__Group__7__Impl rule__Joint__Group__8 ;
    public final void rule__Joint__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:459:1: ( rule__Joint__Group__7__Impl rule__Joint__Group__8 )
            // InternalKinematics.g:460:2: rule__Joint__Group__7__Impl rule__Joint__Group__8
            {
            pushFollow(FOLLOW_8);
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
    // InternalKinematics.g:467:1: rule__Joint__Group__7__Impl : ( ( rule__Joint__Group_7__0 )? ) ;
    public final void rule__Joint__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:471:1: ( ( ( rule__Joint__Group_7__0 )? ) )
            // InternalKinematics.g:472:1: ( ( rule__Joint__Group_7__0 )? )
            {
            // InternalKinematics.g:472:1: ( ( rule__Joint__Group_7__0 )? )
            // InternalKinematics.g:473:2: ( rule__Joint__Group_7__0 )?
            {
             before(grammarAccess.getJointAccess().getGroup_7()); 
            // InternalKinematics.g:474:2: ( rule__Joint__Group_7__0 )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==24) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalKinematics.g:474:3: rule__Joint__Group_7__0
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
    // InternalKinematics.g:482:1: rule__Joint__Group__8 : rule__Joint__Group__8__Impl rule__Joint__Group__9 ;
    public final void rule__Joint__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:486:1: ( rule__Joint__Group__8__Impl rule__Joint__Group__9 )
            // InternalKinematics.g:487:2: rule__Joint__Group__8__Impl rule__Joint__Group__9
            {
            pushFollow(FOLLOW_9);
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
    // InternalKinematics.g:494:1: rule__Joint__Group__8__Impl : ( 'origin' ) ;
    public final void rule__Joint__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:498:1: ( ( 'origin' ) )
            // InternalKinematics.g:499:1: ( 'origin' )
            {
            // InternalKinematics.g:499:1: ( 'origin' )
            // InternalKinematics.g:500:2: 'origin'
            {
             before(grammarAccess.getJointAccess().getOriginKeyword_8()); 
            match(input,22,FOLLOW_2); 
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
    // InternalKinematics.g:509:1: rule__Joint__Group__9 : rule__Joint__Group__9__Impl rule__Joint__Group__10 ;
    public final void rule__Joint__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:513:1: ( rule__Joint__Group__9__Impl rule__Joint__Group__10 )
            // InternalKinematics.g:514:2: rule__Joint__Group__9__Impl rule__Joint__Group__10
            {
            pushFollow(FOLLOW_10);
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
    // InternalKinematics.g:521:1: rule__Joint__Group__9__Impl : ( ( rule__Joint__OriginAssignment_9 ) ) ;
    public final void rule__Joint__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:525:1: ( ( ( rule__Joint__OriginAssignment_9 ) ) )
            // InternalKinematics.g:526:1: ( ( rule__Joint__OriginAssignment_9 ) )
            {
            // InternalKinematics.g:526:1: ( ( rule__Joint__OriginAssignment_9 ) )
            // InternalKinematics.g:527:2: ( rule__Joint__OriginAssignment_9 )
            {
             before(grammarAccess.getJointAccess().getOriginAssignment_9()); 
            // InternalKinematics.g:528:2: ( rule__Joint__OriginAssignment_9 )
            // InternalKinematics.g:528:3: rule__Joint__OriginAssignment_9
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
    // InternalKinematics.g:536:1: rule__Joint__Group__10 : rule__Joint__Group__10__Impl rule__Joint__Group__11 ;
    public final void rule__Joint__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:540:1: ( rule__Joint__Group__10__Impl rule__Joint__Group__11 )
            // InternalKinematics.g:541:2: rule__Joint__Group__10__Impl rule__Joint__Group__11
            {
            pushFollow(FOLLOW_10);
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
    // InternalKinematics.g:548:1: rule__Joint__Group__10__Impl : ( ( rule__Joint__Group_10__0 )? ) ;
    public final void rule__Joint__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:552:1: ( ( ( rule__Joint__Group_10__0 )? ) )
            // InternalKinematics.g:553:1: ( ( rule__Joint__Group_10__0 )? )
            {
            // InternalKinematics.g:553:1: ( ( rule__Joint__Group_10__0 )? )
            // InternalKinematics.g:554:2: ( rule__Joint__Group_10__0 )?
            {
             before(grammarAccess.getJointAccess().getGroup_10()); 
            // InternalKinematics.g:555:2: ( rule__Joint__Group_10__0 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==25) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalKinematics.g:555:3: rule__Joint__Group_10__0
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
    // InternalKinematics.g:563:1: rule__Joint__Group__11 : rule__Joint__Group__11__Impl rule__Joint__Group__12 ;
    public final void rule__Joint__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:567:1: ( rule__Joint__Group__11__Impl rule__Joint__Group__12 )
            // InternalKinematics.g:568:2: rule__Joint__Group__11__Impl rule__Joint__Group__12
            {
            pushFollow(FOLLOW_10);
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
    // InternalKinematics.g:575:1: rule__Joint__Group__11__Impl : ( ( rule__Joint__Group_11__0 )? ) ;
    public final void rule__Joint__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:579:1: ( ( ( rule__Joint__Group_11__0 )? ) )
            // InternalKinematics.g:580:1: ( ( rule__Joint__Group_11__0 )? )
            {
            // InternalKinematics.g:580:1: ( ( rule__Joint__Group_11__0 )? )
            // InternalKinematics.g:581:2: ( rule__Joint__Group_11__0 )?
            {
             before(grammarAccess.getJointAccess().getGroup_11()); 
            // InternalKinematics.g:582:2: ( rule__Joint__Group_11__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==26) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalKinematics.g:582:3: rule__Joint__Group_11__0
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
    // InternalKinematics.g:590:1: rule__Joint__Group__12 : rule__Joint__Group__12__Impl ;
    public final void rule__Joint__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:594:1: ( rule__Joint__Group__12__Impl )
            // InternalKinematics.g:595:2: rule__Joint__Group__12__Impl
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
    // InternalKinematics.g:601:1: rule__Joint__Group__12__Impl : ( '}' ) ;
    public final void rule__Joint__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:605:1: ( ( '}' ) )
            // InternalKinematics.g:606:1: ( '}' )
            {
            // InternalKinematics.g:606:1: ( '}' )
            // InternalKinematics.g:607:2: '}'
            {
             before(grammarAccess.getJointAccess().getRightCurlyBracketKeyword_12()); 
            match(input,23,FOLLOW_2); 
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
    // InternalKinematics.g:617:1: rule__Joint__Group_7__0 : rule__Joint__Group_7__0__Impl rule__Joint__Group_7__1 ;
    public final void rule__Joint__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:621:1: ( rule__Joint__Group_7__0__Impl rule__Joint__Group_7__1 )
            // InternalKinematics.g:622:2: rule__Joint__Group_7__0__Impl rule__Joint__Group_7__1
            {
            pushFollow(FOLLOW_3);
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
    // InternalKinematics.g:629:1: rule__Joint__Group_7__0__Impl : ( 'child' ) ;
    public final void rule__Joint__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:633:1: ( ( 'child' ) )
            // InternalKinematics.g:634:1: ( 'child' )
            {
            // InternalKinematics.g:634:1: ( 'child' )
            // InternalKinematics.g:635:2: 'child'
            {
             before(grammarAccess.getJointAccess().getChildKeyword_7_0()); 
            match(input,24,FOLLOW_2); 
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
    // InternalKinematics.g:644:1: rule__Joint__Group_7__1 : rule__Joint__Group_7__1__Impl ;
    public final void rule__Joint__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:648:1: ( rule__Joint__Group_7__1__Impl )
            // InternalKinematics.g:649:2: rule__Joint__Group_7__1__Impl
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
    // InternalKinematics.g:655:1: rule__Joint__Group_7__1__Impl : ( ( rule__Joint__ChildAssignment_7_1 ) ) ;
    public final void rule__Joint__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:659:1: ( ( ( rule__Joint__ChildAssignment_7_1 ) ) )
            // InternalKinematics.g:660:1: ( ( rule__Joint__ChildAssignment_7_1 ) )
            {
            // InternalKinematics.g:660:1: ( ( rule__Joint__ChildAssignment_7_1 ) )
            // InternalKinematics.g:661:2: ( rule__Joint__ChildAssignment_7_1 )
            {
             before(grammarAccess.getJointAccess().getChildAssignment_7_1()); 
            // InternalKinematics.g:662:2: ( rule__Joint__ChildAssignment_7_1 )
            // InternalKinematics.g:662:3: rule__Joint__ChildAssignment_7_1
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
    // InternalKinematics.g:671:1: rule__Joint__Group_10__0 : rule__Joint__Group_10__0__Impl rule__Joint__Group_10__1 ;
    public final void rule__Joint__Group_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:675:1: ( rule__Joint__Group_10__0__Impl rule__Joint__Group_10__1 )
            // InternalKinematics.g:676:2: rule__Joint__Group_10__0__Impl rule__Joint__Group_10__1
            {
            pushFollow(FOLLOW_11);
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
    // InternalKinematics.g:683:1: rule__Joint__Group_10__0__Impl : ( 'limit' ) ;
    public final void rule__Joint__Group_10__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:687:1: ( ( 'limit' ) )
            // InternalKinematics.g:688:1: ( 'limit' )
            {
            // InternalKinematics.g:688:1: ( 'limit' )
            // InternalKinematics.g:689:2: 'limit'
            {
             before(grammarAccess.getJointAccess().getLimitKeyword_10_0()); 
            match(input,25,FOLLOW_2); 
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
    // InternalKinematics.g:698:1: rule__Joint__Group_10__1 : rule__Joint__Group_10__1__Impl ;
    public final void rule__Joint__Group_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:702:1: ( rule__Joint__Group_10__1__Impl )
            // InternalKinematics.g:703:2: rule__Joint__Group_10__1__Impl
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
    // InternalKinematics.g:709:1: rule__Joint__Group_10__1__Impl : ( ( rule__Joint__LimitAssignment_10_1 ) ) ;
    public final void rule__Joint__Group_10__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:713:1: ( ( ( rule__Joint__LimitAssignment_10_1 ) ) )
            // InternalKinematics.g:714:1: ( ( rule__Joint__LimitAssignment_10_1 ) )
            {
            // InternalKinematics.g:714:1: ( ( rule__Joint__LimitAssignment_10_1 ) )
            // InternalKinematics.g:715:2: ( rule__Joint__LimitAssignment_10_1 )
            {
             before(grammarAccess.getJointAccess().getLimitAssignment_10_1()); 
            // InternalKinematics.g:716:2: ( rule__Joint__LimitAssignment_10_1 )
            // InternalKinematics.g:716:3: rule__Joint__LimitAssignment_10_1
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
    // InternalKinematics.g:725:1: rule__Joint__Group_11__0 : rule__Joint__Group_11__0__Impl rule__Joint__Group_11__1 ;
    public final void rule__Joint__Group_11__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:729:1: ( rule__Joint__Group_11__0__Impl rule__Joint__Group_11__1 )
            // InternalKinematics.g:730:2: rule__Joint__Group_11__0__Impl rule__Joint__Group_11__1
            {
            pushFollow(FOLLOW_12);
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
    // InternalKinematics.g:737:1: rule__Joint__Group_11__0__Impl : ( 'axis' ) ;
    public final void rule__Joint__Group_11__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:741:1: ( ( 'axis' ) )
            // InternalKinematics.g:742:1: ( 'axis' )
            {
            // InternalKinematics.g:742:1: ( 'axis' )
            // InternalKinematics.g:743:2: 'axis'
            {
             before(grammarAccess.getJointAccess().getAxisKeyword_11_0()); 
            match(input,26,FOLLOW_2); 
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
    // InternalKinematics.g:752:1: rule__Joint__Group_11__1 : rule__Joint__Group_11__1__Impl ;
    public final void rule__Joint__Group_11__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:756:1: ( rule__Joint__Group_11__1__Impl )
            // InternalKinematics.g:757:2: rule__Joint__Group_11__1__Impl
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
    // InternalKinematics.g:763:1: rule__Joint__Group_11__1__Impl : ( ( rule__Joint__AxisAssignment_11_1 ) ) ;
    public final void rule__Joint__Group_11__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:767:1: ( ( ( rule__Joint__AxisAssignment_11_1 ) ) )
            // InternalKinematics.g:768:1: ( ( rule__Joint__AxisAssignment_11_1 ) )
            {
            // InternalKinematics.g:768:1: ( ( rule__Joint__AxisAssignment_11_1 ) )
            // InternalKinematics.g:769:2: ( rule__Joint__AxisAssignment_11_1 )
            {
             before(grammarAccess.getJointAccess().getAxisAssignment_11_1()); 
            // InternalKinematics.g:770:2: ( rule__Joint__AxisAssignment_11_1 )
            // InternalKinematics.g:770:3: rule__Joint__AxisAssignment_11_1
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


    // $ANTLR start "rule__Pose__Group__0"
    // InternalKinematics.g:779:1: rule__Pose__Group__0 : rule__Pose__Group__0__Impl rule__Pose__Group__1 ;
    public final void rule__Pose__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:783:1: ( rule__Pose__Group__0__Impl rule__Pose__Group__1 )
            // InternalKinematics.g:784:2: rule__Pose__Group__0__Impl rule__Pose__Group__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalKinematics.g:791:1: rule__Pose__Group__0__Impl : ( 'Pose' ) ;
    public final void rule__Pose__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:795:1: ( ( 'Pose' ) )
            // InternalKinematics.g:796:1: ( 'Pose' )
            {
            // InternalKinematics.g:796:1: ( 'Pose' )
            // InternalKinematics.g:797:2: 'Pose'
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
    // InternalKinematics.g:806:1: rule__Pose__Group__1 : rule__Pose__Group__1__Impl rule__Pose__Group__2 ;
    public final void rule__Pose__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:810:1: ( rule__Pose__Group__1__Impl rule__Pose__Group__2 )
            // InternalKinematics.g:811:2: rule__Pose__Group__1__Impl rule__Pose__Group__2
            {
            pushFollow(FOLLOW_13);
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
    // InternalKinematics.g:818:1: rule__Pose__Group__1__Impl : ( '{' ) ;
    public final void rule__Pose__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:822:1: ( ( '{' ) )
            // InternalKinematics.g:823:1: ( '{' )
            {
            // InternalKinematics.g:823:1: ( '{' )
            // InternalKinematics.g:824:2: '{'
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
    // InternalKinematics.g:833:1: rule__Pose__Group__2 : rule__Pose__Group__2__Impl rule__Pose__Group__3 ;
    public final void rule__Pose__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:837:1: ( rule__Pose__Group__2__Impl rule__Pose__Group__3 )
            // InternalKinematics.g:838:2: rule__Pose__Group__2__Impl rule__Pose__Group__3
            {
            pushFollow(FOLLOW_14);
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
    // InternalKinematics.g:845:1: rule__Pose__Group__2__Impl : ( 'x' ) ;
    public final void rule__Pose__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:849:1: ( ( 'x' ) )
            // InternalKinematics.g:850:1: ( 'x' )
            {
            // InternalKinematics.g:850:1: ( 'x' )
            // InternalKinematics.g:851:2: 'x'
            {
             before(grammarAccess.getPoseAccess().getXKeyword_2()); 
            match(input,28,FOLLOW_2); 
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
    // InternalKinematics.g:860:1: rule__Pose__Group__3 : rule__Pose__Group__3__Impl rule__Pose__Group__4 ;
    public final void rule__Pose__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:864:1: ( rule__Pose__Group__3__Impl rule__Pose__Group__4 )
            // InternalKinematics.g:865:2: rule__Pose__Group__3__Impl rule__Pose__Group__4
            {
            pushFollow(FOLLOW_15);
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
    // InternalKinematics.g:872:1: rule__Pose__Group__3__Impl : ( ( rule__Pose__XAssignment_3 ) ) ;
    public final void rule__Pose__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:876:1: ( ( ( rule__Pose__XAssignment_3 ) ) )
            // InternalKinematics.g:877:1: ( ( rule__Pose__XAssignment_3 ) )
            {
            // InternalKinematics.g:877:1: ( ( rule__Pose__XAssignment_3 ) )
            // InternalKinematics.g:878:2: ( rule__Pose__XAssignment_3 )
            {
             before(grammarAccess.getPoseAccess().getXAssignment_3()); 
            // InternalKinematics.g:879:2: ( rule__Pose__XAssignment_3 )
            // InternalKinematics.g:879:3: rule__Pose__XAssignment_3
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
    // InternalKinematics.g:887:1: rule__Pose__Group__4 : rule__Pose__Group__4__Impl rule__Pose__Group__5 ;
    public final void rule__Pose__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:891:1: ( rule__Pose__Group__4__Impl rule__Pose__Group__5 )
            // InternalKinematics.g:892:2: rule__Pose__Group__4__Impl rule__Pose__Group__5
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
    // InternalKinematics.g:899:1: rule__Pose__Group__4__Impl : ( 'y' ) ;
    public final void rule__Pose__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:903:1: ( ( 'y' ) )
            // InternalKinematics.g:904:1: ( 'y' )
            {
            // InternalKinematics.g:904:1: ( 'y' )
            // InternalKinematics.g:905:2: 'y'
            {
             before(grammarAccess.getPoseAccess().getYKeyword_4()); 
            match(input,29,FOLLOW_2); 
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
    // InternalKinematics.g:914:1: rule__Pose__Group__5 : rule__Pose__Group__5__Impl rule__Pose__Group__6 ;
    public final void rule__Pose__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:918:1: ( rule__Pose__Group__5__Impl rule__Pose__Group__6 )
            // InternalKinematics.g:919:2: rule__Pose__Group__5__Impl rule__Pose__Group__6
            {
            pushFollow(FOLLOW_16);
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
    // InternalKinematics.g:926:1: rule__Pose__Group__5__Impl : ( ( rule__Pose__YAssignment_5 ) ) ;
    public final void rule__Pose__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:930:1: ( ( ( rule__Pose__YAssignment_5 ) ) )
            // InternalKinematics.g:931:1: ( ( rule__Pose__YAssignment_5 ) )
            {
            // InternalKinematics.g:931:1: ( ( rule__Pose__YAssignment_5 ) )
            // InternalKinematics.g:932:2: ( rule__Pose__YAssignment_5 )
            {
             before(grammarAccess.getPoseAccess().getYAssignment_5()); 
            // InternalKinematics.g:933:2: ( rule__Pose__YAssignment_5 )
            // InternalKinematics.g:933:3: rule__Pose__YAssignment_5
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
    // InternalKinematics.g:941:1: rule__Pose__Group__6 : rule__Pose__Group__6__Impl rule__Pose__Group__7 ;
    public final void rule__Pose__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:945:1: ( rule__Pose__Group__6__Impl rule__Pose__Group__7 )
            // InternalKinematics.g:946:2: rule__Pose__Group__6__Impl rule__Pose__Group__7
            {
            pushFollow(FOLLOW_14);
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
    // InternalKinematics.g:953:1: rule__Pose__Group__6__Impl : ( 'z' ) ;
    public final void rule__Pose__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:957:1: ( ( 'z' ) )
            // InternalKinematics.g:958:1: ( 'z' )
            {
            // InternalKinematics.g:958:1: ( 'z' )
            // InternalKinematics.g:959:2: 'z'
            {
             before(grammarAccess.getPoseAccess().getZKeyword_6()); 
            match(input,30,FOLLOW_2); 
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
    // InternalKinematics.g:968:1: rule__Pose__Group__7 : rule__Pose__Group__7__Impl rule__Pose__Group__8 ;
    public final void rule__Pose__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:972:1: ( rule__Pose__Group__7__Impl rule__Pose__Group__8 )
            // InternalKinematics.g:973:2: rule__Pose__Group__7__Impl rule__Pose__Group__8
            {
            pushFollow(FOLLOW_17);
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
    // InternalKinematics.g:980:1: rule__Pose__Group__7__Impl : ( ( rule__Pose__ZAssignment_7 ) ) ;
    public final void rule__Pose__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:984:1: ( ( ( rule__Pose__ZAssignment_7 ) ) )
            // InternalKinematics.g:985:1: ( ( rule__Pose__ZAssignment_7 ) )
            {
            // InternalKinematics.g:985:1: ( ( rule__Pose__ZAssignment_7 ) )
            // InternalKinematics.g:986:2: ( rule__Pose__ZAssignment_7 )
            {
             before(grammarAccess.getPoseAccess().getZAssignment_7()); 
            // InternalKinematics.g:987:2: ( rule__Pose__ZAssignment_7 )
            // InternalKinematics.g:987:3: rule__Pose__ZAssignment_7
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
    // InternalKinematics.g:995:1: rule__Pose__Group__8 : rule__Pose__Group__8__Impl rule__Pose__Group__9 ;
    public final void rule__Pose__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:999:1: ( rule__Pose__Group__8__Impl rule__Pose__Group__9 )
            // InternalKinematics.g:1000:2: rule__Pose__Group__8__Impl rule__Pose__Group__9
            {
            pushFollow(FOLLOW_14);
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
    // InternalKinematics.g:1007:1: rule__Pose__Group__8__Impl : ( 'roll' ) ;
    public final void rule__Pose__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:1011:1: ( ( 'roll' ) )
            // InternalKinematics.g:1012:1: ( 'roll' )
            {
            // InternalKinematics.g:1012:1: ( 'roll' )
            // InternalKinematics.g:1013:2: 'roll'
            {
             before(grammarAccess.getPoseAccess().getRollKeyword_8()); 
            match(input,31,FOLLOW_2); 
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
    // InternalKinematics.g:1022:1: rule__Pose__Group__9 : rule__Pose__Group__9__Impl rule__Pose__Group__10 ;
    public final void rule__Pose__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:1026:1: ( rule__Pose__Group__9__Impl rule__Pose__Group__10 )
            // InternalKinematics.g:1027:2: rule__Pose__Group__9__Impl rule__Pose__Group__10
            {
            pushFollow(FOLLOW_18);
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
    // InternalKinematics.g:1034:1: rule__Pose__Group__9__Impl : ( ( rule__Pose__RollAssignment_9 ) ) ;
    public final void rule__Pose__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:1038:1: ( ( ( rule__Pose__RollAssignment_9 ) ) )
            // InternalKinematics.g:1039:1: ( ( rule__Pose__RollAssignment_9 ) )
            {
            // InternalKinematics.g:1039:1: ( ( rule__Pose__RollAssignment_9 ) )
            // InternalKinematics.g:1040:2: ( rule__Pose__RollAssignment_9 )
            {
             before(grammarAccess.getPoseAccess().getRollAssignment_9()); 
            // InternalKinematics.g:1041:2: ( rule__Pose__RollAssignment_9 )
            // InternalKinematics.g:1041:3: rule__Pose__RollAssignment_9
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
    // InternalKinematics.g:1049:1: rule__Pose__Group__10 : rule__Pose__Group__10__Impl rule__Pose__Group__11 ;
    public final void rule__Pose__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:1053:1: ( rule__Pose__Group__10__Impl rule__Pose__Group__11 )
            // InternalKinematics.g:1054:2: rule__Pose__Group__10__Impl rule__Pose__Group__11
            {
            pushFollow(FOLLOW_14);
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
    // InternalKinematics.g:1061:1: rule__Pose__Group__10__Impl : ( 'pitch' ) ;
    public final void rule__Pose__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:1065:1: ( ( 'pitch' ) )
            // InternalKinematics.g:1066:1: ( 'pitch' )
            {
            // InternalKinematics.g:1066:1: ( 'pitch' )
            // InternalKinematics.g:1067:2: 'pitch'
            {
             before(grammarAccess.getPoseAccess().getPitchKeyword_10()); 
            match(input,32,FOLLOW_2); 
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
    // InternalKinematics.g:1076:1: rule__Pose__Group__11 : rule__Pose__Group__11__Impl rule__Pose__Group__12 ;
    public final void rule__Pose__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:1080:1: ( rule__Pose__Group__11__Impl rule__Pose__Group__12 )
            // InternalKinematics.g:1081:2: rule__Pose__Group__11__Impl rule__Pose__Group__12
            {
            pushFollow(FOLLOW_19);
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
    // InternalKinematics.g:1088:1: rule__Pose__Group__11__Impl : ( ( rule__Pose__PitchAssignment_11 ) ) ;
    public final void rule__Pose__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:1092:1: ( ( ( rule__Pose__PitchAssignment_11 ) ) )
            // InternalKinematics.g:1093:1: ( ( rule__Pose__PitchAssignment_11 ) )
            {
            // InternalKinematics.g:1093:1: ( ( rule__Pose__PitchAssignment_11 ) )
            // InternalKinematics.g:1094:2: ( rule__Pose__PitchAssignment_11 )
            {
             before(grammarAccess.getPoseAccess().getPitchAssignment_11()); 
            // InternalKinematics.g:1095:2: ( rule__Pose__PitchAssignment_11 )
            // InternalKinematics.g:1095:3: rule__Pose__PitchAssignment_11
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
    // InternalKinematics.g:1103:1: rule__Pose__Group__12 : rule__Pose__Group__12__Impl rule__Pose__Group__13 ;
    public final void rule__Pose__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:1107:1: ( rule__Pose__Group__12__Impl rule__Pose__Group__13 )
            // InternalKinematics.g:1108:2: rule__Pose__Group__12__Impl rule__Pose__Group__13
            {
            pushFollow(FOLLOW_14);
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
    // InternalKinematics.g:1115:1: rule__Pose__Group__12__Impl : ( 'yaw' ) ;
    public final void rule__Pose__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:1119:1: ( ( 'yaw' ) )
            // InternalKinematics.g:1120:1: ( 'yaw' )
            {
            // InternalKinematics.g:1120:1: ( 'yaw' )
            // InternalKinematics.g:1121:2: 'yaw'
            {
             before(grammarAccess.getPoseAccess().getYawKeyword_12()); 
            match(input,33,FOLLOW_2); 
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
    // InternalKinematics.g:1130:1: rule__Pose__Group__13 : rule__Pose__Group__13__Impl rule__Pose__Group__14 ;
    public final void rule__Pose__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:1134:1: ( rule__Pose__Group__13__Impl rule__Pose__Group__14 )
            // InternalKinematics.g:1135:2: rule__Pose__Group__13__Impl rule__Pose__Group__14
            {
            pushFollow(FOLLOW_20);
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
    // InternalKinematics.g:1142:1: rule__Pose__Group__13__Impl : ( ( rule__Pose__YawAssignment_13 ) ) ;
    public final void rule__Pose__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:1146:1: ( ( ( rule__Pose__YawAssignment_13 ) ) )
            // InternalKinematics.g:1147:1: ( ( rule__Pose__YawAssignment_13 ) )
            {
            // InternalKinematics.g:1147:1: ( ( rule__Pose__YawAssignment_13 ) )
            // InternalKinematics.g:1148:2: ( rule__Pose__YawAssignment_13 )
            {
             before(grammarAccess.getPoseAccess().getYawAssignment_13()); 
            // InternalKinematics.g:1149:2: ( rule__Pose__YawAssignment_13 )
            // InternalKinematics.g:1149:3: rule__Pose__YawAssignment_13
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
    // InternalKinematics.g:1157:1: rule__Pose__Group__14 : rule__Pose__Group__14__Impl ;
    public final void rule__Pose__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:1161:1: ( rule__Pose__Group__14__Impl )
            // InternalKinematics.g:1162:2: rule__Pose__Group__14__Impl
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
    // InternalKinematics.g:1168:1: rule__Pose__Group__14__Impl : ( '}' ) ;
    public final void rule__Pose__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:1172:1: ( ( '}' ) )
            // InternalKinematics.g:1173:1: ( '}' )
            {
            // InternalKinematics.g:1173:1: ( '}' )
            // InternalKinematics.g:1174:2: '}'
            {
             before(grammarAccess.getPoseAccess().getRightCurlyBracketKeyword_14()); 
            match(input,23,FOLLOW_2); 
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
    // InternalKinematics.g:1184:1: rule__Limit__Group__0 : rule__Limit__Group__0__Impl rule__Limit__Group__1 ;
    public final void rule__Limit__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:1188:1: ( rule__Limit__Group__0__Impl rule__Limit__Group__1 )
            // InternalKinematics.g:1189:2: rule__Limit__Group__0__Impl rule__Limit__Group__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalKinematics.g:1196:1: rule__Limit__Group__0__Impl : ( 'Limit' ) ;
    public final void rule__Limit__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:1200:1: ( ( 'Limit' ) )
            // InternalKinematics.g:1201:1: ( 'Limit' )
            {
            // InternalKinematics.g:1201:1: ( 'Limit' )
            // InternalKinematics.g:1202:2: 'Limit'
            {
             before(grammarAccess.getLimitAccess().getLimitKeyword_0()); 
            match(input,34,FOLLOW_2); 
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
    // InternalKinematics.g:1211:1: rule__Limit__Group__1 : rule__Limit__Group__1__Impl rule__Limit__Group__2 ;
    public final void rule__Limit__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:1215:1: ( rule__Limit__Group__1__Impl rule__Limit__Group__2 )
            // InternalKinematics.g:1216:2: rule__Limit__Group__1__Impl rule__Limit__Group__2
            {
            pushFollow(FOLLOW_21);
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
    // InternalKinematics.g:1223:1: rule__Limit__Group__1__Impl : ( '{' ) ;
    public final void rule__Limit__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:1227:1: ( ( '{' ) )
            // InternalKinematics.g:1228:1: ( '{' )
            {
            // InternalKinematics.g:1228:1: ( '{' )
            // InternalKinematics.g:1229:2: '{'
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
    // InternalKinematics.g:1238:1: rule__Limit__Group__2 : rule__Limit__Group__2__Impl rule__Limit__Group__3 ;
    public final void rule__Limit__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:1242:1: ( rule__Limit__Group__2__Impl rule__Limit__Group__3 )
            // InternalKinematics.g:1243:2: rule__Limit__Group__2__Impl rule__Limit__Group__3
            {
            pushFollow(FOLLOW_14);
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
    // InternalKinematics.g:1250:1: rule__Limit__Group__2__Impl : ( 'effort' ) ;
    public final void rule__Limit__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:1254:1: ( ( 'effort' ) )
            // InternalKinematics.g:1255:1: ( 'effort' )
            {
            // InternalKinematics.g:1255:1: ( 'effort' )
            // InternalKinematics.g:1256:2: 'effort'
            {
             before(grammarAccess.getLimitAccess().getEffortKeyword_2()); 
            match(input,35,FOLLOW_2); 
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
    // InternalKinematics.g:1265:1: rule__Limit__Group__3 : rule__Limit__Group__3__Impl rule__Limit__Group__4 ;
    public final void rule__Limit__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:1269:1: ( rule__Limit__Group__3__Impl rule__Limit__Group__4 )
            // InternalKinematics.g:1270:2: rule__Limit__Group__3__Impl rule__Limit__Group__4
            {
            pushFollow(FOLLOW_22);
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
    // InternalKinematics.g:1277:1: rule__Limit__Group__3__Impl : ( ( rule__Limit__EffortAssignment_3 ) ) ;
    public final void rule__Limit__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:1281:1: ( ( ( rule__Limit__EffortAssignment_3 ) ) )
            // InternalKinematics.g:1282:1: ( ( rule__Limit__EffortAssignment_3 ) )
            {
            // InternalKinematics.g:1282:1: ( ( rule__Limit__EffortAssignment_3 ) )
            // InternalKinematics.g:1283:2: ( rule__Limit__EffortAssignment_3 )
            {
             before(grammarAccess.getLimitAccess().getEffortAssignment_3()); 
            // InternalKinematics.g:1284:2: ( rule__Limit__EffortAssignment_3 )
            // InternalKinematics.g:1284:3: rule__Limit__EffortAssignment_3
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
    // InternalKinematics.g:1292:1: rule__Limit__Group__4 : rule__Limit__Group__4__Impl rule__Limit__Group__5 ;
    public final void rule__Limit__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:1296:1: ( rule__Limit__Group__4__Impl rule__Limit__Group__5 )
            // InternalKinematics.g:1297:2: rule__Limit__Group__4__Impl rule__Limit__Group__5
            {
            pushFollow(FOLLOW_14);
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
    // InternalKinematics.g:1304:1: rule__Limit__Group__4__Impl : ( 'velocity' ) ;
    public final void rule__Limit__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:1308:1: ( ( 'velocity' ) )
            // InternalKinematics.g:1309:1: ( 'velocity' )
            {
            // InternalKinematics.g:1309:1: ( 'velocity' )
            // InternalKinematics.g:1310:2: 'velocity'
            {
             before(grammarAccess.getLimitAccess().getVelocityKeyword_4()); 
            match(input,36,FOLLOW_2); 
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
    // InternalKinematics.g:1319:1: rule__Limit__Group__5 : rule__Limit__Group__5__Impl rule__Limit__Group__6 ;
    public final void rule__Limit__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:1323:1: ( rule__Limit__Group__5__Impl rule__Limit__Group__6 )
            // InternalKinematics.g:1324:2: rule__Limit__Group__5__Impl rule__Limit__Group__6
            {
            pushFollow(FOLLOW_23);
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
    // InternalKinematics.g:1331:1: rule__Limit__Group__5__Impl : ( ( rule__Limit__VelocityAssignment_5 ) ) ;
    public final void rule__Limit__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:1335:1: ( ( ( rule__Limit__VelocityAssignment_5 ) ) )
            // InternalKinematics.g:1336:1: ( ( rule__Limit__VelocityAssignment_5 ) )
            {
            // InternalKinematics.g:1336:1: ( ( rule__Limit__VelocityAssignment_5 ) )
            // InternalKinematics.g:1337:2: ( rule__Limit__VelocityAssignment_5 )
            {
             before(grammarAccess.getLimitAccess().getVelocityAssignment_5()); 
            // InternalKinematics.g:1338:2: ( rule__Limit__VelocityAssignment_5 )
            // InternalKinematics.g:1338:3: rule__Limit__VelocityAssignment_5
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
    // InternalKinematics.g:1346:1: rule__Limit__Group__6 : rule__Limit__Group__6__Impl rule__Limit__Group__7 ;
    public final void rule__Limit__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:1350:1: ( rule__Limit__Group__6__Impl rule__Limit__Group__7 )
            // InternalKinematics.g:1351:2: rule__Limit__Group__6__Impl rule__Limit__Group__7
            {
            pushFollow(FOLLOW_23);
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
    // InternalKinematics.g:1358:1: rule__Limit__Group__6__Impl : ( ( rule__Limit__Group_6__0 )? ) ;
    public final void rule__Limit__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:1362:1: ( ( ( rule__Limit__Group_6__0 )? ) )
            // InternalKinematics.g:1363:1: ( ( rule__Limit__Group_6__0 )? )
            {
            // InternalKinematics.g:1363:1: ( ( rule__Limit__Group_6__0 )? )
            // InternalKinematics.g:1364:2: ( rule__Limit__Group_6__0 )?
            {
             before(grammarAccess.getLimitAccess().getGroup_6()); 
            // InternalKinematics.g:1365:2: ( rule__Limit__Group_6__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==37) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalKinematics.g:1365:3: rule__Limit__Group_6__0
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
    // InternalKinematics.g:1373:1: rule__Limit__Group__7 : rule__Limit__Group__7__Impl rule__Limit__Group__8 ;
    public final void rule__Limit__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:1377:1: ( rule__Limit__Group__7__Impl rule__Limit__Group__8 )
            // InternalKinematics.g:1378:2: rule__Limit__Group__7__Impl rule__Limit__Group__8
            {
            pushFollow(FOLLOW_23);
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
    // InternalKinematics.g:1385:1: rule__Limit__Group__7__Impl : ( ( rule__Limit__Group_7__0 )? ) ;
    public final void rule__Limit__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:1389:1: ( ( ( rule__Limit__Group_7__0 )? ) )
            // InternalKinematics.g:1390:1: ( ( rule__Limit__Group_7__0 )? )
            {
            // InternalKinematics.g:1390:1: ( ( rule__Limit__Group_7__0 )? )
            // InternalKinematics.g:1391:2: ( rule__Limit__Group_7__0 )?
            {
             before(grammarAccess.getLimitAccess().getGroup_7()); 
            // InternalKinematics.g:1392:2: ( rule__Limit__Group_7__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==38) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalKinematics.g:1392:3: rule__Limit__Group_7__0
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
    // InternalKinematics.g:1400:1: rule__Limit__Group__8 : rule__Limit__Group__8__Impl ;
    public final void rule__Limit__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:1404:1: ( rule__Limit__Group__8__Impl )
            // InternalKinematics.g:1405:2: rule__Limit__Group__8__Impl
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
    // InternalKinematics.g:1411:1: rule__Limit__Group__8__Impl : ( '}' ) ;
    public final void rule__Limit__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:1415:1: ( ( '}' ) )
            // InternalKinematics.g:1416:1: ( '}' )
            {
            // InternalKinematics.g:1416:1: ( '}' )
            // InternalKinematics.g:1417:2: '}'
            {
             before(grammarAccess.getLimitAccess().getRightCurlyBracketKeyword_8()); 
            match(input,23,FOLLOW_2); 
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
    // InternalKinematics.g:1427:1: rule__Limit__Group_6__0 : rule__Limit__Group_6__0__Impl rule__Limit__Group_6__1 ;
    public final void rule__Limit__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:1431:1: ( rule__Limit__Group_6__0__Impl rule__Limit__Group_6__1 )
            // InternalKinematics.g:1432:2: rule__Limit__Group_6__0__Impl rule__Limit__Group_6__1
            {
            pushFollow(FOLLOW_14);
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
    // InternalKinematics.g:1439:1: rule__Limit__Group_6__0__Impl : ( 'lower' ) ;
    public final void rule__Limit__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:1443:1: ( ( 'lower' ) )
            // InternalKinematics.g:1444:1: ( 'lower' )
            {
            // InternalKinematics.g:1444:1: ( 'lower' )
            // InternalKinematics.g:1445:2: 'lower'
            {
             before(grammarAccess.getLimitAccess().getLowerKeyword_6_0()); 
            match(input,37,FOLLOW_2); 
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
    // InternalKinematics.g:1454:1: rule__Limit__Group_6__1 : rule__Limit__Group_6__1__Impl ;
    public final void rule__Limit__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:1458:1: ( rule__Limit__Group_6__1__Impl )
            // InternalKinematics.g:1459:2: rule__Limit__Group_6__1__Impl
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
    // InternalKinematics.g:1465:1: rule__Limit__Group_6__1__Impl : ( ( rule__Limit__LowerAssignment_6_1 ) ) ;
    public final void rule__Limit__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:1469:1: ( ( ( rule__Limit__LowerAssignment_6_1 ) ) )
            // InternalKinematics.g:1470:1: ( ( rule__Limit__LowerAssignment_6_1 ) )
            {
            // InternalKinematics.g:1470:1: ( ( rule__Limit__LowerAssignment_6_1 ) )
            // InternalKinematics.g:1471:2: ( rule__Limit__LowerAssignment_6_1 )
            {
             before(grammarAccess.getLimitAccess().getLowerAssignment_6_1()); 
            // InternalKinematics.g:1472:2: ( rule__Limit__LowerAssignment_6_1 )
            // InternalKinematics.g:1472:3: rule__Limit__LowerAssignment_6_1
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
    // InternalKinematics.g:1481:1: rule__Limit__Group_7__0 : rule__Limit__Group_7__0__Impl rule__Limit__Group_7__1 ;
    public final void rule__Limit__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:1485:1: ( rule__Limit__Group_7__0__Impl rule__Limit__Group_7__1 )
            // InternalKinematics.g:1486:2: rule__Limit__Group_7__0__Impl rule__Limit__Group_7__1
            {
            pushFollow(FOLLOW_14);
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
    // InternalKinematics.g:1493:1: rule__Limit__Group_7__0__Impl : ( 'upper' ) ;
    public final void rule__Limit__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:1497:1: ( ( 'upper' ) )
            // InternalKinematics.g:1498:1: ( 'upper' )
            {
            // InternalKinematics.g:1498:1: ( 'upper' )
            // InternalKinematics.g:1499:2: 'upper'
            {
             before(grammarAccess.getLimitAccess().getUpperKeyword_7_0()); 
            match(input,38,FOLLOW_2); 
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
    // InternalKinematics.g:1508:1: rule__Limit__Group_7__1 : rule__Limit__Group_7__1__Impl ;
    public final void rule__Limit__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:1512:1: ( rule__Limit__Group_7__1__Impl )
            // InternalKinematics.g:1513:2: rule__Limit__Group_7__1__Impl
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
    // InternalKinematics.g:1519:1: rule__Limit__Group_7__1__Impl : ( ( rule__Limit__UpperAssignment_7_1 ) ) ;
    public final void rule__Limit__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:1523:1: ( ( ( rule__Limit__UpperAssignment_7_1 ) ) )
            // InternalKinematics.g:1524:1: ( ( rule__Limit__UpperAssignment_7_1 ) )
            {
            // InternalKinematics.g:1524:1: ( ( rule__Limit__UpperAssignment_7_1 ) )
            // InternalKinematics.g:1525:2: ( rule__Limit__UpperAssignment_7_1 )
            {
             before(grammarAccess.getLimitAccess().getUpperAssignment_7_1()); 
            // InternalKinematics.g:1526:2: ( rule__Limit__UpperAssignment_7_1 )
            // InternalKinematics.g:1526:3: rule__Limit__UpperAssignment_7_1
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
    // InternalKinematics.g:1535:1: rule__Axis__Group__0 : rule__Axis__Group__0__Impl rule__Axis__Group__1 ;
    public final void rule__Axis__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:1539:1: ( rule__Axis__Group__0__Impl rule__Axis__Group__1 )
            // InternalKinematics.g:1540:2: rule__Axis__Group__0__Impl rule__Axis__Group__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalKinematics.g:1547:1: rule__Axis__Group__0__Impl : ( 'Axis' ) ;
    public final void rule__Axis__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:1551:1: ( ( 'Axis' ) )
            // InternalKinematics.g:1552:1: ( 'Axis' )
            {
            // InternalKinematics.g:1552:1: ( 'Axis' )
            // InternalKinematics.g:1553:2: 'Axis'
            {
             before(grammarAccess.getAxisAccess().getAxisKeyword_0()); 
            match(input,39,FOLLOW_2); 
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
    // InternalKinematics.g:1562:1: rule__Axis__Group__1 : rule__Axis__Group__1__Impl rule__Axis__Group__2 ;
    public final void rule__Axis__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:1566:1: ( rule__Axis__Group__1__Impl rule__Axis__Group__2 )
            // InternalKinematics.g:1567:2: rule__Axis__Group__1__Impl rule__Axis__Group__2
            {
            pushFollow(FOLLOW_13);
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
    // InternalKinematics.g:1574:1: rule__Axis__Group__1__Impl : ( '{' ) ;
    public final void rule__Axis__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:1578:1: ( ( '{' ) )
            // InternalKinematics.g:1579:1: ( '{' )
            {
            // InternalKinematics.g:1579:1: ( '{' )
            // InternalKinematics.g:1580:2: '{'
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
    // InternalKinematics.g:1589:1: rule__Axis__Group__2 : rule__Axis__Group__2__Impl rule__Axis__Group__3 ;
    public final void rule__Axis__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:1593:1: ( rule__Axis__Group__2__Impl rule__Axis__Group__3 )
            // InternalKinematics.g:1594:2: rule__Axis__Group__2__Impl rule__Axis__Group__3
            {
            pushFollow(FOLLOW_14);
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
    // InternalKinematics.g:1601:1: rule__Axis__Group__2__Impl : ( 'x' ) ;
    public final void rule__Axis__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:1605:1: ( ( 'x' ) )
            // InternalKinematics.g:1606:1: ( 'x' )
            {
            // InternalKinematics.g:1606:1: ( 'x' )
            // InternalKinematics.g:1607:2: 'x'
            {
             before(grammarAccess.getAxisAccess().getXKeyword_2()); 
            match(input,28,FOLLOW_2); 
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
    // InternalKinematics.g:1616:1: rule__Axis__Group__3 : rule__Axis__Group__3__Impl rule__Axis__Group__4 ;
    public final void rule__Axis__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:1620:1: ( rule__Axis__Group__3__Impl rule__Axis__Group__4 )
            // InternalKinematics.g:1621:2: rule__Axis__Group__3__Impl rule__Axis__Group__4
            {
            pushFollow(FOLLOW_15);
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
    // InternalKinematics.g:1628:1: rule__Axis__Group__3__Impl : ( ( rule__Axis__XAssignment_3 ) ) ;
    public final void rule__Axis__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:1632:1: ( ( ( rule__Axis__XAssignment_3 ) ) )
            // InternalKinematics.g:1633:1: ( ( rule__Axis__XAssignment_3 ) )
            {
            // InternalKinematics.g:1633:1: ( ( rule__Axis__XAssignment_3 ) )
            // InternalKinematics.g:1634:2: ( rule__Axis__XAssignment_3 )
            {
             before(grammarAccess.getAxisAccess().getXAssignment_3()); 
            // InternalKinematics.g:1635:2: ( rule__Axis__XAssignment_3 )
            // InternalKinematics.g:1635:3: rule__Axis__XAssignment_3
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
    // InternalKinematics.g:1643:1: rule__Axis__Group__4 : rule__Axis__Group__4__Impl rule__Axis__Group__5 ;
    public final void rule__Axis__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:1647:1: ( rule__Axis__Group__4__Impl rule__Axis__Group__5 )
            // InternalKinematics.g:1648:2: rule__Axis__Group__4__Impl rule__Axis__Group__5
            {
            pushFollow(FOLLOW_14);
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
    // InternalKinematics.g:1655:1: rule__Axis__Group__4__Impl : ( 'y' ) ;
    public final void rule__Axis__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:1659:1: ( ( 'y' ) )
            // InternalKinematics.g:1660:1: ( 'y' )
            {
            // InternalKinematics.g:1660:1: ( 'y' )
            // InternalKinematics.g:1661:2: 'y'
            {
             before(grammarAccess.getAxisAccess().getYKeyword_4()); 
            match(input,29,FOLLOW_2); 
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
    // InternalKinematics.g:1670:1: rule__Axis__Group__5 : rule__Axis__Group__5__Impl rule__Axis__Group__6 ;
    public final void rule__Axis__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:1674:1: ( rule__Axis__Group__5__Impl rule__Axis__Group__6 )
            // InternalKinematics.g:1675:2: rule__Axis__Group__5__Impl rule__Axis__Group__6
            {
            pushFollow(FOLLOW_16);
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
    // InternalKinematics.g:1682:1: rule__Axis__Group__5__Impl : ( ( rule__Axis__YAssignment_5 ) ) ;
    public final void rule__Axis__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:1686:1: ( ( ( rule__Axis__YAssignment_5 ) ) )
            // InternalKinematics.g:1687:1: ( ( rule__Axis__YAssignment_5 ) )
            {
            // InternalKinematics.g:1687:1: ( ( rule__Axis__YAssignment_5 ) )
            // InternalKinematics.g:1688:2: ( rule__Axis__YAssignment_5 )
            {
             before(grammarAccess.getAxisAccess().getYAssignment_5()); 
            // InternalKinematics.g:1689:2: ( rule__Axis__YAssignment_5 )
            // InternalKinematics.g:1689:3: rule__Axis__YAssignment_5
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
    // InternalKinematics.g:1697:1: rule__Axis__Group__6 : rule__Axis__Group__6__Impl rule__Axis__Group__7 ;
    public final void rule__Axis__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:1701:1: ( rule__Axis__Group__6__Impl rule__Axis__Group__7 )
            // InternalKinematics.g:1702:2: rule__Axis__Group__6__Impl rule__Axis__Group__7
            {
            pushFollow(FOLLOW_14);
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
    // InternalKinematics.g:1709:1: rule__Axis__Group__6__Impl : ( 'z' ) ;
    public final void rule__Axis__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:1713:1: ( ( 'z' ) )
            // InternalKinematics.g:1714:1: ( 'z' )
            {
            // InternalKinematics.g:1714:1: ( 'z' )
            // InternalKinematics.g:1715:2: 'z'
            {
             before(grammarAccess.getAxisAccess().getZKeyword_6()); 
            match(input,30,FOLLOW_2); 
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
    // InternalKinematics.g:1724:1: rule__Axis__Group__7 : rule__Axis__Group__7__Impl rule__Axis__Group__8 ;
    public final void rule__Axis__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:1728:1: ( rule__Axis__Group__7__Impl rule__Axis__Group__8 )
            // InternalKinematics.g:1729:2: rule__Axis__Group__7__Impl rule__Axis__Group__8
            {
            pushFollow(FOLLOW_20);
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
    // InternalKinematics.g:1736:1: rule__Axis__Group__7__Impl : ( ( rule__Axis__ZAssignment_7 ) ) ;
    public final void rule__Axis__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:1740:1: ( ( ( rule__Axis__ZAssignment_7 ) ) )
            // InternalKinematics.g:1741:1: ( ( rule__Axis__ZAssignment_7 ) )
            {
            // InternalKinematics.g:1741:1: ( ( rule__Axis__ZAssignment_7 ) )
            // InternalKinematics.g:1742:2: ( rule__Axis__ZAssignment_7 )
            {
             before(grammarAccess.getAxisAccess().getZAssignment_7()); 
            // InternalKinematics.g:1743:2: ( rule__Axis__ZAssignment_7 )
            // InternalKinematics.g:1743:3: rule__Axis__ZAssignment_7
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
    // InternalKinematics.g:1751:1: rule__Axis__Group__8 : rule__Axis__Group__8__Impl ;
    public final void rule__Axis__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:1755:1: ( rule__Axis__Group__8__Impl )
            // InternalKinematics.g:1756:2: rule__Axis__Group__8__Impl
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
    // InternalKinematics.g:1762:1: rule__Axis__Group__8__Impl : ( '}' ) ;
    public final void rule__Axis__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:1766:1: ( ( '}' ) )
            // InternalKinematics.g:1767:1: ( '}' )
            {
            // InternalKinematics.g:1767:1: ( '}' )
            // InternalKinematics.g:1768:2: '}'
            {
             before(grammarAccess.getAxisAccess().getRightCurlyBracketKeyword_8()); 
            match(input,23,FOLLOW_2); 
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


    // $ANTLR start "rule__Joint__NameAssignment_1"
    // InternalKinematics.g:1778:1: rule__Joint__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Joint__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:1782:1: ( ( ruleEString ) )
            // InternalKinematics.g:1783:2: ( ruleEString )
            {
            // InternalKinematics.g:1783:2: ( ruleEString )
            // InternalKinematics.g:1784:3: ruleEString
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
    // InternalKinematics.g:1793:1: rule__Joint__TypeAssignment_4 : ( ruleJointType ) ;
    public final void rule__Joint__TypeAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:1797:1: ( ( ruleJointType ) )
            // InternalKinematics.g:1798:2: ( ruleJointType )
            {
            // InternalKinematics.g:1798:2: ( ruleJointType )
            // InternalKinematics.g:1799:3: ruleJointType
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
    // InternalKinematics.g:1808:1: rule__Joint__ParentAssignment_6 : ( ( ruleEString ) ) ;
    public final void rule__Joint__ParentAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:1812:1: ( ( ( ruleEString ) ) )
            // InternalKinematics.g:1813:2: ( ( ruleEString ) )
            {
            // InternalKinematics.g:1813:2: ( ( ruleEString ) )
            // InternalKinematics.g:1814:3: ( ruleEString )
            {
             before(grammarAccess.getJointAccess().getParentLinkCrossReference_6_0()); 
            // InternalKinematics.g:1815:3: ( ruleEString )
            // InternalKinematics.g:1816:4: ruleEString
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
    // InternalKinematics.g:1827:1: rule__Joint__ChildAssignment_7_1 : ( ( ruleEString ) ) ;
    public final void rule__Joint__ChildAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:1831:1: ( ( ( ruleEString ) ) )
            // InternalKinematics.g:1832:2: ( ( ruleEString ) )
            {
            // InternalKinematics.g:1832:2: ( ( ruleEString ) )
            // InternalKinematics.g:1833:3: ( ruleEString )
            {
             before(grammarAccess.getJointAccess().getChildLinkCrossReference_7_1_0()); 
            // InternalKinematics.g:1834:3: ( ruleEString )
            // InternalKinematics.g:1835:4: ruleEString
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
    // InternalKinematics.g:1846:1: rule__Joint__OriginAssignment_9 : ( rulePose ) ;
    public final void rule__Joint__OriginAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:1850:1: ( ( rulePose ) )
            // InternalKinematics.g:1851:2: ( rulePose )
            {
            // InternalKinematics.g:1851:2: ( rulePose )
            // InternalKinematics.g:1852:3: rulePose
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
    // InternalKinematics.g:1861:1: rule__Joint__LimitAssignment_10_1 : ( ruleLimit ) ;
    public final void rule__Joint__LimitAssignment_10_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:1865:1: ( ( ruleLimit ) )
            // InternalKinematics.g:1866:2: ( ruleLimit )
            {
            // InternalKinematics.g:1866:2: ( ruleLimit )
            // InternalKinematics.g:1867:3: ruleLimit
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
    // InternalKinematics.g:1876:1: rule__Joint__AxisAssignment_11_1 : ( ruleAxis ) ;
    public final void rule__Joint__AxisAssignment_11_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:1880:1: ( ( ruleAxis ) )
            // InternalKinematics.g:1881:2: ( ruleAxis )
            {
            // InternalKinematics.g:1881:2: ( ruleAxis )
            // InternalKinematics.g:1882:3: ruleAxis
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


    // $ANTLR start "rule__Pose__XAssignment_3"
    // InternalKinematics.g:1891:1: rule__Pose__XAssignment_3 : ( ruleEDouble ) ;
    public final void rule__Pose__XAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:1895:1: ( ( ruleEDouble ) )
            // InternalKinematics.g:1896:2: ( ruleEDouble )
            {
            // InternalKinematics.g:1896:2: ( ruleEDouble )
            // InternalKinematics.g:1897:3: ruleEDouble
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
    // InternalKinematics.g:1906:1: rule__Pose__YAssignment_5 : ( ruleEDouble ) ;
    public final void rule__Pose__YAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:1910:1: ( ( ruleEDouble ) )
            // InternalKinematics.g:1911:2: ( ruleEDouble )
            {
            // InternalKinematics.g:1911:2: ( ruleEDouble )
            // InternalKinematics.g:1912:3: ruleEDouble
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
    // InternalKinematics.g:1921:1: rule__Pose__ZAssignment_7 : ( ruleEDouble ) ;
    public final void rule__Pose__ZAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:1925:1: ( ( ruleEDouble ) )
            // InternalKinematics.g:1926:2: ( ruleEDouble )
            {
            // InternalKinematics.g:1926:2: ( ruleEDouble )
            // InternalKinematics.g:1927:3: ruleEDouble
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
    // InternalKinematics.g:1936:1: rule__Pose__RollAssignment_9 : ( ruleEDouble ) ;
    public final void rule__Pose__RollAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:1940:1: ( ( ruleEDouble ) )
            // InternalKinematics.g:1941:2: ( ruleEDouble )
            {
            // InternalKinematics.g:1941:2: ( ruleEDouble )
            // InternalKinematics.g:1942:3: ruleEDouble
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
    // InternalKinematics.g:1951:1: rule__Pose__PitchAssignment_11 : ( ruleEDouble ) ;
    public final void rule__Pose__PitchAssignment_11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:1955:1: ( ( ruleEDouble ) )
            // InternalKinematics.g:1956:2: ( ruleEDouble )
            {
            // InternalKinematics.g:1956:2: ( ruleEDouble )
            // InternalKinematics.g:1957:3: ruleEDouble
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
    // InternalKinematics.g:1966:1: rule__Pose__YawAssignment_13 : ( ruleEDouble ) ;
    public final void rule__Pose__YawAssignment_13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:1970:1: ( ( ruleEDouble ) )
            // InternalKinematics.g:1971:2: ( ruleEDouble )
            {
            // InternalKinematics.g:1971:2: ( ruleEDouble )
            // InternalKinematics.g:1972:3: ruleEDouble
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
    // InternalKinematics.g:1981:1: rule__Limit__EffortAssignment_3 : ( ruleEDouble ) ;
    public final void rule__Limit__EffortAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:1985:1: ( ( ruleEDouble ) )
            // InternalKinematics.g:1986:2: ( ruleEDouble )
            {
            // InternalKinematics.g:1986:2: ( ruleEDouble )
            // InternalKinematics.g:1987:3: ruleEDouble
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
    // InternalKinematics.g:1996:1: rule__Limit__VelocityAssignment_5 : ( ruleEDouble ) ;
    public final void rule__Limit__VelocityAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:2000:1: ( ( ruleEDouble ) )
            // InternalKinematics.g:2001:2: ( ruleEDouble )
            {
            // InternalKinematics.g:2001:2: ( ruleEDouble )
            // InternalKinematics.g:2002:3: ruleEDouble
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
    // InternalKinematics.g:2011:1: rule__Limit__LowerAssignment_6_1 : ( ruleEDouble ) ;
    public final void rule__Limit__LowerAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:2015:1: ( ( ruleEDouble ) )
            // InternalKinematics.g:2016:2: ( ruleEDouble )
            {
            // InternalKinematics.g:2016:2: ( ruleEDouble )
            // InternalKinematics.g:2017:3: ruleEDouble
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
    // InternalKinematics.g:2026:1: rule__Limit__UpperAssignment_7_1 : ( ruleEDouble ) ;
    public final void rule__Limit__UpperAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:2030:1: ( ( ruleEDouble ) )
            // InternalKinematics.g:2031:2: ( ruleEDouble )
            {
            // InternalKinematics.g:2031:2: ( ruleEDouble )
            // InternalKinematics.g:2032:3: ruleEDouble
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
    // InternalKinematics.g:2041:1: rule__Axis__XAssignment_3 : ( ruleEDouble ) ;
    public final void rule__Axis__XAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:2045:1: ( ( ruleEDouble ) )
            // InternalKinematics.g:2046:2: ( ruleEDouble )
            {
            // InternalKinematics.g:2046:2: ( ruleEDouble )
            // InternalKinematics.g:2047:3: ruleEDouble
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
    // InternalKinematics.g:2056:1: rule__Axis__YAssignment_5 : ( ruleEDouble ) ;
    public final void rule__Axis__YAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:2060:1: ( ( ruleEDouble ) )
            // InternalKinematics.g:2061:2: ( ruleEDouble )
            {
            // InternalKinematics.g:2061:2: ( ruleEDouble )
            // InternalKinematics.g:2062:3: ruleEDouble
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
    // InternalKinematics.g:2071:1: rule__Axis__ZAssignment_7 : ( ruleEDouble ) ;
    public final void rule__Axis__ZAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKinematics.g:2075:1: ( ( ruleEDouble ) )
            // InternalKinematics.g:2076:2: ( ruleEDouble )
            {
            // InternalKinematics.g:2076:2: ( ruleEDouble )
            // InternalKinematics.g:2077:3: ruleEDouble
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000038000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000001400000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000006800000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000006000800000L});

}