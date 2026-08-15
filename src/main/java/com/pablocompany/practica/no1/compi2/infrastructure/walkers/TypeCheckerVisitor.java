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

import java.util.ArrayList;
import java.util.List;

//This is the second phase of the compilator (the type checker)
public class TypeCheckerVisitor implements AstVisitor<Void> {

    private final Environment globalScope;
    private Environment currentScope;
    private final List<Environment> scopeStack;
    private final List<CompilerError> errors;
    private boolean insideFunction = false;
    private boolean insideLoop = false;
    private TypeNode expectedReturnType = null;


    public TypeCheckerVisitor(Environment globalScope, List<CompilerError> errors) {
        this.errors = errors;
        this.globalScope = globalScope;
        this.currentScope = globalScope;
        this.scopeStack = new ArrayList<>();
        this.scopeStack.add(globalScope);
    }

    //======= SCOPE METHODS =======
    private void enterScope(String name) {
        Environment newScope = new Environment(currentScope, name);
        currentScope = newScope;
        scopeStack.add(newScope);
    }

    private void exitScope() {
        scopeStack.removeLast();
        currentScope = scopeStack.getLast();
    }

    //Method to register a new error (if is needed)
    private void addError(String lexeme, int line, int column, String message) {
        errors.add(new CompilerError(lexeme, line, column, ErrorType.SEMANTIC, message));
    }


    //This method is the principal resolver to find the id in the scopes
    private Symbol resolveSymbol(String id, int line, int column) {
        Symbol symbol = currentScope.get(id);
        if (symbol == null) {
            addError(id, line, column, "Símbolo no encontrado: '" + id + "'");
        }
        return symbol;
    }

    //This is a helper to return the type of the symbol
    private TypeNode resolveType(Symbol symbol) {
        if (symbol == null) return null;
        return symbol.getType();
    }

    private boolean isAssignable(TypeNode target, TypeNode source) {
        if (target == null || source == null) return false;

        if (target.getDataType() == source.getDataType()) {
            if (target.getDataType() == DataType.CUSTOM) {
                return target.getCustomTypeName().equals(source.getCustomTypeName());
            }
            return true;
        }

        if (target.getDataType() == DataType.DECIMAL &&
                source.getDataType() == DataType.INT) {
            return true;
        }

        return false;
    }


    //========= PRINCIPAL PROGRAM PRODUCTIONS =========
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


