/*
 * generated by Xtext 2.25.0
 */
grammar InternalKinematics;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package de.fraunhofer.ipa.kinematics.xtext.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package de.fraunhofer.ipa.kinematics.xtext.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import de.fraunhofer.ipa.kinematics.xtext.services.KinematicsGrammarAccess;

}

@parser::members {

 	private KinematicsGrammarAccess grammarAccess;

    public InternalKinematicsParser(TokenStream input, KinematicsGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }

    @Override
    protected String getFirstRuleName() {
    	return "Kinematics";
   	}

   	@Override
   	protected KinematicsGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleKinematics
entryRuleKinematics returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getKinematicsRule()); }
	iv_ruleKinematics=ruleKinematics
	{ $current=$iv_ruleKinematics.current; }
	EOF;

// Rule Kinematics
ruleKinematics returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='robot'
		{
			newLeafNode(otherlv_0, grammarAccess.getKinematicsAccess().getRobotKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getKinematicsAccess().getNameEStringParserRuleCall_1_0());
				}
				lv_name_1_0=ruleEString
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getKinematicsRule());
					}
					set(
						$current,
						"name",
						lv_name_1_0,
						"de.fraunhofer.ipa.kinematics.xtext.Kinematics.EString");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_2='{'
		{
			newLeafNode(otherlv_2, grammarAccess.getKinematicsAccess().getLeftCurlyBracketKeyword_2());
		}
		otherlv_3='root_link'
		{
			newLeafNode(otherlv_3, grammarAccess.getKinematicsAccess().getRoot_linkKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getKinematicsAccess().getRoot_linkLinkParserRuleCall_4_0());
				}
				lv_root_link_4_0=rulelink
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getKinematicsRule());
					}
					set(
						$current,
						"root_link",
						lv_root_link_4_0,
						"de.fraunhofer.ipa.kinematics.xtext.Kinematics.link");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_5='joints'
			{
				newLeafNode(otherlv_5, grammarAccess.getKinematicsAccess().getJointsKeyword_5_0());
			}
			otherlv_6='{'
			{
				newLeafNode(otherlv_6, grammarAccess.getKinematicsAccess().getLeftCurlyBracketKeyword_5_1());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getKinematicsAccess().getJointsJointParserRuleCall_5_2_0());
					}
					lv_joints_7_0=rulejoint
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getKinematicsRule());
						}
						add(
							$current,
							"joints",
							lv_joints_7_0,
							"de.fraunhofer.ipa.kinematics.xtext.Kinematics.joint");
						afterParserOrEnumRuleCall();
					}
				)
			)*
			otherlv_8='}'
			{
				newLeafNode(otherlv_8, grammarAccess.getKinematicsAccess().getRightCurlyBracketKeyword_5_3());
			}
		)?
		otherlv_9='}'
		{
			newLeafNode(otherlv_9, grammarAccess.getKinematicsAccess().getRightCurlyBracketKeyword_6());
		}
	)
;

// Entry rule entryRulejoint
entryRulejoint returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getJointRule()); }
	iv_rulejoint=rulejoint
	{ $current=$iv_rulejoint.current; }
	EOF;

// Rule joint
rulejoint returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='joint'
		{
			newLeafNode(otherlv_0, grammarAccess.getJointAccess().getJointKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getJointAccess().getNameEStringParserRuleCall_1_0());
				}
				lv_name_1_0=ruleEString
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getJointRule());
					}
					set(
						$current,
						"name",
						lv_name_1_0,
						"de.fraunhofer.ipa.kinematics.xtext.Kinematics.EString");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_2='{'
		{
			newLeafNode(otherlv_2, grammarAccess.getJointAccess().getLeftCurlyBracketKeyword_2());
		}
		otherlv_3='parent'
		{
			newLeafNode(otherlv_3, grammarAccess.getJointAccess().getParentKeyword_3());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getJointRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getJointAccess().getParentLinkCrossReference_4_0());
				}
				ruleEString
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_5='child'
		{
			newLeafNode(otherlv_5, grammarAccess.getJointAccess().getChildKeyword_5());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getJointAccess().getChildLinkParserRuleCall_6_0());
				}
				lv_child_6_0=rulelink
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getJointRule());
					}
					set(
						$current,
						"child",
						lv_child_6_0,
						"de.fraunhofer.ipa.kinematics.xtext.Kinematics.link");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_7='}'
		{
			newLeafNode(otherlv_7, grammarAccess.getJointAccess().getRightCurlyBracketKeyword_7());
		}
	)
;

// Entry rule entryRulelink
entryRulelink returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getLinkRule()); }
	iv_rulelink=rulelink
	{ $current=$iv_rulelink.current; }
	EOF;

// Rule link
rulelink returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getLinkAccess().getLinkAction_0(),
					$current);
			}
		)
		otherlv_1='link'
		{
			newLeafNode(otherlv_1, grammarAccess.getLinkAccess().getLinkKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getLinkAccess().getNameEStringParserRuleCall_2_0());
				}
				lv_name_2_0=ruleEString
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getLinkRule());
					}
					set(
						$current,
						"name",
						lv_name_2_0,
						"de.fraunhofer.ipa.kinematics.xtext.Kinematics.EString");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleEString
entryRuleEString returns [String current=null]:
	{ newCompositeNode(grammarAccess.getEStringRule()); }
	iv_ruleEString=ruleEString
	{ $current=$iv_ruleEString.current.getText(); }
	EOF;

// Rule EString
ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		this_STRING_0=RULE_STRING
		{
			$current.merge(this_STRING_0);
		}
		{
			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
		}
		    |
		this_ID_1=RULE_ID
		{
			$current.merge(this_ID_1);
		}
		{
			newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1());
		}
	)
;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
