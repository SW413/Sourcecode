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
		IMPORT=32, IF=33, ELSE=34, WHILE=35, FOR=36, MATRIX=37, VECTOR=38, INT=39, 
		INTNUM=40, FLOAT=41, FLOATNUM=42, BOOL=43, BOOLVAL=44, VOID=45, STRING=46, 
		SIGN=47, PRINT=48, COMPLEXTOFILE=49, FILETOCOMPLEX=50, ID=51, LIBRARY=52, 
		WS=53, NL=54, COMMENT=55, LINE_COMMENT=56;
	public static final int
		RULE_topLevel = 0, RULE_statement = 1, RULE_importing = 2, RULE_controlblock = 3, 
		RULE_loop = 4, RULE_update = 5, RULE_block = 6, RULE_conditionalExpression = 7, 
		RULE_functiondeclaration = 8, RULE_functionbody = 9, RULE_functionreturn = 10, 
		RULE_parameterlist = 11, RULE_parameter = 12, RULE_functioncall = 13, 
		RULE_argumentlist = 14, RULE_expression = 15, RULE_assignment = 16, RULE_valassignment = 17, 
		RULE_collectionassignment = 18, RULE_declaration = 19, RULE_valueType = 20, 
		RULE_complexdatatype = 21, RULE_functiondatatype = 22, RULE_value = 23, 
		RULE_collectionEntrance = 24, RULE_valueList = 25, RULE_constantList = 26, 
		RULE_entranceCoordinate = 27, RULE_collectiontype = 28, RULE_postUnaryOperator = 29, 
		RULE_assignmentOperator = 30, RULE_conditionalOperator = 31, RULE_constant = 32;
	public static final String[] ruleNames = {
		"topLevel", "statement", "importing", "controlblock", "loop", "update", 
		"block", "conditionalExpression", "functiondeclaration", "functionbody", 
		"functionreturn", "parameterlist", "parameter", "functioncall", "argumentlist", 
		"expression", "assignment", "valassignment", "collectionassignment", "declaration", 
		"valueType", "complexdatatype", "functiondatatype", "value", "collectionEntrance", 
		"valueList", "constantList", "entranceCoordinate", "collectiontype", "postUnaryOperator", 
		"assignmentOperator", "conditionalOperator", "constant"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "';'", "'<'", "'>'", "'('", "')'", "'{'", "'}'", "'&&'", "'||'", 
		"'=='", "'!='", "'return'", "','", "'^'", "'*'", "'/'", "'%'", "'#'", 
		"'+'", "'='", "'['", "']'", "'++'", "'--'", "'^T'", "'+='", "'-='", "'*='", 
		"'/='", "'<='", "'>='", null, "'if'", "'else'", "'while'", "'for'", "'matrix'", 
		"'vector'", null, null, null, null, "'bool'", null, "'void'", null, "'-'", 
		"'print'", "'matrixToFile'", "'fileToMatrix'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, "IMPORT", "IF", "ELSE", 
		"WHILE", "FOR", "MATRIX", "VECTOR", "INT", "INTNUM", "FLOAT", "FLOATNUM", 
		"BOOL", "BOOLVAL", "VOID", "STRING", "SIGN", "PRINT", "COMPLEXTOFILE", 
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
			setState(69);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IMPORT) {
				{
				{
				setState(66);
				importing();
				}
				}
				setState(71);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(75);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(72);
					functiondeclaration();
					}
					} 
				}
				setState(77);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			setState(81);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << WHILE) | (1L << FOR) | (1L << MATRIX) | (1L << VECTOR) | (1L << INT) | (1L << FLOAT) | (1L << BOOL) | (1L << PRINT) | (1L << COMPLEXTOFILE) | (1L << FILETOCOMPLEX) | (1L << ID))) != 0)) {
				{
				{
				setState(78);
				statement();
				}
				}
				setState(83);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(84);
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
			setState(97);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(86);
				assignment();
				setState(87);
				match(T__0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(89);
				declaration();
				setState(90);
				match(T__0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(92);
				functioncall();
				setState(93);
				match(T__0);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(95);
				controlblock();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(96);
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
			setState(99);
			match(IMPORT);
			setState(100);
			match(T__1);
			setState(101);
			match(LIBRARY);
			setState(102);
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
			setState(104);
			match(IF);
			setState(105);
			match(T__3);
			setState(106);
			conditionalExpression(0);
			setState(107);
			match(T__4);
			setState(108);
			((ControlblockContext)_localctx).ifBlock = block();
			setState(118);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(109);
					match(ELSE);
					setState(110);
					match(IF);
					setState(111);
					match(T__3);
					setState(112);
					conditionalExpression(0);
					setState(113);
					match(T__4);
					setState(114);
					((ControlblockContext)_localctx).elseIfBlock = block();
					}
					} 
				}
				setState(120);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			}
			setState(123);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(121);
				match(ELSE);
				setState(122);
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
		public UpdateContext update() {
			return getRuleContext(UpdateContext.class,0);
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
			setState(144);
			switch (_input.LA(1)) {
			case WHILE:
				_localctx = new WhileLoopContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(125);
				match(WHILE);
				setState(126);
				match(T__3);
				setState(127);
				conditionalExpression(0);
				setState(128);
				match(T__4);
				setState(129);
				((WhileLoopContext)_localctx).whileBlock = block();
				}
				break;
			case FOR:
				_localctx = new ForLoopContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(131);
				match(FOR);
				setState(132);
				match(T__3);
				setState(135);
				switch (_input.LA(1)) {
				case MATRIX:
				case VECTOR:
				case INT:
				case FLOAT:
				case BOOL:
					{
					setState(133);
					declaration();
					}
					break;
				case ID:
					{
					setState(134);
					assignment();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(137);
				match(T__0);
				setState(138);
				conditionalExpression(0);
				setState(139);
				match(T__0);
				setState(140);
				update();
				setState(141);
				match(T__4);
				setState(142);
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

	public static class UpdateContext extends ParserRuleContext {
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public TerminalNode ID() { return getToken(ourLangParser.ID, 0); }
		public PostUnaryOperatorContext postUnaryOperator() {
			return getRuleContext(PostUnaryOperatorContext.class,0);
		}
		public UpdateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_update; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ourLangVisitor ) return ((ourLangVisitor<? extends T>)visitor).visitUpdate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UpdateContext update() throws RecognitionException {
		UpdateContext _localctx = new UpdateContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_update);
		try {
			setState(149);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(146);
				assignment();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(147);
				match(ID);
				setState(148);
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
		enterRule(_localctx, 12, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(151);
			match(T__5);
			setState(155);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << WHILE) | (1L << FOR) | (1L << MATRIX) | (1L << VECTOR) | (1L << INT) | (1L << FLOAT) | (1L << BOOL) | (1L << PRINT) | (1L << COMPLEXTOFILE) | (1L << FILETOCOMPLEX) | (1L << ID))) != 0)) {
				{
				{
				setState(152);
				statement();
				}
				}
				setState(157);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(158);
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
		int _startState = 14;
		enterRecursionRule(_localctx, 14, RULE_conditionalExpression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(170);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				_localctx = new SingleCondExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(161);
				expression(0);
				setState(162);
				conditionalOperator();
				setState(163);
				expression(0);
				}
				break;
			case 2:
				{
				_localctx = new ParenConExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(165);
				match(T__3);
				setState(166);
				conditionalExpression(0);
				setState(167);
				match(T__4);
				}
				break;
			case 3:
				{
				_localctx = new BoolValConExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(169);
				match(BOOLVAL);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(183);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(181);
					switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
					case 1:
						{
						_localctx = new MultiAndCondExprContext(new ConditionalExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_conditionalExpression);
						setState(172);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(173);
						match(T__7);
						setState(174);
						conditionalExpression(7);
						}
						break;
					case 2:
						{
						_localctx = new MultiOrCondExprContext(new ConditionalExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_conditionalExpression);
						setState(175);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(176);
						match(T__8);
						setState(177);
						conditionalExpression(6);
						}
						break;
					case 3:
						{
						_localctx = new MultiConExprContext(new ConditionalExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_conditionalExpression);
						setState(178);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(179);
						_la = _input.LA(1);
						if ( !(_la==T__9 || _la==T__10) ) {
						_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(180);
						conditionalExpression(4);
						}
						break;
					}
					} 
				}
				setState(185);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
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
		enterRule(_localctx, 16, RULE_functiondeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(186);
			functiondatatype();
			setState(187);
			match(ID);
			setState(188);
			match(T__3);
			setState(189);
			parameterlist();
			setState(190);
			match(T__4);
			setState(191);
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
		enterRule(_localctx, 18, RULE_functionbody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(193);
			match(T__5);
			setState(197);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << WHILE) | (1L << FOR) | (1L << MATRIX) | (1L << VECTOR) | (1L << INT) | (1L << FLOAT) | (1L << BOOL) | (1L << PRINT) | (1L << COMPLEXTOFILE) | (1L << FILETOCOMPLEX) | (1L << ID))) != 0)) {
				{
				{
				setState(194);
				statement();
				}
				}
				setState(199);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(201);
			_la = _input.LA(1);
			if (_la==T__11) {
				{
				setState(200);
				functionreturn();
				}
			}

			setState(203);
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
		enterRule(_localctx, 20, RULE_functionreturn);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(205);
			match(T__11);
			setState(206);
			expression(0);
			setState(207);
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
		enterRule(_localctx, 22, RULE_parameterlist);
		int _la;
		try {
			setState(220);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(217);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MATRIX) | (1L << VECTOR) | (1L << INT) | (1L << FLOAT) | (1L << BOOL))) != 0)) {
					{
					setState(209);
					parameter();
					setState(214);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__12) {
						{
						{
						setState(210);
						match(T__12);
						setState(211);
						parameter();
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
		enterRule(_localctx, 24, RULE_parameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(224);
			switch (_input.LA(1)) {
			case INT:
			case FLOAT:
			case BOOL:
				{
				setState(222);
				valueType();
				}
				break;
			case MATRIX:
			case VECTOR:
				{
				setState(223);
				complexdatatype();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(226);
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
		enterRule(_localctx, 26, RULE_functioncall);
		try {
			setState(248);
			switch (_input.LA(1)) {
			case ID:
				_localctx = new CustomFuncContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(228);
				match(ID);
				setState(229);
				match(T__3);
				setState(230);
				argumentlist();
				setState(231);
				match(T__4);
				}
				break;
			case PRINT:
				_localctx = new PrintFuncContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(233);
				match(PRINT);
				setState(234);
				match(T__3);
				setState(235);
				argumentlist();
				setState(236);
				match(T__4);
				}
				break;
			case COMPLEXTOFILE:
				_localctx = new ComplexToFileFuncContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(238);
				match(COMPLEXTOFILE);
				setState(239);
				match(T__3);
				setState(240);
				argumentlist();
				setState(241);
				match(T__4);
				}
				break;
			case FILETOCOMPLEX:
				_localctx = new FileToComplexFuncContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(243);
				match(FILETOCOMPLEX);
				setState(244);
				match(T__3);
				setState(245);
				argumentlist();
				setState(246);
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
		enterRule(_localctx, 28, RULE_argumentlist);
		int _la;
		try {
			setState(265);
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
				setState(252);
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
					setState(250);
					expression(0);
					}
					break;
				case STRING:
					{
					setState(251);
					match(STRING);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(261);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__12) {
					{
					{
					setState(254);
					match(T__12);
					setState(257);
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
						setState(255);
						expression(0);
						}
						break;
					case STRING:
						{
						setState(256);
						match(STRING);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					}
					setState(263);
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
		int _startState = 30;
		enterRecursionRule(_localctx, 30, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(275);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				{
				_localctx = new ParenExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(268);
				match(T__3);
				setState(269);
				expression(0);
				setState(270);
				match(T__4);
				}
				break;
			case 2:
				{
				_localctx = new ValueExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(272);
				value();
				}
				break;
			case 3:
				{
				_localctx = new PostIDExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(273);
				match(ID);
				setState(274);
				postUnaryOperator();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(288);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(286);
					switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
					case 1:
						{
						_localctx = new PowerExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(277);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(278);
						match(T__13);
						setState(279);
						expression(7);
						}
						break;
					case 2:
						{
						_localctx = new MulExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(280);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(281);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17))) != 0)) ) {
						_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(282);
						expression(6);
						}
						break;
					case 3:
						{
						_localctx = new AddExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(283);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(284);
						_la = _input.LA(1);
						if ( !(_la==T__18 || _la==SIGN) ) {
						_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(285);
						expression(5);
						}
						break;
					}
					} 
				}
				setState(290);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
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
		enterRule(_localctx, 32, RULE_assignment);
		try {
			setState(293);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(291);
				valassignment();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(292);
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
		public ConditionalExpressionContext conditionalExpression() {
			return getRuleContext(ConditionalExpressionContext.class,0);
		}
		public StdAssignmentContext(ValassignmentContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ourLangVisitor ) return ((ourLangVisitor<? extends T>)visitor).visitStdAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValassignmentContext valassignment() throws RecognitionException {
		ValassignmentContext _localctx = new ValassignmentContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_valassignment);
		try {
			setState(304);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				_localctx = new StdAssignmentContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(295);
				match(ID);
				setState(296);
				assignmentOperator();
				setState(300);
				switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
				case 1:
					{
					setState(297);
					expression(0);
					}
					break;
				case 2:
					{
					setState(298);
					match(BOOLVAL);
					}
					break;
				case 3:
					{
					setState(299);
					conditionalExpression(0);
					}
					break;
				}
				}
				break;
			case 2:
				_localctx = new PostUnaryAssignmentContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(302);
				match(ID);
				setState(303);
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
		enterRule(_localctx, 36, RULE_collectionassignment);
		try {
			setState(313);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				_localctx = new EntireCollectionAssignmentContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(306);
				match(ID);
				setState(307);
				match(T__19);
				setState(308);
				expression(0);
				}
				break;
			case 2:
				_localctx = new CollectionEntranceAssignmentContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(309);
				collectionEntrance();
				setState(310);
				assignmentOperator();
				setState(311);
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
		public ConditionalExpressionContext conditionalExpression() {
			return getRuleContext(ConditionalExpressionContext.class,0);
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
		enterRule(_localctx, 38, RULE_declaration);
		try {
			setState(333);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				_localctx = new PrimitiveDeclContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(315);
				valueType();
				setState(316);
				match(ID);
				setState(317);
				match(T__19);
				setState(320);
				switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
				case 1:
					{
					setState(318);
					expression(0);
					}
					break;
				case 2:
					{
					setState(319);
					conditionalExpression(0);
					}
					break;
				}
				}
				break;
			case 2:
				_localctx = new ComplexDeclContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(322);
				complexdatatype();
				setState(323);
				match(ID);
				setState(324);
				match(T__19);
				setState(325);
				expression(0);
				}
				break;
			case 3:
				_localctx = new SpecialComplexDeclContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(327);
				complexdatatype();
				setState(328);
				match(T__20);
				setState(329);
				entranceCoordinate();
				setState(330);
				match(T__21);
				setState(331);
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
		enterRule(_localctx, 40, RULE_valueType);
		try {
			setState(338);
			switch (_input.LA(1)) {
			case INT:
				_localctx = new IntegerContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(335);
				match(INT);
				}
				break;
			case FLOAT:
				_localctx = new FloatingpointContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(336);
				match(FLOAT);
				}
				break;
			case BOOL:
				_localctx = new BooleanContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(337);
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
		enterRule(_localctx, 42, RULE_complexdatatype);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(340);
			collectiontype();
			setState(341);
			match(T__1);
			setState(342);
			valueType();
			setState(343);
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
		enterRule(_localctx, 44, RULE_functiondatatype);
		try {
			setState(348);
			switch (_input.LA(1)) {
			case INT:
			case FLOAT:
			case BOOL:
				enterOuterAlt(_localctx, 1);
				{
				setState(345);
				valueType();
				}
				break;
			case MATRIX:
			case VECTOR:
				enterOuterAlt(_localctx, 2);
				{
				setState(346);
				complexdatatype();
				}
				break;
			case VOID:
				enterOuterAlt(_localctx, 3);
				{
				setState(347);
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
		enterRule(_localctx, 46, RULE_value);
		int _la;
		try {
			setState(366);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				_localctx = new ValIDContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(350);
				match(ID);
				}
				break;
			case 2:
				_localctx = new ValConstantContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(351);
				constant();
				}
				break;
			case 3:
				_localctx = new ValListContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(352);
				match(T__20);
				setState(353);
				valueList();
				setState(358);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__0) {
					{
					{
					setState(354);
					match(T__0);
					setState(355);
					valueList();
					}
					}
					setState(360);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(361);
				match(T__21);
				}
				break;
			case 4:
				_localctx = new ValFuncCallContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(363);
				functioncall();
				}
				break;
			case 5:
				_localctx = new ValCollectionEntranceContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(364);
				collectionEntrance();
				}
				break;
			case 6:
				_localctx = new ValBoolContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(365);
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
		enterRule(_localctx, 48, RULE_collectionEntrance);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(368);
			match(ID);
			setState(369);
			match(T__20);
			setState(370);
			entranceCoordinate();
			setState(371);
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
		enterRule(_localctx, 50, RULE_valueList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(373);
			value();
			setState(378);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__12) {
				{
				{
				setState(374);
				match(T__12);
				setState(375);
				value();
				}
				}
				setState(380);
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
		enterRule(_localctx, 52, RULE_constantList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(381);
			constant();
			setState(386);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__12) {
				{
				{
				setState(382);
				match(T__12);
				setState(383);
				constant();
				}
				}
				setState(388);
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
		enterRule(_localctx, 54, RULE_entranceCoordinate);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(389);
			value();
			setState(392);
			_la = _input.LA(1);
			if (_la==T__12) {
				{
				setState(390);
				match(T__12);
				setState(391);
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
		enterRule(_localctx, 56, RULE_collectiontype);
		try {
			setState(396);
			switch (_input.LA(1)) {
			case MATRIX:
				_localctx = new CollectionMatrixContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(394);
				match(MATRIX);
				}
				break;
			case VECTOR:
				_localctx = new CollectionVectorContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(395);
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
		enterRule(_localctx, 58, RULE_postUnaryOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(398);
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
		enterRule(_localctx, 60, RULE_assignmentOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(400);
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
		enterRule(_localctx, 62, RULE_conditionalOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(402);
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
		enterRule(_localctx, 64, RULE_constant);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(404);
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
		case 7:
			return conditionalExpression_sempred((ConditionalExpressionContext)_localctx, predIndex);
		case 15:
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3:\u0199\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\3\2\7\2F\n\2\f\2\16\2I\13\2\3\2\7\2L\n\2\f\2\16\2O\13\2\3"+
		"\2\7\2R\n\2\f\2\16\2U\13\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\5\3d\n\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\7\5w\n\5\f\5\16\5z\13\5\3\5\3\5\5\5~\n\5\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u008a\n\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\5\6\u0093\n\6\3\7\3\7\3\7\5\7\u0098\n\7\3\b\3\b\7\b\u009c\n\b\f\b\16"+
		"\b\u009f\13\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u00ad"+
		"\n\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\7\t\u00b8\n\t\f\t\16\t\u00bb"+
		"\13\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\7\13\u00c6\n\13\f\13\16\13"+
		"\u00c9\13\13\3\13\5\13\u00cc\n\13\3\13\3\13\3\f\3\f\3\f\3\f\3\r\3\r\3"+
		"\r\7\r\u00d7\n\r\f\r\16\r\u00da\13\r\5\r\u00dc\n\r\3\r\5\r\u00df\n\r\3"+
		"\16\3\16\5\16\u00e3\n\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17"+
		"\u00fb\n\17\3\20\3\20\5\20\u00ff\n\20\3\20\3\20\3\20\5\20\u0104\n\20\7"+
		"\20\u0106\n\20\f\20\16\20\u0109\13\20\3\20\5\20\u010c\n\20\3\21\3\21\3"+
		"\21\3\21\3\21\3\21\3\21\3\21\5\21\u0116\n\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\7\21\u0121\n\21\f\21\16\21\u0124\13\21\3\22\3\22"+
		"\5\22\u0128\n\22\3\23\3\23\3\23\3\23\3\23\5\23\u012f\n\23\3\23\3\23\5"+
		"\23\u0133\n\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u013c\n\24\3\25"+
		"\3\25\3\25\3\25\3\25\5\25\u0143\n\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\5\25\u0150\n\25\3\26\3\26\3\26\5\26\u0155\n\26\3"+
		"\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\5\30\u015f\n\30\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\7\31\u0167\n\31\f\31\16\31\u016a\13\31\3\31\3\31\3\31"+
		"\3\31\3\31\5\31\u0171\n\31\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\7\33"+
		"\u017b\n\33\f\33\16\33\u017e\13\33\3\34\3\34\3\34\7\34\u0183\n\34\f\34"+
		"\16\34\u0186\13\34\3\35\3\35\3\35\5\35\u018b\n\35\3\36\3\36\5\36\u018f"+
		"\n\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3\"\2\4\20 #\2\4\6\b\n\f\16\20\22"+
		"\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@B\2\t\3\2\f\r\3\2\21\24\4"+
		"\2\25\25\61\61\3\2\31\33\4\2\26\26\34\37\5\2\4\5\f\r !\4\2**,,\u01b1\2"+
		"G\3\2\2\2\4c\3\2\2\2\6e\3\2\2\2\bj\3\2\2\2\n\u0092\3\2\2\2\f\u0097\3\2"+
		"\2\2\16\u0099\3\2\2\2\20\u00ac\3\2\2\2\22\u00bc\3\2\2\2\24\u00c3\3\2\2"+
		"\2\26\u00cf\3\2\2\2\30\u00de\3\2\2\2\32\u00e2\3\2\2\2\34\u00fa\3\2\2\2"+
		"\36\u010b\3\2\2\2 \u0115\3\2\2\2\"\u0127\3\2\2\2$\u0132\3\2\2\2&\u013b"+
		"\3\2\2\2(\u014f\3\2\2\2*\u0154\3\2\2\2,\u0156\3\2\2\2.\u015e\3\2\2\2\60"+
		"\u0170\3\2\2\2\62\u0172\3\2\2\2\64\u0177\3\2\2\2\66\u017f\3\2\2\28\u0187"+
		"\3\2\2\2:\u018e\3\2\2\2<\u0190\3\2\2\2>\u0192\3\2\2\2@\u0194\3\2\2\2B"+
		"\u0196\3\2\2\2DF\5\6\4\2ED\3\2\2\2FI\3\2\2\2GE\3\2\2\2GH\3\2\2\2HM\3\2"+
		"\2\2IG\3\2\2\2JL\5\22\n\2KJ\3\2\2\2LO\3\2\2\2MK\3\2\2\2MN\3\2\2\2NS\3"+
		"\2\2\2OM\3\2\2\2PR\5\4\3\2QP\3\2\2\2RU\3\2\2\2SQ\3\2\2\2ST\3\2\2\2TV\3"+
		"\2\2\2US\3\2\2\2VW\7\2\2\3W\3\3\2\2\2XY\5\"\22\2YZ\7\3\2\2Zd\3\2\2\2["+
		"\\\5(\25\2\\]\7\3\2\2]d\3\2\2\2^_\5\34\17\2_`\7\3\2\2`d\3\2\2\2ad\5\b"+
		"\5\2bd\5\n\6\2cX\3\2\2\2c[\3\2\2\2c^\3\2\2\2ca\3\2\2\2cb\3\2\2\2d\5\3"+
		"\2\2\2ef\7\"\2\2fg\7\4\2\2gh\7\66\2\2hi\7\5\2\2i\7\3\2\2\2jk\7#\2\2kl"+
		"\7\6\2\2lm\5\20\t\2mn\7\7\2\2nx\5\16\b\2op\7$\2\2pq\7#\2\2qr\7\6\2\2r"+
		"s\5\20\t\2st\7\7\2\2tu\5\16\b\2uw\3\2\2\2vo\3\2\2\2wz\3\2\2\2xv\3\2\2"+
		"\2xy\3\2\2\2y}\3\2\2\2zx\3\2\2\2{|\7$\2\2|~\5\16\b\2}{\3\2\2\2}~\3\2\2"+
		"\2~\t\3\2\2\2\177\u0080\7%\2\2\u0080\u0081\7\6\2\2\u0081\u0082\5\20\t"+
		"\2\u0082\u0083\7\7\2\2\u0083\u0084\5\16\b\2\u0084\u0093\3\2\2\2\u0085"+
		"\u0086\7&\2\2\u0086\u0089\7\6\2\2\u0087\u008a\5(\25\2\u0088\u008a\5\""+
		"\22\2\u0089\u0087\3\2\2\2\u0089\u0088\3\2\2\2\u008a\u008b\3\2\2\2\u008b"+
		"\u008c\7\3\2\2\u008c\u008d\5\20\t\2\u008d\u008e\7\3\2\2\u008e\u008f\5"+
		"\f\7\2\u008f\u0090\7\7\2\2\u0090\u0091\5\16\b\2\u0091\u0093\3\2\2\2\u0092"+
		"\177\3\2\2\2\u0092\u0085\3\2\2\2\u0093\13\3\2\2\2\u0094\u0098\5\"\22\2"+
		"\u0095\u0096\7\65\2\2\u0096\u0098\5<\37\2\u0097\u0094\3\2\2\2\u0097\u0095"+
		"\3\2\2\2\u0098\r\3\2\2\2\u0099\u009d\7\b\2\2\u009a\u009c\5\4\3\2\u009b"+
		"\u009a\3\2\2\2\u009c\u009f\3\2\2\2\u009d\u009b\3\2\2\2\u009d\u009e\3\2"+
		"\2\2\u009e\u00a0\3\2\2\2\u009f\u009d\3\2\2\2\u00a0\u00a1\7\t\2\2\u00a1"+
		"\17\3\2\2\2\u00a2\u00a3\b\t\1\2\u00a3\u00a4\5 \21\2\u00a4\u00a5\5@!\2"+
		"\u00a5\u00a6\5 \21\2\u00a6\u00ad\3\2\2\2\u00a7\u00a8\7\6\2\2\u00a8\u00a9"+
		"\5\20\t\2\u00a9\u00aa\7\7\2\2\u00aa\u00ad\3\2\2\2\u00ab\u00ad\7.\2\2\u00ac"+
		"\u00a2\3\2\2\2\u00ac\u00a7\3\2\2\2\u00ac\u00ab\3\2\2\2\u00ad\u00b9\3\2"+
		"\2\2\u00ae\u00af\f\b\2\2\u00af\u00b0\7\n\2\2\u00b0\u00b8\5\20\t\t\u00b1"+
		"\u00b2\f\7\2\2\u00b2\u00b3\7\13\2\2\u00b3\u00b8\5\20\t\b\u00b4\u00b5\f"+
		"\5\2\2\u00b5\u00b6\t\2\2\2\u00b6\u00b8\5\20\t\6\u00b7\u00ae\3\2\2\2\u00b7"+
		"\u00b1\3\2\2\2\u00b7\u00b4\3\2\2\2\u00b8\u00bb\3\2\2\2\u00b9\u00b7\3\2"+
		"\2\2\u00b9\u00ba\3\2\2\2\u00ba\21\3\2\2\2\u00bb\u00b9\3\2\2\2\u00bc\u00bd"+
		"\5.\30\2\u00bd\u00be\7\65\2\2\u00be\u00bf\7\6\2\2\u00bf\u00c0\5\30\r\2"+
		"\u00c0\u00c1\7\7\2\2\u00c1\u00c2\5\24\13\2\u00c2\23\3\2\2\2\u00c3\u00c7"+
		"\7\b\2\2\u00c4\u00c6\5\4\3\2\u00c5\u00c4\3\2\2\2\u00c6\u00c9\3\2\2\2\u00c7"+
		"\u00c5\3\2\2\2\u00c7\u00c8\3\2\2\2\u00c8\u00cb\3\2\2\2\u00c9\u00c7\3\2"+
		"\2\2\u00ca\u00cc\5\26\f\2\u00cb\u00ca\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cc"+
		"\u00cd\3\2\2\2\u00cd\u00ce\7\t\2\2\u00ce\25\3\2\2\2\u00cf\u00d0\7\16\2"+
		"\2\u00d0\u00d1\5 \21\2\u00d1\u00d2\7\3\2\2\u00d2\27\3\2\2\2\u00d3\u00d8"+
		"\5\32\16\2\u00d4\u00d5\7\17\2\2\u00d5\u00d7\5\32\16\2\u00d6\u00d4\3\2"+
		"\2\2\u00d7\u00da\3\2\2\2\u00d8\u00d6\3\2\2\2\u00d8\u00d9\3\2\2\2\u00d9"+
		"\u00dc\3\2\2\2\u00da\u00d8\3\2\2\2\u00db\u00d3\3\2\2\2\u00db\u00dc\3\2"+
		"\2\2\u00dc\u00df\3\2\2\2\u00dd\u00df\3\2\2\2\u00de\u00db\3\2\2\2\u00de"+
		"\u00dd\3\2\2\2\u00df\31\3\2\2\2\u00e0\u00e3\5*\26\2\u00e1\u00e3\5,\27"+
		"\2\u00e2\u00e0\3\2\2\2\u00e2\u00e1\3\2\2\2\u00e3\u00e4\3\2\2\2\u00e4\u00e5"+
		"\7\65\2\2\u00e5\33\3\2\2\2\u00e6\u00e7\7\65\2\2\u00e7\u00e8\7\6\2\2\u00e8"+
		"\u00e9\5\36\20\2\u00e9\u00ea\7\7\2\2\u00ea\u00fb\3\2\2\2\u00eb\u00ec\7"+
		"\62\2\2\u00ec\u00ed\7\6\2\2\u00ed\u00ee\5\36\20\2\u00ee\u00ef\7\7\2\2"+
		"\u00ef\u00fb\3\2\2\2\u00f0\u00f1\7\63\2\2\u00f1\u00f2\7\6\2\2\u00f2\u00f3"+
		"\5\36\20\2\u00f3\u00f4\7\7\2\2\u00f4\u00fb\3\2\2\2\u00f5\u00f6\7\64\2"+
		"\2\u00f6\u00f7\7\6\2\2\u00f7\u00f8\5\36\20\2\u00f8\u00f9\7\7\2\2\u00f9"+
		"\u00fb\3\2\2\2\u00fa\u00e6\3\2\2\2\u00fa\u00eb\3\2\2\2\u00fa\u00f0\3\2"+
		"\2\2\u00fa\u00f5\3\2\2\2\u00fb\35\3\2\2\2\u00fc\u00ff\5 \21\2\u00fd\u00ff"+
		"\7\60\2\2\u00fe\u00fc\3\2\2\2\u00fe\u00fd\3\2\2\2\u00ff\u0107\3\2\2\2"+
		"\u0100\u0103\7\17\2\2\u0101\u0104\5 \21\2\u0102\u0104\7\60\2\2\u0103\u0101"+
		"\3\2\2\2\u0103\u0102\3\2\2\2\u0104\u0106\3\2\2\2\u0105\u0100\3\2\2\2\u0106"+
		"\u0109\3\2\2\2\u0107\u0105\3\2\2\2\u0107\u0108\3\2\2\2\u0108\u010c\3\2"+
		"\2\2\u0109\u0107\3\2\2\2\u010a\u010c\3\2\2\2\u010b\u00fe\3\2\2\2\u010b"+
		"\u010a\3\2\2\2\u010c\37\3\2\2\2\u010d\u010e\b\21\1\2\u010e\u010f\7\6\2"+
		"\2\u010f\u0110\5 \21\2\u0110\u0111\7\7\2\2\u0111\u0116\3\2\2\2\u0112\u0116"+
		"\5\60\31\2\u0113\u0114\7\65\2\2\u0114\u0116\5<\37\2\u0115\u010d\3\2\2"+
		"\2\u0115\u0112\3\2\2\2\u0115\u0113\3\2\2\2\u0116\u0122\3\2\2\2\u0117\u0118"+
		"\f\b\2\2\u0118\u0119\7\20\2\2\u0119\u0121\5 \21\t\u011a\u011b\f\7\2\2"+
		"\u011b\u011c\t\3\2\2\u011c\u0121\5 \21\b\u011d\u011e\f\6\2\2\u011e\u011f"+
		"\t\4\2\2\u011f\u0121\5 \21\7\u0120\u0117\3\2\2\2\u0120\u011a\3\2\2\2\u0120"+
		"\u011d\3\2\2\2\u0121\u0124\3\2\2\2\u0122\u0120\3\2\2\2\u0122\u0123\3\2"+
		"\2\2\u0123!\3\2\2\2\u0124\u0122\3\2\2\2\u0125\u0128\5$\23\2\u0126\u0128"+
		"\5&\24\2\u0127\u0125\3\2\2\2\u0127\u0126\3\2\2\2\u0128#\3\2\2\2\u0129"+
		"\u012a\7\65\2\2\u012a\u012e\5> \2\u012b\u012f\5 \21\2\u012c\u012f\7.\2"+
		"\2\u012d\u012f\5\20\t\2\u012e\u012b\3\2\2\2\u012e\u012c\3\2\2\2\u012e"+
		"\u012d\3\2\2\2\u012f\u0133\3\2\2\2\u0130\u0131\7\65\2\2\u0131\u0133\5"+
		"<\37\2\u0132\u0129\3\2\2\2\u0132\u0130\3\2\2\2\u0133%\3\2\2\2\u0134\u0135"+
		"\7\65\2\2\u0135\u0136\7\26\2\2\u0136\u013c\5 \21\2\u0137\u0138\5\62\32"+
		"\2\u0138\u0139\5> \2\u0139\u013a\5 \21\2\u013a\u013c\3\2\2\2\u013b\u0134"+
		"\3\2\2\2\u013b\u0137\3\2\2\2\u013c\'\3\2\2\2\u013d\u013e\5*\26\2\u013e"+
		"\u013f\7\65\2\2\u013f\u0142\7\26\2\2\u0140\u0143\5 \21\2\u0141\u0143\5"+
		"\20\t\2\u0142\u0140\3\2\2\2\u0142\u0141\3\2\2\2\u0143\u0150\3\2\2\2\u0144"+
		"\u0145\5,\27\2\u0145\u0146\7\65\2\2\u0146\u0147\7\26\2\2\u0147\u0148\5"+
		" \21\2\u0148\u0150\3\2\2\2\u0149\u014a\5,\27\2\u014a\u014b\7\27\2\2\u014b"+
		"\u014c\58\35\2\u014c\u014d\7\30\2\2\u014d\u014e\7\65\2\2\u014e\u0150\3"+
		"\2\2\2\u014f\u013d\3\2\2\2\u014f\u0144\3\2\2\2\u014f\u0149\3\2\2\2\u0150"+
		")\3\2\2\2\u0151\u0155\7)\2\2\u0152\u0155\7+\2\2\u0153\u0155\7-\2\2\u0154"+
		"\u0151\3\2\2\2\u0154\u0152\3\2\2\2\u0154\u0153\3\2\2\2\u0155+\3\2\2\2"+
		"\u0156\u0157\5:\36\2\u0157\u0158\7\4\2\2\u0158\u0159\5*\26\2\u0159\u015a"+
		"\7\5\2\2\u015a-\3\2\2\2\u015b\u015f\5*\26\2\u015c\u015f\5,\27\2\u015d"+
		"\u015f\7/\2\2\u015e\u015b\3\2\2\2\u015e\u015c\3\2\2\2\u015e\u015d\3\2"+
		"\2\2\u015f/\3\2\2\2\u0160\u0171\7\65\2\2\u0161\u0171\5B\"\2\u0162\u0163"+
		"\7\27\2\2\u0163\u0168\5\64\33\2\u0164\u0165\7\3\2\2\u0165\u0167\5\64\33"+
		"\2\u0166\u0164\3\2\2\2\u0167\u016a\3\2\2\2\u0168\u0166\3\2\2\2\u0168\u0169"+
		"\3\2\2\2\u0169\u016b\3\2\2\2\u016a\u0168\3\2\2\2\u016b\u016c\7\30\2\2"+
		"\u016c\u0171\3\2\2\2\u016d\u0171\5\34\17\2\u016e\u0171\5\62\32\2\u016f"+
		"\u0171\7.\2\2\u0170\u0160\3\2\2\2\u0170\u0161\3\2\2\2\u0170\u0162\3\2"+
		"\2\2\u0170\u016d\3\2\2\2\u0170\u016e\3\2\2\2\u0170\u016f\3\2\2\2\u0171"+
		"\61\3\2\2\2\u0172\u0173\7\65\2\2\u0173\u0174\7\27\2\2\u0174\u0175\58\35"+
		"\2\u0175\u0176\7\30\2\2\u0176\63\3\2\2\2\u0177\u017c\5\60\31\2\u0178\u0179"+
		"\7\17\2\2\u0179\u017b\5\60\31\2\u017a\u0178\3\2\2\2\u017b\u017e\3\2\2"+
		"\2\u017c\u017a\3\2\2\2\u017c\u017d\3\2\2\2\u017d\65\3\2\2\2\u017e\u017c"+
		"\3\2\2\2\u017f\u0184\5B\"\2\u0180\u0181\7\17\2\2\u0181\u0183\5B\"\2\u0182"+
		"\u0180\3\2\2\2\u0183\u0186\3\2\2\2\u0184\u0182\3\2\2\2\u0184\u0185\3\2"+
		"\2\2\u0185\67\3\2\2\2\u0186\u0184\3\2\2\2\u0187\u018a\5\60\31\2\u0188"+
		"\u0189\7\17\2\2\u0189\u018b\5\60\31\2\u018a\u0188\3\2\2\2\u018a\u018b"+
		"\3\2\2\2\u018b9\3\2\2\2\u018c\u018f\7\'\2\2\u018d\u018f\7(\2\2\u018e\u018c"+
		"\3\2\2\2\u018e\u018d\3\2\2\2\u018f;\3\2\2\2\u0190\u0191\t\5\2\2\u0191"+
		"=\3\2\2\2\u0192\u0193\t\6\2\2\u0193?\3\2\2\2\u0194\u0195\t\7\2\2\u0195"+
		"A\3\2\2\2\u0196\u0197\t\b\2\2\u0197C\3\2\2\2+GMScx}\u0089\u0092\u0097"+
		"\u009d\u00ac\u00b7\u00b9\u00c7\u00cb\u00d8\u00db\u00de\u00e2\u00fa\u00fe"+
		"\u0103\u0107\u010b\u0115\u0120\u0122\u0127\u012e\u0132\u013b\u0142\u014f"+
		"\u0154\u015e\u0168\u0170\u017c\u0184\u018a\u018e";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}