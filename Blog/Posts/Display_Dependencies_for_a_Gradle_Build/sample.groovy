$ gradle -n
:reportTask

------------------------------------------------------------
Root Project
------------------------------------------------------------
archives - Configuration for the default artifacts.
compile - Classpath for compiling the sources.
|-----org.springframework:spring-webmvc:2.5.6:default
default - Configuration the default artifacts and its dependencies.
|-----org.springframework:spring-webmvc:2.5.6:default
      |-----org.springframework:spring-beans:2.5.6:master,compile,runtime
      |      |-----commons-logging:commons-logging:1.1.1:master,compile,runtime
      |      |-----org.springframework:spring-core:2.5.6:compile,runtime,master
      |      |      |-----commons-logging:commons-logging:1.1.1:master,compile,runtime
      |-----org.springframework:spring-context:2.5.6:compile,runtime,master
      |      |-----commons-logging:commons-logging:1.1.1:master,compile,runtime
      |      |-----org.springframework:spring-core:2.5.6:compile,runtime,master
      |      |      |-----commons-logging:commons-logging:1.1.1:master,compile,runtime
      |      |-----org.springframework:spring-beans:2.5.6:master,compile,runtime
      |      |      |-----commons-logging:commons-logging:1.1.1:master,compile,runtime
      |      |      |-----org.springframework:spring-core:2.5.6:compile,runtime,master
      |      |      |      |-----commons-logging:commons-logging:1.1.1:master,compile,runtime
      |      |-----aopalliance:aopalliance:1.0:runtime,master,compile
      |-----org.springframework:spring-web:2.5.6:master,runtime,compile
      |      |-----org.springframework:spring-context:2.5.6:compile,runtime,master
      |      |      |-----commons-logging:commons-logging:1.1.1:master,compile,runtime
      |      |      |-----org.springframework:spring-beans:2.5.6:master,compile,runtime
      |      |      |      |-----org.springframework:spring-core:2.5.6:compile,runtime,master
      |      |      |      |      |-----commons-logging:commons-logging:1.1.1:master,compile,runtime
      |      |      |      |-----commons-logging:commons-logging:1.1.1:master,compile,runtime
      |      |      |-----aopalliance:aopalliance:1.0:runtime,master,compile
      |      |      |-----org.springframework:spring-core:2.5.6:compile,runtime,master
      |      |      |      |-----commons-logging:commons-logging:1.1.1:master,compile,runtime
      |      |-----org.springframework:spring-core:2.5.6:compile,runtime,master
      |      |      |-----commons-logging:commons-logging:1.1.1:master,compile,runtime
      |      |-----org.springframework:spring-beans:2.5.6:master,compile,runtime
      |      |      |-----commons-logging:commons-logging:1.1.1:master,compile,runtime
      |      |      |-----org.springframework:spring-core:2.5.6:compile,runtime,master
      |      |      |      |-----commons-logging:commons-logging:1.1.1:master,compile,runtime
      |      |-----commons-logging:commons-logging:1.1.1:master,compile,runtime
      |-----org.springframework:spring-core:2.5.6:compile,runtime,master
      |      |-----commons-logging:commons-logging:1.1.1:master,compile,runtime
      |-----org.springframework:spring-context-support:2.5.6:compile,runtime,master
      |      |-----commons-logging:commons-logging:1.1.1:master,compile,runtime
      |      |-----org.springframework:spring-beans:2.5.6:master,compile,runtime
      |      |      |-----commons-logging:commons-logging:1.1.1:master,compile,runtime
      |      |      |-----org.springframework:spring-core:2.5.6:compile,runtime,master
      |      |      |      |-----commons-logging:commons-logging:1.1.1:master,compile,runtime
      |      |-----org.springframework:spring-context:2.5.6:compile,runtime,master
      |      |      |-----commons-logging:commons-logging:1.1.1:master,compile,runtime
      |      |      |-----aopalliance:aopalliance:1.0:runtime,master,compile
      |      |      |-----org.springframework:spring-core:2.5.6:compile,runtime,master
      |      |      |      |-----commons-logging:commons-logging:1.1.1:master,compile,runtime
      |      |      |-----org.springframework:spring-beans:2.5.6:master,compile,runtime
      |      |      |      |-----org.springframework:spring-core:2.5.6:compile,runtime,master
      |      |      |      |      |-----commons-logging:commons-logging:1.1.1:master,compile,runtime
      |      |      |      |-----commons-logging:commons-logging:1.1.1:master,compile,runtime
      |      |-----org.springframework:spring-core:2.5.6:compile,runtime,master
      |      |      |-----commons-logging:commons-logging:1.1.1:master,compile,runtime
      |      |-----aopalliance:aopalliance:1.0:runtime,master,compile
      |-----commons-logging:commons-logging:1.1.1:master,compile,runtime
