// Generated from ourLang.g4 by ANTLR 4.5
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ourLangParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, IMPORT=24, 
		IF=25, ELSE=26, WHILE=27, FOR=28, MATRIX=29, ROWVECTOR=30, COLVECTOR=31, 
		INT=32, INTNUM=33, FLOAT=34, FLOATNUM=35, BOOL=36, BOOLVAL=37, STRING=38, 
		SIGN=39, ID=40, LIBRARY=41, WS=42, NL=43, COMMENT=44, LINE_COMMENT=45;
	public static final int
		RULE_topLevel = 0, RULE_statement = 1, RULE_importing = 2, RULE_controlblock = 3, 
		RULE_loop = 4, RULE_condition = 5, RULE_functiondeclaration = 6, RULE_parameterlist = 7, 
		RULE_functioncall = 8, RULE_argumentlist = 9, RULE_expression = 10, RULE_addexpression = 11, 
		RULE_multiexpression = 12, RULE_primary = 13, RULE_assignment = 14, RULE_declaration = 15, 
		RULE_value = 16, RULE_collectionEntrance = 17, RULE_valueList = 18, RULE_constantList = 19, 
		RULE_entranceCoordinate = 20, RULE_datatype = 21, RULE_collectiontype = 22, 
		RULE_infixBinaryOperator = 23, RULE_postUnaryOperator = 24, RULE_conditionalOperator = 25, 
		RULE_constant = 26;
	public static final String[] ruleNames = {
		"topLevel", "statement", "importing", "controlblock", "loop", "condition", 
		"functiondeclaration", "parameterlist", "functioncall", "argumentlist", 
		"expression", "addexpression", "multiexpression", "primary", "assignment", 
		"declaration", "value", "collectionEntrance", "valueList", "constantList", 
		"entranceCoordinate", "datatype", "collectiontype", "infixBinaryOperator", 
		"postUnaryOperator", "conditionalOperator", "constant"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "';'", "'<'", "'>'", "'('", "')'", "'{'", "'}'", "'void'", "'return'", 
		"','", "'+'", "'*'", "'/'", "'='", "'['", "']'", "'%'", "'++'", "'--'", 
		"'=='", "'!='", "'<='", "'>='", null, "'if'", "'else'", "'while'", "'for'", 
		"'matrix'", null, null, "'int'", null, "'float'", null, "'bool'", null, 
		null, "'-'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		"IMPORT", "IF", "ELSE", "WHILE", "FOR", "MATRIX", "ROWVECTOR", "COLVECTOR", 
		"INT", "INTNUM", "FLOAT", "FLOATNUM", "BOOL", "BOOLVAL", "STRING", "SIGN", 
		"ID", "LIBRARY", "WS", "NL", "COMMENT", "LINE_COMMENT"
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
	public String getGrammarFileName() { return "ourLang.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ourLangParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class TopLevelContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(ourLangParser.EOF, 0); }
		public List<ImportingContext> importing() {
			return getRuleContexts(ImportingContext.class);
		}
		public ImportingContext importing(int i) {
			return getRuleContext(ImportingContext.class,i);
		}
		public List<FunctiondeclarationContext> functiondeclaration() {
			return getRuleContexts(FunctiondeclarationContext.class);
		}
		public FunctiondeclarationContext functiondeclaration(int i) {
			return getRuleContext(FunctiondeclarationContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TopLevelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_topLevel; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ourLangListener ) ((ourLangListener)listener).enterTopLevel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ourLangListener ) ((ourLangListener)listener).exitTopLevel(this);
		}
	}

	public final TopLevelContext topLevel() throws RecognitionException {
		TopLevelContext _localctx = new TopLevelContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_topLevel);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(57);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IMPORT) {
				{
				{
				setState(54);
				importing();
				}
				}
				setState(59);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(63);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(60);
					functiondeclaration();
					}
					} 
				}
				setState(65);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			setState(69);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__14) | (1L << IF) | (1L << WHILE) | (1L << FOR) | (1L << MATRIX) | (1L << ROWVECTOR) | (1L << COLVECTOR) | (1L << INT) | (1L << INTNUM) | (1L << FLOAT) | (1L << FLOATNUM) | (1L << BOOL) | (1L << BOOLVAL) | (1L << SIGN) | (1L << ID))) != 0)) {
				{
				{
				setState(66);
				statement();
				}
				}
				setState(71);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(72);
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

	public static class StatementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public FunctioncallContext functioncall() {
			return getRuleContext(FunctioncallContext.class,0);
		}
		public ControlblockContext controlblock() {
			return getRuleContext(ControlblockContext.class,0);
		}
		public LoopContext loop() {
			return getRuleContext(LoopContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ourLangListener ) ((ourLangListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ourLangListener ) ((ourLangListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			setState(88);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(74);
				expression();
				setState(75);
				match(T__0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(77);
				assignment();
				setState(78);
				match(T__0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(80);
				declaration();
				setState(81);
				match(T__0);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(83);
				functioncall();
				setState(84);
				match(T__0);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(86);
				controlblock();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(87);
				loop();
				}
				break;
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

	public static class ImportingContext extends ParserRuleContext {
		public TerminalNode IMPORT() { return getToken(ourLangParser.IMPORT, 0); }
		public TerminalNode LIBRARY() { return getToken(ourLangParser.LIBRARY, 0); }
		public ImportingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importing; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ourLangListener ) ((ourLangListener)listener).enterImporting(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ourLangListener ) ((ourLangListener)listener).exitImporting(this);
		}
	}

	public final ImportingContext importing() throws RecognitionException {
		ImportingContext _localctx = new ImportingContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_importing);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(90);
			match(IMPORT);
			setState(91);
			match(T__1);
			setState(92);
			match(LIBRARY);
			setState(93);
			match(T__2);
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

	public static class ControlblockContext extends ParserRuleContext {
		public List<TerminalNode> IF() { return getTokens(ourLangParser.IF); }
		public TerminalNode IF(int i) {
			return getToken(ourLangParser.IF, i);
		}
		public List<ConditionContext> condition() {
			return getRuleContexts(ConditionContext.class);
		}
		public ConditionContext condition(int i) {
			return getRuleContext(ConditionContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<TerminalNode> ELSE() { return getTokens(ourLangParser.ELSE); }
		public TerminalNode ELSE(int i) {
			return getToken(ourLangParser.ELSE, i);
		}
		public ControlblockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_controlblock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ourLangListener ) ((ourLangListener)listener).enterControlblock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ourLangListener ) ((ourLangListener)listener).exitControlblock(this);
		}
	}

	public final ControlblockContext controlblock() throws RecognitionException {
		ControlblockContext _localctx = new ControlblockContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_controlblock);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(95);
			match(IF);
			setState(96);
			match(T__3);
			setState(97);
			condition();
			setState(98);
			match(T__4);
			setState(99);
			match(T__5);
			setState(103);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__14) | (1L << IF) | (1L << WHILE) | (1L << FOR) | (1L << MATRIX) | (1L << ROWVECTOR) | (1L << COLVECTOR) | (1L << INT) | (1L << INTNUM) | (1L << FLOAT) | (1L << FLOATNUM) | (1L << BOOL) | (1L << BOOLVAL) | (1L << SIGN) | (1L << ID))) != 0)) {
				{
				{
				setState(100);
				statement();
				}
				}
				setState(105);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(106);
			match(T__6);
			setState(123);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(107);
					match(ELSE);
					setState(108);
					match(IF);
					setState(109);
					match(T__3);
					setState(110);
					condition();
					setState(111);
					match(T__4);
					setState(112);
					match(T__5);
					setState(116);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__14) | (1L << IF) | (1L << WHILE) | (1L << FOR) | (1L << MATRIX) | (1L << ROWVECTOR) | (1L << COLVECTOR) | (1L << INT) | (1L << INTNUM) | (1L << FLOAT) | (1L << FLOATNUM) | (1L << BOOL) | (1L << BOOLVAL) | (1L << SIGN) | (1L << ID))) != 0)) {
						{
						{
						setState(113);
						statement();
						}
						}
						setState(118);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(119);
					match(T__6);
					}
					} 
				}
				setState(125);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			}
			setState(135);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(126);
				match(ELSE);
				setState(127);
				match(T__5);
				setState(131);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__14) | (1L << IF) | (1L << WHILE) | (1L << FOR) | (1L << MATRIX) | (1L << ROWVECTOR) | (1L << COLVECTOR) | (1L << INT) | (1L << INTNUM) | (1L << FLOAT) | (1L << FLOATNUM) | (1L << BOOL) | (1L << BOOLVAL) | (1L << SIGN) | (1L << ID))) != 0)) {
					{
					{
					setState(128);
					statement();
					}
					}
					setState(133);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(134);
				match(T__6);
				}
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

	public static class LoopContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(ourLangParser.WHILE, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode BOOLVAL() { return getToken(ourLangParser.BOOLVAL, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode FOR() { return getToken(ourLangParser.FOR, 0); }
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public DatatypeContext datatype() {
			return getRuleContext(DatatypeContext.class,0);
		}
		public LoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ourLangListener ) ((ourLangListener)listener).enterLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ourLangListener ) ((ourLangListener)listener).exitLoop(this);
		}
	}

	public final LoopContext loop() throws RecognitionException {
		LoopContext _localctx = new LoopContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_loop);
		int _la;
		try {
			setState(172);
			switch (_input.LA(1)) {
			case WHILE:
				enterOuterAlt(_localctx, 1);
				{
				setState(137);
				match(WHILE);
				setState(138);
				match(T__3);
				setState(141);
				switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
				case 1:
					{
					setState(139);
					condition();
					}
					break;
				case 2:
					{
					setState(140);
					match(BOOLVAL);
					}
					break;
				}
				setState(143);
				match(T__4);
				setState(144);
				match(T__5);
				setState(148);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__14) | (1L << IF) | (1L << WHILE) | (1L << FOR) | (1L << MATRIX) | (1L << ROWVECTOR) | (1L << COLVECTOR) | (1L << INT) | (1L << INTNUM) | (1L << FLOAT) | (1L << FLOATNUM) | (1L << BOOL) | (1L << BOOLVAL) | (1L << SIGN) | (1L << ID))) != 0)) {
					{
					{
					setState(145);
					statement();
					}
					}
					setState(150);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(151);
				match(T__6);
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 2);
				{
				setState(152);
				match(FOR);
				setState(153);
				match(T__3);
				setState(155);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << FLOAT) | (1L << BOOL))) != 0)) {
					{
					setState(154);
					datatype();
					}
				}

				setState(157);
				assignment();
				setState(158);
				match(T__0);
				setState(159);
				condition();
				setState(160);
				match(T__0);
				setState(161);
				expression();
				setState(162);
				match(T__4);
				setState(163);
				match(T__5);
				setState(167);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__14) | (1L << IF) | (1L << WHILE) | (1L << FOR) | (1L << MATRIX) | (1L << ROWVECTOR) | (1L << COLVECTOR) | (1L << INT) | (1L << INTNUM) | (1L << FLOAT) | (1L << FLOATNUM) | (1L << BOOL) | (1L << BOOLVAL) | (1L << SIGN) | (1L << ID))) != 0)) {
					{
					{
					setState(164);
					statement();
					}
					}
					setState(169);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(170);
				match(T__6);
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

	public static class ConditionContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ConditionalOperatorContext conditionalOperator() {
			return getRuleContext(ConditionalOperatorContext.class,0);
		}
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ourLangListener ) ((ourLangListener)listener).enterCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ourLangListener ) ((ourLangListener)listener).exitCondition(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_condition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(174);
			expression();
			setState(175);
			conditionalOperator();
			setState(176);
			expression();
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

	public static class FunctiondeclarationContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(ourLangParser.ID, 0); }
		public ParameterlistContext parameterlist() {
			return getRuleContext(ParameterlistContext.class,0);
		}
		public DatatypeContext datatype() {
			return getRuleContext(DatatypeContext.class,0);
		}
		public CollectiontypeContext collectiontype() {
			return getRuleContext(CollectiontypeContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public FunctiondeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functiondeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ourLangListener ) ((ourLangListener)listener).enterFunctiondeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ourLangListener ) ((ourLangListener)listener).exitFunctiondeclaration(this);
		}
	}

	public final FunctiondeclarationContext functiondeclaration() throws RecognitionException {
		FunctiondeclarationContext _localctx = new FunctiondeclarationContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_functiondeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(185);
			switch (_input.LA(1)) {
			case INT:
			case FLOAT:
			case BOOL:
				{
				setState(178);
				datatype();
				}
				break;
			case MATRIX:
			case ROWVECTOR:
			case COLVECTOR:
				{
				setState(179);
				collectiontype();
				setState(180);
				match(T__1);
				setState(181);
				datatype();
				setState(182);
				match(T__2);
				}
				break;
			case T__7:
				{
				setState(184);
				match(T__7);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(187);
			match(ID);
			setState(188);
			match(T__3);
			setState(189);
			parameterlist();
			setState(190);
			match(T__4);
			setState(191);
			match(T__5);
			setState(195);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__14) | (1L << IF) | (1L << WHILE) | (1L << FOR) | (1L << MATRIX) | (1L << ROWVECTOR) | (1L << COLVECTOR) | (1L << INT) | (1L << INTNUM) | (1L << FLOAT) | (1L << FLOATNUM) | (1L << BOOL) | (1L << BOOLVAL) | (1L << SIGN) | (1L << ID))) != 0)) {
				{
				{
				setState(192);
				statement();
				}
				}
				setState(197);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(202);
			_la = _input.LA(1);
			if (_la==T__8) {
				{
				setState(198);
				match(T__8);
				setState(199);
				expression();
				setState(200);
				match(T__0);
				}
			}

			setState(204);
			match(T__6);
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

	public static class ParameterlistContext extends ParserRuleContext {
		public List<DatatypeContext> datatype() {
			return getRuleContexts(DatatypeContext.class);
		}
		public DatatypeContext datatype(int i) {
			return getRuleContext(DatatypeContext.class,i);
		}
		public List<TerminalNode> ID() { return getTokens(ourLangParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(ourLangParser.ID, i);
		}
		public List<TerminalNode> STRING() { return getTokens(ourLangParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(ourLangParser.STRING, i);
		}
		public List<CollectiontypeContext> collectiontype() {
			return getRuleContexts(CollectiontypeContext.class);
		}
		public CollectiontypeContext collectiontype(int i) {
			return getRuleContext(CollectiontypeContext.class,i);
		}
		public ParameterlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterlist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ourLangListener ) ((ourLangListener)listener).enterParameterlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ourLangListener ) ((ourLangListener)listener).exitParameterlist(this);
		}
	}

	public final ParameterlistContext parameterlist() throws RecognitionException {
		ParameterlistContext _localctx = new ParameterlistContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_parameterlist);
		int _la;
		try {
			setState(239);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(236);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MATRIX) | (1L << ROWVECTOR) | (1L << COLVECTOR) | (1L << INT) | (1L << FLOAT) | (1L << BOOL) | (1L << STRING))) != 0)) {
					{
					setState(216);
					switch (_input.LA(1)) {
					case INT:
					case FLOAT:
					case BOOL:
						{
						setState(206);
						datatype();
						setState(207);
						match(ID);
						}
						break;
					case STRING:
						{
						setState(209);
						match(STRING);
						}
						break;
					case MATRIX:
					case ROWVECTOR:
					case COLVECTOR:
						{
						setState(210);
						collectiontype();
						setState(211);
						match(T__1);
						setState(212);
						datatype();
						setState(213);
						match(T__2);
						setState(214);
						match(ID);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(233);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__9) {
						{
						{
						setState(218);
						match(T__9);
						setState(229);
						switch (_input.LA(1)) {
						case INT:
						case FLOAT:
						case BOOL:
							{
							setState(219);
							datatype();
							setState(220);
							match(ID);
							}
							break;
						case STRING:
							{
							setState(222);
							match(STRING);
							}
							break;
						case MATRIX:
						case ROWVECTOR:
						case COLVECTOR:
							{
							setState(223);
							collectiontype();
							setState(224);
							match(T__1);
							setState(225);
							datatype();
							setState(226);
							match(T__2);
							setState(227);
							match(ID);
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						}
						}
						setState(235);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
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

	public static class FunctioncallContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(ourLangParser.ID, 0); }
		public ArgumentlistContext argumentlist() {
			return getRuleContext(ArgumentlistContext.class,0);
		}
		public FunctioncallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functioncall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ourLangListener ) ((ourLangListener)listener).enterFunctioncall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ourLangListener ) ((ourLangListener)listener).exitFunctioncall(this);
		}
	}

	public final FunctioncallContext functioncall() throws RecognitionException {
		FunctioncallContext _localctx = new FunctioncallContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_functioncall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(241);
			match(ID);
			setState(242);
			match(T__3);
			setState(243);
			argumentlist();
			setState(244);
			match(T__4);
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

	public static class ArgumentlistContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode STRING() { return getToken(ourLangParser.STRING, 0); }
		public ArgumentlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argumentlist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ourLangListener ) ((ourLangListener)listener).enterArgumentlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ourLangListener ) ((ourLangListener)listener).exitArgumentlist(this);
		}
	}

	public final ArgumentlistContext argumentlist() throws RecognitionException {
		ArgumentlistContext _localctx = new ArgumentlistContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_argumentlist);
		int _la;
		try {
			setState(256);
			switch (_input.LA(1)) {
			case T__3:
			case T__14:
			case INTNUM:
			case FLOATNUM:
			case BOOLVAL:
			case SIGN:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(246);
				expression();
				setState(251);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__9) {
					{
					{
					setState(247);
					match(T__9);
					setState(248);
					expression();
					}
					}
					setState(253);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(254);
				match(STRING);
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 3);
				{
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

	public static class ExpressionContext extends ParserRuleContext {
		public AddexpressionContext addexpression() {
			return getRuleContext(AddexpressionContext.class,0);
		}
		public TerminalNode ID() { return getToken(ourLangParser.ID, 0); }
		public PostUnaryOperatorContext postUnaryOperator() {
			return getRuleContext(PostUnaryOperatorContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ourLangListener ) ((ourLangListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ourLangListener ) ((ourLangListener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_expression);
		try {
			setState(261);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(258);
				addexpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(259);
				match(ID);
				setState(260);
				postUnaryOperator();
				}
				break;
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

	public static class AddexpressionContext extends ParserRuleContext {
		public List<MultiexpressionContext> multiexpression() {
			return getRuleContexts(MultiexpressionContext.class);
		}
		public MultiexpressionContext multiexpression(int i) {
			return getRuleContext(MultiexpressionContext.class,i);
		}
		public AddexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addexpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ourLangListener ) ((ourLangListener)listener).enterAddexpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ourLangListener ) ((ourLangListener)listener).exitAddexpression(this);
		}
	}

	public final AddexpressionContext addexpression() throws RecognitionException {
		AddexpressionContext _localctx = new AddexpressionContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_addexpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(263);
			multiexpression();
			setState(268);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__10 || _la==SIGN) {
				{
				{
				setState(264);
				_la = _input.LA(1);
				if ( !(_la==T__10 || _la==SIGN) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(265);
				multiexpression();
				}
				}
				setState(270);
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

	public static class MultiexpressionContext extends ParserRuleContext {
		public List<PrimaryContext> primary() {
			return getRuleContexts(PrimaryContext.class);
		}
		public PrimaryContext primary(int i) {
			return getRuleContext(PrimaryContext.class,i);
		}
		public MultiexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiexpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ourLangListener ) ((ourLangListener)listener).enterMultiexpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ourLangListener ) ((ourLangListener)listener).exitMultiexpression(this);
		}
	}

	public final MultiexpressionContext multiexpression() throws RecognitionException {
		MultiexpressionContext _localctx = new MultiexpressionContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_multiexpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(271);
			primary();
			setState(276);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__11 || _la==T__12) {
				{
				{
				setState(272);
				_la = _input.LA(1);
				if ( !(_la==T__11 || _la==T__12) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(273);
				primary();
				}
				}
				setState(278);
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

	public static class PrimaryContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public FunctioncallContext functioncall() {
			return getRuleContext(FunctioncallContext.class,0);
		}
		public PrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ourLangListener ) ((ourLangListener)listener).enterPrimary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ourLangListener ) ((ourLangListener)listener).exitPrimary(this);
		}
	}

	public final PrimaryContext primary() throws RecognitionException {
		PrimaryContext _localctx = new PrimaryContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_primary);
		try {
			setState(287);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(279);
				match(T__3);
				setState(280);
				expression();
				setState(281);
				match(T__4);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(283);
				value();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(284);
				match(SIGN);
				setState(285);
				primary();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(286);
				functioncall();
				}
				break;
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

	public static class AssignmentContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(ourLangParser.ID, 0); }
		public AddexpressionContext addexpression() {
			return getRuleContext(AddexpressionContext.class,0);
		}
		public FunctioncallContext functioncall() {
			return getRuleContext(FunctioncallContext.class,0);
		}
		public TerminalNode BOOLVAL() { return getToken(ourLangParser.BOOLVAL, 0); }
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ourLangListener ) ((ourLangListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ourLangListener ) ((ourLangListener)listener).exitAssignment(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_assignment);
		try {
			setState(298);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(289);
				match(ID);
				setState(290);
				match(T__13);
				setState(291);
				addexpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(292);
				match(ID);
				setState(293);
				match(T__13);
				setState(294);
				functioncall();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(295);
				match(ID);
				setState(296);
				match(T__13);
				setState(297);
				match(BOOLVAL);
				}
				break;
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

	public static class DeclarationContext extends ParserRuleContext {
		public DatatypeContext datatype() {
			return getRuleContext(DatatypeContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public CollectiontypeContext collectiontype() {
			return getRuleContext(CollectiontypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(ourLangParser.ID, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ourLangListener ) ((ourLangListener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ourLangListener ) ((ourLangListener)listener).exitDeclaration(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_declaration);
		try {
			setState(311);
			switch (_input.LA(1)) {
			case INT:
			case FLOAT:
			case BOOL:
				enterOuterAlt(_localctx, 1);
				{
				setState(300);
				datatype();
				setState(301);
				assignment();
				}
				break;
			case MATRIX:
			case ROWVECTOR:
			case COLVECTOR:
				enterOuterAlt(_localctx, 2);
				{
				setState(303);
				collectiontype();
				setState(304);
				match(T__1);
				setState(305);
				datatype();
				setState(306);
				match(T__2);
				setState(307);
				match(ID);
				setState(308);
				match(T__13);
				setState(309);
				expression();
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

	public static class ValueContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(ourLangParser.ID, 0); }
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public List<ValueListContext> valueList() {
			return getRuleContexts(ValueListContext.class);
		}
		public ValueListContext valueList(int i) {
			return getRuleContext(ValueListContext.class,i);
		}
		public FunctioncallContext functioncall() {
			return getRuleContext(FunctioncallContext.class,0);
		}
		public CollectionEntranceContext collectionEntrance() {
			return getRuleContext(CollectionEntranceContext.class,0);
		}
		public TerminalNode BOOLVAL() { return getToken(ourLangParser.BOOLVAL, 0); }
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ourLangListener ) ((ourLangListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ourLangListener ) ((ourLangListener)listener).exitValue(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_value);
		int _la;
		try {
			setState(329);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(313);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(314);
				constant();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(315);
				match(T__14);
				setState(316);
				valueList();
				setState(321);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__0) {
					{
					{
					setState(317);
					match(T__0);
					setState(318);
					valueList();
					}
					}
					setState(323);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(324);
				match(T__15);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(326);
				functioncall();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(327);
				collectionEntrance();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(328);
				match(BOOLVAL);
				}
				break;
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

	public static class CollectionEntranceContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(ourLangParser.ID, 0); }
		public EntranceCoordinateContext entranceCoordinate() {
			return getRuleContext(EntranceCoordinateContext.class,0);
		}
		public CollectionEntranceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_collectionEntrance; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ourLangListener ) ((ourLangListener)listener).enterCollectionEntrance(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ourLangListener ) ((ourLangListener)listener).exitCollectionEntrance(this);
		}
	}

	public final CollectionEntranceContext collectionEntrance() throws RecognitionException {
		CollectionEntranceContext _localctx = new CollectionEntranceContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_collectionEntrance);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(331);
			match(ID);
			setState(332);
			match(T__14);
			setState(333);
			entranceCoordinate();
			setState(334);
			match(T__15);
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

	public static class ValueListContext extends ParserRuleContext {
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public ValueListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valueList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ourLangListener ) ((ourLangListener)listener).enterValueList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ourLangListener ) ((ourLangListener)listener).exitValueList(this);
		}
	}

	public final ValueListContext valueList() throws RecognitionException {
		ValueListContext _localctx = new ValueListContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_valueList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(336);
			value();
			setState(341);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__9) {
				{
				{
				setState(337);
				match(T__9);
				setState(338);
				value();
				}
				}
				setState(343);
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

	public static class ConstantListContext extends ParserRuleContext {
		public List<ConstantContext> constant() {
			return getRuleContexts(ConstantContext.class);
		}
		public ConstantContext constant(int i) {
			return getRuleContext(ConstantContext.class,i);
		}
		public ConstantListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ourLangListener ) ((ourLangListener)listener).enterConstantList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ourLangListener ) ((ourLangListener)listener).exitConstantList(this);
		}
	}

	public final ConstantListContext constantList() throws RecognitionException {
		ConstantListContext _localctx = new ConstantListContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_constantList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(344);
			constant();
			setState(349);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__9) {
				{
				{
				setState(345);
				match(T__9);
				setState(346);
				constant();
				}
				}
				setState(351);
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

	public static class EntranceCoordinateContext extends ParserRuleContext {
		public List<TerminalNode> INTNUM() { return getTokens(ourLangParser.INTNUM); }
		public TerminalNode INTNUM(int i) {
			return getToken(ourLangParser.INTNUM, i);
		}
		public EntranceCoordinateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_entranceCoordinate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ourLangListener ) ((ourLangListener)listener).enterEntranceCoordinate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ourLangListener ) ((ourLangListener)listener).exitEntranceCoordinate(this);
		}
	}

	public final EntranceCoordinateContext entranceCoordinate() throws RecognitionException {
		EntranceCoordinateContext _localctx = new EntranceCoordinateContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_entranceCoordinate);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(352);
			match(INTNUM);
			setState(355);
			_la = _input.LA(1);
			if (_la==T__9) {
				{
				setState(353);
				match(T__9);
				setState(354);
				match(INTNUM);
				}
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

	public static class DatatypeContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(ourLangParser.INT, 0); }
		public TerminalNode FLOAT() { return getToken(ourLangParser.FLOAT, 0); }
		public TerminalNode BOOL() { return getToken(ourLangParser.BOOL, 0); }
		public DatatypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_datatype; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ourLangListener ) ((ourLangListener)listener).enterDatatype(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ourLangListener ) ((ourLangListener)listener).exitDatatype(this);
		}
	}

	public final DatatypeContext datatype() throws RecognitionException {
		DatatypeContext _localctx = new DatatypeContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_datatype);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(357);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << FLOAT) | (1L << BOOL))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
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

	public static class CollectiontypeContext extends ParserRuleContext {
		public TerminalNode MATRIX() { return getToken(ourLangParser.MATRIX, 0); }
		public TerminalNode ROWVECTOR() { return getToken(ourLangParser.ROWVECTOR, 0); }
		public TerminalNode COLVECTOR() { return getToken(ourLangParser.COLVECTOR, 0); }
		public CollectiontypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_collectiontype; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ourLangListener ) ((ourLangListener)listener).enterCollectiontype(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ourLangListener ) ((ourLangListener)listener).exitCollectiontype(this);
		}
	}

	public final CollectiontypeContext collectiontype() throws RecognitionException {
		CollectiontypeContext _localctx = new CollectiontypeContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_collectiontype);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(359);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MATRIX) | (1L << ROWVECTOR) | (1L << COLVECTOR))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
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

	public static class InfixBinaryOperatorContext extends ParserRuleContext {
		public InfixBinaryOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_infixBinaryOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ourLangListener ) ((ourLangListener)listener).enterInfixBinaryOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ourLangListener ) ((ourLangListener)listener).exitInfixBinaryOperator(this);
		}
	}

	public final InfixBinaryOperatorContext infixBinaryOperator() throws RecognitionException {
		InfixBinaryOperatorContext _localctx = new InfixBinaryOperatorContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_infixBinaryOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(361);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__16) | (1L << SIGN))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
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

	public static class PostUnaryOperatorContext extends ParserRuleContext {
		public PostUnaryOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postUnaryOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ourLangListener ) ((ourLangListener)listener).enterPostUnaryOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ourLangListener ) ((ourLangListener)listener).exitPostUnaryOperator(this);
		}
	}

	public final PostUnaryOperatorContext postUnaryOperator() throws RecognitionException {
		PostUnaryOperatorContext _localctx = new PostUnaryOperatorContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_postUnaryOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(363);
			_la = _input.LA(1);
			if ( !(_la==T__17 || _la==T__18) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
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

	public static class ConditionalOperatorContext extends ParserRuleContext {
		public ConditionalOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionalOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ourLangListener ) ((ourLangListener)listener).enterConditionalOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ourLangListener ) ((ourLangListener)listener).exitConditionalOperator(this);
		}
	}

	public final ConditionalOperatorContext conditionalOperator() throws RecognitionException {
		ConditionalOperatorContext _localctx = new ConditionalOperatorContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_conditionalOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(365);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
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

	public static class ConstantContext extends ParserRuleContext {
		public TerminalNode INTNUM() { return getToken(ourLangParser.INTNUM, 0); }
		public TerminalNode FLOATNUM() { return getToken(ourLangParser.FLOATNUM, 0); }
		public ConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ourLangListener ) ((ourLangListener)listener).enterConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ourLangListener ) ((ourLangListener)listener).exitConstant(this);
		}
	}

	public final ConstantContext constant() throws RecognitionException {
		ConstantContext _localctx = new ConstantContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_constant);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(367);
			_la = _input.LA(1);
			if ( !(_la==INTNUM || _la==FLOATNUM) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
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

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3/\u0174\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\3\2\7\2:\n\2\f\2\16\2=\13\2\3\2\7\2@\n"+
		"\2\f\2\16\2C\13\2\3\2\7\2F\n\2\f\2\16\2I\13\2\3\2\3\2\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3[\n\3\3\4\3\4\3\4\3\4\3\4"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\7\5h\n\5\f\5\16\5k\13\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\7\5u\n\5\f\5\16\5x\13\5\3\5\3\5\7\5|\n\5\f\5\16\5\177\13\5"+
		"\3\5\3\5\3\5\7\5\u0084\n\5\f\5\16\5\u0087\13\5\3\5\5\5\u008a\n\5\3\6\3"+
		"\6\3\6\3\6\5\6\u0090\n\6\3\6\3\6\3\6\7\6\u0095\n\6\f\6\16\6\u0098\13\6"+
		"\3\6\3\6\3\6\3\6\5\6\u009e\n\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\7\6\u00a8"+
		"\n\6\f\6\16\6\u00ab\13\6\3\6\3\6\5\6\u00af\n\6\3\7\3\7\3\7\3\7\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\5\b\u00bc\n\b\3\b\3\b\3\b\3\b\3\b\3\b\7\b\u00c4\n"+
		"\b\f\b\16\b\u00c7\13\b\3\b\3\b\3\b\3\b\5\b\u00cd\n\b\3\b\3\b\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u00db\n\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\5\t\u00e8\n\t\7\t\u00ea\n\t\f\t\16\t\u00ed\13\t\5\t"+
		"\u00ef\n\t\3\t\5\t\u00f2\n\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\7\13\u00fc"+
		"\n\13\f\13\16\13\u00ff\13\13\3\13\3\13\5\13\u0103\n\13\3\f\3\f\3\f\5\f"+
		"\u0108\n\f\3\r\3\r\3\r\7\r\u010d\n\r\f\r\16\r\u0110\13\r\3\16\3\16\3\16"+
		"\7\16\u0115\n\16\f\16\16\16\u0118\13\16\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\5\17\u0122\n\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\5\20\u012d\n\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\5\21\u013a\n\21\3\22\3\22\3\22\3\22\3\22\3\22\7\22\u0142\n\22\f\22\16"+
		"\22\u0145\13\22\3\22\3\22\3\22\3\22\3\22\5\22\u014c\n\22\3\23\3\23\3\23"+
		"\3\23\3\23\3\24\3\24\3\24\7\24\u0156\n\24\f\24\16\24\u0159\13\24\3\25"+
		"\3\25\3\25\7\25\u015e\n\25\f\25\16\25\u0161\13\25\3\26\3\26\3\26\5\26"+
		"\u0166\n\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34"+
		"\3\34\2\2\35\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64"+
		"\66\2\n\4\2\r\r))\3\2\16\17\5\2\"\"$$&&\3\2\37!\5\2\r\17\23\23))\3\2\24"+
		"\25\4\2\4\5\26\31\4\2##%%\u018a\2;\3\2\2\2\4Z\3\2\2\2\6\\\3\2\2\2\ba\3"+
		"\2\2\2\n\u00ae\3\2\2\2\f\u00b0\3\2\2\2\16\u00bb\3\2\2\2\20\u00f1\3\2\2"+
		"\2\22\u00f3\3\2\2\2\24\u0102\3\2\2\2\26\u0107\3\2\2\2\30\u0109\3\2\2\2"+
		"\32\u0111\3\2\2\2\34\u0121\3\2\2\2\36\u012c\3\2\2\2 \u0139\3\2\2\2\"\u014b"+
		"\3\2\2\2$\u014d\3\2\2\2&\u0152\3\2\2\2(\u015a\3\2\2\2*\u0162\3\2\2\2,"+
		"\u0167\3\2\2\2.\u0169\3\2\2\2\60\u016b\3\2\2\2\62\u016d\3\2\2\2\64\u016f"+
		"\3\2\2\2\66\u0171\3\2\2\28:\5\6\4\298\3\2\2\2:=\3\2\2\2;9\3\2\2\2;<\3"+
		"\2\2\2<A\3\2\2\2=;\3\2\2\2>@\5\16\b\2?>\3\2\2\2@C\3\2\2\2A?\3\2\2\2AB"+
		"\3\2\2\2BG\3\2\2\2CA\3\2\2\2DF\5\4\3\2ED\3\2\2\2FI\3\2\2\2GE\3\2\2\2G"+
		"H\3\2\2\2HJ\3\2\2\2IG\3\2\2\2JK\7\2\2\3K\3\3\2\2\2LM\5\26\f\2MN\7\3\2"+
		"\2N[\3\2\2\2OP\5\36\20\2PQ\7\3\2\2Q[\3\2\2\2RS\5 \21\2ST\7\3\2\2T[\3\2"+
		"\2\2UV\5\22\n\2VW\7\3\2\2W[\3\2\2\2X[\5\b\5\2Y[\5\n\6\2ZL\3\2\2\2ZO\3"+
		"\2\2\2ZR\3\2\2\2ZU\3\2\2\2ZX\3\2\2\2ZY\3\2\2\2[\5\3\2\2\2\\]\7\32\2\2"+
		"]^\7\4\2\2^_\7+\2\2_`\7\5\2\2`\7\3\2\2\2ab\7\33\2\2bc\7\6\2\2cd\5\f\7"+
		"\2de\7\7\2\2ei\7\b\2\2fh\5\4\3\2gf\3\2\2\2hk\3\2\2\2ig\3\2\2\2ij\3\2\2"+
		"\2jl\3\2\2\2ki\3\2\2\2l}\7\t\2\2mn\7\34\2\2no\7\33\2\2op\7\6\2\2pq\5\f"+
		"\7\2qr\7\7\2\2rv\7\b\2\2su\5\4\3\2ts\3\2\2\2ux\3\2\2\2vt\3\2\2\2vw\3\2"+
		"\2\2wy\3\2\2\2xv\3\2\2\2yz\7\t\2\2z|\3\2\2\2{m\3\2\2\2|\177\3\2\2\2}{"+
		"\3\2\2\2}~\3\2\2\2~\u0089\3\2\2\2\177}\3\2\2\2\u0080\u0081\7\34\2\2\u0081"+
		"\u0085\7\b\2\2\u0082\u0084\5\4\3\2\u0083\u0082\3\2\2\2\u0084\u0087\3\2"+
		"\2\2\u0085\u0083\3\2\2\2\u0085\u0086\3\2\2\2\u0086\u0088\3\2\2\2\u0087"+
		"\u0085\3\2\2\2\u0088\u008a\7\t\2\2\u0089\u0080\3\2\2\2\u0089\u008a\3\2"+
		"\2\2\u008a\t\3\2\2\2\u008b\u008c\7\35\2\2\u008c\u008f\7\6\2\2\u008d\u0090"+
		"\5\f\7\2\u008e\u0090\7\'\2\2\u008f\u008d\3\2\2\2\u008f\u008e\3\2\2\2\u0090"+
		"\u0091\3\2\2\2\u0091\u0092\7\7\2\2\u0092\u0096\7\b\2\2\u0093\u0095\5\4"+
		"\3\2\u0094\u0093\3\2\2\2\u0095\u0098\3\2\2\2\u0096\u0094\3\2\2\2\u0096"+
		"\u0097\3\2\2\2\u0097\u0099\3\2\2\2\u0098\u0096\3\2\2\2\u0099\u00af\7\t"+
		"\2\2\u009a\u009b\7\36\2\2\u009b\u009d\7\6\2\2\u009c\u009e\5,\27\2\u009d"+
		"\u009c\3\2\2\2\u009d\u009e\3\2\2\2\u009e\u009f\3\2\2\2\u009f\u00a0\5\36"+
		"\20\2\u00a0\u00a1\7\3\2\2\u00a1\u00a2\5\f\7\2\u00a2\u00a3\7\3\2\2\u00a3"+
		"\u00a4\5\26\f\2\u00a4\u00a5\7\7\2\2\u00a5\u00a9\7\b\2\2\u00a6\u00a8\5"+
		"\4\3\2\u00a7\u00a6\3\2\2\2\u00a8\u00ab\3\2\2\2\u00a9\u00a7\3\2\2\2\u00a9"+
		"\u00aa\3\2\2\2\u00aa\u00ac\3\2\2\2\u00ab\u00a9\3\2\2\2\u00ac\u00ad\7\t"+
		"\2\2\u00ad\u00af\3\2\2\2\u00ae\u008b\3\2\2\2\u00ae\u009a\3\2\2\2\u00af"+
		"\13\3\2\2\2\u00b0\u00b1\5\26\f\2\u00b1\u00b2\5\64\33\2\u00b2\u00b3\5\26"+
		"\f\2\u00b3\r\3\2\2\2\u00b4\u00bc\5,\27\2\u00b5\u00b6\5.\30\2\u00b6\u00b7"+
		"\7\4\2\2\u00b7\u00b8\5,\27\2\u00b8\u00b9\7\5\2\2\u00b9\u00bc\3\2\2\2\u00ba"+
		"\u00bc\7\n\2\2\u00bb\u00b4\3\2\2\2\u00bb\u00b5\3\2\2\2\u00bb\u00ba\3\2"+
		"\2\2\u00bc\u00bd\3\2\2\2\u00bd\u00be\7*\2\2\u00be\u00bf\7\6\2\2\u00bf"+
		"\u00c0\5\20\t\2\u00c0\u00c1\7\7\2\2\u00c1\u00c5\7\b\2\2\u00c2\u00c4\5"+
		"\4\3\2\u00c3\u00c2\3\2\2\2\u00c4\u00c7\3\2\2\2\u00c5\u00c3\3\2\2\2\u00c5"+
		"\u00c6\3\2\2\2\u00c6\u00cc\3\2\2\2\u00c7\u00c5\3\2\2\2\u00c8\u00c9\7\13"+
		"\2\2\u00c9\u00ca\5\26\f\2\u00ca\u00cb\7\3\2\2\u00cb\u00cd\3\2\2\2\u00cc"+
		"\u00c8\3\2\2\2\u00cc\u00cd\3\2\2\2\u00cd\u00ce\3\2\2\2\u00ce\u00cf\7\t"+
		"\2\2\u00cf\17\3\2\2\2\u00d0\u00d1\5,\27\2\u00d1\u00d2\7*\2\2\u00d2\u00db"+
		"\3\2\2\2\u00d3\u00db\7(\2\2\u00d4\u00d5\5.\30\2\u00d5\u00d6\7\4\2\2\u00d6"+
		"\u00d7\5,\27\2\u00d7\u00d8\7\5\2\2\u00d8\u00d9\7*\2\2\u00d9\u00db\3\2"+
		"\2\2\u00da\u00d0\3\2\2\2\u00da\u00d3\3\2\2\2\u00da\u00d4\3\2\2\2\u00db"+
		"\u00eb\3\2\2\2\u00dc\u00e7\7\f\2\2\u00dd\u00de\5,\27\2\u00de\u00df\7*"+
		"\2\2\u00df\u00e8\3\2\2\2\u00e0\u00e8\7(\2\2\u00e1\u00e2\5.\30\2\u00e2"+
		"\u00e3\7\4\2\2\u00e3\u00e4\5,\27\2\u00e4\u00e5\7\5\2\2\u00e5\u00e6\7*"+
		"\2\2\u00e6\u00e8\3\2\2\2\u00e7\u00dd\3\2\2\2\u00e7\u00e0\3\2\2\2\u00e7"+
		"\u00e1\3\2\2\2\u00e8\u00ea\3\2\2\2\u00e9\u00dc\3\2\2\2\u00ea\u00ed\3\2"+
		"\2\2\u00eb\u00e9\3\2\2\2\u00eb\u00ec\3\2\2\2\u00ec\u00ef\3\2\2\2\u00ed"+
		"\u00eb\3\2\2\2\u00ee\u00da\3\2\2\2\u00ee\u00ef\3\2\2\2\u00ef\u00f2\3\2"+
		"\2\2\u00f0\u00f2\3\2\2\2\u00f1\u00ee\3\2\2\2\u00f1\u00f0\3\2\2\2\u00f2"+
		"\21\3\2\2\2\u00f3\u00f4\7*\2\2\u00f4\u00f5\7\6\2\2\u00f5\u00f6\5\24\13"+
		"\2\u00f6\u00f7\7\7\2\2\u00f7\23\3\2\2\2\u00f8\u00fd\5\26\f\2\u00f9\u00fa"+
		"\7\f\2\2\u00fa\u00fc\5\26\f\2\u00fb\u00f9\3\2\2\2\u00fc\u00ff\3\2\2\2"+
		"\u00fd\u00fb\3\2\2\2\u00fd\u00fe\3\2\2\2\u00fe\u0103\3\2\2\2\u00ff\u00fd"+
		"\3\2\2\2\u0100\u0103\7(\2\2\u0101\u0103\3\2\2\2\u0102\u00f8\3\2\2\2\u0102"+
		"\u0100\3\2\2\2\u0102\u0101\3\2\2\2\u0103\25\3\2\2\2\u0104\u0108\5\30\r"+
		"\2\u0105\u0106\7*\2\2\u0106\u0108\5\62\32\2\u0107\u0104\3\2\2\2\u0107"+
		"\u0105\3\2\2\2\u0108\27\3\2\2\2\u0109\u010e\5\32\16\2\u010a\u010b\t\2"+
		"\2\2\u010b\u010d\5\32\16\2\u010c\u010a\3\2\2\2\u010d\u0110\3\2\2\2\u010e"+
		"\u010c\3\2\2\2\u010e\u010f\3\2\2\2\u010f\31\3\2\2\2\u0110\u010e\3\2\2"+
		"\2\u0111\u0116\5\34\17\2\u0112\u0113\t\3\2\2\u0113\u0115\5\34\17\2\u0114"+
		"\u0112\3\2\2\2\u0115\u0118\3\2\2\2\u0116\u0114\3\2\2\2\u0116\u0117\3\2"+
		"\2\2\u0117\33\3\2\2\2\u0118\u0116\3\2\2\2\u0119\u011a\7\6\2\2\u011a\u011b"+
		"\5\26\f\2\u011b\u011c\7\7\2\2\u011c\u0122\3\2\2\2\u011d\u0122\5\"\22\2"+
		"\u011e\u011f\7)\2\2\u011f\u0122\5\34\17\2\u0120\u0122\5\22\n\2\u0121\u0119"+
		"\3\2\2\2\u0121\u011d\3\2\2\2\u0121\u011e\3\2\2\2\u0121\u0120\3\2\2\2\u0122"+
		"\35\3\2\2\2\u0123\u0124\7*\2\2\u0124\u0125\7\20\2\2\u0125\u012d\5\30\r"+
		"\2\u0126\u0127\7*\2\2\u0127\u0128\7\20\2\2\u0128\u012d\5\22\n\2\u0129"+
		"\u012a\7*\2\2\u012a\u012b\7\20\2\2\u012b\u012d\7\'\2\2\u012c\u0123\3\2"+
		"\2\2\u012c\u0126\3\2\2\2\u012c\u0129\3\2\2\2\u012d\37\3\2\2\2\u012e\u012f"+
		"\5,\27\2\u012f\u0130\5\36\20\2\u0130\u013a\3\2\2\2\u0131\u0132\5.\30\2"+
		"\u0132\u0133\7\4\2\2\u0133\u0134\5,\27\2\u0134\u0135\7\5\2\2\u0135\u0136"+
		"\7*\2\2\u0136\u0137\7\20\2\2\u0137\u0138\5\26\f\2\u0138\u013a\3\2\2\2"+
		"\u0139\u012e\3\2\2\2\u0139\u0131\3\2\2\2\u013a!\3\2\2\2\u013b\u014c\7"+
		"*\2\2\u013c\u014c\5\66\34\2\u013d\u013e\7\21\2\2\u013e\u0143\5&\24\2\u013f"+
		"\u0140\7\3\2\2\u0140\u0142\5&\24\2\u0141\u013f\3\2\2\2\u0142\u0145\3\2"+
		"\2\2\u0143\u0141\3\2\2\2\u0143\u0144\3\2\2\2\u0144\u0146\3\2\2\2\u0145"+
		"\u0143\3\2\2\2\u0146\u0147\7\22\2\2\u0147\u014c\3\2\2\2\u0148\u014c\5"+
		"\22\n\2\u0149\u014c\5$\23\2\u014a\u014c\7\'\2\2\u014b\u013b\3\2\2\2\u014b"+
		"\u013c\3\2\2\2\u014b\u013d\3\2\2\2\u014b\u0148\3\2\2\2\u014b\u0149\3\2"+
		"\2\2\u014b\u014a\3\2\2\2\u014c#\3\2\2\2\u014d\u014e\7*\2\2\u014e\u014f"+
		"\7\21\2\2\u014f\u0150\5*\26\2\u0150\u0151\7\22\2\2\u0151%\3\2\2\2\u0152"+
		"\u0157\5\"\22\2\u0153\u0154\7\f\2\2\u0154\u0156\5\"\22\2\u0155\u0153\3"+
		"\2\2\2\u0156\u0159\3\2\2\2\u0157\u0155\3\2\2\2\u0157\u0158\3\2\2\2\u0158"+
		"\'\3\2\2\2\u0159\u0157\3\2\2\2\u015a\u015f\5\66\34\2\u015b\u015c\7\f\2"+
		"\2\u015c\u015e\5\66\34\2\u015d\u015b\3\2\2\2\u015e\u0161\3\2\2\2\u015f"+
		"\u015d\3\2\2\2\u015f\u0160\3\2\2\2\u0160)\3\2\2\2\u0161\u015f\3\2\2\2"+
		"\u0162\u0165\7#\2\2\u0163\u0164\7\f\2\2\u0164\u0166\7#\2\2\u0165\u0163"+
		"\3\2\2\2\u0165\u0166\3\2\2\2\u0166+\3\2\2\2\u0167\u0168\t\4\2\2\u0168"+
		"-\3\2\2\2\u0169\u016a\t\5\2\2\u016a/\3\2\2\2\u016b\u016c\t\6\2\2\u016c"+
		"\61\3\2\2\2\u016d\u016e\t\7\2\2\u016e\63\3\2\2\2\u016f\u0170\t\b\2\2\u0170"+
		"\65\3\2\2\2\u0171\u0172\t\t\2\2\u0172\67\3\2\2\2%;AGZiv}\u0085\u0089\u008f"+
		"\u0096\u009d\u00a9\u00ae\u00bb\u00c5\u00cc\u00da\u00e7\u00eb\u00ee\u00f1"+
		"\u00fd\u0102\u0107\u010e\u0116\u0121\u012c\u0139\u0143\u014b\u0157\u015f"+
		"\u0165";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}