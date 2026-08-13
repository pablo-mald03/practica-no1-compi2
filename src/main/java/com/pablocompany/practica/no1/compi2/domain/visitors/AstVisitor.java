package com.pablocompany.practica.no1.compi2.domain.visitors;

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

//This interface is the principal to generate the diferent compiler phases
public interface AstVisitor<T> {

    //TODO: DECLARATE ALL THE CLASSES
    T visit(VariableDeclarationNode node);

    T visit(BinaryExpressionNode node);

    T visit(TypeNode node);

    T visit(UnaryExpressionNode node);

    T visit(LiteralExpressionNode node);

    T visit(IdentifierExpressionNode node);

    T visit(ArrayCallExpressionNode node);

    T visit(FunctionCallExpressionNode node);

    T visit(ArrayInitExpressionNode node);

    T visit(ArrayDeclarationNode node);

    T visit(StructAttributeNode node);

    T visit(StructDeclarationNode node);

    T visit(StructPropertyNode node);

    T visit(StructLiteralExpressionNode node);

    T visit(StructInstanceNode node);

    T visit(PropertyAccessExpressionNode node);

    T visit(MemberArrayAccessExpressionNode node);

    T visit(ProgramNode node);
    T visit(BodyNode node);

}
