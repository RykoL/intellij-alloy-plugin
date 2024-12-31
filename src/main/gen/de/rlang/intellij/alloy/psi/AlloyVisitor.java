// This is a generated file. Not intended for manual editing.
package de.rlang.intellij.alloy.psi;

import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.PsiElement;

public class AlloyVisitor extends PsiElementVisitor {

  public void visitArrayExpr(@NotNull AlloyArrayExpr o) {
    visitExpr(o);
  }

  public void visitAssignExpr(@NotNull AlloyAssignExpr o) {
    visitExpr(o);
  }

  public void visitBlock(@NotNull AlloyBlock o) {
    visitPsiElement(o);
  }

  public void visitBlockBody(@NotNull AlloyBlockBody o) {
    visitPsiElement(o);
  }

  public void visitBlockLabel(@NotNull AlloyBlockLabel o) {
    visitPsiElement(o);
  }

  public void visitBlockName(@NotNull AlloyBlockName o) {
    visitPsiElement(o);
  }

  public void visitBody(@NotNull AlloyBody o) {
    visitPsiElement(o);
  }

  public void visitBooleanLiteral(@NotNull AlloyBooleanLiteral o) {
    visitPsiElement(o);
  }

  public void visitCallExpr(@NotNull AlloyCallExpr o) {
    visitExpr(o);
  }

  public void visitDivExpr(@NotNull AlloyDivExpr o) {
    visitExpr(o);
  }

  public void visitExpExpr(@NotNull AlloyExpExpr o) {
    visitExpr(o);
  }

  public void visitExpr(@NotNull AlloyExpr o) {
    visitPsiElement(o);
  }

  public void visitField(@NotNull AlloyField o) {
    visitPsiElement(o);
  }

  public void visitFieldList(@NotNull AlloyFieldList o) {
    visitPsiElement(o);
  }

  public void visitId(@NotNull AlloyId o) {
    visitPsiElement(o);
  }

  public void visitIndexExpr(@NotNull AlloyIndexExpr o) {
    visitExpr(o);
  }

  public void visitLiteralExpr(@NotNull AlloyLiteralExpr o) {
    visitExpr(o);
  }

  public void visitMinusExpr(@NotNull AlloyMinusExpr o) {
    visitExpr(o);
  }

  public void visitMulExpr(@NotNull AlloyMulExpr o) {
    visitExpr(o);
  }

  public void visitNullLiteral(@NotNull AlloyNullLiteral o) {
    visitPsiElement(o);
  }

  public void visitNumberLiteral(@NotNull AlloyNumberLiteral o) {
    visitPsiElement(o);
  }

  public void visitObjectExpr(@NotNull AlloyObjectExpr o) {
    visitExpr(o);
  }

  public void visitParenExpr(@NotNull AlloyParenExpr o) {
    visitExpr(o);
  }

  public void visitPlusExpr(@NotNull AlloyPlusExpr o) {
    visitExpr(o);
  }

  public void visitRefExpr(@NotNull AlloyRefExpr o) {
    visitExpr(o);
  }

  public void visitSimpleRefExpr(@NotNull AlloySimpleRefExpr o) {
    visitExpr(o);
  }

  public void visitStatement(@NotNull AlloyStatement o) {
    visitPsiElement(o);
  }

  public void visitStringLiteral(@NotNull AlloyStringLiteral o) {
    visitPsiElement(o);
  }

  public void visitUnaryMinExpr(@NotNull AlloyUnaryMinExpr o) {
    visitExpr(o);
  }

  public void visitUnaryPlusExpr(@NotNull AlloyUnaryPlusExpr o) {
    visitExpr(o);
  }

  public void visitPsiElement(@NotNull PsiElement o) {
    visitElement(o);
  }

}
