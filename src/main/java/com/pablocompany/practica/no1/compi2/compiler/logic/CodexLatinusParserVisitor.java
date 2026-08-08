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
	 * Visit a parse tree produced by the {@code MaiorSection}
	 * labeled alternative in {@link CodexLatinusParser#maior_section}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMaiorSection(CodexLatinusParser.MaiorSectionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FunctionsBlockList}
	 * labeled alternative in {@link CodexLatinusParser#maior_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionsBlockList(CodexLatinusParser.FunctionsBlockListContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FunctionsSingleBlock}
	 * labeled alternative in {@link CodexLatinusParser#maior_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionsSingleBlock(CodexLatinusParser.FunctionsSingleBlockContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FuncDeclBlock}
	 * labeled alternative in {@link CodexLatinusParser#functions_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncDeclBlock(CodexLatinusParser.FuncDeclBlockContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ProcDeclBlock}
	 * labeled alternative in {@link CodexLatinusParser#functions_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcDeclBlock(CodexLatinusParser.ProcDeclBlockContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FunctionDecl}
	 * labeled alternative in {@link CodexLatinusParser#function_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDecl(CodexLatinusParser.FunctionDeclContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ProcedureDecl}
	 * labeled alternative in {@link CodexLatinusParser#procedure_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcedureDecl(CodexLatinusParser.ProcedureDeclContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FunctionBody}
	 * labeled alternative in {@link CodexLatinusParser#function_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionBody(CodexLatinusParser.FunctionBodyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ProcedureBody}
	 * labeled alternative in {@link CodexLatinusParser#procedure_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcedureBody(CodexLatinusParser.ProcedureBodyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LocalVariablesList}
	 * labeled alternative in {@link CodexLatinusParser#local_variable_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocalVariablesList(CodexLatinusParser.LocalVariablesListContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LocalSingleVariable}
	 * labeled alternative in {@link CodexLatinusParser#local_variable_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocalSingleVariable(CodexLatinusParser.LocalSingleVariableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LocalVarDeclaration}
	 * labeled alternative in {@link CodexLatinusParser#local_variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocalVarDeclaration(CodexLatinusParser.LocalVarDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FunctionArgsEmpty}
	 * labeled alternative in {@link CodexLatinusParser#function_arguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionArgsEmpty(CodexLatinusParser.FunctionArgsEmptyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FunctionSingleArg}
	 * labeled alternative in {@link CodexLatinusParser#function_arguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionSingleArg(CodexLatinusParser.FunctionSingleArgContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FunctionArgsList}
	 * labeled alternative in {@link CodexLatinusParser#function_arguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionArgsList(CodexLatinusParser.FunctionArgsListContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ArgumentDecl}
	 * labeled alternative in {@link CodexLatinusParser#argument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgumentDecl(CodexLatinusParser.ArgumentDeclContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ArgExprValue}
	 * labeled alternative in {@link CodexLatinusParser#start_value_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgExprValue(CodexLatinusParser.ArgExprValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ArgFuncCallValue}
	 * labeled alternative in {@link CodexLatinusParser#start_value_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgFuncCallValue(CodexLatinusParser.ArgFuncCallValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code RedefinitionFunctionVariable}
	 * labeled alternative in {@link CodexLatinusParser#redefine_local_variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRedefinitionFunctionVariable(CodexLatinusParser.RedefinitionFunctionVariableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MuneraCodeSection}
	 * labeled alternative in {@link CodexLatinusParser#munera_section}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMuneraCodeSection(CodexLatinusParser.MuneraCodeSectionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BlockControlList}
	 * labeled alternative in {@link CodexLatinusParser#code_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockControlList(CodexLatinusParser.BlockControlListContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BlockSingleControl}
	 * labeled alternative in {@link CodexLatinusParser#code_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockSingleControl(CodexLatinusParser.BlockSingleControlContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BlockCode}
	 * labeled alternative in {@link CodexLatinusParser#control_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockCode(CodexLatinusParser.BlockCodeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ConsoleActions}
	 * labeled alternative in {@link CodexLatinusParser#control_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConsoleActions(CodexLatinusParser.ConsoleActionsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FunctionSingleCall}
	 * labeled alternative in {@link CodexLatinusParser#control_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionSingleCall(CodexLatinusParser.FunctionSingleCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LoopControlAction}
	 * labeled alternative in {@link CodexLatinusParser#control_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoopControlAction(CodexLatinusParser.LoopControlActionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ReturnControlAction}
	 * labeled alternative in {@link CodexLatinusParser#control_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnControlAction(CodexLatinusParser.ReturnControlActionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LocalVariableRedefinied}
	 * labeled alternative in {@link CodexLatinusParser#control_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocalVariableRedefinied(CodexLatinusParser.LocalVariableRedefiniedContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ReturnWithValue}
	 * labeled alternative in {@link CodexLatinusParser#return_control}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnWithValue(CodexLatinusParser.ReturnWithValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ReturnVoid}
	 * labeled alternative in {@link CodexLatinusParser#return_control}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnVoid(CodexLatinusParser.ReturnVoidContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LoopContinue}
	 * labeled alternative in {@link CodexLatinusParser#loop_control}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoopContinue(CodexLatinusParser.LoopContinueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LoopBreak}
	 * labeled alternative in {@link CodexLatinusParser#loop_control}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoopBreak(CodexLatinusParser.LoopBreakContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ReadVarInput}
	 * labeled alternative in {@link CodexLatinusParser#console_actions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReadVarInput(CodexLatinusParser.ReadVarInputContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ReadInput}
	 * labeled alternative in {@link CodexLatinusParser#console_actions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReadInput(CodexLatinusParser.ReadInputContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PrintAction}
	 * labeled alternative in {@link CodexLatinusParser#console_actions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintAction(CodexLatinusParser.PrintActionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PrintSingleExpr}
	 * labeled alternative in {@link CodexLatinusParser#print_function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintSingleExpr(CodexLatinusParser.PrintSingleExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PrintMultipleExpr}
	 * labeled alternative in {@link CodexLatinusParser#print_function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintMultipleExpr(CodexLatinusParser.PrintMultipleExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CodeBlockIf}
	 * labeled alternative in {@link CodexLatinusParser#block_code}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCodeBlockIf(CodexLatinusParser.CodeBlockIfContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CodeBlockWhile}
	 * labeled alternative in {@link CodexLatinusParser#block_code}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCodeBlockWhile(CodexLatinusParser.CodeBlockWhileContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CodeBlockDoWhile}
	 * labeled alternative in {@link CodexLatinusParser#block_code}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCodeBlockDoWhile(CodexLatinusParser.CodeBlockDoWhileContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CodeBlockFor}
	 * labeled alternative in {@link CodexLatinusParser#block_code}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCodeBlockFor(CodexLatinusParser.CodeBlockForContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IfStatement}
	 * labeled alternative in {@link CodexLatinusParser#if_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(CodexLatinusParser.IfStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ElseIfEmpty}
	 * labeled alternative in {@link CodexLatinusParser#else_if_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseIfEmpty(CodexLatinusParser.ElseIfEmptyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ElseIfList}
	 * labeled alternative in {@link CodexLatinusParser#else_if_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseIfList(CodexLatinusParser.ElseIfListContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ElseIfClause}
	 * labeled alternative in {@link CodexLatinusParser#else_if_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseIfClause(CodexLatinusParser.ElseIfClauseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ElseBlock}
	 * labeled alternative in {@link CodexLatinusParser#else_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseBlock(CodexLatinusParser.ElseBlockContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ElseEmpty}
	 * labeled alternative in {@link CodexLatinusParser#else_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseEmpty(CodexLatinusParser.ElseEmptyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code WhileStatement}
	 * labeled alternative in {@link CodexLatinusParser#while_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStatement(CodexLatinusParser.WhileStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DoWhileStatement}
	 * labeled alternative in {@link CodexLatinusParser#do_while_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoWhileStatement(CodexLatinusParser.DoWhileStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ForStatement}
	 * labeled alternative in {@link CodexLatinusParser#for_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForStatement(CodexLatinusParser.ForStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ForInitVarDecl}
	 * labeled alternative in {@link CodexLatinusParser#for_init}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForInitVarDecl(CodexLatinusParser.ForInitVarDeclContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ForInitAssign}
	 * labeled alternative in {@link CodexLatinusParser#for_init}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForInitAssign(CodexLatinusParser.ForInitAssignContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ForUpdateIncrement}
	 * labeled alternative in {@link CodexLatinusParser#for_update}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForUpdateIncrement(CodexLatinusParser.ForUpdateIncrementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ForUpdateDecrement}
	 * labeled alternative in {@link CodexLatinusParser#for_update}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForUpdateDecrement(CodexLatinusParser.ForUpdateDecrementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ForUpdateAssign}
	 * labeled alternative in {@link CodexLatinusParser#for_update}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForUpdateAssign(CodexLatinusParser.ForUpdateAssignContext ctx);
	/**
	 * Visit a parse tree produced by the {@code VariablesSection}
	 * labeled alternative in {@link CodexLatinusParser#variable_section}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariablesSection(CodexLatinusParser.VariablesSectionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DeclarationsVariablesList}
	 * labeled alternative in {@link CodexLatinusParser#variabiles_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarationsVariablesList(CodexLatinusParser.DeclarationsVariablesListContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DeclarationsSingleVariable}
	 * labeled alternative in {@link CodexLatinusParser#variabiles_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarationsSingleVariable(CodexLatinusParser.DeclarationsSingleVariableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code VariableInstance}
	 * labeled alternative in {@link CodexLatinusParser#declarations}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableInstance(CodexLatinusParser.VariableInstanceContext ctx);
	/**
	 * Visit a parse tree produced by the {@code VariableUssage}
	 * labeled alternative in {@link CodexLatinusParser#declarations}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableUssage(CodexLatinusParser.VariableUssageContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BooleanVariableInstance}
	 * labeled alternative in {@link CodexLatinusParser#declarations}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanVariableInstance(CodexLatinusParser.BooleanVariableInstanceContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NormalArrayInstance}
	 * labeled alternative in {@link CodexLatinusParser#declarations}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNormalArrayInstance(CodexLatinusParser.NormalArrayInstanceContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BooleanArrayInstance}
	 * labeled alternative in {@link CodexLatinusParser#declarations}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanArrayInstance(CodexLatinusParser.BooleanArrayInstanceContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ArrayUssage}
	 * labeled alternative in {@link CodexLatinusParser#declarations}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayUssage(CodexLatinusParser.ArrayUssageContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StructDefinition}
	 * labeled alternative in {@link CodexLatinusParser#declarations}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStructDefinition(CodexLatinusParser.StructDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StructSetProperty}
	 * labeled alternative in {@link CodexLatinusParser#declarations}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStructSetProperty(CodexLatinusParser.StructSetPropertyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StructVariableInstance}
	 * labeled alternative in {@link CodexLatinusParser#declarations}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStructVariableInstance(CodexLatinusParser.StructVariableInstanceContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NormalVariableUsage}
	 * labeled alternative in {@link CodexLatinusParser#variable_ussage}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNormalVariableUsage(CodexLatinusParser.NormalVariableUsageContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NormalArrayUsage}
	 * labeled alternative in {@link CodexLatinusParser#array_ussage}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNormalArrayUsage(CodexLatinusParser.NormalArrayUsageContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StructArrayProperty}
	 * labeled alternative in {@link CodexLatinusParser#struct_array_property}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStructArrayProperty(CodexLatinusParser.StructArrayPropertyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StructInstance}
	 * labeled alternative in {@link CodexLatinusParser#struct_instance}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStructInstance(CodexLatinusParser.StructInstanceContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StructValueList}
	 * labeled alternative in {@link CodexLatinusParser#struct_data_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStructValueList(CodexLatinusParser.StructValueListContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StructSingleValue}
	 * labeled alternative in {@link CodexLatinusParser#struct_data_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStructSingleValue(CodexLatinusParser.StructSingleValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code VarDeclaration}
	 * labeled alternative in {@link CodexLatinusParser#variable_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDeclaration(CodexLatinusParser.VarDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BoolDeclaration}
	 * labeled alternative in {@link CodexLatinusParser#boolean_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolDeclaration(CodexLatinusParser.BoolDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NormalArrayDeclaration}
	 * labeled alternative in {@link CodexLatinusParser#normal_array}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNormalArrayDeclaration(CodexLatinusParser.NormalArrayDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BooleanArrayDeclaration}
	 * labeled alternative in {@link CodexLatinusParser#normal_array}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanArrayDeclaration(CodexLatinusParser.BooleanArrayDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BooleanArrayBase}
	 * labeled alternative in {@link CodexLatinusParser#boolean_array}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanArrayBase(CodexLatinusParser.BooleanArrayBaseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ArrayInitWithValues}
	 * labeled alternative in {@link CodexLatinusParser#array_initialization}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayInitWithValues(CodexLatinusParser.ArrayInitWithValuesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ArrayInitEmpty}
	 * labeled alternative in {@link CodexLatinusParser#array_initialization}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayInitEmpty(CodexLatinusParser.ArrayInitEmptyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ArraySingleValue}
	 * labeled alternative in {@link CodexLatinusParser#values_array_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArraySingleValue(CodexLatinusParser.ArraySingleValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ArrayValueList}
	 * labeled alternative in {@link CodexLatinusParser#values_array_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayValueList(CodexLatinusParser.ArrayValueListContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ArrayStructVal}
	 * labeled alternative in {@link CodexLatinusParser#array_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayStructVal(CodexLatinusParser.ArrayStructValContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ArrayNormalVal}
	 * labeled alternative in {@link CodexLatinusParser#array_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayNormalVal(CodexLatinusParser.ArrayNormalValContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StructDeclaration}
	 * labeled alternative in {@link CodexLatinusParser#struct_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStructDeclaration(CodexLatinusParser.StructDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StructSeparatedBody}
	 * labeled alternative in {@link CodexLatinusParser#struct_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStructSeparatedBody(CodexLatinusParser.StructSeparatedBodyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StructCommaBody}
	 * labeled alternative in {@link CodexLatinusParser#struct_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStructCommaBody(CodexLatinusParser.StructCommaBodyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StructNormalBodyList}
	 * labeled alternative in {@link CodexLatinusParser#struct_normal_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStructNormalBodyList(CodexLatinusParser.StructNormalBodyListContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StructNormalBodySingle}
	 * labeled alternative in {@link CodexLatinusParser#struct_normal_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStructNormalBodySingle(CodexLatinusParser.StructNormalBodySingleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StructCommaBodySingle}
	 * labeled alternative in {@link CodexLatinusParser#struct_comma_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStructCommaBodySingle(CodexLatinusParser.StructCommaBodySingleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StructCommaBodyList}
	 * labeled alternative in {@link CodexLatinusParser#struct_comma_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStructCommaBodyList(CodexLatinusParser.StructCommaBodyListContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NormalVariableStruct}
	 * labeled alternative in {@link CodexLatinusParser#struct_attribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNormalVariableStruct(CodexLatinusParser.NormalVariableStructContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BooleanVariableStruct}
	 * labeled alternative in {@link CodexLatinusParser#struct_attribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanVariableStruct(CodexLatinusParser.BooleanVariableStructContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ArrayVariableStruct}
	 * labeled alternative in {@link CodexLatinusParser#struct_attribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayVariableStruct(CodexLatinusParser.ArrayVariableStructContext ctx);
	/**
	 * Visit a parse tree produced by the {@code InternalStructNormalVariable}
	 * labeled alternative in {@link CodexLatinusParser#variable_without_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInternalStructNormalVariable(CodexLatinusParser.InternalStructNormalVariableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code InternalStructBoolVariable}
	 * labeled alternative in {@link CodexLatinusParser#boolean_variable_without_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInternalStructBoolVariable(CodexLatinusParser.InternalStructBoolVariableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code InternalStructArray}
	 * labeled alternative in {@link CodexLatinusParser#array_variable_struct}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInternalStructArray(CodexLatinusParser.InternalStructArrayContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StructDeclarationValue}
	 * labeled alternative in {@link CodexLatinusParser#struct_data_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStructDeclarationValue(CodexLatinusParser.StructDeclarationValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExpressionGreaterEqual}
	 * labeled alternative in {@link CodexLatinusParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionGreaterEqual(CodexLatinusParser.ExpressionGreaterEqualContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExpressionMult}
	 * labeled alternative in {@link CodexLatinusParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionMult(CodexLatinusParser.ExpressionMultContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExpressionLessThan}
	 * labeled alternative in {@link CodexLatinusParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionLessThan(CodexLatinusParser.ExpressionLessThanContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExpressionMinus}
	 * labeled alternative in {@link CodexLatinusParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionMinus(CodexLatinusParser.ExpressionMinusContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExpressionLessEqual}
	 * labeled alternative in {@link CodexLatinusParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionLessEqual(CodexLatinusParser.ExpressionLessEqualContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExpressionNegate}
	 * labeled alternative in {@link CodexLatinusParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionNegate(CodexLatinusParser.ExpressionNegateContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExpressionNotEquals}
	 * labeled alternative in {@link CodexLatinusParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionNotEquals(CodexLatinusParser.ExpressionNotEqualsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExpressionParents}
	 * labeled alternative in {@link CodexLatinusParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionParents(CodexLatinusParser.ExpressionParentsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExpressionDiv}
	 * labeled alternative in {@link CodexLatinusParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionDiv(CodexLatinusParser.ExpressionDivContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExpressionNot}
	 * labeled alternative in {@link CodexLatinusParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionNot(CodexLatinusParser.ExpressionNotContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExpressionValue}
	 * labeled alternative in {@link CodexLatinusParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionValue(CodexLatinusParser.ExpressionValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExpressionAnd}
	 * labeled alternative in {@link CodexLatinusParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionAnd(CodexLatinusParser.ExpressionAndContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExpressionOr}
	 * labeled alternative in {@link CodexLatinusParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionOr(CodexLatinusParser.ExpressionOrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExpressionGreaterThan}
	 * labeled alternative in {@link CodexLatinusParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionGreaterThan(CodexLatinusParser.ExpressionGreaterThanContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExpressionEquals}
	 * labeled alternative in {@link CodexLatinusParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionEquals(CodexLatinusParser.ExpressionEqualsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExpressionPlus}
	 * labeled alternative in {@link CodexLatinusParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionPlus(CodexLatinusParser.ExpressionPlusContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TypeText}
	 * labeled alternative in {@link CodexLatinusParser#variable_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeText(CodexLatinusParser.TypeTextContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TypeInt}
	 * labeled alternative in {@link CodexLatinusParser#variable_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeInt(CodexLatinusParser.TypeIntContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TypeDecimal}
	 * labeled alternative in {@link CodexLatinusParser#variable_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeDecimal(CodexLatinusParser.TypeDecimalContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TypeChar}
	 * labeled alternative in {@link CodexLatinusParser#variable_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeChar(CodexLatinusParser.TypeCharContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TypeCustomId}
	 * labeled alternative in {@link CodexLatinusParser#variable_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeCustomId(CodexLatinusParser.TypeCustomIdContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ArrayCall}
	 * labeled alternative in {@link CodexLatinusParser#array_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayCall(CodexLatinusParser.ArrayCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StructValueLiteral}
	 * labeled alternative in {@link CodexLatinusParser#struct_values}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStructValueLiteral(CodexLatinusParser.StructValueLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FunctionCalling}
	 * labeled alternative in {@link CodexLatinusParser#function_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCalling(CodexLatinusParser.FunctionCallingContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ArgumentSingleFunction}
	 * labeled alternative in {@link CodexLatinusParser#arguments_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgumentSingleFunction(CodexLatinusParser.ArgumentSingleFunctionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ArgumentFunctionList}
	 * labeled alternative in {@link CodexLatinusParser#arguments_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgumentFunctionList(CodexLatinusParser.ArgumentFunctionListContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ValString}
	 * labeled alternative in {@link CodexLatinusParser#normal_values}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValString(CodexLatinusParser.ValStringContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ValChar}
	 * labeled alternative in {@link CodexLatinusParser#normal_values}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValChar(CodexLatinusParser.ValCharContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ValId}
	 * labeled alternative in {@link CodexLatinusParser#normal_values}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValId(CodexLatinusParser.ValIdContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ValDecimal}
	 * labeled alternative in {@link CodexLatinusParser#normal_values}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValDecimal(CodexLatinusParser.ValDecimalContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ValInt}
	 * labeled alternative in {@link CodexLatinusParser#normal_values}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValInt(CodexLatinusParser.ValIntContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ValBool}
	 * labeled alternative in {@link CodexLatinusParser#normal_values}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValBool(CodexLatinusParser.ValBoolContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ValIdCall}
	 * labeled alternative in {@link CodexLatinusParser#normal_values}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValIdCall(CodexLatinusParser.ValIdCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ValFunctionCall}
	 * labeled alternative in {@link CodexLatinusParser#normal_values}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValFunctionCall(CodexLatinusParser.ValFunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BoolTrue}
	 * labeled alternative in {@link CodexLatinusParser#boolean_values}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolTrue(CodexLatinusParser.BoolTrueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BoolFalse}
	 * labeled alternative in {@link CodexLatinusParser#boolean_values}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolFalse(CodexLatinusParser.BoolFalseContext ctx);
}