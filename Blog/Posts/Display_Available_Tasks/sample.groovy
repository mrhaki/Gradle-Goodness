$ gradle -q --tasks -all

------------------------------------------------------------
Root Project
------------------------------------------------------------

Compile tasks
-------------
:compile - Compile sources [:lib0, :lib1, :lib2]
:lib0 - Build lib0
:lib1 - Build lib1 [:lib0]
:lib2 - Build lib2 [:lib1]
