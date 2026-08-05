package com.pablocompany.practica.no1.compi2.domain.highlight;

import org.antlr.v4.runtime.Token;

/**
 *
 * @author pablo03
 */
/*This inteface determinate the style for the token*/
public interface TokenStyleProvider {

    TokenStyle style(Token token);
}
