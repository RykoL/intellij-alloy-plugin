package de.rlang.intellij.alloy.formatter

import com.intellij.psi.formatter.FormatterTestCase

class FormatterTest : FormatterTestCase() {
    override fun getBasePath(): String = ""
    override fun getTestDataPath() = "src/test/testData/"

    fun `test indents blocks with tabs instead of spaces`() {
        doTest("unformatted", "formatted")
    }

    fun `test adds space before and after equals sign`() {
        doTextTest("remote_write=http://localhost:9090", "remote_write = http://localhost:9090")
    }

    fun `test does not add additional space around equals sign`() {
        doTextTest("remote_write = http://localhost:9090", "remote_write = http://localhost:9090")
    }

    override fun getFileExtension(): String {
        return "alloy"
    }

}
