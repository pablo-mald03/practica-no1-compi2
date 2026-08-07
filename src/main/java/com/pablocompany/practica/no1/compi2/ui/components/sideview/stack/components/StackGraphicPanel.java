
package com.pablocompany.practica.no1.compi2.ui.components.sideview.stack.components;

import com.pablocompany.practica.no1.compi2.infrastructure.themes.Theme;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.JPanel;

/**
 *
 * @author pablo03
 */
//This class is the principal graphic panel to ilustrate the STACK
public class StackGraphicPanel extends JPanel {

    public StackGraphicPanel() {
        setBackground(Theme.SIDEBAR_DARKT.getColorSet());

        // TODO: quit temporal border 
        setBorder(BorderFactory.createTitledBorder(
                BorderFactory.createLineBorder(Theme.SIDEBAR_LIGHT.getColorSet()),
                "Visualizador de Pila",
                0, 0,
                new Font("Liberation Mono", Font.BOLD, 12),
                Theme.FOREGROUND_DARK.getColorSet()
        ));
    }

}
