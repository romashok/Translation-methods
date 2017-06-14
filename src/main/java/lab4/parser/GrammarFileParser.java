// Generated from GrammarFile.g4 by ANTLR 4.5.3

package lab4.parser;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GrammarFileParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, GrammarName=5, LexerToken=6, STRING=7, 
		WS=8;
	public static final int
		RULE_grammarFileContent = 0, RULE_line = 1, RULE_grammarRule = 2, RULE_lexerRule = 3, 
		RULE_productions = 4, RULE_production = 5, RULE_term = 6, RULE_grammarRuleName = 7, 
		RULE_lexerToken = 8;
	public static final String[] ruleNames = {
		"grammarFileContent", "line", "grammarRule", "lexerRule", "productions", 
		"production", "term", "grammarRuleName", "lexerToken"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'grammar'", "';'", "':'", "'|'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, "GrammarName", "LexerToken", "STRING", "WS"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "GrammarFile.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public GrammarFileParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class GrammarFileContentContext extends ParserRuleContext {
		public Token name;
		public TerminalNode EOF() { return getToken(GrammarFileParser.EOF, 0); }
		public TerminalNode LexerToken() { return getToken(GrammarFileParser.LexerToken, 0); }
		public List<LineContext> line() {
			return getRuleContexts(LineContext.class);
		}
		public LineContext line(int i) {
			return getRuleContext(LineContext.class,i);
		}
		public GrammarFileContentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_grammarFileContent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarFileListener ) ((GrammarFileListener)listener).enterGrammarFileContent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarFileListener ) ((GrammarFileListener)listener).exitGrammarFileContent(this);
		}
	}

	public final GrammarFileContentContext grammarFileContent() throws RecognitionException {
		GrammarFileContentContext _localctx = new GrammarFileContentContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_grammarFileContent);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(18);
			match(T__0);
			setState(19);
			((GrammarFileContentContext)_localctx).name = match(LexerToken);
			setState(20);
			match(T__1);
			setState(22); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(21);
				line();
				}
				}
				setState(24); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==GrammarName || _la==LexerToken );
			setState(26);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LineContext extends ParserRuleContext {
		public GrammarRuleContext grammarRule() {
			return getRuleContext(GrammarRuleContext.class,0);
		}
		public LexerRuleContext lexerRule() {
			return getRuleContext(LexerRuleContext.class,0);
		}
		public LineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_line; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarFileListener ) ((GrammarFileListener)listener).enterLine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarFileListener ) ((GrammarFileListener)listener).exitLine(this);
		}
	}

	public final LineContext line() throws RecognitionException {
		LineContext _localctx = new LineContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_line);
		try {
			setState(34);
			switch (_input.LA(1)) {
			case GrammarName:
				enterOuterAlt(_localctx, 1);
				{
				setState(28);
				grammarRule();
				setState(29);
				match(T__1);
				}
				break;
			case LexerToken:
				enterOuterAlt(_localctx, 2);
				{
				setState(31);
				lexerRule();
				setState(32);
				match(T__1);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GrammarRuleContext extends ParserRuleContext {
		public GrammarRuleNameContext grammarRuleName() {
			return getRuleContext(GrammarRuleNameContext.class,0);
		}
		public ProductionsContext productions() {
			return getRuleContext(ProductionsContext.class,0);
		}
		public GrammarRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_grammarRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarFileListener ) ((GrammarFileListener)listener).enterGrammarRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarFileListener ) ((GrammarFileListener)listener).exitGrammarRule(this);
		}
	}

	public final GrammarRuleContext grammarRule() throws RecognitionException {
		GrammarRuleContext _localctx = new GrammarRuleContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_grammarRule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(36);
			grammarRuleName();
			setState(37);
			match(T__2);
			setState(38);
			productions();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LexerRuleContext extends ParserRuleContext {
		public LexerTokenContext lexerToken() {
			return getRuleContext(LexerTokenContext.class,0);
		}
		public ProductionsContext productions() {
			return getRuleContext(ProductionsContext.class,0);
		}
		public LexerRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lexerRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarFileListener ) ((GrammarFileListener)listener).enterLexerRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarFileListener ) ((GrammarFileListener)listener).exitLexerRule(this);
		}
	}

	public final LexerRuleContext lexerRule() throws RecognitionException {
		LexerRuleContext _localctx = new LexerRuleContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_lexerRule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(40);
			lexerToken();
			setState(41);
			match(T__2);
			setState(42);
			productions();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ProductionsContext extends ParserRuleContext {
		public List<ProductionContext> production() {
			return getRuleContexts(ProductionContext.class);
		}
		public ProductionContext production(int i) {
			return getRuleContext(ProductionContext.class,i);
		}
		public ProductionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_productions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarFileListener ) ((GrammarFileListener)listener).enterProductions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarFileListener ) ((GrammarFileListener)listener).exitProductions(this);
		}
	}

	public final ProductionsContext productions() throws RecognitionException {
		ProductionsContext _localctx = new ProductionsContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_productions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(44);
			production();
			setState(49);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(45);
				match(T__3);
				setState(46);
				production();
				}
				}
				setState(51);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ProductionContext extends ParserRuleContext {
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public ProductionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_production; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarFileListener ) ((GrammarFileListener)listener).enterProduction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarFileListener ) ((GrammarFileListener)listener).exitProduction(this);
		}
	}

	public final ProductionContext production() throws RecognitionException {
		ProductionContext _localctx = new ProductionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_production);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(55);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GrammarName) | (1L << LexerToken) | (1L << STRING))) != 0)) {
				{
				{
				setState(52);
				term();
				}
				}
				setState(57);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TermContext extends ParserRuleContext {
		public GrammarRuleNameContext grammarRuleName() {
			return getRuleContext(GrammarRuleNameContext.class,0);
		}
		public LexerTokenContext lexerToken() {
			return getRuleContext(LexerTokenContext.class,0);
		}
		public TerminalNode STRING() { return getToken(GrammarFileParser.STRING, 0); }
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarFileListener ) ((GrammarFileListener)listener).enterTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarFileListener ) ((GrammarFileListener)listener).exitTerm(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_term);
		try {
			setState(61);
			switch (_input.LA(1)) {
			case GrammarName:
				enterOuterAlt(_localctx, 1);
				{
				setState(58);
				grammarRuleName();
				}
				break;
			case LexerToken:
				enterOuterAlt(_localctx, 2);
				{
				setState(59);
				lexerToken();
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 3);
				{
				setState(60);
				match(STRING);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GrammarRuleNameContext extends ParserRuleContext {
		public TerminalNode GrammarName() { return getToken(GrammarFileParser.GrammarName, 0); }
		public GrammarRuleNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_grammarRuleName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarFileListener ) ((GrammarFileListener)listener).enterGrammarRuleName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarFileListener ) ((GrammarFileListener)listener).exitGrammarRuleName(this);
		}
	}

	public final GrammarRuleNameContext grammarRuleName() throws RecognitionException {
		GrammarRuleNameContext _localctx = new GrammarRuleNameContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_grammarRuleName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(63);
			match(GrammarName);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LexerTokenContext extends ParserRuleContext {
		public TerminalNode LexerToken() { return getToken(GrammarFileParser.LexerToken, 0); }
		public LexerTokenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lexerToken; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarFileListener ) ((GrammarFileListener)listener).enterLexerToken(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarFileListener ) ((GrammarFileListener)listener).exitLexerToken(this);
		}
	}

	public final LexerTokenContext lexerToken() throws RecognitionException {
		LexerTokenContext _localctx = new LexerTokenContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_lexerToken);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(65);
			match(LexerToken);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\nF\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\3\2\3\2\3\2"+
		"\3\2\6\2\31\n\2\r\2\16\2\32\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\5\3%\n\3\3"+
		"\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\7\6\62\n\6\f\6\16\6\65\13\6"+
		"\3\7\7\78\n\7\f\7\16\7;\13\7\3\b\3\b\3\b\5\b@\n\b\3\t\3\t\3\n\3\n\3\n"+
		"\2\2\13\2\4\6\b\n\f\16\20\22\2\2B\2\24\3\2\2\2\4$\3\2\2\2\6&\3\2\2\2\b"+
		"*\3\2\2\2\n.\3\2\2\2\f9\3\2\2\2\16?\3\2\2\2\20A\3\2\2\2\22C\3\2\2\2\24"+
		"\25\7\3\2\2\25\26\7\b\2\2\26\30\7\4\2\2\27\31\5\4\3\2\30\27\3\2\2\2\31"+
		"\32\3\2\2\2\32\30\3\2\2\2\32\33\3\2\2\2\33\34\3\2\2\2\34\35\7\2\2\3\35"+
		"\3\3\2\2\2\36\37\5\6\4\2\37 \7\4\2\2 %\3\2\2\2!\"\5\b\5\2\"#\7\4\2\2#"+
		"%\3\2\2\2$\36\3\2\2\2$!\3\2\2\2%\5\3\2\2\2&\'\5\20\t\2\'(\7\5\2\2()\5"+
		"\n\6\2)\7\3\2\2\2*+\5\22\n\2+,\7\5\2\2,-\5\n\6\2-\t\3\2\2\2.\63\5\f\7"+
		"\2/\60\7\6\2\2\60\62\5\f\7\2\61/\3\2\2\2\62\65\3\2\2\2\63\61\3\2\2\2\63"+
		"\64\3\2\2\2\64\13\3\2\2\2\65\63\3\2\2\2\668\5\16\b\2\67\66\3\2\2\28;\3"+
		"\2\2\29\67\3\2\2\29:\3\2\2\2:\r\3\2\2\2;9\3\2\2\2<@\5\20\t\2=@\5\22\n"+
		"\2>@\7\t\2\2?<\3\2\2\2?=\3\2\2\2?>\3\2\2\2@\17\3\2\2\2AB\7\7\2\2B\21\3"+
		"\2\2\2CD\7\b\2\2D\23\3\2\2\2\7\32$\639?";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}