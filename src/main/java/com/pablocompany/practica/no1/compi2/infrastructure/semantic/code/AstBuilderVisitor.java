package com.pablocompany.practica.no1.compi2.infrastructure.semantic.code;

import com.pablocompany.practica.no1.compi2.compiler.logic.CodexLatinusParser;
import com.pablocompany.practica.no1.compi2.compiler.logic.CodexLatinusParserBaseVisitor;
import com.pablocompany.practica.no1.compi2.domain.semantic.AstNode;
import com.pablocompany.practica.no1.compi2.domain.semantic.childs.expressions.arrays.ArrayInitExpressionNode;
import com.pablocompany.practica.no1.compi2.domain.semantic.childs.expressions.assignation.UnaryExpressionNode;
import com.pablocompany.practica.no1.compi2.domain.semantic.childs.expressions.operators.enums.UnaryOperator;
import com.pablocompany.practica.no1.compi2.domain.semantic.childs.expressions.types.TypeNode;
import com.pablocompany.practica.no1.compi2.domain.semantic.childs.expressions.types.enums.DataType;
import com.pablocompany.practica.no1.compi2.domain.semantic.childs.expressions.values.ArrayCallExpressionNode;
import com.pablocompany.practica.no1.compi2.domain.semantic.childs.expressions.values.FunctionCallExpressionNode;
import com.pablocompany.practica.no1.compi2.domain.semantic.childs.expressions.values.IdentifierExpressionNode;
import com.pablocompany.practica.no1.compi2.domain.semantic.childs.expressions.values.LiteralExpressionNode;
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

    //TODO: define all the overraideable methods



    /*---****------****--- ARRAY PROPERTIES INITIALIZATION VALUES---****------****---*/

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
        if (ctx.values_array_list() != null) {
            elements = (List<ExpressionNode>) visit(ctx.values_array_list());
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
    //TODO: structs values
    @Override
    public AstNode visitValStructNestValue(CodexLatinusParser.ValStructNestValueContext ctx) {
        return super.visitValStructNestValue(ctx);
    }

    //TODO: structs values
    @Override
    public AstNode visitValStructPropertyLiteral(CodexLatinusParser.ValStructPropertyLiteralContext ctx) {
        return super.visitValStructPropertyLiteral(ctx);
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
        if (ctx.arguments_list() != null) {
            arguments = (List<ExpressionNode>) visit(ctx.arguments_list());
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
