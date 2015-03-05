grammar test;

/* topLevels
    : topLevel
    | topLevel topLevels
    ; */

//PARSER

topLevel
    : functiondeclarations /* statements */ EOF
    ;

statements
    : statement statements
    | '' /* Epsilon == empty char '' */
    ;

statement
    : expression ';'
    | assignment ';'
    | declaration ';'
    ;

functiondeclarations
    : functiondeclaration functiondeclarations
    | '' /* Epsilon */
    ;

functiondeclaration
    : ( datatype | collection '<' datatype '>' | 'void' ) ID '(' parameterlist ')' '{' ( statement )* ( 'return' expression ';' )? '}'
    ;

parameterlist
    : declaration ( ',' declaration ) *
    | '' /* Epsilon */
    ;

functioncall
    : ID '(' argumentlist ')'
    ;

argumentlist
    : expression ( ',' expression ) *
    | ''
    ;

expression
    : addexpression
    ;

addexpression
    : multiexpression (( '+' | '-' ) multiexpression) *
    ;

multiexpression
    : primary (( '*' | '/' ) primary) *
    ;

primary
    : '(' expression ')'
    | value
    | '-' primary
    | functioncall
    ;


assignment
    : ID '=' addexpression
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

//LEXER

MATRIX: 'matrix' ;

INT: 'int' ;
INTNUM: '0' | SIGN? [1-9][0-9]* ;

FLOAT: 'float' ;
FLOATNUM: '0.0' | SIGN? ([1-9][0-9]* | '0') '.' [0-9]* [1-9] ;

SIGN: '-' ;

ID: [a-zA-Z_][a-zA-Z0-9_]* ;

//Whitespace and comments

WS: [ \t ]+ -> skip;

NL: [ \r \n | \n ] -> skip;

COMMENT
    :   '/*' .*? '*/' -> skip
    ;

LINE_COMMENT
    :   '//' ~[\r\n]* -> skip
    ;


