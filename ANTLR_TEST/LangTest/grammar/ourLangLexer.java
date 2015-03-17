// Generated from ourLang.g4 by ANTLR 4.5
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ourLangLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, IMPORT=30, IF=31, ELSE=32, 
		WHILE=33, FOR=34, MATRIX=35, ROWVECTOR=36, COLVECTOR=37, INT=38, INTNUM=39, 
		FLOAT=40, FLOATNUM=41, BOOL=42, BOOLVAL=43, STRING=44, SIGN=45, ID=46, 
		LIBRARY=47, PRINT=48, WS=49, NL=50, COMMENT=51, LINE_COMMENT=52;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
		"T__17", "T__18", "T__19", "T__20", "T__21", "T__22", "T__23", "T__24", 
		"T__25", "T__26", "T__27", "T__28", "IMPORT", "IF", "ELSE", "WHILE", "FOR", 
		"MATRIX", "ROWVECTOR", "COLVECTOR", "INT", "INTNUM", "FLOAT", "FLOATNUM", 
		"BOOL", "BOOLVAL", "STRING", "SIGN", "ID", "LIBRARY", "PRINT", "WS", "NL", 
		"COMMENT", "LINE_COMMENT"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "';'", "'<'", "'>'", "'('", "')'", "'{'", "'}'", "'&&'", "'||'", 
		"'void'", "'return'", "','", "'*'", "'/'", "'%'", "'+'", "'='", "'['", 
		"']'", "'++'", "'--'", "'+='", "'-='", "'*='", "'/='", "'=='", "'!='", 
		"'<='", "'>='", null, "'if'", "'else'", "'while'", "'for'", "'matrix'", 
		null, null, null, null, null, null, "'bool'", null, null, "'-'", null, 
		null, "'print'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, "IMPORT", "IF", "ELSE", "WHILE", "FOR", 
		"MATRIX", "ROWVECTOR", "COLVECTOR", "INT", "INTNUM", "FLOAT", "FLOATNUM", 
		"BOOL", "BOOLVAL", "STRING", "SIGN", "ID", "LIBRARY", "PRINT", "WS", "NL", 
		"COMMENT", "LINE_COMMENT"
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


	public ourLangLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "ourLang.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\66\u01b0\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\4\65\t\65\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3"+
		"\b\3\t\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3"+
		"\23\3\23\3\24\3\24\3\25\3\25\3\25\3\26\3\26\3\26\3\27\3\27\3\27\3\30\3"+
		"\30\3\30\3\31\3\31\3\31\3\32\3\32\3\32\3\33\3\33\3\33\3\34\3\34\3\34\3"+
		"\35\3\35\3\35\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3"+
		"\37\3\37\3\37\3\37\3\37\5\37\u00c7\n\37\3 \3 \3 \3!\3!\3!\3!\3!\3\"\3"+
		"\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3$\3$\3$\3$\3$\3$\3$\3%\3%\3%\3%\3%\3%"+
		"\3%\3%\3%\3%\3%\3%\3%\5%\u00ef\n%\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&"+
		"\3&\5&\u00fe\n&\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3"+
		"\'\3\'\3\'\3\'\3\'\5\'\u0112\n\'\3(\3(\5(\u0116\n(\3(\3(\7(\u011a\n(\f"+
		"(\16(\u011d\13(\5(\u011f\n(\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)"+
		"\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\5)\u013b\n)\3*\3*\3*\3*\5*\u0141"+
		"\n*\3*\3*\7*\u0145\n*\f*\16*\u0148\13*\3*\5*\u014b\n*\3*\3*\7*\u014f\n"+
		"*\f*\16*\u0152\13*\3*\5*\u0155\n*\3+\3+\3+\3+\3+\3,\3,\3,\3,\3,\3,\3,"+
		"\3,\3,\5,\u0165\n,\3-\3-\7-\u0169\n-\f-\16-\u016c\13-\3-\3-\3.\3.\3/\3"+
		"/\7/\u0174\n/\f/\16/\u0177\13/\3\60\6\60\u017a\n\60\r\60\16\60\u017b\3"+
		"\60\5\60\u017f\n\60\3\60\7\60\u0182\n\60\f\60\16\60\u0185\13\60\3\61\3"+
		"\61\3\61\3\61\3\61\3\61\3\62\6\62\u018e\n\62\r\62\16\62\u018f\3\62\3\62"+
		"\3\63\3\63\3\63\3\63\3\64\3\64\3\64\3\64\7\64\u019c\n\64\f\64\16\64\u019f"+
		"\13\64\3\64\3\64\3\64\3\64\3\64\3\65\3\65\3\65\3\65\7\65\u01aa\n\65\f"+
		"\65\16\65\u01ad\13\65\3\65\3\65\4\u016a\u019d\2\66\3\3\5\4\7\5\t\6\13"+
		"\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'"+
		"\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'"+
		"M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65i\66\3\2\t\3\2\63;\3\2\62;\5\2"+
		"C\\aac|\6\2\62;C\\aac|\4\2\13\13\"\"\6\2\f\f\17\17\"\"~~\4\2\f\f\17\17"+
		"\u01c9\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2"+
		"\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3"+
		"\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2"+
		"\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2"+
		"/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2"+
		"\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2"+
		"G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3"+
		"\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2"+
		"\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\3k\3\2\2\2\5"+
		"m\3\2\2\2\7o\3\2\2\2\tq\3\2\2\2\13s\3\2\2\2\ru\3\2\2\2\17w\3\2\2\2\21"+
		"y\3\2\2\2\23|\3\2\2\2\25\177\3\2\2\2\27\u0084\3\2\2\2\31\u008b\3\2\2\2"+
		"\33\u008d\3\2\2\2\35\u008f\3\2\2\2\37\u0091\3\2\2\2!\u0093\3\2\2\2#\u0095"+
		"\3\2\2\2%\u0097\3\2\2\2\'\u0099\3\2\2\2)\u009b\3\2\2\2+\u009e\3\2\2\2"+
		"-\u00a1\3\2\2\2/\u00a4\3\2\2\2\61\u00a7\3\2\2\2\63\u00aa\3\2\2\2\65\u00ad"+
		"\3\2\2\2\67\u00b0\3\2\2\29\u00b3\3\2\2\2;\u00b6\3\2\2\2=\u00c6\3\2\2\2"+
		"?\u00c8\3\2\2\2A\u00cb\3\2\2\2C\u00d0\3\2\2\2E\u00d6\3\2\2\2G\u00da\3"+
		"\2\2\2I\u00ee\3\2\2\2K\u00fd\3\2\2\2M\u0111\3\2\2\2O\u011e\3\2\2\2Q\u013a"+
		"\3\2\2\2S\u0154\3\2\2\2U\u0156\3\2\2\2W\u0164\3\2\2\2Y\u0166\3\2\2\2["+
		"\u016f\3\2\2\2]\u0171\3\2\2\2_\u0179\3\2\2\2a\u0186\3\2\2\2c\u018d\3\2"+
		"\2\2e\u0193\3\2\2\2g\u0197\3\2\2\2i\u01a5\3\2\2\2kl\7=\2\2l\4\3\2\2\2"+
		"mn\7>\2\2n\6\3\2\2\2op\7@\2\2p\b\3\2\2\2qr\7*\2\2r\n\3\2\2\2st\7+\2\2"+
		"t\f\3\2\2\2uv\7}\2\2v\16\3\2\2\2wx\7\177\2\2x\20\3\2\2\2yz\7(\2\2z{\7"+
		"(\2\2{\22\3\2\2\2|}\7~\2\2}~\7~\2\2~\24\3\2\2\2\177\u0080\7x\2\2\u0080"+
		"\u0081\7q\2\2\u0081\u0082\7k\2\2\u0082\u0083\7f\2\2\u0083\26\3\2\2\2\u0084"+
		"\u0085\7t\2\2\u0085\u0086\7g\2\2\u0086\u0087\7v\2\2\u0087\u0088\7w\2\2"+
		"\u0088\u0089\7t\2\2\u0089\u008a\7p\2\2\u008a\30\3\2\2\2\u008b\u008c\7"+
		".\2\2\u008c\32\3\2\2\2\u008d\u008e\7,\2\2\u008e\34\3\2\2\2\u008f\u0090"+
		"\7\61\2\2\u0090\36\3\2\2\2\u0091\u0092\7\'\2\2\u0092 \3\2\2\2\u0093\u0094"+
		"\7-\2\2\u0094\"\3\2\2\2\u0095\u0096\7?\2\2\u0096$\3\2\2\2\u0097\u0098"+
		"\7]\2\2\u0098&\3\2\2\2\u0099\u009a\7_\2\2\u009a(\3\2\2\2\u009b\u009c\7"+
		"-\2\2\u009c\u009d\7-\2\2\u009d*\3\2\2\2\u009e\u009f\7/\2\2\u009f\u00a0"+
		"\7/\2\2\u00a0,\3\2\2\2\u00a1\u00a2\7-\2\2\u00a2\u00a3\7?\2\2\u00a3.\3"+
		"\2\2\2\u00a4\u00a5\7/\2\2\u00a5\u00a6\7?\2\2\u00a6\60\3\2\2\2\u00a7\u00a8"+
		"\7,\2\2\u00a8\u00a9\7?\2\2\u00a9\62\3\2\2\2\u00aa\u00ab\7\61\2\2\u00ab"+
		"\u00ac\7?\2\2\u00ac\64\3\2\2\2\u00ad\u00ae\7?\2\2\u00ae\u00af\7?\2\2\u00af"+
		"\66\3\2\2\2\u00b0\u00b1\7#\2\2\u00b1\u00b2\7?\2\2\u00b28\3\2\2\2\u00b3"+
		"\u00b4\7>\2\2\u00b4\u00b5\7?\2\2\u00b5:\3\2\2\2\u00b6\u00b7\7@\2\2\u00b7"+
		"\u00b8\7?\2\2\u00b8<\3\2\2\2\u00b9\u00ba\7k\2\2\u00ba\u00bb\7p\2\2\u00bb"+
		"\u00bc\7e\2\2\u00bc\u00bd\7n\2\2\u00bd\u00be\7w\2\2\u00be\u00bf\7f\2\2"+
		"\u00bf\u00c7\7g\2\2\u00c0\u00c1\7k\2\2\u00c1\u00c2\7o\2\2\u00c2\u00c3"+
		"\7r\2\2\u00c3\u00c4\7q\2\2\u00c4\u00c5\7t\2\2\u00c5\u00c7\7v\2\2\u00c6"+
		"\u00b9\3\2\2\2\u00c6\u00c0\3\2\2\2\u00c7>\3\2\2\2\u00c8\u00c9\7k\2\2\u00c9"+
		"\u00ca\7h\2\2\u00ca@\3\2\2\2\u00cb\u00cc\7g\2\2\u00cc\u00cd\7n\2\2\u00cd"+
		"\u00ce\7u\2\2\u00ce\u00cf\7g\2\2\u00cfB\3\2\2\2\u00d0\u00d1\7y\2\2\u00d1"+
		"\u00d2\7j\2\2\u00d2\u00d3\7k\2\2\u00d3\u00d4\7n\2\2\u00d4\u00d5\7g\2\2"+
		"\u00d5D\3\2\2\2\u00d6\u00d7\7h\2\2\u00d7\u00d8\7q\2\2\u00d8\u00d9\7t\2"+
		"\2\u00d9F\3\2\2\2\u00da\u00db\7o\2\2\u00db\u00dc\7c\2\2\u00dc\u00dd\7"+
		"v\2\2\u00dd\u00de\7t\2\2\u00de\u00df\7k\2\2\u00df\u00e0\7z\2\2\u00e0H"+
		"\3\2\2\2\u00e1\u00e2\7t\2\2\u00e2\u00e3\7q\2\2\u00e3\u00e4\7y\2\2\u00e4"+
		"\u00e5\7x\2\2\u00e5\u00e6\7g\2\2\u00e6\u00e7\7e\2\2\u00e7\u00e8\7v\2\2"+
		"\u00e8\u00e9\7q\2\2\u00e9\u00ef\7t\2\2\u00ea\u00eb\7t\2\2\u00eb\u00ec"+
		"\7x\2\2\u00ec\u00ed\7g\2\2\u00ed\u00ef\7e\2\2\u00ee\u00e1\3\2\2\2\u00ee"+
		"\u00ea\3\2\2\2\u00efJ\3\2\2\2\u00f0\u00f1\7e\2\2\u00f1\u00f2\7q\2\2\u00f2"+
		"\u00f3\7n\2\2\u00f3\u00f4\7x\2\2\u00f4\u00f5\7g\2\2\u00f5\u00f6\7e\2\2"+
		"\u00f6\u00f7\7v\2\2\u00f7\u00f8\7q\2\2\u00f8\u00fe\7t\2\2\u00f9\u00fa"+
		"\7e\2\2\u00fa\u00fb\7x\2\2\u00fb\u00fc\7g\2\2\u00fc\u00fe\7e\2\2\u00fd"+
		"\u00f0\3\2\2\2\u00fd\u00f9\3\2\2\2\u00feL\3\2\2\2\u00ff\u0100\7k\2\2\u0100"+
		"\u0101\7p\2\2\u0101\u0112\7v\2\2\u0102\u0103\7k\2\2\u0103\u0104\7p\2\2"+
		"\u0104\u0105\7v\2\2\u0105\u0106\7\63\2\2\u0106\u0112\78\2\2\u0107\u0108"+
		"\7k\2\2\u0108\u0109\7p\2\2\u0109\u010a\7v\2\2\u010a\u010b\7\65\2\2\u010b"+
		"\u0112\7\64\2\2\u010c\u010d\7k\2\2\u010d\u010e\7p\2\2\u010e\u010f\7v\2"+
		"\2\u010f\u0110\78\2\2\u0110\u0112\7\66\2\2\u0111\u00ff\3\2\2\2\u0111\u0102"+
		"\3\2\2\2\u0111\u0107\3\2\2\2\u0111\u010c\3\2\2\2\u0112N\3\2\2\2\u0113"+
		"\u011f\7\62\2\2\u0114\u0116\5[.\2\u0115\u0114\3\2\2\2\u0115\u0116\3\2"+
		"\2\2\u0116\u0117\3\2\2\2\u0117\u011b\t\2\2\2\u0118\u011a\t\3\2\2\u0119"+
		"\u0118\3\2\2\2\u011a\u011d\3\2\2\2\u011b\u0119\3\2\2\2\u011b\u011c\3\2"+
		"\2\2\u011c\u011f\3\2\2\2\u011d\u011b\3\2\2\2\u011e\u0113\3\2\2\2\u011e"+
		"\u0115\3\2\2\2\u011fP\3\2\2\2\u0120\u0121\7h\2\2\u0121\u0122\7n\2\2\u0122"+
		"\u0123\7q\2\2\u0123\u0124\7c\2\2\u0124\u013b\7v\2\2\u0125\u0126\7h\2\2"+
		"\u0126\u0127\7n\2\2\u0127\u0128\7q\2\2\u0128\u0129\7c\2\2\u0129\u012a"+
		"\7v\2\2\u012a\u012b\7\63\2\2\u012b\u013b\78\2\2\u012c\u012d\7h\2\2\u012d"+
		"\u012e\7n\2\2\u012e\u012f\7q\2\2\u012f\u0130\7c\2\2\u0130\u0131\7v\2\2"+
		"\u0131\u0132\7\65\2\2\u0132\u013b\7\64\2\2\u0133\u0134\7h\2\2\u0134\u0135"+
		"\7n\2\2\u0135\u0136\7q\2\2\u0136\u0137\7c\2\2\u0137\u0138\7v\2\2\u0138"+
		"\u0139\78\2\2\u0139\u013b\7\66\2\2\u013a\u0120\3\2\2\2\u013a\u0125\3\2"+
		"\2\2\u013a\u012c\3\2\2\2\u013a\u0133\3\2\2\2\u013bR\3\2\2\2\u013c\u013d"+
		"\7\62\2\2\u013d\u013e\7\60\2\2\u013e\u0155\7\62\2\2\u013f\u0141\5[.\2"+
		"\u0140\u013f\3\2\2\2\u0140\u0141\3\2\2\2\u0141\u014a\3\2\2\2\u0142\u0146"+
		"\t\2\2\2\u0143\u0145\t\3\2\2\u0144\u0143\3\2\2\2\u0145\u0148\3\2\2\2\u0146"+
		"\u0144\3\2\2\2\u0146\u0147\3\2\2\2\u0147\u014b\3\2\2\2\u0148\u0146\3\2"+
		"\2\2\u0149\u014b\7\62\2\2\u014a\u0142\3\2\2\2\u014a\u0149\3\2\2\2\u014b"+
		"\u014c\3\2\2\2\u014c\u0150\7\60\2\2\u014d\u014f\t\3\2\2\u014e\u014d\3"+
		"\2\2\2\u014f\u0152\3\2\2\2\u0150\u014e\3\2\2\2\u0150\u0151\3\2\2\2\u0151"+
		"\u0153\3\2\2\2\u0152\u0150\3\2\2\2\u0153\u0155\t\2\2\2\u0154\u013c\3\2"+
		"\2\2\u0154\u0140\3\2\2\2\u0155T\3\2\2\2\u0156\u0157\7d\2\2\u0157\u0158"+
		"\7q\2\2\u0158\u0159\7q\2\2\u0159\u015a\7n\2\2\u015aV\3\2\2\2\u015b\u015c"+
		"\7v\2\2\u015c\u015d\7t\2\2\u015d\u015e\7w\2\2\u015e\u0165\7g\2\2\u015f"+
		"\u0160\7h\2\2\u0160\u0161\7c\2\2\u0161\u0162\7n\2\2\u0162\u0163\7u\2\2"+
		"\u0163\u0165\7g\2\2\u0164\u015b\3\2\2\2\u0164\u015f\3\2\2\2\u0165X\3\2"+
		"\2\2\u0166\u016a\7$\2\2\u0167\u0169\13\2\2\2\u0168\u0167\3\2\2\2\u0169"+
		"\u016c\3\2\2\2\u016a\u016b\3\2\2\2\u016a\u0168\3\2\2\2\u016b\u016d\3\2"+
		"\2\2\u016c\u016a\3\2\2\2\u016d\u016e\7$\2\2\u016eZ\3\2\2\2\u016f\u0170"+
		"\7/\2\2\u0170\\\3\2\2\2\u0171\u0175\t\4\2\2\u0172\u0174\t\5\2\2\u0173"+
		"\u0172\3\2\2\2\u0174\u0177\3\2\2\2\u0175\u0173\3\2\2\2\u0175\u0176\3\2"+
		"\2\2\u0176^\3\2\2\2\u0177\u0175\3\2\2\2\u0178\u017a\t\5\2\2\u0179\u0178"+
		"\3\2\2\2\u017a\u017b\3\2\2\2\u017b\u0179\3\2\2\2\u017b\u017c\3\2\2\2\u017c"+
		"\u017e\3\2\2\2\u017d\u017f\7\60\2\2\u017e\u017d\3\2\2\2\u017e\u017f\3"+
		"\2\2\2\u017f\u0183\3\2\2\2\u0180\u0182\t\5\2\2\u0181\u0180\3\2\2\2\u0182"+
		"\u0185\3\2\2\2\u0183\u0181\3\2\2\2\u0183\u0184\3\2\2\2\u0184`\3\2\2\2"+
		"\u0185\u0183\3\2\2\2\u0186\u0187\7r\2\2\u0187\u0188\7t\2\2\u0188\u0189"+
		"\7k\2\2\u0189\u018a\7p\2\2\u018a\u018b\7v\2\2\u018bb\3\2\2\2\u018c\u018e"+
		"\t\6\2\2\u018d\u018c\3\2\2\2\u018e\u018f\3\2\2\2\u018f\u018d\3\2\2\2\u018f"+
		"\u0190\3\2\2\2\u0190\u0191\3\2\2\2\u0191\u0192\b\62\2\2\u0192d\3\2\2\2"+
		"\u0193\u0194\t\7\2\2\u0194\u0195\3\2\2\2\u0195\u0196\b\63\2\2\u0196f\3"+
		"\2\2\2\u0197\u0198\7\61\2\2\u0198\u0199\7,\2\2\u0199\u019d\3\2\2\2\u019a"+
		"\u019c\13\2\2\2\u019b\u019a\3\2\2\2\u019c\u019f\3\2\2\2\u019d\u019e\3"+
		"\2\2\2\u019d\u019b\3\2\2\2\u019e\u01a0\3\2\2\2\u019f\u019d\3\2\2\2\u01a0"+
		"\u01a1\7,\2\2\u01a1\u01a2\7\61\2\2\u01a2\u01a3\3\2\2\2\u01a3\u01a4\b\64"+
		"\2\2\u01a4h\3\2\2\2\u01a5\u01a6\7\61\2\2\u01a6\u01a7\7\61\2\2\u01a7\u01ab"+
		"\3\2\2\2\u01a8\u01aa\n\b\2\2\u01a9\u01a8\3\2\2\2\u01aa\u01ad\3\2\2\2\u01ab"+
		"\u01a9\3\2\2\2\u01ab\u01ac\3\2\2\2\u01ac\u01ae\3\2\2\2\u01ad\u01ab\3\2"+
		"\2\2\u01ae\u01af\b\65\2\2\u01afj\3\2\2\2\31\2\u00c6\u00ee\u00fd\u0111"+
		"\u0115\u011b\u011e\u013a\u0140\u0146\u014a\u0150\u0154\u0164\u016a\u0175"+
		"\u017b\u017e\u0183\u018f\u019d\u01ab\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}