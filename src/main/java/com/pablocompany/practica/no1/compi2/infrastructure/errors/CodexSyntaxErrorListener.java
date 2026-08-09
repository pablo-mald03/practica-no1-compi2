package com.pablocompany.practica.no1.compi2.infrastructure.errors;

import com.pablocompany.practica.no1.compi2.domain.highlight.ErrorType;
import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;
import org.antlr.v4.runtime.Token;

import java.util.List;

//This class uses the parsing error list to add the parsing errors
public class CodexSyntaxErrorListener extends BaseErrorListener {

    private final List<CompilerError> errorsList;

    public CodexSyntaxErrorListener(List<CompilerError> errorsList) {
        this.errorsList = errorsList;
    }

    @Override
    public void syntaxError(Recognizer<?, ?> recognizer,
                            Object offendingSymbol,
                            int line,
                            int charPositionInLine,
                            String msg,
                            RecognitionException e) {

        String lexeme = "";
        if (offendingSymbol instanceof Token) {
            lexeme = ((Token) offendingSymbol).getText();
        } else if (offendingSymbol != null) {
            lexeme = offendingSymbol.toString();
        }

        CompilerError error = new CompilerError(lexeme, line, charPositionInLine, ErrorType.SYNTACTIC, "Error: " + msg);
        this.errorsList.add(error);
    }
}