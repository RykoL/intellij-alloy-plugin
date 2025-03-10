package de.rlang.intellij.alloy.editor

import com.intellij.openapi.actionSystem.IdeActions
import com.intellij.testFramework.fixtures.BasePlatformTestCase

class AlloyCommenterTest : BasePlatformTestCase() {

    fun testLineCommenting() {
        myFixture.configureByText(
            "main.alloy", """
                hello "world" {
                    block {
                        <caret>someVariable = "someValue"
                    }
                }
            """.trimIndent()
        )
        myFixture.performEditorAction(IdeActions.ACTION_COMMENT_LINE)
        myFixture.checkResult(
            """
                hello "world" {
                    block {
                        //someVariable = "someValue"
                    }
                }
            """.trimIndent()
        )
    }

    fun testLineUncommenting() {
        myFixture.configureByText(
            "main.alloy", """
                hello "world" {
                    block {
                        //someVariable = <caret>"someValue"
                    }
                }
            """.trimIndent()
        )
        myFixture.performEditorAction(IdeActions.ACTION_COMMENT_LINE)
        myFixture.checkResult(
            """
                hello "world" {
                    block {
                        someVariable = "someValue"
                    }
                }
            """.trimIndent()
        )
    }

    fun testMultiLineCommenting() {
        myFixture.configureByText(
            "main.alloy", """
                hello "world" {
                    block {
                        <selection>someVariable = "someValue"</selection>
                    }
                }
            """.trimIndent()
        )
        myFixture.performEditorAction(IdeActions.ACTION_COMMENT_BLOCK)
        myFixture.checkResult(
            """
                hello "world" {
                    block {
                        /*someVariable = "someValue"*/
                    }
                }
            """.trimIndent()
        )
    }

    fun testMultiLineUncommenting() {
        myFixture.configureByText(
            "main.alloy", """
                hello "world" {
                    block {
                        <selection>/*someVariable = "someValue"*/</selection>
                    }
                }
            """.trimIndent()
        )
        myFixture.performEditorAction(IdeActions.ACTION_COMMENT_BLOCK)
        myFixture.checkResult(
            """
                hello "world" {
                    block {
                        someVariable = "someValue"
                    }
                }
            """.trimIndent()
        )
    }

}
