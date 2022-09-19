package de.fraunhofer.ipa.geometry.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import de.fraunhofer.ipa.geometry.services.GeometryGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalGeometryParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_DOUBLE", "RULE_DIGIT", "RULE_BOOLEAN", "RULE_DECINT", "RULE_JOINTTYPE", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'LinkGeometry'", "'{'", "'ref'", "'visual'", "'collision'", "'}'", "'Visual'", "'origin'", "'geometry'", "'Collision'", "'Pose'", "'value'", "'rpy'", "'xyz'", "'Geometry'", "'box'", "'cylinder'", "'mesh'", "'sphere'", "'String'", "'Box'", "'x'", "'y'", "'z'", "'Cylinder'", "'length'", "'radius'", "'Mesh'", "'filename'", "'scale'", "'Sphere'"
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

        public InternalGeometryParser(TokenStream input, GeometryGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "LinkGeometry";
       	}

       	@Override
       	protected GeometryGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleLinkGeometry"
    // InternalGeometry.g:64:1: entryRuleLinkGeometry returns [EObject current=null] : iv_ruleLinkGeometry= ruleLinkGeometry EOF ;
    public final EObject entryRuleLinkGeometry() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLinkGeometry = null;


        try {
            // InternalGeometry.g:64:53: (iv_ruleLinkGeometry= ruleLinkGeometry EOF )
            // InternalGeometry.g:65:2: iv_ruleLinkGeometry= ruleLinkGeometry EOF
            {
             newCompositeNode(grammarAccess.getLinkGeometryRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLinkGeometry=ruleLinkGeometry();

            state._fsp--;

             current =iv_ruleLinkGeometry; 
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
    // $ANTLR end "entryRuleLinkGeometry"


    // $ANTLR start "ruleLinkGeometry"
    // InternalGeometry.g:71:1: ruleLinkGeometry returns [EObject current=null] : (otherlv_0= 'LinkGeometry' otherlv_1= '{' otherlv_2= 'ref' ( ( ruleEString ) ) (otherlv_4= 'visual' ( (lv_visual_5_0= ruleVisual ) ) )? (otherlv_6= 'collision' ( (lv_collision_7_0= ruleCollision ) ) )? otherlv_8= '}' ) ;
    public final EObject ruleLinkGeometry() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject lv_visual_5_0 = null;

        EObject lv_collision_7_0 = null;



        	enterRule();

        try {
            // InternalGeometry.g:77:2: ( (otherlv_0= 'LinkGeometry' otherlv_1= '{' otherlv_2= 'ref' ( ( ruleEString ) ) (otherlv_4= 'visual' ( (lv_visual_5_0= ruleVisual ) ) )? (otherlv_6= 'collision' ( (lv_collision_7_0= ruleCollision ) ) )? otherlv_8= '}' ) )
            // InternalGeometry.g:78:2: (otherlv_0= 'LinkGeometry' otherlv_1= '{' otherlv_2= 'ref' ( ( ruleEString ) ) (otherlv_4= 'visual' ( (lv_visual_5_0= ruleVisual ) ) )? (otherlv_6= 'collision' ( (lv_collision_7_0= ruleCollision ) ) )? otherlv_8= '}' )
            {
            // InternalGeometry.g:78:2: (otherlv_0= 'LinkGeometry' otherlv_1= '{' otherlv_2= 'ref' ( ( ruleEString ) ) (otherlv_4= 'visual' ( (lv_visual_5_0= ruleVisual ) ) )? (otherlv_6= 'collision' ( (lv_collision_7_0= ruleCollision ) ) )? otherlv_8= '}' )
            // InternalGeometry.g:79:3: otherlv_0= 'LinkGeometry' otherlv_1= '{' otherlv_2= 'ref' ( ( ruleEString ) ) (otherlv_4= 'visual' ( (lv_visual_5_0= ruleVisual ) ) )? (otherlv_6= 'collision' ( (lv_collision_7_0= ruleCollision ) ) )? otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,16,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getLinkGeometryAccess().getLinkGeometryKeyword_0());
            		
            otherlv_1=(Token)match(input,17,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getLinkGeometryAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,18,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getLinkGeometryAccess().getRefKeyword_2());
            		
            // InternalGeometry.g:91:3: ( ( ruleEString ) )
            // InternalGeometry.g:92:4: ( ruleEString )
            {
            // InternalGeometry.g:92:4: ( ruleEString )
            // InternalGeometry.g:93:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLinkGeometryRule());
            					}
            				

            					newCompositeNode(grammarAccess.getLinkGeometryAccess().getRefLinkCrossReference_3_0());
            				
            pushFollow(FOLLOW_6);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalGeometry.g:107:3: (otherlv_4= 'visual' ( (lv_visual_5_0= ruleVisual ) ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==19) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalGeometry.g:108:4: otherlv_4= 'visual' ( (lv_visual_5_0= ruleVisual ) )
                    {
                    otherlv_4=(Token)match(input,19,FOLLOW_7); 

                    				newLeafNode(otherlv_4, grammarAccess.getLinkGeometryAccess().getVisualKeyword_4_0());
                    			
                    // InternalGeometry.g:112:4: ( (lv_visual_5_0= ruleVisual ) )
                    // InternalGeometry.g:113:5: (lv_visual_5_0= ruleVisual )
                    {
                    // InternalGeometry.g:113:5: (lv_visual_5_0= ruleVisual )
                    // InternalGeometry.g:114:6: lv_visual_5_0= ruleVisual
                    {

                    						newCompositeNode(grammarAccess.getLinkGeometryAccess().getVisualVisualParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_visual_5_0=ruleVisual();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getLinkGeometryRule());
                    						}
                    						set(
                    							current,
                    							"visual",
                    							lv_visual_5_0,
                    							"de.fraunhofer.ipa.geometry.Geometry.Visual");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalGeometry.g:132:3: (otherlv_6= 'collision' ( (lv_collision_7_0= ruleCollision ) ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==20) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalGeometry.g:133:4: otherlv_6= 'collision' ( (lv_collision_7_0= ruleCollision ) )
                    {
                    otherlv_6=(Token)match(input,20,FOLLOW_9); 

                    				newLeafNode(otherlv_6, grammarAccess.getLinkGeometryAccess().getCollisionKeyword_5_0());
                    			
                    // InternalGeometry.g:137:4: ( (lv_collision_7_0= ruleCollision ) )
                    // InternalGeometry.g:138:5: (lv_collision_7_0= ruleCollision )
                    {
                    // InternalGeometry.g:138:5: (lv_collision_7_0= ruleCollision )
                    // InternalGeometry.g:139:6: lv_collision_7_0= ruleCollision
                    {

                    						newCompositeNode(grammarAccess.getLinkGeometryAccess().getCollisionCollisionParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_collision_7_0=ruleCollision();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getLinkGeometryRule());
                    						}
                    						set(
                    							current,
                    							"collision",
                    							lv_collision_7_0,
                    							"de.fraunhofer.ipa.geometry.Geometry.Collision");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_8=(Token)match(input,21,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getLinkGeometryAccess().getRightCurlyBracketKeyword_6());
            		

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
    // $ANTLR end "ruleLinkGeometry"


    // $ANTLR start "entryRuleVisual"
    // InternalGeometry.g:165:1: entryRuleVisual returns [EObject current=null] : iv_ruleVisual= ruleVisual EOF ;
    public final EObject entryRuleVisual() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVisual = null;


        try {
            // InternalGeometry.g:165:47: (iv_ruleVisual= ruleVisual EOF )
            // InternalGeometry.g:166:2: iv_ruleVisual= ruleVisual EOF
            {
             newCompositeNode(grammarAccess.getVisualRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVisual=ruleVisual();

            state._fsp--;

             current =iv_ruleVisual; 
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
    // $ANTLR end "entryRuleVisual"


    // $ANTLR start "ruleVisual"
    // InternalGeometry.g:172:1: ruleVisual returns [EObject current=null] : ( () otherlv_1= 'Visual' otherlv_2= '{' (otherlv_3= 'origin' ( (lv_origin_4_0= rulePose ) ) )? (otherlv_5= 'geometry' ( (lv_geometry_6_0= ruleGeometry ) ) )? otherlv_7= '}' ) ;
    public final EObject ruleVisual() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_origin_4_0 = null;

        EObject lv_geometry_6_0 = null;



        	enterRule();

        try {
            // InternalGeometry.g:178:2: ( ( () otherlv_1= 'Visual' otherlv_2= '{' (otherlv_3= 'origin' ( (lv_origin_4_0= rulePose ) ) )? (otherlv_5= 'geometry' ( (lv_geometry_6_0= ruleGeometry ) ) )? otherlv_7= '}' ) )
            // InternalGeometry.g:179:2: ( () otherlv_1= 'Visual' otherlv_2= '{' (otherlv_3= 'origin' ( (lv_origin_4_0= rulePose ) ) )? (otherlv_5= 'geometry' ( (lv_geometry_6_0= ruleGeometry ) ) )? otherlv_7= '}' )
            {
            // InternalGeometry.g:179:2: ( () otherlv_1= 'Visual' otherlv_2= '{' (otherlv_3= 'origin' ( (lv_origin_4_0= rulePose ) ) )? (otherlv_5= 'geometry' ( (lv_geometry_6_0= ruleGeometry ) ) )? otherlv_7= '}' )
            // InternalGeometry.g:180:3: () otherlv_1= 'Visual' otherlv_2= '{' (otherlv_3= 'origin' ( (lv_origin_4_0= rulePose ) ) )? (otherlv_5= 'geometry' ( (lv_geometry_6_0= ruleGeometry ) ) )? otherlv_7= '}'
            {
            // InternalGeometry.g:180:3: ()
            // InternalGeometry.g:181:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getVisualAccess().getVisualAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,22,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getVisualAccess().getVisualKeyword_1());
            		
            otherlv_2=(Token)match(input,17,FOLLOW_11); 

            			newLeafNode(otherlv_2, grammarAccess.getVisualAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalGeometry.g:195:3: (otherlv_3= 'origin' ( (lv_origin_4_0= rulePose ) ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==23) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalGeometry.g:196:4: otherlv_3= 'origin' ( (lv_origin_4_0= rulePose ) )
                    {
                    otherlv_3=(Token)match(input,23,FOLLOW_12); 

                    				newLeafNode(otherlv_3, grammarAccess.getVisualAccess().getOriginKeyword_3_0());
                    			
                    // InternalGeometry.g:200:4: ( (lv_origin_4_0= rulePose ) )
                    // InternalGeometry.g:201:5: (lv_origin_4_0= rulePose )
                    {
                    // InternalGeometry.g:201:5: (lv_origin_4_0= rulePose )
                    // InternalGeometry.g:202:6: lv_origin_4_0= rulePose
                    {

                    						newCompositeNode(grammarAccess.getVisualAccess().getOriginPoseParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_13);
                    lv_origin_4_0=rulePose();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getVisualRule());
                    						}
                    						set(
                    							current,
                    							"origin",
                    							lv_origin_4_0,
                    							"de.fraunhofer.ipa.geometry.Geometry.Pose");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalGeometry.g:220:3: (otherlv_5= 'geometry' ( (lv_geometry_6_0= ruleGeometry ) ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==24) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalGeometry.g:221:4: otherlv_5= 'geometry' ( (lv_geometry_6_0= ruleGeometry ) )
                    {
                    otherlv_5=(Token)match(input,24,FOLLOW_14); 

                    				newLeafNode(otherlv_5, grammarAccess.getVisualAccess().getGeometryKeyword_4_0());
                    			
                    // InternalGeometry.g:225:4: ( (lv_geometry_6_0= ruleGeometry ) )
                    // InternalGeometry.g:226:5: (lv_geometry_6_0= ruleGeometry )
                    {
                    // InternalGeometry.g:226:5: (lv_geometry_6_0= ruleGeometry )
                    // InternalGeometry.g:227:6: lv_geometry_6_0= ruleGeometry
                    {

                    						newCompositeNode(grammarAccess.getVisualAccess().getGeometryGeometryParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_geometry_6_0=ruleGeometry();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getVisualRule());
                    						}
                    						set(
                    							current,
                    							"geometry",
                    							lv_geometry_6_0,
                    							"de.fraunhofer.ipa.geometry.Geometry.Geometry");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,21,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getVisualAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleVisual"


    // $ANTLR start "entryRuleCollision"
    // InternalGeometry.g:253:1: entryRuleCollision returns [EObject current=null] : iv_ruleCollision= ruleCollision EOF ;
    public final EObject entryRuleCollision() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCollision = null;


        try {
            // InternalGeometry.g:253:50: (iv_ruleCollision= ruleCollision EOF )
            // InternalGeometry.g:254:2: iv_ruleCollision= ruleCollision EOF
            {
             newCompositeNode(grammarAccess.getCollisionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCollision=ruleCollision();

            state._fsp--;

             current =iv_ruleCollision; 
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
    // $ANTLR end "entryRuleCollision"


    // $ANTLR start "ruleCollision"
    // InternalGeometry.g:260:1: ruleCollision returns [EObject current=null] : ( () otherlv_1= 'Collision' otherlv_2= '{' (otherlv_3= 'origin' ( (lv_origin_4_0= rulePose ) ) )? (otherlv_5= 'geometry' ( (lv_geometry_6_0= ruleGeometry ) ) )? otherlv_7= '}' ) ;
    public final EObject ruleCollision() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_origin_4_0 = null;

        EObject lv_geometry_6_0 = null;



        	enterRule();

        try {
            // InternalGeometry.g:266:2: ( ( () otherlv_1= 'Collision' otherlv_2= '{' (otherlv_3= 'origin' ( (lv_origin_4_0= rulePose ) ) )? (otherlv_5= 'geometry' ( (lv_geometry_6_0= ruleGeometry ) ) )? otherlv_7= '}' ) )
            // InternalGeometry.g:267:2: ( () otherlv_1= 'Collision' otherlv_2= '{' (otherlv_3= 'origin' ( (lv_origin_4_0= rulePose ) ) )? (otherlv_5= 'geometry' ( (lv_geometry_6_0= ruleGeometry ) ) )? otherlv_7= '}' )
            {
            // InternalGeometry.g:267:2: ( () otherlv_1= 'Collision' otherlv_2= '{' (otherlv_3= 'origin' ( (lv_origin_4_0= rulePose ) ) )? (otherlv_5= 'geometry' ( (lv_geometry_6_0= ruleGeometry ) ) )? otherlv_7= '}' )
            // InternalGeometry.g:268:3: () otherlv_1= 'Collision' otherlv_2= '{' (otherlv_3= 'origin' ( (lv_origin_4_0= rulePose ) ) )? (otherlv_5= 'geometry' ( (lv_geometry_6_0= ruleGeometry ) ) )? otherlv_7= '}'
            {
            // InternalGeometry.g:268:3: ()
            // InternalGeometry.g:269:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getCollisionAccess().getCollisionAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,25,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getCollisionAccess().getCollisionKeyword_1());
            		
            otherlv_2=(Token)match(input,17,FOLLOW_11); 

            			newLeafNode(otherlv_2, grammarAccess.getCollisionAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalGeometry.g:283:3: (otherlv_3= 'origin' ( (lv_origin_4_0= rulePose ) ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==23) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalGeometry.g:284:4: otherlv_3= 'origin' ( (lv_origin_4_0= rulePose ) )
                    {
                    otherlv_3=(Token)match(input,23,FOLLOW_12); 

                    				newLeafNode(otherlv_3, grammarAccess.getCollisionAccess().getOriginKeyword_3_0());
                    			
                    // InternalGeometry.g:288:4: ( (lv_origin_4_0= rulePose ) )
                    // InternalGeometry.g:289:5: (lv_origin_4_0= rulePose )
                    {
                    // InternalGeometry.g:289:5: (lv_origin_4_0= rulePose )
                    // InternalGeometry.g:290:6: lv_origin_4_0= rulePose
                    {

                    						newCompositeNode(grammarAccess.getCollisionAccess().getOriginPoseParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_13);
                    lv_origin_4_0=rulePose();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCollisionRule());
                    						}
                    						set(
                    							current,
                    							"origin",
                    							lv_origin_4_0,
                    							"de.fraunhofer.ipa.geometry.Geometry.Pose");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalGeometry.g:308:3: (otherlv_5= 'geometry' ( (lv_geometry_6_0= ruleGeometry ) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==24) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalGeometry.g:309:4: otherlv_5= 'geometry' ( (lv_geometry_6_0= ruleGeometry ) )
                    {
                    otherlv_5=(Token)match(input,24,FOLLOW_14); 

                    				newLeafNode(otherlv_5, grammarAccess.getCollisionAccess().getGeometryKeyword_4_0());
                    			
                    // InternalGeometry.g:313:4: ( (lv_geometry_6_0= ruleGeometry ) )
                    // InternalGeometry.g:314:5: (lv_geometry_6_0= ruleGeometry )
                    {
                    // InternalGeometry.g:314:5: (lv_geometry_6_0= ruleGeometry )
                    // InternalGeometry.g:315:6: lv_geometry_6_0= ruleGeometry
                    {

                    						newCompositeNode(grammarAccess.getCollisionAccess().getGeometryGeometryParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_geometry_6_0=ruleGeometry();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCollisionRule());
                    						}
                    						set(
                    							current,
                    							"geometry",
                    							lv_geometry_6_0,
                    							"de.fraunhofer.ipa.geometry.Geometry.Geometry");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,21,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getCollisionAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleCollision"


    // $ANTLR start "entryRulePose"
    // InternalGeometry.g:341:1: entryRulePose returns [EObject current=null] : iv_rulePose= rulePose EOF ;
    public final EObject entryRulePose() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePose = null;


        try {
            // InternalGeometry.g:341:45: (iv_rulePose= rulePose EOF )
            // InternalGeometry.g:342:2: iv_rulePose= rulePose EOF
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
    // InternalGeometry.g:348:1: rulePose returns [EObject current=null] : (otherlv_0= 'Pose' otherlv_1= '{' (otherlv_2= 'value' ( (lv_value_3_0= ruleString0 ) ) )? otherlv_4= 'rpy' ( (lv_rpy_5_0= ruleString0 ) ) otherlv_6= 'xyz' ( (lv_xyz_7_0= ruleString0 ) ) otherlv_8= '}' ) ;
    public final EObject rulePose() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_value_3_0 = null;

        AntlrDatatypeRuleToken lv_rpy_5_0 = null;

        AntlrDatatypeRuleToken lv_xyz_7_0 = null;



        	enterRule();

        try {
            // InternalGeometry.g:354:2: ( (otherlv_0= 'Pose' otherlv_1= '{' (otherlv_2= 'value' ( (lv_value_3_0= ruleString0 ) ) )? otherlv_4= 'rpy' ( (lv_rpy_5_0= ruleString0 ) ) otherlv_6= 'xyz' ( (lv_xyz_7_0= ruleString0 ) ) otherlv_8= '}' ) )
            // InternalGeometry.g:355:2: (otherlv_0= 'Pose' otherlv_1= '{' (otherlv_2= 'value' ( (lv_value_3_0= ruleString0 ) ) )? otherlv_4= 'rpy' ( (lv_rpy_5_0= ruleString0 ) ) otherlv_6= 'xyz' ( (lv_xyz_7_0= ruleString0 ) ) otherlv_8= '}' )
            {
            // InternalGeometry.g:355:2: (otherlv_0= 'Pose' otherlv_1= '{' (otherlv_2= 'value' ( (lv_value_3_0= ruleString0 ) ) )? otherlv_4= 'rpy' ( (lv_rpy_5_0= ruleString0 ) ) otherlv_6= 'xyz' ( (lv_xyz_7_0= ruleString0 ) ) otherlv_8= '}' )
            // InternalGeometry.g:356:3: otherlv_0= 'Pose' otherlv_1= '{' (otherlv_2= 'value' ( (lv_value_3_0= ruleString0 ) ) )? otherlv_4= 'rpy' ( (lv_rpy_5_0= ruleString0 ) ) otherlv_6= 'xyz' ( (lv_xyz_7_0= ruleString0 ) ) otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,26,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getPoseAccess().getPoseKeyword_0());
            		
            otherlv_1=(Token)match(input,17,FOLLOW_15); 

            			newLeafNode(otherlv_1, grammarAccess.getPoseAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalGeometry.g:364:3: (otherlv_2= 'value' ( (lv_value_3_0= ruleString0 ) ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==27) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalGeometry.g:365:4: otherlv_2= 'value' ( (lv_value_3_0= ruleString0 ) )
                    {
                    otherlv_2=(Token)match(input,27,FOLLOW_16); 

                    				newLeafNode(otherlv_2, grammarAccess.getPoseAccess().getValueKeyword_2_0());
                    			
                    // InternalGeometry.g:369:4: ( (lv_value_3_0= ruleString0 ) )
                    // InternalGeometry.g:370:5: (lv_value_3_0= ruleString0 )
                    {
                    // InternalGeometry.g:370:5: (lv_value_3_0= ruleString0 )
                    // InternalGeometry.g:371:6: lv_value_3_0= ruleString0
                    {

                    						newCompositeNode(grammarAccess.getPoseAccess().getValueString0ParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_17);
                    lv_value_3_0=ruleString0();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPoseRule());
                    						}
                    						set(
                    							current,
                    							"value",
                    							lv_value_3_0,
                    							"de.fraunhofer.ipa.geometry.Geometry.String0");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,28,FOLLOW_16); 

            			newLeafNode(otherlv_4, grammarAccess.getPoseAccess().getRpyKeyword_3());
            		
            // InternalGeometry.g:393:3: ( (lv_rpy_5_0= ruleString0 ) )
            // InternalGeometry.g:394:4: (lv_rpy_5_0= ruleString0 )
            {
            // InternalGeometry.g:394:4: (lv_rpy_5_0= ruleString0 )
            // InternalGeometry.g:395:5: lv_rpy_5_0= ruleString0
            {

            					newCompositeNode(grammarAccess.getPoseAccess().getRpyString0ParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_18);
            lv_rpy_5_0=ruleString0();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPoseRule());
            					}
            					set(
            						current,
            						"rpy",
            						lv_rpy_5_0,
            						"de.fraunhofer.ipa.geometry.Geometry.String0");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,29,FOLLOW_16); 

            			newLeafNode(otherlv_6, grammarAccess.getPoseAccess().getXyzKeyword_5());
            		
            // InternalGeometry.g:416:3: ( (lv_xyz_7_0= ruleString0 ) )
            // InternalGeometry.g:417:4: (lv_xyz_7_0= ruleString0 )
            {
            // InternalGeometry.g:417:4: (lv_xyz_7_0= ruleString0 )
            // InternalGeometry.g:418:5: lv_xyz_7_0= ruleString0
            {

            					newCompositeNode(grammarAccess.getPoseAccess().getXyzString0ParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_10);
            lv_xyz_7_0=ruleString0();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPoseRule());
            					}
            					set(
            						current,
            						"xyz",
            						lv_xyz_7_0,
            						"de.fraunhofer.ipa.geometry.Geometry.String0");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_8=(Token)match(input,21,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getPoseAccess().getRightCurlyBracketKeyword_7());
            		

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


    // $ANTLR start "entryRuleGeometry"
    // InternalGeometry.g:443:1: entryRuleGeometry returns [EObject current=null] : iv_ruleGeometry= ruleGeometry EOF ;
    public final EObject entryRuleGeometry() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGeometry = null;


        try {
            // InternalGeometry.g:443:49: (iv_ruleGeometry= ruleGeometry EOF )
            // InternalGeometry.g:444:2: iv_ruleGeometry= ruleGeometry EOF
            {
             newCompositeNode(grammarAccess.getGeometryRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGeometry=ruleGeometry();

            state._fsp--;

             current =iv_ruleGeometry; 
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
    // $ANTLR end "entryRuleGeometry"


    // $ANTLR start "ruleGeometry"
    // InternalGeometry.g:450:1: ruleGeometry returns [EObject current=null] : ( () otherlv_1= 'Geometry' otherlv_2= '{' (otherlv_3= 'box' ( (lv_box_4_0= ruleBox ) ) )? (otherlv_5= 'cylinder' ( (lv_cylinder_6_0= ruleCylinder ) ) )? (otherlv_7= 'mesh' ( (lv_mesh_8_0= ruleMesh ) ) )? (otherlv_9= 'sphere' ( (lv_sphere_10_0= ruleSphere ) ) )? otherlv_11= '}' ) ;
    public final EObject ruleGeometry() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        EObject lv_box_4_0 = null;

        EObject lv_cylinder_6_0 = null;

        EObject lv_mesh_8_0 = null;

        EObject lv_sphere_10_0 = null;



        	enterRule();

        try {
            // InternalGeometry.g:456:2: ( ( () otherlv_1= 'Geometry' otherlv_2= '{' (otherlv_3= 'box' ( (lv_box_4_0= ruleBox ) ) )? (otherlv_5= 'cylinder' ( (lv_cylinder_6_0= ruleCylinder ) ) )? (otherlv_7= 'mesh' ( (lv_mesh_8_0= ruleMesh ) ) )? (otherlv_9= 'sphere' ( (lv_sphere_10_0= ruleSphere ) ) )? otherlv_11= '}' ) )
            // InternalGeometry.g:457:2: ( () otherlv_1= 'Geometry' otherlv_2= '{' (otherlv_3= 'box' ( (lv_box_4_0= ruleBox ) ) )? (otherlv_5= 'cylinder' ( (lv_cylinder_6_0= ruleCylinder ) ) )? (otherlv_7= 'mesh' ( (lv_mesh_8_0= ruleMesh ) ) )? (otherlv_9= 'sphere' ( (lv_sphere_10_0= ruleSphere ) ) )? otherlv_11= '}' )
            {
            // InternalGeometry.g:457:2: ( () otherlv_1= 'Geometry' otherlv_2= '{' (otherlv_3= 'box' ( (lv_box_4_0= ruleBox ) ) )? (otherlv_5= 'cylinder' ( (lv_cylinder_6_0= ruleCylinder ) ) )? (otherlv_7= 'mesh' ( (lv_mesh_8_0= ruleMesh ) ) )? (otherlv_9= 'sphere' ( (lv_sphere_10_0= ruleSphere ) ) )? otherlv_11= '}' )
            // InternalGeometry.g:458:3: () otherlv_1= 'Geometry' otherlv_2= '{' (otherlv_3= 'box' ( (lv_box_4_0= ruleBox ) ) )? (otherlv_5= 'cylinder' ( (lv_cylinder_6_0= ruleCylinder ) ) )? (otherlv_7= 'mesh' ( (lv_mesh_8_0= ruleMesh ) ) )? (otherlv_9= 'sphere' ( (lv_sphere_10_0= ruleSphere ) ) )? otherlv_11= '}'
            {
            // InternalGeometry.g:458:3: ()
            // InternalGeometry.g:459:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getGeometryAccess().getGeometryAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,30,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getGeometryAccess().getGeometryKeyword_1());
            		
            otherlv_2=(Token)match(input,17,FOLLOW_19); 

            			newLeafNode(otherlv_2, grammarAccess.getGeometryAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalGeometry.g:473:3: (otherlv_3= 'box' ( (lv_box_4_0= ruleBox ) ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==31) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalGeometry.g:474:4: otherlv_3= 'box' ( (lv_box_4_0= ruleBox ) )
                    {
                    otherlv_3=(Token)match(input,31,FOLLOW_20); 

                    				newLeafNode(otherlv_3, grammarAccess.getGeometryAccess().getBoxKeyword_3_0());
                    			
                    // InternalGeometry.g:478:4: ( (lv_box_4_0= ruleBox ) )
                    // InternalGeometry.g:479:5: (lv_box_4_0= ruleBox )
                    {
                    // InternalGeometry.g:479:5: (lv_box_4_0= ruleBox )
                    // InternalGeometry.g:480:6: lv_box_4_0= ruleBox
                    {

                    						newCompositeNode(grammarAccess.getGeometryAccess().getBoxBoxParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_21);
                    lv_box_4_0=ruleBox();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getGeometryRule());
                    						}
                    						set(
                    							current,
                    							"box",
                    							lv_box_4_0,
                    							"de.fraunhofer.ipa.geometry.Geometry.Box");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalGeometry.g:498:3: (otherlv_5= 'cylinder' ( (lv_cylinder_6_0= ruleCylinder ) ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==32) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalGeometry.g:499:4: otherlv_5= 'cylinder' ( (lv_cylinder_6_0= ruleCylinder ) )
                    {
                    otherlv_5=(Token)match(input,32,FOLLOW_22); 

                    				newLeafNode(otherlv_5, grammarAccess.getGeometryAccess().getCylinderKeyword_4_0());
                    			
                    // InternalGeometry.g:503:4: ( (lv_cylinder_6_0= ruleCylinder ) )
                    // InternalGeometry.g:504:5: (lv_cylinder_6_0= ruleCylinder )
                    {
                    // InternalGeometry.g:504:5: (lv_cylinder_6_0= ruleCylinder )
                    // InternalGeometry.g:505:6: lv_cylinder_6_0= ruleCylinder
                    {

                    						newCompositeNode(grammarAccess.getGeometryAccess().getCylinderCylinderParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_23);
                    lv_cylinder_6_0=ruleCylinder();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getGeometryRule());
                    						}
                    						set(
                    							current,
                    							"cylinder",
                    							lv_cylinder_6_0,
                    							"de.fraunhofer.ipa.geometry.Geometry.Cylinder");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalGeometry.g:523:3: (otherlv_7= 'mesh' ( (lv_mesh_8_0= ruleMesh ) ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==33) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalGeometry.g:524:4: otherlv_7= 'mesh' ( (lv_mesh_8_0= ruleMesh ) )
                    {
                    otherlv_7=(Token)match(input,33,FOLLOW_24); 

                    				newLeafNode(otherlv_7, grammarAccess.getGeometryAccess().getMeshKeyword_5_0());
                    			
                    // InternalGeometry.g:528:4: ( (lv_mesh_8_0= ruleMesh ) )
                    // InternalGeometry.g:529:5: (lv_mesh_8_0= ruleMesh )
                    {
                    // InternalGeometry.g:529:5: (lv_mesh_8_0= ruleMesh )
                    // InternalGeometry.g:530:6: lv_mesh_8_0= ruleMesh
                    {

                    						newCompositeNode(grammarAccess.getGeometryAccess().getMeshMeshParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_25);
                    lv_mesh_8_0=ruleMesh();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getGeometryRule());
                    						}
                    						set(
                    							current,
                    							"mesh",
                    							lv_mesh_8_0,
                    							"de.fraunhofer.ipa.geometry.Geometry.Mesh");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalGeometry.g:548:3: (otherlv_9= 'sphere' ( (lv_sphere_10_0= ruleSphere ) ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==34) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalGeometry.g:549:4: otherlv_9= 'sphere' ( (lv_sphere_10_0= ruleSphere ) )
                    {
                    otherlv_9=(Token)match(input,34,FOLLOW_26); 

                    				newLeafNode(otherlv_9, grammarAccess.getGeometryAccess().getSphereKeyword_6_0());
                    			
                    // InternalGeometry.g:553:4: ( (lv_sphere_10_0= ruleSphere ) )
                    // InternalGeometry.g:554:5: (lv_sphere_10_0= ruleSphere )
                    {
                    // InternalGeometry.g:554:5: (lv_sphere_10_0= ruleSphere )
                    // InternalGeometry.g:555:6: lv_sphere_10_0= ruleSphere
                    {

                    						newCompositeNode(grammarAccess.getGeometryAccess().getSphereSphereParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_sphere_10_0=ruleSphere();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getGeometryRule());
                    						}
                    						set(
                    							current,
                    							"sphere",
                    							lv_sphere_10_0,
                    							"de.fraunhofer.ipa.geometry.Geometry.Sphere");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_11=(Token)match(input,21,FOLLOW_2); 

            			newLeafNode(otherlv_11, grammarAccess.getGeometryAccess().getRightCurlyBracketKeyword_7());
            		

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
    // $ANTLR end "ruleGeometry"


    // $ANTLR start "entryRuleString0"
    // InternalGeometry.g:581:1: entryRuleString0 returns [String current=null] : iv_ruleString0= ruleString0 EOF ;
    public final String entryRuleString0() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleString0 = null;


        try {
            // InternalGeometry.g:581:47: (iv_ruleString0= ruleString0 EOF )
            // InternalGeometry.g:582:2: iv_ruleString0= ruleString0 EOF
            {
             newCompositeNode(grammarAccess.getString0Rule()); 
            pushFollow(FOLLOW_1);
            iv_ruleString0=ruleString0();

            state._fsp--;

             current =iv_ruleString0.getText(); 
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
    // $ANTLR end "entryRuleString0"


    // $ANTLR start "ruleString0"
    // InternalGeometry.g:588:1: ruleString0 returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'String' ;
    public final AntlrDatatypeRuleToken ruleString0() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalGeometry.g:594:2: (kw= 'String' )
            // InternalGeometry.g:595:2: kw= 'String'
            {
            kw=(Token)match(input,35,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getString0Access().getStringKeyword());
            	

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
    // $ANTLR end "ruleString0"


    // $ANTLR start "entryRuleBox"
    // InternalGeometry.g:603:1: entryRuleBox returns [EObject current=null] : iv_ruleBox= ruleBox EOF ;
    public final EObject entryRuleBox() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBox = null;


        try {
            // InternalGeometry.g:603:44: (iv_ruleBox= ruleBox EOF )
            // InternalGeometry.g:604:2: iv_ruleBox= ruleBox EOF
            {
             newCompositeNode(grammarAccess.getBoxRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBox=ruleBox();

            state._fsp--;

             current =iv_ruleBox; 
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
    // $ANTLR end "entryRuleBox"


    // $ANTLR start "ruleBox"
    // InternalGeometry.g:610:1: ruleBox returns [EObject current=null] : (otherlv_0= 'Box' otherlv_1= '{' otherlv_2= 'x' ( (lv_x_3_0= ruleDouble0 ) ) otherlv_4= 'y' ( (lv_y_5_0= ruleDouble0 ) ) otherlv_6= 'z' ( (lv_z_7_0= ruleDouble0 ) ) otherlv_8= '}' ) ;
    public final EObject ruleBox() throws RecognitionException {
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
            // InternalGeometry.g:616:2: ( (otherlv_0= 'Box' otherlv_1= '{' otherlv_2= 'x' ( (lv_x_3_0= ruleDouble0 ) ) otherlv_4= 'y' ( (lv_y_5_0= ruleDouble0 ) ) otherlv_6= 'z' ( (lv_z_7_0= ruleDouble0 ) ) otherlv_8= '}' ) )
            // InternalGeometry.g:617:2: (otherlv_0= 'Box' otherlv_1= '{' otherlv_2= 'x' ( (lv_x_3_0= ruleDouble0 ) ) otherlv_4= 'y' ( (lv_y_5_0= ruleDouble0 ) ) otherlv_6= 'z' ( (lv_z_7_0= ruleDouble0 ) ) otherlv_8= '}' )
            {
            // InternalGeometry.g:617:2: (otherlv_0= 'Box' otherlv_1= '{' otherlv_2= 'x' ( (lv_x_3_0= ruleDouble0 ) ) otherlv_4= 'y' ( (lv_y_5_0= ruleDouble0 ) ) otherlv_6= 'z' ( (lv_z_7_0= ruleDouble0 ) ) otherlv_8= '}' )
            // InternalGeometry.g:618:3: otherlv_0= 'Box' otherlv_1= '{' otherlv_2= 'x' ( (lv_x_3_0= ruleDouble0 ) ) otherlv_4= 'y' ( (lv_y_5_0= ruleDouble0 ) ) otherlv_6= 'z' ( (lv_z_7_0= ruleDouble0 ) ) otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,36,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getBoxAccess().getBoxKeyword_0());
            		
            otherlv_1=(Token)match(input,17,FOLLOW_27); 

            			newLeafNode(otherlv_1, grammarAccess.getBoxAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,37,FOLLOW_28); 

            			newLeafNode(otherlv_2, grammarAccess.getBoxAccess().getXKeyword_2());
            		
            // InternalGeometry.g:630:3: ( (lv_x_3_0= ruleDouble0 ) )
            // InternalGeometry.g:631:4: (lv_x_3_0= ruleDouble0 )
            {
            // InternalGeometry.g:631:4: (lv_x_3_0= ruleDouble0 )
            // InternalGeometry.g:632:5: lv_x_3_0= ruleDouble0
            {

            					newCompositeNode(grammarAccess.getBoxAccess().getXDouble0ParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_29);
            lv_x_3_0=ruleDouble0();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBoxRule());
            					}
            					set(
            						current,
            						"x",
            						lv_x_3_0,
            						"de.fraunhofer.ipa.geometry.Geometry.Double0");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,38,FOLLOW_28); 

            			newLeafNode(otherlv_4, grammarAccess.getBoxAccess().getYKeyword_4());
            		
            // InternalGeometry.g:653:3: ( (lv_y_5_0= ruleDouble0 ) )
            // InternalGeometry.g:654:4: (lv_y_5_0= ruleDouble0 )
            {
            // InternalGeometry.g:654:4: (lv_y_5_0= ruleDouble0 )
            // InternalGeometry.g:655:5: lv_y_5_0= ruleDouble0
            {

            					newCompositeNode(grammarAccess.getBoxAccess().getYDouble0ParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_30);
            lv_y_5_0=ruleDouble0();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBoxRule());
            					}
            					set(
            						current,
            						"y",
            						lv_y_5_0,
            						"de.fraunhofer.ipa.geometry.Geometry.Double0");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,39,FOLLOW_28); 

            			newLeafNode(otherlv_6, grammarAccess.getBoxAccess().getZKeyword_6());
            		
            // InternalGeometry.g:676:3: ( (lv_z_7_0= ruleDouble0 ) )
            // InternalGeometry.g:677:4: (lv_z_7_0= ruleDouble0 )
            {
            // InternalGeometry.g:677:4: (lv_z_7_0= ruleDouble0 )
            // InternalGeometry.g:678:5: lv_z_7_0= ruleDouble0
            {

            					newCompositeNode(grammarAccess.getBoxAccess().getZDouble0ParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_10);
            lv_z_7_0=ruleDouble0();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBoxRule());
            					}
            					set(
            						current,
            						"z",
            						lv_z_7_0,
            						"de.fraunhofer.ipa.geometry.Geometry.Double0");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_8=(Token)match(input,21,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getBoxAccess().getRightCurlyBracketKeyword_8());
            		

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
    // $ANTLR end "ruleBox"


    // $ANTLR start "entryRuleCylinder"
    // InternalGeometry.g:703:1: entryRuleCylinder returns [EObject current=null] : iv_ruleCylinder= ruleCylinder EOF ;
    public final EObject entryRuleCylinder() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCylinder = null;


        try {
            // InternalGeometry.g:703:49: (iv_ruleCylinder= ruleCylinder EOF )
            // InternalGeometry.g:704:2: iv_ruleCylinder= ruleCylinder EOF
            {
             newCompositeNode(grammarAccess.getCylinderRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCylinder=ruleCylinder();

            state._fsp--;

             current =iv_ruleCylinder; 
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
    // $ANTLR end "entryRuleCylinder"


    // $ANTLR start "ruleCylinder"
    // InternalGeometry.g:710:1: ruleCylinder returns [EObject current=null] : (otherlv_0= 'Cylinder' otherlv_1= '{' otherlv_2= 'length' ( (lv_length_3_0= ruleDouble0 ) ) otherlv_4= 'radius' ( (lv_radius_5_0= ruleDouble0 ) ) otherlv_6= '}' ) ;
    public final EObject ruleCylinder() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_length_3_0 = null;

        AntlrDatatypeRuleToken lv_radius_5_0 = null;



        	enterRule();

        try {
            // InternalGeometry.g:716:2: ( (otherlv_0= 'Cylinder' otherlv_1= '{' otherlv_2= 'length' ( (lv_length_3_0= ruleDouble0 ) ) otherlv_4= 'radius' ( (lv_radius_5_0= ruleDouble0 ) ) otherlv_6= '}' ) )
            // InternalGeometry.g:717:2: (otherlv_0= 'Cylinder' otherlv_1= '{' otherlv_2= 'length' ( (lv_length_3_0= ruleDouble0 ) ) otherlv_4= 'radius' ( (lv_radius_5_0= ruleDouble0 ) ) otherlv_6= '}' )
            {
            // InternalGeometry.g:717:2: (otherlv_0= 'Cylinder' otherlv_1= '{' otherlv_2= 'length' ( (lv_length_3_0= ruleDouble0 ) ) otherlv_4= 'radius' ( (lv_radius_5_0= ruleDouble0 ) ) otherlv_6= '}' )
            // InternalGeometry.g:718:3: otherlv_0= 'Cylinder' otherlv_1= '{' otherlv_2= 'length' ( (lv_length_3_0= ruleDouble0 ) ) otherlv_4= 'radius' ( (lv_radius_5_0= ruleDouble0 ) ) otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,40,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getCylinderAccess().getCylinderKeyword_0());
            		
            otherlv_1=(Token)match(input,17,FOLLOW_31); 

            			newLeafNode(otherlv_1, grammarAccess.getCylinderAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,41,FOLLOW_28); 

            			newLeafNode(otherlv_2, grammarAccess.getCylinderAccess().getLengthKeyword_2());
            		
            // InternalGeometry.g:730:3: ( (lv_length_3_0= ruleDouble0 ) )
            // InternalGeometry.g:731:4: (lv_length_3_0= ruleDouble0 )
            {
            // InternalGeometry.g:731:4: (lv_length_3_0= ruleDouble0 )
            // InternalGeometry.g:732:5: lv_length_3_0= ruleDouble0
            {

            					newCompositeNode(grammarAccess.getCylinderAccess().getLengthDouble0ParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_32);
            lv_length_3_0=ruleDouble0();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCylinderRule());
            					}
            					set(
            						current,
            						"length",
            						lv_length_3_0,
            						"de.fraunhofer.ipa.geometry.Geometry.Double0");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,42,FOLLOW_28); 

            			newLeafNode(otherlv_4, grammarAccess.getCylinderAccess().getRadiusKeyword_4());
            		
            // InternalGeometry.g:753:3: ( (lv_radius_5_0= ruleDouble0 ) )
            // InternalGeometry.g:754:4: (lv_radius_5_0= ruleDouble0 )
            {
            // InternalGeometry.g:754:4: (lv_radius_5_0= ruleDouble0 )
            // InternalGeometry.g:755:5: lv_radius_5_0= ruleDouble0
            {

            					newCompositeNode(grammarAccess.getCylinderAccess().getRadiusDouble0ParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_10);
            lv_radius_5_0=ruleDouble0();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCylinderRule());
            					}
            					set(
            						current,
            						"radius",
            						lv_radius_5_0,
            						"de.fraunhofer.ipa.geometry.Geometry.Double0");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,21,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getCylinderAccess().getRightCurlyBracketKeyword_6());
            		

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
    // $ANTLR end "ruleCylinder"


    // $ANTLR start "entryRuleMesh"
    // InternalGeometry.g:780:1: entryRuleMesh returns [EObject current=null] : iv_ruleMesh= ruleMesh EOF ;
    public final EObject entryRuleMesh() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMesh = null;


        try {
            // InternalGeometry.g:780:45: (iv_ruleMesh= ruleMesh EOF )
            // InternalGeometry.g:781:2: iv_ruleMesh= ruleMesh EOF
            {
             newCompositeNode(grammarAccess.getMeshRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMesh=ruleMesh();

            state._fsp--;

             current =iv_ruleMesh; 
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
    // $ANTLR end "entryRuleMesh"


    // $ANTLR start "ruleMesh"
    // InternalGeometry.g:787:1: ruleMesh returns [EObject current=null] : (otherlv_0= 'Mesh' otherlv_1= '{' otherlv_2= 'filename' ( (lv_filename_3_0= ruleString0 ) ) (otherlv_4= 'scale' ( (lv_scale_5_0= ruleDouble0 ) ) )? otherlv_6= '}' ) ;
    public final EObject ruleMesh() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_filename_3_0 = null;

        AntlrDatatypeRuleToken lv_scale_5_0 = null;



        	enterRule();

        try {
            // InternalGeometry.g:793:2: ( (otherlv_0= 'Mesh' otherlv_1= '{' otherlv_2= 'filename' ( (lv_filename_3_0= ruleString0 ) ) (otherlv_4= 'scale' ( (lv_scale_5_0= ruleDouble0 ) ) )? otherlv_6= '}' ) )
            // InternalGeometry.g:794:2: (otherlv_0= 'Mesh' otherlv_1= '{' otherlv_2= 'filename' ( (lv_filename_3_0= ruleString0 ) ) (otherlv_4= 'scale' ( (lv_scale_5_0= ruleDouble0 ) ) )? otherlv_6= '}' )
            {
            // InternalGeometry.g:794:2: (otherlv_0= 'Mesh' otherlv_1= '{' otherlv_2= 'filename' ( (lv_filename_3_0= ruleString0 ) ) (otherlv_4= 'scale' ( (lv_scale_5_0= ruleDouble0 ) ) )? otherlv_6= '}' )
            // InternalGeometry.g:795:3: otherlv_0= 'Mesh' otherlv_1= '{' otherlv_2= 'filename' ( (lv_filename_3_0= ruleString0 ) ) (otherlv_4= 'scale' ( (lv_scale_5_0= ruleDouble0 ) ) )? otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,43,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getMeshAccess().getMeshKeyword_0());
            		
            otherlv_1=(Token)match(input,17,FOLLOW_33); 

            			newLeafNode(otherlv_1, grammarAccess.getMeshAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,44,FOLLOW_16); 

            			newLeafNode(otherlv_2, grammarAccess.getMeshAccess().getFilenameKeyword_2());
            		
            // InternalGeometry.g:807:3: ( (lv_filename_3_0= ruleString0 ) )
            // InternalGeometry.g:808:4: (lv_filename_3_0= ruleString0 )
            {
            // InternalGeometry.g:808:4: (lv_filename_3_0= ruleString0 )
            // InternalGeometry.g:809:5: lv_filename_3_0= ruleString0
            {

            					newCompositeNode(grammarAccess.getMeshAccess().getFilenameString0ParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_34);
            lv_filename_3_0=ruleString0();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMeshRule());
            					}
            					set(
            						current,
            						"filename",
            						lv_filename_3_0,
            						"de.fraunhofer.ipa.geometry.Geometry.String0");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalGeometry.g:826:3: (otherlv_4= 'scale' ( (lv_scale_5_0= ruleDouble0 ) ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==45) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalGeometry.g:827:4: otherlv_4= 'scale' ( (lv_scale_5_0= ruleDouble0 ) )
                    {
                    otherlv_4=(Token)match(input,45,FOLLOW_28); 

                    				newLeafNode(otherlv_4, grammarAccess.getMeshAccess().getScaleKeyword_4_0());
                    			
                    // InternalGeometry.g:831:4: ( (lv_scale_5_0= ruleDouble0 ) )
                    // InternalGeometry.g:832:5: (lv_scale_5_0= ruleDouble0 )
                    {
                    // InternalGeometry.g:832:5: (lv_scale_5_0= ruleDouble0 )
                    // InternalGeometry.g:833:6: lv_scale_5_0= ruleDouble0
                    {

                    						newCompositeNode(grammarAccess.getMeshAccess().getScaleDouble0ParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_scale_5_0=ruleDouble0();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMeshRule());
                    						}
                    						set(
                    							current,
                    							"scale",
                    							lv_scale_5_0,
                    							"de.fraunhofer.ipa.geometry.Geometry.Double0");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,21,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getMeshAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleMesh"


    // $ANTLR start "entryRuleSphere"
    // InternalGeometry.g:859:1: entryRuleSphere returns [EObject current=null] : iv_ruleSphere= ruleSphere EOF ;
    public final EObject entryRuleSphere() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSphere = null;


        try {
            // InternalGeometry.g:859:47: (iv_ruleSphere= ruleSphere EOF )
            // InternalGeometry.g:860:2: iv_ruleSphere= ruleSphere EOF
            {
             newCompositeNode(grammarAccess.getSphereRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSphere=ruleSphere();

            state._fsp--;

             current =iv_ruleSphere; 
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
    // $ANTLR end "entryRuleSphere"


    // $ANTLR start "ruleSphere"
    // InternalGeometry.g:866:1: ruleSphere returns [EObject current=null] : (otherlv_0= 'Sphere' otherlv_1= '{' otherlv_2= 'radius' ( (lv_radius_3_0= ruleDouble0 ) ) otherlv_4= '}' ) ;
    public final EObject ruleSphere() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_radius_3_0 = null;



        	enterRule();

        try {
            // InternalGeometry.g:872:2: ( (otherlv_0= 'Sphere' otherlv_1= '{' otherlv_2= 'radius' ( (lv_radius_3_0= ruleDouble0 ) ) otherlv_4= '}' ) )
            // InternalGeometry.g:873:2: (otherlv_0= 'Sphere' otherlv_1= '{' otherlv_2= 'radius' ( (lv_radius_3_0= ruleDouble0 ) ) otherlv_4= '}' )
            {
            // InternalGeometry.g:873:2: (otherlv_0= 'Sphere' otherlv_1= '{' otherlv_2= 'radius' ( (lv_radius_3_0= ruleDouble0 ) ) otherlv_4= '}' )
            // InternalGeometry.g:874:3: otherlv_0= 'Sphere' otherlv_1= '{' otherlv_2= 'radius' ( (lv_radius_3_0= ruleDouble0 ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,46,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getSphereAccess().getSphereKeyword_0());
            		
            otherlv_1=(Token)match(input,17,FOLLOW_32); 

            			newLeafNode(otherlv_1, grammarAccess.getSphereAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,42,FOLLOW_28); 

            			newLeafNode(otherlv_2, grammarAccess.getSphereAccess().getRadiusKeyword_2());
            		
            // InternalGeometry.g:886:3: ( (lv_radius_3_0= ruleDouble0 ) )
            // InternalGeometry.g:887:4: (lv_radius_3_0= ruleDouble0 )
            {
            // InternalGeometry.g:887:4: (lv_radius_3_0= ruleDouble0 )
            // InternalGeometry.g:888:5: lv_radius_3_0= ruleDouble0
            {

            					newCompositeNode(grammarAccess.getSphereAccess().getRadiusDouble0ParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_10);
            lv_radius_3_0=ruleDouble0();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSphereRule());
            					}
            					set(
            						current,
            						"radius",
            						lv_radius_3_0,
            						"de.fraunhofer.ipa.geometry.Geometry.Double0");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,21,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getSphereAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleSphere"


    // $ANTLR start "entryRuleEString"
    // InternalGeometry.g:913:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalGeometry.g:913:47: (iv_ruleEString= ruleEString EOF )
            // InternalGeometry.g:914:2: iv_ruleEString= ruleEString EOF
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
    // InternalGeometry.g:920:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_STRING_0= RULE_STRING ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;


        	enterRule();

        try {
            // InternalGeometry.g:926:2: (this_STRING_0= RULE_STRING )
            // InternalGeometry.g:927:2: this_STRING_0= RULE_STRING
            {
            this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            		current.merge(this_STRING_0);
            	

            		newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall());
            	

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


    // $ANTLR start "entryRuleDouble0"
    // InternalGeometry.g:937:1: entryRuleDouble0 returns [String current=null] : iv_ruleDouble0= ruleDouble0 EOF ;
    public final String entryRuleDouble0() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDouble0 = null;


        try {
            // InternalGeometry.g:937:47: (iv_ruleDouble0= ruleDouble0 EOF )
            // InternalGeometry.g:938:2: iv_ruleDouble0= ruleDouble0 EOF
            {
             newCompositeNode(grammarAccess.getDouble0Rule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDouble0=ruleDouble0();

            state._fsp--;

             current =iv_ruleDouble0.getText(); 
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
    // $ANTLR end "entryRuleDouble0"


    // $ANTLR start "ruleDouble0"
    // InternalGeometry.g:944:1: ruleDouble0 returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_DOUBLE_0= RULE_DOUBLE ;
    public final AntlrDatatypeRuleToken ruleDouble0() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_DOUBLE_0=null;


        	enterRule();

        try {
            // InternalGeometry.g:950:2: (this_DOUBLE_0= RULE_DOUBLE )
            // InternalGeometry.g:951:2: this_DOUBLE_0= RULE_DOUBLE
            {
            this_DOUBLE_0=(Token)match(input,RULE_DOUBLE,FOLLOW_2); 

            		current.merge(this_DOUBLE_0);
            	

            		newLeafNode(this_DOUBLE_0, grammarAccess.getDouble0Access().getDOUBLETerminalRuleCall());
            	

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
    // $ANTLR end "ruleDouble0"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000380000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000001A00000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000001200000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000018000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000780200000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000700200000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000600200000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000400200000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000200000200000L});

}