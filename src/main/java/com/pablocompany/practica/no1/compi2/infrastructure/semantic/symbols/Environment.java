package com.pablocompany.practica.no1.compi2.infrastructure.semantic.symbols;

import com.pablocompany.practica.no1.compi2.domain.semantic.childs.expressions.types.TypeNode;
import lombok.Getter;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

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
    private final Map<String, TypeNode> structTypes;

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
    public void registerStruct(String name, TypeNode type) {
        structTypes.put(name, type);
    }

    // Getter for any struct in a different scope
    public TypeNode getStruct(String name) {
        TypeNode found = structTypes.get(name);
        if (found != null) {
            return found;
        }
        if (parent != null) {
            return parent.getStruct(name);
        }
        return null;
    }

    // Get all structs for the UI
    public Map<String, TypeNode> getAllStructTypes() {
        Map<String, TypeNode> allStructs = new LinkedHashMap<>();
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

    // Graphical representation for the UI
    public List<Environment> getChildren() {
        return new ArrayList<>(children);
    }
}
