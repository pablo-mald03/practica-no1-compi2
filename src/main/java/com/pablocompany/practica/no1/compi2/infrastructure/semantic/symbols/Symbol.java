package com.pablocompany.practica.no1.compi2.infrastructure.semantic.symbols;

import com.pablocompany.practica.no1.compi2.domain.semantic.childs.expressions.types.TypeNode;
import com.pablocompany.practica.no1.compi2.infrastructure.semantic.symbols.enums.SymbolKind;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author pablo03
 */
//This class represents a symbol from the SymbolTable

@Getter
@Setter
public class Symbol {

    //All needed propertys
    private final String id;
    private final SymbolKind kind;
    private final TypeNode type;
    private final int line;
    private final int column;

    //Scopes
    private String scope;
    private int depth;

    //This is the principal attribute property
    private boolean isInitialized;
    private boolean isUsed;
    private boolean isArray;
    private Integer arraySize;
    private boolean isFunction;

    //For procedures or functions
    private List<Symbol> parameters;
    private TypeNode returnType;

    //For struct types
    private List<Symbol> structFields;

    // Constructor para VARIABLES
    public Symbol(String id, SymbolKind kind, TypeNode type, int line, int column) {
        this.id = id;
        this.kind = kind;
        this.type = type;
        this.line = line;
        this.column = column;
        this.parameters = new ArrayList<>();
        this.structFields = new ArrayList<>();
        this.isInitialized = false;
        this.isUsed = false;
        this.isArray = false;
    }

    // Constructor para ARRAYS
    public Symbol(String id, SymbolKind kind, TypeNode type, int line, int column,
                  boolean isArray, Integer arraySize) {
        this(id, kind, type, line, column);
        this.isArray = isArray;
        this.arraySize = arraySize;
    }

    // Constructor para FUNCIONES
    public Symbol(String id, SymbolKind kind, TypeNode returnType, int line, int column, boolean isFunction) {
        this(id, kind, returnType, line, column);
        this.isFunction = isFunction;
        this.returnType = returnType;
        this.parameters = new ArrayList<>();
        this.structFields = new ArrayList<>();
    }

    // Constructor para STRUCTS
    public Symbol(String id, TypeNode type, SymbolKind kind, int line, int column) {
        this(id, kind, type, line, column);
        this.structFields = new ArrayList<>();
        this.parameters = new ArrayList<>();
    }


    //This is the principal method to add any parameters
    public void addParameter(Symbol param) {
        this.parameters.add(param);
    }

    //This is the principal method to add any struct field
    public void addStructField(Symbol field) {
        this.structFields.add(field);
    }

}
