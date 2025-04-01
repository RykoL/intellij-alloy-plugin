package de.rlang.intellij.alloy.formatter

import com.intellij.formatting.*
import com.intellij.lang.ASTNode
import com.intellij.lang.FileASTNode
import com.intellij.psi.PsiComment
import com.intellij.psi.TokenType
import com.intellij.psi.formatter.common.AbstractBlock
import com.intellij.psi.util.elementType
import de.rlang.intellij.alloy.AlloyTypes

class AlloyBlock(node: ASTNode, wrap: Wrap?, alignment: Alignment?, private val spacingBuilder: SpacingBuilder) :
    AbstractBlock(node, wrap, alignment) {
    override fun getSpacing(child1: Block?, child2: Block): Spacing? {
        return spacingBuilder.getSpacing(this, child1, child2);
    }

    override fun getIndent(): Indent? {

        if (node.treeParent is FileASTNode) {
            return Indent.getNoneIndent()
        }

        if (node.elementType == AlloyTypes.LINE_COMMENT || node.elementType == AlloyTypes.BLOCK_COMMENT) {
            return Indent.getNormalIndent()
        }

        if (node.treeParent != null && node.treeParent.elementType == AlloyTypes.BLOCK_BODY) {
            return Indent.getNormalIndent()
        }
        return Indent.getNoneIndent()
    }

    override fun isLeaf(): Boolean {
        return node.firstChildNode == null
    }

    override fun buildChildren(): MutableList<Block> {
        val children = node.getChildren(null)
        if (children.isEmpty()) return EMPTY

        return children.mapNotNull {
            if (it.elementType == TokenType.WHITE_SPACE) return@mapNotNull null

            AlloyBlock(it, wrap, Alignment.createAlignment(), spacingBuilder)
        }.toMutableList()
    }
}