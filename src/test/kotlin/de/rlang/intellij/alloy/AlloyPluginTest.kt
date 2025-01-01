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

    fun testParsingData() {
        doTest(true)
    }

    override fun includeRanges(): Boolean {
        return true
    }

    override fun getTestDataPath() = "src/test/testData/"
}
