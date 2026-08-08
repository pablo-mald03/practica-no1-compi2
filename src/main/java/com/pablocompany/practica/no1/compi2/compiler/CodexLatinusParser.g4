parser grammar CodexLatinusParser;

options {
    tokenVocab=CodexLatinusLexer;
}

program: body*;

    
body:   variable_section 
        munera_section?
        maior_section 
        FINIS_SEPARATOR DOT_COMMA
    ;

/*===*****===== MAIOR SECTION =====*****===*/

maior_section
    : MAIOR GREATER  maior_body  # MaiorSection
    ;

maior_body
    : maior_body functions_block        # FunctionsBlockList
    | functions_block                 # FunctionsSingleBlock
    ;

functions_block
    : function_declaration
    | procedure_declaration
    ;

function_declaration
    : RATIO variable_type ID INIT_PARENT function_arguments FINAL_PARENT function_body INIT_BRACE FINAL_BRACE
    ;



function_body
    : VARIABILES INIT_BRACKET FINAL_BRACKET
    ;

procedure_declaration
    : ACTIO
    ;

function_arguments
    : function_arguments COMMA argument         #FunctionArgsList
    | argument                                  #FunctionSingleArgs
    | /*Empty*/                                 #FunctionArgsEmpty
    ;

argument
: ESTO ID TWO_POINTS variable_type
;

/*===*****===== MUNERA SECTION =====*****===*/

munera_section
    : MUNERA GREATER code_body  #MuneraCodeSection
    ;

/*===*****===== CONTROL STRUCTURES SECTION =====*****===*/

code_body
    : code_body control_block       # BlockControlList
    | control_block                 # BlockSingleControl
    ;

control_block
    : block_code                    # BlockCode
    | console_actions               # ConsoleActions
//    | boolean_declaration           # BlockBoolDecl
//    | normal_array                  # BlockArrayDecl
//    | struct_declaration            # BlockStructDecl
//    | assignment DOT_COMMA          # BlockAssignment
    ;

/*===*****=====*****===== CONSOLE FUNCTIONS =====*****====*****====*/

console_actions
    : ID READ
    | READ
    | PRINT print_function DOT_COMMA
    ;

print_function
    : print_function PRINT expression
    | expression
    ;

/*===*****=====*****===== COMMON CODE SECTION =====*****====*****====*/

/*------ THIS IS THE MOST IMPORTANT BLOCK BECAUSE IT CONTAINS MORE STRUCTURE CONTROLS IN------*/


block_code
    : if_statement          # CodeBlockIf
    | while_statement       # CodeBlockWhile
    | do_while_statement    # CodeBlockDoWhile
    | for_statement         # CodeBlockFor
    ;

/*------ IF STATEMENT PRODUCTION ------*/

if_statement
    : SI INIT_PARENT expression FINAL_PARENT INIT_BRACE code_body FINAL_BRACE else_if_list else_statement FINIS DOT_COMMA     # IfStatement
    ;

else_if_list
    : else_if_list else_if_clause   # ElseIfList
    | /* Lambda */                  # ElseIfEmpty
    ;

else_if_clause
    : ALITER INIT_PARENT expression FINAL_PARENT INIT_BRACE code_body FINAL_BRACE     # ElseIfClause
    ;

/*------ ELSE STATEMENT PRODUCTION ------*/

else_statement
    : ALITER INIT_BRACE code_body FINAL_BRACE     # ElseBlock
    | /* Lambda */                                  # ElseEmpty
    ;

/*------ WHILE STATEMENT PRODUCTION ------*/

while_statement
    : DUM INIT_PARENT expression FINAL_PARENT INIT_BRACE code_body FINAL_BRACE FINIS DOT_COMMA # WhileStatement
    ;

/*------ DO WHILE STATEMENT PRODUCTION ------*/

do_while_statement
    : FACERE INIT_BRACE code_body FINAL_BRACE DUM INIT_PARENT expression FINAL_PARENT DOT_COMMA # DoWhileStatement
    ;

