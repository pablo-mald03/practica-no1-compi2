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
import com.pablocompany.practica.no1.compi2.infrastructure.errors.CompilerError;
import com.pablocompany.practica.no1.compi2.infrastructure.semantic.symbols.Environment;
import com.pablocompany.practica.no1.compi2.infrastructure.semantic.symbols.Symbol;
import com.pablocompany.practica.no1.compi2.infrastructure.semantic.symbols.enums.SymbolKind;

import java.util.List;

//THIS IS THE PRINCIPAL AND THE MOST IMPORTANT CLASS
//FOLLOW THE INFERENCE RULES
public class TypeResolverVisitor implements AstVisitor<TypeNode> {

    private final Environment currentScope;
    private final Environment globalScope;
    private final List<CompilerError> errors;

    public TypeResolverVisitor(Environment currentScope, Environment globalScope, List<CompilerError> errors) {
        this.currentScope = currentScope;
        this.errors = errors;
        this.globalScope = globalScope;
    }

    //This method add a new semantic error
    private void addError(String lexeme, int line, int column, String message) {
        errors.add(new CompilerError(lexeme, line, column, ErrorType.SEMANTIC, message));
    }

    @Override
    public TypeNode visit(LiteralExpressionNode node) {
        return new TypeNode(node.getLine(), node.getColumn(), node.getValueType(), null);
    }

    //Identifier value checking
    @Override
    public TypeNode visit(IdentifierExpressionNode node) {
        Symbol symbol = currentScope.get(node.getIdentifier());
        if (symbol == null) {
            addError(node.getIdentifier(), node.getLine(), node.getColumn(),
                    "La variable: '" + node.getIdentifier() + "' no esta definida.");
            return null;
        }
        return symbol.getType();
    }

    //Type checking of a binary expression node (THE MOST IMPORTANT)
    @Override
    public TypeNode visit(BinaryExpressionNode node) {
        TypeNode left = node.getLeft().accept(this);
        TypeNode right = node.getRight().accept(this);

        if (left == null || right == null) return null;

        String errorLexeme = left.getDataType().getValue() + " " + node.getOperator().getValue() + " " + right.getDataType().getValue();

        // arithmetic operation
        String op = node.getOperator().getValue();
        if ("+".equals(op) || "-".equals(op) || "*".equals(op) || "/".equals(op)) {
            if (left.getDataType() == DataType.INT && right.getDataType() == DataType.INT) {
                return new TypeNode(node.getLine(), node.getColumn(), DataType.INT, null);
            }
            if (left.getDataType() == DataType.DECIMAL || right.getDataType() == DataType.DECIMAL) {
                return new TypeNode(node.getLine(), node.getColumn(), DataType.DECIMAL, null);
            }

            if (left.getDataType() == DataType.STRING && right.getDataType() == DataType.STRING) {
                return new TypeNode(node.getLine(), node.getColumn(), DataType.STRING, null);
            }

            addError(errorLexeme, node.getLine(), node.getColumn(),
                    "Operacion aritmetica invalida entre " + left.getDataType() +
                            " y " + right.getDataType());
            return null;
        }

        // relational operators
        if ("==".equals(op) || "!=".equals(op) || "<".equals(op) ||
                ">".equals(op) || "<=".equals(op) || ">=".equals(op)) {

            if (left.getDataType() == right.getDataType() ||
                    (left.getDataType() == DataType.INT && right.getDataType() == DataType.DECIMAL) ||
                    (left.getDataType() == DataType.DECIMAL && right.getDataType() == DataType.INT)) {
                return new TypeNode(node.getLine(), node.getColumn(), DataType.BOOLEAN, null);
            }


            addError(errorLexeme, node.getLine(), node.getColumn(),
                    "No se pueden comparar " + left.getDataType() + " con " + right.getDataType());
            return null;
        }

        //Logical operation
        if ("&&".equals(op) || "||".equals(op)) {
            if (left.getDataType() == DataType.BOOLEAN && right.getDataType() == DataType.BOOLEAN) {
                return new TypeNode(node.getLine(), node.getColumn(), DataType.BOOLEAN, null);
            }
            addError(errorLexeme, node.getLine(), node.getColumn(),
                    "Una operacion logica necesita valores booleanos.");
            return null;
        }
        return null;
    }

