package de.fraunhofer.ipa.geometry.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalGeometryLexer extends Lexer {
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

    public InternalGeometryLexer() {;} 
    public InternalGeometryLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalGeometryLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalGeometry.g"; }

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGeometry.g:11:7: ( 'String' )
            // InternalGeometry.g:11:9: 'String'
            {
            match("String"); 


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
            // InternalGeometry.g:12:7: ( 'LinkGeometry' )
            // InternalGeometry.g:12:9: 'LinkGeometry'
            {
            match("LinkGeometry"); 


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
            // InternalGeometry.g:13:7: ( '{' )
            // InternalGeometry.g:13:9: '{'
            {
            match('{'); 

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
            // InternalGeometry.g:14:7: ( 'ref' )
            // InternalGeometry.g:14:9: 'ref'
            {
            match("ref"); 


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
            // InternalGeometry.g:15:7: ( '}' )
            // InternalGeometry.g:15:9: '}'
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
            // InternalGeometry.g:16:7: ( 'visual' )
            // InternalGeometry.g:16:9: 'visual'
            {
            match("visual"); 


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
            // InternalGeometry.g:17:7: ( 'collision' )
            // InternalGeometry.g:17:9: 'collision'
            {
            match("collision"); 


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
            // InternalGeometry.g:18:7: ( 'Visual' )
            // InternalGeometry.g:18:9: 'Visual'
            {
            match("Visual"); 


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
            // InternalGeometry.g:19:7: ( 'origin' )
            // InternalGeometry.g:19:9: 'origin'
            {
            match("origin"); 


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
            // InternalGeometry.g:20:7: ( 'geometry' )
            // InternalGeometry.g:20:9: 'geometry'
            {
            match("geometry"); 


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
            // InternalGeometry.g:21:7: ( 'Collision' )
            // InternalGeometry.g:21:9: 'Collision'
            {
            match("Collision"); 


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
            // InternalGeometry.g:22:7: ( 'Pose' )
            // InternalGeometry.g:22:9: 'Pose'
            {
            match("Pose"); 


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
            // InternalGeometry.g:23:7: ( 'rpy' )
            // InternalGeometry.g:23:9: 'rpy'
            {
            match("rpy"); 


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
            // InternalGeometry.g:24:7: ( 'xyz' )
            // InternalGeometry.g:24:9: 'xyz'
            {
            match("xyz"); 


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
            // InternalGeometry.g:25:7: ( 'value' )
            // InternalGeometry.g:25:9: 'value'
            {
            match("value"); 


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
            // InternalGeometry.g:26:7: ( 'Geometry' )
            // InternalGeometry.g:26:9: 'Geometry'
            {
            match("Geometry"); 


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
            // InternalGeometry.g:27:7: ( 'box' )
            // InternalGeometry.g:27:9: 'box'
            {
            match("box"); 


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
            // InternalGeometry.g:28:7: ( 'cylinder' )
            // InternalGeometry.g:28:9: 'cylinder'
            {
            match("cylinder"); 


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
            // InternalGeometry.g:29:7: ( 'mesh' )
            // InternalGeometry.g:29:9: 'mesh'
            {
            match("mesh"); 


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
            // InternalGeometry.g:30:7: ( 'sphere' )
            // InternalGeometry.g:30:9: 'sphere'
            {
            match("sphere"); 


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
            // InternalGeometry.g:31:7: ( 'Box' )
            // InternalGeometry.g:31:9: 'Box'
            {
            match("Box"); 


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
            // InternalGeometry.g:32:7: ( 'x' )
            // InternalGeometry.g:32:9: 'x'
            {
            match('x'); 

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
            // InternalGeometry.g:33:7: ( 'y' )
            // InternalGeometry.g:33:9: 'y'
            {
            match('y'); 

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
            // InternalGeometry.g:34:7: ( 'z' )
            // InternalGeometry.g:34:9: 'z'
            {
            match('z'); 

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
            // InternalGeometry.g:35:7: ( 'Cylinder' )
            // InternalGeometry.g:35:9: 'Cylinder'
            {
            match("Cylinder"); 


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
            // InternalGeometry.g:36:7: ( 'length' )
            // InternalGeometry.g:36:9: 'length'
            {
            match("length"); 


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
            // InternalGeometry.g:37:7: ( 'radius' )
            // InternalGeometry.g:37:9: 'radius'
            {
            match("radius"); 


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
            // InternalGeometry.g:38:7: ( 'Mesh' )
            // InternalGeometry.g:38:9: 'Mesh'
            {
            match("Mesh"); 


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
            // InternalGeometry.g:39:7: ( 'filename' )
            // InternalGeometry.g:39:9: 'filename'
            {
            match("filename"); 


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
            // InternalGeometry.g:40:7: ( 'scale' )
            // InternalGeometry.g:40:9: 'scale'
            {
            match("scale"); 


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
            // InternalGeometry.g:41:7: ( 'Sphere' )
            // InternalGeometry.g:41:9: 'Sphere'
            {
            match("Sphere"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__46"

    // $ANTLR start "RULE_DIGIT"
    public final void mRULE_DIGIT() throws RecognitionException {
        try {
            // InternalGeometry.g:3008:21: ( '0' .. '9' )
            // InternalGeometry.g:3008:23: '0' .. '9'
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
            // InternalGeometry.g:3010:14: ( ( 'true' | 'false' ) )
            // InternalGeometry.g:3010:16: ( 'true' | 'false' )
            {
            // InternalGeometry.g:3010:16: ( 'true' | 'false' )
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
                    // InternalGeometry.g:3010:17: 'true'
                    {
                    match("true"); 


                    }
                    break;
                case 2 :
                    // InternalGeometry.g:3010:24: 'false'
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
            // InternalGeometry.g:3012:13: ( RULE_DECINT ( '.' ( RULE_DIGIT )* | ( '.' ( RULE_DIGIT )* )? ( 'E' | 'e' ) ( '-' | '+' )? RULE_DECINT ) )
            // InternalGeometry.g:3012:15: RULE_DECINT ( '.' ( RULE_DIGIT )* | ( '.' ( RULE_DIGIT )* )? ( 'E' | 'e' ) ( '-' | '+' )? RULE_DECINT )
            {
            mRULE_DECINT(); 
            // InternalGeometry.g:3012:27: ( '.' ( RULE_DIGIT )* | ( '.' ( RULE_DIGIT )* )? ( 'E' | 'e' ) ( '-' | '+' )? RULE_DECINT )
            int alt6=2;
            alt6 = dfa6.predict(input);
            switch (alt6) {
                case 1 :
                    // InternalGeometry.g:3012:28: '.' ( RULE_DIGIT )*
                    {
                    match('.'); 
                    // InternalGeometry.g:3012:32: ( RULE_DIGIT )*
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( ((LA2_0>='0' && LA2_0<='9')) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // InternalGeometry.g:3012:32: RULE_DIGIT
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
                    // InternalGeometry.g:3012:44: ( '.' ( RULE_DIGIT )* )? ( 'E' | 'e' ) ( '-' | '+' )? RULE_DECINT
                    {
                    // InternalGeometry.g:3012:44: ( '.' ( RULE_DIGIT )* )?
                    int alt4=2;
                    int LA4_0 = input.LA(1);

                    if ( (LA4_0=='.') ) {
                        alt4=1;
                    }
                    switch (alt4) {
                        case 1 :
                            // InternalGeometry.g:3012:45: '.' ( RULE_DIGIT )*
                            {
                            match('.'); 
                            // InternalGeometry.g:3012:49: ( RULE_DIGIT )*
                            loop3:
                            do {
                                int alt3=2;
                                int LA3_0 = input.LA(1);

                                if ( ((LA3_0>='0' && LA3_0<='9')) ) {
                                    alt3=1;
                                }


                                switch (alt3) {
                            	case 1 :
                            	    // InternalGeometry.g:3012:49: RULE_DIGIT
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

                    // InternalGeometry.g:3012:73: ( '-' | '+' )?
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
                            // InternalGeometry.g:
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
            // InternalGeometry.g:3014:13: ( ( '0' | '1' .. '9' ( RULE_DIGIT )* | '-' '0' .. '9' ( RULE_DIGIT )* ) )
            // InternalGeometry.g:3014:15: ( '0' | '1' .. '9' ( RULE_DIGIT )* | '-' '0' .. '9' ( RULE_DIGIT )* )
            {
            // InternalGeometry.g:3014:15: ( '0' | '1' .. '9' ( RULE_DIGIT )* | '-' '0' .. '9' ( RULE_DIGIT )* )
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
                    // InternalGeometry.g:3014:16: '0'
                    {
                    match('0'); 

                    }
                    break;
                case 2 :
                    // InternalGeometry.g:3014:20: '1' .. '9' ( RULE_DIGIT )*
                    {
                    matchRange('1','9'); 
                    // InternalGeometry.g:3014:29: ( RULE_DIGIT )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( ((LA7_0>='0' && LA7_0<='9')) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // InternalGeometry.g:3014:29: RULE_DIGIT
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
                    // InternalGeometry.g:3014:41: '-' '0' .. '9' ( RULE_DIGIT )*
                    {
                    match('-'); 
                    matchRange('0','9'); 
                    // InternalGeometry.g:3014:54: ( RULE_DIGIT )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( ((LA8_0>='0' && LA8_0<='9')) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // InternalGeometry.g:3014:54: RULE_DIGIT
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

    // $ANTLR start "RULE_JOINTTYPE"
    public final void mRULE_JOINTTYPE() throws RecognitionException {
        try {
            int _type = RULE_JOINTTYPE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGeometry.g:3016:16: ( ( 'revolute' | 'continuous' | 'prismatic' | 'fixed' | 'floating' | 'planar' ) )
            // InternalGeometry.g:3016:18: ( 'revolute' | 'continuous' | 'prismatic' | 'fixed' | 'floating' | 'planar' )
            {
            // InternalGeometry.g:3016:18: ( 'revolute' | 'continuous' | 'prismatic' | 'fixed' | 'floating' | 'planar' )
            int alt10=6;
            switch ( input.LA(1) ) {
            case 'r':
                {
                alt10=1;
                }
                break;
            case 'c':
                {
                alt10=2;
                }
                break;
            case 'p':
                {
                int LA10_3 = input.LA(2);

                if ( (LA10_3=='r') ) {
                    alt10=3;
                }
                else if ( (LA10_3=='l') ) {
                    alt10=6;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 10, 3, input);

                    throw nvae;
                }
                }
                break;
            case 'f':
                {
                int LA10_4 = input.LA(2);

                if ( (LA10_4=='i') ) {
                    alt10=4;
                }
                else if ( (LA10_4=='l') ) {
                    alt10=5;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 10, 4, input);

                    throw nvae;
                }
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // InternalGeometry.g:3016:19: 'revolute'
                    {
                    match("revolute"); 


                    }
                    break;
                case 2 :
                    // InternalGeometry.g:3016:30: 'continuous'
                    {
                    match("continuous"); 


                    }
                    break;
                case 3 :
                    // InternalGeometry.g:3016:43: 'prismatic'
                    {
                    match("prismatic"); 


                    }
                    break;
                case 4 :
                    // InternalGeometry.g:3016:55: 'fixed'
                    {
                    match("fixed"); 


                    }
                    break;
                case 5 :
                    // InternalGeometry.g:3016:63: 'floating'
                    {
                    match("floating"); 


                    }
                    break;
                case 6 :
                    // InternalGeometry.g:3016:74: 'planar'
                    {
                    match("planar"); 


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
    // $ANTLR end "RULE_JOINTTYPE"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGeometry.g:3018:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalGeometry.g:3018:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalGeometry.g:3018:11: ( '^' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0=='^') ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalGeometry.g:3018:11: '^'
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

            // InternalGeometry.g:3018:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>='0' && LA12_0<='9')||(LA12_0>='A' && LA12_0<='Z')||LA12_0=='_'||(LA12_0>='a' && LA12_0<='z')) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalGeometry.g:
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
            	    break loop12;
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
            // InternalGeometry.g:3020:10: ( ( '0' .. '9' )+ )
            // InternalGeometry.g:3020:12: ( '0' .. '9' )+
            {
            // InternalGeometry.g:3020:12: ( '0' .. '9' )+
            int cnt13=0;
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>='0' && LA13_0<='9')) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalGeometry.g:3020:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt13 >= 1 ) break loop13;
                        EarlyExitException eee =
                            new EarlyExitException(13, input);
                        throw eee;
                }
                cnt13++;
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
            // InternalGeometry.g:3022:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalGeometry.g:3022:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalGeometry.g:3022:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0=='\"') ) {
                alt16=1;
            }
            else if ( (LA16_0=='\'') ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // InternalGeometry.g:3022:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalGeometry.g:3022:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop14:
                    do {
                        int alt14=3;
                        int LA14_0 = input.LA(1);

                        if ( (LA14_0=='\\') ) {
                            alt14=1;
                        }
                        else if ( ((LA14_0>='\u0000' && LA14_0<='!')||(LA14_0>='#' && LA14_0<='[')||(LA14_0>=']' && LA14_0<='\uFFFF')) ) {
                            alt14=2;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // InternalGeometry.g:3022:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalGeometry.g:3022:28: ~ ( ( '\\\\' | '\"' ) )
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
                    	    break loop14;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalGeometry.g:3022:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalGeometry.g:3022:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop15:
                    do {
                        int alt15=3;
                        int LA15_0 = input.LA(1);

                        if ( (LA15_0=='\\') ) {
                            alt15=1;
                        }
                        else if ( ((LA15_0>='\u0000' && LA15_0<='&')||(LA15_0>='(' && LA15_0<='[')||(LA15_0>=']' && LA15_0<='\uFFFF')) ) {
                            alt15=2;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // InternalGeometry.g:3022:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalGeometry.g:3022:61: ~ ( ( '\\\\' | '\\'' ) )
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
                    	    break loop15;
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
            // InternalGeometry.g:3024:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalGeometry.g:3024:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalGeometry.g:3024:24: ( options {greedy=false; } : . )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0=='*') ) {
                    int LA17_1 = input.LA(2);

                    if ( (LA17_1=='/') ) {
                        alt17=2;
                    }
                    else if ( ((LA17_1>='\u0000' && LA17_1<='.')||(LA17_1>='0' && LA17_1<='\uFFFF')) ) {
                        alt17=1;
                    }


                }
                else if ( ((LA17_0>='\u0000' && LA17_0<=')')||(LA17_0>='+' && LA17_0<='\uFFFF')) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalGeometry.g:3024:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop17;
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
            // InternalGeometry.g:3026:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalGeometry.g:3026:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalGeometry.g:3026:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( ((LA18_0>='\u0000' && LA18_0<='\t')||(LA18_0>='\u000B' && LA18_0<='\f')||(LA18_0>='\u000E' && LA18_0<='\uFFFF')) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalGeometry.g:3026:24: ~ ( ( '\\n' | '\\r' ) )
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
            	    break loop18;
                }
            } while (true);

            // InternalGeometry.g:3026:40: ( ( '\\r' )? '\\n' )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0=='\n'||LA20_0=='\r') ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalGeometry.g:3026:41: ( '\\r' )? '\\n'
                    {
                    // InternalGeometry.g:3026:41: ( '\\r' )?
                    int alt19=2;
                    int LA19_0 = input.LA(1);

                    if ( (LA19_0=='\r') ) {
                        alt19=1;
                    }
                    switch (alt19) {
                        case 1 :
                            // InternalGeometry.g:3026:41: '\\r'
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
            // InternalGeometry.g:3028:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalGeometry.g:3028:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalGeometry.g:3028:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt21=0;
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( ((LA21_0>='\t' && LA21_0<='\n')||LA21_0=='\r'||LA21_0==' ') ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalGeometry.g:
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
            	    if ( cnt21 >= 1 ) break loop21;
                        EarlyExitException eee =
                            new EarlyExitException(21, input);
                        throw eee;
                }
                cnt21++;
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
            // InternalGeometry.g:3030:16: ( . )
            // InternalGeometry.g:3030:18: .
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
        // InternalGeometry.g:1:8: ( T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | RULE_BOOLEAN | RULE_DOUBLE | RULE_DECINT | RULE_JOINTTYPE | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt22=42;
        alt22 = dfa22.predict(input);
        switch (alt22) {
            case 1 :
                // InternalGeometry.g:1:10: T__16
                {
                mT__16(); 

                }
                break;
            case 2 :
                // InternalGeometry.g:1:16: T__17
                {
                mT__17(); 

                }
                break;
            case 3 :
                // InternalGeometry.g:1:22: T__18
                {
                mT__18(); 

                }
                break;
            case 4 :
                // InternalGeometry.g:1:28: T__19
                {
                mT__19(); 

                }
                break;
            case 5 :
                // InternalGeometry.g:1:34: T__20
                {
                mT__20(); 

                }
                break;
            case 6 :
                // InternalGeometry.g:1:40: T__21
                {
                mT__21(); 

                }
                break;
            case 7 :
                // InternalGeometry.g:1:46: T__22
                {
                mT__22(); 

                }
                break;
            case 8 :
                // InternalGeometry.g:1:52: T__23
                {
                mT__23(); 

                }
                break;
            case 9 :
                // InternalGeometry.g:1:58: T__24
                {
                mT__24(); 

                }
                break;
            case 10 :
                // InternalGeometry.g:1:64: T__25
                {
                mT__25(); 

                }
                break;
            case 11 :
                // InternalGeometry.g:1:70: T__26
                {
                mT__26(); 

                }
                break;
            case 12 :
                // InternalGeometry.g:1:76: T__27
                {
                mT__27(); 

                }
                break;
            case 13 :
                // InternalGeometry.g:1:82: T__28
                {
                mT__28(); 

                }
                break;
            case 14 :
                // InternalGeometry.g:1:88: T__29
                {
                mT__29(); 

                }
                break;
            case 15 :
                // InternalGeometry.g:1:94: T__30
                {
                mT__30(); 

                }
                break;
            case 16 :
                // InternalGeometry.g:1:100: T__31
                {
                mT__31(); 

                }
                break;
            case 17 :
                // InternalGeometry.g:1:106: T__32
                {
                mT__32(); 

                }
                break;
            case 18 :
                // InternalGeometry.g:1:112: T__33
                {
                mT__33(); 

                }
                break;
            case 19 :
                // InternalGeometry.g:1:118: T__34
                {
                mT__34(); 

                }
                break;
            case 20 :
                // InternalGeometry.g:1:124: T__35
                {
                mT__35(); 

                }
                break;
            case 21 :
                // InternalGeometry.g:1:130: T__36
                {
                mT__36(); 

                }
                break;
            case 22 :
                // InternalGeometry.g:1:136: T__37
                {
                mT__37(); 

                }
                break;
            case 23 :
                // InternalGeometry.g:1:142: T__38
                {
                mT__38(); 

                }
                break;
            case 24 :
                // InternalGeometry.g:1:148: T__39
                {
                mT__39(); 

                }
                break;
            case 25 :
                // InternalGeometry.g:1:154: T__40
                {
                mT__40(); 

                }
                break;
            case 26 :
                // InternalGeometry.g:1:160: T__41
                {
                mT__41(); 

                }
                break;
            case 27 :
                // InternalGeometry.g:1:166: T__42
                {
                mT__42(); 

                }
                break;
            case 28 :
                // InternalGeometry.g:1:172: T__43
                {
                mT__43(); 

                }
                break;
            case 29 :
                // InternalGeometry.g:1:178: T__44
                {
                mT__44(); 

                }
                break;
            case 30 :
                // InternalGeometry.g:1:184: T__45
                {
                mT__45(); 

                }
                break;
            case 31 :
                // InternalGeometry.g:1:190: T__46
                {
                mT__46(); 

                }
                break;
            case 32 :
                // InternalGeometry.g:1:196: RULE_BOOLEAN
                {
                mRULE_BOOLEAN(); 

                }
                break;
            case 33 :
                // InternalGeometry.g:1:209: RULE_DOUBLE
                {
                mRULE_DOUBLE(); 

                }
                break;
            case 34 :
                // InternalGeometry.g:1:221: RULE_DECINT
                {
                mRULE_DECINT(); 

                }
                break;
            case 35 :
                // InternalGeometry.g:1:233: RULE_JOINTTYPE
                {
                mRULE_JOINTTYPE(); 

                }
                break;
            case 36 :
                // InternalGeometry.g:1:248: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 37 :
                // InternalGeometry.g:1:256: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 38 :
                // InternalGeometry.g:1:265: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 39 :
                // InternalGeometry.g:1:277: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 40 :
                // InternalGeometry.g:1:293: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 41 :
                // InternalGeometry.g:1:309: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 42 :
                // InternalGeometry.g:1:317: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA6 dfa6 = new DFA6(this);
    protected DFA22 dfa22 = new DFA22(this);
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
            return "3012:27: ( '.' ( RULE_DIGIT )* | ( '.' ( RULE_DIGIT )* )? ( 'E' | 'e' ) ( '-' | '+' )? RULE_DECINT )";
        }
    }
    static final String DFA22_eotS =
        "\1\uffff\2\46\1\uffff\1\46\1\uffff\7\46\1\70\5\46\1\77\1\100\4\46\2\107\1\43\1\46\1\43\1\uffff\3\43\2\uffff\2\46\1\uffff\1\46\1\uffff\3\46\1\uffff\13\46\1\uffff\6\46\2\uffff\6\46\3\uffff\2\107\2\46\4\uffff\3\46\1\170\1\46\1\172\14\46\1\u0087\1\46\1\u0089\3\46\1\u008d\7\46\1\107\5\46\1\uffff\1\46\1\uffff\13\46\1\u00a6\1\uffff\1\46\1\uffff\1\u00a8\2\46\1\uffff\1\46\1\u00ac\4\46\1\u00b1\10\46\1\u00ba\10\46\1\uffff\1\46\1\uffff\1\46\1\u00c5\1\46\1\uffff\1\46\1\u00c8\1\u00b1\1\46\1\uffff\2\46\1\u00cc\1\u00cd\2\46\1\u00d0\1\u00d1\1\uffff\3\46\1\u00d5\1\u00d6\4\46\1\u00db\1\uffff\1\u00dc\1\46\1\uffff\2\46\1\u00c8\2\uffff\2\46\2\uffff\3\46\2\uffff\4\46\2\uffff\4\46\1\u00c8\2\46\1\u00ef\1\u00f0\1\46\1\u00f2\1\u00f3\1\u00f4\1\u00c8\2\46\1\u00f7\1\46\2\uffff\1\u00f9\3\uffff\1\u00c8\1\46\1\uffff\1\u00c8\1\uffff\1\46\1\u00fc\1\uffff";
    static final String DFA22_eofS =
        "\u00fd\uffff";
    static final String DFA22_minS =
        "\1\0\1\160\1\151\1\uffff\1\141\1\uffff\1\141\1\157\1\151\1\162\1\145\2\157\1\60\1\145\1\157\1\145\1\143\1\157\2\60\2\145\1\141\1\162\2\56\1\60\1\154\1\101\1\uffff\2\0\1\52\2\uffff\1\162\1\150\1\uffff\1\156\1\uffff\1\146\1\171\1\144\1\uffff\1\163\3\154\1\163\1\151\1\157\2\154\1\163\1\172\1\uffff\1\157\1\170\1\163\1\150\1\141\1\170\2\uffff\1\156\1\163\2\154\1\157\1\165\3\uffff\2\56\1\151\1\141\4\uffff\1\151\1\145\1\153\1\60\1\157\1\60\1\151\2\165\1\154\1\164\1\151\1\165\1\147\1\155\1\154\1\151\1\145\1\60\1\155\1\60\1\150\1\145\1\154\1\60\1\147\1\150\2\145\1\163\1\141\1\145\1\56\1\163\2\156\1\162\1\107\1\uffff\1\154\1\uffff\1\165\1\141\1\145\2\151\1\156\1\141\1\151\1\145\1\151\1\156\1\60\1\uffff\1\145\1\uffff\1\60\1\162\1\145\1\uffff\1\164\1\60\1\156\1\144\1\145\1\164\1\60\1\155\1\141\1\147\2\145\1\165\1\163\1\154\1\60\1\163\1\156\1\144\1\154\1\156\1\164\1\163\1\144\1\uffff\1\164\1\uffff\1\145\1\60\1\150\1\uffff\1\141\2\60\1\151\1\uffff\1\141\1\162\2\60\1\157\1\164\2\60\1\uffff\1\151\1\165\1\145\2\60\1\162\1\151\1\145\1\162\1\60\1\uffff\1\60\1\155\1\uffff\1\156\1\164\1\60\2\uffff\1\155\1\145\2\uffff\2\157\1\162\2\uffff\1\171\1\157\1\162\1\171\2\uffff\1\145\1\147\1\151\1\145\1\60\1\156\1\165\2\60\1\156\4\60\1\143\1\164\1\60\1\163\2\uffff\1\60\3\uffff\1\60\1\162\1\uffff\1\60\1\uffff\1\171\1\60\1\uffff";
    static final String DFA22_maxS =
        "\1\uffff\1\164\1\151\1\uffff\1\160\1\uffff\1\151\1\171\1\151\1\162\1\145\1\171\1\157\1\172\1\145\1\157\1\145\1\160\1\157\2\172\2\145\1\154\1\162\2\145\1\71\1\162\1\172\1\uffff\2\uffff\1\57\2\uffff\1\162\1\150\1\uffff\1\156\1\uffff\1\166\1\171\1\144\1\uffff\1\163\1\154\1\156\1\154\1\163\1\151\1\157\2\154\1\163\1\172\1\uffff\1\157\1\170\1\163\1\150\1\141\1\170\2\uffff\1\156\1\163\1\170\1\154\1\157\1\165\3\uffff\2\145\1\151\1\141\4\uffff\1\151\1\145\1\153\1\172\1\157\1\172\1\151\2\165\1\154\1\164\1\151\1\165\1\147\1\155\1\154\1\151\1\145\1\172\1\155\1\172\1\150\1\145\1\154\1\172\1\147\1\150\2\145\1\163\1\141\2\145\1\163\2\156\1\162\1\107\1\uffff\1\154\1\uffff\1\165\1\141\1\145\2\151\1\156\1\141\1\151\1\145\1\151\1\156\1\172\1\uffff\1\145\1\uffff\1\172\1\162\1\145\1\uffff\1\164\1\172\1\156\1\144\1\145\1\164\1\172\1\155\1\141\1\147\2\145\1\165\1\163\1\154\1\172\1\163\1\156\1\144\1\154\1\156\1\164\1\163\1\144\1\uffff\1\164\1\uffff\1\145\1\172\1\150\1\uffff\1\141\2\172\1\151\1\uffff\1\141\1\162\2\172\1\157\1\164\2\172\1\uffff\1\151\1\165\1\145\2\172\1\162\1\151\1\145\1\162\1\172\1\uffff\1\172\1\155\1\uffff\1\156\1\164\1\172\2\uffff\1\155\1\145\2\uffff\2\157\1\162\2\uffff\1\171\1\157\1\162\1\171\2\uffff\1\145\1\147\1\151\1\145\1\172\1\156\1\165\2\172\1\156\4\172\1\143\1\164\1\172\1\163\2\uffff\1\172\3\uffff\1\172\1\162\1\uffff\1\172\1\uffff\1\171\1\172\1\uffff";
    static final String DFA22_acceptS =
        "\3\uffff\1\3\1\uffff\1\5\30\uffff\1\44\3\uffff\1\51\1\52\2\uffff\1\44\1\uffff\1\3\3\uffff\1\5\13\uffff\1\26\6\uffff\1\27\1\30\6\uffff\1\42\1\41\1\45\4\uffff\1\46\1\47\1\50\1\51\46\uffff\1\4\1\uffff\1\15\14\uffff\1\16\1\uffff\1\21\3\uffff\1\25\30\uffff\1\14\1\uffff\1\23\3\uffff\1\34\4\uffff\1\40\10\uffff\1\17\12\uffff\1\36\2\uffff\1\43\3\uffff\1\1\1\37\2\uffff\1\33\1\6\3\uffff\1\10\1\11\4\uffff\1\24\1\32\22\uffff\1\22\1\12\1\uffff\1\31\1\20\1\35\2\uffff\1\7\1\uffff\1\13\2\uffff\1\2";
    static final String DFA22_specialS =
        "\1\1\36\uffff\1\0\1\2\u00dc\uffff}>";
    static final String[] DFA22_transitionS = {
            "\11\43\2\42\2\43\1\42\22\43\1\42\1\43\1\37\4\43\1\40\5\43\1\33\1\43\1\41\1\31\11\32\7\43\1\36\1\22\1\13\3\36\1\16\4\36\1\2\1\26\2\36\1\14\2\36\1\1\2\36\1\10\4\36\3\43\1\35\1\36\1\43\1\36\1\17\1\7\2\36\1\27\1\12\4\36\1\25\1\20\1\36\1\11\1\34\1\36\1\4\1\21\1\30\1\36\1\6\1\36\1\15\1\23\1\24\1\3\1\43\1\5\uff82\43",
            "\1\45\3\uffff\1\44",
            "\1\47",
            "",
            "\1\53\3\uffff\1\51\12\uffff\1\52",
            "",
            "\1\56\7\uffff\1\55",
            "\1\57\11\uffff\1\60",
            "\1\61",
            "\1\62",
            "\1\63",
            "\1\64\11\uffff\1\65",
            "\1\66",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\30\46\1\67\1\46",
            "\1\71",
            "\1\72",
            "\1\73",
            "\1\75\14\uffff\1\74",
            "\1\76",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\101",
            "\1\102",
            "\1\104\7\uffff\1\103\2\uffff\1\105",
            "\1\106",
            "\1\110\1\uffff\12\111\13\uffff\1\110\37\uffff\1\110",
            "\1\110\1\uffff\12\112\13\uffff\1\110\37\uffff\1\110",
            "\12\113",
            "\1\115\5\uffff\1\114",
            "\32\46\4\uffff\1\46\1\uffff\32\46",
            "",
            "\0\116",
            "\0\116",
            "\1\117\4\uffff\1\120",
            "",
            "",
            "\1\122",
            "\1\123",
            "",
            "\1\124",
            "",
            "\1\125\17\uffff\1\126",
            "\1\127",
            "\1\130",
            "",
            "\1\131",
            "\1\132",
            "\1\133\1\uffff\1\134",
            "\1\135",
            "\1\136",
            "\1\137",
            "\1\140",
            "\1\141",
            "\1\142",
            "\1\143",
            "\1\144",
            "",
            "\1\145",
            "\1\146",
            "\1\147",
            "\1\150",
            "\1\151",
            "\1\152",
            "",
            "",
            "\1\153",
            "\1\154",
            "\1\155\13\uffff\1\156",
            "\1\157",
            "\1\160",
            "\1\161",
            "",
            "",
            "",
            "\1\110\1\uffff\12\112\13\uffff\1\110\37\uffff\1\110",
            "\1\110\1\uffff\12\162\13\uffff\1\110\37\uffff\1\110",
            "\1\163",
            "\1\164",
            "",
            "",
            "",
            "",
            "\1\165",
            "\1\166",
            "\1\167",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\171",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
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
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\u008a",
            "\1\u008b",
            "\1\u008c",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\u008e",
            "\1\u008f",
            "\1\u0090",
            "\1\u0091",
            "\1\u0092",
            "\1\u0093",
            "\1\u0094",
            "\1\110\1\uffff\12\162\13\uffff\1\110\37\uffff\1\110",
            "\1\u0095",
            "\1\u0096",
            "\1\u0097",
            "\1\u0098",
            "\1\u0099",
            "",
            "\1\u009a",
            "",
            "\1\u009b",
            "\1\u009c",
            "\1\u009d",
            "\1\u009e",
            "\1\u009f",
            "\1\u00a0",
            "\1\u00a1",
            "\1\u00a2",
            "\1\u00a3",
            "\1\u00a4",
            "\1\u00a5",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "",
            "\1\u00a7",
            "",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\u00a9",
            "\1\u00aa",
            "",
            "\1\u00ab",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\u00ad",
            "\1\u00ae",
            "\1\u00af",
            "\1\u00b0",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\u00b2",
            "\1\u00b3",
            "\1\u00b4",
            "\1\u00b5",
            "\1\u00b6",
            "\1\u00b7",
            "\1\u00b8",
            "\1\u00b9",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\u00bb",
            "\1\u00bc",
            "\1\u00bd",
            "\1\u00be",
            "\1\u00bf",
            "\1\u00c0",
            "\1\u00c1",
            "\1\u00c2",
            "",
            "\1\u00c3",
            "",
            "\1\u00c4",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\u00c6",
            "",
            "\1\u00c7",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\u00c9",
            "",
            "\1\u00ca",
            "\1\u00cb",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\u00ce",
            "\1\u00cf",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "",
            "\1\u00d2",
            "\1\u00d3",
            "\1\u00d4",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\u00d7",
            "\1\u00d8",
            "\1\u00d9",
            "\1\u00da",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\u00dd",
            "",
            "\1\u00de",
            "\1\u00df",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "",
            "",
            "\1\u00e0",
            "\1\u00e1",
            "",
            "",
            "\1\u00e2",
            "\1\u00e3",
            "\1\u00e4",
            "",
            "",
            "\1\u00e5",
            "\1\u00e6",
            "\1\u00e7",
            "\1\u00e8",
            "",
            "",
            "\1\u00e9",
            "\1\u00ea",
            "\1\u00eb",
            "\1\u00ec",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\u00ed",
            "\1\u00ee",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\u00f1",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\u00f5",
            "\1\u00f6",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\u00f8",
            "",
            "",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "",
            "",
            "",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\u00fa",
            "",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "",
            "\1\u00fb",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            ""
    };

    static final short[] DFA22_eot = DFA.unpackEncodedString(DFA22_eotS);
    static final short[] DFA22_eof = DFA.unpackEncodedString(DFA22_eofS);
    static final char[] DFA22_min = DFA.unpackEncodedStringToUnsignedChars(DFA22_minS);
    static final char[] DFA22_max = DFA.unpackEncodedStringToUnsignedChars(DFA22_maxS);
    static final short[] DFA22_accept = DFA.unpackEncodedString(DFA22_acceptS);
    static final short[] DFA22_special = DFA.unpackEncodedString(DFA22_specialS);
    static final short[][] DFA22_transition;

    static {
        int numStates = DFA22_transitionS.length;
        DFA22_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA22_transition[i] = DFA.unpackEncodedString(DFA22_transitionS[i]);
        }
    }

    class DFA22 extends DFA {

        public DFA22(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 22;
            this.eot = DFA22_eot;
            this.eof = DFA22_eof;
            this.min = DFA22_min;
            this.max = DFA22_max;
            this.accept = DFA22_accept;
            this.special = DFA22_special;
            this.transition = DFA22_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | RULE_BOOLEAN | RULE_DOUBLE | RULE_DECINT | RULE_JOINTTYPE | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA22_31 = input.LA(1);

                        s = -1;
                        if ( ((LA22_31>='\u0000' && LA22_31<='\uFFFF')) ) {s = 78;}

                        else s = 35;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA22_0 = input.LA(1);

                        s = -1;
                        if ( (LA22_0=='S') ) {s = 1;}

                        else if ( (LA22_0=='L') ) {s = 2;}

                        else if ( (LA22_0=='{') ) {s = 3;}

                        else if ( (LA22_0=='r') ) {s = 4;}

                        else if ( (LA22_0=='}') ) {s = 5;}

                        else if ( (LA22_0=='v') ) {s = 6;}

                        else if ( (LA22_0=='c') ) {s = 7;}

                        else if ( (LA22_0=='V') ) {s = 8;}

                        else if ( (LA22_0=='o') ) {s = 9;}

                        else if ( (LA22_0=='g') ) {s = 10;}

                        else if ( (LA22_0=='C') ) {s = 11;}

                        else if ( (LA22_0=='P') ) {s = 12;}

                        else if ( (LA22_0=='x') ) {s = 13;}

                        else if ( (LA22_0=='G') ) {s = 14;}

                        else if ( (LA22_0=='b') ) {s = 15;}

                        else if ( (LA22_0=='m') ) {s = 16;}

                        else if ( (LA22_0=='s') ) {s = 17;}

                        else if ( (LA22_0=='B') ) {s = 18;}

                        else if ( (LA22_0=='y') ) {s = 19;}

                        else if ( (LA22_0=='z') ) {s = 20;}

                        else if ( (LA22_0=='l') ) {s = 21;}

                        else if ( (LA22_0=='M') ) {s = 22;}

                        else if ( (LA22_0=='f') ) {s = 23;}

                        else if ( (LA22_0=='t') ) {s = 24;}

                        else if ( (LA22_0=='0') ) {s = 25;}

                        else if ( ((LA22_0>='1' && LA22_0<='9')) ) {s = 26;}

                        else if ( (LA22_0=='-') ) {s = 27;}

                        else if ( (LA22_0=='p') ) {s = 28;}

                        else if ( (LA22_0=='^') ) {s = 29;}

                        else if ( (LA22_0=='A'||(LA22_0>='D' && LA22_0<='F')||(LA22_0>='H' && LA22_0<='K')||(LA22_0>='N' && LA22_0<='O')||(LA22_0>='Q' && LA22_0<='R')||(LA22_0>='T' && LA22_0<='U')||(LA22_0>='W' && LA22_0<='Z')||LA22_0=='_'||LA22_0=='a'||(LA22_0>='d' && LA22_0<='e')||(LA22_0>='h' && LA22_0<='k')||LA22_0=='n'||LA22_0=='q'||LA22_0=='u'||LA22_0=='w') ) {s = 30;}

                        else if ( (LA22_0=='\"') ) {s = 31;}

                        else if ( (LA22_0=='\'') ) {s = 32;}

                        else if ( (LA22_0=='/') ) {s = 33;}

                        else if ( ((LA22_0>='\t' && LA22_0<='\n')||LA22_0=='\r'||LA22_0==' ') ) {s = 34;}

                        else if ( ((LA22_0>='\u0000' && LA22_0<='\b')||(LA22_0>='\u000B' && LA22_0<='\f')||(LA22_0>='\u000E' && LA22_0<='\u001F')||LA22_0=='!'||(LA22_0>='#' && LA22_0<='&')||(LA22_0>='(' && LA22_0<=',')||LA22_0=='.'||(LA22_0>=':' && LA22_0<='@')||(LA22_0>='[' && LA22_0<=']')||LA22_0=='`'||LA22_0=='|'||(LA22_0>='~' && LA22_0<='\uFFFF')) ) {s = 35;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA22_32 = input.LA(1);

                        s = -1;
                        if ( ((LA22_32>='\u0000' && LA22_32<='\uFFFF')) ) {s = 78;}

                        else s = 35;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 22, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}