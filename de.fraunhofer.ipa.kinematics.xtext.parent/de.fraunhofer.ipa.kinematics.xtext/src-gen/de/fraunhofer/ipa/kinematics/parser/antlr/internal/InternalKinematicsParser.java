package de.fraunhofer.ipa.kinematics.parser.antlr.internal;

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
import de.fraunhofer.ipa.kinematics.services.KinematicsGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalKinematicsParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_DOUBLE", "RULE_DIGIT", "RULE_BOOLEAN", "RULE_DECINT", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Joint'", "'{'", "'type'", "'parent'", "'child'", "'origin'", "'limit'", "'axis'", "'}'", "'Pose'", "'x'", "'y'", "'z'", "'roll'", "'pitch'", "'yaw'", "'Limit'", "'effort'", "'velocity'", "'lower'", "'upper'", "'Axis'", "'fixed'", "'prismatic'", "'revolute'"
    };
    public static final int RULE_BOOLEAN=8;
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=12;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__37=37;
    public static final int RULE_DOUBLE=6;
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
    public static final int RULE_ID=5;
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

        public InternalKinematicsParser(TokenStream input, KinematicsGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Joint";
       	}

       	@Override
       	protected KinematicsGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleJoint"
    // InternalKinematics.g:65:1: entryRuleJoint returns [EObject current=null] : iv_ruleJoint= ruleJoint EOF ;
    public final EObject entryRuleJoint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJoint = null;


        try {
            // InternalKinematics.g:65:46: (iv_ruleJoint= ruleJoint EOF )
            // InternalKinematics.g:66:2: iv_ruleJoint= ruleJoint EOF
            {
             newCompositeNode(grammarAccess.getJointRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleJoint=ruleJoint();

            state._fsp--;

             current =iv_ruleJoint; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleJoint"


    // $ANTLR start "ruleJoint"
    // InternalKinematics.g:72:1: ruleJoint returns [EObject current=null] : (otherlv_0= 'Joint' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'type' ( (lv_type_4_0= ruleJointType ) ) otherlv_5= 'parent' ( ( ruleEString ) ) (otherlv_7= 'child' ( ( ruleEString ) ) )? otherlv_9= 'origin' ( (lv_origin_10_0= rulePose ) ) (otherlv_11= 'limit' ( (lv_limit_12_0= ruleLimit ) ) )? (otherlv_13= 'axis' ( (lv_axis_14_0= ruleAxis ) ) )? otherlv_15= '}' ) ;
    public final EObject ruleJoint() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        Enumerator lv_type_4_0 = null;

        EObject lv_origin_10_0 = null;

        EObject lv_limit_12_0 = null;

        EObject lv_axis_14_0 = null;



        	enterRule();

        try {
            // InternalKinematics.g:78:2: ( (otherlv_0= 'Joint' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'type' ( (lv_type_4_0= ruleJointType ) ) otherlv_5= 'parent' ( ( ruleEString ) ) (otherlv_7= 'child' ( ( ruleEString ) ) )? otherlv_9= 'origin' ( (lv_origin_10_0= rulePose ) ) (otherlv_11= 'limit' ( (lv_limit_12_0= ruleLimit ) ) )? (otherlv_13= 'axis' ( (lv_axis_14_0= ruleAxis ) ) )? otherlv_15= '}' ) )
            // InternalKinematics.g:79:2: (otherlv_0= 'Joint' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'type' ( (lv_type_4_0= ruleJointType ) ) otherlv_5= 'parent' ( ( ruleEString ) ) (otherlv_7= 'child' ( ( ruleEString ) ) )? otherlv_9= 'origin' ( (lv_origin_10_0= rulePose ) ) (otherlv_11= 'limit' ( (lv_limit_12_0= ruleLimit ) ) )? (otherlv_13= 'axis' ( (lv_axis_14_0= ruleAxis ) ) )? otherlv_15= '}' )
            {
            // InternalKinematics.g:79:2: (otherlv_0= 'Joint' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'type' ( (lv_type_4_0= ruleJointType ) ) otherlv_5= 'parent' ( ( ruleEString ) ) (otherlv_7= 'child' ( ( ruleEString ) ) )? otherlv_9= 'origin' ( (lv_origin_10_0= rulePose ) ) (otherlv_11= 'limit' ( (lv_limit_12_0= ruleLimit ) ) )? (otherlv_13= 'axis' ( (lv_axis_14_0= ruleAxis ) ) )? otherlv_15= '}' )
            // InternalKinematics.g:80:3: otherlv_0= 'Joint' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'type' ( (lv_type_4_0= ruleJointType ) ) otherlv_5= 'parent' ( ( ruleEString ) ) (otherlv_7= 'child' ( ( ruleEString ) ) )? otherlv_9= 'origin' ( (lv_origin_10_0= rulePose ) ) (otherlv_11= 'limit' ( (lv_limit_12_0= ruleLimit ) ) )? (otherlv_13= 'axis' ( (lv_axis_14_0= ruleAxis ) ) )? otherlv_15= '}'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getJointAccess().getJointKeyword_0());
            		
            // InternalKinematics.g:84:3: ( (lv_name_1_0= ruleEString ) )
            // InternalKinematics.g:85:4: (lv_name_1_0= ruleEString )
            {
            // InternalKinematics.g:85:4: (lv_name_1_0= ruleEString )
            // InternalKinematics.g:86:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getJointAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getJointRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"de.fraunhofer.ipa.kinematics.Kinematics.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,16,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getJointAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,17,FOLLOW_6); 

            			newLeafNode(otherlv_3, grammarAccess.getJointAccess().getTypeKeyword_3());
            		
            // InternalKinematics.g:111:3: ( (lv_type_4_0= ruleJointType ) )
            // InternalKinematics.g:112:4: (lv_type_4_0= ruleJointType )
            {
            // InternalKinematics.g:112:4: (lv_type_4_0= ruleJointType )
            // InternalKinematics.g:113:5: lv_type_4_0= ruleJointType
            {

            					newCompositeNode(grammarAccess.getJointAccess().getTypeJointTypeEnumRuleCall_4_0());
            				
            pushFollow(FOLLOW_7);
            lv_type_4_0=ruleJointType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getJointRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_4_0,
            						"de.fraunhofer.ipa.kinematics.Kinematics.JointType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,18,FOLLOW_3); 

            			newLeafNode(otherlv_5, grammarAccess.getJointAccess().getParentKeyword_5());
            		
            // InternalKinematics.g:134:3: ( ( ruleEString ) )
            // InternalKinematics.g:135:4: ( ruleEString )
            {
            // InternalKinematics.g:135:4: ( ruleEString )
            // InternalKinematics.g:136:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getJointRule());
            					}
            				

            					newCompositeNode(grammarAccess.getJointAccess().getParentLinkCrossReference_6_0());
            				
            pushFollow(FOLLOW_8);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalKinematics.g:150:3: (otherlv_7= 'child' ( ( ruleEString ) ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==19) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalKinematics.g:151:4: otherlv_7= 'child' ( ( ruleEString ) )
                    {
                    otherlv_7=(Token)match(input,19,FOLLOW_3); 

                    				newLeafNode(otherlv_7, grammarAccess.getJointAccess().getChildKeyword_7_0());
                    			
                    // InternalKinematics.g:155:4: ( ( ruleEString ) )
                    // InternalKinematics.g:156:5: ( ruleEString )
                    {
                    // InternalKinematics.g:156:5: ( ruleEString )
                    // InternalKinematics.g:157:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getJointRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getJointAccess().getChildLinkCrossReference_7_1_0());
                    					
                    pushFollow(FOLLOW_9);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_9=(Token)match(input,20,FOLLOW_10); 

            			newLeafNode(otherlv_9, grammarAccess.getJointAccess().getOriginKeyword_8());
            		
            // InternalKinematics.g:176:3: ( (lv_origin_10_0= rulePose ) )
            // InternalKinematics.g:177:4: (lv_origin_10_0= rulePose )
            {
            // InternalKinematics.g:177:4: (lv_origin_10_0= rulePose )
            // InternalKinematics.g:178:5: lv_origin_10_0= rulePose
            {

            					newCompositeNode(grammarAccess.getJointAccess().getOriginPoseParserRuleCall_9_0());
            				
            pushFollow(FOLLOW_11);
            lv_origin_10_0=rulePose();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getJointRule());
            					}
            					set(
            						current,
            						"origin",
            						lv_origin_10_0,
            						"de.fraunhofer.ipa.kinematics.Kinematics.Pose");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalKinematics.g:195:3: (otherlv_11= 'limit' ( (lv_limit_12_0= ruleLimit ) ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==21) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalKinematics.g:196:4: otherlv_11= 'limit' ( (lv_limit_12_0= ruleLimit ) )
                    {
                    otherlv_11=(Token)match(input,21,FOLLOW_12); 

                    				newLeafNode(otherlv_11, grammarAccess.getJointAccess().getLimitKeyword_10_0());
                    			
                    // InternalKinematics.g:200:4: ( (lv_limit_12_0= ruleLimit ) )
                    // InternalKinematics.g:201:5: (lv_limit_12_0= ruleLimit )
                    {
                    // InternalKinematics.g:201:5: (lv_limit_12_0= ruleLimit )
                    // InternalKinematics.g:202:6: lv_limit_12_0= ruleLimit
                    {

                    						newCompositeNode(grammarAccess.getJointAccess().getLimitLimitParserRuleCall_10_1_0());
                    					
                    pushFollow(FOLLOW_13);
                    lv_limit_12_0=ruleLimit();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getJointRule());
                    						}
                    						set(
                    							current,
                    							"limit",
                    							lv_limit_12_0,
                    							"de.fraunhofer.ipa.kinematics.Kinematics.Limit");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalKinematics.g:220:3: (otherlv_13= 'axis' ( (lv_axis_14_0= ruleAxis ) ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==22) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalKinematics.g:221:4: otherlv_13= 'axis' ( (lv_axis_14_0= ruleAxis ) )
                    {
                    otherlv_13=(Token)match(input,22,FOLLOW_14); 

                    				newLeafNode(otherlv_13, grammarAccess.getJointAccess().getAxisKeyword_11_0());
                    			
                    // InternalKinematics.g:225:4: ( (lv_axis_14_0= ruleAxis ) )
                    // InternalKinematics.g:226:5: (lv_axis_14_0= ruleAxis )
                    {
                    // InternalKinematics.g:226:5: (lv_axis_14_0= ruleAxis )
                    // InternalKinematics.g:227:6: lv_axis_14_0= ruleAxis
                    {

                    						newCompositeNode(grammarAccess.getJointAccess().getAxisAxisParserRuleCall_11_1_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_axis_14_0=ruleAxis();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getJointRule());
                    						}
                    						set(
                    							current,
                    							"axis",
                    							lv_axis_14_0,
                    							"de.fraunhofer.ipa.kinematics.Kinematics.Axis");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_15=(Token)match(input,23,FOLLOW_2); 

            			newLeafNode(otherlv_15, grammarAccess.getJointAccess().getRightCurlyBracketKeyword_12());
            		

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
    // $ANTLR end "ruleJoint"


    // $ANTLR start "entryRulePose"
    // InternalKinematics.g:253:1: entryRulePose returns [EObject current=null] : iv_rulePose= rulePose EOF ;
    public final EObject entryRulePose() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePose = null;


        try {
            // InternalKinematics.g:253:45: (iv_rulePose= rulePose EOF )
            // InternalKinematics.g:254:2: iv_rulePose= rulePose EOF
            {
             newCompositeNode(grammarAccess.getPoseRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePose=rulePose();

            state._fsp--;

             current =iv_rulePose; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRulePose"


    // $ANTLR start "rulePose"
    // InternalKinematics.g:260:1: rulePose returns [EObject current=null] : (otherlv_0= 'Pose' otherlv_1= '{' otherlv_2= 'x' ( (lv_x_3_0= ruleEDouble ) ) otherlv_4= 'y' ( (lv_y_5_0= ruleEDouble ) ) otherlv_6= 'z' ( (lv_z_7_0= ruleEDouble ) ) otherlv_8= 'roll' ( (lv_roll_9_0= ruleEDouble ) ) otherlv_10= 'pitch' ( (lv_pitch_11_0= ruleEDouble ) ) otherlv_12= 'yaw' ( (lv_yaw_13_0= ruleEDouble ) ) otherlv_14= '}' ) ;
    public final EObject rulePose() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        AntlrDatatypeRuleToken lv_x_3_0 = null;

        AntlrDatatypeRuleToken lv_y_5_0 = null;

        AntlrDatatypeRuleToken lv_z_7_0 = null;

        AntlrDatatypeRuleToken lv_roll_9_0 = null;

        AntlrDatatypeRuleToken lv_pitch_11_0 = null;

        AntlrDatatypeRuleToken lv_yaw_13_0 = null;



        	enterRule();

        try {
            // InternalKinematics.g:266:2: ( (otherlv_0= 'Pose' otherlv_1= '{' otherlv_2= 'x' ( (lv_x_3_0= ruleEDouble ) ) otherlv_4= 'y' ( (lv_y_5_0= ruleEDouble ) ) otherlv_6= 'z' ( (lv_z_7_0= ruleEDouble ) ) otherlv_8= 'roll' ( (lv_roll_9_0= ruleEDouble ) ) otherlv_10= 'pitch' ( (lv_pitch_11_0= ruleEDouble ) ) otherlv_12= 'yaw' ( (lv_yaw_13_0= ruleEDouble ) ) otherlv_14= '}' ) )
            // InternalKinematics.g:267:2: (otherlv_0= 'Pose' otherlv_1= '{' otherlv_2= 'x' ( (lv_x_3_0= ruleEDouble ) ) otherlv_4= 'y' ( (lv_y_5_0= ruleEDouble ) ) otherlv_6= 'z' ( (lv_z_7_0= ruleEDouble ) ) otherlv_8= 'roll' ( (lv_roll_9_0= ruleEDouble ) ) otherlv_10= 'pitch' ( (lv_pitch_11_0= ruleEDouble ) ) otherlv_12= 'yaw' ( (lv_yaw_13_0= ruleEDouble ) ) otherlv_14= '}' )
            {
            // InternalKinematics.g:267:2: (otherlv_0= 'Pose' otherlv_1= '{' otherlv_2= 'x' ( (lv_x_3_0= ruleEDouble ) ) otherlv_4= 'y' ( (lv_y_5_0= ruleEDouble ) ) otherlv_6= 'z' ( (lv_z_7_0= ruleEDouble ) ) otherlv_8= 'roll' ( (lv_roll_9_0= ruleEDouble ) ) otherlv_10= 'pitch' ( (lv_pitch_11_0= ruleEDouble ) ) otherlv_12= 'yaw' ( (lv_yaw_13_0= ruleEDouble ) ) otherlv_14= '}' )
            // InternalKinematics.g:268:3: otherlv_0= 'Pose' otherlv_1= '{' otherlv_2= 'x' ( (lv_x_3_0= ruleEDouble ) ) otherlv_4= 'y' ( (lv_y_5_0= ruleEDouble ) ) otherlv_6= 'z' ( (lv_z_7_0= ruleEDouble ) ) otherlv_8= 'roll' ( (lv_roll_9_0= ruleEDouble ) ) otherlv_10= 'pitch' ( (lv_pitch_11_0= ruleEDouble ) ) otherlv_12= 'yaw' ( (lv_yaw_13_0= ruleEDouble ) ) otherlv_14= '}'
            {
            otherlv_0=(Token)match(input,24,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getPoseAccess().getPoseKeyword_0());
            		
            otherlv_1=(Token)match(input,16,FOLLOW_16); 

            			newLeafNode(otherlv_1, grammarAccess.getPoseAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,25,FOLLOW_17); 

            			newLeafNode(otherlv_2, grammarAccess.getPoseAccess().getXKeyword_2());
            		
            // InternalKinematics.g:280:3: ( (lv_x_3_0= ruleEDouble ) )
            // InternalKinematics.g:281:4: (lv_x_3_0= ruleEDouble )
            {
            // InternalKinematics.g:281:4: (lv_x_3_0= ruleEDouble )
            // InternalKinematics.g:282:5: lv_x_3_0= ruleEDouble
            {

            					newCompositeNode(grammarAccess.getPoseAccess().getXEDoubleParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_18);
            lv_x_3_0=ruleEDouble();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPoseRule());
            					}
            					set(
            						current,
            						"x",
            						lv_x_3_0,
            						"de.fraunhofer.ipa.kinematics.Kinematics.EDouble");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,26,FOLLOW_17); 

            			newLeafNode(otherlv_4, grammarAccess.getPoseAccess().getYKeyword_4());
            		
            // InternalKinematics.g:303:3: ( (lv_y_5_0= ruleEDouble ) )
            // InternalKinematics.g:304:4: (lv_y_5_0= ruleEDouble )
            {
            // InternalKinematics.g:304:4: (lv_y_5_0= ruleEDouble )
            // InternalKinematics.g:305:5: lv_y_5_0= ruleEDouble
            {

            					newCompositeNode(grammarAccess.getPoseAccess().getYEDoubleParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_19);
            lv_y_5_0=ruleEDouble();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPoseRule());
            					}
            					set(
            						current,
            						"y",
            						lv_y_5_0,
            						"de.fraunhofer.ipa.kinematics.Kinematics.EDouble");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,27,FOLLOW_17); 

            			newLeafNode(otherlv_6, grammarAccess.getPoseAccess().getZKeyword_6());
            		
            // InternalKinematics.g:326:3: ( (lv_z_7_0= ruleEDouble ) )
            // InternalKinematics.g:327:4: (lv_z_7_0= ruleEDouble )
            {
            // InternalKinematics.g:327:4: (lv_z_7_0= ruleEDouble )
            // InternalKinematics.g:328:5: lv_z_7_0= ruleEDouble
            {

            					newCompositeNode(grammarAccess.getPoseAccess().getZEDoubleParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_20);
            lv_z_7_0=ruleEDouble();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPoseRule());
            					}
            					set(
            						current,
            						"z",
            						lv_z_7_0,
            						"de.fraunhofer.ipa.kinematics.Kinematics.EDouble");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_8=(Token)match(input,28,FOLLOW_17); 

            			newLeafNode(otherlv_8, grammarAccess.getPoseAccess().getRollKeyword_8());
            		
            // InternalKinematics.g:349:3: ( (lv_roll_9_0= ruleEDouble ) )
            // InternalKinematics.g:350:4: (lv_roll_9_0= ruleEDouble )
            {
            // InternalKinematics.g:350:4: (lv_roll_9_0= ruleEDouble )
            // InternalKinematics.g:351:5: lv_roll_9_0= ruleEDouble
            {

            					newCompositeNode(grammarAccess.getPoseAccess().getRollEDoubleParserRuleCall_9_0());
            				
            pushFollow(FOLLOW_21);
            lv_roll_9_0=ruleEDouble();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPoseRule());
            					}
            					set(
            						current,
            						"roll",
            						lv_roll_9_0,
            						"de.fraunhofer.ipa.kinematics.Kinematics.EDouble");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_10=(Token)match(input,29,FOLLOW_17); 

            			newLeafNode(otherlv_10, grammarAccess.getPoseAccess().getPitchKeyword_10());
            		
            // InternalKinematics.g:372:3: ( (lv_pitch_11_0= ruleEDouble ) )
            // InternalKinematics.g:373:4: (lv_pitch_11_0= ruleEDouble )
            {
            // InternalKinematics.g:373:4: (lv_pitch_11_0= ruleEDouble )
            // InternalKinematics.g:374:5: lv_pitch_11_0= ruleEDouble
            {

            					newCompositeNode(grammarAccess.getPoseAccess().getPitchEDoubleParserRuleCall_11_0());
            				
            pushFollow(FOLLOW_22);
            lv_pitch_11_0=ruleEDouble();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPoseRule());
            					}
            					set(
            						current,
            						"pitch",
            						lv_pitch_11_0,
            						"de.fraunhofer.ipa.kinematics.Kinematics.EDouble");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_12=(Token)match(input,30,FOLLOW_17); 

            			newLeafNode(otherlv_12, grammarAccess.getPoseAccess().getYawKeyword_12());
            		
            // InternalKinematics.g:395:3: ( (lv_yaw_13_0= ruleEDouble ) )
            // InternalKinematics.g:396:4: (lv_yaw_13_0= ruleEDouble )
            {
            // InternalKinematics.g:396:4: (lv_yaw_13_0= ruleEDouble )
            // InternalKinematics.g:397:5: lv_yaw_13_0= ruleEDouble
            {

            					newCompositeNode(grammarAccess.getPoseAccess().getYawEDoubleParserRuleCall_13_0());
            				
            pushFollow(FOLLOW_15);
            lv_yaw_13_0=ruleEDouble();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPoseRule());
            					}
            					set(
            						current,
            						"yaw",
            						lv_yaw_13_0,
            						"de.fraunhofer.ipa.kinematics.Kinematics.EDouble");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_14=(Token)match(input,23,FOLLOW_2); 

            			newLeafNode(otherlv_14, grammarAccess.getPoseAccess().getRightCurlyBracketKeyword_14());
            		

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
    // $ANTLR end "rulePose"


    // $ANTLR start "entryRuleLimit"
    // InternalKinematics.g:422:1: entryRuleLimit returns [EObject current=null] : iv_ruleLimit= ruleLimit EOF ;
    public final EObject entryRuleLimit() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLimit = null;


        try {
            // InternalKinematics.g:422:46: (iv_ruleLimit= ruleLimit EOF )
            // InternalKinematics.g:423:2: iv_ruleLimit= ruleLimit EOF
            {
             newCompositeNode(grammarAccess.getLimitRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLimit=ruleLimit();

            state._fsp--;

             current =iv_ruleLimit; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleLimit"


    // $ANTLR start "ruleLimit"
    // InternalKinematics.g:429:1: ruleLimit returns [EObject current=null] : (otherlv_0= 'Limit' otherlv_1= '{' otherlv_2= 'effort' ( (lv_effort_3_0= ruleEDouble ) ) otherlv_4= 'velocity' ( (lv_velocity_5_0= ruleEDouble ) ) (otherlv_6= 'lower' ( (lv_lower_7_0= ruleEDouble ) ) )? (otherlv_8= 'upper' ( (lv_upper_9_0= ruleEDouble ) ) )? otherlv_10= '}' ) ;
    public final EObject ruleLimit() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        AntlrDatatypeRuleToken lv_effort_3_0 = null;

        AntlrDatatypeRuleToken lv_velocity_5_0 = null;

        AntlrDatatypeRuleToken lv_lower_7_0 = null;

        AntlrDatatypeRuleToken lv_upper_9_0 = null;



        	enterRule();

        try {
            // InternalKinematics.g:435:2: ( (otherlv_0= 'Limit' otherlv_1= '{' otherlv_2= 'effort' ( (lv_effort_3_0= ruleEDouble ) ) otherlv_4= 'velocity' ( (lv_velocity_5_0= ruleEDouble ) ) (otherlv_6= 'lower' ( (lv_lower_7_0= ruleEDouble ) ) )? (otherlv_8= 'upper' ( (lv_upper_9_0= ruleEDouble ) ) )? otherlv_10= '}' ) )
            // InternalKinematics.g:436:2: (otherlv_0= 'Limit' otherlv_1= '{' otherlv_2= 'effort' ( (lv_effort_3_0= ruleEDouble ) ) otherlv_4= 'velocity' ( (lv_velocity_5_0= ruleEDouble ) ) (otherlv_6= 'lower' ( (lv_lower_7_0= ruleEDouble ) ) )? (otherlv_8= 'upper' ( (lv_upper_9_0= ruleEDouble ) ) )? otherlv_10= '}' )
            {
            // InternalKinematics.g:436:2: (otherlv_0= 'Limit' otherlv_1= '{' otherlv_2= 'effort' ( (lv_effort_3_0= ruleEDouble ) ) otherlv_4= 'velocity' ( (lv_velocity_5_0= ruleEDouble ) ) (otherlv_6= 'lower' ( (lv_lower_7_0= ruleEDouble ) ) )? (otherlv_8= 'upper' ( (lv_upper_9_0= ruleEDouble ) ) )? otherlv_10= '}' )
            // InternalKinematics.g:437:3: otherlv_0= 'Limit' otherlv_1= '{' otherlv_2= 'effort' ( (lv_effort_3_0= ruleEDouble ) ) otherlv_4= 'velocity' ( (lv_velocity_5_0= ruleEDouble ) ) (otherlv_6= 'lower' ( (lv_lower_7_0= ruleEDouble ) ) )? (otherlv_8= 'upper' ( (lv_upper_9_0= ruleEDouble ) ) )? otherlv_10= '}'
            {
            otherlv_0=(Token)match(input,31,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getLimitAccess().getLimitKeyword_0());
            		
            otherlv_1=(Token)match(input,16,FOLLOW_23); 

            			newLeafNode(otherlv_1, grammarAccess.getLimitAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,32,FOLLOW_17); 

            			newLeafNode(otherlv_2, grammarAccess.getLimitAccess().getEffortKeyword_2());
            		
            // InternalKinematics.g:449:3: ( (lv_effort_3_0= ruleEDouble ) )
            // InternalKinematics.g:450:4: (lv_effort_3_0= ruleEDouble )
            {
            // InternalKinematics.g:450:4: (lv_effort_3_0= ruleEDouble )
            // InternalKinematics.g:451:5: lv_effort_3_0= ruleEDouble
            {

            					newCompositeNode(grammarAccess.getLimitAccess().getEffortEDoubleParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_24);
            lv_effort_3_0=ruleEDouble();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLimitRule());
            					}
            					set(
            						current,
            						"effort",
            						lv_effort_3_0,
            						"de.fraunhofer.ipa.kinematics.Kinematics.EDouble");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,33,FOLLOW_17); 

            			newLeafNode(otherlv_4, grammarAccess.getLimitAccess().getVelocityKeyword_4());
            		
            // InternalKinematics.g:472:3: ( (lv_velocity_5_0= ruleEDouble ) )
            // InternalKinematics.g:473:4: (lv_velocity_5_0= ruleEDouble )
            {
            // InternalKinematics.g:473:4: (lv_velocity_5_0= ruleEDouble )
            // InternalKinematics.g:474:5: lv_velocity_5_0= ruleEDouble
            {

            					newCompositeNode(grammarAccess.getLimitAccess().getVelocityEDoubleParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_25);
            lv_velocity_5_0=ruleEDouble();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLimitRule());
            					}
            					set(
            						current,
            						"velocity",
            						lv_velocity_5_0,
            						"de.fraunhofer.ipa.kinematics.Kinematics.EDouble");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalKinematics.g:491:3: (otherlv_6= 'lower' ( (lv_lower_7_0= ruleEDouble ) ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==34) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalKinematics.g:492:4: otherlv_6= 'lower' ( (lv_lower_7_0= ruleEDouble ) )
                    {
                    otherlv_6=(Token)match(input,34,FOLLOW_17); 

                    				newLeafNode(otherlv_6, grammarAccess.getLimitAccess().getLowerKeyword_6_0());
                    			
                    // InternalKinematics.g:496:4: ( (lv_lower_7_0= ruleEDouble ) )
                    // InternalKinematics.g:497:5: (lv_lower_7_0= ruleEDouble )
                    {
                    // InternalKinematics.g:497:5: (lv_lower_7_0= ruleEDouble )
                    // InternalKinematics.g:498:6: lv_lower_7_0= ruleEDouble
                    {

                    						newCompositeNode(grammarAccess.getLimitAccess().getLowerEDoubleParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_26);
                    lv_lower_7_0=ruleEDouble();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getLimitRule());
                    						}
                    						set(
                    							current,
                    							"lower",
                    							lv_lower_7_0,
                    							"de.fraunhofer.ipa.kinematics.Kinematics.EDouble");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalKinematics.g:516:3: (otherlv_8= 'upper' ( (lv_upper_9_0= ruleEDouble ) ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==35) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalKinematics.g:517:4: otherlv_8= 'upper' ( (lv_upper_9_0= ruleEDouble ) )
                    {
                    otherlv_8=(Token)match(input,35,FOLLOW_17); 

                    				newLeafNode(otherlv_8, grammarAccess.getLimitAccess().getUpperKeyword_7_0());
                    			
                    // InternalKinematics.g:521:4: ( (lv_upper_9_0= ruleEDouble ) )
                    // InternalKinematics.g:522:5: (lv_upper_9_0= ruleEDouble )
                    {
                    // InternalKinematics.g:522:5: (lv_upper_9_0= ruleEDouble )
                    // InternalKinematics.g:523:6: lv_upper_9_0= ruleEDouble
                    {

                    						newCompositeNode(grammarAccess.getLimitAccess().getUpperEDoubleParserRuleCall_7_1_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_upper_9_0=ruleEDouble();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getLimitRule());
                    						}
                    						set(
                    							current,
                    							"upper",
                    							lv_upper_9_0,
                    							"de.fraunhofer.ipa.kinematics.Kinematics.EDouble");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_10=(Token)match(input,23,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getLimitAccess().getRightCurlyBracketKeyword_8());
            		

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
    // $ANTLR end "ruleLimit"


    // $ANTLR start "entryRuleAxis"
    // InternalKinematics.g:549:1: entryRuleAxis returns [EObject current=null] : iv_ruleAxis= ruleAxis EOF ;
    public final EObject entryRuleAxis() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAxis = null;


        try {
            // InternalKinematics.g:549:45: (iv_ruleAxis= ruleAxis EOF )
            // InternalKinematics.g:550:2: iv_ruleAxis= ruleAxis EOF
            {
             newCompositeNode(grammarAccess.getAxisRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAxis=ruleAxis();

            state._fsp--;

             current =iv_ruleAxis; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleAxis"


    // $ANTLR start "ruleAxis"
    // InternalKinematics.g:556:1: ruleAxis returns [EObject current=null] : (otherlv_0= 'Axis' otherlv_1= '{' otherlv_2= 'x' ( (lv_x_3_0= ruleEDouble ) ) otherlv_4= 'y' ( (lv_y_5_0= ruleEDouble ) ) otherlv_6= 'z' ( (lv_z_7_0= ruleEDouble ) ) otherlv_8= '}' ) ;
    public final EObject ruleAxis() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_x_3_0 = null;

        AntlrDatatypeRuleToken lv_y_5_0 = null;

        AntlrDatatypeRuleToken lv_z_7_0 = null;



        	enterRule();

        try {
            // InternalKinematics.g:562:2: ( (otherlv_0= 'Axis' otherlv_1= '{' otherlv_2= 'x' ( (lv_x_3_0= ruleEDouble ) ) otherlv_4= 'y' ( (lv_y_5_0= ruleEDouble ) ) otherlv_6= 'z' ( (lv_z_7_0= ruleEDouble ) ) otherlv_8= '}' ) )
            // InternalKinematics.g:563:2: (otherlv_0= 'Axis' otherlv_1= '{' otherlv_2= 'x' ( (lv_x_3_0= ruleEDouble ) ) otherlv_4= 'y' ( (lv_y_5_0= ruleEDouble ) ) otherlv_6= 'z' ( (lv_z_7_0= ruleEDouble ) ) otherlv_8= '}' )
            {
            // InternalKinematics.g:563:2: (otherlv_0= 'Axis' otherlv_1= '{' otherlv_2= 'x' ( (lv_x_3_0= ruleEDouble ) ) otherlv_4= 'y' ( (lv_y_5_0= ruleEDouble ) ) otherlv_6= 'z' ( (lv_z_7_0= ruleEDouble ) ) otherlv_8= '}' )
            // InternalKinematics.g:564:3: otherlv_0= 'Axis' otherlv_1= '{' otherlv_2= 'x' ( (lv_x_3_0= ruleEDouble ) ) otherlv_4= 'y' ( (lv_y_5_0= ruleEDouble ) ) otherlv_6= 'z' ( (lv_z_7_0= ruleEDouble ) ) otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,36,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getAxisAccess().getAxisKeyword_0());
            		
            otherlv_1=(Token)match(input,16,FOLLOW_16); 

            			newLeafNode(otherlv_1, grammarAccess.getAxisAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,25,FOLLOW_17); 

            			newLeafNode(otherlv_2, grammarAccess.getAxisAccess().getXKeyword_2());
            		
            // InternalKinematics.g:576:3: ( (lv_x_3_0= ruleEDouble ) )
            // InternalKinematics.g:577:4: (lv_x_3_0= ruleEDouble )
            {
            // InternalKinematics.g:577:4: (lv_x_3_0= ruleEDouble )
            // InternalKinematics.g:578:5: lv_x_3_0= ruleEDouble
            {

            					newCompositeNode(grammarAccess.getAxisAccess().getXEDoubleParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_18);
            lv_x_3_0=ruleEDouble();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAxisRule());
            					}
            					set(
            						current,
            						"x",
            						lv_x_3_0,
            						"de.fraunhofer.ipa.kinematics.Kinematics.EDouble");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,26,FOLLOW_17); 

            			newLeafNode(otherlv_4, grammarAccess.getAxisAccess().getYKeyword_4());
            		
            // InternalKinematics.g:599:3: ( (lv_y_5_0= ruleEDouble ) )
            // InternalKinematics.g:600:4: (lv_y_5_0= ruleEDouble )
            {
            // InternalKinematics.g:600:4: (lv_y_5_0= ruleEDouble )
            // InternalKinematics.g:601:5: lv_y_5_0= ruleEDouble
            {

            					newCompositeNode(grammarAccess.getAxisAccess().getYEDoubleParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_19);
            lv_y_5_0=ruleEDouble();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAxisRule());
            					}
            					set(
            						current,
            						"y",
            						lv_y_5_0,
            						"de.fraunhofer.ipa.kinematics.Kinematics.EDouble");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,27,FOLLOW_17); 

            			newLeafNode(otherlv_6, grammarAccess.getAxisAccess().getZKeyword_6());
            		
            // InternalKinematics.g:622:3: ( (lv_z_7_0= ruleEDouble ) )
            // InternalKinematics.g:623:4: (lv_z_7_0= ruleEDouble )
            {
            // InternalKinematics.g:623:4: (lv_z_7_0= ruleEDouble )
            // InternalKinematics.g:624:5: lv_z_7_0= ruleEDouble
            {

            					newCompositeNode(grammarAccess.getAxisAccess().getZEDoubleParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_15);
            lv_z_7_0=ruleEDouble();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAxisRule());
            					}
            					set(
            						current,
            						"z",
            						lv_z_7_0,
            						"de.fraunhofer.ipa.kinematics.Kinematics.EDouble");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_8=(Token)match(input,23,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getAxisAccess().getRightCurlyBracketKeyword_8());
            		

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
    // $ANTLR end "ruleAxis"


    // $ANTLR start "entryRuleEString"
    // InternalKinematics.g:649:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalKinematics.g:649:47: (iv_ruleEString= ruleEString EOF )
            // InternalKinematics.g:650:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalKinematics.g:656:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalKinematics.g:662:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalKinematics.g:663:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalKinematics.g:663:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_STRING) ) {
                alt6=1;
            }
            else if ( (LA6_0==RULE_ID) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalKinematics.g:664:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalKinematics.g:672:3: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_2); 

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


    // $ANTLR start "entryRuleEDouble"
    // InternalKinematics.g:683:1: entryRuleEDouble returns [String current=null] : iv_ruleEDouble= ruleEDouble EOF ;
    public final String entryRuleEDouble() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEDouble = null;


        try {
            // InternalKinematics.g:683:47: (iv_ruleEDouble= ruleEDouble EOF )
            // InternalKinematics.g:684:2: iv_ruleEDouble= ruleEDouble EOF
            {
             newCompositeNode(grammarAccess.getEDoubleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEDouble=ruleEDouble();

            state._fsp--;

             current =iv_ruleEDouble.getText(); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleEDouble"


    // $ANTLR start "ruleEDouble"
    // InternalKinematics.g:690:1: ruleEDouble returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_DOUBLE_0= RULE_DOUBLE ;
    public final AntlrDatatypeRuleToken ruleEDouble() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_DOUBLE_0=null;


        	enterRule();

        try {
            // InternalKinematics.g:696:2: (this_DOUBLE_0= RULE_DOUBLE )
            // InternalKinematics.g:697:2: this_DOUBLE_0= RULE_DOUBLE
            {
            this_DOUBLE_0=(Token)match(input,RULE_DOUBLE,FOLLOW_2); 

            		current.merge(this_DOUBLE_0);
            	

            		newLeafNode(this_DOUBLE_0, grammarAccess.getEDoubleAccess().getDOUBLETerminalRuleCall());
            	

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
    // $ANTLR end "ruleEDouble"


    // $ANTLR start "ruleJointType"
    // InternalKinematics.g:707:1: ruleJointType returns [Enumerator current=null] : ( (enumLiteral_0= 'fixed' ) | (enumLiteral_1= 'prismatic' ) | (enumLiteral_2= 'revolute' ) ) ;
    public final Enumerator ruleJointType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalKinematics.g:713:2: ( ( (enumLiteral_0= 'fixed' ) | (enumLiteral_1= 'prismatic' ) | (enumLiteral_2= 'revolute' ) ) )
            // InternalKinematics.g:714:2: ( (enumLiteral_0= 'fixed' ) | (enumLiteral_1= 'prismatic' ) | (enumLiteral_2= 'revolute' ) )
            {
            // InternalKinematics.g:714:2: ( (enumLiteral_0= 'fixed' ) | (enumLiteral_1= 'prismatic' ) | (enumLiteral_2= 'revolute' ) )
            int alt7=3;
            switch ( input.LA(1) ) {
            case 37:
                {
                alt7=1;
                }
                break;
            case 38:
                {
                alt7=2;
                }
                break;
            case 39:
                {
                alt7=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalKinematics.g:715:3: (enumLiteral_0= 'fixed' )
                    {
                    // InternalKinematics.g:715:3: (enumLiteral_0= 'fixed' )
                    // InternalKinematics.g:716:4: enumLiteral_0= 'fixed'
                    {
                    enumLiteral_0=(Token)match(input,37,FOLLOW_2); 

                    				current = grammarAccess.getJointTypeAccess().getFixedEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getJointTypeAccess().getFixedEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalKinematics.g:723:3: (enumLiteral_1= 'prismatic' )
                    {
                    // InternalKinematics.g:723:3: (enumLiteral_1= 'prismatic' )
                    // InternalKinematics.g:724:4: enumLiteral_1= 'prismatic'
                    {
                    enumLiteral_1=(Token)match(input,38,FOLLOW_2); 

                    				current = grammarAccess.getJointTypeAccess().getPrismaticEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getJointTypeAccess().getPrismaticEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalKinematics.g:731:3: (enumLiteral_2= 'revolute' )
                    {
                    // InternalKinematics.g:731:3: (enumLiteral_2= 'revolute' )
                    // InternalKinematics.g:732:4: enumLiteral_2= 'revolute'
                    {
                    enumLiteral_2=(Token)match(input,39,FOLLOW_2); 

                    				current = grammarAccess.getJointTypeAccess().getRevoluteEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getJointTypeAccess().getRevoluteEnumLiteralDeclaration_2());
                    			

                    }


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
    // $ANTLR end "ruleJointType"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000E000000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000E00000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000C00800000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000800800000L});

}