    @Override
    public TypeNode visit(UnaryExpressionNode node) {
        TypeNode operand = node.getExpressionNode().accept(this);
        if (operand == null) return null;

        String errorLexeme = node.getOperator().getValue() + " " + operand.getDataType().getValue();

        String op = node.getOperator().getValue();
        if ("-".equals(op)) {
            if (operand.getDataType() == DataType.INT ||
                    operand.getDataType() == DataType.DECIMAL) {
                return operand;
            }
            addError(errorLexeme, node.getLine(), node.getColumn(),
                    "El operador unario '-' no es aplicable al tipo " + operand.getDataType());
            return null;
        }
        if ("non".equals(op)) {
            if (operand.getDataType() == DataType.BOOLEAN) {
                return new TypeNode(node.getLine(), node.getColumn(), DataType.BOOLEAN, null);
            }
            addError(errorLexeme, node.getLine(), node.getColumn(),
                    "Operador 'non' solo se puede aplicar a tipos booleanos.");
            return null;
        }

        return null;
    }

    //This method validate the function call expression node
    @Override
    public TypeNode visit(FunctionCallExpressionNode node) {
        Symbol funcSymbol = currentScope.get(node.getFunctionName());
        if (funcSymbol == null) {
            addError(node.getFunctionName(), node.getLine(), node.getColumn(),
                    "Función no definida: '" + node.getFunctionName() + "'");
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
            TypeNode argType = node.getArguments().get(i).accept(this);
            TypeNode paramType = funcSymbol.getParameters().get(i).getType();
            if (argType != null && paramType != null) {
                if (!isAssignable(paramType, argType)) {
                    addError(node.getFunctionName(), node.getLine(), node.getColumn(),
                            "Argumento " + (i + 1) + " de '" + node.getFunctionName() +
                                    "' se espera " + paramType.getDataType() +
                                    ", pero recibe " + argType.getDataType());
                }
            }
        }

        return funcSymbol.getType();
    }

    @Override
    public TypeNode visit(ArrayCallExpressionNode node) {
        if (node.isDeclaration()) {
            return null;
        }

        Symbol arraySymbol = currentScope.get(node.getArrayName());
        if (arraySymbol == null) {
            arraySymbol = globalScope.get(node.getArrayName());
            if (arraySymbol == null) {
                addError(node.getArrayName(), node.getLine(), node.getColumn(),
                        "El arreglo: '" + node.getArrayName() + "' no está definido.");
                return null;
            }
        }

        if (arraySymbol.getKind() != SymbolKind.ARRAY &&
                arraySymbol.getKind() != SymbolKind.PARAMETER) {
            addError(node.getArrayName(), node.getLine(), node.getColumn(),
                    "'" + node.getArrayName() + "' no es un arreglo.");
            return null;
        }

        return arraySymbol.getType();
    }

    //This is the property nested data s
    @Override
    public TypeNode visit(PropertyAccessExpressionNode node) {
        TypeNode targetType = node.getTarget().accept(this);
        if (targetType == null) {
            addError(node.getPropertyName(), node.getLine(), node.getColumn(),
                    "No se puede acceder a una propiedad no asignada de un struct.");
            return null;
        }

        if (targetType.getDataType() == DataType.CUSTOM) {
            String structName = targetType.getCustomTypeName();
            Symbol structSymbol = currentScope.get(structName);
            if (structSymbol != null && structSymbol.getKind() == SymbolKind.STRUCT) {
                for (Symbol field : structSymbol.getStructFields()) {
                    if (field.getId().equals(node.getPropertyName())) {
                        return field.getType();
                    }
                }
                addError(structName, node.getLine(), node.getColumn(),
                        "La propiedad '" + node.getPropertyName() +
                                "' no esta declarada en el struct '" + structName + "'");
            } else {
                addError(structName, node.getLine(), node.getColumn(),
                        "El tipo '" + structName + "' no es un struct valido.");
            }
        } else {
            addError(node.getPropertyName(), node.getLine(), node.getColumn(),
                    "Solo se puede acceder a propiedades de structs.");
        }

        return null;
    }

