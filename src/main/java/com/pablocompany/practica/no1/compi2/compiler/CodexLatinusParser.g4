parser grammar CodexLatinusParser;

options {
    tokenVocab=CodexLatinusLexer;
}

program: declaration*; 
declaration: expr
    ;


expr: '-' expr                 # Negate  
    | expr op=('*'| '/') expr  # MultDiv
    | expr op=('-'| '+') expr  # AddSub
    | INT                   # Number
    | ID                    #Identifier
    | '(' expr ')'          # Parens
    ;