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
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, IMPORT=23, IF=24, ELSE=25, 
		WHILE=26, FOR=27, MATRIX=28, ROWVECTOR=29, COLVECTOR=30, INT=31, INTNUM=32, 
		FLOAT=33, FLOATNUM=34, BOOL=35, BOOLVAL=36, STRING=37, SIGN=38, ID=39, 
		LIBRARY=40, WS=41, NL=42, COMMENT=43, LINE_COMMENT=44;
	public static final int
		RULE_topLevel = 0, RULE_statement = 1, RULE_importing = 2, RULE_controlblock = 3, 
		RULE_loop = 4, RULE_block = 5, RULE_condition = 6, RULE_functiondeclaration = 7, 
		RULE_functionbody = 8, RULE_parameterlist = 9, RULE_functioncall = 10, 
		RULE_argumentlist = 11, RULE_expression = 12, RULE_assignment = 13, RULE_valassignment = 14, 
		RULE_collectionassignment = 15, RULE_declaration = 16, RULE_value = 17, 
		RULE_collectionEntrance = 18, RULE_valueList = 19, RULE_constantList = 20, 
		RULE_entranceCoordinate = 21, RULE_datatype = 22, RULE_collectiontype = 23, 
		RULE_postUnaryOperator = 24, RULE_conditionalOperator = 25, RULE_constant = 26;
	public static final String[] ruleNames = {
		"topLevel", "statement", "importing", "controlblock", "loop", "block", 
		"condition", "functiondeclaration", "functionbody", "parameterlist", "functioncall", 
		"argumentlist", "expression", "assignment", "valassignment", "collectionassignment", 
		"declaration", "value", "collectionEntrance", "valueList", "constantList", 
		"entranceCoordinate", "datatype", "collectiontype", "postUnaryOperator", 
		"conditionalOperator", "constant"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "';'", "'<'", "'>'", "'('", "')'", "'{'", "'}'", "'void'", "'return'", 
		"','", "'*'", "'/'", "'+'", "'='", "'['", "']'", "'++'", "'--'", "'=='", 
		"'!='", "'<='", "'>='", null, "'if'", "'else'", "'while'", "'for'", "'matrix'", 
		null, null, "'int'", null, "'float'", null, "'bool'", null, null, "'-'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, "IMPORT", 
		"IF", "ELSE", "WHILE", "FOR", "MATRIX", "ROWVECTOR", "COLVECTOR", "INT", 
		"INTNUM", "FLOAT", "FLOATNUM", "BOOL", "BOOLVAL", "STRING", "SIGN", "ID", 
		"LIBRARY", "WS", "NL", "COMMENT", "LINE_COMMENT"
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
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__14) | (1L << IF) | (1L << WHILE) | (1L << FOR) | (1L << MATRIX) | (1L << ROWVECTOR) | (1L << COLVECTOR) | (1L << INT) | (1L << INTNUM) | (1L << FLOAT) | (1L << FLOATNUM) | (1L << BOOL) | (1L << BOOLVAL) | (1L << ID))) != 0)) {
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
				expression(0);
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
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
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
			block();
			setState(109);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(100);
					match(ELSE);
					setState(101);
					match(IF);
					setState(102);
					match(T__3);
					setState(103);
					condition();
					setState(104);
					match(T__4);
					setState(105);
					block();
					}
					} 
				}
				setState(111);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			}
			setState(114);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(112);
				match(ELSE);
				setState(113);
				block();
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
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode BOOLVAL() { return getToken(ourLangParser.BOOLVAL, 0); }
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
			setState(142);
			switch (_input.LA(1)) {
			case WHILE:
				enterOuterAlt(_localctx, 1);
				{
				setState(116);
				match(WHILE);
				setState(117);
				match(T__3);
				setState(120);
				switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
				case 1:
					{
					setState(118);
					condition();
					}
					break;
				case 2:
					{
					setState(119);
					match(BOOLVAL);
					}
					break;
				}
				setState(122);
				match(T__4);
				setState(123);
				block();
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 2);
				{
				setState(124);
				match(FOR);
				setState(125);
				match(T__3);
				setState(130);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << FLOAT) | (1L << BOOL) | (1L << ID))) != 0)) {
					{
					setState(127);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << FLOAT) | (1L << BOOL))) != 0)) {
						{
						setState(126);
						datatype();
						}
					}

					setState(129);
					assignment();
					}
				}

				setState(132);
				match(T__0);
				setState(134);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__14) | (1L << INTNUM) | (1L << FLOATNUM) | (1L << BOOLVAL) | (1L << ID))) != 0)) {
					{
					setState(133);
					condition();
					}
				}

				setState(136);
				match(T__0);
				setState(138);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__14) | (1L << INTNUM) | (1L << FLOATNUM) | (1L << BOOLVAL) | (1L << ID))) != 0)) {
					{
					setState(137);
					expression(0);
					}
				}

				setState(140);
				match(T__4);
				setState(141);
				block();
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

	public static class BlockContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ourLangListener ) ((ourLangListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ourLangListener ) ((ourLangListener)listener).exitBlock(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(144);
			match(T__5);
			setState(148);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__14) | (1L << IF) | (1L << WHILE) | (1L << FOR) | (1L << MATRIX) | (1L << ROWVECTOR) | (1L << COLVECTOR) | (1L << INT) | (1L << INTNUM) | (1L << FLOAT) | (1L << FLOATNUM) | (1L << BOOL) | (1L << BOOLVAL) | (1L << ID))) != 0)) {
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
		enterRule(_localctx, 12, RULE_condition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(153);
			expression(0);
			setState(154);
			conditionalOperator();
			setState(155);
			expression(0);
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
	}

	public final FunctiondeclarationContext functiondeclaration() throws RecognitionException {
		FunctiondeclarationContext _localctx = new FunctiondeclarationContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_functiondeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(164);
			switch (_input.LA(1)) {
			case INT:
			case FLOAT:
			case BOOL:
				{
				setState(157);
				datatype();
				}
				break;
			case MATRIX:
			case ROWVECTOR:
			case COLVECTOR:
				{
				setState(158);
				collectiontype();
				setState(159);
				match(T__1);
				setState(160);
				datatype();
				setState(161);
				match(T__2);
				}
				break;
			case T__7:
				{
				setState(163);
				match(T__7);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(166);
			match(ID);
			setState(167);
			match(T__3);
			setState(168);
			parameterlist();
			setState(169);
			match(T__4);
			setState(170);
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
	}

	public final FunctionbodyContext functionbody() throws RecognitionException {
		FunctionbodyContext _localctx = new FunctionbodyContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_functionbody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(172);
			match(T__5);
			setState(176);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__14) | (1L << IF) | (1L << WHILE) | (1L << FOR) | (1L << MATRIX) | (1L << ROWVECTOR) | (1L << COLVECTOR) | (1L << INT) | (1L << INTNUM) | (1L << FLOAT) | (1L << FLOATNUM) | (1L << BOOL) | (1L << BOOLVAL) | (1L << ID))) != 0)) {
				{
				{
				setState(173);
				statement();
				}
				}
				setState(178);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(183);
			_la = _input.LA(1);
			if (_la==T__8) {
				{
				setState(179);
				match(T__8);
				setState(180);
				expression(0);
				setState(181);
				match(T__0);
				}
			}

			setState(185);
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
		enterRule(_localctx, 18, RULE_parameterlist);
		int _la;
		try {
			setState(220);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(217);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MATRIX) | (1L << ROWVECTOR) | (1L << COLVECTOR) | (1L << INT) | (1L << FLOAT) | (1L << BOOL) | (1L << STRING))) != 0)) {
					{
					setState(197);
					switch (_input.LA(1)) {
					case INT:
					case FLOAT:
					case BOOL:
						{
						setState(187);
						datatype();
						setState(188);
						match(ID);
						}
						break;
					case STRING:
						{
						setState(190);
						match(STRING);
						}
						break;
					case MATRIX:
					case ROWVECTOR:
					case COLVECTOR:
						{
						setState(191);
						collectiontype();
						setState(192);
						match(T__1);
						setState(193);
						datatype();
						setState(194);
						match(T__2);
						setState(195);
						match(ID);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(214);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__9) {
						{
						{
						setState(199);
						match(T__9);
						setState(210);
						switch (_input.LA(1)) {
						case INT:
						case FLOAT:
						case BOOL:
							{
							setState(200);
							datatype();
							setState(201);
							match(ID);
							}
							break;
						case STRING:
							{
							setState(203);
							match(STRING);
							}
							break;
						case MATRIX:
						case ROWVECTOR:
						case COLVECTOR:
							{
							setState(204);
							collectiontype();
							setState(205);
							match(T__1);
							setState(206);
							datatype();
							setState(207);
							match(T__2);
							setState(208);
							match(ID);
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						}
						}
						setState(216);
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
		enterRule(_localctx, 20, RULE_functioncall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(222);
			match(ID);
			setState(223);
			match(T__3);
			setState(224);
			argumentlist();
			setState(225);
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
		enterRule(_localctx, 22, RULE_argumentlist);
		int _la;
		try {
			setState(237);
			switch (_input.LA(1)) {
			case T__3:
			case T__14:
			case INTNUM:
			case FLOATNUM:
			case BOOLVAL:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(227);
				expression(0);
				setState(232);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__9) {
					{
					{
					setState(228);
					match(T__9);
					setState(229);
					expression(0);
					}
					}
					setState(234);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(235);
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
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
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
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 24;
		enterRecursionRule(_localctx, 24, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(247);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				{
				setState(240);
				match(T__3);
				setState(241);
				expression(0);
				setState(242);
				match(T__4);
				}
				break;
			case 2:
				{
				setState(244);
				value();
				}
				break;
			case 3:
				{
				setState(245);
				match(ID);
				setState(246);
				postUnaryOperator();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(257);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(255);
					switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(249);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(250);
						_la = _input.LA(1);
						if ( !(_la==T__10 || _la==T__11) ) {
						_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(251);
						expression(6);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(252);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(253);
						_la = _input.LA(1);
						if ( !(_la==T__12 || _la==SIGN) ) {
						_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(254);
						expression(5);
						}
						break;
					}
					} 
				}
				setState(259);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
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
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_assignment);
		try {
			setState(262);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(260);
				valassignment();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(261);
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
	}

	public final ValassignmentContext valassignment() throws RecognitionException {
		ValassignmentContext _localctx = new ValassignmentContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_valassignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(264);
			match(ID);
			setState(265);
			match(T__13);
			setState(268);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				{
				setState(266);
				expression(0);
				}
				break;
			case 2:
				{
				setState(267);
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
	}

	public final CollectionassignmentContext collectionassignment() throws RecognitionException {
		CollectionassignmentContext _localctx = new CollectionassignmentContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_collectionassignment);
		try {
			setState(277);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(270);
				match(ID);
				setState(271);
				match(T__13);
				setState(272);
				expression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(273);
				collectionEntrance();
				setState(274);
				match(T__13);
				setState(275);
				expression(0);
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
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_declaration);
		try {
			setState(288);
			switch (_input.LA(1)) {
			case INT:
			case FLOAT:
			case BOOL:
				enterOuterAlt(_localctx, 1);
				{
				setState(279);
				datatype();
				setState(280);
				valassignment();
				}
				break;
			case MATRIX:
			case ROWVECTOR:
			case COLVECTOR:
				enterOuterAlt(_localctx, 2);
				{
				setState(282);
				collectiontype();
				setState(283);
				match(T__1);
				setState(284);
				datatype();
				setState(285);
				match(T__2);
				setState(286);
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
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_value);
		int _la;
		try {
			setState(306);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(290);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(291);
				constant();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(292);
				match(T__14);
				setState(293);
				valueList();
				setState(298);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__0) {
					{
					{
					setState(294);
					match(T__0);
					setState(295);
					valueList();
					}
					}
					setState(300);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(301);
				match(T__15);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(303);
				functioncall();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(304);
				collectionEntrance();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(305);
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
		enterRule(_localctx, 36, RULE_collectionEntrance);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(308);
			match(ID);
			setState(309);
			match(T__14);
			setState(310);
			entranceCoordinate();
			setState(311);
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
		enterRule(_localctx, 38, RULE_valueList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(313);
			value();
			setState(318);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__9) {
				{
				{
				setState(314);
				match(T__9);
				setState(315);
				value();
				}
				}
				setState(320);
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
		enterRule(_localctx, 40, RULE_constantList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(321);
			constant();
			setState(326);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__9) {
				{
				{
				setState(322);
				match(T__9);
				setState(323);
				constant();
				}
				}
				setState(328);
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
	}

	public final EntranceCoordinateContext entranceCoordinate() throws RecognitionException {
		EntranceCoordinateContext _localctx = new EntranceCoordinateContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_entranceCoordinate);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(329);
			_la = _input.LA(1);
			if ( !(_la==INTNUM || _la==ID) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(332);
			_la = _input.LA(1);
			if (_la==T__9) {
				{
				setState(330);
				match(T__9);
				setState(331);
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
	}

	public final DatatypeContext datatype() throws RecognitionException {
		DatatypeContext _localctx = new DatatypeContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_datatype);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(334);
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
		enterRule(_localctx, 46, RULE_collectiontype);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(336);
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
			setState(338);
			_la = _input.LA(1);
			if ( !(_la==T__16 || _la==T__17) ) {
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
			setState(340);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21))) != 0)) ) {
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
			setState(342);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 12:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 5);
		case 1:
			return precpred(_ctx, 4);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3.\u015b\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\3\2\7\2:\n\2\f\2\16\2=\13\2\3\2\7\2@\n"+
		"\2\f\2\16\2C\13\2\3\2\7\2F\n\2\f\2\16\2I\13\2\3\2\3\2\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3[\n\3\3\4\3\4\3\4\3\4\3\4"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5n\n\5\f\5\16\5q\13"+
		"\5\3\5\3\5\5\5u\n\5\3\6\3\6\3\6\3\6\5\6{\n\6\3\6\3\6\3\6\3\6\3\6\5\6\u0082"+
		"\n\6\3\6\5\6\u0085\n\6\3\6\3\6\5\6\u0089\n\6\3\6\3\6\5\6\u008d\n\6\3\6"+
		"\3\6\5\6\u0091\n\6\3\7\3\7\7\7\u0095\n\7\f\7\16\7\u0098\13\7\3\7\3\7\3"+
		"\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u00a7\n\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\n\3\n\7\n\u00b1\n\n\f\n\16\n\u00b4\13\n\3\n\3\n\3\n\3\n\5"+
		"\n\u00ba\n\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\5\13\u00c8\n\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\5\13\u00d5\n\13\7\13\u00d7\n\13\f\13\16\13\u00da\13\13\5\13\u00dc\n\13"+
		"\3\13\5\13\u00df\n\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\7\r\u00e9\n\r\f"+
		"\r\16\r\u00ec\13\r\3\r\3\r\5\r\u00f0\n\r\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\5\16\u00fa\n\16\3\16\3\16\3\16\3\16\3\16\3\16\7\16\u0102\n"+
		"\16\f\16\16\16\u0105\13\16\3\17\3\17\5\17\u0109\n\17\3\20\3\20\3\20\3"+
		"\20\5\20\u010f\n\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u0118\n\21"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u0123\n\22\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\7\23\u012b\n\23\f\23\16\23\u012e\13\23\3\23\3\23"+
		"\3\23\3\23\3\23\5\23\u0135\n\23\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25"+
		"\7\25\u013f\n\25\f\25\16\25\u0142\13\25\3\26\3\26\3\26\7\26\u0147\n\26"+
		"\f\26\16\26\u014a\13\26\3\27\3\27\3\27\5\27\u014f\n\27\3\30\3\30\3\31"+
		"\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\34\2\3\32\35\2\4\6\b\n\f\16\20\22"+
		"\24\26\30\32\34\36 \"$&(*,.\60\62\64\66\2\n\3\2\r\16\4\2\17\17((\4\2\""+
		"\"))\5\2!!##%%\3\2\36 \3\2\23\24\4\2\4\5\25\30\4\2\"\"$$\u016f\2;\3\2"+
		"\2\2\4Z\3\2\2\2\6\\\3\2\2\2\ba\3\2\2\2\n\u0090\3\2\2\2\f\u0092\3\2\2\2"+
		"\16\u009b\3\2\2\2\20\u00a6\3\2\2\2\22\u00ae\3\2\2\2\24\u00de\3\2\2\2\26"+
		"\u00e0\3\2\2\2\30\u00ef\3\2\2\2\32\u00f9\3\2\2\2\34\u0108\3\2\2\2\36\u010a"+
		"\3\2\2\2 \u0117\3\2\2\2\"\u0122\3\2\2\2$\u0134\3\2\2\2&\u0136\3\2\2\2"+
		"(\u013b\3\2\2\2*\u0143\3\2\2\2,\u014b\3\2\2\2.\u0150\3\2\2\2\60\u0152"+
		"\3\2\2\2\62\u0154\3\2\2\2\64\u0156\3\2\2\2\66\u0158\3\2\2\28:\5\6\4\2"+
		"98\3\2\2\2:=\3\2\2\2;9\3\2\2\2;<\3\2\2\2<A\3\2\2\2=;\3\2\2\2>@\5\20\t"+
		"\2?>\3\2\2\2@C\3\2\2\2A?\3\2\2\2AB\3\2\2\2BG\3\2\2\2CA\3\2\2\2DF\5\4\3"+
		"\2ED\3\2\2\2FI\3\2\2\2GE\3\2\2\2GH\3\2\2\2HJ\3\2\2\2IG\3\2\2\2JK\7\2\2"+
		"\3K\3\3\2\2\2LM\5\32\16\2MN\7\3\2\2N[\3\2\2\2OP\5\34\17\2PQ\7\3\2\2Q["+
		"\3\2\2\2RS\5\"\22\2ST\7\3\2\2T[\3\2\2\2UV\5\26\f\2VW\7\3\2\2W[\3\2\2\2"+
		"X[\5\b\5\2Y[\5\n\6\2ZL\3\2\2\2ZO\3\2\2\2ZR\3\2\2\2ZU\3\2\2\2ZX\3\2\2\2"+
		"ZY\3\2\2\2[\5\3\2\2\2\\]\7\31\2\2]^\7\4\2\2^_\7*\2\2_`\7\5\2\2`\7\3\2"+
		"\2\2ab\7\32\2\2bc\7\6\2\2cd\5\16\b\2de\7\7\2\2eo\5\f\7\2fg\7\33\2\2gh"+
		"\7\32\2\2hi\7\6\2\2ij\5\16\b\2jk\7\7\2\2kl\5\f\7\2ln\3\2\2\2mf\3\2\2\2"+
		"nq\3\2\2\2om\3\2\2\2op\3\2\2\2pt\3\2\2\2qo\3\2\2\2rs\7\33\2\2su\5\f\7"+
		"\2tr\3\2\2\2tu\3\2\2\2u\t\3\2\2\2vw\7\34\2\2wz\7\6\2\2x{\5\16\b\2y{\7"+
		"&\2\2zx\3\2\2\2zy\3\2\2\2{|\3\2\2\2|}\7\7\2\2}\u0091\5\f\7\2~\177\7\35"+
		"\2\2\177\u0084\7\6\2\2\u0080\u0082\5.\30\2\u0081\u0080\3\2\2\2\u0081\u0082"+
		"\3\2\2\2\u0082\u0083\3\2\2\2\u0083\u0085\5\34\17\2\u0084\u0081\3\2\2\2"+
		"\u0084\u0085\3\2\2\2\u0085\u0086\3\2\2\2\u0086\u0088\7\3\2\2\u0087\u0089"+
		"\5\16\b\2\u0088\u0087\3\2\2\2\u0088\u0089\3\2\2\2\u0089\u008a\3\2\2\2"+
		"\u008a\u008c\7\3\2\2\u008b\u008d\5\32\16\2\u008c\u008b\3\2\2\2\u008c\u008d"+
		"\3\2\2\2\u008d\u008e\3\2\2\2\u008e\u008f\7\7\2\2\u008f\u0091\5\f\7\2\u0090"+
		"v\3\2\2\2\u0090~\3\2\2\2\u0091\13\3\2\2\2\u0092\u0096\7\b\2\2\u0093\u0095"+
		"\5\4\3\2\u0094\u0093\3\2\2\2\u0095\u0098\3\2\2\2\u0096\u0094\3\2\2\2\u0096"+
		"\u0097\3\2\2\2\u0097\u0099\3\2\2\2\u0098\u0096\3\2\2\2\u0099\u009a\7\t"+
		"\2\2\u009a\r\3\2\2\2\u009b\u009c\5\32\16\2\u009c\u009d\5\64\33\2\u009d"+
		"\u009e\5\32\16\2\u009e\17\3\2\2\2\u009f\u00a7\5.\30\2\u00a0\u00a1\5\60"+
		"\31\2\u00a1\u00a2\7\4\2\2\u00a2\u00a3\5.\30\2\u00a3\u00a4\7\5\2\2\u00a4"+
		"\u00a7\3\2\2\2\u00a5\u00a7\7\n\2\2\u00a6\u009f\3\2\2\2\u00a6\u00a0\3\2"+
		"\2\2\u00a6\u00a5\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a8\u00a9\7)\2\2\u00a9"+
		"\u00aa\7\6\2\2\u00aa\u00ab\5\24\13\2\u00ab\u00ac\7\7\2\2\u00ac\u00ad\5"+
		"\22\n\2\u00ad\21\3\2\2\2\u00ae\u00b2\7\b\2\2\u00af\u00b1\5\4\3\2\u00b0"+
		"\u00af\3\2\2\2\u00b1\u00b4\3\2\2\2\u00b2\u00b0\3\2\2\2\u00b2\u00b3\3\2"+
		"\2\2\u00b3\u00b9\3\2\2\2\u00b4\u00b2\3\2\2\2\u00b5\u00b6\7\13\2\2\u00b6"+
		"\u00b7\5\32\16\2\u00b7\u00b8\7\3\2\2\u00b8\u00ba\3\2\2\2\u00b9\u00b5\3"+
		"\2\2\2\u00b9\u00ba\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb\u00bc\7\t\2\2\u00bc"+
		"\23\3\2\2\2\u00bd\u00be\5.\30\2\u00be\u00bf\7)\2\2\u00bf\u00c8\3\2\2\2"+
		"\u00c0\u00c8\7\'\2\2\u00c1\u00c2\5\60\31\2\u00c2\u00c3\7\4\2\2\u00c3\u00c4"+
		"\5.\30\2\u00c4\u00c5\7\5\2\2\u00c5\u00c6\7)\2\2\u00c6\u00c8\3\2\2\2\u00c7"+
		"\u00bd\3\2\2\2\u00c7\u00c0\3\2\2\2\u00c7\u00c1\3\2\2\2\u00c8\u00d8\3\2"+
		"\2\2\u00c9\u00d4\7\f\2\2\u00ca\u00cb\5.\30\2\u00cb\u00cc\7)\2\2\u00cc"+
		"\u00d5\3\2\2\2\u00cd\u00d5\7\'\2\2\u00ce\u00cf\5\60\31\2\u00cf\u00d0\7"+
		"\4\2\2\u00d0\u00d1\5.\30\2\u00d1\u00d2\7\5\2\2\u00d2\u00d3\7)\2\2\u00d3"+
		"\u00d5\3\2\2\2\u00d4\u00ca\3\2\2\2\u00d4\u00cd\3\2\2\2\u00d4\u00ce\3\2"+
		"\2\2\u00d5\u00d7\3\2\2\2\u00d6\u00c9\3\2\2\2\u00d7\u00da\3\2\2\2\u00d8"+
		"\u00d6\3\2\2\2\u00d8\u00d9\3\2\2\2\u00d9\u00dc\3\2\2\2\u00da\u00d8\3\2"+
		"\2\2\u00db\u00c7\3\2\2\2\u00db\u00dc\3\2\2\2\u00dc\u00df\3\2\2\2\u00dd"+
		"\u00df\3\2\2\2\u00de\u00db\3\2\2\2\u00de\u00dd\3\2\2\2\u00df\25\3\2\2"+
		"\2\u00e0\u00e1\7)\2\2\u00e1\u00e2\7\6\2\2\u00e2\u00e3\5\30\r\2\u00e3\u00e4"+
		"\7\7\2\2\u00e4\27\3\2\2\2\u00e5\u00ea\5\32\16\2\u00e6\u00e7\7\f\2\2\u00e7"+
		"\u00e9\5\32\16\2\u00e8\u00e6\3\2\2\2\u00e9\u00ec\3\2\2\2\u00ea\u00e8\3"+
		"\2\2\2\u00ea\u00eb\3\2\2\2\u00eb\u00f0\3\2\2\2\u00ec\u00ea\3\2\2\2\u00ed"+
		"\u00f0\7\'\2\2\u00ee\u00f0\3\2\2\2\u00ef\u00e5\3\2\2\2\u00ef\u00ed\3\2"+
		"\2\2\u00ef\u00ee\3\2\2\2\u00f0\31\3\2\2\2\u00f1\u00f2\b\16\1\2\u00f2\u00f3"+
		"\7\6\2\2\u00f3\u00f4\5\32\16\2\u00f4\u00f5\7\7\2\2\u00f5\u00fa\3\2\2\2"+
		"\u00f6\u00fa\5$\23\2\u00f7\u00f8\7)\2\2\u00f8\u00fa\5\62\32\2\u00f9\u00f1"+
		"\3\2\2\2\u00f9\u00f6\3\2\2\2\u00f9\u00f7\3\2\2\2\u00fa\u0103\3\2\2\2\u00fb"+
		"\u00fc\f\7\2\2\u00fc\u00fd\t\2\2\2\u00fd\u0102\5\32\16\b\u00fe\u00ff\f"+
		"\6\2\2\u00ff\u0100\t\3\2\2\u0100\u0102\5\32\16\7\u0101\u00fb\3\2\2\2\u0101"+
		"\u00fe\3\2\2\2\u0102\u0105\3\2\2\2\u0103\u0101\3\2\2\2\u0103\u0104\3\2"+
		"\2\2\u0104\33\3\2\2\2\u0105\u0103\3\2\2\2\u0106\u0109\5\36\20\2\u0107"+
		"\u0109\5 \21\2\u0108\u0106\3\2\2\2\u0108\u0107\3\2\2\2\u0109\35\3\2\2"+
		"\2\u010a\u010b\7)\2\2\u010b\u010e\7\20\2\2\u010c\u010f\5\32\16\2\u010d"+
		"\u010f\7&\2\2\u010e\u010c\3\2\2\2\u010e\u010d\3\2\2\2\u010f\37\3\2\2\2"+
		"\u0110\u0111\7)\2\2\u0111\u0112\7\20\2\2\u0112\u0118\5\32\16\2\u0113\u0114"+
		"\5&\24\2\u0114\u0115\7\20\2\2\u0115\u0116\5\32\16\2\u0116\u0118\3\2\2"+
		"\2\u0117\u0110\3\2\2\2\u0117\u0113\3\2\2\2\u0118!\3\2\2\2\u0119\u011a"+
		"\5.\30\2\u011a\u011b\5\36\20\2\u011b\u0123\3\2\2\2\u011c\u011d\5\60\31"+
		"\2\u011d\u011e\7\4\2\2\u011e\u011f\5.\30\2\u011f\u0120\7\5\2\2\u0120\u0121"+
		"\5 \21\2\u0121\u0123\3\2\2\2\u0122\u0119\3\2\2\2\u0122\u011c\3\2\2\2\u0123"+
		"#\3\2\2\2\u0124\u0135\7)\2\2\u0125\u0135\5\66\34\2\u0126\u0127\7\21\2"+
		"\2\u0127\u012c\5(\25\2\u0128\u0129\7\3\2\2\u0129\u012b\5(\25\2\u012a\u0128"+
		"\3\2\2\2\u012b\u012e\3\2\2\2\u012c\u012a\3\2\2\2\u012c\u012d\3\2\2\2\u012d"+
		"\u012f\3\2\2\2\u012e\u012c\3\2\2\2\u012f\u0130\7\22\2\2\u0130\u0135\3"+
		"\2\2\2\u0131\u0135\5\26\f\2\u0132\u0135\5&\24\2\u0133\u0135\7&\2\2\u0134"+
		"\u0124\3\2\2\2\u0134\u0125\3\2\2\2\u0134\u0126\3\2\2\2\u0134\u0131\3\2"+
		"\2\2\u0134\u0132\3\2\2\2\u0134\u0133\3\2\2\2\u0135%\3\2\2\2\u0136\u0137"+
		"\7)\2\2\u0137\u0138\7\21\2\2\u0138\u0139\5,\27\2\u0139\u013a\7\22\2\2"+
		"\u013a\'\3\2\2\2\u013b\u0140\5$\23\2\u013c\u013d\7\f\2\2\u013d\u013f\5"+
		"$\23\2\u013e\u013c\3\2\2\2\u013f\u0142\3\2\2\2\u0140\u013e\3\2\2\2\u0140"+
		"\u0141\3\2\2\2\u0141)\3\2\2\2\u0142\u0140\3\2\2\2\u0143\u0148\5\66\34"+
		"\2\u0144\u0145\7\f\2\2\u0145\u0147\5\66\34\2\u0146\u0144\3\2\2\2\u0147"+
		"\u014a\3\2\2\2\u0148\u0146\3\2\2\2\u0148\u0149\3\2\2\2\u0149+\3\2\2\2"+
		"\u014a\u0148\3\2\2\2\u014b\u014e\t\4\2\2\u014c\u014d\7\f\2\2\u014d\u014f"+
		"\t\4\2\2\u014e\u014c\3\2\2\2\u014e\u014f\3\2\2\2\u014f-\3\2\2\2\u0150"+
		"\u0151\t\5\2\2\u0151/\3\2\2\2\u0152\u0153\t\6\2\2\u0153\61\3\2\2\2\u0154"+
		"\u0155\t\7\2\2\u0155\63\3\2\2\2\u0156\u0157\t\b\2\2\u0157\65\3\2\2\2\u0158"+
		"\u0159\t\t\2\2\u0159\67\3\2\2\2%;AGZotz\u0081\u0084\u0088\u008c\u0090"+
		"\u0096\u00a6\u00b2\u00b9\u00c7\u00d4\u00d8\u00db\u00de\u00ea\u00ef\u00f9"+
		"\u0101\u0103\u0108\u010e\u0117\u0122\u012c\u0134\u0140\u0148\u014e";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}