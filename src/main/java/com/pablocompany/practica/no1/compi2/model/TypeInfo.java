package com.pablocompany.practica.no1.compi2.model;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

//This class is the principal to ilustrate the type info of the types table
@Getter
@Setter
public class TypeInfo {
    private final String name;
    private final String kind;
    private final int fieldCount;
    private final List<String> fieldNames;
    private final List<String> fieldTypes;

    public TypeInfo(String name, String kind, int fieldCount,
                    List<String> fieldNames, List<String> fieldTypes) {
        this.name = name;
        this.kind = kind;
        this.fieldCount = fieldCount;
        this.fieldNames = fieldNames;
        this.fieldTypes = fieldTypes;

    }
}
