package com.pablocompany.practica.no1.compi2.infrastructure.semantic.code;

import com.pablocompany.practica.no1.compi2.compiler.logic.CodexLatinusParser;
import com.pablocompany.practica.no1.compi2.compiler.logic.CodexLatinusParserBaseVisitor;
import com.pablocompany.practica.no1.compi2.domain.semantic.AstNode;
import com.pablocompany.practica.no1.compi2.domain.semantic.ProgramNode;
import com.pablocompany.practica.no1.compi2.domain.semantic.childs.expressions.access.MemberArrayAccessExpressionNode;
import com.pablocompany.practica.no1.compi2.domain.semantic.childs.expressions.access.PropertyAccessExpressionNode;
import com.pablocompany.practica.no1.compi2.domain.semantic.childs.expressions.arrays.ArrayDeclarationNode;
import com.pablocompany.practica.no1.compi2.domain.semantic.childs.expressions.arrays.ArrayInitExpressionNode;
import com.pablocompany.practica.no1.compi2.domain.semantic.childs.expressions.assignation.UnaryExpressionNode;
import com.pablocompany.practica.no1.compi2.domain.semantic.childs.expressions.operators.enums.UnaryOperator;
import com.pablocompany.practica.no1.compi2.domain.semantic.childs.expressions.structs.StructInstanceNode;
import com.pablocompany.practica.no1.compi2.domain.semantic.childs.expressions.structs.declaration.StructAttributeNode;
import com.pablocompany.practica.no1.compi2.domain.semantic.childs.expressions.structs.declaration.StructDeclarationNode;
import com.pablocompany.practica.no1.compi2.domain.semantic.childs.expressions.structs.properties.StructLiteralExpressionNode;
import com.pablocompany.practica.no1.compi2.domain.semantic.childs.expressions.structs.properties.StructPropertyNode;
import com.pablocompany.practica.no1.compi2.domain.semantic.childs.expressions.types.TypeNode;
import com.pablocompany.practica.no1.compi2.domain.semantic.childs.expressions.types.enums.DataType;
import com.pablocompany.practica.no1.compi2.domain.semantic.childs.expressions.values.ArrayCallExpressionNode;
import com.pablocompany.practica.no1.compi2.domain.semantic.childs.expressions.values.FunctionCallExpressionNode;
import com.pablocompany.practica.no1.compi2.domain.semantic.childs.expressions.values.IdentifierExpressionNode;
import com.pablocompany.practica.no1.compi2.domain.semantic.childs.expressions.values.LiteralExpressionNode;
import com.pablocompany.practica.no1.compi2.domain.semantic.childs.statements.VariableDeclarationNode;
import com.pablocompany.practica.no1.compi2.domain.semantic.parents.BodyNode;
import com.pablocompany.practica.no1.compi2.domain.semantic.parents.ExpressionNode;
import com.pablocompany.practica.no1.compi2.infrastructure.semantic.services.ExpressionHelperService;

import java.util.ArrayList;
import java.util.List;


//This is the principal class that builds the AST representation
public class AstBuilderVisitor extends CodexLatinusParserBaseVisitor<AstNode> {

    private final ExpressionHelperService expressionHelperService;

    public AstBuilderVisitor() {
        this.expressionHelperService = new ExpressionHelperService();
    }


    //----******----- THE PRINCIPAL PRODUCTION RULES ----******-----
    @Override
    public AstNode visitProgramRoot(CodexLatinusParser.ProgramRootContext ctx) {
        int line = ctx.getStart().getLine();
        int column = ctx.getStart().getCharPositionInLine();

        List<BodyNode> bodies = new ArrayList<>();
        for (CodexLatinusParser.BodyContext bodyCtx : ctx.body()) {
            bodies.add((BodyNode) visit(bodyCtx));
        }

        return new ProgramNode(line, column, bodies);
    }

