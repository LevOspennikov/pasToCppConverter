grammar PasGrammar;
@parser::header{
import utils.Variables;
}

program returns [String text]
    : (programHeading)?
     {
           $text = "#include <stdlib.h>\n";
           $text += "#include <stdio.h>\n";
     }
    variableDeclarationPart {$text += $variableDeclarationPart.name;}
    compoundStatement {$text += "int main() {\n" + $compoundStatement.name + "return 0;\n}";}
    ;

programHeading returns [String name]
    : PROGRAM identifier SEMI
    ;

variableDeclarationPart returns [String name]
    : VAR variableDeclaration {$name = $variableDeclaration.name;} (SEMI variableDeclaration {$name += $variableDeclaration.name;})* SEMI {$name += "\n";}
    ;

variableDeclaration returns [String name]
    @after {
        Variables.putVar($ctx.type.text, $ctx.identifierList.name.split(", "));
    }
    : identifierList COLON type {$name = $type.text + " " + $identifierList.name + ";";}
    ;

identifierList returns [String name]
    : identifier {$name = $identifier.text;} (COMMA identifier {$name += ", " + $identifier.text;})*
    ;

compoundStatement returns [String name]
    : BEGIN {$name = "";} (statements {$name += $statements.name + "\n";})*  END DOT
    ;

statements returns [String name]
   : assignmentState {$name = $assignmentState.name;}
   | funcState {$name = "\t" + $funcState.name;}
   | ifState {$name = $ifState.text;}
   | whileState {$name = $whileState.text;}
   ;

assignmentState returns [String name]
   : identifier {$name = "\t" + $identifier.text + " = ";}
   ASSIGNMENT (identifier {$name += $identifier.text;}
   | number {$name += $number.text;}
   | expression {$name += $expression.text;}) SEMI
   {$name += ";";}
   ;

funcState returns [String name]
    @after {
            $name = Variables.getFunc($ctx.funcName().name, $ctx.identifierList()== null ? new String[0] : $ctx.identifierList().name.split(", "));
    }
    : funcName LPAREN (identifierList)? RPAREN SEMI
    ;

funcName returns [String name]
    : READ {$name = "read";}
    | READLN {$name = "readln";}
    | WRITE {$name = "write";}
    | WRITELN {$name = "writeln";}
    ;

expression returns [String name]
    : (identifier {$name = $identifier.text;} | number {$name = $number.text;})
      ((PLUS {$name += " + ";} | MINUS {$name += " - ";} | MUL {$name += " * ";} | DIV {$name += " / ";})
      (identifier {$name += $identifier.text;} | number {$name += $number.text;}))+
    ;

type returns [String text]
    : CHAR {$text = "char";} | INTEGER  {$text = "int";}| DOUBLE {$text = "double";}
    ;

ifState returns [String text]
    : IF {$text = "\tif (";} ( (unOp {$text += $unOp.text;})? LPAREN  logical RPAREN {$text +=  "(" + $logical.text + ") ";}) ( logicalOp {$text += $logicalOp.text + " ";} (unOp {$text += $unOp.text;})? LPAREN logical RPAREN {$text += " (" + $logical.text + ")"; })*  THEN  statements {$text +=  ") " + $statements.name;}
    ;

unOp returns [String text]
    : NOT {$text = "!";}
    ;

logicalOp returns [String text]
    : AND {$text = "&&";}
    | OR {$text = "||";}
    | XOR {$text = "^";}
    ;
whileState returns [String text]
    : WHILE LPAREN logical RPAREN DO statements {$text = "\t while (" + $logical.text  + ") " + $statements.name;}
    ;

logical returns [String text]
    : (identifier {$text = $identifier.text;} | number {$text = $number.text;}) logicalSign {$text += $logicalSign.text;} (identifier {$text += $identifier.text;} | number {$text += $number.text;})
    ;

logicalSign returns [String text]
    : '>' {$text = ">";}
    | '<' {$text = "<";}
    | '=' {$text = "==";}
    ;

identifier
    : IDENTIFIER
    ;

number
    : NUMBER
    ;

NOT
    : N O T
    ;

AND
    : A N D
    ;
XOR
    : X O R
    ;
OR
    : O R
    ;
DO
   : D O
   ;

WHILE
   : W H I L E
   ;

IF
   : I F
   ;

THEN
   : T H E N
   ;

FOR
   : F O R
   ;


SEMI
   : ';'
   ;

COLON
   : ':'
   ;

COMMA
   : ','
   ;

DOT
   : '.'
   ;

LPAREN
   : '('
   ;


RPAREN
   : ')'
   ;

EQUALITY
   : '='
   ;

ASSIGNMENT
   : ':='
   ;

PLUS
   : '+'
   ;

MINUS
   : '-'
   ;

MUL
   : '*'
   ;

DIV
   : '/'
   ;

PROGRAM
   : P R O G R A M
   ;

VAR
   : V A R
   ;

BEGIN
   : B E G I N
   ;

END
   : E N D
   ;

CONST
   : C O N S T
   ;

BOOLEAN
   : B O O L E A N
   ;

CHAR
   : C H A R
   ;

INTEGER
   : I N T E G E R
   ;

REAL
   : R E A L
   ;

DOUBLE
   : D O U B L E
   ;

EXTENDED
   : E X T E N D E D
   ;

STRING
   : S T R I N G
   ;

READ
   : R E A D
   ;

READLN
   : R E A D L N
   ;

WRITE
   : W R I T E
   ;

WRITELN
   : W R I T E L N
   ;

IDENTIFIER
   : ('a' .. 'z' | 'A' .. 'Z') ('a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_')*
   ;

NUMBER
   : ('0' .. '9')+
   ;

fragment A
   : ('a' | 'A')
   ;

fragment B
   : ('b' | 'B')
   ;

fragment C
   : ('c' | 'C')
   ;

fragment D
   : ('d' | 'D')
   ;

fragment E
   : ('e' | 'E')
   ;

fragment F
   : ('f' | 'F')
   ;

fragment G
   : ('g' | 'G')
   ;

fragment H
   : ('h' | 'H')
   ;

fragment I
   : ('i' | 'I')
   ;

fragment J
   : ('j' | 'J')
   ;

fragment K
   : ('k' | 'K')
   ;

fragment L
   : ('l' | 'L')
   ;

fragment M
   : ('m' | 'M')
   ;

fragment N
   : ('n' | 'N')
   ;

fragment O
   : ('o' | 'O')
   ;

fragment P
   : ('p' | 'P')
   ;

fragment Q
   : ('q' | 'Q')
   ;

fragment R
   : ('r' | 'R')
   ;

fragment S
   : ('s' | 'S')
   ;

fragment T
   : ('t' | 'T')
   ;

fragment U
   : ('u' | 'U')
   ;

fragment V
   : ('v' | 'V')
   ;

fragment W
   : ('w' | 'W')
   ;

fragment X
   : ('x' | 'X')
   ;

fragment Y
   : ('y' | 'Y')
   ;

fragment Z
   : ('z' | 'Z')
   ;

WS
   : [ \t\r\n]+ -> skip
   ;

OLD_STYLE_COMMENT
   : '(*' .*? '*)' -> skip
   ;

COMMENT
   : '{' .*? '}' -> skip
   ;