runtime - Classpath for running the compiled sources.
|-----org.springframework:spring-webmvc:2.5.6:default
      |-----org.springframework:spring-core:2.5.6:compile,runtime,master
      |      |-----commons-logging:commons-logging:1.1.1:master,compile,runtime
      |-----org.springframework:spring-context:2.5.6:compile,runtime,master
      |      |-----org.springframework:spring-beans:2.5.6:master,compile,runtime
      |      |      |-----commons-logging:commons-logging:1.1.1:master,compile,runtime
      |      |      |-----org.springframework:spring-core:2.5.6:compile,runtime,master
      |      |      |      |-----commons-logging:commons-logging:1.1.1:master,compile,runtime
      |      |-----org.springframework:spring-core:2.5.6:compile,runtime,master
      |      |      |-----commons-logging:commons-logging:1.1.1:master,compile,runtime
      |      |-----commons-logging:commons-logging:1.1.1:master,compile,runtime
      |      |-----aopalliance:aopalliance:1.0:runtime,master,compile
      |-----commons-logging:commons-logging:1.1.1:master,compile,runtime
      |-----org.springframework:spring-beans:2.5.6:master,compile,runtime
      |      |-----commons-logging:commons-logging:1.1.1:master,compile,runtime
      |      |-----org.springframework:spring-core:2.5.6:compile,runtime,master
      |      |      |-----commons-logging:commons-logging:1.1.1:master,compile,runtime
      |-----org.springframework:spring-context-support:2.5.6:compile,runtime,master
      |      |-----commons-logging:commons-logging:1.1.1:master,compile,runtime
      |      |-----org.springframework:spring-core:2.5.6:compile,runtime,master
      |      |      |-----commons-logging:commons-logging:1.1.1:master,compile,runtime
      |      |-----org.springframework:spring-context:2.5.6:compile,runtime,master
      |      |      |-----org.springframework:spring-core:2.5.6:compile,runtime,master
      |      |      |      |-----commons-logging:commons-logging:1.1.1:master,compile,runtime
      |      |      |-----org.springframework:spring-beans:2.5.6:master,compile,runtime
      |      |      |      |-----org.springframework:spring-core:2.5.6:compile,runtime,master
      |      |      |      |      |-----commons-logging:commons-logging:1.1.1:master,compile,runtime
      |      |      |      |-----commons-logging:commons-logging:1.1.1:master,compile,runtime
      |      |      |-----commons-logging:commons-logging:1.1.1:master,compile,runtime
      |      |      |-----aopalliance:aopalliance:1.0:runtime,master,compile
      |      |-----org.springframework:spring-beans:2.5.6:master,compile,runtime
      |      |      |-----org.springframework:spring-core:2.5.6:compile,runtime,master
      |      |      |      |-----commons-logging:commons-logging:1.1.1:master,compile,runtime
      |      |      |-----commons-logging:commons-logging:1.1.1:master,compile,runtime
      |      |-----aopalliance:aopalliance:1.0:runtime,master,compile
      |-----org.springframework:spring-web:2.5.6:master,runtime,compile
      |      |-----commons-logging:commons-logging:1.1.1:master,compile,runtime
      |      |-----org.springframework:spring-beans:2.5.6:master,compile,runtime
      |      |      |-----commons-logging:commons-logging:1.1.1:master,compile,runtime
      |      |      |-----org.springframework:spring-core:2.5.6:compile,runtime,master
      |      |      |      |-----commons-logging:commons-logging:1.1.1:master,compile,runtime
      |      |-----org.springframework:spring-core:2.5.6:compile,runtime,master
      |      |      |-----commons-logging:commons-logging:1.1.1:master,compile,runtime
      |      |-----org.springframework:spring-context:2.5.6:compile,runtime,master
      |      |      |-----commons-logging:commons-logging:1.1.1:master,compile,runtime
      |      |      |-----aopalliance:aopalliance:1.0:runtime,master,compile
      |      |      |-----org.springframework:spring-core:2.5.6:compile,runtime,master
      |      |      |      |-----commons-logging:commons-logging:1.1.1:master,compile,runtime
      |      |      |-----org.springframework:spring-beans:2.5.6:master,compile,runtime
      |      |      |      |-----commons-logging:commons-logging:1.1.1:master,compile,runtime
      |      |      |      |-----org.springframework:spring-core:2.5.6:compile,runtime,master
      |      |      |      |      |-----commons-logging:commons-logging:1.1.1:master,compile,runtime
