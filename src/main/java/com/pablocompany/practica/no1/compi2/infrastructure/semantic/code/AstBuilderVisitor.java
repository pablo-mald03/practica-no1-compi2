package com.pablocompany.practica.no1.compi2.infrastructure.semantic.code;

import com.pablocompany.practica.no1.compi2.compiler.logic.CodexLatinusParser;
import com.pablocompany.practica.no1.compi2.compiler.logic.CodexLatinusParserBaseVisitor;
import com.pablocompany.practica.no1.compi2.domain.semantic.AstNode;
import com.pablocompany.practica.no1.compi2.domain.semantic.ProgramNode;
import com.pablocompany.practica.no1.compi2.domain.semantic.childs.expressions.access.MemberArrayAccessExpressionNode;
import com.pablocompany.practica.no1.compi2.domain.semantic.childs.expressions.access.PropertyAccessExpressionNode;
import com.pablocompany.practica.no1.compi2.domain.semantic.childs.expressions.arrays.ArrayDeclarationNode;
import com.pablocompany.practica.no1.compi2.domain.semantic.childs.expressions.arrays.ArrayInitExpressionNode;
import com.pablocompany.practica.no1.compi2.domain.semantic.childs.expressions.assignation.DecrementStatementNode;
import com.pablocompany.practica.no1.compi2.domain.semantic.childs.expressions.assignation.IncrementStatementNode;
import com.pablocompany.practica.no1.compi2.domain.semantic.childs.expressions.assignation.UnaryExpressionNode;
import com.pablocompany.practica.no1.compi2.domain.semantic.childs.expressions.assignation.VariableAssignmentNode;
import com.pablocompany.practica.no1.compi2.domain.semantic.childs.expressions.assignation.enums.AbreviationOperator;
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
import com.pablocompany.practica.no1.compi2.infrastructure.semantic.services.ExpressionHelperService;
import org.antlr.v4.runtime.tree.ParseTree;

import java.util.ArrayList;
import java.util.List;


//This is the principal class that builds the AST representation
public class AstBuilderVisitor extends CodexLatinusParserBaseVisitor<AstNode> {

    private final ExpressionHelperService expressionHelperService;

    public AstBuilderVisitor() {
        this.expressionHelperService = new ExpressionHelperService();
    }


    //----******----- THE PRINCIPAL PRODUCTION RULES ----******-----
    @Override
    public AstNode visitProgramRoot(CodexLatinusParser.ProgramRootContext ctx) {
        int line = ctx.getStart().getLine();
        int column = ctx.getStart().getCharPositionInLine();

        List<BodyNode> bodies = new ArrayList<>();
        for (CodexLatinusParser.BodyContext bodyCtx : ctx.body()) {
            bodies.add((BodyNode) visit(bodyCtx));
        }

        return new ProgramNode(line, column, bodies);
    }

    @Override
    public AstNode visitBody(CodexLatinusParser.BodyContext ctx) {
        int line = ctx.getStart().getLine();
        int column = ctx.getStart().getCharPositionInLine();

        AstNode variables = (ctx.variable_section() != null) ? visit(ctx.variable_section()) : null;
        AstNode munera = (ctx.munera_section() != null) ? visit(ctx.munera_section()) : null;
        AstNode maior = visit(ctx.maior_section());

        return new BodyNode(line, column, variables, munera, maior);
    }

    //----******----- THE PRINCIPAL SECTION RULES ----******-----

    @Override
    public AstNode visitVariablesSection(CodexLatinusParser.VariablesSectionContext ctx) {
        int line = ctx.getStart().getLine();
        int column = ctx.getStart().getCharPositionInLine();

        List<AstNode> declarations = new ArrayList<>();
        CodexLatinusParser.Variabiles_bodyContext current = ctx.variabiles_body();

        while (current instanceof CodexLatinusParser.DeclarationsVariablesListContext) {
            CodexLatinusParser.DeclarationsVariablesListContext listCtx = (CodexLatinusParser.DeclarationsVariablesListContext) current;

            declarations.add(0, visit(listCtx.declarations()));

            current = listCtx.variabiles_body();
        }

        if (current instanceof CodexLatinusParser.DeclarationsSingleVariableContext) {
            CodexLatinusParser.DeclarationsSingleVariableContext singleCtx = (CodexLatinusParser.DeclarationsSingleVariableContext) current;
            declarations.add(0, visit(singleCtx.declarations()));
        }

        return new VariablesSectionNode(line, column, declarations);
    }

    @Override
    public AstNode visitMuneraSection(CodexLatinusParser.MuneraSectionContext ctx) {
        int line = ctx.getStart().getLine();
        int column = ctx.getStart().getCharPositionInLine();

        List<AstNode> functions = new ArrayList<>();
        CodexLatinusParser.Munera_bodyContext current = ctx.munera_body();

        while (current instanceof CodexLatinusParser.FunctionsBlockListContext) {
            CodexLatinusParser.FunctionsBlockListContext listCtx = (CodexLatinusParser.FunctionsBlockListContext) current;
            functions.add(0, visit(listCtx.functions_block()));
            current = listCtx.munera_body();
        }

        if (current instanceof CodexLatinusParser.FunctionsSingleBlockContext) {
            CodexLatinusParser.FunctionsSingleBlockContext singleCtx = (CodexLatinusParser.FunctionsSingleBlockContext) current;
            functions.add(0, visit(singleCtx.functions_block()));
        }

        return new MuneraSectionNode(line, column, functions);
    }

    @Override
    public AstNode visitMaiorSection(CodexLatinusParser.MaiorSectionContext ctx) {
        int line = ctx.getStart().getLine();
        int column = ctx.getStart().getCharPositionInLine();

        List<AstNode> statements = parseCodeBody(ctx.code_body());

        return new MaiorSectionNode(line, column, statements);
    }



    //----******----- CALLEABLE STATEMENTS SECTION  ----******-----