    @Override
    public AstNode visitBody(CodexLatinusParser.BodyContext ctx) {
        int line = ctx.getStart().getLine();
        int column = ctx.getStart().getCharPositionInLine();

        AstNode variables = (ctx.variable_section() != null) ? visit(ctx.variable_section()) : null;
        AstNode munera = (ctx.munera_section() != null) ? visit(ctx.munera_section()) : null;
        AstNode maior = visit(ctx.maior_section());

        return new BodyNode(line, column, variables, munera, maior);
    }

    //----******----- THE PRINCIPAL SECTION RULES ----******-----

    @Override
    public AstNode visitVariablesSection(CodexLatinusParser.VariablesSectionContext ctx) {
        return visit(ctx.variabiles_body());
    }

    @Override
    public AstNode visitMuneraSection(CodexLatinusParser.MuneraSectionContext ctx) {
        return visit(ctx.munera_body());
    }

    @Override
    public AstNode visitMaiorSection(CodexLatinusParser.MaiorSectionContext ctx) {
        return visit(ctx.code_body());
    }

    //TODO: define all the overraideable methods


    //----******----- STRUCTS PROPERTIES ----******-----

    @Override
    public AstNode visitStructBaseProperty(CodexLatinusParser.StructBasePropertyContext ctx) {
        int line = ctx.getStart().getLine();
        int column = ctx.getStart().getCharPositionInLine();

        IdentifierExpressionNode target = new IdentifierExpressionNode(line, column, ctx.ID(0).getText());
        return new PropertyAccessExpressionNode(line, column, target, ctx.ID(1).getText());
    }

    @Override
    public AstNode visitStructBaseArrayProperty(CodexLatinusParser.StructBaseArrayPropertyContext ctx) {
        int line = ctx.getStart().getLine();
        int column = ctx.getStart().getCharPositionInLine();

        ExpressionNode index = (ExpressionNode) visit(ctx.expression());
        ArrayCallExpressionNode targetArray = new ArrayCallExpressionNode(line, column, ctx.ID(0).getText(), index);

        return new PropertyAccessExpressionNode(line, column, targetArray, ctx.ID(1).getText());
    }

    @Override
    public AstNode visitStructArrayAccessChain(CodexLatinusParser.StructArrayAccessChainContext ctx) {
        int line = ctx.getStart().getLine();
        int column = ctx.getStart().getCharPositionInLine();

        ExpressionNode target = (ExpressionNode) visit(ctx.struct_values());
        ExpressionNode index = (ExpressionNode) visit(ctx.expression());

        return new MemberArrayAccessExpressionNode(line, column, target, index);
    }

    @Override
    public AstNode visitStructPropertyChain(CodexLatinusParser.StructPropertyChainContext ctx) {
        int line = ctx.getStart().getLine();
        int column = ctx.getStart().getCharPositionInLine();

        ExpressionNode target = (ExpressionNode) visit(ctx.struct_values());

        return new PropertyAccessExpressionNode(line, column, target, ctx.ID().getText());
    }


    //----******----- INSTANCE STRUCT PRODUCTIONS----******-----

    @Override
    public AstNode visitStructInstance(CodexLatinusParser.StructInstanceContext ctx) {
        int line = ctx.getStart().getLine();
        int column = ctx.getStart().getCharPositionInLine();

        String identifier = ctx.ID(0).getText();
        String structType = ctx.ID(1).getText();
        StructLiteralExpressionNode literal = (StructLiteralExpressionNode) visit(ctx.struct_literal());

        return new StructInstanceNode(line, column, identifier, structType, literal);
    }

    @Override
    public AstNode visitStructLiteralValue(CodexLatinusParser.StructLiteralValueContext ctx) {
        int line = ctx.getStart().getLine();
        int column = ctx.getStart().getCharPositionInLine();

        List<StructPropertyNode> properties = new ArrayList<>();

        CodexLatinusParser.Struct_data_listContext current = ctx.struct_data_list();

        while (current instanceof CodexLatinusParser.StructValueListContext) {
            CodexLatinusParser.StructValueListContext listCtx = (CodexLatinusParser.StructValueListContext) current;

            properties.add(0, (StructPropertyNode) visit(listCtx.struct_data_value()));

            current = listCtx.struct_data_list();
        }

        if (current instanceof CodexLatinusParser.StructSingleValueContext) {
            CodexLatinusParser.StructSingleValueContext singleCtx = (CodexLatinusParser.StructSingleValueContext) current;

            properties.add(0, (StructPropertyNode) visit(singleCtx.struct_data_value()));
        }

        return new StructLiteralExpressionNode(line, column, properties);
    }

