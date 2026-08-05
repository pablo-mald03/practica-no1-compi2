grammar CodexLatinus;

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

INT: [0-9]+;

COMMENT

    : '//' ~[\r\n]*

      -> channel(HIDDEN);

BLOCK_COMMENT

    : '##' .*? '##'

      -> channel(HIDDEN);

WS: [ \t\r\n]+
    -> channel(HIDDEN)
    ;
ID: [a-zA-Z];