    @Override
    public AstNode visitFunctionSingleCall(CodexLatinusParser.FunctionSingleCallContext ctx) {
        return visit(ctx.function_call());
    }

    @Override
    public AstNode visitFunctionReturNormalType(CodexLatinusParser.FunctionReturNormalTypeContext ctx) {
        return visit(ctx.variable_type());
    }


    @Override
    public AstNode visitProcDeclBlock(CodexLatinusParser.ProcDeclBlockContext ctx) {
        return visit(ctx.procedure_declaration());
    }

    @Override
    public AstNode visitFuncDeclBlock(CodexLatinusParser.FuncDeclBlockContext ctx) {
        return visit(ctx.function_declaration());
    }


    //----******----- STATEMENT SECTION  ----******-----

    //----******----- CONDITIONAL SECTION  ----******-----

    @Override
    public AstNode visitElseEmpty(CodexLatinusParser.ElseEmptyContext ctx) {
        int line = ctx.getStart().getLine();
        int column = ctx.getStart().getCharPositionInLine();
        return new ElseBlockNode(line, column, new ArrayList<>());
    }

    @Override
    public AstNode visitIfStatement(CodexLatinusParser.IfStatementContext ctx) {
        int line = ctx.getStart().getLine();
        int column = ctx.getStart().getCharPositionInLine();

        ExpressionNode condition = (ExpressionNode) visit(ctx.expression());
        List<AstNode> thenBody = parseCodeBody(ctx.code_body());

        List<ElseIfNode> elseIfs = new ArrayList<>();
        if (ctx.else_if_list() != null) {
            CodexLatinusParser.Else_if_listContext current = ctx.else_if_list();
            while (current instanceof CodexLatinusParser.ElseIfListContext) {
                CodexLatinusParser.ElseIfListContext listCtx = (CodexLatinusParser.ElseIfListContext) current;
                elseIfs.add(0, (ElseIfNode) visit(listCtx.else_if_clause()));
                current = listCtx.else_if_list();
            }
            if (current instanceof CodexLatinusParser.ElseIfSingleContext) {
                elseIfs.add(0, (ElseIfNode) visit(((CodexLatinusParser.ElseIfSingleContext) current).else_if_clause()));
            }
        }

        ElseBlockNode elseBody = null;
        if (ctx.else_statement() instanceof CodexLatinusParser.ElseBlockContext) {
            CodexLatinusParser.ElseBlockContext elseCtx = (CodexLatinusParser.ElseBlockContext) ctx.else_statement();
            int elseLine = elseCtx.getStart().getLine();
            int elseColumn = elseCtx.getStart().getCharPositionInLine();
            List<AstNode> body = parseCodeBody(elseCtx.code_body());
            elseBody = new ElseBlockNode(elseLine, elseColumn, body);
        }

        return new IfStatementNode(line, column, condition, thenBody, elseIfs, elseBody);
    }

    @Override
    public AstNode visitElseIfClause(CodexLatinusParser.ElseIfClauseContext ctx) {
        int line = ctx.getStart().getLine();
        int column = ctx.getStart().getCharPositionInLine();

        ExpressionNode condition = (ExpressionNode) visit(ctx.expression());
        List<AstNode> body = parseCodeBody(ctx.code_body());

        return new ElseIfNode(line, column, body, condition);
    }

    //----******----- FUNCTION SECTION PRODUCTIONS  ----******-----

    @Override
    public AstNode visitFunctionDeclaration(CodexLatinusParser.FunctionDeclarationContext ctx) {
        int line = ctx.getStart().getLine();
        int column = ctx.getStart().getCharPositionInLine();

        String name = ctx.ID().getText();
        TypeNode returnType = (TypeNode) visit(ctx.variable_function_type());

        List<ParameterNode> parameters = new ArrayList<>();
        if (ctx.function_arguments() != null) {
            parameters = parseFunctionArguments(ctx.function_arguments());
        }

        CodexLatinusParser.FunctionBodyContext bodyCtx =
                (CodexLatinusParser.FunctionBodyContext) ctx.function_body();

        List<AstNode> localVars = new ArrayList<>();
        if (bodyCtx.local_variable_list() != null) {
            localVars = parseLocalVariableList(bodyCtx.local_variable_list());
        }

        List<AstNode> body = new ArrayList<>();
        if (bodyCtx.code_body() != null) {
            body = parseCodeBody(bodyCtx.code_body());
        }

        return new FunctionDeclarationNode(line, column,body, name, returnType, parameters, localVars);
    }

    @Override
    public AstNode visitProcedureDeclaration(CodexLatinusParser.ProcedureDeclarationContext ctx) {
        int line = ctx.getStart().getLine();
        int column = ctx.getStart().getCharPositionInLine();

        String name = ctx.ID().getText();

        List<ParameterNode> parameters = new ArrayList<>();
        if (ctx.function_arguments() != null) {
            parameters = parseFunctionArguments(ctx.function_arguments());
        }

        CodexLatinusParser.ProcedureBodyContext bodyCtx =
                (CodexLatinusParser.ProcedureBodyContext) ctx.procedure_body();

        List<AstNode> localVars = new ArrayList<>();
        if (bodyCtx.local_variable_list() != null) {
            localVars = parseLocalVariableList(bodyCtx.local_variable_list());
        }

        List<AstNode> body = new ArrayList<>();
        if (bodyCtx.code_body() != null) {
            body = parseCodeBody(bodyCtx.code_body());
        }

        return new ProcedureDeclarationNode(line, column,body, name, parameters, localVars);
    }


    //----******----- LOCAL SECTION DECLARATION  ----******-----

    //----******----- PARAMETERS  ----******-----

    @Override
    public AstNode visitArgumentArrayDeclarationn(CodexLatinusParser.ArgumentArrayDeclarationnContext ctx) {
        int line = ctx.getStart().getLine();
        int column = ctx.getStart().getCharPositionInLine();

        String name = ctx.ID().getText();
        TypeNode type = (TypeNode) visit(ctx.argument_series_type());

        return new ParameterNode(line, column,true, name, type);
    }

