package com.pablocompany.practica.no1.compi2.infrastructure.service;

import com.pablocompany.practica.no1.compi2.infrastructure.errors.CompilerError;
import com.pablocompany.practica.no1.compi2.infrastructure.themes.AstColors;
import com.pablocompany.practica.no1.compi2.infrastructure.themes.Theme;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.awt.*;
import java.util.List;

//This class can ilustrate the tree generated derivations
public class GraphvizTreeGeneratorService {
    private StringBuilder dotCode;
    private int nodeCounter;

    // Service to generate the dot format code
    public String generateDotFormat(ParseTree parseTree, Parser parser, List<CompilerError> parserErrors) {

        dotCode = new StringBuilder();
        nodeCounter = 0;

        dotCode.append("digraph ParseTree {\n");

        dotCode.append("  graph [bgcolor=\"")
                .append(toHex(Theme.BACKGROUND_DARK.getColorSet()))
                .append("\"];\n");

        dotCode.append("  node [")
                .append("shape=box, ")
                .append("fontname=\"Liberation Mono\", ")
                .append("fontcolor=\"")
                .append(toHex(Theme.FOREGROUND_DARK.getColorSet()))
                .append("\"")
                .append("];\n");

        dotCode.append("  edge [color=\"")
                .append(toHex(AstColors.PARSE_EDGE_DARK.getColorSet()))
                .append("\"];\n");

        traverse(parseTree, parser, parserErrors, ++nodeCounter);

        dotCode.append("}\n");

        return dotCode.toString();
    }

    private void traverse(ParseTree node, Parser parser, List<CompilerError> parserErrors, int myId) {

        String label;
        Color fillColor;
        Color borderColor;

        if (isErrorNode(node, parserErrors)) {

            label = node.getText().replace("\"", "\\\"");

            fillColor = AstColors.PARSE_ERROR_DARK.getColorSet();

            borderColor = AstColors.PARSE_ERROR_BORDER_DARK.getColorSet();

        } else if (node instanceof TerminalNode) {

            label = node.getText().replace("\"", "\\\"");

            fillColor = AstColors.PARSE_TERMINAL_DARK.getColorSet();

            borderColor = AstColors.PARSE_TERMINAL_BORDER_DARK.getColorSet();

        } else {
            int ruleIndex = ((org.antlr.v4.runtime.RuleContext) node).getRuleIndex();

            label = parser.getRuleNames()[ruleIndex];

            fillColor = AstColors.PARSE_NODE_DARK.getColorSet();

            borderColor = AstColors.PARSE_NODE_BORDER_DARK.getColorSet();
        }

        dotCode.append("  node")
                .append(myId)
                .append(" [")
                .append("label=\"")
                .append(label)
                .append("\", ")
                .append("style=\"filled\", ")
                .append("fillcolor=\"")
                .append(toHex(fillColor))
                .append("\", ")
                .append("color=\"")
                .append(toHex(borderColor))
                .append("\"")
                .append("];\n");

        // Child recursive iteration
        for (int i = 0; i < node.getChildCount(); i++) {

            ParseTree child = node.getChild(i);

            int childId = ++nodeCounter;

            dotCode.append("  node").append(myId).append(" -> node").append(childId).append(";\n");

            traverse(child, parser, parserErrors, childId);
        }
    }

    /*
     * This method converts RGB to Graphviz HEX format.
     */
    private String toHex(Color color) {

        return String.format(
                "#%02X%02X%02X",
                color.getRed(),
                color.getGreen(),
                color.getBlue()
        );
    }

    /*This method evaluate the error*/
    private boolean isErrorNode(ParseTree node, List<CompilerError> parserErrors) {

        if (!(node instanceof TerminalNode terminalNode)) {
            return false;
        }

        Token token = terminalNode.getSymbol();

        return parserErrors.stream()
                .anyMatch(error ->
                        error.getLine() == token.getLine()
                                && error.getColumn() == token.getCharPositionInLine()
                );
    }
}