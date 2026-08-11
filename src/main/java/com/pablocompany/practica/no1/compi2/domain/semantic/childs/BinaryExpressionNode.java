package com.pablocompany.practica.no1.compi2.domain.semantic.childs;

import com.pablocompany.practica.no1.compi2.domain.semantic.parents.ExpressionNode;
import com.pablocompany.practica.no1.compi2.domain.visitors.AstVisitor;
import lombok.Getter;

//This class is the principal representation of an operation expression
@Getter
public class BinaryExpressionNode extends  ExpressionNode{

    private final ExpressionNode left;
    private final ExpressionNode right;
    private final String operator; //TODO: PENDING DATA

    public BinaryExpressionNode(int line, int column, ExpressionNode left, ExpressionNode right, String operator) {
        super(line, column);
        this.left = left;
        this.right = right;
        this.operator = operator;
    }

    //This is the principal generate the final code
    @Override
    public <T> T accept(AstVisitor<T> visitor) {
        return visitor.visit(this);
    }
}
