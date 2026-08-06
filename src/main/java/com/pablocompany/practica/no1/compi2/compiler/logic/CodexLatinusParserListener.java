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
	 * Enter a parse tree produced by {@link CodexLatinusParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(CodexLatinusParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CodexLatinusParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(CodexLatinusParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Identifier}
	 * labeled alternative in {@link CodexLatinusParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(CodexLatinusParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Identifier}
	 * labeled alternative in {@link CodexLatinusParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(CodexLatinusParser.IdentifierContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Number}
	 * labeled alternative in {@link CodexLatinusParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNumber(CodexLatinusParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Number}
	 * labeled alternative in {@link CodexLatinusParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNumber(CodexLatinusParser.NumberContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AddSub}
	 * labeled alternative in {@link CodexLatinusParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAddSub(CodexLatinusParser.AddSubContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AddSub}
	 * labeled alternative in {@link CodexLatinusParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAddSub(CodexLatinusParser.AddSubContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Parens}
	 * labeled alternative in {@link CodexLatinusParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterParens(CodexLatinusParser.ParensContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Parens}
	 * labeled alternative in {@link CodexLatinusParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitParens(CodexLatinusParser.ParensContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Negate}
	 * labeled alternative in {@link CodexLatinusParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNegate(CodexLatinusParser.NegateContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Negate}
	 * labeled alternative in {@link CodexLatinusParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNegate(CodexLatinusParser.NegateContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MultDiv}
	 * labeled alternative in {@link CodexLatinusParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMultDiv(CodexLatinusParser.MultDivContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MultDiv}
	 * labeled alternative in {@link CodexLatinusParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMultDiv(CodexLatinusParser.MultDivContext ctx);
}