    @Override
    public AstNode visitArgumentVariableDeclaration(CodexLatinusParser.ArgumentVariableDeclarationContext ctx) {
        int line = ctx.getStart().getLine();
        int column = ctx.getStart().getCharPositionInLine();

        String name = ctx.ID().getText();
        TypeNode type = (TypeNode) visit(ctx.argument_variable_type());

        return new ParameterNode(line, column,false, name, type);
    }


    //----******----- LOCAL VARIABLES  ----******-----

    @Override
    public AstNode visitLocalVarDeclaration(CodexLatinusParser.LocalVarDeclarationContext ctx) {
        return visit(ctx.variable_declaration());
    }

    @Override
    public AstNode visitLocalArrayDeclaration(CodexLatinusParser.LocalArrayDeclarationContext ctx) {
        return visit(ctx.normal_array_declaration());
    }

    @Override
    public AstNode visitLocalStructInstance(CodexLatinusParser.LocalStructInstanceContext ctx) {
        return visit(ctx.struct_instance());
    }

    //----******----- LOOPS SECTION  ----******-----


    @Override
    public AstNode visitIncOperation(CodexLatinusParser.IncOperationContext ctx) {
        int line = ctx.getStart().getLine();
        int column = ctx.getStart().getCharPositionInLine();

        ExpressionNode target = (ExpressionNode) visit(ctx.nest_variable());

        return new IncrementStatementNode(line, column,AbreviationOperator.ABREV_PLUS, target);
    }

    @Override
    public AstNode visitDecOperation(CodexLatinusParser.DecOperationContext ctx) {
        int line = ctx.getStart().getLine();
        int column = ctx.getStart().getCharPositionInLine();

        ExpressionNode target = (ExpressionNode) visit(ctx.nest_variable());

        return new DecrementStatementNode(line, column,AbreviationOperator.ABREV_MINUS, target);
    }

    @Override
    public AstNode visitWhileStatement(CodexLatinusParser.WhileStatementContext ctx) {
        int line = ctx.getStart().getLine();
        int column = ctx.getStart().getCharPositionInLine();

        ExpressionNode condition = (ExpressionNode) visit(ctx.expression());
        List<AstNode> body = parseCodeBody(ctx.code_body());

        return new WhileStatementNode(line, column, body, condition);
    }

    @Override
    public AstNode visitDoWhileStatement(CodexLatinusParser.DoWhileStatementContext ctx) {
        int line = ctx.getStart().getLine();
        int column = ctx.getStart().getCharPositionInLine();

        List<AstNode> body = parseCodeBody(ctx.code_body());
        ExpressionNode condition = (ExpressionNode) visit(ctx.expression());

        return new DoWhileStatementNode(line, column, body, condition);
    }

    /*----THE FOR STATEMENT (THE MOST COMPLEX PRODUCTION)----*/

    @Override
    public AstNode visitForStatement(CodexLatinusParser.ForStatementContext ctx) {
        int line = ctx.getStart().getLine();
        int column = ctx.getStart().getCharPositionInLine();

        AstNode init = null;
        if (ctx.for_init() instanceof CodexLatinusParser.ForInitVarDeclContext) {
            init = (AstNode) visit(ctx.for_init());
        } else if (ctx.for_init() instanceof CodexLatinusParser.ForInitAssignContext) {
            init = (AstNode) visit(ctx.for_init());
        }

        ExpressionNode condition = (ExpressionNode) visit(ctx.expression());

        AstNode update = (AstNode) visit(ctx.for_update());

        List<AstNode> body = parseCodeBody(ctx.code_body());

        return new ForStatementNode(line, column, body, init, condition, update);
    }

    @Override
    public AstNode visitForInitVarDecl(CodexLatinusParser.ForInitVarDeclContext ctx) {

        int line = ctx.getStart().getLine();
        int column = ctx.getStart().getCharPositionInLine();

        String id = ctx.ID().getText();
        TypeNode type = (TypeNode) visit(ctx.variable_type());
        ExpressionNode initializer = (ExpressionNode) visit(ctx.expression());

        return new VariableDeclarationNode(line, column, type, id, initializer);
    }

    @Override
    public AstNode visitForInitAssign(CodexLatinusParser.ForInitAssignContext ctx) {
        int line = ctx.getStart().getLine();
        int column = ctx.getStart().getCharPositionInLine();

        String id = ctx.ID().getText();
        ExpressionNode value = (ExpressionNode) visit(ctx.expression());
        IdentifierExpressionNode target = new IdentifierExpressionNode(line, column, id);

        return new VariableAssignmentNode(line, column, value, target);
    }

    @Override
    public AstNode visitForUpdateIncrement(CodexLatinusParser.ForUpdateIncrementContext ctx) {
        int line = ctx.getStart().getLine();
        int column = ctx.getStart().getCharPositionInLine();

        String id = ctx.ID().getText();
        IdentifierExpressionNode target = new IdentifierExpressionNode(line, column, id);

        return new IncrementStatementNode(line, column, AbreviationOperator.ABREV_PLUS, target);
    }

    @Override
    public AstNode visitForUpdateDecrement(CodexLatinusParser.ForUpdateDecrementContext ctx) {
        int line = ctx.getStart().getLine();
        int column = ctx.getStart().getCharPositionInLine();

        String id = ctx.ID().getText();
        IdentifierExpressionNode target = new IdentifierExpressionNode(line, column, id);

        return new DecrementStatementNode(line, column, AbreviationOperator.ABREV_MINUS, target);
    }

    @Override
    public AstNode visitForUpdateAssign(CodexLatinusParser.ForUpdateAssignContext ctx) {
        int line = ctx.getStart().getLine();
        int column = ctx.getStart().getCharPositionInLine();

        String id = ctx.ID().getText();
        ExpressionNode value = (ExpressionNode) visit(ctx.expression());
        IdentifierExpressionNode target = new IdentifierExpressionNode(line, column, id);

        return new VariableAssignmentNode(line, column, value,target);
    }

