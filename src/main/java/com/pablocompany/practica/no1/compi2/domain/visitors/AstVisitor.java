package com.pablocompany.practica.no1.compi2.domain.visitors;

import com.pablocompany.practica.no1.compi2.domain.semantic.childs.BinaryExpressionNode;
import com.pablocompany.practica.no1.compi2.domain.semantic.childs.VariableDeclaration;

//This interface is the principal to generate the diferent compiler phases
public interface AstVisitor<T> {

    //TODO: DECLARATE ALL THE CLASSES
    T visit(VariableDeclaration node);

    T visit(BinaryExpressionNode node);
}