    @Override
    public TypeNode visit(MemberArrayAccessExpressionNode node) {
        TypeNode targetType = node.getTarget().accept(this);
        if (targetType == null) {
            addError("Sin valor", node.getLine(), node.getColumn(),
                    "No se puede acceder a una propiedad de arreglo no definida.");
            return null;
        }

        if (targetType.getDataType() == DataType.CUSTOM) {
            return targetType;
        }

        addError(targetType.getDataType().getValue(), node.getLine(), node.getColumn(),
                "No se puede acceder a un arreglo de un tipo no struct.");
        return null;
    }

    @Override
    public TypeNode visit(ArrayInitExpressionNode node) {
        if (node.getElements().isEmpty()) {
            return null;
        }
        TypeNode firstType = node.getElements().get(0).accept(this);
        for (ExpressionNode elem : node.getElements()) {
            TypeNode elemType = elem.accept(this);
            if (elemType != null && firstType != null) {
                if (!isAssignable(firstType, elemType)) {
                    addError(elemType.getDataType().getValue(), node.getLine(), node.getColumn(),
                            "Elementos del array de tipos inconsistentes.");
                }
            }
        }
        return firstType;
    }

    //Struct literal declaration doesnt have any value
    @Override
    public TypeNode visit(StructLiteralExpressionNode node) {
        return null;
    }

    //========= NOT NEED TO USE THAT PRODUCTIONS =========
    @Override
    public TypeNode visit(ProgramNode node) {
        return null;
    }

    @Override
    public TypeNode visit(BodyNode node) {
        return null;
    }

    @Override
    public TypeNode visit(VariablesSectionNode node) {
        return null;
    }

    @Override
    public TypeNode visit(MuneraSectionNode node) {
        return null;
    }

    @Override
    public TypeNode visit(MaiorSectionNode node) {
        return null;
    }

    @Override
    public TypeNode visit(VariableDeclarationNode node) {
        return null;
    }

    @Override
    public TypeNode visit(ArrayDeclarationNode node) {
        return null;
    }

    @Override
    public TypeNode visit(StructDeclarationNode node) {
        return null;
    }

    @Override
    public TypeNode visit(StructInstanceNode node) {
        return null;
    }

    @Override
    public TypeNode visit(StructAttributeNode node) {
        return null;
    }

    @Override
    public TypeNode visit(VariableAssignmentNode node) {
        return null;
    }

    @Override
    public TypeNode visit(IfStatementNode node) {
        return null;
    }

    @Override
    public TypeNode visit(ElseIfNode node) {
        return null;
    }

    @Override
    public TypeNode visit(ElseBlockNode node) {
        return null;
    }

    @Override
    public TypeNode visit(WhileStatementNode node) {
        return null;
    }

    @Override
    public TypeNode visit(DoWhileStatementNode node) {
        return null;
    }

    @Override
    public TypeNode visit(ForStatementNode node) {
        return null;
    }

    @Override
    public TypeNode visit(PrintStatementNode node) {
        return null;
    }

    @Override
    public TypeNode visit(ReadStatementNode node) {
        return null;
    }

    @Override
    public TypeNode visit(ReturnStatementNode node) {
        return null;
    }

    @Override
    public TypeNode visit(BreakStatementNode node) {
        return null;
    }

    @Override
    public TypeNode visit(ContinueStatementNode node) {
        return null;
    }

    @Override
    public TypeNode visit(FunctionDeclarationNode node) {
        return null;
    }

    @Override
    public TypeNode visit(ProcedureDeclarationNode node) {
        return null;
    }

    @Override
    public TypeNode visit(ParameterNode node) {
        return null;
    }

    @Override
    public TypeNode visit(IncrementStatementNode node) {
        return null;
    }

    @Override
    public TypeNode visit(DecrementStatementNode node) {
        return null;
    }

    @Override
    public TypeNode visit(StructPropertyNode node) {
        return null;
    }

    @Override
    public TypeNode visit(TypeNode node) {
        return null;
    }

    // THis method is the helper to assing any value to a variable or a nested variable (setter)
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
}
