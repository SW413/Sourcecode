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
		RULE_loop = 4, RULE_condition = 5, RULE_functiondeclaration = 6, RULE_functionbody = 7, 
		RULE_parameterlist = 8, RULE_functioncall = 9, RULE_argumentlist = 10, 
		RULE_expression = 11, RULE_addexpression = 12, RULE_multiexpression = 13, 
		RULE_primary = 14, RULE_assignment = 15, RULE_valassignment = 16, RULE_collectionassignment = 17, 
		RULE_declaration = 18, RULE_value = 19, RULE_collectionEntrance = 20, 
		RULE_valueList = 21, RULE_constantList = 22, RULE_entranceCoordinate = 23, 
		RULE_datatype = 24, RULE_collectiontype = 25, RULE_infixBinaryOperator = 26, 
		RULE_postUnaryOperator = 27, RULE_conditionalOperator = 28, RULE_constant = 29;
	public static final String[] ruleNames = {
		"topLevel", "statement", "importing", "controlblock", "loop", "condition", 
		"functiondeclaration", "functionbody", "parameterlist", "functioncall", 
		"argumentlist", "expression", "addexpression", "multiexpression", "primary", 
		"assignment", "valassignment", "collectionassignment", "declaration", 
		"value", "collectionEntrance", "valueList", "constantList", "entranceCoordinate", 
		"datatype", "collectiontype", "infixBinaryOperator", "postUnaryOperator", 
		"conditionalOperator", "constant"
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ourLangVisitor ) return ((ourLangVisitor<? extends T>)visitor).visitTopLevel(this);
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
			setState(63);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IMPORT) {
				{
				{
				setState(60);
				importing();
				}
				}
				setState(65);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(69);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(66);
					functiondeclaration();
					}
					} 
				}
				setState(71);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			setState(75);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__14) | (1L << IF) | (1L << WHILE) | (1L << FOR) | (1L << MATRIX) | (1L << ROWVECTOR) | (1L << COLVECTOR) | (1L << INT) | (1L << INTNUM) | (1L << FLOAT) | (1L << FLOATNUM) | (1L << BOOL) | (1L << BOOLVAL) | (1L << SIGN) | (1L << ID))) != 0)) {
				{
				{
				setState(72);
				statement();
				}
				}
				setState(77);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(78);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ourLangVisitor ) return ((ourLangVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			setState(94);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(80);
				expression();
				setState(81);
				match(T__0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(83);
				assignment();
				setState(84);
				match(T__0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(86);
				declaration();
				setState(87);
				match(T__0);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(89);
				functioncall();
				setState(90);
				match(T__0);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(92);
				controlblock();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(93);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ourLangVisitor ) return ((ourLangVisitor<? extends T>)visitor).visitImporting(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportingContext importing() throws RecognitionException {
		ImportingContext _localctx = new ImportingContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_importing);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(96);
			match(IMPORT);
			setState(97);
			match(T__1);
			setState(98);
			match(LIBRARY);
			setState(99);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ourLangVisitor ) return ((ourLangVisitor<? extends T>)visitor).visitControlblock(this);
			else return visitor.visitChildren(this);
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
			setState(101);
			match(IF);
			setState(102);
			match(T__3);
			setState(103);
			condition();
			setState(104);
			match(T__4);
			setState(105);
			match(T__5);
			setState(109);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__14) | (1L << IF) | (1L << WHILE) | (1L << FOR) | (1L << MATRIX) | (1L << ROWVECTOR) | (1L << COLVECTOR) | (1L << INT) | (1L << INTNUM) | (1L << FLOAT) | (1L << FLOATNUM) | (1L << BOOL) | (1L << BOOLVAL) | (1L << SIGN) | (1L << ID))) != 0)) {
				{
				{
				setState(106);
				statement();
				}
				}
				setState(111);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(112);
			match(T__6);
			setState(129);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(113);
					match(ELSE);
					setState(114);
					match(IF);
					setState(115);
					match(T__3);
					setState(116);
					condition();
					setState(117);
					match(T__4);
					setState(118);
					match(T__5);
					setState(122);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__14) | (1L << IF) | (1L << WHILE) | (1L << FOR) | (1L << MATRIX) | (1L << ROWVECTOR) | (1L << COLVECTOR) | (1L << INT) | (1L << INTNUM) | (1L << FLOAT) | (1L << FLOATNUM) | (1L << BOOL) | (1L << BOOLVAL) | (1L << SIGN) | (1L << ID))) != 0)) {
						{
						{
						setState(119);
						statement();
						}
						}
						setState(124);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(125);
					match(T__6);
					}
					} 
				}
				setState(131);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			}
			setState(141);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(132);
				match(ELSE);
				setState(133);
				match(T__5);
				setState(137);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__14) | (1L << IF) | (1L << WHILE) | (1L << FOR) | (1L << MATRIX) | (1L << ROWVECTOR) | (1L << COLVECTOR) | (1L << INT) | (1L << INTNUM) | (1L << FLOAT) | (1L << FLOATNUM) | (1L << BOOL) | (1L << BOOLVAL) | (1L << SIGN) | (1L << ID))) != 0)) {
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ourLangVisitor ) return ((ourLangVisitor<? extends T>)visitor).visitLoop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LoopContext loop() throws RecognitionException {
		LoopContext _localctx = new LoopContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_loop);
		int _la;
		try {
			setState(178);
			switch (_input.LA(1)) {
			case WHILE:
				enterOuterAlt(_localctx, 1);
				{
				setState(143);
				match(WHILE);
				setState(144);
				match(T__3);
				setState(147);
				switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
				case 1:
					{
					setState(145);
					condition();
					}
					break;
				case 2:
					{
					setState(146);
					match(BOOLVAL);
					}
					break;
				}
				setState(149);
				match(T__4);
				setState(150);
				match(T__5);
				setState(154);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__14) | (1L << IF) | (1L << WHILE) | (1L << FOR) | (1L << MATRIX) | (1L << ROWVECTOR) | (1L << COLVECTOR) | (1L << INT) | (1L << INTNUM) | (1L << FLOAT) | (1L << FLOATNUM) | (1L << BOOL) | (1L << BOOLVAL) | (1L << SIGN) | (1L << ID))) != 0)) {
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
				match(T__6);
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 2);
				{
				setState(158);
				match(FOR);
				setState(159);
				match(T__3);
				setState(161);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << FLOAT) | (1L << BOOL))) != 0)) {
					{
					setState(160);
					datatype();
					}
				}

				setState(163);
				assignment();
				setState(164);
				match(T__0);
				setState(165);
				condition();
				setState(166);
				match(T__0);
				setState(167);
				expression();
				setState(168);
				match(T__4);
				setState(169);
				match(T__5);
				setState(173);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__14) | (1L << IF) | (1L << WHILE) | (1L << FOR) | (1L << MATRIX) | (1L << ROWVECTOR) | (1L << COLVECTOR) | (1L << INT) | (1L << INTNUM) | (1L << FLOAT) | (1L << FLOATNUM) | (1L << BOOL) | (1L << BOOLVAL) | (1L << SIGN) | (1L << ID))) != 0)) {
					{
					{
					setState(170);
					statement();
					}
					}
					setState(175);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(176);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ourLangVisitor ) return ((ourLangVisitor<? extends T>)visitor).visitCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_condition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(180);
			expression();
			setState(181);
			conditionalOperator();
			setState(182);
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
		public FunctionbodyContext functionbody() {
			return getRuleContext(FunctionbodyContext.class,0);
		}
		public DatatypeContext datatype() {
			return getRuleContext(DatatypeContext.class,0);
		}
		public CollectiontypeContext collectiontype() {
			return getRuleContext(CollectiontypeContext.class,0);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ourLangVisitor ) return ((ourLangVisitor<? extends T>)visitor).visitFunctiondeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctiondeclarationContext functiondeclaration() throws RecognitionException {
		FunctiondeclarationContext _localctx = new FunctiondeclarationContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_functiondeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(191);
			switch (_input.LA(1)) {
			case INT:
			case FLOAT:
			case BOOL:
				{
				setState(184);
				datatype();
				}
				break;
			case MATRIX:
			case ROWVECTOR:
			case COLVECTOR:
				{
				setState(185);
				collectiontype();
				setState(186);
				match(T__1);
				setState(187);
				datatype();
				setState(188);
				match(T__2);
				}
				break;
			case T__7:
				{
				setState(190);
				match(T__7);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(193);
			match(ID);
			setState(194);
			match(T__3);
			setState(195);
			parameterlist();
			setState(196);
			match(T__4);
			setState(197);
			functionbody();
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

	public static class FunctionbodyContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public FunctionbodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionbody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ourLangListener ) ((ourLangListener)listener).enterFunctionbody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ourLangListener ) ((ourLangListener)listener).exitFunctionbody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ourLangVisitor ) return ((ourLangVisitor<? extends T>)visitor).visitFunctionbody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionbodyContext functionbody() throws RecognitionException {
		FunctionbodyContext _localctx = new FunctionbodyContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_functionbody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(199);
			match(T__5);
			setState(203);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__14) | (1L << IF) | (1L << WHILE) | (1L << FOR) | (1L << MATRIX) | (1L << ROWVECTOR) | (1L << COLVECTOR) | (1L << INT) | (1L << INTNUM) | (1L << FLOAT) | (1L << FLOATNUM) | (1L << BOOL) | (1L << BOOLVAL) | (1L << SIGN) | (1L << ID))) != 0)) {
				{
				{
				setState(200);
				statement();
				}
				}
				setState(205);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(210);
			_la = _input.LA(1);
			if (_la==T__8) {
				{
				setState(206);
				match(T__8);
				setState(207);
				expression();
				setState(208);
				match(T__0);
				}
			}

			setState(212);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ourLangVisitor ) return ((ourLangVisitor<? extends T>)visitor).visitParameterlist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterlistContext parameterlist() throws RecognitionException {
		ParameterlistContext _localctx = new ParameterlistContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_parameterlist);
		int _la;
		try {
			setState(247);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(244);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MATRIX) | (1L << ROWVECTOR) | (1L << COLVECTOR) | (1L << INT) | (1L << FLOAT) | (1L << BOOL) | (1L << STRING))) != 0)) {
					{
					setState(224);
					switch (_input.LA(1)) {
					case INT:
					case FLOAT:
					case BOOL:
						{
						setState(214);
						datatype();
						setState(215);
						match(ID);
						}
						break;
					case STRING:
						{
						setState(217);
						match(STRING);
						}
						break;
					case MATRIX:
					case ROWVECTOR:
					case COLVECTOR:
						{
						setState(218);
						collectiontype();
						setState(219);
						match(T__1);
						setState(220);
						datatype();
						setState(221);
						match(T__2);
						setState(222);
						match(ID);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(241);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__9) {
						{
						{
						setState(226);
						match(T__9);
						setState(237);
						switch (_input.LA(1)) {
						case INT:
						case FLOAT:
						case BOOL:
							{
							setState(227);
							datatype();
							setState(228);
							match(ID);
							}
							break;
						case STRING:
							{
							setState(230);
							match(STRING);
							}
							break;
						case MATRIX:
						case ROWVECTOR:
						case COLVECTOR:
							{
							setState(231);
							collectiontype();
							setState(232);
							match(T__1);
							setState(233);
							datatype();
							setState(234);
							match(T__2);
							setState(235);
							match(ID);
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						}
						}
						setState(243);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ourLangVisitor ) return ((ourLangVisitor<? extends T>)visitor).visitFunctioncall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctioncallContext functioncall() throws RecognitionException {
		FunctioncallContext _localctx = new FunctioncallContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_functioncall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(249);
			match(ID);
			setState(250);
			match(T__3);
			setState(251);
			argumentlist();
			setState(252);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ourLangVisitor ) return ((ourLangVisitor<? extends T>)visitor).visitArgumentlist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentlistContext argumentlist() throws RecognitionException {
		ArgumentlistContext _localctx = new ArgumentlistContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_argumentlist);
		int _la;
		try {
			setState(264);
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
				setState(254);
				expression();
				setState(259);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__9) {
					{
					{
					setState(255);
					match(T__9);
					setState(256);
					expression();
					}
					}
					setState(261);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(262);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ourLangVisitor ) return ((ourLangVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_expression);
		try {
			setState(269);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(266);
				addexpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(267);
				match(ID);
				setState(268);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ourLangVisitor ) return ((ourLangVisitor<? extends T>)visitor).visitAddexpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AddexpressionContext addexpression() throws RecognitionException {
		AddexpressionContext _localctx = new AddexpressionContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_addexpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(271);
			multiexpression();
			setState(276);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__10 || _la==SIGN) {
				{
				{
				setState(272);
				_la = _input.LA(1);
				if ( !(_la==T__10 || _la==SIGN) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(273);
				multiexpression();
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ourLangVisitor ) return ((ourLangVisitor<? extends T>)visitor).visitMultiexpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultiexpressionContext multiexpression() throws RecognitionException {
		MultiexpressionContext _localctx = new MultiexpressionContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_multiexpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(279);
			primary();
			setState(284);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__11 || _la==T__12) {
				{
				{
				setState(280);
				_la = _input.LA(1);
				if ( !(_la==T__11 || _la==T__12) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(281);
				primary();
				}
				}
				setState(286);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ourLangVisitor ) return ((ourLangVisitor<? extends T>)visitor).visitPrimary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryContext primary() throws RecognitionException {
		PrimaryContext _localctx = new PrimaryContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_primary);
		try {
			setState(295);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(287);
				match(T__3);
				setState(288);
				expression();
				setState(289);
				match(T__4);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(291);
				value();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(292);
				match(SIGN);
				setState(293);
				primary();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(294);
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
		public ValassignmentContext valassignment() {
			return getRuleContext(ValassignmentContext.class,0);
		}
		public CollectionassignmentContext collectionassignment() {
			return getRuleContext(CollectionassignmentContext.class,0);
		}
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ourLangVisitor ) return ((ourLangVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_assignment);
		try {
			setState(299);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(297);
				valassignment();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(298);
				collectionassignment();
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

	public static class ValassignmentContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(ourLangParser.ID, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode BOOLVAL() { return getToken(ourLangParser.BOOLVAL, 0); }
		public ValassignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valassignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ourLangListener ) ((ourLangListener)listener).enterValassignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ourLangListener ) ((ourLangListener)listener).exitValassignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ourLangVisitor ) return ((ourLangVisitor<? extends T>)visitor).visitValassignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValassignmentContext valassignment() throws RecognitionException {
		ValassignmentContext _localctx = new ValassignmentContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_valassignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(301);
			match(ID);
			setState(302);
			match(T__13);
			setState(305);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				{
				setState(303);
				expression();
				}
				break;
			case 2:
				{
				setState(304);
				match(BOOLVAL);
				}
				break;
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

	public static class CollectionassignmentContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(ourLangParser.ID, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public CollectionEntranceContext collectionEntrance() {
			return getRuleContext(CollectionEntranceContext.class,0);
		}
		public CollectionassignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_collectionassignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ourLangListener ) ((ourLangListener)listener).enterCollectionassignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ourLangListener ) ((ourLangListener)listener).exitCollectionassignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ourLangVisitor ) return ((ourLangVisitor<? extends T>)visitor).visitCollectionassignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CollectionassignmentContext collectionassignment() throws RecognitionException {
		CollectionassignmentContext _localctx = new CollectionassignmentContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_collectionassignment);
		try {
			setState(314);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(307);
				match(ID);
				setState(308);
				match(T__13);
				setState(309);
				expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(310);
				collectionEntrance();
				setState(311);
				match(T__13);
				setState(312);
				expression();
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
		public ValassignmentContext valassignment() {
			return getRuleContext(ValassignmentContext.class,0);
		}
		public CollectiontypeContext collectiontype() {
			return getRuleContext(CollectiontypeContext.class,0);
		}
		public CollectionassignmentContext collectionassignment() {
			return getRuleContext(CollectionassignmentContext.class,0);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ourLangVisitor ) return ((ourLangVisitor<? extends T>)visitor).visitDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_declaration);
		try {
			setState(325);
			switch (_input.LA(1)) {
			case INT:
			case FLOAT:
			case BOOL:
				enterOuterAlt(_localctx, 1);
				{
				setState(316);
				datatype();
				setState(317);
				valassignment();
				}
				break;
			case MATRIX:
			case ROWVECTOR:
			case COLVECTOR:
				enterOuterAlt(_localctx, 2);
				{
				setState(319);
				collectiontype();
				setState(320);
				match(T__1);
				setState(321);
				datatype();
				setState(322);
				match(T__2);
				setState(323);
				collectionassignment();
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ourLangVisitor ) return ((ourLangVisitor<? extends T>)visitor).visitValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_value);
		int _la;
		try {
			setState(343);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(327);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(328);
				constant();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(329);
				match(T__14);
				setState(330);
				valueList();
				setState(335);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__0) {
					{
					{
					setState(331);
					match(T__0);
					setState(332);
					valueList();
					}
					}
					setState(337);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(338);
				match(T__15);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(340);
				functioncall();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(341);
				collectionEntrance();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(342);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ourLangVisitor ) return ((ourLangVisitor<? extends T>)visitor).visitCollectionEntrance(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CollectionEntranceContext collectionEntrance() throws RecognitionException {
		CollectionEntranceContext _localctx = new CollectionEntranceContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_collectionEntrance);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(345);
			match(ID);
			setState(346);
			match(T__14);
			setState(347);
			entranceCoordinate();
			setState(348);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ourLangVisitor ) return ((ourLangVisitor<? extends T>)visitor).visitValueList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueListContext valueList() throws RecognitionException {
		ValueListContext _localctx = new ValueListContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_valueList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(350);
			value();
			setState(355);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__9) {
				{
				{
				setState(351);
				match(T__9);
				setState(352);
				value();
				}
				}
				setState(357);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ourLangVisitor ) return ((ourLangVisitor<? extends T>)visitor).visitConstantList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantListContext constantList() throws RecognitionException {
		ConstantListContext _localctx = new ConstantListContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_constantList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(358);
			constant();
			setState(363);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__9) {
				{
				{
				setState(359);
				match(T__9);
				setState(360);
				constant();
				}
				}
				setState(365);
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
		public List<TerminalNode> ID() { return getTokens(ourLangParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(ourLangParser.ID, i);
		}
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ourLangVisitor ) return ((ourLangVisitor<? extends T>)visitor).visitEntranceCoordinate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EntranceCoordinateContext entranceCoordinate() throws RecognitionException {
		EntranceCoordinateContext _localctx = new EntranceCoordinateContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_entranceCoordinate);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(366);
			_la = _input.LA(1);
			if ( !(_la==INTNUM || _la==ID) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(369);
			_la = _input.LA(1);
			if (_la==T__9) {
				{
				setState(367);
				match(T__9);
				setState(368);
				_la = _input.LA(1);
				if ( !(_la==INTNUM || _la==ID) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ourLangVisitor ) return ((ourLangVisitor<? extends T>)visitor).visitDatatype(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DatatypeContext datatype() throws RecognitionException {
		DatatypeContext _localctx = new DatatypeContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_datatype);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(371);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ourLangVisitor ) return ((ourLangVisitor<? extends T>)visitor).visitCollectiontype(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CollectiontypeContext collectiontype() throws RecognitionException {
		CollectiontypeContext _localctx = new CollectiontypeContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_collectiontype);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(373);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ourLangVisitor ) return ((ourLangVisitor<? extends T>)visitor).visitInfixBinaryOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InfixBinaryOperatorContext infixBinaryOperator() throws RecognitionException {
		InfixBinaryOperatorContext _localctx = new InfixBinaryOperatorContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_infixBinaryOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(375);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ourLangVisitor ) return ((ourLangVisitor<? extends T>)visitor).visitPostUnaryOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PostUnaryOperatorContext postUnaryOperator() throws RecognitionException {
		PostUnaryOperatorContext _localctx = new PostUnaryOperatorContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_postUnaryOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(377);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ourLangVisitor ) return ((ourLangVisitor<? extends T>)visitor).visitConditionalOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionalOperatorContext conditionalOperator() throws RecognitionException {
		ConditionalOperatorContext _localctx = new ConditionalOperatorContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_conditionalOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(379);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ourLangVisitor ) return ((ourLangVisitor<? extends T>)visitor).visitConstant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantContext constant() throws RecognitionException {
		ConstantContext _localctx = new ConstantContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_constant);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(381);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3/\u0182\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\3\2\7\2@"+
		"\n\2\f\2\16\2C\13\2\3\2\7\2F\n\2\f\2\16\2I\13\2\3\2\7\2L\n\2\f\2\16\2"+
		"O\13\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\5\3a\n\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\7\5n\n\5\f\5\16"+
		"\5q\13\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5{\n\5\f\5\16\5~\13\5\3\5\3"+
		"\5\7\5\u0082\n\5\f\5\16\5\u0085\13\5\3\5\3\5\3\5\7\5\u008a\n\5\f\5\16"+
		"\5\u008d\13\5\3\5\5\5\u0090\n\5\3\6\3\6\3\6\3\6\5\6\u0096\n\6\3\6\3\6"+
		"\3\6\7\6\u009b\n\6\f\6\16\6\u009e\13\6\3\6\3\6\3\6\3\6\5\6\u00a4\n\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\7\6\u00ae\n\6\f\6\16\6\u00b1\13\6\3\6\3"+
		"\6\5\6\u00b5\n\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u00c2"+
		"\n\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\7\t\u00cc\n\t\f\t\16\t\u00cf\13\t"+
		"\3\t\3\t\3\t\3\t\5\t\u00d5\n\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\5\n\u00e3\n\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n"+
		"\u00f0\n\n\7\n\u00f2\n\n\f\n\16\n\u00f5\13\n\5\n\u00f7\n\n\3\n\5\n\u00fa"+
		"\n\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\7\f\u0104\n\f\f\f\16\f\u0107"+
		"\13\f\3\f\3\f\5\f\u010b\n\f\3\r\3\r\3\r\5\r\u0110\n\r\3\16\3\16\3\16\7"+
		"\16\u0115\n\16\f\16\16\16\u0118\13\16\3\17\3\17\3\17\7\17\u011d\n\17\f"+
		"\17\16\17\u0120\13\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u012a"+
		"\n\20\3\21\3\21\5\21\u012e\n\21\3\22\3\22\3\22\3\22\5\22\u0134\n\22\3"+
		"\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u013d\n\23\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\5\24\u0148\n\24\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\7\25\u0150\n\25\f\25\16\25\u0153\13\25\3\25\3\25\3\25\3\25\3\25\5\25"+
		"\u015a\n\25\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\7\27\u0164\n\27\f"+
		"\27\16\27\u0167\13\27\3\30\3\30\3\30\7\30\u016c\n\30\f\30\16\30\u016f"+
		"\13\30\3\31\3\31\3\31\5\31\u0174\n\31\3\32\3\32\3\33\3\33\3\34\3\34\3"+
		"\35\3\35\3\36\3\36\3\37\3\37\3\37\2\2 \2\4\6\b\n\f\16\20\22\24\26\30\32"+
		"\34\36 \"$&(*,.\60\62\64\668:<\2\13\4\2\r\r))\3\2\16\17\4\2##**\5\2\""+
		"\"$$&&\3\2\37!\5\2\r\17\23\23))\3\2\24\25\4\2\4\5\26\31\4\2##%%\u0196"+
		"\2A\3\2\2\2\4`\3\2\2\2\6b\3\2\2\2\bg\3\2\2\2\n\u00b4\3\2\2\2\f\u00b6\3"+
		"\2\2\2\16\u00c1\3\2\2\2\20\u00c9\3\2\2\2\22\u00f9\3\2\2\2\24\u00fb\3\2"+
		"\2\2\26\u010a\3\2\2\2\30\u010f\3\2\2\2\32\u0111\3\2\2\2\34\u0119\3\2\2"+
		"\2\36\u0129\3\2\2\2 \u012d\3\2\2\2\"\u012f\3\2\2\2$\u013c\3\2\2\2&\u0147"+
		"\3\2\2\2(\u0159\3\2\2\2*\u015b\3\2\2\2,\u0160\3\2\2\2.\u0168\3\2\2\2\60"+
		"\u0170\3\2\2\2\62\u0175\3\2\2\2\64\u0177\3\2\2\2\66\u0179\3\2\2\28\u017b"+
		"\3\2\2\2:\u017d\3\2\2\2<\u017f\3\2\2\2>@\5\6\4\2?>\3\2\2\2@C\3\2\2\2A"+
		"?\3\2\2\2AB\3\2\2\2BG\3\2\2\2CA\3\2\2\2DF\5\16\b\2ED\3\2\2\2FI\3\2\2\2"+
		"GE\3\2\2\2GH\3\2\2\2HM\3\2\2\2IG\3\2\2\2JL\5\4\3\2KJ\3\2\2\2LO\3\2\2\2"+
		"MK\3\2\2\2MN\3\2\2\2NP\3\2\2\2OM\3\2\2\2PQ\7\2\2\3Q\3\3\2\2\2RS\5\30\r"+
		"\2ST\7\3\2\2Ta\3\2\2\2UV\5 \21\2VW\7\3\2\2Wa\3\2\2\2XY\5&\24\2YZ\7\3\2"+
		"\2Za\3\2\2\2[\\\5\24\13\2\\]\7\3\2\2]a\3\2\2\2^a\5\b\5\2_a\5\n\6\2`R\3"+
		"\2\2\2`U\3\2\2\2`X\3\2\2\2`[\3\2\2\2`^\3\2\2\2`_\3\2\2\2a\5\3\2\2\2bc"+
		"\7\32\2\2cd\7\4\2\2de\7+\2\2ef\7\5\2\2f\7\3\2\2\2gh\7\33\2\2hi\7\6\2\2"+
		"ij\5\f\7\2jk\7\7\2\2ko\7\b\2\2ln\5\4\3\2ml\3\2\2\2nq\3\2\2\2om\3\2\2\2"+
		"op\3\2\2\2pr\3\2\2\2qo\3\2\2\2r\u0083\7\t\2\2st\7\34\2\2tu\7\33\2\2uv"+
		"\7\6\2\2vw\5\f\7\2wx\7\7\2\2x|\7\b\2\2y{\5\4\3\2zy\3\2\2\2{~\3\2\2\2|"+
		"z\3\2\2\2|}\3\2\2\2}\177\3\2\2\2~|\3\2\2\2\177\u0080\7\t\2\2\u0080\u0082"+
		"\3\2\2\2\u0081s\3\2\2\2\u0082\u0085\3\2\2\2\u0083\u0081\3\2\2\2\u0083"+
		"\u0084\3\2\2\2\u0084\u008f\3\2\2\2\u0085\u0083\3\2\2\2\u0086\u0087\7\34"+
		"\2\2\u0087\u008b\7\b\2\2\u0088\u008a\5\4\3\2\u0089\u0088\3\2\2\2\u008a"+
		"\u008d\3\2\2\2\u008b\u0089\3\2\2\2\u008b\u008c\3\2\2\2\u008c\u008e\3\2"+
		"\2\2\u008d\u008b\3\2\2\2\u008e\u0090\7\t\2\2\u008f\u0086\3\2\2\2\u008f"+
		"\u0090\3\2\2\2\u0090\t\3\2\2\2\u0091\u0092\7\35\2\2\u0092\u0095\7\6\2"+
		"\2\u0093\u0096\5\f\7\2\u0094\u0096\7\'\2\2\u0095\u0093\3\2\2\2\u0095\u0094"+
		"\3\2\2\2\u0096\u0097\3\2\2\2\u0097\u0098\7\7\2\2\u0098\u009c\7\b\2\2\u0099"+
		"\u009b\5\4\3\2\u009a\u0099\3\2\2\2\u009b\u009e\3\2\2\2\u009c\u009a\3\2"+
		"\2\2\u009c\u009d\3\2\2\2\u009d\u009f\3\2\2\2\u009e\u009c\3\2\2\2\u009f"+
		"\u00b5\7\t\2\2\u00a0\u00a1\7\36\2\2\u00a1\u00a3\7\6\2\2\u00a2\u00a4\5"+
		"\62\32\2\u00a3\u00a2\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5"+
		"\u00a6\5 \21\2\u00a6\u00a7\7\3\2\2\u00a7\u00a8\5\f\7\2\u00a8\u00a9\7\3"+
		"\2\2\u00a9\u00aa\5\30\r\2\u00aa\u00ab\7\7\2\2\u00ab\u00af\7\b\2\2\u00ac"+
		"\u00ae\5\4\3\2\u00ad\u00ac\3\2\2\2\u00ae\u00b1\3\2\2\2\u00af\u00ad\3\2"+
		"\2\2\u00af\u00b0\3\2\2\2\u00b0\u00b2\3\2\2\2\u00b1\u00af\3\2\2\2\u00b2"+
		"\u00b3\7\t\2\2\u00b3\u00b5\3\2\2\2\u00b4\u0091\3\2\2\2\u00b4\u00a0\3\2"+
		"\2\2\u00b5\13\3\2\2\2\u00b6\u00b7\5\30\r\2\u00b7\u00b8\5:\36\2\u00b8\u00b9"+
		"\5\30\r\2\u00b9\r\3\2\2\2\u00ba\u00c2\5\62\32\2\u00bb\u00bc\5\64\33\2"+
		"\u00bc\u00bd\7\4\2\2\u00bd\u00be\5\62\32\2\u00be\u00bf\7\5\2\2\u00bf\u00c2"+
		"\3\2\2\2\u00c0\u00c2\7\n\2\2\u00c1\u00ba\3\2\2\2\u00c1\u00bb\3\2\2\2\u00c1"+
		"\u00c0\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c3\u00c4\7*\2\2\u00c4\u00c5\7\6"+
		"\2\2\u00c5\u00c6\5\22\n\2\u00c6\u00c7\7\7\2\2\u00c7\u00c8\5\20\t\2\u00c8"+
		"\17\3\2\2\2\u00c9\u00cd\7\b\2\2\u00ca\u00cc\5\4\3\2\u00cb\u00ca\3\2\2"+
		"\2\u00cc\u00cf\3\2\2\2\u00cd\u00cb\3\2\2\2\u00cd\u00ce\3\2\2\2\u00ce\u00d4"+
		"\3\2\2\2\u00cf\u00cd\3\2\2\2\u00d0\u00d1\7\13\2\2\u00d1\u00d2\5\30\r\2"+
		"\u00d2\u00d3\7\3\2\2\u00d3\u00d5\3\2\2\2\u00d4\u00d0\3\2\2\2\u00d4\u00d5"+
		"\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d6\u00d7\7\t\2\2\u00d7\21\3\2\2\2\u00d8"+
		"\u00d9\5\62\32\2\u00d9\u00da\7*\2\2\u00da\u00e3\3\2\2\2\u00db\u00e3\7"+
		"(\2\2\u00dc\u00dd\5\64\33\2\u00dd\u00de\7\4\2\2\u00de\u00df\5\62\32\2"+
		"\u00df\u00e0\7\5\2\2\u00e0\u00e1\7*\2\2\u00e1\u00e3\3\2\2\2\u00e2\u00d8"+
		"\3\2\2\2\u00e2\u00db\3\2\2\2\u00e2\u00dc\3\2\2\2\u00e3\u00f3\3\2\2\2\u00e4"+
		"\u00ef\7\f\2\2\u00e5\u00e6\5\62\32\2\u00e6\u00e7\7*\2\2\u00e7\u00f0\3"+
		"\2\2\2\u00e8\u00f0\7(\2\2\u00e9\u00ea\5\64\33\2\u00ea\u00eb\7\4\2\2\u00eb"+
		"\u00ec\5\62\32\2\u00ec\u00ed\7\5\2\2\u00ed\u00ee\7*\2\2\u00ee\u00f0\3"+
		"\2\2\2\u00ef\u00e5\3\2\2\2\u00ef\u00e8\3\2\2\2\u00ef\u00e9\3\2\2\2\u00f0"+
		"\u00f2\3\2\2\2\u00f1\u00e4\3\2\2\2\u00f2\u00f5\3\2\2\2\u00f3\u00f1\3\2"+
		"\2\2\u00f3\u00f4\3\2\2\2\u00f4\u00f7\3\2\2\2\u00f5\u00f3\3\2\2\2\u00f6"+
		"\u00e2\3\2\2\2\u00f6\u00f7\3\2\2\2\u00f7\u00fa\3\2\2\2\u00f8\u00fa\3\2"+
		"\2\2\u00f9\u00f6\3\2\2\2\u00f9\u00f8\3\2\2\2\u00fa\23\3\2\2\2\u00fb\u00fc"+
		"\7*\2\2\u00fc\u00fd\7\6\2\2\u00fd\u00fe\5\26\f\2\u00fe\u00ff\7\7\2\2\u00ff"+
		"\25\3\2\2\2\u0100\u0105\5\30\r\2\u0101\u0102\7\f\2\2\u0102\u0104\5\30"+
		"\r\2\u0103\u0101\3\2\2\2\u0104\u0107\3\2\2\2\u0105\u0103\3\2\2\2\u0105"+
		"\u0106\3\2\2\2\u0106\u010b\3\2\2\2\u0107\u0105\3\2\2\2\u0108\u010b\7("+
		"\2\2\u0109\u010b\3\2\2\2\u010a\u0100\3\2\2\2\u010a\u0108\3\2\2\2\u010a"+
		"\u0109\3\2\2\2\u010b\27\3\2\2\2\u010c\u0110\5\32\16\2\u010d\u010e\7*\2"+
		"\2\u010e\u0110\58\35\2\u010f\u010c\3\2\2\2\u010f\u010d\3\2\2\2\u0110\31"+
		"\3\2\2\2\u0111\u0116\5\34\17\2\u0112\u0113\t\2\2\2\u0113\u0115\5\34\17"+
		"\2\u0114\u0112\3\2\2\2\u0115\u0118\3\2\2\2\u0116\u0114\3\2\2\2\u0116\u0117"+
		"\3\2\2\2\u0117\33\3\2\2\2\u0118\u0116\3\2\2\2\u0119\u011e\5\36\20\2\u011a"+
		"\u011b\t\3\2\2\u011b\u011d\5\36\20\2\u011c\u011a\3\2\2\2\u011d\u0120\3"+
		"\2\2\2\u011e\u011c\3\2\2\2\u011e\u011f\3\2\2\2\u011f\35\3\2\2\2\u0120"+
		"\u011e\3\2\2\2\u0121\u0122\7\6\2\2\u0122\u0123\5\30\r\2\u0123\u0124\7"+
		"\7\2\2\u0124\u012a\3\2\2\2\u0125\u012a\5(\25\2\u0126\u0127\7)\2\2\u0127"+
		"\u012a\5\36\20\2\u0128\u012a\5\24\13\2\u0129\u0121\3\2\2\2\u0129\u0125"+
		"\3\2\2\2\u0129\u0126\3\2\2\2\u0129\u0128\3\2\2\2\u012a\37\3\2\2\2\u012b"+
		"\u012e\5\"\22\2\u012c\u012e\5$\23\2\u012d\u012b\3\2\2\2\u012d\u012c\3"+
		"\2\2\2\u012e!\3\2\2\2\u012f\u0130\7*\2\2\u0130\u0133\7\20\2\2\u0131\u0134"+
		"\5\30\r\2\u0132\u0134\7\'\2\2\u0133\u0131\3\2\2\2\u0133\u0132\3\2\2\2"+
		"\u0134#\3\2\2\2\u0135\u0136\7*\2\2\u0136\u0137\7\20\2\2\u0137\u013d\5"+
		"\30\r\2\u0138\u0139\5*\26\2\u0139\u013a\7\20\2\2\u013a\u013b\5\30\r\2"+
		"\u013b\u013d\3\2\2\2\u013c\u0135\3\2\2\2\u013c\u0138\3\2\2\2\u013d%\3"+
		"\2\2\2\u013e\u013f\5\62\32\2\u013f\u0140\5\"\22\2\u0140\u0148\3\2\2\2"+
		"\u0141\u0142\5\64\33\2\u0142\u0143\7\4\2\2\u0143\u0144\5\62\32\2\u0144"+
		"\u0145\7\5\2\2\u0145\u0146\5$\23\2\u0146\u0148\3\2\2\2\u0147\u013e\3\2"+
		"\2\2\u0147\u0141\3\2\2\2\u0148\'\3\2\2\2\u0149\u015a\7*\2\2\u014a\u015a"+
		"\5<\37\2\u014b\u014c\7\21\2\2\u014c\u0151\5,\27\2\u014d\u014e\7\3\2\2"+
		"\u014e\u0150\5,\27\2\u014f\u014d\3\2\2\2\u0150\u0153\3\2\2\2\u0151\u014f"+
		"\3\2\2\2\u0151\u0152\3\2\2\2\u0152\u0154\3\2\2\2\u0153\u0151\3\2\2\2\u0154"+
		"\u0155\7\22\2\2\u0155\u015a\3\2\2\2\u0156\u015a\5\24\13\2\u0157\u015a"+
		"\5*\26\2\u0158\u015a\7\'\2\2\u0159\u0149\3\2\2\2\u0159\u014a\3\2\2\2\u0159"+
		"\u014b\3\2\2\2\u0159\u0156\3\2\2\2\u0159\u0157\3\2\2\2\u0159\u0158\3\2"+
		"\2\2\u015a)\3\2\2\2\u015b\u015c\7*\2\2\u015c\u015d\7\21\2\2\u015d\u015e"+
		"\5\60\31\2\u015e\u015f\7\22\2\2\u015f+\3\2\2\2\u0160\u0165\5(\25\2\u0161"+
		"\u0162\7\f\2\2\u0162\u0164\5(\25\2\u0163\u0161\3\2\2\2\u0164\u0167\3\2"+
		"\2\2\u0165\u0163\3\2\2\2\u0165\u0166\3\2\2\2\u0166-\3\2\2\2\u0167\u0165"+
		"\3\2\2\2\u0168\u016d\5<\37\2\u0169\u016a\7\f\2\2\u016a\u016c\5<\37\2\u016b"+
		"\u0169\3\2\2\2\u016c\u016f\3\2\2\2\u016d\u016b\3\2\2\2\u016d\u016e\3\2"+
		"\2\2\u016e/\3\2\2\2\u016f\u016d\3\2\2\2\u0170\u0173\t\4\2\2\u0171\u0172"+
		"\7\f\2\2\u0172\u0174\t\4\2\2\u0173\u0171\3\2\2\2\u0173\u0174\3\2\2\2\u0174"+
		"\61\3\2\2\2\u0175\u0176\t\5\2\2\u0176\63\3\2\2\2\u0177\u0178\t\6\2\2\u0178"+
		"\65\3\2\2\2\u0179\u017a\t\7\2\2\u017a\67\3\2\2\2\u017b\u017c\t\b\2\2\u017c"+
		"9\3\2\2\2\u017d\u017e\t\t\2\2\u017e;\3\2\2\2\u017f\u0180\t\n\2\2\u0180"+
		"=\3\2\2\2\'AGM`o|\u0083\u008b\u008f\u0095\u009c\u00a3\u00af\u00b4\u00c1"+
		"\u00cd\u00d4\u00e2\u00ef\u00f3\u00f6\u00f9\u0105\u010a\u010f\u0116\u011e"+
		"\u0129\u012d\u0133\u013c\u0147\u0151\u0159\u0165\u016d\u0173";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}