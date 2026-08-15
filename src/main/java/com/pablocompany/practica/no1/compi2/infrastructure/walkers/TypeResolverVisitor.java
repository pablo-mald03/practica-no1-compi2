package com.pablocompany.practica.no1.compi2.infrastructure.walkers;

import com.pablocompany.practica.no1.compi2.domain.highlight.ErrorType;
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
import com.pablocompany.practica.no1.compi2.infrastructure.walkers.services.ResolverTypesService;

import java.util.List;

//THIS IS THE PRINCIPAL AND THE MOST IMPORTANT CLASS
//FOLLOW THE INFERENCE RULES
public class TypeResolverVisitor implements AstVisitor<TypeWrapper> {

    private final Environment currentScope;
    private final Environment globalScope;
    private final List<CompilerError> errors;

    private final ResolverTypesService resolver;

    public TypeResolverVisitor(Environment currentScope, Environment globalScope, List<CompilerError> errors) {
        this.currentScope = currentScope;
        this.errors = errors;
        this.globalScope = globalScope;
        this.resolver = new ResolverTypesService();
    }

    //This method add a new semantic error
    private void addError(String lexeme, int line, int column, String message) {
        errors.add(new CompilerError(lexeme, line, column, ErrorType.SEMANTIC, message));
    }

    @Override
    public TypeWrapper visit(LiteralExpressionNode node) {
        return new TypeWrapper( new TypeNode(node.getLine(), node.getColumn(), node.getValueType(), null) , node.getValue());
    }

    //Identifier value checking
    @Override
    public TypeWrapper visit(IdentifierExpressionNode node) {
        Symbol symbol = currentScope.get(node.getIdentifier());
        if (symbol == null) {
            addError(node.getIdentifier(), node.getLine(), node.getColumn(),
                    "La variable: '" + node.getIdentifier() + "' no esta definida.");
            return null;
        }
        return new TypeWrapper( symbol.getType(), node.getIdentifier());
    }

    //Type checking of a binary expression node (THE MOST IMPORTANT)
    @Override
    public TypeWrapper visit(BinaryExpressionNode node) {
        TypeWrapper left = node.getLeft().accept(this);
        TypeWrapper right = node.getRight().accept(this);

        if (left == null || right == null) {
            if (left == null && right != null) {
                addError("operacion", node.getLine(), node.getColumn(),
                        "Operando izquierdo invalido en: " + this.resolver.getValueOperationString(node));
            } else if (left != null && right == null) {
                addError("operacion", node.getLine(), node.getColumn(),
                        "Operando derecho invalido en: " + this.resolver.getValueOperationString(node));
            }
            return null;
        }

        String op = node.getOperator().getValue();
        String fullExpr = this.resolver.getValueOperationString(node);
        TypeNode leftType = left.getTypeNode();
        TypeNode rightType = right.getTypeNode();

        // === ARITHMETIC OPERATIONS ===
        if ("+".equals(op) || "-".equals(op) || "*".equals(op) || "/".equals(op)) {
            if ("+".equals(op)) {
                if (leftType.getDataType() == DataType.STRING && rightType.getDataType() == DataType.STRING) {
                    return new TypeWrapper(
                            new TypeNode(node.getLine(), node.getColumn(), DataType.STRING, null),
                            fullExpr
                    );
                }
                if (leftType.getDataType() == DataType.STRING) {
                    return new TypeWrapper(
                            new TypeNode(node.getLine(), node.getColumn(), DataType.STRING, null),
                            fullExpr
                    );
                }
                if (rightType.getDataType() == DataType.STRING) {
                    return new TypeWrapper(
                            new TypeNode(node.getLine(), node.getColumn(), DataType.STRING, null),
                            fullExpr
                    );
                }
            }

            if (this.resolver.isNumeric(leftType) && this.resolver.isNumeric(rightType)) {
                if (leftType.getDataType() == DataType.DECIMAL || rightType.getDataType() == DataType.DECIMAL) {
                    return new TypeWrapper(
                            new TypeNode(node.getLine(), node.getColumn(), DataType.DECIMAL, null),
                            fullExpr
                    );
                }
                if (leftType.getDataType() == DataType.INT && rightType.getDataType() == DataType.INT) {
                    return new TypeWrapper(
                            new TypeNode(node.getLine(), node.getColumn(), DataType.INT, null),
                            fullExpr
                    );
                }
            }

            addError(fullExpr, node.getLine(), node.getColumn(),
                    "Operación aritmética inválida entre " +
                            left.getDisplayString() + " y " + right.getDisplayString());
            return null;
        }

        // === RELATIONAL OPERATORS ===
        if ("==".equals(op) || "!=".equals(op) || "<".equals(op) ||
                ">".equals(op) || "<=".equals(op) || ">=".equals(op)) {

            if ("==".equals(op) || "!=".equals(op)) {
                if (this.resolver.areComparable(leftType, rightType)) {
                    return new TypeWrapper(
                            new TypeNode(node.getLine(), node.getColumn(), DataType.BOOLEAN, null),
                            fullExpr
                    );
                }
            } else {
                if (this.resolver.isNumeric(leftType) && this.resolver.isNumeric(rightType)) {
                    return new TypeWrapper(
                            new TypeNode(node.getLine(), node.getColumn(), DataType.BOOLEAN, null),
                            fullExpr
                    );
                }
            }

            addError(fullExpr, node.getLine(), node.getColumn(),
                    "No se pueden comparar " +
                            left.getDisplayString() + " y " + right.getDisplayString());
            return null;
        }

        // === CONDITIONAL OPERATORS ===
        if ("&&".equals(op) || "||".equals(op)) {
            if (leftType.getDataType() == DataType.BOOLEAN && rightType.getDataType() == DataType.BOOLEAN) {
                return new TypeWrapper(
                        new TypeNode(node.getLine(), node.getColumn(), DataType.BOOLEAN, null),
                        fullExpr
                );
            }
            addError(fullExpr, node.getLine(), node.getColumn(),
                    "Operación lógica requiere booleanos, pero se encontró " +
                            left.getDisplayString() + " y " + right.getDisplayString());
            return null;
        }

        return null;
    }

