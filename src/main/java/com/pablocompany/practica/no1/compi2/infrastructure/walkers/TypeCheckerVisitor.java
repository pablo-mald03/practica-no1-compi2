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
import com.pablocompany.practica.no1.compi2.domain.semantic.parents.ExpressionNode;
import com.pablocompany.practica.no1.compi2.domain.semantic.principals.MaiorSectionNode;
import com.pablocompany.practica.no1.compi2.domain.semantic.principals.MuneraSectionNode;
import com.pablocompany.practica.no1.compi2.domain.semantic.principals.VariablesSectionNode;
import com.pablocompany.practica.no1.compi2.domain.visitors.AstVisitor;
import com.pablocompany.practica.no1.compi2.domain.wrappers.TypeWrapper;
import com.pablocompany.practica.no1.compi2.infrastructure.errors.CompilerError;
import com.pablocompany.practica.no1.compi2.infrastructure.semantic.symbols.Environment;
import com.pablocompany.practica.no1.compi2.infrastructure.semantic.symbols.Symbol;
import com.pablocompany.practica.no1.compi2.infrastructure.semantic.symbols.enums.SymbolKind;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//This is the second phase of the compilator (the type checker)
public class TypeCheckerVisitor implements AstVisitor<Void> {

    private final Environment globalScope;
    private Environment currentScope;
    private final List<Environment> scopeStack;
    private final List<CompilerError> errors;

    //Flags
    private boolean insideFunction = false;
    private boolean insideLoop = false;
    private TypeNode expectedReturnType = null;

    //Principal scope representation registry for the different scopes registered at the first phase
    private final Map<String, Environment> scopeRegistry;

    public TypeCheckerVisitor(Environment globalScope, Map<String, Environment> scopeRegistry,  List<CompilerError> errors) {
        this.errors = errors;
        this.globalScope = globalScope;
        this.scopeRegistry = scopeRegistry;
        this.currentScope = globalScope;
        this.scopeStack = new ArrayList<>();
        this.scopeStack.add(globalScope);
    }

    //======= SCOPE METHODS =======
    private void enterScope(String name) {
        Environment existingScope = scopeRegistry.get(name);

        if (existingScope != null) {
            currentScope = existingScope;
            scopeStack.add(existingScope);
        } else {
            Environment newScope = new Environment(currentScope, name);
            currentScope = newScope;
            scopeStack.add(newScope);
        }
    }

    private void exitScope() {
        scopeStack.removeLast();
        currentScope = scopeStack.getLast();
    }

    private void addError(String lexeme, int line, int column, String message) {
        errors.add(new CompilerError(lexeme, line, column, ErrorType.SEMANTIC, message));
    }

    private Symbol resolveSymbol(String id, int line, int column) {
        for (int i = scopeStack.size() - 1; i >= 0; i--) {
            Symbol symbol = scopeStack.get(i).get(id);
            if (symbol != null) {
                return symbol;
            }
        }

        Symbol symbol = globalScope.get(id);
        if (symbol == null) {
            addError(id, line, column, "Variable: '" + id + "' no encontrada en el ambito actual.");
        }
        return symbol;
    }

    private boolean isAssignable(TypeNode target, TypeNode source) {
        if (target == null || source == null) return false;

        if (target.getDataType() == source.getDataType()) {
            if (target.getDataType() == DataType.CUSTOM) {
                return target.getCustomTypeName().equals(source.getCustomTypeName());
            }
            return true;
        }

        if (target.getDataType() == DataType.DECIMAL && source.getDataType() == DataType.INT) {
            return true;
        }

        return false;
    }

    // ========== PRINCIPAL PROGRAM PRODUCTIONS =========

