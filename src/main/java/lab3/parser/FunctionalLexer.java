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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, ID=8, NUM=9, BOOL=10, 
		BINOP=11, ARIFM=12, LOGIC=13, NEXT=14, WS=15;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "ID", "NUM", "BOOL", 
		"BINOP", "ARIFM", "LOGIC", "NEXT", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'='", "'|'", "'('", "')'", "'if'", "'then'", "'else'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, "ID", "NUM", "BOOL", "BINOP", 
		"ARIFM", "LOGIC", "NEXT", "WS"
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\21y\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\3\2\3\2\3\3\3\3\3\4"+
		"\3\4\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\6"+
		"\t8\n\t\r\t\16\t9\3\t\7\t=\n\t\f\t\16\t@\13\t\3\n\6\nC\n\n\r\n\16\nD\3"+
		"\n\3\n\6\nI\n\n\r\n\16\nJ\5\nM\n\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\5\13X\n\13\3\f\3\f\5\f\\\n\f\3\r\3\r\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\5\16h\n\16\3\17\3\17\3\17\3\17\7\17n\n\17\f\17\16\17"+
		"q\13\17\3\20\6\20t\n\20\r\20\16\20u\3\20\3\20\2\2\21\3\3\5\4\7\5\t\6\13"+
		"\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21\3\2\b\4\2C\\"+
		"c|\5\2\62;C\\c|\3\2\62;\5\2,-//\61\61\3\2\f\f\3\2\"\"\u0084\2\3\3\2\2"+
		"\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3"+
		"\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2"+
		"\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\3!\3\2\2\2\5#\3\2\2\2\7%\3\2"+
		"\2\2\t\'\3\2\2\2\13)\3\2\2\2\r,\3\2\2\2\17\61\3\2\2\2\21\67\3\2\2\2\23"+
		"B\3\2\2\2\25W\3\2\2\2\27[\3\2\2\2\31]\3\2\2\2\33g\3\2\2\2\35i\3\2\2\2"+
		"\37s\3\2\2\2!\"\7?\2\2\"\4\3\2\2\2#$\7~\2\2$\6\3\2\2\2%&\7*\2\2&\b\3\2"+
		"\2\2\'(\7+\2\2(\n\3\2\2\2)*\7k\2\2*+\7h\2\2+\f\3\2\2\2,-\7v\2\2-.\7j\2"+
		"\2./\7g\2\2/\60\7p\2\2\60\16\3\2\2\2\61\62\7g\2\2\62\63\7n\2\2\63\64\7"+
		"u\2\2\64\65\7g\2\2\65\20\3\2\2\2\668\t\2\2\2\67\66\3\2\2\289\3\2\2\29"+
		"\67\3\2\2\29:\3\2\2\2:>\3\2\2\2;=\t\3\2\2<;\3\2\2\2=@\3\2\2\2><\3\2\2"+
		"\2>?\3\2\2\2?\22\3\2\2\2@>\3\2\2\2AC\t\4\2\2BA\3\2\2\2CD\3\2\2\2DB\3\2"+
		"\2\2DE\3\2\2\2EL\3\2\2\2FH\7\60\2\2GI\t\4\2\2HG\3\2\2\2IJ\3\2\2\2JH\3"+
		"\2\2\2JK\3\2\2\2KM\3\2\2\2LF\3\2\2\2LM\3\2\2\2M\24\3\2\2\2NO\7V\2\2OP"+
		"\7t\2\2PQ\7w\2\2QX\7g\2\2RS\7H\2\2ST\7c\2\2TU\7n\2\2UV\7u\2\2VX\7g\2\2"+
		"WN\3\2\2\2WR\3\2\2\2X\26\3\2\2\2Y\\\5\31\r\2Z\\\5\33\16\2[Y\3\2\2\2[Z"+
		"\3\2\2\2\\\30\3\2\2\2]^\t\5\2\2^\32\3\2\2\2_`\7?\2\2`h\7?\2\2ab\7#\2\2"+
		"bh\7?\2\2cd\7(\2\2dh\7(\2\2ef\7~\2\2fh\7~\2\2g_\3\2\2\2ga\3\2\2\2gc\3"+
		"\2\2\2ge\3\2\2\2h\34\3\2\2\2ij\7\f\2\2jk\7\f\2\2ko\3\2\2\2ln\t\6\2\2m"+
		"l\3\2\2\2nq\3\2\2\2om\3\2\2\2op\3\2\2\2p\36\3\2\2\2qo\3\2\2\2rt\t\7\2"+
		"\2sr\3\2\2\2tu\3\2\2\2us\3\2\2\2uv\3\2\2\2vw\3\2\2\2wx\b\20\2\2x \3\2"+
		"\2\2\r\29>DJLW[gou\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}