package com.pablocompany.practica.no1.compi2.domain.semantic.childs.expressions.assignation;

import com.pablocompany.practica.no1.compi2.domain.semantic.AstNode;
import com.pablocompany.practica.no1.compi2.domain.semantic.parents.ExpressionNode;
import com.pablocompany.practica.no1.compi2.domain.visitors.AstVisitor;
import lombok.Getter;

//This is the principal class to represents a reasignation
@Getter
public class ArrayAssignmentNode extends AstNode {
    private final String arrayId;
    private final ExpressionNode index;
    private final ExpressionNode value;

    public ArrayAssignmentNode(int line, int column, String arrayId, ExpressionNode index, ExpressionNode value) {
        super(line, column);
        this.arrayId = arrayId;
        this.index = index;
        this.value = value;
    }

    @Override
    public <T> T accept(AstVisitor<T> visitor) {
        return visitor.visit(this);
    }
}