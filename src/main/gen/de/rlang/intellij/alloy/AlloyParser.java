// This is a generated file. Not intended for manual editing.
package de.rlang.intellij.alloy;

import com.intellij.lang.PsiBuilder;
import com.intellij.lang.PsiBuilder.Marker;
import static de.rlang.intellij.alloy.AlloyTypes.*;
import static com.intellij.lang.parser.GeneratedParserUtilBase.*;
import com.intellij.psi.tree.IElementType;
import com.intellij.lang.ASTNode;
import com.intellij.psi.tree.TokenSet;
import com.intellij.lang.PsiParser;
import com.intellij.lang.LightPsiParser;

@SuppressWarnings({"SimplifiableIfStatement", "UnusedAssignment"})
public class AlloyParser implements PsiParser, LightPsiParser {

  public ASTNode parse(IElementType t, PsiBuilder b) {
    parseLight(t, b);
    return b.getTreeBuilt();
  }

  public void parseLight(IElementType t, PsiBuilder b) {
    boolean r;
    b = adapt_builder_(t, b, this, EXTENDS_SETS_);
    Marker m = enter_section_(b, 0, _COLLAPSE_, null);
    r = parse_root_(t, b);
    exit_section_(b, 0, m, t, r, true, TRUE_CONDITION);
  }

  protected boolean parse_root_(IElementType t, PsiBuilder b) {
    return parse_root_(t, b, 0);
  }

  static boolean parse_root_(IElementType t, PsiBuilder b, int l) {
    return file(b, l + 1);
  }

  public static final TokenSet[] EXTENDS_SETS_ = new TokenSet[] {
    create_token_set_(ARRAY_EXPR, ASSIGN_EXPR, CALL_EXPR, DIV_EXPR,
      EXPR, EXP_EXPR, INDEX_EXPR, LITERAL_EXPR,
      MINUS_EXPR, MUL_EXPR, OBJECT_EXPR, PAREN_EXPR,
      PLUS_EXPR, REF_EXPR, SIMPLE_REF_EXPR, UNARY_MIN_EXPR,
      UNARY_PLUS_EXPR),
  };

