/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pablocompany.practica.no1.compi2.domain.context;

import com.ibm.icu.text.SymbolTable;
import com.pablocompany.practica.no1.compi2.domain.highlight.ErrorType;
import com.pablocompany.practica.no1.compi2.infrastructure.errors.CompilerError;
import com.pablocompany.practica.no1.compi2.infrastructure.semantic.Environment;
import com.pablocompany.practica.no1.compi2.infrastructure.semantic.Symbol;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ParseTree;

/**
 *
 * @author pablo03
 */
@Data
public class EditorContext {

    private String sourceCode;

    private List<Token> tokens = new ArrayList<>();

    private List<CompilerError> compilerErrors = new ArrayList<>();

    private List<Token> hiddenTokens = new ArrayList<>();

    private ParseTree parseTree;

    private Object ast;

    private String compiledCode;

    private Environment globalEnvironment;

    //Pointer to the current enviroment in runtime
    private Environment currentEnvironment;

    //This method add an new error to the list
    public void addLexicalError(String lexeme, int line, int column) {
        this.compilerErrors.add(new CompilerError(lexeme, line, column, ErrorType.LEXIC, "Caracter no definido en el lenguaje"));
    }

    /*The method clears the arraylist*/
    public void clearCompilerErrors() {
        this.compilerErrors.clear();
    }

    public EditorContext() {
        // Inicializamos el global

        this.tokens = new ArrayList<>();

        this.compilerErrors = new ArrayList<>();

        this.hiddenTokens = new ArrayList<>();
        this.globalEnvironment = new Environment("Global");
        this.currentEnvironment = this.globalEnvironment;
    }

    //This method create a new scope into the global enviroment
    public void enterScope(String scopeName) {
        currentEnvironment = new Environment(currentEnvironment, scopeName);
    }

    //This method closes the pointer to the current enviroment and returns up to the principal scope
    public void exitScope() {
        if (currentEnvironment.getParent() != null) {
            currentEnvironment = currentEnvironment.getParent();
        }
    }

    //This method returns the globalEnviromnment
    public Environment getGlobalEnvironment() {
        return globalEnvironment;
    }
}
