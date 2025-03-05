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
        // Collection: mount a local directory with a certain path spec
        local.file_match "applogs" {
          path_targets = [{"__path__" = "/tmp/app-logs/app.log"}]
        }
        
        // Collection: Take the file match as input, and scrape those mounted log files
        loki.source.file "local_files" {
          targets    = local.file_match.applogs.targets
        
          // This specifies which component should process the logs next, the "link in the chain"
          forward_to = [loki.process.add_new_label.receiver]
        }
        
        // Transformation: pull some data out of the log message, and turn it into a label
        loki.process "add_new_label" {
          stage.logfmt {
            mapping = {
              "extracted_level" = "level",
            }
          }
        
          // Add the value of "extracted_level" from the extracted map as a "level" label
          stage.labels {
            values = {
              "level" = "extracted_level",
            }
          }
        
          // The next link in the chain is the local_loki "receiver" (receives the telemetry)
          forward_to = [loki.write.local_loki.receiver]
        }
        
        // Anything that comes into this component gets written to the loki remote API
        loki.write "local_loki" {
          endpoint {
            url = "http://loki:3100/loki/api/v1/push"
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