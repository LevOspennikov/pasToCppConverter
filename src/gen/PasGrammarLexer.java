// Generated from C:/Users/ospen/IdeaProjects/Mt/pasToCplusplus/src\PasGrammar.g4 by ANTLR 4.7
package gen;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PasGrammarLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, NOT=3, AND=4, XOR=5, OR=6, DO=7, WHILE=8, IF=9, THEN=10, 
		FOR=11, SEMI=12, COLON=13, COMMA=14, DOT=15, LPAREN=16, RPAREN=17, EQUALITY=18, 
		ASSIGNMENT=19, PLUS=20, MINUS=21, MUL=22, DIV=23, PROGRAM=24, VAR=25, 
		BEGIN=26, END=27, CONST=28, BOOLEAN=29, CHAR=30, INTEGER=31, REAL=32, 
		DOUBLE=33, EXTENDED=34, STRING=35, READ=36, READLN=37, WRITE=38, WRITELN=39, 
		IDENTIFIER=40, NUMBER=41, WS=42, OLD_STYLE_COMMENT=43, COMMENT=44;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "NOT", "AND", "XOR", "OR", "DO", "WHILE", "IF", "THEN", 
		"FOR", "SEMI", "COLON", "COMMA", "DOT", "LPAREN", "RPAREN", "EQUALITY", 
		"ASSIGNMENT", "PLUS", "MINUS", "MUL", "DIV", "PROGRAM", "VAR", "BEGIN", 
		"END", "CONST", "BOOLEAN", "CHAR", "INTEGER", "REAL", "DOUBLE", "EXTENDED", 
		"STRING", "READ", "READLN", "WRITE", "WRITELN", "IDENTIFIER", "NUMBER", 
		"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", 
		"O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "WS", "OLD_STYLE_COMMENT", 
		"COMMENT"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'>'", "'<'", null, null, null, null, null, null, null, null, null, 
		"';'", "':'", "','", "'.'", "'('", "')'", "'='", "':='", "'+'", "'-'", 
		"'*'", "'/'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, "NOT", "AND", "XOR", "OR", "DO", "WHILE", "IF", "THEN", 
		"FOR", "SEMI", "COLON", "COMMA", "DOT", "LPAREN", "RPAREN", "EQUALITY", 
		"ASSIGNMENT", "PLUS", "MINUS", "MUL", "DIV", "PROGRAM", "VAR", "BEGIN", 
		"END", "CONST", "BOOLEAN", "CHAR", "INTEGER", "REAL", "DOUBLE", "EXTENDED", 
		"STRING", "READ", "READLN", "WRITE", "WRITELN", "IDENTIFIER", "NUMBER", 
		"WS", "OLD_STYLE_COMMENT", "COMMENT"
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


	public PasGrammarLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "PasGrammar.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2.\u0197\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\3\2\3\2\3"+
		"\3\3\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\b"+
		"\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13"+
		"\3\f\3\f\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22"+
		"\3\22\3\23\3\23\3\24\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35"+
		"\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3 \3"+
		" \3 \3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3#\3#\3"+
		"#\3#\3#\3#\3#\3#\3#\3$\3$\3$\3$\3$\3$\3$\3%\3%\3%\3%\3%\3&\3&\3&\3&\3"+
		"&\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3(\3(\3(\3(\3)\3)\7)\u013a"+
		"\n)\f)\16)\u013d\13)\3*\6*\u0140\n*\r*\16*\u0141\3+\3+\3,\3,\3-\3-\3."+
		"\3.\3/\3/\3\60\3\60\3\61\3\61\3\62\3\62\3\63\3\63\3\64\3\64\3\65\3\65"+
		"\3\66\3\66\3\67\3\67\38\38\39\39\3:\3:\3;\3;\3<\3<\3=\3=\3>\3>\3?\3?\3"+
		"@\3@\3A\3A\3B\3B\3C\3C\3D\3D\3E\6E\u0179\nE\rE\16E\u017a\3E\3E\3F\3F\3"+
		"F\3F\7F\u0183\nF\fF\16F\u0186\13F\3F\3F\3F\3F\3F\3G\3G\7G\u018f\nG\fG"+
		"\16G\u0192\13G\3G\3G\3G\3G\4\u0184\u0190\2H\3\3\5\4\7\5\t\6\13\7\r\b\17"+
		"\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+"+
		"\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+"+
		"U\2W\2Y\2[\2]\2_\2a\2c\2e\2g\2i\2k\2m\2o\2q\2s\2u\2w\2y\2{\2}\2\177\2"+
		"\u0081\2\u0083\2\u0085\2\u0087\2\u0089,\u008b-\u008d.\3\2\37\4\2C\\c|"+
		"\6\2\62;C\\aac|\4\2CCcc\4\2DDdd\4\2EEee\4\2FFff\4\2GGgg\4\2HHhh\4\2II"+
		"ii\4\2JJjj\4\2KKkk\4\2LLll\4\2MMmm\4\2NNnn\4\2OOoo\4\2PPpp\4\2QQqq\4\2"+
		"RRrr\4\2SSss\4\2TTtt\4\2UUuu\4\2VVvv\4\2WWww\4\2XXxx\4\2YYyy\4\2ZZzz\4"+
		"\2[[{{\4\2\\\\||\5\2\13\f\17\17\"\"\2\u0181\2\3\3\2\2\2\2\5\3\2\2\2\2"+
		"\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2"+
		"\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2"+
		"\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2"+
		"\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2"+
		"\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2"+
		"\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2"+
		"M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2\u0089\3\2\2\2\2\u008b\3\2"+
		"\2\2\2\u008d\3\2\2\2\3\u008f\3\2\2\2\5\u0091\3\2\2\2\7\u0093\3\2\2\2\t"+
		"\u0097\3\2\2\2\13\u009b\3\2\2\2\r\u009f\3\2\2\2\17\u00a2\3\2\2\2\21\u00a5"+
		"\3\2\2\2\23\u00ab\3\2\2\2\25\u00ae\3\2\2\2\27\u00b3\3\2\2\2\31\u00b7\3"+
		"\2\2\2\33\u00b9\3\2\2\2\35\u00bb\3\2\2\2\37\u00bd\3\2\2\2!\u00bf\3\2\2"+
		"\2#\u00c1\3\2\2\2%\u00c3\3\2\2\2\'\u00c5\3\2\2\2)\u00c8\3\2\2\2+\u00ca"+
		"\3\2\2\2-\u00cc\3\2\2\2/\u00ce\3\2\2\2\61\u00d0\3\2\2\2\63\u00d8\3\2\2"+
		"\2\65\u00dc\3\2\2\2\67\u00e2\3\2\2\29\u00e6\3\2\2\2;\u00ec\3\2\2\2=\u00f4"+
		"\3\2\2\2?\u00f9\3\2\2\2A\u0101\3\2\2\2C\u0106\3\2\2\2E\u010d\3\2\2\2G"+
		"\u0116\3\2\2\2I\u011d\3\2\2\2K\u0122\3\2\2\2M\u0129\3\2\2\2O\u012f\3\2"+
		"\2\2Q\u0137\3\2\2\2S\u013f\3\2\2\2U\u0143\3\2\2\2W\u0145\3\2\2\2Y\u0147"+
		"\3\2\2\2[\u0149\3\2\2\2]\u014b\3\2\2\2_\u014d\3\2\2\2a\u014f\3\2\2\2c"+
		"\u0151\3\2\2\2e\u0153\3\2\2\2g\u0155\3\2\2\2i\u0157\3\2\2\2k\u0159\3\2"+
		"\2\2m\u015b\3\2\2\2o\u015d\3\2\2\2q\u015f\3\2\2\2s\u0161\3\2\2\2u\u0163"+
		"\3\2\2\2w\u0165\3\2\2\2y\u0167\3\2\2\2{\u0169\3\2\2\2}\u016b\3\2\2\2\177"+
		"\u016d\3\2\2\2\u0081\u016f\3\2\2\2\u0083\u0171\3\2\2\2\u0085\u0173\3\2"+
		"\2\2\u0087\u0175\3\2\2\2\u0089\u0178\3\2\2\2\u008b\u017e\3\2\2\2\u008d"+
		"\u018c\3\2\2\2\u008f\u0090\7@\2\2\u0090\4\3\2\2\2\u0091\u0092\7>\2\2\u0092"+
		"\6\3\2\2\2\u0093\u0094\5o8\2\u0094\u0095\5q9\2\u0095\u0096\5{>\2\u0096"+
		"\b\3\2\2\2\u0097\u0098\5U+\2\u0098\u0099\5o8\2\u0099\u009a\5[.\2\u009a"+
		"\n\3\2\2\2\u009b\u009c\5\u0083B\2\u009c\u009d\5q9\2\u009d\u009e\5w<\2"+
		"\u009e\f\3\2\2\2\u009f\u00a0\5q9\2\u00a0\u00a1\5w<\2\u00a1\16\3\2\2\2"+
		"\u00a2\u00a3\5[.\2\u00a3\u00a4\5q9\2\u00a4\20\3\2\2\2\u00a5\u00a6\5\u0081"+
		"A\2\u00a6\u00a7\5c\62\2\u00a7\u00a8\5e\63\2\u00a8\u00a9\5k\66\2\u00a9"+
		"\u00aa\5]/\2\u00aa\22\3\2\2\2\u00ab\u00ac\5e\63\2\u00ac\u00ad\5_\60\2"+
		"\u00ad\24\3\2\2\2\u00ae\u00af\5{>\2\u00af\u00b0\5c\62\2\u00b0\u00b1\5"+
		"]/\2\u00b1\u00b2\5o8\2\u00b2\26\3\2\2\2\u00b3\u00b4\5_\60\2\u00b4\u00b5"+
		"\5q9\2\u00b5\u00b6\5w<\2\u00b6\30\3\2\2\2\u00b7\u00b8\7=\2\2\u00b8\32"+
		"\3\2\2\2\u00b9\u00ba\7<\2\2\u00ba\34\3\2\2\2\u00bb\u00bc\7.\2\2\u00bc"+
		"\36\3\2\2\2\u00bd\u00be\7\60\2\2\u00be \3\2\2\2\u00bf\u00c0\7*\2\2\u00c0"+
		"\"\3\2\2\2\u00c1\u00c2\7+\2\2\u00c2$\3\2\2\2\u00c3\u00c4\7?\2\2\u00c4"+
		"&\3\2\2\2\u00c5\u00c6\7<\2\2\u00c6\u00c7\7?\2\2\u00c7(\3\2\2\2\u00c8\u00c9"+
		"\7-\2\2\u00c9*\3\2\2\2\u00ca\u00cb\7/\2\2\u00cb,\3\2\2\2\u00cc\u00cd\7"+
		",\2\2\u00cd.\3\2\2\2\u00ce\u00cf\7\61\2\2\u00cf\60\3\2\2\2\u00d0\u00d1"+
		"\5s:\2\u00d1\u00d2\5w<\2\u00d2\u00d3\5q9\2\u00d3\u00d4\5a\61\2\u00d4\u00d5"+
		"\5w<\2\u00d5\u00d6\5U+\2\u00d6\u00d7\5m\67\2\u00d7\62\3\2\2\2\u00d8\u00d9"+
		"\5\177@\2\u00d9\u00da\5U+\2\u00da\u00db\5w<\2\u00db\64\3\2\2\2\u00dc\u00dd"+
		"\5W,\2\u00dd\u00de\5]/\2\u00de\u00df\5a\61\2\u00df\u00e0\5e\63\2\u00e0"+
		"\u00e1\5o8\2\u00e1\66\3\2\2\2\u00e2\u00e3\5]/\2\u00e3\u00e4\5o8\2\u00e4"+
		"\u00e5\5[.\2\u00e58\3\2\2\2\u00e6\u00e7\5Y-\2\u00e7\u00e8\5q9\2\u00e8"+
		"\u00e9\5o8\2\u00e9\u00ea\5y=\2\u00ea\u00eb\5{>\2\u00eb:\3\2\2\2\u00ec"+
		"\u00ed\5W,\2\u00ed\u00ee\5q9\2\u00ee\u00ef\5q9\2\u00ef\u00f0\5k\66\2\u00f0"+
		"\u00f1\5]/\2\u00f1\u00f2\5U+\2\u00f2\u00f3\5o8\2\u00f3<\3\2\2\2\u00f4"+
		"\u00f5\5Y-\2\u00f5\u00f6\5c\62\2\u00f6\u00f7\5U+\2\u00f7\u00f8\5w<\2\u00f8"+
		">\3\2\2\2\u00f9\u00fa\5e\63\2\u00fa\u00fb\5o8\2\u00fb\u00fc\5{>\2\u00fc"+
		"\u00fd\5]/\2\u00fd\u00fe\5a\61\2\u00fe\u00ff\5]/\2\u00ff\u0100\5w<\2\u0100"+
		"@\3\2\2\2\u0101\u0102\5w<\2\u0102\u0103\5]/\2\u0103\u0104\5U+\2\u0104"+
		"\u0105\5k\66\2\u0105B\3\2\2\2\u0106\u0107\5[.\2\u0107\u0108\5q9\2\u0108"+
		"\u0109\5}?\2\u0109\u010a\5W,\2\u010a\u010b\5k\66\2\u010b\u010c\5]/\2\u010c"+
		"D\3\2\2\2\u010d\u010e\5]/\2\u010e\u010f\5\u0083B\2\u010f\u0110\5{>\2\u0110"+
		"\u0111\5]/\2\u0111\u0112\5o8\2\u0112\u0113\5[.\2\u0113\u0114\5]/\2\u0114"+
		"\u0115\5[.\2\u0115F\3\2\2\2\u0116\u0117\5y=\2\u0117\u0118\5{>\2\u0118"+
		"\u0119\5w<\2\u0119\u011a\5e\63\2\u011a\u011b\5o8\2\u011b\u011c\5a\61\2"+
		"\u011cH\3\2\2\2\u011d\u011e\5w<\2\u011e\u011f\5]/\2\u011f\u0120\5U+\2"+
		"\u0120\u0121\5[.\2\u0121J\3\2\2\2\u0122\u0123\5w<\2\u0123\u0124\5]/\2"+
		"\u0124\u0125\5U+\2\u0125\u0126\5[.\2\u0126\u0127\5k\66\2\u0127\u0128\5"+
		"o8\2\u0128L\3\2\2\2\u0129\u012a\5\u0081A\2\u012a\u012b\5w<\2\u012b\u012c"+
		"\5e\63\2\u012c\u012d\5{>\2\u012d\u012e\5]/\2\u012eN\3\2\2\2\u012f\u0130"+
		"\5\u0081A\2\u0130\u0131\5w<\2\u0131\u0132\5e\63\2\u0132\u0133\5{>\2\u0133"+
		"\u0134\5]/\2\u0134\u0135\5k\66\2\u0135\u0136\5o8\2\u0136P\3\2\2\2\u0137"+
		"\u013b\t\2\2\2\u0138\u013a\t\3\2\2\u0139\u0138\3\2\2\2\u013a\u013d\3\2"+
		"\2\2\u013b\u0139\3\2\2\2\u013b\u013c\3\2\2\2\u013cR\3\2\2\2\u013d\u013b"+
		"\3\2\2\2\u013e\u0140\4\62;\2\u013f\u013e\3\2\2\2\u0140\u0141\3\2\2\2\u0141"+
		"\u013f\3\2\2\2\u0141\u0142\3\2\2\2\u0142T\3\2\2\2\u0143\u0144\t\4\2\2"+
		"\u0144V\3\2\2\2\u0145\u0146\t\5\2\2\u0146X\3\2\2\2\u0147\u0148\t\6\2\2"+
		"\u0148Z\3\2\2\2\u0149\u014a\t\7\2\2\u014a\\\3\2\2\2\u014b\u014c\t\b\2"+
		"\2\u014c^\3\2\2\2\u014d\u014e\t\t\2\2\u014e`\3\2\2\2\u014f\u0150\t\n\2"+
		"\2\u0150b\3\2\2\2\u0151\u0152\t\13\2\2\u0152d\3\2\2\2\u0153\u0154\t\f"+
		"\2\2\u0154f\3\2\2\2\u0155\u0156\t\r\2\2\u0156h\3\2\2\2\u0157\u0158\t\16"+
		"\2\2\u0158j\3\2\2\2\u0159\u015a\t\17\2\2\u015al\3\2\2\2\u015b\u015c\t"+
		"\20\2\2\u015cn\3\2\2\2\u015d\u015e\t\21\2\2\u015ep\3\2\2\2\u015f\u0160"+
		"\t\22\2\2\u0160r\3\2\2\2\u0161\u0162\t\23\2\2\u0162t\3\2\2\2\u0163\u0164"+
		"\t\24\2\2\u0164v\3\2\2\2\u0165\u0166\t\25\2\2\u0166x\3\2\2\2\u0167\u0168"+
		"\t\26\2\2\u0168z\3\2\2\2\u0169\u016a\t\27\2\2\u016a|\3\2\2\2\u016b\u016c"+
		"\t\30\2\2\u016c~\3\2\2\2\u016d\u016e\t\31\2\2\u016e\u0080\3\2\2\2\u016f"+
		"\u0170\t\32\2\2\u0170\u0082\3\2\2\2\u0171\u0172\t\33\2\2\u0172\u0084\3"+
		"\2\2\2\u0173\u0174\t\34\2\2\u0174\u0086\3\2\2\2\u0175\u0176\t\35\2\2\u0176"+
		"\u0088\3\2\2\2\u0177\u0179\t\36\2\2\u0178\u0177\3\2\2\2\u0179\u017a\3"+
		"\2\2\2\u017a\u0178\3\2\2\2\u017a\u017b\3\2\2\2\u017b\u017c\3\2\2\2\u017c"+
		"\u017d\bE\2\2\u017d\u008a\3\2\2\2\u017e\u017f\7*\2\2\u017f\u0180\7,\2"+
		"\2\u0180\u0184\3\2\2\2\u0181\u0183\13\2\2\2\u0182\u0181\3\2\2\2\u0183"+
		"\u0186\3\2\2\2\u0184\u0185\3\2\2\2\u0184\u0182\3\2\2\2\u0185\u0187\3\2"+
		"\2\2\u0186\u0184\3\2\2\2\u0187\u0188\7,\2\2\u0188\u0189\7+\2\2\u0189\u018a"+
		"\3\2\2\2\u018a\u018b\bF\2\2\u018b\u008c\3\2\2\2\u018c\u0190\7}\2\2\u018d"+
		"\u018f\13\2\2\2\u018e\u018d\3\2\2\2\u018f\u0192\3\2\2\2\u0190\u0191\3"+
		"\2\2\2\u0190\u018e\3\2\2\2\u0191\u0193\3\2\2\2\u0192\u0190\3\2\2\2\u0193"+
		"\u0194\7\177\2\2\u0194\u0195\3\2\2\2\u0195\u0196\bG\2\2\u0196\u008e\3"+
		"\2\2\2\b\2\u013b\u0141\u017a\u0184\u0190\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}