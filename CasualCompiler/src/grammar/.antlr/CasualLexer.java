// Generated from c:\Users\jeeg9\Documents\GitHub\projeto-tcomp\CasualCompiler\src\grammar\Casual.g4 by ANTLR 4.7.1

  package casual.grammar;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CasualLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		TYPE=32, NEWLINE=33, INT=34, BOOL=35, STRING=36, FLOAT=37, VARS=38, COMMENT=39, 
		WHITESPACE=40;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
		"T__17", "T__18", "T__19", "T__20", "T__21", "T__22", "T__23", "T__24", 
		"T__25", "T__26", "T__27", "T__28", "T__29", "T__30", "ESC", "TXT", "TYPE", 
		"NEWLINE", "INT", "BOOL", "STRING", "FLOAT", "VARS", "COMMENT", "WHITESPACE"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'decl'", "'('", "')'", "':'", "','", "'def'", "'{'", "'}'", "'return'", 
		"';'", "'if'", "'while'", "'='", "'['", "']'", "'&&'", "'||'", "'=='", 
		"'!='", "'>='", "'>'", "'<='", "'<'", "'else'", "'+'", "'-'", "'*'", "'/'", 
		"'%'", "'!true'", "'get_array()['"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, "TYPE", "NEWLINE", "INT", 
		"BOOL", "STRING", "FLOAT", "VARS", "COMMENT", "WHITESPACE"
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


	public CasualLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Casual.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2*\u0119\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\3"+
		"\2\3\2\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3\7\3\b"+
		"\3\b\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\f\3\f\3\f\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\21\3\22\3\22"+
		"\3\22\3\23\3\23\3\23\3\24\3\24\3\24\3\25\3\25\3\25\3\26\3\26\3\27\3\27"+
		"\3\27\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34"+
		"\3\35\3\35\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3"+
		" \3 \3 \3 \3 \3 \3 \3!\3!\3!\3!\5!\u00c1\n!\3\"\7\"\u00c4\n\"\f\"\16\""+
		"\u00c7\13\"\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3"+
		"#\3#\3#\5#\u00df\n#\3$\6$\u00e2\n$\r$\16$\u00e3\3%\6%\u00e7\n%\r%\16%"+
		"\u00e8\3&\3&\3&\3&\3&\3&\3&\3&\3&\5&\u00f4\n&\3\'\3\'\3\'\7\'\u00f9\n"+
		"\'\f\'\16\'\u00fc\13\'\3\'\3\'\3(\7(\u0101\n(\f(\16(\u0104\13(\3(\3(\6"+
		"(\u0108\n(\r(\16(\u0109\3)\3)\7)\u010e\n)\f)\16)\u0111\13)\3*\3*\3*\3"+
		"+\3+\3+\3+\3\u00fa\2,\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27"+
		"\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33"+
		"\65\34\67\359\36;\37= ?!A\2C\2E\"G#I$K%M&O\'Q(S)U*\3\2\7\4\2\f\f\17\17"+
		"\3\2\62;\5\2C\\aac|\6\2\62;C\\aac|\4\2\13\13\"\"\2\u0124\2\3\3\2\2\2\2"+
		"\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2"+
		"\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2"+
		"\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2"+
		"\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2"+
		"\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2"+
		"\2\2?\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2"+
		"O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\3W\3\2\2\2\5\\\3\2\2\2\7^\3"+
		"\2\2\2\t`\3\2\2\2\13b\3\2\2\2\rd\3\2\2\2\17h\3\2\2\2\21j\3\2\2\2\23l\3"+
		"\2\2\2\25s\3\2\2\2\27u\3\2\2\2\31x\3\2\2\2\33~\3\2\2\2\35\u0080\3\2\2"+
		"\2\37\u0082\3\2\2\2!\u0084\3\2\2\2#\u0087\3\2\2\2%\u008a\3\2\2\2\'\u008d"+
		"\3\2\2\2)\u0090\3\2\2\2+\u0093\3\2\2\2-\u0095\3\2\2\2/\u0098\3\2\2\2\61"+
		"\u009a\3\2\2\2\63\u009f\3\2\2\2\65\u00a1\3\2\2\2\67\u00a3\3\2\2\29\u00a5"+
		"\3\2\2\2;\u00a7\3\2\2\2=\u00a9\3\2\2\2?\u00af\3\2\2\2A\u00c0\3\2\2\2C"+
		"\u00c5\3\2\2\2E\u00de\3\2\2\2G\u00e1\3\2\2\2I\u00e6\3\2\2\2K\u00f3\3\2"+
		"\2\2M\u00f5\3\2\2\2O\u0102\3\2\2\2Q\u010b\3\2\2\2S\u0112\3\2\2\2U\u0115"+
		"\3\2\2\2WX\7f\2\2XY\7g\2\2YZ\7e\2\2Z[\7n\2\2[\4\3\2\2\2\\]\7*\2\2]\6\3"+
		"\2\2\2^_\7+\2\2_\b\3\2\2\2`a\7<\2\2a\n\3\2\2\2bc\7.\2\2c\f\3\2\2\2de\7"+
		"f\2\2ef\7g\2\2fg\7h\2\2g\16\3\2\2\2hi\7}\2\2i\20\3\2\2\2jk\7\177\2\2k"+
		"\22\3\2\2\2lm\7t\2\2mn\7g\2\2no\7v\2\2op\7w\2\2pq\7t\2\2qr\7p\2\2r\24"+
		"\3\2\2\2st\7=\2\2t\26\3\2\2\2uv\7k\2\2vw\7h\2\2w\30\3\2\2\2xy\7y\2\2y"+
		"z\7j\2\2z{\7k\2\2{|\7n\2\2|}\7g\2\2}\32\3\2\2\2~\177\7?\2\2\177\34\3\2"+
		"\2\2\u0080\u0081\7]\2\2\u0081\36\3\2\2\2\u0082\u0083\7_\2\2\u0083 \3\2"+
		"\2\2\u0084\u0085\7(\2\2\u0085\u0086\7(\2\2\u0086\"\3\2\2\2\u0087\u0088"+
		"\7~\2\2\u0088\u0089\7~\2\2\u0089$\3\2\2\2\u008a\u008b\7?\2\2\u008b\u008c"+
		"\7?\2\2\u008c&\3\2\2\2\u008d\u008e\7#\2\2\u008e\u008f\7?\2\2\u008f(\3"+
		"\2\2\2\u0090\u0091\7@\2\2\u0091\u0092\7?\2\2\u0092*\3\2\2\2\u0093\u0094"+
		"\7@\2\2\u0094,\3\2\2\2\u0095\u0096\7>\2\2\u0096\u0097\7?\2\2\u0097.\3"+
		"\2\2\2\u0098\u0099\7>\2\2\u0099\60\3\2\2\2\u009a\u009b\7g\2\2\u009b\u009c"+
		"\7n\2\2\u009c\u009d\7u\2\2\u009d\u009e\7g\2\2\u009e\62\3\2\2\2\u009f\u00a0"+
		"\7-\2\2\u00a0\64\3\2\2\2\u00a1\u00a2\7/\2\2\u00a2\66\3\2\2\2\u00a3\u00a4"+
		"\7,\2\2\u00a48\3\2\2\2\u00a5\u00a6\7\61\2\2\u00a6:\3\2\2\2\u00a7\u00a8"+
		"\7\'\2\2\u00a8<\3\2\2\2\u00a9\u00aa\7#\2\2\u00aa\u00ab\7v\2\2\u00ab\u00ac"+
		"\7t\2\2\u00ac\u00ad\7w\2\2\u00ad\u00ae\7g\2\2\u00ae>\3\2\2\2\u00af\u00b0"+
		"\7i\2\2\u00b0\u00b1\7g\2\2\u00b1\u00b2\7v\2\2\u00b2\u00b3\7a\2\2\u00b3"+
		"\u00b4\7c\2\2\u00b4\u00b5\7t\2\2\u00b5\u00b6\7t\2\2\u00b6\u00b7\7c\2\2"+
		"\u00b7\u00b8\7{\2\2\u00b8\u00b9\7*\2\2\u00b9\u00ba\7+\2\2\u00ba\u00bb"+
		"\7]\2\2\u00bb@\3\2\2\2\u00bc\u00bd\7^\2\2\u00bd\u00c1\7$\2\2\u00be\u00bf"+
		"\7^\2\2\u00bf\u00c1\7^\2\2\u00c0\u00bc\3\2\2\2\u00c0\u00be\3\2\2\2\u00c1"+
		"B\3\2\2\2\u00c2\u00c4\n\2\2\2\u00c3\u00c2\3\2\2\2\u00c4\u00c7\3\2\2\2"+
		"\u00c5\u00c3\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c6D\3\2\2\2\u00c7\u00c5\3"+
		"\2\2\2\u00c8\u00c9\7K\2\2\u00c9\u00ca\7p\2\2\u00ca\u00df\7v\2\2\u00cb"+
		"\u00cc\7D\2\2\u00cc\u00cd\7q\2\2\u00cd\u00ce\7q\2\2\u00ce\u00df\7n\2\2"+
		"\u00cf\u00d0\7U\2\2\u00d0\u00d1\7v\2\2\u00d1\u00d2\7t\2\2\u00d2\u00d3"+
		"\7k\2\2\u00d3\u00d4\7p\2\2\u00d4\u00df\7i\2\2\u00d5\u00d6\7H\2\2\u00d6"+
		"\u00d7\7n\2\2\u00d7\u00d8\7q\2\2\u00d8\u00d9\7c\2\2\u00d9\u00df\7v\2\2"+
		"\u00da\u00db\7X\2\2\u00db\u00dc\7q\2\2\u00dc\u00dd\7k\2\2\u00dd\u00df"+
		"\7f\2\2\u00de\u00c8\3\2\2\2\u00de\u00cb\3\2\2\2\u00de\u00cf\3\2\2\2\u00de"+
		"\u00d5\3\2\2\2\u00de\u00da\3\2\2\2\u00dfF\3\2\2\2\u00e0\u00e2\t\2\2\2"+
		"\u00e1\u00e0\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e3\u00e1\3\2\2\2\u00e3\u00e4"+
		"\3\2\2\2\u00e4H\3\2\2\2\u00e5\u00e7\t\3\2\2\u00e6\u00e5\3\2\2\2\u00e7"+
		"\u00e8\3\2\2\2\u00e8\u00e6\3\2\2\2\u00e8\u00e9\3\2\2\2\u00e9J\3\2\2\2"+
		"\u00ea\u00eb\7v\2\2\u00eb\u00ec\7t\2\2\u00ec\u00ed\7w\2\2\u00ed\u00f4"+
		"\7g\2\2\u00ee\u00ef\7h\2\2\u00ef\u00f0\7c\2\2\u00f0\u00f1\7n\2\2\u00f1"+
		"\u00f2\7u\2\2\u00f2\u00f4\7g\2\2\u00f3\u00ea\3\2\2\2\u00f3\u00ee\3\2\2"+
		"\2\u00f4L\3\2\2\2\u00f5\u00fa\7$\2\2\u00f6\u00f9\5A!\2\u00f7\u00f9\13"+
		"\2\2\2\u00f8\u00f6\3\2\2\2\u00f8\u00f7\3\2\2\2\u00f9\u00fc\3\2\2\2\u00fa"+
		"\u00fb\3\2\2\2\u00fa\u00f8\3\2\2\2\u00fb\u00fd\3\2\2\2\u00fc\u00fa\3\2"+
		"\2\2\u00fd\u00fe\7$\2\2\u00feN\3\2\2\2\u00ff\u0101\t\3\2\2\u0100\u00ff"+
		"\3\2\2\2\u0101\u0104\3\2\2\2\u0102\u0100\3\2\2\2\u0102\u0103\3\2\2\2\u0103"+
		"\u0105\3\2\2\2\u0104\u0102\3\2\2\2\u0105\u0107\7\60\2\2\u0106\u0108\t"+
		"\3\2\2\u0107\u0106\3\2\2\2\u0108\u0109\3\2\2\2\u0109\u0107\3\2\2\2\u0109"+
		"\u010a\3\2\2\2\u010aP\3\2\2\2\u010b\u010f\t\4\2\2\u010c\u010e\t\5\2\2"+
		"\u010d\u010c\3\2\2\2\u010e\u0111\3\2\2\2\u010f\u010d\3\2\2\2\u010f\u0110"+
		"\3\2\2\2\u0110R\3\2\2\2\u0111\u010f\3\2\2\2\u0112\u0113\7%\2\2\u0113\u0114"+
		"\5C\"\2\u0114T\3\2\2\2\u0115\u0116\t\6\2\2\u0116\u0117\3\2\2\2\u0117\u0118"+
		"\b+\2\2\u0118V\3\2\2\2\16\2\u00c0\u00c5\u00de\u00e3\u00e8\u00f3\u00f8"+
		"\u00fa\u0102\u0109\u010f\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}