    @Override
    public Void visit(ProgramNode node) {
        for (BodyNode body : node.getBodies()) {
            body.accept(this);
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

    // ========== PRINCIPAL SECTION PRODUCTIONS =========

    @Override
    public Void visit(VariablesSectionNode node) {
        for (AstNode decl : node.getDeclarations()) {
            decl.accept(this);
        }
        return null;
    }

    @Override
    public Void visit(MuneraSectionNode node) {
        for (AstNode func : node.getFunctions()) {
            func.accept(this);
        }
        return null;
    }

    @Override
    public Void visit(MaiorSectionNode node) {
        for (AstNode stmt : node.getStatements()) {
            stmt.accept(this);
        }
        return null;
    }

    // ========== DECLARACIONES =========

    @Override
    public Void visit(VariableDeclarationNode node) {
        if (node.getDataType().getDataType() == DataType.CUSTOM) {
            if (globalScope.getStruct(node.getDataType().getCustomTypeName()) == null) {
                addError(node.getIdentifier(), node.getLine(), node.getColumn(),
                        "Tipo de variable desconocido: '" + node.getDataType().getCustomTypeName() + "'");
                return null;
            }
        }

        if (node.getInitializer() != null) {
            TypeResolverVisitor resolver = new TypeResolverVisitor(currentScope,globalScope,scopeRegistry, errors);
            TypeWrapper initType = node.getInitializer().accept(resolver);

            if (initType != null && !isAssignable(node.getDataType(), initType.getTypeNode())) {
                addError(node.getIdentifier(), node.getLine(), node.getColumn(),
                        "Tipo incorrecto en inicializacion. Se esperaba: '" +
                                node.getDataType().getDataType().getValue() + "', se obtuvo: '" +
                                initType.getDataType().getValue()+ "'");
            }
        }

        return null;
    }

    @Override
    public Void visit(ArrayDeclarationNode node) {
        if (node.getDataType().getDataType() == DataType.CUSTOM) {
            if (globalScope.getStruct(node.getDataType().getCustomTypeName()) == null) {
                addError(node.getIdentifier(), node.getLine(), node.getColumn(),
                        "Tipo de variable desconocido: '" + node.getDataType().getCustomTypeName() + "'");
                return null;
            }
        }

        TypeResolverVisitor resolver = new TypeResolverVisitor(currentScope,globalScope,scopeRegistry, errors);
        TypeWrapper sizeType = node.getSize().accept(resolver);
        if (sizeType != null && sizeType.getDataType() != DataType.INT) {
            addError(node.getIdentifier(), node.getLine(), node.getColumn(),
                    "El tamaño del arreglo debe ser un valor entero.");
        }

        if (node.getInitializer() != null) {
            ArrayInitExpressionNode init = node.getInitializer();
            for (ExpressionNode elem : init.getElements()) {
                TypeWrapper elemType = elem.accept(resolver);

                if (elem instanceof IdentifierExpressionNode) {
                    IdentifierExpressionNode idNode = (IdentifierExpressionNode) elem;
                    Symbol symbol = resolveSymbol(idNode.getIdentifier(), idNode.getLine(), idNode.getColumn());

                    if (symbol != null && symbol.getType() != null) {
                        if (!isAssignable(node.getDataType(), symbol.getType())) {
                            addError(idNode.getIdentifier(), idNode.getLine(), idNode.getColumn(),
                                    "Tipo incorrecto. El arreglo espera: " +
                                            node.getDataType().getCustomTypeName() +
                                            ", pero '" + idNode.getIdentifier() +
                                            "' es de tipo: " + symbol.getType().getCustomTypeName());
                        }
                    }
                } else if (elem instanceof StructLiteralExpressionNode) {
                    verifyStructLiteral((StructLiteralExpressionNode) elem, node.getDataType());
                } else if (elemType != null && !isAssignable(node.getDataType(), elemType.getTypeNode())) {
                    addError(node.getIdentifier(), node.getLine(), node.getColumn(),
                            "Tipo incorrecto en inicialización del arreglo. Espera: " +
                                    node.getDataType().getDataType() + ", se obtuvo: " +
                                    elemType.getDataType());
                }
            }
        }

        return null;
    }

    @Override
    public Void visit(StructInstanceNode node) {
        Symbol structType = globalScope.getStruct(node.getStructType());
        if (structType == null) {
            addError(node.getIdentifier(), node.getLine(), node.getColumn(),
                    "Struct no definido: '" + node.getStructType() + "'");
            return null;
        }


        if (node.getLiteral() != null) {
            verifyStructLiteral(node.getLiteral(), structType.getType());
        }

        return null;
    }

    //The structs are registered yet
    @Override
    public Void visit(StructDeclarationNode node) {
        return null;
    }

    @Override
    public Void visit(StructAttributeNode node) {
        return null;
    }

    // ========== ASSIGNATIONS =========

    @Override
    public Void visit(VariableAssignmentNode node) {
        TypeResolverVisitor resolver = new TypeResolverVisitor(currentScope,globalScope,scopeRegistry, errors);

        TypeWrapper targetType = node.getIdentifier().accept(resolver);
        if (targetType == null) {
            addError("asignación", node.getLine(), node.getColumn(),
                    "El target de la asignación no es válido.");
            return null;
        }

        TypeWrapper valueType = node.getExpressionNode().accept(resolver);
        if (valueType != null && !isAssignable(targetType.getTypeNode(), valueType.getTypeNode())) {
            addError(targetType.getDataType().getValue(), node.getLine(), node.getColumn(),
                    "Tipo de asignacion incorrecto. Se esperaba: " +
                            targetType.getDataType().getValue() + ", se obtuvo: " +
                            valueType.getDataType().getValue());
        }

        return null;
    }

    // ========== FUNCIONES Y PROCEDIMIENTOS =========

    //Struct validation global and local scopes
    @Override
    public Void visit(FunctionDeclarationNode node) {
        insideFunction = true;
        expectedReturnType = node.getReturnType();

        enterScope("function_" + node.getName());


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
            currentScope.put(param.getName(), paramSymbol);
        }


        for (AstNode localVar : node.getLocalVariables()) {
            localVar.accept(this);
        }

        for (AstNode stmt : node.getBody()) {
            stmt.accept(this);
        }

        boolean hasReturn = checkAllPathsHaveReturn(node.getBody());
        if (!hasReturn) {
            addError(node.getName(), node.getLine(), node.getColumn(),
                    "La funcion '" + node.getName() + "' no tiene un valor de retorno definido.");
        }

        exitScope();
        insideFunction = false;
        expectedReturnType = null;
        return null;
    }

    @Override
    public Void visit(ProcedureDeclarationNode node) {
        insideFunction = true;
        expectedReturnType = null;

        enterScope("procedure_" + node.getName());

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
            currentScope.put(param.getName(), paramSymbol);
        }

        for (AstNode localVar : node.getLocalVariables()) {
            localVar.accept(this);
        }

        for (AstNode stmt : node.getBody()) {
            stmt.accept(this);
        }

        exitScope();
        insideFunction = false;
        expectedReturnType = null;
        return null;
    }

