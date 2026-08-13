package com.pablocompany.practica.no1.compi2.infrastructure.semantic.services;

import com.pablocompany.practica.no1.compi2.compiler.logic.CodexLatinusParser;
import com.pablocompany.practica.no1.compi2.domain.semantic.childs.expressions.structs.properties.StructPropertyNode;
import com.pablocompany.practica.no1.compi2.domain.semantic.childs.statements.functions.ParameterNode;
import com.pablocompany.practica.no1.compi2.domain.semantic.parents.ExpressionNode;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

//This is the principal class to translate the expression lists
@NoArgsConstructor
public class TranslateListsHelperService {


    //This method translate and build the recursive list
    private <T> List<T> buildRecursiveList(Object ctx,
                                           Function<Object, Boolean> isListContext,
                                           Function<Object, Object> getNextContext,
                                           Function<Object, Object> getCurrentValue,
                                           Function<Object, T> visitValue) {
        List<T> result = new ArrayList<>();
        Object current = ctx;

        while (current != null && isListContext.apply(current)) {
            Object value = getCurrentValue.apply(current);
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

//    private List<ExpressionNode> parseArguments(CodexLatinusParser.Arguments_listContext ctx) {
//        return buildRecursiveList(ctx,
//                c -> c instanceof CodexLatinusParser.ArgumentFunctionListContext,
//                c -> ((CodexLatinusParser.ArgumentFunctionListContext) c).arguments_list(),
//                c -> ((CodexLatinusParser.ArgumentFunctionListContext) c).expression(),
//                expr -> (ExpressionNode) visit(expr)
//        );
//    }
//
//    private List<StructPropertyNode> parseStructDataList(CodexLatinusParser.Struct_data_listContext ctx) {
//        return buildRecursiveList(ctx,
//                c -> c instanceof CodexLatinusParser.StructValueListContext,
//                c -> ((CodexLatinusParser.StructValueListContext) c).struct_data_list(),
//                c -> ((CodexLatinusParser.StructValueListContext) c).struct_data_value(),
//                val -> (StructPropertyNode) visit(val)
//        );
//    }
//
//    private List<ParameterNode> parseParameters(CodexLatinusParser.Function_argumentsContext ctx) {
//        return buildRecursiveList(ctx,
//                c -> c instanceof CodexLatinusParser.FunctionArgsListContext,
//                c -> ((CodexLatinusParser.FunctionArgsListContext) c).function_arguments(),
//                c -> ((CodexLatinusParser.FunctionArgsListContext) c).argument(),
//                arg -> (ParameterNode) visit(arg)
//        );
//    }


}
