// Generated from CodexLatinusParser.g4 by ANTLR 4.13.2
package com.pablocompany.practica.no1.compi2.compiler.logic;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CodexLatinusParser}.
 */
public interface CodexLatinusParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CodexLatinusParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(CodexLatinusParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link CodexLatinusParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(CodexLatinusParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link CodexLatinusParser#body}.
	 * @param ctx the parse tree
	 */
	void enterBody(CodexLatinusParser.BodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link CodexLatinusParser#body}.
	 * @param ctx the parse tree
	 */
	void exitBody(CodexLatinusParser.BodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link CodexLatinusParser#variable_section}.
	 * @param ctx the parse tree
	 */
	void enterVariable_section(CodexLatinusParser.Variable_sectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CodexLatinusParser#variable_section}.
	 * @param ctx the parse tree
	 */
	void exitVariable_section(CodexLatinusParser.Variable_sectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CodexLatinusParser#variabiles_body}.
	 * @param ctx the parse tree
	 */
	void enterVariabiles_body(CodexLatinusParser.Variabiles_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link CodexLatinusParser#variabiles_body}.
	 * @param ctx the parse tree
	 */
	void exitVariabiles_body(CodexLatinusParser.Variabiles_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link CodexLatinusParser#declarations}.
	 * @param ctx the parse tree
	 */
	void enterDeclarations(CodexLatinusParser.DeclarationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CodexLatinusParser#declarations}.
	 * @param ctx the parse tree
	 */
	void exitDeclarations(CodexLatinusParser.DeclarationsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CodexLatinusParser#maior_section}.
	 * @param ctx the parse tree
	 */
	void enterMaior_section(CodexLatinusParser.Maior_sectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CodexLatinusParser#maior_section}.
	 * @param ctx the parse tree
	 */
	void exitMaior_section(CodexLatinusParser.Maior_sectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CodexLatinusParser#munera_section}.
	 * @param ctx the parse tree
	 */
	void enterMunera_section(CodexLatinusParser.Munera_sectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CodexLatinusParser#munera_section}.
	 * @param ctx the parse tree
	 */
	void exitMunera_section(CodexLatinusParser.Munera_sectionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Divide}
	 * labeled alternative in {@link CodexLatinusParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterDivide(CodexLatinusParser.DivideContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Divide}
	 * labeled alternative in {@link CodexLatinusParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitDivide(CodexLatinusParser.DivideContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Multiplication}
	 * labeled alternative in {@link CodexLatinusParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterMultiplication(CodexLatinusParser.MultiplicationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Multiplication}
	 * labeled alternative in {@link CodexLatinusParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitMultiplication(CodexLatinusParser.MultiplicationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ReducedValue}
	 * labeled alternative in {@link CodexLatinusParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterReducedValue(CodexLatinusParser.ReducedValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ReducedValue}
	 * labeled alternative in {@link CodexLatinusParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitReducedValue(CodexLatinusParser.ReducedValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Parents}
	 * labeled alternative in {@link CodexLatinusParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterParents(CodexLatinusParser.ParentsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Parents}
	 * labeled alternative in {@link CodexLatinusParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitParents(CodexLatinusParser.ParentsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Negate}
	 * labeled alternative in {@link CodexLatinusParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterNegate(CodexLatinusParser.NegateContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Negate}
	 * labeled alternative in {@link CodexLatinusParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitNegate(CodexLatinusParser.NegateContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Plus}
	 * labeled alternative in {@link CodexLatinusParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterPlus(CodexLatinusParser.PlusContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Plus}
	 * labeled alternative in {@link CodexLatinusParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitPlus(CodexLatinusParser.PlusContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Minus}
	 * labeled alternative in {@link CodexLatinusParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterMinus(CodexLatinusParser.MinusContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Minus}
	 * labeled alternative in {@link CodexLatinusParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitMinus(CodexLatinusParser.MinusContext ctx);
	/**
	 * Enter a parse tree produced by the {@code values}
	 * labeled alternative in {@link CodexLatinusParser#expressionexpressionexpressionexpressionexpressionexpressionexpression}.
	 * @param ctx the parse tree
	 */
	void enterValues(CodexLatinusParser.ValuesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code values}
	 * labeled alternative in {@link CodexLatinusParser#expressionexpressionexpressionexpressionexpressionexpressionexpression}.
	 * @param ctx the parse tree
	 */
	void exitValues(CodexLatinusParser.ValuesContext ctx);
}