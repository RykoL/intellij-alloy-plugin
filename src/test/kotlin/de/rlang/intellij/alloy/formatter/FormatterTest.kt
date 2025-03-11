package de.rlang.intellij.alloy.formatter

import com.intellij.psi.formatter.FormatterTestCase

class FormatterTest : FormatterTestCase() {
    override fun getBasePath(): String = ""
    override fun getTestDataPath() = "src/test/testData/"

    fun testFormatter() {
        doTest("unformatted", "formatted")
    }

    override fun getFileExtension(): String {
        return "alloy"
    }

}