testCompile - Classpath for compiling the test sources.
|-----org.springframework:spring-webmvc:2.5.6:default
testRuntime - Classpath for running the test sources.
|-----org.springframework:spring-webmvc:2.5.6:default
      |-----org.springframework:spring-context:2.5.6:compile,runtime,master
      |      |-----aopalliance:aopalliance:1.0:runtime,master,compile
      |      |-----commons-logging:commons-logging:1.1.1:master,compile,runtime
      |      |-----org.springframework:spring-core:2.5.6:compile,runtime,master
      |      |      |-----commons-logging:commons-logging:1.1.1:master,compile,runtime
      |      |-----org.springframework:spring-beans:2.5.6:master,compile,runtime
      |      |      |-----org.springframework:spring-core:2.5.6:compile,runtime,master
      |      |      |      |-----commons-logging:commons-logging:1.1.1:master,compile,runtime
      |      |      |-----commons-logging:commons-logging:1.1.1:master,compile,runtime
      |-----org.springframework:spring-core:2.5.6:compile,runtime,master
      |      |-----commons-logging:commons-logging:1.1.1:master,compile,runtime
      |-----org.springframework:spring-beans:2.5.6:master,compile,runtime
      |      |-----org.springframework:spring-core:2.5.6:compile,runtime,master
      |      |      |-----commons-logging:commons-logging:1.1.1:master,compile,runtime
      |      |-----commons-logging:commons-logging:1.1.1:master,compile,runtime
      |-----commons-logging:commons-logging:1.1.1:master,compile,runtime
      |-----org.springframework:spring-context-support:2.5.6:compile,runtime,master
      |      |-----commons-logging:commons-logging:1.1.1:master,compile,runtime
      |      |-----org.springframework:spring-beans:2.5.6:master,compile,runtime
      |      |      |-----commons-logging:commons-logging:1.1.1:master,compile,runtime
      |      |      |-----org.springframework:spring-core:2.5.6:compile,runtime,master
      |      |      |      |-----commons-logging:commons-logging:1.1.1:master,compile,runtime
      |      |-----aopalliance:aopalliance:1.0:runtime,master,compile
      |      |-----org.springframework:spring-core:2.5.6:compile,runtime,master
      |      |      |-----commons-logging:commons-logging:1.1.1:master,compile,runtime
      |      |-----org.springframework:spring-context:2.5.6:compile,runtime,master
      |      |      |-----org.springframework:spring-beans:2.5.6:master,compile,runtime
      |      |      |      |-----commons-logging:commons-logging:1.1.1:master,compile,runtime
      |      |      |      |-----org.springframework:spring-core:2.5.6:compile,runtime,master
      |      |      |      |      |-----commons-logging:commons-logging:1.1.1:master,compile,runtime
      |      |      |-----org.springframework:spring-core:2.5.6:compile,runtime,master
      |      |      |      |-----commons-logging:commons-logging:1.1.1:master,compile,runtime
      |      |      |-----commons-logging:commons-logging:1.1.1:master,compile,runtime
      |      |      |-----aopalliance:aopalliance:1.0:runtime,master,compile
      |-----org.springframework:spring-web:2.5.6:master,runtime,compile
      |      |-----org.springframework:spring-beans:2.5.6:master,compile,runtime
      |      |      |-----commons-logging:commons-logging:1.1.1:master,compile,runtime
      |      |      |-----org.springframework:spring-core:2.5.6:compile,runtime,master
      |      |      |      |-----commons-logging:commons-logging:1.1.1:master,compile,runtime
      |      |-----org.springframework:spring-context:2.5.6:compile,runtime,master
      |      |      |-----org.springframework:spring-beans:2.5.6:master,compile,runtime
      |      |      |      |-----commons-logging:commons-logging:1.1.1:master,compile,runtime
      |      |      |      |-----org.springframework:spring-core:2.5.6:compile,runtime,master
      |      |      |      |      |-----commons-logging:commons-logging:1.1.1:master,compile,runtime
      |      |      |-----aopalliance:aopalliance:1.0:runtime,master,compile
      |      |      |-----commons-logging:commons-logging:1.1.1:master,compile,runtime
      |      |      |-----org.springframework:spring-core:2.5.6:compile,runtime,master
      |      |      |      |-----commons-logging:commons-logging:1.1.1:master,compile,runtime
      |      |-----org.springframework:spring-core:2.5.6:compile,runtime,master
      |      |      |-----commons-logging:commons-logging:1.1.1:master,compile,runtime
      |      |-----commons-logging:commons-logging:1.1.1:master,compile,runtime

BUILD SUCCESSFUL

Total time: 7.359 secs
