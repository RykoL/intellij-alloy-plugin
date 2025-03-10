// Copyright 2000-2024 JetBrains s.r.o. and contributors. Use of this source code is governed by the Apache 2.0 license.
package de.rlang.intellij.alloy

import com.intellij.openapi.fileTypes.LanguageFileType
import com.intellij.testFramework.fixtures.BasePlatformTestCase

class AlloyTypingTest : BasePlatformTestCase() {

    override fun getBasePath(): String = "/typing"

    private fun doTypingTest(charToType: Char, textBefore: String, textAfter: String) {
        doTypingTest(AlloyFileType.INSTANCE, charToType, textBefore, textAfter)
    }

    private fun doTypingTest(
        fileType: LanguageFileType,
        charToType: Char,
        textBefore: String,
        textAfter: String
    ) {
        myFixture.configureByText(fileType, textBefore)
        myFixture.type(charToType)
        myFixture.checkResult(textAfter)
    }

    fun `test matching braces brackets parenthesis`() {
        doTypingTest('{', "variableA = <caret>", "variableA = {<caret>}")
        doTypingTest('[', "variableA = <caret>", "variableA = [<caret>]")
        doTypingTest('(', "variableA = <caret>", "variableA = (<caret>)")
    }

    fun `test quotes`() {
        doTypingTest('"', "variableA = <caret>", "variableA = \"<caret>\"")
    }


}
