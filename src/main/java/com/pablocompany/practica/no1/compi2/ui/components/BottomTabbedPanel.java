
package com.pablocompany.practica.no1.compi2.ui.components;

import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

/**
 *
 * @author pablo03
 */
public class BottomTabbedPanel extends JPanel {

    private final JTabbedPane tabs;

    private final ConsolePanel console;

    private final JPanel errors;

    private final JPanel tokens;

    private final JPanel symbols;

    private final JPanel debug;

    public BottomTabbedPanel() {

        setLayout(new BorderLayout());

        tabs = new JTabbedPane();

        console = new ConsolePanel();

        errors = new JPanel();

        tokens = new JPanel();

        symbols = new JPanel();

        debug = new JPanel();

        tabs.addTab("Console", console);

        tabs.addTab("Errors", errors);

        tabs.addTab("Tokens", tokens);

        tabs.addTab("Symbols", symbols);

        tabs.addTab("Debug", debug);

        add(tabs);

    }

    public ConsolePanel getConsole() {
        return console;

    }

}