    @Override
    public Void visit(ParameterNode node) {
        if (node.getType().getDataType() == DataType.CUSTOM) {
            if (globalScope.getStruct(node.getType().getCustomTypeName()) == null) {
                addError(node.getName(), node.getLine(), node.getColumn(),
                        "Tipo de parametro desconocido: '" +
                                node.getType().getCustomTypeName() + "'");
            }
        }
        return null;
    }

    @Override
    public Void visit(ReturnStatementNode node) {
        if (!insideFunction) {
            addError("reddere", node.getLine(), node.getColumn(),
                    "'reddere' solo puede usarse dentro de una función.");
            return null;
        }

        TypeResolverVisitor resolver = new TypeResolverVisitor(currentScope,globalScope,scopeRegistry, errors);

        if (node.getValue() != null) {
            TypeWrapper returnType = node.getValue().accept(resolver);
            if (returnType != null && expectedReturnType != null) {
                if (!isAssignable(expectedReturnType, returnType.getTypeNode())) {
                    addError("reddere", node.getLine(), node.getColumn(),
                            "Tipo de retorno incorrecto. Se esperaba: " +
                                    expectedReturnType.getDataType().getValue() + ", se obtuvo: " +
                                    returnType.getDataType().getValue());
                }
            }
        } else if (expectedReturnType != null) {
            addError("reddere", node.getLine(), node.getColumn(),
                    "La funcion debe retornar un valor de tipo: " +
                            expectedReturnType.getDataType());
        }

        return null;
    }

    // ========== EXPRESIONES =========

