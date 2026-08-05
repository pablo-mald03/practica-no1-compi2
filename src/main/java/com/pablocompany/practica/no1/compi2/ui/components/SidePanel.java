package com.pablocompany.practica.no1.compi2.ui.components;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author pablo03
 */
public class SidePanel extends JPanel {

    private final CardLayout cards;

    private final JPanel container;

    public SidePanel() {

        setLayout(new BorderLayout());

        cards = new CardLayout();

        container = new JPanel(cards);

        container.add(new JPanel(), "EMPTY");
        container.add(new JPanel(), "AST");
        container.add(new JPanel(), "DEBUG");

        add(container);

    }

    public void showCard(String card) {

        cards.show(container, card);

    }

}