/*------ FOR STATEMENT PRODUCTION ------*/

for_statement
    : PER INIT_PARENT for_init DOT_COMMA expression DOT_COMMA for_update FINAL_PARENT INIT_BRACE code_body FINAL_BRACE # ForStatement
    ;

for_init
    : ESTO ID TWO_POINTS variable_type expression              # ForInitVarDeclaration
    | ID EQUAL expression                                       # ForInitAssign
    ;

/*------ AUTO INCREMENT VALUES ------*/

for_update
    : ID ABREV_PLUS          # ForUpdateIncrement
    | ID ABREV_MINUS          # ForUpdateDecrement
    | ID EQUAL expression   # ForUpdateAssign
    ;

/*===*****===== VARIABILES SECTION =====*****===*/

variable_section
    : VARIABILES GREATER variabiles_body #VariablesSection
    ;


/*------ DECLARATE VARIABILES SECTION ------*/

variabiles_body: variabiles_body declarations   # DeclarationsVariablesList
                | declarations                  # DeclarationsSingleVariable
                ;


/*------ DECLARATIONS PRODUCTIONS SECTION------*/
declarations
    : variable_declaration      # VariableInstance
    | variable_ussage           # VariableUssage
    | boolean_declaration       # BooleanVariableInstance
    | normal_array              # NormalArrayInstance
    | boolean_array             # BooleanArrayInstance
    | array_ussage              # ArrayUssage
    | struct_declaration        # StructDefinition
    | struct_array_property     # StructSetProperty
    | struct_instance           # StructVariableInstance
    ;


/*-----VARIABLE USAGE PRODUCTIONS-----*/

variable_ussage
    : ID EQUAL expression DOT_COMMA # NormalVariableUsage
    ;

array_ussage
    : ID INIT_BRACKET INT FINAL_BRACKET EQUAL expression DOT_COMMA # NormalArrayUsage
    ;


/*-----STRUCT INSTANCE PRODUCTIONS-----*/

struct_array_property
    : ID DOT ID  INIT_BRACKET INT FINAL_BRACKET EQUAL struct_data_list INIT_BRACE FINAL_BRACE   #StructArrayProperty
    ;


/*-----STRUCT INSTANCE PRODUCTIONS-----*/

struct_instance
    : ESTO ID TWO_POINTS ID INIT_BRACE struct_data_list FINAL_BRACE # StructInstance
    ;


struct_data_list
    : struct_data_list COMMA struct_data_value # StructValueList
    | struct_data_value # StructSingleValue
    ;



/*-----VARIABLE PRODUCTIONS-----*/
variable_declaration
    : ESTO ID TWO_POINTS variable_type expression DOT_COMMA # VarDeclaration
    ;

boolean_declaration
    : ESTO ID TWO_POINTS boolean_values DOT_COMMA # BoolDeclaration
    ;

normal_array
    : SERIES ID INIT_PARENT INT FINAL_PARENT TWO_POINTS variable_type array_initialization DOT_COMMA # NormalArrayDeclaration
    | boolean_array # BooleanArrayDeclaration
    ;

boolean_array
    : SERIES ID INIT_PARENT INT FINAL_PARENT TWO_POINTS array_initialization DOT_COMMA #BooleanArrayBase
    ;


/*---****------****--- ARRAY PROPERTIES SECTION ---****------****---*/

array_initialization
    : INIT_BRACE values_array_list FINAL_BRACE # ArrayInitWithValues
    | /* Lambda */                            # ArrayInitEmpty
    ;

values_array_list
    : values_array_list COMMA array_value # ArrayValueList
    | array_value                         # ArraySingleValue
    ;

array_value
    : struct_values  # ArrayStructVal
    | expression  # ArrayNormalVal
    ;



/*---****------****--- STRUCT DEFINITION SECTION ---****------****---*/

