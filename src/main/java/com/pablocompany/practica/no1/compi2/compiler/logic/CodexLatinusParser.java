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
		PER=22, SI=23, ALITER=24, ACTIO=25, RATIO=26, REDDERE=27, PERGE=28, INTERRUMPE=29, 
		EQUAL=30, COMMA=31, DOT_COMMA=32, TWO_POINTS=33, DOT=34, INIT_BRACE=35, 
		FINAL_BRACE=36, INIT_BRACKET=37, FINAL_BRACKET=38, INIT_PARENT=39, FINAL_PARENT=40, 
		ABREV_PLUS=41, ABREV_MINUS=42, PLUS=43, MINUS=44, MULTIPLICATION=45, DIVIDE=46, 
		EQUALS=47, GREATER_EQUALS=48, LESS_EQUALS=49, DIFERENCE=50, LESS=51, GREATER=52, 
		AND=53, OR=54, NOT=55, ID=56, INT=57, DECIMAL=58, STRING=59, CHAR=60, 
		ERROR_TOKEN=61;
	public static final int
		RULE_program = 0, RULE_body = 1, RULE_munera_section = 2, RULE_munera_body = 3, 
		RULE_functions_block = 4, RULE_function_declaration = 5, RULE_variable_function_type = 6, 
		RULE_procedure_declaration = 7, RULE_function_body = 8, RULE_procedure_body = 9, 
		RULE_local_variable_list = 10, RULE_local_variable = 11, RULE_function_arguments = 12, 
		RULE_argument = 13, RULE_argument_variable_type = 14, RULE_argument_series_type = 15, 
		RULE_maior_section = 16, RULE_code_body = 17, RULE_control_block = 18, 
		RULE_return_control = 19, RULE_loop_control = 20, RULE_console_actions = 21, 
		RULE_print_function = 22, RULE_block_code = 23, RULE_if_statement = 24, 
		RULE_else_if_list = 25, RULE_else_if_clause = 26, RULE_else_statement = 27, 
		RULE_while_statement = 28, RULE_do_while_statement = 29, RULE_for_statement = 30, 
		RULE_for_init = 31, RULE_for_update = 32, RULE_variable_section = 33, 
		RULE_variabiles_body = 34, RULE_declarations = 35, RULE_struct_ussage = 36, 
		RULE_variable_ussage = 37, RULE_array_ussage = 38, RULE_nested_variables_usage = 39, 
		RULE_struct_variable_set = 40, RULE_struct_array_set = 41, RULE_struct_array_property = 42, 
		RULE_struct_instance = 43, RULE_struct_data_list = 44, RULE_variable_declaration = 45, 
		RULE_boolean_declaration = 46, RULE_normal_array = 47, RULE_boolean_array = 48, 
		RULE_array_initialization = 49, RULE_values_array_list = 50, RULE_array_value = 51, 
		RULE_struct_values = 52, RULE_struct_declaration = 53, RULE_struct_body = 54, 
		RULE_struct_normal_body = 55, RULE_struct_comma_body = 56, RULE_struct_attribute = 57, 
		RULE_variable_without_value = 58, RULE_boolean_variable_without_value = 59, 
		RULE_array_variable_struct = 60, RULE_struct_data_value = 61, RULE_expression = 62, 
		RULE_variable_type = 63, RULE_array_call = 64, RULE_function_call = 65, 
		RULE_arguments_list = 66, RULE_nest_variable = 67, RULE_normal_values = 68, 
		RULE_boolean_values = 69, RULE_abbreviated_operation = 70;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "body", "munera_section", "munera_body", "functions_block", 
			"function_declaration", "variable_function_type", "procedure_declaration", 
			"function_body", "procedure_body", "local_variable_list", "local_variable", 
			"function_arguments", "argument", "argument_variable_type", "argument_series_type", 
			"maior_section", "code_body", "control_block", "return_control", "loop_control", 
			"console_actions", "print_function", "block_code", "if_statement", "else_if_list", 
			"else_if_clause", "else_statement", "while_statement", "do_while_statement", 
			"for_statement", "for_init", "for_update", "variable_section", "variabiles_body", 
			"declarations", "struct_ussage", "variable_ussage", "array_ussage", "nested_variables_usage", 
			"struct_variable_set", "struct_array_set", "struct_array_property", "struct_instance", 
			"struct_data_list", "variable_declaration", "boolean_declaration", "normal_array", 
			"boolean_array", "array_initialization", "values_array_list", "array_value", 
			"struct_values", "struct_declaration", "struct_body", "struct_normal_body", 
			"struct_comma_body", "struct_attribute", "variable_without_value", "boolean_variable_without_value", 
			"array_variable_struct", "struct_data_value", "expression", "variable_type", 
			"array_call", "function_call", "arguments_list", "nest_variable", "normal_values", 
			"boolean_values", "abbreviated_operation"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, "'VARIABILES'", "'MUNERA'", "'MAIOR'", "'FINIS'", 
			"'>>'", "'<<'", "'numerus'", "'textum'", "'decimalis'", "'littera'", 
			"'verum'", "'falsus'", "'esto'", "'series'", "'structura'", "'finis'", 
			"'dum'", "'facere'", "'per'", "'si'", "'aliter'", "'actio'", "'ratio'", 
			"'reddere'", "'perge'", "'interrumpe'", "'='", "','", "';'", "':'", "'.'", 
			"'{'", "'}'", "'['", "']'", "'('", "')'", "'++'", "'--'", "'+'", "'-'", 
			"'*'", "'/'", "'=='", "'>='", "'<='", "'!='", "'<'", "'>'", "'&&'", "'||'", 
			"'non'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "COMMENT", "BLOCK_COMMENT", "WS", "VARIABILES", "MUNERA", "MAIOR", 
			"FINIS_SEPARATOR", "PRINT", "READ", "NUMERUS", "TEXTUM", "DECIMALIS", 
			"LITTERA", "VERUM", "FALSUS", "ESTO", "SERIES", "STRUCTURE", "FINIS", 
			"DUM", "FACERE", "PER", "SI", "ALITER", "ACTIO", "RATIO", "REDDERE", 
			"PERGE", "INTERRUMPE", "EQUAL", "COMMA", "DOT_COMMA", "TWO_POINTS", "DOT", 
			"INIT_BRACE", "FINAL_BRACE", "INIT_BRACKET", "FINAL_BRACKET", "INIT_PARENT", 
			"FINAL_PARENT", "ABREV_PLUS", "ABREV_MINUS", "PLUS", "MINUS", "MULTIPLICATION", 
			"DIVIDE", "EQUALS", "GREATER_EQUALS", "LESS_EQUALS", "DIFERENCE", "LESS", 
			"GREATER", "AND", "OR", "NOT", "ID", "INT", "DECIMAL", "STRING", "CHAR", 
			"ERROR_TOKEN"
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
			setState(145);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 112L) != 0)) {
				{
				{
				setState(142);
				body();
				}
				}
				setState(147);
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
		public Maior_sectionContext maior_section() {
			return getRuleContext(Maior_sectionContext.class,0);
		}
		public TerminalNode FINIS_SEPARATOR() { return getToken(CodexLatinusParser.FINIS_SEPARATOR, 0); }
		public TerminalNode DOT_COMMA() { return getToken(CodexLatinusParser.DOT_COMMA, 0); }
		public Variable_sectionContext variable_section() {
			return getRuleContext(Variable_sectionContext.class,0);
		}
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
			setState(149);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VARIABILES) {
				{
				setState(148);
				variable_section();
				}
			}

			setState(152);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MUNERA) {
				{
				setState(151);
				munera_section();
				}
			}

			setState(154);
			maior_section();
			setState(155);
			match(FINIS_SEPARATOR);
			setState(156);
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
		public Munera_bodyContext munera_body() {
			return getRuleContext(Munera_bodyContext.class,0);
		}
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
		enterRule(_localctx, 4, RULE_munera_section);
		try {
			_localctx = new MuneraSectionContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
			match(MUNERA);
			setState(159);
			match(GREATER);
			setState(160);
			munera_body(0);
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
	public static class Munera_bodyContext extends ParserRuleContext {
		public Munera_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_munera_body; }
	 
		public Munera_bodyContext() { }
		public void copyFrom(Munera_bodyContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FunctionsBlockListContext extends Munera_bodyContext {
		public Munera_bodyContext munera_body() {
			return getRuleContext(Munera_bodyContext.class,0);
		}
		public Functions_blockContext functions_block() {
			return getRuleContext(Functions_blockContext.class,0);
		}
		public FunctionsBlockListContext(Munera_bodyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusParserListener ) ((CodexLatinusParserListener)listener).enterFunctionsBlockList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusParserListener ) ((CodexLatinusParserListener)listener).exitFunctionsBlockList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusParserVisitor ) return ((CodexLatinusParserVisitor<? extends T>)visitor).visitFunctionsBlockList(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FunctionsSingleBlockContext extends Munera_bodyContext {
		public Functions_blockContext functions_block() {
			return getRuleContext(Functions_blockContext.class,0);
		}
		public FunctionsSingleBlockContext(Munera_bodyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusParserListener ) ((CodexLatinusParserListener)listener).enterFunctionsSingleBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusParserListener ) ((CodexLatinusParserListener)listener).exitFunctionsSingleBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusParserVisitor ) return ((CodexLatinusParserVisitor<? extends T>)visitor).visitFunctionsSingleBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Munera_bodyContext munera_body() throws RecognitionException {
		return munera_body(0);
	}

	private Munera_bodyContext munera_body(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Munera_bodyContext _localctx = new Munera_bodyContext(_ctx, _parentState);
		Munera_bodyContext _prevctx = _localctx;
		int _startState = 6;
		enterRecursionRule(_localctx, 6, RULE_munera_body, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new FunctionsSingleBlockContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(163);
			functions_block();
			}
			_ctx.stop = _input.LT(-1);
			setState(169);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new FunctionsBlockListContext(new Munera_bodyContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_munera_body);
					setState(165);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(166);
					functions_block();
					}
					} 
				}
				setState(171);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
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
	public static class Functions_blockContext extends ParserRuleContext {
		public Functions_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functions_block; }
	 
		public Functions_blockContext() { }
		public void copyFrom(Functions_blockContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FuncDeclBlockContext extends Functions_blockContext {
		public Function_declarationContext function_declaration() {
			return getRuleContext(Function_declarationContext.class,0);
		}
		public FuncDeclBlockContext(Functions_blockContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusParserListener ) ((CodexLatinusParserListener)listener).enterFuncDeclBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusParserListener ) ((CodexLatinusParserListener)listener).exitFuncDeclBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusParserVisitor ) return ((CodexLatinusParserVisitor<? extends T>)visitor).visitFuncDeclBlock(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ProcDeclBlockContext extends Functions_blockContext {
		public Procedure_declarationContext procedure_declaration() {
			return getRuleContext(Procedure_declarationContext.class,0);
		}
		public ProcDeclBlockContext(Functions_blockContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusParserListener ) ((CodexLatinusParserListener)listener).enterProcDeclBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusParserListener ) ((CodexLatinusParserListener)listener).exitProcDeclBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusParserVisitor ) return ((CodexLatinusParserVisitor<? extends T>)visitor).visitProcDeclBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Functions_blockContext functions_block() throws RecognitionException {
		Functions_blockContext _localctx = new Functions_blockContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_functions_block);
		try {
			setState(174);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RATIO:
				_localctx = new FuncDeclBlockContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(172);
				function_declaration();
				}
				break;
			case ACTIO:
				_localctx = new ProcDeclBlockContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(173);
				procedure_declaration();
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
	public static class Function_declarationContext extends ParserRuleContext {
		public Function_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_declaration; }
	 
		public Function_declarationContext() { }
		public void copyFrom(Function_declarationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FunctionDeclContext extends Function_declarationContext {
		public TerminalNode RATIO() { return getToken(CodexLatinusParser.RATIO, 0); }
		public Variable_function_typeContext variable_function_type() {
			return getRuleContext(Variable_function_typeContext.class,0);
		}
		public TerminalNode ID() { return getToken(CodexLatinusParser.ID, 0); }
		public TerminalNode INIT_PARENT() { return getToken(CodexLatinusParser.INIT_PARENT, 0); }
		public Function_argumentsContext function_arguments() {
			return getRuleContext(Function_argumentsContext.class,0);
		}
		public TerminalNode FINAL_PARENT() { return getToken(CodexLatinusParser.FINAL_PARENT, 0); }
		public TerminalNode INIT_BRACE() { return getToken(CodexLatinusParser.INIT_BRACE, 0); }
		public Function_bodyContext function_body() {
			return getRuleContext(Function_bodyContext.class,0);
		}
		public TerminalNode FINAL_BRACE() { return getToken(CodexLatinusParser.FINAL_BRACE, 0); }
		public TerminalNode FINIS() { return getToken(CodexLatinusParser.FINIS, 0); }
		public TerminalNode DOT_COMMA() { return getToken(CodexLatinusParser.DOT_COMMA, 0); }
		public FunctionDeclContext(Function_declarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusParserListener ) ((CodexLatinusParserListener)listener).enterFunctionDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusParserListener ) ((CodexLatinusParserListener)listener).exitFunctionDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusParserVisitor ) return ((CodexLatinusParserVisitor<? extends T>)visitor).visitFunctionDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_declarationContext function_declaration() throws RecognitionException {
		Function_declarationContext _localctx = new Function_declarationContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_function_declaration);
		try {
			_localctx = new FunctionDeclContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(176);
			match(RATIO);
			setState(177);
			variable_function_type();
			setState(178);
			match(ID);
			setState(179);
			match(INIT_PARENT);
			setState(180);
			function_arguments(0);
			setState(181);
			match(FINAL_PARENT);
			setState(182);
			match(INIT_BRACE);
			setState(183);
			function_body();
			setState(184);
			match(FINAL_BRACE);
			setState(185);
			match(FINIS);
			setState(186);
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
	public static class Variable_function_typeContext extends ParserRuleContext {
		public Variable_function_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable_function_type; }
	 
		public Variable_function_typeContext() { }
		public void copyFrom(Variable_function_typeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FunctionReturBooleanTypeContext extends Variable_function_typeContext {
		public Boolean_valuesContext boolean_values() {
			return getRuleContext(Boolean_valuesContext.class,0);
		}
		public FunctionReturBooleanTypeContext(Variable_function_typeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusParserListener ) ((CodexLatinusParserListener)listener).enterFunctionReturBooleanType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusParserListener ) ((CodexLatinusParserListener)listener).exitFunctionReturBooleanType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusParserVisitor ) return ((CodexLatinusParserVisitor<? extends T>)visitor).visitFunctionReturBooleanType(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FunctionReturNormalTypeContext extends Variable_function_typeContext {
		public Variable_typeContext variable_type() {
			return getRuleContext(Variable_typeContext.class,0);
		}
		public FunctionReturNormalTypeContext(Variable_function_typeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusParserListener ) ((CodexLatinusParserListener)listener).enterFunctionReturNormalType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusParserListener ) ((CodexLatinusParserListener)listener).exitFunctionReturNormalType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusParserVisitor ) return ((CodexLatinusParserVisitor<? extends T>)visitor).visitFunctionReturNormalType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Variable_function_typeContext variable_function_type() throws RecognitionException {
		Variable_function_typeContext _localctx = new Variable_function_typeContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_variable_function_type);
		try {
			setState(190);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMERUS:
			case TEXTUM:
			case DECIMALIS:
			case LITTERA:
			case ID:
				_localctx = new FunctionReturNormalTypeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(188);
				variable_type();
				}
				break;
			case VERUM:
			case FALSUS:
				_localctx = new FunctionReturBooleanTypeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(189);
				boolean_values();
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
	public static class Procedure_declarationContext extends ParserRuleContext {
		public Procedure_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_procedure_declaration; }
	 
		public Procedure_declarationContext() { }
		public void copyFrom(Procedure_declarationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ProcedureDeclContext extends Procedure_declarationContext {
		public TerminalNode ACTIO() { return getToken(CodexLatinusParser.ACTIO, 0); }
		public TerminalNode ID() { return getToken(CodexLatinusParser.ID, 0); }
		public TerminalNode INIT_PARENT() { return getToken(CodexLatinusParser.INIT_PARENT, 0); }
		public Function_argumentsContext function_arguments() {
			return getRuleContext(Function_argumentsContext.class,0);
		}
		public TerminalNode FINAL_PARENT() { return getToken(CodexLatinusParser.FINAL_PARENT, 0); }
		public TerminalNode INIT_BRACE() { return getToken(CodexLatinusParser.INIT_BRACE, 0); }
		public Procedure_bodyContext procedure_body() {
			return getRuleContext(Procedure_bodyContext.class,0);
		}
		public TerminalNode FINAL_BRACE() { return getToken(CodexLatinusParser.FINAL_BRACE, 0); }
		public TerminalNode FINIS() { return getToken(CodexLatinusParser.FINIS, 0); }
		public TerminalNode DOT_COMMA() { return getToken(CodexLatinusParser.DOT_COMMA, 0); }
		public ProcedureDeclContext(Procedure_declarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusParserListener ) ((CodexLatinusParserListener)listener).enterProcedureDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusParserListener ) ((CodexLatinusParserListener)listener).exitProcedureDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusParserVisitor ) return ((CodexLatinusParserVisitor<? extends T>)visitor).visitProcedureDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Procedure_declarationContext procedure_declaration() throws RecognitionException {
		Procedure_declarationContext _localctx = new Procedure_declarationContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_procedure_declaration);
		try {
			_localctx = new ProcedureDeclContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(192);
			match(ACTIO);
			setState(193);
			match(ID);
			setState(194);
			match(INIT_PARENT);
			setState(195);
			function_arguments(0);
			setState(196);
			match(FINAL_PARENT);
			setState(197);
			match(INIT_BRACE);
			setState(198);
			procedure_body();
			setState(199);
			match(FINAL_BRACE);
			setState(200);
			match(FINIS);
			setState(201);
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
	public static class Function_bodyContext extends ParserRuleContext {
		public Function_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_body; }
	 
		public Function_bodyContext() { }
		public void copyFrom(Function_bodyContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FunctionBodyContext extends Function_bodyContext {
		public TerminalNode VARIABILES() { return getToken(CodexLatinusParser.VARIABILES, 0); }
		public TerminalNode INIT_BRACKET() { return getToken(CodexLatinusParser.INIT_BRACKET, 0); }
		public TerminalNode FINAL_BRACKET() { return getToken(CodexLatinusParser.FINAL_BRACKET, 0); }
		public Code_bodyContext code_body() {
			return getRuleContext(Code_bodyContext.class,0);
		}
		public Local_variable_listContext local_variable_list() {
			return getRuleContext(Local_variable_listContext.class,0);
		}
		public FunctionBodyContext(Function_bodyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusParserListener ) ((CodexLatinusParserListener)listener).enterFunctionBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusParserListener ) ((CodexLatinusParserListener)listener).exitFunctionBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusParserVisitor ) return ((CodexLatinusParserVisitor<? extends T>)visitor).visitFunctionBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_bodyContext function_body() throws RecognitionException {
		Function_bodyContext _localctx = new Function_bodyContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_function_body);
		int _la;
		try {
			_localctx = new FunctionBodyContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(203);
			match(VARIABILES);
			setState(204);
			match(INIT_BRACKET);
			setState(206);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ESTO || _la==SERIES) {
				{
				setState(205);
				local_variable_list(0);
				}
			}

			setState(208);
			match(FINAL_BRACKET);
			setState(209);
			code_body(0);
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
	public static class Procedure_bodyContext extends ParserRuleContext {
		public Procedure_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_procedure_body; }
	 
		public Procedure_bodyContext() { }
		public void copyFrom(Procedure_bodyContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ProcedureBodyContext extends Procedure_bodyContext {
		public TerminalNode VARIABILES() { return getToken(CodexLatinusParser.VARIABILES, 0); }
		public TerminalNode INIT_BRACKET() { return getToken(CodexLatinusParser.INIT_BRACKET, 0); }
		public TerminalNode FINAL_BRACKET() { return getToken(CodexLatinusParser.FINAL_BRACKET, 0); }
		public Code_bodyContext code_body() {
			return getRuleContext(Code_bodyContext.class,0);
		}
		public Local_variable_listContext local_variable_list() {
			return getRuleContext(Local_variable_listContext.class,0);
		}
		public ProcedureBodyContext(Procedure_bodyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusParserListener ) ((CodexLatinusParserListener)listener).enterProcedureBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusParserListener ) ((CodexLatinusParserListener)listener).exitProcedureBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusParserVisitor ) return ((CodexLatinusParserVisitor<? extends T>)visitor).visitProcedureBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Procedure_bodyContext procedure_body() throws RecognitionException {
		Procedure_bodyContext _localctx = new Procedure_bodyContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_procedure_body);
		int _la;
		try {
			_localctx = new ProcedureBodyContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(211);
			match(VARIABILES);
			setState(212);
			match(INIT_BRACKET);
			setState(214);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ESTO || _la==SERIES) {
				{
				setState(213);
				local_variable_list(0);
				}
			}

			setState(216);
			match(FINAL_BRACKET);
			setState(217);
			code_body(0);
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
	public static class Local_variable_listContext extends ParserRuleContext {
		public Local_variable_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_local_variable_list; }
	 
		public Local_variable_listContext() { }
		public void copyFrom(Local_variable_listContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LocalVariablesListContext extends Local_variable_listContext {
		public Local_variable_listContext local_variable_list() {
			return getRuleContext(Local_variable_listContext.class,0);
		}
		public Local_variableContext local_variable() {
			return getRuleContext(Local_variableContext.class,0);
		}
		public LocalVariablesListContext(Local_variable_listContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusParserListener ) ((CodexLatinusParserListener)listener).enterLocalVariablesList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusParserListener ) ((CodexLatinusParserListener)listener).exitLocalVariablesList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusParserVisitor ) return ((CodexLatinusParserVisitor<? extends T>)visitor).visitLocalVariablesList(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LocalSingleVariableContext extends Local_variable_listContext {
		public Local_variableContext local_variable() {
			return getRuleContext(Local_variableContext.class,0);
		}
		public LocalSingleVariableContext(Local_variable_listContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusParserListener ) ((CodexLatinusParserListener)listener).enterLocalSingleVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusParserListener ) ((CodexLatinusParserListener)listener).exitLocalSingleVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusParserVisitor ) return ((CodexLatinusParserVisitor<? extends T>)visitor).visitLocalSingleVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Local_variable_listContext local_variable_list() throws RecognitionException {
		return local_variable_list(0);
	}

	private Local_variable_listContext local_variable_list(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Local_variable_listContext _localctx = new Local_variable_listContext(_ctx, _parentState);
		Local_variable_listContext _prevctx = _localctx;
		int _startState = 20;
		enterRecursionRule(_localctx, 20, RULE_local_variable_list, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new LocalSingleVariableContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(220);
			local_variable();
			}
			_ctx.stop = _input.LT(-1);
			setState(226);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new LocalVariablesListContext(new Local_variable_listContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_local_variable_list);
					setState(222);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(223);
					local_variable();
					}
					} 
				}
				setState(228);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
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
	public static class Local_variableContext extends ParserRuleContext {
		public Local_variableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_local_variable; }
	 
		public Local_variableContext() { }
		public void copyFrom(Local_variableContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LocalArrayDeclarationContext extends Local_variableContext {
		public Normal_arrayContext normal_array() {
			return getRuleContext(Normal_arrayContext.class,0);
		}
		public LocalArrayDeclarationContext(Local_variableContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusParserListener ) ((CodexLatinusParserListener)listener).enterLocalArrayDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusParserListener ) ((CodexLatinusParserListener)listener).exitLocalArrayDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusParserVisitor ) return ((CodexLatinusParserVisitor<? extends T>)visitor).visitLocalArrayDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LocalStructInstanceContext extends Local_variableContext {
		public Struct_instanceContext struct_instance() {
			return getRuleContext(Struct_instanceContext.class,0);
		}
		public LocalStructInstanceContext(Local_variableContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusParserListener ) ((CodexLatinusParserListener)listener).enterLocalStructInstance(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusParserListener ) ((CodexLatinusParserListener)listener).exitLocalStructInstance(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusParserVisitor ) return ((CodexLatinusParserVisitor<? extends T>)visitor).visitLocalStructInstance(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LocalVarDeclarationContext extends Local_variableContext {
		public Variable_declarationContext variable_declaration() {
			return getRuleContext(Variable_declarationContext.class,0);
		}
		public LocalVarDeclarationContext(Local_variableContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusParserListener ) ((CodexLatinusParserListener)listener).enterLocalVarDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusParserListener ) ((CodexLatinusParserListener)listener).exitLocalVarDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusParserVisitor ) return ((CodexLatinusParserVisitor<? extends T>)visitor).visitLocalVarDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LocalBoolVarDeclarationContext extends Local_variableContext {
		public Boolean_declarationContext boolean_declaration() {
			return getRuleContext(Boolean_declarationContext.class,0);
		}
		public LocalBoolVarDeclarationContext(Local_variableContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusParserListener ) ((CodexLatinusParserListener)listener).enterLocalBoolVarDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusParserListener ) ((CodexLatinusParserListener)listener).exitLocalBoolVarDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusParserVisitor ) return ((CodexLatinusParserVisitor<? extends T>)visitor).visitLocalBoolVarDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LocalBoolArrayDeclarationContext extends Local_variableContext {
		public Boolean_arrayContext boolean_array() {
			return getRuleContext(Boolean_arrayContext.class,0);
		}
		public LocalBoolArrayDeclarationContext(Local_variableContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusParserListener ) ((CodexLatinusParserListener)listener).enterLocalBoolArrayDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusParserListener ) ((CodexLatinusParserListener)listener).exitLocalBoolArrayDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusParserVisitor ) return ((CodexLatinusParserVisitor<? extends T>)visitor).visitLocalBoolArrayDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Local_variableContext local_variable() throws RecognitionException {
		Local_variableContext _localctx = new Local_variableContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_local_variable);
		try {
			setState(234);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				_localctx = new LocalVarDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(229);
				variable_declaration();
				}
				break;
			case 2:
				_localctx = new LocalBoolVarDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(230);
				boolean_declaration();
				}
				break;
			case 3:
				_localctx = new LocalArrayDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(231);
				normal_array();
				}
				break;
			case 4:
				_localctx = new LocalBoolArrayDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(232);
				boolean_array();
				}
				break;
			case 5:
				_localctx = new LocalStructInstanceContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(233);
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
	public static class Function_argumentsContext extends ParserRuleContext {
		public Function_argumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_arguments; }
	 
		public Function_argumentsContext() { }
		public void copyFrom(Function_argumentsContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FunctionArgsEmptyContext extends Function_argumentsContext {
		public FunctionArgsEmptyContext(Function_argumentsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusParserListener ) ((CodexLatinusParserListener)listener).enterFunctionArgsEmpty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusParserListener ) ((CodexLatinusParserListener)listener).exitFunctionArgsEmpty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusParserVisitor ) return ((CodexLatinusParserVisitor<? extends T>)visitor).visitFunctionArgsEmpty(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FunctionSingleArgContext extends Function_argumentsContext {
		public ArgumentContext argument() {
			return getRuleContext(ArgumentContext.class,0);
		}
		public FunctionSingleArgContext(Function_argumentsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusParserListener ) ((CodexLatinusParserListener)listener).enterFunctionSingleArg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusParserListener ) ((CodexLatinusParserListener)listener).exitFunctionSingleArg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusParserVisitor ) return ((CodexLatinusParserVisitor<? extends T>)visitor).visitFunctionSingleArg(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FunctionArgsListContext extends Function_argumentsContext {
		public Function_argumentsContext function_arguments() {
			return getRuleContext(Function_argumentsContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(CodexLatinusParser.COMMA, 0); }
		public ArgumentContext argument() {
			return getRuleContext(ArgumentContext.class,0);
		}
		public FunctionArgsListContext(Function_argumentsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusParserListener ) ((CodexLatinusParserListener)listener).enterFunctionArgsList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusParserListener ) ((CodexLatinusParserListener)listener).exitFunctionArgsList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusParserVisitor ) return ((CodexLatinusParserVisitor<? extends T>)visitor).visitFunctionArgsList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_argumentsContext function_arguments() throws RecognitionException {
		return function_arguments(0);
	}

	private Function_argumentsContext function_arguments(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Function_argumentsContext _localctx = new Function_argumentsContext(_ctx, _parentState);
		Function_argumentsContext _prevctx = _localctx;
		int _startState = 24;
		enterRecursionRule(_localctx, 24, RULE_function_arguments, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(239);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				_localctx = new FunctionSingleArgContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(237);
				argument();
				}
				break;
			case 2:
				{
				_localctx = new FunctionArgsEmptyContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				}
				break;
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
					_localctx = new FunctionArgsListContext(new Function_argumentsContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_function_arguments);
					setState(241);
					if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
					setState(242);
					match(COMMA);
					setState(243);
					argument();
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
	public static class ArgumentContext extends ParserRuleContext {
		public ArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argument; }
	 
		public ArgumentContext() { }
		public void copyFrom(ArgumentContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArgumentVariableDeclarationContext extends ArgumentContext {
		public TerminalNode ESTO() { return getToken(CodexLatinusParser.ESTO, 0); }
		public TerminalNode ID() { return getToken(CodexLatinusParser.ID, 0); }
		public TerminalNode TWO_POINTS() { return getToken(CodexLatinusParser.TWO_POINTS, 0); }
		public Argument_variable_typeContext argument_variable_type() {
			return getRuleContext(Argument_variable_typeContext.class,0);
		}
		public ArgumentVariableDeclarationContext(ArgumentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusParserListener ) ((CodexLatinusParserListener)listener).enterArgumentVariableDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusParserListener ) ((CodexLatinusParserListener)listener).exitArgumentVariableDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusParserVisitor ) return ((CodexLatinusParserVisitor<? extends T>)visitor).visitArgumentVariableDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArgumentArrayDeclarationnContext extends ArgumentContext {
		public TerminalNode SERIES() { return getToken(CodexLatinusParser.SERIES, 0); }
		public TerminalNode ID() { return getToken(CodexLatinusParser.ID, 0); }
		public TerminalNode TWO_POINTS() { return getToken(CodexLatinusParser.TWO_POINTS, 0); }
		public Argument_series_typeContext argument_series_type() {
			return getRuleContext(Argument_series_typeContext.class,0);
		}
		public ArgumentArrayDeclarationnContext(ArgumentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusParserListener ) ((CodexLatinusParserListener)listener).enterArgumentArrayDeclarationn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusParserListener ) ((CodexLatinusParserListener)listener).exitArgumentArrayDeclarationn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusParserVisitor ) return ((CodexLatinusParserVisitor<? extends T>)visitor).visitArgumentArrayDeclarationn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentContext argument() throws RecognitionException {
		ArgumentContext _localctx = new ArgumentContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_argument);
		try {
			setState(257);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ESTO:
				_localctx = new ArgumentVariableDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(249);
				match(ESTO);
				setState(250);
				match(ID);
				setState(251);
				match(TWO_POINTS);
				setState(252);
				argument_variable_type();
				}
				break;
			case SERIES:
				_localctx = new ArgumentArrayDeclarationnContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(253);
				match(SERIES);
				setState(254);
				match(ID);
				setState(255);
				match(TWO_POINTS);
				setState(256);
				argument_series_type();
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
	public static class Argument_variable_typeContext extends ParserRuleContext {
		public Argument_variable_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argument_variable_type; }
	 
		public Argument_variable_typeContext() { }
		public void copyFrom(Argument_variable_typeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArgumentNormalDeclarationContext extends Argument_variable_typeContext {
		public Variable_typeContext variable_type() {
			return getRuleContext(Variable_typeContext.class,0);
		}
		public ArgumentNormalDeclarationContext(Argument_variable_typeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusParserListener ) ((CodexLatinusParserListener)listener).enterArgumentNormalDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusParserListener ) ((CodexLatinusParserListener)listener).exitArgumentNormalDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusParserVisitor ) return ((CodexLatinusParserVisitor<? extends T>)visitor).visitArgumentNormalDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArgumentBooleanDeclarationContext extends Argument_variable_typeContext {
		public Boolean_valuesContext boolean_values() {
			return getRuleContext(Boolean_valuesContext.class,0);
		}
		public ArgumentBooleanDeclarationContext(Argument_variable_typeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusParserListener ) ((CodexLatinusParserListener)listener).enterArgumentBooleanDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusParserListener ) ((CodexLatinusParserListener)listener).exitArgumentBooleanDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusParserVisitor ) return ((CodexLatinusParserVisitor<? extends T>)visitor).visitArgumentBooleanDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Argument_variable_typeContext argument_variable_type() throws RecognitionException {
		Argument_variable_typeContext _localctx = new Argument_variable_typeContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_argument_variable_type);
		try {
			setState(263);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				_localctx = new ArgumentNormalDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(259);
				variable_type();
				}
				break;
			case 2:
				_localctx = new ArgumentBooleanDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(261);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
				case 1:
					{
					setState(260);
					boolean_values();
					}
					break;
				}
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
	public static class Argument_series_typeContext extends ParserRuleContext {
		public Argument_series_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argument_series_type; }
	 
		public Argument_series_typeContext() { }
		public void copyFrom(Argument_series_typeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArgumentArrayNormalDeclarationContext extends Argument_series_typeContext {
		public Variable_typeContext variable_type() {
			return getRuleContext(Variable_typeContext.class,0);
		}
		public ArgumentArrayNormalDeclarationContext(Argument_series_typeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusParserListener ) ((CodexLatinusParserListener)listener).enterArgumentArrayNormalDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusParserListener ) ((CodexLatinusParserListener)listener).exitArgumentArrayNormalDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusParserVisitor ) return ((CodexLatinusParserVisitor<? extends T>)visitor).visitArgumentArrayNormalDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArgumentArrayBooleanDeclarationContext extends Argument_series_typeContext {
		public Boolean_valuesContext boolean_values() {
			return getRuleContext(Boolean_valuesContext.class,0);
		}
		public ArgumentArrayBooleanDeclarationContext(Argument_series_typeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusParserListener ) ((CodexLatinusParserListener)listener).enterArgumentArrayBooleanDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusParserListener ) ((CodexLatinusParserListener)listener).exitArgumentArrayBooleanDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusParserVisitor ) return ((CodexLatinusParserVisitor<? extends T>)visitor).visitArgumentArrayBooleanDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Argument_series_typeContext argument_series_type() throws RecognitionException {
		Argument_series_typeContext _localctx = new Argument_series_typeContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_argument_series_type);
		try {
			setState(269);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				_localctx = new ArgumentArrayNormalDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(265);
				variable_type();
				}
				break;
			case 2:
				_localctx = new ArgumentArrayBooleanDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(267);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
				case 1:
					{
					setState(266);
					boolean_values();
					}
					break;
				}
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
	public static class MuneraCodeSectionContext extends Maior_sectionContext {
		public TerminalNode MAIOR() { return getToken(CodexLatinusParser.MAIOR, 0); }
		public TerminalNode GREATER() { return getToken(CodexLatinusParser.GREATER, 0); }
		public Code_bodyContext code_body() {
			return getRuleContext(Code_bodyContext.class,0);
		}
		public MuneraCodeSectionContext(Maior_sectionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusParserListener ) ((CodexLatinusParserListener)listener).enterMuneraCodeSection(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusParserListener ) ((CodexLatinusParserListener)listener).exitMuneraCodeSection(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusParserVisitor ) return ((CodexLatinusParserVisitor<? extends T>)visitor).visitMuneraCodeSection(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Maior_sectionContext maior_section() throws RecognitionException {
		Maior_sectionContext _localctx = new Maior_sectionContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_maior_section);
		try {
			_localctx = new MuneraCodeSectionContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(271);
			match(MAIOR);
			setState(272);
			match(GREATER);
			setState(273);
			code_body(0);
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
	public static class Code_bodyContext extends ParserRuleContext {
		public Code_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_code_body; }
	 
		public Code_bodyContext() { }
		public void copyFrom(Code_bodyContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BlockControlListContext extends Code_bodyContext {
		public Code_bodyContext code_body() {
			return getRuleContext(Code_bodyContext.class,0);
		}
		public Control_blockContext control_block() {
			return getRuleContext(Control_blockContext.class,0);
		}
		public BlockControlListContext(Code_bodyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusParserListener ) ((CodexLatinusParserListener)listener).enterBlockControlList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusParserListener ) ((CodexLatinusParserListener)listener).exitBlockControlList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusParserVisitor ) return ((CodexLatinusParserVisitor<? extends T>)visitor).visitBlockControlList(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BlockSingleControlContext extends Code_bodyContext {
		public Control_blockContext control_block() {
			return getRuleContext(Control_blockContext.class,0);
		}
		public BlockSingleControlContext(Code_bodyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusParserListener ) ((CodexLatinusParserListener)listener).enterBlockSingleControl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusParserListener ) ((CodexLatinusParserListener)listener).exitBlockSingleControl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusParserVisitor ) return ((CodexLatinusParserVisitor<? extends T>)visitor).visitBlockSingleControl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Code_bodyContext code_body() throws RecognitionException {
		return code_body(0);
	}

	private Code_bodyContext code_body(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Code_bodyContext _localctx = new Code_bodyContext(_ctx, _parentState);
		Code_bodyContext _prevctx = _localctx;
		int _startState = 34;
		enterRecursionRule(_localctx, 34, RULE_code_body, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new BlockSingleControlContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(276);
			control_block();
			}
			_ctx.stop = _input.LT(-1);
			setState(282);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new BlockControlListContext(new Code_bodyContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_code_body);
					setState(278);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(279);
					control_block();
					}
					} 
				}
				setState(284);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
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
	public static class Control_blockContext extends ParserRuleContext {
		public Control_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_control_block; }
	 
		public Control_blockContext() { }
		public void copyFrom(Control_blockContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LocalNestedVariableUsageContext extends Control_blockContext {
		public Nested_variables_usageContext nested_variables_usage() {
			return getRuleContext(Nested_variables_usageContext.class,0);
		}
		public LocalNestedVariableUsageContext(Control_blockContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusParserListener ) ((CodexLatinusParserListener)listener).enterLocalNestedVariableUsage(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusParserListener ) ((CodexLatinusParserListener)listener).exitLocalNestedVariableUsage(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusParserVisitor ) return ((CodexLatinusParserVisitor<? extends T>)visitor).visitLocalNestedVariableUsage(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LocalStructPropertySetterContext extends Control_blockContext {
		public Struct_variable_setContext struct_variable_set() {
			return getRuleContext(Struct_variable_setContext.class,0);
		}
		public LocalStructPropertySetterContext(Control_blockContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusParserListener ) ((CodexLatinusParserListener)listener).enterLocalStructPropertySetter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusParserListener ) ((CodexLatinusParserListener)listener).exitLocalStructPropertySetter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusParserVisitor ) return ((CodexLatinusParserVisitor<? extends T>)visitor).visitLocalStructPropertySetter(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LoopControlActionContext extends Control_blockContext {
		public Loop_controlContext loop_control() {
			return getRuleContext(Loop_controlContext.class,0);
		}
		public LoopControlActionContext(Control_blockContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusParserListener ) ((CodexLatinusParserListener)listener).enterLoopControlAction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusParserListener ) ((CodexLatinusParserListener)listener).exitLoopControlAction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusParserVisitor ) return ((CodexLatinusParserVisitor<? extends T>)visitor).visitLoopControlAction(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FunctionSingleCallContext extends Control_blockContext {
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public TerminalNode DOT_COMMA() { return getToken(CodexLatinusParser.DOT_COMMA, 0); }
		public FunctionSingleCallContext(Control_blockContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusParserListener ) ((CodexLatinusParserListener)listener).enterFunctionSingleCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusParserListener ) ((CodexLatinusParserListener)listener).exitFunctionSingleCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusParserVisitor ) return ((CodexLatinusParserVisitor<? extends T>)visitor).visitFunctionSingleCall(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LocalVariableRedefinitionContext extends Control_blockContext {
		public Variable_ussageContext variable_ussage() {
			return getRuleContext(Variable_ussageContext.class,0);
		}
		public LocalVariableRedefinitionContext(Control_blockContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusParserListener ) ((CodexLatinusParserListener)listener).enterLocalVariableRedefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusParserListener ) ((CodexLatinusParserListener)listener).exitLocalVariableRedefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusParserVisitor ) return ((CodexLatinusParserVisitor<? extends T>)visitor).visitLocalVariableRedefinition(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LocalAbbreviatedOperationContext extends Control_blockContext {
		public Abbreviated_operationContext abbreviated_operation() {
			return getRuleContext(Abbreviated_operationContext.class,0);
		}
		public LocalAbbreviatedOperationContext(Control_blockContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusParserListener ) ((CodexLatinusParserListener)listener).enterLocalAbbreviatedOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusParserListener ) ((CodexLatinusParserListener)listener).exitLocalAbbreviatedOperation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusParserVisitor ) return ((CodexLatinusParserVisitor<? extends T>)visitor).visitLocalAbbreviatedOperation(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BlockCodeContext extends Control_blockContext {
		public Block_codeContext block_code() {
			return getRuleContext(Block_codeContext.class,0);
		}
		public BlockCodeContext(Control_blockContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusParserListener ) ((CodexLatinusParserListener)listener).enterBlockCode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusParserListener ) ((CodexLatinusParserListener)listener).exitBlockCode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusParserVisitor ) return ((CodexLatinusParserVisitor<? extends T>)visitor).visitBlockCode(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LocalStructArrayDefinitionContext extends Control_blockContext {
		public Struct_array_propertyContext struct_array_property() {
			return getRuleContext(Struct_array_propertyContext.class,0);
		}
		public LocalStructArrayDefinitionContext(Control_blockContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusParserListener ) ((CodexLatinusParserListener)listener).enterLocalStructArrayDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusParserListener ) ((CodexLatinusParserListener)listener).exitLocalStructArrayDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusParserVisitor ) return ((CodexLatinusParserVisitor<? extends T>)visitor).visitLocalStructArrayDefinition(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LocalStructArraySetterContext extends Control_blockContext {
		public Struct_array_setContext struct_array_set() {
			return getRuleContext(Struct_array_setContext.class,0);
		}
		public LocalStructArraySetterContext(Control_blockContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusParserListener ) ((CodexLatinusParserListener)listener).enterLocalStructArraySetter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusParserListener ) ((CodexLatinusParserListener)listener).exitLocalStructArraySetter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusParserVisitor ) return ((CodexLatinusParserVisitor<? extends T>)visitor).visitLocalStructArraySetter(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ConsoleActionsContext extends Control_blockContext {
		public Console_actionsContext console_actions() {
			return getRuleContext(Console_actionsContext.class,0);
		}
		public ConsoleActionsContext(Control_blockContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusParserListener ) ((CodexLatinusParserListener)listener).enterConsoleActions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusParserListener ) ((CodexLatinusParserListener)listener).exitConsoleActions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusParserVisitor ) return ((CodexLatinusParserVisitor<? extends T>)visitor).visitConsoleActions(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ReturnControlActionContext extends Control_blockContext {
		public Return_controlContext return_control() {
			return getRuleContext(Return_controlContext.class,0);
		}
		public ReturnControlActionContext(Control_blockContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusParserListener ) ((CodexLatinusParserListener)listener).enterReturnControlAction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusParserListener ) ((CodexLatinusParserListener)listener).exitReturnControlAction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusParserVisitor ) return ((CodexLatinusParserVisitor<? extends T>)visitor).visitReturnControlAction(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LocalArrayRedefinitionContext extends Control_blockContext {
		public Array_ussageContext array_ussage() {
			return getRuleContext(Array_ussageContext.class,0);
		}
		public LocalArrayRedefinitionContext(Control_blockContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusParserListener ) ((CodexLatinusParserListener)listener).enterLocalArrayRedefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusParserListener ) ((CodexLatinusParserListener)listener).exitLocalArrayRedefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusParserVisitor ) return ((CodexLatinusParserVisitor<? extends T>)visitor).visitLocalArrayRedefinition(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LocalStructRedefinitionContext extends Control_blockContext {
		public Struct_ussageContext struct_ussage() {
			return getRuleContext(Struct_ussageContext.class,0);
		}
		public LocalStructRedefinitionContext(Control_blockContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusParserListener ) ((CodexLatinusParserListener)listener).enterLocalStructRedefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusParserListener ) ((CodexLatinusParserListener)listener).exitLocalStructRedefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusParserVisitor ) return ((CodexLatinusParserVisitor<? extends T>)visitor).visitLocalStructRedefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Control_blockContext control_block() throws RecognitionException {
		Control_blockContext _localctx = new Control_blockContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_control_block);
		try {
			setState(300);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				_localctx = new BlockCodeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(285);
				block_code();
				}
				break;
			case 2:
				_localctx = new ConsoleActionsContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(286);
				console_actions();
				}
				break;
			case 3:
				_localctx = new FunctionSingleCallContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(287);
				function_call();
				setState(288);
				match(DOT_COMMA);
				}
				break;
			case 4:
				_localctx = new LoopControlActionContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(290);
				loop_control();
				}
				break;
			case 5:
				_localctx = new ReturnControlActionContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(291);
				return_control();
				}
				break;
			case 6:
				_localctx = new LocalAbbreviatedOperationContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(292);
				abbreviated_operation();
				}
				break;
			case 7:
				_localctx = new LocalVariableRedefinitionContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(293);
				variable_ussage();
				}
				break;
			case 8:
				_localctx = new LocalArrayRedefinitionContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(294);
				array_ussage();
				}
				break;
			case 9:
				_localctx = new LocalStructArrayDefinitionContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(295);
				struct_array_property();
				}
				break;
			case 10:
				_localctx = new LocalStructRedefinitionContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(296);
				struct_ussage();
				}
				break;
			case 11:
				_localctx = new LocalStructArraySetterContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(297);
				struct_array_set();
				}
				break;
			case 12:
				_localctx = new LocalStructPropertySetterContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(298);
				struct_variable_set();
				}
				break;
			case 13:
				_localctx = new LocalNestedVariableUsageContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(299);
				nested_variables_usage();
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
	public static class Return_controlContext extends ParserRuleContext {
		public Return_controlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return_control; }
	 
		public Return_controlContext() { }
		public void copyFrom(Return_controlContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ReturnVoidContext extends Return_controlContext {
		public TerminalNode REDDERE() { return getToken(CodexLatinusParser.REDDERE, 0); }
		public TerminalNode DOT_COMMA() { return getToken(CodexLatinusParser.DOT_COMMA, 0); }
		public ReturnVoidContext(Return_controlContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusParserListener ) ((CodexLatinusParserListener)listener).enterReturnVoid(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusParserListener ) ((CodexLatinusParserListener)listener).exitReturnVoid(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusParserVisitor ) return ((CodexLatinusParserVisitor<? extends T>)visitor).visitReturnVoid(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ReturnWithValueContext extends Return_controlContext {
		public TerminalNode REDDERE() { return getToken(CodexLatinusParser.REDDERE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode DOT_COMMA() { return getToken(CodexLatinusParser.DOT_COMMA, 0); }
		public ReturnWithValueContext(Return_controlContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusParserListener ) ((CodexLatinusParserListener)listener).enterReturnWithValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusParserListener ) ((CodexLatinusParserListener)listener).exitReturnWithValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusParserVisitor ) return ((CodexLatinusParserVisitor<? extends T>)visitor).visitReturnWithValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Return_controlContext return_control() throws RecognitionException {
		Return_controlContext _localctx = new Return_controlContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_return_control);
		try {
			setState(308);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				_localctx = new ReturnWithValueContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(302);
				match(REDDERE);
				setState(303);
				expression(0);
				setState(304);
				match(DOT_COMMA);
				}
				break;
			case 2:
				_localctx = new ReturnVoidContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(306);
				match(REDDERE);
				setState(307);
				match(DOT_COMMA);
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
	public static class Loop_controlContext extends ParserRuleContext {
		public Loop_controlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loop_control; }
	 
		public Loop_controlContext() { }
		public void copyFrom(Loop_controlContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LoopContinueContext extends Loop_controlContext {
		public TerminalNode PERGE() { return getToken(CodexLatinusParser.PERGE, 0); }
		public TerminalNode DOT_COMMA() { return getToken(CodexLatinusParser.DOT_COMMA, 0); }
		public LoopContinueContext(Loop_controlContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusParserListener ) ((CodexLatinusParserListener)listener).enterLoopContinue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusParserListener ) ((CodexLatinusParserListener)listener).exitLoopContinue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusParserVisitor ) return ((CodexLatinusParserVisitor<? extends T>)visitor).visitLoopContinue(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LoopBreakContext extends Loop_controlContext {
		public TerminalNode INTERRUMPE() { return getToken(CodexLatinusParser.INTERRUMPE, 0); }
		public TerminalNode DOT_COMMA() { return getToken(CodexLatinusParser.DOT_COMMA, 0); }
		public LoopBreakContext(Loop_controlContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusParserListener ) ((CodexLatinusParserListener)listener).enterLoopBreak(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusParserListener ) ((CodexLatinusParserListener)listener).exitLoopBreak(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusParserVisitor ) return ((CodexLatinusParserVisitor<? extends T>)visitor).visitLoopBreak(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Loop_controlContext loop_control() throws RecognitionException {
		Loop_controlContext _localctx = new Loop_controlContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_loop_control);
		try {
			setState(314);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PERGE:
				_localctx = new LoopContinueContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(310);
				match(PERGE);
				setState(311);
				match(DOT_COMMA);
				}
				break;
			case INTERRUMPE:
				_localctx = new LoopBreakContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(312);
				match(INTERRUMPE);
				setState(313);
				match(DOT_COMMA);
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
	public static class Console_actionsContext extends ParserRuleContext {
		public Console_actionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_console_actions; }
	 
		public Console_actionsContext() { }
		public void copyFrom(Console_actionsContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ReadVariableInputContext extends Console_actionsContext {
		public Nest_variableContext nest_variable() {
			return getRuleContext(Nest_variableContext.class,0);
		}
		public TerminalNode READ() { return getToken(CodexLatinusParser.READ, 0); }
		public ReadVariableInputContext(Console_actionsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusParserListener ) ((CodexLatinusParserListener)listener).enterReadVariableInput(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusParserListener ) ((CodexLatinusParserListener)listener).exitReadVariableInput(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusParserVisitor ) return ((CodexLatinusParserVisitor<? extends T>)visitor).visitReadVariableInput(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PrintActionContext extends Console_actionsContext {
		public TerminalNode PRINT() { return getToken(CodexLatinusParser.PRINT, 0); }
		public Print_functionContext print_function() {
			return getRuleContext(Print_functionContext.class,0);
		}
		public TerminalNode DOT_COMMA() { return getToken(CodexLatinusParser.DOT_COMMA, 0); }
		public PrintActionContext(Console_actionsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusParserListener ) ((CodexLatinusParserListener)listener).enterPrintAction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusParserListener ) ((CodexLatinusParserListener)listener).exitPrintAction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusParserVisitor ) return ((CodexLatinusParserVisitor<? extends T>)visitor).visitPrintAction(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ReadInputContext extends Console_actionsContext {
		public TerminalNode READ() { return getToken(CodexLatinusParser.READ, 0); }
		public ReadInputContext(Console_actionsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusParserListener ) ((CodexLatinusParserListener)listener).enterReadInput(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusParserListener ) ((CodexLatinusParserListener)listener).exitReadInput(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusParserVisitor ) return ((CodexLatinusParserVisitor<? extends T>)visitor).visitReadInput(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Console_actionsContext console_actions() throws RecognitionException {
		Console_actionsContext _localctx = new Console_actionsContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_console_actions);
		try {
			setState(324);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				_localctx = new ReadVariableInputContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(316);
				nest_variable();
				setState(317);
				match(READ);
				}
				break;
			case READ:
				_localctx = new ReadInputContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(319);
				match(READ);
				}
				break;
			case PRINT:
				_localctx = new PrintActionContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(320);
				match(PRINT);
				setState(321);
				print_function(0);
				setState(322);
				match(DOT_COMMA);
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
	public static class Print_functionContext extends ParserRuleContext {
		public Print_functionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print_function; }
	 
		public Print_functionContext() { }
		public void copyFrom(Print_functionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PrintSingleExprContext extends Print_functionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public PrintSingleExprContext(Print_functionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusParserListener ) ((CodexLatinusParserListener)listener).enterPrintSingleExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusParserListener ) ((CodexLatinusParserListener)listener).exitPrintSingleExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusParserVisitor ) return ((CodexLatinusParserVisitor<? extends T>)visitor).visitPrintSingleExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PrintMultipleExprContext extends Print_functionContext {
		public Print_functionContext print_function() {
			return getRuleContext(Print_functionContext.class,0);
		}
		public TerminalNode PRINT() { return getToken(CodexLatinusParser.PRINT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public PrintMultipleExprContext(Print_functionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusParserListener ) ((CodexLatinusParserListener)listener).enterPrintMultipleExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusParserListener ) ((CodexLatinusParserListener)listener).exitPrintMultipleExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusParserVisitor ) return ((CodexLatinusParserVisitor<? extends T>)visitor).visitPrintMultipleExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Print_functionContext print_function() throws RecognitionException {
		return print_function(0);
	}

	private Print_functionContext print_function(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Print_functionContext _localctx = new Print_functionContext(_ctx, _parentState);
		Print_functionContext _prevctx = _localctx;
		int _startState = 44;
		enterRecursionRule(_localctx, 44, RULE_print_function, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new PrintSingleExprContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(327);
			expression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(334);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new PrintMultipleExprContext(new Print_functionContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_print_function);
					setState(329);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(330);
					match(PRINT);
					setState(331);
					expression(0);
					}
					} 
				}
				setState(336);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
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
	public static class Block_codeContext extends ParserRuleContext {
		public Block_codeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block_code; }
	 
		public Block_codeContext() { }
		public void copyFrom(Block_codeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CodeBlockDoWhileContext extends Block_codeContext {
		public Do_while_statementContext do_while_statement() {
			return getRuleContext(Do_while_statementContext.class,0);
		}
		public CodeBlockDoWhileContext(Block_codeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusParserListener ) ((CodexLatinusParserListener)listener).enterCodeBlockDoWhile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusParserListener ) ((CodexLatinusParserListener)listener).exitCodeBlockDoWhile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusParserVisitor ) return ((CodexLatinusParserVisitor<? extends T>)visitor).visitCodeBlockDoWhile(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CodeBlockWhileContext extends Block_codeContext {
		public While_statementContext while_statement() {
			return getRuleContext(While_statementContext.class,0);
		}
		public CodeBlockWhileContext(Block_codeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusParserListener ) ((CodexLatinusParserListener)listener).enterCodeBlockWhile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusParserListener ) ((CodexLatinusParserListener)listener).exitCodeBlockWhile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusParserVisitor ) return ((CodexLatinusParserVisitor<? extends T>)visitor).visitCodeBlockWhile(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CodeBlockIfContext extends Block_codeContext {
		public If_statementContext if_statement() {
			return getRuleContext(If_statementContext.class,0);
		}
		public CodeBlockIfContext(Block_codeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusParserListener ) ((CodexLatinusParserListener)listener).enterCodeBlockIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusParserListener ) ((CodexLatinusParserListener)listener).exitCodeBlockIf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusParserVisitor ) return ((CodexLatinusParserVisitor<? extends T>)visitor).visitCodeBlockIf(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CodeBlockForContext extends Block_codeContext {
		public For_statementContext for_statement() {
			return getRuleContext(For_statementContext.class,0);
		}
		public CodeBlockForContext(Block_codeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusParserListener ) ((CodexLatinusParserListener)listener).enterCodeBlockFor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusParserListener ) ((CodexLatinusParserListener)listener).exitCodeBlockFor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusParserVisitor ) return ((CodexLatinusParserVisitor<? extends T>)visitor).visitCodeBlockFor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Block_codeContext block_code() throws RecognitionException {
		Block_codeContext _localctx = new Block_codeContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_block_code);
		try {
			setState(341);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SI:
				_localctx = new CodeBlockIfContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(337);
				if_statement();
				}
				break;
			case DUM:
				_localctx = new CodeBlockWhileContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(338);
				while_statement();
				}
				break;
			case FACERE:
				_localctx = new CodeBlockDoWhileContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(339);
				do_while_statement();
				}
				break;
			case PER:
				_localctx = new CodeBlockForContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(340);
				for_statement();
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
	public static class If_statementContext extends ParserRuleContext {
		public If_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_statement; }
	 
		public If_statementContext() { }
		public void copyFrom(If_statementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IfStatementContext extends If_statementContext {
		public TerminalNode SI() { return getToken(CodexLatinusParser.SI, 0); }
		public TerminalNode INIT_PARENT() { return getToken(CodexLatinusParser.INIT_PARENT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode FINAL_PARENT() { return getToken(CodexLatinusParser.FINAL_PARENT, 0); }
		public TerminalNode INIT_BRACE() { return getToken(CodexLatinusParser.INIT_BRACE, 0); }
		public Code_bodyContext code_body() {
			return getRuleContext(Code_bodyContext.class,0);
		}
		public TerminalNode FINAL_BRACE() { return getToken(CodexLatinusParser.FINAL_BRACE, 0); }
		public Else_if_listContext else_if_list() {
			return getRuleContext(Else_if_listContext.class,0);
		}
		public Else_statementContext else_statement() {
			return getRuleContext(Else_statementContext.class,0);
		}
		public TerminalNode FINIS() { return getToken(CodexLatinusParser.FINIS, 0); }
		public TerminalNode DOT_COMMA() { return getToken(CodexLatinusParser.DOT_COMMA, 0); }
		public IfStatementContext(If_statementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusParserListener ) ((CodexLatinusParserListener)listener).enterIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusParserListener ) ((CodexLatinusParserListener)listener).exitIfStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusParserVisitor ) return ((CodexLatinusParserVisitor<? extends T>)visitor).visitIfStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_statementContext if_statement() throws RecognitionException {
		If_statementContext _localctx = new If_statementContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_if_statement);
		try {
			_localctx = new IfStatementContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(343);
			match(SI);
			setState(344);
			match(INIT_PARENT);
			setState(345);
			expression(0);
			setState(346);
			match(FINAL_PARENT);
			setState(347);
			match(INIT_BRACE);
			setState(348);
			code_body(0);
			setState(349);
			match(FINAL_BRACE);
			setState(350);
			else_if_list(0);
			setState(351);
			else_statement();
			setState(352);
			match(FINIS);
			setState(353);
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
	public static class Else_if_listContext extends ParserRuleContext {
		public Else_if_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_else_if_list; }
	 
		public Else_if_listContext() { }
		public void copyFrom(Else_if_listContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ElseIfEmptyContext extends Else_if_listContext {
		public ElseIfEmptyContext(Else_if_listContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusParserListener ) ((CodexLatinusParserListener)listener).enterElseIfEmpty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusParserListener ) ((CodexLatinusParserListener)listener).exitElseIfEmpty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusParserVisitor ) return ((CodexLatinusParserVisitor<? extends T>)visitor).visitElseIfEmpty(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ElseIfListContext extends Else_if_listContext {
		public Else_if_listContext else_if_list() {
			return getRuleContext(Else_if_listContext.class,0);
		}
		public Else_if_clauseContext else_if_clause() {
			return getRuleContext(Else_if_clauseContext.class,0);
		}
		public ElseIfListContext(Else_if_listContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusParserListener ) ((CodexLatinusParserListener)listener).enterElseIfList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusParserListener ) ((CodexLatinusParserListener)listener).exitElseIfList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusParserVisitor ) return ((CodexLatinusParserVisitor<? extends T>)visitor).visitElseIfList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Else_if_listContext else_if_list() throws RecognitionException {
		return else_if_list(0);
	}

	private Else_if_listContext else_if_list(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Else_if_listContext _localctx = new Else_if_listContext(_ctx, _parentState);
		Else_if_listContext _prevctx = _localctx;
		int _startState = 50;
		enterRecursionRule(_localctx, 50, RULE_else_if_list, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new ElseIfEmptyContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			}
			_ctx.stop = _input.LT(-1);
			setState(360);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ElseIfListContext(new Else_if_listContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_else_if_list);
					setState(356);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(357);
					else_if_clause();
					}
					} 
				}
				setState(362);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
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
	public static class Else_if_clauseContext extends ParserRuleContext {
		public Else_if_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_else_if_clause; }
	 
		public Else_if_clauseContext() { }
		public void copyFrom(Else_if_clauseContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ElseIfClauseContext extends Else_if_clauseContext {
		public TerminalNode ALITER() { return getToken(CodexLatinusParser.ALITER, 0); }
		public TerminalNode INIT_PARENT() { return getToken(CodexLatinusParser.INIT_PARENT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode FINAL_PARENT() { return getToken(CodexLatinusParser.FINAL_PARENT, 0); }
		public TerminalNode INIT_BRACE() { return getToken(CodexLatinusParser.INIT_BRACE, 0); }
		public Code_bodyContext code_body() {
			return getRuleContext(Code_bodyContext.class,0);
		}
		public TerminalNode FINAL_BRACE() { return getToken(CodexLatinusParser.FINAL_BRACE, 0); }
		public ElseIfClauseContext(Else_if_clauseContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusParserListener ) ((CodexLatinusParserListener)listener).enterElseIfClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusParserListener ) ((CodexLatinusParserListener)listener).exitElseIfClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusParserVisitor ) return ((CodexLatinusParserVisitor<? extends T>)visitor).visitElseIfClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Else_if_clauseContext else_if_clause() throws RecognitionException {
		Else_if_clauseContext _localctx = new Else_if_clauseContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_else_if_clause);
		try {
			_localctx = new ElseIfClauseContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(363);
			match(ALITER);
			setState(364);
			match(INIT_PARENT);
			setState(365);
			expression(0);
			setState(366);
			match(FINAL_PARENT);
			setState(367);
			match(INIT_BRACE);
			setState(368);
			code_body(0);
			setState(369);
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
	public static class Else_statementContext extends ParserRuleContext {
		public Else_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_else_statement; }
	 
		public Else_statementContext() { }
		public void copyFrom(Else_statementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ElseEmptyContext extends Else_statementContext {
		public ElseEmptyContext(Else_statementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusParserListener ) ((CodexLatinusParserListener)listener).enterElseEmpty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusParserListener ) ((CodexLatinusParserListener)listener).exitElseEmpty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusParserVisitor ) return ((CodexLatinusParserVisitor<? extends T>)visitor).visitElseEmpty(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ElseBlockContext extends Else_statementContext {
		public TerminalNode ALITER() { return getToken(CodexLatinusParser.ALITER, 0); }
		public TerminalNode INIT_BRACE() { return getToken(CodexLatinusParser.INIT_BRACE, 0); }
		public Code_bodyContext code_body() {
			return getRuleContext(Code_bodyContext.class,0);
		}
		public TerminalNode FINAL_BRACE() { return getToken(CodexLatinusParser.FINAL_BRACE, 0); }
		public ElseBlockContext(Else_statementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusParserListener ) ((CodexLatinusParserListener)listener).enterElseBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusParserListener ) ((CodexLatinusParserListener)listener).exitElseBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusParserVisitor ) return ((CodexLatinusParserVisitor<? extends T>)visitor).visitElseBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Else_statementContext else_statement() throws RecognitionException {
		Else_statementContext _localctx = new Else_statementContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_else_statement);
		try {
			setState(377);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ALITER:
				_localctx = new ElseBlockContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(371);
				match(ALITER);
				setState(372);
				match(INIT_BRACE);
				setState(373);
				code_body(0);
				setState(374);
				match(FINAL_BRACE);
				}
				break;
			case FINIS:
				_localctx = new ElseEmptyContext(_localctx);
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
	public static class While_statementContext extends ParserRuleContext {
		public While_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_statement; }
	 
		public While_statementContext() { }
		public void copyFrom(While_statementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class WhileStatementContext extends While_statementContext {
		public TerminalNode DUM() { return getToken(CodexLatinusParser.DUM, 0); }
		public TerminalNode INIT_PARENT() { return getToken(CodexLatinusParser.INIT_PARENT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode FINAL_PARENT() { return getToken(CodexLatinusParser.FINAL_PARENT, 0); }
		public TerminalNode INIT_BRACE() { return getToken(CodexLatinusParser.INIT_BRACE, 0); }
		public Code_bodyContext code_body() {
			return getRuleContext(Code_bodyContext.class,0);
		}
		public TerminalNode FINAL_BRACE() { return getToken(CodexLatinusParser.FINAL_BRACE, 0); }
		public TerminalNode FINIS() { return getToken(CodexLatinusParser.FINIS, 0); }
		public TerminalNode DOT_COMMA() { return getToken(CodexLatinusParser.DOT_COMMA, 0); }
		public WhileStatementContext(While_statementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusParserListener ) ((CodexLatinusParserListener)listener).enterWhileStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusParserListener ) ((CodexLatinusParserListener)listener).exitWhileStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusParserVisitor ) return ((CodexLatinusParserVisitor<? extends T>)visitor).visitWhileStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final While_statementContext while_statement() throws RecognitionException {
		While_statementContext _localctx = new While_statementContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_while_statement);
		try {
			_localctx = new WhileStatementContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(379);
			match(DUM);
			setState(380);
			match(INIT_PARENT);
			setState(381);
			expression(0);
			setState(382);
			match(FINAL_PARENT);
			setState(383);
			match(INIT_BRACE);
			setState(384);
			code_body(0);
			setState(385);
			match(FINAL_BRACE);
			setState(386);
			match(FINIS);
			setState(387);
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
	public static class Do_while_statementContext extends ParserRuleContext {
		public Do_while_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_do_while_statement; }
	 
		public Do_while_statementContext() { }
		public void copyFrom(Do_while_statementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DoWhileStatementContext extends Do_while_statementContext {
		public TerminalNode FACERE() { return getToken(CodexLatinusParser.FACERE, 0); }
		public TerminalNode INIT_BRACE() { return getToken(CodexLatinusParser.INIT_BRACE, 0); }
		public Code_bodyContext code_body() {
			return getRuleContext(Code_bodyContext.class,0);
		}
		public TerminalNode FINAL_BRACE() { return getToken(CodexLatinusParser.FINAL_BRACE, 0); }
		public TerminalNode DUM() { return getToken(CodexLatinusParser.DUM, 0); }
		public TerminalNode INIT_PARENT() { return getToken(CodexLatinusParser.INIT_PARENT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode FINAL_PARENT() { return getToken(CodexLatinusParser.FINAL_PARENT, 0); }
		public TerminalNode DOT_COMMA() { return getToken(CodexLatinusParser.DOT_COMMA, 0); }
		public DoWhileStatementContext(Do_while_statementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusParserListener ) ((CodexLatinusParserListener)listener).enterDoWhileStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusParserListener ) ((CodexLatinusParserListener)listener).exitDoWhileStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusParserVisitor ) return ((CodexLatinusParserVisitor<? extends T>)visitor).visitDoWhileStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Do_while_statementContext do_while_statement() throws RecognitionException {
		Do_while_statementContext _localctx = new Do_while_statementContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_do_while_statement);
		try {
			_localctx = new DoWhileStatementContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(389);
			match(FACERE);
			setState(390);
			match(INIT_BRACE);
			setState(391);
			code_body(0);
			setState(392);
			match(FINAL_BRACE);
			setState(393);
			match(DUM);
			setState(394);
			match(INIT_PARENT);
			setState(395);
			expression(0);
			setState(396);
			match(FINAL_PARENT);
			setState(397);
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
	public static class For_statementContext extends ParserRuleContext {
		public For_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_statement; }
	 
		public For_statementContext() { }
		public void copyFrom(For_statementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ForStatementContext extends For_statementContext {
		public TerminalNode PER() { return getToken(CodexLatinusParser.PER, 0); }
		public TerminalNode INIT_PARENT() { return getToken(CodexLatinusParser.INIT_PARENT, 0); }
		public For_initContext for_init() {
			return getRuleContext(For_initContext.class,0);
		}
		public List<TerminalNode> DOT_COMMA() { return getTokens(CodexLatinusParser.DOT_COMMA); }
		public TerminalNode DOT_COMMA(int i) {
			return getToken(CodexLatinusParser.DOT_COMMA, i);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public For_updateContext for_update() {
			return getRuleContext(For_updateContext.class,0);
		}
		public TerminalNode FINAL_PARENT() { return getToken(CodexLatinusParser.FINAL_PARENT, 0); }
		public TerminalNode INIT_BRACE() { return getToken(CodexLatinusParser.INIT_BRACE, 0); }
		public Code_bodyContext code_body() {
			return getRuleContext(Code_bodyContext.class,0);
		}
		public TerminalNode FINAL_BRACE() { return getToken(CodexLatinusParser.FINAL_BRACE, 0); }
		public ForStatementContext(For_statementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusParserListener ) ((CodexLatinusParserListener)listener).enterForStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusParserListener ) ((CodexLatinusParserListener)listener).exitForStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusParserVisitor ) return ((CodexLatinusParserVisitor<? extends T>)visitor).visitForStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_statementContext for_statement() throws RecognitionException {
		For_statementContext _localctx = new For_statementContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_for_statement);
		try {
			_localctx = new ForStatementContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(399);
			match(PER);
			setState(400);
			match(INIT_PARENT);
			setState(401);
			for_init();
			setState(402);
			match(DOT_COMMA);
			setState(403);
			expression(0);
			setState(404);
			match(DOT_COMMA);
			setState(405);
			for_update();
			setState(406);
			match(FINAL_PARENT);
			setState(407);
			match(INIT_BRACE);
			setState(408);
			code_body(0);
			setState(409);
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
	public static class For_initContext extends ParserRuleContext {
		public For_initContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_init; }
	 
		public For_initContext() { }
		public void copyFrom(For_initContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ForInitAssignContext extends For_initContext {
		public TerminalNode ID() { return getToken(CodexLatinusParser.ID, 0); }
		public TerminalNode EQUAL() { return getToken(CodexLatinusParser.EQUAL, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ForInitAssignContext(For_initContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusParserListener ) ((CodexLatinusParserListener)listener).enterForInitAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusParserListener ) ((CodexLatinusParserListener)listener).exitForInitAssign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusParserVisitor ) return ((CodexLatinusParserVisitor<? extends T>)visitor).visitForInitAssign(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ForInitVarDeclContext extends For_initContext {
		public TerminalNode ESTO() { return getToken(CodexLatinusParser.ESTO, 0); }
		public TerminalNode ID() { return getToken(CodexLatinusParser.ID, 0); }
		public TerminalNode TWO_POINTS() { return getToken(CodexLatinusParser.TWO_POINTS, 0); }
		public Variable_typeContext variable_type() {
			return getRuleContext(Variable_typeContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ForInitVarDeclContext(For_initContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusParserListener ) ((CodexLatinusParserListener)listener).enterForInitVarDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusParserListener ) ((CodexLatinusParserListener)listener).exitForInitVarDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusParserVisitor ) return ((CodexLatinusParserVisitor<? extends T>)visitor).visitForInitVarDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_initContext for_init() throws RecognitionException {
		For_initContext _localctx = new For_initContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_for_init);
		try {
			setState(420);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ESTO:
				_localctx = new ForInitVarDeclContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(411);
				match(ESTO);
				setState(412);
				match(ID);
				setState(413);
				match(TWO_POINTS);
				setState(414);
				variable_type();
				setState(415);
				expression(0);
				}
				break;
			case ID:
				_localctx = new ForInitAssignContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(417);
				match(ID);
				setState(418);
				match(EQUAL);
				setState(419);
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
	public static class For_updateContext extends ParserRuleContext {
		public For_updateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_update; }
	 
		public For_updateContext() { }
		public void copyFrom(For_updateContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ForUpdateDecrementContext extends For_updateContext {
		public TerminalNode ID() { return getToken(CodexLatinusParser.ID, 0); }
		public TerminalNode ABREV_MINUS() { return getToken(CodexLatinusParser.ABREV_MINUS, 0); }
		public ForUpdateDecrementContext(For_updateContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusParserListener ) ((CodexLatinusParserListener)listener).enterForUpdateDecrement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusParserListener ) ((CodexLatinusParserListener)listener).exitForUpdateDecrement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusParserVisitor ) return ((CodexLatinusParserVisitor<? extends T>)visitor).visitForUpdateDecrement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ForUpdateAssignContext extends For_updateContext {
		public TerminalNode ID() { return getToken(CodexLatinusParser.ID, 0); }
		public TerminalNode EQUAL() { return getToken(CodexLatinusParser.EQUAL, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ForUpdateAssignContext(For_updateContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusParserListener ) ((CodexLatinusParserListener)listener).enterForUpdateAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusParserListener ) ((CodexLatinusParserListener)listener).exitForUpdateAssign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusParserVisitor ) return ((CodexLatinusParserVisitor<? extends T>)visitor).visitForUpdateAssign(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ForUpdateIncrementContext extends For_updateContext {
		public TerminalNode ID() { return getToken(CodexLatinusParser.ID, 0); }
		public TerminalNode ABREV_PLUS() { return getToken(CodexLatinusParser.ABREV_PLUS, 0); }
		public ForUpdateIncrementContext(For_updateContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusParserListener ) ((CodexLatinusParserListener)listener).enterForUpdateIncrement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusParserListener ) ((CodexLatinusParserListener)listener).exitForUpdateIncrement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusParserVisitor ) return ((CodexLatinusParserVisitor<? extends T>)visitor).visitForUpdateIncrement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_updateContext for_update() throws RecognitionException {
		For_updateContext _localctx = new For_updateContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_for_update);
		try {
			setState(429);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				_localctx = new ForUpdateIncrementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(422);
				match(ID);
				setState(423);
				match(ABREV_PLUS);
				}
				break;
			case 2:
				_localctx = new ForUpdateDecrementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(424);
				match(ID);
				setState(425);
				match(ABREV_MINUS);
				}
				break;
			case 3:
				_localctx = new ForUpdateAssignContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(426);
				match(ID);
				setState(427);
				match(EQUAL);
				setState(428);
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
		enterRule(_localctx, 66, RULE_variable_section);
		try {
			_localctx = new VariablesSectionContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(431);
			match(VARIABILES);
			setState(432);
			match(GREATER);
			setState(433);
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
		public Variabiles_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variabiles_body; }
	 
		public Variabiles_bodyContext() { }
		public void copyFrom(Variabiles_bodyContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DeclarationsVariablesListContext extends Variabiles_bodyContext {
		public Variabiles_bodyContext variabiles_body() {
			return getRuleContext(Variabiles_bodyContext.class,0);
		}
		public DeclarationsContext declarations() {
			return getRuleContext(DeclarationsContext.class,0);
		}
		public DeclarationsVariablesListContext(Variabiles_bodyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusParserListener ) ((CodexLatinusParserListener)listener).enterDeclarationsVariablesList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusParserListener ) ((CodexLatinusParserListener)listener).exitDeclarationsVariablesList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusParserVisitor ) return ((CodexLatinusParserVisitor<? extends T>)visitor).visitDeclarationsVariablesList(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DeclarationsSingleVariableContext extends Variabiles_bodyContext {
		public DeclarationsContext declarations() {
			return getRuleContext(DeclarationsContext.class,0);
		}
		public DeclarationsSingleVariableContext(Variabiles_bodyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusParserListener ) ((CodexLatinusParserListener)listener).enterDeclarationsSingleVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusParserListener ) ((CodexLatinusParserListener)listener).exitDeclarationsSingleVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusParserVisitor ) return ((CodexLatinusParserVisitor<? extends T>)visitor).visitDeclarationsSingleVariable(this);
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
		int _startState = 68;
		enterRecursionRule(_localctx, 68, RULE_variabiles_body, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new DeclarationsSingleVariableContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(436);
			declarations();
			}
			_ctx.stop = _input.LT(-1);
			setState(442);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new DeclarationsVariablesListContext(new Variabiles_bodyContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_variabiles_body);
					setState(438);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(439);
					declarations();
					}
					} 
				}
				setState(444);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
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
	public static class VariableRedefinedUssageContext extends DeclarationsContext {
		public Variable_ussageContext variable_ussage() {
			return getRuleContext(Variable_ussageContext.class,0);
		}
		public VariableRedefinedUssageContext(DeclarationsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusParserListener ) ((CodexLatinusParserListener)listener).enterVariableRedefinedUssage(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusParserListener ) ((CodexLatinusParserListener)listener).exitVariableRedefinedUssage(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusParserVisitor ) return ((CodexLatinusParserVisitor<? extends T>)visitor).visitVariableRedefinedUssage(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class GlobalAbbreviatedOperationContext extends DeclarationsContext {
		public Abbreviated_operationContext abbreviated_operation() {
			return getRuleContext(Abbreviated_operationContext.class,0);
		}
		public GlobalAbbreviatedOperationContext(DeclarationsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusParserListener ) ((CodexLatinusParserListener)listener).enterGlobalAbbreviatedOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusParserListener ) ((CodexLatinusParserListener)listener).exitGlobalAbbreviatedOperation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusParserVisitor ) return ((CodexLatinusParserVisitor<? extends T>)visitor).visitGlobalAbbreviatedOperation(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StructRedefinedUsageContext extends DeclarationsContext {
		public Struct_ussageContext struct_ussage() {
			return getRuleContext(Struct_ussageContext.class,0);
		}
		public StructRedefinedUsageContext(DeclarationsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusParserListener ) ((CodexLatinusParserListener)listener).enterStructRedefinedUsage(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusParserListener ) ((CodexLatinusParserListener)listener).exitStructRedefinedUsage(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusParserVisitor ) return ((CodexLatinusParserVisitor<? extends T>)visitor).visitStructRedefinedUsage(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArrayRedefinedUssageContext extends DeclarationsContext {
		public Array_ussageContext array_ussage() {
			return getRuleContext(Array_ussageContext.class,0);
		}
		public ArrayRedefinedUssageContext(DeclarationsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusParserListener ) ((CodexLatinusParserListener)listener).enterArrayRedefinedUssage(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusParserListener ) ((CodexLatinusParserListener)listener).exitArrayRedefinedUssage(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusParserVisitor ) return ((CodexLatinusParserVisitor<? extends T>)visitor).visitArrayRedefinedUssage(this);
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
	public static class GlobalNestedVariableUsageContext extends DeclarationsContext {
		public Nested_variables_usageContext nested_variables_usage() {
			return getRuleContext(Nested_variables_usageContext.class,0);
		}
		public GlobalNestedVariableUsageContext(DeclarationsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusParserListener ) ((CodexLatinusParserListener)listener).enterGlobalNestedVariableUsage(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusParserListener ) ((CodexLatinusParserListener)listener).exitGlobalNestedVariableUsage(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusParserVisitor ) return ((CodexLatinusParserVisitor<? extends T>)visitor).visitGlobalNestedVariableUsage(this);
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
	public static class StructVariableSetterContext extends DeclarationsContext {
		public Struct_variable_setContext struct_variable_set() {
			return getRuleContext(Struct_variable_setContext.class,0);
		}
		public StructVariableSetterContext(DeclarationsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusParserListener ) ((CodexLatinusParserListener)listener).enterStructVariableSetter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusParserListener ) ((CodexLatinusParserListener)listener).exitStructVariableSetter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusParserVisitor ) return ((CodexLatinusParserVisitor<? extends T>)visitor).visitStructVariableSetter(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StructArrayzSetterContext extends DeclarationsContext {
		public Struct_array_setContext struct_array_set() {
			return getRuleContext(Struct_array_setContext.class,0);
		}
		public StructArrayzSetterContext(DeclarationsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusParserListener ) ((CodexLatinusParserListener)listener).enterStructArrayzSetter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusParserListener ) ((CodexLatinusParserListener)listener).exitStructArrayzSetter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusParserVisitor ) return ((CodexLatinusParserVisitor<? extends T>)visitor).visitStructArrayzSetter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationsContext declarations() throws RecognitionException {
		DeclarationsContext _localctx = new DeclarationsContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_declarations);
		try {
			setState(459);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				_localctx = new VariableInstanceContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(445);
				variable_declaration();
				}
				break;
			case 2:
				_localctx = new VariableRedefinedUssageContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(446);
				variable_ussage();
				}
				break;
			case 3:
				_localctx = new BooleanVariableInstanceContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(447);
				boolean_declaration();
				}
				break;
			case 4:
				_localctx = new NormalArrayInstanceContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(448);
				normal_array();
				}
				break;
			case 5:
				_localctx = new BooleanArrayInstanceContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(449);
				boolean_array();
				}
				break;
			case 6:
				_localctx = new ArrayRedefinedUssageContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(450);
				array_ussage();
				}
				break;
			case 7:
				_localctx = new StructDefinitionContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(451);
				struct_declaration();
				}
				break;
			case 8:
				_localctx = new StructSetPropertyContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(452);
				struct_array_property();
				}
				break;
			case 9:
				_localctx = new StructVariableInstanceContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(453);
				struct_instance();
				}
				break;
			case 10:
				_localctx = new StructRedefinedUsageContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(454);
				struct_ussage();
				}
				break;
			case 11:
				_localctx = new StructVariableSetterContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(455);
				struct_variable_set();
				}
				break;
			case 12:
				_localctx = new StructArrayzSetterContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(456);
				struct_array_set();
				}
				break;
			case 13:
				_localctx = new GlobalAbbreviatedOperationContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(457);
				abbreviated_operation();
				}
				break;
			case 14:
				_localctx = new GlobalNestedVariableUsageContext(_localctx);
				enterOuterAlt(_localctx, 14);
				{
				setState(458);
				nested_variables_usage();
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
	public static class Struct_ussageContext extends ParserRuleContext {
		public Struct_ussageContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_struct_ussage; }
	 
		public Struct_ussageContext() { }
		public void copyFrom(Struct_ussageContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StructInstanceUssageContext extends Struct_ussageContext {
		public TerminalNode ID() { return getToken(CodexLatinusParser.ID, 0); }
		public TerminalNode EQUAL() { return getToken(CodexLatinusParser.EQUAL, 0); }
		public TerminalNode INIT_BRACE() { return getToken(CodexLatinusParser.INIT_BRACE, 0); }
		public Struct_data_listContext struct_data_list() {
			return getRuleContext(Struct_data_listContext.class,0);
		}
		public TerminalNode FINAL_BRACE() { return getToken(CodexLatinusParser.FINAL_BRACE, 0); }
		public TerminalNode DOT_COMMA() { return getToken(CodexLatinusParser.DOT_COMMA, 0); }
		public StructInstanceUssageContext(Struct_ussageContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusParserListener ) ((CodexLatinusParserListener)listener).enterStructInstanceUssage(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusParserListener ) ((CodexLatinusParserListener)listener).exitStructInstanceUssage(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusParserVisitor ) return ((CodexLatinusParserVisitor<? extends T>)visitor).visitStructInstanceUssage(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Struct_ussageContext struct_ussage() throws RecognitionException {
		Struct_ussageContext _localctx = new Struct_ussageContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_struct_ussage);
		try {
			_localctx = new StructInstanceUssageContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(461);
			match(ID);
			setState(462);
			match(EQUAL);
			setState(463);
			match(INIT_BRACE);
			setState(464);
			struct_data_list(0);
			setState(465);
			match(FINAL_BRACE);
			setState(467);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				{
				setState(466);
				match(DOT_COMMA);
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
		enterRule(_localctx, 74, RULE_variable_ussage);
		try {
			_localctx = new NormalVariableUsageContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(469);
			match(ID);
			setState(470);
			match(EQUAL);
			setState(471);
			expression(0);
			setState(472);
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
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode FINAL_BRACKET() { return getToken(CodexLatinusParser.FINAL_BRACKET, 0); }
		public TerminalNode EQUAL() { return getToken(CodexLatinusParser.EQUAL, 0); }
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
		enterRule(_localctx, 76, RULE_array_ussage);
		try {
			_localctx = new NormalArrayUsageContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(474);
			match(ID);
			setState(475);
			match(INIT_BRACKET);
			setState(476);
			expression(0);
			setState(477);
			match(FINAL_BRACKET);
			setState(478);
			match(EQUAL);
			setState(479);
			expression(0);
			setState(480);
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
	public static class Nested_variables_usageContext extends ParserRuleContext {
		public Nested_variables_usageContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nested_variables_usage; }
	 
		public Nested_variables_usageContext() { }
		public void copyFrom(Nested_variables_usageContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NestedStructValueContext extends Nested_variables_usageContext {
		public Struct_valuesContext struct_values() {
			return getRuleContext(Struct_valuesContext.class,0);
		}
		public TerminalNode EQUAL() { return getToken(CodexLatinusParser.EQUAL, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode DOT_COMMA() { return getToken(CodexLatinusParser.DOT_COMMA, 0); }
		public NestedStructValueContext(Nested_variables_usageContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusParserListener ) ((CodexLatinusParserListener)listener).enterNestedStructValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusParserListener ) ((CodexLatinusParserListener)listener).exitNestedStructValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusParserVisitor ) return ((CodexLatinusParserVisitor<? extends T>)visitor).visitNestedStructValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Nested_variables_usageContext nested_variables_usage() throws RecognitionException {
		Nested_variables_usageContext _localctx = new Nested_variables_usageContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_nested_variables_usage);
		try {
			_localctx = new NestedStructValueContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(482);
			struct_values(0);
			setState(483);
			match(EQUAL);
			setState(484);
			expression(0);
			setState(485);
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
	public static class Struct_variable_setContext extends ParserRuleContext {
		public Struct_variable_setContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_struct_variable_set; }
	 
		public Struct_variable_setContext() { }
		public void copyFrom(Struct_variable_setContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SetStructNormalVariableContext extends Struct_variable_setContext {
		public List<TerminalNode> ID() { return getTokens(CodexLatinusParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(CodexLatinusParser.ID, i);
		}
		public TerminalNode DOT() { return getToken(CodexLatinusParser.DOT, 0); }
		public TerminalNode EQUAL() { return getToken(CodexLatinusParser.EQUAL, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode DOT_COMMA() { return getToken(CodexLatinusParser.DOT_COMMA, 0); }
		public SetStructNormalVariableContext(Struct_variable_setContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusParserListener ) ((CodexLatinusParserListener)listener).enterSetStructNormalVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusParserListener ) ((CodexLatinusParserListener)listener).exitSetStructNormalVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusParserVisitor ) return ((CodexLatinusParserVisitor<? extends T>)visitor).visitSetStructNormalVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Struct_variable_setContext struct_variable_set() throws RecognitionException {
		Struct_variable_setContext _localctx = new Struct_variable_setContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_struct_variable_set);
		try {
			_localctx = new SetStructNormalVariableContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(487);
			match(ID);
			setState(488);
			match(DOT);
			setState(489);
			match(ID);
			setState(490);
			match(EQUAL);
			setState(491);
			expression(0);
			setState(492);
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
	public static class Struct_array_setContext extends ParserRuleContext {
		public Struct_array_setContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_struct_array_set; }
	 
		public Struct_array_setContext() { }
		public void copyFrom(Struct_array_setContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SetStructNormalArrayContext extends Struct_array_setContext {
		public List<TerminalNode> ID() { return getTokens(CodexLatinusParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(CodexLatinusParser.ID, i);
		}
		public TerminalNode DOT() { return getToken(CodexLatinusParser.DOT, 0); }
		public TerminalNode EQUAL() { return getToken(CodexLatinusParser.EQUAL, 0); }
		public Array_initializationContext array_initialization() {
			return getRuleContext(Array_initializationContext.class,0);
		}
		public TerminalNode DOT_COMMA() { return getToken(CodexLatinusParser.DOT_COMMA, 0); }
		public SetStructNormalArrayContext(Struct_array_setContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusParserListener ) ((CodexLatinusParserListener)listener).enterSetStructNormalArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusParserListener ) ((CodexLatinusParserListener)listener).exitSetStructNormalArray(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusParserVisitor ) return ((CodexLatinusParserVisitor<? extends T>)visitor).visitSetStructNormalArray(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Struct_array_setContext struct_array_set() throws RecognitionException {
		Struct_array_setContext _localctx = new Struct_array_setContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_struct_array_set);
		try {
			_localctx = new SetStructNormalArrayContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(494);
			match(ID);
			setState(495);
			match(DOT);
			setState(496);
			match(ID);
			setState(497);
			match(EQUAL);
			setState(498);
			array_initialization();
			setState(499);
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
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode FINAL_BRACKET() { return getToken(CodexLatinusParser.FINAL_BRACKET, 0); }
		public TerminalNode EQUAL() { return getToken(CodexLatinusParser.EQUAL, 0); }
		public TerminalNode INIT_BRACE() { return getToken(CodexLatinusParser.INIT_BRACE, 0); }
		public Struct_data_listContext struct_data_list() {
			return getRuleContext(Struct_data_listContext.class,0);
		}
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
		enterRule(_localctx, 84, RULE_struct_array_property);
		try {
			_localctx = new StructArrayPropertyContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(501);
			match(ID);
			setState(502);
			match(DOT);
			setState(503);
			match(ID);
			setState(504);
			match(INIT_BRACKET);
			setState(505);
			expression(0);
			setState(506);
			match(FINAL_BRACKET);
			setState(507);
			match(EQUAL);
			setState(508);
			match(INIT_BRACE);
			setState(509);
			struct_data_list(0);
			setState(510);
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
		enterRule(_localctx, 86, RULE_struct_instance);
		try {
			_localctx = new StructInstanceContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(512);
			match(ESTO);
			setState(513);
			match(ID);
			setState(514);
			match(TWO_POINTS);
			setState(515);
			match(ID);
			setState(516);
			match(INIT_BRACE);
			setState(517);
			struct_data_list(0);
			setState(518);
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
		int _startState = 88;
		enterRecursionRule(_localctx, 88, RULE_struct_data_list, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new StructSingleValueContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(521);
			struct_data_value();
			}
			_ctx.stop = _input.LT(-1);
			setState(528);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new StructValueListContext(new Struct_data_listContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_struct_data_list);
					setState(523);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(524);
					match(COMMA);
					setState(525);
					struct_data_value();
					}
					} 
				}
				setState(530);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
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
		enterRule(_localctx, 90, RULE_variable_declaration);
		try {
			_localctx = new VarDeclarationContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(531);
			match(ESTO);
			setState(532);
			match(ID);
			setState(533);
			match(TWO_POINTS);
			setState(534);
			variable_type();
			setState(535);
			expression(0);
			setState(536);
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
		enterRule(_localctx, 92, RULE_boolean_declaration);
		try {
			_localctx = new BoolDeclarationContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(538);
			match(ESTO);
			setState(539);
			match(ID);
			setState(540);
			match(TWO_POINTS);
			setState(541);
			boolean_values();
			setState(542);
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
		public TerminalNode INIT_BRACKET() { return getToken(CodexLatinusParser.INIT_BRACKET, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode FINAL_BRACKET() { return getToken(CodexLatinusParser.FINAL_BRACKET, 0); }
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
		enterRule(_localctx, 94, RULE_normal_array);
		try {
			setState(555);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				_localctx = new NormalArrayDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(544);
				match(SERIES);
				setState(545);
				match(ID);
				setState(546);
				match(INIT_BRACKET);
				setState(547);
				expression(0);
				setState(548);
				match(FINAL_BRACKET);
				setState(549);
				match(TWO_POINTS);
				setState(550);
				variable_type();
				setState(551);
				array_initialization();
				setState(552);
				match(DOT_COMMA);
				}
				break;
			case 2:
				_localctx = new BooleanArrayDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(554);
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
		public TerminalNode INIT_BRACKET() { return getToken(CodexLatinusParser.INIT_BRACKET, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode FINAL_BRACKET() { return getToken(CodexLatinusParser.FINAL_BRACKET, 0); }
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
		enterRule(_localctx, 96, RULE_boolean_array);
		try {
			_localctx = new BooleanArrayBaseContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(557);
			match(SERIES);
			setState(558);
			match(ID);
			setState(559);
			match(INIT_BRACKET);
			setState(560);
			expression(0);
			setState(561);
			match(FINAL_BRACKET);
			setState(562);
			match(TWO_POINTS);
			setState(563);
			array_initialization();
			setState(564);
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
		enterRule(_localctx, 98, RULE_array_initialization);
		try {
			setState(571);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INIT_BRACE:
				_localctx = new ArrayInitWithValuesContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(566);
				match(INIT_BRACE);
				setState(567);
				values_array_list(0);
				setState(568);
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
		int _startState = 100;
		enterRecursionRule(_localctx, 100, RULE_values_array_list, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new ArraySingleValueContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(574);
			array_value();
			}
			_ctx.stop = _input.LT(-1);
			setState(581);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ArrayValueListContext(new Values_array_listContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_values_array_list);
					setState(576);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(577);
					match(COMMA);
					setState(578);
					array_value();
					}
					} 
				}
				setState(583);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
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
		enterRule(_localctx, 102, RULE_array_value);
		try {
			setState(586);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				_localctx = new ArrayStructValContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(584);
				struct_values(0);
				}
				break;
			case 2:
				_localctx = new ArrayNormalValContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(585);
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
	public static class StructBasePropertyContext extends Struct_valuesContext {
		public List<TerminalNode> ID() { return getTokens(CodexLatinusParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(CodexLatinusParser.ID, i);
		}
		public TerminalNode DOT() { return getToken(CodexLatinusParser.DOT, 0); }
		public StructBasePropertyContext(Struct_valuesContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusParserListener ) ((CodexLatinusParserListener)listener).enterStructBaseProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusParserListener ) ((CodexLatinusParserListener)listener).exitStructBaseProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusParserVisitor ) return ((CodexLatinusParserVisitor<? extends T>)visitor).visitStructBaseProperty(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StructArrayAccessChainContext extends Struct_valuesContext {
		public Struct_valuesContext struct_values() {
			return getRuleContext(Struct_valuesContext.class,0);
		}
		public TerminalNode INIT_BRACKET() { return getToken(CodexLatinusParser.INIT_BRACKET, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode FINAL_BRACKET() { return getToken(CodexLatinusParser.FINAL_BRACKET, 0); }
		public StructArrayAccessChainContext(Struct_valuesContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusParserListener ) ((CodexLatinusParserListener)listener).enterStructArrayAccessChain(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusParserListener ) ((CodexLatinusParserListener)listener).exitStructArrayAccessChain(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusParserVisitor ) return ((CodexLatinusParserVisitor<? extends T>)visitor).visitStructArrayAccessChain(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StructBaseArrayPropertyContext extends Struct_valuesContext {
		public List<TerminalNode> ID() { return getTokens(CodexLatinusParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(CodexLatinusParser.ID, i);
		}
		public TerminalNode INIT_BRACKET() { return getToken(CodexLatinusParser.INIT_BRACKET, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode FINAL_BRACKET() { return getToken(CodexLatinusParser.FINAL_BRACKET, 0); }
		public TerminalNode DOT() { return getToken(CodexLatinusParser.DOT, 0); }
		public StructBaseArrayPropertyContext(Struct_valuesContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusParserListener ) ((CodexLatinusParserListener)listener).enterStructBaseArrayProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusParserListener ) ((CodexLatinusParserListener)listener).exitStructBaseArrayProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusParserVisitor ) return ((CodexLatinusParserVisitor<? extends T>)visitor).visitStructBaseArrayProperty(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StructPropertyChainContext extends Struct_valuesContext {
		public Struct_valuesContext struct_values() {
			return getRuleContext(Struct_valuesContext.class,0);
		}
		public TerminalNode DOT() { return getToken(CodexLatinusParser.DOT, 0); }
		public TerminalNode ID() { return getToken(CodexLatinusParser.ID, 0); }
		public StructPropertyChainContext(Struct_valuesContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusParserListener ) ((CodexLatinusParserListener)listener).enterStructPropertyChain(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusParserListener ) ((CodexLatinusParserListener)listener).exitStructPropertyChain(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusParserVisitor ) return ((CodexLatinusParserVisitor<? extends T>)visitor).visitStructPropertyChain(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Struct_valuesContext struct_values() throws RecognitionException {
		return struct_values(0);
	}

	private Struct_valuesContext struct_values(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Struct_valuesContext _localctx = new Struct_valuesContext(_ctx, _parentState);
		Struct_valuesContext _prevctx = _localctx;
		int _startState = 104;
		enterRecursionRule(_localctx, 104, RULE_struct_values, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(599);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				{
				_localctx = new StructBasePropertyContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(589);
				match(ID);
				setState(590);
				match(DOT);
				setState(591);
				match(ID);
				}
				break;
			case 2:
				{
				_localctx = new StructBaseArrayPropertyContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(592);
				match(ID);
				setState(593);
				match(INIT_BRACKET);
				setState(594);
				expression(0);
				setState(595);
				match(FINAL_BRACKET);
				setState(596);
				match(DOT);
				setState(597);
				match(ID);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(611);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(609);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
					case 1:
						{
						_localctx = new StructPropertyChainContext(new Struct_valuesContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_struct_values);
						setState(601);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(602);
						match(DOT);
						setState(603);
						match(ID);
						}
						break;
					case 2:
						{
						_localctx = new StructArrayAccessChainContext(new Struct_valuesContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_struct_values);
						setState(604);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(605);
						match(INIT_BRACKET);
						setState(606);
						expression(0);
						setState(607);
						match(FINAL_BRACKET);
						}
						break;
					}
					} 
				}
				setState(613);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
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
		enterRule(_localctx, 106, RULE_struct_declaration);
		try {
			_localctx = new StructDeclarationContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(614);
			match(STRUCTURE);
			setState(615);
			match(ID);
			setState(616);
			match(INIT_BRACE);
			setState(617);
			struct_body();
			setState(618);
			match(FINAL_BRACE);
			setState(619);
			match(FINIS);
			setState(620);
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
		enterRule(_localctx, 108, RULE_struct_body);
		try {
			setState(624);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				_localctx = new StructSeparatedBodyContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(622);
				struct_normal_body(0);
				}
				break;
			case 2:
				_localctx = new StructCommaBodyContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(623);
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
		int _startState = 110;
		enterRecursionRule(_localctx, 110, RULE_struct_normal_body, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new StructNormalBodySingleContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(627);
			struct_attribute();
			setState(628);
			match(DOT_COMMA);
			}
			_ctx.stop = _input.LT(-1);
			setState(636);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,40,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new StructNormalBodyListContext(new Struct_normal_bodyContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_struct_normal_body);
					setState(630);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(631);
					struct_attribute();
					setState(632);
					match(DOT_COMMA);
					}
					} 
				}
				setState(638);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,40,_ctx);
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
		int _startState = 112;
		enterRecursionRule(_localctx, 112, RULE_struct_comma_body, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new StructCommaBodySingleContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(640);
			struct_attribute();
			}
			_ctx.stop = _input.LT(-1);
			setState(647);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new StructCommaBodyListContext(new Struct_comma_bodyContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_struct_comma_body);
					setState(642);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(643);
					match(COMMA);
					setState(644);
					struct_attribute();
					}
					} 
				}
				setState(649);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
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
		enterRule(_localctx, 114, RULE_struct_attribute);
		try {
			setState(653);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				_localctx = new NormalVariableStructContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(650);
				variable_without_value();
				}
				break;
			case 2:
				_localctx = new BooleanVariableStructContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(651);
				boolean_variable_without_value();
				}
				break;
			case 3:
				_localctx = new ArrayVariableStructContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(652);
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
		enterRule(_localctx, 116, RULE_variable_without_value);
		try {
			_localctx = new InternalStructNormalVariableContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(655);
			match(ESTO);
			setState(656);
			match(ID);
			setState(657);
			match(TWO_POINTS);
			setState(658);
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
		enterRule(_localctx, 118, RULE_boolean_variable_without_value);
		try {
			_localctx = new InternalStructBoolVariableContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(660);
			match(ESTO);
			setState(661);
			match(ID);
			setState(662);
			match(TWO_POINTS);
			setState(663);
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
		enterRule(_localctx, 120, RULE_array_variable_struct);
		try {
			_localctx = new InternalStructArrayContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(665);
			match(SERIES);
			setState(666);
			match(ID);
			setState(667);
			match(TWO_POINTS);
			setState(668);
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
		enterRule(_localctx, 122, RULE_struct_data_value);
		try {
			_localctx = new StructDeclarationValueContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(670);
			match(ID);
			setState(671);
			match(TWO_POINTS);
			setState(672);
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
	public static class ExpressionGreaterEqualContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode GREATER_EQUALS() { return getToken(CodexLatinusParser.GREATER_EQUALS, 0); }
		public ExpressionGreaterEqualContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusParserListener ) ((CodexLatinusParserListener)listener).enterExpressionGreaterEqual(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusParserListener ) ((CodexLatinusParserListener)listener).exitExpressionGreaterEqual(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusParserVisitor ) return ((CodexLatinusParserVisitor<? extends T>)visitor).visitExpressionGreaterEqual(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionMultContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode MULTIPLICATION() { return getToken(CodexLatinusParser.MULTIPLICATION, 0); }
		public ExpressionMultContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusParserListener ) ((CodexLatinusParserListener)listener).enterExpressionMult(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusParserListener ) ((CodexLatinusParserListener)listener).exitExpressionMult(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusParserVisitor ) return ((CodexLatinusParserVisitor<? extends T>)visitor).visitExpressionMult(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionLessThanContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode LESS() { return getToken(CodexLatinusParser.LESS, 0); }
		public ExpressionLessThanContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusParserListener ) ((CodexLatinusParserListener)listener).enterExpressionLessThan(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusParserListener ) ((CodexLatinusParserListener)listener).exitExpressionLessThan(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusParserVisitor ) return ((CodexLatinusParserVisitor<? extends T>)visitor).visitExpressionLessThan(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionMinusContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode MINUS() { return getToken(CodexLatinusParser.MINUS, 0); }
		public ExpressionMinusContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusParserListener ) ((CodexLatinusParserListener)listener).enterExpressionMinus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusParserListener ) ((CodexLatinusParserListener)listener).exitExpressionMinus(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusParserVisitor ) return ((CodexLatinusParserVisitor<? extends T>)visitor).visitExpressionMinus(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionLessEqualContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode LESS_EQUALS() { return getToken(CodexLatinusParser.LESS_EQUALS, 0); }
		public ExpressionLessEqualContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusParserListener ) ((CodexLatinusParserListener)listener).enterExpressionLessEqual(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusParserListener ) ((CodexLatinusParserListener)listener).exitExpressionLessEqual(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusParserVisitor ) return ((CodexLatinusParserVisitor<? extends T>)visitor).visitExpressionLessEqual(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionNegateContext extends ExpressionContext {
		public TerminalNode MINUS() { return getToken(CodexLatinusParser.MINUS, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExpressionNegateContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusParserListener ) ((CodexLatinusParserListener)listener).enterExpressionNegate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusParserListener ) ((CodexLatinusParserListener)listener).exitExpressionNegate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusParserVisitor ) return ((CodexLatinusParserVisitor<? extends T>)visitor).visitExpressionNegate(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionNotEqualsContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode DIFERENCE() { return getToken(CodexLatinusParser.DIFERENCE, 0); }
		public ExpressionNotEqualsContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusParserListener ) ((CodexLatinusParserListener)listener).enterExpressionNotEquals(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusParserListener ) ((CodexLatinusParserListener)listener).exitExpressionNotEquals(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusParserVisitor ) return ((CodexLatinusParserVisitor<? extends T>)visitor).visitExpressionNotEquals(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionParentsContext extends ExpressionContext {
		public TerminalNode INIT_PARENT() { return getToken(CodexLatinusParser.INIT_PARENT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode FINAL_PARENT() { return getToken(CodexLatinusParser.FINAL_PARENT, 0); }
		public ExpressionParentsContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusParserListener ) ((CodexLatinusParserListener)listener).enterExpressionParents(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusParserListener ) ((CodexLatinusParserListener)listener).exitExpressionParents(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusParserVisitor ) return ((CodexLatinusParserVisitor<? extends T>)visitor).visitExpressionParents(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionDivContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode DIVIDE() { return getToken(CodexLatinusParser.DIVIDE, 0); }
		public ExpressionDivContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusParserListener ) ((CodexLatinusParserListener)listener).enterExpressionDiv(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusParserListener ) ((CodexLatinusParserListener)listener).exitExpressionDiv(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusParserVisitor ) return ((CodexLatinusParserVisitor<? extends T>)visitor).visitExpressionDiv(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionNotContext extends ExpressionContext {
		public TerminalNode NOT() { return getToken(CodexLatinusParser.NOT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExpressionNotContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusParserListener ) ((CodexLatinusParserListener)listener).enterExpressionNot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusParserListener ) ((CodexLatinusParserListener)listener).exitExpressionNot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusParserVisitor ) return ((CodexLatinusParserVisitor<? extends T>)visitor).visitExpressionNot(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionValueContext extends ExpressionContext {
		public Normal_valuesContext normal_values() {
			return getRuleContext(Normal_valuesContext.class,0);
		}
		public ExpressionValueContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusParserListener ) ((CodexLatinusParserListener)listener).enterExpressionValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusParserListener ) ((CodexLatinusParserListener)listener).exitExpressionValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusParserVisitor ) return ((CodexLatinusParserVisitor<? extends T>)visitor).visitExpressionValue(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionAndContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode AND() { return getToken(CodexLatinusParser.AND, 0); }
		public ExpressionAndContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusParserListener ) ((CodexLatinusParserListener)listener).enterExpressionAnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusParserListener ) ((CodexLatinusParserListener)listener).exitExpressionAnd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusParserVisitor ) return ((CodexLatinusParserVisitor<? extends T>)visitor).visitExpressionAnd(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionOrContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode OR() { return getToken(CodexLatinusParser.OR, 0); }
		public ExpressionOrContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusParserListener ) ((CodexLatinusParserListener)listener).enterExpressionOr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusParserListener ) ((CodexLatinusParserListener)listener).exitExpressionOr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusParserVisitor ) return ((CodexLatinusParserVisitor<? extends T>)visitor).visitExpressionOr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionGreaterThanContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode GREATER() { return getToken(CodexLatinusParser.GREATER, 0); }
		public ExpressionGreaterThanContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusParserListener ) ((CodexLatinusParserListener)listener).enterExpressionGreaterThan(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusParserListener ) ((CodexLatinusParserListener)listener).exitExpressionGreaterThan(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusParserVisitor ) return ((CodexLatinusParserVisitor<? extends T>)visitor).visitExpressionGreaterThan(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionEqualsContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode EQUALS() { return getToken(CodexLatinusParser.EQUALS, 0); }
		public ExpressionEqualsContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusParserListener ) ((CodexLatinusParserListener)listener).enterExpressionEquals(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusParserListener ) ((CodexLatinusParserListener)listener).exitExpressionEquals(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusParserVisitor ) return ((CodexLatinusParserVisitor<? extends T>)visitor).visitExpressionEquals(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionPlusContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode PLUS() { return getToken(CodexLatinusParser.PLUS, 0); }
		public ExpressionPlusContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusParserListener ) ((CodexLatinusParserListener)listener).enterExpressionPlus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusParserListener ) ((CodexLatinusParserListener)listener).exitExpressionPlus(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusParserVisitor ) return ((CodexLatinusParserVisitor<? extends T>)visitor).visitExpressionPlus(this);
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
		int _startState = 124;
		enterRecursionRule(_localctx, 124, RULE_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(684);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INIT_PARENT:
				{
				_localctx = new ExpressionParentsContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(675);
				match(INIT_PARENT);
				setState(676);
				expression(0);
				setState(677);
				match(FINAL_PARENT);
				}
				break;
			case NOT:
				{
				_localctx = new ExpressionNotContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(679);
				match(NOT);
				setState(680);
				expression(15);
				}
				break;
			case MINUS:
				{
				_localctx = new ExpressionNegateContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(681);
				match(MINUS);
				setState(682);
				expression(14);
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
				_localctx = new ExpressionValueContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(683);
				normal_values();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(724);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,45,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(722);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionMultContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(686);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(687);
						match(MULTIPLICATION);
						setState(688);
						expression(14);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionDivContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(689);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(690);
						match(DIVIDE);
						setState(691);
						expression(13);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionPlusContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(692);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(693);
						match(PLUS);
						setState(694);
						expression(12);
						}
						break;
					case 4:
						{
						_localctx = new ExpressionMinusContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(695);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(696);
						match(MINUS);
						setState(697);
						expression(11);
						}
						break;
					case 5:
						{
						_localctx = new ExpressionLessThanContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(698);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(699);
						match(LESS);
						setState(700);
						expression(10);
						}
						break;
					case 6:
						{
						_localctx = new ExpressionGreaterThanContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(701);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(702);
						match(GREATER);
						setState(703);
						expression(9);
						}
						break;
					case 7:
						{
						_localctx = new ExpressionLessEqualContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(704);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(705);
						match(LESS_EQUALS);
						setState(706);
						expression(8);
						}
						break;
					case 8:
						{
						_localctx = new ExpressionGreaterEqualContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(707);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(708);
						match(GREATER_EQUALS);
						setState(709);
						expression(7);
						}
						break;
					case 9:
						{
						_localctx = new ExpressionEqualsContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(710);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(711);
						match(EQUALS);
						setState(712);
						expression(6);
						}
						break;
					case 10:
						{
						_localctx = new ExpressionNotEqualsContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(713);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(714);
						match(DIFERENCE);
						setState(715);
						expression(5);
						}
						break;
					case 11:
						{
						_localctx = new ExpressionAndContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(716);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(717);
						match(AND);
						setState(718);
						expression(4);
						}
						break;
					case 12:
						{
						_localctx = new ExpressionOrContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(719);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(720);
						match(OR);
						setState(721);
						expression(3);
						}
						break;
					}
					} 
				}
				setState(726);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,45,_ctx);
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
		enterRule(_localctx, 126, RULE_variable_type);
		try {
			setState(732);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TEXTUM:
				_localctx = new TypeTextContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(727);
				match(TEXTUM);
				}
				break;
			case NUMERUS:
				_localctx = new TypeIntContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(728);
				match(NUMERUS);
				}
				break;
			case DECIMALIS:
				_localctx = new TypeDecimalContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(729);
				match(DECIMALIS);
				}
				break;
			case LITTERA:
				_localctx = new TypeCharContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(730);
				match(LITTERA);
				}
				break;
			case ID:
				_localctx = new TypeCustomIdContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(731);
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
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
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
		enterRule(_localctx, 128, RULE_array_call);
		try {
			_localctx = new ArrayCallContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(734);
			match(ID);
			setState(735);
			match(INIT_BRACKET);
			setState(736);
			expression(0);
			setState(737);
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
	public static class Function_callContext extends ParserRuleContext {
		public Function_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_call; }
	 
		public Function_callContext() { }
		public void copyFrom(Function_callContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FunctionCallingContext extends Function_callContext {
		public TerminalNode ID() { return getToken(CodexLatinusParser.ID, 0); }
		public TerminalNode INIT_PARENT() { return getToken(CodexLatinusParser.INIT_PARENT, 0); }
		public Arguments_listContext arguments_list() {
			return getRuleContext(Arguments_listContext.class,0);
		}
		public TerminalNode FINAL_PARENT() { return getToken(CodexLatinusParser.FINAL_PARENT, 0); }
		public FunctionCallingContext(Function_callContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusParserListener ) ((CodexLatinusParserListener)listener).enterFunctionCalling(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusParserListener ) ((CodexLatinusParserListener)listener).exitFunctionCalling(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusParserVisitor ) return ((CodexLatinusParserVisitor<? extends T>)visitor).visitFunctionCalling(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_callContext function_call() throws RecognitionException {
		Function_callContext _localctx = new Function_callContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_function_call);
		try {
			_localctx = new FunctionCallingContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(739);
			match(ID);
			setState(740);
			match(INIT_PARENT);
			setState(741);
			arguments_list(0);
			setState(742);
			match(FINAL_PARENT);
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
	public static class Arguments_listContext extends ParserRuleContext {
		public Arguments_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arguments_list; }
	 
		public Arguments_listContext() { }
		public void copyFrom(Arguments_listContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArgumentSingleFunctionContext extends Arguments_listContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ArgumentSingleFunctionContext(Arguments_listContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusParserListener ) ((CodexLatinusParserListener)listener).enterArgumentSingleFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusParserListener ) ((CodexLatinusParserListener)listener).exitArgumentSingleFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusParserVisitor ) return ((CodexLatinusParserVisitor<? extends T>)visitor).visitArgumentSingleFunction(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NoArgumentsFunctionContext extends Arguments_listContext {
		public NoArgumentsFunctionContext(Arguments_listContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusParserListener ) ((CodexLatinusParserListener)listener).enterNoArgumentsFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusParserListener ) ((CodexLatinusParserListener)listener).exitNoArgumentsFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusParserVisitor ) return ((CodexLatinusParserVisitor<? extends T>)visitor).visitNoArgumentsFunction(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArgumentFunctionListContext extends Arguments_listContext {
		public Arguments_listContext arguments_list() {
			return getRuleContext(Arguments_listContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(CodexLatinusParser.COMMA, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ArgumentFunctionListContext(Arguments_listContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusParserListener ) ((CodexLatinusParserListener)listener).enterArgumentFunctionList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusParserListener ) ((CodexLatinusParserListener)listener).exitArgumentFunctionList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusParserVisitor ) return ((CodexLatinusParserVisitor<? extends T>)visitor).visitArgumentFunctionList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Arguments_listContext arguments_list() throws RecognitionException {
		return arguments_list(0);
	}

	private Arguments_listContext arguments_list(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Arguments_listContext _localctx = new Arguments_listContext(_ctx, _parentState);
		Arguments_listContext _prevctx = _localctx;
		int _startState = 132;
		enterRecursionRule(_localctx, 132, RULE_arguments_list, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(747);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
			case 1:
				{
				_localctx = new ArgumentSingleFunctionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(745);
				expression(0);
				}
				break;
			case 2:
				{
				_localctx = new NoArgumentsFunctionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(754);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,48,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ArgumentFunctionListContext(new Arguments_listContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_arguments_list);
					setState(749);
					if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
					setState(750);
					match(COMMA);
					setState(751);
					expression(0);
					}
					} 
				}
				setState(756);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,48,_ctx);
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
	public static class Nest_variableContext extends ParserRuleContext {
		public Nest_variableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nest_variable; }
	 
		public Nest_variableContext() { }
		public void copyFrom(Nest_variableContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NestedValueVariableContext extends Nest_variableContext {
		public Struct_valuesContext struct_values() {
			return getRuleContext(Struct_valuesContext.class,0);
		}
		public NestedValueVariableContext(Nest_variableContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusParserListener ) ((CodexLatinusParserListener)listener).enterNestedValueVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusParserListener ) ((CodexLatinusParserListener)listener).exitNestedValueVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusParserVisitor ) return ((CodexLatinusParserVisitor<? extends T>)visitor).visitNestedValueVariable(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SigleValueVariableContext extends Nest_variableContext {
		public TerminalNode ID() { return getToken(CodexLatinusParser.ID, 0); }
		public SigleValueVariableContext(Nest_variableContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusParserListener ) ((CodexLatinusParserListener)listener).enterSigleValueVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusParserListener ) ((CodexLatinusParserListener)listener).exitSigleValueVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusParserVisitor ) return ((CodexLatinusParserVisitor<? extends T>)visitor).visitSigleValueVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Nest_variableContext nest_variable() throws RecognitionException {
		Nest_variableContext _localctx = new Nest_variableContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_nest_variable);
		try {
			setState(759);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
			case 1:
				_localctx = new NestedValueVariableContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(757);
				struct_values(0);
				}
				break;
			case 2:
				_localctx = new SigleValueVariableContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(758);
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
	public static class ValFunctionCallContext extends Normal_valuesContext {
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public ValFunctionCallContext(Normal_valuesContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusParserListener ) ((CodexLatinusParserListener)listener).enterValFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusParserListener ) ((CodexLatinusParserListener)listener).exitValFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusParserVisitor ) return ((CodexLatinusParserVisitor<? extends T>)visitor).visitValFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ValStructValueContext extends Normal_valuesContext {
		public Struct_valuesContext struct_values() {
			return getRuleContext(Struct_valuesContext.class,0);
		}
		public ValStructValueContext(Normal_valuesContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusParserListener ) ((CodexLatinusParserListener)listener).enterValStructValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusParserListener ) ((CodexLatinusParserListener)listener).exitValStructValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusParserVisitor ) return ((CodexLatinusParserVisitor<? extends T>)visitor).visitValStructValue(this);
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
		enterRule(_localctx, 136, RULE_normal_values);
		try {
			setState(770);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
			case 1:
				_localctx = new ValStringContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(761);
				match(STRING);
				}
				break;
			case 2:
				_localctx = new ValCharContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(762);
				match(CHAR);
				}
				break;
			case 3:
				_localctx = new ValIdContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(763);
				match(ID);
				}
				break;
			case 4:
				_localctx = new ValDecimalContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(764);
				match(DECIMAL);
				}
				break;
			case 5:
				_localctx = new ValIntContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(765);
				match(INT);
				}
				break;
			case 6:
				_localctx = new ValBoolContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(766);
				boolean_values();
				}
				break;
			case 7:
				_localctx = new ValIdCallContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(767);
				array_call();
				}
				break;
			case 8:
				_localctx = new ValFunctionCallContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(768);
				function_call();
				}
				break;
			case 9:
				_localctx = new ValStructValueContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(769);
				struct_values(0);
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
		enterRule(_localctx, 138, RULE_boolean_values);
		try {
			setState(774);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VERUM:
				_localctx = new BoolTrueContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(772);
				match(VERUM);
				}
				break;
			case FALSUS:
				_localctx = new BoolFalseContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(773);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Abbreviated_operationContext extends ParserRuleContext {
		public Abbreviated_operationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_abbreviated_operation; }
	 
		public Abbreviated_operationContext() { }
		public void copyFrom(Abbreviated_operationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IncOperationContext extends Abbreviated_operationContext {
		public Nest_variableContext nest_variable() {
			return getRuleContext(Nest_variableContext.class,0);
		}
		public TerminalNode ABREV_PLUS() { return getToken(CodexLatinusParser.ABREV_PLUS, 0); }
		public TerminalNode DOT_COMMA() { return getToken(CodexLatinusParser.DOT_COMMA, 0); }
		public IncOperationContext(Abbreviated_operationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusParserListener ) ((CodexLatinusParserListener)listener).enterIncOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusParserListener ) ((CodexLatinusParserListener)listener).exitIncOperation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusParserVisitor ) return ((CodexLatinusParserVisitor<? extends T>)visitor).visitIncOperation(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DecOperationContext extends Abbreviated_operationContext {
		public Nest_variableContext nest_variable() {
			return getRuleContext(Nest_variableContext.class,0);
		}
		public TerminalNode ABREV_MINUS() { return getToken(CodexLatinusParser.ABREV_MINUS, 0); }
		public TerminalNode DOT_COMMA() { return getToken(CodexLatinusParser.DOT_COMMA, 0); }
		public DecOperationContext(Abbreviated_operationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusParserListener ) ((CodexLatinusParserListener)listener).enterDecOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusParserListener ) ((CodexLatinusParserListener)listener).exitDecOperation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusParserVisitor ) return ((CodexLatinusParserVisitor<? extends T>)visitor).visitDecOperation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Abbreviated_operationContext abbreviated_operation() throws RecognitionException {
		Abbreviated_operationContext _localctx = new Abbreviated_operationContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_abbreviated_operation);
		try {
			setState(784);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
			case 1:
				_localctx = new IncOperationContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(776);
				nest_variable();
				setState(777);
				match(ABREV_PLUS);
				setState(778);
				match(DOT_COMMA);
				}
				break;
			case 2:
				_localctx = new DecOperationContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(780);
				nest_variable();
				setState(781);
				match(ABREV_MINUS);
				setState(782);
				match(DOT_COMMA);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 3:
			return munera_body_sempred((Munera_bodyContext)_localctx, predIndex);
		case 10:
			return local_variable_list_sempred((Local_variable_listContext)_localctx, predIndex);
		case 12:
			return function_arguments_sempred((Function_argumentsContext)_localctx, predIndex);
		case 17:
			return code_body_sempred((Code_bodyContext)_localctx, predIndex);
		case 22:
			return print_function_sempred((Print_functionContext)_localctx, predIndex);
		case 25:
			return else_if_list_sempred((Else_if_listContext)_localctx, predIndex);
		case 34:
			return variabiles_body_sempred((Variabiles_bodyContext)_localctx, predIndex);
		case 44:
			return struct_data_list_sempred((Struct_data_listContext)_localctx, predIndex);
		case 50:
			return values_array_list_sempred((Values_array_listContext)_localctx, predIndex);
		case 52:
			return struct_values_sempred((Struct_valuesContext)_localctx, predIndex);
		case 55:
			return struct_normal_body_sempred((Struct_normal_bodyContext)_localctx, predIndex);
		case 56:
			return struct_comma_body_sempred((Struct_comma_bodyContext)_localctx, predIndex);
		case 62:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		case 66:
			return arguments_list_sempred((Arguments_listContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean munera_body_sempred(Munera_bodyContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean local_variable_list_sempred(Local_variable_listContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean function_arguments_sempred(Function_argumentsContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 3);
		}
		return true;
	}
	private boolean code_body_sempred(Code_bodyContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean print_function_sempred(Print_functionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean else_if_list_sempred(Else_if_listContext _localctx, int predIndex) {
		switch (predIndex) {
		case 5:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean variabiles_body_sempred(Variabiles_bodyContext _localctx, int predIndex) {
		switch (predIndex) {
		case 6:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean struct_data_list_sempred(Struct_data_listContext _localctx, int predIndex) {
		switch (predIndex) {
		case 7:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean values_array_list_sempred(Values_array_listContext _localctx, int predIndex) {
		switch (predIndex) {
		case 8:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean struct_values_sempred(Struct_valuesContext _localctx, int predIndex) {
		switch (predIndex) {
		case 9:
			return precpred(_ctx, 4);
		case 10:
			return precpred(_ctx, 3);
		}
		return true;
	}
	private boolean struct_normal_body_sempred(Struct_normal_bodyContext _localctx, int predIndex) {
		switch (predIndex) {
		case 11:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean struct_comma_body_sempred(Struct_comma_bodyContext _localctx, int predIndex) {
		switch (predIndex) {
		case 12:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 13:
			return precpred(_ctx, 13);
		case 14:
			return precpred(_ctx, 12);
		case 15:
			return precpred(_ctx, 11);
		case 16:
			return precpred(_ctx, 10);
		case 17:
			return precpred(_ctx, 9);
		case 18:
			return precpred(_ctx, 8);
		case 19:
			return precpred(_ctx, 7);
		case 20:
			return precpred(_ctx, 6);
		case 21:
			return precpred(_ctx, 5);
		case 22:
			return precpred(_ctx, 4);
		case 23:
			return precpred(_ctx, 3);
		case 24:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean arguments_list_sempred(Arguments_listContext _localctx, int predIndex) {
		switch (predIndex) {
		case 25:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001=\u0313\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007\"\u0002"+
		"#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007\'\u0002"+
		"(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007+\u0002,\u0007,\u0002"+
		"-\u0007-\u0002.\u0007.\u0002/\u0007/\u00020\u00070\u00021\u00071\u0002"+
		"2\u00072\u00023\u00073\u00024\u00074\u00025\u00075\u00026\u00076\u0002"+
		"7\u00077\u00028\u00078\u00029\u00079\u0002:\u0007:\u0002;\u0007;\u0002"+
		"<\u0007<\u0002=\u0007=\u0002>\u0007>\u0002?\u0007?\u0002@\u0007@\u0002"+
		"A\u0007A\u0002B\u0007B\u0002C\u0007C\u0002D\u0007D\u0002E\u0007E\u0002"+
		"F\u0007F\u0001\u0000\u0005\u0000\u0090\b\u0000\n\u0000\f\u0000\u0093\t"+
		"\u0000\u0001\u0001\u0003\u0001\u0096\b\u0001\u0001\u0001\u0003\u0001\u0099"+
		"\b\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0005\u0003\u00a8\b\u0003\n\u0003\f\u0003\u00ab\t\u0003"+
		"\u0001\u0004\u0001\u0004\u0003\u0004\u00af\b\u0004\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006"+
		"\u0003\u0006\u00bf\b\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\b\u0001\b\u0001\b\u0003\b\u00cf\b\b\u0001\b\u0001\b"+
		"\u0001\b\u0001\t\u0001\t\u0001\t\u0003\t\u00d7\b\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0005\n\u00e1\b\n\n\n\f\n\u00e4"+
		"\t\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0003"+
		"\u000b\u00eb\b\u000b\u0001\f\u0001\f\u0001\f\u0003\f\u00f0\b\f\u0001\f"+
		"\u0001\f\u0001\f\u0005\f\u00f5\b\f\n\f\f\f\u00f8\t\f\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0003\r\u0102\b\r\u0001\u000e"+
		"\u0001\u000e\u0003\u000e\u0106\b\u000e\u0003\u000e\u0108\b\u000e\u0001"+
		"\u000f\u0001\u000f\u0003\u000f\u010c\b\u000f\u0003\u000f\u010e\b\u000f"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0005\u0011\u0119\b\u0011\n\u0011"+
		"\f\u0011\u011c\t\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0003\u0012"+
		"\u012d\b\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0003\u0013\u0135\b\u0013\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0003\u0014\u013b\b\u0014\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0003\u0015"+
		"\u0145\b\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0005\u0016\u014d\b\u0016\n\u0016\f\u0016\u0150\t\u0016\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0003\u0017\u0156\b\u0017\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001"+
		"\u0019\u0001\u0019\u0001\u0019\u0005\u0019\u0167\b\u0019\n\u0019\f\u0019"+
		"\u016a\t\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0001\u001b\u0001\u001b\u0001\u001b\u0003\u001b\u017a\b\u001b\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001d\u0001\u001d\u0001\u001d"+
		"\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d"+
		"\u0001\u001d\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e"+
		"\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e"+
		"\u0001\u001e\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f"+
		"\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0003\u001f\u01a5\b\u001f"+
		"\u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0003 \u01ae\b \u0001"+
		"!\u0001!\u0001!\u0001!\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0005\""+
		"\u01b9\b\"\n\"\f\"\u01bc\t\"\u0001#\u0001#\u0001#\u0001#\u0001#\u0001"+
		"#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0003#\u01cc"+
		"\b#\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0003$\u01d4\b$\u0001%\u0001"+
		"%\u0001%\u0001%\u0001%\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001"+
		"&\u0001&\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001(\u0001(\u0001("+
		"\u0001(\u0001(\u0001(\u0001(\u0001)\u0001)\u0001)\u0001)\u0001)\u0001"+
		")\u0001)\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001"+
		"*\u0001*\u0001*\u0001+\u0001+\u0001+\u0001+\u0001+\u0001+\u0001+\u0001"+
		"+\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0005,\u020f\b,\n,\f,\u0212"+
		"\t,\u0001-\u0001-\u0001-\u0001-\u0001-\u0001-\u0001-\u0001.\u0001.\u0001"+
		".\u0001.\u0001.\u0001.\u0001/\u0001/\u0001/\u0001/\u0001/\u0001/\u0001"+
		"/\u0001/\u0001/\u0001/\u0001/\u0003/\u022c\b/\u00010\u00010\u00010\u0001"+
		"0\u00010\u00010\u00010\u00010\u00010\u00011\u00011\u00011\u00011\u0001"+
		"1\u00031\u023c\b1\u00012\u00012\u00012\u00012\u00012\u00012\u00052\u0244"+
		"\b2\n2\f2\u0247\t2\u00013\u00013\u00033\u024b\b3\u00014\u00014\u00014"+
		"\u00014\u00014\u00014\u00014\u00014\u00014\u00014\u00014\u00034\u0258"+
		"\b4\u00014\u00014\u00014\u00014\u00014\u00014\u00014\u00014\u00054\u0262"+
		"\b4\n4\f4\u0265\t4\u00015\u00015\u00015\u00015\u00015\u00015\u00015\u0001"+
		"5\u00016\u00016\u00036\u0271\b6\u00017\u00017\u00017\u00017\u00017\u0001"+
		"7\u00017\u00017\u00057\u027b\b7\n7\f7\u027e\t7\u00018\u00018\u00018\u0001"+
		"8\u00018\u00018\u00058\u0286\b8\n8\f8\u0289\t8\u00019\u00019\u00019\u0003"+
		"9\u028e\b9\u0001:\u0001:\u0001:\u0001:\u0001:\u0001;\u0001;\u0001;\u0001"+
		";\u0001;\u0001<\u0001<\u0001<\u0001<\u0001<\u0001=\u0001=\u0001=\u0001"+
		"=\u0001>\u0001>\u0001>\u0001>\u0001>\u0001>\u0001>\u0001>\u0001>\u0001"+
		">\u0003>\u02ad\b>\u0001>\u0001>\u0001>\u0001>\u0001>\u0001>\u0001>\u0001"+
		">\u0001>\u0001>\u0001>\u0001>\u0001>\u0001>\u0001>\u0001>\u0001>\u0001"+
		">\u0001>\u0001>\u0001>\u0001>\u0001>\u0001>\u0001>\u0001>\u0001>\u0001"+
		">\u0001>\u0001>\u0001>\u0001>\u0001>\u0001>\u0001>\u0001>\u0005>\u02d3"+
		"\b>\n>\f>\u02d6\t>\u0001?\u0001?\u0001?\u0001?\u0001?\u0003?\u02dd\b?"+
		"\u0001@\u0001@\u0001@\u0001@\u0001@\u0001A\u0001A\u0001A\u0001A\u0001"+
		"A\u0001B\u0001B\u0001B\u0003B\u02ec\bB\u0001B\u0001B\u0001B\u0005B\u02f1"+
		"\bB\nB\fB\u02f4\tB\u0001C\u0001C\u0003C\u02f8\bC\u0001D\u0001D\u0001D"+
		"\u0001D\u0001D\u0001D\u0001D\u0001D\u0001D\u0003D\u0303\bD\u0001E\u0001"+
		"E\u0003E\u0307\bE\u0001F\u0001F\u0001F\u0001F\u0001F\u0001F\u0001F\u0001"+
		"F\u0003F\u0311\bF\u0001F\u0000\u000e\u0006\u0014\u0018\",2DXdhnp|\u0084"+
		"G\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a"+
		"\u001c\u001e \"$&(*,.02468:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082"+
		"\u0084\u0086\u0088\u008a\u008c\u0000\u0000\u0335\u0000\u0091\u0001\u0000"+
		"\u0000\u0000\u0002\u0095\u0001\u0000\u0000\u0000\u0004\u009e\u0001\u0000"+
		"\u0000\u0000\u0006\u00a2\u0001\u0000\u0000\u0000\b\u00ae\u0001\u0000\u0000"+
		"\u0000\n\u00b0\u0001\u0000\u0000\u0000\f\u00be\u0001\u0000\u0000\u0000"+
		"\u000e\u00c0\u0001\u0000\u0000\u0000\u0010\u00cb\u0001\u0000\u0000\u0000"+
		"\u0012\u00d3\u0001\u0000\u0000\u0000\u0014\u00db\u0001\u0000\u0000\u0000"+
		"\u0016\u00ea\u0001\u0000\u0000\u0000\u0018\u00ef\u0001\u0000\u0000\u0000"+
		"\u001a\u0101\u0001\u0000\u0000\u0000\u001c\u0107\u0001\u0000\u0000\u0000"+
		"\u001e\u010d\u0001\u0000\u0000\u0000 \u010f\u0001\u0000\u0000\u0000\""+
		"\u0113\u0001\u0000\u0000\u0000$\u012c\u0001\u0000\u0000\u0000&\u0134\u0001"+
		"\u0000\u0000\u0000(\u013a\u0001\u0000\u0000\u0000*\u0144\u0001\u0000\u0000"+
		"\u0000,\u0146\u0001\u0000\u0000\u0000.\u0155\u0001\u0000\u0000\u00000"+
		"\u0157\u0001\u0000\u0000\u00002\u0163\u0001\u0000\u0000\u00004\u016b\u0001"+
		"\u0000\u0000\u00006\u0179\u0001\u0000\u0000\u00008\u017b\u0001\u0000\u0000"+
		"\u0000:\u0185\u0001\u0000\u0000\u0000<\u018f\u0001\u0000\u0000\u0000>"+
		"\u01a4\u0001\u0000\u0000\u0000@\u01ad\u0001\u0000\u0000\u0000B\u01af\u0001"+
		"\u0000\u0000\u0000D\u01b3\u0001\u0000\u0000\u0000F\u01cb\u0001\u0000\u0000"+
		"\u0000H\u01cd\u0001\u0000\u0000\u0000J\u01d5\u0001\u0000\u0000\u0000L"+
		"\u01da\u0001\u0000\u0000\u0000N\u01e2\u0001\u0000\u0000\u0000P\u01e7\u0001"+
		"\u0000\u0000\u0000R\u01ee\u0001\u0000\u0000\u0000T\u01f5\u0001\u0000\u0000"+
		"\u0000V\u0200\u0001\u0000\u0000\u0000X\u0208\u0001\u0000\u0000\u0000Z"+
		"\u0213\u0001\u0000\u0000\u0000\\\u021a\u0001\u0000\u0000\u0000^\u022b"+
		"\u0001\u0000\u0000\u0000`\u022d\u0001\u0000\u0000\u0000b\u023b\u0001\u0000"+
		"\u0000\u0000d\u023d\u0001\u0000\u0000\u0000f\u024a\u0001\u0000\u0000\u0000"+
		"h\u0257\u0001\u0000\u0000\u0000j\u0266\u0001\u0000\u0000\u0000l\u0270"+
		"\u0001\u0000\u0000\u0000n\u0272\u0001\u0000\u0000\u0000p\u027f\u0001\u0000"+
		"\u0000\u0000r\u028d\u0001\u0000\u0000\u0000t\u028f\u0001\u0000\u0000\u0000"+
		"v\u0294\u0001\u0000\u0000\u0000x\u0299\u0001\u0000\u0000\u0000z\u029e"+
		"\u0001\u0000\u0000\u0000|\u02ac\u0001\u0000\u0000\u0000~\u02dc\u0001\u0000"+
		"\u0000\u0000\u0080\u02de\u0001\u0000\u0000\u0000\u0082\u02e3\u0001\u0000"+
		"\u0000\u0000\u0084\u02eb\u0001\u0000\u0000\u0000\u0086\u02f7\u0001\u0000"+
		"\u0000\u0000\u0088\u0302\u0001\u0000\u0000\u0000\u008a\u0306\u0001\u0000"+
		"\u0000\u0000\u008c\u0310\u0001\u0000\u0000\u0000\u008e\u0090\u0003\u0002"+
		"\u0001\u0000\u008f\u008e\u0001\u0000\u0000\u0000\u0090\u0093\u0001\u0000"+
		"\u0000\u0000\u0091\u008f\u0001\u0000\u0000\u0000\u0091\u0092\u0001\u0000"+
		"\u0000\u0000\u0092\u0001\u0001\u0000\u0000\u0000\u0093\u0091\u0001\u0000"+
		"\u0000\u0000\u0094\u0096\u0003B!\u0000\u0095\u0094\u0001\u0000\u0000\u0000"+
		"\u0095\u0096\u0001\u0000\u0000\u0000\u0096\u0098\u0001\u0000\u0000\u0000"+
		"\u0097\u0099\u0003\u0004\u0002\u0000\u0098\u0097\u0001\u0000\u0000\u0000"+
		"\u0098\u0099\u0001\u0000\u0000\u0000\u0099\u009a\u0001\u0000\u0000\u0000"+
		"\u009a\u009b\u0003 \u0010\u0000\u009b\u009c\u0005\u0007\u0000\u0000\u009c"+
		"\u009d\u0005 \u0000\u0000\u009d\u0003\u0001\u0000\u0000\u0000\u009e\u009f"+
		"\u0005\u0005\u0000\u0000\u009f\u00a0\u00054\u0000\u0000\u00a0\u00a1\u0003"+
		"\u0006\u0003\u0000\u00a1\u0005\u0001\u0000\u0000\u0000\u00a2\u00a3\u0006"+
		"\u0003\uffff\uffff\u0000\u00a3\u00a4\u0003\b\u0004\u0000\u00a4\u00a9\u0001"+
		"\u0000\u0000\u0000\u00a5\u00a6\n\u0002\u0000\u0000\u00a6\u00a8\u0003\b"+
		"\u0004\u0000\u00a7\u00a5\u0001\u0000\u0000\u0000\u00a8\u00ab\u0001\u0000"+
		"\u0000\u0000\u00a9\u00a7\u0001\u0000\u0000\u0000\u00a9\u00aa\u0001\u0000"+
		"\u0000\u0000\u00aa\u0007\u0001\u0000\u0000\u0000\u00ab\u00a9\u0001\u0000"+
		"\u0000\u0000\u00ac\u00af\u0003\n\u0005\u0000\u00ad\u00af\u0003\u000e\u0007"+
		"\u0000\u00ae\u00ac\u0001\u0000\u0000\u0000\u00ae\u00ad\u0001\u0000\u0000"+
		"\u0000\u00af\t\u0001\u0000\u0000\u0000\u00b0\u00b1\u0005\u001a\u0000\u0000"+
		"\u00b1\u00b2\u0003\f\u0006\u0000\u00b2\u00b3\u00058\u0000\u0000\u00b3"+
		"\u00b4\u0005\'\u0000\u0000\u00b4\u00b5\u0003\u0018\f\u0000\u00b5\u00b6"+
		"\u0005(\u0000\u0000\u00b6\u00b7\u0005#\u0000\u0000\u00b7\u00b8\u0003\u0010"+
		"\b\u0000\u00b8\u00b9\u0005$\u0000\u0000\u00b9\u00ba\u0005\u0013\u0000"+
		"\u0000\u00ba\u00bb\u0005 \u0000\u0000\u00bb\u000b\u0001\u0000\u0000\u0000"+
		"\u00bc\u00bf\u0003~?\u0000\u00bd\u00bf\u0003\u008aE\u0000\u00be\u00bc"+
		"\u0001\u0000\u0000\u0000\u00be\u00bd\u0001\u0000\u0000\u0000\u00bf\r\u0001"+
		"\u0000\u0000\u0000\u00c0\u00c1\u0005\u0019\u0000\u0000\u00c1\u00c2\u0005"+
		"8\u0000\u0000\u00c2\u00c3\u0005\'\u0000\u0000\u00c3\u00c4\u0003\u0018"+
		"\f\u0000\u00c4\u00c5\u0005(\u0000\u0000\u00c5\u00c6\u0005#\u0000\u0000"+
		"\u00c6\u00c7\u0003\u0012\t\u0000\u00c7\u00c8\u0005$\u0000\u0000\u00c8"+
		"\u00c9\u0005\u0013\u0000\u0000\u00c9\u00ca\u0005 \u0000\u0000\u00ca\u000f"+
		"\u0001\u0000\u0000\u0000\u00cb\u00cc\u0005\u0004\u0000\u0000\u00cc\u00ce"+
		"\u0005%\u0000\u0000\u00cd\u00cf\u0003\u0014\n\u0000\u00ce\u00cd\u0001"+
		"\u0000\u0000\u0000\u00ce\u00cf\u0001\u0000\u0000\u0000\u00cf\u00d0\u0001"+
		"\u0000\u0000\u0000\u00d0\u00d1\u0005&\u0000\u0000\u00d1\u00d2\u0003\""+
		"\u0011\u0000\u00d2\u0011\u0001\u0000\u0000\u0000\u00d3\u00d4\u0005\u0004"+
		"\u0000\u0000\u00d4\u00d6\u0005%\u0000\u0000\u00d5\u00d7\u0003\u0014\n"+
		"\u0000\u00d6\u00d5\u0001\u0000\u0000\u0000\u00d6\u00d7\u0001\u0000\u0000"+
		"\u0000\u00d7\u00d8\u0001\u0000\u0000\u0000\u00d8\u00d9\u0005&\u0000\u0000"+
		"\u00d9\u00da\u0003\"\u0011\u0000\u00da\u0013\u0001\u0000\u0000\u0000\u00db"+
		"\u00dc\u0006\n\uffff\uffff\u0000\u00dc\u00dd\u0003\u0016\u000b\u0000\u00dd"+
		"\u00e2\u0001\u0000\u0000\u0000\u00de\u00df\n\u0002\u0000\u0000\u00df\u00e1"+
		"\u0003\u0016\u000b\u0000\u00e0\u00de\u0001\u0000\u0000\u0000\u00e1\u00e4"+
		"\u0001\u0000\u0000\u0000\u00e2\u00e0\u0001\u0000\u0000\u0000\u00e2\u00e3"+
		"\u0001\u0000\u0000\u0000\u00e3\u0015\u0001\u0000\u0000\u0000\u00e4\u00e2"+
		"\u0001\u0000\u0000\u0000\u00e5\u00eb\u0003Z-\u0000\u00e6\u00eb\u0003\\"+
		".\u0000\u00e7\u00eb\u0003^/\u0000\u00e8\u00eb\u0003`0\u0000\u00e9\u00eb"+
		"\u0003V+\u0000\u00ea\u00e5\u0001\u0000\u0000\u0000\u00ea\u00e6\u0001\u0000"+
		"\u0000\u0000\u00ea\u00e7\u0001\u0000\u0000\u0000\u00ea\u00e8\u0001\u0000"+
		"\u0000\u0000\u00ea\u00e9\u0001\u0000\u0000\u0000\u00eb\u0017\u0001\u0000"+
		"\u0000\u0000\u00ec\u00ed\u0006\f\uffff\uffff\u0000\u00ed\u00f0\u0003\u001a"+
		"\r\u0000\u00ee\u00f0\u0001\u0000\u0000\u0000\u00ef\u00ec\u0001\u0000\u0000"+
		"\u0000\u00ef\u00ee\u0001\u0000\u0000\u0000\u00f0\u00f6\u0001\u0000\u0000"+
		"\u0000\u00f1\u00f2\n\u0003\u0000\u0000\u00f2\u00f3\u0005\u001f\u0000\u0000"+
		"\u00f3\u00f5\u0003\u001a\r\u0000\u00f4\u00f1\u0001\u0000\u0000\u0000\u00f5"+
		"\u00f8\u0001\u0000\u0000\u0000\u00f6\u00f4\u0001\u0000\u0000\u0000\u00f6"+
		"\u00f7\u0001\u0000\u0000\u0000\u00f7\u0019\u0001\u0000\u0000\u0000\u00f8"+
		"\u00f6\u0001\u0000\u0000\u0000\u00f9\u00fa\u0005\u0010\u0000\u0000\u00fa"+
		"\u00fb\u00058\u0000\u0000\u00fb\u00fc\u0005!\u0000\u0000\u00fc\u0102\u0003"+
		"\u001c\u000e\u0000\u00fd\u00fe\u0005\u0011\u0000\u0000\u00fe\u00ff\u0005"+
		"8\u0000\u0000\u00ff\u0100\u0005!\u0000\u0000\u0100\u0102\u0003\u001e\u000f"+
		"\u0000\u0101\u00f9\u0001\u0000\u0000\u0000\u0101\u00fd\u0001\u0000\u0000"+
		"\u0000\u0102\u001b\u0001\u0000\u0000\u0000\u0103\u0108\u0003~?\u0000\u0104"+
		"\u0106\u0003\u008aE\u0000\u0105\u0104\u0001\u0000\u0000\u0000\u0105\u0106"+
		"\u0001\u0000\u0000\u0000\u0106\u0108\u0001\u0000\u0000\u0000\u0107\u0103"+
		"\u0001\u0000\u0000\u0000\u0107\u0105\u0001\u0000\u0000\u0000\u0108\u001d"+
		"\u0001\u0000\u0000\u0000\u0109\u010e\u0003~?\u0000\u010a\u010c\u0003\u008a"+
		"E\u0000\u010b\u010a\u0001\u0000\u0000\u0000\u010b\u010c\u0001\u0000\u0000"+
		"\u0000\u010c\u010e\u0001\u0000\u0000\u0000\u010d\u0109\u0001\u0000\u0000"+
		"\u0000\u010d\u010b\u0001\u0000\u0000\u0000\u010e\u001f\u0001\u0000\u0000"+
		"\u0000\u010f\u0110\u0005\u0006\u0000\u0000\u0110\u0111\u00054\u0000\u0000"+
		"\u0111\u0112\u0003\"\u0011\u0000\u0112!\u0001\u0000\u0000\u0000\u0113"+
		"\u0114\u0006\u0011\uffff\uffff\u0000\u0114\u0115\u0003$\u0012\u0000\u0115"+
		"\u011a\u0001\u0000\u0000\u0000\u0116\u0117\n\u0002\u0000\u0000\u0117\u0119"+
		"\u0003$\u0012\u0000\u0118\u0116\u0001\u0000\u0000\u0000\u0119\u011c\u0001"+
		"\u0000\u0000\u0000\u011a\u0118\u0001\u0000\u0000\u0000\u011a\u011b\u0001"+
		"\u0000\u0000\u0000\u011b#\u0001\u0000\u0000\u0000\u011c\u011a\u0001\u0000"+
		"\u0000\u0000\u011d\u012d\u0003.\u0017\u0000\u011e\u012d\u0003*\u0015\u0000"+
		"\u011f\u0120\u0003\u0082A\u0000\u0120\u0121\u0005 \u0000\u0000\u0121\u012d"+
		"\u0001\u0000\u0000\u0000\u0122\u012d\u0003(\u0014\u0000\u0123\u012d\u0003"+
		"&\u0013\u0000\u0124\u012d\u0003\u008cF\u0000\u0125\u012d\u0003J%\u0000"+
		"\u0126\u012d\u0003L&\u0000\u0127\u012d\u0003T*\u0000\u0128\u012d\u0003"+
		"H$\u0000\u0129\u012d\u0003R)\u0000\u012a\u012d\u0003P(\u0000\u012b\u012d"+
		"\u0003N\'\u0000\u012c\u011d\u0001\u0000\u0000\u0000\u012c\u011e\u0001"+
		"\u0000\u0000\u0000\u012c\u011f\u0001\u0000\u0000\u0000\u012c\u0122\u0001"+
		"\u0000\u0000\u0000\u012c\u0123\u0001\u0000\u0000\u0000\u012c\u0124\u0001"+
		"\u0000\u0000\u0000\u012c\u0125\u0001\u0000\u0000\u0000\u012c\u0126\u0001"+
		"\u0000\u0000\u0000\u012c\u0127\u0001\u0000\u0000\u0000\u012c\u0128\u0001"+
		"\u0000\u0000\u0000\u012c\u0129\u0001\u0000\u0000\u0000\u012c\u012a\u0001"+
		"\u0000\u0000\u0000\u012c\u012b\u0001\u0000\u0000\u0000\u012d%\u0001\u0000"+
		"\u0000\u0000\u012e\u012f\u0005\u001b\u0000\u0000\u012f\u0130\u0003|>\u0000"+
		"\u0130\u0131\u0005 \u0000\u0000\u0131\u0135\u0001\u0000\u0000\u0000\u0132"+
		"\u0133\u0005\u001b\u0000\u0000\u0133\u0135\u0005 \u0000\u0000\u0134\u012e"+
		"\u0001\u0000\u0000\u0000\u0134\u0132\u0001\u0000\u0000\u0000\u0135\'\u0001"+
		"\u0000\u0000\u0000\u0136\u0137\u0005\u001c\u0000\u0000\u0137\u013b\u0005"+
		" \u0000\u0000\u0138\u0139\u0005\u001d\u0000\u0000\u0139\u013b\u0005 \u0000"+
		"\u0000\u013a\u0136\u0001\u0000\u0000\u0000\u013a\u0138\u0001\u0000\u0000"+
		"\u0000\u013b)\u0001\u0000\u0000\u0000\u013c\u013d\u0003\u0086C\u0000\u013d"+
		"\u013e\u0005\t\u0000\u0000\u013e\u0145\u0001\u0000\u0000\u0000\u013f\u0145"+
		"\u0005\t\u0000\u0000\u0140\u0141\u0005\b\u0000\u0000\u0141\u0142\u0003"+
		",\u0016\u0000\u0142\u0143\u0005 \u0000\u0000\u0143\u0145\u0001\u0000\u0000"+
		"\u0000\u0144\u013c\u0001\u0000\u0000\u0000\u0144\u013f\u0001\u0000\u0000"+
		"\u0000\u0144\u0140\u0001\u0000\u0000\u0000\u0145+\u0001\u0000\u0000\u0000"+
		"\u0146\u0147\u0006\u0016\uffff\uffff\u0000\u0147\u0148\u0003|>\u0000\u0148"+
		"\u014e\u0001\u0000\u0000\u0000\u0149\u014a\n\u0002\u0000\u0000\u014a\u014b"+
		"\u0005\b\u0000\u0000\u014b\u014d\u0003|>\u0000\u014c\u0149\u0001\u0000"+
		"\u0000\u0000\u014d\u0150\u0001\u0000\u0000\u0000\u014e\u014c\u0001\u0000"+
		"\u0000\u0000\u014e\u014f\u0001\u0000\u0000\u0000\u014f-\u0001\u0000\u0000"+
		"\u0000\u0150\u014e\u0001\u0000\u0000\u0000\u0151\u0156\u00030\u0018\u0000"+
		"\u0152\u0156\u00038\u001c\u0000\u0153\u0156\u0003:\u001d\u0000\u0154\u0156"+
		"\u0003<\u001e\u0000\u0155\u0151\u0001\u0000\u0000\u0000\u0155\u0152\u0001"+
		"\u0000\u0000\u0000\u0155\u0153\u0001\u0000\u0000\u0000\u0155\u0154\u0001"+
		"\u0000\u0000\u0000\u0156/\u0001\u0000\u0000\u0000\u0157\u0158\u0005\u0017"+
		"\u0000\u0000\u0158\u0159\u0005\'\u0000\u0000\u0159\u015a\u0003|>\u0000"+
		"\u015a\u015b\u0005(\u0000\u0000\u015b\u015c\u0005#\u0000\u0000\u015c\u015d"+
		"\u0003\"\u0011\u0000\u015d\u015e\u0005$\u0000\u0000\u015e\u015f\u0003"+
		"2\u0019\u0000\u015f\u0160\u00036\u001b\u0000\u0160\u0161\u0005\u0013\u0000"+
		"\u0000\u0161\u0162\u0005 \u0000\u0000\u01621\u0001\u0000\u0000\u0000\u0163"+
		"\u0168\u0006\u0019\uffff\uffff\u0000\u0164\u0165\n\u0002\u0000\u0000\u0165"+
		"\u0167\u00034\u001a\u0000\u0166\u0164\u0001\u0000\u0000\u0000\u0167\u016a"+
		"\u0001\u0000\u0000\u0000\u0168\u0166\u0001\u0000\u0000\u0000\u0168\u0169"+
		"\u0001\u0000\u0000\u0000\u01693\u0001\u0000\u0000\u0000\u016a\u0168\u0001"+
		"\u0000\u0000\u0000\u016b\u016c\u0005\u0018\u0000\u0000\u016c\u016d\u0005"+
		"\'\u0000\u0000\u016d\u016e\u0003|>\u0000\u016e\u016f\u0005(\u0000\u0000"+
		"\u016f\u0170\u0005#\u0000\u0000\u0170\u0171\u0003\"\u0011\u0000\u0171"+
		"\u0172\u0005$\u0000\u0000\u01725\u0001\u0000\u0000\u0000\u0173\u0174\u0005"+
		"\u0018\u0000\u0000\u0174\u0175\u0005#\u0000\u0000\u0175\u0176\u0003\""+
		"\u0011\u0000\u0176\u0177\u0005$\u0000\u0000\u0177\u017a\u0001\u0000\u0000"+
		"\u0000\u0178\u017a\u0001\u0000\u0000\u0000\u0179\u0173\u0001\u0000\u0000"+
		"\u0000\u0179\u0178\u0001\u0000\u0000\u0000\u017a7\u0001\u0000\u0000\u0000"+
		"\u017b\u017c\u0005\u0014\u0000\u0000\u017c\u017d\u0005\'\u0000\u0000\u017d"+
		"\u017e\u0003|>\u0000\u017e\u017f\u0005(\u0000\u0000\u017f\u0180\u0005"+
		"#\u0000\u0000\u0180\u0181\u0003\"\u0011\u0000\u0181\u0182\u0005$\u0000"+
		"\u0000\u0182\u0183\u0005\u0013\u0000\u0000\u0183\u0184\u0005 \u0000\u0000"+
		"\u01849\u0001\u0000\u0000\u0000\u0185\u0186\u0005\u0015\u0000\u0000\u0186"+
		"\u0187\u0005#\u0000\u0000\u0187\u0188\u0003\"\u0011\u0000\u0188\u0189"+
		"\u0005$\u0000\u0000\u0189\u018a\u0005\u0014\u0000\u0000\u018a\u018b\u0005"+
		"\'\u0000\u0000\u018b\u018c\u0003|>\u0000\u018c\u018d\u0005(\u0000\u0000"+
		"\u018d\u018e\u0005 \u0000\u0000\u018e;\u0001\u0000\u0000\u0000\u018f\u0190"+
		"\u0005\u0016\u0000\u0000\u0190\u0191\u0005\'\u0000\u0000\u0191\u0192\u0003"+
		">\u001f\u0000\u0192\u0193\u0005 \u0000\u0000\u0193\u0194\u0003|>\u0000"+
		"\u0194\u0195\u0005 \u0000\u0000\u0195\u0196\u0003@ \u0000\u0196\u0197"+
		"\u0005(\u0000\u0000\u0197\u0198\u0005#\u0000\u0000\u0198\u0199\u0003\""+
		"\u0011\u0000\u0199\u019a\u0005$\u0000\u0000\u019a=\u0001\u0000\u0000\u0000"+
		"\u019b\u019c\u0005\u0010\u0000\u0000\u019c\u019d\u00058\u0000\u0000\u019d"+
		"\u019e\u0005!\u0000\u0000\u019e\u019f\u0003~?\u0000\u019f\u01a0\u0003"+
		"|>\u0000\u01a0\u01a5\u0001\u0000\u0000\u0000\u01a1\u01a2\u00058\u0000"+
		"\u0000\u01a2\u01a3\u0005\u001e\u0000\u0000\u01a3\u01a5\u0003|>\u0000\u01a4"+
		"\u019b\u0001\u0000\u0000\u0000\u01a4\u01a1\u0001\u0000\u0000\u0000\u01a5"+
		"?\u0001\u0000\u0000\u0000\u01a6\u01a7\u00058\u0000\u0000\u01a7\u01ae\u0005"+
		")\u0000\u0000\u01a8\u01a9\u00058\u0000\u0000\u01a9\u01ae\u0005*\u0000"+
		"\u0000\u01aa\u01ab\u00058\u0000\u0000\u01ab\u01ac\u0005\u001e\u0000\u0000"+
		"\u01ac\u01ae\u0003|>\u0000\u01ad\u01a6\u0001\u0000\u0000\u0000\u01ad\u01a8"+
		"\u0001\u0000\u0000\u0000\u01ad\u01aa\u0001\u0000\u0000\u0000\u01aeA\u0001"+
		"\u0000\u0000\u0000\u01af\u01b0\u0005\u0004\u0000\u0000\u01b0\u01b1\u0005"+
		"4\u0000\u0000\u01b1\u01b2\u0003D\"\u0000\u01b2C\u0001\u0000\u0000\u0000"+
		"\u01b3\u01b4\u0006\"\uffff\uffff\u0000\u01b4\u01b5\u0003F#\u0000\u01b5"+
		"\u01ba\u0001\u0000\u0000\u0000\u01b6\u01b7\n\u0002\u0000\u0000\u01b7\u01b9"+
		"\u0003F#\u0000\u01b8\u01b6\u0001\u0000\u0000\u0000\u01b9\u01bc\u0001\u0000"+
		"\u0000\u0000\u01ba\u01b8\u0001\u0000\u0000\u0000\u01ba\u01bb\u0001\u0000"+
		"\u0000\u0000\u01bbE\u0001\u0000\u0000\u0000\u01bc\u01ba\u0001\u0000\u0000"+
		"\u0000\u01bd\u01cc\u0003Z-\u0000\u01be\u01cc\u0003J%\u0000\u01bf\u01cc"+
		"\u0003\\.\u0000\u01c0\u01cc\u0003^/\u0000\u01c1\u01cc\u0003`0\u0000\u01c2"+
		"\u01cc\u0003L&\u0000\u01c3\u01cc\u0003j5\u0000\u01c4\u01cc\u0003T*\u0000"+
		"\u01c5\u01cc\u0003V+\u0000\u01c6\u01cc\u0003H$\u0000\u01c7\u01cc\u0003"+
		"P(\u0000\u01c8\u01cc\u0003R)\u0000\u01c9\u01cc\u0003\u008cF\u0000\u01ca"+
		"\u01cc\u0003N\'\u0000\u01cb\u01bd\u0001\u0000\u0000\u0000\u01cb\u01be"+
		"\u0001\u0000\u0000\u0000\u01cb\u01bf\u0001\u0000\u0000\u0000\u01cb\u01c0"+
		"\u0001\u0000\u0000\u0000\u01cb\u01c1\u0001\u0000\u0000\u0000\u01cb\u01c2"+
		"\u0001\u0000\u0000\u0000\u01cb\u01c3\u0001\u0000\u0000\u0000\u01cb\u01c4"+
		"\u0001\u0000\u0000\u0000\u01cb\u01c5\u0001\u0000\u0000\u0000\u01cb\u01c6"+
		"\u0001\u0000\u0000\u0000\u01cb\u01c7\u0001\u0000\u0000\u0000\u01cb\u01c8"+
		"\u0001\u0000\u0000\u0000\u01cb\u01c9\u0001\u0000\u0000\u0000\u01cb\u01ca"+
		"\u0001\u0000\u0000\u0000\u01ccG\u0001\u0000\u0000\u0000\u01cd\u01ce\u0005"+
		"8\u0000\u0000\u01ce\u01cf\u0005\u001e\u0000\u0000\u01cf\u01d0\u0005#\u0000"+
		"\u0000\u01d0\u01d1\u0003X,\u0000\u01d1\u01d3\u0005$\u0000\u0000\u01d2"+
		"\u01d4\u0005 \u0000\u0000\u01d3\u01d2\u0001\u0000\u0000\u0000\u01d3\u01d4"+
		"\u0001\u0000\u0000\u0000\u01d4I\u0001\u0000\u0000\u0000\u01d5\u01d6\u0005"+
		"8\u0000\u0000\u01d6\u01d7\u0005\u001e\u0000\u0000\u01d7\u01d8\u0003|>"+
		"\u0000\u01d8\u01d9\u0005 \u0000\u0000\u01d9K\u0001\u0000\u0000\u0000\u01da"+
		"\u01db\u00058\u0000\u0000\u01db\u01dc\u0005%\u0000\u0000\u01dc\u01dd\u0003"+
		"|>\u0000\u01dd\u01de\u0005&\u0000\u0000\u01de\u01df\u0005\u001e\u0000"+
		"\u0000\u01df\u01e0\u0003|>\u0000\u01e0\u01e1\u0005 \u0000\u0000\u01e1"+
		"M\u0001\u0000\u0000\u0000\u01e2\u01e3\u0003h4\u0000\u01e3\u01e4\u0005"+
		"\u001e\u0000\u0000\u01e4\u01e5\u0003|>\u0000\u01e5\u01e6\u0005 \u0000"+
		"\u0000\u01e6O\u0001\u0000\u0000\u0000\u01e7\u01e8\u00058\u0000\u0000\u01e8"+
		"\u01e9\u0005\"\u0000\u0000\u01e9\u01ea\u00058\u0000\u0000\u01ea\u01eb"+
		"\u0005\u001e\u0000\u0000\u01eb\u01ec\u0003|>\u0000\u01ec\u01ed\u0005 "+
		"\u0000\u0000\u01edQ\u0001\u0000\u0000\u0000\u01ee\u01ef\u00058\u0000\u0000"+
		"\u01ef\u01f0\u0005\"\u0000\u0000\u01f0\u01f1\u00058\u0000\u0000\u01f1"+
		"\u01f2\u0005\u001e\u0000\u0000\u01f2\u01f3\u0003b1\u0000\u01f3\u01f4\u0005"+
		" \u0000\u0000\u01f4S\u0001\u0000\u0000\u0000\u01f5\u01f6\u00058\u0000"+
		"\u0000\u01f6\u01f7\u0005\"\u0000\u0000\u01f7\u01f8\u00058\u0000\u0000"+
		"\u01f8\u01f9\u0005%\u0000\u0000\u01f9\u01fa\u0003|>\u0000\u01fa\u01fb"+
		"\u0005&\u0000\u0000\u01fb\u01fc\u0005\u001e\u0000\u0000\u01fc\u01fd\u0005"+
		"#\u0000\u0000\u01fd\u01fe\u0003X,\u0000\u01fe\u01ff\u0005$\u0000\u0000"+
		"\u01ffU\u0001\u0000\u0000\u0000\u0200\u0201\u0005\u0010\u0000\u0000\u0201"+
		"\u0202\u00058\u0000\u0000\u0202\u0203\u0005!\u0000\u0000\u0203\u0204\u0005"+
		"8\u0000\u0000\u0204\u0205\u0005#\u0000\u0000\u0205\u0206\u0003X,\u0000"+
		"\u0206\u0207\u0005$\u0000\u0000\u0207W\u0001\u0000\u0000\u0000\u0208\u0209"+
		"\u0006,\uffff\uffff\u0000\u0209\u020a\u0003z=\u0000\u020a\u0210\u0001"+
		"\u0000\u0000\u0000\u020b\u020c\n\u0002\u0000\u0000\u020c\u020d\u0005\u001f"+
		"\u0000\u0000\u020d\u020f\u0003z=\u0000\u020e\u020b\u0001\u0000\u0000\u0000"+
		"\u020f\u0212\u0001\u0000\u0000\u0000\u0210\u020e\u0001\u0000\u0000\u0000"+
		"\u0210\u0211\u0001\u0000\u0000\u0000\u0211Y\u0001\u0000\u0000\u0000\u0212"+
		"\u0210\u0001\u0000\u0000\u0000\u0213\u0214\u0005\u0010\u0000\u0000\u0214"+
		"\u0215\u00058\u0000\u0000\u0215\u0216\u0005!\u0000\u0000\u0216\u0217\u0003"+
		"~?\u0000\u0217\u0218\u0003|>\u0000\u0218\u0219\u0005 \u0000\u0000\u0219"+
		"[\u0001\u0000\u0000\u0000\u021a\u021b\u0005\u0010\u0000\u0000\u021b\u021c"+
		"\u00058\u0000\u0000\u021c\u021d\u0005!\u0000\u0000\u021d\u021e\u0003\u008a"+
		"E\u0000\u021e\u021f\u0005 \u0000\u0000\u021f]\u0001\u0000\u0000\u0000"+
		"\u0220\u0221\u0005\u0011\u0000\u0000\u0221\u0222\u00058\u0000\u0000\u0222"+
		"\u0223\u0005%\u0000\u0000\u0223\u0224\u0003|>\u0000\u0224\u0225\u0005"+
		"&\u0000\u0000\u0225\u0226\u0005!\u0000\u0000\u0226\u0227\u0003~?\u0000"+
		"\u0227\u0228\u0003b1\u0000\u0228\u0229\u0005 \u0000\u0000\u0229\u022c"+
		"\u0001\u0000\u0000\u0000\u022a\u022c\u0003`0\u0000\u022b\u0220\u0001\u0000"+
		"\u0000\u0000\u022b\u022a\u0001\u0000\u0000\u0000\u022c_\u0001\u0000\u0000"+
		"\u0000\u022d\u022e\u0005\u0011\u0000\u0000\u022e\u022f\u00058\u0000\u0000"+
		"\u022f\u0230\u0005%\u0000\u0000\u0230\u0231\u0003|>\u0000\u0231\u0232"+
		"\u0005&\u0000\u0000\u0232\u0233\u0005!\u0000\u0000\u0233\u0234\u0003b"+
		"1\u0000\u0234\u0235\u0005 \u0000\u0000\u0235a\u0001\u0000\u0000\u0000"+
		"\u0236\u0237\u0005#\u0000\u0000\u0237\u0238\u0003d2\u0000\u0238\u0239"+
		"\u0005$\u0000\u0000\u0239\u023c\u0001\u0000\u0000\u0000\u023a\u023c\u0001"+
		"\u0000\u0000\u0000\u023b\u0236\u0001\u0000\u0000\u0000\u023b\u023a\u0001"+
		"\u0000\u0000\u0000\u023cc\u0001\u0000\u0000\u0000\u023d\u023e\u00062\uffff"+
		"\uffff\u0000\u023e\u023f\u0003f3\u0000\u023f\u0245\u0001\u0000\u0000\u0000"+
		"\u0240\u0241\n\u0002\u0000\u0000\u0241\u0242\u0005\u001f\u0000\u0000\u0242"+
		"\u0244\u0003f3\u0000\u0243\u0240\u0001\u0000\u0000\u0000\u0244\u0247\u0001"+
		"\u0000\u0000\u0000\u0245\u0243\u0001\u0000\u0000\u0000\u0245\u0246\u0001"+
		"\u0000\u0000\u0000\u0246e\u0001\u0000\u0000\u0000\u0247\u0245\u0001\u0000"+
		"\u0000\u0000\u0248\u024b\u0003h4\u0000\u0249\u024b\u0003|>\u0000\u024a"+
		"\u0248\u0001\u0000\u0000\u0000\u024a\u0249\u0001\u0000\u0000\u0000\u024b"+
		"g\u0001\u0000\u0000\u0000\u024c\u024d\u00064\uffff\uffff\u0000\u024d\u024e"+
		"\u00058\u0000\u0000\u024e\u024f\u0005\"\u0000\u0000\u024f\u0258\u0005"+
		"8\u0000\u0000\u0250\u0251\u00058\u0000\u0000\u0251\u0252\u0005%\u0000"+
		"\u0000\u0252\u0253\u0003|>\u0000\u0253\u0254\u0005&\u0000\u0000\u0254"+
		"\u0255\u0005\"\u0000\u0000\u0255\u0256\u00058\u0000\u0000\u0256\u0258"+
		"\u0001\u0000\u0000\u0000\u0257\u024c\u0001\u0000\u0000\u0000\u0257\u0250"+
		"\u0001\u0000\u0000\u0000\u0258\u0263\u0001\u0000\u0000\u0000\u0259\u025a"+
		"\n\u0004\u0000\u0000\u025a\u025b\u0005\"\u0000\u0000\u025b\u0262\u0005"+
		"8\u0000\u0000\u025c\u025d\n\u0003\u0000\u0000\u025d\u025e\u0005%\u0000"+
		"\u0000\u025e\u025f\u0003|>\u0000\u025f\u0260\u0005&\u0000\u0000\u0260"+
		"\u0262\u0001\u0000\u0000\u0000\u0261\u0259\u0001\u0000\u0000\u0000\u0261"+
		"\u025c\u0001\u0000\u0000\u0000\u0262\u0265\u0001\u0000\u0000\u0000\u0263"+
		"\u0261\u0001\u0000\u0000\u0000\u0263\u0264\u0001\u0000\u0000\u0000\u0264"+
		"i\u0001\u0000\u0000\u0000\u0265\u0263\u0001\u0000\u0000\u0000\u0266\u0267"+
		"\u0005\u0012\u0000\u0000\u0267\u0268\u00058\u0000\u0000\u0268\u0269\u0005"+
		"#\u0000\u0000\u0269\u026a\u0003l6\u0000\u026a\u026b\u0005$\u0000\u0000"+
		"\u026b\u026c\u0005\u0013\u0000\u0000\u026c\u026d\u0005 \u0000\u0000\u026d"+
		"k\u0001\u0000\u0000\u0000\u026e\u0271\u0003n7\u0000\u026f\u0271\u0003"+
		"p8\u0000\u0270\u026e\u0001\u0000\u0000\u0000\u0270\u026f\u0001\u0000\u0000"+
		"\u0000\u0271m\u0001\u0000\u0000\u0000\u0272\u0273\u00067\uffff\uffff\u0000"+
		"\u0273\u0274\u0003r9\u0000\u0274\u0275\u0005 \u0000\u0000\u0275\u027c"+
		"\u0001\u0000\u0000\u0000\u0276\u0277\n\u0002\u0000\u0000\u0277\u0278\u0003"+
		"r9\u0000\u0278\u0279\u0005 \u0000\u0000\u0279\u027b\u0001\u0000\u0000"+
		"\u0000\u027a\u0276\u0001\u0000\u0000\u0000\u027b\u027e\u0001\u0000\u0000"+
		"\u0000\u027c\u027a\u0001\u0000\u0000\u0000\u027c\u027d\u0001\u0000\u0000"+
		"\u0000\u027do\u0001\u0000\u0000\u0000\u027e\u027c\u0001\u0000\u0000\u0000"+
		"\u027f\u0280\u00068\uffff\uffff\u0000\u0280\u0281\u0003r9\u0000\u0281"+
		"\u0287\u0001\u0000\u0000\u0000\u0282\u0283\n\u0002\u0000\u0000\u0283\u0284"+
		"\u0005\u001f\u0000\u0000\u0284\u0286\u0003r9\u0000\u0285\u0282\u0001\u0000"+
		"\u0000\u0000\u0286\u0289\u0001\u0000\u0000\u0000\u0287\u0285\u0001\u0000"+
		"\u0000\u0000\u0287\u0288\u0001\u0000\u0000\u0000\u0288q\u0001\u0000\u0000"+
		"\u0000\u0289\u0287\u0001\u0000\u0000\u0000\u028a\u028e\u0003t:\u0000\u028b"+
		"\u028e\u0003v;\u0000\u028c\u028e\u0003x<\u0000\u028d\u028a\u0001\u0000"+
		"\u0000\u0000\u028d\u028b\u0001\u0000\u0000\u0000\u028d\u028c\u0001\u0000"+
		"\u0000\u0000\u028es\u0001\u0000\u0000\u0000\u028f\u0290\u0005\u0010\u0000"+
		"\u0000\u0290\u0291\u00058\u0000\u0000\u0291\u0292\u0005!\u0000\u0000\u0292"+
		"\u0293\u0003~?\u0000\u0293u\u0001\u0000\u0000\u0000\u0294\u0295\u0005"+
		"\u0010\u0000\u0000\u0295\u0296\u00058\u0000\u0000\u0296\u0297\u0005!\u0000"+
		"\u0000\u0297\u0298\u0003\u008aE\u0000\u0298w\u0001\u0000\u0000\u0000\u0299"+
		"\u029a\u0005\u0011\u0000\u0000\u029a\u029b\u00058\u0000\u0000\u029b\u029c"+
		"\u0005!\u0000\u0000\u029c\u029d\u00058\u0000\u0000\u029dy\u0001\u0000"+
		"\u0000\u0000\u029e\u029f\u00058\u0000\u0000\u029f\u02a0\u0005!\u0000\u0000"+
		"\u02a0\u02a1\u0003|>\u0000\u02a1{\u0001\u0000\u0000\u0000\u02a2\u02a3"+
		"\u0006>\uffff\uffff\u0000\u02a3\u02a4\u0005\'\u0000\u0000\u02a4\u02a5"+
		"\u0003|>\u0000\u02a5\u02a6\u0005(\u0000\u0000\u02a6\u02ad\u0001\u0000"+
		"\u0000\u0000\u02a7\u02a8\u00057\u0000\u0000\u02a8\u02ad\u0003|>\u000f"+
		"\u02a9\u02aa\u0005,\u0000\u0000\u02aa\u02ad\u0003|>\u000e\u02ab\u02ad"+
		"\u0003\u0088D\u0000\u02ac\u02a2\u0001\u0000\u0000\u0000\u02ac\u02a7\u0001"+
		"\u0000\u0000\u0000\u02ac\u02a9\u0001\u0000\u0000\u0000\u02ac\u02ab\u0001"+
		"\u0000\u0000\u0000\u02ad\u02d4\u0001\u0000\u0000\u0000\u02ae\u02af\n\r"+
		"\u0000\u0000\u02af\u02b0\u0005-\u0000\u0000\u02b0\u02d3\u0003|>\u000e"+
		"\u02b1\u02b2\n\f\u0000\u0000\u02b2\u02b3\u0005.\u0000\u0000\u02b3\u02d3"+
		"\u0003|>\r\u02b4\u02b5\n\u000b\u0000\u0000\u02b5\u02b6\u0005+\u0000\u0000"+
		"\u02b6\u02d3\u0003|>\f\u02b7\u02b8\n\n\u0000\u0000\u02b8\u02b9\u0005,"+
		"\u0000\u0000\u02b9\u02d3\u0003|>\u000b\u02ba\u02bb\n\t\u0000\u0000\u02bb"+
		"\u02bc\u00053\u0000\u0000\u02bc\u02d3\u0003|>\n\u02bd\u02be\n\b\u0000"+
		"\u0000\u02be\u02bf\u00054\u0000\u0000\u02bf\u02d3\u0003|>\t\u02c0\u02c1"+
		"\n\u0007\u0000\u0000\u02c1\u02c2\u00051\u0000\u0000\u02c2\u02d3\u0003"+
		"|>\b\u02c3\u02c4\n\u0006\u0000\u0000\u02c4\u02c5\u00050\u0000\u0000\u02c5"+
		"\u02d3\u0003|>\u0007\u02c6\u02c7\n\u0005\u0000\u0000\u02c7\u02c8\u0005"+
		"/\u0000\u0000\u02c8\u02d3\u0003|>\u0006\u02c9\u02ca\n\u0004\u0000\u0000"+
		"\u02ca\u02cb\u00052\u0000\u0000\u02cb\u02d3\u0003|>\u0005\u02cc\u02cd"+
		"\n\u0003\u0000\u0000\u02cd\u02ce\u00055\u0000\u0000\u02ce\u02d3\u0003"+
		"|>\u0004\u02cf\u02d0\n\u0002\u0000\u0000\u02d0\u02d1\u00056\u0000\u0000"+
		"\u02d1\u02d3\u0003|>\u0003\u02d2\u02ae\u0001\u0000\u0000\u0000\u02d2\u02b1"+
		"\u0001\u0000\u0000\u0000\u02d2\u02b4\u0001\u0000\u0000\u0000\u02d2\u02b7"+
		"\u0001\u0000\u0000\u0000\u02d2\u02ba\u0001\u0000\u0000\u0000\u02d2\u02bd"+
		"\u0001\u0000\u0000\u0000\u02d2\u02c0\u0001\u0000\u0000\u0000\u02d2\u02c3"+
		"\u0001\u0000\u0000\u0000\u02d2\u02c6\u0001\u0000\u0000\u0000\u02d2\u02c9"+
		"\u0001\u0000\u0000\u0000\u02d2\u02cc\u0001\u0000\u0000\u0000\u02d2\u02cf"+
		"\u0001\u0000\u0000\u0000\u02d3\u02d6\u0001\u0000\u0000\u0000\u02d4\u02d2"+
		"\u0001\u0000\u0000\u0000\u02d4\u02d5\u0001\u0000\u0000\u0000\u02d5}\u0001"+
		"\u0000\u0000\u0000\u02d6\u02d4\u0001\u0000\u0000\u0000\u02d7\u02dd\u0005"+
		"\u000b\u0000\u0000\u02d8\u02dd\u0005\n\u0000\u0000\u02d9\u02dd\u0005\f"+
		"\u0000\u0000\u02da\u02dd\u0005\r\u0000\u0000\u02db\u02dd\u00058\u0000"+
		"\u0000\u02dc\u02d7\u0001\u0000\u0000\u0000\u02dc\u02d8\u0001\u0000\u0000"+
		"\u0000\u02dc\u02d9\u0001\u0000\u0000\u0000\u02dc\u02da\u0001\u0000\u0000"+
		"\u0000\u02dc\u02db\u0001\u0000\u0000\u0000\u02dd\u007f\u0001\u0000\u0000"+
		"\u0000\u02de\u02df\u00058\u0000\u0000\u02df\u02e0\u0005%\u0000\u0000\u02e0"+
		"\u02e1\u0003|>\u0000\u02e1\u02e2\u0005&\u0000\u0000\u02e2\u0081\u0001"+
		"\u0000\u0000\u0000\u02e3\u02e4\u00058\u0000\u0000\u02e4\u02e5\u0005\'"+
		"\u0000\u0000\u02e5\u02e6\u0003\u0084B\u0000\u02e6\u02e7\u0005(\u0000\u0000"+
		"\u02e7\u0083\u0001\u0000\u0000\u0000\u02e8\u02e9\u0006B\uffff\uffff\u0000"+
		"\u02e9\u02ec\u0003|>\u0000\u02ea\u02ec\u0001\u0000\u0000\u0000\u02eb\u02e8"+
		"\u0001\u0000\u0000\u0000\u02eb\u02ea\u0001\u0000\u0000\u0000\u02ec\u02f2"+
		"\u0001\u0000\u0000\u0000\u02ed\u02ee\n\u0003\u0000\u0000\u02ee\u02ef\u0005"+
		"\u001f\u0000\u0000\u02ef\u02f1\u0003|>\u0000\u02f0\u02ed\u0001\u0000\u0000"+
		"\u0000\u02f1\u02f4\u0001\u0000\u0000\u0000\u02f2\u02f0\u0001\u0000\u0000"+
		"\u0000\u02f2\u02f3\u0001\u0000\u0000\u0000\u02f3\u0085\u0001\u0000\u0000"+
		"\u0000\u02f4\u02f2\u0001\u0000\u0000\u0000\u02f5\u02f8\u0003h4\u0000\u02f6"+
		"\u02f8\u00058\u0000\u0000\u02f7\u02f5\u0001\u0000\u0000\u0000\u02f7\u02f6"+
		"\u0001\u0000\u0000\u0000\u02f8\u0087\u0001\u0000\u0000\u0000\u02f9\u0303"+
		"\u0005;\u0000\u0000\u02fa\u0303\u0005<\u0000\u0000\u02fb\u0303\u00058"+
		"\u0000\u0000\u02fc\u0303\u0005:\u0000\u0000\u02fd\u0303\u00059\u0000\u0000"+
		"\u02fe\u0303\u0003\u008aE\u0000\u02ff\u0303\u0003\u0080@\u0000\u0300\u0303"+
		"\u0003\u0082A\u0000\u0301\u0303\u0003h4\u0000\u0302\u02f9\u0001\u0000"+
		"\u0000\u0000\u0302\u02fa\u0001\u0000\u0000\u0000\u0302\u02fb\u0001\u0000"+
		"\u0000\u0000\u0302\u02fc\u0001\u0000\u0000\u0000\u0302\u02fd\u0001\u0000"+
		"\u0000\u0000\u0302\u02fe\u0001\u0000\u0000\u0000\u0302\u02ff\u0001\u0000"+
		"\u0000\u0000\u0302\u0300\u0001\u0000\u0000\u0000\u0302\u0301\u0001\u0000"+
		"\u0000\u0000\u0303\u0089\u0001\u0000\u0000\u0000\u0304\u0307\u0005\u000e"+
		"\u0000\u0000\u0305\u0307\u0005\u000f\u0000\u0000\u0306\u0304\u0001\u0000"+
		"\u0000\u0000\u0306\u0305\u0001\u0000\u0000\u0000\u0307\u008b\u0001\u0000"+
		"\u0000\u0000\u0308\u0309\u0003\u0086C\u0000\u0309\u030a\u0005)\u0000\u0000"+
		"\u030a\u030b\u0005 \u0000\u0000\u030b\u0311\u0001\u0000\u0000\u0000\u030c"+
		"\u030d\u0003\u0086C\u0000\u030d\u030e\u0005*\u0000\u0000\u030e\u030f\u0005"+
		" \u0000\u0000\u030f\u0311\u0001\u0000\u0000\u0000\u0310\u0308\u0001\u0000"+
		"\u0000\u0000\u0310\u030c\u0001\u0000\u0000\u0000\u0311\u008d\u0001\u0000"+
		"\u0000\u00005\u0091\u0095\u0098\u00a9\u00ae\u00be\u00ce\u00d6\u00e2\u00ea"+
		"\u00ef\u00f6\u0101\u0105\u0107\u010b\u010d\u011a\u012c\u0134\u013a\u0144"+
		"\u014e\u0155\u0168\u0179\u01a4\u01ad\u01ba\u01cb\u01d3\u0210\u022b\u023b"+
		"\u0245\u024a\u0257\u0261\u0263\u0270\u027c\u0287\u028d\u02ac\u02d2\u02d4"+
		"\u02dc\u02eb\u02f2\u02f7\u0302\u0306\u0310";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}