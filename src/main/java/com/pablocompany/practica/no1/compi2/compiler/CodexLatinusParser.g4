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

maior_section: MAIOR GREATER    # MaiorSection
                ;







/*===*****===== MUNERA SECTION =====*****===*/

munera_section: MUNERA GREATER  #MuneraSection
                ;


/*===*****===== VARIABILES SECTION =====*****===*/

variable_section: VARIABILES GREATER variabiles_body #VariablesSection
                ;


/*------ DECLARATE VARIABILES SECTION ------*/

variabiles_body: variabiles_body declarations
                | declarations;


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

expression  : MINUS expression                          # Negate
            | expression MULTIPLICATION expression      # Multiplication
            | expression DIVIDE expression              # Divide
            | expression PLUS expression                # Plus
            | expression MINUS expression               # Minus
            | normal_values                             # ReducedValue
            | INIT_PARENT expression FINAL_PARENT       # Parents
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

