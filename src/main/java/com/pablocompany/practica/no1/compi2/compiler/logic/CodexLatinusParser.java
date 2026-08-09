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
		RULE_program = 0, RULE_body = 1, RULE_maior_section = 2, RULE_maior_body = 3, 
		RULE_functions_block = 4, RULE_function_declaration = 5, RULE_procedure_declaration = 6, 
		RULE_function_body = 7, RULE_procedure_body = 8, RULE_local_variable_list = 9, 
		RULE_local_variable = 10, RULE_function_arguments = 11, RULE_argument = 12, 
		RULE_start_value_call = 13, RULE_munera_section = 14, RULE_code_body = 15, 
		RULE_control_block = 16, RULE_return_control = 17, RULE_loop_control = 18, 
		RULE_console_actions = 19, RULE_print_function = 20, RULE_block_code = 21, 
		RULE_if_statement = 22, RULE_else_if_list = 23, RULE_else_if_clause = 24, 
		RULE_else_statement = 25, RULE_while_statement = 26, RULE_do_while_statement = 27, 
		RULE_for_statement = 28, RULE_for_init = 29, RULE_for_update = 30, RULE_variable_section = 31, 
		RULE_variabiles_body = 32, RULE_declarations = 33, RULE_struct_ussage = 34, 
		RULE_variable_ussage = 35, RULE_array_ussage = 36, RULE_struct_variable_set = 37, 
		RULE_struct_array_set = 38, RULE_struct_array_property = 39, RULE_struct_instance = 40, 
		RULE_struct_data_list = 41, RULE_variable_declaration = 42, RULE_boolean_declaration = 43, 
		RULE_normal_array = 44, RULE_boolean_array = 45, RULE_array_initialization = 46, 
		RULE_values_array_list = 47, RULE_array_value = 48, RULE_struct_values = 49, 
		RULE_struct_declaration = 50, RULE_struct_body = 51, RULE_struct_normal_body = 52, 
		RULE_struct_comma_body = 53, RULE_struct_attribute = 54, RULE_variable_without_value = 55, 
		RULE_boolean_variable_without_value = 56, RULE_array_variable_struct = 57, 
		RULE_struct_data_value = 58, RULE_expression = 59, RULE_variable_type = 60, 
		RULE_array_call = 61, RULE_function_call = 62, RULE_arguments_list = 63, 
		RULE_normal_values = 64, RULE_boolean_values = 65, RULE_abbreviated_operation = 66;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "body", "maior_section", "maior_body", "functions_block", 
			"function_declaration", "procedure_declaration", "function_body", "procedure_body", 
			"local_variable_list", "local_variable", "function_arguments", "argument", 
			"start_value_call", "munera_section", "code_body", "control_block", "return_control", 
			"loop_control", "console_actions", "print_function", "block_code", "if_statement", 
			"else_if_list", "else_if_clause", "else_statement", "while_statement", 
			"do_while_statement", "for_statement", "for_init", "for_update", "variable_section", 
			"variabiles_body", "declarations", "struct_ussage", "variable_ussage", 
			"array_ussage", "struct_variable_set", "struct_array_set", "struct_array_property", 
			"struct_instance", "struct_data_list", "variable_declaration", "boolean_declaration", 
			"normal_array", "boolean_array", "array_initialization", "values_array_list", 
			"array_value", "struct_values", "struct_declaration", "struct_body", 
			"struct_normal_body", "struct_comma_body", "struct_attribute", "variable_without_value", 
			"boolean_variable_without_value", "array_variable_struct", "struct_data_value", 
			"expression", "variable_type", "array_call", "function_call", "arguments_list", 
			"normal_values", "boolean_values", "abbreviated_operation"
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
			setState(137);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VARIABILES) {
				{
				{
				setState(134);
				body();
				}
				}
				setState(139);
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
			setState(140);
			variable_section();
			setState(142);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MUNERA) {
				{
				setState(141);
				munera_section();
				}
			}

			setState(144);
			maior_section();
			setState(145);
			match(FINIS_SEPARATOR);
			setState(146);
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
		public Maior_bodyContext maior_body() {
			return getRuleContext(Maior_bodyContext.class,0);
		}
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
			setState(148);
			match(MAIOR);
			setState(149);
			match(GREATER);
			setState(150);
			maior_body(0);
			}
		}
		catch (RecognitionException re) {
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
	public static class Maior_bodyContext extends ParserRuleContext {
		public Maior_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_maior_body; }
	 
		public Maior_bodyContext() { }
		public void copyFrom(Maior_bodyContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FunctionsBlockListContext extends Maior_bodyContext {
		public Maior_bodyContext maior_body() {
			return getRuleContext(Maior_bodyContext.class,0);
		}
		public Functions_blockContext functions_block() {
			return getRuleContext(Functions_blockContext.class,0);
		}
		public FunctionsBlockListContext(Maior_bodyContext ctx) { copyFrom(ctx); }
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
	public static class FunctionsSingleBlockContext extends Maior_bodyContext {
		public Functions_blockContext functions_block() {
			return getRuleContext(Functions_blockContext.class,0);
		}
		public FunctionsSingleBlockContext(Maior_bodyContext ctx) { copyFrom(ctx); }
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

	public final Maior_bodyContext maior_body() throws RecognitionException {
		return maior_body(0);
	}

	private Maior_bodyContext maior_body(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Maior_bodyContext _localctx = new Maior_bodyContext(_ctx, _parentState);
		Maior_bodyContext _prevctx = _localctx;
		int _startState = 6;
		enterRecursionRule(_localctx, 6, RULE_maior_body, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new FunctionsSingleBlockContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(153);
			functions_block();
			}
			_ctx.stop = _input.LT(-1);
			setState(159);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new FunctionsBlockListContext(new Maior_bodyContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_maior_body);
					setState(155);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(156);
					functions_block();
					}
					} 
				}
				setState(161);
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
			setState(164);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RATIO:
				_localctx = new FuncDeclBlockContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(162);
				function_declaration();
				}
				break;
			case ACTIO:
				_localctx = new ProcDeclBlockContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(163);
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
		public Variable_typeContext variable_type() {
			return getRuleContext(Variable_typeContext.class,0);
		}
		public TerminalNode ID() { return getToken(CodexLatinusParser.ID, 0); }
		public TerminalNode INIT_PARENT() { return getToken(CodexLatinusParser.INIT_PARENT, 0); }
		public Function_argumentsContext function_arguments() {
			return getRuleContext(Function_argumentsContext.class,0);
		}
		public TerminalNode FINAL_PARENT() { return getToken(CodexLatinusParser.FINAL_PARENT, 0); }
		public Function_bodyContext function_body() {
			return getRuleContext(Function_bodyContext.class,0);
		}
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
			setState(166);
			match(RATIO);
			setState(167);
			variable_type();
			setState(168);
			match(ID);
			setState(169);
			match(INIT_PARENT);
			setState(170);
			function_arguments(0);
			setState(171);
			match(FINAL_PARENT);
			setState(172);
			function_body();
			setState(173);
			match(FINIS);
			setState(174);
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
		public Procedure_bodyContext procedure_body() {
			return getRuleContext(Procedure_bodyContext.class,0);
		}
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
		enterRule(_localctx, 12, RULE_procedure_declaration);
		try {
			_localctx = new ProcedureDeclContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(176);
			match(ACTIO);
			setState(177);
			match(ID);
			setState(178);
			match(INIT_PARENT);
			setState(179);
			function_arguments(0);
			setState(180);
			match(FINAL_PARENT);
			setState(181);
			procedure_body();
			setState(182);
			match(FINIS);
			setState(183);
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
		public TerminalNode INIT_BRACE() { return getToken(CodexLatinusParser.INIT_BRACE, 0); }
		public Code_bodyContext code_body() {
			return getRuleContext(Code_bodyContext.class,0);
		}
		public TerminalNode FINAL_BRACE() { return getToken(CodexLatinusParser.FINAL_BRACE, 0); }
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
		enterRule(_localctx, 14, RULE_function_body);
		int _la;
		try {
			_localctx = new FunctionBodyContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(185);
			match(VARIABILES);
			setState(186);
			match(INIT_BRACKET);
			setState(188);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ESTO || _la==SERIES) {
				{
				setState(187);
				local_variable_list(0);
				}
			}

			setState(190);
			match(FINAL_BRACKET);
			setState(191);
			match(INIT_BRACE);
			setState(192);
			code_body(0);
			setState(193);
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
		public TerminalNode INIT_BRACE() { return getToken(CodexLatinusParser.INIT_BRACE, 0); }
		public Code_bodyContext code_body() {
			return getRuleContext(Code_bodyContext.class,0);
		}
		public TerminalNode FINAL_BRACE() { return getToken(CodexLatinusParser.FINAL_BRACE, 0); }
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
		enterRule(_localctx, 16, RULE_procedure_body);
		int _la;
		try {
			_localctx = new ProcedureBodyContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(195);
			match(VARIABILES);
			setState(196);
			match(INIT_BRACKET);
			setState(198);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ESTO || _la==SERIES) {
				{
				setState(197);
				local_variable_list(0);
				}
			}

			setState(200);
			match(FINAL_BRACKET);
			setState(201);
			match(INIT_BRACE);
			setState(202);
			code_body(0);
			setState(203);
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
		int _startState = 18;
		enterRecursionRule(_localctx, 18, RULE_local_variable_list, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new LocalSingleVariableContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(206);
			local_variable();
			}
			_ctx.stop = _input.LT(-1);
			setState(212);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new LocalVariablesListContext(new Local_variable_listContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_local_variable_list);
					setState(208);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(209);
					local_variable();
					}
					} 
				}
				setState(214);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
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
		enterRule(_localctx, 20, RULE_local_variable);
		try {
			setState(220);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				_localctx = new LocalVarDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(215);
				variable_declaration();
				}
				break;
			case 2:
				_localctx = new LocalBoolVarDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(216);
				boolean_declaration();
				}
				break;
			case 3:
				_localctx = new LocalArrayDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(217);
				normal_array();
				}
				break;
			case 4:
				_localctx = new LocalBoolArrayDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(218);
				boolean_array();
				}
				break;
			case 5:
				_localctx = new LocalStructInstanceContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(219);
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
		int _startState = 22;
		enterRecursionRule(_localctx, 22, RULE_function_arguments, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(225);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				_localctx = new FunctionSingleArgContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(223);
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
			setState(232);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new FunctionArgsListContext(new Function_argumentsContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_function_arguments);
					setState(227);
					if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
					setState(228);
					match(COMMA);
					setState(229);
					argument();
					}
					} 
				}
				setState(234);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
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
	public static class ArgumentDeclContext extends ArgumentContext {
		public TerminalNode ESTO() { return getToken(CodexLatinusParser.ESTO, 0); }
		public TerminalNode ID() { return getToken(CodexLatinusParser.ID, 0); }
		public TerminalNode TWO_POINTS() { return getToken(CodexLatinusParser.TWO_POINTS, 0); }
		public Variable_typeContext variable_type() {
			return getRuleContext(Variable_typeContext.class,0);
		}
		public Start_value_callContext start_value_call() {
			return getRuleContext(Start_value_callContext.class,0);
		}
		public ArgumentDeclContext(ArgumentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusParserListener ) ((CodexLatinusParserListener)listener).enterArgumentDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusParserListener ) ((CodexLatinusParserListener)listener).exitArgumentDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusParserVisitor ) return ((CodexLatinusParserVisitor<? extends T>)visitor).visitArgumentDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentContext argument() throws RecognitionException {
		ArgumentContext _localctx = new ArgumentContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_argument);
		try {
			_localctx = new ArgumentDeclContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(235);
			match(ESTO);
			setState(236);
			match(ID);
			setState(237);
			match(TWO_POINTS);
			setState(238);
			variable_type();
			setState(239);
			start_value_call();
			}
		}
		catch (RecognitionException re) {
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
	public static class Start_value_callContext extends ParserRuleContext {
		public Start_value_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start_value_call; }
	 
		public Start_value_callContext() { }
		public void copyFrom(Start_value_callContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArgFuncCallValueContext extends Start_value_callContext {
		public TerminalNode EQUAL() { return getToken(CodexLatinusParser.EQUAL, 0); }
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public TerminalNode DOT_COMMA() { return getToken(CodexLatinusParser.DOT_COMMA, 0); }
		public ArgFuncCallValueContext(Start_value_callContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusParserListener ) ((CodexLatinusParserListener)listener).enterArgFuncCallValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusParserListener ) ((CodexLatinusParserListener)listener).exitArgFuncCallValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusParserVisitor ) return ((CodexLatinusParserVisitor<? extends T>)visitor).visitArgFuncCallValue(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArgExprValueContext extends Start_value_callContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ArgExprValueContext(Start_value_callContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusParserListener ) ((CodexLatinusParserListener)listener).enterArgExprValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusParserListener ) ((CodexLatinusParserListener)listener).exitArgExprValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusParserVisitor ) return ((CodexLatinusParserVisitor<? extends T>)visitor).visitArgExprValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Start_value_callContext start_value_call() throws RecognitionException {
		Start_value_callContext _localctx = new Start_value_callContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_start_value_call);
		try {
			setState(246);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VERUM:
			case FALSUS:
			case INIT_PARENT:
			case MINUS:
			case NOT:
			case ID:
			case INT:
			case DECIMAL:
			case STRING:
			case CHAR:
				_localctx = new ArgExprValueContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(241);
				expression(0);
				}
				break;
			case EQUAL:
				_localctx = new ArgFuncCallValueContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(242);
				match(EQUAL);
				setState(243);
				function_call();
				setState(244);
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
	public static class MuneraCodeSectionContext extends Munera_sectionContext {
		public TerminalNode MUNERA() { return getToken(CodexLatinusParser.MUNERA, 0); }
		public TerminalNode GREATER() { return getToken(CodexLatinusParser.GREATER, 0); }
		public Code_bodyContext code_body() {
			return getRuleContext(Code_bodyContext.class,0);
		}
		public MuneraCodeSectionContext(Munera_sectionContext ctx) { copyFrom(ctx); }
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

	public final Munera_sectionContext munera_section() throws RecognitionException {
		Munera_sectionContext _localctx = new Munera_sectionContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_munera_section);
		try {
			_localctx = new MuneraCodeSectionContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(248);
			match(MUNERA);
			setState(249);
			match(GREATER);
			setState(250);
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
		int _startState = 30;
		enterRecursionRule(_localctx, 30, RULE_code_body, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new BlockSingleControlContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(253);
			control_block();
			}
			_ctx.stop = _input.LT(-1);
			setState(259);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new BlockControlListContext(new Code_bodyContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_code_body);
					setState(255);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(256);
					control_block();
					}
					} 
				}
				setState(261);
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

	public final Control_blockContext control_block() throws RecognitionException {
		Control_blockContext _localctx = new Control_blockContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_control_block);
		try {
			setState(276);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				_localctx = new BlockCodeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(262);
				block_code();
				}
				break;
			case 2:
				_localctx = new ConsoleActionsContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(263);
				console_actions();
				}
				break;
			case 3:
				_localctx = new FunctionSingleCallContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(264);
				function_call();
				setState(265);
				match(DOT_COMMA);
				}
				break;
			case 4:
				_localctx = new LoopControlActionContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(267);
				loop_control();
				}
				break;
			case 5:
				_localctx = new ReturnControlActionContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(268);
				return_control();
				}
				break;
			case 6:
				_localctx = new LocalAbbreviatedOperationContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(269);
				abbreviated_operation();
				}
				break;
			case 7:
				_localctx = new LocalVariableRedefinitionContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(270);
				variable_ussage();
				}
				break;
			case 8:
				_localctx = new LocalArrayRedefinitionContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(271);
				array_ussage();
				}
				break;
			case 9:
				_localctx = new LocalStructArrayDefinitionContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(272);
				struct_array_property();
				}
				break;
			case 10:
				_localctx = new LocalStructRedefinitionContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(273);
				struct_ussage();
				}
				break;
			case 11:
				_localctx = new LocalStructArraySetterContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(274);
				struct_array_set();
				}
				break;
			case 12:
				_localctx = new LocalStructPropertySetterContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(275);
				struct_variable_set();
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
		enterRule(_localctx, 34, RULE_return_control);
		try {
			setState(284);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				_localctx = new ReturnWithValueContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(278);
				match(REDDERE);
				setState(279);
				expression(0);
				setState(280);
				match(DOT_COMMA);
				}
				break;
			case 2:
				_localctx = new ReturnVoidContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(282);
				match(REDDERE);
				setState(283);
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
		enterRule(_localctx, 36, RULE_loop_control);
		try {
			setState(290);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PERGE:
				_localctx = new LoopContinueContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(286);
				match(PERGE);
				setState(287);
				match(DOT_COMMA);
				}
				break;
			case INTERRUMPE:
				_localctx = new LoopBreakContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(288);
				match(INTERRUMPE);
				setState(289);
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
	public static class ReadVarInputContext extends Console_actionsContext {
		public TerminalNode ID() { return getToken(CodexLatinusParser.ID, 0); }
		public TerminalNode READ() { return getToken(CodexLatinusParser.READ, 0); }
		public ReadVarInputContext(Console_actionsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusParserListener ) ((CodexLatinusParserListener)listener).enterReadVarInput(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusParserListener ) ((CodexLatinusParserListener)listener).exitReadVarInput(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusParserVisitor ) return ((CodexLatinusParserVisitor<? extends T>)visitor).visitReadVarInput(this);
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
		enterRule(_localctx, 38, RULE_console_actions);
		try {
			setState(299);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				_localctx = new ReadVarInputContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(292);
				match(ID);
				setState(293);
				match(READ);
				}
				break;
			case READ:
				_localctx = new ReadInputContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(294);
				match(READ);
				}
				break;
			case PRINT:
				_localctx = new PrintActionContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(295);
				match(PRINT);
				setState(296);
				print_function(0);
				setState(297);
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
		int _startState = 40;
		enterRecursionRule(_localctx, 40, RULE_print_function, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new PrintSingleExprContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(302);
			expression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(309);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new PrintMultipleExprContext(new Print_functionContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_print_function);
					setState(304);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(305);
					match(PRINT);
					setState(306);
					expression(0);
					}
					} 
				}
				setState(311);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
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
		enterRule(_localctx, 42, RULE_block_code);
		try {
			setState(316);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SI:
				_localctx = new CodeBlockIfContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(312);
				if_statement();
				}
				break;
			case DUM:
				_localctx = new CodeBlockWhileContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(313);
				while_statement();
				}
				break;
			case FACERE:
				_localctx = new CodeBlockDoWhileContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(314);
				do_while_statement();
				}
				break;
			case PER:
				_localctx = new CodeBlockForContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(315);
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
		enterRule(_localctx, 44, RULE_if_statement);
		try {
			_localctx = new IfStatementContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(318);
			match(SI);
			setState(319);
			match(INIT_PARENT);
			setState(320);
			expression(0);
			setState(321);
			match(FINAL_PARENT);
			setState(322);
			match(INIT_BRACE);
			setState(323);
			code_body(0);
			setState(324);
			match(FINAL_BRACE);
			setState(325);
			else_if_list(0);
			setState(326);
			else_statement();
			setState(327);
			match(FINIS);
			setState(328);
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
		int _startState = 46;
		enterRecursionRule(_localctx, 46, RULE_else_if_list, _p);
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
			setState(335);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ElseIfListContext(new Else_if_listContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_else_if_list);
					setState(331);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(332);
					else_if_clause();
					}
					} 
				}
				setState(337);
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
		enterRule(_localctx, 48, RULE_else_if_clause);
		try {
			_localctx = new ElseIfClauseContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(338);
			match(ALITER);
			setState(339);
			match(INIT_PARENT);
			setState(340);
			expression(0);
			setState(341);
			match(FINAL_PARENT);
			setState(342);
			match(INIT_BRACE);
			setState(343);
			code_body(0);
			setState(344);
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
		enterRule(_localctx, 50, RULE_else_statement);
		try {
			setState(352);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ALITER:
				_localctx = new ElseBlockContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(346);
				match(ALITER);
				setState(347);
				match(INIT_BRACE);
				setState(348);
				code_body(0);
				setState(349);
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
		enterRule(_localctx, 52, RULE_while_statement);
		try {
			_localctx = new WhileStatementContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(354);
			match(DUM);
			setState(355);
			match(INIT_PARENT);
			setState(356);
			expression(0);
			setState(357);
			match(FINAL_PARENT);
			setState(358);
			match(INIT_BRACE);
			setState(359);
			code_body(0);
			setState(360);
			match(FINAL_BRACE);
			setState(361);
			match(FINIS);
			setState(362);
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
		enterRule(_localctx, 54, RULE_do_while_statement);
		try {
			_localctx = new DoWhileStatementContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(364);
			match(FACERE);
			setState(365);
			match(INIT_BRACE);
			setState(366);
			code_body(0);
			setState(367);
			match(FINAL_BRACE);
			setState(368);
			match(DUM);
			setState(369);
			match(INIT_PARENT);
			setState(370);
			expression(0);
			setState(371);
			match(FINAL_PARENT);
			setState(372);
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
		enterRule(_localctx, 56, RULE_for_statement);
		try {
			_localctx = new ForStatementContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(374);
			match(PER);
			setState(375);
			match(INIT_PARENT);
			setState(376);
			for_init();
			setState(377);
			match(DOT_COMMA);
			setState(378);
			expression(0);
			setState(379);
			match(DOT_COMMA);
			setState(380);
			for_update();
			setState(381);
			match(FINAL_PARENT);
			setState(382);
			match(INIT_BRACE);
			setState(383);
			code_body(0);
			setState(384);
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
		enterRule(_localctx, 58, RULE_for_init);
		try {
			setState(395);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ESTO:
				_localctx = new ForInitVarDeclContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(386);
				match(ESTO);
				setState(387);
				match(ID);
				setState(388);
				match(TWO_POINTS);
				setState(389);
				variable_type();
				setState(390);
				expression(0);
				}
				break;
			case ID:
				_localctx = new ForInitAssignContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(392);
				match(ID);
				setState(393);
				match(EQUAL);
				setState(394);
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
		enterRule(_localctx, 60, RULE_for_update);
		try {
			setState(404);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				_localctx = new ForUpdateIncrementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(397);
				match(ID);
				setState(398);
				match(ABREV_PLUS);
				}
				break;
			case 2:
				_localctx = new ForUpdateDecrementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(399);
				match(ID);
				setState(400);
				match(ABREV_MINUS);
				}
				break;
			case 3:
				_localctx = new ForUpdateAssignContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(401);
				match(ID);
				setState(402);
				match(EQUAL);
				setState(403);
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
		enterRule(_localctx, 62, RULE_variable_section);
		try {
			_localctx = new VariablesSectionContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(406);
			match(VARIABILES);
			setState(407);
			match(GREATER);
			setState(408);
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
		int _startState = 64;
		enterRecursionRule(_localctx, 64, RULE_variabiles_body, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new DeclarationsSingleVariableContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(411);
			declarations();
			}
			_ctx.stop = _input.LT(-1);
			setState(417);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new DeclarationsVariablesListContext(new Variabiles_bodyContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_variabiles_body);
					setState(413);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(414);
					declarations();
					}
					} 
				}
				setState(419);
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
		enterRule(_localctx, 66, RULE_declarations);
		try {
			setState(433);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				_localctx = new VariableInstanceContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(420);
				variable_declaration();
				}
				break;
			case 2:
				_localctx = new VariableRedefinedUssageContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(421);
				variable_ussage();
				}
				break;
			case 3:
				_localctx = new BooleanVariableInstanceContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(422);
				boolean_declaration();
				}
				break;
			case 4:
				_localctx = new NormalArrayInstanceContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(423);
				normal_array();
				}
				break;
			case 5:
				_localctx = new BooleanArrayInstanceContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(424);
				boolean_array();
				}
				break;
			case 6:
				_localctx = new ArrayRedefinedUssageContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(425);
				array_ussage();
				}
				break;
			case 7:
				_localctx = new StructDefinitionContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(426);
				struct_declaration();
				}
				break;
			case 8:
				_localctx = new StructSetPropertyContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(427);
				struct_array_property();
				}
				break;
			case 9:
				_localctx = new StructVariableInstanceContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(428);
				struct_instance();
				}
				break;
			case 10:
				_localctx = new StructRedefinedUsageContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(429);
				struct_ussage();
				}
				break;
			case 11:
				_localctx = new StructVariableSetterContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(430);
				struct_variable_set();
				}
				break;
			case 12:
				_localctx = new StructArrayzSetterContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(431);
				struct_array_set();
				}
				break;
			case 13:
				_localctx = new GlobalAbbreviatedOperationContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(432);
				abbreviated_operation();
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
		enterRule(_localctx, 68, RULE_struct_ussage);
		try {
			_localctx = new StructInstanceUssageContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(435);
			match(ID);
			setState(436);
			match(EQUAL);
			setState(437);
			match(INIT_BRACE);
			setState(438);
			struct_data_list(0);
			setState(439);
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
		enterRule(_localctx, 70, RULE_variable_ussage);
		try {
			_localctx = new NormalVariableUsageContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(441);
			match(ID);
			setState(442);
			match(EQUAL);
			setState(443);
			expression(0);
			setState(444);
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
		enterRule(_localctx, 72, RULE_array_ussage);
		try {
			_localctx = new NormalArrayUsageContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(446);
			match(ID);
			setState(447);
			match(INIT_BRACKET);
			setState(448);
			expression(0);
			setState(449);
			match(FINAL_BRACKET);
			setState(450);
			match(EQUAL);
			setState(451);
			expression(0);
			setState(452);
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
		enterRule(_localctx, 74, RULE_struct_variable_set);
		try {
			_localctx = new SetStructNormalVariableContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(454);
			match(ID);
			setState(455);
			match(DOT);
			setState(456);
			match(ID);
			setState(457);
			match(EQUAL);
			setState(458);
			expression(0);
			setState(459);
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
		enterRule(_localctx, 76, RULE_struct_array_set);
		try {
			_localctx = new SetStructNormalArrayContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(461);
			match(ID);
			setState(462);
			match(DOT);
			setState(463);
			match(ID);
			setState(464);
			match(EQUAL);
			setState(465);
			array_initialization();
			setState(466);
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
		enterRule(_localctx, 78, RULE_struct_array_property);
		try {
			_localctx = new StructArrayPropertyContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(468);
			match(ID);
			setState(469);
			match(DOT);
			setState(470);
			match(ID);
			setState(471);
			match(INIT_BRACKET);
			setState(472);
			expression(0);
			setState(473);
			match(FINAL_BRACKET);
			setState(474);
			match(EQUAL);
			setState(475);
			match(INIT_BRACE);
			setState(476);
			struct_data_list(0);
			setState(477);
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
		enterRule(_localctx, 80, RULE_struct_instance);
		try {
			_localctx = new StructInstanceContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(479);
			match(ESTO);
			setState(480);
			match(ID);
			setState(481);
			match(TWO_POINTS);
			setState(482);
			match(ID);
			setState(483);
			match(INIT_BRACE);
			setState(484);
			struct_data_list(0);
			setState(485);
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
		int _startState = 82;
		enterRecursionRule(_localctx, 82, RULE_struct_data_list, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new StructSingleValueContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(488);
			struct_data_value();
			}
			_ctx.stop = _input.LT(-1);
			setState(495);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new StructValueListContext(new Struct_data_listContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_struct_data_list);
					setState(490);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(491);
					match(COMMA);
					setState(492);
					struct_data_value();
					}
					} 
				}
				setState(497);
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
		enterRule(_localctx, 84, RULE_variable_declaration);
		try {
			_localctx = new VarDeclarationContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(498);
			match(ESTO);
			setState(499);
			match(ID);
			setState(500);
			match(TWO_POINTS);
			setState(501);
			variable_type();
			setState(502);
			expression(0);
			setState(503);
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
		enterRule(_localctx, 86, RULE_boolean_declaration);
		try {
			_localctx = new BoolDeclarationContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(505);
			match(ESTO);
			setState(506);
			match(ID);
			setState(507);
			match(TWO_POINTS);
			setState(508);
			boolean_values();
			setState(509);
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
		enterRule(_localctx, 88, RULE_normal_array);
		try {
			setState(522);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				_localctx = new NormalArrayDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(511);
				match(SERIES);
				setState(512);
				match(ID);
				setState(513);
				match(INIT_PARENT);
				setState(514);
				match(INT);
				setState(515);
				match(FINAL_PARENT);
				setState(516);
				match(TWO_POINTS);
				setState(517);
				variable_type();
				setState(518);
				array_initialization();
				setState(519);
				match(DOT_COMMA);
				}
				break;
			case 2:
				_localctx = new BooleanArrayDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(521);
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
		enterRule(_localctx, 90, RULE_boolean_array);
		try {
			_localctx = new BooleanArrayBaseContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(524);
			match(SERIES);
			setState(525);
			match(ID);
			setState(526);
			match(INIT_PARENT);
			setState(527);
			match(INT);
			setState(528);
			match(FINAL_PARENT);
			setState(529);
			match(TWO_POINTS);
			setState(530);
			array_initialization();
			setState(531);
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
		enterRule(_localctx, 92, RULE_array_initialization);
		try {
			setState(538);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INIT_BRACE:
				_localctx = new ArrayInitWithValuesContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(533);
				match(INIT_BRACE);
				setState(534);
				values_array_list(0);
				setState(535);
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
		int _startState = 94;
		enterRecursionRule(_localctx, 94, RULE_values_array_list, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new ArraySingleValueContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(541);
			array_value();
			}
			_ctx.stop = _input.LT(-1);
			setState(548);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ArrayValueListContext(new Values_array_listContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_values_array_list);
					setState(543);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(544);
					match(COMMA);
					setState(545);
					array_value();
					}
					} 
				}
				setState(550);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
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
		enterRule(_localctx, 96, RULE_array_value);
		try {
			setState(553);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				_localctx = new ArrayStructValContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(551);
				struct_values(0);
				}
				break;
			case 2:
				_localctx = new ArrayNormalValContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(552);
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
		int _startState = 98;
		enterRecursionRule(_localctx, 98, RULE_struct_values, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(566);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				{
				_localctx = new StructBasePropertyContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(556);
				match(ID);
				setState(557);
				match(DOT);
				setState(558);
				match(ID);
				}
				break;
			case 2:
				{
				_localctx = new StructBaseArrayPropertyContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(559);
				match(ID);
				setState(560);
				match(INIT_BRACKET);
				setState(561);
				expression(0);
				setState(562);
				match(FINAL_BRACKET);
				setState(563);
				match(DOT);
				setState(564);
				match(ID);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(578);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(576);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
					case 1:
						{
						_localctx = new StructPropertyChainContext(new Struct_valuesContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_struct_values);
						setState(568);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(569);
						match(DOT);
						setState(570);
						match(ID);
						}
						break;
					case 2:
						{
						_localctx = new StructArrayAccessChainContext(new Struct_valuesContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_struct_values);
						setState(571);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(572);
						match(INIT_BRACKET);
						setState(573);
						expression(0);
						setState(574);
						match(FINAL_BRACKET);
						}
						break;
					}
					} 
				}
				setState(580);
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
		enterRule(_localctx, 100, RULE_struct_declaration);
		try {
			_localctx = new StructDeclarationContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(581);
			match(STRUCTURE);
			setState(582);
			match(ID);
			setState(583);
			match(INIT_BRACE);
			setState(584);
			struct_body();
			setState(585);
			match(FINAL_BRACE);
			setState(586);
			match(FINIS);
			setState(587);
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
		enterRule(_localctx, 102, RULE_struct_body);
		try {
			setState(591);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				_localctx = new StructSeparatedBodyContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(589);
				struct_normal_body(0);
				}
				break;
			case 2:
				_localctx = new StructCommaBodyContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(590);
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
		int _startState = 104;
		enterRecursionRule(_localctx, 104, RULE_struct_normal_body, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new StructNormalBodySingleContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(594);
			struct_attribute();
			setState(595);
			match(DOT_COMMA);
			}
			_ctx.stop = _input.LT(-1);
			setState(603);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new StructNormalBodyListContext(new Struct_normal_bodyContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_struct_normal_body);
					setState(597);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(598);
					struct_attribute();
					setState(599);
					match(DOT_COMMA);
					}
					} 
				}
				setState(605);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
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
		int _startState = 106;
		enterRecursionRule(_localctx, 106, RULE_struct_comma_body, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new StructCommaBodySingleContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(607);
			struct_attribute();
			}
			_ctx.stop = _input.LT(-1);
			setState(614);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new StructCommaBodyListContext(new Struct_comma_bodyContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_struct_comma_body);
					setState(609);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(610);
					match(COMMA);
					setState(611);
					struct_attribute();
					}
					} 
				}
				setState(616);
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
		enterRule(_localctx, 108, RULE_struct_attribute);
		try {
			setState(620);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				_localctx = new NormalVariableStructContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(617);
				variable_without_value();
				}
				break;
			case 2:
				_localctx = new BooleanVariableStructContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(618);
				boolean_variable_without_value();
				}
				break;
			case 3:
				_localctx = new ArrayVariableStructContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(619);
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
		enterRule(_localctx, 110, RULE_variable_without_value);
		try {
			_localctx = new InternalStructNormalVariableContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(622);
			match(ESTO);
			setState(623);
			match(ID);
			setState(624);
			match(TWO_POINTS);
			setState(625);
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
		enterRule(_localctx, 112, RULE_boolean_variable_without_value);
		try {
			_localctx = new InternalStructBoolVariableContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(627);
			match(ESTO);
			setState(628);
			match(ID);
			setState(629);
			match(TWO_POINTS);
			setState(630);
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
		enterRule(_localctx, 114, RULE_array_variable_struct);
		try {
			_localctx = new InternalStructArrayContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(632);
			match(SERIES);
			setState(633);
			match(ID);
			setState(634);
			match(TWO_POINTS);
			setState(635);
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
		enterRule(_localctx, 116, RULE_struct_data_value);
		try {
			_localctx = new StructDeclarationValueContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(637);
			match(ID);
			setState(638);
			match(TWO_POINTS);
			setState(639);
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
		int _startState = 118;
		enterRecursionRule(_localctx, 118, RULE_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(651);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INIT_PARENT:
				{
				_localctx = new ExpressionParentsContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(642);
				match(INIT_PARENT);
				setState(643);
				expression(0);
				setState(644);
				match(FINAL_PARENT);
				}
				break;
			case NOT:
				{
				_localctx = new ExpressionNotContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(646);
				match(NOT);
				setState(647);
				expression(15);
				}
				break;
			case MINUS:
				{
				_localctx = new ExpressionNegateContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(648);
				match(MINUS);
				setState(649);
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
				setState(650);
				normal_values();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(691);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(689);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionMultContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(653);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(654);
						match(MULTIPLICATION);
						setState(655);
						expression(14);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionDivContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(656);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(657);
						match(DIVIDE);
						setState(658);
						expression(13);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionPlusContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(659);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(660);
						match(PLUS);
						setState(661);
						expression(12);
						}
						break;
					case 4:
						{
						_localctx = new ExpressionMinusContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(662);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(663);
						match(MINUS);
						setState(664);
						expression(11);
						}
						break;
					case 5:
						{
						_localctx = new ExpressionLessThanContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(665);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(666);
						match(LESS);
						setState(667);
						expression(10);
						}
						break;
					case 6:
						{
						_localctx = new ExpressionGreaterThanContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(668);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(669);
						match(GREATER);
						setState(670);
						expression(9);
						}
						break;
					case 7:
						{
						_localctx = new ExpressionLessEqualContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(671);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(672);
						match(LESS_EQUALS);
						setState(673);
						expression(8);
						}
						break;
					case 8:
						{
						_localctx = new ExpressionGreaterEqualContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(674);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(675);
						match(GREATER_EQUALS);
						setState(676);
						expression(7);
						}
						break;
					case 9:
						{
						_localctx = new ExpressionEqualsContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(677);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(678);
						match(EQUALS);
						setState(679);
						expression(6);
						}
						break;
					case 10:
						{
						_localctx = new ExpressionNotEqualsContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(680);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(681);
						match(DIFERENCE);
						setState(682);
						expression(5);
						}
						break;
					case 11:
						{
						_localctx = new ExpressionAndContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(683);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(684);
						match(AND);
						setState(685);
						expression(4);
						}
						break;
					case 12:
						{
						_localctx = new ExpressionOrContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(686);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(687);
						match(OR);
						setState(688);
						expression(3);
						}
						break;
					}
					} 
				}
				setState(693);
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
		enterRule(_localctx, 120, RULE_variable_type);
		try {
			setState(699);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TEXTUM:
				_localctx = new TypeTextContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(694);
				match(TEXTUM);
				}
				break;
			case NUMERUS:
				_localctx = new TypeIntContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(695);
				match(NUMERUS);
				}
				break;
			case DECIMALIS:
				_localctx = new TypeDecimalContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(696);
				match(DECIMALIS);
				}
				break;
			case LITTERA:
				_localctx = new TypeCharContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(697);
				match(LITTERA);
				}
				break;
			case ID:
				_localctx = new TypeCustomIdContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(698);
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
		enterRule(_localctx, 122, RULE_array_call);
		try {
			_localctx = new ArrayCallContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(701);
			match(ID);
			setState(702);
			match(INIT_BRACKET);
			setState(703);
			expression(0);
			setState(704);
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
		enterRule(_localctx, 124, RULE_function_call);
		try {
			_localctx = new FunctionCallingContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(706);
			match(ID);
			setState(707);
			match(INIT_PARENT);
			setState(708);
			arguments_list(0);
			setState(709);
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
		int _startState = 126;
		enterRecursionRule(_localctx, 126, RULE_arguments_list, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(714);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				{
				_localctx = new ArgumentSingleFunctionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(712);
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
			setState(721);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ArgumentFunctionListContext(new Arguments_listContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_arguments_list);
					setState(716);
					if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
					setState(717);
					match(COMMA);
					setState(718);
					expression(0);
					}
					} 
				}
				setState(723);
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
		enterRule(_localctx, 128, RULE_normal_values);
		try {
			setState(733);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				_localctx = new ValStringContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(724);
				match(STRING);
				}
				break;
			case 2:
				_localctx = new ValCharContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(725);
				match(CHAR);
				}
				break;
			case 3:
				_localctx = new ValIdContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(726);
				match(ID);
				}
				break;
			case 4:
				_localctx = new ValDecimalContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(727);
				match(DECIMAL);
				}
				break;
			case 5:
				_localctx = new ValIntContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(728);
				match(INT);
				}
				break;
			case 6:
				_localctx = new ValBoolContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(729);
				boolean_values();
				}
				break;
			case 7:
				_localctx = new ValIdCallContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(730);
				array_call();
				}
				break;
			case 8:
				_localctx = new ValFunctionCallContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(731);
				function_call();
				}
				break;
			case 9:
				_localctx = new ValStructValueContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(732);
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
		enterRule(_localctx, 130, RULE_boolean_values);
		try {
			setState(737);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VERUM:
				_localctx = new BoolTrueContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(735);
				match(VERUM);
				}
				break;
			case FALSUS:
				_localctx = new BoolFalseContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(736);
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
		public TerminalNode ID() { return getToken(CodexLatinusParser.ID, 0); }
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
		public TerminalNode ID() { return getToken(CodexLatinusParser.ID, 0); }
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
		enterRule(_localctx, 132, RULE_abbreviated_operation);
		try {
			setState(745);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
			case 1:
				_localctx = new IncOperationContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(739);
				match(ID);
				setState(740);
				match(ABREV_PLUS);
				setState(741);
				match(DOT_COMMA);
				}
				break;
			case 2:
				_localctx = new DecOperationContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(742);
				match(ID);
				setState(743);
				match(ABREV_MINUS);
				setState(744);
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
			return maior_body_sempred((Maior_bodyContext)_localctx, predIndex);
		case 9:
			return local_variable_list_sempred((Local_variable_listContext)_localctx, predIndex);
		case 11:
			return function_arguments_sempred((Function_argumentsContext)_localctx, predIndex);
		case 15:
			return code_body_sempred((Code_bodyContext)_localctx, predIndex);
		case 20:
			return print_function_sempred((Print_functionContext)_localctx, predIndex);
		case 23:
			return else_if_list_sempred((Else_if_listContext)_localctx, predIndex);
		case 32:
			return variabiles_body_sempred((Variabiles_bodyContext)_localctx, predIndex);
		case 41:
			return struct_data_list_sempred((Struct_data_listContext)_localctx, predIndex);
		case 47:
			return values_array_list_sempred((Values_array_listContext)_localctx, predIndex);
		case 49:
			return struct_values_sempred((Struct_valuesContext)_localctx, predIndex);
		case 52:
			return struct_normal_body_sempred((Struct_normal_bodyContext)_localctx, predIndex);
		case 53:
			return struct_comma_body_sempred((Struct_comma_bodyContext)_localctx, predIndex);
		case 59:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		case 63:
			return arguments_list_sempred((Arguments_listContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean maior_body_sempred(Maior_bodyContext _localctx, int predIndex) {
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
		"\u0004\u0001=\u02ec\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
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
		"A\u0007A\u0002B\u0007B\u0001\u0000\u0005\u0000\u0088\b\u0000\n\u0000\f"+
		"\u0000\u008b\t\u0000\u0001\u0001\u0001\u0001\u0003\u0001\u008f\b\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0005\u0003\u009e\b\u0003\n\u0003\f\u0003\u00a1\t\u0003\u0001"+
		"\u0004\u0001\u0004\u0003\u0004\u00a5\b\u0004\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0003\u0007\u00bd\b\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0003\b\u00c7\b"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0005\t\u00d3\b\t\n\t\f\t\u00d6\t\t\u0001\n\u0001\n\u0001\n"+
		"\u0001\n\u0001\n\u0003\n\u00dd\b\n\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0003\u000b\u00e2\b\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0005\u000b"+
		"\u00e7\b\u000b\n\u000b\f\u000b\u00ea\t\u000b\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0003\r\u00f7"+
		"\b\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0005\u000f\u0102\b\u000f\n"+
		"\u000f\f\u000f\u0105\t\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u0115"+
		"\b\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0003\u0011\u011d\b\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0003\u0012\u0123\b\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0003\u0013\u012c\b\u0013\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0005"+
		"\u0014\u0134\b\u0014\n\u0014\f\u0014\u0137\t\u0014\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0003\u0015\u013d\b\u0015\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017"+
		"\u0001\u0017\u0005\u0017\u014e\b\u0017\n\u0017\f\u0017\u0151\t\u0017\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0003\u0019\u0161\b\u0019\u0001\u001a\u0001\u001a\u0001"+
		"\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001"+
		"\u001a\u0001\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001"+
		"\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001"+
		"\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001"+
		"\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001"+
		"\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001"+
		"\u001d\u0001\u001d\u0001\u001d\u0003\u001d\u018c\b\u001d\u0001\u001e\u0001"+
		"\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0003"+
		"\u001e\u0195\b\u001e\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001"+
		" \u0001 \u0001 \u0001 \u0001 \u0005 \u01a0\b \n \f \u01a3\t \u0001!\u0001"+
		"!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001"+
		"!\u0001!\u0003!\u01b2\b!\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001"+
		"\"\u0001#\u0001#\u0001#\u0001#\u0001#\u0001$\u0001$\u0001$\u0001$\u0001"+
		"$\u0001$\u0001$\u0001$\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001"+
		"%\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001\'\u0001\'\u0001"+
		"\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001"+
		"(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001)\u0001)\u0001"+
		")\u0001)\u0001)\u0001)\u0005)\u01ee\b)\n)\f)\u01f1\t)\u0001*\u0001*\u0001"+
		"*\u0001*\u0001*\u0001*\u0001*\u0001+\u0001+\u0001+\u0001+\u0001+\u0001"+
		"+\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0001"+
		",\u0001,\u0003,\u020b\b,\u0001-\u0001-\u0001-\u0001-\u0001-\u0001-\u0001"+
		"-\u0001-\u0001-\u0001.\u0001.\u0001.\u0001.\u0001.\u0003.\u021b\b.\u0001"+
		"/\u0001/\u0001/\u0001/\u0001/\u0001/\u0005/\u0223\b/\n/\f/\u0226\t/\u0001"+
		"0\u00010\u00030\u022a\b0\u00011\u00011\u00011\u00011\u00011\u00011\u0001"+
		"1\u00011\u00011\u00011\u00011\u00031\u0237\b1\u00011\u00011\u00011\u0001"+
		"1\u00011\u00011\u00011\u00011\u00051\u0241\b1\n1\f1\u0244\t1\u00012\u0001"+
		"2\u00012\u00012\u00012\u00012\u00012\u00012\u00013\u00013\u00033\u0250"+
		"\b3\u00014\u00014\u00014\u00014\u00014\u00014\u00014\u00014\u00054\u025a"+
		"\b4\n4\f4\u025d\t4\u00015\u00015\u00015\u00015\u00015\u00015\u00055\u0265"+
		"\b5\n5\f5\u0268\t5\u00016\u00016\u00016\u00036\u026d\b6\u00017\u00017"+
		"\u00017\u00017\u00017\u00018\u00018\u00018\u00018\u00018\u00019\u0001"+
		"9\u00019\u00019\u00019\u0001:\u0001:\u0001:\u0001:\u0001;\u0001;\u0001"+
		";\u0001;\u0001;\u0001;\u0001;\u0001;\u0001;\u0001;\u0003;\u028c\b;\u0001"+
		";\u0001;\u0001;\u0001;\u0001;\u0001;\u0001;\u0001;\u0001;\u0001;\u0001"+
		";\u0001;\u0001;\u0001;\u0001;\u0001;\u0001;\u0001;\u0001;\u0001;\u0001"+
		";\u0001;\u0001;\u0001;\u0001;\u0001;\u0001;\u0001;\u0001;\u0001;\u0001"+
		";\u0001;\u0001;\u0001;\u0001;\u0001;\u0005;\u02b2\b;\n;\f;\u02b5\t;\u0001"+
		"<\u0001<\u0001<\u0001<\u0001<\u0003<\u02bc\b<\u0001=\u0001=\u0001=\u0001"+
		"=\u0001=\u0001>\u0001>\u0001>\u0001>\u0001>\u0001?\u0001?\u0001?\u0003"+
		"?\u02cb\b?\u0001?\u0001?\u0001?\u0005?\u02d0\b?\n?\f?\u02d3\t?\u0001@"+
		"\u0001@\u0001@\u0001@\u0001@\u0001@\u0001@\u0001@\u0001@\u0003@\u02de"+
		"\b@\u0001A\u0001A\u0003A\u02e2\bA\u0001B\u0001B\u0001B\u0001B\u0001B\u0001"+
		"B\u0003B\u02ea\bB\u0001B\u0000\u000e\u0006\u0012\u0016\u001e(.@R^bhjv"+
		"~C\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a"+
		"\u001c\u001e \"$&(*,.02468:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082"+
		"\u0084\u0000\u0000\u0308\u0000\u0089\u0001\u0000\u0000\u0000\u0002\u008c"+
		"\u0001\u0000\u0000\u0000\u0004\u0094\u0001\u0000\u0000\u0000\u0006\u0098"+
		"\u0001\u0000\u0000\u0000\b\u00a4\u0001\u0000\u0000\u0000\n\u00a6\u0001"+
		"\u0000\u0000\u0000\f\u00b0\u0001\u0000\u0000\u0000\u000e\u00b9\u0001\u0000"+
		"\u0000\u0000\u0010\u00c3\u0001\u0000\u0000\u0000\u0012\u00cd\u0001\u0000"+
		"\u0000\u0000\u0014\u00dc\u0001\u0000\u0000\u0000\u0016\u00e1\u0001\u0000"+
		"\u0000\u0000\u0018\u00eb\u0001\u0000\u0000\u0000\u001a\u00f6\u0001\u0000"+
		"\u0000\u0000\u001c\u00f8\u0001\u0000\u0000\u0000\u001e\u00fc\u0001\u0000"+
		"\u0000\u0000 \u0114\u0001\u0000\u0000\u0000\"\u011c\u0001\u0000\u0000"+
		"\u0000$\u0122\u0001\u0000\u0000\u0000&\u012b\u0001\u0000\u0000\u0000("+
		"\u012d\u0001\u0000\u0000\u0000*\u013c\u0001\u0000\u0000\u0000,\u013e\u0001"+
		"\u0000\u0000\u0000.\u014a\u0001\u0000\u0000\u00000\u0152\u0001\u0000\u0000"+
		"\u00002\u0160\u0001\u0000\u0000\u00004\u0162\u0001\u0000\u0000\u00006"+
		"\u016c\u0001\u0000\u0000\u00008\u0176\u0001\u0000\u0000\u0000:\u018b\u0001"+
		"\u0000\u0000\u0000<\u0194\u0001\u0000\u0000\u0000>\u0196\u0001\u0000\u0000"+
		"\u0000@\u019a\u0001\u0000\u0000\u0000B\u01b1\u0001\u0000\u0000\u0000D"+
		"\u01b3\u0001\u0000\u0000\u0000F\u01b9\u0001\u0000\u0000\u0000H\u01be\u0001"+
		"\u0000\u0000\u0000J\u01c6\u0001\u0000\u0000\u0000L\u01cd\u0001\u0000\u0000"+
		"\u0000N\u01d4\u0001\u0000\u0000\u0000P\u01df\u0001\u0000\u0000\u0000R"+
		"\u01e7\u0001\u0000\u0000\u0000T\u01f2\u0001\u0000\u0000\u0000V\u01f9\u0001"+
		"\u0000\u0000\u0000X\u020a\u0001\u0000\u0000\u0000Z\u020c\u0001\u0000\u0000"+
		"\u0000\\\u021a\u0001\u0000\u0000\u0000^\u021c\u0001\u0000\u0000\u0000"+
		"`\u0229\u0001\u0000\u0000\u0000b\u0236\u0001\u0000\u0000\u0000d\u0245"+
		"\u0001\u0000\u0000\u0000f\u024f\u0001\u0000\u0000\u0000h\u0251\u0001\u0000"+
		"\u0000\u0000j\u025e\u0001\u0000\u0000\u0000l\u026c\u0001\u0000\u0000\u0000"+
		"n\u026e\u0001\u0000\u0000\u0000p\u0273\u0001\u0000\u0000\u0000r\u0278"+
		"\u0001\u0000\u0000\u0000t\u027d\u0001\u0000\u0000\u0000v\u028b\u0001\u0000"+
		"\u0000\u0000x\u02bb\u0001\u0000\u0000\u0000z\u02bd\u0001\u0000\u0000\u0000"+
		"|\u02c2\u0001\u0000\u0000\u0000~\u02ca\u0001\u0000\u0000\u0000\u0080\u02dd"+
		"\u0001\u0000\u0000\u0000\u0082\u02e1\u0001\u0000\u0000\u0000\u0084\u02e9"+
		"\u0001\u0000\u0000\u0000\u0086\u0088\u0003\u0002\u0001\u0000\u0087\u0086"+
		"\u0001\u0000\u0000\u0000\u0088\u008b\u0001\u0000\u0000\u0000\u0089\u0087"+
		"\u0001\u0000\u0000\u0000\u0089\u008a\u0001\u0000\u0000\u0000\u008a\u0001"+
		"\u0001\u0000\u0000\u0000\u008b\u0089\u0001\u0000\u0000\u0000\u008c\u008e"+
		"\u0003>\u001f\u0000\u008d\u008f\u0003\u001c\u000e\u0000\u008e\u008d\u0001"+
		"\u0000\u0000\u0000\u008e\u008f\u0001\u0000\u0000\u0000\u008f\u0090\u0001"+
		"\u0000\u0000\u0000\u0090\u0091\u0003\u0004\u0002\u0000\u0091\u0092\u0005"+
		"\u0007\u0000\u0000\u0092\u0093\u0005 \u0000\u0000\u0093\u0003\u0001\u0000"+
		"\u0000\u0000\u0094\u0095\u0005\u0006\u0000\u0000\u0095\u0096\u00054\u0000"+
		"\u0000\u0096\u0097\u0003\u0006\u0003\u0000\u0097\u0005\u0001\u0000\u0000"+
		"\u0000\u0098\u0099\u0006\u0003\uffff\uffff\u0000\u0099\u009a\u0003\b\u0004"+
		"\u0000\u009a\u009f\u0001\u0000\u0000\u0000\u009b\u009c\n\u0002\u0000\u0000"+
		"\u009c\u009e\u0003\b\u0004\u0000\u009d\u009b\u0001\u0000\u0000\u0000\u009e"+
		"\u00a1\u0001\u0000\u0000\u0000\u009f\u009d\u0001\u0000\u0000\u0000\u009f"+
		"\u00a0\u0001\u0000\u0000\u0000\u00a0\u0007\u0001\u0000\u0000\u0000\u00a1"+
		"\u009f\u0001\u0000\u0000\u0000\u00a2\u00a5\u0003\n\u0005\u0000\u00a3\u00a5"+
		"\u0003\f\u0006\u0000\u00a4\u00a2\u0001\u0000\u0000\u0000\u00a4\u00a3\u0001"+
		"\u0000\u0000\u0000\u00a5\t\u0001\u0000\u0000\u0000\u00a6\u00a7\u0005\u001a"+
		"\u0000\u0000\u00a7\u00a8\u0003x<\u0000\u00a8\u00a9\u00058\u0000\u0000"+
		"\u00a9\u00aa\u0005\'\u0000\u0000\u00aa\u00ab\u0003\u0016\u000b\u0000\u00ab"+
		"\u00ac\u0005(\u0000\u0000\u00ac\u00ad\u0003\u000e\u0007\u0000\u00ad\u00ae"+
		"\u0005\u0013\u0000\u0000\u00ae\u00af\u0005 \u0000\u0000\u00af\u000b\u0001"+
		"\u0000\u0000\u0000\u00b0\u00b1\u0005\u0019\u0000\u0000\u00b1\u00b2\u0005"+
		"8\u0000\u0000\u00b2\u00b3\u0005\'\u0000\u0000\u00b3\u00b4\u0003\u0016"+
		"\u000b\u0000\u00b4\u00b5\u0005(\u0000\u0000\u00b5\u00b6\u0003\u0010\b"+
		"\u0000\u00b6\u00b7\u0005\u0013\u0000\u0000\u00b7\u00b8\u0005 \u0000\u0000"+
		"\u00b8\r\u0001\u0000\u0000\u0000\u00b9\u00ba\u0005\u0004\u0000\u0000\u00ba"+
		"\u00bc\u0005%\u0000\u0000\u00bb\u00bd\u0003\u0012\t\u0000\u00bc\u00bb"+
		"\u0001\u0000\u0000\u0000\u00bc\u00bd\u0001\u0000\u0000\u0000\u00bd\u00be"+
		"\u0001\u0000\u0000\u0000\u00be\u00bf\u0005&\u0000\u0000\u00bf\u00c0\u0005"+
		"#\u0000\u0000\u00c0\u00c1\u0003\u001e\u000f\u0000\u00c1\u00c2\u0005$\u0000"+
		"\u0000\u00c2\u000f\u0001\u0000\u0000\u0000\u00c3\u00c4\u0005\u0004\u0000"+
		"\u0000\u00c4\u00c6\u0005%\u0000\u0000\u00c5\u00c7\u0003\u0012\t\u0000"+
		"\u00c6\u00c5\u0001\u0000\u0000\u0000\u00c6\u00c7\u0001\u0000\u0000\u0000"+
		"\u00c7\u00c8\u0001\u0000\u0000\u0000\u00c8\u00c9\u0005&\u0000\u0000\u00c9"+
		"\u00ca\u0005#\u0000\u0000\u00ca\u00cb\u0003\u001e\u000f\u0000\u00cb\u00cc"+
		"\u0005$\u0000\u0000\u00cc\u0011\u0001\u0000\u0000\u0000\u00cd\u00ce\u0006"+
		"\t\uffff\uffff\u0000\u00ce\u00cf\u0003\u0014\n\u0000\u00cf\u00d4\u0001"+
		"\u0000\u0000\u0000\u00d0\u00d1\n\u0002\u0000\u0000\u00d1\u00d3\u0003\u0014"+
		"\n\u0000\u00d2\u00d0\u0001\u0000\u0000\u0000\u00d3\u00d6\u0001\u0000\u0000"+
		"\u0000\u00d4\u00d2\u0001\u0000\u0000\u0000\u00d4\u00d5\u0001\u0000\u0000"+
		"\u0000\u00d5\u0013\u0001\u0000\u0000\u0000\u00d6\u00d4\u0001\u0000\u0000"+
		"\u0000\u00d7\u00dd\u0003T*\u0000\u00d8\u00dd\u0003V+\u0000\u00d9\u00dd"+
		"\u0003X,\u0000\u00da\u00dd\u0003Z-\u0000\u00db\u00dd\u0003P(\u0000\u00dc"+
		"\u00d7\u0001\u0000\u0000\u0000\u00dc\u00d8\u0001\u0000\u0000\u0000\u00dc"+
		"\u00d9\u0001\u0000\u0000\u0000\u00dc\u00da\u0001\u0000\u0000\u0000\u00dc"+
		"\u00db\u0001\u0000\u0000\u0000\u00dd\u0015\u0001\u0000\u0000\u0000\u00de"+
		"\u00df\u0006\u000b\uffff\uffff\u0000\u00df\u00e2\u0003\u0018\f\u0000\u00e0"+
		"\u00e2\u0001\u0000\u0000\u0000\u00e1\u00de\u0001\u0000\u0000\u0000\u00e1"+
		"\u00e0\u0001\u0000\u0000\u0000\u00e2\u00e8\u0001\u0000\u0000\u0000\u00e3"+
		"\u00e4\n\u0003\u0000\u0000\u00e4\u00e5\u0005\u001f\u0000\u0000\u00e5\u00e7"+
		"\u0003\u0018\f\u0000\u00e6\u00e3\u0001\u0000\u0000\u0000\u00e7\u00ea\u0001"+
		"\u0000\u0000\u0000\u00e8\u00e6\u0001\u0000\u0000\u0000\u00e8\u00e9\u0001"+
		"\u0000\u0000\u0000\u00e9\u0017\u0001\u0000\u0000\u0000\u00ea\u00e8\u0001"+
		"\u0000\u0000\u0000\u00eb\u00ec\u0005\u0010\u0000\u0000\u00ec\u00ed\u0005"+
		"8\u0000\u0000\u00ed\u00ee\u0005!\u0000\u0000\u00ee\u00ef\u0003x<\u0000"+
		"\u00ef\u00f0\u0003\u001a\r\u0000\u00f0\u0019\u0001\u0000\u0000\u0000\u00f1"+
		"\u00f7\u0003v;\u0000\u00f2\u00f3\u0005\u001e\u0000\u0000\u00f3\u00f4\u0003"+
		"|>\u0000\u00f4\u00f5\u0005 \u0000\u0000\u00f5\u00f7\u0001\u0000\u0000"+
		"\u0000\u00f6\u00f1\u0001\u0000\u0000\u0000\u00f6\u00f2\u0001\u0000\u0000"+
		"\u0000\u00f7\u001b\u0001\u0000\u0000\u0000\u00f8\u00f9\u0005\u0005\u0000"+
		"\u0000\u00f9\u00fa\u00054\u0000\u0000\u00fa\u00fb\u0003\u001e\u000f\u0000"+
		"\u00fb\u001d\u0001\u0000\u0000\u0000\u00fc\u00fd\u0006\u000f\uffff\uffff"+
		"\u0000\u00fd\u00fe\u0003 \u0010\u0000\u00fe\u0103\u0001\u0000\u0000\u0000"+
		"\u00ff\u0100\n\u0002\u0000\u0000\u0100\u0102\u0003 \u0010\u0000\u0101"+
		"\u00ff\u0001\u0000\u0000\u0000\u0102\u0105\u0001\u0000\u0000\u0000\u0103"+
		"\u0101\u0001\u0000\u0000\u0000\u0103\u0104\u0001\u0000\u0000\u0000\u0104"+
		"\u001f\u0001\u0000\u0000\u0000\u0105\u0103\u0001\u0000\u0000\u0000\u0106"+
		"\u0115\u0003*\u0015\u0000\u0107\u0115\u0003&\u0013\u0000\u0108\u0109\u0003"+
		"|>\u0000\u0109\u010a\u0005 \u0000\u0000\u010a\u0115\u0001\u0000\u0000"+
		"\u0000\u010b\u0115\u0003$\u0012\u0000\u010c\u0115\u0003\"\u0011\u0000"+
		"\u010d\u0115\u0003\u0084B\u0000\u010e\u0115\u0003F#\u0000\u010f\u0115"+
		"\u0003H$\u0000\u0110\u0115\u0003N\'\u0000\u0111\u0115\u0003D\"\u0000\u0112"+
		"\u0115\u0003L&\u0000\u0113\u0115\u0003J%\u0000\u0114\u0106\u0001\u0000"+
		"\u0000\u0000\u0114\u0107\u0001\u0000\u0000\u0000\u0114\u0108\u0001\u0000"+
		"\u0000\u0000\u0114\u010b\u0001\u0000\u0000\u0000\u0114\u010c\u0001\u0000"+
		"\u0000\u0000\u0114\u010d\u0001\u0000\u0000\u0000\u0114\u010e\u0001\u0000"+
		"\u0000\u0000\u0114\u010f\u0001\u0000\u0000\u0000\u0114\u0110\u0001\u0000"+
		"\u0000\u0000\u0114\u0111\u0001\u0000\u0000\u0000\u0114\u0112\u0001\u0000"+
		"\u0000\u0000\u0114\u0113\u0001\u0000\u0000\u0000\u0115!\u0001\u0000\u0000"+
		"\u0000\u0116\u0117\u0005\u001b\u0000\u0000\u0117\u0118\u0003v;\u0000\u0118"+
		"\u0119\u0005 \u0000\u0000\u0119\u011d\u0001\u0000\u0000\u0000\u011a\u011b"+
		"\u0005\u001b\u0000\u0000\u011b\u011d\u0005 \u0000\u0000\u011c\u0116\u0001"+
		"\u0000\u0000\u0000\u011c\u011a\u0001\u0000\u0000\u0000\u011d#\u0001\u0000"+
		"\u0000\u0000\u011e\u011f\u0005\u001c\u0000\u0000\u011f\u0123\u0005 \u0000"+
		"\u0000\u0120\u0121\u0005\u001d\u0000\u0000\u0121\u0123\u0005 \u0000\u0000"+
		"\u0122\u011e\u0001\u0000\u0000\u0000\u0122\u0120\u0001\u0000\u0000\u0000"+
		"\u0123%\u0001\u0000\u0000\u0000\u0124\u0125\u00058\u0000\u0000\u0125\u012c"+
		"\u0005\t\u0000\u0000\u0126\u012c\u0005\t\u0000\u0000\u0127\u0128\u0005"+
		"\b\u0000\u0000\u0128\u0129\u0003(\u0014\u0000\u0129\u012a\u0005 \u0000"+
		"\u0000\u012a\u012c\u0001\u0000\u0000\u0000\u012b\u0124\u0001\u0000\u0000"+
		"\u0000\u012b\u0126\u0001\u0000\u0000\u0000\u012b\u0127\u0001\u0000\u0000"+
		"\u0000\u012c\'\u0001\u0000\u0000\u0000\u012d\u012e\u0006\u0014\uffff\uffff"+
		"\u0000\u012e\u012f\u0003v;\u0000\u012f\u0135\u0001\u0000\u0000\u0000\u0130"+
		"\u0131\n\u0002\u0000\u0000\u0131\u0132\u0005\b\u0000\u0000\u0132\u0134"+
		"\u0003v;\u0000\u0133\u0130\u0001\u0000\u0000\u0000\u0134\u0137\u0001\u0000"+
		"\u0000\u0000\u0135\u0133\u0001\u0000\u0000\u0000\u0135\u0136\u0001\u0000"+
		"\u0000\u0000\u0136)\u0001\u0000\u0000\u0000\u0137\u0135\u0001\u0000\u0000"+
		"\u0000\u0138\u013d\u0003,\u0016\u0000\u0139\u013d\u00034\u001a\u0000\u013a"+
		"\u013d\u00036\u001b\u0000\u013b\u013d\u00038\u001c\u0000\u013c\u0138\u0001"+
		"\u0000\u0000\u0000\u013c\u0139\u0001\u0000\u0000\u0000\u013c\u013a\u0001"+
		"\u0000\u0000\u0000\u013c\u013b\u0001\u0000\u0000\u0000\u013d+\u0001\u0000"+
		"\u0000\u0000\u013e\u013f\u0005\u0017\u0000\u0000\u013f\u0140\u0005\'\u0000"+
		"\u0000\u0140\u0141\u0003v;\u0000\u0141\u0142\u0005(\u0000\u0000\u0142"+
		"\u0143\u0005#\u0000\u0000\u0143\u0144\u0003\u001e\u000f\u0000\u0144\u0145"+
		"\u0005$\u0000\u0000\u0145\u0146\u0003.\u0017\u0000\u0146\u0147\u00032"+
		"\u0019\u0000\u0147\u0148\u0005\u0013\u0000\u0000\u0148\u0149\u0005 \u0000"+
		"\u0000\u0149-\u0001\u0000\u0000\u0000\u014a\u014f\u0006\u0017\uffff\uffff"+
		"\u0000\u014b\u014c\n\u0002\u0000\u0000\u014c\u014e\u00030\u0018\u0000"+
		"\u014d\u014b\u0001\u0000\u0000\u0000\u014e\u0151\u0001\u0000\u0000\u0000"+
		"\u014f\u014d\u0001\u0000\u0000\u0000\u014f\u0150\u0001\u0000\u0000\u0000"+
		"\u0150/\u0001\u0000\u0000\u0000\u0151\u014f\u0001\u0000\u0000\u0000\u0152"+
		"\u0153\u0005\u0018\u0000\u0000\u0153\u0154\u0005\'\u0000\u0000\u0154\u0155"+
		"\u0003v;\u0000\u0155\u0156\u0005(\u0000\u0000\u0156\u0157\u0005#\u0000"+
		"\u0000\u0157\u0158\u0003\u001e\u000f\u0000\u0158\u0159\u0005$\u0000\u0000"+
		"\u01591\u0001\u0000\u0000\u0000\u015a\u015b\u0005\u0018\u0000\u0000\u015b"+
		"\u015c\u0005#\u0000\u0000\u015c\u015d\u0003\u001e\u000f\u0000\u015d\u015e"+
		"\u0005$\u0000\u0000\u015e\u0161\u0001\u0000\u0000\u0000\u015f\u0161\u0001"+
		"\u0000\u0000\u0000\u0160\u015a\u0001\u0000\u0000\u0000\u0160\u015f\u0001"+
		"\u0000\u0000\u0000\u01613\u0001\u0000\u0000\u0000\u0162\u0163\u0005\u0014"+
		"\u0000\u0000\u0163\u0164\u0005\'\u0000\u0000\u0164\u0165\u0003v;\u0000"+
		"\u0165\u0166\u0005(\u0000\u0000\u0166\u0167\u0005#\u0000\u0000\u0167\u0168"+
		"\u0003\u001e\u000f\u0000\u0168\u0169\u0005$\u0000\u0000\u0169\u016a\u0005"+
		"\u0013\u0000\u0000\u016a\u016b\u0005 \u0000\u0000\u016b5\u0001\u0000\u0000"+
		"\u0000\u016c\u016d\u0005\u0015\u0000\u0000\u016d\u016e\u0005#\u0000\u0000"+
		"\u016e\u016f\u0003\u001e\u000f\u0000\u016f\u0170\u0005$\u0000\u0000\u0170"+
		"\u0171\u0005\u0014\u0000\u0000\u0171\u0172\u0005\'\u0000\u0000\u0172\u0173"+
		"\u0003v;\u0000\u0173\u0174\u0005(\u0000\u0000\u0174\u0175\u0005 \u0000"+
		"\u0000\u01757\u0001\u0000\u0000\u0000\u0176\u0177\u0005\u0016\u0000\u0000"+
		"\u0177\u0178\u0005\'\u0000\u0000\u0178\u0179\u0003:\u001d\u0000\u0179"+
		"\u017a\u0005 \u0000\u0000\u017a\u017b\u0003v;\u0000\u017b\u017c\u0005"+
		" \u0000\u0000\u017c\u017d\u0003<\u001e\u0000\u017d\u017e\u0005(\u0000"+
		"\u0000\u017e\u017f\u0005#\u0000\u0000\u017f\u0180\u0003\u001e\u000f\u0000"+
		"\u0180\u0181\u0005$\u0000\u0000\u01819\u0001\u0000\u0000\u0000\u0182\u0183"+
		"\u0005\u0010\u0000\u0000\u0183\u0184\u00058\u0000\u0000\u0184\u0185\u0005"+
		"!\u0000\u0000\u0185\u0186\u0003x<\u0000\u0186\u0187\u0003v;\u0000\u0187"+
		"\u018c\u0001\u0000\u0000\u0000\u0188\u0189\u00058\u0000\u0000\u0189\u018a"+
		"\u0005\u001e\u0000\u0000\u018a\u018c\u0003v;\u0000\u018b\u0182\u0001\u0000"+
		"\u0000\u0000\u018b\u0188\u0001\u0000\u0000\u0000\u018c;\u0001\u0000\u0000"+
		"\u0000\u018d\u018e\u00058\u0000\u0000\u018e\u0195\u0005)\u0000\u0000\u018f"+
		"\u0190\u00058\u0000\u0000\u0190\u0195\u0005*\u0000\u0000\u0191\u0192\u0005"+
		"8\u0000\u0000\u0192\u0193\u0005\u001e\u0000\u0000\u0193\u0195\u0003v;"+
		"\u0000\u0194\u018d\u0001\u0000\u0000\u0000\u0194\u018f\u0001\u0000\u0000"+
		"\u0000\u0194\u0191\u0001\u0000\u0000\u0000\u0195=\u0001\u0000\u0000\u0000"+
		"\u0196\u0197\u0005\u0004\u0000\u0000\u0197\u0198\u00054\u0000\u0000\u0198"+
		"\u0199\u0003@ \u0000\u0199?\u0001\u0000\u0000\u0000\u019a\u019b\u0006"+
		" \uffff\uffff\u0000\u019b\u019c\u0003B!\u0000\u019c\u01a1\u0001\u0000"+
		"\u0000\u0000\u019d\u019e\n\u0002\u0000\u0000\u019e\u01a0\u0003B!\u0000"+
		"\u019f\u019d\u0001\u0000\u0000\u0000\u01a0\u01a3\u0001\u0000\u0000\u0000"+
		"\u01a1\u019f\u0001\u0000\u0000\u0000\u01a1\u01a2\u0001\u0000\u0000\u0000"+
		"\u01a2A\u0001\u0000\u0000\u0000\u01a3\u01a1\u0001\u0000\u0000\u0000\u01a4"+
		"\u01b2\u0003T*\u0000\u01a5\u01b2\u0003F#\u0000\u01a6\u01b2\u0003V+\u0000"+
		"\u01a7\u01b2\u0003X,\u0000\u01a8\u01b2\u0003Z-\u0000\u01a9\u01b2\u0003"+
		"H$\u0000\u01aa\u01b2\u0003d2\u0000\u01ab\u01b2\u0003N\'\u0000\u01ac\u01b2"+
		"\u0003P(\u0000\u01ad\u01b2\u0003D\"\u0000\u01ae\u01b2\u0003J%\u0000\u01af"+
		"\u01b2\u0003L&\u0000\u01b0\u01b2\u0003\u0084B\u0000\u01b1\u01a4\u0001"+
		"\u0000\u0000\u0000\u01b1\u01a5\u0001\u0000\u0000\u0000\u01b1\u01a6\u0001"+
		"\u0000\u0000\u0000\u01b1\u01a7\u0001\u0000\u0000\u0000\u01b1\u01a8\u0001"+
		"\u0000\u0000\u0000\u01b1\u01a9\u0001\u0000\u0000\u0000\u01b1\u01aa\u0001"+
		"\u0000\u0000\u0000\u01b1\u01ab\u0001\u0000\u0000\u0000\u01b1\u01ac\u0001"+
		"\u0000\u0000\u0000\u01b1\u01ad\u0001\u0000\u0000\u0000\u01b1\u01ae\u0001"+
		"\u0000\u0000\u0000\u01b1\u01af\u0001\u0000\u0000\u0000\u01b1\u01b0\u0001"+
		"\u0000\u0000\u0000\u01b2C\u0001\u0000\u0000\u0000\u01b3\u01b4\u00058\u0000"+
		"\u0000\u01b4\u01b5\u0005\u001e\u0000\u0000\u01b5\u01b6\u0005#\u0000\u0000"+
		"\u01b6\u01b7\u0003R)\u0000\u01b7\u01b8\u0005$\u0000\u0000\u01b8E\u0001"+
		"\u0000\u0000\u0000\u01b9\u01ba\u00058\u0000\u0000\u01ba\u01bb\u0005\u001e"+
		"\u0000\u0000\u01bb\u01bc\u0003v;\u0000\u01bc\u01bd\u0005 \u0000\u0000"+
		"\u01bdG\u0001\u0000\u0000\u0000\u01be\u01bf\u00058\u0000\u0000\u01bf\u01c0"+
		"\u0005%\u0000\u0000\u01c0\u01c1\u0003v;\u0000\u01c1\u01c2\u0005&\u0000"+
		"\u0000\u01c2\u01c3\u0005\u001e\u0000\u0000\u01c3\u01c4\u0003v;\u0000\u01c4"+
		"\u01c5\u0005 \u0000\u0000\u01c5I\u0001\u0000\u0000\u0000\u01c6\u01c7\u0005"+
		"8\u0000\u0000\u01c7\u01c8\u0005\"\u0000\u0000\u01c8\u01c9\u00058\u0000"+
		"\u0000\u01c9\u01ca\u0005\u001e\u0000\u0000\u01ca\u01cb\u0003v;\u0000\u01cb"+
		"\u01cc\u0005 \u0000\u0000\u01ccK\u0001\u0000\u0000\u0000\u01cd\u01ce\u0005"+
		"8\u0000\u0000\u01ce\u01cf\u0005\"\u0000\u0000\u01cf\u01d0\u00058\u0000"+
		"\u0000\u01d0\u01d1\u0005\u001e\u0000\u0000\u01d1\u01d2\u0003\\.\u0000"+
		"\u01d2\u01d3\u0005 \u0000\u0000\u01d3M\u0001\u0000\u0000\u0000\u01d4\u01d5"+
		"\u00058\u0000\u0000\u01d5\u01d6\u0005\"\u0000\u0000\u01d6\u01d7\u0005"+
		"8\u0000\u0000\u01d7\u01d8\u0005%\u0000\u0000\u01d8\u01d9\u0003v;\u0000"+
		"\u01d9\u01da\u0005&\u0000\u0000\u01da\u01db\u0005\u001e\u0000\u0000\u01db"+
		"\u01dc\u0005#\u0000\u0000\u01dc\u01dd\u0003R)\u0000\u01dd\u01de\u0005"+
		"$\u0000\u0000\u01deO\u0001\u0000\u0000\u0000\u01df\u01e0\u0005\u0010\u0000"+
		"\u0000\u01e0\u01e1\u00058\u0000\u0000\u01e1\u01e2\u0005!\u0000\u0000\u01e2"+
		"\u01e3\u00058\u0000\u0000\u01e3\u01e4\u0005#\u0000\u0000\u01e4\u01e5\u0003"+
		"R)\u0000\u01e5\u01e6\u0005$\u0000\u0000\u01e6Q\u0001\u0000\u0000\u0000"+
		"\u01e7\u01e8\u0006)\uffff\uffff\u0000\u01e8\u01e9\u0003t:\u0000\u01e9"+
		"\u01ef\u0001\u0000\u0000\u0000\u01ea\u01eb\n\u0002\u0000\u0000\u01eb\u01ec"+
		"\u0005\u001f\u0000\u0000\u01ec\u01ee\u0003t:\u0000\u01ed\u01ea\u0001\u0000"+
		"\u0000\u0000\u01ee\u01f1\u0001\u0000\u0000\u0000\u01ef\u01ed\u0001\u0000"+
		"\u0000\u0000\u01ef\u01f0\u0001\u0000\u0000\u0000\u01f0S\u0001\u0000\u0000"+
		"\u0000\u01f1\u01ef\u0001\u0000\u0000\u0000\u01f2\u01f3\u0005\u0010\u0000"+
		"\u0000\u01f3\u01f4\u00058\u0000\u0000\u01f4\u01f5\u0005!\u0000\u0000\u01f5"+
		"\u01f6\u0003x<\u0000\u01f6\u01f7\u0003v;\u0000\u01f7\u01f8\u0005 \u0000"+
		"\u0000\u01f8U\u0001\u0000\u0000\u0000\u01f9\u01fa\u0005\u0010\u0000\u0000"+
		"\u01fa\u01fb\u00058\u0000\u0000\u01fb\u01fc\u0005!\u0000\u0000\u01fc\u01fd"+
		"\u0003\u0082A\u0000\u01fd\u01fe\u0005 \u0000\u0000\u01feW\u0001\u0000"+
		"\u0000\u0000\u01ff\u0200\u0005\u0011\u0000\u0000\u0200\u0201\u00058\u0000"+
		"\u0000\u0201\u0202\u0005\'\u0000\u0000\u0202\u0203\u00059\u0000\u0000"+
		"\u0203\u0204\u0005(\u0000\u0000\u0204\u0205\u0005!\u0000\u0000\u0205\u0206"+
		"\u0003x<\u0000\u0206\u0207\u0003\\.\u0000\u0207\u0208\u0005 \u0000\u0000"+
		"\u0208\u020b\u0001\u0000\u0000\u0000\u0209\u020b\u0003Z-\u0000\u020a\u01ff"+
		"\u0001\u0000\u0000\u0000\u020a\u0209\u0001\u0000\u0000\u0000\u020bY\u0001"+
		"\u0000\u0000\u0000\u020c\u020d\u0005\u0011\u0000\u0000\u020d\u020e\u0005"+
		"8\u0000\u0000\u020e\u020f\u0005\'\u0000\u0000\u020f\u0210\u00059\u0000"+
		"\u0000\u0210\u0211\u0005(\u0000\u0000\u0211\u0212\u0005!\u0000\u0000\u0212"+
		"\u0213\u0003\\.\u0000\u0213\u0214\u0005 \u0000\u0000\u0214[\u0001\u0000"+
		"\u0000\u0000\u0215\u0216\u0005#\u0000\u0000\u0216\u0217\u0003^/\u0000"+
		"\u0217\u0218\u0005$\u0000\u0000\u0218\u021b\u0001\u0000\u0000\u0000\u0219"+
		"\u021b\u0001\u0000\u0000\u0000\u021a\u0215\u0001\u0000\u0000\u0000\u021a"+
		"\u0219\u0001\u0000\u0000\u0000\u021b]\u0001\u0000\u0000\u0000\u021c\u021d"+
		"\u0006/\uffff\uffff\u0000\u021d\u021e\u0003`0\u0000\u021e\u0224\u0001"+
		"\u0000\u0000\u0000\u021f\u0220\n\u0002\u0000\u0000\u0220\u0221\u0005\u001f"+
		"\u0000\u0000\u0221\u0223\u0003`0\u0000\u0222\u021f\u0001\u0000\u0000\u0000"+
		"\u0223\u0226\u0001\u0000\u0000\u0000\u0224\u0222\u0001\u0000\u0000\u0000"+
		"\u0224\u0225\u0001\u0000\u0000\u0000\u0225_\u0001\u0000\u0000\u0000\u0226"+
		"\u0224\u0001\u0000\u0000\u0000\u0227\u022a\u0003b1\u0000\u0228\u022a\u0003"+
		"v;\u0000\u0229\u0227\u0001\u0000\u0000\u0000\u0229\u0228\u0001\u0000\u0000"+
		"\u0000\u022aa\u0001\u0000\u0000\u0000\u022b\u022c\u00061\uffff\uffff\u0000"+
		"\u022c\u022d\u00058\u0000\u0000\u022d\u022e\u0005\"\u0000\u0000\u022e"+
		"\u0237\u00058\u0000\u0000\u022f\u0230\u00058\u0000\u0000\u0230\u0231\u0005"+
		"%\u0000\u0000\u0231\u0232\u0003v;\u0000\u0232\u0233\u0005&\u0000\u0000"+
		"\u0233\u0234\u0005\"\u0000\u0000\u0234\u0235\u00058\u0000\u0000\u0235"+
		"\u0237\u0001\u0000\u0000\u0000\u0236\u022b\u0001\u0000\u0000\u0000\u0236"+
		"\u022f\u0001\u0000\u0000\u0000\u0237\u0242\u0001\u0000\u0000\u0000\u0238"+
		"\u0239\n\u0004\u0000\u0000\u0239\u023a\u0005\"\u0000\u0000\u023a\u0241"+
		"\u00058\u0000\u0000\u023b\u023c\n\u0003\u0000\u0000\u023c\u023d\u0005"+
		"%\u0000\u0000\u023d\u023e\u0003v;\u0000\u023e\u023f\u0005&\u0000\u0000"+
		"\u023f\u0241\u0001\u0000\u0000\u0000\u0240\u0238\u0001\u0000\u0000\u0000"+
		"\u0240\u023b\u0001\u0000\u0000\u0000\u0241\u0244\u0001\u0000\u0000\u0000"+
		"\u0242\u0240\u0001\u0000\u0000\u0000\u0242\u0243\u0001\u0000\u0000\u0000"+
		"\u0243c\u0001\u0000\u0000\u0000\u0244\u0242\u0001\u0000\u0000\u0000\u0245"+
		"\u0246\u0005\u0012\u0000\u0000\u0246\u0247\u00058\u0000\u0000\u0247\u0248"+
		"\u0005#\u0000\u0000\u0248\u0249\u0003f3\u0000\u0249\u024a\u0005$\u0000"+
		"\u0000\u024a\u024b\u0005\u0013\u0000\u0000\u024b\u024c\u0005 \u0000\u0000"+
		"\u024ce\u0001\u0000\u0000\u0000\u024d\u0250\u0003h4\u0000\u024e\u0250"+
		"\u0003j5\u0000\u024f\u024d\u0001\u0000\u0000\u0000\u024f\u024e\u0001\u0000"+
		"\u0000\u0000\u0250g\u0001\u0000\u0000\u0000\u0251\u0252\u00064\uffff\uffff"+
		"\u0000\u0252\u0253\u0003l6\u0000\u0253\u0254\u0005 \u0000\u0000\u0254"+
		"\u025b\u0001\u0000\u0000\u0000\u0255\u0256\n\u0002\u0000\u0000\u0256\u0257"+
		"\u0003l6\u0000\u0257\u0258\u0005 \u0000\u0000\u0258\u025a\u0001\u0000"+
		"\u0000\u0000\u0259\u0255\u0001\u0000\u0000\u0000\u025a\u025d\u0001\u0000"+
		"\u0000\u0000\u025b\u0259\u0001\u0000\u0000\u0000\u025b\u025c\u0001\u0000"+
		"\u0000\u0000\u025ci\u0001\u0000\u0000\u0000\u025d\u025b\u0001\u0000\u0000"+
		"\u0000\u025e\u025f\u00065\uffff\uffff\u0000\u025f\u0260\u0003l6\u0000"+
		"\u0260\u0266\u0001\u0000\u0000\u0000\u0261\u0262\n\u0002\u0000\u0000\u0262"+
		"\u0263\u0005\u001f\u0000\u0000\u0263\u0265\u0003l6\u0000\u0264\u0261\u0001"+
		"\u0000\u0000\u0000\u0265\u0268\u0001\u0000\u0000\u0000\u0266\u0264\u0001"+
		"\u0000\u0000\u0000\u0266\u0267\u0001\u0000\u0000\u0000\u0267k\u0001\u0000"+
		"\u0000\u0000\u0268\u0266\u0001\u0000\u0000\u0000\u0269\u026d\u0003n7\u0000"+
		"\u026a\u026d\u0003p8\u0000\u026b\u026d\u0003r9\u0000\u026c\u0269\u0001"+
		"\u0000\u0000\u0000\u026c\u026a\u0001\u0000\u0000\u0000\u026c\u026b\u0001"+
		"\u0000\u0000\u0000\u026dm\u0001\u0000\u0000\u0000\u026e\u026f\u0005\u0010"+
		"\u0000\u0000\u026f\u0270\u00058\u0000\u0000\u0270\u0271\u0005!\u0000\u0000"+
		"\u0271\u0272\u0003x<\u0000\u0272o\u0001\u0000\u0000\u0000\u0273\u0274"+
		"\u0005\u0010\u0000\u0000\u0274\u0275\u00058\u0000\u0000\u0275\u0276\u0005"+
		"!\u0000\u0000\u0276\u0277\u0003\u0082A\u0000\u0277q\u0001\u0000\u0000"+
		"\u0000\u0278\u0279\u0005\u0011\u0000\u0000\u0279\u027a\u00058\u0000\u0000"+
		"\u027a\u027b\u0005!\u0000\u0000\u027b\u027c\u00058\u0000\u0000\u027cs"+
		"\u0001\u0000\u0000\u0000\u027d\u027e\u00058\u0000\u0000\u027e\u027f\u0005"+
		"!\u0000\u0000\u027f\u0280\u0003v;\u0000\u0280u\u0001\u0000\u0000\u0000"+
		"\u0281\u0282\u0006;\uffff\uffff\u0000\u0282\u0283\u0005\'\u0000\u0000"+
		"\u0283\u0284\u0003v;\u0000\u0284\u0285\u0005(\u0000\u0000\u0285\u028c"+
		"\u0001\u0000\u0000\u0000\u0286\u0287\u00057\u0000\u0000\u0287\u028c\u0003"+
		"v;\u000f\u0288\u0289\u0005,\u0000\u0000\u0289\u028c\u0003v;\u000e\u028a"+
		"\u028c\u0003\u0080@\u0000\u028b\u0281\u0001\u0000\u0000\u0000\u028b\u0286"+
		"\u0001\u0000\u0000\u0000\u028b\u0288\u0001\u0000\u0000\u0000\u028b\u028a"+
		"\u0001\u0000\u0000\u0000\u028c\u02b3\u0001\u0000\u0000\u0000\u028d\u028e"+
		"\n\r\u0000\u0000\u028e\u028f\u0005-\u0000\u0000\u028f\u02b2\u0003v;\u000e"+
		"\u0290\u0291\n\f\u0000\u0000\u0291\u0292\u0005.\u0000\u0000\u0292\u02b2"+
		"\u0003v;\r\u0293\u0294\n\u000b\u0000\u0000\u0294\u0295\u0005+\u0000\u0000"+
		"\u0295\u02b2\u0003v;\f\u0296\u0297\n\n\u0000\u0000\u0297\u0298\u0005,"+
		"\u0000\u0000\u0298\u02b2\u0003v;\u000b\u0299\u029a\n\t\u0000\u0000\u029a"+
		"\u029b\u00053\u0000\u0000\u029b\u02b2\u0003v;\n\u029c\u029d\n\b\u0000"+
		"\u0000\u029d\u029e\u00054\u0000\u0000\u029e\u02b2\u0003v;\t\u029f\u02a0"+
		"\n\u0007\u0000\u0000\u02a0\u02a1\u00051\u0000\u0000\u02a1\u02b2\u0003"+
		"v;\b\u02a2\u02a3\n\u0006\u0000\u0000\u02a3\u02a4\u00050\u0000\u0000\u02a4"+
		"\u02b2\u0003v;\u0007\u02a5\u02a6\n\u0005\u0000\u0000\u02a6\u02a7\u0005"+
		"/\u0000\u0000\u02a7\u02b2\u0003v;\u0006\u02a8\u02a9\n\u0004\u0000\u0000"+
		"\u02a9\u02aa\u00052\u0000\u0000\u02aa\u02b2\u0003v;\u0005\u02ab\u02ac"+
		"\n\u0003\u0000\u0000\u02ac\u02ad\u00055\u0000\u0000\u02ad\u02b2\u0003"+
		"v;\u0004\u02ae\u02af\n\u0002\u0000\u0000\u02af\u02b0\u00056\u0000\u0000"+
		"\u02b0\u02b2\u0003v;\u0003\u02b1\u028d\u0001\u0000\u0000\u0000\u02b1\u0290"+
		"\u0001\u0000\u0000\u0000\u02b1\u0293\u0001\u0000\u0000\u0000\u02b1\u0296"+
		"\u0001\u0000\u0000\u0000\u02b1\u0299\u0001\u0000\u0000\u0000\u02b1\u029c"+
		"\u0001\u0000\u0000\u0000\u02b1\u029f\u0001\u0000\u0000\u0000\u02b1\u02a2"+
		"\u0001\u0000\u0000\u0000\u02b1\u02a5\u0001\u0000\u0000\u0000\u02b1\u02a8"+
		"\u0001\u0000\u0000\u0000\u02b1\u02ab\u0001\u0000\u0000\u0000\u02b1\u02ae"+
		"\u0001\u0000\u0000\u0000\u02b2\u02b5\u0001\u0000\u0000\u0000\u02b3\u02b1"+
		"\u0001\u0000\u0000\u0000\u02b3\u02b4\u0001\u0000\u0000\u0000\u02b4w\u0001"+
		"\u0000\u0000\u0000\u02b5\u02b3\u0001\u0000\u0000\u0000\u02b6\u02bc\u0005"+
		"\u000b\u0000\u0000\u02b7\u02bc\u0005\n\u0000\u0000\u02b8\u02bc\u0005\f"+
		"\u0000\u0000\u02b9\u02bc\u0005\r\u0000\u0000\u02ba\u02bc\u00058\u0000"+
		"\u0000\u02bb\u02b6\u0001\u0000\u0000\u0000\u02bb\u02b7\u0001\u0000\u0000"+
		"\u0000\u02bb\u02b8\u0001\u0000\u0000\u0000\u02bb\u02b9\u0001\u0000\u0000"+
		"\u0000\u02bb\u02ba\u0001\u0000\u0000\u0000\u02bcy\u0001\u0000\u0000\u0000"+
		"\u02bd\u02be\u00058\u0000\u0000\u02be\u02bf\u0005%\u0000\u0000\u02bf\u02c0"+
		"\u0003v;\u0000\u02c0\u02c1\u0005&\u0000\u0000\u02c1{\u0001\u0000\u0000"+
		"\u0000\u02c2\u02c3\u00058\u0000\u0000\u02c3\u02c4\u0005\'\u0000\u0000"+
		"\u02c4\u02c5\u0003~?\u0000\u02c5\u02c6\u0005(\u0000\u0000\u02c6}\u0001"+
		"\u0000\u0000\u0000\u02c7\u02c8\u0006?\uffff\uffff\u0000\u02c8\u02cb\u0003"+
		"v;\u0000\u02c9\u02cb\u0001\u0000\u0000\u0000\u02ca\u02c7\u0001\u0000\u0000"+
		"\u0000\u02ca\u02c9\u0001\u0000\u0000\u0000\u02cb\u02d1\u0001\u0000\u0000"+
		"\u0000\u02cc\u02cd\n\u0003\u0000\u0000\u02cd\u02ce\u0005\u001f\u0000\u0000"+
		"\u02ce\u02d0\u0003v;\u0000\u02cf\u02cc\u0001\u0000\u0000\u0000\u02d0\u02d3"+
		"\u0001\u0000\u0000\u0000\u02d1\u02cf\u0001\u0000\u0000\u0000\u02d1\u02d2"+
		"\u0001\u0000\u0000\u0000\u02d2\u007f\u0001\u0000\u0000\u0000\u02d3\u02d1"+
		"\u0001\u0000\u0000\u0000\u02d4\u02de\u0005;\u0000\u0000\u02d5\u02de\u0005"+
		"<\u0000\u0000\u02d6\u02de\u00058\u0000\u0000\u02d7\u02de\u0005:\u0000"+
		"\u0000\u02d8\u02de\u00059\u0000\u0000\u02d9\u02de\u0003\u0082A\u0000\u02da"+
		"\u02de\u0003z=\u0000\u02db\u02de\u0003|>\u0000\u02dc\u02de\u0003b1\u0000"+
		"\u02dd\u02d4\u0001\u0000\u0000\u0000\u02dd\u02d5\u0001\u0000\u0000\u0000"+
		"\u02dd\u02d6\u0001\u0000\u0000\u0000\u02dd\u02d7\u0001\u0000\u0000\u0000"+
		"\u02dd\u02d8\u0001\u0000\u0000\u0000\u02dd\u02d9\u0001\u0000\u0000\u0000"+
		"\u02dd\u02da\u0001\u0000\u0000\u0000\u02dd\u02db\u0001\u0000\u0000\u0000"+
		"\u02dd\u02dc\u0001\u0000\u0000\u0000\u02de\u0081\u0001\u0000\u0000\u0000"+
		"\u02df\u02e2\u0005\u000e\u0000\u0000\u02e0\u02e2\u0005\u000f\u0000\u0000"+
		"\u02e1\u02df\u0001\u0000\u0000\u0000\u02e1\u02e0\u0001\u0000\u0000\u0000"+
		"\u02e2\u0083\u0001\u0000\u0000\u0000\u02e3\u02e4\u00058\u0000\u0000\u02e4"+
		"\u02e5\u0005)\u0000\u0000\u02e5\u02ea\u0005 \u0000\u0000\u02e6\u02e7\u0005"+
		"8\u0000\u0000\u02e7\u02e8\u0005*\u0000\u0000\u02e8\u02ea\u0005 \u0000"+
		"\u0000\u02e9\u02e3\u0001\u0000\u0000\u0000\u02e9\u02e6\u0001\u0000\u0000"+
		"\u0000\u02ea\u0085\u0001\u0000\u0000\u0000-\u0089\u008e\u009f\u00a4\u00bc"+
		"\u00c6\u00d4\u00dc\u00e1\u00e8\u00f6\u0103\u0114\u011c\u0122\u012b\u0135"+
		"\u013c\u014f\u0160\u018b\u0194\u01a1\u01b1\u01ef\u020a\u021a\u0224\u0229"+
		"\u0236\u0240\u0242\u024f\u025b\u0266\u026c\u028b\u02b1\u02b3\u02bb\u02ca"+
		"\u02d1\u02dd\u02e1\u02e9";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}