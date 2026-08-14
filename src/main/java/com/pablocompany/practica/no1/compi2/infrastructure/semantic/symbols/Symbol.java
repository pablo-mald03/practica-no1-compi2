package com.pablocompany.practica.no1.compi2.infrastructure.semantic.symbols;

import com.pablocompany.practica.no1.compi2.domain.semantic.childs.expressions.types.TypeNode;
import com.pablocompany.practica.no1.compi2.infrastructure.semantic.symbols.enums.SymbolKind;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author pablo03
 */
//This class represents a symbol from the SymbolTable

@Data
public class Symbol {

    private final String id;
    private final SymbolKind kind;
    private final TypeNode type;
    private final int line;
    private final int column;

    private String scope;
    private int depth;

    private boolean isInitialized;
    private boolean isUsed;
    private boolean isArray;
    private Integer arraySize;

    private List<Symbol> parameters;
    private TypeNode returnType;
    private List<Symbol> structFields;

    // Constructor for variables
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

    // Constructor for arrays
    public Symbol(String id, SymbolKind kind, TypeNode type, int line, int column,
                  boolean isArray, Integer arraySize) {
        this(id, kind, type, line, column);
        this.isArray = isArray;
        this.arraySize = arraySize;
    }

    // Constructor for functions/procedures
    public Symbol(String id, SymbolKind kind, TypeNode returnType, int line, int column,
                  boolean isFunction) {
        this(id, kind, returnType, line, column);
        this.returnType = returnType;
    }

    // Constructor for structs
    public Symbol(String id, SymbolKind kind, int line, int column) {
        this(id, kind, null, line, column);
    }

    public void addParameter(Symbol param) {
        this.parameters.add(param);
    }

    public void addStructField(Symbol field) {
        this.structFields.add(field);
    }

}
