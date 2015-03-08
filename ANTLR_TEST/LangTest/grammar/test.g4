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
    | controlblock
    | loop
    ;

controlblock
    : IF '(' condition ')' '{' statement* '}' (ELSE IF '(' condition ')' '{' statement* '}')* (ELSE '{' statement* '}')?
    ;

loop
    : WHILE '(' (condition | BOOLVAL) ')' '{' statement* '}'
    | FOR '(' datatype? assignment ';' condition ';' expression ')' '{' statement* '}'
    ;


condition
    : expression conditionalOperator expression
    ;

functiondeclaration
    : ( datatype | collectiontype '<' datatype '>' | 'void' ) ID '(' parameterlist ')' '{' ( statement )* ( 'return' expression ';' )? '}'
    ;

parameterlist
    : ((datatype ID | STRING | collectiontype '<' datatype '>' ID)( ',' (datatype ID | STRING | collectiontype '<' datatype '>' ID) )*)?
    | ''
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
    | ID postUnaryOperator
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
    | ID '=' BOOLVAL
    ;

declaration
    : datatype assignment
    | collectiontype '<' datatype '>' ID '[' dimension ']' '=' expression
    ;

value
    : ID
    | constant
    | '[' valueListList ']'
    | functioncall
    | collectionEntrance
    | BOOLVAL
    ;

collectionEntrance
    : ID '[' dimension ']'
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

collectiontype
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

conditionalOperator
    : '==' | '!=' | '<=' | '>=' | '<' | '>' ;

constant
    : INTNUM
    | FLOATNUM
    ;

//LEXER

IF: 'if' ;
ELSE: 'else' ;

WHILE: 'while' ;
FOR: 'for' ;

MATRIX: 'matrix' ;

INT: 'int' ;
INTNUM: '0' | SIGN? [1-9][0-9]* ;

FLOAT: 'float' ;
FLOATNUM: '0.0' | SIGN? ([1-9][0-9]* | '0') '.' [0-9]* [1-9] ;

BOOL: 'bool' ;
BOOLVAL: 'True' | 'False' ;

STRING: '"' ~('\r' | '\n' | '"')* '"' ;

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


