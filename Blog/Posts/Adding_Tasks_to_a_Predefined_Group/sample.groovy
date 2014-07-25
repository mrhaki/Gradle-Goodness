$ gradle tasks 
:tasks

------------------------------------------------------------
All tasks runnable from root project
------------------------------------------------------------

Build tasks
-----------
assemble - Assembles all Jar, War, Zip, and Tar archives.
build - Assembles and tests this project.
buildDependents - Assembles and tests this project and all projects that depend on it.
buildNeeded - Assembles and tests this project and all projects it depends on.
classes - Assembles the main classes.
clean - Deletes the build directory.
jar - Assembles a jar archive containing the main classes.
publish - Publish source code to output directory
testClasses - Assembles the test classes.

Documentation tasks
-------------------
javadoc - Generates Javadoc API documentation for the main source code.

Help tasks
----------
dependencies - Displays the dependencies of root project 'taskGroup'.
help - Displays a help message
projects - Displays the sub-projects of root project 'taskGroup'.
properties - Displays the properties of root project 'taskGroup'.
tasks - Displays the tasks runnable from root project 'taskGroup' (some of the displayed tasks may belong to subprojects).

Verification tasks
------------------
check - Runs all checks.
test - Runs the unit tests.

Rules
-----
Pattern: build&lt;configurationname&gt;: Assembles the artifacts of a configuration.
Pattern: upload&lt;configurationname&gt;: Assembles and uploads the artifacts belonging to a configuration.
Pattern: clean&lt;taskname&gt;: Cleans the output files of a task.

To see all tasks and more detail, run with --all.

BUILD SUCCESSFUL

Total time: 2.896 secs
