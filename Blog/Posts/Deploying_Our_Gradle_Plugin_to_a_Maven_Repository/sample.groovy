// File: build.gradle
buildscript {
    repositories {
        mavenRepo urls: 'file:///shared/repos/m2/repository'
    }
    dependencies {
        classpath 'com.mrhaki.gradle.plugins:makedirs-plugin:1.0'
    }
}

usePlugin com.mrhaki.blog.gradle.MakeDirsPlugin
