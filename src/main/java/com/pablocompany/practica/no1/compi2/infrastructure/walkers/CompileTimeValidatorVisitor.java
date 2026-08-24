package com.pablocompany.practica.no1.compi2.infrastructure.walkers;

import com.pablocompany.practica.no1.compi2.domain.highlight.ErrorType;
import com.pablocompany.practica.no1.compi2.domain.semantic.AstNode;
import com.pablocompany.practica.no1.compi2.domain.semantic.ProgramNode;
import com.pablocompany.practica.no1.compi2.domain.semantic.childs.expressions.access.MemberArrayAccessExpressionNode;
import com.pablocompany.practica.no1.compi2.domain.semantic.childs.expressions.access.PropertyAccessExpressionNode;
import com.pablocompany.practica.no1.compi2.domain.semantic.childs.expressions.arrays.ArrayDeclarationNode;
import com.pablocompany.practica.no1.compi2.domain.semantic.childs.expressions.arrays.ArrayInitExpressionNode;
import com.pablocompany.practica.no1.compi2.domain.semantic.childs.expressions.assignation.*;
import com.pablocompany.practica.no1.compi2.domain.semantic.childs.expressions.operators.enums.BinaryOperator;
import com.pablocompany.practica.no1.compi2.domain.semantic.childs.expressions.operators.enums.UnaryOperator;
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

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//Principal class to do the validation out of bounds of array and arithmetic expressions
public class CompileTimeValidatorVisitor implements AstVisitor<Void> {

    private final Environment globalScope;
    private Environment currentScope;
    private final List<Environment> scopeStack;
    private final Map<String, Environment> scopeRegistry;
    private final List<CompilerError> errors;
    private final Map<Symbol, Integer> arraySizesRegistry;

    private final Map<Symbol, Double> constantValues;

    public CompileTimeValidatorVisitor(Environment globalScope, Map<String, Environment> scopeRegistry, List<CompilerError> errors) {
        this.globalScope = globalScope;
        this.scopeRegistry = scopeRegistry;
        this.currentScope = globalScope;
        this.errors = errors;
        this.scopeStack = new ArrayList<>();
        this.scopeStack.add(globalScope);
        this.arraySizesRegistry = new HashMap<>();
        this.constantValues = new HashMap<>();
    }

    // ======= SCOPE MANAGEMENT =======
    private void enterScope(String name) {
        Environment existingScope = scopeRegistry.get(name);
        if (existingScope != null) {
            currentScope = existingScope;
            scopeStack.add(existingScope);
        }
    }

    private void exitScope() {
        scopeStack.remove(scopeStack.size() - 1);
        currentScope = scopeStack.get(scopeStack.size() - 1);
    }

    private Symbol resolveSymbol(String id) {
        for (int i = scopeStack.size() - 1; i >= 0; i--) {
            Symbol symbol = scopeStack.get(i).get(id);
            if (symbol != null) return symbol;
        }
        return globalScope.get(id);
    }

    private void addError(String lexeme, int line, int column, String message) {
        errors.add(new CompilerError(lexeme, line, column, ErrorType.SEMANTIC, message));
    }

