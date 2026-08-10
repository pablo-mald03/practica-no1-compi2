package com.pablocompany.practica.no1.compi2.ui.components.sideview;

import com.pablocompany.practica.no1.compi2.domain.parsingstep.ParseStep;
import com.pablocompany.practica.no1.compi2.infrastructure.themes.Theme;
import com.pablocompany.practica.no1.compi2.ui.components.sideview.astviewer.AstVisualizerPanel;
import com.pablocompany.practica.no1.compi2.ui.components.sideview.piglatin.PigLatinPanel;
import com.pablocompany.practica.no1.compi2.ui.components.sideview.stack.ParseStackPanel;
import java.awt.BorderLayout;
import java.util.List;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.UIManager;

/**
 *
 * @author pablo03
 */
public class SidePanel extends JPanel {

    private final JTabbedPane tabs;
    private final PigLatinPanel pigLatinPanel;
    private final AstVisualizerPanel astVisualizerPanel;
    private final ParseStackPanel parseStackPanel;

    public SidePanel() {
        setLayout(new BorderLayout());

        UIManager.put("TabbedPane.selected", Theme.STATUS_BAR_DARK.getColorSet());
        UIManager.put("TabbedPane.background", Theme.SURFACE_DARK.getColorSet());
        UIManager.put("TabbedPane.foreground", Theme.FOREGROUND_DARK.getColorSet());
        UIManager.put("TabbedPane.selectedForeground", Theme.FOREGROUND_LIGHT.getColorSet());

        tabs = new JTabbedPane();

        pigLatinPanel = new PigLatinPanel();
        astVisualizerPanel = new AstVisualizerPanel();
        parseStackPanel = new ParseStackPanel();

        tabs.setForeground(Theme.FOREGROUND_DARK.getColorSet());
        tabs.setBackground(Theme.SIDEBAR_DARKT.getColorSet());

        tabs.addTab("PigLatin", pigLatinPanel);
        tabs.addTab("AST Generado", astVisualizerPanel);
        tabs.addTab("Pila de Procesos", parseStackPanel);

        add(tabs, BorderLayout.CENTER);
    }

    /*
     * Focus to the Pig latin panel
     */
    public void focusPigLatin() {
        tabs.setSelectedComponent(pigLatinPanel);
    }

    /*
     * Focus to the Ast visualizer panel
     */
    public void focusAst() {
        tabs.setSelectedComponent(astVisualizerPanel);
    }

    //Method to focus de stack view
    public void focusParseStack() {
        tabs.setSelectedComponent(parseStackPanel);
    }

    //Method to focus de stack view
    public void focusParseStackByStep() {
        tabs.setSelectedComponent(parseStackPanel);
        parseStackPanel.showGraphicStackByStep();
    }

    //Method to return the piglatin panel
    public PigLatinPanel getPigLatinPanel() {
        return pigLatinPanel;
    }

    //Method to render the ast panel
    //TODO: HARDCODED DATA PENDING THE REAL AST TYPE
    public void renderAstTree(String ast) {
        if (ast == null) {
            this.astVisualizerPanel.clear();
            return;
        }

        this.astVisualizerPanel.renderAst(ast);
    }

    //Method to set the compiled code
    public void setPiglatinCode(String code) {
        this.pigLatinPanel.setCode(code);
    }

    //Method to set the the stack view
    public void setStackView(List<ParseStep> steps) {
        this.parseStackPanel.setStackList(steps);
    }
}