    @Override
    public TypeWrapper visit(UnaryExpressionNode node) {
        TypeWrapper operand = node.getExpressionNode().accept(this);
        if (operand == null) return null;

        String errorCase = operand.getTypeNode().getCustomTypeName();

        String errorLexeme = node.getOperator().getValue() + " " + operand.getValue(errorCase);

        String op = node.getOperator().getValue();
        if ("-".equals(op)) {
            if (operand.getTypeNode().getDataType() == DataType.INT ||
                    operand.getTypeNode().getDataType() == DataType.DECIMAL) {
                return operand;
            }
            addError(errorLexeme, node.getLine(), node.getColumn(),
                    "El operador unario '-' no es aplicable al tipo " + operand.getTypeNode().getDataType().getValue());
            return null;
        }
        if ("non".equals(op)) {
            if (operand.getTypeNode().getDataType() == DataType.BOOLEAN) {
                return new TypeWrapper(
                        new TypeNode(node.getLine(), node.getColumn(), DataType.BOOLEAN, null),
                        this.resolver.getValueFromNode(node.getExpressionNode()));
            }
            addError(errorLexeme, node.getLine(), node.getColumn(),
                    "El operador 'non' solo se puede aplicar a tipos booleanos.");
            return null;
        }

        return null;
    }

    //This method validate the function call expression node
    @Override
    public TypeWrapper visit(FunctionCallExpressionNode node) {
        Symbol funcSymbol = currentScope.get(node.getFunctionName());
        if (funcSymbol == null) {
            addError(node.getFunctionName(), node.getLine(), node.getColumn(),
                    "Funcion no definida: '" + node.getFunctionName() + "'");
            return null;
        }

        if (funcSymbol.getKind() != SymbolKind.FUNCTION) {
            addError(node.getFunctionName(), node.getLine(), node.getColumn(),
                    "'" + node.getFunctionName() + "' no es una función.");
            return null;
        }

        int expectedArgs = funcSymbol.getParameters().size();
        int actualArgs = node.getArguments().size();
        if (expectedArgs != actualArgs) {
            addError(node.getFunctionName(), node.getLine(), node.getColumn(),
                    "La funcion '" + node.getFunctionName() + "' espera " +
                            expectedArgs + " argumentos, pero recibe " + actualArgs);
            return null;
        }

        for (int i = 0; i < expectedArgs; i++) {
            TypeWrapper argType = node.getArguments().get(i).accept(this);
            TypeNode paramType = funcSymbol.getParameters().get(i).getType();
            if (argType != null && paramType != null) {
                if (!this.resolver.isAssignable(paramType, argType.getTypeNode())) {
                    addError(node.getFunctionName(), node.getLine(), node.getColumn(),
                            "Argumento " + (i + 1) + " de '" + node.getFunctionName() +
                                    "' se espera " + paramType.getDataType() +
                                    ", pero recibe " + argType.getTypeNode().getDataType());
                }
            }
        }

        return new TypeWrapper(funcSymbol.getType(), node.getFunctionName());
    }

