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
    | PRINT '(' argumentlist ')'
    ;

argumentlist
    : expression ( ',' expression ) * 
    | STRING
    | 
    ;

expression
    : expression ( '*' | '/' | '%' ) expression
    | expression ( '+' | '-' ) expression
    | '(' expression ')'
    | value
    | ID postUnaryOperator
    ;

assignment
    : valassignment
	| collectionassignment
    ;

valassignment
	: ID assignmentOperator ( expression | BOOLVAL )
	;

collectionassignment
	: ID '=' expression
	| collectionEntrance assignmentOperator expression
	;
	
declaration
    : datatype valassignment
    | collectiontype '<' datatype '>' collectionassignment
    ; 
    
datatype
    : INT
    | FLOAT
    | BOOL
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

collectiontype
    : MATRIX
    | ROWVECTOR
    | COLVECTOR
    ;

postUnaryOperator 
    : '++' | '--'
    ;

assignmentOperator
    : '=' | '+=' | '-=' | '*=' | '/=' ;

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

INT: 'int' | 'int16' | 'int32' | 'int64' ;
INTNUM: '0' | SIGN? [1-9][0-9]* ;

FLOAT: 'float' | 'float16' | 'float32' | 'float64' ;  
FLOATNUM: '0.0' | SIGN? ([1-9][0-9]* | '0') '.' [0-9]* [1-9] ;

BOOL: 'bool' ;
BOOLVAL: 'true' | 'false' ;

STRING: '"' .*? '"' ;

SIGN: '-' ;

ID: [a-zA-Z_][a-zA-Z0-9_]* ;    

LIBRARY: [a-zA-Z0-9_]+('.')?[a-zA-Z0-9_]*;

PRINT: 'print' ; 

//Whitespace and comments

WS: [ \t ]+ -> skip;

NL: [ \r \n | \n ] -> skip;

COMMENT
    :   '/*' .*? '*/' -> skip
    ;

LINE_COMMENT
    :   '//' ~[\r\n]* -> skip
    ;


