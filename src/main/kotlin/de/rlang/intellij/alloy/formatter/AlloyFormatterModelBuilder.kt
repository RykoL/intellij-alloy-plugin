package de.rlang.intellij.alloy.formatter

import com.intellij.formatting.*
import com.intellij.psi.codeStyle.CodeStyleSettings
import de.rlang.intellij.alloy.AlloyLanguage
import de.rlang.intellij.alloy.AlloyTypes


class AlloyFormatterModelBuilder : FormattingModelBuilder {

    private fun createSpaceBuilder(settings: CodeStyleSettings): SpacingBuilder {
        return SpacingBuilder(settings, AlloyLanguage.INSTANCE)
            .around(AlloyTypes.ASSIGN)
            .spaceIf(settings.getCommonSettings(AlloyLanguage.INSTANCE.id).SPACE_AROUND_ASSIGNMENT_OPERATORS)
    }

    override fun createModel(formattingContext: FormattingContext): FormattingModel {
        val codeStyleSettings = formattingContext.codeStyleSettings
        return FormattingModelProvider
            .createFormattingModelForPsiFile(
                formattingContext.containingFile,
                AlloyBlock(
                    formattingContext.node,
                    Wrap.createWrap(WrapType.NONE, false),
                    Alignment.createAlignment(),
                    createSpaceBuilder(codeStyleSettings)
                ),
                codeStyleSettings
            )
    }

}