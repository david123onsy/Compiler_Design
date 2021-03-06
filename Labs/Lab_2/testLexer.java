// Generated from test.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class testLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		IMMEDIATE=1, REG=2, COMMAND=3, MEMORY=4, NEWLINE=5, COMMA=6, SPACE=7;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"IMMEDIATE", "REG", "COMMAND", "MEMORY", "NEWLINE", "COMMA", "SPACE"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "IMMEDIATE", "REG", "COMMAND", "MEMORY", "NEWLINE", "COMMA", "SPACE"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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


	public testLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "test.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\tL\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\3\2\6\2\23\n\2\r\2\16\2"+
		"\24\3\2\6\2\30\n\2\r\2\16\2\31\3\2\5\2\35\n\2\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\5\3\'\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\62\n\4\3\5"+
		"\3\5\3\5\3\5\3\6\6\69\n\6\r\6\16\6:\3\6\3\6\3\7\6\7@\n\7\r\7\16\7A\3\7"+
		"\3\7\3\b\6\bG\n\b\r\b\16\bH\3\b\3\b\2\2\t\3\3\5\4\7\5\t\6\13\7\r\b\17"+
		"\t\3\2\5\3\2\62;\3\2\62\63\4\2\f\f\17\17\2V\2\3\3\2\2\2\2\5\3\2\2\2\2"+
		"\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\3\34\3\2"+
		"\2\2\5&\3\2\2\2\7\61\3\2\2\2\t\63\3\2\2\2\138\3\2\2\2\r?\3\2\2\2\17F\3"+
		"\2\2\2\21\23\t\2\2\2\22\21\3\2\2\2\23\24\3\2\2\2\24\22\3\2\2\2\24\25\3"+
		"\2\2\2\25\35\3\2\2\2\26\30\t\3\2\2\27\26\3\2\2\2\30\31\3\2\2\2\31\27\3"+
		"\2\2\2\31\32\3\2\2\2\32\33\3\2\2\2\33\35\7d\2\2\34\22\3\2\2\2\34\27\3"+
		"\2\2\2\35\4\3\2\2\2\36\37\7C\2\2\37\'\7Z\2\2 !\7D\2\2!\'\7Z\2\2\"#\7E"+
		"\2\2#\'\7Z\2\2$%\7F\2\2%\'\7Z\2\2&\36\3\2\2\2& \3\2\2\2&\"\3\2\2\2&$\3"+
		"\2\2\2\'\6\3\2\2\2()\7C\2\2)*\7C\2\2*\62\7C\2\2+,\7C\2\2,-\7F\2\2-\62"+
		"\7F\2\2./\7K\2\2/\60\7P\2\2\60\62\7E\2\2\61(\3\2\2\2\61+\3\2\2\2\61.\3"+
		"\2\2\2\62\b\3\2\2\2\63\64\7]\2\2\64\65\5\5\3\2\65\66\7_\2\2\66\n\3\2\2"+
		"\2\679\t\4\2\28\67\3\2\2\29:\3\2\2\2:8\3\2\2\2:;\3\2\2\2;<\3\2\2\2<=\b"+
		"\6\2\2=\f\3\2\2\2>@\7.\2\2?>\3\2\2\2@A\3\2\2\2A?\3\2\2\2AB\3\2\2\2BC\3"+
		"\2\2\2CD\b\7\2\2D\16\3\2\2\2EG\7\"\2\2FE\3\2\2\2GH\3\2\2\2HF\3\2\2\2H"+
		"I\3\2\2\2IJ\3\2\2\2JK\b\b\2\2K\20\3\2\2\2\13\2\24\31\34&\61:AH\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}