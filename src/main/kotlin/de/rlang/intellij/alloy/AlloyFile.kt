package de.rlang.intellij.alloy

import com.intellij.extapi.psi.PsiFileBase
import com.intellij.openapi.fileTypes.FileType
import com.intellij.psi.FileViewProvider

class AlloyFile(viewProvider: FileViewProvider) : PsiFileBase(viewProvider, AlloyLanguage.INSTANCE) {
    override fun getFileType(): FileType {
        return AlloyFileType.INSTANCE
    }
}