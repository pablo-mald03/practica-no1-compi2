package com.pablocompany.practica.no1.compi2.infrastructure.walkers;

import com.pablocompany.practica.no1.compi2.domain.highlight.ErrorType;
import com.pablocompany.practica.no1.compi2.domain.semantic.AstNode;
import com.pablocompany.practica.no1.compi2.domain.semantic.ProgramNode;
import com.pablocompany.practica.no1.compi2.domain.semantic.childs.expressions.access.MemberArrayAccessExpressionNode;
import com.pablocompany.practica.no1.compi2.domain.semantic.childs.expressions.access.PropertyAccessExpressionNode;
import com.pablocompany.practica.no1.compi2.domain.semantic.childs.expressions.arrays.ArrayDeclarationNode;
import com.pablocompany.practica.no1.compi2.domain.semantic.childs.expressions.arrays.ArrayInitExpressionNode;
import com.pablocompany.practica.no1.compi2.domain.semantic.childs.expressions.assignation.*;
import com.pablocompany.practica.no1.compi2.domain.semantic.childs.expressions.structs.StructInstanceNode;
import com.pablocompany.practica.no1.compi2.domain.semantic.childs.expressions.structs.declaration.StructAttributeNode;
import com.pablocompany.practica.no1.compi2.domain.semantic.childs.expressions.structs.declaration.StructDeclarationNode;
import com.pablocompany.practica.no1.compi2.domain.semantic.childs.expressions.structs.properties.StructLiteralExpressionNode;
import com.pablocompany.practica.no1.compi2.domain.semantic.childs.expressions.structs.properties.StructPropertyNode;
import com.pablocompany.practica.no1.compi2.domain.semantic.childs.expressions.types.TypeNode;
import com.pablocompany.practica.no1.compi2.domain.semantic.childs.expressions.types.enums.DataType;
import com.pablocompany.practica.no1.compi2.domain.semantic.childs.expressions.values.ArrayCallExpressionNode;
import com.pablocompany.practica.no1.compi2.domain.semantic.childs.expressions.values.FunctionCallExpressionNode;
import com.pablocompany.practica.no1.compi2.domain.semantic.childs.expressions.values.IdentifierExpressionNode;
import com.pablocompany.practica.no1.compi2.domain.semantic.childs.expressions.values.LiteralExpressionNode;
import com.pablocompany.practica.no1.compi2.domain.semantic.childs.statements.VariableDeclarationNode;
import com.pablocompany.practica.no1.compi2.domain.semantic.childs.statements.breakpoints.BreakStatementNode;
import com.pablocompany.practica.no1.compi2.domain.semantic.childs.statements.breakpoints.ContinueStatementNode;
import com.pablocompany.practica.no1.compi2.domain.semantic.childs.statements.breakpoints.ReturnStatementNode;
import com.pablocompany.practica.no1.compi2.domain.semantic.childs.statements.conditionals.ElseBlockNode;
import com.pablocompany.practica.no1.compi2.domain.semantic.childs.statements.conditionals.ElseIfNode;
import com.pablocompany.practica.no1.compi2.domain.semantic.childs.statements.conditionals.IfStatementNode;
import com.pablocompany.practica.no1.compi2.domain.semantic.childs.statements.functions.FunctionDeclarationNode;
import com.pablocompany.practica.no1.compi2.domain.semantic.childs.statements.functions.ParameterNode;
import com.pablocompany.practica.no1.compi2.domain.semantic.childs.statements.functions.ProcedureDeclarationNode;
import com.pablocompany.practica.no1.compi2.domain.semantic.childs.statements.iostreams.PrintStatementNode;
import com.pablocompany.practica.no1.compi2.domain.semantic.childs.statements.iostreams.ReadStatementNode;
import com.pablocompany.practica.no1.compi2.domain.semantic.childs.statements.loops.DoWhileStatementNode;
import com.pablocompany.practica.no1.compi2.domain.semantic.childs.statements.loops.ForStatementNode;
import com.pablocompany.practica.no1.compi2.domain.semantic.childs.statements.loops.WhileStatementNode;
import com.pablocompany.practica.no1.compi2.domain.semantic.parents.BodyNode;
import com.pablocompany.practica.no1.compi2.domain.semantic.principals.MaiorSectionNode;
import com.pablocompany.practica.no1.compi2.domain.semantic.principals.MuneraSectionNode;
import com.pablocompany.practica.no1.compi2.domain.semantic.principals.VariablesSectionNode;
import com.pablocompany.practica.no1.compi2.domain.visitors.AstVisitor;
import com.pablocompany.practica.no1.compi2.infrastructure.errors.CompilerError;
import com.pablocompany.practica.no1.compi2.infrastructure.semantic.symbols.Environment;
import com.pablocompany.practica.no1.compi2.infrastructure.semantic.symbols.Symbol;
import com.pablocompany.practica.no1.compi2.infrastructure.semantic.symbols.enums.SymbolKind;
import lombok.Getter;

