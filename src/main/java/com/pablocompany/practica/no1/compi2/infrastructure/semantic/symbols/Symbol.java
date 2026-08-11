package com.pablocompany.practica.no1.compi2.infrastructure.semantic.symbols;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author pablo03
 */
//This class represents a symbol from the SymbolTable
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Symbol {

    private String id;  
    //TODO: implements the real value
    private String symbolType;     // TODO: Type identifier r (Ej: "Variable", "Función", "Clase")
    private String dataType;       // TODO: Data Type (Ej: "Entero", "Cadena", "Booleano", "Void")
    private String scope;          // TODO: Scope visibility (Ej: "Global", "Local - main")
    private int line;
    private int column;
    private int depth;
}
