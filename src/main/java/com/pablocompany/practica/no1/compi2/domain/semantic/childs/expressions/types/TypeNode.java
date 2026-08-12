package com.pablocompany.practica.no1.compi2.domain.semantic.childs.expressions.types;

import com.pablocompany.practica.no1.compi2.domain.semantic.AstNode;
import com.pablocompany.practica.no1.compi2.domain.semantic.childs.expressions.types.enums.TypeValue;
import com.pablocompany.practica.no1.compi2.domain.visitors.AstVisitor;
import lombok.Getter;

//This class represents all operator types
@Getter
public class TypeNode extends AstNode {

    private final TypeValue type;
    private final String context;

    public TypeNode(int line, int column, TypeValue type, String context) {
        super(line, column);
        this.type = type;
        this.context = context;
    }


    @Override
    public <T> T accept(AstVisitor<T> visitor) {
        return visitor.visit(this);
    }
}