    @Override
    public Void visit(IdentifierExpressionNode node) {
        Symbol symbol = currentScope.get(node.getIdentifier());
        if (symbol == null) {
            symbol = globalScope.get(node.getIdentifier());
            if (symbol == null) {
                addError(node.getIdentifier(), node.getLine(), node.getColumn(),
                        "Variable no definida: '" + node.getIdentifier() + "'");
            }
        }
        return null;
    }

    @Override
    public Void visit(PropertyAccessExpressionNode node) {
        TypeResolverVisitor resolver = new TypeResolverVisitor(currentScope,globalScope,scopeRegistry, errors);
        TypeWrapper targetType = node.getTarget().accept(resolver);

        if (targetType == null) {
            addError("propiedad", node.getLine(), node.getColumn(),
                    "No se puede acceder a la propiedad nula.");
            return null;
        }

        if (targetType.getDataType() == DataType.CUSTOM) {
            String structName = targetType.getTypeNode().getCustomTypeName();

            Symbol structType = globalScope.getStruct(structName);
            if (structType == null) {
                addError(structName, node.getLine(), node.getColumn(),
                        "El tipo '" + structName + "' no es un struct valido.");
                return null;
            }

            Symbol structSymbol = globalScope.get(structName);
            if (structSymbol != null && structSymbol.getKind() == SymbolKind.STRUCT) {
                boolean propertyExists = false;
                for (Symbol field : structSymbol.getStructFields()) {
                    if (field.getId().equals(node.getPropertyName())) {
                        propertyExists = true;
                        break;
                    }
                }
                if (!propertyExists) {
                    addError(node.getPropertyName(), node.getLine(), node.getColumn(),
                            "La propiedad '" + node.getPropertyName() +
                                    "' no existe en el struct '" + structName + "'");
                }
            }
        } else {
            addError(node.getPropertyName(), node.getLine(), node.getColumn(),
                    "Solo se puede acceder a propiedades de structs.");
        }

        return null;
    }

    @Override
    public Void visit(ArrayCallExpressionNode node) {

        if (node.isDeclaration()) {
            return null;
        }


        Symbol arraySymbol = currentScope.get(node.getArrayName());
        if (arraySymbol == null) {
            arraySymbol = globalScope.get(node.getArrayName());
            if (arraySymbol == null) {
                addError(node.getArrayName(), node.getLine(), node.getColumn(),
                        "Array no definido: '" + node.getArrayName() + "'");
                return null;
            }
        }

        if (arraySymbol.getKind() != SymbolKind.ARRAY &&
                arraySymbol.getKind() != SymbolKind.PARAMETER) {
            addError(node.getArrayName(), node.getLine(), node.getColumn(),
                    "'" + node.getArrayName() + "' no es un arreglo.");
            return null;
        }

        TypeResolverVisitor resolver = new TypeResolverVisitor(currentScope,globalScope,scopeRegistry, errors);
        TypeWrapper indexType = node.getIndexExpression().accept(resolver);
        if (indexType != null && indexType.getDataType() != DataType.INT) {
            addError(node.getArrayName(), node.getLine(), node.getColumn(),
                    "El índice del arreglo debe ser un valor entero.");
        }

        return null;
    }

    @Override
    public Void visit(MemberArrayAccessExpressionNode node) {
        TypeResolverVisitor resolver = new TypeResolverVisitor(currentScope,globalScope,scopeRegistry, errors);
        TypeWrapper targetType = node.getTarget().accept(resolver);

        if (targetType == null) {
            addError("array", node.getLine(), node.getColumn(),
                    "No se puede acceder a un arreglo de un tipo nulo.");
            return null;
        }

        TypeWrapper indexType = node.getIndex().accept(resolver);
        if (indexType != null && indexType.getDataType() != DataType.INT) {
            addError("indice", node.getLine(), node.getColumn(),
                    "El índice del arreglo debe ser un valor entero.");
        }

        return null;
    }

    // ========== STRUCT LITERALS =========

    @Override
    public Void visit(StructLiteralExpressionNode node) {
        return null;
    }

