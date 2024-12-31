// This is a generated file. Not intended for manual editing.
package de.rlang.intellij.alloy.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static de.rlang.intellij.alloy.AlloyTypes.*;
import de.rlang.intellij.alloy.psi.*;

public class AlloyLiteralExprImpl extends AlloyExprImpl implements AlloyLiteralExpr {

  public AlloyLiteralExprImpl(@NotNull ASTNode node) {
    super(node);
  }

  @Override
  public void accept(@NotNull AlloyVisitor visitor) {
    visitor.visitLiteralExpr(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof AlloyVisitor) accept((AlloyVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public AlloyBooleanLiteral getBooleanLiteral() {
    return findChildByClass(AlloyBooleanLiteral.class);
  }

  @Override
  @Nullable
  public AlloyId getId() {
    return findChildByClass(AlloyId.class);
  }

  @Override
  @Nullable
  public AlloyNullLiteral getNullLiteral() {
    return findChildByClass(AlloyNullLiteral.class);
  }

  @Override
  @Nullable
  public AlloyNumberLiteral getNumberLiteral() {
    return findChildByClass(AlloyNumberLiteral.class);
  }

  @Override
  @Nullable
  public AlloyStringLiteral getStringLiteral() {
    return findChildByClass(AlloyStringLiteral.class);
  }

}
