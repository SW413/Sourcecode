grammar ourLang;

//PARSER

topLevel
    : importing* functiondeclaration* statement* EOF
    ;

statement
    : expression ';'
    | assignment ';'
    | declaration ';'
    | functioncall ';'
    | controlblock
    | loop
    ;

importing
    : IMPORT '<' LIBRARY '>'
    ; 

controlblock
    : IF '(' condition ')' block (ELSE IF '(' condition ')' block)* (ELSE block)?
    ;

loop
    : WHILE '(' (condition | BOOLVAL) ')' block
    | FOR '(' (datatype? assignment)? ';' condition? ';' expression? ')' block
    ;

block
    : '{' statement* '}'
    ;
    
condition
    : expression conditionalOperator expression
    ;

functiondeclaration
    : ( datatype | collectiontype '<' datatype '>' | 'void' ) ID '(' parameterlist ')' functionbody
    ; 
    
functionbody
    : '{' ( statement )* ( 'return' expression ';' )? '}' 
    ;

parameterlist
    : ((datatype ID | STRING | collectiontype '<' datatype '>' ID)( ',' (datatype ID | STRING | collectiontype '<' datatype '>' ID) )*)?
    | 
    ;

functioncall
    : ID '(' argumentlist ')'
    ;

argumentlist
    : expression ( ',' expression ) * 
    | STRING
    | 
    ;

expression
    : expression ( '*' | '/' ) expression
    | expression ( '+' | '-' ) expression
    | '(' expression ')'
    | value
    | ID postUnaryOperator
    ;

/*
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
*/ 

assignment
    : valassignment
	| collectionassignment
    ;

valassignment
	: ID '=' ( expression | BOOLVAL )
	;

collectionassignment
	: ID '=' expression
	| collectionEntrance '=' expression
	;
	
declaration
    : datatype valassignment
    | collectiontype '<' datatype '>' collectionassignment
    ;

value
    : ID
    | constant
    | '[' valueList ( ';' valueList )* ']'
    | functioncall
    | collectionEntrance
    | BOOLVAL
    ;

collectionEntrance
    : ID '[' entranceCoordinate ']'
    ;

valueList
    : value ( ',' value)*
    ;

constantList
    : constant ( ',' constant )*
    ;

entranceCoordinate
    : (ID | INTNUM) ( ',' (ID | INTNUM) )?
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
IMPORT: 'include' | 'import' ;  
  
IF: 'if' ;
ELSE: 'else' ;

WHILE: 'while' ;
FOR: 'for' ;

MATRIX: 'matrix' ;
ROWVECTOR: 'rowvector' | 'rvec' ;
COLVECTOR: 'colvector' | 'cvec' ;  

INT: 'int' ;
INTNUM: '0' | SIGN? [1-9][0-9]* ;

FLOAT: 'float' ;
FLOATNUM: '0.0' | SIGN? ([1-9][0-9]* | '0') '.' [0-9]* [1-9] ;

BOOL: 'bool' ;
BOOLVAL: 'True' | 'False' ;

STRING: '"' .*? '"' ;

SIGN: '-' ;

ID: [a-zA-Z_][a-zA-Z0-9_]* ;    

LIBRARY: [a-zA-Z0-9_]+('.')?[a-zA-Z0-9_]* ; 

//Whitespace and comments

WS: [ \t ]+ -> skip;

NL: [ \r \n | \n ] -> skip;

COMMENT
    :   '/*' .*? '*/' -> skip
    ;

LINE_COMMENT
    :   '//' ~[\r\n]* -> skip
    ;


