package com.pablocompany.practica.no1.compi2.infrastructure.generator;

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
import com.pablocompany.practica.no1.compi2.infrastructure.semantic.services.TranslateExpressionService;
import lombok.AllArgsConstructor;

//This is the delegated class to build the final code
public class CodeGeneratorVisitor implements AstVisitor<String> {

    private final TranslateExpressionService translateService;

    public CodeGeneratorVisitor() {
        this.translateService = new TranslateExpressionService();
    }

    /*Initial visitor value return*/
    @Override
    public String visit(ProgramNode node) {
        StringBuilder sb = new StringBuilder();
        for (BodyNode body : node.getBodies()) {
            sb.append(body.accept(this));
        }
        return sb.toString();
    }

    @Override
    public String visit(BodyNode node) {
        StringBuilder sb = new StringBuilder();

        if (node.getVariablesSection() != null) {
            sb.append(node.getVariablesSection().accept(this));
        }

        if (node.getMuneraSection() != null) {
            sb.append(node.getMuneraSection().accept(this));
        }

        if (node.getMaiorSection() != null) {
            sb.append(node.getMaiorSection().accept(this));
        }

        sb.append("\n").append(translateService.translateUpperCase("FINIS"))
                .append(";")
                .append("\n\n");

        return sb.toString();
    }


    /*----Sections visitor----*/
    @Override
    public String visit(VariablesSectionNode node) {
        StringBuilder sb = new StringBuilder();

        sb.append("\n").append(translateService.translateUpperCase("VARIABILES"))
                .append(">\n\n");

        for (AstNode declaration : node.getDeclarations()) {
            sb.append(declaration.accept(this));
        }

        return sb.toString();
    }

    @Override
    public String visit(MuneraSectionNode node) {
        StringBuilder sb = new StringBuilder();

        sb.append("\n").append(translateService.translateUpperCase("MUNERA"))
                .append(">\n\n");

        for (AstNode function : node.getFunctions()) {
            sb.append(function.accept(this));
        }

        return sb.toString();
    }

    @Override
    public String visit(MaiorSectionNode node) {
        StringBuilder sb = new StringBuilder();

        sb.append("\n").append(translateService.translateUpperCase("MAIOR"))
                .append(">\n\n");

        for (AstNode statement : node.getStatements()) {
            sb.append(statement.accept(this));
        }

        return sb.toString();
    }


    /*----Variable values visitor----*/

    @Override
    public String visit(VariableDeclarationNode node) {
        StringBuilder sb = new StringBuilder();

        sb.append(translateService.translatePreserveCase("esto"))
                .append(" ")
                .append(translateService.translatePreserveCase(node.getIdentifier()))
                .append(" ")
                .append(":")
                .append(" ")
                .append(node.getDataType().accept(this))
                .append(" ")
                .append(node.getInitializer().accept(this))
                .append(";")
                .append("\n");

        return sb.toString();
    }

    @Override
    public String visit(ArrayDeclarationNode node) {
        StringBuilder sb = new StringBuilder();

        sb.append(translateService.translatePreserveCase("series"))
                .append(" ")
                .append(translateService.translatePreserveCase(node.getIdentifier()))
                .append("[")
                .append(node.getSize().accept(this))
                .append("]")
                .append(" ")
                .append(":")
                .append(" ")
                .append(node.getDataType().accept(this));

        if (node.getInitializer() != null) {
            sb.append(" ")
                    .append(node.getInitializer().accept(this));
        }

        sb.append(";")
                .append("\n");

        return sb.toString();
    }

    /*----Struct variables transalation INSTRUCTIONS SECTION----*/