    //Principal method to evaluate expression constants
    private Double evaluateConstantExpression(ExpressionNode node) {
        if (node == null) return null;

        if (node instanceof LiteralExpressionNode lit) {
            if (lit.getDataValue() instanceof Number number) {
                return number.doubleValue();
            } else if (lit.getValueType() == DataType.CHAR) {
                String val = lit.getValue().replace("'", "");
                if (!val.isEmpty()) {
                    return (double) val.charAt(0);
                }
            } else if (lit.getValueType() == DataType.BOOLEAN) {
                String val = lit.getValue().toLowerCase();
                if (val.equals("verum") || val.equals("true")) return 1.0;
                return 0.0;
            }
            return null;
        } else if (node instanceof IdentifierExpressionNode idNode) {
            Symbol symbol = resolveSymbol(idNode.getIdentifier());
            if (symbol != null && constantValues.containsKey(symbol)) {
                return constantValues.get(symbol);
            }
            return null;
        } else if (node instanceof BinaryExpressionNode bin) {
            Double left = evaluateConstantExpression(bin.getLeft());
            Double right = evaluateConstantExpression(bin.getRight());

            if (left != null && right != null) {
                BinaryOperator op = bin.getOperator();

                if (op == BinaryOperator.PLUS) return left + right;
                if (op == BinaryOperator.MINUS) return left - right;
                if (op == BinaryOperator.MULTIPLICATION) return left * right;
                if (op == BinaryOperator.DIVIDE) {
                    if (right == 0.0) {
                        return null;
                    }
                    return left / right;
                }

                if (op == BinaryOperator.GREATER) return left > right ? 1.0 : 0.0;
                if (op == BinaryOperator.GREATER_EQUALS) return left >= right ? 1.0 : 0.0;
                if (op == BinaryOperator.LESS) return left < right ? 1.0 : 0.0;
                if (op == BinaryOperator.LESS_EQUALS) return left <= right ? 1.0 : 0.0;
                if (op == BinaryOperator.EQUALS) return left.equals(right) ? 1.0 : 0.0;
                if (op == BinaryOperator.DIFFERENT) return !left.equals(right) ? 1.0 : 0.0;

                if (op == BinaryOperator.AND) {
                    boolean bLeft = left != 0.0;
                    boolean bRight = right != 0.0;
                    return (bLeft && bRight) ? 1.0 : 0.0;
                }
                if (op == BinaryOperator.OR) {
                    boolean bLeft = left != 0.0;
                    boolean bRight = right != 0.0;
                    return (bLeft || bRight) ? 1.0 : 0.0;
                }
            }
            return null;
        } else if (node instanceof UnaryExpressionNode unary) {
            Double operand = evaluateConstantExpression(unary.getExpressionNode());
            if (operand != null) {
                if (unary.getOperator() == UnaryOperator.NEGATE) {
                    return -operand;
                }
                if (unary.getOperator() == UnaryOperator.NOT) {
                    return (operand == 0.0) ? 1.0 : 0.0;
                }
            }
            return null;
        } else if (node instanceof FunctionCallExpressionNode funcCall) {
            return null;
        }

        return null;
    }

    //This method register a new constant
    private void registerConstantValue(Symbol symbol, Double value) {
        if (symbol != null && value != null) {
            constantValues.put(symbol, value);
        }
    }

    //This method clear the constants in the scope
    private void clearConstantsInScope() {
        new ArrayList<>(constantValues.keySet()).stream()
                .filter(sym -> {
                    for (int i = scopeStack.size() - 1; i >= 0; i--) {
                        if (scopeStack.get(i).get(sym.getId()) == sym) {
                            return true;
                        }
                    }
                    return false;
                })
                .forEach(constantValues::remove);
    }

    // ======= VALIDACIONES PRINCIPALES =======

    @Override
    public Void visit(BinaryExpressionNode node) {
        if (node.getLeft() != null) node.getLeft().accept(this);
        if (node.getRight() != null) node.getRight().accept(this);

        if (node.getOperator() == BinaryOperator.DIVIDE) {
            Double rightValue = evaluateConstantExpression(node.getRight());
            if (rightValue != null && rightValue == 0.0) {
                addError("Operacion fallida", node.getLine(), node.getColumn(),
                        "Division por cero detectada.");
            }
        }
        return null;
    }

    //Principal variable declaration resolver
    @Override
    public Void visit(VariableDeclarationNode node) {

        if (node.getInitializer() != null) {
            node.getInitializer().accept(this);

            Double constValue = evaluateConstantExpression(node.getInitializer());
            if (constValue != null) {
                Symbol symbol = resolveSymbol(node.getIdentifier());
                if (symbol != null) {
                    registerConstantValue(symbol, constValue);
                }
            }
        }
        return null;
    }