import java.util.*;

//This is the principal visitor to build the symbols table
@Getter
public class SymbolTableBuilderVisitor implements AstVisitor<Void> {

    private final List<CompilerError> errors;
    private final Environment globalScope;
    private Environment currentScope;
    private final List<Environment> scopeStack;
    private boolean insideFunctionOrProcedure = false;
    private boolean insideStructDeclaration = false;
    private String currentStructName = null;

    //THE PRINCIPAL REFERENCE TO THE SCOPES REPRESENTATION
    private final Map<String, Environment> scopeRegistry;

    public SymbolTableBuilderVisitor(List<CompilerError> errors) {
        this.errors = errors;
        this.globalScope = new Environment("Global");
        this.currentScope = globalScope;
        this.scopeStack = new ArrayList<>();
        this.scopeStack.add(globalScope);
        this.scopeRegistry = new HashMap<>();
        this.scopeRegistry.put("Global", globalScope);
    }

    //===== SCOPE METHODS =====

    private void enterScope(String name) {
        Environment newScope = new Environment(currentScope, name);
        currentScope = newScope;
        scopeStack.add(newScope);

        scopeRegistry.put(name, newScope);
    }

    private void exitScope() {
        scopeStack.removeLast();
        currentScope = scopeStack.getLast();
    }

    //Principal method to request the scope saved
    public Environment getScope(String name) {
        return scopeRegistry.get(name);
    }

    //This is the principal getter to return the scopes history
    public Map<String, Environment> getAllScopes() {
        return new HashMap<>(scopeRegistry);
    }

    //Method to register a new error (if is needed)
    private void addError(String lexeme, int line, int column, String message) {
        errors.add(new CompilerError(lexeme, line, column, ErrorType.SEMANTIC, message));
    }

    private boolean isTypeDefined(String typeName) {
        return globalScope.getStruct(typeName) != null;
    }

    // ===== VISITORS =====

    @Override
    public Void visit(ProgramNode node) {
        for (BodyNode body : node.getBodies()) {
            if (body.getVariablesSection() != null) {
                VariablesSectionNode varSection = (VariablesSectionNode) body.getVariablesSection();
                for (AstNode decl : varSection.getDeclarations()) {
                    if (decl instanceof StructDeclarationNode) {
                        registerStruct((StructDeclarationNode) decl);
                    }
                }
            }
        }

        for (BodyNode body : node.getBodies()) {
            body.accept(this);
        }
        return null;
    }

    /*
     * This method register a struct at the types table
     */
    private void registerStruct(StructDeclarationNode node) {
        String structName = node.getStructName();
        int line = node.getLine();
        int column = node.getColumn();

        Symbol structFindend = globalScope.getStruct(structName);
        if (structFindend != null) {
            addError(structName, line, column, "El struct '" + structName + "' ya está declarado.");
            return;
        }

        Symbol structSymbol = new Symbol(structName,
                new TypeNode(line, column, DataType.CUSTOM, structName),
                SymbolKind.STRUCT, line, column);

        insideStructDeclaration = true;
        currentStructName = structName;

        for (StructAttributeNode attr : node.getAttributes()) {
            TypeNode attrType = attr.getType();
            if (attrType.getDataType() == DataType.CUSTOM) {
                String typeName = attrType.getCustomTypeName();
                if (!isTypeDefined(typeName)) {
                    addError(typeName, attr.getLine(), attr.getColumn(),
                            "El tipo '" + typeName + "' no esta definido.");
                    continue;
                }
            }

            Symbol fieldSymbol = new Symbol(
                    attr.getIdentifier(),
                    SymbolKind.STRUCT_FIELD,
                    attr.getType(),
                    attr.getLine(),
                    attr.getColumn(),
                    attr.isArray(),
                    null
            );

            structSymbol.addStructField(fieldSymbol);
            attr.accept(this);
        }

        insideStructDeclaration = false;
        currentStructName = null;

        globalScope.registerStruct(structName, structSymbol);
        globalScope.put(structName, structSymbol);
    }

