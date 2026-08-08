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

        //TODO: HARDCODED DATA
        String graphviz = """
                          digraph AST {
                              node [shape=box, fontname="DejaVu Sans Mono", fillcolor="#2d2d2d", fontcolor="#ffffff", style="filled", margin="0.2,0.1"];
                              edge [color="#8ab4f8", penwidth=1.5];
                          
                              root [label="Programa Principal", fillcolor="#1e3a8a"];
                              decl [label="Declaración Variable\nint x = 10"];
                              asig [label="Asignación\nx = x + 5"];
                              suma [label="Operación: +"];
                              var1 [label="Variable: x"];
                              lit1 [label="Literal: 5"];
                              print [label="Imprimir(x)"];
                          
                              root -> decl;
                              root -> asig;
                              root -> print;
                          
                              asig -> var1;
                              asig -> suma;
                          
                              suma -> var2 [label="izq"];
                              suma -> lit1 [label="der"];
                          
                              var2 [label="Variable: x"];
                              print -> var3;
                              var3 [label="Variable: x"];
                          }
                          """;
        
        renderAstTree(graphviz);
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
    public void renderAstTree(String graphvizCode) {
        this.astVisualizerPanel.renderAst(graphvizCode);
    }

    //Method to set the compiled code
    public void setPiglatinCode(String code) {
        this.pigLatinPanel.setCode(code);
    }
    
    //Method to set the the stack view
    public void setStackView(List<ParseStep> steps){
        this.parseStackPanel.setStackList(steps);
    }
}
