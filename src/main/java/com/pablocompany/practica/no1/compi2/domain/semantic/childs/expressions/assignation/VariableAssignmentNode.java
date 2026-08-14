package com.pablocompany.practica.no1.compi2.domain.semantic.childs.expressions.assignation;

import com.pablocompany.practica.no1.compi2.domain.semantic.AstNode;
import com.pablocompany.practica.no1.compi2.domain.semantic.parents.ExpressionNode;
import com.pablocompany.practica.no1.compi2.domain.visitors.AstVisitor;
import lombok.Getter;

@Getter
public class VariableAssignmentNode extends AstNode {

    private final ExpressionNode identifier;
    private final ExpressionNode expressionNode;

    public VariableAssignmentNode(int line, int column, ExpressionNode expressionNode, ExpressionNode identifier) {
        super(line, column);
        this.expressionNode = expressionNode;
        this.identifier = identifier;
    }


    @Override
    public <T> T accept(AstVisitor<T> visitor) {
        return visitor.visit(this);
    }
}