    @Override
    public AstNode visitStructValueList(CodexLatinusParser.StructValueListContext ctx) {
        List<StructPropertyNode> list = (List<StructPropertyNode>) visit(ctx.struct_data_list());
        list.add((StructPropertyNode) visit(ctx.struct_data_value()));
        return (AstNode) list;
    }

    @Override
    public AstNode visitStructSingleValue(CodexLatinusParser.StructSingleValueContext ctx) {
        List<StructPropertyNode> list = new ArrayList<>();
        list.add((StructPropertyNode) visit(ctx.struct_data_value()));
        return (AstNode) list;
    }

    @Override
    public AstNode visitStructDataNormal(CodexLatinusParser.StructDataNormalContext ctx) {
        int line = ctx.getStart().getLine();
        int column = ctx.getStart().getCharPositionInLine();

        String propertyName = ctx.ID().getText();
        ExpressionNode value = (ExpressionNode) visit(ctx.expression());

        return new StructPropertyNode(line, column, propertyName, value);
    }


    //----******----- STRUCT PRODUCTIONS VALUES ----******-----

    @Override
    public AstNode visitStructDeclaration(CodexLatinusParser.StructDeclarationContext ctx) {
        int line = ctx.getStart().getLine();
        int column = ctx.getStart().getCharPositionInLine();
        String structName = ctx.ID().getText();

        List<StructAttributeNode> attributes = new ArrayList<>();
        CodexLatinusParser.Struct_bodyContext bodyCtx = ctx.struct_body();

        if (bodyCtx instanceof CodexLatinusParser.StructSeparatedBodyContext) {
            CodexLatinusParser.Struct_normal_bodyContext current = ((CodexLatinusParser.StructSeparatedBodyContext) bodyCtx).struct_normal_body();

            while (current instanceof CodexLatinusParser.StructNormalBodyListContext) {
                CodexLatinusParser.StructNormalBodyListContext listCtx = (CodexLatinusParser.StructNormalBodyListContext) current;
                attributes.add(0, (StructAttributeNode) visit(listCtx.struct_attribute()));
                current = listCtx.struct_normal_body();
            }

            if (current instanceof CodexLatinusParser.StructNormalBodySingleContext) {
                attributes.add(0, (StructAttributeNode) visit(((CodexLatinusParser.StructNormalBodySingleContext) current).struct_attribute()));
            }
        }
        else if (bodyCtx instanceof CodexLatinusParser.StructCommaBodyContext) {
            CodexLatinusParser.Struct_comma_bodyContext current = ((CodexLatinusParser.StructCommaBodyContext) bodyCtx).struct_comma_body();

            while (current instanceof CodexLatinusParser.StructCommaBodyListContext) {
                CodexLatinusParser.StructCommaBodyListContext listCtx = (CodexLatinusParser.StructCommaBodyListContext) current;
                attributes.add(0, (StructAttributeNode) visit(listCtx.struct_attribute()));
                current = listCtx.struct_comma_body();
            }

            if (current instanceof CodexLatinusParser.StructCommaBodySingleContext) {
                attributes.add(0, (StructAttributeNode) visit(((CodexLatinusParser.StructCommaBodySingleContext) current).struct_attribute()));
            }
        }

        return new StructDeclarationNode(line, column, structName, attributes);
    }

    @Override
    public AstNode visitStructSeparatedBody(CodexLatinusParser.StructSeparatedBodyContext ctx) {
        return visit(ctx.struct_normal_body());
    }

    @Override
    public AstNode visitStructCommaBody(CodexLatinusParser.StructCommaBodyContext ctx) {
        return visit(ctx.struct_comma_body());
    }