    //----******----- IO FUNCTION PRODUCTIONS VARIABLES ----******-----

    @Override
    public AstNode visitPrintAction(CodexLatinusParser.PrintActionContext ctx) {
        List<ExpressionNode> expressions = new ArrayList<>();
        CodexLatinusParser.Print_functionContext printCtx = ctx.print_function();

        while (printCtx instanceof CodexLatinusParser.PrintMultipleExprContext) {
            CodexLatinusParser.PrintMultipleExprContext multiCtx = (CodexLatinusParser.PrintMultipleExprContext) printCtx;
            expressions.add(0, (ExpressionNode) visit(multiCtx.expression()));
            printCtx = multiCtx.print_function();
        }

        if (printCtx instanceof CodexLatinusParser.PrintSingleExprContext) {
            expressions.add(0, (ExpressionNode) visit(((CodexLatinusParser.PrintSingleExprContext) printCtx).expression()));
        }

        int line = ctx.getStart().getLine();
        int column = ctx.getStart().getCharPositionInLine();

        return new PrintStatementNode(line, column, expressions);
    }

    @Override
    public AstNode visitReadInput(CodexLatinusParser.ReadInputContext ctx) {
        int line = ctx.getStart().getLine();
        int column = ctx.getStart().getCharPositionInLine();

        return new ReadStatementNode(line, column, null);
    }

    @Override
    public AstNode visitReadVariableInput(CodexLatinusParser.ReadVariableInputContext ctx) {
        int line = ctx.getStart().getLine();
        int column = ctx.getStart().getCharPositionInLine();

        ExpressionNode target = (ExpressionNode) visit(ctx.nest_variable());

        return new ReadStatementNode(line, column, target);
    }

    //----******----- BREAKPOINTS PRODUCTIONS DATA ----******-----

    @Override
    public AstNode visitReturnWithValue(CodexLatinusParser.ReturnWithValueContext ctx) {
        int line = ctx.getStart().getLine();
        int column = ctx.getStart().getCharPositionInLine();

        ExpressionNode value = (ExpressionNode) visit(ctx.expression());

        return new ReturnStatementNode(line, column, value);
    }

    @Override
    public AstNode visitReturnVoid(CodexLatinusParser.ReturnVoidContext ctx) {
        int line = ctx.getStart().getLine();
        int column = ctx.getStart().getCharPositionInLine();

        return new ReturnStatementNode(line, column, null);
    }

    @Override
    public AstNode visitLoopBreak(CodexLatinusParser.LoopBreakContext ctx) {
        int line = ctx.getStart().getLine();
        int column = ctx.getStart().getCharPositionInLine();

        return new BreakStatementNode(line, column);
    }

    @Override
    public AstNode visitLoopContinue(CodexLatinusParser.LoopContinueContext ctx) {
        int line = ctx.getStart().getLine();
        int column = ctx.getStart().getCharPositionInLine();

        return new ContinueStatementNode(line, column);
    }

    //----******----- NESTED VALUES ----******-----

    @Override
    public AstNode visitNormalVariableRedefiniedUsage(CodexLatinusParser.NormalVariableRedefiniedUsageContext ctx) {
        int line = ctx.getStart().getLine();
        int column = ctx.getStart().getCharPositionInLine();

        String id = ctx.ID().getText();
        ExpressionNode value = (ExpressionNode) visit(ctx.expression());

        IdentifierExpressionNode idNode = new IdentifierExpressionNode(ctx.ID().getSymbol().getLine(),ctx.ID().getSymbol().getCharPositionInLine(), id );
        return new VariableAssignmentNode(line, column, value, idNode);
    }

    //----******----- NESTED VALUES ----******-----

    @Override
    public AstNode visitNestedValueVariable(CodexLatinusParser.NestedValueVariableContext ctx) {
        return visit(ctx.struct_values());
    }

    @Override
    public AstNode visitArrayCallVariable(CodexLatinusParser.ArrayCallVariableContext ctx) {
        return visit(ctx.array_call());
    }

    @Override
    public AstNode visitSigleValueVariable(CodexLatinusParser.SigleValueVariableContext ctx) {
        int line = ctx.getStart().getLine();
        int column = ctx.getStart().getCharPositionInLine();
        return new IdentifierExpressionNode(line, column, ctx.ID().getText());
    }


    //----******----- STRUCTS PROPERTIES ----******-----

    @Override
    public AstNode visitRedefiniedArrayUssage(CodexLatinusParser.RedefiniedArrayUssageContext ctx) {
        int line = ctx.getStart().getLine();
        int column = ctx.getStart().getCharPositionInLine();

        String arrayName = ctx.ID().getText();
        ExpressionNode index = (ExpressionNode) visit(ctx.expression(0));
        ExpressionNode value = (ExpressionNode) visit(ctx.expression(1));

        ArrayCallExpressionNode target = new ArrayCallExpressionNode(line, column, arrayName, index);

        return new VariableAssignmentNode(line, column, value, target);
    }

    @Override
    public AstNode visitStructBaseProperty(CodexLatinusParser.StructBasePropertyContext ctx) {
        int line = ctx.getStart().getLine();
        int column = ctx.getStart().getCharPositionInLine();

        IdentifierExpressionNode target = new IdentifierExpressionNode(line, column, ctx.ID(0).getText());
        return new PropertyAccessExpressionNode(line, column, target, ctx.ID(1).getText());
    }

    @Override
    public AstNode visitStructBaseArrayProperty(CodexLatinusParser.StructBaseArrayPropertyContext ctx) {
        int line = ctx.getStart().getLine();
        int column = ctx.getStart().getCharPositionInLine();

        ExpressionNode index = (ExpressionNode) visit(ctx.expression());
        ArrayCallExpressionNode targetArray = new ArrayCallExpressionNode(line, column, ctx.ID(0).getText(), index);

        return new PropertyAccessExpressionNode(line, column, targetArray, ctx.ID(1).getText());
    }

