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
	 * Visit a parse tree produced by the {@code MuneraSection}
	 * labeled alternative in {@link CodexLatinusParser#munera_section}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMuneraSection(CodexLatinusParser.MuneraSectionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code VariablesSection}
	 * labeled alternative in {@link CodexLatinusParser#variable_section}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariablesSection(CodexLatinusParser.VariablesSectionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CodexLatinusParser#variabiles_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariabiles_body(CodexLatinusParser.Variabiles_bodyContext ctx);
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