package com.pablocompany.practica.no1.compi2.ui.components.bottom.panels.symbols;

import com.pablocompany.practica.no1.compi2.infrastructure.semantic.symbols.Symbol;
import com.pablocompany.practica.no1.compi2.infrastructure.themes.Theme;
import java.awt.BorderLayout;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

/**
 *
 * @author pablo03
 */
//This class is the representation for the symbols
public class SymbolTablePanel extends JPanel {

    private final SemanticTable symbolsTable;

    public SymbolTablePanel() {
        setLayout(new BorderLayout());
        setBackground(Theme.STATUS_BAR_DARK.getColorSet());

        symbolsTable = new SemanticTable();

        JScrollPane scrollPane = new JScrollPane(symbolsTable);
        scrollPane.setBorder(BorderFactory.createEmptyBorder());
        scrollPane.getViewport().setBackground(Theme.SIDEBAR_DARKT.getColorSet());

        add(scrollPane, BorderLayout.CENTER);
    }

    //This method load the symbols to the table
    public void loadSymbols(List<Symbol> symbols) {
        symbolsTable.loadSymbols(symbols);
    }

    //This method clears the table
    public void clear() {
        symbolsTable.clear();
    }

}