    @Override
    public AstNode visitStructNormalBodyList(CodexLatinusParser.StructNormalBodyListContext ctx) {
        List<StructAttributeNode> list = (List<StructAttributeNode>) visit(ctx.struct_normal_body());
        list.add((StructAttributeNode) visit(ctx.struct_attribute()));
        return (AstNode) list;
    }

    @Override
    public AstNode visitStructNormalBodySingle(CodexLatinusParser.StructNormalBodySingleContext ctx) {
        List<StructAttributeNode> list = new ArrayList<>();
        list.add((StructAttributeNode) visit(ctx.struct_attribute()));
        return (AstNode) list;
    }

    @Override
    public AstNode visitStructCommaBodyList(CodexLatinusParser.StructCommaBodyListContext ctx) {
        List<StructAttributeNode> list = (List<StructAttributeNode>) visit(ctx.struct_comma_body());
        list.add((StructAttributeNode) visit(ctx.struct_attribute()));
        return (AstNode) list;
    }

    @Override
    public AstNode visitStructCommaBodySingle(CodexLatinusParser.StructCommaBodySingleContext ctx) {
        List<StructAttributeNode> list = new ArrayList<>();
        list.add((StructAttributeNode) visit(ctx.struct_attribute()));
        return (AstNode) list;
    }

    //----******----- STRUCT VALUES DECLARATION ----******-----

    @Override
    public AstNode visitNormalVariableStruct(CodexLatinusParser.NormalVariableStructContext ctx) {
        return visit(ctx.variable_without_value());
    }

    @Override
    public AstNode visitArrayVariableStruct(CodexLatinusParser.ArrayVariableStructContext ctx) {
        return visit(ctx.array_variable_struct());
    }

    @Override
    public AstNode visitInternalStructNormalVariable(CodexLatinusParser.InternalStructNormalVariableContext ctx) {
        int line = ctx.getStart().getLine();
        int column = ctx.getStart().getCharPositionInLine();
        String id = ctx.ID().getText();
        TypeNode type = (TypeNode) visit(ctx.variable_type());

        return new StructAttributeNode(line, column, id, type, false);
    }

    @Override
    public AstNode visitInternalStructArray(CodexLatinusParser.InternalStructArrayContext ctx) {
        int line = ctx.getStart().getLine();
        int column = ctx.getStart().getCharPositionInLine();

        String id = ctx.ID(0).getText();
        TypeNode type = new TypeNode(line, column, DataType.CUSTOM, ctx.ID(1).getText());

        return new StructAttributeNode(line, column, id, type, true);
    }


    //----******----- VARIABLES AND ARRAY DECLARATIONS ----******-----


    @Override
    public AstNode visitVariableDeclaration(CodexLatinusParser.VariableDeclarationContext ctx) {
        int line = ctx.getStart().getLine();
        int column = ctx.getStart().getCharPositionInLine();

        String identifier = ctx.ID().getText();

        TypeNode dataType = (TypeNode) visit(ctx.variable_type());

        ExpressionNode initializer = (ExpressionNode) visit(ctx.expression());

        return new VariableDeclarationNode(line, column,dataType, identifier , initializer);
    }

    @Override
    public AstNode visitNormalArrayDeclaration(CodexLatinusParser.NormalArrayDeclarationContext ctx) {
        int line = ctx.getStart().getLine();
        int column = ctx.getStart().getCharPositionInLine();

        String identifier = ctx.ID().getText();

        ExpressionNode size = (ExpressionNode) visit(ctx.expression());

        TypeNode dataType = (TypeNode) visit(ctx.variable_type());

        ArrayInitExpressionNode initializer = null;
        if (ctx.array_initialization() != null) {
            initializer = (ArrayInitExpressionNode) visit(ctx.array_initialization());
        }

        return new ArrayDeclarationNode(line, column, dataType,identifier, size, initializer);
    }

    /*---****------****--- ARRAY PROPERTIES INITIALIZATION VALUES---****------****---*/

    @Override
    public AstNode visitArraySingleValue(CodexLatinusParser.ArraySingleValueContext ctx) {
        return visit(ctx.array_value());
    }

    @Override
    public AstNode visitArrayNormalValue(CodexLatinusParser.ArrayNormalValueContext ctx) {
        return visit(ctx.expression());
    }

