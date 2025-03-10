package de.rlang.intellij.alloy.editor

import com.intellij.openapi.actionSystem.IdeActions
import com.intellij.testFramework.fixtures.BasePlatformTestCase

class AlloyCommenterTest : BasePlatformTestCase() {

    fun `test line commenting`() {
        myFixture.configureByText("main.alloy", "<caret>someVariable = \"someValue\"")
        myFixture.performEditorAction(IdeActions.ACTION_COMMENT_LINE)
        myFixture.checkResult("//someVariable = \"someValue\"")
    }

    fun `test line uncommenting`() {
        myFixture.configureByText("main.alloy", "//someVariable = <caret>\"someValue\"")
        myFixture.performEditorAction(IdeActions.ACTION_COMMENT_LINE)
        myFixture.checkResult("someVariable = \"someValue\"")
    }

    fun `test multi line commenting`() {
        myFixture.configureByText(
            "main.alloy", """
                block {
                    <selection>someVariable = "someValue"</selection>
                }
            """.trimIndent()
        )
        myFixture.performEditorAction(IdeActions.ACTION_COMMENT_BLOCK)
        myFixture.checkResult(
            """
                block {
                    /*someVariable = "someValue"*/
                }
            """.trimIndent()
        )
    }

    fun `test multi line uncommenting`() {
        myFixture.configureByText(
            "main.alloy", """
                block {
                    <selection>/*someVariable = "someValue"*/</selection>
                }
            """.trimIndent()
        )
        myFixture.performEditorAction(IdeActions.ACTION_COMMENT_BLOCK)
        myFixture.checkResult(
            """
                block {
                    someVariable = "someValue"
                }
            """.trimIndent()
        )
    }

}
