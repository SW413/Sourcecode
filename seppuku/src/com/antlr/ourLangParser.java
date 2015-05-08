// Generated from ourLang.g4 by ANTLR 4.5
package com.antlr;
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
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		IMPORT=32, IF=33, ELSE=34, WHILE=35, FOR=36, PFOR=37, MATRIX=38, VECTOR=39, 
		INT=40, INTNUM=41, FLOAT=42, FLOATNUM=43, BOOL=44, BOOLVAL=45, VOID=46, 
		STRING=47, SIGN=48, PRINT=49, COMPLEXTOFILE=50, FILETOCOMPLEX=51, ID=52, 
		LIBRARY=53, WS=54, NL=55, COMMENT=56, LINE_COMMENT=57;
	public static final int
		RULE_topLevel = 0, RULE_statement = 1, RULE_importing = 2, RULE_controlblock = 3, 
		RULE_loop = 4, RULE_block = 5, RULE_conditionalExpression = 6, RULE_functiondeclaration = 7, 
		RULE_functionbody = 8, RULE_functionreturn = 9, RULE_parameterlist = 10, 
		RULE_parameter = 11, RULE_functioncall = 12, RULE_argumentlist = 13, RULE_expression = 14, 
		RULE_assignment = 15, RULE_valassignment = 16, RULE_collectionassignment = 17, 
		RULE_declaration = 18, RULE_valueType = 19, RULE_complexdatatype = 20, 
		RULE_functiondatatype = 21, RULE_value = 22, RULE_collectionEntrance = 23, 
		RULE_valueList = 24, RULE_constantList = 25, RULE_entranceCoordinate = 26, 
		RULE_collectiontype = 27, RULE_postUnaryOperator = 28, RULE_assignmentOperator = 29, 
		RULE_conditionalOperator = 30, RULE_constant = 31;
	public static final String[] ruleNames = {
		"topLevel", "statement", "importing", "controlblock", "loop", "block", 
		"conditionalExpression", "functiondeclaration", "functionbody", "functionreturn", 
		"parameterlist", "parameter", "functioncall", "argumentlist", "expression", 
		"assignment", "valassignment", "collectionassignment", "declaration", 
		"valueType", "complexdatatype", "functiondatatype", "value", "collectionEntrance", 
		"valueList", "constantList", "entranceCoordinate", "collectiontype", "postUnaryOperator", 
		"assignmentOperator", "conditionalOperator", "constant"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "';'", "'<'", "'>'", "'('", "')'", "'{'", "'}'", "'&&'", "'||'", 
		"'=='", "'!='", "'return'", "','", "'^'", "'*'", "'/'", "'%'", "'#'", 
		"'+'", "'='", "'['", "']'", "'++'", "'--'", "'^T'", "'+='", "'-='", "'*='", 
		"'/='", "'<='", "'>='", null, "'if'", "'else'", "'while'", "'for'", "'pfor'", 
		"'matrix'", "'vector'", null, null, null, null, "'bool'", null, "'void'", 
		null, "'-'", "'print'", "'matrixToFile'", "'fileToMatrix'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, "IMPORT", "IF", "ELSE", 
		"WHILE", "FOR", "PFOR", "MATRIX", "VECTOR", "INT", "INTNUM", "FLOAT", 
		"FLOATNUM", "BOOL", "BOOLVAL", "VOID", "STRING", "SIGN", "PRINT", "COMPLEXTOFILE", 
		"FILETOCOMPLEX", "ID", "LIBRARY", "WS", "NL", "COMMENT", "LINE_COMMENT"
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
			setState(67);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IMPORT) {
				{
				{
				setState(64);
				importing();
				}
				}
				setState(69);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(73);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(70);
					functiondeclaration();
					}
					} 
				}
				setState(75);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			setState(79);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << WHILE) | (1L << FOR) | (1L << MATRIX) | (1L << VECTOR) | (1L << INT) | (1L << FLOAT) | (1L << BOOL) | (1L << PRINT) | (1L << COMPLEXTOFILE) | (1L << FILETOCOMPLEX) | (1L << ID))) != 0)) {
				{
				{
				setState(76);
				statement();
				}
				}
				setState(81);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(82);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ourLangVisitor ) return ((ourLangVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			setState(95);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(84);
				assignment();
				setState(85);
				match(T__0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(87);
				declaration();
				setState(88);
				match(T__0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(90);
				functioncall();
				setState(91);
				match(T__0);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(93);
				controlblock();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(94);
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
			setState(97);
			match(IMPORT);
			setState(98);
			match(T__1);
			setState(99);
			match(LIBRARY);
			setState(100);
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
		public BlockContext ifBlock;
		public BlockContext elseIfBlock;
		public BlockContext elseBlock;
		public List<TerminalNode> IF() { return getTokens(ourLangParser.IF); }
		public TerminalNode IF(int i) {
			return getToken(ourLangParser.IF, i);
		}
		public List<ConditionalExpressionContext> conditionalExpression() {
			return getRuleContexts(ConditionalExpressionContext.class);
		}
		public ConditionalExpressionContext conditionalExpression(int i) {
			return getRuleContext(ConditionalExpressionContext.class,i);
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
			setState(102);
			match(IF);
			setState(103);
			match(T__3);
			setState(104);
			conditionalExpression(0);
			setState(105);
			match(T__4);
			setState(106);
			((ControlblockContext)_localctx).ifBlock = block();
			setState(116);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
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
					conditionalExpression(0);
					setState(111);
					match(T__4);
					setState(112);
					((ControlblockContext)_localctx).elseIfBlock = block();
					}
					} 
				}
				setState(118);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			}
			setState(121);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(119);
				match(ELSE);
				setState(120);
				((ControlblockContext)_localctx).elseBlock = block();
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
		public LoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loop; }
	 
		public LoopContext() { }
		public void copyFrom(LoopContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class WhileLoopContext extends LoopContext {
		public BlockContext whileBlock;
		public TerminalNode WHILE() { return getToken(ourLangParser.WHILE, 0); }
		public ConditionalExpressionContext conditionalExpression() {
			return getRuleContext(ConditionalExpressionContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public WhileLoopContext(LoopContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ourLangVisitor ) return ((ourLangVisitor<? extends T>)visitor).visitWhileLoop(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ForLoopContext extends LoopContext {
		public BlockContext forBlock;
		public TerminalNode FOR() { return getToken(ourLangParser.FOR, 0); }
		public ConditionalExpressionContext conditionalExpression() {
			return getRuleContext(ConditionalExpressionContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public ForLoopContext(LoopContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ourLangVisitor ) return ((ourLangVisitor<? extends T>)visitor).visitForLoop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LoopContext loop() throws RecognitionException {
		LoopContext _localctx = new LoopContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_loop);
		try {
			setState(142);
			switch (_input.LA(1)) {
			case WHILE:
				_localctx = new WhileLoopContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(123);
				match(WHILE);
				setState(124);
				match(T__3);
				setState(125);
				conditionalExpression(0);
				setState(126);
				match(T__4);
				setState(127);
				((WhileLoopContext)_localctx).whileBlock = block();
				}
				break;
			case FOR:
				_localctx = new ForLoopContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(129);
				match(FOR);
				setState(130);
				match(T__3);
				setState(133);
				switch (_input.LA(1)) {
				case MATRIX:
				case VECTOR:
				case INT:
				case FLOAT:
				case BOOL:
					{
					setState(131);
					declaration();
					}
					break;
				case ID:
					{
					setState(132);
					assignment();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(135);
				match(T__0);
				setState(136);
				conditionalExpression(0);
				setState(137);
				match(T__0);
				setState(138);
				expression(0);
				setState(139);
				match(T__4);
				setState(140);
				((ForLoopContext)_localctx).forBlock = block();
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ourLangVisitor ) return ((ourLangVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
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
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << WHILE) | (1L << FOR) | (1L << MATRIX) | (1L << VECTOR) | (1L << INT) | (1L << FLOAT) | (1L << BOOL) | (1L << PRINT) | (1L << COMPLEXTOFILE) | (1L << FILETOCOMPLEX) | (1L << ID))) != 0)) {
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

	public static class ConditionalExpressionContext extends ParserRuleContext {
		public ConditionalExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionalExpression; }
	 
		public ConditionalExpressionContext() { }
		public void copyFrom(ConditionalExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class MultiAndCondExprContext extends ConditionalExpressionContext {
		public List<ConditionalExpressionContext> conditionalExpression() {
			return getRuleContexts(ConditionalExpressionContext.class);
		}
		public ConditionalExpressionContext conditionalExpression(int i) {
			return getRuleContext(ConditionalExpressionContext.class,i);
		}
		public MultiAndCondExprContext(ConditionalExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ourLangVisitor ) return ((ourLangVisitor<? extends T>)visitor).visitMultiAndCondExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SingleCondExprContext extends ConditionalExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ConditionalOperatorContext conditionalOperator() {
			return getRuleContext(ConditionalOperatorContext.class,0);
		}
		public SingleCondExprContext(ConditionalExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ourLangVisitor ) return ((ourLangVisitor<? extends T>)visitor).visitSingleCondExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BoolValConExprContext extends ConditionalExpressionContext {
		public TerminalNode BOOLVAL() { return getToken(ourLangParser.BOOLVAL, 0); }
		public BoolValConExprContext(ConditionalExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ourLangVisitor ) return ((ourLangVisitor<? extends T>)visitor).visitBoolValConExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MultiConExprContext extends ConditionalExpressionContext {
		public List<ConditionalExpressionContext> conditionalExpression() {
			return getRuleContexts(ConditionalExpressionContext.class);
		}
		public ConditionalExpressionContext conditionalExpression(int i) {
			return getRuleContext(ConditionalExpressionContext.class,i);
		}
		public MultiConExprContext(ConditionalExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ourLangVisitor ) return ((ourLangVisitor<? extends T>)visitor).visitMultiConExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MultiOrCondExprContext extends ConditionalExpressionContext {
		public List<ConditionalExpressionContext> conditionalExpression() {
			return getRuleContexts(ConditionalExpressionContext.class);
		}
		public ConditionalExpressionContext conditionalExpression(int i) {
			return getRuleContext(ConditionalExpressionContext.class,i);
		}
		public MultiOrCondExprContext(ConditionalExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ourLangVisitor ) return ((ourLangVisitor<? extends T>)visitor).visitMultiOrCondExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParenConExprContext extends ConditionalExpressionContext {
		public ConditionalExpressionContext conditionalExpression() {
			return getRuleContext(ConditionalExpressionContext.class,0);
		}
		public ParenConExprContext(ConditionalExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ourLangVisitor ) return ((ourLangVisitor<? extends T>)visitor).visitParenConExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionalExpressionContext conditionalExpression() throws RecognitionException {
		return conditionalExpression(0);
	}

	private ConditionalExpressionContext conditionalExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ConditionalExpressionContext _localctx = new ConditionalExpressionContext(_ctx, _parentState);
		ConditionalExpressionContext _prevctx = _localctx;
		int _startState = 12;
		enterRecursionRule(_localctx, 12, RULE_conditionalExpression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(163);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				_localctx = new SingleCondExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(154);
				expression(0);
				setState(155);
				conditionalOperator();
				setState(156);
				expression(0);
				}
				break;
			case 2:
				{
				_localctx = new ParenConExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(158);
				match(T__3);
				setState(159);
				conditionalExpression(0);
				setState(160);
				match(T__4);
				}
				break;
			case 3:
				{
				_localctx = new BoolValConExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(162);
				match(BOOLVAL);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(176);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(174);
					switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
					case 1:
						{
						_localctx = new MultiAndCondExprContext(new ConditionalExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_conditionalExpression);
						setState(165);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(166);
						match(T__7);
						setState(167);
						conditionalExpression(7);
						}
						break;
					case 2:
						{
						_localctx = new MultiOrCondExprContext(new ConditionalExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_conditionalExpression);
						setState(168);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(169);
						match(T__8);
						setState(170);
						conditionalExpression(6);
						}
						break;
					case 3:
						{
						_localctx = new MultiConExprContext(new ConditionalExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_conditionalExpression);
						setState(171);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(172);
						_la = _input.LA(1);
						if ( !(_la==T__9 || _la==T__10) ) {
						_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(173);
						conditionalExpression(4);
						}
						break;
					}
					} 
				}
				setState(178);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
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

	public static class FunctiondeclarationContext extends ParserRuleContext {
		public FunctiondatatypeContext functiondatatype() {
			return getRuleContext(FunctiondatatypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(ourLangParser.ID, 0); }
		public ParameterlistContext parameterlist() {
			return getRuleContext(ParameterlistContext.class,0);
		}
		public FunctionbodyContext functionbody() {
			return getRuleContext(FunctionbodyContext.class,0);
		}
		public FunctiondeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functiondeclaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ourLangVisitor ) return ((ourLangVisitor<? extends T>)visitor).visitFunctiondeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctiondeclarationContext functiondeclaration() throws RecognitionException {
		FunctiondeclarationContext _localctx = new FunctiondeclarationContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_functiondeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(179);
			functiondatatype();
			setState(180);
			match(ID);
			setState(181);
			match(T__3);
			setState(182);
			parameterlist();
			setState(183);
			match(T__4);
			setState(184);
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
		public FunctionreturnContext functionreturn() {
			return getRuleContext(FunctionreturnContext.class,0);
		}
		public FunctionbodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionbody; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ourLangVisitor ) return ((ourLangVisitor<? extends T>)visitor).visitFunctionbody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionbodyContext functionbody() throws RecognitionException {
		FunctionbodyContext _localctx = new FunctionbodyContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_functionbody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(186);
			match(T__5);
			setState(190);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << WHILE) | (1L << FOR) | (1L << MATRIX) | (1L << VECTOR) | (1L << INT) | (1L << FLOAT) | (1L << BOOL) | (1L << PRINT) | (1L << COMPLEXTOFILE) | (1L << FILETOCOMPLEX) | (1L << ID))) != 0)) {
				{
				{
				setState(187);
				statement();
				}
				}
				setState(192);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(194);
			_la = _input.LA(1);
			if (_la==T__11) {
				{
				setState(193);
				functionreturn();
				}
			}

			setState(196);
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

	public static class FunctionreturnContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public FunctionreturnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionreturn; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ourLangVisitor ) return ((ourLangVisitor<? extends T>)visitor).visitFunctionreturn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionreturnContext functionreturn() throws RecognitionException {
		FunctionreturnContext _localctx = new FunctionreturnContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_functionreturn);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(198);
			match(T__11);
			setState(199);
			expression(0);
			setState(200);
			match(T__0);
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
		public List<ParameterContext> parameter() {
			return getRuleContexts(ParameterContext.class);
		}
		public ParameterContext parameter(int i) {
			return getRuleContext(ParameterContext.class,i);
		}
		public ParameterlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterlist; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ourLangVisitor ) return ((ourLangVisitor<? extends T>)visitor).visitParameterlist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterlistContext parameterlist() throws RecognitionException {
		ParameterlistContext _localctx = new ParameterlistContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_parameterlist);
		int _la;
		try {
			setState(213);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(210);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MATRIX) | (1L << VECTOR) | (1L << INT) | (1L << FLOAT) | (1L << BOOL))) != 0)) {
					{
					setState(202);
					parameter();
					setState(207);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__12) {
						{
						{
						setState(203);
						match(T__12);
						setState(204);
						parameter();
						}
						}
						setState(209);
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

	public static class ParameterContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(ourLangParser.ID, 0); }
		public ValueTypeContext valueType() {
			return getRuleContext(ValueTypeContext.class,0);
		}
		public ComplexdatatypeContext complexdatatype() {
			return getRuleContext(ComplexdatatypeContext.class,0);
		}
		public ParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ourLangVisitor ) return ((ourLangVisitor<? extends T>)visitor).visitParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterContext parameter() throws RecognitionException {
		ParameterContext _localctx = new ParameterContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_parameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(217);
			switch (_input.LA(1)) {
			case INT:
			case FLOAT:
			case BOOL:
				{
				setState(215);
				valueType();
				}
				break;
			case MATRIX:
			case VECTOR:
				{
				setState(216);
				complexdatatype();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(219);
			match(ID);
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
		public FunctioncallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functioncall; }
	 
		public FunctioncallContext() { }
		public void copyFrom(FunctioncallContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class FileToComplexFuncContext extends FunctioncallContext {
		public TerminalNode FILETOCOMPLEX() { return getToken(ourLangParser.FILETOCOMPLEX, 0); }
		public ArgumentlistContext argumentlist() {
			return getRuleContext(ArgumentlistContext.class,0);
		}
		public FileToComplexFuncContext(FunctioncallContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ourLangVisitor ) return ((ourLangVisitor<? extends T>)visitor).visitFileToComplexFunc(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CustomFuncContext extends FunctioncallContext {
		public TerminalNode ID() { return getToken(ourLangParser.ID, 0); }
		public ArgumentlistContext argumentlist() {
			return getRuleContext(ArgumentlistContext.class,0);
		}
		public CustomFuncContext(FunctioncallContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ourLangVisitor ) return ((ourLangVisitor<? extends T>)visitor).visitCustomFunc(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ComplexToFileFuncContext extends FunctioncallContext {
		public TerminalNode COMPLEXTOFILE() { return getToken(ourLangParser.COMPLEXTOFILE, 0); }
		public ArgumentlistContext argumentlist() {
			return getRuleContext(ArgumentlistContext.class,0);
		}
		public ComplexToFileFuncContext(FunctioncallContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ourLangVisitor ) return ((ourLangVisitor<? extends T>)visitor).visitComplexToFileFunc(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PrintFuncContext extends FunctioncallContext {
		public TerminalNode PRINT() { return getToken(ourLangParser.PRINT, 0); }
		public ArgumentlistContext argumentlist() {
			return getRuleContext(ArgumentlistContext.class,0);
		}
		public PrintFuncContext(FunctioncallContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ourLangVisitor ) return ((ourLangVisitor<? extends T>)visitor).visitPrintFunc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctioncallContext functioncall() throws RecognitionException {
		FunctioncallContext _localctx = new FunctioncallContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_functioncall);
		try {
			setState(241);
			switch (_input.LA(1)) {
			case ID:
				_localctx = new CustomFuncContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(221);
				match(ID);
				setState(222);
				match(T__3);
				setState(223);
				argumentlist();
				setState(224);
				match(T__4);
				}
				break;
			case PRINT:
				_localctx = new PrintFuncContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(226);
				match(PRINT);
				setState(227);
				match(T__3);
				setState(228);
				argumentlist();
				setState(229);
				match(T__4);
				}
				break;
			case COMPLEXTOFILE:
				_localctx = new ComplexToFileFuncContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(231);
				match(COMPLEXTOFILE);
				setState(232);
				match(T__3);
				setState(233);
				argumentlist();
				setState(234);
				match(T__4);
				}
				break;
			case FILETOCOMPLEX:
				_localctx = new FileToComplexFuncContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(236);
				match(FILETOCOMPLEX);
				setState(237);
				match(T__3);
				setState(238);
				argumentlist();
				setState(239);
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

	public static class ArgumentlistContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> STRING() { return getTokens(ourLangParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(ourLangParser.STRING, i);
		}
		public ArgumentlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argumentlist; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ourLangVisitor ) return ((ourLangVisitor<? extends T>)visitor).visitArgumentlist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentlistContext argumentlist() throws RecognitionException {
		ArgumentlistContext _localctx = new ArgumentlistContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_argumentlist);
		int _la;
		try {
			setState(258);
			switch (_input.LA(1)) {
			case T__3:
			case T__20:
			case INTNUM:
			case FLOATNUM:
			case BOOLVAL:
			case STRING:
			case PRINT:
			case COMPLEXTOFILE:
			case FILETOCOMPLEX:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(245);
				switch (_input.LA(1)) {
				case T__3:
				case T__20:
				case INTNUM:
				case FLOATNUM:
				case BOOLVAL:
				case PRINT:
				case COMPLEXTOFILE:
				case FILETOCOMPLEX:
				case ID:
					{
					setState(243);
					expression(0);
					}
					break;
				case STRING:
					{
					setState(244);
					match(STRING);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(254);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__12) {
					{
					{
					setState(247);
					match(T__12);
					setState(250);
					switch (_input.LA(1)) {
					case T__3:
					case T__20:
					case INTNUM:
					case FLOATNUM:
					case BOOLVAL:
					case PRINT:
					case COMPLEXTOFILE:
					case FILETOCOMPLEX:
					case ID:
						{
						setState(248);
						expression(0);
						}
						break;
					case STRING:
						{
						setState(249);
						match(STRING);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					}
					setState(256);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 2);
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
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ValueExprContext extends ExpressionContext {
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public ValueExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ourLangVisitor ) return ((ourLangVisitor<? extends T>)visitor).visitValueExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PowerExprContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public PowerExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ourLangVisitor ) return ((ourLangVisitor<? extends T>)visitor).visitPowerExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AddExprContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public AddExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ourLangVisitor ) return ((ourLangVisitor<? extends T>)visitor).visitAddExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PostIDExprContext extends ExpressionContext {
		public TerminalNode ID() { return getToken(ourLangParser.ID, 0); }
		public PostUnaryOperatorContext postUnaryOperator() {
			return getRuleContext(PostUnaryOperatorContext.class,0);
		}
		public PostIDExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ourLangVisitor ) return ((ourLangVisitor<? extends T>)visitor).visitPostIDExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MulExprContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public MulExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ourLangVisitor ) return ((ourLangVisitor<? extends T>)visitor).visitMulExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParenExprContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ParenExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ourLangVisitor ) return ((ourLangVisitor<? extends T>)visitor).visitParenExpr(this);
			else return visitor.visitChildren(this);
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
		int _startState = 28;
		enterRecursionRule(_localctx, 28, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(268);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				{
				_localctx = new ParenExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(261);
				match(T__3);
				setState(262);
				expression(0);
				setState(263);
				match(T__4);
				}
				break;
			case 2:
				{
				_localctx = new ValueExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(265);
				value();
				}
				break;
			case 3:
				{
				_localctx = new PostIDExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(266);
				match(ID);
				setState(267);
				postUnaryOperator();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(281);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(279);
					switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
					case 1:
						{
						_localctx = new PowerExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(270);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(271);
						match(T__13);
						setState(272);
						expression(7);
						}
						break;
					case 2:
						{
						_localctx = new MulExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(273);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(274);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17))) != 0)) ) {
						_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(275);
						expression(6);
						}
						break;
					case 3:
						{
						_localctx = new AddExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(276);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(277);
						_la = _input.LA(1);
						if ( !(_la==T__18 || _la==SIGN) ) {
						_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(278);
						expression(5);
						}
						break;
					}
					} 
				}
				setState(283);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ourLangVisitor ) return ((ourLangVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_assignment);
		try {
			setState(286);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(284);
				valassignment();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(285);
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
		public ValassignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valassignment; }
	 
		public ValassignmentContext() { }
		public void copyFrom(ValassignmentContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class PostUnaryAssignmentContext extends ValassignmentContext {
		public TerminalNode ID() { return getToken(ourLangParser.ID, 0); }
		public PostUnaryOperatorContext postUnaryOperator() {
			return getRuleContext(PostUnaryOperatorContext.class,0);
		}
		public PostUnaryAssignmentContext(ValassignmentContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ourLangVisitor ) return ((ourLangVisitor<? extends T>)visitor).visitPostUnaryAssignment(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StdAssignmentContext extends ValassignmentContext {
		public TerminalNode ID() { return getToken(ourLangParser.ID, 0); }
		public AssignmentOperatorContext assignmentOperator() {
			return getRuleContext(AssignmentOperatorContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode BOOLVAL() { return getToken(ourLangParser.BOOLVAL, 0); }
		public StdAssignmentContext(ValassignmentContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ourLangVisitor ) return ((ourLangVisitor<? extends T>)visitor).visitStdAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValassignmentContext valassignment() throws RecognitionException {
		ValassignmentContext _localctx = new ValassignmentContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_valassignment);
		try {
			setState(296);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				_localctx = new StdAssignmentContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(288);
				match(ID);
				setState(289);
				assignmentOperator();
				setState(292);
				switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
				case 1:
					{
					setState(290);
					expression(0);
					}
					break;
				case 2:
					{
					setState(291);
					match(BOOLVAL);
					}
					break;
				}
				}
				break;
			case 2:
				_localctx = new PostUnaryAssignmentContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(294);
				match(ID);
				setState(295);
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

	public static class CollectionassignmentContext extends ParserRuleContext {
		public CollectionassignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_collectionassignment; }
	 
		public CollectionassignmentContext() { }
		public void copyFrom(CollectionassignmentContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class EntireCollectionAssignmentContext extends CollectionassignmentContext {
		public TerminalNode ID() { return getToken(ourLangParser.ID, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public EntireCollectionAssignmentContext(CollectionassignmentContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ourLangVisitor ) return ((ourLangVisitor<? extends T>)visitor).visitEntireCollectionAssignment(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CollectionEntranceAssignmentContext extends CollectionassignmentContext {
		public CollectionEntranceContext collectionEntrance() {
			return getRuleContext(CollectionEntranceContext.class,0);
		}
		public AssignmentOperatorContext assignmentOperator() {
			return getRuleContext(AssignmentOperatorContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public CollectionEntranceAssignmentContext(CollectionassignmentContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ourLangVisitor ) return ((ourLangVisitor<? extends T>)visitor).visitCollectionEntranceAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CollectionassignmentContext collectionassignment() throws RecognitionException {
		CollectionassignmentContext _localctx = new CollectionassignmentContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_collectionassignment);
		try {
			setState(305);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				_localctx = new EntireCollectionAssignmentContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(298);
				match(ID);
				setState(299);
				match(T__19);
				setState(300);
				expression(0);
				}
				break;
			case 2:
				_localctx = new CollectionEntranceAssignmentContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(301);
				collectionEntrance();
				setState(302);
				assignmentOperator();
				setState(303);
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
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
	 
		public DeclarationContext() { }
		public void copyFrom(DeclarationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class PrimitiveDeclContext extends DeclarationContext {
		public ValueTypeContext valueType() {
			return getRuleContext(ValueTypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(ourLangParser.ID, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public PrimitiveDeclContext(DeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ourLangVisitor ) return ((ourLangVisitor<? extends T>)visitor).visitPrimitiveDecl(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ComplexDeclContext extends DeclarationContext {
		public ComplexdatatypeContext complexdatatype() {
			return getRuleContext(ComplexdatatypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(ourLangParser.ID, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ComplexDeclContext(DeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ourLangVisitor ) return ((ourLangVisitor<? extends T>)visitor).visitComplexDecl(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SpecialComplexDeclContext extends DeclarationContext {
		public ComplexdatatypeContext complexdatatype() {
			return getRuleContext(ComplexdatatypeContext.class,0);
		}
		public EntranceCoordinateContext entranceCoordinate() {
			return getRuleContext(EntranceCoordinateContext.class,0);
		}
		public TerminalNode ID() { return getToken(ourLangParser.ID, 0); }
		public SpecialComplexDeclContext(DeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ourLangVisitor ) return ((ourLangVisitor<? extends T>)visitor).visitSpecialComplexDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_declaration);
		try {
			setState(323);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				_localctx = new PrimitiveDeclContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(307);
				valueType();
				setState(308);
				match(ID);
				setState(309);
				match(T__19);
				setState(310);
				expression(0);
				}
				break;
			case 2:
				_localctx = new ComplexDeclContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(312);
				complexdatatype();
				setState(313);
				match(ID);
				setState(314);
				match(T__19);
				setState(315);
				expression(0);
				}
				break;
			case 3:
				_localctx = new SpecialComplexDeclContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(317);
				complexdatatype();
				setState(318);
				match(T__20);
				setState(319);
				entranceCoordinate();
				setState(320);
				match(T__21);
				setState(321);
				match(ID);
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

	public static class ValueTypeContext extends ParserRuleContext {
		public ValueTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valueType; }
	 
		public ValueTypeContext() { }
		public void copyFrom(ValueTypeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class BooleanContext extends ValueTypeContext {
		public TerminalNode BOOL() { return getToken(ourLangParser.BOOL, 0); }
		public BooleanContext(ValueTypeContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ourLangVisitor ) return ((ourLangVisitor<? extends T>)visitor).visitBoolean(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FloatingpointContext extends ValueTypeContext {
		public TerminalNode FLOAT() { return getToken(ourLangParser.FLOAT, 0); }
		public FloatingpointContext(ValueTypeContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ourLangVisitor ) return ((ourLangVisitor<? extends T>)visitor).visitFloatingpoint(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntegerContext extends ValueTypeContext {
		public TerminalNode INT() { return getToken(ourLangParser.INT, 0); }
		public IntegerContext(ValueTypeContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ourLangVisitor ) return ((ourLangVisitor<? extends T>)visitor).visitInteger(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueTypeContext valueType() throws RecognitionException {
		ValueTypeContext _localctx = new ValueTypeContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_valueType);
		try {
			setState(328);
			switch (_input.LA(1)) {
			case INT:
				_localctx = new IntegerContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(325);
				match(INT);
				}
				break;
			case FLOAT:
				_localctx = new FloatingpointContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(326);
				match(FLOAT);
				}
				break;
			case BOOL:
				_localctx = new BooleanContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(327);
				match(BOOL);
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

	public static class ComplexdatatypeContext extends ParserRuleContext {
		public CollectiontypeContext collectiontype() {
			return getRuleContext(CollectiontypeContext.class,0);
		}
		public ValueTypeContext valueType() {
			return getRuleContext(ValueTypeContext.class,0);
		}
		public ComplexdatatypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_complexdatatype; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ourLangVisitor ) return ((ourLangVisitor<? extends T>)visitor).visitComplexdatatype(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComplexdatatypeContext complexdatatype() throws RecognitionException {
		ComplexdatatypeContext _localctx = new ComplexdatatypeContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_complexdatatype);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(330);
			collectiontype();
			setState(331);
			match(T__1);
			setState(332);
			valueType();
			setState(333);
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

	public static class FunctiondatatypeContext extends ParserRuleContext {
		public ValueTypeContext valueType() {
			return getRuleContext(ValueTypeContext.class,0);
		}
		public ComplexdatatypeContext complexdatatype() {
			return getRuleContext(ComplexdatatypeContext.class,0);
		}
		public TerminalNode VOID() { return getToken(ourLangParser.VOID, 0); }
		public FunctiondatatypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functiondatatype; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ourLangVisitor ) return ((ourLangVisitor<? extends T>)visitor).visitFunctiondatatype(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctiondatatypeContext functiondatatype() throws RecognitionException {
		FunctiondatatypeContext _localctx = new FunctiondatatypeContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_functiondatatype);
		try {
			setState(338);
			switch (_input.LA(1)) {
			case INT:
			case FLOAT:
			case BOOL:
				enterOuterAlt(_localctx, 1);
				{
				setState(335);
				valueType();
				}
				break;
			case MATRIX:
			case VECTOR:
				enterOuterAlt(_localctx, 2);
				{
				setState(336);
				complexdatatype();
				}
				break;
			case VOID:
				enterOuterAlt(_localctx, 3);
				{
				setState(337);
				match(VOID);
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
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
	 
		public ValueContext() { }
		public void copyFrom(ValueContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ValIDContext extends ValueContext {
		public TerminalNode ID() { return getToken(ourLangParser.ID, 0); }
		public ValIDContext(ValueContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ourLangVisitor ) return ((ourLangVisitor<? extends T>)visitor).visitValID(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ValFuncCallContext extends ValueContext {
		public FunctioncallContext functioncall() {
			return getRuleContext(FunctioncallContext.class,0);
		}
		public ValFuncCallContext(ValueContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ourLangVisitor ) return ((ourLangVisitor<? extends T>)visitor).visitValFuncCall(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ValListContext extends ValueContext {
		public List<ValueListContext> valueList() {
			return getRuleContexts(ValueListContext.class);
		}
		public ValueListContext valueList(int i) {
			return getRuleContext(ValueListContext.class,i);
		}
		public ValListContext(ValueContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ourLangVisitor ) return ((ourLangVisitor<? extends T>)visitor).visitValList(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ValCollectionEntranceContext extends ValueContext {
		public CollectionEntranceContext collectionEntrance() {
			return getRuleContext(CollectionEntranceContext.class,0);
		}
		public ValCollectionEntranceContext(ValueContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ourLangVisitor ) return ((ourLangVisitor<? extends T>)visitor).visitValCollectionEntrance(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ValConstantContext extends ValueContext {
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public ValConstantContext(ValueContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ourLangVisitor ) return ((ourLangVisitor<? extends T>)visitor).visitValConstant(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ValBoolContext extends ValueContext {
		public TerminalNode BOOLVAL() { return getToken(ourLangParser.BOOLVAL, 0); }
		public ValBoolContext(ValueContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ourLangVisitor ) return ((ourLangVisitor<? extends T>)visitor).visitValBool(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_value);
		int _la;
		try {
			setState(356);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				_localctx = new ValIDContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(340);
				match(ID);
				}
				break;
			case 2:
				_localctx = new ValConstantContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(341);
				constant();
				}
				break;
			case 3:
				_localctx = new ValListContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(342);
				match(T__20);
				setState(343);
				valueList();
				setState(348);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__0) {
					{
					{
					setState(344);
					match(T__0);
					setState(345);
					valueList();
					}
					}
					setState(350);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(351);
				match(T__21);
				}
				break;
			case 4:
				_localctx = new ValFuncCallContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(353);
				functioncall();
				}
				break;
			case 5:
				_localctx = new ValCollectionEntranceContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(354);
				collectionEntrance();
				}
				break;
			case 6:
				_localctx = new ValBoolContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(355);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ourLangVisitor ) return ((ourLangVisitor<? extends T>)visitor).visitCollectionEntrance(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CollectionEntranceContext collectionEntrance() throws RecognitionException {
		CollectionEntranceContext _localctx = new CollectionEntranceContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_collectionEntrance);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(358);
			match(ID);
			setState(359);
			match(T__20);
			setState(360);
			entranceCoordinate();
			setState(361);
			match(T__21);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ourLangVisitor ) return ((ourLangVisitor<? extends T>)visitor).visitValueList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueListContext valueList() throws RecognitionException {
		ValueListContext _localctx = new ValueListContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_valueList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(363);
			value();
			setState(368);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__12) {
				{
				{
				setState(364);
				match(T__12);
				setState(365);
				value();
				}
				}
				setState(370);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ourLangVisitor ) return ((ourLangVisitor<? extends T>)visitor).visitConstantList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantListContext constantList() throws RecognitionException {
		ConstantListContext _localctx = new ConstantListContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_constantList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(371);
			constant();
			setState(376);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__12) {
				{
				{
				setState(372);
				match(T__12);
				setState(373);
				constant();
				}
				}
				setState(378);
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
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public EntranceCoordinateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_entranceCoordinate; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ourLangVisitor ) return ((ourLangVisitor<? extends T>)visitor).visitEntranceCoordinate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EntranceCoordinateContext entranceCoordinate() throws RecognitionException {
		EntranceCoordinateContext _localctx = new EntranceCoordinateContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_entranceCoordinate);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(379);
			value();
			setState(382);
			_la = _input.LA(1);
			if (_la==T__12) {
				{
				setState(380);
				match(T__12);
				setState(381);
				value();
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

	public static class CollectiontypeContext extends ParserRuleContext {
		public CollectiontypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_collectiontype; }
	 
		public CollectiontypeContext() { }
		public void copyFrom(CollectiontypeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class CollectionVectorContext extends CollectiontypeContext {
		public TerminalNode VECTOR() { return getToken(ourLangParser.VECTOR, 0); }
		public CollectionVectorContext(CollectiontypeContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ourLangVisitor ) return ((ourLangVisitor<? extends T>)visitor).visitCollectionVector(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CollectionMatrixContext extends CollectiontypeContext {
		public TerminalNode MATRIX() { return getToken(ourLangParser.MATRIX, 0); }
		public CollectionMatrixContext(CollectiontypeContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ourLangVisitor ) return ((ourLangVisitor<? extends T>)visitor).visitCollectionMatrix(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CollectiontypeContext collectiontype() throws RecognitionException {
		CollectiontypeContext _localctx = new CollectiontypeContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_collectiontype);
		try {
			setState(386);
			switch (_input.LA(1)) {
			case MATRIX:
				_localctx = new CollectionMatrixContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(384);
				match(MATRIX);
				}
				break;
			case VECTOR:
				_localctx = new CollectionVectorContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(385);
				match(VECTOR);
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

	public static class PostUnaryOperatorContext extends ParserRuleContext {
		public PostUnaryOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postUnaryOperator; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ourLangVisitor ) return ((ourLangVisitor<? extends T>)visitor).visitPostUnaryOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PostUnaryOperatorContext postUnaryOperator() throws RecognitionException {
		PostUnaryOperatorContext _localctx = new PostUnaryOperatorContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_postUnaryOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(388);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__22) | (1L << T__23) | (1L << T__24))) != 0)) ) {
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

	public static class AssignmentOperatorContext extends ParserRuleContext {
		public AssignmentOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentOperator; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ourLangVisitor ) return ((ourLangVisitor<? extends T>)visitor).visitAssignmentOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentOperatorContext assignmentOperator() throws RecognitionException {
		AssignmentOperatorContext _localctx = new AssignmentOperatorContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_assignmentOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(390);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__19) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28))) != 0)) ) {
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ourLangVisitor ) return ((ourLangVisitor<? extends T>)visitor).visitConditionalOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionalOperatorContext conditionalOperator() throws RecognitionException {
		ConditionalOperatorContext _localctx = new ConditionalOperatorContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_conditionalOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(392);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__9) | (1L << T__10) | (1L << T__29) | (1L << T__30))) != 0)) ) {
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ourLangVisitor ) return ((ourLangVisitor<? extends T>)visitor).visitConstant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantContext constant() throws RecognitionException {
		ConstantContext _localctx = new ConstantContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_constant);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(394);
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
		case 6:
			return conditionalExpression_sempred((ConditionalExpressionContext)_localctx, predIndex);
		case 14:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean conditionalExpression_sempred(ConditionalExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 6);
		case 1:
			return precpred(_ctx, 5);
		case 2:
			return precpred(_ctx, 3);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 6);
		case 4:
			return precpred(_ctx, 5);
		case 5:
			return precpred(_ctx, 4);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3;\u018f\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\3\2\7\2D\n\2\f\2\16\2G\13\2\3\2\7\2J\n\2\f\2\16\2M\13\2\3\2\7\2P\n"+
		"\2\f\2\16\2S\13\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\5\3b\n\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\7\5u\n\5\f\5\16\5x\13\5\3\5\3\5\5\5|\n\5\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\5\6\u0088\n\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u0091"+
		"\n\6\3\7\3\7\7\7\u0095\n\7\f\7\16\7\u0098\13\7\3\7\3\7\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u00a6\n\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\7\b\u00b1\n\b\f\b\16\b\u00b4\13\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n"+
		"\3\n\7\n\u00bf\n\n\f\n\16\n\u00c2\13\n\3\n\5\n\u00c5\n\n\3\n\3\n\3\13"+
		"\3\13\3\13\3\13\3\f\3\f\3\f\7\f\u00d0\n\f\f\f\16\f\u00d3\13\f\5\f\u00d5"+
		"\n\f\3\f\5\f\u00d8\n\f\3\r\3\r\5\r\u00dc\n\r\3\r\3\r\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\5\16\u00f4\n\16\3\17\3\17\5\17\u00f8\n\17\3\17\3\17\3\17"+
		"\5\17\u00fd\n\17\7\17\u00ff\n\17\f\17\16\17\u0102\13\17\3\17\5\17\u0105"+
		"\n\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u010f\n\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\7\20\u011a\n\20\f\20\16\20\u011d\13"+
		"\20\3\21\3\21\5\21\u0121\n\21\3\22\3\22\3\22\3\22\5\22\u0127\n\22\3\22"+
		"\3\22\5\22\u012b\n\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u0134\n"+
		"\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3"+
		"\24\3\24\3\24\5\24\u0146\n\24\3\25\3\25\3\25\5\25\u014b\n\25\3\26\3\26"+
		"\3\26\3\26\3\26\3\27\3\27\3\27\5\27\u0155\n\27\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\7\30\u015d\n\30\f\30\16\30\u0160\13\30\3\30\3\30\3\30\3\30\3\30"+
		"\5\30\u0167\n\30\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\7\32\u0171\n"+
		"\32\f\32\16\32\u0174\13\32\3\33\3\33\3\33\7\33\u0179\n\33\f\33\16\33\u017c"+
		"\13\33\3\34\3\34\3\34\5\34\u0181\n\34\3\35\3\35\5\35\u0185\n\35\3\36\3"+
		"\36\3\37\3\37\3 \3 \3!\3!\3!\2\4\16\36\"\2\4\6\b\n\f\16\20\22\24\26\30"+
		"\32\34\36 \"$&(*,.\60\62\64\668:<>@\2\t\3\2\f\r\3\2\21\24\4\2\25\25\62"+
		"\62\3\2\31\33\4\2\26\26\34\37\5\2\4\5\f\r !\4\2++--\u01a5\2E\3\2\2\2\4"+
		"a\3\2\2\2\6c\3\2\2\2\bh\3\2\2\2\n\u0090\3\2\2\2\f\u0092\3\2\2\2\16\u00a5"+
		"\3\2\2\2\20\u00b5\3\2\2\2\22\u00bc\3\2\2\2\24\u00c8\3\2\2\2\26\u00d7\3"+
		"\2\2\2\30\u00db\3\2\2\2\32\u00f3\3\2\2\2\34\u0104\3\2\2\2\36\u010e\3\2"+
		"\2\2 \u0120\3\2\2\2\"\u012a\3\2\2\2$\u0133\3\2\2\2&\u0145\3\2\2\2(\u014a"+
		"\3\2\2\2*\u014c\3\2\2\2,\u0154\3\2\2\2.\u0166\3\2\2\2\60\u0168\3\2\2\2"+
		"\62\u016d\3\2\2\2\64\u0175\3\2\2\2\66\u017d\3\2\2\28\u0184\3\2\2\2:\u0186"+
		"\3\2\2\2<\u0188\3\2\2\2>\u018a\3\2\2\2@\u018c\3\2\2\2BD\5\6\4\2CB\3\2"+
		"\2\2DG\3\2\2\2EC\3\2\2\2EF\3\2\2\2FK\3\2\2\2GE\3\2\2\2HJ\5\20\t\2IH\3"+
		"\2\2\2JM\3\2\2\2KI\3\2\2\2KL\3\2\2\2LQ\3\2\2\2MK\3\2\2\2NP\5\4\3\2ON\3"+
		"\2\2\2PS\3\2\2\2QO\3\2\2\2QR\3\2\2\2RT\3\2\2\2SQ\3\2\2\2TU\7\2\2\3U\3"+
		"\3\2\2\2VW\5 \21\2WX\7\3\2\2Xb\3\2\2\2YZ\5&\24\2Z[\7\3\2\2[b\3\2\2\2\\"+
		"]\5\32\16\2]^\7\3\2\2^b\3\2\2\2_b\5\b\5\2`b\5\n\6\2aV\3\2\2\2aY\3\2\2"+
		"\2a\\\3\2\2\2a_\3\2\2\2a`\3\2\2\2b\5\3\2\2\2cd\7\"\2\2de\7\4\2\2ef\7\67"+
		"\2\2fg\7\5\2\2g\7\3\2\2\2hi\7#\2\2ij\7\6\2\2jk\5\16\b\2kl\7\7\2\2lv\5"+
		"\f\7\2mn\7$\2\2no\7#\2\2op\7\6\2\2pq\5\16\b\2qr\7\7\2\2rs\5\f\7\2su\3"+
		"\2\2\2tm\3\2\2\2ux\3\2\2\2vt\3\2\2\2vw\3\2\2\2w{\3\2\2\2xv\3\2\2\2yz\7"+
		"$\2\2z|\5\f\7\2{y\3\2\2\2{|\3\2\2\2|\t\3\2\2\2}~\7%\2\2~\177\7\6\2\2\177"+
		"\u0080\5\16\b\2\u0080\u0081\7\7\2\2\u0081\u0082\5\f\7\2\u0082\u0091\3"+
		"\2\2\2\u0083\u0084\7&\2\2\u0084\u0087\7\6\2\2\u0085\u0088\5&\24\2\u0086"+
		"\u0088\5 \21\2\u0087\u0085\3\2\2\2\u0087\u0086\3\2\2\2\u0088\u0089\3\2"+
		"\2\2\u0089\u008a\7\3\2\2\u008a\u008b\5\16\b\2\u008b\u008c\7\3\2\2\u008c"+
		"\u008d\5\36\20\2\u008d\u008e\7\7\2\2\u008e\u008f\5\f\7\2\u008f\u0091\3"+
		"\2\2\2\u0090}\3\2\2\2\u0090\u0083\3\2\2\2\u0091\13\3\2\2\2\u0092\u0096"+
		"\7\b\2\2\u0093\u0095\5\4\3\2\u0094\u0093\3\2\2\2\u0095\u0098\3\2\2\2\u0096"+
		"\u0094\3\2\2\2\u0096\u0097\3\2\2\2\u0097\u0099\3\2\2\2\u0098\u0096\3\2"+
		"\2\2\u0099\u009a\7\t\2\2\u009a\r\3\2\2\2\u009b\u009c\b\b\1\2\u009c\u009d"+
		"\5\36\20\2\u009d\u009e\5> \2\u009e\u009f\5\36\20\2\u009f\u00a6\3\2\2\2"+
		"\u00a0\u00a1\7\6\2\2\u00a1\u00a2\5\16\b\2\u00a2\u00a3\7\7\2\2\u00a3\u00a6"+
		"\3\2\2\2\u00a4\u00a6\7/\2\2\u00a5\u009b\3\2\2\2\u00a5\u00a0\3\2\2\2\u00a5"+
		"\u00a4\3\2\2\2\u00a6\u00b2\3\2\2\2\u00a7\u00a8\f\b\2\2\u00a8\u00a9\7\n"+
		"\2\2\u00a9\u00b1\5\16\b\t\u00aa\u00ab\f\7\2\2\u00ab\u00ac\7\13\2\2\u00ac"+
		"\u00b1\5\16\b\b\u00ad\u00ae\f\5\2\2\u00ae\u00af\t\2\2\2\u00af\u00b1\5"+
		"\16\b\6\u00b0\u00a7\3\2\2\2\u00b0\u00aa\3\2\2\2\u00b0\u00ad\3\2\2\2\u00b1"+
		"\u00b4\3\2\2\2\u00b2\u00b0\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b3\17\3\2\2"+
		"\2\u00b4\u00b2\3\2\2\2\u00b5\u00b6\5,\27\2\u00b6\u00b7\7\66\2\2\u00b7"+
		"\u00b8\7\6\2\2\u00b8\u00b9\5\26\f\2\u00b9\u00ba\7\7\2\2\u00ba\u00bb\5"+
		"\22\n\2\u00bb\21\3\2\2\2\u00bc\u00c0\7\b\2\2\u00bd\u00bf\5\4\3\2\u00be"+
		"\u00bd\3\2\2\2\u00bf\u00c2\3\2\2\2\u00c0\u00be\3\2\2\2\u00c0\u00c1\3\2"+
		"\2\2\u00c1\u00c4\3\2\2\2\u00c2\u00c0\3\2\2\2\u00c3\u00c5\5\24\13\2\u00c4"+
		"\u00c3\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c6\u00c7\7\t"+
		"\2\2\u00c7\23\3\2\2\2\u00c8\u00c9\7\16\2\2\u00c9\u00ca\5\36\20\2\u00ca"+
		"\u00cb\7\3\2\2\u00cb\25\3\2\2\2\u00cc\u00d1\5\30\r\2\u00cd\u00ce\7\17"+
		"\2\2\u00ce\u00d0\5\30\r\2\u00cf\u00cd\3\2\2\2\u00d0\u00d3\3\2\2\2\u00d1"+
		"\u00cf\3\2\2\2\u00d1\u00d2\3\2\2\2\u00d2\u00d5\3\2\2\2\u00d3\u00d1\3\2"+
		"\2\2\u00d4\u00cc\3\2\2\2\u00d4\u00d5\3\2\2\2\u00d5\u00d8\3\2\2\2\u00d6"+
		"\u00d8\3\2\2\2\u00d7\u00d4\3\2\2\2\u00d7\u00d6\3\2\2\2\u00d8\27\3\2\2"+
		"\2\u00d9\u00dc\5(\25\2\u00da\u00dc\5*\26\2\u00db\u00d9\3\2\2\2\u00db\u00da"+
		"\3\2\2\2\u00dc\u00dd\3\2\2\2\u00dd\u00de\7\66\2\2\u00de\31\3\2\2\2\u00df"+
		"\u00e0\7\66\2\2\u00e0\u00e1\7\6\2\2\u00e1\u00e2\5\34\17\2\u00e2\u00e3"+
		"\7\7\2\2\u00e3\u00f4\3\2\2\2\u00e4\u00e5\7\63\2\2\u00e5\u00e6\7\6\2\2"+
		"\u00e6\u00e7\5\34\17\2\u00e7\u00e8\7\7\2\2\u00e8\u00f4\3\2\2\2\u00e9\u00ea"+
		"\7\64\2\2\u00ea\u00eb\7\6\2\2\u00eb\u00ec\5\34\17\2\u00ec\u00ed\7\7\2"+
		"\2\u00ed\u00f4\3\2\2\2\u00ee\u00ef\7\65\2\2\u00ef\u00f0\7\6\2\2\u00f0"+
		"\u00f1\5\34\17\2\u00f1\u00f2\7\7\2\2\u00f2\u00f4\3\2\2\2\u00f3\u00df\3"+
		"\2\2\2\u00f3\u00e4\3\2\2\2\u00f3\u00e9\3\2\2\2\u00f3\u00ee\3\2\2\2\u00f4"+
		"\33\3\2\2\2\u00f5\u00f8\5\36\20\2\u00f6\u00f8\7\61\2\2\u00f7\u00f5\3\2"+
		"\2\2\u00f7\u00f6\3\2\2\2\u00f8\u0100\3\2\2\2\u00f9\u00fc\7\17\2\2\u00fa"+
		"\u00fd\5\36\20\2\u00fb\u00fd\7\61\2\2\u00fc\u00fa\3\2\2\2\u00fc\u00fb"+
		"\3\2\2\2\u00fd\u00ff\3\2\2\2\u00fe\u00f9\3\2\2\2\u00ff\u0102\3\2\2\2\u0100"+
		"\u00fe\3\2\2\2\u0100\u0101\3\2\2\2\u0101\u0105\3\2\2\2\u0102\u0100\3\2"+
		"\2\2\u0103\u0105\3\2\2\2\u0104\u00f7\3\2\2\2\u0104\u0103\3\2\2\2\u0105"+
		"\35\3\2\2\2\u0106\u0107\b\20\1\2\u0107\u0108\7\6\2\2\u0108\u0109\5\36"+
		"\20\2\u0109\u010a\7\7\2\2\u010a\u010f\3\2\2\2\u010b\u010f\5.\30\2\u010c"+
		"\u010d\7\66\2\2\u010d\u010f\5:\36\2\u010e\u0106\3\2\2\2\u010e\u010b\3"+
		"\2\2\2\u010e\u010c\3\2\2\2\u010f\u011b\3\2\2\2\u0110\u0111\f\b\2\2\u0111"+
		"\u0112\7\20\2\2\u0112\u011a\5\36\20\t\u0113\u0114\f\7\2\2\u0114\u0115"+
		"\t\3\2\2\u0115\u011a\5\36\20\b\u0116\u0117\f\6\2\2\u0117\u0118\t\4\2\2"+
		"\u0118\u011a\5\36\20\7\u0119\u0110\3\2\2\2\u0119\u0113\3\2\2\2\u0119\u0116"+
		"\3\2\2\2\u011a\u011d\3\2\2\2\u011b\u0119\3\2\2\2\u011b\u011c\3\2\2\2\u011c"+
		"\37\3\2\2\2\u011d\u011b\3\2\2\2\u011e\u0121\5\"\22\2\u011f\u0121\5$\23"+
		"\2\u0120\u011e\3\2\2\2\u0120\u011f\3\2\2\2\u0121!\3\2\2\2\u0122\u0123"+
		"\7\66\2\2\u0123\u0126\5<\37\2\u0124\u0127\5\36\20\2\u0125\u0127\7/\2\2"+
		"\u0126\u0124\3\2\2\2\u0126\u0125\3\2\2\2\u0127\u012b\3\2\2\2\u0128\u0129"+
		"\7\66\2\2\u0129\u012b\5:\36\2\u012a\u0122\3\2\2\2\u012a\u0128\3\2\2\2"+
		"\u012b#\3\2\2\2\u012c\u012d\7\66\2\2\u012d\u012e\7\26\2\2\u012e\u0134"+
		"\5\36\20\2\u012f\u0130\5\60\31\2\u0130\u0131\5<\37\2\u0131\u0132\5\36"+
		"\20\2\u0132\u0134\3\2\2\2\u0133\u012c\3\2\2\2\u0133\u012f\3\2\2\2\u0134"+
		"%\3\2\2\2\u0135\u0136\5(\25\2\u0136\u0137\7\66\2\2\u0137\u0138\7\26\2"+
		"\2\u0138\u0139\5\36\20\2\u0139\u0146\3\2\2\2\u013a\u013b\5*\26\2\u013b"+
		"\u013c\7\66\2\2\u013c\u013d\7\26\2\2\u013d\u013e\5\36\20\2\u013e\u0146"+
		"\3\2\2\2\u013f\u0140\5*\26\2\u0140\u0141\7\27\2\2\u0141\u0142\5\66\34"+
		"\2\u0142\u0143\7\30\2\2\u0143\u0144\7\66\2\2\u0144\u0146\3\2\2\2\u0145"+
		"\u0135\3\2\2\2\u0145\u013a\3\2\2\2\u0145\u013f\3\2\2\2\u0146\'\3\2\2\2"+
		"\u0147\u014b\7*\2\2\u0148\u014b\7,\2\2\u0149\u014b\7.\2\2\u014a\u0147"+
		"\3\2\2\2\u014a\u0148\3\2\2\2\u014a\u0149\3\2\2\2\u014b)\3\2\2\2\u014c"+
		"\u014d\58\35\2\u014d\u014e\7\4\2\2\u014e\u014f\5(\25\2\u014f\u0150\7\5"+
		"\2\2\u0150+\3\2\2\2\u0151\u0155\5(\25\2\u0152\u0155\5*\26\2\u0153\u0155"+
		"\7\60\2\2\u0154\u0151\3\2\2\2\u0154\u0152\3\2\2\2\u0154\u0153\3\2\2\2"+
		"\u0155-\3\2\2\2\u0156\u0167\7\66\2\2\u0157\u0167\5@!\2\u0158\u0159\7\27"+
		"\2\2\u0159\u015e\5\62\32\2\u015a\u015b\7\3\2\2\u015b\u015d\5\62\32\2\u015c"+
		"\u015a\3\2\2\2\u015d\u0160\3\2\2\2\u015e\u015c\3\2\2\2\u015e\u015f\3\2"+
		"\2\2\u015f\u0161\3\2\2\2\u0160\u015e\3\2\2\2\u0161\u0162\7\30\2\2\u0162"+
		"\u0167\3\2\2\2\u0163\u0167\5\32\16\2\u0164\u0167\5\60\31\2\u0165\u0167"+
		"\7/\2\2\u0166\u0156\3\2\2\2\u0166\u0157\3\2\2\2\u0166\u0158\3\2\2\2\u0166"+
		"\u0163\3\2\2\2\u0166\u0164\3\2\2\2\u0166\u0165\3\2\2\2\u0167/\3\2\2\2"+
		"\u0168\u0169\7\66\2\2\u0169\u016a\7\27\2\2\u016a\u016b\5\66\34\2\u016b"+
		"\u016c\7\30\2\2\u016c\61\3\2\2\2\u016d\u0172\5.\30\2\u016e\u016f\7\17"+
		"\2\2\u016f\u0171\5.\30\2\u0170\u016e\3\2\2\2\u0171\u0174\3\2\2\2\u0172"+
		"\u0170\3\2\2\2\u0172\u0173\3\2\2\2\u0173\63\3\2\2\2\u0174\u0172\3\2\2"+
		"\2\u0175\u017a\5@!\2\u0176\u0177\7\17\2\2\u0177\u0179\5@!\2\u0178\u0176"+
		"\3\2\2\2\u0179\u017c\3\2\2\2\u017a\u0178\3\2\2\2\u017a\u017b\3\2\2\2\u017b"+
		"\65\3\2\2\2\u017c\u017a\3\2\2\2\u017d\u0180\5.\30\2\u017e\u017f\7\17\2"+
		"\2\u017f\u0181\5.\30\2\u0180\u017e\3\2\2\2\u0180\u0181\3\2\2\2\u0181\67"+
		"\3\2\2\2\u0182\u0185\7(\2\2\u0183\u0185\7)\2\2\u0184\u0182\3\2\2\2\u0184"+
		"\u0183\3\2\2\2\u01859\3\2\2\2\u0186\u0187\t\5\2\2\u0187;\3\2\2\2\u0188"+
		"\u0189\t\6\2\2\u0189=\3\2\2\2\u018a\u018b\t\7\2\2\u018b?\3\2\2\2\u018c"+
		"\u018d\t\b\2\2\u018dA\3\2\2\2)EKQav{\u0087\u0090\u0096\u00a5\u00b0\u00b2"+
		"\u00c0\u00c4\u00d1\u00d4\u00d7\u00db\u00f3\u00f7\u00fc\u0100\u0104\u010e"+
		"\u0119\u011b\u0120\u0126\u012a\u0133\u0145\u014a\u0154\u015e\u0166\u0172"+
		"\u017a\u0180\u0184";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}