    @Override
    public Void visit(StructDeclarationNode node) {
        String structName = node.getStructName();

        if (globalScope.getStruct(structName) == null) {
            registerStruct(node);
        }
        return null;
    }


    //Principal variables definition
    @Override
    public Void visit(VariablesSectionNode node) {
        for (AstNode decl : node.getDeclarations()) {
            decl.accept(this);
        }
        return null;
    }

    //Principal Fonction definitions
    @Override
    public Void visit(MuneraSectionNode node) {
        for (AstNode func : node.getFunctions()) {
            func.accept(this);
        }
        return null;
    }

    //Principal Scope
    @Override
    public Void visit(MaiorSectionNode node) {
        for (AstNode stmt : node.getStatements()) {
            if (stmt instanceof VariableDeclarationNode ||
                    stmt instanceof ArrayDeclarationNode ||
                    stmt instanceof StructInstanceNode ||
                    stmt instanceof ForStatementNode) {

                stmt.accept(this);
            }
        }
        return null;
    }


    @Override
    public Void visit(BodyNode node) {

        if (node.getVariablesSection() != null) {
            node.getVariablesSection().accept(this);
        }
        if (node.getMuneraSection() != null) {
            node.getMuneraSection().accept(this);
        }
        if (node.getMaiorSection() != null) {
            node.getMaiorSection().accept(this);
        }
        return null;
    }

    @Override
    public Void visit(StructAttributeNode node) {
        if (!insideStructDeclaration || currentStructName == null) {
            addError(node.getIdentifier(), node.getLine(), node.getColumn(),
                    "Campo de struct '" + node.getIdentifier() + "' fuera de declaracion de struct.");
            return null;
        }

        //Register the new field of the struct
        Symbol fieldSymbol = new Symbol(
                node.getIdentifier(),
                SymbolKind.STRUCT_FIELD,
                node.getType(),
                node.getLine(),
                node.getColumn(),
                node.isArray(),
                null
        );

        Symbol structSymbol = globalScope.get(currentStructName);
        if (structSymbol != null) {
            structSymbol.addStructField(fieldSymbol);
        }

        return null;
    }

    @Override
    public Void visit(VariableDeclarationNode node) {
        String varName = node.getIdentifier();
        int line = node.getLine();
        int column = node.getColumn();

        if (currentScope.containsLocal(varName)) {
            addError(varName, line, column, "La variable '" + varName + "' ya está declarada en este ámbito.");
            return null;
        }

        if (node.getDataType().getDataType() == DataType.CUSTOM) {
            if (!isTypeDefined(node.getDataType().getCustomTypeName())) {
                addError(varName, line, column, "Tipo desconocido: '" + node.getDataType().getCustomTypeName() + "'");
                return null;
            }
        }

        Symbol varSymbol = new Symbol(
                varName,
                SymbolKind.VARIABLE,
                node.getDataType(),
                line,
                column
        );

        currentScope.put(varName, varSymbol);
        return null;
    }

