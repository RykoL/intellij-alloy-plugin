package de.rlang.intellij.alloy

import com.intellij.psi.tree.IElementType


class AlloyTokenType(private val debugName: String) : IElementType(debugName, AlloyLanguage.INSTANCE) {

    override fun toString(): String {
        return "${debugName}." + super.toString()
    }
}