// This is a generated file. Not intended for manual editing.
package de.rlang.intellij.alloy.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static de.rlang.intellij.alloy.AlloyTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import de.rlang.intellij.alloy.psi.*;

public class AlloyFieldImpl extends ASTWrapperPsiElement implements AlloyField {

  public AlloyFieldImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull AlloyVisitor visitor) {
    visitor.visitField(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof AlloyVisitor) accept((AlloyVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public AlloyExpr getExpr() {
    return findNotNullChildByClass(AlloyExpr.class);
  }

  @Override
  @NotNull
  public AlloyId getId() {
    return findNotNullChildByClass(AlloyId.class);
  }

}
