package de.rlang.intellij.alloy.syntax

import de.rlang.intellij.alloy.AlloyLexerAdapter
import de.rlang.intellij.alloy.AlloyTypes
import com.intellij.lexer.Lexer
import com.intellij.openapi.editor.DefaultLanguageHighlighterColors
import com.intellij.openapi.editor.HighlighterColors
import com.intellij.openapi.editor.colors.TextAttributesKey
import com.intellij.openapi.fileTypes.SyntaxHighlighterBase
import com.intellij.psi.TokenType
import com.intellij.psi.tree.IElementType

class AlloySyntaxHighlighter : SyntaxHighlighterBase() {

    override fun getHighlightingLexer(): Lexer {
        return AlloyLexerAdapter()
    }

    override fun getTokenHighlights(elementType: IElementType?): Array<TextAttributesKey> {
        return when (elementType) {
            AlloyTypes.TRUE, AlloyTypes.FALSE, AlloyTypes.NUMBER -> pack(ALLOY_KEYWORD)
            AlloyTypes.NUMBER -> pack(ALLOY_NUMBER)
            AlloyTypes.L_BRACE, AlloyTypes.R_BRACE -> pack(ALLOY_BRACE)
            AlloyTypes.L_BRACKET, AlloyTypes.R_BRACKET -> pack(ALLOY_BRACKETS)
            AlloyTypes.LINE_COMMENT, AlloyTypes.BLOCK_COMMENT -> pack(ALLOY_LINE_COMMENT)
            AlloyTypes.COMMA -> pack(ALLOY_COMMA)
            AlloyTypes.BLOCK_LABEL -> pack(ALLOY_BLOCK_IDENTIFIER)
            AlloyTypes.STRING -> pack(ALLOY_STRING)
            TokenType.BAD_CHARACTER -> pack(HighlighterColors.BAD_CHARACTER)
            else -> EMPTY_KEYS
        }
    }

    companion object {

        private val ALLOY_COMMA: TextAttributesKey = TextAttributesKey.createTextAttributesKey("ALLOY.COMMA", DefaultLanguageHighlighterColors.COMMA)
        private val ALLOY_LINE_COMMENT: TextAttributesKey = TextAttributesKey.createTextAttributesKey("ALLOY.LINE_COMMENT", DefaultLanguageHighlighterColors.LINE_COMMENT)
        private val ALLOY_STRING = TextAttributesKey.createTextAttributesKey("ALLOY.STRING", DefaultLanguageHighlighterColors.STRING)
        private val ALLOY_BRACE = TextAttributesKey.createTextAttributesKey("ALLOY.BRACE", DefaultLanguageHighlighterColors.BRACES)
        private val ALLOY_BRACKETS: TextAttributesKey = TextAttributesKey.createTextAttributesKey("ALLOY.BRACKETS", DefaultLanguageHighlighterColors.BRACKETS)
        private val ALLOY_KEYWORD = TextAttributesKey.createTextAttributesKey("ALLOY.KEYWORD", DefaultLanguageHighlighterColors.KEYWORD)
        private val ALLOY_NUMBER = TextAttributesKey.createTextAttributesKey("ALLOY.NUMBER", DefaultLanguageHighlighterColors.NUMBER)
        private val ALLOY_BLOCK_IDENTIFIER = TextAttributesKey.createTextAttributesKey("ALLOY.IDENTIFIER", DefaultLanguageHighlighterColors.CLASS_NAME)

        val EMPTY_KEYS: Array<TextAttributesKey> = emptyArray()
    }
}
