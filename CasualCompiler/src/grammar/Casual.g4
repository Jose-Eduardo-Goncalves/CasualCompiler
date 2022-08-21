grammar Casual;

@header {
  package casual.grammar;
}

prog: ((comment|declaration|def) (NEWLINE|EOF))* ;

comment: COMMENT ;

declaration: 'decl' VARS '(' ')' ':' type
           | 'decl' VARS '(' ( VARS':'type(',' VARS ':' type)* ) ')' ':' type
           ;

def:    'def' VARS '(' ( VARS':'type(',' VARS ':' type)* ) ')' ':' type '{' NEWLINE block 
    |   'def' VARS '('  ')' ':' type '{' NEWLINE block 
    ;

block:  '}'
     |  blck
     ;


blck:   'return' (expr|) ';'NEWLINE blck
    |   expr';'NEWLINE blck
    |   'if' expr '{' NEWLINE blck NEWLINE (blck|elseBlock blck)
    |   'while' expr '{' NEWLINE blck NEWLINE blck
    |   VARS':'type '=' expr ';' NEWLINE blck
    |   VARS':'type '=' '['(INT(','INT)*|BOOL(','BOOL)*|STRING(','STRING)*|FLOAT(','FLOAT)*|)']' ';' NEWLINE blck
    |   VARS '=' expr ';' NEWLINE blck
    |   '}'
    ;

elseBlock:   'else' '{' NEWLINE blck;

type: TYPE
    | '['type']'
    ;
    

expr:   expr ('+' | '-' | '*' | '/' | '%') expr
    |   expr ('&&' | '||' | '==' | '!=' | '>=' | '>' | '<=' | '<') expr
    |	'!' expr
    |	INT
    |   BOOL
    |   STRING
    |   FLOAT
    |   index
    |   VARS
    |   VARS'('(expr(','expr)*|)')'
    |	'(' expr ')'
    |   '!true'
    ;

index:  VARS'['expr']' ;

fragment ESC : '\\"' | '\\\\' ;
fragment TXT : ~ ( '\n' | '\r')* ;

TYPE    : 'Int'|'Bool'|'String'|'Float'|'Void' ;
NEWLINE : [\r\n]+ ;
INT     : [0-9]+ ;
FLOAT   : ([0-9]*'.'[0-9]+|[0-9]+) ;
BOOL    : 'true' | 'false' ;
STRING  : '"' (ESC|.)*? '"';
VARS    : [_A-Za-z][_A-Za-z0-9]* ;
COMMENT : '#'TXT;
WHITESPACE : [ \t] -> skip ;