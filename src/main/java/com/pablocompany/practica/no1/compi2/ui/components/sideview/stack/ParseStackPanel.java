package com.pablocompany.practica.no1.compi2.ui.components.sideview.stack;

import com.pablocompany.practica.no1.compi2.infrastructure.themes.Theme;
import com.pablocompany.practica.no1.compi2.ui.components.sideview.stack.components.StackBottomPanel;
import com.pablocompany.practica.no1.compi2.ui.components.sideview.stack.components.StackControlsPanel;
import com.pablocompany.practica.no1.compi2.ui.components.sideview.stack.components.StackGraphicPanel;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JSplitPane;

/**
 *
 * @author pablo03
 */
//This class is the panel that represents the stack view step by step
public class ParseStackPanel extends JPanel {

    private final JSplitPane splitPane;
    private final JPanel topContainer;

    private final StackGraphicPanel visualPanel;
    private final StackControlsPanel controlsPanel;
    private final StackBottomPanel bottomStackPanel;

    public ParseStackPanel() {
        setLayout(new BorderLayout());

        topContainer = new JPanel(new BorderLayout());
        topContainer.setBackground(Theme.BACKGROUND_DARK.getColorSet());

        visualPanel = new StackGraphicPanel();
        controlsPanel = new StackControlsPanel();
        bottomStackPanel = new StackBottomPanel();

        topContainer.add(visualPanel, BorderLayout.CENTER);
        topContainer.add(controlsPanel, BorderLayout.SOUTH);

        splitPane = new JSplitPane(JSplitPane.VERTICAL_SPLIT, topContainer, bottomStackPanel);
        splitPane.setDividerLocation(400);
        splitPane.setDividerSize(5);
        splitPane.setContinuousLayout(true);
        splitPane.setBorder(null);

        add(splitPane, BorderLayout.CENTER);
    }

    public StackGraphicPanel getVisualPanel() {
        return visualPanel;
    }

    public StackControlsPanel getControlsPanel() {
        return controlsPanel;
    }

    public StackBottomPanel getBottomStackPanel() {
        return bottomStackPanel;
    }
}
