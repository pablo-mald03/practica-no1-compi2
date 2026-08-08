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
	 * Enter a parse tree produced by the {@code MaiorSection}
	 * labeled alternative in {@link CodexLatinusParser#maior_section}.
	 * @param ctx the parse tree
	 */
	void enterMaiorSection(CodexLatinusParser.MaiorSectionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MaiorSection}
	 * labeled alternative in {@link CodexLatinusParser#maior_section}.
	 * @param ctx the parse tree
	 */
	void exitMaiorSection(CodexLatinusParser.MaiorSectionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FunctionsBlockList}
	 * labeled alternative in {@link CodexLatinusParser#maior_body}.
	 * @param ctx the parse tree
	 */
	void enterFunctionsBlockList(CodexLatinusParser.FunctionsBlockListContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FunctionsBlockList}
	 * labeled alternative in {@link CodexLatinusParser#maior_body}.
	 * @param ctx the parse tree
	 */
	void exitFunctionsBlockList(CodexLatinusParser.FunctionsBlockListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FunctionsSingleBlock}
	 * labeled alternative in {@link CodexLatinusParser#maior_body}.
	 * @param ctx the parse tree
	 */
	void enterFunctionsSingleBlock(CodexLatinusParser.FunctionsSingleBlockContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FunctionsSingleBlock}
	 * labeled alternative in {@link CodexLatinusParser#maior_body}.
	 * @param ctx the parse tree
	 */
	void exitFunctionsSingleBlock(CodexLatinusParser.FunctionsSingleBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link CodexLatinusParser#functions_block}.
	 * @param ctx the parse tree
	 */
	void enterFunctions_block(CodexLatinusParser.Functions_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link CodexLatinusParser#functions_block}.
	 * @param ctx the parse tree
	 */
	void exitFunctions_block(CodexLatinusParser.Functions_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link CodexLatinusParser#function_declaration}.
	 * @param ctx the parse tree
	 */
	void enterFunction_declaration(CodexLatinusParser.Function_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CodexLatinusParser#function_declaration}.
	 * @param ctx the parse tree
	 */
	void exitFunction_declaration(CodexLatinusParser.Function_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CodexLatinusParser#function_body}.
	 * @param ctx the parse tree
	 */
	void enterFunction_body(CodexLatinusParser.Function_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link CodexLatinusParser#function_body}.
	 * @param ctx the parse tree
	 */
	void exitFunction_body(CodexLatinusParser.Function_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link CodexLatinusParser#procedure_declaration}.
	 * @param ctx the parse tree
	 */
	void enterProcedure_declaration(CodexLatinusParser.Procedure_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CodexLatinusParser#procedure_declaration}.
	 * @param ctx the parse tree
	 */
	void exitProcedure_declaration(CodexLatinusParser.Procedure_declarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FunctionSingleArgs}
	 * labeled alternative in {@link CodexLatinusParser#function_arguments}.
	 * @param ctx the parse tree
	 */
	void enterFunctionSingleArgs(CodexLatinusParser.FunctionSingleArgsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FunctionSingleArgs}
	 * labeled alternative in {@link CodexLatinusParser#function_arguments}.
	 * @param ctx the parse tree
	 */
	void exitFunctionSingleArgs(CodexLatinusParser.FunctionSingleArgsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FunctionArgsEmpty}
	 * labeled alternative in {@link CodexLatinusParser#function_arguments}.
	 * @param ctx the parse tree
	 */
	void enterFunctionArgsEmpty(CodexLatinusParser.FunctionArgsEmptyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FunctionArgsEmpty}
	 * labeled alternative in {@link CodexLatinusParser#function_arguments}.
	 * @param ctx the parse tree
	 */
	void exitFunctionArgsEmpty(CodexLatinusParser.FunctionArgsEmptyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FunctionArgsList}
	 * labeled alternative in {@link CodexLatinusParser#function_arguments}.
	 * @param ctx the parse tree
	 */
	void enterFunctionArgsList(CodexLatinusParser.FunctionArgsListContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FunctionArgsList}
	 * labeled alternative in {@link CodexLatinusParser#function_arguments}.
	 * @param ctx the parse tree
	 */
	void exitFunctionArgsList(CodexLatinusParser.FunctionArgsListContext ctx);
	/**
	 * Enter a parse tree produced by {@link CodexLatinusParser#argument}.
	 * @param ctx the parse tree
	 */
	void enterArgument(CodexLatinusParser.ArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link CodexLatinusParser#argument}.
	 * @param ctx the parse tree
	 */
	void exitArgument(CodexLatinusParser.ArgumentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MuneraCodeSection}
	 * labeled alternative in {@link CodexLatinusParser#munera_section}.
	 * @param ctx the parse tree
	 */
	void enterMuneraCodeSection(CodexLatinusParser.MuneraCodeSectionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MuneraCodeSection}
	 * labeled alternative in {@link CodexLatinusParser#munera_section}.
	 * @param ctx the parse tree
	 */
	void exitMuneraCodeSection(CodexLatinusParser.MuneraCodeSectionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BlockControlList}
	 * labeled alternative in {@link CodexLatinusParser#code_body}.
	 * @param ctx the parse tree
	 */
	void enterBlockControlList(CodexLatinusParser.BlockControlListContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BlockControlList}
	 * labeled alternative in {@link CodexLatinusParser#code_body}.
	 * @param ctx the parse tree
	 */
	void exitBlockControlList(CodexLatinusParser.BlockControlListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BlockSingleControl}
	 * labeled alternative in {@link CodexLatinusParser#code_body}.
	 * @param ctx the parse tree
	 */
	void enterBlockSingleControl(CodexLatinusParser.BlockSingleControlContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BlockSingleControl}
	 * labeled alternative in {@link CodexLatinusParser#code_body}.
	 * @param ctx the parse tree
	 */
	void exitBlockSingleControl(CodexLatinusParser.BlockSingleControlContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BlockCode}
	 * labeled alternative in {@link CodexLatinusParser#control_block}.
	 * @param ctx the parse tree
	 */
	void enterBlockCode(CodexLatinusParser.BlockCodeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BlockCode}
	 * labeled alternative in {@link CodexLatinusParser#control_block}.
	 * @param ctx the parse tree
	 */
	void exitBlockCode(CodexLatinusParser.BlockCodeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ConsoleActions}
	 * labeled alternative in {@link CodexLatinusParser#control_block}.
	 * @param ctx the parse tree
	 */
	void enterConsoleActions(CodexLatinusParser.ConsoleActionsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ConsoleActions}
	 * labeled alternative in {@link CodexLatinusParser#control_block}.
	 * @param ctx the parse tree
	 */
	void exitConsoleActions(CodexLatinusParser.ConsoleActionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CodexLatinusParser#console_actions}.
	 * @param ctx the parse tree
	 */
	void enterConsole_actions(CodexLatinusParser.Console_actionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CodexLatinusParser#console_actions}.
	 * @param ctx the parse tree
	 */
	void exitConsole_actions(CodexLatinusParser.Console_actionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CodexLatinusParser#print_function}.
	 * @param ctx the parse tree
	 */
	void enterPrint_function(CodexLatinusParser.Print_functionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CodexLatinusParser#print_function}.
	 * @param ctx the parse tree
	 */
	void exitPrint_function(CodexLatinusParser.Print_functionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CodeBlockIf}
	 * labeled alternative in {@link CodexLatinusParser#block_code}.
	 * @param ctx the parse tree
	 */
	void enterCodeBlockIf(CodexLatinusParser.CodeBlockIfContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CodeBlockIf}
	 * labeled alternative in {@link CodexLatinusParser#block_code}.
	 * @param ctx the parse tree
	 */
	void exitCodeBlockIf(CodexLatinusParser.CodeBlockIfContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CodeBlockWhile}
	 * labeled alternative in {@link CodexLatinusParser#block_code}.
	 * @param ctx the parse tree
	 */
	void enterCodeBlockWhile(CodexLatinusParser.CodeBlockWhileContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CodeBlockWhile}
	 * labeled alternative in {@link CodexLatinusParser#block_code}.
	 * @param ctx the parse tree
	 */
	void exitCodeBlockWhile(CodexLatinusParser.CodeBlockWhileContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CodeBlockDoWhile}
	 * labeled alternative in {@link CodexLatinusParser#block_code}.
	 * @param ctx the parse tree
	 */
	void enterCodeBlockDoWhile(CodexLatinusParser.CodeBlockDoWhileContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CodeBlockDoWhile}
	 * labeled alternative in {@link CodexLatinusParser#block_code}.
	 * @param ctx the parse tree
	 */
	void exitCodeBlockDoWhile(CodexLatinusParser.CodeBlockDoWhileContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CodeBlockFor}
	 * labeled alternative in {@link CodexLatinusParser#block_code}.
	 * @param ctx the parse tree
	 */
	void enterCodeBlockFor(CodexLatinusParser.CodeBlockForContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CodeBlockFor}
	 * labeled alternative in {@link CodexLatinusParser#block_code}.
	 * @param ctx the parse tree
	 */
	void exitCodeBlockFor(CodexLatinusParser.CodeBlockForContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IfStatement}
	 * labeled alternative in {@link CodexLatinusParser#if_statement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(CodexLatinusParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IfStatement}
	 * labeled alternative in {@link CodexLatinusParser#if_statement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(CodexLatinusParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ElseIfEmpty}
	 * labeled alternative in {@link CodexLatinusParser#else_if_list}.
	 * @param ctx the parse tree
	 */
	void enterElseIfEmpty(CodexLatinusParser.ElseIfEmptyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ElseIfEmpty}
	 * labeled alternative in {@link CodexLatinusParser#else_if_list}.
	 * @param ctx the parse tree
	 */
	void exitElseIfEmpty(CodexLatinusParser.ElseIfEmptyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ElseIfList}
	 * labeled alternative in {@link CodexLatinusParser#else_if_list}.
	 * @param ctx the parse tree
	 */
	void enterElseIfList(CodexLatinusParser.ElseIfListContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ElseIfList}
	 * labeled alternative in {@link CodexLatinusParser#else_if_list}.
	 * @param ctx the parse tree
	 */
	void exitElseIfList(CodexLatinusParser.ElseIfListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ElseIfClause}
	 * labeled alternative in {@link CodexLatinusParser#else_if_clause}.
	 * @param ctx the parse tree
	 */
	void enterElseIfClause(CodexLatinusParser.ElseIfClauseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ElseIfClause}
	 * labeled alternative in {@link CodexLatinusParser#else_if_clause}.
	 * @param ctx the parse tree
	 */
	void exitElseIfClause(CodexLatinusParser.ElseIfClauseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ElseBlock}
	 * labeled alternative in {@link CodexLatinusParser#else_statement}.
	 * @param ctx the parse tree
	 */
	void enterElseBlock(CodexLatinusParser.ElseBlockContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ElseBlock}
	 * labeled alternative in {@link CodexLatinusParser#else_statement}.
	 * @param ctx the parse tree
	 */
	void exitElseBlock(CodexLatinusParser.ElseBlockContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ElseEmpty}
	 * labeled alternative in {@link CodexLatinusParser#else_statement}.
	 * @param ctx the parse tree
	 */
	void enterElseEmpty(CodexLatinusParser.ElseEmptyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ElseEmpty}
	 * labeled alternative in {@link CodexLatinusParser#else_statement}.
	 * @param ctx the parse tree
	 */
	void exitElseEmpty(CodexLatinusParser.ElseEmptyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code WhileStatement}
	 * labeled alternative in {@link CodexLatinusParser#while_statement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatement(CodexLatinusParser.WhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code WhileStatement}
	 * labeled alternative in {@link CodexLatinusParser#while_statement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatement(CodexLatinusParser.WhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DoWhileStatement}
	 * labeled alternative in {@link CodexLatinusParser#do_while_statement}.
	 * @param ctx the parse tree
	 */
	void enterDoWhileStatement(CodexLatinusParser.DoWhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DoWhileStatement}
	 * labeled alternative in {@link CodexLatinusParser#do_while_statement}.
	 * @param ctx the parse tree
	 */
	void exitDoWhileStatement(CodexLatinusParser.DoWhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ForStatement}
	 * labeled alternative in {@link CodexLatinusParser#for_statement}.
	 * @param ctx the parse tree
	 */
	void enterForStatement(CodexLatinusParser.ForStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ForStatement}
	 * labeled alternative in {@link CodexLatinusParser#for_statement}.
	 * @param ctx the parse tree
	 */
	void exitForStatement(CodexLatinusParser.ForStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ForInitVarDeclaration}
	 * labeled alternative in {@link CodexLatinusParser#for_init}.
	 * @param ctx the parse tree
	 */
	void enterForInitVarDeclaration(CodexLatinusParser.ForInitVarDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ForInitVarDeclaration}
	 * labeled alternative in {@link CodexLatinusParser#for_init}.
	 * @param ctx the parse tree
	 */
	void exitForInitVarDeclaration(CodexLatinusParser.ForInitVarDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ForInitAssign}
	 * labeled alternative in {@link CodexLatinusParser#for_init}.
	 * @param ctx the parse tree
	 */
	void enterForInitAssign(CodexLatinusParser.ForInitAssignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ForInitAssign}
	 * labeled alternative in {@link CodexLatinusParser#for_init}.
	 * @param ctx the parse tree
	 */
	void exitForInitAssign(CodexLatinusParser.ForInitAssignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ForUpdateIncrement}
	 * labeled alternative in {@link CodexLatinusParser#for_update}.
	 * @param ctx the parse tree
	 */
	void enterForUpdateIncrement(CodexLatinusParser.ForUpdateIncrementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ForUpdateIncrement}
	 * labeled alternative in {@link CodexLatinusParser#for_update}.
	 * @param ctx the parse tree
	 */
	void exitForUpdateIncrement(CodexLatinusParser.ForUpdateIncrementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ForUpdateDecrement}
	 * labeled alternative in {@link CodexLatinusParser#for_update}.
	 * @param ctx the parse tree
	 */
	void enterForUpdateDecrement(CodexLatinusParser.ForUpdateDecrementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ForUpdateDecrement}
	 * labeled alternative in {@link CodexLatinusParser#for_update}.
	 * @param ctx the parse tree
	 */
	void exitForUpdateDecrement(CodexLatinusParser.ForUpdateDecrementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ForUpdateAssign}
	 * labeled alternative in {@link CodexLatinusParser#for_update}.
	 * @param ctx the parse tree
	 */
	void enterForUpdateAssign(CodexLatinusParser.ForUpdateAssignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ForUpdateAssign}
	 * labeled alternative in {@link CodexLatinusParser#for_update}.
	 * @param ctx the parse tree
	 */
	void exitForUpdateAssign(CodexLatinusParser.ForUpdateAssignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code VariablesSection}
	 * labeled alternative in {@link CodexLatinusParser#variable_section}.
	 * @param ctx the parse tree
	 */
	void enterVariablesSection(CodexLatinusParser.VariablesSectionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code VariablesSection}
	 * labeled alternative in {@link CodexLatinusParser#variable_section}.
	 * @param ctx the parse tree
	 */
	void exitVariablesSection(CodexLatinusParser.VariablesSectionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DeclarationsVariablesList}
	 * labeled alternative in {@link CodexLatinusParser#variabiles_body}.
	 * @param ctx the parse tree
	 */
	void enterDeclarationsVariablesList(CodexLatinusParser.DeclarationsVariablesListContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DeclarationsVariablesList}
	 * labeled alternative in {@link CodexLatinusParser#variabiles_body}.
	 * @param ctx the parse tree
	 */
	void exitDeclarationsVariablesList(CodexLatinusParser.DeclarationsVariablesListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DeclarationsSingleVariable}
	 * labeled alternative in {@link CodexLatinusParser#variabiles_body}.
	 * @param ctx the parse tree
	 */
	void enterDeclarationsSingleVariable(CodexLatinusParser.DeclarationsSingleVariableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DeclarationsSingleVariable}
	 * labeled alternative in {@link CodexLatinusParser#variabiles_body}.
	 * @param ctx the parse tree
	 */
	void exitDeclarationsSingleVariable(CodexLatinusParser.DeclarationsSingleVariableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code VariableInstance}
	 * labeled alternative in {@link CodexLatinusParser#declarations}.
	 * @param ctx the parse tree
	 */
	void enterVariableInstance(CodexLatinusParser.VariableInstanceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code VariableInstance}
	 * labeled alternative in {@link CodexLatinusParser#declarations}.
	 * @param ctx the parse tree
	 */
	void exitVariableInstance(CodexLatinusParser.VariableInstanceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code VariableUssage}
	 * labeled alternative in {@link CodexLatinusParser#declarations}.
	 * @param ctx the parse tree
	 */
	void enterVariableUssage(CodexLatinusParser.VariableUssageContext ctx);
	/**
	 * Exit a parse tree produced by the {@code VariableUssage}
	 * labeled alternative in {@link CodexLatinusParser#declarations}.
	 * @param ctx the parse tree
	 */
	void exitVariableUssage(CodexLatinusParser.VariableUssageContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BooleanVariableInstance}
	 * labeled alternative in {@link CodexLatinusParser#declarations}.
	 * @param ctx the parse tree
	 */
	void enterBooleanVariableInstance(CodexLatinusParser.BooleanVariableInstanceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BooleanVariableInstance}
	 * labeled alternative in {@link CodexLatinusParser#declarations}.
	 * @param ctx the parse tree
	 */
	void exitBooleanVariableInstance(CodexLatinusParser.BooleanVariableInstanceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NormalArrayInstance}
	 * labeled alternative in {@link CodexLatinusParser#declarations}.
	 * @param ctx the parse tree
	 */
	void enterNormalArrayInstance(CodexLatinusParser.NormalArrayInstanceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NormalArrayInstance}
	 * labeled alternative in {@link CodexLatinusParser#declarations}.
	 * @param ctx the parse tree
	 */
	void exitNormalArrayInstance(CodexLatinusParser.NormalArrayInstanceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BooleanArrayInstance}
	 * labeled alternative in {@link CodexLatinusParser#declarations}.
	 * @param ctx the parse tree
	 */
	void enterBooleanArrayInstance(CodexLatinusParser.BooleanArrayInstanceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BooleanArrayInstance}
	 * labeled alternative in {@link CodexLatinusParser#declarations}.
	 * @param ctx the parse tree
	 */
	void exitBooleanArrayInstance(CodexLatinusParser.BooleanArrayInstanceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArrayUssage}
	 * labeled alternative in {@link CodexLatinusParser#declarations}.
	 * @param ctx the parse tree
	 */
	void enterArrayUssage(CodexLatinusParser.ArrayUssageContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArrayUssage}
	 * labeled alternative in {@link CodexLatinusParser#declarations}.
	 * @param ctx the parse tree
	 */
	void exitArrayUssage(CodexLatinusParser.ArrayUssageContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StructDefinition}
	 * labeled alternative in {@link CodexLatinusParser#declarations}.
	 * @param ctx the parse tree
	 */
	void enterStructDefinition(CodexLatinusParser.StructDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StructDefinition}
	 * labeled alternative in {@link CodexLatinusParser#declarations}.
	 * @param ctx the parse tree
	 */
	void exitStructDefinition(CodexLatinusParser.StructDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StructSetProperty}
	 * labeled alternative in {@link CodexLatinusParser#declarations}.
	 * @param ctx the parse tree
	 */
	void enterStructSetProperty(CodexLatinusParser.StructSetPropertyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StructSetProperty}
	 * labeled alternative in {@link CodexLatinusParser#declarations}.
	 * @param ctx the parse tree
	 */
	void exitStructSetProperty(CodexLatinusParser.StructSetPropertyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StructVariableInstance}
	 * labeled alternative in {@link CodexLatinusParser#declarations}.
	 * @param ctx the parse tree
	 */
	void enterStructVariableInstance(CodexLatinusParser.StructVariableInstanceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StructVariableInstance}
	 * labeled alternative in {@link CodexLatinusParser#declarations}.
	 * @param ctx the parse tree
	 */
	void exitStructVariableInstance(CodexLatinusParser.StructVariableInstanceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NormalVariableUsage}
	 * labeled alternative in {@link CodexLatinusParser#variable_ussage}.
	 * @param ctx the parse tree
	 */
	void enterNormalVariableUsage(CodexLatinusParser.NormalVariableUsageContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NormalVariableUsage}
	 * labeled alternative in {@link CodexLatinusParser#variable_ussage}.
	 * @param ctx the parse tree
	 */
	void exitNormalVariableUsage(CodexLatinusParser.NormalVariableUsageContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NormalArrayUsage}
	 * labeled alternative in {@link CodexLatinusParser#array_ussage}.
	 * @param ctx the parse tree
	 */
	void enterNormalArrayUsage(CodexLatinusParser.NormalArrayUsageContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NormalArrayUsage}
	 * labeled alternative in {@link CodexLatinusParser#array_ussage}.
	 * @param ctx the parse tree
	 */
	void exitNormalArrayUsage(CodexLatinusParser.NormalArrayUsageContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StructArrayProperty}
	 * labeled alternative in {@link CodexLatinusParser#struct_array_property}.
	 * @param ctx the parse tree
	 */
	void enterStructArrayProperty(CodexLatinusParser.StructArrayPropertyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StructArrayProperty}
	 * labeled alternative in {@link CodexLatinusParser#struct_array_property}.
	 * @param ctx the parse tree
	 */
	void exitStructArrayProperty(CodexLatinusParser.StructArrayPropertyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StructInstance}
	 * labeled alternative in {@link CodexLatinusParser#struct_instance}.
	 * @param ctx the parse tree
	 */
	void enterStructInstance(CodexLatinusParser.StructInstanceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StructInstance}
	 * labeled alternative in {@link CodexLatinusParser#struct_instance}.
	 * @param ctx the parse tree
	 */
	void exitStructInstance(CodexLatinusParser.StructInstanceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StructValueList}
	 * labeled alternative in {@link CodexLatinusParser#struct_data_list}.
	 * @param ctx the parse tree
	 */
	void enterStructValueList(CodexLatinusParser.StructValueListContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StructValueList}
	 * labeled alternative in {@link CodexLatinusParser#struct_data_list}.
	 * @param ctx the parse tree
	 */
	void exitStructValueList(CodexLatinusParser.StructValueListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StructSingleValue}
	 * labeled alternative in {@link CodexLatinusParser#struct_data_list}.
	 * @param ctx the parse tree
	 */
	void enterStructSingleValue(CodexLatinusParser.StructSingleValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StructSingleValue}
	 * labeled alternative in {@link CodexLatinusParser#struct_data_list}.
	 * @param ctx the parse tree
	 */
	void exitStructSingleValue(CodexLatinusParser.StructSingleValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code VarDeclaration}
	 * labeled alternative in {@link CodexLatinusParser#variable_declaration}.
	 * @param ctx the parse tree
	 */
	void enterVarDeclaration(CodexLatinusParser.VarDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code VarDeclaration}
	 * labeled alternative in {@link CodexLatinusParser#variable_declaration}.
	 * @param ctx the parse tree
	 */
	void exitVarDeclaration(CodexLatinusParser.VarDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BoolDeclaration}
	 * labeled alternative in {@link CodexLatinusParser#boolean_declaration}.
	 * @param ctx the parse tree
	 */
	void enterBoolDeclaration(CodexLatinusParser.BoolDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BoolDeclaration}
	 * labeled alternative in {@link CodexLatinusParser#boolean_declaration}.
	 * @param ctx the parse tree
	 */
	void exitBoolDeclaration(CodexLatinusParser.BoolDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NormalArrayDeclaration}
	 * labeled alternative in {@link CodexLatinusParser#normal_array}.
	 * @param ctx the parse tree
	 */
	void enterNormalArrayDeclaration(CodexLatinusParser.NormalArrayDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NormalArrayDeclaration}
	 * labeled alternative in {@link CodexLatinusParser#normal_array}.
	 * @param ctx the parse tree
	 */
	void exitNormalArrayDeclaration(CodexLatinusParser.NormalArrayDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BooleanArrayDeclaration}
	 * labeled alternative in {@link CodexLatinusParser#normal_array}.
	 * @param ctx the parse tree
	 */
	void enterBooleanArrayDeclaration(CodexLatinusParser.BooleanArrayDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BooleanArrayDeclaration}
	 * labeled alternative in {@link CodexLatinusParser#normal_array}.
	 * @param ctx the parse tree
	 */
	void exitBooleanArrayDeclaration(CodexLatinusParser.BooleanArrayDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BooleanArrayBase}
	 * labeled alternative in {@link CodexLatinusParser#boolean_array}.
	 * @param ctx the parse tree
	 */
	void enterBooleanArrayBase(CodexLatinusParser.BooleanArrayBaseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BooleanArrayBase}
	 * labeled alternative in {@link CodexLatinusParser#boolean_array}.
	 * @param ctx the parse tree
	 */
	void exitBooleanArrayBase(CodexLatinusParser.BooleanArrayBaseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArrayInitWithValues}
	 * labeled alternative in {@link CodexLatinusParser#array_initialization}.
	 * @param ctx the parse tree
	 */
	void enterArrayInitWithValues(CodexLatinusParser.ArrayInitWithValuesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArrayInitWithValues}
	 * labeled alternative in {@link CodexLatinusParser#array_initialization}.
	 * @param ctx the parse tree
	 */
	void exitArrayInitWithValues(CodexLatinusParser.ArrayInitWithValuesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArrayInitEmpty}
	 * labeled alternative in {@link CodexLatinusParser#array_initialization}.
	 * @param ctx the parse tree
	 */
	void enterArrayInitEmpty(CodexLatinusParser.ArrayInitEmptyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArrayInitEmpty}
	 * labeled alternative in {@link CodexLatinusParser#array_initialization}.
	 * @param ctx the parse tree
	 */
	void exitArrayInitEmpty(CodexLatinusParser.ArrayInitEmptyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArraySingleValue}
	 * labeled alternative in {@link CodexLatinusParser#values_array_list}.
	 * @param ctx the parse tree
	 */
	void enterArraySingleValue(CodexLatinusParser.ArraySingleValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArraySingleValue}
	 * labeled alternative in {@link CodexLatinusParser#values_array_list}.
	 * @param ctx the parse tree
	 */
	void exitArraySingleValue(CodexLatinusParser.ArraySingleValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArrayValueList}
	 * labeled alternative in {@link CodexLatinusParser#values_array_list}.
	 * @param ctx the parse tree
	 */
	void enterArrayValueList(CodexLatinusParser.ArrayValueListContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArrayValueList}
	 * labeled alternative in {@link CodexLatinusParser#values_array_list}.
	 * @param ctx the parse tree
	 */
	void exitArrayValueList(CodexLatinusParser.ArrayValueListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArrayStructVal}
	 * labeled alternative in {@link CodexLatinusParser#array_value}.
	 * @param ctx the parse tree
	 */
	void enterArrayStructVal(CodexLatinusParser.ArrayStructValContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArrayStructVal}
	 * labeled alternative in {@link CodexLatinusParser#array_value}.
	 * @param ctx the parse tree
	 */
	void exitArrayStructVal(CodexLatinusParser.ArrayStructValContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArrayNormalVal}
	 * labeled alternative in {@link CodexLatinusParser#array_value}.
	 * @param ctx the parse tree
	 */
	void enterArrayNormalVal(CodexLatinusParser.ArrayNormalValContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArrayNormalVal}
	 * labeled alternative in {@link CodexLatinusParser#array_value}.
	 * @param ctx the parse tree
	 */
	void exitArrayNormalVal(CodexLatinusParser.ArrayNormalValContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StructDeclaration}
	 * labeled alternative in {@link CodexLatinusParser#struct_declaration}.
	 * @param ctx the parse tree
	 */
	void enterStructDeclaration(CodexLatinusParser.StructDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StructDeclaration}
	 * labeled alternative in {@link CodexLatinusParser#struct_declaration}.
	 * @param ctx the parse tree
	 */
	void exitStructDeclaration(CodexLatinusParser.StructDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StructSeparatedBody}
	 * labeled alternative in {@link CodexLatinusParser#struct_body}.
	 * @param ctx the parse tree
	 */
	void enterStructSeparatedBody(CodexLatinusParser.StructSeparatedBodyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StructSeparatedBody}
	 * labeled alternative in {@link CodexLatinusParser#struct_body}.
	 * @param ctx the parse tree
	 */
	void exitStructSeparatedBody(CodexLatinusParser.StructSeparatedBodyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StructCommaBody}
	 * labeled alternative in {@link CodexLatinusParser#struct_body}.
	 * @param ctx the parse tree
	 */
	void enterStructCommaBody(CodexLatinusParser.StructCommaBodyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StructCommaBody}
	 * labeled alternative in {@link CodexLatinusParser#struct_body}.
	 * @param ctx the parse tree
	 */
	void exitStructCommaBody(CodexLatinusParser.StructCommaBodyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StructNormalBodyList}
	 * labeled alternative in {@link CodexLatinusParser#struct_normal_body}.
	 * @param ctx the parse tree
	 */
	void enterStructNormalBodyList(CodexLatinusParser.StructNormalBodyListContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StructNormalBodyList}
	 * labeled alternative in {@link CodexLatinusParser#struct_normal_body}.
	 * @param ctx the parse tree
	 */
	void exitStructNormalBodyList(CodexLatinusParser.StructNormalBodyListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StructNormalBodySingle}
	 * labeled alternative in {@link CodexLatinusParser#struct_normal_body}.
	 * @param ctx the parse tree
	 */
	void enterStructNormalBodySingle(CodexLatinusParser.StructNormalBodySingleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StructNormalBodySingle}
	 * labeled alternative in {@link CodexLatinusParser#struct_normal_body}.
	 * @param ctx the parse tree
	 */
	void exitStructNormalBodySingle(CodexLatinusParser.StructNormalBodySingleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StructCommaBodySingle}
	 * labeled alternative in {@link CodexLatinusParser#struct_comma_body}.
	 * @param ctx the parse tree
	 */
	void enterStructCommaBodySingle(CodexLatinusParser.StructCommaBodySingleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StructCommaBodySingle}
	 * labeled alternative in {@link CodexLatinusParser#struct_comma_body}.
	 * @param ctx the parse tree
	 */
	void exitStructCommaBodySingle(CodexLatinusParser.StructCommaBodySingleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StructCommaBodyList}
	 * labeled alternative in {@link CodexLatinusParser#struct_comma_body}.
	 * @param ctx the parse tree
	 */
	void enterStructCommaBodyList(CodexLatinusParser.StructCommaBodyListContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StructCommaBodyList}
	 * labeled alternative in {@link CodexLatinusParser#struct_comma_body}.
	 * @param ctx the parse tree
	 */
	void exitStructCommaBodyList(CodexLatinusParser.StructCommaBodyListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NormalVariableStruct}
	 * labeled alternative in {@link CodexLatinusParser#struct_attribute}.
	 * @param ctx the parse tree
	 */
	void enterNormalVariableStruct(CodexLatinusParser.NormalVariableStructContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NormalVariableStruct}
	 * labeled alternative in {@link CodexLatinusParser#struct_attribute}.
	 * @param ctx the parse tree
	 */
	void exitNormalVariableStruct(CodexLatinusParser.NormalVariableStructContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BooleanVariableStruct}
	 * labeled alternative in {@link CodexLatinusParser#struct_attribute}.
	 * @param ctx the parse tree
	 */
	void enterBooleanVariableStruct(CodexLatinusParser.BooleanVariableStructContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BooleanVariableStruct}
	 * labeled alternative in {@link CodexLatinusParser#struct_attribute}.
	 * @param ctx the parse tree
	 */
	void exitBooleanVariableStruct(CodexLatinusParser.BooleanVariableStructContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArrayVariableStruct}
	 * labeled alternative in {@link CodexLatinusParser#struct_attribute}.
	 * @param ctx the parse tree
	 */
	void enterArrayVariableStruct(CodexLatinusParser.ArrayVariableStructContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArrayVariableStruct}
	 * labeled alternative in {@link CodexLatinusParser#struct_attribute}.
	 * @param ctx the parse tree
	 */
	void exitArrayVariableStruct(CodexLatinusParser.ArrayVariableStructContext ctx);
	/**
	 * Enter a parse tree produced by the {@code InternalStructNormalVariable}
	 * labeled alternative in {@link CodexLatinusParser#variable_without_value}.
	 * @param ctx the parse tree
	 */
	void enterInternalStructNormalVariable(CodexLatinusParser.InternalStructNormalVariableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code InternalStructNormalVariable}
	 * labeled alternative in {@link CodexLatinusParser#variable_without_value}.
	 * @param ctx the parse tree
	 */
	void exitInternalStructNormalVariable(CodexLatinusParser.InternalStructNormalVariableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code InternalStructBoolVariable}
	 * labeled alternative in {@link CodexLatinusParser#boolean_variable_without_value}.
	 * @param ctx the parse tree
	 */
	void enterInternalStructBoolVariable(CodexLatinusParser.InternalStructBoolVariableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code InternalStructBoolVariable}
	 * labeled alternative in {@link CodexLatinusParser#boolean_variable_without_value}.
	 * @param ctx the parse tree
	 */
	void exitInternalStructBoolVariable(CodexLatinusParser.InternalStructBoolVariableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code InternalStructArray}
	 * labeled alternative in {@link CodexLatinusParser#array_variable_struct}.
	 * @param ctx the parse tree
	 */
	void enterInternalStructArray(CodexLatinusParser.InternalStructArrayContext ctx);
	/**
	 * Exit a parse tree produced by the {@code InternalStructArray}
	 * labeled alternative in {@link CodexLatinusParser#array_variable_struct}.
	 * @param ctx the parse tree
	 */
	void exitInternalStructArray(CodexLatinusParser.InternalStructArrayContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StructDeclarationValue}
	 * labeled alternative in {@link CodexLatinusParser#struct_data_value}.
	 * @param ctx the parse tree
	 */
	void enterStructDeclarationValue(CodexLatinusParser.StructDeclarationValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StructDeclarationValue}
	 * labeled alternative in {@link CodexLatinusParser#struct_data_value}.
	 * @param ctx the parse tree
	 */
	void exitStructDeclarationValue(CodexLatinusParser.StructDeclarationValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExpressionGreaterEqual}
	 * labeled alternative in {@link CodexLatinusParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpressionGreaterEqual(CodexLatinusParser.ExpressionGreaterEqualContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExpressionGreaterEqual}
	 * labeled alternative in {@link CodexLatinusParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpressionGreaterEqual(CodexLatinusParser.ExpressionGreaterEqualContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExpressionMult}
	 * labeled alternative in {@link CodexLatinusParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpressionMult(CodexLatinusParser.ExpressionMultContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExpressionMult}
	 * labeled alternative in {@link CodexLatinusParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpressionMult(CodexLatinusParser.ExpressionMultContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExpressionLessThan}
	 * labeled alternative in {@link CodexLatinusParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpressionLessThan(CodexLatinusParser.ExpressionLessThanContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExpressionLessThan}
	 * labeled alternative in {@link CodexLatinusParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpressionLessThan(CodexLatinusParser.ExpressionLessThanContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExpressionMinus}
	 * labeled alternative in {@link CodexLatinusParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpressionMinus(CodexLatinusParser.ExpressionMinusContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExpressionMinus}
	 * labeled alternative in {@link CodexLatinusParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpressionMinus(CodexLatinusParser.ExpressionMinusContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExpressionLessEqual}
	 * labeled alternative in {@link CodexLatinusParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpressionLessEqual(CodexLatinusParser.ExpressionLessEqualContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExpressionLessEqual}
	 * labeled alternative in {@link CodexLatinusParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpressionLessEqual(CodexLatinusParser.ExpressionLessEqualContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExpressionNegate}
	 * labeled alternative in {@link CodexLatinusParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpressionNegate(CodexLatinusParser.ExpressionNegateContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExpressionNegate}
	 * labeled alternative in {@link CodexLatinusParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpressionNegate(CodexLatinusParser.ExpressionNegateContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExpressionNotEquals}
	 * labeled alternative in {@link CodexLatinusParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpressionNotEquals(CodexLatinusParser.ExpressionNotEqualsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExpressionNotEquals}
	 * labeled alternative in {@link CodexLatinusParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpressionNotEquals(CodexLatinusParser.ExpressionNotEqualsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExpressionParents}
	 * labeled alternative in {@link CodexLatinusParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpressionParents(CodexLatinusParser.ExpressionParentsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExpressionParents}
	 * labeled alternative in {@link CodexLatinusParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpressionParents(CodexLatinusParser.ExpressionParentsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExpressionDiv}
	 * labeled alternative in {@link CodexLatinusParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpressionDiv(CodexLatinusParser.ExpressionDivContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExpressionDiv}
	 * labeled alternative in {@link CodexLatinusParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpressionDiv(CodexLatinusParser.ExpressionDivContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExpressionNot}
	 * labeled alternative in {@link CodexLatinusParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpressionNot(CodexLatinusParser.ExpressionNotContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExpressionNot}
	 * labeled alternative in {@link CodexLatinusParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpressionNot(CodexLatinusParser.ExpressionNotContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExpressionValue}
	 * labeled alternative in {@link CodexLatinusParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpressionValue(CodexLatinusParser.ExpressionValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExpressionValue}
	 * labeled alternative in {@link CodexLatinusParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpressionValue(CodexLatinusParser.ExpressionValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExpressionAnd}
	 * labeled alternative in {@link CodexLatinusParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpressionAnd(CodexLatinusParser.ExpressionAndContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExpressionAnd}
	 * labeled alternative in {@link CodexLatinusParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpressionAnd(CodexLatinusParser.ExpressionAndContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExpressionOr}
	 * labeled alternative in {@link CodexLatinusParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpressionOr(CodexLatinusParser.ExpressionOrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExpressionOr}
	 * labeled alternative in {@link CodexLatinusParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpressionOr(CodexLatinusParser.ExpressionOrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExpressionGreaterThan}
	 * labeled alternative in {@link CodexLatinusParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpressionGreaterThan(CodexLatinusParser.ExpressionGreaterThanContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExpressionGreaterThan}
	 * labeled alternative in {@link CodexLatinusParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpressionGreaterThan(CodexLatinusParser.ExpressionGreaterThanContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExpressionEquals}
	 * labeled alternative in {@link CodexLatinusParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpressionEquals(CodexLatinusParser.ExpressionEqualsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExpressionEquals}
	 * labeled alternative in {@link CodexLatinusParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpressionEquals(CodexLatinusParser.ExpressionEqualsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExpressionPlus}
	 * labeled alternative in {@link CodexLatinusParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpressionPlus(CodexLatinusParser.ExpressionPlusContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExpressionPlus}
	 * labeled alternative in {@link CodexLatinusParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpressionPlus(CodexLatinusParser.ExpressionPlusContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TypeText}
	 * labeled alternative in {@link CodexLatinusParser#variable_type}.
	 * @param ctx the parse tree
	 */
	void enterTypeText(CodexLatinusParser.TypeTextContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TypeText}
	 * labeled alternative in {@link CodexLatinusParser#variable_type}.
	 * @param ctx the parse tree
	 */
	void exitTypeText(CodexLatinusParser.TypeTextContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TypeInt}
	 * labeled alternative in {@link CodexLatinusParser#variable_type}.
	 * @param ctx the parse tree
	 */
	void enterTypeInt(CodexLatinusParser.TypeIntContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TypeInt}
	 * labeled alternative in {@link CodexLatinusParser#variable_type}.
	 * @param ctx the parse tree
	 */
	void exitTypeInt(CodexLatinusParser.TypeIntContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TypeDecimal}
	 * labeled alternative in {@link CodexLatinusParser#variable_type}.
	 * @param ctx the parse tree
	 */
	void enterTypeDecimal(CodexLatinusParser.TypeDecimalContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TypeDecimal}
	 * labeled alternative in {@link CodexLatinusParser#variable_type}.
	 * @param ctx the parse tree
	 */
	void exitTypeDecimal(CodexLatinusParser.TypeDecimalContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TypeChar}
	 * labeled alternative in {@link CodexLatinusParser#variable_type}.
	 * @param ctx the parse tree
	 */
	void enterTypeChar(CodexLatinusParser.TypeCharContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TypeChar}
	 * labeled alternative in {@link CodexLatinusParser#variable_type}.
	 * @param ctx the parse tree
	 */
	void exitTypeChar(CodexLatinusParser.TypeCharContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TypeCustomId}
	 * labeled alternative in {@link CodexLatinusParser#variable_type}.
	 * @param ctx the parse tree
	 */
	void enterTypeCustomId(CodexLatinusParser.TypeCustomIdContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TypeCustomId}
	 * labeled alternative in {@link CodexLatinusParser#variable_type}.
	 * @param ctx the parse tree
	 */
	void exitTypeCustomId(CodexLatinusParser.TypeCustomIdContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArrayCall}
	 * labeled alternative in {@link CodexLatinusParser#array_call}.
	 * @param ctx the parse tree
	 */
	void enterArrayCall(CodexLatinusParser.ArrayCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArrayCall}
	 * labeled alternative in {@link CodexLatinusParser#array_call}.
	 * @param ctx the parse tree
	 */
	void exitArrayCall(CodexLatinusParser.ArrayCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StructValueLiteral}
	 * labeled alternative in {@link CodexLatinusParser#struct_values}.
	 * @param ctx the parse tree
	 */
	void enterStructValueLiteral(CodexLatinusParser.StructValueLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StructValueLiteral}
	 * labeled alternative in {@link CodexLatinusParser#struct_values}.
	 * @param ctx the parse tree
	 */
	void exitStructValueLiteral(CodexLatinusParser.StructValueLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FunctionCalling}
	 * labeled alternative in {@link CodexLatinusParser#function_call}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCalling(CodexLatinusParser.FunctionCallingContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FunctionCalling}
	 * labeled alternative in {@link CodexLatinusParser#function_call}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCalling(CodexLatinusParser.FunctionCallingContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArgumentSingleFunction}
	 * labeled alternative in {@link CodexLatinusParser#arguments_list}.
	 * @param ctx the parse tree
	 */
	void enterArgumentSingleFunction(CodexLatinusParser.ArgumentSingleFunctionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArgumentSingleFunction}
	 * labeled alternative in {@link CodexLatinusParser#arguments_list}.
	 * @param ctx the parse tree
	 */
	void exitArgumentSingleFunction(CodexLatinusParser.ArgumentSingleFunctionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArgumentFunctionList}
	 * labeled alternative in {@link CodexLatinusParser#arguments_list}.
	 * @param ctx the parse tree
	 */
	void enterArgumentFunctionList(CodexLatinusParser.ArgumentFunctionListContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArgumentFunctionList}
	 * labeled alternative in {@link CodexLatinusParser#arguments_list}.
	 * @param ctx the parse tree
	 */
	void exitArgumentFunctionList(CodexLatinusParser.ArgumentFunctionListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ValString}
	 * labeled alternative in {@link CodexLatinusParser#normal_values}.
	 * @param ctx the parse tree
	 */
	void enterValString(CodexLatinusParser.ValStringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ValString}
	 * labeled alternative in {@link CodexLatinusParser#normal_values}.
	 * @param ctx the parse tree
	 */
	void exitValString(CodexLatinusParser.ValStringContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ValChar}
	 * labeled alternative in {@link CodexLatinusParser#normal_values}.
	 * @param ctx the parse tree
	 */
	void enterValChar(CodexLatinusParser.ValCharContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ValChar}
	 * labeled alternative in {@link CodexLatinusParser#normal_values}.
	 * @param ctx the parse tree
	 */
	void exitValChar(CodexLatinusParser.ValCharContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ValId}
	 * labeled alternative in {@link CodexLatinusParser#normal_values}.
	 * @param ctx the parse tree
	 */
	void enterValId(CodexLatinusParser.ValIdContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ValId}
	 * labeled alternative in {@link CodexLatinusParser#normal_values}.
	 * @param ctx the parse tree
	 */
	void exitValId(CodexLatinusParser.ValIdContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ValDecimal}
	 * labeled alternative in {@link CodexLatinusParser#normal_values}.
	 * @param ctx the parse tree
	 */
	void enterValDecimal(CodexLatinusParser.ValDecimalContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ValDecimal}
	 * labeled alternative in {@link CodexLatinusParser#normal_values}.
	 * @param ctx the parse tree
	 */
	void exitValDecimal(CodexLatinusParser.ValDecimalContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ValInt}
	 * labeled alternative in {@link CodexLatinusParser#normal_values}.
	 * @param ctx the parse tree
	 */
	void enterValInt(CodexLatinusParser.ValIntContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ValInt}
	 * labeled alternative in {@link CodexLatinusParser#normal_values}.
	 * @param ctx the parse tree
	 */
	void exitValInt(CodexLatinusParser.ValIntContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ValBool}
	 * labeled alternative in {@link CodexLatinusParser#normal_values}.
	 * @param ctx the parse tree
	 */
	void enterValBool(CodexLatinusParser.ValBoolContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ValBool}
	 * labeled alternative in {@link CodexLatinusParser#normal_values}.
	 * @param ctx the parse tree
	 */
	void exitValBool(CodexLatinusParser.ValBoolContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ValIdCall}
	 * labeled alternative in {@link CodexLatinusParser#normal_values}.
	 * @param ctx the parse tree
	 */
	void enterValIdCall(CodexLatinusParser.ValIdCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ValIdCall}
	 * labeled alternative in {@link CodexLatinusParser#normal_values}.
	 * @param ctx the parse tree
	 */
	void exitValIdCall(CodexLatinusParser.ValIdCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BoolTrue}
	 * labeled alternative in {@link CodexLatinusParser#boolean_values}.
	 * @param ctx the parse tree
	 */
	void enterBoolTrue(CodexLatinusParser.BoolTrueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BoolTrue}
	 * labeled alternative in {@link CodexLatinusParser#boolean_values}.
	 * @param ctx the parse tree
	 */
	void exitBoolTrue(CodexLatinusParser.BoolTrueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BoolFalse}
	 * labeled alternative in {@link CodexLatinusParser#boolean_values}.
	 * @param ctx the parse tree
	 */
	void enterBoolFalse(CodexLatinusParser.BoolFalseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BoolFalse}
	 * labeled alternative in {@link CodexLatinusParser#boolean_values}.
	 * @param ctx the parse tree
	 */
	void exitBoolFalse(CodexLatinusParser.BoolFalseContext ctx);
}