package com.mrhaki.gradle

import org.gradle.api.*

class MakeDirsPluginConvention {
    String basePackageDir = ''  // Property to hold base package directory  name.
    Project project
    
    MakeDirsPluginConvention(Project project) {
        this.project = project
    }
    
    // Method to create a new directory from the root of the project.
    // (Inspired by mkdir in Java plugin)
    File makeDirs(String dirName) {
        if (!dirName) {
            throw new InvalidUserDataException('You must speficy a directory name')
        }
        if (!project) {
            throw new InvalidUserDataException('You must speficy a project')
        }
        def newDir = project.file(dirName)
        newDir.mkdirs()
        newDir
    }

}