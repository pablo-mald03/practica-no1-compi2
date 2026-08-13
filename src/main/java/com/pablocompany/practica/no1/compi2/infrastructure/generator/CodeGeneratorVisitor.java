package com.pablocompany.practica.no1.compi2.infrastructure.generator;

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

//This is the delegated class to build the final code
public class CodeGeneratorVisitor implements AstVisitor<String> {

    @Override
    public String visit(VariableDeclarationNode node) {
        return "";
    }

    @Override
    public String visit(BinaryExpressionNode node) {
        String leftCode = node.getLeft().accept(this);
        String rightCode = node.getRight().accept(this);
        return leftCode + " " + node.getOperator() + " " + rightCode;
    }

    @Override
    public String visit(TypeNode node) {
        return "";
    }

    @Override
    public String visit(UnaryExpressionNode node) {
        return "";
    }

    @Override
    public String visit(LiteralExpressionNode node) {
        return "";
    }

    @Override
    public String visit(IdentifierExpressionNode node) {
        return "";
    }

    @Override
    public String visit(ArrayCallExpressionNode node) {
        return "";
    }

    @Override
    public String visit(FunctionCallExpressionNode node) {
        return "";
    }

    @Override
    public String visit(ArrayInitExpressionNode node) {
        return "";
    }

    @Override
    public String visit(ArrayDeclarationNode node) {
        return "";
    }

    @Override
    public String visit(StructAttributeNode node) {
        return "";
    }

    @Override
    public String visit(StructDeclarationNode node) {
        return "";
    }

    @Override
    public String visit(StructPropertyNode node) {
        return "";
    }

    @Override
    public String visit(StructLiteralExpressionNode node) {
        return "";
    }

    @Override
    public String visit(StructInstanceNode node) {
        return "";
    }

    @Override
    public String visit(PropertyAccessExpressionNode node) {
        return "";
    }

    @Override
    public String visit(MemberArrayAccessExpressionNode node) {
        return "";
    }

    @Override
    public String visit(ProgramNode node) {
        return "";
    }

    @Override
    public String visit(BodyNode node) {
        return "";
    }

    @Override
    public String visit(VariablesSectionNode node) {
        return "";
    }

    @Override
    public String visit(MuneraSectionNode node) {
        return "";
    }

    @Override
    public String visit(MaiorSectionNode node) {
        return "";
    }

    @Override
    public String visit(VariableAssignmentNode node) {
        return "";
    }

    @Override
    public String visit(ArrayAssignmentNode node) {
        return "";
    }

    @Override
    public String visit(IncrementStatementNode node) {
        return "";
    }

    @Override
    public String visit(DecrementStatementNode node) {
        return "";
    }

    @Override
    public String visit(IfStatementNode node) {
        return "";
    }

    @Override
    public String visit(ElseIfNode node) {
        return "";
    }

    @Override
    public String visit(ElseBlockNode node) {
        return "";
    }

    @Override
    public String visit(WhileStatementNode node) {
        return "";
    }

    @Override
    public String visit(DoWhileStatementNode node) {
        return "";
    }

    @Override
    public String visit(ForStatementNode node) {
        return "";
    }

    @Override
    public String visit(PrintStatementNode node) {
        return "";
    }

    @Override
    public String visit(ReadStatementNode node) {
        return "";
    }

    @Override
    public String visit(ReturnStatementNode node) {
        return "";
    }

    @Override
    public String visit(BreakStatementNode node) {
        return "";
    }

    @Override
    public String visit(ContinueStatementNode node) {
        return "";
    }

    @Override
    public String visit(FunctionDeclarationNode node) {
        return "";
    }

    @Override
    public String visit(ProcedureDeclarationNode node) {
        return "";
    }

    @Override
    public String visit(ParameterNode node) {
        return "";
    }
}
