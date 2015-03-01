grammar test;

/* topLevels
    : topLevel
    | topLevel topLevels
    ; */

topLevel
    : statements EOF
    ;

statements
    : statement ';' statements
    | '' /* Epsilon == empty char '' */
    ;

statement
    : expression
    | assignment
    | declaration
    ;

expression
    : value
    | value infixBinaryOperator expression
    | ID postUnaryOperator
    | '(' expression ')'
    ;

assignment
    : ID '=' expression
    ;

declaration
    : datatype assignment
    | collection '<' datatype '>' ID '[' dimension ']' '=' expression
    ;

value
    : ID
    | constant
    | '[' valueListList ']'
    ;

valueListList
    : valueList
    | valueList ';' valueListList
    ;

valueList
    : value
    | value ',' valueList
    ;

constantList
    : constant
    | constant ',' constantList
    ;

dimension
    : INTNUM
    | INTNUM ',' INTNUM
    ;

datatype
    : INT
    | FLOAT
    ;

collection
    : MATRIX
    | ('rowvector' | 'colvector')
    ;

infixBinaryOperator
    : '+' | '-' | '*' | '/' | '%'
    ;

postUnaryOperator
    : '++' | '--'
    ;

constant
    : INTNUM
    | FLOATNUM
    ;

MATRIX: 'matrix' ;

INT: 'int' ;
INTNUM: '0' | SIGN? '1'..'9' '0'..'9'* ;

FLOAT: 'float' ;
FLOATNUM: '0.0' | SIGN? ('1'..'9' '0'..'9'* | '0') '.' '0'..'9'* '1'..'9' ;

SIGN: '-' ;

ID: ('a'..'z'|'A'..'Z'|'_')+;

//Whitespace and comments

WS: [ \t|\n]+ -> skip;

COMMENT
    :   '/*' .*? '*/' -> skip
    ;

LINE_COMMENT
    :   '//' ~[\r\n]* -> skip
    ;
