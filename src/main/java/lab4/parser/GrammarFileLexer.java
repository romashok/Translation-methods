// Generated from GrammarFile.g4 by ANTLR 4.5.3

package lab4.parser;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GrammarFileLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, GrammarName=5, LexerToken=6, STRING=7, 
		WS=8;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "GrammarName", "LexerToken", "STRING", 
		"WS"
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


	public GrammarFileLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "GrammarFile.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\nF\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\7\6$\n\6\f\6\16\6\'\13"+
		"\6\3\7\3\7\7\7+\n\7\f\7\16\7.\13\7\3\7\3\7\7\7\62\n\7\f\7\16\7\65\13\7"+
		"\3\7\5\78\n\7\3\b\3\b\7\b<\n\b\f\b\16\b?\13\b\3\b\3\b\3\t\3\t\3\t\3\t"+
		"\3\63\2\n\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\3\2\7\3\2c|\6\2\62;C\\aa"+
		"c|\3\2C\\\5\2\f\f\17\17))\5\2\13\f\17\17\"\"J\2\3\3\2\2\2\2\5\3\2\2\2"+
		"\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3"+
		"\2\2\2\3\23\3\2\2\2\5\33\3\2\2\2\7\35\3\2\2\2\t\37\3\2\2\2\13!\3\2\2\2"+
		"\r\67\3\2\2\2\179\3\2\2\2\21B\3\2\2\2\23\24\7i\2\2\24\25\7t\2\2\25\26"+
		"\7c\2\2\26\27\7o\2\2\27\30\7o\2\2\30\31\7c\2\2\31\32\7t\2\2\32\4\3\2\2"+
		"\2\33\34\7=\2\2\34\6\3\2\2\2\35\36\7<\2\2\36\b\3\2\2\2\37 \7~\2\2 \n\3"+
		"\2\2\2!%\t\2\2\2\"$\t\3\2\2#\"\3\2\2\2$\'\3\2\2\2%#\3\2\2\2%&\3\2\2\2"+
		"&\f\3\2\2\2\'%\3\2\2\2(,\t\4\2\2)+\t\3\2\2*)\3\2\2\2+.\3\2\2\2,*\3\2\2"+
		"\2,-\3\2\2\2-8\3\2\2\2.,\3\2\2\2/\63\7]\2\2\60\62\13\2\2\2\61\60\3\2\2"+
		"\2\62\65\3\2\2\2\63\64\3\2\2\2\63\61\3\2\2\2\64\66\3\2\2\2\65\63\3\2\2"+
		"\2\668\7_\2\2\67(\3\2\2\2\67/\3\2\2\28\16\3\2\2\29=\7)\2\2:<\n\5\2\2;"+
		":\3\2\2\2<?\3\2\2\2=;\3\2\2\2=>\3\2\2\2>@\3\2\2\2?=\3\2\2\2@A\7)\2\2A"+
		"\20\3\2\2\2BC\t\6\2\2CD\3\2\2\2DE\b\t\2\2E\22\3\2\2\2\b\2%,\63\67=\3\b"+
		"\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}