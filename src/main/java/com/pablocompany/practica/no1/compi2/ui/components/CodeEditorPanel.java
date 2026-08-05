package com.pablocompany.practica.no1.compi2.ui.components;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;

/**
 *
 * @author pablo03
 */
public class CodeEditorPanel extends JPanel {

    private final JTextPane editor;

    private final JScrollPane scroll;

    private final EditorStatusBar statusBar;

    public CodeEditorPanel() {

        setLayout(new BorderLayout());


        setBackground(new Color(40,44,52));

        editor = new JTextPane();

        editor.setBackground(new Color(30,30,30));
        editor.setForeground(Color.WHITE);

        scroll = new JScrollPane(editor);

        statusBar = new EditorStatusBar();

        add(scroll,BorderLayout.CENTER);

        add(statusBar,BorderLayout.SOUTH);

        setBorder(BorderFactory.createEmptyBorder());

    }

    public JTextPane getEditor(){

        return editor;

    }

    public String getCode(){

        return editor.getText();

    }

    public void setCode(String code){

        editor.setText(code);

    }

    public EditorStatusBar getStatusBar(){

        return statusBar;

    }

}
