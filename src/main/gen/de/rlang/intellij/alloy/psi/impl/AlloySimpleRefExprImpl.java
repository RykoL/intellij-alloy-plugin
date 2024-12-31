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

public class AlloySimpleRefExprImpl extends AlloyExprImpl implements AlloySimpleRefExpr {

  public AlloySimpleRefExprImpl(@NotNull ASTNode node) {
    super(node);
  }

  @Override
  public void accept(@NotNull AlloyVisitor visitor) {
    visitor.visitSimpleRefExpr(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof AlloyVisitor) accept((AlloyVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<AlloyId> getIdList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, AlloyId.class);
  }

}
