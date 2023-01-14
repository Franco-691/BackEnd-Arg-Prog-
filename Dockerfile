FROM amazoncorretto: 8-alpine-jdk
MAINTAINER fb
COPY target/fb-0.0.1-SNAPSHOT.jar fb-app.jar
ENTRYPOINT  ["java","-jar","/fb-app.jar"]