    //Principal assignment expression node resolver
    @Override
    public Void visit(VariableAssignmentNode node) {
        if (node.getExpressionNode() != null) {
            node.getExpressionNode().accept(this);
        }

        if (node.getIdentifier() instanceof ArrayCallExpressionNode arrayCall) {
            validateArrayAccess(arrayCall.getArrayName(), arrayCall.getIndexExpression(),
                    arrayCall.getLine(), arrayCall.getColumn(), "asignacion");
        }

        if (node.getIdentifier() instanceof MemberArrayAccessExpressionNode memberAccess) {

            if (memberAccess.getTarget() instanceof IdentifierExpressionNode idNode) {
                validateArrayAccess(idNode.getIdentifier(), memberAccess.getIndex(),
                        memberAccess.getLine(), memberAccess.getColumn(), "asignacion");
            } else {
                Integer arraySize = getArraySizeFromTarget(memberAccess.getTarget());
                if (arraySize != null) {
                    Double indexVal = evaluateConstantExpression(memberAccess.getIndex());
                    if (indexVal != null) {
                        int index = indexVal.intValue();
                        if (index < 0) {
                            addError("Acceso a arreglo", memberAccess.getLine(), memberAccess.getColumn(),
                                    "Indice negativo no permitido en asignacion: " + index);
                        } else if (index >= arraySize) {
                            addError("Acceso a arreglo", memberAccess.getLine(), memberAccess.getColumn(),
                                    "Fuera de limites del arreglo. Capacidad " +
                                            arraySize + ", indice accedido: " + index);
                        }
                    }
                }
            }
        }

        if (node.getIdentifier() instanceof IdentifierExpressionNode idNode) {
            Symbol symbol = resolveSymbol(idNode.getIdentifier());
            if (symbol != null && constantValues.containsKey(symbol)) {
                Double newValue = evaluateConstantExpression(node.getExpressionNode());
                if (newValue != null) {
                    registerConstantValue(symbol, newValue);
                } else {
                    constantValues.remove(symbol);
                }
            }
        }

        return null;
    }

    //Auxiliary method unified
    private void validateArrayAccess(String arrayName, ExpressionNode indexExpr,
                                     int line, int column, String context) {
        if (indexExpr == null) return;

        Double indexVal = evaluateConstantExpression(indexExpr);
        if (indexVal == null) return;

        int index = indexVal.intValue();

        if (index < 0) {
            addError(arrayName, line, column,
                    "Indice negativo no permitido en " + context + ": " + index);
            return;
        }

        Symbol arraySymbol = resolveSymbol(arrayName);
        if (arraySymbol != null && arraySymbol.isArray()) {
            Integer arraySize = arraySymbol.getArraySize();
            if (arraySize != null && index >= arraySize) {
                addError(arrayName, line, column,
                        "Fuera de limites del arreglo '" +
                                arrayName + "'. Capacidad " + arraySize +
                                ". Indice accedido: '" + index + "'");
            }
        }
    }

    //Simple identifier resolver target method
    private Integer getArraySizeFromTarget(ExpressionNode target) {
        if (target instanceof IdentifierExpressionNode idNode) {
            Symbol symbol = resolveSymbol(idNode.getIdentifier());
            if (symbol != null && symbol.isArray()) {
                return symbol.getArraySize();
            }
        } else if (target instanceof PropertyAccessExpressionNode propNode) {

            return null;
        } else if (target instanceof MemberArrayAccessExpressionNode nestedArray) {
            return getArraySizeFromTarget(nestedArray.getTarget());
        }
        return null;
    }



    //Principal array declaration resolver validation
    @Override
    public Void visit(ArrayDeclarationNode node) {
        Integer declaredSize = null;

        if (node.getSize() != null) {
            node.getSize().accept(this);
            Double resolvedSize = evaluateConstantExpression(node.getSize());

            if (resolvedSize != null) {
                Symbol arraySymbol = resolveSymbol(node.getIdentifier());
                if (arraySymbol != null) {
                    declaredSize = resolvedSize.intValue();
                    arraySizesRegistry.put(arraySymbol, declaredSize);
                }
            }
        }

        if (node.getInitializer() != null) {
            node.getInitializer().accept(this);

            int initSize = node.getInitializer().getElements().size();

            if (declaredSize != null) {
                if (initSize > declaredSize) {
                    addError(node.getIdentifier(), node.getLine(), node.getColumn(),
                            "El arreglo '" + node.getIdentifier() +
                                    "' tiene capacidad " + declaredSize +
                                    " pero se inicializo con " + initSize + " elementos.");
                } else if (initSize < declaredSize) {
                addError(node.getIdentifier(), node.getLine(), node.getColumn(),
                        "El arreglo '" + node.getIdentifier() +
                        "' tiene capacidad " + declaredSize +
                        " pero solo se inicializan " + initSize + " elementos.");

                }
            }

            for (ExpressionNode element : node.getInitializer().getElements()) {
                if (element instanceof ArrayInitExpressionNode nestedArray) {
                    validateNestedArrayInitializer(nestedArray, node.getIdentifier());
                }
            }
        }

        return null;
    }

