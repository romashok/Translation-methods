grammar Expr;

e: t ed;
ed: '+' t ed |;
t: f td;
td: '*' f td |;
f: '(' e ')' | NUM;

NUM: [0-9];