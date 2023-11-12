package org.rm2pt.sample.atm.ide.contentassist.antlr.internal;

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
import org.rm2pt.sample.atm.services.DslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'CREDIT'", "'DEBIT'", "'ATM'", "'{'", "'}'", "'atmID'", "'address'"
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

    	public void setGrammarAccess(DslGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleATM"
    // InternalDsl.g:53:1: entryRuleATM : ruleATM EOF ;
    public final void entryRuleATM() throws RecognitionException {
        try {
            // InternalDsl.g:54:1: ( ruleATM EOF )
            // InternalDsl.g:55:1: ruleATM EOF
            {
             before(grammarAccess.getATMRule()); 
            pushFollow(FOLLOW_1);
            ruleATM();

            state._fsp--;

             after(grammarAccess.getATMRule()); 
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
    // $ANTLR end "entryRuleATM"


    // $ANTLR start "ruleATM"
    // InternalDsl.g:62:1: ruleATM : ( ( rule__ATM__Group__0 ) ) ;
    public final void ruleATM() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:66:2: ( ( ( rule__ATM__Group__0 ) ) )
            // InternalDsl.g:67:2: ( ( rule__ATM__Group__0 ) )
            {
            // InternalDsl.g:67:2: ( ( rule__ATM__Group__0 ) )
            // InternalDsl.g:68:3: ( rule__ATM__Group__0 )
            {
             before(grammarAccess.getATMAccess().getGroup()); 
            // InternalDsl.g:69:3: ( rule__ATM__Group__0 )
            // InternalDsl.g:69:4: rule__ATM__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ATM__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getATMAccess().getGroup()); 

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
    // $ANTLR end "ruleATM"


    // $ANTLR start "entryRuleEString"
    // InternalDsl.g:78:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalDsl.g:79:1: ( ruleEString EOF )
            // InternalDsl.g:80:1: ruleEString EOF
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
    // InternalDsl.g:87:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:91:2: ( ( ( rule__EString__Alternatives ) ) )
            // InternalDsl.g:92:2: ( ( rule__EString__Alternatives ) )
            {
            // InternalDsl.g:92:2: ( ( rule__EString__Alternatives ) )
            // InternalDsl.g:93:3: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // InternalDsl.g:94:3: ( rule__EString__Alternatives )
            // InternalDsl.g:94:4: rule__EString__Alternatives
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


    // $ANTLR start "ruleCardCatalog"
    // InternalDsl.g:103:1: ruleCardCatalog : ( ( rule__CardCatalog__Alternatives ) ) ;
    public final void ruleCardCatalog() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:107:1: ( ( ( rule__CardCatalog__Alternatives ) ) )
            // InternalDsl.g:108:2: ( ( rule__CardCatalog__Alternatives ) )
            {
            // InternalDsl.g:108:2: ( ( rule__CardCatalog__Alternatives ) )
            // InternalDsl.g:109:3: ( rule__CardCatalog__Alternatives )
            {
             before(grammarAccess.getCardCatalogAccess().getAlternatives()); 
            // InternalDsl.g:110:3: ( rule__CardCatalog__Alternatives )
            // InternalDsl.g:110:4: rule__CardCatalog__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__CardCatalog__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getCardCatalogAccess().getAlternatives()); 

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
    // $ANTLR end "ruleCardCatalog"


    // $ANTLR start "rule__EString__Alternatives"
    // InternalDsl.g:118:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:122:1: ( ( RULE_STRING ) | ( RULE_ID ) )
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
                    // InternalDsl.g:123:2: ( RULE_STRING )
                    {
                    // InternalDsl.g:123:2: ( RULE_STRING )
                    // InternalDsl.g:124:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDsl.g:129:2: ( RULE_ID )
                    {
                    // InternalDsl.g:129:2: ( RULE_ID )
                    // InternalDsl.g:130:3: RULE_ID
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


    // $ANTLR start "rule__CardCatalog__Alternatives"
    // InternalDsl.g:139:1: rule__CardCatalog__Alternatives : ( ( ( 'CREDIT' ) ) | ( ( 'DEBIT' ) ) );
    public final void rule__CardCatalog__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:143:1: ( ( ( 'CREDIT' ) ) | ( ( 'DEBIT' ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==11) ) {
                alt2=1;
            }
            else if ( (LA2_0==12) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalDsl.g:144:2: ( ( 'CREDIT' ) )
                    {
                    // InternalDsl.g:144:2: ( ( 'CREDIT' ) )
                    // InternalDsl.g:145:3: ( 'CREDIT' )
                    {
                     before(grammarAccess.getCardCatalogAccess().getCREDITEnumLiteralDeclaration_0()); 
                    // InternalDsl.g:146:3: ( 'CREDIT' )
                    // InternalDsl.g:146:4: 'CREDIT'
                    {
                    match(input,11,FOLLOW_2); 

                    }

                     after(grammarAccess.getCardCatalogAccess().getCREDITEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDsl.g:150:2: ( ( 'DEBIT' ) )
                    {
                    // InternalDsl.g:150:2: ( ( 'DEBIT' ) )
                    // InternalDsl.g:151:3: ( 'DEBIT' )
                    {
                     before(grammarAccess.getCardCatalogAccess().getDEBITEnumLiteralDeclaration_1()); 
                    // InternalDsl.g:152:3: ( 'DEBIT' )
                    // InternalDsl.g:152:4: 'DEBIT'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getCardCatalogAccess().getDEBITEnumLiteralDeclaration_1()); 

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
    // $ANTLR end "rule__CardCatalog__Alternatives"


    // $ANTLR start "rule__ATM__Group__0"
    // InternalDsl.g:160:1: rule__ATM__Group__0 : rule__ATM__Group__0__Impl rule__ATM__Group__1 ;
    public final void rule__ATM__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:164:1: ( rule__ATM__Group__0__Impl rule__ATM__Group__1 )
            // InternalDsl.g:165:2: rule__ATM__Group__0__Impl rule__ATM__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__ATM__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ATM__Group__1();

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
    // $ANTLR end "rule__ATM__Group__0"


    // $ANTLR start "rule__ATM__Group__0__Impl"
    // InternalDsl.g:172:1: rule__ATM__Group__0__Impl : ( () ) ;
    public final void rule__ATM__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:176:1: ( ( () ) )
            // InternalDsl.g:177:1: ( () )
            {
            // InternalDsl.g:177:1: ( () )
            // InternalDsl.g:178:2: ()
            {
             before(grammarAccess.getATMAccess().getATMAction_0()); 
            // InternalDsl.g:179:2: ()
            // InternalDsl.g:179:3: 
            {
            }

             after(grammarAccess.getATMAccess().getATMAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ATM__Group__0__Impl"


    // $ANTLR start "rule__ATM__Group__1"
    // InternalDsl.g:187:1: rule__ATM__Group__1 : rule__ATM__Group__1__Impl rule__ATM__Group__2 ;
    public final void rule__ATM__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:191:1: ( rule__ATM__Group__1__Impl rule__ATM__Group__2 )
            // InternalDsl.g:192:2: rule__ATM__Group__1__Impl rule__ATM__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__ATM__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ATM__Group__2();

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
    // $ANTLR end "rule__ATM__Group__1"


    // $ANTLR start "rule__ATM__Group__1__Impl"
    // InternalDsl.g:199:1: rule__ATM__Group__1__Impl : ( 'ATM' ) ;
    public final void rule__ATM__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:203:1: ( ( 'ATM' ) )
            // InternalDsl.g:204:1: ( 'ATM' )
            {
            // InternalDsl.g:204:1: ( 'ATM' )
            // InternalDsl.g:205:2: 'ATM'
            {
             before(grammarAccess.getATMAccess().getATMKeyword_1()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getATMAccess().getATMKeyword_1()); 

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
    // $ANTLR end "rule__ATM__Group__1__Impl"


    // $ANTLR start "rule__ATM__Group__2"
    // InternalDsl.g:214:1: rule__ATM__Group__2 : rule__ATM__Group__2__Impl rule__ATM__Group__3 ;
    public final void rule__ATM__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:218:1: ( rule__ATM__Group__2__Impl rule__ATM__Group__3 )
            // InternalDsl.g:219:2: rule__ATM__Group__2__Impl rule__ATM__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__ATM__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ATM__Group__3();

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
    // $ANTLR end "rule__ATM__Group__2"


    // $ANTLR start "rule__ATM__Group__2__Impl"
    // InternalDsl.g:226:1: rule__ATM__Group__2__Impl : ( '{' ) ;
    public final void rule__ATM__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:230:1: ( ( '{' ) )
            // InternalDsl.g:231:1: ( '{' )
            {
            // InternalDsl.g:231:1: ( '{' )
            // InternalDsl.g:232:2: '{'
            {
             before(grammarAccess.getATMAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getATMAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__ATM__Group__2__Impl"


    // $ANTLR start "rule__ATM__Group__3"
    // InternalDsl.g:241:1: rule__ATM__Group__3 : rule__ATM__Group__3__Impl rule__ATM__Group__4 ;
    public final void rule__ATM__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:245:1: ( rule__ATM__Group__3__Impl rule__ATM__Group__4 )
            // InternalDsl.g:246:2: rule__ATM__Group__3__Impl rule__ATM__Group__4
            {
            pushFollow(FOLLOW_5);
            rule__ATM__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ATM__Group__4();

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
    // $ANTLR end "rule__ATM__Group__3"


    // $ANTLR start "rule__ATM__Group__3__Impl"
    // InternalDsl.g:253:1: rule__ATM__Group__3__Impl : ( ( rule__ATM__Group_3__0 )? ) ;
    public final void rule__ATM__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:257:1: ( ( ( rule__ATM__Group_3__0 )? ) )
            // InternalDsl.g:258:1: ( ( rule__ATM__Group_3__0 )? )
            {
            // InternalDsl.g:258:1: ( ( rule__ATM__Group_3__0 )? )
            // InternalDsl.g:259:2: ( rule__ATM__Group_3__0 )?
            {
             before(grammarAccess.getATMAccess().getGroup_3()); 
            // InternalDsl.g:260:2: ( rule__ATM__Group_3__0 )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==16) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalDsl.g:260:3: rule__ATM__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ATM__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getATMAccess().getGroup_3()); 

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
    // $ANTLR end "rule__ATM__Group__3__Impl"


    // $ANTLR start "rule__ATM__Group__4"
    // InternalDsl.g:268:1: rule__ATM__Group__4 : rule__ATM__Group__4__Impl rule__ATM__Group__5 ;
    public final void rule__ATM__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:272:1: ( rule__ATM__Group__4__Impl rule__ATM__Group__5 )
            // InternalDsl.g:273:2: rule__ATM__Group__4__Impl rule__ATM__Group__5
            {
            pushFollow(FOLLOW_5);
            rule__ATM__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ATM__Group__5();

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
    // $ANTLR end "rule__ATM__Group__4"


    // $ANTLR start "rule__ATM__Group__4__Impl"
    // InternalDsl.g:280:1: rule__ATM__Group__4__Impl : ( ( rule__ATM__Group_4__0 )? ) ;
    public final void rule__ATM__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:284:1: ( ( ( rule__ATM__Group_4__0 )? ) )
            // InternalDsl.g:285:1: ( ( rule__ATM__Group_4__0 )? )
            {
            // InternalDsl.g:285:1: ( ( rule__ATM__Group_4__0 )? )
            // InternalDsl.g:286:2: ( rule__ATM__Group_4__0 )?
            {
             before(grammarAccess.getATMAccess().getGroup_4()); 
            // InternalDsl.g:287:2: ( rule__ATM__Group_4__0 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==17) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalDsl.g:287:3: rule__ATM__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ATM__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getATMAccess().getGroup_4()); 

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
    // $ANTLR end "rule__ATM__Group__4__Impl"


    // $ANTLR start "rule__ATM__Group__5"
    // InternalDsl.g:295:1: rule__ATM__Group__5 : rule__ATM__Group__5__Impl ;
    public final void rule__ATM__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:299:1: ( rule__ATM__Group__5__Impl )
            // InternalDsl.g:300:2: rule__ATM__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ATM__Group__5__Impl();

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
    // $ANTLR end "rule__ATM__Group__5"


    // $ANTLR start "rule__ATM__Group__5__Impl"
    // InternalDsl.g:306:1: rule__ATM__Group__5__Impl : ( '}' ) ;
    public final void rule__ATM__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:310:1: ( ( '}' ) )
            // InternalDsl.g:311:1: ( '}' )
            {
            // InternalDsl.g:311:1: ( '}' )
            // InternalDsl.g:312:2: '}'
            {
             before(grammarAccess.getATMAccess().getRightCurlyBracketKeyword_5()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getATMAccess().getRightCurlyBracketKeyword_5()); 

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
    // $ANTLR end "rule__ATM__Group__5__Impl"


    // $ANTLR start "rule__ATM__Group_3__0"
    // InternalDsl.g:322:1: rule__ATM__Group_3__0 : rule__ATM__Group_3__0__Impl rule__ATM__Group_3__1 ;
    public final void rule__ATM__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:326:1: ( rule__ATM__Group_3__0__Impl rule__ATM__Group_3__1 )
            // InternalDsl.g:327:2: rule__ATM__Group_3__0__Impl rule__ATM__Group_3__1
            {
            pushFollow(FOLLOW_6);
            rule__ATM__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ATM__Group_3__1();

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
    // $ANTLR end "rule__ATM__Group_3__0"


    // $ANTLR start "rule__ATM__Group_3__0__Impl"
    // InternalDsl.g:334:1: rule__ATM__Group_3__0__Impl : ( 'atmID' ) ;
    public final void rule__ATM__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:338:1: ( ( 'atmID' ) )
            // InternalDsl.g:339:1: ( 'atmID' )
            {
            // InternalDsl.g:339:1: ( 'atmID' )
            // InternalDsl.g:340:2: 'atmID'
            {
             before(grammarAccess.getATMAccess().getAtmIDKeyword_3_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getATMAccess().getAtmIDKeyword_3_0()); 

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
    // $ANTLR end "rule__ATM__Group_3__0__Impl"


    // $ANTLR start "rule__ATM__Group_3__1"
    // InternalDsl.g:349:1: rule__ATM__Group_3__1 : rule__ATM__Group_3__1__Impl ;
    public final void rule__ATM__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:353:1: ( rule__ATM__Group_3__1__Impl )
            // InternalDsl.g:354:2: rule__ATM__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ATM__Group_3__1__Impl();

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
    // $ANTLR end "rule__ATM__Group_3__1"


    // $ANTLR start "rule__ATM__Group_3__1__Impl"
    // InternalDsl.g:360:1: rule__ATM__Group_3__1__Impl : ( ( rule__ATM__AtmIDAssignment_3_1 ) ) ;
    public final void rule__ATM__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:364:1: ( ( ( rule__ATM__AtmIDAssignment_3_1 ) ) )
            // InternalDsl.g:365:1: ( ( rule__ATM__AtmIDAssignment_3_1 ) )
            {
            // InternalDsl.g:365:1: ( ( rule__ATM__AtmIDAssignment_3_1 ) )
            // InternalDsl.g:366:2: ( rule__ATM__AtmIDAssignment_3_1 )
            {
             before(grammarAccess.getATMAccess().getAtmIDAssignment_3_1()); 
            // InternalDsl.g:367:2: ( rule__ATM__AtmIDAssignment_3_1 )
            // InternalDsl.g:367:3: rule__ATM__AtmIDAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__ATM__AtmIDAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getATMAccess().getAtmIDAssignment_3_1()); 

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
    // $ANTLR end "rule__ATM__Group_3__1__Impl"


    // $ANTLR start "rule__ATM__Group_4__0"
    // InternalDsl.g:376:1: rule__ATM__Group_4__0 : rule__ATM__Group_4__0__Impl rule__ATM__Group_4__1 ;
    public final void rule__ATM__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:380:1: ( rule__ATM__Group_4__0__Impl rule__ATM__Group_4__1 )
            // InternalDsl.g:381:2: rule__ATM__Group_4__0__Impl rule__ATM__Group_4__1
            {
            pushFollow(FOLLOW_6);
            rule__ATM__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ATM__Group_4__1();

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
    // $ANTLR end "rule__ATM__Group_4__0"


    // $ANTLR start "rule__ATM__Group_4__0__Impl"
    // InternalDsl.g:388:1: rule__ATM__Group_4__0__Impl : ( 'address' ) ;
    public final void rule__ATM__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:392:1: ( ( 'address' ) )
            // InternalDsl.g:393:1: ( 'address' )
            {
            // InternalDsl.g:393:1: ( 'address' )
            // InternalDsl.g:394:2: 'address'
            {
             before(grammarAccess.getATMAccess().getAddressKeyword_4_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getATMAccess().getAddressKeyword_4_0()); 

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
    // $ANTLR end "rule__ATM__Group_4__0__Impl"


    // $ANTLR start "rule__ATM__Group_4__1"
    // InternalDsl.g:403:1: rule__ATM__Group_4__1 : rule__ATM__Group_4__1__Impl ;
    public final void rule__ATM__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:407:1: ( rule__ATM__Group_4__1__Impl )
            // InternalDsl.g:408:2: rule__ATM__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ATM__Group_4__1__Impl();

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
    // $ANTLR end "rule__ATM__Group_4__1"


    // $ANTLR start "rule__ATM__Group_4__1__Impl"
    // InternalDsl.g:414:1: rule__ATM__Group_4__1__Impl : ( ( rule__ATM__AddressAssignment_4_1 ) ) ;
    public final void rule__ATM__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:418:1: ( ( ( rule__ATM__AddressAssignment_4_1 ) ) )
            // InternalDsl.g:419:1: ( ( rule__ATM__AddressAssignment_4_1 ) )
            {
            // InternalDsl.g:419:1: ( ( rule__ATM__AddressAssignment_4_1 ) )
            // InternalDsl.g:420:2: ( rule__ATM__AddressAssignment_4_1 )
            {
             before(grammarAccess.getATMAccess().getAddressAssignment_4_1()); 
            // InternalDsl.g:421:2: ( rule__ATM__AddressAssignment_4_1 )
            // InternalDsl.g:421:3: rule__ATM__AddressAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__ATM__AddressAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getATMAccess().getAddressAssignment_4_1()); 

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
    // $ANTLR end "rule__ATM__Group_4__1__Impl"


    // $ANTLR start "rule__ATM__AtmIDAssignment_3_1"
    // InternalDsl.g:430:1: rule__ATM__AtmIDAssignment_3_1 : ( ruleEString ) ;
    public final void rule__ATM__AtmIDAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:434:1: ( ( ruleEString ) )
            // InternalDsl.g:435:2: ( ruleEString )
            {
            // InternalDsl.g:435:2: ( ruleEString )
            // InternalDsl.g:436:3: ruleEString
            {
             before(grammarAccess.getATMAccess().getAtmIDEStringParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getATMAccess().getAtmIDEStringParserRuleCall_3_1_0()); 

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
    // $ANTLR end "rule__ATM__AtmIDAssignment_3_1"


    // $ANTLR start "rule__ATM__AddressAssignment_4_1"
    // InternalDsl.g:445:1: rule__ATM__AddressAssignment_4_1 : ( ruleEString ) ;
    public final void rule__ATM__AddressAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:449:1: ( ( ruleEString ) )
            // InternalDsl.g:450:2: ( ruleEString )
            {
            // InternalDsl.g:450:2: ( ruleEString )
            // InternalDsl.g:451:3: ruleEString
            {
             before(grammarAccess.getATMAccess().getAddressEStringParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getATMAccess().getAddressEStringParserRuleCall_4_1_0()); 

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
    // $ANTLR end "rule__ATM__AddressAssignment_4_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000038000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000030L});

}