package com.pablocompany.practica.no1.compi2.ui.components.editor;

import com.pablocompany.practica.no1.compi2.ui.components.themes.Theme;
import java.awt.BorderLayout;
import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;
import javax.swing.Timer;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

/**
 *
 * @author pablo03
 */
/*Class used to represents a editor panel*/
public class CodeEditorPanel extends JPanel {

    private final JTextPane editor;
    private final LineNumberView lineNumbers;

    private final JScrollPane scroll;

    private final EditorStatusBar statusBar;

    private Timer syntaxTimer;

    private static final int SYNTAX_DELAY = 250;

    public CodeEditorPanel() {

        setLayout(new BorderLayout());

        setBackground(Theme.SIDEBAR_LIGHT.getColorSet());

        editor = new JTextPane();

        editor.setBackground(Theme.BACKGROUND_LIGHT.getColorSet());
        editor.setForeground(Theme.FOREGROUND_LIGHT.getColorSet());

        scroll = new JScrollPane(editor);

        lineNumbers = new LineNumberView(editor);

        scroll.setRowHeaderView(lineNumbers);

        statusBar = new EditorStatusBar();

        add(scroll, BorderLayout.CENTER);

        add(statusBar, BorderLayout.SOUTH);

        setBorder(BorderFactory.createEmptyBorder());

        syntaxTimer = new Timer(SYNTAX_DELAY, e -> {

            syntaxTimer.stop();

            performSyntaxHighlight();

        });

        syntaxTimer.setRepeats(false);

        editor.getDocument().addDocumentListener(new DocumentListener() {

            @Override
            public void insertUpdate(DocumentEvent e) {

                scheduleHighlight();

            }

            @Override
            public void removeUpdate(DocumentEvent e) {

                scheduleHighlight();

            }

            @Override
            public void changedUpdate(DocumentEvent e) {

                scheduleHighlight();

            }

        });

        editor.addCaretListener(e -> updateCaretPosition());

    }

    //This method updates the caret position to the sidebar
    private void updateCaretPosition() {

        try {

            int caret = editor.getCaretPosition();

            int line = editor.getDocument()
                    .getDefaultRootElement()
                    .getElementIndex(caret);

            int lineStart = editor.getDocument()
                    .getDefaultRootElement()
                    .getElement(line)
                    .getStartOffset();

            int column = caret - lineStart;

            statusBar.updateCursor(line + 1, column + 1);

            lineNumbers.repaint();

        } catch (Exception ignored) {
            System.out.println("exception with caret");
        }

    }

    //Reset the debounce for highlight the code
    private void scheduleHighlight() {

        syntaxTimer.restart();

        lineNumbers.repaint();

    }

    //This method use the lexer to highlight the code
    private void performSyntaxHighlight() {

        String source = getCode();

        // TODO:
        // Lexer
        // Tokens
        // Styles
        // Pintado
    }

    public JTextPane getEditor() {

        return editor;

    }

    public String getCode() {

        return editor.getText();

    }

    public void setCode(String code) {

        editor.setText(code);

    }

    public EditorStatusBar getStatusBar() {

        return statusBar;

    }

}