    @Override
    public AstNode visitStructArrayAccessChain(CodexLatinusParser.StructArrayAccessChainContext ctx) {
        int line = ctx.getStart().getLine();
        int column = ctx.getStart().getCharPositionInLine();

        ExpressionNode target = (ExpressionNode) visit(ctx.struct_values());
        ExpressionNode index = (ExpressionNode) visit(ctx.expression());

        return new MemberArrayAccessExpressionNode(line, column,index, target);
    }

    @Override
    public AstNode visitStructPropertyChain(CodexLatinusParser.StructPropertyChainContext ctx) {
        int line = ctx.getStart().getLine();
        int column = ctx.getStart().getCharPositionInLine();

        ExpressionNode target = (ExpressionNode) visit(ctx.struct_values());

        return new PropertyAccessExpressionNode(line, column, target, ctx.ID().getText());
    }


    //----******----- INSTANCE STRUCT PRODUCTIONS----******-----


    @Override
    public AstNode visitNestedStructRedefiniedValue(CodexLatinusParser.NestedStructRedefiniedValueContext ctx) {
        int line = ctx.getStart().getLine();
        int column = ctx.getStart().getCharPositionInLine();

        ExpressionNode target = (ExpressionNode) visit(ctx.struct_values());
        ExpressionNode value = (ExpressionNode) visit(ctx.expression());

        return new VariableAssignmentNode(line, column, value, target);
    }

    @Override
    public AstNode visitStructInstance(CodexLatinusParser.StructInstanceContext ctx) {
        int line = ctx.getStart().getLine();
        int column = ctx.getStart().getCharPositionInLine();

        String identifier = ctx.ID(0).getText();
        String structType = ctx.ID(1).getText();
        StructLiteralExpressionNode literal = (StructLiteralExpressionNode) visit(ctx.struct_literal());

        return new StructInstanceNode(line, column, identifier, structType, literal);
    }

    @Override
    public AstNode visitStructLiteralValue(CodexLatinusParser.StructLiteralValueContext ctx) {
        int line = ctx.getStart().getLine();
        int column = ctx.getStart().getCharPositionInLine();

        List<StructPropertyNode> properties = new ArrayList<>();

        CodexLatinusParser.Struct_data_listContext current = ctx.struct_data_list();

        while (current instanceof CodexLatinusParser.StructValueListContext) {
            CodexLatinusParser.StructValueListContext listCtx = (CodexLatinusParser.StructValueListContext) current;

            properties.add(0, (StructPropertyNode) visit(listCtx.struct_data_value()));

            current = listCtx.struct_data_list();
        }

        if (current instanceof CodexLatinusParser.StructSingleValueContext) {
            CodexLatinusParser.StructSingleValueContext singleCtx = (CodexLatinusParser.StructSingleValueContext) current;

            properties.add(0, (StructPropertyNode) visit(singleCtx.struct_data_value()));
        }

        return new StructLiteralExpressionNode(line, column, properties);
    }

    @Override
    public AstNode visitStructDataNormal(CodexLatinusParser.StructDataNormalContext ctx) {
        int line = ctx.getStart().getLine();
        int column = ctx.getStart().getCharPositionInLine();

        String propertyName = ctx.ID().getText();
        ExpressionNode value = (ExpressionNode) visit(ctx.expression());

        if(value instanceof  ArrayCallExpressionNode){
            ((ArrayCallExpressionNode) value).setDeclaration(true);
        }

        return new StructPropertyNode(line, column, propertyName, value);
    }


    //----******----- STRUCT PRODUCTIONS VALUES ----******-----

    @Override
    public AstNode visitStructDeclaration(CodexLatinusParser.StructDeclarationContext ctx) {
        int line = ctx.getStart().getLine();
        int column = ctx.getStart().getCharPositionInLine();
        String structName = ctx.ID().getText();

        boolean hasComma = false;

        List<StructAttributeNode> attributes = new ArrayList<>();
        CodexLatinusParser.Struct_bodyContext bodyCtx = ctx.struct_body();

        if (bodyCtx instanceof CodexLatinusParser.StructSeparatedBodyContext) {
            CodexLatinusParser.Struct_normal_bodyContext current = ((CodexLatinusParser.StructSeparatedBodyContext) bodyCtx).struct_normal_body();

            while (current instanceof CodexLatinusParser.StructNormalBodyListContext) {
                CodexLatinusParser.StructNormalBodyListContext listCtx = (CodexLatinusParser.StructNormalBodyListContext) current;
                attributes.add(0, (StructAttributeNode) visit(listCtx.struct_attribute()));
                current = listCtx.struct_normal_body();
            }

            if (current instanceof CodexLatinusParser.StructNormalBodySingleContext) {
                attributes.add(0, (StructAttributeNode) visit(((CodexLatinusParser.StructNormalBodySingleContext) current).struct_attribute()));
            }
        }
        else if (bodyCtx instanceof CodexLatinusParser.StructCommaBodyContext) {

            hasComma = true;
            CodexLatinusParser.Struct_comma_bodyContext current = ((CodexLatinusParser.StructCommaBodyContext) bodyCtx).struct_comma_body();

            while (current instanceof CodexLatinusParser.StructCommaBodyListContext) {
                CodexLatinusParser.StructCommaBodyListContext listCtx = (CodexLatinusParser.StructCommaBodyListContext) current;
                attributes.add(0, (StructAttributeNode) visit(listCtx.struct_attribute()));
                current = listCtx.struct_comma_body();
            }

            if (current instanceof CodexLatinusParser.StructCommaBodySingleContext) {
                attributes.add(0, (StructAttributeNode) visit(((CodexLatinusParser.StructCommaBodySingleContext) current).struct_attribute()));
            }
        }

        return new StructDeclarationNode(line, column, attributes, structName, hasComma);
    }

