package com.pablocompany.practica.no1.compi2.infrastructure.syntax;

import com.pablocompany.practica.no1.compi2.application.mediator.WorkspaceNotifier;
import com.pablocompany.practica.no1.compi2.compiler.logic.CodexLatinusLexer;
import com.pablocompany.practica.no1.compi2.compiler.logic.CodexLatinusParser;
import com.pablocompany.practica.no1.compi2.domain.context.EditorContext;
import com.pablocompany.practica.no1.compi2.infrastructure.errors.CodexSyntaxErrorListener;
import com.pablocompany.practica.no1.compi2.infrastructure.service.GraphvizTreeGeneratorService;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

//This class is the principal to excecute the syntactic analisis
public class CodexSyntaxAnalizer {


    //PrincipalMethod to excecute the parsin phase
    public boolean executeParsingPhase(EditorContext context, WorkspaceNotifier notifier) {
        notifier.logInfo("Lexer: Analisis iniciado...");

        CodexLatinusLexer lexer = new CodexLatinusLexer(CharStreams.fromString(context.getSourceCode()));
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        context.setTokens(tokens.getTokens());

        CodexLatinusParser parser = new CodexLatinusParser(tokens);

        parser.removeErrorListeners();
        CodexSyntaxErrorListener errorListener = new CodexSyntaxErrorListener(context.getParserErrors());
        parser.addErrorListener(errorListener);

        notifier.logInfo("Parser: Construyendo AST...");

        ParseTree parseTree = parser.program();
        context.setParseTree(parseTree);

        GraphvizTreeGeneratorService graphGenerator = new GraphvizTreeGeneratorService();
        String graphvizCode = graphGenerator.generateDotFormat(parseTree, parser, context.getParserErrors());

        context.setGraphvizCode(graphvizCode);

        if (!context.getParserErrors().isEmpty()) {
            notifier.logError("Se encontraron errores de sintaxis.");
            return false;
        }

        notifier.logSuccess("ParseTree construido correctamente.");
        return true;
    }
}
