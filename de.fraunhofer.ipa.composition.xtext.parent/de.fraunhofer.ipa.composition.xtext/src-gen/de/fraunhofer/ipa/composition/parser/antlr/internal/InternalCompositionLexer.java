package de.fraunhofer.ipa.composition.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalCompositionLexer extends Lexer {
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

    public InternalCompositionLexer() {;} 
    public InternalCompositionLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalCompositionLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalComposition.g"; }

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalComposition.g:11:7: ( 'Component' )
            // InternalComposition.g:11:9: 'Component'
            {
            match("Component"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalComposition.g:12:7: ( '{' )
            // InternalComposition.g:12:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalComposition.g:13:7: ( 'name' )
            // InternalComposition.g:13:9: 'name'
            {
            match("name"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalComposition.g:14:7: ( 'parameters' )
            // InternalComposition.g:14:9: 'parameters'
            {
            match("parameters"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalComposition.g:15:7: ( ',' )
            // InternalComposition.g:15:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalComposition.g:16:7: ( '}' )
            // InternalComposition.g:16:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalComposition.g:17:7: ( 'links' )
            // InternalComposition.g:17:9: 'links'
            {
            match("links"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalComposition.g:18:7: ( 'joints' )
            // InternalComposition.g:18:9: 'joints'
            {
            match("joints"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalComposition.g:19:7: ( 'components' )
            // InternalComposition.g:19:9: 'components'
            {
            match("components"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalComposition.g:20:7: ( '(' )
            // InternalComposition.g:20:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalComposition.g:21:7: ( ')' )
            // InternalComposition.g:21:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalComposition.g:22:7: ( 'ComponentInstance' )
            // InternalComposition.g:22:9: 'ComponentInstance'
            {
            match("ComponentInstance"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalComposition.g:23:7: ( 'type' )
            // InternalComposition.g:23:9: 'type'
            {
            match("type"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalComposition.g:24:7: ( 'Parameter' )
            // InternalComposition.g:24:9: 'Parameter'
            {
            match("Parameter"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalComposition.g:25:7: ( 'value' )
            // InternalComposition.g:25:9: 'value'
            {
            match("value"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalComposition.g:26:7: ( 'ParameterValue' )
            // InternalComposition.g:26:9: 'ParameterValue'
            {
            match("ParameterValue"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalComposition.g:27:7: ( 'ParameterType' )
            // InternalComposition.g:27:9: 'ParameterType'
            {
            match("ParameterType"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalComposition.g:28:7: ( 'LinkRef' )
            // InternalComposition.g:28:9: 'LinkRef'
            {
            match("LinkRef"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalComposition.g:29:7: ( 'ref' )
            // InternalComposition.g:29:9: 'ref'
            {
            match("ref"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalComposition.g:30:7: ( 'ParameterPoseType' )
            // InternalComposition.g:30:9: 'ParameterPoseType'
            {
            match("ParameterPoseType"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalComposition.g:31:7: ( 'ParameterStringType' )
            // InternalComposition.g:31:9: 'ParameterStringType'
            {
            match("ParameterStringType"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalComposition.g:32:7: ( 'ParameterLinkRefType' )
            // InternalComposition.g:32:9: 'ParameterLinkRefType'
            {
            match("ParameterLinkRefType"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalComposition.g:33:7: ( 'ParameterInstance' )
            // InternalComposition.g:33:9: 'ParameterInstance'
            {
            match("ParameterInstance"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalComposition.g:34:7: ( 'parameter' )
            // InternalComposition.g:34:9: 'parameter'
            {
            match("parameter"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalComposition.g:35:7: ( 'Joint' )
            // InternalComposition.g:35:9: 'Joint'
            {
            match("Joint"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalComposition.g:36:7: ( 'parent' )
            // InternalComposition.g:36:9: 'parent'
            {
            match("parent"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalComposition.g:37:7: ( 'child' )
            // InternalComposition.g:37:9: 'child'
            {
            match("child"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalComposition.g:38:7: ( 'origin' )
            // InternalComposition.g:38:9: 'origin'
            {
            match("origin"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__42"

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalComposition.g:39:7: ( 'limit' )
            // InternalComposition.g:39:9: 'limit'
            {
            match("limit"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__43"

    // $ANTLR start "T__44"
    public final void mT__44() throws RecognitionException {
        try {
            int _type = T__44;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalComposition.g:40:7: ( 'axis' )
            // InternalComposition.g:40:9: 'axis'
            {
            match("axis"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__44"

    // $ANTLR start "T__45"
    public final void mT__45() throws RecognitionException {
        try {
            int _type = T__45;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalComposition.g:41:7: ( 'Link' )
            // InternalComposition.g:41:9: 'Link'
            {
            match("Link"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__45"

    // $ANTLR start "T__46"
    public final void mT__46() throws RecognitionException {
        try {
            int _type = T__46;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalComposition.g:42:7: ( 'Pose' )
            // InternalComposition.g:42:9: 'Pose'
            {
            match("Pose"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__46"

    // $ANTLR start "T__47"
    public final void mT__47() throws RecognitionException {
        try {
            int _type = T__47;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalComposition.g:43:7: ( 'x' )
            // InternalComposition.g:43:9: 'x'
            {
            match('x'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__47"

    // $ANTLR start "T__48"
    public final void mT__48() throws RecognitionException {
        try {
            int _type = T__48;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalComposition.g:44:7: ( 'y' )
            // InternalComposition.g:44:9: 'y'
            {
            match('y'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__48"

    // $ANTLR start "T__49"
    public final void mT__49() throws RecognitionException {
        try {
            int _type = T__49;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalComposition.g:45:7: ( 'z' )
            // InternalComposition.g:45:9: 'z'
            {
            match('z'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__49"

    // $ANTLR start "T__50"
    public final void mT__50() throws RecognitionException {
        try {
            int _type = T__50;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalComposition.g:46:7: ( 'roll' )
            // InternalComposition.g:46:9: 'roll'
            {
            match("roll"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__50"

    // $ANTLR start "T__51"
    public final void mT__51() throws RecognitionException {
        try {
            int _type = T__51;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalComposition.g:47:7: ( 'pitch' )
            // InternalComposition.g:47:9: 'pitch'
            {
            match("pitch"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__51"

    // $ANTLR start "T__52"
    public final void mT__52() throws RecognitionException {
        try {
            int _type = T__52;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalComposition.g:48:7: ( 'yaw' )
            // InternalComposition.g:48:9: 'yaw'
            {
            match("yaw"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__52"

    // $ANTLR start "T__53"
    public final void mT__53() throws RecognitionException {
        try {
            int _type = T__53;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalComposition.g:49:7: ( 'Limit' )
            // InternalComposition.g:49:9: 'Limit'
            {
            match("Limit"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__53"

    // $ANTLR start "T__54"
    public final void mT__54() throws RecognitionException {
        try {
            int _type = T__54;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalComposition.g:50:7: ( 'effort' )
            // InternalComposition.g:50:9: 'effort'
            {
            match("effort"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__54"

    // $ANTLR start "T__55"
    public final void mT__55() throws RecognitionException {
        try {
            int _type = T__55;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalComposition.g:51:7: ( 'velocity' )
            // InternalComposition.g:51:9: 'velocity'
            {
            match("velocity"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__55"

    // $ANTLR start "T__56"
    public final void mT__56() throws RecognitionException {
        try {
            int _type = T__56;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalComposition.g:52:7: ( 'lower' )
            // InternalComposition.g:52:9: 'lower'
            {
            match("lower"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__56"

    // $ANTLR start "T__57"
    public final void mT__57() throws RecognitionException {
        try {
            int _type = T__57;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalComposition.g:53:7: ( 'upper' )
            // InternalComposition.g:53:9: 'upper'
            {
            match("upper"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__57"

    // $ANTLR start "T__58"
    public final void mT__58() throws RecognitionException {
        try {
            int _type = T__58;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalComposition.g:54:7: ( 'Axis' )
            // InternalComposition.g:54:9: 'Axis'
            {
            match("Axis"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__58"

    // $ANTLR start "T__59"
    public final void mT__59() throws RecognitionException {
        try {
            int _type = T__59;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalComposition.g:55:7: ( 'fixed' )
            // InternalComposition.g:55:9: 'fixed'
            {
            match("fixed"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__59"

    // $ANTLR start "T__60"
    public final void mT__60() throws RecognitionException {
        try {
            int _type = T__60;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalComposition.g:56:7: ( 'prismatic' )
            // InternalComposition.g:56:9: 'prismatic'
            {
            match("prismatic"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__60"

    // $ANTLR start "T__61"
    public final void mT__61() throws RecognitionException {
        try {
            int _type = T__61;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalComposition.g:57:7: ( 'revolute' )
            // InternalComposition.g:57:9: 'revolute'
            {
            match("revolute"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__61"

    // $ANTLR start "RULE_DIGIT"
    public final void mRULE_DIGIT() throws RecognitionException {
        try {
            // InternalComposition.g:1715:21: ( '0' .. '9' )
            // InternalComposition.g:1715:23: '0' .. '9'
            {
            matchRange('0','9'); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_DIGIT"

    // $ANTLR start "RULE_BOOLEAN"
    public final void mRULE_BOOLEAN() throws RecognitionException {
        try {
            int _type = RULE_BOOLEAN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalComposition.g:1717:14: ( ( 'true' | 'false' ) )
            // InternalComposition.g:1717:16: ( 'true' | 'false' )
            {
            // InternalComposition.g:1717:16: ( 'true' | 'false' )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='t') ) {
                alt1=1;
            }
            else if ( (LA1_0=='f') ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalComposition.g:1717:17: 'true'
                    {
                    match("true"); 


                    }
                    break;
                case 2 :
                    // InternalComposition.g:1717:24: 'false'
                    {
                    match("false"); 


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_BOOLEAN"

    // $ANTLR start "RULE_DOUBLE"
    public final void mRULE_DOUBLE() throws RecognitionException {
        try {
            int _type = RULE_DOUBLE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalComposition.g:1719:13: ( RULE_DECINT ( '.' ( RULE_DIGIT )* | ( '.' ( RULE_DIGIT )* )? ( 'E' | 'e' ) ( '-' | '+' )? RULE_DECINT ) )
            // InternalComposition.g:1719:15: RULE_DECINT ( '.' ( RULE_DIGIT )* | ( '.' ( RULE_DIGIT )* )? ( 'E' | 'e' ) ( '-' | '+' )? RULE_DECINT )
            {
            mRULE_DECINT(); 
            // InternalComposition.g:1719:27: ( '.' ( RULE_DIGIT )* | ( '.' ( RULE_DIGIT )* )? ( 'E' | 'e' ) ( '-' | '+' )? RULE_DECINT )
            int alt6=2;
            alt6 = dfa6.predict(input);
            switch (alt6) {
                case 1 :
                    // InternalComposition.g:1719:28: '.' ( RULE_DIGIT )*
                    {
                    match('.'); 
                    // InternalComposition.g:1719:32: ( RULE_DIGIT )*
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( ((LA2_0>='0' && LA2_0<='9')) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // InternalComposition.g:1719:32: RULE_DIGIT
                    	    {
                    	    mRULE_DIGIT(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop2;
                        }
                    } while (true);


                    }
                    break;
                case 2 :
                    // InternalComposition.g:1719:44: ( '.' ( RULE_DIGIT )* )? ( 'E' | 'e' ) ( '-' | '+' )? RULE_DECINT
                    {
                    // InternalComposition.g:1719:44: ( '.' ( RULE_DIGIT )* )?
                    int alt4=2;
                    int LA4_0 = input.LA(1);

                    if ( (LA4_0=='.') ) {
                        alt4=1;
                    }
                    switch (alt4) {
                        case 1 :
                            // InternalComposition.g:1719:45: '.' ( RULE_DIGIT )*
                            {
                            match('.'); 
                            // InternalComposition.g:1719:49: ( RULE_DIGIT )*
                            loop3:
                            do {
                                int alt3=2;
                                int LA3_0 = input.LA(1);

                                if ( ((LA3_0>='0' && LA3_0<='9')) ) {
                                    alt3=1;
                                }


                                switch (alt3) {
                            	case 1 :
                            	    // InternalComposition.g:1719:49: RULE_DIGIT
                            	    {
                            	    mRULE_DIGIT(); 

                            	    }
                            	    break;

                            	default :
                            	    break loop3;
                                }
                            } while (true);


                            }
                            break;

                    }

                    if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    // InternalComposition.g:1719:73: ( '-' | '+' )?
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( (LA5_0=='-') ) {
                        int LA5_1 = input.LA(2);

                        if ( (LA5_1=='0') ) {
                            alt5=1;
                        }
                        else if ( (LA5_1=='-'||(LA5_1>='1' && LA5_1<='9')) ) {
                            alt5=1;
                        }
                    }
                    else if ( (LA5_0=='+') ) {
                        alt5=1;
                    }
                    switch (alt5) {
                        case 1 :
                            // InternalComposition.g:
                            {
                            if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                                input.consume();

                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                recover(mse);
                                throw mse;}


                            }
                            break;

                    }

                    mRULE_DECINT(); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_DOUBLE"

    // $ANTLR start "RULE_DECINT"
    public final void mRULE_DECINT() throws RecognitionException {
        try {
            int _type = RULE_DECINT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalComposition.g:1721:13: ( ( '0' | '1' .. '9' ( RULE_DIGIT )* | '-' '0' .. '9' ( RULE_DIGIT )* ) )
            // InternalComposition.g:1721:15: ( '0' | '1' .. '9' ( RULE_DIGIT )* | '-' '0' .. '9' ( RULE_DIGIT )* )
            {
            // InternalComposition.g:1721:15: ( '0' | '1' .. '9' ( RULE_DIGIT )* | '-' '0' .. '9' ( RULE_DIGIT )* )
            int alt9=3;
            switch ( input.LA(1) ) {
            case '0':
                {
                alt9=1;
                }
                break;
            case '1':
            case '2':
            case '3':
            case '4':
            case '5':
            case '6':
            case '7':
            case '8':
            case '9':
                {
                alt9=2;
                }
                break;
            case '-':
                {
                alt9=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalComposition.g:1721:16: '0'
                    {
                    match('0'); 

                    }
                    break;
                case 2 :
                    // InternalComposition.g:1721:20: '1' .. '9' ( RULE_DIGIT )*
                    {
                    matchRange('1','9'); 
                    // InternalComposition.g:1721:29: ( RULE_DIGIT )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( ((LA7_0>='0' && LA7_0<='9')) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // InternalComposition.g:1721:29: RULE_DIGIT
                    	    {
                    	    mRULE_DIGIT(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);


                    }
                    break;
                case 3 :
                    // InternalComposition.g:1721:41: '-' '0' .. '9' ( RULE_DIGIT )*
                    {
                    match('-'); 
                    matchRange('0','9'); 
                    // InternalComposition.g:1721:54: ( RULE_DIGIT )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( ((LA8_0>='0' && LA8_0<='9')) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // InternalComposition.g:1721:54: RULE_DIGIT
                    	    {
                    	    mRULE_DIGIT(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_DECINT"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalComposition.g:1723:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalComposition.g:1723:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalComposition.g:1723:11: ( '^' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='^') ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalComposition.g:1723:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalComposition.g:1723:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>='0' && LA11_0<='9')||(LA11_0>='A' && LA11_0<='Z')||LA11_0=='_'||(LA11_0>='a' && LA11_0<='z')) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalComposition.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalComposition.g:1725:10: ( ( '0' .. '9' )+ )
            // InternalComposition.g:1725:12: ( '0' .. '9' )+
            {
            // InternalComposition.g:1725:12: ( '0' .. '9' )+
            int cnt12=0;
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>='0' && LA12_0<='9')) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalComposition.g:1725:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt12 >= 1 ) break loop12;
                        EarlyExitException eee =
                            new EarlyExitException(12, input);
                        throw eee;
                }
                cnt12++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalComposition.g:1727:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalComposition.g:1727:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalComposition.g:1727:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0=='\"') ) {
                alt15=1;
            }
            else if ( (LA15_0=='\'') ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // InternalComposition.g:1727:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalComposition.g:1727:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop13:
                    do {
                        int alt13=3;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0=='\\') ) {
                            alt13=1;
                        }
                        else if ( ((LA13_0>='\u0000' && LA13_0<='!')||(LA13_0>='#' && LA13_0<='[')||(LA13_0>=']' && LA13_0<='\uFFFF')) ) {
                            alt13=2;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // InternalComposition.g:1727:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalComposition.g:1727:28: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop13;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalComposition.g:1727:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalComposition.g:1727:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop14:
                    do {
                        int alt14=3;
                        int LA14_0 = input.LA(1);

                        if ( (LA14_0=='\\') ) {
                            alt14=1;
                        }
                        else if ( ((LA14_0>='\u0000' && LA14_0<='&')||(LA14_0>='(' && LA14_0<='[')||(LA14_0>=']' && LA14_0<='\uFFFF')) ) {
                            alt14=2;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // InternalComposition.g:1727:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalComposition.g:1727:61: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop14;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalComposition.g:1729:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalComposition.g:1729:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalComposition.g:1729:24: ( options {greedy=false; } : . )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0=='*') ) {
                    int LA16_1 = input.LA(2);

                    if ( (LA16_1=='/') ) {
                        alt16=2;
                    }
                    else if ( ((LA16_1>='\u0000' && LA16_1<='.')||(LA16_1>='0' && LA16_1<='\uFFFF')) ) {
                        alt16=1;
                    }


                }
                else if ( ((LA16_0>='\u0000' && LA16_0<=')')||(LA16_0>='+' && LA16_0<='\uFFFF')) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalComposition.g:1729:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalComposition.g:1731:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalComposition.g:1731:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalComposition.g:1731:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0>='\u0000' && LA17_0<='\t')||(LA17_0>='\u000B' && LA17_0<='\f')||(LA17_0>='\u000E' && LA17_0<='\uFFFF')) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalComposition.g:1731:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

            // InternalComposition.g:1731:40: ( ( '\\r' )? '\\n' )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0=='\n'||LA19_0=='\r') ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalComposition.g:1731:41: ( '\\r' )? '\\n'
                    {
                    // InternalComposition.g:1731:41: ( '\\r' )?
                    int alt18=2;
                    int LA18_0 = input.LA(1);

                    if ( (LA18_0=='\r') ) {
                        alt18=1;
                    }
                    switch (alt18) {
                        case 1 :
                            // InternalComposition.g:1731:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalComposition.g:1733:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalComposition.g:1733:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalComposition.g:1733:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt20=0;
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( ((LA20_0>='\t' && LA20_0<='\n')||LA20_0=='\r'||LA20_0==' ') ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalComposition.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt20 >= 1 ) break loop20;
                        EarlyExitException eee =
                            new EarlyExitException(20, input);
                        throw eee;
                }
                cnt20++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalComposition.g:1735:16: ( . )
            // InternalComposition.g:1735:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // InternalComposition.g:1:8: ( T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | RULE_BOOLEAN | RULE_DOUBLE | RULE_DECINT | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt21=57;
        alt21 = dfa21.predict(input);
        switch (alt21) {
            case 1 :
                // InternalComposition.g:1:10: T__15
                {
                mT__15(); 

                }
                break;
            case 2 :
                // InternalComposition.g:1:16: T__16
                {
                mT__16(); 

                }
                break;
            case 3 :
                // InternalComposition.g:1:22: T__17
                {
                mT__17(); 

                }
                break;
            case 4 :
                // InternalComposition.g:1:28: T__18
                {
                mT__18(); 

                }
                break;
            case 5 :
                // InternalComposition.g:1:34: T__19
                {
                mT__19(); 

                }
                break;
            case 6 :
                // InternalComposition.g:1:40: T__20
                {
                mT__20(); 

                }
                break;
            case 7 :
                // InternalComposition.g:1:46: T__21
                {
                mT__21(); 

                }
                break;
            case 8 :
                // InternalComposition.g:1:52: T__22
                {
                mT__22(); 

                }
                break;
            case 9 :
                // InternalComposition.g:1:58: T__23
                {
                mT__23(); 

                }
                break;
            case 10 :
                // InternalComposition.g:1:64: T__24
                {
                mT__24(); 

                }
                break;
            case 11 :
                // InternalComposition.g:1:70: T__25
                {
                mT__25(); 

                }
                break;
            case 12 :
                // InternalComposition.g:1:76: T__26
                {
                mT__26(); 

                }
                break;
            case 13 :
                // InternalComposition.g:1:82: T__27
                {
                mT__27(); 

                }
                break;
            case 14 :
                // InternalComposition.g:1:88: T__28
                {
                mT__28(); 

                }
                break;
            case 15 :
                // InternalComposition.g:1:94: T__29
                {
                mT__29(); 

                }
                break;
            case 16 :
                // InternalComposition.g:1:100: T__30
                {
                mT__30(); 

                }
                break;
            case 17 :
                // InternalComposition.g:1:106: T__31
                {
                mT__31(); 

                }
                break;
            case 18 :
                // InternalComposition.g:1:112: T__32
                {
                mT__32(); 

                }
                break;
            case 19 :
                // InternalComposition.g:1:118: T__33
                {
                mT__33(); 

                }
                break;
            case 20 :
                // InternalComposition.g:1:124: T__34
                {
                mT__34(); 

                }
                break;
            case 21 :
                // InternalComposition.g:1:130: T__35
                {
                mT__35(); 

                }
                break;
            case 22 :
                // InternalComposition.g:1:136: T__36
                {
                mT__36(); 

                }
                break;
            case 23 :
                // InternalComposition.g:1:142: T__37
                {
                mT__37(); 

                }
                break;
            case 24 :
                // InternalComposition.g:1:148: T__38
                {
                mT__38(); 

                }
                break;
            case 25 :
                // InternalComposition.g:1:154: T__39
                {
                mT__39(); 

                }
                break;
            case 26 :
                // InternalComposition.g:1:160: T__40
                {
                mT__40(); 

                }
                break;
            case 27 :
                // InternalComposition.g:1:166: T__41
                {
                mT__41(); 

                }
                break;
            case 28 :
                // InternalComposition.g:1:172: T__42
                {
                mT__42(); 

                }
                break;
            case 29 :
                // InternalComposition.g:1:178: T__43
                {
                mT__43(); 

                }
                break;
            case 30 :
                // InternalComposition.g:1:184: T__44
                {
                mT__44(); 

                }
                break;
            case 31 :
                // InternalComposition.g:1:190: T__45
                {
                mT__45(); 

                }
                break;
            case 32 :
                // InternalComposition.g:1:196: T__46
                {
                mT__46(); 

                }
                break;
            case 33 :
                // InternalComposition.g:1:202: T__47
                {
                mT__47(); 

                }
                break;
            case 34 :
                // InternalComposition.g:1:208: T__48
                {
                mT__48(); 

                }
                break;
            case 35 :
                // InternalComposition.g:1:214: T__49
                {
                mT__49(); 

                }
                break;
            case 36 :
                // InternalComposition.g:1:220: T__50
                {
                mT__50(); 

                }
                break;
            case 37 :
                // InternalComposition.g:1:226: T__51
                {
                mT__51(); 

                }
                break;
            case 38 :
                // InternalComposition.g:1:232: T__52
                {
                mT__52(); 

                }
                break;
            case 39 :
                // InternalComposition.g:1:238: T__53
                {
                mT__53(); 

                }
                break;
            case 40 :
                // InternalComposition.g:1:244: T__54
                {
                mT__54(); 

                }
                break;
            case 41 :
                // InternalComposition.g:1:250: T__55
                {
                mT__55(); 

                }
                break;
            case 42 :
                // InternalComposition.g:1:256: T__56
                {
                mT__56(); 

                }
                break;
            case 43 :
                // InternalComposition.g:1:262: T__57
                {
                mT__57(); 

                }
                break;
            case 44 :
                // InternalComposition.g:1:268: T__58
                {
                mT__58(); 

                }
                break;
            case 45 :
                // InternalComposition.g:1:274: T__59
                {
                mT__59(); 

                }
                break;
            case 46 :
                // InternalComposition.g:1:280: T__60
                {
                mT__60(); 

                }
                break;
            case 47 :
                // InternalComposition.g:1:286: T__61
                {
                mT__61(); 

                }
                break;
            case 48 :
                // InternalComposition.g:1:292: RULE_BOOLEAN
                {
                mRULE_BOOLEAN(); 

                }
                break;
            case 49 :
                // InternalComposition.g:1:305: RULE_DOUBLE
                {
                mRULE_DOUBLE(); 

                }
                break;
            case 50 :
                // InternalComposition.g:1:317: RULE_DECINT
                {
                mRULE_DECINT(); 

                }
                break;
            case 51 :
                // InternalComposition.g:1:329: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 52 :
                // InternalComposition.g:1:337: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 53 :
                // InternalComposition.g:1:346: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 54 :
                // InternalComposition.g:1:358: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 55 :
                // InternalComposition.g:1:374: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 56 :
                // InternalComposition.g:1:390: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 57 :
                // InternalComposition.g:1:398: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA6 dfa6 = new DFA6(this);
    protected DFA21 dfa21 = new DFA21(this);
    static final String DFA6_eotS =
        "\1\uffff\1\4\1\uffff\1\4\1\uffff";
    static final String DFA6_eofS =
        "\5\uffff";
    static final String DFA6_minS =
        "\1\56\1\60\1\uffff\1\60\1\uffff";
    static final String DFA6_maxS =
        "\2\145\1\uffff\1\145\1\uffff";
    static final String DFA6_acceptS =
        "\2\uffff\1\2\1\uffff\1\1";
    static final String DFA6_specialS =
        "\5\uffff}>";
    static final String[] DFA6_transitionS = {
            "\1\1\26\uffff\1\2\37\uffff\1\2",
            "\12\3\13\uffff\1\2\37\uffff\1\2",
            "",
            "\12\3\13\uffff\1\2\37\uffff\1\2",
            ""
    };

    static final short[] DFA6_eot = DFA.unpackEncodedString(DFA6_eotS);
    static final short[] DFA6_eof = DFA.unpackEncodedString(DFA6_eofS);
    static final char[] DFA6_min = DFA.unpackEncodedStringToUnsignedChars(DFA6_minS);
    static final char[] DFA6_max = DFA.unpackEncodedStringToUnsignedChars(DFA6_maxS);
    static final short[] DFA6_accept = DFA.unpackEncodedString(DFA6_acceptS);
    static final short[] DFA6_special = DFA.unpackEncodedString(DFA6_specialS);
    static final short[][] DFA6_transition;

    static {
        int numStates = DFA6_transitionS.length;
        DFA6_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA6_transition[i] = DFA.unpackEncodedString(DFA6_transitionS[i]);
        }
    }

    class DFA6 extends DFA {

        public DFA6(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 6;
            this.eot = DFA6_eot;
            this.eof = DFA6_eof;
            this.min = DFA6_min;
            this.max = DFA6_max;
            this.accept = DFA6_accept;
            this.special = DFA6_special;
            this.transition = DFA6_transition;
        }
        public String getDescription() {
            return "1719:27: ( '.' ( RULE_DIGIT )* | ( '.' ( RULE_DIGIT )* )? ( 'E' | 'e' ) ( '-' | '+' )? RULE_DECINT )";
        }
    }
    static final String DFA21_eotS =
        "\1\uffff\1\46\1\uffff\2\46\2\uffff\3\46\2\uffff\10\46\1\101\1\103\1\104\4\46\2\112\2\44\1\uffff\3\44\2\uffff\1\46\2\uffff\4\46\2\uffff\5\46\2\uffff\14\46\1\uffff\1\46\2\uffff\5\46\3\uffff\2\112\4\uffff\23\46\1\u0087\5\46\1\u008d\5\46\1\112\1\46\1\u0094\12\46\1\u009f\1\u00a0\1\46\1\u00a2\2\46\1\u00a6\1\46\1\uffff\1\46\1\u00a9\2\46\1\u00ac\1\uffff\2\46\1\u00af\3\46\1\uffff\2\46\1\u00b5\1\46\1\u00b7\1\u00b8\1\u00b9\2\46\1\u00bc\2\uffff\1\46\1\uffff\1\u00be\2\46\1\uffff\1\u00c1\1\46\1\uffff\1\u00c3\1\46\1\uffff\1\46\1\u00c6\1\uffff\1\u00c7\1\u00a0\2\46\1\u00ca\1\uffff\1\46\3\uffff\1\u00cc\1\46\1\uffff\1\46\1\uffff\2\46\1\uffff\1\46\1\uffff\1\u00d2\1\u00d3\2\uffff\2\46\1\uffff\1\46\1\uffff\3\46\1\u00da\1\46\2\uffff\5\46\1\u00e1\1\uffff\1\u00e2\1\u00e4\1\u00e6\1\u00e7\1\46\1\u00ef\2\uffff\1\46\1\uffff\1\u00f1\2\uffff\1\u00f2\6\46\1\uffff\1\46\2\uffff\17\46\1\u0109\5\46\1\u010f\1\uffff\5\46\1\uffff\11\46\1\u011e\1\u011f\2\46\1\u0122\2\uffff\2\46\1\uffff\1\u0125\1\46\1\uffff\1\u0127\1\uffff";
    static final String DFA21_eofS =
        "\u0128\uffff";
    static final String DFA21_minS =
        "\1\0\1\157\1\uffff\2\141\2\uffff\1\151\1\157\1\150\2\uffff\1\162\2\141\1\151\1\145\1\157\1\162\1\170\3\60\1\146\1\160\1\170\1\141\2\56\1\60\1\101\1\uffff\2\0\1\52\2\uffff\1\155\2\uffff\1\155\1\162\1\164\1\151\2\uffff\1\155\1\167\1\151\1\155\1\151\2\uffff\1\160\1\165\1\162\1\163\2\154\1\155\1\146\1\154\3\151\1\uffff\1\167\2\uffff\1\146\1\160\1\151\1\170\1\154\3\uffff\2\56\4\uffff\1\160\1\145\1\141\1\143\1\163\1\153\1\151\1\145\1\156\1\160\1\154\2\145\1\141\1\145\1\165\1\157\1\153\1\151\1\60\1\157\1\154\1\156\1\147\1\163\1\60\1\157\1\145\1\163\1\145\1\163\1\56\1\157\1\60\1\155\1\156\1\150\1\155\1\163\1\164\1\162\1\164\1\157\1\144\2\60\1\155\1\60\1\145\1\143\1\60\1\164\1\uffff\1\154\1\60\1\164\1\151\1\60\1\uffff\2\162\1\60\1\144\1\145\1\156\1\uffff\1\145\1\164\1\60\1\141\3\60\1\163\1\156\1\60\2\uffff\1\145\1\uffff\1\60\1\151\1\145\1\uffff\1\60\1\165\1\uffff\1\60\1\156\1\uffff\1\164\1\60\1\uffff\2\60\1\145\1\164\1\60\1\uffff\1\164\3\uffff\1\60\1\145\1\uffff\1\164\1\uffff\1\164\1\146\1\uffff\1\164\1\uffff\2\60\2\uffff\1\156\1\145\1\uffff\1\151\1\uffff\1\156\1\145\1\171\1\60\1\145\2\uffff\1\164\1\162\1\143\1\164\1\162\1\60\1\uffff\4\60\1\163\1\60\2\uffff\1\156\1\uffff\1\60\2\uffff\1\60\1\141\1\171\1\157\1\164\1\151\1\156\1\uffff\1\163\2\uffff\1\154\1\160\1\163\1\162\1\156\1\163\1\164\1\165\2\145\1\151\1\153\1\164\1\141\1\145\1\60\1\124\1\156\1\122\1\141\1\156\1\60\1\uffff\1\171\1\147\1\145\1\156\1\143\1\uffff\1\160\1\124\1\146\1\143\2\145\1\171\1\124\1\145\2\60\1\160\1\171\1\60\2\uffff\1\145\1\160\1\uffff\1\60\1\145\1\uffff\1\60\1\uffff";
    static final String DFA21_maxS =
        "\1\uffff\1\157\1\uffff\1\141\1\162\2\uffff\3\157\2\uffff\1\171\1\157\1\145\1\151\2\157\1\162\1\170\3\172\1\146\1\160\1\170\1\151\2\145\1\71\1\172\1\uffff\2\uffff\1\57\2\uffff\1\155\2\uffff\1\155\1\162\1\164\1\151\2\uffff\1\156\1\167\1\151\1\155\1\151\2\uffff\1\160\1\165\1\162\1\163\2\154\1\156\1\166\1\154\3\151\1\uffff\1\167\2\uffff\1\146\1\160\1\151\1\170\1\154\3\uffff\2\145\4\uffff\1\160\2\145\1\143\1\163\1\153\1\151\1\145\1\156\1\160\1\154\2\145\1\141\1\145\1\165\1\157\1\153\1\151\1\172\1\157\1\154\1\156\1\147\1\163\1\172\1\157\1\145\1\163\1\145\1\163\1\145\1\157\1\172\1\155\1\156\1\150\1\155\1\163\1\164\1\162\1\164\1\157\1\144\2\172\1\155\1\172\1\145\1\143\1\172\1\164\1\uffff\1\154\1\172\1\164\1\151\1\172\1\uffff\2\162\1\172\1\144\1\145\1\156\1\uffff\1\145\1\164\1\172\1\141\3\172\1\163\1\156\1\172\2\uffff\1\145\1\uffff\1\172\1\151\1\145\1\uffff\1\172\1\165\1\uffff\1\172\1\156\1\uffff\1\164\1\172\1\uffff\2\172\1\145\1\164\1\172\1\uffff\1\164\3\uffff\1\172\1\145\1\uffff\1\164\1\uffff\1\164\1\146\1\uffff\1\164\1\uffff\2\172\2\uffff\1\156\1\145\1\uffff\1\151\1\uffff\1\156\1\145\1\171\1\172\1\145\2\uffff\1\164\1\162\1\143\1\164\1\162\1\172\1\uffff\4\172\1\163\1\172\2\uffff\1\156\1\uffff\1\172\2\uffff\1\172\1\141\1\171\1\157\1\164\1\151\1\156\1\uffff\1\163\2\uffff\1\154\1\160\1\163\1\162\1\156\1\163\1\164\1\165\2\145\1\151\1\153\1\164\1\141\1\145\1\172\1\124\1\156\1\122\1\141\1\156\1\172\1\uffff\1\171\1\147\1\145\1\156\1\143\1\uffff\1\160\1\124\1\146\1\143\2\145\1\171\1\124\1\145\2\172\1\160\1\171\1\172\2\uffff\1\145\1\160\1\uffff\1\172\1\145\1\uffff\1\172\1\uffff";
    static final String DFA21_acceptS =
        "\2\uffff\1\2\2\uffff\1\5\1\6\3\uffff\1\12\1\13\23\uffff\1\63\3\uffff\1\70\1\71\1\uffff\1\63\1\2\4\uffff\1\5\1\6\5\uffff\1\12\1\13\14\uffff\1\41\1\uffff\1\42\1\43\5\uffff\1\62\1\61\1\64\2\uffff\1\65\1\66\1\67\1\70\64\uffff\1\23\5\uffff\1\46\6\uffff\1\3\12\uffff\1\15\1\60\1\uffff\1\40\3\uffff\1\37\2\uffff\1\44\2\uffff\1\36\2\uffff\1\54\5\uffff\1\45\1\uffff\1\7\1\35\1\52\2\uffff\1\33\1\uffff\1\17\2\uffff\1\47\1\uffff\1\31\2\uffff\1\53\1\55\2\uffff\1\32\1\uffff\1\10\5\uffff\1\34\1\50\6\uffff\1\22\6\uffff\1\51\1\57\1\uffff\1\1\1\uffff\1\30\1\56\7\uffff\1\16\1\uffff\1\4\1\11\26\uffff\1\21\5\uffff\1\20\16\uffff\1\14\1\24\2\uffff\1\27\2\uffff\1\25\1\uffff\1\26";
    static final String DFA21_specialS =
        "\1\2\37\uffff\1\0\1\1\u0106\uffff}>";
    static final String[] DFA21_transitionS = {
            "\11\44\2\43\2\44\1\43\22\44\1\43\1\44\1\40\4\44\1\41\1\12\1\13\2\44\1\5\1\35\1\44\1\42\1\33\11\34\7\44\1\31\1\37\1\1\6\37\1\21\1\37\1\17\3\37\1\15\12\37\3\44\1\36\1\37\1\44\1\23\1\37\1\11\1\37\1\27\1\32\3\37\1\10\1\37\1\7\1\37\1\3\1\22\1\4\1\37\1\20\1\37\1\14\1\30\1\16\1\37\1\24\1\25\1\26\1\2\1\44\1\6\uff82\44",
            "\1\45",
            "",
            "\1\50",
            "\1\51\7\uffff\1\52\10\uffff\1\53",
            "",
            "",
            "\1\56\5\uffff\1\57",
            "\1\60",
            "\1\62\6\uffff\1\61",
            "",
            "",
            "\1\66\6\uffff\1\65",
            "\1\67\15\uffff\1\70",
            "\1\71\3\uffff\1\72",
            "\1\73",
            "\1\74\11\uffff\1\75",
            "\1\76",
            "\1\77",
            "\1\100",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\1\102\31\46",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\105",
            "\1\106",
            "\1\107",
            "\1\111\7\uffff\1\110",
            "\1\113\1\uffff\12\114\13\uffff\1\113\37\uffff\1\113",
            "\1\113\1\uffff\12\115\13\uffff\1\113\37\uffff\1\113",
            "\12\116",
            "\32\46\4\uffff\1\46\1\uffff\32\46",
            "",
            "\0\117",
            "\0\117",
            "\1\120\4\uffff\1\121",
            "",
            "",
            "\1\123",
            "",
            "",
            "\1\124",
            "\1\125",
            "\1\126",
            "\1\127",
            "",
            "",
            "\1\131\1\130",
            "\1\132",
            "\1\133",
            "\1\134",
            "\1\135",
            "",
            "",
            "\1\136",
            "\1\137",
            "\1\140",
            "\1\141",
            "\1\142",
            "\1\143",
            "\1\145\1\144",
            "\1\146\17\uffff\1\147",
            "\1\150",
            "\1\151",
            "\1\152",
            "\1\153",
            "",
            "\1\154",
            "",
            "",
            "\1\155",
            "\1\156",
            "\1\157",
            "\1\160",
            "\1\161",
            "",
            "",
            "",
            "\1\113\1\uffff\12\115\13\uffff\1\113\37\uffff\1\113",
            "\1\113\1\uffff\12\162\13\uffff\1\113\37\uffff\1\113",
            "",
            "",
            "",
            "",
            "\1\163",
            "\1\164",
            "\1\165\3\uffff\1\166",
            "\1\167",
            "\1\170",
            "\1\171",
            "\1\172",
            "\1\173",
            "\1\174",
            "\1\175",
            "\1\176",
            "\1\177",
            "\1\u0080",
            "\1\u0081",
            "\1\u0082",
            "\1\u0083",
            "\1\u0084",
            "\1\u0085",
            "\1\u0086",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\u0088",
            "\1\u0089",
            "\1\u008a",
            "\1\u008b",
            "\1\u008c",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\u008e",
            "\1\u008f",
            "\1\u0090",
            "\1\u0091",
            "\1\u0092",
            "\1\113\1\uffff\12\162\13\uffff\1\113\37\uffff\1\113",
            "\1\u0093",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\u0095",
            "\1\u0096",
            "\1\u0097",
            "\1\u0098",
            "\1\u0099",
            "\1\u009a",
            "\1\u009b",
            "\1\u009c",
            "\1\u009d",
            "\1\u009e",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\u00a1",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\u00a3",
            "\1\u00a4",
            "\12\46\7\uffff\21\46\1\u00a5\10\46\4\uffff\1\46\1\uffff\32\46",
            "\1\u00a7",
            "",
            "\1\u00a8",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\u00aa",
            "\1\u00ab",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "",
            "\1\u00ad",
            "\1\u00ae",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\u00b0",
            "\1\u00b1",
            "\1\u00b2",
            "",
            "\1\u00b3",
            "\1\u00b4",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\u00b6",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\u00ba",
            "\1\u00bb",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "",
            "",
            "\1\u00bd",
            "",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\u00bf",
            "\1\u00c0",
            "",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\u00c2",
            "",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\u00c4",
            "",
            "\1\u00c5",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\u00c8",
            "\1\u00c9",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "",
            "\1\u00cb",
            "",
            "",
            "",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\u00cd",
            "",
            "\1\u00ce",
            "",
            "\1\u00cf",
            "\1\u00d0",
            "",
            "\1\u00d1",
            "",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "",
            "",
            "\1\u00d4",
            "\1\u00d5",
            "",
            "\1\u00d6",
            "",
            "\1\u00d7",
            "\1\u00d8",
            "\1\u00d9",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\u00db",
            "",
            "",
            "\1\u00dc",
            "\1\u00dd",
            "\1\u00de",
            "\1\u00df",
            "\1\u00e0",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\12\46\7\uffff\10\46\1\u00e3\21\46\4\uffff\1\46\1\uffff\32\46",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\22\46\1\u00e5\7\46",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\u00e8",
            "\12\46\7\uffff\10\46\1\u00ee\2\46\1\u00ed\3\46\1\u00eb\2\46\1\u00ec\1\u00ea\1\46\1\u00e9\4\46\4\uffff\1\46\1\uffff\32\46",
            "",
            "",
            "\1\u00f0",
            "",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "",
            "",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\u00f3",
            "\1\u00f4",
            "\1\u00f5",
            "\1\u00f6",
            "\1\u00f7",
            "\1\u00f8",
            "",
            "\1\u00f9",
            "",
            "",
            "\1\u00fa",
            "\1\u00fb",
            "\1\u00fc",
            "\1\u00fd",
            "\1\u00fe",
            "\1\u00ff",
            "\1\u0100",
            "\1\u0101",
            "\1\u0102",
            "\1\u0103",
            "\1\u0104",
            "\1\u0105",
            "\1\u0106",
            "\1\u0107",
            "\1\u0108",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\u010a",
            "\1\u010b",
            "\1\u010c",
            "\1\u010d",
            "\1\u010e",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "",
            "\1\u0110",
            "\1\u0111",
            "\1\u0112",
            "\1\u0113",
            "\1\u0114",
            "",
            "\1\u0115",
            "\1\u0116",
            "\1\u0117",
            "\1\u0118",
            "\1\u0119",
            "\1\u011a",
            "\1\u011b",
            "\1\u011c",
            "\1\u011d",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\u0120",
            "\1\u0121",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "",
            "",
            "\1\u0123",
            "\1\u0124",
            "",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\u0126",
            "",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            ""
    };

    static final short[] DFA21_eot = DFA.unpackEncodedString(DFA21_eotS);
    static final short[] DFA21_eof = DFA.unpackEncodedString(DFA21_eofS);
    static final char[] DFA21_min = DFA.unpackEncodedStringToUnsignedChars(DFA21_minS);
    static final char[] DFA21_max = DFA.unpackEncodedStringToUnsignedChars(DFA21_maxS);
    static final short[] DFA21_accept = DFA.unpackEncodedString(DFA21_acceptS);
    static final short[] DFA21_special = DFA.unpackEncodedString(DFA21_specialS);
    static final short[][] DFA21_transition;

    static {
        int numStates = DFA21_transitionS.length;
        DFA21_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA21_transition[i] = DFA.unpackEncodedString(DFA21_transitionS[i]);
        }
    }

    class DFA21 extends DFA {

        public DFA21(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 21;
            this.eot = DFA21_eot;
            this.eof = DFA21_eof;
            this.min = DFA21_min;
            this.max = DFA21_max;
            this.accept = DFA21_accept;
            this.special = DFA21_special;
            this.transition = DFA21_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | RULE_BOOLEAN | RULE_DOUBLE | RULE_DECINT | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA21_32 = input.LA(1);

                        s = -1;
                        if ( ((LA21_32>='\u0000' && LA21_32<='\uFFFF')) ) {s = 79;}

                        else s = 36;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA21_33 = input.LA(1);

                        s = -1;
                        if ( ((LA21_33>='\u0000' && LA21_33<='\uFFFF')) ) {s = 79;}

                        else s = 36;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA21_0 = input.LA(1);

                        s = -1;
                        if ( (LA21_0=='C') ) {s = 1;}

                        else if ( (LA21_0=='{') ) {s = 2;}

                        else if ( (LA21_0=='n') ) {s = 3;}

                        else if ( (LA21_0=='p') ) {s = 4;}

                        else if ( (LA21_0==',') ) {s = 5;}

                        else if ( (LA21_0=='}') ) {s = 6;}

                        else if ( (LA21_0=='l') ) {s = 7;}

                        else if ( (LA21_0=='j') ) {s = 8;}

                        else if ( (LA21_0=='c') ) {s = 9;}

                        else if ( (LA21_0=='(') ) {s = 10;}

                        else if ( (LA21_0==')') ) {s = 11;}

                        else if ( (LA21_0=='t') ) {s = 12;}

                        else if ( (LA21_0=='P') ) {s = 13;}

                        else if ( (LA21_0=='v') ) {s = 14;}

                        else if ( (LA21_0=='L') ) {s = 15;}

                        else if ( (LA21_0=='r') ) {s = 16;}

                        else if ( (LA21_0=='J') ) {s = 17;}

                        else if ( (LA21_0=='o') ) {s = 18;}

                        else if ( (LA21_0=='a') ) {s = 19;}

                        else if ( (LA21_0=='x') ) {s = 20;}

                        else if ( (LA21_0=='y') ) {s = 21;}

                        else if ( (LA21_0=='z') ) {s = 22;}

                        else if ( (LA21_0=='e') ) {s = 23;}

                        else if ( (LA21_0=='u') ) {s = 24;}

                        else if ( (LA21_0=='A') ) {s = 25;}

                        else if ( (LA21_0=='f') ) {s = 26;}

                        else if ( (LA21_0=='0') ) {s = 27;}

                        else if ( ((LA21_0>='1' && LA21_0<='9')) ) {s = 28;}

                        else if ( (LA21_0=='-') ) {s = 29;}

                        else if ( (LA21_0=='^') ) {s = 30;}

                        else if ( (LA21_0=='B'||(LA21_0>='D' && LA21_0<='I')||LA21_0=='K'||(LA21_0>='M' && LA21_0<='O')||(LA21_0>='Q' && LA21_0<='Z')||LA21_0=='_'||LA21_0=='b'||LA21_0=='d'||(LA21_0>='g' && LA21_0<='i')||LA21_0=='k'||LA21_0=='m'||LA21_0=='q'||LA21_0=='s'||LA21_0=='w') ) {s = 31;}

                        else if ( (LA21_0=='\"') ) {s = 32;}

                        else if ( (LA21_0=='\'') ) {s = 33;}

                        else if ( (LA21_0=='/') ) {s = 34;}

                        else if ( ((LA21_0>='\t' && LA21_0<='\n')||LA21_0=='\r'||LA21_0==' ') ) {s = 35;}

                        else if ( ((LA21_0>='\u0000' && LA21_0<='\b')||(LA21_0>='\u000B' && LA21_0<='\f')||(LA21_0>='\u000E' && LA21_0<='\u001F')||LA21_0=='!'||(LA21_0>='#' && LA21_0<='&')||(LA21_0>='*' && LA21_0<='+')||LA21_0=='.'||(LA21_0>=':' && LA21_0<='@')||(LA21_0>='[' && LA21_0<=']')||LA21_0=='`'||LA21_0=='|'||(LA21_0>='~' && LA21_0<='\uFFFF')) ) {s = 36;}

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 21, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}