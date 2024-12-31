package de.rlang.intellij.alloy

import com.intellij.ide.highlighter.XmlFileType
import com.intellij.psi.xml.XmlFile
import com.intellij.testFramework.ParsingTestCase
import com.intellij.testFramework.TestDataPath
import com.intellij.testFramework.fixtures.BasePlatformTestCase
import com.intellij.util.PsiErrorElementUtil
import junit.framework.TestCase

@TestDataPath("\$CONTENT_ROOT/src/test/testData")
class AlloyPluginTest : ParsingTestCase("", "alloy", AlloyParserDefinition()) {

    /*fun `test loads alloy file`() {
        val psiFile = myFixture.configureByFile("ParsingData.alloy")
        assertInstanceOf(psiFile, AlloyFile::class.java)
    }

    fun `test correctly parses literal expressions`() {
        val psi = myFixture.configureByText(AlloyFileType.INSTANCE, "foo = 3")

        assertNotNull(psi)
    }*/

    fun testParsingData() {
        doTest(true)
    }

    override fun includeRanges(): Boolean {
        return true
    }

    override fun getTestDataPath() = "src/test/testData/"
}