    public Void visit(StructPropertyNode node) {
        ExpressionNode value = node.getValue();

        if (value instanceof ArrayCallExpressionNode) {
            ArrayCallExpressionNode arrayCall = (ArrayCallExpressionNode) value;
            if (arrayCall.isDeclaration()) {
                return null;
            }
        }

        if (value instanceof IdentifierExpressionNode) {
            IdentifierExpressionNode idNode = (IdentifierExpressionNode) value;
            Symbol symbol = currentScope.get(idNode.getIdentifier());
            if (symbol == null) {
                symbol = globalScope.get(idNode.getIdentifier());
                if (symbol == null) {
                    addError(idNode.getIdentifier(), node.getLine(), node.getColumn(),
                            "Variable no definida: '" + idNode.getIdentifier() + "'");
                    return null;
                }
            }
        }

        TypeResolverVisitor resolver = new TypeResolverVisitor(currentScope, globalScope,scopeRegistry, errors);
        value.accept(resolver);

        return null;
    }

    // ========== LOOPS =========

    @Override
    public Void visit(WhileStatementNode node) {
        insideLoop = true;

        TypeResolverVisitor resolver = new TypeResolverVisitor(currentScope,globalScope,scopeRegistry, errors);
        TypeWrapper conditionType = node.getCondition().accept(resolver);
        if (conditionType != null && conditionType.getDataType() != DataType.BOOLEAN) {
            addError("dum", node.getLine(), node.getColumn(),
                    "La condicion del ciclo 'dum' debe ser de tipo bool.");
        }

        for (AstNode stmt : node.getBody()) {
            stmt.accept(this);
        }

        insideLoop = false;
        return null;
    }

    @Override
    public Void visit(DoWhileStatementNode node) {
        insideLoop = true;

        TypeResolverVisitor resolver = new TypeResolverVisitor(currentScope,globalScope,scopeRegistry, errors);
        TypeWrapper conditionType = node.getCondion().accept(resolver);
        if (conditionType != null && conditionType.getDataType() != DataType.BOOLEAN) {
            addError("facere-dum", node.getLine(), node.getColumn(),
                    "La condición del 'facere-dum' debe ser de tipo bool.");
        }

        for (AstNode stmt : node.getBody()) {
            stmt.accept(this);
        }

        insideLoop = false;
        return null;
    }

    @Override
    public Void visit(ForStatementNode node) {
        insideLoop = true;

        TypeResolverVisitor resolver = new TypeResolverVisitor(currentScope,globalScope,scopeRegistry, errors);

        if (node.getCondition() != null) {
            TypeWrapper conditionType = node.getCondition().accept(resolver);
            if (conditionType != null && conditionType.getDataType() != DataType.BOOLEAN) {
                addError("per", node.getLine(), node.getColumn(),
                        "La condición del ciclo 'per' debe ser booleana.");
            }
        }

        if (node.getInit() != null) {
            node.getInit().accept(this);
        }
        if (node.getUpdate() != null) {
            node.getUpdate().accept(this);
        }

        for (AstNode stmt : node.getBody()) {
            stmt.accept(this);
        }

        insideLoop = false;
        return null;
    }

    // ========== BREAK/CONTINUE =========

    @Override
    public Void visit(BreakStatementNode node) {
        if (!insideLoop) {
            addError("interrumpe", node.getLine(), node.getColumn(),
                    "La instrucción 'interrumpe' solo puede usarse dentro de un ciclo.");
        }
        return null;
    }

    @Override
    public Void visit(ContinueStatementNode node) {
        if (!insideLoop) {
            addError("perge", node.getLine(), node.getColumn(),
                    "La instrucción 'perge' solo puede usarse dentro de un ciclo.");
        }
        return null;
    }

    // ========== CONDICIONALES =========

    @Override
    public Void visit(IfStatementNode node) {
        TypeResolverVisitor resolver = new TypeResolverVisitor(currentScope,globalScope,scopeRegistry, errors);

        TypeWrapper conditionType = node.getCondition().accept(resolver);
        if (conditionType != null && conditionType.getDataType() != DataType.BOOLEAN) {
            addError("condición", node.getLine(), node.getColumn(),
                    "La condición del 'si' debe ser booleana.");
        }

        for (AstNode stmt : node.getThenBody()) {
            stmt.accept(this);
        }
        for (ElseIfNode elseIf : node.getElseIfs()) {
            elseIf.accept(this);
        }
        if (node.getElseBlockNode() != null) {
            node.getElseBlockNode().accept(this);
        }
        return null;
    }

