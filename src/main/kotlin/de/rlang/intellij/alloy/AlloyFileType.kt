package de.rlang.intellij.alloy

import com.intellij.openapi.fileTypes.LanguageFileType
import javax.swing.Icon


class AlloyFileType : LanguageFileType(AlloyLanguage.INSTANCE) {

    override fun getName(): String {
        return "Alloy"
    }

    override fun getDescription(): String {
        return "Alloy configuration file"
    }

    override fun getDefaultExtension(): String {
        return "alloy"
    }

    override fun getIcon(): Icon = AlloyIcon.FILE

    companion object {
        val INSTANCE: AlloyFileType = AlloyFileType()
    }

}