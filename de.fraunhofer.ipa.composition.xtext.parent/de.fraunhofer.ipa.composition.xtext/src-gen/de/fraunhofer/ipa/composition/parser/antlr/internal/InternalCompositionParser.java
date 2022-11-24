package de.fraunhofer.ipa.composition.parser.antlr.internal;

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
import de.fraunhofer.ipa.composition.services.CompositionGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalCompositionParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_DOUBLE", "RULE_DIGIT", "RULE_BOOLEAN", "RULE_DECINT", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Component'", "'{'", "'name'", "'parameters'", "','", "'}'", "'links'", "'joints'", "'components'", "'('", "')'", "'ComponentInstance'", "'type'", "'Parameter'", "'value'", "'ParameterValue'", "'ParameterType'", "'LinkRef'", "'ref'", "'ParameterPoseType'", "'ParameterStringType'", "'ParameterLinkRefType'", "'ParameterInstance'", "'parameter'", "'Joint'", "'parent'", "'child'", "'origin'", "'limit'", "'axis'", "'Link'", "'Pose'", "'x'", "'y'", "'z'", "'roll'", "'pitch'", "'yaw'", "'Limit'", "'effort'", "'velocity'", "'lower'", "'upper'", "'Axis'", "'fixed'", "'prismatic'", "'revolute'"
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
    public static final int RULE_ID=5;
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
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=12;
    public static final int T__37=37;
    public static final int RULE_DOUBLE=6;
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

        public InternalCompositionParser(TokenStream input, CompositionGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Component";
       	}

       	@Override
       	protected CompositionGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleComponent"
    // InternalComposition.g:65:1: entryRuleComponent returns [EObject current=null] : iv_ruleComponent= ruleComponent EOF ;
    public final EObject entryRuleComponent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponent = null;


        try {
            // InternalComposition.g:65:50: (iv_ruleComponent= ruleComponent EOF )
            // InternalComposition.g:66:2: iv_ruleComponent= ruleComponent EOF
            {
             newCompositeNode(grammarAccess.getComponentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleComponent=ruleComponent();

            state._fsp--;

             current =iv_ruleComponent; 
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
    // $ANTLR end "entryRuleComponent"


    // $ANTLR start "ruleComponent"
    // InternalComposition.g:72:1: ruleComponent returns [EObject current=null] : (otherlv_0= 'Component' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) ) (otherlv_4= 'parameters' otherlv_5= '{' ( (lv_parameters_6_0= ruleParameter ) ) (otherlv_7= ',' ( (lv_parameters_8_0= ruleParameter ) ) )* otherlv_9= '}' )? (otherlv_10= 'links' otherlv_11= '{' ( (lv_links_12_0= ruleLink ) ) (otherlv_13= ',' ( (lv_links_14_0= ruleLink ) ) )* otherlv_15= '}' )? (otherlv_16= 'joints' otherlv_17= '{' ( (lv_joints_18_0= ruleJoint ) ) (otherlv_19= ',' ( (lv_joints_20_0= ruleJoint ) ) )* otherlv_21= '}' )? (otherlv_22= 'components' otherlv_23= '(' ( (lv_components_24_0= ruleComponentInstance ) ) (otherlv_25= ',' ( (lv_components_26_0= ruleComponentInstance ) ) )* otherlv_27= ')' )? otherlv_28= '}' ) ;
    public final EObject ruleComponent() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
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
        AntlrDatatypeRuleToken lv_name_3_0 = null;

        EObject lv_parameters_6_0 = null;

        EObject lv_parameters_8_0 = null;

        EObject lv_links_12_0 = null;

        EObject lv_links_14_0 = null;

        EObject lv_joints_18_0 = null;

        EObject lv_joints_20_0 = null;

        EObject lv_components_24_0 = null;

        EObject lv_components_26_0 = null;



        	enterRule();

        try {
            // InternalComposition.g:78:2: ( (otherlv_0= 'Component' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) ) (otherlv_4= 'parameters' otherlv_5= '{' ( (lv_parameters_6_0= ruleParameter ) ) (otherlv_7= ',' ( (lv_parameters_8_0= ruleParameter ) ) )* otherlv_9= '}' )? (otherlv_10= 'links' otherlv_11= '{' ( (lv_links_12_0= ruleLink ) ) (otherlv_13= ',' ( (lv_links_14_0= ruleLink ) ) )* otherlv_15= '}' )? (otherlv_16= 'joints' otherlv_17= '{' ( (lv_joints_18_0= ruleJoint ) ) (otherlv_19= ',' ( (lv_joints_20_0= ruleJoint ) ) )* otherlv_21= '}' )? (otherlv_22= 'components' otherlv_23= '(' ( (lv_components_24_0= ruleComponentInstance ) ) (otherlv_25= ',' ( (lv_components_26_0= ruleComponentInstance ) ) )* otherlv_27= ')' )? otherlv_28= '}' ) )
            // InternalComposition.g:79:2: (otherlv_0= 'Component' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) ) (otherlv_4= 'parameters' otherlv_5= '{' ( (lv_parameters_6_0= ruleParameter ) ) (otherlv_7= ',' ( (lv_parameters_8_0= ruleParameter ) ) )* otherlv_9= '}' )? (otherlv_10= 'links' otherlv_11= '{' ( (lv_links_12_0= ruleLink ) ) (otherlv_13= ',' ( (lv_links_14_0= ruleLink ) ) )* otherlv_15= '}' )? (otherlv_16= 'joints' otherlv_17= '{' ( (lv_joints_18_0= ruleJoint ) ) (otherlv_19= ',' ( (lv_joints_20_0= ruleJoint ) ) )* otherlv_21= '}' )? (otherlv_22= 'components' otherlv_23= '(' ( (lv_components_24_0= ruleComponentInstance ) ) (otherlv_25= ',' ( (lv_components_26_0= ruleComponentInstance ) ) )* otherlv_27= ')' )? otherlv_28= '}' )
            {
            // InternalComposition.g:79:2: (otherlv_0= 'Component' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) ) (otherlv_4= 'parameters' otherlv_5= '{' ( (lv_parameters_6_0= ruleParameter ) ) (otherlv_7= ',' ( (lv_parameters_8_0= ruleParameter ) ) )* otherlv_9= '}' )? (otherlv_10= 'links' otherlv_11= '{' ( (lv_links_12_0= ruleLink ) ) (otherlv_13= ',' ( (lv_links_14_0= ruleLink ) ) )* otherlv_15= '}' )? (otherlv_16= 'joints' otherlv_17= '{' ( (lv_joints_18_0= ruleJoint ) ) (otherlv_19= ',' ( (lv_joints_20_0= ruleJoint ) ) )* otherlv_21= '}' )? (otherlv_22= 'components' otherlv_23= '(' ( (lv_components_24_0= ruleComponentInstance ) ) (otherlv_25= ',' ( (lv_components_26_0= ruleComponentInstance ) ) )* otherlv_27= ')' )? otherlv_28= '}' )
            // InternalComposition.g:80:3: otherlv_0= 'Component' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) ) (otherlv_4= 'parameters' otherlv_5= '{' ( (lv_parameters_6_0= ruleParameter ) ) (otherlv_7= ',' ( (lv_parameters_8_0= ruleParameter ) ) )* otherlv_9= '}' )? (otherlv_10= 'links' otherlv_11= '{' ( (lv_links_12_0= ruleLink ) ) (otherlv_13= ',' ( (lv_links_14_0= ruleLink ) ) )* otherlv_15= '}' )? (otherlv_16= 'joints' otherlv_17= '{' ( (lv_joints_18_0= ruleJoint ) ) (otherlv_19= ',' ( (lv_joints_20_0= ruleJoint ) ) )* otherlv_21= '}' )? (otherlv_22= 'components' otherlv_23= '(' ( (lv_components_24_0= ruleComponentInstance ) ) (otherlv_25= ',' ( (lv_components_26_0= ruleComponentInstance ) ) )* otherlv_27= ')' )? otherlv_28= '}'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getComponentAccess().getComponentKeyword_0());
            		
            otherlv_1=(Token)match(input,16,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getComponentAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,17,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getComponentAccess().getNameKeyword_2());
            		
            // InternalComposition.g:92:3: ( (lv_name_3_0= ruleEString ) )
            // InternalComposition.g:93:4: (lv_name_3_0= ruleEString )
            {
            // InternalComposition.g:93:4: (lv_name_3_0= ruleEString )
            // InternalComposition.g:94:5: lv_name_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getComponentAccess().getNameEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_6);
            lv_name_3_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getComponentRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_3_0,
            						"de.fraunhofer.ipa.kinematics.Kinematics.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalComposition.g:111:3: (otherlv_4= 'parameters' otherlv_5= '{' ( (lv_parameters_6_0= ruleParameter ) ) (otherlv_7= ',' ( (lv_parameters_8_0= ruleParameter ) ) )* otherlv_9= '}' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==18) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalComposition.g:112:4: otherlv_4= 'parameters' otherlv_5= '{' ( (lv_parameters_6_0= ruleParameter ) ) (otherlv_7= ',' ( (lv_parameters_8_0= ruleParameter ) ) )* otherlv_9= '}'
                    {
                    otherlv_4=(Token)match(input,18,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getComponentAccess().getParametersKeyword_4_0());
                    			
                    otherlv_5=(Token)match(input,16,FOLLOW_7); 

                    				newLeafNode(otherlv_5, grammarAccess.getComponentAccess().getLeftCurlyBracketKeyword_4_1());
                    			
                    // InternalComposition.g:120:4: ( (lv_parameters_6_0= ruleParameter ) )
                    // InternalComposition.g:121:5: (lv_parameters_6_0= ruleParameter )
                    {
                    // InternalComposition.g:121:5: (lv_parameters_6_0= ruleParameter )
                    // InternalComposition.g:122:6: lv_parameters_6_0= ruleParameter
                    {

                    						newCompositeNode(grammarAccess.getComponentAccess().getParametersParameterParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_parameters_6_0=ruleParameter();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getComponentRule());
                    						}
                    						add(
                    							current,
                    							"parameters",
                    							lv_parameters_6_0,
                    							"de.fraunhofer.ipa.composition.Composition.Parameter");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalComposition.g:139:4: (otherlv_7= ',' ( (lv_parameters_8_0= ruleParameter ) ) )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==19) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // InternalComposition.g:140:5: otherlv_7= ',' ( (lv_parameters_8_0= ruleParameter ) )
                    	    {
                    	    otherlv_7=(Token)match(input,19,FOLLOW_7); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getComponentAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalComposition.g:144:5: ( (lv_parameters_8_0= ruleParameter ) )
                    	    // InternalComposition.g:145:6: (lv_parameters_8_0= ruleParameter )
                    	    {
                    	    // InternalComposition.g:145:6: (lv_parameters_8_0= ruleParameter )
                    	    // InternalComposition.g:146:7: lv_parameters_8_0= ruleParameter
                    	    {

                    	    							newCompositeNode(grammarAccess.getComponentAccess().getParametersParameterParserRuleCall_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_8);
                    	    lv_parameters_8_0=ruleParameter();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getComponentRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"parameters",
                    	    								lv_parameters_8_0,
                    	    								"de.fraunhofer.ipa.composition.Composition.Parameter");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop1;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,20,FOLLOW_9); 

                    				newLeafNode(otherlv_9, grammarAccess.getComponentAccess().getRightCurlyBracketKeyword_4_4());
                    			

                    }
                    break;

            }

            // InternalComposition.g:169:3: (otherlv_10= 'links' otherlv_11= '{' ( (lv_links_12_0= ruleLink ) ) (otherlv_13= ',' ( (lv_links_14_0= ruleLink ) ) )* otherlv_15= '}' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==21) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalComposition.g:170:4: otherlv_10= 'links' otherlv_11= '{' ( (lv_links_12_0= ruleLink ) ) (otherlv_13= ',' ( (lv_links_14_0= ruleLink ) ) )* otherlv_15= '}'
                    {
                    otherlv_10=(Token)match(input,21,FOLLOW_3); 

                    				newLeafNode(otherlv_10, grammarAccess.getComponentAccess().getLinksKeyword_5_0());
                    			
                    otherlv_11=(Token)match(input,16,FOLLOW_10); 

                    				newLeafNode(otherlv_11, grammarAccess.getComponentAccess().getLeftCurlyBracketKeyword_5_1());
                    			
                    // InternalComposition.g:178:4: ( (lv_links_12_0= ruleLink ) )
                    // InternalComposition.g:179:5: (lv_links_12_0= ruleLink )
                    {
                    // InternalComposition.g:179:5: (lv_links_12_0= ruleLink )
                    // InternalComposition.g:180:6: lv_links_12_0= ruleLink
                    {

                    						newCompositeNode(grammarAccess.getComponentAccess().getLinksLinkParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_links_12_0=ruleLink();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getComponentRule());
                    						}
                    						add(
                    							current,
                    							"links",
                    							lv_links_12_0,
                    							"de.fraunhofer.ipa.kinematics.Kinematics.Link");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalComposition.g:197:4: (otherlv_13= ',' ( (lv_links_14_0= ruleLink ) ) )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==19) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // InternalComposition.g:198:5: otherlv_13= ',' ( (lv_links_14_0= ruleLink ) )
                    	    {
                    	    otherlv_13=(Token)match(input,19,FOLLOW_10); 

                    	    					newLeafNode(otherlv_13, grammarAccess.getComponentAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalComposition.g:202:5: ( (lv_links_14_0= ruleLink ) )
                    	    // InternalComposition.g:203:6: (lv_links_14_0= ruleLink )
                    	    {
                    	    // InternalComposition.g:203:6: (lv_links_14_0= ruleLink )
                    	    // InternalComposition.g:204:7: lv_links_14_0= ruleLink
                    	    {

                    	    							newCompositeNode(grammarAccess.getComponentAccess().getLinksLinkParserRuleCall_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_8);
                    	    lv_links_14_0=ruleLink();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getComponentRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"links",
                    	    								lv_links_14_0,
                    	    								"de.fraunhofer.ipa.kinematics.Kinematics.Link");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);

                    otherlv_15=(Token)match(input,20,FOLLOW_11); 

                    				newLeafNode(otherlv_15, grammarAccess.getComponentAccess().getRightCurlyBracketKeyword_5_4());
                    			

                    }
                    break;

            }

            // InternalComposition.g:227:3: (otherlv_16= 'joints' otherlv_17= '{' ( (lv_joints_18_0= ruleJoint ) ) (otherlv_19= ',' ( (lv_joints_20_0= ruleJoint ) ) )* otherlv_21= '}' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==22) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalComposition.g:228:4: otherlv_16= 'joints' otherlv_17= '{' ( (lv_joints_18_0= ruleJoint ) ) (otherlv_19= ',' ( (lv_joints_20_0= ruleJoint ) ) )* otherlv_21= '}'
                    {
                    otherlv_16=(Token)match(input,22,FOLLOW_3); 

                    				newLeafNode(otherlv_16, grammarAccess.getComponentAccess().getJointsKeyword_6_0());
                    			
                    otherlv_17=(Token)match(input,16,FOLLOW_12); 

                    				newLeafNode(otherlv_17, grammarAccess.getComponentAccess().getLeftCurlyBracketKeyword_6_1());
                    			
                    // InternalComposition.g:236:4: ( (lv_joints_18_0= ruleJoint ) )
                    // InternalComposition.g:237:5: (lv_joints_18_0= ruleJoint )
                    {
                    // InternalComposition.g:237:5: (lv_joints_18_0= ruleJoint )
                    // InternalComposition.g:238:6: lv_joints_18_0= ruleJoint
                    {

                    						newCompositeNode(grammarAccess.getComponentAccess().getJointsJointParserRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_joints_18_0=ruleJoint();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getComponentRule());
                    						}
                    						add(
                    							current,
                    							"joints",
                    							lv_joints_18_0,
                    							"de.fraunhofer.ipa.kinematics.Kinematics.Joint");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalComposition.g:255:4: (otherlv_19= ',' ( (lv_joints_20_0= ruleJoint ) ) )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==19) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalComposition.g:256:5: otherlv_19= ',' ( (lv_joints_20_0= ruleJoint ) )
                    	    {
                    	    otherlv_19=(Token)match(input,19,FOLLOW_12); 

                    	    					newLeafNode(otherlv_19, grammarAccess.getComponentAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalComposition.g:260:5: ( (lv_joints_20_0= ruleJoint ) )
                    	    // InternalComposition.g:261:6: (lv_joints_20_0= ruleJoint )
                    	    {
                    	    // InternalComposition.g:261:6: (lv_joints_20_0= ruleJoint )
                    	    // InternalComposition.g:262:7: lv_joints_20_0= ruleJoint
                    	    {

                    	    							newCompositeNode(grammarAccess.getComponentAccess().getJointsJointParserRuleCall_6_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_8);
                    	    lv_joints_20_0=ruleJoint();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getComponentRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"joints",
                    	    								lv_joints_20_0,
                    	    								"de.fraunhofer.ipa.kinematics.Kinematics.Joint");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    otherlv_21=(Token)match(input,20,FOLLOW_13); 

                    				newLeafNode(otherlv_21, grammarAccess.getComponentAccess().getRightCurlyBracketKeyword_6_4());
                    			

                    }
                    break;

            }

            // InternalComposition.g:285:3: (otherlv_22= 'components' otherlv_23= '(' ( (lv_components_24_0= ruleComponentInstance ) ) (otherlv_25= ',' ( (lv_components_26_0= ruleComponentInstance ) ) )* otherlv_27= ')' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==23) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalComposition.g:286:4: otherlv_22= 'components' otherlv_23= '(' ( (lv_components_24_0= ruleComponentInstance ) ) (otherlv_25= ',' ( (lv_components_26_0= ruleComponentInstance ) ) )* otherlv_27= ')'
                    {
                    otherlv_22=(Token)match(input,23,FOLLOW_14); 

                    				newLeafNode(otherlv_22, grammarAccess.getComponentAccess().getComponentsKeyword_7_0());
                    			
                    otherlv_23=(Token)match(input,24,FOLLOW_15); 

                    				newLeafNode(otherlv_23, grammarAccess.getComponentAccess().getLeftParenthesisKeyword_7_1());
                    			
                    // InternalComposition.g:294:4: ( (lv_components_24_0= ruleComponentInstance ) )
                    // InternalComposition.g:295:5: (lv_components_24_0= ruleComponentInstance )
                    {
                    // InternalComposition.g:295:5: (lv_components_24_0= ruleComponentInstance )
                    // InternalComposition.g:296:6: lv_components_24_0= ruleComponentInstance
                    {

                    						newCompositeNode(grammarAccess.getComponentAccess().getComponentsComponentInstanceParserRuleCall_7_2_0());
                    					
                    pushFollow(FOLLOW_16);
                    lv_components_24_0=ruleComponentInstance();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getComponentRule());
                    						}
                    						add(
                    							current,
                    							"components",
                    							lv_components_24_0,
                    							"de.fraunhofer.ipa.composition.Composition.ComponentInstance");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalComposition.g:313:4: (otherlv_25= ',' ( (lv_components_26_0= ruleComponentInstance ) ) )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==19) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // InternalComposition.g:314:5: otherlv_25= ',' ( (lv_components_26_0= ruleComponentInstance ) )
                    	    {
                    	    otherlv_25=(Token)match(input,19,FOLLOW_15); 

                    	    					newLeafNode(otherlv_25, grammarAccess.getComponentAccess().getCommaKeyword_7_3_0());
                    	    				
                    	    // InternalComposition.g:318:5: ( (lv_components_26_0= ruleComponentInstance ) )
                    	    // InternalComposition.g:319:6: (lv_components_26_0= ruleComponentInstance )
                    	    {
                    	    // InternalComposition.g:319:6: (lv_components_26_0= ruleComponentInstance )
                    	    // InternalComposition.g:320:7: lv_components_26_0= ruleComponentInstance
                    	    {

                    	    							newCompositeNode(grammarAccess.getComponentAccess().getComponentsComponentInstanceParserRuleCall_7_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_16);
                    	    lv_components_26_0=ruleComponentInstance();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getComponentRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"components",
                    	    								lv_components_26_0,
                    	    								"de.fraunhofer.ipa.composition.Composition.ComponentInstance");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);

                    otherlv_27=(Token)match(input,25,FOLLOW_17); 

                    				newLeafNode(otherlv_27, grammarAccess.getComponentAccess().getRightParenthesisKeyword_7_4());
                    			

                    }
                    break;

            }

            otherlv_28=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_28, grammarAccess.getComponentAccess().getRightCurlyBracketKeyword_8());
            		

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
    // $ANTLR end "ruleComponent"


    // $ANTLR start "entryRuleComponentInstance"
    // InternalComposition.g:351:1: entryRuleComponentInstance returns [EObject current=null] : iv_ruleComponentInstance= ruleComponentInstance EOF ;
    public final EObject entryRuleComponentInstance() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponentInstance = null;


        try {
            // InternalComposition.g:351:58: (iv_ruleComponentInstance= ruleComponentInstance EOF )
            // InternalComposition.g:352:2: iv_ruleComponentInstance= ruleComponentInstance EOF
            {
             newCompositeNode(grammarAccess.getComponentInstanceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleComponentInstance=ruleComponentInstance();

            state._fsp--;

             current =iv_ruleComponentInstance; 
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
    // $ANTLR end "entryRuleComponentInstance"


    // $ANTLR start "ruleComponentInstance"
    // InternalComposition.g:358:1: ruleComponentInstance returns [EObject current=null] : (otherlv_0= 'ComponentInstance' otherlv_1= '{' otherlv_2= 'type' ( ( ruleEString ) ) (otherlv_4= 'parameters' otherlv_5= '(' ( (lv_parameters_6_0= ruleParameterInstance ) ) (otherlv_7= ',' ( (lv_parameters_8_0= ruleParameterInstance ) ) )* otherlv_9= ')' )? otherlv_10= '}' ) ;
    public final EObject ruleComponentInstance() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        EObject lv_parameters_6_0 = null;

        EObject lv_parameters_8_0 = null;



        	enterRule();

        try {
            // InternalComposition.g:364:2: ( (otherlv_0= 'ComponentInstance' otherlv_1= '{' otherlv_2= 'type' ( ( ruleEString ) ) (otherlv_4= 'parameters' otherlv_5= '(' ( (lv_parameters_6_0= ruleParameterInstance ) ) (otherlv_7= ',' ( (lv_parameters_8_0= ruleParameterInstance ) ) )* otherlv_9= ')' )? otherlv_10= '}' ) )
            // InternalComposition.g:365:2: (otherlv_0= 'ComponentInstance' otherlv_1= '{' otherlv_2= 'type' ( ( ruleEString ) ) (otherlv_4= 'parameters' otherlv_5= '(' ( (lv_parameters_6_0= ruleParameterInstance ) ) (otherlv_7= ',' ( (lv_parameters_8_0= ruleParameterInstance ) ) )* otherlv_9= ')' )? otherlv_10= '}' )
            {
            // InternalComposition.g:365:2: (otherlv_0= 'ComponentInstance' otherlv_1= '{' otherlv_2= 'type' ( ( ruleEString ) ) (otherlv_4= 'parameters' otherlv_5= '(' ( (lv_parameters_6_0= ruleParameterInstance ) ) (otherlv_7= ',' ( (lv_parameters_8_0= ruleParameterInstance ) ) )* otherlv_9= ')' )? otherlv_10= '}' )
            // InternalComposition.g:366:3: otherlv_0= 'ComponentInstance' otherlv_1= '{' otherlv_2= 'type' ( ( ruleEString ) ) (otherlv_4= 'parameters' otherlv_5= '(' ( (lv_parameters_6_0= ruleParameterInstance ) ) (otherlv_7= ',' ( (lv_parameters_8_0= ruleParameterInstance ) ) )* otherlv_9= ')' )? otherlv_10= '}'
            {
            otherlv_0=(Token)match(input,26,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getComponentInstanceAccess().getComponentInstanceKeyword_0());
            		
            otherlv_1=(Token)match(input,16,FOLLOW_18); 

            			newLeafNode(otherlv_1, grammarAccess.getComponentInstanceAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,27,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getComponentInstanceAccess().getTypeKeyword_2());
            		
            // InternalComposition.g:378:3: ( ( ruleEString ) )
            // InternalComposition.g:379:4: ( ruleEString )
            {
            // InternalComposition.g:379:4: ( ruleEString )
            // InternalComposition.g:380:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getComponentInstanceRule());
            					}
            				

            					newCompositeNode(grammarAccess.getComponentInstanceAccess().getTypeComponentCrossReference_3_0());
            				
            pushFollow(FOLLOW_19);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalComposition.g:394:3: (otherlv_4= 'parameters' otherlv_5= '(' ( (lv_parameters_6_0= ruleParameterInstance ) ) (otherlv_7= ',' ( (lv_parameters_8_0= ruleParameterInstance ) ) )* otherlv_9= ')' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==18) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalComposition.g:395:4: otherlv_4= 'parameters' otherlv_5= '(' ( (lv_parameters_6_0= ruleParameterInstance ) ) (otherlv_7= ',' ( (lv_parameters_8_0= ruleParameterInstance ) ) )* otherlv_9= ')'
                    {
                    otherlv_4=(Token)match(input,18,FOLLOW_14); 

                    				newLeafNode(otherlv_4, grammarAccess.getComponentInstanceAccess().getParametersKeyword_4_0());
                    			
                    otherlv_5=(Token)match(input,24,FOLLOW_20); 

                    				newLeafNode(otherlv_5, grammarAccess.getComponentInstanceAccess().getLeftParenthesisKeyword_4_1());
                    			
                    // InternalComposition.g:403:4: ( (lv_parameters_6_0= ruleParameterInstance ) )
                    // InternalComposition.g:404:5: (lv_parameters_6_0= ruleParameterInstance )
                    {
                    // InternalComposition.g:404:5: (lv_parameters_6_0= ruleParameterInstance )
                    // InternalComposition.g:405:6: lv_parameters_6_0= ruleParameterInstance
                    {

                    						newCompositeNode(grammarAccess.getComponentInstanceAccess().getParametersParameterInstanceParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_16);
                    lv_parameters_6_0=ruleParameterInstance();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getComponentInstanceRule());
                    						}
                    						add(
                    							current,
                    							"parameters",
                    							lv_parameters_6_0,
                    							"de.fraunhofer.ipa.composition.Composition.ParameterInstance");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalComposition.g:422:4: (otherlv_7= ',' ( (lv_parameters_8_0= ruleParameterInstance ) ) )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==19) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // InternalComposition.g:423:5: otherlv_7= ',' ( (lv_parameters_8_0= ruleParameterInstance ) )
                    	    {
                    	    otherlv_7=(Token)match(input,19,FOLLOW_20); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getComponentInstanceAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalComposition.g:427:5: ( (lv_parameters_8_0= ruleParameterInstance ) )
                    	    // InternalComposition.g:428:6: (lv_parameters_8_0= ruleParameterInstance )
                    	    {
                    	    // InternalComposition.g:428:6: (lv_parameters_8_0= ruleParameterInstance )
                    	    // InternalComposition.g:429:7: lv_parameters_8_0= ruleParameterInstance
                    	    {

                    	    							newCompositeNode(grammarAccess.getComponentInstanceAccess().getParametersParameterInstanceParserRuleCall_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_16);
                    	    lv_parameters_8_0=ruleParameterInstance();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getComponentInstanceRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"parameters",
                    	    								lv_parameters_8_0,
                    	    								"de.fraunhofer.ipa.composition.Composition.ParameterInstance");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,25,FOLLOW_17); 

                    				newLeafNode(otherlv_9, grammarAccess.getComponentInstanceAccess().getRightParenthesisKeyword_4_4());
                    			

                    }
                    break;

            }

            otherlv_10=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getComponentInstanceAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleComponentInstance"


    // $ANTLR start "entryRuleParameterValue"
    // InternalComposition.g:460:1: entryRuleParameterValue returns [EObject current=null] : iv_ruleParameterValue= ruleParameterValue EOF ;
    public final EObject entryRuleParameterValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterValue = null;


        try {
            // InternalComposition.g:460:55: (iv_ruleParameterValue= ruleParameterValue EOF )
            // InternalComposition.g:461:2: iv_ruleParameterValue= ruleParameterValue EOF
            {
             newCompositeNode(grammarAccess.getParameterValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParameterValue=ruleParameterValue();

            state._fsp--;

             current =iv_ruleParameterValue; 
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
    // $ANTLR end "entryRuleParameterValue"


    // $ANTLR start "ruleParameterValue"
    // InternalComposition.g:467:1: ruleParameterValue returns [EObject current=null] : (this_ParameterValue_Impl_0= ruleParameterValue_Impl | this_LinkRef_1= ruleLinkRef ) ;
    public final EObject ruleParameterValue() throws RecognitionException {
        EObject current = null;

        EObject this_ParameterValue_Impl_0 = null;

        EObject this_LinkRef_1 = null;



        	enterRule();

        try {
            // InternalComposition.g:473:2: ( (this_ParameterValue_Impl_0= ruleParameterValue_Impl | this_LinkRef_1= ruleLinkRef ) )
            // InternalComposition.g:474:2: (this_ParameterValue_Impl_0= ruleParameterValue_Impl | this_LinkRef_1= ruleLinkRef )
            {
            // InternalComposition.g:474:2: (this_ParameterValue_Impl_0= ruleParameterValue_Impl | this_LinkRef_1= ruleLinkRef )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==30) ) {
                alt11=1;
            }
            else if ( (LA11_0==32) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalComposition.g:475:3: this_ParameterValue_Impl_0= ruleParameterValue_Impl
                    {

                    			newCompositeNode(grammarAccess.getParameterValueAccess().getParameterValue_ImplParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_ParameterValue_Impl_0=ruleParameterValue_Impl();

                    state._fsp--;


                    			current = this_ParameterValue_Impl_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalComposition.g:484:3: this_LinkRef_1= ruleLinkRef
                    {

                    			newCompositeNode(grammarAccess.getParameterValueAccess().getLinkRefParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_LinkRef_1=ruleLinkRef();

                    state._fsp--;


                    			current = this_LinkRef_1;
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
    // $ANTLR end "ruleParameterValue"


    // $ANTLR start "entryRuleParameterType"
    // InternalComposition.g:496:1: entryRuleParameterType returns [EObject current=null] : iv_ruleParameterType= ruleParameterType EOF ;
    public final EObject entryRuleParameterType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterType = null;


        try {
            // InternalComposition.g:496:54: (iv_ruleParameterType= ruleParameterType EOF )
            // InternalComposition.g:497:2: iv_ruleParameterType= ruleParameterType EOF
            {
             newCompositeNode(grammarAccess.getParameterTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParameterType=ruleParameterType();

            state._fsp--;

             current =iv_ruleParameterType; 
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
    // $ANTLR end "entryRuleParameterType"


    // $ANTLR start "ruleParameterType"
    // InternalComposition.g:503:1: ruleParameterType returns [EObject current=null] : (this_ParameterType_Impl_0= ruleParameterType_Impl | this_ParameterPoseType_1= ruleParameterPoseType | this_ParameterStringType_2= ruleParameterStringType | this_ParameterLinkRefType_3= ruleParameterLinkRefType ) ;
    public final EObject ruleParameterType() throws RecognitionException {
        EObject current = null;

        EObject this_ParameterType_Impl_0 = null;

        EObject this_ParameterPoseType_1 = null;

        EObject this_ParameterStringType_2 = null;

        EObject this_ParameterLinkRefType_3 = null;



        	enterRule();

        try {
            // InternalComposition.g:509:2: ( (this_ParameterType_Impl_0= ruleParameterType_Impl | this_ParameterPoseType_1= ruleParameterPoseType | this_ParameterStringType_2= ruleParameterStringType | this_ParameterLinkRefType_3= ruleParameterLinkRefType ) )
            // InternalComposition.g:510:2: (this_ParameterType_Impl_0= ruleParameterType_Impl | this_ParameterPoseType_1= ruleParameterPoseType | this_ParameterStringType_2= ruleParameterStringType | this_ParameterLinkRefType_3= ruleParameterLinkRefType )
            {
            // InternalComposition.g:510:2: (this_ParameterType_Impl_0= ruleParameterType_Impl | this_ParameterPoseType_1= ruleParameterPoseType | this_ParameterStringType_2= ruleParameterStringType | this_ParameterLinkRefType_3= ruleParameterLinkRefType )
            int alt12=4;
            switch ( input.LA(1) ) {
            case 31:
                {
                alt12=1;
                }
                break;
            case 34:
                {
                alt12=2;
                }
                break;
            case 35:
                {
                alt12=3;
                }
                break;
            case 36:
                {
                alt12=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // InternalComposition.g:511:3: this_ParameterType_Impl_0= ruleParameterType_Impl
                    {

                    			newCompositeNode(grammarAccess.getParameterTypeAccess().getParameterType_ImplParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_ParameterType_Impl_0=ruleParameterType_Impl();

                    state._fsp--;


                    			current = this_ParameterType_Impl_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalComposition.g:520:3: this_ParameterPoseType_1= ruleParameterPoseType
                    {

                    			newCompositeNode(grammarAccess.getParameterTypeAccess().getParameterPoseTypeParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ParameterPoseType_1=ruleParameterPoseType();

                    state._fsp--;


                    			current = this_ParameterPoseType_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalComposition.g:529:3: this_ParameterStringType_2= ruleParameterStringType
                    {

                    			newCompositeNode(grammarAccess.getParameterTypeAccess().getParameterStringTypeParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_ParameterStringType_2=ruleParameterStringType();

                    state._fsp--;


                    			current = this_ParameterStringType_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalComposition.g:538:3: this_ParameterLinkRefType_3= ruleParameterLinkRefType
                    {

                    			newCompositeNode(grammarAccess.getParameterTypeAccess().getParameterLinkRefTypeParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_ParameterLinkRefType_3=ruleParameterLinkRefType();

                    state._fsp--;


                    			current = this_ParameterLinkRefType_3;
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
    // $ANTLR end "ruleParameterType"


    // $ANTLR start "entryRuleParameter"
    // InternalComposition.g:550:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter = null;


        try {
            // InternalComposition.g:550:50: (iv_ruleParameter= ruleParameter EOF )
            // InternalComposition.g:551:2: iv_ruleParameter= ruleParameter EOF
            {
             newCompositeNode(grammarAccess.getParameterRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParameter=ruleParameter();

            state._fsp--;

             current =iv_ruleParameter; 
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
    // $ANTLR end "entryRuleParameter"


    // $ANTLR start "ruleParameter"
    // InternalComposition.g:557:1: ruleParameter returns [EObject current=null] : (otherlv_0= 'Parameter' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'type' ( (lv_type_4_0= ruleParameterType ) ) (otherlv_5= 'value' ( (lv_value_6_0= ruleParameterValue ) ) )? otherlv_7= '}' ) ;
    public final EObject ruleParameter() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_type_4_0 = null;

        EObject lv_value_6_0 = null;



        	enterRule();

        try {
            // InternalComposition.g:563:2: ( (otherlv_0= 'Parameter' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'type' ( (lv_type_4_0= ruleParameterType ) ) (otherlv_5= 'value' ( (lv_value_6_0= ruleParameterValue ) ) )? otherlv_7= '}' ) )
            // InternalComposition.g:564:2: (otherlv_0= 'Parameter' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'type' ( (lv_type_4_0= ruleParameterType ) ) (otherlv_5= 'value' ( (lv_value_6_0= ruleParameterValue ) ) )? otherlv_7= '}' )
            {
            // InternalComposition.g:564:2: (otherlv_0= 'Parameter' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'type' ( (lv_type_4_0= ruleParameterType ) ) (otherlv_5= 'value' ( (lv_value_6_0= ruleParameterValue ) ) )? otherlv_7= '}' )
            // InternalComposition.g:565:3: otherlv_0= 'Parameter' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'type' ( (lv_type_4_0= ruleParameterType ) ) (otherlv_5= 'value' ( (lv_value_6_0= ruleParameterValue ) ) )? otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,28,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getParameterAccess().getParameterKeyword_0());
            		
            // InternalComposition.g:569:3: ( (lv_name_1_0= ruleEString ) )
            // InternalComposition.g:570:4: (lv_name_1_0= ruleEString )
            {
            // InternalComposition.g:570:4: (lv_name_1_0= ruleEString )
            // InternalComposition.g:571:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getParameterAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_3);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getParameterRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"de.fraunhofer.ipa.kinematics.Kinematics.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,16,FOLLOW_18); 

            			newLeafNode(otherlv_2, grammarAccess.getParameterAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,27,FOLLOW_21); 

            			newLeafNode(otherlv_3, grammarAccess.getParameterAccess().getTypeKeyword_3());
            		
            // InternalComposition.g:596:3: ( (lv_type_4_0= ruleParameterType ) )
            // InternalComposition.g:597:4: (lv_type_4_0= ruleParameterType )
            {
            // InternalComposition.g:597:4: (lv_type_4_0= ruleParameterType )
            // InternalComposition.g:598:5: lv_type_4_0= ruleParameterType
            {

            					newCompositeNode(grammarAccess.getParameterAccess().getTypeParameterTypeParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_22);
            lv_type_4_0=ruleParameterType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getParameterRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_4_0,
            						"de.fraunhofer.ipa.composition.Composition.ParameterType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalComposition.g:615:3: (otherlv_5= 'value' ( (lv_value_6_0= ruleParameterValue ) ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==29) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalComposition.g:616:4: otherlv_5= 'value' ( (lv_value_6_0= ruleParameterValue ) )
                    {
                    otherlv_5=(Token)match(input,29,FOLLOW_23); 

                    				newLeafNode(otherlv_5, grammarAccess.getParameterAccess().getValueKeyword_5_0());
                    			
                    // InternalComposition.g:620:4: ( (lv_value_6_0= ruleParameterValue ) )
                    // InternalComposition.g:621:5: (lv_value_6_0= ruleParameterValue )
                    {
                    // InternalComposition.g:621:5: (lv_value_6_0= ruleParameterValue )
                    // InternalComposition.g:622:6: lv_value_6_0= ruleParameterValue
                    {

                    						newCompositeNode(grammarAccess.getParameterAccess().getValueParameterValueParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_17);
                    lv_value_6_0=ruleParameterValue();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParameterRule());
                    						}
                    						set(
                    							current,
                    							"value",
                    							lv_value_6_0,
                    							"de.fraunhofer.ipa.composition.Composition.ParameterValue");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getParameterAccess().getRightCurlyBracketKeyword_6());
            		

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
    // $ANTLR end "ruleParameter"


    // $ANTLR start "entryRuleParameterValue_Impl"
    // InternalComposition.g:648:1: entryRuleParameterValue_Impl returns [EObject current=null] : iv_ruleParameterValue_Impl= ruleParameterValue_Impl EOF ;
    public final EObject entryRuleParameterValue_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterValue_Impl = null;


        try {
            // InternalComposition.g:648:60: (iv_ruleParameterValue_Impl= ruleParameterValue_Impl EOF )
            // InternalComposition.g:649:2: iv_ruleParameterValue_Impl= ruleParameterValue_Impl EOF
            {
             newCompositeNode(grammarAccess.getParameterValue_ImplRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParameterValue_Impl=ruleParameterValue_Impl();

            state._fsp--;

             current =iv_ruleParameterValue_Impl; 
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
    // $ANTLR end "entryRuleParameterValue_Impl"


    // $ANTLR start "ruleParameterValue_Impl"
    // InternalComposition.g:655:1: ruleParameterValue_Impl returns [EObject current=null] : ( () otherlv_1= 'ParameterValue' otherlv_2= '{' (otherlv_3= 'value' ( (lv_value_4_0= ruleEString ) ) )? otherlv_5= '}' ) ;
    public final EObject ruleParameterValue_Impl() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_value_4_0 = null;



        	enterRule();

        try {
            // InternalComposition.g:661:2: ( ( () otherlv_1= 'ParameterValue' otherlv_2= '{' (otherlv_3= 'value' ( (lv_value_4_0= ruleEString ) ) )? otherlv_5= '}' ) )
            // InternalComposition.g:662:2: ( () otherlv_1= 'ParameterValue' otherlv_2= '{' (otherlv_3= 'value' ( (lv_value_4_0= ruleEString ) ) )? otherlv_5= '}' )
            {
            // InternalComposition.g:662:2: ( () otherlv_1= 'ParameterValue' otherlv_2= '{' (otherlv_3= 'value' ( (lv_value_4_0= ruleEString ) ) )? otherlv_5= '}' )
            // InternalComposition.g:663:3: () otherlv_1= 'ParameterValue' otherlv_2= '{' (otherlv_3= 'value' ( (lv_value_4_0= ruleEString ) ) )? otherlv_5= '}'
            {
            // InternalComposition.g:663:3: ()
            // InternalComposition.g:664:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getParameterValue_ImplAccess().getParameterValueAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,30,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getParameterValue_ImplAccess().getParameterValueKeyword_1());
            		
            otherlv_2=(Token)match(input,16,FOLLOW_22); 

            			newLeafNode(otherlv_2, grammarAccess.getParameterValue_ImplAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalComposition.g:678:3: (otherlv_3= 'value' ( (lv_value_4_0= ruleEString ) ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==29) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalComposition.g:679:4: otherlv_3= 'value' ( (lv_value_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,29,FOLLOW_5); 

                    				newLeafNode(otherlv_3, grammarAccess.getParameterValue_ImplAccess().getValueKeyword_3_0());
                    			
                    // InternalComposition.g:683:4: ( (lv_value_4_0= ruleEString ) )
                    // InternalComposition.g:684:5: (lv_value_4_0= ruleEString )
                    {
                    // InternalComposition.g:684:5: (lv_value_4_0= ruleEString )
                    // InternalComposition.g:685:6: lv_value_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getParameterValue_ImplAccess().getValueEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_17);
                    lv_value_4_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParameterValue_ImplRule());
                    						}
                    						set(
                    							current,
                    							"value",
                    							lv_value_4_0,
                    							"de.fraunhofer.ipa.kinematics.Kinematics.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getParameterValue_ImplAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleParameterValue_Impl"


    // $ANTLR start "entryRuleParameterType_Impl"
    // InternalComposition.g:711:1: entryRuleParameterType_Impl returns [EObject current=null] : iv_ruleParameterType_Impl= ruleParameterType_Impl EOF ;
    public final EObject entryRuleParameterType_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterType_Impl = null;


        try {
            // InternalComposition.g:711:59: (iv_ruleParameterType_Impl= ruleParameterType_Impl EOF )
            // InternalComposition.g:712:2: iv_ruleParameterType_Impl= ruleParameterType_Impl EOF
            {
             newCompositeNode(grammarAccess.getParameterType_ImplRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParameterType_Impl=ruleParameterType_Impl();

            state._fsp--;

             current =iv_ruleParameterType_Impl; 
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
    // $ANTLR end "entryRuleParameterType_Impl"


    // $ANTLR start "ruleParameterType_Impl"
    // InternalComposition.g:718:1: ruleParameterType_Impl returns [EObject current=null] : ( () otherlv_1= 'ParameterType' ) ;
    public final EObject ruleParameterType_Impl() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalComposition.g:724:2: ( ( () otherlv_1= 'ParameterType' ) )
            // InternalComposition.g:725:2: ( () otherlv_1= 'ParameterType' )
            {
            // InternalComposition.g:725:2: ( () otherlv_1= 'ParameterType' )
            // InternalComposition.g:726:3: () otherlv_1= 'ParameterType'
            {
            // InternalComposition.g:726:3: ()
            // InternalComposition.g:727:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getParameterType_ImplAccess().getParameterTypeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,31,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getParameterType_ImplAccess().getParameterTypeKeyword_1());
            		

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
    // $ANTLR end "ruleParameterType_Impl"


    // $ANTLR start "entryRuleLinkRef"
    // InternalComposition.g:741:1: entryRuleLinkRef returns [EObject current=null] : iv_ruleLinkRef= ruleLinkRef EOF ;
    public final EObject entryRuleLinkRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLinkRef = null;


        try {
            // InternalComposition.g:741:48: (iv_ruleLinkRef= ruleLinkRef EOF )
            // InternalComposition.g:742:2: iv_ruleLinkRef= ruleLinkRef EOF
            {
             newCompositeNode(grammarAccess.getLinkRefRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLinkRef=ruleLinkRef();

            state._fsp--;

             current =iv_ruleLinkRef; 
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
    // $ANTLR end "entryRuleLinkRef"


    // $ANTLR start "ruleLinkRef"
    // InternalComposition.g:748:1: ruleLinkRef returns [EObject current=null] : ( () otherlv_1= 'LinkRef' otherlv_2= '{' (otherlv_3= 'value' ( (lv_value_4_0= ruleEString ) ) )? (otherlv_5= 'ref' ( ( ruleEString ) ) )? otherlv_7= '}' ) ;
    public final EObject ruleLinkRef() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_value_4_0 = null;



        	enterRule();

        try {
            // InternalComposition.g:754:2: ( ( () otherlv_1= 'LinkRef' otherlv_2= '{' (otherlv_3= 'value' ( (lv_value_4_0= ruleEString ) ) )? (otherlv_5= 'ref' ( ( ruleEString ) ) )? otherlv_7= '}' ) )
            // InternalComposition.g:755:2: ( () otherlv_1= 'LinkRef' otherlv_2= '{' (otherlv_3= 'value' ( (lv_value_4_0= ruleEString ) ) )? (otherlv_5= 'ref' ( ( ruleEString ) ) )? otherlv_7= '}' )
            {
            // InternalComposition.g:755:2: ( () otherlv_1= 'LinkRef' otherlv_2= '{' (otherlv_3= 'value' ( (lv_value_4_0= ruleEString ) ) )? (otherlv_5= 'ref' ( ( ruleEString ) ) )? otherlv_7= '}' )
            // InternalComposition.g:756:3: () otherlv_1= 'LinkRef' otherlv_2= '{' (otherlv_3= 'value' ( (lv_value_4_0= ruleEString ) ) )? (otherlv_5= 'ref' ( ( ruleEString ) ) )? otherlv_7= '}'
            {
            // InternalComposition.g:756:3: ()
            // InternalComposition.g:757:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getLinkRefAccess().getLinkRefAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,32,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getLinkRefAccess().getLinkRefKeyword_1());
            		
            otherlv_2=(Token)match(input,16,FOLLOW_24); 

            			newLeafNode(otherlv_2, grammarAccess.getLinkRefAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalComposition.g:771:3: (otherlv_3= 'value' ( (lv_value_4_0= ruleEString ) ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==29) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalComposition.g:772:4: otherlv_3= 'value' ( (lv_value_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,29,FOLLOW_5); 

                    				newLeafNode(otherlv_3, grammarAccess.getLinkRefAccess().getValueKeyword_3_0());
                    			
                    // InternalComposition.g:776:4: ( (lv_value_4_0= ruleEString ) )
                    // InternalComposition.g:777:5: (lv_value_4_0= ruleEString )
                    {
                    // InternalComposition.g:777:5: (lv_value_4_0= ruleEString )
                    // InternalComposition.g:778:6: lv_value_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getLinkRefAccess().getValueEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_25);
                    lv_value_4_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getLinkRefRule());
                    						}
                    						set(
                    							current,
                    							"value",
                    							lv_value_4_0,
                    							"de.fraunhofer.ipa.kinematics.Kinematics.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalComposition.g:796:3: (otherlv_5= 'ref' ( ( ruleEString ) ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==33) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalComposition.g:797:4: otherlv_5= 'ref' ( ( ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,33,FOLLOW_5); 

                    				newLeafNode(otherlv_5, grammarAccess.getLinkRefAccess().getRefKeyword_4_0());
                    			
                    // InternalComposition.g:801:4: ( ( ruleEString ) )
                    // InternalComposition.g:802:5: ( ruleEString )
                    {
                    // InternalComposition.g:802:5: ( ruleEString )
                    // InternalComposition.g:803:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getLinkRefRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getLinkRefAccess().getRefLinkCrossReference_4_1_0());
                    					
                    pushFollow(FOLLOW_17);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getLinkRefAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleLinkRef"


    // $ANTLR start "entryRuleParameterPoseType"
    // InternalComposition.g:826:1: entryRuleParameterPoseType returns [EObject current=null] : iv_ruleParameterPoseType= ruleParameterPoseType EOF ;
    public final EObject entryRuleParameterPoseType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterPoseType = null;


        try {
            // InternalComposition.g:826:58: (iv_ruleParameterPoseType= ruleParameterPoseType EOF )
            // InternalComposition.g:827:2: iv_ruleParameterPoseType= ruleParameterPoseType EOF
            {
             newCompositeNode(grammarAccess.getParameterPoseTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParameterPoseType=ruleParameterPoseType();

            state._fsp--;

             current =iv_ruleParameterPoseType; 
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
    // $ANTLR end "entryRuleParameterPoseType"


    // $ANTLR start "ruleParameterPoseType"
    // InternalComposition.g:833:1: ruleParameterPoseType returns [EObject current=null] : ( () otherlv_1= 'ParameterPoseType' ) ;
    public final EObject ruleParameterPoseType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalComposition.g:839:2: ( ( () otherlv_1= 'ParameterPoseType' ) )
            // InternalComposition.g:840:2: ( () otherlv_1= 'ParameterPoseType' )
            {
            // InternalComposition.g:840:2: ( () otherlv_1= 'ParameterPoseType' )
            // InternalComposition.g:841:3: () otherlv_1= 'ParameterPoseType'
            {
            // InternalComposition.g:841:3: ()
            // InternalComposition.g:842:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getParameterPoseTypeAccess().getParameterPoseTypeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,34,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getParameterPoseTypeAccess().getParameterPoseTypeKeyword_1());
            		

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
    // $ANTLR end "ruleParameterPoseType"


    // $ANTLR start "entryRuleParameterStringType"
    // InternalComposition.g:856:1: entryRuleParameterStringType returns [EObject current=null] : iv_ruleParameterStringType= ruleParameterStringType EOF ;
    public final EObject entryRuleParameterStringType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterStringType = null;


        try {
            // InternalComposition.g:856:60: (iv_ruleParameterStringType= ruleParameterStringType EOF )
            // InternalComposition.g:857:2: iv_ruleParameterStringType= ruleParameterStringType EOF
            {
             newCompositeNode(grammarAccess.getParameterStringTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParameterStringType=ruleParameterStringType();

            state._fsp--;

             current =iv_ruleParameterStringType; 
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
    // $ANTLR end "entryRuleParameterStringType"


    // $ANTLR start "ruleParameterStringType"
    // InternalComposition.g:863:1: ruleParameterStringType returns [EObject current=null] : ( () otherlv_1= 'ParameterStringType' ) ;
    public final EObject ruleParameterStringType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalComposition.g:869:2: ( ( () otherlv_1= 'ParameterStringType' ) )
            // InternalComposition.g:870:2: ( () otherlv_1= 'ParameterStringType' )
            {
            // InternalComposition.g:870:2: ( () otherlv_1= 'ParameterStringType' )
            // InternalComposition.g:871:3: () otherlv_1= 'ParameterStringType'
            {
            // InternalComposition.g:871:3: ()
            // InternalComposition.g:872:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getParameterStringTypeAccess().getParameterStringTypeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,35,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getParameterStringTypeAccess().getParameterStringTypeKeyword_1());
            		

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
    // $ANTLR end "ruleParameterStringType"


    // $ANTLR start "entryRuleParameterLinkRefType"
    // InternalComposition.g:886:1: entryRuleParameterLinkRefType returns [EObject current=null] : iv_ruleParameterLinkRefType= ruleParameterLinkRefType EOF ;
    public final EObject entryRuleParameterLinkRefType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterLinkRefType = null;


        try {
            // InternalComposition.g:886:61: (iv_ruleParameterLinkRefType= ruleParameterLinkRefType EOF )
            // InternalComposition.g:887:2: iv_ruleParameterLinkRefType= ruleParameterLinkRefType EOF
            {
             newCompositeNode(grammarAccess.getParameterLinkRefTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParameterLinkRefType=ruleParameterLinkRefType();

            state._fsp--;

             current =iv_ruleParameterLinkRefType; 
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
    // $ANTLR end "entryRuleParameterLinkRefType"


    // $ANTLR start "ruleParameterLinkRefType"
    // InternalComposition.g:893:1: ruleParameterLinkRefType returns [EObject current=null] : ( () otherlv_1= 'ParameterLinkRefType' ) ;
    public final EObject ruleParameterLinkRefType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalComposition.g:899:2: ( ( () otherlv_1= 'ParameterLinkRefType' ) )
            // InternalComposition.g:900:2: ( () otherlv_1= 'ParameterLinkRefType' )
            {
            // InternalComposition.g:900:2: ( () otherlv_1= 'ParameterLinkRefType' )
            // InternalComposition.g:901:3: () otherlv_1= 'ParameterLinkRefType'
            {
            // InternalComposition.g:901:3: ()
            // InternalComposition.g:902:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getParameterLinkRefTypeAccess().getParameterLinkRefTypeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,36,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getParameterLinkRefTypeAccess().getParameterLinkRefTypeKeyword_1());
            		

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
    // $ANTLR end "ruleParameterLinkRefType"


    // $ANTLR start "entryRuleParameterInstance"
    // InternalComposition.g:916:1: entryRuleParameterInstance returns [EObject current=null] : iv_ruleParameterInstance= ruleParameterInstance EOF ;
    public final EObject entryRuleParameterInstance() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterInstance = null;


        try {
            // InternalComposition.g:916:58: (iv_ruleParameterInstance= ruleParameterInstance EOF )
            // InternalComposition.g:917:2: iv_ruleParameterInstance= ruleParameterInstance EOF
            {
             newCompositeNode(grammarAccess.getParameterInstanceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParameterInstance=ruleParameterInstance();

            state._fsp--;

             current =iv_ruleParameterInstance; 
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
    // $ANTLR end "entryRuleParameterInstance"


    // $ANTLR start "ruleParameterInstance"
    // InternalComposition.g:923:1: ruleParameterInstance returns [EObject current=null] : (otherlv_0= 'ParameterInstance' otherlv_1= '{' otherlv_2= 'parameter' ( ( ruleEString ) ) otherlv_4= 'value' ( (lv_value_5_0= ruleParameterValue ) ) otherlv_6= '}' ) ;
    public final EObject ruleParameterInstance() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_value_5_0 = null;



        	enterRule();

        try {
            // InternalComposition.g:929:2: ( (otherlv_0= 'ParameterInstance' otherlv_1= '{' otherlv_2= 'parameter' ( ( ruleEString ) ) otherlv_4= 'value' ( (lv_value_5_0= ruleParameterValue ) ) otherlv_6= '}' ) )
            // InternalComposition.g:930:2: (otherlv_0= 'ParameterInstance' otherlv_1= '{' otherlv_2= 'parameter' ( ( ruleEString ) ) otherlv_4= 'value' ( (lv_value_5_0= ruleParameterValue ) ) otherlv_6= '}' )
            {
            // InternalComposition.g:930:2: (otherlv_0= 'ParameterInstance' otherlv_1= '{' otherlv_2= 'parameter' ( ( ruleEString ) ) otherlv_4= 'value' ( (lv_value_5_0= ruleParameterValue ) ) otherlv_6= '}' )
            // InternalComposition.g:931:3: otherlv_0= 'ParameterInstance' otherlv_1= '{' otherlv_2= 'parameter' ( ( ruleEString ) ) otherlv_4= 'value' ( (lv_value_5_0= ruleParameterValue ) ) otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,37,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getParameterInstanceAccess().getParameterInstanceKeyword_0());
            		
            otherlv_1=(Token)match(input,16,FOLLOW_26); 

            			newLeafNode(otherlv_1, grammarAccess.getParameterInstanceAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,38,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getParameterInstanceAccess().getParameterKeyword_2());
            		
            // InternalComposition.g:943:3: ( ( ruleEString ) )
            // InternalComposition.g:944:4: ( ruleEString )
            {
            // InternalComposition.g:944:4: ( ruleEString )
            // InternalComposition.g:945:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getParameterInstanceRule());
            					}
            				

            					newCompositeNode(grammarAccess.getParameterInstanceAccess().getParameterParameterCrossReference_3_0());
            				
            pushFollow(FOLLOW_27);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,29,FOLLOW_23); 

            			newLeafNode(otherlv_4, grammarAccess.getParameterInstanceAccess().getValueKeyword_4());
            		
            // InternalComposition.g:963:3: ( (lv_value_5_0= ruleParameterValue ) )
            // InternalComposition.g:964:4: (lv_value_5_0= ruleParameterValue )
            {
            // InternalComposition.g:964:4: (lv_value_5_0= ruleParameterValue )
            // InternalComposition.g:965:5: lv_value_5_0= ruleParameterValue
            {

            					newCompositeNode(grammarAccess.getParameterInstanceAccess().getValueParameterValueParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_17);
            lv_value_5_0=ruleParameterValue();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getParameterInstanceRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_5_0,
            						"de.fraunhofer.ipa.composition.Composition.ParameterValue");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getParameterInstanceAccess().getRightCurlyBracketKeyword_6());
            		

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
    // $ANTLR end "ruleParameterInstance"


    // $ANTLR start "entryRuleJoint"
    // InternalComposition.g:990:1: entryRuleJoint returns [EObject current=null] : iv_ruleJoint= ruleJoint EOF ;
    public final EObject entryRuleJoint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJoint = null;


        try {
            // InternalComposition.g:990:46: (iv_ruleJoint= ruleJoint EOF )
            // InternalComposition.g:991:2: iv_ruleJoint= ruleJoint EOF
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
    // InternalComposition.g:997:1: ruleJoint returns [EObject current=null] : (otherlv_0= 'Joint' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'type' ( (lv_type_4_0= ruleJointType ) ) otherlv_5= 'parent' ( ( ruleEString ) ) (otherlv_7= 'child' ( ( ruleEString ) ) )? otherlv_9= 'origin' ( (lv_origin_10_0= rulePose ) ) (otherlv_11= 'limit' ( (lv_limit_12_0= ruleLimit ) ) )? (otherlv_13= 'axis' ( (lv_axis_14_0= ruleAxis ) ) )? otherlv_15= '}' ) ;
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
            // InternalComposition.g:1003:2: ( (otherlv_0= 'Joint' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'type' ( (lv_type_4_0= ruleJointType ) ) otherlv_5= 'parent' ( ( ruleEString ) ) (otherlv_7= 'child' ( ( ruleEString ) ) )? otherlv_9= 'origin' ( (lv_origin_10_0= rulePose ) ) (otherlv_11= 'limit' ( (lv_limit_12_0= ruleLimit ) ) )? (otherlv_13= 'axis' ( (lv_axis_14_0= ruleAxis ) ) )? otherlv_15= '}' ) )
            // InternalComposition.g:1004:2: (otherlv_0= 'Joint' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'type' ( (lv_type_4_0= ruleJointType ) ) otherlv_5= 'parent' ( ( ruleEString ) ) (otherlv_7= 'child' ( ( ruleEString ) ) )? otherlv_9= 'origin' ( (lv_origin_10_0= rulePose ) ) (otherlv_11= 'limit' ( (lv_limit_12_0= ruleLimit ) ) )? (otherlv_13= 'axis' ( (lv_axis_14_0= ruleAxis ) ) )? otherlv_15= '}' )
            {
            // InternalComposition.g:1004:2: (otherlv_0= 'Joint' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'type' ( (lv_type_4_0= ruleJointType ) ) otherlv_5= 'parent' ( ( ruleEString ) ) (otherlv_7= 'child' ( ( ruleEString ) ) )? otherlv_9= 'origin' ( (lv_origin_10_0= rulePose ) ) (otherlv_11= 'limit' ( (lv_limit_12_0= ruleLimit ) ) )? (otherlv_13= 'axis' ( (lv_axis_14_0= ruleAxis ) ) )? otherlv_15= '}' )
            // InternalComposition.g:1005:3: otherlv_0= 'Joint' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'type' ( (lv_type_4_0= ruleJointType ) ) otherlv_5= 'parent' ( ( ruleEString ) ) (otherlv_7= 'child' ( ( ruleEString ) ) )? otherlv_9= 'origin' ( (lv_origin_10_0= rulePose ) ) (otherlv_11= 'limit' ( (lv_limit_12_0= ruleLimit ) ) )? (otherlv_13= 'axis' ( (lv_axis_14_0= ruleAxis ) ) )? otherlv_15= '}'
            {
            otherlv_0=(Token)match(input,39,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getJointAccess().getJointKeyword_0());
            		
            // InternalComposition.g:1009:3: ( (lv_name_1_0= ruleEString ) )
            // InternalComposition.g:1010:4: (lv_name_1_0= ruleEString )
            {
            // InternalComposition.g:1010:4: (lv_name_1_0= ruleEString )
            // InternalComposition.g:1011:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getJointAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_3);
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

            otherlv_2=(Token)match(input,16,FOLLOW_18); 

            			newLeafNode(otherlv_2, grammarAccess.getJointAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,27,FOLLOW_28); 

            			newLeafNode(otherlv_3, grammarAccess.getJointAccess().getTypeKeyword_3());
            		
            // InternalComposition.g:1036:3: ( (lv_type_4_0= ruleJointType ) )
            // InternalComposition.g:1037:4: (lv_type_4_0= ruleJointType )
            {
            // InternalComposition.g:1037:4: (lv_type_4_0= ruleJointType )
            // InternalComposition.g:1038:5: lv_type_4_0= ruleJointType
            {

            					newCompositeNode(grammarAccess.getJointAccess().getTypeJointTypeEnumRuleCall_4_0());
            				
            pushFollow(FOLLOW_29);
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

            otherlv_5=(Token)match(input,40,FOLLOW_5); 

            			newLeafNode(otherlv_5, grammarAccess.getJointAccess().getParentKeyword_5());
            		
            // InternalComposition.g:1059:3: ( ( ruleEString ) )
            // InternalComposition.g:1060:4: ( ruleEString )
            {
            // InternalComposition.g:1060:4: ( ruleEString )
            // InternalComposition.g:1061:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getJointRule());
            					}
            				

            					newCompositeNode(grammarAccess.getJointAccess().getParentLinkCrossReference_6_0());
            				
            pushFollow(FOLLOW_30);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalComposition.g:1075:3: (otherlv_7= 'child' ( ( ruleEString ) ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==41) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalComposition.g:1076:4: otherlv_7= 'child' ( ( ruleEString ) )
                    {
                    otherlv_7=(Token)match(input,41,FOLLOW_5); 

                    				newLeafNode(otherlv_7, grammarAccess.getJointAccess().getChildKeyword_7_0());
                    			
                    // InternalComposition.g:1080:4: ( ( ruleEString ) )
                    // InternalComposition.g:1081:5: ( ruleEString )
                    {
                    // InternalComposition.g:1081:5: ( ruleEString )
                    // InternalComposition.g:1082:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getJointRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getJointAccess().getChildLinkCrossReference_7_1_0());
                    					
                    pushFollow(FOLLOW_31);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_9=(Token)match(input,42,FOLLOW_32); 

            			newLeafNode(otherlv_9, grammarAccess.getJointAccess().getOriginKeyword_8());
            		
            // InternalComposition.g:1101:3: ( (lv_origin_10_0= rulePose ) )
            // InternalComposition.g:1102:4: (lv_origin_10_0= rulePose )
            {
            // InternalComposition.g:1102:4: (lv_origin_10_0= rulePose )
            // InternalComposition.g:1103:5: lv_origin_10_0= rulePose
            {

            					newCompositeNode(grammarAccess.getJointAccess().getOriginPoseParserRuleCall_9_0());
            				
            pushFollow(FOLLOW_33);
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

            // InternalComposition.g:1120:3: (otherlv_11= 'limit' ( (lv_limit_12_0= ruleLimit ) ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==43) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalComposition.g:1121:4: otherlv_11= 'limit' ( (lv_limit_12_0= ruleLimit ) )
                    {
                    otherlv_11=(Token)match(input,43,FOLLOW_34); 

                    				newLeafNode(otherlv_11, grammarAccess.getJointAccess().getLimitKeyword_10_0());
                    			
                    // InternalComposition.g:1125:4: ( (lv_limit_12_0= ruleLimit ) )
                    // InternalComposition.g:1126:5: (lv_limit_12_0= ruleLimit )
                    {
                    // InternalComposition.g:1126:5: (lv_limit_12_0= ruleLimit )
                    // InternalComposition.g:1127:6: lv_limit_12_0= ruleLimit
                    {

                    						newCompositeNode(grammarAccess.getJointAccess().getLimitLimitParserRuleCall_10_1_0());
                    					
                    pushFollow(FOLLOW_35);
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

            // InternalComposition.g:1145:3: (otherlv_13= 'axis' ( (lv_axis_14_0= ruleAxis ) ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==44) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalComposition.g:1146:4: otherlv_13= 'axis' ( (lv_axis_14_0= ruleAxis ) )
                    {
                    otherlv_13=(Token)match(input,44,FOLLOW_36); 

                    				newLeafNode(otherlv_13, grammarAccess.getJointAccess().getAxisKeyword_11_0());
                    			
                    // InternalComposition.g:1150:4: ( (lv_axis_14_0= ruleAxis ) )
                    // InternalComposition.g:1151:5: (lv_axis_14_0= ruleAxis )
                    {
                    // InternalComposition.g:1151:5: (lv_axis_14_0= ruleAxis )
                    // InternalComposition.g:1152:6: lv_axis_14_0= ruleAxis
                    {

                    						newCompositeNode(grammarAccess.getJointAccess().getAxisAxisParserRuleCall_11_1_0());
                    					
                    pushFollow(FOLLOW_17);
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

            otherlv_15=(Token)match(input,20,FOLLOW_2); 

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


    // $ANTLR start "entryRuleLink"
    // InternalComposition.g:1178:1: entryRuleLink returns [EObject current=null] : iv_ruleLink= ruleLink EOF ;
    public final EObject entryRuleLink() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLink = null;


        try {
            // InternalComposition.g:1178:45: (iv_ruleLink= ruleLink EOF )
            // InternalComposition.g:1179:2: iv_ruleLink= ruleLink EOF
            {
             newCompositeNode(grammarAccess.getLinkRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLink=ruleLink();

            state._fsp--;

             current =iv_ruleLink; 
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
    // $ANTLR end "entryRuleLink"


    // $ANTLR start "ruleLink"
    // InternalComposition.g:1185:1: ruleLink returns [EObject current=null] : ( () otherlv_1= 'Link' ( (lv_name_2_0= ruleEString ) ) ) ;
    public final EObject ruleLink() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalComposition.g:1191:2: ( ( () otherlv_1= 'Link' ( (lv_name_2_0= ruleEString ) ) ) )
            // InternalComposition.g:1192:2: ( () otherlv_1= 'Link' ( (lv_name_2_0= ruleEString ) ) )
            {
            // InternalComposition.g:1192:2: ( () otherlv_1= 'Link' ( (lv_name_2_0= ruleEString ) ) )
            // InternalComposition.g:1193:3: () otherlv_1= 'Link' ( (lv_name_2_0= ruleEString ) )
            {
            // InternalComposition.g:1193:3: ()
            // InternalComposition.g:1194:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getLinkAccess().getLinkAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,45,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getLinkAccess().getLinkKeyword_1());
            		
            // InternalComposition.g:1204:3: ( (lv_name_2_0= ruleEString ) )
            // InternalComposition.g:1205:4: (lv_name_2_0= ruleEString )
            {
            // InternalComposition.g:1205:4: (lv_name_2_0= ruleEString )
            // InternalComposition.g:1206:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getLinkAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLinkRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"de.fraunhofer.ipa.kinematics.Kinematics.EString");
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
    // $ANTLR end "ruleLink"


    // $ANTLR start "entryRulePose"
    // InternalComposition.g:1227:1: entryRulePose returns [EObject current=null] : iv_rulePose= rulePose EOF ;
    public final EObject entryRulePose() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePose = null;


        try {
            // InternalComposition.g:1227:45: (iv_rulePose= rulePose EOF )
            // InternalComposition.g:1228:2: iv_rulePose= rulePose EOF
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
    // InternalComposition.g:1234:1: rulePose returns [EObject current=null] : (otherlv_0= 'Pose' otherlv_1= '{' otherlv_2= 'x' ( (lv_x_3_0= ruleEDouble ) ) otherlv_4= 'y' ( (lv_y_5_0= ruleEDouble ) ) otherlv_6= 'z' ( (lv_z_7_0= ruleEDouble ) ) otherlv_8= 'roll' ( (lv_roll_9_0= ruleEDouble ) ) otherlv_10= 'pitch' ( (lv_pitch_11_0= ruleEDouble ) ) otherlv_12= 'yaw' ( (lv_yaw_13_0= ruleEDouble ) ) otherlv_14= '}' ) ;
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
            // InternalComposition.g:1240:2: ( (otherlv_0= 'Pose' otherlv_1= '{' otherlv_2= 'x' ( (lv_x_3_0= ruleEDouble ) ) otherlv_4= 'y' ( (lv_y_5_0= ruleEDouble ) ) otherlv_6= 'z' ( (lv_z_7_0= ruleEDouble ) ) otherlv_8= 'roll' ( (lv_roll_9_0= ruleEDouble ) ) otherlv_10= 'pitch' ( (lv_pitch_11_0= ruleEDouble ) ) otherlv_12= 'yaw' ( (lv_yaw_13_0= ruleEDouble ) ) otherlv_14= '}' ) )
            // InternalComposition.g:1241:2: (otherlv_0= 'Pose' otherlv_1= '{' otherlv_2= 'x' ( (lv_x_3_0= ruleEDouble ) ) otherlv_4= 'y' ( (lv_y_5_0= ruleEDouble ) ) otherlv_6= 'z' ( (lv_z_7_0= ruleEDouble ) ) otherlv_8= 'roll' ( (lv_roll_9_0= ruleEDouble ) ) otherlv_10= 'pitch' ( (lv_pitch_11_0= ruleEDouble ) ) otherlv_12= 'yaw' ( (lv_yaw_13_0= ruleEDouble ) ) otherlv_14= '}' )
            {
            // InternalComposition.g:1241:2: (otherlv_0= 'Pose' otherlv_1= '{' otherlv_2= 'x' ( (lv_x_3_0= ruleEDouble ) ) otherlv_4= 'y' ( (lv_y_5_0= ruleEDouble ) ) otherlv_6= 'z' ( (lv_z_7_0= ruleEDouble ) ) otherlv_8= 'roll' ( (lv_roll_9_0= ruleEDouble ) ) otherlv_10= 'pitch' ( (lv_pitch_11_0= ruleEDouble ) ) otherlv_12= 'yaw' ( (lv_yaw_13_0= ruleEDouble ) ) otherlv_14= '}' )
            // InternalComposition.g:1242:3: otherlv_0= 'Pose' otherlv_1= '{' otherlv_2= 'x' ( (lv_x_3_0= ruleEDouble ) ) otherlv_4= 'y' ( (lv_y_5_0= ruleEDouble ) ) otherlv_6= 'z' ( (lv_z_7_0= ruleEDouble ) ) otherlv_8= 'roll' ( (lv_roll_9_0= ruleEDouble ) ) otherlv_10= 'pitch' ( (lv_pitch_11_0= ruleEDouble ) ) otherlv_12= 'yaw' ( (lv_yaw_13_0= ruleEDouble ) ) otherlv_14= '}'
            {
            otherlv_0=(Token)match(input,46,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getPoseAccess().getPoseKeyword_0());
            		
            otherlv_1=(Token)match(input,16,FOLLOW_37); 

            			newLeafNode(otherlv_1, grammarAccess.getPoseAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,47,FOLLOW_38); 

            			newLeafNode(otherlv_2, grammarAccess.getPoseAccess().getXKeyword_2());
            		
            // InternalComposition.g:1254:3: ( (lv_x_3_0= ruleEDouble ) )
            // InternalComposition.g:1255:4: (lv_x_3_0= ruleEDouble )
            {
            // InternalComposition.g:1255:4: (lv_x_3_0= ruleEDouble )
            // InternalComposition.g:1256:5: lv_x_3_0= ruleEDouble
            {

            					newCompositeNode(grammarAccess.getPoseAccess().getXEDoubleParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_39);
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

            otherlv_4=(Token)match(input,48,FOLLOW_38); 

            			newLeafNode(otherlv_4, grammarAccess.getPoseAccess().getYKeyword_4());
            		
            // InternalComposition.g:1277:3: ( (lv_y_5_0= ruleEDouble ) )
            // InternalComposition.g:1278:4: (lv_y_5_0= ruleEDouble )
            {
            // InternalComposition.g:1278:4: (lv_y_5_0= ruleEDouble )
            // InternalComposition.g:1279:5: lv_y_5_0= ruleEDouble
            {

            					newCompositeNode(grammarAccess.getPoseAccess().getYEDoubleParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_40);
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

            otherlv_6=(Token)match(input,49,FOLLOW_38); 

            			newLeafNode(otherlv_6, grammarAccess.getPoseAccess().getZKeyword_6());
            		
            // InternalComposition.g:1300:3: ( (lv_z_7_0= ruleEDouble ) )
            // InternalComposition.g:1301:4: (lv_z_7_0= ruleEDouble )
            {
            // InternalComposition.g:1301:4: (lv_z_7_0= ruleEDouble )
            // InternalComposition.g:1302:5: lv_z_7_0= ruleEDouble
            {

            					newCompositeNode(grammarAccess.getPoseAccess().getZEDoubleParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_41);
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

            otherlv_8=(Token)match(input,50,FOLLOW_38); 

            			newLeafNode(otherlv_8, grammarAccess.getPoseAccess().getRollKeyword_8());
            		
            // InternalComposition.g:1323:3: ( (lv_roll_9_0= ruleEDouble ) )
            // InternalComposition.g:1324:4: (lv_roll_9_0= ruleEDouble )
            {
            // InternalComposition.g:1324:4: (lv_roll_9_0= ruleEDouble )
            // InternalComposition.g:1325:5: lv_roll_9_0= ruleEDouble
            {

            					newCompositeNode(grammarAccess.getPoseAccess().getRollEDoubleParserRuleCall_9_0());
            				
            pushFollow(FOLLOW_42);
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

            otherlv_10=(Token)match(input,51,FOLLOW_38); 

            			newLeafNode(otherlv_10, grammarAccess.getPoseAccess().getPitchKeyword_10());
            		
            // InternalComposition.g:1346:3: ( (lv_pitch_11_0= ruleEDouble ) )
            // InternalComposition.g:1347:4: (lv_pitch_11_0= ruleEDouble )
            {
            // InternalComposition.g:1347:4: (lv_pitch_11_0= ruleEDouble )
            // InternalComposition.g:1348:5: lv_pitch_11_0= ruleEDouble
            {

            					newCompositeNode(grammarAccess.getPoseAccess().getPitchEDoubleParserRuleCall_11_0());
            				
            pushFollow(FOLLOW_43);
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

            otherlv_12=(Token)match(input,52,FOLLOW_38); 

            			newLeafNode(otherlv_12, grammarAccess.getPoseAccess().getYawKeyword_12());
            		
            // InternalComposition.g:1369:3: ( (lv_yaw_13_0= ruleEDouble ) )
            // InternalComposition.g:1370:4: (lv_yaw_13_0= ruleEDouble )
            {
            // InternalComposition.g:1370:4: (lv_yaw_13_0= ruleEDouble )
            // InternalComposition.g:1371:5: lv_yaw_13_0= ruleEDouble
            {

            					newCompositeNode(grammarAccess.getPoseAccess().getYawEDoubleParserRuleCall_13_0());
            				
            pushFollow(FOLLOW_17);
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

            otherlv_14=(Token)match(input,20,FOLLOW_2); 

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
    // InternalComposition.g:1396:1: entryRuleLimit returns [EObject current=null] : iv_ruleLimit= ruleLimit EOF ;
    public final EObject entryRuleLimit() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLimit = null;


        try {
            // InternalComposition.g:1396:46: (iv_ruleLimit= ruleLimit EOF )
            // InternalComposition.g:1397:2: iv_ruleLimit= ruleLimit EOF
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
    // InternalComposition.g:1403:1: ruleLimit returns [EObject current=null] : (otherlv_0= 'Limit' otherlv_1= '{' otherlv_2= 'effort' ( (lv_effort_3_0= ruleEDouble ) ) otherlv_4= 'velocity' ( (lv_velocity_5_0= ruleEDouble ) ) (otherlv_6= 'lower' ( (lv_lower_7_0= ruleEDouble ) ) )? (otherlv_8= 'upper' ( (lv_upper_9_0= ruleEDouble ) ) )? otherlv_10= '}' ) ;
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
            // InternalComposition.g:1409:2: ( (otherlv_0= 'Limit' otherlv_1= '{' otherlv_2= 'effort' ( (lv_effort_3_0= ruleEDouble ) ) otherlv_4= 'velocity' ( (lv_velocity_5_0= ruleEDouble ) ) (otherlv_6= 'lower' ( (lv_lower_7_0= ruleEDouble ) ) )? (otherlv_8= 'upper' ( (lv_upper_9_0= ruleEDouble ) ) )? otherlv_10= '}' ) )
            // InternalComposition.g:1410:2: (otherlv_0= 'Limit' otherlv_1= '{' otherlv_2= 'effort' ( (lv_effort_3_0= ruleEDouble ) ) otherlv_4= 'velocity' ( (lv_velocity_5_0= ruleEDouble ) ) (otherlv_6= 'lower' ( (lv_lower_7_0= ruleEDouble ) ) )? (otherlv_8= 'upper' ( (lv_upper_9_0= ruleEDouble ) ) )? otherlv_10= '}' )
            {
            // InternalComposition.g:1410:2: (otherlv_0= 'Limit' otherlv_1= '{' otherlv_2= 'effort' ( (lv_effort_3_0= ruleEDouble ) ) otherlv_4= 'velocity' ( (lv_velocity_5_0= ruleEDouble ) ) (otherlv_6= 'lower' ( (lv_lower_7_0= ruleEDouble ) ) )? (otherlv_8= 'upper' ( (lv_upper_9_0= ruleEDouble ) ) )? otherlv_10= '}' )
            // InternalComposition.g:1411:3: otherlv_0= 'Limit' otherlv_1= '{' otherlv_2= 'effort' ( (lv_effort_3_0= ruleEDouble ) ) otherlv_4= 'velocity' ( (lv_velocity_5_0= ruleEDouble ) ) (otherlv_6= 'lower' ( (lv_lower_7_0= ruleEDouble ) ) )? (otherlv_8= 'upper' ( (lv_upper_9_0= ruleEDouble ) ) )? otherlv_10= '}'
            {
            otherlv_0=(Token)match(input,53,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getLimitAccess().getLimitKeyword_0());
            		
            otherlv_1=(Token)match(input,16,FOLLOW_44); 

            			newLeafNode(otherlv_1, grammarAccess.getLimitAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,54,FOLLOW_38); 

            			newLeafNode(otherlv_2, grammarAccess.getLimitAccess().getEffortKeyword_2());
            		
            // InternalComposition.g:1423:3: ( (lv_effort_3_0= ruleEDouble ) )
            // InternalComposition.g:1424:4: (lv_effort_3_0= ruleEDouble )
            {
            // InternalComposition.g:1424:4: (lv_effort_3_0= ruleEDouble )
            // InternalComposition.g:1425:5: lv_effort_3_0= ruleEDouble
            {

            					newCompositeNode(grammarAccess.getLimitAccess().getEffortEDoubleParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_45);
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

            otherlv_4=(Token)match(input,55,FOLLOW_38); 

            			newLeafNode(otherlv_4, grammarAccess.getLimitAccess().getVelocityKeyword_4());
            		
            // InternalComposition.g:1446:3: ( (lv_velocity_5_0= ruleEDouble ) )
            // InternalComposition.g:1447:4: (lv_velocity_5_0= ruleEDouble )
            {
            // InternalComposition.g:1447:4: (lv_velocity_5_0= ruleEDouble )
            // InternalComposition.g:1448:5: lv_velocity_5_0= ruleEDouble
            {

            					newCompositeNode(grammarAccess.getLimitAccess().getVelocityEDoubleParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_46);
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

            // InternalComposition.g:1465:3: (otherlv_6= 'lower' ( (lv_lower_7_0= ruleEDouble ) ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==56) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalComposition.g:1466:4: otherlv_6= 'lower' ( (lv_lower_7_0= ruleEDouble ) )
                    {
                    otherlv_6=(Token)match(input,56,FOLLOW_38); 

                    				newLeafNode(otherlv_6, grammarAccess.getLimitAccess().getLowerKeyword_6_0());
                    			
                    // InternalComposition.g:1470:4: ( (lv_lower_7_0= ruleEDouble ) )
                    // InternalComposition.g:1471:5: (lv_lower_7_0= ruleEDouble )
                    {
                    // InternalComposition.g:1471:5: (lv_lower_7_0= ruleEDouble )
                    // InternalComposition.g:1472:6: lv_lower_7_0= ruleEDouble
                    {

                    						newCompositeNode(grammarAccess.getLimitAccess().getLowerEDoubleParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_47);
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

            // InternalComposition.g:1490:3: (otherlv_8= 'upper' ( (lv_upper_9_0= ruleEDouble ) ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==57) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalComposition.g:1491:4: otherlv_8= 'upper' ( (lv_upper_9_0= ruleEDouble ) )
                    {
                    otherlv_8=(Token)match(input,57,FOLLOW_38); 

                    				newLeafNode(otherlv_8, grammarAccess.getLimitAccess().getUpperKeyword_7_0());
                    			
                    // InternalComposition.g:1495:4: ( (lv_upper_9_0= ruleEDouble ) )
                    // InternalComposition.g:1496:5: (lv_upper_9_0= ruleEDouble )
                    {
                    // InternalComposition.g:1496:5: (lv_upper_9_0= ruleEDouble )
                    // InternalComposition.g:1497:6: lv_upper_9_0= ruleEDouble
                    {

                    						newCompositeNode(grammarAccess.getLimitAccess().getUpperEDoubleParserRuleCall_7_1_0());
                    					
                    pushFollow(FOLLOW_17);
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

            otherlv_10=(Token)match(input,20,FOLLOW_2); 

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
    // InternalComposition.g:1523:1: entryRuleAxis returns [EObject current=null] : iv_ruleAxis= ruleAxis EOF ;
    public final EObject entryRuleAxis() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAxis = null;


        try {
            // InternalComposition.g:1523:45: (iv_ruleAxis= ruleAxis EOF )
            // InternalComposition.g:1524:2: iv_ruleAxis= ruleAxis EOF
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
    // InternalComposition.g:1530:1: ruleAxis returns [EObject current=null] : (otherlv_0= 'Axis' otherlv_1= '{' otherlv_2= 'x' ( (lv_x_3_0= ruleEDouble ) ) otherlv_4= 'y' ( (lv_y_5_0= ruleEDouble ) ) otherlv_6= 'z' ( (lv_z_7_0= ruleEDouble ) ) otherlv_8= '}' ) ;
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
            // InternalComposition.g:1536:2: ( (otherlv_0= 'Axis' otherlv_1= '{' otherlv_2= 'x' ( (lv_x_3_0= ruleEDouble ) ) otherlv_4= 'y' ( (lv_y_5_0= ruleEDouble ) ) otherlv_6= 'z' ( (lv_z_7_0= ruleEDouble ) ) otherlv_8= '}' ) )
            // InternalComposition.g:1537:2: (otherlv_0= 'Axis' otherlv_1= '{' otherlv_2= 'x' ( (lv_x_3_0= ruleEDouble ) ) otherlv_4= 'y' ( (lv_y_5_0= ruleEDouble ) ) otherlv_6= 'z' ( (lv_z_7_0= ruleEDouble ) ) otherlv_8= '}' )
            {
            // InternalComposition.g:1537:2: (otherlv_0= 'Axis' otherlv_1= '{' otherlv_2= 'x' ( (lv_x_3_0= ruleEDouble ) ) otherlv_4= 'y' ( (lv_y_5_0= ruleEDouble ) ) otherlv_6= 'z' ( (lv_z_7_0= ruleEDouble ) ) otherlv_8= '}' )
            // InternalComposition.g:1538:3: otherlv_0= 'Axis' otherlv_1= '{' otherlv_2= 'x' ( (lv_x_3_0= ruleEDouble ) ) otherlv_4= 'y' ( (lv_y_5_0= ruleEDouble ) ) otherlv_6= 'z' ( (lv_z_7_0= ruleEDouble ) ) otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,58,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getAxisAccess().getAxisKeyword_0());
            		
            otherlv_1=(Token)match(input,16,FOLLOW_37); 

            			newLeafNode(otherlv_1, grammarAccess.getAxisAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,47,FOLLOW_38); 

            			newLeafNode(otherlv_2, grammarAccess.getAxisAccess().getXKeyword_2());
            		
            // InternalComposition.g:1550:3: ( (lv_x_3_0= ruleEDouble ) )
            // InternalComposition.g:1551:4: (lv_x_3_0= ruleEDouble )
            {
            // InternalComposition.g:1551:4: (lv_x_3_0= ruleEDouble )
            // InternalComposition.g:1552:5: lv_x_3_0= ruleEDouble
            {

            					newCompositeNode(grammarAccess.getAxisAccess().getXEDoubleParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_39);
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

            otherlv_4=(Token)match(input,48,FOLLOW_38); 

            			newLeafNode(otherlv_4, grammarAccess.getAxisAccess().getYKeyword_4());
            		
            // InternalComposition.g:1573:3: ( (lv_y_5_0= ruleEDouble ) )
            // InternalComposition.g:1574:4: (lv_y_5_0= ruleEDouble )
            {
            // InternalComposition.g:1574:4: (lv_y_5_0= ruleEDouble )
            // InternalComposition.g:1575:5: lv_y_5_0= ruleEDouble
            {

            					newCompositeNode(grammarAccess.getAxisAccess().getYEDoubleParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_40);
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

            otherlv_6=(Token)match(input,49,FOLLOW_38); 

            			newLeafNode(otherlv_6, grammarAccess.getAxisAccess().getZKeyword_6());
            		
            // InternalComposition.g:1596:3: ( (lv_z_7_0= ruleEDouble ) )
            // InternalComposition.g:1597:4: (lv_z_7_0= ruleEDouble )
            {
            // InternalComposition.g:1597:4: (lv_z_7_0= ruleEDouble )
            // InternalComposition.g:1598:5: lv_z_7_0= ruleEDouble
            {

            					newCompositeNode(grammarAccess.getAxisAccess().getZEDoubleParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_17);
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

            otherlv_8=(Token)match(input,20,FOLLOW_2); 

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
    // InternalComposition.g:1623:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalComposition.g:1623:47: (iv_ruleEString= ruleEString EOF )
            // InternalComposition.g:1624:2: iv_ruleEString= ruleEString EOF
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
    // InternalComposition.g:1630:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalComposition.g:1636:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalComposition.g:1637:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalComposition.g:1637:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==RULE_STRING) ) {
                alt22=1;
            }
            else if ( (LA22_0==RULE_ID) ) {
                alt22=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // InternalComposition.g:1638:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalComposition.g:1646:3: this_ID_1= RULE_ID
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
    // InternalComposition.g:1657:1: entryRuleEDouble returns [String current=null] : iv_ruleEDouble= ruleEDouble EOF ;
    public final String entryRuleEDouble() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEDouble = null;


        try {
            // InternalComposition.g:1657:47: (iv_ruleEDouble= ruleEDouble EOF )
            // InternalComposition.g:1658:2: iv_ruleEDouble= ruleEDouble EOF
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
    // InternalComposition.g:1664:1: ruleEDouble returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_DOUBLE_0= RULE_DOUBLE ;
    public final AntlrDatatypeRuleToken ruleEDouble() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_DOUBLE_0=null;


        	enterRule();

        try {
            // InternalComposition.g:1670:2: (this_DOUBLE_0= RULE_DOUBLE )
            // InternalComposition.g:1671:2: this_DOUBLE_0= RULE_DOUBLE
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
    // InternalComposition.g:1681:1: ruleJointType returns [Enumerator current=null] : ( (enumLiteral_0= 'fixed' ) | (enumLiteral_1= 'prismatic' ) | (enumLiteral_2= 'revolute' ) ) ;
    public final Enumerator ruleJointType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalComposition.g:1687:2: ( ( (enumLiteral_0= 'fixed' ) | (enumLiteral_1= 'prismatic' ) | (enumLiteral_2= 'revolute' ) ) )
            // InternalComposition.g:1688:2: ( (enumLiteral_0= 'fixed' ) | (enumLiteral_1= 'prismatic' ) | (enumLiteral_2= 'revolute' ) )
            {
            // InternalComposition.g:1688:2: ( (enumLiteral_0= 'fixed' ) | (enumLiteral_1= 'prismatic' ) | (enumLiteral_2= 'revolute' ) )
            int alt23=3;
            switch ( input.LA(1) ) {
            case 59:
                {
                alt23=1;
                }
                break;
            case 60:
                {
                alt23=2;
                }
                break;
            case 61:
                {
                alt23=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }

            switch (alt23) {
                case 1 :
                    // InternalComposition.g:1689:3: (enumLiteral_0= 'fixed' )
                    {
                    // InternalComposition.g:1689:3: (enumLiteral_0= 'fixed' )
                    // InternalComposition.g:1690:4: enumLiteral_0= 'fixed'
                    {
                    enumLiteral_0=(Token)match(input,59,FOLLOW_2); 

                    				current = grammarAccess.getJointTypeAccess().getFixedEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getJointTypeAccess().getFixedEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalComposition.g:1697:3: (enumLiteral_1= 'prismatic' )
                    {
                    // InternalComposition.g:1697:3: (enumLiteral_1= 'prismatic' )
                    // InternalComposition.g:1698:4: enumLiteral_1= 'prismatic'
                    {
                    enumLiteral_1=(Token)match(input,60,FOLLOW_2); 

                    				current = grammarAccess.getJointTypeAccess().getPrismaticEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getJointTypeAccess().getPrismaticEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalComposition.g:1705:3: (enumLiteral_2= 'revolute' )
                    {
                    // InternalComposition.g:1705:3: (enumLiteral_2= 'revolute' )
                    // InternalComposition.g:1706:4: enumLiteral_2= 'revolute'
                    {
                    enumLiteral_2=(Token)match(input,61,FOLLOW_2); 

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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000F40000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000F00000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000D00000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000900000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000002080000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000140000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000001C80000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000020100000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000140000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000220100000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000200100000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x3800000000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000060000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000180000100000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000100000100000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0300000000100000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0200000000100000L});

}