package com.pablocompany.practica.no1.compi2.ui.components;

import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

/**
 *
 * @author pablo03
 */
public class ConsolePanel extends JPanel {

    private final JTextArea console;

    public ConsolePanel() {

        setLayout(new BorderLayout());

        console = new JTextArea();

        console.setEditable(false);

        add(new JScrollPane(console), BorderLayout.CENTER);

    }

    public void clear() {

        console.setText("");

    }

    public void append(String text) {

        console.append(text + "\n");

    }

    public void appendError(String text) {

        console.append("[ERROR] " + text + "\n");

    }

}
