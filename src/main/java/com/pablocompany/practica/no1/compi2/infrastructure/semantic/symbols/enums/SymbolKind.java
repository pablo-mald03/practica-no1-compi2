package com.pablocompany.practica.no1.compi2.infrastructure.semantic.symbols.enums;

//This enum representates a type of variable or a kind of that variable
public enum SymbolKind {
    VARIABLE("Variable"),
    PARAMETER("Parametro"),
    FUNCTION("Funccion"),
    PROCEDURE("Procedimiento"),
    STRUCT("Structura"),
    STRUCT_FIELD("Propiedad structura"),
    ARRAY("Arreglo"),
    LOCAL_VARIABLE("Variable local"),
    FOR_VARIABLE("Variable iterador");

    private final String operation;

    SymbolKind(String operation) {
        this.operation = operation;
    }

    public String getValue() {
        return operation;
    }


}
