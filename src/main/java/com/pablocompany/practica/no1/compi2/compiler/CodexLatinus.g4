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
WS: [ \t\r\n]+ -> skip;
ID: [a-zA-Z];
