package com.pablocompany.practica.no1.compi2.ui.components.editor;

import com.pablocompany.practica.no1.compi2.application.mediator.WorkspaceNotifier;
import com.pablocompany.practica.no1.compi2.infrastructure.lexical.AntlrAnalyzer;
import com.pablocompany.practica.no1.compi2.ui.components.editor.codetext.CodeTextPane;
import com.pablocompany.practica.no1.compi2.infrastructure.themes.Theme;
import java.awt.BorderLayout;
import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;

/**
 *
 * @author pablo03
 */
/*Class used to represents a editor panel*/
public class CodeEditorPanel extends JPanel {

    private final CodeTextPane editor;
    private final LineNumberView lineNumbers;

    private final JScrollPane scroll;

    private final EditorStatusBar statusBar;

    public CodeEditorPanel() {

        setLayout(new BorderLayout());

        setBackground(Theme.SIDEBAR_LIGHT.getColorSet());

        editor = new CodeTextPane();

        editor.setBackground(Theme.BACKGROUND_DARK.getColorSet());
        editor.setForeground(Theme.FOREGROUND_DARK.getColorSet());

        scroll = new JScrollPane(editor);

        lineNumbers = new LineNumberView(editor);

        scroll.setRowHeaderView(lineNumbers);

        statusBar = new EditorStatusBar();

        add(scroll, BorderLayout.CENTER);

        add(statusBar, BorderLayout.SOUTH);

        setBorder(BorderFactory.createEmptyBorder());

        editor.setCaretColor(Theme.FOREGROUND_DARK.getColorSet());

        editor.addCaretListener(e -> updateCaretPosition());

        editor.setSyntaxHighlightListener(new AntlrAnalyzer());

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

    //This method is the principal to compile the code
    public boolean compile(WorkspaceNotifier notifier) {
        
        //TODO: HARCODED
        try {
            String code = getCode();

            notifier.logInfo("Lexer: Análisis iniciado...");

            notifier.logInfo("Parser: Construyendo AST...");

            boolean hasErrors = true; 

            if (hasErrors) {
                notifier.logError("Error de sintaxis en la línea 12.");
                return false;
            }

            notifier.logSuccess("AST construido correctamente.");
            return true;

        } catch (Exception e) {
            notifier.logError("Fallo crítico del compilador: " + e.getMessage());
            return false;
        }
    }

}
