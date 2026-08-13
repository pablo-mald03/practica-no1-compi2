package com.pablocompany.practica.no1.compi2.domain.semantic.childs.expressions.assignation;

import com.pablocompany.practica.no1.compi2.domain.semantic.AstNode;
import com.pablocompany.practica.no1.compi2.domain.semantic.childs.expressions.assignation.enums.AbreviationOperator;
import com.pablocompany.practica.no1.compi2.domain.semantic.parents.ExpressionNode;
import com.pablocompany.practica.no1.compi2.domain.semantic.parents.StatementNode;
import com.pablocompany.practica.no1.compi2.domain.visitors.AstVisitor;
import lombok.Getter;

//This class is the principal to represents an abreaviated operation
@Getter
public class AbreviatedExpressionNode extends ExpressionNode {
    private final AstNode targetVariable;
    private final AbreviationOperator abreviationOperator;

    public AbreviatedExpressionNode(int line, int column, AbreviationOperator abreviationOperator, AstNode targetVariable) {
        super(line, column);
        this.abreviationOperator = abreviationOperator;
        this.targetVariable = targetVariable;
    }

    @Override
    public <T> T accept(AstVisitor<T> visitor) {
        return visitor.visit(this);
    }
}
