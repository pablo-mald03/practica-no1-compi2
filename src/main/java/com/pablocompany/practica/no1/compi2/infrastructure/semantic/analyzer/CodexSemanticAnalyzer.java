package com.pablocompany.practica.no1.compi2.infrastructure.semantic.analyzer;

import com.ibm.icu.text.SymbolTable;
import com.pablocompany.practica.no1.compi2.application.mediator.WorkspaceNotifier;
import com.pablocompany.practica.no1.compi2.domain.context.EditorContext;
import com.pablocompany.practica.no1.compi2.domain.semantic.AstNode;
import com.pablocompany.practica.no1.compi2.domain.semantic.ProgramNode;
import com.pablocompany.practica.no1.compi2.infrastructure.generator.CodeGeneratorVisitor;
import com.pablocompany.practica.no1.compi2.infrastructure.semantic.code.AstBuilderVisitor;
import com.pablocompany.practica.no1.compi2.infrastructure.typechecker.SymbolTableBuilderVisitor;
import org.antlr.v4.runtime.tree.ParseTree;

//This is the principal semantic phase to excecute all semantic steps compiler
public class CodexSemanticAnalyzer {

    public boolean executeSemanticPhase(EditorContext context, WorkspaceNotifier notifier) {
        notifier.logInfo("Semantica: Iniciando analisis semantico...");

        context.clearSemanticErrors();

        ParseTree parseTree = context.getParseTree();
        if (parseTree == null) {
            notifier.logError("No existe un ParseTree válido para el analisis semantico.");
            return false;
        }

        notifier.logInfo("[1/4] Construyendo AST...");

        // ===== PHASE 1: build the AST =====
        AstBuilderVisitor builderVisitor = new AstBuilderVisitor();
        AstNode astNode = builderVisitor.visit(parseTree);
        context.setAst(astNode);
        notifier.logInfo("AST construido correctamente.");

        // ===== PHASE 2: Build the symbols table =====
        notifier.logInfo("[2/4] Construyendo tabla de símbolos...");

        SymbolTableBuilderVisitor symbolBuilder = new SymbolTableBuilderVisitor(
                context.getSemanticErrors()
        );
        symbolBuilder.visit((ProgramNode) astNode);
        context.setGlobalEnvironment(symbolBuilder.getGlobalScope());
        context.setCurrentEnvironment(symbolBuilder.getCurrentScope());

        if (!context.getSemanticErrors().isEmpty()) {
            context.setSemanticErrors(symbolBuilder.getErrors());
            notifier.logError("Se encontraron errores semanticos de variables.");
            return false;
        }


        // ===== PHASE 3: Type checker =====
        // notifier.logInfo("Realizando chequeo de tipos...");
        // TypeCheckerVisitor typeCheckerVisitor = new TypeCheckerVisitor(symbolTable, context.getSemanticErrors());
        // typeCheckerVisitor.visit(astNode);

        // if (!context.getSemanticErrors().isEmpty()) {
        //     notifier.logError("Se encontraron errores semánticos / de tipos.");
        //     return false;
        // }
        // notifier.logInfo("Chequeo de tipos completado exitosamente.");

        // ===== PHASE 4: Translated code (PigLatin) =====
        notifier.logInfo("Generando traduccion...");
        CodeGeneratorVisitor codeGenerator = new CodeGeneratorVisitor();
        String compiledCode = astNode.accept(codeGenerator);
        context.setCompiledCode(compiledCode);
        notifier.logInfo("PigLatin generado correctamente.");

        notifier.logSuccess("Analisis semantico completado con exito.");
        return true;
    }
}
