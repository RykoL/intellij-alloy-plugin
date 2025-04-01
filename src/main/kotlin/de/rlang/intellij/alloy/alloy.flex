package de.rlang.intellij.alloy;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;

import static com.intellij.psi.TokenType.BAD_CHARACTER;
import static com.intellij.psi.TokenType.WHITE_SPACE;
import static de.rlang.intellij.alloy.AlloyTypes.*;

%%

%{
  public _AlloyLexer() {
    this((java.io.Reader)null);
  }
%}

%public
%class _AlloyLexer
%implements FlexLexer
%function advance
%type IElementType
%unicode

EOL=\R
WHITE_SPACE=\s+

LINE_COMMENT=("//".*)
BLOCK_COMMENT="/"\*([^*]|\*[^/])*\*?(\*"/")?
NUMBER=[+-]?([0-9]*[.])?[0-9]+
IDENTIFIER=[A-Za-z_][A-Za-z_0-9]*
STRING=\"([^\\\"\r\n]|\\[^\r\n])*\"?
WHITE_SPACE=([ \t\n\x0B\f\r]|\t)

%%
<YYINITIAL> {
  {WHITE_SPACE}         { return WHITE_SPACE; }

  "false"               { return FALSE; }
  "true"                { return TRUE; }
  "null"                { return NULL; }
  "*"                   { return MUL; }
  "/"                   { return DIV; }
  "+"                   { return PLUS; }
  "-"                   { return MINUS; }
  "=="                  { return CMP; }
  "^"                   { return POW; }
  "="                   { return ASSIGN; }
  "{"                   { return L_BRACE; }
  "}"                   { return R_BRACE; }
  "["                   { return L_BRACKET; }
  "]"                   { return R_BRACKET; }
  "("                   { return L_PAREN; }
  ")"                   { return R_PAREN; }
  ","                   { return COMMA; }
  "."                   { return DOT; }
  "\""                  { return QUOTE; }
  "||"                  { return OR; }
  "&&"                  { return AND; }
  "\\n"                 { return TERMINATOR; }

  {LINE_COMMENT}        { return LINE_COMMENT; }
  {BLOCK_COMMENT}       { return BLOCK_COMMENT; }
  {NUMBER}              { return NUMBER; }
  {IDENTIFIER}          { return IDENTIFIER; }
  {STRING}              { return STRING; }
  {WHITE_SPACE}         { return WHITE_SPACE; }

}

[^] { return BAD_CHARACTER; }