    // Helper method to validate hte nested array
    private void validateNestedArrayInitializer(ArrayInitExpressionNode node, String arrayName) {
        for (ExpressionNode element : node.getElements()) {
            if (element instanceof ArrayInitExpressionNode nested) {
                validateNestedArrayInitializer(nested, arrayName);
            }
        }
    }

    @Override
    public Void visit(ArrayCallExpressionNode node) {
        if (node.isDeclaration()) return null;

        if (node.getIndexExpression() != null) {
            node.getIndexExpression().accept(this);

            Double indexVal = evaluateConstantExpression(node.getIndexExpression());

            if (indexVal != null) {
                int index = indexVal.intValue();

                if (index < 0) {
                    addError(node.getArrayName(), node.getLine(), node.getColumn(),
                            "Indice negativo no permitido: " + index);
                } else {
                    Symbol arraySymbol = resolveSymbol(node.getArrayName());

                    if (arraySymbol != null && arraySizesRegistry.containsKey(arraySymbol)) {
                        int size = arraySizesRegistry.get(arraySymbol);
                        if (index >= size) {
                            addError(node.getArrayName(), node.getLine(), node.getColumn(),
                                    "Fuera de limites del arreglo '" + node.getArrayName() +
                                            "'. Capacidad " + size + ". Indice accedido " + index);
                        }
                    }
                }
            }
        }
        return null;
    }

    // ======= AST PROPAGATION =======
    @Override
    public Void visit(ProgramNode node) {
        for (BodyNode body : node.getBodies()) {
            body.accept(this);
        }
        return null;
    }

    @Override
    public Void visit(BodyNode node) {
        if (node.getVariablesSection() != null) node.getVariablesSection().accept(this);
        if (node.getMuneraSection() != null) node.getMuneraSection().accept(this);
        if (node.getMaiorSection() != null) node.getMaiorSection().accept(this);
        return null;
    }

    @Override
    public Void visit(VariablesSectionNode node) {
        for (AstNode decl : node.getDeclarations()) decl.accept(this);
        return null;
    }

    @Override
    public Void visit(MuneraSectionNode node) {
        for (AstNode func : node.getFunctions()) func.accept(this);
        return null;
    }

    @Override
    public Void visit(MaiorSectionNode node) {
        for (AstNode stmt : node.getStatements()) stmt.accept(this);
        return null;
    }

    @Override
    public Void visit(FunctionDeclarationNode node) {
        enterScope("function_" + node.getName());
        for (AstNode localVar : node.getLocalVariables()) localVar.accept(this);
        for (AstNode stmt : node.getBody()) stmt.accept(this);
        clearConstantsInScope();
        exitScope();
        return null;
    }

    @Override
    public Void visit(ProcedureDeclarationNode node) {
        enterScope("procedure_" + node.getName());
        for (AstNode localVar : node.getLocalVariables()) localVar.accept(this);
        for (AstNode stmt : node.getBody()) stmt.accept(this);
        clearConstantsInScope();
        exitScope();
        return null;
    }

    @Override
    public Void visit(ForStatementNode node) {
        enterScope("for_" + node.getLine() + node.getColumn());
        if (node.getInit() != null) node.getInit().accept(this);
        if (node.getCondition() != null) node.getCondition().accept(this);
        if (node.getBody() != null) {
            for (AstNode stmt : node.getBody()) stmt.accept(this);
        }
        if (node.getUpdate() != null) node.getUpdate().accept(this);
        clearConstantsInScope();
        exitScope();
        return null;
    }