    @Override
    public String visit(StructDeclarationNode node) {
        StringBuilder sb = new StringBuilder();

        sb.append("\n").append(translateService.translatePreserveCase("structura"))
                .append(" ")
                .append(translateService.translatePreserveCase(node.getStructName()))
                .append(" ")
                .append("{")
                .append("\n\n");

        String separator = node.isHasCommas()? ",": ";";

        for (StructAttributeNode attr : node.getAttributes()) {
            sb.append(attr.accept(this))
                    .append(separator)
                    .append("\n");

        }

        sb.append("\n").append("}")
                .append(" ")
                .append(translateService.translatePreserveCase("finis"))
                .append(";")
                .append("\n\n");

        return sb.toString();
    }

    @Override
    public String visit(StructInstanceNode node) {
        StringBuilder sb = new StringBuilder();

        sb.append(translateService.translatePreserveCase("esto"))
                .append(" ")
                .append(translateService.translatePreserveCase(node.getIdentifier()))
                .append(" ")
                .append(":")
                .append(" ")
                .append(translateService.translatePreserveCase(node.getStructType()))
                .append(" ")
                .append(node.getLiteral().accept(this))
                .append(" ")
                .append(";")
                .append("\n");

        return sb.toString();
    }

    // ===== STRUCT ATTRIBUTES INSTRUCTIONS SECTION=====

    @Override
    public String visit(StructAttributeNode node) {

        StringBuilder sb = new StringBuilder();

        if (node.isArray()) {
            sb.append(translateService.translatePreserveCase("series"))
                    .append(" ")
                    .append(translateService.translatePreserveCase(node.getIdentifier()))
                    .append(" ")
                    .append(":")
                    .append(" ")
                    .append(node.getType().accept(this));
        } else {
            sb.append(translateService.translatePreserveCase("esto"))
                    .append(" ")
                    .append(translateService.translatePreserveCase(node.getIdentifier()))
                    .append(" ")
                    .append(":")
                    .append(" ")
                    .append(node.getType().accept(this));
        }
        return sb.toString();
    }

    // ===== STATEMENTS INSTRUCTIONS SECTION=====
    @Override
    public String visit(VariableAssignmentNode node) {
        StringBuilder sb = new StringBuilder();

        sb.append(node.getIdentifier().accept(this))
                .append(" ")
                .append("=")
                .append(" ")
                .append(node.getExpressionNode().accept(this))
                .append(" ")
                .append(";")
                .append("\n");

        return sb.toString();
    }


    // ===== CONTROL FLOW INSTRUCTIONS SECTION=====

    @Override
    public String visit(IfStatementNode node) {
        StringBuilder sb = new StringBuilder();

        sb.append("\n").append(translateService.translatePreserveCase("si"))
                .append(" ")
                .append("(")
                .append(" ")
                .append(node.getCondition().accept(this))
                .append(" ")
                .append(")")
                .append(" ")
                .append("{")
                .append("\n\n");

        for (AstNode stmt : node.getThenBody()) {
            sb.append(stmt.accept(this));
        }

        sb.append("\n").append("}");

        for (ElseIfNode elseIf : node.getElseIfs()) {
            sb.append(elseIf.accept(this));
        }

        if (node.getElseBlockNode() != null) {
            sb.append(node.getElseBlockNode().accept(this));
        }

        sb.append(translateService.translatePreserveCase("finis"))
                .append(";")
                .append("\n\n");

        return sb.toString();
    }


    @Override
    public String visit(ElseIfNode node) {
        StringBuilder sb = new StringBuilder();

        sb.append("\n").append(translateService.translatePreserveCase("aliter"))
                .append(" ")
                .append("(")
                .append(" ")
                .append(node.getCondition().accept(this))
                .append(" ")
                .append(")")
                .append(" ")
                .append("{")
                .append("\n\n");

        for (AstNode stmt : node.getBody()) {
            sb.append(stmt.accept(this));
        }

        sb.append("\n").append("}");

        return sb.toString();
    }


    @Override
    public String visit(ElseBlockNode node) {
        StringBuilder sb = new StringBuilder();

        sb.append("\n").append(translateService.translatePreserveCase("aliter"))
                .append(" ")
                .append("{")
                .append("\n\n");

        for (AstNode stmt : node.getBody()) {
            sb.append(stmt.accept(this));
        }

        sb.append("\n").append("}");

        return sb.toString();
    }

