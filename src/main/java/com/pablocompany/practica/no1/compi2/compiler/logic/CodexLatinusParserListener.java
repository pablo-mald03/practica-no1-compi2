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
	 * Enter a parse tree produced by the {@code MuneraSection}
	 * labeled alternative in {@link CodexLatinusParser#munera_section}.
	 * @param ctx the parse tree
	 */
	void enterMuneraSection(CodexLatinusParser.MuneraSectionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MuneraSection}
	 * labeled alternative in {@link CodexLatinusParser#munera_section}.
	 * @param ctx the parse tree
	 */
	void exitMuneraSection(CodexLatinusParser.MuneraSectionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FunctionsBlockList}
	 * labeled alternative in {@link CodexLatinusParser#munera_body}.
	 * @param ctx the parse tree
	 */
	void enterFunctionsBlockList(CodexLatinusParser.FunctionsBlockListContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FunctionsBlockList}
	 * labeled alternative in {@link CodexLatinusParser#munera_body}.
	 * @param ctx the parse tree
	 */
	void exitFunctionsBlockList(CodexLatinusParser.FunctionsBlockListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FunctionsSingleBlock}
	 * labeled alternative in {@link CodexLatinusParser#munera_body}.
	 * @param ctx the parse tree
	 */
	void enterFunctionsSingleBlock(CodexLatinusParser.FunctionsSingleBlockContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FunctionsSingleBlock}
	 * labeled alternative in {@link CodexLatinusParser#munera_body}.
	 * @param ctx the parse tree
	 */
	void exitFunctionsSingleBlock(CodexLatinusParser.FunctionsSingleBlockContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FuncDeclBlock}
	 * labeled alternative in {@link CodexLatinusParser#functions_block}.
	 * @param ctx the parse tree
	 */
	void enterFuncDeclBlock(CodexLatinusParser.FuncDeclBlockContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FuncDeclBlock}
	 * labeled alternative in {@link CodexLatinusParser#functions_block}.
	 * @param ctx the parse tree
	 */
	void exitFuncDeclBlock(CodexLatinusParser.FuncDeclBlockContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ProcDeclBlock}
	 * labeled alternative in {@link CodexLatinusParser#functions_block}.
	 * @param ctx the parse tree
	 */
	void enterProcDeclBlock(CodexLatinusParser.ProcDeclBlockContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ProcDeclBlock}
	 * labeled alternative in {@link CodexLatinusParser#functions_block}.
	 * @param ctx the parse tree
	 */
	void exitProcDeclBlock(CodexLatinusParser.ProcDeclBlockContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FunctionDeclaration}
	 * labeled alternative in {@link CodexLatinusParser#function_declaration}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDeclaration(CodexLatinusParser.FunctionDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FunctionDeclaration}
	 * labeled alternative in {@link CodexLatinusParser#function_declaration}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDeclaration(CodexLatinusParser.FunctionDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FunctionReturNormalType}
	 * labeled alternative in {@link CodexLatinusParser#variable_function_type}.
	 * @param ctx the parse tree
	 */
	void enterFunctionReturNormalType(CodexLatinusParser.FunctionReturNormalTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FunctionReturNormalType}
	 * labeled alternative in {@link CodexLatinusParser#variable_function_type}.
	 * @param ctx the parse tree
	 */
	void exitFunctionReturNormalType(CodexLatinusParser.FunctionReturNormalTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FunctionReturBooleanType}
	 * labeled alternative in {@link CodexLatinusParser#variable_function_type}.
	 * @param ctx the parse tree
	 */
	void enterFunctionReturBooleanType(CodexLatinusParser.FunctionReturBooleanTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FunctionReturBooleanType}
	 * labeled alternative in {@link CodexLatinusParser#variable_function_type}.
	 * @param ctx the parse tree
	 */
	void exitFunctionReturBooleanType(CodexLatinusParser.FunctionReturBooleanTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ProcedureDeclaration}
	 * labeled alternative in {@link CodexLatinusParser#procedure_declaration}.
	 * @param ctx the parse tree
	 */
	void enterProcedureDeclaration(CodexLatinusParser.ProcedureDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ProcedureDeclaration}
	 * labeled alternative in {@link CodexLatinusParser#procedure_declaration}.
	 * @param ctx the parse tree
	 */
	void exitProcedureDeclaration(CodexLatinusParser.ProcedureDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FunctionBody}
	 * labeled alternative in {@link CodexLatinusParser#function_body}.
	 * @param ctx the parse tree
	 */
	void enterFunctionBody(CodexLatinusParser.FunctionBodyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FunctionBody}
	 * labeled alternative in {@link CodexLatinusParser#function_body}.
	 * @param ctx the parse tree
	 */
	void exitFunctionBody(CodexLatinusParser.FunctionBodyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ProcedureBody}
	 * labeled alternative in {@link CodexLatinusParser#procedure_body}.
	 * @param ctx the parse tree
	 */
	void enterProcedureBody(CodexLatinusParser.ProcedureBodyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ProcedureBody}
	 * labeled alternative in {@link CodexLatinusParser#procedure_body}.
	 * @param ctx the parse tree
	 */
	void exitProcedureBody(CodexLatinusParser.ProcedureBodyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LocalVariablesList}
	 * labeled alternative in {@link CodexLatinusParser#local_variable_list}.
	 * @param ctx the parse tree
	 */
	void enterLocalVariablesList(CodexLatinusParser.LocalVariablesListContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LocalVariablesList}
	 * labeled alternative in {@link CodexLatinusParser#local_variable_list}.
	 * @param ctx the parse tree
	 */
	void exitLocalVariablesList(CodexLatinusParser.LocalVariablesListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LocalSingleVariable}
	 * labeled alternative in {@link CodexLatinusParser#local_variable_list}.
	 * @param ctx the parse tree
	 */
	void enterLocalSingleVariable(CodexLatinusParser.LocalSingleVariableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LocalSingleVariable}
	 * labeled alternative in {@link CodexLatinusParser#local_variable_list}.
	 * @param ctx the parse tree
	 */
	void exitLocalSingleVariable(CodexLatinusParser.LocalSingleVariableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LocalVarDeclaration}
	 * labeled alternative in {@link CodexLatinusParser#local_variable}.
	 * @param ctx the parse tree
	 */
	void enterLocalVarDeclaration(CodexLatinusParser.LocalVarDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LocalVarDeclaration}
	 * labeled alternative in {@link CodexLatinusParser#local_variable}.
	 * @param ctx the parse tree
	 */
	void exitLocalVarDeclaration(CodexLatinusParser.LocalVarDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LocalBoolVarDeclaration}
	 * labeled alternative in {@link CodexLatinusParser#local_variable}.
	 * @param ctx the parse tree
	 */
	void enterLocalBoolVarDeclaration(CodexLatinusParser.LocalBoolVarDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LocalBoolVarDeclaration}
	 * labeled alternative in {@link CodexLatinusParser#local_variable}.
	 * @param ctx the parse tree
	 */
	void exitLocalBoolVarDeclaration(CodexLatinusParser.LocalBoolVarDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LocalArrayDeclaration}
	 * labeled alternative in {@link CodexLatinusParser#local_variable}.
	 * @param ctx the parse tree
	 */
	void enterLocalArrayDeclaration(CodexLatinusParser.LocalArrayDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LocalArrayDeclaration}
	 * labeled alternative in {@link CodexLatinusParser#local_variable}.
	 * @param ctx the parse tree
	 */
	void exitLocalArrayDeclaration(CodexLatinusParser.LocalArrayDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LocalBoolArrayDeclaration}
	 * labeled alternative in {@link CodexLatinusParser#local_variable}.
	 * @param ctx the parse tree
	 */
	void enterLocalBoolArrayDeclaration(CodexLatinusParser.LocalBoolArrayDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LocalBoolArrayDeclaration}
	 * labeled alternative in {@link CodexLatinusParser#local_variable}.
	 * @param ctx the parse tree
	 */
	void exitLocalBoolArrayDeclaration(CodexLatinusParser.LocalBoolArrayDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LocalStructInstance}
	 * labeled alternative in {@link CodexLatinusParser#local_variable}.
	 * @param ctx the parse tree
	 */
	void enterLocalStructInstance(CodexLatinusParser.LocalStructInstanceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LocalStructInstance}
	 * labeled alternative in {@link CodexLatinusParser#local_variable}.
	 * @param ctx the parse tree
	 */
	void exitLocalStructInstance(CodexLatinusParser.LocalStructInstanceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FunctionSingleArg}
	 * labeled alternative in {@link CodexLatinusParser#function_arguments}.
	 * @param ctx the parse tree
	 */
	void enterFunctionSingleArg(CodexLatinusParser.FunctionSingleArgContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FunctionSingleArg}
	 * labeled alternative in {@link CodexLatinusParser#function_arguments}.
	 * @param ctx the parse tree
	 */
	void exitFunctionSingleArg(CodexLatinusParser.FunctionSingleArgContext ctx);
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
	 * Enter a parse tree produced by the {@code ArgumentVariableDeclaration}
	 * labeled alternative in {@link CodexLatinusParser#argument}.
	 * @param ctx the parse tree
	 */
	void enterArgumentVariableDeclaration(CodexLatinusParser.ArgumentVariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArgumentVariableDeclaration}
	 * labeled alternative in {@link CodexLatinusParser#argument}.
	 * @param ctx the parse tree
	 */
	void exitArgumentVariableDeclaration(CodexLatinusParser.ArgumentVariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArgumentArrayDeclarationn}
	 * labeled alternative in {@link CodexLatinusParser#argument}.
	 * @param ctx the parse tree
	 */
	void enterArgumentArrayDeclarationn(CodexLatinusParser.ArgumentArrayDeclarationnContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArgumentArrayDeclarationn}
	 * labeled alternative in {@link CodexLatinusParser#argument}.
	 * @param ctx the parse tree
	 */
	void exitArgumentArrayDeclarationn(CodexLatinusParser.ArgumentArrayDeclarationnContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArgumentNormalDeclaration}
	 * labeled alternative in {@link CodexLatinusParser#argument_variable_type}.
	 * @param ctx the parse tree
	 */
	void enterArgumentNormalDeclaration(CodexLatinusParser.ArgumentNormalDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArgumentNormalDeclaration}
	 * labeled alternative in {@link CodexLatinusParser#argument_variable_type}.
	 * @param ctx the parse tree
	 */
	void exitArgumentNormalDeclaration(CodexLatinusParser.ArgumentNormalDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArgumentBooleanDeclaration}
	 * labeled alternative in {@link CodexLatinusParser#argument_variable_type}.
	 * @param ctx the parse tree
	 */
	void enterArgumentBooleanDeclaration(CodexLatinusParser.ArgumentBooleanDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArgumentBooleanDeclaration}
	 * labeled alternative in {@link CodexLatinusParser#argument_variable_type}.
	 * @param ctx the parse tree
	 */
	void exitArgumentBooleanDeclaration(CodexLatinusParser.ArgumentBooleanDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArgumentArrayNormalDeclaration}
	 * labeled alternative in {@link CodexLatinusParser#argument_series_type}.
	 * @param ctx the parse tree
	 */
	void enterArgumentArrayNormalDeclaration(CodexLatinusParser.ArgumentArrayNormalDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArgumentArrayNormalDeclaration}
	 * labeled alternative in {@link CodexLatinusParser#argument_series_type}.
	 * @param ctx the parse tree
	 */
	void exitArgumentArrayNormalDeclaration(CodexLatinusParser.ArgumentArrayNormalDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArgumentArrayBooleanDeclaration}
	 * labeled alternative in {@link CodexLatinusParser#argument_series_type}.
	 * @param ctx the parse tree
	 */
	void enterArgumentArrayBooleanDeclaration(CodexLatinusParser.ArgumentArrayBooleanDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArgumentArrayBooleanDeclaration}
	 * labeled alternative in {@link CodexLatinusParser#argument_series_type}.
	 * @param ctx the parse tree
	 */
	void exitArgumentArrayBooleanDeclaration(CodexLatinusParser.ArgumentArrayBooleanDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MuneraCodeSection}
	 * labeled alternative in {@link CodexLatinusParser#maior_section}.
	 * @param ctx the parse tree
	 */
	void enterMuneraCodeSection(CodexLatinusParser.MuneraCodeSectionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MuneraCodeSection}
	 * labeled alternative in {@link CodexLatinusParser#maior_section}.
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
	 * Enter a parse tree produced by the {@code FunctionSingleCall}
	 * labeled alternative in {@link CodexLatinusParser#control_block}.
	 * @param ctx the parse tree
	 */
	void enterFunctionSingleCall(CodexLatinusParser.FunctionSingleCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FunctionSingleCall}
	 * labeled alternative in {@link CodexLatinusParser#control_block}.
	 * @param ctx the parse tree
	 */
	void exitFunctionSingleCall(CodexLatinusParser.FunctionSingleCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LoopControlAction}
	 * labeled alternative in {@link CodexLatinusParser#control_block}.
	 * @param ctx the parse tree
	 */
	void enterLoopControlAction(CodexLatinusParser.LoopControlActionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LoopControlAction}
	 * labeled alternative in {@link CodexLatinusParser#control_block}.
	 * @param ctx the parse tree
	 */
	void exitLoopControlAction(CodexLatinusParser.LoopControlActionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ReturnControlAction}
	 * labeled alternative in {@link CodexLatinusParser#control_block}.
	 * @param ctx the parse tree
	 */
	void enterReturnControlAction(CodexLatinusParser.ReturnControlActionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ReturnControlAction}
	 * labeled alternative in {@link CodexLatinusParser#control_block}.
	 * @param ctx the parse tree
	 */
	void exitReturnControlAction(CodexLatinusParser.ReturnControlActionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LocalAbbreviatedOperation}
	 * labeled alternative in {@link CodexLatinusParser#control_block}.
	 * @param ctx the parse tree
	 */
	void enterLocalAbbreviatedOperation(CodexLatinusParser.LocalAbbreviatedOperationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LocalAbbreviatedOperation}
	 * labeled alternative in {@link CodexLatinusParser#control_block}.
	 * @param ctx the parse tree
	 */
	void exitLocalAbbreviatedOperation(CodexLatinusParser.LocalAbbreviatedOperationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LocalVariableRedefinition}
	 * labeled alternative in {@link CodexLatinusParser#control_block}.
	 * @param ctx the parse tree
	 */
	void enterLocalVariableRedefinition(CodexLatinusParser.LocalVariableRedefinitionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LocalVariableRedefinition}
	 * labeled alternative in {@link CodexLatinusParser#control_block}.
	 * @param ctx the parse tree
	 */
	void exitLocalVariableRedefinition(CodexLatinusParser.LocalVariableRedefinitionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LocalArrayRedefinedUssage}
	 * labeled alternative in {@link CodexLatinusParser#control_block}.
	 * @param ctx the parse tree
	 */
	void enterLocalArrayRedefinedUssage(CodexLatinusParser.LocalArrayRedefinedUssageContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LocalArrayRedefinedUssage}
	 * labeled alternative in {@link CodexLatinusParser#control_block}.
	 * @param ctx the parse tree
	 */
	void exitLocalArrayRedefinedUssage(CodexLatinusParser.LocalArrayRedefinedUssageContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LocalNestedVariableUsage}
	 * labeled alternative in {@link CodexLatinusParser#control_block}.
	 * @param ctx the parse tree
	 */
	void enterLocalNestedVariableUsage(CodexLatinusParser.LocalNestedVariableUsageContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LocalNestedVariableUsage}
	 * labeled alternative in {@link CodexLatinusParser#control_block}.
	 * @param ctx the parse tree
	 */
	void exitLocalNestedVariableUsage(CodexLatinusParser.LocalNestedVariableUsageContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ReturnWithValue}
	 * labeled alternative in {@link CodexLatinusParser#return_control}.
	 * @param ctx the parse tree
	 */
	void enterReturnWithValue(CodexLatinusParser.ReturnWithValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ReturnWithValue}
	 * labeled alternative in {@link CodexLatinusParser#return_control}.
	 * @param ctx the parse tree
	 */
	void exitReturnWithValue(CodexLatinusParser.ReturnWithValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ReturnVoid}
	 * labeled alternative in {@link CodexLatinusParser#return_control}.
	 * @param ctx the parse tree
	 */
	void enterReturnVoid(CodexLatinusParser.ReturnVoidContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ReturnVoid}
	 * labeled alternative in {@link CodexLatinusParser#return_control}.
	 * @param ctx the parse tree
	 */
	void exitReturnVoid(CodexLatinusParser.ReturnVoidContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LoopContinue}
	 * labeled alternative in {@link CodexLatinusParser#loop_control}.
	 * @param ctx the parse tree
	 */
	void enterLoopContinue(CodexLatinusParser.LoopContinueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LoopContinue}
	 * labeled alternative in {@link CodexLatinusParser#loop_control}.
	 * @param ctx the parse tree
	 */
	void exitLoopContinue(CodexLatinusParser.LoopContinueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LoopBreak}
	 * labeled alternative in {@link CodexLatinusParser#loop_control}.
	 * @param ctx the parse tree
	 */
	void enterLoopBreak(CodexLatinusParser.LoopBreakContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LoopBreak}
	 * labeled alternative in {@link CodexLatinusParser#loop_control}.
	 * @param ctx the parse tree
	 */
	void exitLoopBreak(CodexLatinusParser.LoopBreakContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ReadVariableInput}
	 * labeled alternative in {@link CodexLatinusParser#console_actions}.
	 * @param ctx the parse tree
	 */
	void enterReadVariableInput(CodexLatinusParser.ReadVariableInputContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ReadVariableInput}
	 * labeled alternative in {@link CodexLatinusParser#console_actions}.
	 * @param ctx the parse tree
	 */
	void exitReadVariableInput(CodexLatinusParser.ReadVariableInputContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ReadInput}
	 * labeled alternative in {@link CodexLatinusParser#console_actions}.
	 * @param ctx the parse tree
	 */
	void enterReadInput(CodexLatinusParser.ReadInputContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ReadInput}
	 * labeled alternative in {@link CodexLatinusParser#console_actions}.
	 * @param ctx the parse tree
	 */
	void exitReadInput(CodexLatinusParser.ReadInputContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PrintAction}
	 * labeled alternative in {@link CodexLatinusParser#console_actions}.
	 * @param ctx the parse tree
	 */
	void enterPrintAction(CodexLatinusParser.PrintActionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PrintAction}
	 * labeled alternative in {@link CodexLatinusParser#console_actions}.
	 * @param ctx the parse tree
	 */
	void exitPrintAction(CodexLatinusParser.PrintActionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PrintSingleExpr}
	 * labeled alternative in {@link CodexLatinusParser#print_function}.
	 * @param ctx the parse tree
	 */
	void enterPrintSingleExpr(CodexLatinusParser.PrintSingleExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PrintSingleExpr}
	 * labeled alternative in {@link CodexLatinusParser#print_function}.
	 * @param ctx the parse tree
	 */
	void exitPrintSingleExpr(CodexLatinusParser.PrintSingleExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PrintMultipleExpr}
	 * labeled alternative in {@link CodexLatinusParser#print_function}.
	 * @param ctx the parse tree
	 */
	void enterPrintMultipleExpr(CodexLatinusParser.PrintMultipleExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PrintMultipleExpr}
	 * labeled alternative in {@link CodexLatinusParser#print_function}.
	 * @param ctx the parse tree
	 */
	void exitPrintMultipleExpr(CodexLatinusParser.PrintMultipleExprContext ctx);
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
	 * Enter a parse tree produced by the {@code ElseIfSingle}
	 * labeled alternative in {@link CodexLatinusParser#else_if_list}.
	 * @param ctx the parse tree
	 */
	void enterElseIfSingle(CodexLatinusParser.ElseIfSingleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ElseIfSingle}
	 * labeled alternative in {@link CodexLatinusParser#else_if_list}.
	 * @param ctx the parse tree
	 */
	void exitElseIfSingle(CodexLatinusParser.ElseIfSingleContext ctx);
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
	 * Enter a parse tree produced by the {@code ForInitVarDecl}
	 * labeled alternative in {@link CodexLatinusParser#for_init}.
	 * @param ctx the parse tree
	 */
	void enterForInitVarDecl(CodexLatinusParser.ForInitVarDeclContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ForInitVarDecl}
	 * labeled alternative in {@link CodexLatinusParser#for_init}.
	 * @param ctx the parse tree
	 */
	void exitForInitVarDecl(CodexLatinusParser.ForInitVarDeclContext ctx);
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
	 * Enter a parse tree produced by the {@code VariableRedefinedUssage}
	 * labeled alternative in {@link CodexLatinusParser#declarations}.
	 * @param ctx the parse tree
	 */
	void enterVariableRedefinedUssage(CodexLatinusParser.VariableRedefinedUssageContext ctx);
	/**
	 * Exit a parse tree produced by the {@code VariableRedefinedUssage}
	 * labeled alternative in {@link CodexLatinusParser#declarations}.
	 * @param ctx the parse tree
	 */
	void exitVariableRedefinedUssage(CodexLatinusParser.VariableRedefinedUssageContext ctx);
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
	 * Enter a parse tree produced by the {@code ArrayRedefinedUssage}
	 * labeled alternative in {@link CodexLatinusParser#declarations}.
	 * @param ctx the parse tree
	 */
	void enterArrayRedefinedUssage(CodexLatinusParser.ArrayRedefinedUssageContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArrayRedefinedUssage}
	 * labeled alternative in {@link CodexLatinusParser#declarations}.
	 * @param ctx the parse tree
	 */
	void exitArrayRedefinedUssage(CodexLatinusParser.ArrayRedefinedUssageContext ctx);
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
	 * Enter a parse tree produced by the {@code GlobalAbbreviatedOperation}
	 * labeled alternative in {@link CodexLatinusParser#declarations}.
	 * @param ctx the parse tree
	 */
	void enterGlobalAbbreviatedOperation(CodexLatinusParser.GlobalAbbreviatedOperationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code GlobalAbbreviatedOperation}
	 * labeled alternative in {@link CodexLatinusParser#declarations}.
	 * @param ctx the parse tree
	 */
	void exitGlobalAbbreviatedOperation(CodexLatinusParser.GlobalAbbreviatedOperationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code GlobalNestedVariableUsage}
	 * labeled alternative in {@link CodexLatinusParser#declarations}.
	 * @param ctx the parse tree
	 */
	void enterGlobalNestedVariableUsage(CodexLatinusParser.GlobalNestedVariableUsageContext ctx);
	/**
	 * Exit a parse tree produced by the {@code GlobalNestedVariableUsage}
	 * labeled alternative in {@link CodexLatinusParser#declarations}.
	 * @param ctx the parse tree
	 */
	void exitGlobalNestedVariableUsage(CodexLatinusParser.GlobalNestedVariableUsageContext ctx);
	/**
	 * Enter a parse tree produced by the {@code RedefiniedVariableUssage}
	 * labeled alternative in {@link CodexLatinusParser#array_redefined_ussage}.
	 * @param ctx the parse tree
	 */
	void enterRedefiniedVariableUssage(CodexLatinusParser.RedefiniedVariableUssageContext ctx);
	/**
	 * Exit a parse tree produced by the {@code RedefiniedVariableUssage}
	 * labeled alternative in {@link CodexLatinusParser#array_redefined_ussage}.
	 * @param ctx the parse tree
	 */
	void exitRedefiniedVariableUssage(CodexLatinusParser.RedefiniedVariableUssageContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NormalVariableRedefiniedUsage}
	 * labeled alternative in {@link CodexLatinusParser#variable_ussage}.
	 * @param ctx the parse tree
	 */
	void enterNormalVariableRedefiniedUsage(CodexLatinusParser.NormalVariableRedefiniedUsageContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NormalVariableRedefiniedUsage}
	 * labeled alternative in {@link CodexLatinusParser#variable_ussage}.
	 * @param ctx the parse tree
	 */
	void exitNormalVariableRedefiniedUsage(CodexLatinusParser.NormalVariableRedefiniedUsageContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NestedStructRedefiniedValue}
	 * labeled alternative in {@link CodexLatinusParser#nested_variables_usage}.
	 * @param ctx the parse tree
	 */
	void enterNestedStructRedefiniedValue(CodexLatinusParser.NestedStructRedefiniedValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NestedStructRedefiniedValue}
	 * labeled alternative in {@link CodexLatinusParser#nested_variables_usage}.
	 * @param ctx the parse tree
	 */
	void exitNestedStructRedefiniedValue(CodexLatinusParser.NestedStructRedefiniedValueContext ctx);
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
	 * Enter a parse tree produced by the {@code VariableDeclaration}
	 * labeled alternative in {@link CodexLatinusParser#variable_declaration}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaration(CodexLatinusParser.VariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code VariableDeclaration}
	 * labeled alternative in {@link CodexLatinusParser#variable_declaration}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaration(CodexLatinusParser.VariableDeclarationContext ctx);
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
	 * labeled alternative in {@link CodexLatinusParser#normal_array_declaration}.
	 * @param ctx the parse tree
	 */
	void enterNormalArrayDeclaration(CodexLatinusParser.NormalArrayDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NormalArrayDeclaration}
	 * labeled alternative in {@link CodexLatinusParser#normal_array_declaration}.
	 * @param ctx the parse tree
	 */
	void exitNormalArrayDeclaration(CodexLatinusParser.NormalArrayDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BooleanArrayBase}
	 * labeled alternative in {@link CodexLatinusParser#boolean_array_declaration}.
	 * @param ctx the parse tree
	 */
	void enterBooleanArrayBase(CodexLatinusParser.BooleanArrayBaseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BooleanArrayBase}
	 * labeled alternative in {@link CodexLatinusParser#boolean_array_declaration}.
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
	 * Enter a parse tree produced by the {@code ArrayNormalValue}
	 * labeled alternative in {@link CodexLatinusParser#array_value}.
	 * @param ctx the parse tree
	 */
	void enterArrayNormalValue(CodexLatinusParser.ArrayNormalValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArrayNormalValue}
	 * labeled alternative in {@link CodexLatinusParser#array_value}.
	 * @param ctx the parse tree
	 */
	void exitArrayNormalValue(CodexLatinusParser.ArrayNormalValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StructBaseProperty}
	 * labeled alternative in {@link CodexLatinusParser#struct_values}.
	 * @param ctx the parse tree
	 */
	void enterStructBaseProperty(CodexLatinusParser.StructBasePropertyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StructBaseProperty}
	 * labeled alternative in {@link CodexLatinusParser#struct_values}.
	 * @param ctx the parse tree
	 */
	void exitStructBaseProperty(CodexLatinusParser.StructBasePropertyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StructArrayAccessChain}
	 * labeled alternative in {@link CodexLatinusParser#struct_values}.
	 * @param ctx the parse tree
	 */
	void enterStructArrayAccessChain(CodexLatinusParser.StructArrayAccessChainContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StructArrayAccessChain}
	 * labeled alternative in {@link CodexLatinusParser#struct_values}.
	 * @param ctx the parse tree
	 */
	void exitStructArrayAccessChain(CodexLatinusParser.StructArrayAccessChainContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StructBaseArrayProperty}
	 * labeled alternative in {@link CodexLatinusParser#struct_values}.
	 * @param ctx the parse tree
	 */
	void enterStructBaseArrayProperty(CodexLatinusParser.StructBaseArrayPropertyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StructBaseArrayProperty}
	 * labeled alternative in {@link CodexLatinusParser#struct_values}.
	 * @param ctx the parse tree
	 */
	void exitStructBaseArrayProperty(CodexLatinusParser.StructBaseArrayPropertyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StructPropertyChain}
	 * labeled alternative in {@link CodexLatinusParser#struct_values}.
	 * @param ctx the parse tree
	 */
	void enterStructPropertyChain(CodexLatinusParser.StructPropertyChainContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StructPropertyChain}
	 * labeled alternative in {@link CodexLatinusParser#struct_values}.
	 * @param ctx the parse tree
	 */
	void exitStructPropertyChain(CodexLatinusParser.StructPropertyChainContext ctx);
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
	 * Enter a parse tree produced by the {@code StructLiteralValue}
	 * labeled alternative in {@link CodexLatinusParser#struct_literal}.
	 * @param ctx the parse tree
	 */
	void enterStructLiteralValue(CodexLatinusParser.StructLiteralValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StructLiteralValue}
	 * labeled alternative in {@link CodexLatinusParser#struct_literal}.
	 * @param ctx the parse tree
	 */
	void exitStructLiteralValue(CodexLatinusParser.StructLiteralValueContext ctx);
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
	 * Enter a parse tree produced by the {@code StructDataNormal}
	 * labeled alternative in {@link CodexLatinusParser#struct_data_value}.
	 * @param ctx the parse tree
	 */
	void enterStructDataNormal(CodexLatinusParser.StructDataNormalContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StructDataNormal}
	 * labeled alternative in {@link CodexLatinusParser#struct_data_value}.
	 * @param ctx the parse tree
	 */
	void exitStructDataNormal(CodexLatinusParser.StructDataNormalContext ctx);
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
	 * Enter a parse tree produced by the {@code ExpressionUnary}
	 * labeled alternative in {@link CodexLatinusParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpressionUnary(CodexLatinusParser.ExpressionUnaryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExpressionUnary}
	 * labeled alternative in {@link CodexLatinusParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpressionUnary(CodexLatinusParser.ExpressionUnaryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExpressionEquality}
	 * labeled alternative in {@link CodexLatinusParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpressionEquality(CodexLatinusParser.ExpressionEqualityContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExpressionEquality}
	 * labeled alternative in {@link CodexLatinusParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpressionEquality(CodexLatinusParser.ExpressionEqualityContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExpressionRelational}
	 * labeled alternative in {@link CodexLatinusParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpressionRelational(CodexLatinusParser.ExpressionRelationalContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExpressionRelational}
	 * labeled alternative in {@link CodexLatinusParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpressionRelational(CodexLatinusParser.ExpressionRelationalContext ctx);
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
	 * Enter a parse tree produced by the {@code ExpressionMultDiv}
	 * labeled alternative in {@link CodexLatinusParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpressionMultDiv(CodexLatinusParser.ExpressionMultDivContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExpressionMultDiv}
	 * labeled alternative in {@link CodexLatinusParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpressionMultDiv(CodexLatinusParser.ExpressionMultDivContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExpressionAddSub}
	 * labeled alternative in {@link CodexLatinusParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpressionAddSub(CodexLatinusParser.ExpressionAddSubContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExpressionAddSub}
	 * labeled alternative in {@link CodexLatinusParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpressionAddSub(CodexLatinusParser.ExpressionAddSubContext ctx);
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
	 * Enter a parse tree produced by the {@code TypeBoolean}
	 * labeled alternative in {@link CodexLatinusParser#variable_type}.
	 * @param ctx the parse tree
	 */
	void enterTypeBoolean(CodexLatinusParser.TypeBooleanContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TypeBoolean}
	 * labeled alternative in {@link CodexLatinusParser#variable_type}.
	 * @param ctx the parse tree
	 */
	void exitTypeBoolean(CodexLatinusParser.TypeBooleanContext ctx);
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
	 * Enter a parse tree produced by the {@code NestedValueVariable}
	 * labeled alternative in {@link CodexLatinusParser#nest_variable}.
	 * @param ctx the parse tree
	 */
	void enterNestedValueVariable(CodexLatinusParser.NestedValueVariableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NestedValueVariable}
	 * labeled alternative in {@link CodexLatinusParser#nest_variable}.
	 * @param ctx the parse tree
	 */
	void exitNestedValueVariable(CodexLatinusParser.NestedValueVariableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArrayCallVariable}
	 * labeled alternative in {@link CodexLatinusParser#nest_variable}.
	 * @param ctx the parse tree
	 */
	void enterArrayCallVariable(CodexLatinusParser.ArrayCallVariableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArrayCallVariable}
	 * labeled alternative in {@link CodexLatinusParser#nest_variable}.
	 * @param ctx the parse tree
	 */
	void exitArrayCallVariable(CodexLatinusParser.ArrayCallVariableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SigleValueVariable}
	 * labeled alternative in {@link CodexLatinusParser#nest_variable}.
	 * @param ctx the parse tree
	 */
	void enterSigleValueVariable(CodexLatinusParser.SigleValueVariableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SigleValueVariable}
	 * labeled alternative in {@link CodexLatinusParser#nest_variable}.
	 * @param ctx the parse tree
	 */
	void exitSigleValueVariable(CodexLatinusParser.SigleValueVariableContext ctx);
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
	 * Enter a parse tree produced by the {@code ValArrayCall}
	 * labeled alternative in {@link CodexLatinusParser#normal_values}.
	 * @param ctx the parse tree
	 */
	void enterValArrayCall(CodexLatinusParser.ValArrayCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ValArrayCall}
	 * labeled alternative in {@link CodexLatinusParser#normal_values}.
	 * @param ctx the parse tree
	 */
	void exitValArrayCall(CodexLatinusParser.ValArrayCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ValFunctionCall}
	 * labeled alternative in {@link CodexLatinusParser#normal_values}.
	 * @param ctx the parse tree
	 */
	void enterValFunctionCall(CodexLatinusParser.ValFunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ValFunctionCall}
	 * labeled alternative in {@link CodexLatinusParser#normal_values}.
	 * @param ctx the parse tree
	 */
	void exitValFunctionCall(CodexLatinusParser.ValFunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ValStructNestValue}
	 * labeled alternative in {@link CodexLatinusParser#normal_values}.
	 * @param ctx the parse tree
	 */
	void enterValStructNestValue(CodexLatinusParser.ValStructNestValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ValStructNestValue}
	 * labeled alternative in {@link CodexLatinusParser#normal_values}.
	 * @param ctx the parse tree
	 */
	void exitValStructNestValue(CodexLatinusParser.ValStructNestValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ValStructPropertyLiteral}
	 * labeled alternative in {@link CodexLatinusParser#normal_values}.
	 * @param ctx the parse tree
	 */
	void enterValStructPropertyLiteral(CodexLatinusParser.ValStructPropertyLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ValStructPropertyLiteral}
	 * labeled alternative in {@link CodexLatinusParser#normal_values}.
	 * @param ctx the parse tree
	 */
	void exitValStructPropertyLiteral(CodexLatinusParser.ValStructPropertyLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ValArrayLiteral}
	 * labeled alternative in {@link CodexLatinusParser#normal_values}.
	 * @param ctx the parse tree
	 */
	void enterValArrayLiteral(CodexLatinusParser.ValArrayLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ValArrayLiteral}
	 * labeled alternative in {@link CodexLatinusParser#normal_values}.
	 * @param ctx the parse tree
	 */
	void exitValArrayLiteral(CodexLatinusParser.ValArrayLiteralContext ctx);
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
	/**
	 * Enter a parse tree produced by the {@code IncOperation}
	 * labeled alternative in {@link CodexLatinusParser#abbreviated_operation}.
	 * @param ctx the parse tree
	 */
	void enterIncOperation(CodexLatinusParser.IncOperationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IncOperation}
	 * labeled alternative in {@link CodexLatinusParser#abbreviated_operation}.
	 * @param ctx the parse tree
	 */
	void exitIncOperation(CodexLatinusParser.IncOperationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DecOperation}
	 * labeled alternative in {@link CodexLatinusParser#abbreviated_operation}.
	 * @param ctx the parse tree
	 */
	void enterDecOperation(CodexLatinusParser.DecOperationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DecOperation}
	 * labeled alternative in {@link CodexLatinusParser#abbreviated_operation}.
	 * @param ctx the parse tree
	 */
	void exitDecOperation(CodexLatinusParser.DecOperationContext ctx);
}