// Generated from CodexLatinusParser.g4 by ANTLR 4.13.2
package com.pablocompany.practica.no1.compi2.compiler.logic;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link CodexLatinusParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface CodexLatinusParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link CodexLatinusParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(CodexLatinusParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link CodexLatinusParser#body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBody(CodexLatinusParser.BodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link CodexLatinusParser#variable_section}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable_section(CodexLatinusParser.Variable_sectionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CodexLatinusParser#variabiles_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariabiles_body(CodexLatinusParser.Variabiles_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link CodexLatinusParser#declarations}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarations(CodexLatinusParser.DeclarationsContext ctx);
	/**
	 * Visit a parse tree produced by {@link CodexLatinusParser#maior_section}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMaior_section(CodexLatinusParser.Maior_sectionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CodexLatinusParser#munera_section}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMunera_section(CodexLatinusParser.Munera_sectionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Divide}
	 * labeled alternative in {@link CodexLatinusParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDivide(CodexLatinusParser.DivideContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Multiplication}
	 * labeled alternative in {@link CodexLatinusParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplication(CodexLatinusParser.MultiplicationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ReducedValue}
	 * labeled alternative in {@link CodexLatinusParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReducedValue(CodexLatinusParser.ReducedValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Parents}
	 * labeled alternative in {@link CodexLatinusParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParents(CodexLatinusParser.ParentsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Negate}
	 * labeled alternative in {@link CodexLatinusParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNegate(CodexLatinusParser.NegateContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Plus}
	 * labeled alternative in {@link CodexLatinusParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlus(CodexLatinusParser.PlusContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Minus}
	 * labeled alternative in {@link CodexLatinusParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMinus(CodexLatinusParser.MinusContext ctx);
	/**
	 * Visit a parse tree produced by the {@code values}
	 * labeled alternative in {@link CodexLatinusParser#expressionexpressionexpressionexpressionexpressionexpressionexpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValues(CodexLatinusParser.ValuesContext ctx);
}