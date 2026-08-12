package com.pablocompany.practica.no1.compi2.infrastructure.semantic.code;

import com.pablocompany.practica.no1.compi2.compiler.logic.CodexLatinusParser;
import com.pablocompany.practica.no1.compi2.compiler.logic.CodexLatinusParserBaseVisitor;
import com.pablocompany.practica.no1.compi2.domain.semantic.AstNode;
import com.pablocompany.practica.no1.compi2.domain.semantic.childs.expressions.assignation.UnaryExpressionNode;
import com.pablocompany.practica.no1.compi2.domain.semantic.childs.expressions.operators.enums.UnaryOperator;
import com.pablocompany.practica.no1.compi2.domain.semantic.childs.expressions.types.TypeNode;
import com.pablocompany.practica.no1.compi2.domain.semantic.childs.expressions.types.enums.TypeValue;
import com.pablocompany.practica.no1.compi2.domain.semantic.parents.ExpressionNode;
import com.pablocompany.practica.no1.compi2.infrastructure.semantic.services.ExpressionHelperService;


//This is the principal class that builds the AST representation
public class AstBuilderVisitor extends CodexLatinusParserBaseVisitor<AstNode> {

    private final ExpressionHelperService expressionHelperService;

    public AstBuilderVisitor() {
        this.expressionHelperService = new ExpressionHelperService();
    }

    //TODO: define all the overraideable methods


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

    //TODO: DEFINE THE VALUE RETURN
    @Override
    public AstNode visitExpressionValue(CodexLatinusParser.ExpressionValueContext ctx) {
        return super.visitExpressionValue(ctx);
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
        return new TypeNode(ctx.getStart().getLine(), ctx.getStart().getCharPositionInLine(), TypeValue.TEXTUM_TYPE, ctx.TEXTUM().getText());
    }

    @Override
    public AstNode visitTypeInt(CodexLatinusParser.TypeIntContext ctx) {
        return new TypeNode(ctx.getStart().getLine(), ctx.getStart().getCharPositionInLine(), TypeValue.NUMERUS_TYPE, ctx.NUMERUS().getText());
    }

    @Override
    public AstNode visitTypeDecimal(CodexLatinusParser.TypeDecimalContext ctx) {
        return new TypeNode(ctx.getStart().getLine(), ctx.getStart().getCharPositionInLine(), TypeValue.DECIMALIS_TYPE, ctx.DECIMALIS().getText());
    }

    @Override
    public AstNode visitTypeChar(CodexLatinusParser.TypeCharContext ctx) {
        return new TypeNode(ctx.getStart().getLine(), ctx.getStart().getCharPositionInLine(), TypeValue.LITTERA_TYPE, ctx.LITTERA().getText());
    }

    @Override
    public AstNode visitTypeBoolean(CodexLatinusParser.TypeBooleanContext ctx) {
        return new TypeNode(ctx.getStart().getLine(), ctx.getStart().getCharPositionInLine(), TypeValue.BOOLEAN_TYPE, ctx.BOOLEAN().getText());
    }

    @Override
    public AstNode visitTypeCustomId(CodexLatinusParser.TypeCustomIdContext ctx) {
        return new TypeNode(ctx.getStart().getLine(), ctx.getStart().getCharPositionInLine(), TypeValue.CUSTOM_TYPE, ctx.ID().getText());
    }
}