    @Override
    public AstNode visitArrayValueList(CodexLatinusParser.ArrayValueListContext ctx) {
        List<ExpressionNode> list = (List<ExpressionNode>) visit(ctx.values_array_list());
        ExpressionNode element = (ExpressionNode) visit(ctx.array_value());
        list.add(element);
        return (AstNode) list;
    }

    @Override
    public AstNode visitArrayInitWithValues(CodexLatinusParser.ArrayInitWithValuesContext ctx) {
        int line = ctx.getStart().getLine();
        int column = ctx.getStart().getCharPositionInLine();

        List<ExpressionNode> elements = new ArrayList<>();
        CodexLatinusParser.Values_array_listContext current = ctx.values_array_list();

        while (current instanceof CodexLatinusParser.ArrayValueListContext) {
            CodexLatinusParser.ArrayValueListContext listCtx = (CodexLatinusParser.ArrayValueListContext) current;
            elements.add(0, (ExpressionNode) visit(listCtx.array_value()));
            current = listCtx.values_array_list();
        }

        if (current instanceof CodexLatinusParser.ArraySingleValueContext) {
            CodexLatinusParser.ArraySingleValueContext singleCtx = (CodexLatinusParser.ArraySingleValueContext) current;
            elements.add(0, (ExpressionNode) visit(singleCtx.array_value()));
        }

        return new ArrayInitExpressionNode(line, column, elements);
    }

    //----******----- PRINCIPAL EXPRESSION VALUES SECTION ----******-----

    @Override
    public AstNode visitValArrayLiteral(CodexLatinusParser.ValArrayLiteralContext ctx) {
        return visit(ctx.array_initialization());
    }

    @Override
    public AstNode visitValBool(CodexLatinusParser.ValBoolContext ctx) {
        return visit(ctx.boolean_values());
    }

    @Override
    public AstNode visitValChar(CodexLatinusParser.ValCharContext ctx) {
        int line = ctx.getStart().getLine();
        int column = ctx.getStart().getCharPositionInLine();
        return new LiteralExpressionNode(line, column, ctx.CHAR().getText(), DataType.CHAR);
    }

    @Override
    public AstNode visitValDecimal(CodexLatinusParser.ValDecimalContext ctx) {
        int line = ctx.getStart().getLine();
        int column = ctx.getStart().getCharPositionInLine();
        return new LiteralExpressionNode(line, column, ctx.DECIMAL().getText(), DataType.DECIMAL);
    }

    //----******----- PRINCIPAL EXPRESSION THAT RETURNS AN ARRAY CALL ----******-----
    @Override
    public AstNode visitValStructNestValue(CodexLatinusParser.ValStructNestValueContext ctx) {
        return visit(ctx.struct_values());
    }

    @Override
    public AstNode visitValStructPropertyLiteral(CodexLatinusParser.ValStructPropertyLiteralContext ctx) {
       return visit(ctx.struct_literal());
    }


    //----******----- PRINCIPAL FUNCTION CALL PRODUCTIONS ----******-----

    @Override
    public AstNode visitValFunctionCall(CodexLatinusParser.ValFunctionCallContext ctx) {
        return visit(ctx.function_call());
    }

    @Override
    public AstNode visitFunctionCalling(CodexLatinusParser.FunctionCallingContext ctx) {
        int line = ctx.getStart().getLine();
        int column = ctx.getStart().getCharPositionInLine();
        String functionName = ctx.ID().getText();

        List<ExpressionNode> arguments = new ArrayList<>();
        CodexLatinusParser.Arguments_listContext current = ctx.arguments_list();

        while (current instanceof CodexLatinusParser.ArgumentFunctionListContext) {
            CodexLatinusParser.ArgumentFunctionListContext listCtx = (CodexLatinusParser.ArgumentFunctionListContext) current;
            arguments.add(0, (ExpressionNode) visit(listCtx.expression()));
            current = listCtx.arguments_list();
        }

        if (current instanceof CodexLatinusParser.ArgumentSingleFunctionContext) {
            CodexLatinusParser.ArgumentSingleFunctionContext singleCtx = (CodexLatinusParser.ArgumentSingleFunctionContext) current;
            arguments.add(0, (ExpressionNode) visit(singleCtx.expression()));
        }

        return new FunctionCallExpressionNode(line, column, functionName, arguments);
    }

