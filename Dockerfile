FROM openjdk:alpine

RUN apk add --no-cache bash

ADD target/demo-0.0.1-SNAPSHOT.jar /app/

CMD ["/bin/bash", "-c", "cd /app; java ${JAVA_OPTS} -Djava.security.egd=file:/dev/./urandom -jar /app/demo-0.0.1-SNAPSHOT.jar ${RUN_ARGS}"]

EXPOSE 8080