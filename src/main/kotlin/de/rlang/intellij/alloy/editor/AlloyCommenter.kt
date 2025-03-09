package de.rlang.intellij.alloy.editor

import com.intellij.codeInsight.generation.IndentedCommenter

class AlloyCommenter: IndentedCommenter {

    override fun getLineCommentPrefix(): String = "//"

    override fun getBlockCommentPrefix(): String = "/*"

    override fun getBlockCommentSuffix(): String = "*/"

    override fun getCommentedBlockCommentPrefix(): String = "/*"

    override fun getCommentedBlockCommentSuffix(): String = "*/"

    override fun forceIndentedLineComment(): Boolean = true
}
