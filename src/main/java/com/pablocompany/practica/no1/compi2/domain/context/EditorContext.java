/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pablocompany.practica.no1.compi2.domain.context;

import com.ibm.icu.text.SymbolTable;
import com.pablocompany.practica.no1.compi2.domain.highlight.ErrorType;
import com.pablocompany.practica.no1.compi2.infrastructure.errors.CompilerError;
import java.util.ArrayList;
import java.util.List;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ParseTree;

/**
 *
 * @author pablo03
 */
@Data
@NoArgsConstructor
public class EditorContext {

    private String sourceCode;

    private List<Token> tokens = new ArrayList<>();

    private List<CompilerError> compilerErrors = new ArrayList<>();

    private List<Token> hiddenTokens = new ArrayList<>();

    private ParseTree parseTree;

    private Object ast;

    private SymbolTable symbolTable;
    
    
    //This method add an new error to the list
    public void addLexicalError(String lexeme, int line, int column){
        this.compilerErrors.add(new CompilerError(lexeme, line, column, ErrorType.LEXIC, "Caracter no definido en el lenguaje"));
    }
    
    /*The method clears the arraylist*/
    public void clearCompilerErrors(){
        this.compilerErrors.clear();
    }
}
