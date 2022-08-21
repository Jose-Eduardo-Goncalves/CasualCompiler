// Generated from Casual.g4 by ANTLR 4.8

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
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		TYPE=32, NEWLINE=33, INT=34, FLOAT=35, BOOL=36, STRING=37, VARS=38, COMMENT=39, 
		WHITESPACE=40;
	public static final int
		RULE_prog = 0, RULE_comment = 1, RULE_declaration = 2, RULE_def = 3, RULE_block = 4, 
		RULE_blck = 5, RULE_elseBlock = 6, RULE_type = 7, RULE_expr = 8, RULE_index = 9;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "comment", "declaration", "def", "block", "blck", "elseBlock", 
			"type", "expr", "index"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'decl'", "'('", "')'", "':'", "','", "'def'", "'{'", "'}'", "'return'", 
			"';'", "'if'", "'while'", "'='", "'['", "']'", "'else'", "'+'", "'-'", 
			"'*'", "'/'", "'%'", "'&&'", "'||'", "'=='", "'!='", "'>='", "'>'", "'<='", 
			"'<'", "'!'", "'!true'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, "TYPE", "NEWLINE", "INT", 
			"FLOAT", "BOOL", "STRING", "VARS", "COMMENT", "WHITESPACE"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CasualListener ) ((CasualListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CasualListener ) ((CasualListener)listener).exitProg(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(29);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__5) | (1L << COMMENT))) != 0)) {
				{
				{
				setState(23);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case COMMENT:
					{
					setState(20);
					comment();
					}
					break;
				case T__0:
					{
					setState(21);
					declaration();
					}
					break;
				case T__5:
					{
					setState(22);
					def();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(25);
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
				setState(31);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CasualListener ) ((CasualListener)listener).enterComment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CasualListener ) ((CasualListener)listener).exitComment(this);
		}
	}

	public final CommentContext comment() throws RecognitionException {
		CommentContext _localctx = new CommentContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_comment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(32);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CasualListener ) ((CasualListener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CasualListener ) ((CasualListener)listener).exitDeclaration(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_declaration);
		int _la;
		try {
			setState(59);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(34);
				match(T__0);
				setState(35);
				match(VARS);
				setState(36);
				match(T__1);
				setState(37);
				match(T__2);
				setState(38);
				match(T__3);
				setState(39);
				type();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(40);
				match(T__0);
				setState(41);
				match(VARS);
				setState(42);
				match(T__1);
				{
				setState(43);
				match(VARS);
				setState(44);
				match(T__3);
				setState(45);
				type();
				setState(52);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__4) {
					{
					{
					setState(46);
					match(T__4);
					setState(47);
					match(VARS);
					setState(48);
					match(T__3);
					setState(49);
					type();
					}
					}
					setState(54);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				setState(55);
				match(T__2);
				setState(56);
				match(T__3);
				setState(57);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CasualListener ) ((CasualListener)listener).enterDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CasualListener ) ((CasualListener)listener).exitDef(this);
		}
	}

	public final DefContext def() throws RecognitionException {
		DefContext _localctx = new DefContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_def);
		int _la;
		try {
			setState(93);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(61);
				match(T__5);
				setState(62);
				match(VARS);
				setState(63);
				match(T__1);
				{
				setState(64);
				match(VARS);
				setState(65);
				match(T__3);
				setState(66);
				type();
				setState(73);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__4) {
					{
					{
					setState(67);
					match(T__4);
					setState(68);
					match(VARS);
					setState(69);
					match(T__3);
					setState(70);
					type();
					}
					}
					setState(75);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				setState(76);
				match(T__2);
				setState(77);
				match(T__3);
				setState(78);
				type();
				setState(79);
				match(T__6);
				setState(80);
				match(NEWLINE);
				setState(81);
				block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(83);
				match(T__5);
				setState(84);
				match(VARS);
				setState(85);
				match(T__1);
				setState(86);
				match(T__2);
				setState(87);
				match(T__3);
				setState(88);
				type();
				setState(89);
				match(T__6);
				setState(90);
				match(NEWLINE);
				setState(91);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CasualListener ) ((CasualListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CasualListener ) ((CasualListener)listener).exitBlock(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_block);
		try {
			setState(97);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(95);
				match(T__7);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(96);
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
		public List<BlckContext> blck() {
			return getRuleContexts(BlckContext.class);
		}
		public BlckContext blck(int i) {
			return getRuleContext(BlckContext.class,i);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ElseBlockContext elseBlock() {
			return getRuleContext(ElseBlockContext.class,0);
		}
		public TerminalNode VARS() { return getToken(CasualParser.VARS, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<TerminalNode> INT() { return getTokens(CasualParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(CasualParser.INT, i);
		}
		public List<TerminalNode> BOOL() { return getTokens(CasualParser.BOOL); }
		public TerminalNode BOOL(int i) {
			return getToken(CasualParser.BOOL, i);
		}
		public List<TerminalNode> STRING() { return getTokens(CasualParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(CasualParser.STRING, i);
		}
		public List<TerminalNode> FLOAT() { return getTokens(CasualParser.FLOAT); }
		public TerminalNode FLOAT(int i) {
			return getToken(CasualParser.FLOAT, i);
		}
		public BlckContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blck; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CasualListener ) ((CasualListener)listener).enterBlck(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CasualListener ) ((CasualListener)listener).exitBlck(this);
		}
	}

	public final BlckContext blck() throws RecognitionException {
		BlckContext _localctx = new BlckContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_blck);
		int _la;
		try {
			setState(194);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(99);
				match(T__8);
				setState(102);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__1:
				case T__29:
				case T__30:
				case INT:
				case FLOAT:
				case BOOL:
				case STRING:
				case VARS:
					{
					setState(100);
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
				setState(104);
				match(T__9);
				setState(105);
				match(NEWLINE);
				setState(106);
				blck();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(107);
				expr(0);
				setState(108);
				match(T__9);
				setState(109);
				match(NEWLINE);
				setState(110);
				blck();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(112);
				match(T__10);
				setState(113);
				expr(0);
				setState(114);
				match(T__6);
				setState(115);
				match(NEWLINE);
				setState(116);
				blck();
				setState(117);
				match(NEWLINE);
				setState(122);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__1:
				case T__7:
				case T__8:
				case T__10:
				case T__11:
				case T__29:
				case T__30:
				case INT:
				case FLOAT:
				case BOOL:
				case STRING:
				case VARS:
					{
					setState(118);
					blck();
					}
					break;
				case T__15:
					{
					setState(119);
					elseBlock();
					setState(120);
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
				setState(124);
				match(T__11);
				setState(125);
				expr(0);
				setState(126);
				match(T__6);
				setState(127);
				match(NEWLINE);
				setState(128);
				blck();
				setState(129);
				match(NEWLINE);
				setState(130);
				blck();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(132);
				match(VARS);
				setState(133);
				match(T__3);
				setState(134);
				type();
				setState(135);
				match(T__12);
				setState(136);
				expr(0);
				setState(137);
				match(T__9);
				setState(138);
				match(NEWLINE);
				setState(139);
				blck();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(141);
				match(VARS);
				setState(142);
				match(T__3);
				setState(143);
				type();
				setState(144);
				match(T__12);
				setState(145);
				match(T__13);
				setState(179);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case INT:
					{
					setState(146);
					match(INT);
					setState(151);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__4) {
						{
						{
						setState(147);
						match(T__4);
						setState(148);
						match(INT);
						}
						}
						setState(153);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				case BOOL:
					{
					setState(154);
					match(BOOL);
					setState(159);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__4) {
						{
						{
						setState(155);
						match(T__4);
						setState(156);
						match(BOOL);
						}
						}
						setState(161);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				case STRING:
					{
					setState(162);
					match(STRING);
					setState(167);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__4) {
						{
						{
						setState(163);
						match(T__4);
						setState(164);
						match(STRING);
						}
						}
						setState(169);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				case FLOAT:
					{
					setState(170);
					match(FLOAT);
					setState(175);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__4) {
						{
						{
						setState(171);
						match(T__4);
						setState(172);
						match(FLOAT);
						}
						}
						setState(177);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				case T__14:
					{
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(181);
				match(T__14);
				setState(182);
				match(T__9);
				setState(183);
				match(NEWLINE);
				setState(184);
				blck();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(186);
				match(VARS);
				setState(187);
				match(T__12);
				setState(188);
				expr(0);
				setState(189);
				match(T__9);
				setState(190);
				match(NEWLINE);
				setState(191);
				blck();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(193);
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
		public BlckContext blck() {
			return getRuleContext(BlckContext.class,0);
		}
		public ElseBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CasualListener ) ((CasualListener)listener).enterElseBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CasualListener ) ((CasualListener)listener).exitElseBlock(this);
		}
	}

	public final ElseBlockContext elseBlock() throws RecognitionException {
		ElseBlockContext _localctx = new ElseBlockContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_elseBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(196);
			match(T__15);
			setState(197);
			match(T__6);
			setState(198);
			match(NEWLINE);
			setState(199);
			blck();
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CasualListener ) ((CasualListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CasualListener ) ((CasualListener)listener).exitType(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_type);
		try {
			setState(206);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TYPE:
				enterOuterAlt(_localctx, 1);
				{
				setState(201);
				match(TYPE);
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 2);
				{
				setState(202);
				match(T__13);
				setState(203);
				type();
				setState(204);
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
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode INT() { return getToken(CasualParser.INT, 0); }
		public TerminalNode BOOL() { return getToken(CasualParser.BOOL, 0); }
		public TerminalNode STRING() { return getToken(CasualParser.STRING, 0); }
		public TerminalNode FLOAT() { return getToken(CasualParser.FLOAT, 0); }
		public IndexContext index() {
			return getRuleContext(IndexContext.class,0);
		}
		public TerminalNode VARS() { return getToken(CasualParser.VARS, 0); }
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CasualListener ) ((CasualListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CasualListener ) ((CasualListener)listener).exitExpr(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 16;
		enterRecursionRule(_localctx, 16, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(236);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				{
				setState(209);
				match(T__29);
				setState(210);
				expr(10);
				}
				break;
			case 2:
				{
				setState(211);
				match(INT);
				}
				break;
			case 3:
				{
				setState(212);
				match(BOOL);
				}
				break;
			case 4:
				{
				setState(213);
				match(STRING);
				}
				break;
			case 5:
				{
				setState(214);
				match(FLOAT);
				}
				break;
			case 6:
				{
				setState(215);
				index();
				}
				break;
			case 7:
				{
				setState(216);
				match(VARS);
				}
				break;
			case 8:
				{
				setState(217);
				match(VARS);
				setState(218);
				match(T__1);
				setState(228);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__1:
				case T__29:
				case T__30:
				case INT:
				case FLOAT:
				case BOOL:
				case STRING:
				case VARS:
					{
					setState(219);
					expr(0);
					setState(224);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__4) {
						{
						{
						setState(220);
						match(T__4);
						setState(221);
						expr(0);
						}
						}
						setState(226);
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
				setState(230);
				match(T__2);
				}
				break;
			case 9:
				{
				setState(231);
				match(T__1);
				setState(232);
				expr(0);
				setState(233);
				match(T__2);
				}
				break;
			case 10:
				{
				setState(235);
				match(T__30);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(246);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(244);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(238);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(239);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(240);
						expr(13);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(241);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(242);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(243);
						expr(12);
						}
						break;
					}
					} 
				}
				setState(248);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
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
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public IndexContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_index; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CasualListener ) ((CasualListener)listener).enterIndex(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CasualListener ) ((CasualListener)listener).exitIndex(this);
		}
	}

	public final IndexContext index() throws RecognitionException {
		IndexContext _localctx = new IndexContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_index);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(249);
			match(VARS);
			setState(250);
			match(T__13);
			setState(251);
			expr(0);
			setState(252);
			match(T__14);
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
		case 8:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 12);
		case 1:
			return precpred(_ctx, 11);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3*\u0101\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\3\2\3\2\3\2\5\2\32\n\2\3\2\3\2\7\2\36\n\2\f\2\16\2!\13\2\3\3\3\3\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4\65"+
		"\n\4\f\4\16\48\13\4\3\4\3\4\3\4\3\4\5\4>\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\7\5J\n\5\f\5\16\5M\13\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5`\n\5\3\6\3\6\5\6d\n\6\3\7\3\7"+
		"\3\7\5\7i\n\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\5\7}\n\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\7\7\u0098\n\7"+
		"\f\7\16\7\u009b\13\7\3\7\3\7\3\7\7\7\u00a0\n\7\f\7\16\7\u00a3\13\7\3\7"+
		"\3\7\3\7\7\7\u00a8\n\7\f\7\16\7\u00ab\13\7\3\7\3\7\3\7\7\7\u00b0\n\7\f"+
		"\7\16\7\u00b3\13\7\3\7\5\7\u00b6\n\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\5\7\u00c5\n\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3"+
		"\t\5\t\u00d1\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\7\n\u00e1\n\n\f\n\16\n\u00e4\13\n\3\n\5\n\u00e7\n\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\5\n\u00ef\n\n\3\n\3\n\3\n\3\n\3\n\3\n\7\n\u00f7\n\n\f\n\16\n"+
		"\u00fa\13\n\3\13\3\13\3\13\3\13\3\13\3\13\2\3\22\f\2\4\6\b\n\f\16\20\22"+
		"\24\2\5\3\3##\3\2\23\27\3\2\30\37\2\u011d\2\37\3\2\2\2\4\"\3\2\2\2\6="+
		"\3\2\2\2\b_\3\2\2\2\nc\3\2\2\2\f\u00c4\3\2\2\2\16\u00c6\3\2\2\2\20\u00d0"+
		"\3\2\2\2\22\u00ee\3\2\2\2\24\u00fb\3\2\2\2\26\32\5\4\3\2\27\32\5\6\4\2"+
		"\30\32\5\b\5\2\31\26\3\2\2\2\31\27\3\2\2\2\31\30\3\2\2\2\32\33\3\2\2\2"+
		"\33\34\t\2\2\2\34\36\3\2\2\2\35\31\3\2\2\2\36!\3\2\2\2\37\35\3\2\2\2\37"+
		" \3\2\2\2 \3\3\2\2\2!\37\3\2\2\2\"#\7)\2\2#\5\3\2\2\2$%\7\3\2\2%&\7(\2"+
		"\2&\'\7\4\2\2\'(\7\5\2\2()\7\6\2\2)>\5\20\t\2*+\7\3\2\2+,\7(\2\2,-\7\4"+
		"\2\2-.\7(\2\2./\7\6\2\2/\66\5\20\t\2\60\61\7\7\2\2\61\62\7(\2\2\62\63"+
		"\7\6\2\2\63\65\5\20\t\2\64\60\3\2\2\2\658\3\2\2\2\66\64\3\2\2\2\66\67"+
		"\3\2\2\2\679\3\2\2\28\66\3\2\2\29:\7\5\2\2:;\7\6\2\2;<\5\20\t\2<>\3\2"+
		"\2\2=$\3\2\2\2=*\3\2\2\2>\7\3\2\2\2?@\7\b\2\2@A\7(\2\2AB\7\4\2\2BC\7("+
		"\2\2CD\7\6\2\2DK\5\20\t\2EF\7\7\2\2FG\7(\2\2GH\7\6\2\2HJ\5\20\t\2IE\3"+
		"\2\2\2JM\3\2\2\2KI\3\2\2\2KL\3\2\2\2LN\3\2\2\2MK\3\2\2\2NO\7\5\2\2OP\7"+
		"\6\2\2PQ\5\20\t\2QR\7\t\2\2RS\7#\2\2ST\5\n\6\2T`\3\2\2\2UV\7\b\2\2VW\7"+
		"(\2\2WX\7\4\2\2XY\7\5\2\2YZ\7\6\2\2Z[\5\20\t\2[\\\7\t\2\2\\]\7#\2\2]^"+
		"\5\n\6\2^`\3\2\2\2_?\3\2\2\2_U\3\2\2\2`\t\3\2\2\2ad\7\n\2\2bd\5\f\7\2"+
		"ca\3\2\2\2cb\3\2\2\2d\13\3\2\2\2eh\7\13\2\2fi\5\22\n\2gi\3\2\2\2hf\3\2"+
		"\2\2hg\3\2\2\2ij\3\2\2\2jk\7\f\2\2kl\7#\2\2l\u00c5\5\f\7\2mn\5\22\n\2"+
		"no\7\f\2\2op\7#\2\2pq\5\f\7\2q\u00c5\3\2\2\2rs\7\r\2\2st\5\22\n\2tu\7"+
		"\t\2\2uv\7#\2\2vw\5\f\7\2w|\7#\2\2x}\5\f\7\2yz\5\16\b\2z{\5\f\7\2{}\3"+
		"\2\2\2|x\3\2\2\2|y\3\2\2\2}\u00c5\3\2\2\2~\177\7\16\2\2\177\u0080\5\22"+
		"\n\2\u0080\u0081\7\t\2\2\u0081\u0082\7#\2\2\u0082\u0083\5\f\7\2\u0083"+
		"\u0084\7#\2\2\u0084\u0085\5\f\7\2\u0085\u00c5\3\2\2\2\u0086\u0087\7(\2"+
		"\2\u0087\u0088\7\6\2\2\u0088\u0089\5\20\t\2\u0089\u008a\7\17\2\2\u008a"+
		"\u008b\5\22\n\2\u008b\u008c\7\f\2\2\u008c\u008d\7#\2\2\u008d\u008e\5\f"+
		"\7\2\u008e\u00c5\3\2\2\2\u008f\u0090\7(\2\2\u0090\u0091\7\6\2\2\u0091"+
		"\u0092\5\20\t\2\u0092\u0093\7\17\2\2\u0093\u00b5\7\20\2\2\u0094\u0099"+
		"\7$\2\2\u0095\u0096\7\7\2\2\u0096\u0098\7$\2\2\u0097\u0095\3\2\2\2\u0098"+
		"\u009b\3\2\2\2\u0099\u0097\3\2\2\2\u0099\u009a\3\2\2\2\u009a\u00b6\3\2"+
		"\2\2\u009b\u0099\3\2\2\2\u009c\u00a1\7&\2\2\u009d\u009e\7\7\2\2\u009e"+
		"\u00a0\7&\2\2\u009f\u009d\3\2\2\2\u00a0\u00a3\3\2\2\2\u00a1\u009f\3\2"+
		"\2\2\u00a1\u00a2\3\2\2\2\u00a2\u00b6\3\2\2\2\u00a3\u00a1\3\2\2\2\u00a4"+
		"\u00a9\7\'\2\2\u00a5\u00a6\7\7\2\2\u00a6\u00a8\7\'\2\2\u00a7\u00a5\3\2"+
		"\2\2\u00a8\u00ab\3\2\2\2\u00a9\u00a7\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa"+
		"\u00b6\3\2\2\2\u00ab\u00a9\3\2\2\2\u00ac\u00b1\7%\2\2\u00ad\u00ae\7\7"+
		"\2\2\u00ae\u00b0\7%\2\2\u00af\u00ad\3\2\2\2\u00b0\u00b3\3\2\2\2\u00b1"+
		"\u00af\3\2\2\2\u00b1\u00b2\3\2\2\2\u00b2\u00b6\3\2\2\2\u00b3\u00b1\3\2"+
		"\2\2\u00b4\u00b6\3\2\2\2\u00b5\u0094\3\2\2\2\u00b5\u009c\3\2\2\2\u00b5"+
		"\u00a4\3\2\2\2\u00b5\u00ac\3\2\2\2\u00b5\u00b4\3\2\2\2\u00b6\u00b7\3\2"+
		"\2\2\u00b7\u00b8\7\21\2\2\u00b8\u00b9\7\f\2\2\u00b9\u00ba\7#\2\2\u00ba"+
		"\u00bb\5\f\7\2\u00bb\u00c5\3\2\2\2\u00bc\u00bd\7(\2\2\u00bd\u00be\7\17"+
		"\2\2\u00be\u00bf\5\22\n\2\u00bf\u00c0\7\f\2\2\u00c0\u00c1\7#\2\2\u00c1"+
		"\u00c2\5\f\7\2\u00c2\u00c5\3\2\2\2\u00c3\u00c5\7\n\2\2\u00c4e\3\2\2\2"+
		"\u00c4m\3\2\2\2\u00c4r\3\2\2\2\u00c4~\3\2\2\2\u00c4\u0086\3\2\2\2\u00c4"+
		"\u008f\3\2\2\2\u00c4\u00bc\3\2\2\2\u00c4\u00c3\3\2\2\2\u00c5\r\3\2\2\2"+
		"\u00c6\u00c7\7\22\2\2\u00c7\u00c8\7\t\2\2\u00c8\u00c9\7#\2\2\u00c9\u00ca"+
		"\5\f\7\2\u00ca\17\3\2\2\2\u00cb\u00d1\7\"\2\2\u00cc\u00cd\7\20\2\2\u00cd"+
		"\u00ce\5\20\t\2\u00ce\u00cf\7\21\2\2\u00cf\u00d1\3\2\2\2\u00d0\u00cb\3"+
		"\2\2\2\u00d0\u00cc\3\2\2\2\u00d1\21\3\2\2\2\u00d2\u00d3\b\n\1\2\u00d3"+
		"\u00d4\7 \2\2\u00d4\u00ef\5\22\n\f\u00d5\u00ef\7$\2\2\u00d6\u00ef\7&\2"+
		"\2\u00d7\u00ef\7\'\2\2\u00d8\u00ef\7%\2\2\u00d9\u00ef\5\24\13\2\u00da"+
		"\u00ef\7(\2\2\u00db\u00dc\7(\2\2\u00dc\u00e6\7\4\2\2\u00dd\u00e2\5\22"+
		"\n\2\u00de\u00df\7\7\2\2\u00df\u00e1\5\22\n\2\u00e0\u00de\3\2\2\2\u00e1"+
		"\u00e4\3\2\2\2\u00e2\u00e0\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e3\u00e7\3\2"+
		"\2\2\u00e4\u00e2\3\2\2\2\u00e5\u00e7\3\2\2\2\u00e6\u00dd\3\2\2\2\u00e6"+
		"\u00e5\3\2\2\2\u00e7\u00e8\3\2\2\2\u00e8\u00ef\7\5\2\2\u00e9\u00ea\7\4"+
		"\2\2\u00ea\u00eb\5\22\n\2\u00eb\u00ec\7\5\2\2\u00ec\u00ef\3\2\2\2\u00ed"+
		"\u00ef\7!\2\2\u00ee\u00d2\3\2\2\2\u00ee\u00d5\3\2\2\2\u00ee\u00d6\3\2"+
		"\2\2\u00ee\u00d7\3\2\2\2\u00ee\u00d8\3\2\2\2\u00ee\u00d9\3\2\2\2\u00ee"+
		"\u00da\3\2\2\2\u00ee\u00db\3\2\2\2\u00ee\u00e9\3\2\2\2\u00ee\u00ed\3\2"+
		"\2\2\u00ef\u00f8\3\2\2\2\u00f0\u00f1\f\16\2\2\u00f1\u00f2\t\3\2\2\u00f2"+
		"\u00f7\5\22\n\17\u00f3\u00f4\f\r\2\2\u00f4\u00f5\t\4\2\2\u00f5\u00f7\5"+
		"\22\n\16\u00f6\u00f0\3\2\2\2\u00f6\u00f3\3\2\2\2\u00f7\u00fa\3\2\2\2\u00f8"+
		"\u00f6\3\2\2\2\u00f8\u00f9\3\2\2\2\u00f9\23\3\2\2\2\u00fa\u00f8\3\2\2"+
		"\2\u00fb\u00fc\7(\2\2\u00fc\u00fd\7\20\2\2\u00fd\u00fe\5\22\n\2\u00fe"+
		"\u00ff\7\21\2\2\u00ff\25\3\2\2\2\27\31\37\66=K_ch|\u0099\u00a1\u00a9\u00b1"+
		"\u00b5\u00c4\u00d0\u00e2\u00e6\u00ee\u00f6\u00f8";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}