// Generated from c:\Users\jeeg9\Documents\GitHub\projeto-tcomp\CasualCompiler\src\grammar\Casual.g4 by ANTLR 4.7.1

  package casual.grammar;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CasualParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		TYPE=32, NEWLINE=33, INT=34, BOOL=35, STRING=36, FLOAT=37, VARS=38, COMMENT=39, 
		WHITESPACE=40;
	public static final int
		RULE_prog = 0, RULE_comment = 1, RULE_declaration = 2, RULE_def = 3, RULE_block = 4, 
		RULE_blck = 5, RULE_cond = 6, RULE_condBlock = 7, RULE_elseBlock = 8, 
		RULE_type = 9, RULE_expr = 10, RULE_index = 11, RULE_indexA = 12;
	public static final String[] ruleNames = {
		"prog", "comment", "declaration", "def", "block", "blck", "cond", "condBlock", 
		"elseBlock", "type", "expr", "index", "indexA"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'decl'", "'('", "')'", "':'", "','", "'def'", "'{'", "'}'", "'return'", 
		"';'", "'if'", "'while'", "'='", "'['", "']'", "'&&'", "'||'", "'=='", 
		"'!='", "'>='", "'>'", "'<='", "'<'", "'else'", "'+'", "'-'", "'*'", "'/'", 
		"'%'", "'!true'", "'get_array()['"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, "TYPE", "NEWLINE", "INT", 
		"BOOL", "STRING", "FLOAT", "VARS", "COMMENT", "WHITESPACE"
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
	public String getGrammarFileName() { return "Casual.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public CasualParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgContext extends ParserRuleContext {
		public List<TerminalNode> NEWLINE() { return getTokens(CasualParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(CasualParser.NEWLINE, i);
		}
		public List<TerminalNode> EOF() { return getTokens(CasualParser.EOF); }
		public TerminalNode EOF(int i) {
			return getToken(CasualParser.EOF, i);
		}
		public List<CommentContext> comment() {
			return getRuleContexts(CommentContext.class);
		}
		public CommentContext comment(int i) {
			return getRuleContext(CommentContext.class,i);
		}
		public List<DeclarationContext> declaration() {
			return getRuleContexts(DeclarationContext.class);
		}
		public DeclarationContext declaration(int i) {
			return getRuleContext(DeclarationContext.class,i);
		}
		public List<DefContext> def() {
			return getRuleContexts(DefContext.class);
		}
		public DefContext def(int i) {
			return getRuleContext(DefContext.class,i);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(35);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__5) | (1L << COMMENT))) != 0)) {
				{
				{
				setState(29);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case COMMENT:
					{
					setState(26);
					comment();
					}
					break;
				case T__0:
					{
					setState(27);
					declaration();
					}
					break;
				case T__5:
					{
					setState(28);
					def();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(31);
				_la = _input.LA(1);
				if ( !(_la==EOF || _la==NEWLINE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(37);
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

	public static class CommentContext extends ParserRuleContext {
		public TerminalNode COMMENT() { return getToken(CasualParser.COMMENT, 0); }
		public CommentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comment; }
	}

	public final CommentContext comment() throws RecognitionException {
		CommentContext _localctx = new CommentContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_comment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(38);
			match(COMMENT);
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
		public List<TerminalNode> VARS() { return getTokens(CasualParser.VARS); }
		public TerminalNode VARS(int i) {
			return getToken(CasualParser.VARS, i);
		}
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_declaration);
		int _la;
		try {
			setState(65);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(40);
				match(T__0);
				setState(41);
				match(VARS);
				setState(42);
				match(T__1);
				setState(43);
				match(T__2);
				setState(44);
				match(T__3);
				setState(45);
				type();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(46);
				match(T__0);
				setState(47);
				match(VARS);
				setState(48);
				match(T__1);
				{
				setState(49);
				match(VARS);
				setState(50);
				match(T__3);
				setState(51);
				type();
				setState(58);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__4) {
					{
					{
					setState(52);
					match(T__4);
					setState(53);
					match(VARS);
					setState(54);
					match(T__3);
					setState(55);
					type();
					}
					}
					setState(60);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				setState(61);
				match(T__2);
				setState(62);
				match(T__3);
				setState(63);
				type();
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

	public static class DefContext extends ParserRuleContext {
		public List<TerminalNode> VARS() { return getTokens(CasualParser.VARS); }
		public TerminalNode VARS(int i) {
			return getToken(CasualParser.VARS, i);
		}
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public TerminalNode NEWLINE() { return getToken(CasualParser.NEWLINE, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public DefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_def; }
	}

	public final DefContext def() throws RecognitionException {
		DefContext _localctx = new DefContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_def);
		int _la;
		try {
			setState(99);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(67);
				match(T__5);
				setState(68);
				match(VARS);
				setState(69);
				match(T__1);
				{
				setState(70);
				match(VARS);
				setState(71);
				match(T__3);
				setState(72);
				type();
				setState(79);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__4) {
					{
					{
					setState(73);
					match(T__4);
					setState(74);
					match(VARS);
					setState(75);
					match(T__3);
					setState(76);
					type();
					}
					}
					setState(81);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				setState(82);
				match(T__2);
				setState(83);
				match(T__3);
				setState(84);
				type();
				setState(85);
				match(T__6);
				setState(86);
				match(NEWLINE);
				setState(87);
				block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(89);
				match(T__5);
				setState(90);
				match(VARS);
				setState(91);
				match(T__1);
				setState(92);
				match(T__2);
				setState(93);
				match(T__3);
				setState(94);
				type();
				setState(95);
				match(T__6);
				setState(96);
				match(NEWLINE);
				setState(97);
				block();
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
		public BlckContext blck() {
			return getRuleContext(BlckContext.class,0);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_block);
		try {
			setState(103);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(101);
				match(T__7);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(102);
				blck();
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

	public static class BlckContext extends ParserRuleContext {
		public List<TerminalNode> NEWLINE() { return getTokens(CasualParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(CasualParser.NEWLINE, i);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public BlckContext blck() {
			return getRuleContext(BlckContext.class,0);
		}
		public CondContext cond() {
			return getRuleContext(CondContext.class,0);
		}
		public CondBlockContext condBlock() {
			return getRuleContext(CondBlockContext.class,0);
		}
		public ElseBlockContext elseBlock() {
			return getRuleContext(ElseBlockContext.class,0);
		}
		public TerminalNode VARS() { return getToken(CasualParser.VARS, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public IndexAContext indexA() {
			return getRuleContext(IndexAContext.class,0);
		}
		public BlckContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blck; }
	}

	public final BlckContext blck() throws RecognitionException {
		BlckContext _localctx = new BlckContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_blck);
		try {
			setState(166);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(105);
				match(T__8);
				setState(108);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__1:
				case T__29:
				case T__30:
				case INT:
				case BOOL:
				case STRING:
				case FLOAT:
				case VARS:
					{
					setState(106);
					expr(0);
					}
					break;
				case T__9:
					{
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(110);
				match(T__9);
				setState(111);
				match(NEWLINE);
				setState(112);
				match(T__7);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(113);
				expr(0);
				setState(114);
				match(T__9);
				setState(115);
				match(NEWLINE);
				setState(116);
				blck();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(118);
				match(T__10);
				setState(119);
				cond();
				setState(120);
				match(T__6);
				setState(121);
				match(NEWLINE);
				setState(122);
				condBlock();
				setState(128);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case NEWLINE:
					{
					setState(123);
					match(NEWLINE);
					setState(124);
					blck();
					}
					break;
				case T__23:
					{
					setState(125);
					elseBlock();
					setState(126);
					blck();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(130);
				match(T__11);
				setState(131);
				cond();
				setState(132);
				match(T__6);
				setState(133);
				match(NEWLINE);
				setState(134);
				condBlock();
				setState(135);
				match(NEWLINE);
				setState(136);
				blck();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(138);
				match(VARS);
				setState(139);
				match(T__3);
				setState(140);
				type();
				setState(141);
				match(T__12);
				setState(142);
				expr(0);
				setState(143);
				match(T__9);
				setState(144);
				match(NEWLINE);
				setState(145);
				blck();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(147);
				match(VARS);
				setState(148);
				match(T__3);
				setState(149);
				type();
				setState(150);
				match(T__12);
				setState(151);
				match(T__13);
				setState(152);
				indexA();
				setState(153);
				match(T__14);
				setState(154);
				match(T__9);
				setState(155);
				match(NEWLINE);
				setState(156);
				blck();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(158);
				match(VARS);
				setState(159);
				match(T__12);
				setState(160);
				expr(0);
				setState(161);
				match(T__9);
				setState(162);
				match(NEWLINE);
				setState(163);
				blck();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(165);
				match(T__7);
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

	public static class CondContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public CondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cond; }
	}

	public final CondContext cond() throws RecognitionException {
		CondContext _localctx = new CondContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_cond);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(168);
			expr(0);
			setState(169);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(170);
			expr(0);
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

	public static class CondBlockContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(CasualParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(CasualParser.NEWLINE, i);
		}
		public List<CondBlockContext> condBlock() {
			return getRuleContexts(CondBlockContext.class);
		}
		public CondBlockContext condBlock(int i) {
			return getRuleContext(CondBlockContext.class,i);
		}
		public CondContext cond() {
			return getRuleContext(CondContext.class,0);
		}
		public ElseBlockContext elseBlock() {
			return getRuleContext(ElseBlockContext.class,0);
		}
		public TerminalNode VARS() { return getToken(CasualParser.VARS, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public IndexAContext indexA() {
			return getRuleContext(IndexAContext.class,0);
		}
		public TerminalNode INT() { return getToken(CasualParser.INT, 0); }
		public CondBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condBlock; }
	}

	public final CondBlockContext condBlock() throws RecognitionException {
		CondBlockContext _localctx = new CondBlockContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_condBlock);
		try {
			setState(234);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(172);
				match(T__8);
				setState(173);
				expr(0);
				setState(174);
				match(T__9);
				setState(175);
				match(NEWLINE);
				setState(176);
				match(T__7);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(178);
				expr(0);
				setState(179);
				match(T__9);
				setState(180);
				match(NEWLINE);
				setState(181);
				condBlock();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(183);
				match(T__10);
				setState(184);
				cond();
				setState(185);
				match(T__6);
				setState(186);
				match(NEWLINE);
				setState(187);
				condBlock();
				setState(193);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case NEWLINE:
					{
					setState(188);
					match(NEWLINE);
					setState(189);
					condBlock();
					}
					break;
				case T__23:
					{
					setState(190);
					elseBlock();
					setState(191);
					condBlock();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(195);
				match(T__11);
				setState(196);
				cond();
				setState(197);
				match(T__6);
				setState(198);
				match(NEWLINE);
				setState(199);
				condBlock();
				setState(200);
				match(NEWLINE);
				setState(201);
				condBlock();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(203);
				match(VARS);
				setState(204);
				match(T__3);
				setState(205);
				type();
				setState(206);
				match(T__12);
				setState(207);
				expr(0);
				setState(208);
				match(T__9);
				setState(209);
				match(NEWLINE);
				setState(210);
				condBlock();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(212);
				match(VARS);
				setState(213);
				match(T__3);
				setState(214);
				type();
				setState(215);
				match(T__12);
				setState(216);
				match(T__13);
				setState(219);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
				case 1:
					{
					setState(217);
					indexA();
					}
					break;
				case 2:
					{
					setState(218);
					match(INT);
					}
					break;
				}
				setState(221);
				match(T__14);
				setState(222);
				match(T__9);
				setState(223);
				match(NEWLINE);
				setState(224);
				condBlock();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(226);
				match(VARS);
				setState(227);
				match(T__12);
				setState(228);
				expr(0);
				setState(229);
				match(T__9);
				setState(230);
				match(NEWLINE);
				setState(231);
				condBlock();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(233);
				match(T__7);
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

	public static class ElseBlockContext extends ParserRuleContext {
		public TerminalNode NEWLINE() { return getToken(CasualParser.NEWLINE, 0); }
		public CondBlockContext condBlock() {
			return getRuleContext(CondBlockContext.class,0);
		}
		public ElseBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseBlock; }
	}

	public final ElseBlockContext elseBlock() throws RecognitionException {
		ElseBlockContext _localctx = new ElseBlockContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_elseBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(236);
			match(T__23);
			setState(237);
			match(T__6);
			setState(238);
			match(NEWLINE);
			setState(239);
			condBlock();
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

	public static class TypeContext extends ParserRuleContext {
		public TerminalNode TYPE() { return getToken(CasualParser.TYPE, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_type);
		try {
			setState(246);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TYPE:
				enterOuterAlt(_localctx, 1);
				{
				setState(241);
				match(TYPE);
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 2);
				{
				setState(242);
				match(T__13);
				setState(243);
				type();
				setState(244);
				match(T__14);
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

	public static class ExprContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(CasualParser.INT, 0); }
		public TerminalNode BOOL() { return getToken(CasualParser.BOOL, 0); }
		public TerminalNode STRING() { return getToken(CasualParser.STRING, 0); }
		public TerminalNode FLOAT() { return getToken(CasualParser.FLOAT, 0); }
		public IndexContext index() {
			return getRuleContext(IndexContext.class,0);
		}
		public TerminalNode VARS() { return getToken(CasualParser.VARS, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 20;
		enterRecursionRule(_localctx, 20, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(274);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				{
				setState(249);
				match(INT);
				}
				break;
			case 2:
				{
				setState(250);
				match(BOOL);
				}
				break;
			case 3:
				{
				setState(251);
				match(STRING);
				}
				break;
			case 4:
				{
				setState(252);
				match(FLOAT);
				}
				break;
			case 5:
				{
				setState(253);
				index();
				}
				break;
			case 6:
				{
				setState(254);
				match(VARS);
				}
				break;
			case 7:
				{
				setState(255);
				match(VARS);
				setState(256);
				match(T__1);
				setState(266);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__1:
				case T__29:
				case T__30:
				case INT:
				case BOOL:
				case STRING:
				case FLOAT:
				case VARS:
					{
					setState(257);
					expr(0);
					setState(262);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__4) {
						{
						{
						setState(258);
						match(T__4);
						setState(259);
						expr(0);
						}
						}
						setState(264);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				case T__2:
					{
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(268);
				match(T__2);
				}
				break;
			case 8:
				{
				setState(269);
				match(T__1);
				setState(270);
				expr(0);
				setState(271);
				match(T__2);
				}
				break;
			case 9:
				{
				setState(273);
				match(T__29);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(284);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(282);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(276);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(277);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(278);
						expr(12);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(279);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(280);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(281);
						expr(11);
						}
						break;
					}
					} 
				}
				setState(286);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
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

	public static class IndexContext extends ParserRuleContext {
		public TerminalNode VARS() { return getToken(CasualParser.VARS, 0); }
		public IndexAContext indexA() {
			return getRuleContext(IndexAContext.class,0);
		}
		public TerminalNode INT() { return getToken(CasualParser.INT, 0); }
		public IndexContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_index; }
	}

	public final IndexContext index() throws RecognitionException {
		IndexContext _localctx = new IndexContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_index);
		try {
			setState(300);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VARS:
				enterOuterAlt(_localctx, 1);
				{
				setState(287);
				match(VARS);
				setState(288);
				match(T__13);
				setState(291);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
				case 1:
					{
					setState(289);
					indexA();
					}
					break;
				case 2:
					{
					setState(290);
					match(INT);
					}
					break;
				}
				setState(293);
				match(T__14);
				}
				break;
			case T__30:
				enterOuterAlt(_localctx, 2);
				{
				setState(294);
				match(T__30);
				setState(297);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
				case 1:
					{
					setState(295);
					indexA();
					}
					break;
				case 2:
					{
					setState(296);
					match(INT);
					}
					break;
				}
				setState(299);
				match(T__14);
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

	public static class IndexAContext extends ParserRuleContext {
		public List<TerminalNode> INT() { return getTokens(CasualParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(CasualParser.INT, i);
		}
		public IndexAContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_indexA; }
	}

	public final IndexAContext indexA() throws RecognitionException {
		IndexAContext _localctx = new IndexAContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_indexA);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(302);
			match(INT);
			setState(303);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(304);
			match(INT);
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
		case 10:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 11);
		case 1:
			return precpred(_ctx, 10);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3*\u0135\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\3\2\3\2\3\2\5\2 \n\2\3\2\3\2\7\2$\n\2\f"+
		"\2\16\2\'\13\2\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\7\4;\n\4\f\4\16\4>\13\4\3\4\3\4\3\4\3\4\5\4D\n\4\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5P\n\5\f\5\16\5S\13\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5f\n\5\3"+
		"\6\3\6\5\6j\n\6\3\7\3\7\3\7\5\7o\n\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u0083\n\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u00a9\n\7"+
		"\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u00c4\n\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\5\t\u00de\n\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t"+
		"\u00ed\n\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\5\13\u00f9\n\13"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\7\f\u0107\n\f\f\f\16"+
		"\f\u010a\13\f\3\f\5\f\u010d\n\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u0115\n\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\7\f\u011d\n\f\f\f\16\f\u0120\13\f\3\r\3\r\3\r"+
		"\3\r\5\r\u0126\n\r\3\r\3\r\3\r\3\r\5\r\u012c\n\r\3\r\5\r\u012f\n\r\3\16"+
		"\3\16\3\16\3\16\3\16\2\3\26\17\2\4\6\b\n\f\16\20\22\24\26\30\32\2\5\3"+
		"\3##\3\2\22\31\3\2\33\37\2\u0151\2%\3\2\2\2\4(\3\2\2\2\6C\3\2\2\2\be\3"+
		"\2\2\2\ni\3\2\2\2\f\u00a8\3\2\2\2\16\u00aa\3\2\2\2\20\u00ec\3\2\2\2\22"+
		"\u00ee\3\2\2\2\24\u00f8\3\2\2\2\26\u0114\3\2\2\2\30\u012e\3\2\2\2\32\u0130"+
		"\3\2\2\2\34 \5\4\3\2\35 \5\6\4\2\36 \5\b\5\2\37\34\3\2\2\2\37\35\3\2\2"+
		"\2\37\36\3\2\2\2 !\3\2\2\2!\"\t\2\2\2\"$\3\2\2\2#\37\3\2\2\2$\'\3\2\2"+
		"\2%#\3\2\2\2%&\3\2\2\2&\3\3\2\2\2\'%\3\2\2\2()\7)\2\2)\5\3\2\2\2*+\7\3"+
		"\2\2+,\7(\2\2,-\7\4\2\2-.\7\5\2\2./\7\6\2\2/D\5\24\13\2\60\61\7\3\2\2"+
		"\61\62\7(\2\2\62\63\7\4\2\2\63\64\7(\2\2\64\65\7\6\2\2\65<\5\24\13\2\66"+
		"\67\7\7\2\2\678\7(\2\289\7\6\2\29;\5\24\13\2:\66\3\2\2\2;>\3\2\2\2<:\3"+
		"\2\2\2<=\3\2\2\2=?\3\2\2\2><\3\2\2\2?@\7\5\2\2@A\7\6\2\2AB\5\24\13\2B"+
		"D\3\2\2\2C*\3\2\2\2C\60\3\2\2\2D\7\3\2\2\2EF\7\b\2\2FG\7(\2\2GH\7\4\2"+
		"\2HI\7(\2\2IJ\7\6\2\2JQ\5\24\13\2KL\7\7\2\2LM\7(\2\2MN\7\6\2\2NP\5\24"+
		"\13\2OK\3\2\2\2PS\3\2\2\2QO\3\2\2\2QR\3\2\2\2RT\3\2\2\2SQ\3\2\2\2TU\7"+
		"\5\2\2UV\7\6\2\2VW\5\24\13\2WX\7\t\2\2XY\7#\2\2YZ\5\n\6\2Zf\3\2\2\2[\\"+
		"\7\b\2\2\\]\7(\2\2]^\7\4\2\2^_\7\5\2\2_`\7\6\2\2`a\5\24\13\2ab\7\t\2\2"+
		"bc\7#\2\2cd\5\n\6\2df\3\2\2\2eE\3\2\2\2e[\3\2\2\2f\t\3\2\2\2gj\7\n\2\2"+
		"hj\5\f\7\2ig\3\2\2\2ih\3\2\2\2j\13\3\2\2\2kn\7\13\2\2lo\5\26\f\2mo\3\2"+
		"\2\2nl\3\2\2\2nm\3\2\2\2op\3\2\2\2pq\7\f\2\2qr\7#\2\2r\u00a9\7\n\2\2s"+
		"t\5\26\f\2tu\7\f\2\2uv\7#\2\2vw\5\f\7\2w\u00a9\3\2\2\2xy\7\r\2\2yz\5\16"+
		"\b\2z{\7\t\2\2{|\7#\2\2|\u0082\5\20\t\2}~\7#\2\2~\u0083\5\f\7\2\177\u0080"+
		"\5\22\n\2\u0080\u0081\5\f\7\2\u0081\u0083\3\2\2\2\u0082}\3\2\2\2\u0082"+
		"\177\3\2\2\2\u0083\u00a9\3\2\2\2\u0084\u0085\7\16\2\2\u0085\u0086\5\16"+
		"\b\2\u0086\u0087\7\t\2\2\u0087\u0088\7#\2\2\u0088\u0089\5\20\t\2\u0089"+
		"\u008a\7#\2\2\u008a\u008b\5\f\7\2\u008b\u00a9\3\2\2\2\u008c\u008d\7(\2"+
		"\2\u008d\u008e\7\6\2\2\u008e\u008f\5\24\13\2\u008f\u0090\7\17\2\2\u0090"+
		"\u0091\5\26\f\2\u0091\u0092\7\f\2\2\u0092\u0093\7#\2\2\u0093\u0094\5\f"+
		"\7\2\u0094\u00a9\3\2\2\2\u0095\u0096\7(\2\2\u0096\u0097\7\6\2\2\u0097"+
		"\u0098\5\24\13\2\u0098\u0099\7\17\2\2\u0099\u009a\7\20\2\2\u009a\u009b"+
		"\5\32\16\2\u009b\u009c\7\21\2\2\u009c\u009d\7\f\2\2\u009d\u009e\7#\2\2"+
		"\u009e\u009f\5\f\7\2\u009f\u00a9\3\2\2\2\u00a0\u00a1\7(\2\2\u00a1\u00a2"+
		"\7\17\2\2\u00a2\u00a3\5\26\f\2\u00a3\u00a4\7\f\2\2\u00a4\u00a5\7#\2\2"+
		"\u00a5\u00a6\5\f\7\2\u00a6\u00a9\3\2\2\2\u00a7\u00a9\7\n\2\2\u00a8k\3"+
		"\2\2\2\u00a8s\3\2\2\2\u00a8x\3\2\2\2\u00a8\u0084\3\2\2\2\u00a8\u008c\3"+
		"\2\2\2\u00a8\u0095\3\2\2\2\u00a8\u00a0\3\2\2\2\u00a8\u00a7\3\2\2\2\u00a9"+
		"\r\3\2\2\2\u00aa\u00ab\5\26\f\2\u00ab\u00ac\t\3\2\2\u00ac\u00ad\5\26\f"+
		"\2\u00ad\17\3\2\2\2\u00ae\u00af\7\13\2\2\u00af\u00b0\5\26\f\2\u00b0\u00b1"+
		"\7\f\2\2\u00b1\u00b2\7#\2\2\u00b2\u00b3\7\n\2\2\u00b3\u00ed\3\2\2\2\u00b4"+
		"\u00b5\5\26\f\2\u00b5\u00b6\7\f\2\2\u00b6\u00b7\7#\2\2\u00b7\u00b8\5\20"+
		"\t\2\u00b8\u00ed\3\2\2\2\u00b9\u00ba\7\r\2\2\u00ba\u00bb\5\16\b\2\u00bb"+
		"\u00bc\7\t\2\2\u00bc\u00bd\7#\2\2\u00bd\u00c3\5\20\t\2\u00be\u00bf\7#"+
		"\2\2\u00bf\u00c4\5\20\t\2\u00c0\u00c1\5\22\n\2\u00c1\u00c2\5\20\t\2\u00c2"+
		"\u00c4\3\2\2\2\u00c3\u00be\3\2\2\2\u00c3\u00c0\3\2\2\2\u00c4\u00ed\3\2"+
		"\2\2\u00c5\u00c6\7\16\2\2\u00c6\u00c7\5\16\b\2\u00c7\u00c8\7\t\2\2\u00c8"+
		"\u00c9\7#\2\2\u00c9\u00ca\5\20\t\2\u00ca\u00cb\7#\2\2\u00cb\u00cc\5\20"+
		"\t\2\u00cc\u00ed\3\2\2\2\u00cd\u00ce\7(\2\2\u00ce\u00cf\7\6\2\2\u00cf"+
		"\u00d0\5\24\13\2\u00d0\u00d1\7\17\2\2\u00d1\u00d2\5\26\f\2\u00d2\u00d3"+
		"\7\f\2\2\u00d3\u00d4\7#\2\2\u00d4\u00d5\5\20\t\2\u00d5\u00ed\3\2\2\2\u00d6"+
		"\u00d7\7(\2\2\u00d7\u00d8\7\6\2\2\u00d8\u00d9\5\24\13\2\u00d9\u00da\7"+
		"\17\2\2\u00da\u00dd\7\20\2\2\u00db\u00de\5\32\16\2\u00dc\u00de\7$\2\2"+
		"\u00dd\u00db\3\2\2\2\u00dd\u00dc\3\2\2\2\u00de\u00df\3\2\2\2\u00df\u00e0"+
		"\7\21\2\2\u00e0\u00e1\7\f\2\2\u00e1\u00e2\7#\2\2\u00e2\u00e3\5\20\t\2"+
		"\u00e3\u00ed\3\2\2\2\u00e4\u00e5\7(\2\2\u00e5\u00e6\7\17\2\2\u00e6\u00e7"+
		"\5\26\f\2\u00e7\u00e8\7\f\2\2\u00e8\u00e9\7#\2\2\u00e9\u00ea\5\20\t\2"+
		"\u00ea\u00ed\3\2\2\2\u00eb\u00ed\7\n\2\2\u00ec\u00ae\3\2\2\2\u00ec\u00b4"+
		"\3\2\2\2\u00ec\u00b9\3\2\2\2\u00ec\u00c5\3\2\2\2\u00ec\u00cd\3\2\2\2\u00ec"+
		"\u00d6\3\2\2\2\u00ec\u00e4\3\2\2\2\u00ec\u00eb\3\2\2\2\u00ed\21\3\2\2"+
		"\2\u00ee\u00ef\7\32\2\2\u00ef\u00f0\7\t\2\2\u00f0\u00f1\7#\2\2\u00f1\u00f2"+
		"\5\20\t\2\u00f2\23\3\2\2\2\u00f3\u00f9\7\"\2\2\u00f4\u00f5\7\20\2\2\u00f5"+
		"\u00f6\5\24\13\2\u00f6\u00f7\7\21\2\2\u00f7\u00f9\3\2\2\2\u00f8\u00f3"+
		"\3\2\2\2\u00f8\u00f4\3\2\2\2\u00f9\25\3\2\2\2\u00fa\u00fb\b\f\1\2\u00fb"+
		"\u0115\7$\2\2\u00fc\u0115\7%\2\2\u00fd\u0115\7&\2\2\u00fe\u0115\7\'\2"+
		"\2\u00ff\u0115\5\30\r\2\u0100\u0115\7(\2\2\u0101\u0102\7(\2\2\u0102\u010c"+
		"\7\4\2\2\u0103\u0108\5\26\f\2\u0104\u0105\7\7\2\2\u0105\u0107\5\26\f\2"+
		"\u0106\u0104\3\2\2\2\u0107\u010a\3\2\2\2\u0108\u0106\3\2\2\2\u0108\u0109"+
		"\3\2\2\2\u0109\u010d\3\2\2\2\u010a\u0108\3\2\2\2\u010b\u010d\3\2\2\2\u010c"+
		"\u0103\3\2\2\2\u010c\u010b\3\2\2\2\u010d\u010e\3\2\2\2\u010e\u0115\7\5"+
		"\2\2\u010f\u0110\7\4\2\2\u0110\u0111\5\26\f\2\u0111\u0112\7\5\2\2\u0112"+
		"\u0115\3\2\2\2\u0113\u0115\7 \2\2\u0114\u00fa\3\2\2\2\u0114\u00fc\3\2"+
		"\2\2\u0114\u00fd\3\2\2\2\u0114\u00fe\3\2\2\2\u0114\u00ff\3\2\2\2\u0114"+
		"\u0100\3\2\2\2\u0114\u0101\3\2\2\2\u0114\u010f\3\2\2\2\u0114\u0113\3\2"+
		"\2\2\u0115\u011e\3\2\2\2\u0116\u0117\f\r\2\2\u0117\u0118\t\4\2\2\u0118"+
		"\u011d\5\26\f\16\u0119\u011a\f\f\2\2\u011a\u011b\t\3\2\2\u011b\u011d\5"+
		"\26\f\r\u011c\u0116\3\2\2\2\u011c\u0119\3\2\2\2\u011d\u0120\3\2\2\2\u011e"+
		"\u011c\3\2\2\2\u011e\u011f\3\2\2\2\u011f\27\3\2\2\2\u0120\u011e\3\2\2"+
		"\2\u0121\u0122\7(\2\2\u0122\u0125\7\20\2\2\u0123\u0126\5\32\16\2\u0124"+
		"\u0126\7$\2\2\u0125\u0123\3\2\2\2\u0125\u0124\3\2\2\2\u0126\u0127\3\2"+
		"\2\2\u0127\u012f\7\21\2\2\u0128\u012b\7!\2\2\u0129\u012c\5\32\16\2\u012a"+
		"\u012c\7$\2\2\u012b\u0129\3\2\2\2\u012b\u012a\3\2\2\2\u012c\u012d\3\2"+
		"\2\2\u012d\u012f\7\21\2\2\u012e\u0121\3\2\2\2\u012e\u0128\3\2\2\2\u012f"+
		"\31\3\2\2\2\u0130\u0131\7$\2\2\u0131\u0132\t\4\2\2\u0132\u0133\7$\2\2"+
		"\u0133\33\3\2\2\2\30\37%<CQein\u0082\u00a8\u00c3\u00dd\u00ec\u00f8\u0108"+
		"\u010c\u0114\u011c\u011e\u0125\u012b\u012e";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}