package com.pablocompany.practica.no1.compi2.ui.components.bottom;

import com.pablocompany.practica.no1.compi2.infrastructure.errors.CompilerError;
import com.pablocompany.practica.no1.compi2.infrastructure.semantic.Symbol;
import com.pablocompany.practica.no1.compi2.infrastructure.themes.Theme;
import com.pablocompany.practica.no1.compi2.ui.components.bottom.panels.console.ConsolePanel;
import com.pablocompany.practica.no1.compi2.ui.components.bottom.panels.errors.ErrorsPanel;
import com.pablocompany.practica.no1.compi2.ui.components.bottom.panels.symbols.SymbolTablePanel;
import java.awt.BorderLayout;
import java.util.List;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.UIManager;

/**
 *
 * @author pablo03
 */
public class BottomTabbedPanel extends JPanel {

    private final JTabbedPane tabs;
    private final ConsolePanel console;
    private final ErrorsPanel errorsTable;
    private final SymbolTablePanel symbolTablePanel;

    public BottomTabbedPanel() {
        setLayout(new BorderLayout());

        UIManager.put("TabbedPane.selected", Theme.STATUS_BAR_DARK.getColorSet());
        UIManager.put("TabbedPane.background", Theme.SURFACE_DARK.getColorSet());
        UIManager.put("TabbedPane.foreground", Theme.FOREGROUND_DARK.getColorSet());
        UIManager.put("TabbedPane.selectedForeground", Theme.FOREGROUND_LIGHT.getColorSet());

        tabs = new JTabbedPane();

        console = new ConsolePanel();
        errorsTable = new ErrorsPanel();
        symbolTablePanel = new SymbolTablePanel();

        tabs.setForeground(Theme.FOREGROUND_DARK.getColorSet());
        tabs.setBackground(Theme.SIDEBAR_DARKT.getColorSet());

        tabs.addTab("Consola", console);
        tabs.addTab("Errores", errorsTable);
        tabs.addTab("Tabla de Simbolos", symbolTablePanel);

        add(tabs, BorderLayout.CENTER);
    }

    /*
     * Focus to the Symbols Table panel
     */
    public void showSymbolsTable() {
        tabs.setSelectedComponent(symbolTablePanel);
    }

    /*
     * Focus to the Console panel
     */
    public void showConsole() {
        tabs.setSelectedComponent(console);
    }

    /*
     * Focus to the Error panel
     */
    public void showErrors() {
        tabs.setSelectedComponent(errorsTable);
    }

    //This method notify the errors
    public void switchToErrorsIfAny(boolean hasErrors) {
        if (hasErrors) {
            showErrors();
        } else {
            showConsole();
        }
    }

    public ConsolePanel getConsole() {
        return console;
    }

    public ErrorsPanel getErrors() {
        return errorsTable;
    }

    /*SECTION OF METHODS TO SET THE ERRORS TO THE ERROR PANEL*/
    public void setCompilerErrors(List<CompilerError> compilerErrors) {
        errorsTable.loadErrors(compilerErrors);
    }

    /*SECTION OF METHODS TO SET THE TABLE TO THE SYMBOL TABLE*/
    public void setSymbols(List<Symbol> symbols) {
        symbolTablePanel.loadSymbols(symbols);
    }
}
