GEN_DIR := 'src/main/gen'

@_default:
    just --list

# Generates lexer and parser code
generate:
    rm -rf {{ GEN_DIR }}
    ./gradlew generateLexer

# Builds the intellij plugin
build:
    ./gradlew clean buildPlugin


# Runs the tests
test:
    ./gradlew clean test