    //========= PRINCIPAL SECTION PRODUCTIONS =========

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
        for (AstNode func : node.getStatements()) {
            func.accept(this);
        }
        return null;
    }

    //========= PRINCIPAL VARIABLE DECLARATIONS =========

    @Override
    public Void visit(VariableDeclarationNode node) {
        if (node.getDataType().getDataType() == DataType.CUSTOM) {
            if (globalScope.getStruct(node.getDataType().getCustomTypeName()) == null) {
                addError(node.getIdentifier(), node.getLine(), node.getColumn(),
                        "Tipo desconocido: '" + node.getDataType().getCustomTypeName() + "'");
                return null;
            }
        }

        TypeNode initType = node.getInitializer().accept(new TypeResolverVisitor(currentScope, errors));
        if (initType != null && !isAssignable(node.getDataType(), initType)) {
            addError(initType.getDataType().getValue(), node.getLine(), node.getColumn(),
                    "Tipo incorrecto. Se esperaba: " + node.getDataType().getDataType() +
                            ", pero se obtuvo: " + initType.getDataType());
        }

        return null;
    }

    @Override
    public Void visit(ArrayDeclarationNode node) {
        if (node.getDataType().getDataType() == DataType.CUSTOM) {
            if (globalScope.getStruct(node.getDataType().getCustomTypeName()) == null) {

                String customTypeName = node.getDataType().getCustomTypeName();
                addError(node.getIdentifier(), node.getLine(), node.getColumn(),
                        "Tipo desconocido: '" + customTypeName + "'");
                return null;
            }
        }

        TypeNode sizeType = node.getSize().accept(new TypeResolverVisitor(currentScope, errors));
        if (sizeType != null && sizeType.getDataType() != DataType.INT) {
            addError(node.getIdentifier(), node.getLine(), node.getColumn(),
                    "El tamaño del arreglo debe ser un entero.");
        }

        if (node.getInitializer() != null) {
            TypeNode initType = node.getInitializer().accept(new TypeResolverVisitor(currentScope, errors));
            if (initType != null && !isAssignable(node.getDataType(), initType)) {
                addError(node.getIdentifier(), node.getLine(), node.getColumn(),
                        "Tipo incorrecto en inicialización del arreglo.");
            }
        }

        return null;
    }

    //TODO
    @Override
    public Void visit(StructDeclarationNode node) {
        return null;
    }

    @Override
    public Void visit(StructAttributeNode node) {
        return null;
    }

    @Override
    public Void visit(StructInstanceNode node) {
        TypeNode structType = globalScope.getStruct(node.getStructType());
        if (structType == null) {
            addError(node.getIdentifier(), node.getLine(), node.getColumn(),
                    "Struct no definido: '" + node.getStructType() + "'");
            return null;
        }

        //Type properties checking delegated
        node.getLiteral().accept(this);

        return null;
    }


    //======= ASSIGNATIONS =======

    @Override
    public Void visit(VariableAssignmentNode node) {
        TypeNode targetType = node.getIdentifier().accept(new TypeResolverVisitor(currentScope, errors));
        if (targetType == null) {
            addError("variable indefinida", node.getLine(), node.getColumn(),
                    "La variable de la asignación no es valida.");
            return null;
        }

        TypeNode valueType = node.getExpressionNode().accept(new TypeResolverVisitor(currentScope, errors));
        if (valueType != null && !isAssignable(targetType, valueType)) {
            addError(valueType.getCustomTypeName(), node.getLine(), node.getColumn(),
                    "Tipo de asignacion incorrecto. Se esperaba: " + targetType.getDataType() +
                            ", se obtuvo: " + valueType.getDataType());
        }

        return null;
    }

    //===== EXPRESSION RESOLVER =====

    @Override
    public Void visit(IdentifierExpressionNode node) {
        resolveSymbol(node.getIdentifier(), node.getLine(), node.getColumn());
        return null;
    }

    @Override
    public Void visit(PropertyAccessExpressionNode node) {
        TypeNode targetType = node.getTarget().accept(new TypeResolverVisitor(currentScope, errors));
        if (targetType == null) {
            addError("propiedad indefinida", node.getLine(), node.getColumn(),
                    "No se puede acceder a la propiedad de un tipo nulo.");
            return null;
        }

        if (targetType.getDataType() == DataType.CUSTOM) {
            String structName = targetType.getCustomTypeName();
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
            } else {
                addError(node.getPropertyName(), node.getLine(), node.getColumn(),
                        "El tipo '" + structName + "' no es un struct válido.");
            }
        } else {
            addError(node.getPropertyName(), node.getLine(), node.getColumn(),
                    "Solo se puede acceder a propiedades definidas del struct.");
        }

        return null;
    }

    @Override
    public Void visit(ArrayCallExpressionNode node) {
        Symbol arraySymbol = resolveSymbol(node.getArrayName(), node.getLine(), node.getColumn());
        if (arraySymbol == null) {
            return null;
        }

        if (arraySymbol.getKind() != SymbolKind.ARRAY &&
                arraySymbol.getKind() != SymbolKind.PARAMETER) {
            addError(node.getArrayName(), node.getLine(), node.getColumn(),
                    "La variable: '" + node.getArrayName() + "' no es un arreglo.");
            return null;
        }

        TypeNode indexType = node.getIndexExpression().accept(new TypeResolverVisitor(currentScope, errors));
        if (indexType != null && indexType.getDataType() != DataType.INT) {
            addError(node.getArrayName(), node.getLine(), node.getColumn(),
                    "El indice del arreglo debe ser un valor entero.");
        }

        return null;
    }

    @Override
    public Void visit(MemberArrayAccessExpressionNode node) {
        TypeNode targetType = node.getTarget().accept(new TypeResolverVisitor(currentScope, errors));
        if (targetType == null) {
            addError("propiedad indefinida", node.getLine(), node.getColumn(),
                    "No se puede acceder a un arreglo nulo.");
            return null;
        }

        TypeNode indexType = node.getIndex().accept(new TypeResolverVisitor(currentScope, errors));
        if (indexType != null && indexType.getDataType() != DataType.INT) {
            addError(indexType.getCustomTypeName(), node.getLine(), node.getColumn(),
                    "El indice del arreglo debe ser un valor entero.");
        }

        return null;
    }

    // ===== FUNCTIONS =====

    @Override
    public Void visit(FunctionDeclarationNode node) {
        insideFunction = true;
        expectedReturnType = node.getReturnType();

        enterScope("function_" + node.getName());

        for (AstNode stmt : node.getBody()) {
            stmt.accept(this);
        }

        //Verify if the function has any return value
        boolean hasReturn = checkAllPathsHaveReturn(node.getBody());
        if (!hasReturn) {
            addError(node.getName(), node.getLine(), node.getColumn(),
                    "La funcion '" + node.getName() +
                            "' no tiene un valor de retorno definido.");
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

        for (AstNode stmt : node.getBody()) {
            stmt.accept(this);
        }

        exitScope();
        insideFunction = false;
        expectedReturnType = null;
        return null;
    }

    //TODO
    @Override
    public Void visit(ParameterNode node) {
        return null;
    }

    @Override
    public Void visit(ReturnStatementNode node) {
        if (!insideFunction) {
            addError("reddere", node.getLine(), node.getColumn(),
                    "'reddere' solo puede usarse dentro de una funcion.");
            return null;
        }

        if (node.getValue() != null) {
            TypeNode returnType = node.getValue().accept(new TypeResolverVisitor(currentScope, errors));
            if (returnType != null && expectedReturnType != null) {
                if (!isAssignable(expectedReturnType, returnType)) {
                    addError(expectedReturnType.getCustomTypeName(), node.getLine(), node.getColumn(),
                            "El tipo de retorno de la funcion es incorrecto. Esperado: " +
                                    expectedReturnType.getDataType() + ", se declaro: " +
                                    returnType.getDataType());
                }
            }
        } else if (expectedReturnType != null) {
            addError(expectedReturnType.getCustomTypeName(), node.getLine(), node.getColumn(),
                    "La funcion debe retornar un valor de tipo: " +
                            expectedReturnType.getDataType());
        }

        return null;
    }

    // ===== LOOPS =====

    @Override
    public Void visit(WhileStatementNode node) {
        insideLoop = true;
        TypeNode conditionType = node.getCondition().accept(new TypeResolverVisitor(currentScope, errors));
        if (conditionType != null && conditionType.getDataType() != DataType.BOOLEAN) {
            addError(conditionType.getDataType().getValue(), node.getLine(), node.getColumn(),
                    "La condicion del ciclo 'dum' debe ser booleana.");
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
        TypeNode conditionType = node.getCondion().accept(new TypeResolverVisitor(currentScope, errors));
        if (conditionType != null && conditionType.getDataType() != DataType.BOOLEAN) {
            addError(conditionType.getDataType().getValue(), node.getLine(), node.getColumn(),
                    "La condición del facere-dum debe ser booleana.");
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

        if (node.getCondition() != null) {
            TypeNode conditionType = node.getCondition().accept(new TypeResolverVisitor(currentScope, errors));
            if (conditionType != null && conditionType.getDataType() != DataType.BOOLEAN) {
                addError(conditionType.getDataType().getValue(), node.getLine(), node.getColumn(),
                        "La condicion del ciclo 'per' debe ser booleana.");
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

    //====BREAK POINTS====
    @Override
    public Void visit(BreakStatementNode node) {
        if (!insideLoop) {
            addError("interrumpe", node.getLine(), node.getColumn(),
                    "La instruccion 'interrumpe' solo puede usarse dentro de un ciclo.");
        }
        return null;
    }

    @Override
    public Void visit(ContinueStatementNode node) {
        if (!insideLoop) {
            addError("perge", node.getLine(), node.getColumn(),
                    "La instruccion 'perge' solo puede usarse dentro de un ciclo.");
        }
        return null;
    }


    // ===== CONDICIONAL STATEMENTS =====

    @Override
    public Void visit(ElseIfNode node) {

        TypeNode conditionType = node.getCondition().accept(new TypeResolverVisitor(currentScope, errors));
        if (conditionType != null && conditionType.getDataType() != DataType.BOOLEAN) {
            addError(conditionType.getDataType().getValue(), node.getLine(), node.getColumn(),
                    "La condicion de 'aliter' debe ser booleana.");
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

    @Override
    public Void visit(IfStatementNode node) {

        TypeNode conditionType = node.getCondition().accept(new TypeResolverVisitor(currentScope, errors));
        if (conditionType != null && conditionType.getDataType() != DataType.BOOLEAN) {
            addError(conditionType.getDataType().getValue(), node.getLine(), node.getColumn(),
                    "La condicion del 'si' debe ser booleana.");
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
    public Void visit(LiteralExpressionNode node) {
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

    @Override
    public Void visit(PrintStatementNode node) {
        return null;
    }

    @Override
    public Void visit(ReadStatementNode node) {
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


    // ===== HELPER METHODS (FIND RETURN IN THE FUNCTIONS)=====

    private boolean checkAllPathsHaveReturn(List<AstNode> body) {
        if (body.isEmpty()) return false;
        AstNode last = body.get(body.size() - 1);
        return last instanceof ReturnStatementNode;
    }
}
