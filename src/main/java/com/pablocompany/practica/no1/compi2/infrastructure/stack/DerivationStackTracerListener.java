package com.pablocompany.practica.no1.compi2.infrastructure.stack;

import com.pablocompany.practica.no1.compi2.compiler.logic.CodexLatinusParser;
import com.pablocompany.practica.no1.compi2.compiler.logic.CodexLatinusParserBaseListener;
import com.pablocompany.practica.no1.compi2.domain.parsingstep.ActionType;
import com.pablocompany.practica.no1.compi2.domain.parsingstep.ElementType;
import com.pablocompany.practica.no1.compi2.domain.parsingstep.ParseStep;
import com.pablocompany.practica.no1.compi2.domain.parsingstep.StackElement;
import lombok.Getter;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.ArrayList;
import java.util.List;

//This listener can write the derivations in the analysis
@Getter
public class DerivationStackTracerListener extends CodexLatinusParserBaseListener {

    private final List<ParseStep> steps = new ArrayList<>();
    private int stepCounter = 1;

    private final List<StackElement> emulatedStack = new ArrayList<>();

    //Constructor for the initial derivation
    public DerivationStackTracerListener() {
        snapshot("Pila Vacia", ActionType.INITIAL);
    }

    //This method returns the emulated stack
    private void snapshot(String actionLabel, ActionType actionType) {
        ParseStep step = new ParseStep(stepCounter++, actionLabel, actionType);

        for (StackElement element : emulatedStack) {
            step.addElement(element);
        }
        steps.add(step);
    }

    // This is the SHIFT step: When the listener reads any terminal its like a shift
    @Override
    public void visitTerminal(TerminalNode node) {
        String text = node.getText();

        if (text.equals("<EOF>")) return;

        emulatedStack.add(new StackElement(text, ElementType.TERMINAL));
        snapshot("shift " + text, ActionType.SHIFT);
    }

    //This method add a SHIFT LIKE A CONTINUE THE ANALYSIS
    //BECAUSE ANTLR DONT STOP THE SYNTACTIC ANALYSIS (You can find it in the official documentation)
    @Override
    public void visitErrorNode(ErrorNode node) {
        String errorText = node.getText();
        emulatedStack.add(new StackElement(errorText, ElementType.ERROR));
        snapshot("error " + errorText, ActionType.ERROR);
    }

    // THis method add a REDUCE: When the parser leave a rule this is the moment like a reduce (but its not a reduce rule)
    @Override
    public void exitEveryRule(ParserRuleContext ctx) {
        String ruleName = CodexLatinusParser.ruleNames[ctx.getRuleIndex()];
        int childCount = ctx.getChildCount();

        for (int i = 0; i < childCount; i++) {
            if (!emulatedStack.isEmpty()) {
                emulatedStack.remove(emulatedStack.size() - 1);
            }
        }

        emulatedStack.add(new StackElement(ruleName, ElementType.NON_TERMINAL));
        snapshot("reduce " + ruleName, ActionType.REDUCE);
    }
}