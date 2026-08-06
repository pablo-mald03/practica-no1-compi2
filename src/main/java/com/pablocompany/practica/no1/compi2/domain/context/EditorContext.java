/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pablocompany.practica.no1.compi2.domain.context;

import com.ibm.icu.text.SymbolTable;
import com.pablocompany.practica.no1.compi2.infrastructure.errors.CompilerError;
import java.util.List;
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

    private List<Token> tokens;

    private List<CompilerError> compilerErrors;

    private List<Token> hiddenTokens;

    private ParseTree parseTree;

    private Object ast;

    private SymbolTable symbolTable;
}
