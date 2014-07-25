apply plugin: 'code-quality'

tasks.withType(CodeNarc).allTasks { codeNarcTask ->
    codeNarcTask.ignoreFailures = true
}
