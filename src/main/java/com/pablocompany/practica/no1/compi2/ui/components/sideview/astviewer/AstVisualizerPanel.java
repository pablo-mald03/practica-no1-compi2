/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pablocompany.practica.no1.compi2.ui.components.sideview.astviewer;

import guru.nidi.graphviz.engine.Format;
import guru.nidi.graphviz.engine.Graphviz;
import guru.nidi.graphviz.model.MutableGraph;
import guru.nidi.graphviz.parse.Parser;
import java.awt.BorderLayout;
import java.awt.image.BufferedImage;
import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.SwingWorker;

/**
 *
 * @author pablo03
 */
public class AstVisualizerPanel extends JPanel {

    private final AstGraphViewerPanel viewerPanel;
    private final JScrollPane scrollPane;

    public AstVisualizerPanel() {
        setLayout(new BorderLayout());

        viewerPanel = new AstGraphViewerPanel();

        scrollPane = new JScrollPane(viewerPanel);
        scrollPane.setBorder(BorderFactory.createEmptyBorder());
        scrollPane.getVerticalScrollBar().setUnitIncrement(16);
        scrollPane.getHorizontalScrollBar().setUnitIncrement(16);

        add(scrollPane, BorderLayout.CENTER);
    }

    /*
     * Method that render the ast 
     */
    public void renderAst(String dotNotation) {
        if (dotNotation == null || dotNotation.isEmpty()) {
            return;
        }

        viewerPanel.setLoading(true);

        SwingWorker<BufferedImage, Void> worker = new SwingWorker<>() {
            @Override
            protected BufferedImage doInBackground() throws Exception {
                MutableGraph g = new Parser().read(dotNotation);
                return Graphviz.fromGraph(g).render(Format.PNG).toImage();
            }

            @Override
            protected void done() {
                try {
                    BufferedImage img = get();
                    viewerPanel.setImage(img);
                } catch (Exception e) {
                    System.err.println("Error al renderizar el AST en segundo plano: " + e.getMessage());
                    viewerPanel.setLoading(false);
                }
            }
        };

        worker.execute();
    }
    
    /*
     * Method to clear the renderizated AST
     */
    public void clear() {
        viewerPanel.clear();
    }
}
