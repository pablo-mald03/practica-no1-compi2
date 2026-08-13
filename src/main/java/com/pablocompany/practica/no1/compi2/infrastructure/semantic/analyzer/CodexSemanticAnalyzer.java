package com.pablocompany.practica.no1.compi2.infrastructure.semantic.analyzer;

import com.ibm.icu.text.SymbolTable;
import com.pablocompany.practica.no1.compi2.application.mediator.WorkspaceNotifier;
import com.pablocompany.practica.no1.compi2.domain.context.EditorContext;
import com.pablocompany.practica.no1.compi2.domain.semantic.AstNode;
import com.pablocompany.practica.no1.compi2.infrastructure.semantic.code.AstBuilderVisitor;
import org.antlr.v4.runtime.tree.ParseTree;

//This is the principal semantic phase to excecute all semantic steps compiler
public class CodexSemanticAnalyzer {

    public boolean executeSemanticPhase(EditorContext context, WorkspaceNotifier notifier) {
        notifier.logInfo("Semantica: Iniciando análisis semántico...");

        ParseTree parseTree = context.getParseTree();
        if (parseTree == null) {
            notifier.logError("No existe un ParseTree válido para el análisis semántico.");
            return false;
        }

        AstBuilderVisitor builderVisitor = new AstBuilderVisitor();

        AstNode astNode = builderVisitor.visit(parseTree);

        String generated =( astNode != null) ? "Si se genero": "no se genero";
        System.out.println(generated);

        context.setAst(astNode);

        //SymbolTable symbolTable = new SymbolTable();

        // PASADA 1: Construir la Tabla de Símbolos y Ámbitos
        //SymbolTableBuilderVisitor symbolVisitor = new SymbolTableBuilderVisitor(symbolTable, context.getSemanticErrors());
        //symbolVisitor.visit(parseTree);

        // Si falló la declaración de símbolos (ej. variables duplicadas), cortamos o continuamos según política
        if (!context.getSemanticErrors().isEmpty()) {
            notifier.logError("Se encontraron errores al construir la tabla de simbolos.");
            return false;
        }

        // PASADA 2: Chequeo de Tipos y Reglas de Negocio
        //TypeCheckerVisitor typeCheckerVisitor = new TypeCheckerVisitor(symbolTable, context.getSemanticErrors());
        //typeCheckerVisitor.visit(parseTree);

        if (!context.getSemanticErrors().isEmpty()) {
            notifier.logError("Se encontraron errores semánticos / de tipos.");
            return false;
        }

       // context.setSymbolTable(symbolTable);
        notifier.logSuccess("Análisis semántico completado con éxito.");
        return true;
    }
}
