package com.pablocompany.practica.no1.compi2.ui.components.bottom.panels.types;

import com.pablocompany.practica.no1.compi2.infrastructure.semantic.symbols.Symbol;
import com.pablocompany.practica.no1.compi2.infrastructure.themes.Theme;
import com.pablocompany.practica.no1.compi2.model.TypeInfo;
import com.pablocompany.practica.no1.compi2.ui.components.bottom.panels.symbols.SemanticTable;

import javax.swing.*;
import java.awt.*;
import java.util.List;

/**
 *
 * @author pablo03
 */
//This class is the representation for the symbols
public class TypesTablePanel extends JPanel {

    private final TypesTable typesTable;

    public TypesTablePanel() {
        setLayout(new BorderLayout());
        setBackground(Theme.STATUS_BAR_DARK.getColorSet());

        typesTable = new TypesTable();

        JScrollPane scrollPane = new JScrollPane(typesTable);
        scrollPane.setBorder(BorderFactory.createEmptyBorder());
        scrollPane.getViewport().setBackground(Theme.SIDEBAR_DARKT.getColorSet());

        add(scrollPane, BorderLayout.CENTER);
    }

    //This method load the symbols to the table
    public void loadSymbols(List<TypeInfo> symbols) {
        typesTable.loadSymbols(symbols);
    }

    //This method clears the table
    public void clear() {
        typesTable.clear();
    }

}
