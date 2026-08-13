package com.pablocompany.practica.no1.compi2.infrastructure.generator;

import com.pablocompany.practica.no1.compi2.domain.semantic.ProgramNode;
import com.pablocompany.practica.no1.compi2.domain.semantic.childs.expressions.access.MemberArrayAccessExpressionNode;
import com.pablocompany.practica.no1.compi2.domain.semantic.childs.expressions.access.PropertyAccessExpressionNode;
import com.pablocompany.practica.no1.compi2.domain.semantic.childs.expressions.arrays.ArrayDeclarationNode;
import com.pablocompany.practica.no1.compi2.domain.semantic.childs.expressions.arrays.ArrayInitExpressionNode;
import com.pablocompany.practica.no1.compi2.domain.semantic.childs.expressions.assignation.BinaryExpressionNode;
import com.pablocompany.practica.no1.compi2.domain.semantic.childs.expressions.assignation.UnaryExpressionNode;
import com.pablocompany.practica.no1.compi2.domain.semantic.childs.expressions.structs.StructInstanceNode;
import com.pablocompany.practica.no1.compi2.domain.semantic.childs.expressions.structs.declaration.StructAttributeNode;
import com.pablocompany.practica.no1.compi2.domain.semantic.childs.expressions.structs.declaration.StructDeclarationNode;
import com.pablocompany.practica.no1.compi2.domain.semantic.childs.expressions.structs.properties.StructLiteralExpressionNode;
import com.pablocompany.practica.no1.compi2.domain.semantic.childs.expressions.structs.properties.StructPropertyNode;
import com.pablocompany.practica.no1.compi2.domain.semantic.childs.expressions.types.TypeNode;
import com.pablocompany.practica.no1.compi2.domain.semantic.childs.expressions.values.ArrayCallExpressionNode;
import com.pablocompany.practica.no1.compi2.domain.semantic.childs.expressions.values.FunctionCallExpressionNode;
import com.pablocompany.practica.no1.compi2.domain.semantic.childs.expressions.values.IdentifierExpressionNode;
import com.pablocompany.practica.no1.compi2.domain.semantic.childs.expressions.values.LiteralExpressionNode;
import com.pablocompany.practica.no1.compi2.domain.semantic.childs.statements.VariableDeclarationNode;
import com.pablocompany.practica.no1.compi2.domain.semantic.parents.BodyNode;
import com.pablocompany.practica.no1.compi2.domain.visitors.AstVisitor;

//This is the delegated class to build the final code
public class CodeGeneratorVisitor implements AstVisitor<String> {

    @Override
    public String visit(VariableDeclarationNode node) {
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

    @Override
    public String visit(ArrayDeclarationNode node) {
        return "";
    }

    @Override
    public String visit(StructAttributeNode node) {
        return "";
    }

    @Override
    public String visit(StructDeclarationNode node) {
        return "";
    }

    @Override
    public String visit(StructPropertyNode node) {
        return "";
    }

    @Override
    public String visit(StructLiteralExpressionNode node) {
        return "";
    }

    @Override
    public String visit(StructInstanceNode node) {
        return "";
    }

    @Override
    public String visit(PropertyAccessExpressionNode node) {
        return "";
    }

    @Override
    public String visit(MemberArrayAccessExpressionNode node) {
        return "";
    }

    @Override
    public String visit(ProgramNode node) {
        return "";
    }

    @Override
    public String visit(BodyNode node) {
        return "";
    }
}