    @Override
    public Void visit(ArrayDeclarationNode node) {
        String varName = node.getIdentifier();
        int line = node.getLine();
        int column = node.getColumn();

        if (currentScope.containsLocal(varName)) {
            addError(varName, line, column, "El arreglo '" + varName + "' ya esta declarado en este ambito.");
            return null;
        }

        if (node.getDataType().getDataType() == DataType.CUSTOM) {
            if (!isTypeDefined(node.getDataType().getCustomTypeName())) {
                addError(varName, line, column, "Tipo de arreglo desconocido: '" + node.getDataType().getCustomTypeName() + "'");
                return null;
            }
        }

        Integer arraySize = null;
        if (node.getSize() instanceof LiteralExpressionNode) {
            LiteralExpressionNode lit = (LiteralExpressionNode) node.getSize();
            if (lit.getValueType() == DataType.INT) {
                try {
                    arraySize = Integer.parseInt(lit.getValue());
                } catch (NumberFormatException e) {
                    /* Do nothing*/
                }
            }
        }

        Symbol arraySymbol = new Symbol(
                varName,
                SymbolKind.ARRAY,
                node.getDataType(),
                line,
                column,
                true,
                arraySize
        );

        currentScope.put(varName, arraySymbol);
        return null;
    }

    @Override
    public Void visit(StructInstanceNode node) {
        String varName = node.getIdentifier();
        String structType = node.getStructType();

        if (currentScope.containsLocal(varName)) {
            addError(varName, node.getLine(), node.getColumn(),
                    "La variable '" + varName + "' ya esta declarada en este ambito.");
            return null;
        }

        if (!isTypeDefined(structType)) {
            addError(structType, node.getLine(), node.getColumn(),
                    "Tipo desconocido: '" + structType + "'");
            return null;
        }

        TypeNode structTypeNode = new TypeNode(
                node.getLine(),
                node.getColumn(),
                DataType.CUSTOM,
                structType
        );

        Symbol varSymbol = new Symbol(
                varName,
                SymbolKind.VARIABLE,
                structTypeNode,
                node.getLine(),
                node.getColumn()
        );

        currentScope.put(varName, varSymbol);
        return null;
    }


    //=======Function registration
    @Override
    public Void visit(FunctionDeclarationNode node) {
        String funcName = node.getName();
        int line = node.getLine();
        int column = node.getColumn();

        if (currentScope.containsLocal(funcName)) {
            addError(funcName, line, column, "La funcion '" + funcName + "' ya esta declarada.");
            return null;
        }

        if (node.getReturnType().getDataType() == DataType.CUSTOM) {
            if (!isTypeDefined(node.getReturnType().getCustomTypeName())) {
                addError(funcName, line, column, "Tipo de retorno desconocido: '" +
                        node.getReturnType().getCustomTypeName() + "'");
                return null;
            }
        }

        Symbol funcSymbol = new Symbol(
                funcName,
                SymbolKind.FUNCTION,
                node.getReturnType(),
                line,
                column
        );

        enterScope("function_" + funcName);
        insideFunctionOrProcedure = true;

        for (ParameterNode param : node.getParameters()) {
            Symbol paramSymbol = new Symbol(
                    param.getName(),
                    SymbolKind.PARAMETER,
                    param.getType(),
                    param.getLine(),
                    param.getColumn(),
                    param.isArray(),
                    null
            );
            funcSymbol.addParameter(paramSymbol);

            param.accept(this);
        }

        for (AstNode localVar : node.getLocalVariables()) {
            localVar.accept(this);
        }

        for (AstNode stmt : node.getBody()) {
            if (stmt instanceof VariableDeclarationNode ||
                    stmt instanceof ArrayDeclarationNode ||
                    stmt instanceof StructInstanceNode  ||
                    stmt instanceof ForStatementNode) {
                stmt.accept(this);
            }
        }

        insideFunctionOrProcedure = false;
        exitScope();

        currentScope.put(funcName, funcSymbol);
        return null;
    }

