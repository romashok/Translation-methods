grammar GrammarFile;

@header {
package lab4.parser;
}

grammarFileContent: 'grammar' name=LexerToken ';' line+ EOF;
line: grammarRule ';' | lexerRule ';';
grammarRule: grammarRuleName ':' productions;
lexerRule: lexerToken ':' productions;
productions: production ('|' production)*;
production: term*;
term: grammarRuleName | lexerToken | STRING;

grammarRuleName: GrammarName;
lexerToken: LexerToken;


GrammarName: [a-z][_a-zA-Z0-9]*;
LexerToken: [A-Z][_a-zA-Z0-9]* | '['.*?']';
STRING: '\'' ~[\n\r']* '\'';
WS: [ \r\n\t] -> skip;