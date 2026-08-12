package com.pablocompany.practica.no1.compi2.domain.visitors;

import com.pablocompany.practica.no1.compi2.domain.semantic.childs.expressions.assignation.BinaryExpressionNode;
import com.pablocompany.practica.no1.compi2.domain.semantic.childs.expressions.assignation.UnaryExpressionNode;
import com.pablocompany.practica.no1.compi2.domain.semantic.childs.expressions.types.TypeNode;
import com.pablocompany.practica.no1.compi2.domain.semantic.childs.statements.VariableDeclaration;

//This interface is the principal to generate the diferent compiler phases
public interface AstVisitor<T> {

    //TODO: DECLARATE ALL THE CLASSES
    T visit(VariableDeclaration node);

    T visit(BinaryExpressionNode node);

    T visit(TypeNode node);

    T visit(UnaryExpressionNode node);
}
