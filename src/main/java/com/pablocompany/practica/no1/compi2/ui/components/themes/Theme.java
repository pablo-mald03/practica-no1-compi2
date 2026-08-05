package com.pablocompany.practica.no1.compi2.ui.components.themes;

import java.awt.Color;

/**
 *
 * @author pablo03
 */
/*Class used to declarate the principal colors*/
public enum Theme {
    
    BACKGROUND( new Color(40,44,52)),
    SURFACE( new Color(40,44,52)),
    SIDEBAR(new Color(45,45,45)),
    STATUS_BAR(new Color(52,58,64)),
    FOREGROUND(Color.WHITE),
    BORDER( new Color(70,70,70));
    
    private final Color colorSet;
    
    
    Theme(Color setColor){
        this.colorSet = setColor;
    }

    public Color getColorSet() {
        return colorSet;
    }
    
}
