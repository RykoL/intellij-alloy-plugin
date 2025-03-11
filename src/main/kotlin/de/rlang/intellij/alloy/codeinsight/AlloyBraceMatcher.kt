package de.rlang.intellij.alloy.codeinsight

import com.intellij.lang.BracePair
import com.intellij.lang.PairedBraceMatcher
import com.intellij.psi.PsiFile
import com.intellij.psi.tree.IElementType
import de.rlang.intellij.alloy.AlloyTypes

class AlloyBraceMatcher : PairedBraceMatcher {

    override fun getPairs(): Array<BracePair> = BRACE_PAIRS

    override fun isPairedBracesAllowedBeforeType(lbraceType: IElementType, contextType: IElementType?): Boolean  = true

    override fun getCodeConstructStart(file: PsiFile?, openingBraceOffset: Int): Int = openingBraceOffset
}

private val BRACE_PAIRS = arrayOf(
    BracePair(AlloyTypes.L_BRACE, AlloyTypes.R_BRACE, true),
    BracePair(AlloyTypes.L_BRACKET, AlloyTypes.R_BRACKET, true),
    BracePair(AlloyTypes.L_PAREN, AlloyTypes.R_PAREN, true)
)
