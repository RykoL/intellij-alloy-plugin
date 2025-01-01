package de.rlang.intellij.alloy.formatter

import com.intellij.formatting.*
import com.intellij.lang.ASTNode
import com.intellij.psi.formatter.common.AbstractBlock

class AlloyBlock(node: ASTNode, wrap: Wrap?, alignment: Alignment?, private val spacingBuilder: SpacingBuilder) :
    AbstractBlock(node, wrap, alignment) {
    override fun getSpacing(child1: Block?, child2: Block): Spacing? {
        return spacingBuilder.getSpacing(this, child1, child2);
    }

    override fun getIndent(): Indent? {
        return Indent.getNormalIndent()
    }

    override fun isLeaf(): Boolean {
        return node.firstChildNode == null
    }

    override fun buildChildren(): MutableList<Block> {
        val children = node.getChildren(null)
        if (children.isEmpty()) return EMPTY

        return children.mapNotNull {
            AlloyBlock(it, wrap, alignment, spacingBuilder)
        }.toMutableList()
    }
}