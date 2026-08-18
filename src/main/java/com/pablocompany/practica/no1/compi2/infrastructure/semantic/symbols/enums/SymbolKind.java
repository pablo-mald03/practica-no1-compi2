package com.pablocompany.practica.no1.compi2.infrastructure.semantic.symbols.enums;

//This enum representates a type of variable or a kind of that variable
public enum SymbolKind {
    VARIABLE("variable"),
    PARAMETER("parametro"),
    FUNCTION("funccion"),
    PROCEDURE("procedimiento"),
    STRUCT("structura"),
    STRUCT_FIELD("propiedad structura"),
    ARRAY("arreglo"),
    LOCAL_VARIABLE("variable local");

    private final String operation;

    SymbolKind(String operation) {
        this.operation = operation;
    }

    public String getValue() {
        return operation;
    }


}
