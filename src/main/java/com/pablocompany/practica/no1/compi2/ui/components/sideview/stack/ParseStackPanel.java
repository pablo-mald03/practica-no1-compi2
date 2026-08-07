package com.pablocompany.practica.no1.compi2.ui.components.sideview.stack;

import com.pablocompany.practica.no1.compi2.domain.parsingstep.ActionType;
import com.pablocompany.practica.no1.compi2.domain.parsingstep.ElementType;
import com.pablocompany.practica.no1.compi2.domain.parsingstep.ParseStep;
import com.pablocompany.practica.no1.compi2.domain.parsingstep.StackElement;
import com.pablocompany.practica.no1.compi2.infrastructure.themes.Theme;
import com.pablocompany.practica.no1.compi2.ui.components.sideview.stack.components.StackBottomPanel;
import com.pablocompany.practica.no1.compi2.ui.components.sideview.stack.components.StackControlsPanel;
import com.pablocompany.practica.no1.compi2.ui.components.sideview.stack.components.StackGraphicPanel;
import java.awt.BorderLayout;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
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
    private final JScrollPane visualScrollPane;

    public ParseStackPanel() {
        setLayout(new BorderLayout());

        topContainer = new JPanel(new BorderLayout());
        topContainer.setBackground(Theme.BACKGROUND_DARK.getColorSet());

        visualPanel = new StackGraphicPanel();
        controlsPanel = new StackControlsPanel();
        bottomStackPanel = new StackBottomPanel();

        visualScrollPane = new JScrollPane(visualPanel);
        visualScrollPane.setBorder(null);
        visualScrollPane.getViewport().setBackground(Theme.SIDEBAR_DARKT.getColorSet());
        visualScrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        visualScrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);

        topContainer.add(visualScrollPane, BorderLayout.CENTER);
        topContainer.add(controlsPanel, BorderLayout.SOUTH);

        splitPane = new JSplitPane(JSplitPane.VERTICAL_SPLIT, topContainer, bottomStackPanel);
        splitPane.setDividerLocation(400);
        splitPane.setDividerSize(5);
        splitPane.setContinuousLayout(true);
        splitPane.setBorder(null);

        add(splitPane, BorderLayout.CENTER);

        setupListeners();
    }

    /*
     * Suscribe the service to action listeners buttons
     */
    private void setupListeners() {
        controlsPanel.getBtnNext().addActionListener(e -> {
            visualPanel.nextStep();
            logCurrentStepAction();
        });

        controlsPanel.getBtnBack().addActionListener(e -> {
            visualPanel.prevStep();
            logCurrentStepAction();
        });

        controlsPanel.getBtnFinish().addActionListener(e -> {
            visualPanel.finishSteps();
            logCurrentStepAction();
        });
    }

    /*
     * This method prints the current action
     */
    private void logCurrentStepAction() {
        ParseStep currentStep = visualPanel.getCurrentStep();
        if (currentStep == null) {
            return;
        }

        String logText = String.format("[Paso %d] -> %s", currentStep.getStepNumber(), currentStep.getActionLabel());

        if (currentStep.getActionType() == ActionType.SHIFT) {
            bottomStackPanel.getStackLogConsole().appendInfo(logText);
        } else if (currentStep.getActionType() == ActionType.REDUCE) {
            bottomStackPanel.getStackLogConsole().appendSuccess(logText);
        } else {
            bottomStackPanel.getStackLogConsole().appendWarn(logText);
        }
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

    public void setStackList(List<ParseStep> steps) {
        this.visualPanel.loadSteps(steps);
        this.bottomStackPanel.getStackLogConsole().clear();
        logCurrentStepAction();
    }

    public void showGraphicStack() {
        List<ParseStep> steps = getMockedData();
        setStackList(steps);
    }

    // HARDCODED DATA
    private List<ParseStep> getMockedData() {

        List<ParseStep> mockup = new ArrayList<>();

        ParseStep s1 = new ParseStep(1, "Pila Vacia", ActionType.INITIAL);

        mockup.add(s1);

        ParseStep s2 = new ParseStep(2, "shift (", ActionType.SHIFT);

        s2.addElement(new StackElement("(", ElementType.TERMINAL));

        mockup.add(s2);

        ParseStep s3 = new ParseStep(3, "shift 3", ActionType.SHIFT);

        s3.addElement(new StackElement("(", ElementType.TERMINAL));

        s3.addElement(new StackElement("3", ElementType.TERMINAL));

        mockup.add(s3);

        ParseStep s4 = new ParseStep(4, "reduce F->3", ActionType.REDUCE);

        s4.addElement(new StackElement("(", ElementType.TERMINAL));

        s4.addElement(new StackElement("F", ElementType.NON_TERMINAL));

        mockup.add(s4);

        return mockup;

    }
}
