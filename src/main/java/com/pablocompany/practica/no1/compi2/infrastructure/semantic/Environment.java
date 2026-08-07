package com.pablocompany.practica.no1.compi2.infrastructure.semantic;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author pablo03
 */
public class Environment {
    
    private final Map<String, Symbol> table;
    private final Environment parent;
    private final List<Environment> children;
    private final String scopeName;
    private final int depth;

    public Environment(String scopeName) {
        this.table = new LinkedHashMap<>();
        this.parent = null;
        this.children = new ArrayList<>();
        this.scopeName = scopeName;
        this.depth = 0;
    }

    public Environment(Environment parent, String scopeName) {
        this.table = new LinkedHashMap<>();
        this.parent = parent;
        this.children = new ArrayList<>();
        this.scopeName = scopeName;
        this.depth = parent.getDepth() + 1;
        
        if (parent != null) {
            parent.addChild(this);
        }
    }

    // Add a new symbol
    public void put(String id, Symbol symbol) {
        symbol.setScope(this.scopeName);
        symbol.setDepth(this.depth);
        table.put(id, symbol);
    }

    // Find a symbol 
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

    public boolean containsLocal(String id) {
        return table.containsKey(id);
    }

    private void addChild(Environment child) {
        this.children.add(child);
    }

    public int getDepth() {
        return depth;
    }
    
    public Environment getParent(){
        return this.parent;
    }

    // ==========================================
    // GRAPHIC INTERFACE METHOD (JTable)
    // ==========================================
    
    public List<Symbol> getAllSymbolsForUI() {
        List<Symbol> allSymbols = new ArrayList<>(table.values());
        for (Environment child : children) {
            allSymbols.addAll(child.getAllSymbolsForUI());
        }
        return allSymbols;
    }
    
}
