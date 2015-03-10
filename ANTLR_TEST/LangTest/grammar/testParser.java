// Generated from test.g4 by ANTLR 4.5
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class testParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, IF=24, ELSE=25, 
		WHILE=26, FOR=27, MATRIX=28, INT=29, INTNUM=30, FLOAT=31, FLOATNUM=32, 
		BOOL=33, BOOLVAL=34, STRING=35, ROWVECTOR=36, COLVECTOR=37, SIGN=38, ID=39, 
		WS=40, NL=41, COMMENT=42, LINE_COMMENT=43;
	public static final int
		RULE_topLevel = 0, RULE_statement = 1, RULE_controlblock = 2, RULE_loop = 3, 
		RULE_condition = 4, RULE_functiondeclaration = 5, RULE_parameterlist = 6, 
		RULE_functioncall = 7, RULE_argumentlist = 8, RULE_expression = 9, RULE_addexpression = 10, 
		RULE_multiexpression = 11, RULE_primary = 12, RULE_assignment = 13, RULE_declaration = 14, 
		RULE_value = 15, RULE_collectionEntrance = 16, RULE_valueList = 17, RULE_constantList = 18, 
		RULE_entranceCoordinate = 19, RULE_datatype = 20, RULE_collectiontype = 21, 
		RULE_infixBinaryOperator = 22, RULE_postUnaryOperator = 23, RULE_conditionalOperator = 24, 
		RULE_constant = 25;
	public static final String[] ruleNames = {
		"topLevel", "statement", "controlblock", "loop", "condition", "functiondeclaration", 
		"parameterlist", "functioncall", "argumentlist", "expression", "addexpression", 
		"multiexpression", "primary", "assignment", "declaration", "value", "collectionEntrance", 
		"valueList", "constantList", "entranceCoordinate", "datatype", "collectiontype", 
		"infixBinaryOperator", "postUnaryOperator", "conditionalOperator", "constant"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "';'", "'('", "')'", "'{'", "'}'", "'<'", "'>'", "'void'", "'return'", 
		"','", "'+'", "'*'", "'/'", "'='", "'['", "']'", "'%'", "'++'", "'--'", 
		"'=='", "'!='", "'<='", "'>='", "'if'", "'else'", "'while'", "'for'", 
		"'matrix'", "'int'", null, "'float'", null, "'bool'", null, null, null, 
		null, "'-'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		"IF", "ELSE", "WHILE", "FOR", "MATRIX", "INT", "INTNUM", "FLOAT", "FLOATNUM", 
		"BOOL", "BOOLVAL", "STRING", "ROWVECTOR", "COLVECTOR", "SIGN", "ID", "WS", 
		"NL", "COMMENT", "LINE_COMMENT"
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
	public String getGrammarFileName() { return "test.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public testParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class TopLevelContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(testParser.EOF, 0); }
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
			if ( listener instanceof testListener ) ((testListener)listener).enterTopLevel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).exitTopLevel(this);
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
			setState(55);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(52);
					functiondeclaration();
					}
					} 
				}
				setState(57);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(61);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__14) | (1L << IF) | (1L << WHILE) | (1L << FOR) | (1L << MATRIX) | (1L << INT) | (1L << INTNUM) | (1L << FLOAT) | (1L << FLOATNUM) | (1L << BOOL) | (1L << BOOLVAL) | (1L << ROWVECTOR) | (1L << COLVECTOR) | (1L << SIGN) | (1L << ID))) != 0)) {
				{
				{
				setState(58);
				statement();
				}
				}
				setState(63);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(64);
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
			if ( listener instanceof testListener ) ((testListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			setState(80);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(66);
				expression();
				setState(67);
				match(T__0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(69);
				assignment();
				setState(70);
				match(T__0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(72);
				declaration();
				setState(73);
				match(T__0);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(75);
				functioncall();
				setState(76);
				match(T__0);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(78);
				controlblock();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(79);
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

	public static class ControlblockContext extends ParserRuleContext {
		public List<TerminalNode> IF() { return getTokens(testParser.IF); }
		public TerminalNode IF(int i) {
			return getToken(testParser.IF, i);
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
		public List<TerminalNode> ELSE() { return getTokens(testParser.ELSE); }
		public TerminalNode ELSE(int i) {
			return getToken(testParser.ELSE, i);
		}
		public ControlblockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_controlblock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).enterControlblock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).exitControlblock(this);
		}
	}

	public final ControlblockContext controlblock() throws RecognitionException {
		ControlblockContext _localctx = new ControlblockContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_controlblock);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
			match(IF);
			setState(83);
			match(T__1);
			setState(84);
			condition();
			setState(85);
			match(T__2);
			setState(86);
			match(T__3);
			setState(90);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__14) | (1L << IF) | (1L << WHILE) | (1L << FOR) | (1L << MATRIX) | (1L << INT) | (1L << INTNUM) | (1L << FLOAT) | (1L << FLOATNUM) | (1L << BOOL) | (1L << BOOLVAL) | (1L << ROWVECTOR) | (1L << COLVECTOR) | (1L << SIGN) | (1L << ID))) != 0)) {
				{
				{
				setState(87);
				statement();
				}
				}
				setState(92);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(93);
			match(T__4);
			setState(110);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(94);
					match(ELSE);
					setState(95);
					match(IF);
					setState(96);
					match(T__1);
					setState(97);
					condition();
					setState(98);
					match(T__2);
					setState(99);
					match(T__3);
					setState(103);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__14) | (1L << IF) | (1L << WHILE) | (1L << FOR) | (1L << MATRIX) | (1L << INT) | (1L << INTNUM) | (1L << FLOAT) | (1L << FLOATNUM) | (1L << BOOL) | (1L << BOOLVAL) | (1L << ROWVECTOR) | (1L << COLVECTOR) | (1L << SIGN) | (1L << ID))) != 0)) {
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
					match(T__4);
					}
					} 
				}
				setState(112);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			}
			setState(122);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(113);
				match(ELSE);
				setState(114);
				match(T__3);
				setState(118);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__14) | (1L << IF) | (1L << WHILE) | (1L << FOR) | (1L << MATRIX) | (1L << INT) | (1L << INTNUM) | (1L << FLOAT) | (1L << FLOATNUM) | (1L << BOOL) | (1L << BOOLVAL) | (1L << ROWVECTOR) | (1L << COLVECTOR) | (1L << SIGN) | (1L << ID))) != 0)) {
					{
					{
					setState(115);
					statement();
					}
					}
					setState(120);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(121);
				match(T__4);
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
		public TerminalNode WHILE() { return getToken(testParser.WHILE, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode BOOLVAL() { return getToken(testParser.BOOLVAL, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode FOR() { return getToken(testParser.FOR, 0); }
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
			if ( listener instanceof testListener ) ((testListener)listener).enterLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).exitLoop(this);
		}
	}

	public final LoopContext loop() throws RecognitionException {
		LoopContext _localctx = new LoopContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_loop);
		int _la;
		try {
			setState(159);
			switch (_input.LA(1)) {
			case WHILE:
				enterOuterAlt(_localctx, 1);
				{
				setState(124);
				match(WHILE);
				setState(125);
				match(T__1);
				setState(128);
				switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
				case 1:
					{
					setState(126);
					condition();
					}
					break;
				case 2:
					{
					setState(127);
					match(BOOLVAL);
					}
					break;
				}
				setState(130);
				match(T__2);
				setState(131);
				match(T__3);
				setState(135);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__14) | (1L << IF) | (1L << WHILE) | (1L << FOR) | (1L << MATRIX) | (1L << INT) | (1L << INTNUM) | (1L << FLOAT) | (1L << FLOATNUM) | (1L << BOOL) | (1L << BOOLVAL) | (1L << ROWVECTOR) | (1L << COLVECTOR) | (1L << SIGN) | (1L << ID))) != 0)) {
					{
					{
					setState(132);
					statement();
					}
					}
					setState(137);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(138);
				match(T__4);
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 2);
				{
				setState(139);
				match(FOR);
				setState(140);
				match(T__1);
				setState(142);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << FLOAT) | (1L << BOOL))) != 0)) {
					{
					setState(141);
					datatype();
					}
				}

				setState(144);
				assignment();
				setState(145);
				match(T__0);
				setState(146);
				condition();
				setState(147);
				match(T__0);
				setState(148);
				expression();
				setState(149);
				match(T__2);
				setState(150);
				match(T__3);
				setState(154);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__14) | (1L << IF) | (1L << WHILE) | (1L << FOR) | (1L << MATRIX) | (1L << INT) | (1L << INTNUM) | (1L << FLOAT) | (1L << FLOATNUM) | (1L << BOOL) | (1L << BOOLVAL) | (1L << ROWVECTOR) | (1L << COLVECTOR) | (1L << SIGN) | (1L << ID))) != 0)) {
					{
					{
					setState(151);
					statement();
					}
					}
					setState(156);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(157);
				match(T__4);
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
			if ( listener instanceof testListener ) ((testListener)listener).enterCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).exitCondition(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_condition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(161);
			expression();
			setState(162);
			conditionalOperator();
			setState(163);
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
		public TerminalNode ID() { return getToken(testParser.ID, 0); }
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
			if ( listener instanceof testListener ) ((testListener)listener).enterFunctiondeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).exitFunctiondeclaration(this);
		}
	}

	public final FunctiondeclarationContext functiondeclaration() throws RecognitionException {
		FunctiondeclarationContext _localctx = new FunctiondeclarationContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_functiondeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(172);
			switch (_input.LA(1)) {
			case INT:
			case FLOAT:
			case BOOL:
				{
				setState(165);
				datatype();
				}
				break;
			case MATRIX:
			case ROWVECTOR:
			case COLVECTOR:
				{
				setState(166);
				collectiontype();
				setState(167);
				match(T__5);
				setState(168);
				datatype();
				setState(169);
				match(T__6);
				}
				break;
			case T__7:
				{
				setState(171);
				match(T__7);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(174);
			match(ID);
			setState(175);
			match(T__1);
			setState(176);
			parameterlist();
			setState(177);
			match(T__2);
			setState(178);
			match(T__3);
			setState(182);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__14) | (1L << IF) | (1L << WHILE) | (1L << FOR) | (1L << MATRIX) | (1L << INT) | (1L << INTNUM) | (1L << FLOAT) | (1L << FLOATNUM) | (1L << BOOL) | (1L << BOOLVAL) | (1L << ROWVECTOR) | (1L << COLVECTOR) | (1L << SIGN) | (1L << ID))) != 0)) {
				{
				{
				setState(179);
				statement();
				}
				}
				setState(184);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(189);
			_la = _input.LA(1);
			if (_la==T__8) {
				{
				setState(185);
				match(T__8);
				setState(186);
				expression();
				setState(187);
				match(T__0);
				}
			}

			setState(191);
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

	public static class ParameterlistContext extends ParserRuleContext {
		public List<DatatypeContext> datatype() {
			return getRuleContexts(DatatypeContext.class);
		}
		public DatatypeContext datatype(int i) {
			return getRuleContext(DatatypeContext.class,i);
		}
		public List<TerminalNode> ID() { return getTokens(testParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(testParser.ID, i);
		}
		public List<TerminalNode> STRING() { return getTokens(testParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(testParser.STRING, i);
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
			if ( listener instanceof testListener ) ((testListener)listener).enterParameterlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).exitParameterlist(this);
		}
	}

	public final ParameterlistContext parameterlist() throws RecognitionException {
		ParameterlistContext _localctx = new ParameterlistContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_parameterlist);
		int _la;
		try {
			setState(226);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(223);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MATRIX) | (1L << INT) | (1L << FLOAT) | (1L << BOOL) | (1L << STRING) | (1L << ROWVECTOR) | (1L << COLVECTOR))) != 0)) {
					{
					setState(203);
					switch (_input.LA(1)) {
					case INT:
					case FLOAT:
					case BOOL:
						{
						setState(193);
						datatype();
						setState(194);
						match(ID);
						}
						break;
					case STRING:
						{
						setState(196);
						match(STRING);
						}
						break;
					case MATRIX:
					case ROWVECTOR:
					case COLVECTOR:
						{
						setState(197);
						collectiontype();
						setState(198);
						match(T__5);
						setState(199);
						datatype();
						setState(200);
						match(T__6);
						setState(201);
						match(ID);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(220);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__9) {
						{
						{
						setState(205);
						match(T__9);
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
							match(T__5);
							setState(212);
							datatype();
							setState(213);
							match(T__6);
							setState(214);
							match(ID);
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						}
						}
						setState(222);
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
		public TerminalNode ID() { return getToken(testParser.ID, 0); }
		public ArgumentlistContext argumentlist() {
			return getRuleContext(ArgumentlistContext.class,0);
		}
		public FunctioncallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functioncall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).enterFunctioncall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).exitFunctioncall(this);
		}
	}

	public final FunctioncallContext functioncall() throws RecognitionException {
		FunctioncallContext _localctx = new FunctioncallContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_functioncall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(228);
			match(ID);
			setState(229);
			match(T__1);
			setState(230);
			argumentlist();
			setState(231);
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

	public static class ArgumentlistContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode STRING() { return getToken(testParser.STRING, 0); }
		public ArgumentlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argumentlist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).enterArgumentlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).exitArgumentlist(this);
		}
	}

	public final ArgumentlistContext argumentlist() throws RecognitionException {
		ArgumentlistContext _localctx = new ArgumentlistContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_argumentlist);
		int _la;
		try {
			setState(243);
			switch (_input.LA(1)) {
			case T__1:
			case T__14:
			case INTNUM:
			case FLOATNUM:
			case BOOLVAL:
			case SIGN:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(233);
				expression();
				setState(238);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__9) {
					{
					{
					setState(234);
					match(T__9);
					setState(235);
					expression();
					}
					}
					setState(240);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(241);
				match(STRING);
				}
				break;
			case T__2:
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
		public TerminalNode ID() { return getToken(testParser.ID, 0); }
		public PostUnaryOperatorContext postUnaryOperator() {
			return getRuleContext(PostUnaryOperatorContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_expression);
		try {
			setState(248);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(245);
				addexpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(246);
				match(ID);
				setState(247);
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
			if ( listener instanceof testListener ) ((testListener)listener).enterAddexpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).exitAddexpression(this);
		}
	}

	public final AddexpressionContext addexpression() throws RecognitionException {
		AddexpressionContext _localctx = new AddexpressionContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_addexpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(250);
			multiexpression();
			setState(255);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__10 || _la==SIGN) {
				{
				{
				setState(251);
				_la = _input.LA(1);
				if ( !(_la==T__10 || _la==SIGN) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(252);
				multiexpression();
				}
				}
				setState(257);
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
			if ( listener instanceof testListener ) ((testListener)listener).enterMultiexpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).exitMultiexpression(this);
		}
	}

	public final MultiexpressionContext multiexpression() throws RecognitionException {
		MultiexpressionContext _localctx = new MultiexpressionContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_multiexpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(258);
			primary();
			setState(263);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__11 || _la==T__12) {
				{
				{
				setState(259);
				_la = _input.LA(1);
				if ( !(_la==T__11 || _la==T__12) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(260);
				primary();
				}
				}
				setState(265);
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
			if ( listener instanceof testListener ) ((testListener)listener).enterPrimary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).exitPrimary(this);
		}
	}

	public final PrimaryContext primary() throws RecognitionException {
		PrimaryContext _localctx = new PrimaryContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_primary);
		try {
			setState(274);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(266);
				match(T__1);
				setState(267);
				expression();
				setState(268);
				match(T__2);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(270);
				value();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(271);
				match(SIGN);
				setState(272);
				primary();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(273);
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
		public TerminalNode ID() { return getToken(testParser.ID, 0); }
		public AddexpressionContext addexpression() {
			return getRuleContext(AddexpressionContext.class,0);
		}
		public FunctioncallContext functioncall() {
			return getRuleContext(FunctioncallContext.class,0);
		}
		public TerminalNode BOOLVAL() { return getToken(testParser.BOOLVAL, 0); }
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).exitAssignment(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_assignment);
		try {
			setState(285);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(276);
				match(ID);
				setState(277);
				match(T__13);
				setState(278);
				addexpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(279);
				match(ID);
				setState(280);
				match(T__13);
				setState(281);
				functioncall();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(282);
				match(ID);
				setState(283);
				match(T__13);
				setState(284);
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
		public TerminalNode ID() { return getToken(testParser.ID, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).exitDeclaration(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_declaration);
		try {
			setState(298);
			switch (_input.LA(1)) {
			case INT:
			case FLOAT:
			case BOOL:
				enterOuterAlt(_localctx, 1);
				{
				setState(287);
				datatype();
				setState(288);
				assignment();
				}
				break;
			case MATRIX:
			case ROWVECTOR:
			case COLVECTOR:
				enterOuterAlt(_localctx, 2);
				{
				setState(290);
				collectiontype();
				setState(291);
				match(T__5);
				setState(292);
				datatype();
				setState(293);
				match(T__6);
				setState(294);
				match(ID);
				setState(295);
				match(T__13);
				setState(296);
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
		public TerminalNode ID() { return getToken(testParser.ID, 0); }
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
		public TerminalNode BOOLVAL() { return getToken(testParser.BOOLVAL, 0); }
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).exitValue(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_value);
		int _la;
		try {
			setState(316);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(300);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(301);
				constant();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(302);
				match(T__14);
				setState(303);
				valueList();
				setState(308);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__0) {
					{
					{
					setState(304);
					match(T__0);
					setState(305);
					valueList();
					}
					}
					setState(310);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(311);
				match(T__15);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(313);
				functioncall();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(314);
				collectionEntrance();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(315);
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
		public TerminalNode ID() { return getToken(testParser.ID, 0); }
		public EntranceCoordinateContext entranceCoordinate() {
			return getRuleContext(EntranceCoordinateContext.class,0);
		}
		public CollectionEntranceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_collectionEntrance; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).enterCollectionEntrance(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).exitCollectionEntrance(this);
		}
	}

	public final CollectionEntranceContext collectionEntrance() throws RecognitionException {
		CollectionEntranceContext _localctx = new CollectionEntranceContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_collectionEntrance);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(318);
			match(ID);
			setState(319);
			match(T__14);
			setState(320);
			entranceCoordinate();
			setState(321);
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
			if ( listener instanceof testListener ) ((testListener)listener).enterValueList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).exitValueList(this);
		}
	}

	public final ValueListContext valueList() throws RecognitionException {
		ValueListContext _localctx = new ValueListContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_valueList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(323);
			value();
			setState(328);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__9) {
				{
				{
				setState(324);
				match(T__9);
				setState(325);
				value();
				}
				}
				setState(330);
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
			if ( listener instanceof testListener ) ((testListener)listener).enterConstantList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).exitConstantList(this);
		}
	}

	public final ConstantListContext constantList() throws RecognitionException {
		ConstantListContext _localctx = new ConstantListContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_constantList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(331);
			constant();
			setState(336);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__9) {
				{
				{
				setState(332);
				match(T__9);
				setState(333);
				constant();
				}
				}
				setState(338);
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
		public List<TerminalNode> INTNUM() { return getTokens(testParser.INTNUM); }
		public TerminalNode INTNUM(int i) {
			return getToken(testParser.INTNUM, i);
		}
		public EntranceCoordinateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_entranceCoordinate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).enterEntranceCoordinate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).exitEntranceCoordinate(this);
		}
	}

	public final EntranceCoordinateContext entranceCoordinate() throws RecognitionException {
		EntranceCoordinateContext _localctx = new EntranceCoordinateContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_entranceCoordinate);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(339);
			match(INTNUM);
			setState(342);
			_la = _input.LA(1);
			if (_la==T__9) {
				{
				setState(340);
				match(T__9);
				setState(341);
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
		public TerminalNode INT() { return getToken(testParser.INT, 0); }
		public TerminalNode FLOAT() { return getToken(testParser.FLOAT, 0); }
		public TerminalNode BOOL() { return getToken(testParser.BOOL, 0); }
		public DatatypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_datatype; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).enterDatatype(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).exitDatatype(this);
		}
	}

	public final DatatypeContext datatype() throws RecognitionException {
		DatatypeContext _localctx = new DatatypeContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_datatype);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(344);
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
		public TerminalNode MATRIX() { return getToken(testParser.MATRIX, 0); }
		public TerminalNode ROWVECTOR() { return getToken(testParser.ROWVECTOR, 0); }
		public TerminalNode COLVECTOR() { return getToken(testParser.COLVECTOR, 0); }
		public CollectiontypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_collectiontype; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).enterCollectiontype(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).exitCollectiontype(this);
		}
	}

	public final CollectiontypeContext collectiontype() throws RecognitionException {
		CollectiontypeContext _localctx = new CollectiontypeContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_collectiontype);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(346);
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
			if ( listener instanceof testListener ) ((testListener)listener).enterInfixBinaryOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).exitInfixBinaryOperator(this);
		}
	}

	public final InfixBinaryOperatorContext infixBinaryOperator() throws RecognitionException {
		InfixBinaryOperatorContext _localctx = new InfixBinaryOperatorContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_infixBinaryOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(348);
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
			if ( listener instanceof testListener ) ((testListener)listener).enterPostUnaryOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).exitPostUnaryOperator(this);
		}
	}

	public final PostUnaryOperatorContext postUnaryOperator() throws RecognitionException {
		PostUnaryOperatorContext _localctx = new PostUnaryOperatorContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_postUnaryOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(350);
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
			if ( listener instanceof testListener ) ((testListener)listener).enterConditionalOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).exitConditionalOperator(this);
		}
	}

	public final ConditionalOperatorContext conditionalOperator() throws RecognitionException {
		ConditionalOperatorContext _localctx = new ConditionalOperatorContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_conditionalOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(352);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__6) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22))) != 0)) ) {
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
		public TerminalNode INTNUM() { return getToken(testParser.INTNUM, 0); }
		public TerminalNode FLOATNUM() { return getToken(testParser.FLOATNUM, 0); }
		public ConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).enterConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).exitConstant(this);
		}
	}

	public final ConstantContext constant() throws RecognitionException {
		ConstantContext _localctx = new ConstantContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_constant);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(354);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3-\u0167\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\3\2\7\28\n\2\f\2\16\2;\13\2\3\2\7\2>\n\2\f\2\16\2"+
		"A\13\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\5\3S\n\3\3\4\3\4\3\4\3\4\3\4\3\4\7\4[\n\4\f\4\16\4^\13\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\7\4h\n\4\f\4\16\4k\13\4\3\4\3\4\7\4o\n\4\f\4\16\4"+
		"r\13\4\3\4\3\4\3\4\7\4w\n\4\f\4\16\4z\13\4\3\4\5\4}\n\4\3\5\3\5\3\5\3"+
		"\5\5\5\u0083\n\5\3\5\3\5\3\5\7\5\u0088\n\5\f\5\16\5\u008b\13\5\3\5\3\5"+
		"\3\5\3\5\5\5\u0091\n\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5\u009b\n\5\f"+
		"\5\16\5\u009e\13\5\3\5\3\5\5\5\u00a2\n\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\5\7\u00af\n\7\3\7\3\7\3\7\3\7\3\7\3\7\7\7\u00b7\n\7\f\7"+
		"\16\7\u00ba\13\7\3\7\3\7\3\7\3\7\5\7\u00c0\n\7\3\7\3\7\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u00ce\n\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\5\b\u00db\n\b\7\b\u00dd\n\b\f\b\16\b\u00e0\13\b\5\b\u00e2"+
		"\n\b\3\b\5\b\u00e5\n\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\7\n\u00ef\n\n\f"+
		"\n\16\n\u00f2\13\n\3\n\3\n\5\n\u00f6\n\n\3\13\3\13\3\13\5\13\u00fb\n\13"+
		"\3\f\3\f\3\f\7\f\u0100\n\f\f\f\16\f\u0103\13\f\3\r\3\r\3\r\7\r\u0108\n"+
		"\r\f\r\16\r\u010b\13\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u0115"+
		"\n\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u0120\n\17\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u012d\n\20\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\7\21\u0135\n\21\f\21\16\21\u0138\13\21\3\21"+
		"\3\21\3\21\3\21\3\21\5\21\u013f\n\21\3\22\3\22\3\22\3\22\3\22\3\23\3\23"+
		"\3\23\7\23\u0149\n\23\f\23\16\23\u014c\13\23\3\24\3\24\3\24\7\24\u0151"+
		"\n\24\f\24\16\24\u0154\13\24\3\25\3\25\3\25\5\25\u0159\n\25\3\26\3\26"+
		"\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\33\2\2\34\2\4\6\b"+
		"\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\2\n\4\2\r\r((\3\2\16"+
		"\17\5\2\37\37!!##\4\2\36\36&\'\5\2\r\17\23\23((\3\2\24\25\4\2\b\t\26\31"+
		"\4\2  \"\"\u017d\29\3\2\2\2\4R\3\2\2\2\6T\3\2\2\2\b\u00a1\3\2\2\2\n\u00a3"+
		"\3\2\2\2\f\u00ae\3\2\2\2\16\u00e4\3\2\2\2\20\u00e6\3\2\2\2\22\u00f5\3"+
		"\2\2\2\24\u00fa\3\2\2\2\26\u00fc\3\2\2\2\30\u0104\3\2\2\2\32\u0114\3\2"+
		"\2\2\34\u011f\3\2\2\2\36\u012c\3\2\2\2 \u013e\3\2\2\2\"\u0140\3\2\2\2"+
		"$\u0145\3\2\2\2&\u014d\3\2\2\2(\u0155\3\2\2\2*\u015a\3\2\2\2,\u015c\3"+
		"\2\2\2.\u015e\3\2\2\2\60\u0160\3\2\2\2\62\u0162\3\2\2\2\64\u0164\3\2\2"+
		"\2\668\5\f\7\2\67\66\3\2\2\28;\3\2\2\29\67\3\2\2\29:\3\2\2\2:?\3\2\2\2"+
		";9\3\2\2\2<>\5\4\3\2=<\3\2\2\2>A\3\2\2\2?=\3\2\2\2?@\3\2\2\2@B\3\2\2\2"+
		"A?\3\2\2\2BC\7\2\2\3C\3\3\2\2\2DE\5\24\13\2EF\7\3\2\2FS\3\2\2\2GH\5\34"+
		"\17\2HI\7\3\2\2IS\3\2\2\2JK\5\36\20\2KL\7\3\2\2LS\3\2\2\2MN\5\20\t\2N"+
		"O\7\3\2\2OS\3\2\2\2PS\5\6\4\2QS\5\b\5\2RD\3\2\2\2RG\3\2\2\2RJ\3\2\2\2"+
		"RM\3\2\2\2RP\3\2\2\2RQ\3\2\2\2S\5\3\2\2\2TU\7\32\2\2UV\7\4\2\2VW\5\n\6"+
		"\2WX\7\5\2\2X\\\7\6\2\2Y[\5\4\3\2ZY\3\2\2\2[^\3\2\2\2\\Z\3\2\2\2\\]\3"+
		"\2\2\2]_\3\2\2\2^\\\3\2\2\2_p\7\7\2\2`a\7\33\2\2ab\7\32\2\2bc\7\4\2\2"+
		"cd\5\n\6\2de\7\5\2\2ei\7\6\2\2fh\5\4\3\2gf\3\2\2\2hk\3\2\2\2ig\3\2\2\2"+
		"ij\3\2\2\2jl\3\2\2\2ki\3\2\2\2lm\7\7\2\2mo\3\2\2\2n`\3\2\2\2or\3\2\2\2"+
		"pn\3\2\2\2pq\3\2\2\2q|\3\2\2\2rp\3\2\2\2st\7\33\2\2tx\7\6\2\2uw\5\4\3"+
		"\2vu\3\2\2\2wz\3\2\2\2xv\3\2\2\2xy\3\2\2\2y{\3\2\2\2zx\3\2\2\2{}\7\7\2"+
		"\2|s\3\2\2\2|}\3\2\2\2}\7\3\2\2\2~\177\7\34\2\2\177\u0082\7\4\2\2\u0080"+
		"\u0083\5\n\6\2\u0081\u0083\7$\2\2\u0082\u0080\3\2\2\2\u0082\u0081\3\2"+
		"\2\2\u0083\u0084\3\2\2\2\u0084\u0085\7\5\2\2\u0085\u0089\7\6\2\2\u0086"+
		"\u0088\5\4\3\2\u0087\u0086\3\2\2\2\u0088\u008b\3\2\2\2\u0089\u0087\3\2"+
		"\2\2\u0089\u008a\3\2\2\2\u008a\u008c\3\2\2\2\u008b\u0089\3\2\2\2\u008c"+
		"\u00a2\7\7\2\2\u008d\u008e\7\35\2\2\u008e\u0090\7\4\2\2\u008f\u0091\5"+
		"*\26\2\u0090\u008f\3\2\2\2\u0090\u0091\3\2\2\2\u0091\u0092\3\2\2\2\u0092"+
		"\u0093\5\34\17\2\u0093\u0094\7\3\2\2\u0094\u0095\5\n\6\2\u0095\u0096\7"+
		"\3\2\2\u0096\u0097\5\24\13\2\u0097\u0098\7\5\2\2\u0098\u009c\7\6\2\2\u0099"+
		"\u009b\5\4\3\2\u009a\u0099\3\2\2\2\u009b\u009e\3\2\2\2\u009c\u009a\3\2"+
		"\2\2\u009c\u009d\3\2\2\2\u009d\u009f\3\2\2\2\u009e\u009c\3\2\2\2\u009f"+
		"\u00a0\7\7\2\2\u00a0\u00a2\3\2\2\2\u00a1~\3\2\2\2\u00a1\u008d\3\2\2\2"+
		"\u00a2\t\3\2\2\2\u00a3\u00a4\5\24\13\2\u00a4\u00a5\5\62\32\2\u00a5\u00a6"+
		"\5\24\13\2\u00a6\13\3\2\2\2\u00a7\u00af\5*\26\2\u00a8\u00a9\5,\27\2\u00a9"+
		"\u00aa\7\b\2\2\u00aa\u00ab\5*\26\2\u00ab\u00ac\7\t\2\2\u00ac\u00af\3\2"+
		"\2\2\u00ad\u00af\7\n\2\2\u00ae\u00a7\3\2\2\2\u00ae\u00a8\3\2\2\2\u00ae"+
		"\u00ad\3\2\2\2\u00af\u00b0\3\2\2\2\u00b0\u00b1\7)\2\2\u00b1\u00b2\7\4"+
		"\2\2\u00b2\u00b3\5\16\b\2\u00b3\u00b4\7\5\2\2\u00b4\u00b8\7\6\2\2\u00b5"+
		"\u00b7\5\4\3\2\u00b6\u00b5\3\2\2\2\u00b7\u00ba\3\2\2\2\u00b8\u00b6\3\2"+
		"\2\2\u00b8\u00b9\3\2\2\2\u00b9\u00bf\3\2\2\2\u00ba\u00b8\3\2\2\2\u00bb"+
		"\u00bc\7\13\2\2\u00bc\u00bd\5\24\13\2\u00bd\u00be\7\3\2\2\u00be\u00c0"+
		"\3\2\2\2\u00bf\u00bb\3\2\2\2\u00bf\u00c0\3\2\2\2\u00c0\u00c1\3\2\2\2\u00c1"+
		"\u00c2\7\7\2\2\u00c2\r\3\2\2\2\u00c3\u00c4\5*\26\2\u00c4\u00c5\7)\2\2"+
		"\u00c5\u00ce\3\2\2\2\u00c6\u00ce\7%\2\2\u00c7\u00c8\5,\27\2\u00c8\u00c9"+
		"\7\b\2\2\u00c9\u00ca\5*\26\2\u00ca\u00cb\7\t\2\2\u00cb\u00cc\7)\2\2\u00cc"+
		"\u00ce\3\2\2\2\u00cd\u00c3\3\2\2\2\u00cd\u00c6\3\2\2\2\u00cd\u00c7\3\2"+
		"\2\2\u00ce\u00de\3\2\2\2\u00cf\u00da\7\f\2\2\u00d0\u00d1\5*\26\2\u00d1"+
		"\u00d2\7)\2\2\u00d2\u00db\3\2\2\2\u00d3\u00db\7%\2\2\u00d4\u00d5\5,\27"+
		"\2\u00d5\u00d6\7\b\2\2\u00d6\u00d7\5*\26\2\u00d7\u00d8\7\t\2\2\u00d8\u00d9"+
		"\7)\2\2\u00d9\u00db\3\2\2\2\u00da\u00d0\3\2\2\2\u00da\u00d3\3\2\2\2\u00da"+
		"\u00d4\3\2\2\2\u00db\u00dd\3\2\2\2\u00dc\u00cf\3\2\2\2\u00dd\u00e0\3\2"+
		"\2\2\u00de\u00dc\3\2\2\2\u00de\u00df\3\2\2\2\u00df\u00e2\3\2\2\2\u00e0"+
		"\u00de\3\2\2\2\u00e1\u00cd\3\2\2\2\u00e1\u00e2\3\2\2\2\u00e2\u00e5\3\2"+
		"\2\2\u00e3\u00e5\3\2\2\2\u00e4\u00e1\3\2\2\2\u00e4\u00e3\3\2\2\2\u00e5"+
		"\17\3\2\2\2\u00e6\u00e7\7)\2\2\u00e7\u00e8\7\4\2\2\u00e8\u00e9\5\22\n"+
		"\2\u00e9\u00ea\7\5\2\2\u00ea\21\3\2\2\2\u00eb\u00f0\5\24\13\2\u00ec\u00ed"+
		"\7\f\2\2\u00ed\u00ef\5\24\13\2\u00ee\u00ec\3\2\2\2\u00ef\u00f2\3\2\2\2"+
		"\u00f0\u00ee\3\2\2\2\u00f0\u00f1\3\2\2\2\u00f1\u00f6\3\2\2\2\u00f2\u00f0"+
		"\3\2\2\2\u00f3\u00f6\7%\2\2\u00f4\u00f6\3\2\2\2\u00f5\u00eb\3\2\2\2\u00f5"+
		"\u00f3\3\2\2\2\u00f5\u00f4\3\2\2\2\u00f6\23\3\2\2\2\u00f7\u00fb\5\26\f"+
		"\2\u00f8\u00f9\7)\2\2\u00f9\u00fb\5\60\31\2\u00fa\u00f7\3\2\2\2\u00fa"+
		"\u00f8\3\2\2\2\u00fb\25\3\2\2\2\u00fc\u0101\5\30\r\2\u00fd\u00fe\t\2\2"+
		"\2\u00fe\u0100\5\30\r\2\u00ff\u00fd\3\2\2\2\u0100\u0103\3\2\2\2\u0101"+
		"\u00ff\3\2\2\2\u0101\u0102\3\2\2\2\u0102\27\3\2\2\2\u0103\u0101\3\2\2"+
		"\2\u0104\u0109\5\32\16\2\u0105\u0106\t\3\2\2\u0106\u0108\5\32\16\2\u0107"+
		"\u0105\3\2\2\2\u0108\u010b\3\2\2\2\u0109\u0107\3\2\2\2\u0109\u010a\3\2"+
		"\2\2\u010a\31\3\2\2\2\u010b\u0109\3\2\2\2\u010c\u010d\7\4\2\2\u010d\u010e"+
		"\5\24\13\2\u010e\u010f\7\5\2\2\u010f\u0115\3\2\2\2\u0110\u0115\5 \21\2"+
		"\u0111\u0112\7(\2\2\u0112\u0115\5\32\16\2\u0113\u0115\5\20\t\2\u0114\u010c"+
		"\3\2\2\2\u0114\u0110\3\2\2\2\u0114\u0111\3\2\2\2\u0114\u0113\3\2\2\2\u0115"+
		"\33\3\2\2\2\u0116\u0117\7)\2\2\u0117\u0118\7\20\2\2\u0118\u0120\5\26\f"+
		"\2\u0119\u011a\7)\2\2\u011a\u011b\7\20\2\2\u011b\u0120\5\20\t\2\u011c"+
		"\u011d\7)\2\2\u011d\u011e\7\20\2\2\u011e\u0120\7$\2\2\u011f\u0116\3\2"+
		"\2\2\u011f\u0119\3\2\2\2\u011f\u011c\3\2\2\2\u0120\35\3\2\2\2\u0121\u0122"+
		"\5*\26\2\u0122\u0123\5\34\17\2\u0123\u012d\3\2\2\2\u0124\u0125\5,\27\2"+
		"\u0125\u0126\7\b\2\2\u0126\u0127\5*\26\2\u0127\u0128\7\t\2\2\u0128\u0129"+
		"\7)\2\2\u0129\u012a\7\20\2\2\u012a\u012b\5\24\13\2\u012b\u012d\3\2\2\2"+
		"\u012c\u0121\3\2\2\2\u012c\u0124\3\2\2\2\u012d\37\3\2\2\2\u012e\u013f"+
		"\7)\2\2\u012f\u013f\5\64\33\2\u0130\u0131\7\21\2\2\u0131\u0136\5$\23\2"+
		"\u0132\u0133\7\3\2\2\u0133\u0135\5$\23\2\u0134\u0132\3\2\2\2\u0135\u0138"+
		"\3\2\2\2\u0136\u0134\3\2\2\2\u0136\u0137\3\2\2\2\u0137\u0139\3\2\2\2\u0138"+
		"\u0136\3\2\2\2\u0139\u013a\7\22\2\2\u013a\u013f\3\2\2\2\u013b\u013f\5"+
		"\20\t\2\u013c\u013f\5\"\22\2\u013d\u013f\7$\2\2\u013e\u012e\3\2\2\2\u013e"+
		"\u012f\3\2\2\2\u013e\u0130\3\2\2\2\u013e\u013b\3\2\2\2\u013e\u013c\3\2"+
		"\2\2\u013e\u013d\3\2\2\2\u013f!\3\2\2\2\u0140\u0141\7)\2\2\u0141\u0142"+
		"\7\21\2\2\u0142\u0143\5(\25\2\u0143\u0144\7\22\2\2\u0144#\3\2\2\2\u0145"+
		"\u014a\5 \21\2\u0146\u0147\7\f\2\2\u0147\u0149\5 \21\2\u0148\u0146\3\2"+
		"\2\2\u0149\u014c\3\2\2\2\u014a\u0148\3\2\2\2\u014a\u014b\3\2\2\2\u014b"+
		"%\3\2\2\2\u014c\u014a\3\2\2\2\u014d\u0152\5\64\33\2\u014e\u014f\7\f\2"+
		"\2\u014f\u0151\5\64\33\2\u0150\u014e\3\2\2\2\u0151\u0154\3\2\2\2\u0152"+
		"\u0150\3\2\2\2\u0152\u0153\3\2\2\2\u0153\'\3\2\2\2\u0154\u0152\3\2\2\2"+
		"\u0155\u0158\7 \2\2\u0156\u0157\7\f\2\2\u0157\u0159\7 \2\2\u0158\u0156"+
		"\3\2\2\2\u0158\u0159\3\2\2\2\u0159)\3\2\2\2\u015a\u015b\t\4\2\2\u015b"+
		"+\3\2\2\2\u015c\u015d\t\5\2\2\u015d-\3\2\2\2\u015e\u015f\t\6\2\2\u015f"+
		"/\3\2\2\2\u0160\u0161\t\7\2\2\u0161\61\3\2\2\2\u0162\u0163\t\b\2\2\u0163"+
		"\63\3\2\2\2\u0164\u0165\t\t\2\2\u0165\65\3\2\2\2$9?R\\ipx|\u0082\u0089"+
		"\u0090\u009c\u00a1\u00ae\u00b8\u00bf\u00cd\u00da\u00de\u00e1\u00e4\u00f0"+
		"\u00f5\u00fa\u0101\u0109\u0114\u011f\u012c\u0136\u013e\u014a\u0152\u0158";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}