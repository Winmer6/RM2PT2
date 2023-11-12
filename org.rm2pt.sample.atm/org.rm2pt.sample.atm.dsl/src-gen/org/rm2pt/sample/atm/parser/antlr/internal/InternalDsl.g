/*
 * generated by Xtext 2.25.0
 */
grammar InternalDsl;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package org.rm2pt.sample.atm.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package org.rm2pt.sample.atm.parser.antlr.internal;

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
import org.rm2pt.sample.atm.services.DslGrammarAccess;

}

@parser::members {

 	private DslGrammarAccess grammarAccess;

    public InternalDslParser(TokenStream input, DslGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }

    @Override
    protected String getFirstRuleName() {
    	return "ATM";
   	}

   	@Override
   	protected DslGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleATM
entryRuleATM returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getATMRule()); }
	iv_ruleATM=ruleATM
	{ $current=$iv_ruleATM.current; }
	EOF;

// Rule ATM
ruleATM returns [EObject current=null]
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
					grammarAccess.getATMAccess().getATMAction_0(),
					$current);
			}
		)
		otherlv_1='ATM'
		{
			newLeafNode(otherlv_1, grammarAccess.getATMAccess().getATMKeyword_1());
		}
		otherlv_2='{'
		{
			newLeafNode(otherlv_2, grammarAccess.getATMAccess().getLeftCurlyBracketKeyword_2());
		}
		(
			otherlv_3='atmID'
			{
				newLeafNode(otherlv_3, grammarAccess.getATMAccess().getAtmIDKeyword_3_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getATMAccess().getAtmIDEStringParserRuleCall_3_1_0());
					}
					lv_atmID_4_0=ruleEString
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getATMRule());
						}
						set(
							$current,
							"atmID",
							lv_atmID_4_0,
							"org.rm2pt.sample.atm.Dsl.EString");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
		(
			otherlv_5='address'
			{
				newLeafNode(otherlv_5, grammarAccess.getATMAccess().getAddressKeyword_4_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getATMAccess().getAddressEStringParserRuleCall_4_1_0());
					}
					lv_address_6_0=ruleEString
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getATMRule());
						}
						set(
							$current,
							"address",
							lv_address_6_0,
							"org.rm2pt.sample.atm.Dsl.EString");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
		otherlv_7='}'
		{
			newLeafNode(otherlv_7, grammarAccess.getATMAccess().getRightCurlyBracketKeyword_5());
		}
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

// Rule CardCatalog
ruleCardCatalog returns [Enumerator current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			enumLiteral_0='CREDIT'
			{
				$current = grammarAccess.getCardCatalogAccess().getCREDITEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_0, grammarAccess.getCardCatalogAccess().getCREDITEnumLiteralDeclaration_0());
			}
		)
		    |
		(
			enumLiteral_1='DEBIT'
			{
				$current = grammarAccess.getCardCatalogAccess().getDEBITEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_1, grammarAccess.getCardCatalogAccess().getDEBITEnumLiteralDeclaration_1());
			}
		)
	)
;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