    @Override
    public AstNode visitArgumentFunctionList(CodexLatinusParser.ArgumentFunctionListContext ctx) {
        List<ExpressionNode> list = (List<ExpressionNode>) visit(ctx.arguments_list());
        ExpressionNode arg = (ExpressionNode) visit(ctx.expression());
        list.add(arg);
        return (AstNode) (Object) list;
    }

    @Override
    public AstNode visitArgumentSingleFunction(CodexLatinusParser.ArgumentSingleFunctionContext ctx) {
        List<ExpressionNode> list = new ArrayList<>();
        ExpressionNode arg = (ExpressionNode) visit(ctx.expression());
        list.add(arg);
        return (AstNode) list;
    }

    //----******----- PRINCIPAL ARRAY CALL PRODUCTIONS ----******-----

    @Override
    public AstNode visitValArrayCall(CodexLatinusParser.ValArrayCallContext ctx) {
        return visit(ctx.array_call());
    }

    @Override
    public AstNode visitArrayCall(CodexLatinusParser.ArrayCallContext ctx) {
        int line = ctx.getStart().getLine();
        int column = ctx.getStart().getCharPositionInLine();

        String arrayName = ctx.ID().getText();

        ExpressionNode indexExpression = (ExpressionNode) visit(ctx.expression());

        return new ArrayCallExpressionNode(line, column, arrayName, indexExpression);
    }

    @Override
    public AstNode visitValIdCall(CodexLatinusParser.ValIdCallContext ctx) {
        int line = ctx.getStart().getLine();
        int column = ctx.getStart().getCharPositionInLine();
        return new IdentifierExpressionNode(line, column, ctx.ID().getText());
    }

    @Override
    public AstNode visitValInt(CodexLatinusParser.ValIntContext ctx) {
        int line = ctx.getStart().getLine();
        int column = ctx.getStart().getCharPositionInLine();
        return new LiteralExpressionNode(line, column, ctx.INT().getText(), DataType.INT);
    }

    @Override
    public AstNode visitValString(CodexLatinusParser.ValStringContext ctx) {
        int line = ctx.getStart().getLine();
        int column = ctx.getStart().getCharPositionInLine();
        return new LiteralExpressionNode(line, column, ctx.STRING().getText(), DataType.STRING);
    }





    //----******----- PRINCIPAL TYPES SECTION ----******-----

    @Override
    public AstNode visitExpressionAddSub(CodexLatinusParser.ExpressionAddSubContext ctx) {
        ExpressionNode left = (ExpressionNode) visit(ctx.expression(0));
        ExpressionNode right = (ExpressionNode) visit(ctx.expression(1));
        String op = ctx.op.getText();

        return expressionHelperService.buildBinary(ctx, left, right, op);
    }

    @Override
    public AstNode visitExpressionMultDiv(CodexLatinusParser.ExpressionMultDivContext ctx) {
        ExpressionNode left = (ExpressionNode) visit(ctx.expression(0));
        ExpressionNode right = (ExpressionNode) visit(ctx.expression(1));
        String op = ctx.op.getText();

        return expressionHelperService.buildBinary(ctx, left, right, op);
    }

    @Override
    public AstNode visitExpressionOr(CodexLatinusParser.ExpressionOrContext ctx) {
        ExpressionNode left = (ExpressionNode) visit(ctx.expression(0));
        ExpressionNode right = (ExpressionNode) visit(ctx.expression(1));

        return expressionHelperService.buildBinary(ctx, left, right, "or");
    }

    @Override
    public AstNode visitExpressionAnd(CodexLatinusParser.ExpressionAndContext ctx) {
        ExpressionNode left = (ExpressionNode) visit(ctx.expression(0));
        ExpressionNode right = (ExpressionNode) visit(ctx.expression(1));

        return expressionHelperService.buildBinary(ctx, left, right, "and");
    }

