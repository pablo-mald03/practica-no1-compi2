package com.pablocompany.practica.no1.compi2.infrastructure.errors;

import com.pablocompany.practica.no1.compi2.domain.highlight.ErrorType;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.IntervalSet;

import java.util.List;

//This class uses the parsing error list to add the parsing errors
public class CodexSyntaxErrorListener extends BaseErrorListener {

    private final List<CompilerError> errorsList;

    public CodexSyntaxErrorListener(List<CompilerError> errorsList) {
        this.errorsList = errorsList;
    }

    //This is the principal method to add the syntax error
    @Override
    public void syntaxError(Recognizer<?, ?> recognizer,
                            Object offendingSymbol,
                            int line,
                            int charPositionInLine,
                            String msg,
                            RecognitionException e) {

        String lexeme = getLexeme(offendingSymbol);
        String friendlyMessage = formatFriendlyMessage(recognizer, lexeme, msg, e);

        CompilerError error = new CompilerError(
                lexeme,
                line,
                charPositionInLine,
                ErrorType.SYNTACTIC,
                friendlyMessage
        );
        this.errorsList.add(error);
    }

    //This method format the error messages
    private String formatFriendlyMessage(Recognizer<?, ?> recognizer, String lexeme, String defaultMsg, RecognitionException e) {

        IntervalSet expectedIntervals = null;
        if (e != null && e.getExpectedTokens() != null) {
            expectedIntervals = e.getExpectedTokens();
        } else if (recognizer instanceof Parser) {
            expectedIntervals = ((Parser) recognizer).getExpectedTokens();
        }

        Vocabulary vocabulary = recognizer.getVocabulary();
        String expectedTokens = (expectedIntervals != null)
                ? expectedIntervals.toString(vocabulary)
                : "";

        if (e instanceof InputMismatchException) {
            return "Se esperaba " + expectedTokens + " pero se encontró '" + lexeme + "'";
        }

        if (e instanceof NoViableAltException) {
            return "Estructura sintáctica no válida cerca de '" + lexeme + "'";
        }

        if (defaultMsg.startsWith("missing")) {
            return "Falta el símbolo " + expectedTokens + " antes de '" + lexeme + "'";
        }

        if (defaultMsg.startsWith("extraneous input")) {
            return "Símbolo no esperado '" + lexeme + "'. Se esperaba " + expectedTokens;
        }

        return "Error de sintaxis cerca de '" + lexeme + "'";
    }

    //This method returns the lexeme of the production
    private String getLexeme(Object offendingSymbol) {
        if (offendingSymbol instanceof Token) {
            Token token = (Token) offendingSymbol;
            if (token.getType() == Token.EOF) {
                return "<Fin de Archivo>";
            }
            return token.getText();
        }
        return offendingSymbol != null ? offendingSymbol.toString() : "";
    }
}