    @Override
    public Void visit(ElseIfNode node) {
        TypeResolverVisitor resolver = new TypeResolverVisitor(currentScope,globalScope,scopeRegistry, errors);

        TypeWrapper conditionType = node.getCondition().accept(resolver);
        if (conditionType != null && conditionType.getDataType() != DataType.BOOLEAN) {
            addError("condición", node.getLine(), node.getColumn(),
                    "La condición de 'aliter' debe ser booleana.");
        }
        for (AstNode stmt : node.getBody()) {
            stmt.accept(this);
        }
        return null;
    }

    @Override
    public Void visit(ElseBlockNode node) {
        for (AstNode stmt : node.getBody()) {
            stmt.accept(this);
        }
        return null;
    }

    // ========== AUXILIAR METHODS =========

    /*
     * This method verify if the type of the variable is registered in types table
     */
    private void verifyStructLiteral(StructLiteralExpressionNode literal, TypeNode expectedType) {

        if (expectedType == null || expectedType.getDataType() != DataType.CUSTOM) {
            addError("literal", literal.getLine(), literal.getColumn(),
                    "El literal no corresponde a un tipo struct.");
            return;
        }

        String structName = expectedType.getCustomTypeName();

        Symbol structSymbolType = globalScope.getStruct(structName);
        if (structSymbolType == null) {
            addError(structName, literal.getLine(), literal.getColumn(),
                    "El struct '" + structName + "' no existe.");
            return;
        }

        List<Symbol> fields = structSymbolType.getStructFields();

        Map<String, Symbol> fieldMap = new HashMap<>();
        for (Symbol field : fields) {
            fieldMap.put(field.getId(), field);
        }

        TypeResolverVisitor resolver = new TypeResolverVisitor(currentScope, globalScope,scopeRegistry, errors);

        for (StructPropertyNode prop : literal.getProperties()) {
            String propName = prop.getPropertyName();
            Symbol fieldNode = fieldMap.get(propName);

            if (fieldNode == null) {
                addError(propName, prop.getLine(), prop.getColumn(),
                        "La propiedad '" + propName + "' no existe en el struct '" +
                                structName + "'.");
                continue;
            }

            ExpressionNode value = prop.getValue();

            if (value instanceof ArrayCallExpressionNode) {
                ArrayCallExpressionNode arrayCall = (ArrayCallExpressionNode) value;
                if (arrayCall.isDeclaration()) {
                    if (!fieldNode.isArray()) {
                        addError(propName, prop.getLine(), prop.getColumn(),
                                "La propiedad '" + propName + "' no es un arreglo, pero se está inicializando como tal.");
                    }
                    continue;
                }
            }

            TypeWrapper valueType = value.accept(resolver);
            if (valueType != null && fieldNode.getType() != null) {
                if (!isAssignable(fieldNode.getType(), valueType.getTypeNode())) {
                    addError(propName, prop.getLine(), prop.getColumn(),
                            "Tipo incorrecto para propiedad '" + propName +
                                    "'. Se espera: '" + fieldNode.getType().getDataType().getValue() +
                                    "', pero se obtuvo: '" + valueType.getDataType().getValue() + "'");
                }
            }
        }
    }

    private boolean checkAllPathsHaveReturn(List<AstNode> body) {
        if (body.isEmpty()) return false;
        AstNode last = body.get(body.size() - 1);
        return last instanceof ReturnStatementNode;
    }

    // ========== STUBS =========

    @Override public Void visit(LiteralExpressionNode node) { return null; }
    @Override public Void visit(BinaryExpressionNode node) { return null; }
    @Override public Void visit(UnaryExpressionNode node) { return null; }
    @Override public Void visit(FunctionCallExpressionNode node) { return null; }
    @Override public Void visit(ArrayInitExpressionNode node) { return null; }
    @Override public Void visit(TypeNode node) { return null; }
    @Override public Void visit(PrintStatementNode node) { return null; }
    @Override public Void visit(ReadStatementNode node) { return null; }
    @Override public Void visit(IncrementStatementNode node) { return null; }
    @Override public Void visit(DecrementStatementNode node) { return null; }
}