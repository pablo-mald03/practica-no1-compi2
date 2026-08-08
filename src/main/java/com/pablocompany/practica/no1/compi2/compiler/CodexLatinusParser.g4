parser grammar CodexLatinusParser;

options {
    tokenVocab=CodexLatinusLexer;
}

program: body*;

    
body:   variable_section 
        munera_section 
        maior_section 
        FINIS_SEPARATOR DOT_COMMA
    ;


/*===*****===== VARIABILES SECTION =====*****===*/

variable_section: VARIABILES GREATER variabiles_body
                ;


/*------ DECLARATE VARIABILES SECTION ------*/

variabiles_body: variabiles_body declarations
                | declarations;


/*------ DECLARATIONS PRODUCTIONS SECTION------*/
declarations: ESTO;



/*===*****===== MAIOR SECTION =====*****===*/

maior_section: MAIOR GREATER
                ;



/*===*****===== MUNERA SECTION =====*****===*/

munera_section: MUNERA GREATER
                ;



/*--******---- OPERATION SECTION ----******--*/

expression  : MINUS expression                          # Negate
            | expression MULTIPLICATION expression      # Multiplication
            | expression DIVIDE expression              # Divide
            | expression PLUS expression                # Plus
            | expression MINUS expression               # Minus
            | values                                    # ReducedValue
            | INIT_PARENT expression FINAL_PARENT       # Parents
            ;


/*--******---- VALUES SECTION ----******--*/

values  : INT
        | DECIMAL
        | CHAR
        | STRING
        | ID 
        ;