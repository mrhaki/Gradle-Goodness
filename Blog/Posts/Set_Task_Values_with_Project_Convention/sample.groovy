// File: build.gradle
import com.mrhaki.gradle.generate.*

apply plugin: GeneratePlugin

version = '3.0'
// Or use explicit values:
// outputVersion = 'OUTPUT' 
// outputFilename = 'another-version.txt'

task generateVersionFile(type: Generate)

task showContents << {
    println generateVersionFile.outputFile.text
}
showContents.dependsOn generateVersionFile
