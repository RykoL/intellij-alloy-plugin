package de.rlang.intellij.alloy.formatter

import com.intellij.codeInsight.editorActions.SimpleTokenSetQuoteHandler
import de.rlang.intellij.alloy.AlloyTypes

class AlloyQuoteHandler : SimpleTokenSetQuoteHandler(AlloyTypes.QUOTE)
