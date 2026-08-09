package com.pablocompany.practica.no1.compi2.infrastructure.service;

import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;

public class GraphvizTreeGeneratorService {
    private StringBuilder dotCode;
    private int nodeCounter;

    //Service to generate the dot format code
    public String generateDotFormat(ParseTree parseTree, Parser parser) {
        dotCode = new StringBuilder();
        nodeCounter = 0;

        dotCode.append("digraph ParseTree {\n");
        dotCode.append("  node [shape=box, fontname=\"Liberation Mono\"];\n");

        traverse(parseTree, parser, ++nodeCounter);

        dotCode.append("}\n");
        return dotCode.toString();
    }

    //This method can graficate the parseTree
    private void traverse(ParseTree node, Parser parser, int myId) {
        String label;

        if (node instanceof TerminalNode) {
            label = node.getText().replace("\"", "\\\"");
        } else {
            int ruleIndex = ((org.antlr.v4.runtime.RuleContext) node).getRuleIndex();
            label = parser.getRuleNames()[ruleIndex];
        }

        dotCode.append("  node").append(myId).append(" [label=\"").append(label).append("\"];\n");

        //Child recursive iteration
        for (int i = 0; i < node.getChildCount(); i++) {
            ParseTree child = node.getChild(i);
            int childId = ++nodeCounter;

            dotCode.append("  node").append(myId).append(" -> node").append(childId).append(";\n");

            traverse(child, parser, childId);
        }
    }
}