package de.rlang.intellij.alloy

import com.intellij.lang.ASTNode
import com.intellij.lang.ParserDefinition
import com.intellij.lang.PsiParser
import com.intellij.lexer.Lexer
import com.intellij.openapi.project.Project
import com.intellij.psi.FileViewProvider
import com.intellij.psi.PsiElement
import com.intellij.psi.PsiFile
import com.intellij.psi.tree.IFileElementType
import com.intellij.psi.tree.TokenSet

class AlloyParserDefinition : ParserDefinition {

    private val file: IFileElementType = IFileElementType(AlloyLanguage.INSTANCE)


    override fun createLexer(p0: Project?): Lexer {
        return AlloyLexerAdapter()
    }

    override fun createParser(p0: Project?): PsiParser {
        return AlloyParser()
    }

    override fun getFileNodeType(): IFileElementType {
        return file
    }

    override fun getCommentTokens(): TokenSet {
        return AlloyTokenSet.COMMENTS
    }

    override fun getStringLiteralElements(): TokenSet {
        return AlloyTokenSet.STRING_LITERAL
    }

    override fun createElement(node: ASTNode?): PsiElement {
        return AlloyTypes.Factory.createElement(node)
    }

    override fun createFile(viewProvider: FileViewProvider): PsiFile {
        return AlloyFile(viewProvider)
    }
}