    @Override
    public TypeWrapper visit(ArrayCallExpressionNode node) {
        if (node.isDeclaration()) {
            return null;
        }

        String fullExpr = this.resolver.getValueFromNode(node);

        Symbol arraySymbol = currentScope.get(node.getArrayName());
        if (arraySymbol == null) {
            arraySymbol = globalScope.get(node.getArrayName());
            if (arraySymbol == null) {
                addError(fullExpr, node.getLine(), node.getColumn(),
                        "El arreglo '" + node.getArrayName() + "' no esta definido.");
                return null;
            }
        }

        if (arraySymbol.getKind() != SymbolKind.ARRAY &&
                arraySymbol.getKind() != SymbolKind.PARAMETER) {
            addError(fullExpr, node.getLine(), node.getColumn(),
                    "'" + node.getArrayName() + "' no es un arreglo, es " +
                            arraySymbol.getKind());
            return null;
        }

        if (node.getIndexExpression() != null) {
            TypeWrapper indexType = node.getIndexExpression().accept(this);
            if (indexType != null && indexType.getTypeNode() != null) {
                if (indexType.getTypeNode().getDataType() != DataType.INT) {
                    addError(fullExpr, node.getLine(), node.getColumn(),
                            "El indice del arreglo debe ser entero, pero es " +
                                    indexType.getDisplayString());
                }
            }
        }

        return new TypeWrapper(arraySymbol.getType(), node.getArrayName(), fullExpr);
    }

    //This is the property nested data s
    @Override
    public TypeWrapper visit(PropertyAccessExpressionNode node) {
        TypeWrapper targetType = node.getTarget().accept(this);
        if (targetType == null || targetType.getTypeNode() == null) {
            addError("propiedad", node.getLine(), node.getColumn(),
                    "No se puede acceder a una propiedad de un valor nulo.");
            return null;
        }

        String fullExpr = this.resolver.getValueFromNode(node);

        if (targetType.getTypeNode().getDataType() == DataType.CUSTOM) {
            String structName = targetType.getTypeNode().getCustomTypeName();

            TypeNode structType = globalScope.getStruct(structName);
            if (structType == null) {
                addError(fullExpr, node.getLine(), node.getColumn(),
                        "El tipo '" + structName + "' no es un struct valido.");
                return null;
            }

            for (StructAttributeNode field : structType.getFields()) {
                if (field.getIdentifier().equals(node.getPropertyName())) {
                    return new TypeWrapper(field.getType(), node.getPropertyName(), fullExpr);
                }
            }

            addError(fullExpr, node.getLine(), node.getColumn(),
                    "La propiedad '" + node.getPropertyName() +
                            "' no existe en el struct '" + structName + "'");
        } else {
            addError(fullExpr, node.getLine(), node.getColumn(),
                    "Solo se puede acceder a propiedades de structs, pero '" +
                            targetType.getDisplayString() + "' no es un struct.");
        }

        return null;
    }

    @Override
    public TypeWrapper visit(MemberArrayAccessExpressionNode node) {
        TypeWrapper targetType = node.getTarget().accept(this);
        if (targetType == null || targetType.getTypeNode() == null) {
            addError("array", node.getLine(), node.getColumn(),
                    "No se puede acceder a un arreglo de un tipo nulo.");
            return null;
        }

        String fullExpr = this.resolver.getValueFromNode(node);

        if (node.getIndex() != null) {
            TypeWrapper indexType = node.getIndex().accept(this);
            if (indexType != null && indexType.getTypeNode() != null) {
                if (indexType.getTypeNode().getDataType() != DataType.INT) {
                    addError(fullExpr, node.getLine(), node.getColumn(),
                            "El indice del arreglo debe ser entero, pero es " +
                                    indexType.getDisplayString());
                }
            }
        }

        if (targetType.getTypeNode().getDataType() == DataType.CUSTOM) {
            String structName = targetType.getTypeNode().getCustomTypeName();
            TypeNode structType = globalScope.getStruct(structName);
            if (structType != null) {
                for (StructAttributeNode field : structType.getFields()) {
                    if (field.isArray()) {
                        return new TypeWrapper(field.getType(), fullExpr);
                    }
                }
            }
            addError(fullExpr, node.getLine(), node.getColumn(),
                    "El struct '" + structName + "' no tiene un campo array accesible.");
            return null;
        }

        addError(fullExpr, node.getLine(), node.getColumn(),
                "No se puede acceder a un arreglo de un tipo no struct: " +
                        targetType.getDisplayString());
        return null;
    }