    //----******----- STRUCT VALUES DECLARATION ----******-----

    @Override
    public AstNode visitNormalVariableStruct(CodexLatinusParser.NormalVariableStructContext ctx) {
        return visit(ctx.variable_without_value());
    }

    @Override
    public AstNode visitArrayVariableStruct(CodexLatinusParser.ArrayVariableStructContext ctx) {
        return visit(ctx.array_variable_struct());
    }

    @Override
    public AstNode visitInternalStructNormalVariable(CodexLatinusParser.InternalStructNormalVariableContext ctx) {
        int line = ctx.getStart().getLine();
        int column = ctx.getStart().getCharPositionInLine();
        String id = ctx.ID().getText();
        TypeNode type = (TypeNode) visit(ctx.variable_type());

        return new StructAttributeNode(line, column, id, type, false);
    }

    @Override
    public AstNode visitInternalStructArray(CodexLatinusParser.InternalStructArrayContext ctx) {
        int line = ctx.getStart().getLine();
        int column = ctx.getStart().getCharPositionInLine();

        String id = ctx.ID().getText();
        TypeNode type = (TypeNode) visit(ctx.variable_type());

        return new StructAttributeNode(line, column, id, type, true);
    }


    //----******----- VARIABLES AND ARRAY DECLARATIONS ----******-----


    @Override
    public AstNode visitVariableDeclaration(CodexLatinusParser.VariableDeclarationContext ctx) {
        int line = ctx.getStart().getLine();
        int column = ctx.getStart().getCharPositionInLine();

        String identifier = ctx.ID().getText();

        TypeNode dataType = (TypeNode) visit(ctx.variable_type());

        ExpressionNode initializer = (ExpressionNode) visit(ctx.expression());

        return new VariableDeclarationNode(line, column,dataType, identifier , initializer);
    }

    @Override
    public AstNode visitNormalArrayDeclaration(CodexLatinusParser.NormalArrayDeclarationContext ctx) {
        int line = ctx.getStart().getLine();
        int column = ctx.getStart().getCharPositionInLine();

        String identifier = ctx.ID().getText();

        ExpressionNode size = (ExpressionNode) visit(ctx.expression());

        TypeNode dataType = (TypeNode) visit(ctx.variable_type());

        ArrayInitExpressionNode initializer = null;
        if (ctx.array_initialization() != null) {
            initializer = (ArrayInitExpressionNode) visit(ctx.array_initialization());
        }

        return new ArrayDeclarationNode(line, column, dataType,identifier, size, initializer);
    }

    /*---****------****--- ARRAY PROPERTIES INITIALIZATION VALUES---****------****---*/

    @Override
    public AstNode visitArrayNormalValue(CodexLatinusParser.ArrayNormalValueContext ctx) {
        return visit(ctx.expression());
    }

    @Override
    public AstNode visitArrayInitWithValues(CodexLatinusParser.ArrayInitWithValuesContext ctx) {
        int line = ctx.getStart().getLine();
        int column = ctx.getStart().getCharPositionInLine();

        List<ExpressionNode> elements = new ArrayList<>();
        CodexLatinusParser.Values_array_listContext current = ctx.values_array_list();

        while (current instanceof CodexLatinusParser.ArrayValueListContext) {
            CodexLatinusParser.ArrayValueListContext listCtx = (CodexLatinusParser.ArrayValueListContext) current;
            elements.add(0, (ExpressionNode) visit(listCtx.array_value()));
            current = listCtx.values_array_list();
        }

        if (current instanceof CodexLatinusParser.ArraySingleValueContext) {
            CodexLatinusParser.ArraySingleValueContext singleCtx = (CodexLatinusParser.ArraySingleValueContext) current;
            elements.add(0, (ExpressionNode) visit(singleCtx.array_value()));
        }

        return new ArrayInitExpressionNode(line, column, elements);
    }

    //----******----- PRINCIPAL EXPRESSION VALUES SECTION ----******-----

    @Override
    public AstNode visitValArrayLiteral(CodexLatinusParser.ValArrayLiteralContext ctx) {
        return visit(ctx.array_initialization());
    }

    @Override
    public AstNode visitValBool(CodexLatinusParser.ValBoolContext ctx) {
        return visit(ctx.boolean_values());
    }

    @Override
    public AstNode visitValChar(CodexLatinusParser.ValCharContext ctx) {
        int line = ctx.getStart().getLine();
        int column = ctx.getStart().getCharPositionInLine();
        return new LiteralExpressionNode(line, column, ctx.CHAR().getText(), DataType.CHAR);
    }

    @Override
    public AstNode visitValDecimal(CodexLatinusParser.ValDecimalContext ctx) {
        int line = ctx.getStart().getLine();
        int column = ctx.getStart().getCharPositionInLine();
        return new LiteralExpressionNode(line, column, ctx.DECIMAL().getText(), DataType.DECIMAL);
    }

    //----******----- PRINCIPAL EXPRESSION THAT RETURNS AN ARRAY CALL ----******-----
    @Override
    public AstNode visitValStructNestValue(CodexLatinusParser.ValStructNestValueContext ctx) {
        return visit(ctx.struct_values());
    }

    @Override
    public AstNode visitValStructPropertyLiteral(CodexLatinusParser.ValStructPropertyLiteralContext ctx) {
       return visit(ctx.struct_literal());
    }


    //----******----- PRINCIPAL FUNCTION CALL PRODUCTIONS ----******-----

    @Override
    public AstNode visitValFunctionCall(CodexLatinusParser.ValFunctionCallContext ctx) {
        return visit(ctx.function_call());
    }

