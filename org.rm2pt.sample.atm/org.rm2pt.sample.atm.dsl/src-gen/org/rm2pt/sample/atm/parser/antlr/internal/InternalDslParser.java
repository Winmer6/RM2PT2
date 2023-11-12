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



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'ATM'", "'{'", "'atmID'", "'address'", "'}'", "'CREDIT'", "'DEBIT'"
    };
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_STRING=4;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int RULE_INT=6;
    public static final int T__11=11;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;

    // delegates
    // delegators


        public InternalDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalDsl.g"; }



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




    // $ANTLR start "entryRuleATM"
    // InternalDsl.g:65:1: entryRuleATM returns [EObject current=null] : iv_ruleATM= ruleATM EOF ;
    public final EObject entryRuleATM() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleATM = null;


        try {
            // InternalDsl.g:65:44: (iv_ruleATM= ruleATM EOF )
            // InternalDsl.g:66:2: iv_ruleATM= ruleATM EOF
            {
             newCompositeNode(grammarAccess.getATMRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleATM=ruleATM();

            state._fsp--;

             current =iv_ruleATM; 
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
    // $ANTLR end "entryRuleATM"


    // $ANTLR start "ruleATM"
    // InternalDsl.g:72:1: ruleATM returns [EObject current=null] : ( () otherlv_1= 'ATM' otherlv_2= '{' (otherlv_3= 'atmID' ( (lv_atmID_4_0= ruleEString ) ) )? (otherlv_5= 'address' ( (lv_address_6_0= ruleEString ) ) )? otherlv_7= '}' ) ;
    public final EObject ruleATM() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_atmID_4_0 = null;

        AntlrDatatypeRuleToken lv_address_6_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:78:2: ( ( () otherlv_1= 'ATM' otherlv_2= '{' (otherlv_3= 'atmID' ( (lv_atmID_4_0= ruleEString ) ) )? (otherlv_5= 'address' ( (lv_address_6_0= ruleEString ) ) )? otherlv_7= '}' ) )
            // InternalDsl.g:79:2: ( () otherlv_1= 'ATM' otherlv_2= '{' (otherlv_3= 'atmID' ( (lv_atmID_4_0= ruleEString ) ) )? (otherlv_5= 'address' ( (lv_address_6_0= ruleEString ) ) )? otherlv_7= '}' )
            {
            // InternalDsl.g:79:2: ( () otherlv_1= 'ATM' otherlv_2= '{' (otherlv_3= 'atmID' ( (lv_atmID_4_0= ruleEString ) ) )? (otherlv_5= 'address' ( (lv_address_6_0= ruleEString ) ) )? otherlv_7= '}' )
            // InternalDsl.g:80:3: () otherlv_1= 'ATM' otherlv_2= '{' (otherlv_3= 'atmID' ( (lv_atmID_4_0= ruleEString ) ) )? (otherlv_5= 'address' ( (lv_address_6_0= ruleEString ) ) )? otherlv_7= '}'
            {
            // InternalDsl.g:80:3: ()
            // InternalDsl.g:81:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getATMAccess().getATMAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getATMAccess().getATMKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getATMAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalDsl.g:95:3: (otherlv_3= 'atmID' ( (lv_atmID_4_0= ruleEString ) ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==13) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalDsl.g:96:4: otherlv_3= 'atmID' ( (lv_atmID_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,13,FOLLOW_5); 

                    				newLeafNode(otherlv_3, grammarAccess.getATMAccess().getAtmIDKeyword_3_0());
                    			
                    // InternalDsl.g:100:4: ( (lv_atmID_4_0= ruleEString ) )
                    // InternalDsl.g:101:5: (lv_atmID_4_0= ruleEString )
                    {
                    // InternalDsl.g:101:5: (lv_atmID_4_0= ruleEString )
                    // InternalDsl.g:102:6: lv_atmID_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getATMAccess().getAtmIDEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_atmID_4_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getATMRule());
                    						}
                    						set(
                    							current,
                    							"atmID",
                    							lv_atmID_4_0,
                    							"org.rm2pt.sample.atm.Dsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalDsl.g:120:3: (otherlv_5= 'address' ( (lv_address_6_0= ruleEString ) ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==14) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalDsl.g:121:4: otherlv_5= 'address' ( (lv_address_6_0= ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,14,FOLLOW_5); 

                    				newLeafNode(otherlv_5, grammarAccess.getATMAccess().getAddressKeyword_4_0());
                    			
                    // InternalDsl.g:125:4: ( (lv_address_6_0= ruleEString ) )
                    // InternalDsl.g:126:5: (lv_address_6_0= ruleEString )
                    {
                    // InternalDsl.g:126:5: (lv_address_6_0= ruleEString )
                    // InternalDsl.g:127:6: lv_address_6_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getATMAccess().getAddressEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_address_6_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getATMRule());
                    						}
                    						set(
                    							current,
                    							"address",
                    							lv_address_6_0,
                    							"org.rm2pt.sample.atm.Dsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getATMAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleATM"


    // $ANTLR start "entryRuleEString"
    // InternalDsl.g:153:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalDsl.g:153:47: (iv_ruleEString= ruleEString EOF )
            // InternalDsl.g:154:2: iv_ruleEString= ruleEString EOF
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
    // InternalDsl.g:160:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalDsl.g:166:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalDsl.g:167:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalDsl.g:167:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_STRING) ) {
                alt3=1;
            }
            else if ( (LA3_0==RULE_ID) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalDsl.g:168:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalDsl.g:176:3: this_ID_1= RULE_ID
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


    // $ANTLR start "ruleCardCatalog"
    // InternalDsl.g:187:1: ruleCardCatalog returns [Enumerator current=null] : ( (enumLiteral_0= 'CREDIT' ) | (enumLiteral_1= 'DEBIT' ) ) ;
    public final Enumerator ruleCardCatalog() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalDsl.g:193:2: ( ( (enumLiteral_0= 'CREDIT' ) | (enumLiteral_1= 'DEBIT' ) ) )
            // InternalDsl.g:194:2: ( (enumLiteral_0= 'CREDIT' ) | (enumLiteral_1= 'DEBIT' ) )
            {
            // InternalDsl.g:194:2: ( (enumLiteral_0= 'CREDIT' ) | (enumLiteral_1= 'DEBIT' ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==16) ) {
                alt4=1;
            }
            else if ( (LA4_0==17) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalDsl.g:195:3: (enumLiteral_0= 'CREDIT' )
                    {
                    // InternalDsl.g:195:3: (enumLiteral_0= 'CREDIT' )
                    // InternalDsl.g:196:4: enumLiteral_0= 'CREDIT'
                    {
                    enumLiteral_0=(Token)match(input,16,FOLLOW_2); 

                    				current = grammarAccess.getCardCatalogAccess().getCREDITEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getCardCatalogAccess().getCREDITEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalDsl.g:203:3: (enumLiteral_1= 'DEBIT' )
                    {
                    // InternalDsl.g:203:3: (enumLiteral_1= 'DEBIT' )
                    // InternalDsl.g:204:4: enumLiteral_1= 'DEBIT'
                    {
                    enumLiteral_1=(Token)match(input,17,FOLLOW_2); 

                    				current = grammarAccess.getCardCatalogAccess().getDEBITEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getCardCatalogAccess().getDEBITEnumLiteralDeclaration_1());
                    			

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
    // $ANTLR end "ruleCardCatalog"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x000000000000E000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008000L});

}