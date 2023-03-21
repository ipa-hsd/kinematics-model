/*
 * generated by Xtext 2.26.0
 */
package de.fraunhofer.ipa.kinematics.serializer;

import com.google.inject.Inject;
import de.fraunhofer.ipa.kinematics.services.KinematicsGrammarAccess;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.GroupAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;

@SuppressWarnings("all")
public class KinematicsSyntacticSequencer extends AbstractSyntacticSequencer {

	protected KinematicsGrammarAccess grammarAccess;
	protected AbstractElementAlias match_Body_JointsKeyword_2_0_q;
	protected AbstractElementAlias match_Body_LinksKeyword_1_0_q;
	protected AbstractElementAlias match_Link___ColonKeyword_2_0_BEGINTerminalRuleCall_2_1_ENDTerminalRuleCall_2_5__q;
	protected AbstractElementAlias match_Macro_ParametersKeyword_4_0_q;
	protected AbstractElementAlias match_Robot_MacroCallsKeyword_7_0_q;
	protected AbstractElementAlias match_Robot_MacrosKeyword_6_0_q;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (KinematicsGrammarAccess) access;
		match_Body_JointsKeyword_2_0_q = new TokenAlias(false, true, grammarAccess.getBodyAccess().getJointsKeyword_2_0());
		match_Body_LinksKeyword_1_0_q = new TokenAlias(false, true, grammarAccess.getBodyAccess().getLinksKeyword_1_0());
		match_Link___ColonKeyword_2_0_BEGINTerminalRuleCall_2_1_ENDTerminalRuleCall_2_5__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getLinkAccess().getColonKeyword_2_0()), new TokenAlias(false, false, grammarAccess.getLinkAccess().getBEGINTerminalRuleCall_2_1()), new TokenAlias(false, false, grammarAccess.getLinkAccess().getENDTerminalRuleCall_2_5()));
		match_Macro_ParametersKeyword_4_0_q = new TokenAlias(false, true, grammarAccess.getMacroAccess().getParametersKeyword_4_0());
		match_Robot_MacroCallsKeyword_7_0_q = new TokenAlias(false, true, grammarAccess.getRobotAccess().getMacroCallsKeyword_7_0());
		match_Robot_MacrosKeyword_6_0_q = new TokenAlias(false, true, grammarAccess.getRobotAccess().getMacrosKeyword_6_0());
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (ruleCall.getRule() == grammarAccess.getBEGINRule())
			return getBEGINToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getENDRule())
			return getENDToken(semanticObject, ruleCall, node);
		return "";
	}
	
	/**
	 * Synthetic terminal rule. The concrete syntax is to be specified by clients.
	 * Defaults to the empty string.
	 */
	protected String getBEGINToken(EObject semanticObject, RuleCall ruleCall, INode node) { return ""; }
	
	/**
	 * Synthetic terminal rule. The concrete syntax is to be specified by clients.
	 * Defaults to the empty string.
	 */
	protected String getENDToken(EObject semanticObject, RuleCall ruleCall, INode node) { return ""; }
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if (match_Body_JointsKeyword_2_0_q.equals(syntax))
				emit_Body_JointsKeyword_2_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Body_LinksKeyword_1_0_q.equals(syntax))
				emit_Body_LinksKeyword_1_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Link___ColonKeyword_2_0_BEGINTerminalRuleCall_2_1_ENDTerminalRuleCall_2_5__q.equals(syntax))
				emit_Link___ColonKeyword_2_0_BEGINTerminalRuleCall_2_1_ENDTerminalRuleCall_2_5__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Macro_ParametersKeyword_4_0_q.equals(syntax))
				emit_Macro_ParametersKeyword_4_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Robot_MacroCallsKeyword_7_0_q.equals(syntax))
				emit_Robot_MacroCallsKeyword_7_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Robot_MacrosKeyword_6_0_q.equals(syntax))
				emit_Robot_MacrosKeyword_6_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * <pre>
	 * Ambiguous syntax:
	 *     'joints:'?
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) 'links:'? (ambiguity) (rule start)
	 *     link+=Link (ambiguity) (rule end)
	 
	 * </pre>
	 */
	protected void emit_Body_JointsKeyword_2_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * <pre>
	 * Ambiguous syntax:
	 *     'links:'?
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) 'joints:' joint+=Joint
	 *     (rule start) (ambiguity) 'joints:'? (rule start)
	 
	 * </pre>
	 */
	protected void emit_Body_LinksKeyword_1_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * <pre>
	 * Ambiguous syntax:
	 *     (':' BEGIN END)?
	 *
	 * This ambiguous syntax occurs at:
	 *     name=ParameterString (ambiguity) (rule end)
	 
	 * </pre>
	 */
	protected void emit_Link___ColonKeyword_2_0_BEGINTerminalRuleCall_2_1_ENDTerminalRuleCall_2_5__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * <pre>
	 * Ambiguous syntax:
	 *     'parameters:'?
	 *
	 * This ambiguous syntax occurs at:
	 *     name=ID ':' BEGIN (ambiguity) 'body:' BEGIN body=Body
	 *     name=ID ':' BEGIN (ambiguity) END (rule end)
	 
	 * </pre>
	 */
	protected void emit_Macro_ParametersKeyword_4_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * <pre>
	 * Ambiguous syntax:
	 *     'macroCalls:'?
	 *
	 * This ambiguous syntax occurs at:
	 *     macro+=Macro (ambiguity) 'body:' BEGIN body=Body
	 *     macro+=Macro (ambiguity) END (rule end)
	 *     name=ID 'macros:'? (ambiguity) 'body:' BEGIN body=Body
	 *     name=ID 'macros:'? (ambiguity) END (rule end)
	 *     version=STRING 'macros:'? (ambiguity) 'body:' BEGIN body=Body
	 *     version=STRING 'macros:'? (ambiguity) END (rule end)
	 
	 * </pre>
	 */
	protected void emit_Robot_MacroCallsKeyword_7_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * <pre>
	 * Ambiguous syntax:
	 *     'macros:'?
	 *
	 * This ambiguous syntax occurs at:
	 *     name=ID (ambiguity) 'macroCalls:' macroCall+=MacroCall
	 *     name=ID (ambiguity) 'macroCalls:'? 'body:' BEGIN body=Body
	 *     name=ID (ambiguity) 'macroCalls:'? END (rule end)
	 *     version=STRING (ambiguity) 'macroCalls:' macroCall+=MacroCall
	 *     version=STRING (ambiguity) 'macroCalls:'? 'body:' BEGIN body=Body
	 *     version=STRING (ambiguity) 'macroCalls:'? END (rule end)
	 
	 * </pre>
	 */
	protected void emit_Robot_MacrosKeyword_6_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
