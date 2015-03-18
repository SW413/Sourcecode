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
    : IF '(' conditionalExpression ')' ifBlock=block (ELSE IF '(' conditionalExpression ')' elseIfBlock=block)* (ELSE elseBlock=block)?
    ;

loop
    : WHILE '(' (conditionalExpression | BOOLVAL) ')' whileBlock=block
    | FOR '(' (datatype? assignment)? ';' conditionalExpression? ';' expression? ')' forBlock=block
    ;

block
    : '{' statement* '}'
    ;
    
conditionalExpression
    : expression conditionalOperator expression                  #singleCondExpr
    | conditionalExpression ('&&' | '||') conditionalExpression  #multiCondExpr
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
    : ID '(' argumentlist ')'          #customFunc
    | PRINT '(' argumentlist ')'       #printFunc
    ;

argumentlist
    : expression ( ',' expression ) *
    | STRING
    | 
    ;

expression
    : expression ( '*' | '/' | '%' ) expression     #mulExpr
    | expression ( '+' | '-' ) expression           #addExpr
    | '(' expression ')'                            #parenExpr
    | value                                         #valueExpr
    | ID postUnaryOperator                          #postIDExpr
    ;

assignment
    : valassignment
	| collectionassignment
    ;

valassignment
	: ID assignmentOperator ( expression | BOOLVAL )
	;

collectionassignment
	: ID '=' expression                                 #entireCollectionAssignment
	| collectionEntrance assignmentOperator expression  #collectionEntranceAssignment
	;
	
declaration
    : datatype ID '=' expression                         #primitiveDecl
    | collectiontype '<' datatype '>' ID '=' expression  #complexDecl
    ; 
    
datatype
    : INT     #integer
    | FLOAT   #floatingpoint
    | BOOL    #boolean
    ;

value
    : ID                                     #valID
    | constant                               #valConstant
    | '[' valueList ( ';' valueList )* ']'   #valList
    | functioncall                           #valFuncCall
    | collectionEntrance                     #valCollectionEntrance
    | BOOLVAL                                #valBool
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
    : MATRIX       #collectionMatrix
    | ROWVECTOR    #collectionRVector
    | COLVECTOR    #collectionCVector
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
