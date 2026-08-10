package com.pablocompany.practica.no1.compi2.infrastructure.service;

import com.pablocompany.practica.no1.compi2.domain.parsingstep.ParseStep;
import com.pablocompany.practica.no1.compi2.infrastructure.stack.DerivationStackTracerListener;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.util.List;

//This class is the service to get the simulation of the stack
public class StackSimulationService {

    //This is the principal method to return the stack
    public List<ParseStep> generateSteps(ParseTree parseTree) {
        DerivationStackTracerListener tracer = new DerivationStackTracerListener();

        ParseTreeWalker.DEFAULT.walk(tracer, parseTree);

        return tracer.getSteps();
    }
}
