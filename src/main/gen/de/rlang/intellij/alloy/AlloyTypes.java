// This is a generated file. Not intended for manual editing.
package de.rlang.intellij.alloy;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import de.rlang.intellij.alloy.psi.impl.*;

public interface AlloyTypes {

  IElementType ARRAY_EXPR = new AlloyElementType("ARRAY_EXPR");
  IElementType ASSIGN_EXPR = new AlloyElementType("ASSIGN_EXPR");
  IElementType BLOCK = new AlloyElementType("BLOCK");
  IElementType BLOCK_BODY = new AlloyElementType("BLOCK_BODY");
  IElementType BLOCK_LABEL = new AlloyElementType("BLOCK_LABEL");
  IElementType BLOCK_NAME = new AlloyElementType("BLOCK_NAME");
  IElementType BODY = new AlloyElementType("BODY");
  IElementType BOOLEAN_LITERAL = new AlloyElementType("BOOLEAN_LITERAL");
  IElementType CALL_EXPR = new AlloyElementType("CALL_EXPR");
  IElementType DIV_EXPR = new AlloyElementType("DIV_EXPR");
  IElementType EXPR = new AlloyElementType("EXPR");
  IElementType EXP_EXPR = new AlloyElementType("EXP_EXPR");
  IElementType FIELD = new AlloyElementType("FIELD");
  IElementType FIELD_LIST = new AlloyElementType("FIELD_LIST");
  IElementType ID = new AlloyElementType("ID");
  IElementType INDEX_EXPR = new AlloyElementType("INDEX_EXPR");
  IElementType LITERAL_EXPR = new AlloyElementType("LITERAL_EXPR");
  IElementType MINUS_EXPR = new AlloyElementType("MINUS_EXPR");
  IElementType MUL_EXPR = new AlloyElementType("MUL_EXPR");
  IElementType NULL_LITERAL = new AlloyElementType("NULL_LITERAL");
  IElementType NUMBER_LITERAL = new AlloyElementType("NUMBER_LITERAL");
  IElementType OBJECT_EXPR = new AlloyElementType("OBJECT_EXPR");
  IElementType PAREN_EXPR = new AlloyElementType("PAREN_EXPR");
  IElementType PLUS_EXPR = new AlloyElementType("PLUS_EXPR");
  IElementType REF_EXPR = new AlloyElementType("REF_EXPR");
  IElementType SIMPLE_REF_EXPR = new AlloyElementType("SIMPLE_REF_EXPR");
  IElementType STATEMENT = new AlloyElementType("STATEMENT");
  IElementType STRING_LITERAL = new AlloyElementType("STRING_LITERAL");
  IElementType UNARY_MIN_EXPR = new AlloyElementType("UNARY_MIN_EXPR");
  IElementType UNARY_PLUS_EXPR = new AlloyElementType("UNARY_PLUS_EXPR");

  IElementType AND = new AlloyTokenType("&&");
  IElementType ASSIGN = new AlloyTokenType("=");
  IElementType BLOCK_COMMENT = new AlloyTokenType("BLOCK_COMMENT");
  IElementType CMP = new AlloyTokenType("==");
  IElementType COMMA = new AlloyTokenType(",");
  IElementType DIV = new AlloyTokenType("/");
  IElementType DOT = new AlloyTokenType(".");
  IElementType FALSE = new AlloyTokenType("false");
  IElementType IDENTIFIER = new AlloyTokenType("IDENTIFIER");
  IElementType LINE_COMMENT = new AlloyTokenType("LINE_COMMENT");
  IElementType L_BRACE = new AlloyTokenType("{");
  IElementType L_BRACKET = new AlloyTokenType("[");
  IElementType L_PAREN = new AlloyTokenType("(");
  IElementType MINUS = new AlloyTokenType("-");
  IElementType MUL = new AlloyTokenType("*");
  IElementType NULL = new AlloyTokenType("null");
  IElementType NUMBER = new AlloyTokenType("NUMBER");
  IElementType OR = new AlloyTokenType("||");
  IElementType PLUS = new AlloyTokenType("+");
  IElementType POW = new AlloyTokenType("^");
  IElementType QUOTE = new AlloyTokenType("\"");
  IElementType R_BRACE = new AlloyTokenType("}");
  IElementType R_BRACKET = new AlloyTokenType("]");
  IElementType R_PAREN = new AlloyTokenType(")");
  IElementType STRING = new AlloyTokenType("STRING");
  IElementType TERMINATOR = new AlloyTokenType("\\n");
  IElementType TRUE = new AlloyTokenType("true");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
      if (type == ARRAY_EXPR) {
        return new AlloyArrayExprImpl(node);
      }
      else if (type == ASSIGN_EXPR) {
        return new AlloyAssignExprImpl(node);
      }
      else if (type == BLOCK) {
        return new AlloyBlockImpl(node);
      }
      else if (type == BLOCK_BODY) {
        return new AlloyBlockBodyImpl(node);
      }
      else if (type == BLOCK_LABEL) {
        return new AlloyBlockLabelImpl(node);
      }
      else if (type == BLOCK_NAME) {
        return new AlloyBlockNameImpl(node);
      }
      else if (type == BODY) {
        return new AlloyBodyImpl(node);
      }
      else if (type == BOOLEAN_LITERAL) {
        return new AlloyBooleanLiteralImpl(node);
      }
      else if (type == CALL_EXPR) {
        return new AlloyCallExprImpl(node);
      }
      else if (type == DIV_EXPR) {
        return new AlloyDivExprImpl(node);
      }
      else if (type == EXP_EXPR) {
        return new AlloyExpExprImpl(node);
      }
      else if (type == FIELD) {
        return new AlloyFieldImpl(node);
      }
      else if (type == FIELD_LIST) {
        return new AlloyFieldListImpl(node);
      }
      else if (type == ID) {
        return new AlloyIdImpl(node);
      }
      else if (type == INDEX_EXPR) {
        return new AlloyIndexExprImpl(node);
      }
      else if (type == LITERAL_EXPR) {
        return new AlloyLiteralExprImpl(node);
      }
      else if (type == MINUS_EXPR) {
        return new AlloyMinusExprImpl(node);
      }
      else if (type == MUL_EXPR) {
        return new AlloyMulExprImpl(node);
      }
      else if (type == NULL_LITERAL) {
        return new AlloyNullLiteralImpl(node);
      }
      else if (type == NUMBER_LITERAL) {
        return new AlloyNumberLiteralImpl(node);
      }
      else if (type == OBJECT_EXPR) {
        return new AlloyObjectExprImpl(node);
      }
      else if (type == PAREN_EXPR) {
        return new AlloyParenExprImpl(node);
      }
      else if (type == PLUS_EXPR) {
        return new AlloyPlusExprImpl(node);
      }
      else if (type == REF_EXPR) {
        return new AlloyRefExprImpl(node);
      }
      else if (type == SIMPLE_REF_EXPR) {
        return new AlloySimpleRefExprImpl(node);
      }
      else if (type == STATEMENT) {
        return new AlloyStatementImpl(node);
      }
      else if (type == STRING_LITERAL) {
        return new AlloyStringLiteralImpl(node);
      }
      else if (type == UNARY_MIN_EXPR) {
        return new AlloyUnaryMinExprImpl(node);
      }
      else if (type == UNARY_PLUS_EXPR) {
        return new AlloyUnaryPlusExprImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
