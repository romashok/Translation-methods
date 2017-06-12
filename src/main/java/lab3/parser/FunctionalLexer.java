// Generated from Functional.g4 by ANTLR 4.5.3

package lab3;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class FunctionalLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, BOOL=8, NUM=9, 
		BINOP=10, ARIFM=11, LOGIC=12, ID=13, NEWLINE=14, WS=15;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "BOOL", "NUM", 
		"BINOP", "ARIFM", "LOGIC", "ID", "NEWLINE", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'='", "'|'", "'('", "')'", "'if'", "'then'", "'else'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, "BOOL", "NUM", "BINOP", 
		"ARIFM", "LOGIC", "ID", "NEWLINE", "WS"
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


	public FunctionalLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Functional.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\21\177\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\3\2\3\2\3\3\3\3\3"+
		"\4\3\4\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t@\n\t\3\n\6\nC\n\n\r\n\16\nD\3\n\3"+
		"\n\6\nI\n\n\r\n\16\nJ\5\nM\n\n\3\13\3\13\5\13Q\n\13\3\f\3\f\3\f\3\f\5"+
		"\fW\n\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\rg\n"+
		"\r\3\16\6\16j\n\16\r\16\16\16k\3\16\7\16o\n\16\f\16\16\16r\13\16\3\17"+
		"\6\17u\n\17\r\17\16\17v\3\20\6\20z\n\20\r\20\16\20{\3\20\3\20\2\2\21\3"+
		"\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37"+
		"\21\3\2\7\3\2\62;\6\2\'\',-//\61\61\4\2C\\c|\5\2\62;C\\c|\5\2\13\13\17"+
		"\17\"\"\u008f\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2"+
		"\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2"+
		"\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\3!\3\2"+
		"\2\2\5#\3\2\2\2\7%\3\2\2\2\t\'\3\2\2\2\13)\3\2\2\2\r,\3\2\2\2\17\61\3"+
		"\2\2\2\21?\3\2\2\2\23B\3\2\2\2\25P\3\2\2\2\27V\3\2\2\2\31f\3\2\2\2\33"+
		"i\3\2\2\2\35t\3\2\2\2\37y\3\2\2\2!\"\7?\2\2\"\4\3\2\2\2#$\7~\2\2$\6\3"+
		"\2\2\2%&\7*\2\2&\b\3\2\2\2\'(\7+\2\2(\n\3\2\2\2)*\7k\2\2*+\7h\2\2+\f\3"+
		"\2\2\2,-\7v\2\2-.\7j\2\2./\7g\2\2/\60\7p\2\2\60\16\3\2\2\2\61\62\7g\2"+
		"\2\62\63\7n\2\2\63\64\7u\2\2\64\65\7g\2\2\65\20\3\2\2\2\66\67\7V\2\2\67"+
		"8\7t\2\289\7w\2\29@\7g\2\2:;\7H\2\2;<\7c\2\2<=\7n\2\2=>\7u\2\2>@\7g\2"+
		"\2?\66\3\2\2\2?:\3\2\2\2@\22\3\2\2\2AC\t\2\2\2BA\3\2\2\2CD\3\2\2\2DB\3"+
		"\2\2\2DE\3\2\2\2EL\3\2\2\2FH\7\60\2\2GI\t\2\2\2HG\3\2\2\2IJ\3\2\2\2JH"+
		"\3\2\2\2JK\3\2\2\2KM\3\2\2\2LF\3\2\2\2LM\3\2\2\2M\24\3\2\2\2NQ\5\27\f"+
		"\2OQ\5\31\r\2PN\3\2\2\2PO\3\2\2\2Q\26\3\2\2\2RW\t\3\2\2ST\7f\2\2TU\7k"+
		"\2\2UW\7x\2\2VR\3\2\2\2VS\3\2\2\2W\30\3\2\2\2XY\7?\2\2Yg\7?\2\2Z[\7#\2"+
		"\2[g\7?\2\2\\]\7@\2\2]g\7?\2\2^g\7@\2\2_`\7>\2\2`g\7?\2\2ag\7>\2\2bc\7"+
		"(\2\2cg\7(\2\2de\7~\2\2eg\7~\2\2fX\3\2\2\2fZ\3\2\2\2f\\\3\2\2\2f^\3\2"+
		"\2\2f_\3\2\2\2fa\3\2\2\2fb\3\2\2\2fd\3\2\2\2g\32\3\2\2\2hj\t\4\2\2ih\3"+
		"\2\2\2jk\3\2\2\2ki\3\2\2\2kl\3\2\2\2lp\3\2\2\2mo\t\5\2\2nm\3\2\2\2or\3"+
		"\2\2\2pn\3\2\2\2pq\3\2\2\2q\34\3\2\2\2rp\3\2\2\2su\7\f\2\2ts\3\2\2\2u"+
		"v\3\2\2\2vt\3\2\2\2vw\3\2\2\2w\36\3\2\2\2xz\t\6\2\2yx\3\2\2\2z{\3\2\2"+
		"\2{y\3\2\2\2{|\3\2\2\2|}\3\2\2\2}~\b\20\2\2~ \3\2\2\2\16\2?DJLPVfkpv{"+
		"\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}