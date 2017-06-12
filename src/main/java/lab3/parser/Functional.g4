grammar Functional;

@header {
package lab3;
}

deflist: (define NEWLINE?)*;

define
    : ID args '=' cond
    | ID args ('|' guard '=' body NEWLINE?)+
    ;

guard: expr;

body: cond;

args: ID*;

cond
    : expr
    | '(' cond ')'
    | 'if' expr 'then' cond 'else' cond
    ;

expr
    : expr BINOP expr
    | constant
    | func
    | '(' expr ')'
    ;

constant
    : (BOOL | NUM)
    ;

func
    : name=ID (param)* // variable or n positional function | predicate
    ;

param
    : expr BINOP expr
    | constant
    | ID
    | '(' expr ')'
    ;

BOOL: 'True' | 'False';
NUM: [0-9]+('.'[0-9]+)? ;
BINOP: (ARIFM | LOGIC);
ARIFM: '+' | '-' | '*' | '/'  | '%' | 'div' ;
LOGIC: '==' | '!=' | '>=' | '>' | '<=' | '<' |'&&' | '||' ;
ID: [a-zA-Z]+[a-zA-Z0-9]* ;

NEWLINE: '\n'+;
WS: [ \t\r]+ -> skip;
