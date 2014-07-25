// File: build.gradle
task svninfo &lt;&lt; {
    new ByteArrayOutputStream().withStream { os ->
        def result = exec {
            executable = 'svn'
            args = ['info']
            standardOutput = os
        }
        def outputAsString = os.toString()
        def matchLastChangedRev = outputAsString =~ /Last Changed Rev: (\d+)/
        println "Latest Changed Revision #: ${matchLastChangedRev[0][1]}"
    }
}

// Example output for svn info:
// Path: .
// URL: http://svn.host/svn/project
// Repository Root: http://svn.host/svn/
// Repository UUID: 9de3ae54-a9c2-4644-a1a1-838cb992bc8e
// Revision: 33
// Node Kind: directory
// Schedule: normal
// Last Changed Author: mrhaki
// Last Changed Rev: 33
// Last Changed Date: 2010-09-03 14:25:41 +0200 (Fri, 03 Sep 2010)
