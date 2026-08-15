package com.pablocompany.practica.no1.compi2.infrastructure.semantic.symbols;

import com.pablocompany.practica.no1.compi2.domain.semantic.childs.expressions.types.TypeNode;
import com.pablocompany.practica.no1.compi2.model.TypeInfo;
import lombok.Getter;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 *
 * @author pablo03
 */
@Getter
public class Environment {

    private final Map<String, Symbol> table;
    private final Environment parent;
    private final List<Environment> children;
    private final String scopeName;
    private final int depth;
    //This is the principal types table
    private final Map<String, Symbol> structTypes;

    //Constructor for the principal enviroment table
    public Environment(String scopeName) {
        this.table = new LinkedHashMap<>();
        this.parent = null;
        this.children = new ArrayList<>();
        this.scopeName = scopeName;
        this.depth = 0;
        this.structTypes = new LinkedHashMap<>();
    }

    //Constructor for the different scopes
    public Environment(Environment parent, String scopeName) {
        this.table = new LinkedHashMap<>();
        this.parent = parent;
        this.children = new ArrayList<>();
        this.scopeName = scopeName;
        this.depth = parent.getDepth() + 1;
        this.structTypes = new LinkedHashMap<>();

        if (parent != null) {
            parent.addChild(this);
            this.structTypes.putAll(parent.getAllStructTypes());
        }
    }

    // Set any struct in a different scope
    public void registerStruct(String name, Symbol type) {
        structTypes.put(name, type);
    }

    // Getter for any struct in a different scope
    public Symbol getStruct(String name) {
        Symbol found = structTypes.get(name);
        if (found != null) {
            return found;
        }
        if (parent != null) {
            return parent.getStruct(name);
        }
        return null;
    }

    // Get all structs for the UI
    public Map<String, Symbol> getAllStructTypes() {
        Map<String, Symbol> allStructs = new LinkedHashMap<>();
        allStructs.putAll(structTypes);
        if (parent != null) {
            allStructs.putAll(parent.getAllStructTypes());
        }
        return allStructs;
    }

    // This method put a new symbol
    public void put(String id, Symbol symbol) {
        symbol.setScope(this.scopeName);
        symbol.setDepth(this.depth);
        table.put(id, symbol);
    }

    // This method get a variable in the different scropes (bottom to up)
    public Symbol get(String id) {
        Symbol found = table.get(id);
        if (found != null) {
            return found;
        }
        if (parent != null) {
            return parent.get(id);
        }
        return null;
    }

    // this method verify in a local scope the variable
    public boolean containsLocal(String id) {
        return table.containsKey(id);
    }

    //This method add a child for the representation UI
    private void addChild(Environment child) {
        this.children.add(child);
    }

    //This method get a local symbol in the scope
    public Map<String, Symbol> getLocalSymbols() {
        return new LinkedHashMap<>(table);
    }

    // ==========================================
    // MÉTODOS PARA UI (JTable)
    // ==========================================

    public List<Symbol> getAllSymbolsForUI() {
        List<Symbol> allSymbols = new ArrayList<>(table.values());
        for (Environment child : children) {
            allSymbols.addAll(child.getAllSymbolsForUI());
        }
        return allSymbols;
    }

    public List<TypeInfo> getAllStructsForUI() {
        List<TypeInfo> allStructs = new ArrayList<>();

        for (Map.Entry<String, Symbol> entry : structTypes.entrySet()) {
            String structName = entry.getKey();

            Symbol structSymbol = table.get(structName);
            List<Symbol> fields = structSymbol != null ?
                    structSymbol.getStructFields() : new ArrayList<>();

            TypeInfo info = new TypeInfo(
                    structName,
                    "Structure",
                    fields.size(),
                    getFieldNames(fields),
                    getFieldTypes(fields)
            );
            allStructs.add(info);
        }

        if (parent != null) {
            allStructs.addAll(parent.getAllStructsForUI());
        }

        return allStructs;
    }

    /*
    * This method returns all the fieldNames
    * */
    private List<String> getFieldNames(List<Symbol> fields) {
        return fields.stream()
                .map(Symbol::getId)
                .collect(Collectors.toList());
    }

    /*
     * This method returns all the fields types
     */
    private List<String> getFieldTypes(List<Symbol> fields) {
        return fields.stream()
                .map(f ->
                        f.getType().getCustomTypeName() != null ?
                                f.getType().getCustomTypeName()
                                : (f.getType().getDataType() != null? f.getType().getDataType().getValue(): "indefinido"))
                .collect(Collectors.toList());
    }


    // Graphical representation for the UI
    public List<Environment> getChildren() {
        return new ArrayList<>(children);
    }
}