struct_declaration
    : STRUCTURE ID INIT_BRACE struct_body FINAL_BRACE FINIS DOT_COMMA # StructDeclaration
    ;

struct_body
    : struct_normal_body    # StructSeparatedBody
    | struct_comma_body     # StructCommaBody
    ;

struct_normal_body
    : struct_normal_body struct_attribute DOT_COMMA             # StructNormalBodyList
    | struct_attribute DOT_COMMA                                # StructNormalBodySingle
    ;

struct_comma_body
    : struct_comma_body COMMA struct_attribute      # StructCommaBodyList
    | struct_attribute                              # StructCommaBodySingle
    ;



/*---****------****--- STRUCT VARIABLES DECLARATION DEFINITION SECTION ---****------****---*/

struct_attribute
    : variable_without_value            # NormalVariableStruct
    | boolean_variable_without_value    # BooleanVariableStruct
    | array_variable_struct             # ArrayVariableStruct
    ;


/*-----STRUCT VARIABLE INSTANCE PRODUCTIONS-----*/

variable_without_value
    : ESTO ID TWO_POINTS variable_type # InternalStructNormalVariable
    ;

boolean_variable_without_value
    : ESTO ID TWO_POINTS boolean_values # InternalStructBoolVariable
    ;

array_variable_struct
    : SERIES ID TWO_POINTS ID           # InternalStructArray
    ;


/*-----STRUCT INSTANCE VALUES PRODUCTIONS-----*/

struct_data_value
    : ID TWO_POINTS expression      #StructDeclarationValue
    ;



/*--******-------****--- OPERATION SECTION ---****-------******--*/

expression
    : INIT_PARENT expression FINAL_PARENT               # ExpressionParents
    | NOT expression                                    # ExpressionNot
    | MINUS expression                                  # ExpressionNegate

    | expression MULTIPLICATION expression              # ExpressionMult
    | expression DIVIDE expression                      # ExpressionDiv

    | expression PLUS expression                        # ExpressionPlus
    | expression MINUS expression                       # ExpressionMinus

    | expression LESS expression                   # ExpressionLessThan
    | expression GREATER expression                     # ExpressionGreaterThan
    | expression LESS_EQUALS expression                        # ExpressionLessEqual
    | expression GREATER_EQUALS expression              # ExpressionGreaterEqual

    | expression EQUALS expression                      # ExpressionEquals
    | expression DIFERENCE expression                   # ExpressionNotEquals

    | expression AND expression                         # ExpressionAnd
    | expression OR expression                          # ExpressionOr

    | normal_values                                     # ExpressionValue
    ;



/*--------****--- VALUES AND TYPES SECTION ---****--------*/
variable_type
    : TEXTUM    # TypeText
    | NUMERUS   # TypeInt
    | DECIMALIS # TypeDecimal
    | LITTERA   # TypeChar
    | ID        # TypeCustomId
    ;

/*--------****--- ARRAY CALLING SECTION ---****--------*/
array_call
    : ID INIT_BRACKET INT FINAL_BRACKET     # ArrayCall
    ;


/*--------****--- VALUES SECTION ---****--------*/

struct_values
    : INIT_BRACE values_array_list FINAL_BRACE      # StructValueLiteral
    ;


/*--------****--- FUNCTION CALLING ---****--------*/

function_call
    : ID INIT_PARENT arguments_list FINAL_PARENT DOT_COMMA      # FunctionCalling
    ;

arguments_list
    : arguments_list COMMA normal_values        # ArgumentFunctionList
    | normal_values                             # ArgumentSingleFunction
    ;

normal_values
    : STRING         # ValString
    | CHAR           # ValChar
    | ID             # ValId
    | DECIMAL        # ValDecimal
    | INT            # ValInt
    | boolean_values # ValBool
    | array_call # ValIdCall
    ;

boolean_values
    : VERUM  # BoolTrue
    | FALSUS # BoolFalse
    ;


