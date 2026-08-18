package com.pablocompany.practica.no1.compi2.infrastructure.semantic.services;

import com.pablocompany.practica.no1.compi2.domain.semantic.childs.expressions.assignation.BinaryExpressionNode;
import com.pablocompany.practica.no1.compi2.domain.semantic.childs.expressions.operators.enums.BinaryOperator;
import com.pablocompany.practica.no1.compi2.domain.semantic.childs.expressions.operators.enums.UnaryOperator;
import com.pablocompany.practica.no1.compi2.domain.semantic.parents.ExpressionNode;
import org.antlr.v4.runtime.ParserRuleContext;

//This is the principal service to returns the exactly value of the operator constant
public class ExpressionHelperService {

    public BinaryExpressionNode buildBinary(ParserRuleContext ctx,
                                             ExpressionNode left,
                                             ExpressionNode right,
                                             String opText) {
        int line = ctx.getStart().getLine();
        int column = ctx.getStart().getCharPositionInLine();
        BinaryOperator operator = mapToBinaryOperator(opText);

        return new BinaryExpressionNode(line, column, left, right, operator);
    }

    public UnaryOperator mapToUnaryOperator(String op) {
        switch (op) {
            case "non":
                return UnaryOperator.NOT;
            case "-":
                return UnaryOperator.NEGATE;
            default:
                throw new IllegalArgumentException("Operador unario desconocido: " + op);
        }
    }

    private static BinaryOperator mapToBinaryOperator(String op) {
        switch (op) {
            case "+": return BinaryOperator.PLUS;
            case "-": return BinaryOperator.MINUS;
            case "*": return BinaryOperator.MULTIPLICATION;
            case "/": return BinaryOperator.DIVIDE;
            case "==": return BinaryOperator.EQUALS;
            case "!=": return BinaryOperator.DIFFERENT;
            case "<": return BinaryOperator.LESS;
            case ">": return BinaryOperator.GREATER;
            case "<=": return BinaryOperator.LESS_EQUALS;
            case ">=": return BinaryOperator.GREATER_EQUALS;
            case "or": return BinaryOperator.OR;
            case "and": return BinaryOperator.AND;

            default: throw new IllegalArgumentException("Operador desconocido: " + op);
        }
    }

}
