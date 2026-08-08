// Generated from CodexLatinusParser.g4 by ANTLR 4.13.2
package com.pablocompany.practica.no1.compi2.compiler.logic;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class CodexLatinusParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		COMMENT=1, BLOCK_COMMENT=2, WS=3, VARIABILES=4, MUNERA=5, MAIOR=6, FINIS_SEPARATOR=7, 
		PRINT=8, READ=9, NUMERUS=10, TEXTUM=11, DECIMALIS=12, LITTERA=13, VERUM=14, 
		FALSUS=15, ESTO=16, SERIES=17, STRUCTURE=18, FINIS=19, DUM=20, FACERE=21, 
		PER=22, SI=23, ALITER=24, ACTIO=25, RATIO=26, REDDERE=27, EQUAL=28, COMMA=29, 
		DOT_COMMA=30, TWO_POINTS=31, DOT=32, INIT_BRACE=33, FINAL_BRACE=34, INIT_BRACKET=35, 
		FINAL_BRACKET=36, INIT_PARENT=37, FINAL_PARENT=38, ABREV_PLUS=39, ABREV_MINUS=40, 
		PLUS=41, MINUS=42, MULTIPLICATION=43, DIVIDE=44, EQUALS=45, GREATER_EQUALS=46, 
		LESS_EQUALS=47, DIFERENCE=48, LESS=49, GREATER=50, AND=51, OR=52, NOT=53, 
		ID=54, INT=55, DECIMAL=56, STRING=57, CHAR=58, ERROR_TOKEN=59;
	public static final int
		RULE_program = 0, RULE_body = 1, RULE_maior_section = 2, RULE_munera_section = 3, 
		RULE_variable_section = 4, RULE_variabiles_body = 5, RULE_declarations = 6, 
		RULE_variable_ussage = 7, RULE_array_ussage = 8, RULE_struct_array_property = 9, 
		RULE_struct_instance = 10, RULE_struct_data_list = 11, RULE_variable_declaration = 12, 
		RULE_boolean_declaration = 13, RULE_normal_array = 14, RULE_boolean_array = 15, 
		RULE_array_initialization = 16, RULE_values_array_list = 17, RULE_array_value = 18, 
		RULE_struct_declaration = 19, RULE_struct_body = 20, RULE_struct_normal_body = 21, 
		RULE_struct_comma_body = 22, RULE_struct_attribute = 23, RULE_variable_without_value = 24, 
		RULE_boolean_variable_without_value = 25, RULE_array_variable_struct = 26, 
		RULE_struct_data_value = 27, RULE_expression = 28, RULE_variable_type = 29, 
		RULE_array_call = 30, RULE_struct_values = 31, RULE_normal_values = 32, 
		RULE_boolean_values = 33;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "body", "maior_section", "munera_section", "variable_section", 
			"variabiles_body", "declarations", "variable_ussage", "array_ussage", 
			"struct_array_property", "struct_instance", "struct_data_list", "variable_declaration", 
			"boolean_declaration", "normal_array", "boolean_array", "array_initialization", 
			"values_array_list", "array_value", "struct_declaration", "struct_body", 
			"struct_normal_body", "struct_comma_body", "struct_attribute", "variable_without_value", 
			"boolean_variable_without_value", "array_variable_struct", "struct_data_value", 
			"expression", "variable_type", "array_call", "struct_values", "normal_values", 
			"boolean_values"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, "'VARIABILES'", "'MUNERA'", "'MAIOR'", "'FINIS'", 
			"'>>'", "'<<'", "'numerus'", "'textum'", "'decimalis'", "'littera'", 
			"'verum'", "'falsus'", "'esto'", "'series'", "'structura'", "'finis'", 
			"'dum'", "'facere'", "'per'", "'si'", "'aliter'", "'actio'", "'ratio'", 
			"'reddere'", "'='", "','", "';'", "':'", "'.'", "'{'", "'}'", "'['", 
			"']'", "'('", "')'", "'++'", "'--'", "'+'", "'-'", "'*'", "'/'", "'=='", 
			"'>='", "'<='", "'!='", "'<'", "'>'", "'&&'", "'||'", "'non'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "COMMENT", "BLOCK_COMMENT", "WS", "VARIABILES", "MUNERA", "MAIOR", 
			"FINIS_SEPARATOR", "PRINT", "READ", "NUMERUS", "TEXTUM", "DECIMALIS", 
			"LITTERA", "VERUM", "FALSUS", "ESTO", "SERIES", "STRUCTURE", "FINIS", 
			"DUM", "FACERE", "PER", "SI", "ALITER", "ACTIO", "RATIO", "REDDERE", 
			"EQUAL", "COMMA", "DOT_COMMA", "TWO_POINTS", "DOT", "INIT_BRACE", "FINAL_BRACE", 
			"INIT_BRACKET", "FINAL_BRACKET", "INIT_PARENT", "FINAL_PARENT", "ABREV_PLUS", 
			"ABREV_MINUS", "PLUS", "MINUS", "MULTIPLICATION", "DIVIDE", "EQUALS", 
			"GREATER_EQUALS", "LESS_EQUALS", "DIFERENCE", "LESS", "GREATER", "AND", 
			"OR", "NOT", "ID", "INT", "DECIMAL", "STRING", "CHAR", "ERROR_TOKEN"
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
	public String getGrammarFileName() { return "CodexLatinusParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public CodexLatinusParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public List<BodyContext> body() {
			return getRuleContexts(BodyContext.class);
		}
		public BodyContext body(int i) {
			return getRuleContext(BodyContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusParserListener ) ((CodexLatinusParserListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusParserListener ) ((CodexLatinusParserListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusParserVisitor ) return ((CodexLatinusParserVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(71);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VARIABILES) {
				{
				{
				setState(68);
				body();
				}
				}
				setState(73);
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

	@SuppressWarnings("CheckReturnValue")
	public static class BodyContext extends ParserRuleContext {
		public Variable_sectionContext variable_section() {
			return getRuleContext(Variable_sectionContext.class,0);
		}
		public Maior_sectionContext maior_section() {
			return getRuleContext(Maior_sectionContext.class,0);
		}
		public TerminalNode FINIS_SEPARATOR() { return getToken(CodexLatinusParser.FINIS_SEPARATOR, 0); }
		public TerminalNode DOT_COMMA() { return getToken(CodexLatinusParser.DOT_COMMA, 0); }
		public Munera_sectionContext munera_section() {
			return getRuleContext(Munera_sectionContext.class,0);
		}
		public BodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusParserListener ) ((CodexLatinusParserListener)listener).enterBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusParserListener ) ((CodexLatinusParserListener)listener).exitBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusParserVisitor ) return ((CodexLatinusParserVisitor<? extends T>)visitor).visitBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BodyContext body() throws RecognitionException {
		BodyContext _localctx = new BodyContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74);
			variable_section();
			setState(76);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MUNERA) {
				{
				setState(75);
				munera_section();
				}
			}

			setState(78);
			maior_section();
			setState(79);
			match(FINIS_SEPARATOR);
			setState(80);
			match(DOT_COMMA);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Maior_sectionContext extends ParserRuleContext {
		public Maior_sectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_maior_section; }
	 
		public Maior_sectionContext() { }
		public void copyFrom(Maior_sectionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MaiorSectionContext extends Maior_sectionContext {
		public TerminalNode MAIOR() { return getToken(CodexLatinusParser.MAIOR, 0); }
		public TerminalNode GREATER() { return getToken(CodexLatinusParser.GREATER, 0); }
		public MaiorSectionContext(Maior_sectionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusParserListener ) ((CodexLatinusParserListener)listener).enterMaiorSection(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusParserListener ) ((CodexLatinusParserListener)listener).exitMaiorSection(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusParserVisitor ) return ((CodexLatinusParserVisitor<? extends T>)visitor).visitMaiorSection(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Maior_sectionContext maior_section() throws RecognitionException {
		Maior_sectionContext _localctx = new Maior_sectionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_maior_section);
		try {
			_localctx = new MaiorSectionContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
			match(MAIOR);
			setState(83);
			match(GREATER);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Munera_sectionContext extends ParserRuleContext {
		public Munera_sectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_munera_section; }
	 
		public Munera_sectionContext() { }
		public void copyFrom(Munera_sectionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MuneraSectionContext extends Munera_sectionContext {
		public TerminalNode MUNERA() { return getToken(CodexLatinusParser.MUNERA, 0); }
		public TerminalNode GREATER() { return getToken(CodexLatinusParser.GREATER, 0); }
		public MuneraSectionContext(Munera_sectionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusParserListener ) ((CodexLatinusParserListener)listener).enterMuneraSection(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusParserListener ) ((CodexLatinusParserListener)listener).exitMuneraSection(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusParserVisitor ) return ((CodexLatinusParserVisitor<? extends T>)visitor).visitMuneraSection(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Munera_sectionContext munera_section() throws RecognitionException {
		Munera_sectionContext _localctx = new Munera_sectionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_munera_section);
		try {
			_localctx = new MuneraSectionContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(85);
			match(MUNERA);
			setState(86);
			match(GREATER);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Variable_sectionContext extends ParserRuleContext {
		public Variable_sectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable_section; }
	 
		public Variable_sectionContext() { }
		public void copyFrom(Variable_sectionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class VariablesSectionContext extends Variable_sectionContext {
		public TerminalNode VARIABILES() { return getToken(CodexLatinusParser.VARIABILES, 0); }
		public TerminalNode GREATER() { return getToken(CodexLatinusParser.GREATER, 0); }
		public Variabiles_bodyContext variabiles_body() {
			return getRuleContext(Variabiles_bodyContext.class,0);
		}
		public VariablesSectionContext(Variable_sectionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusParserListener ) ((CodexLatinusParserListener)listener).enterVariablesSection(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusParserListener ) ((CodexLatinusParserListener)listener).exitVariablesSection(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusParserVisitor ) return ((CodexLatinusParserVisitor<? extends T>)visitor).visitVariablesSection(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Variable_sectionContext variable_section() throws RecognitionException {
		Variable_sectionContext _localctx = new Variable_sectionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_variable_section);
		try {
			_localctx = new VariablesSectionContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			match(VARIABILES);
			setState(89);
			match(GREATER);
			setState(90);
			variabiles_body(0);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Variabiles_bodyContext extends ParserRuleContext {
		public DeclarationsContext declarations() {
			return getRuleContext(DeclarationsContext.class,0);
		}
		public Variabiles_bodyContext variabiles_body() {
			return getRuleContext(Variabiles_bodyContext.class,0);
		}
		public Variabiles_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variabiles_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusParserListener ) ((CodexLatinusParserListener)listener).enterVariabiles_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusParserListener ) ((CodexLatinusParserListener)listener).exitVariabiles_body(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusParserVisitor ) return ((CodexLatinusParserVisitor<? extends T>)visitor).visitVariabiles_body(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Variabiles_bodyContext variabiles_body() throws RecognitionException {
		return variabiles_body(0);
	}

	private Variabiles_bodyContext variabiles_body(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Variabiles_bodyContext _localctx = new Variabiles_bodyContext(_ctx, _parentState);
		Variabiles_bodyContext _prevctx = _localctx;
		int _startState = 10;
		enterRecursionRule(_localctx, 10, RULE_variabiles_body, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(93);
			declarations();
			}
			_ctx.stop = _input.LT(-1);
			setState(99);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Variabiles_bodyContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_variabiles_body);
					setState(95);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(96);
					declarations();
					}
					} 
				}
				setState(101);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class DeclarationsContext extends ParserRuleContext {
		public DeclarationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarations; }
	 
		public DeclarationsContext() { }
		public void copyFrom(DeclarationsContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StructSetPropertyContext extends DeclarationsContext {
		public Struct_array_propertyContext struct_array_property() {
			return getRuleContext(Struct_array_propertyContext.class,0);
		}
		public StructSetPropertyContext(DeclarationsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusParserListener ) ((CodexLatinusParserListener)listener).enterStructSetProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusParserListener ) ((CodexLatinusParserListener)listener).exitStructSetProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusParserVisitor ) return ((CodexLatinusParserVisitor<? extends T>)visitor).visitStructSetProperty(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BooleanVariableInstanceContext extends DeclarationsContext {
		public Boolean_declarationContext boolean_declaration() {
			return getRuleContext(Boolean_declarationContext.class,0);
		}
		public BooleanVariableInstanceContext(DeclarationsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusParserListener ) ((CodexLatinusParserListener)listener).enterBooleanVariableInstance(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusParserListener ) ((CodexLatinusParserListener)listener).exitBooleanVariableInstance(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusParserVisitor ) return ((CodexLatinusParserVisitor<? extends T>)visitor).visitBooleanVariableInstance(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NormalArrayInstanceContext extends DeclarationsContext {
		public Normal_arrayContext normal_array() {
			return getRuleContext(Normal_arrayContext.class,0);
		}
		public NormalArrayInstanceContext(DeclarationsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusParserListener ) ((CodexLatinusParserListener)listener).enterNormalArrayInstance(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusParserListener ) ((CodexLatinusParserListener)listener).exitNormalArrayInstance(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusParserVisitor ) return ((CodexLatinusParserVisitor<? extends T>)visitor).visitNormalArrayInstance(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BooleanArrayInstanceContext extends DeclarationsContext {
		public Boolean_arrayContext boolean_array() {
			return getRuleContext(Boolean_arrayContext.class,0);
		}
		public BooleanArrayInstanceContext(DeclarationsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusParserListener ) ((CodexLatinusParserListener)listener).enterBooleanArrayInstance(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusParserListener ) ((CodexLatinusParserListener)listener).exitBooleanArrayInstance(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusParserVisitor ) return ((CodexLatinusParserVisitor<? extends T>)visitor).visitBooleanArrayInstance(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StructDefinitionContext extends DeclarationsContext {
		public Struct_declarationContext struct_declaration() {
			return getRuleContext(Struct_declarationContext.class,0);
		}
		public StructDefinitionContext(DeclarationsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusParserListener ) ((CodexLatinusParserListener)listener).enterStructDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusParserListener ) ((CodexLatinusParserListener)listener).exitStructDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusParserVisitor ) return ((CodexLatinusParserVisitor<? extends T>)visitor).visitStructDefinition(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class VariableUssageContext extends DeclarationsContext {
		public Variable_ussageContext variable_ussage() {
			return getRuleContext(Variable_ussageContext.class,0);
		}
		public VariableUssageContext(DeclarationsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusParserListener ) ((CodexLatinusParserListener)listener).enterVariableUssage(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusParserListener ) ((CodexLatinusParserListener)listener).exitVariableUssage(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusParserVisitor ) return ((CodexLatinusParserVisitor<? extends T>)visitor).visitVariableUssage(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArrayUssageContext extends DeclarationsContext {
		public Array_ussageContext array_ussage() {
			return getRuleContext(Array_ussageContext.class,0);
		}
		public ArrayUssageContext(DeclarationsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusParserListener ) ((CodexLatinusParserListener)listener).enterArrayUssage(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusParserListener ) ((CodexLatinusParserListener)listener).exitArrayUssage(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusParserVisitor ) return ((CodexLatinusParserVisitor<? extends T>)visitor).visitArrayUssage(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class VariableInstanceContext extends DeclarationsContext {
		public Variable_declarationContext variable_declaration() {
			return getRuleContext(Variable_declarationContext.class,0);
		}
		public VariableInstanceContext(DeclarationsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusParserListener ) ((CodexLatinusParserListener)listener).enterVariableInstance(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusParserListener ) ((CodexLatinusParserListener)listener).exitVariableInstance(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusParserVisitor ) return ((CodexLatinusParserVisitor<? extends T>)visitor).visitVariableInstance(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StructVariableInstanceContext extends DeclarationsContext {
		public Struct_instanceContext struct_instance() {
			return getRuleContext(Struct_instanceContext.class,0);
		}
		public StructVariableInstanceContext(DeclarationsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusParserListener ) ((CodexLatinusParserListener)listener).enterStructVariableInstance(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusParserListener ) ((CodexLatinusParserListener)listener).exitStructVariableInstance(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusParserVisitor ) return ((CodexLatinusParserVisitor<? extends T>)visitor).visitStructVariableInstance(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationsContext declarations() throws RecognitionException {
		DeclarationsContext _localctx = new DeclarationsContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_declarations);
		try {
			setState(111);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				_localctx = new VariableInstanceContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(102);
				variable_declaration();
				}
				break;
			case 2:
				_localctx = new VariableUssageContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(103);
				variable_ussage();
				}
				break;
			case 3:
				_localctx = new BooleanVariableInstanceContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(104);
				boolean_declaration();
				}
				break;
			case 4:
				_localctx = new NormalArrayInstanceContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(105);
				normal_array();
				}
				break;
			case 5:
				_localctx = new BooleanArrayInstanceContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(106);
				boolean_array();
				}
				break;
			case 6:
				_localctx = new ArrayUssageContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(107);
				array_ussage();
				}
				break;
			case 7:
				_localctx = new StructDefinitionContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(108);
				struct_declaration();
				}
				break;
			case 8:
				_localctx = new StructSetPropertyContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(109);
				struct_array_property();
				}
				break;
			case 9:
				_localctx = new StructVariableInstanceContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(110);
				struct_instance();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Variable_ussageContext extends ParserRuleContext {
		public Variable_ussageContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable_ussage; }
	 
		public Variable_ussageContext() { }
		public void copyFrom(Variable_ussageContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NormalVariableUsageContext extends Variable_ussageContext {
		public TerminalNode ID() { return getToken(CodexLatinusParser.ID, 0); }
		public TerminalNode EQUAL() { return getToken(CodexLatinusParser.EQUAL, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode DOT_COMMA() { return getToken(CodexLatinusParser.DOT_COMMA, 0); }
		public NormalVariableUsageContext(Variable_ussageContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusParserListener ) ((CodexLatinusParserListener)listener).enterNormalVariableUsage(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusParserListener ) ((CodexLatinusParserListener)listener).exitNormalVariableUsage(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusParserVisitor ) return ((CodexLatinusParserVisitor<? extends T>)visitor).visitNormalVariableUsage(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Variable_ussageContext variable_ussage() throws RecognitionException {
		Variable_ussageContext _localctx = new Variable_ussageContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_variable_ussage);
		try {
			_localctx = new NormalVariableUsageContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(113);
			match(ID);
			setState(114);
			match(EQUAL);
			setState(115);
			expression(0);
			setState(116);
			match(DOT_COMMA);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Array_ussageContext extends ParserRuleContext {
		public Array_ussageContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_ussage; }
	 
		public Array_ussageContext() { }
		public void copyFrom(Array_ussageContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NormalArrayUsageContext extends Array_ussageContext {
		public TerminalNode ID() { return getToken(CodexLatinusParser.ID, 0); }
		public TerminalNode INIT_BRACKET() { return getToken(CodexLatinusParser.INIT_BRACKET, 0); }
		public TerminalNode INT() { return getToken(CodexLatinusParser.INT, 0); }
		public TerminalNode FINAL_BRACKET() { return getToken(CodexLatinusParser.FINAL_BRACKET, 0); }
		public TerminalNode EQUAL() { return getToken(CodexLatinusParser.EQUAL, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode DOT_COMMA() { return getToken(CodexLatinusParser.DOT_COMMA, 0); }
		public NormalArrayUsageContext(Array_ussageContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusParserListener ) ((CodexLatinusParserListener)listener).enterNormalArrayUsage(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusParserListener ) ((CodexLatinusParserListener)listener).exitNormalArrayUsage(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusParserVisitor ) return ((CodexLatinusParserVisitor<? extends T>)visitor).visitNormalArrayUsage(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Array_ussageContext array_ussage() throws RecognitionException {
		Array_ussageContext _localctx = new Array_ussageContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_array_ussage);
		try {
			_localctx = new NormalArrayUsageContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
			match(ID);
			setState(119);
			match(INIT_BRACKET);
			setState(120);
			match(INT);
			setState(121);
			match(FINAL_BRACKET);
			setState(122);
			match(EQUAL);
			setState(123);
			expression(0);
			setState(124);
			match(DOT_COMMA);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Struct_array_propertyContext extends ParserRuleContext {
		public Struct_array_propertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_struct_array_property; }
	 
		public Struct_array_propertyContext() { }
		public void copyFrom(Struct_array_propertyContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StructArrayPropertyContext extends Struct_array_propertyContext {
		public List<TerminalNode> ID() { return getTokens(CodexLatinusParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(CodexLatinusParser.ID, i);
		}
		public TerminalNode DOT() { return getToken(CodexLatinusParser.DOT, 0); }
		public TerminalNode INIT_BRACKET() { return getToken(CodexLatinusParser.INIT_BRACKET, 0); }
		public TerminalNode INT() { return getToken(CodexLatinusParser.INT, 0); }
		public TerminalNode FINAL_BRACKET() { return getToken(CodexLatinusParser.FINAL_BRACKET, 0); }
		public TerminalNode EQUAL() { return getToken(CodexLatinusParser.EQUAL, 0); }
		public Struct_data_listContext struct_data_list() {
			return getRuleContext(Struct_data_listContext.class,0);
		}
		public TerminalNode INIT_BRACE() { return getToken(CodexLatinusParser.INIT_BRACE, 0); }
		public TerminalNode FINAL_BRACE() { return getToken(CodexLatinusParser.FINAL_BRACE, 0); }
		public StructArrayPropertyContext(Struct_array_propertyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusParserListener ) ((CodexLatinusParserListener)listener).enterStructArrayProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusParserListener ) ((CodexLatinusParserListener)listener).exitStructArrayProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusParserVisitor ) return ((CodexLatinusParserVisitor<? extends T>)visitor).visitStructArrayProperty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Struct_array_propertyContext struct_array_property() throws RecognitionException {
		Struct_array_propertyContext _localctx = new Struct_array_propertyContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_struct_array_property);
		try {
			_localctx = new StructArrayPropertyContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(126);
			match(ID);
			setState(127);
			match(DOT);
			setState(128);
			match(ID);
			setState(129);
			match(INIT_BRACKET);
			setState(130);
			match(INT);
			setState(131);
			match(FINAL_BRACKET);
			setState(132);
			match(EQUAL);
			setState(133);
			struct_data_list(0);
			setState(134);
			match(INIT_BRACE);
			setState(135);
			match(FINAL_BRACE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Struct_instanceContext extends ParserRuleContext {
		public Struct_instanceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_struct_instance; }
	 
		public Struct_instanceContext() { }
		public void copyFrom(Struct_instanceContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StructInstanceContext extends Struct_instanceContext {
		public TerminalNode ESTO() { return getToken(CodexLatinusParser.ESTO, 0); }
		public List<TerminalNode> ID() { return getTokens(CodexLatinusParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(CodexLatinusParser.ID, i);
		}
		public TerminalNode TWO_POINTS() { return getToken(CodexLatinusParser.TWO_POINTS, 0); }
		public TerminalNode INIT_BRACE() { return getToken(CodexLatinusParser.INIT_BRACE, 0); }
		public Struct_data_listContext struct_data_list() {
			return getRuleContext(Struct_data_listContext.class,0);
		}
		public TerminalNode FINAL_BRACE() { return getToken(CodexLatinusParser.FINAL_BRACE, 0); }
		public StructInstanceContext(Struct_instanceContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusParserListener ) ((CodexLatinusParserListener)listener).enterStructInstance(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusParserListener ) ((CodexLatinusParserListener)listener).exitStructInstance(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusParserVisitor ) return ((CodexLatinusParserVisitor<? extends T>)visitor).visitStructInstance(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Struct_instanceContext struct_instance() throws RecognitionException {
		Struct_instanceContext _localctx = new Struct_instanceContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_struct_instance);
		try {
			_localctx = new StructInstanceContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(137);
			match(ESTO);
			setState(138);
			match(ID);
			setState(139);
			match(TWO_POINTS);
			setState(140);
			match(ID);
			setState(141);
			match(INIT_BRACE);
			setState(142);
			struct_data_list(0);
			setState(143);
			match(FINAL_BRACE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Struct_data_listContext extends ParserRuleContext {
		public Struct_data_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_struct_data_list; }
	 
		public Struct_data_listContext() { }
		public void copyFrom(Struct_data_listContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StructValueListContext extends Struct_data_listContext {
		public Struct_data_listContext struct_data_list() {
			return getRuleContext(Struct_data_listContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(CodexLatinusParser.COMMA, 0); }
		public Struct_data_valueContext struct_data_value() {
			return getRuleContext(Struct_data_valueContext.class,0);
		}
		public StructValueListContext(Struct_data_listContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusParserListener ) ((CodexLatinusParserListener)listener).enterStructValueList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusParserListener ) ((CodexLatinusParserListener)listener).exitStructValueList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusParserVisitor ) return ((CodexLatinusParserVisitor<? extends T>)visitor).visitStructValueList(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StructSingleValueContext extends Struct_data_listContext {
		public Struct_data_valueContext struct_data_value() {
			return getRuleContext(Struct_data_valueContext.class,0);
		}
		public StructSingleValueContext(Struct_data_listContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusParserListener ) ((CodexLatinusParserListener)listener).enterStructSingleValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusParserListener ) ((CodexLatinusParserListener)listener).exitStructSingleValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusParserVisitor ) return ((CodexLatinusParserVisitor<? extends T>)visitor).visitStructSingleValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Struct_data_listContext struct_data_list() throws RecognitionException {
		return struct_data_list(0);
	}

	private Struct_data_listContext struct_data_list(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Struct_data_listContext _localctx = new Struct_data_listContext(_ctx, _parentState);
		Struct_data_listContext _prevctx = _localctx;
		int _startState = 22;
		enterRecursionRule(_localctx, 22, RULE_struct_data_list, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new StructSingleValueContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(146);
			struct_data_value();
			}
			_ctx.stop = _input.LT(-1);
			setState(153);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new StructValueListContext(new Struct_data_listContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_struct_data_list);
					setState(148);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(149);
					match(COMMA);
					setState(150);
					struct_data_value();
					}
					} 
				}
				setState(155);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Variable_declarationContext extends ParserRuleContext {
		public Variable_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable_declaration; }
	 
		public Variable_declarationContext() { }
		public void copyFrom(Variable_declarationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class VarDeclarationContext extends Variable_declarationContext {
		public TerminalNode ESTO() { return getToken(CodexLatinusParser.ESTO, 0); }
		public TerminalNode ID() { return getToken(CodexLatinusParser.ID, 0); }
		public TerminalNode TWO_POINTS() { return getToken(CodexLatinusParser.TWO_POINTS, 0); }
		public Variable_typeContext variable_type() {
			return getRuleContext(Variable_typeContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode DOT_COMMA() { return getToken(CodexLatinusParser.DOT_COMMA, 0); }
		public VarDeclarationContext(Variable_declarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusParserListener ) ((CodexLatinusParserListener)listener).enterVarDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusParserListener ) ((CodexLatinusParserListener)listener).exitVarDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusParserVisitor ) return ((CodexLatinusParserVisitor<? extends T>)visitor).visitVarDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Variable_declarationContext variable_declaration() throws RecognitionException {
		Variable_declarationContext _localctx = new Variable_declarationContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_variable_declaration);
		try {
			_localctx = new VarDeclarationContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(156);
			match(ESTO);
			setState(157);
			match(ID);
			setState(158);
			match(TWO_POINTS);
			setState(159);
			variable_type();
			setState(160);
			expression(0);
			setState(161);
			match(DOT_COMMA);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Boolean_declarationContext extends ParserRuleContext {
		public Boolean_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolean_declaration; }
	 
		public Boolean_declarationContext() { }
		public void copyFrom(Boolean_declarationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BoolDeclarationContext extends Boolean_declarationContext {
		public TerminalNode ESTO() { return getToken(CodexLatinusParser.ESTO, 0); }
		public TerminalNode ID() { return getToken(CodexLatinusParser.ID, 0); }
		public TerminalNode TWO_POINTS() { return getToken(CodexLatinusParser.TWO_POINTS, 0); }
		public Boolean_valuesContext boolean_values() {
			return getRuleContext(Boolean_valuesContext.class,0);
		}
		public TerminalNode DOT_COMMA() { return getToken(CodexLatinusParser.DOT_COMMA, 0); }
		public BoolDeclarationContext(Boolean_declarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusParserListener ) ((CodexLatinusParserListener)listener).enterBoolDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusParserListener ) ((CodexLatinusParserListener)listener).exitBoolDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusParserVisitor ) return ((CodexLatinusParserVisitor<? extends T>)visitor).visitBoolDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Boolean_declarationContext boolean_declaration() throws RecognitionException {
		Boolean_declarationContext _localctx = new Boolean_declarationContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_boolean_declaration);
		try {
			_localctx = new BoolDeclarationContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(163);
			match(ESTO);
			setState(164);
			match(ID);
			setState(165);
			match(TWO_POINTS);
			setState(166);
			boolean_values();
			setState(167);
			match(DOT_COMMA);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Normal_arrayContext extends ParserRuleContext {
		public Normal_arrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_normal_array; }
	 
		public Normal_arrayContext() { }
		public void copyFrom(Normal_arrayContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BooleanArrayDeclarationContext extends Normal_arrayContext {
		public Boolean_arrayContext boolean_array() {
			return getRuleContext(Boolean_arrayContext.class,0);
		}
		public BooleanArrayDeclarationContext(Normal_arrayContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusParserListener ) ((CodexLatinusParserListener)listener).enterBooleanArrayDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusParserListener ) ((CodexLatinusParserListener)listener).exitBooleanArrayDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusParserVisitor ) return ((CodexLatinusParserVisitor<? extends T>)visitor).visitBooleanArrayDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NormalArrayDeclarationContext extends Normal_arrayContext {
		public TerminalNode SERIES() { return getToken(CodexLatinusParser.SERIES, 0); }
		public TerminalNode ID() { return getToken(CodexLatinusParser.ID, 0); }
		public TerminalNode INIT_PARENT() { return getToken(CodexLatinusParser.INIT_PARENT, 0); }
		public TerminalNode INT() { return getToken(CodexLatinusParser.INT, 0); }
		public TerminalNode FINAL_PARENT() { return getToken(CodexLatinusParser.FINAL_PARENT, 0); }
		public TerminalNode TWO_POINTS() { return getToken(CodexLatinusParser.TWO_POINTS, 0); }
		public Variable_typeContext variable_type() {
			return getRuleContext(Variable_typeContext.class,0);
		}
		public Array_initializationContext array_initialization() {
			return getRuleContext(Array_initializationContext.class,0);
		}
		public TerminalNode DOT_COMMA() { return getToken(CodexLatinusParser.DOT_COMMA, 0); }
		public NormalArrayDeclarationContext(Normal_arrayContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusParserListener ) ((CodexLatinusParserListener)listener).enterNormalArrayDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusParserListener ) ((CodexLatinusParserListener)listener).exitNormalArrayDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusParserVisitor ) return ((CodexLatinusParserVisitor<? extends T>)visitor).visitNormalArrayDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Normal_arrayContext normal_array() throws RecognitionException {
		Normal_arrayContext _localctx = new Normal_arrayContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_normal_array);
		try {
			setState(180);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				_localctx = new NormalArrayDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(169);
				match(SERIES);
				setState(170);
				match(ID);
				setState(171);
				match(INIT_PARENT);
				setState(172);
				match(INT);
				setState(173);
				match(FINAL_PARENT);
				setState(174);
				match(TWO_POINTS);
				setState(175);
				variable_type();
				setState(176);
				array_initialization();
				setState(177);
				match(DOT_COMMA);
				}
				break;
			case 2:
				_localctx = new BooleanArrayDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(179);
				boolean_array();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Boolean_arrayContext extends ParserRuleContext {
		public Boolean_arrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolean_array; }
	 
		public Boolean_arrayContext() { }
		public void copyFrom(Boolean_arrayContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BooleanArrayBaseContext extends Boolean_arrayContext {
		public TerminalNode SERIES() { return getToken(CodexLatinusParser.SERIES, 0); }
		public TerminalNode ID() { return getToken(CodexLatinusParser.ID, 0); }
		public TerminalNode INIT_PARENT() { return getToken(CodexLatinusParser.INIT_PARENT, 0); }
		public TerminalNode INT() { return getToken(CodexLatinusParser.INT, 0); }
		public TerminalNode FINAL_PARENT() { return getToken(CodexLatinusParser.FINAL_PARENT, 0); }
		public TerminalNode TWO_POINTS() { return getToken(CodexLatinusParser.TWO_POINTS, 0); }
		public Array_initializationContext array_initialization() {
			return getRuleContext(Array_initializationContext.class,0);
		}
		public TerminalNode DOT_COMMA() { return getToken(CodexLatinusParser.DOT_COMMA, 0); }
		public BooleanArrayBaseContext(Boolean_arrayContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusParserListener ) ((CodexLatinusParserListener)listener).enterBooleanArrayBase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusParserListener ) ((CodexLatinusParserListener)listener).exitBooleanArrayBase(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusParserVisitor ) return ((CodexLatinusParserVisitor<? extends T>)visitor).visitBooleanArrayBase(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Boolean_arrayContext boolean_array() throws RecognitionException {
		Boolean_arrayContext _localctx = new Boolean_arrayContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_boolean_array);
		try {
			_localctx = new BooleanArrayBaseContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(182);
			match(SERIES);
			setState(183);
			match(ID);
			setState(184);
			match(INIT_PARENT);
			setState(185);
			match(INT);
			setState(186);
			match(FINAL_PARENT);
			setState(187);
			match(TWO_POINTS);
			setState(188);
			array_initialization();
			setState(189);
			match(DOT_COMMA);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Array_initializationContext extends ParserRuleContext {
		public Array_initializationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_initialization; }
	 
		public Array_initializationContext() { }
		public void copyFrom(Array_initializationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArrayInitWithValuesContext extends Array_initializationContext {
		public TerminalNode INIT_BRACE() { return getToken(CodexLatinusParser.INIT_BRACE, 0); }
		public Values_array_listContext values_array_list() {
			return getRuleContext(Values_array_listContext.class,0);
		}
		public TerminalNode FINAL_BRACE() { return getToken(CodexLatinusParser.FINAL_BRACE, 0); }
		public ArrayInitWithValuesContext(Array_initializationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusParserListener ) ((CodexLatinusParserListener)listener).enterArrayInitWithValues(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusParserListener ) ((CodexLatinusParserListener)listener).exitArrayInitWithValues(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusParserVisitor ) return ((CodexLatinusParserVisitor<? extends T>)visitor).visitArrayInitWithValues(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArrayInitEmptyContext extends Array_initializationContext {
		public ArrayInitEmptyContext(Array_initializationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusParserListener ) ((CodexLatinusParserListener)listener).enterArrayInitEmpty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusParserListener ) ((CodexLatinusParserListener)listener).exitArrayInitEmpty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusParserVisitor ) return ((CodexLatinusParserVisitor<? extends T>)visitor).visitArrayInitEmpty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Array_initializationContext array_initialization() throws RecognitionException {
		Array_initializationContext _localctx = new Array_initializationContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_array_initialization);
		try {
			setState(196);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INIT_BRACE:
				_localctx = new ArrayInitWithValuesContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(191);
				match(INIT_BRACE);
				setState(192);
				values_array_list(0);
				setState(193);
				match(FINAL_BRACE);
				}
				break;
			case DOT_COMMA:
				_localctx = new ArrayInitEmptyContext(_localctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Values_array_listContext extends ParserRuleContext {
		public Values_array_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_values_array_list; }
	 
		public Values_array_listContext() { }
		public void copyFrom(Values_array_listContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArraySingleValueContext extends Values_array_listContext {
		public Array_valueContext array_value() {
			return getRuleContext(Array_valueContext.class,0);
		}
		public ArraySingleValueContext(Values_array_listContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusParserListener ) ((CodexLatinusParserListener)listener).enterArraySingleValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusParserListener ) ((CodexLatinusParserListener)listener).exitArraySingleValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusParserVisitor ) return ((CodexLatinusParserVisitor<? extends T>)visitor).visitArraySingleValue(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArrayValueListContext extends Values_array_listContext {
		public Values_array_listContext values_array_list() {
			return getRuleContext(Values_array_listContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(CodexLatinusParser.COMMA, 0); }
		public Array_valueContext array_value() {
			return getRuleContext(Array_valueContext.class,0);
		}
		public ArrayValueListContext(Values_array_listContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusParserListener ) ((CodexLatinusParserListener)listener).enterArrayValueList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusParserListener ) ((CodexLatinusParserListener)listener).exitArrayValueList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusParserVisitor ) return ((CodexLatinusParserVisitor<? extends T>)visitor).visitArrayValueList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Values_array_listContext values_array_list() throws RecognitionException {
		return values_array_list(0);
	}

	private Values_array_listContext values_array_list(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Values_array_listContext _localctx = new Values_array_listContext(_ctx, _parentState);
		Values_array_listContext _prevctx = _localctx;
		int _startState = 34;
		enterRecursionRule(_localctx, 34, RULE_values_array_list, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new ArraySingleValueContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(199);
			array_value();
			}
			_ctx.stop = _input.LT(-1);
			setState(206);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ArrayValueListContext(new Values_array_listContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_values_array_list);
					setState(201);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(202);
					match(COMMA);
					setState(203);
					array_value();
					}
					} 
				}
				setState(208);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Array_valueContext extends ParserRuleContext {
		public Array_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_value; }
	 
		public Array_valueContext() { }
		public void copyFrom(Array_valueContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArrayStructValContext extends Array_valueContext {
		public Struct_valuesContext struct_values() {
			return getRuleContext(Struct_valuesContext.class,0);
		}
		public ArrayStructValContext(Array_valueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusParserListener ) ((CodexLatinusParserListener)listener).enterArrayStructVal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusParserListener ) ((CodexLatinusParserListener)listener).exitArrayStructVal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusParserVisitor ) return ((CodexLatinusParserVisitor<? extends T>)visitor).visitArrayStructVal(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArrayNormalValContext extends Array_valueContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ArrayNormalValContext(Array_valueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusParserListener ) ((CodexLatinusParserListener)listener).enterArrayNormalVal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusParserListener ) ((CodexLatinusParserListener)listener).exitArrayNormalVal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusParserVisitor ) return ((CodexLatinusParserVisitor<? extends T>)visitor).visitArrayNormalVal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Array_valueContext array_value() throws RecognitionException {
		Array_valueContext _localctx = new Array_valueContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_array_value);
		try {
			setState(211);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INIT_BRACE:
				_localctx = new ArrayStructValContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(209);
				struct_values();
				}
				break;
			case VERUM:
			case FALSUS:
			case INIT_PARENT:
			case MINUS:
			case ID:
			case INT:
			case DECIMAL:
			case STRING:
			case CHAR:
				_localctx = new ArrayNormalValContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(210);
				expression(0);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Struct_declarationContext extends ParserRuleContext {
		public Struct_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_struct_declaration; }
	 
		public Struct_declarationContext() { }
		public void copyFrom(Struct_declarationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StructDeclarationContext extends Struct_declarationContext {
		public TerminalNode STRUCTURE() { return getToken(CodexLatinusParser.STRUCTURE, 0); }
		public TerminalNode ID() { return getToken(CodexLatinusParser.ID, 0); }
		public TerminalNode INIT_BRACE() { return getToken(CodexLatinusParser.INIT_BRACE, 0); }
		public Struct_bodyContext struct_body() {
			return getRuleContext(Struct_bodyContext.class,0);
		}
		public TerminalNode FINAL_BRACE() { return getToken(CodexLatinusParser.FINAL_BRACE, 0); }
		public TerminalNode FINIS() { return getToken(CodexLatinusParser.FINIS, 0); }
		public TerminalNode DOT_COMMA() { return getToken(CodexLatinusParser.DOT_COMMA, 0); }
		public StructDeclarationContext(Struct_declarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusParserListener ) ((CodexLatinusParserListener)listener).enterStructDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusParserListener ) ((CodexLatinusParserListener)listener).exitStructDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusParserVisitor ) return ((CodexLatinusParserVisitor<? extends T>)visitor).visitStructDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Struct_declarationContext struct_declaration() throws RecognitionException {
		Struct_declarationContext _localctx = new Struct_declarationContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_struct_declaration);
		try {
			_localctx = new StructDeclarationContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(213);
			match(STRUCTURE);
			setState(214);
			match(ID);
			setState(215);
			match(INIT_BRACE);
			setState(216);
			struct_body();
			setState(217);
			match(FINAL_BRACE);
			setState(218);
			match(FINIS);
			setState(219);
			match(DOT_COMMA);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Struct_bodyContext extends ParserRuleContext {
		public Struct_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_struct_body; }
	 
		public Struct_bodyContext() { }
		public void copyFrom(Struct_bodyContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StructSeparatedBodyContext extends Struct_bodyContext {
		public Struct_normal_bodyContext struct_normal_body() {
			return getRuleContext(Struct_normal_bodyContext.class,0);
		}
		public StructSeparatedBodyContext(Struct_bodyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusParserListener ) ((CodexLatinusParserListener)listener).enterStructSeparatedBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusParserListener ) ((CodexLatinusParserListener)listener).exitStructSeparatedBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusParserVisitor ) return ((CodexLatinusParserVisitor<? extends T>)visitor).visitStructSeparatedBody(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StructCommaBodyContext extends Struct_bodyContext {
		public Struct_comma_bodyContext struct_comma_body() {
			return getRuleContext(Struct_comma_bodyContext.class,0);
		}
		public StructCommaBodyContext(Struct_bodyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusParserListener ) ((CodexLatinusParserListener)listener).enterStructCommaBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusParserListener ) ((CodexLatinusParserListener)listener).exitStructCommaBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusParserVisitor ) return ((CodexLatinusParserVisitor<? extends T>)visitor).visitStructCommaBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Struct_bodyContext struct_body() throws RecognitionException {
		Struct_bodyContext _localctx = new Struct_bodyContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_struct_body);
		try {
			setState(223);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				_localctx = new StructSeparatedBodyContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(221);
				struct_normal_body(0);
				}
				break;
			case 2:
				_localctx = new StructCommaBodyContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(222);
				struct_comma_body(0);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Struct_normal_bodyContext extends ParserRuleContext {
		public Struct_normal_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_struct_normal_body; }
	 
		public Struct_normal_bodyContext() { }
		public void copyFrom(Struct_normal_bodyContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StructNormalBodyListContext extends Struct_normal_bodyContext {
		public Struct_normal_bodyContext struct_normal_body() {
			return getRuleContext(Struct_normal_bodyContext.class,0);
		}
		public Struct_attributeContext struct_attribute() {
			return getRuleContext(Struct_attributeContext.class,0);
		}
		public TerminalNode DOT_COMMA() { return getToken(CodexLatinusParser.DOT_COMMA, 0); }
		public StructNormalBodyListContext(Struct_normal_bodyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusParserListener ) ((CodexLatinusParserListener)listener).enterStructNormalBodyList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusParserListener ) ((CodexLatinusParserListener)listener).exitStructNormalBodyList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusParserVisitor ) return ((CodexLatinusParserVisitor<? extends T>)visitor).visitStructNormalBodyList(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StructNormalBodySingleContext extends Struct_normal_bodyContext {
		public Struct_attributeContext struct_attribute() {
			return getRuleContext(Struct_attributeContext.class,0);
		}
		public TerminalNode DOT_COMMA() { return getToken(CodexLatinusParser.DOT_COMMA, 0); }
		public StructNormalBodySingleContext(Struct_normal_bodyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusParserListener ) ((CodexLatinusParserListener)listener).enterStructNormalBodySingle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusParserListener ) ((CodexLatinusParserListener)listener).exitStructNormalBodySingle(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusParserVisitor ) return ((CodexLatinusParserVisitor<? extends T>)visitor).visitStructNormalBodySingle(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Struct_normal_bodyContext struct_normal_body() throws RecognitionException {
		return struct_normal_body(0);
	}

	private Struct_normal_bodyContext struct_normal_body(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Struct_normal_bodyContext _localctx = new Struct_normal_bodyContext(_ctx, _parentState);
		Struct_normal_bodyContext _prevctx = _localctx;
		int _startState = 42;
		enterRecursionRule(_localctx, 42, RULE_struct_normal_body, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new StructNormalBodySingleContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(226);
			struct_attribute();
			setState(227);
			match(DOT_COMMA);
			}
			_ctx.stop = _input.LT(-1);
			setState(235);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new StructNormalBodyListContext(new Struct_normal_bodyContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_struct_normal_body);
					setState(229);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(230);
					struct_attribute();
					setState(231);
					match(DOT_COMMA);
					}
					} 
				}
				setState(237);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Struct_comma_bodyContext extends ParserRuleContext {
		public Struct_comma_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_struct_comma_body; }
	 
		public Struct_comma_bodyContext() { }
		public void copyFrom(Struct_comma_bodyContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StructCommaBodySingleContext extends Struct_comma_bodyContext {
		public Struct_attributeContext struct_attribute() {
			return getRuleContext(Struct_attributeContext.class,0);
		}
		public StructCommaBodySingleContext(Struct_comma_bodyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusParserListener ) ((CodexLatinusParserListener)listener).enterStructCommaBodySingle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusParserListener ) ((CodexLatinusParserListener)listener).exitStructCommaBodySingle(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusParserVisitor ) return ((CodexLatinusParserVisitor<? extends T>)visitor).visitStructCommaBodySingle(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StructCommaBodyListContext extends Struct_comma_bodyContext {
		public Struct_comma_bodyContext struct_comma_body() {
			return getRuleContext(Struct_comma_bodyContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(CodexLatinusParser.COMMA, 0); }
		public Struct_attributeContext struct_attribute() {
			return getRuleContext(Struct_attributeContext.class,0);
		}
		public StructCommaBodyListContext(Struct_comma_bodyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusParserListener ) ((CodexLatinusParserListener)listener).enterStructCommaBodyList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusParserListener ) ((CodexLatinusParserListener)listener).exitStructCommaBodyList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusParserVisitor ) return ((CodexLatinusParserVisitor<? extends T>)visitor).visitStructCommaBodyList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Struct_comma_bodyContext struct_comma_body() throws RecognitionException {
		return struct_comma_body(0);
	}

	private Struct_comma_bodyContext struct_comma_body(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Struct_comma_bodyContext _localctx = new Struct_comma_bodyContext(_ctx, _parentState);
		Struct_comma_bodyContext _prevctx = _localctx;
		int _startState = 44;
		enterRecursionRule(_localctx, 44, RULE_struct_comma_body, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new StructCommaBodySingleContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(239);
			struct_attribute();
			}
			_ctx.stop = _input.LT(-1);
			setState(246);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new StructCommaBodyListContext(new Struct_comma_bodyContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_struct_comma_body);
					setState(241);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(242);
					match(COMMA);
					setState(243);
					struct_attribute();
					}
					} 
				}
				setState(248);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Struct_attributeContext extends ParserRuleContext {
		public Struct_attributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_struct_attribute; }
	 
		public Struct_attributeContext() { }
		public void copyFrom(Struct_attributeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BooleanVariableStructContext extends Struct_attributeContext {
		public Boolean_variable_without_valueContext boolean_variable_without_value() {
			return getRuleContext(Boolean_variable_without_valueContext.class,0);
		}
		public BooleanVariableStructContext(Struct_attributeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusParserListener ) ((CodexLatinusParserListener)listener).enterBooleanVariableStruct(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusParserListener ) ((CodexLatinusParserListener)listener).exitBooleanVariableStruct(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusParserVisitor ) return ((CodexLatinusParserVisitor<? extends T>)visitor).visitBooleanVariableStruct(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArrayVariableStructContext extends Struct_attributeContext {
		public Array_variable_structContext array_variable_struct() {
			return getRuleContext(Array_variable_structContext.class,0);
		}
		public ArrayVariableStructContext(Struct_attributeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusParserListener ) ((CodexLatinusParserListener)listener).enterArrayVariableStruct(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusParserListener ) ((CodexLatinusParserListener)listener).exitArrayVariableStruct(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusParserVisitor ) return ((CodexLatinusParserVisitor<? extends T>)visitor).visitArrayVariableStruct(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NormalVariableStructContext extends Struct_attributeContext {
		public Variable_without_valueContext variable_without_value() {
			return getRuleContext(Variable_without_valueContext.class,0);
		}
		public NormalVariableStructContext(Struct_attributeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusParserListener ) ((CodexLatinusParserListener)listener).enterNormalVariableStruct(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusParserListener ) ((CodexLatinusParserListener)listener).exitNormalVariableStruct(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusParserVisitor ) return ((CodexLatinusParserVisitor<? extends T>)visitor).visitNormalVariableStruct(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Struct_attributeContext struct_attribute() throws RecognitionException {
		Struct_attributeContext _localctx = new Struct_attributeContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_struct_attribute);
		try {
			setState(252);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				_localctx = new NormalVariableStructContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(249);
				variable_without_value();
				}
				break;
			case 2:
				_localctx = new BooleanVariableStructContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(250);
				boolean_variable_without_value();
				}
				break;
			case 3:
				_localctx = new ArrayVariableStructContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(251);
				array_variable_struct();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Variable_without_valueContext extends ParserRuleContext {
		public Variable_without_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable_without_value; }
	 
		public Variable_without_valueContext() { }
		public void copyFrom(Variable_without_valueContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class InternalStructNormalVariableContext extends Variable_without_valueContext {
		public TerminalNode ESTO() { return getToken(CodexLatinusParser.ESTO, 0); }
		public TerminalNode ID() { return getToken(CodexLatinusParser.ID, 0); }
		public TerminalNode TWO_POINTS() { return getToken(CodexLatinusParser.TWO_POINTS, 0); }
		public Variable_typeContext variable_type() {
			return getRuleContext(Variable_typeContext.class,0);
		}
		public InternalStructNormalVariableContext(Variable_without_valueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusParserListener ) ((CodexLatinusParserListener)listener).enterInternalStructNormalVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusParserListener ) ((CodexLatinusParserListener)listener).exitInternalStructNormalVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusParserVisitor ) return ((CodexLatinusParserVisitor<? extends T>)visitor).visitInternalStructNormalVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Variable_without_valueContext variable_without_value() throws RecognitionException {
		Variable_without_valueContext _localctx = new Variable_without_valueContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_variable_without_value);
		try {
			_localctx = new InternalStructNormalVariableContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(254);
			match(ESTO);
			setState(255);
			match(ID);
			setState(256);
			match(TWO_POINTS);
			setState(257);
			variable_type();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Boolean_variable_without_valueContext extends ParserRuleContext {
		public Boolean_variable_without_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolean_variable_without_value; }
	 
		public Boolean_variable_without_valueContext() { }
		public void copyFrom(Boolean_variable_without_valueContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class InternalStructBoolVariableContext extends Boolean_variable_without_valueContext {
		public TerminalNode ESTO() { return getToken(CodexLatinusParser.ESTO, 0); }
		public TerminalNode ID() { return getToken(CodexLatinusParser.ID, 0); }
		public TerminalNode TWO_POINTS() { return getToken(CodexLatinusParser.TWO_POINTS, 0); }
		public Boolean_valuesContext boolean_values() {
			return getRuleContext(Boolean_valuesContext.class,0);
		}
		public InternalStructBoolVariableContext(Boolean_variable_without_valueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusParserListener ) ((CodexLatinusParserListener)listener).enterInternalStructBoolVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusParserListener ) ((CodexLatinusParserListener)listener).exitInternalStructBoolVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusParserVisitor ) return ((CodexLatinusParserVisitor<? extends T>)visitor).visitInternalStructBoolVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Boolean_variable_without_valueContext boolean_variable_without_value() throws RecognitionException {
		Boolean_variable_without_valueContext _localctx = new Boolean_variable_without_valueContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_boolean_variable_without_value);
		try {
			_localctx = new InternalStructBoolVariableContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(259);
			match(ESTO);
			setState(260);
			match(ID);
			setState(261);
			match(TWO_POINTS);
			setState(262);
			boolean_values();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Array_variable_structContext extends ParserRuleContext {
		public Array_variable_structContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_variable_struct; }
	 
		public Array_variable_structContext() { }
		public void copyFrom(Array_variable_structContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class InternalStructArrayContext extends Array_variable_structContext {
		public TerminalNode SERIES() { return getToken(CodexLatinusParser.SERIES, 0); }
		public List<TerminalNode> ID() { return getTokens(CodexLatinusParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(CodexLatinusParser.ID, i);
		}
		public TerminalNode TWO_POINTS() { return getToken(CodexLatinusParser.TWO_POINTS, 0); }
		public InternalStructArrayContext(Array_variable_structContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusParserListener ) ((CodexLatinusParserListener)listener).enterInternalStructArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusParserListener ) ((CodexLatinusParserListener)listener).exitInternalStructArray(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusParserVisitor ) return ((CodexLatinusParserVisitor<? extends T>)visitor).visitInternalStructArray(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Array_variable_structContext array_variable_struct() throws RecognitionException {
		Array_variable_structContext _localctx = new Array_variable_structContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_array_variable_struct);
		try {
			_localctx = new InternalStructArrayContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(264);
			match(SERIES);
			setState(265);
			match(ID);
			setState(266);
			match(TWO_POINTS);
			setState(267);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Struct_data_valueContext extends ParserRuleContext {
		public Struct_data_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_struct_data_value; }
	 
		public Struct_data_valueContext() { }
		public void copyFrom(Struct_data_valueContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StructDeclarationValueContext extends Struct_data_valueContext {
		public TerminalNode ID() { return getToken(CodexLatinusParser.ID, 0); }
		public TerminalNode TWO_POINTS() { return getToken(CodexLatinusParser.TWO_POINTS, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StructDeclarationValueContext(Struct_data_valueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusParserListener ) ((CodexLatinusParserListener)listener).enterStructDeclarationValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusParserListener ) ((CodexLatinusParserListener)listener).exitStructDeclarationValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusParserVisitor ) return ((CodexLatinusParserVisitor<? extends T>)visitor).visitStructDeclarationValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Struct_data_valueContext struct_data_value() throws RecognitionException {
		Struct_data_valueContext _localctx = new Struct_data_valueContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_struct_data_value);
		try {
			_localctx = new StructDeclarationValueContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(269);
			match(ID);
			setState(270);
			match(TWO_POINTS);
			setState(271);
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

	@SuppressWarnings("CheckReturnValue")
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
	@SuppressWarnings("CheckReturnValue")
	public static class DivideContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode DIVIDE() { return getToken(CodexLatinusParser.DIVIDE, 0); }
		public DivideContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusParserListener ) ((CodexLatinusParserListener)listener).enterDivide(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusParserListener ) ((CodexLatinusParserListener)listener).exitDivide(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusParserVisitor ) return ((CodexLatinusParserVisitor<? extends T>)visitor).visitDivide(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MultiplicationContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode MULTIPLICATION() { return getToken(CodexLatinusParser.MULTIPLICATION, 0); }
		public MultiplicationContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusParserListener ) ((CodexLatinusParserListener)listener).enterMultiplication(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusParserListener ) ((CodexLatinusParserListener)listener).exitMultiplication(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusParserVisitor ) return ((CodexLatinusParserVisitor<? extends T>)visitor).visitMultiplication(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ReducedValueContext extends ExpressionContext {
		public Normal_valuesContext normal_values() {
			return getRuleContext(Normal_valuesContext.class,0);
		}
		public ReducedValueContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusParserListener ) ((CodexLatinusParserListener)listener).enterReducedValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusParserListener ) ((CodexLatinusParserListener)listener).exitReducedValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusParserVisitor ) return ((CodexLatinusParserVisitor<? extends T>)visitor).visitReducedValue(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ParentsContext extends ExpressionContext {
		public TerminalNode INIT_PARENT() { return getToken(CodexLatinusParser.INIT_PARENT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode FINAL_PARENT() { return getToken(CodexLatinusParser.FINAL_PARENT, 0); }
		public ParentsContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusParserListener ) ((CodexLatinusParserListener)listener).enterParents(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusParserListener ) ((CodexLatinusParserListener)listener).exitParents(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusParserVisitor ) return ((CodexLatinusParserVisitor<? extends T>)visitor).visitParents(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NegateContext extends ExpressionContext {
		public TerminalNode MINUS() { return getToken(CodexLatinusParser.MINUS, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public NegateContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusParserListener ) ((CodexLatinusParserListener)listener).enterNegate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusParserListener ) ((CodexLatinusParserListener)listener).exitNegate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusParserVisitor ) return ((CodexLatinusParserVisitor<? extends T>)visitor).visitNegate(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PlusContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode PLUS() { return getToken(CodexLatinusParser.PLUS, 0); }
		public PlusContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusParserListener ) ((CodexLatinusParserListener)listener).enterPlus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusParserListener ) ((CodexLatinusParserListener)listener).exitPlus(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusParserVisitor ) return ((CodexLatinusParserVisitor<? extends T>)visitor).visitPlus(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MinusContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode MINUS() { return getToken(CodexLatinusParser.MINUS, 0); }
		public MinusContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusParserListener ) ((CodexLatinusParserListener)listener).enterMinus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusParserListener ) ((CodexLatinusParserListener)listener).exitMinus(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusParserVisitor ) return ((CodexLatinusParserVisitor<? extends T>)visitor).visitMinus(this);
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
		int _startState = 56;
		enterRecursionRule(_localctx, 56, RULE_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(281);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MINUS:
				{
				_localctx = new NegateContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(274);
				match(MINUS);
				setState(275);
				expression(7);
				}
				break;
			case VERUM:
			case FALSUS:
			case ID:
			case INT:
			case DECIMAL:
			case STRING:
			case CHAR:
				{
				_localctx = new ReducedValueContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(276);
				normal_values();
				}
				break;
			case INIT_PARENT:
				{
				_localctx = new ParentsContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(277);
				match(INIT_PARENT);
				setState(278);
				expression(0);
				setState(279);
				match(FINAL_PARENT);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(297);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(295);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
					case 1:
						{
						_localctx = new MultiplicationContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(283);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(284);
						match(MULTIPLICATION);
						setState(285);
						expression(7);
						}
						break;
					case 2:
						{
						_localctx = new DivideContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(286);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(287);
						match(DIVIDE);
						setState(288);
						expression(6);
						}
						break;
					case 3:
						{
						_localctx = new PlusContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(289);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(290);
						match(PLUS);
						setState(291);
						expression(5);
						}
						break;
					case 4:
						{
						_localctx = new MinusContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(292);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(293);
						match(MINUS);
						setState(294);
						expression(4);
						}
						break;
					}
					} 
				}
				setState(299);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Variable_typeContext extends ParserRuleContext {
		public Variable_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable_type; }
	 
		public Variable_typeContext() { }
		public void copyFrom(Variable_typeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TypeCharContext extends Variable_typeContext {
		public TerminalNode LITTERA() { return getToken(CodexLatinusParser.LITTERA, 0); }
		public TypeCharContext(Variable_typeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusParserListener ) ((CodexLatinusParserListener)listener).enterTypeChar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusParserListener ) ((CodexLatinusParserListener)listener).exitTypeChar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusParserVisitor ) return ((CodexLatinusParserVisitor<? extends T>)visitor).visitTypeChar(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TypeDecimalContext extends Variable_typeContext {
		public TerminalNode DECIMALIS() { return getToken(CodexLatinusParser.DECIMALIS, 0); }
		public TypeDecimalContext(Variable_typeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusParserListener ) ((CodexLatinusParserListener)listener).enterTypeDecimal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusParserListener ) ((CodexLatinusParserListener)listener).exitTypeDecimal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusParserVisitor ) return ((CodexLatinusParserVisitor<? extends T>)visitor).visitTypeDecimal(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TypeCustomIdContext extends Variable_typeContext {
		public TerminalNode ID() { return getToken(CodexLatinusParser.ID, 0); }
		public TypeCustomIdContext(Variable_typeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusParserListener ) ((CodexLatinusParserListener)listener).enterTypeCustomId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusParserListener ) ((CodexLatinusParserListener)listener).exitTypeCustomId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusParserVisitor ) return ((CodexLatinusParserVisitor<? extends T>)visitor).visitTypeCustomId(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TypeIntContext extends Variable_typeContext {
		public TerminalNode NUMERUS() { return getToken(CodexLatinusParser.NUMERUS, 0); }
		public TypeIntContext(Variable_typeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusParserListener ) ((CodexLatinusParserListener)listener).enterTypeInt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusParserListener ) ((CodexLatinusParserListener)listener).exitTypeInt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusParserVisitor ) return ((CodexLatinusParserVisitor<? extends T>)visitor).visitTypeInt(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TypeTextContext extends Variable_typeContext {
		public TerminalNode TEXTUM() { return getToken(CodexLatinusParser.TEXTUM, 0); }
		public TypeTextContext(Variable_typeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusParserListener ) ((CodexLatinusParserListener)listener).enterTypeText(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusParserListener ) ((CodexLatinusParserListener)listener).exitTypeText(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusParserVisitor ) return ((CodexLatinusParserVisitor<? extends T>)visitor).visitTypeText(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Variable_typeContext variable_type() throws RecognitionException {
		Variable_typeContext _localctx = new Variable_typeContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_variable_type);
		try {
			setState(305);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TEXTUM:
				_localctx = new TypeTextContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(300);
				match(TEXTUM);
				}
				break;
			case NUMERUS:
				_localctx = new TypeIntContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(301);
				match(NUMERUS);
				}
				break;
			case DECIMALIS:
				_localctx = new TypeDecimalContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(302);
				match(DECIMALIS);
				}
				break;
			case LITTERA:
				_localctx = new TypeCharContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(303);
				match(LITTERA);
				}
				break;
			case ID:
				_localctx = new TypeCustomIdContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(304);
				match(ID);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Array_callContext extends ParserRuleContext {
		public Array_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_call; }
	 
		public Array_callContext() { }
		public void copyFrom(Array_callContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArrayCallContext extends Array_callContext {
		public TerminalNode ID() { return getToken(CodexLatinusParser.ID, 0); }
		public TerminalNode INIT_BRACKET() { return getToken(CodexLatinusParser.INIT_BRACKET, 0); }
		public TerminalNode INT() { return getToken(CodexLatinusParser.INT, 0); }
		public TerminalNode FINAL_BRACKET() { return getToken(CodexLatinusParser.FINAL_BRACKET, 0); }
		public ArrayCallContext(Array_callContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusParserListener ) ((CodexLatinusParserListener)listener).enterArrayCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusParserListener ) ((CodexLatinusParserListener)listener).exitArrayCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusParserVisitor ) return ((CodexLatinusParserVisitor<? extends T>)visitor).visitArrayCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Array_callContext array_call() throws RecognitionException {
		Array_callContext _localctx = new Array_callContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_array_call);
		try {
			_localctx = new ArrayCallContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(307);
			match(ID);
			setState(308);
			match(INIT_BRACKET);
			setState(309);
			match(INT);
			setState(310);
			match(FINAL_BRACKET);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Struct_valuesContext extends ParserRuleContext {
		public Struct_valuesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_struct_values; }
	 
		public Struct_valuesContext() { }
		public void copyFrom(Struct_valuesContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StructValueLiteralContext extends Struct_valuesContext {
		public TerminalNode INIT_BRACE() { return getToken(CodexLatinusParser.INIT_BRACE, 0); }
		public Values_array_listContext values_array_list() {
			return getRuleContext(Values_array_listContext.class,0);
		}
		public TerminalNode FINAL_BRACE() { return getToken(CodexLatinusParser.FINAL_BRACE, 0); }
		public StructValueLiteralContext(Struct_valuesContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusParserListener ) ((CodexLatinusParserListener)listener).enterStructValueLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusParserListener ) ((CodexLatinusParserListener)listener).exitStructValueLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusParserVisitor ) return ((CodexLatinusParserVisitor<? extends T>)visitor).visitStructValueLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Struct_valuesContext struct_values() throws RecognitionException {
		Struct_valuesContext _localctx = new Struct_valuesContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_struct_values);
		try {
			_localctx = new StructValueLiteralContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(312);
			match(INIT_BRACE);
			setState(313);
			values_array_list(0);
			setState(314);
			match(FINAL_BRACE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Normal_valuesContext extends ParserRuleContext {
		public Normal_valuesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_normal_values; }
	 
		public Normal_valuesContext() { }
		public void copyFrom(Normal_valuesContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ValBoolContext extends Normal_valuesContext {
		public Boolean_valuesContext boolean_values() {
			return getRuleContext(Boolean_valuesContext.class,0);
		}
		public ValBoolContext(Normal_valuesContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusParserListener ) ((CodexLatinusParserListener)listener).enterValBool(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusParserListener ) ((CodexLatinusParserListener)listener).exitValBool(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusParserVisitor ) return ((CodexLatinusParserVisitor<? extends T>)visitor).visitValBool(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ValIdContext extends Normal_valuesContext {
		public TerminalNode ID() { return getToken(CodexLatinusParser.ID, 0); }
		public ValIdContext(Normal_valuesContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusParserListener ) ((CodexLatinusParserListener)listener).enterValId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusParserListener ) ((CodexLatinusParserListener)listener).exitValId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusParserVisitor ) return ((CodexLatinusParserVisitor<? extends T>)visitor).visitValId(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ValIntContext extends Normal_valuesContext {
		public TerminalNode INT() { return getToken(CodexLatinusParser.INT, 0); }
		public ValIntContext(Normal_valuesContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusParserListener ) ((CodexLatinusParserListener)listener).enterValInt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusParserListener ) ((CodexLatinusParserListener)listener).exitValInt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusParserVisitor ) return ((CodexLatinusParserVisitor<? extends T>)visitor).visitValInt(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ValStringContext extends Normal_valuesContext {
		public TerminalNode STRING() { return getToken(CodexLatinusParser.STRING, 0); }
		public ValStringContext(Normal_valuesContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusParserListener ) ((CodexLatinusParserListener)listener).enterValString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusParserListener ) ((CodexLatinusParserListener)listener).exitValString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusParserVisitor ) return ((CodexLatinusParserVisitor<? extends T>)visitor).visitValString(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ValCharContext extends Normal_valuesContext {
		public TerminalNode CHAR() { return getToken(CodexLatinusParser.CHAR, 0); }
		public ValCharContext(Normal_valuesContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusParserListener ) ((CodexLatinusParserListener)listener).enterValChar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusParserListener ) ((CodexLatinusParserListener)listener).exitValChar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusParserVisitor ) return ((CodexLatinusParserVisitor<? extends T>)visitor).visitValChar(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ValIdCallContext extends Normal_valuesContext {
		public Array_callContext array_call() {
			return getRuleContext(Array_callContext.class,0);
		}
		public ValIdCallContext(Normal_valuesContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusParserListener ) ((CodexLatinusParserListener)listener).enterValIdCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusParserListener ) ((CodexLatinusParserListener)listener).exitValIdCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusParserVisitor ) return ((CodexLatinusParserVisitor<? extends T>)visitor).visitValIdCall(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ValDecimalContext extends Normal_valuesContext {
		public TerminalNode DECIMAL() { return getToken(CodexLatinusParser.DECIMAL, 0); }
		public ValDecimalContext(Normal_valuesContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusParserListener ) ((CodexLatinusParserListener)listener).enterValDecimal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusParserListener ) ((CodexLatinusParserListener)listener).exitValDecimal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusParserVisitor ) return ((CodexLatinusParserVisitor<? extends T>)visitor).visitValDecimal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Normal_valuesContext normal_values() throws RecognitionException {
		Normal_valuesContext _localctx = new Normal_valuesContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_normal_values);
		try {
			setState(323);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				_localctx = new ValStringContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(316);
				match(STRING);
				}
				break;
			case 2:
				_localctx = new ValCharContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(317);
				match(CHAR);
				}
				break;
			case 3:
				_localctx = new ValIdContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(318);
				match(ID);
				}
				break;
			case 4:
				_localctx = new ValDecimalContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(319);
				match(DECIMAL);
				}
				break;
			case 5:
				_localctx = new ValIntContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(320);
				match(INT);
				}
				break;
			case 6:
				_localctx = new ValBoolContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(321);
				boolean_values();
				}
				break;
			case 7:
				_localctx = new ValIdCallContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(322);
				array_call();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Boolean_valuesContext extends ParserRuleContext {
		public Boolean_valuesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolean_values; }
	 
		public Boolean_valuesContext() { }
		public void copyFrom(Boolean_valuesContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BoolFalseContext extends Boolean_valuesContext {
		public TerminalNode FALSUS() { return getToken(CodexLatinusParser.FALSUS, 0); }
		public BoolFalseContext(Boolean_valuesContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusParserListener ) ((CodexLatinusParserListener)listener).enterBoolFalse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusParserListener ) ((CodexLatinusParserListener)listener).exitBoolFalse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusParserVisitor ) return ((CodexLatinusParserVisitor<? extends T>)visitor).visitBoolFalse(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BoolTrueContext extends Boolean_valuesContext {
		public TerminalNode VERUM() { return getToken(CodexLatinusParser.VERUM, 0); }
		public BoolTrueContext(Boolean_valuesContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusParserListener ) ((CodexLatinusParserListener)listener).enterBoolTrue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusParserListener ) ((CodexLatinusParserListener)listener).exitBoolTrue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusParserVisitor ) return ((CodexLatinusParserVisitor<? extends T>)visitor).visitBoolTrue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Boolean_valuesContext boolean_values() throws RecognitionException {
		Boolean_valuesContext _localctx = new Boolean_valuesContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_boolean_values);
		try {
			setState(327);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VERUM:
				_localctx = new BoolTrueContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(325);
				match(VERUM);
				}
				break;
			case FALSUS:
				_localctx = new BoolFalseContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(326);
				match(FALSUS);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 5:
			return variabiles_body_sempred((Variabiles_bodyContext)_localctx, predIndex);
		case 11:
			return struct_data_list_sempred((Struct_data_listContext)_localctx, predIndex);
		case 17:
			return values_array_list_sempred((Values_array_listContext)_localctx, predIndex);
		case 21:
			return struct_normal_body_sempred((Struct_normal_bodyContext)_localctx, predIndex);
		case 22:
			return struct_comma_body_sempred((Struct_comma_bodyContext)_localctx, predIndex);
		case 28:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean variabiles_body_sempred(Variabiles_bodyContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean struct_data_list_sempred(Struct_data_listContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean values_array_list_sempred(Values_array_listContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean struct_normal_body_sempred(Struct_normal_bodyContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean struct_comma_body_sempred(Struct_comma_bodyContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 5:
			return precpred(_ctx, 6);
		case 6:
			return precpred(_ctx, 5);
		case 7:
			return precpred(_ctx, 4);
		case 8:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001;\u014a\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0001\u0000\u0005"+
		"\u0000F\b\u0000\n\u0000\f\u0000I\t\u0000\u0001\u0001\u0001\u0001\u0003"+
		"\u0001M\b\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0005\u0005b\b\u0005\n\u0005\f\u0005e\t"+
		"\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006p\b\u0006\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b"+
		"\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0005\u000b"+
		"\u0098\b\u000b\n\u000b\f\u000b\u009b\t\u000b\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0003\u000e"+
		"\u00b5\b\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u00c5\b\u0010\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0005\u0011"+
		"\u00cd\b\u0011\n\u0011\f\u0011\u00d0\t\u0011\u0001\u0012\u0001\u0012\u0003"+
		"\u0012\u00d4\b\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0003"+
		"\u0014\u00e0\b\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0005\u0015\u00ea\b\u0015\n"+
		"\u0015\f\u0015\u00ed\t\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0005\u0016\u00f5\b\u0016\n\u0016\f\u0016"+
		"\u00f8\t\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0003\u0017\u00fd\b"+
		"\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001"+
		"\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u001a\u0001"+
		"\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001b\u0001\u001b\u0001"+
		"\u001b\u0001\u001b\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001"+
		"\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0003\u001c\u011a\b\u001c\u0001"+
		"\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001"+
		"\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0005"+
		"\u001c\u0128\b\u001c\n\u001c\f\u001c\u012b\t\u001c\u0001\u001d\u0001\u001d"+
		"\u0001\u001d\u0001\u001d\u0001\u001d\u0003\u001d\u0132\b\u001d\u0001\u001e"+
		"\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001f\u0001\u001f"+
		"\u0001\u001f\u0001\u001f\u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001"+
		" \u0003 \u0144\b \u0001!\u0001!\u0003!\u0148\b!\u0001!\u0000\u0006\n\u0016"+
		"\"*,8\"\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018"+
		"\u001a\u001c\u001e \"$&(*,.02468:<>@B\u0000\u0000\u014d\u0000G\u0001\u0000"+
		"\u0000\u0000\u0002J\u0001\u0000\u0000\u0000\u0004R\u0001\u0000\u0000\u0000"+
		"\u0006U\u0001\u0000\u0000\u0000\bX\u0001\u0000\u0000\u0000\n\\\u0001\u0000"+
		"\u0000\u0000\fo\u0001\u0000\u0000\u0000\u000eq\u0001\u0000\u0000\u0000"+
		"\u0010v\u0001\u0000\u0000\u0000\u0012~\u0001\u0000\u0000\u0000\u0014\u0089"+
		"\u0001\u0000\u0000\u0000\u0016\u0091\u0001\u0000\u0000\u0000\u0018\u009c"+
		"\u0001\u0000\u0000\u0000\u001a\u00a3\u0001\u0000\u0000\u0000\u001c\u00b4"+
		"\u0001\u0000\u0000\u0000\u001e\u00b6\u0001\u0000\u0000\u0000 \u00c4\u0001"+
		"\u0000\u0000\u0000\"\u00c6\u0001\u0000\u0000\u0000$\u00d3\u0001\u0000"+
		"\u0000\u0000&\u00d5\u0001\u0000\u0000\u0000(\u00df\u0001\u0000\u0000\u0000"+
		"*\u00e1\u0001\u0000\u0000\u0000,\u00ee\u0001\u0000\u0000\u0000.\u00fc"+
		"\u0001\u0000\u0000\u00000\u00fe\u0001\u0000\u0000\u00002\u0103\u0001\u0000"+
		"\u0000\u00004\u0108\u0001\u0000\u0000\u00006\u010d\u0001\u0000\u0000\u0000"+
		"8\u0119\u0001\u0000\u0000\u0000:\u0131\u0001\u0000\u0000\u0000<\u0133"+
		"\u0001\u0000\u0000\u0000>\u0138\u0001\u0000\u0000\u0000@\u0143\u0001\u0000"+
		"\u0000\u0000B\u0147\u0001\u0000\u0000\u0000DF\u0003\u0002\u0001\u0000"+
		"ED\u0001\u0000\u0000\u0000FI\u0001\u0000\u0000\u0000GE\u0001\u0000\u0000"+
		"\u0000GH\u0001\u0000\u0000\u0000H\u0001\u0001\u0000\u0000\u0000IG\u0001"+
		"\u0000\u0000\u0000JL\u0003\b\u0004\u0000KM\u0003\u0006\u0003\u0000LK\u0001"+
		"\u0000\u0000\u0000LM\u0001\u0000\u0000\u0000MN\u0001\u0000\u0000\u0000"+
		"NO\u0003\u0004\u0002\u0000OP\u0005\u0007\u0000\u0000PQ\u0005\u001e\u0000"+
		"\u0000Q\u0003\u0001\u0000\u0000\u0000RS\u0005\u0006\u0000\u0000ST\u0005"+
		"2\u0000\u0000T\u0005\u0001\u0000\u0000\u0000UV\u0005\u0005\u0000\u0000"+
		"VW\u00052\u0000\u0000W\u0007\u0001\u0000\u0000\u0000XY\u0005\u0004\u0000"+
		"\u0000YZ\u00052\u0000\u0000Z[\u0003\n\u0005\u0000[\t\u0001\u0000\u0000"+
		"\u0000\\]\u0006\u0005\uffff\uffff\u0000]^\u0003\f\u0006\u0000^c\u0001"+
		"\u0000\u0000\u0000_`\n\u0002\u0000\u0000`b\u0003\f\u0006\u0000a_\u0001"+
		"\u0000\u0000\u0000be\u0001\u0000\u0000\u0000ca\u0001\u0000\u0000\u0000"+
		"cd\u0001\u0000\u0000\u0000d\u000b\u0001\u0000\u0000\u0000ec\u0001\u0000"+
		"\u0000\u0000fp\u0003\u0018\f\u0000gp\u0003\u000e\u0007\u0000hp\u0003\u001a"+
		"\r\u0000ip\u0003\u001c\u000e\u0000jp\u0003\u001e\u000f\u0000kp\u0003\u0010"+
		"\b\u0000lp\u0003&\u0013\u0000mp\u0003\u0012\t\u0000np\u0003\u0014\n\u0000"+
		"of\u0001\u0000\u0000\u0000og\u0001\u0000\u0000\u0000oh\u0001\u0000\u0000"+
		"\u0000oi\u0001\u0000\u0000\u0000oj\u0001\u0000\u0000\u0000ok\u0001\u0000"+
		"\u0000\u0000ol\u0001\u0000\u0000\u0000om\u0001\u0000\u0000\u0000on\u0001"+
		"\u0000\u0000\u0000p\r\u0001\u0000\u0000\u0000qr\u00056\u0000\u0000rs\u0005"+
		"\u001c\u0000\u0000st\u00038\u001c\u0000tu\u0005\u001e\u0000\u0000u\u000f"+
		"\u0001\u0000\u0000\u0000vw\u00056\u0000\u0000wx\u0005#\u0000\u0000xy\u0005"+
		"7\u0000\u0000yz\u0005$\u0000\u0000z{\u0005\u001c\u0000\u0000{|\u00038"+
		"\u001c\u0000|}\u0005\u001e\u0000\u0000}\u0011\u0001\u0000\u0000\u0000"+
		"~\u007f\u00056\u0000\u0000\u007f\u0080\u0005 \u0000\u0000\u0080\u0081"+
		"\u00056\u0000\u0000\u0081\u0082\u0005#\u0000\u0000\u0082\u0083\u00057"+
		"\u0000\u0000\u0083\u0084\u0005$\u0000\u0000\u0084\u0085\u0005\u001c\u0000"+
		"\u0000\u0085\u0086\u0003\u0016\u000b\u0000\u0086\u0087\u0005!\u0000\u0000"+
		"\u0087\u0088\u0005\"\u0000\u0000\u0088\u0013\u0001\u0000\u0000\u0000\u0089"+
		"\u008a\u0005\u0010\u0000\u0000\u008a\u008b\u00056\u0000\u0000\u008b\u008c"+
		"\u0005\u001f\u0000\u0000\u008c\u008d\u00056\u0000\u0000\u008d\u008e\u0005"+
		"!\u0000\u0000\u008e\u008f\u0003\u0016\u000b\u0000\u008f\u0090\u0005\""+
		"\u0000\u0000\u0090\u0015\u0001\u0000\u0000\u0000\u0091\u0092\u0006\u000b"+
		"\uffff\uffff\u0000\u0092\u0093\u00036\u001b\u0000\u0093\u0099\u0001\u0000"+
		"\u0000\u0000\u0094\u0095\n\u0002\u0000\u0000\u0095\u0096\u0005\u001d\u0000"+
		"\u0000\u0096\u0098\u00036\u001b\u0000\u0097\u0094\u0001\u0000\u0000\u0000"+
		"\u0098\u009b\u0001\u0000\u0000\u0000\u0099\u0097\u0001\u0000\u0000\u0000"+
		"\u0099\u009a\u0001\u0000\u0000\u0000\u009a\u0017\u0001\u0000\u0000\u0000"+
		"\u009b\u0099\u0001\u0000\u0000\u0000\u009c\u009d\u0005\u0010\u0000\u0000"+
		"\u009d\u009e\u00056\u0000\u0000\u009e\u009f\u0005\u001f\u0000\u0000\u009f"+
		"\u00a0\u0003:\u001d\u0000\u00a0\u00a1\u00038\u001c\u0000\u00a1\u00a2\u0005"+
		"\u001e\u0000\u0000\u00a2\u0019\u0001\u0000\u0000\u0000\u00a3\u00a4\u0005"+
		"\u0010\u0000\u0000\u00a4\u00a5\u00056\u0000\u0000\u00a5\u00a6\u0005\u001f"+
		"\u0000\u0000\u00a6\u00a7\u0003B!\u0000\u00a7\u00a8\u0005\u001e\u0000\u0000"+
		"\u00a8\u001b\u0001\u0000\u0000\u0000\u00a9\u00aa\u0005\u0011\u0000\u0000"+
		"\u00aa\u00ab\u00056\u0000\u0000\u00ab\u00ac\u0005%\u0000\u0000\u00ac\u00ad"+
		"\u00057\u0000\u0000\u00ad\u00ae\u0005&\u0000\u0000\u00ae\u00af\u0005\u001f"+
		"\u0000\u0000\u00af\u00b0\u0003:\u001d\u0000\u00b0\u00b1\u0003 \u0010\u0000"+
		"\u00b1\u00b2\u0005\u001e\u0000\u0000\u00b2\u00b5\u0001\u0000\u0000\u0000"+
		"\u00b3\u00b5\u0003\u001e\u000f\u0000\u00b4\u00a9\u0001\u0000\u0000\u0000"+
		"\u00b4\u00b3\u0001\u0000\u0000\u0000\u00b5\u001d\u0001\u0000\u0000\u0000"+
		"\u00b6\u00b7\u0005\u0011\u0000\u0000\u00b7\u00b8\u00056\u0000\u0000\u00b8"+
		"\u00b9\u0005%\u0000\u0000\u00b9\u00ba\u00057\u0000\u0000\u00ba\u00bb\u0005"+
		"&\u0000\u0000\u00bb\u00bc\u0005\u001f\u0000\u0000\u00bc\u00bd\u0003 \u0010"+
		"\u0000\u00bd\u00be\u0005\u001e\u0000\u0000\u00be\u001f\u0001\u0000\u0000"+
		"\u0000\u00bf\u00c0\u0005!\u0000\u0000\u00c0\u00c1\u0003\"\u0011\u0000"+
		"\u00c1\u00c2\u0005\"\u0000\u0000\u00c2\u00c5\u0001\u0000\u0000\u0000\u00c3"+
		"\u00c5\u0001\u0000\u0000\u0000\u00c4\u00bf\u0001\u0000\u0000\u0000\u00c4"+
		"\u00c3\u0001\u0000\u0000\u0000\u00c5!\u0001\u0000\u0000\u0000\u00c6\u00c7"+
		"\u0006\u0011\uffff\uffff\u0000\u00c7\u00c8\u0003$\u0012\u0000\u00c8\u00ce"+
		"\u0001\u0000\u0000\u0000\u00c9\u00ca\n\u0002\u0000\u0000\u00ca\u00cb\u0005"+
		"\u001d\u0000\u0000\u00cb\u00cd\u0003$\u0012\u0000\u00cc\u00c9\u0001\u0000"+
		"\u0000\u0000\u00cd\u00d0\u0001\u0000\u0000\u0000\u00ce\u00cc\u0001\u0000"+
		"\u0000\u0000\u00ce\u00cf\u0001\u0000\u0000\u0000\u00cf#\u0001\u0000\u0000"+
		"\u0000\u00d0\u00ce\u0001\u0000\u0000\u0000\u00d1\u00d4\u0003>\u001f\u0000"+
		"\u00d2\u00d4\u00038\u001c\u0000\u00d3\u00d1\u0001\u0000\u0000\u0000\u00d3"+
		"\u00d2\u0001\u0000\u0000\u0000\u00d4%\u0001\u0000\u0000\u0000\u00d5\u00d6"+
		"\u0005\u0012\u0000\u0000\u00d6\u00d7\u00056\u0000\u0000\u00d7\u00d8\u0005"+
		"!\u0000\u0000\u00d8\u00d9\u0003(\u0014\u0000\u00d9\u00da\u0005\"\u0000"+
		"\u0000\u00da\u00db\u0005\u0013\u0000\u0000\u00db\u00dc\u0005\u001e\u0000"+
		"\u0000\u00dc\'\u0001\u0000\u0000\u0000\u00dd\u00e0\u0003*\u0015\u0000"+
		"\u00de\u00e0\u0003,\u0016\u0000\u00df\u00dd\u0001\u0000\u0000\u0000\u00df"+
		"\u00de\u0001\u0000\u0000\u0000\u00e0)\u0001\u0000\u0000\u0000\u00e1\u00e2"+
		"\u0006\u0015\uffff\uffff\u0000\u00e2\u00e3\u0003.\u0017\u0000\u00e3\u00e4"+
		"\u0005\u001e\u0000\u0000\u00e4\u00eb\u0001\u0000\u0000\u0000\u00e5\u00e6"+
		"\n\u0002\u0000\u0000\u00e6\u00e7\u0003.\u0017\u0000\u00e7\u00e8\u0005"+
		"\u001e\u0000\u0000\u00e8\u00ea\u0001\u0000\u0000\u0000\u00e9\u00e5\u0001"+
		"\u0000\u0000\u0000\u00ea\u00ed\u0001\u0000\u0000\u0000\u00eb\u00e9\u0001"+
		"\u0000\u0000\u0000\u00eb\u00ec\u0001\u0000\u0000\u0000\u00ec+\u0001\u0000"+
		"\u0000\u0000\u00ed\u00eb\u0001\u0000\u0000\u0000\u00ee\u00ef\u0006\u0016"+
		"\uffff\uffff\u0000\u00ef\u00f0\u0003.\u0017\u0000\u00f0\u00f6\u0001\u0000"+
		"\u0000\u0000\u00f1\u00f2\n\u0002\u0000\u0000\u00f2\u00f3\u0005\u001d\u0000"+
		"\u0000\u00f3\u00f5\u0003.\u0017\u0000\u00f4\u00f1\u0001\u0000\u0000\u0000"+
		"\u00f5\u00f8\u0001\u0000\u0000\u0000\u00f6\u00f4\u0001\u0000\u0000\u0000"+
		"\u00f6\u00f7\u0001\u0000\u0000\u0000\u00f7-\u0001\u0000\u0000\u0000\u00f8"+
		"\u00f6\u0001\u0000\u0000\u0000\u00f9\u00fd\u00030\u0018\u0000\u00fa\u00fd"+
		"\u00032\u0019\u0000\u00fb\u00fd\u00034\u001a\u0000\u00fc\u00f9\u0001\u0000"+
		"\u0000\u0000\u00fc\u00fa\u0001\u0000\u0000\u0000\u00fc\u00fb\u0001\u0000"+
		"\u0000\u0000\u00fd/\u0001\u0000\u0000\u0000\u00fe\u00ff\u0005\u0010\u0000"+
		"\u0000\u00ff\u0100\u00056\u0000\u0000\u0100\u0101\u0005\u001f\u0000\u0000"+
		"\u0101\u0102\u0003:\u001d\u0000\u01021\u0001\u0000\u0000\u0000\u0103\u0104"+
		"\u0005\u0010\u0000\u0000\u0104\u0105\u00056\u0000\u0000\u0105\u0106\u0005"+
		"\u001f\u0000\u0000\u0106\u0107\u0003B!\u0000\u01073\u0001\u0000\u0000"+
		"\u0000\u0108\u0109\u0005\u0011\u0000\u0000\u0109\u010a\u00056\u0000\u0000"+
		"\u010a\u010b\u0005\u001f\u0000\u0000\u010b\u010c\u00056\u0000\u0000\u010c"+
		"5\u0001\u0000\u0000\u0000\u010d\u010e\u00056\u0000\u0000\u010e\u010f\u0005"+
		"\u001f\u0000\u0000\u010f\u0110\u00038\u001c\u0000\u01107\u0001\u0000\u0000"+
		"\u0000\u0111\u0112\u0006\u001c\uffff\uffff\u0000\u0112\u0113\u0005*\u0000"+
		"\u0000\u0113\u011a\u00038\u001c\u0007\u0114\u011a\u0003@ \u0000\u0115"+
		"\u0116\u0005%\u0000\u0000\u0116\u0117\u00038\u001c\u0000\u0117\u0118\u0005"+
		"&\u0000\u0000\u0118\u011a\u0001\u0000\u0000\u0000\u0119\u0111\u0001\u0000"+
		"\u0000\u0000\u0119\u0114\u0001\u0000\u0000\u0000\u0119\u0115\u0001\u0000"+
		"\u0000\u0000\u011a\u0129\u0001\u0000\u0000\u0000\u011b\u011c\n\u0006\u0000"+
		"\u0000\u011c\u011d\u0005+\u0000\u0000\u011d\u0128\u00038\u001c\u0007\u011e"+
		"\u011f\n\u0005\u0000\u0000\u011f\u0120\u0005,\u0000\u0000\u0120\u0128"+
		"\u00038\u001c\u0006\u0121\u0122\n\u0004\u0000\u0000\u0122\u0123\u0005"+
		")\u0000\u0000\u0123\u0128\u00038\u001c\u0005\u0124\u0125\n\u0003\u0000"+
		"\u0000\u0125\u0126\u0005*\u0000\u0000\u0126\u0128\u00038\u001c\u0004\u0127"+
		"\u011b\u0001\u0000\u0000\u0000\u0127\u011e\u0001\u0000\u0000\u0000\u0127"+
		"\u0121\u0001\u0000\u0000\u0000\u0127\u0124\u0001\u0000\u0000\u0000\u0128"+
		"\u012b\u0001\u0000\u0000\u0000\u0129\u0127\u0001\u0000\u0000\u0000\u0129"+
		"\u012a\u0001\u0000\u0000\u0000\u012a9\u0001\u0000\u0000\u0000\u012b\u0129"+
		"\u0001\u0000\u0000\u0000\u012c\u0132\u0005\u000b\u0000\u0000\u012d\u0132"+
		"\u0005\n\u0000\u0000\u012e\u0132\u0005\f\u0000\u0000\u012f\u0132\u0005"+
		"\r\u0000\u0000\u0130\u0132\u00056\u0000\u0000\u0131\u012c\u0001\u0000"+
		"\u0000\u0000\u0131\u012d\u0001\u0000\u0000\u0000\u0131\u012e\u0001\u0000"+
		"\u0000\u0000\u0131\u012f\u0001\u0000\u0000\u0000\u0131\u0130\u0001\u0000"+
		"\u0000\u0000\u0132;\u0001\u0000\u0000\u0000\u0133\u0134\u00056\u0000\u0000"+
		"\u0134\u0135\u0005#\u0000\u0000\u0135\u0136\u00057\u0000\u0000\u0136\u0137"+
		"\u0005$\u0000\u0000\u0137=\u0001\u0000\u0000\u0000\u0138\u0139\u0005!"+
		"\u0000\u0000\u0139\u013a\u0003\"\u0011\u0000\u013a\u013b\u0005\"\u0000"+
		"\u0000\u013b?\u0001\u0000\u0000\u0000\u013c\u0144\u00059\u0000\u0000\u013d"+
		"\u0144\u0005:\u0000\u0000\u013e\u0144\u00056\u0000\u0000\u013f\u0144\u0005"+
		"8\u0000\u0000\u0140\u0144\u00057\u0000\u0000\u0141\u0144\u0003B!\u0000"+
		"\u0142\u0144\u0003<\u001e\u0000\u0143\u013c\u0001\u0000\u0000\u0000\u0143"+
		"\u013d\u0001\u0000\u0000\u0000\u0143\u013e\u0001\u0000\u0000\u0000\u0143"+
		"\u013f\u0001\u0000\u0000\u0000\u0143\u0140\u0001\u0000\u0000\u0000\u0143"+
		"\u0141\u0001\u0000\u0000\u0000\u0143\u0142\u0001\u0000\u0000\u0000\u0144"+
		"A\u0001\u0000\u0000\u0000\u0145\u0148\u0005\u000e\u0000\u0000\u0146\u0148"+
		"\u0005\u000f\u0000\u0000\u0147\u0145\u0001\u0000\u0000\u0000\u0147\u0146"+
		"\u0001\u0000\u0000\u0000\u0148C\u0001\u0000\u0000\u0000\u0013GLco\u0099"+
		"\u00b4\u00c4\u00ce\u00d3\u00df\u00eb\u00f6\u00fc\u0119\u0127\u0129\u0131"+
		"\u0143\u0147";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}