    @Override
    public AstNode visitExpressionValue(CodexLatinusParser.ExpressionValueContext ctx) {
        return visit(ctx.normal_values());
    }

    @Override
    public AstNode visitExpressionRelational(CodexLatinusParser.ExpressionRelationalContext ctx) {
        ExpressionNode left = (ExpressionNode) visit(ctx.expression(0));
        ExpressionNode right = (ExpressionNode) visit(ctx.expression(1));
        String op = ctx.op.getText();

        return expressionHelperService.buildBinary(ctx, left, right, op);
    }

    @Override
    public AstNode visitExpressionEquality(CodexLatinusParser.ExpressionEqualityContext ctx) {
        ExpressionNode left = (ExpressionNode) visit(ctx.expression(0));
        ExpressionNode right = (ExpressionNode) visit(ctx.expression(1));
        String op = ctx.op.getText();

        return expressionHelperService.buildBinary(ctx, left, right, op);
    }

    @Override
    public AstNode visitExpressionUnary(CodexLatinusParser.ExpressionUnaryContext ctx) {
        int line = ctx.getStart().getLine();
        int column = ctx.getStart().getCharPositionInLine();
        ExpressionNode operand = (ExpressionNode) visit(ctx.expression());

        String opText = ctx.op.getText();
        UnaryOperator operator = expressionHelperService.mapToUnaryOperator(opText);

        return new UnaryExpressionNode(line, column, operand, operator);
    }

    @Override
    public AstNode visitExpressionParents(CodexLatinusParser.ExpressionParentsContext ctx) {
        return visit(ctx.expression());
    }

    //----******----- PRINCIPAL TYPES SECTION ----******-----
    @Override
    public TypeNode visitTypeText(CodexLatinusParser.TypeTextContext ctx) {
        return new TypeNode(ctx.getStart().getLine(), ctx.getStart().getCharPositionInLine(), DataType.STRING, ctx.TEXTUM().getText());
    }

    @Override
    public AstNode visitTypeInt(CodexLatinusParser.TypeIntContext ctx) {
        return new TypeNode(ctx.getStart().getLine(), ctx.getStart().getCharPositionInLine(), DataType.INT, ctx.NUMERUS().getText());
    }

    @Override
    public AstNode visitTypeDecimal(CodexLatinusParser.TypeDecimalContext ctx) {
        return new TypeNode(ctx.getStart().getLine(), ctx.getStart().getCharPositionInLine(), DataType.DECIMAL, ctx.DECIMALIS().getText());
    }

    @Override
    public AstNode visitTypeChar(CodexLatinusParser.TypeCharContext ctx) {
        return new TypeNode(ctx.getStart().getLine(), ctx.getStart().getCharPositionInLine(), DataType.CHAR, ctx.LITTERA().getText());
    }

    @Override
    public AstNode visitTypeBoolean(CodexLatinusParser.TypeBooleanContext ctx) {
        return new TypeNode(ctx.getStart().getLine(), ctx.getStart().getCharPositionInLine(), DataType.BOOLEAN, ctx.BOOLEAN().getText());
    }

    @Override
    public AstNode visitTypeCustomId(CodexLatinusParser.TypeCustomIdContext ctx) {
        return new TypeNode(ctx.getStart().getLine(), ctx.getStart().getCharPositionInLine(), DataType.CUSTOM, ctx.ID().getText());
    }

    //----******----- BOOLEAN VALUES TYPE ----******-----


    @Override
    public AstNode visitBoolFalse(CodexLatinusParser.BoolFalseContext ctx) {
        int line = ctx.getStart().getLine();
        int column = ctx.getStart().getCharPositionInLine();
        return new LiteralExpressionNode(line, column, "falsus", DataType.BOOLEAN);
    }

    @Override
    public AstNode visitBoolTrue(CodexLatinusParser.BoolTrueContext ctx) {
        int line = ctx.getStart().getLine();
        int column = ctx.getStart().getCharPositionInLine();
        return new LiteralExpressionNode(line, column, "verum", DataType.BOOLEAN);
    }
}
