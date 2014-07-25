$ gradle build
:compileJava
:processResources
:classes
:jar
:assemble
:compileTestJava
:processTestResources
:testClasses
:test
:check
:build

BUILD SUCCESSFUL

Total time: 4.905 secs

$ cat build/classes/main/app.properties 
appversion=1.0-DEVELOPMENT
$ cat build/classes/test/test.properties 
gradleVersion=0.9-rc-2
