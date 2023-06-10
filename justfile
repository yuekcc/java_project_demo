set dotenv-load

build:
    #!/bin/sh
    mvn -gs settings.xml  clean package -Dmaven.test.skip=true

run:
    #!/bin/sh
    java -jar target/server.jar