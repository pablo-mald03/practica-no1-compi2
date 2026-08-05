package com.pablocompany.practica.no1.compi2.infrastructure.lexical;

import com.pablocompany.practica.no1.compi2.compiler.generated.CodexLatinusLexer;
import com.pablocompany.practica.no1.compi2.domain.highlight.TokenStyle;
import com.pablocompany.practica.no1.compi2.domain.highlight.TokenStyleProvider;
import org.antlr.v4.runtime.Token;

/**
 *
 * @author pablo03
 */
//This class provides the color for the tokens
public class TokenStyleResolver implements TokenStyleProvider {

    @Override
    public TokenStyle style(Token token) {

        switch (token.getType()) {

            case CodexLatinusLexer.INT:

                return TokenStyle.NUMBER;

            case Token.INVALID_TYPE:
                return TokenStyle.ERROR;

            case CodexLatinusLexer.ID:

                return TokenStyle.IDENTIFIER;

            default:
                return TokenStyle.DEFAULT;
        }
    }

}
