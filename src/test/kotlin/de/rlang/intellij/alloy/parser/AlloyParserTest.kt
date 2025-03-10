package de.rlang.intellij.alloy.parser

import com.intellij.testFramework.ParsingTestCase
import com.intellij.testFramework.TestDataPath
import de.rlang.intellij.alloy.AlloyParserDefinition

@TestDataPath("\$CONTENT_ROOT/src/test/testData")
class AlloyParserTest : ParsingTestCase("", "alloy", AlloyParserDefinition()) {

    fun testParsingData() {
        doTest(true)
    }

    override fun includeRanges(): Boolean {
        return true
    }

    override fun getTestDataPath() = "src/test/testData/"
}