    @Override
    public AstNode visitFunctionCalling(CodexLatinusParser.FunctionCallingContext ctx) {
        int line = ctx.getStart().getLine();
        int column = ctx.getStart().getCharPositionInLine();
        String functionName = ctx.ID().getText();

        List<ExpressionNode> arguments = new ArrayList<>();
        CodexLatinusParser.Arguments_listContext current = ctx.arguments_list();

        while (current instanceof CodexLatinusParser.ArgumentFunctionListContext) {
            CodexLatinusParser.ArgumentFunctionListContext listCtx = (CodexLatinusParser.ArgumentFunctionListContext) current;
            arguments.add(0, (ExpressionNode) visit(listCtx.expression()));
            current = listCtx.arguments_list();
        }

        if (current instanceof CodexLatinusParser.ArgumentSingleFunctionContext) {
            CodexLatinusParser.ArgumentSingleFunctionContext singleCtx = (CodexLatinusParser.ArgumentSingleFunctionContext) current;
            arguments.add(0, (ExpressionNode) visit(singleCtx.expression()));
        }

        return new FunctionCallExpressionNode(line, column, functionName, arguments);
    }

    //----******----- PRINCIPAL ARRAY CALL PRODUCTIONS ----******-----

    @Override
    public AstNode visitValArrayCall(CodexLatinusParser.ValArrayCallContext ctx) {
        return visit(ctx.array_call());
    }

    @Override
    public AstNode visitArrayCall(CodexLatinusParser.ArrayCallContext ctx) {
        int line = ctx.getStart().getLine();
        int column = ctx.getStart().getCharPositionInLine();

        String arrayName = ctx.ID().getText();

        ExpressionNode indexExpression = (ExpressionNode) visit(ctx.expression());

        return new ArrayCallExpressionNode(line, column, arrayName, indexExpression);
    }

    @Override
    public AstNode visitValIdCall(CodexLatinusParser.ValIdCallContext ctx) {
        int line = ctx.getStart().getLine();
        int column = ctx.getStart().getCharPositionInLine();
        return new IdentifierExpressionNode(line, column, ctx.ID().getText());
    }

    @Override
    public AstNode visitValInt(CodexLatinusParser.ValIntContext ctx) {
        int line = ctx.getStart().getLine();
        int column = ctx.getStart().getCharPositionInLine();
        return new LiteralExpressionNode(line, column, ctx.INT().getText(), DataType.INT);
    }

    @Override
    public AstNode visitValString(CodexLatinusParser.ValStringContext ctx) {
        int line = ctx.getStart().getLine();
        int column = ctx.getStart().getCharPositionInLine();
        return new LiteralExpressionNode(line, column, ctx.STRING().getText(), DataType.STRING);
    }





    //----******----- PRINCIPAL TYPES SECTION ----******-----

    @Override
    public AstNode visitExpressionAddSub(CodexLatinusParser.ExpressionAddSubContext ctx) {
        ExpressionNode left = (ExpressionNode) visit(ctx.expression(0));
        ExpressionNode right = (ExpressionNode) visit(ctx.expression(1));
        String op = ctx.op.getText();

        return expressionHelperService.buildBinary(ctx, left, right, op);
    }

    @Override
    public AstNode visitExpressionMultDiv(CodexLatinusParser.ExpressionMultDivContext ctx) {
        ExpressionNode left = (ExpressionNode) visit(ctx.expression(0));
        ExpressionNode right = (ExpressionNode) visit(ctx.expression(1));
        String op = ctx.op.getText();

        return expressionHelperService.buildBinary(ctx, left, right, op);
    }

    @Override
    public AstNode visitExpressionOr(CodexLatinusParser.ExpressionOrContext ctx) {
        ExpressionNode left = (ExpressionNode) visit(ctx.expression(0));
        ExpressionNode right = (ExpressionNode) visit(ctx.expression(1));

        return expressionHelperService.buildBinary(ctx, left, right, "or");
    }

    @Override
    public AstNode visitExpressionAnd(CodexLatinusParser.ExpressionAndContext ctx) {
        ExpressionNode left = (ExpressionNode) visit(ctx.expression(0));
        ExpressionNode right = (ExpressionNode) visit(ctx.expression(1));

        return expressionHelperService.buildBinary(ctx, left, right, "and");
    }

    @Override
    public AstNode visitExpressionValue(CodexLatinusParser.ExpressionValueContext ctx) {
        return visit(ctx.normal_values());
    }

    @Override
    public AstNode visitExpressionRelational(CodexLatinusParser.ExpressionRelationalContext ctx) {
        ExpressionNode left = (ExpressionNode) visit(ctx.expression(0));
        ExpressionNode right = (ExpressionNode) visit(ctx.expression(1));
        String op = ctx.op.getText();

        return expressionHelperService.buildBinary(ctx, left, right, op);
    }

    @Override
    public AstNode visitExpressionEquality(CodexLatinusParser.ExpressionEqualityContext ctx) {
        ExpressionNode left = (ExpressionNode) visit(ctx.expression(0));
        ExpressionNode right = (ExpressionNode) visit(ctx.expression(1));
        String op = ctx.op.getText();

        return expressionHelperService.buildBinary(ctx, left, right, op);
    }

    @Override
    public AstNode visitExpressionUnary(CodexLatinusParser.ExpressionUnaryContext ctx) {
        int line = ctx.getStart().getLine();
        int column = ctx.getStart().getCharPositionInLine();
        ExpressionNode operand = (ExpressionNode) visit(ctx.expression());

        String opText = ctx.op.getText();
        UnaryOperator operator = expressionHelperService.mapToUnaryOperator(opText);

        return new UnaryExpressionNode(line, column, operand, operator);
    }

    @Override
    public AstNode visitExpressionParents(CodexLatinusParser.ExpressionParentsContext ctx) {
        return visit(ctx.expression());
    }

    //----******----- PRINCIPAL TYPES SECTION ----******-----
    @Override
    public TypeNode visitTypeText(CodexLatinusParser.TypeTextContext ctx) {
        return new TypeNode(ctx.getStart().getLine(), ctx.getStart().getCharPositionInLine(), DataType.STRING, ctx.TEXTUM().getText());
    }

