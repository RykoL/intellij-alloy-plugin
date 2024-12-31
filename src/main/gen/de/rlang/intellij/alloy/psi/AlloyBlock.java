// This is a generated file. Not intended for manual editing.
package de.rlang.intellij.alloy.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface AlloyBlock extends PsiElement {

  @NotNull
  AlloyBlockBody getBlockBody();

  @NotNull
  AlloyBlockLabel getBlockLabel();

  @NotNull
  AlloyBlockName getBlockName();

}