    @Override
    public TypeWrapper visit(ArrayInitExpressionNode node) {
        if (node.getElements().isEmpty()) {
            return null;
        }
        TypeWrapper firstType = node.getElements().get(0).accept(this);
        for (ExpressionNode elem : node.getElements()) {
            TypeWrapper elemType = elem.accept(this);
            if (elemType != null && firstType != null) {
                if (!this.resolver.isAssignable(firstType.getTypeNode(), elemType.getTypeNode())) {
                    addError(elemType.getTypeNode().getDataType().getValue(), node.getLine(), node.getColumn(),
                            "Elementos del array de tipos inconsistentes.");
                }
            }
        }
        return firstType;
    }

    //Struct literal declaration doesnt have any value
    @Override
    public TypeWrapper visit(StructLiteralExpressionNode node) {
        return null;
    }

    //========= NOT NEED TO USE THAT PRODUCTIONS =========
    @Override
    public TypeWrapper visit(ProgramNode node) {
        return null;
    }

    @Override
    public TypeWrapper visit(ArrayDeclarationNode node) {
        return null;
    }

    @Override
    public TypeWrapper visit(BodyNode node) {
        return null;
    }

    @Override
    public TypeWrapper visit(MuneraSectionNode node) {
        return null;
    }

    @Override
    public TypeWrapper visit(MaiorSectionNode node) {
        return null;
    }

    @Override
    public TypeWrapper visit(VariableAssignmentNode node) {
        return null;
    }

    @Override
    public TypeWrapper visit(VariableDeclarationNode node) {
        return null;
    }

    @Override
    public TypeWrapper visit(TypeNode node) {
        return null;
    }

    @Override
    public TypeWrapper visit(StructDeclarationNode node) {
        return null;
    }

    @Override
    public TypeWrapper visit(StructAttributeNode node) {
        return null;
    }

    @Override
    public TypeWrapper visit(StructPropertyNode node) {
        return null;
    }

    @Override
    public TypeWrapper visit(StructInstanceNode node) {
        return null;
    }

    @Override
    public TypeWrapper visit(VariablesSectionNode node) {
        return null;
    }

    @Override
    public TypeWrapper visit(IncrementStatementNode node) {
        return null;
    }

    @Override
    public TypeWrapper visit(DecrementStatementNode node) {
        return null;
    }

    @Override
    public TypeWrapper visit(IfStatementNode node) {
        return null;
    }

    @Override
    public TypeWrapper visit(ElseIfNode node) {
        return null;
    }

    @Override
    public TypeWrapper visit(ElseBlockNode node) {
        return null;
    }

    @Override
    public TypeWrapper visit(WhileStatementNode node) {
        return null;
    }

    @Override
    public TypeWrapper visit(DoWhileStatementNode node) {
        return null;
    }

    @Override
    public TypeWrapper visit(ForStatementNode node) {
        return null;
    }

    @Override
    public TypeWrapper visit(PrintStatementNode node) {
        return null;
    }

    @Override
    public TypeWrapper visit(ReadStatementNode node) {
        return null;
    }

    @Override
    public TypeWrapper visit(ReturnStatementNode node) {
        return null;
    }

    @Override
    public TypeWrapper visit(BreakStatementNode node) {
        return null;
    }

    @Override
    public TypeWrapper visit(ContinueStatementNode node) {
        return null;
    }

    @Override
    public TypeWrapper visit(FunctionDeclarationNode node) {
        return null;
    }

    @Override
    public TypeWrapper visit(ProcedureDeclarationNode node) {
        return null;
    }

    @Override
    public TypeWrapper visit(ParameterNode node) {
        return null;
    }
}