  /* ********************************************************** */
  // block_name block_label L_BRACE block_body R_BRACE
  public static boolean block(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "block")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = block_name(b, l + 1);
    r = r && block_label(b, l + 1);
    r = r && consumeToken(b, L_BRACE);
    r = r && block_body(b, l + 1);
    r = r && consumeToken(b, R_BRACE);
    exit_section_(b, m, BLOCK, r);
    return r;
  }

  /* ********************************************************** */
  // statement*
  public static boolean block_body(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "block_body")) return false;
    Marker m = enter_section_(b, l, _NONE_, BLOCK_BODY, "<block body>");
    while (true) {
      int c = current_position_(b);
      if (!statement(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "block_body", c)) break;
    }
    exit_section_(b, l, m, true, false, null);
    return true;
  }

  /* ********************************************************** */
  // [ STRING ]
  public static boolean block_label(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "block_label")) return false;
    Marker m = enter_section_(b, l, _NONE_, BLOCK_LABEL, "<block label>");
    consumeToken(b, STRING);
    exit_section_(b, l, m, true, false, null);
    return true;
  }

  /* ********************************************************** */
  // IDENTIFIER { DOT IDENTIFIER }*
  public static boolean block_name(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "block_name")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IDENTIFIER);
    r = r && block_name_1(b, l + 1);
    exit_section_(b, m, BLOCK_NAME, r);
    return r;
  }

  // { DOT IDENTIFIER }*
  private static boolean block_name_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "block_name_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!block_name_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "block_name_1", c)) break;
    }
    return true;
  }

  // DOT IDENTIFIER
  private static boolean block_name_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "block_name_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, DOT, IDENTIFIER);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // [ statement* ]
  public static boolean body(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "body")) return false;
    Marker m = enter_section_(b, l, _NONE_, BODY, "<body>");
    body_0(b, l + 1);
    exit_section_(b, l, m, true, false, null);
    return true;
  }

  // statement*
  private static boolean body_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "body_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!statement(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "body_0", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // TRUE | FALSE
  public static boolean boolean_literal(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "boolean_literal")) return false;
    if (!nextTokenIs(b, "<boolean literal>", FALSE, TRUE)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, BOOLEAN_LITERAL, "<boolean literal>");
    r = consumeToken(b, TRUE);
    if (!r) r = consumeToken(b, FALSE);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // id ASSIGN expr
  public static boolean field(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "field")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = id(b, l + 1);
    r = r && consumeToken(b, ASSIGN);
    r = r && expr(b, l + 1, -1);
    exit_section_(b, m, FIELD, r);
    return r;
  }

  /* ********************************************************** */
  // field { COMMA field }* [COMMA]
  public static boolean field_list(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "field_list")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = field(b, l + 1);
    r = r && field_list_1(b, l + 1);
    r = r && field_list_2(b, l + 1);
    exit_section_(b, m, FIELD_LIST, r);
    return r;
  }

  // { COMMA field }*
  private static boolean field_list_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "field_list_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!field_list_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "field_list_1", c)) break;
    }
    return true;
  }

  // COMMA field
  private static boolean field_list_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "field_list_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && field(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [COMMA]
  private static boolean field_list_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "field_list_2")) return false;
    consumeToken(b, COMMA);
    return true;
  }

  /* ********************************************************** */
  // body
  static boolean file(PsiBuilder b, int l) {
    return body(b, l + 1);
  }

  /* ********************************************************** */
  // IDENTIFIER
  public static boolean id(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "id")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IDENTIFIER);
    exit_section_(b, m, ID, r);
    return r;
  }

  /* ********************************************************** */
  // NULL
  public static boolean null_literal(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "null_literal")) return false;
    if (!nextTokenIs(b, NULL)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, NULL);
    exit_section_(b, m, NULL_LITERAL, r);
    return r;
  }

  /* ********************************************************** */
  // NUMBER
  public static boolean number_literal(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "number_literal")) return false;
    if (!nextTokenIs(b, NUMBER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, NUMBER);
    exit_section_(b, m, NUMBER_LITERAL, r);
    return r;
  }

  /* ********************************************************** */
  // block | assign_expr
  public static boolean statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "statement")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, STATEMENT, "<statement>");
    r = block(b, l + 1);
    if (!r) r = expr(b, l + 1, -1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // STRING
  public static boolean string_literal(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "string_literal")) return false;
    if (!nextTokenIs(b, STRING)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, STRING);
    exit_section_(b, m, STRING_LITERAL, r);
    return r;
  }

  /* ********************************************************** */
  // Expression root: expr
  // Operator priority table:
  // 0: BINARY(assign_expr)
  // 1: BINARY(plus_expr) BINARY(minus_expr)
  // 2: BINARY(mul_expr) BINARY(div_expr)
  // 3: PREFIX(unary_plus_expr) PREFIX(unary_min_expr)
  // 4: N_ARY(exp_expr)
  // 5: POSTFIX(call_expr)
  // 6: POSTFIX(qualification_expr)
  // 7: ATOM(index_expr)
  // 8: ATOM(simple_ref_expr) ATOM(literal_expr) PREFIX(paren_expr) ATOM(array_expr)
  //    ATOM(object_expr)
  public static boolean expr(PsiBuilder b, int l, int g) {
    if (!recursion_guard_(b, l, "expr")) return false;
    addVariant(b, "<expr>");
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, "<expr>");
    r = unary_plus_expr(b, l + 1);
    if (!r) r = unary_min_expr(b, l + 1);
    if (!r) r = index_expr(b, l + 1);
    if (!r) r = simple_ref_expr(b, l + 1);
    if (!r) r = literal_expr(b, l + 1);
    if (!r) r = paren_expr(b, l + 1);
    if (!r) r = array_expr(b, l + 1);
    if (!r) r = object_expr(b, l + 1);
    p = r;
    r = r && expr_0(b, l + 1, g);
    exit_section_(b, l, m, null, r, p, null);
    return r || p;
  }

  public static boolean expr_0(PsiBuilder b, int l, int g) {
    if (!recursion_guard_(b, l, "expr_0")) return false;
    boolean r = true;
    while (true) {
      Marker m = enter_section_(b, l, _LEFT_, null);
      if (g < 0 && consumeTokenSmart(b, ASSIGN)) {
        r = expr(b, l, -1);
        exit_section_(b, l, m, ASSIGN_EXPR, r, true, null);
      }
      else if (g < 1 && consumeTokenSmart(b, PLUS)) {
        r = expr(b, l, 1);
        exit_section_(b, l, m, PLUS_EXPR, r, true, null);
      }
      else if (g < 1 && consumeTokenSmart(b, MINUS)) {
        r = expr(b, l, 1);
        exit_section_(b, l, m, MINUS_EXPR, r, true, null);
      }
      else if (g < 2 && consumeTokenSmart(b, MUL)) {
        r = expr(b, l, 2);
        exit_section_(b, l, m, MUL_EXPR, r, true, null);
      }
      else if (g < 2 && consumeTokenSmart(b, DIV)) {
        r = expr(b, l, 2);
        exit_section_(b, l, m, DIV_EXPR, r, true, null);
      }
      else if (g < 4 && consumeTokenSmart(b, POW)) {
        while (true) {
          r = report_error_(b, expr(b, l, 4));
          if (!consumeTokenSmart(b, POW)) break;
        }
        exit_section_(b, l, m, EXP_EXPR, r, true, null);
      }
      else if (g < 5 && call_expr_0(b, l + 1)) {
        r = true;
        exit_section_(b, l, m, CALL_EXPR, r, true, null);
      }
      else if (g < 6 && qualification_expr_0(b, l + 1)) {
        r = true;
        exit_section_(b, l, m, REF_EXPR, r, true, null);
      }
      else {
        exit_section_(b, l, m, null, false, false, null);
        break;
      }
    }
    return r;
  }

  public static boolean unary_plus_expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "unary_plus_expr")) return false;
    if (!nextTokenIsSmart(b, PLUS)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, null);
    r = consumeTokenSmart(b, PLUS);
    p = r;
    r = p && expr(b, l, 3);
    exit_section_(b, l, m, UNARY_PLUS_EXPR, r, p, null);
    return r || p;
  }

  public static boolean unary_min_expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "unary_min_expr")) return false;
    if (!nextTokenIsSmart(b, MINUS)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, null);
    r = consumeTokenSmart(b, MINUS);
    p = r;
    r = p && expr(b, l, 3);
    exit_section_(b, l, m, UNARY_MIN_EXPR, r, p, null);
    return r || p;
  }

  // L_PAREN (expr {COMMA expr}*)? R_PAREN
  private static boolean call_expr_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "call_expr_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokenSmart(b, L_PAREN);
    r = r && call_expr_0_1(b, l + 1);
    r = r && consumeToken(b, R_PAREN);
    exit_section_(b, m, null, r);
    return r;
  }

  // (expr {COMMA expr}*)?
  private static boolean call_expr_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "call_expr_0_1")) return false;
    call_expr_0_1_0(b, l + 1);
    return true;
  }

  // expr {COMMA expr}*
  private static boolean call_expr_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "call_expr_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = expr(b, l + 1, -1);
    r = r && call_expr_0_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // {COMMA expr}*
  private static boolean call_expr_0_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "call_expr_0_1_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!call_expr_0_1_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "call_expr_0_1_0_1", c)) break;
    }
    return true;
  }

  // COMMA expr
  private static boolean call_expr_0_1_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "call_expr_0_1_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokenSmart(b, COMMA);
    r = r && expr(b, l + 1, -1);
    exit_section_(b, m, null, r);
    return r;
  }

  // DOT id
  private static boolean qualification_expr_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "qualification_expr_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokenSmart(b, DOT);
    r = r && id(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // L_BRACKET NUMBER R_BRACKET
  public static boolean index_expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "index_expr")) return false;
    if (!nextTokenIsSmart(b, L_BRACKET)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokensSmart(b, 0, L_BRACKET, NUMBER, R_BRACKET);
    exit_section_(b, m, INDEX_EXPR, r);
    return r;
  }

  // id DOT id
  public static boolean simple_ref_expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "simple_ref_expr")) return false;
    if (!nextTokenIsSmart(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = id(b, l + 1);
    r = r && consumeToken(b, DOT);
    r = r && id(b, l + 1);
    exit_section_(b, m, SIMPLE_REF_EXPR, r);
    return r;
  }

  // number_literal | string_literal | boolean_literal | null_literal | id
  public static boolean literal_expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "literal_expr")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, LITERAL_EXPR, "<literal expr>");
    r = number_literal(b, l + 1);
    if (!r) r = string_literal(b, l + 1);
    if (!r) r = boolean_literal(b, l + 1);
    if (!r) r = null_literal(b, l + 1);
    if (!r) r = id(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  public static boolean paren_expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "paren_expr")) return false;
    if (!nextTokenIsSmart(b, L_PAREN)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, null);
    r = consumeTokenSmart(b, L_PAREN);
    p = r;
    r = p && expr(b, l, -1);
    r = p && report_error_(b, consumeToken(b, R_PAREN)) && r;
    exit_section_(b, l, m, PAREN_EXPR, r, p, null);
    return r || p;
  }

  // L_BRACKET expr? { COMMA expr }* [COMMA] R_BRACKET
  public static boolean array_expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "array_expr")) return false;
    if (!nextTokenIsSmart(b, L_BRACKET)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokenSmart(b, L_BRACKET);
    r = r && array_expr_1(b, l + 1);
    r = r && array_expr_2(b, l + 1);
    r = r && array_expr_3(b, l + 1);
    r = r && consumeToken(b, R_BRACKET);
    exit_section_(b, m, ARRAY_EXPR, r);
    return r;
  }

  // expr?
  private static boolean array_expr_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "array_expr_1")) return false;
    expr(b, l + 1, -1);
    return true;
  }

  // { COMMA expr }*
  private static boolean array_expr_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "array_expr_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!array_expr_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "array_expr_2", c)) break;
    }
    return true;
  }

  // COMMA expr
  private static boolean array_expr_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "array_expr_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokenSmart(b, COMMA);
    r = r && expr(b, l + 1, -1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [COMMA]
  private static boolean array_expr_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "array_expr_3")) return false;
    consumeTokenSmart(b, COMMA);
    return true;
  }

  // L_BRACE field_list R_BRACE
  public static boolean object_expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "object_expr")) return false;
    if (!nextTokenIsSmart(b, L_BRACE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokenSmart(b, L_BRACE);
    r = r && field_list(b, l + 1);
    r = r && consumeToken(b, R_BRACE);
    exit_section_(b, m, OBJECT_EXPR, r);
    return r;
  }

}
