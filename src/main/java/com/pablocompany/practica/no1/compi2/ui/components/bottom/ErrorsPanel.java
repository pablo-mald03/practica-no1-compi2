package com.pablocompany.practica.no1.compi2.ui.components.bottom;

import com.pablocompany.practica.no1.compi2.infrastructure.themes.Theme;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;
import javax.swing.text.BadLocationException;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledDocument;

/**
 *
 * @author pablo03
 */
//This clas can show the errors
public class ErrorsPanel extends JPanel {

    private final JTextPane errorsPane;
    private final StyledDocument doc;

    private static final Color COLOR_ERROR = new Color(255, 83, 112);

    public ErrorsPanel() {
        setLayout(new BorderLayout());

        errorsPane = new JTextPane();
        errorsPane.setEditable(false);
        errorsPane.setFont(new Font("Consolas", Font.PLAIN, 13));

        Color bgDark = Theme.SIDEBAR_DARKT.getColorSet();
        errorsPane.setBackground(bgDark);
        errorsPane.setCaretColor(Theme.FOREGROUND_DARK.getColorSet());

        doc = errorsPane.getStyledDocument();

        JScrollPane scrollPane = new JScrollPane(errorsPane);
        scrollPane.setBorder(null);

        add(scrollPane, BorderLayout.CENTER);
    }

    public void addError(String line, String column, String message) {
        SimpleAttributeSet errorStyle = new SimpleAttributeSet();
        StyleConstants.setForeground(errorStyle, COLOR_ERROR);
        StyleConstants.setBold(errorStyle, true);

        String errorMsg = String.format("[Error en L:%s, C:%s] %s\n", line, column, message);

        try {
            doc.insertString(doc.getLength(), errorMsg, errorStyle);
            errorsPane.setCaretPosition(doc.getLength());
        } catch (BadLocationException e) {
            System.out.println("Error at the panel for errors");
        }
    }

    public void clear() {
        try {
            doc.remove(0, doc.getLength());
        } catch (BadLocationException e) {
            System.out.println("Error at the panel for errors");
        }
    }
}
