// Generated from /Users/michno/Desktop/AAU/SW4-P4/Sourcecode/ANTLR_TEST/LangTest/grammar/test.g4 by ANTLR 4.5
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
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		IF=25, ELSE=26, WHILE=27, FOR=28, MATRIX=29, INT=30, INTNUM=31, FLOAT=32, 
		FLOATNUM=33, BOOL=34, BOOLVAL=35, STRING=36, ROWVECTOR=37, COLVECTOR=38, 
		SIGN=39, ID=40, WS=41, NL=42, COMMENT=43, LINE_COMMENT=44;
	public static final int
		RULE_topLevel = 0, RULE_statement = 1, RULE_controlblock = 2, RULE_loop = 3, 
		RULE_condition = 4, RULE_functiondeclaration = 5, RULE_parameterlist = 6, 
		RULE_functioncall = 7, RULE_argumentlist = 8, RULE_expression = 9, RULE_addexpression = 10, 
		RULE_multiexpression = 11, RULE_primary = 12, RULE_assignment = 13, RULE_declaration = 14, 
		RULE_value = 15, RULE_collectionEntrance = 16, RULE_valueListList = 17, 
		RULE_valueList = 18, RULE_constantList = 19, RULE_entranceCoordinate = 20, 
		RULE_datatype = 21, RULE_collectiontype = 22, RULE_infixBinaryOperator = 23, 
		RULE_postUnaryOperator = 24, RULE_conditionalOperator = 25, RULE_constant = 26;
	public static final String[] ruleNames = {
		"topLevel", "statement", "controlblock", "loop", "condition", "functiondeclaration", 
		"parameterlist", "functioncall", "argumentlist", "expression", "addexpression", 
		"multiexpression", "primary", "assignment", "declaration", "value", "collectionEntrance", 
		"valueListList", "valueList", "constantList", "entranceCoordinate", "datatype", 
		"collectiontype", "infixBinaryOperator", "postUnaryOperator", "conditionalOperator", 
		"constant"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "';'", "'('", "')'", "'{'", "'}'", "'<'", "'>'", "'void'", "'return'", 
		"','", "''", "'+'", "'*'", "'/'", "'='", "'['", "']'", "'%'", "'++'", 
		"'--'", "'=='", "'!='", "'<='", "'>='", "'if'", "'else'", "'while'", "'for'", 
		"'matrix'", "'int'", null, "'float'", null, "'bool'", null, null, null, 
		null, "'-'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, "IF", "ELSE", "WHILE", "FOR", "MATRIX", "INT", "INTNUM", "FLOAT", 
		"FLOATNUM", "BOOL", "BOOLVAL", "STRING", "ROWVECTOR", "COLVECTOR", "SIGN", 
		"ID", "WS", "NL", "COMMENT", "LINE_COMMENT"
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
	@NotNull
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof testVisitor ) return ((testVisitor<? extends T>)visitor).visitTopLevel(this);
			else return visitor.visitChildren(this);
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
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(54); 
					functiondeclaration();
					}
					} 
				}
				setState(59);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(63);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__15) | (1L << IF) | (1L << WHILE) | (1L << FOR) | (1L << MATRIX) | (1L << INT) | (1L << INTNUM) | (1L << FLOAT) | (1L << FLOATNUM) | (1L << BOOL) | (1L << BOOLVAL) | (1L << ROWVECTOR) | (1L << COLVECTOR) | (1L << SIGN) | (1L << ID))) != 0)) {
				{
				{
				setState(60); 
				statement();
				}
				}
				setState(65);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(66); 
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof testVisitor ) return ((testVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			setState(82);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(68); 
				expression();
				setState(69); 
				match(T__0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(71); 
				assignment();
				setState(72); 
				match(T__0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(74); 
				declaration();
				setState(75); 
				match(T__0);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(77); 
				functioncall();
				setState(78); 
				match(T__0);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(80); 
				controlblock();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(81); 
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof testVisitor ) return ((testVisitor<? extends T>)visitor).visitControlblock(this);
			else return visitor.visitChildren(this);
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
			setState(84); 
			match(IF);
			setState(85); 
			match(T__1);
			setState(86); 
			condition();
			setState(87); 
			match(T__2);
			setState(88); 
			match(T__3);
			setState(92);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__15) | (1L << IF) | (1L << WHILE) | (1L << FOR) | (1L << MATRIX) | (1L << INT) | (1L << INTNUM) | (1L << FLOAT) | (1L << FLOATNUM) | (1L << BOOL) | (1L << BOOLVAL) | (1L << ROWVECTOR) | (1L << COLVECTOR) | (1L << SIGN) | (1L << ID))) != 0)) {
				{
				{
				setState(89); 
				statement();
				}
				}
				setState(94);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(95); 
			match(T__4);
			setState(112);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(96); 
					match(ELSE);
					setState(97); 
					match(IF);
					setState(98); 
					match(T__1);
					setState(99); 
					condition();
					setState(100); 
					match(T__2);
					setState(101); 
					match(T__3);
					setState(105);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__15) | (1L << IF) | (1L << WHILE) | (1L << FOR) | (1L << MATRIX) | (1L << INT) | (1L << INTNUM) | (1L << FLOAT) | (1L << FLOATNUM) | (1L << BOOL) | (1L << BOOLVAL) | (1L << ROWVECTOR) | (1L << COLVECTOR) | (1L << SIGN) | (1L << ID))) != 0)) {
						{
						{
						setState(102); 
						statement();
						}
						}
						setState(107);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(108); 
					match(T__4);
					}
					} 
				}
				setState(114);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			}
			setState(124);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(115); 
				match(ELSE);
				setState(116); 
				match(T__3);
				setState(120);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__15) | (1L << IF) | (1L << WHILE) | (1L << FOR) | (1L << MATRIX) | (1L << INT) | (1L << INTNUM) | (1L << FLOAT) | (1L << FLOATNUM) | (1L << BOOL) | (1L << BOOLVAL) | (1L << ROWVECTOR) | (1L << COLVECTOR) | (1L << SIGN) | (1L << ID))) != 0)) {
					{
					{
					setState(117); 
					statement();
					}
					}
					setState(122);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(123); 
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof testVisitor ) return ((testVisitor<? extends T>)visitor).visitLoop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LoopContext loop() throws RecognitionException {
		LoopContext _localctx = new LoopContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_loop);
		int _la;
		try {
			setState(161);
			switch (_input.LA(1)) {
			case WHILE:
				enterOuterAlt(_localctx, 1);
				{
				setState(126); 
				match(WHILE);
				setState(127); 
				match(T__1);
				setState(130);
				switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
				case 1:
					{
					setState(128); 
					condition();
					}
					break;
				case 2:
					{
					setState(129); 
					match(BOOLVAL);
					}
					break;
				}
				setState(132); 
				match(T__2);
				setState(133); 
				match(T__3);
				setState(137);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__15) | (1L << IF) | (1L << WHILE) | (1L << FOR) | (1L << MATRIX) | (1L << INT) | (1L << INTNUM) | (1L << FLOAT) | (1L << FLOATNUM) | (1L << BOOL) | (1L << BOOLVAL) | (1L << ROWVECTOR) | (1L << COLVECTOR) | (1L << SIGN) | (1L << ID))) != 0)) {
					{
					{
					setState(134); 
					statement();
					}
					}
					setState(139);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(140); 
				match(T__4);
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 2);
				{
				setState(141); 
				match(FOR);
				setState(142); 
				match(T__1);
				setState(144);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << FLOAT) | (1L << BOOL))) != 0)) {
					{
					setState(143); 
					datatype();
					}
				}

				setState(146); 
				assignment();
				setState(147); 
				match(T__0);
				setState(148); 
				condition();
				setState(149); 
				match(T__0);
				setState(150); 
				expression();
				setState(151); 
				match(T__2);
				setState(152); 
				match(T__3);
				setState(156);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__15) | (1L << IF) | (1L << WHILE) | (1L << FOR) | (1L << MATRIX) | (1L << INT) | (1L << INTNUM) | (1L << FLOAT) | (1L << FLOATNUM) | (1L << BOOL) | (1L << BOOLVAL) | (1L << ROWVECTOR) | (1L << COLVECTOR) | (1L << SIGN) | (1L << ID))) != 0)) {
					{
					{
					setState(153); 
					statement();
					}
					}
					setState(158);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(159); 
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof testVisitor ) return ((testVisitor<? extends T>)visitor).visitCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_condition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(163); 
			expression();
			setState(164); 
			conditionalOperator();
			setState(165); 
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof testVisitor ) return ((testVisitor<? extends T>)visitor).visitFunctiondeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctiondeclarationContext functiondeclaration() throws RecognitionException {
		FunctiondeclarationContext _localctx = new FunctiondeclarationContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_functiondeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(174);
			switch (_input.LA(1)) {
			case INT:
			case FLOAT:
			case BOOL:
				{
				setState(167); 
				datatype();
				}
				break;
			case MATRIX:
			case ROWVECTOR:
			case COLVECTOR:
				{
				setState(168); 
				collectiontype();
				setState(169); 
				match(T__5);
				setState(170); 
				datatype();
				setState(171); 
				match(T__6);
				}
				break;
			case T__7:
				{
				setState(173); 
				match(T__7);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(176); 
			match(ID);
			setState(177); 
			match(T__1);
			setState(178); 
			parameterlist();
			setState(179); 
			match(T__2);
			setState(180); 
			match(T__3);
			setState(184);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__15) | (1L << IF) | (1L << WHILE) | (1L << FOR) | (1L << MATRIX) | (1L << INT) | (1L << INTNUM) | (1L << FLOAT) | (1L << FLOATNUM) | (1L << BOOL) | (1L << BOOLVAL) | (1L << ROWVECTOR) | (1L << COLVECTOR) | (1L << SIGN) | (1L << ID))) != 0)) {
				{
				{
				setState(181); 
				statement();
				}
				}
				setState(186);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(191);
			_la = _input.LA(1);
			if (_la==T__8) {
				{
				setState(187); 
				match(T__8);
				setState(188); 
				expression();
				setState(189); 
				match(T__0);
				}
			}

			setState(193); 
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof testVisitor ) return ((testVisitor<? extends T>)visitor).visitParameterlist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterlistContext parameterlist() throws RecognitionException {
		ParameterlistContext _localctx = new ParameterlistContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_parameterlist);
		int _la;
		try {
			setState(228);
			switch (_input.LA(1)) {
			case T__2:
			case MATRIX:
			case INT:
			case FLOAT:
			case BOOL:
			case STRING:
			case ROWVECTOR:
			case COLVECTOR:
				enterOuterAlt(_localctx, 1);
				{
				setState(225);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MATRIX) | (1L << INT) | (1L << FLOAT) | (1L << BOOL) | (1L << STRING) | (1L << ROWVECTOR) | (1L << COLVECTOR))) != 0)) {
					{
					setState(205);
					switch (_input.LA(1)) {
					case INT:
					case FLOAT:
					case BOOL:
						{
						setState(195); 
						datatype();
						setState(196); 
						match(ID);
						}
						break;
					case STRING:
						{
						setState(198); 
						match(STRING);
						}
						break;
					case MATRIX:
					case ROWVECTOR:
					case COLVECTOR:
						{
						setState(199); 
						collectiontype();
						setState(200); 
						match(T__5);
						setState(201); 
						datatype();
						setState(202); 
						match(T__6);
						setState(203); 
						match(ID);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(222);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__9) {
						{
						{
						setState(207); 
						match(T__9);
						setState(218);
						switch (_input.LA(1)) {
						case INT:
						case FLOAT:
						case BOOL:
							{
							setState(208); 
							datatype();
							setState(209); 
							match(ID);
							}
							break;
						case STRING:
							{
							setState(211); 
							match(STRING);
							}
							break;
						case MATRIX:
						case ROWVECTOR:
						case COLVECTOR:
							{
							setState(212); 
							collectiontype();
							setState(213); 
							match(T__5);
							setState(214); 
							datatype();
							setState(215); 
							match(T__6);
							setState(216); 
							match(ID);
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						}
						}
						setState(224);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 2);
				{
				setState(227); 
				match(T__10);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof testVisitor ) return ((testVisitor<? extends T>)visitor).visitFunctioncall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctioncallContext functioncall() throws RecognitionException {
		FunctioncallContext _localctx = new FunctioncallContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_functioncall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(230); 
			match(ID);
			setState(231); 
			match(T__1);
			setState(232); 
			argumentlist();
			setState(233); 
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof testVisitor ) return ((testVisitor<? extends T>)visitor).visitArgumentlist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentlistContext argumentlist() throws RecognitionException {
		ArgumentlistContext _localctx = new ArgumentlistContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_argumentlist);
		int _la;
		try {
			setState(244);
			switch (_input.LA(1)) {
			case T__1:
			case T__15:
			case INTNUM:
			case FLOATNUM:
			case BOOLVAL:
			case SIGN:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(235); 
				expression();
				setState(240);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__9) {
					{
					{
					setState(236); 
					match(T__9);
					setState(237); 
					expression();
					}
					}
					setState(242);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 2);
				{
				setState(243); 
				match(T__10);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof testVisitor ) return ((testVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_expression);
		try {
			setState(249);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(246); 
				addexpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(247); 
				match(ID);
				setState(248); 
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof testVisitor ) return ((testVisitor<? extends T>)visitor).visitAddexpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AddexpressionContext addexpression() throws RecognitionException {
		AddexpressionContext _localctx = new AddexpressionContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_addexpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(251); 
			multiexpression();
			setState(256);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__11 || _la==SIGN) {
				{
				{
				setState(252);
				_la = _input.LA(1);
				if ( !(_la==T__11 || _la==SIGN) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(253); 
				multiexpression();
				}
				}
				setState(258);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof testVisitor ) return ((testVisitor<? extends T>)visitor).visitMultiexpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultiexpressionContext multiexpression() throws RecognitionException {
		MultiexpressionContext _localctx = new MultiexpressionContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_multiexpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(259); 
			primary();
			setState(264);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__12 || _la==T__13) {
				{
				{
				setState(260);
				_la = _input.LA(1);
				if ( !(_la==T__12 || _la==T__13) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(261); 
				primary();
				}
				}
				setState(266);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof testVisitor ) return ((testVisitor<? extends T>)visitor).visitPrimary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryContext primary() throws RecognitionException {
		PrimaryContext _localctx = new PrimaryContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_primary);
		try {
			setState(275);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(267); 
				match(T__1);
				setState(268); 
				expression();
				setState(269); 
				match(T__2);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(271); 
				value();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(272); 
				match(SIGN);
				setState(273); 
				primary();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(274); 
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof testVisitor ) return ((testVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_assignment);
		try {
			setState(286);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(277); 
				match(ID);
				setState(278); 
				match(T__14);
				setState(279); 
				addexpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(280); 
				match(ID);
				setState(281); 
				match(T__14);
				setState(282); 
				functioncall();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(283); 
				match(ID);
				setState(284); 
				match(T__14);
				setState(285); 
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof testVisitor ) return ((testVisitor<? extends T>)visitor).visitDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_declaration);
		try {
			setState(299);
			switch (_input.LA(1)) {
			case INT:
			case FLOAT:
			case BOOL:
				enterOuterAlt(_localctx, 1);
				{
				setState(288); 
				datatype();
				setState(289); 
				assignment();
				}
				break;
			case MATRIX:
			case ROWVECTOR:
			case COLVECTOR:
				enterOuterAlt(_localctx, 2);
				{
				setState(291); 
				collectiontype();
				setState(292); 
				match(T__5);
				setState(293); 
				datatype();
				setState(294); 
				match(T__6);
				setState(295); 
				match(ID);
				setState(296); 
				match(T__14);
				setState(297); 
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
		public ValueListListContext valueListList() {
			return getRuleContext(ValueListListContext.class,0);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof testVisitor ) return ((testVisitor<? extends T>)visitor).visitValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_value);
		try {
			setState(310);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(301); 
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(302); 
				constant();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(303); 
				match(T__15);
				setState(304); 
				valueListList();
				setState(305); 
				match(T__16);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(307); 
				functioncall();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(308); 
				collectionEntrance();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(309); 
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof testVisitor ) return ((testVisitor<? extends T>)visitor).visitCollectionEntrance(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CollectionEntranceContext collectionEntrance() throws RecognitionException {
		CollectionEntranceContext _localctx = new CollectionEntranceContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_collectionEntrance);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(312); 
			match(ID);
			setState(313); 
			match(T__15);
			setState(314); 
			entranceCoordinate();
			setState(315); 
			match(T__16);
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

	public static class ValueListListContext extends ParserRuleContext {
		public ValueListContext valueList() {
			return getRuleContext(ValueListContext.class,0);
		}
		public ValueListListContext valueListList() {
			return getRuleContext(ValueListListContext.class,0);
		}
		public ValueListListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valueListList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).enterValueListList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).exitValueListList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof testVisitor ) return ((testVisitor<? extends T>)visitor).visitValueListList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueListListContext valueListList() throws RecognitionException {
		ValueListListContext _localctx = new ValueListListContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_valueListList);
		try {
			setState(322);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(317); 
				valueList();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(318); 
				valueList();
				setState(319); 
				match(T__0);
				setState(320); 
				valueListList();
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

	public static class ValueListContext extends ParserRuleContext {
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public ValueListContext valueList() {
			return getRuleContext(ValueListContext.class,0);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof testVisitor ) return ((testVisitor<? extends T>)visitor).visitValueList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueListContext valueList() throws RecognitionException {
		ValueListContext _localctx = new ValueListContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_valueList);
		try {
			setState(329);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(324); 
				value();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(325); 
				value();
				setState(326); 
				match(T__9);
				setState(327); 
				valueList();
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

	public static class ConstantListContext extends ParserRuleContext {
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public ConstantListContext constantList() {
			return getRuleContext(ConstantListContext.class,0);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof testVisitor ) return ((testVisitor<? extends T>)visitor).visitConstantList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantListContext constantList() throws RecognitionException {
		ConstantListContext _localctx = new ConstantListContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_constantList);
		try {
			setState(336);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(331); 
				constant();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(332); 
				constant();
				setState(333); 
				match(T__9);
				setState(334); 
				constantList();
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof testVisitor ) return ((testVisitor<? extends T>)visitor).visitEntranceCoordinate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EntranceCoordinateContext entranceCoordinate() throws RecognitionException {
		EntranceCoordinateContext _localctx = new EntranceCoordinateContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_entranceCoordinate);
		try {
			setState(342);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(338); 
				match(INTNUM);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(339); 
				match(INTNUM);
				setState(340); 
				match(T__9);
				setState(341); 
				match(INTNUM);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof testVisitor ) return ((testVisitor<? extends T>)visitor).visitDatatype(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DatatypeContext datatype() throws RecognitionException {
		DatatypeContext _localctx = new DatatypeContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_datatype);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(344);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << FLOAT) | (1L << BOOL))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof testVisitor ) return ((testVisitor<? extends T>)visitor).visitCollectiontype(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CollectiontypeContext collectiontype() throws RecognitionException {
		CollectiontypeContext _localctx = new CollectiontypeContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_collectiontype);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(346);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MATRIX) | (1L << ROWVECTOR) | (1L << COLVECTOR))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof testVisitor ) return ((testVisitor<? extends T>)visitor).visitInfixBinaryOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InfixBinaryOperatorContext infixBinaryOperator() throws RecognitionException {
		InfixBinaryOperatorContext _localctx = new InfixBinaryOperatorContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_infixBinaryOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(348);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__17) | (1L << SIGN))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof testVisitor ) return ((testVisitor<? extends T>)visitor).visitPostUnaryOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PostUnaryOperatorContext postUnaryOperator() throws RecognitionException {
		PostUnaryOperatorContext _localctx = new PostUnaryOperatorContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_postUnaryOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(350);
			_la = _input.LA(1);
			if ( !(_la==T__18 || _la==T__19) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof testVisitor ) return ((testVisitor<? extends T>)visitor).visitConditionalOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionalOperatorContext conditionalOperator() throws RecognitionException {
		ConditionalOperatorContext _localctx = new ConditionalOperatorContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_conditionalOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(352);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__6) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof testVisitor ) return ((testVisitor<? extends T>)visitor).visitConstant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantContext constant() throws RecognitionException {
		ConstantContext _localctx = new ConstantContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_constant);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(354);
			_la = _input.LA(1);
			if ( !(_la==INTNUM || _la==FLOATNUM) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3.\u0167\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\3\2\7\2:\n\2\f\2\16\2=\13\2\3\2\7\2@\n"+
		"\2\f\2\16\2C\13\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\5\3U\n\3\3\4\3\4\3\4\3\4\3\4\3\4\7\4]\n\4\f\4\16\4`\13\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4j\n\4\f\4\16\4m\13\4\3\4\3\4\7\4q"+
		"\n\4\f\4\16\4t\13\4\3\4\3\4\3\4\7\4y\n\4\f\4\16\4|\13\4\3\4\5\4\177\n"+
		"\4\3\5\3\5\3\5\3\5\5\5\u0085\n\5\3\5\3\5\3\5\7\5\u008a\n\5\f\5\16\5\u008d"+
		"\13\5\3\5\3\5\3\5\3\5\5\5\u0093\n\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\7"+
		"\5\u009d\n\5\f\5\16\5\u00a0\13\5\3\5\3\5\5\5\u00a4\n\5\3\6\3\6\3\6\3\6"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u00b1\n\7\3\7\3\7\3\7\3\7\3\7\3\7\7\7"+
		"\u00b9\n\7\f\7\16\7\u00bc\13\7\3\7\3\7\3\7\3\7\5\7\u00c2\n\7\3\7\3\7\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u00d0\n\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u00dd\n\b\7\b\u00df\n\b\f\b\16\b\u00e2"+
		"\13\b\5\b\u00e4\n\b\3\b\5\b\u00e7\n\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n"+
		"\7\n\u00f1\n\n\f\n\16\n\u00f4\13\n\3\n\5\n\u00f7\n\n\3\13\3\13\3\13\5"+
		"\13\u00fc\n\13\3\f\3\f\3\f\7\f\u0101\n\f\f\f\16\f\u0104\13\f\3\r\3\r\3"+
		"\r\7\r\u0109\n\r\f\r\16\r\u010c\13\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\5\16\u0116\n\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17"+
		"\u0121\n\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20"+
		"\u012e\n\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u0139\n"+
		"\21\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\5\23\u0145\n\23"+
		"\3\24\3\24\3\24\3\24\3\24\5\24\u014c\n\24\3\25\3\25\3\25\3\25\3\25\5\25"+
		"\u0153\n\25\3\26\3\26\3\26\3\26\5\26\u0159\n\26\3\27\3\27\3\30\3\30\3"+
		"\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\34\2\2\35\2\4\6\b\n\f\16\20\22"+
		"\24\26\30\32\34\36 \"$&(*,.\60\62\64\66\2\n\4\2\16\16))\3\2\17\20\5\2"+
		"  \"\"$$\4\2\37\37\'(\5\2\16\20\24\24))\3\2\25\26\4\2\b\t\27\32\4\2!!"+
		"##\u017b\2;\3\2\2\2\4T\3\2\2\2\6V\3\2\2\2\b\u00a3\3\2\2\2\n\u00a5\3\2"+
		"\2\2\f\u00b0\3\2\2\2\16\u00e6\3\2\2\2\20\u00e8\3\2\2\2\22\u00f6\3\2\2"+
		"\2\24\u00fb\3\2\2\2\26\u00fd\3\2\2\2\30\u0105\3\2\2\2\32\u0115\3\2\2\2"+
		"\34\u0120\3\2\2\2\36\u012d\3\2\2\2 \u0138\3\2\2\2\"\u013a\3\2\2\2$\u0144"+
		"\3\2\2\2&\u014b\3\2\2\2(\u0152\3\2\2\2*\u0158\3\2\2\2,\u015a\3\2\2\2."+
		"\u015c\3\2\2\2\60\u015e\3\2\2\2\62\u0160\3\2\2\2\64\u0162\3\2\2\2\66\u0164"+
		"\3\2\2\28:\5\f\7\298\3\2\2\2:=\3\2\2\2;9\3\2\2\2;<\3\2\2\2<A\3\2\2\2="+
		";\3\2\2\2>@\5\4\3\2?>\3\2\2\2@C\3\2\2\2A?\3\2\2\2AB\3\2\2\2BD\3\2\2\2"+
		"CA\3\2\2\2DE\7\2\2\3E\3\3\2\2\2FG\5\24\13\2GH\7\3\2\2HU\3\2\2\2IJ\5\34"+
		"\17\2JK\7\3\2\2KU\3\2\2\2LM\5\36\20\2MN\7\3\2\2NU\3\2\2\2OP\5\20\t\2P"+
		"Q\7\3\2\2QU\3\2\2\2RU\5\6\4\2SU\5\b\5\2TF\3\2\2\2TI\3\2\2\2TL\3\2\2\2"+
		"TO\3\2\2\2TR\3\2\2\2TS\3\2\2\2U\5\3\2\2\2VW\7\33\2\2WX\7\4\2\2XY\5\n\6"+
		"\2YZ\7\5\2\2Z^\7\6\2\2[]\5\4\3\2\\[\3\2\2\2]`\3\2\2\2^\\\3\2\2\2^_\3\2"+
		"\2\2_a\3\2\2\2`^\3\2\2\2ar\7\7\2\2bc\7\34\2\2cd\7\33\2\2de\7\4\2\2ef\5"+
		"\n\6\2fg\7\5\2\2gk\7\6\2\2hj\5\4\3\2ih\3\2\2\2jm\3\2\2\2ki\3\2\2\2kl\3"+
		"\2\2\2ln\3\2\2\2mk\3\2\2\2no\7\7\2\2oq\3\2\2\2pb\3\2\2\2qt\3\2\2\2rp\3"+
		"\2\2\2rs\3\2\2\2s~\3\2\2\2tr\3\2\2\2uv\7\34\2\2vz\7\6\2\2wy\5\4\3\2xw"+
		"\3\2\2\2y|\3\2\2\2zx\3\2\2\2z{\3\2\2\2{}\3\2\2\2|z\3\2\2\2}\177\7\7\2"+
		"\2~u\3\2\2\2~\177\3\2\2\2\177\7\3\2\2\2\u0080\u0081\7\35\2\2\u0081\u0084"+
		"\7\4\2\2\u0082\u0085\5\n\6\2\u0083\u0085\7%\2\2\u0084\u0082\3\2\2\2\u0084"+
		"\u0083\3\2\2\2\u0085\u0086\3\2\2\2\u0086\u0087\7\5\2\2\u0087\u008b\7\6"+
		"\2\2\u0088\u008a\5\4\3\2\u0089\u0088\3\2\2\2\u008a\u008d\3\2\2\2\u008b"+
		"\u0089\3\2\2\2\u008b\u008c\3\2\2\2\u008c\u008e\3\2\2\2\u008d\u008b\3\2"+
		"\2\2\u008e\u00a4\7\7\2\2\u008f\u0090\7\36\2\2\u0090\u0092\7\4\2\2\u0091"+
		"\u0093\5,\27\2\u0092\u0091\3\2\2\2\u0092\u0093\3\2\2\2\u0093\u0094\3\2"+
		"\2\2\u0094\u0095\5\34\17\2\u0095\u0096\7\3\2\2\u0096\u0097\5\n\6\2\u0097"+
		"\u0098\7\3\2\2\u0098\u0099\5\24\13\2\u0099\u009a\7\5\2\2\u009a\u009e\7"+
		"\6\2\2\u009b\u009d\5\4\3\2\u009c\u009b\3\2\2\2\u009d\u00a0\3\2\2\2\u009e"+
		"\u009c\3\2\2\2\u009e\u009f\3\2\2\2\u009f\u00a1\3\2\2\2\u00a0\u009e\3\2"+
		"\2\2\u00a1\u00a2\7\7\2\2\u00a2\u00a4\3\2\2\2\u00a3\u0080\3\2\2\2\u00a3"+
		"\u008f\3\2\2\2\u00a4\t\3\2\2\2\u00a5\u00a6\5\24\13\2\u00a6\u00a7\5\64"+
		"\33\2\u00a7\u00a8\5\24\13\2\u00a8\13\3\2\2\2\u00a9\u00b1\5,\27\2\u00aa"+
		"\u00ab\5.\30\2\u00ab\u00ac\7\b\2\2\u00ac\u00ad\5,\27\2\u00ad\u00ae\7\t"+
		"\2\2\u00ae\u00b1\3\2\2\2\u00af\u00b1\7\n\2\2\u00b0\u00a9\3\2\2\2\u00b0"+
		"\u00aa\3\2\2\2\u00b0\u00af\3\2\2\2\u00b1\u00b2\3\2\2\2\u00b2\u00b3\7*"+
		"\2\2\u00b3\u00b4\7\4\2\2\u00b4\u00b5\5\16\b\2\u00b5\u00b6\7\5\2\2\u00b6"+
		"\u00ba\7\6\2\2\u00b7\u00b9\5\4\3\2\u00b8\u00b7\3\2\2\2\u00b9\u00bc\3\2"+
		"\2\2\u00ba\u00b8\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb\u00c1\3\2\2\2\u00bc"+
		"\u00ba\3\2\2\2\u00bd\u00be\7\13\2\2\u00be\u00bf\5\24\13\2\u00bf\u00c0"+
		"\7\3\2\2\u00c0\u00c2\3\2\2\2\u00c1\u00bd\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2"+
		"\u00c3\3\2\2\2\u00c3\u00c4\7\7\2\2\u00c4\r\3\2\2\2\u00c5\u00c6\5,\27\2"+
		"\u00c6\u00c7\7*\2\2\u00c7\u00d0\3\2\2\2\u00c8\u00d0\7&\2\2\u00c9\u00ca"+
		"\5.\30\2\u00ca\u00cb\7\b\2\2\u00cb\u00cc\5,\27\2\u00cc\u00cd\7\t\2\2\u00cd"+
		"\u00ce\7*\2\2\u00ce\u00d0\3\2\2\2\u00cf\u00c5\3\2\2\2\u00cf\u00c8\3\2"+
		"\2\2\u00cf\u00c9\3\2\2\2\u00d0\u00e0\3\2\2\2\u00d1\u00dc\7\f\2\2\u00d2"+
		"\u00d3\5,\27\2\u00d3\u00d4\7*\2\2\u00d4\u00dd\3\2\2\2\u00d5\u00dd\7&\2"+
		"\2\u00d6\u00d7\5.\30\2\u00d7\u00d8\7\b\2\2\u00d8\u00d9\5,\27\2\u00d9\u00da"+
		"\7\t\2\2\u00da\u00db\7*\2\2\u00db\u00dd\3\2\2\2\u00dc\u00d2\3\2\2\2\u00dc"+
		"\u00d5\3\2\2\2\u00dc\u00d6\3\2\2\2\u00dd\u00df\3\2\2\2\u00de\u00d1\3\2"+
		"\2\2\u00df\u00e2\3\2\2\2\u00e0\u00de\3\2\2\2\u00e0\u00e1\3\2\2\2\u00e1"+
		"\u00e4\3\2\2\2\u00e2\u00e0\3\2\2\2\u00e3\u00cf\3\2\2\2\u00e3\u00e4\3\2"+
		"\2\2\u00e4\u00e7\3\2\2\2\u00e5\u00e7\7\r\2\2\u00e6\u00e3\3\2\2\2\u00e6"+
		"\u00e5\3\2\2\2\u00e7\17\3\2\2\2\u00e8\u00e9\7*\2\2\u00e9\u00ea\7\4\2\2"+
		"\u00ea\u00eb\5\22\n\2\u00eb\u00ec\7\5\2\2\u00ec\21\3\2\2\2\u00ed\u00f2"+
		"\5\24\13\2\u00ee\u00ef\7\f\2\2\u00ef\u00f1\5\24\13\2\u00f0\u00ee\3\2\2"+
		"\2\u00f1\u00f4\3\2\2\2\u00f2\u00f0\3\2\2\2\u00f2\u00f3\3\2\2\2\u00f3\u00f7"+
		"\3\2\2\2\u00f4\u00f2\3\2\2\2\u00f5\u00f7\7\r\2\2\u00f6\u00ed\3\2\2\2\u00f6"+
		"\u00f5\3\2\2\2\u00f7\23\3\2\2\2\u00f8\u00fc\5\26\f\2\u00f9\u00fa\7*\2"+
		"\2\u00fa\u00fc\5\62\32\2\u00fb\u00f8\3\2\2\2\u00fb\u00f9\3\2\2\2\u00fc"+
		"\25\3\2\2\2\u00fd\u0102\5\30\r\2\u00fe\u00ff\t\2\2\2\u00ff\u0101\5\30"+
		"\r\2\u0100\u00fe\3\2\2\2\u0101\u0104\3\2\2\2\u0102\u0100\3\2\2\2\u0102"+
		"\u0103\3\2\2\2\u0103\27\3\2\2\2\u0104\u0102\3\2\2\2\u0105\u010a\5\32\16"+
		"\2\u0106\u0107\t\3\2\2\u0107\u0109\5\32\16\2\u0108\u0106\3\2\2\2\u0109"+
		"\u010c\3\2\2\2\u010a\u0108\3\2\2\2\u010a\u010b\3\2\2\2\u010b\31\3\2\2"+
		"\2\u010c\u010a\3\2\2\2\u010d\u010e\7\4\2\2\u010e\u010f\5\24\13\2\u010f"+
		"\u0110\7\5\2\2\u0110\u0116\3\2\2\2\u0111\u0116\5 \21\2\u0112\u0113\7)"+
		"\2\2\u0113\u0116\5\32\16\2\u0114\u0116\5\20\t\2\u0115\u010d\3\2\2\2\u0115"+
		"\u0111\3\2\2\2\u0115\u0112\3\2\2\2\u0115\u0114\3\2\2\2\u0116\33\3\2\2"+
		"\2\u0117\u0118\7*\2\2\u0118\u0119\7\21\2\2\u0119\u0121\5\26\f\2\u011a"+
		"\u011b\7*\2\2\u011b\u011c\7\21\2\2\u011c\u0121\5\20\t\2\u011d\u011e\7"+
		"*\2\2\u011e\u011f\7\21\2\2\u011f\u0121\7%\2\2\u0120\u0117\3\2\2\2\u0120"+
		"\u011a\3\2\2\2\u0120\u011d\3\2\2\2\u0121\35\3\2\2\2\u0122\u0123\5,\27"+
		"\2\u0123\u0124\5\34\17\2\u0124\u012e\3\2\2\2\u0125\u0126\5.\30\2\u0126"+
		"\u0127\7\b\2\2\u0127\u0128\5,\27\2\u0128\u0129\7\t\2\2\u0129\u012a\7*"+
		"\2\2\u012a\u012b\7\21\2\2\u012b\u012c\5\24\13\2\u012c\u012e\3\2\2\2\u012d"+
		"\u0122\3\2\2\2\u012d\u0125\3\2\2\2\u012e\37\3\2\2\2\u012f\u0139\7*\2\2"+
		"\u0130\u0139\5\66\34\2\u0131\u0132\7\22\2\2\u0132\u0133\5$\23\2\u0133"+
		"\u0134\7\23\2\2\u0134\u0139\3\2\2\2\u0135\u0139\5\20\t\2\u0136\u0139\5"+
		"\"\22\2\u0137\u0139\7%\2\2\u0138\u012f\3\2\2\2\u0138\u0130\3\2\2\2\u0138"+
		"\u0131\3\2\2\2\u0138\u0135\3\2\2\2\u0138\u0136\3\2\2\2\u0138\u0137\3\2"+
		"\2\2\u0139!\3\2\2\2\u013a\u013b\7*\2\2\u013b\u013c\7\22\2\2\u013c\u013d"+
		"\5*\26\2\u013d\u013e\7\23\2\2\u013e#\3\2\2\2\u013f\u0145\5&\24\2\u0140"+
		"\u0141\5&\24\2\u0141\u0142\7\3\2\2\u0142\u0143\5$\23\2\u0143\u0145\3\2"+
		"\2\2\u0144\u013f\3\2\2\2\u0144\u0140\3\2\2\2\u0145%\3\2\2\2\u0146\u014c"+
		"\5 \21\2\u0147\u0148\5 \21\2\u0148\u0149\7\f\2\2\u0149\u014a\5&\24\2\u014a"+
		"\u014c\3\2\2\2\u014b\u0146\3\2\2\2\u014b\u0147\3\2\2\2\u014c\'\3\2\2\2"+
		"\u014d\u0153\5\66\34\2\u014e\u014f\5\66\34\2\u014f\u0150\7\f\2\2\u0150"+
		"\u0151\5(\25\2\u0151\u0153\3\2\2\2\u0152\u014d\3\2\2\2\u0152\u014e\3\2"+
		"\2\2\u0153)\3\2\2\2\u0154\u0159\7!\2\2\u0155\u0156\7!\2\2\u0156\u0157"+
		"\7\f\2\2\u0157\u0159\7!\2\2\u0158\u0154\3\2\2\2\u0158\u0155\3\2\2\2\u0159"+
		"+\3\2\2\2\u015a\u015b\t\4\2\2\u015b-\3\2\2\2\u015c\u015d\t\5\2\2\u015d"+
		"/\3\2\2\2\u015e\u015f\t\6\2\2\u015f\61\3\2\2\2\u0160\u0161\t\7\2\2\u0161"+
		"\63\3\2\2\2\u0162\u0163\t\b\2\2\u0163\65\3\2\2\2\u0164\u0165\t\t\2\2\u0165"+
		"\67\3\2\2\2$;AT^krz~\u0084\u008b\u0092\u009e\u00a3\u00b0\u00ba\u00c1\u00cf"+
		"\u00dc\u00e0\u00e3\u00e6\u00f2\u00f6\u00fb\u0102\u010a\u0115\u0120\u012d"+
		"\u0138\u0144\u014b\u0152\u0158";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}