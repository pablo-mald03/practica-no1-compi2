package com.pablocompany.practica.no1.compi2.domain.highlight;

import java.awt.Color;

/**
 *
 * @author pablo03
 */
public enum TokenStyle {

    DEFAULT(new Color(40, 40, 40)),
    NUMBER(new Color(9, 134, 88)),
    IDENTIFIER(new Color(0, 92, 197)),
    KEYWORD(new Color(175, 0, 219)),
    COMMENT(new Color(0, 128, 0)),
    STRING(new Color(163, 21, 21)),
    ERROR(new Color(211, 47, 47));

    private final Color style;

    private TokenStyle(Color style) {
        this.style = style;
    }

    public Color getStyle() {
        return style;
    }

}
