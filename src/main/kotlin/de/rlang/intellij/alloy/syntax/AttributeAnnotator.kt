package de.rlang.intellij.alloy.syntax

import com.intellij.lang.annotation.AnnotationHolder
import com.intellij.lang.annotation.Annotator
import com.intellij.lang.annotation.HighlightSeverity
import com.intellij.openapi.editor.DefaultLanguageHighlighterColors
import com.intellij.psi.PsiElement
import de.rlang.intellij.alloy.psi.AlloyAssignExpr

class AttributeAnnotator : Annotator {


    override fun annotate(element: PsiElement, holder: AnnotationHolder) {
        if (element !is AlloyAssignExpr) {
            return
        }

        val leftSide = element.exprList[0]
        holder.newSilentAnnotation(HighlightSeverity.INFORMATION)
            .range(leftSide)
            .textAttributes(DefaultLanguageHighlighterColors.INSTANCE_FIELD)
            .create()
    }
}