package com.pablocompany.practica.no1.compi2.infrastructure.walkers.services;

import com.pablocompany.practica.no1.compi2.domain.semantic.AstNode;
import com.pablocompany.practica.no1.compi2.domain.semantic.childs.statements.breakpoints.ReturnStatementNode;
import lombok.NoArgsConstructor;

import java.util.List;

//This is a service to the TypeChecker phase
@NoArgsConstructor
public class CheckerTypesService {

    //This is a path returns checker
    public boolean checkAllPathsHaveReturn(List<AstNode> body) {
        if (body.isEmpty()) return false;
        AstNode last = body.get(body.size() - 1);
        return last instanceof ReturnStatementNode;
    }
}