    @Override
    public AstNode visitTypeInt(CodexLatinusParser.TypeIntContext ctx) {
        return new TypeNode(ctx.getStart().getLine(), ctx.getStart().getCharPositionInLine(), DataType.INT, ctx.NUMERUS().getText());
    }

    @Override
    public AstNode visitTypeDecimal(CodexLatinusParser.TypeDecimalContext ctx) {
        return new TypeNode(ctx.getStart().getLine(), ctx.getStart().getCharPositionInLine(), DataType.DECIMAL, ctx.DECIMALIS().getText());
    }

    @Override
    public AstNode visitTypeChar(CodexLatinusParser.TypeCharContext ctx) {
        return new TypeNode(ctx.getStart().getLine(), ctx.getStart().getCharPositionInLine(), DataType.CHAR, ctx.LITTERA().getText());
    }

    @Override
    public AstNode visitTypeBoolean(CodexLatinusParser.TypeBooleanContext ctx) {
        return new TypeNode(ctx.getStart().getLine(), ctx.getStart().getCharPositionInLine(), DataType.BOOLEAN, ctx.BOOLEAN().getText());
    }

    @Override
    public AstNode visitTypeCustomId(CodexLatinusParser.TypeCustomIdContext ctx) {
        return new TypeNode(ctx.getStart().getLine(), ctx.getStart().getCharPositionInLine(), DataType.CUSTOM, ctx.ID().getText());
    }

    //----******----- BOOLEAN VALUES TYPE ----******-----


    @Override
    public AstNode visitBoolFalse(CodexLatinusParser.BoolFalseContext ctx) {
        int line = ctx.getStart().getLine();
        int column = ctx.getStart().getCharPositionInLine();
        return new LiteralExpressionNode(line, column, "falsus", DataType.BOOLEAN);
    }

    @Override
    public AstNode visitBoolTrue(CodexLatinusParser.BoolTrueContext ctx) {
        int line = ctx.getStart().getLine();
        int column = ctx.getStart().getCharPositionInLine();
        return new LiteralExpressionNode(line, column, "verum", DataType.BOOLEAN);
    }


    //AUXILIAR METHODS
    private List<AstNode> parseCodeBody(CodexLatinusParser.Code_bodyContext codeBodyCtx) {
        List<AstNode> statements = new ArrayList<>();
        if (codeBodyCtx == null) {
            return statements;
        }

        CodexLatinusParser.Code_bodyContext current = codeBodyCtx;

        while (current instanceof CodexLatinusParser.BlockControlListContext) {
            CodexLatinusParser.BlockControlListContext listCtx = (CodexLatinusParser.BlockControlListContext) current;
            statements.add(0, visit(listCtx.control_block()));
            current = listCtx.code_body();
        }

        if (current instanceof CodexLatinusParser.BlockSingleControlContext) {
            CodexLatinusParser.BlockSingleControlContext singleCtx = (CodexLatinusParser.BlockSingleControlContext) current;
            statements.add(0, visit(singleCtx.control_block()));
        }

        return statements;
    }


    private <T> List<T> buildRecursiveList(ParseTree ctx,
                                           java.util.function.Function<ParseTree, Boolean> isListContext,
                                           java.util.function.Function<ParseTree, ParseTree> getNextContext,
                                           java.util.function.Function<ParseTree, ParseTree> getCurrentValue,
                                           java.util.function.Function<ParseTree, T> visitValue) {
        List<T> result = new ArrayList<>();
        ParseTree current = ctx;

        while (current != null && isListContext.apply(current)) {
            ParseTree value = getCurrentValue.apply(current);
            if (value != null) {
                result.add(0, visitValue.apply(value));
            }
            current = getNextContext.apply(current);
        }

        if (current != null) {
            result.add(0, visitValue.apply(current));
        }

        return result;
    }

    private List<ExpressionNode> parseArgumentsList(CodexLatinusParser.Arguments_listContext ctx) {
        if (ctx == null) return new ArrayList<>();

        return buildRecursiveList(ctx,
                c -> c instanceof CodexLatinusParser.ArgumentFunctionListContext,
                c -> ((CodexLatinusParser.ArgumentFunctionListContext) c).arguments_list(),
                c -> ((CodexLatinusParser.ArgumentFunctionListContext) c).expression(),
                expr -> (ExpressionNode) visit(expr)
        );
    }

    private List<ParameterNode> parseFunctionArguments(CodexLatinusParser.Function_argumentsContext ctx) {
        if (ctx == null) return new ArrayList<>();

        return buildRecursiveList(ctx,
                c -> c instanceof CodexLatinusParser.FunctionArgsListContext,
                c -> ((CodexLatinusParser.FunctionArgsListContext) c).function_arguments(),
                c -> ((CodexLatinusParser.FunctionArgsListContext) c).argument(),
                arg -> (ParameterNode) visit(arg)
        );
    }

    private List<AstNode> parseLocalVariableList(CodexLatinusParser.Local_variable_listContext ctx) {
        if (ctx == null) return new ArrayList<>();

        List<AstNode> result = new ArrayList<>();
        ParseTree current = ctx;

        while (current instanceof CodexLatinusParser.LocalVariablesListContext) {
            CodexLatinusParser.LocalVariablesListContext listCtx =
                    (CodexLatinusParser.LocalVariablesListContext) current;
            AstNode node = visit(listCtx.local_variable());

            if (node != null) {
                result.add(0, node);
            }

            current = listCtx.local_variable_list();
        }

        if (current instanceof CodexLatinusParser.LocalSingleVariableContext) {
            CodexLatinusParser.LocalSingleVariableContext singleCtx =
                    (CodexLatinusParser.LocalSingleVariableContext) current;
            AstNode node = visit(singleCtx.local_variable());
            if (node != null) {
                result.add(0, node);
            }
        }

        return result;
    }
}
