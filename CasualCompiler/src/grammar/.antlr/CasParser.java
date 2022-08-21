// Generated from c:\Users\jeeg9\eclipse-workspace\projeto-tcomp\CasualCompiler\src\grammar\Cas.g4 by ANTLR 4.7.1

	package cas.grammar;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CasParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, NEWLINE=34, INT=35, BOOL=36, STRING=37, FLOAT=38, 
		VARS=39, TYPE=40, COMMENT=41, EMPTY=42;
	public static final int
		RULE_prog = 0, RULE_expr = 1, RULE_comment = 2, RULE_decl = 3, RULE_def = 4, 
		RULE_block = 5, RULE_blck = 6, RULE_cond = 7, RULE_condBlock = 8, RULE_elseBlock = 9, 
		RULE_type = 10, RULE_index = 11, RULE_e = 12;
	public static final String[] ruleNames = {
		"prog", "expr", "comment", "decl", "def", "block", "blck", "cond", "condBlock", 
		"elseBlock", "type", "index", "e"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'#'", "'decl'", "'('", "':'", "','", "')'", "'def'", "'{'", "'}'", 
		"'return'", "';'", "'if'", "'while'", "'='", "'&&'", "'||'", "'=='", "'!='", 
		"'>='", "'>'", "'<='", "'<'", "'else'", "'['", "']'", "'get_array()['", 
		"'+1]'", "'+'", "'-'", "'*'", "'/'", "'%'", "'!true'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, "NEWLINE", 
		"INT", "BOOL", "STRING", "FLOAT", "VARS", "TYPE", "COMMENT", "EMPTY"
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
	public String getGrammarFileName() { return "Cas.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public CasParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(CasParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(CasParser.NEWLINE, i);
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
			setState(31);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__6))) != 0)) {
				{
				{
				setState(26);
				expr();
				setState(27);
				match(NEWLINE);
				}
				}
				setState(33);
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

	public static class ExprContext extends ParserRuleContext {
		public DeclContext decl() {
			return getRuleContext(DeclContext.class,0);
		}
		public DefContext def() {
			return getRuleContext(DefContext.class,0);
		}
		public CommentContext comment() {
			return getRuleContext(CommentContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_expr);
		try {
			setState(37);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(34);
				decl();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(35);
				def();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(36);
				comment();
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

	public static class CommentContext extends ParserRuleContext {
		public TerminalNode COMMENT() { return getToken(CasParser.COMMENT, 0); }
		public TerminalNode NEWLINE() { return getToken(CasParser.NEWLINE, 0); }
		public CommentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comment; }
	}

	public final CommentContext comment() throws RecognitionException {
		CommentContext _localctx = new CommentContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_comment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(39);
			match(T__0);
			setState(40);
			match(COMMENT);
			setState(41);
			match(NEWLINE);
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

	public static class DeclContext extends ParserRuleContext {
		public List<TerminalNode> VARS() { return getTokens(CasParser.VARS); }
		public TerminalNode VARS(int i) {
			return getToken(CasParser.VARS, i);
		}
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public DeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decl; }
	}

	public final DeclContext decl() throws RecognitionException {
		DeclContext _localctx = new DeclContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_decl);
		int _la;
		try {
			setState(68);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(43);
				match(T__1);
				setState(44);
				match(VARS);
				setState(45);
				match(T__2);
				{
				setState(46);
				match(VARS);
				setState(47);
				match(T__3);
				setState(48);
				type();
				setState(55);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__4) {
					{
					{
					setState(49);
					match(T__4);
					setState(50);
					match(VARS);
					setState(51);
					match(T__3);
					setState(52);
					type();
					}
					}
					setState(57);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				setState(58);
				match(T__5);
				setState(59);
				match(T__3);
				setState(60);
				type();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(62);
				match(T__1);
				setState(63);
				match(VARS);
				setState(64);
				match(T__2);
				setState(65);
				match(T__5);
				setState(66);
				match(T__3);
				setState(67);
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
		public List<TerminalNode> VARS() { return getTokens(CasParser.VARS); }
		public TerminalNode VARS(int i) {
			return getToken(CasParser.VARS, i);
		}
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public TerminalNode NEWLINE() { return getToken(CasParser.NEWLINE, 0); }
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
		enterRule(_localctx, 8, RULE_def);
		int _la;
		try {
			setState(102);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__6:
				enterOuterAlt(_localctx, 1);
				{
				setState(70);
				match(T__6);
				setState(71);
				match(VARS);
				setState(72);
				match(T__2);
				{
				setState(73);
				match(VARS);
				setState(74);
				match(T__3);
				setState(75);
				type();
				setState(82);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__4) {
					{
					{
					setState(76);
					match(T__4);
					setState(77);
					match(VARS);
					setState(78);
					match(T__3);
					setState(79);
					type();
					}
					}
					setState(84);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				setState(85);
				match(T__5);
				setState(86);
				match(T__3);
				setState(87);
				type();
				setState(88);
				match(T__7);
				setState(89);
				match(NEWLINE);
				setState(90);
				block();
				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 2);
				{
				setState(92);
				match(T__1);
				setState(93);
				match(VARS);
				setState(94);
				match(T__2);
				setState(95);
				match(T__5);
				setState(96);
				match(T__3);
				setState(97);
				type();
				setState(98);
				match(T__7);
				setState(99);
				match(NEWLINE);
				setState(100);
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
		enterRule(_localctx, 10, RULE_block);
		try {
			setState(106);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__8:
				enterOuterAlt(_localctx, 1);
				{
				setState(104);
				match(T__8);
				}
				break;
			case T__0:
			case T__1:
			case T__6:
			case T__9:
			case T__11:
			case T__12:
			case VARS:
				enterOuterAlt(_localctx, 2);
				{
				setState(105);
				blck();
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

	public static class BlckContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(CasParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(CasParser.NEWLINE, i);
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
		public TerminalNode VARS() { return getToken(CasParser.VARS, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public BlckContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blck; }
	}

	public final BlckContext blck() throws RecognitionException {
		BlckContext _localctx = new BlckContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_blck);
		try {
			setState(159);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(108);
				match(T__9);
				setState(109);
				expr();
				setState(110);
				match(T__10);
				setState(111);
				match(NEWLINE);
				setState(112);
				match(T__8);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(114);
				expr();
				setState(115);
				match(T__10);
				setState(116);
				match(NEWLINE);
				setState(117);
				blck();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(119);
				match(T__11);
				setState(120);
				cond();
				setState(121);
				match(T__7);
				setState(122);
				match(NEWLINE);
				setState(123);
				condBlock();
				setState(124);
				match(NEWLINE);
				setState(125);
				match(T__8);
				setState(131);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case NEWLINE:
					{
					setState(126);
					match(NEWLINE);
					setState(127);
					blck();
					}
					break;
				case T__22:
					{
					setState(128);
					elseBlock();
					setState(129);
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
				setState(133);
				match(T__12);
				setState(134);
				cond();
				setState(135);
				match(T__7);
				setState(136);
				match(NEWLINE);
				setState(137);
				condBlock();
				setState(138);
				match(NEWLINE);
				setState(139);
				match(T__8);
				setState(140);
				match(NEWLINE);
				setState(141);
				blck();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(143);
				match(VARS);
				setState(144);
				match(T__3);
				setState(145);
				type();
				setState(146);
				match(T__13);
				setState(147);
				expr();
				setState(148);
				match(T__10);
				setState(149);
				match(NEWLINE);
				setState(150);
				blck();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(152);
				match(VARS);
				setState(153);
				match(T__13);
				setState(154);
				expr();
				setState(155);
				match(T__10);
				setState(156);
				match(NEWLINE);
				setState(157);
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
		enterRule(_localctx, 14, RULE_cond);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(161);
			expr();
			setState(162);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(163);
			expr();
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
		public List<TerminalNode> NEWLINE() { return getTokens(CasParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(CasParser.NEWLINE, i);
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
		public TerminalNode VARS() { return getToken(CasParser.VARS, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public CondBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condBlock; }
	}

	public final CondBlockContext condBlock() throws RecognitionException {
		CondBlockContext _localctx = new CondBlockContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_condBlock);
		try {
			setState(213);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(165);
				match(T__9);
				setState(166);
				expr();
				setState(167);
				match(T__10);
				setState(168);
				match(NEWLINE);
				setState(169);
				match(T__8);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(171);
				expr();
				setState(172);
				match(T__10);
				setState(173);
				match(NEWLINE);
				setState(174);
				condBlock();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(176);
				match(T__11);
				setState(177);
				cond();
				setState(178);
				match(T__7);
				setState(179);
				match(NEWLINE);
				setState(180);
				condBlock();
				setState(186);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case NEWLINE:
					{
					setState(181);
					match(NEWLINE);
					setState(182);
					condBlock();
					}
					break;
				case T__22:
					{
					setState(183);
					elseBlock();
					setState(184);
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
				setState(188);
				match(T__12);
				setState(189);
				cond();
				setState(190);
				match(T__7);
				setState(191);
				match(NEWLINE);
				setState(192);
				condBlock();
				setState(193);
				match(NEWLINE);
				setState(194);
				condBlock();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(196);
				match(VARS);
				setState(197);
				match(T__3);
				setState(198);
				type();
				setState(199);
				match(T__13);
				setState(200);
				expr();
				setState(201);
				match(T__10);
				setState(202);
				match(NEWLINE);
				setState(203);
				condBlock();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(205);
				match(VARS);
				setState(206);
				match(T__13);
				setState(207);
				expr();
				setState(208);
				match(T__10);
				setState(209);
				match(NEWLINE);
				setState(210);
				condBlock();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(212);
				match(T__8);
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
		public TerminalNode NEWLINE() { return getToken(CasParser.NEWLINE, 0); }
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
		enterRule(_localctx, 18, RULE_elseBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(215);
			match(T__22);
			setState(216);
			match(T__7);
			setState(217);
			match(NEWLINE);
			setState(218);
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
		public TerminalNode TYPE() { return getToken(CasParser.TYPE, 0); }
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
		enterRule(_localctx, 20, RULE_type);
		try {
			setState(225);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TYPE:
				enterOuterAlt(_localctx, 1);
				{
				setState(220);
				match(TYPE);
				}
				break;
			case T__23:
				enterOuterAlt(_localctx, 2);
				{
				setState(221);
				match(T__23);
				setState(222);
				type();
				setState(223);
				match(T__24);
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

	public static class IndexContext extends ParserRuleContext {
		public TerminalNode VARS() { return getToken(CasParser.VARS, 0); }
		public List<TerminalNode> INT() { return getTokens(CasParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(CasParser.INT, i);
		}
		public IndexContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_index; }
	}

	public final IndexContext index() throws RecognitionException {
		IndexContext _localctx = new IndexContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_index);
		int _la;
		try {
			setState(239);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VARS:
				enterOuterAlt(_localctx, 1);
				{
				setState(227);
				match(VARS);
				setState(228);
				match(T__23);
				setState(232);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==INT) {
					{
					{
					setState(229);
					match(INT);
					}
					}
					setState(234);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(235);
				match(T__24);
				}
				break;
			case T__25:
				enterOuterAlt(_localctx, 2);
				{
				setState(236);
				match(T__25);
				setState(237);
				match(INT);
				setState(238);
				match(T__26);
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

	public static class EContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode INT() { return getToken(CasParser.INT, 0); }
		public TerminalNode BOOL() { return getToken(CasParser.BOOL, 0); }
		public TerminalNode STRING() { return getToken(CasParser.STRING, 0); }
		public TerminalNode FLOAT() { return getToken(CasParser.FLOAT, 0); }
		public IndexContext index() {
			return getRuleContext(IndexContext.class,0);
		}
		public TerminalNode VARS() { return getToken(CasParser.VARS, 0); }
		public EContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_e; }
	}

	public final EContext e() throws RecognitionException {
		EContext _localctx = new EContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_e);
		int _la;
		try {
			setState(274);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(241);
				expr();
				setState(242);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(243);
				expr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(245);
				expr();
				setState(246);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(247);
				expr();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(249);
				match(INT);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(250);
				match(BOOL);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(251);
				match(STRING);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(252);
				match(FLOAT);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(253);
				index();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(254);
				match(VARS);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(255);
				match(VARS);
				setState(256);
				match(T__2);
				setState(266);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__0:
				case T__1:
				case T__6:
					{
					setState(257);
					expr();
					setState(262);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__4) {
						{
						{
						setState(258);
						match(T__4);
						setState(259);
						expr();
						}
						}
						setState(264);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				case T__5:
					{
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(268);
				match(T__5);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(269);
				match(T__2);
				setState(270);
				expr();
				setState(271);
				match(T__5);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(273);
				match(T__32);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3,\u0117\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\3\2\3\2\3\2\7\2 \n\2\f\2\16\2#\13\2\3\3"+
		"\3\3\3\3\5\3(\n\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\7\58\n\5\f\5\16\5;\13\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5"+
		"\5G\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\7\6S\n\6\f\6\16\6V\13"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\5\6i\n\6\3\7\3\7\5\7m\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u0086\n\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u00a2\n\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\5\n\u00bd\n\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u00d8\n\n\3\13\3\13\3"+
		"\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\5\f\u00e4\n\f\3\r\3\r\3\r\7\r\u00e9"+
		"\n\r\f\r\16\r\u00ec\13\r\3\r\3\r\3\r\3\r\5\r\u00f2\n\r\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\7\16\u0107\n\16\f\16\16\16\u010a\13\16\3\16\5\16\u010d\n\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u0115\n\16\3\16\2\2\17\2\4\6\b\n\f"+
		"\16\20\22\24\26\30\32\2\4\3\2\21\30\3\2\36\"\2\u012d\2!\3\2\2\2\4\'\3"+
		"\2\2\2\6)\3\2\2\2\bF\3\2\2\2\nh\3\2\2\2\fl\3\2\2\2\16\u00a1\3\2\2\2\20"+
		"\u00a3\3\2\2\2\22\u00d7\3\2\2\2\24\u00d9\3\2\2\2\26\u00e3\3\2\2\2\30\u00f1"+
		"\3\2\2\2\32\u0114\3\2\2\2\34\35\5\4\3\2\35\36\7$\2\2\36 \3\2\2\2\37\34"+
		"\3\2\2\2 #\3\2\2\2!\37\3\2\2\2!\"\3\2\2\2\"\3\3\2\2\2#!\3\2\2\2$(\5\b"+
		"\5\2%(\5\n\6\2&(\5\6\4\2\'$\3\2\2\2\'%\3\2\2\2\'&\3\2\2\2(\5\3\2\2\2)"+
		"*\7\3\2\2*+\7+\2\2+,\7$\2\2,\7\3\2\2\2-.\7\4\2\2./\7)\2\2/\60\7\5\2\2"+
		"\60\61\7)\2\2\61\62\7\6\2\2\629\5\26\f\2\63\64\7\7\2\2\64\65\7)\2\2\65"+
		"\66\7\6\2\2\668\5\26\f\2\67\63\3\2\2\28;\3\2\2\29\67\3\2\2\29:\3\2\2\2"+
		":<\3\2\2\2;9\3\2\2\2<=\7\b\2\2=>\7\6\2\2>?\5\26\f\2?G\3\2\2\2@A\7\4\2"+
		"\2AB\7)\2\2BC\7\5\2\2CD\7\b\2\2DE\7\6\2\2EG\5\26\f\2F-\3\2\2\2F@\3\2\2"+
		"\2G\t\3\2\2\2HI\7\t\2\2IJ\7)\2\2JK\7\5\2\2KL\7)\2\2LM\7\6\2\2MT\5\26\f"+
		"\2NO\7\7\2\2OP\7)\2\2PQ\7\6\2\2QS\5\26\f\2RN\3\2\2\2SV\3\2\2\2TR\3\2\2"+
		"\2TU\3\2\2\2UW\3\2\2\2VT\3\2\2\2WX\7\b\2\2XY\7\6\2\2YZ\5\26\f\2Z[\7\n"+
		"\2\2[\\\7$\2\2\\]\5\f\7\2]i\3\2\2\2^_\7\4\2\2_`\7)\2\2`a\7\5\2\2ab\7\b"+
		"\2\2bc\7\6\2\2cd\5\26\f\2de\7\n\2\2ef\7$\2\2fg\5\f\7\2gi\3\2\2\2hH\3\2"+
		"\2\2h^\3\2\2\2i\13\3\2\2\2jm\7\13\2\2km\5\16\b\2lj\3\2\2\2lk\3\2\2\2m"+
		"\r\3\2\2\2no\7\f\2\2op\5\4\3\2pq\7\r\2\2qr\7$\2\2rs\7\13\2\2s\u00a2\3"+
		"\2\2\2tu\5\4\3\2uv\7\r\2\2vw\7$\2\2wx\5\16\b\2x\u00a2\3\2\2\2yz\7\16\2"+
		"\2z{\5\20\t\2{|\7\n\2\2|}\7$\2\2}~\5\22\n\2~\177\7$\2\2\177\u0085\7\13"+
		"\2\2\u0080\u0081\7$\2\2\u0081\u0086\5\16\b\2\u0082\u0083\5\24\13\2\u0083"+
		"\u0084\5\16\b\2\u0084\u0086\3\2\2\2\u0085\u0080\3\2\2\2\u0085\u0082\3"+
		"\2\2\2\u0086\u00a2\3\2\2\2\u0087\u0088\7\17\2\2\u0088\u0089\5\20\t\2\u0089"+
		"\u008a\7\n\2\2\u008a\u008b\7$\2\2\u008b\u008c\5\22\n\2\u008c\u008d\7$"+
		"\2\2\u008d\u008e\7\13\2\2\u008e\u008f\7$\2\2\u008f\u0090\5\16\b\2\u0090"+
		"\u00a2\3\2\2\2\u0091\u0092\7)\2\2\u0092\u0093\7\6\2\2\u0093\u0094\5\26"+
		"\f\2\u0094\u0095\7\20\2\2\u0095\u0096\5\4\3\2\u0096\u0097\7\r\2\2\u0097"+
		"\u0098\7$\2\2\u0098\u0099\5\16\b\2\u0099\u00a2\3\2\2\2\u009a\u009b\7)"+
		"\2\2\u009b\u009c\7\20\2\2\u009c\u009d\5\4\3\2\u009d\u009e\7\r\2\2\u009e"+
		"\u009f\7$\2\2\u009f\u00a0\5\16\b\2\u00a0\u00a2\3\2\2\2\u00a1n\3\2\2\2"+
		"\u00a1t\3\2\2\2\u00a1y\3\2\2\2\u00a1\u0087\3\2\2\2\u00a1\u0091\3\2\2\2"+
		"\u00a1\u009a\3\2\2\2\u00a2\17\3\2\2\2\u00a3\u00a4\5\4\3\2\u00a4\u00a5"+
		"\t\2\2\2\u00a5\u00a6\5\4\3\2\u00a6\21\3\2\2\2\u00a7\u00a8\7\f\2\2\u00a8"+
		"\u00a9\5\4\3\2\u00a9\u00aa\7\r\2\2\u00aa\u00ab\7$\2\2\u00ab\u00ac\7\13"+
		"\2\2\u00ac\u00d8\3\2\2\2\u00ad\u00ae\5\4\3\2\u00ae\u00af\7\r\2\2\u00af"+
		"\u00b0\7$\2\2\u00b0\u00b1\5\22\n\2\u00b1\u00d8\3\2\2\2\u00b2\u00b3\7\16"+
		"\2\2\u00b3\u00b4\5\20\t\2\u00b4\u00b5\7\n\2\2\u00b5\u00b6\7$\2\2\u00b6"+
		"\u00bc\5\22\n\2\u00b7\u00b8\7$\2\2\u00b8\u00bd\5\22\n\2\u00b9\u00ba\5"+
		"\24\13\2\u00ba\u00bb\5\22\n\2\u00bb\u00bd\3\2\2\2\u00bc\u00b7\3\2\2\2"+
		"\u00bc\u00b9\3\2\2\2\u00bd\u00d8\3\2\2\2\u00be\u00bf\7\17\2\2\u00bf\u00c0"+
		"\5\20\t\2\u00c0\u00c1\7\n\2\2\u00c1\u00c2\7$\2\2\u00c2\u00c3\5\22\n\2"+
		"\u00c3\u00c4\7$\2\2\u00c4\u00c5\5\22\n\2\u00c5\u00d8\3\2\2\2\u00c6\u00c7"+
		"\7)\2\2\u00c7\u00c8\7\6\2\2\u00c8\u00c9\5\26\f\2\u00c9\u00ca\7\20\2\2"+
		"\u00ca\u00cb\5\4\3\2\u00cb\u00cc\7\r\2\2\u00cc\u00cd\7$\2\2\u00cd\u00ce"+
		"\5\22\n\2\u00ce\u00d8\3\2\2\2\u00cf\u00d0\7)\2\2\u00d0\u00d1\7\20\2\2"+
		"\u00d1\u00d2\5\4\3\2\u00d2\u00d3\7\r\2\2\u00d3\u00d4\7$\2\2\u00d4\u00d5"+
		"\5\22\n\2\u00d5\u00d8\3\2\2\2\u00d6\u00d8\7\13\2\2\u00d7\u00a7\3\2\2\2"+
		"\u00d7\u00ad\3\2\2\2\u00d7\u00b2\3\2\2\2\u00d7\u00be\3\2\2\2\u00d7\u00c6"+
		"\3\2\2\2\u00d7\u00cf\3\2\2\2\u00d7\u00d6\3\2\2\2\u00d8\23\3\2\2\2\u00d9"+
		"\u00da\7\31\2\2\u00da\u00db\7\n\2\2\u00db\u00dc\7$\2\2\u00dc\u00dd\5\22"+
		"\n\2\u00dd\25\3\2\2\2\u00de\u00e4\7*\2\2\u00df\u00e0\7\32\2\2\u00e0\u00e1"+
		"\5\26\f\2\u00e1\u00e2\7\33\2\2\u00e2\u00e4\3\2\2\2\u00e3\u00de\3\2\2\2"+
		"\u00e3\u00df\3\2\2\2\u00e4\27\3\2\2\2\u00e5\u00e6\7)\2\2\u00e6\u00ea\7"+
		"\32\2\2\u00e7\u00e9\7%\2\2\u00e8\u00e7\3\2\2\2\u00e9\u00ec\3\2\2\2\u00ea"+
		"\u00e8\3\2\2\2\u00ea\u00eb\3\2\2\2\u00eb\u00ed\3\2\2\2\u00ec\u00ea\3\2"+
		"\2\2\u00ed\u00f2\7\33\2\2\u00ee\u00ef\7\34\2\2\u00ef\u00f0\7%\2\2\u00f0"+
		"\u00f2\7\35\2\2\u00f1\u00e5\3\2\2\2\u00f1\u00ee\3\2\2\2\u00f2\31\3\2\2"+
		"\2\u00f3\u00f4\5\4\3\2\u00f4\u00f5\t\3\2\2\u00f5\u00f6\5\4\3\2\u00f6\u0115"+
		"\3\2\2\2\u00f7\u00f8\5\4\3\2\u00f8\u00f9\t\2\2\2\u00f9\u00fa\5\4\3\2\u00fa"+
		"\u0115\3\2\2\2\u00fb\u0115\7%\2\2\u00fc\u0115\7&\2\2\u00fd\u0115\7\'\2"+
		"\2\u00fe\u0115\7(\2\2\u00ff\u0115\5\30\r\2\u0100\u0115\7)\2\2\u0101\u0102"+
		"\7)\2\2\u0102\u010c\7\5\2\2\u0103\u0108\5\4\3\2\u0104\u0105\7\7\2\2\u0105"+
		"\u0107\5\4\3\2\u0106\u0104\3\2\2\2\u0107\u010a\3\2\2\2\u0108\u0106\3\2"+
		"\2\2\u0108\u0109\3\2\2\2\u0109\u010d\3\2\2\2\u010a\u0108\3\2\2\2\u010b"+
		"\u010d\3\2\2\2\u010c\u0103\3\2\2\2\u010c\u010b\3\2\2\2\u010d\u010e\3\2"+
		"\2\2\u010e\u0115\7\b\2\2\u010f\u0110\7\5\2\2\u0110\u0111\5\4\3\2\u0111"+
		"\u0112\7\b\2\2\u0112\u0115\3\2\2\2\u0113\u0115\7#\2\2\u0114\u00f3\3\2"+
		"\2\2\u0114\u00f7\3\2\2\2\u0114\u00fb\3\2\2\2\u0114\u00fc\3\2\2\2\u0114"+
		"\u00fd\3\2\2\2\u0114\u00fe\3\2\2\2\u0114\u00ff\3\2\2\2\u0114\u0100\3\2"+
		"\2\2\u0114\u0101\3\2\2\2\u0114\u010f\3\2\2\2\u0114\u0113\3\2\2\2\u0115"+
		"\33\3\2\2\2\23!\'9FThl\u0085\u00a1\u00bc\u00d7\u00e3\u00ea\u00f1\u0108"+
		"\u010c\u0114";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}