    // ===== LOOPS INSTRUCTIONS SECTION=====

    @Override
    public String visit(WhileStatementNode node) {
        StringBuilder sb = new StringBuilder();

        sb.append("\n").append(translateService.translatePreserveCase("dum"))
                .append(" ")
                .append("(")
                .append(" ")
                .append(node.getCondition().accept(this))
                .append(" ")
                .append(")")
                .append(" ")
                .append("{")
                .append("\n\n");

        for (AstNode stmt : node.getBody()) {
            sb.append(stmt.accept(this));
        }

        sb.append("\n").append("}")
                .append(" ")
                .append(translateService.translatePreserveCase("finis"))
                .append(";")
                .append("\n");

        return sb.toString();
    }


    @Override
    public String visit(DoWhileStatementNode node) {
        StringBuilder sb = new StringBuilder();

        sb.append("\n").append(translateService.translatePreserveCase("facere"))
                .append(" ")
                .append("{")
                .append("\n\n");

        for (AstNode stmt : node.getBody()) {
            sb.append(stmt.accept(this));
        }

        sb.append("\n").append("}")
                .append(" ")
                .append(translateService.translatePreserveCase("dum"))
                .append(" ")
                .append("(")
                .append(" ")
                .append(node.getCondion().accept(this))
                .append(" ")
                .append(")")
                .append(";")
                .append("\n");

        return sb.toString();
    }

    @Override
    public String visit(ForStatementNode node) {
        StringBuilder sb = new StringBuilder();

        sb.append("\n").append(translateService.translatePreserveCase("per"))
                .append(" ")
                .append("(");

        if (node.getInit() != null) {
            sb.append(" ")
                    .append(node.getInit().accept(this));
        }

        sb.append(" ")
                .append(";")
                .append(" ");

        if (node.getCondition() != null) {
            sb.append(node.getCondition().accept(this));
        }

        sb.append(" ")
                .append(";")
                .append(" ");

        if (node.getUpdate() != null) {
            sb.append(node.getUpdate().accept(this));
        }

        sb.append(" ")
                .append(")")
                .append(" ")
                .append("{")
                .append("\n\n");

        for (AstNode stmt : node.getBody()) {
            sb.append(stmt.accept(this));
        }

        sb.append("\n").append("}")
                .append("\n");

        return sb.toString();
    }

    // ===== IO STATEMENTS INSTRUCTIONS SECTION=====
    @Override
    public String visit(PrintStatementNode node) {
        StringBuilder sb = new StringBuilder();

        sb.append("%OINK")
                .append(" ");

        for (int i = 0; i < node.getExpressionList().size(); i++) {
            if (i > 0) {
                sb.append(" ")
                        .append("%OINK")
                        .append(" ");
            }
            sb.append(node.getExpressionList().get(i).accept(this));
        }

        sb.append(";")
                .append("\n");

        return sb.toString();
    }


    @Override
    public String visit(ReadStatementNode node) {
        StringBuilder sb = new StringBuilder();

        if (node.getTarget() != null) {
            sb.append(node.getTarget().accept(this)).append(" ");
        }

        sb.append("%OINK_OINK")
                .append("\n");

        return sb.toString();
    }

    // ===== BREAK/CONTINUE/RETURN INSTRUCTIONS SECTION=====


    @Override
    public String visit(ReturnStatementNode node) {
        StringBuilder sb = new StringBuilder();

        sb.append(translateService.translatePreserveCase("reddere"));

        if (node.getValue() != null) {
            sb.append(" ")
                    .append(node.getValue().accept(this));
        }

        sb.append(";")
                .append("\n");

        return sb.toString();
    }

    @Override
    public String visit(BreakStatementNode node) {
        return translateService.translatePreserveCase("interrumpe") + ";" + "\n";
    }

    @Override
    public String visit(ContinueStatementNode node) {
        return translateService.translatePreserveCase("perge") + ";"  + "\n";
    }

