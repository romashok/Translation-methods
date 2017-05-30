grammar Functional;

@header {
package lab3;
}

deflist: (define NEXT)*;

define
    : ID args '=' cond
    ;

guard: cond;

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
    : name=ID params+=(BOOL | NUM | ID)* // variable or n positional function | predicate
    ;

ID: [a-zA-Z]+[a-zA-Z0-9]* ;
NUM: [0-9]+('.'[0-9]+)? ;
BOOL: 'True' | 'False';
BINOP: (ARIFM | LOGIC);
ARIFM: '+' | '-' | '*' | '/' ;
LOGIC: '==' | '!=' | '&&' | '||';

NEXT: '\n\n'[\n]*;
WS: [ ]+ -> skip;