    @Override
    public Void visit(WhileStatementNode node) {
        if (node.getCondition() != null) node.getCondition().accept(this);
        for (AstNode stmt : node.getBody()) stmt.accept(this);
        return null;
    }

    @Override
    public Void visit(DoWhileStatementNode node) {
        for (AstNode stmt : node.getBody()) stmt.accept(this);
        if (node.getCondion() != null) node.getCondion().accept(this);
        return null;
    }

    @Override
    public Void visit(IfStatementNode node) {
        if (node.getCondition() != null) node.getCondition().accept(this);
        for (AstNode stmt : node.getThenBody()) stmt.accept(this);
        for (ElseIfNode elseIf : node.getElseIfs()) elseIf.accept(this);
        if (node.getElseBlockNode() != null) node.getElseBlockNode().accept(this);
        return null;
    }

    @Override
    public Void visit(ElseIfNode node) {
        if (node.getCondition() != null) node.getCondition().accept(this);
        for (AstNode stmt : node.getBody()) stmt.accept(this);
        return null;
    }

    @Override
    public Void visit(ElseBlockNode node) {
        for (AstNode stmt : node.getBody()) stmt.accept(this);
        return null;
    }

    @Override
    public Void visit(PrintStatementNode node) {
        if (node.getExpressionList() != null) {
            for (ExpressionNode expr : node.getExpressionList()) expr.accept(this);
        }
        return null;
    }

    @Override
    public Void visit(ReturnStatementNode node) {
        if (node.getValue() != null) node.getValue().accept(this);
        return null;
    }

    @Override
    public Void visit(UnaryExpressionNode node) {
        if (node.getExpressionNode() != null) node.getExpressionNode().accept(this);
        return null;
    }

    @Override
    public Void visit(FunctionCallExpressionNode node) {
        if (node.getArguments() != null) {
            for (ExpressionNode arg : node.getArguments()) arg.accept(this);
        }
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
    public Void visit(ArrayInitExpressionNode node) {
        if (node.getElements() != null) {
            for (ExpressionNode element : node.getElements()) {
                if (element != null) {
                    element.accept(this);

                }
            }
        }
        return null;
    }

    @Override
    public Void visit(MemberArrayAccessExpressionNode node) {
        if (node.getTarget() != null) {
            node.getTarget().accept(this);
        }

        if (node.getIndex() != null) {
            node.getIndex().accept(this);

            Double indexVal = evaluateConstantExpression(node.getIndex());

            if (indexVal != null) {
                int index = indexVal.intValue();

                if (index < 0) {
                    addError("Acceso a arreglo", node.getLine(), node.getColumn(),
                            "Indice negativo no permitido: " + index);
                    return null;
                }

                Integer arraySize = getArraySizeFromTarget(node.getTarget());

                if (arraySize != null && index >= arraySize) {
                    addError("Acceso a arreglo", node.getLine(), node.getColumn(),
                            "Indice fuera de limites. El arreglo tiene capacidad " +
                                    arraySize + ", pero se intenta acceder al indice " + index);
                }
            }
        }

        return null;
    }


    @Override
    public Void visit(StructInstanceNode node) {
        node.getLiteral().accept(this);
        return null;
    }

    @Override
    public Void visit(StructLiteralExpressionNode node) {

        for (StructPropertyNode property : node.getProperties()) {
            property.accept(this);
        }
        return null;
    }

    @Override
    public Void visit(StructPropertyNode node) {
        node.getValue().accept(this);
        return null;
    }

    @Override
    public Void visit(StructDeclarationNode node) {
        return null;
    }

    @Override
    public Void visit(StructAttributeNode node) {
        return null;
    }


    @Override
    public Void visit(PropertyAccessExpressionNode node) {
        return null;
    }

    @Override
    public Void visit(TypeNode node) {
        return null;
    }

    @Override
    public Void visit(ParameterNode node) {
        return null;
    }

    @Override
    public Void visit(ReadStatementNode node) {
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
    public Void visit(IncrementPrevStatementNode node) {
        return null;
    }

    @Override
    public Void visit(DecrementPrevStatementNode node) {
        return null;
    }
}