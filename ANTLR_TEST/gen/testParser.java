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
		IF=25, ELSE=26, MATRIX=27, INT=28, INTNUM=29, FLOAT=30, FLOATNUM=31, BOOL=32, 
		BOOLVAL=33, STRING=34, ROWVECTOR=35, COLVECTOR=36, SIGN=37, ID=38, WS=39, 
		NL=40, COMMENT=41, LINE_COMMENT=42;
	public static final int
		RULE_topLevel = 0, RULE_statement = 1, RULE_controlblock = 2, RULE_condition = 3, 
		RULE_functiondeclaration = 4, RULE_parameterlist = 5, RULE_functioncall = 6, 
		RULE_argumentlist = 7, RULE_expression = 8, RULE_addexpression = 9, RULE_multiexpression = 10, 
		RULE_primary = 11, RULE_assignment = 12, RULE_declaration = 13, RULE_value = 14, 
		RULE_collectionEntrance = 15, RULE_valueListList = 16, RULE_valueList = 17, 
		RULE_constantList = 18, RULE_dimension = 19, RULE_datatype = 20, RULE_collectiontype = 21, 
		RULE_infixBinaryOperator = 22, RULE_postUnaryOperator = 23, RULE_conditionalOperator = 24, 
		RULE_constant = 25;
	public static final String[] ruleNames = {
		"topLevel", "statement", "controlblock", "condition", "functiondeclaration", 
		"parameterlist", "functioncall", "argumentlist", "expression", "addexpression", 
		"multiexpression", "primary", "assignment", "declaration", "value", "collectionEntrance", 
		"valueListList", "valueList", "constantList", "dimension", "datatype", 
		"collectiontype", "infixBinaryOperator", "postUnaryOperator", "conditionalOperator", 
		"constant"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "';'", "'('", "')'", "'{'", "'}'", "'<'", "'>'", "'void'", "'return'", 
		"','", "''", "'+'", "'*'", "'/'", "'='", "'['", "']'", "'%'", "'++'", 
		"'--'", "'=='", "'!='", "'<='", "'>='", "'if'", "'else'", "'matrix'", 
		"'int'", null, "'float'", null, "'bool'", null, null, null, null, "'-'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, "IF", "ELSE", "MATRIX", "INT", "INTNUM", "FLOAT", "FLOATNUM", "BOOL", 
		"BOOLVAL", "STRING", "ROWVECTOR", "COLVECTOR", "SIGN", "ID", "WS", "NL", 
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
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__15) | (1L << IF) | (1L << MATRIX) | (1L << INT) | (1L << INTNUM) | (1L << FLOAT) | (1L << FLOATNUM) | (1L << BOOL) | (1L << BOOLVAL) | (1L << ROWVECTOR) | (1L << COLVECTOR) | (1L << SIGN) | (1L << ID))) != 0)) {
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
			setState(79);
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
			setState(81); 
			match(IF);
			setState(82); 
			match(T__1);
			setState(83); 
			condition();
			setState(84); 
			match(T__2);
			setState(85); 
			match(T__3);
			setState(86); 
			statement();
			setState(87); 
			match(T__4);
			setState(99);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(88); 
					match(ELSE);
					setState(89); 
					match(IF);
					setState(90); 
					match(T__1);
					setState(91); 
					condition();
					setState(92); 
					match(T__2);
					setState(93); 
					match(T__3);
					setState(94); 
					statement();
					setState(95); 
					match(T__4);
					}
					} 
				}
				setState(101);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			}
			setState(107);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(102); 
				match(ELSE);
				setState(103); 
				match(T__3);
				setState(104); 
				statement();
				setState(105); 
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
		public TerminalNode BOOLVAL() { return getToken(testParser.BOOLVAL, 0); }
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
		enterRule(_localctx, 6, RULE_condition);
		try {
			setState(114);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(109); 
				expression();
				setState(110); 
				conditionalOperator();
				setState(111); 
				expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(113); 
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
		enterRule(_localctx, 8, RULE_functiondeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			switch (_input.LA(1)) {
			case INT:
			case FLOAT:
			case BOOL:
				{
				setState(116); 
				datatype();
				}
				break;
			case MATRIX:
			case ROWVECTOR:
			case COLVECTOR:
				{
				setState(117); 
				collectiontype();
				setState(118); 
				match(T__5);
				setState(119); 
				datatype();
				setState(120); 
				match(T__6);
				}
				break;
			case T__7:
				{
				setState(122); 
				match(T__7);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(125); 
			match(ID);
			setState(126); 
			match(T__1);
			setState(127); 
			parameterlist();
			setState(128); 
			match(T__2);
			setState(129); 
			match(T__3);
			setState(133);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__15) | (1L << IF) | (1L << MATRIX) | (1L << INT) | (1L << INTNUM) | (1L << FLOAT) | (1L << FLOATNUM) | (1L << BOOL) | (1L << BOOLVAL) | (1L << ROWVECTOR) | (1L << COLVECTOR) | (1L << SIGN) | (1L << ID))) != 0)) {
				{
				{
				setState(130); 
				statement();
				}
				}
				setState(135);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(140);
			_la = _input.LA(1);
			if (_la==T__8) {
				{
				setState(136); 
				match(T__8);
				setState(137); 
				expression();
				setState(138); 
				match(T__0);
				}
			}

			setState(142); 
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
		enterRule(_localctx, 10, RULE_parameterlist);
		int _la;
		try {
			setState(177);
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
				setState(174);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MATRIX) | (1L << INT) | (1L << FLOAT) | (1L << BOOL) | (1L << STRING) | (1L << ROWVECTOR) | (1L << COLVECTOR))) != 0)) {
					{
					setState(154);
					switch (_input.LA(1)) {
					case INT:
					case FLOAT:
					case BOOL:
						{
						setState(144); 
						datatype();
						setState(145); 
						match(ID);
						}
						break;
					case STRING:
						{
						setState(147); 
						match(STRING);
						}
						break;
					case MATRIX:
					case ROWVECTOR:
					case COLVECTOR:
						{
						setState(148); 
						collectiontype();
						setState(149); 
						match(T__5);
						setState(150); 
						datatype();
						setState(151); 
						match(T__6);
						setState(152); 
						match(ID);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(171);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__9) {
						{
						{
						setState(156); 
						match(T__9);
						setState(167);
						switch (_input.LA(1)) {
						case INT:
						case FLOAT:
						case BOOL:
							{
							setState(157); 
							datatype();
							setState(158); 
							match(ID);
							}
							break;
						case STRING:
							{
							setState(160); 
							match(STRING);
							}
							break;
						case MATRIX:
						case ROWVECTOR:
						case COLVECTOR:
							{
							setState(161); 
							collectiontype();
							setState(162); 
							match(T__5);
							setState(163); 
							datatype();
							setState(164); 
							match(T__6);
							setState(165); 
							match(ID);
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						}
						}
						setState(173);
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
				setState(176); 
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
		enterRule(_localctx, 12, RULE_functioncall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(179); 
			match(ID);
			setState(180); 
			match(T__1);
			setState(181); 
			argumentlist();
			setState(182); 
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
		enterRule(_localctx, 14, RULE_argumentlist);
		int _la;
		try {
			setState(193);
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
				setState(184); 
				expression();
				setState(189);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__9) {
					{
					{
					setState(185); 
					match(T__9);
					setState(186); 
					expression();
					}
					}
					setState(191);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 2);
				{
				setState(192); 
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
		enterRule(_localctx, 16, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(195); 
			addexpression();
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
		enterRule(_localctx, 18, RULE_addexpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(197); 
			multiexpression();
			setState(202);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__11 || _la==SIGN) {
				{
				{
				setState(198);
				_la = _input.LA(1);
				if ( !(_la==T__11 || _la==SIGN) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(199); 
				multiexpression();
				}
				}
				setState(204);
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
		enterRule(_localctx, 20, RULE_multiexpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(205); 
			primary();
			setState(210);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__12 || _la==T__13) {
				{
				{
				setState(206);
				_la = _input.LA(1);
				if ( !(_la==T__12 || _la==T__13) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(207); 
				primary();
				}
				}
				setState(212);
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
		enterRule(_localctx, 22, RULE_primary);
		try {
			setState(221);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(213); 
				match(T__1);
				setState(214); 
				expression();
				setState(215); 
				match(T__2);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(217); 
				value();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(218); 
				match(SIGN);
				setState(219); 
				primary();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(220); 
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
		enterRule(_localctx, 24, RULE_assignment);
		try {
			setState(232);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(223); 
				match(ID);
				setState(224); 
				match(T__14);
				setState(225); 
				addexpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(226); 
				match(ID);
				setState(227); 
				match(T__14);
				setState(228); 
				functioncall();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(229); 
				match(ID);
				setState(230); 
				match(T__14);
				setState(231); 
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
		public DimensionContext dimension() {
			return getRuleContext(DimensionContext.class,0);
		}
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
		enterRule(_localctx, 26, RULE_declaration);
		try {
			setState(248);
			switch (_input.LA(1)) {
			case INT:
			case FLOAT:
			case BOOL:
				enterOuterAlt(_localctx, 1);
				{
				setState(234); 
				datatype();
				setState(235); 
				assignment();
				}
				break;
			case MATRIX:
			case ROWVECTOR:
			case COLVECTOR:
				enterOuterAlt(_localctx, 2);
				{
				setState(237); 
				collectiontype();
				setState(238); 
				match(T__5);
				setState(239); 
				datatype();
				setState(240); 
				match(T__6);
				setState(241); 
				match(ID);
				setState(242); 
				match(T__15);
				setState(243); 
				dimension();
				setState(244); 
				match(T__16);
				setState(245); 
				match(T__14);
				setState(246); 
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
		enterRule(_localctx, 28, RULE_value);
		try {
			setState(259);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(250); 
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(251); 
				constant();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(252); 
				match(T__15);
				setState(253); 
				valueListList();
				setState(254); 
				match(T__16);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(256); 
				functioncall();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(257); 
				collectionEntrance();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(258); 
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
		public DimensionContext dimension() {
			return getRuleContext(DimensionContext.class,0);
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
		enterRule(_localctx, 30, RULE_collectionEntrance);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(261); 
			match(ID);
			setState(262); 
			match(T__15);
			setState(263); 
			dimension();
			setState(264); 
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
		enterRule(_localctx, 32, RULE_valueListList);
		try {
			setState(271);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(266); 
				valueList();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(267); 
				valueList();
				setState(268); 
				match(T__0);
				setState(269); 
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
		enterRule(_localctx, 34, RULE_valueList);
		try {
			setState(278);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(273); 
				value();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(274); 
				value();
				setState(275); 
				match(T__9);
				setState(276); 
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
		enterRule(_localctx, 36, RULE_constantList);
		try {
			setState(285);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(280); 
				constant();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(281); 
				constant();
				setState(282); 
				match(T__9);
				setState(283); 
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

	public static class DimensionContext extends ParserRuleContext {
		public List<TerminalNode> INTNUM() { return getTokens(testParser.INTNUM); }
		public TerminalNode INTNUM(int i) {
			return getToken(testParser.INTNUM, i);
		}
		public DimensionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dimension; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).enterDimension(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).exitDimension(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof testVisitor ) return ((testVisitor<? extends T>)visitor).visitDimension(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DimensionContext dimension() throws RecognitionException {
		DimensionContext _localctx = new DimensionContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_dimension);
		try {
			setState(291);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(287); 
				match(INTNUM);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(288); 
				match(INTNUM);
				setState(289); 
				match(T__9);
				setState(290); 
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
		enterRule(_localctx, 40, RULE_datatype);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(293);
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
		enterRule(_localctx, 42, RULE_collectiontype);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(295);
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
		enterRule(_localctx, 44, RULE_infixBinaryOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(297);
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
		enterRule(_localctx, 46, RULE_postUnaryOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(299);
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
		enterRule(_localctx, 48, RULE_conditionalOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(301);
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
		enterRule(_localctx, 50, RULE_constant);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(303);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3,\u0134\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\3\2\7\28\n\2\f\2\16\2;\13\2\3\2\7\2>\n\2\f\2\16\2"+
		"A\13\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3"+
		"R\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\7\4d\n\4\f\4\16\4g\13\4\3\4\3\4\3\4\3\4\3\4\5\4n\n\4\3\5\3\5\3\5\3\5"+
		"\3\5\5\5u\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6~\n\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\7\6\u0086\n\6\f\6\16\6\u0089\13\6\3\6\3\6\3\6\3\6\5\6\u008f\n\6\3"+
		"\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u009d\n\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u00aa\n\7\7\7\u00ac\n\7\f\7\16"+
		"\7\u00af\13\7\5\7\u00b1\n\7\3\7\5\7\u00b4\n\7\3\b\3\b\3\b\3\b\3\b\3\t"+
		"\3\t\3\t\7\t\u00be\n\t\f\t\16\t\u00c1\13\t\3\t\5\t\u00c4\n\t\3\n\3\n\3"+
		"\13\3\13\3\13\7\13\u00cb\n\13\f\13\16\13\u00ce\13\13\3\f\3\f\3\f\7\f\u00d3"+
		"\n\f\f\f\16\f\u00d6\13\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u00e0\n\r"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u00eb\n\16\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u00fb"+
		"\n\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u0106\n\20\3\21"+
		"\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\5\22\u0112\n\22\3\23\3\23"+
		"\3\23\3\23\3\23\5\23\u0119\n\23\3\24\3\24\3\24\3\24\3\24\5\24\u0120\n"+
		"\24\3\25\3\25\3\25\3\25\5\25\u0126\n\25\3\26\3\26\3\27\3\27\3\30\3\30"+
		"\3\31\3\31\3\32\3\32\3\33\3\33\3\33\2\2\34\2\4\6\b\n\f\16\20\22\24\26"+
		"\30\32\34\36 \"$&(*,.\60\62\64\2\n\4\2\16\16\'\'\3\2\17\20\5\2\36\36 "+
		" \"\"\4\2\35\35%&\5\2\16\20\24\24\'\'\3\2\25\26\4\2\b\t\27\32\4\2\37\37"+
		"!!\u0140\29\3\2\2\2\4Q\3\2\2\2\6S\3\2\2\2\bt\3\2\2\2\n}\3\2\2\2\f\u00b3"+
		"\3\2\2\2\16\u00b5\3\2\2\2\20\u00c3\3\2\2\2\22\u00c5\3\2\2\2\24\u00c7\3"+
		"\2\2\2\26\u00cf\3\2\2\2\30\u00df\3\2\2\2\32\u00ea\3\2\2\2\34\u00fa\3\2"+
		"\2\2\36\u0105\3\2\2\2 \u0107\3\2\2\2\"\u0111\3\2\2\2$\u0118\3\2\2\2&\u011f"+
		"\3\2\2\2(\u0125\3\2\2\2*\u0127\3\2\2\2,\u0129\3\2\2\2.\u012b\3\2\2\2\60"+
		"\u012d\3\2\2\2\62\u012f\3\2\2\2\64\u0131\3\2\2\2\668\5\n\6\2\67\66\3\2"+
		"\2\28;\3\2\2\29\67\3\2\2\29:\3\2\2\2:?\3\2\2\2;9\3\2\2\2<>\5\4\3\2=<\3"+
		"\2\2\2>A\3\2\2\2?=\3\2\2\2?@\3\2\2\2@B\3\2\2\2A?\3\2\2\2BC\7\2\2\3C\3"+
		"\3\2\2\2DE\5\22\n\2EF\7\3\2\2FR\3\2\2\2GH\5\32\16\2HI\7\3\2\2IR\3\2\2"+
		"\2JK\5\34\17\2KL\7\3\2\2LR\3\2\2\2MN\5\16\b\2NO\7\3\2\2OR\3\2\2\2PR\5"+
		"\6\4\2QD\3\2\2\2QG\3\2\2\2QJ\3\2\2\2QM\3\2\2\2QP\3\2\2\2R\5\3\2\2\2ST"+
		"\7\33\2\2TU\7\4\2\2UV\5\b\5\2VW\7\5\2\2WX\7\6\2\2XY\5\4\3\2Ye\7\7\2\2"+
		"Z[\7\34\2\2[\\\7\33\2\2\\]\7\4\2\2]^\5\b\5\2^_\7\5\2\2_`\7\6\2\2`a\5\4"+
		"\3\2ab\7\7\2\2bd\3\2\2\2cZ\3\2\2\2dg\3\2\2\2ec\3\2\2\2ef\3\2\2\2fm\3\2"+
		"\2\2ge\3\2\2\2hi\7\34\2\2ij\7\6\2\2jk\5\4\3\2kl\7\7\2\2ln\3\2\2\2mh\3"+
		"\2\2\2mn\3\2\2\2n\7\3\2\2\2op\5\22\n\2pq\5\62\32\2qr\5\22\n\2ru\3\2\2"+
		"\2su\7#\2\2to\3\2\2\2ts\3\2\2\2u\t\3\2\2\2v~\5*\26\2wx\5,\27\2xy\7\b\2"+
		"\2yz\5*\26\2z{\7\t\2\2{~\3\2\2\2|~\7\n\2\2}v\3\2\2\2}w\3\2\2\2}|\3\2\2"+
		"\2~\177\3\2\2\2\177\u0080\7(\2\2\u0080\u0081\7\4\2\2\u0081\u0082\5\f\7"+
		"\2\u0082\u0083\7\5\2\2\u0083\u0087\7\6\2\2\u0084\u0086\5\4\3\2\u0085\u0084"+
		"\3\2\2\2\u0086\u0089\3\2\2\2\u0087\u0085\3\2\2\2\u0087\u0088\3\2\2\2\u0088"+
		"\u008e\3\2\2\2\u0089\u0087\3\2\2\2\u008a\u008b\7\13\2\2\u008b\u008c\5"+
		"\22\n\2\u008c\u008d\7\3\2\2\u008d\u008f\3\2\2\2\u008e\u008a\3\2\2\2\u008e"+
		"\u008f\3\2\2\2\u008f\u0090\3\2\2\2\u0090\u0091\7\7\2\2\u0091\13\3\2\2"+
		"\2\u0092\u0093\5*\26\2\u0093\u0094\7(\2\2\u0094\u009d\3\2\2\2\u0095\u009d"+
		"\7$\2\2\u0096\u0097\5,\27\2\u0097\u0098\7\b\2\2\u0098\u0099\5*\26\2\u0099"+
		"\u009a\7\t\2\2\u009a\u009b\7(\2\2\u009b\u009d\3\2\2\2\u009c\u0092\3\2"+
		"\2\2\u009c\u0095\3\2\2\2\u009c\u0096\3\2\2\2\u009d\u00ad\3\2\2\2\u009e"+
		"\u00a9\7\f\2\2\u009f\u00a0\5*\26\2\u00a0\u00a1\7(\2\2\u00a1\u00aa\3\2"+
		"\2\2\u00a2\u00aa\7$\2\2\u00a3\u00a4\5,\27\2\u00a4\u00a5\7\b\2\2\u00a5"+
		"\u00a6\5*\26\2\u00a6\u00a7\7\t\2\2\u00a7\u00a8\7(\2\2\u00a8\u00aa\3\2"+
		"\2\2\u00a9\u009f\3\2\2\2\u00a9\u00a2\3\2\2\2\u00a9\u00a3\3\2\2\2\u00aa"+
		"\u00ac\3\2\2\2\u00ab\u009e\3\2\2\2\u00ac\u00af\3\2\2\2\u00ad\u00ab\3\2"+
		"\2\2\u00ad\u00ae\3\2\2\2\u00ae\u00b1\3\2\2\2\u00af\u00ad\3\2\2\2\u00b0"+
		"\u009c\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1\u00b4\3\2\2\2\u00b2\u00b4\7\r"+
		"\2\2\u00b3\u00b0\3\2\2\2\u00b3\u00b2\3\2\2\2\u00b4\r\3\2\2\2\u00b5\u00b6"+
		"\7(\2\2\u00b6\u00b7\7\4\2\2\u00b7\u00b8\5\20\t\2\u00b8\u00b9\7\5\2\2\u00b9"+
		"\17\3\2\2\2\u00ba\u00bf\5\22\n\2\u00bb\u00bc\7\f\2\2\u00bc\u00be\5\22"+
		"\n\2\u00bd\u00bb\3\2\2\2\u00be\u00c1\3\2\2\2\u00bf\u00bd\3\2\2\2\u00bf"+
		"\u00c0\3\2\2\2\u00c0\u00c4\3\2\2\2\u00c1\u00bf\3\2\2\2\u00c2\u00c4\7\r"+
		"\2\2\u00c3\u00ba\3\2\2\2\u00c3\u00c2\3\2\2\2\u00c4\21\3\2\2\2\u00c5\u00c6"+
		"\5\24\13\2\u00c6\23\3\2\2\2\u00c7\u00cc\5\26\f\2\u00c8\u00c9\t\2\2\2\u00c9"+
		"\u00cb\5\26\f\2\u00ca\u00c8\3\2\2\2\u00cb\u00ce\3\2\2\2\u00cc\u00ca\3"+
		"\2\2\2\u00cc\u00cd\3\2\2\2\u00cd\25\3\2\2\2\u00ce\u00cc\3\2\2\2\u00cf"+
		"\u00d4\5\30\r\2\u00d0\u00d1\t\3\2\2\u00d1\u00d3\5\30\r\2\u00d2\u00d0\3"+
		"\2\2\2\u00d3\u00d6\3\2\2\2\u00d4\u00d2\3\2\2\2\u00d4\u00d5\3\2\2\2\u00d5"+
		"\27\3\2\2\2\u00d6\u00d4\3\2\2\2\u00d7\u00d8\7\4\2\2\u00d8\u00d9\5\22\n"+
		"\2\u00d9\u00da\7\5\2\2\u00da\u00e0\3\2\2\2\u00db\u00e0\5\36\20\2\u00dc"+
		"\u00dd\7\'\2\2\u00dd\u00e0\5\30\r\2\u00de\u00e0\5\16\b\2\u00df\u00d7\3"+
		"\2\2\2\u00df\u00db\3\2\2\2\u00df\u00dc\3\2\2\2\u00df\u00de\3\2\2\2\u00e0"+
		"\31\3\2\2\2\u00e1\u00e2\7(\2\2\u00e2\u00e3\7\21\2\2\u00e3\u00eb\5\24\13"+
		"\2\u00e4\u00e5\7(\2\2\u00e5\u00e6\7\21\2\2\u00e6\u00eb\5\16\b\2\u00e7"+
		"\u00e8\7(\2\2\u00e8\u00e9\7\21\2\2\u00e9\u00eb\7#\2\2\u00ea\u00e1\3\2"+
		"\2\2\u00ea\u00e4\3\2\2\2\u00ea\u00e7\3\2\2\2\u00eb\33\3\2\2\2\u00ec\u00ed"+
		"\5*\26\2\u00ed\u00ee\5\32\16\2\u00ee\u00fb\3\2\2\2\u00ef\u00f0\5,\27\2"+
		"\u00f0\u00f1\7\b\2\2\u00f1\u00f2\5*\26\2\u00f2\u00f3\7\t\2\2\u00f3\u00f4"+
		"\7(\2\2\u00f4\u00f5\7\22\2\2\u00f5\u00f6\5(\25\2\u00f6\u00f7\7\23\2\2"+
		"\u00f7\u00f8\7\21\2\2\u00f8\u00f9\5\22\n\2\u00f9\u00fb\3\2\2\2\u00fa\u00ec"+
		"\3\2\2\2\u00fa\u00ef\3\2\2\2\u00fb\35\3\2\2\2\u00fc\u0106\7(\2\2\u00fd"+
		"\u0106\5\64\33\2\u00fe\u00ff\7\22\2\2\u00ff\u0100\5\"\22\2\u0100\u0101"+
		"\7\23\2\2\u0101\u0106\3\2\2\2\u0102\u0106\5\16\b\2\u0103\u0106\5 \21\2"+
		"\u0104\u0106\7#\2\2\u0105\u00fc\3\2\2\2\u0105\u00fd\3\2\2\2\u0105\u00fe"+
		"\3\2\2\2\u0105\u0102\3\2\2\2\u0105\u0103\3\2\2\2\u0105\u0104\3\2\2\2\u0106"+
		"\37\3\2\2\2\u0107\u0108\7(\2\2\u0108\u0109\7\22\2\2\u0109\u010a\5(\25"+
		"\2\u010a\u010b\7\23\2\2\u010b!\3\2\2\2\u010c\u0112\5$\23\2\u010d\u010e"+
		"\5$\23\2\u010e\u010f\7\3\2\2\u010f\u0110\5\"\22\2\u0110\u0112\3\2\2\2"+
		"\u0111\u010c\3\2\2\2\u0111\u010d\3\2\2\2\u0112#\3\2\2\2\u0113\u0119\5"+
		"\36\20\2\u0114\u0115\5\36\20\2\u0115\u0116\7\f\2\2\u0116\u0117\5$\23\2"+
		"\u0117\u0119\3\2\2\2\u0118\u0113\3\2\2\2\u0118\u0114\3\2\2\2\u0119%\3"+
		"\2\2\2\u011a\u0120\5\64\33\2\u011b\u011c\5\64\33\2\u011c\u011d\7\f\2\2"+
		"\u011d\u011e\5&\24\2\u011e\u0120\3\2\2\2\u011f\u011a\3\2\2\2\u011f\u011b"+
		"\3\2\2\2\u0120\'\3\2\2\2\u0121\u0126\7\37\2\2\u0122\u0123\7\37\2\2\u0123"+
		"\u0124\7\f\2\2\u0124\u0126\7\37\2\2\u0125\u0121\3\2\2\2\u0125\u0122\3"+
		"\2\2\2\u0126)\3\2\2\2\u0127\u0128\t\4\2\2\u0128+\3\2\2\2\u0129\u012a\t"+
		"\5\2\2\u012a-\3\2\2\2\u012b\u012c\t\6\2\2\u012c/\3\2\2\2\u012d\u012e\t"+
		"\7\2\2\u012e\61\3\2\2\2\u012f\u0130\t\b\2\2\u0130\63\3\2\2\2\u0131\u0132"+
		"\t\t\2\2\u0132\65\3\2\2\2\349?Qemt}\u0087\u008e\u009c\u00a9\u00ad\u00b0"+
		"\u00b3\u00bf\u00c3\u00cc\u00d4\u00df\u00ea\u00fa\u0105\u0111\u0118\u011f"+
		"\u0125";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}