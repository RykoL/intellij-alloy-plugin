// This is a generated file. Not intended for manual editing.
package de.rlang.intellij.alloy.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface AlloyLiteralExpr extends AlloyExpr {

  @Nullable
  AlloyBooleanLiteral getBooleanLiteral();

  @Nullable
  AlloyId getId();

  @Nullable
  AlloyNullLiteral getNullLiteral();

  @Nullable
  AlloyNumberLiteral getNumberLiteral();

  @Nullable
  AlloyStringLiteral getStringLiteral();

}
