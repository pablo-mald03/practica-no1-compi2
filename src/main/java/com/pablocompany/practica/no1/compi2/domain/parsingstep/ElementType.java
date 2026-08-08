package com.pablocompany.practica.no1.compi2.domain.parsingstep;

/**
 *
 * @author pablo03
 */
//This enum represents the type of elements that can exists in parsing process
public enum ElementType {

    TERMINAL, // Ejemplo: "(", "3", "+", "4" (Rojos en tu foto)
    NON_TERMINAL, // Ejemplo: "F", "T", "E" (Azules en tu foto)
    STATE
}
