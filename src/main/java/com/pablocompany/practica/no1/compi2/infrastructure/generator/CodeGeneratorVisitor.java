package com.pablocompany.practica.no1.compi2.infrastructure.generator;

import com.pablocompany.practica.no1.compi2.domain.semantic.childs.expressions.arrays.ArrayInitExpressionNode;
import com.pablocompany.practica.no1.compi2.domain.semantic.childs.expressions.assignation.BinaryExpressionNode;
import com.pablocompany.practica.no1.compi2.domain.semantic.childs.expressions.assignation.UnaryExpressionNode;
import com.pablocompany.practica.no1.compi2.domain.semantic.childs.expressions.types.TypeNode;
import com.pablocompany.practica.no1.compi2.domain.semantic.childs.expressions.values.ArrayCallExpressionNode;
import com.pablocompany.practica.no1.compi2.domain.semantic.childs.expressions.values.FunctionCallExpressionNode;
import com.pablocompany.practica.no1.compi2.domain.semantic.childs.expressions.values.IdentifierExpressionNode;
import com.pablocompany.practica.no1.compi2.domain.semantic.childs.expressions.values.LiteralExpressionNode;
import com.pablocompany.practica.no1.compi2.domain.semantic.childs.statements.VariableDeclaration;
import com.pablocompany.practica.no1.compi2.domain.visitors.AstVisitor;

//This is the delegated class to build the final code
public class CodeGeneratorVisitor implements AstVisitor<String> {

    @Override
    public String visit(VariableDeclaration node) {
        return "";
    }

    @Override
    public String visit(BinaryExpressionNode node) {
        String leftCode = node.getLeft().accept(this);
        String rightCode = node.getRight().accept(this);
        return leftCode + " " + node.getOperator() + " " + rightCode;
    }

    @Override
    public String visit(TypeNode node) {
        return "";
    }

    @Override
    public String visit(UnaryExpressionNode node) {
        return "";
    }

    @Override
    public String visit(LiteralExpressionNode node) {
        return "";
    }

    @Override
    public String visit(IdentifierExpressionNode node) {
        return "";
    }

    @Override
    public String visit(ArrayCallExpressionNode node) {
        return "";
    }

    @Override
    public String visit(FunctionCallExpressionNode node) {
        return "";
    }

    @Override
    public String visit(ArrayInitExpressionNode node) {
        return "";
    }
}
