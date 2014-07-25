$ gradle test
:compileJava UP-TO-DATE
:processResources UP-TO-DATE
:classes UP-TO-DATE
:compileTestJava UP-TO-DATE
:processTestResources UP-TO-DATE
:testClasses UP-TO-DATE
:test

com.mrhaki.gradle.SampleTest &gt; sample FAILED
    org.junit.ComparisonFailure: expected:&lt;gradle is gr[8]&gt; but was:&lt;gradle is gr[eat]&gt;
        at org.junit.Assert.assertEquals(Assert.java:115)
        at org.junit.Assert.assertEquals(Assert.java:144)
        at com.mrhaki.gradle.SampleTest.sample(SampleTest.java:8)

1 test completed, 1 failed
:test FAILED

FAILURE: Build failed with an exception.

* What went wrong:
Execution failed for task ':test'.
&gt; There were failing tests. See the report at: file:///Users/mrhaki/Projects/mrhaki.com/blog/posts/samples/gradle/testlogging/build/reports/tests/index.html

* Try:
Run with --stacktrace option to get the stack trace. Run with --info or --debug option to get more log output.

BUILD FAILED

Total time: 5.906 secs