    // ===== INCREMENT/DECREMENT INSTRUCTIONS SECTION =====

    @Override
    public String visit(IncrementStatementNode node) {
        StringBuilder sb = new StringBuilder();

        sb.append(node.getTargetVariable().accept(this))
                .append(" ")
                .append(node.getAbreviationOperator().getValue())
                .append(";")
                .append("\n");

        return sb.toString();
    }

    @Override
    public String visit(DecrementStatementNode node) {
        StringBuilder sb = new StringBuilder();

        sb.append(node.getTargetVariable().accept(this))
                .append(" ")
                .append(node.getAbreviationOperator().getValue())
                .append(";")
                .append("\n");

        return sb.toString();
    }

    // ===== EXPRESSIONS INSTRUCTIONS SECTION =====

    @Override
    public String visit(LiteralExpressionNode node) {
        return node.getValue();
    }

    @Override
    public String visit(IdentifierExpressionNode node) {
        return translateService.translatePreserveCase(node.getIdentifier());
    }

    @Override
    public String visit(BinaryExpressionNode node) {
        StringBuilder sb = new StringBuilder();

        sb.append(node.getLeft().accept(this))
                .append(" ")
                .append(node.getOperator().getValue())
                .append(" ")
                .append(node.getRight().accept(this));

        return sb.toString();
    }

    @Override
    public String visit(UnaryExpressionNode node) {
        StringBuilder sb = new StringBuilder();

        sb.append(node.getOperator().getValue())
                .append(" ")
                .append(node.getExpressionNode().accept(this));

        return sb.toString();
    }

    @Override
    public String visit(FunctionCallExpressionNode node) {
        StringBuilder sb = new StringBuilder();

        sb.append(translateService.translatePreserveCase(node.getFunctionName()))
                .append(" ")
                .append("(");

        for (int i = 0; i < node.getArguments().size(); i++) {
            if (i > 0) {
                sb.append(" ")
                        .append(",")
                        .append(" ");
            }
            sb.append(node.getArguments().get(i).accept(this));
        }

        sb.append(" ")
                .append(")");

        return sb.toString();
    }

    @Override
    public String visit(ArrayCallExpressionNode node) {
        StringBuilder sb = new StringBuilder();

        sb.append(translateService.translatePreserveCase(node.getArrayName()))
                .append("[")
                .append(node.getIndexExpression().accept(this))
                .append("]");

        return sb.toString();
    }

    @Override
    public String visit(PropertyAccessExpressionNode node) {
        StringBuilder sb = new StringBuilder();

        sb.append(node.getTarget().accept(this))
                .append(".")
                .append(translateService.translatePreserveCase(node.getPropertyName()));

        return sb.toString();
    }

    @Override
    public String visit(MemberArrayAccessExpressionNode node) {
        StringBuilder sb = new StringBuilder();

        sb.append(node.getTarget().accept(this))
                .append("[")
                .append(node.getIndex().accept(this))
                .append("]");

        return sb.toString();
    }

    @Override
    public String visit(ArrayInitExpressionNode node) {
        StringBuilder sb = new StringBuilder();

        sb.append("{");

        for (int i = 0; i < node.getElements().size(); i++) {
            if (i > 0) {
                sb.append(" ")
                        .append(",")
                        .append(" ");
            }
            sb.append(node.getElements().get(i).accept(this));
        }

        sb.append(" ")
                .append("}");

        return sb.toString();
    }

    @Override
    public String visit(StructLiteralExpressionNode node) {
        StringBuilder sb = new StringBuilder();

        sb.append("{");

        for (int i = 0; i < node.getProperties().size(); i++) {
            if (i > 0) {
                sb.append(" ")
                        .append(",")
                        .append(" ");
            }
            sb.append(node.getProperties().get(i).accept(this));
        }

        sb.append(" ")
                .append("}");

        return sb.toString();
    }



