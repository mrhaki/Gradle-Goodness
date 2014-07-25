$ gradle -q printProps
Environment is set to dev
serverName:  http://localhost:9090
mail.server: localhost
mail.port:   25

$ gradle -q -Penv=dev printProps
Environment is set to dev
serverName:  http://localhost:9090
mail.server: localhost
mail.port:   25

$ gradle -q -Penv=test printProps
Environment is set to test
serverName:  http://testserver
mail.server: mail.testserver
mail.port:   25

$ gradle -q -Penv=prod printProps
Environment is set to prod
serverName:  http://www.mrhaki.com
mail.server: mail.host.com
mail.port:   552
