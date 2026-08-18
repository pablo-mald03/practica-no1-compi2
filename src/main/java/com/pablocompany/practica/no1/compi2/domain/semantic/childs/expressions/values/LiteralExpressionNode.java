package com.pablocompany.practica.no1.compi2.domain.semantic.childs.expressions.values;

import com.pablocompany.practica.no1.compi2.domain.semantic.childs.expressions.types.enums.DataType;
import com.pablocompany.practica.no1.compi2.domain.semantic.parents.ExpressionNode;
import com.pablocompany.practica.no1.compi2.domain.visitors.AstVisitor;
import lombok.Getter;

//This class is the principal representation of a literal
@Getter
public class LiteralExpressionNode extends ExpressionNode {

    private final String value;
    private final DataType valueType;

    public LiteralExpressionNode(int line, int column, String value, DataType valueType) {
        super(line, column);
        this.value = value;
        this.valueType = valueType;
    }


    @Override
    public <T> T accept(AstVisitor<T> visitor) {
        return visitor.visit(this);
    }
}
