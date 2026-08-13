package com.pablocompany.practica.no1.compi2.domain.semantic.principals;

import com.pablocompany.practica.no1.compi2.domain.semantic.AstNode;
import com.pablocompany.practica.no1.compi2.domain.visitors.AstVisitor;
import lombok.Getter;

import java.util.List;


//This class is the principal munera section code
@Getter
public class MaiorSectionNode extends AstNode {

    private List<AstNode> declarations;

    public MaiorSectionNode(int line, int column, List<AstNode> declarations) {
        super(line, column);
        this.declarations = declarations;
    }


    @Override
    public <T> T accept(AstVisitor<T> visitor) {
        return visitor.visit(this);
    }
}