    @Override
    public String visit(StructPropertyNode node) {
        StringBuilder sb = new StringBuilder();

        sb.append(translateService.translatePreserveCase(node.getPropertyName()))
                .append(" ")
                .append(":")
                .append(" ")
                .append(node.getValue().accept(this));

        return sb.toString();
    }

    // ===== TYPES =====

    @Override
    public String visit(TypeNode node) {
        switch (node.getDataType()) {
            case INT:
                return translateService.translatePreserveCase("numerus");
            case DECIMAL:
                return translateService.translatePreserveCase("decimalis");
            case CHAR:
                return translateService.translatePreserveCase("littera");
            case BOOLEAN:
                return translateService.translatePreserveCase("bool");
            case STRING:
                return translateService.translatePreserveCase("textum");
            case CUSTOM:
                return translateService.translatePreserveCase(node.getCustomTypeName());
            default:
                return node.getDataType().toString().toLowerCase();
        }
    }

    @Override
    public String visit(FunctionDeclarationNode node) {
        StringBuilder sb = new StringBuilder();

        sb.append(translateService.translatePreserveCase("ratio"))
                .append(" ")
                .append(node.getReturnType().accept(this))
                .append(" ")
                .append(translateService.translatePreserveCase(node.getName()))
                .append(" ")
                .append("(");

        for (int i = 0; i < node.getParameters().size(); i++) {
            if (i > 0) {
                sb.append(" ")
                        .append(",")
                        .append(" ");
            }
            sb.append(node.getParameters().get(i).accept(this));
        }

        sb.append(" ")
                .append(")")
                .append(" ")
                .append("{")
                .append("\n\n");

        if (!node.getLocalVariables().isEmpty()) {
            sb.append(translateService.translateUpperCase("VARIABILES"))
                    .append(" ")
                    .append("[")
                    .append("\n");

            for (AstNode localVar : node.getLocalVariables()) {
                sb.append(localVar.accept(this));
            }

            sb.append("]")
                    .append("\n\n");
        }

        for (AstNode stmt : node.getBody()) {
            sb.append(stmt.accept(this));
        }

        sb.append("\n").append("}")
                .append(" ")
                .append(translateService.translatePreserveCase("finis"))
                .append(";")
                .append("\n\n");

        return sb.toString();
    }

    @Override
    public String visit(ProcedureDeclarationNode node) {
        StringBuilder sb = new StringBuilder();

        sb.append(translateService.translatePreserveCase("actio"))
                .append(" ")
                .append(translateService.translatePreserveCase(node.getName()))
                .append(" ")
                .append("(");

        for (int i = 0; i < node.getParameters().size(); i++) {
            if (i > 0) {
                sb.append(" ")
                        .append(",")
                        .append(" ");
            }
            sb.append(node.getParameters().get(i).accept(this));
        }

        sb.append(" ")
                .append(")")
                .append(" ")
                .append("{")
                .append("\n\n");

        if (!node.getLocalVariables().isEmpty()) {
            sb.append(translateService.translateUpperCase("VARIABILES"))
                    .append(" ")
                    .append("[")
                    .append("\n");

            for (AstNode localVar : node.getLocalVariables()) {
                sb.append(localVar.accept(this));
            }

            sb.append("]")
                    .append("\n\n");
        }

        for (AstNode stmt : node.getBody()) {
            sb.append(stmt.accept(this));
        }

        sb.append("\n").append("}")
                .append(" ")
                .append(translateService.translatePreserveCase("finis"))
                .append(";")
                .append("\n\n");

        return sb.toString();
    }

    @Override
    public String visit(ParameterNode node) {
        StringBuilder sb = new StringBuilder();

        if (node.isArray()) {
            sb.append(translateService.translatePreserveCase("series"));
        } else {
            sb.append(translateService.translatePreserveCase("esto"));
        }

        sb.append(" ")
                .append(translateService.translatePreserveCase(node.getName()))
                .append(" ")
                .append(":")
                .append(" ")
                .append(node.getType().accept(this));

        return sb.toString();
    }
}
