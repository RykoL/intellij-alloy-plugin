package de.rlang.intellij.alloy

import com.intellij.lang.Language

class AlloyLanguage : Language("Alloy") {
    companion object {
        val INSTANCE: AlloyLanguage = AlloyLanguage()
    }

}