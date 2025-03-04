package de.rlang.intellij.alloy

import com.intellij.lang.Language
import com.intellij.psi.codeStyle.CommonCodeStyleSettings
import com.intellij.psi.codeStyle.LanguageCodeStyleSettingsProvider

open class AlloyCodeStyleSettingsProvider : LanguageCodeStyleSettingsProvider() {
    override fun getLanguage(): Language {
        return AlloyLanguage.INSTANCE
    }

    companion object {
        const val SAMPLE: String = """
        // Sample comment
        // Another comment

        foo {
          foo = "bar"
          fooo {
            bar = "foo"
            x   = 3 + 7
          }
          barfoo {
            foobar {
              y = 18
            }
          }
        }
    """
    }

    override fun getCodeSample(p0: SettingsType): String? {
        return SAMPLE
    }

    override fun customizeDefaults(
        commonSettings: CommonCodeStyleSettings,
        indentOptions: CommonCodeStyleSettings.IndentOptions
    ) {
        indentOptions.INDENT_SIZE = 2
    }
}