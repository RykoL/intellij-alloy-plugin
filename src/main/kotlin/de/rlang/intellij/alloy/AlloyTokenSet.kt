package de.rlang.intellij.alloy

import com.intellij.psi.tree.TokenSet

object AlloyTokenSet {
    val IDENTIFIERS = TokenSet.create(AlloyTypes.IDENTIFIER)
    val STRING_LITERAL = TokenSet.create(AlloyTypes.STRING)
    val COMMENTS = TokenSet.create(AlloyTypes.LINE_COMMENT, AlloyTypes.BLOCK_COMMENT)
}
