grammar test;

/* topLevels
    : topLevel
    | topLevel topLevels
    ; */

//PARSER

topLevel
    : functiondeclaration* statement* EOF
    ;

statement
    : expression ';'
    | assignment ';'
    | declaration ';'
    | functioncall ';'
    ;

functiondeclaration
    : ( datatype | collection '<' datatype '>' | 'void' ) ID '(' parameterlist ')' '{' ( statement )* ( 'return' expression ';' )? '}'
    ;

parameterlist
    : (datatype ID ( ',' datatype ID )*)?
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
    | ID '=' functioncall
    ;

declaration
    : datatype assignment
    | collection '<' datatype '>' ID '[' dimension ']' '=' expression
    ;

value
    : ID
    | constant
    | '[' valueListList ']'
    | functioncall
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
    | BOOL
    ;

collection
    : MATRIX
    | ROWVECTOR
    | COLVECTOR
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

BOOL: 'bool' ;

ROWVECTOR: 'rowvector' | 'rvec' ;

COLVECTOR: 'colvector' | 'cvec' ; 

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


