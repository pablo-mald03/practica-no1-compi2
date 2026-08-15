package com.pablocompany.practica.no1.compi2.infrastructure.walkers.services;

import com.pablocompany.practica.no1.compi2.domain.semantic.childs.expressions.access.MemberArrayAccessExpressionNode;
import com.pablocompany.practica.no1.compi2.domain.semantic.childs.expressions.access.PropertyAccessExpressionNode;
import com.pablocompany.practica.no1.compi2.domain.semantic.childs.expressions.arrays.ArrayInitExpressionNode;
import com.pablocompany.practica.no1.compi2.domain.semantic.childs.expressions.assignation.BinaryExpressionNode;
import com.pablocompany.practica.no1.compi2.domain.semantic.childs.expressions.assignation.UnaryExpressionNode;
import com.pablocompany.practica.no1.compi2.domain.semantic.childs.expressions.structs.properties.StructLiteralExpressionNode;
import com.pablocompany.practica.no1.compi2.domain.semantic.childs.expressions.types.TypeNode;
import com.pablocompany.practica.no1.compi2.domain.semantic.childs.expressions.types.enums.DataType;
import com.pablocompany.practica.no1.compi2.domain.semantic.childs.expressions.values.ArrayCallExpressionNode;
import com.pablocompany.practica.no1.compi2.domain.semantic.childs.expressions.values.FunctionCallExpressionNode;
import com.pablocompany.practica.no1.compi2.domain.semantic.childs.expressions.values.IdentifierExpressionNode;
import com.pablocompany.practica.no1.compi2.domain.semantic.childs.expressions.values.LiteralExpressionNode;
import com.pablocompany.practica.no1.compi2.domain.semantic.parents.ExpressionNode;
import lombok.NoArgsConstructor;

//This is a service to help the type resolver class
@NoArgsConstructor
public class ResolverTypesService {

    // This method is the helper to assing any value to a variable or a nested variable (setter)
    public boolean isAssignable(TypeNode target, TypeNode source) {

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


    //This method compare if the type is numeric
    public boolean isNumeric(TypeNode type) {
        if (type == null) return false;
        return type.getDataType() == DataType.INT || type.getDataType() == DataType.DECIMAL;
    }

    //This method is the principal to determinates if the sentence is comparable
    public boolean areComparable(TypeNode left, TypeNode right) {
        if (left == null || right == null) return false;
        if (left.getDataType() == right.getDataType()) return true;
        if (left.getDataType() == DataType.INT && right.getDataType() == DataType.DECIMAL) return true;
        if (left.getDataType() == DataType.DECIMAL && right.getDataType() == DataType.INT) return true;
        return false;
    }

    //This method get the value operation
    public String getValueOperationString(BinaryExpressionNode node) {
        if (node == null) return "indefinido";

        String leftStr = getValueFromNode(node.getLeft());
        String rightStr = getValueFromNode(node.getRight());
        return leftStr + " " + node.getOperator().getValue() + " " + rightStr;
    }

    //This is a helper method
    public String getValueFromNode(ExpressionNode node) {
        if (node == null) return "indefinido";

        if (node instanceof LiteralExpressionNode) {
            return ((LiteralExpressionNode) node).getValue();
        }
        if (node instanceof IdentifierExpressionNode) {
            return ((IdentifierExpressionNode) node).getIdentifier();
        }
        if (node instanceof ArrayCallExpressionNode arr) {
            String index = getValueFromNode(arr.getIndexExpression());
            return arr.getArrayName() + "[" + index + "]";
        }
        if (node instanceof PropertyAccessExpressionNode prop) {
            return getValueFromNode(prop.getTarget()) + "." + prop.getPropertyName();
        }
        if (node instanceof MemberArrayAccessExpressionNode member) {
            return getValueFromNode(member.getTarget()) + "[" + getValueFromNode(member.getIndex()) + "]";
        }
        if (node instanceof FunctionCallExpressionNode func) {
            return func.getFunctionName() + "(...)";
        }
        if (node instanceof BinaryExpressionNode bin) {
            return getValueFromNode(bin.getLeft()) + " " + bin.getOperator().getValue() + " " +
                    getValueFromNode(bin.getRight());
        }
        if (node instanceof UnaryExpressionNode unary) {
            return unary.getOperator().getValue() + getValueFromNode(unary.getExpressionNode());
        }
        if (node instanceof StructLiteralExpressionNode) {
            return "{...}";
        }
        if (node instanceof ArrayInitExpressionNode) {
            return "[...]";
        }

        return "expresión";
    }
}
