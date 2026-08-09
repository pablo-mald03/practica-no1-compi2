package com.pablocompany.practica.no1.compi2.infrastructure.lexical;

import com.pablocompany.practica.no1.compi2.compiler.logic.CodexLatinusLexer;
import com.pablocompany.practica.no1.compi2.domain.context.EditorContext;
import com.pablocompany.practica.no1.compi2.domain.highlight.SyntaxHighlightListener;
import java.util.ArrayList;
import java.util.List;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.Token;

/**
 *
 * @author pablo03
 */
/*This class analyze the code and can highlight the code*/
public class AntlrAnalyzer implements SyntaxHighlightListener {

    @Override
    public void highlight(EditorContext context) {
        context.clearLexicalErrors();

        if (context.getSourceCode() == null || context.getSourceCode().isEmpty()) {
            context.setTokens(new ArrayList<>());
            return;
        }

        CharStream stream = CharStreams.fromString(context.getSourceCode());
        CodexLatinusLexer lexer = new CodexLatinusLexer(stream);

        List<Token> allTokens = new ArrayList<>();
        Token token = lexer.nextToken();

        while (token.getType() != Token.EOF) {
            allTokens.add(token);

            if (token.getType() == CodexLatinusLexer.ERROR_TOKEN) {
                String lexeme = token.getText();
                int line = token.getLine();
                int column = token.getCharPositionInLine() + 1;

                context.addLexicalError(lexeme, line, column);
            }
            token = lexer.nextToken();
        }

        context.setTokens(allTokens);
    }

}