    @Override
    public Void visit(ProcedureDeclarationNode node) {
        String procedureName = node.getName();
        int line = node.getLine();
        int column = node.getColumn();

        if (currentScope.containsLocal(procedureName)) {
            addError(procedureName, line, column, "El procedimiento '" + procedureName + "' ya está declarado.");
            return null;
        }

        Symbol procSymbol = new Symbol(
                procedureName,
                SymbolKind.PROCEDURE,
                null,
                line,
                column
        );

        enterScope("procedure_" + procedureName);
        insideFunctionOrProcedure = true;

        for (ParameterNode param : node.getParameters()) {
            Symbol paramSymbol = new Symbol(
                    param.getName(),
                    SymbolKind.PARAMETER,
                    param.getType(),
                    param.getLine(),
                    param.getColumn(),
                    param.isArray(),
                    null
            );

            procSymbol.addParameter(paramSymbol);
            param.accept(this);
        }

        for (AstNode localVar : node.getLocalVariables()) {
            localVar.accept(this);
        }

        for (AstNode stmt : node.getBody()) {
            if (stmt instanceof VariableDeclarationNode ||
                    stmt instanceof ArrayDeclarationNode ||
                    stmt instanceof StructInstanceNode  ||
                    stmt instanceof ForStatementNode) {
                stmt.accept(this);
            }
        }

        insideFunctionOrProcedure = false;
        exitScope();

        currentScope.put(procedureName, procSymbol);
        return null;
    }


    @Override
    public Void visit(ParameterNode node) {
        String paramName = node.getName();
        int line = node.getLine();
        int column = node.getColumn();

        if (currentScope.containsLocal(paramName)) {
            addError(paramName, line, column, "El parametro '" + paramName + "' ya esta declarado en este ambito.");
            return null;
        }

        if (node.getType().getDataType() == DataType.CUSTOM) {
            if (!isTypeDefined(node.getType().getCustomTypeName())) {
                addError(paramName, line, column, "Tipo desconocido: '" + node.getType().getCustomTypeName() + "'");
                return null;
            }
        }

        Symbol paramSymbol = new Symbol(
                paramName,
                SymbolKind.PARAMETER,
                node.getType(),
                line,
                column,
                node.isArray(),
                null
        );

        currentScope.put(paramName, paramSymbol);
        return null;
    }

    //Register the for scope
    @Override
    public Void visit(ForStatementNode node) {

        enterScope("for_" + node.getLine() + node.getColumn());

        if (node.getInit() != null) {
            node.getInit().accept(this);
        }

        exitScope();
        return null;
    }


    //========== Null return value (Not Needed) SECTION ==========

    @Override
    public Void visit(VariableAssignmentNode node) {
        return null;
    }

    @Override
    public Void visit(IfStatementNode node) {
        return null;
    }

    @Override
    public Void visit(ElseIfNode node) {
        return null;
    }

    @Override
    public Void visit(ElseBlockNode node) {
        return null;
    }

    @Override
    public Void visit(WhileStatementNode node) {
        return null;
    }

    @Override
    public Void visit(DoWhileStatementNode node) {
        return null;
    }


    @Override
    public Void visit(PrintStatementNode node) {
        return null;
    }

    @Override
    public Void visit(ReadStatementNode node) {
        return null;
    }

    @Override
    public Void visit(ReturnStatementNode node) {
        return null;
    }

    @Override
    public Void visit(BreakStatementNode node) {
        return null;
    }

    @Override
    public Void visit(ContinueStatementNode node) {
        return null;
    }

    @Override
    public Void visit(IncrementStatementNode node) {
        return null;
    }

    @Override
    public Void visit(DecrementStatementNode node) {
        return null;
    }

    @Override
    public Void visit(LiteralExpressionNode node) {
        return null;
    }

    @Override
    public Void visit(IdentifierExpressionNode node) {
        return null;
    }

    @Override
    public Void visit(BinaryExpressionNode node) {
        return null;
    }

    @Override
    public Void visit(UnaryExpressionNode node) {
        return null;
    }

    @Override
    public Void visit(FunctionCallExpressionNode node) {
        return null;
    }

    @Override
    public Void visit(ArrayCallExpressionNode node) {
        return null;
    }

    @Override
    public Void visit(PropertyAccessExpressionNode node) {
        return null;
    }

    @Override
    public Void visit(MemberArrayAccessExpressionNode node) {
        return null;
    }

    @Override
    public Void visit(ArrayInitExpressionNode node) {
        return null;
    }

    @Override
    public Void visit(StructLiteralExpressionNode node) {
        return null;
    }

    @Override
    public Void visit(StructPropertyNode node) {
        return null;
    }

    @Override
    public Void visit(TypeNode node) {
        return null;
    }
}
